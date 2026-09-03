package oh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.l1;
import java.util.ArrayList;
import nh.d6;
import nh.l6;
import nh.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.rl0;
import ph.t6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public class q extends bl0 {
    public final Context c;
    public l6 e;
    public q f;
    public p7 h;
    public boolean r;
    public final /* synthetic */ r s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public q(r rVar, Context context) {
        this.s = rVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(l1 l1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        l6 l6Var = this.e;
        if (l6Var == null || i10 < 0 || i10 >= l6Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.bl0
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        int measuredHeight = rl0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f;
        r rVar = this.s;
        int i10 = this == qVar ? rVar.e : rVar.d;
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = rl0Var.getMeasuredHeight() - rl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i10;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    public final boolean L(int i10) {
        nr0 nr0Var = this.s.T;
        l6 l6Var = this.e;
        if (l6Var == null) {
            return false;
        }
        if (l6Var instanceof d6) {
            TLRPC.User user = MessagesController.getInstance(nr0Var.b).getUser(Long.valueOf(nr0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= l6Var.i.size()) {
            return false;
        }
        return this.e.m(((MessageObject) this.e.i.get(i10)).getId());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        r rVar = this.s;
        if ((!rVar.F || (rVar.E && h() > 1)) && h() > 0) {
            if (h() < 5) {
                int max = Math.max(1, h());
                rVar.d = max;
                rVar.E = max == 1;
            } else if (rVar.E || rVar.d == 1) {
                rVar.E = false;
                rVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
            }
            rVar.h.y1(rVar.d);
            rVar.F = true;
        }
    }

    @Override // f2.o0
    public final int h() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 19;
    }

    @Override // f2.o0
    public final int k() {
        return h();
    }

    @Override // f2.o0
    public void l() {
        l6 l6Var = this.e;
        boolean z4 = l6Var instanceof d6;
        r rVar = this.s;
        if (z4) {
            d6 d6Var = (d6) l6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(rVar.T.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    s6 s6Var = (s6) E.get(i10);
                    t6 t6Var = s6Var.c;
                    if (t6Var != null && !t6Var.g && TextUtils.equals(t6Var.K0, d6Var.E)) {
                        arrayList.add(s6Var);
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

    @Override // f2.o0
    public final void v(l1 l1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = l1Var.a;
        if (view instanceof q7) {
            q7 q7Var = (q7) view;
            q7Var.a0 = true;
            r rVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                s6 s6Var = (s6) arrayList.get(i10);
                q7Var.c0 = false;
                if (s6Var.H == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = s6Var.a;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = s6Var.f;
                    p pVar = new p(this.e.c, tL_storyItem);
                    s6Var.H = pVar;
                    pVar.uploadingStory = s6Var;
                }
                q7Var.k(s6Var.H, this == this.f ? rVar.e : rVar.d, false);
                q7Var.a0 = true;
                q7Var.setReorder(false);
                q7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                q7Var.c0 = false;
                q7Var.k(null, this == this.f ? rVar.e : rVar.d, false);
                q7Var.a0 = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            q7Var.c0 = messageObject != null && this.e.m(messageObject.getId());
            q7Var.setReorder(true);
            q7Var.k(messageObject, this == this.f ? rVar.e : rVar.d, false);
            nr0 nr0Var = rVar.T;
            if (!nr0Var.D.z1 || messageObject == null) {
                q7Var.i(false, false);
            } else {
                q7Var.i(nr0Var.c(messageObject), true);
            }
        }
    }

    @Override // f2.o0
    public final l1 x(ViewGroup viewGroup, int i10) {
        nr0 nr0Var = this.s.T;
        if (this.h == null) {
            this.h = new p7(viewGroup.getContext(), nr0Var.c);
        }
        q7 q7Var = new q7(this.c, this.h, nr0Var.b);
        q7Var.t0 = true;
        q7Var.setGradientView(null);
        q7Var.a0 = true;
        return new dl0(q7Var);
    }

    @Override // org.telegram.ui.Components.bl0
    public final void I() {
    }
}
