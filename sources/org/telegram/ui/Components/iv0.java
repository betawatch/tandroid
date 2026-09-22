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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class iv0 extends fv0 {
    public boolean E;
    public final /* synthetic */ lv0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ai.d9 s;
    public final int v;
    public final gv0 w;
    public boolean x;
    public final ArrayList y;

    public iv0(lv0 lv0Var, Context context, boolean z10) {
        this(lv0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.fv0, org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.fv0, org.telegram.ui.Components.gl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.fv0, org.telegram.ui.Components.gl0
    public final void I() {
        this.F.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        ai.d9 d9Var;
        if (this.h || (d9Var = this.s) == null) {
            return false;
        }
        if (d9Var instanceof ai.t8) {
            lv0 lv0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(lv0Var.v1.getCurrentAccount()).getUser(Long.valueOf(lv0Var.j1));
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
        eu0 eu0Var;
        eu0 eu0Var2;
        eu0 eu0Var3;
        eu0 eu0Var4;
        ai.d9 d9Var = this.s;
        if (d9Var == null || this.h) {
            return;
        }
        lv0 lv0Var = this.F;
        boolean z10 = lv0Var.l1;
        eu0[] eu0VarArr = lv0Var.k0;
        int[] iArr = lv0Var.m1;
        if ((!z10 || (lv0Var.k1 && d9Var.g() > 1)) && this.s.g() > 0 && !lv0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (eu0VarArr != null && (eu0Var3 = eu0VarArr[0]) != null && (eu0Var4 = eu0VarArr[1]) != null && eu0Var3.h != null && eu0Var4.h != null) {
                    lv0Var.m1(false);
                }
                lv0Var.k1 = iArr[1] == 1;
            } else if (lv0Var.k1) {
                lv0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (eu0VarArr != null && (eu0Var = eu0VarArr[0]) != null && (eu0Var2 = eu0VarArr[1]) != null && eu0Var.h != null && eu0Var2.h != null) {
                    lv0Var.m1(false);
                }
            }
            lv0Var.l1 = true;
        }
    }

    public final int O() {
        lv0 lv0Var = this.F;
        qt0 qt0Var = lv0Var.H;
        int[] iArr = lv0Var.m1;
        return this == qt0Var ? iArr[0] : lv0.u(lv0Var, this) != -1 ? iArr[1] : lv0Var.q1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.fv0, s4.h0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.fv0, s4.h0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.fv0, s4.h0
    public final int k() {
        return h();
    }

    @Override // s4.h0
    public void l() {
        if (this.s != null) {
            lv0 lv0Var = this.F;
            if (lv0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(lv0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.fv0, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (this.s != null && c1Var.f == 19) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.u7) {
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                u7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    u7Var.f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = k9Var.f;
                        hv0 hv0Var = new hv0(this.s.c, tL_storyItem);
                        k9Var.K = hv0Var;
                        hv0Var.uploadingStory = k9Var;
                    }
                    u7Var.k(k9Var.K, O(), false);
                    u7Var.d0 = true;
                    u7Var.setReorder(false);
                    u7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    u7Var.f0 = false;
                    u7Var.k(null, O(), false);
                    u7Var.d0 = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.s.i.get(size);
                u7Var.f0 = messageObject != null && this.s.m(messageObject.getId());
                lv0 lv0Var = this.F;
                u7Var.setReorder(lv0Var.r0() || u7Var.f0);
                u7Var.h = lv0Var.t0();
                u7Var.k(messageObject, O(), false);
                if (!lv0Var.C1 || messageObject == null) {
                    u7Var.i(false, false);
                } else {
                    u7Var.i(lv0Var.Z0[(messageObject.getDialogId() > lv0Var.j1 ? 1 : (messageObject.getDialogId() == lv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                u7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.fv0, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv0(lv0 lv0Var, Context context, int i10, boolean z10) {
        super(lv0Var, context);
        TLRPC.User user;
        this.F = lv0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.v1;
        long j3 = lv0Var.j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(lv0Var.getStoriesHashtag())) {
            if (lv0Var.T1 == null) {
                lv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(lv0Var.getStoriesHashtagUsername()) ? null : lv0Var.getStoriesHashtagUsername(), lv0Var.getStoriesHashtag());
            }
            this.s = lv0Var.T1;
        } else if (lv0Var.getStoriesArea() != null) {
            if (lv0Var.T1 == null) {
                lv0Var.T1 = new ai.v8(currentAccount, lv0Var.getStoriesArea());
            }
            this.s = lv0Var.T1;
        } else if ((!z10 || lv0Var.v0()) && (z10 || !lv0Var.q0())) {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.s = n2Var.getMessagesController().getStoriesController().A(lv0Var.j1, 0, i10, true);
            } else {
                this.s = n2Var.getMessagesController().getStoriesController().A(lv0Var.j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        ai.d9 d9Var = this.s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.w = new gv0(this, n2Var.getMessagesController().getStoriesController(), lv0Var.j1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.fv0
    public final int L(int i10) {
        return i10;
    }
}
