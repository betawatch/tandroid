package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class nb1 extends org.telegram.ui.ActionBar.f2 {
    public final SparseArray a;
    public k0 b;
    public mb1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public nb1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void Z() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.a;
                if (f2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z9 = this.f;
                    float f10 = z9 ? this.e : 0.0f;
                    boolean z10 = this.h;
                    float f11 = lb1Var.f;
                    float f12 = f10 * r10;
                    lb1Var.f = f12;
                    boolean z11 = f12 > f11;
                    if (!lb1Var.d && r10 > 0.0f && z9 && f2Var.fragmentView != null) {
                        f2Var.onResume();
                        lb1Var.d = true;
                    }
                    if (!lb1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        f2Var.onTransitionAnimationStart(z11, false);
                        lb1Var.e = true;
                    }
                    if (lb1Var.e && f11 != f12) {
                        f2Var.onTransitionAnimationProgress(z11, z11 ? f12 : 1.0f - f12);
                    }
                    if (lb1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        f2Var.onTransitionAnimationEnd(z11, false);
                        lb1Var.e = false;
                    }
                    if (!lb1Var.c && f12 >= 1.0f) {
                        f2Var.onBecomeFullyVisible();
                        lb1Var.c = true;
                    }
                    if (lb1Var.c && ((f12 == 0.0f && !z10) || r10 == 0.0f)) {
                        f2Var.onBecomeFullyHidden();
                        lb1Var.c = false;
                    }
                    if (lb1Var.d && ((f12 == 0.0f && !z9) || r10 == 0.0f)) {
                        f2Var.onPause();
                        lb1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.f2 a0(int i7);

    @Override // org.telegram.ui.ActionBar.f2
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.a;
                if (f2Var.fragmentView != null) {
                    f2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.a;
        lb1 lb1Var = (lb1) sparseArray.get(i7);
        if (lb1Var != null) {
            org.telegram.ui.ActionBar.f2 f2Var = lb1Var.a;
            if (lb1Var.c) {
                f2Var.onBecomeFullyHidden();
            }
            if (lb1Var.d) {
                f2Var.onPause();
            }
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.f2 c0() {
        mb1 mb1Var = this.c;
        if (mb1Var == null) {
            return null;
        }
        lb1 lb1Var = (lb1) this.a.get(mb1Var.getCurrentPosition());
        if (lb1Var != null) {
            return lb1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void clearViews() {
        mb1 mb1Var = this.c;
        if (mb1Var != null) {
            this.d = mb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.a;
                if (lb1Var.d) {
                    f2Var.onPause();
                    lb1Var.d = false;
                }
                f2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new k0(14, context, (je0) this);
        mb1 mb1Var = new mb1(this, context);
        this.c = mb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        mb1Var.setPosition(this.d);
        this.c.setAdapter(new bi.g5(8, context, this));
        this.b.addView(this.c, c8.ha.c(-1.0f, -1));
        k0 k0Var = this.b;
        this.fragmentView = k0Var;
        li0 li0Var = new li0(this, 24);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, li0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.a;
                if (f2Var.fragmentView != null) {
                    arrayList.addAll(f2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        return (c02 == null || c02.fragmentView == null) ? super.isLightStatusBar() : c02.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public boolean onBackPressed(boolean z9) {
        org.telegram.ui.ActionBar.i5 i5Var;
        if (!hasShownSheet()) {
            org.telegram.ui.ActionBar.f2 c02 = c0();
            org.telegram.ui.ActionBar.y4 simpleActionBar = c02 != null ? c02.getSimpleActionBar() : null;
            if (simpleActionBar == null || ((i5Var = simpleActionBar.Q) == null && (simpleActionBar.G || !simpleActionBar.F))) {
                if (c02 == null || c02.onBackPressed(z9)) {
                    return super.onBackPressed(z9);
                }
            } else if (z9) {
                if (i5Var != null) {
                    i5Var.a(true);
                    return false;
                }
                if (!simpleActionBar.G && simpleActionBar.F) {
                    simpleActionBar.j(true);
                }
                return false;
            }
        } else if (z9) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            boolean z9 = lb1Var.b;
            org.telegram.ui.ActionBar.f2 f2Var = lb1Var.a;
            if (z9) {
                f2Var.onFragmentDestroy();
                f2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onPause() {
        super.onPause();
        this.f = false;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        Z();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.a;
                if (f2Var.fragmentView != null) {
                    try {
                        f2Var.onThemeColorsChanged();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        super.onTransitionAnimationProgress(z9, f10);
        if (!z9) {
            f10 = 1.0f - f10;
        }
        this.e = f10;
        Z();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.n = str;
        this.r = i7;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i10);
            if (lb1Var != null) {
                lb1Var.a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
