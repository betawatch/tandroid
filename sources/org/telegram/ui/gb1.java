package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class gb1 extends org.telegram.ui.ActionBar.d2 {
    public final SparseArray a;
    public l0 b;
    public fb1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public gb1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void Z() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            int keyAt = sparseArray.keyAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.a;
                if (d2Var.fragmentView != null) {
                    float p10 = this.c.p(keyAt);
                    boolean z10 = this.f;
                    float f10 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f11 = eb1Var.f;
                    float f12 = f10 * p10;
                    eb1Var.f = f12;
                    boolean z12 = f12 > f11;
                    if (!eb1Var.d && p10 > 0.0f && z10 && d2Var.fragmentView != null) {
                        d2Var.onResume();
                        eb1Var.d = true;
                    }
                    if (!eb1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        d2Var.onTransitionAnimationStart(z12, false);
                        eb1Var.e = true;
                    }
                    if (eb1Var.e && f11 != f12) {
                        d2Var.onTransitionAnimationProgress(z12, z12 ? f12 : 1.0f - f12);
                    }
                    if (eb1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        d2Var.onTransitionAnimationEnd(z12, false);
                        eb1Var.e = false;
                    }
                    if (!eb1Var.c && f12 >= 1.0f) {
                        d2Var.onBecomeFullyVisible();
                        eb1Var.c = true;
                    }
                    if (eb1Var.c && ((f12 == 0.0f && !z11) || p10 == 0.0f)) {
                        d2Var.onBecomeFullyHidden();
                        eb1Var.c = false;
                    }
                    if (eb1Var.d && ((f12 == 0.0f && !z10) || p10 == 0.0f)) {
                        d2Var.onPause();
                        eb1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.d2 a0(int i3);

    @Override // org.telegram.ui.ActionBar.d2
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.a;
                if (d2Var.fragmentView != null) {
                    d2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i3) {
        SparseArray sparseArray = this.a;
        eb1 eb1Var = (eb1) sparseArray.get(i3);
        if (eb1Var != null) {
            org.telegram.ui.ActionBar.d2 d2Var = eb1Var.a;
            if (eb1Var.c) {
                d2Var.onBecomeFullyHidden();
            }
            if (eb1Var.d) {
                d2Var.onPause();
            }
            d2Var.onFragmentDestroy();
            d2Var.setParentLayout(null);
        }
        sparseArray.remove(i3);
    }

    public final org.telegram.ui.ActionBar.d2 c0() {
        fb1 fb1Var = this.c;
        if (fb1Var == null) {
            return null;
        }
        eb1 eb1Var = (eb1) this.a.get(fb1Var.getCurrentPosition());
        if (eb1Var != null) {
            return eb1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void clearViews() {
        fb1 fb1Var = this.c;
        if (fb1Var != null) {
            this.d = fb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.a;
                if (eb1Var.d) {
                    d2Var.onPause();
                    eb1Var.d = false;
                }
                d2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new l0(14, context, (ee0) this);
        fb1 fb1Var = new fb1(this, context);
        this.c = fb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        fb1Var.setPosition(this.d);
        this.c.setAdapter(new ci.o4(8, context, this));
        this.b.addView(this.c, b8.mf.c(-1.0f, -1));
        l0 l0Var = this.b;
        this.fragmentView = l0Var;
        ci0 ci0Var = new ci0(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(l0Var, ci0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.a;
                if (d2Var.fragmentView != null) {
                    arrayList.addAll(d2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.d2 c02 = c0();
        return (c02 == null || c02.fragmentView == null) ? super.isLightStatusBar() : c02.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var;
        if (!hasShownSheet()) {
            org.telegram.ui.ActionBar.d2 c02 = c0();
            org.telegram.ui.ActionBar.y4 simpleActionBar = c02 != null ? c02.getSimpleActionBar() : null;
            if (simpleActionBar == null || ((i5Var = simpleActionBar.R) == null && (simpleActionBar.H || !simpleActionBar.G))) {
                if (c02 == null || c02.onBackPressed(z10)) {
                    return super.onBackPressed(z10);
                }
            } else if (z10) {
                if (i5Var != null) {
                    i5Var.a(true);
                    return false;
                }
                if (!simpleActionBar.H && simpleActionBar.G) {
                    simpleActionBar.j(true);
                }
                return false;
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            boolean z10 = eb1Var.b;
            org.telegram.ui.ActionBar.d2 d2Var = eb1Var.a;
            if (z10) {
                d2Var.onFragmentDestroy();
                d2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onPause() {
        super.onPause();
        this.f = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i3, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        Z();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.a;
                if (d2Var.fragmentView != null) {
                    try {
                        d2Var.onThemeColorsChanged();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        if (!z10) {
            f10 = 1.0f - f10;
        }
        this.e = f10;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void setTitleOverlayText(String str, int i3, Runnable runnable) {
        super.setTitleOverlayText(str, i3, runnable);
        this.n = str;
        this.r = i3;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i10);
            if (eb1Var != null) {
                eb1Var.a.setTitleOverlayText(str, i3, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i3, Runnable runnable) {
        setTitleOverlayText(str, i3, runnable);
    }
}
