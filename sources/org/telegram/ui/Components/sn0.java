package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class sn0 implements View.OnClickListener {
    public final /* synthetic */ tn0 a;

    public sn0(tn0 tn0Var) {
        this.a = tn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        un0 un0Var = this.a.c;
        for (int i10 = 0; i10 < un0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) un0Var.e.get(i10);
            if (un0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(un0Var.d).updateFilesLoadingPriority();
            }
        }
        un0Var.d(true);
    }
}
