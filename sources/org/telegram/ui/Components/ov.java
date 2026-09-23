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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ov extends FrameLayout {
    public final d90 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final rg.p0 e;
    public final org.telegram.ui.ActionBar.v0 f;
    public final boolean h;
    public final ai.y3 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ tv x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(tv tvVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.x = tvVar;
        this.n = new ai.y3(this, 5);
        final int i12 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z10;
        final int i13 = 2;
        final int i14 = 1;
        if (z10) {
            f7 = 32.0f;
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) tvVar).currentAccount;
            float f12 = 8.0f;
            if (UserConfig.getInstance(i11).isPremium()) {
                f10 = 28.0f;
                f11 = 16.0f;
            } else {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                d6Var4 = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
                rg.p0 p0Var = new rg.p0(dp, context, d6Var4, false);
                this.e = p0Var;
                p0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lv
                    public final /* synthetic */ ov b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i12;
                        ov ovVar = this.b;
                        switch (i15) {
                            case 0:
                                tv tvVar2 = ovVar.x;
                                tvVar2.Q = SystemClock.elapsedRealtime();
                                tvVar2.Z();
                                break;
                            case 1:
                                tv.W(ovVar.n, ovVar.r, true, null, null);
                                ovVar.a(true, true);
                                break;
                            case 2:
                                ai.y3 y3Var = ovVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ovVar.r;
                                yp ypVar = new yp(ovVar, 12);
                                Pattern pattern = tv.V;
                                if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, ypVar, true);
                                }
                                ovVar.a(false, true);
                                break;
                            default:
                                ovVar.f.M(null, null);
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
                addView(p0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f12 = (AndroidUtilities.dp(16.0f) + p0Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
            int i15 = org.telegram.ui.ActionBar.h6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{14.0f}, tvVar.getThemedColor(i15)));
            textView.setPadding(org.telegram.ui.Cells.q3.b(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lv
                public final /* synthetic */ ov b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i14;
                    ov ovVar = this.b;
                    switch (i152) {
                        case 0:
                            tv tvVar2 = ovVar.x;
                            tvVar2.Q = SystemClock.elapsedRealtime();
                            tvVar2.Z();
                            break;
                        case 1:
                            tv.W(ovVar.n, ovVar.r, true, null, null);
                            ovVar.a(true, true);
                            break;
                        case 2:
                            ai.y3 y3Var = ovVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ovVar.r;
                            yp ypVar = new yp(ovVar, 12);
                            Pattern pattern = tv.V;
                            if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, ypVar, true);
                            }
                            ovVar.a(false, true);
                            break;
                        default:
                            ovVar.f.M(null, null);
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
            textView2.setTextColor(tvVar.getThemedColor(i15));
            textView2.setBackground(org.telegram.ui.ActionBar.h6.Y(tvVar.getThemedColor(i15) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.q3.b(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lv
                public final /* synthetic */ ov b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i13;
                    ov ovVar = this.b;
                    switch (i152) {
                        case 0:
                            tv tvVar2 = ovVar.x;
                            tvVar2.Q = SystemClock.elapsedRealtime();
                            tvVar2.Z();
                            break;
                        case 1:
                            tv.W(ovVar.n, ovVar.r, true, null, null);
                            ovVar.a(true, true);
                            break;
                        case 2:
                            ai.y3 y3Var = ovVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ovVar.r;
                            yp ypVar = new yp(ovVar, 12);
                            Pattern pattern = tv.V;
                            if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, ypVar, true);
                            }
                            ovVar.a(false, true);
                            break;
                        default:
                            ovVar.f.M(null, null);
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
        d6Var = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
        d90 d90Var = new d90(context, d6Var);
        this.a = d90Var;
        d90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        d90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        d90Var.setEllipsize(truncateAt);
        d90Var.setSingleLine(true);
        d90Var.setLines(1);
        int i16 = org.telegram.ui.ActionBar.h6.J6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i16, d6Var2));
        d90Var.setTextColor(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.j5));
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
            textView3.setTextColor(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.x5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f7, 0.0f));
        }
        if (z10) {
            int themedColor = tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ji);
            d6Var3 = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, themedColor, false, d6Var3);
            this.f = v0Var;
            v0Var.setLongClickEnabled(false);
            v0Var.setSubMenuOpenSide(2);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.f3) tvVar).backgroundPaddingLeft;
            addView(v0Var, w7.x5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            v0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            v0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i17 = 3;
            v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lv
                public final /* synthetic */ ov b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i17;
                    ov ovVar = this.b;
                    switch (i152) {
                        case 0:
                            tv tvVar2 = ovVar.x;
                            tvVar2.Q = SystemClock.elapsedRealtime();
                            tvVar2.Z();
                            break;
                        case 1:
                            tv.W(ovVar.n, ovVar.r, true, null, null);
                            ovVar.a(true, true);
                            break;
                        case 2:
                            ai.y3 y3Var = ovVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ovVar.r;
                            yp ypVar = new yp(ovVar, 12);
                            Pattern pattern = tv.V;
                            if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, ypVar, true);
                            }
                            ovVar.a(false, true);
                            break;
                        default:
                            ovVar.f.M(null, null);
                            break;
                    }
                }
            });
            v0Var.setDelegate(new mv(tvVar, 0));
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
            ofFloat.addUpdateListener(new k6(this, 18));
            this.w.setInterpolator(rr.h);
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
