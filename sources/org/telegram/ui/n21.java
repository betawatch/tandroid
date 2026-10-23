package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class n21 extends FrameLayout {
    public int a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption b;
    public TLRPC.TL_reportResultChooseOption c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.c71 f;
    public final ai.o5 h;
    public m21 n;
    public FrameLayout r;
    public ei.d s;
    public final /* synthetic */ o21 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n21(o21 o21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = o21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
        ai.o5 o5Var = new ai.o5(context, d6Var);
        TextView textView = (TextView) o5Var.c;
        this.h = o5Var;
        o5Var.e = new l21(this, 0);
        if (o21Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (o21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) o5Var.d;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
        g2Var.a(org.telegram.ui.ActionBar.h6.w0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.h6.h5;
        d6Var3 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
        o5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var3));
        addView(o5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) o21Var).currentAccount;
        g5 g5Var = new g5(this, 19);
        pp0 pp0Var = new pp0(this, 14);
        d6Var4 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(context, i10, 0, true, g5Var, pp0Var, null, d6Var4);
        this.f = c71Var;
        c71Var.setClipToPadding(false);
        c71Var.V2.k1(true);
        c71Var.setOnScrollListener(new k3(this, 26));
        frameLayout.addView(c71Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.c71 c71Var = this.f;
        if (c71Var != null) {
            c71Var.W2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.b = null;
        this.c = null;
        this.d = tL_reportResultAddComment;
        this.f.W2.N(false);
        if (this.n != null) {
            AndroidUtilities.runOnUIThread(new l21(this, 1), 120L);
        }
    }
}
