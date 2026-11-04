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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c30 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ x30 b;

    public c30(x30 x30Var, Activity activity) {
        this.b = x30Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        VoIPService sharedInstance;
        int x02;
        x30 x30Var = this.b;
        if (i3 == -1) {
            x30Var.onBackPressed();
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (i3 == 1) {
            x30Var.S2.b.join_muted = false;
            x30.M0(x30Var);
            return;
        }
        if (i3 == 2) {
            x30Var.S2.b.join_muted = true;
            x30.M0(x30Var);
            return;
        }
        if (i3 == 3) {
            x30Var.l1(false);
            return;
        }
        if (i3 == 12) {
            x30.N0(x30Var, true);
            return;
        }
        if (i3 == 13) {
            x30.N0(x30Var, false);
            return;
        }
        if (i3 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x30Var.getContext());
            boolean W = org.telegram.messenger.t3.W(x30Var.R2);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            if (W) {
                s1Var.S = org.telegram.messenger.bd.M0(2131743492, null);
                s1Var.U = org.telegram.messenger.bd.M0(2131743493, null);
            } else {
                s1Var.S = org.telegram.messenger.bd.M0(2131743391, null);
                s1Var.U = org.telegram.messenger.bd.M0(2131743392, null);
            }
            s1Var.J = org.telegram.ui.ActionBar.k6.dh;
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743393, null), new v20(this));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ih, false));
            s1Var.show();
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.jh, null);
            }
            s1Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false));
            return;
        }
        if (i3 == 9) {
            x30Var.e3.callOnClick();
            return;
        }
        int i12 = 11;
        if (i3 == 5) {
            org.telegram.messenger.r3 r3Var = x30Var.S2;
            if (!r3Var.w) {
                x20 x20Var = new x20(this, x30Var.getContext(), x30Var.R2, x30Var.A4);
                if (x30Var.t1()) {
                    x20Var.J0(2);
                    return;
                } else {
                    x20Var.show();
                    return;
                }
            }
            boolean z10 = r3Var.b.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x30Var.getContext());
            int i13 = org.telegram.ui.ActionBar.k6.dh;
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
            s1Var2.J = i13;
            s1Var2.S = org.telegram.messenger.bd.M0(2131743331, null);
            if (org.telegram.messenger.t3.W(x30Var.R2)) {
                s1Var2.U = org.telegram.messenger.bd.M0(2131743464, null);
            } else {
                s1Var2.U = org.telegram.messenger.bd.M0(2131743332, null);
            }
            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131744851, null), new ei.f(i12, this, z10));
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s1Var2.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ih, false));
            s1Var2.show();
            s1Var2.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bh, false));
            return;
        }
        int i14 = 7;
        if (i3 == 7) {
            x30Var.d2 = true;
            x30Var.m3.setVisibility(0);
            x30Var.n3.setVisibility(0);
            x30Var.f3.setVisibility(8);
            x30Var.p3.setVisibility(8);
            x30Var.q3.setVisibility(8);
            x30Var.o3.setVisibility(8);
            x30Var.j3.setVisibility(8);
            x30Var.g3.setVisibility(8);
            x30Var.k3.setVisibility(8);
            x30Var.l3.setVisibility(8);
            x30Var.c2.setVisibility(8);
            x30Var.h3.setVisibility(8);
            x30Var.i3.setVisibility(8);
            org.telegram.ui.ActionBar.q0 q0Var = x30Var.c3;
            org.telegram.ui.ActionBar.f1 f1Var = q0Var.d;
            if (f1Var == null || !f1Var.isShowing()) {
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.b;
            Point point = org.telegram.messenger.g0.q;
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.camera.q.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            q0Var.W(true, true);
            return;
        }
        if (i3 == 6) {
            x30Var.o2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(x30Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.U(x30Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(x30Var.getContext());
            int i15 = org.telegram.ui.ActionBar.k6.dh;
            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
            s1Var3.J = i15;
            if (org.telegram.messenger.t3.W(x30Var.R2)) {
                s1Var3.S = org.telegram.messenger.bd.M0(2131743463, null);
            } else {
                s1Var3.S = org.telegram.messenger.bd.M0(2131743330, null);
            }
            s1Var3.B0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), new vx(editTextBoldCursor, i10));
            LinearLayout linearLayout = new LinearLayout(x30Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i16 = org.telegram.ui.ActionBar.k6.bh;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i16, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = x30Var.R2;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.ch, null);
            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i16, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, b8.mf.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new wx(alertDialog$Builder3, i10));
            editTextBoldCursor.addTextChangedListener(new yx(editTextBoldCursor, i10));
            if (!TextUtils.isEmpty(x30Var.S2.b.title)) {
                editTextBoldCursor.setText(x30Var.S2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131745956, null), new b7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            s1Var3.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false));
            s1Var3.setOnShowListener(new w20(this, s1Var3, editTextBoldCursor, i11));
            s1Var3.setOnDismissListener(new xx(editTextBoldCursor, i10));
            s1Var3.show();
            s1Var3.p(org.telegram.ui.ActionBar.k6.x0(null, i16, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i3 == 8) {
            org.telegram.ui.Components.o60.K0(x30Var.getContext(), -x30Var.k1(), x30Var.l1, null, 2, x30Var.s2, new v20(this));
            return;
        }
        if (i3 == 11) {
            org.telegram.messenger.az.I0 = !org.telegram.messenger.az.I0;
            SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
            edit.putBoolean("noiseSupression", org.telegram.messenger.az.I0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(org.telegram.messenger.az.I0);
            return;
        }
        if (i3 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        org.telegram.ui.Cells.f1.x(null, 2131743509, arrayList, R.drawable.msg_voice_speaker, arrayList2);
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(org.telegram.messenger.bd.M0(sharedInstance.isHeadsetPlugged() ? 2131743511 : 2131743510, null));
            arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
            arrayList3.add(1);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = org.telegram.messenger.bd.M0(2131743513, null);
            }
            arrayList.add(str);
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_bluetooth));
            arrayList3.add(2);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            charSequenceArr[i17] = (CharSequence) arrayList.get(i17);
            iArr[i17] = ((Integer) arrayList2.get(i17)).intValue();
        }
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(this.a, false, 1, null);
        h.P = org.telegram.messenger.bd.M0(2131743253, null);
        h.Q = true;
        u uVar = new u(i14, this, arrayList3);
        h.M = charSequenceArr;
        h.N = iArr;
        h.L = uVar;
        int i18 = org.telegram.ui.ActionBar.k6.Yg;
        h.v0(org.telegram.ui.ActionBar.k6.x0(null, i18, false));
        h.O(org.telegram.ui.ActionBar.k6.x0(null, i18, false));
        int i19 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        h.show();
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bh, false);
        org.telegram.ui.ActionBar.k2 k2Var = h.m0;
        if (k2Var != null) {
            k2Var.setTextColor(x03);
        }
        for (int i20 = 0; i20 < h.x0.size(); i20++) {
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) h.x0.get(i20);
            if (i20 == i19) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.dh, false);
                m2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bh, false);
            }
            m2Var.setTextColor(x02);
            m2Var.setIconColor(x02);
            int i21 = org.telegram.ui.ActionBar.k6.Vg;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i21, false), 12), 2, -1);
            org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i21, 12);
            m2Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(m2Var, h02, null, h7, null);
        }
    }
}
