package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g41 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.r61 f;
    public final u5 h;
    public f41 n;
    public FrameLayout r;
    public bi.d s;
    public final /* synthetic */ h41 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g41(h41 h41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = h41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
        u5 u5Var = new u5(context, f6Var);
        TextView textView = (TextView) u5Var.d;
        this.h = u5Var;
        u5Var.e = new e41(this, 0);
        if (h41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (h41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.i2 i2Var = (org.telegram.ui.ActionBar.i2) u5Var.b;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
        i2Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        f6Var3 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
        u5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(u5Var, w7.a6.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.h3) h41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        ul0 ul0Var = new ul0(this, 15);
        f6Var4 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(context, i10, 0, true, b5Var, ul0Var, null, f6Var4);
        this.f = r61Var;
        r61Var.setClipToPadding(false);
        r61Var.X2.k1(true);
        r61Var.setOnScrollListener(new j3(this, 26));
        frameLayout.addView(r61Var, w7.a6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.r61 r61Var = this.f;
        if (r61Var != null) {
            r61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.Y2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new e41(this, 1), 120L);
        }
    }
}
