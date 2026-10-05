package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mn0 implements View.OnClickListener {
    public final /* synthetic */ nn0 a;

    public mn0(nn0 nn0Var) {
        this.a = nn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        on0 on0Var = this.a.c;
        for (int i10 = 0; i10 < on0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) on0Var.e.get(i10);
            if (on0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(on0Var.d).updateFilesLoadingPriority();
            }
        }
        on0Var.d(true);
    }
}
