package ci;

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
import org.telegram.messenger.hs;
import org.telegram.messenger.ti;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.zl;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.Components.zy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cw;
import org.telegram.ui.ip;
import org.telegram.ui.is;
import org.telegram.ui.kw;
import org.telegram.ui.nq;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j1 extends tj0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(int i3, Context context, Object obj) {
        super(context, null);
        this.f3 = i3;
        this.g3 = obj;
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean E0(float f10) {
        switch (this.f3) {
            case 5:
                bi biVar = ((lg.h0) this.g3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + biVar.W3[0]) + (!biVar.Y1 ? org.telegram.messenger.g0.m : 0)));
            case 15:
                bi biVar2 = ((ej) this.g3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + biVar2.W3[0]) + (!biVar2.Y1 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean F0(View view) {
        switch (this.f3) {
            case 7:
                return view != ((org.telegram.ui.z6) this.g3).X;
            case 19:
                bz bzVar = (bz) this.g3;
                return bzVar.isEnabled() && !((kw) bzVar.K).b.k2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean H0(View view, float f10, float f11) {
        switch (this.f3) {
            case 0:
                ((p1) this.g3).getClass();
                return true;
            case 13:
                return ((org.telegram.ui.Components.ma) this.g3).J0(view, f10, f11);
            case 19:
                if (((bz) this.g3).n) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = ((zy) view).f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 29:
                if (((m61) this.g3).n) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF2 = ((k61) view).c;
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

    @Override // org.telegram.ui.Components.tj0
    public boolean R0() {
        switch (this.f3) {
            case 28:
                return getAdapter() != null && ((v41) this.g3).z1 && getAdapter().b() <= 2;
            default:
                return super.R0();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public Integer V0(int i3) {
        switch (this.f3) {
            case 1:
                return 0;
            case 24:
                return 0;
            default:
                return super.V0(i3);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        switch (this.f3) {
            case 29:
                super.addView(view, i3, layoutParams);
                if (!((m61) this.g3).W) {
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
                super.addView(view, i3, layoutParams);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ei.u0 u0Var;
        ui uiVar;
        ArrayList arrayList;
        j1 j1Var;
        x90 x90Var;
        int i3;
        j1 j1Var2;
        boolean z10;
        ui currentMessagesGroup;
        ui currentMessagesGroup2;
        switch (this.f3) {
            case 1:
                ei.k2 k2Var = (ei.k2) this.g3;
                int i10 = -1;
                if (!k2Var.g0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof ei.p0) || (u0Var = ((ei.p0) childAt).L) == null) {
                                i11++;
                            } else {
                                i10 = u0Var.a;
                            }
                        }
                    }
                }
                if (i10 > k2Var.G) {
                    k2Var.G = i10;
                    ei.a aVar = k2Var.j0.H1;
                    if (aVar != null) {
                        aVar.setCount(k2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                te teVar = (te) this.g3;
                j1 j1Var3 = teVar.c;
                if (j1Var3.getLayoutManager() != null && j1Var3.getAdapter() != null && j1Var3.getAdapter().b() != 0) {
                    float L = teVar.h - org.telegram.messenger.g0.L(8.0f);
                    teVar.e = L - org.telegram.messenger.g0.L(16.0f);
                    gh.g gVar = teVar.r;
                    if (gVar != null) {
                        gVar.draw(canvas);
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), teVar.d);
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
                x90 x90Var2 = (x90) this.g3;
                ai.h5 h5Var = x90Var2.b;
                boolean z11 = false;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt2).w3(h5Var.getMeasuredWidth(), h5Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                ui uiVar2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = getChildAt(i13);
                    if ((childAt3 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.q1) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != uiVar2)) {
                        uiVar2 = currentMessagesGroup2;
                    }
                }
                int i14 = 0;
                while (i14 < 3) {
                    da0 da0Var = x90Var2.d0;
                    ArrayList arrayList2 = da0Var.F;
                    j1 j1Var4 = x90Var2.f;
                    da0Var.F.clear();
                    int i15 = 2;
                    if (i14 != 2 || j1Var4.W1) {
                        int i16 = z11 ? 1 : 0;
                        ?? r12 = z11;
                        while (true) {
                            boolean z12 = true;
                            if (i16 < childCount) {
                                View childAt4 = j1Var4.getChildAt(i16);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt4;
                                    if (childAt4.getY() <= j1Var4.getHeight() && childAt4.getY() + childAt4.getHeight() >= 0.0f && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                                        ti tiVar = currentMessagesGroup.m;
                                        if ((i14 != 0 || currentMessagesGroup.d.size() != 1) && ((i14 != 1 || tiVar.i) && ((i14 != 0 || !q1Var.getMessageObject().Z) && ((i14 != 1 || q1Var.getMessageObject().Z) && ((i14 != i15 || q1Var.ya) && (i14 == i15 || !q1Var.ya)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                tiVar.a = r12;
                                                tiVar.b = r12;
                                                tiVar.c = r12;
                                                tiVar.d = r12;
                                                tiVar.l = r12;
                                                tiVar.k = r12;
                                                tiVar.m = q1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            tiVar.k = q1Var.H2();
                                            tiVar.l = q1Var.G2();
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
                                            if (q1Var.ya) {
                                                tiVar.m = q1Var;
                                            }
                                            int i18 = tiVar.b;
                                            if (i18 == 0 || backgroundDrawableTop < i18) {
                                                tiVar.b = backgroundDrawableTop;
                                            }
                                            int i19 = tiVar.d;
                                            if (i19 == 0 || i17 > i19) {
                                                tiVar.d = i17;
                                            }
                                            int i20 = tiVar.a;
                                            if (i20 == 0 || backgroundDrawableLeft < i20) {
                                                tiVar.a = backgroundDrawableLeft;
                                            }
                                            int i21 = tiVar.c;
                                            if (i21 == 0 || backgroundDrawableRight > i21) {
                                                tiVar.c = backgroundDrawableRight;
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
                                    ui uiVar3 = (ui) arrayList3.get(i22);
                                    if (uiVar3 == null) {
                                        arrayList = arrayList3;
                                        j1Var2 = j1Var4;
                                        z10 = z12;
                                        x90Var = x90Var2;
                                        i3 = i22;
                                    } else {
                                        ti tiVar2 = uiVar3.m;
                                        float R1 = tiVar2.m.R1(z12);
                                        float f10 = tiVar2.a + R1 + tiVar2.e;
                                        float f11 = tiVar2.b + tiVar2.f;
                                        float f12 = tiVar2.g + tiVar2.c + R1;
                                        float f13 = tiVar2.d + tiVar2.h;
                                        if (!tiVar2.j) {
                                            f11 += tiVar2.m.getTranslationY();
                                            f13 += tiVar2.m.getTranslationY();
                                        }
                                        if (f11 < (-org.telegram.messenger.g0.L(20.0f))) {
                                            f11 = -org.telegram.messenger.g0.L(20.0f);
                                        }
                                        float f14 = f11;
                                        if (f13 > org.telegram.messenger.g0.L(20.0f) + j1Var4.getMeasuredHeight()) {
                                            f13 = org.telegram.messenger.g0.L(20.0f) + j1Var4.getMeasuredHeight();
                                        }
                                        float f15 = f13;
                                        boolean z13 = (tiVar2.m.getScaleX() == 1.0f && tiVar2.m.getScaleY() == 1.0f) ? false : true;
                                        if (z13) {
                                            canvas.save();
                                            uiVar = uiVar3;
                                            arrayList = arrayList3;
                                            j1Var = j1Var4;
                                            canvas.scale(tiVar2.m.getScaleX(), tiVar2.m.getScaleY(), com.google.android.recaptcha.internal.a.z(f12, f10, 2.0f, f10), com.google.android.recaptcha.internal.a.z(f15, f14, 2.0f, f14));
                                        } else {
                                            uiVar = uiVar3;
                                            arrayList = arrayList3;
                                            j1Var = j1Var4;
                                        }
                                        x90Var = x90Var2;
                                        ui uiVar4 = uiVar;
                                        i3 = i22;
                                        j1Var2 = j1Var;
                                        z10 = true;
                                        tiVar2.m.K0(canvas, (int) f10, (int) f14, (int) f12, (int) f15, tiVar2.k, tiVar2.l, false, 0);
                                        tiVar2.m = null;
                                        tiVar2.o = uiVar4.c;
                                        if (z13) {
                                            canvas.restore();
                                            for (int i23 = 0; i23 < childCount; i23++) {
                                                View childAt5 = j1Var2.getChildAt(i23);
                                                if (childAt5 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt5;
                                                    if (q1Var2.getCurrentMessagesGroup() == uiVar4) {
                                                        int left = q1Var2.getLeft();
                                                        int top = q1Var2.getTop();
                                                        childAt5.setPivotX(((f12 - f10) / 2.0f) + (f10 - left));
                                                        childAt5.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i22 = i3 + 1;
                                    j1Var4 = j1Var2;
                                    x90Var2 = x90Var;
                                    arrayList3 = arrayList;
                                    z12 = z10;
                                }
                            }
                        }
                    }
                    i14++;
                    x90Var2 = x90Var2;
                    z11 = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 25:
                cw cwVar = (cw) this.g3;
                u4.b0 b0Var = cwVar.f0;
                u4.k kVar = cwVar.d0;
                bm0 bm0Var = cwVar.e0;
                if (bm0Var != null && kVar != null && b0Var != null && bm0Var.n0) {
                    canvas.save();
                    invalidate();
                    int b10 = bm0Var.b() - 1;
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
                if (bm0Var != null && kVar != null && b0Var != null && bm0Var.n0) {
                    canvas.restore();
                }
                if (bm0Var != null && bm0Var.p0 != null) {
                    canvas.save();
                    canvas.translate(bm0Var.p0.getLeft(), bm0Var.p0.getTranslationY() + bm0Var.p0.getTop());
                    bm0Var.p0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ai.o2 o2Var;
        u4.d1 K;
        int i3 = this.f3;
        Object obj = this.g3;
        switch (i3) {
            case 1:
                if (!((ei.k2) obj).g0) {
                    break;
                }
                break;
            case 3:
                if (!((gi.d3) obj).L) {
                    break;
                }
                break;
            case 16:
                if (motionEvent.getActionMasked() == 0) {
                    uk ukVar = (uk) obj;
                    if (motionEvent.getY() < ukVar.t0 && (o2Var = ukVar.K) != null && o2Var.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= org.telegram.messenger.g0.L(32.0f) + Math.max(0, K.a.getTop())) {
                    }
                }
                break;
            case 22:
                li0 li0Var = (li0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && li0Var.getPullingLeftProgress() > 0.95f) {
                        li0.a(li0Var);
                    } else if (li0Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = li0Var.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(li0Var.C0, 0.0f);
                        li0Var.z0 = ofFloat;
                        ofFloat.addUpdateListener(new y50(li0Var, 6));
                        li0Var.z0.setDuration(150L);
                        li0Var.z0.start();
                    }
                }
                break;
            case 24:
                LinearLayout linearLayout = ((tl0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ef  */
    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        ImageReceiver avatarImage;
        boolean z10;
        int y9;
        int b10;
        switch (this.f3) {
            case 9:
                org.telegram.ui.kb kbVar = (org.telegram.ui.kb) this.g3;
                if (view instanceof org.telegram.ui.Cells.y1) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    ((org.telegram.ui.Cells.y1) view).a(canvas);
                    canvas.restore();
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                if ((view instanceof org.telegram.ui.Cells.q1) && (avatarImage = (q1Var = (org.telegram.ui.Cells.q1) view).getAvatarImage()) != null) {
                    if (!q1Var.getMessageObject().Z) {
                        kbVar.w.getClass();
                        if (RecyclerView.R(q1Var) != -1) {
                            z10 = true;
                            if (!q1Var.getMessageObject().Z) {
                                avatarImage.O0(false, false);
                                break;
                            } else {
                                int y10 = (int) view.getY();
                                if (q1Var.m() && (b10 = kbVar.w.T(view).b()) >= 0) {
                                    if (kbVar.w.K(b10 + 1) != null) {
                                        avatarImage.O0(false, false);
                                        break;
                                    }
                                }
                                float checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                int layoutHeight = q1Var.getLayoutHeight() + ((int) view.getY());
                                int measuredHeight = kbVar.w.getMeasuredHeight() - kbVar.w.getPaddingBottom();
                                if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (q1Var.j() && (r13 = kbVar.w.T(view).b()) >= 0) {
                                    int i3 = 0;
                                    while (i3 < 20) {
                                        i3++;
                                        int b11 = b11 - 1;
                                        u4.d1 K = kbVar.w.K(b11);
                                        if (K != null) {
                                            View view2 = K.a;
                                            int top = view2.getTop();
                                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                                q1Var = (org.telegram.ui.Cells.q1) view2;
                                                if (q1Var.j()) {
                                                    y10 = top;
                                                }
                                            }
                                            y10 = top;
                                        }
                                    }
                                }
                                if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < y10) {
                                    layoutHeight = org.telegram.messenger.g0.L(48.0f) + y10;
                                }
                                if (!q1Var.m() && layoutHeight > (y9 = (int) (q1Var.getY() + q1Var.getMeasuredHeight()))) {
                                    layoutHeight = y9;
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
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    q1Var2.S0(canvas);
                    canvas.save();
                    canvas.translate(q1Var2.getX(), q1Var2.getY());
                    canvas.save();
                    canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
                    q1Var2.c1(canvas, true);
                    q1Var2.R2(true);
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
                dh.n0 n0Var = ((li0) this.g3).m0;
                if (n0Var == null || !(view instanceof ji0) || !((ji0) view).e.equals(n0Var)) {
                    break;
                }
                break;
            case 27:
                xv0 xv0Var = (xv0) this.g3;
                l2.e eVar = xv0Var.d2;
                if (!(view instanceof org.telegram.ui.Cells.y7) || !xv0Var.J1) {
                    break;
                } else {
                    int b12 = xv0Var.k1.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) eVar.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b12 - ((b12 / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) eVar.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b12 - ((b12 / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) eVar.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b12 - ((b12 / 6) * 6))).floatValue());
                    boolean drawChild3 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.f3) {
            case 1:
                super.invalidate();
                ((ei.k2) this.g3).invalidate();
                break;
            case 12:
                super.invalidate();
                View view = ((nq) this.g3).fragmentView;
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
    public void k0(int i3) {
        switch (this.f3) {
            case 21:
                if (i3 == 0) {
                    ((x90) this.g3).e.V();
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i3) {
        switch (this.f3) {
            case 5:
                break;
            case 17:
                am amVar = (am) this.g3;
                amVar.invalidate();
                amVar.b.M1(amVar, i3);
                zl zlVar = amVar.w;
                boolean z10 = true;
                int i10 = 0;
                boolean z11 = zlVar.y == null;
                if (z11) {
                    zlVar.y = zlVar.d();
                } else {
                    boolean[] d = zlVar.d();
                    if (d.length == zlVar.y.length) {
                        while (true) {
                            if (i10 >= d.length) {
                                z10 = z11;
                            } else if (d[i10] == zlVar.y[i10]) {
                                i10++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    zlVar.invalidate();
                    break;
                }
                break;
            case 21:
                ((x90) this.g3).e.G();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.f3) {
            case 10:
                super.onAttachedToWindow();
                kg.i1 i1Var = ((wm) this.g3).b4;
                if (i1Var != null) {
                    hs.f(i1Var.r).c(i1Var, hs.x5);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.f3) {
            case 10:
                super.onDetachedFromWindow();
                kg.i1 i1Var = ((wm) this.g3).b4;
                if (i1Var != null) {
                    org.telegram.messenger.g0.r(i1Var.F);
                    hs.f(i1Var.r).n(i1Var, hs.x5);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 2:
                is p10 = is.p();
                gi.t1 t1Var = (gi.t1) this.g3;
                boolean q10 = p10.q(motionEvent, t1Var.b, t1Var.f, this.o2);
                if (super.onInterceptTouchEvent(motionEvent) || q10) {
                }
                break;
            case 3:
                if (!((gi.d3) this.g3).L) {
                    break;
                }
                break;
            case 11:
                if (!((ip) this.g3).I) {
                    break;
                }
                break;
            case 14:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((qi) this.g3).b.W3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
            case 17:
                if (((am) this.g3).K == null) {
                    break;
                }
                break;
            case 18:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((ey) this.g3).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 26:
                boolean q11 = is.p().q(motionEvent, ((zs0) this.g3).j1, null, this.o2);
                if (super.onInterceptTouchEvent(motionEvent) || q11) {
                }
                break;
            case 27:
                xv0 xv0Var = (xv0) this.g3;
                if (xv0Var.J1) {
                    break;
                } else {
                    boolean q12 = is.p().q(motionEvent, xv0Var.k1, xv0Var.e2, this.o2);
                    if (super.onInterceptTouchEvent(motionEvent) || q12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        zi ziVar;
        switch (this.f3) {
            case 0:
                ((p1) this.g3).I0();
                super.onLayout(z10, i3, i10, i11, i12);
                break;
            case 9:
                org.telegram.ui.kb kbVar = (org.telegram.ui.kb) this.g3;
                if (kbVar.w != null && kbVar.y != null && (i13 = kbVar.O0) >= 0) {
                    if (kbVar.N0 != 0) {
                        int i14 = 0;
                        while (true) {
                            org.telegram.ui.hb hbVar = kbVar.F;
                            if (i14 < hbVar.d) {
                                if (i14 < hbVar.f || i14 >= hbVar.h) {
                                    ziVar = null;
                                } else {
                                    ArrayList arrayList = hbVar.n.p0;
                                    ziVar = (zi) arrayList.get((arrayList.size() - (i14 - hbVar.f)) - 1);
                                }
                                if (ziVar == null || ziVar.T != kbVar.N0) {
                                    i14++;
                                } else {
                                    i13 = i14;
                                }
                            }
                        }
                    }
                    kbVar.y.i1(i13, kbVar.P0, true);
                    kbVar.O0 = -1;
                    kbVar.N0 = 0L;
                }
                super.onLayout(z10, i3, i10, i11, i12);
                break;
            case 13:
                ((org.telegram.ui.Components.ma) this.g3).I0();
                super.onLayout(z10, i3, i10, i11, i12);
                break;
            case 14:
                super.onLayout(z10, i3, i10, i11, i12);
                PhotoViewer.v1().z0();
                break;
            case 16:
                super.onLayout(z10, i3, i10, i11, i12);
                uk ukVar = (uk) this.g3;
                uk.a0(ukVar);
                ukVar.i0();
                break;
            case 21:
                x90 x90Var = (x90) this.g3;
                int i15 = x90Var.a;
                if (x90Var.L) {
                    if (i15 != 0) {
                        v0(0);
                    }
                    x90Var.L = false;
                }
                super.onLayout(z10, i3, i10, i11, i12);
                x90Var.j();
                j1 j1Var = x90Var.f;
                if (x90Var.V) {
                    if (j1Var.computeVerticalScrollRange() > j1Var.computeVerticalScrollExtent()) {
                        x90Var.postDelayed(new o90(x90Var, 0), 0L);
                    }
                    x90Var.V = false;
                }
                if (x90Var.O && i15 == 0) {
                    int i16 = x90Var.M;
                    int i17 = x90Var.N;
                    x90Var.O = false;
                    post(new k2.u(this, i16, i17, 13));
                    break;
                }
                break;
            case 23:
                super.onLayout(z10, i3, i10, i11, i12);
                ((hl0) this.g3).a();
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.f3) {
            case 1:
                int size = View.MeasureSpec.getSize(i3);
                View.MeasureSpec.getSize(i10);
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 11:
                if (!((ip) this.g3).I) {
                    break;
                }
                break;
            case 14:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((qi) this.g3).b.W3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
            case 17:
                if (((am) this.g3).K == null) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.f3) {
            case 6:
                if (!((org.telegram.ui.i1) this.g3).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((cz) this.g3).q1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 26:
                if (!((zs0) this.g3).o1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 27:
                if (!((xv0) this.g3).Y1) {
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
                ((bz) this.g3).invalidate();
                break;
            case 29:
                super.setAlpha(f10);
                ((m61) this.g3).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, android.view.View
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
    public /* synthetic */ j1(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f3 = i3;
        this.g3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ey eyVar, Context context, cy cyVar) {
        super(context, null);
        this.f3 = 18;
        this.g3 = eyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.i6, this.o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        kg.y yVar = new kg.y(8);
        yVar.j1(0);
        setLayoutManager(yVar);
        setAdapter(cyVar);
    }

    private final void z1(int i3) {
    }
}
