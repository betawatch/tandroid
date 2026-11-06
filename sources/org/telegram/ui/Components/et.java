package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class et extends ys {
    public Drawable Y1;
    public final /* synthetic */ int Z1;
    public final /* synthetic */ kt a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(kt ktVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.a2 = ktVar;
        this.Z1 = i7;
        this.Y1 = null;
    }

    @Override // org.telegram.ui.Components.ys
    public final void F(int i7, int i10) {
        this.a2.q(i7, i10);
    }

    @Override // org.telegram.ui.Components.ct
    public final int e() {
        return this.a2.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final int getActionModeStyle() {
        int i7 = this.Z1;
        if (i7 == 2 || i7 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        kt ktVar = this.a2;
        if (ktVar.a()) {
            org.telegram.ui.an.A8(menu, null, ktVar.L == 3, true, true, true);
        } else {
            ktVar.i(actionMode, menu);
        }
    }

    @Override // org.telegram.ui.Components.ct, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        kt ktVar = this.a2;
        xj0 xj0Var = ktVar.c;
        if (xj0Var != null) {
            boolean z9 = false;
            boolean z10 = i10 != i7;
            if (ktVar.a() && z10) {
                org.telegram.messenger.as.i();
                z9 = true;
            }
            if (ktVar.n != z9) {
                ktVar.n = z9;
                if (z9) {
                    this.Y1 = xj0Var.d;
                    xj0Var.a(R.drawable.msg_edit, true);
                } else {
                    xj0Var.b(this.Y1, true);
                    this.Y1 = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ft ftVar;
        kt ktVar = this.a2;
        if (ktVar.e && motionEvent.getAction() == 0) {
            ktVar.u();
            if (!ktVar.y || (ftVar = ktVar.d) == null) {
                ktVar.x(org.telegram.messenger.g0.D ? 0 : 2);
            } else {
                ftVar.t(false);
                ktVar.y = false;
                ktVar.k(true);
                org.telegram.messenger.g0.K3(this);
            }
            ktVar.v();
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
    public final void scrollTo(int i7, int i10) {
        if (this.a2.t(i10)) {
            super.scrollTo(i7, i10);
        }
    }
}
