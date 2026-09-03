package mh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b10;
import org.telegram.ui.c10;
import org.telegram.ui.kq;
import org.telegram.ui.mp0;
import org.telegram.ui.n60;
import org.telegram.ui.pw;
import org.telegram.ui.qr;
import org.telegram.ui.qt;
import org.telegram.ui.s00;
import org.telegram.ui.t10;
import org.telegram.ui.xn;
import org.telegram.ui.xo0;
import org.telegram.ui.yx;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d1 extends sl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ Object V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = obj;
    }

    @Override // org.telegram.ui.Components.sl0
    public boolean E0(float f10) {
        switch (this.U2) {
            case 10:
                mi miVar = ((sj) this.V2).b;
                return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + miVar.Y1[0]) + (!miVar.d0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public boolean F0(View view) {
        switch (this.U2) {
            case 3:
                return view != ((org.telegram.ui.b7) this.V2).N;
            case 14:
                l00 l00Var = (l00) this.V2;
                return l00Var.isEnabled() && !((pw) l00Var.G).b.g2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public boolean H0(View view, float f10, float f11) {
        switch (this.U2) {
            case 0:
                ((i1) this.V2).getClass();
                return true;
            case 8:
                return ((org.telegram.ui.Components.sa) this.V2).t(view, f10, f11);
            case 14:
                if (((l00) this.V2).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((j00) view).f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 23:
                if (((k81) this.V2).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((i81) view).c;
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

    @Override // org.telegram.ui.Components.sl0
    public boolean R0() {
        switch (this.U2) {
            case 22:
                return getAdapter() != null && ((r61) this.V2).E && getAdapter().h() <= 2;
            default:
                return super.R0();
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public Integer V0(int i10) {
        int i11;
        switch (this.U2) {
            case 1:
                return 0;
            case 18:
                return 0;
            case 24:
                i11 = ((DataSettingsActivity) this.V2).resetDownloadRow;
                org.telegram.ui.ActionBar.g6 g6Var = this.m2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.p7, g6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var));
            case 25:
                ArrayList arrayList = ((b10) this.V2).M;
                s00 s00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (s00) arrayList.get(i10);
                org.telegram.ui.ActionBar.g6 g6Var2 = this.m2;
                return (s00Var == null || !s00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.p7, g6Var2)));
            default:
                return super.V0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.U2) {
            case 23:
                super.addView(view, i10, layoutParams);
                if (!((k81) this.V2).S) {
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

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        oh.t0 t0Var;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.U2) {
            case 1:
                oh.h2 h2Var = (oh.h2) this.V2;
                int i10 = -1;
                if (!h2Var.c0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof oh.o0) || (t0Var = ((oh.o0) childAt).H) == null) {
                                i11++;
                            } else {
                                i10 = t0Var.a;
                            }
                        }
                    }
                }
                if (i10 > h2Var.C) {
                    h2Var.C = i10;
                    oh.a aVar = h2Var.f0.U1;
                    if (aVar != null) {
                        aVar.setCount(h2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.j8) this.V2).C = false;
                break;
            case 19:
                yx yxVar = (yx) this.V2;
                f2.j0 j0Var = yxVar.W;
                f2.l lVar = yxVar.U;
                wn0 wn0Var = yxVar.V;
                if (wn0Var != null && lVar != null && j0Var != null && wn0Var.j0) {
                    canvas.save();
                    invalidate();
                    int h = wn0Var.h() - 1;
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
                if (wn0Var != null && lVar != null && j0Var != null && wn0Var.j0) {
                    canvas.restore();
                }
                if (wn0Var != null && wn0Var.l0 != null) {
                    canvas.save();
                    canvas.translate(wn0Var.l0.getLeft(), wn0Var.l0.getTranslationY() + wn0Var.l0.getTop());
                    wn0Var.l0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 26:
                if (getAdapter() == ((t10) this.V2).R) {
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
            case 28:
                super.dispatchDraw(canvas);
                n60 n60Var = (n60) this.V2;
                if (n60Var.w0 != null && n60Var.x0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = n60Var.w0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.p2) n60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    n60Var.w0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 29:
                mp0 mp0Var = (mp0) this.V2;
                Paint paint = mp0Var.w;
                RectF rectF = mp0Var.s;
                RectF rectF2 = mp0Var.r;
                RectF rectF3 = mp0Var.n;
                f2.j0 j0Var2 = mp0Var.b;
                if (!mp0Var.f.isEmpty()) {
                    float d = mp0Var.e.d(mp0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), r6.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), r6.size() - 1, 0);
                    View m9 = j0Var2.m(clamp);
                    View m10 = j0Var2.m(clamp2);
                    if (m9 != null || m10 != null) {
                        View view = m9 != null ? m9 : m10;
                        rectF3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m10 != null) {
                            m9 = m10;
                        }
                        rectF2.set(m9.getLeft(), m9.getTop(), m9.getRight(), m9.getBottom());
                        AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                        paint.setColor(mp0Var.x);
                        float height = rectF.height() / 2.0f;
                        canvas.drawRoundRect(rectF, height, height, paint);
                        super.dispatchDraw(canvas);
                        break;
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.U2;
        Object obj = this.V2;
        switch (i10) {
            case 1:
                if (!((oh.h2) obj).c0) {
                    break;
                }
                break;
            case 16:
                qk0 qk0Var = (qk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && qk0Var.getPullingLeftProgress() > 0.95f) {
                        qk0.a(qk0Var);
                    } else if (qk0Var.y0 != 0.0f) {
                        ValueAnimator valueAnimator = qk0Var.v0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(qk0Var.y0, 0.0f);
                        qk0Var.v0 = ofFloat;
                        ofFloat.addUpdateListener(new k70(qk0Var, 6));
                        qk0Var.v0.setDuration(150L);
                        qk0Var.v0.start();
                    }
                }
                break;
            case 18:
                LinearLayout linearLayout = ((on0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.U2) {
            case 16:
                ng.q0 q0Var = ((qk0) this.V2).i0;
                if (q0Var == null || !(view instanceof ok0) || !((ok0) view).e.equals(q0Var)) {
                    break;
                }
                break;
            case 21:
                xx0 xx0Var = (xx0) this.V2;
                a9.a aVar = xx0Var.i0;
                if (!(view instanceof org.telegram.ui.Cells.d8) || !xx0Var.O) {
                    break;
                } else {
                    int b10 = xx0Var.c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) aVar.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) aVar.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) aVar.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue());
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
            case 26:
                if (getAdapter() != ((t10) this.V2).R || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.U2) {
            case 1:
                super.invalidate();
                ((oh.h2) this.V2).invalidate();
                break;
            case 7:
                super.invalidate();
                View view = ((qr) this.V2).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 29:
                super.invalidate();
                xo0 xo0Var = ((mp0) this.V2).C;
                if (xo0Var != null) {
                    xo0Var.run();
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
        switch (this.U2) {
            case 12:
                pm pmVar = (pm) this.V2;
                pmVar.invalidate();
                pmVar.b.X1(pmVar, i11);
                om omVar = pmVar.v;
                boolean z4 = true;
                int i12 = 0;
                boolean z10 = omVar.x == null;
                if (z10) {
                    omVar.x = omVar.d();
                } else {
                    boolean[] d = omVar.d();
                    if (d.length == omVar.x.length) {
                        while (true) {
                            if (i12 >= d.length) {
                                z4 = z10;
                            } else if (d[i12] == omVar.x[i12]) {
                                i12++;
                            }
                        }
                    }
                    z10 = z4;
                }
                if (z10) {
                    omVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.U2) {
            case 5:
                super.onAttachedToWindow();
                uf.y0 y0Var = ((xn) this.V2).J3;
                if (y0Var != null) {
                    NotificationCenter.getInstance(y0Var.r).addObserver(y0Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.U2) {
            case 5:
                super.onDetachedFromWindow();
                uf.y0 y0Var = ((xn) this.V2).J3;
                if (y0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(y0Var.B);
                    NotificationCenter.getInstance(y0Var.r).removeObserver(y0Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 6:
                if (!((kq) this.V2).E) {
                    break;
                }
                break;
            case 9:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((bj) this.V2).b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 12:
                if (((pm) this.V2).G == null) {
                    break;
                }
                break;
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((mz) this.V2).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 20:
                boolean r10 = qt.q().r(motionEvent, ((cv0) this.V2).b, null, this.m2);
                if (super.onInterceptTouchEvent(motionEvent) || r10) {
                }
                break;
            case 21:
                xx0 xx0Var = (xx0) this.V2;
                if (xx0Var.O) {
                    break;
                } else {
                    boolean r11 = qt.q().r(motionEvent, xx0Var.c, xx0Var.j0, this.m2);
                    if (super.onInterceptTouchEvent(motionEvent) || r11) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.U2) {
            case 0:
                i1 i1Var = (i1) this.V2;
                i1Var.s();
                super.onLayout(z4, i10, i11, i12, i13);
                i1Var.Q(2);
                break;
            case 8:
                ((org.telegram.ui.Components.sa) this.V2).s();
                super.onLayout(z4, i10, i11, i12, i13);
                break;
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                break;
            case 11:
                super.onLayout(z4, i10, i11, i12, i13);
                ((cl) this.V2).e0();
                break;
            case 17:
                super.onLayout(z4, i10, i11, i12, i13);
                ((dn0) this.V2).a();
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.U2) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                View.MeasureSpec.getSize(i11);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 6:
                if (!((kq) this.V2).E) {
                    break;
                }
                break;
            case 9:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((bj) this.V2).b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 12:
                if (((pm) this.V2).G == null) {
                    break;
                }
                break;
            case 27:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new c10(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.U2) {
            case 25:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.U2) {
            case 2:
                if (!((org.telegram.ui.l1) this.V2).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 15:
                if (!((o00) this.V2).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((cv0) this.V2).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 21:
                if (!((xx0) this.V2).d0) {
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
        switch (this.U2) {
            case 14:
                super.setAlpha(f10);
                ((l00) this.V2).invalidate();
                break;
            case 23:
                super.setAlpha(f10);
                ((k81) this.V2).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, android.view.View
    public void setTranslationY(float f10) {
        switch (this.U2) {
            case 22:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.U2 = i10;
        this.V2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(mz mzVar, Context context, kz kzVar) {
        super(context, null);
        this.U2 = 13;
        this.V2 = mzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, this.m2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(6);
        kVar.j1(0);
        setLayoutManager(kVar);
        setAdapter(kzVar);
    }
}
