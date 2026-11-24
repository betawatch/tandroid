// default package

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gw3 extends PopupWindow {
    public static Field f;
    public static final e8 g = new e8();
    public ViewTreeObserver.OnScrollChangedListener a;
    public ViewTreeObserver b;
    public final fw3 c;
    public boolean d;
    public final int e;

    public gw3(fw3 fw3Var) {
        super(fw3Var);
        this.e = gl.L(gl.O1() ? 40.0f : 32.0f);
        this.c = fw3Var;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        fw3Var.setFocusableInTouchMode(true);
        fw3Var.setOnKeyListener(new w6(this, (byte) 3));
    }

    public final void a(View view) {
        if (this.a != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.b.removeOnScrollChangedListener(this.a);
                }
                this.b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.a);
                }
            }
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        setFocusable(false);
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        if (this.a == null || (viewTreeObserver = this.b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.b.removeOnScrollChangedListener(this.a);
        }
        this.b = null;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        try {
            super.showAsDropDown(view, i, i2);
            a(view);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i, i2, i3);
        if (this.a == null || (viewTreeObserver = this.b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.b.removeOnScrollChangedListener(this.a);
        }
        this.b = null;
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
        a(view);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2) {
        super.update(view, i, i2);
        a(view);
    }
}
