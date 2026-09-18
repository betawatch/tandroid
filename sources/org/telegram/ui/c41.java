package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c41 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.f61 f;
    public final t5 h;
    public b41 n;
    public FrameLayout r;
    public ci.d s;
    public final /* synthetic */ d41 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(d41 d41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = d41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
        t5 t5Var = new t5(context, f6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.e = new a41(this, 0);
        if (d41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (d41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) t5Var.b;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
        h2Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        f6Var3 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(t5Var, w7.x5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.g3) d41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        nl0 nl0Var = new nl0(this, 16);
        f6Var4 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
        org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(context, i10, 0, true, b5Var, nl0Var, null, f6Var4);
        this.f = f61Var;
        f61Var.setClipToPadding(false);
        f61Var.X2.k1(true);
        f61Var.setOnScrollListener(new h3(this, 26));
        frameLayout.addView(f61Var, w7.x5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.f61 f61Var = this.f;
        if (f61Var != null) {
            f61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.Y2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new a41(this, 1), 120L);
        }
    }
}
