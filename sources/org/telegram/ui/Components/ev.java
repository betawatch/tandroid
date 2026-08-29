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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ev extends FrameLayout {
    public final y80 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final cg.d1 e;
    public final org.telegram.ui.ActionBar.w0 f;
    public final boolean h;
    public final cg.z1 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float v;
    public ValueAnimator w;
    public final /* synthetic */ jv x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(jv jvVar, Context context, boolean z10) {
        super(context);
        float f9;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.x = jvVar;
        this.n = new cg.z1(this, 9);
        final int i12 = 0;
        this.s = false;
        this.v = 0.0f;
        this.h = z10;
        final int i13 = 2;
        final int i14 = 1;
        if (z10) {
            f9 = 32.0f;
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) jvVar).currentAccount;
            float f12 = 8.0f;
            if (UserConfig.getInstance(i11).isPremium()) {
                f10 = 28.0f;
                f11 = 16.0f;
            } else {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                c6Var4 = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
                cg.d1 d1Var = new cg.d1(dp, context, c6Var4, false);
                this.e = d1Var;
                d1Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bv
                    public final /* synthetic */ ev b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i12;
                        ev evVar = this.b;
                        switch (i15) {
                            case 0:
                                jv jvVar2 = evVar.x;
                                jvVar2.M = SystemClock.elapsedRealtime();
                                jvVar2.Z();
                                break;
                            case 1:
                                jv.W(evVar.n, evVar.r, true, null, null);
                                evVar.a(true, true);
                                break;
                            case 2:
                                cg.z1 z1Var = evVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = evVar.r;
                                rp rpVar = new rp(evVar, 12);
                                Pattern pattern = jv.R;
                                if (z1Var != null && tL_messages_stickerSet != null && z1Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(z1Var.getCurrentAccount()).toggleStickerSet(z1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z1Var, true, true, rpVar, true);
                                }
                                evVar.a(false, true);
                                break;
                            default:
                                evVar.f.M(null, null);
                                break;
                        }
                    }
                }, false);
                d1Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d1Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) d1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                d1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(d1Var, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                d1Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                f12 = (AndroidUtilities.dp(16.0f) + d1Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
            int i15 = org.telegram.ui.ActionBar.g6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, jvVar.getThemedColor(i15)));
            textView.setPadding(org.telegram.ui.b.e(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bv
                public final /* synthetic */ ev b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i14;
                    ev evVar = this.b;
                    switch (i152) {
                        case 0:
                            jv jvVar2 = evVar.x;
                            jvVar2.M = SystemClock.elapsedRealtime();
                            jvVar2.Z();
                            break;
                        case 1:
                            jv.W(evVar.n, evVar.r, true, null, null);
                            evVar.a(true, true);
                            break;
                        case 2:
                            cg.z1 z1Var = evVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = evVar.r;
                            rp rpVar = new rp(evVar, 12);
                            Pattern pattern = jv.R;
                            if (z1Var != null && tL_messages_stickerSet != null && z1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(z1Var.getCurrentAccount()).toggleStickerSet(z1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z1Var, true, true, rpVar, true);
                            }
                            evVar.a(false, true);
                            break;
                        default:
                            evVar.f.M(null, null);
                            break;
                    }
                }
            });
            addView(textView, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            float max = Math.max(f12, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(jvVar.getThemedColor(i15));
            textView2.setBackground(org.telegram.ui.ActionBar.g6.Y(jvVar.getThemedColor(i15) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bv
                public final /* synthetic */ ev b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i13;
                    ev evVar = this.b;
                    switch (i152) {
                        case 0:
                            jv jvVar2 = evVar.x;
                            jvVar2.M = SystemClock.elapsedRealtime();
                            jvVar2.Z();
                            break;
                        case 1:
                            jv.W(evVar.n, evVar.r, true, null, null);
                            evVar.a(true, true);
                            break;
                        case 2:
                            cg.z1 z1Var = evVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = evVar.r;
                            rp rpVar = new rp(evVar, 12);
                            Pattern pattern = jv.R;
                            if (z1Var != null && tL_messages_stickerSet != null && z1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(z1Var.getCurrentAccount()).toggleStickerSet(z1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z1Var, true, true, rpVar, true);
                            }
                            evVar.a(false, true);
                            break;
                        default:
                            evVar.f.M(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            f9 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        }
        c6Var = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
        y80 y80Var = new y80(context, c6Var);
        this.a = y80Var;
        y80Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        y80Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        y80Var.setEllipsize(truncateAt);
        y80Var.setSingleLine(true);
        y80Var.setLines(1);
        int i16 = org.telegram.ui.ActionBar.g6.J6;
        c6Var2 = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var2));
        y80Var.setTextColor(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.j5));
        if (z10) {
            y80Var.setTextSize(1, 20.0f);
            addView(y80Var, i7.f6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f9, 0.0f));
        } else {
            y80Var.setTextSize(1, 17.0f);
            addView(y80Var, i7.f6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f9, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, i7.f6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f9, 0.0f));
        }
        if (z10) {
            int themedColor = jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ji);
            c6Var3 = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, c6Var3);
            this.f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.f3) jvVar).backgroundPaddingLeft;
            addView(w0Var, i7.f6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i17 = 3;
            w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bv
                public final /* synthetic */ ev b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i17;
                    ev evVar = this.b;
                    switch (i152) {
                        case 0:
                            jv jvVar2 = evVar.x;
                            jvVar2.M = SystemClock.elapsedRealtime();
                            jvVar2.Z();
                            break;
                        case 1:
                            jv.W(evVar.n, evVar.r, true, null, null);
                            evVar.a(true, true);
                            break;
                        case 2:
                            cg.z1 z1Var = evVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = evVar.r;
                            rp rpVar = new rp(evVar, 12);
                            Pattern pattern = jv.R;
                            if (z1Var != null && tL_messages_stickerSet != null && z1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(z1Var.getCurrentAccount()).toggleStickerSet(z1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z1Var, true, true, rpVar, true);
                            }
                            evVar.a(false, true);
                            break;
                        default:
                            evVar.f.M(null, null);
                            break;
                    }
                }
            });
            w0Var.setDelegate(new cv(jvVar, 0));
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
            this.w.setInterpolator(jr.h);
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
