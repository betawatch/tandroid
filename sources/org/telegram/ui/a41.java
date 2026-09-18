package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class a41 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.t61 f;
    public final t5 h;
    public z31 n;
    public FrameLayout r;
    public ci.d s;
    public final /* synthetic */ b41 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(b41 b41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.v = b41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        e6Var = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        t5 t5Var = new t5(context, e6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.e = new y31(this, 0);
        if (b41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (b41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) t5Var.b;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        g2Var.a(org.telegram.ui.ActionBar.j6.v0(i11, e6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        e6Var3 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var3));
        addView(t5Var, w7.y5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) b41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        ol0 ol0Var = new ol0(this, 16);
        e6Var4 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(context, i10, 0, true, b5Var, ol0Var, null, e6Var4);
        this.f = t61Var;
        t61Var.setClipToPadding(false);
        t61Var.X2.k1(true);
        t61Var.setOnScrollListener(new h3(this, 26));
        frameLayout.addView(t61Var, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.t61 t61Var = this.f;
        if (t61Var != null) {
            t61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.Y2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new y31(this, 1), 120L);
        }
    }
}
