package bh;

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
import bi.dd;
import bi.g5;
import bi.h7;
import bi.r1;
import fi.sb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.na1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.y71;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.kh1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public dp a() {
        return ((dp[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 8:
                super.addView(view, i10, i11);
                ((jh.f) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    public void b(ch.b bVar, fh.e eVar) {
        lh.f fVar = (lh.f) this.b;
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
        ds dsVar = ds.h;
        wh.q(translationY, dsVar, 320L);
        dp dpVar3 = dpVarArr[1];
        dpVar3.n = false;
        dpVar3.setVisibility(0);
        dpVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(dsVar).setDuration(320L).withEndAction(new cp(dpVar3, 0)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 21:
                in0 in0Var = (in0) this.b;
                if (in0Var.r > 0.0f && in0Var.e != null) {
                    in0Var.f.reset();
                    float width = getWidth() / in0Var.c.getWidth();
                    in0Var.f.postScale(width, width);
                    in0Var.d.setLocalMatrix(in0Var.f);
                    in0Var.e.setAlpha((int) (in0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), in0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = in0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (in0Var.r * 255.0f));
                    canvas.save();
                    float f11 = in0Var.H;
                    float f12 = in0Var.G;
                    float f13 = in0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + in0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(in0Var.J, in0Var.K), Math.max(in0Var.J, in0Var.K), 0.75f), 1.0f, in0Var.r);
                    canvas.scale(lerp, lerp, ((in0Var.E.getBounds().width() / 2.0f) * in0Var.J) + (-in0Var.H) + in0Var.E.getBounds().left, ((in0Var.E.getBounds().height() / 2.0f) * in0Var.K) + (-in0Var.I) + in0Var.E.getBounds().top);
                    eh.d dVar = in0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (in0Var.r * 255.0f));
                        in0Var.F.draw(canvas);
                    }
                    in0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 26:
                uz0 uz0Var = (uz0) this.b;
                sz0 sz0Var = uz0Var.c;
                if (sz0Var != null && sz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = uz0Var.V;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x9 = uz0Var.c.getEditField().getX() + uz0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = uz0Var.V;
                        uz0Var.c0 = x9 + emojiSpan2.lastDrawX;
                        uz0Var.W = emojiSpan2.lastDrawY;
                    } else if (uz0Var.a0 != null && uz0Var.b0 != null) {
                        uz0Var.c0 = uz0Var.c.getEditField().getX() + uz0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!uz0Var.s || uz0Var.v || (arrayList = uz0Var.w) == null || arrayList.isEmpty() || uz0Var.x) ? false : true;
                float d = uz0Var.R.d(z10 ? 1.0f : 0.0f, false);
                float d10 = uz0Var.S.d(z10 ? 1.0f : 0.0f, false);
                float d11 = uz0Var.d0.d(uz0Var.c0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    uz0Var.d.setVisibility(8);
                }
                uz0Var.O.rewind();
                float left = uz0Var.e.getLeft();
                int left2 = uz0Var.e.getLeft();
                ArrayList arrayList2 = uz0Var.w;
                float b10 = wh.b(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                h6 h6Var = uz0Var.f0;
                float f14 = h6Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = b10 - left;
                if (f15 > 0.0f) {
                    f14 = h6Var.d(f15, z11);
                }
                float d12 = uz0Var.e0.d((left + b10) / 2.0f, z11);
                sz0 sz0Var2 = uz0Var.c;
                if (sz0Var2 != null && sz0Var2.getEditField() != null) {
                    int i10 = uz0Var.h;
                    if (i10 == 0) {
                        uz0Var.d.setTranslationY(((-uz0Var.c.getEditField().getHeight()) - uz0Var.c.getEditField().getScrollY()) + uz0Var.W + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        uz0Var.d.setTranslationY(((-uz0Var.getMeasuredHeight()) - uz0Var.c.getEditField().getScrollY()) + uz0Var.W + AndroidUtilities.dp(20.0f) + uz0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((uz0Var.c0 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - uz0Var.e.getLeft(), 0.0f);
                if (uz0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = uz0Var.e.getPaddingLeft() - max;
                    f7 = 1.0f;
                    uz0Var.e.setPadding(max, 0, 0, 0);
                    uz0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f7 = 1.0f;
                }
                uz0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - uz0Var.e.getLeft(), 0.0f)) - max);
                float translationX = uz0Var.e.getTranslationX() + (d12 - f17) + uz0Var.e.getPaddingLeft();
                float translationY = uz0Var.e.getTranslationY() + uz0Var.e.getTop() + uz0Var.e.getPaddingTop() + (uz0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(uz0Var.e.getTranslationX() + d12 + f17 + uz0Var.e.getPaddingLeft(), uz0Var.getWidth() - uz0Var.d.getPaddingRight());
                float translationY2 = (uz0Var.e.getTranslationY() + uz0Var.e.getBottom()) - (uz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = uz0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    uz0Var.O.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    uz0Var.O.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    uz0Var.O.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    uz0Var.O.arcTo(rectF, 0.0f, 90.0f);
                    uz0Var.O.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    uz0Var.O.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    uz0Var.O.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    uz0Var.O.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    uz0Var.O.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    uz0Var.O.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    uz0Var.O.arcTo(rectF2, -180.0f, 90.0f);
                    uz0Var.O.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    uz0Var.O.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    uz0Var.O.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                uz0Var.O.close();
                if (uz0Var.Q == null) {
                    Paint paint = new Paint(1);
                    uz0Var.Q = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    uz0Var.Q.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    uz0Var.Q.setColor(y6.w0(y6.Be, uz0Var.b));
                }
                if (d < f7) {
                    uz0Var.P.rewind();
                    float dp = uz0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f10 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    uz0Var.P.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(uz0Var.P);
                    canvas.saveLayerAlpha(0.0f, 0.0f, uz0Var.getWidth(), uz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(uz0Var.O, uz0Var.Q);
                canvas.save();
                canvas.clipPath(uz0Var.O);
                super.dispatchDraw(canvas);
                float f26 = uz0Var.f0.c;
                float f27 = uz0Var.e0.c;
                float f28 = f26 / 2.0f;
                float translationX2 = uz0Var.e.getTranslationX() + (f27 - f28) + uz0Var.e.getPaddingLeft();
                float paddingTop = uz0Var.e.getPaddingTop() + uz0Var.e.getTop();
                float min3 = Math.min(uz0Var.e.getTranslationX() + f27 + f28 + uz0Var.e.getPaddingLeft(), uz0Var.getWidth() - uz0Var.d.getPaddingRight());
                float bottom = uz0Var.e.getBottom();
                float d17 = uz0Var.T.d(uz0Var.e.canScrollHorizontally(-1) ? f7 : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    y6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    y6.F4.setAlpha((int) (d17 * f10));
                    y6.F4.draw(canvas);
                }
                float d18 = uz0Var.U.d(uz0Var.e.canScrollHorizontally(1) ? f7 : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    y6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    y6.E4.setAlpha((int) (d18 * f10));
                    y6.E4.draw(canvas);
                }
                canvas.restore();
                if (uz0Var.R.c < f7) {
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
            case 22:
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
            case 21:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((in0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        uu0[] uu0VarArr;
        uu0 uu0Var;
        switch (this.a) {
            case 2:
                if (((dd) this.b).t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (((gi.h) this.b).s0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((sl) this.b).y0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                ua0 ua0Var = (ua0) this.b;
                ta0 ta0Var = ua0Var.R;
                if (ta0Var != null && (uu0Var = (uu0VarArr = ta0Var.m0)[0]) != null && uu0Var.h.getFastScroll() != null && uu0VarArr[0].h.getFastScroll().n) {
                    return ua0Var.R.W(motionEvent);
                }
                ta0 ta0Var2 = ua0Var.R;
                if (ta0Var2 == null || !ta0Var2.N(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 24:
                mw0 mw0Var = (mw0) this.b;
                if (motionEvent.getActionMasked() != 0 || (!mw0Var.d0 && motionEvent.getY() < mw0Var.a0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r1.f != false) goto L12;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        switch (this.a) {
            case 12:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                sl slVar = (sl) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - slVar.y0);
                boolean drawChild = slVar.E ? false : super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 24:
                mw0 mw0Var = (mw0) this.b;
                if (mw0Var.d0) {
                    om0 om0Var = mw0Var.y;
                    f7 = mw0Var.L.getX();
                    break;
                }
                f7 = 0.0f;
                int save = canvas.save();
                canvas.clipRect(Math.max(0.0f, f7), -mw0Var.S, Math.min(getWidth(), getWidth() + f7), Math.min(getHeight() + mw0Var.T, mw0Var.a0));
                canvas.translate(f7, 0.0f);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save);
                return drawChild2;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 15:
                dv dvVar = (dv) this.b;
                na1 na1Var = dvVar.c;
                xu xuVar = dvVar.b;
                super.onDetachedFromWindow();
                try {
                    dh0 dh0Var = dh0.p0;
                    if (dh0Var.P) {
                        if (xuVar.getVisibility() != 0) {
                        }
                        if (na1Var.f() && !dh0Var.P) {
                            if (dv.S == dvVar) {
                                dv.S = null;
                            }
                            na1Var.b();
                            break;
                        }
                    }
                    if (xuVar.getParent() != null) {
                        removeView(xuVar);
                        xuVar.stopLoading();
                        xuVar.loadUrl("about:blank");
                        xuVar.destroy();
                    }
                    if (na1Var.f()) {
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
                super.onDraw(canvas);
                u uVar = (u) this.b;
                if (uVar.x > 0) {
                    canvas.drawRect(0.0f, getHeight() - uVar.x, getWidth(), getHeight(), uVar.y);
                    break;
                }
                break;
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
                ((ha) this.b).e.a(canvas);
                break;
            case 12:
                sl slVar = (sl) this.b;
                slVar.b0.setColor(y6.w0(y6.h5, slVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - slVar.y0, slVar.b0);
                break;
            case 23:
                fw0 fw0Var = (fw0) this.b;
                Drawable drawable = fw0Var.d;
                int i12 = fw0Var.f;
                i10 = ((k3) fw0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 27:
                y71 y71Var = (y71) this.b;
                int i13 = y71Var.h;
                i11 = ((k3) y71Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = y71Var.b;
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
                if (motionEvent.getY() > getMeasuredHeight() - ((sl) this.b).y0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                fw0 fw0Var = (fw0) this.b;
                if (motionEvent.getAction() != 0 || fw0Var.f == 0 || motionEvent.getY() >= fw0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                fw0Var.dismiss();
                return true;
            case 27:
                y71 y71Var = (y71) this.b;
                if (motionEvent.getAction() != 0 || y71Var.h == 0 || motionEvent.getY() >= y71Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                y71Var.dismiss();
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
                u uVar = (u) this.b;
                if (uVar.N && z10) {
                    uVar.f0(uVar.P.e);
                    break;
                }
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                q30 q30Var = (q30) this.b;
                q30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (q30Var.getMeasuredWidth() / 2.0f));
                q30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (q30Var.getMeasuredWidth() / 2.0f));
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((ha) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
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
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                k30 k30Var = (k30) this.b;
                r rVar = k30Var.b;
                int[] iArr = k30Var.G;
                rVar.getLocationOnScreen(iArr);
                k30Var.N = iArr[0];
                k30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                in0 in0Var = (in0) this.b;
                r rVar2 = in0Var.s;
                ww0 ww0Var = in0Var.v;
                Drawable drawable = in0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (in0Var.x != null) {
                        float f10 = bounds.left;
                        float f11 = in0Var.H;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = in0Var.I;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z12 = false;
                        if (in0Var.L) {
                            f7 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                in0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                in0Var.x.setX(Math.min(ww0Var.getWidth() - in0Var.x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - ww0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                in0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                in0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - in0Var.x.getMeasuredWidth()) - ww0Var.getX());
                                z11 = true;
                            }
                            in0Var.G = z11 ? ((in0Var.x.getX() + in0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13 : (in0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                        }
                        float dp4 = f17 + (in0Var.F != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (in0Var.x.getMeasuredHeight() + dp4 > rVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            in0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            in0Var.x.setY(((f16 - AndroidUtilities.dp(f7)) - in0Var.x.getMeasuredHeight()) - ww0Var.getY());
                            z12 = true;
                        } else {
                            in0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            in0Var.x.setY(Math.min((rVar2.getHeight() - in0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - ww0Var.getY());
                        }
                        l80 l80Var = in0Var.w;
                        l80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = l80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                fw0.m((fw0) this.b);
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
                pl plVar = ((sl) this.b).y;
                if (plVar != null) {
                    plVar.a();
                    break;
                }
                break;
            case 15:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((dv) this.b).J ? 22 : 0) + 84) + ((int) Math.min(r0.H / (r0.G / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 16:
                sy syVar = (sy) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) syVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - syVar.F.getY()) : AndroidUtilities.dp(120.0f)) - syVar.F.b1, TLObject.FLAG_30));
                break;
            case 17:
                sz szVar = ((nz) this.b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (wh.B(8.0f, szVar.D0.getMeasuredHeight() - szVar.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 23:
                fw0 fw0Var = (fw0) this.b;
                r1 r1Var = fw0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int b10 = wh.b(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.t.D(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i13 = size2 / 5;
                if (b10 < i13 * 3) {
                    i12 = AndroidUtilities.dp(8.0f);
                } else {
                    i12 = i13 * 2;
                    if (b10 < size2) {
                        i12 -= size2 - b10;
                    }
                }
                if (r1Var.getPaddingTop() != i12) {
                    fw0Var.h = true;
                    r1Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    fw0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(b10, size2), TLObject.FLAG_30));
                break;
            case 26:
                uz0 uz0Var = (uz0) this.b;
                setPadding(uz0Var.n, uz0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), uz0Var.n, uz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            case 29:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((m5) this.b).S.c(AndroidUtilities.dp(4.0f))));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 21:
                super.onSizeChanged(i10, i11, i12, i13);
                in0 in0Var = (in0) this.b;
                ih.d.c(in0Var.h, in0Var.s);
                ViewGroup viewGroup = in0Var.y;
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
            case 23:
                return !((fw0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 27:
                return !((y71) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 28:
                ((kh1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        switch (this.a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((lh.f) this.b);
                break;
            default:
                super.onViewAdded(view);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 20:
                nm0 nm0Var = (nm0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(nm0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(nm0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, nm0Var.b1.getMeasuredWidth(), nm0Var.b1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                if (!((fw0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 25:
                if (!((dz0) this.b).g0) {
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
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f7);
                h7 h7Var = (h7) this.b;
                g5 g5Var = h7Var.e0;
                if (g5Var != null && g5Var.getVisibility() == 0) {
                    h7Var.e0.invalidate();
                    break;
                }
                break;
            case 4:
                sb sbVar = (sb) this.b;
                if (getTranslationY() != f7 && sbVar.c1 != null) {
                    super.setTranslationY(f7);
                    sbVar.c1.y();
                    break;
                }
                break;
            case 27:
                super.setTranslationY(f7);
                y71.m((y71) this.b);
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
                ((k30) this.b).d.setVisibility(i10);
                break;
            case 26:
                uz0 uz0Var = (uz0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (uz0Var.e != null) {
                        for (int i11 = 0; i11 < uz0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                tz0 tz0Var = (tz0) uz0Var.e.getChildAt(i11);
                                Drawable drawable = tz0Var.b;
                                if (drawable instanceof t5) {
                                    ((t5) drawable).a(tz0Var);
                                }
                                tz0Var.c = true;
                            } else {
                                tz0 tz0Var2 = (tz0) uz0Var.e.getChildAt(i11);
                                Drawable drawable2 = tz0Var2.b;
                                if (drawable2 instanceof t5) {
                                    ((t5) drawable2).o(tz0Var2);
                                }
                                tz0Var2.c = false;
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
    public /* synthetic */ r(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context);
        this.a = 7;
        lh.f fVar = new lh.f(context);
        this.b = fVar;
        addView(fVar, kb1.k());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, u6 u6Var) {
        super(context);
        this.a = 14;
        this.b = new dp[2];
        int i10 = 0;
        while (true) {
            dp[] dpVarArr = (dp[]) this.b;
            if (i10 < dpVarArr.length) {
                dpVarArr[i10] = new dp(context, u6Var);
                addView(((dp[]) this.b)[i10], kb1.i(-1, -1, 119));
                i10++;
            } else {
                dpVarArr[0].setVisibility(0);
                ((dp[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, String str, di.b bVar) {
        super(context);
        this.a = 3;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = y6.j5;
        Drawable c02 = y6.c0(dp, y6.o1(0.06f, bVar.g(i10)));
        b7 L = f7.L(0.06f, i10);
        setBackground(c02);
        f7.k(this, c02, L, null, bVar);
        LinearLayout d = wh.d(context, 1);
        addView(d, kb1.h(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        s6 s6Var = new s6(context, false, true, true);
        this.b = s6Var;
        s6Var.b(0.6f, 450L, ds.h);
        s6Var.setTextSize(AndroidUtilities.dp(17.0f));
        f7.Z(s6Var, i10, bVar);
        s6Var.setScaleProperty(0.7f);
        s6Var.setGravity(17);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setAllowCancel(true);
        d.addView(s6Var, kb1.o(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        f7.V(textView, i10, bVar);
        textView.setGravity(17);
        d.addView(textView, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, Context context) {
        super(context);
        this.a = 0;
        this.b = uVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mw0 mw0Var, Context context) {
        super(context);
        this.a = 24;
        this.b = mw0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, q30 q30Var) {
        super(context);
        this.a = 9;
        this.b = q30Var;
    }
}
