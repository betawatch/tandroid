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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d41 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
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
    public da0 Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public ValueAnimator W;
    public final int a;
    public final org.telegram.ui.ActionBar.u6 b;
    public eq0 c;
    public final fi.l5 d;
    public final FrameLayout.LayoutParams e;
    public final r6 f;
    public final bi.t1 h;
    public final y9 n;
    public w31 r;
    public final j9 s;
    public final TextView v;
    public final ImageView w;
    public boolean x;
    public boolean y;

    public d41(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.y = false;
        this.E = false;
        this.F = org.telegram.ui.ActionBar.y6.U8;
        this.L = 1.0f;
        this.N = 0L;
        this.O = false;
        this.P = false;
        this.a = i10;
        this.b = u6Var;
        fi.l5 l5Var = new fi.l5(this, context);
        this.d = l5Var;
        l5Var.setWillNotDraw(false);
        l5Var.setOrientation(1);
        addView(l5Var, gb1.h(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        gb1.b(l5Var);
        r6 r6Var = new r6(false, false, false);
        this.f = r6Var;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W8, u6Var));
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.b = 17;
        bi.t1 t1Var = new bi.t1(this, context, u6Var);
        this.h = t1Var;
        t1Var.setWillNotDraw(false);
        t1Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        l5Var.addView(t1Var, gb1.u(-1, -2, 17));
        y9 y9Var = new y9(context);
        this.n = y9Var;
        FrameLayout.LayoutParams i11 = gb1.i(34, 34, 17);
        this.e = i11;
        t1Var.addView(y9Var, i11);
        this.s = new j9((org.telegram.ui.ActionBar.u6) null);
        TextView textView = new TextView(context);
        this.v = textView;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z6, u6Var);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        textView.setTextColor(i0.a.f(this.U, w02, org.telegram.ui.ActionBar.y6.w0(i12, u6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        l5Var.addView(textView, gb1.x(-1, -2, 17, 4, 0, 4, 0));
        l5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        imageView.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(imageView, c02, N, null, u6Var);
        addView(imageView, gb1.h(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
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
        y9 y9Var = this.n;
        if (i10 == 1) {
            this.P = true;
            y9Var.b();
            y9Var.setAnimatedEmojiDrawable(null);
            y9Var.setImageResource(R.drawable.msg_filled_general);
            y9Var.setScaleX(0.66f);
            y9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            y9Var.b();
            y9Var.setAnimatedEmojiDrawable(t5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        } else {
            y9Var.setAnimatedEmojiDrawable(null);
            y9Var.setImageDrawable(pg.d.e(tL_forumTopic));
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.P = true;
        this.O = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.v;
        textView.setText(string);
        textView.setVisibility(0);
        y9 y9Var = this.n;
        y9Var.b();
        y9Var.setAnimatedEmojiDrawable(null);
        y9Var.setImageResource(R.drawable.emoji_tabs_new3);
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
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
        y9 y9Var = this.n;
        y9Var.b();
        y9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            w31 w31Var = new w31(getContext());
            w31Var.b.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.b));
            y9Var.setImageDrawable(w31Var);
            this.r = w31Var;
        } else {
            y9Var.setImageResource(R.drawable.other_chats);
            this.r = null;
        }
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        r6 r6Var = this.f;
        int i11 = 1;
        if (z12) {
            this.F = org.telegram.ui.ActionBar.y6.Z5;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                zq zqVar = new zq(R.drawable.mini_like_filled, 0);
                zqVar.setScale(0.8f, 0.8f);
                zqVar.spaceScaleX = 0.5f;
                zqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(zqVar, 0, spannableStringBuilder.length(), 33);
                this.H = spannableStringBuilder;
            }
            r6Var.t(this.H, z13, true);
        } else if (z11) {
            this.F = z10 ? org.telegram.ui.ActionBar.y6.V8 : org.telegram.ui.ActionBar.y6.U8;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                zq zqVar2 = new zq(R.drawable.mini_mention_filled_16, 0);
                zqVar2.setScale(0.8f, 0.8f);
                zqVar2.spaceScaleX = 0.5f;
                zqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(zqVar2, 0, 1, 33);
                this.G = spannableStringBuilder2;
            }
            r6Var.t(this.G, z13, true);
        } else if (i10 > 0) {
            this.F = z10 ? org.telegram.ui.ActionBar.y6.V8 : org.telegram.ui.ActionBar.y6.U8;
            r6Var.t(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.F = org.telegram.ui.ActionBar.y6.V8;
            r6Var.t("", z13, true);
        }
        if (z13 && (this.I < i10 || ((!this.J && z11) || (!this.K && z12)))) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new b41(this, i11));
            this.M.addListener(new h31(this, 2));
            org.telegram.ui.d3.m(2.0f, this.M);
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
        ea0 ea0Var = new ea0(dp, textView);
        ea0Var.e = 0.75f;
        spannableStringBuilder.setSpan(ea0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        y9 y9Var = this.n;
        y9Var.b();
        y9Var.setAnimatedEmojiDrawable(null);
        if (this.Q == null) {
            org.telegram.ui.ActionBar.u6 u6Var = this.b;
            da0 da0Var = new da0(u6Var);
            this.Q = da0Var;
            da0Var.k(38.0f);
            this.Q.setCallback(y9Var);
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z6, u6Var);
            this.Q.g(org.telegram.ui.ActionBar.y6.o1(0.15f, w02), org.telegram.ui.ActionBar.y6.o1(0.5f, w02), org.telegram.ui.ActionBar.y6.o1(0.6f, w02), org.telegram.ui.ActionBar.y6.o1(0.15f, w02));
            this.Q.n = false;
        }
        y9Var.setImageDrawable(this.Q);
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
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
        y9 y9Var = this.n;
        j9 j9Var = this.s;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            j9Var.r(user);
            y9Var.f(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
        }
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z11);
        if (this.E) {
            this.E = false;
        }
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.y6.z6;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        int f7 = i0.a.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
        this.R = true;
        this.T = f7;
        boolean z10 = this.P;
        this.S = z10;
        y9 y9Var = this.n;
        if (z10) {
            y9Var.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        } else {
            y9Var.setColorFilter(null);
        }
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        y9Var.invalidate();
    }

    public final void h() {
        float f7 = (1.0f - this.U) * (-AndroidUtilities.dp(3.0f));
        ImageView imageView = this.w;
        imageView.setTranslationX(f7);
        imageView.setVisibility(this.U <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.y6.z6;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        this.v.setTextColor(i0.a.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var)));
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
        ofFloat.addUpdateListener(new b41(this, 0));
        this.W.addListener(new org.telegram.ui.jo(23, this, z10));
        this.W.setInterpolator(ds.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            TextView textView = this.v;
            float f7 = 1.0f;
            org.telegram.ui.ActionBar.u6 u6Var = this.b;
            if (textView != null) {
                textView.setTextColor(i0.a.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z6, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var)));
            }
            y9 y9Var = this.n;
            if (y9Var != null) {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z6, u6Var);
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
                if (!this.O) {
                    f7 = this.U;
                }
                int f10 = i0.a.f(f7, w02, w03);
                if (!this.R || f10 != this.T || this.P != this.S) {
                    g();
                }
            }
            w31 w31Var = this.r;
            if (w31Var != null) {
                w31Var.b.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
                if (y9Var != null) {
                    y9Var.invalidate();
                }
            }
            if (this.Q != null) {
                int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z6, u6Var);
                this.Q.g(org.telegram.ui.ActionBar.y6.o1(0.15f, w04), org.telegram.ui.ActionBar.y6.o1(0.5f, w04), org.telegram.ui.ActionBar.y6.o1(0.6f, w04), org.telegram.ui.ActionBar.y6.o1(0.15f, w04));
                this.Q.n = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
