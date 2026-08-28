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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v11 extends FrameLayout {
    public org.telegram.ui.f5 A;
    public float B;
    public boolean C;
    public ValueAnimator D;
    public int E;
    public int F;
    public ValueAnimator G;
    public int H;
    public final int a;
    public final org.telegram.ui.ActionBar.b6 b;
    public ho0 c;
    public final l80 d;
    public final i6 e;
    public final ih.b3 f;
    public final ImageView h;
    public boolean n;
    public final y5 r;
    public boolean s;
    public int v;
    public long w;
    public boolean x;
    public boolean y;

    public v11(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.r = new y5(this, 360L, gr.h);
        this.s = false;
        this.x = false;
        this.y = false;
        this.E = org.telegram.ui.ActionBar.f6.U8;
        this.H = 0;
        this.a = i9;
        this.b = b6Var;
        setClipChildren(false);
        setClipToPadding(false);
        l80 l80Var = new l80(context, b6Var);
        this.d = l80Var;
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTypeface(AndroidUtilities.bold());
        addView(l80Var, g7.e6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        g7.g6.a(l80Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, g7.e6.e(34, 34, 17));
        i6 i6Var = new i6(false, false, false, false);
        this.e = i6Var;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.b = 17;
        ih.b3 b3Var = new ih.b3(this, context, b6Var);
        this.f = b3Var;
        addView(b3Var, g7.e6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        g7.g6.a(b3Var);
        h();
    }

    private int getMeasuringWidth() {
        float dp = AndroidUtilities.dp(16.66f);
        i6 i6Var = this.e;
        return AndroidUtilities.dp(11.0f) + this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f) + (i6Var.d > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(dp, i6Var.d + AndroidUtilities.dp(10.0f))) : 0) + this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i9 = org.telegram.ui.ActionBar.f6.z6;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        return i0.a.d(this.x ? 1.0f : this.B, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
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
        l80 l80Var = this.d;
        l80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            eq eqVar = new eq(R.drawable.msg_filled_general, 0);
            eqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(eqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new t5(tL_forumTopic.icon_emoji_id, l80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        l80Var.setText(spannableStringBuilder);
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
        l80 l80Var = this.d;
        l80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new eq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        l80Var.setText(spannableStringBuilder);
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
        int i9 = z10 ? 0 : 8;
        ImageView imageView = this.h;
        imageView.setVisibility(i9);
        if (z10) {
            s11 s11Var = new s11(getContext());
            s11Var.b.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.b));
            imageView.setImageDrawable(s11Var);
        }
        String string = LocaleController.getString(z10 ? R.string.BotForumNewTopic : R.string.AllTopicsShort);
        l80 l80Var = this.d;
        l80Var.setText(string);
        l80Var.setVisibility(z10 ? 8 : 0);
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
                this.c = new ho0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, e10);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i9, boolean z10, boolean z11) {
        i6 i6Var = this.e;
        if (i9 > 0) {
            this.E = z10 ? org.telegram.ui.ActionBar.f6.V8 : org.telegram.ui.ActionBar.f6.U8;
            i6Var.q(LocaleController.formatNumber(i9, ','), z11, true);
        } else {
            this.E = org.telegram.ui.ActionBar.f6.V8;
            i6Var.q("", z11, true);
        }
        if (z11 && this.F < i9) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new t11(this, 0));
            this.G.addListener(new r60(this, 29));
            this.G.setInterpolator(new OvershootInterpolator(2.0f));
            this.G.setDuration(200L);
            this.G.start();
        }
        this.F = i9;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.w = -1L;
        this.h.setVisibility(8);
        l80 l80Var = this.d;
        l80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        q80 q80Var = new q80(AndroidUtilities.dp(42.0f), l80Var);
        q80Var.e = 0.95f;
        spannableStringBuilder.setSpan(q80Var, 0, 1, 33);
        l80Var.setText(spannableStringBuilder);
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
        l80 l80Var = this.d;
        l80Var.setVisibility(0);
        org.telegram.ui.f5 f5Var = this.A;
        int i9 = this.a;
        if (f5Var == null) {
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(l80Var, 18.0f, i9);
            this.A = f5Var2;
            f5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i9).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.f5 f5Var3 = this.A;
            z8 z8Var = f5Var3.c;
            z8Var.j(f5Var3.e, userOrChat);
            f5Var3.b.setForUserOrChat(userOrChat, z8Var);
            spannableStringBuilder.setSpan(this.A, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        l80Var.setText(TextUtils.ellipsize(spannableStringBuilder, l80Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i9).isDialogMuted(j10, peerDialogId), z11);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.w;
    }

    public final void h() {
        int textColor = getTextColor();
        l80 l80Var = this.d;
        l80Var.setTextColor(textColor);
        l80Var.setEmojiColor(textColor);
        this.f.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        ImageView imageView = this.h;
        int measuredWidth = (i13 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int dp = AndroidUtilities.dp(11.0f);
        int i15 = i14 / 2;
        l80 l80Var = this.d;
        l80Var.layout(dp, i15 - (l80Var.getMeasuredHeight() / 2), l80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (l80Var.getMeasuredHeight() / 2) + i15);
        float f10 = this.e.d;
        ih.b3 b3Var = this.f;
        if (f10 > 0.0f) {
            b3Var.layout((i13 - AndroidUtilities.dp(11.0f)) - b3Var.getMeasuredWidth(), i15 - (b3Var.getMeasuredHeight() / 2), i13 - AndroidUtilities.dp(11.0f), (b3Var.getMeasuredHeight() / 2) + i15);
        } else {
            b3Var.layout(AndroidUtilities.dp(4.66f) + l80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), i15 - (b3Var.getMeasuredHeight() / 2), b3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + l80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (b3Var.getMeasuredHeight() / 2) + i15);
        }
        if (this.v != 0 && b3Var.getLeft() != this.v) {
            b3Var.setTranslationX((-b3Var.getLeft()) + this.v);
            b3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        this.v = b3Var.getLeft();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.d.measure(i9, i10);
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
        ofFloat.addUpdateListener(new t11(this, 1));
        this.D.addListener(new u9(21, this, z10));
        this.D.setInterpolator(gr.h);
        this.D.setDuration(320L);
        this.D.start();
    }
}
