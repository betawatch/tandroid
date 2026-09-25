package ci;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public class i4 {
    public final View a;
    public View b;
    public final Utilities.Callback c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final f4 i;
    public final g4 j;
    public int k;
    public int l;

    public i4(View view, boolean z10, Utilities.Callback callback) {
        f4 f4Var = new f4(this, 0);
        this.i = f4Var;
        g4 g4Var = new g4(this, 0);
        this.j = g4Var;
        this.a = view;
        this.c = callback;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(g4Var);
            view.addOnLayoutChangeListener(f4Var);
        }
        view.addOnAttachStateChangeListener(new h4(this, z10, view));
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
