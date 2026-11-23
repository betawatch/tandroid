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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        org.telegram.ui.ActionBar.y0 y0Var = e40Var.m3;
        if (i7 == -1) {
            e40Var.onBackPressed();
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (i7 == 1) {
            e40Var.V2.b.join_muted = false;
            e40.N0(e40Var);
            return;
        }
        if (i7 == 2) {
            e40Var.V2.b.join_muted = true;
            e40.N0(e40Var);
            return;
        }
        if (i7 == 3) {
            e40Var.n1(false);
            return;
        }
        if (i7 == 12) {
            e40.O0(e40Var, true);
            return;
        }
        if (i7 == 13) {
            e40.O0(e40Var, false);
            return;
        }
        if (i7 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e40Var.getContext());
            boolean W = org.telegram.messenger.v3.W(e40Var.U2);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            if (W) {
                t1Var.S = org.telegram.messenger.gd.N0(2131743232, null);
                t1Var.U = org.telegram.messenger.gd.N0(2131743233, null);
            } else {
                t1Var.S = org.telegram.messenger.gd.N0(2131743131, null);
                t1Var.U = org.telegram.messenger.gd.N0(2131743132, null);
            }
            t1Var.J = org.telegram.ui.ActionBar.n6.gh;
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131743133, null), new d30(this));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.lh, false));
            t1Var.show();
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.mh, null);
            }
            t1Var.p(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yg, false));
            return;
        }
        if (i7 == 9) {
            e40Var.h3.callOnClick();
            return;
        }
        int i12 = 8;
        if (i7 == 5) {
            org.telegram.messenger.t3 t3Var = e40Var.V2;
            if (!t3Var.w) {
                f30 f30Var = new f30(this, e40Var.getContext(), e40Var.U2, e40Var.H4);
                if (e40Var.v1()) {
                    f30Var.K0(2);
                    return;
                } else {
                    f30Var.show();
                    return;
                }
            }
            boolean z10 = t3Var.b.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(e40Var.getContext());
            int i13 = org.telegram.ui.ActionBar.n6.gh;
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.J = i13;
            t1Var2.S = org.telegram.messenger.gd.N0(2131743071, null);
            if (org.telegram.messenger.v3.W(e40Var.U2)) {
                t1Var2.U = org.telegram.messenger.gd.N0(2131743204, null);
            } else {
                t1Var2.U = org.telegram.messenger.gd.N0(2131743072, null);
            }
            alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131744600, null), new ab.z(i12, this, z10));
            alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var2.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.lh, false));
            t1Var2.show();
            t1Var2.p(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.eh, false));
            return;
        }
        if (i7 == 7) {
            e40Var.g2 = true;
            e40Var.t3.setVisibility(0);
            e40Var.u3.setVisibility(0);
            e40Var.i3.setVisibility(8);
            e40Var.w3.setVisibility(8);
            e40Var.x3.setVisibility(8);
            e40Var.v3.setVisibility(8);
            e40Var.q3.setVisibility(8);
            e40Var.j3.setVisibility(8);
            e40Var.r3.setVisibility(8);
            e40Var.s3.setVisibility(8);
            e40Var.f2.setVisibility(8);
            e40Var.k3.setVisibility(8);
            e40Var.l3.setVisibility(8);
            y0Var.setVisibility(8);
            org.telegram.ui.ActionBar.q0 q0Var = e40Var.f3;
            org.telegram.ui.ActionBar.g1 g1Var = q0Var.d;
            if (g1Var == null || !g1Var.isShowing()) {
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.b;
            Point point = org.telegram.messenger.g0.q;
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.m10.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            q0Var.X(true, true);
            return;
        }
        if (i7 == 6) {
            e40Var.r2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(e40Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.U(e40Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e40Var.getContext());
            int i14 = org.telegram.ui.ActionBar.n6.gh;
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
            t1Var3.J = i14;
            if (org.telegram.messenger.v3.W(e40Var.U2)) {
                t1Var3.S = org.telegram.messenger.gd.N0(2131743203, null);
            } else {
                t1Var3.S = org.telegram.messenger.gd.N0(2131743070, null);
            }
            t1Var3.z0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), new dy(editTextBoldCursor, i10));
            LinearLayout linearLayout = new LinearLayout(e40Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.n6.eh;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i15, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = e40Var.U2;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.fh, null);
            org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, i15, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, c8.na.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new ey(alertDialog$Builder3, i10));
            editTextBoldCursor.addTextChangedListener(new gy(editTextBoldCursor, i10));
            if (!TextUtils.isEmpty(e40Var.V2.b.title)) {
                editTextBoldCursor.setText(e40Var.V2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131745750, null), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            t1Var3.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Wg, false));
            t1Var3.setOnShowListener(new e30(this, t1Var3, editTextBoldCursor, i11));
            t1Var3.setOnDismissListener(new fy(editTextBoldCursor, i10));
            t1Var3.show();
            t1Var3.p(org.telegram.ui.ActionBar.n6.x0(null, i15, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i7 == 8) {
            org.telegram.ui.Components.f70.L0(e40Var.getContext(), -e40Var.m1(), e40Var.o1, null, 2, e40Var.v2, new d30(this));
            return;
        }
        if (i7 == 14) {
            org.telegram.messenger.mp.g1().edit().putBoolean("asr_live_captions", !ai.j2.a()).apply();
            boolean a10 = ai.j2.a();
            e40Var.n3.a(a10, true);
            y0Var.setSubtext(org.telegram.messenger.gd.N0(a10 ? 2131745053 : 2131745054, null));
            e40Var.Q1();
            return;
        }
        if (i7 == 11) {
            org.telegram.messenger.bz.I0 = !org.telegram.messenger.bz.I0;
            SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
            edit.putBoolean("noiseSupression", org.telegram.messenger.bz.I0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(org.telegram.messenger.bz.I0);
            return;
        }
        if (i7 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        org.telegram.ui.Cells.c0.v(null, 2131743249, arrayList, R.drawable.msg_voice_speaker, arrayList2);
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(org.telegram.messenger.gd.N0(sharedInstance.isHeadsetPlugged() ? 2131743251 : 2131743250, null));
            arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
            arrayList3.add(1);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = org.telegram.messenger.gd.N0(2131743253, null);
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
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(this.a, false, 1, null);
        j3.P = org.telegram.messenger.gd.N0(2131742993, null);
        j3.Q = true;
        og.j jVar = new og.j(i12, this, arrayList3);
        j3.M = charSequenceArr;
        j3.N = iArr;
        j3.L = jVar;
        int i17 = org.telegram.ui.ActionBar.n6.bh;
        j3.v0(org.telegram.ui.ActionBar.n6.x0(null, i17, false));
        j3.P(org.telegram.ui.ActionBar.n6.x0(null, i17, false));
        int i18 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        j3.show();
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.eh, false);
        org.telegram.ui.ActionBar.n2 n2Var = j3.m0;
        if (n2Var != null) {
            n2Var.setTextColor(x03);
        }
        for (int i19 = 0; i19 < j3.x0.size(); i19++) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) j3.x0.get(i19);
            if (i19 == i18) {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.gh, false);
                p2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.eh, false);
            }
            p2Var.setTextColor(x02);
            p2Var.setIconColor(x02);
            int i20 = org.telegram.ui.ActionBar.n6.Yg;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i20, false), 12), 2, -1);
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i20, 12);
            p2Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(p2Var, h02, null, g10, null);
        }
    }
}
