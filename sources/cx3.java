// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class cx3 extends rje {
    public final /* synthetic */ tj a;

    public cx3(tj tjVar) {
        this.a = tjVar;
    }

    @Override // rje
    public final void a(Throwable th) {
        ((gx3) this.a.b).d(th);
    }

    @Override // rje
    public final void b(u8a u8aVar) {
        tj tjVar = this.a;
        tjVar.c = u8aVar;
        tjVar.a = new qx6((u8a) tjVar.c, new rj2((byte) 19), ((gx3) tjVar.b).h);
        gx3 gx3Var = (gx3) tjVar.b;
        ArrayList arrayList = new ArrayList();
        gx3Var.a.writeLock().lock();
        try {
            gx3Var.c = (byte) 1;
            arrayList.addAll(gx3Var.b);
            gx3Var.b.clear();
            gx3Var.a.writeLock().unlock();
            gx3Var.d.post(new ex3(arrayList, gx3Var.c, null));
        } catch (Throwable th) {
            gx3Var.a.writeLock().unlock();
            throw th;
        }
    }
}
