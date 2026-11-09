package androidx.activity;

import androidx.fragment.app.z;
import java.util.ListIterator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.k implements rd.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ w c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(w wVar, int i7) {
        super(0);
        this.b = i7;
        this.c = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // rd.a
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
                    hd.d dVar = wVar.b;
                    ListIterator listIterator = dVar.listIterator(dVar.size());
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
        return gd.k.a;
    }
}
