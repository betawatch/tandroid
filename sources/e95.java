// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e95 extends FrameLayout {
    public final RectF E;
    public int F;
    public int G;
    public float H;
    public long I;
    public final float[] J;
    public boolean K;
    public final /* synthetic */ g95 L;
    public final s09 a;
    public final TextView b;
    public final TLRPC.GroupCallParticipant c;
    public final p09 d;
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
    public e95(g95 g95Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        this.L = g95Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new float[8];
        this.E = new RectF();
        this.J = new float[3];
        setWillNotDraw(false);
        this.c = groupCallParticipant;
        this.r = sd2.H(groupCallParticipant) / 20000.0f;
        this.H = 1.0f;
        setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        p09 p09Var = new p09(R.raw.speaker, gm.L(24.0f), gm.L(24.0f), true, null);
        this.d = p09Var;
        s09 s09Var = new s09(context);
        this.a = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        s09Var.setAnimation(p09Var);
        s09Var.setTag(this.r == 0.0d ? 1 : null);
        addView(s09Var, qoe.d(-2, 40.0f, (jb6.a0 ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        p09Var.K(this.r == 0.0d ? 17 : 34);
        p09Var.I(p09Var.f - 1, false, true);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(textView, cmb.Xg, null);
        textView.setTextSize(1, 16.0f);
        double H = sd2.H(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        textView.setText(((int) (H > 0.0d ? Math.max(H, 1.0d) : 0.0d)) + "%");
        textView.setPadding(jb6.a0 ? 0 : gm.L(43.0f), 0, jb6.a0 ? gm.L(43.0f) : 0, 0);
        addView(textView, qoe.e(-2, -2, (jb6.a0 ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int H2 = (int) (sd2.H(groupCallParticipant) / 100.0d);
        int i = 0;
        while (true) {
            float[] fArr = this.J;
            if (i >= fArr.length) {
                return;
            }
            if (H2 > (i == 0 ? 0 : i == 1 ? 50 : nm7.f2)) {
                fArr[i] = 1.0f;
            } else {
                fArr[i] = 0.0f;
            }
            i++;
        }
    }

    public final void a(double d, boolean z) {
        if (VoIPService.getSharedInstance() != null) {
            this.r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.c;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double H = sd2.H(groupCallParticipant) / 100.0d;
            Locale locale = Locale.US;
            this.b.setText(((int) (H > 0.0d ? Math.max(H, 1.0d) : 0.0d)) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            if (z) {
                long B1 = k47.B1(groupCallParticipant.peer);
                g95 g95Var = this.L;
                j5 j5Var = g95Var.n1;
                TLObject W1 = B1 > 0 ? oc7.r1(j5Var.a).W1(Long.valueOf(B1)) : oc7.r1(j5Var.a).L0(Long.valueOf(-B1));
                if (groupCallParticipant.volume == 0) {
                    k85 k85Var = g95Var.U4;
                    if (k85Var != null) {
                        k85Var.dismiss();
                        g95Var.U4 = null;
                    }
                    g95Var.T0(true);
                    g95Var.r1(groupCallParticipant, B1, g95Var.G0() ? 0 : 5);
                } else {
                    VoIPService.getSharedInstance().editCallMember(W1, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            Integer num = this.r == 0.0d ? 1 : null;
            s09 s09Var = this.a;
            if ((s09Var.getTag() != null || num == null) && (s09Var.getTag() == null || num != null)) {
                return;
            }
            int i = this.r == 0.0d ? 17 : 34;
            p09 p09Var = this.d;
            p09Var.K(i);
            p09Var.H(this.r != 0.0d ? 17 : 0);
            p09Var.start();
            s09Var.setTag(num);
        }
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
                    int x = (int) motionEvent.getX();
                    this.n = x;
                    if (x < 0) {
                        this.n = 0;
                    } else if (x > getMeasuredWidth()) {
                        this.n = getMeasuredWidth();
                    }
                    this.K = true;
                }
            }
            if (this.K) {
                if (motionEvent.getAction() == 1) {
                    a(this.n / getMeasuredWidth(), true);
                }
                this.K = false;
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
                        int x2 = (int) motionEvent.getX();
                        this.n = x2;
                        if (x2 < 0) {
                            this.n = 0;
                        } else if (x2 > getMeasuredWidth()) {
                            this.n = getMeasuredWidth();
                        }
                        this.K = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (this.K) {
                int x3 = (int) motionEvent.getX();
                this.n = x3;
                if (x3 < 0) {
                    this.n = 0;
                } else if (x3 > getMeasuredWidth()) {
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
        int i;
        float L;
        int i2;
        float f;
        int i3;
        e95 e95Var = this;
        int i4 = e95Var.F;
        double d = e95Var.r;
        if (d < 0.25d) {
            i = -3385513;
            e95Var.F = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            i = -3562181;
            e95Var.F = -3562181;
        } else if (d < 0.5d || d > 0.75d) {
            i = -11688225;
            e95Var.F = -11688225;
        } else {
            i = -11027349;
            e95Var.F = -11027349;
        }
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (i4 == 0) {
            e95Var.H = 1.0f;
        } else {
            i = gm.R0(e95Var.H, 1.0f, e95Var.G, i4);
            if (i4 != e95Var.F) {
                e95Var.H = 0.0f;
                e95Var.G = i;
            }
        }
        Paint paint = e95Var.s;
        paint.setColor(i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - e95Var.I;
        if (j > 17) {
            j = 17;
        }
        e95Var.I = elapsedRealtime;
        float f4 = e95Var.H;
        if (f4 < 1.0f) {
            float f5 = (j / 200.0f) + f4;
            e95Var.H = f5;
            if (f5 > 1.0f) {
                e95Var.H = 1.0f;
            } else {
                e95Var.invalidate();
            }
        }
        Path path = e95Var.x;
        path.reset();
        float f6 = 6.0f;
        float L2 = gm.L(6.0f);
        float[] fArr = e95Var.y;
        fArr[7] = L2;
        fArr[6] = L2;
        int i5 = 1;
        fArr[1] = L2;
        int i6 = 0;
        fArr[0] = L2;
        float L3 = gm.L(6.0f) * (e95Var.n < gm.L(12.0f) ? Math.max(0.0f, (e95Var.n - gm.L(6.0f)) / gm.L(6.0f)) : 1.0f);
        fArr[5] = L3;
        fArr[4] = L3;
        fArr[3] = L3;
        fArr[2] = L3;
        float f7 = e95Var.n;
        float measuredHeight = e95Var.getMeasuredHeight();
        RectF rectF = e95Var.E;
        rectF.set(0.0f, 0.0f, f7, measuredHeight);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int H = (int) (sd2.H(e95Var.c) / 100.0d);
        s09 s09Var = e95Var.a;
        int L4 = gm.L(5.0f) + (s09Var.getMeasuredWidth() / 2) + s09Var.getLeft();
        int measuredHeight2 = (s09Var.getMeasuredHeight() / 2) + s09Var.getTop();
        int i7 = 0;
        while (true) {
            float[] fArr2 = e95Var.J;
            if (i7 >= fArr2.length) {
                return;
            }
            if (i7 == 0) {
                L = gm.L(f6);
                f = f2;
                i3 = i6;
            } else {
                if (i7 == i5) {
                    L = gm.L(10.0f);
                    i2 = 50;
                } else {
                    L = gm.L(14.0f);
                    i2 = nm7.f2;
                }
                f = f2;
                i3 = i2;
            }
            float f8 = f3;
            float L5 = gm.L(2.0f);
            float f9 = fArr2[i7];
            float f10 = (f8 - f9) * L5;
            Paint paint2 = e95Var.w;
            paint2.setAlpha((int) (255.0f * f9));
            float f11 = L4;
            float f12 = measuredHeight2;
            rectF.set((f11 - L) + f10, (f12 - L) + f10, (f11 + L) - f10, (f12 + L) - f10);
            canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
            if (H > i3) {
                float f13 = fArr2[i7];
                if (f13 < f8) {
                    float f14 = (j / 180.0f) + f13;
                    fArr2[i7] = f14;
                    if (f14 > f8) {
                        fArr2[i7] = f8;
                    }
                    invalidate();
                }
            } else {
                float f15 = fArr2[i7];
                if (f15 > f) {
                    float f16 = f15 - (j / 180.0f);
                    fArr2[i7] = f16;
                    if (f16 < f) {
                        fArr2[i7] = f;
                    }
                    invalidate();
                }
            }
            i7++;
            e95Var = this;
            canvas2 = canvas;
            f2 = f;
            f3 = f8;
            f6 = 6.0f;
            i5 = 1;
            i6 = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
        this.n = (int) (View.MeasureSpec.getSize(i) * this.r);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
