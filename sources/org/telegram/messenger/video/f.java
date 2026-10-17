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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Wallet.k2;
import org.telegram.ui.Wallet.o4;
import org.telegram.ui.b30;
import org.telegram.ui.e3;
import org.telegram.ui.ea;
import org.telegram.ui.s50;
import org.telegram.ui.w30;
import org.telegram.ui.x30;
import org.telegram.ui.z30;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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

    public /* synthetic */ f(ei.d dVar, o4 o4Var, Utilities.Callback3 callback3, String[] strArr, boolean[] zArr, k2[] k2VarArr, d6 d6Var) {
        this.a = 2;
        this.b = dVar;
        this.c = o4Var;
        this.d = callback3;
        this.e = strArr;
        this.h = zArr;
        this.n = k2VarArr;
        this.f = d6Var;
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
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (d6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                break;
            case 1:
                s50 s50Var = (s50) obj7;
                od0 od0Var = (od0) obj6;
                w30 w30Var = (w30) obj5;
                x30 x30Var = (x30) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                AccountInstance accountInstance = (AccountInstance) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                b30 b30Var = s50Var.e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                s50Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                s50Var.X0.addUpdateListener(new e3(s50Var, 15));
                s50Var.X0.addListener(new z30(s50Var));
                s50Var.X0.start();
                if (ChatObject.isChannelOrGiga(s50Var.Z0)) {
                    b30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    b30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean f7 = f5.f(null, null, 0L, 604800L, 3, od0Var, w30Var, x30Var);
                calendar.setTimeInMillis((od0Var.getValue() * 86400000) + System.currentTimeMillis());
                int i11 = 11;
                calendar.set(11, w30Var.getValue());
                calendar.set(12, x30Var.getValue());
                if (f7) {
                    calendar.set(13, 0);
                }
                s50Var.k2 = (int) (calendar.getTimeInMillis() / 1000);
                s50Var.M1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = s50Var.k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ea(s50Var, chat, inputPeer, i11), 2);
                break;
            default:
                ei.d dVar = (ei.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                k2[] k2VarArr = (k2[]) obj2;
                d6 d6Var = (d6) obj;
                if (!dVar.N) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        AndroidUtilities.shakeViewSpring(editTextBoldCursor);
                        break;
                    } else {
                        dVar.setLoading(true);
                        callback3.run(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.p(dVar, k2VarArr, d6Var, 5));
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
