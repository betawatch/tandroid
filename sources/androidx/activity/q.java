package androidx.activity;

import androidx.fragment.app.a0;
import java.util.ListIterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.j implements zc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(x xVar, int i9) {
        super(0);
        this.b = i9;
        this.c = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // zc.a
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
                    pc.e eVar = xVar.b;
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
                xVar.c = null;
                if (a0Var2 != null) {
                    a0Var2.a();
                }
                break;
            default:
                this.c.b();
                break;
        }
        return oc.i.a;
    }
}
