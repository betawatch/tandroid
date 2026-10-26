package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class id1 extends Dialog {
    public final hh.b E;
    public final ch.b F;
    public MessageObject G;
    public boolean H;
    public gd1 I;
    public wv0 J;
    public org.telegram.ui.Cells.s1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.fl0 P;
    public ViewGroup Q;
    public float R;
    public ViewGroup S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final org.telegram.ui.ActionBar.u6 a;
    public boolean a0;
    public final fd1 b;
    public boolean b0;
    public final fd1 c;
    public qm c0;
    public final fd1 d;
    public ValueAnimator d0;
    public final fi.h1 e;
    public ValueAnimator e0;
    public final TextView f;
    public final org.telegram.ui.Components.lc0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint v;
    public Matrix w;
    public float x;
    public float y;

    public id1(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.a0 = false;
        this.a = u6Var;
        fd1 fd1Var = new fd1(this, activity, 0);
        this.b = fd1Var;
        fd1Var.setOnClickListener(new t21(this, 7));
        hh.b bVar = new hh.b();
        this.E = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.F = bVar2;
        bVar2.f = new jh.k(fd1Var);
        bVar2.g = fd1Var;
        fd1 fd1Var2 = new fd1(this, activity, 1);
        this.c = fd1Var2;
        fd1Var2.setClipToPadding(false);
        fd1Var.addView(fd1Var2, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        fi.h1 h1Var = new fi.h1(this, activity, 8);
        this.e = h1Var;
        h1Var.setAdapter(new bi.e5(this, activity, 4));
        fd1Var2.addView(h1Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        fd1 fd1Var3 = new fd1(this, activity, 2);
        this.d = fd1Var3;
        fd1Var2.addView(fd1Var3, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0(activity, u6Var);
        this.h = lc0Var;
        lc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        lc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        fd1Var2.addView(lc0Var, org.telegram.ui.Components.gb1.i(-1, 66, 80));
        lc0Var.setOnTabClick(new t3(h1Var, 24));
        eh.d c10 = bVar2.c(lc0Var, null, false);
        c10.v(gh.c.k(u6Var));
        c10.x.e = true;
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(16.0f));
        lc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(lc0Var.getColor());
        org.telegram.messenger.vh.k(R.string.TodoMenuHint, textView, 17);
        fd1Var2.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        uv0 uv0Var = new uv0(this, 5);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(fd1Var, uv0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.d60 d60Var) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.bd1
            public final /* synthetic */ id1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        id1 id1Var = this.b;
                        id1Var.x = floatValue;
                        id1Var.b.invalidate();
                        id1Var.c.invalidate();
                        id1Var.e();
                        break;
                    default:
                        id1 id1Var2 = this.b;
                        id1Var2.getClass();
                        id1Var2.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.d0.addListener(new ai.l0(this, z10, d60Var, 14));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        valueAnimator3.setInterpolator(dsVar);
        this.d0.setDuration(j10);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.bd1
            public final /* synthetic */ id1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        id1 id1Var = this.b;
                        id1Var.x = floatValue;
                        id1Var.b.invalidate();
                        id1Var.c.invalidate();
                        id1Var.e();
                        break;
                    default:
                        id1 id1Var2 = this.b;
                        id1Var2.getClass();
                        id1Var2.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new q40(11, this, z10));
        this.e0.setDuration((long) (j10 * 1.5f));
        this.e0.setInterpolator(dsVar);
        this.e0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.fl0 fl0Var;
        if (z10 && (fl0Var = this.P) != null && fl0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().q) {
            this.P.e();
            return;
        }
        if (this.a0) {
            return;
        }
        this.a0 = true;
        this.W = false;
        fi.h1 h1Var = this.e;
        h1Var.l();
        boolean z11 = h1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.s1 s1Var2 = this.K;
            if (s1Var2 != null) {
                s1Var2.setVisibility(4);
                this.K.invalidate();
            }
        } else if (!z10 && (s1Var = this.K) != null) {
            s1Var.setVisibility(0);
            org.telegram.ui.Cells.s1 s1Var3 = this.K;
            s1Var3.K7 = -1;
            s1Var3.invalidate();
        }
        this.b0 = !z10;
        d();
        b(false, new org.telegram.ui.Components.d60(18, this, z11));
        this.b.invalidate();
    }

    public final void d() {
        if (this.W) {
            return;
        }
        fd1 fd1Var = this.b;
        if (fd1Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.K;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.b bVar = this.n;
            this.U = i10 - bVar.a;
            float f7 = iArr[1] - bVar.b;
            this.V = f7;
            if (!this.Z) {
                this.Z = true;
                this.X = f7;
                if (this.S != null) {
                    float height = f7 + this.K.getHeight() + this.S.getHeight();
                    int height2 = fd1Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = fd1Var.getHeight();
                        i0.b bVar3 = this.n;
                        this.X = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                    }
                }
                int O2 = this.I.O2(this.O);
                this.I.H2(O2);
                float G2 = this.I.G2(O2);
                float f10 = this.V;
                this.Y = f10;
                float f11 = (int) G2;
                float f12 = f10 + f11;
                int height4 = fd1Var.getHeight();
                i0.b bVar4 = this.n;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.f;
                if (f12 > dp - textView.getHeight()) {
                    int height5 = fd1Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.Y = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.Q != null) {
                    float height6 = this.Y + f11 + r3.getHeight();
                    int height7 = fd1Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = fd1Var.getHeight();
                        i0.b bVar7 = this.n;
                        this.Y = (((((height8 - bVar7.b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.Q.getHeight();
                    }
                }
            }
            e();
        } else {
            this.V = 0.0f;
            this.U = 0.0f;
        }
        this.W = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        fi.h1 h1Var = this.e;
        float positionAnimated = h1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f7 = this.V;
                this.X = f7;
                float height = f7 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                fd1 fd1Var = this.b;
                int height2 = fd1Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = fd1Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.X = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.J.setTranslationX(AndroidUtilities.lerp(this.U, 0.0f, this.b0 ? 1.0f : this.x) + lerp2);
        this.J.setTranslationY(AndroidUtilities.lerp(this.V, this.X, this.b0 ? 1.0f : this.x));
        ViewGroup viewGroup2 = this.S;
        fd1 fd1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.S.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.J.B3() ? AndroidUtilities.dp(48.0f) : 0)) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = fd1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - fd1Var2.getTop());
            this.S.setAlpha(this.x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        this.I.setTranslationX(AndroidUtilities.lerp(this.U, 0.0f, this.b0 ? 1.0f : this.x) + lerp);
        this.I.setTranslationY(AndroidUtilities.lerp(this.V, this.Y, this.b0 ? 1.0f : this.x));
        if (this.Q != null) {
            int O2 = this.I.O2(this.O);
            this.I.H2(O2);
            float G2 = this.I.G2(O2);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((lerp + 0.0f) + this.I.getLeft())) - AndroidUtilities.dp(8.0f)) - this.Q.getLeft());
            } else {
                this.Q.setTranslationX((((lerp + 0.0f) + (this.I.B3() ? AndroidUtilities.dp(48.0f) : 0)) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = fd1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - fd1Var2.getTop());
            this.Q.setAlpha(this.x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.b0) {
            this.J.setAlpha(this.x);
            this.I.setAlpha(this.x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - fd1Var2.getTop()));
            this.P.setAlpha(this.x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.x);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.x);
        org.telegram.ui.Components.lc0 lc0Var = this.h;
        lc0Var.setSelectedTab(positionAnimated);
        lc0Var.setAlpha(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        fd1 fd1Var = this.b;
        setContentView(fd1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i10 | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        fd1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(fd1Var, !org.telegram.ui.ActionBar.y6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.hn0.d(new e5(this, 28));
            this.N = true;
            b(true, null);
        }
    }
}
