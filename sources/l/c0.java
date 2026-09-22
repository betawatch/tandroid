package l;

import ai.u2;
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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
    public final j2 n;
    public PopupWindow.OnDismissListener v;
    public View w;
    public View x;
    public w y;
    public final androidx.mediarouter.app.j r = new androidx.mediarouter.app.j(this, 2);
    public final u2 s = new u2(this, 3);
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
        this.n = new j2(context, null, i10);
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
    public final void d() {
        this.G = false;
        h hVar = this.d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // l.b0
    public final void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override // l.x
    public final void e(w wVar) {
        this.y = wVar;
    }

    @Override // l.b0
    public final r1 f() {
        return this.n.c;
    }

    @Override // l.x
    public final void g(k kVar, boolean z10) {
        if (kVar != this.c) {
            return;
        }
        dismiss();
        w wVar = this.y;
        if (wVar != null) {
            wVar.g(kVar, z10);
        }
    }

    @Override // l.b0
    public final void h() {
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
        h hVar = this.d;
        if (!z11) {
            this.H = s.m(hVar, context, this.f);
            this.G = true;
        }
        j2Var.p(this.H);
        xVar2.setInputMethodMode(2);
        Rect rect = this.a;
        j2Var.M = rect != null ? new Rect(rect) : null;
        j2Var.h();
        r1 r1Var = j2Var.c;
        r1Var.setOnKeyListener(this);
        if (this.J) {
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
        j2Var.n(hVar);
        j2Var.h();
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
                sVar.e(wVar);
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
            j2 j2Var = this.n;
            int i11 = j2Var.f;
            int m10 = j2Var.m();
            int i12 = this.I;
            View view = this.w;
            WeakHashMap weakHashMap = i0.a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.w.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i11, m10, true, true);
                }
            }
            w wVar2 = this.y;
            if (wVar2 != null) {
                wVar2.v(d0Var);
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
        this.n.j(i10);
    }

    @Override // l.s
    public final void l(k kVar) {
    }
}
