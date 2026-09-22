package ah;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import org.telegram.messenger.AndroidUtilities;
import yf.f0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class h {
    public final g b;
    public final g c;
    public long e;
    public final RenderNode a = f.c();
    public final Rect d = new Rect();

    public h(i iVar) {
        if (iVar.a) {
            g gVar = new g(iVar, "glass", 0, true);
            this.c = gVar;
            gVar.e = 4;
            gVar.f = 4;
            gVar.d(AndroidUtilities.dpf2(6.0f), f0.b());
            g gVar2 = new g(iVar, "blur", 0, false);
            this.b = gVar2;
            gVar2.e = 8;
            gVar2.f = 8;
            gVar2.c(AndroidUtilities.dpf2(38.34f));
            return;
        }
        if (!iVar.c) {
            g gVar3 = new g(iVar, "blur", 1, false);
            this.b = gVar3;
            gVar3.e = 8;
            gVar3.f = 8;
            gVar3.c(AndroidUtilities.dpf2(40.0f));
            gVar3.e(f0.b());
            this.c = null;
            return;
        }
        g gVar4 = new g(iVar, "blur", 0, false);
        this.b = gVar4;
        boolean z10 = iVar.b;
        int i10 = z10 ? 16 : 8;
        int i11 = z10 ? 16 : 8;
        gVar4.e = i10;
        gVar4.f = i11;
        gVar4.d(AndroidUtilities.dpf2(40.0f), f0.b());
        this.c = null;
    }

    public static void a(h hVar, RectF rectF) {
        Rect rect = hVar.d;
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
