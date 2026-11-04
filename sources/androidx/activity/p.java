package androidx.activity;

import androidx.fragment.app.a0;
import java.util.ListIterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.k implements od.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ v c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(v vVar, int i3) {
        super(0);
        this.b = i3;
        this.c = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // od.a
    public final Object invoke() {
        a0 a0Var;
        switch (this.b) {
            case 0:
                this.c.b();
                break;
            case 1:
                v vVar = this.c;
                a0 a0Var2 = vVar.c;
                if (a0Var2 == null) {
                    ed.e eVar = vVar.b;
                    ListIterator listIterator = eVar.listIterator(eVar.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            a0Var = listIterator.previous();
                            if (((a0) a0Var).a) {
                            }
                        } else {
                            a0Var = 0;
                        }
                    }
                    a0Var2 = a0Var;
                }
                vVar.c = null;
                if (a0Var2 != null) {
                    a0Var2.a();
                }
                break;
            default:
                this.c.b();
                break;
        }
        return dd.k.a;
    }
}
