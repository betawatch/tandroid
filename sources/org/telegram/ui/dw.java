package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ dw(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                uyVar.r4(uyVar.I2, 104, true, true, null);
                break;
            case 1:
                uy uyVar2 = this.b;
                ArrayList arrayList = uyVar2.I2;
                if (uyVar2.getParentActivity() != null) {
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat chat = uyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z10 = false;
                        }
                    }
                    org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(uyVar2, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new pv(uyVar2, 19), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new pv(uyVar2, 20), z10);
                    H.Z();
                    break;
                }
                break;
            case 2:
                this.b.p4(view);
                break;
            default:
                uy uyVar3 = this.b;
                uyVar3.getContactsController().loadGlobalPrivacySetting();
                uyVar3.K4();
                break;
        }
        return true;
    }
}
