package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fb0 extends gb0 {
    public final bh.g M;

    public fb0(Context context) {
        super(context, null);
        bh.g gVar = new bh.g(7, context, this);
        this.M = gVar;
        gVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(gVar, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.E(gVar, org.telegram.ui.ActionBar.k6.H6, null);
        gVar.setBackground(null);
        gVar.setSingleLine(true);
        gVar.setInputType(1);
        gVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.m(gVar, 30, org.telegram.ui.ActionBar.k6.l6, null);
        gVar.setCursorWidth(1.5f);
        gVar.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        e(gVar);
        addView(gVar, b8.mf.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.M;
    }

    public void setHint(String str) {
        setText(str);
    }

    @Override // org.telegram.ui.Components.gb0, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
