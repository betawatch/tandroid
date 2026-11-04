package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
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
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ei(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        u4.d1 K;
        int i3 = this.a;
        int i10 = 2;
        int i11 = 3;
        int i12 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i3) {
            case 0:
                ni niVar = (ni) obj3;
                org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) obj2;
                Long l10 = (Long) obj;
                niVar.j0 = false;
                TLRPC.User a22 = l10 != null ? hpVar.a2(l10) : null;
                niVar.i0 = a22;
                niVar.k0 = a22 == null;
                if (a22 != null) {
                    niVar.S();
                    break;
                }
                break;
            case 1:
                nu nuVar = (nu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.h3(new mu(nuVar, 1 == true ? 1 : 0));
                    break;
                }
                break;
            case 2:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                cl clVar = (cl) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                clVar.run();
                break;
            case 3:
                dx dxVar = (dx) obj3;
                ex exVar = dxVar.a;
                ey eyVar = exVar.G;
                org.telegram.messenger.li.b0(eyVar.d1).V(eyVar.X0, exVar.w, false, new hr(dxVar, (String) obj2, (Runnable) obj, 1 == true ? 1 : 0), org.telegram.messenger.az.F || org.telegram.messenger.h10.i(eyVar.d1).q(), false, true, false, 25);
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                ex exVar2 = ((dx) obj3).a;
                if (ConnectionsManager.getInstance(exVar2.G.d1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    ex.E(exVar2, runnable, arrayList2, false);
                    break;
                }
            case 5:
                xx xxVar = (xx) obj3;
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
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(xxVar.x.R.d1).l0(org.telegram.messenger.li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = l02 != null ? l02.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        xxVar.n.add(new xw(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 6:
                rz rzVar = (rz) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (rzVar.T1 != null || (rzVar.S1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    ac I = fc.a0(d2Var).I(R.raw.folder_in, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750627, rzVar.Y1)), arrayList4.size() <= 0 ? org.telegram.messenger.bd.G(rzVar.a2.size(), "FolderLinkUpdatedSubtitle", new Object[0]) : org.telegram.messenger.bd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    ac I2 = fc.a0(d2Var).I(R.raw.contact_check, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750679, rzVar.Y1)), org.telegram.messenger.bd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I2.j = 5000;
                    I2.j();
                    break;
                }
            case 7:
                View view = (View) obj3;
                e eVar = (e) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    float f10 = iArr[0];
                    Point point = org.telegram.messenger.g0.q;
                    int j10 = Utilities.j((int) ((f10 / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j11 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.g0.m) + org.telegram.messenger.g0.n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j12 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j10, 0);
                    int j13 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.g0.m) + org.telegram.messenger.g0.n)) * bitmap.getHeight()), bitmap.getHeight() - j11, 0);
                    if ((j10 != 0 || j11 != 0 || j12 != bitmap.getWidth() || j13 != bitmap.getHeight()) && j12 > 0 && j13 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j10, j11, j12, j13);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? -0.04f : -0.07f);
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l11.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.k6.I.q() ? 2.0f : 3.0f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? -0.2f : -0.07f);
                Bitmap l12 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l12.setHasAlpha(false);
                bitmap.recycle();
                eVar.a(l11, l12);
                break;
            case 8:
                org.telegram.messenger.hp hpVar2 = (org.telegram.messenger.hp) obj2;
                op0 op0Var = (op0) obj3;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    hpVar2.F4(true);
                    if (T != null) {
                        fc.a0(T).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131745584, null), new bd(i10, T)), true)).k(true);
                    }
                    op0Var.a(Boolean.TRUE);
                    break;
                } else if (T != null) {
                    fc.a0(T).I(R.raw.error, org.telegram.messenger.bd.M0(2131754311, null), org.telegram.messenger.bd.M0(2131754312, null)).j();
                    break;
                }
                break;
            case 9:
                ws0.a((ws0) obj3, (TL_stories.StoryItem) obj2, (ei.s6) obj);
                break;
            case 10:
                n01 n01Var = (n01) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = n01Var.N;
                n01Var.O = 0;
                if (((String) obj2).equals(n01Var.M)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    n01Var.g();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.is isVar = (org.telegram.ui.is) obj3;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                Long l13 = (Long) obj;
                isVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                d2Var2.presentFragment(new ProfileActivity(bundle, null));
                isVar.o();
                break;
            case 12:
                org.telegram.ui.es esVar = (org.telegram.ui.es) obj3;
                Boolean bool = (Boolean) obj;
                esVar.getClass();
                ((org.telegram.messenger.u10) obj2).a(bool);
                if (bool.booleanValue()) {
                    esVar.a.o();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    uwVar.showDialog(new org.telegram.ui.zg0(activity, !b8.nf.a(), new org.telegram.ui.ou(activity, 0)));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.zl0 zl0Var = (org.telegram.ui.zl0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.ez ezVar = ((org.telegram.ui.bz) obj3).e;
                if (ezVar.getUserConfig().q()) {
                    int intValue = num.intValue();
                    ezVar.F = intValue;
                    zl0Var.a(intValue, true);
                    org.telegram.ui.ty tyVar = ezVar.J;
                    if (tyVar != null) {
                        tyVar.d(!ezVar.getUserConfig().q() ? -1 : ezVar.F, true);
                    }
                    ezVar.o0(true);
                    break;
                } else {
                    ezVar.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) ezVar, 35, true));
                    break;
                }
            case 15:
                org.telegram.ui.i30 i30Var = (org.telegram.ui.i30) obj3;
                org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (r0Var != null) {
                    i30Var.getClass();
                    r0Var.setVisibility(0);
                }
                i30Var.c = bitmap2;
                Paint paint = new Paint(1);
                i30Var.d = paint;
                Bitmap bitmap3 = i30Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                i30Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix3, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix3, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                i30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 16:
                org.telegram.ui.m90 m90Var = (org.telegram.ui.m90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                m90Var.c();
                if (user != null) {
                    long j14 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    m90Var.u(new org.telegram.ui.l90(bundle2, user, userArr, j14), false);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.kg0 kg0Var = (org.telegram.ui.kg0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = kg0Var.Y1;
                arrayList7.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && kg0Var.d1(user2)) {
                            arrayList7.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = kg0Var.k2;
                if (bool2 == null || !bool2.booleanValue()) {
                    kg0Var.g1(true, true);
                    break;
                } else {
                    ei eiVar = new ei(18, kg0Var, hashSet);
                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.h10.t0);
                    if (str == null || str.isEmpty()) {
                        org.telegram.messenger.g0.h3(new xf.c(eiVar, i11));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.m21(12, s12, eiVar));
                    }
                    kg0Var.f2 = i12;
                    break;
                }
                break;
            case 18:
                org.telegram.ui.kg0 kg0Var2 = (org.telegram.ui.kg0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && kg0Var2.d1(user3)) {
                            kg0Var2.Y1.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                kg0Var2.g1(true, true);
                break;
            case 19:
                org.telegram.ui.vg0 vg0Var = (org.telegram.ui.vg0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    vg0Var.I1.setImageDrawable(null);
                    vg0Var.r1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131748286, null), new org.telegram.ui.tb0(15, vg0Var, str2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = vg0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    org.telegram.ui.ActionBar.r6.y(vg0Var.I1, mutate, org.telegram.ui.ActionBar.k6.v6, vg0Var.J0, PorterDuff.Mode.SRC_IN);
                    vg0Var.I1.setImageDrawable(mutate);
                    if (user4.contact) {
                        vg0Var.r1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131748287, null), new org.telegram.ui.tb0(16, vg0Var, user4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        vg0Var.r1.setText(org.telegram.messenger.bd.M0(2131748285, null));
                    }
                }
                vg0Var.O0(false);
                break;
            case 20:
                ArrayList arrayList8 = (ArrayList) obj3;
                k9[] k9VarArr = (k9[]) obj2;
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
                            k9VarArr[i13].m(org.telegram.messenger.ac.b(document), "40_40", org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.i6.f(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 21:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.wh0) obj2).run();
                break;
            case 22:
                org.telegram.ui.pr0 pr0Var = (org.telegram.ui.pr0) obj3;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj2;
                Long l14 = (Long) obj;
                pr0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l14.longValue() >= 0) {
                    bundle3.putLong("user_id", l14.longValue());
                } else {
                    bundle3.putLong("chat_id", -l14.longValue());
                }
                d2Var3.presentFragment(new ProfileActivity(bundle3, null));
                pr0Var.c(false);
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.T6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().m2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.co0(profileActivity, userFull, tL_birthday2, i11), 1024);
                break;
            case 24:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.T6;
                ((org.telegram.ui.ActionBar.s1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    gi.va D = gi.va.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.O = a10;
                    gi.la laVar = D.d1;
                    if (laVar != null) {
                        laVar.setDialogId(a10);
                    }
                    D.Q(null);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.pw0 pw0Var = (org.telegram.ui.pw0) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.g11.k(tL_messages_stickerSet2, str4);
                if (k10 == null) {
                    StringBuilder u10 = a1.g.u("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.sw0.s;
                    org.telegram.messenger.a8.d(u10.toString());
                    break;
                } else {
                    org.telegram.ui.rw0 rw0Var = new org.telegram.ui.rw0(null);
                    pw0Var.c = rw0Var;
                    pw0Var.e.add(rw0Var);
                    int f11 = org.telegram.ui.fx.f();
                    pw0Var.c.W(0);
                    org.telegram.ui.rw0 rw0Var2 = pw0Var.c;
                    String str5 = f11 + "_" + f11 + "_precache";
                    org.telegram.ui.pu0 pu0Var = new org.telegram.ui.pu0(pw0Var, 5);
                    rw0Var2.getClass();
                    rw0Var2.h1 = new org.telegram.ui.qw0(new Runnable[]{pu0Var});
                    rw0Var2.q0(org.telegram.messenger.ac.b(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    pw0Var.c.P();
                    pw0Var.g[1] = true;
                    pw0Var.a();
                    break;
                }
            case 26:
                ((ei.e) obj3).a((HashSet) obj2);
                break;
            case 27:
                org.telegram.ui.iz0 iz0Var = (org.telegram.ui.iz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    iz0Var.getClass();
                    view2.setVisibility(0);
                }
                iz0Var.f = bitmap4;
                Paint paint2 = new Paint(1);
                iz0Var.n = paint2;
                Bitmap bitmap5 = iz0Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                iz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix4, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix4, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                iz0Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                iz0Var.r = new Matrix();
                break;
            case 28:
                org.telegram.ui.c31.c0((org.telegram.ui.c31) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.messenger.az.u0 = false;
                    org.telegram.messenger.az.y();
                    themeActivity.O0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    tj0 tj0Var = themeActivity.b;
                    if (tj0Var != null && tj0Var.H && (K = tj0Var.K(themeActivity.N)) != null) {
                        themeActivity.a.t(K, themeActivity.N);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ei(org.telegram.messenger.hp hpVar, op0 op0Var) {
        this.a = 8;
        this.c = hpVar;
        this.b = op0Var;
    }
}
