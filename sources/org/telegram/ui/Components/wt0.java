package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wt0 extends il0 {
    public final Context c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final ut0 f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public ht0 r;
    public final /* synthetic */ qu0 s;

    public wt0(qu0 qu0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.s = qu0Var;
        this.c = context;
        this.d = i10;
        this.e = c6Var;
        this.f = new ut0(this, i10, c6Var);
        E();
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c3 = this.s.p1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c3.size(); i11++) {
            MessageObject messageObject = (MessageObject) c3.get(i11);
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

    @Override // f2.p0
    public final int h() {
        return this.n.size();
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            int i11 = n1Var.f;
            View view = n1Var.a;
            if (i11 == 0) {
                ((org.telegram.ui.Cells.s1) view).X3(messageObject, null, false, false, false, false);
            } else {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        if (i10 != 0) {
            return new vk0(new org.telegram.ui.Cells.v0(this.c, this.e, false));
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.e;
        vt0 vt0Var = new vt0(this.c, this.d, false, null, c6Var);
        vt0Var.setDelegate(this.f);
        return new vk0(vt0Var);
    }
}
