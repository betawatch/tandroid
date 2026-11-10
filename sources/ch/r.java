package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.t5;
import c8.j9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.dj;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.wq;
import org.telegram.ui.cj;
import org.telegram.ui.cn;
import org.telegram.ui.nj;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final int[] D;
    public final cn a;
    public q b;
    public List c;
    public boolean d;
    public ij e;
    public final int f;
    public final int h;
    public float n;
    public float r;
    public float s;
    public long w;
    public boolean x;
    public boolean y;

    public r(cn cnVar, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = 22;
        this.h = 24;
        this.D = new int[2];
        setVisibility(8);
        this.a = cnVar;
        setClipToPadding(false);
        setClipChildren(false);
        cnVar.z0.j(new ai.b(this, 7));
    }

    public final void a(boolean z9) {
        if (z9) {
            setVisibility(0);
            post(new p(this, 1));
            return;
        }
        this.y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ah.h(this, 10));
        duration.addListener(new t5(this, 4));
        duration.start();
    }

    public final ij b() {
        dj T8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.d || this.c.isEmpty()) {
            return null;
        }
        int i7 = 0;
        ij ijVar = (ij) this.c.get(0);
        if (ijVar.c1() != 0 && (T8 = this.a.T8(ijVar.c1())) != null && (arrayList = T8.d) != null) {
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ij ijVar2 = (ij) obj;
                TLRPC.Message message = ijVar2.k;
                if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                    return ijVar2;
                }
            }
        }
        return ijVar;
    }

    public final void c(boolean z9) {
        int height;
        boolean z10;
        boolean z11;
        if (!this.d || this.e == null || this.b == null) {
            return;
        }
        long min = Math.min(16L, System.currentTimeMillis() - this.w);
        this.w = System.currentTimeMillis();
        float f10 = this.n;
        float f11 = this.r;
        if (f10 != f11) {
            float f12 = min / 220.0f;
            if (f11 > f10) {
                this.n = Math.min(f10 + f12, f11);
            } else if (f11 < f10) {
                this.n = Math.max(f10 - f12, f11);
            }
            org.telegram.messenger.g0.h3(new p(this, 0));
        }
        cn cnVar = this.a;
        cj cjVar = cnVar.z0;
        int[] iArr = this.D;
        cjVar.getLocationInWindow(iArr);
        boolean z12 = true;
        float f13 = iArr[1];
        getLocationInWindow(iArr);
        float f14 = (f13 - iArr[1]) - cnVar.ia;
        boolean z13 = false;
        for (int i7 = 0; i7 < cjVar.getChildCount(); i7++) {
            View childAt = cjVar.getChildAt(i7);
            if (childAt instanceof q1) {
                q1 q1Var = (q1) childAt;
                ij messageObject = q1Var.getMessageObject();
                if (messageObject.e1() == this.e.e1()) {
                    boolean P3 = messageObject.P3();
                    q qVar = this.b;
                    if (qVar != null) {
                        qVar.setMirrorX(P3);
                        q qVar2 = this.b;
                        int L = org.telegram.messenger.g0.L(4.0f);
                        boolean z14 = id.a0;
                        int i10 = this.h;
                        int i11 = L + ((z14 || P3) ? 0 : i10);
                        float f15 = this.f;
                        int L2 = org.telegram.messenger.g0.L(f15);
                        int L3 = org.telegram.messenger.g0.L(4.0f);
                        if (!id.a0 && !P3) {
                            i10 = 0;
                        }
                        qVar2.setPadding(i11, L2, L3 + i10, org.telegram.messenger.g0.L(f15));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : cjVar.getHeight();
                    if (q1Var.getCurrentMessagesGroup() != null) {
                        org.telegram.messenger.cj cjVar2 = q1Var.getCurrentMessagesGroup().m;
                        height = cjVar2.d - cjVar2.b;
                    } else {
                        height = q1Var.getHeight();
                    }
                    float y10 = (q1Var.getY() + f14) - org.telegram.messenger.g0.L(74.0f);
                    float L4 = org.telegram.messenger.g0.L(14.0f);
                    float L5 = height2 - org.telegram.messenger.g0.L(218.0f);
                    nj njVar = cnVar.l2;
                    if (njVar != null && njVar.getVisibility() == 0) {
                        L4 += njVar.getHeight();
                    }
                    float f16 = height;
                    if (y10 <= L4 - (f16 / 2.0f) || y10 >= L5) {
                        if (y10 < (L4 - f16) - org.telegram.messenger.g0.L(92.0f) || y10 > L5) {
                            z10 = false;
                        } else {
                            this.s = org.telegram.messenger.g0.L(56.0f) + height;
                            this.r = 1.0f;
                            z10 = true;
                        }
                        z11 = z10;
                    } else {
                        this.r = 0.0f;
                        z10 = false;
                        z11 = true;
                    }
                    if (!z9) {
                        this.n = this.r;
                    }
                    float interpolation = (wq.f.getInterpolation(this.n) * this.s) + y10;
                    q qVar3 = this.b;
                    if (qVar3 == null) {
                        return;
                    }
                    if (z10 != qVar3.N) {
                        qVar3.setFlippedVertically(z10);
                        org.telegram.messenger.g0.h3(new p(this, 0));
                    }
                    if (z11 != this.b.isEnabled()) {
                        this.b.setEnabled(z11);
                        this.b.invalidate();
                        if (z11) {
                            this.b.setVisibility(0);
                            if (!this.y) {
                                this.y = true;
                                this.b.p(this.e, cnVar.p8, true);
                            }
                        }
                    }
                    this.b.setTranslationY(j9.a(interpolation, L4, L5));
                    this.b.setTranslationX(q1Var.R1(true));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                    int e10 = jg.g.e(32.0f, q1Var.getBackgroundDrawableLeft(), 0);
                    int e11 = jg.g.e(32.0f, q1Var.getWidth() - q1Var.getBackgroundDrawableRight(), (int) q1Var.R1(true));
                    int L6 = org.telegram.messenger.g0.L(40.0f) * 8;
                    if ((getWidth() - e11) - e10 < L6) {
                        if (P3) {
                            e10 = Math.min(e10, getWidth() - L6);
                            e11 = 0;
                        } else {
                            e11 = Math.min(e11, getWidth() - L6);
                            e10 = 0;
                        }
                    }
                    int i12 = P3 ? 5 : 3;
                    if (i12 != layoutParams.gravity) {
                        layoutParams.gravity = i12;
                        z13 = true;
                    }
                    if (e10 != layoutParams.leftMargin) {
                        layoutParams.leftMargin = e10;
                        z13 = true;
                    }
                    if (e11 != layoutParams.rightMargin) {
                        layoutParams.rightMargin = e11;
                    } else {
                        z12 = z13;
                    }
                    if (z12) {
                        this.b.requestLayout();
                        return;
                    }
                    return;
                }
            }
        }
        q qVar4 = this.b;
        if (qVar4 == null || !qVar4.isEnabled()) {
            return;
        }
        this.b.setEnabled(false);
    }

    public final boolean d() {
        return this.d && !this.x;
    }

    public void setHiddenByScroll(boolean z9) {
        this.x = z9;
        if (z9) {
            a(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelectedMessages(List<ij> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.c = list;
        cn cnVar = this.a;
        int i7 = cnVar.f4;
        boolean z9 = true;
        if (i7 != 1 && i7 != 5 && i7 != 6 && !cnVar.X9() && !cnVar.z() && (((chatFull = cnVar.p8) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
            long j3 = 0;
            boolean z10 = false;
            for (ij ijVar : list) {
                if ((ijVar != null && (message = ijVar.k) != null && message.rich_message != null) || (ijVar != null && !ijVar.m5() && ((ij.S3(ijVar.k) && ij.n1(ijVar.k).webpage == null) || (ijVar.F0() != null && (ij.K4(ijVar.F0()) || ij.s3(ijVar.F0(), false)))))) {
                    if (!z10) {
                        j3 = ijVar.c1();
                        z10 = true;
                    } else if (j3 == ijVar.c1() && j3 != 0) {
                    }
                }
            }
            if (z9 == this.d) {
                this.d = z9;
                this.x = false;
                a(z9);
                return;
            } else {
                if (z9) {
                    this.e = b();
                    return;
                }
                return;
            }
        }
        z9 = false;
        if (z9 == this.d) {
        }
    }
}
