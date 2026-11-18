package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e0(r0 r0Var, int i7, int i10) {
        this.a = i10;
        this.b = r0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                if (r0Var.b.getSwipeBack() != null) {
                    r0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                r0 r0Var2 = this.b;
                if (r0Var2.b.getSwipeBack() != null) {
                    r0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}
