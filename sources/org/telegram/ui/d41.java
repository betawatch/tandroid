package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class d41 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.d61 f;
    public final t5 h;
    public c41 n;
    public FrameLayout r;
    public di.d s;
    public final /* synthetic */ e41 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(e41 e41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = e41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.f3) e41Var).resourcesProvider;
        t5 t5Var = new t5(context, f6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.e = new b41(this, 0);
        if (e41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (e41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) t5Var.b;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.f3) e41Var).resourcesProvider;
        g2Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        f6Var3 = ((org.telegram.ui.ActionBar.f3) e41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(t5Var, w7.x5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) e41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        vl0 vl0Var = new vl0(this, 15);
        f6Var4 = ((org.telegram.ui.ActionBar.f3) e41Var).resourcesProvider;
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(context, i10, 0, true, b5Var, vl0Var, null, f6Var4);
        this.f = d61Var;
        d61Var.setClipToPadding(false);
        d61Var.X2.k1(true);
        d61Var.setOnScrollListener(new i3(this, 26));
        frameLayout.addView(d61Var, w7.x5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.d61 d61Var = this.f;
        if (d61Var != null) {
            d61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.Y2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new b41(this, 1), 120L);
        }
    }
}
