package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class hn0 implements View.OnClickListener {
    public final /* synthetic */ in0 a;

    public hn0(in0 in0Var) {
        this.a = in0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jn0 jn0Var = this.a.c;
        for (int i10 = 0; i10 < jn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) jn0Var.e.get(i10);
            if (jn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(jn0Var.d).updateFilesLoadingPriority();
            }
        }
        jn0Var.d(true);
    }
}
