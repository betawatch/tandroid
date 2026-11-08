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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.ia0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class mj {
    public kj a;
    public kj b;
    public kj c;
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
    public ia0 x;

    public mj(boolean z9, boolean z10, boolean z11) {
        this.i = z9;
        this.s = z9 || z10;
        this.t = z11;
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

    public final void b(ij ijVar) {
        TLRPC.WebPage webPage;
        this.w = null;
        if (ijVar != null) {
            CharSequence charSequence = ijVar.v;
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
        kj kjVar = this.b;
        if (kjVar != null && (arrayList3 = kjVar.e) != null && !arrayList3.isEmpty()) {
            return false;
        }
        kj kjVar2 = this.a;
        if (kjVar2 != null && (arrayList2 = kjVar2.e) != null && !arrayList2.isEmpty()) {
            return false;
        }
        kj kjVar3 = this.c;
        return kjVar3 == null || (arrayList = kjVar3.e) == null || arrayList.isEmpty();
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
            ij ijVar = (ij) arrayList.get(i7);
            if (!TextUtils.isEmpty(ijVar.z)) {
                this.g = true;
            }
            if (!this.i && (messageFwdHeader = ijVar.k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                arrayList2.add(messageFwdHeader.from_name);
            }
        }
        Boolean bool = Boolean.TRUE;
        kj kjVar = this.b;
        kj kjVar2 = new kj(this, bool, 0, arrayList, j3, kjVar != null ? kjVar.g : null);
        this.b = kjVar2;
        if (kjVar2.e.isEmpty()) {
            this.b = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ij ijVar2 = (ij) arrayList.get(i10);
            if (ijVar2.q3()) {
                j10 = ijVar2.k.from_id.user_id;
            } else {
                TLRPC.Chat M0 = qp.s1(ijVar2.I1).M0(Long.valueOf(ijVar2.k.peer_id.channel_id));
                j10 = -((t3.T(M0) && M0.megagroup && ijVar2.l3()) ? ijVar2.k.fwd_from.from_id.channel_id : ijVar2.k.peer_id.channel_id);
            }
            if (!arrayList3.contains(Long.valueOf(j10))) {
                arrayList3.add(Long.valueOf(j10));
            }
        }
        if (arrayList2.size() + arrayList3.size() > 1) {
            this.j = true;
        }
    }

    public final void e(int i7, TLRPC.WebPage webPage, CharSequence charSequence, ij ijVar, org.telegram.ui.qm qmVar, ij ijVar2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Message message2;
        this.o = false;
        this.p = false;
        this.n = true;
        boolean z9 = this.v != webPage;
        this.v = webPage;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.c = null;
        } else {
            CharSequence charSequence2 = charSequence == null ? "" : charSequence;
            kj kjVar = this.c;
            boolean z10 = kjVar == null || z9;
            if (kjVar == null && ijVar2 != null && (message2 = ijVar2.k) != null) {
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
            tL_peerUser.user_id = p10.i(i7).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = p10.i(i7).e();
            tL_message.entities = ui.b0(i7).W(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z11 = this.q;
                tL_messageMediaWebPage.force_large_media = !z11;
                tL_messageMediaWebPage.force_small_media = z11;
                this.o = webPage.photo != null;
                this.p = ij.L4(webPage.document);
            } else {
                this.o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (ijVar != null) {
                tL_message.replyMessage = ijVar.k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (qmVar != null) {
                    tL_messageReplyHeader.quote_text = qmVar.i;
                    int i10 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i10 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = qmVar.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i10 | qs.W2;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            ij ijVar3 = new ij(i7, tL_message, true, false);
            kj kjVar2 = new kj(this, bool, 2, k5.k(ijVar3), ij.B0(ijVar3.k), null);
            this.c = kjVar2;
            if (kjVar2.e.isEmpty()) {
                this.c = null;
            } else {
                ij ijVar4 = (ij) this.c.e.get(0);
                CharSequence charSequence3 = ijVar4.v;
                if (!(charSequence3 instanceof Spanned) || TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = ijVar4.z;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) ijVar4.v).getSpans(0, ijVar4.z.length(), URLSpan.class);
                        this.n = uRLSpanArr == null || uRLSpanArr.length <= 1;
                    }
                } else {
                    CharSequence charSequence5 = ijVar4.v;
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), URLSpan.class);
                    this.n = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                }
                boolean z12 = !ijVar4.E0 && !ijVar4.L2 && (ij.o1(ijVar4.k) instanceof TLRPC.TL_messageMediaWebPage) && (ij.o1(ijVar4.k).webpage instanceof TLRPC.TL_webPage);
                TLRPC.WebPage webPage2 = z12 ? ij.o1(ijVar4.k).webpage : null;
                String str = webPage2 != null ? webPage2.type : null;
                this.o = z12 && !ijVar4.w3() && webPage2 != null && (webPage2.photo != null || ij.L4(webPage2.document)) && !((TextUtils.isEmpty(webPage2.description) && TextUtils.isEmpty(webPage2.title)) || ijVar4.s4() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str));
                if (z10 && ijVar2 != null && (message = ijVar2.k) != null && (messageMedia2 = message.media) != null) {
                    this.q = messageMedia2.force_small_media || (ijVar4.B3() && !ijVar2.k.media.force_large_media);
                } else if (z10) {
                    this.q = ijVar4.B3();
                }
                TLRPC.Message message3 = ijVar4.k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z13 = this.q;
                    messageMedia.force_large_media = !z13;
                    messageMedia.force_small_media = z13;
                }
            }
        }
        ia0 ia0Var = this.x;
        if (ia0Var == null) {
            return;
        }
        mj mjVar = ia0Var.d;
        int i11 = 0;
        while (true) {
            View[] viewArr = ia0Var.f.e;
            if (i11 >= viewArr.length) {
                return;
            }
            View view = viewArr[i11];
            if (view != null) {
                ca0 ca0Var = (ca0) view;
                FrameLayout frameLayout = ca0Var.F;
                if (ca0Var.a == 2) {
                    ha0 ha0Var = ca0Var.H;
                    ha0 ha0Var2 = ca0Var.G;
                    frameLayout.setVisibility((!mjVar.n || mjVar.o) ? 0 : 8);
                    ha0Var2.setVisibility(mjVar.p ? 4 : 0);
                    ha0Var.setVisibility(mjVar.p ? 0 : 4);
                    frameLayout.animate().alpha(mjVar.o ? 1.0f : 0.5f).start();
                    ha0Var2.a(mjVar.q, true);
                    ha0Var.a(mjVar.q, true);
                    ca0Var.E.a(!mjVar.r, true);
                    ca0Var.i();
                }
            }
            i11++;
        }
    }

    public final void f(ij ijVar, dj djVar, long j3, org.telegram.ui.qm qmVar) {
        ij ijVar2;
        org.telegram.ui.qm qmVar2;
        int i7;
        if (this.i || ijVar == null || (i7 = ijVar.D) == 10 || i7 == 11 || i7 == 22 || i7 == 21 || i7 == 18 || i7 == 25 || i7 == 16) {
            ijVar2 = null;
            qmVar2 = null;
        } else {
            ijVar2 = ijVar;
            qmVar2 = qmVar;
        }
        this.u = ijVar2 != null && (ijVar2.T4() || ijVar2.h4() || ijVar2.D == 30);
        if (ijVar2 == null && qmVar2 == null) {
            this.a = null;
            this.d = null;
            return;
        }
        if (djVar != null) {
            this.a = new kj(this, null, 1, djVar.d, j3, null);
        } else {
            ij ijVar3 = ijVar2;
            if (ijVar3 == null) {
                ijVar3 = qmVar2.a;
            }
            this.a = new kj(this, null, 1, k5.k(ijVar3), j3, null);
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
