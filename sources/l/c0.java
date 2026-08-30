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
import java.util.WeakHashMap;
import m.k2;
import m.s1;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean G;
    public final Context b;
    public final k c;
    public final h d;
    public final boolean e;
    public final int f;
    public final int h;
    public final k2 n;
    public PopupWindow.OnDismissListener v;
    public View w;
    public View x;
    public w y;
    public final androidx.mediarouter.app.k r = new androidx.mediarouter.app.k(this, 2);
    public final ff.b s = new ff.b(this, 5);
    public int F = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z4) {
        this.b = context;
        this.c = kVar;
        this.e = z4;
        this.d = new h(kVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.h = i10;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.w = view;
        this.n = new k2(context, null, i10);
        kVar.b(this, context);
    }

    @Override // l.b0
    public final boolean a() {
        return !this.C && this.n.L.isShowing();
    }

    @Override // l.x
    public final void c(k kVar, boolean z4) {
        if (kVar != this.c) {
            return;
        }
        dismiss();
        w wVar = this.y;
        if (wVar != null) {
            wVar.c(kVar, z4);
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
        this.D = false;
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
        if (this.C || (view = this.w) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.x = view;
        k2 k2Var = this.n;
        m.x xVar = k2Var.L;
        m.x xVar2 = k2Var.L;
        xVar.setOnDismissListener(this);
        k2Var.C = this;
        k2Var.K = true;
        xVar2.setFocusable(true);
        View view2 = this.x;
        boolean z4 = this.B == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.B = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.r);
        }
        view2.addOnAttachStateChangeListener(this.s);
        k2Var.B = view2;
        k2Var.w = this.F;
        boolean z10 = this.D;
        Context context = this.b;
        h hVar = this.d;
        if (!z10) {
            this.E = s.m(hVar, context, this.f);
            this.D = true;
        }
        k2Var.r(this.E);
        xVar2.setInputMethodMode(2);
        Rect rect = this.a;
        k2Var.J = rect != null ? new Rect(rect) : null;
        k2Var.g();
        s1 s1Var = k2Var.c;
        s1Var.setOnKeyListener(this);
        if (this.G) {
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
        k2Var.o(hVar);
        k2Var.g();
    }

    @Override // l.x
    public final void h(w wVar) {
        this.y = wVar;
    }

    @Override // l.x
    public final boolean j(d0 d0Var) {
        boolean z4;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.b, d0Var, this.x, this.e, this.h, 0);
            w wVar = this.y;
            vVar.h = wVar;
            s sVar = vVar.i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = d0Var.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i10++;
            }
            vVar.g = z4;
            s sVar2 = vVar.i;
            if (sVar2 != null) {
                sVar2.o(z4);
            }
            vVar.j = this.v;
            this.v = null;
            this.c.c(false);
            k2 k2Var = this.n;
            int i11 = k2Var.f;
            int n10 = k2Var.n();
            int i12 = this.F;
            View view = this.w;
            WeakHashMap weakHashMap = j0.a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i11, n10, true, true);
                }
            }
            w wVar2 = this.y;
            if (wVar2 != null) {
                wVar2.e0(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override // l.s
    public final void n(View view) {
        this.w = view;
    }

    @Override // l.s
    public final void o(boolean z4) {
        this.d.c = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.C = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.B = this.x.getViewTreeObserver();
            }
            this.B.removeGlobalOnLayoutListener(this.r);
            this.B = null;
        }
        this.x.removeOnAttachStateChangeListener(this.s);
        PopupWindow.OnDismissListener onDismissListener = this.v;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.s
    public final void p(int i10) {
        this.F = i10;
    }

    @Override // l.s
    public final void q(int i10) {
        this.n.f = i10;
    }

    @Override // l.s
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.v = onDismissListener;
    }

    @Override // l.s
    public final void s(boolean z4) {
        this.G = z4;
    }

    @Override // l.s
    public final void t(int i10) {
        this.n.k(i10);
    }

    @Override // l.s
    public final void l(k kVar) {
    }
}
