package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.XiaomiUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class eu extends bu {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ju e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(ju juVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.e = juVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.du
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ju juVar = this.e;
        if (juVar.a()) {
            org.telegram.ui.bo.k8(menu, null, juVar.L == 3, true, true, true);
        } else {
            juVar.i(menu);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final int getActionModeStyle() {
        int i10 = this.d;
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override // org.telegram.ui.Components.bu
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.du, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        ju juVar = this.e;
        ql0 ql0Var = juVar.c;
        if (ql0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (juVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (juVar.n != z10) {
                juVar.n = z10;
                if (z10) {
                    this.c = ql0Var.d;
                    ql0Var.a(R.drawable.msg_edit, true);
                } else {
                    ql0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fu fuVar;
        ju juVar = this.e;
        if (juVar.e && motionEvent.getAction() == 0) {
            juVar.u();
            if (!juVar.x || (fuVar = juVar.d) == null) {
                juVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                fuVar.t(false);
                juVar.x = false;
                juVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            juVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!AndroidUtilities.showKeyboard(this)) {
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
            FileLog.e(e);
            return false;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (this.e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
