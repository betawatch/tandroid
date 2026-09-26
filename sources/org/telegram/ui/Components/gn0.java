package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gn0 implements View.OnClickListener {
    public final /* synthetic */ hn0 a;

    public gn0(hn0 hn0Var) {
        this.a = hn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        in0 in0Var = this.a.c;
        for (int i10 = 0; i10 < in0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) in0Var.e.get(i10);
            if (in0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(in0Var.d).updateFilesLoadingPriority();
            }
        }
        in0Var.d(true);
    }
}
