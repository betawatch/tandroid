package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ip {
    public final org.telegram.ui.ActionBar.e4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public ip(org.telegram.ui.ActionBar.e4 e4Var) {
        this.a = e4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.e4 e4Var = this.a;
        if (e4Var == null || e4Var.a) {
            return null;
        }
        return e4Var.e;
    }
}
