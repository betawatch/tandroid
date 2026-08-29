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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class nu0 extends ku0 {
    public boolean A;
    public final /* synthetic */ qu0 B;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public lh.k6 s;
    public final int v;
    public final lu0 w;
    public boolean x;
    public final ArrayList y;

    public nu0(qu0 qu0Var, Context context, boolean z10) {
        this(qu0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.ku0, org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ku0, org.telegram.ui.Components.tk0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        lh.k6 k6Var = this.s;
        if (k6Var == null || i10 < 0 || i10 >= k6Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.ku0, org.telegram.ui.Components.tk0
    public final void I() {
        this.B.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        lh.k6 k6Var;
        if (this.h || (k6Var = this.s) == null) {
            return false;
        }
        if (k6Var instanceof lh.c6) {
            qu0 qu0Var = this.B;
            TLRPC.User user = MessagesController.getInstance(qu0Var.r1.getCurrentAccount()).getUser(Long.valueOf(qu0Var.f1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= k6Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        lh.k6 k6Var2 = this.s;
        if (k6Var2.f > 0) {
            return true;
        }
        return k6Var2.m(messageObject.getId());
    }

    public final void N() {
        it0 it0Var;
        it0 it0Var2;
        it0 it0Var3;
        it0 it0Var4;
        lh.k6 k6Var = this.s;
        if (k6Var == null || this.h) {
            return;
        }
        qu0 qu0Var = this.B;
        boolean z10 = qu0Var.h1;
        it0[] it0VarArr = qu0Var.g0;
        int[] iArr = qu0Var.i1;
        if ((!z10 || (qu0Var.g1 && k6Var.g() > 1)) && this.s.g() > 0 && !qu0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (it0VarArr != null && (it0Var3 = it0VarArr[0]) != null && (it0Var4 = it0VarArr[1]) != null && it0Var3.h != null && it0Var4.h != null) {
                    qu0Var.m1(false);
                }
                qu0Var.g1 = iArr[1] == 1;
            } else if (qu0Var.g1) {
                qu0Var.g1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (it0VarArr != null && (it0Var = it0VarArr[0]) != null && (it0Var2 = it0VarArr[1]) != null && it0Var.h != null && it0Var2.h != null) {
                    qu0Var.m1(false);
                }
            }
            qu0Var.h1 = true;
        }
    }

    public final int O() {
        qu0 qu0Var = this.B;
        us0 us0Var = qu0Var.D;
        int[] iArr = qu0Var.i1;
        return this == us0Var ? iArr[0] : qu0.u(qu0Var, this) != -1 ? iArr[1] : qu0Var.m1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.ku0, f2.p0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.B.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.ku0, f2.p0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.ku0, f2.p0
    public final int k() {
        return h();
    }

    @Override // f2.p0
    public void l() {
        if (this.s != null) {
            qu0 qu0Var = this.B;
            if (qu0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(qu0Var.f1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.ku0, f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (this.s != null && n1Var.f == 19) {
            View view = n1Var.a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                p7Var.W = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    lh.r6 r6Var = (lh.r6) arrayList.get(i10);
                    p7Var.b0 = false;
                    if (r6Var.G == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = r6Var.a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = r6Var.f;
                        mu0 mu0Var = new mu0(this.s.c, tL_storyItem);
                        r6Var.G = mu0Var;
                        mu0Var.uploadingStory = r6Var;
                    }
                    p7Var.k(r6Var.G, O(), false);
                    p7Var.W = true;
                    p7Var.setReorder(false);
                    p7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    p7Var.b0 = false;
                    p7Var.k(null, O(), false);
                    p7Var.W = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.s.i.get(size);
                p7Var.b0 = messageObject != null && this.s.m(messageObject.getId());
                qu0 qu0Var = this.B;
                p7Var.setReorder(qu0Var.r0() || p7Var.b0);
                p7Var.h = qu0Var.t0();
                p7Var.k(messageObject, O(), false);
                if (!qu0Var.y1 || messageObject == null) {
                    p7Var.i(false, false);
                } else {
                    p7Var.i(qu0Var.V0[(messageObject.getDialogId() > qu0Var.f1 ? 1 : (messageObject.getDialogId() == qu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                p7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.ku0, f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        f2.n1 x4 = super.x(viewGroup, i10);
        View view = x4.a;
        if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).W = true;
        }
        return x4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(qu0 qu0Var, Context context, int i10, boolean z10) {
        super(qu0Var, context);
        TLRPC.User user;
        this.B = qu0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        long j10 = qu0Var.f1;
        int currentAccount = o2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(qu0Var.getStoriesHashtag())) {
            if (qu0Var.P1 == null) {
                qu0Var.P1 = new lh.e6(currentAccount, TextUtils.isEmpty(qu0Var.getStoriesHashtagUsername()) ? null : qu0Var.getStoriesHashtagUsername(), qu0Var.getStoriesHashtag());
            }
            this.s = qu0Var.P1;
        } else if (qu0Var.getStoriesArea() != null) {
            if (qu0Var.P1 == null) {
                qu0Var.P1 = new lh.e6(currentAccount, qu0Var.getStoriesArea());
            }
            this.s = qu0Var.P1;
        } else if ((!z10 || qu0Var.v0()) && (z10 || !qu0Var.q0())) {
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.s = o2Var.getMessagesController().getStoriesController().A(qu0Var.f1, 0, i10, true);
            } else {
                this.s = o2Var.getMessagesController().getStoriesController().A(qu0Var.f1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        lh.k6 k6Var = this.s;
        if (k6Var != null) {
            this.v = k6Var.o();
            this.w = new lu0(this, o2Var.getMessagesController().getStoriesController(), qu0Var.f1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.ku0
    public final int L(int i10) {
        return i10;
    }
}
