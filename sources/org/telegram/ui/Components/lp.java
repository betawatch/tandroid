package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class lp {
    public final org.telegram.ui.ActionBar.f4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public lp(org.telegram.ui.ActionBar.f4 f4Var) {
        this.a = f4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.f4 f4Var = this.a;
        if (f4Var == null || f4Var.a) {
            return null;
        }
        return f4Var.e;
    }
}
