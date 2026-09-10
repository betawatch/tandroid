package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mt {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((xf.i) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new xf.i(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
