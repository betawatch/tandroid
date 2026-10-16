package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h41 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.i71 f;
    public final x5 h;
    public g41 n;
    public FrameLayout r;
    public di.d s;
    public final /* synthetic */ i41 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h41(i41 i41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.v = i41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        c6Var = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
        x5 x5Var = new x5(context, c6Var);
        TextView textView = (TextView) x5Var.d;
        this.h = x5Var;
        x5Var.e = new f41(this, 0);
        if (i41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (i41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) x5Var.b;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
        f2Var.a(org.telegram.ui.ActionBar.g6.w0(i11, c6Var2));
        int i12 = org.telegram.ui.ActionBar.g6.h5;
        c6Var3 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
        x5Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var3));
        addView(x5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.e3) i41Var).currentAccount;
        f5 f5Var = new f5(this, 19);
        lq0 lq0Var = new lq0(this, 14);
        c6Var4 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(context, i10, 0, true, f5Var, lq0Var, null, c6Var4);
        this.f = i71Var;
        i71Var.setClipToPadding(false);
        i71Var.V2.k1(true);
        i71Var.setOnScrollListener(new k3(this, 26));
        frameLayout.addView(i71Var, w7.z5.d(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.i71 i71Var = this.f;
        if (i71Var != null) {
            i71Var.W2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.W2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new f41(this, 1), 120L);
        }
    }
}
