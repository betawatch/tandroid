// default package

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class mx5 {
    public final View a;
    public View b;
    public final qac c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final ol1 i;
    public final c45 j;
    public int k;
    public int l;

    public mx5(View view, boolean z, qac qacVar) {
        ol1 ol1Var = new ol1(this, (byte) 4);
        this.i = ol1Var;
        c45 c45Var = new c45(this, (byte) 1);
        this.j = c45Var;
        this.a = view;
        this.c = qacVar;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(c45Var);
            view.addOnLayoutChangeListener(ol1Var);
        }
        view.addOnAttachStateChangeListener(new lx5(this, z, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l < gm.L(20.0f) + gm.n) {
                return;
            } else {
                this.e = false;
            }
        }
        qac qacVar = this.c;
        if (qacVar != null) {
            qacVar.a(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z) {
        this.d = z;
        d();
    }

    public final boolean c() {
        return this.l > gm.L(20.0f) + gm.n || this.e;
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
            WeakHashMap weakHashMap = kfc.a;
            wzc a = dfc.a(view);
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
            height = Math.max(0, height - gm.n);
            this.l = height;
        }
        boolean z2 = this.k != height;
        this.k = height;
        if (z2) {
            a();
        }
    }
}
