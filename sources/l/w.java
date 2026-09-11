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
import r0.i0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class w {
    public final Context a;
    public final l b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public x h;
    public t i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final u k = new u(this);

    public w(Context context, l lVar, View view, boolean z10, int i10, int i11) {
        this.a = context;
        this.b = lVar;
        this.e = view;
        this.c = z10;
        this.d = i10;
    }

    public final t a() {
        t d0Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                d0Var = new f(context, this.e, this.d, this.c);
            } else {
                d0Var = new d0(this.a, this.b, this.e, this.d, this.c);
            }
            d0Var.l(this.b);
            d0Var.r(this.k);
            d0Var.n(this.e);
            d0Var.h(this.h);
            d0Var.o(this.g);
            d0Var.p(this.f);
            this.i = d0Var;
        }
        return this.i;
    }

    public final boolean b() {
        t tVar = this.i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t a2 = a();
        a2.s(z11);
        if (z10) {
            int i12 = this.f;
            View view = this.e;
            WeakHashMap weakHashMap = i0.a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.e.getWidth();
            }
            a2.q(i10);
            a2.t(i11);
            int i13 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a2.g();
    }
}
