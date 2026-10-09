package bi;

import ai.e9;
import ai.l9;
import ai.v8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ci.l8;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.yl0;
import s4.d1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public class t extends yl0 {
    public final Context c;
    public e9 e;
    public t f;
    public s7 h;
    public boolean r;
    public final /* synthetic */ u s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public t(u uVar, Context context) {
        this.s = uVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        e9 e9Var = this.e;
        if (e9Var == null || i10 < 0 || i10 >= e9Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.yl0
    public final void G(qm0 qm0Var, float f7, int[] iArr) {
        int measuredHeight = qm0Var.getChildAt(0).getMeasuredHeight();
        t tVar = this.f;
        u uVar = this.s;
        int i10 = this == tVar ? uVar.e : uVar.d;
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = qm0Var.getMeasuredHeight() - qm0Var.getPaddingTop();
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
        qs0 qs0Var = this.s.W;
        e9 e9Var = this.e;
        if (e9Var == null) {
            return false;
        }
        if (e9Var instanceof v8) {
            TLRPC.User user = MessagesController.getInstance(qs0Var.b).getUser(Long.valueOf(qs0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= e9Var.i.size()) {
            return false;
        }
        return this.e.m(((MessageObject) this.e.i.get(i10)).getId());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        u uVar = this.s;
        if ((!uVar.I || (uVar.H && h() > 1)) && h() > 0) {
            if (h() < 5) {
                int max = Math.max(1, h());
                uVar.d = max;
                uVar.H = max == 1;
            } else if (uVar.H || uVar.d == 1) {
                uVar.H = false;
                uVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
            }
            uVar.h.y1(uVar.d);
            uVar.I = true;
        }
    }

    @Override // s4.i0
    public final int h() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // s4.i0
    public final int j(int i10) {
        return 19;
    }

    @Override // s4.i0
    public final int k() {
        return h();
    }

    @Override // s4.i0
    public void l() {
        e9 e9Var = this.e;
        boolean z10 = e9Var instanceof v8;
        u uVar = this.s;
        if (z10) {
            v8 v8Var = (v8) e9Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(uVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    l9 l9Var = (l9) E.get(i10);
                    l8 l8Var = l9Var.c;
                    if (l8Var != null && !l8Var.g && TextUtils.equals(l8Var.K0, v8Var.E)) {
                        arrayList.add(l9Var);
                    }
                }
            }
        }
        super.l();
        t tVar = this.f;
        if (tVar != null) {
            tVar.l();
        }
        if (this != uVar.w) {
            M();
            uVar.c();
        }
    }

    @Override // s4.i0
    public final void v(d1 d1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = d1Var.a;
        if (view instanceof t7) {
            t7 t7Var = (t7) view;
            t7Var.d0 = true;
            u uVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                l9 l9Var = (l9) arrayList.get(i10);
                t7Var.f0 = false;
                if (l9Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = l9Var.a;
                    int i11 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = l9Var.f;
                    s sVar = new s(this.e.c, tL_storyItem);
                    l9Var.K = sVar;
                    sVar.uploadingStory = l9Var;
                }
                t7Var.k(l9Var.K, this == this.f ? uVar.e : uVar.d, false);
                t7Var.d0 = true;
                t7Var.setReorder(false);
                t7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                t7Var.f0 = false;
                t7Var.k(null, this == this.f ? uVar.e : uVar.d, false);
                t7Var.d0 = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            t7Var.f0 = messageObject != null && this.e.m(messageObject.getId());
            t7Var.setReorder(true);
            t7Var.k(messageObject, this == this.f ? uVar.e : uVar.d, false);
            qs0 qs0Var = uVar.W;
            if (!qs0Var.G.C1 || messageObject == null) {
                t7Var.i(false, false);
            } else {
                t7Var.i(qs0Var.c(messageObject), true);
            }
        }
    }

    @Override // s4.i0
    public final d1 x(ViewGroup viewGroup, int i10) {
        qs0 qs0Var = this.s.W;
        if (this.h == null) {
            this.h = new s7(viewGroup.getContext(), qs0Var.c);
        }
        t7 t7Var = new t7(this.c, this.h, qs0Var.b);
        t7Var.w0 = true;
        t7Var.setGradientView(null);
        t7Var.d0 = true;
        return new am0(t7Var);
    }

    @Override // org.telegram.ui.Components.yl0
    public final void I() {
    }
}
