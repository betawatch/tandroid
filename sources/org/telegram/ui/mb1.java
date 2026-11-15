package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class mb1 extends org.telegram.ui.ActionBar.e2 {
    public final SparseArray a;
    public k0 b;
    public lb1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public mb1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void Z() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.a;
                if (e2Var.fragmentView != null) {
                    float o4 = this.c.o(keyAt);
                    boolean z10 = this.f;
                    float f10 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f11 = kb1Var.f;
                    float f12 = f10 * o4;
                    kb1Var.f = f12;
                    boolean z12 = f12 > f11;
                    if (!kb1Var.d && o4 > 0.0f && z10 && e2Var.fragmentView != null) {
                        e2Var.onResume();
                        kb1Var.d = true;
                    }
                    if (!kb1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        e2Var.onTransitionAnimationStart(z12, false);
                        kb1Var.e = true;
                    }
                    if (kb1Var.e && f11 != f12) {
                        e2Var.onTransitionAnimationProgress(z12, z12 ? f12 : 1.0f - f12);
                    }
                    if (kb1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        e2Var.onTransitionAnimationEnd(z12, false);
                        kb1Var.e = false;
                    }
                    if (!kb1Var.c && f12 >= 1.0f) {
                        e2Var.onBecomeFullyVisible();
                        kb1Var.c = true;
                    }
                    if (kb1Var.c && ((f12 == 0.0f && !z11) || o4 == 0.0f)) {
                        e2Var.onBecomeFullyHidden();
                        kb1Var.c = false;
                    }
                    if (kb1Var.d && ((f12 == 0.0f && !z10) || o4 == 0.0f)) {
                        e2Var.onPause();
                        kb1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.e2 a0(int i7);

    @Override // org.telegram.ui.ActionBar.e2
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.a;
                if (e2Var.fragmentView != null) {
                    e2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.a;
        kb1 kb1Var = (kb1) sparseArray.get(i7);
        if (kb1Var != null) {
            org.telegram.ui.ActionBar.e2 e2Var = kb1Var.a;
            if (kb1Var.c) {
                e2Var.onBecomeFullyHidden();
            }
            if (kb1Var.d) {
                e2Var.onPause();
            }
            e2Var.onFragmentDestroy();
            e2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.e2 c0() {
        lb1 lb1Var = this.c;
        if (lb1Var == null) {
            return null;
        }
        kb1 kb1Var = (kb1) this.a.get(lb1Var.getCurrentPosition());
        if (kb1Var != null) {
            return kb1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void clearViews() {
        lb1 lb1Var = this.c;
        if (lb1Var != null) {
            this.d = lb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.a;
                if (kb1Var.d) {
                    e2Var.onPause();
                    kb1Var.d = false;
                }
                e2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new k0(14, context, (je0) this);
        lb1 lb1Var = new lb1(this, context);
        this.c = lb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        lb1Var.setPosition(this.d);
        this.c.setAdapter(new di.f4(8, context, this));
        this.b.addView(this.c, c8.ja.c(-1.0f, -1));
        k0 k0Var = this.b;
        this.fragmentView = k0Var;
        ni0 ni0Var = new ni0(this, 24);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, ni0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.a;
                if (e2Var.fragmentView != null) {
                    arrayList.addAll(e2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.e2 c02 = c0();
        return (c02 == null || c02.fragmentView == null) ? super.isLightStatusBar() : c02.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.g5 g5Var;
        if (!hasShownSheet()) {
            org.telegram.ui.ActionBar.e2 c02 = c0();
            org.telegram.ui.ActionBar.w4 simpleActionBar = c02 != null ? c02.getSimpleActionBar() : null;
            if (simpleActionBar == null || ((g5Var = simpleActionBar.R) == null && (simpleActionBar.H || !simpleActionBar.G))) {
                if (c02 == null || c02.onBackPressed(z10)) {
                    return super.onBackPressed(z10);
                }
            } else if (z10) {
                if (g5Var != null) {
                    g5Var.a(true);
                    return false;
                }
                if (!simpleActionBar.H && simpleActionBar.G) {
                    simpleActionBar.m(true);
                }
                return false;
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            boolean z10 = kb1Var.b;
            org.telegram.ui.ActionBar.e2 e2Var = kb1Var.a;
            if (z10) {
                e2Var.onFragmentDestroy();
                e2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public void onPause() {
        super.onPause();
        this.f = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.e2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        Z();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.a;
                if (e2Var.fragmentView != null) {
                    try {
                        e2Var.onThemeColorsChanged();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        if (!z10) {
            f10 = 1.0f - f10;
        }
        this.e = f10;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.n = str;
        this.r = i7;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i10);
            if (kb1Var != null) {
                kb1Var.a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
