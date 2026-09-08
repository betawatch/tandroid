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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h80 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ l80 n;

    public h80(l80 l80Var, Context context) {
        this.n = l80Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 2;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            l();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new g80(this, str), 200L, 300L);
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
        l80 l80Var = this.n;
        h80 h80Var = l80Var.s;
        if (h80Var == null || l80Var.E) {
            return;
        }
        l80Var.r.setVisibility(h80Var.h() == 2 ? 0 : 4);
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) c1Var.a;
            boolean z10 = this.h;
            l80 l80Var = this.n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) l80Var.w.get(i10 - 2);
                charSequence = null;
            }
            o4Var.f = contact;
            o4Var.h = charSequence;
            o4Var.a();
            boolean containsKey = l80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.mp mpVar = o4Var.e;
            if (mpVar != null) {
                mpVar.a(containsKey, false);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            r8Var.e(i11, i11);
            r8Var.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            view = r8Var;
        } else {
            view = i10 == 2 ? new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null) : new org.telegram.ui.Cells.o4(context, true);
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
