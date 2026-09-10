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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class fv0 extends cv0 {
    public boolean E;
    public final /* synthetic */ iv0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public zh.a5 s;
    public final int v;
    public final dv0 w;
    public boolean x;
    public final ArrayList y;

    public fv0(iv0 iv0Var, Context context, boolean z10) {
        this(iv0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.cv0, org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.cv0, org.telegram.ui.Components.dl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        zh.a5 a5Var = this.s;
        if (a5Var == null || i10 < 0 || i10 >= a5Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.cv0, org.telegram.ui.Components.dl0
    public final void I() {
        this.F.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        zh.a5 a5Var;
        if (this.h || (a5Var = this.s) == null) {
            return false;
        }
        if (a5Var instanceof zh.s4) {
            iv0 iv0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(iv0Var.v1.getCurrentAccount()).getUser(Long.valueOf(iv0Var.j1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= a5Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        zh.a5 a5Var2 = this.s;
        if (a5Var2.f > 0) {
            return true;
        }
        return a5Var2.m(messageObject.getId());
    }

    public final void N() {
        au0 au0Var;
        au0 au0Var2;
        au0 au0Var3;
        au0 au0Var4;
        zh.a5 a5Var = this.s;
        if (a5Var == null || this.h) {
            return;
        }
        iv0 iv0Var = this.F;
        boolean z10 = iv0Var.l1;
        au0[] au0VarArr = iv0Var.k0;
        int[] iArr = iv0Var.m1;
        if ((!z10 || (iv0Var.k1 && a5Var.g() > 1)) && this.s.g() > 0 && !iv0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (au0VarArr != null && (au0Var3 = au0VarArr[0]) != null && (au0Var4 = au0VarArr[1]) != null && au0Var3.h != null && au0Var4.h != null) {
                    iv0Var.m1(false);
                }
                iv0Var.k1 = iArr[1] == 1;
            } else if (iv0Var.k1) {
                iv0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (au0VarArr != null && (au0Var = au0VarArr[0]) != null && (au0Var2 = au0VarArr[1]) != null && au0Var.h != null && au0Var2.h != null) {
                    iv0Var.m1(false);
                }
            }
            iv0Var.l1 = true;
        }
    }

    public final int O() {
        iv0 iv0Var = this.F;
        mt0 mt0Var = iv0Var.H;
        int[] iArr = iv0Var.m1;
        return this == mt0Var ? iArr[0] : iv0.u(iv0Var, this) != -1 ? iArr[1] : iv0Var.q1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.cv0, s4.h0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.cv0, s4.h0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.cv0, s4.h0
    public final int k() {
        return h();
    }

    @Override // s4.h0
    public void l() {
        if (this.s != null) {
            iv0 iv0Var = this.F;
            if (iv0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(iv0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.cv0, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (this.s != null && c1Var.f == 19) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.u7) {
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                u7Var.d0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    zh.h5 h5Var = (zh.h5) arrayList.get(i10);
                    u7Var.f0 = false;
                    if (h5Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = h5Var.a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = h5Var.f;
                        ev0 ev0Var = new ev0(this.s.c, tL_storyItem);
                        h5Var.K = ev0Var;
                        ev0Var.uploadingStory = h5Var;
                    }
                    u7Var.k(h5Var.K, O(), false);
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
                iv0 iv0Var = this.F;
                u7Var.setReorder(iv0Var.r0() || u7Var.f0);
                u7Var.h = iv0Var.t0();
                u7Var.k(messageObject, O(), false);
                if (!iv0Var.C1 || messageObject == null) {
                    u7Var.i(false, false);
                } else {
                    u7Var.i(iv0Var.Z0[(messageObject.getDialogId() > iv0Var.j1 ? 1 : (messageObject.getDialogId() == iv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                u7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.cv0, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv0(iv0 iv0Var, Context context, int i10, boolean z10) {
        super(iv0Var, context);
        TLRPC.User user;
        this.F = iv0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
        long j3 = iv0Var.j1;
        int currentAccount = p2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(iv0Var.getStoriesHashtag())) {
            if (iv0Var.T1 == null) {
                iv0Var.T1 = new zh.u4(currentAccount, TextUtils.isEmpty(iv0Var.getStoriesHashtagUsername()) ? null : iv0Var.getStoriesHashtagUsername(), iv0Var.getStoriesHashtag());
            }
            this.s = iv0Var.T1;
        } else if (iv0Var.getStoriesArea() != null) {
            if (iv0Var.T1 == null) {
                iv0Var.T1 = new zh.u4(currentAccount, iv0Var.getStoriesArea());
            }
            this.s = iv0Var.T1;
        } else if ((!z10 || iv0Var.v0()) && (z10 || !iv0Var.q0())) {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.s = p2Var.getMessagesController().getStoriesController().A(iv0Var.j1, 0, i10, true);
            } else {
                this.s = p2Var.getMessagesController().getStoriesController().A(iv0Var.j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        zh.a5 a5Var = this.s;
        if (a5Var != null) {
            this.v = a5Var.o();
            this.w = new dv0(this, p2Var.getMessagesController().getStoriesController(), iv0Var.j1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.cv0
    public final int L(int i10) {
        return i10;
    }
}
