package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class PollVotesAlert$UserCell extends LinearLayout {
    public ArrayList E;
    public final /* synthetic */ pg0 F;
    public final x9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final TextView c;
    public final TextView d;
    public final i9 e;
    public final jw0 f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public final int s;
    public boolean v;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(pg0 pg0Var, Context context) {
        super(context);
        this.F = pg0Var;
        this.s = UserConfig.selectedAccount;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new i9((org.telegram.ui.ActionBar.f6) null);
        x9 x9Var = new x9(context);
        this.a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(x9Var, w7.x5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(16);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(j5Var, w7.x5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.x5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new jw0(20, j5Var);
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
            pg0 pg0Var = this.F;
            pg0Var.G.setAlpha((int) (this.y * 255.0f));
            x9 x9Var = this.a;
            canvas.drawCircle((x9Var.getMeasuredWidth() / 2) + x9Var.getLeft(), (x9Var.getMeasuredHeight() / 2) + x9Var.getTop(), x9Var.getMeasuredWidth() / 2, pg0Var.G);
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
            pg0Var.M.set(dp, r5 - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + r5);
            canvas.drawRoundRect(pg0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), pg0Var.G);
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
            pg0Var.M.set(dp3, r5 - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + r5);
            canvas.drawRoundRect(pg0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), pg0Var.G);
        }
        if (this.v) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
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
}
