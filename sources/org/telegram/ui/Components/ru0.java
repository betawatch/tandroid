package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ru0 extends vl0 {
    public final Context c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final pu0 f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public cu0 r;
    public final /* synthetic */ kv0 s;

    public ru0(kv0 kv0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.s = kv0Var;
        this.c = context;
        this.d = i10;
        this.e = e6Var;
        this.f = new pu0(this, i10, e6Var);
        E();
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c10 = this.s.t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i12;
                tL_message.message = LocaleController.formatDateChat(j3);
                tL_message.id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j3 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                MessageObject messageObject2 = new MessageObject(this.d, tL_message, false, false);
                messageObject2.type = 10;
                messageObject2.contentType = 1;
                messageObject2.isDateObject = true;
                arrayList.add(messageObject2);
                i10 = messageObject.dateKeyInt;
            }
            arrayList.add(messageObject);
        }
    }

    @Override // s4.h0
    public final int h() {
        return this.n.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.n;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((MessageObject) arrayList.get(i10)).contentType;
    }

    @Override // s4.h0
    public final void l() {
        E();
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            int i11 = c1Var.f;
            View view = c1Var.a;
            if (i11 == 0) {
                ((org.telegram.ui.Cells.u1) view).X3(messageObject, null, false, false, false, false);
            } else {
                ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 != 0) {
            return new gl0(new org.telegram.ui.Cells.w0(this.c, this.e, false));
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.e;
        qu0 qu0Var = new qu0(this.c, this.d, false, null, e6Var);
        qu0Var.setDelegate(this.f);
        return new gl0(qu0Var);
    }
}
