package ah;

import android.content.Context;
import android.graphics.Bitmap;
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
import di.kc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Wallet.r8;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.wi1;
import rg.q2;
import rg.v2;
import rg.z1;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public dp a() {
        return ((dp[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 6:
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
        dp[] dpVarArr = (dp[]) this.b;
        dp dpVar = dpVarArr[0];
        dp dpVar2 = dpVarArr[1];
        dpVarArr[0] = dpVar2;
        dpVarArr[1] = dpVar;
        dpVar2.n = true;
        dpVar2.setVisibility(0);
        dpVarArr[0].setScaleX(0.8f);
        dpVarArr[0].setScaleY(0.8f);
        dpVarArr[0].setAlpha(0.0f);
        dpVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = dpVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        es esVar = es.h;
        yh.s(translationY, esVar, 320L);
        dp dpVar3 = dpVarArr[1];
        dpVar3.n = false;
        dpVar3.setVisibility(0);
        dpVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(esVar).setDuration(320L).withEndAction(new qg(dpVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 18:
                cn0 cn0Var = (cn0) this.b;
                if (cn0Var.r > 0.0f && cn0Var.e != null) {
                    cn0Var.f.reset();
                    float width = getWidth() / cn0Var.c.getWidth();
                    cn0Var.f.postScale(width, width);
                    cn0Var.d.setLocalMatrix(cn0Var.f);
                    cn0Var.e.setAlpha((int) (cn0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), cn0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = cn0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (cn0Var.r * 255.0f));
                    canvas.save();
                    float f11 = cn0Var.H;
                    float f12 = cn0Var.G;
                    float f13 = cn0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + cn0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(cn0Var.J, cn0Var.K), Math.max(cn0Var.J, cn0Var.K), 0.75f), 1.0f, cn0Var.r);
                    canvas.scale(lerp, lerp, ((cn0Var.E.getBounds().width() / 2.0f) * cn0Var.J) + (-cn0Var.H) + cn0Var.E.getBounds().left, ((cn0Var.E.getBounds().height() / 2.0f) * cn0Var.K) + (-cn0Var.I) + cn0Var.E.getBounds().top);
                    dh.d dVar = cn0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (cn0Var.r * 255.0f));
                        cn0Var.F.draw(canvas);
                    }
                    cn0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 22:
                kz0 kz0Var = (kz0) this.b;
                iz0 iz0Var = kz0Var.c;
                if (iz0Var != null && iz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = kz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = kz0Var.c.getEditField().getX() + kz0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = kz0Var.T;
                        kz0Var.a0 = x10 + emojiSpan2.lastDrawX;
                        kz0Var.U = emojiSpan2.lastDrawY;
                    } else if (kz0Var.V != null && kz0Var.W != null) {
                        kz0Var.a0 = kz0Var.c.getEditField().getX() + kz0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!kz0Var.s || kz0Var.v || (arrayList = kz0Var.w) == null || arrayList.isEmpty() || kz0Var.x) ? false : true;
                float d = kz0Var.P.d(z10 ? 1.0f : 0.0f, false);
                float d10 = kz0Var.Q.d(z10 ? 1.0f : 0.0f, false);
                float d11 = kz0Var.b0.d(kz0Var.a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    kz0Var.d.setVisibility(8);
                }
                kz0Var.M.rewind();
                float left = kz0Var.e.getLeft();
                int left2 = kz0Var.e.getLeft();
                ArrayList arrayList2 = kz0Var.w;
                float y3 = yh.y(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                g6 g6Var = kz0Var.d0;
                float f14 = g6Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = y3 - left;
                if (f15 > 0.0f) {
                    f14 = g6Var.d(f15, z11);
                }
                float d12 = kz0Var.c0.d((left + y3) / 2.0f, z11);
                iz0 iz0Var2 = kz0Var.c;
                if (iz0Var2 != null && iz0Var2.getEditField() != null) {
                    int i10 = kz0Var.h;
                    if (i10 == 0) {
                        kz0Var.d.setTranslationY(((-kz0Var.c.getEditField().getHeight()) - kz0Var.c.getEditField().getScrollY()) + kz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        kz0Var.d.setTranslationY(((-kz0Var.getMeasuredHeight()) - kz0Var.c.getEditField().getScrollY()) + kz0Var.U + AndroidUtilities.dp(20.0f) + kz0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((kz0Var.a0 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - kz0Var.e.getLeft(), 0.0f);
                if (kz0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = kz0Var.e.getPaddingLeft() - max;
                    f7 = 1.0f;
                    kz0Var.e.setPadding(max, 0, 0, 0);
                    kz0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f7 = 1.0f;
                }
                kz0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - kz0Var.e.getLeft(), 0.0f)) - max);
                float translationX = kz0Var.e.getTranslationX() + (d12 - f17) + kz0Var.e.getPaddingLeft();
                float translationY = kz0Var.e.getTranslationY() + kz0Var.e.getTop() + kz0Var.e.getPaddingTop() + (kz0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(kz0Var.e.getTranslationX() + d12 + f17 + kz0Var.e.getPaddingLeft(), kz0Var.getWidth() - kz0Var.d.getPaddingRight());
                float translationY2 = (kz0Var.e.getTranslationY() + kz0Var.e.getBottom()) - (kz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = kz0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    kz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    kz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    kz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    kz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    kz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    kz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    kz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    kz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    kz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    kz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    kz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    kz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    kz0Var.M.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    kz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                kz0Var.M.close();
                if (kz0Var.O == null) {
                    Paint paint = new Paint(1);
                    kz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    kz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    kz0Var.O.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Be, kz0Var.b));
                }
                if (d < f7) {
                    kz0Var.N.rewind();
                    float dp = kz0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f10 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    kz0Var.N.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(kz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, kz0Var.getWidth(), kz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(kz0Var.M, kz0Var.O);
                canvas.save();
                canvas.clipPath(kz0Var.M);
                super.dispatchDraw(canvas);
                float f26 = kz0Var.d0.c;
                float f27 = kz0Var.c0.c;
                float f28 = f26 / 2.0f;
                float translationX2 = kz0Var.e.getTranslationX() + (f27 - f28) + kz0Var.e.getPaddingLeft();
                float paddingTop = kz0Var.e.getPaddingTop() + kz0Var.e.getTop();
                float min3 = Math.min(kz0Var.e.getTranslationX() + f27 + f28 + kz0Var.e.getPaddingLeft(), kz0Var.getWidth() - kz0Var.d.getPaddingRight());
                float bottom = kz0Var.e.getBottom();
                float d17 = kz0Var.R.d(kz0Var.e.canScrollHorizontally(-1) ? f7 : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.g6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.g6.F4.setAlpha((int) (d17 * f10));
                    org.telegram.ui.ActionBar.g6.F4.draw(canvas);
                }
                float d18 = kz0Var.S.d(kz0Var.e.canScrollHorizontally(1) ? f7 : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.g6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.g6.E4.setAlpha((int) (d18 * f10));
                    org.telegram.ui.ActionBar.g6.E4.draw(canvas);
                }
                canvas.restore();
                if (kz0Var.P.c < f7) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            case 29:
                v2 v2Var = (v2) this.b;
                if (v2Var.y > 0.0f && v2Var.s != null) {
                    v2Var.v.reset();
                    float width2 = getWidth() / v2Var.n.getWidth();
                    v2Var.v.postScale(width2, width2);
                    v2Var.r.setLocalMatrix(v2Var.v);
                    v2Var.s.setAlpha((int) (v2Var.y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), v2Var.s);
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
            case 19:
                gf gfVar = (gf) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && gfVar.isShowing()) {
                    gfVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 18:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((cn0) this.b).onBackPressed();
                return true;
            case 29:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((v2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                if (((ei.i) this.b).e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                if (motionEvent.getY() > getMeasuredHeight() - ((ul) this.b).B0) {
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
            case 10:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ul ulVar = (ul) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - ulVar.B0);
                boolean drawChild = ulVar.G ? false : super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 13:
                hv hvVar = (hv) this.b;
                ca1 ca1Var = hvVar.c;
                bv bvVar = hvVar.b;
                super.onDetachedFromWindow();
                try {
                    fh0 fh0Var = fh0.p0;
                    if (fh0Var.P) {
                        if (bvVar.getVisibility() != 0) {
                        }
                        if (ca1Var.f() && !fh0Var.P) {
                            if (hv.S == hvVar) {
                                hv.S = null;
                            }
                            ca1Var.b();
                            break;
                        }
                    }
                    if (bvVar.getParent() != null) {
                        removeView(bvVar);
                        bvVar.stopLoading();
                        bvVar.loadUrl("about:blank");
                        bvVar.destroy();
                    }
                    if (ca1Var.f()) {
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
            case 8:
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
            case 9:
                ((fa) this.b).e.a(canvas);
                break;
            case 10:
                ul ulVar = (ul) this.b;
                ulVar.d0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, ulVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - ulVar.B0, ulVar.d0);
                break;
            case 20:
                bw0 bw0Var = (bw0) this.b;
                Drawable drawable = bw0Var.d;
                int i12 = bw0Var.f;
                i10 = ((e3) bw0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 23:
                m71 m71Var = (m71) this.b;
                int i13 = m71Var.h;
                i11 = ((e3) m71Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = m71Var.b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                break;
            case 27:
                z1 z1Var = (z1) this.b;
                Rect rect = z1Var.E0;
                Rect rect2 = z1Var.D0;
                Paint paint = z1Var.F0;
                iw0 iw0Var = z1Var.v0;
                Bitmap bitmap = z1Var.A0;
                if (z1Var.z0 != null) {
                    canvas.save();
                    float e = z1Var.u0.e(z1Var.t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, iw0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.B(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = z1Var.y0.e(z1Var.x0);
                    if (!z1Var.x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(z1Var.w0);
                            float max = Math.max(iw0Var.a / bitmap.getWidth(), iw0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (z1Var.G0 != null) {
                                canvas.rotate(-z1Var.getOrientation());
                                int contentWidth = z1Var.getContentWidth();
                                int contentHeight = z1Var.getContentHeight();
                                if (((z1Var.getOrientation() + z1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = z1Var.getContentHeight();
                                    contentHeight = z1Var.getContentWidth();
                                }
                                MediaController.CropState cropState = z1Var.G0;
                                float f7 = cropState.cropPw;
                                float f10 = cropState.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = z1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState2 = z1Var.G0;
                                canvas.translate(cropState2.cropPx * f11, cropState2.cropPy * f12);
                                canvas.rotate(z1Var.G0.cropRotate + r4.transformRotation);
                                if (z1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(z1Var.getOrientation());
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
            case 28:
                q2 q2Var = (q2) this.b;
                ImageReceiver imageReceiver = q2Var.x0;
                iw0 iw0Var2 = q2Var.v0;
                if (q2Var.w0 != null) {
                    canvas.save();
                    float e10 = q2Var.u0.e(q2Var.t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, iw0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.B(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) iw0Var2.a, (int) iw0Var2.b);
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
            case 10:
                if (motionEvent.getY() > getMeasuredHeight() - ((ul) this.b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 20:
                bw0 bw0Var = (bw0) this.b;
                if (motionEvent.getAction() != 0 || bw0Var.f == 0 || motionEvent.getY() >= bw0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                bw0Var.dismiss();
                return true;
            case 23:
                m71 m71Var = (m71) this.b;
                if (motionEvent.getAction() != 0 || m71Var.h == 0 || motionEvent.getY() >= m71Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                m71Var.dismiss();
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
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                s30 s30Var = (s30) this.b;
                s30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (s30Var.getMeasuredWidth() / 2.0f));
                s30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (s30Var.getMeasuredWidth() / 2.0f));
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((fa) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
                break;
            case 11:
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
            case 16:
                super.onLayout(z10, i10, i11, i12, i13);
                m30 m30Var = (m30) this.b;
                x xVar = m30Var.b;
                int[] iArr = m30Var.G;
                xVar.getLocationOnScreen(iArr);
                m30Var.N = iArr[0];
                m30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                cn0 cn0Var = (cn0) this.b;
                x xVar2 = cn0Var.s;
                ow0 ow0Var = cn0Var.v;
                Drawable drawable = cn0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (cn0Var.x != null) {
                        float f10 = bounds.left;
                        float f11 = cn0Var.H;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = cn0Var.I;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z12 = false;
                        if (cn0Var.L) {
                            f7 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                cn0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                cn0Var.x.setX(Math.min(ow0Var.getWidth() - cn0Var.x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - ow0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                cn0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                cn0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - cn0Var.x.getMeasuredWidth()) - ow0Var.getX());
                                z11 = true;
                            }
                            cn0Var.G = z11 ? ((cn0Var.x.getX() + cn0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13 : (cn0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                        }
                        float dp4 = f17 + (cn0Var.F != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (cn0Var.x.getMeasuredHeight() + dp4 > xVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            cn0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            cn0Var.x.setY(((f16 - AndroidUtilities.dp(f7)) - cn0Var.x.getMeasuredHeight()) - ow0Var.getY());
                            z12 = true;
                        } else {
                            cn0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            cn0Var.x.setY(Math.min((xVar2.getHeight() - cn0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - ow0Var.getY());
                        }
                        m80 m80Var = cn0Var.w;
                        m80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                bw0.n((bw0) this.b);
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
            case 8:
                if (View.MeasureSpec.getSize(i10) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i10, i11);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), TLObject.FLAG_30), i11);
                    break;
                }
            case 10:
                super.onMeasure(i10, i11);
                rl rlVar = ((ul) this.b).F;
                if (rlVar != null) {
                    rlVar.a();
                    break;
                }
                break;
            case 13:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((hv) this.b).J ? 22 : 0) + 84) + ((int) Math.min(r0.H / (r0.G / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 14:
                vy vyVar = (vy) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) vyVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - vyVar.F.getY()) : AndroidUtilities.dp(120.0f)) - vyVar.F.b1, TLObject.FLAG_30));
                break;
            case 15:
                wz wzVar = ((rz) this.b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (yh.B(8.0f, wzVar.D0.getMeasuredHeight() - wzVar.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 20:
                bw0 bw0Var = (bw0) this.b;
                bi.o0 o0Var = bw0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int y3 = yh.y(54.0f, LocationController.getLocationsCount(), yh.c(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i13 = size2 / 5;
                if (y3 < i13 * 3) {
                    i12 = AndroidUtilities.dp(8.0f);
                } else {
                    i12 = i13 * 2;
                    if (y3 < size2) {
                        i12 -= size2 - y3;
                    }
                }
                if (o0Var.getPaddingTop() != i12) {
                    bw0Var.h = true;
                    o0Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    bw0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(y3, size2), TLObject.FLAG_30));
                break;
            case 22:
                kz0 kz0Var = (kz0) this.b;
                setPadding(kz0Var.n, kz0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), kz0Var.n, kz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            case 25:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((z4) this.b).T.c(AndroidUtilities.dp(4.0f))));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 18:
                super.onSizeChanged(i10, i11, i12, i13);
                cn0 cn0Var = (cn0) this.b;
                hh.d.c(cn0Var.h, cn0Var.s);
                ViewGroup viewGroup = cn0Var.y;
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
            case 20:
                return !((bw0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 21:
            case 22:
            default:
                return super.onTouchEvent(motionEvent);
            case 23:
                return !((m71) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 24:
                ((wi1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        switch (this.a) {
            case 5:
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
            case 26:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((r8) this.b).e0(true);
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
            case 17:
                mm0 mm0Var = (mm0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(mm0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(mm0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, mm0Var.b1.getMeasuredWidth(), mm0Var.b1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 18:
            case 19:
            default:
                super.requestLayout();
                break;
            case 20:
                if (!((bw0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 21:
                if (!((ty0) this.b).g0) {
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
                kc kcVar = (kc) this.b;
                if (getTranslationY() != f7 && kcVar.c1 != null) {
                    super.setTranslationY(f7);
                    kcVar.c1.y();
                    break;
                }
                break;
            case 23:
                super.setTranslationY(f7);
                m71.n((m71) this.b);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 16:
                super.setVisibility(i10);
                ((m30) this.b).d.setVisibility(i10);
                break;
            case 22:
                kz0 kz0Var = (kz0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (kz0Var.e != null) {
                        for (int i11 = 0; i11 < kz0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                jz0 jz0Var = (jz0) kz0Var.e.getChildAt(i11);
                                Drawable drawable = jz0Var.b;
                                if (drawable instanceof s5) {
                                    ((s5) drawable).a(jz0Var);
                                }
                                jz0Var.c = true;
                            } else {
                                jz0 jz0Var2 = (jz0) kz0Var.e.getChildAt(i11);
                                Drawable drawable2 = jz0Var2.b;
                                if (drawable2 instanceof s5) {
                                    ((s5) drawable2).o(jz0Var2);
                                }
                                jz0Var2.c = false;
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
        this.a = 5;
        kh.f fVar = new kh.f(context);
        this.b = fVar;
        addView(fVar, a6.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q2 q2Var, Context context) {
        super(context);
        this.a = 28;
        this.b = q2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, c6 c6Var) {
        super(context);
        this.a = 12;
        this.b = new dp[2];
        int i10 = 0;
        while (true) {
            dp[] dpVarArr = (dp[]) this.b;
            if (i10 < dpVarArr.length) {
                dpVarArr[i10] = new dp(context, c6Var);
                addView(((dp[]) this.b)[i10], a6.e(-1, -1, 119));
                i10++;
            } else {
                dpVarArr[0].setVisibility(0);
                ((dp[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z1 z1Var, Context context) {
        super(context);
        this.a = 27;
        this.b = z1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, String str, bi.b bVar) {
        super(context);
        this.a = 1;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        setBackground(org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.m1(0.06f, bVar.F0(i10))));
        LinearLayout e = yh.e(context, 1);
        addView(e, a6.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 17));
        s6 s6Var = new s6(context, false, true, true);
        this.b = s6Var;
        s6Var.b(0.6f, 450L, es.h);
        s6Var.setTextSize(AndroidUtilities.dp(17.0f));
        s6Var.setTextColor(bVar.F0(i10));
        s6Var.setScaleProperty(0.7f);
        s6Var.setGravity(17);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setAllowCancel(true);
        e.addView(s6Var, a6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.F0(i10));
        textView.setGravity(17);
        e.addView(textView, a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, s30 s30Var) {
        super(context);
        this.a = 7;
        this.b = s30Var;
    }
}
