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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yu extends FrameLayout {
    public final l80 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final zf.p0 e;
    public final org.telegram.ui.ActionBar.w0 f;
    public final boolean h;
    public final bg.i1 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ dv x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(dv dvVar, Context context, boolean z10) {
        super(context);
        float f10;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        int i9;
        int i10;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.b6 b6Var4;
        this.x = dvVar;
        this.n = new bg.i1(this, 8);
        final int i11 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z10;
        final int i12 = 2;
        final int i13 = 1;
        if (z10) {
            f10 = 32.0f;
        } else {
            i10 = ((org.telegram.ui.ActionBar.f3) dvVar).currentAccount;
            float f13 = 8.0f;
            if (UserConfig.getInstance(i10).isPremium()) {
                f11 = 28.0f;
                f12 = 16.0f;
            } else {
                f12 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f11 = 28.0f;
                b6Var4 = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
                zf.p0 p0Var = new zf.p0(dp, context, b6Var4, false);
                this.e = p0Var;
                p0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vu
                    public final /* synthetic */ yu b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14 = i11;
                        yu yuVar = this.b;
                        switch (i14) {
                            case 0:
                                dv dvVar2 = yuVar.x;
                                dvVar2.M = SystemClock.elapsedRealtime();
                                dvVar2.Y();
                                break;
                            case 1:
                                dv.V(yuVar.n, yuVar.r, true, null, null);
                                yuVar.a(true, true);
                                break;
                            case 2:
                                bg.i1 i1Var = yuVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.r;
                                np npVar = new np(yuVar, 12);
                                Pattern pattern = dv.R;
                                if (i1Var != null && tL_messages_stickerSet != null && i1Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(i1Var.getCurrentAccount()).toggleStickerSet(i1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, i1Var, true, true, npVar, true);
                                }
                                yuVar.a(false, true);
                                break;
                            default:
                                yuVar.f.M(null, null);
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
                addView(p0Var, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f13 = (AndroidUtilities.dp(16.0f) + p0Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
            int i14 = org.telegram.ui.ActionBar.f6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{14.0f}, dvVar.getThemedColor(i14)));
            textView.setPadding(org.telegram.ui.Cells.j2.c(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vu
                public final /* synthetic */ yu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i13;
                    yu yuVar = this.b;
                    switch (i142) {
                        case 0:
                            dv dvVar2 = yuVar.x;
                            dvVar2.M = SystemClock.elapsedRealtime();
                            dvVar2.Y();
                            break;
                        case 1:
                            dv.V(yuVar.n, yuVar.r, true, null, null);
                            yuVar.a(true, true);
                            break;
                        case 2:
                            bg.i1 i1Var = yuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.r;
                            np npVar = new np(yuVar, 12);
                            Pattern pattern = dv.R;
                            if (i1Var != null && tL_messages_stickerSet != null && i1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(i1Var.getCurrentAccount()).toggleStickerSet(i1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, i1Var, true, true, npVar, true);
                            }
                            yuVar.a(false, true);
                            break;
                        default:
                            yuVar.f.M(null, null);
                            break;
                    }
                }
            });
            addView(textView, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), TLObject.FLAG_30));
            float max = Math.max(f13, (AndroidUtilities.dp(f12) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(dvVar.getThemedColor(i14));
            textView2.setBackground(org.telegram.ui.ActionBar.f6.Y(dvVar.getThemedColor(i14) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vu
                public final /* synthetic */ yu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i12;
                    yu yuVar = this.b;
                    switch (i142) {
                        case 0:
                            dv dvVar2 = yuVar.x;
                            dvVar2.M = SystemClock.elapsedRealtime();
                            dvVar2.Y();
                            break;
                        case 1:
                            dv.V(yuVar.n, yuVar.r, true, null, null);
                            yuVar.a(true, true);
                            break;
                        case 2:
                            bg.i1 i1Var = yuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.r;
                            np npVar = new np(yuVar, 12);
                            Pattern pattern = dv.R;
                            if (i1Var != null && tL_messages_stickerSet != null && i1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(i1Var.getCurrentAccount()).toggleStickerSet(i1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, i1Var, true, true, npVar, true);
                            }
                            yuVar.a(false, true);
                            break;
                        default:
                            yuVar.f.M(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), TLObject.FLAG_30));
            f10 = Math.max(max, (AndroidUtilities.dp(f12) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        }
        b6Var = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
        l80 l80Var = new l80(context, b6Var);
        this.a = l80Var;
        l80Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        l80Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        l80Var.setEllipsize(truncateAt);
        l80Var.setSingleLine(true);
        l80Var.setLines(1);
        int i15 = org.telegram.ui.ActionBar.f6.J6;
        b6Var2 = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var2));
        l80Var.setTextColor(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.j5));
        if (z10) {
            l80Var.setTextSize(1, 20.0f);
            addView(l80Var, g7.e6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f10, 0.0f));
        } else {
            l80Var.setTextSize(1, 17.0f);
            addView(l80Var, g7.e6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f10, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, g7.e6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f10, 0.0f));
        }
        if (z10) {
            int themedColor = dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ji);
            b6Var3 = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, b6Var3);
            this.f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ni), 1, -1));
            i9 = ((org.telegram.ui.ActionBar.f3) dvVar).backgroundPaddingLeft;
            addView(w0Var, g7.e6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i9 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i16 = 3;
            w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vu
                public final /* synthetic */ yu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i16;
                    yu yuVar = this.b;
                    switch (i142) {
                        case 0:
                            dv dvVar2 = yuVar.x;
                            dvVar2.M = SystemClock.elapsedRealtime();
                            dvVar2.Y();
                            break;
                        case 1:
                            dv.V(yuVar.n, yuVar.r, true, null, null);
                            yuVar.a(true, true);
                            break;
                        case 2:
                            bg.i1 i1Var = yuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.r;
                            np npVar = new np(yuVar, 12);
                            Pattern pattern = dv.R;
                            if (i1Var != null && tL_messages_stickerSet != null && i1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(i1Var.getCurrentAccount()).toggleStickerSet(i1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, i1Var, true, true, npVar, true);
                            }
                            yuVar.a(false, true);
                            break;
                        default:
                            yuVar.f.M(null, null);
                            break;
                    }
                }
            });
            w0Var.setDelegate(new wu(dvVar, 0));
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
            ofFloat.addUpdateListener(new e6(this, 18));
            this.w.setInterpolator(gr.h);
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 42.0f : 56.0f), TLObject.FLAG_30));
    }
}
