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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g31 extends org.telegram.ui.ActionBar.r2 {
    public static final int[] c = {MediaController.VIDEO_BITRATE_360, MediaController.VIDEO_BITRATE_480, 1200000, 2000000};
    public org.telegram.ui.Components.mm0 a;
    public f31 b;

    public static String V(int i10) {
        if (i10 % MediaController.VIDEO_BITRATE_480 == 0) {
            return (i10 / MediaController.VIDEO_BITRATE_480) + " Mbps";
        }
        if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        }
        return (i10 / MediaDataController.MAX_STYLE_RUNS_COUNT) + " kbps";
    }

    public final void W(int i10, CharSequence[] charSequenceArr, org.telegram.ui.Components.voip.c1 c1Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new ng.j(11, this, c1Var));
        showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.a = mm0Var;
        mm0Var.u1();
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new s4.c0());
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.a;
        f31 f31Var = new f31(context);
        this.b = f31Var;
        mm0Var2.setAdapter(f31Var);
        this.a.setOnItemClickListener(new m11(this, 3));
        frameLayout.addView(this.a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
