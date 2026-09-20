package ai;

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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.z20;
import org.telegram.ui.gg0;
import org.telegram.ui.mi1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class f0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public qo a() {
        return ((qo[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 5:
                super.addView(view, i10, i11);
                ((hh.g) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    public void b() {
        qo[] qoVarArr = (qo[]) this.b;
        qo qoVar = qoVarArr[0];
        qo qoVar2 = qoVarArr[1];
        qoVarArr[0] = qoVar2;
        qoVarArr[1] = qoVar;
        qoVar2.n = true;
        qoVar2.setVisibility(0);
        qoVarArr[0].setScaleX(0.8f);
        qoVarArr[0].setScaleY(0.8f);
        qoVarArr[0].setAlpha(0.0f);
        qoVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = qoVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        qr qrVar = qr.h;
        rk.s(translationY, qrVar, 320L);
        qo qoVar3 = qoVarArr[1];
        qoVar3.n = false;
        qoVar3.setVisibility(0);
        qoVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(qrVar).setDuration(320L).withEndAction(new og(qoVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 17:
                mm0 mm0Var = (mm0) this.b;
                if (mm0Var.r > 0.0f && mm0Var.e != null) {
                    mm0Var.f.reset();
                    float width = getWidth() / mm0Var.c.getWidth();
                    mm0Var.f.postScale(width, width);
                    mm0Var.d.setLocalMatrix(mm0Var.f);
                    mm0Var.e.setAlpha((int) (mm0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), mm0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = mm0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (mm0Var.r * 255.0f));
                    canvas.save();
                    float f11 = mm0Var.H;
                    float f12 = mm0Var.G;
                    float f13 = mm0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + mm0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(mm0Var.J, mm0Var.K), Math.max(mm0Var.J, mm0Var.K), 0.75f), 1.0f, mm0Var.r);
                    canvas.scale(lerp, lerp, ((mm0Var.E.getBounds().width() / 2.0f) * mm0Var.J) + (-mm0Var.H) + mm0Var.E.getBounds().left, ((mm0Var.E.getBounds().height() / 2.0f) * mm0Var.K) + (-mm0Var.I) + mm0Var.E.getBounds().top);
                    ch.d dVar = mm0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (mm0Var.r * 255.0f));
                        mm0Var.F.draw(canvas);
                    }
                    mm0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 21:
                yy0 yy0Var = (yy0) this.b;
                wy0 wy0Var = yy0Var.c;
                if (wy0Var != null && wy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = yy0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = yy0Var.c.getEditField().getX() + yy0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = yy0Var.T;
                        yy0Var.a0 = x10 + emojiSpan2.lastDrawX;
                        yy0Var.U = emojiSpan2.lastDrawY;
                    } else if (yy0Var.V != null && yy0Var.W != null) {
                        yy0Var.a0 = yy0Var.c.getEditField().getX() + yy0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!yy0Var.s || yy0Var.v || (arrayList = yy0Var.w) == null || arrayList.isEmpty() || yy0Var.x) ? false : true;
                float d = yy0Var.P.d(z10 ? 1.0f : 0.0f, false);
                float d10 = yy0Var.Q.d(z10 ? 1.0f : 0.0f, false);
                float d11 = yy0Var.b0.d(yy0Var.a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    yy0Var.d.setVisibility(8);
                }
                yy0Var.M.rewind();
                float left = yy0Var.e.getLeft();
                int left2 = yy0Var.e.getLeft();
                ArrayList arrayList2 = yy0Var.w;
                float D = org.telegram.messenger.l0.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                org.telegram.ui.Components.d6 d6Var = yy0Var.d0;
                float f14 = d6Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = D - left;
                if (f15 > 0.0f) {
                    f14 = d6Var.d(f15, z11);
                }
                float d12 = yy0Var.c0.d((left + D) / 2.0f, z11);
                wy0 wy0Var2 = yy0Var.c;
                if (wy0Var2 != null && wy0Var2.getEditField() != null) {
                    int i10 = yy0Var.h;
                    if (i10 == 0) {
                        yy0Var.d.setTranslationY(((-yy0Var.c.getEditField().getHeight()) - yy0Var.c.getEditField().getScrollY()) + yy0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        yy0Var.d.setTranslationY(((-yy0Var.getMeasuredHeight()) - yy0Var.c.getEditField().getScrollY()) + yy0Var.U + AndroidUtilities.dp(20.0f) + yy0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((yy0Var.a0 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - yy0Var.e.getLeft(), 0.0f);
                if (yy0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = yy0Var.e.getPaddingLeft() - max;
                    f7 = 1.0f;
                    yy0Var.e.setPadding(max, 0, 0, 0);
                    yy0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f7 = 1.0f;
                }
                yy0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - yy0Var.e.getLeft(), 0.0f)) - max);
                float translationX = yy0Var.e.getTranslationX() + (d12 - f17) + yy0Var.e.getPaddingLeft();
                float translationY = yy0Var.e.getTranslationY() + yy0Var.e.getTop() + yy0Var.e.getPaddingTop() + (yy0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(yy0Var.e.getTranslationX() + d12 + f17 + yy0Var.e.getPaddingLeft(), yy0Var.getWidth() - yy0Var.d.getPaddingRight());
                float translationY2 = (yy0Var.e.getTranslationY() + yy0Var.e.getBottom()) - (yy0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = yy0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    yy0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    yy0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    yy0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    yy0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    yy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    yy0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    yy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    yy0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    yy0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    yy0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    yy0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    yy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    yy0Var.M.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    yy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                yy0Var.M.close();
                if (yy0Var.O == null) {
                    Paint paint = new Paint(1);
                    yy0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    yy0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    yy0Var.O.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Be, yy0Var.b));
                }
                if (d < f7) {
                    yy0Var.N.rewind();
                    float dp = yy0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f10 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    yy0Var.N.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(yy0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, yy0Var.getWidth(), yy0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(yy0Var.M, yy0Var.O);
                canvas.save();
                canvas.clipPath(yy0Var.M);
                super.dispatchDraw(canvas);
                float f26 = yy0Var.d0.c;
                float f27 = yy0Var.c0.c;
                float f28 = f26 / 2.0f;
                float translationX2 = yy0Var.e.getTranslationX() + (f27 - f28) + yy0Var.e.getPaddingLeft();
                float paddingTop = yy0Var.e.getPaddingTop() + yy0Var.e.getTop();
                float min3 = Math.min(yy0Var.e.getTranslationX() + f27 + f28 + yy0Var.e.getPaddingLeft(), yy0Var.getWidth() - yy0Var.d.getPaddingRight());
                float bottom = yy0Var.e.getBottom();
                float d17 = yy0Var.R.d(yy0Var.e.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.j6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.j6.F4.setAlpha((int) (d17 * f10));
                    org.telegram.ui.ActionBar.j6.F4.draw(canvas);
                }
                float d18 = yy0Var.S.d(yy0Var.e.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.j6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.j6.E4.setAlpha((int) (d18 * f10));
                    org.telegram.ui.ActionBar.j6.E4.draw(canvas);
                }
                canvas.restore();
                if (yy0Var.P.c < f7) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            case 26:
                qg.t2 t2Var = (qg.t2) this.b;
                if (t2Var.y > 0.0f && t2Var.s != null) {
                    t2Var.v.reset();
                    float width2 = getWidth() / t2Var.n.getWidth();
                    t2Var.v.postScale(width2, width2);
                    t2Var.r.setLocalMatrix(t2Var.v);
                    t2Var.s.setAlpha((int) (t2Var.y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.s);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 18:
                ef efVar = (ef) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && efVar.isShowing()) {
                    efVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 17:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((mm0) this.b).onBackPressed();
                return true;
            case 26:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((qg.t2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                int action = motionEvent.getAction();
                m2 m2Var = m2.Z;
                if (m2Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(m2Var.G.getX(), m2Var.G.getY());
                    boolean dispatchTouchEvent = m2Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        m2Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = m2Var.x.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !m2Var.x.isInProgress() && ((GestureDetector) m2Var.y.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    m2Var.E = false;
                    m2Var.F = false;
                    o1.k kVar = m2Var.P;
                    if (!kVar.f) {
                        float f7 = m2Var.N;
                        kVar.b = f7;
                        kVar.c = true;
                        kVar.u.i = (m2Var.J / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        m2Var.P.f();
                    }
                    o1.k kVar2 = m2Var.Q;
                    if (!kVar2.f) {
                        kVar2.b = m2Var.O;
                        kVar2.c = true;
                        kVar2.u.i = w7.q.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
                        m2Var.Q.f();
                    }
                }
                return onTouchEvent || z10;
            case 3:
                if (((di.i) this.b).e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((gl) this.b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 9:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                gl glVar = (gl) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - glVar.B0);
                boolean drawChild = glVar.G ? false : super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 1:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                m2 m2Var = m2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(m2Var.b, m2Var.d, m2Var.c);
                m2Var.i();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 12:
                vu vuVar = (vu) this.b;
                p91 p91Var = vuVar.c;
                pu puVar = vuVar.b;
                super.onDetachedFromWindow();
                try {
                    og0 og0Var = og0.p0;
                    if (og0Var.P) {
                        if (puVar.getVisibility() != 0) {
                        }
                        if (p91Var.f() && !og0Var.P) {
                            if (vu.S == vuVar) {
                                vu.S = null;
                            }
                            p91Var.b();
                            break;
                        }
                    }
                    if (puVar.getParent() != null) {
                        removeView(puVar);
                        puVar.stopLoading();
                        puVar.loadUrl("about:blank");
                        puVar.destroy();
                    }
                    if (p91Var.f()) {
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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
        int i11;
        switch (this.a) {
            case 7:
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
            case 8:
                ((org.telegram.ui.Components.ca) this.b).e.a(canvas);
                break;
            case 9:
                gl glVar = (gl) this.b;
                glVar.d0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, glVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - glVar.B0, glVar.d0);
                break;
            case 19:
                nv0 nv0Var = (nv0) this.b;
                Drawable drawable = nv0Var.d;
                int i12 = nv0Var.f;
                i10 = ((org.telegram.ui.ActionBar.f3) nv0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 22:
                y61 y61Var = (y61) this.b;
                int i13 = y61Var.h;
                i11 = ((org.telegram.ui.ActionBar.f3) y61Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = y61Var.b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                break;
            case 24:
                qg.y1 y1Var = (qg.y1) this.b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                uv0 uv0Var = y1Var.v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.z0 != null) {
                    canvas.save();
                    float e = y1Var.u0.e(y1Var.t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, uv0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.l0.z(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = y1Var.y0.e(y1Var.x0);
                    if (!y1Var.x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(y1Var.w0);
                            float max = Math.max(uv0Var.a / bitmap.getWidth(), uv0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (y1Var.G0 != null) {
                                canvas.rotate(-y1Var.getOrientation());
                                int contentWidth = y1Var.getContentWidth();
                                int contentHeight = y1Var.getContentHeight();
                                if (((y1Var.getOrientation() + y1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = y1Var.getContentHeight();
                                    contentHeight = y1Var.getContentWidth();
                                }
                                MediaController.CropState cropState = y1Var.G0;
                                float f7 = cropState.cropPw;
                                float f10 = cropState.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = y1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState2 = y1Var.G0;
                                canvas.translate(cropState2.cropPx * f11, cropState2.cropPy * f12);
                                canvas.rotate(y1Var.G0.cropRotate + r4.transformRotation);
                                if (y1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(y1Var.getOrientation());
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
            case 25:
                qg.o2 o2Var = (qg.o2) this.b;
                ImageReceiver imageReceiver = o2Var.x0;
                uv0 uv0Var2 = o2Var.v0;
                if (o2Var.w0 != null) {
                    canvas.save();
                    float e10 = o2Var.u0.e(o2Var.t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, uv0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.l0.z(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) uv0Var2.a, (int) uv0Var2.b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        rg.o0 o0Var;
        rg.o0 o0Var2;
        switch (this.a) {
            case 27:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                rg.p0 p0Var = (rg.p0) this.b;
                CharSequence text = (!p0Var.h || (o0Var2 = p0Var.e) == null) ? null : o0Var2.getText();
                if (text == null && (o0Var = p0Var.d) != null) {
                    text = o0Var.getText();
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
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((gl) this.b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 19:
                nv0 nv0Var = (nv0) this.b;
                if (motionEvent.getAction() != 0 || nv0Var.f == 0 || motionEvent.getY() >= nv0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                nv0Var.dismiss();
                return true;
            case 22:
                y61 y61Var = (y61) this.b;
                if (motionEvent.getAction() != 0 || y61Var.h == 0 || motionEvent.getY() >= y61Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                y61Var.dismiss();
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
        float f7;
        boolean z11;
        switch (this.a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                f30 f30Var = (f30) this.b;
                f30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (f30Var.getMeasuredWidth() / 2.0f));
                f30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (f30Var.getMeasuredWidth() / 2.0f));
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.ca) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
                break;
            case 10:
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i20 = 0; i20 < 2; i20++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i20];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i20].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i20].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i20].getMeasuredHeight() / 2) + i15);
                }
                break;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                z20 z20Var = (z20) this.b;
                f0 f0Var = z20Var.b;
                int[] iArr = z20Var.G;
                f0Var.getLocationOnScreen(iArr);
                z20Var.N = iArr[0];
                z20Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                mm0 mm0Var = (mm0) this.b;
                f0 f0Var2 = mm0Var.s;
                aw0 aw0Var = mm0Var.v;
                Drawable drawable = mm0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (mm0Var.x != null) {
                        float f10 = bounds.left;
                        float f11 = mm0Var.H;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = mm0Var.I;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z12 = false;
                        if (mm0Var.L) {
                            f7 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                mm0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                mm0Var.x.setX(Math.min(aw0Var.getWidth() - mm0Var.x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - aw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                mm0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                mm0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - mm0Var.x.getMeasuredWidth()) - aw0Var.getX());
                                z11 = true;
                            }
                            mm0Var.G = z11 ? ((mm0Var.x.getX() + mm0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13 : (mm0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                        }
                        float dp4 = f17 + (mm0Var.F != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (mm0Var.x.getMeasuredHeight() + dp4 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            mm0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            mm0Var.x.setY(((f16 - AndroidUtilities.dp(f7)) - mm0Var.x.getMeasuredHeight()) - aw0Var.getY());
                            z12 = true;
                        } else {
                            mm0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            mm0Var.x.setY(Math.min((f0Var2.getHeight() - mm0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - aw0Var.getY());
                        }
                        v70 v70Var = mm0Var.w;
                        v70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                nv0.m((nv0) this.b);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        switch (this.a) {
            case 7:
                if (View.MeasureSpec.getSize(i10) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i10, i11);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), TLObject.FLAG_30), i11);
                    break;
                }
            case 9:
                super.onMeasure(i10, i11);
                dl dlVar = ((gl) this.b).F;
                if (dlVar != null) {
                    dlVar.a();
                    break;
                }
                break;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((vu) this.b).J ? 22 : 0) + 84) + ((int) Math.min(r0.H / (r0.G / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 13:
                ky kyVar = (ky) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) kyVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - kyVar.F.getY()) : AndroidUtilities.dp(120.0f)) - kyVar.F.b1, TLObject.FLAG_30));
                break;
            case 14:
                kz kzVar = ((fz) this.b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (rk.z(8.0f, kzVar.D0.getMeasuredHeight() - kzVar.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 19:
                nv0 nv0Var = (nv0) this.b;
                w0 w0Var = nv0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.l0.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.l0.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i13 = size2 / 5;
                if (D < i13 * 3) {
                    i12 = AndroidUtilities.dp(8.0f);
                } else {
                    i12 = i13 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (w0Var.getPaddingTop() != i12) {
                    nv0Var.h = true;
                    w0Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    nv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 21:
                yy0 yy0Var = (yy0) this.b;
                setPadding(yy0Var.n, yy0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), yy0Var.n, yy0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            case 28:
                rg.x0 x0Var = (rg.x0) this.b;
                z10 = ((org.telegram.ui.ActionBar.f3) x0Var).isPortrait;
                if (z10) {
                    x0Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    x0Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 29:
                super.onMeasure(i10, i11);
                rg.k1 k1Var = ((rg.j1) this.b).c;
                gg0 gg0Var = k1Var.r0;
                if (gg0Var == null) {
                    View view = k1Var.B0;
                    if (view == null) {
                        f7 = 0.0f;
                        k1Var.q0.setTranslationY(f7 - (r8.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = k1Var.B0.getMeasuredHeight();
                    }
                } else {
                    top = gg0Var.getTop();
                    measuredHeight = k1Var.r0.getMeasuredHeight();
                }
                f7 = (measuredHeight / 2.0f) + top;
                k1Var.q0.setTranslationY(f7 - (r8.getMeasuredHeight() / 2.0f));
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                mm0 mm0Var = (mm0) this.b;
                gh.d.c(mm0Var.h, mm0Var.s);
                ViewGroup viewGroup = mm0Var.y;
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
            case 19:
                return !((nv0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 20:
            case 21:
            default:
                return super.onTouchEvent(motionEvent);
            case 22:
                return !((y61) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 23:
                ((mi1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 16:
                vl0 vl0Var = (vl0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(vl0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vl0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, vl0Var.d1.getMeasuredWidth(), vl0Var.d1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 17:
            case 18:
            default:
                super.requestLayout();
                break;
            case 19:
                if (!((nv0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((gy0) this.b).g0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 2:
                ci.oc ocVar = (ci.oc) this.b;
                if (getTranslationY() != f7 && ocVar.c1 != null) {
                    super.setTranslationY(f7);
                    ocVar.c1.y();
                    break;
                }
                break;
            case 22:
                super.setTranslationY(f7);
                y61.m((y61) this.b);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 15:
                super.setVisibility(i10);
                ((z20) this.b).d.setVisibility(i10);
                break;
            case 21:
                yy0 yy0Var = (yy0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (yy0Var.e != null) {
                        for (int i11 = 0; i11 < yy0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                xy0 xy0Var = (xy0) yy0Var.e.getChildAt(i11);
                                Drawable drawable = xy0Var.b;
                                if (drawable instanceof org.telegram.ui.Components.p5) {
                                    ((org.telegram.ui.Components.p5) drawable).a(xy0Var);
                                }
                                xy0Var.c = true;
                            } else {
                                xy0 xy0Var2 = (xy0) yy0Var.e.getChildAt(i11);
                                Drawable drawable2 = xy0Var2.b;
                                if (drawable2 instanceof org.telegram.ui.Components.p5) {
                                    ((org.telegram.ui.Components.p5) drawable2).o(xy0Var2);
                                }
                                xy0Var2.c = false;
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
    public /* synthetic */ f0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(qg.o2 o2Var, Context context) {
        super(context);
        this.a = 25;
        this.b = o2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 11;
        this.b = new qo[2];
        int i10 = 0;
        while (true) {
            qo[] qoVarArr = (qo[]) this.b;
            if (i10 < qoVarArr.length) {
                qoVarArr[i10] = new qo(context, f6Var);
                addView(((qo[]) this.b)[i10], w7.y5.e(-1, -1, 119));
                i10++;
            } else {
                qoVarArr[0].setVisibility(0);
                ((qo[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(qg.y1 y1Var, Context context) {
        super(context);
        this.a = 24;
        this.b = y1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, String str, d dVar) {
        super(context);
        this.a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.06f, dVar.F0(i10))));
        LinearLayout f7 = rk.f(context, 1);
        addView(f7, w7.y5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.b = o6Var;
        o6Var.b(0.6f, 450L, qr.h);
        o6Var.setTextSize(AndroidUtilities.dp(17.0f));
        o6Var.setTextColor(dVar.F0(i10));
        o6Var.setScaleProperty(0.7f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setAllowCancel(true);
        f7.addView(o6Var, w7.y5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(dVar.F0(i10));
        textView.setGravity(17);
        f7.addView(textView, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, f30 f30Var) {
        super(context);
        this.a = 6;
        this.b = f30Var;
    }
}
