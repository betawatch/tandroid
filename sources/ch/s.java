package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.u1;
import c8.l9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.nr;
import org.telegram.ui.bn;
import org.telegram.ui.mj;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class s extends FrameLayout {
    public final int[] E;
    public final bn a;
    public r b;
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

    public s(bn bnVar, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = 22;
        this.h = 24;
        this.E = new int[2];
        setVisibility(8);
        this.a = bnVar;
        setClipToPadding(false);
        setClipChildren(false);
        bnVar.A0.j(new u1(this, 4));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new q(this, 1));
            return;
        }
        this.y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ah.g(this, 2));
        duration.addListener(new ai.k0(this, 4));
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
            org.telegram.messenger.g0.g3(new q(this, 0));
        }
        bn bnVar = this.a;
        org.telegram.ui.bj bjVar = bnVar.A0;
        int[] iArr = this.E;
        bjVar.getLocationInWindow(iArr);
        boolean z13 = true;
        float f13 = iArr[1];
        getLocationInWindow(iArr);
        float f14 = (f13 - iArr[1]) - bnVar.ka;
        boolean z14 = false;
        for (int i7 = 0; i7 < bjVar.getChildCount(); i7++) {
            View childAt = bjVar.getChildAt(i7);
            if (childAt instanceof r1) {
                r1 r1Var = (r1) childAt;
                gj messageObject = r1Var.getMessageObject();
                if (messageObject.e1() == this.e.e1()) {
                    boolean P3 = messageObject.P3();
                    r rVar = this.b;
                    if (rVar != null) {
                        rVar.setMirrorX(P3);
                        r rVar2 = this.b;
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
                        rVar2.setPadding(i11, L2, L3 + i10, org.telegram.messenger.g0.L(f15));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : bjVar.getHeight();
                    if (r1Var.getCurrentMessagesGroup() != null) {
                        aj ajVar = r1Var.getCurrentMessagesGroup().m;
                        height = ajVar.d - ajVar.b;
                    } else {
                        height = r1Var.getHeight();
                    }
                    float y10 = (r1Var.getY() + f14) - org.telegram.messenger.g0.L(74.0f);
                    float L4 = org.telegram.messenger.g0.L(14.0f);
                    float L5 = height2 - org.telegram.messenger.g0.L(218.0f);
                    mj mjVar = bnVar.m2;
                    if (mjVar != null && mjVar.getVisibility() == 0) {
                        L4 += mjVar.getHeight();
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
                    float interpolation = (nr.f.getInterpolation(this.n) * this.s) + y10;
                    r rVar3 = this.b;
                    if (rVar3 == null) {
                        return;
                    }
                    if (z11 != rVar3.O) {
                        rVar3.setFlippedVertically(z11);
                        org.telegram.messenger.g0.g3(new q(this, 0));
                    }
                    if (z12 != this.b.isEnabled()) {
                        this.b.setEnabled(z12);
                        this.b.invalidate();
                        if (z12) {
                            this.b.setVisibility(0);
                            if (!this.y) {
                                this.y = true;
                                this.b.p(this.e, bnVar.r8, true);
                            }
                        }
                    }
                    this.b.setTranslationY(l9.a(interpolation, L4, L5));
                    this.b.setTranslationX(r1Var.S1(true));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                    int d = i5.c.d(32.0f, r1Var.getBackgroundDrawableLeft(), 0);
                    int d2 = i5.c.d(32.0f, r1Var.getWidth() - r1Var.getBackgroundDrawableRight(), (int) r1Var.S1(true));
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
        r rVar4 = this.b;
        if (rVar4 == null || !rVar4.isEnabled()) {
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
        bn bnVar = this.a;
        int i7 = bnVar.g4;
        boolean z10 = true;
        if (i7 != 1 && i7 != 5 && i7 != 6 && !bnVar.Y9() && !bnVar.z() && (((chatFull = bnVar.r8) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
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
