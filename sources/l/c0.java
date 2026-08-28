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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean F;
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
    public final af.b s = new af.b(this, 7);
    public int E = 0;

    public c0(Context context, k kVar, View view, int i9, boolean z10) {
        this.b = context;
        this.c = kVar;
        this.e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.h = i9;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.w = view;
        this.n = new k2(context, null, i9);
        kVar.b(this, context);
    }

    @Override // l.b0
    public final boolean a() {
        return !this.B && this.n.K.isShowing();
    }

    @Override // l.x
    public final void c(k kVar, boolean z10) {
        if (kVar != this.c) {
            return;
        }
        dismiss();
        w wVar = this.y;
        if (wVar != null) {
            wVar.c(kVar, z10);
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
        this.C = false;
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
        if (this.B || (view = this.w) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.x = view;
        k2 k2Var = this.n;
        m.y yVar = k2Var.K;
        m.y yVar2 = k2Var.K;
        yVar.setOnDismissListener(this);
        k2Var.B = this;
        k2Var.J = true;
        yVar2.setFocusable(true);
        View view2 = this.x;
        boolean z10 = this.A == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.r);
        }
        view2.addOnAttachStateChangeListener(this.s);
        k2Var.A = view2;
        k2Var.w = this.E;
        boolean z11 = this.C;
        Context context = this.b;
        h hVar = this.d;
        if (!z11) {
            this.D = s.m(hVar, context, this.f);
            this.C = true;
        }
        k2Var.q(this.D);
        yVar2.setInputMethodMode(2);
        Rect rect = this.a;
        k2Var.I = rect != null ? new Rect(rect) : null;
        k2Var.g();
        s1 s1Var = k2Var.c;
        s1Var.setOnKeyListener(this);
        if (this.F) {
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
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.b, d0Var, this.x, this.e, this.h, 0);
            w wVar = this.y;
            vVar.h = wVar;
            s sVar = vVar.i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = d0Var.getItem(i9);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i9++;
            }
            vVar.g = z10;
            s sVar2 = vVar.i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.j = this.v;
            this.v = null;
            this.c.c(false);
            k2 k2Var = this.n;
            int i10 = k2Var.f;
            int n10 = k2Var.n();
            int i11 = this.E;
            View view = this.w;
            WeakHashMap weakHashMap = j0.a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i10, n10, true, true);
                }
            }
            w wVar2 = this.y;
            if (wVar2 != null) {
                wVar2.j(d0Var);
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
    public final void o(boolean z10) {
        this.d.c = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.B = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A = this.x.getViewTreeObserver();
            }
            this.A.removeGlobalOnLayoutListener(this.r);
            this.A = null;
        }
        this.x.removeOnAttachStateChangeListener(this.s);
        PopupWindow.OnDismissListener onDismissListener = this.v;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i9 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.s
    public final void p(int i9) {
        this.E = i9;
    }

    @Override // l.s
    public final void q(int i9) {
        this.n.f = i9;
    }

    @Override // l.s
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.v = onDismissListener;
    }

    @Override // l.s
    public final void s(boolean z10) {
        this.F = z10;
    }

    @Override // l.s
    public final void t(int i9) {
        this.n.j(i9);
    }

    @Override // l.s
    public final void l(k kVar) {
    }
}
