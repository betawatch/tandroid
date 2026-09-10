package ai;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bi.r9;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vr0;
import s4.c1;
import zh.a5;
import zh.h5;
import zh.s4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public class z extends dl0 {
    public final Context c;
    public a5 e;
    public z f;
    public t7 h;
    public boolean r;
    public final /* synthetic */ a0 s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public z(a0 a0Var, Context context) {
        this.s = a0Var;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        a5 a5Var = this.e;
        if (a5Var == null || i10 < 0 || i10 >= a5Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        z zVar = this.f;
        a0 a0Var = this.s;
        int i10 = this == zVar ? a0Var.e : a0Var.d;
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop();
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
        vr0 vr0Var = this.s.W;
        a5 a5Var = this.e;
        if (a5Var == null) {
            return false;
        }
        if (a5Var instanceof s4) {
            TLRPC.User user = MessagesController.getInstance(vr0Var.b).getUser(Long.valueOf(vr0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= a5Var.i.size()) {
            return false;
        }
        return this.e.m(((MessageObject) this.e.i.get(i10)).getId());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        a0 a0Var = this.s;
        if ((!a0Var.I || (a0Var.H && h() > 1)) && h() > 0) {
            if (h() < 5) {
                int max = Math.max(1, h());
                a0Var.d = max;
                a0Var.H = max == 1;
            } else if (a0Var.H || a0Var.d == 1) {
                a0Var.H = false;
                a0Var.d = Math.max(2, SharedConfig.storiesColumnsCount);
            }
            a0Var.h.y1(a0Var.d);
            a0Var.I = true;
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
        a5 a5Var = this.e;
        boolean z10 = a5Var instanceof s4;
        a0 a0Var = this.s;
        if (z10) {
            s4 s4Var = (s4) a5Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(a0Var.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    h5 h5Var = (h5) E.get(i10);
                    r9 r9Var = h5Var.c;
                    if (r9Var != null && !r9Var.g && TextUtils.equals(r9Var.K0, s4Var.E)) {
                        arrayList.add(h5Var);
                    }
                }
            }
        }
        super.l();
        z zVar = this.f;
        if (zVar != null) {
            zVar.l();
        }
        if (this != a0Var.w) {
            M();
            a0Var.c();
        }
    }

    @Override // s4.h0
    public final void v(c1 c1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof u7) {
            u7 u7Var = (u7) view;
            u7Var.d0 = true;
            a0 a0Var = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                h5 h5Var = (h5) arrayList.get(i10);
                u7Var.f0 = false;
                if (h5Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = h5Var.a;
                    int i11 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = h5Var.f;
                    y yVar = new y(this.e.c, tL_storyItem);
                    h5Var.K = yVar;
                    yVar.uploadingStory = h5Var;
                }
                u7Var.k(h5Var.K, this == this.f ? a0Var.e : a0Var.d, false);
                u7Var.d0 = true;
                u7Var.setReorder(false);
                u7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                u7Var.f0 = false;
                u7Var.k(null, this == this.f ? a0Var.e : a0Var.d, false);
                u7Var.d0 = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            u7Var.f0 = messageObject != null && this.e.m(messageObject.getId());
            u7Var.setReorder(true);
            u7Var.k(messageObject, this == this.f ? a0Var.e : a0Var.d, false);
            vr0 vr0Var = a0Var.W;
            if (!vr0Var.G.C1 || messageObject == null) {
                u7Var.i(false, false);
            } else {
                u7Var.i(vr0Var.c(messageObject), true);
            }
        }
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        vr0 vr0Var = this.s.W;
        if (this.h == null) {
            this.h = new t7(viewGroup.getContext(), vr0Var.c);
        }
        u7 u7Var = new u7(this.c, this.h, vr0Var.b);
        u7Var.w0 = true;
        u7Var.setGradientView(null);
        u7Var.d0 = true;
        return new fl0(u7Var);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void I() {
    }
}
