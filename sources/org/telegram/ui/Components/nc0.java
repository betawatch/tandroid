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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nc0 extends org.telegram.ui.ActionBar.v2 {
    public final TextView i1;
    public final dh0 j1;
    public final ah0 k1;
    public final r70 l1;
    public final long m1;
    public boolean n1;
    public TLRPC.TL_chatInviteExported o1;
    public int p1;
    public int q1;
    public int r1;

    public nc0(Context context, org.telegram.ui.y40 y40Var, TLRPC.ChatFull chatFull, long j3, boolean z9) {
        super(context, false);
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.m1 = j3;
        this.q0 = true;
        this.v0 = false;
        this.u0 = false;
        P(org.telegram.ui.ActionBar.l6.d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i7 = org.telegram.ui.ActionBar.l6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i7, this.I0), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        org.telegram.ui.ActionBar.g6 g6Var = this.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, g6Var);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.xj, this.I0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new ma0(this, 2));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        r70 r70Var = new r70(context, y40Var, this, true, z9);
        this.l1 = r70Var;
        r70Var.setPermanent(true);
        dh0 dh0Var = new dh0(context);
        this.j1 = dh0Var;
        ah0 ah0Var = new ah0(R.raw.shared_link_enter, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.k1 = ah0Var;
        ah0Var.P(42);
        dh0Var.setAnimation(ah0Var);
        r70Var.d(0, null, false);
        r70Var.b(true);
        r70Var.setDelegate(new bx(this, 10));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131749149, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, null);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.id.M0(z9 ? 2131748910 : 2131748911, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.i1 = textView3;
        textView3.setText(org.telegram.messenger.id.M0(2131748695, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.l6.Ci;
        org.telegram.ui.ActionBar.s6.U(textView3, i10, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.l6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i10, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.s6.j(textView3, k02, null, g10, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ah.g(this, chatFull, y40Var, 29));
        linearLayout.addView(dh0Var, c8.ha.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(r70Var, c8.ha.o(-1, -2));
        linearLayout.addView(textView3, c8.ha.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.N = nestedScrollView;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(j3));
        if (M0 != null && org.telegram.messenger.t3.t0(M0)) {
            r70Var.setLink("https://t.me/" + org.telegram.messenger.t3.K(M0, false));
            textView3.setVisibility(8);
        } else {
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                z10 = false;
                K0(false);
                dh0Var.setBackground(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.l6.x0(null, i10, z10)));
                int L3 = org.telegram.messenger.g0.L(8.0f);
                int o10 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i10, z10), 120);
                textView3.setBackground(org.telegram.ui.ActionBar.l6.k0(L3, L3, L3, L3, 0, o10, o10));
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, z10);
                ah0Var.Q(x02, "Top");
                ah0Var.Q(x02, "Bottom");
                ah0Var.Q(x02, "Center");
                r70Var.f();
                int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, z10);
                this.q1 = x03;
                v0(x03);
                this.p1 = x02;
            }
            r70Var.setLink(tL_chatInviteExported.link);
        }
        z10 = false;
        dh0Var.setBackground(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.l6.x0(null, i10, z10)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o102 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i10, z10), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.l6.k0(L32, L32, L32, L32, 0, o102, o102));
        int x022 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, z10);
        ah0Var.Q(x022, "Top");
        ah0Var.Q(x022, "Bottom");
        ah0Var.Q(x022, "Center");
        r70Var.f();
        int x032 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, z10);
        this.q1 = x032;
        v0(x032);
        this.p1 = x022;
    }

    public static void I0(nc0 nc0Var) {
        super.dismiss();
    }

    public static void J0(nc0 nc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.y40 y40Var) {
        org.telegram.ui.ef0 ef0Var = new org.telegram.ui.ef0(chatFull.id, 0, 0L);
        ef0Var.m0(chatFull, chatFull.exported_invite);
        y40Var.presentFragment(ef0Var);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Gi));
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
            dh0 dh0Var = this.j1;
            if (dh0Var != null) {
                org.telegram.ui.ActionBar.l6.C1(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false), dh0Var.getBackground());
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false), 120);
            TextView textView = this.i1;
            if (textView != null && o4 != this.r1) {
                this.r1 = o4;
                org.telegram.ui.ActionBar.l6.H1(textView.getBackground(), o4, true);
            }
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, false);
            ah0 ah0Var = this.k1;
            if (ah0Var != null && x02 != this.p1) {
                this.p1 = x02;
                ah0Var.Q(x02, "Top");
                ah0Var.Q(x02, "Bottom");
                ah0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false);
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
        org.telegram.messenger.g0.i3(new pb0(this, 2), 50L);
    }
}
