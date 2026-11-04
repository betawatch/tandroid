package eh;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import cg.n0;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f {
    public final e b;
    public final e c;
    public long e;
    public final RenderNode a = w.c();
    public final Rect d = new Rect();

    public f(g gVar) {
        boolean z10 = gVar.a;
        boolean z11 = gVar.c;
        if (z10) {
            if (z11) {
                e eVar = new e(gVar, "glass", 0, true);
                this.c = eVar;
                eVar.e = 4;
                eVar.f = 4;
                eVar.d(g0.N(6.0f), n0.d());
            } else {
                e eVar2 = new e(gVar, "glass", 1, true);
                this.c = eVar2;
                eVar2.e = 4;
                eVar2.f = 4;
                eVar2.c(g0.N(6.0f));
                eVar2.e(n0.d());
            }
            e eVar3 = new e(gVar, "blur", 0, false);
            this.b = eVar3;
            eVar3.e = 8;
            eVar3.f = 8;
            eVar3.c(g0.N(38.34f));
            return;
        }
        if (!z11) {
            e eVar4 = new e(gVar, "blur", 1, false);
            this.b = eVar4;
            eVar4.e = 8;
            eVar4.f = 8;
            eVar4.c(g0.N(40.0f));
            eVar4.e(n0.d());
            this.c = null;
            return;
        }
        e eVar5 = new e(gVar, "blur", 0, false);
        this.b = eVar5;
        boolean z12 = gVar.b;
        int i3 = z12 ? 16 : 8;
        int i10 = z12 ? 16 : 8;
        eVar5.e = i3;
        eVar5.f = i10;
        eVar5.d(g0.N(40.0f), n0.d());
        this.c = null;
    }

    public static void a(f fVar, RectF rectF) {
        Rect rect = fVar.d;
        float f10 = rectF.left;
        float f11 = 16;
        rect.left = Math.round(f10 - (f10 % f11));
        float f12 = rectF.top;
        rect.top = Math.round(f12 - (f12 % f11));
        float f13 = rectF.right;
        rect.right = Math.round((f11 - (f13 % f11)) + f13);
        float f14 = rectF.bottom;
        rect.bottom = Math.round((f11 - (f14 % f11)) + f14);
    }
}
