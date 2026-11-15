package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.ec1;
import org.telegram.ui.s81;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vv0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0380  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i7 = 5;
        int i10 = 3;
        ArrayList arrayList = null;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                xv0 xv0Var = (xv0) this.b;
                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) this.c;
                org.telegram.ui.ns.p().u(xv0Var.r.h2);
                org.telegram.ui.ns.p().x(y7Var);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) this.b;
                Runnable runnable = (Runnable) this.c;
                org.telegram.messenger.g0.g(charSequence);
                runnable.run();
                break;
            case 2:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                u2Var.dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.np.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 3:
                v01 v01Var = (v01) this.b;
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) this.c;
                v01Var.d();
                org.telegram.ui.an anVar = dkVar.a;
                s81 f02 = s81.f0(-anVar.k6, 0L);
                f02.E = anVar;
                anVar.presentFragment(f02);
                break;
            case 4:
                a31 a31Var = (a31) this.b;
                p41 p41Var = (p41) this.c;
                a31Var.g2 = false;
                a31Var.X0();
                p41Var.O(true);
                a31Var.I0();
                break;
            case 5:
                v21 v21Var = (v21) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = v21Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(er.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.b;
                ((org.telegram.ui.ActionBar.g1) this.c).d(true);
                f31.a(bkVar.getContext(), bkVar.d);
                break;
            case 7:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i13 = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.e2 e2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = e2Var.getMessagesController().m1(message.peer_id);
                e2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new v1(undoView, 17), 2);
                break;
            case 8:
                a51 a51Var = (a51) this.b;
                File file = (File) this.c;
                if (file == null) {
                    a51Var.getClass();
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(a51Var.getContext());
                    if (W != null) {
                        org.telegram.messenger.g0.t2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                        a51Var.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.y10 y10Var = (org.telegram.ui.y10) this.b;
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) this.c;
                if (y10Var.h()) {
                    org.telegram.ui.Components.voip.k1.k(c40Var.d2);
                    break;
                } else {
                    s10.g0 = false;
                    c40Var.dismiss();
                    break;
                }
            case 10:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                ch0 ch0Var = (ch0) this.c;
                boolean z10 = x0Var.w;
                x0Var.w = !z10;
                if (z10) {
                    ch0Var.M(69);
                    ch0Var.P(99);
                } else {
                    ch0Var.M(36);
                    ch0Var.P(69);
                }
                ch0Var.start();
                break;
            case 11:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                c2Var.c(z11, true);
                break;
            case 12:
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
                    ec1.n((Activity) context, i2Var.N);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.pr prVar = (org.telegram.ui.pr) this.b;
                prVar.showDialog((org.telegram.ui.ActionBar.u2) t4.l(prVar.getParentActivity(), org.telegram.messenger.hd.a0(null, null, 2131743676, org.telegram.messenger.q10.k((TLRPC.User) this.c)), org.telegram.messenger.hd.M0(2131743677, null), null, new org.telegram.ui.r3(prVar, i7), null, false, false, prVar.r).b);
                break;
            case 14:
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
                        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(nsVar.r);
                        TLRPC.Document document = nsVar.W;
                        int size = b02.j0.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                if (((TLRPC.Document) b02.j0.get(i14)).id == document.id) {
                                    b02.j0.remove(i14);
                                } else {
                                    i14++;
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
                        b02.getConnectionsManager().sendRequest(tL_messages_saveGif, new org.telegram.messenger.r4(i10, b02, tL_messages_saveGif));
                        b02.getMessagesStorage().a.c(new org.telegram.messenger.mf(b02, document, i12));
                        nsVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        org.telegram.messenger.si.b0(nsVar.r).c(nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        org.telegram.messenger.np.s1(nsVar.r).t4("gif", nsVar.W);
                        nsVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document2 = nsVar.W;
                        TLRPC.BotInlineResult botInlineResult = nsVar.Z;
                        Object obj = nsVar.b0;
                        org.telegram.ui.ls lsVar3 = nsVar.l;
                        t4.J(nsVar.w, lsVar3.a(), new a1.d(lsVar3, document2, botInlineResult, obj, 12), nsVar.c0);
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
            case 15:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) this.b;
                ei.c cVar = (ei.c) this.c;
                org.telegram.ui.xt xtVar = ytVar.T1;
                hw0[] hw0VarArr = ytVar.X1;
                for (hw0 hw0Var : hw0VarArr) {
                    if (hw0Var != null) {
                        boolean z13 = hw0Var.c;
                    }
                }
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                int intValue2 = ((Integer) c2Var2.getTag()).intValue();
                hw0 hw0Var2 = hw0VarArr[intValue2];
                boolean z14 = hw0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    hw0Var2.c = z15;
                    hw0Var2.d = true;
                }
                c2Var2.c(hw0Var2.c, true);
                boolean z16 = hw0VarArr[intValue2].c;
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
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            if (((ei.b) arrayList.get(i15)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i15))) {
                                        hashSet.add((ei.b) arrayList.get(i15));
                                        cVar.g((ei.b) arrayList.get(i15), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i15))) {
                                    hashSet.remove(arrayList.get(i15));
                                    cVar.g((ei.b) arrayList.get(i15), false);
                                }
                            }
                        }
                    }
                    ytVar.a2.d();
                    ytVar.W1.a(xtVar.d(), true);
                    xtVar.c(true);
                    break;
                } else {
                    cVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                ytVar.a2.d();
                ytVar.W1.a(xtVar.d(), true);
                xtVar.c(true);
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 17:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.b;
                ywVar.D4((ArrayList) this.c, org.telegram.messenger.ns.n1, false, false, null);
                ywVar.finishPreviewFragment();
                break;
            case 18:
                li.l0.e((org.telegram.ui.ActionBar.t1[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.yw) this.b).b3);
                break;
            case 19:
                org.telegram.ui.yw.I0((org.telegram.ui.yw) this.b, (org.telegram.messenger.t1) this.c);
                break;
            case 20:
                org.telegram.ui.yw ywVar2 = (org.telegram.ui.yw) this.b;
                m60 m60Var = (m60) this.c;
                ywVar2.getClass();
                m60Var.u();
                ywVar2.presentFragment(new ProxyListActivity());
                break;
            case 21:
                org.telegram.ui.g00 g00Var = (org.telegram.ui.g00) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.h00) this.c).getSuggestedFilter();
                org.telegram.messenger.so soVar = new org.telegram.messenger.so();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                soVar.b = tL_textWithEntities.text;
                soVar.c = tL_textWithEntities.entities;
                soVar.a = 2;
                while (g00Var.e.getMessagesController().T0.get(soVar.a) != null) {
                    soVar.a++;
                }
                soVar.f = g00Var.e.getMessagesController().T0().size();
                soVar.d = -1;
                soVar.e = -1;
                int i16 = 0;
                while (i16 < 2) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i16 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                    ArrayList arrayList5 = i16 == 0 ? soVar.h : soVar.i;
                    int size2 = arrayList4.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(i17);
                        long j3 = inputPeer.user_id;
                        if (j3 == 0) {
                            long j10 = inputPeer.chat_id;
                            if (j10 == 0) {
                                j10 = inputPeer.channel_id;
                            }
                            j3 = -j10;
                        }
                        i17 = com.google.android.gms.internal.vision.e2.g(i17, 1, j3, arrayList5);
                    }
                    i16++;
                }
                TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                if (dialogFilter2.groups) {
                    int i18 = soVar.g;
                    int i19 = org.telegram.messenger.np.D8;
                    soVar.g = i18 | 4;
                }
                if (dialogFilter2.bots) {
                    int i20 = soVar.g;
                    int i21 = org.telegram.messenger.np.D8;
                    soVar.g = i20 | 16;
                }
                if (dialogFilter2.contacts) {
                    int i22 = soVar.g;
                    int i23 = org.telegram.messenger.np.D8;
                    soVar.g = i22 | 1;
                }
                if (dialogFilter2.non_contacts) {
                    int i24 = soVar.g;
                    int i25 = org.telegram.messenger.np.D8;
                    soVar.g = i24 | 2;
                }
                if (dialogFilter2.broadcasts) {
                    int i26 = soVar.g;
                    int i27 = org.telegram.messenger.np.D8;
                    soVar.g = i26 | 8;
                }
                if (dialogFilter2.exclude_archived) {
                    int i28 = soVar.g;
                    int i29 = org.telegram.messenger.np.D8;
                    soVar.g = i28 | 128;
                }
                if (dialogFilter2.exclude_read) {
                    int i30 = soVar.g;
                    int i31 = org.telegram.messenger.np.D8;
                    soVar.g = i30 | 64;
                }
                if (dialogFilter2.exclude_muted) {
                    int i32 = soVar.g;
                    int i33 = org.telegram.messenger.np.D8;
                    soVar.g = i32 | 32;
                }
                org.telegram.ui.hz.z0(soVar, soVar.g, soVar.b, soVar.c, soVar.n, soVar.m, soVar.h, soVar.i, soVar.j, true, true, true, true, true, g00Var.e, new org.telegram.ui.Components.voip.u(23, g00Var, suggestedFilter));
                break;
            case 22:
                vf.c.t((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 23:
                sp0 sp0Var = (sp0) this.b;
                org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) this.c;
                sp0Var.run();
                u2Var2.dismiss();
                break;
            case 24:
                org.telegram.ui.q10 q10Var = (org.telegram.ui.q10) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.c40 c40Var2 = q10Var.F;
                org.telegram.messenger.r3 r3Var = c40Var2.V2;
                if (r3Var != null && r3Var.w) {
                    c40Var2.M1(textView);
                    break;
                }
                break;
            case 25:
                new org.telegram.ui.n30((Context) this.c, (org.telegram.ui.rv) this.b).show();
                break;
            case 26:
                org.telegram.ui.t50 t50Var = (org.telegram.ui.t50) this.b;
                fh0 fh0Var = (fh0) this.c;
                if (!org.telegram.ui.yw.z4) {
                    org.telegram.ui.yw.z4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
                    boolean z17 = !q10;
                    org.telegram.ui.ActionBar.i6 Q0 = !q10 ? org.telegram.ui.ActionBar.j6.Q0("Night") : org.telegram.ui.ActionBar.j6.Q0("Blue");
                    org.telegram.ui.ActionBar.j6.o = 0;
                    org.telegram.ui.ActionBar.j6.w1();
                    org.telegram.ui.ActionBar.j6.B();
                    ch0 ch0Var2 = t50Var.w;
                    ch0Var2.P(!q10 ? ch0Var2.e[0] - 1 : 0);
                    fh0Var.d();
                    int[] iArr = {(fh0Var.getMeasuredWidth() / 2) + r15, (fh0Var.getMeasuredHeight() / 2) + r15};
                    fh0Var.getLocationInWindow(iArr);
                    int i34 = iArr[0];
                    int i35 = iArr[1];
                    org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), fh0Var);
                    fh0Var.setContentDescription(org.telegram.messenger.hd.M0(!q10 ? 2131754751 : 2131754750, null));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.b;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.c;
                d60Var.R.dismiss();
                if (d60Var.g0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i36 = d60Var.d0;
                    if (i36 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i36 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.yw ywVar3 = new org.telegram.ui.yw(bundle);
                    ywVar3.E2 = new org.telegram.ui.tr(12, d60Var, ywVar3);
                    e2Var2.presentFragment(ywVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, d60Var.d0);
                    org.telegram.ui.y5 y5Var = new org.telegram.ui.y5(bundle2);
                    y5Var.d = d60Var.g0;
                    y5Var.Z();
                    e2Var2.presentFragment(y5Var);
                    break;
                }
            case 28:
                org.telegram.messenger.dd[] ddVarArr = (org.telegram.messenger.dd[]) this.b;
                org.telegram.ui.Cells.r4[] r4VarArr = (org.telegram.ui.Cells.r4[]) this.c;
                String str = LaunchActivity.C1;
                Integer num = (Integer) view.getTag();
                ddVarArr[0] = ((org.telegram.ui.Cells.r4) view).getCurrentLocale();
                int i37 = 0;
                while (i37 < 2) {
                    r4VarArr[i37].a.a(i37 == num.intValue(), true);
                    i37++;
                }
                break;
            default:
                t4.x((Context) this.c, org.telegram.messenger.hd.M0(2131750877, null), org.telegram.messenger.hd.M0(2131745510, null), -1L, new org.telegram.ui.x80((org.telegram.ui.i90) this.b, i11));
                break;
        }
    }
}
