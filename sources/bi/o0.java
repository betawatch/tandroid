package bi;

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
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.co;
import org.telegram.ui.ey;
import org.telegram.ui.f10;
import org.telegram.ui.g10;
import org.telegram.ui.qq;
import org.telegram.ui.st;
import org.telegram.ui.tw;
import org.telegram.ui.vr;
import org.telegram.ui.w00;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class o0 extends ll0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ Object Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = obj;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean E0(float f7) {
        switch (this.X2) {
            case 3:
                vi viVar = ((ig.i0) this.Y2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + viVar.b2[0]) + (!viVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
            case 12:
                vi viVar2 = ((yj) this.Y2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + viVar2.b2[0]) + (!viVar2.g0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f7);
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean F0(View view) {
        switch (this.X2) {
            case 5:
                return view != ((org.telegram.ui.z6) this.Y2).Q;
            case 16:
                k00 k00Var = (k00) this.Y2;
                return k00Var.isEnabled() && !((tw) k00Var.J).b.j2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean H0(View view, float f7, float f10) {
        switch (this.X2) {
            case 10:
                return ((org.telegram.ui.Components.bb) this.Y2).t(view, f7, f10);
            case 16:
                if (((k00) this.Y2).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((i00) view).f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((h81) this.Y2).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((f81) view).c;
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

    @Override // org.telegram.ui.Components.ll0
    public boolean R0() {
        switch (this.X2) {
            case 24:
                return getAdapter() != null && ((o61) this.Y2).H && getAdapter().h() <= 2;
            default:
                return super.R0();
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public Integer V0(int i10) {
        int i11;
        switch (this.X2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                i11 = ((DataSettingsActivity) this.Y2).resetDownloadRow;
                org.telegram.ui.ActionBar.f6 f6Var = this.p2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var));
            case 27:
                ArrayList arrayList = ((f10) this.Y2).P;
                w00 w00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (w00) arrayList.get(i10);
                org.telegram.ui.ActionBar.f6 f6Var2 = this.p2;
                return (w00Var == null || !w00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var2)));
            default:
                return super.V0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.X2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (!((h81) this.Y2).V) {
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

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        e1 e1Var;
        switch (this.X2) {
            case 0:
                e3 e3Var = (e3) this.Y2;
                int i10 = -1;
                if (!e3Var.f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof z0) || (e1Var = ((z0) childAt).K) == null) {
                                i11++;
                            } else {
                                i10 = e1Var.a;
                            }
                        }
                    }
                }
                if (i10 > e3Var.F) {
                    e3Var.F = i10;
                    a aVar = e3Var.i0.X1;
                    if (aVar != null) {
                        aVar.setCount(e3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                of ofVar = (of) this.Y2;
                o0 o0Var = ofVar.c;
                if (o0Var.getLayoutManager() != null && o0Var.getAdapter() != null && o0Var.getAdapter().h() != 0) {
                    float dp = ofVar.h - AndroidUtilities.dp(8.0f);
                    ofVar.e = dp - AndroidUtilities.dp(16.0f);
                    dh.d dVar = ofVar.r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), ofVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.h8) this.Y2).F = false;
                break;
            case 21:
                ey eyVar = (ey) this.Y2;
                s4.c0 c0Var = eyVar.c0;
                s4.j jVar = eyVar.a0;
                rn0 rn0Var = eyVar.b0;
                if (rn0Var != null && jVar != null && c0Var != null && rn0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = rn0Var.h() - 1;
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
                if (rn0Var != null && jVar != null && c0Var != null && rn0Var.m0) {
                    canvas.restore();
                }
                if (rn0Var != null && rn0Var.o0 != null) {
                    canvas.save();
                    canvas.translate(rn0Var.o0.getLeft(), rn0Var.o0.getTranslationY() + rn0Var.o0.getTop());
                    rn0Var.o0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                if (getAdapter() == ((x10) this.Y2).U) {
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

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.X2;
        Object obj = this.Y2;
        switch (i10) {
            case 0:
                if (!((e3) obj).f0) {
                    break;
                }
                break;
            case 18:
                fk0 fk0Var = (fk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && fk0Var.getPullingLeftProgress() > 0.95f) {
                        fk0.a(fk0Var);
                    } else if (fk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = fk0Var.y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fk0Var.B0, 0.0f);
                        fk0Var.y0 = ofFloat;
                        ofFloat.addUpdateListener(new h70(fk0Var, 6));
                        fk0Var.y0.setDuration(150L);
                        fk0Var.y0.start();
                    }
                }
                break;
            case 20:
                LinearLayout linearLayout = ((hn0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.X2) {
            case 18:
                ah.j1 j1Var = ((fk0) this.Y2).l0;
                if (j1Var == null || !(view instanceof dk0) || !((dk0) view).e.equals(j1Var)) {
                    break;
                }
                break;
            case 23:
                ux0 ux0Var = (ux0) this.Y2;
                com.google.firebase.messaging.n nVar = ux0Var.l0;
                if (!(view instanceof org.telegram.ui.Cells.f8) || !ux0Var.R) {
                    break;
                } else {
                    int b10 = ux0Var.c.T(view).b();
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
                if (getAdapter() != ((x10) this.Y2).U || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.X2) {
            case 0:
                super.invalidate();
                ((e3) this.Y2).invalidate();
                break;
            case 9:
                super.invalidate();
                View view = ((vr) this.Y2).fragmentView;
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
        switch (this.X2) {
            case 3:
                break;
            case 14:
                qm qmVar = (qm) this.Y2;
                qmVar.invalidate();
                qmVar.b.X1(qmVar, i11);
                pm pmVar = qmVar.v;
                boolean z10 = true;
                int i12 = 0;
                boolean z11 = pmVar.x == null;
                if (z11) {
                    pmVar.x = pmVar.d();
                } else {
                    boolean[] d = pmVar.d();
                    if (d.length == pmVar.x.length) {
                        while (true) {
                            if (i12 >= d.length) {
                                z10 = z11;
                            } else if (d[i12] == pmVar.x[i12]) {
                                i12++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    pmVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.X2) {
            case 7:
                super.onAttachedToWindow();
                hg.o1 o1Var = ((co) this.Y2).M3;
                if (o1Var != null) {
                    NotificationCenter.getInstance(o1Var.r).addObserver(o1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.X2) {
            case 7:
                super.onDetachedFromWindow();
                hg.o1 o1Var = ((co) this.Y2).M3;
                if (o1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var.E);
                    NotificationCenter.getInstance(o1Var.r).removeObserver(o1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                st q6 = st.q();
                di.z1 z1Var = (di.z1) this.Y2;
                boolean r10 = q6.r(motionEvent, z1Var.b, z1Var.f, this.p2);
                if (super.onInterceptTouchEvent(motionEvent) || r10) {
                }
                break;
            case 8:
                if (!((qq) this.Y2).H) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((jj) this.Y2).b.b2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((qm) this.Y2).J == null) {
                    break;
                }
                break;
            case 15:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((kz) this.Y2).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 22:
                boolean r11 = st.q().r(motionEvent, ((bv0) this.Y2).b, null, this.p2);
                if (super.onInterceptTouchEvent(motionEvent) || r11) {
                }
                break;
            case 23:
                ux0 ux0Var = (ux0) this.Y2;
                if (ux0Var.R) {
                    break;
                } else {
                    boolean r12 = st.q().r(motionEvent, ux0Var.c, ux0Var.m0, this.p2);
                    if (super.onInterceptTouchEvent(motionEvent) || r12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 10:
                ((org.telegram.ui.Components.bb) this.Y2).s();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ((gl) this.Y2).e0();
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((vm0) this.Y2).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.X2) {
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

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 8:
                if (!((qq) this.Y2).H) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((jj) this.Y2).b.b2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((qm) this.Y2).J == null) {
                    break;
                }
                break;
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new g10(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.X2) {
            case 27:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.X2) {
            case 4:
                if (!((org.telegram.ui.k1) this.Y2).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 17:
                if (!((n00) this.Y2).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 22:
                if (!((bv0) this.Y2).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((ux0) this.Y2).g0) {
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
        switch (this.X2) {
            case 16:
                super.setAlpha(f7);
                ((k00) this.Y2).invalidate();
                break;
            case 25:
                super.setAlpha(f7);
                ((h81) this.Y2).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0, android.view.View
    public void setTranslationY(float f7) {
        switch (this.X2) {
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
    public /* synthetic */ o0(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(kz kzVar, Context context, iz izVar) {
        super(context, null);
        this.X2 = 15;
        this.Y2 = kzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.b0 b0Var = new hg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(izVar);
    }

    private final void v1(int i10, int i11) {
    }
}
