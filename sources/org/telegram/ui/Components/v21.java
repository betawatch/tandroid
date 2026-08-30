package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v21 extends FrameLayout {
    public int B;
    public SpannableStringBuilder C;
    public SpannableStringBuilder D;
    public int E;
    public boolean F;
    public boolean G;
    public float H;
    public ValueAnimator I;
    public long J;
    public boolean K;
    public boolean L;
    public i90 M;
    public float N;
    public boolean O;
    public ValueAnimator P;
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public cp0 c;
    public final dg.k0 d;
    public final FrameLayout.LayoutParams e;
    public final j6 f;
    public final dg.v3 h;
    public final p9 n;
    public final z8 r;
    public final TextView s;
    public final ImageView v;
    public boolean w;
    public boolean x;
    public boolean y;

    public v21(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.x = false;
        this.y = false;
        this.B = org.telegram.ui.ActionBar.j6.U8;
        this.H = 1.0f;
        this.J = 0L;
        this.K = false;
        this.L = false;
        this.a = i10;
        this.b = f6Var;
        dg.k0 k0Var = new dg.k0(this, context);
        this.d = k0Var;
        k0Var.setWillNotDraw(false);
        k0Var.setOrientation(1);
        addView(k0Var, k7.b6.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        k7.d6.a(k0Var);
        j6 j6Var = new j6(false, false, false, false);
        this.f = j6Var;
        j6Var.t(AndroidUtilities.dp(11.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, f6Var));
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.b = 17;
        dg.v3 v3Var = new dg.v3(this, context, f6Var);
        this.h = v3Var;
        v3Var.setWillNotDraw(false);
        v3Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        k0Var.addView(v3Var, k7.b6.q(-1, -2, 17));
        p9 p9Var = new p9(context);
        this.n = p9Var;
        FrameLayout.LayoutParams e = k7.b6.e(34, 34, 17);
        this.e = e;
        v3Var.addView(p9Var, e);
        this.r = new z8((org.telegram.ui.ActionBar.f6) null);
        TextView textView = new TextView(context);
        this.s = textView;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        textView.setTextColor(i0.a.d(this.N, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        k0Var.addView(textView, k7.b6.t(-1, -2, 17, 4, 0, 4, 0));
        k0Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        addView(imageView, k7.b6.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z4) {
        if (this.x == z4) {
            return;
        }
        this.x = z4;
        this.n.setRoundRadius(AndroidUtilities.dp(z4 ? 36.0f : 3.0f));
        this.h.setPadding(0, AndroidUtilities.dp(z4 ? 7.0f : 4.0f), 0, 0);
        int dp = z4 ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = dp;
        layoutParams.height = z4 ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
    }

    public final void a(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        setLayout(false);
        long j11 = this.J;
        long j12 = tL_forumTopic.id;
        boolean z13 = j11 == j12;
        this.L = false;
        this.J = j12;
        this.K = false;
        String str = tL_forumTopic.title;
        TextView textView = this.s;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.id;
        p9 p9Var = this.n;
        if (i10 == 1) {
            this.L = true;
            p9Var.b();
            p9Var.setAnimatedEmojiDrawable(null);
            p9Var.setImageResource(R.drawable.msg_filled_general);
            p9Var.setScaleX(0.66f);
            p9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            p9Var.b();
            p9Var.setAnimatedEmojiDrawable(l5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            p9Var.setScaleX(1.0f);
            p9Var.setScaleY(1.0f);
        } else {
            p9Var.setAnimatedEmojiDrawable(null);
            p9Var.setImageDrawable(ag.f.e(tL_forumTopic));
            p9Var.setScaleX(1.0f);
            p9Var.setScaleY(1.0f);
        }
        setSelected(z4);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.a).isDialogMuted(j10, tL_forumTopic.id);
        int i11 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_mentions_count > 0) {
            z10 = z13;
            z11 = isDialogMuted;
            z12 = true;
        } else {
            z10 = z13;
            z11 = isDialogMuted;
            z12 = false;
        }
        d(i11, z11, z12, tL_forumTopic.unread_reactions_count > 0, z10);
        boolean z14 = tL_forumTopic.pinned;
        if (this.y != z14) {
            this.y = z14;
        }
        h();
    }

    public final void b(boolean z4, boolean z10) {
        setLayout(z4);
        this.L = true;
        this.K = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.s;
        textView.setText(string);
        textView.setVisibility(0);
        p9 p9Var = this.n;
        p9Var.b();
        p9Var.setAnimatedEmojiDrawable(null);
        p9Var.setImageResource(R.drawable.emoji_tabs_new3);
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        setSelected(z10);
        g();
        h();
        d(0, true, false, false, false);
        if (this.y) {
            this.y = false;
        }
    }

    public final void c(boolean z4, boolean z10, boolean z11) {
        setLayout(z10);
        this.J = -1L;
        this.L = true;
        this.K = false;
        String string = LocaleController.getString(z4 ? R.string.BotForumNewTopic : R.string.AllTopicsSide);
        TextView textView = this.s;
        textView.setText(string);
        textView.setVisibility(z4 ? 8 : 0);
        p9 p9Var = this.n;
        p9Var.b();
        p9Var.setAnimatedEmojiDrawable(null);
        if (z4) {
            o21 o21Var = new o21(getContext());
            o21Var.b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.b));
            p9Var.setImageDrawable(o21Var);
        } else {
            p9Var.setImageResource(R.drawable.other_chats);
        }
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.y) {
            this.y = false;
        }
    }

    public final void d(int i10, boolean z4, boolean z10, boolean z11, boolean z12) {
        j6 j6Var = this.f;
        int i11 = 1;
        if (z11) {
            this.B = org.telegram.ui.ActionBar.j6.Z5;
            if (this.D == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                mq mqVar = new mq(R.drawable.mini_like_filled, 0);
                mqVar.setScale(0.8f, 0.8f);
                mqVar.spaceScaleX = 0.5f;
                mqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(mqVar, 0, spannableStringBuilder.length(), 33);
                this.D = spannableStringBuilder;
            }
            j6Var.q(this.D, z12, true);
        } else if (z10) {
            this.B = z4 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            if (this.C == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                mq mqVar2 = new mq(R.drawable.mini_mention_filled_16, 0);
                mqVar2.setScale(0.8f, 0.8f);
                mqVar2.spaceScaleX = 0.5f;
                mqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(mqVar2, 0, 1, 33);
                this.C = spannableStringBuilder2;
            }
            j6Var.q(this.C, z12, true);
        } else if (i10 > 0) {
            this.B = z4 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            j6Var.q(LocaleController.formatNumber(i10, ','), z12, true);
        } else {
            this.B = org.telegram.ui.ActionBar.j6.V8;
            j6Var.q("", z12, true);
        }
        if (z12 && (this.E < i10 || ((!this.F && z10) || (!this.G && z11)))) {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.I = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new t21(this, i11));
            this.I.addListener(new nd0(this, 23));
            this.I.setInterpolator(new OvershootInterpolator(2.0f));
            this.I.setDuration(200L);
            this.I.start();
        }
        this.E = i10;
        this.F = z10;
        this.G = z11;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.J = -1L;
        this.L = true;
        this.K = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int dp = AndroidUtilities.dp(38.0f);
        TextView textView = this.s;
        j90 j90Var = new j90(dp, textView);
        j90Var.e = 0.75f;
        spannableStringBuilder.setSpan(j90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        p9 p9Var = this.n;
        p9Var.b();
        p9Var.setAnimatedEmojiDrawable(null);
        if (this.M == null) {
            org.telegram.ui.ActionBar.f6 f6Var = this.b;
            i90 i90Var = new i90(f6Var);
            this.M = i90Var;
            i90Var.j(38.0f);
            this.M.setCallback(p9Var);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var);
            this.M.f(org.telegram.ui.ActionBar.j6.l1(0.15f, v02), org.telegram.ui.ActionBar.j6.l1(0.5f, v02), org.telegram.ui.ActionBar.j6.l1(0.6f, v02), org.telegram.ui.ActionBar.j6.l1(0.15f, v02));
            this.M.n = false;
        }
        p9Var.setImageDrawable(this.M);
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.y) {
            this.y = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        setLayout(true);
        this.K = false;
        this.L = false;
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        boolean z10 = peerDialogId == this.J;
        this.J = peerDialogId;
        String name = DialogObject.getName(peerDialogId);
        TextView textView = this.s;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = this.a;
        p9 p9Var = this.n;
        z8 z8Var = this.r;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            z8Var.r(user);
            p9Var.e(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
        }
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        h();
        setSelected(z4);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z10);
        if (this.y) {
            this.y = false;
        }
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int d = i0.a.d(this.K ? 1.0f : this.N, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        boolean z4 = this.L;
        p9 p9Var = this.n;
        if (z4) {
            p9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        } else {
            p9Var.setColorFilter(null);
        }
        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        p9Var.invalidate();
    }

    public final void h() {
        float f10 = (1.0f - this.N) * (-AndroidUtilities.dp(3.0f));
        ImageView imageView = this.v;
        imageView.setTranslationX(f10);
        imageView.setVisibility(this.N <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        this.s.setTextColor(i0.a.d(this.K ? 1.0f : this.N, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), TLObject.FLAG_30), i11);
    }

    public void setReorder(boolean z4) {
        this.w = z4;
        this.d.invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z4) {
        if (this.O == z4) {
            return;
        }
        this.O = z4;
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, z4 ? 1.0f : 0.0f);
        this.P = ofFloat;
        ofFloat.addUpdateListener(new t21(this, 0));
        this.P.addListener(new l00(14, this, z4));
        this.P.setInterpolator(nr.h);
        this.P.setDuration(320L);
        this.P.start();
    }
}
