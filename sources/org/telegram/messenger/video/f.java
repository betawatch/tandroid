package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.l20;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Wallet.e5;
import org.telegram.ui.Wallet.z2;
import org.telegram.ui.a3;
import org.telegram.ui.aa;
import org.telegram.ui.b50;
import org.telegram.ui.l30;
import org.telegram.ui.m30;
import org.telegram.ui.o30;
import org.telegram.ui.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        Object obj = this.f;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((wb) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (p6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                break;
            case 1:
                b50 b50Var = (b50) obj7;
                ac0 ac0Var = (ac0) obj6;
                l30 l30Var = (l30) obj5;
                m30 m30Var = (m30) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                q20 q20Var = b50Var.V2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                b50Var.O2 = ofFloat;
                ofFloat.setDuration(600L);
                b50Var.O2.addUpdateListener(new a3(b50Var, 12));
                b50Var.O2.addListener(new o30(b50Var));
                b50Var.O2.start();
                if (w3.W(b50Var.Q2)) {
                    q20Var.b(cd.L0(2131743473, null), true);
                } else {
                    q20Var.b(cd.L0(2131743332, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = s4.g(null, null, 0L, 604800L, 3, ac0Var, l30Var, m30Var);
                calendar.setTimeInMillis((ac0Var.getValue() * 86400000) + System.currentTimeMillis());
                int i11 = 11;
                calendar.set(11, l30Var.getValue());
                calendar.set(12, m30Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                b50Var.b4 = (int) (calendar.getTimeInMillis() / 1000);
                b50Var.O1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = vp.k1(chat);
                creategroupcall.random_id = Utilities.b.nextInt();
                creategroupcall.schedule_date = b50Var.b4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(cVar.a).sendRequest(creategroupcall, new aa(b50Var, chat, inputPeer, i11), 2);
                break;
            default:
                vh.d dVar = (vh.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                l20 l20Var = (l20) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                z2[] z2VarArr = (z2[]) obj2;
                p6 p6Var = (p6) obj;
                if (!dVar.Q) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        i0.G3(editTextBoldCursor);
                        break;
                    } else {
                        dVar.setLoading(true);
                        l20Var.a(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.m(dVar, z2VarArr, p6Var, 5));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f(vh.d dVar, e5 e5Var, l20 l20Var, String[] strArr, boolean[] zArr, z2[] z2VarArr, p6 p6Var) {
        this.a = 2;
        this.b = dVar;
        this.c = e5Var;
        this.d = l20Var;
        this.e = strArr;
        this.h = zArr;
        this.n = z2VarArr;
        this.f = p6Var;
    }
}
