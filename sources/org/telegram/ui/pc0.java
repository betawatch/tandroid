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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pc0 extends org.telegram.ui.ActionBar.n2 {
    public FrameLayout a;
    public org.telegram.ui.Components.yl0 b;
    public s4.c0 c;
    public uu d;
    public org.telegram.ui.Components.pc e;
    public int f;
    public final s3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public pc0() {
        super(null);
        this.h = new s3(this, 7);
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
            if (((jc0) arrayList.get(i11)).e == i10) {
                this.b.f1(new i2.s(this, i11, 12), 700, true);
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
        arrayList2.add(new jc0(1, 0, null, 0, 0));
        arrayList2.add(new jc0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
        arrayList2.add(new jc0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(jc0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(jc0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(jc0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(jc0.c(R.drawable.msg2_smile_status, LiteMode.FLAGS_ANIMATED_EMOJI, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(jc0.b(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(jc0.b(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(jc0.b(LiteMode.FLAG_ANIMATED_EMOJI_CHAT, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(jc0.c(R.drawable.msg2_ask_question, this.f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(jc0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(jc0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(jc0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(jc0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(jc0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(jc0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.n11.c()) {
                arrayList2.add(jc0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(jc0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(jc0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(jc0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(jc0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new jc0(2, 0, "", 0, 0));
        arrayList2.add(new jc0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new jc0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
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
                int S = RecyclerView.S(childAt);
                if (S >= 0) {
                    ArrayList arrayList = this.s;
                    if (S < arrayList.size()) {
                        jc0 jc0Var = (jc0) arrayList.get(S);
                        int i11 = jc0Var.a;
                        if (i11 == 3 || i11 == 4) {
                            oc0 oc0Var = (oc0) childAt;
                            ImageView imageView = oc0Var.e;
                            pc0 pc0Var = oc0Var.y;
                            int i12 = jc0Var.e;
                            if (i11 == 3) {
                                boolean z10 = Integer.bitCount(i12) > 1;
                                oc0Var.v = z10;
                                if (z10) {
                                    oc0Var.c(jc0Var, true);
                                    int U = pc0Var.U(i12);
                                    imageView.clearAnimation();
                                    org.telegram.messenger.rk.s(imageView.animate().rotation((U < 0 || !pc0Var.n[U]) ? 0.0f : 180.0f), org.telegram.ui.Components.qr.h, 240L);
                                }
                                oc0Var.f.c(LiteMode.isEnabled(i12), true);
                            } else {
                                oc0Var.h.a(LiteMode.isEnabled(i12), true);
                            }
                            oc0Var.b(LiteMode.isPowerSaverApplied(), true);
                        } else if (i11 == 1) {
                            ((nc0) childAt).a();
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

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 4));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.b = yl0Var;
        yl0Var.q1();
        org.telegram.ui.Components.yl0 yl0Var2 = this.b;
        s4.c0 c0Var = new s4.c0();
        this.c = c0Var;
        yl0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.yl0 yl0Var3 = this.b;
        uu uuVar = new uu(this, 1);
        this.d = uuVar;
        yl0Var3.setAdapter(uuVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        this.a.addView(this.b, w7.y5.c(-1.0f, -1));
        this.b.setOnItemClickListener(new fu(this, 17));
        this.fragmentView = this.a;
        this.f = AndroidUtilities.isTablet() ? 360864 : LiteMode.FLAGS_CHAT;
        X();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.yl0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        LiteMode.removeOnPowerSaverAppliedListener(this.h);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LiteMode.addOnPowerSaverAppliedListener(this.h);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        LiteMode.savePreference();
        org.telegram.ui.Components.p5.u();
        org.telegram.ui.ActionBar.j6.o1(true);
    }
}
