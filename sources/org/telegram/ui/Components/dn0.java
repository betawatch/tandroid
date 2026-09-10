package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dn0 implements View.OnClickListener {
    public final /* synthetic */ en0 a;

    public dn0(en0 en0Var) {
        this.a = en0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fn0 fn0Var = this.a.c;
        for (int i10 = 0; i10 < fn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) fn0Var.e.get(i10);
            if (fn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(fn0Var.d).updateFilesLoadingPriority();
            }
        }
        fn0Var.d(true);
    }
}
