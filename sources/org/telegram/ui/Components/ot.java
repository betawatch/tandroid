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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ot extends lt {
    public Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ tt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(tt ttVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.e = ttVar;
        this.d = i10;
        this.c = null;
    }

    @Override // org.telegram.ui.Components.nt
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        tt ttVar = this.e;
        if (ttVar.a()) {
            org.telegram.ui.rn.k8(menu, null, ttVar.H == 3, true, true, true);
        } else {
            ttVar.i(menu);
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

    @Override // org.telegram.ui.Components.lt
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override // org.telegram.ui.Components.nt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        tt ttVar = this.e;
        el0 el0Var = ttVar.c;
        if (el0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (ttVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (ttVar.n != z10) {
                ttVar.n = z10;
                if (z10) {
                    this.c = el0Var.d;
                    el0Var.a(R.drawable.msg_edit, true);
                } else {
                    el0Var.b(this.c, true);
                    this.c = null;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pt ptVar;
        tt ttVar = this.e;
        if (ttVar.e && motionEvent.getAction() == 0) {
            ttVar.u();
            if (!ttVar.x || (ptVar = ttVar.d) == null) {
                ttVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                ptVar.u(false);
                ttVar.x = false;
                ttVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            ttVar.v();
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
        } catch (Exception e9) {
            FileLog.e(e9);
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
