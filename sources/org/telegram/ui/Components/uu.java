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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class uu extends ru {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(zu zuVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.e = zuVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.tu
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        zu zuVar = this.e;
        if (zuVar.a()) {
            org.telegram.ui.zn.n8(menu, null, zuVar.L == 3, true, true, true);
        } else {
            zuVar.i(menu);
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

    @Override // org.telegram.ui.Components.ru
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.tu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        zu zuVar = this.e;
        vm0 vm0Var = zuVar.c;
        if (vm0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (zuVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (zuVar.n != z10) {
                zuVar.n = z10;
                if (z10) {
                    this.c = vm0Var.d;
                    vm0Var.a(R.drawable.msg_edit, true);
                } else {
                    vm0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vu vuVar;
        zu zuVar = this.e;
        if (zuVar.e && motionEvent.getAction() == 0) {
            zuVar.u();
            if (!zuVar.x || (vuVar = zuVar.d) == null) {
                zuVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                vuVar.u(false);
                zuVar.x = false;
                zuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            zuVar.v();
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
