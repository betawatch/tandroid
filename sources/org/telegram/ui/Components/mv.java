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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class mv extends FrameLayout {
    public final d90 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final sg.r0 e;
    public final org.telegram.ui.ActionBar.v0 f;
    public final boolean h;
    public final bi.l3 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ rv x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(rv rvVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.x = rvVar;
        this.n = new bi.l3(this, 5);
        final int i12 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z10;
        final int i13 = 2;
        final int i14 = 1;
        if (z10) {
            f7 = 32.0f;
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) rvVar).currentAccount;
            float f12 = 8.0f;
            if (UserConfig.getInstance(i11).isPremium()) {
                f10 = 28.0f;
                f11 = 16.0f;
            } else {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                f6Var4 = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
                sg.r0 r0Var = new sg.r0(dp, context, f6Var4, false);
                this.e = r0Var;
                r0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jv
                    public final /* synthetic */ mv b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i12;
                        mv mvVar = this.b;
                        switch (i15) {
                            case 0:
                                rv rvVar2 = mvVar.x;
                                rvVar2.Q = SystemClock.elapsedRealtime();
                                rvVar2.Z();
                                break;
                            case 1:
                                rv.W(mvVar.n, mvVar.r, true, null, null);
                                mvVar.a(true, true);
                                break;
                            case 2:
                                bi.l3 l3Var = mvVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mvVar.r;
                                wp wpVar = new wp(mvVar, 12);
                                Pattern pattern = rv.V;
                                if (l3Var != null && tL_messages_stickerSet != null && l3Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(l3Var.getCurrentAccount()).toggleStickerSet(l3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, l3Var, true, true, wpVar, true);
                                }
                                mvVar.a(false, true);
                                break;
                            default:
                                mvVar.f.M(null, null);
                                break;
                        }
                    }
                }, false);
                r0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) r0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                r0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(r0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                r0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f12 = (AndroidUtilities.dp(16.0f) + r0Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
            int i15 = org.telegram.ui.ActionBar.j6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, rvVar.getThemedColor(i15)));
            textView.setPadding(org.telegram.ui.Cells.p6.b(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jv
                public final /* synthetic */ mv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i14;
                    mv mvVar = this.b;
                    switch (i152) {
                        case 0:
                            rv rvVar2 = mvVar.x;
                            rvVar2.Q = SystemClock.elapsedRealtime();
                            rvVar2.Z();
                            break;
                        case 1:
                            rv.W(mvVar.n, mvVar.r, true, null, null);
                            mvVar.a(true, true);
                            break;
                        case 2:
                            bi.l3 l3Var = mvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mvVar.r;
                            wp wpVar = new wp(mvVar, 12);
                            Pattern pattern = rv.V;
                            if (l3Var != null && tL_messages_stickerSet != null && l3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(l3Var.getCurrentAccount()).toggleStickerSet(l3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, l3Var, true, true, wpVar, true);
                            }
                            mvVar.a(false, true);
                            break;
                        default:
                            mvVar.f.M(null, null);
                            break;
                    }
                }
            });
            addView(textView, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            float max = Math.max(f12, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(rvVar.getThemedColor(i15));
            textView2.setBackground(org.telegram.ui.ActionBar.j6.Y(rvVar.getThemedColor(i15) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jv
                public final /* synthetic */ mv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i13;
                    mv mvVar = this.b;
                    switch (i152) {
                        case 0:
                            rv rvVar2 = mvVar.x;
                            rvVar2.Q = SystemClock.elapsedRealtime();
                            rvVar2.Z();
                            break;
                        case 1:
                            rv.W(mvVar.n, mvVar.r, true, null, null);
                            mvVar.a(true, true);
                            break;
                        case 2:
                            bi.l3 l3Var = mvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mvVar.r;
                            wp wpVar = new wp(mvVar, 12);
                            Pattern pattern = rv.V;
                            if (l3Var != null && tL_messages_stickerSet != null && l3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(l3Var.getCurrentAccount()).toggleStickerSet(l3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, l3Var, true, true, wpVar, true);
                            }
                            mvVar.a(false, true);
                            break;
                        default:
                            mvVar.f.M(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            f7 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        }
        f6Var = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
        d90 d90Var = new d90(context, f6Var);
        this.a = d90Var;
        d90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        d90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        d90Var.setEllipsize(truncateAt);
        d90Var.setSingleLine(true);
        d90Var.setLines(1);
        int i16 = org.telegram.ui.ActionBar.j6.J6;
        f6Var2 = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2));
        d90Var.setTextColor(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        if (z10) {
            d90Var.setTextSize(1, 20.0f);
            addView(d90Var, w7.x5.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f7, 0.0f));
        } else {
            d90Var.setTextSize(1, 17.0f);
            addView(d90Var, w7.x5.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f7, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.x5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f7, 0.0f));
        }
        if (z10) {
            int themedColor = rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ji);
            f6Var3 = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, themedColor, false, f6Var3);
            this.f = v0Var;
            v0Var.setLongClickEnabled(false);
            v0Var.setSubMenuOpenSide(2);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.f3) rvVar).backgroundPaddingLeft;
            addView(v0Var, w7.x5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            v0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            v0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i17 = 3;
            v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jv
                public final /* synthetic */ mv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i17;
                    mv mvVar = this.b;
                    switch (i152) {
                        case 0:
                            rv rvVar2 = mvVar.x;
                            rvVar2.Q = SystemClock.elapsedRealtime();
                            rvVar2.Z();
                            break;
                        case 1:
                            rv.W(mvVar.n, mvVar.r, true, null, null);
                            mvVar.a(true, true);
                            break;
                        case 2:
                            bi.l3 l3Var = mvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mvVar.r;
                            wp wpVar = new wp(mvVar, 12);
                            Pattern pattern = rv.V;
                            if (l3Var != null && tL_messages_stickerSet != null && l3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(l3Var.getCurrentAccount()).toggleStickerSet(l3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, l3Var, true, true, wpVar, true);
                            }
                            mvVar.a(false, true);
                            break;
                        default:
                            mvVar.f.M(null, null);
                            break;
                    }
                }
            });
            v0Var.setDelegate(new kv(rvVar, 0));
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
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
            ofFloat.addUpdateListener(new l6(this, 18));
            this.w.setInterpolator(pr.h);
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
