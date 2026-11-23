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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class yc0 extends org.telegram.ui.ActionBar.w2 {
    public final TextView m1;
    public final rh0 n1;
    public final oh0 o1;
    public final g80 p1;
    public final long q1;
    public boolean r1;
    public TLRPC.TL_chatInviteExported s1;
    public int t1;
    public int u1;
    public int v1;

    public yc0(Context context, org.telegram.ui.z40 z40Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.q1 = j3;
        this.r0 = true;
        this.w0 = false;
        this.v0 = false;
        Q(org.telegram.ui.ActionBar.m6.d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i7 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i7, this.J0), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, h6Var);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Aj, this.J0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new j70(this, 4));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, c8.ma.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        g80 g80Var = new g80(context, z40Var, this, true, z10);
        this.p1 = g80Var;
        g80Var.setPermanent(true);
        rh0 rh0Var = new rh0(context);
        this.n1 = rh0Var;
        oh0 oh0Var = new oh0(R.raw.shared_link_enter, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.o1 = oh0Var;
        oh0Var.P(42);
        rh0Var.setAnimation(oh0Var);
        g80Var.d(0, null, false);
        g80Var.b(true);
        g80Var.setDelegate(new ky(this, 9));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.N0(2131748956, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.hd.N0(z10 ? 2131748717 : 2131748718, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.m1 = textView3;
        textView3.setText(org.telegram.messenger.hd.N0(2131748502, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.U(textView3, i10, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i10, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView3, k02, null, g10, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new st(this, chatFull, z40Var, 4));
        linearLayout.addView(rh0Var, c8.ma.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, c8.ma.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(g80Var, c8.ma.o(-1, -2));
        linearLayout.addView(textView3, c8.ma.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.O = nestedScrollView;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(j3));
        if (O0 != null && org.telegram.messenger.v3.t0(O0)) {
            g80Var.setLink("https://t.me/" + org.telegram.messenger.v3.K(O0, false));
            textView3.setVisibility(8);
        } else {
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                z11 = false;
                L0(false);
                rh0Var.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.m6.x0(null, i10, z11)));
                int L3 = org.telegram.messenger.g0.L(8.0f);
                int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i10, z11), 120);
                textView3.setBackground(org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, o10, o10));
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, z11);
                oh0Var.Q(x02, "Top");
                oh0Var.Q(x02, "Bottom");
                oh0Var.Q(x02, "Center");
                g80Var.f();
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, z11);
                this.u1 = x03;
                v0(x03);
                this.t1 = x02;
            }
            g80Var.setLink(tL_chatInviteExported.link);
        }
        z11 = false;
        rh0Var.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.m6.x0(null, i10, z11)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o102 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i10, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.m6.k0(L32, L32, L32, L32, 0, o102, o102));
        int x022 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, z11);
        oh0Var.Q(x022, "Top");
        oh0Var.Q(x022, "Bottom");
        oh0Var.Q(x022, "Center");
        g80Var.f();
        int x032 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, z11);
        this.u1 = x032;
        v0(x032);
        this.t1 = x022;
    }

    public static void J0(yc0 yc0Var) {
        super.dismiss();
    }

    public static void K0(yc0 yc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.z40 z40Var) {
        org.telegram.ui.ff0 ff0Var = new org.telegram.ui.ff0(chatFull.id, 0, 0L);
        ff0Var.m0(chatFull, chatFull.exported_invite);
        z40Var.presentFragment(ff0Var);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ji));
    }

    public final void L0(boolean z10) {
        if (this.r1) {
            return;
        }
        this.r1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.np.u1(this.a).l1(-this.q1);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_exportChatInvite, new hi.b3(6, this, z10));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList V() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            rh0 rh0Var = this.n1;
            if (rh0Var != null) {
                org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false), rh0Var.getBackground());
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false), 120);
            TextView textView = this.m1;
            if (textView != null && o4 != this.v1) {
                this.v1 = o4;
                org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), o4, true);
            }
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false);
            oh0 oh0Var = this.o1;
            if (oh0Var != null && x02 != this.t1) {
                this.t1 = x02;
                oh0Var.Q(x02, "Top");
                oh0Var.Q(x02, "Bottom");
                oh0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
            if (x03 != this.u1) {
                this.u1 = x03;
                v0(x03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new hb0(this, 4), 50L);
    }
}
