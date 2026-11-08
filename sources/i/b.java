package i;

import a0.h;
import a0.i;
import a0.m;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public h I;
    public m J;
    public final e a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public b(b bVar, e eVar, Resources resources) {
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.a = eVar;
        this.b = resources != null ? resources : bVar != null ? bVar.b : null;
        int i7 = bVar != null ? bVar.c : 0;
        int i10 = e.J;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? qs.q2 : i7;
        this.c = i7;
        if (bVar != null) {
            this.d = bVar.d;
            this.e = bVar.e;
            this.u = true;
            this.v = true;
            this.i = bVar.i;
            this.l = bVar.l;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.c == i7) {
                if (bVar.j) {
                    this.k = bVar.k != null ? new Rect(bVar.k) : null;
                    this.j = true;
                }
                if (bVar.m) {
                    this.n = bVar.n;
                    this.o = bVar.o;
                    this.p = bVar.p;
                    this.q = bVar.q;
                    this.m = true;
                }
            }
            if (bVar.r) {
                this.s = bVar.s;
                this.r = true;
            }
            if (bVar.t) {
                this.t = true;
            }
            Drawable[] drawableArr = bVar.g;
            this.g = new Drawable[drawableArr.length];
            this.h = bVar.h;
            SparseArray sparseArray = bVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.h);
            }
            int i11 = this.h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i12, constantState);
                    } else {
                        this.g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new h();
            this.J = new m();
        }
    }

    public final int a(Drawable drawable) {
        int i7 = this.h;
        if (i7 >= this.g.length) {
            int i10 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.g = drawableArr;
            int[][] iArr = new int[i10][];
            System.arraycopy(this.H, 0, iArr, 0, i7);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.g[i7] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return i7;
    }

    public final void b() {
        this.m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f.keyAt(i7);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i7);
                Drawable[] drawableArr = this.g;
                Drawable newDrawable = constantState.newDrawable(this.b);
                newDrawable.setLayoutDirection(this.x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.b);
        newDrawable.setLayoutDirection(this.x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.a);
        this.g[i7] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int e(int i7) {
        ?? r52;
        if (i7 < 0) {
            return 0;
        }
        m mVar = this.J;
        int i10 = 0;
        int a10 = b0.a.a(mVar.c, i7, mVar.a);
        if (a10 >= 0 && (r52 = mVar.b[a10]) != i.b) {
            i10 = r52;
        }
        return i10.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i7 = this.h;
        for (int i10 = 0; i10 < i7; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
