package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class v0 extends FrameLayout implements oe.d, p6 {
    public int E;
    public ar F;
    public int G;
    public int H;
    public ColorFilter I;
    public int J;
    public final oe.b a;
    public ar b;
    public final y9 c;
    public final ImageView d;
    public final TextView e;
    public ig.p0 f;
    public final q h;
    public final u6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;
    public ar x;
    public int y;

    public v0(Context context, u6 u6Var) {
        super(context);
        this.a = new oe.b(0, this, ds.h, 380L, false);
        this.h = new q(this, 2);
        this.n = u6Var;
        y9 y9Var = new y9(context);
        this.c = y9Var;
        addView(y9Var, kb1.g(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, kb1.h(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, kb1.h(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.w = AndroidUtilities.dp(28.0f);
        updateColors();
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, y6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public ig.p0 getFilter() {
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

    public void setData(ig.p0 p0Var) {
        this.f = p0Var;
        this.s = false;
        String str = p0Var.c;
        if (str == null) {
            str = LocaleController.getString(p0Var.b);
        }
        this.e.setText(str);
        ar M = y6.M(AndroidUtilities.dp(32.0f), p0Var.a);
        this.b = M;
        int i10 = y6.Oh;
        u6 u6Var = this.n;
        y6.y1(M, y6.w0(i10, u6Var), false);
        ar arVar = this.b;
        int i11 = y6.Sh;
        y6.y1(arVar, y6.w0(i11, u6Var), true);
        int i12 = p0Var.d;
        y9 y9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                y9Var.setImageDrawable(this.b);
                return;
            }
            ar M2 = y6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M2.e = dp;
            M2.f = dp2;
            y6.y1(M2, y6.w0(i10, u6Var), false);
            y6.y1(M2, y6.w0(i11, u6Var), true);
            y9Var.setImageDrawable(M2);
            this.x = M2;
            this.y = y6.w0(i10, u6Var);
            this.E = y6.w0(i11, u6Var);
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
        ar M3 = y6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        M3.e = dp4;
        M3.f = dp5;
        y6.y1(M3, y6.w0(i10, u6Var), false);
        y6.y1(M3, y6.w0(i11, u6Var), true);
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
        oe.b bVar = this.a;
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        float f7 = this.a.e;
        boolean z10 = this.r;
        u6 u6Var = this.n;
        int o12 = z10 ? y6.o1(0.075f, y6.w0(y6.G6, u6Var)) : y6.w0(y6.ci, u6Var);
        int i10 = y6.Oh;
        int w02 = y6.w0(i10, u6Var);
        int w03 = y6.w0(y6.G6, u6Var);
        int i11 = y6.Sh;
        int w04 = y6.w0(i11, u6Var);
        this.v = i0.a.f(f7, o12, w02);
        this.e.setTextColor(i0.a.f(f7, w03, w04));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.I || this.J != w04) {
            imageView.setColorFilter(w04);
            this.I = imageView.getColorFilter();
            this.J = w04;
        }
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        int w05 = y6.w0(i10, u6Var);
        int w06 = y6.w0(i11, u6Var);
        ar arVar = this.b;
        if (arVar != null && (arVar != this.F || w05 != this.G || w06 != this.H)) {
            y6.y1(arVar, w05, false);
            y6.y1(this.b, w06, true);
            this.F = this.b;
            this.G = w05;
            this.H = w06;
        }
        float f11 = 1.0f - f7;
        y9 y9Var = this.c;
        y9Var.setAlpha(f11);
        ig.p0 p0Var = this.f;
        if (p0Var != null && p0Var.d == 7) {
            ar arVar2 = this.x;
            if (arVar2 == null) {
                setData(p0Var);
            } else if (w05 != this.y || w06 != this.E) {
                y6.y1(arVar2, w05, false);
                y6.y1(this.x, w06, true);
                this.y = w05;
                this.E = w06;
                y9Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
