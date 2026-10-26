package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ao0 implements View.OnClickListener {
    public final /* synthetic */ bo0 a;

    public ao0(bo0 bo0Var) {
        this.a = bo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        co0 co0Var = this.a.c;
        for (int i10 = 0; i10 < co0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) co0Var.e.get(i10);
            if (co0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(co0Var.d).updateFilesLoadingPriority();
            }
        }
        co0Var.d(true);
    }
}
