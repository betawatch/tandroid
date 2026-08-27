package lh;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public class a4 {
    public final View a;
    public View b;
    public final Utilities.Callback c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final x3 i;
    public final y3 j;
    public int k;
    public int l;

    public a4(View view, boolean z10, Utilities.Callback callback) {
        x3 x3Var = new x3(this, 0);
        this.i = x3Var;
        y3 y3Var = new y3(this, 0);
        this.j = y3Var;
        this.a = view;
        this.c = callback;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(y3Var);
            view.addOnLayoutChangeListener(x3Var);
        }
        view.addOnAttachStateChangeListener(new z3(this, z10, view));
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
            r0.m1 f10 = r0.j0.f(view);
            this.l = f10 != null ? f10.a.f(8).d : 0;
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
