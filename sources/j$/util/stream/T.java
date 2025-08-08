package j$.util.stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class T implements j$.util.function.G {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ T(int i, d2 d2Var) {
        this.a = i;
        this.b = d2Var;
    }

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // j$.util.function.G
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(i);
                break;
            default:
                ((V) this.b).a.accept(i);
                break;
        }
    }
}
