// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class du3 extends xt3 {
    public Drawable f2;
    public final /* synthetic */ int g2;
    public final /* synthetic */ iu3 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du3(iu3 iu3Var, Context context, vnb vnbVar, int i) {
        super(context, vnbVar);
        this.h2 = iu3Var;
        this.g2 = i;
        this.f2 = null;
    }

    @Override // xt3
    public final void G(int i, int i2) {
        this.h2.q(i, i2);
    }

    @Override // cu3
    public final int e() {
        return this.h2.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final int getActionModeStyle() {
        int i = this.g2;
        if (i == 2 || i == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        iu3 iu3Var = this.h2;
        if (iu3Var.a()) {
            zu1.E6(menu, null, iu3Var.M == 3, true, true, true);
        } else {
            iu3Var.i(actionMode, menu);
        }
    }

    @Override // cu3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        iu3 iu3Var = this.h2;
        ya9 ya9Var = iu3Var.c;
        if (ya9Var != null) {
            boolean z = false;
            boolean z2 = i2 != i;
            if (iu3Var.a() && z2) {
                f3f.b();
                z = true;
            }
            if (iu3Var.n != z) {
                iu3Var.n = z;
                if (z) {
                    this.f2 = ya9Var.d;
                    ya9Var.a(R.drawable.msg_edit, true);
                } else {
                    ya9Var.b(this.f2, true);
                    this.f2 = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        eu3 eu3Var;
        iu3 iu3Var = this.h2;
        if (iu3Var.e && motionEvent.getAction() == 0) {
            iu3Var.u();
            if (!iu3Var.y || (eu3Var = iu3Var.d) == null) {
                iu3Var.x(hl.D ? 0 : 2);
            } else {
                eu3Var.r(false);
                iu3Var.y = false;
                iu3Var.k(true);
                hl.E3(this);
            }
            iu3Var.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!hl.E3(this)) {
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
            cc4.g(e, true);
            return false;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.h2.t(i2)) {
            super.scrollTo(i, i2);
        }
    }
}
