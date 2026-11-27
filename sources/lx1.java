// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lx1 implements qs3 {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ wla c;

    public lx1(float f, wla wlaVar) {
        this.b = f;
        this.c = wlaVar;
    }

    @Override // qs3
    public final void a(vpa vpaVar, float f, float f2) {
        if (this.a || f < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
