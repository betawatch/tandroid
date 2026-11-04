package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dy0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.l41 f;
    public final ci.t4 h;
    public by0 n;
    public FrameLayout r;
    public gi.d s;
    public final /* synthetic */ ey0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(ey0 ey0Var, Context context) {
        super(context);
        this.w = ey0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        int i3 = ey0.t1;
        ci.t4 t4Var = new ci.t4(context, ey0Var.J0);
        TextView textView = (TextView) t4Var.c;
        this.h = t4Var;
        t4Var.e = new ay0(this, 0);
        if (ey0Var.m1) {
            textView.setText(org.telegram.messenger.bd.M0(2131746244, null));
        } else if (ey0Var.n1) {
            textView.setText(org.telegram.messenger.bd.M0(2131746205, null));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131746253, null));
        }
        ((org.telegram.ui.ActionBar.w1) t4Var.d).a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, ey0Var.J0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, t4Var, ey0Var.J0);
        addView(t4Var, b8.mf.e(-1, -2, 55));
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(context, ey0Var.a, 0, true, new c5(this, 19), new ci0(this, 15), null, ey0Var.J0);
        this.f = l41Var;
        l41Var.setClipToPadding(false);
        l41Var.f3.k1(true);
        l41Var.setOnScrollListener(new h3(this, 28));
        frameLayout.addView(l41Var, b8.mf.c(-1.0f, -1));
    }

    public final void a(int i3) {
        this.a = i3;
        this.h.b(i3 != 0);
        org.telegram.ui.Components.l41 l41Var = this.f;
        if (l41Var != null) {
            l41Var.g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.g3.O(false);
        if (this.n != null) {
            org.telegram.messenger.g0.i3(new ay0(this, 1), 120L);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.w1 w1Var;
        try {
            ci.t4 t4Var = this.h;
            if (t4Var == null || (w1Var = (org.telegram.ui.ActionBar.w1) t4Var.d) == null) {
                return;
            }
            int i3 = org.telegram.ui.ActionBar.k6.G6;
            ey0 ey0Var = this.w;
            int i10 = ey0.t1;
            w1Var.a(org.telegram.ui.ActionBar.k6.w0(i3, ey0Var.J0));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
