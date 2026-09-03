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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ba;
import org.telegram.ui.d60;
import org.telegram.ui.e3;
import org.telegram.ui.j40;
import org.telegram.ui.k40;
import org.telegram.ui.m40;
import org.telegram.ui.o30;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((VideoAds) obj7).lambda$show$17((ic) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (g6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                break;
            default:
                d60 d60Var = (d60) obj7;
                yc0 yc0Var = (yc0) obj6;
                j40 j40Var = (j40) obj5;
                k40 k40Var = (k40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                o30 o30Var = d60Var.b1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                d60Var.U0 = ofFloat;
                ofFloat.setDuration(600L);
                d60Var.U0.addUpdateListener(new e3(d60Var, 15));
                d60Var.U0.addListener(new m40(d60Var));
                d60Var.U0.start();
                if (ChatObject.isChannelOrGiga(d60Var.W0)) {
                    o30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    o30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = z4.g(null, null, 0L, 604800L, 3, yc0Var, j40Var, k40Var);
                calendar.setTimeInMillis((yc0Var.getValue() * 86400000) + System.currentTimeMillis());
                int i11 = 11;
                calendar.set(11, j40Var.getValue());
                calendar.set(12, k40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                d60Var.h2 = (int) (calendar.getTimeInMillis() / 1000);
                d60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = d60Var.h2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ba(d60Var, chat, inputPeer, i11), 2);
                break;
        }
    }
}
