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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public ArrayList E;
    public final /* synthetic */ oh0 F;
    public final w9 a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final TextView c;
    public final TextView d;
    public final h9 e;
    public final jx0 f;
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
        this.e = new h9((org.telegram.ui.ActionBar.g6) null);
        w9 w9Var = new w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(w9Var, w7.z5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i10, null);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setTextSize(16);
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(n5Var, w7.z5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i10, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.z5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new jx0(20, n5Var);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
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
            w9 w9Var = this.a;
            canvas.drawCircle((w9Var.getMeasuredWidth() / 2) + w9Var.getLeft(), (w9Var.getMeasuredHeight() / 2) + w9Var.getTop(), w9Var.getMeasuredWidth() / 2, oh0Var.G);
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var;
        jx0 jx0Var = this.f;
        if (jx0Var != null) {
            try {
                p5 p5Var = jx0Var.a;
                if (!(p5Var != null) || p5Var.F == null) {
                    return;
                }
                int i10 = org.telegram.ui.ActionBar.k6.z9;
                g6Var = ((org.telegram.ui.ActionBar.h3) this.F).resourcesProvider;
                p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
                org.telegram.ui.ActionBar.n5 n5Var = this.b;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
