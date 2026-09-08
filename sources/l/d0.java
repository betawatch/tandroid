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
import bi.i2;
import java.util.WeakHashMap;
import m.j2;
import m.r1;
import org.telegram.messenger.beta.R;
import r0.i0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public int I = 0;
    public boolean J;
    public final Context b;
    public final l c;
    public final i d;
    public final boolean e;
    public final int f;
    public final int h;
    public final j2 n;
    public final androidx.mediarouter.app.j r;
    public final i2 s;
    public PopupWindow.OnDismissListener v;
    public View w;
    public View x;
    public x y;

    public d0(Context context, l lVar, View view, int i10, boolean z10) {
        int i11 = 2;
        this.r = new androidx.mediarouter.app.j(this, i11);
        this.s = new i2(this, i11);
        this.b = context;
        this.c = lVar;
        this.e = z10;
        this.d = new i(lVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.h = i10;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.w = view;
        this.n = new j2(context, null, i10);
        lVar.b(this, context);
    }

    @Override // l.c0
    public final boolean a() {
        return !this.F && this.n.O.isShowing();
    }

    @Override // l.y
    public final boolean c() {
        return false;
    }

    @Override // l.y
    public final void d(l lVar, boolean z10) {
        if (lVar != this.c) {
            return;
        }
        dismiss();
        x xVar = this.y;
        if (xVar != null) {
            xVar.d(lVar, z10);
        }
    }

    @Override // l.c0
    public final void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override // l.y
    public final void e() {
        this.G = false;
        i iVar = this.d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // l.c0
    public final r1 f() {
        return this.n.c;
    }

    @Override // l.c0
    public final void g() {
        View view;
        if (a()) {
            return;
        }
        if (this.F || (view = this.w) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.x = view;
        j2 j2Var = this.n;
        m.x xVar = j2Var.O;
        m.x xVar2 = j2Var.O;
        xVar.setOnDismissListener(this);
        j2Var.F = this;
        j2Var.N = true;
        xVar2.setFocusable(true);
        View view2 = this.x;
        boolean z10 = this.E == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.E = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.r);
        }
        view2.addOnAttachStateChangeListener(this.s);
        j2Var.E = view2;
        j2Var.w = this.I;
        boolean z11 = this.G;
        Context context = this.b;
        i iVar = this.d;
        if (!z11) {
            this.H = t.m(iVar, context, this.f);
            this.G = true;
        }
        j2Var.r(this.H);
        xVar2.setInputMethodMode(2);
        Rect rect = this.a;
        j2Var.M = rect != null ? new Rect(rect) : null;
        j2Var.g();
        r1 r1Var = j2Var.c;
        r1Var.setOnKeyListener(this);
        if (this.J) {
            l lVar = this.c;
            if (lVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(lVar.m);
                }
                frameLayout.setEnabled(false);
                r1Var.addHeaderView(frameLayout, null, false);
            }
        }
        j2Var.p(iVar);
        j2Var.g();
    }

    @Override // l.y
    public final void h(x xVar) {
        this.y = xVar;
    }

    @Override // l.y
    public final boolean j(e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.b, e0Var, this.x, this.e, this.h, 0);
            x xVar = this.y;
            wVar.h = xVar;
            t tVar = wVar.i;
            if (tVar != null) {
                tVar.h(xVar);
            }
            int size = e0Var.f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            wVar.g = z10;
            t tVar2 = wVar.i;
            if (tVar2 != null) {
                tVar2.o(z10);
            }
            wVar.j = this.v;
            this.v = null;
            this.c.c(false);
            j2 j2Var = this.n;
            int i11 = j2Var.f;
            int n10 = j2Var.n();
            int i12 = this.I;
            View view = this.w;
            WeakHashMap weakHashMap = i0.a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.w.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.e != null) {
                    wVar.d(i11, n10, true, true);
                }
            }
            x xVar2 = this.y;
            if (xVar2 != null) {
                xVar2.q(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // l.t
    public final void n(View view) {
        this.w = view;
    }

    @Override // l.t
    public final void o(boolean z10) {
        this.d.c = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.F = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.x.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.r);
            this.E = null;
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

    @Override // l.t
    public final void p(int i10) {
        this.I = i10;
    }

    @Override // l.t
    public final void q(int i10) {
        this.n.f = i10;
    }

    @Override // l.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.v = onDismissListener;
    }

    @Override // l.t
    public final void s(boolean z10) {
        this.J = z10;
    }

    @Override // l.t
    public final void t(int i10) {
        this.n.k(i10);
    }

    @Override // l.t
    public final void l(l lVar) {
    }
}
