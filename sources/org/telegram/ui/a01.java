package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a01 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.v51 f;
    public final jg.b1 h;
    public yz0 n;
    public FrameLayout r;
    public vh.d s;
    public final /* synthetic */ b01 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a01(b01 b01Var, Context context) {
        super(context);
        this.w = b01Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.i0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.b6.e(-1, -1, org.telegram.messenger.at.E1));
        int i10 = b01.s1;
        jg.b1 b1Var = new jg.b1(context, b01Var.I0);
        TextView textView = (TextView) b1Var.c;
        this.h = b1Var;
        b1Var.e = new xz0(this, 0);
        if (b01Var.l1) {
            textView.setText(org.telegram.messenger.dd.L0(2131746251, null));
        } else if (b01Var.m1) {
            textView.setText(org.telegram.messenger.dd.L0(2131746212, null));
        } else {
            textView.setText(org.telegram.messenger.dd.L0(2131746260, null));
        }
        ((org.telegram.ui.ActionBar.c2) b1Var.d).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, b01Var.I0));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, b1Var, b01Var.I0);
        addView(b1Var, w7.b6.e(-1, -2, 55));
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(context, b01Var.a, 0, true, new z4(this, 19), new rj0(this, 15), null, b01Var.I0);
        this.f = v51Var;
        v51Var.setClipToPadding(false);
        v51Var.e3.k1(true);
        v51Var.setOnScrollListener(new h3(this, 27));
        frameLayout.addView(v51Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.v51 v51Var = this.f;
        if (v51Var != null) {
            v51Var.f3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.f3.O(false);
        if (this.n != null) {
            org.telegram.messenger.i0.h3(new xz0(this, 1), 120L);
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
            b01 b01Var = this.w;
            int i11 = b01.s1;
            c2Var.a(org.telegram.ui.ActionBar.t6.w0(i10, b01Var.I0));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
