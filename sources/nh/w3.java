package nh;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class w3 {
    public final View a;
    public View b;
    public final Utilities.Callback c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final u3 i;
    public final af.e j;
    public int k;
    public int l;

    public w3(View view, boolean z10, Utilities.Callback callback) {
        u3 u3Var = new u3(this, 0);
        this.i = u3Var;
        af.e eVar = new af.e(this, 1);
        this.j = eVar;
        this.a = view;
        this.c = callback;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(eVar);
            view.addOnLayoutChangeListener(u3Var);
        }
        view.addOnAttachStateChangeListener(new v3(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l < AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                return;
            } else {
                this.e = false;
            }
        }
        Utilities.Callback callback = this.c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        return this.l > AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight || this.e;
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
            r0.m1 f9 = r0.j0.f(view);
            this.l = f9 != null ? f9.a.f(8).d : 0;
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
            this.l = Math.max(0, this.l - AndroidUtilities.navigationBarHeight);
        }
        int i10 = this.k;
        int i11 = this.l;
        boolean z11 = i10 != i11;
        this.k = i11;
        if (z11) {
            a();
        }
    }
}
