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
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.ua0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class jj {
    public hj a;
    public hj b;
    public hj c;
    public org.telegram.ui.rm d;
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
    public ua0 x;

    public jj(boolean z10, boolean z11, boolean z12) {
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

    public final void b(fj fjVar) {
        TLRPC.WebPage webPage;
        this.w = null;
        if (fjVar != null) {
            CharSequence charSequence = fjVar.v;
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
        hj hjVar = this.b;
        if (hjVar != null && (arrayList3 = hjVar.e) != null && !arrayList3.isEmpty()) {
            return false;
        }
        hj hjVar2 = this.a;
        if (hjVar2 != null && (arrayList2 = hjVar2.e) != null && !arrayList2.isEmpty()) {
            return false;
        }
        hj hjVar3 = this.c;
        return hjVar3 == null || (arrayList = hjVar3.e) == null || arrayList.isEmpty();
    }

    public final void d(ArrayList arrayList, long j3) {
        long j10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.g = false;
        this.h = false;
        this.i = n5.C(j3);
        this.j = false;
        if (arrayList == null) {
            this.b = null;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            fj fjVar = (fj) arrayList.get(i7);
            if (!TextUtils.isEmpty(fjVar.z)) {
                this.g = true;
            }
            if (!this.i && (messageFwdHeader = fjVar.k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                arrayList2.add(messageFwdHeader.from_name);
            }
        }
        Boolean bool = Boolean.TRUE;
        hj hjVar = this.b;
        hj hjVar2 = new hj(this, bool, 0, arrayList, j3, hjVar != null ? hjVar.g : null);
        this.b = hjVar2;
        if (hjVar2.e.isEmpty()) {
            this.b = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            fj fjVar2 = (fj) arrayList.get(i10);
            if (fjVar2.p3()) {
                j10 = fjVar2.k.from_id.user_id;
            } else {
                TLRPC.Chat O0 = mp.u1(fjVar2.K1).O0(Long.valueOf(fjVar2.k.peer_id.channel_id));
                j10 = -((v3.T(O0) && O0.megagroup && fjVar2.k3()) ? fjVar2.k.fwd_from.from_id.channel_id : fjVar2.k.peer_id.channel_id);
            }
            if (!arrayList3.contains(Long.valueOf(j10))) {
                arrayList3.add(Long.valueOf(j10));
            }
        }
        if (arrayList2.size() + arrayList3.size() > 1) {
            this.j = true;
        }
    }

    public final void e(int i7, TLRPC.WebPage webPage, CharSequence charSequence, fj fjVar, org.telegram.ui.rm rmVar, fj fjVar2) {
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
            hj hjVar = this.c;
            boolean z11 = hjVar == null || z10;
            if (hjVar == null && fjVar2 != null && (message2 = fjVar2.k) != null) {
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
            tL_peerUser.user_id = j10.i(i7).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = j10.i(i7).e();
            tL_message.entities = ri.d0(i7).Y(charSequenceArr, true, true);
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
                this.p = fj.K4(webPage.document);
            } else {
                this.o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (fjVar != null) {
                tL_message.replyMessage = fjVar.k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (rmVar != null) {
                    tL_messageReplyHeader.quote_text = rmVar.i;
                    int i10 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i10 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = rmVar.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i10 | ks.W2;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            fj fjVar3 = new fj(i7, tL_message, true, false);
            hj hjVar2 = new hj(this, bool, 2, f3.i(fjVar3), fj.B0(fjVar3.k), null);
            this.c = hjVar2;
            if (hjVar2.e.isEmpty()) {
                this.c = null;
            } else {
                fj fjVar4 = (fj) this.c.e.get(0);
                CharSequence charSequence3 = fjVar4.v;
                if (!(charSequence3 instanceof Spanned) || TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = fjVar4.z;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) fjVar4.v).getSpans(0, fjVar4.z.length(), URLSpan.class);
                        this.n = uRLSpanArr == null || uRLSpanArr.length <= 1;
                    }
                } else {
                    CharSequence charSequence5 = fjVar4.v;
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), URLSpan.class);
                    this.n = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                }
                boolean z13 = !fjVar4.G0 && !fjVar4.N2 && (fj.n1(fjVar4.k) instanceof TLRPC.TL_messageMediaWebPage) && (fj.n1(fjVar4.k).webpage instanceof TLRPC.TL_webPage);
                TLRPC.WebPage webPage2 = z13 ? fj.n1(fjVar4.k).webpage : null;
                String str = webPage2 != null ? webPage2.type : null;
                this.o = z13 && !fjVar4.v3() && webPage2 != null && (webPage2.photo != null || fj.K4(webPage2.document)) && !((TextUtils.isEmpty(webPage2.description) && TextUtils.isEmpty(webPage2.title)) || fjVar4.r4() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str));
                if (z11 && fjVar2 != null && (message = fjVar2.k) != null && (messageMedia2 = message.media) != null) {
                    this.q = messageMedia2.force_small_media || (fjVar4.A3() && !fjVar2.k.media.force_large_media);
                } else if (z11) {
                    this.q = fjVar4.A3();
                }
                TLRPC.Message message3 = fjVar4.k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z14 = this.q;
                    messageMedia.force_large_media = !z14;
                    messageMedia.force_small_media = z14;
                }
            }
        }
        ua0 ua0Var = this.x;
        if (ua0Var == null) {
            return;
        }
        jj jjVar = ua0Var.d;
        int i11 = 0;
        while (true) {
            View[] viewArr = ua0Var.f.e;
            if (i11 >= viewArr.length) {
                return;
            }
            View view = viewArr[i11];
            if (view != null) {
                oa0 oa0Var = (oa0) view;
                FrameLayout frameLayout = oa0Var.G;
                if (oa0Var.a == 2) {
                    ta0 ta0Var = oa0Var.I;
                    ta0 ta0Var2 = oa0Var.H;
                    frameLayout.setVisibility((!jjVar.n || jjVar.o) ? 0 : 8);
                    ta0Var2.setVisibility(jjVar.p ? 4 : 0);
                    ta0Var.setVisibility(jjVar.p ? 0 : 4);
                    frameLayout.animate().alpha(jjVar.o ? 1.0f : 0.5f).start();
                    ta0Var2.a(jjVar.q, true);
                    ta0Var.a(jjVar.q, true);
                    oa0Var.F.a(!jjVar.r, true);
                    oa0Var.i();
                }
            }
            i11++;
        }
    }

    public final void f(fj fjVar, aj ajVar, long j3, org.telegram.ui.rm rmVar) {
        fj fjVar2;
        org.telegram.ui.rm rmVar2;
        int i7;
        if (this.i || fjVar == null || (i7 = fjVar.D) == 10 || i7 == 11 || i7 == 22 || i7 == 21 || i7 == 18 || i7 == 25 || i7 == 16) {
            fjVar2 = null;
            rmVar2 = null;
        } else {
            fjVar2 = fjVar;
            rmVar2 = rmVar;
        }
        this.u = fjVar2 != null && (fjVar2.S4() || fjVar2.g4() || fjVar2.D == 30);
        if (fjVar2 == null && rmVar2 == null) {
            this.a = null;
            this.d = null;
            return;
        }
        if (ajVar != null) {
            this.a = new hj(this, null, 1, ajVar.d, j3, null);
        } else {
            fj fjVar3 = fjVar2;
            if (fjVar3 == null) {
                fjVar3 = rmVar2.a;
            }
            this.a = new hj(this, null, 1, f3.i(fjVar3), j3, null);
        }
        if (this.a.e.isEmpty()) {
            this.a = null;
            return;
        }
        this.d = rmVar2;
        if (rmVar2 != null) {
            this.e = rmVar2.b;
            this.f = rmVar2.c;
        }
    }
}
