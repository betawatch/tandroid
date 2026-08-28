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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class bu0 extends yt0 {
    public boolean A;
    public final /* synthetic */ eu0 B;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public ih.n6 s;
    public final int v;
    public final zt0 w;
    public boolean x;
    public final ArrayList y;

    public bu0(eu0 eu0Var, Context context, boolean z10) {
        this(eu0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.yt0, org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.yt0, org.telegram.ui.Components.gk0
    public final String F(int i9) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ih.n6 n6Var = this.s;
        if (n6Var == null || i9 < 0 || i9 >= n6Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i9)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.yt0, org.telegram.ui.Components.gk0
    public final void I() {
        this.B.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i9) {
        ih.n6 n6Var;
        if (this.h || (n6Var = this.s) == null) {
            return false;
        }
        if (n6Var instanceof ih.f6) {
            eu0 eu0Var = this.B;
            TLRPC.User user = MessagesController.getInstance(eu0Var.r1.getCurrentAccount()).getUser(Long.valueOf(eu0Var.f1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i9 < 0 || i9 >= n6Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i9);
        ih.n6 n6Var2 = this.s;
        if (n6Var2.f > 0) {
            return true;
        }
        return n6Var2.m(messageObject.getId());
    }

    public final void N() {
        xs0 xs0Var;
        xs0 xs0Var2;
        xs0 xs0Var3;
        xs0 xs0Var4;
        ih.n6 n6Var = this.s;
        if (n6Var == null || this.h) {
            return;
        }
        eu0 eu0Var = this.B;
        boolean z10 = eu0Var.h1;
        xs0[] xs0VarArr = eu0Var.g0;
        int[] iArr = eu0Var.i1;
        if ((!z10 || (eu0Var.g1 && n6Var.g() > 1)) && this.s.g() > 0 && !eu0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (xs0VarArr != null && (xs0Var3 = xs0VarArr[0]) != null && (xs0Var4 = xs0VarArr[1]) != null && xs0Var3.h != null && xs0Var4.h != null) {
                    eu0Var.m1(false);
                }
                eu0Var.g1 = iArr[1] == 1;
            } else if (eu0Var.g1) {
                eu0Var.g1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (xs0VarArr != null && (xs0Var = xs0VarArr[0]) != null && (xs0Var2 = xs0VarArr[1]) != null && xs0Var.h != null && xs0Var2.h != null) {
                    eu0Var.m1(false);
                }
            }
            eu0Var.h1 = true;
        }
    }

    public final int O() {
        eu0 eu0Var = this.B;
        js0 js0Var = eu0Var.D;
        int[] iArr = eu0Var.i1;
        return this == js0Var ? iArr[0] : eu0.u(eu0Var, this) != -1 ? iArr[1] : eu0Var.m1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.yt0, f2.r0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.B.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.yt0, f2.r0
    public final int j(int i9) {
        return 19;
    }

    @Override // org.telegram.ui.Components.yt0, f2.r0
    public final int k() {
        return h();
    }

    @Override // f2.r0
    public void l() {
        if (this.s != null) {
            eu0 eu0Var = this.B;
            if (eu0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(eu0Var.f1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.yt0, f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (this.s != null && q1Var.f == 19) {
            View view = q1Var.a;
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                r7Var.W = true;
                ArrayList arrayList = this.r;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    ih.u6 u6Var = (ih.u6) arrayList.get(i9);
                    r7Var.b0 = false;
                    if (u6Var.G == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = u6Var.a;
                        int i10 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.id = i10;
                        tL_storyItem.attachPath = u6Var.f;
                        au0 au0Var = new au0(this.s.c, tL_storyItem);
                        u6Var.G = au0Var;
                        au0Var.uploadingStory = u6Var;
                    }
                    r7Var.k(u6Var.G, O(), false);
                    r7Var.W = true;
                    r7Var.setReorder(false);
                    r7Var.i(false, false);
                    return;
                }
                int size = i9 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    r7Var.b0 = false;
                    r7Var.k(null, O(), false);
                    r7Var.W = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.s.i.get(size);
                r7Var.b0 = messageObject != null && this.s.m(messageObject.getId());
                eu0 eu0Var = this.B;
                r7Var.setReorder(eu0Var.r0() || r7Var.b0);
                r7Var.h = eu0Var.t0();
                r7Var.k(messageObject, O(), false);
                if (!eu0Var.y1 || messageObject == null) {
                    r7Var.i(false, false);
                } else {
                    r7Var.i(eu0Var.V0[(messageObject.getDialogId() > eu0Var.f1 ? 1 : (messageObject.getDialogId() == eu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                r7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.yt0, f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        f2.q1 x10 = super.x(viewGroup, i9);
        View view = x10.a;
        if (view instanceof org.telegram.ui.Cells.r7) {
            ((org.telegram.ui.Cells.r7) view).W = true;
        }
        return x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu0(eu0 eu0Var, Context context, int i9, boolean z10) {
        super(eu0Var, context);
        TLRPC.User user;
        this.B = eu0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i9;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        long j10 = eu0Var.f1;
        int currentAccount = o2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(eu0Var.getStoriesHashtag())) {
            if (eu0Var.P1 == null) {
                eu0Var.P1 = new ih.h6(currentAccount, TextUtils.isEmpty(eu0Var.getStoriesHashtagUsername()) ? null : eu0Var.getStoriesHashtagUsername(), eu0Var.getStoriesHashtag());
            }
            this.s = eu0Var.P1;
        } else if (eu0Var.getStoriesArea() != null) {
            if (eu0Var.P1 == null) {
                eu0Var.P1 = new ih.h6(currentAccount, eu0Var.getStoriesArea());
            }
            this.s = eu0Var.P1;
        } else if ((!z10 || eu0Var.v0()) && (z10 || !eu0Var.q0())) {
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i9 > 0) {
                this.s = o2Var.getMessagesController().getStoriesController().A(eu0Var.f1, 0, i9, true);
            } else {
                this.s = o2Var.getMessagesController().getStoriesController().A(eu0Var.f1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        ih.n6 n6Var = this.s;
        if (n6Var != null) {
            this.v = n6Var.o();
            this.w = new zt0(this, o2Var.getMessagesController().getStoriesController(), eu0Var.f1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.yt0
    public final int L(int i9) {
        return i9;
    }
}
