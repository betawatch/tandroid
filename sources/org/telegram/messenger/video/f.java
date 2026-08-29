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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.b30;
import org.telegram.ui.g3;
import org.telegram.ui.r50;
import org.telegram.ui.w30;
import org.telegram.ui.x30;
import org.telegram.ui.x9;
import org.telegram.ui.z30;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                ((VideoAds) obj7).lambda$show$17((mc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (c6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                break;
            default:
                r50 r50Var = (r50) obj7;
                qc0 qc0Var = (qc0) obj6;
                w30 w30Var = (w30) obj5;
                x30 x30Var = (x30) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                b30 b30Var = r50Var.a1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r50Var.T0 = ofFloat;
                ofFloat.setDuration(600L);
                r50Var.T0.addUpdateListener(new g3(r50Var, 15));
                r50Var.T0.addListener(new z30(r50Var));
                r50Var.T0.start();
                if (ChatObject.isChannelOrGiga(r50Var.V0)) {
                    b30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    b30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = c5.g(null, null, 0L, 604800L, 3, qc0Var, w30Var, x30Var);
                calendar.setTimeInMillis((qc0Var.getValue() * 86400000) + System.currentTimeMillis());
                int i11 = 11;
                calendar.set(11, w30Var.getValue());
                calendar.set(12, x30Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                r50Var.g2 = (int) (calendar.getTimeInMillis() / 1000);
                r50Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = r50Var.g2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new x9(r50Var, chat, inputPeer, i11), 2);
                break;
        }
    }
}
