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
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class u0 extends FrameLayout implements me.d {
    public final me.b a;
    public fr b;
    public final y9 c;
    public final ImageView d;
    public final TextView e;
    public gg.p0 f;
    public final q h;
    public final e6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;

    public u0(Context context, e6 e6Var) {
        super(context);
        this.a = new me.b(0, this, hs.h, 380L, false);
        this.h = new q(this, 2);
        this.n = e6Var;
        y9 y9Var = new y9(context);
        this.c = y9Var;
        addView(y9Var, w7.x5.d(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.x5.a(24.0f, 8.0f, 0.0f, 0.0f, 0.0f, 24, 16));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.x5.a(-2.0f, 38.0f, 0.0f, 12.0f, 0.0f, -2, 16));
        this.w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        float f7 = this.a.e;
        boolean z10 = this.r;
        e6 e6Var = this.n;
        int m12 = z10 ? i6.m1(0.075f, i6.w0(i6.G6, e6Var)) : i6.w0(i6.ci, e6Var);
        int i10 = i6.Oh;
        int w02 = i6.w0(i10, e6Var);
        int w03 = i6.w0(i6.G6, e6Var);
        int i11 = i6.Sh;
        int w04 = i6.w0(i11, e6Var);
        this.v = i0.a.d(f7, m12, w02);
        this.e.setTextColor(i0.a.d(f7, w03, w04));
        ImageView imageView = this.d;
        imageView.setColorFilter(w04);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        fr frVar = this.b;
        if (frVar != null) {
            i6.w1(frVar, i6.w0(i10, e6Var), false);
            i6.w1(this.b, i6.w0(i11, e6Var), true);
        }
        this.c.setAlpha(1.0f - f7);
        gg.p0 p0Var = this.f;
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
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, i6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public gg.p0 getFilter() {
        return this.f;
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), TLObject.FLAG_31), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(gg.p0 p0Var) {
        this.f = p0Var;
        this.s = false;
        String str = p0Var.c;
        if (str == null) {
            str = LocaleController.getString(p0Var.b);
        }
        this.e.setText(str);
        fr M = i6.M(AndroidUtilities.dp(32.0f), p0Var.a);
        this.b = M;
        int i10 = i6.Oh;
        e6 e6Var = this.n;
        i6.w1(M, i6.w0(i10, e6Var), false);
        fr frVar = this.b;
        int i11 = i6.Sh;
        i6.w1(frVar, i6.w0(i11, e6Var), true);
        int i12 = p0Var.d;
        y9 y9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                y9Var.setImageDrawable(this.b);
                return;
            }
            fr M2 = i6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M2.e = dp;
            M2.f = dp2;
            i6.w1(M2, i6.w0(i10, e6Var), false);
            i6.w1(M2, i6.w0(i11, e6Var), true);
            y9Var.setImageDrawable(M2);
            return;
        }
        TLObject tLObject = p0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                int dp3 = AndroidUtilities.dp(this.s ? 10.0f : 16.0f);
                this.w = dp3;
                imageReceiver.setRoundRadius(dp3);
                y9Var.getImageReceiver().setForUserOrChat(chat, this.b);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != user.id) {
            y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
            y9Var.getImageReceiver().setForUserOrChat(user, this.b);
            return;
        }
        fr M3 = i6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        M3.e = dp4;
        M3.f = dp5;
        i6.w1(M3, i6.w0(i10, e6Var), false);
        i6.w1(M3, i6.w0(i11, e6Var), true);
        y9Var.setImageDrawable(M3);
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
        me.b bVar = this.a;
        if (bVar.f == z10) {
            return;
        }
        q qVar = this.h;
        AndroidUtilities.cancelRunOnUIThread(qVar);
        bVar.a(z10, true);
        if (z10) {
            AndroidUtilities.runOnUIThread(qVar, 2000L);
        }
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
