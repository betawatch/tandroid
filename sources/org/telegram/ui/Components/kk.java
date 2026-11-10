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
import org.telegram.ui.x81;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kk(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [int] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int b10;
        int i7;
        View view2;
        v4.d1 T;
        int i10 = this.a;
        boolean z9 = false;
        boolean z10 = true;
        boolean z11 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                vk.O((vk) obj2, (org.telegram.ui.ActionBar.h6) obj);
                break;
            case 1:
                an anVar = (an) ((org.telegram.ui.l4) obj2).e;
                org.telegram.ui.g61 g61Var = anVar.s;
                View F = g61Var.F((ym) obj);
                v4.d1 T2 = F != null ? g61Var.T(F) : null;
                if (T2 != null && (b10 = T2.b() - anVar.t0) >= 0 && b10 < anVar.K.length) {
                    an.S(anVar, b10);
                    break;
                }
                break;
            case 2:
                jn jnVar = (jn) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                org.telegram.ui.cn cnVar = jnVar.G;
                if (jnVar.T) {
                    cnVar.showDialog(u4.S(jnVar.getContext(), cnVar.h, h6Var).a);
                    break;
                } else {
                    fn fnVar = jnVar.e;
                    if (cnVar.getParentActivity() != null) {
                        TLRPC.Chat chat = cnVar.e;
                        if (chat == null || org.telegram.messenger.t3.y(13, chat)) {
                            TLRPC.ChatFull chatFull = cnVar.p8;
                            TLRPC.UserFull userFull = cnVar.q8;
                            int i11 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.messenger.re reVar = new org.telegram.messenger.re(jnVar.getContext(), null, new gn(jnVar, r4), true, 0, jnVar.d0);
                            reVar.u(i11);
                            hn hnVar = new hn(jnVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b);
                            org.telegram.ui.ActionBar.g1[] g1VarArr = {hnVar};
                            hnVar.e = true;
                            hnVar.c = org.telegram.messenger.qs.x3;
                            hnVar.setOutsideTouchable(true);
                            g1VarArr[0].setClippingEnabled(true);
                            g1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            g1VarArr[0].setFocusable(true);
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            g1VarArr[0].setInputMethodMode(2);
                            g1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            g1VarArr[0].showAtLocation(fnVar, 0, (int) (jnVar.getX() + fnVar.getX()), (int) fnVar.getY());
                            cnVar.w8(false, true, 0.2f);
                            break;
                        } else if (jnVar.a.f && cnVar.getParentActivity() != null && cnVar.fragmentView != null && cnVar.p8 != null) {
                            if (cnVar.C2 == null) {
                                i7 = 0;
                                fi.m3 E6 = cnVar.E6(310.0f, 1, -1, false);
                                cnVar.C2 = E6;
                                E6.d = 4000L;
                            } else {
                                i7 = 0;
                            }
                            int i12 = cnVar.p8.ttl_period;
                            String G = i12 > 86400 ? org.telegram.messenger.id.G(i12 / 86400, "Days", new Object[i7]) : i12 >= 3600 ? org.telegram.messenger.id.G(i12 / 3600, "Hours", new Object[i7]) : i12 >= 60 ? org.telegram.messenger.id.G(i12 / 60, "Minutes", new Object[i7]) : org.telegram.messenger.id.G(i12, "Seconds", new Object[i7]);
                            fi.m3 m3Var = cnVar.C2;
                            Object[] objArr = new Object[1];
                            objArr[i7] = G;
                            m3Var.u(org.telegram.messenger.id.a0("AutoDeleteSetInfo", null, 2131753844, objArr));
                            cnVar.C2.y(cnVar.o1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                vo voVar = (vo) obj2;
                org.telegram.ui.cn cnVar2 = (org.telegram.ui.cn) obj;
                if (voVar.p1 != null) {
                    voVar.p1 = null;
                    voVar.dismiss();
                    org.telegram.messenger.d4.f(voVar.a).a(cnVar2.a(), true, false);
                    break;
                } else {
                    voVar.dismiss();
                    break;
                }
            case 4:
                sq sqVar = (sq) obj2;
                sqVar.U1 = org.telegram.messenger.qp.s1(sqVar.a).j1(org.telegram.messenger.ij.B1((TLRPC.Peer) obj));
                sqVar.dismiss();
                break;
            case 5:
                ar arVar = (ar) obj2;
                String str = (String) obj;
                if (arVar.b == null && (view2 = arVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        arVar.b = (EditText) findFocus;
                    }
                }
                if (arVar.b != null) {
                    try {
                        arVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = arVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = arVar.b.getText();
                    int length = arVar.b.getSelectionEnd() == arVar.b.length() ? -1 : str.length() + arVar.b.getSelectionStart();
                    if (arVar.b.getSelectionStart() == -1 || arVar.b.getSelectionEnd() == -1) {
                        arVar.b.setText(str);
                        EditText editText2 = arVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = arVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), arVar.b.getSelectionEnd(), str));
                        EditText editText4 = arVar.b;
                        if (length == -1) {
                            length = editText4.length();
                        }
                        editText4.setSelection(length);
                    }
                    EditText editText5 = arVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        break;
                    }
                }
                break;
            case 6:
                kr krVar = (kr) obj2;
                jr jrVar = (jr) obj;
                krVar.X0();
                jrVar.f = !jrVar.f;
                jrVar.j.S1.O(true);
                krVar.I0();
                break;
            case 7:
                ((kr) obj2).w2 = !r13.w2;
                ((m41) obj).O(true);
                break;
            case 8:
                ((org.telegram.ui.p6) obj2).dismiss();
                ((org.telegram.ui.ActionBar.f2) obj).presentFragment(new org.telegram.ui.y6());
                break;
            case 9:
                qu quVar = (qu) obj2;
                q5 q5Var = (q5) obj;
                org.telegram.ui.ActionBar.g1 g1Var = quVar.A1;
                if (g1Var != null) {
                    g1Var.d(true);
                    quVar.A1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(h5.e(quVar.a, q5Var.getDocumentId())));
                    spannableString.setSpan(q5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.g0.g(spannableString)) {
                        org.telegram.messenger.camera.q.r(null, 2131751184, new gc((FrameLayout) quVar.b, quVar.I0));
                        break;
                    }
                }
                break;
            case 10:
                xx xxVar = (xx) obj2;
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) obj;
                gy gyVar = xxVar.w;
                pv pvVar = gyVar.D0;
                if (pvVar.indexOfChild(j8Var) != -1 && (T = pvVar.T(j8Var)) != null) {
                    if (T.b() == gyVar.f1) {
                        if (gyVar.h1 != null) {
                            hx hxVar = gyVar.t1;
                            if (hxVar != null) {
                                hxVar.y(gyVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(gyVar.c1).f7.edit();
                            String str2 = "group_hide_stickers_" + gyVar.J1.id;
                            TLRPC.StickerSet stickerSet = gyVar.J1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            gyVar.X(false);
                            xx xxVar2 = gyVar.y0;
                            if (xxVar2 != null) {
                                xxVar2.f();
                                break;
                            }
                        }
                    } else if (xxVar.h.get(T.b()) == gyVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xxVar.c);
                        String M0 = org.telegram.messenger.id.M0(2131752063, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131752064, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new ax(xxVar, z10 ? 1 : 0));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        u1Var.show();
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                            break;
                        }
                    }
                }
                break;
            case 11:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.W0;
                float C = MediaController.B().C(fragmentContextView.W);
                int i13 = 0;
                while (true) {
                    if (i13 >= 3) {
                        i13 = -1;
                    } else if (C - 0.1f > fArr[i13]) {
                        i13++;
                    }
                }
                int i14 = i13 + 1;
                if (i14 >= 3) {
                    i14 = 0;
                }
                float f10 = fArr[i14];
                MediaController.B().m0(fragmentContextView.W, f10);
                fragmentContextView.l(C, f10, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    z20 z20Var = z20.w;
                    if (z20Var.c()) {
                        z20Var.b();
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (f2Var != null && fragmentContextView.C0 != null) {
                            fi.m3 m3Var2 = new fi.m3(fragmentContextView.getContext(), 1);
                            m3Var2.r(true);
                            m3Var2.d = 2300L;
                            m3Var2.T = true;
                            m3Var2.e = true;
                            m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                            m3Var2.u0 = -org.telegram.messenger.g0.L(6.0f);
                            fragmentContextView.B0 = m3Var2;
                            m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            if (f2Var instanceof org.telegram.ui.cn) {
                                m3Var2.l(((org.telegram.ui.cn) f2Var).K);
                            }
                            m3Var2.u(org.telegram.messenger.id.M0(2131745269, null));
                            m3Var2.q0 = new a3(m3Var2, z11 ? 1 : 0);
                            fragmentContextView.C0.addView(m3Var2, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
                            m3Var2.y(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                break;
            case 12:
                r00 r00Var = (r00) obj2;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                int indexOf = r00Var.F.indexOf(q0Var.getFilter());
                if (r00Var.I != indexOf) {
                    r00Var.I = indexOf;
                    r00Var.e();
                    break;
                } else if (q0Var.getFilter().h) {
                    if (q0Var.a.f) {
                        jg.o0 filter = q0Var.getFilter();
                        r00Var.f(filter);
                        q00 q00Var = r00Var.H;
                        if (q00Var != null) {
                            ((org.telegram.ui.gv) q00Var).h(filter);
                            break;
                        }
                    } else {
                        q0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 13:
                ((r2) obj).a(Long.valueOf(((w00) obj2).d));
                break;
            case 14:
                ((org.telegram.ui.dp) obj).run();
                ((m20) obj2).dismiss();
                break;
            case 15:
                ((k60) obj2).u();
                ((org.telegram.ui.ha0) obj).run();
                break;
            case 16:
                k60 k60Var = (k60) obj2;
                ((org.telegram.ui.gu) obj).run();
                if (k60Var.J) {
                    k60Var.u();
                    break;
                }
                break;
            case 17:
                t60 t60Var = (t60) obj2;
                r60 r60Var = (r60) obj;
                TLRPC.InputPeer j12 = org.telegram.messenger.qp.s1(t60Var.a).j1(org.telegram.messenger.ij.B1(t60Var.w1));
                if (t60Var.v1 != 2) {
                    t60Var.y1 = j12;
                } else if (t60Var.w1 != t60Var.x1) {
                    r60Var.a(j12, t60Var.s1.size() > 1, false, false);
                }
                t60Var.dismiss();
                break;
            case 18:
                ad0 ad0Var = (ad0) obj2;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj;
                ArrayList arrayList = ad0Var.F1;
                ArrayList arrayList2 = ad0Var.G1;
                org.telegram.ui.ActionBar.f2 f2Var2 = ad0Var.s1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = ad0Var.H1;
                if (ad0Var.D1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ad0Var.getContext());
                    alertDialog$Builder2.a.R = org.telegram.messenger.id.M0(2131754444, null);
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.id.M0(2131751717, null), org.telegram.messenger.id.M0(2131754375, null)}, new wc0(ad0Var));
                    alertDialog$Builder2.p();
                    break;
                } else {
                    StringBuilder sb2 = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.g5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                    int lastIndexOf = sb2.lastIndexOf("END:VCARD");
                    if (lastIndexOf >= 0) {
                        tL_userContact_old2.phone = null;
                        int size = arrayList2.size() - 1;
                        while (size >= 0) {
                            org.telegram.messenger.f0 f0Var = (org.telegram.messenger.f0) arrayList2.get(size);
                            boolean z12 = f0Var.d;
                            ?? r62 = f0Var.a;
                            if (z12) {
                                if (tL_userContact_old2.phone == null) {
                                    tL_userContact_old2.phone = f0Var.c(z9);
                                }
                                for (?? r52 = z9; r52 < r62.size(); r52++) {
                                    sb2.insert(lastIndexOf, ((String) r62.get(r52)) + "\n");
                                }
                            }
                            size--;
                            z9 = false;
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
                    boolean z14 = f2Var2 instanceof org.telegram.ui.cn;
                    if (z14) {
                        org.telegram.ui.cn cnVar3 = (org.telegram.ui.cn) f2Var2;
                        if (cnVar3.c()) {
                            u4.J(ad0Var.getContext(), cnVar3.a(), new qc0(ad0Var), h6Var2);
                            break;
                        }
                    }
                    u4.X(ad0Var.a, 1, z14 ? ((org.telegram.ui.cn) f2Var2).a() : 0L, new r2(ad0Var, 9));
                    break;
                }
            case 19:
                hg0 hg0Var = (hg0) obj2;
                org.telegram.ui.su suVar = (org.telegram.ui.su) obj;
                if (hg0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, hg0Var.getValue());
                    org.telegram.ui.sa0 sa0Var = (org.telegram.ui.sa0) suVar.b;
                    TLRPC.User user = (TLRPC.User) suVar.c;
                    if (sa0Var.getLocationController().h(sa0Var.l0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sa0Var.getParentActivity());
                        String M02 = org.telegram.messenger.id.M0(2131745453, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder3.a;
                        u1Var2.R = M02;
                        u1Var2.T = org.telegram.messenger.id.M0(2131745454, null);
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131745455, null), new jg.a2(sa0Var, user, max, 11));
                        alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        sa0Var.showDialog(u1Var2);
                    } else {
                        sa0Var.N.L = true;
                        sa0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        sa0Var.w0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        sa0Var.getLocationController().o(max, sa0Var.l0, true);
                        z9 = true;
                    }
                    if (z9) {
                        hg0Var.a();
                        break;
                    }
                }
                break;
            case 20:
                lg0 lg0Var = (lg0) obj2;
                Context context = (Context) obj;
                Uri C0 = org.telegram.messenger.g0.C0(lg0Var.l1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.g0.W(context).startActivityForResult(Intent.createChooser(intent, lg0Var.l0.getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                break;
            case 21:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.id.M0(2131745458, null));
                createChooser.setFlags(TLObject.FLAG_28);
                ((Context) obj).startActivity(createChooser);
                break;
            case 22:
                org.telegram.ui.ns.p().u(((uv0) obj2).r.g2);
                org.telegram.ui.ns.p().x((org.telegram.ui.Cells.z7) obj);
                break;
            case 23:
                org.telegram.messenger.g0.g((CharSequence) obj2);
                ((Runnable) obj).run();
                break;
            case 24:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.w2) obj2).dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.qp.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 25:
                ((s01) obj2).d();
                org.telegram.ui.cn cnVar4 = ((org.telegram.ui.fk) obj).a;
                x81 f02 = x81.f0(-cnVar4.j6, 0L);
                f02.D = cnVar4;
                cnVar4.presentFragment(f02);
                break;
            case 26:
                v21 v21Var = (v21) obj2;
                v21Var.f2 = false;
                v21Var.X0();
                ((m41) obj).O(true);
                v21Var.I0();
                break;
            case 27:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                ImageView imageView = ((q21) obj2).s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(wq.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) obj2;
                ((org.telegram.ui.ActionBar.g1) obj).d(true);
                a31.a(dkVar.getContext(), dkVar.d);
                break;
            default:
                UndoView undoView = (UndoView) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                int i15 = UndoView.i0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.f2 f2Var3 = undoView.s;
                tL_payments_getPaymentReceipt.peer = f2Var3.getMessagesController().m1(message.peer_id);
                f2Var3.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new w1(undoView, 17), 2);
                break;
        }
    }
}
