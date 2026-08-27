package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.o1;
import java.util.ArrayList;
import jh.b6;
import jh.j6;
import jh.r6;
import lh.z7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public class q extends jk0 {
    public final Context c;
    public j6 e;
    public q f;
    public n7 h;
    public boolean r;
    public final /* synthetic */ r s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public q(r rVar, Context context) {
        this.s = rVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(o1 o1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.jk0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        j6 j6Var = this.e;
        if (j6Var == null || i10 < 0 || i10 >= j6Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.jk0
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        q qVar = this.f;
        r rVar = this.s;
        int i10 = this == qVar ? rVar.e : rVar.d;
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop();
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
        vq0 vq0Var = this.s.S;
        j6 j6Var = this.e;
        if (j6Var == null) {
            return false;
        }
        if (j6Var instanceof b6) {
            TLRPC.User user = MessagesController.getInstance(vq0Var.b).getUser(Long.valueOf(vq0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= j6Var.i.size()) {
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

    @Override // f2.q0
    public final int h() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 19;
    }

    @Override // f2.q0
    public final int k() {
        return h();
    }

    @Override // f2.q0
    public void l() {
        j6 j6Var = this.e;
        boolean z10 = j6Var instanceof b6;
        r rVar = this.s;
        if (z10) {
            b6 b6Var = (b6) j6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(rVar.S.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    r6 r6Var = (r6) E.get(i10);
                    z7 z7Var = r6Var.c;
                    if (z7Var != null && !z7Var.g && TextUtils.equals(z7Var.K0, b6Var.E)) {
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

    @Override // f2.q0
    public final void v(o1 o1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = o1Var.a;
        if (view instanceof o7) {
            o7 o7Var = (o7) view;
            o7Var.W = true;
            r rVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                r6 r6Var = (r6) arrayList.get(i10);
                o7Var.b0 = false;
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
                o7Var.k(r6Var.G, this == this.f ? rVar.e : rVar.d, false);
                o7Var.W = true;
                o7Var.setReorder(false);
                o7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                o7Var.b0 = false;
                o7Var.k(null, this == this.f ? rVar.e : rVar.d, false);
                o7Var.W = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            o7Var.b0 = messageObject != null && this.e.m(messageObject.getId());
            o7Var.setReorder(true);
            o7Var.k(messageObject, this == this.f ? rVar.e : rVar.d, false);
            vq0 vq0Var = rVar.S;
            if (!vq0Var.C.y1 || messageObject == null) {
                o7Var.i(false, false);
            } else {
                o7Var.i(vq0Var.c(messageObject), true);
            }
        }
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        vq0 vq0Var = this.s.S;
        if (this.h == null) {
            this.h = new n7(viewGroup.getContext(), vq0Var.c);
        }
        o7 o7Var = new o7(this.c, this.h, vq0Var.b);
        o7Var.s0 = true;
        o7Var.setGradientView(null);
        o7Var.W = true;
        return new lk0(o7Var);
    }

    @Override // org.telegram.ui.Components.jk0
    public final void I() {
    }
}
