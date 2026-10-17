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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public class pv0 extends mv0 {
    public boolean E;
    public final /* synthetic */ sv0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ci.a7 s;
    public final int v;
    public final nv0 w;
    public boolean x;
    public final ArrayList y;

    public pv0(sv0 sv0Var, Context context, boolean z10) {
        this(sv0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.mv0, org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.mv0, org.telegram.ui.Components.ql0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ci.a7 a7Var = this.s;
        if (a7Var == null || i10 < 0 || i10 >= a7Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.mv0, org.telegram.ui.Components.ql0
    public final void I() {
        this.F.e1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        ci.a7 a7Var;
        if (this.h || (a7Var = this.s) == null) {
            return false;
        }
        if (a7Var instanceof ci.t6) {
            sv0 sv0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(sv0Var.v1.getCurrentAccount()).getUser(Long.valueOf(sv0Var.j1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= a7Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        ci.a7 a7Var2 = this.s;
        if (a7Var2.f > 0) {
            return true;
        }
        return a7Var2.m(messageObject.getId());
    }

    public final void N() {
        lu0 lu0Var;
        lu0 lu0Var2;
        lu0 lu0Var3;
        lu0 lu0Var4;
        ci.a7 a7Var = this.s;
        if (a7Var == null || this.h) {
            return;
        }
        sv0 sv0Var = this.F;
        boolean z10 = sv0Var.l1;
        lu0[] lu0VarArr = sv0Var.k0;
        int[] iArr = sv0Var.m1;
        if ((!z10 || (sv0Var.k1 && a7Var.g() > 1)) && this.s.g() > 0 && !sv0Var.x0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (lu0VarArr != null && (lu0Var3 = lu0VarArr[0]) != null && (lu0Var4 = lu0VarArr[1]) != null && lu0Var3.h != null && lu0Var4.h != null) {
                    sv0Var.o1(false);
                }
                sv0Var.k1 = iArr[1] == 1;
            } else if (sv0Var.k1) {
                sv0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (lu0VarArr != null && (lu0Var = lu0VarArr[0]) != null && (lu0Var2 = lu0VarArr[1]) != null && lu0Var.h != null && lu0Var2.h != null) {
                    sv0Var.o1(false);
                }
            }
            sv0Var.l1 = true;
        }
    }

    public final int O() {
        sv0 sv0Var = this.F;
        xt0 xt0Var = sv0Var.H;
        int[] iArr = sv0Var.m1;
        return this == xt0Var ? iArr[0] : sv0.v(sv0Var, this) != -1 ? iArr[1] : sv0Var.q1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.mv0, s4.g0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.j0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.mv0, s4.g0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.mv0, s4.g0
    public final int k() {
        return h();
    }

    @Override // s4.g0
    public void l() {
        if (this.s != null) {
            sv0 sv0Var = this.F;
            if (sv0Var.s0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(sv0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.mv0, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (this.s != null && b1Var.f == 19) {
            View view = b1Var.a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                s7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ci.h7 h7Var = (ci.h7) arrayList.get(i10);
                    s7Var.f0 = false;
                    if (h7Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = h7Var.a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = h7Var.f;
                        ov0 ov0Var = new ov0(this.s.c, tL_storyItem);
                        h7Var.K = ov0Var;
                        ov0Var.uploadingStory = h7Var;
                    }
                    s7Var.k(h7Var.K, O(), false);
                    s7Var.d0 = true;
                    s7Var.setReorder(false);
                    s7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    s7Var.f0 = false;
                    s7Var.k(null, O(), false);
                    s7Var.d0 = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.s.i.get(size);
                s7Var.f0 = messageObject != null && this.s.m(messageObject.getId());
                sv0 sv0Var = this.F;
                s7Var.setReorder(sv0Var.s0() || s7Var.f0);
                s7Var.h = sv0Var.v0();
                s7Var.k(messageObject, O(), false);
                if (!sv0Var.C1 || messageObject == null) {
                    s7Var.i(false, false);
                } else {
                    s7Var.i(sv0Var.Z0[(messageObject.getDialogId() > sv0Var.j1 ? 1 : (messageObject.getDialogId() == sv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                s7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.mv0, s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        s4.b1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv0(sv0 sv0Var, Context context, int i10, boolean z10) {
        super(sv0Var, context);
        int i11;
        TLRPC.User user;
        this.F = sv0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.v1;
        long j10 = sv0Var.j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(sv0Var.getStoriesHashtag())) {
            if (sv0Var.T1 == null) {
                sv0Var.T1 = new ci.u6(currentAccount, TextUtils.isEmpty(sv0Var.getStoriesHashtagUsername()) ? null : sv0Var.getStoriesHashtagUsername(), sv0Var.getStoriesHashtag());
            }
            this.s = sv0Var.T1;
        } else if (sv0Var.getStoriesArea() != null) {
            if (sv0Var.T1 == null) {
                sv0Var.T1 = new ci.u6(currentAccount, sv0Var.getStoriesArea());
            }
            this.s = sv0Var.T1;
        } else if ((!z10 || sv0Var.x0()) && (z10 || !sv0Var.r0())) {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.s = n2Var.getMessagesController().getStoriesController().A(sv0Var.j1, 0, i10, true);
            } else {
                ci.i7 storiesController = n2Var.getMessagesController().getStoriesController();
                long j11 = sv0Var.j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.s = storiesController.A(j11, i11, -1, true);
                }
                i11 = i12;
                this.s = storiesController.A(j11, i11, -1, true);
            }
        } else {
            this.s = null;
        }
        ci.a7 a7Var = this.s;
        if (a7Var != null) {
            this.v = a7Var.o();
            this.w = new nv0(this, n2Var.getMessagesController().getStoriesController(), sv0Var.j1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.mv0
    public final int L(int i10) {
        return i10;
    }
}
