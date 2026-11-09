package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fq(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n50 n50Var;
        org.telegram.ui.bb bbVar;
        int i7;
        bi.u7 u7Var;
        int i10 = this.a;
        String str = "";
        int i11 = 4;
        char c10 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ActionBar.v2) obj2).dismiss();
                vf.c.t((Context) obj, "https://t.me/BotFather?start=deletebot");
                break;
            case 1:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) obj2;
                TreeSet treeSet = (TreeSet) obj;
                String charSequence = k3Var.getText().toString();
                if (!lq.a(charSequence, "bot") && lq.c(charSequence, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                i3Var.setRightText(str);
                i3Var.setPadding(0, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(TextUtils.isEmpty(str) ? 21.0f : 63.0f), org.telegram.messenger.g0.L(15.0f));
                break;
            case 2:
                tq tqVar = (tq) obj2;
                tqVar.getClass();
                ((fi.d) obj).setLoading(false);
                tqVar.dismiss();
                break;
            case 3:
                tq tqVar2 = (tq) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    tqVar2.T1 = groupcallstreamrtmpurl.url;
                    tqVar2.U1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tqVar2.U1);
                    tqVar2.V1 = spannableStringBuilder;
                    vy0 vy0Var = new vy0();
                    vy0Var.a |= 256;
                    vy0Var.b = 0;
                    vy0Var.c = spannableStringBuilder.length();
                    tqVar2.V1.setSpan(new wy0(vy0Var, 0), 0, tqVar2.V1.length(), 0);
                    tqVar2.W1.O(false);
                    break;
                }
                break;
            case 4:
                ur urVar = (ur) obj2;
                TLObject tLObject2 = (TLObject) obj;
                rr rrVar = urVar.b;
                ArrayList arrayList = urVar.h;
                int i12 = urVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.qp.s1(i12).Y3(popularappbots.users, false);
                    org.telegram.messenger.yr.a0(i12).m1(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    urVar.g = str2;
                    urVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    urVar.f = currentTimeMillis;
                    if (!urVar.i) {
                        urVar.i = true;
                        String str3 = urVar.g;
                        String str4 = str3 == null ? "" : str3;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13 = com.google.android.recaptcha.internal.a.g(i13, 1, ((TLRPC.User) arrayList.get(i13)).id, arrayList2)) {
                        }
                        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i12);
                        a02.a.c(new bi.i0(urVar, a02, arrayList2, currentTimeMillis, str4, 11));
                    }
                    urVar.c = false;
                    rrVar.run();
                    break;
                } else {
                    urVar.g = null;
                    urVar.e = true;
                    urVar.c = false;
                    rrVar.run();
                    break;
                }
            case 5:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.h3(new fq(6, (ps) obj2, decodeFile));
                break;
            case 6:
                ((ps) obj2).setImage((Bitmap) obj);
                break;
            case 7:
                ((EditTextBoldCursor) obj2).o0.draw((Canvas) obj);
                break;
            case 8:
                org.telegram.messenger.qp.s1(((cu) obj2).a.a).h5((TLRPC.EmojiStatus) obj, null);
                break;
            case 9:
                org.telegram.messenger.qp.s1(((cw) obj2).a.c1).h5((TLRPC.EmojiStatus) obj, null);
                break;
            case 10:
                TLObject tLObject3 = (TLObject) obj;
                hy hyVar = ((cw) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    org.telegram.messenger.ui.b0(hyVar.c1).I1(tL_messages_stickerSet, true);
                    org.telegram.messenger.ui.b0(hyVar.c1).P1(tL_messages_stickerSet);
                    break;
                }
                break;
            case 11:
                yw ywVar = (yw) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ywVar.x.f = true;
                hy hyVar2 = ywVar.G;
                if (!hyVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    hyVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                ywVar.a(true);
                break;
            case 12:
                final gx gxVar = (gx) obj2;
                final String str5 = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                hy hyVar3 = gxVar.a.F;
                if (!Arrays.equals(hyVar3.W0, G0)) {
                    org.telegram.messenger.ui.b0(hyVar3.c1).M(G0, false);
                }
                hyVar3.W0 = G0;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ex
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        switch (r4) {
                            case 0:
                                gx gxVar2 = gxVar;
                                org.telegram.messenger.ui.b0(gxVar2.a.F.c1).Y1(true, str5, new bi.v3(gxVar2, arrayList5, (Runnable) obj3, 8));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                hy hyVar4 = gxVar.a.F;
                                if (org.telegram.messenger.iz.F || org.telegram.messenger.p10.i(hyVar4.c1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i14 = hyVar4.c1;
                                    ArrayList s02 = org.telegram.messenger.ui.b0(i14).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (s02 != null) {
                                        for (int i15 = 0; i15 < s02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new zw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.ui.b0(i14).s0[1];
                                    if (arrayList9 != null) {
                                        for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title.toLowerCase());
                                                if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i14).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList6 = l02 != null ? l02.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new zw(stickerSetCovered, arrayList6));
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
                org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(29, gxVar, str5);
                final char c11 = c10 == true ? 1 : 0;
                Utilities.u(0, c20Var, kVar, new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ex
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        switch (c11) {
                            case 0:
                                gx gxVar2 = gxVar;
                                org.telegram.messenger.ui.b0(gxVar2.a.F.c1).Y1(true, str5, new bi.v3(gxVar2, arrayList4, (Runnable) obj3, 8));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                hy hyVar4 = gxVar.a.F;
                                if (org.telegram.messenger.iz.F || org.telegram.messenger.p10.i(hyVar4.c1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i14 = hyVar4.c1;
                                    ArrayList s02 = org.telegram.messenger.ui.b0(i14).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (s02 != null) {
                                        for (int i15 = 0; i15 < s02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new zw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.ui.b0(i14).s0[1];
                                    if (arrayList9 != null) {
                                        for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title.toLowerCase());
                                                if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i14).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList6 = l02 != null ? l02.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new zw(stickerSetCovered, arrayList6));
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
                }, new fx(r7, gxVar, arrayList3), new bi.z2(gxVar, str5, arrayList3, arrayList4, arrayList5, 4));
                break;
            case 13:
                ArrayList arrayList6 = (ArrayList) obj;
                hx hxVar = ((gx) obj2).a;
                hxVar.F.V.e(false);
                ArrayList arrayList7 = hxVar.r;
                hxVar.E = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                hxVar.f();
                break;
            case 14:
                ((mx) obj2).F((String) obj, "", true, false, false);
                break;
            case 15:
                mx mxVar = (mx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                hy hyVar4 = mxVar.L;
                org.telegram.messenger.qp.s1(hyVar4.c1).Y3(tL_contacts_resolvedPeer.users, false);
                int i14 = hyVar4.c1;
                org.telegram.messenger.qp.s1(i14).S3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.yr.a0(i14).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = mxVar.x;
                mxVar.x = null;
                mxVar.F(str6, "", false, false, false);
                break;
            case 16:
                sy syVar = (sy) obj2;
                fi.d7 d7Var = (fi.d7) obj;
                syVar.b();
                syVar.g(d7Var);
                wy wyVar = syVar.J;
                wyVar.h1 = d7Var;
                wyVar.j();
                break;
            case 17:
                ((sy) obj2).J.f1 = (uy) obj;
                break;
            case 18:
                ((wz) obj2).r2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 19:
                ((fx) obj2).a((org.telegram.ui.ActionBar.f2) obj);
                break;
            case 20:
                k30 k30Var = (k30) obj2;
                Uri uri = (Uri) obj;
                k30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) k30Var.a.getParentActivity();
                    if (launchActivity == null) {
                        break;
                    } else {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.rm0 rm0Var = new org.telegram.ui.rm0(bundle);
                        rm0Var.e = false;
                        rm0Var.f = false;
                        rm0Var.c = k30Var;
                        launchActivity.t0(rm0Var);
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    k30Var.r(false, org.telegram.messenger.gc.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 21:
                h40 h40Var = (h40) obj2;
                e40 e40Var = (e40) obj;
                p40 p40Var = h40Var.H0;
                org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
                p40Var.R = j20Var;
                j20Var.a = -1L;
                j20Var.b = -1L;
                j20Var.q = Math.max(1L, p40Var.P);
                org.telegram.messenger.j20 j20Var2 = p40Var.R;
                j20Var2.s = true;
                j20Var2.w = p40Var.L;
                j20Var2.x = p40Var.M;
                j20Var2.y = p40Var.N;
                j20Var2.z = p40Var.O;
                j20Var2.n = 25;
                j20Var2.h = 360;
                j20Var2.k = 360;
                j20Var2.i = 360;
                j20Var2.l = 360;
                j20Var2.o = h40Var.a.getAbsolutePath();
                org.telegram.messenger.j20 j20Var3 = p40Var.R;
                j20Var3.P = true;
                j20Var3.O = p40Var.i1;
                j20Var3.r = p40Var.j0;
                p40Var.i1 = null;
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, h40Var.a.getAbsolutePath(), 0, true, 0, 0);
                if (e40Var != null) {
                    gfVar.x = e40Var.c;
                    gfVar.y = e40Var.d;
                }
                p40Var.h.u(gfVar, p40Var.R, e40Var == null || e40Var.a, e40Var != null ? e40Var.b : 0, 0, false, e40Var != null ? e40Var.e : 0L);
                break;
            case 22:
                Bitmap bitmap = (Bitmap) obj;
                h40 h40Var2 = (h40) ((et) obj2).b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && h40Var2.A0.size() > 1) {
                    ArrayList arrayList8 = h40Var2.A0;
                    arrayList8.add((Bitmap) jg.g.i(1, arrayList8));
                    break;
                } else {
                    h40Var2.A0.add(bitmap);
                    break;
                }
                break;
            case 23:
                n50 n50Var2 = (n50) obj2;
                TLObject tLObject4 = (TLObject) obj;
                n50Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        n50Var2.j1.put(Long.valueOf(n50Var2.i1.admin_id), (TLRPC.User) vector.objects.get(0));
                        n50Var2.K1.f();
                        break;
                    }
                }
                break;
            case 24:
                h50 h50Var = (h50) obj2;
                if (((TLRPC.TL_error) obj) == null && (bbVar = (n50Var = h50Var.a.c).a2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = n50Var.i1;
                    org.telegram.ui.mb mbVar = bbVar.a;
                    ArrayList arrayList9 = mbVar.o0;
                    int size = arrayList9.size();
                    int i15 = mbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.p10.i(mbVar.getAccountInstance().a).n;
                    i7 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
                    if (new org.telegram.messenger.ij(i7, tL_channelAdminLogEvent, mbVar.n0, mbVar.m0, mbVar.f, mbVar.T, true).U >= 0) {
                        mbVar.W0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            mbVar.C0.N = true;
                            org.telegram.ui.jb jbVar = mbVar.E;
                            jbVar.o(jbVar.h, size2);
                            org.telegram.ui.mb.P0(mbVar);
                        }
                        mbVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 25:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((y50) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new bt(editTextBoldCursor, i11));
                break;
            case 26:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.io) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 27:
                t70 t70Var = (t70) obj2;
                if (t70Var.O0 == ((y70) obj)) {
                    t70Var.performLongClick();
                    t70Var.O0 = null;
                    t70Var.M0.f(true);
                    break;
                }
                break;
            case 28:
                ((n2.n0) obj2).n((b80) obj, false);
                break;
            default:
                v80 v80Var = (v80) obj2;
                if (!((boolean[]) obj)[0] && (u7Var = v80Var.Q) != null) {
                    u7Var.run();
                }
                v80Var.Q = null;
                break;
        }
    }
}
