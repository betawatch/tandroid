package bh;

import a8.ee;
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
import fi.b6;
import fi.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.Components.zp;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.Wallet.x4;
import org.telegram.ui.bc;
import org.telegram.ui.e5;
import org.telegram.ui.f41;
import org.telegram.ui.f61;
import org.telegram.ui.ht;
import org.telegram.ui.i51;
import org.telegram.ui.j4;
import org.telegram.ui.j51;
import org.telegram.ui.k51;
import org.telegram.ui.o51;
import org.telegram.ui.oy0;
import org.telegram.ui.qt0;
import org.telegram.ui.r5;
import org.telegram.ui.r70;
import org.telegram.ui.us;
import org.telegram.ui.vc1;
import org.telegram.ui.y10;
import org.telegram.ui.y31;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
    }

    public void b(Canvas canvas) {
        me0 me0Var = (me0) this.c;
        Drawable drawable = me0Var.a;
        if (drawable == null) {
            super.onDraw(canvas);
        } else if ((drawable instanceof vc0) || (drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            me0Var.a.draw(canvas);
        } else {
            float max = Math.max(getMeasuredWidth() / me0Var.a.getIntrinsicWidth(), (getMeasuredHeight() + me0Var.G) / me0Var.a.getIntrinsicHeight());
            int ceil = (int) Math.ceil(me0Var.a.getIntrinsicWidth() * max);
            int ceil2 = (int) Math.ceil(me0Var.a.getIntrinsicHeight() * max);
            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
            int measuredHeight = ((getMeasuredHeight() - ceil2) + me0Var.G) / 2;
            me0Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
            me0Var.a.draw(canvas);
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
        u6 u6Var;
        float f7;
        org.telegram.ui.Cells.y yVar;
        int i10 = 2;
        switch (this.a) {
            case 7:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                int i11 = y6.a7;
                u6Var = ((r2) ((r5) this.c).d).resourceProvider;
                paint.setColor(y6.w0(i11, u6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 8:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i12 = y0Var.e;
                float x9 = y0Var.getX();
                float f10 = y0Var.d;
                u6 u6Var2 = y0Var.c;
                if (u6Var2 != null) {
                    u6Var2.b(x9, f10, measuredWidth, i12);
                } else {
                    y6.q(x9, f10, measuredWidth, i12);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint d = u6Var2 != null ? u6Var2.d("paintChatActionBackground") : null;
                if (d == null) {
                    d = y6.U0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, d);
                if (u6Var2 != null ? u6Var2.f() : y6.c1()) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    Paint d10 = u6Var2 != null ? u6Var2.d("paintChatActionBackgroundDarken") : null;
                    if (d10 == null) {
                        d10 = y6.U0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, d10);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(y6.w0(y6.a7, ((bc) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 10:
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
                y10 y10Var = (y10) this.c;
                y10Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                y10Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((zp) this.c).getThemedColor(y6.d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 12:
                fz fzVar = (fz) this.c;
                if (!fzVar.G.u0 && fzVar.w > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint4 = new Paint();
                        this.b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (fzVar.w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 14:
                Paint paint5 = (Paint) this.b;
                gl0 gl0Var = (gl0) this.c;
                int i13 = gl0Var.M0;
                paint5.setColor((i13 == 1 || i13 == 2 || i13 == 4) ? i0.a.o(-1, 30) : i0.a.f(0.7f, y6.w0(y6.F8, gl0Var.k0), y6.w0(y6.h5, gl0Var.k0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g7 = gl0Var.g();
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g7, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g7);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF3, measuredWidth3, measuredWidth3, paint5);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g7);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 20:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.c5 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX(), profileActivity.r.getY());
                    f7 = 0.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.c5.getMeasuredWidth(), profileActivity.c5.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.c5.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    f7 = 0.0f;
                }
                if (profileActivity.v5 && profileActivity.h6 != f7 && profileActivity.t5 != 1.0f) {
                    float measuredHeight2 = (profileActivity.r.getMeasuredHeight() / 2.0f) + profileActivity.r.getY();
                    float dp6 = AndroidUtilities.dp(22.0f);
                    float x10 = ((profileActivity.r.getX() + (AndroidUtilities.dp(28.0f) - profileActivity.u5)) - dp6) - profileActivity.h4();
                    profileActivity.x5.setImageCoords(x10, measuredHeight2 - (dp6 / 2.0f), dp6, dp6);
                    profileActivity.x5.setAlpha(profileActivity.h6);
                    canvas.save();
                    float f11 = profileActivity.h6;
                    canvas.scale(f11, f11, profileActivity.x5.getCenterX(), profileActivity.x5.getCenterY());
                    profileActivity.x5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.t5 != f7) {
                        ed edVar = (ed) this.b;
                        if (edVar != null && (yVar = edVar.e) != null) {
                            yVar.setState(StateSet.NOTHING);
                            yVar.jumpToCurrentState();
                            break;
                        }
                    } else {
                        if (((ed) this.b) == null) {
                            ed edVar2 = new ed(this);
                            this.b = edVar2;
                            edVar2.h = new oy0(this, i10);
                        }
                        float dp7 = (1.0f - profileActivity.t5) * AndroidUtilities.dp(28.0f);
                        float textWidth = profileActivity.r.getTextWidth();
                        float max = Math.max(textWidth, profileActivity.S != null ? (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.S.getVisibilityFactor() : f7) + dp7;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x10 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x10 + max + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        ed edVar3 = (ed) this.b;
                        edVar3.i = false;
                        edVar3.c = 0;
                        edVar3.a(rectF4);
                        ed edVar4 = (ed) this.b;
                        edVar4.n = true;
                        int o10 = i0.a.o(-1, 50);
                        edVar4.g.setColor(0);
                        org.telegram.ui.Cells.y yVar2 = edVar4.e;
                        if (yVar2 != null) {
                            y6.E1(yVar2, o10, true);
                        }
                        ed edVar5 = (ed) this.b;
                        edVar5.c(canvas, edVar5.g);
                        org.telegram.ui.Cells.y yVar3 = edVar5.e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            break;
                        }
                    }
                }
                break;
            case 24:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 27:
                super.dispatchDraw(canvas);
                ((m5) this.c).getClass();
                break;
            case 28:
                ag.h0 h0Var = (ag.h0) this.c;
                h0Var.b(y6.o1(0.65f, y6.w0(y6.d6, (u6) this.b)));
                h0Var.draw(canvas);
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
            case 1:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                i0 i0Var = (i0) this.c;
                if (!i0Var.k) {
                    return true;
                }
                i0Var.d();
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
                j4 j4Var = (j4) this.c;
                ea n10 = j4Var.Q0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (j4Var.Q0.x() && j4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !j4Var.Q0.x() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (j4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 15:
                int action = motionEvent.getAction();
                i1 i1Var = (i1) this.c;
                if (i1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(i1Var.J.getX(), i1Var.J.getY());
                    boolean dispatchTouchEvent = i1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        i1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = i1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                boolean z10 = !i1Var.F.isInProgress() && ((GestureDetector) i1Var.G.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    i1Var.H = false;
                    i1Var.I = false;
                    o1.j jVar = i1Var.S;
                    if (!jVar.f) {
                        float f7 = i1Var.Q;
                        jVar.b = f7;
                        jVar.c = true;
                        jVar.u.i = (i1Var.M / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        i1Var.S.h();
                    }
                    o1.j jVar2 = i1Var.T;
                    if (!jVar2.f) {
                        jVar2.b = i1Var.R;
                        jVar2.c = true;
                        jVar2.u.i = ee.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
                        i1Var.T.h();
                    }
                }
                return onTouchEvent || z10;
            case 28:
                super.dispatchTouchEvent(motionEvent);
                return true;
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
                b6 b6Var = (b6) this.c;
                if (b6Var.h == null || (!((z10 = b6Var.f) && view == b6Var.d) && (z10 || view != b6Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? b6Var.e : 1.0f - b6Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 17:
                if (view instanceof zd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 21:
                return view != ((SecretMediaViewer) this.b).w && super.drawChild(canvas, view, j10);
            case 22:
                Path path2 = (Path) this.b;
                f41 f41Var = (f41) this.c;
                RectF rectF = f41Var.R;
                if (view == f41Var.N || view == f41Var.x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(f41Var.T, 0.0f, f41Var.s), getWidth(), AndroidUtilities.lerp(f41Var.U, getHeight(), f41Var.s));
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                if (view != f41Var.P) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + f41Var.N.getX(), rectF.centerY() + f41Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(f41Var.T, 0.0f, f41Var.s), getWidth(), AndroidUtilities.lerp(f41Var.U, getHeight(), f41Var.s));
                canvas.translate(-f41Var.P.getX(), -f41Var.P.getY());
                canvas.translate(f41Var.N.getX() + rectF.left, f41Var.N.getY() + rectF.top);
                canvas.scale(rectF.width() / f41Var.P.getMeasuredWidth(), rectF.height() / f41Var.P.getMeasuredHeight(), f41Var.P.getX(), f41Var.P.getY());
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view != ((f61) this.c).h0 || !m0.b || !m0.f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i10 = 0; i10 < ((f61) this.c).h0.getChildCount(); i10++) {
                    View childAt = ((f61) this.c).h0.getChildAt(i10);
                    if (childAt instanceof o51) {
                        o51 o51Var = (o51) childAt;
                        if (o51Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (o51Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            ((Rect) this.b).set((int) (r2.centerX() - (o51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f))), (int) (((Rect) this.b).centerY() - (o51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f))), (int) ((o51Var.getAnimatedScale() * (((Rect) this.b).width() / 2.0f)) + ((Rect) this.b).centerX()), (int) ((o51Var.getAnimatedScale() * (((Rect) this.b).height() / 2.0f)) + ((Rect) this.b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.b);
                            canvas.scale(o51Var.getAnimatedScale(), o51Var.getAnimatedScale(), ((Rect) this.b).centerX(), ((Rect) this.b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof j51) || (childAt instanceof i51) || (childAt instanceof k51)) {
                        ((Rect) this.b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.b);
                        super.drawChild(canvas, view, j10);
                        canvas.restore();
                    }
                }
                return false;
            case 27:
                m5 m5Var = (m5) this.c;
                if (view != m5Var.s0 || !m5Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                int save = canvas.save();
                canvas.concat(m5Var.I);
                boolean drawChild4 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save);
                return drawChild4;
            case 29:
                Path path3 = (Path) this.b;
                sg.l0 l0Var = (sg.l0) this.c;
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
                i0 i0Var = (i0) this.c;
                float f7 = i0Var.u;
                float f10 = rect.bottom;
                if (f7 != f10 && i0Var.v) {
                    i0Var.u = f10;
                    p pVar = i0Var.c;
                    h0 h0Var = i0Var.a;
                    if (!i0Var.q) {
                        float f11 = i0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = i0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (h0Var.getMeasuredHeight() + f11 > (pVar.getMeasuredHeight() - i0Var.u) - f12) {
                            f11 = ((pVar.getMeasuredHeight() - i0Var.u) - h0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        h0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new z(i0Var, 1)).setInterpolator(ds.f).start();
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
                ((og.i) this.c).invalidate();
                break;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.q0 q0Var = ((vc1) this.c).u0;
                if (q0Var != null) {
                    q0Var.invalidate();
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
                ((o) this.b).c();
                break;
            case 1:
                super.onAttachedToWindow();
                qc.a(this, (c0) this.b);
                break;
            case 17:
                super.onAttachedToWindow();
                ht htVar = (ht) this.c;
                htVar.A.onAttachedToWindow();
                htVar.B.onAttachedToWindow();
                break;
            case 20:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).x5.onAttachedToWindow();
                break;
            case 21:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.onAttachedToWindow();
                break;
            case 24:
                super.onAttachedToWindow();
                ((ImageReceiver) this.b).onAttachedToWindow();
                break;
            case 27:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((x4) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 15:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                i1 i1Var = (i1) this.c;
                AndroidUtilities.setPreferredMaxRefreshRate(i1Var.b, i1Var.d, i1Var.c);
                i1Var.i(false);
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
                ((o) this.b).d();
                break;
            case 1:
                super.onDetachedFromWindow();
                qc.h(this);
                break;
            case 17:
                super.onDetachedFromWindow();
                ht htVar = (ht) this.c;
                htVar.A.onDetachedFromWindow();
                htVar.B.onDetachedFromWindow();
                break;
            case 20:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).x5.onDetachedFromWindow();
                break;
            case 21:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.onDetachedFromWindow();
                break;
            case 24:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.b).onDetachedFromWindow();
                break;
            case 27:
                getViewTreeObserver().removeOnPreDrawListener((x4) this.b);
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
            case 13:
                b(canvas);
                me0 me0Var = (me0) this.c;
                if (me0Var.J != null && me0Var.K != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    me0Var.J.eraseColor(0);
                    me0Var.K.save();
                    me0Var.K.scale(me0Var.J.getWidth() / getMeasuredWidth(), me0Var.J.getHeight() / getMeasuredHeight());
                    b(me0Var.K);
                    me0Var.K.restore();
                    me0Var.I.d();
                    break;
                }
                break;
            case 16:
                canvas.save();
                n2 n2Var = (n2) this.c;
                canvas.scale(n2Var.b.getScaleX(), n2Var.b.getScaleY(), n2Var.b.getPivotX() + n2Var.b.getLeft(), n2Var.b.getPivotY() + n2Var.b.getTop());
                Drawable drawable2 = (Drawable) this.b;
                drawable2.setBounds(n2Var.b.getLeft() - AndroidUtilities.dp(2.0f), n2Var.b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + n2Var.b.getRight(), AndroidUtilities.dp(2.0f) + n2Var.b.getBottom());
                drawable2.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 17:
                ht htVar = (ht) this.b;
                Paint paint = htVar.N;
                ImageReceiver imageReceiver = htVar.B;
                ColorDrawable colorDrawable = htVar.u;
                ImageReceiver imageReceiver2 = htVar.A;
                if (htVar.z != null && colorDrawable != null) {
                    if (htVar.K && htVar.v == null && htVar.w != null && !htVar.e0) {
                        htVar.e0 = true;
                        imageReceiver2.setVisible(false, false);
                        in0.d(new e5(htVar, 8));
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
                                        canvas.drawColor(y6.o1(htVar.M, y6.w0(y6.a7, htVar.c0)));
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
            case 21:
                SecretMediaViewer.b((SecretMediaViewer) this.b, canvas);
                break;
            case 25:
                int intrinsicHeight2 = y6.i3.getIntrinsicHeight();
                y6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                y6.i3.draw(canvas);
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((vc1) this.c).getThemedColor(y6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 26:
                int[] iArr = (int[]) this.b;
                vc1 vc1Var = (vc1) this.c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (vc1Var.t0.getTranslationY() != iArr[1]) {
                        vc1Var.t0.setTranslationY(-r0);
                        vc1Var.u0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < vc1Var.Q) {
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
        ed edVar;
        switch (this.a) {
            case 20:
                return (((ProfileActivity) this.c).t5 == 0.0f && (edVar = (ed) this.b) != null && edVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int B = wh.B(275.0f, i15, 2);
                r70 r70Var = (r70) this.c;
                FrameLayout frameLayout = r70Var.r;
                frameLayout.layout(0, B, frameLayout.getMeasuredWidth(), r70Var.r.getMeasuredHeight() + B);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + B;
                int measuredWidth = (getMeasuredWidth() - r70Var.e.getMeasuredWidth()) / 2;
                sa saVar = r70Var.e;
                saVar.layout(measuredWidth, dp, saVar.getMeasuredWidth() + measuredWidth, r70Var.e.getMeasuredHeight() + dp);
                a5.m mVar = r70Var.d;
                mVar.layout(0, 0, mVar.getMeasuredWidth(), r70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - r70Var.n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - r70Var.n.getMeasuredWidth()) / 2;
                ei.n nVar = r70Var.n;
                nVar.layout(measuredWidth2, measuredHeight, nVar.getMeasuredWidth() + measuredWidth2, r70Var.n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - r70Var.f.getMeasuredWidth()) / 2;
                TextView textView = r70Var.f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), r70Var.f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int dp3 = AndroidUtilities.dp(4) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                if (marginLayoutParams.topMargin != dp3) {
                    marginLayoutParams.topMargin = dp3;
                    frameLayout2.requestLayout();
                    break;
                }
                break;
            case 19:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + wh.B(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                break;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.c).h5();
                break;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    y31 y31Var = secretMediaViewer.n;
                    y31Var.layout(y31Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    v3 v3Var = secretMediaViewer.r;
                    v3Var.layout(v3Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    qt0 qt0Var = secretMediaViewer.a0;
                    qt0Var.layout(qt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.a0.getRight(), secretMediaViewer.a0.getMeasuredHeight() + currentActionBarHeight2);
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
                ig.e eVar = (ig.e) this.c;
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
            case 6:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, wh.D(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 21:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                qt0 qt0Var = secretMediaViewer.a0;
                if (qt0Var != null) {
                    qt0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.U.getVisibility() != 0 ? 0 : secretMediaViewer.U.getMeasuredHeight()), TLObject.FLAG_30));
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
            case 13:
                me0 me0Var = (me0) this.c;
                hh.b bVar = me0Var.H;
                super.onSizeChanged(i10, i11, i12, i13);
                if (i10 > 0 && i11 > 0) {
                    me0Var.J = Bitmap.createBitmap(54, Math.max(1, Math.round((i11 * 54) / i10)), Bitmap.Config.ARGB_8888);
                    me0Var.K = new Canvas(me0Var.J);
                    bVar.a(me0Var.J);
                    bVar.b(i10, i11);
                    break;
                }
                break;
            case 15:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 28:
                super.onSizeChanged(i10, i11, i12, i13);
                ag.h0 h0Var = (ag.h0) this.c;
                h0Var.setBounds(0, 0, i10, i11);
                h0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
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
        ed edVar;
        switch (this.a) {
            case 5:
                og.i iVar = (og.i) this.c;
                og.c cVar = iVar.r;
                boolean onTouchEvent = ((GestureDetector) ((jg.s0) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(cVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    if (!iVar.h) {
                        o1.k kVar = iVar.c.u;
                        if (((float) kVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f7 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f7 = -2.14748365E9f;
                        }
                        kVar.i = og.i.a(displayMetrics, f7);
                        iVar.d.u.i = og.i.b(getResources().getDisplayMetrics(), (float) iVar.d.u.i);
                        iVar.c.h();
                        iVar.d.h();
                    }
                    iVar.n = false;
                    iVar.f = false;
                    iVar.h = false;
                }
                return onTouchEvent;
            case 20:
                return (((ProfileActivity) this.c).t5 == 0.0f && (edVar = (ed) this.b) != null && edVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (secretMediaViewer.m0 == 0 && secretMediaViewer.J0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.L0.onTouchEvent(motionEvent) && secretMediaViewer.b1) {
                        secretMediaViewer.b1 = false;
                        secretMediaViewer.a1 = false;
                        secretMediaViewer.Z0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.f1 = false;
                        vn0 vn0Var = secretMediaViewer.g1;
                        if (!vn0Var.q) {
                            vn0Var.a();
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
                                secretMediaViewer.w0 = wh.w(secretMediaViewer.y0, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                float height = secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2);
                                float height2 = (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0;
                                float f11 = secretMediaViewer.y0;
                                secretMediaViewer.x0 = wh.w(f11, secretMediaViewer.O0, height2, height);
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
                                    float x9 = secretMediaViewer.T0 - motionEvent.getX();
                                    float y10 = secretMediaViewer.U0 - motionEvent.getY();
                                    if (secretMediaViewer.a1 || ((secretMediaViewer.y0 == 1.0f && Math.abs(y10) + AndroidUtilities.dp(12.0f) < Math.abs(x9)) || secretMediaViewer.y0 != 1.0f)) {
                                        if (!secretMediaViewer.a1) {
                                            secretMediaViewer.a1 = true;
                                            secretMediaViewer.d1 = false;
                                            x9 = 0.0f;
                                            y10 = 0.0f;
                                        }
                                        secretMediaViewer.T0 = motionEvent.getX();
                                        secretMediaViewer.U0 = motionEvent.getY();
                                        secretMediaViewer.n(secretMediaViewer.y0);
                                        float f12 = secretMediaViewer.w0;
                                        if (f12 < secretMediaViewer.V0 || f12 > secretMediaViewer.W0) {
                                            x9 /= 3.0f;
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
                                                secretMediaViewer.w0 = f12 - x9;
                                                if (secretMediaViewer.y0 != 1.0f) {
                                                    secretMediaViewer.x0 -= f10;
                                                }
                                                secretMediaViewer.e.invalidate();
                                            }
                                        }
                                        float f16 = secretMediaViewer.x0;
                                        if (f16 < secretMediaViewer.X0 || f16 > f13) {
                                            f10 = y10 / 3.0f;
                                            secretMediaViewer.w0 = f12 - x9;
                                            if (secretMediaViewer.y0 != 1.0f) {
                                            }
                                            secretMediaViewer.e.invalidate();
                                        }
                                        f10 = y10;
                                        secretMediaViewer.w0 = f12 - x9;
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
                                    float w10 = wh.w(3.0f, secretMediaViewer.O0, (secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2)) - secretMediaViewer.R0, secretMediaViewer.P0 - (secretMediaViewer.e.getWidth() / 2));
                                    float w11 = wh.w(3.0f, secretMediaViewer.O0, (secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2)) - secretMediaViewer.S0, secretMediaViewer.Q0 - (secretMediaViewer.e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f18 = secretMediaViewer.V0;
                                    if (w10 >= f18) {
                                        f18 = secretMediaViewer.W0;
                                        break;
                                    }
                                    w10 = f18;
                                    float f19 = secretMediaViewer.X0;
                                    if (w11 >= f19) {
                                        f19 = secretMediaViewer.Y0;
                                        break;
                                    }
                                    w11 = f19;
                                    secretMediaViewer.c(3.0f, w10, w11, true);
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
            case 13:
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
                ((og.i) this.c).invalidate();
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
                ((og.i) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, u6 u6Var) {
        super(context);
        this.a = 28;
        this.c = new ag.h0(8);
        this.b = u6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = y0Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(i0 i0Var, Context context) {
        super(context);
        this.a = 1;
        this.c = i0Var;
        this.b = new c0(this, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bc bcVar, Context context) {
        super(context);
        this.a = 9;
        this.c = bcVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f41 f41Var, Context context) {
        super(context);
        this.a = 22;
        this.c = f41Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r5 r5Var, Activity activity) {
        super(activity);
        this.a = 7;
        this.c = r5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, Context context) {
        super(context);
        this.a = 0;
        this.c = uVar;
        this.b = new o(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(i1 i1Var, Context context) {
        super(context);
        this.a = 15;
        this.c = i1Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(me0 me0Var, Context context) {
        super(context);
        this.a = 13;
        this.c = me0Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m5 m5Var, Context context) {
        super(context);
        this.a = 27;
        this.c = m5Var;
        this.b = new x4(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = 19;
        this.b = textView;
        this.c = textView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = 21;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f61 f61Var, Context context) {
        super(context);
        this.a = 23;
        this.c = f61Var;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zp zpVar, Context context) {
        super(context);
        this.a = 11;
        this.c = zpVar;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ht htVar, Activity activity) {
        super(activity);
        this.a = 17;
        this.c = htVar;
        this.b = htVar;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(vc1 vc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 26:
                this.c = vc1Var;
                super(context);
                this.b = new int[2];
                break;
            default:
                this.c = vc1Var;
                this.b = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 10:
                super(context);
                this.b = new Path();
                this.c = new y10();
                break;
            case 24:
                super(context);
                break;
            default:
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, kb1.h(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, kb1.h(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                break;
        }
    }

    private final void a(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(sg.l0 l0Var, Context context) {
        super(context);
        this.a = 29;
        this.c = l0Var;
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gl0 gl0Var, Context context) {
        super(context);
        this.a = 14;
        this.c = gl0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b6 b6Var, Context context) {
        super(context);
        this.a = 3;
        this.c = b6Var;
        this.b = new Path();
    }
}
