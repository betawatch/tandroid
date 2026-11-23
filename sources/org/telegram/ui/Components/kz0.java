package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz0 b;
    public final /* synthetic */ lz0 c;

    public /* synthetic */ kz0(mz0 mz0Var, lz0 lz0Var, int i7) {
        this.a = i7;
        this.b = mz0Var;
        this.c = lz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
