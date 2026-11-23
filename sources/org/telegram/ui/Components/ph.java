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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ph(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.w10
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
                ti tiVar = (ti) obj3;
                ((org.telegram.ui.bn) obj2).y5 = (org.telegram.messenger.kj) obj;
                boolean v12 = tiVar.v1(true, 0, 0, tiVar.L2, tiVar.g1());
                ef efVar = tiVar.c2;
                if (efVar != null) {
                    efVar.h(!v12);
                    tiVar.c2 = null;
                    break;
                }
                break;
            case 1:
                ((ki.t3) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                break;
            case 2:
                dj djVar = (dj) obj3;
                org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) obj2;
                Long l10 = (Long) obj;
                djVar.j0 = false;
                TLRPC.User c22 = l10 != null ? mpVar.c2(l10) : null;
                djVar.i0 = c22;
                djVar.k0 = c22 == null;
                if (c22 != null) {
                    djVar.T();
                    break;
                }
                break;
            case 3:
                zu zuVar = (zu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.g3(new yu(zuVar, 1 == true ? 1 : 0));
                    break;
                }
                break;
            case 4:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                bt btVar = (bt) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                btVar.run();
                break;
            case 5:
                ox oxVar = (ox) obj3;
                px pxVar = oxVar.a;
                qy qyVar = pxVar.G;
                org.telegram.messenger.ri.d0(qyVar.d1).X(qyVar.X0, pxVar.w, false, new rm(oxVar, (String) obj2, (Runnable) obj, i11), org.telegram.messenger.bz.F || org.telegram.messenger.i10.i(qyVar.d1).q(), false, true, false, 25);
                break;
            case 6:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                px pxVar2 = ((ox) obj3).a;
                if (ConnectionsManager.getInstance(pxVar2.G.d1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    px.E(pxVar2, runnable, arrayList2, false);
                    break;
                }
            case 7:
                ky kyVar = (ky) obj3;
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
                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(kyVar.x.R.d1).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = n02 != null ? n02.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        kyVar.n.add(new jx(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 8:
                g00 g00Var = (g00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                if (g00Var.W1 != null || (g00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    fc I = kc.b0(g2Var).I(R.raw.folder_in, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750609, g00Var.b2)), arrayList4.size() <= 0 ? org.telegram.messenger.gd.G(g00Var.d2.size(), "FolderLinkUpdatedSubtitle", new Object[0]) : org.telegram.messenger.gd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    fc I2 = kc.b0(g2Var).I(R.raw.contact_check, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750661, g00Var.b2)), org.telegram.messenger.gd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I2.j = 5000;
                    I2.j();
                    break;
                }
                break;
            case 9:
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
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.n6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.n6.I.q() ? -0.04f : -0.07f);
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l11.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.n6.I.q() ? 2.0f : 3.0f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.n6.I.q() ? -0.2f : -0.07f);
                Bitmap l12 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l12.setHasAlpha(false);
                bitmap.recycle();
                dVar.a(l11, l12);
                break;
            case 10:
                org.telegram.messenger.mp mpVar2 = (org.telegram.messenger.mp) obj3;
                s60 s60Var = (s60) obj2;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    mpVar2.Q4(true);
                    if (T != null) {
                        kc.b0(T).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(2131745378, null), new kd(i11, T)), true)).k(true);
                    }
                    s60Var.a(Boolean.TRUE);
                    break;
                } else if (T != null) {
                    kc.b0(T).I(R.raw.error, org.telegram.messenger.gd.N0(2131754308, null), org.telegram.messenger.gd.N0(2131754309, null)).j();
                    break;
                }
                break;
            case 11:
                it0.a((it0) obj3, (TL_stories.StoryItem) obj2, (fi.i6) obj);
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
                k1Var.a();
                break;
            case 13:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj3;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj2;
                Long l13 = (Long) obj;
                nsVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                g2Var2.presentFragment(new ProfileActivity(bundle, null));
                nsVar.o();
                break;
            case 14:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) obj3;
                Boolean bool = (Boolean) obj;
                jsVar.getClass();
                ((org.telegram.messenger.w10) obj2).a(bool);
                if (bool.booleanValue()) {
                    jsVar.a.o();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    bxVar.showDialog(new org.telegram.ui.hh0(activity, !c8.oa.a(), new org.telegram.ui.ru(activity, 0)));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.gm0 gm0Var = (org.telegram.ui.gm0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.jz jzVar = ((org.telegram.ui.gz) obj3).e;
                if (jzVar.getUserConfig().q()) {
                    int intValue = num.intValue();
                    jzVar.F = intValue;
                    gm0Var.a(intValue, true);
                    org.telegram.ui.zy zyVar = jzVar.J;
                    if (zyVar != null) {
                        zyVar.d(!jzVar.getUserConfig().q() ? -1 : jzVar.F, true);
                    }
                    jzVar.o0(true);
                    break;
                } else {
                    jzVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) jzVar, 35, true));
                    break;
                }
            case 17:
                org.telegram.ui.p30 p30Var = (org.telegram.ui.p30) obj3;
                org.telegram.ui.tv tvVar = (org.telegram.ui.tv) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (tvVar != null) {
                    p30Var.getClass();
                    tvVar.setVisibility(0);
                }
                p30Var.c = bitmap2;
                Paint paint = new Paint(1);
                p30Var.d = paint;
                Bitmap bitmap3 = p30Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                p30Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix3, org.telegram.ui.ActionBar.n6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix3, org.telegram.ui.ActionBar.n6.I.q() ? -0.02f : -0.04f);
                p30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 18:
                org.telegram.ui.r90 r90Var = (org.telegram.ui.r90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                r90Var.c();
                if (user != null) {
                    long j13 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    r90Var.u(new org.telegram.ui.q90(bundle2, user, userArr, j13), false);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.tg0 tg0Var = (org.telegram.ui.tg0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = tg0Var.b2;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && tg0Var.e1(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = tg0Var.n2;
                if (bool2 == null || !bool2.booleanValue()) {
                    tg0Var.h1(true, true);
                    break;
                } else {
                    ph phVar = new ph(20, tg0Var, hashSet);
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.i10.t0);
                    if (str == null || str.isEmpty()) {
                        org.telegram.messenger.g0.g3(new ug.u1(phVar, 7));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.d31(11, u12, phVar));
                    }
                    tg0Var.i2 = i12;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.tg0 tg0Var2 = (org.telegram.ui.tg0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && tg0Var2.e1(user3)) {
                            tg0Var2.b2.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                tg0Var2.h1(true, true);
                break;
            case 21:
                org.telegram.ui.dh0 dh0Var = (org.telegram.ui.dh0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    dh0Var.L1.setImageDrawable(null);
                    dh0Var.u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131748085, null), new org.telegram.ui.bd0(8, dh0Var, str2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = dh0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    org.telegram.ui.ActionBar.u6.x(dh0Var.L1, mutate, org.telegram.ui.ActionBar.n6.v6, dh0Var.J0, PorterDuff.Mode.SRC_IN);
                    dh0Var.L1.setImageDrawable(mutate);
                    if (user4.contact) {
                        dh0Var.u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131748086, null), new org.telegram.ui.bd0(9, dh0Var, user4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        dh0Var.u1.setText(org.telegram.messenger.gd.N0(2131748084, null));
                    }
                }
                dh0Var.P0(false);
                break;
            case 22:
                ArrayList arrayList6 = (ArrayList) obj3;
                p9[] p9VarArr = (p9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        String str3 = (String) arrayList6.get(i13);
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
                            p9VarArr[i13].m(org.telegram.messenger.fc.b(document), "40_40", org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.j6.f(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 23:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.ci0) obj2).run();
                break;
            case 24:
                org.telegram.ui.zr0 zr0Var = (org.telegram.ui.zr0) obj3;
                org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) obj2;
                Long l14 = (Long) obj;
                zr0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l14.longValue() >= 0) {
                    bundle3.putLong("user_id", l14.longValue());
                } else {
                    bundle3.putLong("chat_id", -l14.longValue());
                }
                g2Var3.presentFragment(new ProfileActivity(bundle3, null));
                zr0Var.c(false);
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.Z6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().o2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.mo0(profileActivity, userFull, tL_birthday2, i10), 1024);
                break;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.Z6;
                ((org.telegram.ui.ActionBar.t1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    hi.nb D = hi.nb.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.O = a10;
                    hi.db dbVar = D.d1;
                    if (dbVar != null) {
                        dbVar.setDialogId(a10);
                    }
                    D.Q(null);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.yw0 yw0Var = (org.telegram.ui.yw0) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.q11.k(tL_messages_stickerSet2, str4);
                if (k10 == null) {
                    StringBuilder u10 = a8.p0.u("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.bx0.s;
                    org.telegram.messenger.a8.d(u10.toString());
                    break;
                } else {
                    org.telegram.ui.ax0 ax0Var = new org.telegram.ui.ax0(null);
                    yw0Var.c = ax0Var;
                    yw0Var.e.add(ax0Var);
                    int f11 = org.telegram.ui.mx.f();
                    yw0Var.c.X(0);
                    org.telegram.ui.ax0 ax0Var2 = yw0Var.c;
                    String str5 = f11 + "_" + f11 + "_precache";
                    org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0(yw0Var, 6);
                    ax0Var2.getClass();
                    ax0Var2.h1 = new org.telegram.ui.zw0(new Runnable[]{qu0Var});
                    ax0Var2.r0(org.telegram.messenger.fc.b(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    yw0Var.c.Q();
                    yw0Var.g[1] = true;
                    yw0Var.a();
                    break;
                }
            case 28:
                ((fi.e) obj3).a((HashSet) obj2);
                break;
            default:
                org.telegram.ui.sz0 sz0Var = (org.telegram.ui.sz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    sz0Var.getClass();
                    view2.setVisibility(0);
                }
                sz0Var.f = bitmap4;
                Paint paint2 = new Paint(1);
                sz0Var.n = paint2;
                Bitmap bitmap5 = sz0Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                sz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix4, org.telegram.ui.ActionBar.n6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix4, org.telegram.ui.ActionBar.n6.I.q() ? -0.02f : -0.04f);
                sz0Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                sz0Var.r = new Matrix();
                break;
        }
    }
}
