package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bo0 implements View.OnClickListener {
    public final /* synthetic */ co0 a;

    public bo0(co0 co0Var) {
        this.a = co0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        do0 do0Var = this.a.c;
        for (int i10 = 0; i10 < do0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) do0Var.e.get(i10);
            if (do0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(do0Var.d).updateFilesLoadingPriority();
            }
        }
        do0Var.d(true);
    }
}
