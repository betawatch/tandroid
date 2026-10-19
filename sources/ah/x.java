package ah;

import ai.l5;
import ai.l7;
import ai.md;
import ai.u1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
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
import ei.vb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.Wallet.s5;
import org.telegram.ui.ah1;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public ap a() {
        return ((ap[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 8:
                super.addView(view, i10, i11);
                ((ih.f) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    public void b(bh.b bVar, eh.e eVar) {
        kh.f fVar = (kh.f) this.b;
        fVar.b(bVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    public void c() {
        ap[] apVarArr = (ap[]) this.b;
        ap apVar = apVarArr[0];
        ap apVar2 = apVarArr[1];
        apVarArr[0] = apVar2;
        apVarArr[1] = apVar;
        apVar2.n = true;
        apVar2.setVisibility(0);
        apVarArr[0].setScaleX(0.8f);
        apVarArr[0].setScaleY(0.8f);
        apVarArr[0].setAlpha(0.0f);
        apVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = apVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        bs bsVar = bs.h;
        kk.t(translationY, bsVar, 320L);
        ap apVar3 = apVarArr[1];
        apVar3.n = false;
        apVar3.setVisibility(0);
        apVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(bsVar).setDuration(320L).withEndAction(new pg(apVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 20:
                ym0 ym0Var = (ym0) this.b;
                if (ym0Var.r > 0.0f && ym0Var.e != null) {
                    ym0Var.f.reset();
                    float width = getWidth() / ym0Var.c.getWidth();
                    ym0Var.f.postScale(width, width);
                    ym0Var.d.setLocalMatrix(ym0Var.f);
                    ym0Var.e.setAlpha((int) (ym0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ym0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = ym0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (ym0Var.r * 255.0f));
                    canvas.save();
                    float f11 = ym0Var.H;
                    float f12 = ym0Var.G;
                    float f13 = ym0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + ym0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(ym0Var.J, ym0Var.K), Math.max(ym0Var.J, ym0Var.K), 0.75f), 1.0f, ym0Var.r);
                    canvas.scale(lerp, lerp, ((ym0Var.E.getBounds().width() / 2.0f) * ym0Var.J) + (-ym0Var.H) + ym0Var.E.getBounds().left, ((ym0Var.E.getBounds().height() / 2.0f) * ym0Var.K) + (-ym0Var.I) + ym0Var.E.getBounds().top);
                    dh.d dVar = ym0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (ym0Var.r * 255.0f));
                        ym0Var.F.draw(canvas);
                    }
                    ym0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 24:
                hz0 hz0Var = (hz0) this.b;
                fz0 fz0Var = hz0Var.c;
                if (fz0Var != null && fz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = hz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = hz0Var.c.getEditField().getX() + hz0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = hz0Var.T;
                        hz0Var.a0 = x10 + emojiSpan2.lastDrawX;
                        hz0Var.U = emojiSpan2.lastDrawY;
                    } else if (hz0Var.V != null && hz0Var.W != null) {
                        hz0Var.a0 = hz0Var.c.getEditField().getX() + hz0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!hz0Var.s || hz0Var.v || (arrayList = hz0Var.w) == null || arrayList.isEmpty() || hz0Var.x) ? false : true;
                float d = hz0Var.P.d(z10 ? 1.0f : 0.0f, false);
                float d10 = hz0Var.Q.d(z10 ? 1.0f : 0.0f, false);
                float d11 = hz0Var.b0.d(hz0Var.a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    hz0Var.d.setVisibility(8);
                }
                hz0Var.M.rewind();
                float left = hz0Var.e.getLeft();
                int left2 = hz0Var.e.getLeft();
                ArrayList arrayList2 = hz0Var.w;
                float D = org.telegram.messenger.g0.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                f6 f6Var = hz0Var.d0;
                float f14 = f6Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = D - left;
                if (f15 > 0.0f) {
                    f14 = f6Var.d(f15, z11);
                }
                float d12 = hz0Var.c0.d((left + D) / 2.0f, z11);
                fz0 fz0Var2 = hz0Var.c;
                if (fz0Var2 != null && fz0Var2.getEditField() != null) {
                    int i10 = hz0Var.h;
                    if (i10 == 0) {
                        hz0Var.d.setTranslationY(((-hz0Var.c.getEditField().getHeight()) - hz0Var.c.getEditField().getScrollY()) + hz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        hz0Var.d.setTranslationY(((-hz0Var.getMeasuredHeight()) - hz0Var.c.getEditField().getScrollY()) + hz0Var.U + AndroidUtilities.dp(20.0f) + hz0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((hz0Var.a0 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - hz0Var.e.getLeft(), 0.0f);
                if (hz0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = hz0Var.e.getPaddingLeft() - max;
                    f7 = 1.0f;
                    hz0Var.e.setPadding(max, 0, 0, 0);
                    hz0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f7 = 1.0f;
                }
                hz0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - hz0Var.e.getLeft(), 0.0f)) - max);
                float translationX = hz0Var.e.getTranslationX() + (d12 - f17) + hz0Var.e.getPaddingLeft();
                float translationY = hz0Var.e.getTranslationY() + hz0Var.e.getTop() + hz0Var.e.getPaddingTop() + (hz0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(hz0Var.e.getTranslationX() + d12 + f17 + hz0Var.e.getPaddingLeft(), hz0Var.getWidth() - hz0Var.d.getPaddingRight());
                float translationY2 = (hz0Var.e.getTranslationY() + hz0Var.e.getBottom()) - (hz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = hz0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    hz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    hz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    hz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    hz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    hz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    hz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    hz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    hz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    hz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    hz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    hz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    hz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    hz0Var.M.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    hz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                hz0Var.M.close();
                if (hz0Var.O == null) {
                    Paint paint = new Paint(1);
                    hz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    hz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    hz0Var.O.setColor(h6.w0(h6.Be, hz0Var.b));
                }
                if (d < f7) {
                    hz0Var.N.rewind();
                    float dp = hz0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f10 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    hz0Var.N.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(hz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, hz0Var.getWidth(), hz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(hz0Var.M, hz0Var.O);
                canvas.save();
                canvas.clipPath(hz0Var.M);
                super.dispatchDraw(canvas);
                float f26 = hz0Var.d0.c;
                float f27 = hz0Var.c0.c;
                float f28 = f26 / 2.0f;
                float translationX2 = hz0Var.e.getTranslationX() + (f27 - f28) + hz0Var.e.getPaddingLeft();
                float paddingTop = hz0Var.e.getPaddingTop() + hz0Var.e.getTop();
                float min3 = Math.min(hz0Var.e.getTranslationX() + f27 + f28 + hz0Var.e.getPaddingLeft(), hz0Var.getWidth() - hz0Var.d.getPaddingRight());
                float bottom = hz0Var.e.getBottom();
                float d17 = hz0Var.R.d(hz0Var.e.canScrollHorizontally(-1) ? f7 : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    h6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    h6.F4.setAlpha((int) (d17 * f10));
                    h6.F4.draw(canvas);
                }
                float d18 = hz0Var.S.d(hz0Var.e.canScrollHorizontally(1) ? f7 : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    h6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    h6.E4.setAlpha((int) (d18 * f10));
                    h6.E4.draw(canvas);
                }
                canvas.restore();
                if (hz0Var.P.c < f7) {
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
            case 20:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((ym0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (((md) this.b).f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (((fi.g) this.b).e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((rl) this.b).B0) {
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
                rl rlVar = (rl) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - rlVar.B0);
                boolean drawChild = rlVar.G ? false : super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 28:
                if (!((s5) this.b).a || view.getTag() == s5.n0) {
                    return super.drawChild(canvas, view, j10);
                }
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 15:
                cv cvVar = (cv) this.b;
                v91 v91Var = cvVar.c;
                wu wuVar = cvVar.b;
                super.onDetachedFromWindow();
                try {
                    zg0 zg0Var = zg0.p0;
                    if (zg0Var.P) {
                        if (wuVar.getVisibility() != 0) {
                        }
                        if (v91Var.f() && !zg0Var.P) {
                            if (cv.S == cvVar) {
                                cv.S = null;
                            }
                            v91Var.b();
                            break;
                        }
                    }
                    if (wuVar.getParent() != null) {
                        removeView(wuVar);
                        wuVar.stopLoading();
                        wuVar.loadUrl("about:blank");
                        wuVar.destroy();
                    }
                    if (v91Var.f()) {
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
                ((da) this.b).e.a(canvas);
                break;
            case 12:
                rl rlVar = (rl) this.b;
                rlVar.d0.setColor(h6.w0(h6.h5, rlVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - rlVar.B0, rlVar.d0);
                break;
            case 22:
                xv0 xv0Var = (xv0) this.b;
                Drawable drawable = xv0Var.d;
                int i12 = xv0Var.f;
                i10 = ((f3) xv0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 25:
                g71 g71Var = (g71) this.b;
                int i13 = g71Var.h;
                i11 = ((f3) g71Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = g71Var.b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
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
                if (motionEvent.getY() > getMeasuredHeight() - ((rl) this.b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                xv0 xv0Var = (xv0) this.b;
                if (motionEvent.getAction() != 0 || xv0Var.f == 0 || motionEvent.getY() >= xv0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                xv0Var.dismiss();
                return true;
            case 25:
                g71 g71Var = (g71) this.b;
                if (motionEvent.getAction() != 0 || g71Var.h == 0 || motionEvent.getY() >= g71Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                g71Var.dismiss();
                return true;
            case 28:
                return ((s5) this.b).a || super.onInterceptTouchEvent(motionEvent);
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
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                a0 a0Var = (a0) this.b;
                if (a0Var.K && z10) {
                    a0Var.w.setTranslationY(-a0Var.c.getMeasuredHeight());
                    int measuredHeight3 = a0Var.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a0Var.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    a0Var.y.setLayoutParams(marginLayoutParams);
                    break;
                }
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                o30 o30Var = (o30) this.b;
                o30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (o30Var.getMeasuredWidth() / 2.0f));
                o30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (o30Var.getMeasuredWidth() / 2.0f));
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((da) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
                break;
            case 13:
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.q0.getMeasuredHeight() + measuredHeight4);
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
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                i30 i30Var = (i30) this.b;
                x xVar = i30Var.b;
                int[] iArr = i30Var.G;
                xVar.getLocationOnScreen(iArr);
                i30Var.N = iArr[0];
                i30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ym0 ym0Var = (ym0) this.b;
                x xVar2 = ym0Var.s;
                kw0 kw0Var = ym0Var.v;
                Drawable drawable = ym0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (ym0Var.x != null) {
                        float f10 = bounds.left;
                        float f11 = ym0Var.H;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = ym0Var.I;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z12 = false;
                        if (ym0Var.L) {
                            f7 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                ym0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                ym0Var.x.setX(Math.min(kw0Var.getWidth() - ym0Var.x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - kw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ym0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                ym0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - ym0Var.x.getMeasuredWidth()) - kw0Var.getX());
                                z11 = true;
                            }
                            ym0Var.G = z11 ? ((ym0Var.x.getX() + ym0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13 : (ym0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                        }
                        float dp4 = f17 + (ym0Var.F != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (ym0Var.x.getMeasuredHeight() + dp4 > xVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ym0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            ym0Var.x.setY(((f16 - AndroidUtilities.dp(f7)) - ym0Var.x.getMeasuredHeight()) - kw0Var.getY());
                            z12 = true;
                        } else {
                            ym0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            ym0Var.x.setY(Math.min((xVar2.getHeight() - ym0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - kw0Var.getY());
                        }
                        i80 i80Var = ym0Var.w;
                        i80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = i80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                xv0.n((xv0) this.b);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.a) {
            case 10:
                if (View.MeasureSpec.getSize(i10) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i10, i11);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), TLObject.FLAG_30), i11);
                    break;
                }
            case 12:
                super.onMeasure(i10, i11);
                ol olVar = ((rl) this.b).F;
                if (olVar != null) {
                    olVar.a();
                    break;
                }
                break;
            case 15:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((cv) this.b).J ? 22 : 0) + 84) + ((int) Math.min(r0.H / (r0.G / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 16:
                ty tyVar = (ty) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) tyVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - tyVar.F.getY()) : AndroidUtilities.dp(120.0f)) - tyVar.F.b1, TLObject.FLAG_30));
                break;
            case 17:
                tz tzVar = ((oz) this.b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (kk.A(8.0f, tzVar.D0.getMeasuredHeight() - tzVar.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 22:
                xv0 xv0Var = (xv0) this.b;
                u1 u1Var = xv0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.g0.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.g0.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i13 = size2 / 5;
                if (D < i13 * 3) {
                    i12 = AndroidUtilities.dp(8.0f);
                } else {
                    i12 = i13 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (u1Var.getPaddingTop() != i12) {
                    xv0Var.h = true;
                    u1Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    xv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 24:
                hz0 hz0Var = (hz0) this.b;
                setPadding(hz0Var.n, hz0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), hz0Var.n, hz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            case 27:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((o5) this.b).R.c(AndroidUtilities.dp(4.0f))));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 20:
                super.onSizeChanged(i10, i11, i12, i13);
                ym0 ym0Var = (ym0) this.b;
                hh.d.c(ym0Var.h, ym0Var.s);
                ViewGroup viewGroup = ym0Var.y;
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
            case 22:
                return !((xv0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 23:
            case 24:
            default:
                return super.onTouchEvent(motionEvent);
            case 25:
                return !((g71) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 26:
                ((ah1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        switch (this.a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((kh.f) this.b);
                break;
            default:
                super.onViewAdded(view);
                break;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        switch (this.a) {
            case 29:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((r9) this.b).f0(true);
                    break;
                }
                break;
            default:
                super.onWindowFocusChanged(z10);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 19:
                im0 im0Var = (im0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(im0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(im0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, im0Var.b1.getMeasuredWidth(), im0Var.b1.getMeasuredHeight());
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
                if (!((xv0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((py0) this.b).g0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f7);
                l7 l7Var = (l7) this.b;
                l5 l5Var = l7Var.e0;
                if (l5Var != null && l5Var.getVisibility() == 0) {
                    l7Var.e0.invalidate();
                    break;
                }
                break;
            case 4:
                vb vbVar = (vb) this.b;
                if (getTranslationY() != f7 && vbVar.c1 != null) {
                    super.setTranslationY(f7);
                    vbVar.c1.y();
                    break;
                }
                break;
            case 25:
                super.setTranslationY(f7);
                g71.n((g71) this.b);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 18:
                super.setVisibility(i10);
                ((i30) this.b).d.setVisibility(i10);
                break;
            case 24:
                hz0 hz0Var = (hz0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (hz0Var.e != null) {
                        for (int i11 = 0; i11 < hz0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                gz0 gz0Var = (gz0) hz0Var.e.getChildAt(i11);
                                Drawable drawable = gz0Var.b;
                                if (drawable instanceof r5) {
                                    ((r5) drawable).a(gz0Var);
                                }
                                gz0Var.c = true;
                            } else {
                                gz0 gz0Var2 = (gz0) hz0Var.e.getChildAt(i11);
                                Drawable drawable2 = gz0Var2.b;
                                if (drawable2 instanceof r5) {
                                    ((r5) drawable2).o(gz0Var2);
                                }
                                gz0Var2.c = false;
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
    public /* synthetic */ x(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context) {
        super(context);
        this.a = 7;
        kh.f fVar = new kh.f(context);
        this.b = fVar;
        addView(fVar, z5.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, d6 d6Var) {
        super(context);
        this.a = 14;
        this.b = new ap[2];
        int i10 = 0;
        while (true) {
            ap[] apVarArr = (ap[]) this.b;
            if (i10 < apVarArr.length) {
                apVarArr[i10] = new ap(context, d6Var);
                addView(((ap[]) this.b)[i10], z5.e(-1, -1, 119));
                i10++;
            } else {
                apVarArr[0].setVisibility(0);
                ((ap[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, String str, ci.b bVar) {
        super(context);
        this.a = 3;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = h6.j5;
        setBackground(h6.c0(dp, h6.m1(0.06f, bVar.w(i10))));
        LinearLayout e = kk.e(context, 1);
        addView(e, z5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        q6 q6Var = new q6(context, false, true, true);
        this.b = q6Var;
        q6Var.b(0.6f, 450L, bs.h);
        q6Var.setTextSize(AndroidUtilities.dp(17.0f));
        q6Var.setTextColor(bVar.w(i10));
        q6Var.setScaleProperty(0.7f);
        q6Var.setGravity(17);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setAllowCancel(true);
        e.addView(q6Var, z5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.w(i10));
        textView.setGravity(17);
        e.addView(textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, o30 o30Var) {
        super(context);
        this.a = 9;
        this.b = o30Var;
    }
}
