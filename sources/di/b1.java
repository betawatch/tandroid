package di;

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
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.kw;
import org.telegram.ui.np;
import org.telegram.ui.ns;
import org.telegram.ui.rq;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b1 extends ek0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(int i7, Context context, Object obj) {
        super(context, null);
        this.f3 = i7;
        this.g3 = obj;
    }

    @Override // org.telegram.ui.Components.ek0
    public boolean E0(float f10) {
        switch (this.f3) {
            case 4:
                ui uiVar = ((kg.h0) this.g3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + uiVar.Z3[0]) + (!uiVar.b2 ? org.telegram.messenger.g0.m : 0)));
            case 15:
                ui uiVar2 = ((vj) this.g3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + uiVar2.Z3[0]) + (!uiVar2.b2 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public boolean F0(View view) {
        switch (this.f3) {
            case 7:
                return view != ((org.telegram.ui.x6) this.g3).X;
            case 19:
                rz rzVar = (rz) this.g3;
                return rzVar.isEnabled() && !((tw) rzVar.K).b.l2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public boolean H0(View view, float f10, float f11) {
        switch (this.f3) {
            case 0:
                ((h1) this.g3).getClass();
                return true;
            case 13:
                return ((org.telegram.ui.Components.sa) this.g3).K0(view, f10, f11);
            case 19:
                if (((rz) this.g3).n) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = ((pz) view).f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 29:
                if (((i71) this.g3).n) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF2 = ((g71) view).c;
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

    @Override // org.telegram.ui.Components.ek0
    public boolean R0() {
        switch (this.f3) {
            case 28:
                return getAdapter() != null && ((r51) this.g3).C1 && getAdapter().b() <= 2;
            default:
                return super.R0();
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public Integer V0(int i7) {
        switch (this.f3) {
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
        switch (this.f3) {
            case 29:
                super.addView(view, i7, layoutParams);
                if (!((i71) this.g3).W) {
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
    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fi.r0 r0Var;
        bj bjVar;
        ArrayList arrayList;
        b1 b1Var;
        qa0 qa0Var;
        int i7;
        b1 b1Var2;
        boolean z10;
        bj currentMessagesGroup;
        bj currentMessagesGroup2;
        switch (this.f3) {
            case 1:
                fi.a2 a2Var = (fi.a2) this.g3;
                int i10 = -1;
                if (!a2Var.g0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof fi.m0) || (r0Var = ((fi.m0) childAt).L) == null) {
                                i11++;
                            } else {
                                i10 = r0Var.a;
                            }
                        }
                    }
                }
                if (i10 > a2Var.G) {
                    a2Var.G = i10;
                    fi.a aVar = a2Var.j0.H1;
                    if (aVar != null) {
                        aVar.setCount(a2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 5:
                ef efVar = (ef) this.g3;
                b1 b1Var3 = efVar.c;
                if (b1Var3.getLayoutManager() != null && b1Var3.getAdapter() != null && b1Var3.getAdapter().b() != 0) {
                    float L = efVar.h - org.telegram.messenger.g0.L(8.0f);
                    efVar.e = L - org.telegram.messenger.g0.L(16.0f);
                    fh.g gVar = efVar.r;
                    if (gVar != null) {
                        gVar.draw(canvas);
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), efVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 8:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.i8) this.g3).G = false;
                break;
            case 21:
                qa0 qa0Var2 = (qa0) this.g3;
                org.telegram.ui.w8 w8Var = qa0Var2.b;
                boolean z11 = false;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) childAt2).A3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                bj bjVar2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = getChildAt(i13);
                    if ((childAt3 instanceof org.telegram.ui.Cells.r1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.r1) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != bjVar2)) {
                        bjVar2 = currentMessagesGroup2;
                    }
                }
                int i14 = 0;
                while (i14 < 3) {
                    wa0 wa0Var = qa0Var2.d0;
                    ArrayList arrayList2 = wa0Var.F;
                    b1 b1Var4 = qa0Var2.f;
                    wa0Var.F.clear();
                    int i15 = 2;
                    if (i14 != 2 || b1Var4.W1) {
                        int i16 = z11 ? 1 : 0;
                        ?? r12 = z11;
                        while (true) {
                            boolean z12 = true;
                            if (i16 < childCount) {
                                View childAt4 = b1Var4.getChildAt(i16);
                                if (childAt4 instanceof org.telegram.ui.Cells.r1) {
                                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt4;
                                    if (childAt4.getY() <= b1Var4.getHeight() && childAt4.getY() + childAt4.getHeight() >= 0.0f && (currentMessagesGroup = r1Var.getCurrentMessagesGroup()) != null) {
                                        aj ajVar = currentMessagesGroup.m;
                                        if ((i14 != 0 || currentMessagesGroup.d.size() != 1) && ((i14 != 1 || ajVar.i) && ((i14 != 0 || !r1Var.getMessageObject().Z) && ((i14 != 1 || r1Var.getMessageObject().Z) && ((i14 != i15 || r1Var.za) && (i14 == i15 || !r1Var.za)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                ajVar.a = r12;
                                                ajVar.b = r12;
                                                ajVar.c = r12;
                                                ajVar.d = r12;
                                                ajVar.l = r12;
                                                ajVar.k = r12;
                                                ajVar.m = r1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            ajVar.k = r1Var.L2();
                                            ajVar.l = r1Var.K2();
                                            int backgroundDrawableLeft = r1Var.getBackgroundDrawableLeft() + r1Var.getLeft();
                                            int backgroundDrawableRight = r1Var.getBackgroundDrawableRight() + r1Var.getLeft();
                                            int backgroundDrawableTop = r1Var.getBackgroundDrawableTop() + r1Var.getPaddingTop() + r1Var.getTop();
                                            int backgroundDrawableBottom = r1Var.getBackgroundDrawableBottom() + r1Var.getPaddingTop() + r1Var.getTop();
                                            if ((r1Var.getCurrentPosition().l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                            }
                                            if ((r1Var.getCurrentPosition().l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i17 = backgroundDrawableBottom;
                                            if (r1Var.za) {
                                                ajVar.m = r1Var;
                                            }
                                            int i18 = ajVar.b;
                                            if (i18 == 0 || backgroundDrawableTop < i18) {
                                                ajVar.b = backgroundDrawableTop;
                                            }
                                            int i19 = ajVar.d;
                                            if (i19 == 0 || i17 > i19) {
                                                ajVar.d = i17;
                                            }
                                            int i20 = ajVar.a;
                                            if (i20 == 0 || backgroundDrawableLeft < i20) {
                                                ajVar.a = backgroundDrawableLeft;
                                            }
                                            int i21 = ajVar.c;
                                            if (i21 == 0 || backgroundDrawableRight > i21) {
                                                ajVar.c = backgroundDrawableRight;
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
                                    bj bjVar3 = (bj) arrayList3.get(i22);
                                    if (bjVar3 == null) {
                                        arrayList = arrayList3;
                                        b1Var2 = b1Var4;
                                        z10 = z12;
                                        qa0Var = qa0Var2;
                                        i7 = i22;
                                    } else {
                                        aj ajVar2 = bjVar3.m;
                                        float S1 = ajVar2.m.S1(z12);
                                        float f10 = ajVar2.a + S1 + ajVar2.e;
                                        float f11 = ajVar2.b + ajVar2.f;
                                        float f12 = ajVar2.g + ajVar2.c + S1;
                                        float f13 = ajVar2.d + ajVar2.h;
                                        if (!ajVar2.j) {
                                            f11 += ajVar2.m.getTranslationY();
                                            f13 += ajVar2.m.getTranslationY();
                                        }
                                        if (f11 < (-org.telegram.messenger.g0.L(20.0f))) {
                                            f11 = -org.telegram.messenger.g0.L(20.0f);
                                        }
                                        float f14 = f11;
                                        if (f13 > org.telegram.messenger.g0.L(20.0f) + b1Var4.getMeasuredHeight()) {
                                            f13 = org.telegram.messenger.g0.L(20.0f) + b1Var4.getMeasuredHeight();
                                        }
                                        float f15 = f13;
                                        boolean z13 = (ajVar2.m.getScaleX() == 1.0f && ajVar2.m.getScaleY() == 1.0f) ? false : true;
                                        if (z13) {
                                            canvas.save();
                                            bjVar = bjVar3;
                                            arrayList = arrayList3;
                                            b1Var = b1Var4;
                                            canvas.scale(ajVar2.m.getScaleX(), ajVar2.m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f12, f10, 2.0f, f10), com.google.android.gms.internal.vision.e2.A(f15, f14, 2.0f, f14));
                                        } else {
                                            bjVar = bjVar3;
                                            arrayList = arrayList3;
                                            b1Var = b1Var4;
                                        }
                                        qa0Var = qa0Var2;
                                        bj bjVar4 = bjVar;
                                        i7 = i22;
                                        b1Var2 = b1Var;
                                        z10 = true;
                                        ajVar2.m.K0(canvas, (int) f10, (int) f14, (int) f12, (int) f15, ajVar2.k, ajVar2.l, false, 0);
                                        ajVar2.m = null;
                                        ajVar2.o = bjVar4.c;
                                        if (z13) {
                                            canvas.restore();
                                            for (int i23 = 0; i23 < childCount; i23++) {
                                                View childAt5 = b1Var2.getChildAt(i23);
                                                if (childAt5 instanceof org.telegram.ui.Cells.r1) {
                                                    org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt5;
                                                    if (r1Var2.getCurrentMessagesGroup() == bjVar4) {
                                                        int left = r1Var2.getLeft();
                                                        int top = r1Var2.getTop();
                                                        childAt5.setPivotX(((f12 - f10) / 2.0f) + (f10 - left));
                                                        childAt5.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i22 = i7 + 1;
                                    b1Var4 = b1Var2;
                                    qa0Var2 = qa0Var;
                                    arrayList3 = arrayList;
                                    z12 = z10;
                                }
                            }
                        }
                    }
                    i14++;
                    qa0Var2 = qa0Var2;
                    z11 = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 25:
                kw kwVar = (kw) this.g3;
                v4.c0 c0Var = kwVar.f0;
                v4.k kVar = kwVar.d0;
                nm0 nm0Var = kwVar.e0;
                if (nm0Var != null && kVar != null && c0Var != null && nm0Var.n0) {
                    canvas.save();
                    invalidate();
                    int b10 = nm0Var.b() - 1;
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
                if (nm0Var != null && kVar != null && c0Var != null && nm0Var.n0) {
                    canvas.restore();
                }
                if (nm0Var != null && nm0Var.p0 != null) {
                    canvas.save();
                    canvas.translate(nm0Var.p0.getLeft(), nm0Var.p0.getTranslationY() + nm0Var.p0.getTop());
                    nm0Var.p0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bi.e3 e3Var;
        v4.f1 K;
        int i7 = this.f3;
        Object obj = this.g3;
        switch (i7) {
            case 1:
                if (!((fi.a2) obj).g0) {
                    break;
                }
                break;
            case 3:
                if (!((hi.d3) obj).L) {
                    break;
                }
                break;
            case 16:
                if (motionEvent.getActionMasked() == 0) {
                    ml mlVar = (ml) obj;
                    if (motionEvent.getY() < mlVar.t0 && (e3Var = mlVar.K) != null && e3Var.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= org.telegram.messenger.g0.L(32.0f) + Math.max(0, K.a.getTop())) {
                    }
                }
                break;
            case 22:
                xi0 xi0Var = (xi0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && xi0Var.getPullingLeftProgress() > 0.95f) {
                        xi0.a(xi0Var);
                    } else if (xi0Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = xi0Var.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(xi0Var.C0, 0.0f);
                        xi0Var.z0 = ofFloat;
                        ofFloat.addUpdateListener(new h60(xi0Var, 7));
                        xi0Var.z0.setDuration(150L);
                        xi0Var.z0.start();
                    }
                }
                break;
            case 24:
                LinearLayout linearLayout = ((em0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ef  */
    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.r1 r1Var;
        ImageReceiver avatarImage;
        boolean z10;
        int y10;
        int b10;
        switch (this.f3) {
            case 9:
                org.telegram.ui.lb lbVar = (org.telegram.ui.lb) this.g3;
                if (view instanceof org.telegram.ui.Cells.z1) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    ((org.telegram.ui.Cells.z1) view).a(canvas);
                    canvas.restore();
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                if ((view instanceof org.telegram.ui.Cells.r1) && (avatarImage = (r1Var = (org.telegram.ui.Cells.r1) view).getAvatarImage()) != null) {
                    if (!r1Var.getMessageObject().Z) {
                        lbVar.w.getClass();
                        if (RecyclerView.R(r1Var) != -1) {
                            z10 = true;
                            if (!r1Var.getMessageObject().Z) {
                                avatarImage.O0(false, false);
                                break;
                            } else {
                                int y11 = (int) view.getY();
                                if (r1Var.m() && (b10 = lbVar.w.T(view).b()) >= 0) {
                                    if (lbVar.w.K(b10 + 1) != null) {
                                        avatarImage.O0(false, false);
                                        break;
                                    }
                                }
                                float checkBoxTranslation = r1Var.getCheckBoxTranslation() + r1Var.getSlidingOffsetX();
                                int layoutHeight = r1Var.getLayoutHeight() + ((int) view.getY());
                                int measuredHeight = lbVar.w.getMeasuredHeight() - lbVar.w.getPaddingBottom();
                                if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (r1Var.j() && (r13 = lbVar.w.T(view).b()) >= 0) {
                                    int i7 = 0;
                                    while (i7 < 20) {
                                        i7++;
                                        int b11 = b11 - 1;
                                        v4.f1 K = lbVar.w.K(b11);
                                        if (K != null) {
                                            View view2 = K.a;
                                            int top = view2.getTop();
                                            if (view2 instanceof org.telegram.ui.Cells.r1) {
                                                r1Var = (org.telegram.ui.Cells.r1) view2;
                                                if (r1Var.j()) {
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
                                if (!r1Var.m() && layoutHeight > (y10 = (int) (r1Var.getY() + r1Var.getMeasuredHeight()))) {
                                    layoutHeight = y10;
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                    canvas.translate(checkBoxTranslation, 0.0f);
                                }
                                if (r1Var.getCurrentMessagesGroup() != null && r1Var.getCurrentMessagesGroup().m.j) {
                                    layoutHeight = (int) (layoutHeight - r1Var.getTranslationY());
                                }
                                if (z10) {
                                    avatarImage.M0 = layoutHeight - org.telegram.messenger.g0.L(44.0f);
                                }
                                if (r1Var.b()) {
                                    avatarImage.setAlpha(r1Var.getAlpha());
                                    canvas.scale(r1Var.getScaleX(), r1Var.getScaleY(), r1Var.getPivotX() + r1Var.getX(), r1Var.getY() + (r1Var.getHeight() >> 1));
                                } else {
                                    avatarImage.setAlpha(1.0f);
                                }
                                if (z10) {
                                    avatarImage.O0(true, false);
                                }
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (!r1Var.getMessageObject().Z) {
                    }
                }
                break;
            case 21:
                if (!(view instanceof org.telegram.ui.Cells.r1)) {
                    break;
                } else {
                    org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) view;
                    boolean drawChild2 = super.drawChild(canvas, view, j3);
                    r1Var2.S0(canvas);
                    canvas.save();
                    canvas.translate(r1Var2.getX(), r1Var2.getY());
                    canvas.save();
                    canvas.scale(r1Var2.getScaleX(), r1Var2.getScaleY(), r1Var2.getPivotX(), r1Var2.getPivotY());
                    r1Var2.c1(canvas, true);
                    r1Var2.V2(true);
                    r1Var2.g1(canvas);
                    if (r1Var2.getCurrentMessagesGroup() == null || ((r1Var2.getCurrentPosition() != null && (((r1Var2.getCurrentPosition().l & r1Var2.B()) != 0 && (r1Var2.getCurrentPosition().l & 1) != 0) || (r1Var2.getCurrentMessagesGroup() != null && r1Var2.getCurrentMessagesGroup().i))) || r1Var2.getTransitionParams().x0)) {
                        r1Var2.Q0(r1Var2.getAlpha(), canvas, false);
                        r1Var2.o1(canvas, r1Var2.getAlpha(), null);
                        r1Var2.V0(canvas, r1Var2.getAlpha());
                    }
                    if (r1Var2.getCurrentMessagesGroup() != null || r1Var2.getTransitionParams().x0) {
                        r1Var2.h1(canvas, r1Var2.getAlpha());
                    }
                    if ((r1Var2.getCurrentPosition() != null && r1Var2.getCurrentPosition().h) || r1Var2.getTransitionParams().x0) {
                        r1Var2.y1(r1Var2.getAlpha(), canvas, true);
                    }
                    r1Var2.j1(canvas);
                    canvas.restore();
                    r1Var2.getTransitionParams().d();
                    canvas.restore();
                    break;
                }
                break;
            case 22:
                ch.p0 p0Var = ((xi0) this.g3).m0;
                if (p0Var == null || !(view instanceof vi0) || !((vi0) view).e.equals(p0Var)) {
                    break;
                }
                break;
            case 27:
                kw0 kw0Var = (kw0) this.g3;
                a8.b8 b8Var = kw0Var.g2;
                if (!(view instanceof org.telegram.ui.Cells.a8) || !kw0Var.M1) {
                    break;
                } else {
                    int b12 = kw0Var.n1.T(view).b();
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
        switch (this.f3) {
            case 1:
                super.invalidate();
                ((fi.a2) this.g3).invalidate();
                break;
            case 12:
                super.invalidate();
                View view = ((rq) this.g3).fragmentView;
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
        switch (this.f3) {
            case 21:
                if (i7 == 0) {
                    ((qa0) this.g3).e.V();
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i7) {
        switch (this.f3) {
            case 4:
                break;
            case 17:
                rm rmVar = (rm) this.g3;
                rmVar.invalidate();
                rmVar.b.N1(rmVar, i7);
                qm qmVar = rmVar.w;
                boolean z10 = true;
                int i10 = 0;
                boolean z11 = qmVar.y == null;
                if (z11) {
                    qmVar.y = qmVar.d();
                } else {
                    boolean[] d = qmVar.d();
                    if (d.length == qmVar.y.length) {
                        while (true) {
                            if (i10 >= d.length) {
                                z10 = z11;
                            } else if (d[i10] == qmVar.y[i10]) {
                                i10++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    qmVar.invalidate();
                    break;
                }
                break;
            case 21:
                ((qa0) this.g3).e.G();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.f3) {
            case 10:
                super.onAttachedToWindow();
                jg.l1 l1Var = ((bn) this.g3).b4;
                if (l1Var != null) {
                    ls.f(l1Var.r).c(l1Var, ls.A5);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.f3) {
            case 10:
                super.onDetachedFromWindow();
                jg.l1 l1Var = ((bn) this.g3).b4;
                if (l1Var != null) {
                    org.telegram.messenger.g0.r(l1Var.F);
                    ls.f(l1Var.r).n(l1Var, ls.A5);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 2:
                ns p10 = ns.p();
                hi.t1 t1Var = (hi.t1) this.g3;
                boolean q10 = p10.q(motionEvent, t1Var.b, t1Var.f, this.o2);
                if (super.onInterceptTouchEvent(motionEvent) || q10) {
                }
                break;
            case 3:
                if (!((hi.d3) this.g3).L) {
                    break;
                }
                break;
            case 11:
                if (!((np) this.g3).I) {
                    break;
                }
                break;
            case 14:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((hj) this.g3).b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
            case 17:
                if (((rm) this.g3).K == null) {
                    break;
                }
                break;
            case 18:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((ty) this.g3).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 26:
                boolean q11 = ns.p().q(motionEvent, ((mt0) this.g3).m1, null, this.o2);
                if (super.onInterceptTouchEvent(motionEvent) || q11) {
                }
                break;
            case 27:
                kw0 kw0Var = (kw0) this.g3;
                if (kw0Var.M1) {
                    break;
                } else {
                    boolean q12 = ns.p().q(motionEvent, kw0Var.n1, kw0Var.h2, this.o2);
                    if (super.onInterceptTouchEvent(motionEvent) || q12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        gj gjVar;
        switch (this.f3) {
            case 0:
                ((h1) this.g3).J0();
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 9:
                org.telegram.ui.lb lbVar = (org.telegram.ui.lb) this.g3;
                if (lbVar.w != null && lbVar.y != null && (i13 = lbVar.O0) >= 0) {
                    if (lbVar.N0 != 0) {
                        int i14 = 0;
                        while (true) {
                            org.telegram.ui.ib ibVar = lbVar.F;
                            if (i14 < ibVar.d) {
                                if (i14 < ibVar.f || i14 >= ibVar.h) {
                                    gjVar = null;
                                } else {
                                    ArrayList arrayList = ibVar.n.p0;
                                    gjVar = (gj) arrayList.get((arrayList.size() - (i14 - ibVar.f)) - 1);
                                }
                                if (gjVar == null || gjVar.T != lbVar.N0) {
                                    i14++;
                                } else {
                                    i13 = i14;
                                }
                            }
                        }
                    }
                    lbVar.y.i1(i13, lbVar.P0, true);
                    lbVar.O0 = -1;
                    lbVar.N0 = 0L;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 13:
                ((org.telegram.ui.Components.sa) this.g3).J0();
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 14:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                break;
            case 16:
                super.onLayout(z10, i7, i10, i11, i12);
                ml mlVar = (ml) this.g3;
                ml.a0(mlVar);
                mlVar.i0();
                break;
            case 21:
                qa0 qa0Var = (qa0) this.g3;
                int i15 = qa0Var.a;
                if (qa0Var.L) {
                    if (i15 != 0) {
                        v0(0);
                    }
                    qa0Var.L = false;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                qa0Var.j();
                b1 b1Var = qa0Var.f;
                if (qa0Var.V) {
                    if (b1Var.computeVerticalScrollRange() > b1Var.computeVerticalScrollExtent()) {
                        qa0Var.postDelayed(new ha0(qa0Var, 0), 0L);
                    }
                    qa0Var.V = false;
                }
                if (qa0Var.O && i15 == 0) {
                    int i16 = qa0Var.M;
                    int i17 = qa0Var.N;
                    qa0Var.O = false;
                    post(new jg.q(this, i16, i17, 14));
                    break;
                }
                break;
            case 23:
                super.onLayout(z10, i7, i10, i11, i12);
                ((sl0) this.g3).a();
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.f3) {
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

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 11:
                if (!((np) this.g3).I) {
                    break;
                }
                break;
            case 14:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((hj) this.g3).b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
            case 17:
                if (((rm) this.g3).K == null) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.f3) {
            case 6:
                if (!((org.telegram.ui.h1) this.g3).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((sz) this.g3).t1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 26:
                if (!((mt0) this.g3).r1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 27:
                if (!((kw0) this.g3).b2) {
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
        switch (this.f3) {
            case 19:
                super.setAlpha(f10);
                ((rz) this.g3).invalidate();
                break;
            case 29:
                super.setAlpha(f10);
                ((i71) this.g3).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, android.view.View
    public void setTranslationY(float f10) {
        switch (this.f3) {
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
    public /* synthetic */ b1(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f3 = i7;
        this.g3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(ty tyVar, Context context, ry ryVar) {
        super(context, null);
        this.f3 = 18;
        this.g3 = tyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.t6.l(this, 20, org.telegram.ui.ActionBar.m6.i6, this.o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(ryVar);
    }

    private final void z1(int i7) {
    }
}
