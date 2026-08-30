package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g50 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ c60 b;

    public g50(c60 c60Var, Activity activity) {
        this.b = c60Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        VoIPService sharedInstance;
        int w02;
        c60 c60Var = this.b;
        if (i10 == -1) {
            c60Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            c60Var.X0.call.join_muted = false;
            c60.F0(c60Var);
            return;
        }
        if (i10 == 2) {
            c60Var.X0.call.join_muted = true;
            c60.F0(c60Var);
            return;
        }
        if (i10 == 3) {
            c60Var.j1(false);
            return;
        }
        if (i10 == 12) {
            c60.G0(c60Var, true);
            return;
        }
        if (i10 == 13) {
            c60.G0(c60Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c60Var.getContext());
            if (ChatObject.isChannelOrGiga(c60Var.W0)) {
                alertDialog$Builder.a.O = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.O = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.F = org.telegram.ui.ActionBar.j6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new a50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.i(w03);
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vg, false));
            }
            d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hg, false));
            return;
        }
        if (i10 == 9) {
            c60Var.j1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = c60Var.X0;
            if (!call.recording) {
                c50 c50Var = new c50(this, c60Var.getContext(), c60Var.W0, c60Var.F2);
                if (c60Var.r1()) {
                    c50Var.n(2);
                    return;
                } else {
                    c50Var.show();
                    return;
                }
            }
            boolean z4 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(c60Var.getContext());
            alertDialog$Builder2.a.F = org.telegram.ui.ActionBar.j6.pg;
            alertDialog$Builder2.a.O = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(c60Var.W0)) {
                alertDialog$Builder2.a.Q = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.Q = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ih.q(8, this, z4));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.i(w04);
            d2Var2.show();
            d2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
            return;
        }
        if (i10 == 7) {
            c60Var.i0 = true;
            c60Var.r1.setVisibility(0);
            c60Var.s1.setVisibility(0);
            c60Var.k1.setVisibility(8);
            c60Var.u1.setVisibility(8);
            c60Var.v1.setVisibility(8);
            c60Var.t1.setVisibility(8);
            c60Var.o1.setVisibility(8);
            c60Var.l1.setVisibility(8);
            c60Var.p1.setVisibility(8);
            c60Var.q1.setVisibility(8);
            c60Var.h0.setVisibility(8);
            c60Var.m1.setVisibility(8);
            c60Var.n1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = c60Var.h1;
            org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
            if (p1Var == null || !p1Var.isShowing()) {
                return;
            }
            w0Var.b.measure(b.d(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            w0Var.O(true, true);
            return;
        }
        if (i10 == 6) {
            c60Var.t0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(c60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(c60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(c60Var.getContext());
            alertDialog$Builder3.a.F = org.telegram.ui.ActionBar.j6.pg;
            if (ChatObject.isChannelOrGiga(c60Var.W0)) {
                alertDialog$Builder3.a.O = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.O = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.v0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new sz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(c60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.j6.ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = c60Var.W0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, k7.b6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new tz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new vz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(c60Var.X0.call.title)) {
                editTextBoldCursor.setText(c60Var.X0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new d7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
            d2Var3.i(w05);
            d2Var3.setOnShowListener(new b50(this, d2Var3, editTextBoldCursor, 0));
            d2Var3.setOnDismissListener(new uz(1, editTextBoldCursor));
            d2Var3.show();
            d2Var3.o(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.y70.u(c60Var.getContext(), -c60Var.i1(), c60Var.d, null, 2, c60Var.x0, new a50(this));
            return;
        }
        if (i10 == 11) {
            SharedConfig.toggleNoiseSupression();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            return;
        }
        if (i10 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
        arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(LocaleController.getString(sharedInstance.isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
            b.h(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            arrayList.add(str);
            b.h(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            charSequenceArr[i12] = (CharSequence) arrayList.get(i12);
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(this.a, null, false, false);
        g3Var.fixNavigationBar();
        g3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        g3Var.bigTitle = true;
        cg.u1 u1Var = new cg.u1(8, this, arrayList3);
        g3Var.items = charSequenceArr;
        g3Var.itemIcons = iArr;
        g3Var.onClickListener = u1Var;
        int i13 = org.telegram.ui.ActionBar.j6.kg;
        g3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        g3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i14 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        g3Var.show();
        g3Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
        for (int i15 = 0; i15 < g3Var.getItemViews().size(); i15++) {
            org.telegram.ui.ActionBar.z2 z2Var = g3Var.getItemViews().get(i15);
            if (i15 == i14) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false);
                z2Var.f = true;
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false);
            }
            z2Var.setTextColor(w02);
            z2Var.setIconColor(w02);
            z2Var.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hg, false), 12), 2, -1));
        }
    }
}
