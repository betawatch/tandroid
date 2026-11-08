package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class kb0 extends lb0 {
    public final ah.i L;

    public kb0(Context context) {
        super(context, null);
        ah.i iVar = new ah.i(7, context, this);
        this.L = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(iVar, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.E(iVar, org.telegram.ui.ActionBar.k6.H6, null);
        iVar.setBackground(null);
        iVar.setSingleLine(true);
        iVar.setInputType(1);
        iVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.m(iVar, 30, org.telegram.ui.ActionBar.k6.l6, null);
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

    @Override // org.telegram.ui.Components.lb0, org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
