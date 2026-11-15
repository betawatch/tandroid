package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ly0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.u41 f;
    public final di.k4 h;
    public jy0 n;
    public FrameLayout r;
    public hi.d s;
    public final /* synthetic */ my0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly0(my0 my0Var, Context context) {
        super(context);
        this.w = my0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        int i7 = my0.w1;
        di.k4 k4Var = new di.k4(context, my0Var.J0);
        TextView textView = (TextView) k4Var.c;
        this.h = k4Var;
        k4Var.e = new iy0(this, 0);
        if (my0Var.p1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746234, null));
        } else if (my0Var.q1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746195, null));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131746243, null));
        }
        ((org.telegram.ui.ActionBar.x1) k4Var.d).a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, my0Var.J0));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, k4Var, my0Var.J0);
        addView(k4Var, c8.ja.e(-1, -2, 55));
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(context, my0Var.a, 0, true, new a5(this, 20), new ni0(this, 14), null, my0Var.J0);
        this.f = u41Var;
        u41Var.setClipToPadding(false);
        u41Var.f3.k1(true);
        u41Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(u41Var, c8.ja.c(-1.0f, -1));
    }

    public final void a(int i7) {
        this.a = i7;
        this.h.b(i7 != 0);
        org.telegram.ui.Components.u41 u41Var = this.f;
        if (u41Var != null) {
            u41Var.g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.g3.O(false);
        if (this.n != null) {
            org.telegram.messenger.g0.i3(new iy0(this, 1), 120L);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.x1 x1Var;
        try {
            di.k4 k4Var = this.h;
            if (k4Var == null || (x1Var = (org.telegram.ui.ActionBar.x1) k4Var.d) == null) {
                return;
            }
            int i7 = org.telegram.ui.ActionBar.j6.G6;
            my0 my0Var = this.w;
            int i10 = my0.w1;
            x1Var.a(org.telegram.ui.ActionBar.j6.w0(i7, my0Var.J0));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
