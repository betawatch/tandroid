package ai;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ pf.c c;
    public final /* synthetic */ ug.m1 d;

    public /* synthetic */ b4(k7 k7Var, pf.c cVar, ug.m1 m1Var, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = cVar;
        this.d = m1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k7.o0(this.b, this.c, this.d, (String) obj);
                break;
            default:
                k7.a0(this.b, this.c, this.d, (String) obj);
                break;
        }
    }
}
