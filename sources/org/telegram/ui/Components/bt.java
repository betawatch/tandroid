package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bt(int i7, Object obj, Object obj2) {
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
        int i11 = this.a;
        int i12 = 5;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((ct) obj2).setImage((Bitmap) obj);
                break;
            case 1:
                ((EditTextBoldCursor) obj2).p0.draw((Canvas) obj);
                break;
            case 2:
                org.telegram.messenger.mp.u1(((mu) obj2).a.a).t5((TLRPC.EmojiStatus) obj, null);
                break;
            case 3:
                org.telegram.messenger.mp.u1(((mw) obj2).a.d1).t5((TLRPC.EmojiStatus) obj, null);
                break;
            case 4:
                TLObject tLObject = (TLObject) obj;
                qy qyVar = ((mw) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.ri.d0(qyVar.d1).N1(tL_messages_stickerSet, true);
                    org.telegram.messenger.ri.d0(qyVar.d1).U1(tL_messages_stickerSet);
                    break;
                }
                break;
            case 5:
                ix ixVar = (ix) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ixVar.x.f = true;
                qy qyVar2 = ixVar.H;
                if (!qyVar2.q1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    qyVar2.q1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                ixVar.a(true);
                break;
            case 6:
                final ox oxVar = (ox) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                qy qyVar3 = oxVar.a.G;
                if (Arrays.equals(qyVar3.X0, G0)) {
                    i7 = 0;
                } else {
                    i7 = 0;
                    org.telegram.messenger.ri.d0(qyVar3.d1).O(G0, false);
                }
                qyVar3.X0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i13 = 1;
                Utilities.u(0, new org.telegram.messenger.w10() { // from class: org.telegram.ui.Components.nx
                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                ox oxVar2 = oxVar;
                                org.telegram.messenger.ri.d0(oxVar2.a.G.d1).d2(true, str, new bi.j(oxVar2, arrayList3, (Runnable) obj3, 13));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                qy qyVar4 = oxVar.a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.i10.i(qyVar4.d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i14 = qyVar4.d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i14).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (u02 != null) {
                                        for (int i15 = 0; i15 < u02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new jx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                        arrayList6.add(new jx(stickerSetCovered, arrayList4));
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
                }, new ph(i12, oxVar, str), new org.telegram.messenger.w10() { // from class: org.telegram.ui.Components.nx
                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i13) {
                            case 0:
                                ox oxVar2 = oxVar;
                                org.telegram.messenger.ri.d0(oxVar2.a.G.d1).d2(true, str, new bi.j(oxVar2, arrayList2, (Runnable) obj3, 13));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                qy qyVar4 = oxVar.a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.i10.i(qyVar4.d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i14 = qyVar4.d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i14).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (u02 != null) {
                                        for (int i15 = 0; i15 < u02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new jx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                        arrayList6.add(new jx(stickerSetCovered, arrayList4));
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
                }, new ph(6, oxVar, arrayList), new di.n2(oxVar, str, arrayList, arrayList2, arrayList3, 4));
                break;
            case 7:
                ArrayList arrayList4 = (ArrayList) obj;
                px pxVar = ((ox) obj2).a;
                pxVar.G.W.e(false);
                ArrayList arrayList5 = pxVar.r;
                pxVar.F = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                pxVar.f();
                break;
            case 8:
                ((ux) obj2).F((String) obj, "", true, false, false);
                break;
            case 9:
                ux uxVar = (ux) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                qy qyVar4 = uxVar.M;
                org.telegram.messenger.mp.u1(qyVar4.d1).f4(tL_contacts_resolvedPeer.users, false);
                int i14 = qyVar4.d1;
                org.telegram.messenger.mp.u1(i14).Z3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.tr.a0(i14).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = uxVar.x;
                uxVar.x = null;
                uxVar.F(str2, "", false, false, false);
                break;
            case 10:
                bz bzVar = (bz) obj2;
                hi.w7 w7Var = (hi.w7) obj;
                bzVar.b();
                bzVar.g(w7Var);
                ez ezVar = bzVar.K;
                ezVar.h1 = w7Var;
                ezVar.j();
                break;
            case 11:
                ((bz) obj2).K.f1 = (dz) obj;
                break;
            case 12:
                ((g00) obj2).v2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 13:
                ((ph) obj2).a((org.telegram.ui.ActionBar.g2) obj);
                break;
            case 14:
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
                        org.telegram.ui.rm0 rm0Var = new org.telegram.ui.rm0(bundle);
                        rm0Var.e = false;
                        rm0Var.f = false;
                        rm0Var.c = u30Var;
                        launchActivity.t0(rm0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    u30Var.r(false, org.telegram.messenger.ec.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 15:
                r40 r40Var = (r40) obj2;
                o40 o40Var = (o40) obj;
                z40 z40Var = r40Var.I0;
                org.telegram.messenger.d20 d20Var = new org.telegram.messenger.d20();
                z40Var.S = d20Var;
                d20Var.a = -1L;
                d20Var.b = -1L;
                d20Var.q = Math.max(1L, z40Var.Q);
                org.telegram.messenger.d20 d20Var2 = z40Var.S;
                d20Var2.s = true;
                d20Var2.w = z40Var.M;
                d20Var2.x = z40Var.N;
                d20Var2.y = z40Var.O;
                d20Var2.z = z40Var.P;
                d20Var2.n = 25;
                d20Var2.h = 360;
                d20Var2.k = 360;
                d20Var2.i = 360;
                d20Var2.l = 360;
                d20Var2.o = r40Var.a.getAbsolutePath();
                org.telegram.messenger.d20 d20Var3 = z40Var.S;
                d20Var3.P = true;
                d20Var3.O = z40Var.j1;
                d20Var3.r = z40Var.k0;
                z40Var.j1 = null;
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, r40Var.a.getAbsolutePath(), 0, true, 0, 0);
                if (o40Var != null) {
                    efVar.x = o40Var.c;
                    efVar.y = o40Var.d;
                }
                z40Var.h.u(efVar, z40Var.S, o40Var == null || o40Var.a, o40Var != null ? o40Var.b : 0, 0, false, o40Var != null ? o40Var.e : 0L);
                break;
            case 16:
                Bitmap bitmap = (Bitmap) obj;
                r40 r40Var2 = (r40) ((rc) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || r40Var2.B0.size() <= 1) {
                    r40Var2.B0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = r40Var2.B0;
                    arrayList6.add((Bitmap) i5.c.h(1, arrayList6));
                    break;
                }
                break;
            case 17:
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
            case 18:
                r50 r50Var = (r50) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (x50Var = r50Var.a.c).e2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = x50Var.m1;
                    org.telegram.ui.lb lbVar = abVar.a;
                    ArrayList arrayList7 = lbVar.p0;
                    int size = arrayList7.size();
                    int i15 = lbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.i10.i(lbVar.getAccountInstance().a).n;
                    i10 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
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
            case 19:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((i60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new i(editTextBoldCursor, i12));
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.io) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 21:
                f80 f80Var = (f80) obj2;
                if (f80Var.P0 == ((k80) obj)) {
                    f80Var.performLongClick();
                    f80Var.P0 = null;
                    f80Var.N0.f(true);
                    break;
                }
                break;
            case 22:
                ((n2.p0) obj2).n((n80) obj, false);
                break;
            case 23:
                h90 h90Var = (h90) obj2;
                if (!((boolean[]) obj)[0] && (p6Var = h90Var.R) != null) {
                    p6Var.run();
                }
                h90Var.R = null;
                break;
            case 24:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((zh.b) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.g3(new i(editTextBoldCursor2, 7));
                break;
            case 25:
                l2.c cVar = (l2.c) obj2;
                Runnable runnable = (Runnable) obj;
                cVar.getClass();
                runnable.run();
                cVar.a.remove(runnable);
                break;
            case 26:
                nf0 nf0Var = (nf0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                nf0Var.N = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    nf0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        nf0Var.d();
                        nf0Var.c.g3.O(true);
                        break;
                    } else {
                        nf0Var.a(false);
                        break;
                    }
                }
                break;
            case 27:
                sf0 sf0Var = (sf0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = sf0Var.a;
                int i16 = sf0Var.s;
                int size3 = arrayList8.size();
                sf0Var.s = size3;
                if (i16 != size3 && sf0Var.Q != null) {
                    sf0Var.g();
                }
                int size4 = arrayList9.size();
                int i17 = 0;
                while (i17 < size4) {
                    pf0 pf0Var = (pf0) arrayList9.get(i17);
                    if (pf0Var.o && !pf0Var.p) {
                        arrayList8.add(pf0Var);
                    } else if (sf0.i(pf0Var.a, arrayList8) == null) {
                        sf0 sf0Var2 = pf0Var.y;
                        float f10 = sf0Var2.L;
                        RectF rectF = pf0Var.c;
                        RectF rectF2 = pf0Var.f;
                        n80 n80Var = pf0Var.r;
                        if (n80Var != null) {
                            n80Var.a();
                            pf0Var.t = z11;
                            pf0Var.s = z11;
                        }
                        pf0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f10 ? z12 : z11;
                        boolean z14 = rectF.right + 1.0f >= ((float) sf0Var2.getMeasuredWidth()) - f10;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        pf0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i18 = pf0Var.a;
                            if (i18 == 3 || i18 == 2) {
                                z10 = true;
                                if (sf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    pf0Var.e.e(z10, 0.0f);
                                    arrayList8.add(pf0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            pf0Var.e.e(z10, 0.0f);
                            arrayList8.add(pf0Var);
                        }
                        z10 = true;
                        pf0Var.e.e(z10, 0.0f);
                        arrayList8.add(pf0Var);
                    }
                    i17++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                sf0Var.invalidate();
                break;
            case 28:
                pf0 pf0Var2 = (pf0) obj;
                rf0 rf0Var = ((sf0) obj2).y;
                int i19 = pf0Var2.a;
                RectF rectF3 = pf0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.st0) rf0Var).b, i19, rectF3.left, rectF3.top);
                break;
            default:
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
        }
    }
}
