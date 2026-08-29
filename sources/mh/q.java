package mh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import lh.c6;
import lh.k6;
import lh.r6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class q extends tk0 {
    public final Context c;
    public k6 e;
    public q f;
    public o7 h;
    public boolean r;
    public final /* synthetic */ r s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public q(r rVar, Context context) {
        this.s = rVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        k6 k6Var = this.e;
        if (k6Var == null || i10 < 0 || i10 >= k6Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f;
        r rVar = this.s;
        int i10 = this == qVar ? rVar.e : rVar.d;
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = jl0Var.getMeasuredHeight() - jl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f9 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    public final boolean L(int i10) {
        fr0 fr0Var = this.s.S;
        k6 k6Var = this.e;
        if (k6Var == null) {
            return false;
        }
        if (k6Var instanceof c6) {
            TLRPC.User user = MessagesController.getInstance(fr0Var.b).getUser(Long.valueOf(fr0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= k6Var.i.size()) {
            return false;
        }
        return this.e.m(((MessageObject) this.e.i.get(i10)).getId());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        r rVar = this.s;
        if ((!rVar.E || (rVar.D && h() > 1)) && h() > 0) {
            if (h() < 5) {
                int max = Math.max(1, h());
                rVar.d = max;
                rVar.D = max == 1;
            } else if (rVar.D || rVar.d == 1) {
                rVar.D = false;
                rVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
            }
            rVar.h.y1(rVar.d);
            rVar.E = true;
        }
    }

    @Override // f2.p0
    public final int h() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 19;
    }

    @Override // f2.p0
    public final int k() {
        return h();
    }

    @Override // f2.p0
    public void l() {
        k6 k6Var = this.e;
        boolean z10 = k6Var instanceof c6;
        r rVar = this.s;
        if (z10) {
            c6 c6Var = (c6) k6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(rVar.S.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    r6 r6Var = (r6) E.get(i10);
                    nh.o7 o7Var = r6Var.c;
                    if (o7Var != null && !o7Var.g && TextUtils.equals(o7Var.K0, c6Var.E)) {
                        arrayList.add(r6Var);
                    }
                }
            }
        }
        super.l();
        q qVar = this.f;
        if (qVar != null) {
            qVar.l();
        }
        if (this != rVar.w) {
            M();
            rVar.c();
        }
    }

    @Override // f2.p0
    public final void v(n1 n1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = n1Var.a;
        if (view instanceof p7) {
            p7 p7Var = (p7) view;
            p7Var.W = true;
            r rVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                r6 r6Var = (r6) arrayList.get(i10);
                p7Var.b0 = false;
                if (r6Var.G == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = r6Var.a;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = r6Var.f;
                    p pVar = new p(this.e.c, tL_storyItem);
                    r6Var.G = pVar;
                    pVar.uploadingStory = r6Var;
                }
                p7Var.k(r6Var.G, this == this.f ? rVar.e : rVar.d, false);
                p7Var.W = true;
                p7Var.setReorder(false);
                p7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                p7Var.b0 = false;
                p7Var.k(null, this == this.f ? rVar.e : rVar.d, false);
                p7Var.W = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            p7Var.b0 = messageObject != null && this.e.m(messageObject.getId());
            p7Var.setReorder(true);
            p7Var.k(messageObject, this == this.f ? rVar.e : rVar.d, false);
            fr0 fr0Var = rVar.S;
            if (!fr0Var.C.y1 || messageObject == null) {
                p7Var.i(false, false);
            } else {
                p7Var.i(fr0Var.c(messageObject), true);
            }
        }
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        fr0 fr0Var = this.s.S;
        if (this.h == null) {
            this.h = new o7(viewGroup.getContext(), fr0Var.c);
        }
        p7 p7Var = new p7(this.c, this.h, fr0Var.b);
        p7Var.s0 = true;
        p7Var.setGradientView(null);
        p7Var.W = true;
        return new vk0(p7Var);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void I() {
    }
}
