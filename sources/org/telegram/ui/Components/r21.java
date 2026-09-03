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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r21 extends FrameLayout {
    public org.telegram.ui.k5 B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public int F;
    public int G;
    public ValueAnimator H;
    public int I;
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public bp0 c;
    public final f90 d;
    public final j6 e;
    public final nh.a3 f;
    public final ImageView h;
    public boolean n;
    public final z5 r;
    public boolean s;
    public int v;
    public long w;
    public boolean x;
    public boolean y;

    public r21(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = new z5(this, 360L, mr.h);
        this.s = false;
        this.x = false;
        this.y = false;
        this.F = org.telegram.ui.ActionBar.j6.U8;
        this.I = 0;
        this.a = i10;
        this.b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        f90 f90Var = new f90(context, f6Var);
        this.d = f90Var;
        f90Var.setTextSize(1, 14.0f);
        f90Var.setTypeface(AndroidUtilities.bold());
        addView(f90Var, k7.b6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        k7.d6.a(f90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, k7.b6.e(34, 34, 17));
        j6 j6Var = new j6(false, false, false, false);
        this.e = j6Var;
        j6Var.t(AndroidUtilities.dp(11.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.b = 17;
        nh.a3 a3Var = new nh.a3(this, context, f6Var);
        this.f = a3Var;
        addView(a3Var, k7.b6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        k7.d6.a(a3Var);
        h();
    }

    private int getMeasuringWidth() {
        float dp = AndroidUtilities.dp(16.66f);
        j6 j6Var = this.e;
        return AndroidUtilities.dp(11.0f) + this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f) + (j6Var.d > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(dp, j6Var.d + AndroidUtilities.dp(10.0f))) : 0) + this.I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i10 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        return i0.a.d(this.x ? 1.0f : this.C, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
    }

    private void setLayout(boolean z4) {
        if (this.y == z4) {
            return;
        }
        this.y = z4;
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        setLayout(false);
        long j11 = this.w;
        long j12 = tL_forumTopic.id;
        boolean z10 = j11 == j12;
        this.w = j12;
        this.h.setVisibility(8);
        f90 f90Var = this.d;
        f90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            lq lqVar = new lq(R.drawable.msg_filled_general, 0);
            lqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(lqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new u5(tL_forumTopic.icon_emoji_id, f90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        f90Var.setText(spannableStringBuilder);
        setSelected(z4);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.a).isDialogMuted(j10, this.w), z10);
        boolean z11 = tL_forumTopic.pinned;
        if (this.s != z11) {
            this.s = z11;
        }
    }

    public final void c() {
        setLayout(false);
        this.w = 0L;
        this.x = true;
        this.h.setVisibility(8);
        f90 f90Var = this.d;
        f90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new lq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        f90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void d(boolean z4, boolean z10, boolean z11) {
        setLayout(z10);
        this.w = 0L;
        this.x = false;
        int i10 = z4 ? 0 : 8;
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z4) {
            o21 o21Var = new o21(getContext());
            o21Var.b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.b));
            imageView.setImageDrawable(o21Var);
        }
        String string = LocaleController.getString(z4 ? R.string.BotForumNewTopic : R.string.AllTopicsShort);
        f90 f90Var = this.d;
        f90Var.setText(string);
        f90Var.setVisibility(z4 ? 8 : 0);
        setSelected(z11);
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
                this.c = new bp0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, e);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i10, boolean z4, boolean z10) {
        j6 j6Var = this.e;
        if (i10 > 0) {
            this.F = z4 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            j6Var.q(LocaleController.formatNumber(i10, ','), z10, true);
        } else {
            this.F = org.telegram.ui.ActionBar.j6.V8;
            j6Var.q("", z10, true);
        }
        if (z10 && this.G < i10) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new p21(this, 0));
            this.H.addListener(new od0(this, 22));
            this.H.setInterpolator(new OvershootInterpolator(2.0f));
            this.H.setDuration(200L);
            this.H.start();
        }
        this.G = i10;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.w = -1L;
        this.h.setVisibility(8);
        f90 f90Var = this.d;
        f90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        k90 k90Var = new k90(AndroidUtilities.dp(42.0f), f90Var);
        k90Var.e = 0.95f;
        spannableStringBuilder.setSpan(k90Var, 0, 1, 33);
        f90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        boolean z10 = this.w == peerDialogId;
        this.w = peerDialogId;
        this.h.setVisibility(8);
        f90 f90Var = this.d;
        f90Var.setVisibility(0);
        org.telegram.ui.k5 k5Var = this.B;
        int i10 = this.a;
        if (k5Var == null) {
            org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(f90Var, 18.0f, i10);
            this.B = k5Var2;
            k5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.k5 k5Var3 = this.B;
            z8 z8Var = k5Var3.c;
            z8Var.j(k5Var3.e, userOrChat);
            k5Var3.b.setForUserOrChat(userOrChat, z8Var);
            spannableStringBuilder.setSpan(this.B, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        f90Var.setText(TextUtils.ellipsize(spannableStringBuilder, f90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z4);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z10);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.w;
    }

    public final void h() {
        int textColor = getTextColor();
        f90 f90Var = this.d;
        f90Var.setTextColor(textColor);
        f90Var.setEmojiColor(textColor);
        this.f.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        ImageView imageView = this.h;
        int measuredWidth = (i14 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int dp = AndroidUtilities.dp(11.0f);
        int i16 = i15 / 2;
        f90 f90Var = this.d;
        f90Var.layout(dp, i16 - (f90Var.getMeasuredHeight() / 2), f90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (f90Var.getMeasuredHeight() / 2) + i16);
        float f10 = this.e.d;
        nh.a3 a3Var = this.f;
        if (f10 > 0.0f) {
            a3Var.layout((i14 - AndroidUtilities.dp(11.0f)) - a3Var.getMeasuredWidth(), i16 - (a3Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (a3Var.getMeasuredHeight() / 2) + i16);
        } else {
            a3Var.layout(AndroidUtilities.dp(4.66f) + f90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), i16 - (a3Var.getMeasuredHeight() / 2), a3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + f90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (a3Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && a3Var.getLeft() != this.v) {
            a3Var.setTranslationX((-a3Var.getLeft()) + this.v);
            a3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(mr.h).start();
        }
        this.v = a3Var.getLeft();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30));
    }

    public void setReorder(boolean z4) {
        this.n = z4;
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z4) {
        if (this.D == z4) {
            return;
        }
        this.D = z4;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, z4 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new p21(this, 1));
        this.E.addListener(new m00(13, this, z4));
        this.E.setInterpolator(mr.h);
        this.E.setDuration(320L);
        this.E.start();
    }
}
