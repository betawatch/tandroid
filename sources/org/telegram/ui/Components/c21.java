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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c21 extends FrameLayout {
    public int A;
    public SpannableStringBuilder B;
    public SpannableStringBuilder C;
    public int D;
    public boolean E;
    public boolean F;
    public float G;
    public ValueAnimator H;
    public long I;
    public boolean J;
    public boolean K;
    public t80 L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public io0 c;
    public final lh.m5 d;
    public final FrameLayout.LayoutParams e;
    public final i6 f;
    public final hh.h1 h;
    public final n9 n;
    public final y8 r;
    public final TextView s;
    public final ImageView v;
    public boolean w;
    public boolean x;
    public boolean y;

    public c21(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.x = false;
        this.y = false;
        this.A = org.telegram.ui.ActionBar.g6.U8;
        this.G = 1.0f;
        this.I = 0L;
        this.J = false;
        this.K = false;
        this.a = i10;
        this.b = c6Var;
        lh.m5 m5Var = new lh.m5(this, context);
        this.d = m5Var;
        m5Var.setWillNotDraw(false);
        m5Var.setOrientation(1);
        addView(m5Var, h7.z5.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        h7.b6.a(m5Var);
        i6 i6Var = new i6(false, false, false, false);
        this.f = i6Var;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.r(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W8, c6Var));
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.b = 17;
        hh.h1 h1Var = new hh.h1(this, context, c6Var);
        this.h = h1Var;
        h1Var.setWillNotDraw(false);
        h1Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        m5Var.addView(h1Var, h7.z5.q(-1, -2, 17));
        n9 n9Var = new n9(context);
        this.n = n9Var;
        FrameLayout.LayoutParams e9 = h7.z5.e(34, 34, 17);
        this.e = e9;
        h1Var.addView(n9Var, e9);
        this.r = new y8((org.telegram.ui.ActionBar.c6) null);
        TextView textView = new TextView(context);
        this.s = textView;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        textView.setTextColor(i0.b.d(this.M, v02, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        m5Var.addView(textView, h7.z5.t(-1, -2, 17, 4, 0, 4, 0));
        m5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        addView(imageView, h7.z5.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
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

    public final void a(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        setLayout(false);
        long j11 = this.I;
        long j12 = tL_forumTopic.id;
        boolean z14 = j11 == j12;
        this.K = false;
        this.I = j12;
        this.J = false;
        String str = tL_forumTopic.title;
        TextView textView = this.s;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.id;
        n9 n9Var = this.n;
        if (i10 == 1) {
            this.K = true;
            n9Var.b();
            n9Var.setAnimatedEmojiDrawable(null);
            n9Var.setImageResource(R.drawable.msg_filled_general);
            n9Var.setScaleX(0.66f);
            n9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            n9Var.b();
            n9Var.setAnimatedEmojiDrawable(k5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            n9Var.setScaleX(1.0f);
            n9Var.setScaleY(1.0f);
        } else {
            n9Var.setAnimatedEmojiDrawable(null);
            n9Var.setImageDrawable(wf.c.e(tL_forumTopic));
            n9Var.setScaleX(1.0f);
            n9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.a).isDialogMuted(j10, tL_forumTopic.id);
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
        this.K = true;
        this.J = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.s;
        textView.setText(string);
        textView.setVisibility(0);
        n9 n9Var = this.n;
        n9Var.b();
        n9Var.setAnimatedEmojiDrawable(null);
        n9Var.setImageResource(R.drawable.emoji_tabs_new3);
        n9Var.setScaleX(1.0f);
        n9Var.setScaleY(1.0f);
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
        this.I = -1L;
        this.K = true;
        this.J = false;
        String string = LocaleController.getString(z10 ? R.string.BotForumNewTopic : R.string.AllTopicsSide);
        TextView textView = this.s;
        textView.setText(string);
        textView.setVisibility(z10 ? 8 : 0);
        n9 n9Var = this.n;
        n9Var.b();
        n9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            v11 v11Var = new v11(getContext());
            v11Var.b.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.b));
            n9Var.setImageDrawable(v11Var);
        } else {
            n9Var.setImageResource(R.drawable.other_chats);
        }
        n9Var.setScaleX(1.0f);
        n9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.y) {
            this.y = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        i6 i6Var = this.f;
        int i11 = 1;
        if (z12) {
            this.A = org.telegram.ui.ActionBar.g6.Z5;
            if (this.C == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                cq cqVar = new cq(R.drawable.mini_like_filled, 0);
                cqVar.setScale(0.8f, 0.8f);
                cqVar.spaceScaleX = 0.5f;
                cqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(cqVar, 0, spannableStringBuilder.length(), 33);
                this.C = spannableStringBuilder;
            }
            i6Var.q(this.C, z13, true);
        } else if (z11) {
            this.A = z10 ? org.telegram.ui.ActionBar.g6.V8 : org.telegram.ui.ActionBar.g6.U8;
            if (this.B == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                cq cqVar2 = new cq(R.drawable.mini_mention_filled_16, 0);
                cqVar2.setScale(0.8f, 0.8f);
                cqVar2.spaceScaleX = 0.5f;
                cqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(cqVar2, 0, 1, 33);
                this.B = spannableStringBuilder2;
            }
            i6Var.q(this.B, z13, true);
        } else if (i10 > 0) {
            this.A = z10 ? org.telegram.ui.ActionBar.g6.V8 : org.telegram.ui.ActionBar.g6.U8;
            i6Var.q(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.A = org.telegram.ui.ActionBar.g6.V8;
            i6Var.q("", z13, true);
        }
        if (z13 && (this.D < i10 || ((!this.E && z11) || (!this.F && z12)))) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new a21(this, i11));
            this.H.addListener(new f11(this, 2));
            this.H.setInterpolator(new OvershootInterpolator(2.0f));
            this.H.setDuration(200L);
            this.H.start();
        }
        this.D = i10;
        this.E = z11;
        this.F = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.I = -1L;
        this.K = true;
        this.J = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int dp = AndroidUtilities.dp(38.0f);
        TextView textView = this.s;
        u80 u80Var = new u80(dp, textView);
        u80Var.e = 0.75f;
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        n9 n9Var = this.n;
        n9Var.b();
        n9Var.setAnimatedEmojiDrawable(null);
        if (this.L == null) {
            org.telegram.ui.ActionBar.c6 c6Var = this.b;
            t80 t80Var = new t80(c6Var);
            this.L = t80Var;
            t80Var.j(38.0f);
            this.L.setCallback(n9Var);
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var);
            this.L.f(org.telegram.ui.ActionBar.g6.l1(0.15f, v02), org.telegram.ui.ActionBar.g6.l1(0.5f, v02), org.telegram.ui.ActionBar.g6.l1(0.6f, v02), org.telegram.ui.ActionBar.g6.l1(0.15f, v02));
            this.L.n = false;
        }
        n9Var.setImageDrawable(this.L);
        n9Var.setScaleX(1.0f);
        n9Var.setScaleY(1.0f);
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
        this.J = false;
        this.K = false;
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        boolean z11 = peerDialogId == this.I;
        this.I = peerDialogId;
        String name = DialogObject.getName(peerDialogId);
        TextView textView = this.s;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = this.a;
        n9 n9Var = this.n;
        y8 y8Var = this.r;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            y8Var.r(user);
            n9Var.e(user, y8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            y8Var.q(chat);
            n9Var.e(chat, y8Var);
        }
        n9Var.setScaleX(1.0f);
        n9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z11);
        if (this.y) {
            this.y = false;
        }
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.g6.z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        int d = i0.b.d(this.J ? 1.0f : this.M, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        boolean z10 = this.K;
        n9 n9Var = this.n;
        if (z10) {
            n9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        } else {
            n9Var.setColorFilter(null);
        }
        n9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        n9Var.invalidate();
    }

    public final void h() {
        float f10 = (1.0f - this.M) * (-AndroidUtilities.dp(3.0f));
        ImageView imageView = this.v;
        imageView.setTranslationX(f10);
        imageView.setVisibility(this.M <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.g6.z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        this.s.setTextColor(i0.b.d(this.J ? 1.0f : this.M, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
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
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, z10 ? 1.0f : 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new a21(this, 0));
        this.O.addListener(new org.telegram.ui.go(23, this, z10));
        this.O.setInterpolator(er.h);
        this.O.setDuration(320L);
        this.O.start();
    }
}
