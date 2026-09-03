package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bd0 extends cd0 {
    public final lg.f I;

    public bd0(Context context) {
        super(context, null);
        lg.f fVar = new lg.f(this, context, 4);
        this.I = fVar;
        fVar.setTextSize(1, 18.0f);
        fVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        fVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
        fVar.setBackground(null);
        fVar.setSingleLine(true);
        fVar.setInputType(1);
        fVar.setTypeface(Typeface.DEFAULT);
        fVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.l6, false));
        fVar.setCursorWidth(1.5f);
        fVar.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        e(fVar);
        addView(fVar, k7.c6.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.I;
    }

    public void setHint(String str) {
        setText(str);
    }
}
