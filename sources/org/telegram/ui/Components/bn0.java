package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bn0 implements View.OnClickListener {
    public final /* synthetic */ cn0 a;

    public bn0(cn0 cn0Var) {
        this.a = cn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dn0 dn0Var = this.a.c;
        for (int i10 = 0; i10 < dn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) dn0Var.e.get(i10);
            if (dn0Var.E) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(dn0Var.d).updateFilesLoadingPriority();
            }
        }
        dn0Var.d(true);
    }
}
