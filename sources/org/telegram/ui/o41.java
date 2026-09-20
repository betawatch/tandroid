package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class o41 extends org.telegram.ui.ActionBar.n2 {
    public static final int[] c = {MediaController.VIDEO_BITRATE_360, MediaController.VIDEO_BITRATE_480, 1500000, 2000000};
    public org.telegram.ui.Components.vl0 a;
    public n41 b;

    public static String U(int i10) {
        if (i10 % MediaController.VIDEO_BITRATE_480 == 0) {
            return (i10 / MediaController.VIDEO_BITRATE_480) + " Mbps";
        }
        if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        }
        return (i10 / MediaDataController.MAX_STYLE_RUNS_COUNT) + " kbps";
    }

    public final void V(int i10, CharSequence[] charSequenceArr, ja0 ja0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new lg.j(11, this, ja0Var));
        showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.a = vl0Var;
        vl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new s4.c0());
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.vl0 vl0Var2 = this.a;
        n41 n41Var = new n41(context);
        this.b = n41Var;
        vl0Var2.setAdapter(n41Var);
        this.a.setOnItemClickListener(new a31(this, 3));
        frameLayout.addView(this.a, w7.y5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
