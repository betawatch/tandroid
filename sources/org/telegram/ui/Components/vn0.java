package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class vn0 implements View.OnClickListener {
    public final /* synthetic */ wn0 a;

    public vn0(wn0 wn0Var) {
        this.a = wn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xn0 xn0Var = this.a.c;
        for (int i10 = 0; i10 < xn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) xn0Var.e.get(i10);
            if (xn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(xn0Var.d).updateFilesLoadingPriority();
            }
        }
        xn0Var.d(true);
    }
}
