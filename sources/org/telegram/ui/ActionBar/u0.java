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
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class u0 extends FrameLayout implements ud.b {
    public final ud.a a;
    public dq b;
    public final n9 c;
    public final ImageView d;
    public final TextView e;
    public pf.e0 f;
    public final p h;
    public final c6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;

    public u0(Context context, c6 c6Var) {
        super(context);
        this.a = new ud.a(0, this, er.h, 380L, false);
        this.h = new p(this, 2);
        this.n = c6Var;
        n9 n9Var = new n9(context);
        this.c = n9Var;
        addView(n9Var, h7.z5.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, h7.z5.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, h7.z5.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        float f10 = this.a.e;
        boolean z10 = this.r;
        c6 c6Var = this.n;
        int l1 = z10 ? g6.l1(0.075f, g6.v0(g6.G6, c6Var)) : g6.v0(g6.ci, c6Var);
        int i10 = g6.Oh;
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.G6, c6Var);
        int i11 = g6.Sh;
        int v04 = g6.v0(i11, c6Var);
        this.v = i0.b.d(f10, l1, v02);
        this.e.setTextColor(i0.b.d(f10, v03, v04));
        ImageView imageView = this.d;
        imageView.setColorFilter(v04);
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        dq dqVar = this.b;
        if (dqVar != null) {
            g6.v1(dqVar, g6.v0(i10, c6Var), false);
            g6.v1(this.b, g6.v0(i11, c6Var), true);
        }
        this.c.setAlpha(1.0f - f10);
        pf.e0 e0Var = this.f;
        if (e0Var != null && e0Var.d == 7) {
            setData(e0Var);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, g6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public pf.e0 getFilter() {
        return this.f;
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
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

    public void setData(pf.e0 e0Var) {
        this.f = e0Var;
        this.s = false;
        String str = e0Var.c;
        if (str == null) {
            str = LocaleController.getString(e0Var.b);
        }
        this.e.setText(str);
        dq L = g6.L(AndroidUtilities.dp(32.0f), e0Var.a);
        this.b = L;
        int i10 = g6.Oh;
        c6 c6Var = this.n;
        g6.v1(L, g6.v0(i10, c6Var), false);
        dq dqVar = this.b;
        int i11 = g6.Sh;
        g6.v1(dqVar, g6.v0(i11, c6Var), true);
        int i12 = e0Var.d;
        n9 n9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                n9Var.setImageDrawable(this.b);
                return;
            }
            dq L2 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L2.e = dp;
            L2.f = dp2;
            g6.v1(L2, g6.v0(i10, c6Var), false);
            g6.v1(L2, g6.v0(i11, c6Var), true);
            n9Var.setImageDrawable(L2);
            return;
        }
        TLObject tLObject = e0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = n9Var.getImageReceiver();
                int dp3 = AndroidUtilities.dp(this.s ? 10.0f : 16.0f);
                this.w = dp3;
                imageReceiver.setRoundRadius(dp3);
                n9Var.getImageReceiver().setForUserOrChat(chat, this.b);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != user.id) {
            n9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
            n9Var.getImageReceiver().setForUserOrChat(user, this.b);
            return;
        }
        dq L3 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        L3.e = dp4;
        L3.f = dp5;
        g6.v1(L3, g6.v0(i10, c6Var), false);
        g6.v1(L3, g6.v0(i11, c6Var), true);
        n9Var.setImageDrawable(L3);
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
        ud.a aVar = this.a;
        if (aVar.f == z10) {
            return;
        }
        p pVar = this.h;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        aVar.a(z10, true);
        if (z10) {
            AndroidUtilities.runOnUIThread(pVar, 2000L);
        }
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
