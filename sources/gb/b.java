package gb;

import android.content.Context;
import b6.m;
import c5.j;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements c9.e {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // c9.e
    public final Object e0(j jVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(jVar.w(fb.a.class));
                m.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) jVar.a(Context.class), (fb.a) arrayList.get(0));
            default:
                return new a((e) jVar.a(e.class), (cb.d) jVar.a(cb.d.class));
        }
    }
}
