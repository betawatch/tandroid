package ag;

import android.content.Context;
import android.content.res.Configuration;
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
import h7.z5;
import hh.i5;
import hh.oa;
import hh.r3;
import java.util.ArrayList;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zt;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.eh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p1 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public eo a() {
        return ((eo[]) this.b)[0];
    }

    public void b() {
        eo[] eoVarArr = (eo[]) this.b;
        eo eoVar = eoVarArr[0];
        eo eoVar2 = eoVarArr[1];
        eoVarArr[0] = eoVar2;
        eoVarArr[1] = eoVar;
        eoVar2.n = true;
        eoVar2.setVisibility(0);
        eoVarArr[0].setScaleX(0.8f);
        eoVarArr[0].setScaleY(0.8f);
        eoVarArr[0].setAlpha(0.0f);
        eoVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = eoVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        er erVar = er.h;
        rl.o(translationY, erVar, 320L);
        eo eoVar3 = eoVarArr[1];
        eoVar3.n = false;
        eoVar3.setVisibility(0);
        eoVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(erVar).setDuration(320L).withEndAction(new bg(eoVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        switch (this.a) {
            case 23:
                ol0 ol0Var = (ol0) this.b;
                if (ol0Var.r > 0.0f && ol0Var.e != null) {
                    ol0Var.f.reset();
                    float width = getWidth() / ol0Var.c.getWidth();
                    ol0Var.f.postScale(width, width);
                    ol0Var.d.setLocalMatrix(ol0Var.f);
                    ol0Var.e.setAlpha((int) (ol0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ol0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = ol0Var.A;
                if (drawable != null) {
                    drawable.setAlpha((int) (ol0Var.r * 255.0f));
                    canvas.save();
                    float f12 = ol0Var.D;
                    float f13 = ol0Var.C;
                    float f14 = ol0Var.r;
                    canvas.translate((f13 * f14) + f12, (0.0f * f14) + ol0Var.E);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(ol0Var.F, ol0Var.G), Math.max(ol0Var.F, ol0Var.G), 0.75f), 1.0f, ol0Var.r);
                    canvas.scale(lerp, lerp, ((ol0Var.A.getBounds().width() / 2.0f) * ol0Var.F) + (-ol0Var.D) + ol0Var.A.getBounds().left, ((ol0Var.A.getBounds().height() / 2.0f) * ol0Var.G) + (-ol0Var.E) + ol0Var.A.getBounds().top);
                    lg.d dVar = ol0Var.B;
                    if (dVar != null) {
                        dVar.setAlpha((int) (ol0Var.r * 255.0f));
                        ol0Var.B.draw(canvas);
                    }
                    ol0Var.A.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 27:
                wx0 wx0Var = (wx0) this.b;
                ux0 ux0Var = wx0Var.c;
                if (ux0Var != null && ux0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = wx0Var.P;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x8 = wx0Var.c.getEditField().getX() + wx0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = wx0Var.P;
                        wx0Var.T = x8 + emojiSpan2.lastDrawX;
                        wx0Var.Q = emojiSpan2.lastDrawY;
                    } else if (wx0Var.R != null && wx0Var.S != null) {
                        wx0Var.T = wx0Var.c.getEditField().getX() + wx0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!wx0Var.s || wx0Var.v || (arrayList = wx0Var.w) == null || arrayList.isEmpty() || wx0Var.x) ? false : true;
                float d = wx0Var.L.d(z10 ? 1.0f : 0.0f, false);
                float d10 = wx0Var.M.d(z10 ? 1.0f : 0.0f, false);
                float d11 = wx0Var.U.d(wx0Var.T, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    wx0Var.d.setVisibility(8);
                }
                wx0Var.I.rewind();
                float left = wx0Var.e.getLeft();
                int left2 = wx0Var.e.getLeft();
                ArrayList arrayList2 = wx0Var.w;
                float D = org.telegram.messenger.y1.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                y5 y5Var = wx0Var.W;
                float f15 = y5Var.c;
                boolean z11 = f15 <= 0.0f;
                float f16 = D - left;
                if (f16 > 0.0f) {
                    f15 = y5Var.d(f16, z11);
                }
                float d12 = wx0Var.V.d((left + D) / 2.0f, z11);
                ux0 ux0Var2 = wx0Var.c;
                if (ux0Var2 != null && ux0Var2.getEditField() != null) {
                    int i10 = wx0Var.h;
                    if (i10 == 0) {
                        wx0Var.d.setTranslationY(((-wx0Var.c.getEditField().getHeight()) - wx0Var.c.getEditField().getScrollY()) + wx0Var.Q + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        wx0Var.d.setTranslationY(((-wx0Var.getMeasuredHeight()) - wx0Var.c.getEditField().getScrollY()) + wx0Var.Q + AndroidUtilities.dp(20.0f) + wx0Var.d.getHeight());
                    }
                }
                float f17 = f15 / 4.0f;
                float f18 = f15 / 2.0f;
                int max = (int) Math.max((wx0Var.T - Math.max(f17, Math.min(f18, AndroidUtilities.dp(66.0f)))) - wx0Var.e.getLeft(), 0.0f);
                if (wx0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = wx0Var.e.getPaddingLeft() - max;
                    f10 = 1.0f;
                    wx0Var.e.setPadding(max, 0, 0, 0);
                    wx0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f10 = 1.0f;
                }
                wx0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f17, Math.min(f18, AndroidUtilities.dp(66.0f)))) - wx0Var.e.getLeft(), 0.0f)) - max);
                float translationX = wx0Var.e.getTranslationX() + (d12 - f18) + wx0Var.e.getPaddingLeft();
                float translationY = wx0Var.e.getTranslationY() + wx0Var.e.getTop() + wx0Var.e.getPaddingTop() + (wx0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(wx0Var.e.getTranslationX() + d12 + f18 + wx0Var.e.getPaddingLeft(), wx0Var.getWidth() - wx0Var.d.getPaddingRight());
                float translationY2 = (wx0Var.e.getTranslationY() + wx0Var.e.getBottom()) - (wx0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f18) * 2.0f;
                int i11 = wx0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f19 = translationY2 - min2;
                    float f20 = translationX + min2;
                    rectF.set(translationX, f19, f20, translationY2);
                    wx0Var.I.arcTo(rectF, 90.0f, 90.0f);
                    float f21 = translationY + min2;
                    rectF.set(translationX, translationY, f20, f21);
                    wx0Var.I.arcTo(rectF, -180.0f, 90.0f);
                    float f22 = min - min2;
                    rectF.set(f22, translationY, min, f21);
                    wx0Var.I.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f22, f19, min, translationY2);
                    wx0Var.I.arcTo(rectF, 0.0f, 90.0f);
                    wx0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    wx0Var.I.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    wx0Var.I.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f23 = min - min2;
                    float f24 = translationY + min2;
                    rectF2.set(f23, translationY, min, f24);
                    wx0Var.I.arcTo(rectF2, -90.0f, 90.0f);
                    float f25 = translationY2 - min2;
                    rectF2.set(f23, f25, min, translationY2);
                    wx0Var.I.arcTo(rectF2, 0.0f, 90.0f);
                    float f26 = min2 + translationX;
                    rectF2.set(translationX, f25, f26, translationY2);
                    wx0Var.I.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f26, f24);
                    wx0Var.I.arcTo(rectF2, -180.0f, 90.0f);
                    wx0Var.I.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    wx0Var.I.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    wx0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                wx0Var.I.close();
                if (wx0Var.K == null) {
                    Paint paint = new Paint(1);
                    wx0Var.K = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    wx0Var.K.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    wx0Var.K.setColor(g6.v0(g6.Be, wx0Var.b));
                }
                if (d < f10) {
                    wx0Var.J.rewind();
                    float dp = wx0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f11 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    wx0Var.J.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(wx0Var.J);
                    canvas.saveLayerAlpha(0.0f, 0.0f, wx0Var.getWidth(), wx0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f11 = 255.0f;
                }
                canvas.drawPath(wx0Var.I, wx0Var.K);
                canvas.save();
                canvas.clipPath(wx0Var.I);
                super.dispatchDraw(canvas);
                float f27 = wx0Var.W.c;
                float f28 = wx0Var.V.c;
                float f29 = f27 / 2.0f;
                float translationX2 = wx0Var.e.getTranslationX() + (f28 - f29) + wx0Var.e.getPaddingLeft();
                float paddingTop = wx0Var.e.getPaddingTop() + wx0Var.e.getTop();
                float min3 = Math.min(wx0Var.e.getTranslationX() + f28 + f29 + wx0Var.e.getPaddingLeft(), wx0Var.getWidth() - wx0Var.d.getPaddingRight());
                float bottom = wx0Var.e.getBottom();
                float d17 = wx0Var.N.d(wx0Var.e.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    g6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    g6.F4.setAlpha((int) (d17 * f11));
                    g6.F4.draw(canvas);
                }
                float d18 = wx0Var.O.d(wx0Var.e.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    g6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    g6.E4.setAlpha((int) (d18 * f11));
                    g6.E4.draw(canvas);
                }
                canvas.restore();
                if (wx0Var.L.c < f10) {
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
                re reVar = (re) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && reVar.isShowing()) {
                    reVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 23:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((ol0) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                if (((oa) this.b).b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 8:
                int action = motionEvent.getAction();
                jh.i1 i1Var = jh.i1.V;
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
                    o1.j jVar = i1Var.L;
                    if (!jVar.f) {
                        float f10 = i1Var.J;
                        jVar.b = f10;
                        jVar.c = true;
                        jVar.u.i = (i1Var.F / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        i1Var.L.f();
                    }
                    o1.j jVar2 = i1Var.M;
                    if (!jVar2.f) {
                        jVar2.b = i1Var.K;
                        jVar2.c = true;
                        jVar2.u.i = h7.n.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
                        i1Var.M.f();
                    }
                }
                return onTouchEvent || z10;
            case 10:
                if (((mh.g) this.b).a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((tk) this.b).x0) {
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
                tk tkVar = (tk) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - tkVar.x0);
                boolean drawChild = tkVar.C ? false : super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 8:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                jh.i1 i1Var = jh.i1.V;
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
            case 18:
                fu fuVar = (fu) this.b;
                i81 i81Var = fuVar.c;
                zt ztVar = fuVar.b;
                super.onDetachedFromWindow();
                try {
                    sf0 sf0Var = sf0.l0;
                    if (sf0Var.L) {
                        if (ztVar.getVisibility() != 0) {
                        }
                        if (i81Var.f() && !sf0Var.L) {
                            if (fu.O == fuVar) {
                                fu.O = null;
                            }
                            i81Var.b();
                            break;
                        }
                    }
                    if (ztVar.getParent() != null) {
                        removeView(ztVar);
                        ztVar.stopLoading();
                        ztVar.loadUrl("about:blank");
                        ztVar.destroy();
                    }
                    if (i81Var.f()) {
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
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
                ((t9) this.b).e.a(canvas);
                break;
            case 15:
                tk tkVar = (tk) this.b;
                tkVar.W.setColor(g6.v0(g6.h5, tkVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - tkVar.x0, tkVar.W);
                break;
            case 25:
                lu0 lu0Var = (lu0) this.b;
                Drawable drawable = lu0Var.d;
                int i12 = lu0Var.f;
                i10 = ((org.telegram.ui.ActionBar.e3) lu0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 28:
                q51 q51Var = (q51) this.b;
                int i13 = q51Var.h;
                i11 = ((org.telegram.ui.ActionBar.e3) q51Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = q51Var.b;
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
        o1 o1Var;
        o1 o1Var2;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                s1 s1Var = (s1) this.b;
                CharSequence text = (!s1Var.h || (o1Var2 = s1Var.e) == null) ? null : o1Var2.getText();
                if (text == null && (o1Var = s1Var.d) != null) {
                    text = o1Var.getText();
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
                if (motionEvent.getY() > getMeasuredHeight() - ((tk) this.b).x0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                lu0 lu0Var = (lu0) this.b;
                if (motionEvent.getAction() != 0 || lu0Var.f == 0 || motionEvent.getY() >= lu0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                lu0Var.dismiss();
                return true;
            case 28:
                q51 q51Var = (q51) this.b;
                if (motionEvent.getAction() != 0 || q51Var.h == 0 || motionEvent.getY() >= q51Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                q51Var.dismiss();
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
        float f10;
        boolean z11;
        switch (this.a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                ig.s sVar = (ig.s) this.b;
                if (sVar.G && z10) {
                    sVar.w.setTranslationY(-sVar.c.getMeasuredHeight());
                    int measuredHeight3 = sVar.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.y.setLayoutParams(marginLayoutParams);
                    break;
                }
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                t20 t20Var = (t20) this.b;
                t20Var.setTranslationY((getMeasuredHeight() * 0.28f) - (t20Var.getMeasuredWidth() / 2.0f));
                t20Var.setTranslationX((getMeasuredWidth() * 0.82f) - (t20Var.getMeasuredWidth() / 2.0f));
                break;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((t9) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
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
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                n20 n20Var = (n20) this.b;
                p1 p1Var = n20Var.b;
                int[] iArr = n20Var.C;
                p1Var.getLocationOnScreen(iArr);
                n20Var.J = iArr[0];
                n20Var.I = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                ol0 ol0Var = (ol0) this.b;
                p1 p1Var2 = ol0Var.s;
                zu0 zu0Var = ol0Var.v;
                Drawable drawable = ol0Var.A;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (ol0Var.x != null) {
                        float f11 = bounds.left;
                        float f12 = ol0Var.D;
                        float f13 = f11 + f12;
                        float f14 = bounds.right + f12;
                        float f15 = bounds.top;
                        float f16 = ol0Var.E;
                        float f17 = f15 + f16;
                        float f18 = bounds.bottom + f16;
                        boolean z12 = false;
                        if (ol0Var.H) {
                            f10 = 4.0f;
                            z11 = false;
                        } else {
                            if (f14 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                ol0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                ol0Var.x.setX(Math.min(zu0Var.getWidth() - ol0Var.x.getWidth(), f13 - AndroidUtilities.dp(10.0f)) - zu0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                ol0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f10 = 4.0f;
                                ol0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f14) - ol0Var.x.getMeasuredWidth()) - zu0Var.getX());
                                z11 = true;
                            }
                            ol0Var.C = z11 ? ((ol0Var.x.getX() + ol0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f14 : (ol0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f13;
                        }
                        float dp4 = f18 + (ol0Var.B != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (ol0Var.x.getMeasuredHeight() + dp4 > p1Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ol0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            ol0Var.x.setY(((f17 - AndroidUtilities.dp(f10)) - ol0Var.x.getMeasuredHeight()) - zu0Var.getY());
                            z12 = true;
                        } else {
                            ol0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            ol0Var.x.setY(Math.min((p1Var2.getHeight() - ol0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - zu0Var.getY());
                        }
                        b70 b70Var = ol0Var.w;
                        b70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 25:
                super.onLayout(z10, i10, i11, i12, i13);
                lu0.m((lu0) this.b);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f10;
        float top;
        int measuredHeight;
        int i12;
        switch (this.a) {
            case 1:
                g2 g2Var = (g2) this.b;
                z10 = ((org.telegram.ui.ActionBar.e3) g2Var).isPortrait;
                if (z10) {
                    g2Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    g2Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 2:
                super.onMeasure(i10, i11);
                y2 y2Var = ((x2) this.b).c;
                k kVar = y2Var.n0;
                if (kVar == null) {
                    View view = y2Var.x0;
                    if (view == null) {
                        f10 = 0.0f;
                        y2Var.m0.setTranslationY(f10 - (r8.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = y2Var.x0.getMeasuredHeight();
                    }
                } else {
                    top = kVar.getTop();
                    measuredHeight = y2Var.n0.getMeasuredHeight();
                }
                f10 = (measuredHeight / 2.0f) + top;
                y2Var.m0.setTranslationY(f10 - (r8.getMeasuredHeight() / 2.0f));
            case 3:
                super.onMeasure(i10, i11);
                ((gh.b2) this.b).G.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
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
                qk qkVar = ((tk) this.b).B;
                if (qkVar != null) {
                    qkVar.a();
                    break;
                }
                break;
            case 18:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((fu) this.b).F ? 22 : 0) + 84) + ((int) Math.min(r0.D / (r0.C / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 19:
                wx wxVar = (wx) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) wxVar.B.getParent()) != null ? (int) (r0.getMeasuredHeight() - wxVar.B.getY()) : AndroidUtilities.dp(120.0f)) - wxVar.B.X0, TLObject.FLAG_30));
                break;
            case 20:
                yy yyVar = ((ty) this.b).M;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (rl.x(8.0f, yyVar.z0.getMeasuredHeight() - yyVar.X0, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 25:
                lu0 lu0Var = (lu0) this.b;
                hh.f1 f1Var = lu0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.y1.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.y1.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i13 = size2 / 5;
                if (D < i13 * 3) {
                    i12 = AndroidUtilities.dp(8.0f);
                } else {
                    i12 = i13 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (f1Var.getPaddingTop() != i12) {
                    lu0Var.h = true;
                    f1Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    lu0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 27:
                wx0 wx0Var = (wx0) this.b;
                setPadding(wx0Var.n, wx0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), wx0Var.n, wx0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
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
            case 8:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 23:
                super.onSizeChanged(i10, i11, i12, i13);
                ol0 ol0Var = (ol0) this.b;
                pg.c.c(ol0Var.h, ol0Var.s);
                ViewGroup viewGroup = ol0Var.y;
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
                return !((lu0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 26:
            case 27:
            default:
                return super.onTouchEvent(motionEvent);
            case 28:
                return !((q51) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 29:
                ((eh1) this.b).P.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 22:
                zk0 zk0Var = (zk0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(zk0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(zk0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, zk0Var.Z0.getMeasuredWidth(), zk0Var.Z0.getMeasuredHeight());
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
                if (!((lu0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 26:
                if (!((ex0) this.b).c0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 4:
                super.setTranslationY(f10);
                i5 i5Var = (i5) this.b;
                r3 r3Var = i5Var.Z;
                if (r3Var != null && r3Var.getVisibility() == 0) {
                    i5Var.Z.invalidate();
                    break;
                }
                break;
            case 9:
                sb sbVar = (sb) this.b;
                if (getTranslationY() != f10 && sbVar.Y0 != null) {
                    super.setTranslationY(f10);
                    sbVar.Y0.y();
                    break;
                }
                break;
            case 28:
                super.setTranslationY(f10);
                q51.m((q51) this.b);
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
                ((n20) this.b).d.setVisibility(i10);
                break;
            case 27:
                wx0 wx0Var = (wx0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (wx0Var.e != null) {
                        for (int i11 = 0; i11 < wx0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                vx0 vx0Var = (vx0) wx0Var.e.getChildAt(i11);
                                Drawable drawable = vx0Var.b;
                                if (drawable instanceof k5) {
                                    ((k5) drawable).a(vx0Var);
                                }
                                vx0Var.c = true;
                            } else {
                                vx0 vx0Var2 = (vx0) wx0Var.e.getChildAt(i11);
                                Drawable drawable2 = vx0Var2.b;
                                if (drawable2 instanceof k5) {
                                    ((k5) drawable2).o(vx0Var2);
                                }
                                vx0Var2.c = false;
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
    public /* synthetic */ p1(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Context context, c6 c6Var) {
        super(context);
        this.a = 17;
        this.b = new eo[2];
        int i10 = 0;
        while (true) {
            eo[] eoVarArr = (eo[]) this.b;
            if (i10 < eoVarArr.length) {
                eoVarArr[i10] = new eo(context, c6Var);
                addView(((eo[]) this.b)[i10], z5.e(-1, -1, 119));
                i10++;
            } else {
                eoVarArr[0].setVisibility(0);
                ((eo[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Context context, String str, jh.b bVar) {
        super(context);
        this.a = 7;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = g6.j5;
        setBackground(g6.b0(dp, g6.l1(0.06f, bVar.N0(i10))));
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        addView(g10, z5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        j6 j6Var = new j6(context, false, true, true);
        this.b = j6Var;
        j6Var.b(0.6f, 450L, er.h);
        j6Var.setTextSize(AndroidUtilities.dp(17.0f));
        j6Var.setTextColor(bVar.N0(i10));
        j6Var.setScaleProperty(0.7f);
        j6Var.setGravity(17);
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setAllowCancel(true);
        g10.addView(j6Var, z5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.N0(i10));
        textView.setGravity(17);
        g10.addView(textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Context context, t20 t20Var) {
        super(context);
        this.a = 12;
        this.b = t20Var;
    }
}
