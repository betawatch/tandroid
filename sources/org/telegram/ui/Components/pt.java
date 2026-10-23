package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class pt {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((zf.i) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new zf.i(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
