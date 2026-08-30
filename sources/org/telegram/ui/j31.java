package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j31 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.g61 f;
    public final dg.s1 h;
    public h31 n;
    public FrameLayout r;
    public ph.d s;
    public final /* synthetic */ k31 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(k31 k31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = k31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
        dg.s1 s1Var = new dg.s1(context, f6Var);
        TextView textView = (TextView) s1Var.c;
        this.h = s1Var;
        s1Var.e = new g31(this, 0);
        if (k31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (k31Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.i2 i2Var = (org.telegram.ui.ActionBar.i2) s1Var.d;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
        i2Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        f6Var3 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
        s1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(s1Var, k7.b6.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.g3) k31Var).currentAccount;
        d5 d5Var = new d5(this, 19);
        il0 il0Var = new il0(this, 15);
        f6Var4 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(context, i10, 0, true, d5Var, il0Var, null, f6Var4);
        this.f = g61Var;
        g61Var.setClipToPadding(false);
        g61Var.U2.k1(true);
        g61Var.setOnScrollListener(new l3(this, 27));
        frameLayout.addView(g61Var, k7.b6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.g61 g61Var = this.f;
        if (g61Var != null) {
            g61Var.V2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.V2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new g31(this, 1), 120L);
        }
    }
}
