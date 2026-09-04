package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class bi1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray a;
    public j0 b;
    public ai1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public bi1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (zh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = zh1Var.a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f7 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f10 = zh1Var.f;
                    float f11 = f7 * r10;
                    zh1Var.f = f11;
                    boolean z12 = f11 > f10;
                    if (!zh1Var.d && r10 > 0.0f && z10 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        zh1Var.d = true;
                    }
                    if (!zh1Var.e && ((f10 == 0.0f || f10 == 1.0f) && f10 != f11 && Math.abs(f10 - f11) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z12, false);
                        zh1Var.e = true;
                    }
                    if (zh1Var.e && f10 != f11) {
                        n2Var.onTransitionAnimationProgress(z12, z12 ? f11 : 1.0f - f11);
                    }
                    if (zh1Var.e && (f11 == 0.0f || f11 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z12, false);
                        zh1Var.e = false;
                    }
                    if (!zh1Var.c && f11 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        zh1Var.c = true;
                    }
                    if (zh1Var.c && ((f11 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        zh1Var.c = false;
                    }
                    if (zh1Var.d && ((f11 == 0.0f && !z10) || r10 == 0.0f)) {
                        n2Var.onPause();
                        zh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.a;
        zh1 zh1Var = (zh1) sparseArray.get(i10);
        if (zh1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = zh1Var.a;
            if (zh1Var.c) {
                n2Var.onBecomeFullyHidden();
            }
            if (zh1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        ai1 ai1Var = this.c;
        if (ai1Var == null) {
            return null;
        }
        zh1 zh1Var = (zh1) this.a.get(ai1Var.getCurrentPosition());
        if (zh1Var != null) {
            return zh1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void clearViews() {
        ai1 ai1Var = this.c;
        if (ai1Var != null) {
            this.d = ai1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i10);
            if (zh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = zh1Var.a;
                if (zh1Var.d) {
                    n2Var.onPause();
                    zh1Var.d = false;
                }
                n2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new j0((eh0) this, context, 13);
        ai1 ai1Var = new ai1(this, context);
        this.c = ai1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        ai1Var.setPosition(this.d);
        this.c.setAdapter(new hw0(this, context, 3));
        this.b.addView(this.c, w7.x5.c(-1.0f, -1));
        j0 j0Var = this.b;
        this.fragmentView = j0Var;
        vl0 vl0Var = new vl0(this, 26);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(j0Var, vl0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i10);
            if (zh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = zh1Var.a;
                if (n2Var.fragmentView != null) {
                    arrayList.addAll(n2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.n2 X = X();
        return (X == null || X.fragmentView == null) ? super.isLightStatusBar() : X.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.n2 X = X();
        if (X == null || X.onBackPressed(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        U();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i10);
            boolean z10 = zh1Var.b;
            org.telegram.ui.ActionBar.n2 n2Var = zh1Var.a;
            if (z10) {
                n2Var.onFragmentDestroy();
                n2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onPause() {
        super.onPause();
        this.f = false;
        U();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        U();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        U();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.n = str;
        this.r = i10;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i11);
            if (zh1Var != null) {
                zh1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
