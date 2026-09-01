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
import m.j2;
import m.r1;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver B;
    public boolean C;
    public boolean D;
    public int E;
    public int F = 0;
    public boolean G;
    public final Context b;
    public final l c;
    public final i d;
    public final boolean e;
    public final int f;
    public final int h;
    public final j2 n;
    public final androidx.mediarouter.app.k r;
    public final ff.b s;
    public PopupWindow.OnDismissListener v;
    public View w;
    public View x;
    public x y;

    public d0(Context context, l lVar, View view, int i10, boolean z4) {
        int i11 = 2;
        this.r = new androidx.mediarouter.app.k(this, i11);
        this.s = new ff.b(this, i11);
        this.b = context;
        this.c = lVar;
        this.e = z4;
        this.d = new i(lVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.h = i10;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.w = view;
        this.n = new j2(context, null, i10);
        lVar.b(this, context);
    }

    @Override // l.c0
    public final boolean a() {
        return !this.C && this.n.L.isShowing();
    }

    @Override // l.y
    public final void c(l lVar, boolean z4) {
        if (lVar != this.c) {
            return;
        }
        dismiss();
        x xVar = this.y;
        if (xVar != null) {
            xVar.c(lVar, z4);
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
        this.D = false;
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
        if (this.C || (view = this.w) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.x = view;
        j2 j2Var = this.n;
        m.x xVar = j2Var.L;
        m.x xVar2 = j2Var.L;
        xVar.setOnDismissListener(this);
        j2Var.C = this;
        j2Var.K = true;
        xVar2.setFocusable(true);
        View view2 = this.x;
        boolean z4 = this.B == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.B = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.r);
        }
        view2.addOnAttachStateChangeListener(this.s);
        j2Var.B = view2;
        j2Var.w = this.F;
        boolean z10 = this.D;
        Context context = this.b;
        i iVar = this.d;
        if (!z10) {
            this.E = t.m(iVar, context, this.f);
            this.D = true;
        }
        j2Var.q(this.E);
        xVar2.setInputMethodMode(2);
        Rect rect = this.a;
        j2Var.J = rect != null ? new Rect(rect) : null;
        j2Var.g();
        r1 r1Var = j2Var.c;
        r1Var.setOnKeyListener(this);
        if (this.G) {
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
        j2Var.o(iVar);
        j2Var.g();
    }

    @Override // l.y
    public final void h(x xVar) {
        this.y = xVar;
    }

    @Override // l.y
    public final boolean j(e0 e0Var) {
        boolean z4;
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
                    z4 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i10++;
            }
            wVar.g = z4;
            t tVar2 = wVar.i;
            if (tVar2 != null) {
                tVar2.o(z4);
            }
            wVar.j = this.v;
            this.v = null;
            this.c.c(false);
            j2 j2Var = this.n;
            int i11 = j2Var.f;
            int n10 = j2Var.n();
            int i12 = this.F;
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
                xVar2.d0(e0Var);
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

    @Override // l.t
    public final void p(int i10) {
        this.F = i10;
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
    public final void s(boolean z4) {
        this.G = z4;
    }

    @Override // l.t
    public final void t(int i10) {
        this.n.k(i10);
    }

    @Override // l.t
    public final void l(l lVar) {
    }
}
