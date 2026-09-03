package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ft {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((lf.k) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new lf.k(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
