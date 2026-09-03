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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a60 extends FrameLayout {
    public int B;
    public int C;
    public float D;
    public long E;
    public final float[] F;
    public boolean G;
    public final /* synthetic */ d60 H;
    public final org.telegram.ui.Components.kj0 a;
    public final TextView b;
    public final TLRPC.GroupCallParticipant c;
    public final org.telegram.ui.Components.hj0 d;
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
    public a60(d60 d60Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        this.H = d60Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new float[8];
        this.y = new RectF();
        this.F = new float[3];
        setWillNotDraw(false);
        this.c = groupCallParticipant;
        this.r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.D = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = hj0Var;
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
        this.a = kj0Var;
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        kj0Var.setAnimation(hj0Var);
        kj0Var.setTag(this.r == 0.0d ? 1 : null);
        addView(kj0Var, k7.c6.d(-2, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        hj0Var.N(this.r == 0.0d ? 17 : 34);
        hj0Var.L(hj0Var.f - 1, false, true);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hg, false));
        textView.setTextSize(1, 16.0f);
        double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        textView.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
        textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
        addView(textView, k7.c6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d);
        int i10 = 0;
        while (true) {
            float[] fArr = this.F;
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

    public final void a(double d, boolean z4) {
        d60 d60Var = this.H;
        AccountInstance accountInstance = d60Var.d;
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
        if (z4) {
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            TLObject user = peerId > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            if (groupCallParticipant.volume == 0) {
                e50 e50Var = d60Var.c3;
                if (e50Var != null) {
                    e50Var.dismiss();
                    d60Var.c3 = null;
                }
                d60Var.d1(true);
                d60Var.x1(groupCallParticipant, peerId, d60Var.Q0() ? 0 : 5);
            } else {
                VoIPService.getSharedInstance().editCallMember(user, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
            }
        }
        Integer num = this.r == 0.0d ? 1 : null;
        org.telegram.ui.Components.kj0 kj0Var = this.a;
        if ((kj0Var.getTag() != null || num == null) && (kj0Var.getTag() == null || num != null)) {
            return;
        }
        int i10 = this.r == 0.0d ? 17 : 34;
        org.telegram.ui.Components.hj0 hj0Var = this.d;
        hj0Var.N(i10);
        hj0Var.K(this.r != 0.0d ? 17 : 0);
        hj0Var.start();
        kj0Var.setTag(num);
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
                    this.G = true;
                }
            }
            if (this.G) {
                if (motionEvent.getAction() == 1) {
                    a(this.n / getMeasuredWidth(), true);
                }
                this.G = false;
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
                        this.G = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (this.G) {
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
        a60 a60Var = this;
        int i12 = a60Var.B;
        double d = a60Var.r;
        if (d < 0.25d) {
            a60Var.B = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            a60Var.B = -3562181;
        } else if (d < 0.5d || d > 0.75d) {
            a60Var.B = -11688225;
        } else {
            a60Var.B = -11027349;
        }
        if (i12 == 0) {
            i10 = a60Var.B;
            a60Var.D = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(a60Var.C, i12, a60Var.D, 1.0f);
            if (i12 != a60Var.B) {
                a60Var.D = 0.0f;
                a60Var.C = offsetColor;
            }
            i10 = offsetColor;
        }
        Paint paint = a60Var.s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - a60Var.E;
        if (j10 > 17) {
            j10 = 17;
        }
        a60Var.E = elapsedRealtime;
        float f10 = a60Var.D;
        if (f10 < 1.0f) {
            float f11 = (j10 / 200.0f) + f10;
            a60Var.D = f11;
            if (f11 > 1.0f) {
                a60Var.D = 1.0f;
            } else {
                a60Var.invalidate();
            }
        }
        Path path = a60Var.w;
        path.reset();
        float f12 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = a60Var.x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i13 = 1;
        fArr[1] = dp2;
        fArr[0] = dp2;
        float dp3 = AndroidUtilities.dp(6.0f) * (a60Var.n < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (a60Var.n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f);
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        float f13 = a60Var.n;
        float measuredHeight = a60Var.getMeasuredHeight();
        RectF rectF = a60Var.y;
        rectF.set(0.0f, 0.0f, f13, measuredHeight);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(a60Var.c) / 100.0d);
        org.telegram.ui.Components.kj0 kj0Var = a60Var.a;
        int dp4 = AndroidUtilities.dp(5.0f) + (kj0Var.getMeasuredWidth() / 2) + kj0Var.getLeft();
        int measuredHeight2 = (kj0Var.getMeasuredHeight() / 2) + kj0Var.getTop();
        int i14 = 0;
        while (true) {
            float[] fArr2 = a60Var.F;
            if (i14 >= fArr2.length) {
                return;
            }
            if (i14 == 0) {
                dp = AndroidUtilities.dp(f12);
                i11 = 0;
            } else if (i14 == i13) {
                dp = AndroidUtilities.dp(10.0f);
                i11 = 50;
            } else {
                dp = AndroidUtilities.dp(14.0f);
                i11 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            }
            float dp5 = AndroidUtilities.dp(2.0f);
            float f14 = fArr2[i14];
            float f15 = (1.0f - f14) * dp5;
            Paint paint2 = a60Var.v;
            paint2.setAlpha((int) (255.0f * f14));
            float f16 = dp4;
            float f17 = measuredHeight2;
            rectF.set((f16 - dp) + f15, (f17 - dp) + f15, (f16 + dp) - f15, (f17 + dp) - f15);
            canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
            if (participantVolume > i11) {
                float f18 = fArr2[i14];
                if (f18 < 1.0f) {
                    float f19 = (j10 / 180.0f) + f18;
                    fArr2[i14] = f19;
                    if (f19 > 1.0f) {
                        fArr2[i14] = 1.0f;
                    }
                    invalidate();
                }
            } else {
                float f20 = fArr2[i14];
                if (f20 > 0.0f) {
                    float f21 = f20 - (j10 / 180.0f);
                    fArr2[i14] = f21;
                    if (f21 < 0.0f) {
                        fArr2[i14] = 0.0f;
                    }
                    invalidate();
                }
            }
            i14++;
            canvas2 = canvas;
            f12 = 6.0f;
            i13 = 1;
            a60Var = this;
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
