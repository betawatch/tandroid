package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;
    public final /* synthetic */ int c;

    public /* synthetic */ nm(on onVar, int i10, int i11) {
        this.a = i11;
        this.b = onVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, null);
                break;
            case 1:
                this.b.b0(this.c);
                break;
            default:
                this.b.e0(this.c, null);
                break;
        }
    }
}
