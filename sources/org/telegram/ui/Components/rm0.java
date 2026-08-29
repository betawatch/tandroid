package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rm0 implements View.OnClickListener {
    public final /* synthetic */ sm0 a;

    public rm0(sm0 sm0Var) {
        this.a = sm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tm0 tm0Var = this.a.c;
        for (int i10 = 0; i10 < tm0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) tm0Var.e.get(i10);
            if (tm0Var.D) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(tm0Var.d).updateFilesLoadingPriority();
            }
        }
        tm0Var.d(true);
    }
}
