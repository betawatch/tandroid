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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nc0 extends org.telegram.ui.ActionBar.u2 {
    public final TextView m1;
    public final fh0 n1;
    public final ch0 o1;
    public final t70 p1;
    public final long q1;
    public boolean r1;
    public TLRPC.TL_chatInviteExported s1;
    public int t1;
    public int u1;
    public int v1;

    public nc0(Context context, org.telegram.ui.w40 w40Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.q1 = j3;
        this.r0 = true;
        this.w0 = false;
        this.v0 = false;
        Q(org.telegram.ui.ActionBar.j6.d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i7 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i7, this.J0), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, e6Var);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Aj, this.J0, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new y60(this, 3));
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        frameLayout.addView(imageView, c8.ja.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        t70 t70Var = new t70(context, w40Var, this, true, z10);
        this.p1 = t70Var;
        t70Var.setPermanent(true);
        fh0 fh0Var = new fh0(context);
        this.n1 = fh0Var;
        ch0 ch0Var = new ch0(R.raw.shared_link_enter, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f), false, null);
        this.o1 = ch0Var;
        ch0Var.P(42);
        fh0Var.setAnimation(ch0Var);
        t70Var.d(0, null, false);
        t70Var.b(true);
        t70Var.setDelegate(new gx(this, 10));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131749149, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.hd.M0(z10 ? 2131748910 : 2131748911, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.m1 = textView3;
        textView3.setText(org.telegram.messenger.hd.M0(2131748695, null));
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.U(textView3, i10, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i10, 120);
        textView3.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView3, k02, null, g10, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new lt(this, chatFull, w40Var, 4));
        linearLayout.addView(fh0Var, c8.ja.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, c8.ja.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, c8.ja.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(t70Var, c8.ja.o(-1, -2));
        linearLayout.addView(textView3, c8.ja.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        this.O = nestedScrollView;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).M0(Long.valueOf(j3));
        if (M0 != null && org.telegram.messenger.t3.t0(M0)) {
            t70Var.setLink("https://t.me/" + org.telegram.messenger.t3.K(M0, false));
            textView3.setVisibility(8);
        } else {
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                z11 = false;
                K0(false);
                fh0Var.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.j6.x0(null, i10, z11)));
                int L3 = org.telegram.messenger.g0.L(8.0f);
                int o10 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i10, z11), 120);
                textView3.setBackground(org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, 0, o10, o10));
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, z11);
                ch0Var.Q(x02, "Top");
                ch0Var.Q(x02, "Bottom");
                ch0Var.Q(x02, "Center");
                t70Var.f();
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, z11);
                this.u1 = x03;
                v0(x03);
                this.t1 = x02;
            }
            t70Var.setLink(tL_chatInviteExported.link);
        }
        z11 = false;
        fh0Var.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(90.0f), org.telegram.ui.ActionBar.j6.x0(null, i10, z11)));
        int L32 = org.telegram.messenger.g0.L(8.0f);
        int o102 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i10, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.k0(L32, L32, L32, L32, 0, o102, o102));
        int x022 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, z11);
        ch0Var.Q(x022, "Top");
        ch0Var.Q(x022, "Bottom");
        ch0Var.Q(x022, "Center");
        t70Var.f();
        int x032 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, z11);
        this.u1 = x032;
        v0(x032);
        this.t1 = x022;
    }

    public static void I0(nc0 nc0Var) {
        super.dismiss();
    }

    public static void J0(nc0 nc0Var, TLRPC.ChatFull chatFull, org.telegram.ui.w40 w40Var) {
        org.telegram.ui.cf0 cf0Var = new org.telegram.ui.cf0(chatFull.id, 0, 0L);
        cf0Var.m0(chatFull, chatFull.exported_invite);
        w40Var.presentFragment(cf0Var);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ji));
    }

    public final void K0(boolean z10) {
        if (this.r1) {
            return;
        }
        this.r1 = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = org.telegram.messenger.np.s1(this.a).j1(-this.q1);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_exportChatInvite, new hi.b3(6, this, z10));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final ArrayList V() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            fh0 fh0Var = this.n1;
            if (fh0Var != null) {
                org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false), fh0Var.getBackground());
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false), 120);
            TextView textView = this.m1;
            if (textView != null && o4 != this.v1) {
                this.v1 = o4;
                org.telegram.ui.ActionBar.j6.H1(textView.getBackground(), o4, true);
            }
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
            ch0 ch0Var = this.o1;
            if (ch0Var != null && x02 != this.t1) {
                this.t1 = x02;
                ch0Var.Q(x02, "Top");
                ch0Var.Q(x02, "Bottom");
                ch0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
            if (x03 != this.u1) {
                this.u1 = x03;
                v0(x03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new wa0(this, 4), 50L);
    }
}
