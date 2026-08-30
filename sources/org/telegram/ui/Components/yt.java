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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yt extends vt {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ du e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt(du duVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.e = duVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.xt
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        du duVar = this.e;
        if (duVar.a()) {
            org.telegram.ui.xn.k8(menu, null, duVar.I == 3, true, true, true);
        } else {
            duVar.i(menu);
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

    @Override // org.telegram.ui.Components.vt
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.xt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        du duVar = this.e;
        yl0 yl0Var = duVar.c;
        if (yl0Var != null) {
            boolean z4 = false;
            boolean z10 = i11 != i10;
            if (duVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z4 = true;
            }
            if (duVar.n != z4) {
                duVar.n = z4;
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
        zt ztVar;
        du duVar = this.e;
        if (duVar.e && motionEvent.getAction() == 0) {
            duVar.u();
            if (!duVar.x || (ztVar = duVar.d) == null) {
                duVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                ztVar.t(false);
                duVar.x = false;
                duVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            duVar.v();
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
