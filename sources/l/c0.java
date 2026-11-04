package l;

import ai.f2;
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
import r0.i0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public w E;
    public ViewTreeObserver F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean K;
    public final Context b;
    public final k c;
    public final h d;
    public final boolean e;
    public final int f;
    public final int h;
    public final j2 n;
    public PopupWindow.OnDismissListener w;
    public View x;
    public View y;
    public final androidx.mediarouter.app.i r = new androidx.mediarouter.app.i(this, 2);
    public final f2 s = new f2(this, 8);
    public int J = 0;

    public c0(Context context, k kVar, View view, int i3, boolean z10) {
        this.b = context;
        this.c = kVar;
        this.e = z10;
        this.d = new h(kVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.h = i3;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.x = view;
        this.n = new j2(context, null, i3);
        kVar.b(this, context);
    }

    @Override // l.b0
    public final boolean a() {
        return !this.G && this.n.P.isShowing();
    }

    @Override // l.x
    public final void b(k kVar, boolean z10) {
        if (kVar != this.c) {
            return;
        }
        dismiss();
        w wVar = this.E;
        if (wVar != null) {
            wVar.b(kVar, z10);
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
        this.H = false;
        h hVar = this.d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // l.b0
    public final r1 f() {
        return this.n.c;
    }

    @Override // l.b0
    public final void g() {
        View view;
        if (a()) {
            return;
        }
        if (this.G || (view = this.x) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.y = view;
        j2 j2Var = this.n;
        m.x xVar = j2Var.P;
        m.x xVar2 = j2Var.P;
        xVar.setOnDismissListener(this);
        j2Var.G = this;
        j2Var.O = true;
        xVar2.setFocusable(true);
        View view2 = this.y;
        boolean z10 = this.F == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.F = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.r);
        }
        view2.addOnAttachStateChangeListener(this.s);
        j2Var.F = view2;
        j2Var.x = this.J;
        boolean z11 = this.H;
        Context context = this.b;
        h hVar = this.d;
        if (!z11) {
            this.I = s.m(hVar, context, this.f);
            this.H = true;
        }
        j2Var.q(this.I);
        xVar2.setInputMethodMode(2);
        Rect rect = this.a;
        j2Var.N = rect != null ? new Rect(rect) : null;
        j2Var.g();
        r1 r1Var = j2Var.c;
        r1Var.setOnKeyListener(this);
        if (this.K) {
            k kVar = this.c;
            if (kVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(kVar.m);
                }
                frameLayout.setEnabled(false);
                r1Var.addHeaderView(frameLayout, null, false);
            }
        }
        j2Var.o(hVar);
        j2Var.g();
    }

    @Override // l.x
    public final void h(w wVar) {
        this.E = wVar;
    }

    @Override // l.x
    public final boolean j(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.b, d0Var, this.y, this.e, this.h, 0);
            w wVar = this.E;
            vVar.h = wVar;
            s sVar = vVar.i;
            if (sVar != null) {
                sVar.h(wVar);
            }
            int size = d0Var.f.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = d0Var.getItem(i3);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i3++;
            }
            vVar.g = z10;
            s sVar2 = vVar.i;
            if (sVar2 != null) {
                sVar2.o(z10);
            }
            vVar.j = this.w;
            this.w = null;
            this.c.c(false);
            j2 j2Var = this.n;
            int i10 = j2Var.f;
            int n4 = j2Var.n();
            int i11 = this.J;
            View view = this.x;
            WeakHashMap weakHashMap = i0.a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i10 += this.x.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i10, n4, true, true);
                }
            }
            w wVar2 = this.E;
            if (wVar2 != null) {
                wVar2.E(d0Var);
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
    public final void o(boolean z10) {
        this.d.c = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.G = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.y.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.r);
            this.F = null;
        }
        this.y.removeOnAttachStateChangeListener(this.s);
        PopupWindow.OnDismissListener onDismissListener = this.w;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.s
    public final void p(int i3) {
        this.J = i3;
    }

    @Override // l.s
    public final void q(int i3) {
        this.n.f = i3;
    }

    @Override // l.s
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.w = onDismissListener;
    }

    @Override // l.s
    public final void s(boolean z10) {
        this.K = z10;
    }

    @Override // l.s
    public final void t(int i3) {
        this.n.k(i3);
    }

    @Override // l.s
    public final void l(k kVar) {
    }
}
