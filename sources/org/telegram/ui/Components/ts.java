package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ts {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((gf.l) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new gf.l(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
