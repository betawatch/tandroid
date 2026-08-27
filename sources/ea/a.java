package ea;

import af.h;
import id.z0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v8.b;
import v8.c;
import z8.d;
import z8.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements d {
    public static final a b = new a(0);
    public static final a c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // z8.d
    public final Object u0(h hVar) {
        switch (this.a) {
            case 0:
                Object b10 = hVar.b(new q(v8.a.class, Executor.class));
                j.d(b10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) b10);
            case 1:
                Object b11 = hVar.b(new q(c.class, Executor.class));
                j.d(b11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) b11);
            case 2:
                Object b12 = hVar.b(new q(b.class, Executor.class));
                j.d(b12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) b12);
            default:
                Object b13 = hVar.b(new q(v8.d.class, Executor.class));
                j.d(b13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) b13);
        }
    }
}
