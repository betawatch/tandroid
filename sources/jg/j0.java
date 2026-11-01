package jg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.cr0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j0 extends ig.c1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ cr0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(cr0 cr0Var, Context context, ig.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = cr0Var;
        this.E = bitmap2;
    }

    @Override // ig.c1
    public final void g(ig.h hVar) {
        int indexOf = ig.h.a.indexOf(hVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        cr0 cr0Var = this.F;
        cr0Var.c1.b(indexOf);
        cr0Var.z(hVar);
    }
}
