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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zv extends FrameLayout {
    public final da0 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final sg.q0 e;
    public final org.telegram.ui.ActionBar.u0 f;
    public final boolean h;
    public final bi.o3 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ ew x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(ew ewVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.x = ewVar;
        this.n = new bi.o3(this, 5);
        final int i12 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z10;
        final int i13 = 2;
        final int i14 = 1;
        if (z10) {
            f7 = 32.0f;
        } else {
            i11 = ((org.telegram.ui.ActionBar.e3) ewVar).currentAccount;
            float f12 = 8.0f;
            if (UserConfig.getInstance(i11).isPremium()) {
                f10 = 28.0f;
                f11 = 16.0f;
            } else {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                c6Var4 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
                sg.q0 q0Var = new sg.q0(dp, context, c6Var4, false);
                this.e = q0Var;
                q0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wv
                    public final /* synthetic */ zv b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i12;
                        zv zvVar = this.b;
                        switch (i15) {
                            case 0:
                                ew ewVar2 = zvVar.x;
                                ewVar2.Q = SystemClock.elapsedRealtime();
                                ewVar2.a0();
                                break;
                            case 1:
                                ew.X(zvVar.n, zvVar.r, true, null, null);
                                zvVar.a(true, true);
                                break;
                            case 2:
                                bi.o3 o3Var = zvVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zvVar.r;
                                kq kqVar = new kq(zvVar, 12);
                                Pattern pattern = ew.V;
                                if (o3Var != null && tL_messages_stickerSet != null && o3Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(o3Var.getCurrentAccount()).toggleStickerSet(o3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o3Var, true, true, kqVar, true);
                                }
                                zvVar.a(false, true);
                                break;
                            default:
                                zvVar.f.M(null, null);
                                break;
                        }
                    }
                }, false);
                q0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) q0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                q0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(q0Var, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                q0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f12 = (AndroidUtilities.dp(16.0f) + q0Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
            int i15 = org.telegram.ui.ActionBar.g6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, ewVar.getThemedColor(i15)));
            textView.setPadding(org.telegram.ui.Cells.d0.c(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wv
                public final /* synthetic */ zv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i14;
                    zv zvVar = this.b;
                    switch (i152) {
                        case 0:
                            ew ewVar2 = zvVar.x;
                            ewVar2.Q = SystemClock.elapsedRealtime();
                            ewVar2.a0();
                            break;
                        case 1:
                            ew.X(zvVar.n, zvVar.r, true, null, null);
                            zvVar.a(true, true);
                            break;
                        case 2:
                            bi.o3 o3Var = zvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zvVar.r;
                            kq kqVar = new kq(zvVar, 12);
                            Pattern pattern = ew.V;
                            if (o3Var != null && tL_messages_stickerSet != null && o3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o3Var.getCurrentAccount()).toggleStickerSet(o3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o3Var, true, true, kqVar, true);
                            }
                            zvVar.a(false, true);
                            break;
                        default:
                            zvVar.f.M(null, null);
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
            textView2.setTextColor(ewVar.getThemedColor(i15));
            textView2.setBackground(org.telegram.ui.ActionBar.g6.Z(ewVar.getThemedColor(i15) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.d0.c(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wv
                public final /* synthetic */ zv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i13;
                    zv zvVar = this.b;
                    switch (i152) {
                        case 0:
                            ew ewVar2 = zvVar.x;
                            ewVar2.Q = SystemClock.elapsedRealtime();
                            ewVar2.a0();
                            break;
                        case 1:
                            ew.X(zvVar.n, zvVar.r, true, null, null);
                            zvVar.a(true, true);
                            break;
                        case 2:
                            bi.o3 o3Var = zvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zvVar.r;
                            kq kqVar = new kq(zvVar, 12);
                            Pattern pattern = ew.V;
                            if (o3Var != null && tL_messages_stickerSet != null && o3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o3Var.getCurrentAccount()).toggleStickerSet(o3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o3Var, true, true, kqVar, true);
                            }
                            zvVar.a(false, true);
                            break;
                        default:
                            zvVar.f.M(null, null);
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
        float f13 = f7;
        c6Var = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
        da0 da0Var = new da0(context, c6Var);
        this.a = da0Var;
        da0Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        da0Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        da0Var.setEllipsize(truncateAt);
        da0Var.setSingleLine(true);
        da0Var.setLines(1);
        int i16 = org.telegram.ui.ActionBar.g6.J6;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i16, c6Var2));
        da0Var.setTextColor(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.j5));
        if (z10) {
            da0Var.setTextSize(1, 20.0f);
            addView(da0Var, w7.a6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f13, 0.0f));
        } else {
            da0Var.setTextSize(1, 17.0f);
            addView(da0Var, w7.a6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f13, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.a6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f13, 0.0f));
        }
        if (z10) {
            int themedColor = ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ji);
            c6Var3 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, themedColor, false, c6Var3);
            this.f = u0Var;
            u0Var.setLongClickEnabled(false);
            u0Var.setSubMenuOpenSide(2);
            u0Var.setIcon(R.drawable.ic_ab_other);
            u0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.e3) ewVar).backgroundPaddingLeft;
            addView(u0Var, w7.a6.a(40.0f, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f, 40, 53));
            u0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            u0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i17 = 3;
            u0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wv
                public final /* synthetic */ zv b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i17;
                    zv zvVar = this.b;
                    switch (i152) {
                        case 0:
                            ew ewVar2 = zvVar.x;
                            ewVar2.Q = SystemClock.elapsedRealtime();
                            ewVar2.a0();
                            break;
                        case 1:
                            ew.X(zvVar.n, zvVar.r, true, null, null);
                            zvVar.a(true, true);
                            break;
                        case 2:
                            bi.o3 o3Var = zvVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zvVar.r;
                            kq kqVar = new kq(zvVar, 12);
                            Pattern pattern = ew.V;
                            if (o3Var != null && tL_messages_stickerSet != null && o3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o3Var.getCurrentAccount()).toggleStickerSet(o3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o3Var, true, true, kqVar, true);
                            }
                            zvVar.a(false, true);
                            break;
                        default:
                            zvVar.f.M(null, null);
                            break;
                    }
                }
            });
            u0Var.setDelegate(new xv(ewVar, 0));
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
            ofFloat.addUpdateListener(new n6(this, 19));
            this.w.setInterpolator(es.h);
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
