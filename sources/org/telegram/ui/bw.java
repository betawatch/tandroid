package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ bw(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                qyVar.r4(qyVar.F2, 104, true, true, null);
                break;
            case 1:
                qy qyVar2 = this.b;
                ArrayList arrayList = qyVar2.F2;
                if (qyVar2.getParentActivity() != null) {
                    boolean z4 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z4 = false;
                        }
                        TLRPC.Chat chat = qyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z4 = false;
                        }
                    }
                    org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(qyVar2, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ov(qyVar2, 19), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new ov(qyVar2, 20), z4);
                    H.Z();
                    break;
                }
                break;
            case 2:
                this.b.p4(view);
                break;
            default:
                qy qyVar3 = this.b;
                qyVar3.getContactsController().loadGlobalPrivacySetting();
                qyVar3.K4();
                break;
        }
        return true;
    }
}
