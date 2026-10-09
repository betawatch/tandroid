package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yz;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dy;
import org.telegram.ui.f10;
import org.telegram.ui.nq;
import org.telegram.ui.rt;
import org.telegram.ui.sw;
import org.telegram.ui.tr;
import org.telegram.ui.uz;
import org.telegram.ui.w00;
import org.telegram.ui.w10;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w0 extends qm0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ Object W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(Object obj, Context context, int i10) {
        super(context, null);
        this.V2 = i10;
        this.W2 = obj;
    }

    @Override // org.telegram.ui.Components.qm0
    public boolean E0(float f7) {
        switch (this.V2) {
            case 3:
                yi yiVar = ((hg.j0) this.W2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + yiVar.e2[0]) + (!yiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
            case 12:
                yi yiVar2 = ((ck) this.W2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + yiVar2.e2[0]) + (!yiVar2.g0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f7);
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public boolean F0(View view) {
        switch (this.V2) {
            case 5:
                return view != ((org.telegram.ui.y6) this.W2).Q;
            case 16:
                a10 a10Var = (a10) this.W2;
                return a10Var.isEnabled() && !((sw) a10Var.J).b.j2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public boolean H0(View view, float f7, float f10) {
        switch (this.V2) {
            case 10:
                return ((org.telegram.ui.Components.eb) this.W2).v(view, f7, f10);
            case 16:
                if (((a10) this.W2).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((y00) view).f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((n91) this.W2).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((l91) view).c;
                    float f12 = dp2;
                    if (rectF2.left - f12 < f7 && rectF2.right + f12 > f7) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public boolean S0() {
        switch (this.V2) {
            case 24:
                return getAdapter() != null && ((t71) this.W2).H && getAdapter().h() <= 2;
            default:
                return super.S0();
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public Integer W0(int i10) {
        int i11;
        switch (this.V2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                i11 = ((DataSettingsActivity) this.W2).resetDownloadRow;
                org.telegram.ui.ActionBar.e6 e6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.p7, e6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var));
            case 27:
                ArrayList arrayList = ((f10) this.W2).P;
                w00 w00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (w00) arrayList.get(i10);
                org.telegram.ui.ActionBar.e6 e6Var2 = this.n2;
                return (w00Var == null || !w00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.p7, e6Var2)));
            default:
                return super.W0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.V2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (!((n91) this.W2).V) {
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

    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m1 m1Var;
        switch (this.V2) {
            case 0:
                s3 s3Var = (s3) this.W2;
                int i10 = -1;
                if (!s3Var.f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof h1) || (m1Var = ((h1) childAt).K) == null) {
                                i11++;
                            } else {
                                i10 = m1Var.a;
                            }
                        }
                    }
                }
                if (i10 > s3Var.F) {
                    s3Var.F = i10;
                    c cVar = s3Var.i0.X1;
                    if (cVar != null) {
                        cVar.setCount(s3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                qf qfVar = (qf) this.W2;
                w0 w0Var = qfVar.c;
                if (w0Var.getLayoutManager() != null && w0Var.getAdapter() != null && w0Var.getAdapter().h() != 0) {
                    float dp = qfVar.h - AndroidUtilities.dp(8.0f);
                    qfVar.e = dp - AndroidUtilities.dp(16.0f);
                    ch.d dVar = qfVar.r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), qfVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.g8) this.W2).F = false;
                break;
            case 21:
                dy dyVar = (dy) this.W2;
                s4.d0 d0Var = dyVar.c0;
                s4.j jVar = dyVar.a0;
                wo0 wo0Var = dyVar.b0;
                if (wo0Var != null && jVar != null && d0Var != null && wo0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = wo0Var.h() - 1;
                    int i12 = 0;
                    while (true) {
                        if (i12 < getChildCount()) {
                            View childAt2 = getChildAt(i12);
                            if (RecyclerView.R(childAt2) == h) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt2.getTranslationY() + childAt2.getBottom());
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (wo0Var != null && jVar != null && d0Var != null && wo0Var.m0) {
                    canvas.restore();
                }
                if (wo0Var != null && wo0Var.o0 != null) {
                    canvas.save();
                    canvas.translate(wo0Var.o0.getLeft(), wo0Var.o0.getTranslationY() + wo0Var.o0.getTop());
                    wo0Var.o0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                if (getAdapter() == ((w10) this.W2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i13).getX(), (getChildAt(i13).getY() - getChildAt(i13).getMeasuredHeight()) + AndroidUtilities.dp(2.0f));
                            getChildAt(i13).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.V2;
        Object obj = this.W2;
        switch (i10) {
            case 0:
                if (!((s3) obj).f0) {
                    break;
                }
                break;
            case 18:
                kl0 kl0Var = (kl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && kl0Var.getPullingLeftProgress() > 0.95f) {
                        kl0.a(kl0Var);
                    } else if (kl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = kl0Var.y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(kl0Var.B0, 0.0f);
                        kl0Var.y0 = ofFloat;
                        ofFloat.addUpdateListener(new j80(kl0Var, 7));
                        kl0Var.y0.setDuration(150L);
                        kl0Var.y0.start();
                    }
                }
                break;
            case 20:
                LinearLayout linearLayout = ((no0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.V2) {
            case 18:
                zg.n0 n0Var = ((kl0) this.W2).l0;
                if (n0Var == null || !(view instanceof il0) || !((il0) view).e.equals(n0Var)) {
                    break;
                }
                break;
            case 23:
                xy0 xy0Var = (xy0) this.W2;
                com.google.firebase.messaging.n nVar = xy0Var.l0;
                if (!(view instanceof org.telegram.ui.Cells.f8) || !xy0Var.R) {
                    break;
                } else {
                    int b10 = xy0Var.c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) nVar.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) nVar.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) nVar.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue());
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
            case 28:
                if (getAdapter() != ((w10) this.W2).U || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.V2) {
            case 0:
                super.invalidate();
                ((s3) this.W2).invalidate();
                break;
            case 9:
                super.invalidate();
                View view = ((tr) this.W2).fragmentView;
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
    public void k0(int i10, int i11) {
        switch (this.V2) {
            case 3:
                break;
            case 14:
                hn hnVar = (hn) this.W2;
                hnVar.invalidate();
                hnVar.b.b2(hnVar, i11);
                gn gnVar = hnVar.v;
                boolean z10 = true;
                int i12 = 0;
                boolean z11 = gnVar.x == null;
                if (z11) {
                    gnVar.x = gnVar.d();
                } else {
                    boolean[] d = gnVar.d();
                    if (d.length == gnVar.x.length) {
                        while (true) {
                            if (i12 >= d.length) {
                                z10 = z11;
                            } else if (d[i12] == gnVar.x[i12]) {
                                i12++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    gnVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.V2) {
            case 7:
                super.onAttachedToWindow();
                gg.n1 n1Var = ((zn) this.W2).M3;
                if (n1Var != null) {
                    NotificationCenter.getInstance(n1Var.r).addObserver(n1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.V2) {
            case 7:
                super.onDetachedFromWindow();
                gg.n1 n1Var = ((zn) this.W2).M3;
                if (n1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n1Var.E);
                    NotificationCenter.getInstance(n1Var.r).removeObserver(n1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.V2) {
            case 1:
                rt q6 = rt.q();
                ci.y1 y1Var = (ci.y1) this.W2;
                boolean r10 = q6.r(motionEvent, y1Var.b, y1Var.f, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || r10) {
                }
                break;
            case 8:
                if (!((nq) this.W2).H) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((nj) this.W2).b.e2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((hn) this.W2).J == null) {
                    break;
                }
                break;
            case 15:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((a00) this.W2).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 22:
                boolean r11 = rt.q().r(motionEvent, ((fw0) this.W2).b, null, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || r11) {
                }
                break;
            case 23:
                xy0 xy0Var = (xy0) this.W2;
                if (xy0Var.R) {
                    break;
                } else {
                    boolean r12 = rt.q().r(motionEvent, xy0Var.c, xy0Var.m0, this.n2);
                    if (super.onInterceptTouchEvent(motionEvent) || r12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.V2) {
            case 10:
                ((org.telegram.ui.Components.eb) this.W2).u();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ((xl) this.W2).h0();
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((bo0) this.W2).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.V2) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                View.MeasureSpec.getSize(i11);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V2) {
            case 8:
                if (!((nq) this.W2).H) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((nj) this.W2).b.e2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((hn) this.W2).J == null) {
                    break;
                }
                break;
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new uz(this, 3), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.V2) {
            case 27:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.V2) {
            case 4:
                if (!((org.telegram.ui.k1) this.W2).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 17:
                if (!((d10) this.W2).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 22:
                if (!((fw0) this.W2).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((xy0) this.W2).g0) {
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
        switch (this.V2) {
            case 16:
                super.setAlpha(f7);
                ((a10) this.W2).invalidate();
                break;
            case 25:
                super.setAlpha(f7);
                ((n91) this.W2).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qm0, android.view.View
    public void setTranslationY(float f7) {
        switch (this.V2) {
            case 24:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.V2 = i10;
        this.W2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(a00 a00Var, Context context, yz yzVar) {
        super(context, null);
        this.V2 = 15;
        this.W2 = a00Var;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, this.n2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.a0 a0Var = new gg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(yzVar);
    }

    private final void x1(int i10, int i11) {
    }
}
