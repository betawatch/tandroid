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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o70 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ s70 n;

    public o70(s70 s70Var, Context context) {
        this.n = s70Var;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.n4) {
            ((org.telegram.ui.Cells.n4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f != 2;
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
            timer2.schedule(new n70(this, str), 200L, 300L);
        }
    }

    @Override // f2.p0
    public final int h() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (this.h) {
            return 0;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 == 1 ? 2 : 0;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        s70 s70Var = this.n;
        o70 o70Var = s70Var.s;
        if (o70Var == null || s70Var.A) {
            return;
        }
        s70Var.r.setVisibility(o70Var.h() == 2 ? 0 : 4);
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (n1Var.f == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) n1Var.a;
            boolean z10 = this.h;
            s70 s70Var = this.n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) s70Var.w.get(i10 - 2);
                charSequence = null;
            }
            n4Var.f = contact;
            n4Var.h = charSequence;
            n4Var.a();
            boolean containsKey = s70Var.B.containsKey(contact.key);
            org.telegram.ui.Components.hp hpVar = n4Var.e;
            if (hpVar != null) {
                hpVar.a(containsKey, false);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            m8Var.e(i11, i11);
            m8Var.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            view = m8Var;
        } else {
            view = i10 == 2 ? new org.telegram.ui.Cells.x6(context, (b) null) : new org.telegram.ui.Cells.n4(context, true);
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
