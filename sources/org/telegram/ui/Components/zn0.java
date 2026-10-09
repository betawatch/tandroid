package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zn0 implements View.OnClickListener {
    public final /* synthetic */ ao0 a;

    public zn0(ao0 ao0Var) {
        this.a = ao0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bo0 bo0Var = this.a.c;
        for (int i10 = 0; i10 < bo0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) bo0Var.e.get(i10);
            if (bo0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(bo0Var.d).updateFilesLoadingPriority();
            }
        }
        bo0Var.d(true);
    }
}
