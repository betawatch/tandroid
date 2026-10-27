package androidx.activity;

import androidx.fragment.app.z;
import java.util.ListIterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements ud.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ w c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(w wVar, int i10) {
        super(0);
        this.b = i10;
        this.c = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // ud.a
    public final Object invoke() {
        z zVar;
        switch (this.b) {
            case 0:
                this.c.b();
                break;
            case 1:
                w wVar = this.c;
                z zVar2 = wVar.c;
                if (zVar2 == null) {
                    kd.e eVar = wVar.b;
                    ListIterator listIterator = eVar.listIterator(eVar.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            zVar = listIterator.previous();
                            if (((z) zVar).a) {
                            }
                        } else {
                            zVar = 0;
                        }
                    }
                    zVar2 = zVar;
                }
                wVar.c = null;
                if (zVar2 != null) {
                    zVar2.a();
                }
                break;
            default:
                this.c.b();
                break;
        }
        return jd.i.a;
    }
}
