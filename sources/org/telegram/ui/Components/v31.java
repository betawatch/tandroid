package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class v31 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public int F;
    public SpannableStringBuilder G;
    public SpannableStringBuilder H;
    public int I;
    public boolean J;
    public boolean K;
    public float L;
    public ValueAnimator M;
    public long N;
    public boolean O;
    public boolean P;
    public ca0 Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public ValueAnimator W;
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public zp0 c;
    public final ei.m5 d;
    public final FrameLayout.LayoutParams e;
    public final p6 f;
    public final ai.w1 h;
    public final w9 n;
    public n31 r;
    public final h9 s;
    public final TextView v;
    public final ImageView w;
    public boolean x;
    public boolean y;

    public v31(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.y = false;
        this.E = false;
        this.F = org.telegram.ui.ActionBar.k6.U8;
        this.L = 1.0f;
        this.N = 0L;
        this.O = false;
        this.P = false;
        this.a = i10;
        this.b = g6Var;
        ei.m5 m5Var = new ei.m5(this, context);
        this.d = m5Var;
        m5Var.setWillNotDraw(false);
        m5Var.setOrientation(1);
        addView(m5Var, w7.z5.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        w7.b6.a(m5Var);
        p6 p6Var = new p6(false, false, false);
        this.f = p6Var;
        p6Var.w(AndroidUtilities.dp(11.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, g6Var));
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.b = 17;
        ai.w1 w1Var = new ai.w1(this, context, g6Var);
        this.h = w1Var;
        w1Var.setWillNotDraw(false);
        w1Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        m5Var.addView(w1Var, w7.z5.q(-1, -2, 17));
        w9 w9Var = new w9(context);
        this.n = w9Var;
        FrameLayout.LayoutParams e = w7.z5.e(34, 34, 17);
        this.e = e;
        w1Var.addView(w9Var, e);
        this.s = new h9((org.telegram.ui.ActionBar.g6) null);
        TextView textView = new TextView(context);
        this.v = textView;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        textView.setTextColor(i0.a.f(this.U, w02, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        m5Var.addView(textView, w7.z5.t(-1, -2, 17, 4, 0, 4, 0));
        m5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        imageView.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(imageView, c02, O, null, g6Var);
        addView(imageView, w7.z5.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        this.n.setRoundRadius(AndroidUtilities.dp(z10 ? 36.0f : 3.0f));
        this.h.setPadding(0, AndroidUtilities.dp(z10 ? 7.0f : 4.0f), 0, 0);
        int dp = z10 ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = dp;
        layoutParams.height = z10 ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
    }

    public final void a(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(false);
        long j11 = this.N;
        long j12 = tL_forumTopic.id;
        boolean z11 = j11 == j12;
        this.P = false;
        this.N = j12;
        this.O = false;
        String str = tL_forumTopic.title;
        TextView textView = this.v;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.id;
        w9 w9Var = this.n;
        if (i10 == 1) {
            this.P = true;
            w9Var.b();
            w9Var.setAnimatedEmojiDrawable(null);
            w9Var.setImageResource(R.drawable.msg_filled_general);
            w9Var.setScaleX(0.66f);
            w9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            w9Var.b();
            w9Var.setAnimatedEmojiDrawable(r5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        } else {
            w9Var.setAnimatedEmojiDrawable(null);
            w9Var.setImageDrawable(og.d.e(tL_forumTopic));
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        d(tL_forumTopic.unread_count, MessagesController.getInstance(this.a).isDialogMuted(j10, tL_forumTopic.id), tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.E != z12) {
            this.E = z12;
        }
        h();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.P = true;
        this.O = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.v;
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
        if (this.E) {
            this.E = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        setLayout(z11);
        this.N = -1L;
        this.P = true;
        this.O = false;
        String string = LocaleController.getString(z10 ? R.string.BotForumNewTopic : R.string.AllTopicsSide);
        TextView textView = this.v;
        textView.setText(string);
        textView.setVisibility(z10 ? 8 : 0);
        w9 w9Var = this.n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            n31 n31Var = new n31(getContext());
            n31Var.b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.b));
            w9Var.setImageDrawable(n31Var);
            this.r = n31Var;
        } else {
            w9Var.setImageResource(R.drawable.other_chats);
            this.r = null;
        }
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        p6 p6Var = this.f;
        int i11 = 1;
        if (z12) {
            this.F = org.telegram.ui.ActionBar.k6.Z5;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                xq xqVar = new xq(R.drawable.mini_like_filled, 0);
                xqVar.setScale(0.8f, 0.8f);
                xqVar.spaceScaleX = 0.5f;
                xqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(xqVar, 0, spannableStringBuilder.length(), 33);
                this.H = spannableStringBuilder;
            }
            p6Var.t(this.H, z13, true);
        } else if (z11) {
            this.F = z10 ? org.telegram.ui.ActionBar.k6.V8 : org.telegram.ui.ActionBar.k6.U8;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                xq xqVar2 = new xq(R.drawable.mini_mention_filled_16, 0);
                xqVar2.setScale(0.8f, 0.8f);
                xqVar2.spaceScaleX = 0.5f;
                xqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(xqVar2, 0, 1, 33);
                this.G = spannableStringBuilder2;
            }
            p6Var.t(this.G, z13, true);
        } else if (i10 > 0) {
            this.F = z10 ? org.telegram.ui.ActionBar.k6.V8 : org.telegram.ui.ActionBar.k6.U8;
            p6Var.t(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.F = org.telegram.ui.ActionBar.k6.V8;
            p6Var.t("", z13, true);
        }
        if (z13 && (this.I < i10 || ((!this.J && z11) || (!this.K && z12)))) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new t31(this, i11));
            this.M.addListener(new p31(this, i11));
            org.telegram.messenger.sl.l(2.0f, this.M);
            this.M.setDuration(200L);
            this.M.start();
        }
        this.I = i10;
        this.J = z11;
        this.K = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.N = -1L;
        this.P = true;
        this.O = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int dp = AndroidUtilities.dp(38.0f);
        TextView textView = this.v;
        da0 da0Var = new da0(dp, textView);
        da0Var.e = 0.75f;
        spannableStringBuilder.setSpan(da0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        w9 w9Var = this.n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        if (this.Q == null) {
            org.telegram.ui.ActionBar.g6 g6Var = this.b;
            ca0 ca0Var = new ca0(g6Var);
            this.Q = ca0Var;
            ca0Var.k(38.0f);
            this.Q.setCallback(w9Var);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, g6Var);
            this.Q.g(org.telegram.ui.ActionBar.k6.o1(0.15f, w02), org.telegram.ui.ActionBar.k6.o1(0.5f, w02), org.telegram.ui.ActionBar.k6.o1(0.6f, w02), org.telegram.ui.ActionBar.k6.o1(0.15f, w02));
            this.Q.n = false;
        }
        w9Var.setImageDrawable(this.Q);
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(true);
        this.O = false;
        this.P = false;
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        boolean z11 = peerDialogId == this.N;
        this.N = peerDialogId;
        String name = DialogObject.getName(peerDialogId);
        TextView textView = this.v;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = this.a;
        w9 w9Var = this.n;
        h9 h9Var = this.s;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            h9Var.r(user);
            w9Var.e(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z11);
        if (this.E) {
            this.E = false;
        }
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        int f7 = i0.a.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        this.R = true;
        this.T = f7;
        boolean z10 = this.P;
        this.S = z10;
        w9 w9Var = this.n;
        if (z10) {
            w9Var.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        } else {
            w9Var.setColorFilter(null);
        }
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        w9Var.invalidate();
    }

    public final void h() {
        float f7 = (1.0f - this.U) * (-AndroidUtilities.dp(3.0f));
        ImageView imageView = this.w;
        imageView.setTranslationX(f7);
        imageView.setVisibility(this.U <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        this.v.setTextColor(i0.a.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), TLObject.FLAG_30), i11);
    }

    public void setReorder(boolean z10) {
        this.x = z10;
        this.d.invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z10 ? 1.0f : 0.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new t31(this, 0));
        this.W.addListener(new org.telegram.ui.ho(23, this, z10));
        this.W.setInterpolator(bs.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            TextView textView = this.v;
            float f7 = 1.0f;
            org.telegram.ui.ActionBar.g6 g6Var = this.b;
            if (textView != null) {
                textView.setTextColor(i0.a.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
            }
            w9 w9Var = this.n;
            if (w9Var != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, g6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
                if (!this.O) {
                    f7 = this.U;
                }
                int f10 = i0.a.f(f7, w02, w03);
                if (!this.R || f10 != this.T || this.P != this.S) {
                    g();
                }
            }
            n31 n31Var = this.r;
            if (n31Var != null) {
                n31Var.b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
                if (w9Var != null) {
                    w9Var.invalidate();
                }
            }
            if (this.Q != null) {
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, g6Var);
                this.Q.g(org.telegram.ui.ActionBar.k6.o1(0.15f, w04), org.telegram.ui.ActionBar.k6.o1(0.5f, w04), org.telegram.ui.ActionBar.k6.o1(0.6f, w04), org.telegram.ui.ActionBar.k6.o1(0.15f, w04));
                this.Q.n = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
