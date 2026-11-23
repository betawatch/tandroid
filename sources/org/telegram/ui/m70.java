package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m70 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ m70(bi.q8 q8Var, int i7) {
        this.a = i7;
        this.b = q8Var;
    }

    @Override // org.telegram.messenger.y10
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
