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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b70 extends org.telegram.ui.ActionBar.v2 {
    public static final /* synthetic */ int q1 = 0;
    public int i1;
    public final String j1;
    public final org.telegram.ui.ActionBar.f2 k1;
    public final TLRPC.ChatInvite l1;
    public final TLRPC.Chat m1;
    public final TextView n1;
    public final RadialProgressView o1;
    public hc p1;

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
    public b70(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        String str2;
        final long j3;
        long j10;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        String str3;
        String str4;
        org.telegram.ui.ActionBar.k5 k5Var;
        final boolean z12;
        boolean isEmpty;
        int i10;
        String lowerCase;
        TLRPC.ChatInvite chatInvite2;
        float f10;
        boolean z13;
        boolean z14;
        String format;
        String str5;
        this.v0 = false;
        this.u0 = false;
        P(org.telegram.ui.ActionBar.k6.d6);
        this.i1 = this.G0;
        this.k1 = f2Var;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite3 = (TLRPC.ChatInvite) tLObject;
            this.l1 = chatInvite3;
            TLRPC.Chat chat = chatInvite3.chat;
            j10 = chat != null ? -chat.id : 0L;
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = str;
                j3 = 0;
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
                imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.I0), 1, -1));
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.xj, f6Var, PorterDuff.Mode.SRC_ATOP);
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new h0(this, 29));
                int L = org.telegram.messenger.g0.L(8.0f);
                imageView.setPadding(L, L, L, L);
                frameLayout.addView(imageView, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                l9 l9Var = new l9(context);
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
                linearLayout.addView(l9Var, c8.ha.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.l1;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        w8 w8Var = new w8(this.l1.chat);
                        TLRPC.ChatInvite chatInvite4 = this.l1;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        str5 = chat2.title;
                        i7 = chat2.participants_count;
                        l9Var.a.i0(chat2, w8Var, chatInvite4);
                        l9Var.d();
                    } else {
                        w8 w8Var2 = new w8((org.telegram.ui.ActionBar.f6) null);
                        w8Var2.k(0L, this.l1.title, null, null);
                        TLRPC.ChatInvite chatInvite5 = this.l1;
                        String str6 = chatInvite5.title;
                        i7 = chatInvite5.participants_count;
                        l9Var.j(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(chatInvite5.photo.sizes, 50, false, null, false), this.l1.photo), "50_50", w8Var2, this.l1);
                        str5 = str6;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.l1;
                    str3 = chatInvite6.about;
                    z10 = chatInvite6.verified;
                    z11 = chatInvite6.fake;
                    z9 = chatInvite6.scam;
                    str4 = str5;
                } else if (this.m1 != null) {
                    w8 w8Var3 = new w8(this.m1);
                    String str7 = this.m1.title;
                    TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.a).N0(this.m1.id);
                    String str8 = N0 != null ? N0.about : null;
                    i7 = Math.max(this.m1.participants_count, N0 != null ? N0.participants_count : 0);
                    TLRPC.Chat chat3 = this.m1;
                    l9Var.a.i0(chat3, w8Var3, chat3);
                    l9Var.d();
                    TLRPC.Chat chat4 = this.m1;
                    boolean z15 = chat4.verified;
                    z11 = chat4.fake;
                    z9 = chat4.scam;
                    z10 = z15;
                    str3 = str8;
                    str4 = str7;
                } else {
                    z9 = false;
                    z10 = false;
                    z11 = false;
                    i7 = 0;
                    str3 = null;
                    str4 = null;
                }
                k5Var = new org.telegram.ui.ActionBar.k5(context);
                k5Var.setTypeface(org.telegram.messenger.g0.o());
                k5Var.setTextSize(20);
                int i11 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.Y(k5Var, i11, f6Var);
                k5Var.l(str4, false);
                k5Var.setGravity(17);
                linearLayout.addView(k5Var, c8.ha.t(-2, -2, 49, 10, 10, 10, i7 <= 0 ? 0 : 20));
                if (!z9 || z11) {
                    k5Var.i(!z9 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
                } else if (z10) {
                    k5Var.i(new xp(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.l1;
                z12 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || org.telegram.messenger.t3.V(chatInvite7.chat))) || (org.telegram.messenger.t3.T(this.m1) && !this.m1.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 13.0f);
                int i12 = org.telegram.ui.ActionBar.k6.r5;
                org.telegram.ui.ActionBar.r6.V(g10, i12, f6Var);
                g10.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g10.setEllipsize(truncateAt);
                if (z12) {
                    i10 = 20;
                    lowerCase = org.telegram.messenger.hd.M0(2131748640, null).toLowerCase();
                } else {
                    lowerCase = org.telegram.messenger.hd.M0(2131752329, null).toLowerCase();
                    i10 = 20;
                }
                g10.setText(lowerCase);
                linearLayout.addView(g10, c8.ha.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : i10));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    org.telegram.ui.ActionBar.r6.V(textView, i11, f6Var);
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, c8.ha.t(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.l1;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, c8.ha.o(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), f6Var);
                    this.o1 = radialProgressView;
                    int i13 = org.telegram.ui.ActionBar.k6.Ci;
                    radialProgressView.setProgressColorKey(i13);
                    radialProgressView.setSize(org.telegram.messenger.g0.L(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, c8.ha.e(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.n1 = textView2;
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i13, this.I0);
                    int i14 = org.telegram.ui.ActionBar.k6.Ei;
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i14, this.I0);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, w02, w03, w03);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.r6.k(textView2, k02, N, N2, f6Var);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(org.telegram.messenger.hd.M0(!z12 ? 2131746175 : 2131746171, null));
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, f6Var);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.y60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final b70 b70Var = b70.this;
                            TLRPC.Chat chat5 = b70Var.m1;
                            final int i15 = 0;
                            org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.Components.z60
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            b70 b70Var2 = b70Var;
                                            if (!b70Var2.I) {
                                                b70Var2.n1.setVisibility(4);
                                                b70Var2.o1.setVisibility(0);
                                                break;
                                            }
                                            break;
                                        default:
                                            b70Var.dismiss();
                                            break;
                                    }
                                }
                            }, 400L);
                            TLRPC.ChatInvite chatInvite8 = b70Var.l1;
                            boolean z16 = z12;
                            if (chatInvite8 != null || chat5 == null) {
                                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                tL_messages_importChatInvite.hash = b70Var.j1;
                                ConnectionsManager.getInstance(b70Var.a).sendRequest(tL_messages_importChatInvite, new bi.m(b70Var, j3, z16, tL_messages_importChatInvite), 2);
                            } else {
                                final int i16 = 1;
                                org.telegram.messenger.qp.s1(b70Var.a).m(chat5.id, org.telegram.messenger.p10.i(b70Var.a).f(), 0, null, null, true, new Runnable() { // from class: org.telegram.ui.Components.z60
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                b70 b70Var2 = b70Var;
                                                if (!b70Var2.I) {
                                                    b70Var2.n1.setVisibility(4);
                                                    b70Var2.o1.setVisibility(0);
                                                    break;
                                                }
                                                break;
                                            default:
                                                b70Var.dismiss();
                                                break;
                                        }
                                    }
                                }, new ab.y(6, b70Var, z16), null);
                            }
                        }
                    });
                    frameLayout2.addView(textView2, c8.ha.t(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(org.telegram.messenger.hd.M0(!z12 ? 2131746173 : 2131746169, null));
                    org.telegram.ui.ActionBar.r6.V(textView3, i12, f6Var);
                    linearLayout.addView(textView3, c8.ha.t(-1, -2, 48, 24, 17, 24, 15));
                }
                if (chatInvite2.participants.isEmpty()) {
                    f10 = 24.0f;
                    z13 = false;
                } else {
                    int min = Math.min(this.l1.participants.size(), 3);
                    z8 z8Var = new z8(context, false);
                    z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
                    float f11 = 38;
                    z8Var.setSize(org.telegram.messenger.g0.L(f11));
                    z8Var.setCount(min);
                    z8Var.setStepFactor(0.65f);
                    for (int i15 = 0; i15 < min; i15++) {
                        z8Var.b(i15, org.telegram.messenger.p10.s0, this.l1.participants.get(i15));
                    }
                    f10 = 24.0f;
                    z8Var.a(false);
                    linearLayout.addView(z8Var, c8.ha.t((int) ((((0.65f * f11) + 1.0f) * (min - 1)) + f11), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.r5, f6Var);
                    textView4.setGravity(17);
                    if (min == 1) {
                        z14 = false;
                        format = I0(textView4, this.l1, 0).toString();
                    } else {
                        z14 = false;
                        if (min == 2) {
                            format = org.telegram.messenger.hd.a0("RequestToJoinMembersTwo", null, 2131746163, I0(textView4, this.l1, 0), I0(textView4, this.l1, 1));
                        } else {
                            if (i7 == 3) {
                                format = org.telegram.messenger.hd.a0("RequestToJoinMembersThree", null, 2131746164, I0(textView4, this.l1, 0), I0(textView4, this.l1, 1), I0(textView4, this.l1, 2));
                                z13 = false;
                            } else {
                                int max = Math.max(i7 - min, 2);
                                z13 = false;
                                format = String.format(org.telegram.messenger.hd.K0(max, "RequestToJoinMembersAll"), I0(textView4, this.l1, 0), I0(textView4, this.l1, 1), Integer.valueOf(max));
                            }
                            textView4.setText(format);
                            linearLayout.addView(textView4, c8.ha.t(-2, -2, 49, 10, 0, 10, 24));
                        }
                    }
                    z13 = z14;
                    textView4.setText(format);
                    linearLayout.addView(textView4, c8.ha.t(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.l1;
                boolean z16 = ((!chatInvite8.channel || chatInvite8.megagroup) && (!org.telegram.messenger.t3.T(chatInvite8.chat) || this.l1.chat.megagroup)) ? z13 : true;
                TextView textView5 = new TextView(getContext());
                int L3 = org.telegram.messenger.g0.L(f10);
                int i16 = org.telegram.ui.ActionBar.k6.Ci;
                int w04 = org.telegram.ui.ActionBar.k6.w0(i16, this.I0);
                int i17 = org.telegram.ui.ActionBar.k6.Ei;
                int w05 = org.telegram.ui.ActionBar.k6.w0(i17, this.I0);
                org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, w04, w05, w05);
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i17);
                textView5.setBackground(k03);
                org.telegram.ui.ActionBar.r6.k(textView5, k03, N3, N4, f6Var);
                c8.ka.b(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                int i18 = 1;
                textView5.setSingleLine(true);
                textView5.setText(org.telegram.messenger.hd.M0(z16 ? 2131746661 : 2131746660, null));
                org.telegram.messenger.k5.n(textView5, org.telegram.ui.ActionBar.k6.Gi, f6Var, 1, 14.0f);
                linearLayout.addView(textView5, c8.ha.t(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new di.u1(this, j3, i18));
                return;
            }
            TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
            this.m1 = chat5;
            j10 = chat5.id;
        }
        str2 = str;
        j3 = j10;
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
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.I0), 1, -1));
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.xj, f6Var, PorterDuff.Mode.SRC_ATOP);
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new h0(this, 29));
        int L4 = org.telegram.messenger.g0.L(8.0f);
        imageView2.setPadding(L4, L4, L4, L4);
        frameLayout3.addView(imageView2, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        l9 l9Var2 = new l9(context);
        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        linearLayout.addView(l9Var2, c8.ha.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.l1;
        if (chatInvite == null) {
        }
        k5Var = new org.telegram.ui.ActionBar.k5(context);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(20);
        int i112 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i112, f6Var);
        k5Var.l(str4, false);
        k5Var.setGravity(17);
        linearLayout.addView(k5Var, c8.ha.t(-2, -2, 49, 10, 10, 10, i7 <= 0 ? 0 : 20));
        if (z9) {
        }
        k5Var.i(!z9 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
        TLRPC.ChatInvite chatInvite72 = this.l1;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView g102 = org.telegram.messenger.k5.g(context, 1, 13.0f);
        int i122 = org.telegram.ui.ActionBar.k6.r5;
        org.telegram.ui.ActionBar.r6.V(g102, i122, f6Var);
        g102.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        g102.setEllipsize(truncateAt2);
        if (z12) {
        }
        g102.setText(lowerCase);
        linearLayout.addView(g102, c8.ha.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : i10));
        if (!isEmpty) {
        }
        chatInvite2 = this.l1;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, c8.ha.o(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), f6Var);
        this.o1 = radialProgressView2;
        int i132 = org.telegram.ui.ActionBar.k6.Ci;
        radialProgressView2.setProgressColorKey(i132);
        radialProgressView2.setSize(org.telegram.messenger.g0.L(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, c8.ha.e(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.n1 = textView22;
        int L22 = org.telegram.messenger.g0.L(24.0f);
        int w022 = org.telegram.ui.ActionBar.k6.w0(i132, this.I0);
        int i142 = org.telegram.ui.ActionBar.k6.Ei;
        int w032 = org.telegram.ui.ActionBar.k6.w0(i142, this.I0);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.k6.k0(L22, L22, L22, L22, w022, w032, w032);
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i132);
        org.telegram.ui.ActionBar.n6 N22 = org.telegram.ui.ActionBar.r6.N(i142);
        textView22.setBackground(k022);
        org.telegram.ui.ActionBar.r6.k(textView22, k022, N5, N22, f6Var);
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(org.telegram.messenger.hd.M0(!z12 ? 2131746175 : 2131746171, null));
        org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(org.telegram.messenger.g0.o());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.y60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final b70 b70Var = b70.this;
                TLRPC.Chat chat52 = b70Var.m1;
                final int i152 = 0;
                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.Components.z60
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i152) {
                            case 0:
                                b70 b70Var2 = b70Var;
                                if (!b70Var2.I) {
                                    b70Var2.n1.setVisibility(4);
                                    b70Var2.o1.setVisibility(0);
                                    break;
                                }
                                break;
                            default:
                                b70Var.dismiss();
                                break;
                        }
                    }
                }, 400L);
                TLRPC.ChatInvite chatInvite82 = b70Var.l1;
                boolean z162 = z12;
                if (chatInvite82 != null || chat52 == null) {
                    TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                    tL_messages_importChatInvite.hash = b70Var.j1;
                    ConnectionsManager.getInstance(b70Var.a).sendRequest(tL_messages_importChatInvite, new bi.m(b70Var, j3, z162, tL_messages_importChatInvite), 2);
                } else {
                    final int i162 = 1;
                    org.telegram.messenger.qp.s1(b70Var.a).m(chat52.id, org.telegram.messenger.p10.i(b70Var.a).f(), 0, null, null, true, new Runnable() { // from class: org.telegram.ui.Components.z60
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i162) {
                                case 0:
                                    b70 b70Var2 = b70Var;
                                    if (!b70Var2.I) {
                                        b70Var2.n1.setVisibility(4);
                                        b70Var2.o1.setVisibility(0);
                                        break;
                                    }
                                    break;
                                default:
                                    b70Var.dismiss();
                                    break;
                            }
                        }
                    }, new ab.y(6, b70Var, z162), null);
                }
            }
        });
        frameLayout22.addView(textView22, c8.ha.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(org.telegram.messenger.hd.M0(!z12 ? 2131746173 : 2131746169, null));
        org.telegram.ui.ActionBar.r6.V(textView32, i122, f6Var);
        linearLayout.addView(textView32, c8.ha.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static CharSequence I0(TextView textView, TLRPC.ChatInvite chatInvite, int i7) {
        String str = chatInvite.participants.get(i7).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.g0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void J0(Context context, org.telegram.ui.ActionBar.f2 f2Var, hc hcVar, boolean z9) {
        if (context == null) {
            if (f2Var != null) {
                f2Var.getContext();
                return;
            }
            return;
        }
        if (hcVar == null) {
            hcVar = hc.a0(f2Var);
        }
        zb zbVar = new zb(context, f2Var.getResourceProvider());
        zbVar.a.f(R.raw.timer_3, 28, 28, null);
        zbVar.b.setText(org.telegram.messenger.hd.M0(2131746162, null));
        zbVar.c.setText(z9 ? org.telegram.messenger.hd.M0(2131746172, null) : org.telegram.messenger.hd.M0(2131746168, null));
        hcVar.b(zbVar, 2750).j();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 != this.i1 || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.I0)) == this.G0) {
                return;
            }
            O(w02);
            this.i1 = this.G0;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
