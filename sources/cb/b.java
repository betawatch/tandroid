package cb;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements y8.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i9) {
        this.a = i9;
    }

    @Override // y8.d
    public final Object H1(b3.b bVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(bVar.x(bb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) bVar.a(Context.class), (bb.a) arrayList.get(0));
            default:
                return new a((e) bVar.a(e.class), (ya.d) bVar.a(ya.d.class));
        }
    }
}
