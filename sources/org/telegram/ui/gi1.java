package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class gi1 extends org.telegram.ui.ActionBar.p2 {
    public final SparseArray a;
    public k0 b;
    public fi1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public gi1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ei1 ei1Var = (ei1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (ei1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = ei1Var.a;
                if (p2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f7 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f10 = ei1Var.f;
                    float f11 = f7 * r10;
                    ei1Var.f = f11;
                    boolean z12 = f11 > f10;
                    if (!ei1Var.d && r10 > 0.0f && z10 && p2Var.fragmentView != null) {
                        p2Var.onResume();
                        ei1Var.d = true;
                    }
                    if (!ei1Var.e && ((f10 == 0.0f || f10 == 1.0f) && f10 != f11 && Math.abs(f10 - f11) != 1.0f)) {
                        p2Var.onTransitionAnimationStart(z12, false);
                        ei1Var.e = true;
                    }
                    if (ei1Var.e && f10 != f11) {
                        p2Var.onTransitionAnimationProgress(z12, z12 ? f11 : 1.0f - f11);
                    }
                    if (ei1Var.e && (f11 == 0.0f || f11 == 1.0f)) {
                        p2Var.onTransitionAnimationEnd(z12, false);
                        ei1Var.e = false;
                    }
                    if (!ei1Var.c && f11 >= 1.0f) {
                        p2Var.onBecomeFullyVisible();
                        ei1Var.c = true;
                    }
                    if (ei1Var.c && ((f11 == 0.0f && !z11) || r10 == 0.0f)) {
                        p2Var.onBecomeFullyHidden();
                        ei1Var.c = false;
                    }
                    if (ei1Var.d && ((f11 == 0.0f && !z10) || r10 == 0.0f)) {
                        p2Var.onPause();
                        ei1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.p2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.a;
        ei1 ei1Var = (ei1) sparseArray.get(i10);
        if (ei1Var != null) {
            org.telegram.ui.ActionBar.p2 p2Var = ei1Var.a;
            if (ei1Var.c) {
                p2Var.onBecomeFullyHidden();
            }
            if (ei1Var.d) {
                p2Var.onPause();
            }
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.p2 X() {
        fi1 fi1Var = this.c;
        if (fi1Var == null) {
            return null;
        }
        ei1 ei1Var = (ei1) this.a.get(fi1Var.getCurrentPosition());
        if (ei1Var != null) {
            return ei1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void clearViews() {
        fi1 fi1Var = this.c;
        if (fi1Var != null) {
            this.d = fi1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ei1 ei1Var = (ei1) sparseArray.valueAt(i10);
            if (ei1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = ei1Var.a;
                if (ei1Var.d) {
                    p2Var.onPause();
                    ei1Var.d = false;
                }
                p2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new k0((fh0) this, context, 13);
        fi1 fi1Var = new fi1(this, context);
        this.c = fi1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        fi1Var.setPosition(this.d);
        this.c.setAdapter(new kw0(this, context, 3));
        this.b.addView(this.c, w7.a6.c(-1.0f, -1));
        k0 k0Var = this.b;
        this.fragmentView = k0Var;
        ul0 ul0Var = new ul0(this, 26);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(k0Var, ul0Var);
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
            ei1 ei1Var = (ei1) sparseArray.valueAt(i10);
            if (ei1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = ei1Var.a;
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
    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.p2 X = X();
        if (X == null || X.onBackPressed(z10)) {
            return super.onBackPressed(z10);
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
            ei1 ei1Var = (ei1) sparseArray.valueAt(i10);
            boolean z10 = ei1Var.b;
            org.telegram.ui.ActionBar.p2 p2Var = ei1Var.a;
            if (z10) {
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
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
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
            ei1 ei1Var = (ei1) sparseArray.valueAt(i11);
            if (ei1Var != null) {
                ei1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
