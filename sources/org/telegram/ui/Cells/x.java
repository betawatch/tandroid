package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zp;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final org.telegram.ui.Components.y9 b;
    public final Switch c;
    public final zp d;
    public final View e;
    public TLRPC.TL_availableReaction f;
    public final boolean h;
    public boolean n;

    public x(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.a = b6Var;
        NotificationCenter.listenEmojiLoading(b6Var);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
        b6Var.setTextSize(16);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setMaxLines(1);
        b6Var.setMaxLines(1);
        b6Var.setGravity(16 | gb1.E());
        addView(b6Var, gb1.m(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.b = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setLayerNum(1);
        addView(y9Var, gb1.m(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            zp zpVar = new zp(context, 26, null);
            this.d = zpVar;
            zpVar.setDrawUnchecked(false);
            zpVar.b(-1, -1, org.telegram.ui.ActionBar.y6.h7);
            zpVar.setDrawBackgroundAsArc(-1);
            addView(zpVar, gb1.m(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.c = r14;
            r14.d(org.telegram.ui.ActionBar.y6.M6, org.telegram.ui.ActionBar.y6.N6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
            addView(r14, gb1.m(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
        addView(view, gb1.g(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i10) {
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f;
        boolean z11 = tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction);
        this.f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false), false);
        this.b.i(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.y6.a7, 1.0f), tL_availableReaction);
        boolean z12 = this.h && tL_availableReaction.premium && !UserConfig.getInstance(i10).isPremium();
        this.n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            org.telegram.ui.ActionBar.f7.y(this, drawable, org.telegram.ui.ActionBar.y6.Uh, null, PorterDuff.Mode.MULTIPLY);
            b6Var.i(drawable);
        } else {
            b6Var.i(null);
        }
        Switch r02 = this.c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        zp zpVar = this.d;
        if (zpVar != null) {
            zpVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.y6.k0.getStrokeWidth();
        int dp = AndroidUtilities.dp(81.0f);
        int i10 = 0;
        if (LocaleController.isRTL) {
            i10 = dp;
            dp = 0;
        }
        canvas.drawLine(getPaddingLeft() + dp, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i10, getHeight() - strokeWidth, org.telegram.ui.ActionBar.y6.k0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        zp zpVar = this.d;
        Switch r32 = this.c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (zpVar != null) {
                z10 = zpVar.a.q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (zpVar != null) {
                z10 = zpVar.a.q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.y6.k0.getStrokeWidth() + AndroidUtilities.dp(58.0f)), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        zp zpVar = this.d;
        if (zpVar != null) {
            zpVar.a(z10, false);
        }
    }
}
