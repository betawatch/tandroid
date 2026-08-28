package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.y4;
import org.telegram.ui.f3;
import org.telegram.ui.o50;
import org.telegram.ui.t30;
import org.telegram.ui.u30;
import org.telegram.ui.w30;
import org.telegram.ui.y20;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9 = this.a;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i9) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((gc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (b6) obj3, (VideoAds.AdLayout) obj2, (f) obj, view);
                break;
            default:
                o50 o50Var = (o50) obj7;
                bc0 bc0Var = (bc0) obj6;
                t30 t30Var = (t30) obj5;
                u30 u30Var = (u30) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                y20 y20Var = o50Var.a1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                o50Var.T0 = ofFloat;
                ofFloat.setDuration(600L);
                o50Var.T0.addUpdateListener(new f3(o50Var, 15));
                o50Var.T0.addListener(new w30(o50Var));
                o50Var.T0.start();
                if (ChatObject.isChannelOrGiga(o50Var.V0)) {
                    y20Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    y20Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = y4.g(null, null, 0L, 604800L, 3, bc0Var, t30Var, u30Var);
                calendar.setTimeInMillis((bc0Var.getValue() * 86400000) + System.currentTimeMillis());
                int i10 = 11;
                calendar.set(11, t30Var.getValue());
                calendar.set(12, u30Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                o50Var.g2 = (int) (calendar.getTimeInMillis() / 1000);
                o50Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = o50Var.g2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new y9(o50Var, chat, inputPeer, i10), 2);
                break;
        }
    }
}
