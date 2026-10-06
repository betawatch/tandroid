package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ cw(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                ArrayList arrayList = uyVar.I2;
                if (uyVar.getParentActivity() != null) {
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat chat = uyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z10 = false;
                        }
                    }
                    org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(uyVar, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new pv(uyVar, 17), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new pv(uyVar, 18), z10);
                    H.Z();
                    break;
                }
                break;
            case 1:
                uy uyVar2 = this.b;
                uyVar2.A4(uyVar2.I2, 104, true, true, null);
                break;
            case 2:
                this.b.y4(view);
                break;
            default:
                uy uyVar3 = this.b;
                uyVar3.getContactsController().loadGlobalPrivacySetting();
                uyVar3.T4();
                break;
        }
        return true;
    }
}
