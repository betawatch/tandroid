package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ hw(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                ArrayList arrayList = yyVar.I2;
                if (yyVar.getParentActivity() != null) {
                    boolean z10 = !arrayList.isEmpty();
                    boolean z11 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z10 && longValue != yyVar.getUserConfig().getClientUserId()) {
                            z10 = false;
                        }
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z11 = false;
                        }
                        TLRPC.Chat chat = yyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z11 = false;
                        }
                    }
                    boolean z12 = yyVar.Y3() && yyVar.l3();
                    if (z12) {
                        ArrayList arrayList2 = yyVar.D2;
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
                    ArrayList arrayList3 = yyVar.D2;
                    boolean z13 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(yyVar, view);
                    H.l(R.drawable.msg_sendfile, LocaleController.getString(z13 ? R.string.SendAsFiles : R.string.SendAsFile), new uv(yyVar, 20), z12);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new uv(yyVar, 21), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(z10 ? R.string.SetReminder : R.string.ScheduleMessage), new org.telegram.ui.Components.zr0(7, yyVar, z10), z11);
                    H.Z();
                    break;
                }
                break;
            case 1:
                yy yyVar2 = this.b;
                yyVar2.p4(yyVar2.I2, 104, true, true, null);
                break;
            case 2:
                this.b.n4(view);
                break;
            default:
                yy yyVar3 = this.b;
                yyVar3.getContactsController().loadGlobalPrivacySetting();
                yyVar3.I4();
                break;
        }
        return true;
    }
}
