package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lt0 extends vk0 {
    public final Context c;
    public final int d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final jt0 f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public ws0 r;
    public final /* synthetic */ eu0 s;

    public lt0(eu0 eu0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.s = eu0Var;
        this.c = context;
        this.d = i9;
        this.e = b6Var;
        this.f = new jt0(this, i9, b6Var);
        E();
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c10 = this.s.p1[8].c();
        int i9 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            MessageObject messageObject = (MessageObject) c10.get(i10);
            if (messageObject.dateKeyInt != i9) {
                int i11 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i11;
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
                i9 = messageObject.dateKeyInt;
            }
            arrayList.add(messageObject);
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.n.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 < 0) {
            return 0;
        }
        ArrayList arrayList = this.n;
        if (i9 >= arrayList.size()) {
            return 0;
        }
        return ((MessageObject) arrayList.get(i9)).contentType;
    }

    @Override // f2.r0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.n;
            if (i9 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i9);
            int i10 = q1Var.f;
            View view = q1Var.a;
            if (i10 == 0) {
                ((org.telegram.ui.Cells.t1) view).X3(messageObject, null, false, false, false, false);
            } else {
                ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        if (i9 != 0) {
            return new ik0(new org.telegram.ui.Cells.w0(this.c, this.e, false));
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.e;
        kt0 kt0Var = new kt0(this.c, this.d, false, null, b6Var);
        kt0Var.setDelegate(this.f);
        return new ik0(kt0Var);
    }
}
