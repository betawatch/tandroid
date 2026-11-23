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
import org.telegram.ui.w81;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m8(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0858 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.Components.a70] */
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
                y8 y8Var = (y8) obj2;
                ((boolean[]) obj)[0] = true;
                y8Var.K.z1(y8Var.Z);
                y8Var.T.dismiss();
                break;
            case 1:
                yc ycVar = (yc) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                a70 a70Var = ycVar.X0;
                if (a70Var == null || !a70Var.E()) {
                    ycVar.d1.f(true);
                    a70 G2 = a70.G(frameLayout, new fi.b(), ycVar.V0);
                    ycVar.X0 = G2;
                    G2.s = 0;
                    G2.p(13, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.hd.N0(2131743892, null));
                    ycVar.X0.k();
                    for (int i12 : ycVar.c1) {
                        if (i12 == 0) {
                            G = org.telegram.messenger.hd.N0(2131743893, null);
                        } else if (i12 == Integer.MAX_VALUE) {
                            G = org.telegram.messenger.hd.N0(2131743891, null);
                        } else {
                            r72 = 0;
                            G = org.telegram.messenger.hd.G(i12, "Seconds", new Object[0]);
                            ycVar.X0.c(r72, G, new org.telegram.ui.ii(ycVar, i12, 6), r72);
                            if (ycVar.b1 != i12) {
                                ycVar.X0.M();
                            }
                        }
                        r72 = 0;
                        ycVar.X0.c(r72, G, new org.telegram.ui.ii(ycVar, i12, 6), r72);
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
                ml.P((ml) obj2, (org.telegram.ui.ActionBar.h6) obj);
                break;
            case 3:
                tn tnVar = (tn) ((org.telegram.ui.l4) obj2).e;
                org.telegram.ui.f61 f61Var = tnVar.s;
                View F = f61Var.F((rn) obj);
                v4.f1 T2 = F != null ? f61Var.T(F) : null;
                if (T2 != null && (b10 = T2.b() - tnVar.u0) >= 0 && b10 < tnVar.L.length) {
                    tn.T(tnVar, b10);
                    break;
                }
                break;
            case 4:
                co coVar = (co) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                org.telegram.ui.bn bnVar = coVar.H;
                if (coVar.U) {
                    bnVar.showDialog(c5.S(coVar.getContext(), bnVar.h, h6Var).a);
                    break;
                } else {
                    yn ynVar = coVar.e;
                    if (bnVar.getParentActivity() != null) {
                        TLRPC.Chat chat = bnVar.e;
                        if (chat == null || org.telegram.messenger.v3.y(13, chat)) {
                            TLRPC.ChatFull chatFull = bnVar.r8;
                            TLRPC.UserFull userFull = bnVar.s8;
                            int i13 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.messenger.qe qeVar = new org.telegram.messenger.qe(coVar.getContext(), null, new zn(coVar, r4), true, 0, coVar.e0);
                            qeVar.u(i13);
                            ao aoVar = new ao(coVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b);
                            org.telegram.ui.ActionBar.g1[] g1VarArr = {aoVar};
                            aoVar.e = true;
                            aoVar.c = org.telegram.messenger.ls.x3;
                            aoVar.setOutsideTouchable(true);
                            g1VarArr[0].setClippingEnabled(true);
                            g1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            g1VarArr[0].setFocusable(true);
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            g1VarArr[0].setInputMethodMode(2);
                            g1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            g1VarArr[0].showAtLocation(ynVar, 0, (int) (coVar.getX() + ynVar.getX()), (int) ynVar.getY());
                            bnVar.x8(false, true, 0.2f);
                            break;
                        } else if (coVar.a.f && bnVar.getParentActivity() != null && bnVar.fragmentView != null && bnVar.r8 != null) {
                            if (bnVar.D2 == null) {
                                i7 = 0;
                                hi.l3 E6 = bnVar.E6(310.0f, 1, -1, false);
                                bnVar.D2 = E6;
                                E6.d = 4000L;
                            } else {
                                i7 = 0;
                            }
                            int i14 = bnVar.r8.ttl_period;
                            String G3 = i14 > 86400 ? org.telegram.messenger.hd.G(i14 / 86400, "Days", new Object[i7]) : i14 >= 3600 ? org.telegram.messenger.hd.G(i14 / 3600, "Hours", new Object[i7]) : i14 >= 60 ? org.telegram.messenger.hd.G(i14 / 60, "Minutes", new Object[i7]) : org.telegram.messenger.hd.G(i14, "Seconds", new Object[i7]);
                            hi.l3 l3Var = bnVar.D2;
                            Object[] objArr = new Object[1];
                            objArr[i7] = G3;
                            l3Var.v(org.telegram.messenger.hd.a0("AutoDeleteSetInfo", null, 2131753841, objArr));
                            bnVar.D2.z(bnVar.p1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 5:
                np npVar = (np) obj2;
                org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) obj;
                if (npVar.q1 != null) {
                    npVar.q1 = null;
                    npVar.dismiss();
                    org.telegram.messenger.f4.f(npVar.a).a(bnVar2.a(), true, false);
                    break;
                } else {
                    npVar.dismiss();
                    break;
                }
            case 6:
                jr jrVar = (jr) obj2;
                jrVar.V1 = org.telegram.messenger.np.u1(jrVar.a).l1(org.telegram.messenger.gj.B1((TLRPC.Peer) obj));
                jrVar.dismiss();
                break;
            case 7:
                rr rrVar = (rr) obj2;
                String str = (String) obj;
                if (rrVar.b == null && (view2 = rrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        rrVar.b = (EditText) findFocus;
                    }
                }
                if (rrVar.b != null) {
                    try {
                        rrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = rrVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = rrVar.b.getText();
                    int length = rrVar.b.getSelectionEnd() == rrVar.b.length() ? -1 : str.length() + rrVar.b.getSelectionStart();
                    if (rrVar.b.getSelectionStart() == -1 || rrVar.b.getSelectionEnd() == -1) {
                        rrVar.b.setText(str);
                        EditText editText2 = rrVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = rrVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), rrVar.b.getSelectionEnd(), str));
                        EditText editText4 = rrVar.b;
                        if (length == -1) {
                            length = editText4.length();
                        }
                        editText4.setSelection(length);
                    }
                    EditText editText5 = rrVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        break;
                    }
                }
                break;
            case 8:
                as asVar = (as) obj2;
                zr zrVar = (zr) obj;
                asVar.Y0();
                zrVar.f = !zrVar.f;
                zrVar.j.T1.O(true);
                asVar.J0();
                break;
            case 9:
                ((as) obj2).x2 = !r15.x2;
                ((c51) obj).O(true);
                break;
            case 10:
                ((org.telegram.ui.o6) obj2).dismiss();
                ((org.telegram.ui.ActionBar.g2) obj).presentFragment(new org.telegram.ui.x6());
                break;
            case 11:
                ev evVar = (ev) obj2;
                y5 y5Var = (y5) obj;
                org.telegram.ui.ActionBar.g1 g1Var = evVar.B1;
                if (g1Var != null) {
                    g1Var.d(true);
                    evVar.B1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.gj.U(p5.e(evVar.a, y5Var.getDocumentId())));
                    spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.g0.g(spannableString)) {
                        org.telegram.messenger.o10.t(null, 2131751172, new lc((FrameLayout) evVar.b, evVar.J0));
                        break;
                    }
                }
                break;
            case 12:
                ly lyVar = (ly) obj2;
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) obj;
                ty tyVar = lyVar.w;
                dw dwVar = tyVar.E0;
                if (dwVar.indexOfChild(k8Var) != -1 && (T = dwVar.T(k8Var)) != null) {
                    if (T.b() == tyVar.g1) {
                        if (tyVar.i1 != null) {
                            tx txVar = tyVar.u1;
                            if (txVar != null) {
                                txVar.y(tyVar.K1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.np.u1(tyVar.d1).i7.edit();
                            String str2 = "group_hide_stickers_" + tyVar.K1.id;
                            TLRPC.StickerSet stickerSet = tyVar.K1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            tyVar.Y(false);
                            ly lyVar2 = tyVar.z0;
                            if (lyVar2 != null) {
                                lyVar2.f();
                                break;
                            }
                        }
                    } else if (lyVar.h.get(T.b()) == tyVar.k1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lyVar.c);
                        String N0 = org.telegram.messenger.hd.N0(2131752051, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131752052, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752087, null), new ky(lyVar, 0));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        t1Var.show();
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
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
                    n30 n30Var = n30.w;
                    if (n30Var.c()) {
                        n30Var.b();
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (g2Var != null && fragmentContextView.D0 != null) {
                            hi.l3 l3Var2 = new hi.l3(fragmentContextView.getContext(), 1);
                            l3Var2.r(true);
                            l3Var2.d = 2300L;
                            l3Var2.U = true;
                            l3Var2.e = true;
                            l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                            l3Var2.v0 = -org.telegram.messenger.g0.L(6.0f);
                            fragmentContextView.C0 = l3Var2;
                            l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            if (g2Var instanceof org.telegram.ui.bn) {
                                l3Var2.l(((org.telegram.ui.bn) g2Var).L);
                            }
                            l3Var2.v(org.telegram.messenger.hd.N0(2131745026, null));
                            l3Var2.r0 = new i3(l3Var2, z11 ? 1 : 0);
                            fragmentContextView.D0.addView(l3Var2, c8.ma.e(-1, org.telegram.messenger.ls.g2, 55));
                            l3Var2.z(fragmentContextView.H, true);
                        }
                    }
                }
                fragmentContextView.E0 = currentTimeMillis;
                break;
            case 14:
                e10 e10Var = (e10) obj2;
                org.telegram.ui.ActionBar.p0 p0Var = (org.telegram.ui.ActionBar.p0) obj;
                int indexOf = e10Var.G.indexOf(p0Var.getFilter());
                if (e10Var.J != indexOf) {
                    e10Var.J = indexOf;
                    e10Var.e();
                    break;
                } else if (p0Var.getFilter().h) {
                    if (p0Var.a.f) {
                        jg.o0 filter = p0Var.getFilter();
                        e10Var.f(filter);
                        d10 d10Var = e10Var.I;
                        if (d10Var != null) {
                            ((org.telegram.ui.hv) d10Var).e(filter);
                            break;
                        }
                    } else {
                        p0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 15:
                ((z2) obj).a(Long.valueOf(((k10) obj2).d));
                break;
            case 16:
                ((org.telegram.ui.ep) obj).run();
                ((a30) obj2).dismiss();
                break;
            case 17:
                ((a70) obj2).v();
                ((org.telegram.ui.g80) obj).run();
                break;
            case 18:
                a70 a70Var2 = (a70) obj2;
                ((org.telegram.ui.vu) obj).run();
                if (a70Var2.J) {
                    a70Var2.v();
                    break;
                }
                break;
            case 19:
                i70 i70Var = (i70) obj2;
                g70 g70Var = (g70) obj;
                TLRPC.InputPeer l1 = org.telegram.messenger.np.u1(i70Var.a).l1(org.telegram.messenger.gj.B1(i70Var.x1));
                if (i70Var.w1 != 2) {
                    i70Var.z1 = l1;
                } else if (i70Var.x1 != i70Var.y1) {
                    g70Var.a(l1, i70Var.t1.size() > 1, false, false);
                }
                i70Var.dismiss();
                break;
            case 20:
                md0 md0Var = (md0) obj2;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj;
                ArrayList arrayList = md0Var.G1;
                ArrayList arrayList2 = md0Var.H1;
                org.telegram.ui.ActionBar.g2 g2Var2 = md0Var.t1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = md0Var.I1;
                if (md0Var.E1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(md0Var.getContext());
                    alertDialog$Builder2.a.S = org.telegram.messenger.hd.N0(2131754441, null);
                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.hd.N0(2131751705, null), org.telegram.messenger.hd.N0(2131754372, null)}, new id0(md0Var));
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
                            c5.J(md0Var.getContext(), bnVar3.a(), new cd0(md0Var), h6Var2);
                            break;
                        }
                    }
                    c5.X(md0Var.a, 1, z14 ? ((org.telegram.ui.bn) g2Var2).a() : 0L, new z2(md0Var, 11));
                    break;
                }
            case 21:
                wg0 wg0Var = (wg0) obj2;
                org.telegram.ui.at atVar = (org.telegram.ui.at) obj;
                if (wg0Var.K.getTag() == null) {
                    int max = (int) Math.max(1.0f, wg0Var.getValue());
                    org.telegram.ui.qa0 qa0Var = (org.telegram.ui.qa0) atVar.b;
                    TLRPC.User user = (TLRPC.User) atVar.c;
                    if (qa0Var.getLocationController().h(qa0Var.m0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(qa0Var.getParentActivity());
                        String N02 = org.telegram.messenger.hd.N0(2131745257, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder3.a;
                        t1Var2.S = N02;
                        t1Var2.U = org.telegram.messenger.hd.N0(2131745258, null);
                        alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131745259, null), new ai.u1(qa0Var, user, max, i11));
                        alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        qa0Var.showDialog(t1Var2);
                    } else {
                        qa0Var.O.M = true;
                        qa0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        qa0Var.w0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        qa0Var.getLocationController().o(max, qa0Var.m0, true);
                        z10 = true;
                    }
                    if (z10) {
                        wg0Var.a();
                        break;
                    }
                }
                break;
            case 22:
                ah0 ah0Var = (ah0) obj2;
                Context context = (Context) obj;
                Uri C0 = org.telegram.messenger.g0.C0(ah0Var.m1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.g0.W(context).startActivityForResult(Intent.createChooser(intent, ah0Var.m0.getText()), 500);
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
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.hd.N0(2131745262, null));
                createChooser.setFlags(TLObject.FLAG_28);
                ((Context) obj).startActivity(createChooser);
                break;
            case 24:
                org.telegram.ui.ns.p().u(((gw0) obj2).r.h2);
                org.telegram.ui.ns.p().x((org.telegram.ui.Cells.a8) obj);
                break;
            case 25:
                org.telegram.messenger.g0.g((CharSequence) obj2);
                ((Runnable) obj).run();
                break;
            case 26:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.w2) obj2).dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.np.g1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 27:
                ((g11) obj2).e();
                org.telegram.ui.bn bnVar4 = ((org.telegram.ui.ek) obj).a;
                w81 f02 = w81.f0(-bnVar4.l6, 0L);
                f02.E = bnVar4;
                bnVar4.presentFragment(f02);
                break;
            case 28:
                m31 m31Var = (m31) obj2;
                m31Var.g2 = false;
                m31Var.Y0();
                ((c51) obj).O(true);
                m31Var.J0();
                break;
            default:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                ImageView imageView = ((h31) obj2).s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(nr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
