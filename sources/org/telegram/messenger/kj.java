package org.telegram.messenger;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.ka0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class kj {
    public ij a;
    public ij b;
    public ij c;
    public org.telegram.ui.qm d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final boolean s;
    public final boolean t;
    public boolean u;
    public TLRPC.WebPage v;
    public URLSpan w;
    public ka0 x;

    public kj(boolean z10, boolean z11, boolean z12) {
        this.i = z10;
        this.s = z10 || z11;
        this.t = z12;
    }

    public static boolean a(String str, String str2) {
        if (str == null || str2 == null) {
            return str == null;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (parse == parse2) {
            return true;
        }
        if (parse != null && parse2 != null && parse.getHost() != null && parse.getHost().equalsIgnoreCase(parse2.getHost()) && parse.getPort() == parse2.getPort()) {
            String path = parse.getPath();
            if (path == null) {
                path = "";
            } else if (!path.endsWith("/")) {
                path = path.concat("/");
            }
            String path2 = parse2.getPath();
            if (path.equals(path2 != null ? path2.endsWith("/") ? path2 : path2.concat("/") : "")) {
                if (parse.getQuery() == null) {
                    if (parse2.getQuery() == null) {
                        return true;
                    }
                } else if (parse.getQuery().equals(parse2.getQuery())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(gj gjVar) {
        TLRPC.WebPage webPage;
        this.w = null;
        if (gjVar != null) {
            CharSequence charSequence = gjVar.v;
            if (!(charSequence instanceof Spanned) || (webPage = this.v) == null || webPage.url == null) {
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
            for (int i7 = 0; i7 < uRLSpanArr.length; i7++) {
                if (a(uRLSpanArr[i7].getURL(), this.v.url)) {
                    this.w = uRLSpanArr[i7];
                    return;
                }
            }
        }
    }

    public final boolean c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ij ijVar = this.b;
        if (ijVar != null && (arrayList3 = ijVar.e) != null && !arrayList3.isEmpty()) {
            return false;
        }
        ij ijVar2 = this.a;
        if (ijVar2 != null && (arrayList2 = ijVar2.e) != null && !arrayList2.isEmpty()) {
            return false;
        }
        ij ijVar3 = this.c;
        return ijVar3 == null || (arrayList = ijVar3.e) == null || arrayList.isEmpty();
    }

    public final void d(ArrayList arrayList, long j3) {
        long j10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.g = false;
        this.h = false;
        this.i = m5.C(j3);
        this.j = false;
        if (arrayList == null) {
            this.b = null;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            gj gjVar = (gj) arrayList.get(i7);
            if (!TextUtils.isEmpty(gjVar.z)) {
                this.g = true;
            }
            if (!this.i && (messageFwdHeader = gjVar.k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                arrayList2.add(messageFwdHeader.from_name);
            }
        }
        Boolean bool = Boolean.TRUE;
        ij ijVar = this.b;
        ij ijVar2 = new ij(this, bool, 0, arrayList, j3, ijVar != null ? ijVar.g : null);
        this.b = ijVar2;
        if (ijVar2.e.isEmpty()) {
            this.b = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            gj gjVar2 = (gj) arrayList.get(i10);
            if (gjVar2.p3()) {
                j10 = gjVar2.k.from_id.user_id;
            } else {
                TLRPC.Chat M0 = np.s1(gjVar2.K1).M0(Long.valueOf(gjVar2.k.peer_id.channel_id));
                j10 = -((t3.T(M0) && M0.megagroup && gjVar2.k3()) ? gjVar2.k.fwd_from.from_id.channel_id : gjVar2.k.peer_id.channel_id);
            }
            if (!arrayList3.contains(Long.valueOf(j10))) {
                arrayList3.add(Long.valueOf(j10));
            }
        }
        if (arrayList2.size() + arrayList3.size() > 1) {
            this.j = true;
        }
    }

    public final void e(int i7, TLRPC.WebPage webPage, CharSequence charSequence, gj gjVar, org.telegram.ui.qm qmVar, gj gjVar2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Message message2;
        this.o = false;
        this.p = false;
        this.n = true;
        boolean z10 = this.v != webPage;
        this.v = webPage;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.c = null;
        } else {
            CharSequence charSequence2 = charSequence == null ? "" : charSequence;
            ij ijVar = this.c;
            boolean z11 = ijVar == null || z10;
            if (ijVar == null && gjVar2 != null && (message2 = gjVar2.k) != null) {
                this.r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(g0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = m10.i(i7).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = m10.i(i7).e();
            tL_message.entities = si.b0(i7).W(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z12 = this.q;
                tL_messageMediaWebPage.force_large_media = !z12;
                tL_messageMediaWebPage.force_small_media = z12;
                this.o = webPage.photo != null;
                this.p = gj.K4(webPage.document);
            } else {
                this.o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (gjVar != null) {
                tL_message.replyMessage = gjVar.k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (qmVar != null) {
                    tL_messageReplyHeader.quote_text = qmVar.i;
                    int i10 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i10 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = qmVar.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i10 | ns.W2;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            gj gjVar3 = new gj(i7, tL_message, true, false);
            ij ijVar2 = new ij(this, bool, 2, k5.j(gjVar3), gj.B0(gjVar3.k), null);
            this.c = ijVar2;
            if (ijVar2.e.isEmpty()) {
                this.c = null;
            } else {
                gj gjVar4 = (gj) this.c.e.get(0);
                CharSequence charSequence3 = gjVar4.v;
                if (!(charSequence3 instanceof Spanned) || TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = gjVar4.z;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) gjVar4.v).getSpans(0, gjVar4.z.length(), URLSpan.class);
                        this.n = uRLSpanArr == null || uRLSpanArr.length <= 1;
                    }
                } else {
                    CharSequence charSequence5 = gjVar4.v;
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), URLSpan.class);
                    this.n = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                }
                boolean z13 = !gjVar4.G0 && !gjVar4.N2 && (gj.n1(gjVar4.k) instanceof TLRPC.TL_messageMediaWebPage) && (gj.n1(gjVar4.k).webpage instanceof TLRPC.TL_webPage);
                TLRPC.WebPage webPage2 = z13 ? gj.n1(gjVar4.k).webpage : null;
                String str = webPage2 != null ? webPage2.type : null;
                this.o = z13 && !gjVar4.v3() && webPage2 != null && (webPage2.photo != null || gj.K4(webPage2.document)) && !((TextUtils.isEmpty(webPage2.description) && TextUtils.isEmpty(webPage2.title)) || gjVar4.r4() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str));
                if (z11 && gjVar2 != null && (message = gjVar2.k) != null && (messageMedia2 = message.media) != null) {
                    this.q = messageMedia2.force_small_media || (gjVar4.A3() && !gjVar2.k.media.force_large_media);
                } else if (z11) {
                    this.q = gjVar4.A3();
                }
                TLRPC.Message message3 = gjVar4.k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z14 = this.q;
                    messageMedia.force_large_media = !z14;
                    messageMedia.force_small_media = z14;
                }
            }
        }
        ka0 ka0Var = this.x;
        if (ka0Var == null) {
            return;
        }
        kj kjVar = ka0Var.d;
        int i11 = 0;
        while (true) {
            View[] viewArr = ka0Var.f.e;
            if (i11 >= viewArr.length) {
                return;
            }
            View view = viewArr[i11];
            if (view != null) {
                ea0 ea0Var = (ea0) view;
                FrameLayout frameLayout = ea0Var.G;
                if (ea0Var.a == 2) {
                    ja0 ja0Var = ea0Var.I;
                    ja0 ja0Var2 = ea0Var.H;
                    frameLayout.setVisibility((!kjVar.n || kjVar.o) ? 0 : 8);
                    ja0Var2.setVisibility(kjVar.p ? 4 : 0);
                    ja0Var.setVisibility(kjVar.p ? 0 : 4);
                    frameLayout.animate().alpha(kjVar.o ? 1.0f : 0.5f).start();
                    ja0Var2.a(kjVar.q, true);
                    ja0Var.a(kjVar.q, true);
                    ea0Var.F.a(!kjVar.r, true);
                    ea0Var.i();
                }
            }
            i11++;
        }
    }

    public final void f(gj gjVar, bj bjVar, long j3, org.telegram.ui.qm qmVar) {
        gj gjVar2;
        org.telegram.ui.qm qmVar2;
        int i7;
        if (this.i || gjVar == null || (i7 = gjVar.D) == 10 || i7 == 11 || i7 == 22 || i7 == 21 || i7 == 18 || i7 == 25 || i7 == 16) {
            gjVar2 = null;
            qmVar2 = null;
        } else {
            gjVar2 = gjVar;
            qmVar2 = qmVar;
        }
        this.u = gjVar2 != null && (gjVar2.S4() || gjVar2.g4() || gjVar2.D == 30);
        if (gjVar2 == null && qmVar2 == null) {
            this.a = null;
            this.d = null;
            return;
        }
        if (bjVar != null) {
            this.a = new ij(this, null, 1, bjVar.d, j3, null);
        } else {
            gj gjVar3 = gjVar2;
            if (gjVar3 == null) {
                gjVar3 = qmVar2.a;
            }
            this.a = new ij(this, null, 1, k5.j(gjVar3), j3, null);
        }
        if (this.a.e.isEmpty()) {
            this.a = null;
            return;
        }
        this.d = qmVar2;
        if (qmVar2 != null) {
            this.e = qmVar2.b;
            this.f = qmVar2.c;
        }
    }
}
