package bg;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import jh.h5;
import jh.ia;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.yk;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x2 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public ko a() {
        return ((ko[]) this.b)[0];
    }

    public void b() {
        ko[] koVarArr = (ko[]) this.b;
        ko koVar = koVarArr[0];
        ko koVar2 = koVarArr[1];
        koVarArr[0] = koVar2;
        koVarArr[1] = koVar;
        koVar2.n = true;
        koVar2.setVisibility(0);
        koVarArr[0].setScaleX(0.8f);
        koVarArr[0].setScaleY(0.8f);
        koVarArr[0].setAlpha(0.0f);
        koVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = koVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        jr jrVar = jr.h;
        org.telegram.ui.b.q(translationY, jrVar, 320L);
        ko koVar3 = koVarArr[1];
        koVar3.n = false;
        koVar3.setVisibility(0);
        koVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(jrVar).setDuration(320L).withEndAction(new ig(koVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 2:
                c4 c4Var = (c4) this.b;
                if (c4Var.y > 0.0f && c4Var.s != null) {
                    c4Var.v.reset();
                    float width = getWidth() / c4Var.n.getWidth();
                    c4Var.v.postScale(width, width);
                    c4Var.r.setLocalMatrix(c4Var.v);
                    c4Var.s.setAlpha((int) (c4Var.y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), c4Var.s);
                }
                super.dispatchDraw(canvas);
                break;
            case 25:
                yl0 yl0Var = (yl0) this.b;
                if (yl0Var.r > 0.0f && yl0Var.e != null) {
                    yl0Var.f.reset();
                    float width2 = getWidth() / yl0Var.c.getWidth();
                    yl0Var.f.postScale(width2, width2);
                    yl0Var.d.setLocalMatrix(yl0Var.f);
                    yl0Var.e.setAlpha((int) (yl0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), yl0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = yl0Var.A;
                if (drawable != null) {
                    drawable.setAlpha((int) (yl0Var.r * 255.0f));
                    canvas.save();
                    float f11 = yl0Var.D;
                    float f12 = yl0Var.C;
                    float f13 = yl0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + yl0Var.E);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(yl0Var.F, yl0Var.G), Math.max(yl0Var.F, yl0Var.G), 0.75f), 1.0f, yl0Var.r);
                    canvas.scale(lerp, lerp, ((yl0Var.A.getBounds().width() / 2.0f) * yl0Var.F) + (-yl0Var.D) + yl0Var.A.getBounds().left, ((yl0Var.A.getBounds().height() / 2.0f) * yl0Var.G) + (-yl0Var.E) + yl0Var.A.getBounds().top);
                    ng.d dVar = yl0Var.B;
                    if (dVar != null) {
                        dVar.setAlpha((int) (yl0Var.r * 255.0f));
                        yl0Var.B.draw(canvas);
                    }
                    yl0Var.A.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 29:
                fy0 fy0Var = (fy0) this.b;
                dy0 dy0Var = fy0Var.c;
                if (dy0Var != null && dy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = fy0Var.P;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x4 = fy0Var.c.getEditField().getX() + fy0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = fy0Var.P;
                        fy0Var.T = x4 + emojiSpan2.lastDrawX;
                        fy0Var.Q = emojiSpan2.lastDrawY;
                    } else if (fy0Var.R != null && fy0Var.S != null) {
                        fy0Var.T = fy0Var.c.getEditField().getX() + fy0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!fy0Var.s || fy0Var.v || (arrayList = fy0Var.w) == null || arrayList.isEmpty() || fy0Var.x) ? false : true;
                float d = fy0Var.L.d(z10 ? 1.0f : 0.0f, false);
                float d10 = fy0Var.M.d(z10 ? 1.0f : 0.0f, false);
                float d11 = fy0Var.U.d(fy0Var.T, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    fy0Var.d.setVisibility(8);
                }
                fy0Var.I.rewind();
                float left = fy0Var.e.getLeft();
                int left2 = fy0Var.e.getLeft();
                ArrayList arrayList2 = fy0Var.w;
                float D = org.telegram.messenger.x3.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                d6 d6Var = fy0Var.W;
                float f14 = d6Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = D - left;
                if (f15 > 0.0f) {
                    f14 = d6Var.d(f15, z11);
                }
                float d12 = fy0Var.V.d((left + D) / 2.0f, z11);
                dy0 dy0Var2 = fy0Var.c;
                if (dy0Var2 != null && dy0Var2.getEditField() != null) {
                    int i10 = fy0Var.h;
                    if (i10 == 0) {
                        fy0Var.d.setTranslationY(((-fy0Var.c.getEditField().getHeight()) - fy0Var.c.getEditField().getScrollY()) + fy0Var.Q + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        fy0Var.d.setTranslationY(((-fy0Var.getMeasuredHeight()) - fy0Var.c.getEditField().getScrollY()) + fy0Var.Q + AndroidUtilities.dp(20.0f) + fy0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((fy0Var.T - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - fy0Var.e.getLeft(), 0.0f);
                if (fy0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = fy0Var.e.getPaddingLeft() - max;
                    f9 = 1.0f;
                    fy0Var.e.setPadding(max, 0, 0, 0);
                    fy0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f9 = 1.0f;
                }
                fy0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - fy0Var.e.getLeft(), 0.0f)) - max);
                float translationX = fy0Var.e.getTranslationX() + (d12 - f17) + fy0Var.e.getPaddingLeft();
                float translationY = fy0Var.e.getTranslationY() + fy0Var.e.getTop() + fy0Var.e.getPaddingTop() + (fy0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(fy0Var.e.getTranslationX() + d12 + f17 + fy0Var.e.getPaddingLeft(), fy0Var.getWidth() - fy0Var.d.getPaddingRight());
                float translationY2 = (fy0Var.e.getTranslationY() + fy0Var.e.getBottom()) - (fy0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = fy0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    fy0Var.I.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    fy0Var.I.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    fy0Var.I.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    fy0Var.I.arcTo(rectF, 0.0f, 90.0f);
                    fy0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    fy0Var.I.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    fy0Var.I.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    fy0Var.I.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    fy0Var.I.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    fy0Var.I.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    fy0Var.I.arcTo(rectF2, -180.0f, 90.0f);
                    fy0Var.I.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    fy0Var.I.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    fy0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                fy0Var.I.close();
                if (fy0Var.K == null) {
                    Paint paint = new Paint(1);
                    fy0Var.K = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    fy0Var.K.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    fy0Var.K.setColor(g6.v0(g6.Be, fy0Var.b));
                }
                if (d < f9) {
                    fy0Var.J.rewind();
                    float dp = fy0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f10 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    fy0Var.J.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(fy0Var.J);
                    canvas.saveLayerAlpha(0.0f, 0.0f, fy0Var.getWidth(), fy0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(fy0Var.I, fy0Var.K);
                canvas.save();
                canvas.clipPath(fy0Var.I);
                super.dispatchDraw(canvas);
                float f26 = fy0Var.W.c;
                float f27 = fy0Var.V.c;
                float f28 = f26 / 2.0f;
                float translationX2 = fy0Var.e.getTranslationX() + (f27 - f28) + fy0Var.e.getPaddingLeft();
                float paddingTop = fy0Var.e.getPaddingTop() + fy0Var.e.getTop();
                float min3 = Math.min(fy0Var.e.getTranslationX() + f27 + f28 + fy0Var.e.getPaddingLeft(), fy0Var.getWidth() - fy0Var.d.getPaddingRight());
                float bottom = fy0Var.e.getBottom();
                float d17 = fy0Var.N.d(fy0Var.e.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    g6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    g6.F4.setAlpha((int) (d17 * f10));
                    g6.F4.draw(canvas);
                }
                float d18 = fy0Var.O.d(fy0Var.e.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    g6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    g6.E4.setAlpha((int) (d18 * f10));
                    g6.E4.draw(canvas);
                }
                canvas.restore();
                if (fy0Var.L.c < f9) {
                    canvas.restore();
                    canvas.restore();
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
                ye yeVar = (ye) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && yeVar.isShowing()) {
                    yeVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 2:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((c4) this.b).onBackPressed();
                return true;
            case 25:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((yl0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 8:
                if (((ia) this.b).b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                int action = motionEvent.getAction();
                lh.i1 i1Var = lh.i1.V;
                if (i1Var.C != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(i1Var.C.getX(), i1Var.C.getY());
                    boolean dispatchTouchEvent = i1Var.C.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        i1Var.C = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = i1Var.x.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !i1Var.x.isInProgress() && ((GestureDetector) i1Var.y.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    i1Var.A = false;
                    i1Var.B = false;
                    o1.k kVar = i1Var.L;
                    if (!kVar.f) {
                        float f9 = i1Var.J;
                        kVar.b = f9;
                        kVar.c = true;
                        kVar.u.i = (i1Var.F / 2.0f) + f9 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        i1Var.L.f();
                    }
                    o1.k kVar2 = i1Var.M;
                    if (!kVar2.f) {
                        kVar2.b = i1Var.K;
                        kVar2.c = true;
                        kVar2.u.i = i7.w.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
                        i1Var.M.f();
                    }
                }
                return onTouchEvent || z10;
            case 13:
                if (((oh.g) this.b).a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 17:
                if (motionEvent.getY() > getMeasuredHeight() - ((bl) this.b).x0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 17:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                bl blVar = (bl) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - blVar.x0);
                boolean drawChild = blVar.C ? false : super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 11:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                lh.i1 i1Var = lh.i1.V;
                AndroidUtilities.setPreferredMaxRefreshRate(i1Var.b, i1Var.d, i1Var.c);
                i1Var.i();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 20:
                mu muVar = (mu) this.b;
                s81 s81Var = muVar.c;
                gu guVar = muVar.b;
                super.onDetachedFromWindow();
                try {
                    bg0 bg0Var = bg0.l0;
                    if (bg0Var.L) {
                        if (guVar.getVisibility() != 0) {
                        }
                        if (s81Var.f() && !bg0Var.L) {
                            if (mu.O == muVar) {
                                mu.O = null;
                            }
                            s81Var.b();
                            break;
                        }
                    }
                    if (guVar.getParent() != null) {
                        removeView(guVar);
                        guVar.stopLoading();
                        guVar.loadUrl("about:blank");
                        guVar.destroy();
                    }
                    if (s81Var.f()) {
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
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
        int i10;
        switch (this.a) {
            case 0:
                y2 y2Var = (y2) this.b;
                Rect rect = y2Var.A0;
                Rect rect2 = y2Var.z0;
                Paint paint = y2Var.B0;
                bv0 bv0Var = y2Var.r0;
                Bitmap bitmap = y2Var.w0;
                if (y2Var.v0 != null) {
                    canvas.save();
                    float e10 = y2Var.q0.e(y2Var.p0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, bv0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.x3.y(1.0f, e10, 4.0f * e10, 0.25f));
                    float e11 = y2Var.u0.e(y2Var.t0);
                    if (!y2Var.t0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e11) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(y2Var.s0);
                            float max = Math.max(bv0Var.a / bitmap.getWidth(), bv0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (y2Var.C0 != null) {
                                canvas.rotate(-y2Var.getOrientation());
                                int contentWidth = y2Var.getContentWidth();
                                int contentHeight = y2Var.getContentHeight();
                                if (((y2Var.getOrientation() + y2Var.C0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = y2Var.getContentHeight();
                                    contentHeight = y2Var.getContentWidth();
                                }
                                MediaController.CropState cropState = y2Var.C0;
                                float f9 = cropState.cropPw;
                                float f10 = cropState.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f9) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f9 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = y2Var.C0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState2 = y2Var.C0;
                                canvas.translate(cropState2.cropPx * f11, cropState2.cropPy * f12);
                                canvas.rotate(y2Var.C0.cropRotate + r4.transformRotation);
                                if (y2Var.C0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(y2Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                v3 v3Var = (v3) this.b;
                ImageReceiver imageReceiver = v3Var.t0;
                bv0 bv0Var2 = v3Var.r0;
                if (v3Var.s0 != null) {
                    canvas.save();
                    float e12 = v3Var.q0.e(v3Var.p0);
                    canvas.scale(1.0f - (e12 * 2.0f), 1.0f, bv0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.x3.y(1.0f, e12, 4.0f * e12, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) bv0Var2.a, (int) bv0Var2.b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 15:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.b = hVar;
                    hVar.k = false;
                    hVar.m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.b).f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                break;
            case 16:
                ((aa) this.b).e.a(canvas);
                break;
            case 17:
                bl blVar = (bl) this.b;
                blVar.W.setColor(g6.v0(g6.h5, blVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - blVar.x0, blVar.W);
                break;
            case 27:
                uu0 uu0Var = (uu0) this.b;
                Drawable drawable = uu0Var.d;
                int i11 = uu0Var.f;
                i10 = ((org.telegram.ui.ActionBar.f3) uu0Var).backgroundPaddingTop;
                drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        cg.b1 b1Var;
        cg.b1 b1Var2;
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                cg.d1 d1Var = (cg.d1) this.b;
                CharSequence text = (!d1Var.h || (b1Var2 = d1Var.e) == null) ? null : b1Var2.getText();
                if (text == null && (b1Var = d1Var.d) != null) {
                    text = b1Var.getText();
                }
                if (text != null) {
                    accessibilityNodeInfo.setText(text);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(text);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 17:
                if (motionEvent.getY() > getMeasuredHeight() - ((bl) this.b).x0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 27:
                uu0 uu0Var = (uu0) this.b;
                if (motionEvent.getAction() != 0 || uu0Var.f == 0 || motionEvent.getY() >= uu0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                uu0Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int measuredHeight;
        int dp;
        int measuredHeight2;
        int i14;
        int i15;
        float f9;
        boolean z11;
        switch (this.a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                kg.s sVar = (kg.s) this.b;
                if (sVar.G && z10) {
                    sVar.w.setTranslationY(-sVar.c.getMeasuredHeight());
                    int measuredHeight3 = sVar.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.y.setLayoutParams(marginLayoutParams);
                    break;
                }
                break;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                c30 c30Var = (c30) this.b;
                c30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (c30Var.getMeasuredWidth() / 2.0f));
                c30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (c30Var.getMeasuredWidth() / 2.0f));
                break;
            case 16:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((aa) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
                break;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i14 = getMeasuredWidth() / 2;
                    int i18 = measuredHeight / 2;
                    measuredHeight2 = AndroidUtilities.dp(17.0f) + measuredHeight + i18;
                    i15 = i18 - AndroidUtilities.dp(17.0f);
                    dp = i14;
                } else {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    int i19 = measuredWidth / 2;
                    int dp3 = measuredWidth + i19 + AndroidUtilities.dp(17.0f);
                    dp = i19 - AndroidUtilities.dp(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    i14 = dp3;
                    i15 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.m0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.m0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.m0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.m0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.m0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.m0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.m0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.g0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.g0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.g0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.g0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.n0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.n0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.n0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.n0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i20 = 0; i20 < 2; i20++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.O[i20];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.O[i20].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.O[i20].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.O[i20].getMeasuredHeight() / 2) + i15);
                }
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                w20 w20Var = (w20) this.b;
                x2 x2Var = w20Var.b;
                int[] iArr = w20Var.C;
                x2Var.getLocationOnScreen(iArr);
                w20Var.J = iArr[0];
                w20Var.I = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 25:
                super.onLayout(z10, i10, i11, i12, i13);
                yl0 yl0Var = (yl0) this.b;
                x2 x2Var2 = yl0Var.s;
                hv0 hv0Var = yl0Var.v;
                Drawable drawable = yl0Var.A;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (yl0Var.x != null) {
                        float f10 = bounds.left;
                        float f11 = yl0Var.D;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = yl0Var.E;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z12 = false;
                        if (yl0Var.H) {
                            f9 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                yl0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                yl0Var.x.setX(Math.min(hv0Var.getWidth() - yl0Var.x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - hv0Var.getX());
                                f9 = 4.0f;
                                z11 = false;
                            } else {
                                yl0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f9 = 4.0f;
                                yl0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - yl0Var.x.getMeasuredWidth()) - hv0Var.getX());
                                z11 = true;
                            }
                            yl0Var.C = z11 ? ((yl0Var.x.getX() + yl0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13 : (yl0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                        }
                        float dp4 = f17 + (yl0Var.B != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (yl0Var.x.getMeasuredHeight() + dp4 > x2Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            yl0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            yl0Var.x.setY(((f16 - AndroidUtilities.dp(f9)) - yl0Var.x.getMeasuredHeight()) - hv0Var.getY());
                            z12 = true;
                        } else {
                            yl0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            yl0Var.x.setY(Math.min((x2Var2.getHeight() - yl0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - hv0Var.getY());
                        }
                        j70 j70Var = yl0Var.w;
                        j70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 27:
                super.onLayout(z10, i10, i11, i12, i13);
                uu0.m((uu0) this.b);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f9;
        float top;
        int measuredHeight;
        int i12;
        switch (this.a) {
            case 4:
                cg.p1 p1Var = (cg.p1) this.b;
                z10 = ((org.telegram.ui.ActionBar.f3) p1Var).isPortrait;
                if (z10) {
                    p1Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    p1Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 5:
                super.onMeasure(i10, i11);
                cg.f2 f2Var = ((cg.e2) this.b).c;
                cg.i iVar = f2Var.n0;
                if (iVar == null) {
                    View view = f2Var.x0;
                    if (view == null) {
                        f9 = 0.0f;
                        f2Var.m0.setTranslationY(f9 - (r8.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = f2Var.x0.getMeasuredHeight();
                    }
                } else {
                    top = iVar.getTop();
                    measuredHeight = f2Var.n0.getMeasuredHeight();
                }
                f9 = (measuredHeight / 2.0f) + top;
                f2Var.m0.setTranslationY(f9 - (r8.getMeasuredHeight() / 2.0f));
            case 6:
                super.onMeasure(i10, i11);
                ((ih.y1) this.b).G.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 15:
                if (View.MeasureSpec.getSize(i10) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i10, i11);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), TLObject.FLAG_30), i11);
                    break;
                }
            case 17:
                super.onMeasure(i10, i11);
                yk ykVar = ((bl) this.b).B;
                if (ykVar != null) {
                    ykVar.a();
                    break;
                }
                break;
            case 20:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((mu) this.b).F ? 22 : 0) + 84) + ((int) Math.min(r0.D / (r0.C / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 21:
                ey eyVar = (ey) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) eyVar.B.getParent()) != null ? (int) (r0.getMeasuredHeight() - eyVar.B.getY()) : AndroidUtilities.dp(120.0f)) - eyVar.B.X0, TLObject.FLAG_30));
                break;
            case 22:
                fz fzVar = ((az) this.b).M;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.b.x(8.0f, fzVar.z0.getMeasuredHeight() - fzVar.X0, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 27:
                uu0 uu0Var = (uu0) this.b;
                jh.e1 e1Var = uu0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.x3.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.x3.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i13 = size2 / 5;
                if (D < i13 * 3) {
                    i12 = AndroidUtilities.dp(8.0f);
                } else {
                    i12 = i13 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (e1Var.getPaddingTop() != i12) {
                    uu0Var.h = true;
                    e1Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    uu0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 29:
                fy0 fy0Var = (fy0) this.b;
                setPadding(fy0Var.n, fy0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), fy0Var.n, fy0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 11:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 25:
                super.onSizeChanged(i10, i11, i12, i13);
                yl0 yl0Var = (yl0) this.b;
                rg.c.c(yl0Var.h, yl0Var.s);
                ViewGroup viewGroup = yl0Var.y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 27:
                return !((uu0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 24:
                jl0 jl0Var = (jl0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(jl0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(jl0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, jl0Var.Z0.getMeasuredWidth(), jl0Var.Z0.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 25:
            case 26:
            default:
                super.requestLayout();
                break;
            case 27:
                if (!((uu0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 28:
                if (!((nx0) this.b).c0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        switch (this.a) {
            case 7:
                super.setTranslationY(f9);
                h5 h5Var = (h5) this.b;
                jh.r3 r3Var = h5Var.Z;
                if (r3Var != null && r3Var.getVisibility() == 0) {
                    h5Var.Z.invalidate();
                    break;
                }
                break;
            case 12:
                gb gbVar = (gb) this.b;
                if (getTranslationY() != f9 && gbVar.Y0 != null) {
                    super.setTranslationY(f9);
                    gbVar.Y0.y();
                    break;
                }
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 23:
                super.setVisibility(i10);
                ((w20) this.b).d.setVisibility(i10);
                break;
            case 29:
                fy0 fy0Var = (fy0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (fy0Var.e != null) {
                        for (int i11 = 0; i11 < fy0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                ey0 ey0Var = (ey0) fy0Var.e.getChildAt(i11);
                                Drawable drawable = ey0Var.b;
                                if (drawable instanceof p5) {
                                    ((p5) drawable).a(ey0Var);
                                }
                                ey0Var.c = true;
                            } else {
                                ey0 ey0Var2 = (ey0) fy0Var.e.getChildAt(i11);
                                Drawable drawable2 = ey0Var2.b;
                                if (drawable2 instanceof p5) {
                                    ((p5) drawable2).o(ey0Var2);
                                }
                                ey0Var2.c = false;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(v3 v3Var, Context context) {
        super(context);
        this.a = 1;
        this.b = v3Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Context context, c6 c6Var) {
        super(context);
        this.a = 19;
        this.b = new ko[2];
        int i10 = 0;
        while (true) {
            ko[] koVarArr = (ko[]) this.b;
            if (i10 < koVarArr.length) {
                koVarArr[i10] = new ko(context, c6Var);
                addView(((ko[]) this.b)[i10], f6.e(-1, -1, 119));
                i10++;
            } else {
                koVarArr[0].setVisibility(0);
                ((ko[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(y2 y2Var, Context context) {
        super(context);
        this.a = 0;
        this.b = y2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Context context, String str, lh.b bVar) {
        super(context);
        this.a = 10;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = g6.j5;
        setBackground(g6.b0(dp, g6.l1(0.06f, bVar.C0(i10))));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        addView(g10, f6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        o6 o6Var = new o6(context, false, true, true);
        this.b = o6Var;
        o6Var.b(0.6f, 450L, jr.h);
        o6Var.setTextSize(AndroidUtilities.dp(17.0f));
        o6Var.setTextColor(bVar.C0(i10));
        o6Var.setScaleProperty(0.7f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setAllowCancel(true);
        g10.addView(o6Var, f6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.C0(i10));
        textView.setGravity(17);
        g10.addView(textView, f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Context context, c30 c30Var) {
        super(context);
        this.a = 14;
        this.b = c30Var;
    }
}
