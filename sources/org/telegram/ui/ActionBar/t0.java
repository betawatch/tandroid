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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class t0 extends FrameLayout implements ne.d, b6 {
    public int E;
    public yq F;
    public int G;
    public int H;
    public ColorFilter I;
    public int J;
    public final ne.b a;
    public yq b;
    public final w9 c;
    public final ImageView d;
    public final TextView e;
    public hg.o0 f;
    public final p h;
    public final g6 n;
    public boolean r;
    public boolean s;
    public int v;
    public int w;
    public yq x;
    public int y;

    public t0(Context context, g6 g6Var) {
        super(context);
        this.a = new ne.b(0, this, bs.h, 380L, false);
        this.h = new p(this, 2);
        this.n = g6Var;
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
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, k6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public hg.o0 getFilter() {
        return this.f;
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            updateColors();
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

    public void setData(hg.o0 o0Var) {
        this.f = o0Var;
        this.s = false;
        String str = o0Var.c;
        if (str == null) {
            str = LocaleController.getString(o0Var.b);
        }
        this.e.setText(str);
        yq M = k6.M(AndroidUtilities.dp(32.0f), o0Var.a);
        this.b = M;
        int i10 = k6.Oh;
        g6 g6Var = this.n;
        k6.y1(M, k6.w0(i10, g6Var), false);
        yq yqVar = this.b;
        int i11 = k6.Sh;
        k6.y1(yqVar, k6.w0(i11, g6Var), true);
        int i12 = o0Var.d;
        w9 w9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                w9Var.setImageDrawable(this.b);
                return;
            }
            yq M2 = k6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M2.e = dp;
            M2.f = dp2;
            k6.y1(M2, k6.w0(i10, g6Var), false);
            k6.y1(M2, k6.w0(i11, g6Var), true);
            w9Var.setImageDrawable(M2);
            this.x = M2;
            this.y = k6.w0(i10, g6Var);
            this.E = k6.w0(i11, g6Var);
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
        yq M3 = k6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int dp4 = AndroidUtilities.dp(16.0f);
        int dp5 = AndroidUtilities.dp(16.0f);
        M3.e = dp4;
        M3.f = dp5;
        k6.y1(M3, k6.w0(i10, g6Var), false);
        k6.y1(M3, k6.w0(i11, g6Var), true);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        float f7 = this.a.e;
        boolean z10 = this.r;
        g6 g6Var = this.n;
        int o12 = z10 ? k6.o1(0.075f, k6.w0(k6.G6, g6Var)) : k6.w0(k6.ci, g6Var);
        int i10 = k6.Oh;
        int w02 = k6.w0(i10, g6Var);
        int w03 = k6.w0(k6.G6, g6Var);
        int i11 = k6.Sh;
        int w04 = k6.w0(i11, g6Var);
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
        int w05 = k6.w0(i10, g6Var);
        int w06 = k6.w0(i11, g6Var);
        yq yqVar = this.b;
        if (yqVar != null && (yqVar != this.F || w05 != this.G || w06 != this.H)) {
            k6.y1(yqVar, w05, false);
            k6.y1(this.b, w06, true);
            this.F = this.b;
            this.G = w05;
            this.H = w06;
        }
        float f11 = 1.0f - f7;
        w9 w9Var = this.c;
        w9Var.setAlpha(f11);
        hg.o0 o0Var = this.f;
        if (o0Var != null && o0Var.d == 7) {
            yq yqVar2 = this.x;
            if (yqVar2 == null) {
                setData(o0Var);
            } else if (w05 != this.y || w06 != this.E) {
                k6.y1(yqVar2, w05, false);
                k6.y1(this.x, w06, true);
                this.y = w05;
                this.E = w06;
                w9Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
