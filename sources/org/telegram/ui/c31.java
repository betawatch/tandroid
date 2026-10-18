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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class c31 extends org.telegram.ui.ActionBar.n2 {
    public static final int[] c = {MediaController.VIDEO_BITRATE_360, MediaController.VIDEO_BITRATE_480, 1200000, 2000000};
    public org.telegram.ui.Components.im0 a;
    public b31 b;

    public static String U(int i10) {
        if (i10 % MediaController.VIDEO_BITRATE_480 == 0) {
            return (i10 / MediaController.VIDEO_BITRATE_480) + " Mbps";
        }
        if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        }
        return (i10 / MediaDataController.MAX_STYLE_RUNS_COUNT) + " kbps";
    }

    public final void V(int i10, CharSequence[] charSequenceArr, hk0 hk0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new mg.j(11, this, hk0Var));
        showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new a31(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.a = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new s4.b0());
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.im0 im0Var2 = this.a;
        b31 b31Var = new b31(context);
        this.b = b31Var;
        im0Var2.setAdapter(b31Var);
        this.a.setOnItemClickListener(new h11(this, 3));
        frameLayout.addView(this.a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
