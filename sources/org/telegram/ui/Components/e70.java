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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e70 extends org.telegram.ui.ActionBar.u2 {
    public static final /* synthetic */ int u1 = 0;
    public int m1;
    public final String n1;
    public final org.telegram.ui.ActionBar.e2 o1;
    public final TLRPC.ChatInvite p1;
    public final TLRPC.Chat q1;
    public final TextView r1;
    public final RadialProgressView s1;
    public cc t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e70(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        String str2;
        final long j3;
        long j10;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        String str3;
        String str4;
        org.telegram.ui.ActionBar.j5 j5Var;
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
        int i11 = 0;
        this.w0 = false;
        this.v0 = false;
        Q(org.telegram.ui.ActionBar.j6.d6);
        this.m1 = this.H0;
        this.o1 = e2Var;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite3 = (TLRPC.ChatInvite) tLObject;
            this.p1 = chatInvite3;
            TLRPC.Chat chat = chatInvite3.chat;
            j10 = chat != null ? -chat.id : 0L;
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = str;
                j3 = 0;
                this.n1 = str2;
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClickable(true);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(linearLayout);
                NestedScrollView nestedScrollView = new NestedScrollView(context);
                nestedScrollView.addView(frameLayout);
                this.O = nestedScrollView;
                ImageView imageView = new ImageView(context);
                imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, this.J0), 1, -1));
                org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Aj, e6Var, PorterDuff.Mode.SRC_ATOP);
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new y60(this, i11));
                int L = org.telegram.messenger.g0.L(8.0f);
                imageView.setPadding(L, L, L, L);
                frameLayout.addView(imageView, c8.ja.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                i9 i9Var = new i9(context);
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
                linearLayout.addView(i9Var, c8.ja.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.p1;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        t8 t8Var = new t8(this.p1.chat);
                        TLRPC.ChatInvite chatInvite4 = this.p1;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        str5 = chat2.title;
                        i7 = chat2.participants_count;
                        i9Var.a.i0(chat2, t8Var, chatInvite4);
                        i9Var.e();
                    } else {
                        t8 t8Var2 = new t8((org.telegram.ui.ActionBar.e6) null);
                        t8Var2.k(0L, this.p1.title, null, null);
                        TLRPC.ChatInvite chatInvite5 = this.p1;
                        String str6 = chatInvite5.title;
                        i7 = chatInvite5.participants_count;
                        i9Var.j(org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(chatInvite5.photo.sizes, 50, false, null, false), this.p1.photo), "50_50", t8Var2, this.p1);
                        str5 = str6;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.p1;
                    str3 = chatInvite6.about;
                    z11 = chatInvite6.verified;
                    z12 = chatInvite6.fake;
                    z10 = chatInvite6.scam;
                    str4 = str5;
                } else if (this.q1 != null) {
                    t8 t8Var3 = new t8(this.q1);
                    String str7 = this.q1.title;
                    TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.a).N0(this.q1.id);
                    String str8 = N0 != null ? N0.about : null;
                    i7 = Math.max(this.q1.participants_count, N0 != null ? N0.participants_count : 0);
                    TLRPC.Chat chat3 = this.q1;
                    i9Var.a.i0(chat3, t8Var3, chat3);
                    i9Var.e();
                    TLRPC.Chat chat4 = this.q1;
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
                    i7 = 0;
                    str3 = null;
                    str4 = null;
                }
                j5Var = new org.telegram.ui.ActionBar.j5(context);
                j5Var.setTypeface(org.telegram.messenger.g0.o());
                j5Var.setTextSize(20);
                int i12 = org.telegram.ui.ActionBar.j6.j5;
                org.telegram.ui.ActionBar.q6.X(j5Var, i12, e6Var);
                j5Var.l(str4, false);
                j5Var.setGravity(17);
                linearLayout.addView(j5Var, c8.ja.t(-2, -2, 49, 10, 10, 10, i7 <= 0 ? 0 : 20));
                if (!z10 || z12) {
                    j5Var.i(!z10 ? org.telegram.ui.ActionBar.j6.g1 : org.telegram.ui.ActionBar.j6.h1);
                } else if (z11) {
                    j5Var.i(new fq(org.telegram.ui.ActionBar.j6.f1, org.telegram.ui.ActionBar.j6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.p1;
                z13 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || org.telegram.messenger.t3.V(chatInvite7.chat))) || (org.telegram.messenger.t3.T(this.q1) && !this.q1.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 13.0f);
                int i13 = org.telegram.ui.ActionBar.j6.r5;
                org.telegram.ui.ActionBar.q6.U(g10, i13, e6Var);
                g10.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g10.setEllipsize(truncateAt);
                if (z13) {
                    i10 = 20;
                    lowerCase = org.telegram.messenger.hd.M0(2131748641, null).toLowerCase();
                } else {
                    lowerCase = org.telegram.messenger.hd.M0(2131752329, null).toLowerCase();
                    i10 = 20;
                }
                g10.setText(lowerCase);
                linearLayout.addView(g10, c8.ja.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : i10));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    org.telegram.ui.ActionBar.q6.U(textView, i12, e6Var);
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, c8.ja.t(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.p1;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, c8.ja.o(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), e6Var);
                    this.s1 = radialProgressView;
                    int i14 = org.telegram.ui.ActionBar.j6.Fi;
                    radialProgressView.setProgressColorKey(i14);
                    radialProgressView.setSize(org.telegram.messenger.g0.L(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, c8.ja.e(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.r1 = textView2;
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i14, this.J0);
                    int i15 = org.telegram.ui.ActionBar.j6.Hi;
                    int w03 = org.telegram.ui.ActionBar.j6.w0(i15, this.J0);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, w02, w03, w03);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
                    org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i15);
                    textView2.setBackground(k02);
                    org.telegram.ui.ActionBar.q6.j(textView2, k02, M, M2, e6Var);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(org.telegram.messenger.hd.M0(!z13 ? 2131746174 : 2131746170, null));
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Ji, e6Var);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b70
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final e70 e70Var = e70.this;
                            TLRPC.Chat chat5 = e70Var.q1;
                            final int i16 = 0;
                            org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.Components.c70
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            e70 e70Var2 = e70Var;
                                            if (!e70Var2.J) {
                                                e70Var2.r1.setVisibility(4);
                                                e70Var2.s1.setVisibility(0);
                                                break;
                                            }
                                            break;
                                        default:
                                            e70Var.dismiss();
                                            break;
                                    }
                                }
                            }, 400L);
                            TLRPC.ChatInvite chatInvite8 = e70Var.p1;
                            boolean z17 = z13;
                            if (chatInvite8 != null || chat5 == null) {
                                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                tL_messages_importChatInvite.hash = e70Var.n1;
                                ConnectionsManager.getInstance(e70Var.a).sendRequest(tL_messages_importChatInvite, new di.k(e70Var, j3, z17, tL_messages_importChatInvite), 2);
                            } else {
                                final int i17 = 1;
                                org.telegram.messenger.np.s1(e70Var.a).m(chat5.id, org.telegram.messenger.m10.i(e70Var.a).f(), 0, null, null, true, new Runnable() { // from class: org.telegram.ui.Components.c70
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                e70 e70Var2 = e70Var;
                                                if (!e70Var2.J) {
                                                    e70Var2.r1.setVisibility(4);
                                                    e70Var2.s1.setVisibility(0);
                                                    break;
                                                }
                                                break;
                                            default:
                                                e70Var.dismiss();
                                                break;
                                        }
                                    }
                                }, new ab.z(6, e70Var, z17), null);
                            }
                        }
                    });
                    frameLayout2.addView(textView2, c8.ja.t(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(org.telegram.messenger.hd.M0(!z13 ? 2131746172 : 2131746168, null));
                    org.telegram.ui.ActionBar.q6.U(textView3, i13, e6Var);
                    linearLayout.addView(textView3, c8.ja.t(-1, -2, 48, 24, 17, 24, 15));
                }
                int i16 = 3;
                if (chatInvite2.participants.isEmpty()) {
                    f10 = 24.0f;
                    z14 = false;
                } else {
                    int min = Math.min(this.p1.participants.size(), 3);
                    w8 w8Var = new w8(context, false);
                    w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
                    float f11 = 38;
                    w8Var.setSize(org.telegram.messenger.g0.L(f11));
                    w8Var.setCount(min);
                    w8Var.setStepFactor(0.65f);
                    for (int i17 = 0; i17 < min; i17++) {
                        w8Var.b(i17, org.telegram.messenger.m10.t0, this.p1.participants.get(i17));
                    }
                    f10 = 24.0f;
                    w8Var.a(false);
                    linearLayout.addView(w8Var, c8.ja.t((int) org.telegram.ui.Cells.y0.f(f11, 0.65f, 1.0f, min - 1, f11), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.r5, e6Var);
                    textView4.setGravity(17);
                    if (min == 1) {
                        z15 = false;
                        format = I0(textView4, this.p1, 0).toString();
                    } else {
                        z15 = false;
                        if (min == 2) {
                            format = org.telegram.messenger.hd.a0("RequestToJoinMembersTwo", null, 2131746162, I0(textView4, this.p1, 0), I0(textView4, this.p1, 1));
                        } else {
                            if (i7 == 3) {
                                format = org.telegram.messenger.hd.a0("RequestToJoinMembersThree", null, 2131746163, I0(textView4, this.p1, 0), I0(textView4, this.p1, 1), I0(textView4, this.p1, 2));
                                z14 = false;
                            } else {
                                int max = Math.max(i7 - min, 2);
                                z14 = false;
                                format = String.format(org.telegram.messenger.hd.K0(max, "RequestToJoinMembersAll"), I0(textView4, this.p1, 0), I0(textView4, this.p1, 1), Integer.valueOf(max));
                            }
                            textView4.setText(format);
                            linearLayout.addView(textView4, c8.ja.t(-2, -2, 49, 10, 0, 10, 24));
                        }
                    }
                    z14 = z15;
                    textView4.setText(format);
                    linearLayout.addView(textView4, c8.ja.t(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.p1;
                if ((chatInvite8.channel && !chatInvite8.megagroup) || (org.telegram.messenger.t3.T(chatInvite8.chat) && !this.p1.chat.megagroup)) {
                    z14 = true;
                }
                TextView textView5 = new TextView(getContext());
                int L3 = org.telegram.messenger.g0.L(f10);
                int i18 = org.telegram.ui.ActionBar.j6.Fi;
                int w04 = org.telegram.ui.ActionBar.j6.w0(i18, this.J0);
                int i19 = org.telegram.ui.ActionBar.j6.Hi;
                int w05 = org.telegram.ui.ActionBar.j6.w0(i19, this.J0);
                org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, w04, w05, w05);
                org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i18);
                org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i19);
                textView5.setBackground(k03);
                org.telegram.ui.ActionBar.q6.j(textView5, k03, M3, M4, e6Var);
                c8.na.b(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                textView5.setSingleLine(true);
                textView5.setText(org.telegram.messenger.hd.M0(z14 ? 2131746662 : 2131746661, null));
                org.telegram.messenger.k5.m(textView5, org.telegram.ui.ActionBar.j6.Ji, e6Var, 1, 14.0f);
                linearLayout.addView(textView5, c8.ja.t(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new bi.q(this, j3, i16));
                return;
            }
            TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
            this.q1 = chat5;
            j10 = chat5.id;
        }
        str2 = str;
        j3 = j10;
        this.n1 = str2;
        linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView(linearLayout);
        NestedScrollView nestedScrollView2 = new NestedScrollView(context);
        nestedScrollView2.addView(frameLayout3);
        this.O = nestedScrollView2;
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, this.J0), 1, -1));
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.Aj, e6Var, PorterDuff.Mode.SRC_ATOP);
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new y60(this, i11));
        int L4 = org.telegram.messenger.g0.L(8.0f);
        imageView2.setPadding(L4, L4, L4, L4);
        frameLayout3.addView(imageView2, c8.ja.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        i9 i9Var2 = new i9(context);
        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        linearLayout.addView(i9Var2, c8.ja.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.p1;
        if (chatInvite == null) {
        }
        j5Var = new org.telegram.ui.ActionBar.j5(context);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(20);
        int i122 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.X(j5Var, i122, e6Var);
        j5Var.l(str4, false);
        j5Var.setGravity(17);
        linearLayout.addView(j5Var, c8.ja.t(-2, -2, 49, 10, 10, 10, i7 <= 0 ? 0 : 20));
        if (z10) {
        }
        j5Var.i(!z10 ? org.telegram.ui.ActionBar.j6.g1 : org.telegram.ui.ActionBar.j6.h1);
        TLRPC.ChatInvite chatInvite72 = this.p1;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView g102 = org.telegram.messenger.k5.g(context, 1, 13.0f);
        int i132 = org.telegram.ui.ActionBar.j6.r5;
        org.telegram.ui.ActionBar.q6.U(g102, i132, e6Var);
        g102.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        g102.setEllipsize(truncateAt2);
        if (z13) {
        }
        g102.setText(lowerCase);
        linearLayout.addView(g102, c8.ja.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : i10));
        if (!isEmpty) {
        }
        chatInvite2 = this.p1;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, c8.ja.o(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), e6Var);
        this.s1 = radialProgressView2;
        int i142 = org.telegram.ui.ActionBar.j6.Fi;
        radialProgressView2.setProgressColorKey(i142);
        radialProgressView2.setSize(org.telegram.messenger.g0.L(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, c8.ja.e(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.r1 = textView22;
        int L22 = org.telegram.messenger.g0.L(24.0f);
        int w022 = org.telegram.ui.ActionBar.j6.w0(i142, this.J0);
        int i152 = org.telegram.ui.ActionBar.j6.Hi;
        int w032 = org.telegram.ui.ActionBar.j6.w0(i152, this.J0);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.j6.k0(L22, L22, L22, L22, w022, w032, w032);
        org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i142);
        org.telegram.ui.ActionBar.m6 M22 = org.telegram.ui.ActionBar.q6.M(i152);
        textView22.setBackground(k022);
        org.telegram.ui.ActionBar.q6.j(textView22, k022, M5, M22, e6Var);
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(org.telegram.messenger.hd.M0(!z13 ? 2131746174 : 2131746170, null));
        org.telegram.ui.ActionBar.q6.U(textView22, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(org.telegram.messenger.g0.o());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final e70 e70Var = e70.this;
                TLRPC.Chat chat52 = e70Var.q1;
                final int i162 = 0;
                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.Components.c70
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i162) {
                            case 0:
                                e70 e70Var2 = e70Var;
                                if (!e70Var2.J) {
                                    e70Var2.r1.setVisibility(4);
                                    e70Var2.s1.setVisibility(0);
                                    break;
                                }
                                break;
                            default:
                                e70Var.dismiss();
                                break;
                        }
                    }
                }, 400L);
                TLRPC.ChatInvite chatInvite82 = e70Var.p1;
                boolean z17 = z13;
                if (chatInvite82 != null || chat52 == null) {
                    TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                    tL_messages_importChatInvite.hash = e70Var.n1;
                    ConnectionsManager.getInstance(e70Var.a).sendRequest(tL_messages_importChatInvite, new di.k(e70Var, j3, z17, tL_messages_importChatInvite), 2);
                } else {
                    final int i172 = 1;
                    org.telegram.messenger.np.s1(e70Var.a).m(chat52.id, org.telegram.messenger.m10.i(e70Var.a).f(), 0, null, null, true, new Runnable() { // from class: org.telegram.ui.Components.c70
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i172) {
                                case 0:
                                    e70 e70Var2 = e70Var;
                                    if (!e70Var2.J) {
                                        e70Var2.r1.setVisibility(4);
                                        e70Var2.s1.setVisibility(0);
                                        break;
                                    }
                                    break;
                                default:
                                    e70Var.dismiss();
                                    break;
                            }
                        }
                    }, new ab.z(6, e70Var, z17), null);
                }
            }
        });
        frameLayout22.addView(textView22, c8.ja.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(org.telegram.messenger.hd.M0(!z13 ? 2131746172 : 2131746168, null));
        org.telegram.ui.ActionBar.q6.U(textView32, i132, e6Var);
        linearLayout.addView(textView32, c8.ja.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static CharSequence I0(TextView textView, TLRPC.ChatInvite chatInvite, int i7) {
        String str = chatInvite.participants.get(i7).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), org.telegram.messenger.g0.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void J0(Context context, org.telegram.ui.ActionBar.e2 e2Var, cc ccVar, boolean z10) {
        if (context == null) {
            if (e2Var != null) {
                e2Var.getContext();
                return;
            }
            return;
        }
        if (ccVar == null) {
            ccVar = cc.a0(e2Var);
        }
        ub ubVar = new ub(context, e2Var.getResourceProvider());
        ubVar.a.f(R.raw.timer_3, 28, 28, null);
        ubVar.b.setText(org.telegram.messenger.hd.M0(2131746161, null));
        ubVar.c.setText(z10 ? org.telegram.messenger.hd.M0(2131746171, null) : org.telegram.messenger.hd.M0(2131746167, null));
        ccVar.b(ubVar, 2750).j();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.H0 != this.m1 || (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.J0)) == this.H0) {
                return;
            }
            P(w02);
            this.m1 = this.H0;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
