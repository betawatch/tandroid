package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class qb1 extends org.telegram.ui.ActionBar.h2 {
    public final SparseArray a;
    public k0 b;
    public pb1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public qb1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.a;
                if (h2Var.fragmentView != null) {
                    float m10 = this.c.m(keyAt);
                    boolean z10 = this.f;
                    float f10 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    if (ob1Var.g <= 0.0f && m10 > 0.0f && z10 && (h2Var instanceof le0)) {
                    }
                    ob1Var.g = m10;
                    float f11 = ob1Var.f;
                    float f12 = f10 * m10;
                    ob1Var.f = f12;
                    boolean z12 = f12 > f11;
                    if (!ob1Var.d && m10 > 0.0f && z10 && h2Var.fragmentView != null) {
                        h2Var.onResume();
                        ob1Var.d = true;
                    }
                    if (!ob1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        h2Var.onTransitionAnimationStart(z12, false);
                        ob1Var.e = true;
                    }
                    if (ob1Var.e && f11 != f12) {
                        h2Var.onTransitionAnimationProgress(z12, z12 ? f12 : 1.0f - f12);
                    }
                    if (ob1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        h2Var.onTransitionAnimationEnd(z12, false);
                        ob1Var.e = false;
                    }
                    if (!ob1Var.c && f12 >= 1.0f) {
                        h2Var.onBecomeFullyVisible();
                        ob1Var.c = true;
                    }
                    if (ob1Var.c && ((f12 == 0.0f && !z11) || m10 == 0.0f)) {
                        h2Var.onBecomeFullyHidden();
                        ob1Var.c = false;
                    }
                    if (ob1Var.d && ((f12 == 0.0f && !z10) || m10 == 0.0f)) {
                        h2Var.onPause();
                        ob1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.h2 a0(int i7);

    @Override // org.telegram.ui.ActionBar.h2
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.a;
                if (h2Var.fragmentView != null) {
                    h2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.a;
        ob1 ob1Var = (ob1) sparseArray.get(i7);
        if (ob1Var != null) {
            org.telegram.ui.ActionBar.h2 h2Var = ob1Var.a;
            if (ob1Var.c) {
                h2Var.onBecomeFullyHidden();
            }
            if (ob1Var.d) {
                h2Var.onPause();
            }
            h2Var.onFragmentDestroy();
            h2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.h2 c0() {
        pb1 pb1Var = this.c;
        if (pb1Var == null) {
            return null;
        }
        ob1 ob1Var = (ob1) this.a.get(pb1Var.getCurrentPosition());
        if (ob1Var != null) {
            return ob1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void clearViews() {
        pb1 pb1Var = this.c;
        if (pb1Var != null) {
            this.d = pb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.a;
                if (ob1Var.d) {
                    h2Var.onPause();
                    ob1Var.d = false;
                }
                h2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new k0(14, context, (me0) this);
        pb1 pb1Var = new pb1(this, context);
        this.c = pb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        pb1Var.setPosition(this.d);
        this.c.setAdapter(new di.i4(8, context, this));
        this.b.addView(this.c, c8.ma.c(-1.0f, -1));
        k0 k0Var = this.b;
        this.fragmentView = k0Var;
        qi0 qi0Var = new qi0(this, 24);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, qi0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.a;
                if (h2Var.fragmentView != null) {
                    arrayList.addAll(h2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        return (c02 == null || c02.fragmentView == null) ? super.isLightStatusBar() : c02.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            org.telegram.ui.ActionBar.h2 c02 = c0();
            org.telegram.ui.ActionBar.a5 simpleActionBar = c02 != null ? c02.getSimpleActionBar() : null;
            if (simpleActionBar == null || (simpleActionBar.R == null && (simpleActionBar.H || !simpleActionBar.G))) {
                if (c02 == null || c02.onBackPressed(z10)) {
                    return super.onBackPressed(z10);
                }
            } else if (z10) {
                simpleActionBar.A();
                return false;
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            boolean z10 = ob1Var.b;
            org.telegram.ui.ActionBar.h2 h2Var = ob1Var.a;
            if (z10) {
                h2Var.onFragmentDestroy();
                h2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public void onPause() {
        super.onPause();
        this.f = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        Z();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.a;
                if (h2Var.fragmentView != null) {
                    try {
                        h2Var.onThemeColorsChanged();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        if (!z10) {
            f10 = 1.0f - f10;
        }
        this.e = f10;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.n = str;
        this.r = i7;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i10);
            if (ob1Var != null) {
                ob1Var.a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
