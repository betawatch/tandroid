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
import java.util.ArrayList;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.r20;
import org.telegram.ui.a40;
import org.telegram.ui.j60;
import org.telegram.ui.w30;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class l0 extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public boolean D0;
    public t E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final w30 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final g0 I;
    public float I0;
    public final l9 J;
    public ValueAnimator J0;
    public final TextView K;
    public final UndoView[] K0;
    public boolean L;
    public boolean L0;
    public long M;
    public boolean M0;
    public float N;
    public ValueAnimator N0;
    public float O;
    public long O0;
    public float P;
    public ig.t0 P0;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int a;
    public final GradientDrawable a0;
    public boolean b;
    public final GradientDrawable b0;
    public float c;
    public final mr c0;
    public long d;
    public final TextView d0;
    public ChatObject.VideoParticipant e;
    public final TextView e0;
    public boolean f;
    public final f0 f0;
    public boolean g0;
    public long h;
    public final l7 h0;
    public ChatObject.Call i0;
    public final j60 j0;
    public final d0 k0;
    public final e0 l0;
    public final View m0;
    public float n;
    public final View n0;
    public float o0;
    public float p0;
    public float q0;
    public ValueAnimator r;
    public float r0;
    public boolean s;
    public float s0;
    public boolean t0;
    public float u0;
    public final ImageView v;
    public float v0;
    public final LongSparseIntArray w;
    public int w0;
    public final AnimationNotificationsLocker x;
    public int x0;
    public t y;
    public float y0;
    public boolean z0;

    public l0(Context context, RecyclerView recyclerView, w30 w30Var, ArrayList arrayList, ChatObject.Call call, j60 j60Var) {
        super(context);
        this.w = new LongSparseIntArray();
        this.x = new AnimationNotificationsLocker();
        this.O = 1.0f;
        this.V = true;
        final a40 a40Var = (a40) this;
        this.h0 = new l7(a40Var, 26);
        this.y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = w30Var;
        this.H = arrayList;
        this.i0 = call;
        this.j0 = j60Var;
        d0 d0Var = new d0(context);
        this.k0 = d0Var;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.a(-1);
        d0Var.setImageDrawable(g2Var);
        d0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        d0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        d0Var.setBackground(j6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, x5.c(120.0f, -1));
        View view2 = new View(context);
        this.n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((call == null || !h()) ? 8 : 0);
        addView(view2, x5.e(160, -1, 5));
        addView(d0Var, x5.e(56, -1, 51));
        final int i10 = 0;
        d0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        a40Var.Q0.onBackPressed();
                        break;
                    default:
                        a40 a40Var2 = a40Var;
                        if (a40Var2.b) {
                            boolean z10 = !a40Var2.f;
                            a40Var2.f = z10;
                            a40Var2.c0.a(z10, true);
                            a40Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        e0 e0Var = new e0(a40Var, context);
        this.l0 = e0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, k10, k10);
        f0 f0Var = new f0(a40Var, context, i02);
        this.f0 = f0Var;
        final int i11 = 1;
        f0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        a40Var.Q0.onBackPressed();
                        break;
                    default:
                        a40 a40Var2 = a40Var;
                        if (a40Var2.b) {
                            boolean z10 = !a40Var2.f;
                            a40Var2.f = z10;
                            a40Var2.c0.a(z10, true);
                            a40Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        i02.setCallback(f0Var);
        addView(f0Var);
        mr mrVar = new mr(context, R.drawable.msg_pin_filled, -1);
        this.c0 = mrVar;
        float f7 = -AndroidUtilities.dp(1.0f);
        float dp2 = AndroidUtilities.dp(2.0f);
        float dp3 = AndroidUtilities.dp(1.0f);
        mrVar.i = f7;
        mrVar.j = dp2;
        mrVar.k = dp3;
        mrVar.invalidateSelf();
        e0Var.setImageDrawable(mrVar);
        e0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(e0Var, x5.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.d0 = textView;
        org.telegram.messenger.w1.q(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.e0 = textView2;
        org.telegram.messenger.w1.q(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, x5.e(-2, -2, 51));
        addView(textView2, x5.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp4 = AndroidUtilities.dp(4.0f);
        imageView.setPadding(dp4, dp4, dp4, dp4);
        imageView.setBackground(j6.f0(i0.a.k(-1, 55), 1, -1));
        imageView.setOnClickListener(new ct(23, a40Var, j60Var));
        addView(imageView, x5.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g0 g0Var = new g0(a40Var, context, j6.b0(AndroidUtilities.dp(18.0f), i0.a.k(j6.w0(null, j6.tg, false), 204)));
        this.I = g0Var;
        l9 l9Var = new l9(context, true);
        this.J = l9Var;
        l9Var.setStyle(10);
        g0Var.setClipChildren(false);
        g0Var.setClipToPadding(false);
        g0Var.addView(l9Var, x5.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        g0Var.addView(textView3, x5.e(-2, -2, 16));
        addView(g0Var, x5.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i12 = 0; i12 < 2; i12++) {
            this.K0[i12] = new h0(a40Var, context);
            this.K0[i12].setHideAnimationType(2);
            this.K0[i12].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.K0[i12], x5.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.f0.setVisibility(8);
        setIsTablet(j60.G3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            j60 j60Var = ((a40) this).Q0;
            if (j60Var.a2 != null) {
                j60Var.z3.a(!r1.V, true);
            }
            l7 l7Var = this.h0;
            if (!z10 || !this.b) {
                this.g0 = false;
                AndroidUtilities.cancelRunOnUIThread(l7Var);
            } else if (!this.g0) {
                this.g0 = true;
                AndroidUtilities.runOnUIThread(l7Var, 3000L);
            }
            t tVar = this.y;
            if (tVar != null) {
                tVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        int i10 = 0;
        if (this.G0) {
            this.G0 = false;
            float f7 = this.I0;
            float[] fArr = new float[2];
            if (z10) {
                fArr[0] = f7;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f7;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.J0 = ofFloat;
            ofFloat.addUpdateListener(new v(this, i10));
            this.J0.addListener(new c0(this, 0));
            ValueAnimator valueAnimator = this.J0;
            pr prVar = pr.f;
            valueAnimator.setInterpolator(prVar);
            this.J0.setDuration(z10 ? 350L : 200L);
            this.J0.setInterpolator(prVar);
            t tVar = this.y;
            if (tVar != null) {
                o oVar = tVar.a;
                ValueAnimator valueAnimator2 = this.J0;
                if (oVar.E) {
                    oVar.G.add(valueAnimator2);
                } else {
                    valueAnimator2.start();
                }
            } else {
                this.J0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.H0 = false;
    }

    public final boolean c() {
        return (this.f || System.currentTimeMillis() - this.h <= 2000 || this.G0 || this.t0) ? false : true;
    }

    public final void d() {
        t tVar = this.y;
        if (tVar != null) {
            if (tVar.o0 || tVar.p0 != 0.0f) {
                tVar.o0 = false;
                tVar.p0 = 0.0f;
                tVar.a.invalidate();
                tVar.invalidate();
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
        t tVar;
        w30 w30Var;
        t tVar2;
        t tVar3;
        UndoView[] undoViewArr;
        if (j60.G3) {
            this.S = true;
            super.dispatchDraw(canvas);
            this.S = false;
        }
        this.T = true;
        super.dispatchDraw(canvas);
        this.T = false;
        if (this.E != null || this.y != null) {
            RecyclerView recyclerView = this.F;
            float y3 = recyclerView.getY() - getTop();
            float measuredHeight = (recyclerView.getMeasuredHeight() + y3) - recyclerView.getTranslationY();
            float f7 = this.c;
            canvas.save();
            boolean z10 = j60.G3;
            if (!z10 && (tVar = this.y) != null && !tVar.P && tVar.c != null) {
                float f10 = 1.0f - f7;
                canvas.clipRect(0.0f, y3 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
            } else if (z10) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            t tVar4 = this.E;
            if (tVar4 != null && tVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.E.getX(), this.E.getY());
                this.E.draw(canvas);
                canvas.restore();
            }
            t tVar5 = this.y;
            if (tVar5 != null && tVar5.getParent() != null) {
                if (this.y.getAlpha() != 1.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.y.getX(), this.y.getY(), this.y.getX() + this.y.getMeasuredWidth(), this.y.getY() + this.y.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.y.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z11 = this.G0 || this.J0 != null;
                if (z11 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((j60.F3 || j60.G3) ? 0 : AndroidUtilities.dp(90.0f)));
                }
                canvas.translate(this.y.getX(), this.y.getY());
                t tVar6 = this.y;
                float f11 = this.I0;
                if (tVar6.o0 != z11 || tVar6.p0 != f11) {
                    tVar6.o0 = z11;
                    tVar6.p0 = f11;
                    tVar6.a.invalidate();
                    tVar6.invalidate();
                }
                this.y.i(this.y0, this.u0, this.v0, this.r0, this.s0, this.z0 || this.B0 != null);
                this.y.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            UndoView[] undoViewArr2 = this.K0;
            if (undoViewArr2[i10].getVisibility() == 0) {
                canvas.save();
                float f12 = j60.F3 ? 0.0f : (1.0f - this.W) * (-AndroidUtilities.dp(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (j60.F3 ? 0 : AndroidUtilities.dp(90.0f))) + f12) - AndroidUtilities.dp(18.0f));
                if (this.M0) {
                    canvas.translate(undoViewArr2[i10].getX() - AndroidUtilities.dp(8.0f), undoViewArr2[i10].getY() - AndroidUtilities.dp(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i10].getX() - AndroidUtilities.dp(8.0f), ((undoViewArr2[i10].getY() - (j60.F3 ? 0 : AndroidUtilities.dp(90.0f))) + f12) - AndroidUtilities.dp(26.0f));
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
        float f13 = (1.0f - this.W) * this.c;
        ValueAnimator valueAnimator = this.N0;
        GradientDrawable gradientDrawable = this.b0;
        GradientDrawable gradientDrawable2 = this.a0;
        if (valueAnimator == null || (tVar2 = this.E) == null || (tVar3 = this.y) == null) {
            t tVar7 = this.y;
            if (tVar7 != null) {
                float f14 = 255.0f * f13;
                gradientDrawable2.setAlpha((int) ((1.0f - tVar7.a0) * f14));
                gradientDrawable.setAlpha((int) ((1.0f - this.y.a0) * f14));
            } else {
                int i11 = (int) (255.0f * f13);
                gradientDrawable2.setAlpha(i11);
                gradientDrawable.setAlpha(i11);
            }
        } else {
            boolean z12 = tVar2.W;
            boolean z13 = tVar3.W;
            int alpha = (int) ((z12 != z13 ? (!z13 ? 1.0f - tVar3.getAlpha() : tVar3.getAlpha()) * f13 : !z13 ? 0.0f : f13) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.k0.setAlpha(f13);
        boolean h = h();
        e0 e0Var = this.l0;
        ImageView imageView = this.v;
        if (h) {
            e0Var.setAlpha(0.0f);
            e0Var.setVisibility(4);
            imageView.setAlpha(f13);
            imageView.setVisibility(0);
            if (j60.F3) {
                imageView.setTranslationX((1.0f - this.W) * (-AndroidUtilities.dp(72.0f)));
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
        TextView textView = this.d0;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.e0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f);
        mr mrVar = this.c0;
        float f15 = mrVar.g;
        float z14 = (com.google.android.gms.internal.vision.e2.z(1.0f, f15, measuredWidth2, measuredWidth4 * f15) - AndroidUtilities.dp(21.0f)) - (j60.G3 ? AndroidUtilities.dp(328.0f) : j60.F3 ? AndroidUtilities.dp(180.0f) : 0);
        textView.setTranslationX(z14);
        textView2.setTranslationX(z14);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        f0 f0Var = this.f0;
        f0Var.setTranslationX(z14 - AndroidUtilities.dp(36.0f));
        f0Var.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f0Var.getMeasuredHeight()) / 2.0f);
        e0Var.setTranslationX(z14 - AndroidUtilities.dp(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            f0Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - mrVar.g) * f13);
            textView2.setAlpha(mrVar.g * f13);
            f0Var.setAlpha(f13);
        }
        float f16 = this.O;
        g0 g0Var = this.I;
        if (f16 != 1.0f) {
            float f17 = f16 + 0.07272727f;
            this.O = f17;
            if (f17 > 1.0f) {
                this.O = 1.0f;
            } else {
                invalidate();
            }
            g0Var.invalidate();
        }
        boolean z15 = this.L;
        if (z15) {
            float f18 = this.N;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.10666667f;
                this.N = f19;
                if (f19 > 1.0f) {
                    this.N = 1.0f;
                } else {
                    invalidate();
                }
                if (j60.F3) {
                    g0Var.setTranslationY((AndroidUtilities.dp(8.0f) * this.W) + ((1.0f - this.W) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + AndroidUtilities.dp(8.0f));
                } else {
                    g0Var.setTranslationY(AndroidUtilities.dp(16.0f));
                }
                g0Var.setAlpha(this.N * this.c);
                g0Var.setScaleX((this.N * 0.5f) + 0.5f);
                g0Var.setScaleY((this.N * 0.5f) + 0.5f);
                if (j60.G3) {
                    super.dispatchDraw(canvas);
                } else {
                    this.U = true;
                    super.dispatchDraw(canvas);
                    this.U = false;
                }
                w30Var = this.G;
                if (w30Var.getVisibility() != 0) {
                    for (int i12 = 0; i12 < w30Var.getChildCount(); i12++) {
                        r20 r20Var = (r20) w30Var.getChildAt(i12);
                        if (r20Var.getVisibility() == 0 && r20Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(w30Var.getX() + r20Var.getX(), w30Var.getY() + r20Var.getY());
                            canvas.scale(r20Var.getScaleX(), r20Var.getScaleY(), r20Var.getMeasuredWidth() / 2.0f, r20Var.getMeasuredHeight() / 2.0f);
                            r20Var.c(canvas);
                            canvas.restore();
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (!z15) {
            float f20 = this.N;
            if (f20 != 0.0f) {
                float f21 = f20 - 0.10666667f;
                this.N = f21;
                if (f21 < 0.0f) {
                    this.N = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        if (j60.F3) {
        }
        g0Var.setAlpha(this.N * this.c);
        g0Var.setScaleX((this.N * 0.5f) + 0.5f);
        g0Var.setScaleY((this.N * 0.5f) + 0.5f);
        if (j60.G3) {
        }
        w30Var = this.G;
        if (w30Var.getVisibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = this.T;
        RecyclerView recyclerView = this.F;
        if (!z10) {
            UndoView[] undoViewArr = this.K0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof t) {
                    t tVar = (t) view;
                    if (tVar != this.y && tVar != this.E && !this.U && !tVar.y0) {
                        if (tVar.c == null) {
                            if (!j60.G3) {
                                return super.drawChild(canvas, view, j3);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild;
                        }
                        float y3 = recyclerView.getY() - getTop();
                        float measuredHeight = (recyclerView.getMeasuredHeight() + y3) - recyclerView.getTranslationY();
                        float f7 = this.c;
                        if (tVar.d == null) {
                            f7 = 0.0f;
                        }
                        canvas.save();
                        float f10 = 1.0f - f7;
                        canvas.clipRect(0.0f, y3 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                } else if (!this.S) {
                    return super.drawChild(canvas, view, j3);
                }
            }
        } else if ((view instanceof t) && ((t) view).y0) {
            float y10 = recyclerView.getY() - getTop();
            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y10, getMeasuredWidth(), measuredHeight2);
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        }
        return true;
    }

    public final void e() {
        boolean z10 = this.g0;
        l7 l7Var = this.h0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(l7Var);
        }
        AndroidUtilities.runOnUIThread(l7Var, 3000L);
        this.g0 = true;
    }

    public final void f(t tVar) {
        this.H.remove(tVar);
        long peerId = MessageObject.getPeerId(tVar.w.participant.peer);
        this.w.put(peerId, r2.get(peerId, 0) - 1);
    }

    public final void g() {
        l0 l0Var;
        if (this.z0) {
            this.z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            l0Var = this;
            ofFloat.addUpdateListener(new w(l0Var, this.y0, this.r0, this.s0, 0));
            l0Var.B0.addListener(new c0(this, 1));
            l0Var.B0.setDuration(350L);
            l0Var.B0.setInterpolator(pr.f);
            l0Var.B0.start();
            l0Var.h = System.currentTimeMillis();
        } else {
            l0Var = this;
        }
        l0Var.A0 = false;
        l0Var.t0 = false;
    }

    public UndoView getUndoView() {
        UndoView[] undoViewArr = this.K0;
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
        ChatObject.Call call = this.i0;
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
        t tVar;
        t tVar2;
        o oVar;
        l lVar;
        r20 r20Var;
        l lVar2;
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null && this.e == null) {
            return;
        }
        if (videoParticipant == null || !videoParticipant.equals(this.e)) {
            long peerId = videoParticipant == null ? 0L : MessageObject.getPeerId(videoParticipant.participant.peer);
            t tVar3 = this.y;
            if (tVar3 != null) {
                ArrayList arrayList = tVar3.m0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((Runnable) arrayList.get(i10)).run();
                }
                arrayList.clear();
            }
            ValueAnimator valueAnimator = this.N0;
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
            d0 d0Var = this.k0;
            j60 j60Var = this.j0;
            if (videoParticipant == null) {
                if (this.b) {
                    ValueAnimator valueAnimator2 = this.r;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.b = false;
                    t tVar4 = this.y;
                    if (tVar4.c != null || tVar4.d != null || tVar4.e != null) {
                        ChatObject.VideoParticipant videoParticipant3 = tVar4.w;
                        if (ChatObject.Call.videoIsActive(videoParticipant3.participant, videoParticipant3.presentation, this.i0)) {
                            this.y.h(false, true);
                        }
                    }
                    this.y.b(true);
                    l lVar3 = this.y.c;
                    if (lVar3 != null) {
                        lVar3.setRenderer(null);
                    }
                    r20 r20Var2 = this.y.d;
                    if (r20Var2 != null) {
                        r20Var2.setRenderer(null);
                    }
                    l lVar4 = this.y.e;
                    if (lVar4 != null) {
                        lVar4.setRenderer(null);
                    }
                    t tVar5 = this.y;
                    tVar5.animate().alpha(0.0f).setListener(new i0(this, tVar5)).setDuration(350L).start();
                }
                d0Var.setEnabled(false);
                this.f = false;
            } else {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.H;
                    if (i12 >= arrayList2.size()) {
                        tVar = null;
                        break;
                    } else {
                        if (((t) arrayList2.get(i12)).w.equals(videoParticipant)) {
                            tVar = (t) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                Property property = View.ALPHA;
                mr mrVar = this.c0;
                if (tVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        mrVar.a(false, false);
                        this.y.b(false);
                        tVar.b(false);
                        if (!this.M0) {
                            t tVar6 = this.y;
                            if (tVar6.c != null || tVar6.d != null || tVar6.e != null) {
                                tVar2 = new t(this, this.i0, j60Var);
                                t tVar7 = this.y;
                                l lVar5 = tVar7.c;
                                r20 r20Var3 = tVar7.d;
                                l lVar6 = tVar7.e;
                                tVar2.c = lVar5;
                                tVar2.d = r20Var3;
                                tVar2.e = lVar6;
                                tVar2.g(this.b, false);
                                tVar2.j(false);
                                l lVar7 = this.y.c;
                                if (lVar7 != null) {
                                    lVar7.setRenderer(tVar2);
                                }
                                r20 r20Var4 = this.y.d;
                                if (r20Var4 != null) {
                                    r20Var4.setRenderer(tVar2);
                                }
                                l lVar8 = this.y.e;
                                if (lVar8 != null) {
                                    lVar8.setRenderer(tVar2);
                                }
                                t tVar8 = new t(this, this.i0, j60Var);
                                tVar8.w = tVar.w;
                                l lVar9 = tVar.c;
                                r20 r20Var5 = tVar.d;
                                l lVar10 = tVar.e;
                                tVar8.c = lVar9;
                                tVar8.d = r20Var5;
                                tVar8.e = lVar10;
                                tVar8.g(this.b, false);
                                tVar8.j(false);
                                oVar = tVar8.a;
                                oVar.d.setAlpha(1.0f);
                                oVar.e.setAlpha(1.0f);
                                lVar = tVar.c;
                                if (lVar != null) {
                                    lVar.setRenderer(tVar8);
                                }
                                r20Var = tVar.d;
                                if (r20Var != null) {
                                    r20Var.setRenderer(tVar8);
                                }
                                lVar2 = tVar.e;
                                if (lVar2 != null) {
                                    lVar2.setRenderer(tVar8);
                                }
                                tVar8.E = true;
                                tVar8.setAlpha(0.0f);
                                this.E = this.y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tVar8, (Property<t, Float>) property, 0.0f, 1.0f);
                                this.N0 = ofFloat;
                                ofFloat.addListener(new j0(this, tVar8, tVar));
                                if (tVar2 != null) {
                                    tVar2.setAlpha(0.0f);
                                    tVar2.setScaleX(0.5f);
                                    tVar2.setScaleY(0.5f);
                                    tVar2.E = true;
                                }
                                er0 er0Var = new er0(this, tVar, tVar2, 14);
                                if (oVar.d.isFirstFrameRendered()) {
                                    AndroidUtilities.runOnUIThread(er0Var, 250L);
                                    tVar8.m0.add(er0Var);
                                } else {
                                    er0Var.run();
                                }
                                d();
                                this.y = tVar8;
                                tVar8.h(true, false);
                                l();
                            }
                        }
                        tVar2 = null;
                        t tVar82 = new t(this, this.i0, j60Var);
                        tVar82.w = tVar.w;
                        l lVar92 = tVar.c;
                        r20 r20Var52 = tVar.d;
                        l lVar102 = tVar.e;
                        tVar82.c = lVar92;
                        tVar82.d = r20Var52;
                        tVar82.e = lVar102;
                        tVar82.g(this.b, false);
                        tVar82.j(false);
                        oVar = tVar82.a;
                        oVar.d.setAlpha(1.0f);
                        oVar.e.setAlpha(1.0f);
                        lVar = tVar.c;
                        if (lVar != null) {
                        }
                        r20Var = tVar.d;
                        if (r20Var != null) {
                        }
                        lVar2 = tVar.e;
                        if (lVar2 != null) {
                        }
                        tVar82.E = true;
                        tVar82.setAlpha(0.0f);
                        this.E = this.y;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tVar82, (Property<t, Float>) property, 0.0f, 1.0f);
                        this.N0 = ofFloat2;
                        ofFloat2.addListener(new j0(this, tVar82, tVar));
                        if (tVar2 != null) {
                        }
                        er0 er0Var2 = new er0(this, tVar, tVar2, 14);
                        if (oVar.d.isFirstFrameRendered()) {
                        }
                        d();
                        this.y = tVar82;
                        tVar82.h(true, false);
                        l();
                    } else {
                        this.b = true;
                        d();
                        this.y = tVar;
                        tVar.h(true, true);
                        invalidate();
                        mrVar.a(this.f, false);
                    }
                } else if (this.b) {
                    t tVar9 = this.y;
                    if (tVar9.c == null) {
                        if (!((tVar9.d != null) | (tVar9.e != null))) {
                            tVar9.b(true);
                            t tVar10 = new t(this, this.i0, j60Var);
                            tVar10.w = videoParticipant;
                            tVar10.g(this.b, false);
                            tVar10.h(true, false);
                            tVar10.E = true;
                            tVar10.setAlpha(0.0f);
                            this.E = this.y;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.N0 = ofFloat3;
                            ofFloat3.addUpdateListener(new ah.m0(18, this, tVar10));
                            this.N0.addListener(new z(this, tVar10));
                            this.N0.start();
                            d();
                            this.y = tVar10;
                            tVar10.h(true, false);
                            this.y.j(false);
                            l();
                        }
                    }
                    tVar9.b(false);
                    t tVar11 = new t(this, this.i0, j60Var);
                    t tVar12 = this.y;
                    l lVar11 = tVar12.c;
                    r20 r20Var6 = tVar12.d;
                    l lVar12 = tVar12.e;
                    tVar11.c = lVar11;
                    tVar11.d = r20Var6;
                    tVar11.e = lVar12;
                    tVar11.g(this.b, false);
                    tVar11.j(false);
                    l lVar13 = this.y.c;
                    if (lVar13 != null) {
                        lVar13.setRenderer(tVar11);
                    }
                    r20 r20Var7 = this.y.d;
                    if (r20Var7 != null) {
                        r20Var7.setRenderer(tVar11);
                    }
                    l lVar14 = this.y.e;
                    if (lVar14 != null) {
                        lVar14.setRenderer(tVar11);
                    }
                    tVar11.setAlpha(0.0f);
                    tVar11.setScaleX(0.5f);
                    tVar11.setScaleY(0.5f);
                    tVar11.E = true;
                    jn0 jn0Var = new jn0(28, this, tVar11);
                    if (tVar11.a.d.isFirstFrameRendered()) {
                        jn0Var.run();
                    } else {
                        AndroidUtilities.runOnUIThread(jn0Var, 250L);
                        tVar11.m0.add(jn0Var);
                    }
                    t tVar102 = new t(this, this.i0, j60Var);
                    tVar102.w = videoParticipant;
                    tVar102.g(this.b, false);
                    tVar102.h(true, false);
                    tVar102.E = true;
                    tVar102.setAlpha(0.0f);
                    this.E = this.y;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.N0 = ofFloat32;
                    ofFloat32.addUpdateListener(new ah.m0(18, this, tVar102));
                    this.N0.addListener(new z(this, tVar102));
                    this.N0.start();
                    d();
                    this.y = tVar102;
                    tVar102.h(true, false);
                    this.y.j(false);
                    l();
                } else {
                    this.b = true;
                    d();
                    t tVar13 = new t(this, this.i0, j60Var);
                    this.y = tVar13;
                    tVar13.w = videoParticipant;
                    tVar13.g(this.b, false);
                    this.y.h(true, false);
                    this.y.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.y, (Property<t, Float>) property, 0.0f, 1.0f);
                    this.N0 = ofFloat4;
                    ofFloat4.addListener(new a0(this));
                    this.N0.start();
                    invalidate();
                    mrVar.a(this.f, false);
                }
                d0Var.setEnabled(true);
            }
            boolean z11 = this.b;
            if (z10 != z11) {
                if (z11) {
                    d0Var.setVisibility(0);
                    this.l0.setVisibility(0);
                    this.e0.setVisibility(0);
                    this.f0.setVisibility(0);
                } else {
                    setUiVisible(true);
                    if (this.g0) {
                        this.g0 = false;
                        AndroidUtilities.cancelRunOnUIThread(this.h0);
                    }
                }
                i(true);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.c, this.b ? 1.0f : 0.0f);
                this.r = ofFloat5;
                ofFloat5.addUpdateListener(new v(this, i11));
                t tVar14 = this.y;
                tVar14.r = true;
                j60Var.getCurrentAccount();
                this.L0 = this.G0;
                this.x.lock();
                this.r.addListener(new b0(this, tVar14));
                this.r.setInterpolator(pr.f);
                this.r.setDuration(350L);
                o oVar2 = this.y.a;
                ValueAnimator valueAnimator4 = this.r;
                if (oVar2.E) {
                    oVar2.G.add(valueAnimator4);
                } else {
                    valueAnimator4.start();
                }
            }
            b(this.e == null);
        }
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (MessageObject.getPeerId(((t) arrayList.get(i10)).w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                ((t) arrayList.get(i10)).setAmplitude(f7);
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
        boolean z10 = j60.G3;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (j60.F3) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : AndroidUtilities.dp(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.n0.setVisibility((!j60.F3 || j60.G3) ? 8 : 0);
        f0 f0Var = this.f0;
        f0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.e0;
        textView2.measure(makeMeasureSpec2, i11);
        f0Var.getLayoutParams().width = AndroidUtilities.dp(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).rightMargin = j60.F3 ? AndroidUtilities.dp(45.0f) : 0;
        for (int i12 = 0; i12 < 2; i12++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.K0[i12].getLayoutParams();
            if (this.M0) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                marginLayoutParams.rightMargin = j60.F3 ? AndroidUtilities.dp(180.0f) : 0;
            }
        }
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x038e, code lost:
    
        if ((r18.getPointerCount() >= 2 && ((r17.w0 == r18.getPointerId(0) && r17.x0 == r18.getPointerId(1)) || (r17.w0 == r18.getPointerId(1) && r17.x0 == r18.getPointerId(0)))) == false) goto L178;
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
        boolean z11 = this.H0;
        j60 j60Var = this.j0;
        if ((z11 || this.G0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.H0 = false;
            if (this.G0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.I0) <= AndroidUtilities.dp(120.0f)) {
                    b(false);
                } else {
                    j60Var.e1(null);
                }
            }
            invalidate();
        }
        if (!this.b || (!(this.H0 || this.G0 || this.D0 || this.A0 || this.t0 || this.z0 || motionEvent.getActionMasked() == 0) || this.y == null)) {
            g();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.H0 = false;
            this.G0 = false;
            this.A0 = false;
            this.t0 = false;
            this.z0 = false;
        }
        if (motionEvent.getActionMasked() == 0 && this.J0 != null) {
            this.H0 = false;
            this.G0 = true;
            this.F0 = motionEvent.getY() - this.I0;
            this.J0.removeAllListeners();
            this.J0.cancel();
            this.J0 = null;
        } else if (this.J0 != null) {
            g();
            return false;
        }
        t tVar = this.y;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        q qVar = tVar.N;
        Rect rect = tVar.B0;
        qVar.getHitRect(rect);
        if (!rect.contains((int) x10, (int) y3)) {
            if (motionEvent.getActionMasked() == 0 && !this.G0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.y.getMeasuredWidth() + ((j60.F3 && this.V) ? -AndroidUtilities.dp(90.0f) : 0), this.y.getMeasuredHeight() + ((j60.F3 || !this.V) ? 0 : -AndroidUtilities.dp(90.0f)));
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C0 = System.currentTimeMillis();
                    this.D0 = true;
                    this.H0 = true;
                    this.E0 = motionEvent.getX();
                    this.F0 = motionEvent.getY();
                }
            } else if ((this.H0 || this.G0 || this.D0) && motionEvent.getActionMasked() == 2) {
                float abs = Math.abs(this.E0 - motionEvent.getX());
                float f7 = this.a;
                if (abs > f7 || Math.abs(this.F0 - motionEvent.getY()) > f7) {
                    this.D0 = false;
                }
                if (this.H0 && !this.z0 && Math.abs(this.F0 - motionEvent.getY()) > r10 * 2) {
                    this.F0 = motionEvent.getY();
                    this.H0 = false;
                    this.G0 = true;
                } else if (this.G0) {
                    this.I0 = motionEvent.getY() - this.F0;
                    invalidate();
                }
                if (this.H0 && Math.abs(this.E0 - motionEvent.getX()) > r10 * 4) {
                    this.H0 = false;
                }
            }
            if (this.D0 && motionEvent.getActionMasked() == 1 && System.currentTimeMillis() - this.C0 < 200) {
                this.D0 = false;
                if (this.L) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    g0 g0Var = this.I;
                    rectF2.set(g0Var.getX(), g0Var.getY(), g0Var.getX() + g0Var.getWidth(), g0Var.getY() + g0Var.getHeight());
                    if (this.i0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z12 = false;
                        z10 = false;
                        for (int i10 = 0; i10 < this.i0.visibleVideoParticipants.size(); i10++) {
                            if (this.M == MessageObject.getPeerId(this.i0.visibleVideoParticipants.get(i10).participant.peer)) {
                                j60Var.e1(this.i0.visibleVideoParticipants.get(i10));
                                z12 = true;
                                z10 = true;
                            }
                        }
                        if (!z12) {
                            j60Var.e1(new ChatObject.VideoParticipant((TLRPC.GroupCallParticipant) this.i0.participants.f(this.M), false, false));
                            z10 = true;
                        }
                        if (!z10) {
                            setUiVisible(!this.V);
                        }
                        this.I0 = 0.0f;
                        invalidate();
                    }
                }
                z10 = false;
                if (!z10) {
                }
                this.I0 = 0.0f;
                invalidate();
            }
            if (!this.y.W || this.G0) {
                g();
                if (this.D0 || this.G0 || this.H0) {
                    return true;
                }
            } else {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        p2 p2Var = this.y.a.d;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(p2Var.getX(), p2Var.getY(), p2Var.getX() + p2Var.getMeasuredWidth(), p2Var.getY() + p2Var.getMeasuredHeight());
                        rectF3.inset(((p2Var.getMeasuredHeight() * this.y.a.T) - p2Var.getMeasuredHeight()) / 2.0f, ((p2Var.getMeasuredWidth() * this.y.a.T) - p2Var.getMeasuredWidth()) / 2.0f);
                        if (j60.F3) {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.y.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                        } else {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.y.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                        }
                        boolean contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                        this.A0 = contains;
                        if (!contains) {
                            g();
                            return this.H0;
                        }
                    }
                    if (!this.t0 && motionEvent.getPointerCount() == 2) {
                        this.q0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        float x11 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.u0 = x11;
                        this.o0 = x11;
                        float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.v0 = y10;
                        this.p0 = y10;
                        this.y0 = 1.0f;
                        this.w0 = motionEvent.getPointerId(0);
                        this.x0 = motionEvent.getPointerId(1);
                        this.t0 = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.t0) {
                    int i11 = -1;
                    int i12 = -1;
                    for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                        if (this.w0 == motionEvent.getPointerId(i13)) {
                            i11 = i13;
                        }
                        if (this.x0 == motionEvent.getPointerId(i13)) {
                            i12 = i13;
                        }
                    }
                    if (i11 == -1 || i12 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                        return this.H0;
                    }
                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / this.q0;
                    this.y0 = hypot;
                    if (hypot > 1.005f && !this.z0) {
                        this.q0 = (float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11));
                        float x12 = (motionEvent.getX(i12) + motionEvent.getX(i11)) / 2.0f;
                        this.u0 = x12;
                        this.o0 = x12;
                        float y11 = (motionEvent.getY(i12) + motionEvent.getY(i11)) / 2.0f;
                        this.v0 = y11;
                        this.p0 = y11;
                        this.y0 = 1.0f;
                        this.r0 = 0.0f;
                        this.s0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.z0 = true;
                        this.t0 = true;
                    }
                    float x13 = (motionEvent.getX(i12) + motionEvent.getX(i11)) / 2.0f;
                    float y12 = (motionEvent.getY(i12) + motionEvent.getY(i11)) / 2.0f;
                    float f10 = this.o0 - x13;
                    float f11 = this.p0 - y12;
                    float f12 = -f10;
                    float f13 = this.y0;
                    this.r0 = f12 / f13;
                    this.s0 = (-f11) / f13;
                    invalidate();
                } else {
                    if (motionEvent.getActionMasked() != 1) {
                        if (motionEvent.getActionMasked() == 6) {
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                    g();
                }
                if (this.A0 || this.D0 || this.H0) {
                }
            }
        }
        return false;
    }

    public void setGroupCall(ChatObject.Call call) {
        this.i0 = call;
    }

    public void setIsTablet(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            d0 d0Var = this.k0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d0Var.getLayoutParams();
            layoutParams.gravity = z10 ? 85 : 51;
            layoutParams.rightMargin = z10 ? AndroidUtilities.dp(328.0f) : 0;
            layoutParams.bottomMargin = z10 ? -AndroidUtilities.dp(8.0f) : 0;
            if (this.M0) {
                d0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.a(-1);
            d0Var.setImageDrawable(g2Var);
        }
    }

    public void setProgressToHideUi(float f7) {
        if (this.W != f7) {
            this.W = f7;
            invalidate();
            t tVar = this.y;
            if (tVar != null) {
                tVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        l9 l9Var;
        boolean z11;
        long j3;
        if (!this.b || this.M0 || this.e == null || this.r != null || this.i0 == null) {
            if (this.L) {
                this.L = false;
                this.N = 0.0f;
                return;
            }
            return;
        }
        int currentAccount = this.j0.getCurrentAccount();
        long j10 = 500;
        if (System.currentTimeMillis() - this.O0 < 500) {
            if (this.P0 == null) {
                ig.t0 t0Var = new ig.t0(this, 21);
                this.P0 = t0Var;
                AndroidUtilities.runOnUIThread(t0Var, (System.currentTimeMillis() - this.O0) + 50);
                return;
            }
            return;
        }
        this.O0 = System.currentTimeMillis();
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int m10 = this.i0.currentSpeakingPeers.m();
            l9Var = this.J;
            if (i10 >= m10) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.i0.currentSpeakingPeers.f(this.i0.currentSpeakingPeers.j(i10));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.e.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                j3 = j10;
            } else {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                j3 = j10;
                if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j3) {
                    continue;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i11 == 0) {
                        this.M = MessageObject.getPeerId(groupCallParticipant.peer);
                    }
                    if (i11 < 3) {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            l9Var.b(i11, groupCallParticipant, currentAccount);
                            if (i11 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new e51(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new e51(AndroidUtilities.bold()), 0);
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
            j10 = j3;
        }
        boolean z12 = i11 != 0;
        boolean z13 = this.L;
        TextView textView = this.K;
        if (!z13 && z12) {
            z11 = false;
        } else {
            if (!z12 && z13) {
                this.L = z12;
                invalidate();
                return;
            }
            if (z13 && z12) {
                g0 g0Var = this.I;
                this.P = g0Var.getLeft();
                this.R = g0Var.getRight();
                this.Q = textView.getLeft();
                this.O = 0.0f;
            }
            z11 = z10;
        }
        if (!z12) {
            this.L = z12;
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
        this.L = z12;
        invalidate();
        while (i11 < 3) {
            l9Var.b(i11, null, currentAccount);
            i11++;
        }
        l9Var.a(z11);
    }
}
