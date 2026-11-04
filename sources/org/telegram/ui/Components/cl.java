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
import android.widget.FrameLayout;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cl(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        i50 i50Var;
        org.telegram.ui.za zaVar;
        int i3;
        int i10 = this.a;
        String str = "";
        int i11 = 3;
        char c2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) obj;
                pl plVar = ((ChatAttachAlertPhotoLayout) obj2).Q;
                if (plVar != null) {
                    plVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 1:
                th thVar = (th) obj;
                int currentItemTop = thVar.getCurrentItemTop();
                int listTopPadding = thVar.getListTopPadding();
                ci.j1 j1Var = ((am) obj2).r;
                if (currentItemTop > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding -= currentItemTop;
                }
                j1Var.scrollBy(0, listTopPadding);
                break;
            case 2:
                on.a(((mn) obj2).c);
                ((lg.g) obj).run();
                break;
            case 3:
                ((ro) obj2).b.R0((ArrayList) obj);
                break;
            case 4:
                ((so) obj2).b.R0((ArrayList) obj);
                break;
            case 5:
                ((org.telegram.ui.ActionBar.t2) obj2).dismiss();
                sf.c.t((Context) obj, "https://t.me/BotFather?start=deletebot");
                break;
            case 6:
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
            case 7:
                tq tqVar = (tq) obj2;
                tqVar.getClass();
                ((gi.d) obj).setLoading(false);
                tqVar.dismiss();
                break;
            case 8:
                tq tqVar2 = (tq) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    tqVar2.U1 = groupcallstreamrtmpurl.url;
                    tqVar2.V1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tqVar2.V1);
                    tqVar2.W1 = spannableStringBuilder;
                    ty0 ty0Var = new ty0();
                    ty0Var.a |= 256;
                    ty0Var.b = 0;
                    ty0Var.c = spannableStringBuilder.length();
                    tqVar2.W1.setSpan(new uy0(ty0Var, 0), 0, tqVar2.W1.length(), 0);
                    tqVar2.X1.O(false);
                    break;
                }
                break;
            case 9:
                ur urVar = (ur) obj2;
                TLObject tLObject2 = (TLObject) obj;
                rr rrVar = urVar.b;
                ArrayList arrayList = urVar.h;
                int i12 = urVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.hp.s1(i12).Y3(popularappbots.users, false);
                    org.telegram.messenger.qr.a0(i12).m1(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    urVar.g = str2;
                    urVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    urVar.f = currentTimeMillis;
                    if (urVar.i) {
                        z10 = false;
                    } else {
                        urVar.i = true;
                        String str3 = urVar.g;
                        String str4 = str3 == null ? "" : str3;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13 = a1.g.h(i13, 1, ((TLRPC.User) arrayList.get(i13)).id, arrayList2)) {
                        }
                        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i12);
                        a02.a.c(new ai.z1(urVar, a02, arrayList2, currentTimeMillis, str4, 12));
                        z10 = false;
                    }
                    urVar.c = z10;
                    rrVar.run();
                    break;
                } else {
                    urVar.g = null;
                    urVar.e = true;
                    urVar.c = false;
                    rrVar.run();
                    break;
                }
            case 10:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.h3(new cl(11, (ps) obj2, decodeFile));
                break;
            case 11:
                ((ps) obj2).setImage((Bitmap) obj);
                break;
            case 12:
                ((EditTextBoldCursor) obj2).p0.draw((Canvas) obj);
                break;
            case 13:
                org.telegram.messenger.hp.s1(((au) obj2).a.a).h5((TLRPC.EmojiStatus) obj, null);
                break;
            case 14:
                org.telegram.messenger.hp.s1(((aw) obj2).a.d1).h5((TLRPC.EmojiStatus) obj, null);
                break;
            case 15:
                TLObject tLObject3 = (TLObject) obj;
                ey eyVar = ((aw) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    org.telegram.messenger.li.b0(eyVar.d1).I1(tL_messages_stickerSet, true);
                    org.telegram.messenger.li.b0(eyVar.d1).P1(tL_messages_stickerSet);
                    break;
                }
                break;
            case 16:
                ww wwVar = (ww) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                wwVar.x.f = true;
                ey eyVar2 = wwVar.H;
                if (!eyVar2.q1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    eyVar2.q1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                wwVar.a(true);
                break;
            case 17:
                final dx dxVar = (dx) obj2;
                final String str5 = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                ey eyVar3 = dxVar.a.G;
                if (!Arrays.equals(eyVar3.X0, G0)) {
                    org.telegram.messenger.li.b0(eyVar3.d1).M(G0, false);
                }
                eyVar3.X0 = G0;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                org.telegram.messenger.u10 u10Var = new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.cx
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        switch (r4) {
                            case 0:
                                dx dxVar2 = dxVar;
                                org.telegram.messenger.li.b0(dxVar2.a.G.d1).Y1(true, str5, new ai.m(dxVar2, arrayList5, (Runnable) obj3, 10));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ey eyVar4 = dxVar.a.G;
                                if (org.telegram.messenger.az.F || org.telegram.messenger.h10.i(eyVar4.d1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i14 = eyVar4.d1;
                                    ArrayList s02 = org.telegram.messenger.li.b0(i14).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (s02 != null) {
                                        for (int i15 = 0; i15 < s02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new xw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.li.b0(i14).t0[1];
                                    if (arrayList9 != null) {
                                        for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title.toLowerCase());
                                                if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(i14).l0(org.telegram.messenger.li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList6 = l02 != null ? l02.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new xw(stickerSetCovered, arrayList6));
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
                ei eiVar = new ei(i11, dxVar, str5);
                final char c10 = c2 == true ? 1 : 0;
                Utilities.u(0, u10Var, eiVar, new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.cx
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        switch (c10) {
                            case 0:
                                dx dxVar2 = dxVar;
                                org.telegram.messenger.li.b0(dxVar2.a.G.d1).Y1(true, str5, new ai.m(dxVar2, arrayList4, (Runnable) obj3, 10));
                                break;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ey eyVar4 = dxVar.a.G;
                                if (org.telegram.messenger.az.F || org.telegram.messenger.h10.i(eyVar4.d1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i14 = eyVar4.d1;
                                    ArrayList s02 = org.telegram.messenger.li.b0(i14).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (s02 != null) {
                                        for (int i15 = 0; i15 < s02.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new xw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.li.b0(i14).t0[1];
                                    if (arrayList9 != null) {
                                        for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title.toLowerCase());
                                                if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(i14).l0(org.telegram.messenger.li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList6 = l02 != null ? l02.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new xw(stickerSetCovered, arrayList6));
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
                }, new ei(4, dxVar, arrayList3), new ci.o2(dxVar, str5, arrayList3, arrayList4, arrayList5, 4));
                break;
            case 18:
                ArrayList arrayList6 = (ArrayList) obj;
                ex exVar = ((dx) obj2).a;
                exVar.G.W.e(false);
                ArrayList arrayList7 = exVar.r;
                exVar.F = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                exVar.f();
                break;
            case 19:
                ((jx) obj2).F((String) obj, "", true, false, false);
                break;
            case 20:
                jx jxVar = (jx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                ey eyVar4 = jxVar.M;
                org.telegram.messenger.hp.s1(eyVar4.d1).Y3(tL_contacts_resolvedPeer.users, false);
                int i14 = eyVar4.d1;
                org.telegram.messenger.hp.s1(i14).S3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.qr.a0(i14).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = jxVar.x;
                jxVar.x = null;
                jxVar.F(str6, "", false, false, false);
                break;
            case 21:
                py pyVar = (py) obj2;
                gi.e7 e7Var = (gi.e7) obj;
                pyVar.b();
                pyVar.g(e7Var);
                sy syVar = pyVar.K;
                syVar.h1 = e7Var;
                syVar.j();
                break;
            case 22:
                ((py) obj2).K.f1 = (ry) obj;
                break;
            case 23:
                ((rz) obj2).s2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 24:
                ((ei) obj2).a((org.telegram.ui.ActionBar.d2) obj);
                break;
            case 25:
                f30 f30Var = (f30) obj2;
                Uri uri = (Uri) obj;
                f30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) f30Var.a.getParentActivity();
                    if (launchActivity == null) {
                        break;
                    } else {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.km0 km0Var = new org.telegram.ui.km0(bundle);
                        km0Var.e = false;
                        km0Var.f = false;
                        km0Var.c = f30Var;
                        launchActivity.t0(km0Var);
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    f30Var.r(false, org.telegram.messenger.zb.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 26:
                c40 c40Var = (c40) obj2;
                z30 z30Var = (z30) obj;
                k40 k40Var = c40Var.I0;
                org.telegram.messenger.b20 b20Var = new org.telegram.messenger.b20();
                k40Var.S = b20Var;
                b20Var.a = -1L;
                b20Var.b = -1L;
                b20Var.q = Math.max(1L, k40Var.Q);
                org.telegram.messenger.b20 b20Var2 = k40Var.S;
                b20Var2.s = true;
                b20Var2.w = k40Var.M;
                b20Var2.x = k40Var.N;
                b20Var2.y = k40Var.O;
                b20Var2.z = k40Var.P;
                b20Var2.n = 25;
                b20Var2.h = 360;
                b20Var2.k = 360;
                b20Var2.i = 360;
                b20Var2.l = 360;
                b20Var2.o = c40Var.a.getAbsolutePath();
                org.telegram.messenger.b20 b20Var3 = k40Var.S;
                b20Var3.P = true;
                b20Var3.O = k40Var.j1;
                b20Var3.r = k40Var.k0;
                k40Var.j1 = null;
                org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, c40Var.a.getAbsolutePath(), 0, true, 0, 0);
                if (z30Var != null) {
                    yeVar.x = z30Var.c;
                    yeVar.y = z30Var.d;
                }
                k40Var.h.u(yeVar, k40Var.S, z30Var == null || z30Var.a, z30Var != null ? z30Var.b : 0, 0, false, z30Var != null ? z30Var.e : 0L);
                break;
            case 27:
                Bitmap bitmap = (Bitmap) obj;
                c40 c40Var2 = (c40) ((lt) obj2).b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && c40Var2.B0.size() > 1) {
                    ArrayList arrayList8 = c40Var2.B0;
                    arrayList8.add((Bitmap) k2.p1.h(1, arrayList8));
                    break;
                } else {
                    c40Var2.B0.add(bitmap);
                    break;
                }
                break;
            case 28:
                i50 i50Var2 = (i50) obj2;
                TLObject tLObject4 = (TLObject) obj;
                i50Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        i50Var2.k1.put(Long.valueOf(i50Var2.j1.admin_id), (TLRPC.User) vector.objects.get(0));
                        i50Var2.L1.f();
                        break;
                    }
                }
                break;
            default:
                c50 c50Var = (c50) obj2;
                if (((TLRPC.TL_error) obj) == null && (zaVar = (i50Var = c50Var.a.c).b2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = i50Var.j1;
                    org.telegram.ui.kb kbVar = zaVar.a;
                    ArrayList arrayList9 = kbVar.p0;
                    int size = arrayList9.size();
                    int i15 = kbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.h10.i(kbVar.getAccountInstance().a).n;
                    i3 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                    if (new org.telegram.messenger.zi(i3, tL_channelAdminLogEvent, kbVar.o0, kbVar.n0, kbVar.f, kbVar.U, true).U >= 0) {
                        kbVar.W0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            kbVar.D0.N = true;
                            org.telegram.ui.hb hbVar = kbVar.F;
                            hbVar.o(hbVar.h, size2);
                            org.telegram.ui.kb.P0(kbVar);
                        }
                        kbVar.z0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
        }
    }
}
