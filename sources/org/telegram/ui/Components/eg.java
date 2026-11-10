package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class eg extends View {
    public StaticLayout D;
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
    public final SpannableStringBuilder w;
    public SpannableStringBuilder x;
    public StaticLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.s = new SpannableStringBuilder();
        this.w = new SpannableStringBuilder();
        this.x = new SpannableStringBuilder();
        this.G = org.telegram.messenger.g0.L(15.0f);
    }

    public final void a(long j3) {
        this.a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.h = j3;
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
        long j3;
        String str;
        int threadMessageId;
        TextPaint textPaint = this.F;
        ChatActivityEnterView chatActivityEnterView = this.I;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.F = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.F.setTypeface(org.telegram.messenger.g0.o());
            TextPaint textPaint3 = this.F;
            int i7 = org.telegram.ui.ActionBar.m6.bg;
            int i10 = ChatActivityEnterView.s5;
            textPaint3.setColor(chatActivityEnterView.f0(i7));
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.a ? this.r ? this.h : currentTimeMillis - this.d : this.e - this.d;
        long j11 = j10 / 1000;
        int i11 = ((int) (j10 % 1000)) / 10;
        long j12 = 0;
        if (chatActivityEnterView.c1 && j10 >= 59500 && !this.b) {
            chatActivityEnterView.D2 = -1.0f;
            chatActivityEnterView.Z2.Z1(3, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
            fe feVar = chatActivityEnterView.J0;
            chatActivityEnterView.S4 = 0L;
            feVar.setEffect(0L);
            this.b = true;
        }
        if (this.a && currentTimeMillis > this.f + 5000) {
            this.f = currentTimeMillis;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
            long j13 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            s12.C4(chatActivityEnterView.c1 ? 7 : 1, 0, j13, threadMessageId, null);
        }
        long j14 = (int) j11;
        Typeface typeface = org.telegram.messenger.g0.a;
        StringBuilder sb2 = new StringBuilder();
        long j15 = j14 / 60;
        if (j15 >= 60) {
            sb2.append(j15 / 60);
            sb2.append(":");
            org.telegram.messenger.g0.q2(j15 % 60, sb2);
            sb2.append(":");
            org.telegram.messenger.g0.q2(j14 % 60, sb2);
            sb2.append(",");
            sb2.append(i11 / 10);
        } else {
            sb2.append(j15);
            sb2.append(":");
            org.telegram.messenger.g0.q2(j14 % 60, sb2);
            sb2.append(",");
            sb2.append(i11 / 10);
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 3 || (str = this.c) == null || str.length() < 3 || sb3.length() != this.c.length() || sb3.charAt(sb3.length() - 3) == this.c.charAt(sb3.length() - 3)) {
            j3 = 0;
            if (this.x == null) {
                this.x = new SpannableStringBuilder(sb3);
            }
            if (this.x.length() == 0 || this.x.length() != sb3.length()) {
                this.x.clear();
                this.x.append((CharSequence) sb3);
            } else {
                this.x.replace(r4.length() - 1, this.x.length(), (CharSequence) sb3, (sb3.length() - 1) - (sb3.length() - this.x.length()), sb3.length());
            }
        } else {
            int length = sb3.length();
            SpannableStringBuilder spannableStringBuilder = this.s;
            spannableStringBuilder.clear();
            SpannableStringBuilder spannableStringBuilder2 = this.w;
            spannableStringBuilder2.clear();
            this.x.clear();
            spannableStringBuilder.append((CharSequence) sb3);
            spannableStringBuilder2.append((CharSequence) this.c);
            this.x.append((CharSequence) sb3);
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                j3 = j12;
                if (i14 >= length - 1) {
                    break;
                }
                if (this.c.charAt(i14) != sb3.charAt(i14)) {
                    if (i16 == 0) {
                        i13 = i14;
                    }
                    i16++;
                    if (i15 != 0) {
                        hy hyVar = new hy(false);
                        if (i14 == length - 2) {
                            i15++;
                        }
                        int i17 = i15 + i12;
                        spannableStringBuilder.setSpan(hyVar, i12, i17, 33);
                        spannableStringBuilder2.setSpan(hyVar, i12, i17, 33);
                        i15 = 0;
                    }
                } else {
                    if (i15 == 0) {
                        i12 = i14;
                    }
                    i15++;
                    if (i16 != 0) {
                        this.x.setSpan(new hy(false), i13, i16 + i13, 33);
                        i16 = 0;
                    }
                }
                i14++;
                j12 = j3;
            }
            if (i15 != 0) {
                hy hyVar2 = new hy(false);
                int i18 = i15 + i12 + 1;
                spannableStringBuilder.setSpan(hyVar2, i12, i18, 33);
                spannableStringBuilder2.setSpan(hyVar2, i12, i18, 33);
            }
            if (i16 != 0) {
                this.x.setSpan(new hy(false), i13, i16 + i13, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.y = new StaticLayout(spannableStringBuilder, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.D = new StaticLayout(spannableStringBuilder2, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j16 = this.n;
        long min = j16 == j3 ? 16L : Math.min(50L, elapsedRealtime - j16);
        this.n = elapsedRealtime;
        float f10 = this.E;
        if (f10 != 0.0f) {
            float f11 = f10 - (min / 116.0f);
            this.E = f11;
            if (f11 < 0.0f) {
                this.E = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.E == 0.0f) {
            this.x.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.x, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.y;
            float f12 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.y.getHeight() / 2.0f)) - (this.E * f12));
                this.y.draw(canvas);
                canvas.restore();
            }
            if (this.D != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, this.E, f12, measuredHeight - (this.D.getHeight() / 2.0f)));
                this.D.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(org.telegram.messenger.qs.e4);
            StaticLayout staticLayout3 = new StaticLayout(this.x, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.c = sb3;
        if ((this.a || this.E != 0.0f) && !this.r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z9) {
        this.r = z9;
        this.n = SystemClock.elapsedRealtime();
        invalidate();
    }
}
