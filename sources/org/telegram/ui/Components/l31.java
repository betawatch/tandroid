package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class l31 extends FrameLayout {
    public org.telegram.ui.l5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int a;
    public final org.telegram.ui.ActionBar.d6 b;
    public up0 c;
    public final x90 d;
    public final p6 e;
    public final ci.i3 f;
    public final ImageView h;
    public boolean n;
    public final f6 r;
    public boolean s;
    public int v;
    public long w;
    public boolean x;
    public boolean y;

    public l31(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.r = new f6(this, 360L, bs.h);
        this.s = false;
        this.x = false;
        this.y = false;
        this.I = org.telegram.ui.ActionBar.h6.U8;
        this.L = 0;
        this.a = i10;
        this.b = d6Var;
        setClipChildren(false);
        setClipToPadding(false);
        x90 x90Var = new x90(context, d6Var);
        this.d = x90Var;
        x90Var.setTextSize(1, 14.0f);
        x90Var.setTypeface(AndroidUtilities.bold());
        addView(x90Var, w7.z5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(x90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.z5.e(34, 34, 17));
        p6 p6Var = new p6(false, false, false);
        this.e = p6Var;
        p6Var.w(AndroidUtilities.dp(11.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.b = 17;
        ci.i3 i3Var = new ci.i3(this, context, d6Var);
        this.f = i3Var;
        addView(i3Var, w7.z5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(i3Var);
        h();
    }

    private int getMeasuringWidth() {
        float dp = AndroidUtilities.dp(16.66f);
        p6 p6Var = this.e;
        return AndroidUtilities.dp(11.0f) + this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f) + (p6Var.d > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(dp, p6Var.d + AndroidUtilities.dp(10.0f))) : 0) + this.L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i10 = org.telegram.ui.ActionBar.h6.z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.b;
        return i0.a.f(this.x ? 1.0f : this.F, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
    }

    private void setLayout(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(false);
        long j11 = this.w;
        long j12 = tL_forumTopic.id;
        boolean z11 = j11 == j12;
        this.w = j12;
        this.h.setVisibility(8);
        x90 x90Var = this.d;
        x90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            yq yqVar = new yq(R.drawable.msg_filled_general, 0);
            yqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(yqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new a6(tL_forumTopic.icon_emoji_id, x90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        x90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.a).isDialogMuted(j10, this.w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.s != z12) {
            this.s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.w = 0L;
        this.x = true;
        this.h.setVisibility(8);
        x90 x90Var = this.d;
        x90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new yq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        x90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        setLayout(z11);
        this.w = 0L;
        this.x = false;
        int i10 = z10 ? 0 : 8;
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            i31 i31Var = new i31(getContext());
            i31Var.b.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.b));
            imageView.setImageDrawable(i31Var);
        }
        String string = LocaleController.getString(z10 ? R.string.BotForumNewTopic : R.string.AllTopicsShort);
        x90 x90Var = this.d;
        x90Var.setText(string);
        x90Var.setVisibility(z10 ? 8 : 0);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float e = this.r.e(this.n);
        if (e > 0.0f) {
            if (this.c == null) {
                this.c = new up0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, e);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i10, boolean z10, boolean z11) {
        p6 p6Var = this.e;
        if (i10 > 0) {
            this.I = z10 ? org.telegram.ui.ActionBar.h6.V8 : org.telegram.ui.ActionBar.h6.U8;
            p6Var.t(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.h6.V8;
            p6Var.t("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new j31(this, 0));
            this.K.addListener(new c80(this, 29));
            org.telegram.messenger.kk.l(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.w = -1L;
        this.h.setVisibility(8);
        x90 x90Var = this.d;
        x90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        ca0 ca0Var = new ca0(AndroidUtilities.dp(42.0f), x90Var);
        ca0Var.e = 0.95f;
        spannableStringBuilder.setSpan(ca0Var, 0, 1, 33);
        x90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        boolean z11 = this.w == peerDialogId;
        this.w = peerDialogId;
        this.h.setVisibility(8);
        x90 x90Var = this.d;
        x90Var.setVisibility(0);
        org.telegram.ui.l5 l5Var = this.E;
        int i10 = this.a;
        if (l5Var == null) {
            org.telegram.ui.l5 l5Var2 = new org.telegram.ui.l5(x90Var, 18.0f, i10);
            this.E = l5Var2;
            l5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.l5 l5Var3 = this.E;
            h9 h9Var = l5Var3.c;
            h9Var.j(l5Var3.e, userOrChat);
            l5Var3.b.setForUserOrChat(userOrChat, h9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        x90Var.setText(TextUtils.ellipsize(spannableStringBuilder, x90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z11);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.w;
    }

    public final void h() {
        int textColor = getTextColor();
        x90 x90Var = this.d;
        x90Var.setTextColor(textColor);
        x90Var.setEmojiColor(textColor);
        this.f.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        ImageView imageView = this.h;
        int measuredWidth = (i14 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int dp = AndroidUtilities.dp(11.0f);
        int i16 = i15 / 2;
        x90 x90Var = this.d;
        x90Var.layout(dp, i16 - (x90Var.getMeasuredHeight() / 2), x90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (x90Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        ci.i3 i3Var = this.f;
        if (f7 > 0.0f) {
            i3Var.layout((i14 - AndroidUtilities.dp(11.0f)) - i3Var.getMeasuredWidth(), i16 - (i3Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (i3Var.getMeasuredHeight() / 2) + i16);
        } else {
            i3Var.layout(AndroidUtilities.dp(4.66f) + x90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), i16 - (i3Var.getMeasuredHeight() / 2), i3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + x90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (i3Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && i3Var.getLeft() != this.v) {
            i3Var.setTranslationX((-i3Var.getLeft()) + this.v);
            i3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        this.v = i3Var.getLeft();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30));
    }

    public void setReorder(boolean z10) {
        this.n = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new j31(this, 1));
        this.H.addListener(new org.telegram.ui.fo(22, this, z10));
        this.H.setInterpolator(bs.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
