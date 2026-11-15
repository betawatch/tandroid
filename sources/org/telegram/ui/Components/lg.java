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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lg extends View {
    public StaticLayout E;
    public float F;
    public TextPaint G;
    public final float H;
    public float I;
    public final /* synthetic */ ChatActivityEnterView J;
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
    public lg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.J = chatActivityEnterView;
        this.s = new SpannableStringBuilder();
        this.w = new SpannableStringBuilder();
        this.x = new SpannableStringBuilder();
        this.H = org.telegram.messenger.g0.L(15.0f);
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
        return this.I;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long j3;
        String str;
        int threadMessageId;
        TextPaint textPaint = this.G;
        ChatActivityEnterView chatActivityEnterView = this.J;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.G = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            this.G.setTypeface(org.telegram.messenger.g0.o());
            this.G.setFontFeatureSettings("tnum");
            TextPaint textPaint3 = this.G;
            int i7 = org.telegram.ui.ActionBar.j6.G6;
            int i10 = ChatActivityEnterView.N6;
            textPaint3.setColor(chatActivityEnterView.u0(i7));
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.a ? this.r ? this.h : currentTimeMillis - this.d : this.e - this.d;
        long j11 = j10 / 1000;
        int i11 = ((int) (j10 % 1000)) / 10;
        long j12 = 0;
        if (chatActivityEnterView.d1 && j10 >= 59500 && !this.b) {
            chatActivityEnterView.l3 = -1.0f;
            chatActivityEnterView.H3.o2(3, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.n6, 0L, true);
            he heVar = chatActivityEnterView.K0;
            chatActivityEnterView.n6 = 0L;
            heVar.setEffect(0L);
            this.b = true;
        }
        if (this.a && currentTimeMillis > this.f + 5000) {
            this.f = currentTimeMillis;
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(chatActivityEnterView.R);
            long j13 = chatActivityEnterView.y3;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            s12.D4(chatActivityEnterView.d1 ? 7 : 1, 0, j13, threadMessageId, null);
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
                        my myVar = new my(false);
                        if (i14 == length - 2) {
                            i15++;
                        }
                        int i17 = i15 + i12;
                        spannableStringBuilder.setSpan(myVar, i12, i17, 33);
                        spannableStringBuilder2.setSpan(myVar, i12, i17, 33);
                        i15 = 0;
                    }
                } else {
                    if (i15 == 0) {
                        i12 = i14;
                    }
                    i15++;
                    if (i16 != 0) {
                        this.x.setSpan(new my(false), i13, i16 + i13, 33);
                        i16 = 0;
                    }
                }
                i14++;
                j12 = j3;
            }
            if (i15 != 0) {
                my myVar2 = new my(false);
                int i18 = i15 + i12 + 1;
                spannableStringBuilder.setSpan(myVar2, i12, i18, 33);
                spannableStringBuilder2.setSpan(myVar2, i12, i18, 33);
            }
            if (i16 != 0) {
                this.x.setSpan(new my(false), i13, i16 + i13, 33);
            }
            TextPaint textPaint4 = this.G;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.y = new StaticLayout(spannableStringBuilder, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.E = new StaticLayout(spannableStringBuilder2, this.G, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.F = 1.0f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j16 = this.n;
        long min = j16 == j3 ? 16L : Math.min(50L, elapsedRealtime - j16);
        this.n = elapsedRealtime;
        float f10 = this.F;
        if (f10 != 0.0f) {
            float f11 = f10 - (min / 116.0f);
            this.F = f11;
            if (f11 < 0.0f) {
                this.F = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.F == 0.0f) {
            this.x.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            org.telegram.messenger.i20.j(staticLayout.getHeight(), 2.0f, measuredHeight, 0.0f, canvas);
            staticLayout.draw(canvas);
            canvas.restore();
            this.I = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.y;
            float f12 = this.H;
            if (staticLayout2 != null) {
                canvas.save();
                this.G.setAlpha((int) ((1.0f - this.F) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.y.getHeight() / 2.0f)) - (this.F * f12));
                this.y.draw(canvas);
                canvas.restore();
            }
            if (this.E != null) {
                canvas.save();
                this.G.setAlpha((int) (this.F * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, this.F, f12, measuredHeight - (this.E.getHeight() / 2.0f)));
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.G.setAlpha(org.telegram.messenger.ns.e4);
            StaticLayout staticLayout3 = new StaticLayout(this.x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            org.telegram.messenger.i20.j(staticLayout3.getHeight(), 2.0f, measuredHeight, 0.0f, canvas);
            staticLayout3.draw(canvas);
            canvas.restore();
            this.I = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.c = sb3;
        if ((this.a || this.F != 0.0f) && !this.r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.r = z10;
        this.n = SystemClock.elapsedRealtime();
        invalidate();
    }
}
