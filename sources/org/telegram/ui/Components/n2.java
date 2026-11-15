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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07d2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [org.telegram.ui.Components.m60] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int L;
        ?? r11;
        String G;
        int b10;
        int i7;
        View view2;
        v4.e1 T;
        int i10 = this.a;
        int i11 = 3;
        int i12 = -1;
        boolean z10 = false;
        int i13 = 1;
        i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ActionBar.u2) ((org.telegram.messenger.ou) obj2).b).y0.run();
                ((org.telegram.messenger.z10) obj).a(null);
                break;
            case 1:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 2:
                y7 y7Var = (y7) obj2;
                float[] fArr = (float[]) obj;
                float f10 = MediaController.B().r0;
                int i14 = 0;
                while (true) {
                    if (i14 < 3) {
                        if (f10 - 0.1f <= fArr[i14]) {
                            i12 = i14;
                        } else {
                            i14++;
                        }
                    }
                }
                int i15 = i12 + 1;
                if (i15 >= 3) {
                    i15 = 0;
                }
                MediaController.B().m0(true, fArr[i15]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - y7Var.K2 > 300) {
                    int i16 = org.telegram.messenger.np.f1().getInt("speedhint", 0) + 1;
                    if (i16 > 2) {
                        i16 = -10;
                    }
                    org.telegram.messenger.np.f1().edit().putInt("speedhint", i16).apply();
                    if (i16 >= 0 && y7Var.b != null) {
                        l7 l7Var = new l7(5, y7Var.getContext(), null, false);
                        y7Var.J2 = l7Var;
                        l7Var.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                        y7Var.J2.setText(org.telegram.messenger.hd.M0(2131745269, null));
                        y7Var.y1.addView(y7Var.J2, c8.ja.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        y7Var.J2.c(y7Var.P1);
                    }
                }
                y7Var.K2 = currentTimeMillis;
                break;
            case 3:
                y7 y7Var2 = (y7) obj2;
                y7Var2.getClass();
                ((m60) obj).u();
                y7Var2.P0(6);
                break;
            case 4:
                r80 r80Var = (r80) obj;
                y7 y7Var3 = (y7) ((q7) obj2).G;
                int i17 = y7Var3.a;
                LaunchActivity launchActivity = y7Var3.A2;
                ArrayList arrayList = (ArrayList) org.telegram.messenger.np.s1(i17).w.get(0);
                if ((arrayList != null ? arrayList.size() : 0) > 10 && !TextUtils.isEmpty(r80Var.getText().toString())) {
                    String charSequence = r80Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof org.telegram.ui.yw) {
                        org.telegram.ui.yw ywVar = (org.telegram.ui.yw) launchActivity.M().getLastFragment();
                        ArrayList arrayList2 = (ArrayList) ywVar.getMessagesController().w.get(0);
                        int size = arrayList2 != null ? arrayList2.size() : 0;
                        if (!ywVar.n2 && (size > 10 || ywVar.L)) {
                            i13 = 0;
                        }
                        if (i13 == 0) {
                            if (ywVar.l2) {
                                ywVar.Y.r.setText(charSequence);
                                ywVar.Y.r.setSelection(charSequence.length());
                                org.telegram.ui.hw hwVar = ywVar.D0;
                                if (hwVar != null && (L = hwVar.L(3)) >= 0 && ywVar.D0.getTabsView().getCurrentTabId() != L) {
                                    ywVar.D0.getTabsView().d(L, L);
                                }
                            } else {
                                ywVar.y = 3;
                                ywVar.Y.r.setText(charSequence);
                                ywVar.Y.r.setSelection(charSequence.length());
                            }
                            y7Var3.dismiss();
                            break;
                        }
                    }
                    org.telegram.ui.yw ywVar2 = new org.telegram.ui.yw(null);
                    ywVar2.p2 = charSequence;
                    ywVar2.y = 3;
                    launchActivity.u0(ywVar2, false, false);
                    y7Var3.dismiss();
                    break;
                }
                break;
            case 5:
                q8 q8Var = (q8) obj2;
                ((boolean[]) obj)[0] = true;
                q8Var.K.z1(q8Var.Z);
                q8Var.T.dismiss();
                break;
            case 6:
                pc pcVar = (pc) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                m60 m60Var = pcVar.X0;
                if (m60Var == null || !m60Var.D()) {
                    pcVar.d1.f(true);
                    m60 F = m60.F(frameLayout, new fi.b(), pcVar.V0);
                    pcVar.X0 = F;
                    F.s = 0;
                    F.p(13, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.hd.M0(2131744135, null));
                    pcVar.X0.k();
                    for (int i18 : pcVar.c1) {
                        if (i18 == 0) {
                            G = org.telegram.messenger.hd.M0(2131744136, null);
                        } else if (i18 == Integer.MAX_VALUE) {
                            G = org.telegram.messenger.hd.M0(2131744134, null);
                        } else {
                            r11 = 0;
                            G = org.telegram.messenger.hd.G(i18, "Seconds", new Object[0]);
                            pcVar.X0.c(r11, G, new a2(pcVar, i18, i11), r11);
                            if (pcVar.b1 != i18) {
                                pcVar.X0.L();
                            }
                        }
                        r11 = 0;
                        pcVar.X0.c(r11, G, new a2(pcVar, i18, i11), r11);
                        if (pcVar.b1 != i18) {
                        }
                    }
                    pcVar.X0.Z();
                    break;
                } else {
                    pcVar.X0.u();
                    pcVar.X0 = null;
                    break;
                }
            case 7:
                dl.P((dl) obj2, (org.telegram.ui.ActionBar.e6) obj);
                break;
            case 8:
                jn jnVar = (jn) ((org.telegram.ui.l4) obj2).e;
                org.telegram.ui.b61 b61Var = jnVar.s;
                View F2 = b61Var.F((hn) obj);
                v4.e1 T2 = F2 != null ? b61Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - jnVar.u0) >= 0 && b10 < jnVar.L.length) {
                    jn.T(jnVar, b10);
                    break;
                }
                break;
            case 9:
                sn snVar = (sn) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                org.telegram.ui.an anVar = snVar.H;
                if (snVar.U) {
                    anVar.showDialog(t4.S(snVar.getContext(), anVar.h, e6Var).a);
                    break;
                } else {
                    on onVar = snVar.e;
                    if (anVar.getParentActivity() != null) {
                        TLRPC.Chat chat = anVar.e;
                        if (chat == null || org.telegram.messenger.t3.y(13, chat)) {
                            TLRPC.ChatFull chatFull = anVar.q8;
                            TLRPC.UserFull userFull = anVar.r8;
                            int i19 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.messenger.qe qeVar = new org.telegram.messenger.qe(snVar.getContext(), null, new pn(snVar, r3), true, 0, snVar.e0);
                            qeVar.u(i19);
                            qn qnVar = new qn(snVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b);
                            org.telegram.ui.ActionBar.g1[] g1VarArr = {qnVar};
                            qnVar.e = true;
                            qnVar.c = org.telegram.messenger.ns.x3;
                            qnVar.setOutsideTouchable(true);
                            g1VarArr[0].setClippingEnabled(true);
                            g1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            g1VarArr[0].setFocusable(true);
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            g1VarArr[0].setInputMethodMode(2);
                            g1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            g1VarArr[0].showAtLocation(onVar, 0, (int) (snVar.getX() + onVar.getX()), (int) onVar.getY());
                            anVar.x8(false, true, 0.2f);
                            break;
                        } else if (snVar.a.f && anVar.getParentActivity() != null && anVar.fragmentView != null && anVar.q8 != null) {
                            if (anVar.D2 == null) {
                                i7 = 0;
                                hi.l3 E6 = anVar.E6(310.0f, 1, -1, false);
                                anVar.D2 = E6;
                                E6.d = 4000L;
                            } else {
                                i7 = 0;
                            }
                            int i20 = anVar.q8.ttl_period;
                            String G2 = i20 > 86400 ? org.telegram.messenger.hd.G(i20 / 86400, "Days", new Object[i7]) : i20 >= 3600 ? org.telegram.messenger.hd.G(i20 / 3600, "Hours", new Object[i7]) : i20 >= 60 ? org.telegram.messenger.hd.G(i20 / 60, "Minutes", new Object[i7]) : org.telegram.messenger.hd.G(i20, "Seconds", new Object[i7]);
                            hi.l3 l3Var = anVar.D2;
                            Object[] objArr = new Object[1];
                            objArr[i7] = G2;
                            l3Var.u(org.telegram.messenger.hd.a0("AutoDeleteSetInfo", null, 2131753844, objArr));
                            anVar.D2.y(anVar.p1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 10:
                ep epVar = (ep) obj2;
                org.telegram.ui.an anVar2 = (org.telegram.ui.an) obj;
                if (epVar.q1 != null) {
                    epVar.q1 = null;
                    epVar.dismiss();
                    org.telegram.messenger.d4.f(epVar.a).a(anVar2.a(), true, false);
                    break;
                } else {
                    epVar.dismiss();
                    break;
                }
            case 11:
                ar arVar = (ar) obj2;
                arVar.V1 = org.telegram.messenger.np.s1(arVar.a).j1(org.telegram.messenger.gj.B1((TLRPC.Peer) obj));
                arVar.dismiss();
                break;
            case 12:
                ir irVar = (ir) obj2;
                String str = (String) obj;
                if (irVar.b == null && (view2 = irVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        irVar.b = (EditText) findFocus;
                    }
                }
                if (irVar.b != null) {
                    try {
                        irVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = irVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = irVar.b.getText();
                    int length = irVar.b.getSelectionEnd() == irVar.b.length() ? -1 : str.length() + irVar.b.getSelectionStart();
                    if (irVar.b.getSelectionStart() == -1 || irVar.b.getSelectionEnd() == -1) {
                        irVar.b.setText(str);
                        EditText editText2 = irVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = irVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), irVar.b.getSelectionEnd(), str));
                        EditText editText4 = irVar.b;
                        if (length == -1) {
                            length = editText4.length();
                        }
                        editText4.setSelection(length);
                    }
                    EditText editText5 = irVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        break;
                    }
                }
                break;
            case 13:
                rr rrVar = (rr) obj2;
                qr qrVar = (qr) obj;
                rrVar.X0();
                qrVar.f = !qrVar.f;
                qrVar.j.T1.O(true);
                rrVar.I0();
                break;
            case 14:
                ((rr) obj2).x2 = !r10.x2;
                ((p41) obj).O(true);
                break;
            case 15:
                ((org.telegram.ui.p6) obj2).dismiss();
                ((org.telegram.ui.ActionBar.e2) obj).presentFragment(new org.telegram.ui.y6());
                break;
            case 16:
                wu wuVar = (wu) obj2;
                p5 p5Var = (p5) obj;
                org.telegram.ui.ActionBar.g1 g1Var = wuVar.B1;
                if (g1Var != null) {
                    g1Var.d(true);
                    wuVar.B1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.gj.U(g5.e(wuVar.a, p5Var.getDocumentId())));
                    spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.g0.g(spannableString)) {
                        org.telegram.messenger.i20.s(null, 2131751184, new cc((FrameLayout) wuVar.b, wuVar.J0));
                        break;
                    }
                }
                break;
            case 17:
                dy dyVar = (dy) obj2;
                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) obj;
                ly lyVar = dyVar.w;
                vv vvVar = lyVar.E0;
                if (vvVar.indexOfChild(i8Var) != -1 && (T = vvVar.T(i8Var)) != null) {
                    if (T.b() == lyVar.g1) {
                        if (lyVar.i1 != null) {
                            mx mxVar = lyVar.u1;
                            if (mxVar != null) {
                                mxVar.y(lyVar.K1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(lyVar.d1).g7.edit();
                            String str2 = "group_hide_stickers_" + lyVar.K1.id;
                            TLRPC.StickerSet stickerSet = lyVar.K1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            lyVar.Y(false);
                            dy dyVar2 = lyVar.z0;
                            if (dyVar2 != null) {
                                dyVar2.f();
                                break;
                            }
                        }
                    } else if (dyVar.h.get(T.b()) == lyVar.k1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.c);
                        String M0 = org.telegram.messenger.hd.M0(2131752063, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131752064, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new gx(dyVar, i13));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        t1Var.show();
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                            break;
                        }
                    }
                }
                break;
            case 18:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = FragmentContextView.X0;
                float C = MediaController.B().C(fragmentContextView.a0);
                int i21 = 0;
                while (true) {
                    if (i21 >= 3) {
                        i21 = -1;
                    } else if (C - 0.1f > fArr2[i21]) {
                        i21++;
                    }
                }
                int i22 = i21 + 1;
                if (i22 >= 3) {
                    i22 = 0;
                }
                float f11 = fArr2[i22];
                MediaController.B().m0(fragmentContextView.a0, f11);
                fragmentContextView.l(C, f11, true);
                long currentTimeMillis2 = System.currentTimeMillis();
                if (fragmentContextView.C0 == null && currentTimeMillis2 - fragmentContextView.E0 > 300) {
                    c30 c30Var = c30.w;
                    if (c30Var.c()) {
                        c30Var.b();
                        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
                        if (e2Var != null && fragmentContextView.D0 != null) {
                            hi.l3 l3Var2 = new hi.l3(fragmentContextView.getContext(), 1);
                            l3Var2.r(true);
                            l3Var2.d = 2300L;
                            l3Var2.U = true;
                            l3Var2.e = true;
                            l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                            l3Var2.v0 = -org.telegram.messenger.g0.L(6.0f);
                            fragmentContextView.C0 = l3Var2;
                            l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            if (e2Var instanceof org.telegram.ui.an) {
                                l3Var2.l(((org.telegram.ui.an) e2Var).L);
                            }
                            l3Var2.u(org.telegram.messenger.hd.M0(2131745269, null));
                            l3Var2.r0 = new z2(l3Var2, i13);
                            fragmentContextView.D0.addView(l3Var2, c8.ja.e(-1, org.telegram.messenger.ns.g2, 55));
                            l3Var2.y(fragmentContextView.H, true);
                        }
                    }
                }
                fragmentContextView.E0 = currentTimeMillis2;
                break;
            case 19:
                v00 v00Var = (v00) obj2;
                org.telegram.ui.ActionBar.p0 p0Var = (org.telegram.ui.ActionBar.p0) obj;
                int indexOf = v00Var.G.indexOf(p0Var.getFilter());
                if (v00Var.J != indexOf) {
                    v00Var.J = indexOf;
                    v00Var.e();
                    break;
                } else if (p0Var.getFilter().h) {
                    if (p0Var.a.f) {
                        jg.o0 filter = p0Var.getFilter();
                        v00Var.f(filter);
                        u00 u00Var = v00Var.I;
                        if (u00Var != null) {
                            ((org.telegram.ui.ev) u00Var).g(filter);
                            break;
                        }
                    } else {
                        p0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 20:
                ((q2) obj).a(Long.valueOf(((a10) obj2).d));
                break;
            case 21:
                ((org.telegram.ui.cp) obj).run();
                ((p20) obj2).dismiss();
                break;
            case 22:
                ((m60) obj2).u();
                ((org.telegram.ui.d80) obj).run();
                break;
            case 23:
                m60 m60Var2 = (m60) obj2;
                ((org.telegram.ui.fu) obj).run();
                if (m60Var2.J) {
                    m60Var2.u();
                    break;
                }
                break;
            case 24:
                v60 v60Var = (v60) obj2;
                t60 t60Var = (t60) obj;
                TLRPC.InputPeer j12 = org.telegram.messenger.np.s1(v60Var.a).j1(org.telegram.messenger.gj.B1(v60Var.x1));
                if (v60Var.w1 != 2) {
                    v60Var.z1 = j12;
                } else if (v60Var.x1 != v60Var.y1) {
                    t60Var.a(j12, v60Var.t1.size() > 1, false, false);
                }
                v60Var.dismiss();
                break;
            case 25:
                bd0 bd0Var = (bd0) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj;
                ArrayList arrayList3 = bd0Var.G1;
                ArrayList arrayList4 = bd0Var.H1;
                org.telegram.ui.ActionBar.e2 e2Var2 = bd0Var.t1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = bd0Var.I1;
                if (bd0Var.E1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bd0Var.getContext());
                    alertDialog$Builder2.a.S = org.telegram.messenger.hd.M0(2131754444, null);
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751717, null), org.telegram.messenger.hd.M0(2131754375, null)}, new xc0(bd0Var));
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
                    boolean z13 = e2Var2 instanceof org.telegram.ui.an;
                    if (z13) {
                        org.telegram.ui.an anVar3 = (org.telegram.ui.an) e2Var2;
                        if (anVar3.c()) {
                            t4.J(bd0Var.getContext(), anVar3.a(), new rc0(bd0Var), e6Var2);
                            break;
                        }
                    }
                    t4.X(bd0Var.a, 1, z13 ? ((org.telegram.ui.an) e2Var2).a() : 0L, new q2(bd0Var, 11));
                    break;
                }
            case 26:
                de0 de0Var = (de0) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.ActionBar.g5 g5Var = de0Var.c;
                if (g5Var.E) {
                    de0Var.H = runnable;
                    g5Var.a(true);
                    break;
                }
                break;
            case 27:
                kg0 kg0Var = (kg0) obj2;
                org.telegram.ui.tr trVar = (org.telegram.ui.tr) obj;
                if (kg0Var.K.getTag() == null) {
                    int max = (int) Math.max(1.0f, kg0Var.getValue());
                    org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) trVar.b;
                    TLRPC.User user = (TLRPC.User) trVar.c;
                    if (pa0Var.getLocationController().h(pa0Var.m0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(pa0Var.getParentActivity());
                        String M02 = org.telegram.messenger.hd.M0(2131745453, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder3.a;
                        t1Var2.S = M02;
                        t1Var2.U = org.telegram.messenger.hd.M0(2131745454, null);
                        alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131745455, null), new ai.q1(pa0Var, user, max, 12));
                        alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        pa0Var.showDialog(t1Var2);
                    } else {
                        pa0Var.O.M = true;
                        pa0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        pa0Var.w0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        pa0Var.getLocationController().o(max, pa0Var.m0, true);
                        z10 = true;
                    }
                    if (z10) {
                        kg0Var.a();
                        break;
                    }
                }
                break;
            case 28:
                og0 og0Var = (og0) obj2;
                Context context = (Context) obj;
                Uri C0 = org.telegram.messenger.g0.C0(og0Var.m1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
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
            default:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.hd.M0(2131745458, null));
                createChooser.setFlags(TLObject.FLAG_28);
                ((Context) obj).startActivity(createChooser);
                break;
        }
    }
}
