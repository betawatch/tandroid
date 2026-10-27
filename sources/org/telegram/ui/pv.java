package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ pv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                ArrayList arrayList = eyVar.I2;
                if (eyVar.getParentActivity() != null) {
                    boolean z10 = !arrayList.isEmpty();
                    boolean z11 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z10 && longValue != eyVar.getUserConfig().getClientUserId()) {
                            z10 = false;
                        }
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z11 = false;
                        }
                        TLRPC.Chat chat = eyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z11 = false;
                        }
                    }
                    boolean z12 = eyVar.i4() && eyVar.u3();
                    if (z12) {
                        ArrayList arrayList2 = eyVar.D2;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj = arrayList2.get(i11);
                                i11++;
                                if (((MediaController.PhotoEntry) obj).hasVideoEditsLostAsDocument()) {
                                    z12 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = eyVar.D2;
                    boolean z13 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(eyVar, view);
                    H.l(R.drawable.msg_sendfile, LocaleController.getString(z13 ? R.string.SendAsFiles : R.string.SendAsFile), new ev(eyVar, 19), z12);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ev(eyVar, 20), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(z10 ? R.string.SetReminder : R.string.ScheduleMessage), new org.telegram.ui.Components.d60(10, eyVar, z10), z11);
                    H.Z();
                    break;
                }
                break;
            case 1:
                ey eyVar2 = this.b;
                eyVar2.z4(eyVar2.I2, 104, true, true, null);
                break;
            case 2:
                this.b.x4(view);
                break;
            default:
                ey eyVar3 = this.b;
                eyVar3.getContactsController().loadGlobalPrivacySetting();
                eyVar3.S4();
                break;
        }
        return true;
    }
}
