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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rv extends FrameLayout {
    public final m90 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final qg.s0 e;
    public final org.telegram.ui.ActionBar.w0 f;
    public final boolean h;
    public final bi.o1 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ wv x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(wv wvVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.x = wvVar;
        this.n = new bi.o1(this, 3);
        final int i12 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z10;
        final int i13 = 2;
        final int i14 = 1;
        if (z10) {
            f7 = 32.0f;
        } else {
            i11 = ((org.telegram.ui.ActionBar.h3) wvVar).currentAccount;
            if (UserConfig.getInstance(i11).isPremium()) {
                f10 = 28.0f;
                f11 = 16.0f;
                f12 = 8.0f;
            } else {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                f6Var4 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
                qg.s0 s0Var = new qg.s0(dp, context, f6Var4, false);
                this.e = s0Var;
                s0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ov
                    public final /* synthetic */ rv b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i12;
                        rv rvVar = this.b;
                        switch (i15) {
                            case 0:
                                wv wvVar2 = rvVar.x;
                                wvVar2.Q = SystemClock.elapsedRealtime();
                                wvVar2.Z();
                                break;
                            case 1:
                                wv.W(rvVar.n, rvVar.r, true, null, null);
                                rvVar.a(true, true);
                                break;
                            case 2:
                                bi.o1 o1Var = rvVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rvVar.r;
                                dq dqVar = new dq(rvVar, 12);
                                Pattern pattern = wv.V;
                                if (o1Var != null && tL_messages_stickerSet != null && o1Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(o1Var.getCurrentAccount()).toggleStickerSet(o1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o1Var, true, true, dqVar, true);
                                }
                                rvVar.a(false, true);
                                break;
                            default:
                                rvVar.f.M(null, null);
                                break;
                        }
                    }
                }, false);
                s0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) s0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                s0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(s0Var, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                s0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f12 = (AndroidUtilities.dp(16.0f) + s0Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
            int i15 = org.telegram.ui.ActionBar.j6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, wvVar.getThemedColor(i15)));
            textView.setPadding(org.telegram.ui.Cells.r6.b(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ov
                public final /* synthetic */ rv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i14;
                    rv rvVar = this.b;
                    switch (i152) {
                        case 0:
                            wv wvVar2 = rvVar.x;
                            wvVar2.Q = SystemClock.elapsedRealtime();
                            wvVar2.Z();
                            break;
                        case 1:
                            wv.W(rvVar.n, rvVar.r, true, null, null);
                            rvVar.a(true, true);
                            break;
                        case 2:
                            bi.o1 o1Var = rvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rvVar.r;
                            dq dqVar = new dq(rvVar, 12);
                            Pattern pattern = wv.V;
                            if (o1Var != null && tL_messages_stickerSet != null && o1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o1Var.getCurrentAccount()).toggleStickerSet(o1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o1Var, true, true, dqVar, true);
                            }
                            rvVar.a(false, true);
                            break;
                        default:
                            rvVar.f.M(null, null);
                            break;
                    }
                }
            });
            addView(textView, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            float max = Math.max(f12, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(wvVar.getThemedColor(i15));
            textView2.setBackground(org.telegram.ui.ActionBar.j6.Y(wvVar.getThemedColor(i15) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.r6.b(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ov
                public final /* synthetic */ rv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i13;
                    rv rvVar = this.b;
                    switch (i152) {
                        case 0:
                            wv wvVar2 = rvVar.x;
                            wvVar2.Q = SystemClock.elapsedRealtime();
                            wvVar2.Z();
                            break;
                        case 1:
                            wv.W(rvVar.n, rvVar.r, true, null, null);
                            rvVar.a(true, true);
                            break;
                        case 2:
                            bi.o1 o1Var = rvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rvVar.r;
                            dq dqVar = new dq(rvVar, 12);
                            Pattern pattern = wv.V;
                            if (o1Var != null && tL_messages_stickerSet != null && o1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o1Var.getCurrentAccount()).toggleStickerSet(o1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o1Var, true, true, dqVar, true);
                            }
                            rvVar.a(false, true);
                            break;
                        default:
                            rvVar.f.M(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            f7 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        }
        f6Var = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
        m90 m90Var = new m90(context, f6Var);
        this.a = m90Var;
        m90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        m90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        m90Var.setEllipsize(truncateAt);
        m90Var.setSingleLine(true);
        m90Var.setLines(1);
        int i16 = org.telegram.ui.ActionBar.j6.J6;
        f6Var2 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2));
        m90Var.setTextColor(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        if (z10) {
            m90Var.setTextSize(1, 20.0f);
            addView(m90Var, w7.a6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f7, 0.0f));
        } else {
            m90Var.setTextSize(1, 17.0f);
            addView(m90Var, w7.a6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f7, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.a6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f7, 0.0f));
        }
        if (z10) {
            int themedColor = wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ji);
            f6Var3 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, f6Var3);
            this.f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.h3) wvVar).backgroundPaddingLeft;
            addView(w0Var, w7.a6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i17 = 3;
            w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ov
                public final /* synthetic */ rv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i17;
                    rv rvVar = this.b;
                    switch (i152) {
                        case 0:
                            wv wvVar2 = rvVar.x;
                            wvVar2.Q = SystemClock.elapsedRealtime();
                            wvVar2.Z();
                            break;
                        case 1:
                            wv.W(rvVar.n, rvVar.r, true, null, null);
                            rvVar.a(true, true);
                            break;
                        case 2:
                            bi.o1 o1Var = rvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rvVar.r;
                            dq dqVar = new dq(rvVar, 12);
                            Pattern pattern = wv.V;
                            if (o1Var != null && tL_messages_stickerSet != null && o1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o1Var.getCurrentAccount()).toggleStickerSet(o1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o1Var, true, true, dqVar, true);
                            }
                            rvVar.a(false, true);
                            break;
                        default:
                            rvVar.f.M(null, null);
                            break;
                    }
                }
            });
            w0Var.setDelegate(new pv(wvVar, 0));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
    }

    public final void a(boolean z10, boolean z11) {
        TextView textView;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w = null;
        }
        TextView textView2 = this.c;
        if (textView2 == null || (textView = this.d) == null) {
            return;
        }
        textView2.setClickable(!z10);
        textView.setClickable(z10);
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 18));
            this.w.setInterpolator(wr.h);
            this.w.setDuration(250L);
            this.w.start();
            return;
        }
        this.v = z10 ? 1.0f : 0.0f;
        textView2.setScaleX(z10 ? 0.0f : 1.0f);
        textView2.setScaleY(z10 ? 0.0f : 1.0f);
        textView2.setAlpha(z10 ? 0.0f : 1.0f);
        textView.setScaleX(z10 ? 1.0f : 0.0f);
        textView.setScaleY(z10 ? 1.0f : 0.0f);
        textView.setAlpha(z10 ? 1.0f : 0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 42.0f : 56.0f), TLObject.FLAG_30));
    }
}
