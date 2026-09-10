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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j31 extends FrameLayout {
    public int E;
    public SpannableStringBuilder F;
    public SpannableStringBuilder G;
    public int H;
    public boolean I;
    public boolean J;
    public float K;
    public ValueAnimator L;
    public long M;
    public boolean N;
    public boolean O;
    public q90 P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public jp0 c;
    public final bi.w6 d;
    public final FrameLayout.LayoutParams e;
    public final n6 f;
    public final bi.w7 h;
    public final w9 n;
    public final g9 r;
    public final TextView s;
    public final ImageView v;
    public boolean w;
    public boolean x;
    public boolean y;

    public j31(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.x = false;
        this.y = false;
        this.E = org.telegram.ui.ActionBar.j6.U8;
        this.K = 1.0f;
        this.M = 0L;
        this.N = false;
        this.O = false;
        this.a = i10;
        this.b = f6Var;
        bi.w6 w6Var = new bi.w6(this, context);
        this.d = w6Var;
        w6Var.setWillNotDraw(false);
        w6Var.setOrientation(1);
        addView(w6Var, w7.a6.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        w7.c6.a(w6Var);
        n6 n6Var = new n6(false, false, false, false);
        this.f = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, f6Var));
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.b = 17;
        bi.w7 w7Var = new bi.w7(this, context, f6Var);
        this.h = w7Var;
        w7Var.setWillNotDraw(false);
        w7Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        w6Var.addView(w7Var, w7.a6.q(-1, -2, 17));
        w9 w9Var = new w9(context);
        this.n = w9Var;
        FrameLayout.LayoutParams e = w7.a6.e(34, 34, 17);
        this.e = e;
        w7Var.addView(w9Var, e);
        this.r = new g9((org.telegram.ui.ActionBar.f6) null);
        TextView textView = new TextView(context);
        this.s = textView;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        textView.setTextColor(i0.a.d(this.Q, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        w6Var.addView(textView, w7.a6.t(-1, -2, 17, 4, 0, 4, 0));
        w6Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        addView(imageView, w7.a6.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        this.n.setRoundRadius(AndroidUtilities.dp(z10 ? 36.0f : 3.0f));
        this.h.setPadding(0, AndroidUtilities.dp(z10 ? 7.0f : 4.0f), 0, 0);
        int dp = z10 ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = dp;
        layoutParams.height = z10 ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
    }

    public final void a(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        setLayout(false);
        long j10 = this.M;
        long j11 = tL_forumTopic.id;
        boolean z14 = j10 == j11;
        this.O = false;
        this.M = j11;
        this.N = false;
        String str = tL_forumTopic.title;
        TextView textView = this.s;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.id;
        w9 w9Var = this.n;
        if (i10 == 1) {
            this.O = true;
            w9Var.b();
            w9Var.setAnimatedEmojiDrawable(null);
            w9Var.setImageResource(R.drawable.msg_filled_general);
            w9Var.setScaleX(0.66f);
            w9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            w9Var.b();
            w9Var.setAnimatedEmojiDrawable(p5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        } else {
            w9Var.setAnimatedEmojiDrawable(null);
            w9Var.setImageDrawable(mg.d.e(tL_forumTopic));
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.a).isDialogMuted(j3, tL_forumTopic.id);
        int i11 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_mentions_count > 0) {
            z11 = z14;
            z12 = isDialogMuted;
            z13 = true;
        } else {
            z11 = z14;
            z12 = isDialogMuted;
            z13 = false;
        }
        d(i11, z12, z13, tL_forumTopic.unread_reactions_count > 0, z11);
        boolean z15 = tL_forumTopic.pinned;
        if (this.y != z15) {
            this.y = z15;
        }
        h();
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.O = true;
        this.N = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.s;
        textView.setText(string);
        textView.setVisibility(0);
        w9 w9Var = this.n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        w9Var.setImageResource(R.drawable.emoji_tabs_new3);
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.y) {
            this.y = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        setLayout(z11);
        this.M = -1L;
        this.O = true;
        this.N = false;
        String string = LocaleController.getString(z10 ? R.string.BotForumNewTopic : R.string.AllTopicsSide);
        TextView textView = this.s;
        textView.setText(string);
        textView.setVisibility(z10 ? 8 : 0);
        w9 w9Var = this.n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            c31 c31Var = new c31(getContext());
            c31Var.b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.b));
            w9Var.setImageDrawable(c31Var);
        } else {
            w9Var.setImageResource(R.drawable.other_chats);
        }
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.y) {
            this.y = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        n6 n6Var = this.f;
        int i11 = 1;
        if (z12) {
            this.E = org.telegram.ui.ActionBar.j6.Z5;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                uq uqVar = new uq(R.drawable.mini_like_filled, 0);
                uqVar.setScale(0.8f, 0.8f);
                uqVar.spaceScaleX = 0.5f;
                uqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(uqVar, 0, spannableStringBuilder.length(), 33);
                this.G = spannableStringBuilder;
            }
            n6Var.q(this.G, z13, true);
        } else if (z11) {
            this.E = z10 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            if (this.F == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                uq uqVar2 = new uq(R.drawable.mini_mention_filled_16, 0);
                uqVar2.setScale(0.8f, 0.8f);
                uqVar2.spaceScaleX = 0.5f;
                uqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(uqVar2, 0, 1, 33);
                this.F = spannableStringBuilder2;
            }
            n6Var.q(this.F, z13, true);
        } else if (i10 > 0) {
            this.E = z10 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            n6Var.q(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.E = org.telegram.ui.ActionBar.j6.V8;
            n6Var.q("", z13, true);
        }
        if (z13 && (this.H < i10 || ((!this.I && z11) || (!this.J && z12)))) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new h31(this, i11));
            this.L.addListener(new zn0(this, 14));
            this.L.setInterpolator(new OvershootInterpolator(2.0f));
            this.L.setDuration(200L);
            this.L.start();
        }
        this.H = i10;
        this.I = z11;
        this.J = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.M = -1L;
        this.O = true;
        this.N = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int dp = AndroidUtilities.dp(38.0f);
        TextView textView = this.s;
        r90 r90Var = new r90(dp, textView);
        r90Var.e = 0.75f;
        spannableStringBuilder.setSpan(r90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        w9 w9Var = this.n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        if (this.P == null) {
            org.telegram.ui.ActionBar.f6 f6Var = this.b;
            q90 q90Var = new q90(f6Var);
            this.P = q90Var;
            q90Var.j(38.0f);
            this.P.setCallback(w9Var);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var);
            this.P.f(org.telegram.ui.ActionBar.j6.l1(0.15f, v02), org.telegram.ui.ActionBar.j6.l1(0.5f, v02), org.telegram.ui.ActionBar.j6.l1(0.6f, v02), org.telegram.ui.ActionBar.j6.l1(0.15f, v02));
            this.P.n = false;
        }
        w9Var.setImageDrawable(this.P);
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.y) {
            this.y = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(true);
        this.N = false;
        this.O = false;
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        boolean z11 = peerDialogId == this.M;
        this.M = peerDialogId;
        String name = DialogObject.getName(peerDialogId);
        TextView textView = this.s;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = this.a;
        w9 w9Var = this.n;
        g9 g9Var = this.r;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            g9Var.r(user);
            w9Var.e(user, g9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            g9Var.q(chat);
            w9Var.e(chat, g9Var);
        }
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z11);
        if (this.y) {
            this.y = false;
        }
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int d = i0.a.d(this.N ? 1.0f : this.Q, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        boolean z10 = this.O;
        w9 w9Var = this.n;
        if (z10) {
            w9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        } else {
            w9Var.setColorFilter(null);
        }
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        w9Var.invalidate();
    }

    public final void h() {
        float f7 = (1.0f - this.Q) * (-AndroidUtilities.dp(3.0f));
        ImageView imageView = this.v;
        imageView.setTranslationX(f7);
        imageView.setVisibility(this.Q <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        this.s.setTextColor(i0.a.d(this.N ? 1.0f : this.Q, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), TLObject.FLAG_30), i11);
    }

    public void setReorder(boolean z10) {
        this.w = z10;
        this.d.invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        if (this.R == z10) {
            return;
        }
        this.R = z10;
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q, z10 ? 1.0f : 0.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new h31(this, 0));
        this.S.addListener(new yo(18, this, z10));
        this.S.setInterpolator(wr.h);
        this.S.setDuration(320L);
        this.S.start();
    }
}
