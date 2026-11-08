package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import bi.m6;
import java.util.WeakHashMap;
import m.k2;
import m.s1;
import org.telegram.messenger.beta.R;
import r0.i0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public w D;
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context b;
    public final k c;
    public final h d;
    public final boolean e;
    public final int f;
    public final int h;
    public final k2 n;
    public PopupWindow.OnDismissListener w;
    public View x;
    public View y;
    public final androidx.mediarouter.app.i r = new androidx.mediarouter.app.i(this, 2);
    public final m6 s = new m6(this, 4);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i7, boolean z9) {
        this.b = context;
        this.c = kVar;
        this.e = z9;
        this.d = new h(kVar, LayoutInflater.from(context), z9, R.layout.abc_popup_menu_item_layout);
        this.h = i7;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.x = view;
        this.n = new k2(context, null, i7);
        kVar.b(this, context);
    }

    @Override // l.b0
    public final boolean a() {
        return !this.F && this.n.O.isShowing();
    }

    @Override // l.x
    public final void c(k kVar, boolean z9) {
        if (kVar != this.c) {
            return;
        }
        dismiss();
        w wVar = this.D;
        if (wVar != null) {
            wVar.c(kVar, z9);
        }
    }

    @Override // l.x
    public final boolean d() {
        return false;
    }

    @Override // l.b0
    public final void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override // l.x
    public final void e() {
        this.G = false;
        h hVar = this.d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // l.b0
    public final s1 f() {
        return this.n.c;
    }

    @Override // l.b0
    public final void g() {
        View view;
        if (a()) {
            return;
        }
        if (this.F || (view = this.x) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.y = view;
        k2 k2Var = this.n;
        m.y yVar = k2Var.O;
        m.y yVar2 = k2Var.O;
        yVar.setOnDismissListener(this);
        k2Var.F = this;
        k2Var.N = true;
        yVar2.setFocusable(true);
        View view2 = this.y;
        boolean z9 = this.E == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.E = viewTreeObserver;
        if (z9) {
            viewTreeObserver.addOnGlobalLayoutListener(this.r);
        }
        view2.addOnAttachStateChangeListener(this.s);
        k2Var.E = view2;
        k2Var.x = this.I;
        boolean z10 = this.G;
        Context context = this.b;
        h hVar = this.d;
        if (!z10) {
            this.H = s.m(hVar, context, this.f);
            this.G = true;
        }
        k2Var.p(this.H);
        yVar2.setInputMethodMode(2);
        Rect rect = this.a;
        k2Var.M = rect != null ? new Rect(rect) : null;
        k2Var.g();
        s1 s1Var = k2Var.c;
        s1Var.setOnKeyListener(this);
        if (this.J) {
            k kVar = this.c;
            if (kVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) s1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(kVar.m);
                }
                frameLayout.setEnabled(false);
                s1Var.addHeaderView(frameLayout, null, false);
            }
        }
        k2Var.n(hVar);
        k2Var.g();
    }

    @Override // l.x
    public final void h(w wVar) {
        this.D = wVar;
    }

    @Override // l.x
    public final boolean j(d0 d0Var) {
        boolean z9;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.b, d0Var, this.y, this.e, this.h, 0);
            w wVar = this.D;
            vVar.h = wVar;
            s sVar = vVar.i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z9 = false;
                    break;
                }
                MenuItem item = d0Var.getItem(i7);
                if (item.isVisible() && item.getIcon() != null) {
                    z9 = true;
                    break;
                }
                i7++;
            }
            vVar.g = z9;
            s sVar2 = vVar.i;
            if (sVar2 != null) {
                sVar2.o(z9);
            }
            vVar.j = this.w;
            this.w = null;
            this.c.c(false);
            k2 k2Var = this.n;
            int i10 = k2Var.f;
            int m10 = k2Var.m();
            int i11 = this.I;
            View view = this.x;
            WeakHashMap weakHashMap = i0.a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.x.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i10, m10, true, true);
                }
            }
            w wVar2 = this.D;
            if (wVar2 != null) {
                wVar2.A(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override // l.s
    public final void n(View view) {
        this.x = view;
    }

    @Override // l.s
    public final void o(boolean z9) {
        this.d.c = z9;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.F = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.y.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.r);
            this.E = null;
        }
        this.y.removeOnAttachStateChangeListener(this.s);
        PopupWindow.OnDismissListener onDismissListener = this.w;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.s
    public final void p(int i7) {
        this.I = i7;
    }

    @Override // l.s
    public final void q(int i7) {
        this.n.f = i7;
    }

    @Override // l.s
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.w = onDismissListener;
    }

    @Override // l.s
    public final void s(boolean z9) {
        this.J = z9;
    }

    @Override // l.s
    public final void t(int i7) {
        this.n.j(i7);
    }

    @Override // l.s
    public final void l(k kVar) {
    }
}
