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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public class t0 extends FrameLayout implements ne.d {
    public final ne.b a;
    public zq b;
    public final w9 c;
    public final ImageView d;
    public final TextView e;
    public hg.o0 f;
    public final p h;
    public final d6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;

    public t0(Context context, d6 d6Var) {
        super(context);
        this.a = new ne.b(0, this, bs.h, 380L, false);
        this.h = new p(this, 2);
        this.n = d6Var;
        w9 w9Var = new w9(context);
        this.c = w9Var;
        addView(w9Var, w7.z5.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.z5.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.z5.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        float f7 = this.a.e;
        boolean z10 = this.r;
        d6 d6Var = this.n;
        int m12 = z10 ? h6.m1(0.075f, h6.w0(h6.G6, d6Var)) : h6.w0(h6.ci, d6Var);
        int i10 = h6.Oh;
        int w02 = h6.w0(i10, d6Var);
        int w03 = h6.w0(h6.G6, d6Var);
        int i11 = h6.Sh;
        int w04 = h6.w0(i11, d6Var);
        this.v = i0.a.f(f7, m12, w02);
        this.e.setTextColor(i0.a.f(f7, w03, w04));
        ImageView imageView = this.d;
        imageView.setColorFilter(w04);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        zq zqVar = this.b;
        if (zqVar != null) {
            h6.w1(zqVar, h6.w0(i10, d6Var), false);
            h6.w1(this.b, h6.w0(i11, d6Var), true);
        }
        this.c.setAlpha(1.0f - f7);
        hg.o0 o0Var = this.f;
        if (o0Var != null && o0Var.d == 7) {
            setData(o0Var);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, h6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public hg.o0 getFilter() {
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

    public void setData(hg.o0 o0Var) {
        this.f = o0Var;
        this.s = false;
        String str = o0Var.c;
        if (str == null) {
            str = LocaleController.getString(o0Var.b);
        }
        this.e.setText(str);
        zq M = h6.M(AndroidUtilities.dp(32.0f), o0Var.a);
        this.b = M;
        int i10 = h6.Oh;
        d6 d6Var = this.n;
        h6.w1(M, h6.w0(i10, d6Var), false);
        zq zqVar = this.b;
        int i11 = h6.Sh;
        h6.w1(zqVar, h6.w0(i11, d6Var), true);
        int i12 = o0Var.d;
        w9 w9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                w9Var.setImageDrawable(this.b);
                return;
            }
            zq M2 = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M2.e = dp;
            M2.f = dp2;
            h6.w1(M2, h6.w0(i10, d6Var), false);
            h6.w1(M2, h6.w0(i11, d6Var), true);
            w9Var.setImageDrawable(M2);
            return;
        }
        TLObject tLObject = o0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                int dp3 = AndroidUtilities.dp(this.s ? 10.0f : 16.0f);
                this.w = dp3;
                imageReceiver.setRoundRadius(dp3);
                w9Var.getImageReceiver().setForUserOrChat(chat, this.b);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != user.id) {
            w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
            w9Var.getImageReceiver().setForUserOrChat(user, this.b);
            return;
        }
        zq M3 = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        M3.e = dp4;
        M3.f = dp5;
        h6.w1(M3, h6.w0(i10, d6Var), false);
        h6.w1(M3, h6.w0(i11, d6Var), true);
        w9Var.setImageDrawable(M3);
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
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    @Override // ne.d
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
