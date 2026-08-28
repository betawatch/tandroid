package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class em0 implements View.OnClickListener {
    public final /* synthetic */ fm0 a;

    public em0(fm0 fm0Var) {
        this.a = fm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gm0 gm0Var = this.a.c;
        for (int i9 = 0; i9 < gm0Var.e.size(); i9++) {
            MessageObject messageObject = (MessageObject) gm0Var.e.get(i9);
            if (gm0Var.D) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(gm0Var.d).updateFilesLoadingPriority();
            }
        }
        gm0Var.d(true);
    }
}
