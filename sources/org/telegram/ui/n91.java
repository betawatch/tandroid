package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class n91 extends z81 {
    public final int v;
    public final int w;
    public int x;
    public oh y;

    public n91(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.z81
    public final void b(b91 b91Var) {
        int i10;
        if (b91Var == null || (i10 = this.x) < 0) {
            return;
        }
        b91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.z81
    public final void c() {
    }

    @Override // org.telegram.ui.z81
    public final void f() {
    }
}
