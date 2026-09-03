package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ct {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((kf.k) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new kf.k(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
