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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean F;
    public final Context b;
    public final l c;
    public final i d;
    public final boolean e;
    public final int f;
    public final int h;
    public final k2 n;
    public PopupWindow.OnDismissListener v;
    public View w;
    public View x;
    public x y;
    public final d r = new d(this, 1);
    public final bf.b s = new bf.b(this, 7);
    public int E = 0;

    public d0(Context context, l lVar, View view, int i10, boolean z10) {
        this.b = context;
        this.c = lVar;
        this.e = z10;
        this.d = new i(lVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.h = i10;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.w = view;
        this.n = new k2(context, null, i10);
        lVar.b(this, context);
    }

    @Override // l.c0
    public final boolean a() {
        return !this.B && this.n.K.isShowing();
    }

    @Override // l.y
    public final void b(l lVar, boolean z10) {
        if (lVar != this.c) {
            return;
        }
        dismiss();
        x xVar = this.y;
        if (xVar != null) {
            xVar.b(lVar, z10);
        }
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.c0
    public final void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override // l.y
    public final void e() {
        this.C = false;
        i iVar = this.d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // l.c0
    public final s1 f() {
        return this.n.c;
    }

    @Override // l.c0
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
        i iVar = this.d;
        if (!z11) {
            this.D = t.m(iVar, context, this.f);
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
            l lVar = this.c;
            if (lVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) s1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(lVar.m);
                }
                frameLayout.setEnabled(false);
                s1Var.addHeaderView(frameLayout, null, false);
            }
        }
        k2Var.o(iVar);
        k2Var.g();
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
            k2 k2Var = this.n;
            int i11 = k2Var.f;
            int n10 = k2Var.n();
            int i12 = this.E;
            View view = this.w;
            WeakHashMap weakHashMap = j0.a;
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
                xVar2.l(e0Var);
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
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.t
    public final void p(int i10) {
        this.E = i10;
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
        this.F = z10;
    }

    @Override // l.t
    public final void t(int i10) {
        this.n.k(i10);
    }

    @Override // l.t
    public final void l(l lVar) {
    }
}
