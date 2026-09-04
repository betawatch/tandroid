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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class v21 extends FrameLayout {
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
    public h90 P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public zo0 c;
    public final di.x5 d;
    public final FrameLayout.LayoutParams e;
    public final p6 f;
    public final bi.e7 h;
    public final x9 n;
    public final i9 r;
    public final TextView s;
    public final ImageView v;
    public boolean w;
    public boolean x;
    public boolean y;

    public v21(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
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
        di.x5 x5Var = new di.x5(this, context);
        this.d = x5Var;
        x5Var.setWillNotDraw(false);
        x5Var.setOrientation(1);
        addView(x5Var, w7.x5.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        w7.z5.a(x5Var);
        p6 p6Var = new p6(false, false, false, false);
        this.f = p6Var;
        p6Var.t(AndroidUtilities.dp(11.0f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, f6Var));
        p6Var.G = AndroidUtilities.displaySize.x;
        p6Var.b = 17;
        bi.e7 e7Var = new bi.e7(this, context, f6Var);
        this.h = e7Var;
        e7Var.setWillNotDraw(false);
        e7Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        x5Var.addView(e7Var, w7.x5.q(-1, -2, 17));
        x9 x9Var = new x9(context);
        this.n = x9Var;
        FrameLayout.LayoutParams e7 = w7.x5.e(34, 34, 17);
        this.e = e7;
        e7Var.addView(x9Var, e7);
        this.r = new i9((org.telegram.ui.ActionBar.f6) null);
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
        x5Var.addView(textView, w7.x5.t(-1, -2, 17, 4, 0, 4, 0));
        x5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        addView(imageView, w7.x5.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
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
        x9 x9Var = this.n;
        if (i10 == 1) {
            this.O = true;
            x9Var.b();
            x9Var.setAnimatedEmojiDrawable(null);
            x9Var.setImageResource(R.drawable.msg_filled_general);
            x9Var.setScaleX(0.66f);
            x9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            x9Var.b();
            x9Var.setAnimatedEmojiDrawable(q5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            x9Var.setScaleX(1.0f);
            x9Var.setScaleY(1.0f);
        } else {
            x9Var.setAnimatedEmojiDrawable(null);
            x9Var.setImageDrawable(og.d.e(tL_forumTopic));
            x9Var.setScaleX(1.0f);
            x9Var.setScaleY(1.0f);
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
        x9 x9Var = this.n;
        x9Var.b();
        x9Var.setAnimatedEmojiDrawable(null);
        x9Var.setImageResource(R.drawable.emoji_tabs_new3);
        x9Var.setScaleX(1.0f);
        x9Var.setScaleY(1.0f);
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
        x9 x9Var = this.n;
        x9Var.b();
        x9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            o21 o21Var = new o21(getContext());
            o21Var.b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.b));
            x9Var.setImageDrawable(o21Var);
        } else {
            x9Var.setImageResource(R.drawable.other_chats);
        }
        x9Var.setScaleX(1.0f);
        x9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.y) {
            this.y = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        p6 p6Var = this.f;
        int i11 = 1;
        if (z12) {
            this.E = org.telegram.ui.ActionBar.j6.Z5;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                nq nqVar = new nq(R.drawable.mini_like_filled, 0);
                nqVar.setScale(0.8f, 0.8f);
                nqVar.spaceScaleX = 0.5f;
                nqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 33);
                this.G = spannableStringBuilder;
            }
            p6Var.q(this.G, z13, true);
        } else if (z11) {
            this.E = z10 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            if (this.F == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                nq nqVar2 = new nq(R.drawable.mini_mention_filled_16, 0);
                nqVar2.setScale(0.8f, 0.8f);
                nqVar2.spaceScaleX = 0.5f;
                nqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(nqVar2, 0, 1, 33);
                this.F = spannableStringBuilder2;
            }
            p6Var.q(this.F, z13, true);
        } else if (i10 > 0) {
            this.E = z10 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            p6Var.q(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.E = org.telegram.ui.ActionBar.j6.V8;
            p6Var.q("", z13, true);
        }
        if (z13 && (this.H < i10 || ((!this.I && z11) || (!this.J && z12)))) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new t21(this, i11));
            this.L.addListener(new r80(this, 27));
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
        i90 i90Var = new i90(dp, textView);
        i90Var.e = 0.75f;
        spannableStringBuilder.setSpan(i90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        x9 x9Var = this.n;
        x9Var.b();
        x9Var.setAnimatedEmojiDrawable(null);
        if (this.P == null) {
            org.telegram.ui.ActionBar.f6 f6Var = this.b;
            h90 h90Var = new h90(f6Var);
            this.P = h90Var;
            h90Var.j(38.0f);
            this.P.setCallback(x9Var);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var);
            this.P.f(org.telegram.ui.ActionBar.j6.l1(0.15f, v02), org.telegram.ui.ActionBar.j6.l1(0.5f, v02), org.telegram.ui.ActionBar.j6.l1(0.6f, v02), org.telegram.ui.ActionBar.j6.l1(0.15f, v02));
            this.P.n = false;
        }
        x9Var.setImageDrawable(this.P);
        x9Var.setScaleX(1.0f);
        x9Var.setScaleY(1.0f);
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
        x9 x9Var = this.n;
        i9 i9Var = this.r;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            i9Var.r(user);
            x9Var.e(user, i9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            i9Var.q(chat);
            x9Var.e(chat, i9Var);
        }
        x9Var.setScaleX(1.0f);
        x9Var.setScaleY(1.0f);
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
        x9 x9Var = this.n;
        if (z10) {
            x9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        } else {
            x9Var.setColorFilter(null);
        }
        x9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        x9Var.invalidate();
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
        ofFloat.addUpdateListener(new t21(this, 0));
        this.S.addListener(new org.telegram.ui.to(23, this, z10));
        this.S.setInterpolator(pr.h);
        this.S.setDuration(320L);
        this.S.start();
    }
}
