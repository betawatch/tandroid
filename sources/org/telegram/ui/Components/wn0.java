package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wn0 implements View.OnClickListener {
    public final /* synthetic */ xn0 a;

    public wn0(xn0 xn0Var) {
        this.a = xn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yn0 yn0Var = this.a.c;
        for (int i10 = 0; i10 < yn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) yn0Var.e.get(i10);
            if (yn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(yn0Var.d).updateFilesLoadingPriority();
            }
        }
        yn0Var.d(true);
    }
}
