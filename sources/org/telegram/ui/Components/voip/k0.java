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
import k7.b6;
import nh.n5;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.c60;
import org.telegram.ui.r30;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class k0 extends FrameLayout {
    public boolean A0;
    public t B;
    public float B0;
    public final RecyclerView C;
    public float C0;
    public final r30 D;
    public boolean D0;
    public final ArrayList E;
    public boolean E0;
    public final f0 F;
    public float F0;
    public final d9 G;
    public ValueAnimator G0;
    public final TextView H;
    public final UndoView[] H0;
    public boolean I;
    public boolean I0;
    public long J;
    public boolean J0;
    public float K;
    public ValueAnimator K0;
    public float L;
    public long L0;
    public float M;
    public n5 M0;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final GradientDrawable U;
    public final GradientDrawable V;
    public final kr W;
    public final int a;
    public final TextView a0;
    public boolean b;
    public final TextView b0;
    public float c;
    public final e0 c0;
    public long d;
    public boolean d0;
    public ChatObject.VideoParticipant e;
    public final tl0 e0;
    public boolean f;
    public ChatObject.Call f0;
    public final c60 g0;
    public long h;
    public final c0 h0;
    public final d0 i0;
    public final View j0;
    public final View k0;
    public float l0;
    public float m0;
    public float n;
    public float n0;
    public float o0;
    public float p0;
    public boolean q0;
    public ValueAnimator r;
    public float r0;
    public boolean s;
    public float s0;
    public int t0;
    public int u0;
    public final ImageView v;
    public float v0;
    public final LongSparseIntArray w;
    public boolean w0;
    public final AnimationNotificationsLocker x;
    public boolean x0;
    public t y;
    public ValueAnimator y0;
    public long z0;

    public k0(Context context, RecyclerView recyclerView, r30 r30Var, ArrayList arrayList, ChatObject.Call call, c60 c60Var) {
        super(context);
        this.w = new LongSparseIntArray();
        this.x = new AnimationNotificationsLocker();
        this.L = 1.0f;
        this.S = true;
        final v30 v30Var = (v30) this;
        this.e0 = new tl0(v30Var, 5);
        this.v0 = 1.0f;
        this.H0 = new UndoView[2];
        this.C = recyclerView;
        this.D = r30Var;
        this.E = arrayList;
        this.f0 = call;
        this.g0 = c60Var;
        c0 c0Var = new c0(context);
        this.h0 = c0Var;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        i2Var.a(-1);
        c0Var.setImageDrawable(i2Var);
        c0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        c0Var.setBackground(j6.f0(i0.a.k(-1, 55), 1, -1));
        View view = new View(context);
        this.j0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.k(-16777216, 114)});
        this.U = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, b6.c(120.0f, -1));
        View view2 = new View(context);
        this.k0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.k(-16777216, 114)});
        this.V = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((call == null || !h()) ? 8 : 0);
        addView(view2, b6.e(160, -1, 5));
        addView(c0Var, b6.e(56, -1, 51));
        final int i10 = 0;
        c0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        v30Var.N0.onBackPressed();
                        break;
                    default:
                        v30 v30Var2 = v30Var;
                        if (v30Var2.b) {
                            boolean z4 = !v30Var2.f;
                            v30Var2.f = z4;
                            v30Var2.W.a(z4, true);
                            v30Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        d0 d0Var = new d0(v30Var, context);
        this.i0 = d0Var;
        int dp = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, k10, k10);
        e0 e0Var = new e0(v30Var, context, i02);
        this.c0 = e0Var;
        final int i11 = 1;
        e0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        v30Var.N0.onBackPressed();
                        break;
                    default:
                        v30 v30Var2 = v30Var;
                        if (v30Var2.b) {
                            boolean z4 = !v30Var2.f;
                            v30Var2.f = z4;
                            v30Var2.W.a(z4, true);
                            v30Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        i02.setCallback(e0Var);
        addView(e0Var);
        kr krVar = new kr(context, R.drawable.msg_pin_filled, -1);
        this.W = krVar;
        float f10 = -AndroidUtilities.dp(1.0f);
        float dp2 = AndroidUtilities.dp(2.0f);
        float dp3 = AndroidUtilities.dp(1.0f);
        krVar.i = f10;
        krVar.j = dp2;
        krVar.k = dp3;
        krVar.invalidateSelf();
        d0Var.setImageDrawable(krVar);
        d0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(d0Var, b6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.a0 = textView;
        y3.t(textView, -1, 1, 15.0f);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.b0 = textView2;
        y3.t(textView2, -1, 1, 15.0f);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, b6.e(-2, -2, 51));
        addView(textView2, b6.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int dp4 = AndroidUtilities.dp(4.0f);
        imageView.setPadding(dp4, dp4, dp4, dp4);
        imageView.setBackground(j6.f0(i0.a.k(-1, 55), 1, -1));
        imageView.setOnClickListener(new rx0(8, v30Var, c60Var));
        addView(imageView, b6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        f0 f0Var = new f0(v30Var, context, j6.b0(AndroidUtilities.dp(18.0f), i0.a.k(j6.w0(null, j6.tg, false), 204)));
        this.F = f0Var;
        d9 d9Var = new d9(context, true);
        this.G = d9Var;
        d9Var.setStyle(10);
        f0Var.setClipChildren(false);
        f0Var.setClipToPadding(false);
        f0Var.addView(d9Var, b6.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.H = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        f0Var.addView(textView3, b6.e(-2, -2, 16));
        addView(f0Var, b6.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i12 = 0; i12 < 2; i12++) {
            this.H0[i12] = new g0(v30Var, context);
            this.H0[i12].setHideAnimationType(2);
            this.H0[i12].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.H0[i12], b6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.c0.setVisibility(8);
        setIsTablet(c60.D3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z4) {
        if (this.S != z4) {
            this.S = z4;
            c60 c60Var = ((v30) this).N0;
            if (c60Var.X1 != null) {
                c60Var.w3.a(!r1.S, true);
            }
            tl0 tl0Var = this.e0;
            if (!z4 || !this.b) {
                this.d0 = false;
                AndroidUtilities.cancelRunOnUIThread(tl0Var);
            } else if (!this.d0) {
                this.d0 = true;
                AndroidUtilities.runOnUIThread(tl0Var, 3000L);
            }
            t tVar = this.y;
            if (tVar != null) {
                tVar.requestLayout();
            }
        }
    }

    public final void b(boolean z4) {
        ValueAnimator ofFloat;
        int i10 = 0;
        if (this.D0) {
            this.D0 = false;
            float f10 = this.F0;
            float[] fArr = new float[2];
            if (z4) {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.G0 = ofFloat;
            ofFloat.addUpdateListener(new v(this, i10));
            this.G0.addListener(new b0(this, 0));
            ValueAnimator valueAnimator = this.G0;
            nr nrVar = nr.f;
            valueAnimator.setInterpolator(nrVar);
            this.G0.setDuration(z4 ? 350L : 200L);
            this.G0.setInterpolator(nrVar);
            t tVar = this.y;
            if (tVar != null) {
                o oVar = tVar.a;
                ValueAnimator valueAnimator2 = this.G0;
                if (oVar.B) {
                    oVar.D.add(valueAnimator2);
                } else {
                    valueAnimator2.start();
                }
            } else {
                this.G0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.E0 = false;
    }

    public final boolean c() {
        return (this.f || System.currentTimeMillis() - this.h <= 2000 || this.D0 || this.q0) ? false : true;
    }

    public final void d() {
        t tVar = this.y;
        if (tVar != null) {
            if (tVar.l0 || tVar.m0 != 0.0f) {
                tVar.l0 = false;
                tVar.m0 = 0.0f;
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
        r30 r30Var;
        t tVar2;
        t tVar3;
        UndoView[] undoViewArr;
        if (c60.D3) {
            this.P = true;
            super.dispatchDraw(canvas);
            this.P = false;
        }
        this.Q = true;
        super.dispatchDraw(canvas);
        this.Q = false;
        if (this.B != null || this.y != null) {
            RecyclerView recyclerView = this.C;
            float y10 = recyclerView.getY() - getTop();
            float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
            float f10 = this.c;
            canvas.save();
            boolean z4 = c60.D3;
            if (!z4 && (tVar = this.y) != null && !tVar.M && tVar.c != null) {
                float f11 = 1.0f - f10;
                canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            } else if (z4) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            t tVar4 = this.B;
            if (tVar4 != null && tVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.B.getX(), this.B.getY());
                this.B.draw(canvas);
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
                boolean z10 = this.D0 || this.G0 != null;
                if (z10 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((c60.C3 || c60.D3) ? 0 : AndroidUtilities.dp(90.0f)));
                }
                canvas.translate(this.y.getX(), this.y.getY());
                t tVar6 = this.y;
                float f12 = this.F0;
                if (tVar6.l0 != z10 || tVar6.m0 != f12) {
                    tVar6.l0 = z10;
                    tVar6.m0 = f12;
                    tVar6.a.invalidate();
                    tVar6.invalidate();
                }
                this.y.i(this.v0, this.r0, this.s0, this.o0, this.p0, this.w0 || this.y0 != null);
                this.y.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            UndoView[] undoViewArr2 = this.H0;
            if (undoViewArr2[i10].getVisibility() == 0) {
                canvas.save();
                float f13 = c60.C3 ? 0.0f : (1.0f - this.T) * (-AndroidUtilities.dp(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (c60.C3 ? 0 : AndroidUtilities.dp(90.0f))) + f13) - AndroidUtilities.dp(18.0f));
                if (this.J0) {
                    canvas.translate(undoViewArr2[i10].getX() - AndroidUtilities.dp(8.0f), undoViewArr2[i10].getY() - AndroidUtilities.dp(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i10].getX() - AndroidUtilities.dp(8.0f), ((undoViewArr2[i10].getY() - (c60.C3 ? 0 : AndroidUtilities.dp(90.0f))) + f13) - AndroidUtilities.dp(26.0f));
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
        float f14 = (1.0f - this.T) * this.c;
        ValueAnimator valueAnimator = this.K0;
        GradientDrawable gradientDrawable = this.V;
        GradientDrawable gradientDrawable2 = this.U;
        if (valueAnimator == null || (tVar2 = this.B) == null || (tVar3 = this.y) == null) {
            t tVar7 = this.y;
            if (tVar7 != null) {
                float f15 = 255.0f * f14;
                gradientDrawable2.setAlpha((int) ((1.0f - tVar7.U) * f15));
                gradientDrawable.setAlpha((int) ((1.0f - this.y.U) * f15));
            } else {
                int i11 = (int) (255.0f * f14);
                gradientDrawable2.setAlpha(i11);
                gradientDrawable.setAlpha(i11);
            }
        } else {
            boolean z11 = tVar2.T;
            boolean z12 = tVar3.T;
            int alpha = (int) ((z11 != z12 ? (!z12 ? 1.0f - tVar3.getAlpha() : tVar3.getAlpha()) * f14 : !z12 ? 0.0f : f14) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.h0.setAlpha(f14);
        boolean h = h();
        d0 d0Var = this.i0;
        ImageView imageView = this.v;
        if (h) {
            d0Var.setAlpha(0.0f);
            d0Var.setVisibility(4);
            imageView.setAlpha(f14);
            imageView.setVisibility(0);
            if (c60.C3) {
                imageView.setTranslationX((1.0f - this.T) * (-AndroidUtilities.dp(72.0f)));
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
        TextView textView = this.a0;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.b0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f);
        kr krVar = this.W;
        float f16 = krVar.g;
        float w10 = (e2.c.w(1.0f, f16, measuredWidth2, measuredWidth4 * f16) - AndroidUtilities.dp(21.0f)) - (c60.D3 ? AndroidUtilities.dp(328.0f) : c60.C3 ? AndroidUtilities.dp(180.0f) : 0);
        textView.setTranslationX(w10);
        textView2.setTranslationX(w10);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        e0 e0Var = this.c0;
        e0Var.setTranslationX(w10 - AndroidUtilities.dp(36.0f));
        e0Var.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - e0Var.getMeasuredHeight()) / 2.0f);
        d0Var.setTranslationX(w10 - AndroidUtilities.dp(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            e0Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - krVar.g) * f14);
            textView2.setAlpha(krVar.g * f14);
            e0Var.setAlpha(f14);
        }
        float f17 = this.L;
        f0 f0Var = this.F;
        if (f17 != 1.0f) {
            float f18 = f17 + 0.07272727f;
            this.L = f18;
            if (f18 > 1.0f) {
                this.L = 1.0f;
            } else {
                invalidate();
            }
            f0Var.invalidate();
        }
        boolean z13 = this.I;
        if (z13) {
            float f19 = this.K;
            if (f19 != 1.0f) {
                float f20 = f19 + 0.10666667f;
                this.K = f20;
                if (f20 > 1.0f) {
                    this.K = 1.0f;
                } else {
                    invalidate();
                }
                if (c60.C3) {
                    f0Var.setTranslationY((AndroidUtilities.dp(8.0f) * this.T) + ((1.0f - this.T) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + AndroidUtilities.dp(8.0f));
                } else {
                    f0Var.setTranslationY(AndroidUtilities.dp(16.0f));
                }
                f0Var.setAlpha(this.K * this.c);
                f0Var.setScaleX((this.K * 0.5f) + 0.5f);
                f0Var.setScaleY((this.K * 0.5f) + 0.5f);
                if (c60.D3) {
                    super.dispatchDraw(canvas);
                } else {
                    this.R = true;
                    super.dispatchDraw(canvas);
                    this.R = false;
                }
                r30Var = this.D;
                if (r30Var.getVisibility() != 0) {
                    for (int i12 = 0; i12 < r30Var.getChildCount(); i12++) {
                        s20 s20Var = (s20) r30Var.getChildAt(i12);
                        if (s20Var.getVisibility() == 0 && s20Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(r30Var.getX() + s20Var.getX(), r30Var.getY() + s20Var.getY());
                            canvas.scale(s20Var.getScaleX(), s20Var.getScaleY(), s20Var.getMeasuredWidth() / 2.0f, s20Var.getMeasuredHeight() / 2.0f);
                            s20Var.c(canvas);
                            canvas.restore();
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (!z13) {
            float f21 = this.K;
            if (f21 != 0.0f) {
                float f22 = f21 - 0.10666667f;
                this.K = f22;
                if (f22 < 0.0f) {
                    this.K = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        if (c60.C3) {
        }
        f0Var.setAlpha(this.K * this.c);
        f0Var.setScaleX((this.K * 0.5f) + 0.5f);
        f0Var.setScaleY((this.K * 0.5f) + 0.5f);
        if (c60.D3) {
        }
        r30Var = this.D;
        if (r30Var.getVisibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4 = this.Q;
        RecyclerView recyclerView = this.C;
        if (!z4) {
            UndoView[] undoViewArr = this.H0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof t) {
                    t tVar = (t) view;
                    if (tVar != this.y && tVar != this.B && !this.R && !tVar.v0) {
                        if (tVar.c == null) {
                            if (!c60.D3) {
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
                } else if (!this.P) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        } else if ((view instanceof t) && ((t) view).v0) {
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
        boolean z4 = this.d0;
        tl0 tl0Var = this.e0;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(tl0Var);
        }
        AndroidUtilities.runOnUIThread(tl0Var, 3000L);
        this.d0 = true;
    }

    public final void f(t tVar) {
        this.E.remove(tVar);
        long peerId = MessageObject.getPeerId(tVar.w.participant.peer);
        this.w.put(peerId, r2.get(peerId, 0) - 1);
    }

    public final void g() {
        k0 k0Var;
        if (this.w0) {
            this.w0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.y0 = ofFloat;
            k0Var = this;
            ofFloat.addUpdateListener(new fg.c(k0Var, this.v0, this.o0, this.p0, 1));
            k0Var.y0.addListener(new b0(this, 1));
            k0Var.y0.setDuration(350L);
            k0Var.y0.setInterpolator(nr.f);
            k0Var.y0.start();
            k0Var.h = System.currentTimeMillis();
        } else {
            k0Var = this;
        }
        k0Var.x0 = false;
        k0Var.q0 = false;
    }

    public UndoView getUndoView() {
        UndoView[] undoViewArr = this.H0;
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
        ChatObject.Call call = this.f0;
        return call != null && call.call.rtmp_stream;
    }

    public abstract void i(boolean z4);

    /* JADX WARN: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ChatObject.VideoParticipant videoParticipant) {
        t tVar;
        t tVar2;
        o oVar;
        l lVar;
        s20 s20Var;
        l lVar2;
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null && this.e == null) {
            return;
        }
        if (videoParticipant == null || !videoParticipant.equals(this.e)) {
            long peerId = videoParticipant == null ? 0L : MessageObject.getPeerId(videoParticipant.participant.peer);
            t tVar3 = this.y;
            if (tVar3 != null) {
                ArrayList arrayList = tVar3.j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((Runnable) arrayList.get(i10)).run();
                }
                arrayList.clear();
            }
            ValueAnimator valueAnimator = this.K0;
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
            boolean z4 = this.b;
            this.h = System.currentTimeMillis();
            c0 c0Var = this.h0;
            c60 c60Var = this.g0;
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
                        if (ChatObject.Call.videoIsActive(videoParticipant3.participant, videoParticipant3.presentation, this.f0)) {
                            this.y.h(false, true);
                        }
                    }
                    this.y.b(true);
                    l lVar3 = this.y.c;
                    if (lVar3 != null) {
                        lVar3.setRenderer(null);
                    }
                    s20 s20Var2 = this.y.d;
                    if (s20Var2 != null) {
                        s20Var2.setRenderer(null);
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
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.E;
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
                kr krVar = this.W;
                if (tVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        krVar.a(false, false);
                        this.y.b(false);
                        tVar.b(false);
                        if (!this.J0) {
                            t tVar6 = this.y;
                            if (tVar6.c != null || tVar6.d != null || tVar6.e != null) {
                                tVar2 = new t(this, this.f0, c60Var);
                                t tVar7 = this.y;
                                l lVar5 = tVar7.c;
                                s20 s20Var3 = tVar7.d;
                                l lVar6 = tVar7.e;
                                tVar2.c = lVar5;
                                tVar2.d = s20Var3;
                                tVar2.e = lVar6;
                                tVar2.g(this.b, false);
                                tVar2.j(false);
                                l lVar7 = this.y.c;
                                if (lVar7 != null) {
                                    lVar7.setRenderer(tVar2);
                                }
                                s20 s20Var4 = this.y.d;
                                if (s20Var4 != null) {
                                    s20Var4.setRenderer(tVar2);
                                }
                                l lVar8 = this.y.e;
                                if (lVar8 != null) {
                                    lVar8.setRenderer(tVar2);
                                }
                                t tVar8 = new t(this, this.f0, c60Var);
                                tVar8.w = tVar.w;
                                l lVar9 = tVar.c;
                                s20 s20Var5 = tVar.d;
                                l lVar10 = tVar.e;
                                tVar8.c = lVar9;
                                tVar8.d = s20Var5;
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
                                s20Var = tVar.d;
                                if (s20Var != null) {
                                    s20Var.setRenderer(tVar8);
                                }
                                lVar2 = tVar.e;
                                if (lVar2 != null) {
                                    lVar2.setRenderer(tVar8);
                                }
                                tVar8.B = true;
                                tVar8.setAlpha(0.0f);
                                this.B = this.y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tVar8, (Property<t, Float>) property, 0.0f, 1.0f);
                                this.K0 = ofFloat;
                                ofFloat.addListener(new i0(this, tVar8, tVar));
                                if (tVar2 != null) {
                                    tVar2.setAlpha(0.0f);
                                    tVar2.setScaleX(0.5f);
                                    tVar2.setScaleY(0.5f);
                                    tVar2.B = true;
                                }
                                m71 m71Var = new m71(this, tVar, tVar2, i11);
                                if (oVar.d.isFirstFrameRendered()) {
                                    AndroidUtilities.runOnUIThread(m71Var, 250L);
                                    tVar8.j0.add(m71Var);
                                } else {
                                    m71Var.run();
                                }
                                d();
                                this.y = tVar8;
                                tVar8.h(true, false);
                                l();
                            }
                        }
                        tVar2 = null;
                        t tVar82 = new t(this, this.f0, c60Var);
                        tVar82.w = tVar.w;
                        l lVar92 = tVar.c;
                        s20 s20Var52 = tVar.d;
                        l lVar102 = tVar.e;
                        tVar82.c = lVar92;
                        tVar82.d = s20Var52;
                        tVar82.e = lVar102;
                        tVar82.g(this.b, false);
                        tVar82.j(false);
                        oVar = tVar82.a;
                        oVar.d.setAlpha(1.0f);
                        oVar.e.setAlpha(1.0f);
                        lVar = tVar.c;
                        if (lVar != null) {
                        }
                        s20Var = tVar.d;
                        if (s20Var != null) {
                        }
                        lVar2 = tVar.e;
                        if (lVar2 != null) {
                        }
                        tVar82.B = true;
                        tVar82.setAlpha(0.0f);
                        this.B = this.y;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tVar82, (Property<t, Float>) property, 0.0f, 1.0f);
                        this.K0 = ofFloat2;
                        ofFloat2.addListener(new i0(this, tVar82, tVar));
                        if (tVar2 != null) {
                        }
                        m71 m71Var2 = new m71(this, tVar, tVar2, i11);
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
                        krVar.a(this.f, false);
                    }
                } else if (this.b) {
                    t tVar9 = this.y;
                    if (tVar9.c == null) {
                        if (!((tVar9.d != null) | (tVar9.e != null))) {
                            tVar9.b(true);
                            t tVar10 = new t(this, this.f0, c60Var);
                            tVar10.w = videoParticipant;
                            tVar10.g(this.b, false);
                            tVar10.h(true, false);
                            tVar10.B = true;
                            tVar10.setAlpha(0.0f);
                            this.B = this.y;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.K0 = ofFloat3;
                            ofFloat3.addUpdateListener(new ag.a(16, this, tVar10));
                            this.K0.addListener(new y(this, tVar10));
                            this.K0.start();
                            d();
                            this.y = tVar10;
                            tVar10.h(true, false);
                            this.y.j(false);
                            l();
                        }
                    }
                    tVar9.b(false);
                    t tVar11 = new t(this, this.f0, c60Var);
                    t tVar12 = this.y;
                    l lVar11 = tVar12.c;
                    s20 s20Var6 = tVar12.d;
                    l lVar12 = tVar12.e;
                    tVar11.c = lVar11;
                    tVar11.d = s20Var6;
                    tVar11.e = lVar12;
                    tVar11.g(this.b, false);
                    tVar11.j(false);
                    l lVar13 = this.y.c;
                    if (lVar13 != null) {
                        lVar13.setRenderer(tVar11);
                    }
                    s20 s20Var7 = this.y.d;
                    if (s20Var7 != null) {
                        s20Var7.setRenderer(tVar11);
                    }
                    l lVar14 = this.y.e;
                    if (lVar14 != null) {
                        lVar14.setRenderer(tVar11);
                    }
                    tVar11.setAlpha(0.0f);
                    tVar11.setScaleX(0.5f);
                    tVar11.setScaleY(0.5f);
                    tVar11.B = true;
                    k41 k41Var = new k41(10, this, tVar11);
                    if (tVar11.a.d.isFirstFrameRendered()) {
                        k41Var.run();
                    } else {
                        AndroidUtilities.runOnUIThread(k41Var, 250L);
                        tVar11.j0.add(k41Var);
                    }
                    t tVar102 = new t(this, this.f0, c60Var);
                    tVar102.w = videoParticipant;
                    tVar102.g(this.b, false);
                    tVar102.h(true, false);
                    tVar102.B = true;
                    tVar102.setAlpha(0.0f);
                    this.B = this.y;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.K0 = ofFloat32;
                    ofFloat32.addUpdateListener(new ag.a(16, this, tVar102));
                    this.K0.addListener(new y(this, tVar102));
                    this.K0.start();
                    d();
                    this.y = tVar102;
                    tVar102.h(true, false);
                    this.y.j(false);
                    l();
                } else {
                    this.b = true;
                    d();
                    t tVar13 = new t(this, this.f0, c60Var);
                    this.y = tVar13;
                    tVar13.w = videoParticipant;
                    tVar13.g(this.b, false);
                    this.y.h(true, false);
                    this.y.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.y, (Property<t, Float>) property, 0.0f, 1.0f);
                    this.K0 = ofFloat4;
                    ofFloat4.addListener(new z(this));
                    this.K0.start();
                    invalidate();
                    krVar.a(this.f, false);
                }
                c0Var.setEnabled(true);
            }
            boolean z10 = this.b;
            if (z4 != z10) {
                if (z10) {
                    c0Var.setVisibility(0);
                    this.i0.setVisibility(0);
                    this.b0.setVisibility(0);
                    this.c0.setVisibility(0);
                } else {
                    setUiVisible(true);
                    if (this.d0) {
                        this.d0 = false;
                        AndroidUtilities.cancelRunOnUIThread(this.e0);
                    }
                }
                i(true);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.c, this.b ? 1.0f : 0.0f);
                this.r = ofFloat5;
                ofFloat5.addUpdateListener(new v(this, i11));
                t tVar14 = this.y;
                tVar14.r = true;
                c60Var.getCurrentAccount();
                this.I0 = this.D0;
                this.x.lock();
                this.r.addListener(new a0(this, tVar14));
                this.r.setInterpolator(nr.f);
                this.r.setDuration(350L);
                o oVar2 = this.y.a;
                ValueAnimator valueAnimator4 = this.r;
                if (oVar2.B) {
                    oVar2.D.add(valueAnimator4);
                } else {
                    valueAnimator4.start();
                }
            }
            b(this.e == null);
        }
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (MessageObject.getPeerId(((t) arrayList.get(i10)).w.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                ((t) arrayList.get(i10)).setAmplitude(f10);
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
        boolean z4 = c60.D3;
        View view = this.j0;
        if (z4) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (c60.C3) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : AndroidUtilities.dp(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.k0.setVisibility((!c60.C3 || c60.D3) ? 8 : 0);
        e0 e0Var = this.c0;
        e0Var.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.a0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.b0;
        textView2.measure(makeMeasureSpec2, i11);
        e0Var.getLayoutParams().width = AndroidUtilities.dp(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.F.getLayoutParams()).rightMargin = c60.C3 ? AndroidUtilities.dp(45.0f) : 0;
        for (int i12 = 0; i12 < 2; i12++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.H0[i12].getLayoutParams();
            if (this.J0) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                marginLayoutParams.rightMargin = c60.C3 ? AndroidUtilities.dp(180.0f) : 0;
            }
        }
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x038e, code lost:
    
        if ((r18.getPointerCount() >= 2 && ((r17.t0 == r18.getPointerId(0) && r17.u0 == r18.getPointerId(1)) || (r17.t0 == r18.getPointerId(1) && r17.u0 == r18.getPointerId(0)))) == false) goto L178;
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
        boolean z4;
        boolean z10 = this.E0;
        c60 c60Var = this.g0;
        if ((z10 || this.D0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.E0 = false;
            if (this.D0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.F0) <= AndroidUtilities.dp(120.0f)) {
                    b(false);
                } else {
                    c60Var.e1(null);
                }
            }
            invalidate();
        }
        if (!this.b || (!(this.E0 || this.D0 || this.A0 || this.x0 || this.q0 || this.w0 || motionEvent.getActionMasked() == 0) || this.y == null)) {
            g();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.E0 = false;
            this.D0 = false;
            this.x0 = false;
            this.q0 = false;
            this.w0 = false;
        }
        if (motionEvent.getActionMasked() == 0 && this.G0 != null) {
            this.E0 = false;
            this.D0 = true;
            this.C0 = motionEvent.getY() - this.F0;
            this.G0.removeAllListeners();
            this.G0.cancel();
            this.G0 = null;
        } else if (this.G0 != null) {
            g();
            return false;
        }
        t tVar = this.y;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        q qVar = tVar.K;
        Rect rect = tVar.y0;
        qVar.getHitRect(rect);
        if (!rect.contains((int) x10, (int) y10)) {
            if (motionEvent.getActionMasked() == 0 && !this.D0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.y.getMeasuredWidth() + ((c60.C3 && this.S) ? -AndroidUtilities.dp(90.0f) : 0), this.y.getMeasuredHeight() + ((c60.C3 || !this.S) ? 0 : -AndroidUtilities.dp(90.0f)));
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.z0 = System.currentTimeMillis();
                    this.A0 = true;
                    this.E0 = true;
                    this.B0 = motionEvent.getX();
                    this.C0 = motionEvent.getY();
                }
            } else if ((this.E0 || this.D0 || this.A0) && motionEvent.getActionMasked() == 2) {
                float abs = Math.abs(this.B0 - motionEvent.getX());
                float f10 = this.a;
                if (abs > f10 || Math.abs(this.C0 - motionEvent.getY()) > f10) {
                    this.A0 = false;
                }
                if (this.E0 && !this.w0 && Math.abs(this.C0 - motionEvent.getY()) > r10 * 2) {
                    this.C0 = motionEvent.getY();
                    this.E0 = false;
                    this.D0 = true;
                } else if (this.D0) {
                    this.F0 = motionEvent.getY() - this.C0;
                    invalidate();
                }
                if (this.E0 && Math.abs(this.B0 - motionEvent.getX()) > r10 * 4) {
                    this.E0 = false;
                }
            }
            if (this.A0 && motionEvent.getActionMasked() == 1 && System.currentTimeMillis() - this.z0 < 200) {
                this.A0 = false;
                if (this.I) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    f0 f0Var = this.F;
                    rectF2.set(f0Var.getX(), f0Var.getY(), f0Var.getX() + f0Var.getWidth(), f0Var.getY() + f0Var.getHeight());
                    if (this.f0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z11 = false;
                        z4 = false;
                        for (int i10 = 0; i10 < this.f0.visibleVideoParticipants.size(); i10++) {
                            if (this.J == MessageObject.getPeerId(this.f0.visibleVideoParticipants.get(i10).participant.peer)) {
                                c60Var.e1(this.f0.visibleVideoParticipants.get(i10));
                                z11 = true;
                                z4 = true;
                            }
                        }
                        if (!z11) {
                            c60Var.e1(new ChatObject.VideoParticipant((TLRPC.GroupCallParticipant) this.f0.participants.f(this.J), false, false));
                            z4 = true;
                        }
                        if (!z4) {
                            setUiVisible(!this.S);
                        }
                        this.F0 = 0.0f;
                        invalidate();
                    }
                }
                z4 = false;
                if (!z4) {
                }
                this.F0 = 0.0f;
                invalidate();
            }
            if (!this.y.T || this.D0) {
                g();
                if (this.A0 || this.D0 || this.E0) {
                    return true;
                }
            } else {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        r2 r2Var = this.y.a.d;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(r2Var.getX(), r2Var.getY(), r2Var.getX() + r2Var.getMeasuredWidth(), r2Var.getY() + r2Var.getMeasuredHeight());
                        rectF3.inset(((r2Var.getMeasuredHeight() * this.y.a.Q) - r2Var.getMeasuredHeight()) / 2.0f, ((r2Var.getMeasuredWidth() * this.y.a.Q) - r2Var.getMeasuredWidth()) / 2.0f);
                        if (c60.C3) {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.y.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                        } else {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.y.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                        }
                        boolean contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                        this.x0 = contains;
                        if (!contains) {
                            g();
                            return this.E0;
                        }
                    }
                    if (!this.q0 && motionEvent.getPointerCount() == 2) {
                        this.n0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        float x11 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.r0 = x11;
                        this.l0 = x11;
                        float y11 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.s0 = y11;
                        this.m0 = y11;
                        this.v0 = 1.0f;
                        this.t0 = motionEvent.getPointerId(0);
                        this.u0 = motionEvent.getPointerId(1);
                        this.q0 = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.q0) {
                    int i11 = -1;
                    int i12 = -1;
                    for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                        if (this.t0 == motionEvent.getPointerId(i13)) {
                            i11 = i13;
                        }
                        if (this.u0 == motionEvent.getPointerId(i13)) {
                            i12 = i13;
                        }
                    }
                    if (i11 == -1 || i12 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                        return this.E0;
                    }
                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / this.n0;
                    this.v0 = hypot;
                    if (hypot > 1.005f && !this.w0) {
                        this.n0 = (float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11));
                        float x12 = (motionEvent.getX(i12) + motionEvent.getX(i11)) / 2.0f;
                        this.r0 = x12;
                        this.l0 = x12;
                        float y12 = (motionEvent.getY(i12) + motionEvent.getY(i11)) / 2.0f;
                        this.s0 = y12;
                        this.m0 = y12;
                        this.v0 = 1.0f;
                        this.o0 = 0.0f;
                        this.p0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.w0 = true;
                        this.q0 = true;
                    }
                    float x13 = (motionEvent.getX(i12) + motionEvent.getX(i11)) / 2.0f;
                    float y13 = (motionEvent.getY(i12) + motionEvent.getY(i11)) / 2.0f;
                    float f11 = this.l0 - x13;
                    float f12 = this.m0 - y13;
                    float f13 = -f11;
                    float f14 = this.v0;
                    this.o0 = f13 / f14;
                    this.p0 = (-f12) / f14;
                    invalidate();
                } else {
                    if (motionEvent.getActionMasked() != 1) {
                        if (motionEvent.getActionMasked() == 6) {
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                    g();
                }
                if (this.x0 || this.A0 || this.E0) {
                }
            }
        }
        return false;
    }

    public void setGroupCall(ChatObject.Call call) {
        this.f0 = call;
    }

    public void setIsTablet(boolean z4) {
        if (this.J0 != z4) {
            this.J0 = z4;
            c0 c0Var = this.h0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0Var.getLayoutParams();
            layoutParams.gravity = z4 ? 85 : 51;
            layoutParams.rightMargin = z4 ? AndroidUtilities.dp(328.0f) : 0;
            layoutParams.bottomMargin = z4 ? -AndroidUtilities.dp(8.0f) : 0;
            if (this.J0) {
                c0Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
            i2Var.a(-1);
            c0Var.setImageDrawable(i2Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.T != f10) {
            this.T = f10;
            invalidate();
            t tVar = this.y;
            if (tVar != null) {
                tVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z4) {
        d9 d9Var;
        boolean z10;
        long j10;
        if (!this.b || this.J0 || this.e == null || this.r != null || this.f0 == null) {
            if (this.I) {
                this.I = false;
                this.K = 0.0f;
                return;
            }
            return;
        }
        int currentAccount = this.g0.getCurrentAccount();
        long j11 = 500;
        if (System.currentTimeMillis() - this.L0 < 500) {
            if (this.M0 == null) {
                n5 n5Var = new n5(this, 19);
                this.M0 = n5Var;
                AndroidUtilities.runOnUIThread(n5Var, (System.currentTimeMillis() - this.L0) + 50);
                return;
            }
            return;
        }
        this.L0 = System.currentTimeMillis();
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int m9 = this.f0.currentSpeakingPeers.m();
            d9Var = this.G;
            if (i10 >= m9) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f0.currentSpeakingPeers.f(this.f0.currentSpeakingPeers.j(i10));
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
                        this.J = MessageObject.getPeerId(groupCallParticipant.peer);
                    }
                    if (i11 < 3) {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            d9Var.b(i11, groupCallParticipant, currentAccount);
                            if (i11 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new f51(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new f51(AndroidUtilities.bold()), 0);
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
        boolean z11 = i11 != 0;
        boolean z12 = this.I;
        TextView textView = this.H;
        if (!z12 && z11) {
            z10 = false;
        } else {
            if (!z11 && z12) {
                this.I = z11;
                invalidate();
                return;
            }
            if (z12 && z11) {
                f0 f0Var = this.F;
                this.M = f0Var.getLeft();
                this.O = f0Var.getRight();
                this.N = textView.getLeft();
                this.L = 0.0f;
            }
            z10 = z4;
        }
        if (!z11) {
            this.I = z11;
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
        this.I = z11;
        invalidate();
        while (i11 < 3) {
            d9Var.b(i11, null, currentAccount);
            i11++;
        }
        d9Var.a(z10);
    }
}
