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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h21 extends FrameLayout {
    public org.telegram.ui.g5 A;
    public float B;
    public boolean C;
    public ValueAnimator D;
    public int E;
    public int F;
    public ValueAnimator G;
    public int H;
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public so0 c;
    public final y80 d;
    public final n6 e;
    public final lh.z2 f;
    public final ImageView h;
    public boolean n;
    public final d6 r;
    public boolean s;
    public int v;
    public long w;
    public boolean x;
    public boolean y;

    public h21(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.r = new d6(this, 360L, jr.h);
        this.s = false;
        this.x = false;
        this.y = false;
        this.E = org.telegram.ui.ActionBar.g6.U8;
        this.H = 0;
        this.a = i10;
        this.b = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        y80 y80Var = new y80(context, c6Var);
        this.d = y80Var;
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTypeface(AndroidUtilities.bold());
        addView(y80Var, i7.f6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        i7.h6.a(y80Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, i7.f6.e(34, 34, 17));
        n6 n6Var = new n6(false, false, false, false);
        this.e = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.b = 17;
        lh.z2 z2Var = new lh.z2(this, context, c6Var);
        this.f = z2Var;
        addView(z2Var, i7.f6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        i7.h6.a(z2Var);
        h();
    }

    private int getMeasuringWidth() {
        float dp = AndroidUtilities.dp(16.66f);
        n6 n6Var = this.e;
        return AndroidUtilities.dp(11.0f) + this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f) + (n6Var.d > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(dp, n6Var.d + AndroidUtilities.dp(10.0f))) : 0) + this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i10 = org.telegram.ui.ActionBar.g6.z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        return i0.a.d(this.x ? 1.0f : this.B, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
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
        y80 y80Var = this.d;
        y80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            iq iqVar = new iq(R.drawable.msg_filled_general, 0);
            iqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(iqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new y5(tL_forumTopic.icon_emoji_id, y80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        y80Var.setText(spannableStringBuilder);
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
        y80 y80Var = this.d;
        y80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new iq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        y80Var.setText(spannableStringBuilder);
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
            e21 e21Var = new e21(getContext());
            e21Var.b.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.b));
            imageView.setImageDrawable(e21Var);
        }
        String string = LocaleController.getString(z10 ? R.string.BotForumNewTopic : R.string.AllTopicsShort);
        y80 y80Var = this.d;
        y80Var.setText(string);
        y80Var.setVisibility(z10 ? 8 : 0);
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
        float e10 = this.r.e(this.n);
        if (e10 > 0.0f) {
            if (this.c == null) {
                this.c = new so0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, e10);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i10, boolean z10, boolean z11) {
        n6 n6Var = this.e;
        int i11 = 1;
        if (i10 > 0) {
            this.E = z10 ? org.telegram.ui.ActionBar.g6.V8 : org.telegram.ui.ActionBar.g6.U8;
            n6Var.q(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.E = org.telegram.ui.ActionBar.g6.V8;
            n6Var.q("", z11, true);
        }
        if (z11 && this.F < i10) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new f21(this, 0));
            this.G.addListener(new p11(this, i11));
            this.G.setInterpolator(new OvershootInterpolator(2.0f));
            this.G.setDuration(200L);
            this.G.start();
        }
        this.F = i10;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.w = -1L;
        this.h.setVisibility(8);
        y80 y80Var = this.d;
        y80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        d90 d90Var = new d90(AndroidUtilities.dp(42.0f), y80Var);
        d90Var.e = 0.95f;
        spannableStringBuilder.setSpan(d90Var, 0, 1, 33);
        y80Var.setText(spannableStringBuilder);
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
        y80 y80Var = this.d;
        y80Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.A;
        int i10 = this.a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(y80Var, 18.0f, i10);
            this.A = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.A;
            e9 e9Var = g5Var3.c;
            e9Var.j(g5Var3.e, userOrChat);
            g5Var3.b.setForUserOrChat(userOrChat, e9Var);
            spannableStringBuilder.setSpan(this.A, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        y80Var.setText(TextUtils.ellipsize(spannableStringBuilder, y80Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
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
        y80 y80Var = this.d;
        y80Var.setTextColor(textColor);
        y80Var.setEmojiColor(textColor);
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
        y80 y80Var = this.d;
        y80Var.layout(dp, i16 - (y80Var.getMeasuredHeight() / 2), y80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (y80Var.getMeasuredHeight() / 2) + i16);
        float f9 = this.e.d;
        lh.z2 z2Var = this.f;
        if (f9 > 0.0f) {
            z2Var.layout((i14 - AndroidUtilities.dp(11.0f)) - z2Var.getMeasuredWidth(), i16 - (z2Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (z2Var.getMeasuredHeight() / 2) + i16);
        } else {
            z2Var.layout(AndroidUtilities.dp(4.66f) + y80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), i16 - (z2Var.getMeasuredHeight() / 2), z2Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + y80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (z2Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && z2Var.getLeft() != this.v) {
            z2Var.setTranslationX((-z2Var.getLeft()) + this.v);
            z2Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(jr.h).start();
        }
        this.v = z2Var.getLeft();
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
        if (this.C == z10) {
            return;
        }
        this.C = z10;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, z10 ? 1.0f : 0.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new f21(this, 1));
        this.D.addListener(new z9(21, this, z10));
        this.D.setInterpolator(jr.h);
        this.D.setDuration(320L);
        this.D.start();
    }
}
