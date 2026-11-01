package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.at;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.w71;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a10;
import org.telegram.ui.h00;
import org.telegram.ui.h50;
import org.telegram.ui.h8;
import org.telegram.ui.iq;
import org.telegram.ui.jx;
import org.telegram.ui.kt;
import org.telegram.ui.pb;
import org.telegram.ui.pr;
import org.telegram.ui.qx;
import org.telegram.ui.sb;
import org.telegram.ui.un;
import org.telegram.ui.w8;
import org.telegram.ui.y00;
import org.telegram.ui.y6;
import org.telegram.ui.yy;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b1 extends uk0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ Object f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, Context context, int i10) {
        super(context, null);
        this.e3 = i10;
        this.f3 = obj;
    }

    @Override // org.telegram.ui.Components.uk0
    public boolean E0(float f7) {
        switch (this.e3) {
            case 0:
                bi biVar = ((h1) this.f3).b;
                return f7 >= ((float) ((org.telegram.messenger.i0.L(30.0f) + biVar.V3[0]) + (!biVar.X1 ? org.telegram.messenger.i0.m : 0)));
            case 10:
                bi biVar2 = ((ej) this.f3).b;
                return f7 >= ((float) ((org.telegram.messenger.i0.L(30.0f) + biVar2.V3[0]) + (!biVar2.X1 ? org.telegram.messenger.i0.m : 0)));
            default:
                return super.E0(f7);
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public boolean F0(View view) {
        switch (this.e3) {
            case 2:
                return view != ((y6) this.f3).W;
            case 14:
                tz tzVar = (tz) this.f3;
                return tzVar.isEnabled() && !((qx) tzVar.J).b.j2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public boolean H0(View view, float f7, float f10) {
        switch (this.e3) {
            case 8:
                return ((ha) this.f3).J0(view, f7, f10);
            case 14:
                if (((tz) this.f3).n) {
                    int L = org.telegram.messenger.i0.L(6.0f);
                    RectF rectF = ((rz) view).f;
                    float f11 = L;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 24:
                if (((w71) this.f3).n) {
                    int L2 = org.telegram.messenger.i0.L(6.0f);
                    RectF rectF2 = ((u71) view).c;
                    float f12 = L2;
                    if (rectF2.left - f12 < f7 && rectF2.right + f12 > f7) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public boolean R0() {
        switch (this.e3) {
            case 23:
                return getAdapter() != null && ((f61) this.f3).y1 && getAdapter().b() <= 2;
            default:
                return super.R0();
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public Integer V0(int i10) {
        int i11;
        switch (this.e3) {
            case 19:
                return 0;
            case 25:
                i11 = ((DataSettingsActivity) this.f3).resetDownloadRow;
                p6 p6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(t6.r1(0.1f, t6.w0(t6.p7, p6Var))) : Integer.valueOf(t6.w0(t6.i6, p6Var));
            case 26:
                ArrayList arrayList = ((h00) this.f3).P;
                zz zzVar = (i10 < 0 || i10 >= arrayList.size()) ? null : (zz) arrayList.get(i10);
                p6 p6Var2 = this.n2;
                return (zzVar == null || !zzVar.l) ? Integer.valueOf(t6.w0(t6.i6, p6Var2)) : Integer.valueOf(t6.r1(0.12f, t6.w0(t6.p7, p6Var2)));
            default:
                return super.V0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.e3) {
            case 24:
                super.addView(view, i10, layoutParams);
                if (!((w71) this.f3).V) {
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
                super.addView(view, i10, layoutParams);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    @Override // org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fj fjVar;
        ArrayList arrayList;
        b1 b1Var;
        ua0 ua0Var;
        int i10;
        b1 b1Var2;
        boolean z10;
        fj currentMessagesGroup;
        fj currentMessagesGroup2;
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2 = canvas;
        switch (this.e3) {
            case 3:
                super.dispatchDraw(canvas);
                ((h8) this.f3).F = false;
                break;
            case 16:
                ua0 ua0Var2 = (ua0) this.f3;
                w8 w8Var = ua0Var2.b;
                boolean z11 = false;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).u3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                fj fjVar2 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.q1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != fjVar2)) {
                        fjVar2 = currentMessagesGroup2;
                    }
                }
                int i13 = 0;
                while (i13 < 3) {
                    ab0 ab0Var = ua0Var2.c0;
                    ArrayList arrayList2 = ab0Var.E;
                    b1 b1Var3 = ua0Var2.f;
                    ab0Var.E.clear();
                    int i14 = 2;
                    if (i13 != 2 || b1Var3.V1) {
                        int i15 = z11 ? 1 : 0;
                        ?? r12 = z11;
                        while (true) {
                            boolean z12 = true;
                            if (i15 < childCount) {
                                View childAt3 = b1Var3.getChildAt(i15);
                                if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt3;
                                    if (childAt3.getY() <= b1Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                                        org.telegram.messenger.ej ejVar = currentMessagesGroup.m;
                                        if ((i13 != 0 || currentMessagesGroup.d.size() != 1) && ((i13 != 1 || ejVar.i) && ((i13 != 0 || !q1Var.getMessageObject().Z) && ((i13 != 1 || q1Var.getMessageObject().Z) && ((i13 != i14 || q1Var.xa) && (i13 == i14 || !q1Var.xa)))))) {
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                ejVar.a = r12;
                                                ejVar.b = r12;
                                                ejVar.c = r12;
                                                ejVar.d = r12;
                                                ejVar.l = r12;
                                                ejVar.k = r12;
                                                ejVar.m = q1Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            ejVar.k = q1Var.F2();
                                            ejVar.l = q1Var.E2();
                                            int backgroundDrawableLeft = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                                            int backgroundDrawableRight = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                                            int backgroundDrawableTop = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                                            int backgroundDrawableBottom = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                                            if ((q1Var.getCurrentPosition().l & 4) == 0) {
                                                backgroundDrawableTop -= org.telegram.messenger.i0.L(10.0f);
                                            }
                                            if ((q1Var.getCurrentPosition().l & 8) == 0) {
                                                backgroundDrawableBottom = org.telegram.messenger.i0.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            int i16 = backgroundDrawableBottom;
                                            if (q1Var.xa) {
                                                ejVar.m = q1Var;
                                            }
                                            int i17 = ejVar.b;
                                            if (i17 == 0 || backgroundDrawableTop < i17) {
                                                ejVar.b = backgroundDrawableTop;
                                            }
                                            int i18 = ejVar.d;
                                            if (i18 == 0 || i16 > i18) {
                                                ejVar.d = i16;
                                            }
                                            int i19 = ejVar.a;
                                            if (i19 == 0 || backgroundDrawableLeft < i19) {
                                                ejVar.a = backgroundDrawableLeft;
                                            }
                                            int i20 = ejVar.c;
                                            if (i20 == 0 || backgroundDrawableRight > i20) {
                                                ejVar.c = backgroundDrawableRight;
                                            }
                                        }
                                    }
                                }
                                i15++;
                                i14 = 2;
                                r12 = 0;
                            } else {
                                int i21 = 0;
                                ArrayList arrayList3 = arrayList2;
                                while (i21 < arrayList3.size()) {
                                    fj fjVar3 = (fj) arrayList3.get(i21);
                                    if (fjVar3 == null) {
                                        arrayList = arrayList3;
                                        b1Var2 = b1Var3;
                                        z10 = z12;
                                        ua0Var = ua0Var2;
                                        i10 = i21;
                                    } else {
                                        org.telegram.messenger.ej ejVar2 = fjVar3.m;
                                        float P1 = ejVar2.m.P1(z12);
                                        float f7 = ejVar2.a + P1 + ejVar2.e;
                                        float f10 = ejVar2.b + ejVar2.f;
                                        float f11 = ejVar2.g + ejVar2.c + P1;
                                        float f12 = ejVar2.d + ejVar2.h;
                                        if (!ejVar2.j) {
                                            f10 += ejVar2.m.getTranslationY();
                                            f12 += ejVar2.m.getTranslationY();
                                        }
                                        if (f10 < (-org.telegram.messenger.i0.L(20.0f))) {
                                            f10 = -org.telegram.messenger.i0.L(20.0f);
                                        }
                                        float f13 = f10;
                                        if (f12 > org.telegram.messenger.i0.L(20.0f) + b1Var3.getMeasuredHeight()) {
                                            f12 = org.telegram.messenger.i0.L(20.0f) + b1Var3.getMeasuredHeight();
                                        }
                                        float f14 = f12;
                                        boolean z13 = (ejVar2.m.getScaleX() == 1.0f && ejVar2.m.getScaleY() == 1.0f) ? false : true;
                                        if (z13) {
                                            canvas2.save();
                                            fjVar = fjVar3;
                                            arrayList = arrayList3;
                                            b1Var = b1Var3;
                                            canvas2.scale(ejVar2.m.getScaleX(), ejVar2.m.getScaleY(), c3.i0.B(f11, f7, 2.0f, f7), c3.i0.B(f14, f13, 2.0f, f13));
                                        } else {
                                            fjVar = fjVar3;
                                            arrayList = arrayList3;
                                            b1Var = b1Var3;
                                        }
                                        ua0Var = ua0Var2;
                                        fj fjVar4 = fjVar;
                                        i10 = i21;
                                        b1Var2 = b1Var;
                                        z10 = true;
                                        ejVar2.m.I0(canvas2, (int) f7, (int) f13, (int) f11, (int) f14, ejVar2.k, ejVar2.l, false, 0);
                                        ejVar2.m = null;
                                        ejVar2.o = fjVar4.c;
                                        if (z13) {
                                            canvas.restore();
                                            for (int i22 = 0; i22 < childCount; i22++) {
                                                View childAt4 = b1Var2.getChildAt(i22);
                                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt4;
                                                    if (q1Var2.getCurrentMessagesGroup() == fjVar4) {
                                                        int left = q1Var2.getLeft();
                                                        int top = q1Var2.getTop();
                                                        childAt4.setPivotX(((f11 - f7) / 2.0f) + (f7 - left));
                                                        childAt4.setPivotY(((f14 - f13) / 2.0f) + (f13 - top));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i21 = i10 + 1;
                                    canvas2 = canvas;
                                    b1Var3 = b1Var2;
                                    ua0Var2 = ua0Var;
                                    arrayList3 = arrayList;
                                    z12 = z10;
                                }
                            }
                        }
                    }
                    i13++;
                    canvas2 = canvas;
                    ua0Var2 = ua0Var2;
                    z11 = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 20:
                jx jxVar = (jx) this.f3;
                s4.a0 a0Var = jxVar.e0;
                s4.j jVar = jxVar.c0;
                an0 an0Var = jxVar.d0;
                if (an0Var != null && jVar != null && a0Var != null && an0Var.m0) {
                    canvas2.save();
                    invalidate();
                    int b10 = an0Var.b() - 1;
                    int i23 = 0;
                    while (true) {
                        if (i23 < getChildCount()) {
                            View childAt5 = getChildAt(i23);
                            if (RecyclerView.R(childAt5) == b10) {
                                canvas2.clipRect(0.0f, 0.0f, getWidth(), childAt5.getTranslationY() + childAt5.getBottom());
                            } else {
                                i23++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (an0Var != null && jVar != null && a0Var != null && an0Var.m0) {
                    canvas2.restore();
                }
                if (an0Var != null && an0Var.o0 != null) {
                    canvas2.save();
                    canvas2.translate(an0Var.o0.getLeft(), an0Var.o0.getTranslationY() + an0Var.o0.getTop());
                    an0Var.o0.draw(canvas2);
                    canvas2.restore();
                    break;
                }
                break;
            case 27:
                if (getAdapter() == ((y00) this.f3).U) {
                    for (int i24 = 0; i24 < getChildCount(); i24++) {
                        if (T(getChildAt(i24)).f == 1) {
                            canvas2.save();
                            canvas2.translate(getChildAt(i24).getX(), (getChildAt(i24).getY() - getChildAt(i24).getMeasuredHeight()) + org.telegram.messenger.i0.L(2.0f));
                            getChildAt(i24).draw(canvas2);
                            canvas2.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 29:
                super.dispatchDraw(canvas);
                h50 h50Var = (h50) this.f3;
                if (h50Var.z0 != null && h50Var.A0 >= 1.0f) {
                    canvas2.save();
                    int measuredHeight = h50Var.z0.getMeasuredHeight();
                    lVar = ((org.telegram.ui.ActionBar.k2) h50Var).actionBar;
                    canvas2.translate(0.0f, -(measuredHeight - lVar.getMeasuredHeight()));
                    h50Var.z0.draw(canvas2);
                    canvas2.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.e3;
        Object obj = this.f3;
        switch (i10) {
            case 17:
                nj0 nj0Var = (nj0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && nj0Var.getPullingLeftProgress() > 0.95f) {
                        nj0.a(nj0Var);
                    } else if (nj0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = nj0Var.y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(nj0Var.B0, 0.0f);
                        nj0Var.y0 = ofFloat;
                        ofFloat.addUpdateListener(new r60(nj0Var, 6));
                        nj0Var.y0.setDuration(150L);
                        nj0Var.y0.start();
                    }
                }
                break;
            case 19:
                LinearLayout linearLayout = ((sm0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020a  */
    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        ImageReceiver avatarImage;
        boolean z10;
        int y3;
        int b10;
        switch (this.e3) {
            case 4:
                sb sbVar = (sb) this.f3;
                if (view instanceof org.telegram.ui.Cells.y1) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    ((org.telegram.ui.Cells.y1) view).a(canvas);
                    canvas.restore();
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                if ((view instanceof org.telegram.ui.Cells.q1) && (avatarImage = (q1Var = (org.telegram.ui.Cells.q1) view).getAvatarImage()) != null) {
                    if (!q1Var.getMessageObject().Z) {
                        sbVar.w.getClass();
                        if (RecyclerView.R(q1Var) != -1) {
                            z10 = true;
                            if (!q1Var.getMessageObject().Z) {
                                avatarImage.O0(false, false);
                                break;
                            } else {
                                int y10 = (int) view.getY();
                                if (q1Var.l() && (b10 = sbVar.w.T(view).b()) >= 0) {
                                    if (sbVar.w.K(b10 + 1) != null) {
                                        avatarImage.O0(false, false);
                                        break;
                                    }
                                }
                                float checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                int layoutHeight = q1Var.getLayoutHeight() + ((int) view.getY());
                                int measuredHeight = sbVar.w.getMeasuredHeight() - sbVar.w.getPaddingBottom();
                                if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (q1Var.g() && (r13 = sbVar.w.T(view).b()) >= 0) {
                                    int i10 = 0;
                                    while (i10 < 20) {
                                        i10++;
                                        int b11 = b11 - 1;
                                        s4.c1 K = sbVar.w.K(b11);
                                        if (K != null) {
                                            View view2 = K.a;
                                            int top = view2.getTop();
                                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                                q1Var = (org.telegram.ui.Cells.q1) view2;
                                                if (q1Var.g()) {
                                                    y10 = top;
                                                }
                                            }
                                            y10 = top;
                                        }
                                    }
                                }
                                if (layoutHeight - org.telegram.messenger.i0.L(48.0f) < y10) {
                                    layoutHeight = org.telegram.messenger.i0.L(48.0f) + y10;
                                }
                                if (!q1Var.l() && layoutHeight > (y3 = (int) (q1Var.getY() + q1Var.getMeasuredHeight()))) {
                                    layoutHeight = y3;
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                    canvas.translate(checkBoxTranslation, 0.0f);
                                }
                                if (q1Var.getCurrentMessagesGroup() != null && q1Var.getCurrentMessagesGroup().m.j) {
                                    layoutHeight = (int) (layoutHeight - q1Var.getTranslationY());
                                }
                                if (z10) {
                                    avatarImage.L0 = layoutHeight - org.telegram.messenger.i0.L(44.0f);
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
            case 16:
                if (!(view instanceof org.telegram.ui.Cells.q1)) {
                    break;
                } else {
                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    q1Var2.Q0(canvas);
                    canvas.save();
                    canvas.translate(q1Var2.getX(), q1Var2.getY());
                    canvas.save();
                    canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
                    q1Var2.a1(canvas, true);
                    q1Var2.P2(true);
                    q1Var2.e1(canvas);
                    if (q1Var2.getCurrentMessagesGroup() == null || ((q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().l & q1Var2.F()) != 0 && (q1Var2.getCurrentPosition().l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().i))) || q1Var2.getTransitionParams().x0)) {
                        q1Var2.O0(q1Var2.getAlpha(), canvas, false);
                        q1Var2.m1(canvas, q1Var2.getAlpha(), null);
                        q1Var2.T0(canvas, q1Var2.getAlpha());
                    }
                    if (q1Var2.getCurrentMessagesGroup() != null || q1Var2.getTransitionParams().x0) {
                        q1Var2.f1(canvas, q1Var2.getAlpha());
                    }
                    if ((q1Var2.getCurrentPosition() != null && q1Var2.getCurrentPosition().h) || q1Var2.getTransitionParams().x0) {
                        q1Var2.v1(q1Var2.getAlpha(), canvas, true);
                    }
                    q1Var2.h1(canvas);
                    canvas.restore();
                    q1Var2.getTransitionParams().d();
                    canvas.restore();
                    break;
                }
                break;
            case 17:
                sg.o0 o0Var = ((nj0) this.f3).l0;
                if (o0Var == null || !(view instanceof lj0) || !((lj0) view).e.equals(o0Var)) {
                    break;
                }
                break;
            case 22:
                dx0 dx0Var = (dx0) this.f3;
                j2.f fVar = dx0Var.c2;
                if (!(view instanceof d8) || !dx0Var.I1) {
                    break;
                } else {
                    int b12 = dx0Var.j1.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) fVar.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b12 - ((b12 / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) fVar.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b12 - ((b12 / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) fVar.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b12 - ((b12 / 6) * 6))).floatValue());
                    boolean drawChild3 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
            case 27:
                if (getAdapter() != ((y00) this.f3).U || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e3) {
            case 7:
                super.invalidate();
                View view = ((pr) this.f3).fragmentView;
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
    public void k0(int i10) {
        switch (this.e3) {
            case 16:
                if (i10 == 0) {
                    ((ua0) this.f3).e.V();
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i10) {
        switch (this.e3) {
            case 0:
                break;
            case 12:
                jm jmVar = (jm) this.f3;
                jmVar.invalidate();
                jmVar.b.L1(jmVar, i10);
                im imVar = jmVar.w;
                boolean z10 = true;
                int i11 = 0;
                boolean z11 = imVar.y == null;
                if (z11) {
                    imVar.y = imVar.d();
                } else {
                    boolean[] d = imVar.d();
                    if (d.length == imVar.y.length) {
                        while (true) {
                            if (i11 >= d.length) {
                                z10 = z11;
                            } else if (d[i11] == imVar.y[i11]) {
                                i11++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    imVar.invalidate();
                    break;
                }
                break;
            case 16:
                ((ua0) this.f3).e.G();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.e3) {
            case 5:
                super.onAttachedToWindow();
                zf.b1 b1Var = ((un) this.f3).a4;
                if (b1Var != null) {
                    at.f(b1Var.r).c(b1Var, at.x5);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.e3) {
            case 5:
                super.onDetachedFromWindow();
                zf.b1 b1Var = ((un) this.f3).a4;
                if (b1Var != null) {
                    org.telegram.messenger.i0.r(b1Var.E);
                    at.f(b1Var.r).n(b1Var, at.x5);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 6:
                if (!((iq) this.f3).H) {
                    break;
                }
                break;
            case 9:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((qi) this.f3).b.V3[0] - org.telegram.messenger.i0.L(80.0f)) {
                    break;
                }
                break;
            case 12:
                if (((jm) this.f3).J == null) {
                    break;
                }
                break;
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((vy) this.f3).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 21:
                boolean q6 = kt.p().q(motionEvent, ((eu0) this.f3).i1, null, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || q6) {
                }
                break;
            case 22:
                dx0 dx0Var = (dx0) this.f3;
                if (dx0Var.I1) {
                    break;
                } else {
                    boolean q10 = kt.p().q(motionEvent, dx0Var.j1, dx0Var.d2, this.n2);
                    if (super.onInterceptTouchEvent(motionEvent) || q10) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        kj kjVar;
        switch (this.e3) {
            case 4:
                sb sbVar = (sb) this.f3;
                if (sbVar.w != null && sbVar.y != null && (i14 = sbVar.N0) >= 0) {
                    if (sbVar.M0 != 0) {
                        int i15 = 0;
                        while (true) {
                            pb pbVar = sbVar.E;
                            if (i15 < pbVar.d) {
                                if (i15 < pbVar.f || i15 >= pbVar.h) {
                                    kjVar = null;
                                } else {
                                    ArrayList arrayList = pbVar.n.o0;
                                    kjVar = (kj) arrayList.get((arrayList.size() - (i15 - pbVar.f)) - 1);
                                }
                                if (kjVar == null || kjVar.T != sbVar.M0) {
                                    i15++;
                                } else {
                                    i14 = i15;
                                }
                            }
                        }
                    }
                    sbVar.y.i1(i14, sbVar.O0, true);
                    sbVar.N0 = -1;
                    sbVar.M0 = 0L;
                }
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 8:
                ((ha) this.f3).I0();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.v1().z0();
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                ((bl) this.f3).h0();
                break;
            case 16:
                ua0 ua0Var = (ua0) this.f3;
                int i16 = ua0Var.a;
                if (ua0Var.K) {
                    if (i16 != 0) {
                        v0(0);
                    }
                    ua0Var.K = false;
                }
                super.onLayout(z10, i10, i11, i12, i13);
                ua0Var.j();
                b1 b1Var = ua0Var.f;
                if (ua0Var.U) {
                    if (b1Var.computeVerticalScrollRange() > b1Var.computeVerticalScrollExtent()) {
                        ua0Var.postDelayed(new la0(ua0Var, 0), 0L);
                    }
                    ua0Var.U = false;
                }
                if (ua0Var.N && i16 == 0) {
                    int i17 = ua0Var.L;
                    int i18 = ua0Var.M;
                    ua0Var.N = false;
                    post(new i2.u(this, i17, i18, 12));
                    break;
                }
                break;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                ((hm0) this.f3).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 6:
                if (!((iq) this.f3).H) {
                    break;
                }
                break;
            case 9:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((qi) this.f3).b.V3[0] - org.telegram.messenger.i0.L(80.0f)) {
                    break;
                }
                break;
            case 12:
                if (((jm) this.f3).J == null) {
                    break;
                }
                break;
            case 28:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.i0.h3(new yy(this, 3), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.e3) {
            case 26:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.e3) {
            case 1:
                if (!((org.telegram.ui.j1) this.f3).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 15:
                if (!((uz) this.f3).p1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 21:
                if (!((eu0) this.f3).n1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 22:
                if (!((dx0) this.f3).X1) {
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
    public void setAlpha(float f7) {
        switch (this.e3) {
            case 14:
                super.setAlpha(f7);
                ((tz) this.f3).invalidate();
                break;
            case 24:
                super.setAlpha(f7);
                ((w71) this.f3).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0, android.view.View
    public void setTranslationY(float f7) {
        switch (this.e3) {
            case 23:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public boolean u1(View view) {
        switch (this.e3) {
            case 28:
                return !(view instanceof a10) || ((a10) view).getDraggingProgress() <= 0.0f;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, Context context, p6 p6Var, int i10) {
        super(context, p6Var);
        this.e3 = i10;
        this.f3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(vy vyVar, Context context, ty tyVar) {
        super(context, null);
        this.e3 = 13;
        this.f3 = vyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(org.telegram.messenger.i0.L(4.0f));
        a7.m(this, 20, t6.i6, this.n2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        dh.f fVar = new dh.f(7);
        fVar.j1(0);
        setLayoutManager(fVar);
        setAdapter(tyVar);
    }

    private final void z1(int i10) {
    }
}
