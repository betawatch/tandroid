package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class p21 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.a71 f;
    public final ai.n5 h;
    public o21 n;
    public FrameLayout r;
    public ei.d s;
    public final /* synthetic */ q21 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p21(q21 q21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = q21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
        ai.n5 n5Var = new ai.n5(context, d6Var);
        TextView textView = (TextView) n5Var.c;
        this.h = n5Var;
        n5Var.e = new n21(this, 0);
        if (q21Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (q21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) n5Var.d;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
        g2Var.a(org.telegram.ui.ActionBar.h6.w0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.h6.h5;
        d6Var3 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
        n5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var3));
        addView(n5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) q21Var).currentAccount;
        g5 g5Var = new g5(this, 19);
        qp0 qp0Var = new qp0(this, 14);
        d6Var4 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(context, i10, 0, true, g5Var, qp0Var, null, d6Var4);
        this.f = a71Var;
        a71Var.setClipToPadding(false);
        a71Var.V2.k1(true);
        a71Var.setOnScrollListener(new k3(this, 26));
        frameLayout.addView(a71Var, w7.z5.d(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.a71 a71Var = this.f;
        if (a71Var != null) {
            a71Var.W2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.W2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new n21(this, 1), 120L);
        }
    }
}
