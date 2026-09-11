package ah;

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
import bi.a2;
import di.pc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.vl;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.z20;
import org.telegram.ui.ni1;
import rg.q2;
import rg.v2;
import rg.z1;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class y extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public po a() {
        return ((po[]) this.b)[0];
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 6:
                super.addView(view, i10, i11);
                ((ih.g) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    public void b() {
        po[] poVarArr = (po[]) this.b;
        po poVar = poVarArr[0];
        po poVar2 = poVarArr[1];
        poVarArr[0] = poVar2;
        poVarArr[1] = poVar;
        poVar2.n = true;
        poVar2.setVisibility(0);
        poVarArr[0].setScaleX(0.8f);
        poVarArr[0].setScaleY(0.8f);
        poVarArr[0].setAlpha(0.0f);
        poVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = poVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        pr prVar = pr.h;
        vl.q(translationY, prVar, 320L);
        po poVar3 = poVarArr[1];
        poVar3.n = false;
        poVar3.setVisibility(0);
        poVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(prVar).setDuration(320L).withEndAction(new pg(poVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 18:
                am0 am0Var = (am0) this.b;
                if (am0Var.r > 0.0f && am0Var.e != null) {
                    am0Var.f.reset();
                    float width = getWidth() / am0Var.c.getWidth();
                    am0Var.f.postScale(width, width);
                    am0Var.d.setLocalMatrix(am0Var.f);
                    am0Var.e.setAlpha((int) (am0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), am0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = am0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (am0Var.r * 255.0f));
                    canvas.save();
                    float f11 = am0Var.H;
                    float f12 = am0Var.G;
                    float f13 = am0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + am0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(am0Var.J, am0Var.K), Math.max(am0Var.J, am0Var.K), 0.75f), 1.0f, am0Var.r);
                    canvas.scale(lerp, lerp, ((am0Var.E.getBounds().width() / 2.0f) * am0Var.J) + (-am0Var.H) + am0Var.E.getBounds().left, ((am0Var.E.getBounds().height() / 2.0f) * am0Var.K) + (-am0Var.I) + am0Var.E.getBounds().top);
                    dh.d dVar = am0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (am0Var.r * 255.0f));
                        am0Var.F.draw(canvas);
                    }
                    am0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 22:
                my0 my0Var = (my0) this.b;
                ky0 ky0Var = my0Var.c;
                if (ky0Var != null && ky0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = my0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = my0Var.c.getEditField().getX() + my0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = my0Var.T;
                        my0Var.a0 = x10 + emojiSpan2.lastDrawX;
                        my0Var.U = emojiSpan2.lastDrawY;
                    } else if (my0Var.V != null && my0Var.W != null) {
                        my0Var.a0 = my0Var.c.getEditField().getX() + my0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!my0Var.s || my0Var.v || (arrayList = my0Var.w) == null || arrayList.isEmpty() || my0Var.x) ? false : true;
                float d = my0Var.P.d(z10 ? 1.0f : 0.0f, false);
                float d10 = my0Var.Q.d(z10 ? 1.0f : 0.0f, false);
                float d11 = my0Var.b0.d(my0Var.a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    my0Var.d.setVisibility(8);
                }
                my0Var.M.rewind();
                float left = my0Var.e.getLeft();
                int left2 = my0Var.e.getLeft();
                ArrayList arrayList2 = my0Var.w;
                float D = w1.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                e6 e6Var = my0Var.d0;
                float f14 = e6Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = D - left;
                if (f15 > 0.0f) {
                    f14 = e6Var.d(f15, z11);
                }
                float d12 = my0Var.c0.d((left + D) / 2.0f, z11);
                ky0 ky0Var2 = my0Var.c;
                if (ky0Var2 != null && ky0Var2.getEditField() != null) {
                    int i10 = my0Var.h;
                    if (i10 == 0) {
                        my0Var.d.setTranslationY(((-my0Var.c.getEditField().getHeight()) - my0Var.c.getEditField().getScrollY()) + my0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        my0Var.d.setTranslationY(((-my0Var.getMeasuredHeight()) - my0Var.c.getEditField().getScrollY()) + my0Var.U + AndroidUtilities.dp(20.0f) + my0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((my0Var.a0 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - my0Var.e.getLeft(), 0.0f);
                if (my0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = my0Var.e.getPaddingLeft() - max;
                    f7 = 1.0f;
                    my0Var.e.setPadding(max, 0, 0, 0);
                    my0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f7 = 1.0f;
                }
                my0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - my0Var.e.getLeft(), 0.0f)) - max);
                float translationX = my0Var.e.getTranslationX() + (d12 - f17) + my0Var.e.getPaddingLeft();
                float translationY = my0Var.e.getTranslationY() + my0Var.e.getTop() + my0Var.e.getPaddingTop() + (my0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(my0Var.e.getTranslationX() + d12 + f17 + my0Var.e.getPaddingLeft(), my0Var.getWidth() - my0Var.d.getPaddingRight());
                float translationY2 = (my0Var.e.getTranslationY() + my0Var.e.getBottom()) - (my0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = my0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    my0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    my0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    my0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    my0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    my0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    my0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    my0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    my0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    my0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    my0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    my0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    my0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    my0Var.M.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    my0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                my0Var.M.close();
                if (my0Var.O == null) {
                    Paint paint = new Paint(1);
                    my0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    my0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    my0Var.O.setColor(j6.v0(j6.Be, my0Var.b));
                }
                if (d < f7) {
                    my0Var.N.rewind();
                    float dp = my0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f10 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    my0Var.N.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(my0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, my0Var.getWidth(), my0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(my0Var.M, my0Var.O);
                canvas.save();
                canvas.clipPath(my0Var.M);
                super.dispatchDraw(canvas);
                float f26 = my0Var.d0.c;
                float f27 = my0Var.c0.c;
                float f28 = f26 / 2.0f;
                float translationX2 = my0Var.e.getTranslationX() + (f27 - f28) + my0Var.e.getPaddingLeft();
                float paddingTop = my0Var.e.getPaddingTop() + my0Var.e.getTop();
                float min3 = Math.min(my0Var.e.getTranslationX() + f27 + f28 + my0Var.e.getPaddingLeft(), my0Var.getWidth() - my0Var.d.getPaddingRight());
                float bottom = my0Var.e.getBottom();
                float d17 = my0Var.R.d(my0Var.e.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    j6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    j6.F4.setAlpha((int) (d17 * f10));
                    j6.F4.draw(canvas);
                }
                float d18 = my0Var.S.d(my0Var.e.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    j6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    j6.E4.setAlpha((int) (d18 * f10));
                    j6.E4.draw(canvas);
                }
                canvas.restore();
                if (my0Var.P.c < f7) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            case 27:
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
            case 18:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((am0) this.b).onBackPressed();
                return true;
            case 27:
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
            case 2:
                int action = motionEvent.getAction();
                a2 a2Var = a2.Z;
                if (a2Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(a2Var.G.getX(), a2Var.G.getY());
                    boolean dispatchTouchEvent = a2Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        a2Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = a2Var.x.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !a2Var.x.isInProgress() && ((GestureDetector) a2Var.y.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    a2Var.E = false;
                    a2Var.F = false;
                    o1.k kVar = a2Var.P;
                    if (!kVar.f) {
                        float f7 = a2Var.N;
                        kVar.b = f7;
                        kVar.c = true;
                        kVar.u.i = (a2Var.J / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        a2Var.P.f();
                    }
                    o1.k kVar2 = a2Var.Q;
                    if (!kVar2.f) {
                        kVar2.b = a2Var.O;
                        kVar2.c = true;
                        kVar2.u.i = w7.p.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - a2Var.K) - AndroidUtilities.dp(16.0f));
                        a2Var.Q.f();
                    }
                }
                return onTouchEvent || z10;
            case 4:
                if (((ei.i) this.b).e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 10:
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
            case 10:
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
            case 2:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                a2 a2Var = a2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(a2Var.b, a2Var.d, a2Var.c);
                a2Var.i();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 13:
                tu tuVar = (tu) this.b;
                b91 b91Var = tuVar.c;
                nu nuVar = tuVar.b;
                super.onDetachedFromWindow();
                try {
                    eg0 eg0Var = eg0.p0;
                    if (eg0Var.P) {
                        if (nuVar.getVisibility() != 0) {
                        }
                        if (b91Var.f() && !eg0Var.P) {
                            if (tu.S == tuVar) {
                                tu.S = null;
                            }
                            b91Var.b();
                            break;
                        }
                    }
                    if (nuVar.getParent() != null) {
                        removeView(nuVar);
                        nuVar.stopLoading();
                        nuVar.loadUrl("about:blank");
                        nuVar.destroy();
                    }
                    if (b91Var.f()) {
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
                ((da) this.b).e.a(canvas);
                break;
            case 10:
                gl glVar = (gl) this.b;
                glVar.d0.setColor(j6.v0(j6.h5, glVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - glVar.B0, glVar.d0);
                break;
            case 20:
                bv0 bv0Var = (bv0) this.b;
                Drawable drawable = bv0Var.d;
                int i12 = bv0Var.f;
                i10 = ((f3) bv0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 23:
                j61 j61Var = (j61) this.b;
                int i13 = j61Var.h;
                i11 = ((f3) j61Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = j61Var.b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                break;
            case 25:
                z1 z1Var = (z1) this.b;
                Rect rect = z1Var.E0;
                Rect rect2 = z1Var.D0;
                Paint paint = z1Var.F0;
                iv0 iv0Var = z1Var.v0;
                Bitmap bitmap = z1Var.A0;
                if (z1Var.z0 != null) {
                    canvas.save();
                    float e7 = z1Var.u0.e(z1Var.t0);
                    canvas.scale(1.0f - (e7 * 2.0f), 1.0f, iv0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, w1.A(1.0f, e7, 4.0f * e7, 0.25f));
                    float e10 = z1Var.y0.e(z1Var.x0);
                    if (!z1Var.x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(z1Var.w0);
                            float max = Math.max(iv0Var.a / bitmap.getWidth(), iv0Var.b / bitmap.getHeight());
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
            case 26:
                q2 q2Var = (q2) this.b;
                ImageReceiver imageReceiver = q2Var.x0;
                iv0 iv0Var2 = q2Var.v0;
                if (q2Var.w0 != null) {
                    canvas.save();
                    float e11 = q2Var.u0.e(q2Var.t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, iv0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, w1.A(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) iv0Var2.a, (int) iv0Var2.b);
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
        sg.q0 q0Var;
        sg.q0 q0Var2;
        switch (this.a) {
            case 28:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                sg.r0 r0Var = (sg.r0) this.b;
                CharSequence text = (!r0Var.h || (q0Var2 = r0Var.e) == null) ? null : q0Var2.getText();
                if (text == null && (q0Var = r0Var.d) != null) {
                    text = q0Var.getText();
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
            case 10:
                if (motionEvent.getY() > getMeasuredHeight() - ((gl) this.b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 20:
                bv0 bv0Var = (bv0) this.b;
                if (motionEvent.getAction() != 0 || bv0Var.f == 0 || motionEvent.getY() >= bv0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                bv0Var.dismiss();
                return true;
            case 23:
                j61 j61Var = (j61) this.b;
                if (motionEvent.getAction() != 0 || j61Var.h == 0 || motionEvent.getY() >= j61Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                j61Var.dismiss();
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
                b0 b0Var = (b0) this.b;
                if (b0Var.K && z10) {
                    b0Var.w.setTranslationY(-b0Var.c.getMeasuredHeight());
                    int measuredHeight3 = b0Var.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b0Var.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    b0Var.y.setLayoutParams(marginLayoutParams);
                    break;
                }
                break;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                f30 f30Var = (f30) this.b;
                f30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (f30Var.getMeasuredWidth() / 2.0f));
                f30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (f30Var.getMeasuredWidth() / 2.0f));
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((da) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
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
                z20 z20Var = (z20) this.b;
                y yVar = z20Var.b;
                int[] iArr = z20Var.G;
                yVar.getLocationOnScreen(iArr);
                z20Var.N = iArr[0];
                z20Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                am0 am0Var = (am0) this.b;
                y yVar2 = am0Var.s;
                ov0 ov0Var = am0Var.v;
                Drawable drawable = am0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (am0Var.x != null) {
                        float f10 = bounds.left;
                        float f11 = am0Var.H;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = am0Var.I;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z12 = false;
                        if (am0Var.L) {
                            f7 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                am0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                am0Var.x.setX(Math.min(ov0Var.getWidth() - am0Var.x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - ov0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                am0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                am0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - am0Var.x.getMeasuredWidth()) - ov0Var.getX());
                                z11 = true;
                            }
                            am0Var.G = z11 ? ((am0Var.x.getX() + am0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13 : (am0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                        }
                        float dp4 = f17 + (am0Var.F != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (am0Var.x.getMeasuredHeight() + dp4 > yVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            am0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            am0Var.x.setY(((f16 - AndroidUtilities.dp(f7)) - am0Var.x.getMeasuredHeight()) - ov0Var.getY());
                            z12 = true;
                        } else {
                            am0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            am0Var.x.setY(Math.min((yVar2.getHeight() - am0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - ov0Var.getY());
                        }
                        n70 n70Var = am0Var.w;
                        n70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                bv0.m((bv0) this.b);
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
                dl dlVar = ((gl) this.b).F;
                if (dlVar != null) {
                    dlVar.a();
                    break;
                }
                break;
            case 13:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((tu) this.b).J ? 22 : 0) + 84) + ((int) Math.min(r0.H / (r0.G / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 14:
                ky kyVar = (ky) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) kyVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - kyVar.F.getY()) : AndroidUtilities.dp(120.0f)) - kyVar.F.b1, TLObject.FLAG_30));
                break;
            case 15:
                kz kzVar = ((fz) this.b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (vl.y(8.0f, kzVar.D0.getMeasuredHeight() - kzVar.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 20:
                bv0 bv0Var = (bv0) this.b;
                bi.o0 o0Var = bv0Var.b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = w1.D(54.0f, LocationController.getLocationsCount(), w1.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i13 = size2 / 5;
                if (D < i13 * 3) {
                    i12 = AndroidUtilities.dp(8.0f);
                } else {
                    i12 = i13 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (o0Var.getPaddingTop() != i12) {
                    bv0Var.h = true;
                    o0Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    bv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 22:
                my0 my0Var = (my0) this.b;
                setPadding(my0Var.n, my0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), my0Var.n, my0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            case 29:
                sg.a1 a1Var = (sg.a1) this.b;
                z10 = ((f3) a1Var).isPortrait;
                if (z10) {
                    a1Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    a1Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
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
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 18:
                super.onSizeChanged(i10, i11, i12, i13);
                am0 am0Var = (am0) this.b;
                hh.d.c(am0Var.h, am0Var.s);
                ViewGroup viewGroup = am0Var.y;
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
                return !((bv0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 21:
            case 22:
            default:
                return super.onTouchEvent(motionEvent);
            case 23:
                return !((j61) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 24:
                ((ni1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 17:
                ll0 ll0Var = (ll0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(ll0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ll0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, ll0Var.d1.getMeasuredWidth(), ll0Var.d1.getMeasuredHeight());
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
                if (!((bv0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 21:
                if (!((ux0) this.b).g0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 3:
                pc pcVar = (pc) this.b;
                if (getTranslationY() != f7 && pcVar.c1 != null) {
                    super.setTranslationY(f7);
                    pcVar.c1.y();
                    break;
                }
                break;
            case 23:
                super.setTranslationY(f7);
                j61.m((j61) this.b);
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
                ((z20) this.b).d.setVisibility(i10);
                break;
            case 22:
                my0 my0Var = (my0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (my0Var.e != null) {
                        for (int i11 = 0; i11 < my0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                ly0 ly0Var = (ly0) my0Var.e.getChildAt(i11);
                                Drawable drawable = ly0Var.b;
                                if (drawable instanceof q5) {
                                    ((q5) drawable).a(ly0Var);
                                }
                                ly0Var.c = true;
                            } else {
                                ly0 ly0Var2 = (ly0) my0Var.e.getChildAt(i11);
                                Drawable drawable2 = ly0Var2.b;
                                if (drawable2 instanceof q5) {
                                    ((q5) drawable2).o(ly0Var2);
                                }
                                ly0Var2.c = false;
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
    public /* synthetic */ y(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q2 q2Var, Context context) {
        super(context);
        this.a = 26;
        this.b = q2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, f6 f6Var) {
        super(context);
        this.a = 12;
        this.b = new po[2];
        int i10 = 0;
        while (true) {
            po[] poVarArr = (po[]) this.b;
            if (i10 < poVarArr.length) {
                poVarArr[i10] = new po(context, f6Var);
                addView(((po[]) this.b)[i10], x5.e(-1, -1, 119));
                i10++;
            } else {
                poVarArr[0].setVisibility(0);
                ((po[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z1 z1Var, Context context) {
        super(context);
        this.a = 25;
        this.b = z1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, String str, bi.b bVar) {
        super(context);
        this.a = 1;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = j6.j5;
        setBackground(j6.b0(dp, j6.l1(0.06f, bVar.G0(i10))));
        LinearLayout f7 = vl.f(context, 1);
        addView(f7, x5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        q6 q6Var = new q6(context, false, true, true);
        this.b = q6Var;
        q6Var.b(0.6f, 450L, pr.h);
        q6Var.setTextSize(AndroidUtilities.dp(17.0f));
        q6Var.setTextColor(bVar.G0(i10));
        q6Var.setScaleProperty(0.7f);
        q6Var.setGravity(17);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setAllowCancel(true);
        f7.addView(q6Var, x5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.G0(i10));
        textView.setGravity(17);
        f7.addView(textView, x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, f30 f30Var) {
        super(context);
        this.a = 7;
        this.b = f30Var;
    }
}
