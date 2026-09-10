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
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.yi;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eo;
import org.telegram.ui.gy;
import org.telegram.ui.h10;
import org.telegram.ui.i10;
import org.telegram.ui.rq;
import org.telegram.ui.s60;
import org.telegram.ui.tt;
import org.telegram.ui.vw;
import org.telegram.ui.wr;
import org.telegram.ui.y00;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class y1 extends vl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ Object Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Object obj, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = obj;
    }

    @Override // org.telegram.ui.Components.vl0
    public boolean E0(float f7) {
        switch (this.X2) {
            case 2:
                yi yiVar = ((gg.n0) this.Y2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + yiVar.b2[0]) + (!yiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
            case 11:
                yi yiVar2 = ((bk) this.Y2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + yiVar2.b2[0]) + (!yiVar2.g0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f7);
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public boolean F0(View view) {
        switch (this.X2) {
            case 4:
                return view != ((org.telegram.ui.y6) this.Y2).Q;
            case 15:
                r00 r00Var = (r00) this.Y2;
                return r00Var.isEnabled() && !((vw) r00Var.J).b.j2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public boolean H0(View view, float f7, float f10) {
        switch (this.X2) {
            case 9:
                return ((org.telegram.ui.Components.ab) this.Y2).t(view, f7, f10);
            case 15:
                if (((r00) this.Y2).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((p00) view).f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 24:
                if (((u81) this.Y2).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((s81) view).c;
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

    @Override // org.telegram.ui.Components.vl0
    public boolean R0() {
        switch (this.X2) {
            case 23:
                return getAdapter() != null && ((b71) this.Y2).H && getAdapter().h() <= 2;
            default:
                return super.R0();
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public Integer V0(int i10) {
        int i11;
        switch (this.X2) {
            case 19:
                return 0;
            case 25:
                i11 = ((DataSettingsActivity) this.Y2).resetDownloadRow;
                org.telegram.ui.ActionBar.f6 f6Var = this.p2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var));
            case 26:
                ArrayList arrayList = ((h10) this.Y2).P;
                y00 y00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (y00) arrayList.get(i10);
                org.telegram.ui.ActionBar.f6 f6Var2 = this.p2;
                return (y00Var == null || !y00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var2)));
            default:
                return super.V0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.X2) {
            case 24:
                super.addView(view, i10, layoutParams);
                if (!((u81) this.Y2).V) {
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

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.X2) {
            case 1:
                pf pfVar = (pf) this.Y2;
                y1 y1Var = pfVar.c;
                if (y1Var.getLayoutManager() != null && y1Var.getAdapter() != null && y1Var.getAdapter().h() != 0) {
                    float dp = pfVar.h - AndroidUtilities.dp(8.0f);
                    pfVar.e = dp - AndroidUtilities.dp(16.0f);
                    bh.d dVar = pfVar.r;
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
                break;
            case 5:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.h8) this.Y2).F = false;
                break;
            case 20:
                gy gyVar = (gy) this.Y2;
                s4.c0 c0Var = gyVar.c0;
                s4.j jVar = gyVar.a0;
                ao0 ao0Var = gyVar.b0;
                if (ao0Var != null && jVar != null && c0Var != null && ao0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = ao0Var.h() - 1;
                    int i10 = 0;
                    while (true) {
                        if (i10 < getChildCount()) {
                            View childAt = getChildAt(i10);
                            if (RecyclerView.R(childAt) == h) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt.getTranslationY() + childAt.getBottom());
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (ao0Var != null && jVar != null && c0Var != null && ao0Var.m0) {
                    canvas.restore();
                }
                if (ao0Var != null && ao0Var.o0 != null) {
                    canvas.save();
                    canvas.translate(ao0Var.o0.getLeft(), ao0Var.o0.getTranslationY() + ao0Var.o0.getTop());
                    ao0Var.o0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 27:
                if (getAdapter() == ((z10) this.Y2).U) {
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (T(getChildAt(i11)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i11).getX(), (getChildAt(i11).getY() - getChildAt(i11).getMeasuredHeight()) + AndroidUtilities.dp(2.0f));
                            getChildAt(i11).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 29:
                super.dispatchDraw(canvas);
                s60 s60Var = (s60) this.Y2;
                if (s60Var.z0 != null && s60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = s60Var.z0.getMeasuredHeight();
                    lVar = ((org.telegram.ui.ActionBar.p2) s60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - lVar.getMeasuredHeight()));
                    s60Var.z0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.X2;
        Object obj = this.Y2;
        switch (i10) {
            case 17:
                pk0 pk0Var = (pk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && pk0Var.getPullingLeftProgress() > 0.95f) {
                        pk0.a(pk0Var);
                    } else if (pk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = pk0Var.y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(pk0Var.B0, 0.0f);
                        pk0Var.y0 = ofFloat;
                        ofFloat.addUpdateListener(new q70(pk0Var, 6));
                        pk0Var.y0.setDuration(150L);
                        pk0Var.y0.start();
                    }
                }
                break;
            case 19:
                LinearLayout linearLayout = ((rn0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.X2) {
            case 17:
                yg.p0 p0Var = ((pk0) this.Y2).l0;
                if (p0Var == null || !(view instanceof nk0) || !((nk0) view).e.equals(p0Var)) {
                    break;
                }
                break;
            case 22:
                hy0 hy0Var = (hy0) this.Y2;
                com.google.firebase.messaging.n nVar = hy0Var.l0;
                if (!(view instanceof org.telegram.ui.Cells.g8) || !hy0Var.R) {
                    break;
                } else {
                    int b10 = hy0Var.c.T(view).b();
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
            case 27:
                if (getAdapter() != ((z10) this.Y2).U || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.X2) {
            case 8:
                super.invalidate();
                View view = ((wr) this.Y2).fragmentView;
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
            case 2:
                break;
            case 13:
                xm xmVar = (xm) this.Y2;
                xmVar.invalidate();
                xmVar.b.X1(xmVar, i11);
                wm wmVar = xmVar.v;
                boolean z10 = true;
                int i12 = 0;
                boolean z11 = wmVar.x == null;
                if (z11) {
                    wmVar.x = wmVar.d();
                } else {
                    boolean[] d = wmVar.d();
                    if (d.length == wmVar.x.length) {
                        while (true) {
                            if (i12 >= d.length) {
                                z10 = z11;
                            } else if (d[i12] == wmVar.x[i12]) {
                                i12++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    wmVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.X2) {
            case 6:
                super.onAttachedToWindow();
                fg.p1 p1Var = ((eo) this.Y2).M3;
                if (p1Var != null) {
                    NotificationCenter.getInstance(p1Var.r).addObserver(p1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.X2) {
            case 6:
                super.onDetachedFromWindow();
                fg.p1 p1Var = ((eo) this.Y2).M3;
                if (p1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(p1Var.E);
                    NotificationCenter.getInstance(p1Var.r).removeObserver(p1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 0:
                tt q6 = tt.q();
                k2 k2Var = (k2) this.Y2;
                boolean r10 = q6.r(motionEvent, k2Var.b, k2Var.f, this.p2);
                if (super.onInterceptTouchEvent(motionEvent) || r10) {
                }
                break;
            case 7:
                if (!((rq) this.Y2).H) {
                    break;
                }
                break;
            case 10:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((mj) this.Y2).b.b2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 13:
                if (((xm) this.Y2).J == null) {
                    break;
                }
                break;
            case 14:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((rz) this.Y2).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 21:
                boolean r11 = tt.q().r(motionEvent, ((mv0) this.Y2).b, null, this.p2);
                if (super.onInterceptTouchEvent(motionEvent) || r11) {
                }
                break;
            case 22:
                hy0 hy0Var = (hy0) this.Y2;
                if (hy0Var.R) {
                    break;
                } else {
                    boolean r12 = tt.q().r(motionEvent, hy0Var.c, hy0Var.m0, this.p2);
                    if (super.onInterceptTouchEvent(motionEvent) || r12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 9:
                ((org.telegram.ui.Components.ab) this.Y2).s();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ll) this.Y2).e0();
                break;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                ((fn0) this.Y2).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 7:
                if (!((rq) this.Y2).H) {
                    break;
                }
                break;
            case 10:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((mj) this.Y2).b.b2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 13:
                if (((xm) this.Y2).J == null) {
                    break;
                }
                break;
            case 28:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new i10(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.X2) {
            case 26:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.X2) {
            case 3:
                if (!((org.telegram.ui.l1) this.Y2).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 16:
                if (!((u00) this.Y2).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 21:
                if (!((mv0) this.Y2).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 22:
                if (!((hy0) this.Y2).g0) {
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
            case 15:
                super.setAlpha(f7);
                ((r00) this.Y2).invalidate();
                break;
            case 24:
                super.setAlpha(f7);
                ((u81) this.Y2).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, android.view.View
    public void setTranslationY(float f7) {
        switch (this.X2) {
            case 23:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(rz rzVar, Context context, pz pzVar) {
        super(context, null);
        this.X2 = 14;
        this.Y2 = rzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        fg.a0 a0Var = new fg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(pzVar);
    }

    private final void v1(int i10, int i11) {
    }
}
