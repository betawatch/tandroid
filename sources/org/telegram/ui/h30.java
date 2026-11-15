package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h30 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ c40 b;

    public h30(c40 c40Var, Activity activity) {
        this.b = c40Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        VoIPService sharedInstance;
        int x02;
        c40 c40Var = this.b;
        if (i7 == -1) {
            c40Var.onBackPressed();
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (i7 == 1) {
            c40Var.V2.b.join_muted = false;
            c40.M0(c40Var);
            return;
        }
        if (i7 == 2) {
            c40Var.V2.b.join_muted = true;
            c40.M0(c40Var);
            return;
        }
        if (i7 == 3) {
            c40Var.m1(false);
            return;
        }
        if (i7 == 12) {
            c40.N0(c40Var, true);
            return;
        }
        if (i7 == 13) {
            c40.N0(c40Var, false);
            return;
        }
        if (i7 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c40Var.getContext());
            boolean W = org.telegram.messenger.t3.W(c40Var.U2);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            if (W) {
                t1Var.S = org.telegram.messenger.hd.M0(2131743482, null);
                t1Var.U = org.telegram.messenger.hd.M0(2131743483, null);
            } else {
                t1Var.S = org.telegram.messenger.hd.M0(2131743381, null);
                t1Var.U = org.telegram.messenger.hd.M0(2131743382, null);
            }
            t1Var.J = org.telegram.ui.ActionBar.j6.gh;
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743383, null), new b30(this));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            t1Var.j(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.lh, false));
            t1Var.show();
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.mh, null);
            }
            t1Var.p(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yg, false));
            return;
        }
        if (i7 == 9) {
            c40Var.h3.callOnClick();
            return;
        }
        int i12 = 8;
        if (i7 == 5) {
            org.telegram.messenger.r3 r3Var = c40Var.V2;
            if (!r3Var.w) {
                d30 d30Var = new d30(this, c40Var.getContext(), c40Var.U2, c40Var.H4);
                if (c40Var.u1()) {
                    d30Var.J0(2);
                    return;
                } else {
                    d30Var.show();
                    return;
                }
            }
            boolean z10 = r3Var.b.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(c40Var.getContext());
            int i13 = org.telegram.ui.ActionBar.j6.gh;
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.J = i13;
            t1Var2.S = org.telegram.messenger.hd.M0(2131743321, null);
            if (org.telegram.messenger.t3.W(c40Var.U2)) {
                t1Var2.U = org.telegram.messenger.hd.M0(2131743454, null);
            } else {
                t1Var2.U = org.telegram.messenger.hd.M0(2131743322, null);
            }
            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131744841, null), new ab.z(i12, this, z10));
            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            t1Var2.j(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.lh, false));
            t1Var2.show();
            t1Var2.p(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.eh, false));
            return;
        }
        if (i7 == 7) {
            c40Var.g2 = true;
            c40Var.t3.setVisibility(0);
            c40Var.u3.setVisibility(0);
            c40Var.i3.setVisibility(8);
            c40Var.w3.setVisibility(8);
            c40Var.x3.setVisibility(8);
            c40Var.v3.setVisibility(8);
            c40Var.q3.setVisibility(8);
            c40Var.j3.setVisibility(8);
            c40Var.r3.setVisibility(8);
            c40Var.s3.setVisibility(8);
            c40Var.f2.setVisibility(8);
            c40Var.k3.setVisibility(8);
            c40Var.l3.setVisibility(8);
            c40Var.m3.setVisibility(8);
            org.telegram.ui.ActionBar.q0 q0Var = c40Var.f3;
            org.telegram.ui.ActionBar.g1 g1Var = q0Var.d;
            if (g1Var == null || !g1Var.isShowing()) {
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.b;
            Point point = org.telegram.messenger.g0.q;
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.i20.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            q0Var.X(true, true);
            return;
        }
        if (i7 == 6) {
            c40Var.r2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(c40Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.U(c40Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(c40Var.getContext());
            int i14 = org.telegram.ui.ActionBar.j6.gh;
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
            t1Var3.J = i14;
            if (org.telegram.messenger.t3.W(c40Var.U2)) {
                t1Var3.S = org.telegram.messenger.hd.M0(2131743453, null);
            } else {
                t1Var3.S = org.telegram.messenger.hd.M0(2131743320, null);
            }
            t1Var3.z0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), new ay(editTextBoldCursor, i10));
            LinearLayout linearLayout = new LinearLayout(c40Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.j6.eh;
            org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i15, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = c40Var.U2;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            org.telegram.ui.ActionBar.q6.D(editTextBoldCursor, org.telegram.ui.ActionBar.j6.fh, null);
            org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, i15, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, c8.ja.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new cy(alertDialog$Builder3, i10));
            editTextBoldCursor.addTextChangedListener(new ey(editTextBoldCursor, i10));
            if (!TextUtils.isEmpty(c40Var.V2.b.title)) {
                editTextBoldCursor.setText(c40Var.V2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131745946, null), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            t1Var3.j(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Wg, false));
            t1Var3.setOnShowListener(new c30(this, t1Var3, editTextBoldCursor, i11));
            t1Var3.setOnDismissListener(new dy(editTextBoldCursor, i10));
            t1Var3.show();
            t1Var3.p(org.telegram.ui.ActionBar.j6.x0(null, i15, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i7 == 8) {
            org.telegram.ui.Components.v60.K0(c40Var.getContext(), -c40Var.l1(), c40Var.o1, null, 2, c40Var.v2, new b30(this));
            return;
        }
        if (i7 == 14) {
            org.telegram.messenger.np.e1().edit().putBoolean("asr_live_captions", !ai.o2.a()).apply();
            c40Var.Q1(true);
            c40Var.P1();
            return;
        }
        if (i7 == 11) {
            org.telegram.messenger.gz.I0 = !org.telegram.messenger.gz.I0;
            SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
            edit.putBoolean("noiseSupression", org.telegram.messenger.gz.I0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(org.telegram.messenger.gz.I0);
            return;
        }
        if (i7 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        org.telegram.ui.Cells.y0.s(null, 2131743499, arrayList, R.drawable.msg_voice_speaker, arrayList2);
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(org.telegram.messenger.hd.M0(sharedInstance.isHeadsetPlugged() ? 2131743501 : 2131743500, null));
            arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
            arrayList3.add(1);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = org.telegram.messenger.hd.M0(2131743503, null);
            }
            arrayList.add(str);
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_bluetooth));
            arrayList3.add(2);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i16 = 0; i16 < size; i16++) {
            charSequenceArr[i16] = (CharSequence) arrayList.get(i16);
            iArr[i16] = ((Integer) arrayList2.get(i16)).intValue();
        }
        org.telegram.ui.ActionBar.u2 i17 = org.telegram.messenger.i20.i(this.a, false, 1, null);
        i17.P = org.telegram.messenger.hd.M0(2131743243, null);
        i17.Q = true;
        og.j jVar = new og.j(i12, this, arrayList3);
        i17.M = charSequenceArr;
        i17.N = iArr;
        i17.L = jVar;
        int i18 = org.telegram.ui.ActionBar.j6.bh;
        i17.v0(org.telegram.ui.ActionBar.j6.x0(null, i18, false));
        i17.P(org.telegram.ui.ActionBar.j6.x0(null, i18, false));
        int i19 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        i17.show();
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.eh, false);
        org.telegram.ui.ActionBar.l2 l2Var = i17.m0;
        if (l2Var != null) {
            l2Var.setTextColor(x03);
        }
        for (int i20 = 0; i20 < i17.x0.size(); i20++) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) i17.x0.get(i20);
            if (i20 == i19) {
                x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.gh, false);
                n2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.eh, false);
            }
            n2Var.setTextColor(x02);
            n2Var.setIconColor(x02);
            int i21 = org.telegram.ui.ActionBar.j6.Yg;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i21, false), 12), 2, -1);
            org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i21, 12);
            n2Var.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(n2Var, h02, null, g10, null);
        }
    }
}
