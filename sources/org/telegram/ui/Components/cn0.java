package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cn0 implements View.OnClickListener {
    public final /* synthetic */ dn0 a;

    public cn0(dn0 dn0Var) {
        this.a = dn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        en0 en0Var = this.a.c;
        for (int i10 = 0; i10 < en0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) en0Var.e.get(i10);
            if (en0Var.E) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(en0Var.d).updateFilesLoadingPriority();
            }
        }
        en0Var.d(true);
    }
}
