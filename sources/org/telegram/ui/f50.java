package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.Components.c40 {
    public final /* synthetic */ j50 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f50(j50 j50Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        this.n = j50Var;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.fg, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(this, context);
        this.containerView = x30Var;
        x30Var.setWillNotDraw(false);
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
        org.telegram.messenger.q.m(20.0f, -1, 1, textView);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView, w7.x5.a(-2.0f, 24.0f, 29.0f, 24.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView2, w7.x5.a(-2.0f, 24.0f, 62.0f, 24.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
        this.e = new TextView[3];
        z4.g gVar = new z4.g(context);
        this.b = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new org.telegram.ui.Components.b40(this));
        gVar.setPageMargin(0);
        this.containerView.addView(gVar, w7.x5.a(-1.0f, 0.0f, 100.0f, 0.0f, 130.0f, -1, 1));
        gVar.b(new org.telegram.ui.Components.y30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.containerView.addView(view, w7.x5.a(-1.0f, 0.0f, 100.0f, 0.0f, 130.0f, 120, 51));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.containerView.addView(view2, w7.x5.a(-1.0f, 0.0f, 100.0f, 0.0f, 130.0f, 120, 53));
        org.telegram.ui.Components.z30 z30Var = new org.telegram.ui.Components.z30(this, getContext());
        this.c = z30Var;
        z30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        z30Var.setTag(-1);
        z30Var.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.i6.ng;
        z30Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        z30Var.setGravity(17);
        z30Var.setTypeface(AndroidUtilities.bold());
        z30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i11, false), 76);
        z30Var.setForeground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, k10, k10));
        z30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        z30Var.setOnClickListener(new org.telegram.ui.Components.f0(this, 22));
        this.containerView.addView(z30Var, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 80));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, w7.x5.e(-2, 64, 80));
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
            this.d.addView(this.e[i12], w7.x5.n(-2, -1));
            if (i12 == 0) {
                this.e[i12].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i12 == 1) {
                this.e[i12].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.e[i12].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.e[i12].setOnClickListener(new ci.m4(this, i12, 9));
            i12++;
        }
        if (z10) {
            this.b.setCurrentItem(1);
        }
    }

    public final void p(int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.I = org.telegram.ui.ActionBar.i6.pg;
        g60 g60Var = this.n.b;
        g60Var.w0 = false;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            alertDialog$Builder.a.T = LocaleController.getString(g60Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText);
        } else if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
            alertDialog$Builder.a.T = LocaleController.getString(g60Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipChannelStartRecordingVideoText);
        } else {
            alertDialog$Builder.a.T = LocaleController.getString(g60Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipGroupStartRecordingVideoText);
        }
        alertDialog$Builder.a.y0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.U(getContext(), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.nh, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.i6.ng;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.og, false));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new xz(alertDialog$Builder, 2));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.fg, false);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.i(x02);
        b2Var.setOnShowListener(new e50(this, b2Var, editTextBoldCursor, 1));
        b2Var.setOnDismissListener(new yz(2, editTextBoldCursor));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new gg.c2(this, editTextBoldCursor, i10, 11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wz(2, editTextBoldCursor));
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ug, false);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        b2Var2.i(x03);
        b2Var2.show();
        b2Var2.o(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        editTextBoldCursor.requestFocus();
    }
}
