package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class ji1 extends org.telegram.ui.ActionBar.m2 {
    public final SparseArray a;
    public l0 b;
    public ii1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public ji1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (hi1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = hi1Var.a;
                if (m2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f7 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f10 = hi1Var.f;
                    float f11 = f7 * r10;
                    hi1Var.f = f11;
                    boolean z12 = f11 > f10;
                    if (!hi1Var.d && r10 > 0.0f && z10 && m2Var.fragmentView != null) {
                        m2Var.onResume();
                        hi1Var.d = true;
                    }
                    if (!hi1Var.e && ((f10 == 0.0f || f10 == 1.0f) && f10 != f11 && Math.abs(f10 - f11) != 1.0f)) {
                        m2Var.onTransitionAnimationStart(z12, false);
                        hi1Var.e = true;
                    }
                    if (hi1Var.e && f10 != f11) {
                        m2Var.onTransitionAnimationProgress(z12, z12 ? f11 : 1.0f - f11);
                    }
                    if (hi1Var.e && (f11 == 0.0f || f11 == 1.0f)) {
                        m2Var.onTransitionAnimationEnd(z12, false);
                        hi1Var.e = false;
                    }
                    if (!hi1Var.c && f11 >= 1.0f) {
                        m2Var.onBecomeFullyVisible();
                        hi1Var.c = true;
                    }
                    if (hi1Var.c && ((f11 == 0.0f && !z11) || r10 == 0.0f)) {
                        m2Var.onBecomeFullyHidden();
                        hi1Var.c = false;
                    }
                    if (hi1Var.d && ((f11 == 0.0f && !z10) || r10 == 0.0f)) {
                        m2Var.onPause();
                        hi1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.m2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.a;
        hi1 hi1Var = (hi1) sparseArray.get(i10);
        if (hi1Var != null) {
            org.telegram.ui.ActionBar.m2 m2Var = hi1Var.a;
            if (hi1Var.c) {
                m2Var.onBecomeFullyHidden();
            }
            if (hi1Var.d) {
                m2Var.onPause();
            }
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.m2 X() {
        ii1 ii1Var = this.c;
        if (ii1Var == null) {
            return null;
        }
        hi1 hi1Var = (hi1) this.a.get(ii1Var.getCurrentPosition());
        if (hi1Var != null) {
            return hi1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void clearViews() {
        ii1 ii1Var = this.c;
        if (ii1Var != null) {
            this.d = ii1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i10);
            if (hi1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = hi1Var.a;
                if (hi1Var.d) {
                    m2Var.onPause();
                    hi1Var.d = false;
                }
                m2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new l0((jh0) this, context, 13);
        ii1 ii1Var = new ii1(this, context);
        this.c = ii1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        ii1Var.setPosition(this.d);
        this.c.setAdapter(new nw0(this, context, 3));
        this.b.addView(this.c, w7.z5.d(-1.0f, -1));
        l0 l0Var = this.b;
        this.fragmentView = l0Var;
        lq0 lq0Var = new lq0(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(l0Var, lq0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i10);
            if (hi1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = hi1Var.a;
                if (m2Var.fragmentView != null) {
                    arrayList.addAll(m2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.m2 X = X();
        return (X == null || X.fragmentView == null) ? super.isLightStatusBar() : X.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.m2 X = X();
        if (X == null || X.onBackPressed(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        U();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i10);
            boolean z10 = hi1Var.b;
            org.telegram.ui.ActionBar.m2 m2Var = hi1Var.a;
            if (z10) {
                m2Var.onFragmentDestroy();
                m2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public void onPause() {
        super.onPause();
        this.f = false;
        U();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        U();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        U();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.n = str;
        this.r = i10;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i11);
            if (hi1Var != null) {
                hi1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
