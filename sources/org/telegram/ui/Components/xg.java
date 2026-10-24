package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class xg extends View {
    public float E;
    public TextPaint F;
    public final float G;
    public float H;
    public final /* synthetic */ ChatActivityEnterView I;
    public boolean a;
    public boolean b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long h;
    public long n;
    public boolean r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public SpannableStringBuilder w;
    public StaticLayout x;
    public StaticLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.s = new SpannableStringBuilder();
        this.v = new SpannableStringBuilder();
        this.w = new SpannableStringBuilder();
        this.G = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j10) {
        this.a = true;
        long currentTimeMillis = System.currentTimeMillis() - j10;
        this.d = currentTimeMillis;
        this.h = j10;
        this.f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.a) {
            this.a = false;
            if (this.d > 0) {
                this.e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f = 0L;
    }

    public float getLeftProperty() {
        return this.H;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long j10;
        String str;
        int threadMessageId;
        TextPaint textPaint = this.F;
        ChatActivityEnterView chatActivityEnterView = this.I;
        boolean z10 = true;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.F = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.F.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.F;
            int i10 = org.telegram.ui.ActionBar.k6.nf;
            int i11 = ChatActivityEnterView.r5;
            textPaint3.setColor(chatActivityEnterView.f0(i10));
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.a ? this.r ? this.h : currentTimeMillis - this.d : this.e - this.d;
        long j12 = j11 / 1000;
        int i12 = ((int) (j11 % 1000)) / 10;
        long j13 = 0;
        if (chatActivityEnterView.c1 && j11 >= 59500 && !this.b) {
            chatActivityEnterView.D2 = -1.0f;
            chatActivityEnterView.Z2.a2(3, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
            xe xeVar = chatActivityEnterView.J0;
            chatActivityEnterView.S4 = 0L;
            xeVar.setEffect(0L);
            this.b = true;
        }
        if (this.a && currentTimeMillis > this.f + 5000) {
            this.f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j14 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            messagesController.sendTyping(j14, threadMessageId, chatActivityEnterView.c1 ? 7 : 1, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j12, i12);
        if (formatTimerDurationFast.length() < 3 || (str = this.c) == null || str.length() < 3 || formatTimerDurationFast.length() != this.c.length() || formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) == this.c.charAt(formatTimerDurationFast.length() - 3)) {
            j10 = 0;
            if (this.w == null) {
                this.w = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.w.length() == 0 || this.w.length() != formatTimerDurationFast.length()) {
                this.w.clear();
                this.w.append((CharSequence) formatTimerDurationFast);
            } else {
                this.w.replace(r15.length() - 1, this.w.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.w.length()), formatTimerDurationFast.length());
            }
        } else {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder = this.s;
            spannableStringBuilder.clear();
            SpannableStringBuilder spannableStringBuilder2 = this.v;
            spannableStringBuilder2.clear();
            this.w.clear();
            spannableStringBuilder.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder2.append((CharSequence) this.c);
            this.w.append((CharSequence) formatTimerDurationFast);
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                boolean z11 = z10;
                j10 = j13;
                if (i15 >= length - 1) {
                    break;
                }
                if (this.c.charAt(i15) != formatTimerDurationFast.charAt(i15)) {
                    if (i17 == 0) {
                        i14 = i15;
                    }
                    i17++;
                    if (i16 != 0) {
                        uz uzVar = new uz(false);
                        if (i15 == length - 2) {
                            i16++;
                        }
                        int i18 = i16 + i13;
                        spannableStringBuilder.setSpan(uzVar, i13, i18, 33);
                        spannableStringBuilder2.setSpan(uzVar, i13, i18, 33);
                        i16 = 0;
                    }
                } else {
                    if (i16 == 0) {
                        i13 = i15;
                    }
                    i16++;
                    if (i17 != 0) {
                        this.w.setSpan(new uz(false), i14, i17 + i14, 33);
                        i17 = 0;
                    }
                }
                i15++;
                z10 = z11;
                j13 = j10;
            }
            if (i16 != 0) {
                uz uzVar2 = new uz(false);
                int i19 = i16 + i13 + 1;
                spannableStringBuilder.setSpan(uzVar2, i13, i19, 33);
                spannableStringBuilder2.setSpan(uzVar2, i13, i19, 33);
            }
            if (i17 != 0) {
                this.w.setSpan(new uz(false), i14, i17 + i14, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.x = new StaticLayout(spannableStringBuilder, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.y = new StaticLayout(spannableStringBuilder2, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j15 = this.n;
        long min = j15 == j10 ? 16L : Math.min(50L, elapsedRealtime - j15);
        this.n = elapsedRealtime;
        float f7 = this.E;
        if (f7 != 0.0f) {
            float f10 = f7 - (min / 116.0f);
            this.E = f10;
            if (f10 < 0.0f) {
                this.E = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.E == 0.0f) {
            this.w.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.x;
            float f11 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.x.getHeight() / 2.0f)) - (this.E * f11));
                this.x.draw(canvas);
                canvas.restore();
            }
            if (this.y != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.play_billing.k3.y(1.0f, this.E, f11, measuredHeight - (this.y.getHeight() / 2.0f)));
                this.y.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.c = formatTimerDurationFast;
        if ((this.a || this.E != 0.0f) && !this.r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.r = z10;
        this.n = SystemClock.elapsedRealtime();
        invalidate();
    }
}
