package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class tt extends ot {
    public Drawable e2;
    public final /* synthetic */ int f2;
    public final /* synthetic */ yt g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(yt ytVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.g2 = ytVar;
        this.f2 = i7;
        this.e2 = null;
    }

    @Override // org.telegram.ui.Components.ot
    public final void G(int i7, int i10) {
        this.g2.q(i7, i10);
    }

    @Override // org.telegram.ui.Components.rt
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
        yt ytVar = this.g2;
        if (ytVar.a()) {
            org.telegram.ui.bn.C8(menu, null, ytVar.M == 3, true, true, true);
        } else {
            ytVar.i(actionMode, menu);
        }
    }

    @Override // org.telegram.ui.Components.rt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        yt ytVar = this.g2;
        mk0 mk0Var = ytVar.c;
        if (mk0Var != null) {
            boolean z10 = false;
            boolean z11 = i10 != i7;
            if (ytVar.a() && z11) {
                org.telegram.messenger.c6.i();
                z10 = true;
            }
            if (ytVar.n != z10) {
                ytVar.n = z10;
                if (z10) {
                    this.e2 = mk0Var.d;
                    mk0Var.a(R.drawable.msg_edit, true);
                } else {
                    mk0Var.b(this.e2, true);
                    this.e2 = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ut utVar;
        yt ytVar = this.g2;
        if (ytVar.e && motionEvent.getAction() == 0) {
            ytVar.u();
            if (!ytVar.y || (utVar = ytVar.d) == null) {
                ytVar.x(org.telegram.messenger.g0.D ? 0 : 2);
            } else {
                utVar.t(false);
                ytVar.y = false;
                ytVar.k(true);
                org.telegram.messenger.g0.I3(this);
            }
            ytVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.g0.I3(this)) {
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
