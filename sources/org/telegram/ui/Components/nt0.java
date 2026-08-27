package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nt0 extends yk0 {
    public final Context c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final lt0 f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public ys0 r;
    public final /* synthetic */ hu0 s;

    public nt0(hu0 hu0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.s = hu0Var;
        this.c = context;
        this.d = i10;
        this.e = c6Var;
        this.f = new lt0(this, i10, c6Var);
        E();
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c10 = this.s.p1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j10 * 1000);
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

    @Override // f2.q0
    public final int h() {
        return this.n.size();
    }

    @Override // f2.q0
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

    @Override // f2.q0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            int i11 = o1Var.f;
            View view = o1Var.a;
            if (i11 == 0) {
                ((org.telegram.ui.Cells.s1) view).W3(messageObject, null, false, false, false, false);
            } else {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        if (i10 != 0) {
            return new lk0(new org.telegram.ui.Cells.v0(this.c, this.e, false));
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.e;
        mt0 mt0Var = new mt0(this.c, this.d, false, null, c6Var);
        mt0Var.setDelegate(this.f);
        return new lk0(mt0Var);
    }
}
