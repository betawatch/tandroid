package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b40 extends FrameLayout {
    public final RectF D;
    public int E;
    public int F;
    public float G;
    public long H;
    public final float[] I;
    public boolean J;
    public final /* synthetic */ e40 K;
    public final org.telegram.ui.Components.dh0 a;
    public final TextView b;
    public final TLRPC.GroupCallParticipant c;
    public final org.telegram.ui.Components.ah0 d;
    public boolean e;
    public float f;
    public float h;
    public int n;
    public double r;
    public final Paint s;
    public final Paint w;
    public final Path x;
    public final float[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(e40 e40Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        this.K = e40Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new float[8];
        this.D = new RectF();
        this.I = new float[3];
        setWillNotDraw(false);
        this.c = groupCallParticipant;
        this.r = org.telegram.messenger.t3.H(groupCallParticipant) / 20000.0f;
        this.G = 1.0f;
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(R.raw.speaker, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.d = ah0Var;
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
        this.a = dh0Var;
        dh0Var.setScaleType(ImageView.ScaleType.CENTER);
        dh0Var.setAnimation(ah0Var);
        dh0Var.setTag(this.r == 0.0d ? 1 : null);
        addView(dh0Var, c8.ha.d(-2, 40.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        ah0Var.P(this.r == 0.0d ? 17 : 34);
        ah0Var.N(ah0Var.f - 1, false, true);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Vg, null);
        textView.setTextSize(1, 16.0f);
        double H = org.telegram.messenger.t3.H(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        textView.setText(((int) (H > 0.0d ? Math.max(H, 1.0d) : 0.0d)) + "%");
        textView.setPadding(org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(43.0f), 0, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(43.0f) : 0, 0);
        addView(textView, c8.ha.e(-2, -2, (org.telegram.messenger.id.a0 ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int H2 = (int) (org.telegram.messenger.t3.H(groupCallParticipant) / 100.0d);
        int i7 = 0;
        while (true) {
            float[] fArr = this.I;
            if (i7 >= fArr.length) {
                return;
            }
            if (H2 > (i7 == 0 ? 0 : i7 == 1 ? 50 : org.telegram.messenger.qs.g2)) {
                fArr[i7] = 1.0f;
            } else {
                fArr[i7] = 0.0f;
            }
            i7++;
        }
    }

    public final void a(double d, boolean z9) {
        e40 e40Var = this.K;
        org.telegram.messenger.c cVar = e40Var.k1;
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        this.r = d;
        TLRPC.GroupCallParticipant groupCallParticipant = this.c;
        groupCallParticipant.volume = (int) (d * 20000.0d);
        groupCallParticipant.volume_by_admin = false;
        groupCallParticipant.flags |= 128;
        double H = org.telegram.messenger.t3.H(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        this.b.setText(((int) (H > 0.0d ? Math.max(H, 1.0d) : 0.0d)) + "%");
        VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
        if (z9) {
            long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
            TLObject a22 = B1 > 0 ? org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(B1)) : org.telegram.messenger.qp.s1(cVar.a).M0(Long.valueOf(-B1));
            if (groupCallParticipant.volume == 0) {
                g30 g30Var = e40Var.W4;
                if (g30Var != null) {
                    g30Var.dismiss();
                    e40Var.W4 = null;
                }
                e40Var.f1(true);
                e40Var.C1(groupCallParticipant, B1, e40Var.S0() ? 0 : 5);
            } else {
                VoIPService.getSharedInstance().editCallMember(a22, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
            }
        }
        Integer num = this.r == 0.0d ? 1 : null;
        org.telegram.ui.Components.dh0 dh0Var = this.a;
        if ((dh0Var.getTag() != null || num == null) && (dh0Var.getTag() == null || num != null)) {
            return;
        }
        int i7 = this.r == 0.0d ? 17 : 34;
        org.telegram.ui.Components.ah0 ah0Var = this.d;
        ah0Var.P(i7);
        ah0Var.M(this.r != 0.0d ? 17 : 0);
        ah0Var.start();
        dh0Var.setTag(num);
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x10 = (int) motionEvent.getX();
                    this.n = x10;
                    if (x10 < 0) {
                        this.n = 0;
                    } else if (x10 > getMeasuredWidth()) {
                        this.n = getMeasuredWidth();
                    }
                    this.J = true;
                }
            }
            if (this.J) {
                if (motionEvent.getAction() == 1) {
                    a(this.n / getMeasuredWidth(), true);
                }
                this.J = false;
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.e) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f) > viewConfiguration.getScaledTouchSlop()) {
                    this.e = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        int x11 = (int) motionEvent.getX();
                        this.n = x11;
                        if (x11 < 0) {
                            this.n = 0;
                        } else if (x11 > getMeasuredWidth()) {
                            this.n = getMeasuredWidth();
                        }
                        this.J = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (this.J) {
                int x12 = (int) motionEvent.getX();
                this.n = x12;
                if (x12 < 0) {
                    this.n = 0;
                } else if (x12 > getMeasuredWidth()) {
                    this.n = getMeasuredWidth();
                }
                a(this.n / getMeasuredWidth(), false);
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float L;
        int i10;
        float f10;
        int i11;
        b40 b40Var = this;
        int i12 = b40Var.E;
        double d = b40Var.r;
        if (d < 0.25d) {
            b40Var.E = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            b40Var.E = -3562181;
        } else if (d < 0.5d || d > 0.75d) {
            b40Var.E = -11688225;
        } else {
            b40Var.E = -11027349;
        }
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (i12 == 0) {
            i7 = b40Var.E;
            b40Var.G = 1.0f;
        } else {
            int S0 = org.telegram.messenger.g0.S0(b40Var.G, 1.0f, b40Var.F, i12);
            if (i12 != b40Var.E) {
                b40Var.G = 0.0f;
                b40Var.F = S0;
            }
            i7 = S0;
        }
        Paint paint = b40Var.s;
        paint.setColor(i7);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - b40Var.H;
        if (j3 > 17) {
            j3 = 17;
        }
        b40Var.H = elapsedRealtime;
        float f13 = b40Var.G;
        if (f13 < 1.0f) {
            float f14 = (j3 / 200.0f) + f13;
            b40Var.G = f14;
            if (f14 > 1.0f) {
                b40Var.G = 1.0f;
            } else {
                b40Var.invalidate();
            }
        }
        Path path = b40Var.x;
        path.reset();
        float f15 = 6.0f;
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float[] fArr = b40Var.y;
        fArr[7] = L2;
        fArr[6] = L2;
        int i13 = 1;
        fArr[1] = L2;
        int i14 = 0;
        fArr[0] = L2;
        float L3 = org.telegram.messenger.g0.L(6.0f) * (b40Var.n < org.telegram.messenger.g0.L(12.0f) ? Math.max(0.0f, (b40Var.n - org.telegram.messenger.g0.L(6.0f)) / org.telegram.messenger.g0.L(6.0f)) : 1.0f);
        fArr[5] = L3;
        fArr[4] = L3;
        fArr[3] = L3;
        fArr[2] = L3;
        float f16 = b40Var.n;
        float measuredHeight = b40Var.getMeasuredHeight();
        RectF rectF = b40Var.D;
        rectF.set(0.0f, 0.0f, f16, measuredHeight);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int H = (int) (org.telegram.messenger.t3.H(b40Var.c) / 100.0d);
        org.telegram.ui.Components.dh0 dh0Var = b40Var.a;
        int L4 = org.telegram.messenger.g0.L(5.0f) + (dh0Var.getMeasuredWidth() / 2) + dh0Var.getLeft();
        int measuredHeight2 = (dh0Var.getMeasuredHeight() / 2) + dh0Var.getTop();
        int i15 = 0;
        while (true) {
            float[] fArr2 = b40Var.I;
            if (i15 >= fArr2.length) {
                return;
            }
            if (i15 == 0) {
                L = org.telegram.messenger.g0.L(f15);
                f10 = f11;
                i11 = i14;
            } else {
                if (i15 == i13) {
                    L = org.telegram.messenger.g0.L(10.0f);
                    i10 = 50;
                } else {
                    L = org.telegram.messenger.g0.L(14.0f);
                    i10 = org.telegram.messenger.qs.g2;
                }
                f10 = f11;
                i11 = i10;
            }
            float f17 = f12;
            float L5 = org.telegram.messenger.g0.L(2.0f);
            float f18 = fArr2[i15];
            float f19 = (f17 - f18) * L5;
            Paint paint2 = b40Var.w;
            paint2.setAlpha((int) (255.0f * f18));
            float f20 = L4;
            float f21 = measuredHeight2;
            rectF.set((f20 - L) + f19, (f21 - L) + f19, (f20 + L) - f19, (f21 + L) - f19);
            canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
            if (H > i11) {
                float f22 = fArr2[i15];
                if (f22 < f17) {
                    float f23 = (j3 / 180.0f) + f22;
                    fArr2[i15] = f23;
                    if (f23 > f17) {
                        fArr2[i15] = f17;
                    }
                    invalidate();
                }
            } else {
                float f24 = fArr2[i15];
                if (f24 > f10) {
                    float f25 = f24 - (j3 / 180.0f);
                    fArr2[i15] = f25;
                    if (f25 < f10) {
                        fArr2[i15] = f10;
                    }
                    invalidate();
                }
            }
            i15++;
            b40Var = this;
            canvas2 = canvas;
            f11 = f10;
            f12 = f17;
            f15 = 6.0f;
            i13 = 1;
            i14 = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
        this.n = (int) (View.MeasureSpec.getSize(i7) * this.r);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
