package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class tm0 implements View.OnClickListener {
    public final /* synthetic */ um0 a;

    public tm0(um0 um0Var) {
        this.a = um0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vm0 vm0Var = this.a.c;
        for (int i10 = 0; i10 < vm0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) vm0Var.e.get(i10);
            if (vm0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(vm0Var.d).updateFilesLoadingPriority();
            }
        }
        vm0Var.d(true);
    }
}
