package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ng extends View {
    public float B;
    public final /* synthetic */ ChatActivityEnterView C;
    public boolean a;
    public boolean b;
    public String c;
    public long d;
    public long e;
    public long f;
    public final SpannableStringBuilder h;
    public final SpannableStringBuilder n;
    public SpannableStringBuilder r;
    public StaticLayout s;
    public StaticLayout v;
    public float w;
    public TextPaint x;
    public final float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.C = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.n = new SpannableStringBuilder();
        this.r = new SpannableStringBuilder();
        this.y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j10) {
        this.a = true;
        long currentTimeMillis = System.currentTimeMillis() - j10;
        this.d = currentTimeMillis;
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
        return this.B;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        int threadMessageId;
        TextPaint textPaint = this.x;
        ChatActivityEnterView chatActivityEnterView = this.C;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.x;
            int i10 = org.telegram.ui.ActionBar.k6.nf;
            int i11 = ChatActivityEnterView.j5;
            textPaint3.setColor(chatActivityEnterView.i0(i10));
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.a ? currentTimeMillis - this.d : this.e - this.d;
        long j11 = j10 / 1000;
        int i12 = ((int) (j10 % 1000)) / 10;
        if (chatActivityEnterView.Z0 && j10 >= 59500 && !this.b) {
            chatActivityEnterView.z2 = -1.0f;
            chatActivityEnterView.V2.u2(3, 0, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.O4, 0L, true);
            oe oeVar = chatActivityEnterView.G0;
            chatActivityEnterView.O4 = 0L;
            oeVar.setEffect(0L);
            this.b = true;
        }
        if (this.a && currentTimeMillis > this.f + 5000) {
            this.f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.N);
            long j12 = chatActivityEnterView.M2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            messagesController.sendTyping(j12, threadMessageId, chatActivityEnterView.Z0 ? 7 : 1, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i12);
        if (formatTimerDurationFast.length() < 3 || (str = this.c) == null || str.length() < 3 || formatTimerDurationFast.length() != this.c.length() || formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) == this.c.charAt(formatTimerDurationFast.length() - 3)) {
            if (this.r == null) {
                this.r = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.r.length() == 0 || this.r.length() != formatTimerDurationFast.length()) {
                this.r.clear();
                this.r.append((CharSequence) formatTimerDurationFast);
            } else {
                this.r.replace(r11.length() - 1, this.r.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.r.length()), formatTimerDurationFast.length());
            }
        } else {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder = this.h;
            spannableStringBuilder.clear();
            SpannableStringBuilder spannableStringBuilder2 = this.n;
            spannableStringBuilder2.clear();
            this.r.clear();
            spannableStringBuilder.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder2.append((CharSequence) this.c);
            this.r.append((CharSequence) formatTimerDurationFast);
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < length - 1; i17++) {
                if (this.c.charAt(i17) != formatTimerDurationFast.charAt(i17)) {
                    if (i16 == 0) {
                        i14 = i17;
                    }
                    i16++;
                    if (i15 != 0) {
                        nz nzVar = new nz(false);
                        if (i17 == length - 2) {
                            i15++;
                        }
                        int i18 = i15 + i13;
                        spannableStringBuilder.setSpan(nzVar, i13, i18, 33);
                        spannableStringBuilder2.setSpan(nzVar, i13, i18, 33);
                        i15 = 0;
                    }
                } else {
                    if (i15 == 0) {
                        i13 = i17;
                    }
                    i15++;
                    if (i16 != 0) {
                        this.r.setSpan(new nz(false), i14, i16 + i14, 33);
                        i16 = 0;
                    }
                }
            }
            if (i15 != 0) {
                nz nzVar2 = new nz(false);
                int i19 = i15 + i13 + 1;
                spannableStringBuilder.setSpan(nzVar2, i13, i19, 33);
                spannableStringBuilder2.setSpan(nzVar2, i13, i19, 33);
            }
            if (i16 != 0) {
                this.r.setSpan(new nz(false), i14, i16 + i14, 33);
            }
            TextPaint textPaint4 = this.x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.s = new StaticLayout(spannableStringBuilder, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder2, this.x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.w = 1.0f;
        }
        float f10 = this.w;
        if (f10 != 0.0f) {
            float f11 = f10 - 0.15f;
            this.w = f11;
            if (f11 < 0.0f) {
                this.w = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.w == 0.0f) {
            this.r.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.r, this.x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.B = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.s;
            float f12 = this.y;
            if (staticLayout2 != null) {
                canvas.save();
                this.x.setAlpha((int) ((1.0f - this.w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.s.getHeight() / 2.0f)) - (this.w * f12));
                this.s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.x.setAlpha((int) (this.w * 255.0f));
                canvas.translate(0.0f, e2.c.w(1.0f, this.w, f12, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.r, this.x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.B = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.c = formatTimerDurationFast;
        if (this.a || this.w != 0.0f) {
            invalidate();
        }
    }
}
