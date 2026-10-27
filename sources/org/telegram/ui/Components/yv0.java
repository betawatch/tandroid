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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class yv0 extends vv0 {
    public boolean E;
    public final /* synthetic */ bw0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public di.z6 s;
    public final int v;
    public final wv0 w;
    public boolean x;
    public final ArrayList y;

    public yv0(bw0 bw0Var, Context context, boolean z10) {
        this(bw0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.vv0, org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.vv0, org.telegram.ui.Components.ul0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        di.z6 z6Var = this.s;
        if (z6Var == null || i10 < 0 || i10 >= z6Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.vv0, org.telegram.ui.Components.ul0
    public final void I() {
        this.F.l1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        di.z6 z6Var;
        if (this.h || (z6Var = this.s) == null) {
            return false;
        }
        if (z6Var instanceof di.s6) {
            bw0 bw0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(bw0Var.x1.getCurrentAccount()).getUser(Long.valueOf(bw0Var.l1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= z6Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        di.z6 z6Var2 = this.s;
        if (z6Var2.f > 0) {
            return true;
        }
        return z6Var2.m(messageObject.getId());
    }

    public final void N() {
        uu0 uu0Var;
        uu0 uu0Var2;
        uu0 uu0Var3;
        uu0 uu0Var4;
        di.z6 z6Var = this.s;
        if (z6Var == null || this.h) {
            return;
        }
        bw0 bw0Var = this.F;
        boolean z10 = bw0Var.n1;
        uu0[] uu0VarArr = bw0Var.m0;
        int[] iArr = bw0Var.o1;
        if ((!z10 || (bw0Var.m1 && z6Var.g() > 1)) && this.s.g() > 0 && !bw0Var.D0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (uu0VarArr != null && (uu0Var3 = uu0VarArr[0]) != null && (uu0Var4 = uu0VarArr[1]) != null && uu0Var3.h != null && uu0Var4.h != null) {
                    bw0Var.v1(false);
                }
                bw0Var.m1 = iArr[1] == 1;
            } else if (bw0Var.m1) {
                bw0Var.m1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (uu0VarArr != null && (uu0Var = uu0VarArr[0]) != null && (uu0Var2 = uu0VarArr[1]) != null && uu0Var.h != null && uu0Var2.h != null) {
                    bw0Var.v1(false);
                }
            }
            bw0Var.n1 = true;
        }
    }

    public final int O() {
        bw0 bw0Var = this.F;
        fu0 fu0Var = bw0Var.J;
        int[] iArr = bw0Var.o1;
        return this == fu0Var ? iArr[0] : bw0.w(bw0Var, this) != -1 ? iArr[1] : bw0Var.s1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.vv0, s4.h0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.q0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.vv0, s4.h0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.vv0, s4.h0
    public final int k() {
        return h();
    }

    @Override // s4.h0
    public void l() {
        if (this.s != null) {
            bw0 bw0Var = this.F;
            if (bw0Var.y0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList F = MessagesController.getInstance(this.s.c).getStoriesController().F(bw0Var.l1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.vv0, s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        if (this.s != null && e1Var.f == 19) {
            View view = e1Var.a;
            if (view instanceof org.telegram.ui.Cells.w7) {
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                w7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    di.g7 g7Var = (di.g7) arrayList.get(i10);
                    w7Var.f0 = false;
                    if (g7Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = g7Var.a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = g7Var.f;
                        xv0 xv0Var = new xv0(this.s.c, tL_storyItem);
                        g7Var.K = xv0Var;
                        xv0Var.uploadingStory = g7Var;
                    }
                    w7Var.k(g7Var.K, O(), false);
                    w7Var.d0 = true;
                    w7Var.setReorder(false);
                    w7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    w7Var.f0 = false;
                    w7Var.k(null, O(), false);
                    w7Var.d0 = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.s.i.get(size);
                w7Var.f0 = messageObject != null && this.s.m(messageObject.getId());
                bw0 bw0Var = this.F;
                w7Var.setReorder(bw0Var.y0() || w7Var.f0);
                w7Var.h = bw0Var.B0();
                w7Var.k(messageObject, O(), false);
                if (!bw0Var.E1 || messageObject == null) {
                    w7Var.i(false, false);
                } else {
                    w7Var.i(bw0Var.b1[(messageObject.getDialogId() > bw0Var.l1 ? 1 : (messageObject.getDialogId() == bw0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                w7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.vv0, s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        s4.e1 x9 = super.x(viewGroup, i10);
        View view = x9.a;
        if (view instanceof org.telegram.ui.Cells.w7) {
            ((org.telegram.ui.Cells.w7) view).d0 = true;
        }
        return x9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv0(bw0 bw0Var, Context context, int i10, boolean z10) {
        super(bw0Var, context);
        int i11;
        TLRPC.User user;
        this.F = bw0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
        long j10 = bw0Var.l1;
        int currentAccount = r2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(bw0Var.getStoriesHashtag())) {
            if (bw0Var.W1 == null) {
                bw0Var.W1 = new di.t6(currentAccount, TextUtils.isEmpty(bw0Var.getStoriesHashtagUsername()) ? null : bw0Var.getStoriesHashtagUsername(), bw0Var.getStoriesHashtag());
            }
            this.s = bw0Var.W1;
        } else if (bw0Var.getStoriesArea() != null) {
            if (bw0Var.W1 == null) {
                bw0Var.W1 = new di.t6(currentAccount, bw0Var.getStoriesArea());
            }
            this.s = bw0Var.W1;
        } else if ((!z10 || bw0Var.D0()) && (z10 || !bw0Var.x0())) {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.s = r2Var.getMessagesController().getStoriesController().A(bw0Var.l1, 0, i10, true);
            } else {
                di.h7 storiesController = r2Var.getMessagesController().getStoriesController();
                long j11 = bw0Var.l1;
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
        di.z6 z6Var = this.s;
        if (z6Var != null) {
            this.v = z6Var.o();
            this.w = new wv0(this, r2Var.getMessagesController().getStoriesController(), bw0Var.l1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.vv0
    public final int L(int i10) {
        return i10;
    }
}
