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
import g7.e6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.c30;
import org.telegram.ui.g30;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class k0 extends FrameLayout {
    public t A;
    public float A0;
    public final RecyclerView B;
    public float B0;
    public final c30 C;
    public boolean C0;
    public final ArrayList D;
    public boolean D0;
    public final f0 E;
    public float E0;
    public final c9 F;
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
    public mh.m2 L0;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final GradientDrawable T;
    public final GradientDrawable U;
    public final dr V;
    public final TextView W;
    public final int a;
    public final TextView a0;
    public boolean b;
    public final e0 b0;
    public float c;
    public boolean c0;
    public long d;
    public final ju0 d0;
    public ChatObject.VideoParticipant e;
    public ChatObject.Call e0;
    public boolean f;
    public final o50 f0;
    public final c0 g0;
    public long h;
    public final d0 h0;
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
    public t y;
    public long y0;
    public boolean z0;

    public k0(Context context, RecyclerView recyclerView, c30 c30Var, ArrayList arrayList, ChatObject.Call call, o50 o50Var) {
        super(context);
        this.w = new LongSparseIntArray();
        this.x = new AnimationNotificationsLocker();
        this.K = 1.0f;
        this.R = true;
        final g30 g30Var = (g30) this;
        this.d0 = new ju0(g30Var, 3);
        this.u0 = 1.0f;
        this.G0 = new UndoView[2];
        this.B = recyclerView;
        this.C = c30Var;
        this.D = arrayList;
        this.e0 = call;
        this.f0 = o50Var;
        c0 c0Var = new c0(context);
        this.g0 = c0Var;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.a(-1);
        c0Var.setImageDrawable(h2Var);
        c0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        c0Var.setBackground(f6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.i0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.T = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, e6.c(120.0f, -1));
        View view2 = new View(context);
        this.j0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.U = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((call == null || !h()) ? 8 : 0);
        addView(view2, e6.e(160, -1, 5));
        addView(c0Var, e6.e(56, -1, 51));
        final int i9 = 0;
        c0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i9) {
                    case 0:
                        g30Var.M0.onBackPressed();
                        break;
                    default:
                        g30 g30Var2 = g30Var;
                        if (g30Var2.b) {
                            boolean z10 = !g30Var2.f;
                            g30Var2.f = z10;
                            g30Var2.V.a(z10, true);
                            g30Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        d0 d0Var = new d0(g30Var, context);
        this.h0 = d0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = f6.i0(dp, dp, dp, dp, 0, k10, k10);
        e0 e0Var = new e0(g30Var, context, i02);
        this.b0 = e0Var;
        final int i10 = 1;
        e0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        g30Var.M0.onBackPressed();
                        break;
                    default:
                        g30 g30Var2 = g30Var;
                        if (g30Var2.b) {
                            boolean z10 = !g30Var2.f;
                            g30Var2.f = z10;
                            g30Var2.V.a(z10, true);
                            g30Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        i02.setCallback(e0Var);
        addView(e0Var);
        dr drVar = new dr(context, R.drawable.msg_pin_filled, -1);
        this.V = drVar;
        float f10 = -AndroidUtilities.dp(1.0f);
        float dp2 = AndroidUtilities.dp(2.0f);
        float dp3 = AndroidUtilities.dp(1.0f);
        drVar.i = f10;
        drVar.j = dp2;
        drVar.k = dp3;
        drVar.invalidateSelf();
        d0Var.setImageDrawable(drVar);
        d0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(d0Var, e6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.W = textView;
        org.telegram.messenger.l0.q(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.a0 = textView2;
        org.telegram.messenger.l0.q(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, e6.e(-2, -2, 51));
        addView(textView2, e6.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp4 = AndroidUtilities.dp(4.0f);
        imageView.setPadding(dp4, dp4, dp4, dp4);
        imageView.setBackground(f6.f0(i0.a.k(-1, 55), 1, -1));
        imageView.setOnClickListener(new vh0(10, g30Var, o50Var));
        addView(imageView, e6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        f0 f0Var = new f0(g30Var, context, f6.b0(AndroidUtilities.dp(18.0f), i0.a.k(f6.w0(null, f6.tg, false), 204)));
        this.E = f0Var;
        c9 c9Var = new c9(context, true);
        this.F = c9Var;
        c9Var.setStyle(10);
        f0Var.setClipChildren(false);
        f0Var.setClipToPadding(false);
        f0Var.addView(c9Var, e6.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        f0Var.addView(textView3, e6.e(-2, -2, 16));
        addView(f0Var, e6.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i11 = 0; i11 < 2; i11++) {
            this.G0[i11] = new g0(g30Var, context);
            this.G0[i11].setHideAnimationType(2);
            this.G0[i11].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.G0[i11], e6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.b0.setVisibility(8);
        setIsTablet(o50.C3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            o50 o50Var = ((g30) this).M0;
            if (o50Var.W1 != null) {
                o50Var.v3.a(!r1.R, true);
            }
            ju0 ju0Var = this.d0;
            if (!z10 || !this.b) {
                this.c0 = false;
                AndroidUtilities.cancelRunOnUIThread(ju0Var);
            } else if (!this.c0) {
                this.c0 = true;
                AndroidUtilities.runOnUIThread(ju0Var, 3000L);
            }
            t tVar = this.y;
            if (tVar != null) {
                tVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        int i9 = 0;
        if (this.C0) {
            this.C0 = false;
            float f10 = this.E0;
            float[] fArr = new float[2];
            if (z10) {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.F0 = ofFloat;
            ofFloat.addUpdateListener(new v(this, i9));
            this.F0.addListener(new b0(this, 0));
            ValueAnimator valueAnimator = this.F0;
            gr grVar = gr.f;
            valueAnimator.setInterpolator(grVar);
            this.F0.setDuration(z10 ? 350L : 200L);
            this.F0.setInterpolator(grVar);
            t tVar = this.y;
            if (tVar != null) {
                o oVar = tVar.a;
                ValueAnimator valueAnimator2 = this.F0;
                if (oVar.A) {
                    oVar.C.add(valueAnimator2);
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
        t tVar = this.y;
        if (tVar != null) {
            if (tVar.k0 || tVar.l0 != 0.0f) {
                tVar.k0 = false;
                tVar.l0 = 0.0f;
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
        c30 c30Var;
        t tVar2;
        t tVar3;
        UndoView[] undoViewArr;
        if (o50.C3) {
            this.O = true;
            super.dispatchDraw(canvas);
            this.O = false;
        }
        this.P = true;
        super.dispatchDraw(canvas);
        this.P = false;
        if (this.A != null || this.y != null) {
            RecyclerView recyclerView = this.B;
            float y10 = recyclerView.getY() - getTop();
            float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
            float f10 = this.c;
            canvas.save();
            boolean z10 = o50.C3;
            if (!z10 && (tVar = this.y) != null && !tVar.L && tVar.c != null) {
                float f11 = 1.0f - f10;
                canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            } else if (z10) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            t tVar4 = this.A;
            if (tVar4 != null && tVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.A.getX(), this.A.getY());
                this.A.draw(canvas);
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
                boolean z11 = this.C0 || this.F0 != null;
                if (z11 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((o50.B3 || o50.C3) ? 0 : AndroidUtilities.dp(90.0f)));
                }
                canvas.translate(this.y.getX(), this.y.getY());
                t tVar6 = this.y;
                float f12 = this.E0;
                if (tVar6.k0 != z11 || tVar6.l0 != f12) {
                    tVar6.k0 = z11;
                    tVar6.l0 = f12;
                    tVar6.a.invalidate();
                    tVar6.invalidate();
                }
                this.y.i(this.u0, this.q0, this.r0, this.n0, this.o0, this.v0 || this.x0 != null);
                this.y.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i9 = 0; i9 < 2; i9++) {
            UndoView[] undoViewArr2 = this.G0;
            if (undoViewArr2[i9].getVisibility() == 0) {
                canvas.save();
                float f13 = o50.B3 ? 0.0f : (1.0f - this.S) * (-AndroidUtilities.dp(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (o50.B3 ? 0 : AndroidUtilities.dp(90.0f))) + f13) - AndroidUtilities.dp(18.0f));
                if (this.I0) {
                    canvas.translate(undoViewArr2[i9].getX() - AndroidUtilities.dp(8.0f), undoViewArr2[i9].getY() - AndroidUtilities.dp(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i9].getX() - AndroidUtilities.dp(8.0f), ((undoViewArr2[i9].getY() - (o50.B3 ? 0 : AndroidUtilities.dp(90.0f))) + f13) - AndroidUtilities.dp(26.0f));
                }
                if (undoViewArr2[i9].getAlpha() != 1.0f) {
                    undoViewArr = undoViewArr2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, undoViewArr2[i9].getMeasuredWidth(), undoViewArr2[i9].getMeasuredHeight(), (int) (undoViewArr2[i9].getAlpha() * 255.0f), 31);
                } else {
                    undoViewArr = undoViewArr2;
                    canvas.save();
                }
                canvas.scale(undoViewArr[i9].getScaleX(), undoViewArr[i9].getScaleY(), undoViewArr[i9].getMeasuredWidth() / 2.0f, undoViewArr[i9].getMeasuredHeight() / 2.0f);
                undoViewArr[i9].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f14 = (1.0f - this.S) * this.c;
        ValueAnimator valueAnimator = this.J0;
        GradientDrawable gradientDrawable = this.U;
        GradientDrawable gradientDrawable2 = this.T;
        if (valueAnimator == null || (tVar2 = this.A) == null || (tVar3 = this.y) == null) {
            t tVar7 = this.y;
            if (tVar7 != null) {
                float f15 = 255.0f * f14;
                gradientDrawable2.setAlpha((int) ((1.0f - tVar7.T) * f15));
                gradientDrawable.setAlpha((int) ((1.0f - this.y.T) * f15));
            } else {
                int i10 = (int) (255.0f * f14);
                gradientDrawable2.setAlpha(i10);
                gradientDrawable.setAlpha(i10);
            }
        } else {
            boolean z12 = tVar2.S;
            boolean z13 = tVar3.S;
            int alpha = (int) ((z12 != z13 ? (!z13 ? 1.0f - tVar3.getAlpha() : tVar3.getAlpha()) * f14 : !z13 ? 0.0f : f14) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.g0.setAlpha(f14);
        boolean h = h();
        d0 d0Var = this.h0;
        ImageView imageView = this.v;
        if (h) {
            d0Var.setAlpha(0.0f);
            d0Var.setVisibility(4);
            imageView.setAlpha(f14);
            imageView.setVisibility(0);
            if (o50.B3) {
                imageView.setTranslationX((1.0f - this.S) * (-AndroidUtilities.dp(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        } else {
            d0Var.setAlpha(f14);
            d0Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        }
        int measuredWidth = getMeasuredWidth();
        TextView textView = this.W;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.a0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f);
        dr drVar = this.V;
        float f16 = drVar.g;
        float z14 = (e2.c.z(1.0f, f16, measuredWidth2, measuredWidth4 * f16) - AndroidUtilities.dp(21.0f)) - (o50.C3 ? AndroidUtilities.dp(328.0f) : o50.B3 ? AndroidUtilities.dp(180.0f) : 0);
        textView.setTranslationX(z14);
        textView2.setTranslationX(z14);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        e0 e0Var = this.b0;
        e0Var.setTranslationX(z14 - AndroidUtilities.dp(36.0f));
        e0Var.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - e0Var.getMeasuredHeight()) / 2.0f);
        d0Var.setTranslationX(z14 - AndroidUtilities.dp(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            e0Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - drVar.g) * f14);
            textView2.setAlpha(drVar.g * f14);
            e0Var.setAlpha(f14);
        }
        float f17 = this.K;
        f0 f0Var = this.E;
        if (f17 != 1.0f) {
            float f18 = f17 + 0.07272727f;
            this.K = f18;
            if (f18 > 1.0f) {
                this.K = 1.0f;
            } else {
                invalidate();
            }
            f0Var.invalidate();
        }
        boolean z15 = this.H;
        if (z15) {
            float f19 = this.J;
            if (f19 != 1.0f) {
                float f20 = f19 + 0.10666667f;
                this.J = f20;
                if (f20 > 1.0f) {
                    this.J = 1.0f;
                } else {
                    invalidate();
                }
                if (o50.B3) {
                    f0Var.setTranslationY((AndroidUtilities.dp(8.0f) * this.S) + ((1.0f - this.S) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + AndroidUtilities.dp(8.0f));
                } else {
                    f0Var.setTranslationY(AndroidUtilities.dp(16.0f));
                }
                f0Var.setAlpha(this.J * this.c);
                f0Var.setScaleX((this.J * 0.5f) + 0.5f);
                f0Var.setScaleY((this.J * 0.5f) + 0.5f);
                if (o50.C3) {
                    super.dispatchDraw(canvas);
                } else {
                    this.Q = true;
                    super.dispatchDraw(canvas);
                    this.Q = false;
                }
                c30Var = this.C;
                if (c30Var.getVisibility() != 0) {
                    for (int i11 = 0; i11 < c30Var.getChildCount(); i11++) {
                        b20 b20Var = (b20) c30Var.getChildAt(i11);
                        if (b20Var.getVisibility() == 0 && b20Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(c30Var.getX() + b20Var.getX(), c30Var.getY() + b20Var.getY());
                            canvas.scale(b20Var.getScaleX(), b20Var.getScaleY(), b20Var.getMeasuredWidth() / 2.0f, b20Var.getMeasuredHeight() / 2.0f);
                            b20Var.c(canvas);
                            canvas.restore();
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (!z15) {
            float f21 = this.J;
            if (f21 != 0.0f) {
                float f22 = f21 - 0.10666667f;
                this.J = f22;
                if (f22 < 0.0f) {
                    this.J = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        if (o50.B3) {
        }
        f0Var.setAlpha(this.J * this.c);
        f0Var.setScaleX((this.J * 0.5f) + 0.5f);
        f0Var.setScaleY((this.J * 0.5f) + 0.5f);
        if (o50.C3) {
        }
        c30Var = this.C;
        if (c30Var.getVisibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.P;
        RecyclerView recyclerView = this.B;
        if (!z10) {
            UndoView[] undoViewArr = this.G0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof t) {
                    t tVar = (t) view;
                    if (tVar != this.y && tVar != this.A && !this.Q && !tVar.u0) {
                        if (tVar.c == null) {
                            if (!o50.C3) {
                                return super.drawChild(canvas, view, j10);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild;
                        }
                        float y10 = recyclerView.getY() - getTop();
                        float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                        float f10 = this.c;
                        if (tVar.d == null) {
                            f10 = 0.0f;
                        }
                        canvas.save();
                        float f11 = 1.0f - f10;
                        canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                } else if (!this.O) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        } else if ((view instanceof t) && ((t) view).u0) {
            float y11 = recyclerView.getY() - getTop();
            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y11, getMeasuredWidth(), measuredHeight2);
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        return true;
    }

    public final void e() {
        boolean z10 = this.c0;
        ju0 ju0Var = this.d0;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(ju0Var);
        }
        AndroidUtilities.runOnUIThread(ju0Var, 3000L);
        this.c0 = true;
    }

    public final void f(t tVar) {
        this.D.remove(tVar);
        long peerId = MessageObject.getPeerId(tVar.w.participant.peer);
        this.w.put(peerId, r2.get(peerId, 0) - 1);
    }

    public final void g() {
        k0 k0Var;
        if (this.v0) {
            this.v0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.x0 = ofFloat;
            k0Var = this;
            ofFloat.addUpdateListener(new ag.c(k0Var, this.u0, this.n0, this.o0, 1));
            k0Var.x0.addListener(new b0(this, 1));
            k0Var.x0.setDuration(350L);
            k0Var.x0.setInterpolator(gr.f);
            k0Var.x0.start();
            k0Var.h = System.currentTimeMillis();
        } else {
            k0Var = this;
        }
        k0Var.w0 = false;
        k0Var.p0 = false;
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
        t tVar;
        t tVar2;
        o oVar;
        l lVar;
        b20 b20Var;
        l lVar2;
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null && this.e == null) {
            return;
        }
        if (videoParticipant == null || !videoParticipant.equals(this.e)) {
            long peerId = videoParticipant == null ? 0L : MessageObject.getPeerId(videoParticipant.participant.peer);
            t tVar3 = this.y;
            if (tVar3 != null) {
                ArrayList arrayList = tVar3.i0;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((Runnable) arrayList.get(i9)).run();
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
            int i10 = 1;
            if (sharedInstance != null && videoParticipant != null) {
                sharedInstance.requestFullScreen(videoParticipant.participant, true, videoParticipant.presentation);
            }
            this.d = peerId;
            boolean z10 = this.b;
            this.h = System.currentTimeMillis();
            c0 c0Var = this.g0;
            o50 o50Var = this.f0;
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
                        if (ChatObject.Call.videoIsActive(videoParticipant3.participant, videoParticipant3.presentation, this.e0)) {
                            this.y.h(false, true);
                        }
                    }
                    this.y.b(true);
                    l lVar3 = this.y.c;
                    if (lVar3 != null) {
                        lVar3.setRenderer(null);
                    }
                    b20 b20Var2 = this.y.d;
                    if (b20Var2 != null) {
                        b20Var2.setRenderer(null);
                    }
                    l lVar4 = this.y.e;
                    if (lVar4 != null) {
                        lVar4.setRenderer(null);
                    }
                    t tVar5 = this.y;
                    tVar5.animate().alpha(0.0f).setListener(new h0(this, tVar5)).setDuration(350L).start();
                }
                c0Var.setEnabled(false);
                this.f = false;
            } else {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.D;
                    if (i11 >= arrayList2.size()) {
                        tVar = null;
                        break;
                    } else {
                        if (((t) arrayList2.get(i11)).w.equals(videoParticipant)) {
                            tVar = (t) arrayList2.get(i11);
                            break;
                        }
                        i11++;
                    }
                }
                Property property = View.ALPHA;
                dr drVar = this.V;
                if (tVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        drVar.a(false, false);
                        this.y.b(false);
                        tVar.b(false);
                        if (!this.I0) {
                            t tVar6 = this.y;
                            if (tVar6.c != null || tVar6.d != null || tVar6.e != null) {
                                tVar2 = new t(this, this.e0, o50Var);
                                t tVar7 = this.y;
                                l lVar5 = tVar7.c;
                                b20 b20Var3 = tVar7.d;
                                l lVar6 = tVar7.e;
                                tVar2.c = lVar5;
                                tVar2.d = b20Var3;
                                tVar2.e = lVar6;
                                tVar2.g(this.b, false);
                                tVar2.j(false);
                                l lVar7 = this.y.c;
                                if (lVar7 != null) {
                                    lVar7.setRenderer(tVar2);
                                }
                                b20 b20Var4 = this.y.d;
                                if (b20Var4 != null) {
                                    b20Var4.setRenderer(tVar2);
                                }
                                l lVar8 = this.y.e;
                                if (lVar8 != null) {
                                    lVar8.setRenderer(tVar2);
                                }
                                t tVar8 = new t(this, this.e0, o50Var);
                                tVar8.w = tVar.w;
                                l lVar9 = tVar.c;
                                b20 b20Var5 = tVar.d;
                                l lVar10 = tVar.e;
                                tVar8.c = lVar9;
                                tVar8.d = b20Var5;
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
                                b20Var = tVar.d;
                                if (b20Var != null) {
                                    b20Var.setRenderer(tVar8);
                                }
                                lVar2 = tVar.e;
                                if (lVar2 != null) {
                                    lVar2.setRenderer(tVar8);
                                }
                                tVar8.A = true;
                                tVar8.setAlpha(0.0f);
                                this.A = this.y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tVar8, (Property<t, Float>) property, 0.0f, 1.0f);
                                this.J0 = ofFloat;
                                ofFloat.addListener(new i0(this, tVar8, tVar));
                                if (tVar2 != null) {
                                    tVar2.setAlpha(0.0f);
                                    tVar2.setScaleX(0.5f);
                                    tVar2.setScaleY(0.5f);
                                    tVar2.A = true;
                                }
                                ue0 ue0Var = new ue0(this, tVar, tVar2, 19);
                                if (oVar.d.isFirstFrameRendered()) {
                                    AndroidUtilities.runOnUIThread(ue0Var, 250L);
                                    tVar8.i0.add(ue0Var);
                                } else {
                                    ue0Var.run();
                                }
                                d();
                                this.y = tVar8;
                                tVar8.h(true, false);
                                l();
                            }
                        }
                        tVar2 = null;
                        t tVar82 = new t(this, this.e0, o50Var);
                        tVar82.w = tVar.w;
                        l lVar92 = tVar.c;
                        b20 b20Var52 = tVar.d;
                        l lVar102 = tVar.e;
                        tVar82.c = lVar92;
                        tVar82.d = b20Var52;
                        tVar82.e = lVar102;
                        tVar82.g(this.b, false);
                        tVar82.j(false);
                        oVar = tVar82.a;
                        oVar.d.setAlpha(1.0f);
                        oVar.e.setAlpha(1.0f);
                        lVar = tVar.c;
                        if (lVar != null) {
                        }
                        b20Var = tVar.d;
                        if (b20Var != null) {
                        }
                        lVar2 = tVar.e;
                        if (lVar2 != null) {
                        }
                        tVar82.A = true;
                        tVar82.setAlpha(0.0f);
                        this.A = this.y;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tVar82, (Property<t, Float>) property, 0.0f, 1.0f);
                        this.J0 = ofFloat2;
                        ofFloat2.addListener(new i0(this, tVar82, tVar));
                        if (tVar2 != null) {
                        }
                        ue0 ue0Var2 = new ue0(this, tVar, tVar2, 19);
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
                        drVar.a(this.f, false);
                    }
                } else if (this.b) {
                    t tVar9 = this.y;
                    if (tVar9.c == null) {
                        if (!((tVar9.d != null) | (tVar9.e != null))) {
                            tVar9.b(true);
                            t tVar10 = new t(this, this.e0, o50Var);
                            tVar10.w = videoParticipant;
                            tVar10.g(this.b, false);
                            tVar10.h(true, false);
                            tVar10.A = true;
                            tVar10.setAlpha(0.0f);
                            this.A = this.y;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.J0 = ofFloat3;
                            ofFloat3.addUpdateListener(new f2.g(13, this, tVar10));
                            this.J0.addListener(new y(this, tVar10));
                            this.J0.start();
                            d();
                            this.y = tVar10;
                            tVar10.h(true, false);
                            this.y.j(false);
                            l();
                        }
                    }
                    tVar9.b(false);
                    t tVar11 = new t(this, this.e0, o50Var);
                    t tVar12 = this.y;
                    l lVar11 = tVar12.c;
                    b20 b20Var6 = tVar12.d;
                    l lVar12 = tVar12.e;
                    tVar11.c = lVar11;
                    tVar11.d = b20Var6;
                    tVar11.e = lVar12;
                    tVar11.g(this.b, false);
                    tVar11.j(false);
                    l lVar13 = this.y.c;
                    if (lVar13 != null) {
                        lVar13.setRenderer(tVar11);
                    }
                    b20 b20Var7 = this.y.d;
                    if (b20Var7 != null) {
                        b20Var7.setRenderer(tVar11);
                    }
                    l lVar14 = this.y.e;
                    if (lVar14 != null) {
                        lVar14.setRenderer(tVar11);
                    }
                    tVar11.setAlpha(0.0f);
                    tVar11.setScaleX(0.5f);
                    tVar11.setScaleY(0.5f);
                    tVar11.A = true;
                    p61 p61Var = new p61(4, this, tVar11);
                    if (tVar11.a.d.isFirstFrameRendered()) {
                        p61Var.run();
                    } else {
                        AndroidUtilities.runOnUIThread(p61Var, 250L);
                        tVar11.i0.add(p61Var);
                    }
                    t tVar102 = new t(this, this.e0, o50Var);
                    tVar102.w = videoParticipant;
                    tVar102.g(this.b, false);
                    tVar102.h(true, false);
                    tVar102.A = true;
                    tVar102.setAlpha(0.0f);
                    this.A = this.y;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J0 = ofFloat32;
                    ofFloat32.addUpdateListener(new f2.g(13, this, tVar102));
                    this.J0.addListener(new y(this, tVar102));
                    this.J0.start();
                    d();
                    this.y = tVar102;
                    tVar102.h(true, false);
                    this.y.j(false);
                    l();
                } else {
                    this.b = true;
                    d();
                    t tVar13 = new t(this, this.e0, o50Var);
                    this.y = tVar13;
                    tVar13.w = videoParticipant;
                    tVar13.g(this.b, false);
                    this.y.h(true, false);
                    this.y.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.y, (Property<t, Float>) property, 0.0f, 1.0f);
                    this.J0 = ofFloat4;
                    ofFloat4.addListener(new z(this));
                    this.J0.start();
                    invalidate();
                    drVar.a(this.f, false);
                }
                c0Var.setEnabled(true);
            }
            boolean z11 = this.b;
            if (z10 != z11) {
                if (z11) {
                    c0Var.setVisibility(0);
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
                ofFloat5.addUpdateListener(new v(this, i10));
                t tVar14 = this.y;
                tVar14.r = true;
                o50Var.getCurrentAccount();
                this.H0 = this.C0;
                this.x.lock();
                this.r.addListener(new a0(this, tVar14));
                this.r.setInterpolator(gr.f);
                this.r.setDuration(350L);
                o oVar2 = this.y.a;
                ValueAnimator valueAnimator4 = this.r;
                if (oVar2.A) {
                    oVar2.C.add(valueAnimator4);
                } else {
                    valueAnimator4.start();
                }
            }
            b(this.e == null);
        }
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i9 >= arrayList.size()) {
                return;
            }
            if (MessageObject.getPeerId(((t) arrayList.get(i9)).w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                ((t) arrayList.get(i9)).setAmplitude(f10);
            }
            i9++;
        }
    }

    public abstract void l();

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z10 = o50.C3;
        View view = this.i0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (o50.B3) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : AndroidUtilities.dp(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.j0.setVisibility((!o50.B3 || o50.C3) ? 8 : 0);
        e0 e0Var = this.b0;
        e0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 0);
        TextView textView = this.W;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 0);
        TextView textView2 = this.a0;
        textView2.measure(makeMeasureSpec2, i10);
        e0Var.getLayoutParams().width = AndroidUtilities.dp(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.E.getLayoutParams()).rightMargin = o50.B3 ? AndroidUtilities.dp(45.0f) : 0;
        for (int i11 = 0; i11 < 2; i11++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G0[i11].getLayoutParams();
            if (this.I0) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                marginLayoutParams.rightMargin = o50.B3 ? AndroidUtilities.dp(180.0f) : 0;
            }
        }
        super.onMeasure(i9, i10);
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
        o50 o50Var = this.f0;
        if ((z11 || this.C0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.D0 = false;
            if (this.C0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.E0) <= AndroidUtilities.dp(120.0f)) {
                    b(false);
                } else {
                    o50Var.e1(null);
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
        t tVar = this.y;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        q qVar = tVar.J;
        Rect rect = tVar.x0;
        qVar.getHitRect(rect);
        if (!rect.contains((int) x10, (int) y10)) {
            if (motionEvent.getActionMasked() == 0 && !this.C0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.y.getMeasuredWidth() + ((o50.B3 && this.R) ? -AndroidUtilities.dp(90.0f) : 0), this.y.getMeasuredHeight() + ((o50.B3 || !this.R) ? 0 : -AndroidUtilities.dp(90.0f)));
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.y0 = System.currentTimeMillis();
                    this.z0 = true;
                    this.D0 = true;
                    this.A0 = motionEvent.getX();
                    this.B0 = motionEvent.getY();
                }
            } else if ((this.D0 || this.C0 || this.z0) && motionEvent.getActionMasked() == 2) {
                float abs = Math.abs(this.A0 - motionEvent.getX());
                float f10 = this.a;
                if (abs > f10 || Math.abs(this.B0 - motionEvent.getY()) > f10) {
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
                    f0 f0Var = this.E;
                    rectF2.set(f0Var.getX(), f0Var.getY(), f0Var.getX() + f0Var.getWidth(), f0Var.getY() + f0Var.getHeight());
                    if (this.e0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z12 = false;
                        z10 = false;
                        for (int i9 = 0; i9 < this.e0.visibleVideoParticipants.size(); i9++) {
                            if (this.I == MessageObject.getPeerId(this.e0.visibleVideoParticipants.get(i9).participant.peer)) {
                                o50Var.e1(this.e0.visibleVideoParticipants.get(i9));
                                z12 = true;
                                z10 = true;
                            }
                        }
                        if (!z12) {
                            o50Var.e1(new ChatObject.VideoParticipant((TLRPC.GroupCallParticipant) this.e0.participants.f(this.I), false, false));
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
                        q2 q2Var = this.y.a.d;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(q2Var.getX(), q2Var.getY(), q2Var.getX() + q2Var.getMeasuredWidth(), q2Var.getY() + q2Var.getMeasuredHeight());
                        rectF3.inset(((q2Var.getMeasuredHeight() * this.y.a.P) - q2Var.getMeasuredHeight()) / 2.0f, ((q2Var.getMeasuredWidth() * this.y.a.P) - q2Var.getMeasuredWidth()) / 2.0f);
                        if (o50.B3) {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.y.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                        } else {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
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
                        float x11 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.q0 = x11;
                        this.k0 = x11;
                        float y11 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.r0 = y11;
                        this.l0 = y11;
                        this.u0 = 1.0f;
                        this.s0 = motionEvent.getPointerId(0);
                        this.t0 = motionEvent.getPointerId(1);
                        this.p0 = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.p0) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                        if (this.s0 == motionEvent.getPointerId(i12)) {
                            i10 = i12;
                        }
                        if (this.t0 == motionEvent.getPointerId(i12)) {
                            i11 = i12;
                        }
                    }
                    if (i10 == -1 || i11 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                        return this.D0;
                    }
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.m0;
                    this.u0 = hypot;
                    if (hypot > 1.005f && !this.v0) {
                        this.m0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        this.q0 = x12;
                        this.k0 = x12;
                        float y12 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        this.r0 = y12;
                        this.l0 = y12;
                        this.u0 = 1.0f;
                        this.n0 = 0.0f;
                        this.o0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.v0 = true;
                        this.p0 = true;
                    }
                    float x13 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    float y13 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    float f11 = this.k0 - x13;
                    float f12 = this.l0 - y13;
                    float f13 = -f11;
                    float f14 = this.u0;
                    this.n0 = f13 / f14;
                    this.o0 = (-f12) / f14;
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
            c0 c0Var = this.g0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0Var.getLayoutParams();
            layoutParams.gravity = z10 ? 85 : 51;
            layoutParams.rightMargin = z10 ? AndroidUtilities.dp(328.0f) : 0;
            layoutParams.bottomMargin = z10 ? -AndroidUtilities.dp(8.0f) : 0;
            if (this.I0) {
                c0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            h2Var.a(-1);
            c0Var.setImageDrawable(h2Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidate();
            t tVar = this.y;
            if (tVar != null) {
                tVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        c9 c9Var;
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
                mh.m2 m2Var = new mh.m2(this, 5);
                this.L0 = m2Var;
                AndroidUtilities.runOnUIThread(m2Var, (System.currentTimeMillis() - this.K0) + 50);
                return;
            }
            return;
        }
        this.K0 = System.currentTimeMillis();
        SpannableStringBuilder spannableStringBuilder = null;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int m10 = this.e0.currentSpeakingPeers.m();
            c9Var = this.F;
            if (i9 >= m10) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e0.currentSpeakingPeers.f(this.e0.currentSpeakingPeers.j(i9));
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
                    if (i10 == 0) {
                        this.I = MessageObject.getPeerId(groupCallParticipant.peer);
                    }
                    if (i10 < 3) {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            c9Var.b(i10, groupCallParticipant, currentAccount);
                            if (i10 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new i41(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new i41(AndroidUtilities.bold()), 0);
                            }
                        }
                    }
                    i10++;
                    if (i10 == 3) {
                        break;
                    }
                }
            }
            i9++;
            j11 = j10;
        }
        boolean z12 = i10 != 0;
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
                f0 f0Var = this.E;
                this.L = f0Var.getLeft();
                this.N = f0Var.getRight();
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
        String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i10);
        int indexOf = pluralString.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i10 != 0 ? i10 == 1 ? AndroidUtilities.dp(40.0f) : i10 == 2 ? AndroidUtilities.dp(64.0f) : AndroidUtilities.dp(88.0f) : 0;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
        this.H = z12;
        invalidate();
        while (i10 < 3) {
            c9Var.b(i10, null, currentAccount);
            i10++;
        }
        c9Var.a(z11);
    }
}
