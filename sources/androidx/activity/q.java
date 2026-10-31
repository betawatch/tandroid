package androidx.activity;

import androidx.fragment.app.a0;
import java.util.ListIterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.j implements ld.a {
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
    @Override // ld.a
    public final Object invoke() {
        a0 a0Var;
        switch (this.b) {
            case 0:
                this.c.b();
                break;
            case 1:
                x xVar = this.c;
                a0 a0Var2 = xVar.c;
                if (a0Var2 == null) {
                    bd.g gVar = xVar.b;
                    ListIterator listIterator = gVar.listIterator(gVar.size());
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
                xVar.c = null;
                if (a0Var2 != null) {
                    a0Var2.a();
                }
                break;
            default:
                this.c.b();
                break;
        }
        return ad.j.a;
    }
}
