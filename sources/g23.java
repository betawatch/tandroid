// default package

import android.os.CancellationSignal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g23 implements ur4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g23(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((CancellationSignal) obj2).cancel();
                break;
            default:
                ((va1) obj2).resumeWith(f9cVar);
                break;
        }
        return f9cVar;
    }
}
