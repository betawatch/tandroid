package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.wb;
import gi.va;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.ld;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.yx;
import org.telegram.ui.Components.zs0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o2 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.b = obj;
    }

    public yn a() {
        return ((yn[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, int i10) {
        switch (this.a) {
            case 9:
                super.addView(view, i3, i10);
                ((kh.f) this.b).e();
                break;
            default:
                super.addView(view, i3, i10);
                break;
        }
    }

    public void b(eh.c cVar, hh.e eVar) {
        mh.f fVar = (mh.f) this.b;
        fVar.c(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
    }

    public void c() {
        yn[] ynVarArr = (yn[]) this.b;
        yn ynVar = ynVarArr[0];
        yn ynVar2 = ynVarArr[1];
        ynVarArr[0] = ynVar2;
        ynVarArr[1] = ynVar;
        ynVar2.n = true;
        ynVar2.setVisibility(0);
        ynVarArr[0].setScaleX(0.8f);
        ynVarArr[0].setScaleY(0.8f);
        ynVarArr[0].setAlpha(0.0f);
        ynVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = ynVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        xq xqVar = xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
        yn ynVar3 = ynVarArr[1];
        ynVar3.n = false;
        ynVar3.setVisibility(0);
        ynVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(xqVar).setDuration(320L).withEndAction(new vf(ynVar3, 29)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 25:
                nk0 nk0Var = (nk0) this.b;
                if (nk0Var.r <= 0.0f || nk0Var.e == null) {
                    canvas2 = canvas;
                } else {
                    nk0Var.f.reset();
                    float width = getWidth() / nk0Var.c.getWidth();
                    nk0Var.f.postScale(width, width);
                    nk0Var.d.setLocalMatrix(nk0Var.f);
                    nk0Var.e.setAlpha((int) (nk0Var.r * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), nk0Var.e);
                }
                super.dispatchDraw(canvas2);
                Drawable drawable = nk0Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (nk0Var.r * 255.0f));
                    canvas2.save();
                    float f10 = nk0Var.I;
                    float f11 = nk0Var.H;
                    float f12 = nk0Var.r;
                    canvas2.translate((f11 * f12) + f10, (0.0f * f12) + nk0Var.J);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(nk0Var.K, nk0Var.L), Math.max(nk0Var.K, nk0Var.L), 0.75f), 1.0f, nk0Var.r);
                    canvas2.scale(T1, T1, ((nk0Var.F.getBounds().width() / 2.0f) * nk0Var.K) + (-nk0Var.I) + nk0Var.F.getBounds().left, ((nk0Var.F.getBounds().height() / 2.0f) * nk0Var.L) + (-nk0Var.J) + nk0Var.F.getBounds().top);
                    gh.g gVar = nk0Var.G;
                    if (gVar != null) {
                        gVar.setAlpha((int) (nk0Var.r * 255.0f));
                        nk0Var.G.draw(canvas2);
                    }
                    nk0Var.F.draw(canvas2);
                    canvas2.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 26:
                le leVar = (le) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && leVar.isShowing()) {
                    leVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 25:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((nk0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rr0[] rr0VarArr;
        rr0 rr0Var;
        switch (this.a) {
            case 2:
                if (((wb) this.b).u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (((hi.g) this.b).t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                uk ukVar = (uk) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= ukVar.x0 && motionEvent.getY() <= ukVar.y0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 23:
                r80 r80Var = (r80) this.b;
                q80 q80Var = r80Var.S;
                if (q80Var != null && (rr0Var = (rr0VarArr = q80Var.n0)[0]) != null && rr0Var.h.getFastScroll() != null && rr0VarArr[0].h.getFastScroll().n) {
                    return r80Var.S.Z(motionEvent);
                }
                q80 q80Var2 = r80Var.S;
                if (q80Var2 == null || !q80Var2.P(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 28:
                gt0 gt0Var = (gt0) this.b;
                if (motionEvent.getActionMasked() != 0 || (!gt0Var.e0 && motionEvent.getY() < gt0Var.b0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r2.f != false) goto L12;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i3;
        float f10;
        switch (this.a) {
            case 12:
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) this.b;
                org.telegram.ui.Cells.m5 m5Var = q5Var.a;
                if (q5Var.O == null || view != m5Var) {
                    return super.drawChild(canvas, view, j10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (!q5Var.P) {
                    return drawChild;
                }
                Rect rect = org.telegram.ui.Cells.q5.c0;
                q5Var.O.c(canvas, q5Var.b, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), 1.0f, false);
                ye yeVar = q5Var.I;
                if (yeVar == null || yeVar.N <= 0 || m5Var.E == null) {
                    return drawChild;
                }
                Path path = m5Var.F;
                if (path == null) {
                    m5Var.F = new Path();
                } else {
                    path.rewind();
                }
                int i10 = m5Var.c;
                if (i10 == -1 || (i3 = m5Var.d) == -1) {
                    measuredWidth = m5Var.getMeasuredWidth();
                    measuredHeight = m5Var.getMeasuredHeight();
                } else {
                    measuredWidth = i10;
                    measuredHeight = i3;
                }
                float L = m5Var.E.c + org.telegram.messenger.g0.L(18.0f);
                float L2 = org.telegram.messenger.g0.L(28.0f);
                float f11 = (measuredWidth - L) / 2.0f;
                float f12 = measuredHeight / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                float f13 = L2 / 2.0f;
                rectF.set(f11, f12 - f13, L + f11, f12 + f13);
                m5Var.F.addRoundRect(rectF, f13, f13, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(m5Var.F);
                ImageReceiver imageReceiver = m5Var.b;
                if (imageReceiver != null && m5Var.s) {
                    imageReceiver.p1 = m5Var.G;
                    float alpha = imageReceiver.getAlpha();
                    m5Var.b.setAlpha(1.0f);
                    m5Var.b.h(canvas, null);
                    m5Var.b.setAlpha(alpha);
                    m5Var.b.p1 = null;
                }
                m5Var.E.c(f11 + org.telegram.messenger.g0.L(9.0f), f12, 1.0f, -1, canvas);
                canvas.restore();
                return drawChild;
            case 16:
                canvas.save();
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                uk ukVar = (uk) this.b;
                canvas.clipRect(0, 0, measuredWidth2, measuredHeight2 - ukVar.z0);
                boolean drawChild2 = ukVar.y ? false : super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            case 28:
                gt0 gt0Var = (gt0) this.b;
                if (gt0Var.e0) {
                    uj0 uj0Var = gt0Var.E;
                    f10 = gt0Var.M.getX();
                    break;
                }
                f10 = 0.0f;
                int save = canvas.save();
                canvas.clipRect(Math.max(0.0f, f10), -gt0Var.T, Math.min(getWidth(), getWidth() + f10), Math.min(getHeight() + gt0Var.U, gt0Var.b0));
                canvas.translate(f10, 0.0f);
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save);
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 11:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 19:
                ut utVar = (ut) this.b;
                d71 d71Var = utVar.k1;
                pt ptVar = utVar.j1;
                super.onDetachedFromWindow();
                try {
                    ie0 ie0Var = ie0.q0;
                    if (ie0Var.Q) {
                        if (ptVar.getVisibility() != 0) {
                        }
                        if (d71Var.f() && !ie0Var.Q) {
                            if (ut.K1 == utVar) {
                                ut.K1 = null;
                            }
                            d71Var.b();
                            break;
                        }
                    }
                    if (ptVar.getParent() != null) {
                        removeView(ptVar);
                        ptVar.stopLoading();
                        ptVar.loadUrl("about:blank");
                        ptVar.destroy();
                    }
                    if (d71Var.f()) {
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                super.onDraw(canvas);
                dh.o oVar = (dh.o) this.b;
                if (oVar.y > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.y, getWidth(), getHeight(), oVar.E);
                    break;
                }
                break;
            case 14:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.g) this.b) == null) {
                    org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
                    this.b = gVar;
                    gVar.k = false;
                    gVar.m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.g) this.b).f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.b).a(org.telegram.messenger.g0.L(4.0f), canvas, rectF, null);
                invalidate();
                break;
            case 15:
                ((t9) this.b).e.a(canvas);
                break;
            case 16:
                uk ukVar = (uk) this.b;
                ukVar.a0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, ukVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - ukVar.z0, ukVar.a0);
                break;
            case 27:
                zs0 zs0Var = (zs0) this.b;
                zs0Var.l1.setBounds(0, zs0Var.n1 - zs0Var.t0, getMeasuredWidth(), getMeasuredHeight());
                zs0Var.l1.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 16:
                uk ukVar = (uk) this.b;
                if (motionEvent.getActionMasked() != 0 || (motionEvent.getY() >= ukVar.x0 && motionEvent.getY() <= ukVar.y0)) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 27:
                zs0 zs0Var = (zs0) this.b;
                if (motionEvent.getAction() != 0 || zs0Var.n1 == 0 || motionEvent.getY() >= zs0Var.n1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                zs0Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int left;
        int measuredWidth;
        int measuredWidth2;
        int measuredHeight;
        int L;
        int measuredHeight2;
        int i15;
        int i16;
        float f10;
        boolean z11;
        switch (this.a) {
            case 3:
                super.onLayout(z10, i3, i10, i11, i12);
                dh.o oVar = (dh.o) this.b;
                if (oVar.P && z10) {
                    oVar.j0(oVar.R.e);
                    break;
                }
                break;
            case 10:
                int childCount = getChildCount();
                int i17 = i11 - i3;
                int i18 = -1;
                if (((org.telegram.ui.ActionBar.s1) this.b).N0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i17 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z12 = bd.a0;
                    int i19 = z12 ? paddingRight - max : paddingLeft;
                    if (!z12) {
                        paddingLeft = paddingRight - max;
                    }
                    int paddingTop = getPaddingTop();
                    int L2 = org.telegram.messenger.g0.L(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i19, paddingTop, i19 + max, org.telegram.messenger.g0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, org.telegram.messenger.g0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i19, L2, i19 + max, org.telegram.messenger.g0.L(40.0f) + L2);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, L2, max + paddingLeft, org.telegram.messenger.g0.L(40.0f) + L2);
                        break;
                    }
                } else {
                    View view = null;
                    int i20 = 0;
                    while (i20 < childCount) {
                        View childAt = getChildAt(i20);
                        Integer num = (Integer) childAt.getTag();
                        if (num == null) {
                            int measuredWidth3 = childAt.getMeasuredWidth();
                            int measuredHeight3 = childAt.getMeasuredHeight();
                            if (view != null) {
                                i14 = ((view.getMeasuredWidth() - measuredWidth3) / 2) + view.getLeft();
                                i13 = ((view.getMeasuredHeight() - measuredHeight3) / 2) + view.getTop();
                            } else {
                                i13 = 0;
                                i14 = 0;
                            }
                            childAt.layout(i14, i13, measuredWidth3 + i14, measuredHeight3 + i13);
                        } else if (num.intValue() == i18) {
                            if (bd.a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (bd.a0) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.k5.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i17 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = org.telegram.messenger.camera.q.w(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (bd.a0) {
                                if (findViewWithTag5 == null) {
                                    left = i17 - getPaddingRight();
                                    measuredWidth = childAt.getMeasuredWidth();
                                } else {
                                    left = findViewWithTag5.getLeft() - org.telegram.messenger.g0.L(8.0f);
                                    measuredWidth = childAt.getMeasuredWidth();
                                }
                                int i21 = left - measuredWidth;
                                childAt.layout(i21, getPaddingTop(), childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingLeft3 = findViewWithTag5 == null ? getPaddingLeft() : findViewWithTag5.getRight() + org.telegram.messenger.g0.L(8.0f);
                                childAt.layout(paddingLeft3, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft3, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -3) {
                            if (bd.a0) {
                                childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                        i20++;
                        i18 = -1;
                    }
                    break;
                }
                break;
            case 13:
                super.onLayout(z10, i3, i10, i11, i12);
                r10 r10Var = (r10) this.b;
                r10Var.setTranslationY((getMeasuredHeight() * 0.28f) - (r10Var.getMeasuredWidth() / 2.0f));
                r10Var.setTranslationX((getMeasuredWidth() * 0.82f) - (r10Var.getMeasuredWidth() / 2.0f));
                break;
            case 15:
                super.onLayout(z10, i3, i10, i11, i12);
                int L3 = org.telegram.messenger.g0.L(36.0f);
                int i22 = ((i11 - i3) - L3) / 2;
                int i23 = ((i12 - i10) - L3) / 2;
                ((t9) this.b).e.f(i22, i23, i22 + L3, L3 + i23);
                break;
            case 17:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i15 = getMeasuredWidth() / 2;
                    int i24 = measuredHeight / 2;
                    measuredHeight2 = org.telegram.messenger.g0.L(17.0f) + measuredHeight + i24;
                    i16 = i24 - org.telegram.messenger.g0.L(17.0f);
                    L = i15;
                } else {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(13.0f);
                    int i25 = measuredWidth2 / 2;
                    int L4 = measuredWidth2 + i25 + org.telegram.messenger.g0.L(17.0f);
                    L = i25 - org.telegram.messenger.g0.L(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(13.0f);
                    i15 = L4;
                    i16 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.r0.getMeasuredHeight()) - org.telegram.messenger.g0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.r0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.r0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.r0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.r0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.l0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.l0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.l0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                imageView.layout(i15 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.s0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.s0.getMeasuredWidth() / 2) + i15, (chatAttachAlertPhotoLayout.s0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i26 = 0; i26 < 2; i26++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.T[i26];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i16 - (chatAttachAlertPhotoLayout.T[i26].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.T[i26].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.T[i26].getMeasuredHeight() / 2) + i16);
                }
                break;
            case 22:
                super.onLayout(z10, i3, i10, i11, i12);
                l10 l10Var = (l10) this.b;
                o2 o2Var = l10Var.b;
                int[] iArr = l10Var.H;
                o2Var.getLocationOnScreen(iArr);
                l10Var.O = iArr[0];
                l10Var.N = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                break;
            case 25:
                super.onLayout(z10, i3, i10, i11, i12);
                nk0 nk0Var = (nk0) this.b;
                o2 o2Var2 = nk0Var.s;
                qt0 qt0Var = nk0Var.w;
                Drawable drawable = nk0Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (nk0Var.y != null) {
                        float f11 = bounds.left;
                        float f12 = nk0Var.I;
                        float f13 = f11 + f12;
                        float f14 = bounds.right + f12;
                        float f15 = bounds.top;
                        float f16 = nk0Var.J;
                        float f17 = f15 + f16;
                        float f18 = bounds.bottom + f16;
                        boolean z13 = false;
                        if (nk0Var.M) {
                            f10 = 4.0f;
                            z11 = false;
                        } else {
                            if (f14 - r5.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                nk0Var.E.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                nk0Var.y.setX(Math.min(qt0Var.getWidth() - nk0Var.y.getWidth(), f13 - org.telegram.messenger.g0.L(10.0f)) - qt0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                nk0Var.E.setPivotX(r5.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                nk0Var.y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f14) - nk0Var.y.getMeasuredWidth()) - qt0Var.getX());
                                z11 = true;
                            }
                            nk0Var.H = z11 ? ((nk0Var.y.getX() + nk0Var.y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f14 : (nk0Var.y.getX() + org.telegram.messenger.g0.L(10.0f)) - f13;
                        }
                        float L5 = f18 + (nk0Var.G != null ? org.telegram.messenger.g0.L(21.0f) : 0);
                        if (nk0Var.y.getMeasuredHeight() + L5 > o2Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            nk0Var.E.setPivotY(r2.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            nk0Var.y.setY(((f17 - org.telegram.messenger.g0.L(f10)) - nk0Var.y.getMeasuredHeight()) - qt0Var.getY());
                            z13 = true;
                        } else {
                            nk0Var.E.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            nk0Var.y.setY(Math.min((o2Var2.getHeight() - nk0Var.y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), L5) - qt0Var.getY());
                        }
                        f60 f60Var = nk0Var.x;
                        f60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        break;
                    }
                }
                break;
            case 27:
                super.onLayout(z10, i3, i10, i11, i12);
                zs0.I0((zs0) this.b);
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        int i11;
        switch (this.a) {
            case 0:
                super.onMeasure(i3, i10);
                ((q2) this.b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(i3, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i12 = 0;
                if (!((org.telegram.ui.ActionBar.s1) this.b).N0) {
                    int i13 = 0;
                    while (i12 < childCount) {
                        View childAt = getChildAt(i12);
                        if ((childAt instanceof TextView) && childAt.getTag() != null) {
                            i13 = childAt.getMeasuredWidth() + i13;
                        }
                        i12++;
                    }
                    if (i13 > measuredWidth) {
                        View findViewWithTag = findViewWithTag(-2);
                        View findViewWithTag2 = findViewWithTag(-4);
                        View findViewWithTag3 = findViewWithTag(-3);
                        if (findViewWithTag != null && findViewWithTag3 != null) {
                            if (findViewWithTag.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                            if (findViewWithTag2.getMeasuredWidth() >= findViewWithTag3.getMeasuredWidth()) {
                                findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            } else {
                                findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i13 - measuredWidth), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), TLObject.FLAG_30));
                                break;
                            }
                        }
                    }
                } else {
                    int max = Math.max(0, (measuredWidth - org.telegram.messenger.g0.L(8.0f)) / 2);
                    while (i12 < childCount) {
                        View childAt2 = getChildAt(i12);
                        if (childAt2.getTag() != null) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
                        }
                        i12++;
                    }
                    break;
                }
                break;
            case 14:
                if (View.MeasureSpec.getSize(i3) <= org.telegram.messenger.g0.L(260.0f)) {
                    super.onMeasure(i3, i10);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(320.0f), TLObject.FLAG_30), i10);
                    break;
                }
            case 19:
                int size = View.MeasureSpec.getSize(i3);
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((((ut) this.b).B1 ? 22 : 0) + 84) + ((int) Math.min(r0.z1 / (r0.y1 / size), org.telegram.messenger.g0.q.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 20:
                ex exVar = (ex) this.b;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((((View) exVar.G.getParent()) != null ? (int) (r0.getMeasuredHeight() - exVar.G.getY()) : org.telegram.messenger.g0.L(120.0f)) - exVar.G.c1, TLObject.FLAG_30));
                break;
            case 21:
                ey eyVar = ((yx) this.b).R;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.camera.q.y(8.0f, eyVar.E0.getMeasuredHeight() - eyVar.c1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 27:
                zs0 zs0Var = (zs0) this.b;
                ci.j1 j1Var = zs0Var.j1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
                getMeasuredWidth();
                int D = org.telegram.messenger.k5.D(54.0f, ld.g(), org.telegram.messenger.k5.C(56.0f, org.telegram.messenger.g0.L(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i11 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i11 = i14 * 2;
                    if (D < size2) {
                        i11 -= size2 - D;
                    }
                }
                if (j1Var.getPaddingTop() != i11) {
                    zs0Var.o1 = true;
                    j1Var.setPadding(0, i11, 0, org.telegram.messenger.g0.L(8.0f));
                    zs0Var.o1 = false;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 25:
                super.onSizeChanged(i3, i10, i11, i12);
                nk0 nk0Var = (nk0) this.b;
                jh.d.c(nk0Var.h, nk0Var.s);
                ViewGroup viewGroup = nk0Var.E;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 27:
                return !((zs0) this.b).J && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        switch (this.a) {
            case 8:
                super.onViewAdded(view);
                bringChildToFront((mh.f) this.b);
                break;
            default:
                super.onViewAdded(view);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 24:
                tj0 tj0Var = (tj0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(tj0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(tj0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, tj0Var.c1.getMeasuredWidth(), tj0Var.c1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 27:
                if (!((zs0) this.b).o1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 29:
                if (!((xv0) this.b).Y1) {
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
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f10);
                ci.l6 l6Var = (ci.l6) this.b;
                ci.q4 q4Var = l6Var.X1;
                if (q4Var != null && q4Var.getVisibility() == 0) {
                    l6Var.X1.invalidate();
                    break;
                }
                break;
            case 5:
                va vaVar = (va) this.b;
                if (getTranslationY() != f10 && vaVar.d1 != null) {
                    super.setTranslationY(f10);
                    vaVar.d1.y();
                    break;
                }
                break;
            case 11:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.b;
                FrameLayout frameLayout = t2Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(t2Var.c.getHeight() - t2Var.b.getY())) + t2Var.t0);
                }
                t2Var.g0(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        switch (this.a) {
            case 22:
                super.setVisibility(i3);
                ((l10) this.b).d.setVisibility(i3);
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(Context context, int i3) {
        super(context);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Context context) {
        super(context);
        this.a = 8;
        mh.f fVar = new mh.f(context);
        this.b = fVar;
        addView(fVar, mf.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 18;
        this.b = new yn[2];
        int i3 = 0;
        while (true) {
            yn[] ynVarArr = (yn[]) this.b;
            if (i3 < ynVarArr.length) {
                ynVarArr[i3] = new yn(context, e6Var);
                addView(((yn[]) this.b)[i3], mf.e(-1, -1, hs.E1));
                i3++;
            } else {
                ynVarArr[0].setVisibility(0);
                ((yn[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Context context, String str, ei.b bVar) {
        super(context);
        this.a = 4;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i3 = org.telegram.ui.ActionBar.k6.j5;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i3, bVar)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.06f, i3);
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, L2, null, bVar);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, mf.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.b = h6Var;
        h6Var.b(0.6f, 450L, xq.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, bVar);
        h6Var.setScaleProperty(0.7f);
        h6Var.setGravity(17);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setAllowCancel(true);
        f10.addView(h6Var, mf.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, bVar);
        textView.setGravity(17);
        f10.addView(textView, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(dh.o oVar, Context context) {
        super(context);
        this.a = 3;
        this.b = oVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(gt0 gt0Var, Context context) {
        super(context);
        this.a = 28;
        this.b = gt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Context context, r10 r10Var) {
        super(context);
        this.a = 13;
        this.b = r10Var;
    }
}
