package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m90 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ m90(LaunchActivity launchActivity, int i9) {
        this.a = i9;
        this.b = launchActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new x20(12, launchActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new x20(8, launchActivity, tLObject));
                break;
        }
    }
}
