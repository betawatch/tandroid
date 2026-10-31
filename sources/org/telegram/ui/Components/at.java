package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ at(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i10;
        c60 c60Var;
        org.telegram.ui.gb gbVar;
        int i11;
        ag.j0 j0Var;
        boolean z10;
        int i12 = this.a;
        int i13 = 4;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ((bt) obj2).setImage((Bitmap) obj);
                break;
            case 1:
                ((EditTextBoldCursor) obj2).o0.draw((Canvas) obj);
                break;
            case 2:
                org.telegram.messenger.vp.r1(((nu) obj2).a.a).e5((TLRPC.EmojiStatus) obj, null);
                break;
            case 3:
                org.telegram.messenger.vp.r1(((pw) obj2).a.c1).e5((TLRPC.EmojiStatus) obj, null);
                break;
            case 4:
                TLObject tLObject = (TLObject) obj;
                vy vyVar = ((pw) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.ui.b0(vyVar.c1).I1(tL_messages_stickerSet, true);
                    org.telegram.messenger.ui.b0(vyVar.c1).P1(tL_messages_stickerSet);
                    break;
                }
                break;
            case 5:
                mx mxVar = (mx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                mxVar.x.f = true;
                vy vyVar2 = mxVar.G;
                if (!vyVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    vyVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                mxVar.a(true);
                break;
            case 6:
                final tx txVar = (tx) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.i0.G0();
                vy vyVar3 = txVar.a.F;
                if (Arrays.equals(vyVar3.W0, G0)) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    org.telegram.messenger.ui.b0(vyVar3.c1).M(G0, false);
                }
                vyVar3.W0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i14 = 1;
                Utilities.u(0, new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.sx
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i10) {
                            case 0:
                                tx txVar2 = txVar;
                                org.telegram.messenger.ui.b0(txVar2.a.F.c1).Y1(true, str, new kg.d0(txVar2, arrayList3, (Runnable) obj3, 3));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                vy vyVar4 = txVar.a.F;
                                if (org.telegram.messenger.tz.F || org.telegram.messenger.d20.i(vyVar4.c1).q()) {
                                    String N3 = org.telegram.messenger.i0.N3((str + "").toLowerCase());
                                    int i15 = vyVar4.c1;
                                    ArrayList s02 = org.telegram.messenger.ui.b0(i15).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (s02 != null) {
                                        for (int i16 = 0; i16 < s02.size(); i16++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i16);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String N32 = org.telegram.messenger.i0.N3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                                    arrayList6.add(new nx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ui.b0(i15).s0[1];
                                    if (arrayList7 != null) {
                                        for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i17);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String N33 = org.telegram.messenger.i0.N3(stickerSetCovered.set.title.toLowerCase());
                                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i15).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList4 = l02 != null ? l02.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new nx(stickerSetCovered, arrayList4));
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
                }, new vg(7, txVar, str), new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.sx
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i14) {
                            case 0:
                                tx txVar2 = txVar;
                                org.telegram.messenger.ui.b0(txVar2.a.F.c1).Y1(true, str, new kg.d0(txVar2, arrayList2, (Runnable) obj3, 3));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                vy vyVar4 = txVar.a.F;
                                if (org.telegram.messenger.tz.F || org.telegram.messenger.d20.i(vyVar4.c1).q()) {
                                    String N3 = org.telegram.messenger.i0.N3((str + "").toLowerCase());
                                    int i15 = vyVar4.c1;
                                    ArrayList s02 = org.telegram.messenger.ui.b0(i15).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (s02 != null) {
                                        for (int i16 = 0; i16 < s02.size(); i16++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i16);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String N32 = org.telegram.messenger.i0.N3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                                    arrayList6.add(new nx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ui.b0(i15).s0[1];
                                    if (arrayList7 != null) {
                                        for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i17);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String N33 = org.telegram.messenger.i0.N3(stickerSetCovered.set.title.toLowerCase());
                                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i15).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList4 = l02 != null ? l02.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new nx(stickerSetCovered, arrayList4));
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
                }, new vg(8, txVar, arrayList), new org.telegram.ui.pa(txVar, str, arrayList, arrayList2, arrayList3));
                break;
            case 7:
                ArrayList arrayList4 = (ArrayList) obj;
                ux uxVar = ((tx) obj2).a;
                uxVar.F.V.e(false);
                ArrayList arrayList5 = uxVar.r;
                uxVar.E = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                uxVar.f();
                break;
            case 8:
                ((zx) obj2).F((String) obj, "", true, false, false);
                break;
            case 9:
                zx zxVar = (zx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                vy vyVar4 = zxVar.L;
                org.telegram.messenger.vp.r1(vyVar4.c1).V3(tL_contacts_resolvedPeer.users, false);
                int i15 = vyVar4.c1;
                org.telegram.messenger.vp.r1(i15).P3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.hs.a0(i15).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = zxVar.x;
                zxVar.x = null;
                zxVar.F(str2, "", false, false, false);
                break;
            case 10:
                gz gzVar = (gz) obj2;
                vh.m5 m5Var = (vh.m5) obj;
                gzVar.b();
                gzVar.g(m5Var);
                jz jzVar = gzVar.J;
                jzVar.h1 = m5Var;
                jzVar.j();
                break;
            case 11:
                ((gz) obj2).J.f1 = (iz) obj;
                break;
            case 12:
                ((j00) obj2).r2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 13:
                ((vg) obj2).a((org.telegram.ui.ActionBar.k2) obj);
                break;
            case 14:
                b40 b40Var = (b40) obj2;
                Uri uri = (Uri) obj;
                b40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) b40Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.bo0 bo0Var = new org.telegram.ui.bo0(bundle);
                        bo0Var.e = false;
                        bo0Var.f = false;
                        bo0Var.c = b40Var;
                        launchActivity.t0(bo0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    b40Var.r(false, org.telegram.messenger.hc.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 15:
                x40 x40Var = (x40) obj2;
                u40 u40Var = (u40) obj;
                e50 e50Var = x40Var.H0;
                org.telegram.messenger.x20 x20Var = new org.telegram.messenger.x20();
                e50Var.R = x20Var;
                x20Var.a = -1L;
                x20Var.b = -1L;
                x20Var.q = Math.max(1L, e50Var.P);
                org.telegram.messenger.x20 x20Var2 = e50Var.R;
                x20Var2.s = true;
                x20Var2.w = e50Var.L;
                x20Var2.x = e50Var.M;
                x20Var2.y = e50Var.N;
                x20Var2.z = e50Var.O;
                x20Var2.n = 25;
                x20Var2.h = 360;
                x20Var2.k = 360;
                x20Var2.i = 360;
                x20Var2.l = 360;
                x20Var2.o = x40Var.a.getAbsolutePath();
                org.telegram.messenger.x20 x20Var3 = e50Var.R;
                x20Var3.P = true;
                x20Var3.O = e50Var.i1;
                x20Var3.r = e50Var.j0;
                e50Var.i1 = null;
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, x40Var.a.getAbsolutePath(), 0, true, 0, 0);
                if (u40Var != null) {
                    efVar.x = u40Var.c;
                    efVar.y = u40Var.d;
                }
                e50Var.h.t(efVar, e50Var.R, u40Var == null || u40Var.a, u40Var != null ? u40Var.b : 0, 0, false, u40Var != null ? u40Var.e : 0L);
                break;
            case 16:
                Bitmap bitmap = (Bitmap) obj;
                x40 x40Var2 = (x40) ((ew) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || x40Var2.A0.size() <= 1) {
                    x40Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = x40Var2.A0;
                    arrayList6.add((Bitmap) i0.a.g(1, arrayList6));
                    break;
                }
            case 17:
                c60 c60Var2 = (c60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                c60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        c60Var2.j1.put(Long.valueOf(c60Var2.i1.admin_id), (TLRPC.User) vector.objects.get(0));
                        c60Var2.K1.f();
                        break;
                    }
                }
                break;
            case 18:
                w50 w50Var = (w50) obj2;
                if (((TLRPC.TL_error) obj) == null && (gbVar = (c60Var = w50Var.a.c).a2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = c60Var.i1;
                    org.telegram.ui.sb sbVar = gbVar.a;
                    ArrayList arrayList7 = sbVar.o0;
                    int size = arrayList7.size();
                    int i16 = sbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.d20.i(sbVar.getAccountInstance().a).n;
                    i11 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                    if (new org.telegram.messenger.jj(i11, tL_channelAdminLogEvent, sbVar.n0, sbVar.m0, sbVar.f, sbVar.T, true).U >= 0) {
                        sbVar.V0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            sbVar.C0.N = true;
                            org.telegram.ui.pb pbVar = sbVar.E;
                            pbVar.o(pbVar.h, size2);
                            org.telegram.ui.sb.O0(sbVar);
                        }
                        sbVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 19:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((m60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.g3(new ot(editTextBoldCursor, i13));
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.cp) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 21:
                l80 l80Var = (l80) obj2;
                if (l80Var.O0 == ((q80) obj)) {
                    l80Var.performLongClick();
                    l80Var.O0 = null;
                    l80Var.M0.f(true);
                    break;
                }
                break;
            case 22:
                ((ji.a) obj2).n((t80) obj, false);
                break;
            case 23:
                n90 n90Var = (n90) obj2;
                if (!((boolean[]) obj)[0] && (j0Var = n90Var.Q) != null) {
                    j0Var.run();
                }
                n90Var.Q = null;
                break;
            case 24:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((oh.c) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.i0.g3(new ot(editTextBoldCursor2, 6));
                break;
            case 25:
                m2.t tVar = (m2.t) obj2;
                Runnable runnable = (Runnable) obj;
                tVar.getClass();
                runnable.run();
                ((HashMap) tVar.b).remove(runnable);
                break;
            case 26:
                cg0 cg0Var = (cg0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                cg0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    cg0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        cg0Var.d();
                        cg0Var.c.f3.O(true);
                        break;
                    } else {
                        cg0Var.a(false);
                        break;
                    }
                }
                break;
            case 27:
                hg0 hg0Var = (hg0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = hg0Var.a;
                int i17 = hg0Var.s;
                int size3 = arrayList8.size();
                hg0Var.s = size3;
                if (i17 != size3 && hg0Var.P != null) {
                    hg0Var.g();
                }
                int size4 = arrayList9.size();
                int i18 = 0;
                while (i18 < size4) {
                    eg0 eg0Var = (eg0) arrayList9.get(i18);
                    if (eg0Var.o && !eg0Var.p) {
                        arrayList8.add(eg0Var);
                    } else if (hg0.i(eg0Var.a, arrayList8) == null) {
                        hg0 hg0Var2 = eg0Var.y;
                        float f7 = hg0Var2.K;
                        RectF rectF = eg0Var.c;
                        RectF rectF2 = eg0Var.f;
                        t80 t80Var = eg0Var.r;
                        if (t80Var != null) {
                            t80Var.a();
                            eg0Var.t = z11;
                            eg0Var.s = z11;
                        }
                        eg0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f7 ? z12 : z11;
                        boolean z14 = rectF.right + 1.0f >= ((float) hg0Var2.getMeasuredWidth()) - f7;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        eg0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i19 = eg0Var.a;
                            if (i19 == 3 || i19 == 2) {
                                z10 = true;
                                if (hg0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    eg0Var.e.e(z10, 0.0f);
                                    arrayList8.add(eg0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            eg0Var.e.e(z10, 0.0f);
                            arrayList8.add(eg0Var);
                        }
                        z10 = true;
                        eg0Var.e.e(z10, 0.0f);
                        arrayList8.add(eg0Var);
                    }
                    i18++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                hg0Var.invalidate();
                break;
            case 28:
                eg0 eg0Var2 = (eg0) obj;
                gg0 gg0Var = ((hg0) obj2).y;
                int i20 = eg0Var2.a;
                RectF rectF3 = eg0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.bv0) gg0Var).b, i20, rectF3.left, rectF3.top);
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
