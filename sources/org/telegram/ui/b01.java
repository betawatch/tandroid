package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b01 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.u51 f;
    public final jg.b1 h;
    public zz0 n;
    public FrameLayout r;
    public vh.d s;
    public final /* synthetic */ c01 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b01(c01 c01Var, Context context) {
        super(context);
        this.w = c01Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.i0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        int i10 = c01.s1;
        jg.b1 b1Var = new jg.b1(context, c01Var.I0);
        TextView textView = (TextView) b1Var.c;
        this.h = b1Var;
        b1Var.e = new yz0(this, 0);
        if (c01Var.l1) {
            textView.setText(org.telegram.messenger.cd.L0(2131746251, null));
        } else if (c01Var.m1) {
            textView.setText(org.telegram.messenger.cd.L0(2131746212, null));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131746260, null));
        }
        ((org.telegram.ui.ActionBar.c2) b1Var.d).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, c01Var.I0));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, b1Var, c01Var.I0);
        addView(b1Var, w7.b6.e(-1, -2, 55));
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(context, c01Var.a, 0, true, new z4(this, 19), new tj0(this, 15), null, c01Var.I0);
        this.f = u51Var;
        u51Var.setClipToPadding(false);
        u51Var.e3.k1(true);
        u51Var.setOnScrollListener(new h3(this, 27));
        frameLayout.addView(u51Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.u51 u51Var = this.f;
        if (u51Var != null) {
            u51Var.f3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.f3.O(false);
        if (this.n != null) {
            org.telegram.messenger.i0.h3(new yz0(this, 1), 120L);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.c2 c2Var;
        try {
            jg.b1 b1Var = this.h;
            if (b1Var == null || (c2Var = (org.telegram.ui.ActionBar.c2) b1Var.d) == null) {
                return;
            }
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            c01 c01Var = this.w;
            int i11 = c01.s1;
            c2Var.a(org.telegram.ui.ActionBar.t6.w0(i10, c01Var.I0));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
