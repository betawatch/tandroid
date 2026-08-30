package lh;

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
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.b10;
import org.telegram.ui.c10;
import org.telegram.ui.jq;
import org.telegram.ui.m60;
import org.telegram.ui.ow;
import org.telegram.ui.pr;
import org.telegram.ui.pt;
import org.telegram.ui.s00;
import org.telegram.ui.t10;
import org.telegram.ui.xn;
import org.telegram.ui.xx;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class e1 extends sl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ Object V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = obj;
    }

    @Override // org.telegram.ui.Components.sl0
    public boolean E0(float f10) {
        switch (this.U2) {
            case 10:
                li liVar = ((qj) this.V2).b;
                return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + liVar.Y1[0]) + (!liVar.d0 ? AndroidUtilities.statusBarHeight : 0)));
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
                j00 j00Var = (j00) this.V2;
                return j00Var.isEnabled() && !((ow) j00Var.G).b.g2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public boolean H0(View view, float f10, float f11) {
        switch (this.U2) {
            case 0:
                ((j1) this.V2).getClass();
                return true;
            case 8:
                return ((org.telegram.ui.Components.sa) this.V2).t(view, f10, f11);
            case 14:
                if (((j00) this.V2).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((h00) view).f;
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
    public boolean S0() {
        switch (this.U2) {
            case 22:
                return getAdapter() != null && ((q61) this.V2).E && getAdapter().h() <= 2;
            default:
                return super.S0();
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public Integer W0(int i10) {
        int i11;
        int i12;
        switch (this.U2) {
            case 1:
                return 0;
            case 18:
                return 0;
            case 24:
                i11 = ((DataSettingsActivity) this.V2).resetDownloadRow;
                org.telegram.ui.ActionBar.f6 f6Var = this.m2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var));
            case 25:
                ArrayList arrayList = ((b10) this.V2).M;
                s00 s00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (s00) arrayList.get(i10);
                org.telegram.ui.ActionBar.f6 f6Var2 = this.m2;
                return (s00Var == null || !s00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var2)));
            case 29:
                i12 = ((SessionsActivity) this.V2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.f6 f6Var3 = this.m2;
                return i10 == i12 ? Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var3))) : Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var3));
            default:
                return super.W0(i10);
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
        nh.t0 t0Var;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.U2) {
            case 1:
                nh.g2 g2Var = (nh.g2) this.V2;
                int i10 = -1;
                if (!g2Var.c0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof nh.o0) || (t0Var = ((nh.o0) childAt).H) == null) {
                                i11++;
                            } else {
                                i10 = t0Var.a;
                            }
                        }
                    }
                }
                if (i10 > g2Var.C) {
                    g2Var.C = i10;
                    nh.a aVar = g2Var.f0.U1;
                    if (aVar != null) {
                        aVar.setCount(g2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.j8) this.V2).C = false;
                break;
            case 19:
                xx xxVar = (xx) this.V2;
                f2.i0 i0Var = xxVar.W;
                f2.l lVar = xxVar.U;
                wn0 wn0Var = xxVar.V;
                if (wn0Var != null && lVar != null && i0Var != null && wn0Var.j0) {
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
                if (wn0Var != null && lVar != null && i0Var != null && wn0Var.j0) {
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
                m60 m60Var = (m60) this.V2;
                if (m60Var.w0 != null && m60Var.x0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = m60Var.w0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.p2) m60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    m60Var.w0.draw(canvas);
                    canvas.restore();
                    break;
                }
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
                if (!((nh.g2) obj).c0) {
                    break;
                }
                break;
            case 16:
                pk0 pk0Var = (pk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && pk0Var.getPullingLeftProgress() > 0.95f) {
                        pk0.a(pk0Var);
                    } else if (pk0Var.y0 != 0.0f) {
                        ValueAnimator valueAnimator = pk0Var.v0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(pk0Var.y0, 0.0f);
                        pk0Var.v0 = ofFloat;
                        ofFloat.addUpdateListener(new i70(pk0Var, 6));
                        pk0Var.v0.setDuration(150L);
                        pk0Var.v0.start();
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
                mg.q0 q0Var = ((pk0) this.V2).i0;
                if (q0Var == null || !(view instanceof nk0) || !((nk0) view).e.equals(q0Var)) {
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
                ((nh.g2) this.V2).invalidate();
                break;
            case 7:
                super.invalidate();
                View view = ((pr) this.V2).fragmentView;
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
        switch (this.U2) {
            case 12:
                om omVar = (om) this.V2;
                omVar.invalidate();
                omVar.b.X1(omVar, i11);
                nm nmVar = omVar.v;
                boolean z4 = true;
                int i12 = 0;
                boolean z10 = nmVar.x == null;
                if (z10) {
                    nmVar.x = nmVar.d();
                } else {
                    boolean[] d = nmVar.d();
                    if (d.length == nmVar.x.length) {
                        while (true) {
                            if (i12 >= d.length) {
                                z4 = z10;
                            } else if (d[i12] == nmVar.x[i12]) {
                                i12++;
                            }
                        }
                    }
                    z10 = z4;
                }
                if (z10) {
                    nmVar.invalidate();
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
                tf.y0 y0Var = ((xn) this.V2).J3;
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
                tf.y0 y0Var = ((xn) this.V2).J3;
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
                if (!((jq) this.V2).E) {
                    break;
                }
                break;
            case 9:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((zi) this.V2).b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 12:
                if (((om) this.V2).G == null) {
                    break;
                }
                break;
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((kz) this.V2).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 20:
                boolean r10 = pt.q().r(motionEvent, ((cv0) this.V2).b, null, this.m2);
                if (super.onInterceptTouchEvent(motionEvent) || r10) {
                }
                break;
            case 21:
                xx0 xx0Var = (xx0) this.V2;
                if (xx0Var.O) {
                    break;
                } else {
                    boolean r11 = pt.q().r(motionEvent, xx0Var.c, xx0Var.j0, this.m2);
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
                j1 j1Var = (j1) this.V2;
                j1Var.s();
                super.onLayout(z4, i10, i11, i12, i13);
                j1Var.Q(2);
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
                ((al) this.V2).e0();
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
                if (!((jq) this.V2).E) {
                    break;
                }
                break;
            case 9:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((zi) this.V2).b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 12:
                if (((om) this.V2).G == null) {
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
                if (!((n00) this.V2).n) {
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
                ((j00) this.V2).invalidate();
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
    public /* synthetic */ e1(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.U2 = i10;
        this.V2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(kz kzVar, Context context, iz izVar) {
        super(context, null);
        this.U2 = 13;
        this.V2 = kzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.m2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(6);
        kVar.j1(0);
        setLayoutManager(kVar);
        setAdapter(izVar);
    }
}
