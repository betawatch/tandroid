package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qd0 extends sd0 {
    public final fi.c2 L;

    public qd0(Context context) {
        super(context, null);
        fi.c2 c2Var = new fi.c2(this, context, 6);
        this.L = c2Var;
        c2Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.V(c2Var, org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.E(c2Var, org.telegram.ui.ActionBar.y6.H6, null);
        c2Var.setBackground(null);
        c2Var.setSingleLine(true);
        c2Var.setInputType(1);
        c2Var.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.f7.m(c2Var, 30, org.telegram.ui.ActionBar.y6.l6, null);
        c2Var.setCursorWidth(1.5f);
        c2Var.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(c2Var);
        addView(c2Var, kb1.i(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.L;
    }

    public void setHint(String str) {
        setText(str);
    }

    @Override // org.telegram.ui.Components.sd0, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
