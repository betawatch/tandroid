package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ ov(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                ArrayList arrayList = cyVar.I2;
                if (cyVar.getParentActivity() != null) {
                    boolean z10 = !arrayList.isEmpty();
                    boolean z11 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z10 && longValue != cyVar.getUserConfig().getClientUserId()) {
                            z10 = false;
                        }
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z11 = false;
                        }
                        TLRPC.Chat chat = cyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z11 = false;
                        }
                    }
                    boolean z12 = cyVar.Y3() && cyVar.l3();
                    if (z12) {
                        ArrayList arrayList2 = cyVar.D2;
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
                    ArrayList arrayList3 = cyVar.D2;
                    boolean z13 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(cyVar, view);
                    H.l(R.drawable.msg_sendfile, LocaleController.getString(z13 ? R.string.SendAsFiles : R.string.SendAsFile), new cv(cyVar, 20), z12);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new cv(cyVar, 21), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(z10 ? R.string.SetReminder : R.string.ScheduleMessage), new org.telegram.ui.Components.b60(10, cyVar, z10), z11);
                    H.Z();
                    break;
                }
                break;
            case 1:
                cy cyVar2 = this.b;
                cyVar2.p4(cyVar2.I2, 104, true, true, null);
                break;
            case 2:
                this.b.n4(view);
                break;
            default:
                cy cyVar3 = this.b;
                cyVar3.getContactsController().loadGlobalPrivacySetting();
                cyVar3.I4();
                break;
        }
        return true;
    }
}
