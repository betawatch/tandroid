package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lb extends f2.r0 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final /* synthetic */ pb n;

    public lb(pb pbVar, Context context) {
        this.n = pbVar;
        new ArrayList();
        new ArrayList();
        this.c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        pb pbVar = this.n;
        ArrayList arrayList = pbVar.o0;
        if (arrayList.isEmpty()) {
            this.e = -1;
            this.f = -1;
            this.h = -1;
            return;
        }
        if (pbVar.q0) {
            this.e = -1;
        } else {
            int i9 = this.d;
            this.d = i9 + 1;
            this.e = i9;
        }
        int i10 = this.d;
        this.f = i10;
        int size = arrayList.size() + i10;
        this.d = size;
        this.h = size;
    }

    @Override // f2.r0
    public final int h() {
        return this.d;
    }

    @Override // f2.r0
    public final long i(int i9) {
        if (i9 < this.f || i9 >= this.h) {
            return i9 == this.e ? 2L : 5L;
        }
        ArrayList arrayList = this.n.o0;
        return ((MessageObject) arrayList.get((arrayList.size() - (i9 - this.f)) - 1)).stableId;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 < this.f || i9 >= this.h) {
            return 4;
        }
        return ((MessageObject) this.n.o0.get((r0.size() - (i9 - this.f)) - 1)).contentType;
    }

    @Override // f2.r0
    public final void l() {
        D(true);
        try {
            super.l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // f2.r0
    public final void m(int i9) {
        D(false);
        try {
            super.m(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // f2.r0
    public final void p(int i9, int i10) {
        D(false);
        try {
            super.p(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // f2.r0
    public final void q(int i9, int i10) {
        D(false);
        try {
            super.q(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // f2.r0
    public final void s(int i9, int i10) {
        D(false);
        try {
            super.s(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // f2.r0
    public final void t(int i9, int i10) {
        D(false);
        try {
            super.t(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r13 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Cells.t1 t1Var;
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
        View view = q1Var.a;
        pb pbVar = this.n;
        ArrayList arrayList = pbVar.o0;
        if (i9 == this.e) {
            ((org.telegram.ui.Cells.z0) view).setProgressVisible(true);
            return;
        }
        if (i9 < this.f || i9 >= this.h) {
            return;
        }
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - (i9 - this.f)) - 1);
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            if (view instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                w0Var.setMessageObject(messageObject);
                w0Var.setAlpha(1.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
        t1Var2.J7 = true;
        int i14 = i9 + 1;
        int j14 = j(i14);
        int j15 = j(i9 - 1);
        if (!(messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j14 == q1Var.f) {
            MessageObject messageObject2 = (MessageObject) arrayList.get((arrayList.size() - (i14 - this.f)) - 1);
            z10 = messageObject2.isOutOwner() == messageObject.isOutOwner() && messageObject2.getFromChatId() == messageObject.getFromChatId() && Math.abs(messageObject2.messageOwner.date - messageObject.messageOwner.date) <= 300;
            if (z10) {
                TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
                if (tL_forumTopic == null) {
                    i13 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                    j12 = MessageObject.getTopicId(i13, messageObject.messageOwner, true);
                } else {
                    j12 = tL_forumTopic.id;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = messageObject2.replyToForumTopic;
                if (tL_forumTopic2 == null) {
                    i12 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                    t1Var = t1Var2;
                    j13 = MessageObject.getTopicId(i12, messageObject2.messageOwner, true);
                } else {
                    t1Var = t1Var2;
                    j13 = tL_forumTopic2.id;
                }
            } else {
                t1Var = t1Var2;
            }
            if (j15 != q1Var.f) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(arrayList.size() - (i9 - this.f));
                boolean z13 = !(messageObject3.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject3.isOutOwner() == messageObject.isOutOwner() && messageObject3.getFromChatId() == messageObject.getFromChatId() && Math.abs(messageObject3.messageOwner.date - messageObject.messageOwner.date) <= 300;
                if (z13) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = messageObject.replyToForumTopic;
                    if (tL_forumTopic3 == null) {
                        i11 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                        z12 = true;
                        j10 = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
                    } else {
                        z12 = true;
                        j10 = tL_forumTopic3.id;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = messageObject3.replyToForumTopic;
                    if (tL_forumTopic4 == null) {
                        i10 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                        j11 = MessageObject.getTopicId(i10, messageObject3.messageOwner, z12);
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
            org.telegram.ui.Cells.t1 t1Var3 = t1Var;
            t1Var3.X3(messageObject, null, z10, z11, false, false);
            t1Var3.setHighlighted(false);
            t1Var3.S3(pbVar.v0);
        }
        t1Var = t1Var2;
        z10 = false;
        if (j15 != q1Var.f) {
        }
        org.telegram.ui.Cells.t1 t1Var32 = t1Var;
        t1Var32.X3(messageObject, null, z10, z11, false, false);
        t1Var32.setHighlighted(false);
        t1Var32.S3(pbVar.v0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.telegram.ui.Cells.w0] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        ViewGroup viewGroup2;
        int i10;
        ViewGroup viewGroup3;
        pb pbVar = this.n;
        ArrayList arrayList = pbVar.v;
        Context context = this.c;
        if (i9 == 0) {
            if (arrayList.isEmpty()) {
                i10 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                viewGroup3 = new org.telegram.ui.Cells.t1(context, i10);
            } else {
                ?? r52 = (View) arrayList.get(0);
                arrayList.remove(0);
                viewGroup3 = r52;
            }
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) viewGroup3;
            t1Var.setDelegate(new gb(this));
            t1Var.setAllowAssistant(true);
            viewGroup2 = viewGroup3;
        } else if (i9 == 1) {
            ?? hbVar = new hb(context);
            hbVar.setDelegate(new jb(this));
            viewGroup2 = hbVar;
        } else if (i9 == 2) {
            viewGroup2 = new org.telegram.ui.Cells.v1(context, null);
        } else if (i9 == 10) {
            b6Var = ((org.telegram.ui.ActionBar.o2) pbVar).resourceProvider;
            ?? u1Var = new org.telegram.ui.Cells.u1(context, b6Var);
            u1Var.setDelegate(new g(this, 10));
            viewGroup2 = u1Var;
        } else {
            viewGroup2 = new org.telegram.ui.Cells.z0(context, null);
        }
        return j3.r0.s(viewGroup2, viewGroup2, -1, -2);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        View view = q1Var.a;
        if ((view instanceof org.telegram.ui.Cells.t1) || (view instanceof org.telegram.ui.Cells.w0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new kb(this, view, q1Var));
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            t1Var.setBackgroundDrawable(null);
            t1Var.K3(true, false);
            t1Var.setHighlighted(false);
        }
    }
}
