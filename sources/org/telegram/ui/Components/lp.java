package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class lp {
    public final org.telegram.ui.ActionBar.d4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public lp(org.telegram.ui.ActionBar.d4 d4Var) {
        this.a = d4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.d4 d4Var = this.a;
        if (d4Var == null || d4Var.a) {
            return null;
        }
        return d4Var.e;
    }
}
