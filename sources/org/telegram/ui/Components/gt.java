package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class gt {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((yf.i) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new yf.i(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
