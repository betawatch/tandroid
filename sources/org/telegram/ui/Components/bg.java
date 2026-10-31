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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bg extends View {
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
    public bg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.s = new SpannableStringBuilder();
        this.w = new SpannableStringBuilder();
        this.x = new SpannableStringBuilder();
        this.G = org.telegram.messenger.i0.L(15.0f);
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
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.F = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
            this.F.setTypeface(org.telegram.messenger.i0.o());
            TextPaint textPaint3 = this.F;
            int i10 = org.telegram.ui.ActionBar.t6.bg;
            int i11 = ChatActivityEnterView.s5;
            textPaint3.setColor(chatActivityEnterView.e0(i10));
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.a ? this.r ? this.h : currentTimeMillis - this.d : this.e - this.d;
        long j12 = j11 / 1000;
        int i12 = ((int) (j11 % 1000)) / 10;
        long j13 = 0;
        if (chatActivityEnterView.c1 && j11 >= 59500 && !this.b) {
            chatActivityEnterView.D2 = -1.0f;
            chatActivityEnterView.Z2.V1(3, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
            be beVar = chatActivityEnterView.J0;
            chatActivityEnterView.S4 = 0L;
            beVar.setEffect(0L);
            this.b = true;
        }
        if (this.a && currentTimeMillis > this.f + 5000) {
            this.f = currentTimeMillis;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
            long j14 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            r12.z4(chatActivityEnterView.c1 ? 7 : 1, 0, j14, threadMessageId, null);
        }
        long j15 = (int) j12;
        Typeface typeface = org.telegram.messenger.i0.a;
        StringBuilder sb2 = new StringBuilder();
        long j16 = j15 / 60;
        if (j16 >= 60) {
            sb2.append(j16 / 60);
            sb2.append(":");
            org.telegram.messenger.i0.q2(j16 % 60, sb2);
            sb2.append(":");
            org.telegram.messenger.i0.q2(j15 % 60, sb2);
            sb2.append(",");
            sb2.append(i12 / 10);
        } else {
            sb2.append(j16);
            sb2.append(":");
            org.telegram.messenger.i0.q2(j15 % 60, sb2);
            sb2.append(",");
            sb2.append(i12 / 10);
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 3 || (str = this.c) == null || str.length() < 3 || sb3.length() != this.c.length() || sb3.charAt(sb3.length() - 3) == this.c.charAt(sb3.length() - 3)) {
            j10 = 0;
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
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                j10 = j13;
                if (i15 >= length - 1) {
                    break;
                }
                if (this.c.charAt(i15) != sb3.charAt(i15)) {
                    if (i17 == 0) {
                        i14 = i15;
                    }
                    i17++;
                    if (i16 != 0) {
                        wy wyVar = new wy(false);
                        if (i15 == length - 2) {
                            i16++;
                        }
                        int i18 = i16 + i13;
                        spannableStringBuilder.setSpan(wyVar, i13, i18, 33);
                        spannableStringBuilder2.setSpan(wyVar, i13, i18, 33);
                        i16 = 0;
                    }
                } else {
                    if (i16 == 0) {
                        i13 = i15;
                    }
                    i16++;
                    if (i17 != 0) {
                        this.x.setSpan(new wy(false), i14, i17 + i14, 33);
                        i17 = 0;
                    }
                }
                i15++;
                j13 = j10;
            }
            if (i16 != 0) {
                wy wyVar2 = new wy(false);
                int i19 = i16 + i13 + 1;
                spannableStringBuilder.setSpan(wyVar2, i13, i19, 33);
                spannableStringBuilder2.setSpan(wyVar2, i13, i19, 33);
            }
            if (i17 != 0) {
                this.x.setSpan(new wy(false), i14, i17 + i14, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.y = new StaticLayout(spannableStringBuilder, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.D = new StaticLayout(spannableStringBuilder2, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j17 = this.n;
        long min = j17 == j10 ? 16L : Math.min(50L, elapsedRealtime - j17);
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
            this.x.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.x, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.y;
            float f11 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.y.getHeight() / 2.0f)) - (this.E * f11));
                this.y.draw(canvas);
                canvas.restore();
            }
            if (this.D != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, c3.i0.z(1.0f, this.E, f11, measuredHeight - (this.D.getHeight() / 2.0f)));
                this.D.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(org.telegram.messenger.zs.e4);
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

    public void setExternalFrameClock(boolean z10) {
        this.r = z10;
        this.n = SystemClock.elapsedRealtime();
        invalidate();
    }
}
