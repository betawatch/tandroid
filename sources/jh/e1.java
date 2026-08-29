package jh;

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
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.y71;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a60;
import org.telegram.ui.dq;
import org.telegram.ui.fw;
import org.telegram.ui.g00;
import org.telegram.ui.h10;
import org.telegram.ui.ht;
import org.telegram.ui.jr;
import org.telegram.ui.ox;
import org.telegram.ui.p00;
import org.telegram.ui.q00;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e1 extends jl0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ Object U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, Context context, int i10) {
        super(context, null);
        this.T2 = i10;
        this.U2 = obj;
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean E0(float f9) {
        switch (this.T2) {
            case 11:
                ni niVar = ((sj) this.U2).b;
                return f9 >= ((float) ((AndroidUtilities.dp(30.0f) + niVar.X1[0]) + (!niVar.c0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f9);
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean F0(View view) {
        switch (this.T2) {
            case 4:
                return view != ((org.telegram.ui.x6) this.U2).M;
            case 15:
                f00 f00Var = (f00) this.U2;
                return f00Var.isEnabled() && !((fw) f00Var.F).b.f2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean H0(View view, float f9, float f10) {
        switch (this.T2) {
            case 0:
                ((j1) this.U2).getClass();
                return true;
            case 9:
                return ((org.telegram.ui.Components.xa) this.U2).t(view, f9, f10);
            case 15:
                if (((f00) this.U2).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((d00) view).f;
                    float f11 = dp;
                    if (rectF.left - f11 < f9 && rectF.right + f11 > f9) {
                        return false;
                    }
                }
                return true;
            case 24:
                if (((y71) this.U2).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((w71) view).c;
                    float f12 = dp2;
                    if (rectF2.left - f12 < f9 && rectF2.right + f12 > f9) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f9, f10);
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean S0() {
        switch (this.T2) {
            case 23:
                return getAdapter() != null && ((f61) this.U2).D && getAdapter().h() <= 2;
            default:
                return super.S0();
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public Integer W0(int i10) {
        int i11;
        switch (this.T2) {
            case 1:
                return 0;
            case 19:
                return 0;
            case 25:
                i11 = ((DataSettingsActivity) this.U2).resetDownloadRow;
                org.telegram.ui.ActionBar.c6 c6Var = this.l2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, c6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var));
            case 26:
                ArrayList arrayList = ((p00) this.U2).L;
                g00 g00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (g00) arrayList.get(i10);
                org.telegram.ui.ActionBar.c6 c6Var2 = this.l2;
                return (g00Var == null || !g00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, c6Var2)));
            default:
                return super.W0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.T2) {
            case 24:
                super.addView(view, i10, layoutParams);
                if (!((y71) this.U2).R) {
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

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        lh.s0 s0Var;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.T2) {
            case 1:
                lh.f2 f2Var = (lh.f2) this.U2;
                int i10 = -1;
                if (!f2Var.b0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof lh.n0) || (s0Var = ((lh.n0) childAt).G) == null) {
                                i11++;
                            } else {
                                i10 = s0Var.a;
                            }
                        }
                    }
                }
                if (i10 > f2Var.B) {
                    f2Var.B = i10;
                    lh.a aVar = f2Var.e0.T1;
                    if (aVar != null) {
                        aVar.setCount(f2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 5:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.f8) this.U2).B = false;
                break;
            case 20:
                ox oxVar = (ox) this.U2;
                f2.j0 j0Var = oxVar.V;
                f2.l lVar2 = oxVar.T;
                mn0 mn0Var = oxVar.U;
                if (mn0Var != null && lVar2 != null && j0Var != null && mn0Var.i0) {
                    canvas.save();
                    invalidate();
                    int h = mn0Var.h() - 1;
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
                if (mn0Var != null && lVar2 != null && j0Var != null && mn0Var.i0) {
                    canvas.restore();
                }
                if (mn0Var != null && mn0Var.k0 != null) {
                    canvas.save();
                    canvas.translate(mn0Var.k0.getLeft(), mn0Var.k0.getTranslationY() + mn0Var.k0.getTop());
                    mn0Var.k0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 27:
                if (getAdapter() == ((h10) this.U2).Q) {
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
            case 29:
                super.dispatchDraw(canvas);
                a60 a60Var = (a60) this.U2;
                if (a60Var.v0 != null && a60Var.w0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = a60Var.v0.getMeasuredHeight();
                    lVar = ((org.telegram.ui.ActionBar.o2) a60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - lVar.getMeasuredHeight()));
                    a60Var.v0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.T2;
        Object obj = this.U2;
        switch (i10) {
            case 1:
                if (!((lh.f2) obj).b0) {
                    break;
                }
                break;
            case 17:
                fk0 fk0Var = (fk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && fk0Var.getPullingLeftProgress() > 0.95f) {
                        fk0.a(fk0Var);
                    } else if (fk0Var.x0 != 0.0f) {
                        ValueAnimator valueAnimator = fk0Var.u0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fk0Var.x0, 0.0f);
                        fk0Var.u0 = ofFloat;
                        ofFloat.addUpdateListener(new d70(fk0Var, 6));
                        fk0Var.u0.setDuration(150L);
                        fk0Var.u0.start();
                    }
                }
                break;
            case 19:
                LinearLayout linearLayout = ((en0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T2) {
            case 17:
                kg.q0 q0Var = ((fk0) this.U2).h0;
                if (q0Var == null || !(view instanceof dk0) || !((dk0) view).e.equals(q0Var)) {
                    break;
                }
                break;
            case 22:
                nx0 nx0Var = (nx0) this.U2;
                bg.c2 c2Var = nx0Var.h0;
                if (!(view instanceof org.telegram.ui.Cells.b8) || !nx0Var.N) {
                    break;
                } else {
                    int b10 = nx0Var.c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) c2Var.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) c2Var.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) c2Var.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue());
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
            case 27:
                if (getAdapter() != ((h10) this.U2).Q || T(view).f != 1) {
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
                ((lh.f2) this.U2).invalidate();
                break;
            case 8:
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
    public void k0(int i10, int i11) {
        switch (this.T2) {
            case 13:
                lm lmVar = (lm) this.U2;
                lmVar.invalidate();
                lmVar.b.X1(lmVar, i11);
                km kmVar = lmVar.v;
                boolean z10 = true;
                int i12 = 0;
                boolean z11 = kmVar.x == null;
                if (z11) {
                    kmVar.x = kmVar.d();
                } else {
                    boolean[] d = kmVar.d();
                    if (d.length == kmVar.x.length) {
                        while (true) {
                            if (i12 >= d.length) {
                                z10 = z11;
                            } else if (d[i12] == kmVar.x[i12]) {
                                i12++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    kmVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.T2) {
            case 6:
                super.onAttachedToWindow();
                rf.z0 z0Var = ((tn) this.U2).I3;
                if (z0Var != null) {
                    NotificationCenter.getInstance(z0Var.r).addObserver(z0Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.T2) {
            case 6:
                super.onDetachedFromWindow();
                rf.z0 z0Var = ((tn) this.U2).I3;
                if (z0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(z0Var.A);
                    NotificationCenter.getInstance(z0Var.r).removeObserver(z0Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 2:
                ht q6 = ht.q();
                nh.t1 t1Var = (nh.t1) this.U2;
                boolean r6 = q6.r(motionEvent, t1Var.b, t1Var.f, this.l2);
                if (super.onInterceptTouchEvent(motionEvent) || r6) {
                }
                break;
            case 7:
                if (!((dq) this.U2).D) {
                    break;
                }
                break;
            case 10:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((bj) this.U2).b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 13:
                if (((lm) this.U2).F == null) {
                    break;
                }
                break;
            case 14:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((fz) this.U2).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 21:
                boolean r9 = ht.q().r(motionEvent, ((uu0) this.U2).b, null, this.l2);
                if (super.onInterceptTouchEvent(motionEvent) || r9) {
                }
                break;
            case 22:
                nx0 nx0Var = (nx0) this.U2;
                if (nx0Var.N) {
                    break;
                } else {
                    boolean r10 = ht.q().r(motionEvent, nx0Var.c, nx0Var.i0, this.l2);
                    if (super.onInterceptTouchEvent(motionEvent) || r10) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T2) {
            case 0:
                j1 j1Var = (j1) this.U2;
                j1Var.s();
                super.onLayout(z10, i10, i11, i12, i13);
                j1Var.Q(2);
                break;
            case 9:
                ((org.telegram.ui.Components.xa) this.U2).s();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ((bl) this.U2).e0();
                break;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                ((tm0) this.U2).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.T2) {
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

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 7:
                if (!((dq) this.U2).D) {
                    break;
                }
                break;
            case 10:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((bj) this.U2).b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 13:
                if (((lm) this.U2).F == null) {
                    break;
                }
                break;
            case 28:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new q00(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.T2) {
            case 26:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.T2) {
            case 3:
                if (!((org.telegram.ui.n1) this.U2).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 16:
                if (!((j00) this.U2).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 21:
                if (!((uu0) this.U2).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 22:
                if (!((nx0) this.U2).c0) {
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
    public void setAlpha(float f9) {
        switch (this.T2) {
            case 15:
                super.setAlpha(f9);
                ((f00) this.U2).invalidate();
                break;
            case 24:
                super.setAlpha(f9);
                ((y71) this.U2).invalidate();
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, android.view.View
    public void setTranslationY(float f9) {
        switch (this.T2) {
            case 23:
                super.setTranslationY(f9);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        this.U2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(fz fzVar, Context context, dz dzVar) {
        super(context, null);
        this.T2 = 14;
        this.U2 = fzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, this.l2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(6);
        kVar.j1(0);
        setLayoutManager(kVar);
        setAdapter(dzVar);
    }
}
