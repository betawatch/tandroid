package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vg(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 5;
        int i13 = 3;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                bi biVar = (bi) obj3;
                vh vhVar = (vh) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i17 = biVar.D3;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.wp.r1(i17).n1(vhVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i17).sendRequest(tL_messages_toggleBotInAttachMenu, new ag.k0(26, biVar, vhVar), 66);
                break;
            case 1:
                bi biVar2 = (bi) obj3;
                ((org.telegram.ui.un) obj2).w5 = (org.telegram.messenger.pj) obj;
                boolean t12 = biVar2.t1(true, 0, 0, biVar2.H2, biVar2.e1());
                pe peVar = biVar2.Y1;
                if (peVar != null) {
                    peVar.g(!t12);
                    biVar2.Y1 = null;
                    break;
                }
                break;
            case 2:
                ((xh.j3) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                break;
            case 3:
                mi miVar = (mi) obj3;
                org.telegram.messenger.wp wpVar = (org.telegram.messenger.wp) obj2;
                Long l4 = (Long) obj;
                miVar.i0 = false;
                TLRPC.User Z1 = l4 != null ? wpVar.Z1(l4) : null;
                miVar.h0 = Z1;
                miVar.j0 = Z1 == null;
                if (Z1 != null) {
                    miVar.R();
                    break;
                }
                break;
            case 4:
                bl blVar = ((yk) obj3).b;
                blVar.u0.d(((al) obj2).c, blVar.v0, true, 0, ((Long) obj).longValue());
                blVar.b.a(true);
                break;
            case 5:
                av avVar = (av) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.i0.g3(new zu(avVar, i16));
                    break;
                }
                break;
            case 6:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                at atVar = (at) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                atVar.run();
                break;
            case 7:
                tx txVar = (tx) obj3;
                ux uxVar = txVar.a;
                vy vyVar = uxVar.F;
                org.telegram.messenger.vi.b0(vyVar.c1).V(vyVar.W0, uxVar.w, false, new androidx.car.app.utils.a(txVar, (String) obj2, (Runnable) obj), org.telegram.messenger.uz.F || org.telegram.messenger.e20.i(vyVar.c1).q(), false, true, false, 25);
                break;
            case 8:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                ux uxVar2 = ((tx) obj3).a;
                if (ConnectionsManager.getInstance(uxVar2.F.c1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    ux.E(uxVar2, runnable, arrayList2, false);
                    break;
                }
            case 9:
                py pyVar = (py) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i15 < size) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.vi.b0(pyVar.x.Q.c1).l0(org.telegram.messenger.vi.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = l02 != null ? l02.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        pyVar.n.add(new nx(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 10:
                j00 j00Var = (j00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                if (j00Var.S1 != null || (j00Var.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    wb I = cc.a0(k2Var).I(R.raw.folder_in, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131750627, j00Var.X1)), arrayList4.size() <= 0 ? org.telegram.messenger.dd.G(j00Var.Z1.size(), "FolderLinkUpdatedSubtitle", new Object[0]) : org.telegram.messenger.dd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    wb I2 = cc.a0(k2Var).I(R.raw.contact_check, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131750679, j00Var.X1)), org.telegram.messenger.dd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I2.j = 5000;
                    I2.j();
                    break;
                }
            case 11:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    float f7 = iArr[0];
                    Point point = org.telegram.messenger.i0.q;
                    int j10 = Utilities.j((int) ((f7 / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j11 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.i0.m) + org.telegram.messenger.i0.n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j12 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j10, 0);
                    int j13 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.i0.m) + org.telegram.messenger.i0.n)) * bitmap.getHeight()), bitmap.getHeight() - j11, 0);
                    if ((j10 != 0 || j11 != 0 || j12 != bitmap.getWidth() || j13 != bitmap.getHeight()) && j12 > 0 && j13 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j10, j11, j12, j13);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix, org.telegram.ui.ActionBar.t6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.i0.h(colorMatrix, org.telegram.ui.ActionBar.t6.I.q() ? -0.04f : -0.07f);
                Bitmap l10 = org.telegram.messenger.i0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.t6.I.q() ? 2.0f : 3.0f);
                org.telegram.messenger.i0.h(colorMatrix2, org.telegram.ui.ActionBar.t6.I.q() ? -0.2f : -0.07f);
                Bitmap l11 = org.telegram.messenger.i0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                dVar.a(l10, l11);
                break;
            case 12:
                org.telegram.messenger.wp wpVar2 = (org.telegram.messenger.wp) obj3;
                qq0 qq0Var = (qq0) obj2;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    wpVar2.C4(true);
                    if (T != null) {
                        cc.a0(T).P(R.raw.chats_infotip, org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(org.telegram.messenger.dd.L0(2131745591, null), new wc(i11, T)), true)).k(true);
                    }
                    qq0Var.a(Boolean.TRUE);
                    break;
                } else if (T != null) {
                    cc.a0(T).I(R.raw.error, org.telegram.messenger.dd.L0(2131754311, null), org.telegram.messenger.dd.L0(2131754312, null)).j();
                    break;
                }
                break;
            case 13:
                au0.a((au0) obj3, (TL_stories.StoryItem) obj2, (th.y4) obj);
                break;
            case 14:
                u11 u11Var = (u11) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = u11Var.M;
                u11Var.N = 0;
                if (((String) obj2).equals(u11Var.L)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    u11Var.g();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj3;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                Long l12 = (Long) obj;
                ktVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                k2Var2.presentFragment(new ProfileActivity(bundle, null));
                ktVar.o();
                break;
            case 16:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) obj3;
                Boolean bool = (Boolean) obj;
                ftVar.getClass();
                ((org.telegram.messenger.r20) obj2).a(bool);
                if (bool.booleanValue()) {
                    ftVar.a.o();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.zx zxVar = (org.telegram.ui.zx) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    zxVar.showDialog(new org.telegram.ui.hi0(activity, !w7.c6.a(), new org.telegram.ui.uv(activity, 0)));
                    break;
                }
                break;
            case 18:
                org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.h00 h00Var = ((org.telegram.ui.e00) obj3).e;
                if (h00Var.getUserConfig().q()) {
                    int intValue = num.intValue();
                    h00Var.E = intValue;
                    on0Var.a(intValue, true);
                    org.telegram.ui.xz xzVar = h00Var.I;
                    if (xzVar != null) {
                        xzVar.d(h00Var.getUserConfig().q() ? h00Var.E : -1, true);
                    }
                    h00Var.o0(true);
                    break;
                } else {
                    h00Var.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) h00Var, 35, true));
                    break;
                }
            case 19:
                org.telegram.ui.l40 l40Var = (org.telegram.ui.l40) obj3;
                bi.t0 t0Var = (bi.t0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (t0Var != null) {
                    l40Var.getClass();
                    t0Var.setVisibility(0);
                }
                l40Var.c = bitmap2;
                Paint paint = new Paint(1);
                l40Var.d = paint;
                Bitmap bitmap3 = l40Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                l40Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix3, org.telegram.ui.ActionBar.t6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.i0.h(colorMatrix3, org.telegram.ui.ActionBar.t6.I.q() ? -0.02f : -0.04f);
                l40Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 20:
                org.telegram.ui.ta0 ta0Var = (org.telegram.ui.ta0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ta0Var.c();
                if (user != null) {
                    long j14 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    ta0Var.u(new org.telegram.ui.sa0(bundle2, user, userArr, j14), false);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.uh0 uh0Var = (org.telegram.ui.uh0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = uh0Var.X1;
                arrayList7.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && uh0Var.d1(user2)) {
                            arrayList7.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = uh0Var.j2;
                if (bool2 == null || !bool2.booleanValue()) {
                    uh0Var.g1(true, true);
                    break;
                } else {
                    vg vgVar = new vg(22, uh0Var, hashSet);
                    org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.e20.s0);
                    if (str == null || str.isEmpty()) {
                        org.telegram.messenger.i0.g3(new lg.s(vgVar, 7));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i14 = connectionsManager.sendRequest(tL_contacts_search, new ag.k0(i12, r12, vgVar));
                    }
                    uh0Var.e2 = i14;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.uh0 uh0Var2 = (org.telegram.ui.uh0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && uh0Var2.d1(user3)) {
                            uh0Var2.X1.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                uh0Var2.g1(true, true);
                break;
            case 23:
                org.telegram.ui.ei0 ei0Var = (org.telegram.ui.ei0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    ei0Var.H1.setImageDrawable(null);
                    ei0Var.q1.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.R2("This phone number is not on Telegram. **Invite >**", -1, 0, new org.telegram.ui.if0(4, ei0Var, str2), null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
                } else {
                    Drawable mutate = ei0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    org.telegram.ui.ActionBar.a7.y(ei0Var.H1, mutate, org.telegram.ui.ActionBar.t6.v6, ei0Var.I0, PorterDuff.Mode.SRC_IN);
                    ei0Var.H1.setImageDrawable(mutate);
                    if (user4.contact) {
                        ei0Var.q1.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.R2("This phone number is already in your contacts. **View >**", -1, 0, new org.telegram.ui.if0(i12, ei0Var, user4), null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
                    } else {
                        ei0Var.q1.setText("This phone number is on Telegram.");
                    }
                }
                ei0Var.O0(false);
                break;
            case 24:
                ArrayList arrayList8 = (ArrayList) obj3;
                g9[] g9VarArr = (g9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i18 = 0; i18 < arrayList8.size(); i18++) {
                        String str3 = (String) arrayList8.get(i18);
                        int i19 = 0;
                        while (true) {
                            if (i19 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i19).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i19).emoticon, str3)) {
                                    i19++;
                                } else {
                                    long longValue = tL_messages_stickerSet.packs.get(i19).documents.get(0).longValue();
                                    for (int i20 = 0; i20 < tL_messages_stickerSet.documents.size(); i20++) {
                                        if (tL_messages_stickerSet.documents.get(i20).id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i20);
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            g9VarArr[i18].m(org.telegram.messenger.jc.b(document), "40_40", org.telegram.messenger.jc.c(org.telegram.messenger.b8.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.k6.f(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 25:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.fj0) obj2).run();
                break;
            case 26:
                org.telegram.ui.jt0 jt0Var = (org.telegram.ui.jt0) obj3;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) obj2;
                Long l13 = (Long) obj;
                jt0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle3.putLong("user_id", l13.longValue());
                } else {
                    bundle3.putLong("chat_id", -l13.longValue());
                }
                k2Var3.presentFragment(new ProfileActivity(bundle3, null));
                jt0Var.c(false);
                break;
            case 27:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.S6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().l2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.tp0(profileActivity, userFull, tL_birthday2, i13), 1024);
                break;
            case 28:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.S6;
                ((org.telegram.ui.ActionBar.x1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    vh.o8 D = vh.o8.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    vh.e8 e8Var = D.c1;
                    if (e8Var != null) {
                        e8Var.setDialogId(a2);
                    }
                    D.Q(null);
                    break;
                }
                break;
            default:
                org.telegram.ui.ky0 ky0Var = (org.telegram.ui.ky0) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.g31.k(tL_messages_stickerSet2, str4);
                if (k10 == null) {
                    StringBuilder u10 = a1.g.u("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.ny0.s;
                    org.telegram.messenger.f8.d(u10.toString());
                    break;
                } else {
                    org.telegram.ui.my0 my0Var = new org.telegram.ui.my0(null);
                    ky0Var.c = my0Var;
                    ky0Var.e.add(my0Var);
                    int f10 = org.telegram.ui.ky.f();
                    ky0Var.c.W(0);
                    org.telegram.ui.my0 my0Var2 = ky0Var.c;
                    String str5 = f10 + "_" + f10 + "_precache";
                    org.telegram.ui.vv0 vv0Var = new org.telegram.ui.vv0(ky0Var, 8);
                    my0Var2.getClass();
                    my0Var2.g1 = new org.telegram.ui.ly0(new Runnable[]{vv0Var});
                    my0Var2.q0(org.telegram.messenger.jc.b(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    ky0Var.c.P();
                    ky0Var.g[1] = true;
                    ky0Var.a();
                    break;
                }
        }
    }
}
