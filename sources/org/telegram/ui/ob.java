package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ob extends f2.o0 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final /* synthetic */ sb n;

    public ob(sb sbVar, Context context) {
        this.n = sbVar;
        new ArrayList();
        new ArrayList();
        this.c = context;
        C(true);
    }

    public final void D(boolean z4) {
        this.d = 0;
        sb sbVar = this.n;
        ArrayList arrayList = sbVar.p0;
        if (arrayList.isEmpty()) {
            this.e = -1;
            this.f = -1;
            this.h = -1;
            return;
        }
        if (sbVar.r0) {
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

    @Override // f2.o0
    public final int h() {
        return this.d;
    }

    @Override // f2.o0
    public final long i(int i10) {
        if (i10 < this.f || i10 >= this.h) {
            return i10 == this.e ? 2L : 5L;
        }
        ArrayList arrayList = this.n.p0;
        return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f)) - 1)).stableId;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 < this.f || i10 >= this.h) {
            return 4;
        }
        return ((MessageObject) this.n.p0.get((r0.size() - (i10 - this.f)) - 1)).contentType;
    }

    @Override // f2.o0
    public final void l() {
        D(true);
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // f2.o0
    public final void m(int i10) {
        D(false);
        try {
            super.m(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // f2.o0
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // f2.o0
    public final void q(int i10, int i11) {
        D(false);
        try {
            super.q(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // f2.o0
    public final void s(int i10, int i11) {
        D(false);
        try {
            super.s(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // f2.o0
    public final void t(int i10, int i11) {
        D(false);
        try {
            super.t(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r13 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Cells.t1 t1Var;
        boolean z4;
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        int i11;
        int i12;
        long j12;
        long j13;
        int i13;
        int i14;
        View view = l1Var.a;
        sb sbVar = this.n;
        ArrayList arrayList = sbVar.p0;
        if (i10 == this.e) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(true);
            return;
        }
        if (i10 < this.f || i10 >= this.h) {
            return;
        }
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - (i10 - this.f)) - 1);
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                v0Var.setMessageObject(messageObject);
                v0Var.setAlpha(1.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
        t1Var2.K7 = true;
        int i15 = i10 + 1;
        int j14 = j(i15);
        int j15 = j(i10 - 1);
        if (!(messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j14 == l1Var.f) {
            MessageObject messageObject2 = (MessageObject) arrayList.get((arrayList.size() - (i15 - this.f)) - 1);
            z4 = messageObject2.isOutOwner() == messageObject.isOutOwner() && messageObject2.getFromChatId() == messageObject.getFromChatId() && Math.abs(messageObject2.messageOwner.date - messageObject.messageOwner.date) <= 300;
            if (z4) {
                TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
                if (tL_forumTopic == null) {
                    i14 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
                    j12 = MessageObject.getTopicId(i14, messageObject.messageOwner, true);
                } else {
                    j12 = tL_forumTopic.id;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = messageObject2.replyToForumTopic;
                if (tL_forumTopic2 == null) {
                    i13 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
                    t1Var = t1Var2;
                    j13 = MessageObject.getTopicId(i13, messageObject2.messageOwner, true);
                } else {
                    t1Var = t1Var2;
                    j13 = tL_forumTopic2.id;
                }
            } else {
                t1Var = t1Var2;
            }
            if (j15 != l1Var.f) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(arrayList.size() - (i10 - this.f));
                boolean z12 = !(messageObject3.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject3.isOutOwner() == messageObject.isOutOwner() && messageObject3.getFromChatId() == messageObject.getFromChatId() && Math.abs(messageObject3.messageOwner.date - messageObject.messageOwner.date) <= 300;
                if (z12) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = messageObject.replyToForumTopic;
                    if (tL_forumTopic3 == null) {
                        i12 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
                        z11 = true;
                        j10 = MessageObject.getTopicId(i12, messageObject.messageOwner, true);
                    } else {
                        z11 = true;
                        j10 = tL_forumTopic3.id;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = messageObject3.replyToForumTopic;
                    if (tL_forumTopic4 == null) {
                        i11 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
                        j11 = MessageObject.getTopicId(i11, messageObject3.messageOwner, z11);
                    } else {
                        j11 = tL_forumTopic4.id;
                    }
                    if (j10 != j11) {
                        z12 = false;
                    }
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.t1 t1Var3 = t1Var;
            t1Var3.X3(messageObject, null, z4, z10, false, false);
            t1Var3.setHighlighted(false);
            t1Var3.S3(sbVar.w0);
        }
        t1Var = t1Var2;
        z4 = false;
        if (j15 != l1Var.f) {
        }
        org.telegram.ui.Cells.t1 t1Var32 = t1Var;
        t1Var32.X3(messageObject, null, z4, z10, false, false);
        t1Var32.setHighlighted(false);
        t1Var32.S3(sbVar.w0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.telegram.ui.Cells.v0] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        ViewGroup viewGroup2;
        int i11;
        ViewGroup viewGroup3;
        sb sbVar = this.n;
        ArrayList arrayList = sbVar.v;
        Context context = this.c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
                viewGroup3 = new org.telegram.ui.Cells.t1(context, i11);
            } else {
                ?? r52 = (View) arrayList.get(0);
                arrayList.remove(0);
                viewGroup3 = r52;
            }
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) viewGroup3;
            t1Var.setDelegate(new jb(this));
            t1Var.setAllowAssistant(true);
            viewGroup2 = viewGroup3;
        } else if (i10 == 1) {
            ?? kbVar = new kb(context);
            kbVar.setDelegate(new mb(this));
            viewGroup2 = kbVar;
        } else if (i10 == 2) {
            viewGroup2 = new org.telegram.ui.Cells.v1(context, null);
        } else if (i10 == 10) {
            f6Var = ((org.telegram.ui.ActionBar.p2) sbVar).resourceProvider;
            ?? u1Var = new org.telegram.ui.Cells.u1(context, f6Var);
            u1Var.setDelegate(new h(this, 10));
            viewGroup2 = u1Var;
        } else {
            viewGroup2 = new org.telegram.ui.Cells.y0(context, null);
        }
        return yh.o(viewGroup2, viewGroup2, -1, -2);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        View view = l1Var.a;
        if ((view instanceof org.telegram.ui.Cells.t1) || (view instanceof org.telegram.ui.Cells.v0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new nb(this, view, l1Var));
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
