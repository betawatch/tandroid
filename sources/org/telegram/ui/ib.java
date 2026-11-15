package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ib extends v4.h0 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final /* synthetic */ lb n;

    public ib(lb lbVar, Context context) {
        this.n = lbVar;
        new ArrayList();
        new ArrayList();
        this.c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        lb lbVar = this.n;
        ArrayList arrayList = lbVar.p0;
        if (arrayList.isEmpty()) {
            this.e = -1;
            this.f = -1;
            this.h = -1;
            return;
        }
        if (lbVar.r0) {
            this.e = -1;
        } else {
            int i7 = this.d;
            this.d = i7 + 1;
            this.e = i7;
        }
        int i10 = this.d;
        this.f = i10;
        int size = arrayList.size() + i10;
        this.d = size;
        this.h = size;
    }

    @Override // v4.h0
    public final int b() {
        return this.d;
    }

    @Override // v4.h0
    public final long c(int i7) {
        if (i7 < this.f || i7 >= this.h) {
            return i7 == this.e ? 2L : 5L;
        }
        ArrayList arrayList = this.n.p0;
        return ((org.telegram.messenger.gj) arrayList.get((arrayList.size() - (i7 - this.f)) - 1)).m1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 < this.f || i7 >= this.h) {
            return 4;
        }
        return ((org.telegram.messenger.gj) this.n.p0.get((r0.size() - (i7 - this.f)) - 1)).U;
    }

    @Override // v4.h0
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // v4.h0
    public final void g(int i7) {
        D(false);
        try {
            super.g(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // v4.h0
    public final void j(int i7, int i10) {
        D(false);
        try {
            super.j(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // v4.h0
    public final void k(int i7, int i10) {
        D(false);
        try {
            super.k(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // v4.h0
    public final void o(int i7, int i10) {
        D(false);
        try {
            super.o(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // v4.h0
    public final void p(int i7, int i10) {
        D(false);
        try {
            super.p(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r13 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.ui.Cells.q1 q1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        long j3;
        long j10;
        int i10;
        int i11;
        long j11;
        long j12;
        int i12;
        int i13;
        View view = e1Var.a;
        lb lbVar = this.n;
        ArrayList arrayList = lbVar.p0;
        if (i7 == this.e) {
            ((org.telegram.ui.Cells.w0) view).setProgressVisible(true);
            return;
        }
        if (i7 < this.f || i7 >= this.h) {
            return;
        }
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get((arrayList.size() - (i7 - this.f)) - 1);
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            if (view instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                t0Var.setMessageObject(gjVar);
                t0Var.setAlpha(1.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
        q1Var2.f6 = true;
        int i14 = i7 + 1;
        int d = d(i14);
        int d2 = d(i7 - 1);
        if (!(gjVar.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == e1Var.f) {
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get((arrayList.size() - (i14 - this.f)) - 1);
            z10 = gjVar2.P3() == gjVar.P3() && gjVar2.Z0() == gjVar.Z0() && Math.abs(gjVar2.k.date - gjVar.k.date) <= 300;
            if (z10) {
                TLRPC.TL_forumTopic tL_forumTopic = gjVar.j1;
                if (tL_forumTopic == null) {
                    i13 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                    j11 = org.telegram.messenger.gj.b2(i13, gjVar.k, true, false);
                } else {
                    j11 = tL_forumTopic.id;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = gjVar2.j1;
                if (tL_forumTopic2 == null) {
                    i12 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                    q1Var = q1Var2;
                    j12 = org.telegram.messenger.gj.b2(i12, gjVar2.k, true, false);
                } else {
                    q1Var = q1Var2;
                    j12 = tL_forumTopic2.id;
                }
            } else {
                q1Var = q1Var2;
            }
            if (d2 != e1Var.f) {
                org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(arrayList.size() - (i7 - this.f));
                boolean z13 = !(gjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && gjVar3.P3() == gjVar.P3() && gjVar3.Z0() == gjVar.Z0() && Math.abs(gjVar3.k.date - gjVar.k.date) <= 300;
                if (z13) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = gjVar.j1;
                    if (tL_forumTopic3 == null) {
                        i11 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                        z12 = true;
                        j3 = org.telegram.messenger.gj.b2(i11, gjVar.k, true, false);
                    } else {
                        z12 = true;
                        j3 = tL_forumTopic3.id;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = gjVar3.j1;
                    if (tL_forumTopic4 == null) {
                        i10 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                        j10 = org.telegram.messenger.gj.b2(i10, gjVar3.k, z12, false);
                    } else {
                        j10 = tL_forumTopic4.id;
                    }
                    if (j3 != j10) {
                        z13 = false;
                    }
                }
                z11 = z13;
            } else {
                z11 = false;
            }
            org.telegram.ui.Cells.q1 q1Var3 = q1Var;
            q1Var3.x3(gjVar, null, z10, z11, false, false);
            q1Var3.setHighlighted(false);
            q1Var3.t3(lbVar.w0);
        }
        q1Var = q1Var2;
        z10 = false;
        if (d2 != e1Var.f) {
        }
        org.telegram.ui.Cells.q1 q1Var32 = q1Var;
        q1Var32.x3(gjVar, null, z10, z11, false, false);
        q1Var32.setHighlighted(false);
        q1Var32.t3(lbVar.w0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Cells.y1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.telegram.ui.Cells.t0] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.e6 e6Var;
        ViewGroup viewGroup2;
        int i10;
        ViewGroup viewGroup3;
        lb lbVar = this.n;
        ArrayList arrayList = lbVar.h;
        Context context = this.c;
        if (i7 == 0) {
            if (arrayList.isEmpty()) {
                i10 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                viewGroup3 = new org.telegram.ui.Cells.q1(context, i10);
            } else {
                ?? r52 = (View) arrayList.get(0);
                arrayList.remove(0);
                viewGroup3 = r52;
            }
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) viewGroup3;
            q1Var.setDelegate(new db(this));
            q1Var.setAllowAssistant(true);
            viewGroup2 = viewGroup3;
        } else if (i7 == 1) {
            ?? ebVar = new eb(context);
            ebVar.setDelegate(new gb(this));
            viewGroup2 = ebVar;
        } else if (i7 == 2) {
            viewGroup2 = new org.telegram.ui.Cells.z1(context, null);
        } else if (i7 == 10) {
            e6Var = ((org.telegram.ui.ActionBar.e2) lbVar).resourceProvider;
            ?? y1Var = new org.telegram.ui.Cells.y1(context, e6Var);
            y1Var.setDelegate(new f(this, 8));
            viewGroup2 = y1Var;
        } else {
            viewGroup2 = new org.telegram.ui.Cells.w0(context, null);
        }
        return i5.c.q(viewGroup2, viewGroup2, -1, -2);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        View view = e1Var.a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.t0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new hb(this, view, e1Var));
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            q1Var.setBackgroundDrawable(null);
            q1Var.l3(true, false);
            q1Var.setHighlighted(false);
        }
    }
}
