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
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fx implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fx(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        v4.d1 K;
        int i7 = this.a;
        int i10 = 3;
        int i11 = 6;
        int i12 = 11;
        int i13 = 2;
        Object obj2 = null;
        int i14 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj;
                hx hxVar = ((gx) obj4).a;
                if (ConnectionsManager.getInstance(hxVar.F.c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    hx.E(hxVar, runnable, arrayList2, false);
                    return;
                }
            case 1:
                ay ayVar = (ay) obj4;
                Runnable runnable2 = (Runnable) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i14 < size) {
                    Object obj5 = arrayList3.get(i14);
                    i14++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(ayVar.x.Q.c1).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = l02 != null ? l02.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ayVar.n.add(new zw(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 2:
                wz wzVar = (wz) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                if (wzVar.S1 != null || (wzVar.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    cc I = hc.a0(f2Var).I(R.raw.folder_in, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750626, wzVar.X1)), arrayList4.size() <= 0 ? org.telegram.messenger.id.G(wzVar.Z1.size(), "FolderLinkUpdatedSubtitle", new Object[0]) : org.telegram.messenger.id.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    return;
                } else {
                    cc I2 = hc.a0(f2Var).I(R.raw.contact_check, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750678, wzVar.X1)), org.telegram.messenger.id.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I2.j = 5000;
                    I2.j();
                    return;
                }
            case 3:
                View view = (View) obj4;
                d dVar = (d) obj3;
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
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.l6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.l6.I.q() ? -0.04f : -0.07f);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.l6.I.q() ? 2.0f : 3.0f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.l6.I.q() ? -0.2f : -0.07f);
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                dVar.a(l10, l11);
                return;
            case 4:
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) obj4;
                op0 op0Var = (op0) obj3;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (!((Boolean) obj).booleanValue()) {
                    if (T != null) {
                        hc.a0(T).I(R.raw.error, org.telegram.messenger.id.M0(2131754311, null), org.telegram.messenger.id.M0(2131754312, null)).j();
                        return;
                    }
                    return;
                } else {
                    qpVar.F4(true);
                    if (T != null) {
                        hc.a0(T).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131745574, null), new dd(i13, T)), true)).k(true);
                    }
                    op0Var.a(Boolean.TRUE);
                    return;
                }
            case 5:
                zs0.a((zs0) obj4, (TL_stories.StoryItem) obj3, (di.s6) obj);
                return;
            case 6:
                t01 t01Var = (t01) obj4;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = t01Var.M;
                t01Var.N = 0;
                if (((String) obj3).equals(t01Var.L)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    t01Var.h();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) obj4;
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) obj3;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                g1Var.getClass();
                if (q0Var != null) {
                    q0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                g1Var.a();
                return;
            case 8:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) obj4;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj3;
                Long l12 = (Long) obj;
                msVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                f2Var2.presentFragment(new ProfileActivity(bundle, null));
                msVar.o();
                return;
            case 9:
                org.telegram.ui.is isVar = (org.telegram.ui.is) obj4;
                Boolean bool = (Boolean) obj;
                isVar.getClass();
                ((org.telegram.messenger.c20) obj3).a(bool);
                if (bool.booleanValue()) {
                    isVar.a.o();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj4;
                Activity activity = (Activity) obj3;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ywVar.showDialog(new org.telegram.ui.fh0(activity, !c8.ia.a(), new org.telegram.ui.tu(activity, 0)));
                return;
            case 11:
                org.telegram.ui.gm0 gm0Var = (org.telegram.ui.gm0) obj3;
                Integer num = (Integer) obj;
                org.telegram.ui.iz izVar = ((org.telegram.ui.fz) obj4).e;
                if (!izVar.getUserConfig().q()) {
                    izVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) izVar, 35, true));
                    return;
                }
                int intValue = num.intValue();
                izVar.E = intValue;
                gm0Var.a(intValue, true);
                org.telegram.ui.yy yyVar = izVar.I;
                if (yyVar != null) {
                    yyVar.d(!izVar.getUserConfig().q() ? -1 : izVar.E, true);
                }
                izVar.o0(true);
                return;
            case 12:
                org.telegram.ui.p30 p30Var = (org.telegram.ui.p30) obj4;
                org.telegram.ui.n00 n00Var = (org.telegram.ui.n00) obj3;
                Bitmap bitmap2 = (Bitmap) obj;
                if (n00Var != null) {
                    p30Var.getClass();
                    n00Var.setVisibility(0);
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
                org.telegram.messenger.g0.i(colorMatrix3, org.telegram.ui.ActionBar.l6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix3, org.telegram.ui.ActionBar.l6.I.q() ? -0.02f : -0.04f);
                p30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 13:
                org.telegram.ui.r90 r90Var = (org.telegram.ui.r90) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                r90Var.c();
                if (user == null) {
                    return;
                }
                long j13 = userArr[0].id;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                r90Var.u(new org.telegram.ui.q90(bundle2, user, userArr, j13), false);
                return;
            case 14:
                org.telegram.ui.sg0 sg0Var = (org.telegram.ui.sg0) obj4;
                String str = (String) obj3;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = sg0Var.X1;
                arrayList7.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && sg0Var.d1(user2)) {
                            arrayList7.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = sg0Var.j2;
                if (bool2 == null || !bool2.booleanValue()) {
                    sg0Var.g1(true, true);
                    return;
                }
                fx fxVar = new fx(15, sg0Var, hashSet);
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.s0);
                if (str == null || str.isEmpty()) {
                    org.telegram.messenger.g0.h3(new sh.b(fxVar, 28));
                } else {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    i14 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.o41(9, s12, fxVar));
                }
                sg0Var.e2 = i14;
                return;
            case 15:
                org.telegram.ui.sg0 sg0Var2 = (org.telegram.ui.sg0) obj4;
                HashSet hashSet2 = (HashSet) obj3;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && sg0Var2.d1(user3)) {
                            sg0Var2.X1.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                sg0Var2.g1(true, true);
                return;
            case 16:
                org.telegram.ui.ch0 ch0Var = (org.telegram.ui.ch0) obj4;
                String str2 = (String) obj3;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    ch0Var.H1.setImageDrawable(null);
                    ch0Var.q1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131748278, null), new org.telegram.ui.bd0(i12, ch0Var, str2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = ch0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    org.telegram.ui.ActionBar.s6.x(ch0Var.H1, mutate, org.telegram.ui.ActionBar.l6.v6, ch0Var.I0, PorterDuff.Mode.SRC_IN);
                    ch0Var.H1.setImageDrawable(mutate);
                    if (user4.contact) {
                        ch0Var.q1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131748279, null), new org.telegram.ui.bd0(12, ch0Var, user4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        ch0Var.q1.setText(org.telegram.messenger.id.M0(2131748277, null));
                    }
                }
                ch0Var.O0(false);
                return;
            case 17:
                ArrayList arrayList8 = (ArrayList) obj3;
                l9[] l9VarArr = (l9[]) obj4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                    return;
                }
                for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                    String str3 = (String) arrayList8.get(i15);
                    int i16 = 0;
                    while (true) {
                        if (i16 < tL_messages_stickerSet.packs.size()) {
                            if (tL_messages_stickerSet.packs.get(i16).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i16).emoticon, str3)) {
                                i16++;
                            } else {
                                long longValue = tL_messages_stickerSet.packs.get(i16).documents.get(0).longValue();
                                for (int i17 = 0; i17 < tL_messages_stickerSet.documents.size(); i17++) {
                                    if (tL_messages_stickerSet.documents.get(i17).id == longValue) {
                                        document = tL_messages_stickerSet.documents.get(i17);
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document != null) {
                        l9VarArr[i15].m(org.telegram.messenger.hc.b(document), "40_40", org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.i6.f(str3), null);
                    }
                }
                return;
            case 18:
                ((String[]) obj4)[0] = (String) obj;
                ((org.telegram.ui.bi0) obj3).run();
                return;
            case 19:
                org.telegram.ui.bs0 bs0Var = (org.telegram.ui.bs0) obj4;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) obj3;
                Long l13 = (Long) obj;
                bs0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle3.putLong("user_id", l13.longValue());
                } else {
                    bundle3.putLong("chat_id", -l13.longValue());
                }
                f2Var3.presentFragment(new ProfileActivity(bundle3, null));
                bs0Var.c(false);
                return;
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.V6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().m2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.no0(profileActivity, userFull, tL_birthday2, i10), 1024);
                return;
            case 21:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                RectF rectF2 = ProfileActivity.V6;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    fi.va D = fi.va.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.N = a10;
                    fi.la laVar = D.c1;
                    if (laVar != null) {
                        laVar.setDialogId(a10);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.bx0 bx0Var = (org.telegram.ui.bx0) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.s11.k(tL_messages_stickerSet2, str4);
                if (k10 == null) {
                    StringBuilder u10 = a8.p0.u("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.ex0.s;
                    org.telegram.messenger.a8.d(u10.toString());
                    return;
                }
                org.telegram.ui.dx0 dx0Var = new org.telegram.ui.dx0(null);
                bx0Var.c = dx0Var;
                bx0Var.e.add(dx0Var);
                int f11 = org.telegram.ui.kx.f();
                bx0Var.c.W(0);
                org.telegram.ui.dx0 dx0Var2 = bx0Var.c;
                String str5 = f11 + "_" + f11 + "_precache";
                org.telegram.ui.tu0 tu0Var = new org.telegram.ui.tu0(bx0Var, i11);
                dx0Var2.getClass();
                dx0Var2.g1 = new org.telegram.ui.cx0(new Runnable[]{tu0Var});
                dx0Var2.q0(org.telegram.messenger.hc.b(k10), str5, null, null, tL_messages_stickerSet2, 0);
                bx0Var.c.P();
                bx0Var.g[1] = true;
                bx0Var.a();
                return;
            case 23:
                ((di.e) obj4).a((HashSet) obj3);
                return;
            case 24:
                org.telegram.ui.uz0 uz0Var = (org.telegram.ui.uz0) obj4;
                View view2 = (View) obj3;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    uz0Var.getClass();
                    view2.setVisibility(0);
                }
                uz0Var.f = bitmap4;
                Paint paint2 = new Paint(1);
                uz0Var.n = paint2;
                Bitmap bitmap5 = uz0Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                uz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix4, org.telegram.ui.ActionBar.l6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix4, org.telegram.ui.ActionBar.l6.I.q() ? -0.02f : -0.04f);
                uz0Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                uz0Var.r = new Matrix();
                return;
            case 25:
                org.telegram.ui.n31.c0((org.telegram.ui.n31) obj4, (TLRPC.TL_attachMenuBot) obj3);
                return;
            case 26:
                ThemeActivity themeActivity = (ThemeActivity) obj4;
                AtomicReference atomicReference = (AtomicReference) obj3;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                org.telegram.messenger.iz.u0 = false;
                org.telegram.messenger.iz.y();
                themeActivity.N0 = true;
                ((Dialog) atomicReference.get()).dismiss();
                qj0 qj0Var = themeActivity.b;
                if (qj0Var == null || !qj0Var.G || (K = qj0Var.K(themeActivity.M)) == null) {
                    return;
                }
                themeActivity.a.t(K, themeActivity.M);
                return;
            case 27:
                ThemeActivity themeActivity2 = (ThemeActivity) obj4;
                org.telegram.ui.ax0 ax0Var = (org.telegram.ui.ax0) obj3;
                if (((Boolean) obj).booleanValue()) {
                    ax0Var.run();
                    return;
                } else {
                    hc.a0(themeActivity2).I(R.raw.error, org.telegram.messenger.id.M0(2131754311, null), org.telegram.messenger.id.M0(2131754312, null)).j();
                    return;
                }
            case 28:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj4;
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) obj3;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.l0.j("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    i8Var.a(str6);
                    return;
                } else {
                    org.telegram.ui.Wallet.l0.H("sending disableBackup to server");
                    org.telegram.ui.Wallet.g3.a(l0Var.a, new ai.c0(i12), null, null, null, new di.b0(i11, l0Var, i8Var), true, true, new bg.v0(obj2, i13));
                    return;
                }
            default:
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj4;
                try {
                    ((org.telegram.messenger.c20) obj3).a((String) obj);
                    if (i0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
        }
    }

    public /* synthetic */ fx(ArrayList arrayList, l9[] l9VarArr) {
        this.a = 17;
        this.c = arrayList;
        this.b = l9VarArr;
    }
}
