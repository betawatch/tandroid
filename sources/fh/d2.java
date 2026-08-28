package fh;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.oa;
import java.util.ArrayList;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.fh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d2 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    public go a() {
        return ((go[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, int i10) {
        switch (this.a) {
            case 27:
                super.addView(view, i9, i10);
                ((pg.f) this.b).e();
                break;
            default:
                super.addView(view, i9, i10);
                break;
        }
    }

    public void b() {
        go[] goVarArr = (go[]) this.b;
        go goVar = goVarArr[0];
        go goVar2 = goVarArr[1];
        goVarArr[0] = goVar2;
        goVarArr[1] = goVar;
        goVar2.n = true;
        goVar2.setVisibility(0);
        goVarArr[0].setScaleX(0.8f);
        goVarArr[0].setScaleY(0.8f);
        goVarArr[0].setAlpha(0.0f);
        goVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = goVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        gr grVar = gr.h;
        ll.r(translationY, grVar, 320L);
        go goVar3 = goVarArr[1];
        goVar3.n = false;
        goVar3.setVisibility(0);
        goVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(grVar).setDuration(320L).withEndAction(new fg(goVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        switch (this.a) {
            case 20:
                ll0 ll0Var = (ll0) this.b;
                if (ll0Var.r > 0.0f && ll0Var.e != null) {
                    ll0Var.f.reset();
                    float width = getWidth() / ll0Var.c.getWidth();
                    ll0Var.f.postScale(width, width);
                    ll0Var.d.setLocalMatrix(ll0Var.f);
                    ll0Var.e.setAlpha((int) (ll0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ll0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = ll0Var.A;
                if (drawable != null) {
                    drawable.setAlpha((int) (ll0Var.r * 255.0f));
                    canvas.save();
                    float f12 = ll0Var.D;
                    float f13 = ll0Var.C;
                    float f14 = ll0Var.r;
                    canvas.translate((f13 * f14) + f12, (0.0f * f14) + ll0Var.E);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(ll0Var.F, ll0Var.G), Math.max(ll0Var.F, ll0Var.G), 0.75f), 1.0f, ll0Var.r);
                    canvas.scale(lerp, lerp, ((ll0Var.A.getBounds().width() / 2.0f) * ll0Var.F) + (-ll0Var.D) + ll0Var.A.getBounds().left, ((ll0Var.A.getBounds().height() / 2.0f) * ll0Var.G) + (-ll0Var.E) + ll0Var.A.getBounds().top);
                    kg.d dVar = ll0Var.B;
                    if (dVar != null) {
                        dVar.setAlpha((int) (ll0Var.r * 255.0f));
                        ll0Var.B.draw(canvas);
                    }
                    ll0Var.A.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 24:
                ux0 ux0Var = (ux0) this.b;
                sx0 sx0Var = ux0Var.c;
                if (sx0Var != null && sx0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = ux0Var.P;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = ux0Var.c.getEditField().getX() + ux0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = ux0Var.P;
                        ux0Var.T = x10 + emojiSpan2.lastDrawX;
                        ux0Var.Q = emojiSpan2.lastDrawY;
                    } else if (ux0Var.R != null && ux0Var.S != null) {
                        ux0Var.T = ux0Var.c.getEditField().getX() + ux0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!ux0Var.s || ux0Var.v || (arrayList = ux0Var.w) == null || arrayList.isEmpty() || ux0Var.x) ? false : true;
                float d = ux0Var.L.d(z10 ? 1.0f : 0.0f, false);
                float d9 = ux0Var.M.d(z10 ? 1.0f : 0.0f, false);
                float d10 = ux0Var.U.d(ux0Var.T, false);
                if (d <= 0.0f && d9 <= 0.0f && !z10) {
                    ux0Var.d.setVisibility(8);
                }
                ux0Var.I.rewind();
                float left = ux0Var.e.getLeft();
                int left2 = ux0Var.e.getLeft();
                ArrayList arrayList2 = ux0Var.w;
                float D = org.telegram.messenger.l0.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                org.telegram.ui.Components.y5 y5Var = ux0Var.W;
                float f15 = y5Var.c;
                boolean z11 = f15 <= 0.0f;
                float f16 = D - left;
                if (f16 > 0.0f) {
                    f15 = y5Var.d(f16, z11);
                }
                float d11 = ux0Var.V.d((left + D) / 2.0f, z11);
                sx0 sx0Var2 = ux0Var.c;
                if (sx0Var2 != null && sx0Var2.getEditField() != null) {
                    int i9 = ux0Var.h;
                    if (i9 == 0) {
                        ux0Var.d.setTranslationY(((-ux0Var.c.getEditField().getHeight()) - ux0Var.c.getEditField().getScrollY()) + ux0Var.Q + AndroidUtilities.dp(5.0f));
                    } else if (i9 == 1) {
                        ux0Var.d.setTranslationY(((-ux0Var.getMeasuredHeight()) - ux0Var.c.getEditField().getScrollY()) + ux0Var.Q + AndroidUtilities.dp(20.0f) + ux0Var.d.getHeight());
                    }
                }
                float f17 = f15 / 4.0f;
                float f18 = f15 / 2.0f;
                int max = (int) Math.max((ux0Var.T - Math.max(f17, Math.min(f18, AndroidUtilities.dp(66.0f)))) - ux0Var.e.getLeft(), 0.0f);
                if (ux0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = ux0Var.e.getPaddingLeft() - max;
                    f10 = 1.0f;
                    ux0Var.e.setPadding(max, 0, 0, 0);
                    ux0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f10 = 1.0f;
                }
                ux0Var.e.setTranslationX(((int) Math.max((d10 - Math.max(f17, Math.min(f18, AndroidUtilities.dp(66.0f)))) - ux0Var.e.getLeft(), 0.0f)) - max);
                float translationX = ux0Var.e.getTranslationX() + (d11 - f18) + ux0Var.e.getPaddingLeft();
                float translationY = ux0Var.e.getTranslationY() + ux0Var.e.getTop() + ux0Var.e.getPaddingTop() + (ux0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(ux0Var.e.getTranslationX() + d11 + f18 + ux0Var.e.getPaddingLeft(), ux0Var.getWidth() - ux0Var.d.getPaddingRight());
                float translationY2 = (ux0Var.e.getTranslationY() + ux0Var.e.getBottom()) - (ux0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f18) * 2.0f;
                int i10 = ux0Var.h;
                if (i10 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f19 = translationY2 - min2;
                    float f20 = translationX + min2;
                    rectF.set(translationX, f19, f20, translationY2);
                    ux0Var.I.arcTo(rectF, 90.0f, 90.0f);
                    float f21 = translationY + min2;
                    rectF.set(translationX, translationY, f20, f21);
                    ux0Var.I.arcTo(rectF, -180.0f, 90.0f);
                    float f22 = min - min2;
                    rectF.set(f22, translationY, min, f21);
                    ux0Var.I.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f22, f19, min, translationY2);
                    ux0Var.I.arcTo(rectF, 0.0f, 90.0f);
                    ux0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d10, translationY2);
                    ux0Var.I.lineTo(d10, AndroidUtilities.dp(6.66f) + translationY2);
                    ux0Var.I.lineTo(d10 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i10 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f23 = min - min2;
                    float f24 = translationY + min2;
                    rectF2.set(f23, translationY, min, f24);
                    ux0Var.I.arcTo(rectF2, -90.0f, 90.0f);
                    float f25 = translationY2 - min2;
                    rectF2.set(f23, f25, min, translationY2);
                    ux0Var.I.arcTo(rectF2, 0.0f, 90.0f);
                    float f26 = min2 + translationX;
                    rectF2.set(translationX, f25, f26, translationY2);
                    ux0Var.I.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f26, f24);
                    ux0Var.I.arcTo(rectF2, -180.0f, 90.0f);
                    ux0Var.I.lineTo(d10 - AndroidUtilities.dp(8.66f), translationY);
                    ux0Var.I.lineTo(d10, translationY - AndroidUtilities.dp(6.66f));
                    ux0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d10, translationY);
                }
                ux0Var.I.close();
                if (ux0Var.K == null) {
                    Paint paint = new Paint(1);
                    ux0Var.K = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    ux0Var.K.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    ux0Var.K.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Be, ux0Var.b));
                }
                if (d < f10) {
                    ux0Var.J.rewind();
                    float dp = ux0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d12 = d10 - translationX;
                    double d13 = dp - translationY;
                    f11 = 255.0f;
                    double d14 = d10 - min;
                    double d15 = dp - translationY2;
                    ux0Var.J.addCircle(d10, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d14, 2.0d)), Math.max(Math.pow(d15, 2.0d) + Math.pow(d12, 2.0d), Math.pow(d15, 2.0d) + Math.pow(d14, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(ux0Var.J);
                    canvas.saveLayerAlpha(0.0f, 0.0f, ux0Var.getWidth(), ux0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f11 = 255.0f;
                }
                canvas.drawPath(ux0Var.I, ux0Var.K);
                canvas.save();
                canvas.clipPath(ux0Var.I);
                super.dispatchDraw(canvas);
                float f27 = ux0Var.W.c;
                float f28 = ux0Var.V.c;
                float f29 = f27 / 2.0f;
                float translationX2 = ux0Var.e.getTranslationX() + (f28 - f29) + ux0Var.e.getPaddingLeft();
                float paddingTop = ux0Var.e.getPaddingTop() + ux0Var.e.getTop();
                float min3 = Math.min(ux0Var.e.getTranslationX() + f28 + f29 + ux0Var.e.getPaddingLeft(), ux0Var.getWidth() - ux0Var.d.getPaddingRight());
                float bottom = ux0Var.e.getBottom();
                float d16 = ux0Var.N.d(ux0Var.e.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
                if (d16 > 0.0f) {
                    int i11 = (int) translationX2;
                    org.telegram.ui.ActionBar.f6.F4.setBounds(i11, (int) paddingTop, AndroidUtilities.dp(32.0f) + i11, (int) bottom);
                    org.telegram.ui.ActionBar.f6.F4.setAlpha((int) (d16 * f11));
                    org.telegram.ui.ActionBar.f6.F4.draw(canvas);
                }
                float d17 = ux0Var.O.d(ux0Var.e.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) min3;
                    org.telegram.ui.ActionBar.f6.E4.setBounds(i12 - AndroidUtilities.dp(32.0f), (int) paddingTop, i12, (int) bottom);
                    org.telegram.ui.ActionBar.f6.E4.setAlpha((int) (d17 * f11));
                    org.telegram.ui.ActionBar.f6.E4.draw(canvas);
                }
                canvas.restore();
                if (ux0Var.L.c < f10) {
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
            case 21:
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
            case 20:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((ll0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (((oa) this.b).b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                int action = motionEvent.getAction();
                ih.k1 k1Var = ih.k1.V;
                if (k1Var.C != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(k1Var.C.getX(), k1Var.C.getY());
                    boolean dispatchTouchEvent = k1Var.C.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        k1Var.C = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = k1Var.x.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !k1Var.x.isInProgress() && ((GestureDetector) k1Var.y.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    k1Var.A = false;
                    k1Var.B = false;
                    o1.j jVar = k1Var.L;
                    if (!jVar.f) {
                        float f10 = k1Var.J;
                        jVar.b = f10;
                        jVar.c = true;
                        jVar.u.i = (k1Var.F / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        k1Var.L.f();
                    }
                    o1.j jVar2 = k1Var.M;
                    if (!jVar2.f) {
                        jVar2.b = k1Var.K;
                        jVar2.c = true;
                        jVar2.u.i = g7.n.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.G) - AndroidUtilities.dp(16.0f));
                        k1Var.M.f();
                    }
                }
                return onTouchEvent || z10;
            case 7:
                if (((lh.g) this.b).a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((xk) this.b).x0) {
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
            case 12:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                xk xkVar = (xk) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - xkVar.x0);
                boolean drawChild = xkVar.C ? false : super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 5:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                ih.k1 k1Var = ih.k1.V;
                AndroidUtilities.setPreferredMaxRefreshRate(k1Var.b, k1Var.d, k1Var.c);
                k1Var.i();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 15:
                gu guVar = (gu) this.b;
                g81 g81Var = guVar.c;
                au auVar = guVar.b;
                super.onDetachedFromWindow();
                try {
                    pf0 pf0Var = pf0.l0;
                    if (pf0Var.L) {
                        if (auVar.getVisibility() != 0) {
                        }
                        if (g81Var.f() && !pf0Var.L) {
                            if (gu.O == guVar) {
                                gu.O = null;
                            }
                            g81Var.b();
                            break;
                        }
                    }
                    if (auVar.getParent() != null) {
                        removeView(auVar);
                        auVar.stopLoading();
                        auVar.loadUrl("about:blank");
                        auVar.destroy();
                    }
                    if (g81Var.f()) {
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
        int i9;
        int i10;
        switch (this.a) {
            case 10:
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
            case 11:
                ((v9) this.b).e.a(canvas);
                break;
            case 12:
                xk xkVar = (xk) this.b;
                xkVar.W.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, xkVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - xkVar.x0, xkVar.W);
                break;
            case 22:
                iu0 iu0Var = (iu0) this.b;
                Drawable drawable = iu0Var.d;
                int i11 = iu0Var.f;
                i9 = ((org.telegram.ui.ActionBar.f3) iu0Var).backgroundPaddingTop;
                drawable.setBounds(0, i11 - i9, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 25:
                o51 o51Var = (o51) this.b;
                int i12 = o51Var.h;
                i10 = ((org.telegram.ui.ActionBar.f3) o51Var).backgroundPaddingTop;
                int translationY = (int) ((i12 - i10) - getTranslationY());
                Drawable drawable2 = o51Var.b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                break;
            case 28:
                yf.x1 x1Var = (yf.x1) this.b;
                Rect rect = x1Var.A0;
                Rect rect2 = x1Var.z0;
                Paint paint = x1Var.B0;
                qu0 qu0Var = x1Var.r0;
                Bitmap bitmap = x1Var.w0;
                if (x1Var.v0 != null) {
                    canvas.save();
                    float e10 = x1Var.q0.e(x1Var.p0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, qu0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.l0.y(1.0f, e10, 4.0f * e10, 0.25f));
                    float e11 = x1Var.u0.e(x1Var.t0);
                    if (!x1Var.t0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e11) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(x1Var.s0);
                            float max = Math.max(qu0Var.a / bitmap.getWidth(), qu0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (x1Var.C0 != null) {
                                canvas.rotate(-x1Var.getOrientation());
                                int contentWidth = x1Var.getContentWidth();
                                int contentHeight = x1Var.getContentHeight();
                                if (((x1Var.getOrientation() + x1Var.C0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = x1Var.getContentHeight();
                                    contentHeight = x1Var.getContentWidth();
                                }
                                MediaController.CropState cropState = x1Var.C0;
                                float f10 = cropState.cropPw;
                                float f11 = cropState.cropPh;
                                float f12 = contentWidth;
                                float f13 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f10) / 2.0f, ((-contentHeight) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                                float f14 = x1Var.C0.cropScale;
                                canvas.scale(f14, f14);
                                MediaController.CropState cropState2 = x1Var.C0;
                                canvas.translate(cropState2.cropPx * f12, cropState2.cropPy * f13);
                                canvas.rotate(x1Var.C0.cropRotate + r4.transformRotation);
                                if (x1Var.C0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(x1Var.getOrientation());
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
            case 29:
                yf.n2 n2Var = (yf.n2) this.b;
                ImageReceiver imageReceiver = n2Var.t0;
                qu0 qu0Var2 = n2Var.r0;
                if (n2Var.s0 != null) {
                    canvas.save();
                    float e12 = n2Var.q0.e(n2Var.p0);
                    canvas.scale(1.0f - (e12 * 2.0f), 1.0f, qu0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.l0.y(1.0f, e12, 4.0f * e12, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) qu0Var2.a, (int) qu0Var2.b);
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

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((xk) this.b).x0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                iu0 iu0Var = (iu0) this.b;
                if (motionEvent.getAction() != 0 || iu0Var.f == 0 || motionEvent.getY() >= iu0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                iu0Var.dismiss();
                return true;
            case 25:
                o51 o51Var = (o51) this.b;
                if (motionEvent.getAction() != 0 || o51Var.h == 0 || motionEvent.getY() >= o51Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                o51Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredWidth;
        int measuredHeight;
        int dp;
        int measuredHeight2;
        int i13;
        int i14;
        float f10;
        boolean z11;
        switch (this.a) {
            case 3:
                super.onLayout(z10, i9, i10, i11, i12);
                hg.s sVar = (hg.s) this.b;
                if (sVar.G && z10) {
                    sVar.w.setTranslationY(-sVar.c.getMeasuredHeight());
                    int measuredHeight3 = sVar.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.y.setLayoutParams(marginLayoutParams);
                    break;
                }
                break;
            case 9:
                super.onLayout(z10, i9, i10, i11, i12);
                p20 p20Var = (p20) this.b;
                p20Var.setTranslationY((getMeasuredHeight() * 0.28f) - (p20Var.getMeasuredWidth() / 2.0f));
                p20Var.setTranslationX((getMeasuredWidth() * 0.82f) - (p20Var.getMeasuredWidth() / 2.0f));
                break;
            case 11:
                super.onLayout(z10, i9, i10, i11, i12);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i15 = ((i11 - i9) - dp2) / 2;
                int i16 = ((i12 - i10) - dp2) / 2;
                ((v9) this.b).e.f(i15, i16, i15 + dp2, dp2 + i16);
                break;
            case 13:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i13 = getMeasuredWidth() / 2;
                    int i17 = measuredHeight / 2;
                    measuredHeight2 = AndroidUtilities.dp(17.0f) + measuredHeight + i17;
                    i14 = i17 - AndroidUtilities.dp(17.0f);
                    dp = i13;
                } else {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    int i18 = measuredWidth / 2;
                    int dp3 = measuredWidth + i18 + AndroidUtilities.dp(17.0f);
                    dp = i18 - AndroidUtilities.dp(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    i13 = dp3;
                    i14 = measuredHeight2;
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
                imageView.layout(i13 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.n0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.n0.getMeasuredWidth() / 2) + i13, (chatAttachAlertPhotoLayout.n0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i19 = 0; i19 < 2; i19++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.O[i19];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i14 - (chatAttachAlertPhotoLayout.O[i19].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.O[i19].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.O[i19].getMeasuredHeight() / 2) + i14);
                }
                break;
            case 18:
                super.onLayout(z10, i9, i10, i11, i12);
                j20 j20Var = (j20) this.b;
                d2 d2Var = j20Var.b;
                int[] iArr = j20Var.C;
                d2Var.getLocationOnScreen(iArr);
                j20Var.J = iArr[0];
                j20Var.I = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 20:
                super.onLayout(z10, i9, i10, i11, i12);
                ll0 ll0Var = (ll0) this.b;
                d2 d2Var2 = ll0Var.s;
                xu0 xu0Var = ll0Var.v;
                Drawable drawable = ll0Var.A;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (ll0Var.x != null) {
                        float f11 = bounds.left;
                        float f12 = ll0Var.D;
                        float f13 = f11 + f12;
                        float f14 = bounds.right + f12;
                        float f15 = bounds.top;
                        float f16 = ll0Var.E;
                        float f17 = f15 + f16;
                        float f18 = bounds.bottom + f16;
                        boolean z12 = false;
                        if (ll0Var.H) {
                            f10 = 4.0f;
                            z11 = false;
                        } else {
                            if (f14 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                ll0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                ll0Var.x.setX(Math.min(xu0Var.getWidth() - ll0Var.x.getWidth(), f13 - AndroidUtilities.dp(10.0f)) - xu0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                ll0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f10 = 4.0f;
                                ll0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f14) - ll0Var.x.getMeasuredWidth()) - xu0Var.getX());
                                z11 = true;
                            }
                            ll0Var.C = z11 ? ((ll0Var.x.getX() + ll0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f14 : (ll0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f13;
                        }
                        float dp4 = f18 + (ll0Var.B != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (ll0Var.x.getMeasuredHeight() + dp4 > d2Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ll0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            ll0Var.x.setY(((f17 - AndroidUtilities.dp(f10)) - ll0Var.x.getMeasuredHeight()) - xu0Var.getY());
                            z12 = true;
                        } else {
                            ll0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            ll0Var.x.setY(Math.min((d2Var2.getHeight() - ll0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - xu0Var.getY());
                        }
                        x60 x60Var = ll0Var.w;
                        x60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 22:
                super.onLayout(z10, i9, i10, i11, i12);
                iu0.m((iu0) this.b);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        int i11;
        switch (this.a) {
            case 0:
                super.onMeasure(i9, i10);
                ((f2) this.b).G.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 10:
                if (View.MeasureSpec.getSize(i9) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i9, i10);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), TLObject.FLAG_30), i10);
                    break;
                }
            case 12:
                super.onMeasure(i9, i10);
                uk ukVar = ((xk) this.b).B;
                if (ukVar != null) {
                    ukVar.a();
                    break;
                }
                break;
            case 15:
                int size = View.MeasureSpec.getSize(i9);
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((gu) this.b).F ? 22 : 0) + 84) + ((int) Math.min(r0.D / (r0.C / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 16:
                vx vxVar = (vx) this.b;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((((View) vxVar.B.getParent()) != null ? (int) (r0.getMeasuredHeight() - vxVar.B.getY()) : AndroidUtilities.dp(120.0f)) - vxVar.B.X0, TLObject.FLAG_30));
                break;
            case 17:
                wy wyVar = ((ry) this.b).M;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (ll.y(8.0f, wyVar.z0.getMeasuredHeight() - wyVar.X0, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 22:
                iu0 iu0Var = (iu0) this.b;
                gh.f1 f1Var = iu0Var.b;
                int size2 = View.MeasureSpec.getSize(i10) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.l0.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.l0.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i12 = size2 / 5;
                if (D < i12 * 3) {
                    i11 = AndroidUtilities.dp(8.0f);
                } else {
                    i11 = i12 * 2;
                    if (D < size2) {
                        i11 -= size2 - D;
                    }
                }
                if (f1Var.getPaddingTop() != i11) {
                    iu0Var.h = true;
                    f1Var.setPadding(0, i11, 0, AndroidUtilities.dp(8.0f));
                    iu0Var.h = false;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 24:
                ux0 ux0Var = (ux0) this.b;
                setPadding(ux0Var.n, ux0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), ux0Var.n, ux0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i9, i10);
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 5:
                super.onSizeChanged(i9, i10, i11, i12);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i9, i10);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 20:
                super.onSizeChanged(i9, i10, i11, i12);
                ll0 ll0Var = (ll0) this.b;
                og.d.c(ll0Var.h, ll0Var.s);
                ViewGroup viewGroup = ll0Var.y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 22:
                return !((iu0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 23:
            case 24:
            default:
                return super.onTouchEvent(motionEvent);
            case 25:
                return !((o51) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 26:
                ((fh1) this.b).P.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 19:
                wk0 wk0Var = (wk0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(wk0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(wk0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, wk0Var.Z0.getMeasuredWidth(), wk0Var.Z0.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 20:
            case 21:
            default:
                super.requestLayout();
                break;
            case 22:
                if (!((iu0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((cx0) this.b).c0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f10);
                gh.k5 k5Var = (gh.k5) this.b;
                gh.s3 s3Var = k5Var.Z;
                if (s3Var != null && s3Var.getVisibility() == 0) {
                    k5Var.Z.invalidate();
                    break;
                }
                break;
            case 6:
                wb wbVar = (wb) this.b;
                if (getTranslationY() != f10 && wbVar.Y0 != null) {
                    super.setTranslationY(f10);
                    wbVar.Y0.y();
                    break;
                }
                break;
            case 25:
                super.setTranslationY(f10);
                o51.m((o51) this.b);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        switch (this.a) {
            case 18:
                super.setVisibility(i9);
                ((j20) this.b).d.setVisibility(i9);
                break;
            case 24:
                ux0 ux0Var = (ux0) this.b;
                boolean z10 = getVisibility() == i9;
                super.setVisibility(i9);
                if (!z10) {
                    boolean z11 = i9 == 0;
                    if (ux0Var.e != null) {
                        for (int i10 = 0; i10 < ux0Var.e.getChildCount(); i10++) {
                            if (z11) {
                                tx0 tx0Var = (tx0) ux0Var.e.getChildAt(i10);
                                Drawable drawable = tx0Var.b;
                                if (drawable instanceof org.telegram.ui.Components.k5) {
                                    ((org.telegram.ui.Components.k5) drawable).a(tx0Var);
                                }
                                tx0Var.c = true;
                            } else {
                                tx0 tx0Var2 = (tx0) ux0Var.e.getChildAt(i10);
                                Drawable drawable2 = tx0Var2.b;
                                if (drawable2 instanceof org.telegram.ui.Components.k5) {
                                    ((org.telegram.ui.Components.k5) drawable2).o(tx0Var2);
                                }
                                tx0Var2.c = false;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(yf.n2 n2Var, Context context) {
        super(context);
        this.a = 29;
        this.b = n2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = 14;
        this.b = new go[2];
        int i9 = 0;
        while (true) {
            go[] goVarArr = (go[]) this.b;
            if (i9 < goVarArr.length) {
                goVarArr[i9] = new go(context, b6Var);
                addView(((go[]) this.b)[i9], g7.e6.e(-1, -1, 119));
                i9++;
            } else {
                goVarArr[0].setVisibility(0);
                ((go[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(yf.x1 x1Var, Context context) {
        super(context);
        this.a = 28;
        this.b = x1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Context context, String str, ih.b bVar) {
        super(context);
        this.a = 4;
        int dp = AndroidUtilities.dp(12.0f);
        int i9 = org.telegram.ui.ActionBar.f6.j5;
        setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(0.06f, bVar.N0(i9))));
        LinearLayout f10 = ll.f(context, 1);
        addView(f10, g7.e6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.b = j6Var;
        j6Var.b(0.6f, 450L, gr.h);
        j6Var.setTextSize(AndroidUtilities.dp(17.0f));
        j6Var.setTextColor(bVar.N0(i9));
        j6Var.setScaleProperty(0.7f);
        j6Var.setGravity(17);
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setAllowCancel(true);
        f10.addView(j6Var, g7.e6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.N0(i9));
        textView.setGravity(17);
        f10.addView(textView, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Context context, p20 p20Var) {
        super(context);
        this.a = 9;
        this.b = p20Var;
    }
}
