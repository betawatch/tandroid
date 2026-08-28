package ig;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.z;
import ff.n0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d {
    public final c b;
    public final c c;
    public long e;
    public final RenderNode a = z.c();
    public final Rect d = new Rect();

    public d(e eVar) {
        if (eVar.a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.c = cVar;
            cVar.e = 4;
            cVar.f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), n0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.b = cVar2;
            cVar2.e = 8;
            cVar2.f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
            return;
        }
        if (!eVar.c) {
            c cVar3 = new c(eVar, "blur", 1, false);
            this.b = cVar3;
            cVar3.e = 8;
            cVar3.f = 8;
            cVar3.c(AndroidUtilities.dpf2(40.0f));
            cVar3.e(n0.b());
            this.c = null;
            return;
        }
        c cVar4 = new c(eVar, "blur", 0, false);
        this.b = cVar4;
        boolean z10 = eVar.b;
        int i9 = z10 ? 16 : 8;
        int i10 = z10 ? 16 : 8;
        cVar4.e = i9;
        cVar4.f = i10;
        cVar4.d(AndroidUtilities.dpf2(40.0f), n0.b());
        this.c = null;
    }
}
