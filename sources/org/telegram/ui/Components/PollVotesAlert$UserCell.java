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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class PollVotesAlert$UserCell extends LinearLayout {
    public ArrayList A;
    public final /* synthetic */ ag0 B;
    public final o9 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final TextView c;
    public final TextView d;
    public final z8 e;
    public final sv0 f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public final int s;
    public boolean v;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(ag0 ag0Var, Context context) {
        super(context);
        this.B = ag0Var;
        this.s = UserConfig.selectedAccount;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new z8((org.telegram.ui.ActionBar.b6) null);
        o9 o9Var = new o9(context);
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(o9Var, g7.e6.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        int i9 = org.telegram.ui.ActionBar.f6.j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(h5Var, g7.e6.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, g7.e6.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, g7.e6.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new sv0(20, h5Var);
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
            ag0 ag0Var = this.B;
            ag0Var.C.setAlpha((int) (this.y * 255.0f));
            o9 o9Var = this.a;
            canvas.drawCircle((o9Var.getMeasuredWidth() / 2) + o9Var.getLeft(), (o9Var.getMeasuredHeight() / 2) + o9Var.getTop(), o9Var.getMeasuredWidth() / 2, ag0Var.C);
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
            ag0Var.I.set(dp, r5 - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + r5);
            canvas.drawRoundRect(ag0Var.I, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), ag0Var.C);
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
            ag0Var.I.set(dp3, r5 - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + r5);
            canvas.drawRoundRect(ag0Var.I, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), ag0Var.C);
        }
        if (this.v) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), TLObject.FLAG_30));
    }

    public void setPlaceholderAlpha(float f10) {
        this.y = f10;
        invalidate();
    }
}
