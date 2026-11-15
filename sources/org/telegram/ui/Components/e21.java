package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.s10 b;
    public final /* synthetic */ String c;

    public /* synthetic */ e21(String str, int i7, org.telegram.messenger.s10 s10Var) {
        this.a = i7;
        this.b = s10Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.s10 s10Var = this.b;
                if (s10Var != null) {
                    s10Var.a(this.c, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                this.b.a(null, this.c);
                break;
            default:
                this.b.a(null, this.c);
                break;
        }
    }
}
