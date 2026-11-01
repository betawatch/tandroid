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
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.za0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class oj {
    public mj a;
    public mj b;
    public mj c;
    public org.telegram.ui.kn d;
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
    public ab0 x;

    public oj(boolean z10, boolean z11, boolean z12) {
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

    public final void b(kj kjVar) {
        TLRPC.WebPage webPage;
        this.w = null;
        if (kjVar != null) {
            CharSequence charSequence = kjVar.v;
            if (!(charSequence instanceof Spanned) || (webPage = this.v) == null || webPage.url == null) {
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
            for (int i10 = 0; i10 < uRLSpanArr.length; i10++) {
                if (a(uRLSpanArr[i10].getURL(), this.v.url)) {
                    this.w = uRLSpanArr[i10];
                    return;
                }
            }
        }
    }

    public final boolean c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        mj mjVar = this.b;
        if (mjVar != null && (arrayList3 = mjVar.e) != null && !arrayList3.isEmpty()) {
            return false;
        }
        mj mjVar2 = this.a;
        if (mjVar2 != null && (arrayList2 = mjVar2.e) != null && !arrayList2.isEmpty()) {
            return false;
        }
        mj mjVar3 = this.c;
        return mjVar3 == null || (arrayList = mjVar3.e) == null || arrayList.isEmpty();
    }

    public final void d(ArrayList arrayList, long j10) {
        long j11;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.g = false;
        this.h = false;
        this.i = o5.C(j10);
        this.j = false;
        if (arrayList == null) {
            this.b = null;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            kj kjVar = (kj) arrayList.get(i10);
            if (!TextUtils.isEmpty(kjVar.z)) {
                this.g = true;
            }
            if (!this.i && (messageFwdHeader = kjVar.k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                arrayList2.add(messageFwdHeader.from_name);
            }
        }
        Boolean bool = Boolean.TRUE;
        mj mjVar = this.b;
        mj mjVar2 = new mj(this, bool, 0, arrayList, j10, mjVar != null ? mjVar.g : null);
        this.b = mjVar2;
        if (mjVar2.e.isEmpty()) {
            this.b = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            kj kjVar2 = (kj) arrayList.get(i11);
            if (kjVar2.p3()) {
                j11 = kjVar2.k.from_id.user_id;
            } else {
                TLRPC.Chat L0 = wp.r1(kjVar2.I1).L0(Long.valueOf(kjVar2.k.peer_id.channel_id));
                j11 = -((w3.T(L0) && L0.megagroup && kjVar2.k3()) ? kjVar2.k.fwd_from.from_id.channel_id : kjVar2.k.peer_id.channel_id);
            }
            if (!arrayList3.contains(Long.valueOf(j11))) {
                arrayList3.add(Long.valueOf(j11));
            }
        }
        if (arrayList2.size() + arrayList3.size() > 1) {
            this.j = true;
        }
    }

    public final void e(int i10, TLRPC.WebPage webPage, CharSequence charSequence, kj kjVar, org.telegram.ui.kn knVar, kj kjVar2) {
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
            mj mjVar = this.c;
            boolean z11 = mjVar == null || z10;
            if (mjVar == null && kjVar2 != null && (message2 = kjVar2.k) != null) {
                this.r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(i0.n1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = e20.i(i10).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = e20.i(i10).e();
            tL_message.entities = vi.b0(i10).W(charSequenceArr, true, true);
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
                this.p = kj.K4(webPage.document);
            } else {
                this.o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (kjVar != null) {
                tL_message.replyMessage = kjVar.k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (knVar != null) {
                    tL_messageReplyHeader.quote_text = knVar.i;
                    int i11 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i11 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = knVar.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i11 | at.W2;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            kj kjVar3 = new kj(i10, tL_message, true, false);
            mj mjVar2 = new mj(this, bool, 2, m5.j(kjVar3), kj.B0(kjVar3.k), null);
            this.c = mjVar2;
            if (mjVar2.e.isEmpty()) {
                this.c = null;
            } else {
                kj kjVar4 = (kj) this.c.e.get(0);
                CharSequence charSequence3 = kjVar4.v;
                if (!(charSequence3 instanceof Spanned) || TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = kjVar4.z;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) kjVar4.v).getSpans(0, kjVar4.z.length(), URLSpan.class);
                        this.n = uRLSpanArr == null || uRLSpanArr.length <= 1;
                    }
                } else {
                    CharSequence charSequence5 = kjVar4.v;
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), URLSpan.class);
                    this.n = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                }
                boolean z13 = !kjVar4.E0 && (kj.o1(kjVar4.k) instanceof TLRPC.TL_messageMediaWebPage) && (kj.o1(kjVar4.k).webpage instanceof TLRPC.TL_webPage);
                TLRPC.WebPage webPage2 = z13 ? kj.o1(kjVar4.k).webpage : null;
                String str = webPage2 != null ? webPage2.type : null;
                this.o = z13 && !kjVar4.v3() && webPage2 != null && (webPage2.photo != null || kj.K4(webPage2.document)) && !((TextUtils.isEmpty(webPage2.description) && TextUtils.isEmpty(webPage2.title)) || kjVar4.r4() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str));
                if (z11 && kjVar2 != null && (message = kjVar2.k) != null && (messageMedia2 = message.media) != null) {
                    this.q = messageMedia2.force_small_media || (kjVar4.A3() && !kjVar2.k.media.force_large_media);
                } else if (z11) {
                    this.q = kjVar4.A3();
                }
                TLRPC.Message message3 = kjVar4.k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z14 = this.q;
                    messageMedia.force_large_media = !z14;
                    messageMedia.force_small_media = z14;
                }
            }
        }
        ab0 ab0Var = this.x;
        if (ab0Var == null) {
            return;
        }
        oj ojVar = ab0Var.d;
        int i12 = 0;
        while (true) {
            View[] viewArr = ab0Var.f.e;
            if (i12 >= viewArr.length) {
                return;
            }
            View view = viewArr[i12];
            if (view != null) {
                ua0 ua0Var = (ua0) view;
                FrameLayout frameLayout = ua0Var.F;
                if (ua0Var.a == 2) {
                    za0 za0Var = ua0Var.H;
                    za0 za0Var2 = ua0Var.G;
                    frameLayout.setVisibility((!ojVar.n || ojVar.o) ? 0 : 8);
                    za0Var2.setVisibility(ojVar.p ? 4 : 0);
                    za0Var.setVisibility(ojVar.p ? 0 : 4);
                    frameLayout.animate().alpha(ojVar.o ? 1.0f : 0.5f).start();
                    za0Var2.a(ojVar.q, true);
                    za0Var.a(ojVar.q, true);
                    ua0Var.E.a(!ojVar.r, true);
                    ua0Var.i();
                }
            }
            i12++;
        }
    }

    public final void f(kj kjVar, fj fjVar, long j10, org.telegram.ui.kn knVar) {
        kj kjVar2;
        org.telegram.ui.kn knVar2;
        int i10;
        if (this.i || kjVar == null || (i10 = kjVar.D) == 10 || i10 == 11 || i10 == 22 || i10 == 21 || i10 == 18 || i10 == 25 || i10 == 16) {
            kjVar2 = null;
            knVar2 = null;
        } else {
            kjVar2 = kjVar;
            knVar2 = knVar;
        }
        this.u = kjVar2 != null && (kjVar2.S4() || kjVar2.g4() || kjVar2.D == 30);
        if (kjVar2 == null && knVar2 == null) {
            this.a = null;
            this.d = null;
            return;
        }
        if (fjVar != null) {
            this.a = new mj(this, null, 1, fjVar.d, j10, null);
        } else {
            kj kjVar3 = kjVar2;
            if (kjVar3 == null) {
                kjVar3 = knVar2.a;
            }
            this.a = new mj(this, null, 1, m5.j(kjVar3), j10, null);
        }
        if (this.a.e.isEmpty()) {
            this.a = null;
            return;
        }
        this.d = knVar2;
        if (knVar2 != null) {
            this.e = knVar2.b;
            this.f = knVar2.c;
        }
    }
}
