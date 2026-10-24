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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class uv0 extends rv0 {
    public boolean E;
    public final /* synthetic */ xv0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ci.z6 s;
    public final int v;
    public final sv0 w;
    public boolean x;
    public final ArrayList y;

    public uv0(xv0 xv0Var, Context context, boolean z10) {
        this(xv0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.ul0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ci.z6 z6Var = this.s;
        if (z6Var == null || i10 < 0 || i10 >= z6Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.ul0
    public final void I() {
        this.F.f1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        ci.z6 z6Var;
        if (this.h || (z6Var = this.s) == null) {
            return false;
        }
        if (z6Var instanceof ci.s6) {
            xv0 xv0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(xv0Var.v1.getCurrentAccount()).getUser(Long.valueOf(xv0Var.j1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= z6Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        ci.z6 z6Var2 = this.s;
        if (z6Var2.f > 0) {
            return true;
        }
        return z6Var2.m(messageObject.getId());
    }

    public final void N() {
        qu0 qu0Var;
        qu0 qu0Var2;
        qu0 qu0Var3;
        qu0 qu0Var4;
        ci.z6 z6Var = this.s;
        if (z6Var == null || this.h) {
            return;
        }
        xv0 xv0Var = this.F;
        boolean z10 = xv0Var.l1;
        qu0[] qu0VarArr = xv0Var.k0;
        int[] iArr = xv0Var.m1;
        if ((!z10 || (xv0Var.k1 && z6Var.g() > 1)) && this.s.g() > 0 && !xv0Var.y0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (qu0VarArr != null && (qu0Var3 = qu0VarArr[0]) != null && (qu0Var4 = qu0VarArr[1]) != null && qu0Var3.h != null && qu0Var4.h != null) {
                    xv0Var.p1(false);
                }
                xv0Var.k1 = iArr[1] == 1;
            } else if (xv0Var.k1) {
                xv0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (qu0VarArr != null && (qu0Var = qu0VarArr[0]) != null && (qu0Var2 = qu0VarArr[1]) != null && qu0Var.h != null && qu0Var2.h != null) {
                    xv0Var.p1(false);
                }
            }
            xv0Var.l1 = true;
        }
    }

    public final int O() {
        xv0 xv0Var = this.F;
        cu0 cu0Var = xv0Var.H;
        int[] iArr = xv0Var.m1;
        return this == cu0Var ? iArr[0] : xv0.v(xv0Var, this) != -1 ? iArr[1] : xv0Var.q1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.rv0, s4.g0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.k0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.rv0, s4.g0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.rv0, s4.g0
    public final int k() {
        return h();
    }

    @Override // s4.g0
    public void l() {
        if (this.s != null) {
            xv0 xv0Var = this.F;
            if (xv0Var.t0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(xv0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.rv0, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (this.s != null && b1Var.f == 19) {
            View view = b1Var.a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                s7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ci.g7 g7Var = (ci.g7) arrayList.get(i10);
                    s7Var.f0 = false;
                    if (g7Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = g7Var.a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = g7Var.f;
                        tv0 tv0Var = new tv0(this.s.c, tL_storyItem);
                        g7Var.K = tv0Var;
                        tv0Var.uploadingStory = g7Var;
                    }
                    s7Var.k(g7Var.K, O(), false);
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
                xv0 xv0Var = this.F;
                s7Var.setReorder(xv0Var.t0() || s7Var.f0);
                s7Var.h = xv0Var.w0();
                s7Var.k(messageObject, O(), false);
                if (!xv0Var.C1 || messageObject == null) {
                    s7Var.i(false, false);
                } else {
                    s7Var.i(xv0Var.Z0[(messageObject.getDialogId() > xv0Var.j1 ? 1 : (messageObject.getDialogId() == xv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                s7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.rv0, s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        s4.b1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv0(xv0 xv0Var, Context context, int i10, boolean z10) {
        super(xv0Var, context);
        int i11;
        TLRPC.User user;
        this.F = xv0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
        long j10 = xv0Var.j1;
        int currentAccount = o2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(xv0Var.getStoriesHashtag())) {
            if (xv0Var.U1 == null) {
                xv0Var.U1 = new ci.t6(currentAccount, TextUtils.isEmpty(xv0Var.getStoriesHashtagUsername()) ? null : xv0Var.getStoriesHashtagUsername(), xv0Var.getStoriesHashtag());
            }
            this.s = xv0Var.U1;
        } else if (xv0Var.getStoriesArea() != null) {
            if (xv0Var.U1 == null) {
                xv0Var.U1 = new ci.t6(currentAccount, xv0Var.getStoriesArea());
            }
            this.s = xv0Var.U1;
        } else if ((!z10 || xv0Var.y0()) && (z10 || !xv0Var.s0())) {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.s = o2Var.getMessagesController().getStoriesController().A(xv0Var.j1, 0, i10, true);
            } else {
                ci.h7 storiesController = o2Var.getMessagesController().getStoriesController();
                long j11 = xv0Var.j1;
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
        ci.z6 z6Var = this.s;
        if (z6Var != null) {
            this.v = z6Var.o();
            this.w = new sv0(this, o2Var.getMessagesController().getStoriesController(), xv0Var.j1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.rv0
    public final int L(int i10) {
        return i10;
    }
}
