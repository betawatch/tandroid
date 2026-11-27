// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jw5 extends nx0 {
    public static final /* synthetic */ int t1 = 0;
    public int l1;
    public final String m1;
    public final e n1;
    public final TLRPC.ChatInvite o1;
    public final TLRPC.Chat p1;
    public final TextView q1;
    public final RadialProgressView r1;
    public d31 s1;

    /* JADX WARN: Removed duplicated region for block: B:100:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jw5(Context context, TLObject tLObject, String str, e eVar, vnb vnbVar) {
        super(1, vnbVar, context, false);
        String str2;
        final long j;
        long j2;
        TLRPC.ChatInvite chatInvite;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        String str3;
        String str4;
        yt9 yt9Var;
        final boolean z4;
        boolean isEmpty;
        int i2;
        String lowerCase;
        TLRPC.ChatInvite chatInvite2;
        float f;
        boolean z5;
        String format;
        String str5;
        this.w0 = false;
        this.v0 = false;
        L(aob.d6);
        this.l1 = this.H0;
        this.n1 = eVar;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite3 = (TLRPC.ChatInvite) tLObject;
            this.o1 = chatInvite3;
            TLRPC.Chat chat = chatInvite3.chat;
            j2 = chat != null ? -chat.id : 0L;
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = str;
                j = 0;
                this.m1 = str2;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClickable(true);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(linearLayout);
                NestedScrollView nestedScrollView = new NestedScrollView(context);
                nestedScrollView.addView(frameLayout);
                this.O = nestedScrollView;
                ImageView imageView = new ImageView(context);
                imageView.setBackground(aob.f0(aob.v0(aob.i6, this.J0), 1, -1));
                yob.s(imageView, aob.Aj, vnbVar, PorterDuff.Mode.SRC_ATOP);
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new sa5(this, (byte) 14));
                int L = hl.L(8.0f);
                imageView.setPadding(L, L, L, L);
                frameLayout.addView(imageView, tre.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                de0 de0Var = new de0(context);
                de0Var.setRoundRadius(hl.L(45.0f));
                linearLayout.addView(de0Var, tre.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.o1;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        rb0 rb0Var = new rb0(this.o1.chat);
                        TLRPC.ChatInvite chatInvite4 = this.o1;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        str5 = chat2.title;
                        i = chat2.participants_count;
                        de0Var.a.U(chat2, rb0Var, chatInvite4);
                        de0Var.e();
                    } else {
                        rb0 rb0Var2 = new rb0((vnb) null);
                        rb0Var2.j(0L, this.o1.title, null, null);
                        TLRPC.ChatInvite chatInvite5 = this.o1;
                        String str6 = chatInvite5.title;
                        i = chatInvite5.participants_count;
                        de0Var.m(jn5.i(xb4.w(chatInvite5.photo.sizes, 50, false, null, false), this.o1.photo), "50_50", rb0Var2, this.o1);
                        str5 = str6;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.o1;
                    str3 = chatInvite6.about;
                    z2 = chatInvite6.verified;
                    z3 = chatInvite6.fake;
                    z = chatInvite6.scam;
                    str4 = str5;
                } else if (this.p1 != null) {
                    rb0 rb0Var3 = new rb0(this.p1);
                    String str7 = this.p1.title;
                    TLRPC.ChatFull N0 = uc7.s1(this.a).N0(this.p1.id);
                    String str8 = N0 != null ? N0.about : null;
                    i = Math.max(this.p1.participants_count, N0 != null ? N0.participants_count : 0);
                    TLRPC.Chat chat3 = this.p1;
                    de0Var.a.U(chat3, rb0Var3, chat3);
                    de0Var.e();
                    TLRPC.Chat chat4 = this.p1;
                    boolean z6 = chat4.verified;
                    z3 = chat4.fake;
                    z = chat4.scam;
                    z2 = z6;
                    str3 = str8;
                    str4 = str7;
                } else {
                    z = false;
                    z2 = false;
                    z3 = false;
                    i = 0;
                    str3 = null;
                    str4 = null;
                }
                ema emaVar = new ema(context);
                emaVar.setTypeface(hl.o());
                emaVar.setTextSize(20);
                int i3 = aob.j5;
                yob.W(emaVar, i3, vnbVar);
                emaVar.l(str4, false);
                emaVar.setGravity(17);
                linearLayout.addView(emaVar, tre.t(-2, -2, 49, 10, 10, 10, i <= 0 ? 0 : 20));
                if (!z) {
                    yt9Var = aob.f1;
                } else {
                    if (!z3) {
                        if (z2) {
                            emaVar.i(new zm2(aob.e1, aob.i1));
                        }
                        TLRPC.ChatInvite chatInvite7 = this.o1;
                        z4 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || xc2.V(chatInvite7.chat))) || (xc2.T(this.p1) && !this.p1.megagroup);
                        isEmpty = TextUtils.isEmpty(str3);
                        TextView textView = new TextView(context);
                        textView.setTextSize(1, 13.0f);
                        int i4 = aob.r5;
                        yob.X(textView, i4, vnbVar);
                        textView.setSingleLine(true);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView.setEllipsize(truncateAt);
                        if (z4) {
                            lowerCase = ob6.M0(2131752299, null).toLowerCase();
                            i2 = 20;
                        } else {
                            i2 = 20;
                            lowerCase = ob6.M0(2131748395, null).toLowerCase();
                        }
                        textView.setText(lowerCase);
                        linearLayout.addView(textView, tre.t(-2, -2, 49, 10, 0, 10, !isEmpty ? 0 : i2));
                        if (!isEmpty) {
                            TextView textView2 = new TextView(context);
                            textView2.setGravity(17);
                            textView2.setText(str3);
                            yob.X(textView2, i3, vnbVar);
                            textView2.setTextSize(1, 15.0f);
                            linearLayout.addView(textView2, tre.t(-1, -2, 48, 24, 10, 24, 20));
                        }
                        chatInvite2 = this.o1;
                        if (chatInvite2 != null || chatInvite2.request_needed) {
                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                            linearLayout.addView(frameLayout2, tre.o(-1, -2));
                            RadialProgressView radialProgressView = new RadialProgressView(getContext(), vnbVar);
                            this.r1 = radialProgressView;
                            int i5 = aob.Fi;
                            radialProgressView.setProgressColorKey(i5);
                            radialProgressView.setSize(hl.L(32.0f));
                            radialProgressView.setVisibility(4);
                            frameLayout2.addView(radialProgressView, tre.e(48, 48, 17));
                            TextView textView3 = new TextView(getContext());
                            this.q1 = textView3;
                            int L2 = hl.L(24.0f);
                            int v0 = aob.v0(i5, this.J0);
                            int i6 = aob.Hi;
                            int v02 = aob.v0(i6, this.J0);
                            hf0 i0 = aob.i0(L2, L2, L2, L2, v0, v02, v02);
                            uob M = yob.M(i5);
                            uob M2 = yob.M(i6);
                            textView3.setBackground(i0);
                            yob.j(textView3, i0, M, M2, vnbVar);
                            textView3.setEllipsize(truncateAt);
                            textView3.setGravity(17);
                            textView3.setSingleLine(true);
                            textView3.setText(ob6.M0(z4 ? 2131745901 : 2131745897, null));
                            yob.X(textView3, aob.Ji, vnbVar);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setTypeface(hl.o());
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: gw5
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final jw5 jw5Var = jw5.this;
                                    TLRPC.Chat chat5 = jw5Var.p1;
                                    final byte b = 0;
                                    hl.d3(new Runnable() { // from class: hw5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b2 = b;
                                            jw5 jw5Var2 = jw5Var;
                                            switch (b2) {
                                                case 0:
                                                    if (!jw5Var2.J) {
                                                        jw5Var2.q1.setVisibility(4);
                                                        jw5Var2.r1.setVisibility(0);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    jw5Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    TLRPC.ChatInvite chatInvite8 = jw5Var.o1;
                                    boolean z7 = z4;
                                    if (chatInvite8 != null || chat5 == null) {
                                        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                        tL_messages_importChatInvite.hash = jw5Var.m1;
                                        ConnectionsManager.getInstance(jw5Var.a).sendRequest(tL_messages_importChatInvite, new e87(jw5Var, j, z7, tL_messages_importChatInvite), 2);
                                    } else {
                                        final byte b2 = 1;
                                        uc7.s1(jw5Var.a).k(chat5.id, yac.h(jw5Var.a).f(), null, null, true, new Runnable() { // from class: hw5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b22 = b2;
                                                jw5 jw5Var2 = jw5Var;
                                                switch (b22) {
                                                    case 0:
                                                        if (!jw5Var2.J) {
                                                            jw5Var2.q1.setVisibility(4);
                                                            jw5Var2.r1.setVisibility(0);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jw5Var2.dismiss();
                                                        break;
                                                }
                                            }
                                        }, new t41((byte) 8, jw5Var, z7));
                                    }
                                }
                            });
                            frameLayout2.addView(textView3, tre.t(-1, 48, 8388611, 14, 0, 14, 0));
                            TextView textView4 = new TextView(getContext());
                            textView4.setGravity(17);
                            textView4.setTextSize(1, 14.0f);
                            textView4.setText(ob6.M0(z4 ? 2131745899 : 2131745895, null));
                            yob.X(textView4, i4, vnbVar);
                            linearLayout.addView(textView4, tre.t(-1, -2, 48, 24, 17, 24, 15));
                        }
                        byte b = 3;
                        if (chatInvite2.participants.isEmpty()) {
                            f = 24.0f;
                            z5 = false;
                        } else {
                            int min = Math.min(this.o1.participants.size(), 3);
                            jc0 jc0Var = new jc0(context, false);
                            jc0Var.setAvatarsTextSize(hl.L(20.0f));
                            jc0Var.setSize(hl.L(38.0f));
                            jc0Var.setCount(min);
                            jc0Var.setStepFactor(0.65f);
                            for (int i7 = 0; i7 < min; i7++) {
                                jc0Var.b(i7, yac.t0, this.o1.participants.get(i7));
                            }
                            jc0Var.a(false);
                            linearLayout.addView(jc0Var, tre.t((int) (((min - 1) * 25.699999f) + 38.0f), 44, 17, 0, 2, 0, 4));
                            TextView textView5 = new TextView(context);
                            textView5.setTextSize(1, 13.0f);
                            yob.X(textView5, aob.r5, vnbVar);
                            textView5.setGravity(17);
                            if (min == 1) {
                                z5 = false;
                                format = E0(textView5, this.o1, 0).toString();
                            } else {
                                z5 = false;
                                if (min == 2) {
                                    format = ob6.a0("RequestToJoinMembersTwo", null, 2131745889, E0(textView5, this.o1, 0), E0(textView5, this.o1, 1));
                                } else {
                                    if (i == 3) {
                                        f = 24.0f;
                                        format = ob6.a0("RequestToJoinMembersThree", null, 2131745890, E0(textView5, this.o1, 0), E0(textView5, this.o1, 1), E0(textView5, this.o1, 2));
                                        z5 = false;
                                    } else {
                                        f = 24.0f;
                                        int max = Math.max(i - min, 2);
                                        z5 = false;
                                        format = String.format(ob6.J0(max, "RequestToJoinMembersAll"), E0(textView5, this.o1, 0), E0(textView5, this.o1, 1), Integer.valueOf(max));
                                    }
                                    textView5.setText(format);
                                    linearLayout.addView(textView5, tre.t(-2, -2, 49, 10, 0, 10, 24));
                                }
                            }
                            f = 24.0f;
                            textView5.setText(format);
                            linearLayout.addView(textView5, tre.t(-2, -2, 49, 10, 0, 10, 24));
                        }
                        TLRPC.ChatInvite chatInvite8 = this.o1;
                        if ((chatInvite8.channel && !chatInvite8.megagroup) || (xc2.T(chatInvite8.chat) && !this.o1.chat.megagroup)) {
                            z5 = true;
                        }
                        TextView textView6 = new TextView(getContext());
                        int L3 = hl.L(f);
                        int i8 = aob.Fi;
                        int v03 = aob.v0(i8, this.J0);
                        int i9 = aob.Hi;
                        int v04 = aob.v0(i9, this.J0);
                        hf0 i02 = aob.i0(L3, L3, L3, L3, v03, v04, v04);
                        uob M3 = yob.M(i8);
                        uob M4 = yob.M(i9);
                        textView6.setBackground(i02);
                        yob.j(textView6, i02, M3, M4, vnbVar);
                        iye.b(textView6, 0.02f, 1.2f);
                        textView6.setEllipsize(TextUtils.TruncateAt.END);
                        textView6.setGravity(17);
                        textView6.setSingleLine(true);
                        textView6.setText(ob6.M0(z5 ? 2131746389 : 2131746388, null));
                        qd4.w(textView6, aob.Ji, vnbVar, 1, 14.0f);
                        linearLayout.addView(textView6, tre.t(-1, 48, 8388611, 14, 0, 14, 14));
                        textView6.setOnClickListener(new my(this, j, b));
                        return;
                    }
                    yt9Var = aob.g1;
                }
                emaVar.i(yt9Var);
                TLRPC.ChatInvite chatInvite72 = this.o1;
                if (chatInvite72 == null) {
                }
                isEmpty = TextUtils.isEmpty(str3);
                TextView textView7 = new TextView(context);
                textView7.setTextSize(1, 13.0f);
                int i42 = aob.r5;
                yob.X(textView7, i42, vnbVar);
                textView7.setSingleLine(true);
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                textView7.setEllipsize(truncateAt2);
                if (z4) {
                }
                textView7.setText(lowerCase);
                linearLayout.addView(textView7, tre.t(-2, -2, 49, 10, 0, 10, !isEmpty ? 0 : i2));
                if (!isEmpty) {
                }
                chatInvite2 = this.o1;
                if (chatInvite2 != null) {
                }
                FrameLayout frameLayout22 = new FrameLayout(getContext());
                linearLayout.addView(frameLayout22, tre.o(-1, -2));
                RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), vnbVar);
                this.r1 = radialProgressView2;
                int i52 = aob.Fi;
                radialProgressView2.setProgressColorKey(i52);
                radialProgressView2.setSize(hl.L(32.0f));
                radialProgressView2.setVisibility(4);
                frameLayout22.addView(radialProgressView2, tre.e(48, 48, 17));
                TextView textView32 = new TextView(getContext());
                this.q1 = textView32;
                int L22 = hl.L(24.0f);
                int v05 = aob.v0(i52, this.J0);
                int i62 = aob.Hi;
                int v022 = aob.v0(i62, this.J0);
                hf0 i03 = aob.i0(L22, L22, L22, L22, v05, v022, v022);
                uob M5 = yob.M(i52);
                uob M22 = yob.M(i62);
                textView32.setBackground(i03);
                yob.j(textView32, i03, M5, M22, vnbVar);
                textView32.setEllipsize(truncateAt2);
                textView32.setGravity(17);
                textView32.setSingleLine(true);
                textView32.setText(ob6.M0(z4 ? 2131745901 : 2131745897, null));
                yob.X(textView32, aob.Ji, vnbVar);
                textView32.setTextSize(1, 14.0f);
                textView32.setTypeface(hl.o());
                textView32.setOnClickListener(new View.OnClickListener() { // from class: gw5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final jw5 jw5Var = jw5.this;
                        TLRPC.Chat chat5 = jw5Var.p1;
                        final byte b2 = 0;
                        hl.d3(new Runnable() { // from class: hw5
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b22 = b2;
                                jw5 jw5Var2 = jw5Var;
                                switch (b22) {
                                    case 0:
                                        if (!jw5Var2.J) {
                                            jw5Var2.q1.setVisibility(4);
                                            jw5Var2.r1.setVisibility(0);
                                            break;
                                        }
                                        break;
                                    default:
                                        jw5Var2.dismiss();
                                        break;
                                }
                            }
                        }, 400L);
                        TLRPC.ChatInvite chatInvite82 = jw5Var.o1;
                        boolean z7 = z4;
                        if (chatInvite82 != null || chat5 == null) {
                            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                            tL_messages_importChatInvite.hash = jw5Var.m1;
                            ConnectionsManager.getInstance(jw5Var.a).sendRequest(tL_messages_importChatInvite, new e87(jw5Var, j, z7, tL_messages_importChatInvite), 2);
                        } else {
                            final byte b22 = 1;
                            uc7.s1(jw5Var.a).k(chat5.id, yac.h(jw5Var.a).f(), null, null, true, new Runnable() { // from class: hw5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b222 = b22;
                                    jw5 jw5Var2 = jw5Var;
                                    switch (b222) {
                                        case 0:
                                            if (!jw5Var2.J) {
                                                jw5Var2.q1.setVisibility(4);
                                                jw5Var2.r1.setVisibility(0);
                                                break;
                                            }
                                            break;
                                        default:
                                            jw5Var2.dismiss();
                                            break;
                                    }
                                }
                            }, new t41((byte) 8, jw5Var, z7));
                        }
                    }
                });
                frameLayout22.addView(textView32, tre.t(-1, 48, 8388611, 14, 0, 14, 0));
                TextView textView42 = new TextView(getContext());
                textView42.setGravity(17);
                textView42.setTextSize(1, 14.0f);
                textView42.setText(ob6.M0(z4 ? 2131745899 : 2131745895, null));
                yob.X(textView42, i42, vnbVar);
                linearLayout.addView(textView42, tre.t(-1, -2, 48, 24, 17, 24, 15));
            }
            TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
            this.p1 = chat5;
            j2 = chat5.id;
        }
        str2 = str;
        j = j2;
        this.m1 = str2;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setClickable(true);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView(linearLayout2);
        NestedScrollView nestedScrollView2 = new NestedScrollView(context);
        nestedScrollView2.addView(frameLayout3);
        this.O = nestedScrollView2;
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackground(aob.f0(aob.v0(aob.i6, this.J0), 1, -1));
        yob.s(imageView2, aob.Aj, vnbVar, PorterDuff.Mode.SRC_ATOP);
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new sa5(this, (byte) 14));
        int L4 = hl.L(8.0f);
        imageView2.setPadding(L4, L4, L4, L4);
        frameLayout3.addView(imageView2, tre.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        de0 de0Var2 = new de0(context);
        de0Var2.setRoundRadius(hl.L(45.0f));
        linearLayout2.addView(de0Var2, tre.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.o1;
        if (chatInvite == null) {
        }
        ema emaVar2 = new ema(context);
        emaVar2.setTypeface(hl.o());
        emaVar2.setTextSize(20);
        int i32 = aob.j5;
        yob.W(emaVar2, i32, vnbVar);
        emaVar2.l(str4, false);
        emaVar2.setGravity(17);
        linearLayout2.addView(emaVar2, tre.t(-2, -2, 49, 10, 10, 10, i <= 0 ? 0 : 20));
        if (!z) {
        }
        emaVar2.i(yt9Var);
        TLRPC.ChatInvite chatInvite722 = this.o1;
        if (chatInvite722 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView textView72 = new TextView(context);
        textView72.setTextSize(1, 13.0f);
        int i422 = aob.r5;
        yob.X(textView72, i422, vnbVar);
        textView72.setSingleLine(true);
        TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
        textView72.setEllipsize(truncateAt22);
        if (z4) {
        }
        textView72.setText(lowerCase);
        linearLayout2.addView(textView72, tre.t(-2, -2, 49, 10, 0, 10, !isEmpty ? 0 : i2));
        if (!isEmpty) {
        }
        chatInvite2 = this.o1;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout222 = new FrameLayout(getContext());
        linearLayout2.addView(frameLayout222, tre.o(-1, -2));
        RadialProgressView radialProgressView22 = new RadialProgressView(getContext(), vnbVar);
        this.r1 = radialProgressView22;
        int i522 = aob.Fi;
        radialProgressView22.setProgressColorKey(i522);
        radialProgressView22.setSize(hl.L(32.0f));
        radialProgressView22.setVisibility(4);
        frameLayout222.addView(radialProgressView22, tre.e(48, 48, 17));
        TextView textView322 = new TextView(getContext());
        this.q1 = textView322;
        int L222 = hl.L(24.0f);
        int v052 = aob.v0(i522, this.J0);
        int i622 = aob.Hi;
        int v0222 = aob.v0(i622, this.J0);
        hf0 i032 = aob.i0(L222, L222, L222, L222, v052, v0222, v0222);
        uob M52 = yob.M(i522);
        uob M222 = yob.M(i622);
        textView322.setBackground(i032);
        yob.j(textView322, i032, M52, M222, vnbVar);
        textView322.setEllipsize(truncateAt22);
        textView322.setGravity(17);
        textView322.setSingleLine(true);
        textView322.setText(ob6.M0(z4 ? 2131745901 : 2131745897, null));
        yob.X(textView322, aob.Ji, vnbVar);
        textView322.setTextSize(1, 14.0f);
        textView322.setTypeface(hl.o());
        textView322.setOnClickListener(new View.OnClickListener() { // from class: gw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final jw5 jw5Var = jw5.this;
                TLRPC.Chat chat52 = jw5Var.p1;
                final byte b2 = 0;
                hl.d3(new Runnable() { // from class: hw5
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b222 = b2;
                        jw5 jw5Var2 = jw5Var;
                        switch (b222) {
                            case 0:
                                if (!jw5Var2.J) {
                                    jw5Var2.q1.setVisibility(4);
                                    jw5Var2.r1.setVisibility(0);
                                    break;
                                }
                                break;
                            default:
                                jw5Var2.dismiss();
                                break;
                        }
                    }
                }, 400L);
                TLRPC.ChatInvite chatInvite82 = jw5Var.o1;
                boolean z7 = z4;
                if (chatInvite82 != null || chat52 == null) {
                    TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                    tL_messages_importChatInvite.hash = jw5Var.m1;
                    ConnectionsManager.getInstance(jw5Var.a).sendRequest(tL_messages_importChatInvite, new e87(jw5Var, j, z7, tL_messages_importChatInvite), 2);
                } else {
                    final byte b22 = 1;
                    uc7.s1(jw5Var.a).k(chat52.id, yac.h(jw5Var.a).f(), null, null, true, new Runnable() { // from class: hw5
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b222 = b22;
                            jw5 jw5Var2 = jw5Var;
                            switch (b222) {
                                case 0:
                                    if (!jw5Var2.J) {
                                        jw5Var2.q1.setVisibility(4);
                                        jw5Var2.r1.setVisibility(0);
                                        break;
                                    }
                                    break;
                                default:
                                    jw5Var2.dismiss();
                                    break;
                            }
                        }
                    }, new t41((byte) 8, jw5Var, z7));
                }
            }
        });
        frameLayout222.addView(textView322, tre.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView422 = new TextView(getContext());
        textView422.setGravity(17);
        textView422.setTextSize(1, 14.0f);
        textView422.setText(ob6.M0(z4 ? 2131745899 : 2131745895, null));
        yob.X(textView422, i422, vnbVar);
        linearLayout2.addView(textView422, tre.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static CharSequence E0(TextView textView, TLRPC.ChatInvite chatInvite, int i) {
        String str = chatInvite.participants.get(i).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), hl.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void F0(Context context, e eVar, d31 d31Var, boolean z) {
        if (context == null) {
            if (eVar != null) {
                eVar.getContext();
                return;
            }
            return;
        }
        if (d31Var == null) {
            d31Var = d31.b0(eVar);
        }
        s21 s21Var = new s21(context, eVar.getResourceProvider());
        s21Var.a.f(R.raw.timer_3, 28, 28, null);
        s21Var.b.setText(ob6.M0(2131745888, null));
        s21Var.c.setText(z ? ob6.M0(2131745898, null) : ob6.M0(2131745894, null));
        d31Var.b(s21Var, 2750).j();
    }

    @Override // nx0
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.H0 != this.l1 || (v0 = aob.v0(aob.d6, this.J0)) == this.H0) {
                return;
            }
            K(v0);
            this.l1 = this.H0;
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
