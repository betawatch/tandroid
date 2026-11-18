package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class rt extends mt {
    public Drawable e2;
    public final /* synthetic */ int f2;
    public final /* synthetic */ wt g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt(wt wtVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.g2 = wtVar;
        this.f2 = i7;
        this.e2 = null;
    }

    @Override // org.telegram.ui.Components.mt
    public final void G(int i7, int i10) {
        this.g2.q(i7, i10);
    }

    @Override // org.telegram.ui.Components.pt
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
        wt wtVar = this.g2;
        if (wtVar.a()) {
            org.telegram.ui.bn.C8(menu, null, wtVar.M == 3, true, true, true);
        } else {
            wtVar.i(actionMode, menu);
        }
    }

    @Override // org.telegram.ui.Components.pt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        wt wtVar = this.g2;
        kk0 kk0Var = wtVar.c;
        if (kk0Var != null) {
            boolean z10 = false;
            boolean z11 = i10 != i7;
            if (wtVar.a() && z11) {
                org.telegram.messenger.c6.i();
                z10 = true;
            }
            if (wtVar.n != z10) {
                wtVar.n = z10;
                if (z10) {
                    this.e2 = kk0Var.d;
                    kk0Var.a(R.drawable.msg_edit, true);
                } else {
                    kk0Var.b(this.e2, true);
                    this.e2 = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        st stVar;
        wt wtVar = this.g2;
        if (wtVar.e && motionEvent.getAction() == 0) {
            wtVar.u();
            if (!wtVar.y || (stVar = wtVar.d) == null) {
                wtVar.x(org.telegram.messenger.g0.D ? 0 : 2);
            } else {
                stVar.t(false);
                wtVar.y = false;
                wtVar.k(true);
                org.telegram.messenger.g0.I3(this);
            }
            wtVar.v();
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
