package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gh(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i7 = this.a;
        int i10 = 3;
        int i11 = 2;
        int i12 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                ((ki.y3) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                break;
            case 1:
                vi viVar = (vi) obj3;
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) obj2;
                Long l10 = (Long) obj;
                viVar.j0 = false;
                TLRPC.User a22 = l10 != null ? npVar.a2(l10) : null;
                viVar.i0 = a22;
                viVar.k0 = a22 == null;
                if (a22 != null) {
                    viVar.T();
                    break;
                }
                break;
            case 2:
                uu uuVar = (uu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.h3(new tu(uuVar, 1 == true ? 1 : 0));
                    break;
                }
                break;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                vs vsVar = (vs) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                vsVar.run();
                break;
            case 4:
                kx kxVar = (kx) obj3;
                lx lxVar = kxVar.a;
                ly lyVar = lxVar.G;
                org.telegram.messenger.si.b0(lyVar.d1).V(lyVar.X0, lxVar.w, false, new km(kxVar, (String) obj2, (Runnable) obj, i11), org.telegram.messenger.gz.F || org.telegram.messenger.m10.i(lyVar.d1).q(), false, true, false, 25);
                break;
            case 5:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                lx lxVar2 = ((kx) obj3).a;
                if (ConnectionsManager.getInstance(lxVar2.G.d1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    lx.E(lxVar2, runnable, arrayList2, false);
                    break;
                }
            case 6:
                fy fyVar = (fy) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj4 = arrayList3.get(i12);
                    i12++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.si.b0(fyVar.x.R.d1).l0(org.telegram.messenger.si.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = l02 != null ? l02.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        fyVar.n.add(new ex(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 7:
                zz zzVar = (zz) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if (zzVar.W1 != null || (zzVar.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    xb I = cc.a0(e2Var).I(R.raw.folder_in, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750626, zzVar.b2)), arrayList4.size() <= 0 ? org.telegram.messenger.hd.G(zzVar.d2.size(), "FolderLinkUpdatedSubtitle", new Object[0]) : org.telegram.messenger.hd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    xb I2 = cc.a0(e2Var).I(R.raw.contact_check, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750678, zzVar.b2)), org.telegram.messenger.hd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I2.j = 5000;
                    I2.j();
                    break;
                }
            case 8:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    float f10 = iArr[0];
                    Point point = org.telegram.messenger.g0.q;
                    int j3 = Utilities.j((int) ((f10 / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j10 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.g0.m) + org.telegram.messenger.g0.n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j11 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j3, 0);
                    int j12 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.g0.m) + org.telegram.messenger.g0.n)) * bitmap.getHeight()), bitmap.getHeight() - j10, 0);
                    if ((j3 != 0 || j10 != 0 || j11 != bitmap.getWidth() || j12 != bitmap.getHeight()) && j11 > 0 && j12 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j3, j10, j11, j12);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.04f : -0.07f);
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l11.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.j6.I.q() ? 2.0f : 3.0f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.2f : -0.07f);
                Bitmap l12 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l12.setHasAlpha(false);
                bitmap.recycle();
                dVar.a(l11, l12);
                break;
            case 9:
                org.telegram.messenger.np npVar2 = (org.telegram.messenger.np) obj3;
                qp0 qp0Var = (qp0) obj2;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    npVar2.G4(true);
                    if (T != null) {
                        cc.a0(T).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745574, null), new bd(i11, T)), true)).k(true);
                    }
                    qp0Var.a(Boolean.TRUE);
                    break;
                } else if (T != null) {
                    cc.a0(T).I(R.raw.error, org.telegram.messenger.hd.M0(2131754311, null), org.telegram.messenger.hd.M0(2131754312, null)).j();
                    break;
                }
                break;
            case 10:
                ys0.a((ys0) obj3, (TL_stories.StoryItem) obj2, (fi.l6) obj);
                break;
            case 11:
                v01 v01Var = (v01) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = v01Var.N;
                v01Var.O = 0;
                if (((String) obj2).equals(v01Var.M)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    v01Var.h();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj3;
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                k1Var.getClass();
                if (u0Var != null) {
                    u0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                k1Var.e();
                break;
            case 13:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj3;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                Long l13 = (Long) obj;
                nsVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                e2Var2.presentFragment(new ProfileActivity(bundle, null));
                nsVar.o();
                break;
            case 14:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) obj3;
                Boolean bool = (Boolean) obj;
                jsVar.getClass();
                ((org.telegram.messenger.z10) obj2).a(bool);
                if (bool.booleanValue()) {
                    jsVar.a.o();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    ywVar.showDialog(new org.telegram.ui.fh0(activity, !c8.ka.a(), new org.telegram.ui.su(activity, 0)));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.fm0 fm0Var = (org.telegram.ui.fm0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.hz hzVar = ((org.telegram.ui.ez) obj3).e;
                if (hzVar.getUserConfig().q()) {
                    int intValue = num.intValue();
                    hzVar.F = intValue;
                    fm0Var.a(intValue, true);
                    org.telegram.ui.xy xyVar = hzVar.J;
                    if (xyVar != null) {
                        xyVar.d(!hzVar.getUserConfig().q() ? -1 : hzVar.F, true);
                    }
                    hzVar.o0(true);
                    break;
                } else {
                    hzVar.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) hzVar, 35, true));
                    break;
                }
            case 17:
                org.telegram.ui.n30 n30Var = (org.telegram.ui.n30) obj3;
                org.telegram.ui.rv rvVar = (org.telegram.ui.rv) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (rvVar != null) {
                    n30Var.getClass();
                    rvVar.setVisibility(0);
                }
                n30Var.c = bitmap2;
                Paint paint = new Paint(1);
                n30Var.d = paint;
                Bitmap bitmap3 = n30Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                n30Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix3, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix3, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                n30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 18:
                org.telegram.ui.q90 q90Var = (org.telegram.ui.q90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                q90Var.c();
                if (user != null) {
                    long j13 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    q90Var.u(new org.telegram.ui.p90(bundle2, user, userArr, j13), false);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.qg0 qg0Var = (org.telegram.ui.qg0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = qg0Var.b2;
                arrayList7.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && qg0Var.d1(user2)) {
                            arrayList7.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = qg0Var.n2;
                if (bool2 == null || !bool2.booleanValue()) {
                    qg0Var.g1(true, true);
                    break;
                } else {
                    gh ghVar = new gh(20, qg0Var, hashSet);
                    org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.m10.t0);
                    if (str == null || str.isEmpty()) {
                        org.telegram.messenger.g0.h3(new vg.o(ghVar, 4));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.a31(11, s12, ghVar));
                    }
                    qg0Var.i2 = i12;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.qg0 qg0Var2 = (org.telegram.ui.qg0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && qg0Var2.d1(user3)) {
                            qg0Var2.b2.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                qg0Var2.g1(true, true);
                break;
            case 21:
                org.telegram.ui.bh0 bh0Var = (org.telegram.ui.bh0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    bh0Var.L1.setImageDrawable(null);
                    bh0Var.u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131748278, null), new org.telegram.ui.jd0(7, bh0Var, str2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = bh0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    org.telegram.ui.ActionBar.q6.x(bh0Var.L1, mutate, org.telegram.ui.ActionBar.j6.v6, bh0Var.J0, PorterDuff.Mode.SRC_IN);
                    bh0Var.L1.setImageDrawable(mutate);
                    if (user4.contact) {
                        bh0Var.u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131748279, null), new org.telegram.ui.jd0(8, bh0Var, user4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        bh0Var.u1.setText(org.telegram.messenger.hd.M0(2131748277, null));
                    }
                }
                bh0Var.O0(false);
                break;
            case 22:
                ArrayList arrayList8 = (ArrayList) obj3;
                i9[] i9VarArr = (i9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i13 = 0; i13 < arrayList8.size(); i13++) {
                        String str3 = (String) arrayList8.get(i13);
                        int i14 = 0;
                        while (true) {
                            if (i14 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i14).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i14).emoticon, str3)) {
                                    i14++;
                                } else {
                                    long longValue = tL_messages_stickerSet.packs.get(i14).documents.get(0).longValue();
                                    for (int i15 = 0; i15 < tL_messages_stickerSet.documents.size(); i15++) {
                                        if (tL_messages_stickerSet.documents.get(i15).id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i15);
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            i9VarArr[i13].m(org.telegram.messenger.gc.b(document), "40_40", org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.j6.f(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 23:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.bi0) obj2).run();
                break;
            case 24:
                org.telegram.ui.xr0 xr0Var = (org.telegram.ui.xr0) obj3;
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) obj2;
                Long l14 = (Long) obj;
                xr0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l14.longValue() >= 0) {
                    bundle3.putLong("user_id", l14.longValue());
                } else {
                    bundle3.putLong("chat_id", -l14.longValue());
                }
                e2Var3.presentFragment(new ProfileActivity(bundle3, null));
                xr0Var.c(false);
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.X6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().m2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.jo0(profileActivity, userFull, tL_birthday2, i10), 1024);
                break;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.X6;
                ((org.telegram.ui.ActionBar.t1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    hi.sa D = hi.sa.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.O = a10;
                    hi.ia iaVar = D.d1;
                    if (iaVar != null) {
                        iaVar.setDialogId(a10);
                    }
                    D.Q(null);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ww0 ww0Var = (org.telegram.ui.ww0) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.n11.k(tL_messages_stickerSet2, str4);
                if (k10 == null) {
                    StringBuilder u10 = a8.p0.u("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.zw0.s;
                    org.telegram.messenger.a8.d(u10.toString());
                    break;
                } else {
                    org.telegram.ui.yw0 yw0Var = new org.telegram.ui.yw0(null);
                    ww0Var.c = yw0Var;
                    ww0Var.e.add(yw0Var);
                    int f11 = org.telegram.ui.jx.f();
                    ww0Var.c.W(0);
                    org.telegram.ui.yw0 yw0Var2 = ww0Var.c;
                    String str5 = f11 + "_" + f11 + "_precache";
                    org.telegram.ui.pu0 pu0Var = new org.telegram.ui.pu0(ww0Var, 6);
                    yw0Var2.getClass();
                    yw0Var2.h1 = new org.telegram.ui.xw0(new Runnable[]{pu0Var});
                    yw0Var2.q0(org.telegram.messenger.gc.b(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    ww0Var.c.P();
                    ww0Var.g[1] = true;
                    ww0Var.a();
                    break;
                }
            case 28:
                ((fi.e) obj3).a((HashSet) obj2);
                break;
            default:
                org.telegram.ui.pz0 pz0Var = (org.telegram.ui.pz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    pz0Var.getClass();
                    view2.setVisibility(0);
                }
                pz0Var.f = bitmap4;
                Paint paint2 = new Paint(1);
                pz0Var.n = paint2;
                Bitmap bitmap5 = pz0Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                pz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix4, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix4, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                pz0Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                pz0Var.r = new Matrix();
                break;
        }
    }
}
