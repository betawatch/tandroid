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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mc0 extends org.telegram.ui.ActionBar.v2 {
    public final TextView i1;
    public final ch0 j1;
    public final zg0 k1;
    public final q70 l1;
    public final long m1;
    public boolean n1;
    public TLRPC.TL_chatInviteExported o1;
    public int p1;
    public int q1;
    public int r1;

    public mc0(Context context, org.telegram.ui.w40 w40Var, TLRPC.ChatFull chatFull, long j3, boolean z9) {
        super(context, false);
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.m1 = j3;
        this.q0 = true;
        this.v0 = false;
        this.u0 = false;
        P(org.telegram.ui.ActionBar.k6.d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i7 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i7, this.I0), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, f6Var);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.xj, this.I0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new la0(this, 2));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        q70 q70Var = new q70(context, w40Var, this, true, z9);
        this.l1 = q70Var;
        q70Var.setPermanent(true);
        ch0 ch0Var = new ch0(context);
        this.j1 = ch0Var;
        zg0 zg0Var = new zg0(R.raw.shared_link_enter, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.k1 = zg0Var;
        zg0Var.P(42);
        ch0Var.setAnimation(zg0Var);
        q70Var.d(0, null, false);
        q70Var.b(true);
        q70Var.setDelegate(new bx(this, 10));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131749150, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.id.M0(z9 ? 2131748911 : 2131748912, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.i1 = textView3;
        textView3.setText(org.telegram.messenger.id.M0(2131748696, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(textView3, i10, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView3, k02, null, h, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ah.g(this, chatFull, w40Var, 29));
        linearLayout.addView(ch0Var, c8.ha.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(q70Var, c8.ha.o(-1, -2));
        linearLayout.addView(textView3, c8.ha.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.N = nestedScrollView;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(j3));
        if (M0 != null && org.telegram.messenger.t3.t0(M0)) {
            q70Var.setLink("https://t.me/" + org.telegram.messenger.t3.K(M0, false));
            textView3.setVisibility(8);
        } else {
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                z10 = false;
                K0(false);
                ch0Var.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i10, z10)));
                int L3 = org.telegram.messenger.g0.L(8.0f);
                int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, z10), 120);
                textView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o10, o10));
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, z10);
                zg0Var.Q(x02, "Top");
                zg0Var.Q(x02, "Bottom");
                zg0Var.Q(x02, "Center");
                q70Var.f();
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, z10);
                this.q1 = x03;
                v0(x03);
                this.p1 = x02;
            }
            q70Var.setLink(tL_chatInviteExported.link);
        }
        z10 = false;
        ch0Var.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i10, z10)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o102 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, z10), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L32, L32, L32, L32, 0, o102, o102));
        int x022 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, z10);
        zg0Var.Q(x022, "Top");
        zg0Var.Q(x022, "Bottom");
        zg0Var.Q(x022, "Center");
        q70Var.f();
        int x032 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, z10);
        this.q1 = x032;
        v0(x032);
        this.p1 = x022;
    }

    public static void I0(mc0 mc0Var) {
        super.dismiss();
    }

    public static void J0(mc0 mc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.w40 w40Var) {
        org.telegram.ui.cf0 cf0Var = new org.telegram.ui.cf0(chatFull.id, 0, 0L);
        cf0Var.m0(chatFull, chatFull.exported_invite);
        w40Var.presentFragment(cf0Var);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
    }

    public final void K0(boolean z9) {
        if (this.n1) {
            return;
        }
        this.n1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.qp.s1(this.a).j1(-this.m1);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_exportChatInvite, new fi.d3(6, this, z9));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final ArrayList U() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            ch0 ch0Var = this.j1;
            if (ch0Var != null) {
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), ch0Var.getBackground());
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), 120);
            TextView textView = this.i1;
            if (textView != null && o4 != this.r1) {
                this.r1 = o4;
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), o4, true);
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
            zg0 zg0Var = this.k1;
            if (zg0Var != null && x02 != this.p1) {
                this.p1 = x02;
                zg0Var.Q(x02, "Top");
                zg0Var.Q(x02, "Bottom");
                zg0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            if (x03 != this.q1) {
                this.q1 = x03;
                v0(x03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ob0(this, 2), 50L);
    }
}
