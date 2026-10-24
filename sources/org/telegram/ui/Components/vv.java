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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vv extends FrameLayout {
    public final y90 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final sg.p0 e;
    public final org.telegram.ui.ActionBar.u0 f;
    public final boolean h;
    public final ai.a5 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ aw x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(aw awVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var6;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.g6 g6Var7;
        org.telegram.ui.ActionBar.g6 g6Var8;
        org.telegram.ui.ActionBar.g6 g6Var9;
        org.telegram.ui.ActionBar.g6 g6Var10;
        org.telegram.ui.ActionBar.g6 g6Var11;
        this.x = awVar;
        this.n = new ai.a5(this, 6);
        final int i12 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z10;
        final int i13 = 1;
        if (z10) {
            f7 = 32.0f;
        } else {
            i11 = ((org.telegram.ui.ActionBar.h3) awVar).currentAccount;
            float f12 = 8.0f;
            if (UserConfig.getInstance(i11).isPremium()) {
                f10 = 28.0f;
                f11 = 16.0f;
            } else {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                g6Var11 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
                sg.p0 p0Var = new sg.p0(dp, context, g6Var11, false);
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
                                ai.a5 a5Var = vvVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vvVar.r;
                                zp zpVar = new zp(vvVar, 13);
                                Pattern pattern = aw.V;
                                if (a5Var != null && tL_messages_stickerSet != null && a5Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(a5Var.getCurrentAccount()).toggleStickerSet(a5Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, a5Var, true, true, zpVar, true);
                                }
                                vvVar.a(false, true);
                                break;
                            default:
                                vvVar.f.M(null, null);
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
                addView(p0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f12 = (AndroidUtilities.dp(16.0f) + p0Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            float f13 = f12;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            int i14 = org.telegram.ui.ActionBar.k6.Sh;
            g6Var7 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView, i14, g6Var7);
            int i15 = org.telegram.ui.ActionBar.k6.Oh;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, awVar.getThemedColor(i15));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
            org.telegram.ui.ActionBar.n6 f14 = org.telegram.ui.ActionBar.r6.f(i15);
            g6Var8 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
            textView.setBackground(e);
            org.telegram.ui.ActionBar.r6.k(textView, e, O, f14, g6Var8);
            textView.setPadding(org.telegram.ui.Cells.b1.e(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
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
                            ai.a5 a5Var = vvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vvVar.r;
                            zp zpVar = new zp(vvVar, 13);
                            Pattern pattern = aw.V;
                            if (a5Var != null && tL_messages_stickerSet != null && a5Var.getFragmentView() != null) {
                                MediaDataController.getInstance(a5Var.getCurrentAccount()).toggleStickerSet(a5Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, a5Var, true, true, zpVar, true);
                            }
                            vvVar.a(false, true);
                            break;
                        default:
                            vvVar.f.M(null, null);
                            break;
                    }
                }
            });
            addView(textView, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            float max = Math.max(f13, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            g6Var9 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView2, i15, g6Var9);
            org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(268435455 & awVar.getThemedColor(i15), 4, 4);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i15, 15);
            g6Var10 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
            textView2.setBackground(Z);
            org.telegram.ui.ActionBar.r6.k(textView2, Z, null, h, g6Var10);
            textView2.setPadding(org.telegram.ui.Cells.b1.e(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
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
                            ai.a5 a5Var = vvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vvVar.r;
                            zp zpVar = new zp(vvVar, 13);
                            Pattern pattern = aw.V;
                            if (a5Var != null && tL_messages_stickerSet != null && a5Var.getFragmentView() != null) {
                                MediaDataController.getInstance(a5Var.getCurrentAccount()).toggleStickerSet(a5Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, a5Var, true, true, zpVar, true);
                            }
                            vvVar.a(false, true);
                            break;
                        default:
                            vvVar.f.M(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            f7 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        }
        float f15 = f7;
        g6Var = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
        y90 y90Var = new y90(context, g6Var);
        this.a = y90Var;
        y90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        y90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        y90Var.setEllipsize(truncateAt);
        y90Var.setSingleLine(true);
        y90Var.setLines(1);
        int i17 = org.telegram.ui.ActionBar.k6.J6;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
        org.telegram.ui.ActionBar.r6.I(y90Var, i17, g6Var2);
        int i18 = org.telegram.ui.ActionBar.k6.j5;
        g6Var3 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
        org.telegram.ui.ActionBar.r6.W(y90Var, i18, g6Var3);
        if (z10) {
            y90Var.setTextSize(1, 20.0f);
            addView(y90Var, w7.z5.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            y90Var.setTextSize(1, 17.0f);
            addView(y90Var, w7.z5.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            int i19 = org.telegram.ui.ActionBar.k6.q5;
            g6Var6 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView3, i19, g6Var6);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.z5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            int themedColor = awVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ji);
            g6Var4 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, themedColor, false, g6Var4);
            this.f = u0Var;
            u0Var.setLongClickEnabled(false);
            u0Var.setSubMenuOpenSide(2);
            u0Var.setIcon(R.drawable.ic_ab_other);
            int i20 = org.telegram.ui.ActionBar.k6.Ni;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(awVar.getThemedColor(i20), 1, -1);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i20);
            g6Var5 = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
            u0Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(u0Var, g02, null, O2, g6Var5);
            i10 = ((org.telegram.ui.ActionBar.h3) awVar).backgroundPaddingLeft;
            addView(u0Var, w7.z5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            u0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            u0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i21 = 3;
            u0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
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
                            ai.a5 a5Var = vvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vvVar.r;
                            zp zpVar = new zp(vvVar, 13);
                            Pattern pattern = aw.V;
                            if (a5Var != null && tL_messages_stickerSet != null && a5Var.getFragmentView() != null) {
                                MediaDataController.getInstance(a5Var.getCurrentAccount()).toggleStickerSet(a5Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, a5Var, true, true, zpVar, true);
                            }
                            vvVar.a(false, true);
                            break;
                        default:
                            vvVar.f.M(null, null);
                            break;
                    }
                }
            });
            u0Var.setDelegate(new tv(awVar, 0));
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
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
            ofFloat.addUpdateListener(new l6(this, 19));
            this.w.setInterpolator(bs.h);
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
