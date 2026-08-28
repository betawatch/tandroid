package b5;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import d5.f0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends y {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    public i(Context context) {
        CaptioningManager captioningManager;
        int i9 = f0.a;
        if (i9 >= 19 && ((i9 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.s = o8.z.y(i9 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Point p6 = f0.p(context);
        b(p6.x, p6.y);
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        d();
    }

    @Override // b5.y
    public final y b(int i9, int i10) {
        super.b(i9, i10);
        return this;
    }

    public final void c() {
        this.y.clear();
    }

    public final void d() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
    }

    public i(j jVar) {
        a(jVar);
        this.A = jVar.M;
        this.B = jVar.N;
        this.C = jVar.O;
        this.D = jVar.P;
        this.E = jVar.Q;
        this.F = jVar.R;
        this.G = jVar.S;
        this.H = jVar.T;
        this.I = jVar.U;
        this.J = jVar.V;
        this.K = jVar.W;
        this.L = jVar.X;
        this.M = jVar.Y;
        SparseArray sparseArray = jVar.Z;
        SparseArray sparseArray2 = new SparseArray();
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            sparseArray2.put(sparseArray.keyAt(i9), new HashMap((Map) sparseArray.valueAt(i9)));
        }
        this.N = sparseArray2;
        this.O = jVar.a0.clone();
    }

    public i() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        d();
    }
}
