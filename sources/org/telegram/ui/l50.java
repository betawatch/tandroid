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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l50 extends FrameLayout {
    public int A;
    public int B;
    public float C;
    public long D;
    public final float[] E;
    public boolean F;
    public final /* synthetic */ o50 G;
    public final org.telegram.ui.Components.pi0 a;
    public final TextView b;
    public final TLRPC.GroupCallParticipant c;
    public final org.telegram.ui.Components.mi0 d;
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
    public l50(o50 o50Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        this.G = o50Var;
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
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.speaker, "" + R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = mi0Var;
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.a = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        pi0Var.setAnimation(mi0Var);
        pi0Var.setTag(this.r == 0.0d ? 1 : null);
        addView(pi0Var, g7.e6.d(-2, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        mi0Var.N(this.r == 0.0d ? 17 : 34);
        mi0Var.L(mi0Var.f - 1, false, true);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hg, false));
        textView.setTextSize(1, 16.0f);
        double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        textView.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
        textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
        addView(textView, g7.e6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d);
        int i9 = 0;
        while (true) {
            float[] fArr = this.E;
            if (i9 >= fArr.length) {
                return;
            }
            if (participantVolume2 > (i9 == 0 ? 0 : i9 == 1 ? 50 : ImageReceiver.DEFAULT_CROSSFADE_DURATION)) {
                fArr[i9] = 1.0f;
            } else {
                fArr[i9] = 0.0f;
            }
            i9++;
        }
    }

    public final void a(double d, boolean z10) {
        o50 o50Var = this.G;
        AccountInstance accountInstance = o50Var.d;
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
                o40 o40Var = o50Var.b3;
                if (o40Var != null) {
                    o40Var.dismiss();
                    o50Var.b3 = null;
                }
                o50Var.d1(true);
                o50Var.x1(groupCallParticipant, peerId, o50Var.Q0() ? 0 : 5);
            } else {
                VoIPService.getSharedInstance().editCallMember(user, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
            }
        }
        Integer num = this.r == 0.0d ? 1 : null;
        org.telegram.ui.Components.pi0 pi0Var = this.a;
        if ((pi0Var.getTag() != null || num == null) && (pi0Var.getTag() == null || num != null)) {
            return;
        }
        int i9 = this.r == 0.0d ? 17 : 34;
        org.telegram.ui.Components.mi0 mi0Var = this.d;
        mi0Var.N(i9);
        mi0Var.K(this.r != 0.0d ? 17 : 0);
        mi0Var.start();
        pi0Var.setTag(num);
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
                        int x11 = (int) motionEvent.getX();
                        this.n = x11;
                        if (x11 < 0) {
                            this.n = 0;
                        } else if (x11 > getMeasuredWidth()) {
                            this.n = getMeasuredWidth();
                        }
                        this.F = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (this.F) {
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
        int i9;
        float dp;
        int i10;
        l50 l50Var = this;
        int i11 = l50Var.A;
        double d = l50Var.r;
        if (d < 0.25d) {
            l50Var.A = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            l50Var.A = -3562181;
        } else if (d < 0.5d || d > 0.75d) {
            l50Var.A = -11688225;
        } else {
            l50Var.A = -11027349;
        }
        if (i11 == 0) {
            i9 = l50Var.A;
            l50Var.C = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(l50Var.B, i11, l50Var.C, 1.0f);
            if (i11 != l50Var.A) {
                l50Var.C = 0.0f;
                l50Var.B = offsetColor;
            }
            i9 = offsetColor;
        }
        Paint paint = l50Var.s;
        paint.setColor(i9);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - l50Var.D;
        if (j10 > 17) {
            j10 = 17;
        }
        l50Var.D = elapsedRealtime;
        float f10 = l50Var.C;
        if (f10 < 1.0f) {
            float f11 = (j10 / 200.0f) + f10;
            l50Var.C = f11;
            if (f11 > 1.0f) {
                l50Var.C = 1.0f;
            } else {
                l50Var.invalidate();
            }
        }
        Path path = l50Var.w;
        path.reset();
        float f12 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = l50Var.x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i12 = 1;
        fArr[1] = dp2;
        fArr[0] = dp2;
        float dp3 = AndroidUtilities.dp(6.0f) * (l50Var.n < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (l50Var.n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f);
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        float f13 = l50Var.n;
        float measuredHeight = l50Var.getMeasuredHeight();
        RectF rectF = l50Var.y;
        rectF.set(0.0f, 0.0f, f13, measuredHeight);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(l50Var.c) / 100.0d);
        org.telegram.ui.Components.pi0 pi0Var = l50Var.a;
        int dp4 = AndroidUtilities.dp(5.0f) + (pi0Var.getMeasuredWidth() / 2) + pi0Var.getLeft();
        int measuredHeight2 = (pi0Var.getMeasuredHeight() / 2) + pi0Var.getTop();
        int i13 = 0;
        while (true) {
            float[] fArr2 = l50Var.E;
            if (i13 >= fArr2.length) {
                return;
            }
            if (i13 == 0) {
                dp = AndroidUtilities.dp(f12);
                i10 = 0;
            } else if (i13 == i12) {
                dp = AndroidUtilities.dp(10.0f);
                i10 = 50;
            } else {
                dp = AndroidUtilities.dp(14.0f);
                i10 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            }
            float dp5 = AndroidUtilities.dp(2.0f);
            float f14 = fArr2[i13];
            float f15 = (1.0f - f14) * dp5;
            Paint paint2 = l50Var.v;
            paint2.setAlpha((int) (255.0f * f14));
            float f16 = dp4;
            float f17 = measuredHeight2;
            rectF.set((f16 - dp) + f15, (f17 - dp) + f15, (f16 + dp) - f15, (f17 + dp) - f15);
            canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
            if (participantVolume > i10) {
                float f18 = fArr2[i13];
                if (f18 < 1.0f) {
                    float f19 = (j10 / 180.0f) + f18;
                    fArr2[i13] = f19;
                    if (f19 > 1.0f) {
                        fArr2[i13] = 1.0f;
                    }
                    invalidate();
                }
            } else {
                float f20 = fArr2[i13];
                if (f20 > 0.0f) {
                    float f21 = f20 - (j10 / 180.0f);
                    fArr2[i13] = f21;
                    if (f21 < 0.0f) {
                        fArr2[i13] = 0.0f;
                    }
                    invalidate();
                }
            }
            i13++;
            canvas2 = canvas;
            f12 = 6.0f;
            i12 = 1;
            l50Var = this;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
        this.n = (int) (View.MeasureSpec.getSize(i9) * this.r);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
