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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class iu extends fu {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(nu nuVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.e = nuVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.hu
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        nu nuVar = this.e;
        if (nuVar.a()) {
            org.telegram.ui.eo.k8(menu, null, nuVar.L == 3, true, true, true);
        } else {
            nuVar.i(menu);
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

    @Override // org.telegram.ui.Components.fu
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.hu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        nu nuVar = this.e;
        am0 am0Var = nuVar.c;
        if (am0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (nuVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (nuVar.n != z10) {
                nuVar.n = z10;
                if (z10) {
                    this.c = am0Var.d;
                    am0Var.a(R.drawable.msg_edit, true);
                } else {
                    am0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ju juVar;
        nu nuVar = this.e;
        if (nuVar.e && motionEvent.getAction() == 0) {
            nuVar.u();
            if (!nuVar.x || (juVar = nuVar.d) == null) {
                nuVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                juVar.t(false);
                nuVar.x = false;
                nuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            nuVar.v();
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
