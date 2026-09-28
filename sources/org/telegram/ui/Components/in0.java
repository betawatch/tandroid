package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class in0 implements View.OnClickListener {
    public final /* synthetic */ jn0 a;

    public in0(jn0 jn0Var) {
        this.a = jn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kn0 kn0Var = this.a.c;
        for (int i10 = 0; i10 < kn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) kn0Var.e.get(i10);
            if (kn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(kn0Var.d).updateFilesLoadingPriority();
            }
        }
        kn0Var.d(true);
    }
}
