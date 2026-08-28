package gh;

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
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yz;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bq;
import org.telegram.ui.dw;
import org.telegram.ui.e00;
import org.telegram.ui.f10;
import org.telegram.ui.ht;
import org.telegram.ui.jr;
import org.telegram.ui.mx;
import org.telegram.ui.n00;
import org.telegram.ui.o00;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f1 extends wk0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ Object U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(Object obj, Context context, int i9) {
        super(context, null);
        this.T2 = i9;
        this.U2 = obj;
    }

    @Override // org.telegram.ui.Components.wk0
    public boolean E0(float f10) {
        switch (this.T2) {
            case 12:
                ki kiVar = ((pj) this.U2).b;
                return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + kiVar.X1[0]) + (!kiVar.c0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public boolean F0(View view) {
        switch (this.T2) {
            case 5:
                return view != ((org.telegram.ui.y6) this.U2).M;
            case 16:
                vz vzVar = (vz) this.U2;
                return vzVar.isEnabled() && !((dw) vzVar.F).b.f2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public boolean H0(View view, float f10, float f11) {
        switch (this.T2) {
            case 0:
                ((l1) this.U2).getClass();
                return true;
            case 10:
                return ((org.telegram.ui.Components.sa) this.U2).t(view, f10, f11);
            case 16:
                if (((vz) this.U2).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((tz) view).f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((m71) this.U2).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((k71) view).c;
                    float f13 = dp2;
                    if (rectF2.left - f13 < f10 && rectF2.right + f13 > f10) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f10, f11);
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public boolean S0() {
        switch (this.T2) {
            case 24:
                return getAdapter() != null && ((s51) this.U2).D && getAdapter().h() <= 2;
            default:
                return super.S0();
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public Integer W0(int i9) {
        int i10;
        switch (this.T2) {
            case 1:
                return 0;
            case 20:
                return 0;
            case 26:
                i10 = ((DataSettingsActivity) this.U2).resetDownloadRow;
                org.telegram.ui.ActionBar.b6 b6Var = this.l2;
                return i9 == i10 ? Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, b6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var));
            case 27:
                ArrayList arrayList = ((n00) this.U2).L;
                e00 e00Var = (i9 < 0 || i9 >= arrayList.size()) ? null : (e00) arrayList.get(i9);
                org.telegram.ui.ActionBar.b6 b6Var2 = this.l2;
                return (e00Var == null || !e00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, b6Var2)));
            default:
                return super.W0(i9);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        switch (this.T2) {
            case 25:
                super.addView(view, i9, layoutParams);
                if (!((m71) this.U2).R) {
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
                super.addView(view, i9, layoutParams);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ih.u0 u0Var;
        switch (this.T2) {
            case 1:
                ih.h2 h2Var = (ih.h2) this.U2;
                int i9 = -1;
                if (!h2Var.b0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < getChildCount()) {
                            View childAt = getChildAt(i10);
                            if (!(childAt instanceof ih.p0) || (u0Var = ((ih.p0) childAt).G) == null) {
                                i10++;
                            } else {
                                i9 = u0Var.a;
                            }
                        }
                    }
                }
                if (i9 > h2Var.B) {
                    h2Var.B = i9;
                    ih.a aVar = h2Var.e0.T1;
                    if (aVar != null) {
                        aVar.setCount(h2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                df dfVar = (df) this.U2;
                f1 f1Var = dfVar.c;
                if (f1Var.getLayoutManager() != null && f1Var.getAdapter() != null && f1Var.getAdapter().h() != 0) {
                    float dp = dfVar.h - AndroidUtilities.dp(8.0f);
                    dfVar.e = dp - AndroidUtilities.dp(16.0f);
                    kg.d dVar = dfVar.r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), dfVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.g8) this.U2).B = false;
                break;
            case 21:
                mx mxVar = (mx) this.U2;
                f2.m0 m0Var = mxVar.V;
                f2.n nVar = mxVar.T;
                an0 an0Var = mxVar.U;
                if (an0Var != null && nVar != null && m0Var != null && an0Var.i0) {
                    canvas.save();
                    invalidate();
                    int h = an0Var.h() - 1;
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt2 = getChildAt(i11);
                            if (RecyclerView.R(childAt2) == h) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt2.getTranslationY() + childAt2.getBottom());
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (an0Var != null && nVar != null && m0Var != null && an0Var.i0) {
                    canvas.restore();
                }
                if (an0Var != null && an0Var.k0 != null) {
                    canvas.save();
                    canvas.translate(an0Var.k0.getLeft(), an0Var.k0.getTranslationY() + an0Var.k0.getTop());
                    an0Var.k0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                if (getAdapter() == ((f10) this.U2).Q) {
                    for (int i12 = 0; i12 < getChildCount(); i12++) {
                        if (T(getChildAt(i12)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i12).getX(), (getChildAt(i12).getY() - getChildAt(i12).getMeasuredHeight()) + AndroidUtilities.dp(2.0f));
                            getChildAt(i12).draw(canvas);
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

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i9 = this.T2;
        Object obj = this.U2;
        switch (i9) {
            case 1:
                if (!((ih.h2) obj).b0) {
                    break;
                }
                break;
            case 18:
                uj0 uj0Var = (uj0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && uj0Var.getPullingLeftProgress() > 0.95f) {
                        uj0.a(uj0Var);
                    } else if (uj0Var.x0 != 0.0f) {
                        ValueAnimator valueAnimator = uj0Var.u0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(uj0Var.x0, 0.0f);
                        uj0Var.u0 = ofFloat;
                        ofFloat.addUpdateListener(new q60(uj0Var, 6));
                        uj0Var.u0.setDuration(150L);
                        uj0Var.u0.start();
                    }
                }
                break;
            case 20:
                LinearLayout linearLayout = ((sm0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T2) {
            case 18:
                hg.r0 r0Var = ((uj0) this.U2).h0;
                if (r0Var == null || !(view instanceof sj0) || !((sj0) view).e.equals(r0Var)) {
                    break;
                }
                break;
            case 23:
                cx0 cx0Var = (cx0) this.U2;
                com.google.firebase.messaging.m mVar = cx0Var.h0;
                if (!(view instanceof org.telegram.ui.Cells.d8) || !cx0Var.N) {
                    break;
                } else {
                    int b10 = cx0Var.c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) mVar.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) mVar.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) mVar.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue());
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
            case 28:
                if (getAdapter() != ((f10) this.U2).Q || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.T2) {
            case 1:
                super.invalidate();
                ((ih.h2) this.U2).invalidate();
                break;
            case 9:
                super.invalidate();
                View view = ((jr) this.U2).fragmentView;
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
    public void k0(int i9, int i10) {
        switch (this.T2) {
            case 14:
                hm hmVar = (hm) this.U2;
                hmVar.invalidate();
                hmVar.b.X1(hmVar, i10);
                gm gmVar = hmVar.v;
                boolean z10 = true;
                int i11 = 0;
                boolean z11 = gmVar.x == null;
                if (z11) {
                    gmVar.x = gmVar.d();
                } else {
                    boolean[] d = gmVar.d();
                    if (d.length == gmVar.x.length) {
                        while (true) {
                            if (i11 >= d.length) {
                                z10 = z11;
                            } else if (d[i11] == gmVar.x[i11]) {
                                i11++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    gmVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.T2) {
            case 7:
                super.onAttachedToWindow();
                of.j1 j1Var = ((qn) this.U2).I3;
                if (j1Var != null) {
                    NotificationCenter.getInstance(j1Var.r).addObserver(j1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.T2) {
            case 7:
                super.onDetachedFromWindow();
                of.j1 j1Var = ((qn) this.U2).I3;
                if (j1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(j1Var.A);
                    NotificationCenter.getInstance(j1Var.r).removeObserver(j1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 2:
                ht q10 = ht.q();
                kh.w1 w1Var = (kh.w1) this.U2;
                boolean r10 = q10.r(motionEvent, w1Var.b, w1Var.f, this.l2);
                if (super.onInterceptTouchEvent(motionEvent) || r10) {
                }
                break;
            case 8:
                if (!((bq) this.U2).D) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((yi) this.U2).b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((hm) this.U2).F == null) {
                    break;
                }
                break;
            case 15:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((wy) this.U2).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 22:
                boolean r11 = ht.q().r(motionEvent, ((iu0) this.U2).b, null, this.l2);
                if (super.onInterceptTouchEvent(motionEvent) || r11) {
                }
                break;
            case 23:
                cx0 cx0Var = (cx0) this.U2;
                if (cx0Var.N) {
                    break;
                } else {
                    boolean r12 = ht.q().r(motionEvent, cx0Var.c, cx0Var.i0, this.l2);
                    if (super.onInterceptTouchEvent(motionEvent) || r12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.T2) {
            case 0:
                l1 l1Var = (l1) this.U2;
                l1Var.s();
                super.onLayout(z10, i9, i10, i11, i12);
                l1Var.P(2);
                break;
            case 10:
                ((org.telegram.ui.Components.sa) this.U2).s();
                super.onLayout(z10, i9, i10, i11, i12);
                break;
            case 11:
                super.onLayout(z10, i9, i10, i11, i12);
                PhotoViewer.t1().x0();
                break;
            case 13:
                super.onLayout(z10, i9, i10, i11, i12);
                ((xk) this.U2).d0();
                break;
            case 19:
                super.onLayout(z10, i9, i10, i11, i12);
                ((gm0) this.U2).a();
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.T2) {
            case 1:
                int size = View.MeasureSpec.getSize(i9);
                View.MeasureSpec.getSize(i10);
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 8:
                if (!((bq) this.U2).D) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((yi) this.U2).b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((hm) this.U2).F == null) {
                    break;
                }
                break;
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new o00(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i9, Rect rect) {
        switch (this.T2) {
            case 27:
                return false;
            default:
                return super.requestFocus(i9, rect);
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.T2) {
            case 4:
                if (!((org.telegram.ui.m1) this.U2).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 17:
                if (!((yz) this.U2).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 22:
                if (!((iu0) this.U2).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((cx0) this.U2).c0) {
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
        switch (this.T2) {
            case 16:
                super.setAlpha(f10);
                ((vz) this.U2).invalidate();
                break;
            case 25:
                super.setAlpha(f10);
                ((m71) this.U2).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, android.view.View
    public void setTranslationY(float f10) {
        switch (this.T2) {
            case 24:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(Object obj, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.T2 = i9;
        this.U2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(wy wyVar, Context context, uy uyVar) {
        super(context, null);
        this.T2 = 15;
        this.U2 = wyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, this.l2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        of.y yVar = new of.y(7);
        yVar.j1(0);
        setLayoutManager(yVar);
        setAdapter(uyVar);
    }
}
