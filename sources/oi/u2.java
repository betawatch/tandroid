package oi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;
    public final /* synthetic */ v4.m0 c;

    public /* synthetic */ u2(q3 q3Var, v4.m0 m0Var, int i7) {
        this.a = i7;
        this.b = q3Var;
        this.c = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.setItemAnimator(this.c);
                break;
            case 1:
                this.b.setItemAnimator(this.c);
                break;
            default:
                this.b.setItemAnimator(this.c);
                break;
        }
    }
}
