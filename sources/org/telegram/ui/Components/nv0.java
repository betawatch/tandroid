package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public class nv0 extends kv0 {
    public boolean E;
    public final /* synthetic */ qv0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ai.d9 s;
    public final int v;
    public final lv0 w;
    public boolean x;
    public final ArrayList y;

    public nv0(qv0 qv0Var, Context context, boolean z10) {
        this(qv0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.kv0, org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.kv0, org.telegram.ui.Components.gl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.kv0, org.telegram.ui.Components.gl0
    public final void I() {
        this.F.c1(this.h ? 9 : 8, true);
    }

    public final boolean L(int i10) {
        ai.d9 d9Var;
        if (this.h || (d9Var = this.s) == null) {
            return false;
        }
        if (d9Var instanceof ai.u8) {
            qv0 qv0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(qv0Var.v1.getCurrentAccount()).getUser(Long.valueOf(qv0Var.j1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= d9Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        ai.d9 d9Var2 = this.s;
        if (d9Var2.f > 0) {
            return true;
        }
        return d9Var2.m(messageObject.getId());
    }

    public final void M() {
        ju0 ju0Var;
        ju0 ju0Var2;
        ju0 ju0Var3;
        ju0 ju0Var4;
        ai.d9 d9Var = this.s;
        if (d9Var == null || this.h) {
            return;
        }
        qv0 qv0Var = this.F;
        boolean z10 = qv0Var.l1;
        ju0[] ju0VarArr = qv0Var.k0;
        int[] iArr = qv0Var.m1;
        if ((!z10 || (qv0Var.k1 && d9Var.g() > 1)) && this.s.g() > 0 && !qv0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (ju0VarArr != null && (ju0Var3 = ju0VarArr[0]) != null && (ju0Var4 = ju0VarArr[1]) != null && ju0Var3.h != null && ju0Var4.h != null) {
                    qv0Var.m1(false);
                }
                qv0Var.k1 = iArr[1] == 1;
            } else if (qv0Var.k1) {
                qv0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (ju0VarArr != null && (ju0Var = ju0VarArr[0]) != null && (ju0Var2 = ju0VarArr[1]) != null && ju0Var.h != null && ju0Var2.h != null) {
                    qv0Var.m1(false);
                }
            }
            qv0Var.l1 = true;
        }
    }

    public final int N() {
        qv0 qv0Var = this.F;
        vt0 vt0Var = qv0Var.H;
        int[] iArr = qv0Var.m1;
        return this == vt0Var ? iArr[0] : qv0.u(qv0Var, this) != -1 ? iArr[1] : qv0Var.q1;
    }

    public final void O() {
        if (this.s == null) {
            return;
        }
        int N = N();
        this.s.p(Math.min(100, Math.max(1, N / 2) * N * N), false);
    }

    @Override // org.telegram.ui.Components.kv0, s4.h0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.kv0, s4.h0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.kv0, s4.h0
    public final int k() {
        return h();
    }

    @Override // s4.h0
    public void l() {
        if (this.s != null) {
            qv0 qv0Var = this.F;
            if (qv0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(qv0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        M();
    }

    @Override // org.telegram.ui.Components.kv0, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (this.s != null && c1Var.f == 19) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    t7Var.f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = k9Var.f;
                        mv0 mv0Var = new mv0(this.s.c, tL_storyItem);
                        k9Var.K = mv0Var;
                        mv0Var.uploadingStory = k9Var;
                    }
                    t7Var.k(k9Var.K, N(), false);
                    t7Var.d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    t7Var.f0 = false;
                    t7Var.k(null, N(), false);
                    t7Var.d0 = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.s.i.get(size);
                t7Var.f0 = messageObject != null && this.s.m(messageObject.getId());
                qv0 qv0Var = this.F;
                t7Var.setReorder(qv0Var.r0() || t7Var.f0);
                t7Var.h = qv0Var.t0();
                t7Var.k(messageObject, N(), false);
                if (!qv0Var.C1 || messageObject == null) {
                    t7Var.i(false, false);
                } else {
                    t7Var.i(qv0Var.Z0[(messageObject.getDialogId() > qv0Var.j1 ? 1 : (messageObject.getDialogId() == qv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                t7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.kv0, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv0(qv0 qv0Var, Context context, int i10, boolean z10) {
        super(qv0Var, context);
        TLRPC.User user;
        this.F = qv0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
        long j3 = qv0Var.j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(qv0Var.getStoriesHashtag())) {
            if (qv0Var.T1 == null) {
                qv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(qv0Var.getStoriesHashtagUsername()) ? null : qv0Var.getStoriesHashtagUsername(), qv0Var.getStoriesHashtag());
            }
            this.s = qv0Var.T1;
        } else if (qv0Var.getStoriesArea() != null) {
            if (qv0Var.T1 == null) {
                qv0Var.T1 = new ai.v8(currentAccount, qv0Var.getStoriesArea());
            }
            this.s = qv0Var.T1;
        } else if ((!z10 || qv0Var.v0()) && (z10 || !qv0Var.q0())) {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.s = n2Var.getMessagesController().getStoriesController().A(qv0Var.j1, 0, i10, true);
            } else {
                this.s = n2Var.getMessagesController().getStoriesController().A(qv0Var.j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        ai.d9 d9Var = this.s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.w = new lv0(this, n2Var.getMessagesController().getStoriesController(), qv0Var.j1, this.s.c);
        }
        M();
    }
}
