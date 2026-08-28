package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m70 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ q70 n;

    public m70(q70 q70Var, Context context) {
        this.n = q70Var;
        this.c = context;
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f != 2;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            l();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new l70(this, str), 200L, 300L);
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (this.h) {
            return 0;
        }
        if (i9 == 0) {
            return 1;
        }
        return i9 == 1 ? 2 : 0;
    }

    @Override // f2.r0
    public final void l() {
        super.l();
        q70 q70Var = this.n;
        m70 m70Var = q70Var.s;
        if (m70Var == null || q70Var.A) {
            return;
        }
        q70Var.r.setVisibility(m70Var.h() == 2 ? 0 : 4);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (q1Var.f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) q1Var.a;
            boolean z10 = this.h;
            q70 q70Var = this.n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i9);
                charSequence = (CharSequence) this.e.get(i9);
            } else {
                contact = (ContactsController.Contact) q70Var.w.get(i9 - 2);
                charSequence = null;
            }
            p4Var.f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = q70Var.B.containsKey(contact.key);
            org.telegram.ui.Components.dp dpVar = p4Var.e;
            if (dpVar != null) {
                dpVar.a(containsKey, false);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        Context context = this.c;
        if (i9 == 1) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            int i10 = org.telegram.ui.ActionBar.f6.G6;
            p8Var.e(i10, i10);
            p8Var.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            view = p8Var;
        } else {
            view = i9 == 2 ? new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null) : new org.telegram.ui.Cells.p4(context, true);
        }
        return new org.telegram.ui.Components.ik0(view);
    }
}
