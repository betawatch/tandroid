package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v01 b;
    public final /* synthetic */ u01 c;

    public /* synthetic */ s01(v01 v01Var, u01 u01Var, int i10) {
        this.a = i10;
        this.b = v01Var;
        this.c = u01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
