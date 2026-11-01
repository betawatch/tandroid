package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.provider.Settings;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ja1;
import org.telegram.ui.zd1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sr(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [int] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.ArrayList] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s4.c1 T;
        int i10 = -1;
        int i11 = 3;
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                vr vrVar = (vr) this.b;
                q51 q51Var = (q51) this.c;
                vrVar.t2 = !vrVar.t2;
                q51Var.O(true);
                break;
            case 1:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                p6Var.dismiss();
                k2Var.presentFragment(new org.telegram.ui.y6());
                break;
            case 2:
                cv cvVar = (cv) this.b;
                o5 o5Var = (o5) this.c;
                org.telegram.ui.ActionBar.k1 k1Var = cvVar.x1;
                if (k1Var != null) {
                    k1Var.d(true);
                    cvVar.x1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.kj.U(f5.e(cvVar.a, o5Var.getDocumentId())));
                    spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.i0.g(spannableString)) {
                        org.telegram.messenger.a30.r(null, 2131751185, new cc((FrameLayout) cvVar.b, cvVar.I0));
                        break;
                    }
                }
                break;
            case 3:
                ny nyVar = (ny) this.b;
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) this.c;
                vy vyVar = nyVar.w;
                bw bwVar = vyVar.D0;
                if (bwVar.indexOfChild(n8Var) != -1 && (T = bwVar.T(n8Var)) != null) {
                    if (T.b() == vyVar.f1) {
                        if (vyVar.h1 != null) {
                            vx vxVar = vyVar.t1;
                            if (vxVar != null) {
                                vxVar.y(vyVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(vyVar.c1).g7.edit();
                            String str = "group_hide_stickers_" + vyVar.J1.id;
                            TLRPC.StickerSet stickerSet = vyVar.J1.stickerset;
                            edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                            vyVar.Y(false);
                            ny nyVar2 = vyVar.y0;
                            if (nyVar2 != null) {
                                nyVar2.f();
                                break;
                            }
                        }
                    } else if (nyVar.h.get(T.b()) == vyVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nyVar.c);
                        alertDialog$Builder.a.R = org.telegram.messenger.dd.L0(2131752063, null);
                        alertDialog$Builder.a.T = org.telegram.messenger.dd.L0(2131752064, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752099, null), new px(nyVar, z11 ? 1 : 0));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.show();
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                            break;
                        }
                    }
                }
                break;
            case 4:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = (float[]) this.c;
                float[] fArr2 = FragmentContextView.W0;
                float C = MediaController.B().C(fragmentContextView.W);
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (C - 0.1f <= fArr[i12]) {
                            i10 = i12;
                        } else {
                            i12++;
                        }
                    }
                }
                int i13 = i10 + 1;
                float f7 = fArr[i13 >= 3 ? 0 : i13];
                MediaController.B().m0(fragmentContextView.W, f7);
                fragmentContextView.l(C, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    r30 r30Var = r30.w;
                    if (r30Var.c()) {
                        r30Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            z00 z00Var = new z00(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = z00Var;
                            z00Var.setExtraTranslationY(org.telegram.messenger.i0.L(-12.0f));
                            fragmentContextView.B0.setText(org.telegram.messenger.dd.L0(2131745287, null));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(3.0f);
                            fragmentContextView.C0.addView(fragmentContextView.B0, marginLayoutParams);
                            fragmentContextView.B0.f(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                break;
            case 5:
                h10 h10Var = (h10) this.b;
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.c;
                int indexOf = h10Var.F.indexOf(s0Var.getFilter());
                if (h10Var.I != indexOf) {
                    h10Var.I = indexOf;
                    h10Var.e();
                    break;
                } else if (s0Var.getFilter().h) {
                    if (s0Var.a.f) {
                        zf.e0 filter = s0Var.getFilter();
                        h10Var.f(filter);
                        g10 g10Var = h10Var.H;
                        if (g10Var != null) {
                            ((org.telegram.ui.hw) g10Var).h(filter);
                            break;
                        }
                    } else {
                        s0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 6:
                ((r2) this.c).a(Long.valueOf(((m10) this.b).d));
                break;
            case 7:
                e30 e30Var = (e30) this.b;
                ((org.telegram.ui.zp) this.c).run();
                e30Var.dismiss();
                break;
            case 8:
                z60 z60Var = (z60) this.b;
                a3.i0 i0Var = (a3.i0) this.c;
                z60Var.u();
                i0Var.run();
                break;
            case 9:
                z60 z60Var2 = (z60) this.b;
                ((org.telegram.ui.fv) this.c).run();
                if (z60Var2.J) {
                    z60Var2.u();
                    break;
                }
                break;
            case 10:
                k70 k70Var = (k70) this.b;
                i70 i70Var = (i70) this.c;
                TLRPC.InputPeer i14 = org.telegram.messenger.wp.r1(k70Var.a).i1(org.telegram.messenger.kj.C1(k70Var.t1));
                if (k70Var.s1 != 2) {
                    k70Var.v1 = i14;
                } else if (k70Var.t1 != k70Var.u1) {
                    i70Var.a(i14, k70Var.p1.size() > 1, false, false);
                }
                k70Var.dismiss();
                break;
            case 11:
                vd0 vd0Var = (vd0) this.b;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) this.c;
                ArrayList arrayList = vd0Var.C1;
                ArrayList arrayList2 = vd0Var.D1;
                org.telegram.ui.ActionBar.k2 k2Var2 = vd0Var.p1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = vd0Var.E1;
                if (vd0Var.A1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vd0Var.getContext());
                    alertDialog$Builder2.a.R = org.telegram.messenger.dd.L0(2131754444, null);
                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.dd.L0(2131751718, null), org.telegram.messenger.dd.L0(2131754375, null)}, new rd0(vd0Var));
                    alertDialog$Builder2.p();
                    break;
                } else {
                    StringBuilder sb2 = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.i5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                    int lastIndexOf = sb2.lastIndexOf("END:VCARD");
                    if (lastIndexOf >= 0) {
                        tL_userContact_old2.phone = null;
                        int size = arrayList2.size() - 1;
                        while (size >= 0) {
                            org.telegram.messenger.h0 h0Var = (org.telegram.messenger.h0) arrayList2.get(size);
                            boolean z13 = h0Var.d;
                            ?? r62 = h0Var.a;
                            if (z13) {
                                if (tL_userContact_old2.phone == null) {
                                    tL_userContact_old2.phone = h0Var.c(z10);
                                }
                                for (?? r52 = z10; r52 < r62.size(); r52++) {
                                    sb2.insert(lastIndexOf, ((String) r62.get(r52)) + "\n");
                                }
                            }
                            size--;
                            z10 = false;
                        }
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            org.telegram.messenger.h0 h0Var2 = (org.telegram.messenger.h0) arrayList.get(size2);
                            boolean z14 = h0Var2.d;
                            ArrayList arrayList3 = h0Var2.a;
                            if (z14) {
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
                    boolean z15 = k2Var2 instanceof org.telegram.ui.un;
                    if (z15) {
                        org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                        if (unVar.c()) {
                            s4.L(vd0Var.getContext(), unVar.a(), new ld0(vd0Var), p6Var2);
                            break;
                        }
                    }
                    s4.Z(vd0Var.a, 1, z15 ? ((org.telegram.ui.un) k2Var2).a() : 0L, new r2(vd0Var, 9));
                    break;
                }
            case 12:
                kh0 kh0Var = (kh0) this.b;
                org.telegram.ui.qv qvVar = (org.telegram.ui.qv) this.c;
                if (kh0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, kh0Var.getValue());
                    org.telegram.ui.xb0 xb0Var = (org.telegram.ui.xb0) qvVar.b;
                    TLRPC.User user = (TLRPC.User) qvVar.c;
                    if (xb0Var.getLocationController().h(xb0Var.n0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xb0Var.getParentActivity());
                        alertDialog$Builder3.a.R = org.telegram.messenger.dd.L0(2131745471, null);
                        alertDialog$Builder3.a.T = org.telegram.messenger.dd.L0(2131745472, null);
                        alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131745473, null), new ag.b0(xb0Var, user, max, 12));
                        alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        xb0Var.showDialog(alertDialog$Builder3.a);
                    } else {
                        xb0Var.P.L = true;
                        xb0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        xb0Var.y0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        xb0Var.getLocationController().o(max, xb0Var.n0, true);
                        z10 = true;
                    }
                    if (z10) {
                        kh0Var.a();
                        break;
                    }
                }
                break;
            case 13:
                oh0 oh0Var = (oh0) this.b;
                Context context = (Context) this.c;
                Uri C0 = org.telegram.messenger.i0.C0(oh0Var.i1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.i0.W(context).startActivityForResult(Intent.createChooser(intent, oh0Var.l0.getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 14:
                String str2 = (String) this.b;
                Context context2 = (Context) this.c;
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str2);
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.dd.L0(2131745476, null));
                createChooser.setFlags(TLObject.FLAG_28);
                context2.startActivity(createChooser);
                break;
            case 15:
                zw0 zw0Var = (zw0) this.b;
                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) this.c;
                org.telegram.ui.kt.p().u(zw0Var.r.d2);
                org.telegram.ui.kt.p().x(d8Var);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                Runnable runnable = (Runnable) this.c;
                org.telegram.messenger.i0.g(charSequence);
                runnable.run();
                break;
            case 17:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                z2Var.dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.wp.d1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 18:
                u11 u11Var = (u11) this.b;
                org.telegram.ui.al alVar = (org.telegram.ui.al) this.c;
                u11Var.c();
                org.telegram.ui.un unVar2 = alVar.a;
                ja1 f02 = ja1.f0(-unVar2.j6, 0L);
                f02.D = unVar2;
                unVar2.presentFragment(f02);
                break;
            case 19:
                y31 y31Var = (y31) this.b;
                q51 q51Var2 = (q51) this.c;
                y31Var.c2 = false;
                y31Var.X0();
                q51Var2.O(true);
                y31Var.I0();
                break;
            case 20:
                t31 t31Var = (t31) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = t31Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(gr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this.b;
                ((org.telegram.ui.ActionBar.k1) this.c).d(true);
                e41.a(xkVar.getContext(), xkVar.d);
                break;
            case 22:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i15 = UndoView.i0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.k2 k2Var3 = undoView.s;
                tL_payments_getPaymentReceipt.peer = k2Var3.getMessagesController().l1(message.peer_id);
                k2Var3.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new x1(undoView, 17), 2);
                break;
            case 23:
                b61 b61Var = (b61) this.b;
                File file = (File) this.c;
                if (file == null) {
                    b61Var.getClass();
                    break;
                } else {
                    Activity W = org.telegram.messenger.i0.W(b61Var.getContext());
                    if (W != null) {
                        org.telegram.messenger.i0.t2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                        b61Var.dismiss();
                        break;
                    }
                }
                break;
            case 24:
                org.telegram.ui.x20 x20Var = (org.telegram.ui.x20) this.b;
                org.telegram.ui.a50 a50Var = (org.telegram.ui.a50) this.c;
                if (x20Var.h()) {
                    if (mf.b.a(a50Var.Z1) > 0) {
                        org.telegram.ui.Components.voip.t0.h(a50Var.Z1);
                        a50Var.dismiss();
                        break;
                    } else {
                        s4.A(a50Var.Z1, null, true).p();
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = a50Var.Z1;
                    Typeface typeface = org.telegram.messenger.i0.a;
                    if (Settings.canDrawOverlays(launchActivity)) {
                        g20.e0 = false;
                        a50Var.dismiss();
                        break;
                    } else {
                        s4.z(x20Var.getContext()).p();
                        break;
                    }
                }
            case 25:
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) this.b;
                ci0 ci0Var = (ci0) this.c;
                boolean z16 = f0Var.w;
                f0Var.w = !z16;
                if (z16) {
                    ci0Var.M(69);
                    ci0Var.P(99);
                } else {
                    ci0Var.M(36);
                    ci0Var.P(69);
                }
                ci0Var.start();
                break;
            case 26:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                boolean z17 = !zArr2[0];
                zArr2[0] = z17;
                c2Var.c(z17, true);
                break;
            case 27:
                org.telegram.ui.Components.voip.u1 u1Var = (org.telegram.ui.Components.voip.u1) this.b;
                Context context3 = (Context) this.c;
                u1Var.getClass();
                boolean z18 = context3 instanceof LaunchActivity;
                if (!z18 || org.telegram.messenger.w0.x) {
                    if (z18) {
                        Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                        intent3.setAction("voip");
                        context3.startActivity(intent3);
                        break;
                    }
                } else {
                    zd1.v((Activity) context3, u1Var.M);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.b;
                nsVar.showDialog((org.telegram.ui.ActionBar.z2) s4.l(nsVar.getParentActivity(), org.telegram.messenger.dd.a0(null, null, 2131743702, org.telegram.messenger.i20.k((TLRPC.User) this.c)), org.telegram.messenger.dd.L0(2131743703, null), null, new org.telegram.ui.s3(nsVar, 5), null, false, false, nsVar.r).b);
                break;
            default:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                org.telegram.ui.kt ktVar = ftVar.a;
                if (ktVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList4.get(intValue)).intValue() == 0) {
                        org.telegram.ui.ht htVar = ktVar.l;
                        TLObject tLObject = ktVar.W;
                        if (tLObject == null) {
                            tLObject = ktVar.Z;
                        }
                        htVar.r(0, 0, ktVar.b0, tLObject, true);
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 4) {
                        org.telegram.ui.ht htVar2 = ktVar.l;
                        TLObject tLObject2 = ktVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = ktVar.Z;
                        }
                        htVar2.r(0, 0, ktVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 1) {
                        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(ktVar.r);
                        TLRPC.Document document = ktVar.W;
                        int size4 = b02.i0.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size4) {
                                if (((TLRPC.Document) b02.i0.get(i16)).id == document.id) {
                                    b02.i0.remove(i16);
                                } else {
                                    i16++;
                                }
                            }
                        }
                        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_messages_saveGif.id = tL_inputDocument;
                        tL_inputDocument.id = document.id;
                        tL_inputDocument.access_hash = document.access_hash;
                        byte[] bArr = document.file_reference;
                        tL_inputDocument.file_reference = bArr;
                        if (bArr == null) {
                            tL_inputDocument.file_reference = new byte[0];
                        }
                        tL_messages_saveGif.unsave = true;
                        b02.getConnectionsManager().sendRequest(tL_messages_saveGif, new org.telegram.messenger.v4(i11, b02, tL_messages_saveGif));
                        b02.getMessagesStorage().a.c(new org.telegram.messenger.mf(b02, document, z12 ? 1 : 0));
                        ktVar.l.K();
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 2) {
                        org.telegram.messenger.vi.b0(ktVar.r).c(ktVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        org.telegram.messenger.wp.r1(ktVar.r).q4("gif", ktVar.W);
                        ktVar.l.K();
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 3) {
                        TLRPC.Document document2 = ktVar.W;
                        TLRPC.BotInlineResult botInlineResult = ktVar.Z;
                        Object obj = ktVar.b0;
                        org.telegram.ui.ht htVar3 = ktVar.l;
                        s4.L(ktVar.w, htVar3.a(), new a1.d(htVar3, document2, botInlineResult, obj, 8), ktVar.c0);
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ht htVar4 = ktVar.l;
                        TLObject tLObject3 = ktVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = ktVar.Z;
                        }
                        htVar4.v(tLObject3, ktVar.b0);
                    }
                    ktVar.o();
                    break;
                }
                break;
        }
    }
}
