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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j30 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ e40 b;

    public j30(e40 e40Var, Activity activity) {
        this.b = e40Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        VoIPService sharedInstance;
        int x02;
        e40 e40Var = this.b;
        if (i7 == -1) {
            e40Var.onBackPressed();
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (i7 == 1) {
            e40Var.R2.b.join_muted = false;
            e40.M0(e40Var);
            return;
        }
        if (i7 == 2) {
            e40Var.R2.b.join_muted = true;
            e40.M0(e40Var);
            return;
        }
        if (i7 == 3) {
            e40Var.m1(false);
            return;
        }
        if (i7 == 12) {
            e40.N0(e40Var, true);
            return;
        }
        if (i7 == 13) {
            e40.N0(e40Var, false);
            return;
        }
        if (i7 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e40Var.getContext());
            boolean W = org.telegram.messenger.t3.W(e40Var.Q2);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            if (W) {
                u1Var.R = org.telegram.messenger.id.M0(2131743482, null);
                u1Var.T = org.telegram.messenger.id.M0(2131743483, null);
            } else {
                u1Var.R = org.telegram.messenger.id.M0(2131743381, null);
                u1Var.T = org.telegram.messenger.id.M0(2131743382, null);
            }
            u1Var.I = org.telegram.ui.ActionBar.l6.dh;
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743383, null), new c30(this));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            u1Var.j(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.ih, false));
            u1Var.show();
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.jh, null);
            }
            u1Var.p(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vg, false));
            return;
        }
        if (i7 == 9) {
            e40Var.d3.callOnClick();
            return;
        }
        int i12 = 8;
        if (i7 == 5) {
            org.telegram.messenger.r3 r3Var = e40Var.R2;
            if (!r3Var.w) {
                e30 e30Var = new e30(this, e40Var.getContext(), e40Var.Q2, e40Var.z4);
                if (e40Var.u1()) {
                    e30Var.J0(2);
                    return;
                } else {
                    e30Var.show();
                    return;
                }
            }
            boolean z9 = r3Var.b.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(e40Var.getContext());
            int i13 = org.telegram.ui.ActionBar.l6.dh;
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.I = i13;
            u1Var2.R = org.telegram.messenger.id.M0(2131743321, null);
            if (org.telegram.messenger.t3.W(e40Var.Q2)) {
                u1Var2.T = org.telegram.messenger.id.M0(2131743454, null);
            } else {
                u1Var2.T = org.telegram.messenger.id.M0(2131743322, null);
            }
            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131744841, null), new ab.y(i12, this, z9));
            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
            u1Var2.j(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.ih, false));
            u1Var2.show();
            u1Var2.p(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.bh, false));
            return;
        }
        if (i7 == 7) {
            e40Var.c2 = true;
            e40Var.l3.setVisibility(0);
            e40Var.m3.setVisibility(0);
            e40Var.e3.setVisibility(8);
            e40Var.o3.setVisibility(8);
            e40Var.p3.setVisibility(8);
            e40Var.n3.setVisibility(8);
            e40Var.i3.setVisibility(8);
            e40Var.f3.setVisibility(8);
            e40Var.j3.setVisibility(8);
            e40Var.k3.setVisibility(8);
            e40Var.b2.setVisibility(8);
            e40Var.g3.setVisibility(8);
            e40Var.h3.setVisibility(8);
            org.telegram.ui.ActionBar.r0 r0Var = e40Var.b3;
            org.telegram.ui.ActionBar.g1 g1Var = r0Var.d;
            if (g1Var == null || !g1Var.isShowing()) {
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.b;
            Point point = org.telegram.messenger.g0.q;
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.camera.q.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            r0Var.W(true, true);
            return;
        }
        if (i7 == 6) {
            e40Var.n2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(e40Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.U(e40Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e40Var.getContext());
            int i14 = org.telegram.ui.ActionBar.l6.dh;
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
            u1Var3.I = i14;
            if (org.telegram.messenger.t3.W(e40Var.Q2)) {
                u1Var3.R = org.telegram.messenger.id.M0(2131743453, null);
            } else {
                u1Var3.R = org.telegram.messenger.id.M0(2131743320, null);
            }
            u1Var3.y0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), new cy(editTextBoldCursor, i10));
            LinearLayout linearLayout = new LinearLayout(e40Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.l6.bh;
            org.telegram.ui.ActionBar.s6.U(editTextBoldCursor, i15, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = e40Var.Q2;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            org.telegram.ui.ActionBar.s6.D(editTextBoldCursor, org.telegram.ui.ActionBar.l6.ch, null);
            org.telegram.ui.ActionBar.s6.l(editTextBoldCursor, 30, i15, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new dy(alertDialog$Builder3, i10));
            editTextBoldCursor.addTextChangedListener(new fy(editTextBoldCursor, i10));
            if (!TextUtils.isEmpty(e40Var.R2.b.title)) {
                editTextBoldCursor.setText(e40Var.R2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131745946, null), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            u1Var3.j(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Tg, false));
            u1Var3.setOnShowListener(new d30(this, u1Var3, editTextBoldCursor, i11));
            u1Var3.setOnDismissListener(new ey(editTextBoldCursor, i10));
            u1Var3.show();
            u1Var3.p(org.telegram.ui.ActionBar.l6.x0(null, i15, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i7 == 8) {
            org.telegram.ui.Components.u60.K0(e40Var.getContext(), -e40Var.l1(), e40Var.k1, null, 2, e40Var.r2, new c30(this));
            return;
        }
        if (i7 == 11) {
            org.telegram.messenger.iz.I0 = !org.telegram.messenger.iz.I0;
            SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
            edit.putBoolean("noiseSupression", org.telegram.messenger.iz.I0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(org.telegram.messenger.iz.I0);
            return;
        }
        if (i7 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        org.telegram.ui.Cells.f1.t(null, 2131743499, arrayList, R.drawable.msg_voice_speaker, arrayList2);
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(org.telegram.messenger.id.M0(sharedInstance.isHeadsetPlugged() ? 2131743501 : 2131743500, null));
            arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
            arrayList3.add(1);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = org.telegram.messenger.id.M0(2131743503, null);
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
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(this.a, false, 1, null);
        h.O = org.telegram.messenger.id.M0(2131743243, null);
        h.P = true;
        og.j jVar = new og.j(i12, this, arrayList3);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = jVar;
        int i17 = org.telegram.ui.ActionBar.l6.Yg;
        h.v0(org.telegram.ui.ActionBar.l6.x0(null, i17, false));
        h.O(org.telegram.ui.ActionBar.l6.x0(null, i17, false));
        int i18 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        h.show();
        int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.bh, false);
        org.telegram.ui.ActionBar.m2 m2Var = h.l0;
        if (m2Var != null) {
            m2Var.setTextColor(x03);
        }
        for (int i19 = 0; i19 < h.w0.size(); i19++) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) h.w0.get(i19);
            if (i19 == i18) {
                x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.dh, false);
                o2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.bh, false);
            }
            o2Var.setTextColor(x02);
            o2Var.setIconColor(x02);
            int i20 = org.telegram.ui.ActionBar.l6.Vg;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i20, false), 12), 2, -1);
            org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i20, 12);
            o2Var.setBackground(h02);
            org.telegram.ui.ActionBar.s6.j(o2Var, h02, null, g10, null);
        }
    }
}
