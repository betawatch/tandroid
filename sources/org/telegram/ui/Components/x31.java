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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x31 extends FrameLayout {
    public org.telegram.ui.g5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public dq0 c;
    public final ea0 d;
    public final q6 e;
    public final ai.o4 f;
    public final ImageView h;
    public boolean n;
    public final g6 r;
    public boolean s;
    public int v;
    public long w;
    public boolean x;
    public boolean y;

    public x31(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = new g6(this, 360L, hs.h);
        this.s = false;
        this.x = false;
        this.y = false;
        this.I = org.telegram.ui.ActionBar.i6.U8;
        this.L = 0;
        this.a = i10;
        this.b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        ea0 ea0Var = new ea0(context, e6Var);
        this.d = ea0Var;
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setTypeface(AndroidUtilities.bold());
        addView(ea0Var, w7.x5.a(-2.0f, 11.0f, 0.0f, 11.0f, 0.0f, -2, 19));
        w7.z5.a(ea0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.x5.e(34, 34, 17));
        q6 q6Var = new q6(false, false, false);
        this.e = q6Var;
        q6Var.w(AndroidUtilities.dp(11.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.b = 17;
        ai.o4 o4Var = new ai.o4(this, context, e6Var);
        this.f = o4Var;
        addView(o4Var, w7.x5.a(-2.0f, 4.66f, 0.0f, 11.0f, 0.0f, -2, 21));
        w7.z5.a(o4Var);
        h();
    }

    private int getMeasuringWidth() {
        float dp = AndroidUtilities.dp(16.66f);
        q6 q6Var = this.e;
        return AndroidUtilities.dp(11.0f) + this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f) + (q6Var.d > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(dp, q6Var.d + AndroidUtilities.dp(10.0f))) : 0) + this.L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i10 = org.telegram.ui.ActionBar.i6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        return i0.a.d(this.x ? 1.0f : this.F, org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var));
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
        ea0 ea0Var = this.d;
        ea0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            er erVar = new er(R.drawable.msg_filled_general, 0);
            erVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(erVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new b6(tL_forumTopic.icon_emoji_id, ea0Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        ea0Var.setText(spannableStringBuilder);
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
        ea0 ea0Var = this.d;
        ea0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new er(R.drawable.menu_topic_add, 0), 0, 1, 33);
        ea0Var.setText(spannableStringBuilder);
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
            u31 u31Var = new u31(getContext());
            u31Var.b.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.b));
            imageView.setImageDrawable(u31Var);
        }
        String string = LocaleController.getString(z10 ? R.string.BotForumNewTopic : R.string.AllTopicsShort);
        ea0 ea0Var = this.d;
        ea0Var.setText(string);
        ea0Var.setVisibility(z10 ? 8 : 0);
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
        float e7 = this.r.e(this.n);
        if (e7 > 0.0f) {
            if (this.c == null) {
                this.c = new dq0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, e7);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i10, boolean z10, boolean z11) {
        q6 q6Var = this.e;
        if (i10 > 0) {
            this.I = z10 ? org.telegram.ui.ActionBar.i6.V8 : org.telegram.ui.ActionBar.i6.U8;
            q6Var.t(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.i6.V8;
            q6Var.t("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new v31(this, 0));
            this.K.addListener(new vd0(this, 24));
            org.telegram.messenger.bi.l(2.0f, this.K);
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
        ea0 ea0Var = this.d;
        ea0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        ja0 ja0Var = new ja0(AndroidUtilities.dp(42.0f), ea0Var);
        ja0Var.e = 0.95f;
        spannableStringBuilder.setSpan(ja0Var, 0, 1, 33);
        ea0Var.setText(spannableStringBuilder);
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
        ea0 ea0Var = this.d;
        ea0Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.E;
        int i10 = this.a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(ea0Var, 18.0f, i10);
            this.E = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.E;
            j9 j9Var = g5Var3.c;
            j9Var.j(g5Var3.e, userOrChat);
            g5Var3.b.setForUserOrChat(userOrChat, j9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        ea0Var.setText(TextUtils.ellipsize(spannableStringBuilder, ea0Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
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
        ea0 ea0Var = this.d;
        ea0Var.setTextColor(textColor);
        ea0Var.setEmojiColor(textColor);
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
        ea0 ea0Var = this.d;
        ea0Var.layout(dp, i16 - (ea0Var.getMeasuredHeight() / 2), ea0Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (ea0Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        ai.o4 o4Var = this.f;
        if (f7 > 0.0f) {
            o4Var.layout((i14 - AndroidUtilities.dp(11.0f)) - o4Var.getMeasuredWidth(), i16 - (o4Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (o4Var.getMeasuredHeight() / 2) + i16);
        } else {
            o4Var.layout(AndroidUtilities.dp(4.66f) + ea0Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), i16 - (o4Var.getMeasuredHeight() / 2), o4Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + ea0Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (o4Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && o4Var.getLeft() != this.v) {
            o4Var.setTranslationX((-o4Var.getLeft()) + this.v);
            o4Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(hs.h).start();
        }
        this.v = o4Var.getLeft();
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
        ofFloat.addUpdateListener(new v31(this, 1));
        this.H.addListener(new fa(21, this, z10));
        this.H.setInterpolator(hs.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
