package ah;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.c6;
import ei.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.ac;
import org.telegram.ui.b41;
import org.telegram.ui.b61;
import org.telegram.ui.e51;
import org.telegram.ui.f5;
import org.telegram.ui.f51;
import org.telegram.ui.g51;
import org.telegram.ui.ht;
import org.telegram.ui.k4;
import org.telegram.ui.k51;
import org.telegram.ui.kt0;
import org.telegram.ui.my0;
import org.telegram.ui.n70;
import org.telegram.ui.qc1;
import org.telegram.ui.s5;
import org.telegram.ui.u31;
import org.telegram.ui.us;
import org.telegram.ui.w10;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    public void b(Canvas canvas) {
        pe0 pe0Var = (pe0) this.c;
        Drawable drawable = pe0Var.a;
        if (drawable == null) {
            super.onDraw(canvas);
        } else if ((drawable instanceof yc0) || (drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            pe0Var.a.draw(canvas);
        } else {
            float max = Math.max(getMeasuredWidth() / pe0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + pe0Var.G) / pe0Var.a.getIntrinsicHeight());
            int ceil = (int) Math.ceil(pe0Var.a.getIntrinsicWidth() * max);
            int ceil2 = (int) Math.ceil(pe0Var.a.getIntrinsicHeight() * max);
            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
            int measuredHeight = ((getMeasuredHeight() - ceil2) + pe0Var.G) / 2;
            pe0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
            pe0Var.a.draw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
    }

    public void c(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        g6 g6Var;
        n5[] n5VarArr;
        float f7;
        org.telegram.ui.Cells.y yVar;
        int i10 = 1;
        switch (this.a) {
            case 6:
                zf.y yVar2 = (zf.y) this.c;
                yVar2.b(k6.o1(0.65f, k6.w0(k6.d6, (g6) this.b)));
                yVar2.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 8:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i11 = k6.a7;
                g6Var = ((o2) ((s5) this.c).d).resourceProvider;
                paint.setColor(k6.w0(i11, g6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 9:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i12 = y0Var.e;
                float x10 = y0Var.getX();
                float f10 = y0Var.d;
                g6 g6Var2 = y0Var.c;
                if (g6Var2 != null) {
                    g6Var2.b(x10, f10, measuredWidth, i12);
                } else {
                    k6.q(x10, f10, measuredWidth, i12);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint d = g6Var2 != null ? g6Var2.d("paintChatActionBackground") : null;
                if (d == null) {
                    d = k6.U0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, d);
                if (g6Var2 != null ? g6Var2.f() : k6.c1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint d10 = g6Var2 != null ? g6Var2.d("paintChatActionBackgroundDarken") : null;
                    if (d10 == null) {
                        d10 = k6.U0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, d10);
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(k6.w0(k6.a7, ((ac) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 11:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                w10 w10Var = (w10) this.c;
                w10Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                w10Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((wp) this.c).getThemedColor(k6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 13:
                gz gzVar = (gz) this.c;
                if (!gzVar.G.u0 && gzVar.w > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (gzVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 15:
                Paint paint5 = (Paint) this.b;
                gl0 gl0Var = (gl0) this.c;
                int i13 = gl0Var.M0;
                paint5.setColor((i13 == 1 || i13 == 2 || i13 == 4) ? i0.a.o(-1, 30) : i0.a.f(0.7f, k6.w0(k6.F8, gl0Var.k0), k6.w0(k6.h5, gl0Var.k0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = gl0Var.g();
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g10, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g10);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF3, measuredWidth3, measuredWidth3, paint5);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g10);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 21:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                n5[] n5VarArr2 = profileActivity.r;
                if (profileActivity.Y4 != null) {
                    canvas.save();
                    canvas.translate(n5VarArr2[0].getX(), n5VarArr2[0].getY());
                    n5VarArr = n5VarArr2;
                    f7 = 0.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.Y4.getMeasuredWidth(), profileActivity.Y4.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.Y4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    n5VarArr = n5VarArr2;
                    f7 = 0.0f;
                }
                if (profileActivity.r5 && profileActivity.c6 != f7 && profileActivity.p5 != 1.0f) {
                    float measuredHeight2 = (n5VarArr[1].getMeasuredHeight() / 2.0f) + n5VarArr[1].getY();
                    float dp6 = AndroidUtilities.dp(22.0f);
                    float x11 = ((n5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.q5)) - dp6) - profileActivity.b4();
                    profileActivity.t5.setImageCoords(x11, measuredHeight2 - (dp6 / 2.0f), dp6, dp6);
                    profileActivity.t5.setAlpha(profileActivity.c6);
                    canvas.save();
                    float f11 = profileActivity.c6;
                    canvas.scale(f11, f11, profileActivity.t5.getCenterX(), profileActivity.t5.getCenterY());
                    profileActivity.t5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.p5 != f7) {
                        fd fdVar = (fd) this.b;
                        if (fdVar != null && (yVar = fdVar.e) != null) {
                            yVar.setState(StateSet.NOTHING);
                            yVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((fd) this.b) == null) {
                            fd fdVar2 = new fd(this);
                            this.b = fdVar2;
                            fdVar2.h = new my0(this, i10);
                        }
                        float dp7 = (1.0f - profileActivity.p5) * AndroidUtilities.dp(28.0f);
                        float textWidth = n5VarArr[2].getTextWidth();
                        float max = Math.max(textWidth, profileActivity.T != null ? (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor() : f7) + dp7;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x11 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        fd fdVar3 = (fd) this.b;
                        fdVar3.i = false;
                        fdVar3.c = 0;
                        fdVar3.a(rectF4);
                        fd fdVar4 = (fd) this.b;
                        fdVar4.n = true;
                        int o10 = i0.a.o(-1, 50);
                        fdVar4.g.setColor(0);
                        org.telegram.ui.Cells.y yVar3 = fdVar4.e;
                        if (yVar3 != null) {
                            k6.E1(yVar3, o10, true);
                        }
                        fd fdVar5 = (fd) this.b;
                        fdVar5.c(canvas, fdVar5.g);
                        org.telegram.ui.Cells.y yVar4 = fdVar5.e;
                        if (yVar4 != null) {
                            yVar4.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 25:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 28:
                super.dispatchDraw(canvas);
                ((o5) this.c).getClass();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 1:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                t0 t0Var = (t0) this.c;
                if (!t0Var.k) {
                    return true;
                }
                t0Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z10) {
        switch (this.a) {
            case 1:
                break;
            default:
                super.dispatchSetPressed(z10);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 7:
                k4 k4Var = (k4) this.c;
                aa n10 = k4Var.Q0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (k4Var.Q0.x() && k4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !k4Var.Q0.x() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (k4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 16:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.c;
                if (h1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(h1Var.J.getX(), h1Var.J.getY());
                    boolean dispatchTouchEvent = h1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        h1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = h1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z10 = !h1Var.F.isInProgress() && ((GestureDetector) h1Var.G.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    h1Var.H = false;
                    h1Var.I = false;
                    o1.k kVar = h1Var.S;
                    if (!kVar.f) {
                        float f7 = h1Var.Q;
                        kVar.b = f7;
                        kVar.c = true;
                        kVar.u.i = (h1Var.M / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        h1Var.S.h();
                    }
                    o1.k kVar2 = h1Var.T;
                    if (!kVar2.f) {
                        kVar2.b = h1Var.R;
                        kVar2.c = true;
                        kVar2.u.i = w7.r.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                        h1Var.T.h();
                    }
                }
                return onTouchEvent || z10;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 3:
                Path path = (Path) this.b;
                c6 c6Var = (c6) this.c;
                if (c6Var.h == null || (!((z10 = c6Var.f) && view == c6Var.d) && (z10 || view != c6Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? c6Var.e : 1.0f - c6Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 18:
                if (view instanceof ce0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 22:
                return view != ((SecretMediaViewer) this.b).w && super.drawChild(canvas, view, j10);
            case 23:
                Path path2 = (Path) this.b;
                b41 b41Var = (b41) this.c;
                RectF rectF = b41Var.R;
                if (view == b41Var.N || view == b41Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(b41Var.T, 0.0f, b41Var.s), getWidth(), AndroidUtilities.lerp(b41Var.U, getHeight(), b41Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != b41Var.P) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + b41Var.N.getX(), rectF.centerY() + b41Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(b41Var.T, 0.0f, b41Var.s), getWidth(), AndroidUtilities.lerp(b41Var.U, getHeight(), b41Var.s));
                canvas.translate(-b41Var.P.getX(), -b41Var.P.getY());
                canvas.translate(b41Var.N.getX() + rectF.left, b41Var.N.getY() + rectF.top);
                canvas.scale(rectF.width() / b41Var.P.getMeasuredWidth(), rectF.height() / b41Var.P.getMeasuredHeight(), b41Var.P.getX(), b41Var.P.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 24:
                if (view != ((b61) this.c).h0 || !x0.b || !x0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i10 = 0; i10 < ((b61) this.c).h0.getChildCount(); i10++) {
                    View childAt = ((b61) this.c).h0.getChildAt(i10);
                    if (childAt instanceof k51) {
                        k51 k51Var = (k51) childAt;
                        if (k51Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (k51Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (k51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (k51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((k51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((k51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(k51Var.getAnimatedScale(), k51Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof f51) || (childAt instanceof e51) || (childAt instanceof g51)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j10);
                        canvas.restore();
                    }
                }
                return false;
            case 28:
                o5 o5Var = (o5) this.c;
                if (view != o5Var.r0 || !o5Var.E) {
                    return super.drawChild(canvas, view, j10);
                }
                int save = canvas.save();
                canvas.concat(o5Var.H);
                boolean drawChild4 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save);
                return drawChild4;
            case 29:
                Path path3 = (Path) this.b;
                rg.l0 l0Var = (rg.l0) this.c;
                if (l0Var.h == null || (!((z11 = l0Var.f) && view == l0Var.d) && (z11 || view != l0Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth2 = ((z11 ? l0Var.e : 1.0f - l0Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path3.rewind();
                path3.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth2, Path.Direction.CW);
                canvas.clipPath(path3);
                boolean drawChild5 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild5;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 1:
                t0 t0Var = (t0) this.c;
                float f7 = t0Var.u;
                float f10 = rect.bottom;
                if (f7 != f10 && t0Var.v) {
                    t0Var.u = f10;
                    v vVar = t0Var.c;
                    s0 s0Var = t0Var.a;
                    if (!t0Var.q) {
                        float f11 = t0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = t0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (s0Var.getMeasuredHeight() + f11 > (vVar.getMeasuredHeight() - t0Var.u) - f12) {
                            f11 = ((vVar.getMeasuredHeight() - t0Var.u) - s0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        s0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new j0(t0Var, 1)).setInterpolator(bs.f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 5:
                super.invalidate();
                ((ng.i) this.c).invalidate();
                break;
            case 27:
                super.invalidate();
                org.telegram.ui.ActionBar.p0 p0Var = ((qc1) this.c).u0;
                if (p0Var != null) {
                    p0Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                ((u) this.b).c();
                break;
            case 1:
                super.onAttachedToWindow();
                qc.a(this, (m0) this.b);
                break;
            case 18:
                super.onAttachedToWindow();
                ht htVar = (ht) this.c;
                htVar.A.onAttachedToWindow();
                htVar.B.onAttachedToWindow();
                break;
            case 21:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).t5.onAttachedToWindow();
                break;
            case 22:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.onAttachedToWindow();
                break;
            case 25:
                super.onAttachedToWindow();
                ((ImageReceiver) this.b).onAttachedToWindow();
                break;
            case 28:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((z4) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 16:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.c;
                AndroidUtilities.setPreferredMaxRefreshRate(h1Var.b, h1Var.d, h1Var.c);
                h1Var.i(false);
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                ((u) this.b).d();
                break;
            case 1:
                super.onDetachedFromWindow();
                qc.h(this);
                break;
            case 18:
                super.onDetachedFromWindow();
                ht htVar = (ht) this.c;
                htVar.A.onDetachedFromWindow();
                htVar.B.onDetachedFromWindow();
                break;
            case 21:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).t5.onDetachedFromWindow();
                break;
            case 22:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.onDetachedFromWindow();
                break;
            case 25:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.b).onDetachedFromWindow();
                break;
            case 28:
                getViewTreeObserver().removeOnPreDrawListener((z4) this.b);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int min;
        Drawable drawable;
        float f7;
        switch (this.a) {
            case 14:
                b(canvas);
                pe0 pe0Var = (pe0) this.c;
                if (pe0Var.J != null && pe0Var.K != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    pe0Var.J.eraseColor(0);
                    pe0Var.K.save();
                    pe0Var.K.scale(pe0Var.J.getWidth() / getMeasuredWidth(), pe0Var.J.getHeight() / getMeasuredHeight());
                    b(pe0Var.K);
                    pe0Var.K.restore();
                    pe0Var.I.d();
                    break;
                }
                break;
            case 17:
                canvas.save();
                k2 k2Var = (k2) this.c;
                canvas.scale(k2Var.b.getScaleX(), k2Var.b.getScaleY(), k2Var.b.getPivotX() + k2Var.b.getLeft(), k2Var.b.getPivotY() + k2Var.b.getTop());
                Drawable drawable2 = (Drawable) this.b;
                drawable2.setBounds(k2Var.b.getLeft() - AndroidUtilities.dp(2.0f), k2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + k2Var.b.getRight(), AndroidUtilities.dp(2.0f) + k2Var.b.getBottom());
                drawable2.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 18:
                ht htVar = (ht) this.b;
                Paint paint = htVar.N;
                ImageReceiver imageReceiver = htVar.B;
                ColorDrawable colorDrawable = htVar.u;
                ImageReceiver imageReceiver2 = htVar.A;
                if (htVar.z != null && colorDrawable != null) {
                    if (htVar.K && htVar.v == null && htVar.w != null && !htVar.e0) {
                        htVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        cn0.d(new f5(htVar, 8));
                    }
                    if (htVar.v != null) {
                        boolean z10 = htVar.K;
                        if (z10) {
                            float f10 = htVar.M;
                            if (f10 != 1.0f) {
                                float f11 = f10 + 0.13333334f;
                                htVar.M = f11;
                                if (f11 > 1.0f) {
                                    htVar.M = 1.0f;
                                }
                                htVar.z.invalidate();
                                f7 = htVar.M;
                                if (f7 != 0.0f && htVar.v != null) {
                                    paint.setAlpha((int) (f7 * 255.0f));
                                    if (paint.getAlpha() != 255) {
                                        canvas.drawColor(k6.o1(htVar.M, k6.w0(k6.a7, htVar.c0)));
                                    }
                                    canvas.drawPaint(paint);
                                }
                            }
                        }
                        if (!z10) {
                            float f12 = htVar.M;
                            if (f12 != 0.0f) {
                                float f13 = f12 - 0.13333334f;
                                htVar.M = f13;
                                if (f13 < 0.0f) {
                                    htVar.M = 0.0f;
                                }
                                htVar.z.invalidate();
                            }
                        }
                        f7 = htVar.M;
                        if (f7 != 0.0f) {
                            paint.setAlpha((int) (f7 * 255.0f));
                            if (paint.getAlpha() != 255) {
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (htVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, htVar.z.getWidth(), htVar.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.b bVar = htVar.q;
                    int i10 = bVar.d;
                    int i11 = bVar.b;
                    int i12 = i10 + i11;
                    if (htVar.V == 1) {
                        min = Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i12) - AndroidUtilities.dp(40.0f);
                    } else {
                        min = (int) (htVar.S ? Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i12) - AndroidUtilities.dpf2(40.0f) : Math.min(htVar.z.getWidth(), htVar.z.getHeight() - i12) / 1.8f);
                    }
                    float max = Math.max((min / 2) + i11 + (htVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((htVar.z.getHeight() - i12) - htVar.I) / 2);
                    if (htVar.S) {
                        max += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(htVar.z.getWidth() / 2, htVar.e + max);
                    int i13 = (int) (min * ((htVar.F * 0.8f) / 0.8f));
                    if (htVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (htVar.S) {
                        float f14 = i13;
                        float f15 = 0.6669f * f14;
                        imageReceiver2.setAlpha(htVar.F);
                        float f16 = f14 - f15;
                        float f17 = f14 / 2.0f;
                        imageReceiver2.setImageCoords((f16 - f17) - (0.0546875f * f14), (f16 / 2.0f) - f17, f15, f15);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(htVar.F);
                        float f18 = (-i13) / 2.0f;
                        imageReceiver.setImageCoords(f18, f18, f14, f14);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(htVar.F);
                        float f19 = (-i13) / 2.0f;
                        float f20 = i13;
                        imageReceiver2.setImageCoords(f19, f19, f20, f20);
                        imageReceiver2.draw(canvas);
                    }
                    if (htVar.C != null) {
                        canvas.save();
                        float f21 = (-i13) / 2.0f;
                        canvas.translate(f21, f21);
                        float f22 = i13;
                        canvas.scale(f22 / htVar.C.getWidth(), f22 / htVar.C.getHeight());
                        htVar.C.setAlpha(htVar.F);
                        if (htVar.D == null) {
                            htVar.D = new Path();
                        }
                        htVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, htVar.C.getWidth(), htVar.C.getHeight());
                        float f23 = f22 / 8.0f;
                        htVar.D.addRoundRect(rectF, f23, f23, Path.Direction.CW);
                        canvas.clipPath(htVar.D);
                        htVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (htVar.V == 1 && !htVar.m && (drawable = htVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = htVar.J.getIntrinsicHeight();
                        int dp = (int) (imageReceiver2.getDrawRegion().top - AndroidUtilities.dp(((htVar.d / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                        htVar.J.setAlpha((int) ((1.0f - htVar.g) * 255.0f));
                        htVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
                        htVar.J.draw(canvas);
                    }
                    if (htVar.G != null) {
                        if (htVar.S) {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        } else {
                            canvas.translate((-r3.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        }
                        ht.f0.setAlpha((int) (htVar.F * 255.0f));
                        htVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (htVar.E) {
                        if (htVar.F != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j10 = currentTimeMillis - htVar.H;
                            htVar.H = currentTimeMillis;
                            htVar.F = (j10 / 120.0f) + htVar.F;
                            htVar.z.invalidate();
                            if (htVar.F > 1.0f) {
                                htVar.F = 1.0f;
                                break;
                            }
                        }
                    } else if (htVar.F != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j11 = currentTimeMillis2 - htVar.H;
                        htVar.H = currentTimeMillis2;
                        htVar.F -= j11 / 120.0f;
                        htVar.z.invalidate();
                        if (htVar.F < 0.0f) {
                            htVar.F = 0.0f;
                        }
                        if (htVar.F == 0.0f) {
                            imageReceiver2.setImageBitmap((Drawable) null);
                            AndroidUtilities.unlockOrientation(htVar.w);
                            AndroidUtilities.runOnUIThread(new us(htVar, 1));
                            Bitmap bitmap = htVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                htVar.v = null;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(htVar.O, false, 1.0f, false);
                            htVar.M = 0.0f;
                            try {
                                if (htVar.y.getParent() != null) {
                                    ((WindowManager) htVar.w.getSystemService("window")).removeView(htVar.y);
                                    break;
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    }
                }
                break;
            case 22:
                SecretMediaViewer.b((SecretMediaViewer) this.b, canvas);
                break;
            case 26:
                int intrinsicHeight2 = k6.i3.getIntrinsicHeight();
                k6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                k6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((qc1) this.c).getThemedColor(k6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 27:
                int[] iArr = (int[]) this.b;
                qc1 qc1Var = (qc1) this.c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (qc1Var.t0.getTranslationY() != iArr[1]) {
                        qc1Var.t0.setTranslationY(-r0);
                        qc1Var.u0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < qc1Var.Q) {
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fd fdVar;
        switch (this.a) {
            case 21:
                return (((ProfileActivity) this.c).p5 == 0.0f && (fdVar = (fd) this.b) != null && fdVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int A = sl.A(275.0f, i15, 2);
                n70 n70Var = (n70) this.c;
                FrameLayout frameLayout = n70Var.r;
                frameLayout.layout(0, A, frameLayout.getMeasuredWidth(), n70Var.r.getMeasuredHeight() + A);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + A;
                int measuredWidth = (getMeasuredWidth() - n70Var.e.getMeasuredWidth()) / 2;
                sa saVar = n70Var.e;
                saVar.layout(measuredWidth, dp, saVar.getMeasuredWidth() + measuredWidth, n70Var.e.getMeasuredHeight() + dp);
                z4.h hVar = n70Var.d;
                hVar.layout(0, 0, hVar.getMeasuredWidth(), n70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - n70Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - n70Var.n.getMeasuredWidth()) / 2;
                di.n nVar = n70Var.n;
                nVar.layout(measuredWidth2, measuredHeight, nVar.getMeasuredWidth() + measuredWidth2, n70Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - n70Var.f.getMeasuredWidth()) / 2;
                TextView textView = n70Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), n70Var.f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int dp3 = AndroidUtilities.dp(4) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                if (marginLayoutParams.topMargin != dp3) {
                    marginLayoutParams.topMargin = dp3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 20:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + sl.A(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                break;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.c).Z4();
                break;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    u31 u31Var = secretMediaViewer.n;
                    u31Var.layout(u31Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    x3 x3Var = secretMediaViewer.r;
                    x3Var.layout(x3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    kt0 kt0Var = secretMediaViewer.a0;
                    kt0Var.layout(kt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.a0.getRight(), secretMediaViewer.a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i16 = i13 - i11;
                    view.layout(0, i16, i12 - i10, AndroidUtilities.navigationBarHeight + i16);
                    break;
                }
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
        int i13;
        float f7;
        float f10;
        float f11;
        StaticLayout staticLayout;
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(8.0f);
                TextView textView = (TextView) this.c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f12 = size;
                    if (measureText > f12) {
                        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                f10 = f12;
                                f11 = 12.0f;
                                i12 = 2;
                                z10 = true;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            } else if (textPaint.measureText(split[i14]) > f12) {
                                staticLayout = null;
                                f10 = f12;
                                f11 = 12.0f;
                                i12 = 2;
                                z10 = true;
                            } else {
                                i14++;
                            }
                        }
                        if (staticLayout == null || staticLayout.getLineCount() > i12) {
                            f7 = Math.max(8.0f, (f10 * f11) / measureText);
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i12;
                            f7 = 11.0f;
                        }
                    } else {
                        i12 = 2;
                        z10 = true;
                        i13 = 1;
                        f7 = 12.0f;
                    }
                    textView.setTextSize(z10 ? 1 : 0, f7);
                    textView.setMaxLines(i13);
                    textView.setSingleLine(i13 == z10 ? z10 ? 1 : 0 : false);
                    textView.setLineSpacing(0.0f, i13 == i12 ? 0.85f : 1.0f);
                    if (i13 == i12) {
                        z10 = false;
                    }
                    textView.setIncludeFontPadding(z10);
                    layoutParams.topMargin = AndroidUtilities.dp(i13 == i12 ? 29.0f : 35.0f);
                    ((FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams()).topMargin = AndroidUtilities.dp(i13 == i12 ? 4.0f : 8.0f);
                }
                super.onMeasure(i10, i11);
                break;
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.b;
                hg.e eVar = (hg.e) this.c;
                if (!eVar.K || !eVar.J) {
                    int size2 = View.MeasureSpec.getSize(i11);
                    if (size2 == 0) {
                        size2 = viewGroup.getMeasuredHeight();
                    }
                    if (size2 == 0) {
                        size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    }
                    int dp = AndroidUtilities.dp(50.0f);
                    int dp2 = eVar.v != 0 ? 0 : AndroidUtilities.dp(30.0f) + dp;
                    if (!eVar.E && !eVar.w) {
                        dp2 += dp;
                    }
                    int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp2 < paddingTop ? paddingTop - dp2 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            case 7:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, sl.C(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 12:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                kt0 kt0Var = secretMediaViewer.a0;
                if (kt0Var != null) {
                    kt0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.U.getVisibility() != 0 ? 0 : secretMediaViewer.U.getMeasuredHeight()), TLObject.FLAG_30));
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 6:
                super.onSizeChanged(i10, i11, i12, i13);
                zf.y yVar = (zf.y) this.c;
                yVar.setBounds(0, 0, i10, i11);
                yVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                break;
            case 14:
                pe0 pe0Var = (pe0) this.c;
                gh.b bVar = pe0Var.H;
                super.onSizeChanged(i10, i11, i12, i13);
                if (i10 > 0 && i11 > 0) {
                    pe0Var.J = Bitmap.createBitmap(54, Math.max(1, Math.round((i11 * 54) / i10)), Bitmap.Config.ARGB_8888);
                    pe0Var.K = new Canvas(pe0Var.J);
                    bVar.a(pe0Var.J);
                    bVar.c(i10, i11);
                    break;
                }
                break;
            case 16:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x028f, code lost:
    
        if (r1 > r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0280, code lost:
    
        if (r14 > r4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f5, code lost:
    
        if (r4 > r5) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e4, code lost:
    
        if (r4 > r5) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f7;
        fd fdVar;
        switch (this.a) {
            case 5:
                ng.i iVar = (ng.i) this.c;
                ng.c cVar = iVar.r;
                boolean onTouchEvent = ((GestureDetector) ((le.b) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(cVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    if (!iVar.h) {
                        o1.l lVar = iVar.c.u;
                        if (((float) lVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f7 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f7 = -2.14748365E9f;
                        }
                        lVar.i = ng.i.a(displayMetrics, f7);
                        iVar.d.u.i = ng.i.b(getResources().getDisplayMetrics(), (float) iVar.d.u.i);
                        iVar.c.h();
                        iVar.d.h();
                    }
                    iVar.n = false;
                    iVar.f = false;
                    iVar.h = false;
                }
                return onTouchEvent;
            case 21:
                return (((ProfileActivity) this.c).p5 == 0.0f && (fdVar = (fd) this.b) != null && fdVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.m0 == 0 && secretMediaViewer.J0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.L0.onTouchEvent(motionEvent) && secretMediaViewer.b1) {
                        secretMediaViewer.b1 = false;
                        secretMediaViewer.a1 = false;
                        secretMediaViewer.Z0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.f1 = false;
                        pn0 pn0Var = secretMediaViewer.g1;
                        if (!pn0Var.q) {
                            pn0Var.a();
                        }
                        if (!secretMediaViewer.p0) {
                            if (motionEvent.getPointerCount() == 2) {
                                secretMediaViewer.N0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                secretMediaViewer.O0 = secretMediaViewer.y0;
                                secretMediaViewer.P0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                secretMediaViewer.Q0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                secretMediaViewer.R0 = secretMediaViewer.w0;
                                secretMediaViewer.S0 = secretMediaViewer.x0;
                                secretMediaViewer.Z0 = true;
                                secretMediaViewer.a1 = false;
                            } else if (motionEvent.getPointerCount() == 1) {
                                secretMediaViewer.T0 = motionEvent.getX();
                                float y3 = motionEvent.getY();
                                secretMediaViewer.U0 = y3;
                                secretMediaViewer.q0 = y3;
                                secretMediaViewer.p0 = false;
                                secretMediaViewer.d1 = true;
                            }
                        }
                    } else {
                        float f10 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.p0 && secretMediaViewer.Z0) {
                                secretMediaViewer.f1 = true;
                                secretMediaViewer.y0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.N0) * secretMediaViewer.O0;
                                secretMediaViewer.w0 = sl.x(secretMediaViewer.y0, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0;
                                float f11 = secretMediaViewer.y0;
                                secretMediaViewer.x0 = sl.x(f11, secretMediaViewer.O0, height2, height);
                                secretMediaViewer.n(f11);
                                secretMediaViewer.e.invalidate();
                            } else if (motionEvent.getPointerCount() == 1) {
                                float abs = Math.abs(motionEvent.getX() - secretMediaViewer.T0);
                                float abs2 = Math.abs(motionEvent.getY() - secretMediaViewer.q0);
                                if (abs > AndroidUtilities.dp(3.0f) || abs2 > AndroidUtilities.dp(3.0f)) {
                                    secretMediaViewer.f1 = true;
                                }
                                if (secretMediaViewer.d1 && !secretMediaViewer.p0 && secretMediaViewer.y0 == 1.0f && abs2 >= AndroidUtilities.dp(30.0f) && abs2 / 2.0f > abs) {
                                    secretMediaViewer.p0 = true;
                                    secretMediaViewer.a1 = false;
                                    secretMediaViewer.q0 = motionEvent.getY();
                                    if (secretMediaViewer.k0) {
                                        secretMediaViewer.m(false, true);
                                    }
                                } else if (secretMediaViewer.p0) {
                                    secretMediaViewer.x0 = motionEvent.getY() - secretMediaViewer.q0;
                                    secretMediaViewer.e.invalidate();
                                } else if (secretMediaViewer.c1 || secretMediaViewer.J0 != 0) {
                                    secretMediaViewer.c1 = false;
                                    secretMediaViewer.T0 = motionEvent.getX();
                                    secretMediaViewer.U0 = motionEvent.getY();
                                } else {
                                    float x10 = secretMediaViewer.T0 - motionEvent.getX();
                                    float y10 = secretMediaViewer.U0 - motionEvent.getY();
                                    if (secretMediaViewer.a1 || ((secretMediaViewer.y0 == 1.0f && Math.abs(y10) + AndroidUtilities.dp(12.0f) < Math.abs(x10)) || secretMediaViewer.y0 != 1.0f)) {
                                        if (!secretMediaViewer.a1) {
                                            secretMediaViewer.a1 = true;
                                            secretMediaViewer.d1 = false;
                                            x10 = 0.0f;
                                            y10 = 0.0f;
                                        }
                                        secretMediaViewer.T0 = motionEvent.getX();
                                        secretMediaViewer.U0 = motionEvent.getY();
                                        secretMediaViewer.n(secretMediaViewer.y0);
                                        float f12 = secretMediaViewer.w0;
                                        if (f12 < secretMediaViewer.V0 || f12 > secretMediaViewer.W0) {
                                            x10 /= 3.0f;
                                        }
                                        float f13 = secretMediaViewer.Y0;
                                        if (f13 == 0.0f) {
                                            float f14 = secretMediaViewer.X0;
                                            if (f14 == 0.0f) {
                                                float f15 = secretMediaViewer.x0 - y10;
                                                if (f15 < f14) {
                                                    secretMediaViewer.x0 = f14;
                                                } else {
                                                    if (f15 > f13) {
                                                        secretMediaViewer.x0 = f13;
                                                    }
                                                    f10 = y10;
                                                }
                                                secretMediaViewer.w0 = f12 - x10;
                                                if (secretMediaViewer.y0 != 1.0f) {
                                                    secretMediaViewer.x0 -= f10;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f16 = secretMediaViewer.x0;
                                        if (f16 < secretMediaViewer.X0 || f16 > f13) {
                                            f10 = y10 / 3.0f;
                                            secretMediaViewer.w0 = f12 - x10;
                                            if (secretMediaViewer.y0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f10 = y10;
                                        secretMediaViewer.w0 = f12 - x10;
                                        if (secretMediaViewer.y0 != 1.0f) {
                                        }
                                        secretMediaViewer.e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.Z0) {
                                secretMediaViewer.c1 = true;
                                float f17 = secretMediaViewer.y0;
                                if (f17 < 1.0f) {
                                    secretMediaViewer.n(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f17 > 3.0f) {
                                    float x11 = sl.x(3.0f, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                    float x12 = sl.x(3.0f, secretMediaViewer.O0, (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0, secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f18 = secretMediaViewer.V0;
                                    if (x11 >= f18) {
                                        f18 = secretMediaViewer.W0;
                                        break;
                                    }
                                    x11 = f18;
                                    float f19 = secretMediaViewer.X0;
                                    if (x12 >= f19) {
                                        f19 = secretMediaViewer.Y0;
                                        break;
                                    }
                                    x12 = f19;
                                    secretMediaViewer.c(3.0f, x11, x12, true);
                                } else {
                                    secretMediaViewer.d(true);
                                }
                                secretMediaViewer.Z0 = false;
                            } else if (secretMediaViewer.p0) {
                                if (Math.abs(secretMediaViewer.q0 - motionEvent.getY()) > secretMediaViewer.e.getHeight() / 6.0f) {
                                    secretMediaViewer.e(true, false);
                                } else {
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, false);
                                }
                                secretMediaViewer.p0 = false;
                            } else if (secretMediaViewer.a1) {
                                float f20 = secretMediaViewer.w0;
                                float f21 = secretMediaViewer.x0;
                                secretMediaViewer.n(secretMediaViewer.y0);
                                secretMediaViewer.a1 = false;
                                secretMediaViewer.d1 = true;
                                float f22 = secretMediaViewer.w0;
                                float f23 = secretMediaViewer.V0;
                                if (f22 >= f23) {
                                    f23 = secretMediaViewer.W0;
                                    break;
                                }
                                f20 = f23;
                                float f24 = secretMediaViewer.x0;
                                float f25 = secretMediaViewer.X0;
                                if (f24 >= f25) {
                                    f25 = secretMediaViewer.Y0;
                                    break;
                                }
                                f21 = f25;
                                secretMediaViewer.c(secretMediaViewer.y0, f20, f21, false);
                            }
                        }
                    }
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        switch (this.a) {
            case 14:
                ((Paint) this.b).setColor(i10);
                break;
            default:
                super.setBackgroundColor(i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        switch (this.a) {
            case 5:
                super.setTranslationX(f7);
                ((ng.i) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 5:
                super.setTranslationY(f7);
                ((ng.i) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, g6 g6Var) {
        super(context);
        this.a = 6;
        this.c = new zf.y(8);
        this.b = g6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.a = 9;
        this.c = y0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t0 t0Var, Context context) {
        super(context);
        this.a = 1;
        this.c = t0Var;
        this.b = new m0(this, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b41 b41Var, Context context) {
        super(context);
        this.a = 23;
        this.c = b41Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ac acVar, Context context) {
        super(context);
        this.a = 10;
        this.c = acVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s5 s5Var, Activity activity) {
        super(activity);
        this.a = 8;
        this.c = s5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, Context context) {
        super(context);
        this.a = 0;
        this.c = a0Var;
        this.b = new u(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.Components.voip.h1 h1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = h1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(pe0 pe0Var, Context context) {
        super(context);
        this.a = 14;
        this.c = pe0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o5 o5Var, Context context) {
        super(context);
        this.a = 28;
        this.c = o5Var;
        this.b = new z4(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 20;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 22;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    private final void a(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b61 b61Var, Context context) {
        super(context);
        this.a = 24;
        this.c = b61Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(wp wpVar, Context context) {
        super(context);
        this.a = 12;
        this.c = wpVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ht htVar, Activity activity) {
        super(activity);
        this.a = 18;
        this.c = htVar;
        this.b = htVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qc1 qc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 27:
                this.c = qc1Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = qc1Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 11:
                super(context);
                this.b = new Path();
                this.c = new w10();
                break;
            case 25:
                super(context);
                break;
            default:
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, z5.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, z5.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(rg.l0 l0Var, Context context) {
        super(context);
        this.a = 29;
        this.c = l0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gl0 gl0Var, Context context) {
        super(context);
        this.a = 15;
        this.c = gl0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c6 c6Var, Context context) {
        super(context);
        this.a = 3;
        this.c = c6Var;
        this.b = new Path();
    }
}
