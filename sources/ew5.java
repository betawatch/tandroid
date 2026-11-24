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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ew5 extends my0 {
    public static final /* synthetic */ int t1 = 0;
    public int l1;
    public final String m1;
    public final d n1;
    public final TLRPC.ChatInvite o1;
    public final TLRPC.Chat p1;
    public final TextView q1;
    public final RadialProgressView r1;
    public c41 s1;

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
    public ew5(Context context, TLObject tLObject, String str, d dVar, ylb ylbVar) {
        super(1, ylbVar, context, false);
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
        hs9 hs9Var;
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
        L(cmb.c6);
        this.l1 = this.H0;
        this.n1 = dVar;
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
                imageView.setBackground(cmb.f0(cmb.v0(cmb.h6, this.J0), 1, -1));
                anb.s(imageView, cmb.zj, ylbVar, PorterDuff.Mode.SRC_ATOP);
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new ca5(this, (byte) 16));
                int L = gm.L(8.0f);
                imageView.setPadding(L, L, L, L);
                frameLayout.addView(imageView, qoe.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                bf0 bf0Var = new bf0(context);
                bf0Var.setRoundRadius(gm.L(45.0f));
                linearLayout.addView(bf0Var, qoe.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.o1;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        pc0 pc0Var = new pc0(this.o1.chat);
                        TLRPC.ChatInvite chatInvite4 = this.o1;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        str5 = chat2.title;
                        i = chat2.participants_count;
                        bf0Var.a.U(chat2, pc0Var, chatInvite4);
                        bf0Var.e();
                    } else {
                        pc0 pc0Var2 = new pc0((ylb) null);
                        pc0Var2.j(0L, this.o1.title, null, null);
                        TLRPC.ChatInvite chatInvite5 = this.o1;
                        String str6 = chatInvite5.title;
                        i = chatInvite5.participants_count;
                        bf0Var.m(gn5.i(bc4.w(chatInvite5.photo.sizes, 50, false, null, false), this.o1.photo), "50_50", pc0Var2, this.o1);
                        str5 = str6;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.o1;
                    str3 = chatInvite6.about;
                    z2 = chatInvite6.verified;
                    z3 = chatInvite6.fake;
                    z = chatInvite6.scam;
                    str4 = str5;
                } else if (this.p1 != null) {
                    pc0 pc0Var3 = new pc0(this.p1);
                    String str7 = this.p1.title;
                    TLRPC.ChatFull M0 = oc7.r1(this.a).M0(this.p1.id);
                    String str8 = M0 != null ? M0.about : null;
                    i = Math.max(this.p1.participants_count, M0 != null ? M0.participants_count : 0);
                    TLRPC.Chat chat3 = this.p1;
                    bf0Var.a.U(chat3, pc0Var3, chat3);
                    bf0Var.e();
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
                lka lkaVar = new lka(context);
                lkaVar.setTypeface(gm.o());
                lkaVar.setTextSize(20);
                int i3 = cmb.i5;
                anb.W(lkaVar, i3, ylbVar);
                lkaVar.l(str4, false);
                lkaVar.setGravity(17);
                linearLayout.addView(lkaVar, qoe.t(-2, -2, 49, 10, 10, 10, i <= 0 ? 0 : 20));
                if (!z) {
                    hs9Var = cmb.f1;
                } else {
                    if (!z3) {
                        if (z2) {
                            lkaVar.i(new sn2(cmb.e1, cmb.h1));
                        }
                        TLRPC.ChatInvite chatInvite7 = this.o1;
                        z4 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || sd2.V(chatInvite7.chat))) || (sd2.T(this.p1) && !this.p1.megagroup);
                        isEmpty = TextUtils.isEmpty(str3);
                        TextView textView = new TextView(context);
                        textView.setTextSize(1, 13.0f);
                        int i4 = cmb.q5;
                        anb.X(textView, i4, ylbVar);
                        textView.setSingleLine(true);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView.setEllipsize(truncateAt);
                        if (z4) {
                            lowerCase = jb6.M0(2131752271, null).toLowerCase();
                            i2 = 20;
                        } else {
                            i2 = 20;
                            lowerCase = jb6.M0(2131748398, null).toLowerCase();
                        }
                        textView.setText(lowerCase);
                        linearLayout.addView(textView, qoe.t(-2, -2, 49, 10, 0, 10, !isEmpty ? 0 : i2));
                        if (!isEmpty) {
                            TextView textView2 = new TextView(context);
                            textView2.setGravity(17);
                            textView2.setText(str3);
                            anb.X(textView2, i3, ylbVar);
                            textView2.setTextSize(1, 15.0f);
                            linearLayout.addView(textView2, qoe.t(-1, -2, 48, 24, 10, 24, 20));
                        }
                        chatInvite2 = this.o1;
                        if (chatInvite2 != null || chatInvite2.request_needed) {
                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                            linearLayout.addView(frameLayout2, qoe.o(-1, -2));
                            RadialProgressView radialProgressView = new RadialProgressView(getContext(), ylbVar);
                            this.r1 = radialProgressView;
                            int i5 = cmb.Ei;
                            radialProgressView.setProgressColorKey(i5);
                            radialProgressView.setSize(gm.L(32.0f));
                            radialProgressView.setVisibility(4);
                            frameLayout2.addView(radialProgressView, qoe.e(48, 48, 17));
                            TextView textView3 = new TextView(getContext());
                            this.q1 = textView3;
                            int L2 = gm.L(24.0f);
                            int v0 = cmb.v0(i5, this.J0);
                            int i6 = cmb.Gi;
                            int v02 = cmb.v0(i6, this.J0);
                            fg0 i0 = cmb.i0(L2, L2, L2, L2, v0, v02, v02);
                            wmb M = anb.M(i5);
                            wmb M2 = anb.M(i6);
                            textView3.setBackground(i0);
                            anb.j(textView3, i0, M, M2, ylbVar);
                            textView3.setEllipsize(truncateAt);
                            textView3.setGravity(17);
                            textView3.setSingleLine(true);
                            textView3.setText(jb6.M0(z4 ? 2131745907 : 2131745903, null));
                            anb.X(textView3, cmb.Ii, ylbVar);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setTypeface(gm.o());
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: bw5
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final ew5 ew5Var = ew5.this;
                                    TLRPC.Chat chat5 = ew5Var.p1;
                                    final byte b = 0;
                                    gm.d3(new Runnable() { // from class: cw5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b2 = b;
                                            ew5 ew5Var2 = ew5Var;
                                            switch (b2) {
                                                case 0:
                                                    if (!ew5Var2.J) {
                                                        ew5Var2.q1.setVisibility(4);
                                                        ew5Var2.r1.setVisibility(0);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    ew5Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    TLRPC.ChatInvite chatInvite8 = ew5Var.o1;
                                    boolean z7 = z4;
                                    if (chatInvite8 != null || chat5 == null) {
                                        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                        tL_messages_importChatInvite.hash = ew5Var.m1;
                                        ConnectionsManager.getInstance(ew5Var.a).sendRequest(tL_messages_importChatInvite, new j87(ew5Var, j, z7, tL_messages_importChatInvite), 2);
                                    } else {
                                        final byte b2 = 1;
                                        oc7.r1(ew5Var.a).k(chat5.id, z8c.h(ew5Var.a).f(), null, null, true, new Runnable() { // from class: cw5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b22 = b2;
                                                ew5 ew5Var2 = ew5Var;
                                                switch (b22) {
                                                    case 0:
                                                        if (!ew5Var2.J) {
                                                            ew5Var2.q1.setVisibility(4);
                                                            ew5Var2.r1.setVisibility(0);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        ew5Var2.dismiss();
                                                        break;
                                                }
                                            }
                                        }, new s51((byte) 8, ew5Var, z7));
                                    }
                                }
                            });
                            frameLayout2.addView(textView3, qoe.t(-1, 48, 8388611, 14, 0, 14, 0));
                            TextView textView4 = new TextView(getContext());
                            textView4.setGravity(17);
                            textView4.setTextSize(1, 14.0f);
                            textView4.setText(jb6.M0(z4 ? 2131745905 : 2131745901, null));
                            anb.X(textView4, i4, ylbVar);
                            linearLayout.addView(textView4, qoe.t(-1, -2, 48, 24, 17, 24, 15));
                        }
                        byte b = 3;
                        if (chatInvite2.participants.isEmpty()) {
                            f = 24.0f;
                            z5 = false;
                        } else {
                            int min = Math.min(this.o1.participants.size(), 3);
                            hd0 hd0Var = new hd0(context, false);
                            hd0Var.setAvatarsTextSize(gm.L(20.0f));
                            hd0Var.setSize(gm.L(38.0f));
                            hd0Var.setCount(min);
                            hd0Var.setStepFactor(0.65f);
                            for (int i7 = 0; i7 < min; i7++) {
                                hd0Var.b(i7, z8c.t0, this.o1.participants.get(i7));
                            }
                            hd0Var.a(false);
                            linearLayout.addView(hd0Var, qoe.t((int) (((min - 1) * 25.699999f) + 38.0f), 44, 17, 0, 2, 0, 4));
                            TextView textView5 = new TextView(context);
                            textView5.setTextSize(1, 13.0f);
                            anb.X(textView5, cmb.q5, ylbVar);
                            textView5.setGravity(17);
                            if (min == 1) {
                                z5 = false;
                                format = D0(textView5, this.o1, 0).toString();
                            } else {
                                z5 = false;
                                if (min == 2) {
                                    format = jb6.a0("RequestToJoinMembersTwo", null, 2131745895, D0(textView5, this.o1, 0), D0(textView5, this.o1, 1));
                                } else {
                                    if (i == 3) {
                                        f = 24.0f;
                                        format = jb6.a0("RequestToJoinMembersThree", null, 2131745896, D0(textView5, this.o1, 0), D0(textView5, this.o1, 1), D0(textView5, this.o1, 2));
                                        z5 = false;
                                    } else {
                                        f = 24.0f;
                                        int max = Math.max(i - min, 2);
                                        z5 = false;
                                        format = String.format(jb6.J0(max, "RequestToJoinMembersAll"), D0(textView5, this.o1, 0), D0(textView5, this.o1, 1), Integer.valueOf(max));
                                    }
                                    textView5.setText(format);
                                    linearLayout.addView(textView5, qoe.t(-2, -2, 49, 10, 0, 10, 24));
                                }
                            }
                            f = 24.0f;
                            textView5.setText(format);
                            linearLayout.addView(textView5, qoe.t(-2, -2, 49, 10, 0, 10, 24));
                        }
                        TLRPC.ChatInvite chatInvite8 = this.o1;
                        if ((chatInvite8.channel && !chatInvite8.megagroup) || (sd2.T(chatInvite8.chat) && !this.o1.chat.megagroup)) {
                            z5 = true;
                        }
                        TextView textView6 = new TextView(getContext());
                        int L3 = gm.L(f);
                        int i8 = cmb.Ei;
                        int v03 = cmb.v0(i8, this.J0);
                        int i9 = cmb.Gi;
                        int v04 = cmb.v0(i9, this.J0);
                        fg0 i02 = cmb.i0(L3, L3, L3, L3, v03, v04, v04);
                        wmb M3 = anb.M(i8);
                        wmb M4 = anb.M(i9);
                        textView6.setBackground(i02);
                        anb.j(textView6, i02, M3, M4, ylbVar);
                        rve.b(textView6, 0.02f, 1.2f);
                        textView6.setEllipsize(TextUtils.TruncateAt.END);
                        textView6.setGravity(17);
                        textView6.setSingleLine(true);
                        textView6.setText(jb6.M0(z5 ? 2131746395 : 2131746394, null));
                        td4.x(textView6, cmb.Ii, ylbVar, 1, 14.0f);
                        linearLayout.addView(textView6, qoe.t(-1, 48, 8388611, 14, 0, 14, 14));
                        textView6.setOnClickListener(new lz(this, j, b));
                        return;
                    }
                    hs9Var = cmb.g1;
                }
                lkaVar.i(hs9Var);
                TLRPC.ChatInvite chatInvite72 = this.o1;
                if (chatInvite72 == null) {
                }
                isEmpty = TextUtils.isEmpty(str3);
                TextView textView7 = new TextView(context);
                textView7.setTextSize(1, 13.0f);
                int i42 = cmb.q5;
                anb.X(textView7, i42, ylbVar);
                textView7.setSingleLine(true);
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                textView7.setEllipsize(truncateAt2);
                if (z4) {
                }
                textView7.setText(lowerCase);
                linearLayout.addView(textView7, qoe.t(-2, -2, 49, 10, 0, 10, !isEmpty ? 0 : i2));
                if (!isEmpty) {
                }
                chatInvite2 = this.o1;
                if (chatInvite2 != null) {
                }
                FrameLayout frameLayout22 = new FrameLayout(getContext());
                linearLayout.addView(frameLayout22, qoe.o(-1, -2));
                RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), ylbVar);
                this.r1 = radialProgressView2;
                int i52 = cmb.Ei;
                radialProgressView2.setProgressColorKey(i52);
                radialProgressView2.setSize(gm.L(32.0f));
                radialProgressView2.setVisibility(4);
                frameLayout22.addView(radialProgressView2, qoe.e(48, 48, 17));
                TextView textView32 = new TextView(getContext());
                this.q1 = textView32;
                int L22 = gm.L(24.0f);
                int v05 = cmb.v0(i52, this.J0);
                int i62 = cmb.Gi;
                int v022 = cmb.v0(i62, this.J0);
                fg0 i03 = cmb.i0(L22, L22, L22, L22, v05, v022, v022);
                wmb M5 = anb.M(i52);
                wmb M22 = anb.M(i62);
                textView32.setBackground(i03);
                anb.j(textView32, i03, M5, M22, ylbVar);
                textView32.setEllipsize(truncateAt2);
                textView32.setGravity(17);
                textView32.setSingleLine(true);
                textView32.setText(jb6.M0(z4 ? 2131745907 : 2131745903, null));
                anb.X(textView32, cmb.Ii, ylbVar);
                textView32.setTextSize(1, 14.0f);
                textView32.setTypeface(gm.o());
                textView32.setOnClickListener(new View.OnClickListener() { // from class: bw5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final ew5 ew5Var = ew5.this;
                        TLRPC.Chat chat5 = ew5Var.p1;
                        final byte b2 = 0;
                        gm.d3(new Runnable() { // from class: cw5
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b22 = b2;
                                ew5 ew5Var2 = ew5Var;
                                switch (b22) {
                                    case 0:
                                        if (!ew5Var2.J) {
                                            ew5Var2.q1.setVisibility(4);
                                            ew5Var2.r1.setVisibility(0);
                                            break;
                                        }
                                        break;
                                    default:
                                        ew5Var2.dismiss();
                                        break;
                                }
                            }
                        }, 400L);
                        TLRPC.ChatInvite chatInvite82 = ew5Var.o1;
                        boolean z7 = z4;
                        if (chatInvite82 != null || chat5 == null) {
                            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                            tL_messages_importChatInvite.hash = ew5Var.m1;
                            ConnectionsManager.getInstance(ew5Var.a).sendRequest(tL_messages_importChatInvite, new j87(ew5Var, j, z7, tL_messages_importChatInvite), 2);
                        } else {
                            final byte b22 = 1;
                            oc7.r1(ew5Var.a).k(chat5.id, z8c.h(ew5Var.a).f(), null, null, true, new Runnable() { // from class: cw5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b222 = b22;
                                    ew5 ew5Var2 = ew5Var;
                                    switch (b222) {
                                        case 0:
                                            if (!ew5Var2.J) {
                                                ew5Var2.q1.setVisibility(4);
                                                ew5Var2.r1.setVisibility(0);
                                                break;
                                            }
                                            break;
                                        default:
                                            ew5Var2.dismiss();
                                            break;
                                    }
                                }
                            }, new s51((byte) 8, ew5Var, z7));
                        }
                    }
                });
                frameLayout22.addView(textView32, qoe.t(-1, 48, 8388611, 14, 0, 14, 0));
                TextView textView42 = new TextView(getContext());
                textView42.setGravity(17);
                textView42.setTextSize(1, 14.0f);
                textView42.setText(jb6.M0(z4 ? 2131745905 : 2131745901, null));
                anb.X(textView42, i42, ylbVar);
                linearLayout.addView(textView42, qoe.t(-1, -2, 48, 24, 17, 24, 15));
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
        imageView2.setBackground(cmb.f0(cmb.v0(cmb.h6, this.J0), 1, -1));
        anb.s(imageView2, cmb.zj, ylbVar, PorterDuff.Mode.SRC_ATOP);
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new ca5(this, (byte) 16));
        int L4 = gm.L(8.0f);
        imageView2.setPadding(L4, L4, L4, L4);
        frameLayout3.addView(imageView2, qoe.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        bf0 bf0Var2 = new bf0(context);
        bf0Var2.setRoundRadius(gm.L(45.0f));
        linearLayout2.addView(bf0Var2, qoe.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.o1;
        if (chatInvite == null) {
        }
        lka lkaVar2 = new lka(context);
        lkaVar2.setTypeface(gm.o());
        lkaVar2.setTextSize(20);
        int i32 = cmb.i5;
        anb.W(lkaVar2, i32, ylbVar);
        lkaVar2.l(str4, false);
        lkaVar2.setGravity(17);
        linearLayout2.addView(lkaVar2, qoe.t(-2, -2, 49, 10, 10, 10, i <= 0 ? 0 : 20));
        if (!z) {
        }
        lkaVar2.i(hs9Var);
        TLRPC.ChatInvite chatInvite722 = this.o1;
        if (chatInvite722 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView textView72 = new TextView(context);
        textView72.setTextSize(1, 13.0f);
        int i422 = cmb.q5;
        anb.X(textView72, i422, ylbVar);
        textView72.setSingleLine(true);
        TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
        textView72.setEllipsize(truncateAt22);
        if (z4) {
        }
        textView72.setText(lowerCase);
        linearLayout2.addView(textView72, qoe.t(-2, -2, 49, 10, 0, 10, !isEmpty ? 0 : i2));
        if (!isEmpty) {
        }
        chatInvite2 = this.o1;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout222 = new FrameLayout(getContext());
        linearLayout2.addView(frameLayout222, qoe.o(-1, -2));
        RadialProgressView radialProgressView22 = new RadialProgressView(getContext(), ylbVar);
        this.r1 = radialProgressView22;
        int i522 = cmb.Ei;
        radialProgressView22.setProgressColorKey(i522);
        radialProgressView22.setSize(gm.L(32.0f));
        radialProgressView22.setVisibility(4);
        frameLayout222.addView(radialProgressView22, qoe.e(48, 48, 17));
        TextView textView322 = new TextView(getContext());
        this.q1 = textView322;
        int L222 = gm.L(24.0f);
        int v052 = cmb.v0(i522, this.J0);
        int i622 = cmb.Gi;
        int v0222 = cmb.v0(i622, this.J0);
        fg0 i032 = cmb.i0(L222, L222, L222, L222, v052, v0222, v0222);
        wmb M52 = anb.M(i522);
        wmb M222 = anb.M(i622);
        textView322.setBackground(i032);
        anb.j(textView322, i032, M52, M222, ylbVar);
        textView322.setEllipsize(truncateAt22);
        textView322.setGravity(17);
        textView322.setSingleLine(true);
        textView322.setText(jb6.M0(z4 ? 2131745907 : 2131745903, null));
        anb.X(textView322, cmb.Ii, ylbVar);
        textView322.setTextSize(1, 14.0f);
        textView322.setTypeface(gm.o());
        textView322.setOnClickListener(new View.OnClickListener() { // from class: bw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ew5 ew5Var = ew5.this;
                TLRPC.Chat chat52 = ew5Var.p1;
                final byte b2 = 0;
                gm.d3(new Runnable() { // from class: cw5
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b222 = b2;
                        ew5 ew5Var2 = ew5Var;
                        switch (b222) {
                            case 0:
                                if (!ew5Var2.J) {
                                    ew5Var2.q1.setVisibility(4);
                                    ew5Var2.r1.setVisibility(0);
                                    break;
                                }
                                break;
                            default:
                                ew5Var2.dismiss();
                                break;
                        }
                    }
                }, 400L);
                TLRPC.ChatInvite chatInvite82 = ew5Var.o1;
                boolean z7 = z4;
                if (chatInvite82 != null || chat52 == null) {
                    TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                    tL_messages_importChatInvite.hash = ew5Var.m1;
                    ConnectionsManager.getInstance(ew5Var.a).sendRequest(tL_messages_importChatInvite, new j87(ew5Var, j, z7, tL_messages_importChatInvite), 2);
                } else {
                    final byte b22 = 1;
                    oc7.r1(ew5Var.a).k(chat52.id, z8c.h(ew5Var.a).f(), null, null, true, new Runnable() { // from class: cw5
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b222 = b22;
                            ew5 ew5Var2 = ew5Var;
                            switch (b222) {
                                case 0:
                                    if (!ew5Var2.J) {
                                        ew5Var2.q1.setVisibility(4);
                                        ew5Var2.r1.setVisibility(0);
                                        break;
                                    }
                                    break;
                                default:
                                    ew5Var2.dismiss();
                                    break;
                            }
                        }
                    }, new s51((byte) 8, ew5Var, z7));
                }
            }
        });
        frameLayout222.addView(textView322, qoe.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView422 = new TextView(getContext());
        textView422.setGravity(17);
        textView422.setTextSize(1, 14.0f);
        textView422.setText(jb6.M0(z4 ? 2131745905 : 2131745901, null));
        anb.X(textView422, i422, ylbVar);
        linearLayout2.addView(textView422, qoe.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static CharSequence D0(TextView textView, TLRPC.ChatInvite chatInvite, int i) {
        String str = chatInvite.participants.get(i).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), gm.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void E0(Context context, d dVar, c41 c41Var, boolean z) {
        if (context == null) {
            if (dVar != null) {
                dVar.getContext();
                return;
            }
            return;
        }
        if (c41Var == null) {
            c41Var = c41.b0(dVar);
        }
        r31 r31Var = new r31(context, dVar.getResourceProvider());
        r31Var.a.f(R.raw.timer_3, 28, 28, null);
        r31Var.b.setText(jb6.M0(2131745894, null));
        r31Var.c.setText(z ? jb6.M0(2131745904, null) : jb6.M0(2131745900, null));
        c41Var.b(r31Var, 2750).j();
    }

    @Override // my0
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.H0 != this.l1 || (v0 = cmb.v0(cmb.c6, this.J0)) == this.H0) {
                return;
            }
            K(v0);
            this.l1 = this.H0;
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
