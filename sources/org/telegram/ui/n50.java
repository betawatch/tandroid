package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class n50 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ k60 b;

    public n50(k60 k60Var, Activity activity) {
        this.b = k60Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        VoIPService sharedInstance;
        int w02;
        k60 k60Var = this.b;
        if (i10 == -1) {
            k60Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            k60Var.a1.call.join_muted = false;
            k60.F0(k60Var);
            return;
        }
        if (i10 == 2) {
            k60Var.a1.call.join_muted = true;
            k60.F0(k60Var);
            return;
        }
        if (i10 == 3) {
            k60Var.j1(false);
            return;
        }
        if (i10 == 12) {
            k60.G0(k60Var, true);
            return;
        }
        if (i10 == 13) {
            k60.G0(k60Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k60Var.getContext());
            if (ChatObject.isChannelOrGiga(k60Var.Z0)) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.I = org.telegram.ui.ActionBar.j6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new h50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.i(w03);
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vg, false));
            }
            c2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hg, false));
            return;
        }
        if (i10 == 9) {
            k60Var.m1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = k60Var.a1;
            if (!call.recording) {
                j50 j50Var = new j50(this, k60Var.getContext(), k60Var.Z0, k60Var.I2);
                if (k60Var.r1()) {
                    j50Var.n(2);
                    return;
                } else {
                    j50Var.show();
                    return;
                }
            }
            boolean z10 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k60Var.getContext());
            alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.j6.pg;
            alertDialog$Builder2.a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(k60Var.Z0)) {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ai.k(10, this, z10));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ug, false);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.i(w04);
            c2Var2.show();
            c2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
            return;
        }
        if (i10 == 7) {
            k60Var.l0 = true;
            k60Var.u1.setVisibility(0);
            k60Var.v1.setVisibility(0);
            k60Var.n1.setVisibility(8);
            k60Var.x1.setVisibility(8);
            k60Var.y1.setVisibility(8);
            k60Var.w1.setVisibility(8);
            k60Var.r1.setVisibility(8);
            k60Var.o1.setVisibility(8);
            k60Var.s1.setVisibility(8);
            k60Var.t1.setVisibility(8);
            k60Var.k0.setVisibility(8);
            k60Var.p1.setVisibility(8);
            k60Var.q1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = k60Var.k1;
            org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
            if (o1Var == null || !o1Var.isShowing()) {
                return;
            }
            w0Var.b.measure(org.telegram.messenger.wl.d(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            w0Var.O(true, true);
            return;
        }
        if (i10 == 6) {
            k60Var.w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(k60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(k60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(k60Var.getContext());
            alertDialog$Builder3.a.I = org.telegram.ui.ActionBar.j6.pg;
            if (ChatObject.isChannelOrGiga(k60Var.Z0)) {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new yz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(k60Var.getContext());
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
            TLRPC.Chat chat = k60Var.Z0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new zz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new b00(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(k60Var.a1.call.title)) {
                editTextBoldCursor.setText(k60Var.a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new c7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
            c2Var3.i(w05);
            c2Var3.setOnShowListener(new i50(this, c2Var3, editTextBoldCursor, 0));
            c2Var3.setOnDismissListener(new a00(1, editTextBoldCursor));
            c2Var3.show();
            c2Var3.o(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.w70.u(k60Var.getContext(), -k60Var.i1(), k60Var.d, null, 2, k60Var.A0, new h50(this));
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
            org.telegram.ui.Cells.p6.n(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            arrayList.add(str);
            org.telegram.ui.Cells.p6.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            charSequenceArr[i12] = (CharSequence) arrayList.get(i12);
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) this.a, (org.telegram.ui.ActionBar.f6) null, false);
        g3Var.fixNavigationBar();
        g3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        g3Var.bigTitle = true;
        lg.j jVar = new lg.j(8, this, arrayList3);
        g3Var.items = charSequenceArr;
        g3Var.itemIcons = iArr;
        g3Var.onClickListener = jVar;
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
