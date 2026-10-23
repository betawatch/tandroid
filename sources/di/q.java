package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ci.a7;
import ci.h7;
import ci.t6;
import ei.a8;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.tl0;
import s4.b1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public class q extends rl0 {
    public final Context c;
    public a7 e;
    public q f;
    public r7 h;
    public boolean r;
    public final /* synthetic */ r s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public q(r rVar, Context context) {
        this.s = rVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(b1 b1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.rl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        a7 a7Var = this.e;
        if (a7Var == null || i10 < 0 || i10 >= a7Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.rl0
    public final void G(jm0 jm0Var, float f7, int[] iArr) {
        int measuredHeight = jm0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f;
        r rVar = this.s;
        int i10 = this == qVar ? rVar.e : rVar.d;
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = jm0Var.getMeasuredHeight() - jm0Var.getPaddingTop();
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
        js0 js0Var = this.s.W;
        a7 a7Var = this.e;
        if (a7Var == null) {
            return false;
        }
        if (a7Var instanceof t6) {
            TLRPC.User user = MessagesController.getInstance(js0Var.b).getUser(Long.valueOf(js0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= a7Var.i.size()) {
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
            rVar.h.y1(rVar.d);
            rVar.I = true;
        }
    }

    @Override // s4.g0
    public final int h() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 19;
    }

    @Override // s4.g0
    public final int k() {
        return h();
    }

    @Override // s4.g0
    public void l() {
        a7 a7Var = this.e;
        boolean z10 = a7Var instanceof t6;
        r rVar = this.s;
        if (z10) {
            t6 t6Var = (t6) a7Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(rVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    h7 h7Var = (h7) E.get(i10);
                    a8 a8Var = h7Var.c;
                    if (a8Var != null && !a8Var.g && TextUtils.equals(a8Var.K0, t6Var.E)) {
                        arrayList.add(h7Var);
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

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = b1Var.a;
        if (view instanceof s7) {
            s7 s7Var = (s7) view;
            s7Var.d0 = true;
            r rVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                h7 h7Var = (h7) arrayList.get(i10);
                s7Var.f0 = false;
                if (h7Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = h7Var.a;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = h7Var.f;
                    p pVar = new p(this.e.c, tL_storyItem);
                    h7Var.K = pVar;
                    pVar.uploadingStory = h7Var;
                }
                s7Var.k(h7Var.K, this == this.f ? rVar.e : rVar.d, false);
                s7Var.d0 = true;
                s7Var.setReorder(false);
                s7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                s7Var.f0 = false;
                s7Var.k(null, this == this.f ? rVar.e : rVar.d, false);
                s7Var.d0 = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            s7Var.f0 = messageObject != null && this.e.m(messageObject.getId());
            s7Var.setReorder(true);
            s7Var.k(messageObject, this == this.f ? rVar.e : rVar.d, false);
            js0 js0Var = rVar.W;
            if (!js0Var.G.C1 || messageObject == null) {
                s7Var.i(false, false);
            } else {
                s7Var.i(js0Var.c(messageObject), true);
            }
        }
    }

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        js0 js0Var = this.s.W;
        if (this.h == null) {
            this.h = new r7(viewGroup.getContext(), js0Var.c);
        }
        s7 s7Var = new s7(this.c, this.h, js0Var.b);
        s7Var.w0 = true;
        s7Var.setGradientView(null);
        s7Var.d0 = true;
        return new tl0(s7Var);
    }

    @Override // org.telegram.ui.Components.rl0
    public final void I() {
    }
}
