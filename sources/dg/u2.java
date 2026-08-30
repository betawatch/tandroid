package dg;

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
import k7.b6;
import lh.g5;
import lh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.th1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u2 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public mo a() {
        return ((mo[]) this.b)[0];
    }

    public void b() {
        mo[] moVarArr = (mo[]) this.b;
        mo moVar = moVarArr[0];
        mo moVar2 = moVarArr[1];
        moVarArr[0] = moVar2;
        moVarArr[1] = moVar;
        moVar2.n = true;
        moVar2.setVisibility(0);
        moVarArr[0].setScaleX(0.8f);
        moVarArr[0].setScaleY(0.8f);
        moVarArr[0].setAlpha(0.0f);
        moVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = moVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        nr nrVar = nr.h;
        org.telegram.ui.b.p(translationY, nrVar, 320L);
        mo moVar3 = moVarArr[1];
        moVar3.n = false;
        moVar3.setVisibility(0);
        moVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(nrVar).setDuration(320L).withEndAction(new fg(moVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        switch (this.a) {
            case 2:
                y3 y3Var = (y3) this.b;
                if (y3Var.y > 0.0f && y3Var.s != null) {
                    y3Var.v.reset();
                    float width = getWidth() / y3Var.n.getWidth();
                    y3Var.v.postScale(width, width);
                    y3Var.r.setLocalMatrix(y3Var.v);
                    y3Var.s.setAlpha((int) (y3Var.y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), y3Var.s);
                }
                super.dispatchDraw(canvas);
                break;
            case 23:
                im0 im0Var = (im0) this.b;
                if (im0Var.r > 0.0f && im0Var.e != null) {
                    im0Var.f.reset();
                    float width2 = getWidth() / im0Var.c.getWidth();
                    im0Var.f.postScale(width2, width2);
                    im0Var.d.setLocalMatrix(im0Var.f);
                    im0Var.e.setAlpha((int) (im0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), im0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = im0Var.B;
                if (drawable != null) {
                    drawable.setAlpha((int) (im0Var.r * 255.0f));
                    canvas.save();
                    float f12 = im0Var.E;
                    float f13 = im0Var.D;
                    float f14 = im0Var.r;
                    canvas.translate((f13 * f14) + f12, (0.0f * f14) + im0Var.F);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(im0Var.G, im0Var.H), Math.max(im0Var.G, im0Var.H), 0.75f), 1.0f, im0Var.r);
                    canvas.scale(lerp, lerp, ((im0Var.B.getBounds().width() / 2.0f) * im0Var.G) + (-im0Var.E) + im0Var.B.getBounds().left, ((im0Var.B.getBounds().height() / 2.0f) * im0Var.H) + (-im0Var.F) + im0Var.B.getBounds().top);
                    pg.b bVar = im0Var.C;
                    if (bVar != null) {
                        bVar.setAlpha((int) (im0Var.r * 255.0f));
                        im0Var.C.draw(canvas);
                    }
                    im0Var.B.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 27:
                qy0 qy0Var = (qy0) this.b;
                oy0 oy0Var = qy0Var.c;
                if (oy0Var != null && oy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = qy0Var.Q;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = qy0Var.c.getEditField().getX() + qy0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = qy0Var.Q;
                        qy0Var.U = x10 + emojiSpan2.lastDrawX;
                        qy0Var.R = emojiSpan2.lastDrawY;
                    } else if (qy0Var.S != null && qy0Var.T != null) {
                        qy0Var.U = qy0Var.c.getEditField().getX() + qy0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z4 = (!qy0Var.s || qy0Var.v || (arrayList = qy0Var.w) == null || arrayList.isEmpty() || qy0Var.x) ? false : true;
                float d = qy0Var.M.d(z4 ? 1.0f : 0.0f, false);
                float d10 = qy0Var.N.d(z4 ? 1.0f : 0.0f, false);
                float d11 = qy0Var.V.d(qy0Var.U, false);
                if (d <= 0.0f && d10 <= 0.0f && !z4) {
                    qy0Var.d.setVisibility(8);
                }
                qy0Var.J.rewind();
                float left = qy0Var.e.getLeft();
                int left2 = qy0Var.e.getLeft();
                ArrayList arrayList2 = qy0Var.w;
                float D = org.telegram.messenger.y3.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                z5 z5Var = qy0Var.a0;
                float f15 = z5Var.c;
                boolean z10 = f15 <= 0.0f;
                float f16 = D - left;
                if (f16 > 0.0f) {
                    f15 = z5Var.d(f16, z10);
                }
                float d12 = qy0Var.W.d((left + D) / 2.0f, z10);
                oy0 oy0Var2 = qy0Var.c;
                if (oy0Var2 != null && oy0Var2.getEditField() != null) {
                    int i10 = qy0Var.h;
                    if (i10 == 0) {
                        qy0Var.d.setTranslationY(((-qy0Var.c.getEditField().getHeight()) - qy0Var.c.getEditField().getScrollY()) + qy0Var.R + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        qy0Var.d.setTranslationY(((-qy0Var.getMeasuredHeight()) - qy0Var.c.getEditField().getScrollY()) + qy0Var.R + AndroidUtilities.dp(20.0f) + qy0Var.d.getHeight());
                    }
                }
                float f17 = f15 / 4.0f;
                float f18 = f15 / 2.0f;
                int max = (int) Math.max((qy0Var.U - Math.max(f17, Math.min(f18, AndroidUtilities.dp(66.0f)))) - qy0Var.e.getLeft(), 0.0f);
                if (qy0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = qy0Var.e.getPaddingLeft() - max;
                    f10 = 1.0f;
                    qy0Var.e.setPadding(max, 0, 0, 0);
                    qy0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f10 = 1.0f;
                }
                qy0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f17, Math.min(f18, AndroidUtilities.dp(66.0f)))) - qy0Var.e.getLeft(), 0.0f)) - max);
                float translationX = qy0Var.e.getTranslationX() + (d12 - f18) + qy0Var.e.getPaddingLeft();
                float translationY = qy0Var.e.getTranslationY() + qy0Var.e.getTop() + qy0Var.e.getPaddingTop() + (qy0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(qy0Var.e.getTranslationX() + d12 + f18 + qy0Var.e.getPaddingLeft(), qy0Var.getWidth() - qy0Var.d.getPaddingRight());
                float translationY2 = (qy0Var.e.getTranslationY() + qy0Var.e.getBottom()) - (qy0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f18) * 2.0f;
                int i11 = qy0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f19 = translationY2 - min2;
                    float f20 = translationX + min2;
                    rectF.set(translationX, f19, f20, translationY2);
                    qy0Var.J.arcTo(rectF, 90.0f, 90.0f);
                    float f21 = translationY + min2;
                    rectF.set(translationX, translationY, f20, f21);
                    qy0Var.J.arcTo(rectF, -180.0f, 90.0f);
                    float f22 = min - min2;
                    rectF.set(f22, translationY, min, f21);
                    qy0Var.J.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f22, f19, min, translationY2);
                    qy0Var.J.arcTo(rectF, 0.0f, 90.0f);
                    qy0Var.J.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    qy0Var.J.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    qy0Var.J.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f23 = min - min2;
                    float f24 = translationY + min2;
                    rectF2.set(f23, translationY, min, f24);
                    qy0Var.J.arcTo(rectF2, -90.0f, 90.0f);
                    float f25 = translationY2 - min2;
                    rectF2.set(f23, f25, min, translationY2);
                    qy0Var.J.arcTo(rectF2, 0.0f, 90.0f);
                    float f26 = min2 + translationX;
                    rectF2.set(translationX, f25, f26, translationY2);
                    qy0Var.J.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f26, f24);
                    qy0Var.J.arcTo(rectF2, -180.0f, 90.0f);
                    qy0Var.J.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    qy0Var.J.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    qy0Var.J.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                qy0Var.J.close();
                if (qy0Var.L == null) {
                    Paint paint = new Paint(1);
                    qy0Var.L = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    qy0Var.L.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    qy0Var.L.setColor(j6.v0(j6.Be, qy0Var.b));
                }
                if (d < f10) {
                    qy0Var.K.rewind();
                    float dp = qy0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f11 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    qy0Var.K.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(qy0Var.K);
                    canvas.saveLayerAlpha(0.0f, 0.0f, qy0Var.getWidth(), qy0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f11 = 255.0f;
                }
                canvas.drawPath(qy0Var.J, qy0Var.L);
                canvas.save();
                canvas.clipPath(qy0Var.J);
                super.dispatchDraw(canvas);
                float f27 = qy0Var.a0.c;
                float f28 = qy0Var.W.c;
                float f29 = f27 / 2.0f;
                float translationX2 = qy0Var.e.getTranslationX() + (f28 - f29) + qy0Var.e.getPaddingLeft();
                float paddingTop = qy0Var.e.getPaddingTop() + qy0Var.e.getTop();
                float min3 = Math.min(qy0Var.e.getTranslationX() + f28 + f29 + qy0Var.e.getPaddingLeft(), qy0Var.getWidth() - qy0Var.d.getPaddingRight());
                float bottom = qy0Var.e.getBottom();
                float d17 = qy0Var.O.d(qy0Var.e.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    j6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    j6.F4.setAlpha((int) (d17 * f11));
                    j6.F4.draw(canvas);
                }
                float d18 = qy0Var.P.d(qy0Var.e.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    j6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    j6.E4.setAlpha((int) (d18 * f11));
                    j6.E4.draw(canvas);
                }
                canvas.restore();
                if (qy0Var.M.c < f10) {
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
            case 24:
                ve veVar = (ve) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && veVar.isShowing()) {
                    veVar.dismiss();
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
                ((y3) this.b).onBackPressed();
                return true;
            case 23:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((im0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 8:
                if (((ja) this.b).c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                int action = motionEvent.getAction();
                nh.j1 j1Var = nh.j1.W;
                if (j1Var.D != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(j1Var.D.getX(), j1Var.D.getY());
                    boolean dispatchTouchEvent = j1Var.D.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        j1Var.D = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = j1Var.x.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z4 = !j1Var.x.isInProgress() && ((GestureDetector) j1Var.y.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    j1Var.B = false;
                    j1Var.C = false;
                    o1.j jVar = j1Var.M;
                    if (!jVar.f) {
                        float f10 = j1Var.K;
                        jVar.b = f10;
                        jVar.c = true;
                        jVar.u.i = (j1Var.G / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        j1Var.M.f();
                    }
                    o1.j jVar2 = j1Var.N;
                    if (!jVar2.f) {
                        jVar2.b = j1Var.L;
                        jVar2.c = true;
                        jVar2.u.i = k7.n.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f));
                        j1Var.N.f();
                    }
                }
                return onTouchEvent || z4;
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((al) this.b).y0) {
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
            case 15:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                al alVar = (al) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - alVar.y0);
                boolean drawChild = alVar.D ? false : super.drawChild(canvas, view, j10);
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
                nh.j1 j1Var = nh.j1.W;
                AndroidUtilities.setPreferredMaxRefreshRate(j1Var.b, j1Var.d, j1Var.c);
                j1Var.i();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 18:
                pu puVar = (pu) this.b;
                e91 e91Var = puVar.c;
                ju juVar = puVar.b;
                super.onDetachedFromWindow();
                try {
                    lg0 lg0Var = lg0.m0;
                    if (lg0Var.M) {
                        if (juVar.getVisibility() != 0) {
                        }
                        if (e91Var.f() && !lg0Var.M) {
                            if (pu.P == puVar) {
                                pu.P = null;
                            }
                            e91Var.b();
                            break;
                        }
                    }
                    if (juVar.getParent() != null) {
                        removeView(juVar);
                        juVar.stopLoading();
                        juVar.loadUrl("about:blank");
                        juVar.destroy();
                    }
                    if (e91Var.f()) {
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
            case 0:
                v2 v2Var = (v2) this.b;
                Rect rect = v2Var.B0;
                Rect rect2 = v2Var.A0;
                Paint paint = v2Var.C0;
                jv0 jv0Var = v2Var.s0;
                Bitmap bitmap = v2Var.x0;
                if (v2Var.w0 != null) {
                    canvas.save();
                    float e = v2Var.r0.e(v2Var.q0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, jv0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e, 4.0f * e, 0.25f));
                    float e6 = v2Var.v0.e(v2Var.u0);
                    if (!v2Var.u0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e6) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(v2Var.t0);
                            float max = Math.max(jv0Var.a / bitmap.getWidth(), jv0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (v2Var.D0 != null) {
                                canvas.rotate(-v2Var.getOrientation());
                                int contentWidth = v2Var.getContentWidth();
                                int contentHeight = v2Var.getContentHeight();
                                if (((v2Var.getOrientation() + v2Var.D0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = v2Var.getContentHeight();
                                    contentHeight = v2Var.getContentWidth();
                                }
                                MediaController.CropState cropState = v2Var.D0;
                                float f10 = cropState.cropPw;
                                float f11 = cropState.cropPh;
                                float f12 = contentWidth;
                                float f13 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f10) / 2.0f, ((-contentHeight) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                                float f14 = v2Var.D0.cropScale;
                                canvas.scale(f14, f14);
                                MediaController.CropState cropState2 = v2Var.D0;
                                canvas.translate(cropState2.cropPx * f12, cropState2.cropPy * f13);
                                canvas.rotate(v2Var.D0.cropRotate + r4.transformRotation);
                                if (v2Var.D0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(v2Var.getOrientation());
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
                r3 r3Var = (r3) this.b;
                ImageReceiver imageReceiver = r3Var.u0;
                jv0 jv0Var2 = r3Var.s0;
                if (r3Var.t0 != null) {
                    canvas.save();
                    float e10 = r3Var.r0.e(r3Var.q0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, jv0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) jv0Var2.a, (int) jv0Var2.b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 13:
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
            case 14:
                ((v9) this.b).e.a(canvas);
                break;
            case 15:
                al alVar = (al) this.b;
                alVar.a0.setColor(j6.v0(j6.h5, alVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - alVar.y0, alVar.a0);
                break;
            case 25:
                cv0 cv0Var = (cv0) this.b;
                Drawable drawable = cv0Var.d;
                int i12 = cv0Var.f;
                i10 = ((org.telegram.ui.ActionBar.g3) cv0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 28:
                m61 m61Var = (m61) this.b;
                int i13 = m61Var.h;
                i11 = ((org.telegram.ui.ActionBar.g3) m61Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = m61Var.b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        eg.a1 a1Var;
        eg.a1 a1Var2;
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                eg.c1 c1Var = (eg.c1) this.b;
                CharSequence text = (!c1Var.h || (a1Var2 = c1Var.e) == null) ? null : a1Var2.getText();
                if (text == null && (a1Var = c1Var.d) != null) {
                    text = a1Var.getText();
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
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((al) this.b).y0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                cv0 cv0Var = (cv0) this.b;
                if (motionEvent.getAction() != 0 || cv0Var.f == 0 || motionEvent.getY() >= cv0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                cv0Var.dismiss();
                return true;
            case 28:
                m61 m61Var = (m61) this.b;
                if (motionEvent.getAction() != 0 || m61Var.h == 0 || motionEvent.getY() >= m61Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                m61Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int measuredHeight;
        int dp;
        int measuredHeight2;
        int i14;
        int i15;
        float f10;
        boolean z10;
        switch (this.a) {
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                mg.s sVar = (mg.s) this.b;
                if (sVar.H && z4) {
                    sVar.w.setTranslationY(-sVar.c.getMeasuredHeight());
                    int measuredHeight3 = sVar.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.y.setLayoutParams(marginLayoutParams);
                    break;
                }
                break;
            case 12:
                super.onLayout(z4, i10, i11, i12, i13);
                g30 g30Var = (g30) this.b;
                g30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (g30Var.getMeasuredWidth() / 2.0f));
                g30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (g30Var.getMeasuredWidth() / 2.0f));
                break;
            case 14:
                super.onLayout(z4, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((v9) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
                break;
            case 16:
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.n0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.n0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.n0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.n0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.n0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.n0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.n0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.h0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.h0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.h0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.h0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.o0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.o0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.o0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.o0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i20 = 0; i20 < 2; i20++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.P[i20];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.P[i20].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.P[i20].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.P[i20].getMeasuredHeight() / 2) + i15);
                }
                break;
            case 21:
                super.onLayout(z4, i10, i11, i12, i13);
                a30 a30Var = (a30) this.b;
                u2 u2Var = a30Var.b;
                int[] iArr = a30Var.D;
                u2Var.getLocationOnScreen(iArr);
                a30Var.K = iArr[0];
                a30Var.J = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                im0 im0Var = (im0) this.b;
                u2 u2Var2 = im0Var.s;
                qv0 qv0Var = im0Var.v;
                Drawable drawable = im0Var.B;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (im0Var.x != null) {
                        float f11 = bounds.left;
                        float f12 = im0Var.E;
                        float f13 = f11 + f12;
                        float f14 = bounds.right + f12;
                        float f15 = bounds.top;
                        float f16 = im0Var.F;
                        float f17 = f15 + f16;
                        float f18 = bounds.bottom + f16;
                        boolean z11 = false;
                        if (im0Var.I) {
                            f10 = 4.0f;
                            z10 = false;
                        } else {
                            if (f14 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                im0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                im0Var.x.setX(Math.min(qv0Var.getWidth() - im0Var.x.getWidth(), f13 - AndroidUtilities.dp(10.0f)) - qv0Var.getX());
                                f10 = 4.0f;
                                z10 = false;
                            } else {
                                im0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f10 = 4.0f;
                                im0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f14) - im0Var.x.getMeasuredWidth()) - qv0Var.getX());
                                z10 = true;
                            }
                            im0Var.D = z10 ? ((im0Var.x.getX() + im0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f14 : (im0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f13;
                        }
                        float dp4 = f18 + (im0Var.C != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (im0Var.x.getMeasuredHeight() + dp4 > u2Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            im0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            im0Var.x.setY(((f17 - AndroidUtilities.dp(f10)) - im0Var.x.getMeasuredHeight()) - qv0Var.getY());
                            z11 = true;
                        } else {
                            im0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            im0Var.x.setY(Math.min((u2Var2.getHeight() - im0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - qv0Var.getY());
                        }
                        o70 o70Var = im0Var.w;
                        o70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z10;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z11;
                        break;
                    }
                }
                break;
            case 25:
                super.onLayout(z4, i10, i11, i12, i13);
                cv0.m((cv0) this.b);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z4;
        float f10;
        float top;
        int measuredHeight;
        int i12;
        switch (this.a) {
            case 4:
                eg.o1 o1Var = (eg.o1) this.b;
                z4 = ((org.telegram.ui.ActionBar.g3) o1Var).isPortrait;
                if (z4) {
                    o1Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    o1Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 5:
                super.onMeasure(i10, i11);
                eg.e2 e2Var = ((eg.d2) this.b).c;
                eg.i iVar = e2Var.o0;
                if (iVar == null) {
                    View view = e2Var.y0;
                    if (view == null) {
                        f10 = 0.0f;
                        e2Var.n0.setTranslationY(f10 - (r8.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = e2Var.y0.getMeasuredHeight();
                    }
                } else {
                    top = iVar.getTop();
                    measuredHeight = e2Var.o0.getMeasuredHeight();
                }
                f10 = (measuredHeight / 2.0f) + top;
                e2Var.n0.setTranslationY(f10 - (r8.getMeasuredHeight() / 2.0f));
            case 6:
                super.onMeasure(i10, i11);
                ((kh.x1) this.b).H.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 13:
                if (View.MeasureSpec.getSize(i10) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i10, i11);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), TLObject.FLAG_30), i11);
                    break;
                }
            case 15:
                super.onMeasure(i10, i11);
                xk xkVar = ((al) this.b).C;
                if (xkVar != null) {
                    xkVar.a();
                    break;
                }
                break;
            case 18:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((pu) this.b).G ? 22 : 0) + 84) + ((int) Math.min(r0.E / (r0.D / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 19:
                jy jyVar = (jy) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) jyVar.C.getParent()) != null ? (int) (r0.getMeasuredHeight() - jyVar.C.getY()) : AndroidUtilities.dp(120.0f)) - jyVar.C.Y0, TLObject.FLAG_30));
                break;
            case 20:
                kz kzVar = ((fz) this.b).N;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.b.x(8.0f, kzVar.A0.getMeasuredHeight() - kzVar.Y0, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 25:
                cv0 cv0Var = (cv0) this.b;
                lh.e1 e1Var = cv0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.y3.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.y3.C(56.0f, AndroidUtilities.dp(56.0f), 1));
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
                    cv0Var.h = true;
                    e1Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    cv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 27:
                qy0 qy0Var = (qy0) this.b;
                setPadding(qy0Var.n, qy0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), qy0Var.n, qy0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
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
            case 23:
                super.onSizeChanged(i10, i11, i12, i13);
                im0 im0Var = (im0) this.b;
                tg.c.c(im0Var.h, im0Var.s);
                ViewGroup viewGroup = im0Var.y;
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
            case 25:
                return !((cv0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 26:
            case 27:
            default:
                return super.onTouchEvent(motionEvent);
            case 28:
                return !((m61) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 29:
                ((th1) this.b).Q.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 22:
                sl0 sl0Var = (sl0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(sl0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sl0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, sl0Var.a1.getMeasuredWidth(), sl0Var.a1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 23:
            case 24:
            default:
                super.requestLayout();
                break;
            case 25:
                if (!((cv0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 26:
                if (!((xx0) this.b).d0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 7:
                super.setTranslationY(f10);
                g5 g5Var = (g5) this.b;
                lh.q3 q3Var = g5Var.a0;
                if (q3Var != null && q3Var.getVisibility() == 0) {
                    g5Var.a0.invalidate();
                    break;
                }
                break;
            case 28:
                super.setTranslationY(f10);
                m61.m((m61) this.b);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 21:
                super.setVisibility(i10);
                ((a30) this.b).d.setVisibility(i10);
                break;
            case 27:
                qy0 qy0Var = (qy0) this.b;
                boolean z4 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z4) {
                    boolean z10 = i10 == 0;
                    if (qy0Var.e != null) {
                        for (int i11 = 0; i11 < qy0Var.e.getChildCount(); i11++) {
                            if (z10) {
                                py0 py0Var = (py0) qy0Var.e.getChildAt(i11);
                                Drawable drawable = py0Var.b;
                                if (drawable instanceof l5) {
                                    ((l5) drawable).a(py0Var);
                                }
                                py0Var.c = true;
                            } else {
                                py0 py0Var2 = (py0) qy0Var.e.getChildAt(i11);
                                Drawable drawable2 = py0Var2.b;
                                if (drawable2 instanceof l5) {
                                    ((l5) drawable2).o(py0Var2);
                                }
                                py0Var2.c = false;
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
    public /* synthetic */ u2(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(r3 r3Var, Context context) {
        super(context);
        this.a = 1;
        this.b = r3Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Context context, f6 f6Var) {
        super(context);
        this.a = 17;
        this.b = new mo[2];
        int i10 = 0;
        while (true) {
            mo[] moVarArr = (mo[]) this.b;
            if (i10 < moVarArr.length) {
                moVarArr[i10] = new mo(context, f6Var);
                addView(((mo[]) this.b)[i10], b6.e(-1, -1, 119));
                i10++;
            } else {
                moVarArr[0].setVisibility(0);
                ((mo[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(v2 v2Var, Context context) {
        super(context);
        this.a = 0;
        this.b = v2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Context context, String str, nh.b bVar) {
        super(context);
        this.a = 10;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = j6.j5;
        setBackground(j6.b0(dp, j6.l1(0.06f, bVar.x0(i10))));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, b6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        k6 k6Var = new k6(context, false, true, true);
        this.b = k6Var;
        k6Var.b(0.6f, 450L, nr.h);
        k6Var.setTextSize(AndroidUtilities.dp(17.0f));
        k6Var.setTextColor(bVar.x0(i10));
        k6Var.setScaleProperty(0.7f);
        k6Var.setGravity(17);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setAllowCancel(true);
        f10.addView(k6Var, b6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.x0(i10));
        textView.setGravity(17);
        f10.addView(textView, b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Context context, g30 g30Var) {
        super(context);
        this.a = 12;
        this.b = g30Var;
    }
}
