package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ft extends zs {
    public Drawable Y1;
    public final /* synthetic */ int Z1;
    public final /* synthetic */ lt a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(lt ltVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.a2 = ltVar;
        this.Z1 = i7;
        this.Y1 = null;
    }

    @Override // org.telegram.ui.Components.zs
    public final void F(int i7, int i10) {
        this.a2.q(i7, i10);
    }

    @Override // org.telegram.ui.Components.dt
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
        lt ltVar = this.a2;
        if (ltVar.a()) {
            org.telegram.ui.an.A8(menu, null, ltVar.L == 3, true, true, true);
        } else {
            ltVar.i(actionMode, menu);
        }
    }

    @Override // org.telegram.ui.Components.dt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        lt ltVar = this.a2;
        xj0 xj0Var = ltVar.c;
        if (xj0Var != null) {
            boolean z9 = false;
            boolean z10 = i10 != i7;
            if (ltVar.a() && z10) {
                org.telegram.messenger.as.i();
                z9 = true;
            }
            if (ltVar.n != z9) {
                ltVar.n = z9;
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
        gt gtVar;
        lt ltVar = this.a2;
        if (ltVar.e && motionEvent.getAction() == 0) {
            ltVar.u();
            if (!ltVar.y || (gtVar = ltVar.d) == null) {
                ltVar.x(org.telegram.messenger.g0.D ? 0 : 2);
            } else {
                gtVar.t(false);
                ltVar.y = false;
                ltVar.k(true);
                org.telegram.messenger.g0.K3(this);
            }
            ltVar.v();
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
