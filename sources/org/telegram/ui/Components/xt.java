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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xt extends ut {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ cu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(cu cuVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.e = cuVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.wt
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        cu cuVar = this.e;
        if (cuVar.a()) {
            org.telegram.ui.zn.k8(menu, null, cuVar.I == 3, true, true, true);
        } else {
            cuVar.i(menu);
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

    @Override // org.telegram.ui.Components.ut
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.wt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        cu cuVar = this.e;
        xl0 xl0Var = cuVar.c;
        if (xl0Var != null) {
            boolean z4 = false;
            boolean z10 = i11 != i10;
            if (cuVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z4 = true;
            }
            if (cuVar.n != z4) {
                cuVar.n = z4;
                if (z4) {
                    this.c = xl0Var.d;
                    xl0Var.a(R.drawable.msg_edit, true);
                } else {
                    xl0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yt ytVar;
        cu cuVar = this.e;
        if (cuVar.e && motionEvent.getAction() == 0) {
            cuVar.u();
            if (!cuVar.x || (ytVar = cuVar.d) == null) {
                cuVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                ytVar.t(false);
                cuVar.x = false;
                cuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            cuVar.v();
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
