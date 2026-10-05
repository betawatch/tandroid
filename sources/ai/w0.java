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
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dy;
import org.telegram.ui.f10;
import org.telegram.ui.g10;
import org.telegram.ui.ly;
import org.telegram.ui.mq;
import org.telegram.ui.rr;
import org.telegram.ui.rt;
import org.telegram.ui.w00;
import org.telegram.ui.x10;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class w0 extends zl0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ Object f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(Object obj, Context context, int i10) {
        super(context, null);
        this.e3 = i10;
        this.f3 = obj;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean F0(float f7) {
        switch (this.e3) {
            case 3:
                xi xiVar = ((hg.j0) this.f3).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + xiVar.b2[0]) + (!xiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
            case 12:
                xi xiVar2 = ((bk) this.f3).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + xiVar2.b2[0]) + (!xiVar2.g0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.F0(f7);
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean G0(View view) {
        switch (this.e3) {
            case 5:
                return view != ((org.telegram.ui.a7) this.f3).W;
            case 16:
                n00 n00Var = (n00) this.f3;
                return n00Var.isEnabled() && !((ly) n00Var.J).b.j2;
            default:
                return super.G0(view);
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean I0(View view, float f7, float f10) {
        switch (this.e3) {
            case 10:
                return ((org.telegram.ui.Components.cb) this.f3).t(view, f7, f10);
            case 16:
                if (((n00) this.f3).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((l00) view).f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((g91) this.f3).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((e91) view).c;
                    float f12 = dp2;
                    if (rectF2.left - f12 < f7 && rectF2.right + f12 > f7) {
                        return false;
                    }
                }
                return true;
            default:
                return super.I0(view, f7, f10);
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean S0() {
        switch (this.e3) {
            case 24:
                return getAdapter() != null && ((o71) this.f3).H && getAdapter().h() <= 2;
            default:
                return super.S0();
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public Integer W0(int i10) {
        int i11;
        switch (this.e3) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                i11 = ((DataSettingsActivity) this.f3).resetDownloadRow;
                org.telegram.ui.ActionBar.d6 d6Var = this.p2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.p7, d6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, d6Var));
            case 27:
                ArrayList arrayList = ((f10) this.f3).P;
                w00 w00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (w00) arrayList.get(i10);
                org.telegram.ui.ActionBar.d6 d6Var2 = this.p2;
                return (w00Var == null || !w00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, d6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.p7, d6Var2)));
            default:
                return super.W0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.e3) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (!((g91) this.f3).V) {
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

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m1 m1Var;
        switch (this.e3) {
            case 0:
                r3 r3Var = (r3) this.f3;
                int i10 = -1;
                if (!r3Var.f0) {
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
                if (i10 > r3Var.F) {
                    r3Var.F = i10;
                    c cVar = r3Var.i0.X1;
                    if (cVar != null) {
                        cVar.setCount(r3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                pf pfVar = (pf) this.f3;
                w0 w0Var = pfVar.c;
                if (w0Var.getLayoutManager() != null && w0Var.getAdapter() != null && w0Var.getAdapter().h() != 0) {
                    float dp = pfVar.h - AndroidUtilities.dp(8.0f);
                    pfVar.e = dp - AndroidUtilities.dp(16.0f);
                    ch.d dVar = pfVar.r;
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
                ((org.telegram.ui.k8) this.f3).F = false;
                break;
            case 21:
                dy dyVar = (dy) this.f3;
                s4.c0 c0Var = dyVar.e0;
                s4.j jVar = dyVar.c0;
                jo0 jo0Var = dyVar.d0;
                if (jo0Var != null && jVar != null && c0Var != null && jo0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = jo0Var.h() - 1;
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
                if (jo0Var != null && jVar != null && c0Var != null && jo0Var.m0) {
                    canvas.restore();
                }
                if (jo0Var != null && jo0Var.o0 != null) {
                    canvas.save();
                    canvas.translate(jo0Var.o0.getLeft(), jo0Var.o0.getTranslationY() + jo0Var.o0.getTop());
                    jo0Var.o0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                if (getAdapter() == ((x10) this.f3).U) {
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

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.e3;
        Object obj = this.f3;
        switch (i10) {
            case 0:
                if (!((r3) obj).f0) {
                    break;
                }
                break;
            case 18:
                sk0 sk0Var = (sk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && sk0Var.getPullingLeftProgress() > 0.95f) {
                        sk0.a(sk0Var);
                    } else if (sk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = sk0Var.y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(sk0Var.B0, 0.0f);
                        sk0Var.y0 = ofFloat;
                        ofFloat.addUpdateListener(new v70(sk0Var, 6));
                        sk0Var.y0.setDuration(150L);
                        sk0Var.y0.start();
                    }
                }
                break;
            case 20:
                LinearLayout linearLayout = ((ao0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.e3) {
            case 18:
                zg.m0 m0Var = ((sk0) this.f3).l0;
                if (m0Var == null || !(view instanceof qk0) || !((qk0) view).e.equals(m0Var)) {
                    break;
                }
                break;
            case 23:
                ry0 ry0Var = (ry0) this.f3;
                com.google.firebase.messaging.n nVar = ry0Var.l0;
                if (!(view instanceof org.telegram.ui.Cells.f8) || !ry0Var.R) {
                    break;
                } else {
                    int b10 = ry0Var.c.T(view).b();
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
                if (getAdapter() != ((x10) this.f3).U || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e3) {
            case 0:
                super.invalidate();
                ((r3) this.f3).invalidate();
                break;
            case 9:
                super.invalidate();
                View view = ((rr) this.f3).fragmentView;
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
    public void l0(int i10) {
        switch (this.e3) {
            case 3:
                break;
            case 14:
                tm tmVar = (tm) this.f3;
                tmVar.invalidate();
                tmVar.b.W1(tmVar, i10);
                sm smVar = tmVar.v;
                boolean z10 = true;
                int i11 = 0;
                boolean z11 = smVar.x == null;
                if (z11) {
                    smVar.x = smVar.d();
                } else {
                    boolean[] d = smVar.d();
                    if (d.length == smVar.x.length) {
                        while (true) {
                            if (i11 >= d.length) {
                                z10 = z11;
                            } else if (d[i11] == smVar.x[i11]) {
                                i11++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    smVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.e3) {
            case 7:
                super.onAttachedToWindow();
                gg.o1 o1Var = ((yn) this.f3).K3;
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

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.e3) {
            case 7:
                super.onDetachedFromWindow();
                gg.o1 o1Var = ((yn) this.f3).K3;
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

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 1:
                rt q6 = rt.q();
                ci.z1 z1Var = (ci.z1) this.f3;
                boolean r10 = q6.r(motionEvent, z1Var.b, z1Var.f, this.p2);
                if (super.onInterceptTouchEvent(motionEvent) || r10) {
                }
                break;
            case 8:
                if (!((mq) this.f3).H) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((mj) this.f3).b.b2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((tm) this.f3).J == null) {
                    break;
                }
                break;
            case 15:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((nz) this.f3).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 22:
                boolean r11 = rt.q().r(motionEvent, ((uv0) this.f3).b, null, this.p2);
                if (super.onInterceptTouchEvent(motionEvent) || r11) {
                }
                break;
            case 23:
                ry0 ry0Var = (ry0) this.f3;
                if (ry0Var.R) {
                    break;
                } else {
                    boolean r12 = rt.q().r(motionEvent, ry0Var.c, ry0Var.m0, this.p2);
                    if (super.onInterceptTouchEvent(motionEvent) || r12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.e3) {
            case 10:
                ((org.telegram.ui.Components.cb) this.f3).s();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ((jl) this.f3).e0();
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((on0) this.f3).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.e3) {
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

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 8:
                if (!((mq) this.f3).H) {
                    break;
                }
                break;
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((mj) this.f3).b.b2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 14:
                if (((tm) this.f3).J == null) {
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
        switch (this.e3) {
            case 27:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.e3) {
            case 4:
                if (!((org.telegram.ui.k1) this.f3).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 17:
                if (!((q00) this.f3).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 22:
                if (!((uv0) this.f3).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((ry0) this.f3).g0) {
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
            case 16:
                super.setAlpha(f7);
                ((n00) this.f3).invalidate();
                break;
            case 25:
                super.setAlpha(f7);
                ((g91) this.f3).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0, android.view.View
    public void setTranslationY(float f7) {
        switch (this.e3) {
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
    public /* synthetic */ w0(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e3 = i10;
        this.f3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(nz nzVar, Context context, lz lzVar) {
        super(context, null);
        this.e3 = 15;
        this.f3 = nzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, this.p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(lzVar);
    }

    private final void x1(int i10) {
    }
}
