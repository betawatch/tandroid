package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hd0 extends org.telegram.ui.ActionBar.z2 {
    public final TextView i1;
    public final ei0 j1;
    public final bi0 k1;
    public final j80 l1;
    public final long m1;
    public boolean n1;
    public TLRPC.TL_chatInviteExported o1;
    public int p1;
    public int q1;
    public int r1;

    public hd0(Context context, org.telegram.ui.v50 v50Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.m1 = j10;
        this.q0 = true;
        this.v0 = false;
        this.u0 = false;
        Q(org.telegram.ui.ActionBar.t6.d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.xj, this.I0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new db0(this, 2));
        int L = org.telegram.messenger.i0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, w7.b6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        j80 j80Var = new j80(context, v50Var, this, true, z10);
        this.l1 = j80Var;
        j80Var.setPermanent(true);
        ei0 ei0Var = new ei0(context);
        this.j1 = ei0Var;
        bi0 bi0Var = new bi0(R.raw.shared_link_enter, org.telegram.messenger.i0.L(90.0f), org.telegram.messenger.i0.L(90.0f), false, null);
        this.k1 = bi0Var;
        bi0Var.P(42);
        ei0Var.setAnimation(bi0Var);
        j80Var.d(0, null, false);
        j80Var.b(true);
        j80Var.setDelegate(new px(this, 10));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.cd.L0(2131749159, null));
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.cd.L0(z10 ? 2131748920 : 2131748921, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.i1 = textView3;
        textView3.setText(org.telegram.messenger.cd.L0(2131748710, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.V(textView3, i11, null);
        int L2 = org.telegram.messenger.i0.L(8.0f);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i11, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView3, k02, null, h, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ag.i(this, chatFull, v50Var, 19));
        linearLayout.addView(ei0Var, w7.b6.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.b6.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.b6.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(j80Var, w7.b6.o(-1, -2));
        linearLayout.addView(textView3, w7.b6.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.N = nestedScrollView;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).L0(Long.valueOf(j10));
        if (L0 != null && org.telegram.messenger.w3.t0(L0)) {
            j80Var.setLink("https://t.me/" + org.telegram.messenger.w3.K(L0, false));
            textView3.setVisibility(8);
        } else {
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                z11 = false;
                K0(false);
                ei0Var.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(90.0f), org.telegram.ui.ActionBar.t6.x0(null, i11, z11)));
                int L3 = org.telegram.messenger.i0.L(8.0f);
                int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i11, z11), 120);
                textView3.setBackground(org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, o11, o11));
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, z11);
                bi0Var.Q(x02, "Top");
                bi0Var.Q(x02, "Bottom");
                bi0Var.Q(x02, "Center");
                j80Var.f();
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, z11);
                this.q1 = x03;
                v0(x03);
                this.p1 = x02;
            }
            j80Var.setLink(tL_chatInviteExported.link);
        }
        z11 = false;
        ei0Var.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(90.0f), org.telegram.ui.ActionBar.t6.x0(null, i11, z11)));
        int L32 = org.telegram.messenger.i0.L(8.0f);
        int o112 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i11, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.t6.k0(L32, L32, L32, L32, 0, o112, o112));
        int x022 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, z11);
        bi0Var.Q(x022, "Top");
        bi0Var.Q(x022, "Bottom");
        bi0Var.Q(x022, "Center");
        j80Var.f();
        int x032 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, z11);
        this.q1 = x032;
        v0(x032);
        this.p1 = x022;
    }

    public static void I0(hd0 hd0Var) {
        super.dismiss();
    }

    public static void J0(hd0 hd0Var, TLRPC.ChatFull chatFull, org.telegram.ui.v50 v50Var) {
        org.telegram.ui.kg0 kg0Var = new org.telegram.ui.kg0(chatFull.id, 0, 0L);
        kg0Var.l0(chatFull, chatFull.exported_invite);
        v50Var.presentFragment(kg0Var);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
    }

    public final void K0(boolean z10) {
        if (this.n1) {
            return;
        }
        this.n1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.vp.r1(this.a).i1(-this.m1);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.voip.u0(5, this, z10));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final ArrayList V() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            ei0 ei0Var = this.j1;
            if (ei0Var != null) {
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false), ei0Var.getBackground());
            }
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false), 120);
            TextView textView = this.i1;
            if (textView != null && o10 != this.r1) {
                this.r1 = o10;
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), o10, true);
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
            bi0 bi0Var = this.k1;
            if (bi0Var != null && x02 != this.p1) {
                this.p1 = x02;
                bi0Var.Q(x02, "Top");
                bi0Var.Q(x02, "Bottom");
                bi0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
            if (x03 != this.q1) {
                this.q1 = x03;
                v0(x03);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.i0.h3(new eb0(this, 5), 50L);
    }
}
