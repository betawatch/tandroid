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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class p70 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ t70 n;

    public p70(t70 t70Var, Context context) {
        this.n = t70Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f != 2;
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
            timer2.schedule(new o70(this, str), 200L, 300L);
        }
    }

    @Override // s4.g0
    public final int h() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (this.h) {
            return 0;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 == 1 ? 2 : 0;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        t70 t70Var = this.n;
        p70 p70Var = t70Var.s;
        if (p70Var == null || t70Var.E) {
            return;
        }
        t70Var.r.setVisibility(p70Var.h() == 2 ? 0 : 4);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (b1Var.f == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) b1Var.a;
            boolean z10 = this.h;
            t70 t70Var = this.n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) t70Var.w.get(i10 - 2);
                charSequence = null;
            }
            o4Var.f = contact;
            o4Var.h = charSequence;
            o4Var.a();
            boolean containsKey = t70Var.F.containsKey(contact.key);
            org.telegram.ui.Components.xp xpVar = o4Var.e;
            if (xpVar != null) {
                xpVar.a(containsKey, false);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            q8Var.e(i11, i11);
            q8Var.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            view = q8Var;
        } else {
            view = i10 == 2 ? new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null) : new org.telegram.ui.Cells.o4(context, true);
        }
        return new org.telegram.ui.Components.sl0(view);
    }
}
