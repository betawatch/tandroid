// default package

import android.content.Context;
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
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i85 extends c6 {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ g95 b;

    public i85(g95 g95Var, LaunchActivity launchActivity) {
        this.b = g95Var;
        this.a = launchActivity;
    }

    @Override // c6
    public final void b(int i) {
        VoIPService sharedInstance;
        int w0;
        g95 g95Var = this.b;
        a8 a8Var = g95Var.i3;
        if (i == -1) {
            g95Var.onBackPressed();
            return;
        }
        byte b = 1;
        byte b2 = 0;
        if (i == 1) {
            g95Var.T2.b.join_muted = false;
            g95Var.C1();
            return;
        }
        byte b3 = 2;
        if (i == 2) {
            g95Var.T2.b.join_muted = true;
            g95Var.C1();
            return;
        }
        if (i == 3) {
            g95Var.a1(false);
            return;
        }
        if (i == 12) {
            g95Var.v1(true);
            return;
        }
        if (i == 13) {
            g95Var.v1(false);
            return;
        }
        if (i == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g95Var.getContext());
            boolean W = sd2.W(g95Var.S2);
            he heVar = alertDialog$Builder.a;
            if (W) {
                heVar.S = jb6.M0(2131743166, null);
                heVar.U = jb6.M0(2131743167, null);
            } else {
                heVar.S = jb6.M0(2131743065, null);
                heVar.U = jb6.M0(2131743066, null);
            }
            heVar.J = cmb.fh;
            alertDialog$Builder.j(jb6.M0(2131743067, null), new b85(this));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            heVar.j(cmb.w0(null, cmb.kh, false));
            heVar.show();
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.lh, null);
            }
            heVar.o(cmb.w0(null, cmb.Xg, false));
            return;
        }
        if (i == 9) {
            g95Var.d3.callOnClick();
            return;
        }
        byte b4 = 7;
        if (i == 5) {
            qd2 qd2Var = g95Var.T2;
            if (!qd2Var.w) {
                d85 d85Var = new d85(this, g95Var.getContext(), g95Var.S2, g95Var.y4);
                if (g95Var.i1()) {
                    d85Var.E0(2);
                    return;
                } else {
                    d85Var.show();
                    return;
                }
            }
            boolean z = qd2Var.b.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g95Var.getContext());
            int i2 = cmb.fh;
            he heVar2 = alertDialog$Builder2.a;
            heVar2.J = i2;
            heVar2.S = jb6.M0(2131743005, null);
            if (sd2.W(g95Var.S2)) {
                heVar2.U = jb6.M0(2131743138, null);
            } else {
                heVar2.U = jb6.M0(2131743006, null);
            }
            alertDialog$Builder2.j(jb6.M0(2131744530, null), new s51(b4, this, z));
            alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
            heVar2.j(cmb.w0(null, cmb.kh, false));
            heVar2.show();
            heVar2.o(cmb.w0(null, cmb.dh, false));
            return;
        }
        if (i == 7) {
            g95Var.e2 = true;
            g95Var.p3.setVisibility(0);
            g95Var.q3.setVisibility(0);
            g95Var.e3.setVisibility(8);
            g95Var.s3.setVisibility(8);
            g95Var.t3.setVisibility(8);
            g95Var.r3.setVisibility(8);
            g95Var.m3.setVisibility(8);
            g95Var.f3.setVisibility(8);
            g95Var.n3.setVisibility(8);
            g95Var.o3.setVisibility(8);
            g95Var.d2.setVisibility(8);
            g95Var.g3.setVisibility(8);
            g95Var.h3.setVisibility(8);
            a8Var.setVisibility(8);
            r7 r7Var = g95Var.b3;
            m8 m8Var = r7Var.d;
            if (m8Var == null || !m8Var.isShowing()) {
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r7Var.b;
            Point point = gm.q;
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(wi8.f(40.0f, point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
            r7Var.W(true, true);
            return;
        }
        byte b5 = 6;
        if (i == 6) {
            g95Var.q2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(g95Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(cmb.T(g95Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g95Var.getContext());
            int i3 = cmb.fh;
            he heVar3 = alertDialog$Builder3.a;
            heVar3.J = i3;
            if (sd2.W(g95Var.S2)) {
                heVar3.S = jb6.M0(2131743137, null);
            } else {
                heVar3.S = jb6.M0(2131743004, null);
            }
            heVar3.z0 = false;
            alertDialog$Builder3.g(jb6.M0(2131752542, null), new uu3(editTextBoldCursor, b3));
            LinearLayout linearLayout = new LinearLayout(g95Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i4 = cmb.dh;
            anb.X(editTextBoldCursor, i4, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = g95Var.S2;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            anb.D(editTextBoldCursor, cmb.eh, null);
            anb.l(editTextBoldCursor, 30, i4, null);
            editTextBoldCursor.setCursorSize(gm.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, gm.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, qoe.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new ge4(alertDialog$Builder3, b));
            editTextBoldCursor.addTextChangedListener(new je4(editTextBoldCursor, b));
            if (!TextUtils.isEmpty(g95Var.T2.b.title)) {
                editTextBoldCursor.setText(g95Var.T2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.j(jb6.M0(2131745680, null), new wu2(this, editTextBoldCursor, alertDialog$Builder3, false, (byte) 14));
            heVar3.j(cmb.w0(null, cmb.Vg, false));
            heVar3.setOnShowListener(new c85(this, heVar3, editTextBoldCursor, b2));
            heVar3.setOnDismissListener(new ie4(editTextBoldCursor, b));
            heVar3.show();
            heVar3.o(cmb.w0(null, i4, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i == 8) {
            wv5.E0(g95Var.getContext(), -g95Var.Z0(), g95Var.n1, null, 2, g95Var.u2, new b85(this));
            return;
        }
        if (i == 14) {
            oc7.d1().edit().putBoolean("asr_live_captions", !q86.a()).apply();
            boolean a = q86.a();
            g95Var.j3.a(a, true);
            a8Var.setSubtext(jb6.M0(a ? 2131744983 : 2131744984, null));
            g95Var.G1();
            return;
        }
        if (i == 11) {
            gda.E0 = !gda.E0;
            SharedPreferences.Editor edit = oc7.d1().edit();
            edit.putBoolean("noiseSupression", gda.E0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(gda.E0);
                return;
            }
            return;
        }
        if (i != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b10.r(null, 2131743183, arrayList, R.drawable.msg_voice_speaker, arrayList2);
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(jb6.M0(sharedInstance.isHeadsetPlugged() ? 2131743185 : 2131743184, null));
            arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
            arrayList3.add(1);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = jb6.M0(2131743187, null);
            }
            arrayList.add(str);
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_bluetooth));
            arrayList3.add(2);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            charSequenceArr[i5] = (CharSequence) arrayList.get(i5);
            iArr[i5] = ((Integer) arrayList2.get(i5)).intValue();
        }
        my0 my0Var = new my0(1, (ylb) null, (Context) this.a, false);
        my0Var.J();
        my0Var.P = jb6.M0(2131742927, null);
        my0Var.Q = true;
        ff ffVar = new ff((Object) this, arrayList3, b5);
        my0Var.M = charSequenceArr;
        my0Var.N = iArr;
        my0Var.L = ffVar;
        int i6 = cmb.ah;
        my0Var.s0(cmb.w0(null, i6, false));
        my0Var.K(cmb.w0(null, i6, false));
        int i7 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        my0Var.show();
        int w02 = cmb.w0(null, cmb.dh, false);
        ey0 ey0Var = my0Var.m0;
        if (ey0Var != null) {
            ey0Var.setTextColor(w02);
        }
        int i8 = 0;
        while (true) {
            ArrayList arrayList4 = my0Var.x0;
            if (i8 >= arrayList4.size()) {
                return;
            }
            gy0 gy0Var = (gy0) arrayList4.get(i8);
            if (i8 == i7) {
                w0 = cmb.w0(null, cmb.fh, false);
                gy0Var.f = true;
            } else {
                w0 = cmb.w0(null, cmb.dh, false);
            }
            gy0Var.setTextColor(w0);
            gy0Var.setIconColor(w0);
            int i9 = cmb.Xg;
            fg0 f0 = cmb.f0(on2.p(cmb.w0(null, i9, false), 12), 2, -1);
            wmb g = anb.g(i9, 12);
            gy0Var.setBackground(f0);
            anb.j(gy0Var, f0, null, g, null);
            i8++;
        }
    }
}
