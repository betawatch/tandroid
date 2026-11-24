// default package

import java.io.File;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e93 extends vy5 implements rr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e93(Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = obj;
    }

    @Override // rr4
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                h93 h93Var = (h93) this.c;
                if (th != null) {
                    h93Var.h.F(new vh4(th));
                }
                if (h93Var.j.b != nf5.d) {
                    ((hd4) h93Var.j.getValue()).close();
                }
                return g7c.a;
            default:
                File file = (File) obj;
                file.getClass();
                return new ui7(((nx2) this.c).a, file);
        }
    }
}
