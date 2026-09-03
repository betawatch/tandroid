package c2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.emoji2.text.p b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.a = i11;
        this.b = pVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b0 b0Var = ((e) ((af.d) this.b.f).d).d;
                if (b0Var != null) {
                    b0Var.j(this.c);
                    break;
                }
                break;
            default:
                b0 b0Var2 = ((e) ((af.d) this.b.f).d).d;
                if (b0Var2 != null) {
                    b0Var2.k(this.c);
                    break;
                }
                break;
        }
    }
}
