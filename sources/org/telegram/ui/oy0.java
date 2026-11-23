package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class oy0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.g51 f;
    public final di.n4 h;
    public my0 n;
    public FrameLayout r;
    public hi.e s;
    public final /* synthetic */ py0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(py0 py0Var, Context context) {
        super(context);
        this.w = py0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        int i7 = py0.w1;
        di.n4 n4Var = new di.n4(context, py0Var.J0);
        TextView textView = (TextView) n4Var.c;
        this.h = n4Var;
        n4Var.e = new ly0(this, 0);
        if (py0Var.p1) {
            textView.setText(org.telegram.messenger.gd.N0(2131746038, null));
        } else if (py0Var.q1) {
            textView.setText(org.telegram.messenger.gd.N0(2131745999, null));
        } else {
            textView.setText(org.telegram.messenger.gd.N0(2131746047, null));
        }
        ((org.telegram.ui.ActionBar.x1) n4Var.d).a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, py0Var.J0));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, n4Var, py0Var.J0);
        addView(n4Var, c8.na.e(-1, -2, 55));
        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(context, py0Var.a, 0, true, new a5(this, 20), new oi0(this, 14), null, py0Var.J0);
        this.f = g51Var;
        g51Var.setClipToPadding(false);
        g51Var.f3.k1(true);
        g51Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(g51Var, c8.na.c(-1.0f, -1));
    }

    public final void a(int i7) {
        this.a = i7;
        this.h.b(i7 != 0);
        org.telegram.ui.Components.g51 g51Var = this.f;
        if (g51Var != null) {
            g51Var.g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.g3.O(false);
        if (this.n != null) {
            org.telegram.messenger.g0.h3(new ly0(this, 1), 120L);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.x1 x1Var;
        try {
            di.n4 n4Var = this.h;
            if (n4Var == null || (x1Var = (org.telegram.ui.ActionBar.x1) n4Var.d) == null) {
                return;
            }
            int i7 = org.telegram.ui.ActionBar.n6.G6;
            py0 py0Var = this.w;
            int i10 = py0.w1;
            x1Var.a(org.telegram.ui.ActionBar.n6.w0(i7, py0Var.J0));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
