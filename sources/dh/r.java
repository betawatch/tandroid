package dh;

import ai.e1;
import ai.j5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.be;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.ti;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.xq;
import org.telegram.ui.hj;
import org.telegram.ui.wi;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final int[] E;
    public final wm a;
    public q b;
    public List c;
    public boolean d;
    public zi e;
    public final int f;
    public final int h;
    public float n;
    public float r;
    public float s;
    public long w;
    public boolean x;
    public boolean y;

    public r(wm wmVar, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = 22;
        this.h = 24;
        this.E = new int[2];
        setVisibility(8);
        this.a = wmVar;
        setClipToPadding(false);
        setClipChildren(false);
        wmVar.A0.j(new j5(this, 10));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new p(this, 1));
            return;
        }
        this.y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new bh.f(this, 10));
        duration.addListener(new e1(this, 5));
        duration.start();
    }

    public final zi b() {
        ui S8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.d || this.c.isEmpty()) {
            return null;
        }
        int i3 = 0;
        zi ziVar = (zi) this.c.get(0);
        if (ziVar.d1() != 0 && (S8 = this.a.S8(ziVar.d1())) != null && (arrayList = S8.d) != null) {
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                zi ziVar2 = (zi) obj;
                TLRPC.Message message = ziVar2.k;
                if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                    return ziVar2;
                }
            }
        }
        return ziVar;
    }

    public final void c(boolean z10) {
        int height;
        boolean z11;
        boolean z12;
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
        wm wmVar = this.a;
        wi wiVar = wmVar.A0;
        int[] iArr = this.E;
        wiVar.getLocationInWindow(iArr);
        boolean z13 = true;
        float f13 = iArr[1];
        getLocationInWindow(iArr);
        float f14 = (f13 - iArr[1]) - wmVar.ha;
        boolean z14 = false;
        for (int i3 = 0; i3 < wiVar.getChildCount(); i3++) {
            View childAt = wiVar.getChildAt(i3);
            if (childAt instanceof q1) {
                q1 q1Var = (q1) childAt;
                zi messageObject = q1Var.getMessageObject();
                if (messageObject.f1() == this.e.f1()) {
                    boolean Q3 = messageObject.Q3();
                    q qVar = this.b;
                    if (qVar != null) {
                        qVar.setMirrorX(Q3);
                        q qVar2 = this.b;
                        int L = org.telegram.messenger.g0.L(4.0f);
                        boolean z15 = bd.a0;
                        int i10 = this.h;
                        int i11 = L + ((z15 || Q3) ? 0 : i10);
                        float f15 = this.f;
                        int L2 = org.telegram.messenger.g0.L(f15);
                        int L3 = org.telegram.messenger.g0.L(4.0f);
                        if (!bd.a0 && !Q3) {
                            i10 = 0;
                        }
                        qVar2.setPadding(i11, L2, L3 + i10, org.telegram.messenger.g0.L(f15));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : wiVar.getHeight();
                    if (q1Var.getCurrentMessagesGroup() != null) {
                        ti tiVar = q1Var.getCurrentMessagesGroup().m;
                        height = tiVar.d - tiVar.b;
                    } else {
                        height = q1Var.getHeight();
                    }
                    float y9 = (q1Var.getY() + f14) - org.telegram.messenger.g0.L(74.0f);
                    float L4 = org.telegram.messenger.g0.L(14.0f);
                    float L5 = height2 - org.telegram.messenger.g0.L(218.0f);
                    hj hjVar = wmVar.m2;
                    if (hjVar != null && hjVar.getVisibility() == 0) {
                        L4 += hjVar.getHeight();
                    }
                    float f16 = height;
                    if (y9 <= L4 - (f16 / 2.0f) || y9 >= L5) {
                        if (y9 < (L4 - f16) - org.telegram.messenger.g0.L(92.0f) || y9 > L5) {
                            z11 = false;
                        } else {
                            this.s = org.telegram.messenger.g0.L(56.0f) + height;
                            this.r = 1.0f;
                            z11 = true;
                        }
                        z12 = z11;
                    } else {
                        this.r = 0.0f;
                        z11 = false;
                        z12 = true;
                    }
                    if (!z10) {
                        this.n = this.r;
                    }
                    float interpolation = (xq.f.getInterpolation(this.n) * this.s) + y9;
                    q qVar3 = this.b;
                    if (qVar3 == null) {
                        return;
                    }
                    if (z11 != qVar3.O) {
                        qVar3.setFlippedVertically(z11);
                        org.telegram.messenger.g0.h3(new p(this, 0));
                    }
                    if (z12 != this.b.isEnabled()) {
                        this.b.setEnabled(z12);
                        this.b.invalidate();
                        if (z12) {
                            this.b.setVisibility(0);
                            if (!this.y) {
                                this.y = true;
                                this.b.p(this.e, wmVar.q8, true);
                            }
                        }
                    }
                    this.b.setTranslationY(be.a(interpolation, L4, L5));
                    this.b.setTranslationX(q1Var.R1(true));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                    int d = p1.d(32.0f, q1Var.getBackgroundDrawableLeft(), 0);
                    int d10 = p1.d(32.0f, q1Var.getWidth() - q1Var.getBackgroundDrawableRight(), (int) q1Var.R1(true));
                    int L6 = org.telegram.messenger.g0.L(40.0f) * 8;
                    if ((getWidth() - d10) - d < L6) {
                        if (Q3) {
                            d = Math.min(d, getWidth() - L6);
                            d10 = 0;
                        } else {
                            d10 = Math.min(d10, getWidth() - L6);
                            d = 0;
                        }
                    }
                    int i12 = Q3 ? 5 : 3;
                    if (i12 != layoutParams.gravity) {
                        layoutParams.gravity = i12;
                        z14 = true;
                    }
                    if (d != layoutParams.leftMargin) {
                        layoutParams.leftMargin = d;
                        z14 = true;
                    }
                    if (d10 != layoutParams.rightMargin) {
                        layoutParams.rightMargin = d10;
                    } else {
                        z13 = z14;
                    }
                    if (z13) {
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

    public void setHiddenByScroll(boolean z10) {
        this.x = z10;
        if (z10) {
            a(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelectedMessages(List<zi> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.c = list;
        wm wmVar = this.a;
        int i3 = wmVar.g4;
        boolean z10 = true;
        if (i3 != 1 && i3 != 5 && i3 != 6 && !wmVar.W9() && !wmVar.z() && (((chatFull = wmVar.q8) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
            long j10 = 0;
            boolean z11 = false;
            for (zi ziVar : list) {
                if ((ziVar != null && (message = ziVar.k) != null && message.rich_message != null) || (ziVar != null && !ziVar.n5() && ((zi.T3(ziVar.k) && zi.o1(ziVar.k).webpage == null) || (ziVar.F0() != null && (zi.L4(ziVar.F0()) || zi.t3(ziVar.F0(), false)))))) {
                    if (!z11) {
                        j10 = ziVar.d1();
                        z11 = true;
                    } else if (j10 == ziVar.d1() && j10 != 0) {
                    }
                }
            }
            if (z10 == this.d) {
                this.d = z10;
                this.x = false;
                a(z10);
                return;
            } else {
                if (z10) {
                    this.e = b();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (z10 == this.d) {
        }
    }
}
