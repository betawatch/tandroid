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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.x90;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class dj {
    public bj a;
    public bj b;
    public bj c;
    public org.telegram.ui.mm d;
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
    public da0 x;

    public dj(boolean z10, boolean z11, boolean z12) {
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

    public final void b(zi ziVar) {
        TLRPC.WebPage webPage;
        this.w = null;
        if (ziVar != null) {
            CharSequence charSequence = ziVar.v;
            if (!(charSequence instanceof Spanned) || (webPage = this.v) == null || webPage.url == null) {
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
            for (int i3 = 0; i3 < uRLSpanArr.length; i3++) {
                if (a(uRLSpanArr[i3].getURL(), this.v.url)) {
                    this.w = uRLSpanArr[i3];
                    return;
                }
            }
        }
    }

    public final boolean c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        bj bjVar = this.b;
        if (bjVar != null && (arrayList3 = bjVar.e) != null && !arrayList3.isEmpty()) {
            return false;
        }
        bj bjVar2 = this.a;
        if (bjVar2 != null && (arrayList2 = bjVar2.e) != null && !arrayList2.isEmpty()) {
            return false;
        }
        bj bjVar3 = this.c;
        return bjVar3 == null || (arrayList = bjVar3.e) == null || arrayList.isEmpty();
    }

    public final void d(ArrayList arrayList, long j10) {
        long j11;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.g = false;
        this.h = false;
        this.i = m5.C(j10);
        this.j = false;
        if (arrayList == null) {
            this.b = null;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            zi ziVar = (zi) arrayList.get(i3);
            if (!TextUtils.isEmpty(ziVar.z)) {
                this.g = true;
            }
            if (!this.i && (messageFwdHeader = ziVar.k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                arrayList2.add(messageFwdHeader.from_name);
            }
        }
        Boolean bool = Boolean.TRUE;
        bj bjVar = this.b;
        bj bjVar2 = new bj(this, bool, 0, arrayList, j10, bjVar != null ? bjVar.g : null);
        this.b = bjVar2;
        if (bjVar2.e.isEmpty()) {
            this.b = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            zi ziVar2 = (zi) arrayList.get(i10);
            if (ziVar2.q3()) {
                j11 = ziVar2.k.from_id.user_id;
            } else {
                TLRPC.Chat M0 = hp.s1(ziVar2.I1).M0(Long.valueOf(ziVar2.k.peer_id.channel_id));
                j11 = -((t3.T(M0) && M0.megagroup && ziVar2.l3()) ? ziVar2.k.fwd_from.from_id.channel_id : ziVar2.k.peer_id.channel_id);
            }
            if (!arrayList3.contains(Long.valueOf(j11))) {
                arrayList3.add(Long.valueOf(j11));
            }
        }
        if (arrayList2.size() + arrayList3.size() > 1) {
            this.j = true;
        }
    }

    public final void e(int i3, TLRPC.WebPage webPage, CharSequence charSequence, zi ziVar, org.telegram.ui.mm mmVar, zi ziVar2) {
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
            bj bjVar = this.c;
            boolean z11 = bjVar == null || z10;
            if (bjVar == null && ziVar2 != null && (message2 = ziVar2.k) != null) {
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
            tL_peerUser.user_id = h10.i(i3).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = h10.i(i3).e();
            tL_message.entities = li.b0(i3).W(charSequenceArr, true, true);
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
                this.p = zi.L4(webPage.document);
            } else {
                this.o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (ziVar != null) {
                tL_message.replyMessage = ziVar.k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (mmVar != null) {
                    tL_messageReplyHeader.quote_text = mmVar.i;
                    int i10 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i10 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = mmVar.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i10 | hs.W2;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            zi ziVar3 = new zi(i3, tL_message, true, false);
            bj bjVar2 = new bj(this, bool, 2, k5.k(ziVar3), zi.B0(ziVar3.k), null);
            this.c = bjVar2;
            if (bjVar2.e.isEmpty()) {
                this.c = null;
            } else {
                zi ziVar4 = (zi) this.c.e.get(0);
                CharSequence charSequence3 = ziVar4.v;
                if (!(charSequence3 instanceof Spanned) || TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = ziVar4.z;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) ziVar4.v).getSpans(0, ziVar4.z.length(), URLSpan.class);
                        this.n = uRLSpanArr == null || uRLSpanArr.length <= 1;
                    }
                } else {
                    CharSequence charSequence5 = ziVar4.v;
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), URLSpan.class);
                    this.n = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                }
                boolean z13 = !ziVar4.E0 && !ziVar4.L2 && (zi.o1(ziVar4.k) instanceof TLRPC.TL_messageMediaWebPage) && (zi.o1(ziVar4.k).webpage instanceof TLRPC.TL_webPage);
                TLRPC.WebPage webPage2 = z13 ? zi.o1(ziVar4.k).webpage : null;
                String str = webPage2 != null ? webPage2.type : null;
                this.o = z13 && !ziVar4.w3() && webPage2 != null && (webPage2.photo != null || zi.L4(webPage2.document)) && !((TextUtils.isEmpty(webPage2.description) && TextUtils.isEmpty(webPage2.title)) || ziVar4.s4() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str));
                if (z11 && ziVar2 != null && (message = ziVar2.k) != null && (messageMedia2 = message.media) != null) {
                    this.q = messageMedia2.force_small_media || (ziVar4.B3() && !ziVar2.k.media.force_large_media);
                } else if (z11) {
                    this.q = ziVar4.B3();
                }
                TLRPC.Message message3 = ziVar4.k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z14 = this.q;
                    messageMedia.force_large_media = !z14;
                    messageMedia.force_small_media = z14;
                }
            }
        }
        da0 da0Var = this.x;
        if (da0Var == null) {
            return;
        }
        dj djVar = da0Var.d;
        int i11 = 0;
        while (true) {
            View[] viewArr = da0Var.f.e;
            if (i11 >= viewArr.length) {
                return;
            }
            View view = viewArr[i11];
            if (view != null) {
                x90 x90Var = (x90) view;
                FrameLayout frameLayout = x90Var.G;
                if (x90Var.a == 2) {
                    ca0 ca0Var = x90Var.I;
                    ca0 ca0Var2 = x90Var.H;
                    frameLayout.setVisibility((!djVar.n || djVar.o) ? 0 : 8);
                    ca0Var2.setVisibility(djVar.p ? 4 : 0);
                    ca0Var.setVisibility(djVar.p ? 0 : 4);
                    frameLayout.animate().alpha(djVar.o ? 1.0f : 0.5f).start();
                    ca0Var2.a(djVar.q, true);
                    ca0Var.a(djVar.q, true);
                    x90Var.F.a(!djVar.r, true);
                    x90Var.i();
                }
            }
            i11++;
        }
    }

    public final void f(zi ziVar, ui uiVar, long j10, org.telegram.ui.mm mmVar) {
        zi ziVar2;
        org.telegram.ui.mm mmVar2;
        int i3;
        if (this.i || ziVar == null || (i3 = ziVar.D) == 10 || i3 == 11 || i3 == 22 || i3 == 21 || i3 == 18 || i3 == 25 || i3 == 16) {
            ziVar2 = null;
            mmVar2 = null;
        } else {
            ziVar2 = ziVar;
            mmVar2 = mmVar;
        }
        this.u = ziVar2 != null && (ziVar2.T4() || ziVar2.h4() || ziVar2.D == 30);
        if (ziVar2 == null && mmVar2 == null) {
            this.a = null;
            this.d = null;
            return;
        }
        if (uiVar != null) {
            this.a = new bj(this, null, 1, uiVar.d, j10, null);
        } else {
            zi ziVar3 = ziVar2;
            if (ziVar3 == null) {
                ziVar3 = mmVar2.a;
            }
            this.a = new bj(this, null, 1, k5.k(ziVar3), j10, null);
        }
        if (this.a.e.isEmpty()) {
            this.a = null;
            return;
        }
        this.d = mmVar2;
        if (mmVar2 != null) {
            this.e = mmVar2.b;
            this.f = mmVar2.c;
        }
    }
}
