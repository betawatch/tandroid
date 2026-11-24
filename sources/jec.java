// default package

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class jec extends d {
    public final SparseArray a;
    public oc6 b;
    public iec c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public jec() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void Y() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hec hecVar = (hec) sparseArray.valueAt(i);
            int keyAt = sparseArray.keyAt(i);
            if (hecVar != null) {
                d dVar = hecVar.a;
                if (dVar.fragmentView != null) {
                    float q = this.c.q(keyAt);
                    boolean z = this.f;
                    float f = z ? this.e : 0.0f;
                    boolean z2 = this.h;
                    float f2 = hecVar.f;
                    float f3 = f * q;
                    hecVar.f = f3;
                    boolean z3 = true;
                    boolean z4 = f3 > f2;
                    if (!hecVar.d && q > 0.0f && z && dVar.fragmentView != null) {
                        dVar.onResume();
                        hecVar.d = true;
                    }
                    if (!hecVar.e && ((f2 == 0.0f || f2 == 1.0f) && f2 != f3 && Math.abs(f2 - f3) != 1.0f)) {
                        dVar.onTransitionAnimationStart(z4, false);
                        hecVar.e = true;
                    }
                    if (hecVar.e && f2 != f3) {
                        dVar.onTransitionAnimationProgress(z4, z4 ? f3 : 1.0f - f3);
                    }
                    if (hecVar.e && (f3 == 0.0f || f3 == 1.0f)) {
                        dVar.onTransitionAnimationEnd(z4, false);
                        hecVar.e = false;
                    }
                    boolean z5 = hecVar.c;
                    if (z5 || f3 < 1.0f) {
                        z3 = z5;
                    } else {
                        dVar.onBecomeFullyVisible();
                        hecVar.c = true;
                    }
                    if (z3 && ((f3 == 0.0f && !z2) || q == 0.0f)) {
                        dVar.onBecomeFullyHidden();
                        hecVar.c = false;
                    }
                    if (hecVar.d && ((f3 == 0.0f && !z) || q == 0.0f)) {
                        dVar.onPause();
                        hecVar.d = false;
                    }
                }
            }
        }
    }

    public abstract d Z(int i);

    public final void a0(int i) {
        SparseArray sparseArray = this.a;
        hec hecVar = (hec) sparseArray.get(i);
        if (hecVar != null) {
            d dVar = hecVar.a;
            if (hecVar.c) {
                dVar.onBecomeFullyHidden();
            }
            if (hecVar.d) {
                dVar.onPause();
            }
            dVar.onFragmentDestroy();
            dVar.setParentLayout(null);
        }
        sparseArray.remove(i);
    }

    @Override // org.telegram.ui.ActionBar.d
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hec hecVar = (hec) sparseArray.valueAt(i);
            if (hecVar != null) {
                d dVar = hecVar.a;
                if (dVar.fragmentView != null) {
                    dVar.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final d b0() {
        iec iecVar = this.c;
        if (iecVar == null) {
            return null;
        }
        hec hecVar = (hec) this.a.get(iecVar.getCurrentPosition());
        if (hecVar != null) {
            return hecVar.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void clearViews() {
        iec iecVar = this.c;
        if (iecVar != null) {
            this.d = iecVar.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hec hecVar = (hec) sparseArray.valueAt(i);
            if (hecVar != null) {
                d dVar = hecVar.a;
                if (hecVar.d) {
                    dVar.onPause();
                    hecVar.d = false;
                }
                dVar.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final a createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new oc6((byte) 1, context, (ah6) this);
        iec iecVar = new iec(this, context);
        this.c = iecVar;
        int i = this.d;
        if (i == -1) {
            i = 0;
            this.d = 0;
        }
        iecVar.setPosition(i);
        this.c.setAdapter(new bn0((byte) 9, context, this));
        this.b.addView(this.c, nme.c(-1.0f, -1));
        oc6 oc6Var = this.b;
        this.fragmentView = oc6Var;
        hza hzaVar = new hza(this, (byte) 29);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(oc6Var, hzaVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hec hecVar = (hec) sparseArray.valueAt(i);
            if (hecVar != null) {
                d dVar = hecVar.a;
                if (dVar.fragmentView != null) {
                    arrayList.addAll(dVar.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        d b0 = b0();
        return (b0 == null || b0.fragmentView == null) ? super.isLightStatusBar() : b0.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public boolean onBackPressed(boolean z) {
        if (!hasShownSheet()) {
            d b0 = b0();
            pha simpleActionBar = b0 != null ? b0.getSimpleActionBar() : null;
            if (simpleActionBar == null || (simpleActionBar.R == null && (simpleActionBar.H || !simpleActionBar.G))) {
                if (b0 == null || b0.onBackPressed(z)) {
                    return super.onBackPressed(z);
                }
            } else if (z) {
                simpleActionBar.B();
                return false;
            }
        } else if (z) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        Y();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Y();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hec hecVar = (hec) sparseArray.valueAt(i);
            boolean z = hecVar.b;
            d dVar = hecVar.a;
            if (z) {
                dVar.onFragmentDestroy();
                dVar.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onPause() {
        super.onPause();
        this.f = false;
        Y();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        d b0 = b0();
        if (b0 != null) {
            b0.onRequestPermissionsResultFragment(i, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        Y();
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hec hecVar = (hec) sparseArray.valueAt(i);
            if (hecVar != null) {
                d dVar = hecVar.a;
                if (dVar.fragmentView != null) {
                    try {
                        dVar.onThemeColorsChanged();
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        if (!z) {
            f = 1.0f - f;
        }
        this.e = f;
        Y();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setTitleOverlayText(String str, int i, Runnable runnable) {
        super.setTitleOverlayText(str, i, runnable);
        this.n = str;
        this.r = i;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            hec hecVar = (hec) sparseArray.valueAt(i2);
            if (hecVar != null) {
                hecVar.a.setTitleOverlayText(str, i, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i, Runnable runnable) {
        setTitleOverlayText(str, i, runnable);
    }
}
