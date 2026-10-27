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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i31 extends org.telegram.ui.ActionBar.r2 {
    public static final int[] c = {MediaController.VIDEO_BITRATE_360, MediaController.VIDEO_BITRATE_480, 1200000, 2000000};
    public org.telegram.ui.Components.nm0 a;
    public h31 b;

    public static void V(i31 i31Var, int i10) {
        if (i10 == 1) {
            wi.a aVar = wi.e.d;
            boolean z10 = !org.telegram.ui.Components.u60.d(i31Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.c = true;
                aVar.b = true;
                wi.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
            }
            i31Var.b.l();
            return;
        }
        if (!org.telegram.ui.Components.u60.d(i31Var.currentAccount)) {
            return;
        }
        int i11 = 0;
        if (i10 == 2) {
            i31Var.Z(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.c1(22));
            return;
        }
        if (i10 == 3) {
            i31Var.Z(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.c1(23));
            return;
        }
        if (i10 == 4) {
            i31Var.Z(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.c1(24));
            return;
        }
        if (i10 != 5) {
            if (i10 == 8) {
                wi.a aVar2 = wi.e.i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                i31Var.b.m(i10);
                return;
            }
            return;
        }
        CharSequence[] charSequenceArr = new CharSequence[4];
        while (true) {
            int[] iArr = c;
            if (i11 >= 3) {
                i31Var.Z(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.c1(25));
                return;
            } else {
                charSequenceArr[i11] = Y(iArr[i11]);
                i11++;
            }
        }
    }

    public static String Y(int i10) {
        if (i10 % MediaController.VIDEO_BITRATE_480 == 0) {
            return (i10 / MediaController.VIDEO_BITRATE_480) + " Mbps";
        }
        if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        }
        return (i10 / MediaDataController.MAX_STYLE_RUNS_COUNT) + " kbps";
    }

    public final void Z(int i10, CharSequence[] charSequenceArr, org.telegram.ui.Components.voip.c1 c1Var) {
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.a = nm0Var;
        nm0Var.u1();
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new s4.c0());
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.nm0 nm0Var2 = this.a;
        h31 h31Var = new h31(this, context);
        this.b = h31Var;
        nm0Var2.setAdapter(h31Var);
        this.a.setOnItemClickListener(new o11(this, 3));
        frameLayout.addView(this.a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
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
