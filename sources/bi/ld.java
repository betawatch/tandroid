package bi;

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
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.eg0;
import org.telegram.ui.si1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class ld extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public vo a() {
        return ((vo[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 3:
                super.addView(view, i10, i11);
                ((gh.g) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    public void b() {
        vo[] voVarArr = (vo[]) this.b;
        vo voVar = voVarArr[0];
        vo voVar2 = voVarArr[1];
        voVarArr[0] = voVar2;
        voVarArr[1] = voVar;
        voVar2.n = true;
        voVar2.setVisibility(0);
        voVarArr[0].setScaleX(0.8f);
        voVarArr[0].setScaleY(0.8f);
        voVarArr[0].setAlpha(0.0f);
        voVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = voVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        wr wrVar = wr.h;
        em.q(translationY, wrVar, 320L);
        vo voVar3 = voVarArr[1];
        voVar3.n = false;
        voVar3.setVisibility(0);
        voVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(wrVar).setDuration(320L).withEndAction(new rg(voVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 15:
                km0 km0Var = (km0) this.b;
                if (km0Var.r > 0.0f && km0Var.e != null) {
                    km0Var.f.reset();
                    float width = getWidth() / km0Var.c.getWidth();
                    km0Var.f.postScale(width, width);
                    km0Var.d.setLocalMatrix(km0Var.f);
                    km0Var.e.setAlpha((int) (km0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), km0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = km0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (km0Var.r * 255.0f));
                    canvas.save();
                    float f11 = km0Var.H;
                    float f12 = km0Var.G;
                    float f13 = km0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + km0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(km0Var.J, km0Var.K), Math.max(km0Var.J, km0Var.K), 0.75f), 1.0f, km0Var.r);
                    canvas.scale(lerp, lerp, ((km0Var.E.getBounds().width() / 2.0f) * km0Var.J) + (-km0Var.H) + km0Var.E.getBounds().left, ((km0Var.E.getBounds().height() / 2.0f) * km0Var.K) + (-km0Var.I) + km0Var.E.getBounds().top);
                    bh.d dVar = km0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (km0Var.r * 255.0f));
                        km0Var.F.draw(canvas);
                    }
                    km0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 19:
                zy0 zy0Var = (zy0) this.b;
                xy0 xy0Var = zy0Var.c;
                if (xy0Var != null && xy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = zy0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = zy0Var.c.getEditField().getX() + zy0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = zy0Var.T;
                        zy0Var.a0 = x10 + emojiSpan2.lastDrawX;
                        zy0Var.U = emojiSpan2.lastDrawY;
                    } else if (zy0Var.V != null && zy0Var.W != null) {
                        zy0Var.a0 = zy0Var.c.getEditField().getX() + zy0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!zy0Var.s || zy0Var.v || (arrayList = zy0Var.w) == null || arrayList.isEmpty() || zy0Var.x) ? false : true;
                float d = zy0Var.P.d(z10 ? 1.0f : 0.0f, false);
                float d10 = zy0Var.Q.d(z10 ? 1.0f : 0.0f, false);
                float d11 = zy0Var.b0.d(zy0Var.a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    zy0Var.d.setVisibility(8);
                }
                zy0Var.M.rewind();
                float left = zy0Var.e.getLeft();
                int left2 = zy0Var.e.getLeft();
                ArrayList arrayList2 = zy0Var.w;
                float D = org.telegram.messenger.a2.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                org.telegram.ui.Components.d6 d6Var = zy0Var.d0;
                float f14 = d6Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = D - left;
                if (f15 > 0.0f) {
                    f14 = d6Var.d(f15, z11);
                }
                float d12 = zy0Var.c0.d((left + D) / 2.0f, z11);
                xy0 xy0Var2 = zy0Var.c;
                if (xy0Var2 != null && xy0Var2.getEditField() != null) {
                    int i10 = zy0Var.h;
                    if (i10 == 0) {
                        zy0Var.d.setTranslationY(((-zy0Var.c.getEditField().getHeight()) - zy0Var.c.getEditField().getScrollY()) + zy0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        zy0Var.d.setTranslationY(((-zy0Var.getMeasuredHeight()) - zy0Var.c.getEditField().getScrollY()) + zy0Var.U + AndroidUtilities.dp(20.0f) + zy0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((zy0Var.a0 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - zy0Var.e.getLeft(), 0.0f);
                if (zy0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = zy0Var.e.getPaddingLeft() - max;
                    f7 = 1.0f;
                    zy0Var.e.setPadding(max, 0, 0, 0);
                    zy0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f7 = 1.0f;
                }
                zy0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - zy0Var.e.getLeft(), 0.0f)) - max);
                float translationX = zy0Var.e.getTranslationX() + (d12 - f17) + zy0Var.e.getPaddingLeft();
                float translationY = zy0Var.e.getTranslationY() + zy0Var.e.getTop() + zy0Var.e.getPaddingTop() + (zy0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(zy0Var.e.getTranslationX() + d12 + f17 + zy0Var.e.getPaddingLeft(), zy0Var.getWidth() - zy0Var.d.getPaddingRight());
                float translationY2 = (zy0Var.e.getTranslationY() + zy0Var.e.getBottom()) - (zy0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = zy0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    zy0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    zy0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    zy0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    zy0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    zy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    zy0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    zy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    zy0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    zy0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    zy0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    zy0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    zy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    zy0Var.M.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    zy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                zy0Var.M.close();
                if (zy0Var.O == null) {
                    Paint paint = new Paint(1);
                    zy0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    zy0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    zy0Var.O.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Be, zy0Var.b));
                }
                if (d < f7) {
                    zy0Var.N.rewind();
                    float dp = zy0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f10 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    zy0Var.N.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(zy0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, zy0Var.getWidth(), zy0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(zy0Var.M, zy0Var.O);
                canvas.save();
                canvas.clipPath(zy0Var.M);
                super.dispatchDraw(canvas);
                float f26 = zy0Var.d0.c;
                float f27 = zy0Var.c0.c;
                float f28 = f26 / 2.0f;
                float translationX2 = zy0Var.e.getTranslationX() + (f27 - f28) + zy0Var.e.getPaddingLeft();
                float paddingTop = zy0Var.e.getPaddingTop() + zy0Var.e.getTop();
                float min3 = Math.min(zy0Var.e.getTranslationX() + f27 + f28 + zy0Var.e.getPaddingLeft(), zy0Var.getWidth() - zy0Var.d.getPaddingRight());
                float bottom = zy0Var.e.getBottom();
                float d17 = zy0Var.R.d(zy0Var.e.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.j6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.j6.F4.setAlpha((int) (d17 * f10));
                    org.telegram.ui.ActionBar.j6.F4.draw(canvas);
                }
                float d18 = zy0Var.S.d(zy0Var.e.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.j6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.j6.E4.setAlpha((int) (d18 * f10));
                    org.telegram.ui.ActionBar.j6.E4.draw(canvas);
                }
                canvas.restore();
                if (zy0Var.P.c < f7) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            case 24:
                pg.t2 t2Var = (pg.t2) this.b;
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
            case 16:
                ff ffVar = (ff) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && ffVar.isShowing()) {
                    ffVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 15:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((km0) this.b).onBackPressed();
                return true;
            case 24:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((pg.t2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (((ci.j) this.b).e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 7:
                if (motionEvent.getY() > getMeasuredHeight() - ((ll) this.b).B0) {
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
            case 7:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ll llVar = (ll) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - llVar.B0);
                boolean drawChild = llVar.G ? false : super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 10:
                zu zuVar = (zu) this.b;
                o91 o91Var = zuVar.c;
                tu tuVar = zuVar.b;
                super.onDetachedFromWindow();
                try {
                    og0 og0Var = og0.p0;
                    if (og0Var.P) {
                        if (tuVar.getVisibility() != 0) {
                        }
                        if (o91Var.f() && !og0Var.P) {
                            if (zu.S == zuVar) {
                                zu.S = null;
                            }
                            o91Var.b();
                            break;
                        }
                    }
                    if (tuVar.getParent() != null) {
                        removeView(tuVar);
                        tuVar.stopLoading();
                        tuVar.loadUrl("about:blank");
                        tuVar.destroy();
                    }
                    if (o91Var.f()) {
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
            case 5:
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
            case 6:
                ((org.telegram.ui.Components.ca) this.b).e.a(canvas);
                break;
            case 7:
                ll llVar = (ll) this.b;
                llVar.d0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, llVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - llVar.B0, llVar.d0);
                break;
            case 17:
                mv0 mv0Var = (mv0) this.b;
                Drawable drawable = mv0Var.d;
                int i12 = mv0Var.f;
                i10 = ((org.telegram.ui.ActionBar.h3) mv0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 20:
                x61 x61Var = (x61) this.b;
                int i13 = x61Var.h;
                i11 = ((org.telegram.ui.ActionBar.h3) x61Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = x61Var.b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                break;
            case 22:
                pg.x1 x1Var = (pg.x1) this.b;
                Rect rect = x1Var.E0;
                Rect rect2 = x1Var.D0;
                Paint paint = x1Var.F0;
                tv0 tv0Var = x1Var.v0;
                Bitmap bitmap = x1Var.A0;
                if (x1Var.z0 != null) {
                    canvas.save();
                    float e = x1Var.u0.e(x1Var.t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, tv0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.a2.A(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = x1Var.y0.e(x1Var.x0);
                    if (!x1Var.x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(x1Var.w0);
                            float max = Math.max(tv0Var.a / bitmap.getWidth(), tv0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (x1Var.G0 != null) {
                                canvas.rotate(-x1Var.getOrientation());
                                int contentWidth = x1Var.getContentWidth();
                                int contentHeight = x1Var.getContentHeight();
                                if (((x1Var.getOrientation() + x1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = x1Var.getContentHeight();
                                    contentHeight = x1Var.getContentWidth();
                                }
                                MediaController.CropState cropState = x1Var.G0;
                                float f7 = cropState.cropPw;
                                float f10 = cropState.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = x1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState2 = x1Var.G0;
                                canvas.translate(cropState2.cropPx * f11, cropState2.cropPy * f12);
                                canvas.rotate(x1Var.G0.cropRotate + r4.transformRotation);
                                if (x1Var.G0.mirrored) {
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
            case 23:
                pg.o2 o2Var = (pg.o2) this.b;
                ImageReceiver imageReceiver = o2Var.x0;
                tv0 tv0Var2 = o2Var.v0;
                if (o2Var.w0 != null) {
                    canvas.save();
                    float e10 = o2Var.u0.e(o2Var.t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, tv0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.a2.A(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) tv0Var2.a, (int) tv0Var2.b);
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
        qg.r0 r0Var;
        qg.r0 r0Var2;
        switch (this.a) {
            case 25:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                qg.s0 s0Var = (qg.s0) this.b;
                CharSequence text = (!s0Var.h || (r0Var2 = s0Var.e) == null) ? null : r0Var2.getText();
                if (text == null && (r0Var = s0Var.d) != null) {
                    text = r0Var.getText();
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
            case 7:
                if (motionEvent.getY() > getMeasuredHeight() - ((ll) this.b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 17:
                mv0 mv0Var = (mv0) this.b;
                if (motionEvent.getAction() != 0 || mv0Var.f == 0 || motionEvent.getY() >= mv0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                mv0Var.dismiss();
                return true;
            case 20:
                x61 x61Var = (x61) this.b;
                if (motionEvent.getAction() != 0 || x61Var.h == 0 || motionEvent.getY() >= x61Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                x61Var.dismiss();
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
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                p30 p30Var = (p30) this.b;
                p30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (p30Var.getMeasuredWidth() / 2.0f));
                p30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (p30Var.getMeasuredWidth() / 2.0f));
                break;
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.ca) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
                break;
            case 8:
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
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                j30 j30Var = (j30) this.b;
                ld ldVar = j30Var.b;
                int[] iArr = j30Var.G;
                ldVar.getLocationOnScreen(iArr);
                j30Var.N = iArr[0];
                j30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                km0 km0Var = (km0) this.b;
                ld ldVar2 = km0Var.s;
                aw0 aw0Var = km0Var.v;
                Drawable drawable = km0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (km0Var.x != null) {
                        float f10 = bounds.left;
                        float f11 = km0Var.H;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = km0Var.I;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z12 = false;
                        if (km0Var.L) {
                            f7 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                km0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                km0Var.x.setX(Math.min(aw0Var.getWidth() - km0Var.x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - aw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                km0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                km0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - km0Var.x.getMeasuredWidth()) - aw0Var.getX());
                                z11 = true;
                            }
                            km0Var.G = z11 ? ((km0Var.x.getX() + km0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13 : (km0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                        }
                        float dp4 = f17 + (km0Var.F != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (km0Var.x.getMeasuredHeight() + dp4 > ldVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            km0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            km0Var.x.setY(((f16 - AndroidUtilities.dp(f7)) - km0Var.x.getMeasuredHeight()) - aw0Var.getY());
                            z12 = true;
                        } else {
                            km0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            km0Var.x.setY(Math.min((ldVar2.getHeight() - km0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - aw0Var.getY());
                        }
                        w70 w70Var = km0Var.w;
                        w70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                mv0.m((mv0) this.b);
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
            case 5:
                if (View.MeasureSpec.getSize(i10) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i10, i11);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), TLObject.FLAG_30), i11);
                    break;
                }
            case 7:
                super.onMeasure(i10, i11);
                il ilVar = ((ll) this.b).F;
                if (ilVar != null) {
                    ilVar.a();
                    break;
                }
                break;
            case 10:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((zu) this.b).J ? 22 : 0) + 84) + ((int) Math.min(r0.H / (r0.G / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 11:
                ry ryVar = (ry) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) ryVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - ryVar.F.getY()) : AndroidUtilities.dp(120.0f)) - ryVar.F.b1, TLObject.FLAG_30));
                break;
            case 12:
                rz rzVar = ((mz) this.b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (em.y(8.0f, rzVar.D0.getMeasuredHeight() - rzVar.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 17:
                mv0 mv0Var = (mv0) this.b;
                y1 y1Var = mv0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.a2.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.a2.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i13 = size2 / 5;
                if (D < i13 * 3) {
                    i12 = AndroidUtilities.dp(8.0f);
                } else {
                    i12 = i13 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (y1Var.getPaddingTop() != i12) {
                    mv0Var.h = true;
                    y1Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    mv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 19:
                zy0 zy0Var = (zy0) this.b;
                setPadding(zy0Var.n, zy0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), zy0Var.n, zy0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            case 26:
                qg.a1 a1Var = (qg.a1) this.b;
                z10 = ((org.telegram.ui.ActionBar.h3) a1Var).isPortrait;
                if (z10) {
                    a1Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    a1Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 27:
                super.onMeasure(i10, i11);
                qg.m1 m1Var = ((qg.l1) this.b).c;
                eg0 eg0Var = m1Var.r0;
                if (eg0Var == null) {
                    View view = m1Var.B0;
                    if (view == null) {
                        f7 = 0.0f;
                        m1Var.q0.setTranslationY(f7 - (r8.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    }
                } else {
                    top = eg0Var.getTop();
                    measuredHeight = m1Var.r0.getMeasuredHeight();
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.q0.setTranslationY(f7 - (r8.getMeasuredHeight() / 2.0f));
            case 28:
                super.onMeasure(i10, i11);
                ((wh.h1) this.b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 15:
                super.onSizeChanged(i10, i11, i12, i13);
                km0 km0Var = (km0) this.b;
                fh.d.c(km0Var.h, km0Var.s);
                ViewGroup viewGroup = km0Var.y;
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
            case 17:
                return !((mv0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 18:
            case 19:
            default:
                return super.onTouchEvent(motionEvent);
            case 20:
                return !((x61) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 21:
                ((si1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 14:
                vl0 vl0Var = (vl0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(vl0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vl0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, vl0Var.d1.getMeasuredWidth(), vl0Var.d1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 15:
            case 16:
            default:
                super.requestLayout();
                break;
            case 17:
                if (!((mv0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 18:
                if (!((hy0) this.b).g0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 0:
                ce ceVar = (ce) this.b;
                if (getTranslationY() != f7 && ceVar.c1 != null) {
                    super.setTranslationY(f7);
                    ceVar.c1.y();
                    break;
                }
                break;
            case 20:
                super.setTranslationY(f7);
                x61.m((x61) this.b);
                break;
            case 29:
                super.setTranslationY(f7);
                xh.x3 x3Var = (xh.x3) this.b;
                xh.j2 j2Var = x3Var.d0;
                if (j2Var != null && j2Var.getVisibility() == 0) {
                    x3Var.d0.invalidate();
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 13:
                super.setVisibility(i10);
                ((j30) this.b).d.setVisibility(i10);
                break;
            case 19:
                zy0 zy0Var = (zy0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (zy0Var.e != null) {
                        for (int i11 = 0; i11 < zy0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                yy0 yy0Var = (yy0) zy0Var.e.getChildAt(i11);
                                Drawable drawable = yy0Var.b;
                                if (drawable instanceof org.telegram.ui.Components.p5) {
                                    ((org.telegram.ui.Components.p5) drawable).a(yy0Var);
                                }
                                yy0Var.c = true;
                            } else {
                                yy0 yy0Var2 = (yy0) zy0Var.e.getChildAt(i11);
                                Drawable drawable2 = yy0Var2.b;
                                if (drawable2 instanceof org.telegram.ui.Components.p5) {
                                    ((org.telegram.ui.Components.p5) drawable2).o(yy0Var2);
                                }
                                yy0Var2.c = false;
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
    public /* synthetic */ ld(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(pg.o2 o2Var, Context context) {
        super(context);
        this.a = 23;
        this.b = o2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 9;
        this.b = new vo[2];
        int i10 = 0;
        while (true) {
            vo[] voVarArr = (vo[]) this.b;
            if (i10 < voVarArr.length) {
                voVarArr[i10] = new vo(context, f6Var);
                addView(((vo[]) this.b)[i10], w7.a6.e(-1, -1, 119));
                i10++;
            } else {
                voVarArr[0].setVisibility(0);
                ((vo[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(pg.x1 x1Var, Context context) {
        super(context);
        this.a = 22;
        this.b = x1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(Context context, p30 p30Var) {
        super(context);
        this.a = 4;
        this.b = p30Var;
    }
}
