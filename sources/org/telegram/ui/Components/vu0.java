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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class vu0 extends su0 {
    public boolean B;
    public final /* synthetic */ yu0 C;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public oh.l6 s;
    public final int v;
    public final tu0 w;
    public boolean x;
    public final ArrayList y;

    public vu0(yu0 yu0Var, Context context, boolean z4) {
        this(yu0Var, context, 0, z4);
    }

    @Override // org.telegram.ui.Components.su0, org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.su0, org.telegram.ui.Components.cl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        oh.l6 l6Var = this.s;
        if (l6Var == null || i10 < 0 || i10 >= l6Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.su0, org.telegram.ui.Components.cl0
    public final void I() {
        this.C.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        oh.l6 l6Var;
        if (this.h || (l6Var = this.s) == null) {
            return false;
        }
        if (l6Var instanceof oh.d6) {
            yu0 yu0Var = this.C;
            TLRPC.User user = MessagesController.getInstance(yu0Var.s1.getCurrentAccount()).getUser(Long.valueOf(yu0Var.g1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= l6Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        oh.l6 l6Var2 = this.s;
        if (l6Var2.f > 0) {
            return true;
        }
        return l6Var2.m(messageObject.getId());
    }

    public final void N() {
        qt0 qt0Var;
        qt0 qt0Var2;
        qt0 qt0Var3;
        qt0 qt0Var4;
        oh.l6 l6Var = this.s;
        if (l6Var == null || this.h) {
            return;
        }
        yu0 yu0Var = this.C;
        boolean z4 = yu0Var.i1;
        qt0[] qt0VarArr = yu0Var.h0;
        int[] iArr = yu0Var.j1;
        if ((!z4 || (yu0Var.h1 && l6Var.g() > 1)) && this.s.g() > 0 && !yu0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (qt0VarArr != null && (qt0Var3 = qt0VarArr[0]) != null && (qt0Var4 = qt0VarArr[1]) != null && qt0Var3.h != null && qt0Var4.h != null) {
                    yu0Var.m1(false);
                }
                yu0Var.h1 = iArr[1] == 1;
            } else if (yu0Var.h1) {
                yu0Var.h1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (qt0VarArr != null && (qt0Var = qt0VarArr[0]) != null && (qt0Var2 = qt0VarArr[1]) != null && qt0Var.h != null && qt0Var2.h != null) {
                    yu0Var.m1(false);
                }
            }
            yu0Var.i1 = true;
        }
    }

    public final int O() {
        yu0 yu0Var = this.C;
        ct0 ct0Var = yu0Var.E;
        int[] iArr = yu0Var.j1;
        return this == ct0Var ? iArr[0] : yu0.u(yu0Var, this) != -1 ? iArr[1] : yu0Var.n1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.su0, f2.p0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.C.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.su0, f2.p0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.su0, f2.p0
    public final int k() {
        return h();
    }

    @Override // f2.p0
    public void l() {
        if (this.s != null) {
            yu0 yu0Var = this.C;
            if (yu0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(yu0Var.g1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.su0, f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        if (this.s != null && m1Var.f == 19) {
            View view = m1Var.a;
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                r7Var.a0 = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    oh.s6 s6Var = (oh.s6) arrayList.get(i10);
                    r7Var.c0 = false;
                    if (s6Var.H == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = s6Var.a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = s6Var.f;
                        uu0 uu0Var = new uu0(this.s.c, tL_storyItem);
                        s6Var.H = uu0Var;
                        uu0Var.uploadingStory = s6Var;
                    }
                    r7Var.k(s6Var.H, O(), false);
                    r7Var.a0 = true;
                    r7Var.setReorder(false);
                    r7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    r7Var.c0 = false;
                    r7Var.k(null, O(), false);
                    r7Var.a0 = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.s.i.get(size);
                r7Var.c0 = messageObject != null && this.s.m(messageObject.getId());
                yu0 yu0Var = this.C;
                r7Var.setReorder(yu0Var.r0() || r7Var.c0);
                r7Var.h = yu0Var.t0();
                r7Var.k(messageObject, O(), false);
                if (!yu0Var.z1 || messageObject == null) {
                    r7Var.i(false, false);
                } else {
                    r7Var.i(yu0Var.W0[(messageObject.getDialogId() > yu0Var.g1 ? 1 : (messageObject.getDialogId() == yu0Var.g1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                r7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.su0, f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        f2.m1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.r7) {
            ((org.telegram.ui.Cells.r7) view).a0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu0(yu0 yu0Var, Context context, int i10, boolean z4) {
        super(yu0Var, context);
        TLRPC.User user;
        this.C = yu0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z4;
        this.n = i10;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        long j10 = yu0Var.g1;
        int currentAccount = p2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(yu0Var.getStoriesHashtag())) {
            if (yu0Var.Q1 == null) {
                yu0Var.Q1 = new oh.f6(currentAccount, TextUtils.isEmpty(yu0Var.getStoriesHashtagUsername()) ? null : yu0Var.getStoriesHashtagUsername(), yu0Var.getStoriesHashtag());
            }
            this.s = yu0Var.Q1;
        } else if (yu0Var.getStoriesArea() != null) {
            if (yu0Var.Q1 == null) {
                yu0Var.Q1 = new oh.f6(currentAccount, yu0Var.getStoriesArea());
            }
            this.s = yu0Var.Q1;
        } else if ((!z4 || yu0Var.v0()) && (z4 || !yu0Var.q0())) {
            boolean z10 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.s = p2Var.getMessagesController().getStoriesController().A(yu0Var.g1, 0, i10, true);
            } else {
                this.s = p2Var.getMessagesController().getStoriesController().A(yu0Var.g1, z10 ? 4 : z4 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        oh.l6 l6Var = this.s;
        if (l6Var != null) {
            this.v = l6Var.o();
            this.w = new tu0(this, p2Var.getMessagesController().getStoriesController(), yu0Var.g1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.su0
    public final int L(int i10) {
        return i10;
    }
}
