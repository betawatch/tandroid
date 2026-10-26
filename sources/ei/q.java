package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import di.g7;
import di.s6;
import di.z6;
import fi.w7;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.vl0;
import s4.e1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class q extends tl0 {
    public final Context c;
    public z6 e;
    public q f;
    public v7 h;
    public boolean r;
    public final /* synthetic */ r s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public q(r rVar, Context context) {
        this.s = rVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        z6 z6Var = this.e;
        if (z6Var == null || i10 < 0 || i10 >= z6Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.tl0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f;
        r rVar = this.s;
        int i10 = this == qVar ? rVar.e : rVar.d;
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    public final boolean L(int i10) {
        us0 us0Var = this.s.W;
        z6 z6Var = this.e;
        if (z6Var == null) {
            return false;
        }
        if (z6Var instanceof s6) {
            TLRPC.User user = MessagesController.getInstance(us0Var.b).getUser(Long.valueOf(us0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= z6Var.i.size()) {
            return false;
        }
        return this.e.m(((MessageObject) this.e.i.get(i10)).getId());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        r rVar = this.s;
        if ((!rVar.I || (rVar.H && h() > 1)) && h() > 0) {
            if (h() < 5) {
                int max = Math.max(1, h());
                rVar.d = max;
                rVar.H = max == 1;
            } else if (rVar.H || rVar.d == 1) {
                rVar.H = false;
                rVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
            }
            rVar.h.z1(rVar.d);
            rVar.I = true;
        }
    }

    @Override // s4.h0
    public final int h() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 19;
    }

    @Override // s4.h0
    public final int k() {
        return h();
    }

    @Override // s4.h0
    public void l() {
        z6 z6Var = this.e;
        boolean z10 = z6Var instanceof s6;
        r rVar = this.s;
        if (z10) {
            s6 s6Var = (s6) z6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(rVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    g7 g7Var = (g7) E.get(i10);
                    w7 w7Var = g7Var.c;
                    if (w7Var != null && !w7Var.g && TextUtils.equals(w7Var.K0, s6Var.E)) {
                        arrayList.add(g7Var);
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

    @Override // s4.h0
    public final void v(e1 e1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.w7) {
            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
            w7Var.d0 = true;
            r rVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                g7 g7Var = (g7) arrayList.get(i10);
                w7Var.f0 = false;
                if (g7Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = g7Var.a;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = g7Var.f;
                    p pVar = new p(this.e.c, tL_storyItem);
                    g7Var.K = pVar;
                    pVar.uploadingStory = g7Var;
                }
                w7Var.k(g7Var.K, this == this.f ? rVar.e : rVar.d, false);
                w7Var.d0 = true;
                w7Var.setReorder(false);
                w7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                w7Var.f0 = false;
                w7Var.k(null, this == this.f ? rVar.e : rVar.d, false);
                w7Var.d0 = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            w7Var.f0 = messageObject != null && this.e.m(messageObject.getId());
            w7Var.setReorder(true);
            w7Var.k(messageObject, this == this.f ? rVar.e : rVar.d, false);
            us0 us0Var = rVar.W;
            if (!us0Var.G.E1 || messageObject == null) {
                w7Var.i(false, false);
            } else {
                w7Var.i(us0Var.c(messageObject), true);
            }
        }
    }

    @Override // s4.h0
    public final e1 x(ViewGroup viewGroup, int i10) {
        us0 us0Var = this.s.W;
        if (this.h == null) {
            this.h = new v7(viewGroup.getContext(), us0Var.c);
        }
        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(this.c, this.h, us0Var.b);
        w7Var.w0 = true;
        w7Var.setGradientView(null);
        w7Var.d0 = true;
        return new vl0(w7Var);
    }

    @Override // org.telegram.ui.Components.tl0
    public final void I() {
    }
}
