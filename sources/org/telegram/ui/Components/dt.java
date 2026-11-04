package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dt extends xs {
    public Drawable Z1;
    public final /* synthetic */ int a2;
    public final /* synthetic */ jt b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(jt jtVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.b2 = jtVar;
        this.a2 = i3;
        this.Z1 = null;
    }

    @Override // org.telegram.ui.Components.xs
    public final void F(int i3, int i10) {
        this.b2.q(i3, i10);
    }

    @Override // org.telegram.ui.Components.bt
    public final int e() {
        return this.b2.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final int getActionModeStyle() {
        int i3 = this.a2;
        if (i3 == 2 || i3 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        jt jtVar = this.b2;
        if (jtVar.a()) {
            org.telegram.ui.wm.A8(menu, null, jtVar.M == 3, true, true, true);
        } else {
            jtVar.i(actionMode, menu);
        }
    }

    @Override // org.telegram.ui.Components.bt, android.widget.TextView
    public final void onSelectionChanged(int i3, int i10) {
        super.onSelectionChanged(i3, i10);
        jt jtVar = this.b2;
        bk0 bk0Var = jtVar.c;
        if (bk0Var != null) {
            boolean z10 = false;
            boolean z11 = i10 != i3;
            if (jtVar.a() && z11) {
                org.telegram.messenger.sr.i();
                z10 = true;
            }
            if (jtVar.n != z10) {
                jtVar.n = z10;
                if (z10) {
                    this.Z1 = bk0Var.d;
                    bk0Var.a(R.drawable.msg_edit, true);
                } else {
                    bk0Var.b(this.Z1, true);
                    this.Z1 = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        et etVar;
        jt jtVar = this.b2;
        if (jtVar.e && motionEvent.getAction() == 0) {
            jtVar.u();
            if (!jtVar.y || (etVar = jtVar.d) == null) {
                jtVar.x(org.telegram.messenger.g0.D ? 0 : 2);
            } else {
                etVar.t(false);
                jtVar.y = false;
                jtVar.k(true);
                org.telegram.messenger.g0.K3(this);
            }
            jtVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.g0.K3(this)) {
                clearFocus();
                requestFocus();
            }
            if (!isFocused) {
                setSelection(getText().length());
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return false;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i10) {
        if (this.b2.t(i10)) {
            super.scrollTo(i3, i10);
        }
    }
}
