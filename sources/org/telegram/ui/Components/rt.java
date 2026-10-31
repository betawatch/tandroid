package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rt extends mt {
    public Drawable Y1;
    public final /* synthetic */ int Z1;
    public final /* synthetic */ wt a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt(wt wtVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.a2 = wtVar;
        this.Z1 = i10;
        this.Y1 = null;
    }

    @Override // org.telegram.ui.Components.mt
    public final void F(int i10, int i11) {
        this.a2.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.qt
    public final int e() {
        return this.a2.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final int getActionModeStyle() {
        int i10 = this.Z1;
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        wt wtVar = this.a2;
        if (wtVar.a()) {
            org.telegram.ui.un.t8(menu, null, wtVar.L == 3, true, true, true);
        } else {
            wtVar.i(actionMode, menu);
        }
    }

    @Override // org.telegram.ui.Components.qt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        wt wtVar = this.a2;
        bl0 bl0Var = wtVar.c;
        if (bl0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (wtVar.a() && z11) {
                org.telegram.messenger.d6.i();
                z10 = true;
            }
            if (wtVar.n != z10) {
                wtVar.n = z10;
                if (z10) {
                    this.Y1 = bl0Var.d;
                    bl0Var.a(R.drawable.msg_edit, true);
                } else {
                    bl0Var.b(this.Y1, true);
                    this.Y1 = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        st stVar;
        wt wtVar = this.a2;
        if (wtVar.e && motionEvent.getAction() == 0) {
            wtVar.u();
            if (!wtVar.y || (stVar = wtVar.d) == null) {
                wtVar.x(org.telegram.messenger.i0.D ? 0 : 2);
            } else {
                stVar.t(false);
                wtVar.y = false;
                wtVar.k(true);
                org.telegram.messenger.i0.J3(this);
            }
            wtVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.i0.J3(this)) {
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
            org.telegram.messenger.f8.g(e, true);
            return false;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (this.a2.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
