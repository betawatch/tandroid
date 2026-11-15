package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j70 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ j70(bi.h6 h6Var, int i7) {
        this.a = i7;
        this.b = h6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        Runnable runnable = this.b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
