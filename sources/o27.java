// default package

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o27 {
    public m27 a;
    public m27 b;
    public m27 c;
    public bu1 d;
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
    public wr1 x;

    public o27(boolean z, boolean z2, boolean z3) {
        this.i = z;
        this.s = z || z2;
        this.t = z3;
    }

    public static boolean a(String str, String str2) {
        if (str == null) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (parse == parse2) {
            return true;
        }
        if (parse == null || parse2 == null || parse.getHost() == null || !parse.getHost().equalsIgnoreCase(parse2.getHost()) || parse.getPort() != parse2.getPort()) {
            return false;
        }
        String path = parse.getPath();
        if (path == null) {
            path = "";
        } else if (!path.endsWith("/")) {
            path = path.concat("/");
        }
        String path2 = parse2.getPath();
        if (path.equals(path2 != null ? path2.endsWith("/") ? path2 : path2.concat("/") : "")) {
            return parse.getQuery() == null ? parse2.getQuery() == null : parse.getQuery().equals(parse2.getQuery());
        }
        return false;
    }

    public final void b(k27 k27Var) {
        TLRPC.WebPage webPage;
        this.w = null;
        if (k27Var != null) {
            CharSequence charSequence = k27Var.v;
            if (!(charSequence instanceof Spanned) || (webPage = this.v) == null || webPage.url == null) {
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
            for (int i = 0; i < uRLSpanArr.length; i++) {
                if (a(uRLSpanArr[i].getURL(), this.v.url)) {
                    this.w = uRLSpanArr[i];
                    return;
                }
            }
        }
    }

    public final boolean c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        m27 m27Var = this.b;
        if (m27Var != null && (arrayList3 = m27Var.e) != null && !arrayList3.isEmpty()) {
            return false;
        }
        m27 m27Var2 = this.a;
        if (m27Var2 != null && (arrayList2 = m27Var2.e) != null && !arrayList2.isEmpty()) {
            return false;
        }
        m27 m27Var3 = this.c;
        return m27Var3 == null || (arrayList = m27Var3.e) == null || arrayList.isEmpty();
    }

    public final void d(ArrayList arrayList, long j) {
        long j2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.g = false;
        this.h = false;
        this.i = cf3.B(j);
        this.j = false;
        if (arrayList == null) {
            this.b = null;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            k27 k27Var = (k27) arrayList.get(i);
            if (!TextUtils.isEmpty(k27Var.z)) {
                this.g = true;
            }
            if (!this.i && (messageFwdHeader = k27Var.k.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                arrayList2.add(messageFwdHeader.from_name);
            }
        }
        Boolean bool = Boolean.TRUE;
        m27 m27Var = this.b;
        m27 m27Var2 = new m27(this, bool, 0, arrayList, j, m27Var != null ? m27Var.g : null);
        this.b = m27Var2;
        if (m27Var2.e.isEmpty()) {
            this.b = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            k27 k27Var2 = (k27) arrayList.get(i2);
            if (k27Var2.p3()) {
                j2 = k27Var2.k.from_id.user_id;
            } else {
                TLRPC.Chat K0 = na7.q1(k27Var2.K1).K0(Long.valueOf(k27Var2.k.peer_id.channel_id));
                j2 = -((hc2.T(K0) && K0.megagroup && k27Var2.k3()) ? k27Var2.k.fwd_from.from_id.channel_id : k27Var2.k.peer_id.channel_id);
            }
            if (!arrayList3.contains(Long.valueOf(j2))) {
                arrayList3.add(Long.valueOf(j2));
            }
        }
        if (arrayList2.size() + arrayList3.size() > 1) {
            this.j = true;
        }
    }

    public final void e(int i, TLRPC.WebPage webPage, CharSequence charSequence, k27 k27Var, bu1 bu1Var, k27 k27Var2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Message message2;
        this.o = false;
        this.p = false;
        this.n = true;
        boolean z = this.v != webPage;
        this.v = webPage;
        if (TextUtils.isEmpty(charSequence) && this.v == null) {
            this.c = null;
        } else {
            CharSequence charSequence2 = charSequence == null ? "" : charSequence;
            m27 m27Var = this.c;
            boolean z2 = m27Var == null || z;
            if (m27Var == null && k27Var2 != null && (message2 = k27Var2.k) != null) {
                this.r = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.q = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(gl.m1(charSequence2))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = y6c.h(i).e();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = y6c.h(i).e();
            tL_message.entities = hq6.d0(i).Y(charSequenceArr, true, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.r;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z3 = this.q;
                tL_messageMediaWebPage.force_large_media = !z3;
                tL_messageMediaWebPage.force_small_media = z3;
                this.o = webPage.photo != null;
                this.p = k27.J4(webPage.document);
            } else {
                this.o = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (k27Var != null) {
                tL_message.replyMessage = k27Var.k;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (bu1Var != null) {
                    tL_messageReplyHeader.quote_text = bu1Var.i;
                    int i2 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i2 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = bu1Var.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i2 | kk7.V2;
                    }
                }
            }
            Boolean bool = Boolean.TRUE;
            k27 k27Var3 = new k27(i, tL_message, true, false);
            m27 m27Var2 = new m27(this, bool, 2, tb4.t(k27Var3), k27.B0(k27Var3.k), null);
            this.c = m27Var2;
            if (m27Var2.e.isEmpty()) {
                this.c = null;
            } else {
                k27 k27Var4 = (k27) this.c.e.get(0);
                CharSequence charSequence3 = k27Var4.v;
                if (!(charSequence3 instanceof Spanned) || TextUtils.isEmpty(charSequence3)) {
                    CharSequence charSequence4 = k27Var4.z;
                    if ((charSequence4 instanceof Spanned) && !TextUtils.isEmpty(charSequence4)) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) k27Var4.v).getSpans(0, k27Var4.z.length(), URLSpan.class);
                        this.n = uRLSpanArr == null || uRLSpanArr.length <= 1;
                    }
                } else {
                    CharSequence charSequence5 = k27Var4.v;
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), URLSpan.class);
                    this.n = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                }
                boolean z4 = !k27Var4.G0 && !k27Var4.N2 && (k27.n1(k27Var4.k) instanceof TLRPC.TL_messageMediaWebPage) && (k27.n1(k27Var4.k).webpage instanceof TLRPC.TL_webPage);
                TLRPC.WebPage webPage2 = z4 ? k27.n1(k27Var4.k).webpage : null;
                String str = webPage2 != null ? webPage2.type : null;
                this.o = z4 && !k27Var4.v3() && webPage2 != null && (webPage2.photo != null || k27.J4(webPage2.document)) && !((TextUtils.isEmpty(webPage2.description) && TextUtils.isEmpty(webPage2.title)) || k27Var4.q4() || "telegram_megagroup".equals(str) || "telegram_background".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_user".equals(str) || "telegram_story".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str));
                if (z2 && k27Var2 != null && (message = k27Var2.k) != null && (messageMedia2 = message.media) != null) {
                    this.q = messageMedia2.force_small_media || (k27Var4.A3() && !k27Var2.k.media.force_large_media);
                } else if (z2) {
                    this.q = k27Var4.A3();
                }
                TLRPC.Message message3 = k27Var4.k;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z5 = this.q;
                    messageMedia.force_large_media = !z5;
                    messageMedia.force_small_media = z5;
                }
            }
        }
        wr1 wr1Var = this.x;
        if (wr1Var == null) {
            return;
        }
        o27 o27Var = wr1Var.d;
        int i3 = 0;
        while (true) {
            View[] viewArr = wr1Var.f.e;
            if (i3 >= viewArr.length) {
                return;
            }
            View view = viewArr[i3];
            if (view != null) {
                f37 f37Var = (f37) view;
                FrameLayout frameLayout = f37Var.G;
                if (f37Var.a == 2) {
                    k37 k37Var = f37Var.I;
                    k37 k37Var2 = f37Var.H;
                    frameLayout.setVisibility((!o27Var.n || o27Var.o) ? 0 : 8);
                    k37Var2.setVisibility(o27Var.p ? 4 : 0);
                    k37Var.setVisibility(o27Var.p ? 0 : 4);
                    frameLayout.animate().alpha(o27Var.o ? 1.0f : 0.5f).start();
                    k37Var2.a(o27Var.q, true);
                    k37Var.a(o27Var.q, true);
                    f37Var.F.a(!o27Var.r, true);
                    f37Var.i();
                }
            }
            i3++;
        }
    }

    public final void f(k27 k27Var, f27 f27Var, long j, bu1 bu1Var) {
        k27 k27Var2;
        bu1 bu1Var2;
        m27 m27Var;
        int i;
        if (this.i || k27Var == null || (i = k27Var.D) == 10 || i == 11 || i == 22 || i == 21 || i == 18 || i == 25 || i == 16) {
            k27Var2 = null;
            bu1Var2 = null;
        } else {
            k27Var2 = k27Var;
            bu1Var2 = bu1Var;
        }
        this.u = k27Var2 != null && (k27Var2.R4() || k27Var2.f4() || k27Var2.D == 30);
        if (k27Var2 == null && bu1Var2 == null) {
            this.a = null;
            this.d = null;
            return;
        }
        if (f27Var != null) {
            m27Var = new m27(this, null, 1, f27Var.d, j, null);
            this.a = m27Var;
        } else {
            k27 k27Var3 = k27Var2;
            if (k27Var3 == null) {
                k27Var3 = bu1Var2.a;
            }
            m27Var = new m27(this, null, 1, tb4.t(k27Var3), j, null);
            this.a = m27Var;
        }
        if (m27Var.e.isEmpty()) {
            this.a = null;
            return;
        }
        this.d = bu1Var2;
        if (bu1Var2 != null) {
            this.e = bu1Var2.b;
            this.f = bu1Var2.c;
        }
    }
}
