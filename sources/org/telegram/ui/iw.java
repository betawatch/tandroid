package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ iw(yy yyVar, int i10) {
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
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat chat = yyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z10 = false;
                        }
                    }
                    org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(yyVar, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new uv(yyVar, 20), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new uv(yyVar, 21), z10);
                    H.Z();
                    break;
                }
                break;
            case 1:
                yy yyVar2 = this.b;
                yyVar2.o4(yyVar2.I2, 104, true, true, null);
                break;
            case 2:
                this.b.m4(view);
                break;
            default:
                yy yyVar3 = this.b;
                yyVar3.getContactsController().loadGlobalPrivacySetting();
                yyVar3.H4();
                break;
        }
        return true;
    }
}
