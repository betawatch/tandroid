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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class qv0 extends nv0 {
    public boolean E;
    public final /* synthetic */ tv0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ci.a7 s;
    public final int v;
    public final ov0 w;
    public boolean x;
    public final ArrayList y;

    public qv0(tv0 tv0Var, Context context, boolean z10) {
        this(tv0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.nv0, org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.nv0, org.telegram.ui.Components.ql0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ci.a7 a7Var = this.s;
        if (a7Var == null || i10 < 0 || i10 >= a7Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.nv0, org.telegram.ui.Components.ql0
    public final void I() {
        this.F.e1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        ci.a7 a7Var;
        if (this.h || (a7Var = this.s) == null) {
            return false;
        }
        if (a7Var instanceof ci.t6) {
            tv0 tv0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(tv0Var.v1.getCurrentAccount()).getUser(Long.valueOf(tv0Var.j1));
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
        mu0 mu0Var;
        mu0 mu0Var2;
        mu0 mu0Var3;
        mu0 mu0Var4;
        ci.a7 a7Var = this.s;
        if (a7Var == null || this.h) {
            return;
        }
        tv0 tv0Var = this.F;
        boolean z10 = tv0Var.l1;
        mu0[] mu0VarArr = tv0Var.k0;
        int[] iArr = tv0Var.m1;
        if ((!z10 || (tv0Var.k1 && a7Var.g() > 1)) && this.s.g() > 0 && !tv0Var.x0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (mu0VarArr != null && (mu0Var3 = mu0VarArr[0]) != null && (mu0Var4 = mu0VarArr[1]) != null && mu0Var3.h != null && mu0Var4.h != null) {
                    tv0Var.o1(false);
                }
                tv0Var.k1 = iArr[1] == 1;
            } else if (tv0Var.k1) {
                tv0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (mu0VarArr != null && (mu0Var = mu0VarArr[0]) != null && (mu0Var2 = mu0VarArr[1]) != null && mu0Var.h != null && mu0Var2.h != null) {
                    tv0Var.o1(false);
                }
            }
            tv0Var.l1 = true;
        }
    }

    public final int O() {
        tv0 tv0Var = this.F;
        yt0 yt0Var = tv0Var.H;
        int[] iArr = tv0Var.m1;
        return this == yt0Var ? iArr[0] : tv0.v(tv0Var, this) != -1 ? iArr[1] : tv0Var.q1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.nv0, s4.g0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.j0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.nv0, s4.g0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.nv0, s4.g0
    public final int k() {
        return h();
    }

    @Override // s4.g0
    public void l() {
        if (this.s != null) {
            tv0 tv0Var = this.F;
            if (tv0Var.s0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(tv0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.nv0, s4.g0
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
                        pv0 pv0Var = new pv0(this.s.c, tL_storyItem);
                        h7Var.K = pv0Var;
                        pv0Var.uploadingStory = h7Var;
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
                tv0 tv0Var = this.F;
                s7Var.setReorder(tv0Var.s0() || s7Var.f0);
                s7Var.h = tv0Var.v0();
                s7Var.k(messageObject, O(), false);
                if (!tv0Var.C1 || messageObject == null) {
                    s7Var.i(false, false);
                } else {
                    s7Var.i(tv0Var.Z0[(messageObject.getDialogId() > tv0Var.j1 ? 1 : (messageObject.getDialogId() == tv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                s7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.nv0, s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        s4.b1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv0(tv0 tv0Var, Context context, int i10, boolean z10) {
        super(tv0Var, context);
        int i11;
        TLRPC.User user;
        this.F = tv0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
        long j10 = tv0Var.j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(tv0Var.getStoriesHashtag())) {
            if (tv0Var.T1 == null) {
                tv0Var.T1 = new ci.u6(currentAccount, TextUtils.isEmpty(tv0Var.getStoriesHashtagUsername()) ? null : tv0Var.getStoriesHashtagUsername(), tv0Var.getStoriesHashtag());
            }
            this.s = tv0Var.T1;
        } else if (tv0Var.getStoriesArea() != null) {
            if (tv0Var.T1 == null) {
                tv0Var.T1 = new ci.u6(currentAccount, tv0Var.getStoriesArea());
            }
            this.s = tv0Var.T1;
        } else if ((!z10 || tv0Var.x0()) && (z10 || !tv0Var.r0())) {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.s = n2Var.getMessagesController().getStoriesController().A(tv0Var.j1, 0, i10, true);
            } else {
                ci.i7 storiesController = n2Var.getMessagesController().getStoriesController();
                long j11 = tv0Var.j1;
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
            this.w = new ov0(this, n2Var.getMessagesController().getStoriesController(), tv0Var.j1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.nv0
    public final int L(int i10) {
        return i10;
    }
}
