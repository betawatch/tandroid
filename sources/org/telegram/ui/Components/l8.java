package org.telegram.ui.Components;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.u81;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l8(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0859 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.Components.x60] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ?? r72;
        String G;
        int b10;
        int i7;
        View view2;
        v4.f1 T;
        int i10 = this.a;
        int i11 = 13;
        boolean z10 = false;
        boolean z11 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                x8 x8Var = (x8) obj2;
                ((boolean[]) obj)[0] = true;
                x8Var.K.z1(x8Var.Z);
                x8Var.T.dismiss();
                break;
            case 1:
                yc ycVar = (yc) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                x60 x60Var = ycVar.X0;
                if (x60Var == null || !x60Var.E()) {
                    ycVar.d1.f(true);
                    x60 G2 = x60.G(frameLayout, new fi.b(), ycVar.V0);
                    ycVar.X0 = G2;
                    G2.s = 0;
                    G2.p(13, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.gd.N0(2131743890, null));
                    ycVar.X0.k();
                    for (int i12 : ycVar.c1) {
                        if (i12 == 0) {
                            G = org.telegram.messenger.gd.N0(2131743891, null);
                        } else if (i12 == Integer.MAX_VALUE) {
                            G = org.telegram.messenger.gd.N0(2131743889, null);
                        } else {
                            r72 = 0;
                            G = org.telegram.messenger.gd.G(i12, "Seconds", new Object[0]);
                            ycVar.X0.c(r72, G, new org.telegram.ui.ii(ycVar, i12, 8), r72);
                            if (ycVar.b1 != i12) {
                                ycVar.X0.M();
                            }
                        }
                        r72 = 0;
                        ycVar.X0.c(r72, G, new org.telegram.ui.ii(ycVar, i12, 8), r72);
                        if (ycVar.b1 != i12) {
                        }
                    }
                    ycVar.X0.a0();
                    break;
                } else {
                    ycVar.X0.v();
                    ycVar.X0 = null;
                    break;
                }
                break;
            case 2:
                kl.P((kl) obj2, (org.telegram.ui.ActionBar.i6) obj);
                break;
            case 3:
                qn qnVar = (qn) ((org.telegram.ui.l4) obj2).e;
                org.telegram.ui.d61 d61Var = qnVar.s;
                View F = d61Var.F((on) obj);
                v4.f1 T2 = F != null ? d61Var.T(F) : null;
                if (T2 != null && (b10 = T2.b() - qnVar.u0) >= 0 && b10 < qnVar.L.length) {
                    qn.T(qnVar, b10);
                    break;
                }
                break;
            case 4:
                zn znVar = (zn) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                org.telegram.ui.bn bnVar = znVar.H;
                if (znVar.U) {
                    bnVar.showDialog(b5.S(znVar.getContext(), bnVar.h, i6Var).a);
                    break;
                } else {
                    vn vnVar = znVar.e;
                    if (bnVar.getParentActivity() != null) {
                        TLRPC.Chat chat = bnVar.e;
                        if (chat == null || org.telegram.messenger.v3.y(13, chat)) {
                            TLRPC.ChatFull chatFull = bnVar.r8;
                            TLRPC.UserFull userFull = bnVar.s8;
                            int i13 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.messenger.pe peVar = new org.telegram.messenger.pe(znVar.getContext(), null, new wn(znVar, r4), true, 0, znVar.e0);
                            peVar.u(i13);
                            xn xnVar = new xn(znVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.b);
                            org.telegram.ui.ActionBar.g1[] g1VarArr = {xnVar};
                            xnVar.e = true;
                            xnVar.c = org.telegram.messenger.ks.x3;
                            xnVar.setOutsideTouchable(true);
                            g1VarArr[0].setClippingEnabled(true);
                            g1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            g1VarArr[0].setFocusable(true);
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            g1VarArr[0].setInputMethodMode(2);
                            g1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            g1VarArr[0].showAtLocation(vnVar, 0, (int) (znVar.getX() + vnVar.getX()), (int) vnVar.getY());
                            bnVar.x8(false, true, 0.2f);
                            break;
                        } else if (znVar.a.f && bnVar.getParentActivity() != null && bnVar.fragmentView != null && bnVar.r8 != null) {
                            if (bnVar.D2 == null) {
                                i7 = 0;
                                hi.u3 E6 = bnVar.E6(310.0f, 1, -1, false);
                                bnVar.D2 = E6;
                                E6.d = 4000L;
                            } else {
                                i7 = 0;
                            }
                            int i14 = bnVar.r8.ttl_period;
                            String G3 = i14 > 86400 ? org.telegram.messenger.gd.G(i14 / 86400, "Days", new Object[i7]) : i14 >= 3600 ? org.telegram.messenger.gd.G(i14 / 3600, "Hours", new Object[i7]) : i14 >= 60 ? org.telegram.messenger.gd.G(i14 / 60, "Minutes", new Object[i7]) : org.telegram.messenger.gd.G(i14, "Seconds", new Object[i7]);
                            hi.u3 u3Var = bnVar.D2;
                            Object[] objArr = new Object[1];
                            objArr[i7] = G3;
                            u3Var.v(org.telegram.messenger.gd.a0("AutoDeleteSetInfo", null, 2131753841, objArr));
                            bnVar.D2.z(bnVar.p1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 5:
                kp kpVar = (kp) obj2;
                org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) obj;
                if (kpVar.q1 != null) {
                    kpVar.q1 = null;
                    kpVar.dismiss();
                    org.telegram.messenger.f4.f(kpVar.a).a(bnVar2.a(), true, false);
                    break;
                } else {
                    kpVar.dismiss();
                    break;
                }
            case 6:
                gr grVar = (gr) obj2;
                grVar.V1 = org.telegram.messenger.mp.u1(grVar.a).l1(org.telegram.messenger.fj.B1((TLRPC.Peer) obj));
                grVar.dismiss();
                break;
            case 7:
                or orVar = (or) obj2;
                String str = (String) obj;
                if (orVar.b == null && (view2 = orVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        orVar.b = (EditText) findFocus;
                    }
                }
                if (orVar.b != null) {
                    try {
                        orVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = orVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = orVar.b.getText();
                    int length = orVar.b.getSelectionEnd() == orVar.b.length() ? -1 : str.length() + orVar.b.getSelectionStart();
                    if (orVar.b.getSelectionStart() == -1 || orVar.b.getSelectionEnd() == -1) {
                        orVar.b.setText(str);
                        EditText editText2 = orVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = orVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), orVar.b.getSelectionEnd(), str));
                        EditText editText4 = orVar.b;
                        if (length == -1) {
                            length = editText4.length();
                        }
                        editText4.setSelection(length);
                    }
                    EditText editText5 = orVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        break;
                    }
                }
                break;
            case 8:
                xr xrVar = (xr) obj2;
                wr wrVar = (wr) obj;
                xrVar.Y0();
                wrVar.f = !wrVar.f;
                wrVar.j.T1.O(true);
                xrVar.J0();
                break;
            case 9:
                ((xr) obj2).x2 = !r15.x2;
                ((b51) obj).O(true);
                break;
            case 10:
                ((org.telegram.ui.p6) obj2).dismiss();
                ((org.telegram.ui.ActionBar.g2) obj).presentFragment(new org.telegram.ui.y6());
                break;
            case 11:
                bv bvVar = (bv) obj2;
                x5 x5Var = (x5) obj;
                org.telegram.ui.ActionBar.g1 g1Var = bvVar.B1;
                if (g1Var != null) {
                    g1Var.d(true);
                    bvVar.B1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(o5.e(bvVar.a, x5Var.getDocumentId())));
                    spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.g0.g(spannableString)) {
                        org.telegram.messenger.m10.t(null, 2131751172, new kc((FrameLayout) bvVar.b, bvVar.J0));
                        break;
                    }
                }
                break;
            case 12:
                iy iyVar = (iy) obj2;
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) obj;
                qy qyVar = iyVar.w;
                aw awVar = qyVar.E0;
                if (awVar.indexOfChild(j8Var) != -1 && (T = awVar.T(j8Var)) != null) {
                    if (T.b() == qyVar.g1) {
                        if (qyVar.i1 != null) {
                            qx qxVar = qyVar.u1;
                            if (qxVar != null) {
                                qxVar.y(qyVar.K1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(qyVar.d1).i7.edit();
                            String str2 = "group_hide_stickers_" + qyVar.K1.id;
                            TLRPC.StickerSet stickerSet = qyVar.K1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            qyVar.Y(false);
                            iy iyVar2 = qyVar.z0;
                            if (iyVar2 != null) {
                                iyVar2.f();
                                break;
                            }
                        }
                    } else if (iyVar.h.get(T.b()) == qyVar.k1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iyVar.c);
                        String N0 = org.telegram.messenger.gd.N0(2131752051, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131752052, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752087, null), new hy(iyVar, 0));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        t1Var.show();
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.X0;
                float C = MediaController.B().C(fragmentContextView.a0);
                int i15 = 0;
                while (true) {
                    if (i15 >= 3) {
                        i15 = -1;
                    } else if (C - 0.1f > fArr[i15]) {
                        i15++;
                    }
                }
                int i16 = i15 + 1;
                if (i16 >= 3) {
                    i16 = 0;
                }
                float f10 = fArr[i16];
                MediaController.B().m0(fragmentContextView.a0, f10);
                fragmentContextView.l(C, f10, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.C0 == null && currentTimeMillis - fragmentContextView.E0 > 300) {
                    k30 k30Var = k30.w;
                    if (k30Var.c()) {
                        k30Var.b();
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (g2Var != null && fragmentContextView.D0 != null) {
                            hi.u3 u3Var2 = new hi.u3(fragmentContextView.getContext(), 1);
                            u3Var2.r(true);
                            u3Var2.d = 2300L;
                            u3Var2.U = true;
                            u3Var2.e = true;
                            u3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                            u3Var2.v0 = -org.telegram.messenger.g0.L(6.0f);
                            fragmentContextView.C0 = u3Var2;
                            u3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            if (g2Var instanceof org.telegram.ui.bn) {
                                u3Var2.l(((org.telegram.ui.bn) g2Var).L);
                            }
                            u3Var2.v(org.telegram.messenger.gd.N0(2131745028, null));
                            u3Var2.r0 = new h3(u3Var2, z11 ? 1 : 0);
                            fragmentContextView.D0.addView(u3Var2, c8.na.e(-1, org.telegram.messenger.ks.g2, 55));
                            u3Var2.z(fragmentContextView.H, true);
                        }
                    }
                }
                fragmentContextView.E0 = currentTimeMillis;
                break;
            case 14:
                c10 c10Var = (c10) obj2;
                org.telegram.ui.ActionBar.p0 p0Var = (org.telegram.ui.ActionBar.p0) obj;
                int indexOf = c10Var.G.indexOf(p0Var.getFilter());
                if (c10Var.J != indexOf) {
                    c10Var.J = indexOf;
                    c10Var.e();
                    break;
                } else if (p0Var.getFilter().h) {
                    if (p0Var.a.f) {
                        jg.o0 filter = p0Var.getFilter();
                        c10Var.f(filter);
                        b10 b10Var = c10Var.I;
                        if (b10Var != null) {
                            ((org.telegram.ui.gv) b10Var).e(filter);
                            break;
                        }
                    } else {
                        p0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 15:
                ((y2) obj).a(Long.valueOf(((i10) obj2).d));
                break;
            case 16:
                ((org.telegram.ui.dp) obj).run();
                ((x20) obj2).dismiss();
                break;
            case 17:
                ((x60) obj2).v();
                ((org.telegram.ui.f80) obj).run();
                break;
            case 18:
                x60 x60Var2 = (x60) obj2;
                ((org.telegram.ui.uu) obj).run();
                if (x60Var2.J) {
                    x60Var2.v();
                    break;
                }
                break;
            case 19:
                f70 f70Var = (f70) obj2;
                d70 d70Var = (d70) obj;
                TLRPC.InputPeer l1 = org.telegram.messenger.mp.u1(f70Var.a).l1(org.telegram.messenger.fj.B1(f70Var.x1));
                if (f70Var.w1 != 2) {
                    f70Var.z1 = l1;
                } else if (f70Var.x1 != f70Var.y1) {
                    d70Var.a(l1, f70Var.t1.size() > 1, false, false);
                }
                f70Var.dismiss();
                break;
            case 20:
                kd0 kd0Var = (kd0) obj2;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                ArrayList arrayList = kd0Var.G1;
                ArrayList arrayList2 = kd0Var.H1;
                org.telegram.ui.ActionBar.g2 g2Var2 = kd0Var.t1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = kd0Var.I1;
                if (kd0Var.E1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kd0Var.getContext());
                    alertDialog$Builder2.a.S = org.telegram.messenger.gd.N0(2131754441, null);
                    alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131751705, null), org.telegram.messenger.gd.N0(2131754372, null)}, new gd0(kd0Var));
                    alertDialog$Builder2.p();
                    break;
                } else {
                    StringBuilder sb2 = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.i5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                    int lastIndexOf = sb2.lastIndexOf("END:VCARD");
                    if (lastIndexOf >= 0) {
                        tL_userContact_old2.phone = null;
                        int size = arrayList2.size() - 1;
                        while (size >= 0) {
                            org.telegram.messenger.f0 f0Var = (org.telegram.messenger.f0) arrayList2.get(size);
                            boolean z12 = f0Var.d;
                            ?? r82 = f0Var.a;
                            if (z12) {
                                if (tL_userContact_old2.phone == null) {
                                    tL_userContact_old2.phone = f0Var.c(z10);
                                }
                                for (?? r73 = z10; r73 < r82.size(); r73++) {
                                    sb2.insert(lastIndexOf, ((String) r82.get(r73)) + "\n");
                                }
                            }
                            size--;
                            z10 = false;
                        }
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            org.telegram.messenger.f0 f0Var2 = (org.telegram.messenger.f0) arrayList.get(size2);
                            boolean z13 = f0Var2.d;
                            ArrayList arrayList3 = f0Var2.a;
                            if (z13) {
                                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3 += -1) {
                                    sb2.insert(lastIndexOf, ((String) arrayList3.get(size3)) + "\n");
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
                    boolean z14 = g2Var2 instanceof org.telegram.ui.bn;
                    if (z14) {
                        org.telegram.ui.bn bnVar3 = (org.telegram.ui.bn) g2Var2;
                        if (bnVar3.c()) {
                            b5.J(kd0Var.getContext(), bnVar3.a(), new ad0(kd0Var), i6Var2);
                            break;
                        }
                    }
                    b5.X(kd0Var.a, 1, z14 ? ((org.telegram.ui.bn) g2Var2).a() : 0L, new y2(kd0Var, 11));
                    break;
                }
            case 21:
                vg0 vg0Var = (vg0) obj2;
                org.telegram.ui.zs zsVar = (org.telegram.ui.zs) obj;
                if (vg0Var.K.getTag() == null) {
                    int max = (int) Math.max(1.0f, vg0Var.getValue());
                    org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) zsVar.b;
                    TLRPC.User user = (TLRPC.User) zsVar.c;
                    if (pa0Var.getLocationController().h(pa0Var.m0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(pa0Var.getParentActivity());
                        String N02 = org.telegram.messenger.gd.N0(2131745257, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder3.a;
                        t1Var2.S = N02;
                        t1Var2.U = org.telegram.messenger.gd.N0(2131745258, null);
                        alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131745259, null), new ai.o1(pa0Var, user, max, i11));
                        alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        pa0Var.showDialog(t1Var2);
                    } else {
                        pa0Var.O.M = true;
                        pa0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        pa0Var.w0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        pa0Var.getLocationController().o(max, pa0Var.m0, true);
                        z10 = true;
                    }
                    if (z10) {
                        vg0Var.a();
                        break;
                    }
                }
                break;
            case 22:
                zg0 zg0Var = (zg0) obj2;
                Context context = (Context) obj;
                Uri C0 = org.telegram.messenger.g0.C0(zg0Var.m1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.g0.W(context).startActivityForResult(Intent.createChooser(intent, zg0Var.m0.getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                break;
            case 23:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.gd.N0(2131745262, null));
                createChooser.setFlags(TLObject.FLAG_28);
                ((Context) obj).startActivity(createChooser);
                break;
            case 24:
                org.telegram.ui.ns.p().u(((fw0) obj2).r.h2);
                org.telegram.ui.ns.p().x((org.telegram.ui.Cells.z7) obj);
                break;
            case 25:
                org.telegram.messenger.g0.g((CharSequence) obj2);
                ((Runnable) obj).run();
                break;
            case 26:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.w2) obj2).dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.mp.g1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 27:
                ((f11) obj2).e();
                org.telegram.ui.bn bnVar4 = ((org.telegram.ui.ek) obj).a;
                u81 f02 = u81.f0(-bnVar4.l6, 0L);
                f02.E = bnVar4;
                bnVar4.presentFragment(f02);
                break;
            case 28:
                l31 l31Var = (l31) obj2;
                l31Var.g2 = false;
                l31Var.Y0();
                ((b51) obj).O(true);
                l31Var.J0();
                break;
            default:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                ImageView imageView = ((g31) obj2).s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(kr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
