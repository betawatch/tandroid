package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Wallet.j2;
import org.telegram.ui.Wallet.o4;
import org.telegram.ui.a40;
import org.telegram.ui.b3;
import org.telegram.ui.c40;
import org.telegram.ui.e30;
import org.telegram.ui.ea;
import org.telegram.ui.v50;
import org.telegram.ui.z30;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ f(fi.d dVar, o4 o4Var, Utilities.Callback3 callback3, String[] strArr, boolean[] zArr, j2[] j2VarArr, u6 u6Var) {
        this.a = 2;
        this.b = dVar;
        this.c = o4Var;
        this.d = callback3;
        this.e = strArr;
        this.h = zArr;
        this.n = j2VarArr;
        this.f = u6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        Object obj = this.f;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (u6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                break;
            case 1:
                v50 v50Var = (v50) obj7;
                md0 md0Var = (md0) obj6;
                z30 z30Var = (z30) obj5;
                a40 a40Var = (a40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                AccountInstance accountInstance = (AccountInstance) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                e30 e30Var = v50Var.e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                v50Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                v50Var.X0.addUpdateListener(new b3(v50Var, 13));
                v50Var.X0.addListener(new c40(v50Var));
                v50Var.X0.start();
                if (ChatObject.isChannelOrGiga(v50Var.Z0)) {
                    e30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    e30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g7 = g5.g(null, null, 0L, 604800L, 3, md0Var, z30Var, a40Var);
                calendar.setTimeInMillis((md0Var.getValue() * 86400000) + System.currentTimeMillis());
                int i11 = 11;
                calendar.set(11, z30Var.getValue());
                calendar.set(12, a40Var.getValue());
                if (g7) {
                    calendar.set(13, 0);
                }
                v50Var.k2 = (int) (calendar.getTimeInMillis() / 1000);
                v50Var.M1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = v50Var.k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ea(v50Var, chat, inputPeer, i11), 2);
                break;
            default:
                fi.d dVar = (fi.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                j2[] j2VarArr = (j2[]) obj2;
                u6 u6Var = (u6) obj;
                if (!dVar.Q) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        AndroidUtilities.shakeViewSpring(editTextBoldCursor);
                        break;
                    } else {
                        dVar.setLoading(true);
                        callback3.run(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.o(dVar, j2VarArr, u6Var, 5));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
    }
}
