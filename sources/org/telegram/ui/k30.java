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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class k30 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ f40 b;

    public k30(f40 f40Var, Activity activity) {
        this.b = f40Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        VoIPService sharedInstance;
        int x02;
        f40 f40Var = this.b;
        if (i7 == -1) {
            f40Var.onBackPressed();
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (i7 == 1) {
            f40Var.V2.b.join_muted = false;
            f40.N0(f40Var);
            return;
        }
        if (i7 == 2) {
            f40Var.V2.b.join_muted = true;
            f40.N0(f40Var);
            return;
        }
        if (i7 == 3) {
            f40Var.n1(false);
            return;
        }
        if (i7 == 12) {
            f40.O0(f40Var, true);
            return;
        }
        if (i7 == 13) {
            f40.O0(f40Var, false);
            return;
        }
        if (i7 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f40Var.getContext());
            boolean W = org.telegram.messenger.v3.W(f40Var.U2);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            if (W) {
                t1Var.S = org.telegram.messenger.gd.N0(2131743239, null);
                t1Var.U = org.telegram.messenger.gd.N0(2131743240, null);
            } else {
                t1Var.S = org.telegram.messenger.gd.N0(2131743138, null);
                t1Var.U = org.telegram.messenger.gd.N0(2131743139, null);
            }
            t1Var.J = org.telegram.ui.ActionBar.m6.gh;
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131743140, null), new e30(this));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lh, false));
            t1Var.show();
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.mh, null);
            }
            t1Var.p(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false));
            return;
        }
        if (i7 == 9) {
            f40Var.h3.callOnClick();
            return;
        }
        int i12 = 8;
        if (i7 == 5) {
            org.telegram.messenger.t3 t3Var = f40Var.V2;
            if (!t3Var.w) {
                g30 g30Var = new g30(this, f40Var.getContext(), f40Var.U2, f40Var.H4);
                if (f40Var.v1()) {
                    g30Var.K0(2);
                    return;
                } else {
                    g30Var.show();
                    return;
                }
            }
            boolean z10 = t3Var.b.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f40Var.getContext());
            int i13 = org.telegram.ui.ActionBar.m6.gh;
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.J = i13;
            t1Var2.S = org.telegram.messenger.gd.N0(2131743078, null);
            if (org.telegram.messenger.v3.W(f40Var.U2)) {
                t1Var2.U = org.telegram.messenger.gd.N0(2131743211, null);
            } else {
                t1Var2.U = org.telegram.messenger.gd.N0(2131743079, null);
            }
            alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131744600, null), new ab.z(i12, this, z10));
            alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var2.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lh, false));
            t1Var2.show();
            t1Var2.p(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.eh, false));
            return;
        }
        if (i7 == 7) {
            f40Var.g2 = true;
            f40Var.t3.setVisibility(0);
            f40Var.u3.setVisibility(0);
            f40Var.i3.setVisibility(8);
            f40Var.w3.setVisibility(8);
            f40Var.x3.setVisibility(8);
            f40Var.v3.setVisibility(8);
            f40Var.q3.setVisibility(8);
            f40Var.j3.setVisibility(8);
            f40Var.r3.setVisibility(8);
            f40Var.s3.setVisibility(8);
            f40Var.f2.setVisibility(8);
            f40Var.k3.setVisibility(8);
            f40Var.l3.setVisibility(8);
            f40Var.m3.setVisibility(8);
            org.telegram.ui.ActionBar.q0 q0Var = f40Var.f3;
            org.telegram.ui.ActionBar.g1 g1Var = q0Var.d;
            if (g1Var == null || !g1Var.isShowing()) {
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.b;
            Point point = org.telegram.messenger.g0.q;
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.n10.c(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            q0Var.X(true, true);
            return;
        }
        if (i7 == 6) {
            f40Var.r2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(f40Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.U(f40Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(f40Var.getContext());
            int i14 = org.telegram.ui.ActionBar.m6.gh;
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
            t1Var3.J = i14;
            if (org.telegram.messenger.v3.W(f40Var.U2)) {
                t1Var3.S = org.telegram.messenger.gd.N0(2131743210, null);
            } else {
                t1Var3.S = org.telegram.messenger.gd.N0(2131743077, null);
            }
            t1Var3.z0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), new ey(editTextBoldCursor, i10));
            LinearLayout linearLayout = new LinearLayout(f40Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.m6.eh;
            org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i15, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = f40Var.U2;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, org.telegram.ui.ActionBar.m6.fh, null);
            org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, i15, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, c8.ma.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new fy(alertDialog$Builder3, i10));
            editTextBoldCursor.addTextChangedListener(new hy(editTextBoldCursor, i10));
            if (!TextUtils.isEmpty(f40Var.V2.b.title)) {
                editTextBoldCursor.setText(f40Var.V2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131745750, null), new z6(this, editTextBoldCursor, alertDialog$Builder3, 15));
            t1Var3.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wg, false));
            t1Var3.setOnShowListener(new f30(this, t1Var3, editTextBoldCursor, i11));
            t1Var3.setOnDismissListener(new gy(editTextBoldCursor, i10));
            t1Var3.show();
            t1Var3.p(org.telegram.ui.ActionBar.m6.x0(null, i15, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i7 == 8) {
            org.telegram.ui.Components.i70.L0(f40Var.getContext(), -f40Var.m1(), f40Var.o1, null, 2, f40Var.v2, new e30(this));
            return;
        }
        if (i7 == 14) {
            org.telegram.messenger.mp.g1().edit().putBoolean("asr_live_captions", !ai.r2.a()).apply();
            f40Var.R1(true);
            f40Var.Q1();
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
        org.telegram.ui.Cells.c0.v(null, 2131743256, arrayList, R.drawable.msg_voice_speaker, arrayList2);
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(org.telegram.messenger.gd.N0(sharedInstance.isHeadsetPlugged() ? 2131743258 : 2131743257, null));
            arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
            arrayList3.add(1);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = org.telegram.messenger.gd.N0(2131743260, null);
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
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.n10.j(this.a, false, 1, null);
        j3.P = org.telegram.messenger.gd.N0(2131743000, null);
        j3.Q = true;
        og.j jVar = new og.j(i12, this, arrayList3);
        j3.M = charSequenceArr;
        j3.N = iArr;
        j3.L = jVar;
        int i17 = org.telegram.ui.ActionBar.m6.bh;
        j3.v0(org.telegram.ui.ActionBar.m6.x0(null, i17, false));
        j3.P(org.telegram.ui.ActionBar.m6.x0(null, i17, false));
        int i18 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        j3.show();
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.eh, false);
        org.telegram.ui.ActionBar.n2 n2Var = j3.m0;
        if (n2Var != null) {
            n2Var.setTextColor(x03);
        }
        for (int i19 = 0; i19 < j3.x0.size(); i19++) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) j3.x0.get(i19);
            if (i19 == i18) {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.gh, false);
                p2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.eh, false);
            }
            p2Var.setTextColor(x02);
            p2Var.setIconColor(x02);
            int i20 = org.telegram.ui.ActionBar.m6.Yg;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i20, false), 12), 2, -1);
            org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i20, 12);
            p2Var.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(p2Var, h02, null, g10, null);
        }
    }
}
