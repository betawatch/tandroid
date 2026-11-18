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
import org.telegram.ui.w81;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y7(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x082d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r8v2, types: [org.telegram.ui.Components.y60] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int J;
        ?? r72;
        String G;
        int b10;
        int i7;
        View view2;
        v4.f1 T;
        int i10 = this.a;
        int i11 = 13;
        boolean z10 = false;
        int i12 = 1;
        i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                c90 c90Var = (c90) obj;
                g8 g8Var = (g8) ((x7) obj2).G;
                int i13 = g8Var.a;
                LaunchActivity launchActivity = g8Var.A2;
                ArrayList arrayList = (ArrayList) org.telegram.messenger.mp.u1(i13).w.get(0);
                if ((arrayList != null ? arrayList.size() : 0) > 10 && !TextUtils.isEmpty(c90Var.getText().toString())) {
                    String charSequence = c90Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof org.telegram.ui.cx) {
                        org.telegram.ui.cx cxVar = (org.telegram.ui.cx) launchActivity.M().getLastFragment();
                        ArrayList arrayList2 = (ArrayList) cxVar.getMessagesController().w.get(0);
                        int size = arrayList2 != null ? arrayList2.size() : 0;
                        if (!cxVar.n2 && (size > 10 || cxVar.L)) {
                            i12 = 0;
                        }
                        if (i12 == 0) {
                            if (cxVar.l2) {
                                cxVar.Y.r.setText(charSequence);
                                cxVar.Y.r.setSelection(charSequence.length());
                                org.telegram.ui.kw kwVar = cxVar.D0;
                                if (kwVar != null && (J = kwVar.J(3)) >= 0 && cxVar.D0.getTabsView().getCurrentTabId() != J) {
                                    cxVar.D0.getTabsView().e(J, J);
                                }
                            } else {
                                cxVar.y = 3;
                                cxVar.Y.r.setText(charSequence);
                                cxVar.Y.r.setSelection(charSequence.length());
                            }
                            g8Var.dismiss();
                            break;
                        }
                    }
                    org.telegram.ui.cx cxVar2 = new org.telegram.ui.cx(null);
                    cxVar2.p2 = charSequence;
                    cxVar2.y = 3;
                    launchActivity.u0(cxVar2, false, false);
                    g8Var.dismiss();
                    break;
                }
                break;
            case 1:
                y8 y8Var = (y8) obj2;
                ((boolean[]) obj)[0] = true;
                y8Var.K.z1(y8Var.Z);
                y8Var.T.dismiss();
                break;
            case 2:
                yc ycVar = (yc) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                y60 y60Var = ycVar.X0;
                if (y60Var == null || !y60Var.E()) {
                    ycVar.d1.f(true);
                    y60 G2 = y60.G(frameLayout, new fi.b(), ycVar.V0);
                    ycVar.X0 = G2;
                    G2.s = 0;
                    G2.p(13, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.gd.M0(2131743900, null));
                    ycVar.X0.k();
                    for (int i14 : ycVar.c1) {
                        if (i14 == 0) {
                            G = org.telegram.messenger.gd.M0(2131743901, null);
                        } else if (i14 == Integer.MAX_VALUE) {
                            G = org.telegram.messenger.gd.M0(2131743899, null);
                        } else {
                            r72 = 0;
                            G = org.telegram.messenger.gd.G(i14, "Seconds", new Object[0]);
                            ycVar.X0.c(r72, G, new org.telegram.ui.ii(ycVar, i14, 6), r72);
                            if (ycVar.b1 != i14) {
                                ycVar.X0.M();
                            }
                        }
                        r72 = 0;
                        ycVar.X0.c(r72, G, new org.telegram.ui.ii(ycVar, i14, 6), r72);
                        if (ycVar.b1 != i14) {
                        }
                    }
                    ycVar.X0.a0();
                    break;
                } else {
                    ycVar.X0.v();
                    ycVar.X0 = null;
                    break;
                }
            case 3:
                kl.P((kl) obj2, (org.telegram.ui.ActionBar.i6) obj);
                break;
            case 4:
                rn rnVar = (rn) ((org.telegram.ui.l4) obj2).e;
                org.telegram.ui.f61 f61Var = rnVar.s;
                View F = f61Var.F((pn) obj);
                v4.f1 T2 = F != null ? f61Var.T(F) : null;
                if (T2 != null && (b10 = T2.b() - rnVar.u0) >= 0 && b10 < rnVar.L.length) {
                    rn.T(rnVar, b10);
                    break;
                }
                break;
            case 5:
                ao aoVar = (ao) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                org.telegram.ui.bn bnVar = aoVar.H;
                if (aoVar.U) {
                    bnVar.showDialog(b5.S(aoVar.getContext(), bnVar.h, i6Var).a);
                    break;
                } else {
                    wn wnVar = aoVar.e;
                    if (bnVar.getParentActivity() != null) {
                        TLRPC.Chat chat = bnVar.e;
                        if (chat == null || org.telegram.messenger.v3.y(13, chat)) {
                            TLRPC.ChatFull chatFull = bnVar.r8;
                            TLRPC.UserFull userFull = bnVar.s8;
                            int i15 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.messenger.pe peVar = new org.telegram.messenger.pe(aoVar.getContext(), null, new xn(aoVar, r4), true, 0, aoVar.e0);
                            peVar.u(i15);
                            yn ynVar = new yn(aoVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.b);
                            org.telegram.ui.ActionBar.h1[] h1VarArr = {ynVar};
                            ynVar.e = true;
                            ynVar.c = org.telegram.messenger.ks.x3;
                            ynVar.setOutsideTouchable(true);
                            h1VarArr[0].setClippingEnabled(true);
                            h1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            h1VarArr[0].setFocusable(true);
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            h1VarArr[0].setInputMethodMode(2);
                            h1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            h1VarArr[0].showAtLocation(wnVar, 0, (int) (aoVar.getX() + wnVar.getX()), (int) wnVar.getY());
                            bnVar.x8(false, true, 0.2f);
                            break;
                        } else if (aoVar.a.f && bnVar.getParentActivity() != null && bnVar.fragmentView != null && bnVar.r8 != null) {
                            if (bnVar.D2 == null) {
                                i7 = 0;
                                hi.m3 E6 = bnVar.E6(310.0f, 1, -1, false);
                                bnVar.D2 = E6;
                                E6.d = 4000L;
                            } else {
                                i7 = 0;
                            }
                            int i16 = bnVar.r8.ttl_period;
                            String G3 = i16 > 86400 ? org.telegram.messenger.gd.G(i16 / 86400, "Days", new Object[i7]) : i16 >= 3600 ? org.telegram.messenger.gd.G(i16 / 3600, "Hours", new Object[i7]) : i16 >= 60 ? org.telegram.messenger.gd.G(i16 / 60, "Minutes", new Object[i7]) : org.telegram.messenger.gd.G(i16, "Seconds", new Object[i7]);
                            hi.m3 m3Var = bnVar.D2;
                            Object[] objArr = new Object[1];
                            objArr[i7] = G3;
                            m3Var.v(org.telegram.messenger.gd.a0("AutoDeleteSetInfo", null, 2131753842, objArr));
                            bnVar.D2.z(bnVar.p1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 6:
                lp lpVar = (lp) obj2;
                org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) obj;
                if (lpVar.q1 != null) {
                    lpVar.q1 = null;
                    lpVar.dismiss();
                    org.telegram.messenger.f4.f(lpVar.a).a(bnVar2.a(), true, false);
                    break;
                } else {
                    lpVar.dismiss();
                    break;
                }
            case 7:
                hr hrVar = (hr) obj2;
                hrVar.V1 = org.telegram.messenger.mp.u1(hrVar.a).l1(org.telegram.messenger.fj.B1((TLRPC.Peer) obj));
                hrVar.dismiss();
                break;
            case 8:
                pr prVar = (pr) obj2;
                String str = (String) obj;
                if (prVar.b == null && (view2 = prVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        prVar.b = (EditText) findFocus;
                    }
                }
                if (prVar.b != null) {
                    try {
                        prVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = prVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = prVar.b.getText();
                    int length = prVar.b.getSelectionEnd() == prVar.b.length() ? -1 : str.length() + prVar.b.getSelectionStart();
                    if (prVar.b.getSelectionStart() == -1 || prVar.b.getSelectionEnd() == -1) {
                        prVar.b.setText(str);
                        EditText editText2 = prVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = prVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), prVar.b.getSelectionEnd(), str));
                        EditText editText4 = prVar.b;
                        if (length == -1) {
                            length = editText4.length();
                        }
                        editText4.setSelection(length);
                    }
                    EditText editText5 = prVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        break;
                    }
                }
                break;
            case 9:
                yr yrVar = (yr) obj2;
                xr xrVar = (xr) obj;
                yrVar.Y0();
                xrVar.f = !xrVar.f;
                xrVar.j.T1.O(true);
                yrVar.J0();
                break;
            case 10:
                ((yr) obj2).x2 = !r15.x2;
                ((z41) obj).O(true);
                break;
            case 11:
                ((org.telegram.ui.o6) obj2).dismiss();
                ((org.telegram.ui.ActionBar.h2) obj).presentFragment(new org.telegram.ui.x6());
                break;
            case 12:
                bv bvVar = (bv) obj2;
                x5 x5Var = (x5) obj;
                org.telegram.ui.ActionBar.h1 h1Var = bvVar.B1;
                if (h1Var != null) {
                    h1Var.d(true);
                    bvVar.B1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(o5.e(bvVar.a, x5Var.getDocumentId())));
                    spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.g0.g(spannableString)) {
                        org.telegram.messenger.n10.t(null, 2131751173, new lc((FrameLayout) bvVar.b, bvVar.J0));
                        break;
                    }
                }
                break;
            case 13:
                jy jyVar = (jy) obj2;
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) obj;
                ry ryVar = jyVar.w;
                aw awVar = ryVar.E0;
                if (awVar.indexOfChild(k8Var) != -1 && (T = awVar.T(k8Var)) != null) {
                    if (T.b() == ryVar.g1) {
                        if (ryVar.i1 != null) {
                            rx rxVar = ryVar.u1;
                            if (rxVar != null) {
                                rxVar.y(ryVar.K1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(ryVar.d1).i7.edit();
                            String str2 = "group_hide_stickers_" + ryVar.K1.id;
                            TLRPC.StickerSet stickerSet = ryVar.K1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            ryVar.Y(false);
                            jy jyVar2 = ryVar.z0;
                            if (jyVar2 != null) {
                                jyVar2.f();
                                break;
                            }
                        }
                    } else if (jyVar.h.get(T.b()) == ryVar.k1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jyVar.c);
                        String M0 = org.telegram.messenger.gd.M0(2131752052, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131752053, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, null), new iy(jyVar, 0));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        u1Var.show();
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.X0;
                float C = MediaController.B().C(fragmentContextView.a0);
                int i17 = 0;
                while (true) {
                    if (i17 >= 3) {
                        i17 = -1;
                    } else if (C - 0.1f > fArr[i17]) {
                        i17++;
                    }
                }
                int i18 = i17 + 1;
                if (i18 >= 3) {
                    i18 = 0;
                }
                float f10 = fArr[i18];
                MediaController.B().m0(fragmentContextView.a0, f10);
                fragmentContextView.l(C, f10, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.C0 == null && currentTimeMillis - fragmentContextView.E0 > 300) {
                    k30 k30Var = k30.w;
                    if (k30Var.c()) {
                        k30Var.b();
                        org.telegram.ui.ActionBar.h2 h2Var = fragmentContextView.h;
                        if (h2Var != null && fragmentContextView.D0 != null) {
                            hi.m3 m3Var2 = new hi.m3(fragmentContextView.getContext(), 1);
                            m3Var2.r(true);
                            m3Var2.d = 2300L;
                            m3Var2.U = true;
                            m3Var2.e = true;
                            m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                            m3Var2.v0 = -org.telegram.messenger.g0.L(6.0f);
                            fragmentContextView.C0 = m3Var2;
                            m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            if (h2Var instanceof org.telegram.ui.bn) {
                                m3Var2.l(((org.telegram.ui.bn) h2Var).L);
                            }
                            m3Var2.v(org.telegram.messenger.gd.M0(2131745034, null));
                            m3Var2.r0 = new h3(m3Var2, i12);
                            fragmentContextView.D0.addView(m3Var2, c8.ma.e(-1, org.telegram.messenger.ks.g2, 55));
                            m3Var2.z(fragmentContextView.H, true);
                        }
                    }
                }
                fragmentContextView.E0 = currentTimeMillis;
                break;
            case 15:
                c10 c10Var = (c10) obj2;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                int indexOf = c10Var.G.indexOf(q0Var.getFilter());
                if (c10Var.J != indexOf) {
                    c10Var.J = indexOf;
                    c10Var.e();
                    break;
                } else if (q0Var.getFilter().h) {
                    if (q0Var.a.f) {
                        jg.o0 filter = q0Var.getFilter();
                        c10Var.f(filter);
                        b10 b10Var = c10Var.I;
                        if (b10Var != null) {
                            ((org.telegram.ui.hv) b10Var).e(filter);
                            break;
                        }
                    } else {
                        q0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 16:
                ((y2) obj).a(Long.valueOf(((h10) obj2).d));
                break;
            case 17:
                ((org.telegram.ui.ep) obj).run();
                ((x20) obj2).dismiss();
                break;
            case 18:
                ((y60) obj2).v();
                ((org.telegram.ui.g80) obj).run();
                break;
            case 19:
                y60 y60Var2 = (y60) obj2;
                ((org.telegram.ui.vu) obj).run();
                if (y60Var2.J) {
                    y60Var2.v();
                    break;
                }
                break;
            case 20:
                g70 g70Var = (g70) obj2;
                e70 e70Var = (e70) obj;
                TLRPC.InputPeer l1 = org.telegram.messenger.mp.u1(g70Var.a).l1(org.telegram.messenger.fj.B1(g70Var.x1));
                if (g70Var.w1 != 2) {
                    g70Var.z1 = l1;
                } else if (g70Var.x1 != g70Var.y1) {
                    e70Var.a(l1, g70Var.t1.size() > 1, false, false);
                }
                g70Var.dismiss();
                break;
            case 21:
                ld0 ld0Var = (ld0) obj2;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                ArrayList arrayList3 = ld0Var.G1;
                ArrayList arrayList4 = ld0Var.H1;
                org.telegram.ui.ActionBar.h2 h2Var2 = ld0Var.t1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = ld0Var.I1;
                if (ld0Var.E1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ld0Var.getContext());
                    alertDialog$Builder2.a.S = org.telegram.messenger.gd.M0(2131754442, null);
                    alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.gd.M0(2131751706, null), org.telegram.messenger.gd.M0(2131754373, null)}, new hd0(ld0Var));
                    alertDialog$Builder2.p();
                    break;
                } else {
                    StringBuilder sb2 = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.i5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                    int lastIndexOf = sb2.lastIndexOf("END:VCARD");
                    if (lastIndexOf >= 0) {
                        tL_userContact_old2.phone = null;
                        int size2 = arrayList4.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.messenger.f0 f0Var = (org.telegram.messenger.f0) arrayList4.get(size2);
                            boolean z11 = f0Var.d;
                            ?? r82 = f0Var.a;
                            if (z11) {
                                if (tL_userContact_old2.phone == null) {
                                    tL_userContact_old2.phone = f0Var.c(z10);
                                }
                                for (?? r73 = z10; r73 < r82.size(); r73++) {
                                    sb2.insert(lastIndexOf, ((String) r82.get(r73)) + "\n");
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
                    boolean z13 = h2Var2 instanceof org.telegram.ui.bn;
                    if (z13) {
                        org.telegram.ui.bn bnVar3 = (org.telegram.ui.bn) h2Var2;
                        if (bnVar3.c()) {
                            b5.J(ld0Var.getContext(), bnVar3.a(), new bd0(ld0Var), i6Var2);
                            break;
                        }
                    }
                    b5.X(ld0Var.a, 1, z13 ? ((org.telegram.ui.bn) h2Var2).a() : 0L, new y2(ld0Var, 11));
                    break;
                }
            case 22:
                ne0 ne0Var = (ne0) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.ActionBar.k5 k5Var = ne0Var.c;
                if (k5Var.I) {
                    ne0Var.H = runnable;
                    k5Var.a(true);
                    break;
                }
                break;
            case 23:
                ug0 ug0Var = (ug0) obj2;
                org.telegram.ui.at atVar = (org.telegram.ui.at) obj;
                if (ug0Var.K.getTag() == null) {
                    int max = (int) Math.max(1.0f, ug0Var.getValue());
                    org.telegram.ui.qa0 qa0Var = (org.telegram.ui.qa0) atVar.b;
                    TLRPC.User user = (TLRPC.User) atVar.c;
                    if (qa0Var.getLocationController().h(qa0Var.m0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(qa0Var.getParentActivity());
                        String M02 = org.telegram.messenger.gd.M0(2131745258, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder3.a;
                        u1Var2.S = M02;
                        u1Var2.U = org.telegram.messenger.gd.M0(2131745259, null);
                        alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131745260, null), new ai.r1(qa0Var, user, max, i11));
                        alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        qa0Var.showDialog(u1Var2);
                    } else {
                        qa0Var.O.M = true;
                        qa0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        qa0Var.w0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        qa0Var.getLocationController().o(max, qa0Var.m0, true);
                        z10 = true;
                    }
                    if (z10) {
                        ug0Var.a();
                        break;
                    }
                }
                break;
            case 24:
                yg0 yg0Var = (yg0) obj2;
                Context context = (Context) obj;
                Uri C0 = org.telegram.messenger.g0.C0(yg0Var.m1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.g0.W(context).startActivityForResult(Intent.createChooser(intent, yg0Var.m0.getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                break;
            case 25:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.gd.M0(2131745263, null));
                createChooser.setFlags(TLObject.FLAG_28);
                ((Context) obj).startActivity(createChooser);
                break;
            case 26:
                org.telegram.ui.ns.p().u(((ew0) obj2).r.h2);
                org.telegram.ui.ns.p().x((org.telegram.ui.Cells.a8) obj);
                break;
            case 27:
                org.telegram.messenger.g0.g((CharSequence) obj2);
                ((Runnable) obj).run();
                break;
            case 28:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.x2) obj2).dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.mp.g1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                ((f11) obj2).e();
                org.telegram.ui.bn bnVar4 = ((org.telegram.ui.ek) obj).a;
                w81 f02 = w81.f0(-bnVar4.l6, 0L);
                f02.E = bnVar4;
                bnVar4.presentFragment(f02);
                break;
        }
    }
}
