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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h50 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ d60 b;

    public h50(d60 d60Var, Activity activity) {
        this.b = d60Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        VoIPService sharedInstance;
        int w02;
        d60 d60Var = this.b;
        if (i10 == -1) {
            d60Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            d60Var.X0.call.join_muted = false;
            d60.F0(d60Var);
            return;
        }
        if (i10 == 2) {
            d60Var.X0.call.join_muted = true;
            d60.F0(d60Var);
            return;
        }
        if (i10 == 3) {
            d60Var.j1(false);
            return;
        }
        if (i10 == 12) {
            d60.G0(d60Var, true);
            return;
        }
        if (i10 == 13) {
            d60.G0(d60Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d60Var.getContext());
            if (ChatObject.isChannelOrGiga(d60Var.W0)) {
                alertDialog$Builder.a.O = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.O = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.F = org.telegram.ui.ActionBar.k6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new b50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ug, false);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.i(w03);
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.vg, false));
            }
            d2Var.o(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hg, false));
            return;
        }
        if (i10 == 9) {
            d60Var.j1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = d60Var.X0;
            if (!call.recording) {
                d50 d50Var = new d50(this, d60Var.getContext(), d60Var.W0, d60Var.F2);
                if (d60Var.r1()) {
                    d50Var.n(2);
                    return;
                } else {
                    d50Var.show();
                    return;
                }
            }
            boolean z4 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(d60Var.getContext());
            alertDialog$Builder2.a.F = org.telegram.ui.ActionBar.k6.pg;
            alertDialog$Builder2.a.O = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(d60Var.W0)) {
                alertDialog$Builder2.a.Q = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.Q = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new jh.q(8, this, z4));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ug, false);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.i(w04);
            d2Var2.show();
            d2Var2.o(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ng, false));
            return;
        }
        if (i10 == 7) {
            d60Var.i0 = true;
            d60Var.r1.setVisibility(0);
            d60Var.s1.setVisibility(0);
            d60Var.k1.setVisibility(8);
            d60Var.u1.setVisibility(8);
            d60Var.v1.setVisibility(8);
            d60Var.t1.setVisibility(8);
            d60Var.o1.setVisibility(8);
            d60Var.l1.setVisibility(8);
            d60Var.p1.setVisibility(8);
            d60Var.q1.setVisibility(8);
            d60Var.h0.setVisibility(8);
            d60Var.m1.setVisibility(8);
            d60Var.n1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = d60Var.h1;
            org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
            if (p1Var == null || !p1Var.isShowing()) {
                return;
            }
            w0Var.b.measure(b.d(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            w0Var.O(true, true);
            return;
        }
        if (i10 == 6) {
            d60Var.t0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(d60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.S(d60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(d60Var.getContext());
            alertDialog$Builder3.a.F = org.telegram.ui.ActionBar.k6.pg;
            if (ChatObject.isChannelOrGiga(d60Var.W0)) {
                alertDialog$Builder3.a.O = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.O = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.v0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new tz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(d60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.k6.ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = d60Var.W0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, k7.c6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new uz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new wz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(d60Var.X0.call.title)) {
                editTextBoldCursor.setText(d60Var.X0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new d7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.fg, false);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
            d2Var3.i(w05);
            d2Var3.setOnShowListener(new c50(this, d2Var3, editTextBoldCursor, 0));
            d2Var3.setOnDismissListener(new vz(1, editTextBoldCursor));
            d2Var3.show();
            d2Var3.o(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.a80.u(d60Var.getContext(), -d60Var.i1(), d60Var.d, null, 2, d60Var.x0, new b50(this));
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
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(this.a, null, false, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        h3Var.bigTitle = true;
        dg.t1 t1Var = new dg.t1(8, this, arrayList3);
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = t1Var;
        int i13 = org.telegram.ui.ActionBar.k6.kg;
        h3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        int i14 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        h3Var.show();
        h3Var.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ng, false));
        for (int i15 = 0; i15 < h3Var.getItemViews().size(); i15++) {
            org.telegram.ui.ActionBar.a3 a3Var = h3Var.getItemViews().get(i15);
            if (i15 == i14) {
                w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.pg, false);
                a3Var.f = true;
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ng, false);
            }
            a3Var.setTextColor(w02);
            a3Var.setIconColor(w02);
            a3Var.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hg, false), 12), 2, -1));
        }
    }
}
