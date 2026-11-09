package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lb0 extends mb0 {
    public final ah.i L;

    public lb0(Context context) {
        super(context, null);
        ah.i iVar = new ah.i(7, context, this);
        this.L = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.s6.U(iVar, org.telegram.ui.ActionBar.l6.G6, null);
        org.telegram.ui.ActionBar.s6.D(iVar, org.telegram.ui.ActionBar.l6.H6, null);
        iVar.setBackground(null);
        iVar.setSingleLine(true);
        iVar.setInputType(1);
        iVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.s6.l(iVar, 30, org.telegram.ui.ActionBar.l6.l6, null);
        iVar.setCursorWidth(1.5f);
        iVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        e(iVar);
        addView(iVar, c8.ha.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.L;
    }

    public void setHint(String str) {
        setText(str);
    }

    @Override // org.telegram.ui.Components.mb0, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
