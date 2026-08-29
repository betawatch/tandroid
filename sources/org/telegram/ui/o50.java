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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o50 extends FrameLayout {
    public int A;
    public int B;
    public float C;
    public long D;
    public final float[] E;
    public boolean F;
    public final /* synthetic */ r50 G;
    public final org.telegram.ui.Components.aj0 a;
    public final TextView b;
    public final TLRPC.GroupCallParticipant c;
    public final org.telegram.ui.Components.xi0 d;
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
    public o50(r50 r50Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        this.G = r50Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new float[8];
        this.y = new RectF();
        this.E = new float[3];
        setWillNotDraw(false);
        this.c = groupCallParticipant;
        this.r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.C = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.speaker, "" + R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = xi0Var;
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.a = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.setAnimation(xi0Var);
        aj0Var.setTag(this.r == 0.0d ? 1 : null);
        addView(aj0Var, i7.f6.d(-2, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        xi0Var.N(this.r == 0.0d ? 17 : 34);
        xi0Var.L(xi0Var.f - 1, false, true);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hg, false));
        textView.setTextSize(1, 16.0f);
        double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        textView.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
        textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
        addView(textView, i7.f6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d);
        int i10 = 0;
        while (true) {
            float[] fArr = this.E;
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
        r50 r50Var = this.G;
        AccountInstance accountInstance = r50Var.d;
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
                r40 r40Var = r50Var.b3;
                if (r40Var != null) {
                    r40Var.dismiss();
                    r50Var.b3 = null;
                }
                r50Var.d1(true);
                r50Var.x1(groupCallParticipant, peerId, r50Var.Q0() ? 0 : 5);
            } else {
                VoIPService.getSharedInstance().editCallMember(user, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
            }
        }
        Integer num = this.r == 0.0d ? 1 : null;
        org.telegram.ui.Components.aj0 aj0Var = this.a;
        if ((aj0Var.getTag() != null || num == null) && (aj0Var.getTag() == null || num != null)) {
            return;
        }
        int i10 = this.r == 0.0d ? 17 : 34;
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        xi0Var.N(i10);
        xi0Var.K(this.r != 0.0d ? 17 : 0);
        xi0Var.start();
        aj0Var.setTag(num);
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
                    int x4 = (int) motionEvent.getX();
                    this.n = x4;
                    if (x4 < 0) {
                        this.n = 0;
                    } else if (x4 > getMeasuredWidth()) {
                        this.n = getMeasuredWidth();
                    }
                    this.F = true;
                }
            }
            if (this.F) {
                if (motionEvent.getAction() == 1) {
                    a(this.n / getMeasuredWidth(), true);
                }
                this.F = false;
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
                        int x10 = (int) motionEvent.getX();
                        this.n = x10;
                        if (x10 < 0) {
                            this.n = 0;
                        } else if (x10 > getMeasuredWidth()) {
                            this.n = getMeasuredWidth();
                        }
                        this.F = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (this.F) {
                int x11 = (int) motionEvent.getX();
                this.n = x11;
                if (x11 < 0) {
                    this.n = 0;
                } else if (x11 > getMeasuredWidth()) {
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
        o50 o50Var = this;
        int i12 = o50Var.A;
        double d = o50Var.r;
        if (d < 0.25d) {
            o50Var.A = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            o50Var.A = -3562181;
        } else if (d < 0.5d || d > 0.75d) {
            o50Var.A = -11688225;
        } else {
            o50Var.A = -11027349;
        }
        if (i12 == 0) {
            i10 = o50Var.A;
            o50Var.C = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(o50Var.B, i12, o50Var.C, 1.0f);
            if (i12 != o50Var.A) {
                o50Var.C = 0.0f;
                o50Var.B = offsetColor;
            }
            i10 = offsetColor;
        }
        Paint paint = o50Var.s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - o50Var.D;
        if (j10 > 17) {
            j10 = 17;
        }
        o50Var.D = elapsedRealtime;
        float f9 = o50Var.C;
        if (f9 < 1.0f) {
            float f10 = (j10 / 200.0f) + f9;
            o50Var.C = f10;
            if (f10 > 1.0f) {
                o50Var.C = 1.0f;
            } else {
                o50Var.invalidate();
            }
        }
        Path path = o50Var.w;
        path.reset();
        float f11 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = o50Var.x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i13 = 1;
        fArr[1] = dp2;
        fArr[0] = dp2;
        float dp3 = AndroidUtilities.dp(6.0f) * (o50Var.n < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (o50Var.n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f);
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        float f12 = o50Var.n;
        float measuredHeight = o50Var.getMeasuredHeight();
        RectF rectF = o50Var.y;
        rectF.set(0.0f, 0.0f, f12, measuredHeight);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(o50Var.c) / 100.0d);
        org.telegram.ui.Components.aj0 aj0Var = o50Var.a;
        int dp4 = AndroidUtilities.dp(5.0f) + (aj0Var.getMeasuredWidth() / 2) + aj0Var.getLeft();
        int measuredHeight2 = (aj0Var.getMeasuredHeight() / 2) + aj0Var.getTop();
        int i14 = 0;
        while (true) {
            float[] fArr2 = o50Var.E;
            if (i14 >= fArr2.length) {
                return;
            }
            if (i14 == 0) {
                dp = AndroidUtilities.dp(f11);
                i11 = 0;
            } else if (i14 == i13) {
                dp = AndroidUtilities.dp(10.0f);
                i11 = 50;
            } else {
                dp = AndroidUtilities.dp(14.0f);
                i11 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            }
            float dp5 = AndroidUtilities.dp(2.0f);
            float f13 = fArr2[i14];
            float f14 = (1.0f - f13) * dp5;
            Paint paint2 = o50Var.v;
            paint2.setAlpha((int) (255.0f * f13));
            float f15 = dp4;
            float f16 = measuredHeight2;
            rectF.set((f15 - dp) + f14, (f16 - dp) + f14, (f15 + dp) - f14, (f16 + dp) - f14);
            canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
            if (participantVolume > i11) {
                float f17 = fArr2[i14];
                if (f17 < 1.0f) {
                    float f18 = (j10 / 180.0f) + f17;
                    fArr2[i14] = f18;
                    if (f18 > 1.0f) {
                        fArr2[i14] = 1.0f;
                    }
                    invalidate();
                }
            } else {
                float f19 = fArr2[i14];
                if (f19 > 0.0f) {
                    float f20 = f19 - (j10 / 180.0f);
                    fArr2[i14] = f20;
                    if (f20 < 0.0f) {
                        fArr2[i14] = 0.0f;
                    }
                    invalidate();
                }
            }
            i14++;
            canvas2 = canvas;
            f11 = 6.0f;
            i13 = 1;
            o50Var = this;
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
