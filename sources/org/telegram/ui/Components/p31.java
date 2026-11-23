package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p31(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x06f6  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i7;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        long j3 = 0;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        ArrayList arrayList = null;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.b;
                ((org.telegram.ui.ActionBar.g1) this.c).d(true);
                r31.a(ckVar.getContext(), ckVar.d);
                break;
            case 1:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i16 = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.g2 g2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = g2Var.getMessagesController().o1(message.peer_id);
                g2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new e2(undoView, 17), 2);
                break;
            case 2:
                m51 m51Var = (m51) this.b;
                File file = (File) this.c;
                if (file == null) {
                    m51Var.getClass();
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(m51Var.getContext());
                    if (W != null) {
                        org.telegram.messenger.g0.t2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                        m51Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.b;
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) this.c;
                if (a20Var.h()) {
                    org.telegram.ui.Components.voip.k1.g(e40Var.d2);
                    break;
                } else {
                    a20.g0 = false;
                    e40Var.dismiss();
                    break;
                }
            case 4:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                nh0 nh0Var = (nh0) this.c;
                boolean z10 = x0Var.w;
                x0Var.w = !z10;
                if (z10) {
                    nh0Var.M(69);
                    nh0Var.P(99);
                } else {
                    nh0Var.M(36);
                    nh0Var.P(69);
                }
                nh0Var.start();
                break;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                d2Var.c(z11, true);
                break;
            case 6:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.b;
                Context context = (Context) this.c;
                i2Var.getClass();
                boolean z12 = context instanceof LaunchActivity;
                if (!z12 || org.telegram.messenger.t0.x) {
                    if (z12) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    }
                } else {
                    fc1.n((Activity) context, i2Var.N);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.qr qrVar = (org.telegram.ui.qr) this.b;
                qrVar.showDialog((org.telegram.ui.ActionBar.w2) b5.l(qrVar.getParentActivity(), org.telegram.messenger.gd.a0(null, null, 2131743429, org.telegram.messenger.n10.l((TLRPC.User) this.c)), org.telegram.messenger.gd.N0(2131743430, null), null, new org.telegram.ui.r3(qrVar, i10), null, false, false, qrVar.r).b);
                break;
            case 8:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.ns nsVar = jsVar.a;
                if (nsVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.ls lsVar = nsVar.l;
                        TLObject tLObject = nsVar.W;
                        if (tLObject == null) {
                            tLObject = nsVar.Z;
                        }
                        lsVar.r(0, 0, nsVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.ls lsVar2 = nsVar.l;
                        TLObject tLObject2 = nsVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = nsVar.Z;
                        }
                        lsVar2.r(0, 0, nsVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(nsVar.r);
                        TLRPC.Document document = nsVar.W;
                        int size = d02.j0.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                if (((TLRPC.Document) d02.j0.get(i17)).id == document.id) {
                                    d02.j0.remove(i17);
                                } else {
                                    i17++;
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
                        d02.getConnectionsManager().sendRequest(tL_messages_saveGif, new org.telegram.messenger.t4(i12, d02, tL_messages_saveGif));
                        d02.getMessagesStorage().a.c(new org.telegram.messenger.nf(d02, document, i15));
                        nsVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        org.telegram.messenger.ri.d0(nsVar.r).c(nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        org.telegram.messenger.mp.u1(nsVar.r).C4("gif", nsVar.W);
                        nsVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document2 = nsVar.W;
                        TLRPC.BotInlineResult botInlineResult = nsVar.Z;
                        Object obj = nsVar.b0;
                        org.telegram.ui.ls lsVar3 = nsVar.l;
                        b5.J(nsVar.w, lsVar3.a(), new a1.d(lsVar3, document2, botInlineResult, obj, 12), nsVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ls lsVar4 = nsVar.l;
                        TLObject tLObject3 = nsVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = nsVar.Z;
                        }
                        lsVar4.v(tLObject3, nsVar.b0);
                    }
                    nsVar.o();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.zt ztVar = (org.telegram.ui.zt) this.b;
                ei.c cVar = (ei.c) this.c;
                org.telegram.ui.yt ytVar = ztVar.T1;
                pw0[] pw0VarArr = ztVar.X1;
                for (pw0 pw0Var : pw0VarArr) {
                    if (pw0Var != null) {
                        boolean z13 = pw0Var.c;
                    }
                }
                org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) view;
                int intValue2 = ((Integer) d2Var2.getTag()).intValue();
                pw0 pw0Var2 = pw0VarArr[intValue2];
                boolean z14 = pw0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    pw0Var2.c = z15;
                    pw0Var2.d = true;
                }
                d2Var2.c(pw0Var2.c, true);
                boolean z16 = pw0VarArr[intValue2].c;
                ArrayList arrayList3 = cVar.d;
                HashSet hashSet = cVar.j;
                if (intValue2 == 0) {
                    cVar.m = z16;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = cVar.e;
                        cVar.o = z16;
                    } else if (intValue2 == 3) {
                        arrayList = cVar.f;
                        cVar.p = z16;
                    } else if (intValue2 == 4) {
                        arrayList = cVar.g;
                        cVar.q = z16;
                    } else if (intValue2 == 7) {
                        arrayList = cVar.h;
                    }
                    if (arrayList != null) {
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            if (((ei.b) arrayList.get(i18)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i18))) {
                                        hashSet.add((ei.b) arrayList.get(i18));
                                        cVar.g((ei.b) arrayList.get(i18), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i18))) {
                                    hashSet.remove(arrayList.get(i18));
                                    cVar.g((ei.b) arrayList.get(i18), false);
                                }
                            }
                        }
                    }
                    ztVar.a2.d();
                    ztVar.W1.a(ytVar.d(), true);
                    ytVar.c(true);
                    break;
                } else {
                    cVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                ztVar.a2.d();
                ztVar.W1.a(ytVar.d(), true);
                ytVar.c(true);
            case 10:
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) this.b;
                x60 x60Var = (x60) this.c;
                bxVar.getClass();
                x60Var.v();
                bxVar.presentFragment(new ProxyListActivity());
                break;
            case 11:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 12:
                org.telegram.ui.bx bxVar2 = (org.telegram.ui.bx) this.b;
                bxVar2.K4((ArrayList) this.c, org.telegram.messenger.ks.n1, false, false, null);
                bxVar2.finishPreviewFragment();
                break;
            case 13:
                li.k0.e((org.telegram.ui.ActionBar.t1[]) this.c, r0, r0.currentAccount, ((org.telegram.ui.bx) this.b).b3);
                break;
            case 14:
                org.telegram.ui.bx.k0((org.telegram.ui.bx) this.b, (org.telegram.messenger.t1) this.c);
                break;
            case 15:
                org.telegram.ui.i00 i00Var = (org.telegram.ui.i00) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.j00) this.c).getSuggestedFilter();
                org.telegram.messenger.ro roVar = new org.telegram.messenger.ro();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                roVar.b = tL_textWithEntities.text;
                roVar.c = tL_textWithEntities.entities;
                roVar.a = 2;
                while (i00Var.e.getMessagesController().T0.get(roVar.a) != null) {
                    roVar.a++;
                }
                roVar.f = i00Var.e.getMessagesController().V0().size();
                roVar.d = -1;
                roVar.e = -1;
                int i19 = 0;
                while (i19 < 2) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i19 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                    ArrayList arrayList5 = i19 == 0 ? roVar.h : roVar.i;
                    int size2 = arrayList4.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        long j10 = j3;
                        TLRPC.InputPeer inputPeer = arrayList4.get(i20);
                        int i21 = i11;
                        int i22 = size2;
                        long j11 = inputPeer.user_id;
                        if (j11 == j10) {
                            long j12 = inputPeer.chat_id;
                            if (j12 == j10) {
                                j12 = inputPeer.channel_id;
                            }
                            j11 = -j12;
                        }
                        i20 = com.google.android.gms.internal.vision.e2.g(i20, 1, j11, arrayList5);
                        size2 = i22;
                        i11 = i21;
                        j3 = j10;
                    }
                    i19++;
                    j3 = j3;
                }
                int i23 = i11;
                TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                if (dialogFilter2.groups) {
                    int i24 = roVar.g;
                    int i25 = org.telegram.messenger.mp.I8;
                    roVar.g = i24 | i23;
                }
                if (dialogFilter2.bots) {
                    int i26 = roVar.g;
                    int i27 = org.telegram.messenger.mp.I8;
                    roVar.g = i26 | 16;
                }
                if (dialogFilter2.contacts) {
                    int i28 = roVar.g;
                    int i29 = org.telegram.messenger.mp.I8;
                    roVar.g = 1 | i28;
                }
                if (dialogFilter2.non_contacts) {
                    int i30 = roVar.g;
                    int i31 = org.telegram.messenger.mp.I8;
                    roVar.g = i30 | 2;
                }
                if (dialogFilter2.broadcasts) {
                    int i32 = roVar.g;
                    int i33 = org.telegram.messenger.mp.I8;
                    roVar.g = i32 | 8;
                }
                if (dialogFilter2.exclude_archived) {
                    int i34 = roVar.g;
                    int i35 = org.telegram.messenger.mp.I8;
                    roVar.g = i34 | 128;
                }
                if (dialogFilter2.exclude_read) {
                    int i36 = roVar.g;
                    int i37 = org.telegram.messenger.mp.I8;
                    roVar.g = i36 | 64;
                }
                if (dialogFilter2.exclude_muted) {
                    int i38 = roVar.g;
                    int i39 = org.telegram.messenger.mp.I8;
                    roVar.g = i38 | 32;
                }
                org.telegram.ui.jz.z0(roVar, roVar.g, roVar.b, roVar.c, roVar.n, roVar.m, roVar.h, roVar.i, roVar.j, true, true, true, true, true, i00Var.e, new org.telegram.ui.Components.voip.o(24, i00Var, suggestedFilter));
                break;
            case 16:
                vf.c.t((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 17:
                kp0 kp0Var = (kp0) this.b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                kp0Var.run();
                w2Var.dismiss();
                break;
            case 18:
                org.telegram.ui.s10 s10Var = (org.telegram.ui.s10) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.e40 e40Var2 = s10Var.F;
                org.telegram.messenger.t3 t3Var = e40Var2.V2;
                if (t3Var != null && t3Var.w) {
                    e40Var2.N1(textView);
                    break;
                }
                break;
            case 19:
                new org.telegram.ui.p30((Context) this.c, (org.telegram.ui.tv) this.b).show();
                break;
            case 20:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) this.b;
                qh0 qh0Var = (qh0) this.c;
                if (!org.telegram.ui.bx.C4) {
                    org.telegram.ui.bx.C4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
                    boolean z17 = !q10;
                    org.telegram.ui.ActionBar.m6 Q0 = !q10 ? org.telegram.ui.ActionBar.n6.Q0("Night") : org.telegram.ui.ActionBar.n6.Q0("Blue");
                    org.telegram.ui.ActionBar.n6.o = 0;
                    org.telegram.ui.ActionBar.n6.w1();
                    org.telegram.ui.ActionBar.n6.B();
                    nh0 nh0Var2 = v50Var.w;
                    nh0Var2.P(!q10 ? nh0Var2.e[0] - 1 : 0);
                    qh0Var.d();
                    int[] iArr = {(qh0Var.getMeasuredWidth() / 2) + r9, (qh0Var.getMeasuredHeight() / 2) + r9};
                    qh0Var.getLocationInWindow(iArr);
                    int i40 = iArr[0];
                    int i41 = iArr[1];
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.w4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), qh0Var);
                    qh0Var.setContentDescription(org.telegram.messenger.gd.N0(!q10 ? 2131754750 : 2131754749, null));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) this.b;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.c;
                f60Var.R.dismiss();
                if (f60Var.g0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i42 = f60Var.d0;
                    if (i42 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i42 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.bx bxVar3 = new org.telegram.ui.bx(bundle);
                    bxVar3.E2 = new org.telegram.ui.zs(11, f60Var, bxVar3);
                    g2Var2.presentFragment(bxVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, f60Var.d0);
                    org.telegram.ui.y5 y5Var = new org.telegram.ui.y5(bundle2);
                    y5Var.d = f60Var.g0;
                    y5Var.Z();
                    g2Var2.presentFragment(y5Var);
                    break;
                }
            case 22:
                org.telegram.messenger.cd[] cdVarArr = (org.telegram.messenger.cd[]) this.b;
                org.telegram.ui.Cells.s4[] s4VarArr = (org.telegram.ui.Cells.s4[]) this.c;
                String str = LaunchActivity.C1;
                Integer num = (Integer) view.getTag();
                cdVarArr[0] = ((org.telegram.ui.Cells.s4) view).getCurrentLocale();
                int i43 = 0;
                while (i43 < 2) {
                    s4VarArr[i43].a.a(i43 == num.intValue(), true);
                    i43++;
                }
                break;
            case 23:
                b5.x((Context) this.c, org.telegram.messenger.gd.N0(2131750865, null), org.telegram.messenger.gd.N0(2131745314, null), -1L, new org.telegram.ui.z80((org.telegram.ui.j90) this.b, i14));
                break;
            case 24:
                org.telegram.ui.j90 j90Var = (org.telegram.ui.j90) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (j90Var.e == null) {
                    org.telegram.ui.g90 g90Var = j90Var.f;
                    if (g90Var.e.h) {
                        int i44 = -j90Var.N;
                        j90Var.N = i44;
                        org.telegram.messenger.g0.E3(i44, g90Var, null);
                        break;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        Switch r52 = r8Var.e;
                        r8Var.setChecked(!r52.h);
                        j90Var.r.setVisibility(r52.h ? 0 : 8);
                        org.telegram.messenger.g0.r(runnableArr[0]);
                        if (r52.h) {
                            j90Var.f.setChecked(false);
                            j90Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            j90Var.h.setText(org.telegram.messenger.gd.N0(2131754198, null));
                            org.telegram.ui.c90 c90Var = new org.telegram.ui.c90(j90Var, i15);
                            runnableArr[0] = c90Var;
                            org.telegram.messenger.g0.h3(c90Var, 60L);
                            break;
                        } else {
                            j90Var.f.setCheckBoxIcon(0);
                            j90Var.h.setText(org.telegram.messenger.gd.N0(2131754199, null));
                            org.telegram.ui.c90 c90Var2 = new org.telegram.ui.c90(j90Var, i13);
                            runnableArr[0] = c90Var2;
                            org.telegram.messenger.g0.g3(c90Var2);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) this.b;
                pa0Var.B0((org.telegram.ui.la0) this.c);
                org.telegram.ui.ka0 ka0Var = pa0Var.P0;
                if (ka0Var != null) {
                    ka0Var.dismiss();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) this.b;
                Context context2 = (Context) this.c;
                String string = ob0Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ez0 ez0Var = new ez0();
                    ez0Var.a |= 256;
                    ez0Var.b = indexOf;
                    int i45 = lastIndexOf + 1;
                    ez0Var.c = i45;
                    spannableStringBuilder.setSpan(new fz0(ez0Var, 0), indexOf, i45, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131748535, null);
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748539, null));
                int i46 = ob0Var.H;
                int i47 = i46 / 86400;
                int i48 = i46 % 86400;
                int i49 = i48 / 3600;
                int i50 = (i48 % 3600) / 60;
                if (i47 == 0 && i49 == 0) {
                    i50 = Math.max(1, i50);
                }
                alertDialog$Builder.a.U = org.telegram.messenger.g0.m0(W2, spannableStringBuilder, (i47 == 0 || i49 == 0) ? (i49 == 0 || i50 == 0) ? i47 != 0 ? org.telegram.messenger.gd.a0(null, null, 2131748541, org.telegram.messenger.gd.G(i47, "Days", new Object[0])) : i49 != 0 ? org.telegram.messenger.gd.a0(null, null, 2131748541, org.telegram.messenger.gd.G(i47, "Hours", new Object[0])) : org.telegram.messenger.gd.a0(null, null, 2131748541, org.telegram.messenger.gd.G(i50, "Minutes", new Object[0])) : org.telegram.messenger.gd.a0(null, null, 2131748542, org.telegram.messenger.gd.G(i49, "Hours", new Object[0]), org.telegram.messenger.gd.G(i50, "Minutes", new Object[0])) : org.telegram.messenger.gd.a0(null, null, 2131748542, org.telegram.messenger.gd.G(i47, "Days", new Object[0]), org.telegram.messenger.gd.G(i49, "Hours", new Object[0])));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748543, null), new org.telegram.ui.zr(ob0Var, 19));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.p();
                break;
            case 27:
                org.telegram.ui.wb0 wb0Var = (org.telegram.ui.wb0) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.de0 de0Var = wb0Var.E;
                if (de0Var.W.getTag() == null) {
                    if (wb0Var.n.has_recovery) {
                        de0Var.F1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_requestPasswordRecovery, new org.telegram.ui.ub0(wb0Var, i15), 10);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(wb0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                        alertDialog$Builder2.a.S = org.telegram.messenger.gd.N0(2131745875, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.gd.N0(2131745877, null);
                        alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131752029, null), null);
                        alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131745921, null), new org.telegram.ui.zr(wb0Var, 20));
                        alertDialog$Builder2.p();
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) this.b;
                Context context4 = (Context) this.c;
                Bundle bundle3 = gd0Var.r0;
                if (bundle3 != null && (tL_auth_sentCode = gd0Var.s0) != null) {
                    gd0Var.v0.y1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!gd0Var.g0) {
                    org.telegram.ui.ed0 ed0Var = gd0Var.w;
                    if ((ed0Var == null || ed0Var.getVisibility() == 8) && !gd0Var.l0) {
                        if (gd0Var.j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = gd0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = gd0Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            gd0Var.v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context4);
                            alertDialog$Builder3.a.S = org.telegram.messenger.gd.N0(2131745875, null);
                            alertDialog$Builder3.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131751433, gd0Var.b));
                            alertDialog$Builder3.i(org.telegram.messenger.gd.N0(2131751434, null), new org.telegram.ui.zs(25, gd0Var, context4));
                            alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131752029, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131751436, null), new org.telegram.ui.uc0(gd0Var, i15));
                            alertDialog$Builder3.p();
                            break;
                        } else if (gd0Var.v0.W.getTag() == null) {
                            gd0Var.v();
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ce0 ce0Var = (org.telegram.ui.ce0) this.b;
                Context context5 = (Context) this.c;
                Toast toast = ce0Var.R;
                if (toast != null) {
                    toast.cancel();
                    ce0Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (ce0Var.P > 0 && currentTimeMillis - ce0Var.Q > 1500) {
                    ce0Var.P = 0;
                }
                int i51 = ce0Var.P + 1;
                ce0Var.P = i51;
                ce0Var.Q = currentTimeMillis;
                if (i51 >= 5) {
                    ce0Var.P = 0;
                    ce0Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ce0Var.getContext());
                    alertDialog$Builder4.a.S = org.telegram.messenger.gd.N0(2131745290, null);
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.gd.N0(org.telegram.messenger.s2.a ? 2131751627 : 2131751619, null), org.telegram.messenger.gd.N0(2131751601, null)}, new org.telegram.ui.k4(ce0Var, i13));
                    alertDialog$Builder4.p();
                    break;
                } else if (i51 > 1) {
                    Toast makeText = Toast.makeText(context5, org.telegram.messenger.gd.G(5 - i51, "DebugMenuLoginToast", new Object[0]), 0);
                    ce0Var.R = makeText;
                    makeText.show();
                    break;
                }
                break;
        }
    }
}
