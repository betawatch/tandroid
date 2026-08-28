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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pt extends mt {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ut e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(ut utVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.e = utVar;
        this.d = i9;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.ot
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ut utVar = this.e;
        if (utVar.a()) {
            org.telegram.ui.qn.k8(menu, null, utVar.H == 3, true, true, true);
        } else {
            utVar.i(menu);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final int getActionModeStyle() {
        int i9 = this.d;
        if (i9 == 2 || i9 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override // org.telegram.ui.Components.mt
    public final void onLineCountChanged(int i9, int i10) {
        this.e.q(i9, i10);
    }

    @Override // org.telegram.ui.Components.ot, android.widget.TextView
    public final void onSelectionChanged(int i9, int i10) {
        super.onSelectionChanged(i9, i10);
        ut utVar = this.e;
        bl0 bl0Var = utVar.c;
        if (bl0Var != null) {
            boolean z10 = false;
            boolean z11 = i10 != i9;
            if (utVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (utVar.n != z10) {
                utVar.n = z10;
                if (z10) {
                    this.c = bl0Var.d;
                    bl0Var.a(R.drawable.msg_edit, true);
                } else {
                    bl0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qt qtVar;
        ut utVar = this.e;
        if (utVar.e && motionEvent.getAction() == 0) {
            utVar.u();
            if (!utVar.x || (qtVar = utVar.d) == null) {
                utVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                qtVar.t(false);
                utVar.x = false;
                utVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            utVar.v();
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
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i9, int i10) {
        if (this.e.t(i10)) {
            super.scrollTo(i9, i10);
        }
    }
}
