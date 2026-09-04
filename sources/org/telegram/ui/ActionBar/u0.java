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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class u0 extends FrameLayout implements le.d {
    public final le.b a;
    public oq b;
    public final x9 c;
    public final ImageView d;
    public final TextView e;
    public hg.q0 f;
    public final q h;
    public final f6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;

    public u0(Context context, f6 f6Var) {
        super(context);
        this.a = new le.b(0, this, pr.h, 380L, false);
        this.h = new q(this, 2);
        this.n = f6Var;
        x9 x9Var = new x9(context);
        this.c = x9Var;
        addView(x9Var, w7.x5.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.x5.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.x5.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        float f7 = this.a.e;
        boolean z10 = this.r;
        f6 f6Var = this.n;
        int l1 = z10 ? j6.l1(0.075f, j6.v0(j6.G6, f6Var)) : j6.v0(j6.ci, f6Var);
        int i10 = j6.Oh;
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.G6, f6Var);
        int i11 = j6.Sh;
        int v04 = j6.v0(i11, f6Var);
        this.v = i0.a.d(f7, l1, v02);
        this.e.setTextColor(i0.a.d(f7, v03, v04));
        ImageView imageView = this.d;
        imageView.setColorFilter(v04);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        oq oqVar = this.b;
        if (oqVar != null) {
            j6.v1(oqVar, j6.v0(i10, f6Var), false);
            j6.v1(this.b, j6.v0(i11, f6Var), true);
        }
        this.c.setAlpha(1.0f - f7);
        hg.q0 q0Var = this.f;
        if (q0Var != null && q0Var.d == 7) {
            setData(q0Var);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, j6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public hg.q0 getFilter() {
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

    public void setData(hg.q0 q0Var) {
        this.f = q0Var;
        this.s = false;
        String str = q0Var.c;
        if (str == null) {
            str = LocaleController.getString(q0Var.b);
        }
        this.e.setText(str);
        oq L = j6.L(AndroidUtilities.dp(32.0f), q0Var.a);
        this.b = L;
        int i10 = j6.Oh;
        f6 f6Var = this.n;
        j6.v1(L, j6.v0(i10, f6Var), false);
        oq oqVar = this.b;
        int i11 = j6.Sh;
        j6.v1(oqVar, j6.v0(i11, f6Var), true);
        int i12 = q0Var.d;
        x9 x9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                x9Var.setImageDrawable(this.b);
                return;
            }
            oq L2 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L2.e = dp;
            L2.f = dp2;
            j6.v1(L2, j6.v0(i10, f6Var), false);
            j6.v1(L2, j6.v0(i11, f6Var), true);
            x9Var.setImageDrawable(L2);
            return;
        }
        TLObject tLObject = q0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = x9Var.getImageReceiver();
                int dp3 = AndroidUtilities.dp(this.s ? 10.0f : 16.0f);
                this.w = dp3;
                imageReceiver.setRoundRadius(dp3);
                x9Var.getImageReceiver().setForUserOrChat(chat, this.b);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != user.id) {
            x9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
            x9Var.getImageReceiver().setForUserOrChat(user, this.b);
            return;
        }
        oq L3 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        L3.e = dp4;
        L3.f = dp5;
        j6.v1(L3, j6.v0(i10, f6Var), false);
        j6.v1(L3, j6.v0(i11, f6Var), true);
        x9Var.setImageDrawable(L3);
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
        le.b bVar = this.a;
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

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
