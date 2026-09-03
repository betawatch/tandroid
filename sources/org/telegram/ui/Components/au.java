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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class au extends xt {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ fu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(fu fuVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.e = fuVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.zt
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        fu fuVar = this.e;
        if (fuVar.a()) {
            org.telegram.ui.xn.k8(menu, null, fuVar.I == 3, true, true, true);
        } else {
            fuVar.i(menu);
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

    @Override // org.telegram.ui.Components.xt
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.zt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        fu fuVar = this.e;
        yl0 yl0Var = fuVar.c;
        if (yl0Var != null) {
            boolean z4 = false;
            boolean z10 = i11 != i10;
            if (fuVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z4 = true;
            }
            if (fuVar.n != z4) {
                fuVar.n = z4;
                if (z4) {
                    this.c = yl0Var.d;
                    yl0Var.a(R.drawable.msg_edit, true);
                } else {
                    yl0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bu buVar;
        fu fuVar = this.e;
        if (fuVar.e && motionEvent.getAction() == 0) {
            fuVar.u();
            if (!fuVar.x || (buVar = fuVar.d) == null) {
                fuVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                buVar.t(false);
                fuVar.x = false;
                fuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            fuVar.v();
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
        } catch (Exception e6) {
            FileLog.e(e6);
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
