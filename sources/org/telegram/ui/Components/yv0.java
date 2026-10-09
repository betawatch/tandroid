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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class yv0 extends vv0 {
    public boolean E;
    public final /* synthetic */ bw0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ai.e9 s;
    public final int v;
    public final wv0 w;
    public boolean x;
    public final ArrayList y;

    public yv0(bw0 bw0Var, Context context, boolean z10) {
        this(bw0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.vv0, org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.vv0, org.telegram.ui.Components.yl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.e9 e9Var = this.s;
        if (e9Var == null || i10 < 0 || i10 >= e9Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.vv0, org.telegram.ui.Components.yl0
    public final void I() {
        this.F.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        ai.e9 e9Var;
        if (this.h || (e9Var = this.s) == null) {
            return false;
        }
        if (e9Var instanceof ai.v8) {
            bw0 bw0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(bw0Var.v1.getCurrentAccount()).getUser(Long.valueOf(bw0Var.j1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= e9Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        ai.e9 e9Var2 = this.s;
        if (e9Var2.f > 0) {
            return true;
        }
        return e9Var2.m(messageObject.getId());
    }

    public final void N() {
        uu0 uu0Var;
        uu0 uu0Var2;
        uu0 uu0Var3;
        uu0 uu0Var4;
        ai.e9 e9Var = this.s;
        if (e9Var == null || this.h) {
            return;
        }
        bw0 bw0Var = this.F;
        boolean z10 = bw0Var.l1;
        uu0[] uu0VarArr = bw0Var.k0;
        int[] iArr = bw0Var.m1;
        if ((!z10 || (bw0Var.k1 && e9Var.g() > 1)) && this.s.g() > 0 && !bw0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (uu0VarArr != null && (uu0Var3 = uu0VarArr[0]) != null && (uu0Var4 = uu0VarArr[1]) != null && uu0Var3.h != null && uu0Var4.h != null) {
                    bw0Var.m1(false);
                }
                bw0Var.k1 = iArr[1] == 1;
            } else if (bw0Var.k1) {
                bw0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (uu0VarArr != null && (uu0Var = uu0VarArr[0]) != null && (uu0Var2 = uu0VarArr[1]) != null && uu0Var.h != null && uu0Var2.h != null) {
                    bw0Var.m1(false);
                }
            }
            bw0Var.l1 = true;
        }
    }

    public final int O() {
        bw0 bw0Var = this.F;
        gu0 gu0Var = bw0Var.H;
        int[] iArr = bw0Var.m1;
        return this == gu0Var ? iArr[0] : bw0.u(bw0Var, this) != -1 ? iArr[1] : bw0Var.q1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.vv0, s4.i0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.vv0, s4.i0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.vv0, s4.i0
    public final int k() {
        return h();
    }

    @Override // s4.i0
    public void l() {
        if (this.s != null) {
            bw0 bw0Var = this.F;
            if (bw0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(bw0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.vv0, s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        if (this.s != null && d1Var.f == 19) {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.l9 l9Var = (ai.l9) arrayList.get(i10);
                    t7Var.f0 = false;
                    if (l9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = l9Var.a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = l9Var.f;
                        xv0 xv0Var = new xv0(this.s.c, tL_storyItem);
                        l9Var.K = xv0Var;
                        xv0Var.uploadingStory = l9Var;
                    }
                    t7Var.k(l9Var.K, O(), false);
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
                bw0 bw0Var = this.F;
                t7Var.setReorder(bw0Var.r0() || t7Var.f0);
                t7Var.h = bw0Var.t0();
                t7Var.k(messageObject, O(), false);
                if (!bw0Var.C1 || messageObject == null) {
                    t7Var.i(false, false);
                } else {
                    t7Var.i(bw0Var.Z0[(messageObject.getDialogId() > bw0Var.j1 ? 1 : (messageObject.getDialogId() == bw0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                t7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.vv0, s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        s4.d1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).d0 = true;
        }
        return x10;
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
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
        long j3 = bw0Var.j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(bw0Var.getStoriesHashtag())) {
            if (bw0Var.T1 == null) {
                bw0Var.T1 = new ai.w8(currentAccount, TextUtils.isEmpty(bw0Var.getStoriesHashtagUsername()) ? null : bw0Var.getStoriesHashtagUsername(), bw0Var.getStoriesHashtag());
            }
            this.s = bw0Var.T1;
        } else if (bw0Var.getStoriesArea() != null) {
            if (bw0Var.T1 == null) {
                bw0Var.T1 = new ai.w8(currentAccount, bw0Var.getStoriesArea());
            }
            this.s = bw0Var.T1;
        } else if ((!z10 || bw0Var.v0()) && (z10 || !bw0Var.q0())) {
            int i12 = 1;
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.s = n2Var.getMessagesController().getStoriesController().A(bw0Var.j1, 0, i10, true);
            } else {
                ai.m9 storiesController = n2Var.getMessagesController().getStoriesController();
                long j10 = bw0Var.j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.s = storiesController.A(j10, i11, -1, true);
                }
                i11 = i12;
                this.s = storiesController.A(j10, i11, -1, true);
            }
        } else {
            this.s = null;
        }
        ai.e9 e9Var = this.s;
        if (e9Var != null) {
            this.v = e9Var.o();
            this.w = new wv0(this, n2Var.getMessagesController().getStoriesController(), bw0Var.j1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.vv0
    public final int L(int i10) {
        return i10;
    }
}
