package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q30 b;

    public /* synthetic */ p30(q30 q30Var, int i7) {
        this.a = i7;
        this.b = q30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q30 q30Var = this.b;
                uv uvVar = q30Var.b;
                if (uvVar != null) {
                    uvVar.setVisibility(0);
                }
                org.telegram.messenger.g0.h3(new p30(q30Var, 2), 16L);
                break;
            case 1:
                uv uvVar2 = this.b.b;
                if (uvVar2 != null) {
                    uvVar2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
