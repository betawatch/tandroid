// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mt3 extends gt3 {
    public Drawable e2;
    public final /* synthetic */ int f2;
    public final /* synthetic */ rt3 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt3(rt3 rt3Var, Context context, wjb wjbVar, int i) {
        super(context, wjbVar);
        this.g2 = rt3Var;
        this.f2 = i;
        this.e2 = null;
    }

    @Override // gt3
    public final void G(int i, int i2) {
        this.g2.q(i, i2);
    }

    @Override // lt3
    public final int e() {
        return this.g2.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final int getActionModeStyle() {
        int i = this.f2;
        if (i == 2 || i == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        rt3 rt3Var = this.g2;
        if (rt3Var.a()) {
            mu1.x6(menu, null, rt3Var.M == 3, true, true, true);
        } else {
            rt3Var.i(actionMode, menu);
        }
    }

    @Override // lt3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        rt3 rt3Var = this.g2;
        l79 l79Var = rt3Var.c;
        if (l79Var != null) {
            boolean z = false;
            boolean z2 = i2 != i;
            if (rt3Var.a() && z2) {
                nye.b();
                z = true;
            }
            if (rt3Var.n != z) {
                rt3Var.n = z;
                if (z) {
                    this.e2 = l79Var.d;
                    l79Var.a(R.drawable.msg_edit, true);
                } else {
                    l79Var.b(this.e2, true);
                    this.e2 = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        nt3 nt3Var;
        rt3 rt3Var = this.g2;
        if (rt3Var.e && motionEvent.getAction() == 0) {
            rt3Var.u();
            if (!rt3Var.y || (nt3Var = rt3Var.d) == null) {
                rt3Var.x(gl.D ? 0 : 2);
            } else {
                nt3Var.s(false);
                rt3Var.y = false;
                rt3Var.k(true);
                gl.E3(this);
            }
            rt3Var.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!gl.E3(this)) {
                clearFocus();
                requestFocus();
            }
            if (!isFocused) {
                setSelection(getText().length());
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.g2.t(i2)) {
            super.scrollTo(i, i2);
        }
    }
}
