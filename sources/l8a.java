// default package

import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
