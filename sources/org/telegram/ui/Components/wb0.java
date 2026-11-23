package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wb0 extends yb0 {
    public final ah.i M;

    public wb0(Context context) {
        super(context, null);
        ah.i iVar = new ah.i(7, context, this);
        this.M = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.U(iVar, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.D(iVar, org.telegram.ui.ActionBar.m6.H6, null);
        iVar.setBackground(null);
        iVar.setSingleLine(true);
        iVar.setInputType(1);
        iVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.t6.l(iVar, 30, org.telegram.ui.ActionBar.m6.l6, null);
        iVar.setCursorWidth(1.5f);
        iVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        e(iVar);
        addView(iVar, c8.ma.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.M;
    }

    public void setHint(String str) {
        setText(str);
    }

    @Override // org.telegram.ui.Components.yb0, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
