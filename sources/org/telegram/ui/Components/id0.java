package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class id0 extends jd0 {
    public final ci.h2 L;

    public id0(Context context) {
        super(context, null);
        ci.h2 h2Var = new ci.h2(this, context, 5);
        this.L = h2Var;
        h2Var.setTextSize(1, 18.0f);
        h2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        h2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
        h2Var.setBackground(null);
        h2Var.setSingleLine(true);
        h2Var.setInputType(1);
        h2Var.setTypeface(Typeface.DEFAULT);
        h2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.l6, false));
        h2Var.setCursorWidth(1.5f);
        h2Var.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(h2Var);
        addView(h2Var, w7.y5.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.L;
    }

    public void setHint(String str) {
        setText(str);
    }
}
