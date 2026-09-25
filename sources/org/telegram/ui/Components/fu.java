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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class fu extends cu {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ku e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu(ku kuVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e = kuVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.eu
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ku kuVar = this.e;
        if (kuVar.a()) {
            org.telegram.ui.wn.k8(menu, null, kuVar.L == 3, true, true, true);
        } else {
            kuVar.i(menu);
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

    @Override // org.telegram.ui.Components.cu
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.eu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        ku kuVar = this.e;
        bm0 bm0Var = kuVar.c;
        if (bm0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (kuVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (kuVar.n != z10) {
                kuVar.n = z10;
                if (z10) {
                    this.c = bm0Var.d;
                    bm0Var.a(R.drawable.msg_edit, true);
                } else {
                    bm0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gu guVar;
        ku kuVar = this.e;
        if (kuVar.e && motionEvent.getAction() == 0) {
            kuVar.u();
            if (!kuVar.x || (guVar = kuVar.d) == null) {
                kuVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                guVar.t(false);
                kuVar.x = false;
                kuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            kuVar.v();
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
