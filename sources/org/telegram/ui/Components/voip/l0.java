package org.telegram.ui.Components.voip;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import i7.f6;
import java.util.ArrayList;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.f30;
import org.telegram.ui.j30;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class l0 extends FrameLayout {
    public u A;
    public float A0;
    public final RecyclerView B;
    public float B0;
    public final f30 C;
    public boolean C0;
    public final ArrayList D;
    public boolean D0;
    public final g0 E;
    public float E0;
    public final h9 F;
    public ValueAnimator F0;
    public final TextView G;
    public final UndoView[] G0;
    public boolean H;
    public boolean H0;
    public long I;
    public boolean I0;
    public float J;
    public ValueAnimator J0;
    public float K;
    public long K0;
    public float L;
    public m6 L0;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final GradientDrawable T;
    public final GradientDrawable U;
    public final gr V;
    public final TextView W;
    public final int a;
    public final TextView a0;
    public boolean b;
    public final f0 b0;
    public float c;
    public boolean c0;
    public long d;
    public final rk0 d0;
    public ChatObject.VideoParticipant e;
    public ChatObject.Call e0;
    public boolean f;
    public final r50 f0;
    public final d0 g0;
    public long h;
    public final e0 h0;
    public final View i0;
    public final View j0;
    public float k0;
    public float l0;
    public float m0;
    public float n;
    public float n0;
    public float o0;
    public boolean p0;
    public float q0;
    public ValueAnimator r;
    public float r0;
    public boolean s;
    public int s0;
    public int t0;
    public float u0;
    public final ImageView v;
    public boolean v0;
    public final LongSparseIntArray w;
    public boolean w0;
    public final AnimationNotificationsLocker x;
    public ValueAnimator x0;
    public u y;
    public long y0;
    public boolean z0;

    public l0(Context context, RecyclerView recyclerView, f30 f30Var, ArrayList arrayList, ChatObject.Call call, r50 r50Var) {
        super(context);
        this.w = new LongSparseIntArray();
        this.x = new AnimationNotificationsLocker();
        this.K = 1.0f;
        this.R = true;
        final j30 j30Var = (j30) this;
        this.d0 = new rk0(j30Var, 6);
        this.u0 = 1.0f;
        this.G0 = new UndoView[2];
        this.B = recyclerView;
        this.C = f30Var;
        this.D = arrayList;
        this.e0 = call;
        this.f0 = r50Var;
        d0 d0Var = new d0(context);
        this.g0 = d0Var;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.a(-1);
        d0Var.setImageDrawable(h2Var);
        d0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        d0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        d0Var.setBackground(g6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.i0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.T = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, f6.c(120.0f, -1));
        View view2 = new View(context);
        this.j0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.U = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((call == null || !h()) ? 8 : 0);
        addView(view2, f6.e(160, -1, 5));
        addView(d0Var, f6.e(56, -1, 51));
        final int i10 = 0;
        d0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        j30Var.M0.onBackPressed();
                        break;
                    default:
                        j30 j30Var2 = j30Var;
                        if (j30Var2.b) {
                            boolean z10 = !j30Var2.f;
                            j30Var2.f = z10;
                            j30Var2.V.a(z10, true);
                            j30Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        e0 e0Var = new e0(j30Var, context);
        this.h0 = e0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k9 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = g6.i0(dp, dp, dp, dp, 0, k9, k9);
        f0 f0Var = new f0(j30Var, context, i02);
        this.b0 = f0Var;
        final int i11 = 1;
        f0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        j30Var.M0.onBackPressed();
                        break;
                    default:
                        j30 j30Var2 = j30Var;
                        if (j30Var2.b) {
                            boolean z10 = !j30Var2.f;
                            j30Var2.f = z10;
                            j30Var2.V.a(z10, true);
                            j30Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        i02.setCallback(f0Var);
        addView(f0Var);
        gr grVar = new gr(context, R.drawable.msg_pin_filled, -1);
        this.V = grVar;
        float f9 = -AndroidUtilities.dp(1.0f);
        float dp2 = AndroidUtilities.dp(2.0f);
        float dp3 = AndroidUtilities.dp(1.0f);
        grVar.i = f9;
        grVar.j = dp2;
        grVar.k = dp3;
        grVar.invalidateSelf();
        e0Var.setImageDrawable(grVar);
        e0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(e0Var, f6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.W = textView;
        x3.t(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.a0 = textView2;
        x3.t(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, f6.e(-2, -2, 51));
        addView(textView2, f6.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp4 = AndroidUtilities.dp(4.0f);
        imageView.setPadding(dp4, dp4, dp4, dp4);
        imageView.setBackground(g6.f0(i0.a.k(-1, 55), 1, -1));
        imageView.setOnClickListener(new fi0(11, j30Var, r50Var));
        addView(imageView, f6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g0 g0Var = new g0(j30Var, context, g6.b0(AndroidUtilities.dp(18.0f), i0.a.k(g6.w0(null, g6.tg, false), 204)));
        this.E = g0Var;
        h9 h9Var = new h9(context, true);
        this.F = h9Var;
        h9Var.setStyle(10);
        g0Var.setClipChildren(false);
        g0Var.setClipToPadding(false);
        g0Var.addView(h9Var, f6.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        g0Var.addView(textView3, f6.e(-2, -2, 16));
        addView(g0Var, f6.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i12 = 0; i12 < 2; i12++) {
            this.G0[i12] = new h0(j30Var, context);
            this.G0[i12].setHideAnimationType(2);
            this.G0[i12].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.G0[i12], f6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.b0.setVisibility(8);
        setIsTablet(r50.C3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            r50 r50Var = ((j30) this).M0;
            if (r50Var.W1 != null) {
                r50Var.v3.a(!r1.R, true);
            }
            rk0 rk0Var = this.d0;
            if (!z10 || !this.b) {
                this.c0 = false;
                AndroidUtilities.cancelRunOnUIThread(rk0Var);
            } else if (!this.c0) {
                this.c0 = true;
                AndroidUtilities.runOnUIThread(rk0Var, 3000L);
            }
            u uVar = this.y;
            if (uVar != null) {
                uVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        int i10 = 0;
        if (this.C0) {
            this.C0 = false;
            float f9 = this.E0;
            float[] fArr = new float[2];
            if (z10) {
                fArr[0] = f9;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f9;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.F0 = ofFloat;
            ofFloat.addUpdateListener(new w(this, i10));
            this.F0.addListener(new c0(this, 0));
            ValueAnimator valueAnimator = this.F0;
            jr jrVar = jr.f;
            valueAnimator.setInterpolator(jrVar);
            this.F0.setDuration(z10 ? 350L : 200L);
            this.F0.setInterpolator(jrVar);
            u uVar = this.y;
            if (uVar != null) {
                p pVar = uVar.a;
                ValueAnimator valueAnimator2 = this.F0;
                if (pVar.A) {
                    pVar.C.add(valueAnimator2);
                } else {
                    valueAnimator2.start();
                }
            } else {
                this.F0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.D0 = false;
    }

    public final boolean c() {
        return (this.f || System.currentTimeMillis() - this.h <= 2000 || this.C0 || this.p0) ? false : true;
    }

    public final void d() {
        u uVar = this.y;
        if (uVar != null) {
            if (uVar.k0 || uVar.l0 != 0.0f) {
                uVar.k0 = false;
                uVar.l0 = 0.0f;
                uVar.a.invalidate();
                uVar.invalidate();
            }
            this.y.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0462 A[LOOP:1: B:84:0x0462->B:92:0x04b1, LOOP_START, PHI: r9
      0x0462: PHI (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:83:0x0460, B:92:0x04b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04b4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0457  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        u uVar;
        f30 f30Var;
        u uVar2;
        u uVar3;
        UndoView[] undoViewArr;
        if (r50.C3) {
            this.O = true;
            super.dispatchDraw(canvas);
            this.O = false;
        }
        this.P = true;
        super.dispatchDraw(canvas);
        this.P = false;
        if (this.A != null || this.y != null) {
            RecyclerView recyclerView = this.B;
            float y8 = recyclerView.getY() - getTop();
            float measuredHeight = (recyclerView.getMeasuredHeight() + y8) - recyclerView.getTranslationY();
            float f9 = this.c;
            canvas.save();
            boolean z10 = r50.C3;
            if (!z10 && (uVar = this.y) != null && !uVar.L && uVar.c != null) {
                float f10 = 1.0f - f9;
                canvas.clipRect(0.0f, y8 * f10, getMeasuredWidth(), (getMeasuredHeight() * f9) + (measuredHeight * f10));
            } else if (z10) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            u uVar4 = this.A;
            if (uVar4 != null && uVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.A.getX(), this.A.getY());
                this.A.draw(canvas);
                canvas.restore();
            }
            u uVar5 = this.y;
            if (uVar5 != null && uVar5.getParent() != null) {
                if (this.y.getAlpha() != 1.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.y.getX(), this.y.getY(), this.y.getX() + this.y.getMeasuredWidth(), this.y.getY() + this.y.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.y.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z11 = this.C0 || this.F0 != null;
                if (z11 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((r50.B3 || r50.C3) ? 0 : AndroidUtilities.dp(90.0f)));
                }
                canvas.translate(this.y.getX(), this.y.getY());
                u uVar6 = this.y;
                float f11 = this.E0;
                if (uVar6.k0 != z11 || uVar6.l0 != f11) {
                    uVar6.k0 = z11;
                    uVar6.l0 = f11;
                    uVar6.a.invalidate();
                    uVar6.invalidate();
                }
                this.y.i(this.u0, this.q0, this.r0, this.n0, this.o0, this.v0 || this.x0 != null);
                this.y.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            UndoView[] undoViewArr2 = this.G0;
            if (undoViewArr2[i10].getVisibility() == 0) {
                canvas.save();
                float f12 = r50.B3 ? 0.0f : (1.0f - this.S) * (-AndroidUtilities.dp(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (r50.B3 ? 0 : AndroidUtilities.dp(90.0f))) + f12) - AndroidUtilities.dp(18.0f));
                if (this.I0) {
                    canvas.translate(undoViewArr2[i10].getX() - AndroidUtilities.dp(8.0f), undoViewArr2[i10].getY() - AndroidUtilities.dp(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i10].getX() - AndroidUtilities.dp(8.0f), ((undoViewArr2[i10].getY() - (r50.B3 ? 0 : AndroidUtilities.dp(90.0f))) + f12) - AndroidUtilities.dp(26.0f));
                }
                if (undoViewArr2[i10].getAlpha() != 1.0f) {
                    undoViewArr = undoViewArr2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, undoViewArr2[i10].getMeasuredWidth(), undoViewArr2[i10].getMeasuredHeight(), (int) (undoViewArr2[i10].getAlpha() * 255.0f), 31);
                } else {
                    undoViewArr = undoViewArr2;
                    canvas.save();
                }
                canvas.scale(undoViewArr[i10].getScaleX(), undoViewArr[i10].getScaleY(), undoViewArr[i10].getMeasuredWidth() / 2.0f, undoViewArr[i10].getMeasuredHeight() / 2.0f);
                undoViewArr[i10].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f13 = (1.0f - this.S) * this.c;
        ValueAnimator valueAnimator = this.J0;
        GradientDrawable gradientDrawable = this.U;
        GradientDrawable gradientDrawable2 = this.T;
        if (valueAnimator == null || (uVar2 = this.A) == null || (uVar3 = this.y) == null) {
            u uVar7 = this.y;
            if (uVar7 != null) {
                float f14 = 255.0f * f13;
                gradientDrawable2.setAlpha((int) ((1.0f - uVar7.T) * f14));
                gradientDrawable.setAlpha((int) ((1.0f - this.y.T) * f14));
            } else {
                int i11 = (int) (255.0f * f13);
                gradientDrawable2.setAlpha(i11);
                gradientDrawable.setAlpha(i11);
            }
        } else {
            boolean z12 = uVar2.S;
            boolean z13 = uVar3.S;
            int alpha = (int) ((z12 != z13 ? (!z13 ? 1.0f - uVar3.getAlpha() : uVar3.getAlpha()) * f13 : !z13 ? 0.0f : f13) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.g0.setAlpha(f13);
        boolean h = h();
        e0 e0Var = this.h0;
        ImageView imageView = this.v;
        if (h) {
            e0Var.setAlpha(0.0f);
            e0Var.setVisibility(4);
            imageView.setAlpha(f13);
            imageView.setVisibility(0);
            if (r50.B3) {
                imageView.setTranslationX((1.0f - this.S) * (-AndroidUtilities.dp(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        } else {
            e0Var.setAlpha(f13);
            e0Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        }
        int measuredWidth = getMeasuredWidth();
        TextView textView = this.W;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.a0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f);
        gr grVar = this.V;
        float f15 = grVar.g;
        float z14 = (com.google.android.recaptcha.internal.a.z(1.0f, f15, measuredWidth2, measuredWidth4 * f15) - AndroidUtilities.dp(21.0f)) - (r50.C3 ? AndroidUtilities.dp(328.0f) : r50.B3 ? AndroidUtilities.dp(180.0f) : 0);
        textView.setTranslationX(z14);
        textView2.setTranslationX(z14);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        f0 f0Var = this.b0;
        f0Var.setTranslationX(z14 - AndroidUtilities.dp(36.0f));
        f0Var.setTranslationY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f0Var.getMeasuredHeight()) / 2.0f);
        e0Var.setTranslationX(z14 - AndroidUtilities.dp(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            f0Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - grVar.g) * f13);
            textView2.setAlpha(grVar.g * f13);
            f0Var.setAlpha(f13);
        }
        float f16 = this.K;
        g0 g0Var = this.E;
        if (f16 != 1.0f) {
            float f17 = f16 + 0.07272727f;
            this.K = f17;
            if (f17 > 1.0f) {
                this.K = 1.0f;
            } else {
                invalidate();
            }
            g0Var.invalidate();
        }
        boolean z15 = this.H;
        if (z15) {
            float f18 = this.J;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.10666667f;
                this.J = f19;
                if (f19 > 1.0f) {
                    this.J = 1.0f;
                } else {
                    invalidate();
                }
                if (r50.B3) {
                    g0Var.setTranslationY((AndroidUtilities.dp(8.0f) * this.S) + ((1.0f - this.S) * org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) + AndroidUtilities.dp(8.0f));
                } else {
                    g0Var.setTranslationY(AndroidUtilities.dp(16.0f));
                }
                g0Var.setAlpha(this.J * this.c);
                g0Var.setScaleX((this.J * 0.5f) + 0.5f);
                g0Var.setScaleY((this.J * 0.5f) + 0.5f);
                if (r50.C3) {
                    super.dispatchDraw(canvas);
                } else {
                    this.Q = true;
                    super.dispatchDraw(canvas);
                    this.Q = false;
                }
                f30Var = this.C;
                if (f30Var.getVisibility() != 0) {
                    for (int i12 = 0; i12 < f30Var.getChildCount(); i12++) {
                        n20 n20Var = (n20) f30Var.getChildAt(i12);
                        if (n20Var.getVisibility() == 0 && n20Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(f30Var.getX() + n20Var.getX(), f30Var.getY() + n20Var.getY());
                            canvas.scale(n20Var.getScaleX(), n20Var.getScaleY(), n20Var.getMeasuredWidth() / 2.0f, n20Var.getMeasuredHeight() / 2.0f);
                            n20Var.c(canvas);
                            canvas.restore();
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (!z15) {
            float f20 = this.J;
            if (f20 != 0.0f) {
                float f21 = f20 - 0.10666667f;
                this.J = f21;
                if (f21 < 0.0f) {
                    this.J = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        if (r50.B3) {
        }
        g0Var.setAlpha(this.J * this.c);
        g0Var.setScaleX((this.J * 0.5f) + 0.5f);
        g0Var.setScaleY((this.J * 0.5f) + 0.5f);
        if (r50.C3) {
        }
        f30Var = this.C;
        if (f30Var.getVisibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.P;
        RecyclerView recyclerView = this.B;
        if (!z10) {
            UndoView[] undoViewArr = this.G0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof u) {
                    u uVar = (u) view;
                    if (uVar != this.y && uVar != this.A && !this.Q && !uVar.u0) {
                        if (uVar.c == null) {
                            if (!r50.C3) {
                                return super.drawChild(canvas, view, j10);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild;
                        }
                        float y8 = recyclerView.getY() - getTop();
                        float measuredHeight = (recyclerView.getMeasuredHeight() + y8) - recyclerView.getTranslationY();
                        float f9 = this.c;
                        if (uVar.d == null) {
                            f9 = 0.0f;
                        }
                        canvas.save();
                        float f10 = 1.0f - f9;
                        canvas.clipRect(0.0f, y8 * f10, getMeasuredWidth(), (getMeasuredHeight() * f9) + (measuredHeight * f10));
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                } else if (!this.O) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        } else if ((view instanceof u) && ((u) view).u0) {
            float y10 = recyclerView.getY() - getTop();
            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y10, getMeasuredWidth(), measuredHeight2);
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        return true;
    }

    public final void e() {
        boolean z10 = this.c0;
        rk0 rk0Var = this.d0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(rk0Var);
        }
        AndroidUtilities.runOnUIThread(rk0Var, 3000L);
        this.c0 = true;
    }

    public final void f(u uVar) {
        this.D.remove(uVar);
        long peerId = MessageObject.getPeerId(uVar.w.participant.peer);
        this.w.put(peerId, r2.get(peerId, 0) - 1);
    }

    public final void g() {
        l0 l0Var;
        if (this.v0) {
            this.v0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.x0 = ofFloat;
            l0Var = this;
            ofFloat.addUpdateListener(new dg.c(l0Var, this.u0, this.n0, this.o0, 1));
            l0Var.x0.addListener(new c0(this, 1));
            l0Var.x0.setDuration(350L);
            l0Var.x0.setInterpolator(jr.f);
            l0Var.x0.start();
            l0Var.h = System.currentTimeMillis();
        } else {
            l0Var = this;
        }
        l0Var.w0 = false;
        l0Var.p0 = false;
    }

    public UndoView getUndoView() {
        UndoView[] undoViewArr = this.G0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            removeView(undoViewArr[0]);
            addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean h() {
        ChatObject.Call call = this.e0;
        return call != null && call.call.rtmp_stream;
    }

    public abstract void i(boolean z10);

    /* JADX WARN: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ChatObject.VideoParticipant videoParticipant) {
        u uVar;
        u uVar2;
        p pVar;
        l lVar;
        n20 n20Var;
        l lVar2;
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null && this.e == null) {
            return;
        }
        if (videoParticipant == null || !videoParticipant.equals(this.e)) {
            long peerId = videoParticipant == null ? 0L : MessageObject.getPeerId(videoParticipant.participant.peer);
            u uVar3 = this.y;
            if (uVar3 != null) {
                ArrayList arrayList = uVar3.i0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((Runnable) arrayList.get(i10)).run();
                }
                arrayList.clear();
            }
            ValueAnimator valueAnimator = this.J0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (videoParticipant2 = this.e) != null) {
                sharedInstance.requestFullScreen(videoParticipant2.participant, false, videoParticipant2.presentation);
            }
            this.e = videoParticipant;
            int i11 = 1;
            if (sharedInstance != null && videoParticipant != null) {
                sharedInstance.requestFullScreen(videoParticipant.participant, true, videoParticipant.presentation);
            }
            this.d = peerId;
            boolean z10 = this.b;
            this.h = System.currentTimeMillis();
            d0 d0Var = this.g0;
            r50 r50Var = this.f0;
            if (videoParticipant == null) {
                if (this.b) {
                    ValueAnimator valueAnimator2 = this.r;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.b = false;
                    u uVar4 = this.y;
                    if (uVar4.c != null || uVar4.d != null || uVar4.e != null) {
                        ChatObject.VideoParticipant videoParticipant3 = uVar4.w;
                        if (ChatObject.Call.videoIsActive(videoParticipant3.participant, videoParticipant3.presentation, this.e0)) {
                            this.y.h(false, true);
                        }
                    }
                    this.y.b(true);
                    l lVar3 = this.y.c;
                    if (lVar3 != null) {
                        lVar3.setRenderer(null);
                    }
                    n20 n20Var2 = this.y.d;
                    if (n20Var2 != null) {
                        n20Var2.setRenderer(null);
                    }
                    l lVar4 = this.y.e;
                    if (lVar4 != null) {
                        lVar4.setRenderer(null);
                    }
                    u uVar5 = this.y;
                    uVar5.animate().alpha(0.0f).setListener(new i0(this, uVar5)).setDuration(350L).start();
                }
                d0Var.setEnabled(false);
                this.f = false;
            } else {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.D;
                    if (i12 >= arrayList2.size()) {
                        uVar = null;
                        break;
                    } else {
                        if (((u) arrayList2.get(i12)).w.equals(videoParticipant)) {
                            uVar = (u) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                Property property = View.ALPHA;
                gr grVar = this.V;
                if (uVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        grVar.a(false, false);
                        this.y.b(false);
                        uVar.b(false);
                        if (!this.I0) {
                            u uVar6 = this.y;
                            if (uVar6.c != null || uVar6.d != null || uVar6.e != null) {
                                uVar2 = new u(this, this.e0, r50Var);
                                u uVar7 = this.y;
                                l lVar5 = uVar7.c;
                                n20 n20Var3 = uVar7.d;
                                l lVar6 = uVar7.e;
                                uVar2.c = lVar5;
                                uVar2.d = n20Var3;
                                uVar2.e = lVar6;
                                uVar2.g(this.b, false);
                                uVar2.j(false);
                                l lVar7 = this.y.c;
                                if (lVar7 != null) {
                                    lVar7.setRenderer(uVar2);
                                }
                                n20 n20Var4 = this.y.d;
                                if (n20Var4 != null) {
                                    n20Var4.setRenderer(uVar2);
                                }
                                l lVar8 = this.y.e;
                                if (lVar8 != null) {
                                    lVar8.setRenderer(uVar2);
                                }
                                u uVar8 = new u(this, this.e0, r50Var);
                                uVar8.w = uVar.w;
                                l lVar9 = uVar.c;
                                n20 n20Var5 = uVar.d;
                                l lVar10 = uVar.e;
                                uVar8.c = lVar9;
                                uVar8.d = n20Var5;
                                uVar8.e = lVar10;
                                uVar8.g(this.b, false);
                                uVar8.j(false);
                                pVar = uVar8.a;
                                pVar.d.setAlpha(1.0f);
                                pVar.e.setAlpha(1.0f);
                                lVar = uVar.c;
                                if (lVar != null) {
                                    lVar.setRenderer(uVar8);
                                }
                                n20Var = uVar.d;
                                if (n20Var != null) {
                                    n20Var.setRenderer(uVar8);
                                }
                                lVar2 = uVar.e;
                                if (lVar2 != null) {
                                    lVar2.setRenderer(uVar8);
                                }
                                uVar8.A = true;
                                uVar8.setAlpha(0.0f);
                                this.A = this.y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uVar8, (Property<u, Float>) property, 0.0f, 1.0f);
                                this.J0 = ofFloat;
                                ofFloat.addListener(new j0(this, uVar8, uVar));
                                if (uVar2 != null) {
                                    uVar2.setAlpha(0.0f);
                                    uVar2.setScaleX(0.5f);
                                    uVar2.setScaleY(0.5f);
                                    uVar2.A = true;
                                }
                                yw0 yw0Var = new yw0(this, uVar, uVar2, 8);
                                if (pVar.d.isFirstFrameRendered()) {
                                    AndroidUtilities.runOnUIThread(yw0Var, 250L);
                                    uVar8.i0.add(yw0Var);
                                } else {
                                    yw0Var.run();
                                }
                                d();
                                this.y = uVar8;
                                uVar8.h(true, false);
                                l();
                            }
                        }
                        uVar2 = null;
                        u uVar82 = new u(this, this.e0, r50Var);
                        uVar82.w = uVar.w;
                        l lVar92 = uVar.c;
                        n20 n20Var52 = uVar.d;
                        l lVar102 = uVar.e;
                        uVar82.c = lVar92;
                        uVar82.d = n20Var52;
                        uVar82.e = lVar102;
                        uVar82.g(this.b, false);
                        uVar82.j(false);
                        pVar = uVar82.a;
                        pVar.d.setAlpha(1.0f);
                        pVar.e.setAlpha(1.0f);
                        lVar = uVar.c;
                        if (lVar != null) {
                        }
                        n20Var = uVar.d;
                        if (n20Var != null) {
                        }
                        lVar2 = uVar.e;
                        if (lVar2 != null) {
                        }
                        uVar82.A = true;
                        uVar82.setAlpha(0.0f);
                        this.A = this.y;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(uVar82, (Property<u, Float>) property, 0.0f, 1.0f);
                        this.J0 = ofFloat2;
                        ofFloat2.addListener(new j0(this, uVar82, uVar));
                        if (uVar2 != null) {
                        }
                        yw0 yw0Var2 = new yw0(this, uVar, uVar2, 8);
                        if (pVar.d.isFirstFrameRendered()) {
                        }
                        d();
                        this.y = uVar82;
                        uVar82.h(true, false);
                        l();
                    } else {
                        this.b = true;
                        d();
                        this.y = uVar;
                        uVar.h(true, true);
                        invalidate();
                        grVar.a(this.f, false);
                    }
                } else if (this.b) {
                    u uVar9 = this.y;
                    if (uVar9.c == null) {
                        if (!((uVar9.d != null) | (uVar9.e != null))) {
                            uVar9.b(true);
                            u uVar10 = new u(this, this.e0, r50Var);
                            uVar10.w = videoParticipant;
                            uVar10.g(this.b, false);
                            uVar10.h(true, false);
                            uVar10.A = true;
                            uVar10.setAlpha(0.0f);
                            this.A = this.y;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.J0 = ofFloat3;
                            ofFloat3.addUpdateListener(new bg.b3(15, this, uVar10));
                            this.J0.addListener(new z(this, uVar10));
                            this.J0.start();
                            d();
                            this.y = uVar10;
                            uVar10.h(true, false);
                            this.y.j(false);
                            l();
                        }
                    }
                    uVar9.b(false);
                    u uVar11 = new u(this, this.e0, r50Var);
                    u uVar12 = this.y;
                    l lVar11 = uVar12.c;
                    n20 n20Var6 = uVar12.d;
                    l lVar12 = uVar12.e;
                    uVar11.c = lVar11;
                    uVar11.d = n20Var6;
                    uVar11.e = lVar12;
                    uVar11.g(this.b, false);
                    uVar11.j(false);
                    l lVar13 = this.y.c;
                    if (lVar13 != null) {
                        lVar13.setRenderer(uVar11);
                    }
                    n20 n20Var7 = this.y.d;
                    if (n20Var7 != null) {
                        n20Var7.setRenderer(uVar11);
                    }
                    l lVar14 = this.y.e;
                    if (lVar14 != null) {
                        lVar14.setRenderer(uVar11);
                    }
                    uVar11.setAlpha(0.0f);
                    uVar11.setScaleX(0.5f);
                    uVar11.setScaleY(0.5f);
                    uVar11.A = true;
                    o oVar = new o(this, uVar11);
                    if (uVar11.a.d.isFirstFrameRendered()) {
                        oVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(oVar, 250L);
                        uVar11.i0.add(oVar);
                    }
                    u uVar102 = new u(this, this.e0, r50Var);
                    uVar102.w = videoParticipant;
                    uVar102.g(this.b, false);
                    uVar102.h(true, false);
                    uVar102.A = true;
                    uVar102.setAlpha(0.0f);
                    this.A = this.y;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J0 = ofFloat32;
                    ofFloat32.addUpdateListener(new bg.b3(15, this, uVar102));
                    this.J0.addListener(new z(this, uVar102));
                    this.J0.start();
                    d();
                    this.y = uVar102;
                    uVar102.h(true, false);
                    this.y.j(false);
                    l();
                } else {
                    this.b = true;
                    d();
                    u uVar13 = new u(this, this.e0, r50Var);
                    this.y = uVar13;
                    uVar13.w = videoParticipant;
                    uVar13.g(this.b, false);
                    this.y.h(true, false);
                    this.y.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.y, (Property<u, Float>) property, 0.0f, 1.0f);
                    this.J0 = ofFloat4;
                    ofFloat4.addListener(new a0(this));
                    this.J0.start();
                    invalidate();
                    grVar.a(this.f, false);
                }
                d0Var.setEnabled(true);
            }
            boolean z11 = this.b;
            if (z10 != z11) {
                if (z11) {
                    d0Var.setVisibility(0);
                    this.h0.setVisibility(0);
                    this.a0.setVisibility(0);
                    this.b0.setVisibility(0);
                } else {
                    setUiVisible(true);
                    if (this.c0) {
                        this.c0 = false;
                        AndroidUtilities.cancelRunOnUIThread(this.d0);
                    }
                }
                i(true);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.c, this.b ? 1.0f : 0.0f);
                this.r = ofFloat5;
                ofFloat5.addUpdateListener(new w(this, i11));
                u uVar14 = this.y;
                uVar14.r = true;
                r50Var.getCurrentAccount();
                this.H0 = this.C0;
                this.x.lock();
                this.r.addListener(new b0(this, uVar14));
                this.r.setInterpolator(jr.f);
                this.r.setDuration(350L);
                p pVar2 = this.y.a;
                ValueAnimator valueAnimator4 = this.r;
                if (pVar2.A) {
                    pVar2.C.add(valueAnimator4);
                } else {
                    valueAnimator4.start();
                }
            }
            b(this.e == null);
        }
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (MessageObject.getPeerId(((u) arrayList.get(i10)).w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                ((u) arrayList.get(i10)).setAmplitude(f9);
            }
            i10++;
        }
    }

    public abstract void l();

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = r50.C3;
        View view = this.i0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (r50.B3) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : AndroidUtilities.dp(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.j0.setVisibility((!r50.B3 || r50.C3) ? 8 : 0);
        f0 f0Var = this.b0;
        f0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.W;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.a0;
        textView2.measure(makeMeasureSpec2, i11);
        f0Var.getLayoutParams().width = AndroidUtilities.dp(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.E.getLayoutParams()).rightMargin = r50.B3 ? AndroidUtilities.dp(45.0f) : 0;
        for (int i12 = 0; i12 < 2; i12++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G0[i12].getLayoutParams();
            if (this.I0) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                marginLayoutParams.rightMargin = r50.B3 ? AndroidUtilities.dp(180.0f) : 0;
            }
        }
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x038e, code lost:
    
        if ((r18.getPointerCount() >= 2 && ((r17.s0 == r18.getPointerId(0) && r17.t0 == r18.getPointerId(1)) || (r17.s0 == r18.getPointerId(1) && r17.t0 == r18.getPointerId(0)))) == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0394, code lost:
    
        if (r18.getActionMasked() == 3) goto L180;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0256  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.D0;
        r50 r50Var = this.f0;
        if ((z11 || this.C0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.D0 = false;
            if (this.C0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.E0) <= AndroidUtilities.dp(120.0f)) {
                    b(false);
                } else {
                    r50Var.e1(null);
                }
            }
            invalidate();
        }
        if (!this.b || (!(this.D0 || this.C0 || this.z0 || this.w0 || this.p0 || this.v0 || motionEvent.getActionMasked() == 0) || this.y == null)) {
            g();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.D0 = false;
            this.C0 = false;
            this.w0 = false;
            this.p0 = false;
            this.v0 = false;
        }
        if (motionEvent.getActionMasked() == 0 && this.F0 != null) {
            this.D0 = false;
            this.C0 = true;
            this.B0 = motionEvent.getY() - this.E0;
            this.F0.removeAllListeners();
            this.F0.cancel();
            this.F0 = null;
        } else if (this.F0 != null) {
            g();
            return false;
        }
        u uVar = this.y;
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        r rVar = uVar.J;
        Rect rect = uVar.x0;
        rVar.getHitRect(rect);
        if (!rect.contains((int) x4, (int) y8)) {
            if (motionEvent.getActionMasked() == 0 && !this.C0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), this.y.getMeasuredWidth() + ((r50.B3 && this.R) ? -AndroidUtilities.dp(90.0f) : 0), this.y.getMeasuredHeight() + ((r50.B3 || !this.R) ? 0 : -AndroidUtilities.dp(90.0f)));
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.y0 = System.currentTimeMillis();
                    this.z0 = true;
                    this.D0 = true;
                    this.A0 = motionEvent.getX();
                    this.B0 = motionEvent.getY();
                }
            } else if ((this.D0 || this.C0 || this.z0) && motionEvent.getActionMasked() == 2) {
                float abs = Math.abs(this.A0 - motionEvent.getX());
                float f9 = this.a;
                if (abs > f9 || Math.abs(this.B0 - motionEvent.getY()) > f9) {
                    this.z0 = false;
                }
                if (this.D0 && !this.v0 && Math.abs(this.B0 - motionEvent.getY()) > r10 * 2) {
                    this.B0 = motionEvent.getY();
                    this.D0 = false;
                    this.C0 = true;
                } else if (this.C0) {
                    this.E0 = motionEvent.getY() - this.B0;
                    invalidate();
                }
                if (this.D0 && Math.abs(this.A0 - motionEvent.getX()) > r10 * 4) {
                    this.D0 = false;
                }
            }
            if (this.z0 && motionEvent.getActionMasked() == 1 && System.currentTimeMillis() - this.y0 < 200) {
                this.z0 = false;
                if (this.H) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    g0 g0Var = this.E;
                    rectF2.set(g0Var.getX(), g0Var.getY(), g0Var.getX() + g0Var.getWidth(), g0Var.getY() + g0Var.getHeight());
                    if (this.e0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z12 = false;
                        z10 = false;
                        for (int i10 = 0; i10 < this.e0.visibleVideoParticipants.size(); i10++) {
                            if (this.I == MessageObject.getPeerId(this.e0.visibleVideoParticipants.get(i10).participant.peer)) {
                                r50Var.e1(this.e0.visibleVideoParticipants.get(i10));
                                z12 = true;
                                z10 = true;
                            }
                        }
                        if (!z12) {
                            r50Var.e1(new ChatObject.VideoParticipant((TLRPC.GroupCallParticipant) this.e0.participants.f(this.I), false, false));
                            z10 = true;
                        }
                        if (!z10) {
                            setUiVisible(!this.R);
                        }
                        this.E0 = 0.0f;
                        invalidate();
                    }
                }
                z10 = false;
                if (!z10) {
                }
                this.E0 = 0.0f;
                invalidate();
            }
            if (!this.y.S || this.C0) {
                g();
                if (this.z0 || this.C0 || this.D0) {
                    return true;
                }
            } else {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        t2 t2Var = this.y.a.d;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                        rectF3.inset(((t2Var.getMeasuredHeight() * this.y.a.P) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * this.y.a.P) - t2Var.getMeasuredWidth()) / 2.0f);
                        if (r50.B3) {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.y.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                        } else {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.y.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                        }
                        boolean contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                        this.w0 = contains;
                        if (!contains) {
                            g();
                            return this.D0;
                        }
                    }
                    if (!this.p0 && motionEvent.getPointerCount() == 2) {
                        this.m0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.q0 = x10;
                        this.k0 = x10;
                        float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.r0 = y10;
                        this.l0 = y10;
                        this.u0 = 1.0f;
                        this.s0 = motionEvent.getPointerId(0);
                        this.t0 = motionEvent.getPointerId(1);
                        this.p0 = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.p0) {
                    int i11 = -1;
                    int i12 = -1;
                    for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                        if (this.s0 == motionEvent.getPointerId(i13)) {
                            i11 = i13;
                        }
                        if (this.t0 == motionEvent.getPointerId(i13)) {
                            i12 = i13;
                        }
                    }
                    if (i11 == -1 || i12 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                        return this.D0;
                    }
                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / this.m0;
                    this.u0 = hypot;
                    if (hypot > 1.005f && !this.v0) {
                        this.m0 = (float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11));
                        float x11 = (motionEvent.getX(i12) + motionEvent.getX(i11)) / 2.0f;
                        this.q0 = x11;
                        this.k0 = x11;
                        float y11 = (motionEvent.getY(i12) + motionEvent.getY(i11)) / 2.0f;
                        this.r0 = y11;
                        this.l0 = y11;
                        this.u0 = 1.0f;
                        this.n0 = 0.0f;
                        this.o0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.v0 = true;
                        this.p0 = true;
                    }
                    float x12 = (motionEvent.getX(i12) + motionEvent.getX(i11)) / 2.0f;
                    float y12 = (motionEvent.getY(i12) + motionEvent.getY(i11)) / 2.0f;
                    float f10 = this.k0 - x12;
                    float f11 = this.l0 - y12;
                    float f12 = -f10;
                    float f13 = this.u0;
                    this.n0 = f12 / f13;
                    this.o0 = (-f11) / f13;
                    invalidate();
                } else {
                    if (motionEvent.getActionMasked() != 1) {
                        if (motionEvent.getActionMasked() == 6) {
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                    g();
                }
                if (this.w0 || this.z0 || this.D0) {
                }
            }
        }
        return false;
    }

    public void setGroupCall(ChatObject.Call call) {
        this.e0 = call;
    }

    public void setIsTablet(boolean z10) {
        if (this.I0 != z10) {
            this.I0 = z10;
            d0 d0Var = this.g0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d0Var.getLayoutParams();
            layoutParams.gravity = z10 ? 85 : 51;
            layoutParams.rightMargin = z10 ? AndroidUtilities.dp(328.0f) : 0;
            layoutParams.bottomMargin = z10 ? -AndroidUtilities.dp(8.0f) : 0;
            if (this.I0) {
                d0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            h2Var.a(-1);
            d0Var.setImageDrawable(h2Var);
        }
    }

    public void setProgressToHideUi(float f9) {
        if (this.S != f9) {
            this.S = f9;
            invalidate();
            u uVar = this.y;
            if (uVar != null) {
                uVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        h9 h9Var;
        boolean z11;
        long j10;
        if (!this.b || this.I0 || this.e == null || this.r != null || this.e0 == null) {
            if (this.H) {
                this.H = false;
                this.J = 0.0f;
                return;
            }
            return;
        }
        int currentAccount = this.f0.getCurrentAccount();
        long j11 = 500;
        if (System.currentTimeMillis() - this.K0 < 500) {
            if (this.L0 == null) {
                m6 m6Var = new m6(this, 14);
                this.L0 = m6Var;
                AndroidUtilities.runOnUIThread(m6Var, (System.currentTimeMillis() - this.K0) + 50);
                return;
            }
            return;
        }
        this.K0 = System.currentTimeMillis();
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int m10 = this.e0.currentSpeakingPeers.m();
            h9Var = this.F;
            if (i10 >= m10) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e0.currentSpeakingPeers.f(this.e0.currentSpeakingPeers.j(i10));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                j10 = j11;
            } else {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                j10 = j11;
                if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j10) {
                    continue;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i11 == 0) {
                        this.I = MessageObject.getPeerId(groupCallParticipant.peer);
                    }
                    if (i11 < 3) {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            h9Var.b(i11, groupCallParticipant, currentAccount);
                            if (i11 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new t41(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new t41(AndroidUtilities.bold()), 0);
                            }
                        }
                    }
                    i11++;
                    if (i11 == 3) {
                        break;
                    }
                }
            }
            i10++;
            j11 = j10;
        }
        boolean z12 = i11 != 0;
        boolean z13 = this.H;
        TextView textView = this.G;
        if (!z13 && z12) {
            z11 = false;
        } else {
            if (!z12 && z13) {
                this.H = z12;
                invalidate();
                return;
            }
            if (z13 && z12) {
                g0 g0Var = this.E;
                this.L = g0Var.getLeft();
                this.N = g0Var.getRight();
                this.M = textView.getLeft();
                this.K = 0.0f;
            }
            z11 = z10;
        }
        if (!z12) {
            this.H = z12;
            invalidate();
            return;
        }
        String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i11);
        int indexOf = pluralString.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i11 != 0 ? i11 == 1 ? AndroidUtilities.dp(40.0f) : i11 == 2 ? AndroidUtilities.dp(64.0f) : AndroidUtilities.dp(88.0f) : 0;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
        this.H = z12;
        invalidate();
        while (i11 < 3) {
            h9Var.b(i11, null, currentAccount);
            i11++;
        }
        h9Var.a(z11);
    }
}
