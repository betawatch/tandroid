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
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u41(int i7, Object obj, Object obj2) {
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
                y41 y41Var = (y41) this.b;
                File file = (File) this.c;
                if (file == null) {
                    y41Var.getClass();
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(y41Var.getContext());
                    if (W != null) {
                        org.telegram.messenger.g0.t2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                        y41Var.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) this.b;
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) this.c;
                if (b20Var.h()) {
                    org.telegram.ui.Components.voip.g1.k(e40Var.Z1);
                    break;
                } else {
                    q10.f0 = false;
                    e40Var.dismiss();
                    break;
                }
            case 2:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.b;
                ah0 ah0Var = (ah0) this.c;
                boolean z9 = t0Var.w;
                t0Var.w = !z9;
                if (z9) {
                    ah0Var.M(69);
                    ah0Var.P(99);
                } else {
                    ah0Var.M(36);
                    ah0Var.P(69);
                }
                ah0Var.start();
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
                    ic1.n((Activity) context, e2Var.M);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.pr prVar = (org.telegram.ui.pr) this.b;
                prVar.showDialog((org.telegram.ui.ActionBar.v2) v4.l(prVar.getParentActivity(), org.telegram.messenger.id.a0(null, null, 2131743676, org.telegram.messenger.t10.k((TLRPC.User) this.c)), org.telegram.messenger.id.M0(2131743677, null), null, new org.telegram.ui.r3(prVar, i10), null, false, false, prVar.r).b);
                break;
            case 6:
                org.telegram.ui.is isVar = (org.telegram.ui.is) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.ms msVar = isVar.a;
                if (msVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.ks ksVar = msVar.l;
                        TLObject tLObject = msVar.W;
                        if (tLObject == null) {
                            tLObject = msVar.Z;
                        }
                        ksVar.s(0, 0, msVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.ks ksVar2 = msVar.l;
                        TLObject tLObject2 = msVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = msVar.Z;
                        }
                        ksVar2.s(0, 0, msVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(msVar.r);
                        TLRPC.Document document = msVar.W;
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
                        b02.getConnectionsManager().sendRequest(tL_messages_saveGif, new org.telegram.messenger.r4(i12, b02, tL_messages_saveGif));
                        b02.getMessagesStorage().a.c(new org.telegram.messenger.nf(b02, document, i15));
                        msVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        org.telegram.messenger.ui.b0(msVar.r).c(msVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        org.telegram.messenger.qp.s1(msVar.r).t4("gif", msVar.W);
                        msVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document2 = msVar.W;
                        TLRPC.BotInlineResult botInlineResult = msVar.Z;
                        Object obj = msVar.b0;
                        org.telegram.ui.ks ksVar3 = msVar.l;
                        v4.J(msVar.w, ksVar3.a(), new a1.d(ksVar3, document2, botInlineResult, obj, 12), msVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ks ksVar4 = msVar.l;
                        TLObject tLObject3 = msVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = msVar.Z;
                        }
                        ksVar4.x(tLObject3, msVar.b0);
                    }
                    msVar.o();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) this.b;
                ci.c cVar = (ci.c) this.c;
                org.telegram.ui.xt xtVar = ytVar.P1;
                fw0[] fw0VarArr = ytVar.T1;
                for (fw0 fw0Var : fw0VarArr) {
                    if (fw0Var != null) {
                        boolean z12 = fw0Var.c;
                    }
                }
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                int intValue2 = ((Integer) c2Var2.getTag()).intValue();
                fw0 fw0Var2 = fw0VarArr[intValue2];
                boolean z13 = fw0Var2.c;
                boolean z14 = !z13;
                if (z13 != z14) {
                    fw0Var2.c = z14;
                    fw0Var2.d = true;
                }
                c2Var2.c(fw0Var2.c, true);
                boolean z15 = fw0VarArr[intValue2].c;
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
                    ytVar.W1.d();
                    ytVar.S1.a(xtVar.d(), true);
                    xtVar.c(true);
                    break;
                } else {
                    cVar.n = z15;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                ytVar.W1.d();
                ytVar.S1.a(xtVar.d(), true);
                xtVar.c(true);
            case 8:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 9:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.b;
                ywVar.D4((ArrayList) this.c, org.telegram.messenger.qs.n1, false, false, null);
                ywVar.finishPreviewFragment();
                break;
            case 10:
                ii.m0.e((org.telegram.ui.ActionBar.u1[]) this.c, r0, r0.currentAccount, ((org.telegram.ui.yw) this.b).a3);
                break;
            case 11:
                org.telegram.ui.yw.I0((org.telegram.ui.yw) this.b, (org.telegram.messenger.t1) this.c);
                break;
            case 12:
                org.telegram.ui.yw ywVar2 = (org.telegram.ui.yw) this.b;
                l60 l60Var = (l60) this.c;
                ywVar2.getClass();
                l60Var.u();
                ywVar2.presentFragment(new ProxyListActivity());
                break;
            case 13:
                org.telegram.ui.g00 g00Var = (org.telegram.ui.g00) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.h00) this.c).getSuggestedFilter();
                org.telegram.messenger.vo voVar = new org.telegram.messenger.vo();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                voVar.b = tL_textWithEntities.text;
                voVar.c = tL_textWithEntities.entities;
                voVar.a = 2;
                while (g00Var.e.getMessagesController().S0.get(voVar.a) != null) {
                    voVar.a++;
                }
                voVar.f = g00Var.e.getMessagesController().T0().size();
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
                org.telegram.ui.iz.z0(voVar, voVar.g, voVar.b, voVar.c, voVar.n, voVar.m, voVar.h, voVar.i, voVar.j, true, true, true, true, true, g00Var.e, new m51(27, g00Var, suggestedFilter));
                break;
            case 14:
                vf.c.t((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 15:
                qp0 qp0Var = (qp0) this.b;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.c;
                qp0Var.run();
                v2Var.dismiss();
                break;
            case 16:
                org.telegram.ui.t10 t10Var = (org.telegram.ui.t10) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.e40 e40Var2 = t10Var.E;
                org.telegram.messenger.r3 r3Var = e40Var2.R2;
                if (r3Var != null && r3Var.w) {
                    e40Var2.M1(textView);
                    break;
                }
                break;
            case 17:
                new org.telegram.ui.p30((Context) this.c, (org.telegram.ui.n00) this.b).show();
                break;
            case 18:
                org.telegram.ui.w50 w50Var = (org.telegram.ui.w50) this.b;
                dh0 dh0Var = (dh0) this.c;
                if (!org.telegram.ui.yw.y4) {
                    org.telegram.ui.yw.y4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.l6.I.q();
                    boolean z16 = !q10;
                    org.telegram.ui.ActionBar.k6 Q0 = !q10 ? org.telegram.ui.ActionBar.l6.Q0("Night") : org.telegram.ui.ActionBar.l6.Q0("Blue");
                    org.telegram.ui.ActionBar.l6.o = 0;
                    org.telegram.ui.ActionBar.l6.w1();
                    org.telegram.ui.ActionBar.l6.B();
                    ah0 ah0Var2 = w50Var.w;
                    ah0Var2.P(!q10 ? ah0Var2.e[0] - 1 : 0);
                    dh0Var.d();
                    int[] iArr = {(dh0Var.getMeasuredWidth() / 2) + r9, (dh0Var.getMeasuredHeight() / 2) + r9};
                    dh0Var.getLocationInWindow(iArr);
                    int i39 = iArr[0];
                    int i40 = iArr[1];
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z16), dh0Var);
                    dh0Var.setContentDescription(org.telegram.messenger.id.M0(!q10 ? 2131754751 : 2131754750, null));
                    break;
                }
                break;
            case 19:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                g60Var.Q.dismiss();
                if (g60Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i41 = g60Var.c0;
                    if (i41 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i41 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.yw ywVar3 = new org.telegram.ui.yw(bundle);
                    ywVar3.D2 = new org.telegram.ui.ru(g60Var, ywVar3);
                    f2Var.presentFragment(ywVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, g60Var.c0);
                    org.telegram.ui.x5 x5Var = new org.telegram.ui.x5(bundle2);
                    x5Var.d = g60Var.f0;
                    x5Var.Z();
                    f2Var.presentFragment(x5Var);
                    break;
                }
            case 20:
                org.telegram.messenger.fd[] fdVarArr = (org.telegram.messenger.fd[]) this.b;
                org.telegram.ui.Cells.r4[] r4VarArr = (org.telegram.ui.Cells.r4[]) this.c;
                String str = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                fdVarArr[0] = ((org.telegram.ui.Cells.r4) view).getCurrentLocale();
                int i42 = 0;
                while (i42 < 2) {
                    r4VarArr[i42].a.a(i42 == num.intValue(), true);
                    i42++;
                }
                break;
            case 21:
                v4.x((Context) this.c, org.telegram.messenger.id.M0(2131750877, null), org.telegram.messenger.id.M0(2131745510, null), -1L, new org.telegram.ui.z80((org.telegram.ui.j90) this.b, i14));
                break;
            case 22:
                org.telegram.ui.j90 j90Var = (org.telegram.ui.j90) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (j90Var.e == null) {
                    org.telegram.ui.g90 g90Var = j90Var.f;
                    if (g90Var.e.h) {
                        int i43 = -j90Var.M;
                        j90Var.M = i43;
                        org.telegram.messenger.g0.G3(i43, g90Var, null);
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
                            j90Var.h.setText(org.telegram.messenger.id.M0(2131754201, null));
                            org.telegram.ui.c90 c90Var = new org.telegram.ui.c90(j90Var, i15);
                            runnableArr[0] = c90Var;
                            org.telegram.messenger.g0.i3(c90Var, 60L);
                            break;
                        } else {
                            j90Var.f.setCheckBoxIcon(0);
                            j90Var.h.setText(org.telegram.messenger.id.M0(2131754202, null));
                            org.telegram.ui.c90 c90Var2 = new org.telegram.ui.c90(j90Var, i13);
                            runnableArr[0] = c90Var2;
                            org.telegram.messenger.g0.h3(c90Var2);
                            break;
                        }
                    }
                }
                break;
            case 23:
                org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) this.b;
                ra0Var.B0((org.telegram.ui.na0) this.c);
                org.telegram.ui.ma0 ma0Var = ra0Var.J0;
                if (ma0Var != null) {
                    ma0Var.dismiss();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.qb0 qb0Var = (org.telegram.ui.qb0) this.b;
                Context context2 = (Context) this.c;
                String string = qb0Var.D.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    vy0 vy0Var = new vy0();
                    vy0Var.a |= 256;
                    vy0Var.b = indexOf;
                    int i44 = lastIndexOf + 1;
                    vy0Var.c = i44;
                    spannableStringBuilder.setSpan(new wy0(vy0Var, 0), indexOf, i44, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131748728, null);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748732, null));
                int i45 = qb0Var.G;
                int i46 = i45 / 86400;
                int i47 = i45 % 86400;
                int i48 = i47 / 3600;
                int i49 = (i47 % 3600) / 60;
                if (i46 == 0 && i48 == 0) {
                    i49 = Math.max(1, i49);
                }
                alertDialog$Builder.a.T = org.telegram.messenger.g0.m0(X2, spannableStringBuilder, (i46 == 0 || i48 == 0) ? (i48 == 0 || i49 == 0) ? i46 != 0 ? org.telegram.messenger.id.a0(null, null, 2131748734, org.telegram.messenger.id.G(i46, "Days", new Object[0])) : i48 != 0 ? org.telegram.messenger.id.a0(null, null, 2131748734, org.telegram.messenger.id.G(i46, "Hours", new Object[0])) : org.telegram.messenger.id.a0(null, null, 2131748734, org.telegram.messenger.id.G(i49, "Minutes", new Object[0])) : org.telegram.messenger.id.a0(null, null, 2131748735, org.telegram.messenger.id.G(i48, "Hours", new Object[0]), org.telegram.messenger.id.G(i49, "Minutes", new Object[0])) : org.telegram.messenger.id.a0(null, null, 2131748735, org.telegram.messenger.id.G(i46, "Days", new Object[0]), org.telegram.messenger.id.G(i48, "Hours", new Object[0])));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131748736, null), new org.telegram.ui.yr(qb0Var, 19));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            case 25:
                org.telegram.ui.zb0 zb0Var = (org.telegram.ui.zb0) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ee0 ee0Var = zb0Var.D;
                if (ee0Var.V.getTag() == null) {
                    if (zb0Var.n.has_recovery) {
                        ee0Var.F1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_requestPasswordRecovery, new org.telegram.ui.xb0(zb0Var, i15), 10);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(zb0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                        alertDialog$Builder2.a.R = org.telegram.messenger.id.M0(2131746071, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.id.M0(2131746073, null);
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131752041, null), null);
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131746117, null), new org.telegram.ui.yr(zb0Var, 20));
                        alertDialog$Builder2.p();
                        break;
                    }
                }
                break;
            case 26:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) this.b;
                Context context4 = (Context) this.c;
                Bundle bundle3 = id0Var.q0;
                if (bundle3 != null && (tL_auth_sentCode = id0Var.r0) != null) {
                    id0Var.u0.y1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!id0Var.f0) {
                    org.telegram.ui.gd0 gd0Var = id0Var.w;
                    if ((gd0Var == null || gd0Var.getVisibility() == 8) && !id0Var.k0) {
                        if (id0Var.i0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = id0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = id0Var.c;
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
                            id0Var.u0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context4);
                            alertDialog$Builder3.a.R = org.telegram.messenger.id.M0(2131746071, null);
                            alertDialog$Builder3.a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131751445, id0Var.b));
                            alertDialog$Builder3.i(org.telegram.messenger.id.M0(2131751446, null), new org.telegram.ui.ru(22, id0Var, context4));
                            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131752041, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131751448, null), new org.telegram.ui.xc0(id0Var, i15));
                            alertDialog$Builder3.p();
                            break;
                        } else if (id0Var.u0.V.getTag() == null) {
                            id0Var.v();
                            break;
                        }
                    }
                }
                break;
            case 27:
                org.telegram.ui.de0 de0Var = (org.telegram.ui.de0) this.b;
                Context context5 = (Context) this.c;
                Toast toast = de0Var.Q;
                if (toast != null) {
                    toast.cancel();
                    de0Var.Q = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (de0Var.O > 0 && currentTimeMillis - de0Var.P > 1500) {
                    de0Var.O = 0;
                }
                int i50 = de0Var.O + 1;
                de0Var.O = i50;
                de0Var.P = currentTimeMillis;
                if (i50 >= 5) {
                    de0Var.O = 0;
                    de0Var.P = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(de0Var.getContext());
                    alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131745486, null);
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.id.M0(org.telegram.messenger.r2.a ? 2131751639 : 2131751631, null), org.telegram.messenger.id.M0(2131751613, null)}, new org.telegram.ui.k4(de0Var, i13));
                    alertDialog$Builder4.p();
                    break;
                } else if (i50 > 1) {
                    Toast makeText = Toast.makeText(context5, org.telegram.messenger.id.G(5 - i50, "DebugMenuLoginToast", new Object[0]), 0);
                    de0Var.Q = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.jg0 jg0Var = (org.telegram.ui.jg0) this.b;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.c;
                org.telegram.ui.lg0 lg0Var = jg0Var.d;
                if (!lg0Var.g0(ijVar)) {
                    lg0Var.getOrCreateStoryViewer().L(lg0Var.getParentActivity(), ijVar.l, di.i7.a(lg0Var.f));
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
                org.telegram.ui.ActionBar.s6.s(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.l6.l6 : org.telegram.ui.ActionBar.l6.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
        }
    }
}
