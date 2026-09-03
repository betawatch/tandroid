package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p31 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.h61 f;
    public final eg.q1 h;
    public o31 n;
    public FrameLayout r;
    public qh.d s;
    public final /* synthetic */ q31 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p31(q31 q31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var4;
        this.v = q31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        g6Var = ((org.telegram.ui.ActionBar.h3) q31Var).resourcesProvider;
        eg.q1 q1Var = new eg.q1(context, g6Var);
        TextView textView = (TextView) q1Var.c;
        this.h = q1Var;
        q1Var.e = new n31(this, 0);
        if (q31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (q31Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.i2 i2Var = (org.telegram.ui.ActionBar.i2) q1Var.d;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) q31Var).resourcesProvider;
        i2Var.a(org.telegram.ui.ActionBar.k6.v0(i11, g6Var2));
        int i12 = org.telegram.ui.ActionBar.k6.h5;
        g6Var3 = ((org.telegram.ui.ActionBar.h3) q31Var).resourcesProvider;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var3));
        addView(q1Var, k7.c6.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.h3) q31Var).currentAccount;
        d5 d5Var = new d5(this, 19);
        kl0 kl0Var = new kl0(this, 15);
        g6Var4 = ((org.telegram.ui.ActionBar.h3) q31Var).resourcesProvider;
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(context, i10, 0, true, d5Var, kl0Var, null, g6Var4);
        this.f = h61Var;
        h61Var.setClipToPadding(false);
        h61Var.U2.k1(true);
        h61Var.setOnScrollListener(new l3(this, 26));
        frameLayout.addView(h61Var, k7.c6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.h61 h61Var = this.f;
        if (h61Var != null) {
            h61Var.V2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.V2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new n31(this, 1), 120L);
        }
    }
}
