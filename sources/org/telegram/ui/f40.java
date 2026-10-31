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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f40 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ b50 b;

    public f40(b50 b50Var, Activity activity) {
        this.b = b50Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        VoIPService sharedInstance;
        int x02;
        b50 b50Var = this.b;
        if (i10 == -1) {
            b50Var.onBackPressed();
            return;
        }
        int i11 = 1;
        int i12 = 0;
        if (i10 == 1) {
            b50Var.R2.b.join_muted = false;
            b50.M0(b50Var);
            return;
        }
        if (i10 == 2) {
            b50Var.R2.b.join_muted = true;
            b50.M0(b50Var);
            return;
        }
        if (i10 == 3) {
            b50Var.l1(false);
            return;
        }
        if (i10 == 12) {
            b50.N0(b50Var, true);
            return;
        }
        if (i10 == 13) {
            b50.N0(b50Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b50Var.getContext());
            boolean W = org.telegram.messenger.w3.W(b50Var.Q2);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            if (W) {
                x1Var.R = org.telegram.messenger.cd.L0(2131743508, null);
                x1Var.T = org.telegram.messenger.cd.L0(2131743509, null);
            } else {
                x1Var.R = org.telegram.messenger.cd.L0(2131743407, null);
                x1Var.T = org.telegram.messenger.cd.L0(2131743408, null);
            }
            x1Var.I = org.telegram.ui.ActionBar.t6.dh;
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743409, null), new z30(this));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            x1Var.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ih, false));
            x1Var.show();
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.jh, null);
            }
            x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vg, false));
            return;
        }
        int i13 = 9;
        if (i10 == 9) {
            b50Var.d3.callOnClick();
            return;
        }
        int i14 = 11;
        if (i10 == 5) {
            org.telegram.messenger.u3 u3Var = b50Var.R2;
            if (!u3Var.w) {
                b40 b40Var = new b40(this, b50Var.getContext(), b50Var.Q2, b50Var.z4);
                if (b50Var.t1()) {
                    b40Var.J0(2);
                    return;
                } else {
                    b40Var.show();
                    return;
                }
            }
            boolean z10 = u3Var.b.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b50Var.getContext());
            int i15 = org.telegram.ui.ActionBar.t6.dh;
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            x1Var2.I = i15;
            x1Var2.R = org.telegram.messenger.cd.L0(2131743347, null);
            if (org.telegram.messenger.w3.W(b50Var.Q2)) {
                x1Var2.T = org.telegram.messenger.cd.L0(2131743480, null);
            } else {
                x1Var2.T = org.telegram.messenger.cd.L0(2131743348, null);
            }
            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131744859, null), new ag.w0(i14, this, z10));
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            x1Var2.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ih, false));
            x1Var2.show();
            x1Var2.p(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bh, false));
            return;
        }
        if (i10 == 7) {
            b50Var.c2 = true;
            b50Var.l3.setVisibility(0);
            b50Var.m3.setVisibility(0);
            b50Var.e3.setVisibility(8);
            b50Var.o3.setVisibility(8);
            b50Var.p3.setVisibility(8);
            b50Var.n3.setVisibility(8);
            b50Var.i3.setVisibility(8);
            b50Var.f3.setVisibility(8);
            b50Var.j3.setVisibility(8);
            b50Var.k3.setVisibility(8);
            b50Var.b2.setVisibility(8);
            b50Var.g3.setVisibility(8);
            b50Var.h3.setVisibility(8);
            org.telegram.ui.ActionBar.t0 t0Var = b50Var.b3;
            org.telegram.ui.ActionBar.k1 k1Var = t0Var.d;
            if (k1Var == null || !k1Var.isShowing()) {
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t0Var.b;
            Point point = org.telegram.messenger.i0.q;
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.z20.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            t0Var.W(true, true);
            return;
        }
        if (i10 == 6) {
            b50Var.n2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(b50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.U(b50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(b50Var.getContext());
            int i16 = org.telegram.ui.ActionBar.t6.dh;
            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
            x1Var3.I = i16;
            if (org.telegram.messenger.w3.W(b50Var.Q2)) {
                x1Var3.R = org.telegram.messenger.cd.L0(2131743479, null);
            } else {
                x1Var3.R = org.telegram.messenger.cd.L0(2131743346, null);
            }
            x1Var3.A0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), new cz(editTextBoldCursor, i11));
            LinearLayout linearLayout = new LinearLayout(b50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i17 = org.telegram.ui.ActionBar.t6.bh;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i17, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = b50Var.Q2;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.ch, null);
            org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i17, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new dz(alertDialog$Builder3, i11));
            editTextBoldCursor.addTextChangedListener(new fz(editTextBoldCursor, i11));
            if (!TextUtils.isEmpty(b50Var.R2.b.title)) {
                editTextBoldCursor.setText(b50Var.R2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131745963, null), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            x1Var3.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Tg, false));
            x1Var3.setOnShowListener(new a40(this, x1Var3, editTextBoldCursor, i12));
            x1Var3.setOnDismissListener(new ez(editTextBoldCursor, i11));
            x1Var3.show();
            x1Var3.p(org.telegram.ui.ActionBar.t6.x0(null, i17, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.k70.K0(b50Var.getContext(), -b50Var.k1(), b50Var.k1, null, 2, b50Var.r2, new z30(this));
            return;
        }
        if (i10 == 11) {
            org.telegram.messenger.tz.I0 = !org.telegram.messenger.tz.I0;
            SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
            edit.putBoolean("noiseSupression", org.telegram.messenger.tz.I0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(org.telegram.messenger.tz.I0);
            return;
        }
        if (i10 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        org.telegram.ui.Cells.f1.t(null, 2131743525, arrayList, R.drawable.msg_voice_speaker, arrayList2);
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(org.telegram.messenger.cd.L0(sharedInstance.isHeadsetPlugged() ? 2131743527 : 2131743526, null));
            arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
            arrayList3.add(1);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = org.telegram.messenger.cd.L0(2131743529, null);
            }
            arrayList.add(str);
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_bluetooth));
            arrayList3.add(2);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i18 = 0; i18 < size; i18++) {
            charSequenceArr[i18] = (CharSequence) arrayList.get(i18);
            iArr[i18] = ((Integer) arrayList2.get(i18)).intValue();
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(this.a, false, 1, null);
        h.O = org.telegram.messenger.cd.L0(2131743269, null);
        h.P = true;
        eg.j jVar = new eg.j(i13, this, arrayList3);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = jVar;
        int i19 = org.telegram.ui.ActionBar.t6.Yg;
        h.v0(org.telegram.ui.ActionBar.t6.x0(null, i19, false));
        h.P(org.telegram.ui.ActionBar.t6.x0(null, i19, false));
        int i20 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        h.show();
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bh, false);
        org.telegram.ui.ActionBar.q2 q2Var = h.l0;
        if (q2Var != null) {
            q2Var.setTextColor(x03);
        }
        for (int i21 = 0; i21 < h.w0.size(); i21++) {
            org.telegram.ui.ActionBar.s2 s2Var = (org.telegram.ui.ActionBar.s2) h.w0.get(i21);
            if (i21 == i20) {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.dh, false);
                s2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bh, false);
            }
            s2Var.setTextColor(x02);
            s2Var.setIconColor(x02);
            int i22 = org.telegram.ui.ActionBar.t6.Vg;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i22, false), 12), 2, -1);
            org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i22, 12);
            s2Var.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(s2Var, h02, null, h10, null);
        }
    }
}
