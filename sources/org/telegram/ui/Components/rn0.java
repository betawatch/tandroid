package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class rn0 implements View.OnClickListener {
    public final /* synthetic */ sn0 a;

    public rn0(sn0 sn0Var) {
        this.a = sn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tn0 tn0Var = this.a.c;
        for (int i10 = 0; i10 < tn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) tn0Var.e.get(i10);
            if (tn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(tn0Var.d).updateFilesLoadingPriority();
            }
        }
        tn0Var.d(true);
    }
}
