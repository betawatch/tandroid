package androidx.activity;

import androidx.fragment.app.a0;
import java.util.ListIterator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        a0 a0Var;
        switch (this.b) {
            case 0:
                this.c.b();
                break;
            case 1:
                w wVar = this.c;
                a0 a0Var2 = wVar.c;
                if (a0Var2 == null) {
                    hd.d dVar = wVar.b;
                    ListIterator listIterator = dVar.listIterator(dVar.size());
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
                wVar.c = null;
                if (a0Var2 != null) {
                    a0Var2.a();
                }
                break;
            default:
                this.c.b();
                break;
        }
        return gd.k.a;
    }
}
