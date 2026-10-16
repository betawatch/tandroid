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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qu extends nu {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ vu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(vu vuVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.e = vuVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.pu
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        vu vuVar = this.e;
        if (vuVar.a()) {
            org.telegram.ui.fo.n8(menu, null, vuVar.L == 3, true, true, true);
        } else {
            vuVar.i(menu);
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

    @Override // org.telegram.ui.Components.nu
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.pu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        vu vuVar = this.e;
        rm0 rm0Var = vuVar.c;
        if (rm0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (vuVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (vuVar.n != z10) {
                vuVar.n = z10;
                if (z10) {
                    this.c = rm0Var.d;
                    rm0Var.a(R.drawable.msg_edit, true);
                } else {
                    rm0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ru ruVar;
        vu vuVar = this.e;
        if (vuVar.e && motionEvent.getAction() == 0) {
            vuVar.u();
            if (!vuVar.x || (ruVar = vuVar.d) == null) {
                vuVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                ruVar.u(false);
                vuVar.x = false;
                vuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            vuVar.v();
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
