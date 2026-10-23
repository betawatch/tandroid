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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class lu extends iu {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ qu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(qu quVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.e = quVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.ku
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        qu quVar = this.e;
        if (quVar.a()) {
            org.telegram.ui.sn.n8(menu, null, quVar.L == 3, true, true, true);
        } else {
            quVar.i(actionMode, menu);
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

    @Override // org.telegram.ui.Components.iu
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.ku, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        qu quVar = this.e;
        rm0 rm0Var = quVar.c;
        if (rm0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (quVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (quVar.n != z10) {
                quVar.n = z10;
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
        mu muVar;
        qu quVar = this.e;
        if (quVar.e && motionEvent.getAction() == 0) {
            quVar.u();
            if (!quVar.x || (muVar = quVar.d) == null) {
                quVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                muVar.u(false);
                quVar.x = false;
                quVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            quVar.v();
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
