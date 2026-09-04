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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class cu extends zt {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ hu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(hu huVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.e = huVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.bu
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        hu huVar = this.e;
        if (huVar.a()) {
            org.telegram.ui.co.k8(menu, null, huVar.L == 3, true, true, true);
        } else {
            huVar.i(menu);
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

    @Override // org.telegram.ui.Components.zt
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.bu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        hu huVar = this.e;
        ql0 ql0Var = huVar.c;
        if (ql0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (huVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (huVar.n != z10) {
                huVar.n = z10;
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
        du duVar;
        hu huVar = this.e;
        if (huVar.e && motionEvent.getAction() == 0) {
            huVar.u();
            if (!huVar.x || (duVar = huVar.d) == null) {
                huVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                duVar.t(false);
                huVar.x = false;
                huVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            huVar.v();
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
