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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vt extends st {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ au e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(au auVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.e = auVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.ut
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        au auVar = this.e;
        if (auVar.a()) {
            org.telegram.ui.tn.k8(menu, null, auVar.H == 3, true, true, true);
        } else {
            auVar.i(menu);
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

    @Override // org.telegram.ui.Components.st
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.ut, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        au auVar = this.e;
        ol0 ol0Var = auVar.c;
        if (ol0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (auVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (auVar.n != z10) {
                auVar.n = z10;
                if (z10) {
                    this.c = ol0Var.d;
                    ol0Var.a(R.drawable.msg_edit, true);
                } else {
                    ol0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wt wtVar;
        au auVar = this.e;
        if (auVar.e && motionEvent.getAction() == 0) {
            auVar.u();
            if (!auVar.x || (wtVar = auVar.d) == null) {
                auVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                wtVar.t(false);
                auVar.x = false;
                auVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            auVar.v();
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
    public final void scrollTo(int i10, int i11) {
        if (this.e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
