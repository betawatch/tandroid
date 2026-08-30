package org.telegram.messenger.voip;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.e6;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ o(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 0:
                VoIPGroupNotification.lambda$decline$3(i11, tLObject, tL_error);
                break;
            case 1:
                VoIPPreNotificationService.lambda$decline$4(i11, tLObject, tL_error);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new n5(i11, tLObject));
                break;
            case 3:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.TL_updates) tLObject, false);
                    break;
                }
                break;
            case 4:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new n5(i11, tLObject, 2));
                break;
            case 5:
                Pattern pattern2 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new n5(i11, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new e6(i11, 11));
                break;
        }
    }
}
