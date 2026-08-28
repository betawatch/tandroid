package jh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.q1;
import ih.f6;
import ih.n6;
import ih.u6;
import java.util.ArrayList;
import kh.a8;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class p extends gk0 {
    public final Context c;
    public n6 e;
    public p f;
    public q7 h;
    public boolean r;
    public final /* synthetic */ q s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public p(q qVar, Context context) {
        this.s = qVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        n6 n6Var = this.e;
        if (n6Var == null || i9 < 0 || i9 >= n6Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i9)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
        p pVar = this.f;
        q qVar = this.s;
        int i9 = this == pVar ? qVar.e : qVar.d;
        int ceil = (int) (Math.ceil(h() / i9) * measuredHeight);
        int measuredHeight2 = wk0Var.getMeasuredHeight() - wk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i9;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    public final boolean L(int i9) {
        uq0 uq0Var = this.s.S;
        n6 n6Var = this.e;
        if (n6Var == null) {
            return false;
        }
        if (n6Var instanceof f6) {
            TLRPC.User user = MessagesController.getInstance(uq0Var.b).getUser(Long.valueOf(uq0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i9 < 0 || i9 >= n6Var.i.size()) {
            return false;
        }
        return this.e.m(((MessageObject) this.e.i.get(i9)).getId());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        q qVar = this.s;
        if ((!qVar.E || (qVar.D && h() > 1)) && h() > 0) {
            if (h() < 5) {
                int max = Math.max(1, h());
                qVar.d = max;
                qVar.D = max == 1;
            } else if (qVar.D || qVar.d == 1) {
                qVar.D = false;
                qVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
            }
            qVar.h.y1(qVar.d);
            qVar.E = true;
        }
    }

    @Override // f2.r0
    public final int h() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 19;
    }

    @Override // f2.r0
    public final int k() {
        return h();
    }

    @Override // f2.r0
    public void l() {
        n6 n6Var = this.e;
        boolean z10 = n6Var instanceof f6;
        q qVar = this.s;
        if (z10) {
            f6 f6Var = (f6) n6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(qVar.S.d);
            if (E != null) {
                for (int i9 = 0; i9 < E.size(); i9++) {
                    u6 u6Var = (u6) E.get(i9);
                    a8 a8Var = u6Var.c;
                    if (a8Var != null && !a8Var.g && TextUtils.equals(a8Var.K0, f6Var.E)) {
                        arrayList.add(u6Var);
                    }
                }
            }
        }
        super.l();
        p pVar = this.f;
        if (pVar != null) {
            pVar.l();
        }
        if (this != qVar.w) {
            M();
            qVar.c();
        }
    }

    @Override // f2.r0
    public final void v(q1 q1Var, int i9) {
        if (this.e == null) {
            return;
        }
        View view = q1Var.a;
        if (view instanceof r7) {
            r7 r7Var = (r7) view;
            r7Var.W = true;
            q qVar = this.s;
            ArrayList arrayList = this.d;
            if (i9 >= 0 && i9 < arrayList.size()) {
                u6 u6Var = (u6) arrayList.get(i9);
                r7Var.b0 = false;
                if (u6Var.G == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = u6Var.a;
                    int i10 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i10;
                    tL_storyItem.id = i10;
                    tL_storyItem.attachPath = u6Var.f;
                    o oVar = new o(this.e.c, tL_storyItem);
                    u6Var.G = oVar;
                    oVar.uploadingStory = u6Var;
                }
                r7Var.k(u6Var.G, this == this.f ? qVar.e : qVar.d, false);
                r7Var.W = true;
                r7Var.setReorder(false);
                r7Var.i(false, false);
                return;
            }
            int size = i9 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                r7Var.b0 = false;
                r7Var.k(null, this == this.f ? qVar.e : qVar.d, false);
                r7Var.W = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            r7Var.b0 = messageObject != null && this.e.m(messageObject.getId());
            r7Var.setReorder(true);
            r7Var.k(messageObject, this == this.f ? qVar.e : qVar.d, false);
            uq0 uq0Var = qVar.S;
            if (!uq0Var.C.y1 || messageObject == null) {
                r7Var.i(false, false);
            } else {
                r7Var.i(uq0Var.c(messageObject), true);
            }
        }
    }

    @Override // f2.r0
    public final q1 x(ViewGroup viewGroup, int i9) {
        uq0 uq0Var = this.s.S;
        if (this.h == null) {
            this.h = new q7(viewGroup.getContext(), uq0Var.c);
        }
        r7 r7Var = new r7(this.c, this.h, uq0Var.b);
        r7Var.s0 = true;
        r7Var.setGradientView(null);
        r7Var.W = true;
        return new ik0(r7Var);
    }

    @Override // org.telegram.ui.Components.gk0
    public final void I() {
    }
}
