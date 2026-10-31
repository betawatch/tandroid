package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l80 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ l80(ph.w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        Runnable runnable = this.b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
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
