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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class k60 extends FrameLayout {
    public int E;
    public int F;
    public float G;
    public long H;
    public final float[] I;
    public boolean J;
    public final /* synthetic */ n60 K;
    public final org.telegram.ui.Components.bk0 a;
    public final TextView b;
    public final TLRPC.GroupCallParticipant c;
    public final org.telegram.ui.Components.yj0 d;
    public boolean e;
    public float f;
    public float h;
    public int n;
    public double r;
    public final Paint s;
    public final Paint v;
    public final Path w;
    public final float[] x;
    public final RectF y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(n60 n60Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        this.K = n60Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new float[8];
        this.y = new RectF();
        this.I = new float[3];
        setWillNotDraw(false);
        this.c = groupCallParticipant;
        this.r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.G = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = yj0Var;
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        this.a = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        bk0Var.setAnimation(yj0Var);
        bk0Var.setTag(this.r == 0.0d ? 1 : null);
        addView(bk0Var, w7.a6.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        yj0Var.P(this.r == 0.0d ? 17 : 34);
        yj0Var.N(yj0Var.f - 1, false, true);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hg, false));
        textView.setTextSize(1, 16.0f);
        double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        textView.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
        textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
        addView(textView, w7.a6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d);
        int i10 = 0;
        while (true) {
            float[] fArr = this.I;
            if (i10 >= fArr.length) {
                return;
            }
            if (participantVolume2 > (i10 == 0 ? 0 : i10 == 1 ? 50 : ImageReceiver.DEFAULT_CROSSFADE_DURATION)) {
                fArr[i10] = 1.0f;
            } else {
                fArr[i10] = 0.0f;
            }
            i10++;
        }
    }

    public final void a(double d, boolean z10) {
        n60 n60Var = this.K;
        AccountInstance accountInstance = n60Var.d;
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        this.r = d;
        TLRPC.GroupCallParticipant groupCallParticipant = this.c;
        groupCallParticipant.volume = (int) (d * 20000.0d);
        groupCallParticipant.volume_by_admin = false;
        groupCallParticipant.flags |= 128;
        double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        this.b.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
        VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
        if (z10) {
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            TLObject user = peerId > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            if (groupCallParticipant.volume == 0) {
                n50 n50Var = n60Var.f3;
                if (n50Var != null) {
                    n50Var.dismiss();
                    n60Var.f3 = null;
                }
                n60Var.e1(true);
                n60Var.y1(groupCallParticipant, peerId, n60Var.R0() ? 0 : 5);
            } else {
                VoIPService.getSharedInstance().editCallMember(user, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
            }
        }
        Integer num = this.r == 0.0d ? 1 : null;
        org.telegram.ui.Components.bk0 bk0Var = this.a;
        if ((bk0Var.getTag() != null || num == null) && (bk0Var.getTag() == null || num != null)) {
            return;
        }
        int i10 = this.r == 0.0d ? 17 : 34;
        org.telegram.ui.Components.yj0 yj0Var = this.d;
        yj0Var.P(i10);
        yj0Var.M(this.r != 0.0d ? 17 : 0);
        yj0Var.start();
        bk0Var.setTag(num);
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
        int i10;
        float dp;
        int i11;
        float f7;
        int i12;
        k60 k60Var = this;
        int i13 = k60Var.E;
        double d = k60Var.r;
        if (d < 0.25d) {
            k60Var.E = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            k60Var.E = -3562181;
        } else if (d < 0.5d || d > 0.75d) {
            k60Var.E = -11688225;
        } else {
            k60Var.E = -11027349;
        }
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (i13 == 0) {
            i10 = k60Var.E;
            k60Var.G = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(k60Var.F, i13, k60Var.G, 1.0f);
            if (i13 != k60Var.E) {
                k60Var.G = 0.0f;
                k60Var.F = offsetColor;
            }
            i10 = offsetColor;
        }
        Paint paint = k60Var.s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - k60Var.H;
        if (j10 > 17) {
            j10 = 17;
        }
        k60Var.H = elapsedRealtime;
        float f12 = k60Var.G;
        if (f12 < 1.0f) {
            float f13 = (j10 / 200.0f) + f12;
            k60Var.G = f13;
            if (f13 > 1.0f) {
                k60Var.G = 1.0f;
            } else {
                k60Var.invalidate();
            }
        }
        Path path = k60Var.w;
        path.reset();
        float f14 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = k60Var.x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i14 = 1;
        fArr[1] = dp2;
        int i15 = 0;
        fArr[0] = dp2;
        float dp3 = AndroidUtilities.dp(6.0f) * (k60Var.n < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (k60Var.n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f);
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        float f15 = k60Var.n;
        float measuredHeight = k60Var.getMeasuredHeight();
        RectF rectF = k60Var.y;
        rectF.set(0.0f, 0.0f, f15, measuredHeight);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(k60Var.c) / 100.0d);
        org.telegram.ui.Components.bk0 bk0Var = k60Var.a;
        int dp4 = AndroidUtilities.dp(5.0f) + (bk0Var.getMeasuredWidth() / 2) + bk0Var.getLeft();
        int measuredHeight2 = (bk0Var.getMeasuredHeight() / 2) + bk0Var.getTop();
        int i16 = 0;
        while (true) {
            float[] fArr2 = k60Var.I;
            if (i16 >= fArr2.length) {
                return;
            }
            if (i16 == 0) {
                dp = AndroidUtilities.dp(f14);
                f7 = f10;
                i12 = i15;
            } else {
                if (i16 == i14) {
                    dp = AndroidUtilities.dp(10.0f);
                    i11 = 50;
                } else {
                    dp = AndroidUtilities.dp(14.0f);
                    i11 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                }
                f7 = f10;
                i12 = i11;
            }
            float f16 = f11;
            float dp5 = AndroidUtilities.dp(2.0f);
            float f17 = fArr2[i16];
            float f18 = (f16 - f17) * dp5;
            Paint paint2 = k60Var.v;
            paint2.setAlpha((int) (255.0f * f17));
            float f19 = dp4;
            float f20 = measuredHeight2;
            rectF.set((f19 - dp) + f18, (f20 - dp) + f18, (f19 + dp) - f18, (f20 + dp) - f18);
            canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
            if (participantVolume > i12) {
                float f21 = fArr2[i16];
                if (f21 < f16) {
                    float f22 = (j10 / 180.0f) + f21;
                    fArr2[i16] = f22;
                    if (f22 > f16) {
                        fArr2[i16] = f16;
                    }
                    invalidate();
                }
            } else {
                float f23 = fArr2[i16];
                if (f23 > f7) {
                    float f24 = f23 - (j10 / 180.0f);
                    fArr2[i16] = f24;
                    if (f24 < f7) {
                        fArr2[i16] = f7;
                    }
                    invalidate();
                }
            }
            i16++;
            k60Var = this;
            canvas2 = canvas;
            f10 = f7;
            f11 = f16;
            f14 = 6.0f;
            i14 = 1;
            i15 = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
        this.n = (int) (View.MeasureSpec.getSize(i10) * this.r);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
