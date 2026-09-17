package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class ft {
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
