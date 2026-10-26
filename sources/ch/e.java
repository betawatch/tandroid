package ch;

import ag.t0;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.x;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e {
    public final d b;
    public final d c;
    public long e;
    public final RenderNode a = x.c();
    public final Rect d = new Rect();

    public e(f fVar) {
        boolean z10 = fVar.a;
        boolean z11 = fVar.c;
        if (z10) {
            if (z11) {
                d dVar = new d(fVar, "glass", 0, true);
                this.c = dVar;
                dVar.e = 4;
                dVar.f = 4;
                dVar.d(AndroidUtilities.dpf2(6.0f), t0.d());
            } else {
                d dVar2 = new d(fVar, "glass", 1, true);
                this.c = dVar2;
                dVar2.e = 4;
                dVar2.f = 4;
                dVar2.c(AndroidUtilities.dpf2(6.0f));
                dVar2.e(t0.d());
            }
            d dVar3 = new d(fVar, "blur", 0, false);
            this.b = dVar3;
            dVar3.e = 8;
            dVar3.f = 8;
            dVar3.c(AndroidUtilities.dpf2(38.34f));
            return;
        }
        if (!z11) {
            d dVar4 = new d(fVar, "blur", 1, false);
            this.b = dVar4;
            dVar4.e = 8;
            dVar4.f = 8;
            dVar4.c(AndroidUtilities.dpf2(40.0f));
            dVar4.e(t0.d());
            this.c = null;
            return;
        }
        d dVar5 = new d(fVar, "blur", 0, false);
        this.b = dVar5;
        boolean z12 = fVar.b;
        int i10 = z12 ? 16 : 8;
        int i11 = z12 ? 16 : 8;
        dVar5.e = i10;
        dVar5.f = i11;
        dVar5.d(AndroidUtilities.dpf2(40.0f), t0.d());
        this.c = null;
    }

    public static void a(e eVar, RectF rectF) {
        Rect rect = eVar.d;
        float f7 = rectF.left;
        float f10 = 16;
        rect.left = Math.round(f7 - (f7 % f10));
        float f11 = rectF.top;
        rect.top = Math.round(f11 - (f11 % f10));
        float f12 = rectF.right;
        rect.right = Math.round((f10 - (f12 % f10)) + f12);
        float f13 = rectF.bottom;
        rect.bottom = Math.round((f10 - (f13 % f10)) + f13);
    }
}
