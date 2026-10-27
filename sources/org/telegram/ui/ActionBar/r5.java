package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class r5 extends FrameLayout implements oe.d, NotificationCenter.NotificationCenterDelegate, p6 {
    public CharSequence E;
    public boolean F;
    public boolean G;
    public eh.d H;
    public eh.d I;
    public eh.d J;
    public float K;
    public ch.b L;
    public fh.e M;
    public Utilities.Callback0Return N;
    public z5 O;
    public y5 P;
    public final oe.b Q;
    public final oe.b R;
    public final oe.b S;
    public j T;
    public boolean U;
    public int V;
    public boolean W;
    public final u6 a;
    public boolean a0;
    public final o5 b;
    public int b0;
    public final q5 c;
    public int c0;
    public x5 d;
    public int d0;
    public x5 e;
    public int e0;
    public org.telegram.ui.Components.s6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.s6 h;
    public boolean h0;
    public boolean i0;
    public final RectF j0;
    public boolean k0;
    public float l0;
    public u5 n;
    public FrameLayout r;
    public fi.c2 s;
    public ImageView v;
    public TextView w;
    public y5 x;
    public CharSequence y;

    public r5(Context context, u6 u6Var) {
        super(context);
        this.K = -1.0f;
        ds dsVar = ds.h;
        this.Q = new oe.b(0, this, dsVar, 380L, false);
        this.R = new oe.b(1, this, dsVar, 380L, false);
        this.S = new oe.b(2, this, dsVar, 250L, false);
        this.U = true;
        this.j0 = new RectF();
        this.l0 = 1.0f;
        this.a = u6Var;
        setClipChildren(false);
        setWillNotDraw(false);
        s();
        q5 q5Var = new q5(this, context);
        this.c = q5Var;
        addView(q5Var, kb1.i(-1, -2, 51));
        o5 o5Var = new o5(this, context);
        this.b = o5Var;
        o5Var.setVisibility(8);
        o5Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        o5Var.setOnClickListener(new n5(this, 0));
        addView(o5Var, kb1.i(46, 46, 51));
    }

    public static /* synthetic */ void a(r5 r5Var, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            if (keyEvent == null) {
                return;
            }
            if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return;
            }
        }
        AndroidUtilities.hideKeyboard(r5Var.s);
        s0 searchListener = r5Var.getSearchListener();
        if (searchListener != null) {
            searchListener.k(r5Var.s);
        }
    }

    private int getRowTop() {
        if (this.U) {
            return AndroidUtilities.statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s0 getSearchListener() {
        y5 y5Var = this.x;
        if (y5Var != null) {
            return y5Var.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        return AndroidUtilities.dp(this.b.a != null ? 58.0f : 6.0f);
    }

    public static void u(View view, float f7) {
        view.setAlpha(f7);
        view.setVisibility(f7 > 0.0f ? 0 : 4);
    }

    public static void v(View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i10;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.rightMargin = i12;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 != 2) {
            c();
            return;
        }
        ImageView imageView = this.v;
        if (imageView != null) {
            imageView.setAlpha(f7);
            float f11 = (f7 * 0.5f) + 0.5f;
            this.v.setScaleX(f11);
            this.v.setScaleY(f11);
            this.v.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    public final void c() {
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f7 = 1.0f - actionModeFactor;
        float f10 = searchFactor * f7;
        float f11 = (1.0f - searchFactor) * f7;
        float f12 = this.l0 * f11;
        float lerp = AndroidUtilities.lerp(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        q5 q5Var = this.c;
        u(q5Var, f12);
        q5Var.setScaleX(lerp);
        q5Var.setScaleY(lerp);
        u5 u5Var = this.n;
        if (u5Var != null) {
            float visibleFactor = u5Var.getVisibleFactor() * f11;
            u(this.n, visibleFactor);
            float lerp2 = this.n.c == t5.a ? AndroidUtilities.lerp(0.6f, 1.0f, visibleFactor) : AndroidUtilities.lerp(0.8f, 1.0f, f11);
            this.n.setScaleX(lerp2);
            this.n.setScaleY(lerp2);
        }
        x5 x5Var = this.d;
        if (x5Var != null) {
            x5Var.setTranslationX(-l(false));
            u(this.d, f11);
            float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f11);
            this.d.setPivotX(r11.getWidth() - AndroidUtilities.dp(19.0f));
            this.d.setPivotY(r11.getHeight() / 2.0f);
            this.d.setScaleX(lerp3);
            this.d.setScaleY(lerp3);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!q(childAt) && childAt.getVisibility() != 8) {
                u(childAt, f11);
            }
        }
        x5 x5Var2 = this.e;
        if (x5Var2 != null) {
            u(x5Var2, actionModeFactor);
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(r5.getWidth() - AndroidUtilities.dp(19.0f));
            this.e.setPivotY(r5.getHeight() / 2.0f);
            this.e.setScaleX(lerp4);
            this.e.setScaleY(lerp4);
        }
        org.telegram.ui.Components.s6 s6Var = this.f;
        if (s6Var != null) {
            u(s6Var, actionModeFactor);
            this.f.setTranslationX((-AndroidUtilities.dp(16.0f)) * f7);
        }
        org.telegram.ui.Components.s6 s6Var2 = this.h;
        if (s6Var2 != null) {
            u(s6Var2, actionModeFactor);
            this.h.setTranslationX((-AndroidUtilities.dp(16.0f)) * f7);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            u(frameLayout, f10);
            RectF rectF = this.j0;
            g(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        o5 o5Var = this.b;
        if (o5Var.a != null) {
            o5Var.setVisibility(0);
            o5Var.setAlpha(1.0f);
            o5Var.setScaleX(1.0f);
            o5Var.setScaleY(1.0f);
        } else {
            o5Var.setVisibility(actionModeFactor <= 0.0f ? 8 : 0);
            o5Var.setAlpha(actionModeFactor);
            o5Var.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, actionModeFactor));
            o5Var.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, actionModeFactor));
        }
        o5Var.invalidate();
        invalidate();
    }

    public final void d() {
        TextView textView;
        if (this.s == null) {
            return;
        }
        s0 searchListener = getSearchListener();
        boolean z10 = this.s.length() > 0 || ((textView = this.w) != null && textView.getVisibility() == 0 && (searchListener == null || searchListener.m())) || (searchListener != null && searchListener.d());
        this.S.a(z10, p() && this.F);
        this.v.setEnabled(z10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            updateColors();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        u5 u5Var;
        this.W = this.a0;
        int dp = AndroidUtilities.dp(6.0f);
        if (this.H != null) {
            o5 o5Var = this.b;
            if (o5Var.getVisibility() == 0 && o5Var.getAlpha() > 0.0f) {
                float width = (o5Var.getWidth() / 2.0f) + o5Var.getX();
                float height = (o5Var.getHeight() / 2.0f) + o5Var.getY();
                float scaleX = o5Var.getScaleX() * (o5Var.getWidth() / 2.0f);
                float scaleY = o5Var.getScaleY() * (o5Var.getHeight() / 2.0f);
                this.H.setBounds(((int) (width - scaleX)) - dp, ((int) (height - scaleY)) - dp, ((int) (width + scaleX)) + dp, ((int) (height + scaleY)) + dp);
                this.H.setAlpha((int) (o5Var.getAlpha() * 255.0f));
                this.H.draw(canvas);
            }
        }
        if (this.J != null && (u5Var = this.n) != null && u5Var.c == t5.a && u5Var.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            float width2 = (this.n.getWidth() / 2.0f) + this.n.getX();
            float height2 = (this.n.getHeight() / 2.0f) + this.n.getY();
            float scaleX2 = this.n.getScaleX() * (this.n.getWidth() / 2.0f);
            float scaleY2 = this.n.getScaleY() * (this.n.getHeight() / 2.0f);
            this.J.setBounds(((int) (width2 - scaleX2)) - dp, ((int) (height2 - scaleY2)) - dp, ((int) (width2 + scaleX2)) + dp, ((int) (height2 + scaleY2)) + dp);
            this.J.setAlpha((int) (this.n.getAlpha() * 255.0f));
            this.J.draw(canvas);
        }
        if (this.I != null) {
            RectF rectF = this.j0;
            float g7 = g(rectF);
            y5 y5Var = this.P;
            boolean z10 = y5Var != null && y5Var.getParent() == this.d;
            if (g7 > 0.0f && rectF.width() > 0.0f && !z10) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.K) > 0.5f) {
                    this.K = height3;
                    this.I.x(height3);
                }
                this.I.setBounds(((int) rectF.left) - dp, ((int) rectF.top) - dp, ((int) rectF.right) + dp, ((int) rectF.bottom) + dp);
                this.I.setAlpha((int) (g7 * 255.0f));
                this.I.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y5 y5Var;
        if (view == this.d && (y5Var = this.P) != null && y5Var.getParent() == this.d) {
            return false;
        }
        if (view != this.r || getSearchFactor() >= 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        RectF rectF = this.j0;
        g(rectF);
        canvas.save();
        canvas.clipRect(rectF);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        s0 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.w.setVisibility(8);
            d();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void f(boolean z10) {
        if (this.F) {
            s0 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.F = false;
                this.s.clearFocus();
                if (z10) {
                    AndroidUtilities.hideKeyboard(this.s);
                }
                this.Q.a(false, p());
                c();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    public final float g(RectF rectF) {
        float f7;
        float f10;
        float f11;
        int dp = AndroidUtilities.dp(6.0f);
        float dp2 = AndroidUtilities.dp(23.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        x5 x5Var = this.d;
        float pillWidth = (x5Var == null || x5Var.getVisibility() == 8) ? 0.0f : this.d.getPillWidth();
        x5 x5Var2 = this.e;
        float pillWidth2 = x5Var2 != null ? x5Var2.getPillWidth() : 0.0f;
        if (pillWidth <= 0.0f) {
            f7 = actionModeFactor;
            pillWidth = pillWidth2;
        } else if (pillWidth2 <= 0.0f) {
            f7 = 1.0f - actionModeFactor;
        } else {
            pillWidth = AndroidUtilities.lerp(pillWidth, pillWidth2, actionModeFactor);
            f7 = 1.0f;
        }
        float f12 = (1.0f - actionModeFactor) * searchFactor;
        float f13 = dp2 * 2.0f;
        float f14 = pillWidth / f13;
        float lerp = AndroidUtilities.lerp(0.8f, 1.0f, f7) * Math.min(1.0f, f14);
        float width = (getWidth() - dp) - l(false);
        float max = width - Math.max(pillWidth, f13);
        float f15 = currentActionBarHeight - dp2;
        float f16 = currentActionBarHeight + dp2;
        if (lerp < 1.0f) {
            float f17 = (max + width) / 2.0f;
            float d = ic.a.d(1.0f, lerp, dp2, (width - max) / 2.0f);
            float f18 = f17 - d;
            width = f17 + d;
            float f19 = dp2 * lerp;
            float f20 = currentActionBarHeight - f19;
            f11 = currentActionBarHeight + f19;
            f10 = f20;
            max = f18;
        } else {
            f10 = f15;
            f11 = f16;
        }
        rectF.set(AndroidUtilities.lerp(max, getSearchPillLeft(), f12), AndroidUtilities.lerp(f10, f15, f12), AndroidUtilities.lerp(width, getWidth() - dp, f12), AndroidUtilities.lerp(f11, f16, f12));
        return AndroidUtilities.lerp(Math.min(1.0f, f14) * f7, 1.0f, f12);
    }

    public j getActionBarMenuOnItemClick() {
        return this.T;
    }

    public x5 getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.R.e;
    }

    public org.telegram.ui.Components.s6 getActionModeTitle() {
        h();
        return this.f;
    }

    public View getBackButton() {
        return this.b;
    }

    public Drawable getBackButtonDrawable() {
        return this.b.a;
    }

    public u5 getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.V;
    }

    public x5 getMenu() {
        return this.d;
    }

    public z5 getMenuOverlay() {
        Utilities.Callback0Return callback0Return = this.N;
        if (callback0Return != null) {
            return (z5) callback0Return.run();
        }
        return null;
    }

    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.U;
    }

    public z5 getOpenMenuOverlay() {
        return this.O;
    }

    public float getSearchFactor() {
        return this.Q.e;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.c.f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public b6 getSubtitleTextView() {
        return (b6) this.c.d;
    }

    public String getTitle() {
        b6 b6Var = ((b6[]) this.c.c)[0];
        CharSequence text = b6Var != null ? b6Var.getText() : null;
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        q5 q5Var = this.c;
        q5Var.b(0);
        return ((b6[]) q5Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public b6 getTitleTextView() {
        return ((b6[]) this.c.c)[0];
    }

    public b6 getTitleTextView2() {
        return ((b6[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.l0;
    }

    public final x5 h() {
        if (this.e == null) {
            x5 x5Var = new x5(getContext(), this, true);
            this.e = x5Var;
            View view = this.b;
            addView(x5Var, indexOfChild(view), kb1.i(-2, -2, 53));
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getContext(), true, true, true);
            this.f = s6Var;
            s6Var.setTextSize(AndroidUtilities.dp(18.0f));
            this.f.setTypeface(AndroidUtilities.bold());
            this.f.setTextColor(this.e0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, ds.h);
            addView(this.f, indexOfChild(view), kb1.i(-1, -2, 51));
            c();
        }
        return this.e;
    }

    public final u5 i(String str) {
        if (this.n == null) {
            u5 u5Var = new u5(getContext(), this, str);
            this.n = u5Var;
            addView(u5Var, indexOfChild(this.b), kb1.i(-2, 46, 53));
            c();
        }
        return this.n;
    }

    public final x5 j() {
        if (this.d == null) {
            x5 x5Var = new x5(getContext(), this, false);
            this.d = x5Var;
            addView(x5Var, indexOfChild(this.b), kb1.i(-2, -2, 53));
            c();
        }
        return this.d;
    }

    public final void k() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), kb1.i(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.r.addView(linearLayout, kb1.h(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTextSize(1, 17.0f);
        this.w.setSingleLine(true);
        this.w.setEllipsize(TextUtils.TruncateAt.END);
        this.w.setGravity(19);
        this.w.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        this.w.setVisibility(8);
        linearLayout.addView(this.w, kb1.r(-2, -1));
        fi.c2 c2Var = new fi.c2(this, context, 3);
        this.s = c2Var;
        c2Var.setTextSize(1, 17.0f);
        this.s.setSingleLine(true);
        this.s.setBackground(null);
        this.s.setPadding(0, 0, 0, 0);
        this.s.setGravity(19);
        fi.c2 c2Var2 = this.s;
        c2Var2.setInputType(c2Var2.getInputType() | TLObject.FLAG_19);
        this.s.setImeOptions(33554435);
        this.s.setTextIsSelectable(false);
        this.s.setCursorSize(AndroidUtilities.dp(20.0f));
        this.s.setCursorWidth(1.5f);
        CharSequence charSequence = this.y;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        int i10 = 1;
        this.s.setOnEditorActionListener(new a0(i10, this));
        this.s.addTextChangedListener(new j0(i10, this));
        linearLayout.addView(this.s, kb1.p(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.v.setImageResource(R.drawable.ic_close_white);
        this.v.setContentDescription(LocaleController.getString(R.string.ClearButton));
        this.v.setOnClickListener(new n5(this, 1));
        this.r.addView(this.v, kb1.h(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        y();
        d();
        E(2, this.S.e, 0.0f, null);
    }

    public final float l(boolean z10) {
        float actionModeFactor;
        u5 u5Var = this.n;
        if (u5Var == null) {
            return 0.0f;
        }
        if (u5Var.getVisibility() == 8 && z10) {
            return 0.0f;
        }
        if (z10) {
            actionModeFactor = this.n.getTargetVisibleFactor();
        } else {
            actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * this.n.getVisibleFactor();
        }
        return (AndroidUtilities.dp(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
    }

    public final boolean m(y5 y5Var, RectF rectF) {
        if (y5Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            g(rectF);
            return true;
        }
        float dp = AndroidUtilities.dp(23.0f);
        View view = (View) y5Var.getParent();
        float width = (y5Var.getWidth() / 2.0f) + y5Var.getX() + (view != null ? view.getX() : 0.0f);
        float currentActionBarHeight = (k.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - dp, currentActionBarHeight - dp, width + dp, currentActionBarHeight + dp);
        return false;
    }

    public final void n() {
        x5 x5Var = this.e;
        if (x5Var == null || !this.G) {
            return;
        }
        this.G = false;
        x5Var.f();
        this.R.a(false, p());
        c();
        this.b.b(false, p());
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
    }

    public final boolean o() {
        return this.e != null && this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a0 = true;
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a0 = false;
        this.W = false;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        super.onLayout(z10, i10, i11, i12, i13);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i17 = i12 - i10;
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (!q(childAt) && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.gravity, getLayoutDirection()) & 7;
                if (absoluteGravity == 5) {
                    i15 = i17 - measuredWidth;
                    i16 = layoutParams.rightMargin;
                } else if (absoluteGravity == 1) {
                    i15 = ((i17 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i16 = layoutParams.rightMargin;
                } else {
                    i14 = layoutParams.leftMargin;
                    int A = (ic.a.A(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                    childAt.layout(i14, A, measuredWidth + i14, measuredHeight + A);
                }
                i14 = i15 - i16;
                int A2 = (ic.a.A(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i14, A2, measuredWidth + i14, measuredHeight + A2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int rowTop = getRowTop();
        int currentActionBarHeight = k.getCurrentActionBarHeight();
        int i12 = rowTop + currentActionBarHeight + this.V;
        o5 o5Var = this.b;
        boolean z10 = o5Var.a != null;
        int dp = ((currentActionBarHeight - AndroidUtilities.dp(46.0f)) / 2) + rowTop;
        v(o5Var, AndroidUtilities.dp(6.0f), dp, 0);
        x5 x5Var = this.d;
        float targetPillWidth = (x5Var == null || x5Var.getVisibility() == 8) ? 0.0f : this.d.getTargetPillWidth();
        float l4 = l(true);
        int max = Math.max(z10 ? AndroidUtilities.dp(64.0f) : AndroidUtilities.dp(18.0f), (targetPillWidth > 0.0f || l4 > 0.0f) ? AndroidUtilities.dp(18.0f) + ((int) (targetPillWidth + l4)) : 0);
        q5 q5Var = this.c;
        if (q5Var.b != max) {
            q5Var.b = max;
            q5Var.requestLayout();
        }
        v(q5Var, 0, rowTop, 0);
        q5Var.getLayoutParams().height = currentActionBarHeight;
        x5 x5Var2 = this.d;
        if (x5Var2 != null) {
            v(x5Var2, 0, rowTop, AndroidUtilities.dp(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        x5 x5Var3 = this.e;
        if (x5Var3 != null) {
            v(x5Var3, 0, rowTop, AndroidUtilities.dp(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            x5 x5Var4 = this.e;
            int dp2 = AndroidUtilities.dp(18.0f) + ((int) (x5Var4 != null ? x5Var4.getTargetPillWidth() : 0.0f));
            org.telegram.ui.Components.s6 s6Var = this.h;
            if (s6Var == null || s6Var.getTag() == null) {
                v(this.f, AndroidUtilities.dp(66.0f), rowTop, dp2);
                this.f.getLayoutParams().height = currentActionBarHeight;
            } else {
                int i13 = (currentActionBarHeight / 2) + rowTop;
                v(this.f, AndroidUtilities.dp(66.0f), i13 - AndroidUtilities.dp(22.0f), dp2);
                this.f.getLayoutParams().height = AndroidUtilities.dp(22.0f);
                v(this.h, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(1.0f) + i13, dp2);
                this.h.getLayoutParams().height = AndroidUtilities.dp(18.0f);
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            v(frameLayout, (int) getSearchPillLeft(), dp, AndroidUtilities.dp(6.0f));
        }
        u5 u5Var = this.n;
        if (u5Var != null) {
            v(u5Var, 0, dp, AndroidUtilities.dp(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.k0;
    }

    public final boolean p() {
        return this.W && this.a0;
    }

    public final boolean q(View view) {
        return view == this.b || view == this.c || view == this.d || view == this.e || view == this.f || view == this.h || view == this.r || view == this.n;
    }

    public final boolean r(boolean z10, boolean z11) {
        s0 searchListener;
        boolean z12 = false;
        if (this.x == null || this.F || this.G || !((searchListener = getSearchListener()) == null || searchListener.c())) {
            return false;
        }
        k();
        this.F = true;
        x5 x5Var = this.d;
        if (x5Var != null) {
            x5Var.f();
        }
        fi.c2 c2Var = this.s;
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            charSequence = "";
        }
        c2Var.setText(charSequence);
        this.E = null;
        this.s.requestFocus();
        if (z10) {
            AndroidUtilities.showKeyboard(this.s);
        }
        if (z11 && p()) {
            z12 = true;
        }
        this.Q.a(true, z12);
        c();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public final void s() {
        boolean z10 = this.h0;
        u6 u6Var = this.a;
        if (!z10) {
            this.b0 = y6.w0(y6.G6, u6Var);
        }
        if (!this.i0) {
            this.c0 = y6.w0(y6.y6, u6Var);
        }
        int i10 = y6.G6;
        this.d0 = y6.w0(i10, u6Var);
        this.e0 = y6.w0(i10, u6Var);
        int i11 = y6.i6;
        this.f0 = y6.w0(i11, u6Var);
        this.g0 = y6.w0(i11, u6Var);
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.T = jVar;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        c();
        requestLayout();
    }

    public void setBackButtonImage(int i10) {
        setBackButtonDrawable(i10 != 0 ? getContext().getDrawable(i10).mutate() : null);
    }

    public void setBackButtonImageAnimated(int i10) {
        Drawable mutate = getContext().getDrawable(i10).mutate();
        o5 o5Var = this.b;
        Drawable drawable = o5Var.a;
        boolean z10 = drawable != null;
        oe.e eVar = o5Var.e;
        if (drawable == null || !o5Var.f.p()) {
            o5Var.c(mutate);
        } else {
            Drawable drawable2 = o5Var.a;
            o5Var.c(mutate);
            o5Var.b = drawable2;
            eVar.c(0.0f);
            eVar.a(1.0f);
        }
        if (z10) {
            return;
        }
        c();
        requestLayout();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.b.setEnabled(z10);
        x5 x5Var = this.d;
        if (x5Var != null) {
            x5Var.setEnabled(z10);
        }
        u5 u5Var = this.n;
        if (u5Var != null) {
            u5Var.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i10) {
        if (this.V != i10) {
            this.V = i10;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.k0 = z10;
    }

    public void setMenuOverlayProvider(Utilities.Callback0Return<z5> callback0Return) {
        this.N = callback0Return;
    }

    public void setOccupyStatusBar(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        k();
        this.w.setText(charSequence);
        this.w.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        d();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.y = charSequence;
        fi.c2 c2Var = this.s;
        if (c2Var != null) {
            c2Var.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        fi.c2 c2Var = this.s;
        if (c2Var == null) {
            this.E = charSequence;
            return;
        }
        c2Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.s.setSelection(charSequence.length());
    }

    public void setSearchItem(y5 y5Var) {
        if (y5Var == null && this.x != null && this.F) {
            f(true);
        }
        this.x = y5Var;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!p()) {
            setSubtitle(charSequence);
            return;
        }
        q5 q5Var = this.c;
        b6 b6Var = (b6) q5Var.d;
        if (b6Var == null || b6Var.getVisibility() == 8 || TextUtils.isEmpty(charSequence) || TextUtils.equals((CharSequence) q5Var.f, charSequence)) {
            if (TextUtils.equals((CharSequence) q5Var.f, charSequence)) {
                return;
            }
            q5Var.c(charSequence);
            return;
        }
        q5Var.f = charSequence;
        if (((b6) q5Var.e) == null) {
            q5Var.e = q5Var.a();
        }
        b6 b6Var2 = (b6) q5Var.d;
        b6 b6Var3 = (b6) q5Var.e;
        q5Var.d = b6Var3;
        q5Var.e = b6Var2;
        b6Var3.animate().cancel();
        ((b6) q5Var.d).l(charSequence, false);
        ((b6) q5Var.d).setVisibility(0);
        ((b6) q5Var.d).setAlpha(0.0f);
        ((b6) q5Var.d).setTranslationY(AndroidUtilities.dp(6.0f));
        ViewPropertyAnimator duration = ((b6) q5Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
        ds dsVar = ds.h;
        duration.setInterpolator(dsVar).start();
        b6Var2.animate().cancel();
        b6Var2.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(6.0f)).setDuration(380L).setInterpolator(dsVar).withEndAction(new p5(b6Var2, 0)).start();
        q5Var.requestLayout();
    }

    public void setSubtitleColor(int i10) {
        this.i0 = true;
        this.c0 = i10;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        q5 q5Var = this.c;
        q5Var.b(0);
        b6[] b6VarArr = (b6[]) q5Var.c;
        b6 b6Var = b6VarArr[1];
        if (b6Var != null) {
            b6Var.animate().cancel();
            b6VarArr[1].setVisibility(8);
        }
        b6VarArr[0].animate().cancel();
        b6VarArr[0].setAlpha(1.0f);
        b6VarArr[0].setTranslationY(0.0f);
        b6VarArr[0].k(charSequence);
        b6VarArr[0].setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
    }

    public void setTitleColor(int i10) {
        this.h0 = true;
        this.b0 = i10;
        this.c.d();
    }

    public void setTitlesAlpha(float f7) {
        if (this.l0 != f7) {
            this.l0 = f7;
            c();
        }
    }

    public final void t(int i10, boolean z10) {
        String formatNumber = LocaleController.formatNumber(i10, ' ');
        h();
        this.f.c(formatNumber, z10 && p() && this.G, true);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        s();
        this.c.d();
        this.b.d();
        x5 x5Var = this.d;
        if (x5Var != null) {
            x5Var.h();
        }
        x5 x5Var2 = this.e;
        if (x5Var2 != null) {
            x5Var2.h();
        }
        org.telegram.ui.Components.s6 s6Var = this.f;
        if (s6Var != null) {
            s6Var.setTextColor(this.e0);
        }
        u5 u5Var = this.n;
        if (u5Var != null) {
            u5Var.c();
        }
        org.telegram.ui.Components.s6 s6Var2 = this.h;
        if (s6Var2 != null) {
            s6Var2.setTextColor(this.c0);
        }
        if (this.s != null) {
            y();
        }
        eh.d dVar = this.H;
        if (dVar != null) {
            dVar.updateColors();
        }
        eh.d dVar2 = this.I;
        if (dVar2 != null) {
            dVar2.updateColors();
        }
        invalidate();
    }

    public final void w(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        if (!p()) {
            setTitle(charSequence);
            return;
        }
        q5 q5Var = this.c;
        q5Var.b(0);
        q5Var.b(1);
        b6[] b6VarArr = (b6[]) q5Var.c;
        b6 b6Var = b6VarArr[0];
        b6 b6Var2 = b6VarArr[1];
        b6VarArr[0] = b6Var2;
        b6VarArr[1] = b6Var;
        b6Var2.animate().cancel();
        b6Var2.k(charSequence);
        b6Var2.setVisibility(0);
        b6Var2.setAlpha(0.0f);
        int dp = AndroidUtilities.dp(16.0f);
        if (!z10) {
            dp = -dp;
        }
        b6Var2.setTranslationY(dp);
        b6Var2.animate().alpha(1.0f).translationY(0.0f).setDuration(j10).setInterpolator(interpolator).start();
        b6Var.animate().cancel();
        b6Var.animate().alpha(0.0f).translationY(z10 ? -AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f)).setDuration(j10).setInterpolator(interpolator).withEndAction(new p5(b6Var, 1)).start();
        q5Var.requestLayout();
    }

    public final void x() {
        if (this.e == null || this.G) {
            return;
        }
        this.G = true;
        x5 x5Var = this.d;
        if (x5Var != null) {
            x5Var.f();
        }
        fi.c2 c2Var = this.s;
        if (c2Var != null && this.F) {
            AndroidUtilities.hideKeyboard(c2Var);
        }
        this.R.a(true, p());
        c();
        this.b.b(true, p());
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
    }

    public final void y() {
        fi.c2 c2Var = this.s;
        int i10 = y6.G6;
        u6 u6Var = this.a;
        c2Var.setTextColor(y6.w0(i10, u6Var));
        this.w.setTextColor(y6.w0(i10, u6Var));
        this.s.setHintTextColor(y6.w0(y6.H6, u6Var));
        this.s.setCursorColor(y6.w0(i10, u6Var));
        this.s.setHighlightColor(y6.w0(y6.uf, u6Var));
        this.s.setHandlesColor(y6.w0(y6.vf, u6Var));
        this.v.setColorFilter(new PorterDuffColorFilter(y6.w0(y6.m6, u6Var), PorterDuff.Mode.SRC_IN));
        this.v.setBackground(y6.g0(this.f0, 1, -1));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
