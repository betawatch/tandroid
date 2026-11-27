// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class l8a implements f8a {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l8a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // f8a
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                g8a g8aVar = new g8a();
                g8aVar.c = ((ov5) obj).create(g8aVar, g8aVar);
                return g8aVar;
            default:
                return (Iterator) obj;
        }
    }
}
