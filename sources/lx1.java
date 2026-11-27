// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
