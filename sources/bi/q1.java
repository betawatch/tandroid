package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.at0;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.fw;
import org.telegram.ui.kp;
import org.telegram.ui.ks;
import org.telegram.ui.nw;
import org.telegram.ui.oq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class q1 extends pj0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ Object f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(int i7, Context context, Object obj) {
        super(context, null);
        this.e3 = i7;
        this.f3 = obj;
    }

    @Override // org.telegram.ui.Components.pj0
    public boolean E0(float f10) {
        switch (this.e3) {
            case 5:
                di diVar = ((kg.g0) this.f3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + diVar.V3[0]) + (!diVar.X1 ? org.telegram.messenger.g0.m : 0)));
            case 15:
                di diVar2 = ((fj) this.f3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + diVar2.V3[0]) + (!diVar2.X1 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public boolean F0(View view) {
        switch (this.e3) {
            case 7:
                return view != ((org.telegram.ui.y6) this.f3).W;
            case 19:
                fz fzVar = (fz) this.f3;
                return fzVar.isEnabled() && !((nw) fzVar.J).b.j2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public boolean H0(View view, float f10, float f11) {
        switch (this.e3) {
            case 0:
                ((w1) this.f3).getClass();
                return true;
            case 13:
                return ((org.telegram.ui.Components.na) this.f3).J0(view, f10, f11);
            case 19:
                if (((fz) this.f3).n) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = ((dz) view).f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 29:
                if (((u61) this.f3).n) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF2 = ((s61) view).c;
                    float f13 = L2;
                    if (rectF2.left - f13 < f10 && rectF2.right + f13 > f10) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f10, f11);
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public boolean R0() {
        switch (this.e3) {
            case 28:
                return getAdapter() != null && ((b51) this.f3).y1 && getAdapter().b() <= 2;
            default:
                return super.R0();
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public Integer V0(int i7) {
        switch (this.e3) {
            case 1:
                return 0;
            case 24:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        switch (this.e3) {
            case 29:
                super.addView(view, i7, layoutParams);
                if (!((u61) this.f3).V) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setAlpha(1.0f);
                    break;
                } else {
                    view.setScaleX(0.3f);
                    view.setScaleY(0.3f);
                    view.setAlpha(0.0f);
                    break;
                }
            default:
                super.addView(view, i7, layoutParams);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        di.s0 s0Var;
        dj djVar;
        ArrayList arrayList;
        q1 q1Var;
        ca0 ca0Var;
        int i7;
        q1 q1Var2;
        boolean z9;
        dj currentMessagesGroup;
        dj currentMessagesGroup2;
        switch (this.e3) {
            case 1:
                di.g2 g2Var = (di.g2) this.f3;
                int i10 = -1;
                if (!g2Var.f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof di.n0) || (s0Var = ((di.n0) childAt).K) == null) {
                                i11++;
                            } else {
                                i10 = s0Var.a;
                            }
                        }
                    }
                }
                if (i10 > g2Var.F) {
                    g2Var.F = i10;
                    di.a aVar = g2Var.i0.G1;
                    if (aVar != null) {
                        aVar.setCount(g2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                ve veVar = (ve) this.f3;
                q1 q1Var3 = veVar.c;
                if (q1Var3.getLayoutManager() != null && q1Var3.getAdapter() != null && q1Var3.getAdapter().b() != 0) {
                    float L = veVar.h - org.telegram.messenger.g0.L(8.0f);
                    veVar.e = L - org.telegram.messenger.g0.L(16.0f);
                    fh.g gVar = veVar.r;
                    if (gVar != null) {
                        gVar.draw(canvas);
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), veVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 8:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.h8) this.f3).F = false;
                break;
            case 21:
                ca0 ca0Var2 = (ca0) this.f3;
                org.telegram.ui.v8 v8Var = ca0Var2.b;
                boolean z10 = false;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt2).y3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                dj djVar2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = getChildAt(i13);
                    if ((childAt3 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.q1) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != djVar2)) {
                        djVar2 = currentMessagesGroup2;
                    }
                }
                int i14 = 0;
                while (i14 < 3) {
                    ia0 ia0Var = ca0Var2.c0;
                    ArrayList arrayList2 = ia0Var.E;
                    q1 q1Var4 = ca0Var2.f;
                    ia0Var.E.clear();
                    int i15 = 2;
                    if (i14 != 2 || q1Var4.V1) {
                        int i16 = z10 ? 1 : 0;
                        ?? r12 = z10;
                        while (true) {
                            boolean z11 = true;
                            if (i16 < childCount) {
                                View childAt4 = q1Var4.getChildAt(i16);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) childAt4;
                                    if (childAt4.getY() <= q1Var4.getHeight() && childAt4.getY() + childAt4.getHeight() >= 0.0f && (currentMessagesGroup = q1Var5.getCurrentMessagesGroup()) != null) {
                                        cj cjVar = currentMessagesGroup.m;
                                        if ((i14 != 0 || currentMessagesGroup.d.size() != 1) && ((i14 != 1 || cjVar.i) && ((i14 != 0 || !q1Var5.getMessageObject().Z) && ((i14 != 1 || q1Var5.getMessageObject().Z) && ((i14 != i15 || q1Var5.ya) && (i14 == i15 || !q1Var5.ya)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                cjVar.a = r12;
                                                cjVar.b = r12;
                                                cjVar.c = r12;
                                                cjVar.d = r12;
                                                cjVar.l = r12;
                                                cjVar.k = r12;
                                                cjVar.m = q1Var5;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            cjVar.k = q1Var5.I2();
                                            cjVar.l = q1Var5.H2();
                                            int backgroundDrawableLeft = q1Var5.getBackgroundDrawableLeft() + q1Var5.getLeft();
                                            int backgroundDrawableRight = q1Var5.getBackgroundDrawableRight() + q1Var5.getLeft();
                                            int backgroundDrawableTop = q1Var5.getBackgroundDrawableTop() + q1Var5.getPaddingTop() + q1Var5.getTop();
                                            int backgroundDrawableBottom = q1Var5.getBackgroundDrawableBottom() + q1Var5.getPaddingTop() + q1Var5.getTop();
                                            if ((q1Var5.getCurrentPosition().l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                            }
                                            if ((q1Var5.getCurrentPosition().l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i17 = backgroundDrawableBottom;
                                            if (q1Var5.ya) {
                                                cjVar.m = q1Var5;
                                            }
                                            int i18 = cjVar.b;
                                            if (i18 == 0 || backgroundDrawableTop < i18) {
                                                cjVar.b = backgroundDrawableTop;
                                            }
                                            int i19 = cjVar.d;
                                            if (i19 == 0 || i17 > i19) {
                                                cjVar.d = i17;
                                            }
                                            int i20 = cjVar.a;
                                            if (i20 == 0 || backgroundDrawableLeft < i20) {
                                                cjVar.a = backgroundDrawableLeft;
                                            }
                                            int i21 = cjVar.c;
                                            if (i21 == 0 || backgroundDrawableRight > i21) {
                                                cjVar.c = backgroundDrawableRight;
                                            }
                                        }
                                    }
                                }
                                i16++;
                                i15 = 2;
                                r12 = 0;
                            } else {
                                int i22 = 0;
                                ArrayList arrayList3 = arrayList2;
                                while (i22 < arrayList3.size()) {
                                    dj djVar3 = (dj) arrayList3.get(i22);
                                    if (djVar3 == null) {
                                        arrayList = arrayList3;
                                        q1Var2 = q1Var4;
                                        z9 = z11;
                                        ca0Var = ca0Var2;
                                        i7 = i22;
                                    } else {
                                        cj cjVar2 = djVar3.m;
                                        float R1 = cjVar2.m.R1(z11);
                                        float f10 = cjVar2.a + R1 + cjVar2.e;
                                        float f11 = cjVar2.b + cjVar2.f;
                                        float f12 = cjVar2.g + cjVar2.c + R1;
                                        float f13 = cjVar2.d + cjVar2.h;
                                        if (!cjVar2.j) {
                                            f11 += cjVar2.m.getTranslationY();
                                            f13 += cjVar2.m.getTranslationY();
                                        }
                                        if (f11 < (-org.telegram.messenger.g0.L(20.0f))) {
                                            f11 = -org.telegram.messenger.g0.L(20.0f);
                                        }
                                        float f14 = f11;
                                        if (f13 > org.telegram.messenger.g0.L(20.0f) + q1Var4.getMeasuredHeight()) {
                                            f13 = org.telegram.messenger.g0.L(20.0f) + q1Var4.getMeasuredHeight();
                                        }
                                        float f15 = f13;
                                        boolean z12 = (cjVar2.m.getScaleX() == 1.0f && cjVar2.m.getScaleY() == 1.0f) ? false : true;
                                        if (z12) {
                                            canvas.save();
                                            djVar = djVar3;
                                            arrayList = arrayList3;
                                            q1Var = q1Var4;
                                            canvas.scale(cjVar2.m.getScaleX(), cjVar2.m.getScaleY(), com.google.android.recaptcha.internal.a.A(f12, f10, 2.0f, f10), com.google.android.recaptcha.internal.a.A(f15, f14, 2.0f, f14));
                                        } else {
                                            djVar = djVar3;
                                            arrayList = arrayList3;
                                            q1Var = q1Var4;
                                        }
                                        ca0Var = ca0Var2;
                                        dj djVar4 = djVar;
                                        i7 = i22;
                                        q1Var2 = q1Var;
                                        z9 = true;
                                        cjVar2.m.K0(canvas, (int) f10, (int) f14, (int) f12, (int) f15, cjVar2.k, cjVar2.l, false, 0);
                                        cjVar2.m = null;
                                        cjVar2.o = djVar4.c;
                                        if (z12) {
                                            canvas.restore();
                                            for (int i23 = 0; i23 < childCount; i23++) {
                                                View childAt5 = q1Var2.getChildAt(i23);
                                                if (childAt5 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) childAt5;
                                                    if (q1Var6.getCurrentMessagesGroup() == djVar4) {
                                                        int left = q1Var6.getLeft();
                                                        int top = q1Var6.getTop();
                                                        childAt5.setPivotX(((f12 - f10) / 2.0f) + (f10 - left));
                                                        childAt5.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i22 = i7 + 1;
                                    q1Var4 = q1Var2;
                                    ca0Var2 = ca0Var;
                                    arrayList3 = arrayList;
                                    z11 = z9;
                                }
                            }
                        }
                    }
                    i14++;
                    ca0Var2 = ca0Var2;
                    z10 = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 25:
                fw fwVar = (fw) this.f3;
                v4.b0 b0Var = fwVar.e0;
                v4.k kVar = fwVar.c0;
                yl0 yl0Var = fwVar.d0;
                if (yl0Var != null && kVar != null && b0Var != null && yl0Var.m0) {
                    canvas.save();
                    invalidate();
                    int b10 = yl0Var.b() - 1;
                    int i24 = 0;
                    while (true) {
                        if (i24 < getChildCount()) {
                            View childAt6 = getChildAt(i24);
                            if (RecyclerView.R(childAt6) == b10) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt6.getTranslationY() + childAt6.getBottom());
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (yl0Var != null && kVar != null && b0Var != null && yl0Var.m0) {
                    canvas.restore();
                }
                if (yl0Var != null && yl0Var.o0 != null) {
                    canvas.save();
                    canvas.translate(yl0Var.o0.getLeft(), yl0Var.o0.getTranslationY() + yl0Var.o0.getTop());
                    yl0Var.o0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e5 e5Var;
        v4.d1 K;
        int i7 = this.e3;
        Object obj = this.f3;
        switch (i7) {
            case 1:
                if (!((di.g2) obj).f0) {
                    break;
                }
                break;
            case 3:
                if (!((fi.f3) obj).K) {
                    break;
                }
                break;
            case 16:
                if (motionEvent.getActionMasked() == 0) {
                    wk wkVar = (wk) obj;
                    if (motionEvent.getY() < wkVar.s0 && (e5Var = wkVar.J) != null && e5Var.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= org.telegram.messenger.g0.L(32.0f) + Math.max(0, K.a.getTop())) {
                    }
                }
                break;
            case 22:
                ii0 ii0Var = (ii0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && ii0Var.getPullingLeftProgress() > 0.95f) {
                        ii0.a(ii0Var);
                    } else if (ii0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = ii0Var.y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(ii0Var.B0, 0.0f);
                        ii0Var.y0 = ofFloat;
                        ofFloat.addUpdateListener(new c60(ii0Var, 5));
                        ii0Var.y0.setDuration(150L);
                        ii0Var.y0.start();
                    }
                }
                break;
            case 24:
                LinearLayout linearLayout = ((ql0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ef  */
    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.q1 q1Var;
        ImageReceiver avatarImage;
        boolean z9;
        int y10;
        int b10;
        switch (this.e3) {
            case 9:
                org.telegram.ui.mb mbVar = (org.telegram.ui.mb) this.f3;
                if (view instanceof org.telegram.ui.Cells.y1) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    ((org.telegram.ui.Cells.y1) view).a(canvas);
                    canvas.restore();
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                if ((view instanceof org.telegram.ui.Cells.q1) && (avatarImage = (q1Var = (org.telegram.ui.Cells.q1) view).getAvatarImage()) != null) {
                    if (!q1Var.getMessageObject().Z) {
                        mbVar.w.getClass();
                        if (RecyclerView.R(q1Var) != -1) {
                            z9 = true;
                            if (!q1Var.getMessageObject().Z) {
                                avatarImage.O0(false, false);
                                break;
                            } else {
                                int y11 = (int) view.getY();
                                if (q1Var.m() && (b10 = mbVar.w.T(view).b()) >= 0) {
                                    if (mbVar.w.K(b10 + 1) != null) {
                                        avatarImage.O0(false, false);
                                        break;
                                    }
                                }
                                float checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                int layoutHeight = q1Var.getLayoutHeight() + ((int) view.getY());
                                int measuredHeight = mbVar.w.getMeasuredHeight() - mbVar.w.getPaddingBottom();
                                if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (q1Var.j() && (r13 = mbVar.w.T(view).b()) >= 0) {
                                    int i7 = 0;
                                    while (i7 < 20) {
                                        i7++;
                                        int b11 = b11 - 1;
                                        v4.d1 K = mbVar.w.K(b11);
                                        if (K != null) {
                                            View view2 = K.a;
                                            int top = view2.getTop();
                                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                                q1Var = (org.telegram.ui.Cells.q1) view2;
                                                if (q1Var.j()) {
                                                    y11 = top;
                                                }
                                            }
                                            y11 = top;
                                        }
                                    }
                                }
                                if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < y11) {
                                    layoutHeight = org.telegram.messenger.g0.L(48.0f) + y11;
                                }
                                if (!q1Var.m() && layoutHeight > (y10 = (int) (q1Var.getY() + q1Var.getMeasuredHeight()))) {
                                    layoutHeight = y10;
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                    canvas.translate(checkBoxTranslation, 0.0f);
                                }
                                if (q1Var.getCurrentMessagesGroup() != null && q1Var.getCurrentMessagesGroup().m.j) {
                                    layoutHeight = (int) (layoutHeight - q1Var.getTranslationY());
                                }
                                if (z9) {
                                    avatarImage.L0 = layoutHeight - org.telegram.messenger.g0.L(44.0f);
                                }
                                if (q1Var.b()) {
                                    avatarImage.setAlpha(q1Var.getAlpha());
                                    canvas.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX() + q1Var.getX(), q1Var.getY() + (q1Var.getHeight() >> 1));
                                } else {
                                    avatarImage.setAlpha(1.0f);
                                }
                                if (z9) {
                                    avatarImage.O0(true, false);
                                }
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                break;
                            }
                        }
                    }
                    z9 = false;
                    if (!q1Var.getMessageObject().Z) {
                    }
                }
                break;
            case 21:
                if (!(view instanceof org.telegram.ui.Cells.q1)) {
                    break;
                } else {
                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                    boolean drawChild2 = super.drawChild(canvas, view, j3);
                    q1Var2.S0(canvas);
                    canvas.save();
                    canvas.translate(q1Var2.getX(), q1Var2.getY());
                    canvas.save();
                    canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
                    q1Var2.c1(canvas, true);
                    q1Var2.S2(true);
                    q1Var2.g1(canvas);
                    if (q1Var2.getCurrentMessagesGroup() == null || ((q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().l & q1Var2.B()) != 0 && (q1Var2.getCurrentPosition().l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().i))) || q1Var2.getTransitionParams().x0)) {
                        q1Var2.Q0(q1Var2.getAlpha(), canvas, false);
                        q1Var2.o1(canvas, q1Var2.getAlpha(), null);
                        q1Var2.V0(canvas, q1Var2.getAlpha());
                    }
                    if (q1Var2.getCurrentMessagesGroup() != null || q1Var2.getTransitionParams().x0) {
                        q1Var2.h1(canvas, q1Var2.getAlpha());
                    }
                    if ((q1Var2.getCurrentPosition() != null && q1Var2.getCurrentPosition().h) || q1Var2.getTransitionParams().x0) {
                        q1Var2.x1(q1Var2.getAlpha(), canvas, true);
                    }
                    q1Var2.j1(canvas);
                    canvas.restore();
                    q1Var2.getTransitionParams().d();
                    canvas.restore();
                    break;
                }
                break;
            case 22:
                ch.o0 o0Var = ((ii0) this.f3).l0;
                if (o0Var == null || !(view instanceof gi0) || !((gi0) view).e.equals(o0Var)) {
                    break;
                }
                break;
            case 27:
                yv0 yv0Var = (yv0) this.f3;
                a8.b8 b8Var = yv0Var.c2;
                if (!(view instanceof org.telegram.ui.Cells.z7) || !yv0Var.I1) {
                    break;
                } else {
                    int b12 = yv0Var.j1.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) b8Var.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b12 - ((b12 / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) b8Var.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b12 - ((b12 / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) b8Var.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b12 - ((b12 / 6) * 6))).floatValue());
                    boolean drawChild3 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e3) {
            case 1:
                super.invalidate();
                ((di.g2) this.f3).invalidate();
                break;
            case 12:
                super.invalidate();
                View view = ((oq) this.f3).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i7) {
        switch (this.e3) {
            case 21:
                if (i7 == 0) {
                    ((ca0) this.f3).e.V();
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i7) {
        switch (this.e3) {
            case 5:
                break;
            case 17:
                bm bmVar = (bm) this.f3;
                bmVar.invalidate();
                bmVar.b.M1(bmVar, i7);
                am amVar = bmVar.w;
                boolean z9 = true;
                int i10 = 0;
                boolean z10 = amVar.y == null;
                if (z10) {
                    amVar.y = amVar.d();
                } else {
                    boolean[] d = amVar.d();
                    if (d.length == amVar.y.length) {
                        while (true) {
                            if (i10 >= d.length) {
                                z9 = z10;
                            } else if (d[i10] == amVar.y[i10]) {
                                i10++;
                            }
                        }
                    }
                    z10 = z9;
                }
                if (z10) {
                    amVar.invalidate();
                    break;
                }
                break;
            case 21:
                ((ca0) this.f3).e.G();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.e3) {
            case 10:
                super.onAttachedToWindow();
                jg.m1 m1Var = ((an) this.f3).a4;
                if (m1Var != null) {
                    qs.f(m1Var.r).c(m1Var, qs.x5);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.e3) {
            case 10:
                super.onDetachedFromWindow();
                jg.m1 m1Var = ((an) this.f3).a4;
                if (m1Var != null) {
                    org.telegram.messenger.g0.r(m1Var.E);
                    qs.f(m1Var.r).n(m1Var, qs.x5);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 2:
                ks p10 = ks.p();
                fi.t1 t1Var = (fi.t1) this.f3;
                boolean q10 = p10.q(motionEvent, t1Var.b, t1Var.f, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || q10) {
                }
                break;
            case 3:
                if (!((fi.f3) this.f3).K) {
                    break;
                }
                break;
            case 11:
                if (!((kp) this.f3).H) {
                    break;
                }
                break;
            case 14:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((qi) this.f3).b.V3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
            case 17:
                if (((bm) this.f3).J == null) {
                    break;
                }
                break;
            case 18:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((hy) this.f3).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 26:
                boolean q11 = ks.p().q(motionEvent, ((at0) this.f3).i1, null, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || q11) {
                }
                break;
            case 27:
                yv0 yv0Var = (yv0) this.f3;
                if (yv0Var.I1) {
                    break;
                } else {
                    boolean q12 = ks.p().q(motionEvent, yv0Var.j1, yv0Var.d2, this.n2);
                    if (super.onInterceptTouchEvent(motionEvent) || q12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        ij ijVar;
        switch (this.e3) {
            case 0:
                ((w1) this.f3).I0();
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 9:
                org.telegram.ui.mb mbVar = (org.telegram.ui.mb) this.f3;
                if (mbVar.w != null && mbVar.y != null && (i13 = mbVar.N0) >= 0) {
                    if (mbVar.M0 != 0) {
                        int i14 = 0;
                        while (true) {
                            org.telegram.ui.jb jbVar = mbVar.E;
                            if (i14 < jbVar.d) {
                                if (i14 < jbVar.f || i14 >= jbVar.h) {
                                    ijVar = null;
                                } else {
                                    ArrayList arrayList = jbVar.n.o0;
                                    ijVar = (ij) arrayList.get((arrayList.size() - (i14 - jbVar.f)) - 1);
                                }
                                if (ijVar == null || ijVar.T != mbVar.M0) {
                                    i14++;
                                } else {
                                    i13 = i14;
                                }
                            }
                        }
                    }
                    mbVar.y.i1(i13, mbVar.O0, true);
                    mbVar.N0 = -1;
                    mbVar.M0 = 0L;
                }
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 13:
                ((org.telegram.ui.Components.na) this.f3).I0();
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 14:
                super.onLayout(z9, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                break;
            case 16:
                super.onLayout(z9, i7, i10, i11, i12);
                wk wkVar = (wk) this.f3;
                wk.a0(wkVar);
                wkVar.i0();
                break;
            case 21:
                ca0 ca0Var = (ca0) this.f3;
                int i15 = ca0Var.a;
                if (ca0Var.K) {
                    if (i15 != 0) {
                        v0(0);
                    }
                    ca0Var.K = false;
                }
                super.onLayout(z9, i7, i10, i11, i12);
                ca0Var.j();
                q1 q1Var = ca0Var.f;
                if (ca0Var.U) {
                    if (q1Var.computeVerticalScrollRange() > q1Var.computeVerticalScrollExtent()) {
                        ca0Var.postDelayed(new s90(ca0Var, 0), 0L);
                    }
                    ca0Var.U = false;
                }
                if (ca0Var.N && i15 == 0) {
                    int i16 = ca0Var.L;
                    int i17 = ca0Var.M;
                    ca0Var.N = false;
                    post(new jg.r(this, i16, i17, 13));
                    break;
                }
                break;
            case 23:
                super.onLayout(z9, i7, i10, i11, i12);
                ((dl0) this.f3).a();
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.e3) {
            case 1:
                int size = View.MeasureSpec.getSize(i7);
                View.MeasureSpec.getSize(i10);
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 11:
                if (!((kp) this.f3).H) {
                    break;
                }
                break;
            case 14:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((qi) this.f3).b.V3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
            case 17:
                if (((bm) this.f3).J == null) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.e3) {
            case 6:
                if (!((org.telegram.ui.h1) this.f3).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((gz) this.f3).p1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 26:
                if (!((at0) this.f3).n1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 27:
                if (!((yv0) this.f3).X1) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.e3) {
            case 19:
                super.setAlpha(f10);
                ((fz) this.f3).invalidate();
                break;
            case 29:
                super.setAlpha(f10);
                ((u61) this.f3).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, android.view.View
    public void setTranslationY(float f10) {
        switch (this.e3) {
            case 28:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.e3 = i7;
        this.f3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(hy hyVar, Context context, fy fyVar) {
        super(context, null);
        this.e3 = 18;
        this.f3 = hyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.i6, this.n2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(fyVar);
    }

    private final void z1(int i7) {
    }
}
