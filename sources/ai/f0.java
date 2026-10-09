package ai;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.fv;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.ha1;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.zy;
import org.telegram.ui.pi1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public gp a() {
        return ((gp[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 5:
                super.addView(view, i10, i11);
                ((hh.f) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    public void b(ah.c cVar, dh.e eVar) {
        jh.f fVar = (jh.f) this.b;
        fVar.b(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    public void c() {
        gp[] gpVarArr = (gp[]) this.b;
        gp gpVar = gpVarArr[0];
        gp gpVar2 = gpVarArr[1];
        gpVarArr[0] = gpVar2;
        gpVarArr[1] = gpVar;
        gpVar2.n = true;
        gpVar2.setVisibility(0);
        gpVarArr[0].setScaleX(0.8f);
        gpVarArr[0].setScaleY(0.8f);
        gpVarArr[0].setAlpha(0.0f);
        gpVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = gpVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        hs hsVar = hs.h;
        bi.t(translationY, hsVar, 320L);
        gp gpVar3 = gpVarArr[1];
        gpVar3.n = false;
        gpVar3.setVisibility(0);
        gpVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(hsVar).setDuration(320L).withEndAction(new rg(gpVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 17:
                gn0 gn0Var = (gn0) this.b;
                if (gn0Var.r > 0.0f && gn0Var.e != null) {
                    gn0Var.f.reset();
                    float width = getWidth() / gn0Var.c.getWidth();
                    gn0Var.f.postScale(width, width);
                    gn0Var.d.setLocalMatrix(gn0Var.f);
                    gn0Var.e.setAlpha((int) (gn0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), gn0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = gn0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (gn0Var.r * 255.0f));
                    canvas.save();
                    float f11 = gn0Var.H;
                    float f12 = gn0Var.G;
                    float f13 = gn0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + gn0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(gn0Var.J, gn0Var.K), Math.max(gn0Var.J, gn0Var.K), 0.75f), 1.0f, gn0Var.r);
                    canvas.scale(lerp, lerp, ((gn0Var.E.getBounds().width() / 2.0f) * gn0Var.J) + (-gn0Var.H) + gn0Var.E.getBounds().left, ((gn0Var.E.getBounds().height() / 2.0f) * gn0Var.K) + (-gn0Var.I) + gn0Var.E.getBounds().top);
                    ch.d dVar = gn0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (gn0Var.r * 255.0f));
                        gn0Var.F.draw(canvas);
                    }
                    gn0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 21:
                oz0 oz0Var = (oz0) this.b;
                mz0 mz0Var = oz0Var.c;
                if (mz0Var != null && mz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = oz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = oz0Var.c.getEditField().getX() + oz0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = oz0Var.T;
                        oz0Var.a0 = x10 + emojiSpan2.lastDrawX;
                        oz0Var.U = emojiSpan2.lastDrawY;
                    } else if (oz0Var.V != null && oz0Var.W != null) {
                        oz0Var.a0 = oz0Var.c.getEditField().getX() + oz0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!oz0Var.s || oz0Var.v || (arrayList = oz0Var.w) == null || arrayList.isEmpty() || oz0Var.x) ? false : true;
                float d = oz0Var.P.d(z10 ? 1.0f : 0.0f, false);
                float d10 = oz0Var.Q.d(z10 ? 1.0f : 0.0f, false);
                float d11 = oz0Var.b0.d(oz0Var.a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    oz0Var.d.setVisibility(8);
                }
                oz0Var.M.rewind();
                float left = oz0Var.e.getLeft();
                int left2 = oz0Var.e.getLeft();
                ArrayList arrayList2 = oz0Var.w;
                float D = org.telegram.messenger.q.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                org.telegram.ui.Components.g6 g6Var = oz0Var.d0;
                float f14 = g6Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = D - left;
                if (f15 > 0.0f) {
                    f14 = g6Var.d(f15, z11);
                }
                float d12 = oz0Var.c0.d((left + D) / 2.0f, z11);
                mz0 mz0Var2 = oz0Var.c;
                if (mz0Var2 != null && mz0Var2.getEditField() != null) {
                    int i10 = oz0Var.h;
                    if (i10 == 0) {
                        oz0Var.d.setTranslationY(((-oz0Var.c.getEditField().getHeight()) - oz0Var.c.getEditField().getScrollY()) + oz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        oz0Var.d.setTranslationY(((-oz0Var.getMeasuredHeight()) - oz0Var.c.getEditField().getScrollY()) + oz0Var.U + AndroidUtilities.dp(20.0f) + oz0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((oz0Var.a0 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - oz0Var.e.getLeft(), 0.0f);
                if (oz0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = oz0Var.e.getPaddingLeft() - max;
                    f7 = 1.0f;
                    oz0Var.e.setPadding(max, 0, 0, 0);
                    oz0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f7 = 1.0f;
                }
                oz0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - oz0Var.e.getLeft(), 0.0f)) - max);
                float translationX = oz0Var.e.getTranslationX() + (d12 - f17) + oz0Var.e.getPaddingLeft();
                float translationY = oz0Var.e.getTranslationY() + oz0Var.e.getTop() + oz0Var.e.getPaddingTop() + (oz0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(oz0Var.e.getTranslationX() + d12 + f17 + oz0Var.e.getPaddingLeft(), oz0Var.getWidth() - oz0Var.d.getPaddingRight());
                float translationY2 = (oz0Var.e.getTranslationY() + oz0Var.e.getBottom()) - (oz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = oz0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    oz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    oz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    oz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    oz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    oz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    oz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    oz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    oz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    oz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    oz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    oz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    oz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    oz0Var.M.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    oz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                oz0Var.M.close();
                if (oz0Var.O == null) {
                    Paint paint = new Paint(1);
                    oz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    oz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    oz0Var.O.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Be, oz0Var.b));
                }
                if (d < f7) {
                    oz0Var.N.rewind();
                    float dp = oz0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f10 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    oz0Var.N.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(oz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, oz0Var.getWidth(), oz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(oz0Var.M, oz0Var.O);
                canvas.save();
                canvas.clipPath(oz0Var.M);
                super.dispatchDraw(canvas);
                float f26 = oz0Var.d0.c;
                float f27 = oz0Var.c0.c;
                float f28 = f26 / 2.0f;
                float translationX2 = oz0Var.e.getTranslationX() + (f27 - f28) + oz0Var.e.getPaddingLeft();
                float paddingTop = oz0Var.e.getPaddingTop() + oz0Var.e.getTop();
                float min3 = Math.min(oz0Var.e.getTranslationX() + f27 + f28 + oz0Var.e.getPaddingLeft(), oz0Var.getWidth() - oz0Var.d.getPaddingRight());
                float bottom = oz0Var.e.getBottom();
                float d17 = oz0Var.R.d(oz0Var.e.canScrollHorizontally(-1) ? f7 : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.i6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.i6.F4.setAlpha((int) (d17 * f10));
                    org.telegram.ui.ActionBar.i6.F4.draw(canvas);
                }
                float d18 = oz0Var.S.d(oz0Var.e.canScrollHorizontally(1) ? f7 : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.i6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.i6.E4.setAlpha((int) (d18 * f10));
                    org.telegram.ui.ActionBar.i6.E4.draw(canvas);
                }
                canvas.restore();
                if (oz0Var.P.c < f7) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                qg.u2 u2Var = (qg.u2) this.b;
                if (u2Var.y > 0.0f && u2Var.s != null) {
                    u2Var.v.reset();
                    float width2 = getWidth() / u2Var.n.getWidth();
                    u2Var.v.postScale(width2, width2);
                    u2Var.r.setLocalMatrix(u2Var.v);
                    u2Var.s.setAlpha((int) (u2Var.y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), u2Var.s);
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
                hf hfVar = (hf) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && hfVar.isShowing()) {
                    hfVar.dismiss();
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
                ((gn0) this.b).onBackPressed();
                return true;
            case 28:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((qg.u2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (((di.i) this.b).e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((xl) this.b).B0) {
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
                xl xlVar = (xl) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - xlVar.B0);
                boolean drawChild = xlVar.G ? false : super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 12:
                lv lvVar = (lv) this.b;
                ha1 ha1Var = lvVar.c;
                fv fvVar = lvVar.b;
                super.onDetachedFromWindow();
                try {
                    gh0 gh0Var = gh0.p0;
                    if (gh0Var.P) {
                        if (fvVar.getVisibility() != 0) {
                        }
                        if (ha1Var.f() && !gh0Var.P) {
                            if (lv.S == lvVar) {
                                lv.S = null;
                            }
                            ha1Var.b();
                            break;
                        }
                    }
                    if (fvVar.getParent() != null) {
                        removeView(fvVar);
                        fvVar.stopLoading();
                        fvVar.loadUrl("about:blank");
                        fvVar.destroy();
                    }
                    if (ha1Var.f()) {
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                ((org.telegram.ui.Components.ga) this.b).e.a(canvas);
                break;
            case 9:
                xl xlVar = (xl) this.b;
                xlVar.d0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, xlVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - xlVar.B0, xlVar.d0);
                break;
            case 19:
                fw0 fw0Var = (fw0) this.b;
                Drawable drawable = fw0Var.d;
                int i12 = fw0Var.f;
                i10 = ((org.telegram.ui.ActionBar.f3) fw0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 22:
                p71 p71Var = (p71) this.b;
                int i13 = p71Var.h;
                i11 = ((org.telegram.ui.ActionBar.f3) p71Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = p71Var.b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                break;
            case 26:
                qg.y1 y1Var = (qg.y1) this.b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                mw0 mw0Var = y1Var.v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.z0 != null) {
                    canvas.save();
                    float e7 = y1Var.u0.e(y1Var.t0);
                    canvas.scale(1.0f - (e7 * 2.0f), 1.0f, mw0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e7, 4.0f * e7, 0.25f));
                    float e10 = y1Var.y0.e(y1Var.x0);
                    if (!y1Var.x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(y1Var.w0);
                            float max = Math.max(mw0Var.a / bitmap.getWidth(), mw0Var.b / bitmap.getHeight());
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
            case 27:
                qg.p2 p2Var = (qg.p2) this.b;
                ImageReceiver imageReceiver = p2Var.x0;
                mw0 mw0Var2 = p2Var.v0;
                if (p2Var.w0 != null) {
                    canvas.save();
                    float e11 = p2Var.u0.e(p2Var.t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, mw0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) mw0Var2.a, (int) mw0Var2.b);
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
            case 29:
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
                if (motionEvent.getY() > getMeasuredHeight() - ((xl) this.b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 19:
                fw0 fw0Var = (fw0) this.b;
                if (motionEvent.getAction() != 0 || fw0Var.f == 0 || motionEvent.getY() >= fw0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                fw0Var.dismiss();
                return true;
            case 22:
                p71 p71Var = (p71) this.b;
                if (motionEvent.getAction() != 0 || p71Var.h == 0 || motionEvent.getY() >= p71Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                p71Var.dismiss();
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
                w30 w30Var = (w30) this.b;
                w30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (w30Var.getMeasuredWidth() / 2.0f));
                w30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (w30Var.getMeasuredWidth() / 2.0f));
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.ga) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
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
                q30 q30Var = (q30) this.b;
                f0 f0Var = q30Var.b;
                int[] iArr = q30Var.G;
                f0Var.getLocationOnScreen(iArr);
                q30Var.N = iArr[0];
                q30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                gn0 gn0Var = (gn0) this.b;
                f0 f0Var2 = gn0Var.s;
                sw0 sw0Var = gn0Var.v;
                Drawable drawable = gn0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (gn0Var.x != null) {
                        float f10 = bounds.left;
                        float f11 = gn0Var.H;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = gn0Var.I;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z12 = false;
                        if (gn0Var.L) {
                            f7 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                gn0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                gn0Var.x.setX(Math.min(sw0Var.getWidth() - gn0Var.x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - sw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                gn0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                gn0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - gn0Var.x.getMeasuredWidth()) - sw0Var.getX());
                                z11 = true;
                            }
                            gn0Var.G = z11 ? ((gn0Var.x.getX() + gn0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13 : (gn0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                        }
                        float dp4 = f17 + (gn0Var.F != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (gn0Var.x.getMeasuredHeight() + dp4 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            gn0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            gn0Var.x.setY(((f16 - AndroidUtilities.dp(f7)) - gn0Var.x.getMeasuredHeight()) - sw0Var.getY());
                            z12 = true;
                        } else {
                            gn0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            gn0Var.x.setY(Math.min((f0Var2.getHeight() - gn0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - sw0Var.getY());
                        }
                        p80 p80Var = gn0Var.w;
                        p80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                fw0.o((fw0) this.b);
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
                ul ulVar = ((xl) this.b).F;
                if (ulVar != null) {
                    ulVar.a();
                    break;
                }
                break;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((lv) this.b).J ? 22 : 0) + 84) + ((int) Math.min(r0.H / (r0.G / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 13:
                zy zyVar = (zy) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) zyVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - zyVar.F.getY()) : AndroidUtilities.dp(120.0f)) - zyVar.F.b1, TLObject.FLAG_30));
                break;
            case 14:
                a00 a00Var = ((vz) this.b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (bi.A(8.0f, a00Var.D0.getMeasuredHeight() - a00Var.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 19:
                fw0 fw0Var = (fw0) this.b;
                w0 w0Var = fw0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.q.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.q.C(56.0f, AndroidUtilities.dp(56.0f), 1));
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
                    fw0Var.h = true;
                    w0Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    fw0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 21:
                oz0 oz0Var = (oz0) this.b;
                setPadding(oz0Var.n, oz0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), oz0Var.n, oz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            case 24:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((org.telegram.ui.Wallet.a5) this.b).T.c(AndroidUtilities.dp(4.0f))));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                gn0 gn0Var = (gn0) this.b;
                gh.d.c(gn0Var.h, gn0Var.s);
                ViewGroup viewGroup = gn0Var.y;
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
                return !((fw0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 20:
            case 21:
            default:
                return super.onTouchEvent(motionEvent);
            case 22:
                return !((p71) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 23:
                ((pi1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        switch (this.a) {
            case 4:
                super.onViewAdded(view);
                bringChildToFront((jh.f) this.b);
                break;
            default:
                super.onViewAdded(view);
                break;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        switch (this.a) {
            case 25:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.s8) this.b).e0(true);
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
            case 16:
                qm0 qm0Var = (qm0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(qm0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(qm0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, qm0Var.b1.getMeasuredWidth(), qm0Var.b1.getMeasuredHeight());
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
                if (!((fw0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((xy0) this.b).g0) {
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
                ci.lc lcVar = (ci.lc) this.b;
                if (getTranslationY() != f7 && lcVar.c1 != null) {
                    super.setTranslationY(f7);
                    lcVar.c1.y();
                    break;
                }
                break;
            case 22:
                super.setTranslationY(f7);
                p71.o((p71) this.b);
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
                ((q30) this.b).d.setVisibility(i10);
                break;
            case 21:
                oz0 oz0Var = (oz0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (oz0Var.e != null) {
                        for (int i11 = 0; i11 < oz0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                nz0 nz0Var = (nz0) oz0Var.e.getChildAt(i11);
                                Drawable drawable = nz0Var.b;
                                if (drawable instanceof org.telegram.ui.Components.s5) {
                                    ((org.telegram.ui.Components.s5) drawable).a(nz0Var);
                                }
                                nz0Var.c = true;
                            } else {
                                nz0 nz0Var2 = (nz0) oz0Var.e.getChildAt(i11);
                                Drawable drawable2 = nz0Var2.b;
                                if (drawable2 instanceof org.telegram.ui.Components.s5) {
                                    ((org.telegram.ui.Components.s5) drawable2).o(nz0Var2);
                                }
                                nz0Var2.c = false;
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
    public f0(Context context) {
        super(context);
        this.a = 4;
        jh.f fVar = new jh.f(context);
        this.b = fVar;
        addView(fVar, w7.x5.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(qg.p2 p2Var, Context context) {
        super(context);
        this.a = 27;
        this.b = p2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 11;
        this.b = new gp[2];
        int i10 = 0;
        while (true) {
            gp[] gpVarArr = (gp[]) this.b;
            if (i10 < gpVarArr.length) {
                gpVarArr[i10] = new gp(context, e6Var);
                addView(((gp[]) this.b)[i10], w7.x5.e(-1, -1, 119));
                i10++;
            } else {
                gpVarArr[0].setVisibility(0);
                ((gp[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(qg.y1 y1Var, Context context) {
        super(context);
        this.a = 26;
        this.b = y1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, String str, d dVar) {
        super(context);
        this.a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.i6.j5;
        setBackground(org.telegram.ui.ActionBar.i6.c0(dp, org.telegram.ui.ActionBar.i6.m1(0.06f, dVar.x0(i10))));
        LinearLayout e7 = bi.e(context, 1);
        addView(e7, w7.x5.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 17));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true);
        this.b = r6Var;
        r6Var.b(0.6f, 450L, hs.h);
        r6Var.setTextSize(AndroidUtilities.dp(17.0f));
        r6Var.setTextColor(dVar.x0(i10));
        r6Var.setScaleProperty(0.7f);
        r6Var.setGravity(17);
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setAllowCancel(true);
        e7.addView(r6Var, w7.x5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(dVar.x0(i10));
        textView.setGravity(17);
        e7.addView(textView, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, w30 w30Var) {
        super(context);
        this.a = 6;
        this.b = w30Var;
    }
}
