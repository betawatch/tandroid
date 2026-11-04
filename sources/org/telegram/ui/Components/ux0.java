package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.l81;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ux0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ux0(int i3, KeyEvent.Callback callback, Object obj) {
        this.a = i3;
        this.c = obj;
        this.b = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x041d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i3 = 5;
        int i10 = 3;
        ArrayList arrayList = null;
        int i11 = 2;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                t2Var.dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.hp.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                n01 n01Var = (n01) this.b;
                org.telegram.ui.zj zjVar = (org.telegram.ui.zj) this.c;
                n01Var.c();
                org.telegram.ui.wm wmVar = zjVar.a;
                l81 f02 = l81.f0(-wmVar.k6, 0L);
                f02.E = wmVar;
                wmVar.presentFragment(f02);
                break;
            case 2:
                q21 q21Var = (q21) this.b;
                f41 f41Var = (f41) this.c;
                q21Var.d2 = false;
                q21Var.X0();
                f41Var.O(true);
                q21Var.I0();
                break;
            case 3:
                l21 l21Var = (l21) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = l21Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(xq.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.xj xjVar = (org.telegram.ui.xj) this.b;
                ((org.telegram.ui.ActionBar.f1) this.c).d(true);
                v21.a(xjVar.getContext(), xjVar.d);
                break;
            case 5:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i14 = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.d2 d2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = d2Var.getMessagesController().m1(message.peer_id);
                d2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new w1(undoView, 17), 2);
                break;
            case 6:
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
            case 7:
                org.telegram.ui.u10 u10Var = (org.telegram.ui.u10) this.b;
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) this.c;
                if (u10Var.h()) {
                    if (xf.b.a(x30Var.a2) > 0) {
                        org.telegram.ui.Components.voip.s0.h(x30Var.a2);
                        x30Var.dismiss();
                        break;
                    } else {
                        t4.A(x30Var.a2, null, true).p();
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = x30Var.a2;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity)) {
                        l10.f0 = false;
                        x30Var.dismiss();
                        break;
                    } else {
                        t4.z(u10Var.getContext()).p();
                        break;
                    }
                }
            case 8:
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) this.b;
                ch0 ch0Var = (ch0) this.c;
                boolean z10 = f0Var.w;
                f0Var.w = !z10;
                if (z10) {
                    ch0Var.M(69);
                    ch0Var.P(99);
                } else {
                    ch0Var.M(36);
                    ch0Var.P(69);
                }
                ch0Var.start();
                break;
            case 9:
                boolean[] zArr2 = (boolean[]) this.c;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.b;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                c2Var.c(z11, true);
                break;
            case 10:
                org.telegram.ui.Components.voip.u1 u1Var = (org.telegram.ui.Components.voip.u1) this.b;
                Context context = (Context) this.c;
                u1Var.getClass();
                boolean z12 = context instanceof LaunchActivity;
                if (!z12 || org.telegram.messenger.t0.x) {
                    if (z12) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    }
                } else {
                    zb1.v((Activity) context, u1Var.N);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.lr lrVar = (org.telegram.ui.lr) this.b;
                lrVar.showDialog((org.telegram.ui.ActionBar.t2) t4.l(lrVar.getParentActivity(), org.telegram.messenger.bd.a0(null, null, 2131743686, org.telegram.messenger.l10.k((TLRPC.User) this.c)), org.telegram.messenger.bd.M0(2131743687, null), null, new org.telegram.ui.s3(lrVar, i3), null, false, false, lrVar.r).b);
                break;
            case 12:
                org.telegram.ui.es esVar = (org.telegram.ui.es) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.is isVar = esVar.a;
                if (isVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.gs gsVar = isVar.l;
                        TLObject tLObject = isVar.W;
                        if (tLObject == null) {
                            tLObject = isVar.Z;
                        }
                        gsVar.s(0, 0, isVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.gs gsVar2 = isVar.l;
                        TLObject tLObject2 = isVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = isVar.Z;
                        }
                        gsVar2.s(0, 0, isVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(isVar.r);
                        TLRPC.Document document = isVar.W;
                        int size = b02.j0.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                if (((TLRPC.Document) b02.j0.get(i15)).id == document.id) {
                                    b02.j0.remove(i15);
                                } else {
                                    i15++;
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
                        b02.getConnectionsManager().sendRequest(tL_messages_saveGif, new org.telegram.messenger.s4(i10, b02, tL_messages_saveGif));
                        b02.getMessagesStorage().a.c(new org.telegram.messenger.ef(b02, document, i13));
                        isVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        org.telegram.messenger.li.b0(isVar.r).c(isVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        org.telegram.messenger.hp.s1(isVar.r).t4("gif", isVar.W);
                        isVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document2 = isVar.W;
                        TLRPC.BotInlineResult botInlineResult = isVar.Z;
                        Object obj = isVar.b0;
                        org.telegram.ui.gs gsVar3 = isVar.l;
                        t4.L(isVar.w, gsVar3.a(), new a1.d(gsVar3, document2, botInlineResult, obj, 11), isVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.gs gsVar4 = isVar.l;
                        TLObject tLObject3 = isVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = isVar.Z;
                        }
                        gsVar4.w(tLObject3, isVar.b0);
                    }
                    isVar.o();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ut utVar = (org.telegram.ui.ut) this.b;
                di.c cVar = (di.c) this.c;
                org.telegram.ui.tt ttVar = utVar.Q1;
                dw0[] dw0VarArr = utVar.U1;
                for (dw0 dw0Var : dw0VarArr) {
                    if (dw0Var != null) {
                        boolean z13 = dw0Var.c;
                    }
                }
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                int intValue2 = ((Integer) c2Var2.getTag()).intValue();
                dw0 dw0Var2 = dw0VarArr[intValue2];
                boolean z14 = dw0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    dw0Var2.c = z15;
                    dw0Var2.d = true;
                }
                c2Var2.c(dw0Var2.c, true);
                boolean z16 = dw0VarArr[intValue2].c;
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
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            if (((di.b) arrayList.get(i16)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i16))) {
                                        hashSet.add((di.b) arrayList.get(i16));
                                        cVar.g((di.b) arrayList.get(i16), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i16))) {
                                    hashSet.remove(arrayList.get(i16));
                                    cVar.g((di.b) arrayList.get(i16), false);
                                }
                            }
                        }
                    }
                    utVar.X1.d();
                    utVar.T1.a(ttVar.d(), true);
                    ttVar.c(true);
                    break;
                } else {
                    cVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                utVar.X1.d();
                utVar.T1.a(ttVar.d(), true);
                ttVar.c(true);
            case 14:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 15:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.b;
                uwVar.D4((ArrayList) this.c, org.telegram.messenger.hs.n1, false, false, null);
                uwVar.finishPreviewFragment();
                break;
            case 16:
                ji.j0.e((org.telegram.ui.ActionBar.s1[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.uw) this.b).a3);
                break;
            case 17:
                org.telegram.ui.uw.I0((org.telegram.ui.uw) this.b, (org.telegram.messenger.t1) this.c);
                break;
            case 18:
                org.telegram.ui.uw uwVar2 = (org.telegram.ui.uw) this.b;
                f60 f60Var = (f60) this.c;
                uwVar2.getClass();
                f60Var.u();
                uwVar2.presentFragment(new ProxyListActivity());
                break;
            case 19:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.d00) this.c).getSuggestedFilter();
                org.telegram.messenger.mo moVar = new org.telegram.messenger.mo();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                moVar.b = tL_textWithEntities.text;
                moVar.c = tL_textWithEntities.entities;
                moVar.a = 2;
                while (c00Var.e.getMessagesController().T0.get(moVar.a) != null) {
                    moVar.a++;
                }
                moVar.f = c00Var.e.getMessagesController().T0().size();
                moVar.d = -1;
                moVar.e = -1;
                int i17 = 0;
                while (i17 < 2) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i17 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                    ArrayList arrayList5 = i17 == 0 ? moVar.h : moVar.i;
                    int size2 = arrayList4.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(i18);
                        long j10 = inputPeer.user_id;
                        if (j10 == 0) {
                            long j11 = inputPeer.chat_id;
                            if (j11 == 0) {
                                j11 = inputPeer.channel_id;
                            }
                            j10 = -j11;
                        }
                        i18 = a1.g.h(i18, 1, j10, arrayList5);
                    }
                    i17++;
                }
                TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                if (dialogFilter2.groups) {
                    int i19 = moVar.g;
                    int i20 = org.telegram.messenger.hp.C8;
                    moVar.g = i19 | 4;
                }
                if (dialogFilter2.bots) {
                    int i21 = moVar.g;
                    int i22 = org.telegram.messenger.hp.C8;
                    moVar.g = i21 | 16;
                }
                if (dialogFilter2.contacts) {
                    int i23 = moVar.g;
                    int i24 = org.telegram.messenger.hp.C8;
                    moVar.g = i23 | 1;
                }
                if (dialogFilter2.non_contacts) {
                    int i25 = moVar.g;
                    int i26 = org.telegram.messenger.hp.C8;
                    moVar.g = i25 | 2;
                }
                if (dialogFilter2.broadcasts) {
                    int i27 = moVar.g;
                    int i28 = org.telegram.messenger.hp.C8;
                    moVar.g = i27 | 8;
                }
                if (dialogFilter2.exclude_archived) {
                    int i29 = moVar.g;
                    int i30 = org.telegram.messenger.hp.C8;
                    moVar.g = i29 | 128;
                }
                if (dialogFilter2.exclude_read) {
                    int i31 = moVar.g;
                    int i32 = org.telegram.messenger.hp.C8;
                    moVar.g = i31 | 64;
                }
                if (dialogFilter2.exclude_muted) {
                    int i33 = moVar.g;
                    int i34 = org.telegram.messenger.hp.C8;
                    moVar.g = i33 | 32;
                }
                org.telegram.ui.ez.z0(moVar, moVar.g, moVar.b, moVar.c, moVar.n, moVar.m, moVar.h, moVar.i, moVar.j, true, true, true, true, true, c00Var.e, new org.telegram.ui.ly(i11, c00Var, suggestedFilter));
                break;
            case 20:
                sf.c.t((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 21:
                zo0 zo0Var = (zo0) this.c;
                org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) this.b;
                zo0Var.run();
                t2Var2.dismiss();
                break;
            case 22:
                org.telegram.ui.m10 m10Var = (org.telegram.ui.m10) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.x30 x30Var2 = m10Var.F;
                org.telegram.messenger.r3 r3Var = x30Var2.S2;
                if (r3Var != null && r3Var.w) {
                    x30Var2.J1(textView);
                    break;
                }
                break;
            case 23:
                new org.telegram.ui.i30((Context) this.c, (org.telegram.ui.Components.voip.r0) this.b).show();
                break;
            case 24:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) this.b;
                fh0 fh0Var = (fh0) this.c;
                if (!org.telegram.ui.uw.y4) {
                    org.telegram.ui.uw.y4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                    boolean z17 = !q10;
                    org.telegram.ui.ActionBar.j6 Q0 = !q10 ? org.telegram.ui.ActionBar.k6.Q0("Night") : org.telegram.ui.ActionBar.k6.Q0("Blue");
                    org.telegram.ui.ActionBar.k6.o = 0;
                    org.telegram.ui.ActionBar.k6.w1();
                    org.telegram.ui.ActionBar.k6.B();
                    ch0 ch0Var2 = o50Var.w;
                    ch0Var2.P(!q10 ? ch0Var2.e[0] - 1 : 0);
                    fh0Var.d();
                    int[] iArr = {(fh0Var.getMeasuredWidth() / 2) + r15, (fh0Var.getMeasuredHeight() / 2) + r15};
                    fh0Var.getLocationInWindow(iArr);
                    int i35 = iArr[0];
                    int i36 = iArr[1];
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), fh0Var);
                    fh0Var.setContentDescription(org.telegram.messenger.bd.M0(!q10 ? 2131754751 : 2131754750, null));
                    break;
                }
                break;
            case 25:
                org.telegram.ui.y50 y50Var = (org.telegram.ui.y50) this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.c;
                y50Var.R.dismiss();
                if (y50Var.g0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i37 = y50Var.d0;
                    if (i37 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i37 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.uw uwVar3 = new org.telegram.ui.uw(bundle);
                    uwVar3.D2 = new i41(18, y50Var, uwVar3);
                    d2Var2.presentFragment(uwVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, y50Var.d0);
                    org.telegram.ui.z5 z5Var = new org.telegram.ui.z5(bundle2);
                    z5Var.d = y50Var.g0;
                    z5Var.Z();
                    d2Var2.presentFragment(z5Var);
                    break;
                }
            case 26:
                org.telegram.messenger.yc[] ycVarArr = (org.telegram.messenger.yc[]) this.b;
                org.telegram.ui.Cells.r4[] r4VarArr = (org.telegram.ui.Cells.r4[]) this.c;
                String str = LaunchActivity.E1;
                Integer num = (Integer) view.getTag();
                ycVarArr[0] = ((org.telegram.ui.Cells.r4) view).getCurrentLocale();
                int i38 = 0;
                while (i38 < 2) {
                    r4VarArr[i38].a.a(i38 == num.intValue(), true);
                    i38++;
                }
                break;
            case 27:
                t4.x((Context) this.c, org.telegram.messenger.bd.M0(2131750878, null), org.telegram.messenger.bd.M0(2131745520, null), -1L, new org.telegram.ui.u80((org.telegram.ui.e90) this.b, i12));
                break;
            case 28:
                org.telegram.ui.e90 e90Var = (org.telegram.ui.e90) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (e90Var.e == null) {
                    org.telegram.ui.b90 b90Var = e90Var.f;
                    if (b90Var.e.h) {
                        int i39 = -e90Var.N;
                        e90Var.N = i39;
                        org.telegram.messenger.g0.G3(i39, b90Var, null);
                        break;
                    } else {
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        Switch r42 = q8Var.e;
                        q8Var.setChecked(!r42.h);
                        e90Var.r.setVisibility(r42.h ? 0 : 8);
                        org.telegram.messenger.g0.r(runnableArr[0]);
                        if (r42.h) {
                            e90Var.f.setChecked(false);
                            e90Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            e90Var.h.setText(org.telegram.messenger.bd.M0(2131754201, null));
                            org.telegram.ui.x80 x80Var = new org.telegram.ui.x80(e90Var, i13);
                            runnableArr[0] = x80Var;
                            org.telegram.messenger.g0.i3(x80Var, 60L);
                            break;
                        } else {
                            e90Var.f.setCheckBoxIcon(0);
                            e90Var.h.setText(org.telegram.messenger.bd.M0(2131754202, null));
                            org.telegram.ui.x80 x80Var2 = new org.telegram.ui.x80(e90Var, i11);
                            runnableArr[0] = x80Var2;
                            org.telegram.messenger.g0.h3(x80Var2);
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) this.b;
                la0Var.B0((org.telegram.ui.ha0) this.c);
                org.telegram.ui.ga0 ga0Var = la0Var.K0;
                if (ga0Var != null) {
                    ga0Var.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ux0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }
}
