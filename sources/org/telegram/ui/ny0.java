package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ny0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.k41 f;
    public final bi.m5 h;
    public ly0 n;
    public FrameLayout r;
    public fi.d s;
    public final /* synthetic */ oy0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(oy0 oy0Var, Context context) {
        super(context);
        this.w = oy0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        int i7 = oy0.s1;
        bi.m5 m5Var = new bi.m5(context, oy0Var.I0);
        TextView textView = (TextView) m5Var.c;
        this.h = m5Var;
        m5Var.e = new ky0(this, 0);
        if (oy0Var.l1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746235, null));
        } else if (oy0Var.m1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746196, null));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131746244, null));
        }
        ((org.telegram.ui.ActionBar.y1) m5Var.d).a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, oy0Var.I0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, m5Var, oy0Var.I0);
        addView(m5Var, c8.ha.e(-1, -2, 55));
        org.telegram.ui.Components.k41 k41Var = new org.telegram.ui.Components.k41(context, oy0Var.a, 0, true, new a5(this, 20), new li0(this, 14), null, oy0Var.I0);
        this.f = k41Var;
        k41Var.setClipToPadding(false);
        k41Var.e3.k1(true);
        k41Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(k41Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7) {
        this.a = i7;
        this.h.b(i7 != 0);
        org.telegram.ui.Components.k41 k41Var = this.f;
        if (k41Var != null) {
            k41Var.f3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.f3.O(false);
        if (this.n != null) {
            org.telegram.messenger.g0.i3(new ky0(this, 1), 120L);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.ActionBar.y1 y1Var;
        try {
            bi.m5 m5Var = this.h;
            if (m5Var == null || (y1Var = (org.telegram.ui.ActionBar.y1) m5Var.d) == null) {
                return;
            }
            int i7 = org.telegram.ui.ActionBar.k6.G6;
            oy0 oy0Var = this.w;
            int i10 = oy0.s1;
            y1Var.a(org.telegram.ui.ActionBar.k6.w0(i7, oy0Var.I0));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
