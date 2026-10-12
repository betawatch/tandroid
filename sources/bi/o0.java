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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dn;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zj;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.c10;
import org.telegram.ui.c20;
import org.telegram.ui.fo;
import org.telegram.ui.iy;
import org.telegram.ui.l10;
import org.telegram.ui.tq;
import org.telegram.ui.xt;
import org.telegram.ui.xw;
import org.telegram.ui.yr;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class o0 extends mm0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ Object W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, Context context, int i10) {
        super(context, null);
        this.V2 = i10;
        this.W2 = obj;
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean E0(float f7) {
        switch (this.V2) {
            case 3:
                vi viVar = ((ig.i0) this.W2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + viVar.e2[0]) + (!viVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
            case 12:
                vi viVar2 = ((zj) this.W2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + viVar2.e2[0]) + (!viVar2.g0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f7);
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean F0(View view) {
        switch (this.V2) {
            case 5:
                return view != ((org.telegram.ui.d7) this.W2).Q;
            case 16:
                w00 w00Var = (w00) this.W2;
                return w00Var.isEnabled() && !((xw) w00Var.J).b.j2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean H0(View view, float f7, float f10) {
        switch (this.V2) {
            case 10:
                return ((org.telegram.ui.Components.db) this.W2).v(view, f7, f10);
            case 16:
                if (((w00) this.W2).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((u00) view).f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((j91) this.W2).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((h91) view).c;
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

    @Override // org.telegram.ui.Components.mm0
    public boolean S0() {
        switch (this.V2) {
            case 24:
                return getAdapter() != null && ((q71) this.W2).H && getAdapter().h() <= 2;
            default:
                return super.S0();
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public Integer W0(int i10) {
        int i11;
        switch (this.V2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                i11 = ((DataSettingsActivity) this.W2).resetDownloadRow;
                org.telegram.ui.ActionBar.c6 c6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.p7, c6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var));
            case 27:
                ArrayList arrayList = ((l10) this.W2).P;
                c10 c10Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (c10) arrayList.get(i10);
                org.telegram.ui.ActionBar.c6 c6Var2 = this.n2;
                return (c10Var == null || !c10Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.p7, c6Var2)));
            default:
                return super.W0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.V2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (!((j91) this.W2).V) {
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

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        e1 e1Var;
        switch (this.V2) {
            case 0:
                h3 h3Var = (h3) this.W2;
                int i10 = -1;
                if (!h3Var.f0) {
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
                if (i10 > h3Var.F) {
                    h3Var.F = i10;
                    a aVar = h3Var.i0.X1;
                    if (aVar != null) {
                        aVar.setCount(h3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                pf pfVar = (pf) this.W2;
                o0 o0Var = pfVar.c;
                if (o0Var.getLayoutManager() != null && o0Var.getAdapter() != null && o0Var.getAdapter().h() != 0) {
                    float dp = pfVar.h - AndroidUtilities.dp(8.0f);
                    pfVar.e = dp - AndroidUtilities.dp(16.0f);
                    dh.d dVar = pfVar.r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), pfVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.l8) this.W2).F = false;
                break;
            case 21:
                iy iyVar = (iy) this.W2;
                s4.b0 b0Var = iyVar.c0;
                s4.k kVar = iyVar.a0;
                so0 so0Var = iyVar.b0;
                if (so0Var != null && kVar != null && b0Var != null && so0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = so0Var.h() - 1;
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
                if (so0Var != null && kVar != null && b0Var != null && so0Var.m0) {
                    canvas.restore();
                }
                if (so0Var != null && so0Var.o0 != null) {
                    canvas.save();
                    canvas.translate(so0Var.o0.getLeft(), so0Var.o0.getTranslationY() + so0Var.o0.getTop());
                    so0Var.o0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                if (getAdapter() == ((c20) this.W2).U) {
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

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.V2;
        Object obj = this.W2;
        switch (i10) {
            case 0:
                if (!((h3) obj).f0) {
                    break;
                }
                break;
            case 18:
                gl0 gl0Var = (gl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && gl0Var.getPullingLeftProgress() > 0.95f) {
                        gl0.a(gl0Var);
                    } else if (gl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = gl0Var.y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(gl0Var.B0, 0.0f);
                        gl0Var.y0 = ofFloat;
                        ofFloat.addUpdateListener(new g80(gl0Var, 7));
                        gl0Var.y0.setDuration(150L);
                        gl0Var.y0.start();
                    }
                }
                break;
            case 20:
                LinearLayout linearLayout = ((ko0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.V2) {
            case 18:
                ah.i1 i1Var = ((gl0) this.W2).l0;
                if (i1Var == null || !(view instanceof el0) || !((el0) view).e.equals(i1Var)) {
                    break;
                }
                break;
            case 23:
                ty0 ty0Var = (ty0) this.W2;
                com.google.firebase.messaging.m mVar = ty0Var.l0;
                if (!(view instanceof org.telegram.ui.Cells.f8) || !ty0Var.R) {
                    break;
                } else {
                    int b10 = ty0Var.c.T(view).b();
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
                if (getAdapter() != ((c20) this.W2).U || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.V2) {
            case 0:
                super.invalidate();
                ((h3) this.W2).invalidate();
                break;
            case 9:
                super.invalidate();
                View view = ((yr) this.W2).fragmentView;
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
                en enVar = (en) this.W2;
                enVar.invalidate();
                enVar.b.b2(enVar, i11);
                dn dnVar = enVar.v;
                boolean z10 = true;
                int i12 = 0;
                boolean z11 = dnVar.x == null;
                if (z11) {
                    dnVar.x = dnVar.d();
                } else {
                    boolean[] d = dnVar.d();
                    if (d.length == dnVar.x.length) {
                        while (true) {
                            if (i12 >= d.length) {
                                z10 = z11;
                            } else if (d[i12] == dnVar.x[i12]) {
                                i12++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    dnVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.V2) {
            case 7:
                super.onAttachedToWindow();
                hg.n1 n1Var = ((fo) this.W2).M3;
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.V2) {
            case 7:
                super.onDetachedFromWindow();
                hg.n1 n1Var = ((fo) this.W2).M3;
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.V2) {
            case 1:
                xt q6 = xt.q();
                di.y1 y1Var = (di.y1) this.W2;
                boolean r10 = q6.r(motionEvent, y1Var.b, y1Var.f, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || r10) {
                }
                break;
            case 8:
                if (!((tq) this.W2).H) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((kj) this.W2).b.e2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((en) this.W2).J == null) {
                    break;
                }
                break;
            case 15:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((wz) this.W2).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 22:
                boolean r11 = xt.q().r(motionEvent, ((bw0) this.W2).b, null, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || r11) {
                }
                break;
            case 23:
                ty0 ty0Var = (ty0) this.W2;
                if (ty0Var.R) {
                    break;
                } else {
                    boolean r12 = xt.q().r(motionEvent, ty0Var.c, ty0Var.m0, this.n2);
                    if (super.onInterceptTouchEvent(motionEvent) || r12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.V2) {
            case 10:
                ((org.telegram.ui.Components.db) this.W2).u();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ul) this.W2).h0();
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((yn0) this.W2).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V2) {
            case 8:
                if (!((tq) this.W2).H) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((kj) this.W2).b.e2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((en) this.W2).J == null) {
                    break;
                }
                break;
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new zz(this, 3), 250L);
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.V2) {
            case 4:
                if (!((org.telegram.ui.m1) this.W2).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 17:
                if (!((z00) this.W2).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 22:
                if (!((bw0) this.W2).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((ty0) this.W2).g0) {
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
                ((w00) this.W2).invalidate();
                break;
            case 25:
                super.setAlpha(f7);
                ((j91) this.W2).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, android.view.View
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
    public /* synthetic */ o0(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(wz wzVar, Context context, uz uzVar) {
        super(context, null);
        this.V2 = 15;
        this.W2 = wzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, this.n2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(uzVar);
    }

    private final void x1(int i10, int i11) {
    }
}
