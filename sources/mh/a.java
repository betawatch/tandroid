package mh;

import k2.c;
import oe.d;
import oe.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.voip.w2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a implements d {
    public final e a;
    public final e b;
    public final oe.b c;
    public final oe.b d;
    public final w2 e;
    public final c f;
    public boolean h;

    public a(w2 w2Var, c cVar) {
        ds dsVar = ds.h;
        this.a = new e(1, this, dsVar, 350L);
        this.b = new e(2, this, dsVar, 350L);
        this.c = new oe.b(0, this, dsVar, 350L, true);
        this.d = new oe.b(3, this, dsVar, 350L, true);
        this.h = true;
        this.e = w2Var;
        this.f = cVar;
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, e eVar) {
        w2 w2Var = this.e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.a.f);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.b.f);
        }
        oe.b bVar = this.d;
        oe.b bVar2 = this.c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
            w2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            w2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f7));
            w2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        c cVar = this.f;
        if (cVar != null) {
            cVar.run();
        }
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
