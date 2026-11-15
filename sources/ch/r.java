package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.z4;
import c8.i9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.er;
import org.telegram.ui.aj;
import org.telegram.ui.an;
import org.telegram.ui.lj;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final int[] E;
    public final an a;
    public q b;
    public List c;
    public boolean d;
    public gj e;
    public final int f;
    public final int h;
    public float n;
    public float r;
    public float s;
    public long w;
    public boolean x;
    public boolean y;

    public r(an anVar, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = 22;
        this.h = 24;
        this.E = new int[2];
        setVisibility(8);
        this.a = anVar;
        setClipToPadding(false);
        setClipChildren(false);
        anVar.A0.j(new z4(this, 3));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new p(this, 1));
            return;
        }
        this.y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ah.h(this, 2));
        duration.addListener(new ai.j0(this, 4));
        duration.start();
    }

    public final gj b() {
        bj U8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.d || this.c.isEmpty()) {
            return null;
        }
        int i7 = 0;
        gj gjVar = (gj) this.c.get(0);
        if (gjVar.c1() != 0 && (U8 = this.a.U8(gjVar.c1())) != null && (arrayList = U8.d) != null) {
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                gj gjVar2 = (gj) obj;
                TLRPC.Message message = gjVar2.k;
                if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                    return gjVar2;
                }
            }
        }
        return gjVar;
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
        an anVar = this.a;
        aj ajVar = anVar.A0;
        int[] iArr = this.E;
        ajVar.getLocationInWindow(iArr);
        boolean z13 = true;
        float f13 = iArr[1];
        getLocationInWindow(iArr);
        float f14 = (f13 - iArr[1]) - anVar.ja;
        boolean z14 = false;
        for (int i7 = 0; i7 < ajVar.getChildCount(); i7++) {
            View childAt = ajVar.getChildAt(i7);
            if (childAt instanceof q1) {
                q1 q1Var = (q1) childAt;
                gj messageObject = q1Var.getMessageObject();
                if (messageObject.e1() == this.e.e1()) {
                    boolean P3 = messageObject.P3();
                    q qVar = this.b;
                    if (qVar != null) {
                        qVar.setMirrorX(P3);
                        q qVar2 = this.b;
                        int L = org.telegram.messenger.g0.L(4.0f);
                        boolean z15 = hd.a0;
                        int i10 = this.h;
                        int i11 = L + ((z15 || P3) ? 0 : i10);
                        float f15 = this.f;
                        int L2 = org.telegram.messenger.g0.L(f15);
                        int L3 = org.telegram.messenger.g0.L(4.0f);
                        if (!hd.a0 && !P3) {
                            i10 = 0;
                        }
                        qVar2.setPadding(i11, L2, L3 + i10, org.telegram.messenger.g0.L(f15));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : ajVar.getHeight();
                    if (q1Var.getCurrentMessagesGroup() != null) {
                        org.telegram.messenger.aj ajVar2 = q1Var.getCurrentMessagesGroup().m;
                        height = ajVar2.d - ajVar2.b;
                    } else {
                        height = q1Var.getHeight();
                    }
                    float y10 = (q1Var.getY() + f14) - org.telegram.messenger.g0.L(74.0f);
                    float L4 = org.telegram.messenger.g0.L(14.0f);
                    float L5 = height2 - org.telegram.messenger.g0.L(218.0f);
                    lj ljVar = anVar.m2;
                    if (ljVar != null && ljVar.getVisibility() == 0) {
                        L4 += ljVar.getHeight();
                    }
                    float f16 = height;
                    if (y10 <= L4 - (f16 / 2.0f) || y10 >= L5) {
                        if (y10 < (L4 - f16) - org.telegram.messenger.g0.L(92.0f) || y10 > L5) {
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
                    float interpolation = (er.f.getInterpolation(this.n) * this.s) + y10;
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
                                this.b.p(this.e, anVar.q8, true);
                            }
                        }
                    }
                    this.b.setTranslationY(i9.a(interpolation, L4, L5));
                    this.b.setTranslationX(q1Var.S1(true));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                    int d = i5.c.d(32.0f, q1Var.getBackgroundDrawableLeft(), 0);
                    int d2 = i5.c.d(32.0f, q1Var.getWidth() - q1Var.getBackgroundDrawableRight(), (int) q1Var.S1(true));
                    int L6 = org.telegram.messenger.g0.L(40.0f) * 8;
                    if ((getWidth() - d2) - d < L6) {
                        if (P3) {
                            d = Math.min(d, getWidth() - L6);
                            d2 = 0;
                        } else {
                            d2 = Math.min(d2, getWidth() - L6);
                            d = 0;
                        }
                    }
                    int i12 = P3 ? 5 : 3;
                    if (i12 != layoutParams.gravity) {
                        layoutParams.gravity = i12;
                        z14 = true;
                    }
                    if (d != layoutParams.leftMargin) {
                        layoutParams.leftMargin = d;
                        z14 = true;
                    }
                    if (d2 != layoutParams.rightMargin) {
                        layoutParams.rightMargin = d2;
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
    public void setSelectedMessages(List<gj> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.c = list;
        an anVar = this.a;
        int i7 = anVar.g4;
        boolean z10 = true;
        if (i7 != 1 && i7 != 5 && i7 != 6 && !anVar.Y9() && !anVar.z() && (((chatFull = anVar.q8) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
            long j3 = 0;
            boolean z11 = false;
            for (gj gjVar : list) {
                if ((gjVar != null && (message = gjVar.k) != null && message.rich_message != null) || (gjVar != null && !gjVar.m5() && ((gj.S3(gjVar.k) && gj.n1(gjVar.k).webpage == null) || (gjVar.F0() != null && (gj.K4(gjVar.F0()) || gj.s3(gjVar.F0(), false)))))) {
                    if (!z11) {
                        j3 = gjVar.c1();
                        z11 = true;
                    } else if (j3 == gjVar.c1() && j3 != 0) {
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
