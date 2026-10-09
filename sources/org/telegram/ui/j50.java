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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ g60 b;

    public j50(g60 g60Var, Activity activity) {
        this.b = g60Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        VoIPService sharedInstance;
        int x02;
        g60 g60Var = this.b;
        if (i10 == -1) {
            g60Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            g60Var.a1.call.join_muted = false;
            g60.G0(g60Var);
            return;
        }
        if (i10 == 2) {
            g60Var.a1.call.join_muted = true;
            g60.G0(g60Var);
            return;
        }
        if (i10 == 3) {
            g60Var.k1(false);
            return;
        }
        if (i10 == 12) {
            g60.H0(g60Var, true);
            return;
        }
        if (i10 == 13) {
            g60.H0(g60Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g60Var.getContext());
            if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.I = org.telegram.ui.ActionBar.i6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new d50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ug, false);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.i(x03);
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.vg, false));
            }
            b2Var.o(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hg, false));
            return;
        }
        if (i10 == 9) {
            g60Var.m1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = g60Var.a1;
            if (!call.recording) {
                f50 f50Var = new f50(this, g60Var.getContext(), g60Var.Z0, g60Var.I2);
                if (g60Var.s1()) {
                    f50Var.p(2);
                    return;
                } else {
                    f50Var.show();
                    return;
                }
            }
            boolean z10 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g60Var.getContext());
            alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.i6.pg;
            alertDialog$Builder2.a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ai.k(11, this, z10));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ug, false);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.i(x04);
            b2Var2.show();
            b2Var2.o(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ng, false));
            return;
        }
        if (i10 == 7) {
            g60Var.l0 = true;
            g60Var.u1.setVisibility(0);
            g60Var.v1.setVisibility(0);
            g60Var.n1.setVisibility(8);
            g60Var.x1.setVisibility(8);
            g60Var.y1.setVisibility(8);
            g60Var.w1.setVisibility(8);
            g60Var.r1.setVisibility(8);
            g60Var.o1.setVisibility(8);
            g60Var.s1.setVisibility(8);
            g60Var.t1.setVisibility(8);
            g60Var.k0.setVisibility(8);
            g60Var.p1.setVisibility(8);
            g60Var.q1.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0Var = g60Var.k1;
            org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
            if (n1Var == null || !n1Var.isShowing()) {
                return;
            }
            v0Var.b.measure(org.telegram.messenger.bi.c(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            v0Var.O(true, true);
            return;
        }
        if (i10 == 6) {
            g60Var.w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(g60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.T(g60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g60Var.getContext());
            alertDialog$Builder3.a.I = org.telegram.ui.ActionBar.i6.pg;
            if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new wz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(g60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.i6.ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = g60Var.Z0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
            int i12 = 1;
            editTextBoldCursor.setOnEditorActionListener(new xz(alertDialog$Builder3, i12));
            editTextBoldCursor.addTextChangedListener(new zz(i12, editTextBoldCursor));
            if (!TextUtils.isEmpty(g60Var.a1.call.title)) {
                editTextBoldCursor.setText(g60Var.a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.fg, false);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
            b2Var3.i(x05);
            b2Var3.setOnShowListener(new e50(this, b2Var3, editTextBoldCursor, 0));
            b2Var3.setOnDismissListener(new yz(1, editTextBoldCursor));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.y80.w(g60Var.getContext(), -g60Var.j1(), g60Var.d, null, 2, g60Var.A0, new d50(this));
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
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.a, (org.telegram.ui.ActionBar.e6) null, false);
        f3Var.fixNavigationBar();
        f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        f3Var.bigTitle = true;
        lg.j jVar = new lg.j(8, this, arrayList3);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = jVar;
        int i14 = org.telegram.ui.ActionBar.i6.kg;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        int i15 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        f3Var.show();
        f3Var.setTitleColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ng, false));
        for (int i16 = 0; i16 < f3Var.getItemViews().size(); i16++) {
            org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i16);
            if (i16 == i15) {
                x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.pg, false);
                y2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ng, false);
            }
            y2Var.setTextColor(x02);
            y2Var.setIconColor(x02);
            y2Var.setBackground(org.telegram.ui.ActionBar.i6.g0(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hg, false), 12), 2, -1));
        }
    }
}
