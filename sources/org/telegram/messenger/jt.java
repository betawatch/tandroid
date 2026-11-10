package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class jt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v10 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ jt(v10 v10Var, Exception exc, int i7) {
        this.a = i7;
        this.b = v10Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(null, this.c.getMessage());
                break;
            default:
                this.b.a(null, this.c.getMessage());
                break;
        }
    }
}
