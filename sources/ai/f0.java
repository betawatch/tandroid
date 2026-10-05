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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.aa1;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.di1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class f0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public to a() {
        return ((to[]) this.b)[0];
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
        to[] toVarArr = (to[]) this.b;
        to toVar = toVarArr[0];
        to toVar2 = toVarArr[1];
        toVarArr[0] = toVar2;
        toVarArr[1] = toVar;
        toVar2.n = true;
        toVar2.setVisibility(0);
        toVarArr[0].setScaleX(0.8f);
        toVarArr[0].setScaleY(0.8f);
        toVarArr[0].setAlpha(0.0f);
        toVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = toVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        tr trVar = tr.h;
        bi.r(translationY, trVar, 320L);
        to toVar3 = toVarArr[1];
        toVar3.n = false;
        toVar3.setVisibility(0);
        toVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(trVar).setDuration(320L).withEndAction(new qg(toVar3, 28)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        switch (this.a) {
            case 17:
                sm0 sm0Var = (sm0) this.b;
                if (sm0Var.r > 0.0f && sm0Var.e != null) {
                    sm0Var.f.reset();
                    float width = getWidth() / sm0Var.c.getWidth();
                    sm0Var.f.postScale(width, width);
                    sm0Var.d.setLocalMatrix(sm0Var.f);
                    sm0Var.e.setAlpha((int) (sm0Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), sm0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = sm0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (sm0Var.r * 255.0f));
                    canvas.save();
                    float f11 = sm0Var.H;
                    float f12 = sm0Var.G;
                    float f13 = sm0Var.r;
                    canvas.translate((f12 * f13) + f11, (0.0f * f13) + sm0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(sm0Var.J, sm0Var.K), Math.max(sm0Var.J, sm0Var.K), 0.75f), 1.0f, sm0Var.r);
                    canvas.scale(lerp, lerp, ((sm0Var.E.getBounds().width() / 2.0f) * sm0Var.J) + (-sm0Var.H) + sm0Var.E.getBounds().left, ((sm0Var.E.getBounds().height() / 2.0f) * sm0Var.K) + (-sm0Var.I) + sm0Var.E.getBounds().top);
                    ch.d dVar = sm0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (sm0Var.r * 255.0f));
                        sm0Var.F.draw(canvas);
                    }
                    sm0Var.E.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 22:
                jz0 jz0Var = (jz0) this.b;
                hz0 hz0Var = jz0Var.c;
                if (hz0Var != null && hz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = jz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = jz0Var.c.getEditField().getX() + jz0Var.c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = jz0Var.T;
                        jz0Var.a0 = x10 + emojiSpan2.lastDrawX;
                        jz0Var.U = emojiSpan2.lastDrawY;
                    } else if (jz0Var.V != null && jz0Var.W != null) {
                        jz0Var.a0 = jz0Var.c.getEditField().getX() + jz0Var.c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!jz0Var.s || jz0Var.v || (arrayList = jz0Var.w) == null || arrayList.isEmpty() || jz0Var.x) ? false : true;
                float d = jz0Var.P.d(z10 ? 1.0f : 0.0f, false);
                float d10 = jz0Var.Q.d(z10 ? 1.0f : 0.0f, false);
                float d11 = jz0Var.b0.d(jz0Var.a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    jz0Var.d.setVisibility(8);
                }
                jz0Var.M.rewind();
                float left = jz0Var.e.getLeft();
                int left2 = jz0Var.e.getLeft();
                ArrayList arrayList2 = jz0Var.w;
                float D = org.telegram.messenger.q.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                org.telegram.ui.Components.e6 e6Var = jz0Var.d0;
                float f14 = e6Var.c;
                boolean z11 = f14 <= 0.0f;
                float f15 = D - left;
                if (f15 > 0.0f) {
                    f14 = e6Var.d(f15, z11);
                }
                float d12 = jz0Var.c0.d((left + D) / 2.0f, z11);
                hz0 hz0Var2 = jz0Var.c;
                if (hz0Var2 != null && hz0Var2.getEditField() != null) {
                    int i10 = jz0Var.h;
                    if (i10 == 0) {
                        jz0Var.d.setTranslationY(((-jz0Var.c.getEditField().getHeight()) - jz0Var.c.getEditField().getScrollY()) + jz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        jz0Var.d.setTranslationY(((-jz0Var.getMeasuredHeight()) - jz0Var.c.getEditField().getScrollY()) + jz0Var.U + AndroidUtilities.dp(20.0f) + jz0Var.d.getHeight());
                    }
                }
                float f16 = f14 / 4.0f;
                float f17 = f14 / 2.0f;
                int max = (int) Math.max((jz0Var.a0 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - jz0Var.e.getLeft(), 0.0f);
                if (jz0Var.e.getPaddingLeft() != max) {
                    int paddingLeft = jz0Var.e.getPaddingLeft() - max;
                    f7 = 1.0f;
                    jz0Var.e.setPadding(max, 0, 0, 0);
                    jz0Var.e.scrollBy(paddingLeft, 0);
                } else {
                    f7 = 1.0f;
                }
                jz0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - jz0Var.e.getLeft(), 0.0f)) - max);
                float translationX = jz0Var.e.getTranslationX() + (d12 - f17) + jz0Var.e.getPaddingLeft();
                float translationY = jz0Var.e.getTranslationY() + jz0Var.e.getTop() + jz0Var.e.getPaddingTop() + (jz0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float min = Math.min(jz0Var.e.getTranslationX() + d12 + f17 + jz0Var.e.getPaddingLeft(), jz0Var.getWidth() - jz0Var.d.getPaddingRight());
                float translationY2 = (jz0Var.e.getTranslationY() + jz0Var.e.getBottom()) - (jz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = jz0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - min2;
                    float f19 = translationX + min2;
                    rectF.set(translationX, f18, f19, translationY2);
                    jz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + min2;
                    rectF.set(translationX, translationY, f19, f20);
                    jz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = min - min2;
                    rectF.set(f21, translationY, min, f20);
                    jz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, min, translationY2);
                    jz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    jz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY2);
                    jz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + translationY2);
                    jz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = min - min2;
                    float f23 = translationY + min2;
                    rectF2.set(f22, translationY, min, f23);
                    jz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - min2;
                    rectF2.set(f22, f24, min, translationY2);
                    jz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = min2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    jz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    jz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    jz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), translationY);
                    jz0Var.M.lineTo(d11, translationY - AndroidUtilities.dp(6.66f));
                    jz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, translationY);
                }
                jz0Var.M.close();
                if (jz0Var.O == null) {
                    Paint paint = new Paint(1);
                    jz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    jz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    jz0Var.O.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Be, jz0Var.b));
                }
                if (d < f7) {
                    jz0Var.N.rewind();
                    float dp = jz0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d13 = d11 - translationX;
                    double d14 = dp - translationY;
                    f10 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp - translationY2;
                    jz0Var.N.addCircle(d11, dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(jz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, jz0Var.getWidth(), jz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f10 = 255.0f;
                }
                canvas.drawPath(jz0Var.M, jz0Var.O);
                canvas.save();
                canvas.clipPath(jz0Var.M);
                super.dispatchDraw(canvas);
                float f26 = jz0Var.d0.c;
                float f27 = jz0Var.c0.c;
                float f28 = f26 / 2.0f;
                float translationX2 = jz0Var.e.getTranslationX() + (f27 - f28) + jz0Var.e.getPaddingLeft();
                float paddingTop = jz0Var.e.getPaddingTop() + jz0Var.e.getTop();
                float min3 = Math.min(jz0Var.e.getTranslationX() + f27 + f28 + jz0Var.e.getPaddingLeft(), jz0Var.getWidth() - jz0Var.d.getPaddingRight());
                float bottom = jz0Var.e.getBottom();
                float d17 = jz0Var.R.d(jz0Var.e.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
                if (d17 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.i6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.i6.F4.setAlpha((int) (d17 * f10));
                    org.telegram.ui.ActionBar.i6.F4.draw(canvas);
                }
                float d18 = jz0Var.S.d(jz0Var.e.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
                if (d18 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.i6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.i6.E4.setAlpha((int) (d18 * f10));
                    org.telegram.ui.ActionBar.i6.E4.draw(canvas);
                }
                canvas.restore();
                if (jz0Var.P.c < f7) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            case 27:
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
            case 17:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((sm0) this.b).onBackPressed();
                return true;
            case 27:
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
                if (((di.k) this.b).q0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((jl) this.b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                bw0 bw0Var = (bw0) this.b;
                if (motionEvent.getActionMasked() != 0 || (!bw0Var.d0 && motionEvent.getY() < bw0Var.a0)) {
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        float f7;
        switch (this.a) {
            case 9:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                jl jlVar = (jl) this.b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - jlVar.B0);
                boolean drawChild = jlVar.G ? false : super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 20:
                bw0 bw0Var = (bw0) this.b;
                if (bw0Var.d0) {
                    am0 am0Var = bw0Var.y;
                    f7 = bw0Var.L.getX();
                    break;
                }
                f7 = 0.0f;
                int save = canvas.save();
                canvas.clipRect(Math.max(0.0f, f7), -bw0Var.S, Math.min(getWidth(), getWidth() + f7), Math.min(getHeight() + bw0Var.T, bw0Var.a0));
                canvas.translate(f7, 0.0f);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restoreToCount(save);
                return drawChild2;
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
                zu zuVar = (zu) this.b;
                aa1 aa1Var = zuVar.c;
                tu tuVar = zuVar.b;
                super.onDetachedFromWindow();
                try {
                    rg0 rg0Var = rg0.p0;
                    if (rg0Var.P) {
                        if (tuVar.getVisibility() != 0) {
                        }
                        if (aa1Var.f() && !rg0Var.P) {
                            if (zu.S == zuVar) {
                                zu.S = null;
                            }
                            aa1Var.b();
                            break;
                        }
                    }
                    if (tuVar.getParent() != null) {
                        removeView(tuVar);
                        tuVar.stopLoading();
                        tuVar.loadUrl("about:blank");
                        tuVar.destroy();
                    }
                    if (aa1Var.f()) {
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
                ((org.telegram.ui.Components.ea) this.b).e.a(canvas);
                break;
            case 9:
                jl jlVar = (jl) this.b;
                jlVar.d0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, jlVar.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - jlVar.B0, jlVar.d0);
                break;
            case 19:
                uv0 uv0Var = (uv0) this.b;
                Drawable drawable = uv0Var.d;
                int i12 = uv0Var.f;
                i10 = ((org.telegram.ui.ActionBar.f3) uv0Var).backgroundPaddingTop;
                drawable.setBounds(0, i12 - i10, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 23:
                k71 k71Var = (k71) this.b;
                int i13 = k71Var.h;
                i11 = ((org.telegram.ui.ActionBar.f3) k71Var).backgroundPaddingTop;
                int translationY = (int) ((i13 - i11) - getTranslationY());
                Drawable drawable2 = k71Var.b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                break;
            case 25:
                qg.x1 x1Var = (qg.x1) this.b;
                Rect rect = x1Var.E0;
                Rect rect2 = x1Var.D0;
                Paint paint = x1Var.F0;
                gw0 gw0Var = x1Var.v0;
                Bitmap bitmap = x1Var.A0;
                if (x1Var.z0 != null) {
                    canvas.save();
                    float e7 = x1Var.u0.e(x1Var.t0);
                    canvas.scale(1.0f - (e7 * 2.0f), 1.0f, gw0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e7, 4.0f * e7, 0.25f));
                    float e10 = x1Var.y0.e(x1Var.x0);
                    if (!x1Var.x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(x1Var.w0);
                            float max = Math.max(gw0Var.a / bitmap.getWidth(), gw0Var.b / bitmap.getHeight());
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
            case 26:
                qg.o2 o2Var = (qg.o2) this.b;
                ImageReceiver imageReceiver = o2Var.x0;
                gw0 gw0Var2 = o2Var.v0;
                if (o2Var.w0 != null) {
                    canvas.save();
                    float e11 = o2Var.u0.e(o2Var.t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, gw0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) gw0Var2.a, (int) gw0Var2.b);
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
        rg.p0 p0Var;
        rg.p0 p0Var2;
        switch (this.a) {
            case 28:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                rg.q0 q0Var = (rg.q0) this.b;
                CharSequence text = (!q0Var.h || (p0Var2 = q0Var.e) == null) ? null : p0Var2.getText();
                if (text == null && (p0Var = q0Var.d) != null) {
                    text = p0Var.getText();
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
                if (motionEvent.getY() > getMeasuredHeight() - ((jl) this.b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 19:
                uv0 uv0Var = (uv0) this.b;
                if (motionEvent.getAction() != 0 || uv0Var.f == 0 || motionEvent.getY() >= uv0Var.f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                uv0Var.dismiss();
                return true;
            case 23:
                k71 k71Var = (k71) this.b;
                if (motionEvent.getAction() != 0 || k71Var.h == 0 || motionEvent.getY() >= k71Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                k71Var.dismiss();
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
                j30 j30Var = (j30) this.b;
                j30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (j30Var.getMeasuredWidth() / 2.0f));
                j30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (j30Var.getMeasuredWidth() / 2.0f));
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i12 - i10) - dp2) / 2;
                int i17 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.ea) this.b).e.f(i16, i17, i16 + dp2, dp2 + i17);
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
                d30 d30Var = (d30) this.b;
                f0 f0Var = d30Var.b;
                int[] iArr = d30Var.G;
                f0Var.getLocationOnScreen(iArr);
                d30Var.N = iArr[0];
                d30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                sm0 sm0Var = (sm0) this.b;
                f0 f0Var2 = sm0Var.s;
                mw0 mw0Var = sm0Var.v;
                Drawable drawable = sm0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (sm0Var.x != null) {
                        float f10 = bounds.left;
                        float f11 = sm0Var.H;
                        float f12 = f10 + f11;
                        float f13 = bounds.right + f11;
                        float f14 = bounds.top;
                        float f15 = sm0Var.I;
                        float f16 = f14 + f15;
                        float f17 = bounds.bottom + f15;
                        boolean z12 = false;
                        if (sm0Var.L) {
                            f7 = 4.0f;
                            z11 = false;
                        } else {
                            if (f13 - r5.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                sm0Var.y.setPivotX(AndroidUtilities.dp(6.0f));
                                sm0Var.x.setX(Math.min(mw0Var.getWidth() - sm0Var.x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - mw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                sm0Var.y.setPivotX(r5.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                sm0Var.x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - sm0Var.x.getMeasuredWidth()) - mw0Var.getX());
                                z11 = true;
                            }
                            sm0Var.G = z11 ? ((sm0Var.x.getX() + sm0Var.x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13 : (sm0Var.x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                        }
                        float dp4 = f17 + (sm0Var.F != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (sm0Var.x.getMeasuredHeight() + dp4 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            sm0Var.y.setPivotY(r2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            sm0Var.x.setY(((f16 - AndroidUtilities.dp(f7)) - sm0Var.x.getMeasuredHeight()) - mw0Var.getY());
                            z12 = true;
                        } else {
                            sm0Var.y.setPivotY(AndroidUtilities.dp(6.0f));
                            sm0Var.x.setY(Math.min((f0Var2.getHeight() - sm0Var.x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp4) - mw0Var.getY());
                        }
                        b80 b80Var = sm0Var.w;
                        b80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        break;
                    }
                }
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                uv0.m((uv0) this.b);
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
                gl glVar = ((jl) this.b).F;
                if (glVar != null) {
                    glVar.a();
                    break;
                }
                break;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((((zu) this.b).J ? 22 : 0) + 84) + ((int) Math.min(r0.H / (r0.G / size), AndroidUtilities.displaySize.y / 2)) + 1, TLObject.FLAG_30));
                break;
            case 13:
                ny nyVar = (ny) this.b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((View) nyVar.F.getParent()) != null ? (int) (r0.getMeasuredHeight() - nyVar.F.getY()) : AndroidUtilities.dp(120.0f)) - nyVar.F.b1, TLObject.FLAG_30));
                break;
            case 14:
                nz nzVar = ((iz) this.b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (bi.z(8.0f, nzVar.D0.getMeasuredHeight() - nzVar.b1, 3) * 1.7f), TLObject.FLAG_30));
                break;
            case 19:
                uv0 uv0Var = (uv0) this.b;
                w0 w0Var = uv0Var.b;
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
                    uv0Var.h = true;
                    w0Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    uv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), TLObject.FLAG_30));
                break;
            case 22:
                jz0 jz0Var = (jz0) this.b;
                setPadding(jz0Var.n, jz0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), jz0Var.n, jz0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            case 29:
                rg.y0 y0Var = (rg.y0) this.b;
                z10 = ((org.telegram.ui.ActionBar.f3) y0Var).isPortrait;
                if (z10) {
                    y0Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
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
                sm0 sm0Var = (sm0) this.b;
                gh.d.c(sm0Var.h, sm0Var.s);
                ViewGroup viewGroup = sm0Var.y;
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
                return !((uv0) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 23:
                return !((k71) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 24:
                ((di1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 16:
                zl0 zl0Var = (zl0) this.b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(zl0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(zl0Var.getMeasuredHeight(), TLObject.FLAG_30));
                    layout(0, 0, zl0Var.d1.getMeasuredWidth(), zl0Var.d1.getMeasuredHeight());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 19:
                if (!((uv0) this.b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 21:
                if (!((ry0) this.b).g0) {
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
            case 2:
                ci.kc kcVar = (ci.kc) this.b;
                if (getTranslationY() != f7 && kcVar.c1 != null) {
                    super.setTranslationY(f7);
                    kcVar.c1.y();
                    break;
                }
                break;
            case 23:
                super.setTranslationY(f7);
                k71.m((k71) this.b);
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
                ((d30) this.b).d.setVisibility(i10);
                break;
            case 22:
                jz0 jz0Var = (jz0) this.b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (jz0Var.e != null) {
                        for (int i11 = 0; i11 < jz0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                iz0 iz0Var = (iz0) jz0Var.e.getChildAt(i11);
                                Drawable drawable = iz0Var.b;
                                if (drawable instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable).a(iz0Var);
                                }
                                iz0Var.c = true;
                            } else {
                                iz0 iz0Var2 = (iz0) jz0Var.e.getChildAt(i11);
                                Drawable drawable2 = iz0Var2.b;
                                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable2).o(iz0Var2);
                                }
                                iz0Var2.c = false;
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
        this.a = 26;
        this.b = o2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = 11;
        this.b = new to[2];
        int i10 = 0;
        while (true) {
            to[] toVarArr = (to[]) this.b;
            if (i10 < toVarArr.length) {
                toVarArr[i10] = new to(context, d6Var);
                addView(((to[]) this.b)[i10], w7.z5.e(-1, -1, 119));
                i10++;
            } else {
                toVarArr[0].setVisibility(0);
                ((to[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(qg.x1 x1Var, Context context) {
        super(context);
        this.a = 25;
        this.b = x1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, String str, d dVar) {
        super(context);
        this.a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.i6.j5;
        setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.l1(0.06f, dVar.H0(i10))));
        LinearLayout e7 = bi.e(context, 1);
        addView(e7, w7.z5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.b = p6Var;
        p6Var.b(0.6f, 450L, tr.h);
        p6Var.setTextSize(AndroidUtilities.dp(17.0f));
        p6Var.setTextColor(dVar.H0(i10));
        p6Var.setScaleProperty(0.7f);
        p6Var.setGravity(17);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setAllowCancel(true);
        e7.addView(p6Var, w7.z5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(dVar.H0(i10));
        textView.setGravity(17);
        e7.addView(textView, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(bw0 bw0Var, Context context) {
        super(context);
        this.a = 20;
        this.b = bw0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, j30 j30Var) {
        super(context);
        this.a = 6;
        this.b = j30Var;
    }
}
