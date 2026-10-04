package ah;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import e0.h0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class h {
    public final g b;
    public final g c;
    public long e;
    public final RenderNode a = f.c();
    public final Rect d = new Rect();

    public h(i iVar) {
        boolean z10 = iVar.a;
        boolean z11 = iVar.c;
        if (z10) {
            if (z11) {
                g gVar = new g(iVar, "glass", 0, true);
                this.c = gVar;
                gVar.e = 4;
                gVar.f = 4;
                gVar.d(AndroidUtilities.dpf2(6.0f), h0.c());
            } else {
                g gVar2 = new g(iVar, "glass", 1, true);
                this.c = gVar2;
                gVar2.e = 4;
                gVar2.f = 4;
                gVar2.c(AndroidUtilities.dpf2(6.0f));
                gVar2.e(h0.c());
            }
            g gVar3 = new g(iVar, "blur", 0, false);
            this.b = gVar3;
            gVar3.e = 8;
            gVar3.f = 8;
            gVar3.c(AndroidUtilities.dpf2(38.34f));
            return;
        }
        if (!z11) {
            g gVar4 = new g(iVar, "blur", 1, false);
            this.b = gVar4;
            gVar4.e = 8;
            gVar4.f = 8;
            gVar4.c(AndroidUtilities.dpf2(40.0f));
            gVar4.e(h0.c());
            this.c = null;
            return;
        }
        g gVar5 = new g(iVar, "blur", 0, false);
        this.b = gVar5;
        boolean z12 = iVar.b;
        int i10 = z12 ? 16 : 8;
        int i11 = z12 ? 16 : 8;
        gVar5.e = i10;
        gVar5.f = i11;
        gVar5.d(AndroidUtilities.dpf2(40.0f), h0.c());
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
