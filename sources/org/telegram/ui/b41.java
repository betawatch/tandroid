package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class b41 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.s61 f;
    public final t5 h;
    public a41 n;
    public FrameLayout r;
    public ci.d s;
    public final /* synthetic */ c41 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(c41 c41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = c41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        t5 t5Var = new t5(context, f6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.e = new z31(this, 0);
        if (c41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (c41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) t5Var.b;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        g2Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        f6Var3 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(t5Var, w7.y5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) c41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        ol0 ol0Var = new ol0(this, 16);
        f6Var4 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        org.telegram.ui.Components.s61 s61Var = new org.telegram.ui.Components.s61(context, i10, 0, true, b5Var, ol0Var, null, f6Var4);
        this.f = s61Var;
        s61Var.setClipToPadding(false);
        s61Var.X2.k1(true);
        s61Var.setOnScrollListener(new h3(this, 26));
        frameLayout.addView(s61Var, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.s61 s61Var = this.f;
        if (s61Var != null) {
            s61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.Y2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new z31(this, 1), 120L);
        }
    }
}
