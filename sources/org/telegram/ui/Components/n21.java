package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.q10 b;
    public final /* synthetic */ String c;

    public /* synthetic */ n21(String str, int i7, org.telegram.messenger.q10 q10Var) {
        this.a = i7;
        this.b = q10Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.q10 q10Var = this.b;
                if (q10Var != null) {
                    q10Var.a(this.c, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                this.b.a(null, this.c);
                break;
            case 2:
                this.b.a(null, this.c);
                break;
            default:
                this.b.a(null, this.c);
                break;
        }
    }
}
