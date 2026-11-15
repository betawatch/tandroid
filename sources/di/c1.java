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
import org.telegram.messenger.ns;
import org.telegram.ui.Components.bt0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.hw;
import org.telegram.ui.mp;
import org.telegram.ui.pw;
import org.telegram.ui.qq;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c1 extends uj0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i7, Context context, Object obj) {
        super(context, null);
        this.f3 = i7;
        this.g3 = obj;
    }

    @Override // org.telegram.ui.Components.uj0
    public boolean E0(float f10) {
        switch (this.f3) {
            case 4:
                ki kiVar = ((kg.g0) this.g3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + kiVar.Z3[0]) + (!kiVar.b2 ? org.telegram.messenger.g0.m : 0)));
            case 15:
                ki kiVar2 = ((mj) this.g3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + kiVar2.Z3[0]) + (!kiVar2.b2 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.uj0
    public boolean F0(View view) {
        switch (this.f3) {
            case 7:
                return view != ((org.telegram.ui.y6) this.g3).X;
            case 19:
                iz izVar = (iz) this.g3;
                return izVar.isEnabled() && !((pw) izVar.K).b.l2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.uj0
    public boolean H0(View view, float f10, float f11) {
        switch (this.f3) {
            case 0:
                ((i1) this.g3).getClass();
                return true;
            case 13:
                return ((org.telegram.ui.Components.ja) this.g3).J0(view, f10, f11);
            case 19:
                if (((iz) this.g3).n) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = ((gz) view).f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 29:
                if (((v61) this.g3).n) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF2 = ((t61) view).c;
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

    @Override // org.telegram.ui.Components.uj0
    public boolean R0() {
        switch (this.f3) {
            case 28:
                return getAdapter() != null && ((e51) this.g3).C1 && getAdapter().b() <= 2;
            default:
                return super.R0();
        }
    }

    @Override // org.telegram.ui.Components.uj0
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
                if (!((v61) this.g3).W) {
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
    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fi.s0 s0Var;
        bj bjVar;
        ArrayList arrayList;
        c1 c1Var;
        da0 da0Var;
        int i7;
        c1 c1Var2;
        boolean z10;
        bj currentMessagesGroup;
        bj currentMessagesGroup2;
        switch (this.f3) {
            case 1:
                fi.c2 c2Var = (fi.c2) this.g3;
                int i10 = -1;
                if (!c2Var.g0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof fi.n0) || (s0Var = ((fi.n0) childAt).L) == null) {
                                i11++;
                            } else {
                                i10 = s0Var.a;
                            }
                        }
                    }
                }
                if (i10 > c2Var.G) {
                    c2Var.G = i10;
                    fi.a aVar = c2Var.j0.H1;
                    if (aVar != null) {
                        aVar.setCount(c2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 5:
                ve veVar = (ve) this.g3;
                c1 c1Var3 = veVar.c;
                if (c1Var3.getLayoutManager() != null && c1Var3.getAdapter() != null && c1Var3.getAdapter().b() != 0) {
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
                ((org.telegram.ui.i8) this.g3).G = false;
                break;
            case 21:
                da0 da0Var2 = (da0) this.g3;
                org.telegram.ui.v8 v8Var = da0Var2.b;
                boolean z11 = false;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt2).z3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                bj bjVar2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = getChildAt(i13);
                    if ((childAt3 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.q1) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != bjVar2)) {
                        bjVar2 = currentMessagesGroup2;
                    }
                }
                int i14 = 0;
                while (i14 < 3) {
                    ja0 ja0Var = da0Var2.d0;
                    ArrayList arrayList2 = ja0Var.F;
                    c1 c1Var4 = da0Var2.f;
                    ja0Var.F.clear();
                    int i15 = 2;
                    if (i14 != 2 || c1Var4.W1) {
                        int i16 = z11 ? 1 : 0;
                        ?? r12 = z11;
                        while (true) {
                            boolean z12 = true;
                            if (i16 < childCount) {
                                View childAt4 = c1Var4.getChildAt(i16);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt4;
                                    if (childAt4.getY() <= c1Var4.getHeight() && childAt4.getY() + childAt4.getHeight() >= 0.0f && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                                        aj ajVar = currentMessagesGroup.m;
                                        if ((i14 != 0 || currentMessagesGroup.d.size() != 1) && ((i14 != 1 || ajVar.i) && ((i14 != 0 || !q1Var.getMessageObject().Z) && ((i14 != 1 || q1Var.getMessageObject().Z) && ((i14 != i15 || q1Var.za) && (i14 == i15 || !q1Var.za)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                ajVar.a = r12;
                                                ajVar.b = r12;
                                                ajVar.c = r12;
                                                ajVar.d = r12;
                                                ajVar.l = r12;
                                                ajVar.k = r12;
                                                ajVar.m = q1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            ajVar.k = q1Var.J2();
                                            ajVar.l = q1Var.I2();
                                            int backgroundDrawableLeft = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                                            int backgroundDrawableRight = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                                            int backgroundDrawableTop = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                                            int backgroundDrawableBottom = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                                            if ((q1Var.getCurrentPosition().l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                            }
                                            if ((q1Var.getCurrentPosition().l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i17 = backgroundDrawableBottom;
                                            if (q1Var.za) {
                                                ajVar.m = q1Var;
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
                                        c1Var2 = c1Var4;
                                        z10 = z12;
                                        da0Var = da0Var2;
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
                                        if (f13 > org.telegram.messenger.g0.L(20.0f) + c1Var4.getMeasuredHeight()) {
                                            f13 = org.telegram.messenger.g0.L(20.0f) + c1Var4.getMeasuredHeight();
                                        }
                                        float f15 = f13;
                                        boolean z13 = (ajVar2.m.getScaleX() == 1.0f && ajVar2.m.getScaleY() == 1.0f) ? false : true;
                                        if (z13) {
                                            canvas.save();
                                            bjVar = bjVar3;
                                            arrayList = arrayList3;
                                            c1Var = c1Var4;
                                            canvas.scale(ajVar2.m.getScaleX(), ajVar2.m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f12, f10, 2.0f, f10), com.google.android.gms.internal.vision.e2.A(f15, f14, 2.0f, f14));
                                        } else {
                                            bjVar = bjVar3;
                                            arrayList = arrayList3;
                                            c1Var = c1Var4;
                                        }
                                        da0Var = da0Var2;
                                        bj bjVar4 = bjVar;
                                        i7 = i22;
                                        c1Var2 = c1Var;
                                        z10 = true;
                                        ajVar2.m.K0(canvas, (int) f10, (int) f14, (int) f12, (int) f15, ajVar2.k, ajVar2.l, false, 0);
                                        ajVar2.m = null;
                                        ajVar2.o = bjVar4.c;
                                        if (z13) {
                                            canvas.restore();
                                            for (int i23 = 0; i23 < childCount; i23++) {
                                                View childAt5 = c1Var2.getChildAt(i23);
                                                if (childAt5 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt5;
                                                    if (q1Var2.getCurrentMessagesGroup() == bjVar4) {
                                                        int left = q1Var2.getLeft();
                                                        int top = q1Var2.getTop();
                                                        childAt5.setPivotX(((f12 - f10) / 2.0f) + (f10 - left));
                                                        childAt5.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i22 = i7 + 1;
                                    c1Var4 = c1Var2;
                                    da0Var2 = da0Var;
                                    arrayList3 = arrayList;
                                    z12 = z10;
                                }
                            }
                        }
                    }
                    i14++;
                    da0Var2 = da0Var2;
                    z11 = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 25:
                hw hwVar = (hw) this.g3;
                v4.b0 b0Var = hwVar.f0;
                v4.k kVar = hwVar.d0;
                cm0 cm0Var = hwVar.e0;
                if (cm0Var != null && kVar != null && b0Var != null && cm0Var.n0) {
                    canvas.save();
                    invalidate();
                    int b10 = cm0Var.b() - 1;
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
                if (cm0Var != null && kVar != null && b0Var != null && cm0Var.n0) {
                    canvas.restore();
                }
                if (cm0Var != null && cm0Var.p0 != null) {
                    canvas.save();
                    canvas.translate(cm0Var.p0.getLeft(), cm0Var.p0.getTranslationY() + cm0Var.p0.getTop());
                    cm0Var.p0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bi.g2 g2Var;
        v4.e1 K;
        int i7 = this.f3;
        Object obj = this.g3;
        switch (i7) {
            case 1:
                if (!((fi.c2) obj).g0) {
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
                    dl dlVar = (dl) obj;
                    if (motionEvent.getY() < dlVar.t0 && (g2Var = dlVar.K) != null && g2Var.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= org.telegram.messenger.g0.L(32.0f) + Math.max(0, K.a.getTop())) {
                    }
                }
                break;
            case 22:
                mi0 mi0Var = (mi0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && mi0Var.getPullingLeftProgress() > 0.95f) {
                        mi0.a(mi0Var);
                    } else if (mi0Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = mi0Var.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(mi0Var.C0, 0.0f);
                        mi0Var.z0 = ofFloat;
                        ofFloat.addUpdateListener(new f60(mi0Var, 5));
                        mi0Var.z0.setDuration(150L);
                        mi0Var.z0.start();
                    }
                }
                break;
            case 24:
                LinearLayout linearLayout = ((ul0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ef  */
    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.q1 q1Var;
        ImageReceiver avatarImage;
        boolean z10;
        int y10;
        int b10;
        switch (this.f3) {
            case 9:
                org.telegram.ui.lb lbVar = (org.telegram.ui.lb) this.g3;
                if (view instanceof org.telegram.ui.Cells.y1) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    ((org.telegram.ui.Cells.y1) view).a(canvas);
                    canvas.restore();
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                if ((view instanceof org.telegram.ui.Cells.q1) && (avatarImage = (q1Var = (org.telegram.ui.Cells.q1) view).getAvatarImage()) != null) {
                    if (!q1Var.getMessageObject().Z) {
                        lbVar.w.getClass();
                        if (RecyclerView.R(q1Var) != -1) {
                            z10 = true;
                            if (!q1Var.getMessageObject().Z) {
                                avatarImage.O0(false, false);
                                break;
                            } else {
                                int y11 = (int) view.getY();
                                if (q1Var.m() && (b10 = lbVar.w.T(view).b()) >= 0) {
                                    if (lbVar.w.K(b10 + 1) != null) {
                                        avatarImage.O0(false, false);
                                        break;
                                    }
                                }
                                float checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                int layoutHeight = q1Var.getLayoutHeight() + ((int) view.getY());
                                int measuredHeight = lbVar.w.getMeasuredHeight() - lbVar.w.getPaddingBottom();
                                if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (q1Var.j() && (r13 = lbVar.w.T(view).b()) >= 0) {
                                    int i7 = 0;
                                    while (i7 < 20) {
                                        i7++;
                                        int b11 = b11 - 1;
                                        v4.e1 K = lbVar.w.K(b11);
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
                                if (z10) {
                                    avatarImage.M0 = layoutHeight - org.telegram.messenger.g0.L(44.0f);
                                }
                                if (q1Var.a()) {
                                    avatarImage.setAlpha(q1Var.getAlpha());
                                    canvas.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX() + q1Var.getX(), q1Var.getY() + (q1Var.getHeight() >> 1));
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
                    q1Var2.T2(true);
                    q1Var2.g1(canvas);
                    if (q1Var2.getCurrentMessagesGroup() == null || ((q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().l & q1Var2.D()) != 0 && (q1Var2.getCurrentPosition().l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().i))) || q1Var2.getTransitionParams().x0)) {
                        q1Var2.Q0(q1Var2.getAlpha(), canvas, false);
                        q1Var2.o1(canvas, q1Var2.getAlpha(), null);
                        q1Var2.V0(canvas, q1Var2.getAlpha());
                    }
                    if (q1Var2.getCurrentMessagesGroup() != null || q1Var2.getTransitionParams().x0) {
                        q1Var2.h1(canvas, q1Var2.getAlpha());
                    }
                    if ((q1Var2.getCurrentPosition() != null && q1Var2.getCurrentPosition().h) || q1Var2.getTransitionParams().x0) {
                        q1Var2.y1(q1Var2.getAlpha(), canvas, true);
                    }
                    q1Var2.j1(canvas);
                    canvas.restore();
                    q1Var2.getTransitionParams().d();
                    canvas.restore();
                    break;
                }
                break;
            case 22:
                ch.p0 p0Var = ((mi0) this.g3).m0;
                if (p0Var == null || !(view instanceof ki0) || !((ki0) view).e.equals(p0Var)) {
                    break;
                }
                break;
            case 27:
                bw0 bw0Var = (bw0) this.g3;
                a8.b8 b8Var = bw0Var.g2;
                if (!(view instanceof org.telegram.ui.Cells.y7) || !bw0Var.M1) {
                    break;
                } else {
                    int b12 = bw0Var.n1.T(view).b();
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
                ((fi.c2) this.g3).invalidate();
                break;
            case 12:
                super.invalidate();
                View view = ((qq) this.g3).fragmentView;
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
                    ((da0) this.g3).e.V();
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
                im imVar = (im) this.g3;
                imVar.invalidate();
                imVar.b.M1(imVar, i7);
                hm hmVar = imVar.w;
                boolean z10 = true;
                int i10 = 0;
                boolean z11 = hmVar.y == null;
                if (z11) {
                    hmVar.y = hmVar.d();
                } else {
                    boolean[] d = hmVar.d();
                    if (d.length == hmVar.y.length) {
                        while (true) {
                            if (i10 >= d.length) {
                                z10 = z11;
                            } else if (d[i10] == hmVar.y[i10]) {
                                i10++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    hmVar.invalidate();
                    break;
                }
                break;
            case 21:
                ((da0) this.g3).e.G();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.f3) {
            case 10:
                super.onAttachedToWindow();
                jg.l1 l1Var = ((an) this.g3).b4;
                if (l1Var != null) {
                    ns.f(l1Var.r).c(l1Var, ns.x5);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.f3) {
            case 10:
                super.onDetachedFromWindow();
                jg.l1 l1Var = ((an) this.g3).b4;
                if (l1Var != null) {
                    org.telegram.messenger.g0.r(l1Var.F);
                    ns.f(l1Var.r).n(l1Var, ns.x5);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 2:
                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
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
                if (!((mp) this.g3).I) {
                    break;
                }
                break;
            case 14:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((yi) this.g3).b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
            case 17:
                if (((im) this.g3).K == null) {
                    break;
                }
                break;
            case 18:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((ly) this.g3).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 26:
                boolean q11 = org.telegram.ui.ns.p().q(motionEvent, ((bt0) this.g3).m1, null, this.o2);
                if (super.onInterceptTouchEvent(motionEvent) || q11) {
                }
                break;
            case 27:
                bw0 bw0Var = (bw0) this.g3;
                if (bw0Var.M1) {
                    break;
                } else {
                    boolean q12 = org.telegram.ui.ns.p().q(motionEvent, bw0Var.n1, bw0Var.h2, this.o2);
                    if (super.onInterceptTouchEvent(motionEvent) || q12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        gj gjVar;
        switch (this.f3) {
            case 0:
                ((i1) this.g3).I0();
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
                ((org.telegram.ui.Components.ja) this.g3).I0();
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 14:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                break;
            case 16:
                super.onLayout(z10, i7, i10, i11, i12);
                dl dlVar = (dl) this.g3;
                dl.a0(dlVar);
                dlVar.i0();
                break;
            case 21:
                da0 da0Var = (da0) this.g3;
                int i15 = da0Var.a;
                if (da0Var.L) {
                    if (i15 != 0) {
                        v0(0);
                    }
                    da0Var.L = false;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                da0Var.j();
                c1 c1Var = da0Var.f;
                if (da0Var.V) {
                    if (c1Var.computeVerticalScrollRange() > c1Var.computeVerticalScrollExtent()) {
                        da0Var.postDelayed(new u90(da0Var, 0), 0L);
                    }
                    da0Var.V = false;
                }
                if (da0Var.O && i15 == 0) {
                    int i16 = da0Var.M;
                    int i17 = da0Var.N;
                    da0Var.O = false;
                    post(new jg.q(this, i16, i17, 14));
                    break;
                }
                break;
            case 23:
                super.onLayout(z10, i7, i10, i11, i12);
                ((il0) this.g3).a();
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
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

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 11:
                if (!((mp) this.g3).I) {
                    break;
                }
                break;
            case 14:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((yi) this.g3).b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
            case 17:
                if (((im) this.g3).K == null) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.f3) {
            case 6:
                if (!((org.telegram.ui.h1) this.g3).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((jz) this.g3).t1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 26:
                if (!((bt0) this.g3).r1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 27:
                if (!((bw0) this.g3).b2) {
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
                ((iz) this.g3).invalidate();
                break;
            case 29:
                super.setAlpha(f10);
                ((v61) this.g3).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, android.view.View
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
    public /* synthetic */ c1(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f3 = i7;
        this.g3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ly lyVar, Context context, jy jyVar) {
        super(context, null);
        this.f3 = 18;
        this.g3 = lyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.q6.l(this, 20, org.telegram.ui.ActionBar.j6.i6, this.o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(jyVar);
    }

    private final void z1(int i7) {
    }
}
