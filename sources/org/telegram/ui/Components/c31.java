package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c31(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x05a2  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i7;
        int i10 = 11;
        int i11 = 5;
        int i12 = 3;
        ArrayList arrayList = null;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                k31 k31Var = (k31) this.b;
                z41 z41Var = (z41) this.c;
                k31Var.g2 = false;
                k31Var.Y0();
                z41Var.O(true);
                k31Var.J0();
                break;
            case 1:
                f31 f31Var = (f31) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = f31Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(lr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.b;
                ((org.telegram.ui.ActionBar.h1) this.c).d(true);
                p31.a(ckVar.getContext(), ckVar.d);
                break;
            case 3:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i16 = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.h2 h2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = h2Var.getMessagesController().o1(message.peer_id);
                h2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new e2(undoView, 17), 2);
                break;
            case 4:
                k51 k51Var = (k51) this.b;
                File file = (File) this.c;
                if (file == null) {
                    k51Var.getClass();
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(k51Var.getContext());
                    if (W != null) {
                        org.telegram.messenger.g0.t2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                        k51Var.dismiss();
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) this.b;
                org.telegram.ui.f40 f40Var = (org.telegram.ui.f40) this.c;
                if (b20Var.h()) {
                    org.telegram.ui.Components.voip.j1.k(f40Var.d2);
                    break;
                } else {
                    z10.g0 = false;
                    f40Var.dismiss();
                    break;
                }
            case 6:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.b;
                mh0 mh0Var = (mh0) this.c;
                boolean z10 = w0Var.w;
                w0Var.w = !z10;
                if (z10) {
                    mh0Var.M(69);
                    mh0Var.P(99);
                } else {
                    mh0Var.M(36);
                    mh0Var.P(69);
                }
                mh0Var.start();
                break;
            case 7:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                c2Var.c(z11, true);
                break;
            case 8:
                org.telegram.ui.Components.voip.h2 h2Var2 = (org.telegram.ui.Components.voip.h2) this.b;
                Context context = (Context) this.c;
                h2Var2.getClass();
                boolean z12 = context instanceof LaunchActivity;
                if (!z12 || org.telegram.messenger.t0.x) {
                    if (z12) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    }
                } else {
                    hc1.n((Activity) context, h2Var2.N);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.qr qrVar = (org.telegram.ui.qr) this.b;
                qrVar.showDialog((org.telegram.ui.ActionBar.x2) b5.l(qrVar.getParentActivity(), org.telegram.messenger.gd.a0(null, null, 2131743439, org.telegram.messenger.o10.l((TLRPC.User) this.c)), org.telegram.messenger.gd.M0(2131743440, null), null, new org.telegram.ui.r3(qrVar, i11), null, false, false, qrVar.r).b);
                break;
            case 10:
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
            case 11:
                boolean z13 = false;
                org.telegram.ui.au auVar = (org.telegram.ui.au) this.b;
                ei.c cVar = (ei.c) this.c;
                org.telegram.ui.zt ztVar = auVar.T1;
                ow0[] ow0VarArr = auVar.X1;
                for (ow0 ow0Var : ow0VarArr) {
                    if (ow0Var != null) {
                        boolean z14 = ow0Var.c;
                    }
                }
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                int intValue2 = ((Integer) c2Var2.getTag()).intValue();
                ow0 ow0Var2 = ow0VarArr[intValue2];
                boolean z15 = ow0Var2.c;
                boolean z16 = !z15;
                if (z15 != z16) {
                    ow0Var2.c = z16;
                    ow0Var2.d = true;
                }
                c2Var2.c(ow0Var2.c, true);
                boolean z17 = ow0VarArr[intValue2].c;
                ArrayList arrayList3 = cVar.d;
                HashSet hashSet = cVar.j;
                if (intValue2 == 0) {
                    cVar.m = z17;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = cVar.e;
                        cVar.o = z17;
                    } else if (intValue2 == 3) {
                        arrayList = cVar.f;
                        cVar.p = z17;
                    } else if (intValue2 == 4) {
                        arrayList = cVar.g;
                        cVar.q = z17;
                    } else if (intValue2 == 7) {
                        arrayList = cVar.h;
                    }
                    if (arrayList != null) {
                        int i18 = 0;
                        while (i18 < arrayList.size()) {
                            if (((ei.b) arrayList.get(i18)).d == intValue2) {
                                if (z17) {
                                    if (!hashSet.contains(arrayList.get(i18))) {
                                        hashSet.add((ei.b) arrayList.get(i18));
                                        cVar.g((ei.b) arrayList.get(i18), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i18))) {
                                    hashSet.remove(arrayList.get(i18));
                                    cVar.g((ei.b) arrayList.get(i18), z13);
                                }
                            }
                            i18++;
                            z13 = false;
                        }
                    }
                    auVar.a2.d();
                    auVar.W1.a(ztVar.d(), true);
                    ztVar.c(true);
                    break;
                } else {
                    cVar.n = z17;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                auVar.a2.d();
                auVar.W1.a(ztVar.d(), true);
                ztVar.c(true);
            case 12:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.b;
                y60 y60Var = (y60) this.c;
                cxVar.getClass();
                y60Var.v();
                cxVar.presentFragment(new ProxyListActivity());
                break;
            case 13:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 14:
                org.telegram.ui.cx cxVar2 = (org.telegram.ui.cx) this.b;
                cxVar2.K4((ArrayList) this.c, org.telegram.messenger.ks.n1, false, false, null);
                cxVar2.finishPreviewFragment();
                break;
            case 15:
                li.l0.e((org.telegram.ui.ActionBar.u1[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.cx) this.b).b3);
                break;
            case 16:
                org.telegram.ui.cx.k0((org.telegram.ui.cx) this.b, (org.telegram.messenger.t1) this.c);
                break;
            case 17:
                org.telegram.ui.j00 j00Var = (org.telegram.ui.j00) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.k00) this.c).getSuggestedFilter();
                org.telegram.messenger.ro roVar = new org.telegram.messenger.ro();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                roVar.b = tL_textWithEntities.text;
                roVar.c = tL_textWithEntities.entities;
                roVar.a = 2;
                while (j00Var.e.getMessagesController().T0.get(roVar.a) != null) {
                    roVar.a++;
                }
                roVar.f = j00Var.e.getMessagesController().V0().size();
                roVar.d = -1;
                roVar.e = -1;
                int i19 = 0;
                while (i19 < i13) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i19 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                    ArrayList arrayList5 = i19 == 0 ? roVar.h : roVar.i;
                    int size2 = arrayList4.size();
                    int i20 = i14;
                    while (i20 < size2) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(i20);
                        int i21 = i13;
                        int i22 = i14;
                        long j3 = inputPeer.user_id;
                        if (j3 == 0) {
                            long j10 = inputPeer.chat_id;
                            j3 = j10 != 0 ? -j10 : -inputPeer.channel_id;
                        }
                        i20 = com.google.android.gms.internal.vision.e2.g(i20, 1, j3, arrayList5);
                        i14 = i22;
                        i13 = i21;
                    }
                    i19++;
                }
                TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                if (dialogFilter2.groups) {
                    int i23 = roVar.g;
                    int i24 = org.telegram.messenger.mp.I8;
                    roVar.g = i23 | 4;
                }
                if (dialogFilter2.bots) {
                    int i25 = roVar.g;
                    int i26 = org.telegram.messenger.mp.I8;
                    roVar.g = i25 | 16;
                }
                if (dialogFilter2.contacts) {
                    int i27 = roVar.g;
                    int i28 = org.telegram.messenger.mp.I8;
                    roVar.g = i27 | 1;
                }
                if (dialogFilter2.non_contacts) {
                    int i29 = roVar.g;
                    int i30 = org.telegram.messenger.mp.I8;
                    roVar.g = i29 | 2;
                }
                if (dialogFilter2.broadcasts) {
                    int i31 = roVar.g;
                    int i32 = org.telegram.messenger.mp.I8;
                    roVar.g = i31 | 8;
                }
                if (dialogFilter2.exclude_archived) {
                    int i33 = roVar.g;
                    int i34 = org.telegram.messenger.mp.I8;
                    roVar.g = i33 | 128;
                }
                if (dialogFilter2.exclude_read) {
                    int i35 = roVar.g;
                    int i36 = org.telegram.messenger.mp.I8;
                    roVar.g = i35 | 64;
                }
                if (dialogFilter2.exclude_muted) {
                    int i37 = roVar.g;
                    int i38 = org.telegram.messenger.mp.I8;
                    roVar.g = i37 | 32;
                }
                org.telegram.ui.kz.z0(roVar, roVar.g, roVar.b, roVar.c, roVar.n, roVar.m, roVar.h, roVar.i, roVar.j, true, true, true, true, true, j00Var.e, new org.telegram.ui.vs(18, j00Var, suggestedFilter));
                break;
            case 18:
                vf.c.t((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 19:
                kp0 kp0Var = (kp0) this.b;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.c;
                kp0Var.run();
                x2Var.dismiss();
                break;
            case 20:
                org.telegram.ui.t10 t10Var = (org.telegram.ui.t10) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.f40 f40Var2 = t10Var.F;
                org.telegram.messenger.t3 t3Var = f40Var2.V2;
                if (t3Var != null && t3Var.w) {
                    f40Var2.N1(textView);
                    break;
                }
                break;
            case 21:
                new org.telegram.ui.q30((Context) this.c, (org.telegram.ui.uv) this.b).show();
                break;
            case 22:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) this.b;
                ph0 ph0Var = (ph0) this.c;
                if (!org.telegram.ui.cx.C4) {
                    org.telegram.ui.cx.C4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
                    boolean z18 = !q10;
                    org.telegram.ui.ActionBar.m6 Q0 = !q10 ? org.telegram.ui.ActionBar.n6.Q0("Night") : org.telegram.ui.ActionBar.n6.Q0("Blue");
                    org.telegram.ui.ActionBar.n6.o = 0;
                    org.telegram.ui.ActionBar.n6.w1();
                    org.telegram.ui.ActionBar.n6.B();
                    mh0 mh0Var2 = v50Var.w;
                    mh0Var2.P(!q10 ? mh0Var2.e[0] - 1 : 0);
                    ph0Var.d();
                    int[] iArr = {(ph0Var.getMeasuredWidth() / 2) + r15, (ph0Var.getMeasuredHeight() / 2) + r15};
                    ph0Var.getLocationInWindow(iArr);
                    int i39 = iArr[0];
                    int i40 = iArr[1];
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.v4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z18), ph0Var);
                    ph0Var.setContentDescription(org.telegram.messenger.gd.M0(!q10 ? 2131754751 : 2131754750, null));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) this.b;
                org.telegram.ui.ActionBar.h2 h2Var3 = (org.telegram.ui.ActionBar.h2) this.c;
                f60Var.R.dismiss();
                if (f60Var.g0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i41 = f60Var.d0;
                    if (i41 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i41 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.cx cxVar3 = new org.telegram.ui.cx(bundle);
                    cxVar3.E2 = new org.telegram.ui.at(i10, f60Var, cxVar3);
                    h2Var3.presentFragment(cxVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, f60Var.d0);
                    org.telegram.ui.x5 x5Var = new org.telegram.ui.x5(bundle2);
                    x5Var.d = f60Var.g0;
                    x5Var.Z();
                    h2Var3.presentFragment(x5Var);
                    break;
                }
            case 24:
                org.telegram.messenger.cd[] cdVarArr = (org.telegram.messenger.cd[]) this.b;
                org.telegram.ui.Cells.r4[] r4VarArr = (org.telegram.ui.Cells.r4[]) this.c;
                String str = LaunchActivity.C1;
                Integer num = (Integer) view.getTag();
                cdVarArr[0] = ((org.telegram.ui.Cells.r4) view).getCurrentLocale();
                int i42 = 0;
                while (i42 < 2) {
                    r4VarArr[i42].a.a(i42 == num.intValue(), true);
                    i42++;
                }
                break;
            case 25:
                b5.x((Context) this.c, org.telegram.messenger.gd.M0(2131750866, null), org.telegram.messenger.gd.M0(2131745315, null), -1L, new org.telegram.ui.z80((org.telegram.ui.j90) this.b, i14));
                break;
            case 26:
                org.telegram.ui.j90 j90Var = (org.telegram.ui.j90) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (j90Var.e == null) {
                    org.telegram.ui.g90 g90Var = j90Var.f;
                    if (g90Var.e.h) {
                        int i43 = -j90Var.N;
                        j90Var.N = i43;
                        org.telegram.messenger.g0.E3(i43, g90Var, null);
                        break;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        Switch r42 = r8Var.e;
                        r8Var.setChecked(!r42.h);
                        j90Var.r.setVisibility(r42.h ? 0 : 8);
                        org.telegram.messenger.g0.r(runnableArr[0]);
                        if (r42.h) {
                            j90Var.f.setChecked(false);
                            j90Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            j90Var.h.setText(org.telegram.messenger.gd.M0(2131754199, null));
                            org.telegram.ui.c90 c90Var = new org.telegram.ui.c90(j90Var, i15);
                            runnableArr[0] = c90Var;
                            org.telegram.messenger.g0.h3(c90Var, 60L);
                            break;
                        } else {
                            j90Var.f.setCheckBoxIcon(0);
                            j90Var.h.setText(org.telegram.messenger.gd.M0(2131754200, null));
                            org.telegram.ui.c90 c90Var2 = new org.telegram.ui.c90(j90Var, i13);
                            runnableArr[0] = c90Var2;
                            org.telegram.messenger.g0.g3(c90Var2);
                            break;
                        }
                    }
                }
                break;
            case 27:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) this.b;
                pa0Var.B0((org.telegram.ui.la0) this.c);
                org.telegram.ui.ka0 ka0Var = pa0Var.P0;
                if (ka0Var != null) {
                    ka0Var.dismiss();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) this.b;
                Context context2 = (Context) this.c;
                String string = ob0Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    dz0 dz0Var = new dz0();
                    dz0Var.a |= 256;
                    dz0Var.b = indexOf;
                    int i44 = lastIndexOf + 1;
                    dz0Var.c = i44;
                    spannableStringBuilder.setSpan(new ez0(dz0Var, 0), indexOf, i44, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131748536, null);
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131748540, null));
                int i45 = ob0Var.H;
                int i46 = i45 / 86400;
                int i47 = i45 % 86400;
                int i48 = i47 / 3600;
                int i49 = (i47 % 3600) / 60;
                if (i46 == 0 && i48 == 0) {
                    i49 = Math.max(1, i49);
                }
                alertDialog$Builder.a.U = org.telegram.messenger.g0.m0(W2, spannableStringBuilder, (i46 == 0 || i48 == 0) ? (i48 == 0 || i49 == 0) ? i46 != 0 ? org.telegram.messenger.gd.a0(null, null, 2131748542, org.telegram.messenger.gd.G(i46, "Days", new Object[0])) : i48 != 0 ? org.telegram.messenger.gd.a0(null, null, 2131748542, org.telegram.messenger.gd.G(i46, "Hours", new Object[0])) : org.telegram.messenger.gd.a0(null, null, 2131748542, org.telegram.messenger.gd.G(i49, "Minutes", new Object[0])) : org.telegram.messenger.gd.a0(null, null, 2131748543, org.telegram.messenger.gd.G(i48, "Hours", new Object[0]), org.telegram.messenger.gd.G(i49, "Minutes", new Object[0])) : org.telegram.messenger.gd.a0(null, null, 2131748543, org.telegram.messenger.gd.G(i46, "Days", new Object[0]), org.telegram.messenger.gd.G(i48, "Hours", new Object[0])));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131748544, null), new org.telegram.ui.zr(ob0Var, 19));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.wb0 wb0Var = (org.telegram.ui.wb0) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.de0 de0Var = wb0Var.E;
                if (de0Var.W.getTag() == null) {
                    if (wb0Var.n.has_recovery) {
                        de0Var.F1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i7 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_requestPasswordRecovery, new org.telegram.ui.ub0(wb0Var, i15), 10);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(wb0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                        alertDialog$Builder2.a.S = org.telegram.messenger.gd.M0(2131745876, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.gd.M0(2131745878, null);
                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131752030, null), null);
                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131745922, null), new org.telegram.ui.zr(wb0Var, 20));
                        alertDialog$Builder2.p();
                        break;
                    }
                }
                break;
        }
    }
}
