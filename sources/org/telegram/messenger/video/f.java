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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.b3;
import org.telegram.ui.ca;
import org.telegram.ui.k60;
import org.telegram.ui.p40;
import org.telegram.ui.q40;
import org.telegram.ui.s40;
import org.telegram.ui.u30;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((oc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (f6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                break;
            default:
                k60 k60Var = (k60) obj7;
                uc0 uc0Var = (uc0) obj6;
                p40 p40Var = (p40) obj5;
                q40 q40Var = (q40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                u30 u30Var = k60Var.e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                k60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                k60Var.X0.addUpdateListener(new b3(k60Var, 14));
                k60Var.X0.addListener(new s40(k60Var));
                k60Var.X0.start();
                if (ChatObject.isChannelOrGiga(k60Var.Z0)) {
                    u30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    u30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = c5.g(null, null, 0L, 604800L, 3, uc0Var, p40Var, q40Var);
                calendar.setTimeInMillis((uc0Var.getValue() * 86400000) + System.currentTimeMillis());
                int i11 = 11;
                calendar.set(11, p40Var.getValue());
                calendar.set(12, q40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                k60Var.k2 = (int) (calendar.getTimeInMillis() / 1000);
                k60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = k60Var.k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ca(k60Var, chat, inputPeer, i11), 2);
                break;
        }
    }
}
