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
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class v0 extends FrameLayout implements xd.b {
    public final xd.a a;
    public pq b;
    public final p9 c;
    public final ImageView d;
    public final TextView e;
    public uf.e0 f;
    public final p h;
    public final g6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;

    public v0(Context context, g6 g6Var) {
        super(context);
        this.a = new xd.a(0, this, pr.h, 380L, false);
        this.h = new p(this, 2);
        this.n = g6Var;
        p9 p9Var = new p9(context);
        this.c = p9Var;
        addView(p9Var, k7.c6.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, k7.c6.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, k7.c6.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        float f10 = this.a.e;
        boolean z4 = this.r;
        g6 g6Var = this.n;
        int l1 = z4 ? k6.l1(0.075f, k6.v0(k6.G6, g6Var)) : k6.v0(k6.ci, g6Var);
        int i10 = k6.Oh;
        int v02 = k6.v0(i10, g6Var);
        int v03 = k6.v0(k6.G6, g6Var);
        int i11 = k6.Sh;
        int v04 = k6.v0(i11, g6Var);
        this.v = i0.a.d(f10, l1, v02);
        this.e.setTextColor(i0.a.d(f10, v03, v04));
        ImageView imageView = this.d;
        imageView.setColorFilter(v04);
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        pq pqVar = this.b;
        if (pqVar != null) {
            k6.v1(pqVar, k6.v0(i10, g6Var), false);
            k6.v1(this.b, k6.v0(i11, g6Var), true);
        }
        this.c.setAlpha(1.0f - f10);
        uf.e0 e0Var = this.f;
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
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, k6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public uf.e0 getFilter() {
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

    public void setData(uf.e0 e0Var) {
        this.f = e0Var;
        this.s = false;
        String str = e0Var.c;
        if (str == null) {
            str = LocaleController.getString(e0Var.b);
        }
        this.e.setText(str);
        pq L = k6.L(AndroidUtilities.dp(32.0f), e0Var.a);
        this.b = L;
        int i10 = k6.Oh;
        g6 g6Var = this.n;
        k6.v1(L, k6.v0(i10, g6Var), false);
        pq pqVar = this.b;
        int i11 = k6.Sh;
        k6.v1(pqVar, k6.v0(i11, g6Var), true);
        int i12 = e0Var.d;
        p9 p9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                p9Var.setImageDrawable(this.b);
                return;
            }
            pq L2 = k6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L2.e = dp;
            L2.f = dp2;
            k6.v1(L2, k6.v0(i10, g6Var), false);
            k6.v1(L2, k6.v0(i11, g6Var), true);
            p9Var.setImageDrawable(L2);
            return;
        }
        TLObject tLObject = e0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                int dp3 = AndroidUtilities.dp(this.s ? 10.0f : 16.0f);
                this.w = dp3;
                imageReceiver.setRoundRadius(dp3);
                p9Var.getImageReceiver().setForUserOrChat(chat, this.b);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != user.id) {
            p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
            p9Var.getImageReceiver().setForUserOrChat(user, this.b);
            return;
        }
        pq L3 = k6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        L3.e = dp4;
        L3.f = dp5;
        k6.v1(L3, k6.v0(i10, g6Var), false);
        k6.v1(L3, k6.v0(i11, g6Var), true);
        p9Var.setImageDrawable(L3);
    }

    public void setExpanded(boolean z4) {
        TextView textView = this.e;
        if (z4) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            setSelectedForDelete(false);
        }
    }

    public void setSelectedForDelete(boolean z4) {
        xd.a aVar = this.a;
        if (aVar.f == z4) {
            return;
        }
        p pVar = this.h;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        aVar.a(z4, true);
        if (z4) {
            AndroidUtilities.runOnUIThread(pVar, 2000L);
        }
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
