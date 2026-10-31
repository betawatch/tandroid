package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pb extends s4.g0 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final /* synthetic */ sb n;

    public pb(sb sbVar, Context context) {
        this.n = sbVar;
        new ArrayList();
        new ArrayList();
        this.c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        sb sbVar = this.n;
        ArrayList arrayList = sbVar.o0;
        if (arrayList.isEmpty()) {
            this.e = -1;
            this.f = -1;
            this.h = -1;
            return;
        }
        if (sbVar.q0) {
            this.e = -1;
        } else {
            int i10 = this.d;
            this.d = i10 + 1;
            this.e = i10;
        }
        int i11 = this.d;
        this.f = i11;
        int size = arrayList.size() + i11;
        this.d = size;
        this.h = size;
    }

    @Override // s4.g0
    public final int b() {
        return this.d;
    }

    @Override // s4.g0
    public final long c(int i10) {
        if (i10 < this.f || i10 >= this.h) {
            return i10 == this.e ? 2L : 5L;
        }
        ArrayList arrayList = this.n.o0;
        return ((org.telegram.messenger.jj) arrayList.get((arrayList.size() - (i10 - this.f)) - 1)).k1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 < this.f || i10 >= this.h) {
            return 4;
        }
        return ((org.telegram.messenger.jj) this.n.o0.get((r0.size() - (i10 - this.f)) - 1)).U;
    }

    @Override // s4.g0
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // s4.g0
    public final void g(int i10) {
        D(false);
        try {
            super.g(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // s4.g0
    public final void j(int i10, int i11) {
        D(false);
        try {
            super.j(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // s4.g0
    public final void k(int i10, int i11) {
        D(false);
        try {
            super.k(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // s4.g0
    public final void o(int i10, int i11) {
        D(false);
        try {
            super.o(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // s4.g0
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r13 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.q1 q1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        long j11;
        int i11;
        int i12;
        long j12;
        long j13;
        int i13;
        int i14;
        View view = c1Var.a;
        sb sbVar = this.n;
        ArrayList arrayList = sbVar.o0;
        if (i10 == this.e) {
            ((org.telegram.ui.Cells.v0) view).setProgressVisible(true);
            return;
        }
        if (i10 < this.f || i10 >= this.h) {
            return;
        }
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get((arrayList.size() - (i10 - this.f)) - 1);
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            if (view instanceof org.telegram.ui.Cells.s0) {
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
                s0Var.setMessageObject(jjVar);
                s0Var.setAlpha(1.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
        q1Var2.d6 = true;
        int i15 = i10 + 1;
        int d = d(i15);
        int d10 = d(i10 - 1);
        if (!(jjVar.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == c1Var.f) {
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get((arrayList.size() - (i15 - this.f)) - 1);
            z10 = jjVar2.P3() == jjVar.P3() && jjVar2.Z0() == jjVar.Z0() && Math.abs(jjVar2.k.date - jjVar.k.date) <= 300;
            if (z10) {
                TLRPC.TL_forumTopic tL_forumTopic = jjVar.h1;
                if (tL_forumTopic == null) {
                    i14 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                    j12 = org.telegram.messenger.jj.c2(i14, jjVar.k, true, false);
                } else {
                    j12 = tL_forumTopic.id;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = jjVar2.h1;
                if (tL_forumTopic2 == null) {
                    i13 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                    q1Var = q1Var2;
                    j13 = org.telegram.messenger.jj.c2(i13, jjVar2.k, true, false);
                } else {
                    q1Var = q1Var2;
                    j13 = tL_forumTopic2.id;
                }
            } else {
                q1Var = q1Var2;
            }
            if (d10 != c1Var.f) {
                org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList.get(arrayList.size() - (i10 - this.f));
                boolean z13 = !(jjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && jjVar3.P3() == jjVar.P3() && jjVar3.Z0() == jjVar.Z0() && Math.abs(jjVar3.k.date - jjVar.k.date) <= 300;
                if (z13) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = jjVar.h1;
                    if (tL_forumTopic3 == null) {
                        i12 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                        z12 = true;
                        j10 = org.telegram.messenger.jj.c2(i12, jjVar.k, true, false);
                    } else {
                        z12 = true;
                        j10 = tL_forumTopic3.id;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = jjVar3.h1;
                    if (tL_forumTopic4 == null) {
                        i11 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                        j11 = org.telegram.messenger.jj.c2(i11, jjVar3.k, z12, false);
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
            q1Var3.s3(jjVar, null, z10, z11, false, false);
            q1Var3.setHighlighted(false);
            q1Var3.o3(sbVar.v0);
        }
        q1Var = q1Var2;
        z10 = false;
        if (d10 != c1Var.f) {
        }
        org.telegram.ui.Cells.q1 q1Var32 = q1Var;
        q1Var32.s3(jjVar, null, z10, z11, false, false);
        q1Var32.setHighlighted(false);
        q1Var32.o3(sbVar.v0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Cells.y1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.telegram.ui.Cells.s0] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        ViewGroup viewGroup2;
        int i11;
        ViewGroup viewGroup3;
        sb sbVar = this.n;
        ArrayList arrayList = sbVar.h;
        Context context = this.c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                viewGroup3 = new org.telegram.ui.Cells.q1(context, i11);
            } else {
                ?? r52 = (View) arrayList.get(0);
                arrayList.remove(0);
                viewGroup3 = r52;
            }
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) viewGroup3;
            q1Var.setDelegate(new jb(this));
            q1Var.setAllowAssistant(true);
            viewGroup2 = viewGroup3;
        } else if (i10 == 1) {
            ?? kbVar = new kb(context);
            kbVar.setDelegate(new nb(this));
            viewGroup2 = kbVar;
        } else if (i10 == 2) {
            viewGroup2 = new org.telegram.ui.Cells.z1(context, null);
        } else if (i10 == 10) {
            p6Var = ((org.telegram.ui.ActionBar.k2) sbVar).resourceProvider;
            ?? y1Var = new org.telegram.ui.Cells.y1(context, p6Var);
            y1Var.setDelegate(new e(this, 8));
            viewGroup2 = y1Var;
        } else {
            viewGroup2 = new org.telegram.ui.Cells.v0(context, null);
        }
        return sc.e.o(viewGroup2, viewGroup2, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.s0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new ob(this, view, c1Var));
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            q1Var.setBackgroundDrawable(null);
            q1Var.g3(true, false);
            q1Var.setHighlighted(false);
        }
    }
}
