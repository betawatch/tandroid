package androidx.biometric;

import a8.r7;
import android.content.Context;
import android.content.pm.PackageInfo;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.of;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class t {
    public Context a;

    public t(Context context, int i7) {
        switch (i7) {
            case 2:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public o5.j a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        o5.j jVar = new o5.j();
        jVar.a = q5.a.a(o5.m.a);
        e.a aVar = new e.a(context);
        jVar.b = aVar;
        jVar.c = q5.a.a(new ji.j(21, aVar, new of(aVar, 9)));
        e.a aVar2 = jVar.b;
        jVar.d = new of(aVar2, 26);
        fd.a a10 = q5.a.a(new sg.h0(6, jVar.d, q5.a.a(new hn(aVar2, 25))));
        jVar.e = a10;
        pb.b bVar = new pb.b(25);
        e.a aVar3 = jVar.b;
        md0 md0Var = new md0(aVar3, a10, bVar, 17);
        fd.a aVar4 = jVar.a;
        fd.a aVar5 = jVar.c;
        jVar.f = q5.a.a(new h6.m(new r7(aVar4, aVar5, md0Var, a10, a10, 21), new ga.d(aVar3, aVar5, a10, md0Var, aVar4, a10, a10, 5), new xi.e(aVar4, a10, md0Var, a10), false, 17));
        return jVar;
    }

    public PackageInfo b(int i7, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i7);
    }
}
