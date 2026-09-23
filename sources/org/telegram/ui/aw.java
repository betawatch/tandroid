package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ aw(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                ry ryVar = this.b;
                ryVar.r4(ryVar.I2, 104, true, true, null);
                break;
            case 1:
                ry ryVar2 = this.b;
                ArrayList arrayList = ryVar2.I2;
                if (ryVar2.getParentActivity() != null) {
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat chat = ryVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z10 = false;
                        }
                    }
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(ryVar2, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new mv(ryVar2, 19), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new mv(ryVar2, 20), z10);
                    H.Z();
                    break;
                }
                break;
            case 2:
                this.b.p4(view);
                break;
            default:
                ry ryVar3 = this.b;
                ryVar3.getContactsController().loadGlobalPrivacySetting();
                ryVar3.K4();
                break;
        }
        return true;
    }
}
