package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hb extends u4.h0 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final /* synthetic */ kb n;

    public hb(kb kbVar, Context context) {
        this.n = kbVar;
        new ArrayList();
        new ArrayList();
        this.c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        kb kbVar = this.n;
        ArrayList arrayList = kbVar.p0;
        if (arrayList.isEmpty()) {
            this.e = -1;
            this.f = -1;
            this.h = -1;
            return;
        }
        if (kbVar.r0) {
            this.e = -1;
        } else {
            int i3 = this.d;
            this.d = i3 + 1;
            this.e = i3;
        }
        int i10 = this.d;
        this.f = i10;
        int size = arrayList.size() + i10;
        this.d = size;
        this.h = size;
    }

    @Override // u4.h0
    public final int b() {
        return this.d;
    }

    @Override // u4.h0
    public final long c(int i3) {
        if (i3 < this.f || i3 >= this.h) {
            return i3 == this.e ? 2L : 5L;
        }
        ArrayList arrayList = this.n.p0;
        return ((org.telegram.messenger.zi) arrayList.get((arrayList.size() - (i3 - this.f)) - 1)).k1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 < this.f || i3 >= this.h) {
            return 4;
        }
        return ((org.telegram.messenger.zi) this.n.p0.get((r0.size() - (i3 - this.f)) - 1)).U;
    }

    @Override // u4.h0
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // u4.h0
    public final void g(int i3) {
        D(false);
        try {
            super.g(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // u4.h0
    public final void j(int i3, int i10) {
        D(false);
        try {
            super.j(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // u4.h0
    public final void k(int i3, int i10) {
        D(false);
        try {
            super.k(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // u4.h0
    public final void o(int i3, int i10) {
        D(false);
        try {
            super.o(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // u4.h0
    public final void p(int i3, int i10) {
        D(false);
        try {
            super.p(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r13 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.ui.Cells.q1 q1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        long j11;
        int i10;
        int i11;
        long j12;
        long j13;
        int i12;
        int i13;
        View view = d1Var.a;
        kb kbVar = this.n;
        ArrayList arrayList = kbVar.p0;
        if (i3 == this.e) {
            ((org.telegram.ui.Cells.w0) view).setProgressVisible(true);
            return;
        }
        if (i3 < this.f || i3 >= this.h) {
            return;
        }
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get((arrayList.size() - (i3 - this.f)) - 1);
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            if (view instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                t0Var.setMessageObject(ziVar);
                t0Var.setAlpha(1.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
        q1Var2.e6 = true;
        int i14 = i3 + 1;
        int d = d(i14);
        int d10 = d(i3 - 1);
        if (!(ziVar.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == d1Var.f) {
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get((arrayList.size() - (i14 - this.f)) - 1);
            z10 = ziVar2.Q3() == ziVar.Q3() && ziVar2.Z0() == ziVar.Z0() && Math.abs(ziVar2.k.date - ziVar.k.date) <= 300;
            if (z10) {
                TLRPC.TL_forumTopic tL_forumTopic = ziVar.h1;
                if (tL_forumTopic == null) {
                    i13 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                    j12 = org.telegram.messenger.zi.c2(i13, ziVar.k, true, false);
                } else {
                    j12 = tL_forumTopic.id;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = ziVar2.h1;
                if (tL_forumTopic2 == null) {
                    i12 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                    q1Var = q1Var2;
                    j13 = org.telegram.messenger.zi.c2(i12, ziVar2.k, true, false);
                } else {
                    q1Var = q1Var2;
                    j13 = tL_forumTopic2.id;
                }
            } else {
                q1Var = q1Var2;
            }
            if (d10 != d1Var.f) {
                org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(arrayList.size() - (i3 - this.f));
                boolean z13 = !(ziVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && ziVar3.Q3() == ziVar.Q3() && ziVar3.Z0() == ziVar.Z0() && Math.abs(ziVar3.k.date - ziVar.k.date) <= 300;
                if (z13) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = ziVar.h1;
                    if (tL_forumTopic3 == null) {
                        i11 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                        z12 = true;
                        j10 = org.telegram.messenger.zi.c2(i11, ziVar.k, true, false);
                    } else {
                        z12 = true;
                        j10 = tL_forumTopic3.id;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = ziVar3.h1;
                    if (tL_forumTopic4 == null) {
                        i10 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                        j11 = org.telegram.messenger.zi.c2(i10, ziVar3.k, z12, false);
                    } else {
                        j11 = tL_forumTopic4.id;
                    }
                    if (j10 != j11) {
                        z13 = false;
                    }
                }
                z11 = z13;
            } else {
                z11 = false;
            }
            org.telegram.ui.Cells.q1 q1Var3 = q1Var;
            q1Var3.u3(ziVar, null, z10, z11, false, false);
            q1Var3.setHighlighted(false);
            q1Var3.q3(kbVar.w0);
        }
        q1Var = q1Var2;
        z10 = false;
        if (d10 != d1Var.f) {
        }
        org.telegram.ui.Cells.q1 q1Var32 = q1Var;
        q1Var32.u3(ziVar, null, z10, z11, false, false);
        q1Var32.setHighlighted(false);
        q1Var32.q3(kbVar.w0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Cells.y1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.telegram.ui.Cells.t0] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.ActionBar.e6 e6Var;
        ViewGroup viewGroup2;
        int i10;
        ViewGroup viewGroup3;
        kb kbVar = this.n;
        ArrayList arrayList = kbVar.h;
        Context context = this.c;
        if (i3 == 0) {
            if (arrayList.isEmpty()) {
                i10 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                viewGroup3 = new org.telegram.ui.Cells.q1(context, i10);
            } else {
                ?? r5 = (View) arrayList.get(0);
                arrayList.remove(0);
                viewGroup3 = r5;
            }
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) viewGroup3;
            q1Var.setDelegate(new cb(this));
            q1Var.setAllowAssistant(true);
            viewGroup2 = viewGroup3;
        } else if (i3 == 1) {
            ?? dbVar = new db(context);
            dbVar.setDelegate(new fb(this));
            viewGroup2 = dbVar;
        } else if (i3 == 2) {
            viewGroup2 = new org.telegram.ui.Cells.z1(context, null);
        } else if (i3 == 10) {
            e6Var = ((org.telegram.ui.ActionBar.d2) kbVar).resourceProvider;
            ?? y1Var = new org.telegram.ui.Cells.y1(context, e6Var);
            y1Var.setDelegate(new f(this, 8));
            viewGroup2 = y1Var;
        } else {
            viewGroup2 = new org.telegram.ui.Cells.w0(context, null);
        }
        return k2.p1.p(viewGroup2, viewGroup2, -1, -2);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        View view = d1Var.a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.t0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new gb(this, view, d1Var));
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            q1Var.setBackgroundDrawable(null);
            q1Var.i3(true, false);
            q1Var.setHighlighted(false);
        }
    }
}
