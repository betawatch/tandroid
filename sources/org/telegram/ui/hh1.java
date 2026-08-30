package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class hh1 extends org.telegram.ui.ActionBar.p2 {
    public final SparseArray a;
    public l0 b;
    public gh1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public hh1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (fh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = fh1Var.a;
                if (p2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z4 = this.f;
                    float f10 = z4 ? this.e : 0.0f;
                    boolean z10 = this.h;
                    float f11 = fh1Var.f;
                    float f12 = f10 * r10;
                    fh1Var.f = f12;
                    boolean z11 = f12 > f11;
                    if (!fh1Var.d && r10 > 0.0f && z4 && p2Var.fragmentView != null) {
                        p2Var.onResume();
                        fh1Var.d = true;
                    }
                    if (!fh1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        p2Var.onTransitionAnimationStart(z11, false);
                        fh1Var.e = true;
                    }
                    if (fh1Var.e && f11 != f12) {
                        p2Var.onTransitionAnimationProgress(z11, z11 ? f12 : 1.0f - f12);
                    }
                    if (fh1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        p2Var.onTransitionAnimationEnd(z11, false);
                        fh1Var.e = false;
                    }
                    if (!fh1Var.c && f12 >= 1.0f) {
                        p2Var.onBecomeFullyVisible();
                        fh1Var.c = true;
                    }
                    if (fh1Var.c && ((f12 == 0.0f && !z10) || r10 == 0.0f)) {
                        p2Var.onBecomeFullyHidden();
                        fh1Var.c = false;
                    }
                    if (fh1Var.d && ((f12 == 0.0f && !z4) || r10 == 0.0f)) {
                        p2Var.onPause();
                        fh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.p2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.a;
        fh1 fh1Var = (fh1) sparseArray.get(i10);
        if (fh1Var != null) {
            org.telegram.ui.ActionBar.p2 p2Var = fh1Var.a;
            if (fh1Var.c) {
                p2Var.onBecomeFullyHidden();
            }
            if (fh1Var.d) {
                p2Var.onPause();
            }
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.p2 X() {
        gh1 gh1Var = this.c;
        if (gh1Var == null) {
            return null;
        }
        fh1 fh1Var = (fh1) this.a.get(gh1Var.getCurrentPosition());
        if (fh1Var != null) {
            return fh1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void clearViews() {
        gh1 gh1Var = this.c;
        if (gh1Var != null) {
            this.d = gh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i10);
            if (fh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = fh1Var.a;
                if (fh1Var.d) {
                    p2Var.onPause();
                    fh1Var.d = false;
                }
                p2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new l0((vg0) this, context, 13);
        gh1 gh1Var = new gh1(this, context);
        this.c = gh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        gh1Var.setPosition(this.d);
        this.c.setAdapter(new gg.u(this, context, 5));
        this.b.addView(this.c, k7.b6.c(-1.0f, -1));
        l0 l0Var = this.b;
        this.fragmentView = l0Var;
        il0 il0Var = new il0(this, 26);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(l0Var, il0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i10);
            if (fh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = fh1Var.a;
                if (p2Var.fragmentView != null) {
                    arrayList.addAll(p2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.p2 X = X();
        return (X == null || X.fragmentView == null) ? super.isLightStatusBar() : X.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean onBackPressed(boolean z4) {
        if (hasShownSheet()) {
            if (z4) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.p2 X = X();
        if (X == null || X.onBackPressed(z4)) {
            return super.onBackPressed(z4);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        U();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i10);
            boolean z4 = fh1Var.b;
            org.telegram.ui.ActionBar.p2 p2Var = fh1Var.a;
            if (z4) {
                p2Var.onFragmentDestroy();
                p2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onPause() {
        super.onPause();
        this.f = false;
        U();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        U();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        if (!z4) {
            f10 = 1.0f - f10;
        }
        this.e = f10;
        U();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.n = str;
        this.r = i10;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i11);
            if (fh1Var != null) {
                fh1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
