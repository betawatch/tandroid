package ah;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import org.telegram.messenger.AndroidUtilities;
import yf.f0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class g {
    public final f b;
    public final f c;
    public long e;
    public final RenderNode a = e.c();
    public final Rect d = new Rect();

    public g(h hVar) {
        if (hVar.a) {
            f fVar = new f(hVar, "glass", 0, true);
            this.c = fVar;
            fVar.e = 4;
            fVar.f = 4;
            fVar.d(AndroidUtilities.dpf2(6.0f), f0.b());
            f fVar2 = new f(hVar, "blur", 0, false);
            this.b = fVar2;
            fVar2.e = 8;
            fVar2.f = 8;
            fVar2.c(AndroidUtilities.dpf2(38.34f));
            return;
        }
        if (!hVar.c) {
            f fVar3 = new f(hVar, "blur", 1, false);
            this.b = fVar3;
            fVar3.e = 8;
            fVar3.f = 8;
            fVar3.c(AndroidUtilities.dpf2(40.0f));
            fVar3.e(f0.b());
            this.c = null;
            return;
        }
        f fVar4 = new f(hVar, "blur", 0, false);
        this.b = fVar4;
        boolean z10 = hVar.b;
        int i10 = z10 ? 16 : 8;
        int i11 = z10 ? 16 : 8;
        fVar4.e = i10;
        fVar4.f = i11;
        fVar4.d(AndroidUtilities.dpf2(40.0f), f0.b());
        this.c = null;
    }

    public static void a(g gVar, RectF rectF) {
        Rect rect = gVar.d;
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
