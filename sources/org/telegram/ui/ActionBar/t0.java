package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.z9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class t0 extends FrameLayout implements ne.d {
    public final ne.b a;
    public cr b;
    public final z9 c;
    public final ImageView d;
    public final TextView e;
    public hg.p0 f;
    public final p h;
    public final c6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;

    public t0(Context context, c6 c6Var) {
        super(context);
        this.a = new ne.b(0, this, es.h, 380L, false);
        this.h = new p(this, 2);
        this.n = c6Var;
        z9 z9Var = new z9(context);
        this.c = z9Var;
        addView(z9Var, w7.z5.d(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.z5.a(24.0f, 8.0f, 0.0f, 0.0f, 0.0f, 24, 16));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.z5.a(-2.0f, 38.0f, 0.0f, 12.0f, 0.0f, -2, 16));
        this.w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        float f7 = this.a.e;
        boolean z10 = this.r;
        c6 c6Var = this.n;
        int m12 = z10 ? g6.m1(0.075f, g6.w0(g6.G6, c6Var)) : g6.w0(g6.ci, c6Var);
        int i10 = g6.Oh;
        int w02 = g6.w0(i10, c6Var);
        int w03 = g6.w0(g6.G6, c6Var);
        int i11 = g6.Sh;
        int w04 = g6.w0(i11, c6Var);
        this.v = i0.a.d(f7, m12, w02);
        this.e.setTextColor(i0.a.d(f7, w03, w04));
        ImageView imageView = this.d;
        imageView.setColorFilter(w04);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        cr crVar = this.b;
        if (crVar != null) {
            g6.w1(crVar, g6.w0(i10, c6Var), false);
            g6.w1(this.b, g6.w0(i11, c6Var), true);
        }
        this.c.setAlpha(1.0f - f7);
        hg.p0 p0Var = this.f;
        if (p0Var != null && p0Var.d == 7) {
            setData(p0Var);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, g6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public hg.p0 getFilter() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), TLObject.FLAG_31), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public void setData(hg.p0 p0Var) {
        this.f = p0Var;
        this.s = false;
        String str = p0Var.c;
        if (str == null) {
            str = LocaleController.getString(p0Var.b);
        }
        this.e.setText(str);
        cr M = g6.M(AndroidUtilities.dp(32.0f), p0Var.a);
        this.b = M;
        int i10 = g6.Oh;
        c6 c6Var = this.n;
        g6.w1(M, g6.w0(i10, c6Var), false);
        cr crVar = this.b;
        int i11 = g6.Sh;
        g6.w1(crVar, g6.w0(i11, c6Var), true);
        int i12 = p0Var.d;
        z9 z9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                z9Var.setImageDrawable(this.b);
                return;
            }
            cr M2 = g6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M2.e = dp;
            M2.f = dp2;
            g6.w1(M2, g6.w0(i10, c6Var), false);
            g6.w1(M2, g6.w0(i11, c6Var), true);
            z9Var.setImageDrawable(M2);
            return;
        }
        TLObject tLObject = p0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = z9Var.getImageReceiver();
                int dp3 = AndroidUtilities.dp(this.s ? 10.0f : 16.0f);
                this.w = dp3;
                imageReceiver.setRoundRadius(dp3);
                z9Var.getImageReceiver().setForUserOrChat(chat, this.b);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != user.id) {
            z9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
            z9Var.getImageReceiver().setForUserOrChat(user, this.b);
            return;
        }
        cr M3 = g6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        M3.e = dp4;
        M3.f = dp5;
        g6.w1(M3, g6.w0(i10, c6Var), false);
        g6.w1(M3, g6.w0(i11, c6Var), true);
        z9Var.setImageDrawable(M3);
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.e;
        if (z10) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            setSelectedForDelete(false);
        }
    }

    public void setSelectedForDelete(boolean z10) {
        ne.b bVar = this.a;
        if (bVar.f == z10) {
            return;
        }
        p pVar = this.h;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        bVar.a(z10, true);
        if (z10) {
            AndroidUtilities.runOnUIThread(pVar, 2000L);
        }
    }

    @Override // ne.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
