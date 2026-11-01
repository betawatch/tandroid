package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class hd1 extends org.telegram.ui.ActionBar.k2 {
    public final SparseArray a;
    public l0 b;
    public gd1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public hd1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void Z() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.a;
                if (k2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f7 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f10 = fd1Var.f;
                    float f11 = f7 * r10;
                    fd1Var.f = f11;
                    boolean z12 = f11 > f10;
                    if (!fd1Var.d && r10 > 0.0f && z10 && k2Var.fragmentView != null) {
                        k2Var.onResume();
                        fd1Var.d = true;
                    }
                    if (!fd1Var.e && ((f10 == 0.0f || f10 == 1.0f) && f10 != f11 && Math.abs(f10 - f11) != 1.0f)) {
                        k2Var.onTransitionAnimationStart(z12, false);
                        fd1Var.e = true;
                    }
                    if (fd1Var.e && f10 != f11) {
                        k2Var.onTransitionAnimationProgress(z12, z12 ? f11 : 1.0f - f11);
                    }
                    if (fd1Var.e && (f11 == 0.0f || f11 == 1.0f)) {
                        k2Var.onTransitionAnimationEnd(z12, false);
                        fd1Var.e = false;
                    }
                    if (!fd1Var.c && f11 >= 1.0f) {
                        k2Var.onBecomeFullyVisible();
                        fd1Var.c = true;
                    }
                    if (fd1Var.c && ((f11 == 0.0f && !z11) || r10 == 0.0f)) {
                        k2Var.onBecomeFullyHidden();
                        fd1Var.c = false;
                    }
                    if (fd1Var.d && ((f11 == 0.0f && !z10) || r10 == 0.0f)) {
                        k2Var.onPause();
                        fd1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.k2 a0(int i10);

    @Override // org.telegram.ui.ActionBar.k2
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.a;
                if (k2Var.fragmentView != null) {
                    k2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i10) {
        SparseArray sparseArray = this.a;
        fd1 fd1Var = (fd1) sparseArray.get(i10);
        if (fd1Var != null) {
            org.telegram.ui.ActionBar.k2 k2Var = fd1Var.a;
            if (fd1Var.c) {
                k2Var.onBecomeFullyHidden();
            }
            if (fd1Var.d) {
                k2Var.onPause();
            }
            k2Var.onFragmentDestroy();
            k2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.k2 c0() {
        gd1 gd1Var = this.c;
        if (gd1Var == null) {
            return null;
        }
        fd1 fd1Var = (fd1) this.a.get(gd1Var.getCurrentPosition());
        if (fd1Var != null) {
            return fd1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void clearViews() {
        gd1 gd1Var = this.c;
        if (gd1Var != null) {
            this.d = gd1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.a;
                if (fd1Var.d) {
                    k2Var.onPause();
                    fd1Var.d = false;
                }
                k2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new l0((of0) this, context, 15);
        gd1 gd1Var = new gd1(this, context);
        this.c = gd1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        gd1Var.setPosition(this.d);
        this.c.setAdapter(new mg.s(this, context, 7));
        this.b.addView(this.c, w7.b6.c(-1.0f, -1));
        l0 l0Var = this.b;
        this.fragmentView = l0Var;
        rj0 rj0Var = new rj0(this, 25);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(l0Var, rj0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.a;
                if (k2Var.fragmentView != null) {
                    arrayList.addAll(k2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.k2 c02 = c0();
        return (c02 == null || c02.fragmentView == null) ? super.isLightStatusBar() : c02.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.s5 s5Var;
        if (!hasShownSheet()) {
            org.telegram.ui.ActionBar.k2 c02 = c0();
            org.telegram.ui.ActionBar.i5 simpleActionBar = c02 != null ? c02.getSimpleActionBar() : null;
            if (simpleActionBar == null || ((s5Var = simpleActionBar.Q) == null && (simpleActionBar.G || !simpleActionBar.F))) {
                if (c02 == null || c02.onBackPressed(z10)) {
                    return super.onBackPressed(z10);
                }
            } else if (z10) {
                if (s5Var != null) {
                    s5Var.a(true);
                    return false;
                }
                if (!simpleActionBar.G && simpleActionBar.F) {
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

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            boolean z10 = fd1Var.b;
            org.telegram.ui.ActionBar.k2 k2Var = fd1Var.a;
            if (z10) {
                k2Var.onFragmentDestroy();
                k2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onPause() {
        super.onPause();
        this.f = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.k2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        Z();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.a;
                if (k2Var.fragmentView != null) {
                    try {
                        k2Var.onThemeColorsChanged();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.n = str;
        this.r = i10;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i11);
            if (fd1Var != null) {
                fd1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
