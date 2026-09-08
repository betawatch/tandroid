package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bi.b8;
import bi.l8;
import bi.t8;
import di.o8;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk0;
import s4.c1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public class s extends tk0 {
    public final Context c;
    public l8 e;
    public s f;
    public s7 h;
    public boolean r;
    public final /* synthetic */ t s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public s(t tVar, Context context) {
        this.s = tVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        l8 l8Var = this.e;
        if (l8Var == null || i10 < 0 || i10 >= l8Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        s sVar = this.f;
        t tVar = this.s;
        int i10 = this == sVar ? tVar.e : tVar.d;
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop();
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
        lr0 lr0Var = this.s.W;
        l8 l8Var = this.e;
        if (l8Var == null) {
            return false;
        }
        if (l8Var instanceof b8) {
            TLRPC.User user = MessagesController.getInstance(lr0Var.b).getUser(Long.valueOf(lr0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= l8Var.i.size()) {
            return false;
        }
        return this.e.m(((MessageObject) this.e.i.get(i10)).getId());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        t tVar = this.s;
        if ((!tVar.I || (tVar.H && h() > 1)) && h() > 0) {
            if (h() < 5) {
                int max = Math.max(1, h());
                tVar.d = max;
                tVar.H = max == 1;
            } else if (tVar.H || tVar.d == 1) {
                tVar.H = false;
                tVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
            }
            tVar.h.y1(tVar.d);
            tVar.I = true;
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
        l8 l8Var = this.e;
        boolean z10 = l8Var instanceof b8;
        t tVar = this.s;
        if (z10) {
            b8 b8Var = (b8) l8Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(tVar.W.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    t8 t8Var = (t8) E.get(i10);
                    o8 o8Var = t8Var.c;
                    if (o8Var != null && !o8Var.g && TextUtils.equals(o8Var.K0, b8Var.E)) {
                        arrayList.add(t8Var);
                    }
                }
            }
        }
        super.l();
        s sVar = this.f;
        if (sVar != null) {
            sVar.l();
        }
        if (this != tVar.w) {
            M();
            tVar.c();
        }
    }

    @Override // s4.h0
    public final void v(c1 c1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof t7) {
            t7 t7Var = (t7) view;
            t7Var.d0 = true;
            t tVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                t8 t8Var = (t8) arrayList.get(i10);
                t7Var.f0 = false;
                if (t8Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = t8Var.a;
                    int i11 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = t8Var.f;
                    r rVar = new r(this.e.c, tL_storyItem);
                    t8Var.K = rVar;
                    rVar.uploadingStory = t8Var;
                }
                t7Var.k(t8Var.K, this == this.f ? tVar.e : tVar.d, false);
                t7Var.d0 = true;
                t7Var.setReorder(false);
                t7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                t7Var.f0 = false;
                t7Var.k(null, this == this.f ? tVar.e : tVar.d, false);
                t7Var.d0 = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            t7Var.f0 = messageObject != null && this.e.m(messageObject.getId());
            t7Var.setReorder(true);
            t7Var.k(messageObject, this == this.f ? tVar.e : tVar.d, false);
            lr0 lr0Var = tVar.W;
            if (!lr0Var.G.C1 || messageObject == null) {
                t7Var.i(false, false);
            } else {
                t7Var.i(lr0Var.c(messageObject), true);
            }
        }
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        lr0 lr0Var = this.s.W;
        if (this.h == null) {
            this.h = new s7(viewGroup.getContext(), lr0Var.c);
        }
        t7 t7Var = new t7(this.c, this.h, lr0Var.b);
        t7Var.w0 = true;
        t7Var.setGradientView(null);
        t7Var.d0 = true;
        return new vk0(t7Var);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void I() {
    }
}
