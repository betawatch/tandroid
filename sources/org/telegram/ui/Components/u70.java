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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u70 extends org.telegram.ui.ActionBar.z2 {
    public static final /* synthetic */ int q1 = 0;
    public int i1;
    public final String j1;
    public final org.telegram.ui.ActionBar.k2 k1;
    public final TLRPC.ChatInvite l1;
    public final TLRPC.Chat m1;
    public final TextView n1;
    public final RadialProgressView o1;
    public cc p1;

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u70(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        String str2;
        final long j10;
        long j11;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        String str3;
        String str4;
        org.telegram.ui.ActionBar.u5 u5Var;
        final boolean z13;
        boolean isEmpty;
        int i11;
        String lowerCase;
        TLRPC.ChatInvite chatInvite2;
        float f7;
        boolean z14;
        boolean z15;
        String format;
        String str5;
        this.v0 = false;
        this.u0 = false;
        Q(org.telegram.ui.ActionBar.t6.d6);
        this.i1 = this.G0;
        this.k1 = k2Var;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite3 = (TLRPC.ChatInvite) tLObject;
            this.l1 = chatInvite3;
            TLRPC.Chat chat = chatInvite3.chat;
            j11 = chat != null ? -chat.id : 0L;
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = str;
                j10 = 0;
                this.j1 = str2;
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClickable(true);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(linearLayout);
                NestedScrollView nestedScrollView = new NestedScrollView(context);
                nestedScrollView.addView(frameLayout);
                this.N = nestedScrollView;
                ImageView imageView = new ImageView(context);
                imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.I0), 1, -1));
                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.xj, p6Var, PorterDuff.Mode.SRC_ATOP);
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new h0(this, 29));
                int L = org.telegram.messenger.i0.L(8.0f);
                imageView.setPadding(L, L, L, L);
                frameLayout.addView(imageView, w7.b6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                g9 g9Var = new g9(context);
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(45.0f));
                linearLayout.addView(g9Var, w7.b6.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.l1;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        r8 r8Var = new r8(this.l1.chat);
                        TLRPC.ChatInvite chatInvite4 = this.l1;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        str5 = chat2.title;
                        i10 = chat2.participants_count;
                        g9Var.a.i0(chat2, r8Var, chatInvite4);
                        g9Var.d();
                    } else {
                        r8 r8Var2 = new r8((org.telegram.ui.ActionBar.p6) null);
                        r8Var2.k(0L, this.l1.title, null, null);
                        TLRPC.ChatInvite chatInvite5 = this.l1;
                        String str6 = chatInvite5.title;
                        i10 = chatInvite5.participants_count;
                        g9Var.j(org.telegram.messenger.ic.i(org.telegram.messenger.b8.w(chatInvite5.photo.sizes, 50, false, null, false), this.l1.photo), "50_50", r8Var2, this.l1);
                        str5 = str6;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.l1;
                    str3 = chatInvite6.about;
                    z11 = chatInvite6.verified;
                    z12 = chatInvite6.fake;
                    z10 = chatInvite6.scam;
                    str4 = str5;
                } else if (this.m1 != null) {
                    r8 r8Var3 = new r8(this.m1);
                    String str7 = this.m1.title;
                    TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(this.a).M0(this.m1.id);
                    String str8 = M0 != null ? M0.about : null;
                    i10 = Math.max(this.m1.participants_count, M0 != null ? M0.participants_count : 0);
                    TLRPC.Chat chat3 = this.m1;
                    g9Var.a.i0(chat3, r8Var3, chat3);
                    g9Var.d();
                    TLRPC.Chat chat4 = this.m1;
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
                    i10 = 0;
                    str3 = null;
                    str4 = null;
                }
                u5Var = new org.telegram.ui.ActionBar.u5(context);
                u5Var.setTypeface(org.telegram.messenger.i0.o());
                u5Var.setTextSize(20);
                int i12 = org.telegram.ui.ActionBar.t6.j5;
                org.telegram.ui.ActionBar.a7.Y(u5Var, i12, p6Var);
                u5Var.l(str4, false);
                u5Var.setGravity(17);
                linearLayout.addView(u5Var, w7.b6.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
                if (!z10 || z12) {
                    u5Var.i(!z10 ? org.telegram.ui.ActionBar.t6.g1 : org.telegram.ui.ActionBar.t6.h1);
                } else if (z11) {
                    u5Var.i(new eq(org.telegram.ui.ActionBar.t6.f1, org.telegram.ui.ActionBar.t6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.l1;
                z13 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || org.telegram.messenger.w3.V(chatInvite7.chat))) || (org.telegram.messenger.w3.T(this.m1) && !this.m1.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView g10 = org.telegram.messenger.m5.g(context, 1, 13.0f);
                int i13 = org.telegram.ui.ActionBar.t6.r5;
                org.telegram.ui.ActionBar.a7.V(g10, i13, p6Var);
                g10.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g10.setEllipsize(truncateAt);
                if (z13) {
                    i11 = 20;
                    lowerCase = org.telegram.messenger.cd.L0(2131748656, null).toLowerCase();
                } else {
                    lowerCase = org.telegram.messenger.cd.L0(2131752329, null).toLowerCase();
                    i11 = 20;
                }
                g10.setText(lowerCase);
                linearLayout.addView(g10, w7.b6.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : i11));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    org.telegram.ui.ActionBar.a7.V(textView, i12, p6Var);
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, w7.b6.t(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.l1;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, w7.b6.o(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), p6Var);
                    this.o1 = radialProgressView;
                    int i14 = org.telegram.ui.ActionBar.t6.Ci;
                    radialProgressView.setProgressColorKey(i14);
                    radialProgressView.setSize(org.telegram.messenger.i0.L(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, w7.b6.e(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.n1 = textView2;
                    int L2 = org.telegram.messenger.i0.L(24.0f);
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i14, this.I0);
                    int i15 = org.telegram.ui.ActionBar.t6.Ei;
                    int w03 = org.telegram.ui.ActionBar.t6.w0(i15, this.I0);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, w02, w03, w03);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
                    org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.a7.k(textView2, k02, N, N2, p6Var);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(org.telegram.messenger.cd.L0(!z13 ? 2131746191 : 2131746187, null));
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Gi, p6Var);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.i0.o());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.p70
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final u70 u70Var = u70.this;
                            TLRPC.Chat chat5 = u70Var.m1;
                            final int i16 = 0;
                            org.telegram.messenger.i0.h3(new Runnable() { // from class: org.telegram.ui.Components.r70
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            u70 u70Var2 = u70Var;
                                            if (!u70Var2.I) {
                                                u70Var2.n1.setVisibility(4);
                                                u70Var2.o1.setVisibility(0);
                                                break;
                                            }
                                            break;
                                        default:
                                            u70Var.dismiss();
                                            break;
                                    }
                                }
                            }, 400L);
                            TLRPC.ChatInvite chatInvite8 = u70Var.l1;
                            boolean z17 = z13;
                            if (chatInvite8 != null || chat5 == null) {
                                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                tL_messages_importChatInvite.hash = u70Var.j1;
                                ConnectionsManager.getInstance(u70Var.a).sendRequest(tL_messages_importChatInvite, new s70(u70Var, j10, z17, tL_messages_importChatInvite), 2);
                            } else {
                                final int i17 = 1;
                                org.telegram.messenger.vp.r1(u70Var.a).m(chat5.id, org.telegram.messenger.d20.i(u70Var.a).f(), 0, null, null, true, new Runnable() { // from class: org.telegram.ui.Components.r70
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                u70 u70Var2 = u70Var;
                                                if (!u70Var2.I) {
                                                    u70Var2.n1.setVisibility(4);
                                                    u70Var2.o1.setVisibility(0);
                                                    break;
                                                }
                                                break;
                                            default:
                                                u70Var.dismiss();
                                                break;
                                        }
                                    }
                                }, new ag.w0(9, u70Var, z17), null);
                            }
                        }
                    });
                    frameLayout2.addView(textView2, w7.b6.t(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(org.telegram.messenger.cd.L0(!z13 ? 2131746189 : 2131746185, null));
                    org.telegram.ui.ActionBar.a7.V(textView3, i13, p6Var);
                    linearLayout.addView(textView3, w7.b6.t(-1, -2, 48, 24, 17, 24, 15));
                }
                if (chatInvite2.participants.isEmpty()) {
                    f7 = 24.0f;
                    z14 = false;
                } else {
                    int min = Math.min(this.l1.participants.size(), 3);
                    u8 u8Var = new u8(context, false);
                    u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(20.0f));
                    float f10 = 38;
                    u8Var.setSize(org.telegram.messenger.i0.L(f10));
                    u8Var.setCount(min);
                    u8Var.setStepFactor(0.65f);
                    for (int i16 = 0; i16 < min; i16++) {
                        u8Var.b(i16, org.telegram.messenger.d20.s0, this.l1.participants.get(i16));
                    }
                    f7 = 24.0f;
                    u8Var.a(false);
                    linearLayout.addView(u8Var, w7.b6.t((int) ((((0.65f * f10) + 1.0f) * (min - 1)) + f10), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.r5, p6Var);
                    textView4.setGravity(17);
                    if (min == 1) {
                        z15 = false;
                        format = I0(textView4, this.l1, 0).toString();
                    } else {
                        z15 = false;
                        if (min == 2) {
                            format = org.telegram.messenger.cd.a0("RequestToJoinMembersTwo", null, 2131746179, I0(textView4, this.l1, 0), I0(textView4, this.l1, 1));
                        } else {
                            if (i10 == 3) {
                                format = org.telegram.messenger.cd.a0("RequestToJoinMembersThree", null, 2131746180, I0(textView4, this.l1, 0), I0(textView4, this.l1, 1), I0(textView4, this.l1, 2));
                                z14 = false;
                            } else {
                                int max = Math.max(i10 - min, 2);
                                z14 = false;
                                format = String.format(org.telegram.messenger.cd.J0(max, "RequestToJoinMembersAll"), I0(textView4, this.l1, 0), I0(textView4, this.l1, 1), Integer.valueOf(max));
                            }
                            textView4.setText(format);
                            linearLayout.addView(textView4, w7.b6.t(-2, -2, 49, 10, 0, 10, 24));
                        }
                    }
                    z14 = z15;
                    textView4.setText(format);
                    linearLayout.addView(textView4, w7.b6.t(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.l1;
                boolean z17 = ((!chatInvite8.channel || chatInvite8.megagroup) && (!org.telegram.messenger.w3.T(chatInvite8.chat) || this.l1.chat.megagroup)) ? z14 : true;
                TextView textView5 = new TextView(getContext());
                int L3 = org.telegram.messenger.i0.L(f7);
                int i17 = org.telegram.ui.ActionBar.t6.Ci;
                int w04 = org.telegram.ui.ActionBar.t6.w0(i17, this.I0);
                int i18 = org.telegram.ui.ActionBar.t6.Ei;
                int w05 = org.telegram.ui.ActionBar.t6.w0(i18, this.I0);
                org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, w04, w05, w05);
                org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i17);
                org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i18);
                textView5.setBackground(k03);
                org.telegram.ui.ActionBar.a7.k(textView5, k03, N3, N4, p6Var);
                w7.e6.b(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                int i19 = 1;
                textView5.setSingleLine(true);
                textView5.setText(org.telegram.messenger.cd.L0(z17 ? 2131746677 : 2131746676, null));
                org.telegram.messenger.m5.m(textView5, org.telegram.ui.ActionBar.t6.Gi, p6Var, 1, 14.0f);
                linearLayout.addView(textView5, w7.b6.t(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new ih.p(this, j10, i19));
                return;
            }
            TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
            this.m1 = chat5;
            j11 = chat5.id;
        }
        str2 = str;
        j10 = j11;
        this.j1 = str2;
        linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView(linearLayout);
        NestedScrollView nestedScrollView2 = new NestedScrollView(context);
        nestedScrollView2.addView(frameLayout3);
        this.N = nestedScrollView2;
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.I0), 1, -1));
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.xj, p6Var, PorterDuff.Mode.SRC_ATOP);
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new h0(this, 29));
        int L4 = org.telegram.messenger.i0.L(8.0f);
        imageView2.setPadding(L4, L4, L4, L4);
        frameLayout3.addView(imageView2, w7.b6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        g9 g9Var2 = new g9(context);
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(45.0f));
        linearLayout.addView(g9Var2, w7.b6.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.l1;
        if (chatInvite == null) {
        }
        u5Var = new org.telegram.ui.ActionBar.u5(context);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(20);
        int i122 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i122, p6Var);
        u5Var.l(str4, false);
        u5Var.setGravity(17);
        linearLayout.addView(u5Var, w7.b6.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
        if (z10) {
        }
        u5Var.i(!z10 ? org.telegram.ui.ActionBar.t6.g1 : org.telegram.ui.ActionBar.t6.h1);
        TLRPC.ChatInvite chatInvite72 = this.l1;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView g102 = org.telegram.messenger.m5.g(context, 1, 13.0f);
        int i132 = org.telegram.ui.ActionBar.t6.r5;
        org.telegram.ui.ActionBar.a7.V(g102, i132, p6Var);
        g102.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        g102.setEllipsize(truncateAt2);
        if (z13) {
        }
        g102.setText(lowerCase);
        linearLayout.addView(g102, w7.b6.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : i11));
        if (!isEmpty) {
        }
        chatInvite2 = this.l1;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, w7.b6.o(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), p6Var);
        this.o1 = radialProgressView2;
        int i142 = org.telegram.ui.ActionBar.t6.Ci;
        radialProgressView2.setProgressColorKey(i142);
        radialProgressView2.setSize(org.telegram.messenger.i0.L(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, w7.b6.e(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.n1 = textView22;
        int L22 = org.telegram.messenger.i0.L(24.0f);
        int w022 = org.telegram.ui.ActionBar.t6.w0(i142, this.I0);
        int i152 = org.telegram.ui.ActionBar.t6.Ei;
        int w032 = org.telegram.ui.ActionBar.t6.w0(i152, this.I0);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.t6.k0(L22, L22, L22, L22, w022, w032, w032);
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i142);
        org.telegram.ui.ActionBar.w6 N22 = org.telegram.ui.ActionBar.a7.N(i152);
        textView22.setBackground(k022);
        org.telegram.ui.ActionBar.a7.k(textView22, k022, N5, N22, p6Var);
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(org.telegram.messenger.cd.L0(!z13 ? 2131746191 : 2131746187, null));
        org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(org.telegram.messenger.i0.o());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.p70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final u70 u70Var = u70.this;
                TLRPC.Chat chat52 = u70Var.m1;
                final int i162 = 0;
                org.telegram.messenger.i0.h3(new Runnable() { // from class: org.telegram.ui.Components.r70
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i162) {
                            case 0:
                                u70 u70Var2 = u70Var;
                                if (!u70Var2.I) {
                                    u70Var2.n1.setVisibility(4);
                                    u70Var2.o1.setVisibility(0);
                                    break;
                                }
                                break;
                            default:
                                u70Var.dismiss();
                                break;
                        }
                    }
                }, 400L);
                TLRPC.ChatInvite chatInvite82 = u70Var.l1;
                boolean z172 = z13;
                if (chatInvite82 != null || chat52 == null) {
                    TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                    tL_messages_importChatInvite.hash = u70Var.j1;
                    ConnectionsManager.getInstance(u70Var.a).sendRequest(tL_messages_importChatInvite, new s70(u70Var, j10, z172, tL_messages_importChatInvite), 2);
                } else {
                    final int i172 = 1;
                    org.telegram.messenger.vp.r1(u70Var.a).m(chat52.id, org.telegram.messenger.d20.i(u70Var.a).f(), 0, null, null, true, new Runnable() { // from class: org.telegram.ui.Components.r70
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i172) {
                                case 0:
                                    u70 u70Var2 = u70Var;
                                    if (!u70Var2.I) {
                                        u70Var2.n1.setVisibility(4);
                                        u70Var2.o1.setVisibility(0);
                                        break;
                                    }
                                    break;
                                default:
                                    u70Var.dismiss();
                                    break;
                            }
                        }
                    }, new ag.w0(9, u70Var, z172), null);
                }
            }
        });
        frameLayout22.addView(textView22, w7.b6.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(org.telegram.messenger.cd.L0(!z13 ? 2131746189 : 2131746185, null));
        org.telegram.ui.ActionBar.a7.V(textView32, i132, p6Var);
        linearLayout.addView(textView32, w7.b6.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static CharSequence I0(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.i0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void J0(Context context, org.telegram.ui.ActionBar.k2 k2Var, cc ccVar, boolean z10) {
        if (context == null) {
            if (k2Var != null) {
                k2Var.getContext();
                return;
            }
            return;
        }
        if (ccVar == null) {
            ccVar = cc.a0(k2Var);
        }
        tb tbVar = new tb(context, k2Var.getResourceProvider());
        tbVar.a.f(R.raw.timer_3, 28, 28, null);
        tbVar.b.setText(org.telegram.messenger.cd.L0(2131746178, null));
        tbVar.c.setText(z10 ? org.telegram.messenger.cd.L0(2131746188, null) : org.telegram.messenger.cd.L0(2131746184, null));
        ccVar.b(tbVar, 2750).j();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 != this.i1 || (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.I0)) == this.G0) {
                return;
            }
            P(w02);
            this.i1 = this.G0;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
