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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ph(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i7 = this.a;
        int i10 = 6;
        int i11 = 3;
        int i12 = 2;
        int i13 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                ((ki.t3) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                break;
            case 1:
                cj cjVar = (cj) obj3;
                org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) obj2;
                Long l10 = (Long) obj;
                cjVar.j0 = false;
                TLRPC.User c22 = l10 != null ? mpVar.c2(l10) : null;
                cjVar.i0 = c22;
                cjVar.k0 = c22 == null;
                if (c22 != null) {
                    cjVar.T();
                    break;
                }
                break;
            case 2:
                zu zuVar = (zu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.g3(new yu(zuVar, 1 == true ? 1 : 0));
                    break;
                }
                break;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                dw dwVar = (dw) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                dwVar.run();
                break;
            case 4:
                px pxVar = (px) obj3;
                qx qxVar = pxVar.a;
                ry ryVar = qxVar.G;
                org.telegram.messenger.ri.d0(ryVar.d1).X(ryVar.X0, qxVar.w, false, new rm(pxVar, (String) obj2, (Runnable) obj, i12), org.telegram.messenger.bz.F || org.telegram.messenger.j10.i(ryVar.d1).q(), false, true, false, 25);
                break;
            case 5:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                qx qxVar2 = ((px) obj3).a;
                if (ConnectionsManager.getInstance(qxVar2.G.d1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    qx.E(qxVar2, runnable, arrayList2, false);
                    break;
                }
            case 6:
                ly lyVar = (ly) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj4 = arrayList3.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(lyVar.x.R.d1).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = n02 != null ? n02.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        lyVar.n.add(new kx(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 7:
                g00 g00Var = (g00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                if (g00Var.W1 != null || (g00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    gc I = lc.b0(h2Var).I(R.raw.folder_in, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750610, g00Var.b2)), arrayList4.size() <= 0 ? org.telegram.messenger.gd.G(g00Var.d2.size(), "FolderLinkUpdatedSubtitle", new Object[0]) : org.telegram.messenger.gd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    gc I2 = lc.b0(h2Var).I(R.raw.contact_check, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750662, g00Var.b2)), org.telegram.messenger.gd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
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
            case 9:
                org.telegram.messenger.mp mpVar2 = (org.telegram.messenger.mp) obj3;
                t60 t60Var = (t60) obj2;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    mpVar2.Q4(true);
                    if (T != null) {
                        lc.b0(T).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(2131745379, null), new kd(i12, T)), true)).k(true);
                    }
                    t60Var.a(Boolean.TRUE);
                    break;
                } else if (T != null) {
                    lc.b0(T).I(R.raw.error, org.telegram.messenger.gd.M0(2131754309, null), org.telegram.messenger.gd.M0(2131754310, null)).j();
                    break;
                }
                break;
            case 10:
                gt0.a((gt0) obj3, (TL_stories.StoryItem) obj2, (fi.i6) obj);
                break;
            case 11:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj3;
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                j1Var.getClass();
                if (t0Var != null) {
                    t0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                j1Var.a();
                break;
            case 12:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj3;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj2;
                Long l13 = (Long) obj;
                nsVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                h2Var2.presentFragment(new ProfileActivity(bundle, null));
                nsVar.o();
                break;
            case 13:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) obj3;
                Boolean bool = (Boolean) obj;
                jsVar.getClass();
                ((org.telegram.messenger.x10) obj2).a(bool);
                if (bool.booleanValue()) {
                    jsVar.a.o();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    cxVar.showDialog(new org.telegram.ui.jh0(activity, !c8.na.a(), new org.telegram.ui.su(activity, 0)));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.im0 im0Var = (org.telegram.ui.im0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.kz kzVar = ((org.telegram.ui.hz) obj3).e;
                if (kzVar.getUserConfig().q()) {
                    int intValue = num.intValue();
                    kzVar.F = intValue;
                    im0Var.a(intValue, true);
                    org.telegram.ui.az azVar = kzVar.J;
                    if (azVar != null) {
                        azVar.d(!kzVar.getUserConfig().q() ? -1 : kzVar.F, true);
                    }
                    kzVar.o0(true);
                    break;
                } else {
                    kzVar.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) kzVar, 35, true));
                    break;
                }
            case 16:
                org.telegram.ui.q30 q30Var = (org.telegram.ui.q30) obj3;
                org.telegram.ui.uv uvVar = (org.telegram.ui.uv) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (uvVar != null) {
                    q30Var.getClass();
                    uvVar.setVisibility(0);
                }
                q30Var.c = bitmap2;
                Paint paint = new Paint(1);
                q30Var.d = paint;
                Bitmap bitmap3 = q30Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                q30Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix3, org.telegram.ui.ActionBar.n6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix3, org.telegram.ui.ActionBar.n6.I.q() ? -0.02f : -0.04f);
                q30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 17:
                org.telegram.ui.s90 s90Var = (org.telegram.ui.s90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                s90Var.c();
                if (user != null) {
                    long j13 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    s90Var.u(new org.telegram.ui.r90(bundle2, user, userArr, j13), false);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.vg0 vg0Var = (org.telegram.ui.vg0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = vg0Var.b2;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && vg0Var.e1(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = vg0Var.n2;
                if (bool2 == null || !bool2.booleanValue()) {
                    vg0Var.h1(true, true);
                    break;
                } else {
                    ph phVar = new ph(19, vg0Var, hashSet);
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.j10.t0);
                    if (str == null || str.isEmpty()) {
                        org.telegram.messenger.g0.g3(new v4.p(phVar, 6));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i13 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.e31(11, u12, phVar));
                    }
                    vg0Var.i2 = i13;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.vg0 vg0Var2 = (org.telegram.ui.vg0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && vg0Var2.e1(user3)) {
                            vg0Var2.b2.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                vg0Var2.h1(true, true);
                break;
            case 20:
                org.telegram.ui.fh0 fh0Var = (org.telegram.ui.fh0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    fh0Var.L1.setImageDrawable(null);
                    fh0Var.u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131748086, null), new org.telegram.ui.we0(i12, fh0Var, str2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = fh0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    org.telegram.ui.ActionBar.u6.x(fh0Var.L1, mutate, org.telegram.ui.ActionBar.n6.v6, fh0Var.J0, PorterDuff.Mode.SRC_IN);
                    fh0Var.L1.setImageDrawable(mutate);
                    if (user4.contact) {
                        fh0Var.u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131748087, null), new org.telegram.ui.we0(i11, fh0Var, user4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        fh0Var.u1.setText(org.telegram.messenger.gd.M0(2131748085, null));
                    }
                }
                fh0Var.P0(false);
                break;
            case 21:
                ArrayList arrayList6 = (ArrayList) obj3;
                q9[] q9VarArr = (q9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        String str3 = (String) arrayList6.get(i14);
                        int i15 = 0;
                        while (true) {
                            if (i15 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i15).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i15).emoticon, str3)) {
                                    i15++;
                                } else {
                                    long longValue = tL_messages_stickerSet.packs.get(i15).documents.get(0).longValue();
                                    for (int i16 = 0; i16 < tL_messages_stickerSet.documents.size(); i16++) {
                                        if (tL_messages_stickerSet.documents.get(i16).id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i16);
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            q9VarArr[i14].m(org.telegram.messenger.fc.b(document), "40_40", org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.j6.f(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 22:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.ei0) obj2).run();
                break;
            case 23:
                org.telegram.ui.as0 as0Var = (org.telegram.ui.as0) obj3;
                org.telegram.ui.ActionBar.h2 h2Var3 = (org.telegram.ui.ActionBar.h2) obj2;
                Long l14 = (Long) obj;
                as0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l14.longValue() >= 0) {
                    bundle3.putLong("user_id", l14.longValue());
                } else {
                    bundle3.putLong("chat_id", -l14.longValue());
                }
                h2Var3.presentFragment(new ProfileActivity(bundle3, null));
                as0Var.c(false);
                break;
            case 24:
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.mo0(profileActivity, userFull, tL_birthday2, i11), 1024);
                break;
            case 25:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.Z6;
                ((org.telegram.ui.ActionBar.u1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    hi.ta D = hi.ta.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.O = a10;
                    hi.ja jaVar = D.d1;
                    if (jaVar != null) {
                        jaVar.setDialogId(a10);
                    }
                    D.Q(null);
                    break;
                }
                break;
            case 26:
                org.telegram.ui.ax0 ax0Var = (org.telegram.ui.ax0) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.r11.k(tL_messages_stickerSet2, str4);
                if (k10 == null) {
                    StringBuilder u10 = a8.p0.u("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.dx0.s;
                    org.telegram.messenger.a8.d(u10.toString());
                    break;
                } else {
                    org.telegram.ui.cx0 cx0Var = new org.telegram.ui.cx0(null);
                    ax0Var.c = cx0Var;
                    ax0Var.e.add(cx0Var);
                    int f11 = org.telegram.ui.nx.f();
                    ax0Var.c.W(0);
                    org.telegram.ui.cx0 cx0Var2 = ax0Var.c;
                    String str5 = f11 + "_" + f11 + "_precache";
                    org.telegram.ui.ru0 ru0Var = new org.telegram.ui.ru0(ax0Var, i10);
                    cx0Var2.getClass();
                    cx0Var2.h1 = new org.telegram.ui.bx0(new Runnable[]{ru0Var});
                    cx0Var2.q0(org.telegram.messenger.fc.b(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    ax0Var.c.P();
                    ax0Var.g[1] = true;
                    ax0Var.a();
                    break;
                }
            case 27:
                ((fi.e) obj3).a((HashSet) obj2);
                break;
            case 28:
                org.telegram.ui.tz0 tz0Var = (org.telegram.ui.tz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    tz0Var.getClass();
                    view2.setVisibility(0);
                }
                tz0Var.f = bitmap4;
                Paint paint2 = new Paint(1);
                tz0Var.n = paint2;
                Bitmap bitmap5 = tz0Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                tz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix4, org.telegram.ui.ActionBar.n6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix4, org.telegram.ui.ActionBar.n6.I.q() ? -0.02f : -0.04f);
                tz0Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                tz0Var.r = new Matrix();
                break;
            default:
                org.telegram.ui.o31.c0((org.telegram.ui.o31) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
        }
    }
}
