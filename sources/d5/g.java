package d5;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import f5.d0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends w {
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

    public g(Context context) {
        CaptioningManager captioningManager;
        int i10 = d0.a;
        if (i10 >= 19 && ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.s = z.y(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Point p10 = d0.p(context);
        b(p10.x, p10.y);
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        d();
    }

    @Override // d5.w
    public final w b(int i10, int i11) {
        super.b(i10, i11);
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

    public g(h hVar) {
        a(hVar);
        this.A = hVar.M;
        this.B = hVar.N;
        this.C = hVar.O;
        this.D = hVar.P;
        this.E = hVar.Q;
        this.F = hVar.R;
        this.G = hVar.S;
        this.H = hVar.T;
        this.I = hVar.U;
        this.J = hVar.V;
        this.K = hVar.W;
        this.L = hVar.X;
        this.M = hVar.Y;
        SparseArray sparseArray = hVar.Z;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.N = sparseArray2;
        this.O = hVar.a0.clone();
    }

    public g() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        d();
    }
}
