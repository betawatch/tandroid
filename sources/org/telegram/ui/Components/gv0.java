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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public class gv0 extends dv0 {
    public boolean E;
    public final /* synthetic */ jv0 F;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ai.d9 s;
    public final int v;
    public final ev0 w;
    public boolean x;
    public final ArrayList y;

    public gv0(jv0 jv0Var, Context context, boolean z10) {
        this(jv0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.dv0, org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.dv0, org.telegram.ui.Components.el0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.dv0, org.telegram.ui.Components.el0
    public final void I() {
        this.F.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        ai.d9 d9Var;
        if (this.h || (d9Var = this.s) == null) {
            return false;
        }
        if (d9Var instanceof ai.u8) {
            jv0 jv0Var = this.F;
            TLRPC.User user = MessagesController.getInstance(jv0Var.v1.getCurrentAccount()).getUser(Long.valueOf(jv0Var.j1));
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
        cu0 cu0Var;
        cu0 cu0Var2;
        cu0 cu0Var3;
        cu0 cu0Var4;
        ai.d9 d9Var = this.s;
        if (d9Var == null || this.h) {
            return;
        }
        jv0 jv0Var = this.F;
        boolean z10 = jv0Var.l1;
        cu0[] cu0VarArr = jv0Var.k0;
        int[] iArr = jv0Var.m1;
        if ((!z10 || (jv0Var.k1 && d9Var.g() > 1)) && this.s.g() > 0 && !jv0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (cu0VarArr != null && (cu0Var3 = cu0VarArr[0]) != null && (cu0Var4 = cu0VarArr[1]) != null && cu0Var3.h != null && cu0Var4.h != null) {
                    jv0Var.m1(false);
                }
                jv0Var.k1 = iArr[1] == 1;
            } else if (jv0Var.k1) {
                jv0Var.k1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (cu0VarArr != null && (cu0Var = cu0VarArr[0]) != null && (cu0Var2 = cu0VarArr[1]) != null && cu0Var.h != null && cu0Var2.h != null) {
                    jv0Var.m1(false);
                }
            }
            jv0Var.l1 = true;
        }
    }

    public final int O() {
        jv0 jv0Var = this.F;
        ot0 ot0Var = jv0Var.H;
        int[] iArr = jv0Var.m1;
        return this == ot0Var ? iArr[0] : jv0.u(jv0Var, this) != -1 ? iArr[1] : jv0Var.q1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.dv0, s4.h0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.F.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.dv0, s4.h0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.dv0, s4.h0
    public final int k() {
        return h();
    }

    @Override // s4.h0
    public void l() {
        if (this.s != null) {
            jv0 jv0Var = this.F;
            if (jv0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(jv0Var.j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.dv0, s4.h0
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
                        fv0 fv0Var = new fv0(this.s.c, tL_storyItem);
                        k9Var.K = fv0Var;
                        fv0Var.uploadingStory = k9Var;
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
                jv0 jv0Var = this.F;
                t7Var.setReorder(jv0Var.r0() || t7Var.f0);
                t7Var.h = jv0Var.t0();
                t7Var.k(messageObject, O(), false);
                if (!jv0Var.C1 || messageObject == null) {
                    t7Var.i(false, false);
                } else {
                    t7Var.i(jv0Var.Z0[(messageObject.getDialogId() > jv0Var.j1 ? 1 : (messageObject.getDialogId() == jv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                t7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.dv0, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).d0 = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(jv0 jv0Var, Context context, int i10, boolean z10) {
        super(jv0Var, context);
        TLRPC.User user;
        this.F = jv0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
        long j3 = jv0Var.j1;
        int currentAccount = m2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(jv0Var.getStoriesHashtag())) {
            if (jv0Var.T1 == null) {
                jv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(jv0Var.getStoriesHashtagUsername()) ? null : jv0Var.getStoriesHashtagUsername(), jv0Var.getStoriesHashtag());
            }
            this.s = jv0Var.T1;
        } else if (jv0Var.getStoriesArea() != null) {
            if (jv0Var.T1 == null) {
                jv0Var.T1 = new ai.v8(currentAccount, jv0Var.getStoriesArea());
            }
            this.s = jv0Var.T1;
        } else if ((!z10 || jv0Var.v0()) && (z10 || !jv0Var.q0())) {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.s = m2Var.getMessagesController().getStoriesController().A(jv0Var.j1, 0, i10, true);
            } else {
                this.s = m2Var.getMessagesController().getStoriesController().A(jv0Var.j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        ai.d9 d9Var = this.s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.w = new ev0(this, m2Var.getMessagesController().getStoriesController(), jv0Var.j1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.dv0
    public final int L(int i10) {
        return i10;
    }
}
