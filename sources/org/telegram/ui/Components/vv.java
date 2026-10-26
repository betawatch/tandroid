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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vv extends FrameLayout {
    public final z90 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final tg.p0 e;
    public final org.telegram.ui.ActionBar.w0 f;
    public final boolean h;
    public final bi.v4 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ aw x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(aw awVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        org.telegram.ui.ActionBar.u6 u6Var5;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var6;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.u6 u6Var7;
        org.telegram.ui.ActionBar.u6 u6Var8;
        org.telegram.ui.ActionBar.u6 u6Var9;
        org.telegram.ui.ActionBar.u6 u6Var10;
        org.telegram.ui.ActionBar.u6 u6Var11;
        this.x = awVar;
        this.n = new bi.v4(this, 6);
        final int i12 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z10;
        final int i13 = 1;
        if (z10) {
            f7 = 32.0f;
        } else {
            i11 = ((org.telegram.ui.ActionBar.k3) awVar).currentAccount;
            float f12 = 8.0f;
            if (UserConfig.getInstance(i11).isPremium()) {
                f10 = 28.0f;
                f11 = 16.0f;
            } else {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                u6Var11 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
                tg.p0 p0Var = new tg.p0(dp, context, u6Var11, false);
                this.e = p0Var;
                p0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                    public final /* synthetic */ vv b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14 = i12;
                        vv vvVar = this.b;
                        switch (i14) {
                            case 0:
                                aw awVar2 = vvVar.x;
                                awVar2.Q = SystemClock.elapsedRealtime();
                                awVar2.j0();
                                break;
                            case 1:
                                aw.g0(vvVar.n, vvVar.r, true, null, null);
                                vvVar.a(true, true);
                                break;
                            case 2:
                                bi.v4 v4Var = vvVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vvVar.r;
                                bq bqVar = new bq(vvVar, 13);
                                Pattern pattern = aw.V;
                                if (v4Var != null && tL_messages_stickerSet != null && v4Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(v4Var.getCurrentAccount()).toggleStickerSet(v4Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, v4Var, true, true, bqVar, true);
                                }
                                vvVar.a(false, true);
                                break;
                            default:
                                vvVar.f.U(null, null);
                                break;
                        }
                    }
                }, false);
                p0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(p0Var, gb1.m(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f12 = (AndroidUtilities.dp(16.0f) + p0Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            float f13 = f12;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            int i14 = org.telegram.ui.ActionBar.y6.Sh;
            u6Var7 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView, i14, u6Var7);
            int i15 = org.telegram.ui.ActionBar.y6.Oh;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{14.0f}, awVar.getThemedColor(i15));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
            org.telegram.ui.ActionBar.b7 f14 = org.telegram.ui.ActionBar.f7.f(i15);
            u6Var8 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            textView.setBackground(e);
            org.telegram.ui.ActionBar.f7.k(textView, e, N, f14, u6Var8);
            textView.setPadding(org.telegram.ui.d3.h(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                public final /* synthetic */ vv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i13;
                    vv vvVar = this.b;
                    switch (i142) {
                        case 0:
                            aw awVar2 = vvVar.x;
                            awVar2.Q = SystemClock.elapsedRealtime();
                            awVar2.j0();
                            break;
                        case 1:
                            aw.g0(vvVar.n, vvVar.r, true, null, null);
                            vvVar.a(true, true);
                            break;
                        case 2:
                            bi.v4 v4Var = vvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vvVar.r;
                            bq bqVar = new bq(vvVar, 13);
                            Pattern pattern = aw.V;
                            if (v4Var != null && tL_messages_stickerSet != null && v4Var.getFragmentView() != null) {
                                MediaDataController.getInstance(v4Var.getCurrentAccount()).toggleStickerSet(v4Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, v4Var, true, true, bqVar, true);
                            }
                            vvVar.a(false, true);
                            break;
                        default:
                            vvVar.f.U(null, null);
                            break;
                    }
                }
            });
            addView(textView, gb1.m(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            float max = Math.max(f13, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            u6Var9 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView2, i15, u6Var9);
            org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(268435455 & awVar.getThemedColor(i15), 4, 4);
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i15, 15);
            u6Var10 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            textView2.setBackground(Z);
            org.telegram.ui.ActionBar.f7.k(textView2, Z, null, h, u6Var10);
            textView2.setPadding(org.telegram.ui.d3.h(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            final int i16 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                public final /* synthetic */ vv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i16;
                    vv vvVar = this.b;
                    switch (i142) {
                        case 0:
                            aw awVar2 = vvVar.x;
                            awVar2.Q = SystemClock.elapsedRealtime();
                            awVar2.j0();
                            break;
                        case 1:
                            aw.g0(vvVar.n, vvVar.r, true, null, null);
                            vvVar.a(true, true);
                            break;
                        case 2:
                            bi.v4 v4Var = vvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vvVar.r;
                            bq bqVar = new bq(vvVar, 13);
                            Pattern pattern = aw.V;
                            if (v4Var != null && tL_messages_stickerSet != null && v4Var.getFragmentView() != null) {
                                MediaDataController.getInstance(v4Var.getCurrentAccount()).toggleStickerSet(v4Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, v4Var, true, true, bqVar, true);
                            }
                            vvVar.a(false, true);
                            break;
                        default:
                            vvVar.f.U(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, gb1.m(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            f7 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        }
        float f15 = f7;
        u6Var = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
        z90 z90Var = new z90(context, u6Var);
        this.a = z90Var;
        z90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        z90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        z90Var.setEllipsize(truncateAt);
        z90Var.setSingleLine(true);
        z90Var.setLines(1);
        int i17 = org.telegram.ui.ActionBar.y6.J6;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
        org.telegram.ui.ActionBar.f7.H(z90Var, i17, u6Var2);
        int i18 = org.telegram.ui.ActionBar.y6.j5;
        u6Var3 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
        org.telegram.ui.ActionBar.f7.V(z90Var, i18, u6Var3);
        if (z10) {
            z90Var.setTextSize(1, 20.0f);
            addView(z90Var, gb1.m(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            z90Var.setTextSize(1, 17.0f);
            addView(z90Var, gb1.m(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            int i19 = org.telegram.ui.ActionBar.y6.q5;
            u6Var6 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView3, i19, u6Var6);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, gb1.m(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            int themedColor = awVar.getThemedColor(org.telegram.ui.ActionBar.y6.Ji);
            u6Var4 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, u6Var4);
            this.f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            int i20 = org.telegram.ui.ActionBar.y6.Ni;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(awVar.getThemedColor(i20), 1, -1);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i20);
            u6Var5 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            w0Var.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(w0Var, g02, null, N2, u6Var5);
            i10 = ((org.telegram.ui.ActionBar.k3) awVar).backgroundPaddingLeft;
            addView(w0Var, gb1.h(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i21 = 3;
            w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                public final /* synthetic */ vv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i21;
                    vv vvVar = this.b;
                    switch (i142) {
                        case 0:
                            aw awVar2 = vvVar.x;
                            awVar2.Q = SystemClock.elapsedRealtime();
                            awVar2.j0();
                            break;
                        case 1:
                            aw.g0(vvVar.n, vvVar.r, true, null, null);
                            vvVar.a(true, true);
                            break;
                        case 2:
                            bi.v4 v4Var = vvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vvVar.r;
                            bq bqVar = new bq(vvVar, 13);
                            Pattern pattern = aw.V;
                            if (v4Var != null && tL_messages_stickerSet != null && v4Var.getFragmentView() != null) {
                                MediaDataController.getInstance(v4Var.getCurrentAccount()).toggleStickerSet(v4Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, v4Var, true, true, bqVar, true);
                            }
                            vvVar.a(false, true);
                            break;
                        default:
                            vvVar.f.U(null, null);
                            break;
                    }
                }
            });
            w0Var.setDelegate(new tv(awVar, 0));
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
            ofFloat.addUpdateListener(new n6(this, 19));
            this.w.setInterpolator(ds.h);
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
