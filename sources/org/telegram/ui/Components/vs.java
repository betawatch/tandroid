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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vs(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i7;
        p50 p50Var;
        org.telegram.ui.ab abVar;
        int i10;
        di.m6 m6Var;
        boolean z10;
        int i11 = this.a;
        int i12 = 4;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((ws) obj2).setImage((Bitmap) obj);
                break;
            case 1:
                ((EditTextBoldCursor) obj2).p0.draw((Canvas) obj);
                break;
            case 2:
                org.telegram.messenger.np.s1(((hu) obj2).a.a).i5((TLRPC.EmojiStatus) obj, null);
                break;
            case 3:
                org.telegram.messenger.np.s1(((hw) obj2).a.d1).i5((TLRPC.EmojiStatus) obj, null);
                break;
            case 4:
                TLObject tLObject = (TLObject) obj;
                ly lyVar = ((hw) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.si.b0(lyVar.d1).I1(tL_messages_stickerSet, true);
                    org.telegram.messenger.si.b0(lyVar.d1).P1(tL_messages_stickerSet);
                    break;
                }
                break;
            case 5:
                dx dxVar = (dx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                dxVar.x.f = true;
                ly lyVar2 = dxVar.H;
                if (!lyVar2.q1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    lyVar2.q1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                dxVar.a(true);
                break;
            case 6:
                final kx kxVar = (kx) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                ly lyVar3 = kxVar.a.G;
                if (Arrays.equals(lyVar3.X0, G0)) {
                    i7 = 0;
                } else {
                    i7 = 0;
                    org.telegram.messenger.si.b0(lyVar3.d1).M(G0, false);
                }
                lyVar3.X0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i13 = 1;
                Utilities.u(0, new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.jx
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                kx kxVar2 = kxVar;
                                org.telegram.messenger.si.b0(kxVar2.a.G.d1).Y1(true, str, new bi.j(kxVar2, arrayList3, (Runnable) obj3, 10));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ly lyVar4 = kxVar.a.G;
                                if (org.telegram.messenger.gz.F || org.telegram.messenger.m10.i(lyVar4.d1).q()) {
                                    String N3 = org.telegram.messenger.g0.N3((str + "").toLowerCase());
                                    int i14 = lyVar4.d1;
                                    ArrayList s02 = org.telegram.messenger.si.b0(i14).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (s02 != null) {
                                        for (int i15 = 0; i15 < s02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String N32 = org.telegram.messenger.g0.N3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                                    arrayList6.add(new ex(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.si.b0(i14).t0[1];
                                    if (arrayList7 != null) {
                                        for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String N33 = org.telegram.messenger.g0.N3(stickerSetCovered.set.title.toLowerCase());
                                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.si.b0(i14).l0(org.telegram.messenger.si.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList4 = l02 != null ? l02.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new ex(stickerSetCovered, arrayList4));
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
                }, new gh(i12, kxVar, str), new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.jx
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i13) {
                            case 0:
                                kx kxVar2 = kxVar;
                                org.telegram.messenger.si.b0(kxVar2.a.G.d1).Y1(true, str, new bi.j(kxVar2, arrayList2, (Runnable) obj3, 10));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ly lyVar4 = kxVar.a.G;
                                if (org.telegram.messenger.gz.F || org.telegram.messenger.m10.i(lyVar4.d1).q()) {
                                    String N3 = org.telegram.messenger.g0.N3((str + "").toLowerCase());
                                    int i14 = lyVar4.d1;
                                    ArrayList s02 = org.telegram.messenger.si.b0(i14).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (s02 != null) {
                                        for (int i15 = 0; i15 < s02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String N32 = org.telegram.messenger.g0.N3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                                    arrayList6.add(new ex(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.si.b0(i14).t0[1];
                                    if (arrayList7 != null) {
                                        for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String N33 = org.telegram.messenger.g0.N3(stickerSetCovered.set.title.toLowerCase());
                                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.si.b0(i14).l0(org.telegram.messenger.si.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList4 = l02 != null ? l02.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new ex(stickerSetCovered, arrayList4));
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
                }, new gh(5, kxVar, arrayList), new di.i2(kxVar, str, arrayList, arrayList2, arrayList3, 4));
                break;
            case 7:
                ArrayList arrayList4 = (ArrayList) obj;
                lx lxVar = ((kx) obj2).a;
                lxVar.G.W.e(false);
                ArrayList arrayList5 = lxVar.r;
                lxVar.F = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                lxVar.f();
                break;
            case 8:
                ((qx) obj2).F((String) obj, "", true, false, false);
                break;
            case 9:
                qx qxVar = (qx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                ly lyVar4 = qxVar.M;
                org.telegram.messenger.np.s1(lyVar4.d1).Y3(tL_contacts_resolvedPeer.users, false);
                int i14 = lyVar4.d1;
                org.telegram.messenger.np.s1(i14).S3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.vr.a0(i14).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = qxVar.x;
                qxVar.x = null;
                qxVar.F(str2, "", false, false, false);
                break;
            case 10:
                wy wyVar = (wy) obj2;
                hi.c7 c7Var = (hi.c7) obj;
                wyVar.b();
                wyVar.g(c7Var);
                zy zyVar = wyVar.K;
                zyVar.h1 = c7Var;
                zyVar.j();
                break;
            case 11:
                ((wy) obj2).K.f1 = (yy) obj;
                break;
            case 12:
                ((zz) obj2).v2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 13:
                ((gh) obj2).a((org.telegram.ui.ActionBar.e2) obj);
                break;
            case 14:
                m30 m30Var = (m30) obj2;
                Uri uri = (Uri) obj;
                m30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) m30Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.qm0 qm0Var = new org.telegram.ui.qm0(bundle);
                        qm0Var.e = false;
                        qm0Var.f = false;
                        qm0Var.c = m30Var;
                        launchActivity.t0(qm0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    m30Var.r(false, org.telegram.messenger.fc.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 15:
                j40 j40Var = (j40) obj2;
                g40 g40Var = (g40) obj;
                r40 r40Var = j40Var.I0;
                org.telegram.messenger.g20 g20Var = new org.telegram.messenger.g20();
                r40Var.S = g20Var;
                g20Var.a = -1L;
                g20Var.b = -1L;
                g20Var.q = Math.max(1L, r40Var.Q);
                org.telegram.messenger.g20 g20Var2 = r40Var.S;
                g20Var2.s = true;
                g20Var2.w = r40Var.M;
                g20Var2.x = r40Var.N;
                g20Var2.y = r40Var.O;
                g20Var2.z = r40Var.P;
                g20Var2.n = 25;
                g20Var2.h = 360;
                g20Var2.k = 360;
                g20Var2.i = 360;
                g20Var2.l = 360;
                g20Var2.o = j40Var.a.getAbsolutePath();
                org.telegram.messenger.g20 g20Var3 = r40Var.S;
                g20Var3.P = true;
                g20Var3.O = r40Var.j1;
                g20Var3.r = r40Var.k0;
                r40Var.j1 = null;
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, j40Var.a.getAbsolutePath(), 0, true, 0, 0);
                if (g40Var != null) {
                    ffVar.x = g40Var.c;
                    ffVar.y = g40Var.d;
                }
                r40Var.h.u(ffVar, r40Var.S, g40Var == null || g40Var.a, g40Var != null ? g40Var.b : 0, 0, false, g40Var != null ? g40Var.e : 0L);
                break;
            case 16:
                Bitmap bitmap = (Bitmap) obj;
                j40 j40Var2 = (j40) ((zj) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || j40Var2.B0.size() <= 1) {
                    j40Var2.B0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = j40Var2.B0;
                    arrayList6.add((Bitmap) i5.c.h(1, arrayList6));
                    break;
                }
                break;
            case 17:
                p50 p50Var2 = (p50) obj2;
                TLObject tLObject2 = (TLObject) obj;
                p50Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        p50Var2.n1.put(Long.valueOf(p50Var2.m1.admin_id), (TLRPC.User) vector.objects.get(0));
                        p50Var2.O1.f();
                        break;
                    }
                }
                break;
            case 18:
                j50 j50Var = (j50) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (p50Var = j50Var.a.c).e2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = p50Var.m1;
                    org.telegram.ui.lb lbVar = abVar.a;
                    ArrayList arrayList7 = lbVar.p0;
                    int size = arrayList7.size();
                    int i15 = lbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.m10.i(lbVar.getAccountInstance().a).n;
                    i10 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
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
            case 19:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((a60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new ht(editTextBoldCursor, i12));
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ho) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 21:
                v70 v70Var = (v70) obj2;
                if (v70Var.P0 == ((a80) obj)) {
                    v70Var.performLongClick();
                    v70Var.P0 = null;
                    v70Var.N0.f(true);
                    break;
                }
                break;
            case 22:
                ((n2.o0) obj2).o((d80) obj, false);
                break;
            case 23:
                x80 x80Var = (x80) obj2;
                if (!((boolean[]) obj)[0] && (m6Var = x80Var.R) != null) {
                    m6Var.run();
                }
                x80Var.R = null;
                break;
            case 24:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((zh.b) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.h3(new ht(editTextBoldCursor2, 6));
                break;
            case 25:
                b9.g0 g0Var = (b9.g0) obj2;
                Runnable runnable = (Runnable) obj;
                g0Var.getClass();
                runnable.run();
                g0Var.a.remove(runnable);
                break;
            case 26:
                cf0 cf0Var = (cf0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                cf0Var.N = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    cf0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        cf0Var.d();
                        cf0Var.c.g3.O(true);
                        break;
                    } else {
                        cf0Var.a(false);
                        break;
                    }
                }
                break;
            case 27:
                hf0 hf0Var = (hf0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = hf0Var.a;
                int i16 = hf0Var.s;
                int size3 = arrayList8.size();
                hf0Var.s = size3;
                if (i16 != size3 && hf0Var.Q != null) {
                    hf0Var.g();
                }
                int size4 = arrayList9.size();
                int i17 = 0;
                while (i17 < size4) {
                    ef0 ef0Var = (ef0) arrayList9.get(i17);
                    if (ef0Var.o && !ef0Var.p) {
                        arrayList8.add(ef0Var);
                    } else if (hf0.i(ef0Var.a, arrayList8) == null) {
                        hf0 hf0Var2 = ef0Var.y;
                        float f10 = hf0Var2.L;
                        RectF rectF = ef0Var.c;
                        RectF rectF2 = ef0Var.f;
                        d80 d80Var = ef0Var.r;
                        if (d80Var != null) {
                            d80Var.a();
                            ef0Var.t = z11;
                            ef0Var.s = z11;
                        }
                        ef0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f10 ? z12 : z11;
                        boolean z14 = rectF.right + 1.0f >= ((float) hf0Var2.getMeasuredWidth()) - f10;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        ef0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i18 = ef0Var.a;
                            if (i18 == 3 || i18 == 2) {
                                z10 = true;
                                if (hf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    ef0Var.e.e(z10, 0.0f);
                                    arrayList8.add(ef0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            ef0Var.e.e(z10, 0.0f);
                            arrayList8.add(ef0Var);
                        }
                        z10 = true;
                        ef0Var.e.e(z10, 0.0f);
                        arrayList8.add(ef0Var);
                    }
                    i17++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                hf0Var.invalidate();
                break;
            case 28:
                ef0 ef0Var2 = (ef0) obj;
                gf0 gf0Var = ((hf0) obj2).y;
                int i19 = ef0Var2.a;
                RectF rectF3 = ef0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.qt0) gf0Var).b, i19, rectF3.left, rectF3.top);
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
