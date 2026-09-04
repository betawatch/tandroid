package androidx.activity;

import androidx.fragment.app.z;
import java.util.ListIterator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.j implements rd.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(x xVar, int i10) {
        super(0);
        this.b = i10;
        this.c = xVar;
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
                x xVar = this.c;
                z zVar2 = xVar.c;
                if (zVar2 == null) {
                    hd.e eVar = xVar.b;
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
                xVar.c = null;
                if (zVar2 != null) {
                    zVar2.a();
                }
                break;
            default:
                this.c.b();
                break;
        }
        return gd.i.a;
    }
}
