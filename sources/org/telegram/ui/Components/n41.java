package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
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
import java.util.concurrent.atomic.AtomicBoolean;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.ec1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n41(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0765  */
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
                r41 r41Var = (r41) this.b;
                File file = (File) this.c;
                if (file == null) {
                    r41Var.getClass();
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(r41Var.getContext());
                    if (W != null) {
                        org.telegram.messenger.g0.t2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                        r41Var.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.b;
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) this.c;
                if (z10Var.h()) {
                    org.telegram.ui.Components.voip.g1.k(c40Var.Z1);
                    break;
                } else {
                    p10.f0 = false;
                    c40Var.dismiss();
                    break;
                }
            case 2:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.b;
                zg0 zg0Var = (zg0) this.c;
                boolean z9 = t0Var.w;
                t0Var.w = !z9;
                if (z9) {
                    zg0Var.M(69);
                    zg0Var.P(99);
                } else {
                    zg0Var.M(36);
                    zg0Var.P(69);
                }
                zg0Var.start();
                break;
            case 3:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                c2Var.c(z10, true);
                break;
            case 4:
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.b;
                Context context = (Context) this.c;
                e2Var.getClass();
                boolean z11 = context instanceof LaunchActivity;
                if (!z11 || org.telegram.messenger.t0.x) {
                    if (z11) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    }
                } else {
                    ec1.n((Activity) context, e2Var.M);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.nr nrVar = (org.telegram.ui.nr) this.b;
                nrVar.showDialog((org.telegram.ui.ActionBar.v2) v4.l(nrVar.getParentActivity(), org.telegram.messenger.hd.a0(null, null, 2131743677, org.telegram.messenger.t10.k((TLRPC.User) this.c)), org.telegram.messenger.hd.M0(2131743678, null), null, new org.telegram.ui.r3(nrVar, i10), null, false, false, nrVar.r).b);
                break;
            case 6:
                org.telegram.ui.gs gsVar = (org.telegram.ui.gs) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.ks ksVar = gsVar.a;
                if (ksVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.is isVar = ksVar.l;
                        TLObject tLObject = ksVar.W;
                        if (tLObject == null) {
                            tLObject = ksVar.Z;
                        }
                        isVar.s(0, 0, ksVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.is isVar2 = ksVar.l;
                        TLObject tLObject2 = ksVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = ksVar.Z;
                        }
                        isVar2.s(0, 0, ksVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(ksVar.r);
                        TLRPC.Document document = ksVar.W;
                        int size = b02.i0.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
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
                        b02.getConnectionsManager().sendRequest(tL_messages_saveGif, new org.telegram.messenger.s4(i12, b02, tL_messages_saveGif));
                        b02.getMessagesStorage().a.c(new org.telegram.messenger.nf(b02, document, i15));
                        ksVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        org.telegram.messenger.ui.b0(ksVar.r).c(ksVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        org.telegram.messenger.qp.s1(ksVar.r).t4("gif", ksVar.W);
                        ksVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document2 = ksVar.W;
                        TLRPC.BotInlineResult botInlineResult = ksVar.Z;
                        Object obj = ksVar.b0;
                        org.telegram.ui.is isVar3 = ksVar.l;
                        v4.J(ksVar.w, isVar3.a(), new a1.d(isVar3, document2, botInlineResult, obj, 12), ksVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.is isVar4 = ksVar.l;
                        TLObject tLObject3 = ksVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = ksVar.Z;
                        }
                        isVar4.x(tLObject3, ksVar.b0);
                    }
                    ksVar.o();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.wt wtVar = (org.telegram.ui.wt) this.b;
                ci.c cVar = (ci.c) this.c;
                org.telegram.ui.vt vtVar = wtVar.P1;
                ew0[] ew0VarArr = wtVar.T1;
                for (ew0 ew0Var : ew0VarArr) {
                    if (ew0Var != null) {
                        boolean z12 = ew0Var.c;
                    }
                }
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                int intValue2 = ((Integer) c2Var2.getTag()).intValue();
                ew0 ew0Var2 = ew0VarArr[intValue2];
                boolean z13 = ew0Var2.c;
                boolean z14 = !z13;
                if (z13 != z14) {
                    ew0Var2.c = z14;
                    ew0Var2.d = true;
                }
                c2Var2.c(ew0Var2.c, true);
                boolean z15 = ew0VarArr[intValue2].c;
                ArrayList arrayList3 = cVar.d;
                HashSet hashSet = cVar.j;
                if (intValue2 == 0) {
                    cVar.m = z15;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = cVar.e;
                        cVar.o = z15;
                    } else if (intValue2 == 3) {
                        arrayList = cVar.f;
                        cVar.p = z15;
                    } else if (intValue2 == 4) {
                        arrayList = cVar.g;
                        cVar.q = z15;
                    } else if (intValue2 == 7) {
                        arrayList = cVar.h;
                    }
                    if (arrayList != null) {
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            if (((ci.b) arrayList.get(i17)).d == intValue2) {
                                if (z15) {
                                    if (!hashSet.contains(arrayList.get(i17))) {
                                        hashSet.add((ci.b) arrayList.get(i17));
                                        cVar.g((ci.b) arrayList.get(i17), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i17))) {
                                    hashSet.remove(arrayList.get(i17));
                                    cVar.g((ci.b) arrayList.get(i17), false);
                                }
                            }
                        }
                    }
                    wtVar.W1.d();
                    wtVar.S1.a(vtVar.d(), true);
                    vtVar.c(true);
                    break;
                } else {
                    cVar.n = z15;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                wtVar.W1.d();
                wtVar.S1.a(vtVar.d(), true);
                vtVar.c(true);
            case 8:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 9:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.b;
                wwVar.D4((ArrayList) this.c, org.telegram.messenger.qs.n1, false, false, null);
                wwVar.finishPreviewFragment();
                break;
            case 10:
                ii.m0.e((org.telegram.ui.ActionBar.u1[]) this.c, r0, r0.currentAccount, ((org.telegram.ui.ww) this.b).Z2);
                break;
            case 11:
                org.telegram.ui.ww.I0((org.telegram.ui.ww) this.b, (org.telegram.messenger.t1) this.c);
                break;
            case 12:
                org.telegram.ui.ww wwVar2 = (org.telegram.ui.ww) this.b;
                k60 k60Var = (k60) this.c;
                wwVar2.getClass();
                k60Var.u();
                wwVar2.presentFragment(new ProxyListActivity());
                break;
            case 13:
                org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.f00) this.c).getSuggestedFilter();
                org.telegram.messenger.vo voVar = new org.telegram.messenger.vo();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                voVar.b = tL_textWithEntities.text;
                voVar.c = tL_textWithEntities.entities;
                voVar.a = 2;
                while (e00Var.e.getMessagesController().S0.get(voVar.a) != null) {
                    voVar.a++;
                }
                voVar.f = e00Var.e.getMessagesController().T0().size();
                voVar.d = -1;
                voVar.e = -1;
                int i18 = 0;
                while (i18 < 2) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i18 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                    ArrayList arrayList5 = i18 == 0 ? voVar.h : voVar.i;
                    int size2 = arrayList4.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        long j10 = j3;
                        TLRPC.InputPeer inputPeer = arrayList4.get(i19);
                        int i20 = i11;
                        int i21 = size2;
                        long j11 = inputPeer.user_id;
                        if (j11 == j10) {
                            long j12 = inputPeer.chat_id;
                            if (j12 == j10) {
                                j12 = inputPeer.channel_id;
                            }
                            j11 = -j12;
                        }
                        i19 = com.google.android.recaptcha.internal.a.g(i19, 1, j11, arrayList5);
                        size2 = i21;
                        i11 = i20;
                        j3 = j10;
                    }
                    i18++;
                    j3 = j3;
                }
                int i22 = i11;
                TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                if (dialogFilter2.groups) {
                    int i23 = voVar.g;
                    int i24 = org.telegram.messenger.qp.C8;
                    voVar.g = i23 | i22;
                }
                if (dialogFilter2.bots) {
                    int i25 = voVar.g;
                    int i26 = org.telegram.messenger.qp.C8;
                    voVar.g = i25 | 16;
                }
                if (dialogFilter2.contacts) {
                    int i27 = voVar.g;
                    int i28 = org.telegram.messenger.qp.C8;
                    voVar.g = i27 | 1;
                }
                if (dialogFilter2.non_contacts) {
                    int i29 = voVar.g;
                    int i30 = org.telegram.messenger.qp.C8;
                    voVar.g = i29 | 2;
                }
                if (dialogFilter2.broadcasts) {
                    int i31 = voVar.g;
                    int i32 = org.telegram.messenger.qp.C8;
                    voVar.g = i31 | 8;
                }
                if (dialogFilter2.exclude_archived) {
                    int i33 = voVar.g;
                    int i34 = org.telegram.messenger.qp.C8;
                    voVar.g = i33 | 128;
                }
                if (dialogFilter2.exclude_read) {
                    int i35 = voVar.g;
                    int i36 = org.telegram.messenger.qp.C8;
                    voVar.g = i35 | 64;
                }
                if (dialogFilter2.exclude_muted) {
                    int i37 = voVar.g;
                    int i38 = org.telegram.messenger.qp.C8;
                    voVar.g = i37 | 32;
                }
                org.telegram.ui.gz.z0(voVar, voVar.g, voVar.b, voVar.c, voVar.n, voVar.m, voVar.h, voVar.i, voVar.j, true, true, true, true, true, e00Var.e, new g51(27, e00Var, suggestedFilter));
                break;
            case 14:
                vf.c.t((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 15:
                pp0 pp0Var = (pp0) this.b;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.c;
                pp0Var.run();
                v2Var.dismiss();
                break;
            case 16:
                org.telegram.ui.r10 r10Var = (org.telegram.ui.r10) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.c40 c40Var2 = r10Var.E;
                org.telegram.messenger.r3 r3Var = c40Var2.R2;
                if (r3Var != null && r3Var.w) {
                    c40Var2.M1(textView);
                    break;
                }
                break;
            case 17:
                new org.telegram.ui.n30((Context) this.c, (org.telegram.ui.l00) this.b).show();
                break;
            case 18:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) this.b;
                ch0 ch0Var = (ch0) this.c;
                if (!org.telegram.ui.ww.x4) {
                    org.telegram.ui.ww.x4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                    boolean z16 = !q10;
                    org.telegram.ui.ActionBar.j6 Q0 = !q10 ? org.telegram.ui.ActionBar.k6.Q0("Night") : org.telegram.ui.ActionBar.k6.Q0("Blue");
                    org.telegram.ui.ActionBar.k6.o = 0;
                    org.telegram.ui.ActionBar.k6.w1();
                    org.telegram.ui.ActionBar.k6.B();
                    zg0 zg0Var2 = u50Var.w;
                    zg0Var2.P(!q10 ? zg0Var2.e[0] - 1 : 0);
                    ch0Var.d();
                    int[] iArr = {(ch0Var.getMeasuredWidth() / 2) + r9, (ch0Var.getMeasuredHeight() / 2) + r9};
                    ch0Var.getLocationInWindow(iArr);
                    int i39 = iArr[0];
                    int i40 = iArr[1];
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z16), ch0Var);
                    ch0Var.setContentDescription(org.telegram.messenger.hd.M0(!q10 ? 2131754751 : 2131754750, null));
                    break;
                }
                break;
            case 19:
                org.telegram.ui.e60 e60Var = (org.telegram.ui.e60) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                e60Var.Q.dismiss();
                if (e60Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i41 = e60Var.c0;
                    if (i41 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i41 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.ww wwVar3 = new org.telegram.ui.ww(bundle);
                    wwVar3.C2 = new org.telegram.ui.pu(e60Var, wwVar3);
                    f2Var.presentFragment(wwVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, e60Var.c0);
                    org.telegram.ui.x5 x5Var = new org.telegram.ui.x5(bundle2);
                    x5Var.d = e60Var.f0;
                    x5Var.Z();
                    f2Var.presentFragment(x5Var);
                    break;
                }
            case 20:
                org.telegram.messenger.ed[] edVarArr = (org.telegram.messenger.ed[]) this.b;
                org.telegram.ui.Cells.r4[] r4VarArr = (org.telegram.ui.Cells.r4[]) this.c;
                String str = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                edVarArr[0] = ((org.telegram.ui.Cells.r4) view).getCurrentLocale();
                int i42 = 0;
                while (i42 < 2) {
                    r4VarArr[i42].a.a(i42 == num.intValue(), true);
                    i42++;
                }
                break;
            case 21:
                v4.x((Context) this.c, org.telegram.messenger.hd.M0(2131750878, null), org.telegram.messenger.hd.M0(2131745511, null), -1L, new org.telegram.ui.x80((org.telegram.ui.h90) this.b, i14));
                break;
            case 22:
                org.telegram.ui.h90 h90Var = (org.telegram.ui.h90) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (h90Var.e == null) {
                    org.telegram.ui.e90 e90Var = h90Var.f;
                    if (e90Var.e.h) {
                        int i43 = -h90Var.M;
                        h90Var.M = i43;
                        org.telegram.messenger.g0.G3(i43, e90Var, null);
                        break;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        Switch r42 = r8Var.e;
                        r8Var.setChecked(!r42.h);
                        h90Var.r.setVisibility(r42.h ? 0 : 8);
                        org.telegram.messenger.g0.r(runnableArr[0]);
                        if (r42.h) {
                            h90Var.f.setChecked(false);
                            h90Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            h90Var.h.setText(org.telegram.messenger.hd.M0(2131754201, null));
                            org.telegram.ui.a90 a90Var = new org.telegram.ui.a90(h90Var, i15);
                            runnableArr[0] = a90Var;
                            org.telegram.messenger.g0.i3(a90Var, 60L);
                            break;
                        } else {
                            h90Var.f.setCheckBoxIcon(0);
                            h90Var.h.setText(org.telegram.messenger.hd.M0(2131754202, null));
                            org.telegram.ui.a90 a90Var2 = new org.telegram.ui.a90(h90Var, i13);
                            runnableArr[0] = a90Var2;
                            org.telegram.messenger.g0.h3(a90Var2);
                            break;
                        }
                    }
                }
                break;
            case 23:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) this.b;
                pa0Var.B0((org.telegram.ui.la0) this.c);
                org.telegram.ui.ka0 ka0Var = pa0Var.J0;
                if (ka0Var != null) {
                    ka0Var.dismiss();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) this.b;
                Context context2 = (Context) this.c;
                String string = ob0Var.D.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ty0 ty0Var = new ty0();
                    ty0Var.a |= 256;
                    ty0Var.b = indexOf;
                    int i44 = lastIndexOf + 1;
                    ty0Var.c = i44;
                    spannableStringBuilder.setSpan(new uy0(ty0Var, 0), indexOf, i44, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(2131748727, null);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748731, null));
                int i45 = ob0Var.G;
                int i46 = i45 / 86400;
                int i47 = i45 % 86400;
                int i48 = i47 / 3600;
                int i49 = (i47 % 3600) / 60;
                if (i46 == 0 && i48 == 0) {
                    i49 = Math.max(1, i49);
                }
                alertDialog$Builder.a.T = org.telegram.messenger.g0.m0(X2, spannableStringBuilder, (i46 == 0 || i48 == 0) ? (i48 == 0 || i49 == 0) ? i46 != 0 ? org.telegram.messenger.hd.a0(null, null, 2131748733, org.telegram.messenger.hd.G(i46, "Days", new Object[0])) : i48 != 0 ? org.telegram.messenger.hd.a0(null, null, 2131748733, org.telegram.messenger.hd.G(i46, "Hours", new Object[0])) : org.telegram.messenger.hd.a0(null, null, 2131748733, org.telegram.messenger.hd.G(i49, "Minutes", new Object[0])) : org.telegram.messenger.hd.a0(null, null, 2131748734, org.telegram.messenger.hd.G(i48, "Hours", new Object[0]), org.telegram.messenger.hd.G(i49, "Minutes", new Object[0])) : org.telegram.messenger.hd.a0(null, null, 2131748734, org.telegram.messenger.hd.G(i46, "Days", new Object[0]), org.telegram.messenger.hd.G(i48, "Hours", new Object[0])));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748735, null), new org.telegram.ui.wr(ob0Var, 19));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            case 25:
                org.telegram.ui.xb0 xb0Var = (org.telegram.ui.xb0) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ce0 ce0Var = xb0Var.D;
                if (ce0Var.V.getTag() == null) {
                    if (xb0Var.n.has_recovery) {
                        ce0Var.F1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_requestPasswordRecovery, new org.telegram.ui.vb0(xb0Var, i15), 10);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(xb0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                        alertDialog$Builder2.a.R = org.telegram.messenger.hd.M0(2131746072, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.hd.M0(2131746074, null);
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131746118, null), new org.telegram.ui.wr(xb0Var, 20));
                        alertDialog$Builder2.p();
                        break;
                    }
                }
                break;
            case 26:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) this.b;
                Context context4 = (Context) this.c;
                Bundle bundle3 = gd0Var.q0;
                if (bundle3 != null && (tL_auth_sentCode = gd0Var.r0) != null) {
                    gd0Var.u0.y1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!gd0Var.f0) {
                    org.telegram.ui.ed0 ed0Var = gd0Var.w;
                    if ((ed0Var == null || ed0Var.getVisibility() == 8) && !gd0Var.k0) {
                        if (gd0Var.i0 == 0) {
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
                            gd0Var.u0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context4);
                            alertDialog$Builder3.a.R = org.telegram.messenger.hd.M0(2131746072, null);
                            alertDialog$Builder3.a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131751446, gd0Var.b));
                            alertDialog$Builder3.i(org.telegram.messenger.hd.M0(2131751447, null), new org.telegram.ui.pu(22, gd0Var, context4));
                            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131751449, null), new org.telegram.ui.vc0(gd0Var, i15));
                            alertDialog$Builder3.p();
                            break;
                        } else if (gd0Var.u0.V.getTag() == null) {
                            gd0Var.v();
                            break;
                        }
                    }
                }
                break;
            case 27:
                org.telegram.ui.be0 be0Var = (org.telegram.ui.be0) this.b;
                Context context5 = (Context) this.c;
                Toast toast = be0Var.Q;
                if (toast != null) {
                    toast.cancel();
                    be0Var.Q = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (be0Var.O > 0 && currentTimeMillis - be0Var.P > 1500) {
                    be0Var.O = 0;
                }
                int i50 = be0Var.O + 1;
                be0Var.O = i50;
                be0Var.P = currentTimeMillis;
                if (i50 >= 5) {
                    be0Var.O = 0;
                    be0Var.P = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(be0Var.getContext());
                    alertDialog$Builder4.a.R = org.telegram.messenger.hd.M0(2131745487, null);
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.hd.M0(org.telegram.messenger.r2.a ? 2131751640 : 2131751632, null), org.telegram.messenger.hd.M0(2131751614, null)}, new org.telegram.ui.k4(be0Var, i13));
                    alertDialog$Builder4.p();
                    break;
                } else if (i50 > 1) {
                    Toast makeText = Toast.makeText(context5, org.telegram.messenger.hd.G(5 - i50, "DebugMenuLoginToast", new Object[0]), 0);
                    be0Var.Q = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.hg0 hg0Var = (org.telegram.ui.hg0) this.b;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.c;
                org.telegram.ui.jg0 jg0Var = hg0Var.d;
                if (!jg0Var.g0(ijVar)) {
                    jg0Var.getOrCreateStoryViewer().L(jg0Var.getParentActivity(), ijVar.l, di.h7.a(jg0Var.f));
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                org.telegram.ui.ActionBar.r6.t(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.k6.l6 : org.telegram.ui.ActionBar.k6.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
        }
    }
}
