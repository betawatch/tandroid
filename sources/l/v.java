package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class v {
    public final Context a;
    public final k b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public w h;
    public s i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final t k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.a = context;
        this.b = kVar;
        this.e = view;
        this.c = z10;
        this.d = i10;
    }

    public final s a() {
        s c0Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                c0Var = new e(context, this.e, this.d, this.c);
            } else {
                c0Var = new c0(this.a, this.b, this.e, this.d, this.c);
            }
            c0Var.l(this.b);
            c0Var.r(this.k);
            c0Var.n(this.e);
            c0Var.g(this.h);
            c0Var.o(this.g);
            c0Var.p(this.f);
            this.i = c0Var;
        }
        return this.i;
    }

    public final boolean b() {
        s sVar = this.i;
        return sVar != null && sVar.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f;
            View view = this.e;
            WeakHashMap weakHashMap = j0.a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.h();
    }
}
