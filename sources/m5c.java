// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m5c implements vma {
    public int a;
    public boolean b;
    public final /* synthetic */ n5c c;

    public m5c(n5c n5cVar) {
        this.c = n5cVar;
    }

    @Override // vma
    public final void L(int i, boolean z) {
        if (this.a == i && this.b == z) {
            return;
        }
        this.a = i;
        this.b = z;
        if (i > hl.L(20.0f)) {
            n5c n5cVar = this.c;
            if (n5cVar.h0) {
                return;
            }
            n5cVar.o0.r0 = false;
            n5cVar.h0 = true;
        }
    }
}
