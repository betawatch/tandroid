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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q50 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ n60 b;

    public q50(n60 n60Var, Activity activity) {
        this.b = n60Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        VoIPService sharedInstance;
        int x02;
        n60 n60Var = this.b;
        if (i10 == -1) {
            n60Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            n60Var.a1.call.join_muted = false;
            n60.G0(n60Var);
            return;
        }
        if (i10 == 2) {
            n60Var.a1.call.join_muted = true;
            n60.G0(n60Var);
            return;
        }
        if (i10 == 3) {
            n60Var.k1(false);
            return;
        }
        if (i10 == 12) {
            n60.H0(n60Var, true);
            return;
        }
        if (i10 == 13) {
            n60.H0(n60Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n60Var.getContext());
            if (ChatObject.isChannelOrGiga(n60Var.Z0)) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.I = org.telegram.ui.ActionBar.g6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new k50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ug, false);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.i(x03);
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.vg, false));
            }
            a2Var.o(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hg, false));
            return;
        }
        if (i10 == 9) {
            n60Var.m1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = n60Var.a1;
            if (!call.recording) {
                m50 m50Var = new m50(this, n60Var.getContext(), n60Var.Z0, n60Var.I2);
                if (n60Var.s1()) {
                    m50Var.o(2);
                    return;
                } else {
                    m50Var.show();
                    return;
                }
            }
            boolean z10 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n60Var.getContext());
            alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.g6.pg;
            alertDialog$Builder2.a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(n60Var.Z0)) {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new bi.h(11, this, z10));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ug, false);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.a;
            a2Var2.i(x04);
            a2Var2.show();
            a2Var2.o(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ng, false));
            return;
        }
        if (i10 == 7) {
            n60Var.l0 = true;
            n60Var.u1.setVisibility(0);
            n60Var.v1.setVisibility(0);
            n60Var.n1.setVisibility(8);
            n60Var.x1.setVisibility(8);
            n60Var.y1.setVisibility(8);
            n60Var.w1.setVisibility(8);
            n60Var.r1.setVisibility(8);
            n60Var.o1.setVisibility(8);
            n60Var.s1.setVisibility(8);
            n60Var.t1.setVisibility(8);
            n60Var.k0.setVisibility(8);
            n60Var.p1.setVisibility(8);
            n60Var.q1.setVisibility(8);
            org.telegram.ui.ActionBar.u0 u0Var = n60Var.k1;
            org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
            if (m1Var == null || !m1Var.isShowing()) {
                return;
            }
            u0Var.b.measure(org.telegram.messenger.sk.c(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            u0Var.O(true, true);
            return;
        }
        if (i10 == 6) {
            n60Var.w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(n60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.T(n60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(n60Var.getContext());
            alertDialog$Builder3.a.I = org.telegram.ui.ActionBar.g6.pg;
            if (ChatObject.isChannelOrGiga(n60Var.Z0)) {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new b00(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(n60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.g6.ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = n60Var.Z0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
            int i12 = 1;
            editTextBoldCursor.setOnEditorActionListener(new c00(alertDialog$Builder3, i12));
            editTextBoldCursor.addTextChangedListener(new e00(i12, editTextBoldCursor));
            if (!TextUtils.isEmpty(n60Var.a1.call.title)) {
                editTextBoldCursor.setText(n60Var.a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new f7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fg, false);
            org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.a;
            a2Var3.i(x05);
            a2Var3.setOnShowListener(new l50(this, a2Var3, editTextBoldCursor, 0));
            a2Var3.setOnDismissListener(new d00(1, editTextBoldCursor));
            a2Var3.show();
            a2Var3.o(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.v80.w(n60Var.getContext(), -n60Var.j1(), n60Var.d, null, 2, n60Var.A0, new k50(this));
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
            org.telegram.ui.Cells.c1.k(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            arrayList.add(str);
            org.telegram.ui.Cells.c1.k(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            charSequenceArr[i13] = (CharSequence) arrayList.get(i13);
            iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) this.a, (org.telegram.ui.ActionBar.c6) null, false);
        e3Var.fixNavigationBar();
        e3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        e3Var.bigTitle = true;
        mg.j jVar = new mg.j(8, this, arrayList3);
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = jVar;
        int i14 = org.telegram.ui.ActionBar.g6.kg;
        e3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        int i15 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        e3Var.show();
        e3Var.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ng, false));
        for (int i16 = 0; i16 < e3Var.getItemViews().size(); i16++) {
            org.telegram.ui.ActionBar.x2 x2Var = e3Var.getItemViews().get(i16);
            if (i16 == i15) {
                x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.pg, false);
                x2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ng, false);
            }
            x2Var.setTextColor(x02);
            x2Var.setIconColor(x02);
            x2Var.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hg, false), 12), 2, -1));
        }
    }
}
