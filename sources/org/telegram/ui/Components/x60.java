package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x60 extends org.telegram.ui.ActionBar.t2 {
    public static final /* synthetic */ int r1 = 0;
    public int j1;
    public final String k1;
    public final org.telegram.ui.ActionBar.d2 l1;
    public final TLRPC.ChatInvite m1;
    public final TLRPC.Chat n1;
    public final TextView o1;
    public final RadialProgressView p1;
    public fc q1;

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x60(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        String str2;
        final long j10;
        long j11;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        boolean z10;
        boolean z11;
        boolean z12;
        int i3;
        String str3;
        String str4;
        org.telegram.ui.ActionBar.k5 k5Var;
        final boolean z13;
        boolean isEmpty;
        int i10;
        String lowerCase;
        TLRPC.ChatInvite chatInvite2;
        float f10;
        boolean z14;
        boolean z15;
        String format;
        String str5;
        this.w0 = false;
        this.v0 = false;
        P(org.telegram.ui.ActionBar.k6.d6);
        this.j1 = this.H0;
        this.l1 = d2Var;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite3 = (TLRPC.ChatInvite) tLObject;
            this.m1 = chatInvite3;
            TLRPC.Chat chat = chatInvite3.chat;
            j11 = chat != null ? -chat.id : 0L;
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = str;
                j10 = 0;
                this.k1 = str2;
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClickable(true);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(linearLayout);
                NestedScrollView nestedScrollView = new NestedScrollView(context);
                nestedScrollView.addView(frameLayout);
                this.O = nestedScrollView;
                ImageView imageView = new ImageView(context);
                imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.J0), 1, -1));
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.xj, e6Var, PorterDuff.Mode.SRC_ATOP);
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new f0(this, 29));
                int L = org.telegram.messenger.g0.L(8.0f);
                imageView.setPadding(L, L, L, L);
                frameLayout.addView(imageView, b8.mf.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                k9 k9Var = new k9(context);
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
                linearLayout.addView(k9Var, b8.mf.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.m1;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        u8 u8Var = new u8(this.m1.chat);
                        TLRPC.ChatInvite chatInvite4 = this.m1;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        str5 = chat2.title;
                        i3 = chat2.participants_count;
                        k9Var.a.i0(chat2, u8Var, chatInvite4);
                        k9Var.d();
                    } else {
                        u8 u8Var2 = new u8((org.telegram.ui.ActionBar.e6) null);
                        u8Var2.k(0L, this.m1.title, null, null);
                        TLRPC.ChatInvite chatInvite5 = this.m1;
                        String str6 = chatInvite5.title;
                        i3 = chatInvite5.participants_count;
                        k9Var.j(org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(chatInvite5.photo.sizes, 50, false, null, false), this.m1.photo), "50_50", u8Var2, this.m1);
                        str5 = str6;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.m1;
                    str3 = chatInvite6.about;
                    z11 = chatInvite6.verified;
                    z12 = chatInvite6.fake;
                    z10 = chatInvite6.scam;
                    str4 = str5;
                } else if (this.n1 != null) {
                    u8 u8Var3 = new u8(this.n1);
                    String str7 = this.n1.title;
                    TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.a).N0(this.n1.id);
                    String str8 = N0 != null ? N0.about : null;
                    i3 = Math.max(this.n1.participants_count, N0 != null ? N0.participants_count : 0);
                    TLRPC.Chat chat3 = this.n1;
                    k9Var.a.i0(chat3, u8Var3, chat3);
                    k9Var.d();
                    TLRPC.Chat chat4 = this.n1;
                    boolean z16 = chat4.verified;
                    z12 = chat4.fake;
                    z10 = chat4.scam;
                    z11 = z16;
                    str3 = str8;
                    str4 = str7;
                } else {
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    i3 = 0;
                    str3 = null;
                    str4 = null;
                }
                k5Var = new org.telegram.ui.ActionBar.k5(context);
                k5Var.setTypeface(org.telegram.messenger.g0.o());
                k5Var.setTextSize(20);
                int i11 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.Y(k5Var, i11, e6Var);
                k5Var.l(str4, false);
                k5Var.setGravity(17);
                linearLayout.addView(k5Var, b8.mf.t(-2, -2, 49, 10, 10, 10, i3 <= 0 ? 0 : 20));
                if (!z10 || z12) {
                    k5Var.i(!z10 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
                } else if (z11) {
                    k5Var.i(new xp(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.m1;
                z13 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || org.telegram.messenger.t3.V(chatInvite7.chat))) || (org.telegram.messenger.t3.T(this.n1) && !this.n1.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView g7 = org.telegram.messenger.k5.g(context, 1, 13.0f);
                int i12 = org.telegram.ui.ActionBar.k6.r5;
                org.telegram.ui.ActionBar.r6.V(g7, i12, e6Var);
                g7.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g7.setEllipsize(truncateAt);
                if (z13) {
                    i10 = 20;
                    lowerCase = org.telegram.messenger.bd.M0(2131748649, null).toLowerCase();
                } else {
                    lowerCase = org.telegram.messenger.bd.M0(2131752329, null).toLowerCase();
                    i10 = 20;
                }
                g7.setText(lowerCase);
                linearLayout.addView(g7, b8.mf.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : i10));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, b8.mf.t(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.m1;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, b8.mf.o(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), e6Var);
                    this.p1 = radialProgressView;
                    int i13 = org.telegram.ui.ActionBar.k6.Ci;
                    radialProgressView.setProgressColorKey(i13);
                    radialProgressView.setSize(org.telegram.messenger.g0.L(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, b8.mf.e(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.o1 = textView2;
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i13, this.J0);
                    int i14 = org.telegram.ui.ActionBar.k6.Ei;
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i14, this.J0);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, w02, w03, w03);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.r6.k(textView2, k02, N, N2, e6Var);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(org.telegram.messenger.bd.M0(!z13 ? 2131746184 : 2131746180, null));
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, e6Var);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.t60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final x60 x60Var = x60.this;
                            TLRPC.Chat chat5 = x60Var.n1;
                            final int i15 = 0;
                            org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.Components.u60
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            x60 x60Var2 = x60Var;
                                            if (!x60Var2.J) {
                                                x60Var2.o1.setVisibility(4);
                                                x60Var2.p1.setVisibility(0);
                                                break;
                                            }
                                            break;
                                        default:
                                            x60Var.dismiss();
                                            break;
                                    }
                                }
                            }, 400L);
                            TLRPC.ChatInvite chatInvite8 = x60Var.m1;
                            boolean z17 = z13;
                            if (chatInvite8 != null || chat5 == null) {
                                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                tL_messages_importChatInvite.hash = x60Var.k1;
                                ConnectionsManager.getInstance(x60Var.a).sendRequest(tL_messages_importChatInvite, new ci.l(x60Var, j10, z17, tL_messages_importChatInvite), 2);
                            } else {
                                final int i16 = 1;
                                org.telegram.messenger.hp.s1(x60Var.a).m(chat5.id, org.telegram.messenger.h10.i(x60Var.a).f(), 0, null, null, true, new Runnable() { // from class: org.telegram.ui.Components.u60
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                x60 x60Var2 = x60Var;
                                                if (!x60Var2.J) {
                                                    x60Var2.o1.setVisibility(4);
                                                    x60Var2.p1.setVisibility(0);
                                                    break;
                                                }
                                                break;
                                            default:
                                                x60Var.dismiss();
                                                break;
                                        }
                                    }
                                }, new ei.f(9, x60Var, z17), null);
                            }
                        }
                    });
                    frameLayout2.addView(textView2, b8.mf.t(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(org.telegram.messenger.bd.M0(!z13 ? 2131746182 : 2131746178, null));
                    org.telegram.ui.ActionBar.r6.V(textView3, i12, e6Var);
                    linearLayout.addView(textView3, b8.mf.t(-1, -2, 48, 24, 17, 24, 15));
                }
                int i15 = 3;
                if (chatInvite2.participants.isEmpty()) {
                    f10 = 24.0f;
                    z14 = false;
                } else {
                    int min = Math.min(this.m1.participants.size(), 3);
                    x8 x8Var = new x8(context, false);
                    x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
                    float f11 = 38;
                    x8Var.setSize(org.telegram.messenger.g0.L(f11));
                    x8Var.setCount(min);
                    x8Var.setStepFactor(0.65f);
                    for (int i16 = 0; i16 < min; i16++) {
                        x8Var.b(i16, org.telegram.messenger.h10.t0, this.m1.participants.get(i16));
                    }
                    f10 = 24.0f;
                    x8Var.a(false);
                    linearLayout.addView(x8Var, b8.mf.t((int) ((((0.65f * f11) + 1.0f) * (min - 1)) + f11), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.r5, e6Var);
                    textView4.setGravity(17);
                    if (min == 1) {
                        z15 = false;
                        format = I0(textView4, this.m1, 0).toString();
                    } else {
                        z15 = false;
                        if (min == 2) {
                            format = org.telegram.messenger.bd.a0("RequestToJoinMembersTwo", null, 2131746172, I0(textView4, this.m1, 0), I0(textView4, this.m1, 1));
                        } else {
                            if (i3 == 3) {
                                format = org.telegram.messenger.bd.a0("RequestToJoinMembersThree", null, 2131746173, I0(textView4, this.m1, 0), I0(textView4, this.m1, 1), I0(textView4, this.m1, 2));
                                z14 = false;
                            } else {
                                int max = Math.max(i3 - min, 2);
                                z14 = false;
                                format = String.format(org.telegram.messenger.bd.K0(max, "RequestToJoinMembersAll"), I0(textView4, this.m1, 0), I0(textView4, this.m1, 1), Integer.valueOf(max));
                            }
                            textView4.setText(format);
                            linearLayout.addView(textView4, b8.mf.t(-2, -2, 49, 10, 0, 10, 24));
                        }
                    }
                    z14 = z15;
                    textView4.setText(format);
                    linearLayout.addView(textView4, b8.mf.t(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.m1;
                if ((chatInvite8.channel && !chatInvite8.megagroup) || (org.telegram.messenger.t3.T(chatInvite8.chat) && !this.m1.chat.megagroup)) {
                    z14 = true;
                }
                TextView textView5 = new TextView(getContext());
                int L3 = org.telegram.messenger.g0.L(f10);
                int i17 = org.telegram.ui.ActionBar.k6.Ci;
                int w04 = org.telegram.ui.ActionBar.k6.w0(i17, this.J0);
                int i18 = org.telegram.ui.ActionBar.k6.Ei;
                int w05 = org.telegram.ui.ActionBar.k6.w0(i18, this.J0);
                org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, w04, w05, w05);
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i17);
                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i18);
                textView5.setBackground(k03);
                org.telegram.ui.ActionBar.r6.k(textView5, k03, N3, N4, e6Var);
                b8.pf.b(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                textView5.setSingleLine(true);
                textView5.setText(org.telegram.messenger.bd.M0(z14 ? 2131746670 : 2131746669, null));
                org.telegram.messenger.k5.n(textView5, org.telegram.ui.ActionBar.k6.Gi, e6Var, 1, 14.0f);
                linearLayout.addView(textView5, b8.mf.t(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new ai.v(this, j10, i15));
                return;
            }
            TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
            this.n1 = chat5;
            j11 = chat5.id;
        }
        str2 = str;
        j10 = j11;
        this.k1 = str2;
        linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView(linearLayout);
        NestedScrollView nestedScrollView2 = new NestedScrollView(context);
        nestedScrollView2.addView(frameLayout3);
        this.O = nestedScrollView2;
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.J0), 1, -1));
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.xj, e6Var, PorterDuff.Mode.SRC_ATOP);
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new f0(this, 29));
        int L4 = org.telegram.messenger.g0.L(8.0f);
        imageView2.setPadding(L4, L4, L4, L4);
        frameLayout3.addView(imageView2, b8.mf.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        k9 k9Var2 = new k9(context);
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        linearLayout.addView(k9Var2, b8.mf.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.m1;
        if (chatInvite == null) {
        }
        k5Var = new org.telegram.ui.ActionBar.k5(context);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(20);
        int i112 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i112, e6Var);
        k5Var.l(str4, false);
        k5Var.setGravity(17);
        linearLayout.addView(k5Var, b8.mf.t(-2, -2, 49, 10, 10, 10, i3 <= 0 ? 0 : 20));
        if (z10) {
        }
        k5Var.i(!z10 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
        TLRPC.ChatInvite chatInvite72 = this.m1;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView g72 = org.telegram.messenger.k5.g(context, 1, 13.0f);
        int i122 = org.telegram.ui.ActionBar.k6.r5;
        org.telegram.ui.ActionBar.r6.V(g72, i122, e6Var);
        g72.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        g72.setEllipsize(truncateAt2);
        if (z13) {
        }
        g72.setText(lowerCase);
        linearLayout.addView(g72, b8.mf.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : i10));
        if (!isEmpty) {
        }
        chatInvite2 = this.m1;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, b8.mf.o(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), e6Var);
        this.p1 = radialProgressView2;
        int i132 = org.telegram.ui.ActionBar.k6.Ci;
        radialProgressView2.setProgressColorKey(i132);
        radialProgressView2.setSize(org.telegram.messenger.g0.L(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, b8.mf.e(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.o1 = textView22;
        int L22 = org.telegram.messenger.g0.L(24.0f);
        int w022 = org.telegram.ui.ActionBar.k6.w0(i132, this.J0);
        int i142 = org.telegram.ui.ActionBar.k6.Ei;
        int w032 = org.telegram.ui.ActionBar.k6.w0(i142, this.J0);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.k6.k0(L22, L22, L22, L22, w022, w032, w032);
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i132);
        org.telegram.ui.ActionBar.n6 N22 = org.telegram.ui.ActionBar.r6.N(i142);
        textView22.setBackground(k022);
        org.telegram.ui.ActionBar.r6.k(textView22, k022, N5, N22, e6Var);
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(org.telegram.messenger.bd.M0(!z13 ? 2131746184 : 2131746180, null));
        org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(org.telegram.messenger.g0.o());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.t60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final x60 x60Var = x60.this;
                TLRPC.Chat chat52 = x60Var.n1;
                final int i152 = 0;
                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.Components.u60
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i152) {
                            case 0:
                                x60 x60Var2 = x60Var;
                                if (!x60Var2.J) {
                                    x60Var2.o1.setVisibility(4);
                                    x60Var2.p1.setVisibility(0);
                                    break;
                                }
                                break;
                            default:
                                x60Var.dismiss();
                                break;
                        }
                    }
                }, 400L);
                TLRPC.ChatInvite chatInvite82 = x60Var.m1;
                boolean z17 = z13;
                if (chatInvite82 != null || chat52 == null) {
                    TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                    tL_messages_importChatInvite.hash = x60Var.k1;
                    ConnectionsManager.getInstance(x60Var.a).sendRequest(tL_messages_importChatInvite, new ci.l(x60Var, j10, z17, tL_messages_importChatInvite), 2);
                } else {
                    final int i162 = 1;
                    org.telegram.messenger.hp.s1(x60Var.a).m(chat52.id, org.telegram.messenger.h10.i(x60Var.a).f(), 0, null, null, true, new Runnable() { // from class: org.telegram.ui.Components.u60
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i162) {
                                case 0:
                                    x60 x60Var2 = x60Var;
                                    if (!x60Var2.J) {
                                        x60Var2.o1.setVisibility(4);
                                        x60Var2.p1.setVisibility(0);
                                        break;
                                    }
                                    break;
                                default:
                                    x60Var.dismiss();
                                    break;
                            }
                        }
                    }, new ei.f(9, x60Var, z17), null);
                }
            }
        });
        frameLayout22.addView(textView22, b8.mf.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(org.telegram.messenger.bd.M0(!z13 ? 2131746182 : 2131746178, null));
        org.telegram.ui.ActionBar.r6.V(textView32, i122, e6Var);
        linearLayout.addView(textView32, b8.mf.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static CharSequence I0(TextView textView, TLRPC.ChatInvite chatInvite, int i3) {
        String str = chatInvite.participants.get(i3).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.g0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void J0(Context context, org.telegram.ui.ActionBar.d2 d2Var, fc fcVar, boolean z10) {
        if (context == null) {
            if (d2Var != null) {
                d2Var.getContext();
                return;
            }
            return;
        }
        if (fcVar == null) {
            fcVar = fc.a0(d2Var);
        }
        xb xbVar = new xb(context, d2Var.getResourceProvider());
        xbVar.a.f(R.raw.timer_3, 28, 28, null);
        xbVar.b.setText(org.telegram.messenger.bd.M0(2131746171, null));
        xbVar.c.setText(z10 ? org.telegram.messenger.bd.M0(2131746181, null) : org.telegram.messenger.bd.M0(2131746177, null));
        fcVar.b(xbVar, 2750).j();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.H0 != this.j1 || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0)) == this.H0) {
                return;
            }
            O(w02);
            this.j1 = this.H0;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
