package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dw(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i7;
        x50 x50Var;
        org.telegram.ui.ab abVar;
        int i10;
        di.p6 p6Var;
        boolean z10;
        int indexOf;
        int K;
        int i11 = this.a;
        int i12 = 5;
        int i13 = 4;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                ry ryVar = ((nw) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.ri.d0(ryVar.d1).N1(tL_messages_stickerSet, true);
                    org.telegram.messenger.ri.d0(ryVar.d1).U1(tL_messages_stickerSet);
                    break;
                }
                break;
            case 1:
                jx jxVar = (jx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                jxVar.x.f = true;
                ry ryVar2 = jxVar.H;
                if (!ryVar2.q1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    ryVar2.q1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                jxVar.a(true);
                break;
            case 2:
                final px pxVar = (px) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                ry ryVar3 = pxVar.a.G;
                if (Arrays.equals(ryVar3.X0, G0)) {
                    i7 = 0;
                } else {
                    i7 = 0;
                    org.telegram.messenger.ri.d0(ryVar3.d1).O(G0, false);
                }
                ryVar3.X0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                org.telegram.messenger.x10 x10Var = new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.ox
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                px pxVar2 = pxVar;
                                org.telegram.messenger.ri.d0(pxVar2.a.G.d1).d2(true, str, new bi.j(pxVar2, arrayList3, (Runnable) obj3, 13));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ry ryVar4 = pxVar.a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.j10.i(ryVar4.d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i14 = ryVar4.d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i14).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (u02 != null) {
                                        for (int i15 = 0; i15 < u02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new kx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i14).t0[1];
                                    if (arrayList7 != null) {
                                        for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title.toLowerCase());
                                                if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i14).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList4 = n02 != null ? n02.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new kx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                };
                ph phVar = new ph(i13, pxVar, str);
                final int i14 = 1;
                org.telegram.messenger.x10 x10Var2 = new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.ox
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i14) {
                            case 0:
                                px pxVar2 = pxVar;
                                org.telegram.messenger.ri.d0(pxVar2.a.G.d1).d2(true, str, new bi.j(pxVar2, arrayList2, (Runnable) obj3, 13));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ry ryVar4 = pxVar.a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.j10.i(ryVar4.d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i142 = ryVar4.d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i142).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (u02 != null) {
                                        for (int i15 = 0; i15 < u02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new kx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i142).t0[1];
                                    if (arrayList7 != null) {
                                        for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title.toLowerCase());
                                                if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i142).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList4 = n02 != null ? n02.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new kx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                };
                ph phVar2 = new ph(i12, pxVar, arrayList);
                di.m2 m2Var = new di.m2(pxVar, str, arrayList, arrayList2, arrayList3, 4);
                org.telegram.messenger.x10[] x10VarArr = new org.telegram.messenger.x10[5];
                x10VarArr[i7] = x10Var;
                x10VarArr[1] = phVar;
                x10VarArr[2] = x10Var2;
                x10VarArr[3] = phVar2;
                x10VarArr[4] = m2Var;
                Utilities.u(i7, x10VarArr);
                break;
            case 3:
                ArrayList arrayList4 = (ArrayList) obj;
                qx qxVar = ((px) obj2).a;
                qxVar.G.W.e(false);
                ArrayList arrayList5 = qxVar.r;
                qxVar.F = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                qxVar.f();
                break;
            case 4:
                ((vx) obj2).F((String) obj, "", true, false, false);
                break;
            case 5:
                vx vxVar = (vx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                ry ryVar4 = vxVar.M;
                org.telegram.messenger.mp.u1(ryVar4.d1).f4(tL_contacts_resolvedPeer.users, false);
                int i15 = ryVar4.d1;
                org.telegram.messenger.mp.u1(i15).Z3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.tr.a0(i15).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = vxVar.x;
                vxVar.x = null;
                vxVar.F(str2, "", false, false, false);
                break;
            case 6:
                cz czVar = (cz) obj2;
                hi.c7 c7Var = (hi.c7) obj;
                czVar.b();
                czVar.g(c7Var);
                fz fzVar = czVar.K;
                fzVar.h1 = c7Var;
                fzVar.j();
                break;
            case 7:
                ((cz) obj2).K.f1 = (ez) obj;
                break;
            case 8:
                ((g00) obj2).v2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 9:
                ((ph) obj2).a((org.telegram.ui.ActionBar.h2) obj);
                break;
            case 10:
                u30 u30Var = (u30) obj2;
                Uri uri = (Uri) obj;
                u30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u30Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.tm0 tm0Var = new org.telegram.ui.tm0(bundle);
                        tm0Var.e = false;
                        tm0Var.f = false;
                        tm0Var.c = u30Var;
                        launchActivity.t0(tm0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    u30Var.r(false, org.telegram.messenger.ec.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 11:
                r40 r40Var = (r40) obj2;
                o40 o40Var = (o40) obj;
                z40 z40Var = r40Var.I0;
                org.telegram.messenger.e20 e20Var = new org.telegram.messenger.e20();
                z40Var.S = e20Var;
                e20Var.a = -1L;
                e20Var.b = -1L;
                e20Var.q = Math.max(1L, z40Var.Q);
                org.telegram.messenger.e20 e20Var2 = z40Var.S;
                e20Var2.s = true;
                e20Var2.w = z40Var.M;
                e20Var2.x = z40Var.N;
                e20Var2.y = z40Var.O;
                e20Var2.z = z40Var.P;
                e20Var2.n = 25;
                e20Var2.h = 360;
                e20Var2.k = 360;
                e20Var2.i = 360;
                e20Var2.l = 360;
                e20Var2.o = r40Var.a.getAbsolutePath();
                org.telegram.messenger.e20 e20Var3 = z40Var.S;
                e20Var3.P = true;
                e20Var3.O = z40Var.j1;
                e20Var3.r = z40Var.k0;
                z40Var.j1 = null;
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, r40Var.a.getAbsolutePath(), 0, true, 0, 0);
                if (o40Var != null) {
                    efVar.x = o40Var.c;
                    efVar.y = o40Var.d;
                }
                z40Var.h.u(efVar, z40Var.S, o40Var == null || o40Var.a, o40Var != null ? o40Var.b : 0, 0, false, o40Var != null ? o40Var.e : 0L);
                break;
            case 12:
                Bitmap bitmap = (Bitmap) obj;
                r40 r40Var2 = (r40) ((gk) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || r40Var2.B0.size() <= 1) {
                    r40Var2.B0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = r40Var2.B0;
                    arrayList6.add((Bitmap) i5.c.h(1, arrayList6));
                    break;
                }
                break;
            case 13:
                x50 x50Var2 = (x50) obj2;
                TLObject tLObject2 = (TLObject) obj;
                x50Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        x50Var2.n1.put(Long.valueOf(x50Var2.m1.admin_id), (TLRPC.User) vector.objects.get(0));
                        x50Var2.O1.f();
                        break;
                    }
                }
                break;
            case 14:
                r50 r50Var = (r50) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (x50Var = r50Var.a.c).e2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = x50Var.m1;
                    org.telegram.ui.lb lbVar = abVar.a;
                    ArrayList arrayList7 = lbVar.p0;
                    int size = arrayList7.size();
                    int i16 = lbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.j10.i(lbVar.getAccountInstance().a).n;
                    i10 = ((org.telegram.ui.ActionBar.h2) lbVar).currentAccount;
                    if (new org.telegram.messenger.fj(i10, tL_channelAdminLogEvent, lbVar.o0, lbVar.n0, lbVar.f, lbVar.U, true).U >= 0) {
                        lbVar.W0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            lbVar.D0.N = true;
                            org.telegram.ui.ib ibVar = lbVar.F;
                            ibVar.o(ibVar.h, size2);
                            org.telegram.ui.lb.P0(lbVar);
                        }
                        lbVar.z0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((j60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new i(editTextBoldCursor, i12));
                break;
            case 16:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.jo) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 17:
                g80 g80Var = (g80) obj2;
                if (g80Var.P0 == ((l80) obj)) {
                    g80Var.performLongClick();
                    g80Var.P0 = null;
                    g80Var.N0.f(true);
                    break;
                }
                break;
            case 18:
                ((n2.o0) obj2).n((o80) obj, false);
                break;
            case 19:
                i90 i90Var = (i90) obj2;
                if (!((boolean[]) obj)[0] && (p6Var = i90Var.R) != null) {
                    p6Var.run();
                }
                i90Var.R = null;
                break;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((zh.b) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.g3(new i(editTextBoldCursor2, 7));
                break;
            case 21:
                b9.g0 g0Var = (b9.g0) obj2;
                Runnable runnable = (Runnable) obj;
                g0Var.getClass();
                runnable.run();
                g0Var.a.remove(runnable);
                break;
            case 22:
                mf0 mf0Var = (mf0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                mf0Var.N = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    mf0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        mf0Var.d();
                        mf0Var.c.g3.O(true);
                        break;
                    } else {
                        mf0Var.a(false);
                        break;
                    }
                }
                break;
            case 23:
                rf0 rf0Var = (rf0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = rf0Var.a;
                int i17 = rf0Var.s;
                int size3 = arrayList8.size();
                rf0Var.s = size3;
                if (i17 != size3 && rf0Var.Q != null) {
                    rf0Var.g();
                }
                int size4 = arrayList9.size();
                int i18 = 0;
                while (i18 < size4) {
                    of0 of0Var = (of0) arrayList9.get(i18);
                    if (of0Var.o && !of0Var.p) {
                        arrayList8.add(of0Var);
                    } else if (rf0.i(of0Var.a, arrayList8) == null) {
                        rf0 rf0Var2 = of0Var.y;
                        float f10 = rf0Var2.L;
                        RectF rectF = of0Var.c;
                        RectF rectF2 = of0Var.f;
                        o80 o80Var = of0Var.r;
                        if (o80Var != null) {
                            o80Var.a();
                            of0Var.t = z11;
                            of0Var.s = z11;
                        }
                        of0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f10 ? z12 : z11;
                        boolean z14 = rectF.right + 1.0f >= ((float) rf0Var2.getMeasuredWidth()) - f10;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        of0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i19 = of0Var.a;
                            if (i19 == 3 || i19 == 2) {
                                z10 = true;
                                if (rf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    of0Var.e.e(z10, 0.0f);
                                    arrayList8.add(of0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            of0Var.e.e(z10, 0.0f);
                            arrayList8.add(of0Var);
                        }
                        z10 = true;
                        of0Var.e.e(z10, 0.0f);
                        arrayList8.add(of0Var);
                    }
                    i18++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                rf0Var.invalidate();
                break;
            case 24:
                of0 of0Var2 = (of0) obj;
                qf0 qf0Var = ((rf0) obj2).y;
                int i20 = of0Var2.a;
                RectF rectF3 = of0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.tt0) qf0Var).b, i20, rectF3.left, rectF3.top);
                break;
            case 25:
                RLottieNative rLottieNative = (RLottieNative) obj2;
                RLottieNative rLottieNative2 = (RLottieNative) obj;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    break;
                }
                break;
            case 26:
                uh0 uh0Var = (uh0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = uh0Var.r;
                uh0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i21 = 0;
                while (i21 < size5) {
                    Object obj3 = arrayList10.get(i21);
                    i21++;
                    th0 th0Var = (th0) obj3;
                    int i22 = 0;
                    while (true) {
                        if (i22 < arrayList11.size()) {
                            TLObject tLObject4 = ((th0) arrayList11.get(i22)).a;
                            long j3 = tLObject4 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject4).id : tLObject4 instanceof TLRPC.User ? ((TLRPC.User) tLObject4).id : 0L;
                            TLObject tLObject5 = th0Var.a;
                            if (j3 != (tLObject5 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject5).id : tLObject5 instanceof TLRPC.User ? ((TLRPC.User) tLObject5).id : 0L)) {
                                i22++;
                            } else if (th0Var.c > 0) {
                                ((th0) arrayList11.get(i22)).c = th0Var.c;
                            }
                        } else {
                            arrayList11.add(th0Var);
                        }
                    }
                }
                q0.a aVar = uh0Var.x;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                uh0Var.a();
                break;
            case 27:
                km0 km0Var = (km0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = km0Var.L;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (K = km0Var.K()) < km0Var.b()) {
                    arrayList12.remove(indexOf);
                    km0Var.s(K + 1 + indexOf);
                    int size6 = km0Var.k0.e.size();
                    int size7 = arrayList12.size();
                    if (km0Var.H0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        km0Var.s(K);
                        break;
                    }
                }
                break;
            case 28:
                ((km0) obj2).S();
                lc.b0((org.telegram.ui.cx) obj).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                break;
            default:
                ((wm0) obj2).sendAccessibilityEvent((View) obj, 4);
                break;
        }
    }
}
