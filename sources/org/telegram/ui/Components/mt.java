package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mt extends ft {
    public Drawable e2;
    public final /* synthetic */ int f2;
    public final /* synthetic */ rt g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(rt rtVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.g2 = rtVar;
        this.f2 = i7;
        this.e2 = null;
    }

    @Override // org.telegram.ui.Components.ft
    public final void G(int i7, int i10) {
        this.g2.q(i7, i10);
    }

    @Override // org.telegram.ui.Components.kt
    public final int e() {
        return this.g2.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final int getActionModeStyle() {
        int i7 = this.f2;
        if (i7 == 2 || i7 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        rt rtVar = this.g2;
        if (rtVar.a()) {
            org.telegram.ui.an.C8(menu, null, rtVar.M == 3, true, true, true);
        } else {
            rtVar.i(actionMode, menu);
        }
    }

    @Override // org.telegram.ui.Components.kt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        rt rtVar = this.g2;
        ck0 ck0Var = rtVar.c;
        if (ck0Var != null) {
            boolean z10 = false;
            boolean z11 = i10 != i7;
            if (rtVar.a() && z11) {
                org.telegram.messenger.b6.i();
                z10 = true;
            }
            if (rtVar.n != z10) {
                rtVar.n = z10;
                if (z10) {
                    this.e2 = ck0Var.d;
                    ck0Var.a(R.drawable.msg_edit, true);
                } else {
                    ck0Var.b(this.e2, true);
                    this.e2 = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        nt ntVar;
        rt rtVar = this.g2;
        if (rtVar.e && motionEvent.getAction() == 0) {
            rtVar.u();
            if (!rtVar.y || (ntVar = rtVar.d) == null) {
                rtVar.x(org.telegram.messenger.g0.D ? 0 : 2);
            } else {
                ntVar.t(false);
                rtVar.y = false;
                rtVar.k(true);
                org.telegram.messenger.g0.J3(this);
            }
            rtVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.g0.J3(this)) {
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
    public final void scrollTo(int i7, int i10) {
        if (this.g2.t(i10)) {
            super.scrollTo(i7, i10);
        }
    }
}
