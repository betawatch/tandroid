package bi;

import ai.d9;
import ai.k9;
import ai.t8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ci.o8;
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
import org.telegram.ui.Components.xr0;
import s4.c1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public class t extends dl0 {
    public final Context c;
    public d9 e;
    public t f;
    public t7 h;
    public boolean r;
    public final /* synthetic */ u s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public t(u uVar, Context context) {
        this.s = uVar;
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
        d9 d9Var = this.e;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        t tVar = this.f;
        u uVar = this.s;
        int i10 = this == tVar ? uVar.e : uVar.d;
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
        xr0 xr0Var = this.s.W;
        d9 d9Var = this.e;
        if (d9Var == null) {
            return false;
        }
        if (d9Var instanceof t8) {
            TLRPC.User user = MessagesController.getInstance(xr0Var.b).getUser(Long.valueOf(xr0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= d9Var.i.size()) {
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
        d9 d9Var = this.e;
        boolean z10 = d9Var instanceof t8;
        u uVar = this.s;
        if (z10) {
            t8 t8Var = (t8) d9Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(uVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    k9 k9Var = (k9) E.get(i10);
                    o8 o8Var = k9Var.c;
                    if (o8Var != null && !o8Var.g && TextUtils.equals(o8Var.K0, t8Var.E)) {
                        arrayList.add(k9Var);
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

    @Override // s4.h0
    public final void v(c1 c1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof u7) {
            u7 u7Var = (u7) view;
            u7Var.d0 = true;
            u uVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                k9 k9Var = (k9) arrayList.get(i10);
                u7Var.f0 = false;
                if (k9Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = k9Var.a;
                    int i11 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = k9Var.f;
                    s sVar = new s(this.e.c, tL_storyItem);
                    k9Var.K = sVar;
                    sVar.uploadingStory = k9Var;
                }
                u7Var.k(k9Var.K, this == this.f ? uVar.e : uVar.d, false);
                u7Var.d0 = true;
                u7Var.setReorder(false);
                u7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                u7Var.f0 = false;
                u7Var.k(null, this == this.f ? uVar.e : uVar.d, false);
                u7Var.d0 = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            u7Var.f0 = messageObject != null && this.e.m(messageObject.getId());
            u7Var.setReorder(true);
            u7Var.k(messageObject, this == this.f ? uVar.e : uVar.d, false);
            xr0 xr0Var = uVar.W;
            if (!xr0Var.G.C1 || messageObject == null) {
                u7Var.i(false, false);
            } else {
                u7Var.i(xr0Var.c(messageObject), true);
            }
        }
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        xr0 xr0Var = this.s.W;
        if (this.h == null) {
            this.h = new t7(viewGroup.getContext(), xr0Var.c);
        }
        u7 u7Var = new u7(this.c, this.h, xr0Var.b);
        u7Var.w0 = true;
        u7Var.setGradientView(null);
        u7Var.d0 = true;
        return new fl0(u7Var);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void I() {
    }
}
