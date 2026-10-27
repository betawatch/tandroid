package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public ArrayList E;
    public final /* synthetic */ oh0 F;
    public final y9 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final TextView c;
    public final TextView d;
    public final j9 e;
    public final rx0 f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public final int s;
    public boolean v;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(oh0 oh0Var, Context context) {
        super(context);
        this.F = oh0Var;
        this.s = UserConfig.selectedAccount;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new j9((org.telegram.ui.ActionBar.u6) null);
        y9 y9Var = new y9(context);
        this.a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(y9Var, kb1.x(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.b = b6Var;
        int i10 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i10, null);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(16);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(b6Var, kb1.t(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, kb1.t(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, kb1.t(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new rx0(20, b6Var);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z9));
    }

    public float getPlaceholderAlpha() {
        return this.y;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f.a.b();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int dp;
        int dp2;
        int dp3;
        int dp4;
        if (this.x || this.y != 0.0f) {
            oh0 oh0Var = this.F;
            oh0Var.G.setAlpha((int) (this.y * 255.0f));
            y9 y9Var = this.a;
            canvas.drawCircle((y9Var.getMeasuredWidth() / 2) + y9Var.getLeft(), (y9Var.getMeasuredHeight() / 2) + y9Var.getTop(), y9Var.getMeasuredWidth() / 2, oh0Var.G);
            if (this.w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            oh0Var.M.set(dp, r5 - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + r5);
            canvas.drawRoundRect(oh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), oh0Var.G);
            if (this.w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            oh0Var.M.set(dp3, r5 - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + r5);
            canvas.drawRoundRect(oh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), oh0Var.G);
        }
        if (this.v) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), TLObject.FLAG_30));
    }

    public void setPlaceholderAlpha(float f7) {
        this.y = f7;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var;
        rx0 rx0Var = this.f;
        if (rx0Var != null) {
            try {
                r5 r5Var = rx0Var.a;
                if (!(r5Var != null) || r5Var.F == null) {
                    return;
                }
                int i10 = org.telegram.ui.ActionBar.y6.z9;
                u6Var = ((org.telegram.ui.ActionBar.k3) this.F).resourcesProvider;
                r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
                org.telegram.ui.ActionBar.b6 b6Var = this.b;
                if (b6Var != null) {
                    b6Var.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
