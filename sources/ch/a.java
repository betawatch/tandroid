package ch;

import a3.d;
import fe.e;
import fe.f;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.voip.c2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a implements e {
    public final f a;
    public final f b;
    public final fe.b c;
    public final fe.b d;
    public final c2 e;
    public final d f;
    public boolean h;

    public a(c2 c2Var, d dVar) {
        gr grVar = gr.h;
        this.a = new f(1, this, grVar, 350L);
        this.b = new f(2, this, grVar, 350L);
        this.c = new fe.b(0, this, grVar, 350L, true);
        this.d = new fe.b(3, this, grVar, 350L, true);
        this.h = true;
        this.e = c2Var;
        this.f = dVar;
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, f fVar) {
        c2 c2Var = this.e;
        if (i10 == 1) {
            c2Var.setTranslationX(this.a.f);
        }
        if (i10 == 2) {
            c2Var.setTranslationY(this.b.f);
        }
        fe.b bVar = this.d;
        fe.b bVar2 = this.c;
        if (i10 == 0) {
            c2Var.setAlpha(i0.T1(0.5f, 1.0f, bVar.e) * bVar2.e);
            c2Var.setScaleX(i0.T1(0.3f, 1.0f, f7));
            c2Var.setScaleY(i0.T1(0.3f, 1.0f, f7));
            c2Var.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            c2Var.setAlpha(i0.T1(0.5f, 1.0f, bVar.e) * bVar2.e);
        }
        d dVar = this.f;
        if (dVar != null) {
            dVar.run();
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
