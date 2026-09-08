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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class uu0 extends ru0 {
    public boolean E;
    public final /* synthetic */ xu0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public bi.l8 s;
    public final int v;
    public final su0 w;
    public boolean x;
    public final ArrayList y;

    public uu0(xu0 xu0Var, Context context, boolean z10) {
        this(xu0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.ru0, org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ru0, org.telegram.ui.Components.tk0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        bi.l8 l8Var = this.s;
        if (l8Var == null || i10 < 0 || i10 >= l8Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.ru0, org.telegram.ui.Components.tk0
    public final void I() {
        this.F.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        bi.l8 l8Var;
        if (this.h || (l8Var = this.s) == null) {
            return false;
        }
        if (l8Var instanceof bi.b8) {
            xu0 xu0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(xu0Var.v1.getCurrentAccount()).getUser(Long.valueOf(xu0Var.j1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= l8Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        bi.l8 l8Var2 = this.s;
        if (l8Var2.f > 0) {
            return true;
        }
        return l8Var2.m(messageObject.getId());
    }

    public final void N() {
        qt0 qt0Var;
        qt0 qt0Var2;
        qt0 qt0Var3;
        qt0 qt0Var4;
        bi.l8 l8Var = this.s;
        if (l8Var == null || this.h) {
            return;
        }
        xu0 xu0Var = this.F;
        boolean z10 = xu0Var.l1;
        qt0[] qt0VarArr = xu0Var.k0;
        int[] iArr = xu0Var.m1;
        if ((!z10 || (xu0Var.k1 && l8Var.g() > 1)) && this.s.g() > 0 && !xu0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (qt0VarArr != null && (qt0Var3 = qt0VarArr[0]) != null && (qt0Var4 = qt0VarArr[1]) != null && qt0Var3.h != null && qt0Var4.h != null) {
                    xu0Var.m1(false);
                }
                xu0Var.k1 = iArr[1] == 1;
            } else if (xu0Var.k1) {
                xu0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (qt0VarArr != null && (qt0Var = qt0VarArr[0]) != null && (qt0Var2 = qt0VarArr[1]) != null && qt0Var.h != null && qt0Var2.h != null) {
                    xu0Var.m1(false);
                }
            }
            xu0Var.l1 = true;
        }
    }

    public final int O() {
        xu0 xu0Var = this.F;
        ct0 ct0Var = xu0Var.H;
        int[] iArr = xu0Var.m1;
        return this == ct0Var ? iArr[0] : xu0.u(xu0Var, this) != -1 ? iArr[1] : xu0Var.q1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.ru0, s4.h0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.ru0, s4.h0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.ru0, s4.h0
    public final int k() {
        return h();
    }

    @Override // s4.h0
    public void l() {
        if (this.s != null) {
            xu0 xu0Var = this.F;
            if (xu0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(xu0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.ru0, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (this.s != null && c1Var.f == 19) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    bi.t8 t8Var = (bi.t8) arrayList.get(i10);
                    t7Var.f0 = false;
                    if (t8Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = t8Var.a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = t8Var.f;
                        tu0 tu0Var = new tu0(this.s.c, tL_storyItem);
                        t8Var.K = tu0Var;
                        tu0Var.uploadingStory = t8Var;
                    }
                    t7Var.k(t8Var.K, O(), false);
                    t7Var.d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    t7Var.f0 = false;
                    t7Var.k(null, O(), false);
                    t7Var.d0 = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.s.i.get(size);
                t7Var.f0 = messageObject != null && this.s.m(messageObject.getId());
                xu0 xu0Var = this.F;
                t7Var.setReorder(xu0Var.r0() || t7Var.f0);
                t7Var.h = xu0Var.t0();
                t7Var.k(messageObject, O(), false);
                if (!xu0Var.C1 || messageObject == null) {
                    t7Var.i(false, false);
                } else {
                    t7Var.i(xu0Var.Z0[(messageObject.getDialogId() > xu0Var.j1 ? 1 : (messageObject.getDialogId() == xu0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                t7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.ru0, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(xu0 xu0Var, Context context, int i10, boolean z10) {
        super(xu0Var, context);
        TLRPC.User user;
        this.F = xu0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
        long j3 = xu0Var.j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(xu0Var.getStoriesHashtag())) {
            if (xu0Var.T1 == null) {
                xu0Var.T1 = new bi.d8(currentAccount, TextUtils.isEmpty(xu0Var.getStoriesHashtagUsername()) ? null : xu0Var.getStoriesHashtagUsername(), xu0Var.getStoriesHashtag());
            }
            this.s = xu0Var.T1;
        } else if (xu0Var.getStoriesArea() != null) {
            if (xu0Var.T1 == null) {
                xu0Var.T1 = new bi.d8(currentAccount, xu0Var.getStoriesArea());
            }
            this.s = xu0Var.T1;
        } else if ((!z10 || xu0Var.v0()) && (z10 || !xu0Var.q0())) {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.s = n2Var.getMessagesController().getStoriesController().A(xu0Var.j1, 0, i10, true);
            } else {
                this.s = n2Var.getMessagesController().getStoriesController().A(xu0Var.j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        bi.l8 l8Var = this.s;
        if (l8Var != null) {
            this.v = l8Var.o();
            this.w = new su0(this, n2Var.getMessagesController().getStoriesController(), xu0Var.j1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.ru0
    public final int L(int i10) {
        return i10;
    }
}
