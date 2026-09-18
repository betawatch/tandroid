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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class wu0 extends tu0 {
    public boolean E;
    public final /* synthetic */ zu0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ai.d9 s;
    public final int v;
    public final uu0 w;
    public boolean x;
    public final ArrayList y;

    public wu0(zu0 zu0Var, Context context, boolean z10) {
        this(zu0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.tu0, org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tu0, org.telegram.ui.Components.uk0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.tu0, org.telegram.ui.Components.uk0
    public final void I() {
        this.F.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        ai.d9 d9Var;
        if (this.h || (d9Var = this.s) == null) {
            return false;
        }
        if (d9Var instanceof ai.t8) {
            zu0 zu0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(zu0Var.v1.getCurrentAccount()).getUser(Long.valueOf(zu0Var.j1));
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

    public final void N() {
        st0 st0Var;
        st0 st0Var2;
        st0 st0Var3;
        st0 st0Var4;
        ai.d9 d9Var = this.s;
        if (d9Var == null || this.h) {
            return;
        }
        zu0 zu0Var = this.F;
        boolean z10 = zu0Var.l1;
        st0[] st0VarArr = zu0Var.k0;
        int[] iArr = zu0Var.m1;
        if ((!z10 || (zu0Var.k1 && d9Var.g() > 1)) && this.s.g() > 0 && !zu0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (st0VarArr != null && (st0Var3 = st0VarArr[0]) != null && (st0Var4 = st0VarArr[1]) != null && st0Var3.h != null && st0Var4.h != null) {
                    zu0Var.m1(false);
                }
                zu0Var.k1 = iArr[1] == 1;
            } else if (zu0Var.k1) {
                zu0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (st0VarArr != null && (st0Var = st0VarArr[0]) != null && (st0Var2 = st0VarArr[1]) != null && st0Var.h != null && st0Var2.h != null) {
                    zu0Var.m1(false);
                }
            }
            zu0Var.l1 = true;
        }
    }

    public final int O() {
        zu0 zu0Var = this.F;
        et0 et0Var = zu0Var.H;
        int[] iArr = zu0Var.m1;
        return this == et0Var ? iArr[0] : zu0.u(zu0Var, this) != -1 ? iArr[1] : zu0Var.q1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.tu0, s4.h0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.tu0, s4.h0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.tu0, s4.h0
    public final int k() {
        return h();
    }

    @Override // s4.h0
    public void l() {
        if (this.s != null) {
            zu0 zu0Var = this.F;
            if (zu0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(zu0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.tu0, s4.h0
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
                        vu0 vu0Var = new vu0(this.s.c, tL_storyItem);
                        k9Var.K = vu0Var;
                        vu0Var.uploadingStory = k9Var;
                    }
                    t7Var.k(k9Var.K, O(), false);
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
                zu0 zu0Var = this.F;
                t7Var.setReorder(zu0Var.r0() || t7Var.f0);
                t7Var.h = zu0Var.t0();
                t7Var.k(messageObject, O(), false);
                if (!zu0Var.C1 || messageObject == null) {
                    t7Var.i(false, false);
                } else {
                    t7Var.i(zu0Var.Z0[(messageObject.getDialogId() > zu0Var.j1 ? 1 : (messageObject.getDialogId() == zu0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                t7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.tu0, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu0(zu0 zu0Var, Context context, int i10, boolean z10) {
        super(zu0Var, context);
        TLRPC.User user;
        this.F = zu0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        long j3 = zu0Var.j1;
        int currentAccount = o2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(zu0Var.getStoriesHashtag())) {
            if (zu0Var.T1 == null) {
                zu0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(zu0Var.getStoriesHashtagUsername()) ? null : zu0Var.getStoriesHashtagUsername(), zu0Var.getStoriesHashtag());
            }
            this.s = zu0Var.T1;
        } else if (zu0Var.getStoriesArea() != null) {
            if (zu0Var.T1 == null) {
                zu0Var.T1 = new ai.v8(currentAccount, zu0Var.getStoriesArea());
            }
            this.s = zu0Var.T1;
        } else if ((!z10 || zu0Var.v0()) && (z10 || !zu0Var.q0())) {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.s = o2Var.getMessagesController().getStoriesController().A(zu0Var.j1, 0, i10, true);
            } else {
                this.s = o2Var.getMessagesController().getStoriesController().A(zu0Var.j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        ai.d9 d9Var = this.s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.w = new uu0(this, o2Var.getMessagesController().getStoriesController(), zu0Var.j1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.tu0
    public final int L(int i10) {
        return i10;
    }
}
