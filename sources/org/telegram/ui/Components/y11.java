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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y11 extends FrameLayout {
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
    public io0 c;
    public final p80 d;
    public final i6 e;
    public final jh.a3 f;
    public final ImageView h;
    public boolean n;
    public final y5 r;
    public boolean s;
    public int v;
    public long w;
    public boolean x;
    public boolean y;

    public y11(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.r = new y5(this, 360L, er.h);
        this.s = false;
        this.x = false;
        this.y = false;
        this.E = org.telegram.ui.ActionBar.g6.U8;
        this.H = 0;
        this.a = i10;
        this.b = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        p80 p80Var = new p80(context, c6Var);
        this.d = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTypeface(AndroidUtilities.bold());
        addView(p80Var, h7.z5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        h7.b6.a(p80Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, h7.z5.e(34, 34, 17));
        i6 i6Var = new i6(false, false, false, false);
        this.e = i6Var;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.b = 17;
        jh.a3 a3Var = new jh.a3(this, context, c6Var);
        this.f = a3Var;
        addView(a3Var, h7.z5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        h7.b6.a(a3Var);
        h();
    }

    private int getMeasuringWidth() {
        float dp = AndroidUtilities.dp(16.66f);
        i6 i6Var = this.e;
        return AndroidUtilities.dp(11.0f) + this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f) + (i6Var.d > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(dp, i6Var.d + AndroidUtilities.dp(10.0f))) : 0) + this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i10 = org.telegram.ui.ActionBar.g6.z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        return i0.b.d(this.x ? 1.0f : this.B, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
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
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            cq cqVar = new cq(R.drawable.msg_filled_general, 0);
            cqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(cqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new t5(tL_forumTopic.icon_emoji_id, p80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        p80Var.setText(spannableStringBuilder);
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
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new cq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        p80Var.setText(spannableStringBuilder);
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
            v11 v11Var = new v11(getContext());
            v11Var.b.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.b));
            imageView.setImageDrawable(v11Var);
        }
        String string = LocaleController.getString(z10 ? R.string.BotForumNewTopic : R.string.AllTopicsShort);
        p80 p80Var = this.d;
        p80Var.setText(string);
        p80Var.setVisibility(z10 ? 8 : 0);
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
        float e9 = this.r.e(this.n);
        if (e9 > 0.0f) {
            if (this.c == null) {
                this.c = new io0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, e9);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i10, boolean z10, boolean z11) {
        i6 i6Var = this.e;
        int i11 = 1;
        if (i10 > 0) {
            this.E = z10 ? org.telegram.ui.ActionBar.g6.V8 : org.telegram.ui.ActionBar.g6.U8;
            i6Var.q(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.E = org.telegram.ui.ActionBar.g6.V8;
            i6Var.q("", z11, true);
        }
        if (z11 && this.F < i10) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new w11(this, 0));
            this.G.addListener(new f11(this, i11));
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
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        u80 u80Var = new u80(AndroidUtilities.dp(42.0f), p80Var);
        u80Var.e = 0.95f;
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
        p80Var.setText(spannableStringBuilder);
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
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.A;
        int i10 = this.a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(p80Var, 18.0f, i10);
            this.A = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.A;
            y8 y8Var = g5Var3.c;
            y8Var.j(g5Var3.e, userOrChat);
            g5Var3.b.setForUserOrChat(userOrChat, y8Var);
            spannableStringBuilder.setSpan(this.A, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        p80Var.setText(TextUtils.ellipsize(spannableStringBuilder, p80Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
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
        p80 p80Var = this.d;
        p80Var.setTextColor(textColor);
        p80Var.setEmojiColor(textColor);
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
        p80 p80Var = this.d;
        p80Var.layout(dp, i16 - (p80Var.getMeasuredHeight() / 2), p80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (p80Var.getMeasuredHeight() / 2) + i16);
        float f10 = this.e.d;
        jh.a3 a3Var = this.f;
        if (f10 > 0.0f) {
            a3Var.layout((i14 - AndroidUtilities.dp(11.0f)) - a3Var.getMeasuredWidth(), i16 - (a3Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (a3Var.getMeasuredHeight() / 2) + i16);
        } else {
            a3Var.layout(AndroidUtilities.dp(4.66f) + p80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), i16 - (a3Var.getMeasuredHeight() / 2), a3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + p80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (a3Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && a3Var.getLeft() != this.v) {
            a3Var.setTranslationX((-a3Var.getLeft()) + this.v);
            a3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(er.h).start();
        }
        this.v = a3Var.getLeft();
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
        ofFloat.addUpdateListener(new w11(this, 1));
        this.D.addListener(new org.telegram.ui.go(22, this, z10));
        this.D.setInterpolator(er.h);
        this.D.setDuration(320L);
        this.D.start();
    }
}
