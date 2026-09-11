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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xg extends View {
    public float E;
    public final /* synthetic */ ChatActivityEnterView F;
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
    public xg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.F = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.n = new SpannableStringBuilder();
        this.r = new SpannableStringBuilder();
        this.y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j3) {
        this.a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
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
        return this.E;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        int threadMessageId;
        TextPaint textPaint = this.x;
        ChatActivityEnterView chatActivityEnterView = this.F;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.x;
            int i10 = org.telegram.ui.ActionBar.j6.nf;
            int i11 = ChatActivityEnterView.m5;
            textPaint3.setColor(chatActivityEnterView.i0(i10));
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = this.a ? currentTimeMillis - this.d : this.e - this.d;
        long j10 = j3 / 1000;
        int i12 = ((int) (j3 % 1000)) / 10;
        if (chatActivityEnterView.c1 && j3 >= 59500 && !this.b) {
            chatActivityEnterView.C2 = -1.0f;
            chatActivityEnterView.Y2.c2(3, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.R4, 0L, true);
            ye yeVar = chatActivityEnterView.J0;
            chatActivityEnterView.R4 = 0L;
            yeVar.setEffect(0L);
            this.b = true;
        }
        if (this.a && currentTimeMillis > this.f + 5000) {
            this.f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j11 = chatActivityEnterView.P2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            messagesController.sendTyping(j11, threadMessageId, chatActivityEnterView.c1 ? 7 : 1, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j10, i12);
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
                        lz lzVar = new lz(false);
                        if (i17 == length - 2) {
                            i15++;
                        }
                        int i18 = i15 + i13;
                        spannableStringBuilder.setSpan(lzVar, i13, i18, 33);
                        spannableStringBuilder2.setSpan(lzVar, i13, i18, 33);
                        i15 = 0;
                    }
                } else {
                    if (i15 == 0) {
                        i13 = i17;
                    }
                    i15++;
                    if (i16 != 0) {
                        this.r.setSpan(new lz(false), i14, i16 + i14, 33);
                        i16 = 0;
                    }
                }
            }
            if (i15 != 0) {
                lz lzVar2 = new lz(false);
                int i19 = i15 + i13 + 1;
                spannableStringBuilder.setSpan(lzVar2, i13, i19, 33);
                spannableStringBuilder2.setSpan(lzVar2, i13, i19, 33);
            }
            if (i16 != 0) {
                this.r.setSpan(new lz(false), i14, i16 + i14, 33);
            }
            TextPaint textPaint4 = this.x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.s = new StaticLayout(spannableStringBuilder, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder2, this.x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.w = 1.0f;
        }
        float f7 = this.w;
        if (f7 != 0.0f) {
            float f10 = f7 - 0.15f;
            this.w = f10;
            if (f10 < 0.0f) {
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
            this.E = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.s;
            float f11 = this.y;
            if (staticLayout2 != null) {
                canvas.save();
                this.x.setAlpha((int) ((1.0f - this.w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.s.getHeight() / 2.0f)) - (this.w * f11));
                this.s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.x.setAlpha((int) (this.w * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, this.w, f11, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.r, this.x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.E = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.c = formatTimerDurationFast;
        if (this.a || this.w != 0.0f) {
            invalidate();
        }
    }
}
