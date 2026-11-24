// default package

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public class mv5 {
    public final View a;
    public View b;
    public final p8c c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final gk1 i;
    public final c25 j;
    public int k;
    public int l;

    public mv5(View view, boolean z, p8c p8cVar) {
        gk1 gk1Var = new gk1(this, (byte) 4);
        this.i = gk1Var;
        c25 c25Var = new c25(this, (byte) 1);
        this.j = c25Var;
        this.a = view;
        this.c = p8cVar;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(c25Var);
            view.addOnLayoutChangeListener(gk1Var);
        }
        view.addOnAttachStateChangeListener(new lv5(this, z, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l < gl.L(20.0f) + gl.n) {
                return;
            } else {
                this.e = false;
            }
        }
        p8c p8cVar = this.c;
        if (p8cVar != null) {
            p8cVar.a(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z) {
        this.d = z;
        d();
    }

    public final boolean c() {
        return this.l > gl.L(20.0f) + gl.n || this.e;
    }

    public final void d() {
        int height;
        if (this.d) {
            return;
        }
        boolean z = this.f;
        View view = this.a;
        if (z) {
            View view2 = this.b;
            if (view2 != null) {
                view = view2;
            }
            WeakHashMap weakHashMap = jdc.a;
            vxc a = cdc.a(view);
            height = a != null ? a.a.f(8).d : 0;
            this.l = height;
        } else {
            Rect rect = this.h;
            view.getWindowVisibleDisplayFrame(rect);
            View view3 = this.b;
            if (view3 != null) {
                view = view3;
            }
            height = view.getHeight() - rect.bottom;
            this.l = height;
        }
        if (this.g) {
            height = Math.max(0, height - gl.n);
            this.l = height;
        }
        boolean z2 = this.k != height;
        this.k = height;
        if (z2) {
            a();
        }
    }
}
