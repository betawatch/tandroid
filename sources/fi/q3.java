package fi;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class q3 {
    public final View a;
    public View b;
    public final c20 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final n3 i;
    public final o3 j;
    public int k;
    public int l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, fi.o3] */
    public q3(View view, boolean z9, c20 c20Var) {
        n3 n3Var = new n3(this, 0);
        this.i = n3Var;
        ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: fi.o3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                q3.this.d();
            }
        };
        this.j = r12;
        this.a = view;
        this.c = c20Var;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(r12);
            view.addOnLayoutChangeListener(n3Var);
        }
        view.addOnAttachStateChangeListener(new p3(this, z9, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l < org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.n) {
                return;
            } else {
                this.e = false;
            }
        }
        c20 c20Var = this.c;
        if (c20Var != null) {
            c20Var.a(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z9) {
        this.d = z9;
        d();
    }

    public final boolean c() {
        return this.l > org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.n || this.e;
    }

    public final void d() {
        if (this.d) {
            return;
        }
        boolean z9 = this.f;
        View view = this.a;
        if (z9) {
            View view2 = this.b;
            if (view2 != null) {
                view = view2;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.k1 a10 = r0.b0.a(view);
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
        boolean z10 = i7 != i10;
        this.k = i10;
        if (z10) {
            a();
        }
    }
}
