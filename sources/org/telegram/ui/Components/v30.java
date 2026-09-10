package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class v30 extends org.telegram.ui.ActionBar.h3 {
    public final z4.g b;
    public final s30 c;
    public final LinearLayout d;
    public final TextView[] e;
    public float f;
    public int h;

    public v30(Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        q30 q30Var = new q30(this, context);
        this.containerView = q30Var;
        q30Var.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setBackgroundDrawable(this.shadowDrawable);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        TextView textView = new TextView(getContext());
        if (ChatObject.isChannelOrGiga(chat)) {
            textView.setText(LocaleController.getString(R.string.VoipChannelRecordVoiceChat));
        } else {
            textView.setText(LocaleController.getString(R.string.VoipRecordVoiceChat));
        }
        org.telegram.messenger.a2.q(textView, -1, 1, 20.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView2, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.e = new TextView[3];
        z4.g gVar = new z4.g(context);
        this.b = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new u30(this));
        gVar.setPageMargin(0);
        this.containerView.addView(gVar, w7.a6.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gVar.b(new r30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        this.containerView.addView(view, w7.a6.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w02}));
        this.containerView.addView(view2, w7.a6.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        s30 s30Var = new s30(this, getContext());
        this.c = s30Var;
        s30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        s30Var.setTag(-1);
        s30Var.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.j6.ng;
        s30Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        s30Var.setGravity(17);
        s30Var.setTypeface(AndroidUtilities.bold());
        s30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 76);
            s30Var.setForeground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        s30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        s30Var.setOnClickListener(new h0(this, 23));
        this.containerView.addView(s30Var, w7.a6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, w7.a6.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.e;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.e[i12].setTextSize(1, 12.0f);
            this.e[i12].setTextColor(-1);
            this.e[i12].setTypeface(AndroidUtilities.bold());
            this.e[i12].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.e[i12].setGravity(16);
            this.e[i12].setSingleLine(true);
            this.d.addView(this.e[i12], w7.a6.n(-2, -1));
            if (i12 == 0) {
                this.e[i12].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i12 == 1) {
                this.e[i12].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.e[i12].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.e[i12].setOnClickListener(new bi.j5(this, i12, 9));
            i12++;
        }
        if (z10) {
            this.b.setCurrentItem(1);
        }
    }

    public static void m(v30 v30Var) {
        TextView[] textViewArr = v30Var.e;
        int i10 = v30Var.h;
        TextView textView = textViewArr[i10];
        TextView textView2 = i10 < textViewArr.length + (-1) ? textViewArr[i10 + 1] : null;
        v30Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (v30Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * v30Var.f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = v30Var.h;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = v30Var.f;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = v30Var.f;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        v30Var.d.setTranslationX(measuredWidth2);
        v30Var.c.invalidate();
    }

    public abstract void n(int i10);
}
