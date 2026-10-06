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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class hu extends eu {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ mu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(mu muVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e = muVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.gu
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        mu muVar = this.e;
        if (muVar.a()) {
            org.telegram.ui.yn.k8(menu, null, muVar.L == 3, true, true, true);
        } else {
            muVar.i(menu);
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

    @Override // org.telegram.ui.Components.eu
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.gu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        mu muVar = this.e;
        hm0 hm0Var = muVar.c;
        if (hm0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (muVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (muVar.n != z10) {
                muVar.n = z10;
                if (z10) {
                    this.c = hm0Var.d;
                    hm0Var.a(R.drawable.msg_edit, true);
                } else {
                    hm0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        iu iuVar;
        mu muVar = this.e;
        if (muVar.e && motionEvent.getAction() == 0) {
            muVar.u();
            if (!muVar.x || (iuVar = muVar.d) == null) {
                muVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                iuVar.t(false);
                muVar.x = false;
                muVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            muVar.v();
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
