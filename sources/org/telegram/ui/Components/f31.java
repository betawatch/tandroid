package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f31 extends FrameLayout {
    public org.telegram.ui.g5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public jp0 c;
    public final m90 d;
    public final n6 e;
    public final org.telegram.ui.u7 f;
    public final ImageView h;
    public boolean n;
    public final d6 r;
    public boolean s;
    public int v;
    public long w;
    public boolean x;
    public boolean y;

    public f31(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = new d6(this, 360L, wr.h);
        this.s = false;
        this.x = false;
        this.y = false;
        this.I = org.telegram.ui.ActionBar.j6.U8;
        this.L = 0;
        this.a = i10;
        this.b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        m90 m90Var = new m90(context, f6Var);
        this.d = m90Var;
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTypeface(AndroidUtilities.bold());
        addView(m90Var, w7.a6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.c6.a(m90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.a6.e(34, 34, 17));
        n6 n6Var = new n6(false, false, false, false);
        this.e = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.b = 17;
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, context, f6Var);
        this.f = u7Var;
        addView(u7Var, w7.a6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.c6.a(u7Var);
        h();
    }

    private int getMeasuringWidth() {
        float dp = AndroidUtilities.dp(16.66f);
        n6 n6Var = this.e;
        return AndroidUtilities.dp(11.0f) + this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f) + (n6Var.d > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(dp, n6Var.d + AndroidUtilities.dp(10.0f))) : 0) + this.L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i10 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        return i0.a.d(this.x ? 1.0f : this.F, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
    }

    private void setLayout(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(false);
        long j10 = this.w;
        long j11 = tL_forumTopic.id;
        boolean z11 = j10 == j11;
        this.w = j11;
        this.h.setVisibility(8);
        m90 m90Var = this.d;
        m90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            uq uqVar = new uq(R.drawable.msg_filled_general, 0);
            uqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(uqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new y5(tL_forumTopic.icon_emoji_id, m90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        m90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.a).isDialogMuted(j3, this.w), z11);
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
        m90 m90Var = this.d;
        m90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new uq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        m90Var.setText(spannableStringBuilder);
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
            c31 c31Var = new c31(getContext());
            c31Var.b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.b));
            imageView.setImageDrawable(c31Var);
        }
        String string = LocaleController.getString(z10 ? R.string.BotForumNewTopic : R.string.AllTopicsShort);
        m90 m90Var = this.d;
        m90Var.setText(string);
        m90Var.setVisibility(z10 ? 8 : 0);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.d) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float e = this.r.e(this.n);
        if (e > 0.0f) {
            if (this.c == null) {
                this.c = new jp0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, e);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i10, boolean z10, boolean z11) {
        n6 n6Var = this.e;
        if (i10 > 0) {
            this.I = z10 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            n6Var.q(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.j6.V8;
            n6Var.q("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new d31(this, 0));
            this.K.addListener(new zn0(this, 13));
            this.K.setInterpolator(new OvershootInterpolator(2.0f));
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
        m90 m90Var = this.d;
        m90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        r90 r90Var = new r90(AndroidUtilities.dp(42.0f), m90Var);
        r90Var.e = 0.95f;
        spannableStringBuilder.setSpan(r90Var, 0, 1, 33);
        m90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        boolean z11 = this.w == peerDialogId;
        this.w = peerDialogId;
        this.h.setVisibility(8);
        m90 m90Var = this.d;
        m90Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.E;
        int i10 = this.a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(m90Var, 18.0f, i10);
            this.E = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.E;
            g9 g9Var = g5Var3.c;
            g9Var.j(g5Var3.e, userOrChat);
            g5Var3.b.setForUserOrChat(userOrChat, g9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        m90Var.setText(TextUtils.ellipsize(spannableStringBuilder, m90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j3, peerDialogId), z11);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.w;
    }

    public final void h() {
        int textColor = getTextColor();
        m90 m90Var = this.d;
        m90Var.setTextColor(textColor);
        m90Var.setEmojiColor(textColor);
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
        m90 m90Var = this.d;
        m90Var.layout(dp, i16 - (m90Var.getMeasuredHeight() / 2), m90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (m90Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        org.telegram.ui.u7 u7Var = this.f;
        if (f7 > 0.0f) {
            u7Var.layout((i14 - AndroidUtilities.dp(11.0f)) - u7Var.getMeasuredWidth(), i16 - (u7Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (u7Var.getMeasuredHeight() / 2) + i16);
        } else {
            u7Var.layout(AndroidUtilities.dp(4.66f) + m90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), i16 - (u7Var.getMeasuredHeight() / 2), u7Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + m90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (u7Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && u7Var.getLeft() != this.v) {
            u7Var.setTranslationX((-u7Var.getLeft()) + this.v);
            u7Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(wr.h).start();
        }
        this.v = u7Var.getLeft();
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
        ofFloat.addUpdateListener(new d31(this, 1));
        this.H.addListener(new yo(17, this, z10));
        this.H.setInterpolator(wr.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
