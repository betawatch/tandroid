package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ fw(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                wyVar.r4(wyVar.I2, 104, true, true, null);
                break;
            case 1:
                wy wyVar2 = this.b;
                ArrayList arrayList = wyVar2.I2;
                if (wyVar2.getParentActivity() != null) {
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat chat = wyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z10 = false;
                        }
                    }
                    org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(wyVar2, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new rv(wyVar2, 19), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new rv(wyVar2, 20), z10);
                    H.Z();
                    break;
                }
                break;
            case 2:
                this.b.p4(view);
                break;
            default:
                wy wyVar3 = this.b;
                wyVar3.getContactsController().loadGlobalPrivacySetting();
                wyVar3.K4();
                break;
        }
        return true;
    }
}
