package l;

import ai.n6;
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
import r0.i0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
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
    public PopupWindow.OnDismissListener v;
    public View w;
    public View x;
    public w y;
    public final androidx.mediarouter.app.i r = new androidx.mediarouter.app.i(this, 2);
    public final n6 s = new n6(this, 4);
    public int I = 0;

    public c0(Context context, k kVar, View view, int i10, boolean z10) {
        this.b = context;
        this.c = kVar;
        this.e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.h = i10;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.w = view;
        this.n = new k2(context, null, i10);
        kVar.b(this, context);
    }

    @Override // l.b0
    public final boolean a() {
        return !this.F && this.n.O.isShowing();
    }

    @Override // l.x
    public final boolean c() {
        return false;
    }

    @Override // l.x
    public final void d(k kVar, boolean z10) {
        if (kVar != this.c) {
            return;
        }
        dismiss();
        w wVar = this.y;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
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
        if (this.F || (view = this.w) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.x = view;
        k2 k2Var = this.n;
        m.y yVar = k2Var.O;
        m.y yVar2 = k2Var.O;
        yVar.setOnDismissListener(this);
        k2Var.F = this;
        k2Var.N = true;
        yVar2.setFocusable(true);
        View view2 = this.x;
        boolean z10 = this.E == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.E = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.r);
        }
        view2.addOnAttachStateChangeListener(this.s);
        k2Var.E = view2;
        k2Var.w = this.I;
        boolean z11 = this.G;
        Context context = this.b;
        h hVar = this.d;
        if (!z11) {
            this.H = s.m(hVar, context, this.f);
            this.G = true;
        }
        k2Var.r(this.H);
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
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = d0Var.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
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
            int i11 = k2Var.f;
            int n10 = k2Var.n();
            int i12 = this.I;
            View view = this.w;
            WeakHashMap weakHashMap = i0.a;
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
                wVar2.r(d0Var);
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

    @Override // l.s
    public final void p(int i10) {
        this.I = i10;
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
    public final void s(boolean z10) {
        this.J = z10;
    }

    @Override // l.s
    public final void t(int i10) {
        this.n.k(i10);
    }

    @Override // l.s
    public final void l(k kVar) {
    }
}
