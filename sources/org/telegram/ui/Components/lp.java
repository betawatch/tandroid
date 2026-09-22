package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
