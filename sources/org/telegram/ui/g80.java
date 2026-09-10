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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g80 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ k80 n;

    public g80(k80 k80Var, Context context) {
        this.n = k80Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 2;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            l();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new f80(this, str), 200L, 300L);
        }
    }

    @Override // s4.h0
    public final int h() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (this.h) {
            return 0;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 == 1 ? 2 : 0;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        k80 k80Var = this.n;
        g80 g80Var = k80Var.s;
        if (g80Var == null || k80Var.E) {
            return;
        }
        k80Var.r.setVisibility(g80Var.h() == 2 ? 0 : 4);
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) c1Var.a;
            boolean z10 = this.h;
            k80 k80Var = this.n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) k80Var.w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = k80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.tp tpVar = p4Var.e;
            if (tpVar != null) {
                tpVar.a(containsKey, false);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            s8Var.e(i11, i11);
            s8Var.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            view = s8Var;
        } else {
            view = i10 == 2 ? new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null) : new org.telegram.ui.Cells.p4(context, true);
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
