package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class um0 implements View.OnClickListener {
    public final /* synthetic */ vm0 a;

    public um0(vm0 vm0Var) {
        this.a = vm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wm0 wm0Var = this.a.c;
        for (int i10 = 0; i10 < wm0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) wm0Var.e.get(i10);
            if (wm0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(wm0Var.d).updateFilesLoadingPriority();
            }
        }
        wm0Var.d(true);
    }
}
