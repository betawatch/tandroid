package hi;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public class p3 {
    public final View a;
    public View b;
    public final x10 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final bi.o1 i;
    public final n3 j;
    public int k;
    public int l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, hi.n3] */
    public p3(View view, boolean z10, x10 x10Var) {
        bi.o1 o1Var = new bi.o1(this, 1);
        this.i = o1Var;
        ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: hi.n3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                p3.this.d();
            }
        };
        this.j = r12;
        this.a = view;
        this.c = x10Var;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(r12);
            view.addOnLayoutChangeListener(o1Var);
        }
        view.addOnAttachStateChangeListener(new o3(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l < org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.n) {
                return;
            } else {
                this.e = false;
            }
        }
        x10 x10Var = this.c;
        if (x10Var != null) {
            x10Var.a(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        return this.l > org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.n || this.e;
    }

    public final void d() {
        if (this.d) {
            return;
        }
        boolean z10 = this.f;
        View view = this.a;
        if (z10) {
            View view2 = this.b;
            if (view2 != null) {
                view = view2;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.l1 a10 = r0.b0.a(view);
            this.l = a10 != null ? a10.a.f(8).d : 0;
        } else {
            Rect rect = this.h;
            view.getWindowVisibleDisplayFrame(rect);
            View view3 = this.b;
            if (view3 != null) {
                view = view3;
            }
            this.l = view.getHeight() - rect.bottom;
        }
        if (this.g) {
            this.l = Math.max(0, this.l - org.telegram.messenger.g0.n);
        }
        int i7 = this.k;
        int i10 = this.l;
        boolean z11 = i7 != i10;
        this.k = i10;
        if (z11) {
            a();
        }
    }
}
