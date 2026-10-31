package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dc0 extends ec0 {
    public final org.telegram.ui.ActionBar.n0 L;

    public dc0(Context context) {
        super(context, null);
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 4);
        this.L = n0Var;
        n0Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.V(n0Var, org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.ui.ActionBar.a7.E(n0Var, org.telegram.ui.ActionBar.t6.H6, null);
        n0Var.setBackground(null);
        n0Var.setSingleLine(true);
        n0Var.setInputType(1);
        n0Var.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.a7.m(n0Var, 30, org.telegram.ui.ActionBar.t6.l6, null);
        n0Var.setCursorWidth(1.5f);
        n0Var.setPadding(org.telegram.messenger.i0.L(15.0f), 0, org.telegram.messenger.i0.L(15.0f), 0);
        e(n0Var);
        addView(n0Var, w7.b6.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.L;
    }

    public void setHint(String str) {
        setText(str);
    }

    @Override // org.telegram.ui.Components.ec0, org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
