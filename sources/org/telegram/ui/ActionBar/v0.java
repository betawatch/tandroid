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
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class v0 extends FrameLayout implements vd.b {
    public final vd.a a;
    public jq b;
    public final t9 c;
    public final ImageView d;
    public final TextView e;
    public rf.f0 f;
    public final q h;
    public final c6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;

    public v0(Context context, c6 c6Var) {
        super(context);
        this.a = new vd.a(0, this, jr.h, 380L, false);
        this.h = new q(this, 2);
        this.n = c6Var;
        t9 t9Var = new t9(context);
        this.c = t9Var;
        addView(t9Var, i7.f6.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, i7.f6.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, i7.f6.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        float f9 = this.a.e;
        boolean z10 = this.r;
        c6 c6Var = this.n;
        int l1 = z10 ? g6.l1(0.075f, g6.v0(g6.G6, c6Var)) : g6.v0(g6.ci, c6Var);
        int i10 = g6.Oh;
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.G6, c6Var);
        int i11 = g6.Sh;
        int v04 = g6.v0(i11, c6Var);
        this.v = i0.a.d(f9, l1, v02);
        this.e.setTextColor(i0.a.d(f9, v03, v04));
        ImageView imageView = this.d;
        imageView.setColorFilter(v04);
        imageView.setAlpha(f9);
        float f10 = 0.82f * f9;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        jq jqVar = this.b;
        if (jqVar != null) {
            g6.v1(jqVar, g6.v0(i10, c6Var), false);
            g6.v1(this.b, g6.v0(i11, c6Var), true);
        }
        this.c.setAlpha(1.0f - f9);
        rf.f0 f0Var = this.f;
        if (f0Var != null && f0Var.d == 7) {
            setData(f0Var);
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

    public rf.f0 getFilter() {
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

    public void setData(rf.f0 f0Var) {
        this.f = f0Var;
        this.s = false;
        String str = f0Var.c;
        if (str == null) {
            str = LocaleController.getString(f0Var.b);
        }
        this.e.setText(str);
        jq L = g6.L(AndroidUtilities.dp(32.0f), f0Var.a);
        this.b = L;
        int i10 = g6.Oh;
        c6 c6Var = this.n;
        g6.v1(L, g6.v0(i10, c6Var), false);
        jq jqVar = this.b;
        int i11 = g6.Sh;
        g6.v1(jqVar, g6.v0(i11, c6Var), true);
        int i12 = f0Var.d;
        t9 t9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                t9Var.setImageDrawable(this.b);
                return;
            }
            jq L2 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L2.e = dp;
            L2.f = dp2;
            g6.v1(L2, g6.v0(i10, c6Var), false);
            g6.v1(L2, g6.v0(i11, c6Var), true);
            t9Var.setImageDrawable(L2);
            return;
        }
        TLObject tLObject = f0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = t9Var.getImageReceiver();
                int dp3 = AndroidUtilities.dp(this.s ? 10.0f : 16.0f);
                this.w = dp3;
                imageReceiver.setRoundRadius(dp3);
                t9Var.getImageReceiver().setForUserOrChat(chat, this.b);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != user.id) {
            t9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
            t9Var.getImageReceiver().setForUserOrChat(user, this.b);
            return;
        }
        jq L3 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        L3.e = dp4;
        L3.f = dp5;
        g6.v1(L3, g6.v0(i10, c6Var), false);
        g6.v1(L3, g6.v0(i11, c6Var), true);
        t9Var.setImageDrawable(L3);
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
        vd.a aVar = this.a;
        if (aVar.f == z10) {
            return;
        }
        q qVar = this.h;
        AndroidUtilities.cancelRunOnUIThread(qVar);
        aVar.a(z10, true);
        if (z10) {
            AndroidUtilities.runOnUIThread(qVar, 2000L);
        }
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
