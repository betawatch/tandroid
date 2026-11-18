package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class w8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ w8(y8 y8Var, int[] iArr, int i7) {
        this.a = i7;
        this.b = y8Var;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q.add(Integer.valueOf(this.c[0]));
                break;
            default:
                this.b.q.remove(Integer.valueOf(this.c[0]));
                break;
        }
    }
}
