package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ a90(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new f70(6, launchActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new f70(2, launchActivity, tLObject));
                break;
        }
    }
}
