package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ cw(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                ty tyVar = this.b;
                ArrayList arrayList = tyVar.I2;
                if (tyVar.getParentActivity() != null) {
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat chat = tyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z10 = false;
                        }
                    }
                    org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(tyVar, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ov(tyVar, 20), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new ov(tyVar, 21), z10);
                    H.Z();
                    break;
                }
                break;
            case 1:
                ty tyVar2 = this.b;
                tyVar2.o4(tyVar2.I2, 104, true, true, null);
                break;
            case 2:
                this.b.m4(view);
                break;
            default:
                ty tyVar3 = this.b;
                tyVar3.getContactsController().loadGlobalPrivacySetting();
                tyVar3.H4();
                break;
        }
        return true;
    }
}
