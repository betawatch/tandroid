package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
