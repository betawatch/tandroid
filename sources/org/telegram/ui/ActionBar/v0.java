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
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class v0 extends FrameLayout implements td.b {
    public final td.a a;
    public fq b;
    public final o9 c;
    public final ImageView d;
    public final TextView e;
    public of.m0 f;
    public final p h;
    public final b6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;

    public v0(Context context, b6 b6Var) {
        super(context);
        this.a = new td.a(0, this, gr.h, 380L, false);
        this.h = new p(this, 2);
        this.n = b6Var;
        o9 o9Var = new o9(context);
        this.c = o9Var;
        addView(o9Var, g7.e6.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, g7.e6.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, g7.e6.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        float f10 = this.a.e;
        boolean z10 = this.r;
        b6 b6Var = this.n;
        int l1 = z10 ? f6.l1(0.075f, f6.v0(f6.G6, b6Var)) : f6.v0(f6.ci, b6Var);
        int i9 = f6.Oh;
        int v02 = f6.v0(i9, b6Var);
        int v03 = f6.v0(f6.G6, b6Var);
        int i10 = f6.Sh;
        int v04 = f6.v0(i10, b6Var);
        this.v = i0.a.d(f10, l1, v02);
        this.e.setTextColor(i0.a.d(f10, v03, v04));
        ImageView imageView = this.d;
        imageView.setColorFilter(v04);
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        fq fqVar = this.b;
        if (fqVar != null) {
            f6.v1(fqVar, f6.v0(i9, b6Var), false);
            f6.v1(this.b, f6.v0(i10, b6Var), true);
        }
        this.c.setAlpha(1.0f - f10);
        of.m0 m0Var = this.f;
        if (m0Var != null && m0Var.d == 7) {
            setData(m0Var);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i9 = this.w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i9, i9, f6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public of.m0 getFilter() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), TLObject.FLAG_31), i10);
        } else {
            super.onMeasure(i9, i10);
        }
    }

    public void setData(of.m0 m0Var) {
        this.f = m0Var;
        this.s = false;
        String str = m0Var.c;
        if (str == null) {
            str = LocaleController.getString(m0Var.b);
        }
        this.e.setText(str);
        fq L = f6.L(AndroidUtilities.dp(32.0f), m0Var.a);
        this.b = L;
        int i9 = f6.Oh;
        b6 b6Var = this.n;
        f6.v1(L, f6.v0(i9, b6Var), false);
        fq fqVar = this.b;
        int i10 = f6.Sh;
        f6.v1(fqVar, f6.v0(i10, b6Var), true);
        int i11 = m0Var.d;
        o9 o9Var = this.c;
        if (i11 != 4) {
            if (i11 != 7) {
                o9Var.setImageDrawable(this.b);
                return;
            }
            fq L2 = f6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L2.e = dp;
            L2.f = dp2;
            f6.v1(L2, f6.v0(i9, b6Var), false);
            f6.v1(L2, f6.v0(i10, b6Var), true);
            o9Var.setImageDrawable(L2);
            return;
        }
        TLObject tLObject = m0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = o9Var.getImageReceiver();
                int dp3 = AndroidUtilities.dp(this.s ? 10.0f : 16.0f);
                this.w = dp3;
                imageReceiver.setRoundRadius(dp3);
                o9Var.getImageReceiver().setForUserOrChat(chat, this.b);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != user.id) {
            o9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
            o9Var.getImageReceiver().setForUserOrChat(user, this.b);
            return;
        }
        fq L3 = f6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        L3.e = dp4;
        L3.f = dp5;
        f6.v1(L3, f6.v0(i9, b6Var), false);
        f6.v1(L3, f6.v0(i10, b6Var), true);
        o9Var.setImageDrawable(L3);
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
        td.a aVar = this.a;
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

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
