// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
