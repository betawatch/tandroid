package bi;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public class b5 {
    public final View a;
    public View b;
    public final Utilities.Callback c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final y4 i;
    public final z4 j;
    public int k;
    public int l;

    public b5(View view, boolean z10, Utilities.Callback callback) {
        y4 y4Var = new y4(this, 0);
        this.i = y4Var;
        z4 z4Var = new z4(this, 0);
        this.j = z4Var;
        this.a = view;
        this.c = callback;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(z4Var);
            view.addOnLayoutChangeListener(y4Var);
        }
        view.addOnAttachStateChangeListener(new a5(this, z10, view));
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
            r0.l1 f7 = r0.i0.f(view);
            this.l = f7 != null ? f7.a.f(8).d : 0;
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
