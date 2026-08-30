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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hv extends FrameLayout {
    public final e90 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final eg.c1 e;
    public final org.telegram.ui.ActionBar.w0 f;
    public final boolean h;
    public final eg.y1 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ mv x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(mv mvVar, Context context, boolean z4) {
        super(context);
        float f10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        int i11;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.x = mvVar;
        this.n = new eg.y1(this, 7);
        final int i12 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z4;
        final int i13 = 2;
        final int i14 = 1;
        if (z4) {
            f10 = 32.0f;
        } else {
            i11 = ((org.telegram.ui.ActionBar.g3) mvVar).currentAccount;
            float f13 = 8.0f;
            if (UserConfig.getInstance(i11).isPremium()) {
                f11 = 28.0f;
                f12 = 16.0f;
            } else {
                f12 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f11 = 28.0f;
                f6Var4 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
                eg.c1 c1Var = new eg.c1(dp, context, f6Var4, false);
                this.e = c1Var;
                c1Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ev
                    public final /* synthetic */ hv b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i12;
                        hv hvVar = this.b;
                        switch (i15) {
                            case 0:
                                mv mvVar2 = hvVar.x;
                                mvVar2.N = SystemClock.elapsedRealtime();
                                mvVar2.Z();
                                break;
                            case 1:
                                mv.W(hvVar.n, hvVar.r, true, null, null);
                                hvVar.a(true, true);
                                break;
                            case 2:
                                eg.y1 y1Var = hvVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hvVar.r;
                                vp vpVar = new vp(hvVar, 12);
                                Pattern pattern = mv.S;
                                if (y1Var != null && tL_messages_stickerSet != null && y1Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(y1Var.getCurrentAccount()).toggleStickerSet(y1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y1Var, true, true, vpVar, true);
                                }
                                hvVar.a(false, true);
                                break;
                            default:
                                hvVar.f.M(null, null);
                                break;
                        }
                    }
                }, false);
                c1Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) c1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                c1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(c1Var, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                c1Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f13 = (AndroidUtilities.dp(16.0f) + c1Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
            int i15 = org.telegram.ui.ActionBar.j6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, mvVar.getThemedColor(i15)));
            textView.setPadding(org.telegram.ui.b.e(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ev
                public final /* synthetic */ hv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i14;
                    hv hvVar = this.b;
                    switch (i152) {
                        case 0:
                            mv mvVar2 = hvVar.x;
                            mvVar2.N = SystemClock.elapsedRealtime();
                            mvVar2.Z();
                            break;
                        case 1:
                            mv.W(hvVar.n, hvVar.r, true, null, null);
                            hvVar.a(true, true);
                            break;
                        case 2:
                            eg.y1 y1Var = hvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hvVar.r;
                            vp vpVar = new vp(hvVar, 12);
                            Pattern pattern = mv.S;
                            if (y1Var != null && tL_messages_stickerSet != null && y1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y1Var.getCurrentAccount()).toggleStickerSet(y1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y1Var, true, true, vpVar, true);
                            }
                            hvVar.a(false, true);
                            break;
                        default:
                            hvVar.f.M(null, null);
                            break;
                    }
                }
            });
            addView(textView, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), TLObject.FLAG_30));
            float max = Math.max(f13, (AndroidUtilities.dp(f12) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(mvVar.getThemedColor(i15));
            textView2.setBackground(org.telegram.ui.ActionBar.j6.Y(mvVar.getThemedColor(i15) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ev
                public final /* synthetic */ hv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i13;
                    hv hvVar = this.b;
                    switch (i152) {
                        case 0:
                            mv mvVar2 = hvVar.x;
                            mvVar2.N = SystemClock.elapsedRealtime();
                            mvVar2.Z();
                            break;
                        case 1:
                            mv.W(hvVar.n, hvVar.r, true, null, null);
                            hvVar.a(true, true);
                            break;
                        case 2:
                            eg.y1 y1Var = hvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hvVar.r;
                            vp vpVar = new vp(hvVar, 12);
                            Pattern pattern = mv.S;
                            if (y1Var != null && tL_messages_stickerSet != null && y1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y1Var.getCurrentAccount()).toggleStickerSet(y1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y1Var, true, true, vpVar, true);
                            }
                            hvVar.a(false, true);
                            break;
                        default:
                            hvVar.f.M(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), TLObject.FLAG_30));
            f10 = Math.max(max, (AndroidUtilities.dp(f12) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        }
        f6Var = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
        e90 e90Var = new e90(context, f6Var);
        this.a = e90Var;
        e90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        e90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        e90Var.setEllipsize(truncateAt);
        e90Var.setSingleLine(true);
        e90Var.setLines(1);
        int i16 = org.telegram.ui.ActionBar.j6.J6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2));
        e90Var.setTextColor(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        if (z4) {
            e90Var.setTextSize(1, 20.0f);
            addView(e90Var, k7.b6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f10, 0.0f));
        } else {
            e90Var.setTextSize(1, 17.0f);
            addView(e90Var, k7.b6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f10, 0.0f));
        }
        if (!z4) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, k7.b6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f10, 0.0f));
        }
        if (z4) {
            int themedColor = mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ji);
            f6Var3 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, f6Var3);
            this.f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.g3) mvVar).backgroundPaddingLeft;
            addView(w0Var, k7.b6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i17 = 3;
            w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ev
                public final /* synthetic */ hv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i17;
                    hv hvVar = this.b;
                    switch (i152) {
                        case 0:
                            mv mvVar2 = hvVar.x;
                            mvVar2.N = SystemClock.elapsedRealtime();
                            mvVar2.Z();
                            break;
                        case 1:
                            mv.W(hvVar.n, hvVar.r, true, null, null);
                            hvVar.a(true, true);
                            break;
                        case 2:
                            eg.y1 y1Var = hvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hvVar.r;
                            vp vpVar = new vp(hvVar, 12);
                            Pattern pattern = mv.S;
                            if (y1Var != null && tL_messages_stickerSet != null && y1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y1Var.getCurrentAccount()).toggleStickerSet(y1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y1Var, true, true, vpVar, true);
                            }
                            hvVar.a(false, true);
                            break;
                        default:
                            hvVar.f.M(null, null);
                            break;
                    }
                }
            });
            w0Var.setDelegate(new fv(mvVar, 0));
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
            this.w.setInterpolator(nr.h);
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
