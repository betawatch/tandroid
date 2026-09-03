package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ aw(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                py pyVar = this.b;
                pyVar.r4(pyVar.F2, 104, true, true, null);
                break;
            case 1:
                py pyVar2 = this.b;
                ArrayList arrayList = pyVar2.F2;
                if (pyVar2.getParentActivity() != null) {
                    boolean z4 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z4 = false;
                        }
                        TLRPC.Chat chat = pyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z4 = false;
                        }
                    }
                    org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(pyVar2, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new nv(pyVar2, 19), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new nv(pyVar2, 20), z4);
                    H.Z();
                    break;
                }
                break;
            case 2:
                this.b.p4(view);
                break;
            default:
                py pyVar3 = this.b;
                pyVar3.getContactsController().loadGlobalPrivacySetting();
                pyVar3.K4();
                break;
        }
        return true;
    }
}
