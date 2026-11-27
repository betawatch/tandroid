// default package

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class iic extends e {
    public final SparseArray a;
    public d26 b;
    public hic c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public iic() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            int keyAt = sparseArray.keyAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (eVar.fragmentView != null) {
                    float p = this.c.p(keyAt);
                    boolean z = this.f;
                    float f = z ? this.e : 0.0f;
                    boolean z2 = this.h;
                    if (gicVar.g <= 0.0f && p > 0.0f && z) {
                        ((ej6) eVar).F();
                    }
                    gicVar.g = p;
                    float f2 = gicVar.f;
                    float f3 = f * p;
                    gicVar.f = f3;
                    boolean z3 = true;
                    boolean z4 = f3 > f2;
                    if (!gicVar.d && p > 0.0f && z && eVar.fragmentView != null) {
                        eVar.onResume();
                        gicVar.d = true;
                    }
                    if (!gicVar.e && ((f2 == 0.0f || f2 == 1.0f) && f2 != f3 && Math.abs(f2 - f3) != 1.0f)) {
                        eVar.onTransitionAnimationStart(z4, false);
                        gicVar.e = true;
                    }
                    if (gicVar.e && f2 != f3) {
                        eVar.onTransitionAnimationProgress(z4, z4 ? f3 : 1.0f - f3);
                    }
                    if (gicVar.e && (f3 == 0.0f || f3 == 1.0f)) {
                        eVar.onTransitionAnimationEnd(z4, false);
                        gicVar.e = false;
                    }
                    boolean z5 = gicVar.c;
                    if (z5 || f3 < 1.0f) {
                        z3 = z5;
                    } else {
                        eVar.onBecomeFullyVisible();
                        gicVar.c = true;
                    }
                    if (z3 && ((f3 == 0.0f && !z2) || p == 0.0f)) {
                        eVar.onBecomeFullyHidden();
                        gicVar.c = false;
                    }
                    if (gicVar.d && ((f3 == 0.0f && !z) || p == 0.0f)) {
                        eVar.onPause();
                        gicVar.d = false;
                    }
                }
            }
        }
    }

    public abstract e Z(int i);

    public final void a0(int i) {
        SparseArray sparseArray = this.a;
        gic gicVar = (gic) sparseArray.get(i);
        if (gicVar != null) {
            e eVar = gicVar.a;
            if (gicVar.c) {
                eVar.onBecomeFullyHidden();
            }
            if (gicVar.d) {
                eVar.onPause();
            }
            eVar.onFragmentDestroy();
            eVar.setParentLayout(null);
        }
        sparseArray.remove(i);
    }

    @Override // org.telegram.ui.ActionBar.e
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (eVar.fragmentView != null) {
                    eVar.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final e b0() {
        hic hicVar = this.c;
        if (hicVar == null) {
            return null;
        }
        gic gicVar = (gic) this.a.get(hicVar.getCurrentPosition());
        if (gicVar != null) {
            return gicVar.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void clearViews() {
        hic hicVar = this.c;
        if (hicVar != null) {
            this.d = hicVar.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (gicVar.d) {
                    eVar.onPause();
                    gicVar.d = false;
                }
                eVar.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final a createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new d26((byte) 2, context, (fj6) this);
        hic hicVar = new hic(this, context);
        this.c = hicVar;
        int i = this.d;
        if (i == -1) {
            i = 0;
            this.d = 0;
        }
        hicVar.setPosition(i);
        this.c.setAdapter(new bn0((byte) 10, context, this));
        this.b.addView(this.c, tre.c(-1.0f, -1));
        d26 d26Var = this.b;
        this.fragmentView = d26Var;
        ftb ftbVar = new ftb(this, (byte) 13);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(d26Var, ftbVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (eVar.fragmentView != null) {
                    arrayList.addAll(eVar.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        e b0 = b0();
        return (b0 == null || b0.fragmentView == null) ? super.isLightStatusBar() : b0.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public boolean onBackPressed(boolean z) {
        if (!hasShownSheet()) {
            e b0 = b0();
            jla simpleActionBar = b0 != null ? b0.getSimpleActionBar() : null;
            if (simpleActionBar == null || (simpleActionBar.a0 == null && (simpleActionBar.M || !simpleActionBar.L))) {
                if (b0 == null || b0.onBackPressed(z)) {
                    return super.onBackPressed(z);
                }
            } else if (z) {
                simpleActionBar.E();
                return false;
            }
        } else if (z) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        Y();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Y();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            boolean z = gicVar.b;
            e eVar = gicVar.a;
            if (z) {
                eVar.onFragmentDestroy();
                eVar.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onPause() {
        super.onPause();
        this.f = false;
        Y();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        e b0 = b0();
        if (b0 != null) {
            b0.onRequestPermissionsResultFragment(i, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        Y();
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gic gicVar = (gic) sparseArray.valueAt(i);
            if (gicVar != null) {
                e eVar = gicVar.a;
                if (eVar.fragmentView != null) {
                    try {
                        eVar.onThemeColorsChanged();
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        if (!z) {
            f = 1.0f - f;
        }
        this.e = f;
        Y();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void setTitleOverlayText(String str, int i, Runnable runnable) {
        super.setTitleOverlayText(str, i, runnable);
        this.n = str;
        this.r = i;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            gic gicVar = (gic) sparseArray.valueAt(i2);
            if (gicVar != null) {
                gicVar.a.setTitleOverlayText(str, i, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i, Runnable runnable) {
        setTitleOverlayText(str, i, runnable);
    }
}
