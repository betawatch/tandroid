package androidx.activity;

import androidx.fragment.app.b0;
import java.util.ListIterator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements rd.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ v c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(v vVar, int i10) {
        super(0);
        this.b = i10;
        this.c = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // rd.a
    public final Object invoke() {
        b0 b0Var;
        switch (this.b) {
            case 0:
                this.c.b();
                break;
            case 1:
                v vVar = this.c;
                b0 b0Var2 = vVar.c;
                if (b0Var2 == null) {
                    hd.e eVar = vVar.b;
                    ListIterator listIterator = eVar.listIterator(eVar.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            b0Var = listIterator.previous();
                            if (((b0) b0Var).a) {
                            }
                        } else {
                            b0Var = 0;
                        }
                    }
                    b0Var2 = b0Var;
                }
                vVar.c = null;
                if (b0Var2 != null) {
                    b0Var2.a();
                }
                break;
            default:
                this.c.b();
                break;
        }
        return gd.i.a;
    }
}
