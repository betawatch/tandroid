package org.telegram.ui.Components;

import android.graphics.Bitmap;
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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ou(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i7;
        a60 a60Var;
        org.telegram.ui.ab abVar;
        int i10;
        di.p6 p6Var;
        boolean z10;
        int indexOf;
        int K;
        int i11 = this.a;
        int i12 = 5;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                org.telegram.messenger.np.u1(((pu) obj2).a.a).t5((TLRPC.EmojiStatus) obj, null);
                break;
            case 1:
                org.telegram.messenger.np.u1(((pw) obj2).a.d1).t5((TLRPC.EmojiStatus) obj, null);
                break;
            case 2:
                TLObject tLObject = (TLObject) obj;
                ty tyVar = ((pw) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.si.d0(tyVar.d1).N1(tL_messages_stickerSet, true);
                    org.telegram.messenger.si.d0(tyVar.d1).U1(tL_messages_stickerSet);
                    break;
                }
                break;
            case 3:
                lx lxVar = (lx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                lxVar.x.f = true;
                ty tyVar2 = lxVar.H;
                if (!tyVar2.q1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    tyVar2.q1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                lxVar.a(true);
                break;
            case 4:
                final rx rxVar = (rx) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                ty tyVar3 = rxVar.a.G;
                if (Arrays.equals(tyVar3.X0, G0)) {
                    i7 = 0;
                } else {
                    i7 = 0;
                    org.telegram.messenger.si.d0(tyVar3.d1).O(G0, false);
                }
                tyVar3.X0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i13 = 1;
                Utilities.u(0, new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.qx
                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                rx rxVar2 = rxVar;
                                org.telegram.messenger.si.d0(rxVar2.a.G.d1).d2(true, str, new bi.j(rxVar2, arrayList3, (Runnable) obj3, 13));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ty tyVar4 = rxVar.a.G;
                                if (org.telegram.messenger.cz.F || org.telegram.messenger.k10.i(tyVar4.d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i14 = tyVar4.d1;
                                    ArrayList u02 = org.telegram.messenger.si.d0(i14).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (u02 != null) {
                                        for (int i15 = 0; i15 < u02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new mx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.si.d0(i14).t0[1];
                                    if (arrayList7 != null) {
                                        for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title.toLowerCase());
                                                if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.si.d0(i14).n0(org.telegram.messenger.si.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList4 = n02 != null ? n02.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new mx(stickerSetCovered, arrayList4));
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
                }, new rh(4, rxVar, str), new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.qx
                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i13) {
                            case 0:
                                rx rxVar2 = rxVar;
                                org.telegram.messenger.si.d0(rxVar2.a.G.d1).d2(true, str, new bi.j(rxVar2, arrayList2, (Runnable) obj3, 13));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ty tyVar4 = rxVar.a.G;
                                if (org.telegram.messenger.cz.F || org.telegram.messenger.k10.i(tyVar4.d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i14 = tyVar4.d1;
                                    ArrayList u02 = org.telegram.messenger.si.d0(i14).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (u02 != null) {
                                        for (int i15 = 0; i15 < u02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new mx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.si.d0(i14).t0[1];
                                    if (arrayList7 != null) {
                                        for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title.toLowerCase());
                                                if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.si.d0(i14).n0(org.telegram.messenger.si.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList4 = n02 != null ? n02.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new mx(stickerSetCovered, arrayList4));
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
                }, new rh(i12, rxVar, arrayList), new di.n2(rxVar, str, arrayList, arrayList2, arrayList3, 4));
                break;
            case 5:
                ArrayList arrayList4 = (ArrayList) obj;
                sx sxVar = ((rx) obj2).a;
                sxVar.G.W.e(false);
                ArrayList arrayList5 = sxVar.r;
                sxVar.F = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                sxVar.f();
                break;
            case 6:
                ((xx) obj2).F((String) obj, "", true, false, false);
                break;
            case 7:
                xx xxVar = (xx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                ty tyVar4 = xxVar.M;
                org.telegram.messenger.np.u1(tyVar4.d1).f4(tL_contacts_resolvedPeer.users, false);
                int i14 = tyVar4.d1;
                org.telegram.messenger.np.u1(i14).Z3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.ur.a0(i14).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = xxVar.x;
                xxVar.x = null;
                xxVar.F(str2, "", false, false, false);
                break;
            case 8:
                ez ezVar = (ez) obj2;
                hi.b7 b7Var = (hi.b7) obj;
                ezVar.b();
                ezVar.g(b7Var);
                hz hzVar = ezVar.K;
                hzVar.h1 = b7Var;
                hzVar.j();
                break;
            case 9:
                ((ez) obj2).K.f1 = (gz) obj;
                break;
            case 10:
                ((i00) obj2).v2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 11:
                ((rh) obj2).a((org.telegram.ui.ActionBar.g2) obj);
                break;
            case 12:
                x30 x30Var = (x30) obj2;
                Uri uri = (Uri) obj;
                x30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) x30Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.tm0 tm0Var = new org.telegram.ui.tm0(bundle);
                        tm0Var.e = false;
                        tm0Var.f = false;
                        tm0Var.c = x30Var;
                        launchActivity.t0(tm0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    x30Var.r(false, org.telegram.messenger.fc.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 13:
                u40 u40Var = (u40) obj2;
                r40 r40Var = (r40) obj;
                c50 c50Var = u40Var.I0;
                org.telegram.messenger.f20 f20Var = new org.telegram.messenger.f20();
                c50Var.S = f20Var;
                f20Var.a = -1L;
                f20Var.b = -1L;
                f20Var.q = Math.max(1L, c50Var.Q);
                org.telegram.messenger.f20 f20Var2 = c50Var.S;
                f20Var2.s = true;
                f20Var2.w = c50Var.M;
                f20Var2.x = c50Var.N;
                f20Var2.y = c50Var.O;
                f20Var2.z = c50Var.P;
                f20Var2.n = 25;
                f20Var2.h = 360;
                f20Var2.k = 360;
                f20Var2.i = 360;
                f20Var2.l = 360;
                f20Var2.o = u40Var.a.getAbsolutePath();
                org.telegram.messenger.f20 f20Var3 = c50Var.S;
                f20Var3.P = true;
                f20Var3.O = c50Var.j1;
                f20Var3.r = c50Var.k0;
                c50Var.j1 = null;
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, u40Var.a.getAbsolutePath(), 0, true, 0, 0);
                if (r40Var != null) {
                    ffVar.x = r40Var.c;
                    ffVar.y = r40Var.d;
                }
                c50Var.h.u(ffVar, c50Var.S, r40Var == null || r40Var.a, r40Var != null ? r40Var.b : 0, 0, false, r40Var != null ? r40Var.e : 0L);
                break;
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                u40 u40Var2 = (u40) ((ik) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || u40Var2.B0.size() <= 1) {
                    u40Var2.B0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = u40Var2.B0;
                    arrayList6.add((Bitmap) i5.c.h(1, arrayList6));
                    break;
                }
                break;
            case 15:
                a60 a60Var2 = (a60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                a60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        a60Var2.n1.put(Long.valueOf(a60Var2.m1.admin_id), (TLRPC.User) vector.objects.get(0));
                        a60Var2.O1.f();
                        break;
                    }
                }
                break;
            case 16:
                u50 u50Var = (u50) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (a60Var = u50Var.a.c).e2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.m1;
                    org.telegram.ui.lb lbVar = abVar.a;
                    ArrayList arrayList7 = lbVar.p0;
                    int size = arrayList7.size();
                    int i15 = lbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.k10.i(lbVar.getAccountInstance().a).n;
                    i10 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
                    if (new org.telegram.messenger.gj(i10, tL_channelAdminLogEvent, lbVar.o0, lbVar.n0, lbVar.f, lbVar.U, true).U >= 0) {
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
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((l60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new j(editTextBoldCursor, i12));
                break;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.jo) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 19:
                i80 i80Var = (i80) obj2;
                if (i80Var.P0 == ((n80) obj)) {
                    i80Var.performLongClick();
                    i80Var.P0 = null;
                    i80Var.N0.f(true);
                    break;
                }
                break;
            case 20:
                ((n2.o0) obj2).n((q80) obj, false);
                break;
            case 21:
                k90 k90Var = (k90) obj2;
                if (!((boolean[]) obj)[0] && (p6Var = k90Var.R) != null) {
                    p6Var.run();
                }
                k90Var.R = null;
                break;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((zh.b) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.g3(new j(editTextBoldCursor2, 7));
                break;
            case 23:
                b9.g0 g0Var = (b9.g0) obj2;
                Runnable runnable = (Runnable) obj;
                g0Var.getClass();
                runnable.run();
                g0Var.a.remove(runnable);
                break;
            case 24:
                of0 of0Var = (of0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                of0Var.N = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    of0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        of0Var.d();
                        of0Var.c.g3.O(true);
                        break;
                    } else {
                        of0Var.a(false);
                        break;
                    }
                }
                break;
            case 25:
                tf0 tf0Var = (tf0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = tf0Var.a;
                int i16 = tf0Var.s;
                int size3 = arrayList8.size();
                tf0Var.s = size3;
                if (i16 != size3 && tf0Var.Q != null) {
                    tf0Var.g();
                }
                int size4 = arrayList9.size();
                int i17 = 0;
                while (i17 < size4) {
                    qf0 qf0Var = (qf0) arrayList9.get(i17);
                    if (qf0Var.o && !qf0Var.p) {
                        arrayList8.add(qf0Var);
                    } else if (tf0.i(qf0Var.a, arrayList8) == null) {
                        tf0 tf0Var2 = qf0Var.y;
                        float f10 = tf0Var2.L;
                        RectF rectF = qf0Var.c;
                        RectF rectF2 = qf0Var.f;
                        q80 q80Var = qf0Var.r;
                        if (q80Var != null) {
                            q80Var.a();
                            qf0Var.t = z11;
                            qf0Var.s = z11;
                        }
                        qf0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f10 ? z12 : z11;
                        boolean z14 = rectF.right + 1.0f >= ((float) tf0Var2.getMeasuredWidth()) - f10;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        qf0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i18 = qf0Var.a;
                            if (i18 == 3 || i18 == 2) {
                                z10 = true;
                                if (tf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    qf0Var.e.e(z10, 0.0f);
                                    arrayList8.add(qf0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            qf0Var.e.e(z10, 0.0f);
                            arrayList8.add(qf0Var);
                        }
                        z10 = true;
                        qf0Var.e.e(z10, 0.0f);
                        arrayList8.add(qf0Var);
                    }
                    i17++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                tf0Var.invalidate();
                break;
            case 26:
                qf0 qf0Var2 = (qf0) obj;
                sf0 sf0Var = ((tf0) obj2).y;
                int i19 = qf0Var2.a;
                RectF rectF3 = qf0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.tt0) sf0Var).b, i19, rectF3.left, rectF3.top);
                break;
            case 27:
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
            case 28:
                wh0 wh0Var = (wh0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = wh0Var.r;
                wh0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i20 = 0;
                while (i20 < size5) {
                    Object obj3 = arrayList10.get(i20);
                    i20++;
                    vh0 vh0Var = (vh0) obj3;
                    int i21 = 0;
                    while (true) {
                        if (i21 < arrayList11.size()) {
                            TLObject tLObject4 = ((vh0) arrayList11.get(i21)).a;
                            long j3 = tLObject4 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject4).id : tLObject4 instanceof TLRPC.User ? ((TLRPC.User) tLObject4).id : 0L;
                            TLObject tLObject5 = vh0Var.a;
                            if (j3 != (tLObject5 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject5).id : tLObject5 instanceof TLRPC.User ? ((TLRPC.User) tLObject5).id : 0L)) {
                                i21++;
                            } else if (vh0Var.c > 0) {
                                ((vh0) arrayList11.get(i21)).c = vh0Var.c;
                            }
                        } else {
                            arrayList11.add(vh0Var);
                        }
                    }
                }
                q0.a aVar = wh0Var.x;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                wh0Var.a();
                break;
            default:
                nm0 nm0Var = (nm0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = nm0Var.L;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (K = nm0Var.K()) < nm0Var.b()) {
                    arrayList12.remove(indexOf);
                    nm0Var.s(K + 1 + indexOf);
                    int size6 = nm0Var.k0.e.size();
                    int size7 = arrayList12.size();
                    if (nm0Var.H0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        nm0Var.s(K);
                        break;
                    }
                }
                break;
        }
    }
}
