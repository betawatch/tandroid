package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fc0 extends org.telegram.ui.ActionBar.p2 {
    public FrameLayout a;
    public org.telegram.ui.Components.sl0 b;
    public f2.j0 c;
    public su d;
    public org.telegram.ui.Components.ic e;
    public int f;
    public final w3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public fc0() {
        super(null);
        this.h = new w3(this, 7);
        this.n = new boolean[3];
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        return i10 == this.f ? 2 : -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i11 >= arrayList.size()) {
                return;
            }
            if (((zb0) arrayList.get(i11)).e == i10) {
                this.b.d1(new hg.m2(this, i11, 12), 700, true);
                return;
            }
            i11++;
        }
    }

    public final void W(int i10) {
        int U = U(i10);
        if (U == -1) {
            return;
        }
        this.n[U] = true;
        Y();
        X();
    }

    public final void X() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        ArrayList arrayList2 = this.s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new zb0(1, 0, null, 0, 0));
        arrayList2.add(new zb0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
        arrayList2.add(new zb0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(zb0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(zb0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(zb0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(zb0.c(R.drawable.msg2_smile_status, LiteMode.FLAGS_ANIMATED_EMOJI, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(zb0.b(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(zb0.b(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(zb0.b(LiteMode.FLAG_ANIMATED_EMOJI_CHAT, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(zb0.c(R.drawable.msg2_ask_question, this.f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(zb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(zb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(zb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(zb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(zb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(zb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.a11.c()) {
                arrayList2.add(zb0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(zb0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(zb0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(zb0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(zb0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new zb0(2, 0, "", 0, 0));
        arrayList2.add(new zb0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new zb0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        if (this.b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt != null) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList = this.s;
                    if (R < arrayList.size()) {
                        zb0 zb0Var = (zb0) arrayList.get(R);
                        int i11 = zb0Var.a;
                        if (i11 == 3 || i11 == 4) {
                            ec0 ec0Var = (ec0) childAt;
                            ImageView imageView = ec0Var.e;
                            fc0 fc0Var = ec0Var.y;
                            int i12 = zb0Var.e;
                            if (i11 == 3) {
                                boolean z4 = Integer.bitCount(i12) > 1;
                                ec0Var.v = z4;
                                if (z4) {
                                    ec0Var.c(zb0Var, true);
                                    int U = fc0Var.U(i12);
                                    imageView.clearAnimation();
                                    b.p(imageView.animate().rotation((U < 0 || !fc0Var.n[U]) ? 0.0f : 180.0f), org.telegram.ui.Components.pr.h, 240L);
                                }
                                ec0Var.f.c(LiteMode.isEnabled(i12), true);
                            } else {
                                ec0Var.h.a(LiteMode.isEnabled(i12), true);
                            }
                            ec0Var.b(LiteMode.isPowerSaverApplied(), true);
                        } else if (i11 == 1) {
                            ((dc0) childAt).a();
                        }
                    }
                }
            }
        }
        if (this.e == null || LiteMode.isPowerSaverApplied()) {
            return;
        }
        this.e.b();
        this.e = null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 21));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.b = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.b);
        org.telegram.ui.Components.sl0 sl0Var2 = this.b;
        f2.j0 j0Var = new f2.j0();
        this.c = j0Var;
        sl0Var2.setLayoutManager(j0Var);
        org.telegram.ui.Components.sl0 sl0Var3 = this.b;
        su suVar = new su(this, 1);
        this.d = suVar;
        sl0Var3.setAdapter(suVar);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.m = false;
        this.b.setItemAnimator(lVar);
        this.a.addView(this.b, k7.c6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new gu(this, 16));
        this.fragmentView = this.a;
        this.f = AndroidUtilities.isTablet() ? 360864 : LiteMode.FLAGS_CHAT;
        X();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        LiteMode.removeOnPowerSaverAppliedListener(this.h);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LiteMode.addOnPowerSaverAppliedListener(this.h);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        LiteMode.savePreference();
        org.telegram.ui.Components.l5.u();
        org.telegram.ui.ActionBar.k6.o1(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }
}
