package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jv extends FrameLayout {
    public final g90 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final fg.b1 e;
    public final org.telegram.ui.ActionBar.w0 f;
    public final boolean h;
    public final fg.x1 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ ov x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(ov ovVar, Context context, boolean z4) {
        super(context);
        float f10;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i10;
        int i11;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.g6 g6Var4;
        this.x = ovVar;
        this.n = new fg.x1(this, 7);
        final int i12 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z4;
        final int i13 = 2;
        final int i14 = 1;
        if (z4) {
            f10 = 32.0f;
        } else {
            i11 = ((org.telegram.ui.ActionBar.h3) ovVar).currentAccount;
            float f13 = 8.0f;
            if (UserConfig.getInstance(i11).isPremium()) {
                f11 = 28.0f;
                f12 = 16.0f;
            } else {
                f12 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f11 = 28.0f;
                g6Var4 = ((org.telegram.ui.ActionBar.h3) ovVar).resourcesProvider;
                fg.b1 b1Var = new fg.b1(dp, context, g6Var4, false);
                this.e = b1Var;
                b1Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gv
                    public final /* synthetic */ jv b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i12;
                        jv jvVar = this.b;
                        switch (i15) {
                            case 0:
                                ov ovVar2 = jvVar.x;
                                ovVar2.N = SystemClock.elapsedRealtime();
                                ovVar2.Z();
                                break;
                            case 1:
                                ov.W(jvVar.n, jvVar.r, true, null, null);
                                jvVar.a(true, true);
                                break;
                            case 2:
                                fg.x1 x1Var = jvVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jvVar.r;
                                xp xpVar = new xp(jvVar, 12);
                                Pattern pattern = ov.S;
                                if (x1Var != null && tL_messages_stickerSet != null && x1Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(x1Var.getCurrentAccount()).toggleStickerSet(x1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, x1Var, true, true, xpVar, true);
                                }
                                jvVar.a(false, true);
                                break;
                            default:
                                jvVar.f.M(null, null);
                                break;
                        }
                    }
                }, false);
                b1Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b1Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) b1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                b1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(b1Var, k7.c6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                b1Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f13 = (AndroidUtilities.dp(16.0f) + b1Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(ovVar.getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
            int i15 = org.telegram.ui.ActionBar.k6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, ovVar.getThemedColor(i15)));
            textView.setPadding(org.telegram.ui.b.e(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gv
                public final /* synthetic */ jv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i14;
                    jv jvVar = this.b;
                    switch (i152) {
                        case 0:
                            ov ovVar2 = jvVar.x;
                            ovVar2.N = SystemClock.elapsedRealtime();
                            ovVar2.Z();
                            break;
                        case 1:
                            ov.W(jvVar.n, jvVar.r, true, null, null);
                            jvVar.a(true, true);
                            break;
                        case 2:
                            fg.x1 x1Var = jvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jvVar.r;
                            xp xpVar = new xp(jvVar, 12);
                            Pattern pattern = ov.S;
                            if (x1Var != null && tL_messages_stickerSet != null && x1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(x1Var.getCurrentAccount()).toggleStickerSet(x1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, x1Var, true, true, xpVar, true);
                            }
                            jvVar.a(false, true);
                            break;
                        default:
                            jvVar.f.M(null, null);
                            break;
                    }
                }
            });
            addView(textView, k7.c6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), TLObject.FLAG_30));
            float max = Math.max(f13, (AndroidUtilities.dp(f12) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(ovVar.getThemedColor(i15));
            textView2.setBackground(org.telegram.ui.ActionBar.k6.Y(ovVar.getThemedColor(i15) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gv
                public final /* synthetic */ jv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i13;
                    jv jvVar = this.b;
                    switch (i152) {
                        case 0:
                            ov ovVar2 = jvVar.x;
                            ovVar2.N = SystemClock.elapsedRealtime();
                            ovVar2.Z();
                            break;
                        case 1:
                            ov.W(jvVar.n, jvVar.r, true, null, null);
                            jvVar.a(true, true);
                            break;
                        case 2:
                            fg.x1 x1Var = jvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jvVar.r;
                            xp xpVar = new xp(jvVar, 12);
                            Pattern pattern = ov.S;
                            if (x1Var != null && tL_messages_stickerSet != null && x1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(x1Var.getCurrentAccount()).toggleStickerSet(x1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, x1Var, true, true, xpVar, true);
                            }
                            jvVar.a(false, true);
                            break;
                        default:
                            jvVar.f.M(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, k7.c6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), TLObject.FLAG_30));
            f10 = Math.max(max, (AndroidUtilities.dp(f12) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        }
        g6Var = ((org.telegram.ui.ActionBar.h3) ovVar).resourcesProvider;
        g90 g90Var = new g90(context, g6Var);
        this.a = g90Var;
        g90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        g90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        g90Var.setEllipsize(truncateAt);
        g90Var.setSingleLine(true);
        g90Var.setLines(1);
        int i16 = org.telegram.ui.ActionBar.k6.J6;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) ovVar).resourcesProvider;
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var2));
        g90Var.setTextColor(ovVar.getThemedColor(org.telegram.ui.ActionBar.k6.j5));
        if (z4) {
            g90Var.setTextSize(1, 20.0f);
            addView(g90Var, k7.c6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f10, 0.0f));
        } else {
            g90Var.setTextSize(1, 17.0f);
            addView(g90Var, k7.c6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f10, 0.0f));
        }
        if (!z4) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(ovVar.getThemedColor(org.telegram.ui.ActionBar.k6.q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, k7.c6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f10, 0.0f));
        }
        if (z4) {
            int themedColor = ovVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ji);
            g6Var3 = ((org.telegram.ui.ActionBar.h3) ovVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, g6Var3);
            this.f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(ovVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.h3) ovVar).backgroundPaddingLeft;
            addView(w0Var, k7.c6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i17 = 3;
            w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gv
                public final /* synthetic */ jv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i17;
                    jv jvVar = this.b;
                    switch (i152) {
                        case 0:
                            ov ovVar2 = jvVar.x;
                            ovVar2.N = SystemClock.elapsedRealtime();
                            ovVar2.Z();
                            break;
                        case 1:
                            ov.W(jvVar.n, jvVar.r, true, null, null);
                            jvVar.a(true, true);
                            break;
                        case 2:
                            fg.x1 x1Var = jvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jvVar.r;
                            xp xpVar = new xp(jvVar, 12);
                            Pattern pattern = ov.S;
                            if (x1Var != null && tL_messages_stickerSet != null && x1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(x1Var.getCurrentAccount()).toggleStickerSet(x1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, x1Var, true, true, xpVar, true);
                            }
                            jvVar.a(false, true);
                            break;
                        default:
                            jvVar.f.M(null, null);
                            break;
                    }
                }
            });
            w0Var.setDelegate(new hv(ovVar, 0));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
    }

    public final void a(boolean z4, boolean z10) {
        TextView textView;
        if (this.s == z4) {
            return;
        }
        this.s = z4;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w = null;
        }
        TextView textView2 = this.c;
        if (textView2 == null || (textView = this.d) == null) {
            return;
        }
        textView2.setClickable(!z4);
        textView.setClickable(z4);
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, z4 ? 1.0f : 0.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new f6(this, 18));
            this.w.setInterpolator(pr.h);
            this.w.setDuration(250L);
            this.w.start();
            return;
        }
        this.v = z4 ? 1.0f : 0.0f;
        textView2.setScaleX(z4 ? 0.0f : 1.0f);
        textView2.setScaleY(z4 ? 0.0f : 1.0f);
        textView2.setAlpha(z4 ? 0.0f : 1.0f);
        textView.setScaleX(z4 ? 1.0f : 0.0f);
        textView.setScaleY(z4 ? 1.0f : 0.0f);
        textView.setAlpha(z4 ? 1.0f : 0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 42.0f : 56.0f), TLObject.FLAG_30));
    }
}
