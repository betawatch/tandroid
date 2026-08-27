package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hm0 implements View.OnClickListener {
    public final /* synthetic */ im0 a;

    public hm0(im0 im0Var) {
        this.a = im0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jm0 jm0Var = this.a.c;
        for (int i10 = 0; i10 < jm0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) jm0Var.e.get(i10);
            if (jm0Var.D) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(jm0Var.d).updateFilesLoadingPriority();
            }
        }
        jm0Var.d(true);
    }
}
