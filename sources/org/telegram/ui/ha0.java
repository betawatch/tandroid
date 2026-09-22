package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ ha0(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ma0(0, launchActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new kw(26, launchActivity, tLObject));
                break;
        }
    }
}
