package gb;

import android.content.Context;
import b6.m;
import c5.j;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements c9.e {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // c9.e
    public final Object f0(j jVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(jVar.x(fb.a.class));
                m.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) jVar.a(Context.class), (fb.a) arrayList.get(0));
            default:
                return new a((e) jVar.a(e.class), (cb.d) jVar.a(cb.d.class));
        }
    }
}
