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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class e31 extends org.telegram.ui.ActionBar.o2 {
    public static final int[] c = {MediaController.VIDEO_BITRATE_360, MediaController.VIDEO_BITRATE_480, 1200000, 2000000};
    public org.telegram.ui.Components.mm0 a;
    public d31 b;

    public static String U(int i10) {
        if (i10 % MediaController.VIDEO_BITRATE_480 == 0) {
            return (i10 / MediaController.VIDEO_BITRATE_480) + " Mbps";
        }
        if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        }
        return (i10 / MediaDataController.MAX_STYLE_RUNS_COUNT) + " kbps";
    }

    public final void V(int i10, CharSequence[] charSequenceArr, wv wvVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new mg.j(11, this, wvVar));
        showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new c31(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.a = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new s4.b0());
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.a;
        d31 d31Var = new d31(context);
        this.b = d31Var;
        mm0Var2.setAdapter(d31Var);
        this.a.setOnItemClickListener(new j11(this, 3));
        frameLayout.addView(this.a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
