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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class eu0 extends bu0 {
    public boolean A;
    public final /* synthetic */ hu0 B;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public jh.j6 s;
    public final int v;
    public final cu0 w;
    public boolean x;
    public final ArrayList y;

    public eu0(hu0 hu0Var, Context context, boolean z10) {
        this(hu0Var, context, 0, z10);
    }

    @Override // org.telegram.ui.Components.bu0, org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.bu0, org.telegram.ui.Components.jk0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        jh.j6 j6Var = this.s;
        if (j6Var == null || i10 < 0 || i10 >= j6Var.i.size() || (messageObject = (MessageObject) this.s.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.bu0, org.telegram.ui.Components.jk0
    public final void I() {
        this.B.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        jh.j6 j6Var;
        if (this.h || (j6Var = this.s) == null) {
            return false;
        }
        if (j6Var instanceof jh.b6) {
            hu0 hu0Var = this.B;
            TLRPC.User user = MessagesController.getInstance(hu0Var.r1.getCurrentAccount()).getUser(Long.valueOf(hu0Var.f1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= j6Var.i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.s.i.get(i10);
        jh.j6 j6Var2 = this.s;
        if (j6Var2.f > 0) {
            return true;
        }
        return j6Var2.m(messageObject.getId());
    }

    public final void N() {
        zs0 zs0Var;
        zs0 zs0Var2;
        zs0 zs0Var3;
        zs0 zs0Var4;
        jh.j6 j6Var = this.s;
        if (j6Var == null || this.h) {
            return;
        }
        hu0 hu0Var = this.B;
        boolean z10 = hu0Var.h1;
        zs0[] zs0VarArr = hu0Var.g0;
        int[] iArr = hu0Var.i1;
        if ((!z10 || (hu0Var.g1 && j6Var.g() > 1)) && this.s.g() > 0 && !hu0Var.v0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (zs0VarArr != null && (zs0Var3 = zs0VarArr[0]) != null && (zs0Var4 = zs0VarArr[1]) != null && zs0Var3.h != null && zs0Var4.h != null) {
                    hu0Var.m1(false);
                }
                hu0Var.g1 = iArr[1] == 1;
            } else if (hu0Var.g1) {
                hu0Var.g1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (zs0VarArr != null && (zs0Var = zs0VarArr[0]) != null && (zs0Var2 = zs0VarArr[1]) != null && zs0Var.h != null && zs0Var2.h != null) {
                    hu0Var.m1(false);
                }
            }
            hu0Var.h1 = true;
        }
    }

    public final int O() {
        hu0 hu0Var = this.B;
        ls0 ls0Var = hu0Var.D;
        int[] iArr = hu0Var.i1;
        return this == ls0Var ? iArr[0] : hu0.u(hu0Var, this) != -1 ? iArr[1] : hu0Var.m1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // org.telegram.ui.Components.bu0, f2.q0
    public final int h() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.B.i0()) ? 0 : this.s.g());
    }

    @Override // org.telegram.ui.Components.bu0, f2.q0
    public final int j(int i10) {
        return 19;
    }

    @Override // org.telegram.ui.Components.bu0, f2.q0
    public final int k() {
        return h();
    }

    @Override // f2.q0
    public void l() {
        if (this.s != null) {
            hu0 hu0Var = this.B;
            if (hu0Var.r0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.s.c).getStoriesController().E(hu0Var.f1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override // org.telegram.ui.Components.bu0, f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (this.s != null && o1Var.f == 19) {
            View view = o1Var.a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                o7Var.W = true;
                ArrayList arrayList = this.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    jh.r6 r6Var = (jh.r6) arrayList.get(i10);
                    o7Var.b0 = false;
                    if (r6Var.G == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = r6Var.a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.id = i11;
                        tL_storyItem.attachPath = r6Var.f;
                        du0 du0Var = new du0(this.s.c, tL_storyItem);
                        r6Var.G = du0Var;
                        du0Var.uploadingStory = r6Var;
                    }
                    o7Var.k(r6Var.G, O(), false);
                    o7Var.W = true;
                    o7Var.setReorder(false);
                    o7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    o7Var.b0 = false;
                    o7Var.k(null, O(), false);
                    o7Var.W = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.s.i.get(size);
                o7Var.b0 = messageObject != null && this.s.m(messageObject.getId());
                hu0 hu0Var = this.B;
                o7Var.setReorder(hu0Var.r0() || o7Var.b0);
                o7Var.h = hu0Var.t0();
                o7Var.k(messageObject, O(), false);
                if (!hu0Var.y1 || messageObject == null) {
                    o7Var.i(false, false);
                } else {
                    o7Var.i(hu0Var.V0[(messageObject.getDialogId() > hu0Var.f1 ? 1 : (messageObject.getDialogId() == hu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                o7Var.l(this.x, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.bu0, f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        f2.o1 x8 = super.x(viewGroup, i10);
        View view = x8.a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).W = true;
        }
        return x8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu0(hu0 hu0Var, Context context, int i10, boolean z10) {
        super(hu0Var, context);
        TLRPC.User user;
        this.B = hu0Var;
        this.r = new ArrayList();
        this.y = new ArrayList();
        this.h = z10;
        this.n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
        long j10 = hu0Var.f1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(hu0Var.getStoriesHashtag())) {
            if (hu0Var.P1 == null) {
                hu0Var.P1 = new jh.d6(currentAccount, TextUtils.isEmpty(hu0Var.getStoriesHashtagUsername()) ? null : hu0Var.getStoriesHashtagUsername(), hu0Var.getStoriesHashtag());
            }
            this.s = hu0Var.P1;
        } else if (hu0Var.getStoriesArea() != null) {
            if (hu0Var.P1 == null) {
                hu0Var.P1 = new jh.d6(currentAccount, hu0Var.getStoriesArea());
            }
            this.s = hu0Var.P1;
        } else if ((!z10 || hu0Var.v0()) && (z10 || !hu0Var.q0())) {
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.s = n2Var.getMessagesController().getStoriesController().A(hu0Var.f1, 0, i10, true);
            } else {
                this.s = n2Var.getMessagesController().getStoriesController().A(hu0Var.f1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.s = null;
        }
        jh.j6 j6Var = this.s;
        if (j6Var != null) {
            this.v = j6Var.o();
            this.w = new cu0(this, n2Var.getMessagesController().getStoriesController(), hu0Var.f1, this.s.c);
        }
        N();
    }

    @Override // org.telegram.ui.Components.bu0
    public final int L(int i10) {
        return i10;
    }
}
