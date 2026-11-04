package org.telegram.ui.Components;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q2(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.f60] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int N;
        ?? r82;
        String G;
        int b10;
        int i3;
        View view2;
        u4.d1 T;
        int i10 = this.a;
        int i11 = 13;
        int i12 = 2;
        int i13 = -1;
        boolean z10 = false;
        int i14 = 1;
        i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 1:
                z7 z7Var = (z7) obj2;
                float[] fArr = (float[]) obj;
                float f10 = MediaController.B().r0;
                int i15 = 0;
                while (true) {
                    if (i15 < 3) {
                        if (f10 - 0.1f <= fArr[i15]) {
                            i13 = i15;
                        } else {
                            i15++;
                        }
                    }
                }
                int i16 = i13 + 1;
                if (i16 >= 3) {
                    i16 = 0;
                }
                MediaController.B().m0(true, fArr[i16]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - z7Var.H2 > 300) {
                    int i17 = org.telegram.messenger.hp.f1().getInt("speedhint", 0) + 1;
                    if (i17 > 2) {
                        i17 = -10;
                    }
                    org.telegram.messenger.hp.f1().edit().putInt("speedhint", i17).apply();
                    if (i17 >= 0 && z7Var.b != null) {
                        m7 m7Var = new m7(5, z7Var.getContext(), null, false);
                        z7Var.G2 = m7Var;
                        m7Var.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                        z7Var.G2.setText(org.telegram.messenger.bd.M0(2131745279, null));
                        z7Var.v1.addView(z7Var.G2, b8.mf.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        z7Var.G2.c(z7Var.M1);
                    }
                }
                z7Var.H2 = currentTimeMillis;
                break;
            case 2:
                z7 z7Var2 = (z7) obj2;
                z7Var2.getClass();
                ((f60) obj).u();
                z7Var2.P0(6);
                break;
            case 3:
                l80 l80Var = (l80) obj;
                z7 z7Var3 = (z7) ((r7) obj2).G;
                int i18 = z7Var3.a;
                LaunchActivity launchActivity = z7Var3.x2;
                ArrayList arrayList = (ArrayList) org.telegram.messenger.hp.s1(i18).w.get(0);
                if ((arrayList != null ? arrayList.size() : 0) > 10 && !TextUtils.isEmpty(l80Var.getText().toString())) {
                    String charSequence = l80Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof org.telegram.ui.uw) {
                        org.telegram.ui.uw uwVar = (org.telegram.ui.uw) launchActivity.M().getLastFragment();
                        ArrayList arrayList2 = (ArrayList) uwVar.getMessagesController().w.get(0);
                        int size = arrayList2 != null ? arrayList2.size() : 0;
                        if (!uwVar.m2 && (size > 10 || uwVar.L)) {
                            i14 = 0;
                        }
                        if (i14 == 0) {
                            if (uwVar.k2) {
                                uwVar.Y.r.setText(charSequence);
                                uwVar.Y.r.setSelection(charSequence.length());
                                org.telegram.ui.cw cwVar = uwVar.D0;
                                if (cwVar != null && (N = cwVar.N(3)) >= 0 && uwVar.D0.getTabsView().getCurrentTabId() != N) {
                                    uwVar.D0.getTabsView().d(N, N);
                                }
                            } else {
                                uwVar.y = 3;
                                uwVar.Y.r.setText(charSequence);
                                uwVar.Y.r.setSelection(charSequence.length());
                            }
                            z7Var3.dismiss();
                            break;
                        }
                    }
                    org.telegram.ui.uw uwVar2 = new org.telegram.ui.uw(null);
                    uwVar2.o2 = charSequence;
                    uwVar2.y = 3;
                    launchActivity.u0(uwVar2, false, false);
                    z7Var3.dismiss();
                    break;
                }
                break;
            case 4:
                r8 r8Var = (r8) obj;
                ((boolean[]) obj2)[0] = true;
                r8Var.K.z1(r8Var.Z);
                r8Var.T.dismiss();
                break;
            case 5:
                sc scVar = (sc) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                f60 f60Var = scVar.X0;
                if (f60Var == null || !f60Var.D()) {
                    scVar.d1.f(true);
                    f60 F = f60.F(frameLayout, new ei.b(), scVar.V0);
                    scVar.X0 = F;
                    F.s = 0;
                    F.p(13, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.bd.M0(2131744145, null));
                    scVar.X0.k();
                    for (int i19 : scVar.c1) {
                        if (i19 == 0) {
                            G = org.telegram.messenger.bd.M0(2131744146, null);
                        } else if (i19 == Integer.MAX_VALUE) {
                            G = org.telegram.messenger.bd.M0(2131744144, null);
                        } else {
                            r82 = 0;
                            G = org.telegram.messenger.bd.G(i19, "Seconds", new Object[0]);
                            scVar.X0.c(r82, G, new o2(scVar, i19, i12), r82);
                            if (scVar.b1 != i19) {
                                scVar.X0.L();
                            }
                        }
                        r82 = 0;
                        scVar.X0.c(r82, G, new o2(scVar, i19, i12), r82);
                        if (scVar.b1 != i19) {
                        }
                    }
                    scVar.X0.Z();
                    break;
                } else {
                    scVar.X0.u();
                    scVar.X0 = null;
                    break;
                }
                break;
            case 6:
                uk.O((uk) obj2, (org.telegram.ui.ActionBar.e6) obj);
                break;
            case 7:
                an anVar = (an) ((org.telegram.ui.n4) obj2).e;
                org.telegram.ui.u51 u51Var = anVar.s;
                View F2 = u51Var.F((ym) obj);
                u4.d1 T2 = F2 != null ? u51Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - anVar.u0) >= 0 && b10 < anVar.L.length) {
                    an.S(anVar, b10);
                    break;
                }
                break;
            case 8:
                jn jnVar = (jn) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                org.telegram.ui.wm wmVar = jnVar.H;
                if (jnVar.U) {
                    wmVar.showDialog(t4.U(jnVar.getContext(), wmVar.h, e6Var).a);
                    break;
                } else {
                    fn fnVar = jnVar.e;
                    if (wmVar.getParentActivity() != null) {
                        TLRPC.Chat chat = wmVar.e;
                        if (chat == null || org.telegram.messenger.t3.y(13, chat)) {
                            TLRPC.ChatFull chatFull = wmVar.q8;
                            TLRPC.UserFull userFull = wmVar.r8;
                            int i20 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            o4.m0 m0Var = new o4.m0(jnVar.getContext(), null, new gn(jnVar, r4), true, 0, jnVar.e0);
                            m0Var.t(i20);
                            hn hnVar = new hn(jnVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) m0Var.a);
                            org.telegram.ui.ActionBar.f1[] f1VarArr = {hnVar};
                            hnVar.e = true;
                            hnVar.c = org.telegram.messenger.hs.x3;
                            hnVar.setOutsideTouchable(true);
                            f1VarArr[0].setClippingEnabled(true);
                            f1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            f1VarArr[0].setFocusable(true);
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) m0Var.a).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            f1VarArr[0].setInputMethodMode(2);
                            f1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            f1VarArr[0].showAtLocation(fnVar, 0, (int) (jnVar.getX() + fnVar.getX()), (int) fnVar.getY());
                            wmVar.v8(false, true, 0.2f);
                            break;
                        } else if (jnVar.a.f && wmVar.getParentActivity() != null && wmVar.fragmentView != null && wmVar.q8 != null) {
                            if (wmVar.D2 == null) {
                                i3 = 0;
                                gi.l3 D6 = wmVar.D6(310.0f, 1, -1, false);
                                wmVar.D2 = D6;
                                D6.d = 4000L;
                            } else {
                                i3 = 0;
                            }
                            int i21 = wmVar.q8.ttl_period;
                            String G2 = i21 > 86400 ? org.telegram.messenger.bd.G(i21 / 86400, "Days", new Object[i3]) : i21 >= 3600 ? org.telegram.messenger.bd.G(i21 / 3600, "Hours", new Object[i3]) : i21 >= 60 ? org.telegram.messenger.bd.G(i21 / 60, "Minutes", new Object[i3]) : org.telegram.messenger.bd.G(i21, "Seconds", new Object[i3]);
                            gi.l3 l3Var = wmVar.D2;
                            Object[] objArr = new Object[1];
                            objArr[i3] = G2;
                            l3Var.u(org.telegram.messenger.bd.a0("AutoDeleteSetInfo", null, 2131753844, objArr));
                            wmVar.D2.y(wmVar.p1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 9:
                vo voVar = (vo) obj2;
                org.telegram.ui.wm wmVar2 = (org.telegram.ui.wm) obj;
                if (voVar.n1 != null) {
                    voVar.n1 = null;
                    voVar.dismiss();
                    org.telegram.messenger.d4.f(voVar.a).a(wmVar2.a(), true, false);
                    break;
                } else {
                    voVar.dismiss();
                    break;
                }
            case 10:
                tq tqVar = (tq) obj2;
                tqVar.S1 = org.telegram.messenger.hp.s1(tqVar.a).j1(org.telegram.messenger.zi.C1((TLRPC.Peer) obj));
                tqVar.dismiss();
                break;
            case 11:
                br brVar = (br) obj2;
                String str = (String) obj;
                if (brVar.b == null && (view2 = brVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        brVar.b = (EditText) findFocus;
                    }
                }
                if (brVar.b != null) {
                    try {
                        brVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = brVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = brVar.b.getText();
                    int length = brVar.b.getSelectionEnd() == brVar.b.length() ? -1 : str.length() + brVar.b.getSelectionStart();
                    if (brVar.b.getSelectionStart() == -1 || brVar.b.getSelectionEnd() == -1) {
                        brVar.b.setText(str);
                        EditText editText2 = brVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = brVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), brVar.b.getSelectionEnd(), str));
                        EditText editText4 = brVar.b;
                        if (length == -1) {
                            length = editText4.length();
                        }
                        editText4.setSelection(length);
                    }
                    EditText editText5 = brVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        break;
                    }
                }
                break;
            case 12:
                lr lrVar = (lr) obj2;
                kr krVar = (kr) obj;
                lrVar.X0();
                krVar.f = !krVar.f;
                krVar.j.Q1.O(true);
                lrVar.I0();
                break;
            case 13:
                ((lr) obj2).u2 = !r9.u2;
                ((f41) obj).O(true);
                break;
            case 14:
                ((org.telegram.ui.q6) obj2).dismiss();
                ((org.telegram.ui.ActionBar.d2) obj).presentFragment(new org.telegram.ui.z6());
                break;
            case 15:
                pu puVar = (pu) obj2;
                p5 p5Var = (p5) obj;
                org.telegram.ui.ActionBar.f1 f1Var = puVar.y1;
                if (f1Var != null) {
                    f1Var.d(true);
                    puVar.y1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.zi.U(g5.e(puVar.a, p5Var.getDocumentId())));
                    spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.g0.g(spannableString)) {
                        org.telegram.messenger.camera.q.r(null, 2131751185, new fc((FrameLayout) puVar.b, puVar.J0));
                        break;
                    }
                }
                break;
            case 16:
                vx vxVar = (vx) obj2;
                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) obj;
                ey eyVar = vxVar.w;
                ov ovVar = eyVar.E0;
                if (ovVar.indexOfChild(i8Var) != -1 && (T = ovVar.T(i8Var)) != null) {
                    if (T.b() == eyVar.g1) {
                        if (eyVar.i1 != null) {
                            fx fxVar = eyVar.u1;
                            if (fxVar != null) {
                                fxVar.y(eyVar.K1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(eyVar.d1).f7.edit();
                            String str2 = "group_hide_stickers_" + eyVar.K1.id;
                            TLRPC.StickerSet stickerSet = eyVar.K1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            eyVar.X(false);
                            vx vxVar2 = eyVar.z0;
                            if (vxVar2 != null) {
                                vxVar2.f();
                                break;
                            }
                        }
                    } else if (vxVar.h.get(T.b()) == eyVar.k1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vxVar.c);
                        String M0 = org.telegram.messenger.bd.M0(2131752063, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131752064, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new zw(vxVar, i14));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        s1Var.show();
                        TextView textView = (TextView) s1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                            break;
                        }
                    }
                }
                break;
            case 17:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = FragmentContextView.X0;
                float C = MediaController.B().C(fragmentContextView.a0);
                int i22 = 0;
                while (true) {
                    if (i22 >= 3) {
                        i22 = -1;
                    } else if (C - 0.1f > fArr2[i22]) {
                        i22++;
                    }
                }
                int i23 = i22 + 1;
                if (i23 >= 3) {
                    i23 = 0;
                }
                float f11 = fArr2[i23];
                MediaController.B().m0(fragmentContextView.a0, f11);
                fragmentContextView.l(C, f11, true);
                long currentTimeMillis2 = System.currentTimeMillis();
                if (fragmentContextView.C0 == null && currentTimeMillis2 - fragmentContextView.E0 > 300) {
                    v20 v20Var = v20.w;
                    if (v20Var.c()) {
                        v20Var.b();
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                        if (d2Var != null && fragmentContextView.D0 != null) {
                            gi.l3 l3Var2 = new gi.l3(fragmentContextView.getContext(), 1);
                            l3Var2.r(true);
                            l3Var2.d = 2300L;
                            l3Var2.U = true;
                            l3Var2.e = true;
                            l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                            l3Var2.v0 = -org.telegram.messenger.g0.L(6.0f);
                            fragmentContextView.C0 = l3Var2;
                            l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            if (d2Var instanceof org.telegram.ui.wm) {
                                l3Var2.l(((org.telegram.ui.wm) d2Var).L);
                            }
                            l3Var2.u(org.telegram.messenger.bd.M0(2131745279, null));
                            l3Var2.r0 = new z2(l3Var2, i14);
                            fragmentContextView.D0.addView(l3Var2, b8.mf.e(-1, org.telegram.messenger.hs.g2, 55));
                            l3Var2.y(fragmentContextView.H, true);
                        }
                    }
                }
                fragmentContextView.E0 = currentTimeMillis2;
                break;
            case 18:
                n00 n00Var = (n00) obj2;
                org.telegram.ui.ActionBar.p0 p0Var = (org.telegram.ui.ActionBar.p0) obj;
                int indexOf = n00Var.G.indexOf(p0Var.getFilter());
                if (n00Var.J != indexOf) {
                    n00Var.J = indexOf;
                    n00Var.e();
                    break;
                } else if (p0Var.getFilter().h) {
                    if (p0Var.a.f) {
                        kg.l0 filter = p0Var.getFilter();
                        n00Var.f(filter);
                        m00 m00Var = n00Var.I;
                        if (m00Var != null) {
                            ((org.telegram.ui.av) m00Var).g(filter);
                            break;
                        }
                    } else {
                        p0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 19:
                ((p2) obj).a(Long.valueOf(((s00) obj2).d));
                break;
            case 20:
                ((org.telegram.ui.zo) obj).run();
                ((i20) obj2).dismiss();
                break;
            case 21:
                ((f60) obj2).u();
                ((org.telegram.ui.z70) obj).run();
                break;
            case 22:
                f60 f60Var2 = (f60) obj2;
                ((org.telegram.ui.bu) obj).run();
                if (f60Var2.J) {
                    f60Var2.u();
                    break;
                }
                break;
            case 23:
                o60 o60Var = (o60) obj2;
                m60 m60Var = (m60) obj;
                TLRPC.InputPeer j12 = org.telegram.messenger.hp.s1(o60Var.a).j1(org.telegram.messenger.zi.C1(o60Var.u1));
                if (o60Var.t1 != 2) {
                    o60Var.w1 = j12;
                } else if (o60Var.u1 != o60Var.v1) {
                    m60Var.a(j12, o60Var.q1.size() > 1, false, false);
                }
                o60Var.dismiss();
                break;
            case 24:
                vc0 vc0Var = (vc0) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj;
                ArrayList arrayList3 = vc0Var.D1;
                ArrayList arrayList4 = vc0Var.E1;
                org.telegram.ui.ActionBar.d2 d2Var2 = vc0Var.q1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = vc0Var.F1;
                if (vc0Var.B1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vc0Var.getContext());
                    alertDialog$Builder2.a.S = org.telegram.messenger.bd.M0(2131754444, null);
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.bd.M0(2131751718, null), org.telegram.messenger.bd.M0(2131754375, null)}, new rc0(vc0Var));
                    alertDialog$Builder2.p();
                    break;
                } else {
                    StringBuilder sb2 = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.g5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                    int lastIndexOf = sb2.lastIndexOf("END:VCARD");
                    if (lastIndexOf >= 0) {
                        tL_userContact_old2.phone = null;
                        int size2 = arrayList4.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.messenger.f0 f0Var = (org.telegram.messenger.f0) arrayList4.get(size2);
                            boolean z11 = f0Var.d;
                            ?? r15 = f0Var.a;
                            if (z11) {
                                if (tL_userContact_old2.phone == null) {
                                    tL_userContact_old2.phone = f0Var.c(z10);
                                }
                                for (?? r13 = z10; r13 < r15.size(); r13++) {
                                    sb2.insert(lastIndexOf, ((String) r15.get(r13)) + "\n");
                                }
                            }
                            size2--;
                            z10 = false;
                        }
                        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                            org.telegram.messenger.f0 f0Var2 = (org.telegram.messenger.f0) arrayList3.get(size3);
                            boolean z12 = f0Var2.d;
                            ArrayList arrayList5 = f0Var2.a;
                            if (z12) {
                                for (int size4 = arrayList5.size() - 1; size4 >= 0; size4 += -1) {
                                    sb2.insert(lastIndexOf, ((String) arrayList5.get(size4)) + "\n");
                                }
                            }
                        }
                        tL_userContact_old2.restriction_reason.clear();
                        TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                        restrictionReason.text = sb2.toString();
                        restrictionReason.reason = "";
                        restrictionReason.platform = "";
                        tL_userContact_old2.restriction_reason.add(restrictionReason);
                    }
                    boolean z13 = d2Var2 instanceof org.telegram.ui.wm;
                    if (z13) {
                        org.telegram.ui.wm wmVar3 = (org.telegram.ui.wm) d2Var2;
                        if (wmVar3.c()) {
                            t4.L(vc0Var.getContext(), wmVar3.a(), new lc0(vc0Var), e6Var2);
                            break;
                        }
                    }
                    t4.Z(vc0Var.a, 1, z13 ? ((org.telegram.ui.wm) d2Var2).a() : 0L, new p2(vc0Var, 9));
                    break;
                }
            case 25:
                kg0 kg0Var = (kg0) obj2;
                i41 i41Var = (i41) obj;
                if (kg0Var.K.getTag() == null) {
                    int max = (int) Math.max(1.0f, kg0Var.getValue());
                    org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) i41Var.b;
                    TLRPC.User user = (TLRPC.User) i41Var.c;
                    if (la0Var.getLocationController().h(la0Var.m0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(la0Var.getParentActivity());
                        String M02 = org.telegram.messenger.bd.M0(2131745463, null);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder3.a;
                        s1Var2.S = M02;
                        s1Var2.U = org.telegram.messenger.bd.M0(2131745464, null);
                        alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131745465, null), new k2.y(la0Var, user, max, i11));
                        alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        la0Var.showDialog(s1Var2);
                    } else {
                        la0Var.O.M = true;
                        la0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        la0Var.w0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        la0Var.getLocationController().o(max, la0Var.m0, true);
                        z10 = true;
                    }
                    if (z10) {
                        kg0Var.a();
                        break;
                    }
                }
                break;
            case 26:
                og0 og0Var = (og0) obj2;
                Context context = (Context) obj;
                Uri C0 = org.telegram.messenger.g0.C0(og0Var.j1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.g0.W(context).startActivityForResult(Intent.createChooser(intent, og0Var.m0.getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                break;
            case 27:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.bd.M0(2131745468, null));
                createChooser.setFlags(TLObject.FLAG_28);
                ((Context) obj).startActivity(createChooser);
                break;
            case 28:
                org.telegram.ui.is.p().u(((tv0) obj2).r.e2);
                org.telegram.ui.is.p().x((org.telegram.ui.Cells.y7) obj);
                break;
            default:
                org.telegram.messenger.g0.g((CharSequence) obj2);
                ((Runnable) obj).run();
                break;
        }
    }

    public /* synthetic */ q2(r8 r8Var, boolean[] zArr) {
        this.a = 4;
        this.c = r8Var;
        this.b = zArr;
    }
}
