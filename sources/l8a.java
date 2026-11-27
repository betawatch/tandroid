// default package

import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
