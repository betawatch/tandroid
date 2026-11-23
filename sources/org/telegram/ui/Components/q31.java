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
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q31(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:253:0x06fe  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        org.telegram.messenger.so soVar;
        int i7;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i10 = 20;
        long j3 = 0;
        int i11 = 5;
        int i12 = 3;
        ArrayList arrayList = null;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.b;
                ((org.telegram.ui.ActionBar.g1) this.c).d(true);
                s31.a(ckVar.getContext(), ckVar.d);
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
                g2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new f2(undoView, 17), 2);
                break;
            case 2:
                n51 n51Var = (n51) this.b;
                File file = (File) this.c;
                if (file == null) {
                    n51Var.getClass();
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(n51Var.getContext());
                    if (W != null) {
                        org.telegram.messenger.g0.t2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                        n51Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) this.b;
                org.telegram.ui.f40 f40Var = (org.telegram.ui.f40) this.c;
                if (b20Var.h()) {
                    org.telegram.ui.Components.voip.j1.k(f40Var.d2);
                    break;
                } else {
                    c20.g0 = false;
                    f40Var.dismiss();
                    break;
                }
            case 4:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.b;
                oh0 oh0Var = (oh0) this.c;
                boolean z10 = w0Var.w;
                w0Var.w = !z10;
                if (z10) {
                    oh0Var.M(69);
                    oh0Var.P(99);
                } else {
                    oh0Var.M(36);
                    oh0Var.P(69);
                }
                oh0Var.start();
                break;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                d2Var.c(z11, true);
                break;
            case 6:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.b;
                Context context = (Context) this.c;
                h2Var.getClass();
                boolean z12 = context instanceof LaunchActivity;
                if (!z12 || org.telegram.messenger.t0.x) {
                    if (z12) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    }
                } else {
                    hc1.n((Activity) context, h2Var.N);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.qr qrVar = (org.telegram.ui.qr) this.b;
                qrVar.showDialog((org.telegram.ui.ActionBar.w2) c5.l(qrVar.getParentActivity(), org.telegram.messenger.hd.a0(null, null, 2131743431, org.telegram.messenger.p10.l((TLRPC.User) this.c)), org.telegram.messenger.hd.N0(2131743432, null), null, new org.telegram.ui.r3(qrVar, i11), null, false, false, qrVar.r).b);
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
                        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(nsVar.r);
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
                        d02.getMessagesStorage().a.c(new org.telegram.messenger.of(d02, document, i15));
                        nsVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        org.telegram.messenger.si.d0(nsVar.r).c(nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        org.telegram.messenger.np.u1(nsVar.r).C4("gif", nsVar.W);
                        nsVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document2 = nsVar.W;
                        TLRPC.BotInlineResult botInlineResult = nsVar.Z;
                        Object obj = nsVar.b0;
                        org.telegram.ui.ls lsVar3 = nsVar.l;
                        c5.J(nsVar.w, lsVar3.a(), new a1.d(lsVar3, document2, botInlineResult, obj, 12), nsVar.c0);
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
                org.telegram.ui.au auVar = (org.telegram.ui.au) this.b;
                ei.c cVar = (ei.c) this.c;
                org.telegram.ui.zt ztVar = auVar.T1;
                qw0[] qw0VarArr = auVar.X1;
                for (qw0 qw0Var : qw0VarArr) {
                    if (qw0Var != null) {
                        boolean z13 = qw0Var.c;
                    }
                }
                org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) view;
                int intValue2 = ((Integer) d2Var2.getTag()).intValue();
                qw0 qw0Var2 = qw0VarArr[intValue2];
                boolean z14 = qw0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    qw0Var2.c = z15;
                    qw0Var2.d = true;
                }
                d2Var2.c(qw0Var2.c, true);
                boolean z16 = qw0VarArr[intValue2].c;
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
                    auVar.a2.d();
                    auVar.W1.a(ztVar.d(), true);
                    ztVar.c(true);
                    break;
                } else {
                    cVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                auVar.a2.d();
                auVar.W1.a(ztVar.d(), true);
                ztVar.c(true);
            case 10:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.b;
                a70 a70Var = (a70) this.c;
                cxVar.getClass();
                a70Var.v();
                cxVar.presentFragment(new ProxyListActivity());
                break;
            case 11:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 12:
                org.telegram.ui.cx cxVar2 = (org.telegram.ui.cx) this.b;
                cxVar2.K4((ArrayList) this.c, org.telegram.messenger.ls.n1, false, false, null);
                cxVar2.finishPreviewFragment();
                break;
            case 13:
                li.l0.e((org.telegram.ui.ActionBar.t1[]) this.c, r0, r0.currentAccount, ((org.telegram.ui.cx) this.b).b3);
                break;
            case 14:
                org.telegram.ui.cx.k0((org.telegram.ui.cx) this.b, (org.telegram.messenger.t1) this.c);
                break;
            case 15:
                org.telegram.ui.j00 j00Var = (org.telegram.ui.j00) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.k00) this.c).getSuggestedFilter();
                org.telegram.messenger.so soVar2 = new org.telegram.messenger.so();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                soVar2.b = tL_textWithEntities.text;
                soVar2.c = tL_textWithEntities.entities;
                soVar2.a = 2;
                while (j00Var.e.getMessagesController().T0.get(soVar2.a) != null) {
                    soVar2.a++;
                }
                soVar2.f = j00Var.e.getMessagesController().V0().size();
                soVar2.d = -1;
                soVar2.e = -1;
                int i19 = 0;
                while (i19 < 2) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i19 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                    ArrayList arrayList5 = i19 == 0 ? soVar2.h : soVar2.i;
                    int size2 = arrayList4.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        long j10 = j3;
                        TLRPC.InputPeer inputPeer = arrayList4.get(i20);
                        org.telegram.messenger.so soVar3 = soVar2;
                        long j11 = inputPeer.user_id;
                        if (j11 == j10) {
                            long j12 = inputPeer.chat_id;
                            if (j12 == j10) {
                                j12 = inputPeer.channel_id;
                            }
                            j11 = -j12;
                        }
                        i20 = com.google.android.gms.internal.vision.e2.g(i20, 1, j11, arrayList5);
                        soVar2 = soVar3;
                        j3 = j10;
                    }
                    i19++;
                }
                org.telegram.messenger.so soVar4 = soVar2;
                TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                if (dialogFilter2.groups) {
                    soVar = soVar4;
                    int i21 = soVar.g;
                    int i22 = org.telegram.messenger.np.I8;
                    soVar.g = i21 | 4;
                } else {
                    soVar = soVar4;
                }
                if (dialogFilter2.bots) {
                    int i23 = soVar.g;
                    int i24 = org.telegram.messenger.np.I8;
                    soVar.g = i23 | 16;
                }
                if (dialogFilter2.contacts) {
                    int i25 = soVar.g;
                    int i26 = org.telegram.messenger.np.I8;
                    soVar.g = i25 | 1;
                }
                if (dialogFilter2.non_contacts) {
                    int i27 = soVar.g;
                    int i28 = org.telegram.messenger.np.I8;
                    soVar.g = i27 | 2;
                }
                if (dialogFilter2.broadcasts) {
                    int i29 = soVar.g;
                    int i30 = org.telegram.messenger.np.I8;
                    soVar.g = i29 | 8;
                }
                if (dialogFilter2.exclude_archived) {
                    int i31 = soVar.g;
                    int i32 = org.telegram.messenger.np.I8;
                    soVar.g = i31 | 128;
                }
                if (dialogFilter2.exclude_read) {
                    int i33 = soVar.g;
                    int i34 = org.telegram.messenger.np.I8;
                    soVar.g = i33 | 64;
                }
                if (dialogFilter2.exclude_muted) {
                    int i35 = soVar.g;
                    int i36 = org.telegram.messenger.np.I8;
                    soVar.g = i35 | 32;
                }
                org.telegram.ui.kz.z0(soVar, soVar.g, soVar.b, soVar.c, soVar.n, soVar.m, soVar.h, soVar.i, soVar.j, true, true, true, true, true, j00Var.e, new org.telegram.ui.ss(20, j00Var, suggestedFilter));
                break;
            case 16:
                vf.c.t((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 17:
                lp0 lp0Var = (lp0) this.b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                lp0Var.run();
                w2Var.dismiss();
                break;
            case 18:
                org.telegram.ui.t10 t10Var = (org.telegram.ui.t10) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.f40 f40Var2 = t10Var.F;
                org.telegram.messenger.t3 t3Var = f40Var2.V2;
                if (t3Var != null && t3Var.w) {
                    f40Var2.N1(textView);
                    break;
                }
                break;
            case 19:
                new org.telegram.ui.q30((Context) this.c, (org.telegram.ui.uv) this.b).show();
                break;
            case 20:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) this.b;
                rh0 rh0Var = (rh0) this.c;
                if (!org.telegram.ui.cx.C4) {
                    org.telegram.ui.cx.C4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
                    boolean z17 = !q10;
                    org.telegram.ui.ActionBar.l6 Q0 = !q10 ? org.telegram.ui.ActionBar.m6.Q0("Night") : org.telegram.ui.ActionBar.m6.Q0("Blue");
                    org.telegram.ui.ActionBar.m6.o = 0;
                    org.telegram.ui.ActionBar.m6.w1();
                    org.telegram.ui.ActionBar.m6.B();
                    oh0 oh0Var2 = v50Var.w;
                    oh0Var2.P(!q10 ? oh0Var2.e[0] - 1 : 0);
                    rh0Var.d();
                    int[] iArr = {(rh0Var.getMeasuredWidth() / 2) + r8, (rh0Var.getMeasuredHeight() / 2) + r8};
                    rh0Var.getLocationInWindow(iArr);
                    int i37 = iArr[0];
                    int i38 = iArr[1];
                    org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.w4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), rh0Var);
                    rh0Var.setContentDescription(org.telegram.messenger.hd.N0(!q10 ? 2131754750 : 2131754749, null));
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
                    int i39 = f60Var.d0;
                    if (i39 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i39 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.cx cxVar3 = new org.telegram.ui.cx(bundle);
                    cxVar3.E2 = new org.telegram.ui.at(11, f60Var, cxVar3);
                    g2Var2.presentFragment(cxVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, f60Var.d0);
                    org.telegram.ui.x5 x5Var = new org.telegram.ui.x5(bundle2);
                    x5Var.d = f60Var.g0;
                    x5Var.Z();
                    g2Var2.presentFragment(x5Var);
                    break;
                }
            case 22:
                org.telegram.messenger.dd[] ddVarArr = (org.telegram.messenger.dd[]) this.b;
                org.telegram.ui.Cells.s4[] s4VarArr = (org.telegram.ui.Cells.s4[]) this.c;
                String str = LaunchActivity.C1;
                Integer num = (Integer) view.getTag();
                ddVarArr[0] = ((org.telegram.ui.Cells.s4) view).getCurrentLocale();
                int i40 = 0;
                while (i40 < 2) {
                    s4VarArr[i40].a.a(i40 == num.intValue(), true);
                    i40++;
                }
                break;
            case 23:
                c5.x((Context) this.c, org.telegram.messenger.hd.N0(2131750865, null), org.telegram.messenger.hd.N0(2131745314, null), -1L, new org.telegram.ui.a90((org.telegram.ui.k90) this.b, i14));
                break;
            case 24:
                org.telegram.ui.k90 k90Var = (org.telegram.ui.k90) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (k90Var.e == null) {
                    org.telegram.ui.h90 h90Var = k90Var.f;
                    if (h90Var.e.h) {
                        int i41 = -k90Var.N;
                        k90Var.N = i41;
                        org.telegram.messenger.g0.E3(i41, h90Var, null);
                        break;
                    } else {
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        Switch r52 = s8Var.e;
                        s8Var.setChecked(!r52.h);
                        k90Var.r.setVisibility(r52.h ? 0 : 8);
                        org.telegram.messenger.g0.r(runnableArr[0]);
                        if (r52.h) {
                            k90Var.f.setChecked(false);
                            k90Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            k90Var.h.setText(org.telegram.messenger.hd.N0(2131754198, null));
                            org.telegram.ui.d90 d90Var = new org.telegram.ui.d90(k90Var, i15);
                            runnableArr[0] = d90Var;
                            org.telegram.messenger.g0.h3(d90Var, 60L);
                            break;
                        } else {
                            k90Var.f.setCheckBoxIcon(0);
                            k90Var.h.setText(org.telegram.messenger.hd.N0(2131754199, null));
                            org.telegram.ui.d90 d90Var2 = new org.telegram.ui.d90(k90Var, i13);
                            runnableArr[0] = d90Var2;
                            org.telegram.messenger.g0.g3(d90Var2);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.qa0 qa0Var = (org.telegram.ui.qa0) this.b;
                qa0Var.B0((org.telegram.ui.ma0) this.c);
                org.telegram.ui.la0 la0Var = qa0Var.P0;
                if (la0Var != null) {
                    la0Var.dismiss();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.pb0 pb0Var = (org.telegram.ui.pb0) this.b;
                Context context2 = (Context) this.c;
                String string = pb0Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    fz0 fz0Var = new fz0();
                    fz0Var.a |= 256;
                    fz0Var.b = indexOf;
                    int i42 = lastIndexOf + 1;
                    fz0Var.c = i42;
                    spannableStringBuilder.setSpan(new gz0(fz0Var, 0), indexOf, i42, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(2131748535, null);
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748539, null));
                int i43 = pb0Var.H;
                int i44 = i43 / 86400;
                int i45 = i43 % 86400;
                int i46 = i45 / 3600;
                int i47 = (i45 % 3600) / 60;
                if (i44 == 0 && i46 == 0) {
                    i47 = Math.max(1, i47);
                }
                alertDialog$Builder.a.U = org.telegram.messenger.g0.m0(W2, spannableStringBuilder, (i44 == 0 || i46 == 0) ? (i46 == 0 || i47 == 0) ? i44 != 0 ? org.telegram.messenger.hd.a0(null, null, 2131748541, org.telegram.messenger.hd.G(i44, "Days", new Object[0])) : i46 != 0 ? org.telegram.messenger.hd.a0(null, null, 2131748541, org.telegram.messenger.hd.G(i44, "Hours", new Object[0])) : org.telegram.messenger.hd.a0(null, null, 2131748541, org.telegram.messenger.hd.G(i47, "Minutes", new Object[0])) : org.telegram.messenger.hd.a0(null, null, 2131748542, org.telegram.messenger.hd.G(i46, "Hours", new Object[0]), org.telegram.messenger.hd.G(i47, "Minutes", new Object[0])) : org.telegram.messenger.hd.a0(null, null, 2131748542, org.telegram.messenger.hd.G(i44, "Days", new Object[0]), org.telegram.messenger.hd.G(i46, "Hours", new Object[0])));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131748543, null), new org.telegram.ui.zr(pb0Var, 19));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.p();
                break;
            case 27:
                org.telegram.ui.xb0 xb0Var = (org.telegram.ui.xb0) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.de0 de0Var = xb0Var.E;
                if (de0Var.W.getTag() == null) {
                    if (xb0Var.n.has_recovery) {
                        de0Var.F1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_requestPasswordRecovery, new org.telegram.ui.vb0(xb0Var, i15), 10);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(xb0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                        alertDialog$Builder2.a.S = org.telegram.messenger.hd.N0(2131745875, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.hd.N0(2131745877, null);
                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131752029, null), null);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131745921, null), new org.telegram.ui.zr(xb0Var, i10));
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
                            alertDialog$Builder3.a.S = org.telegram.messenger.hd.N0(2131745875, null);
                            alertDialog$Builder3.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131751433, gd0Var.b));
                            alertDialog$Builder3.i(org.telegram.messenger.hd.N0(2131751434, null), new org.telegram.ui.at(25, gd0Var, context4));
                            alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131752029, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131751436, null), new org.telegram.ui.vc0(gd0Var, i15));
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
                int i48 = ce0Var.P + 1;
                ce0Var.P = i48;
                ce0Var.Q = currentTimeMillis;
                if (i48 >= 5) {
                    ce0Var.P = 0;
                    ce0Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ce0Var.getContext());
                    alertDialog$Builder4.a.S = org.telegram.messenger.hd.N0(2131745290, null);
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.hd.N0(org.telegram.messenger.s2.a ? 2131751627 : 2131751619, null), org.telegram.messenger.hd.N0(2131751601, null)}, new org.telegram.ui.k4(ce0Var, i13));
                    alertDialog$Builder4.p();
                    break;
                } else if (i48 > 1) {
                    Toast makeText = Toast.makeText(context5, org.telegram.messenger.hd.G(5 - i48, "DebugMenuLoginToast", new Object[0]), 0);
                    ce0Var.R = makeText;
                    makeText.show();
                    break;
                }
                break;
        }
    }
}
