// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class l77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l77(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    private final void a() {
        boolean z;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.d;
        Uri uri = (Uri) this.e;
        int i = this.b;
        id idVar = (id) this.f;
        String str = LaunchActivity.C1;
        if (launchActivity.isFinishing()) {
            return;
        }
        if (tLObject == null || launchActivity.p0 == null) {
            ArrayList arrayList = launchActivity.X;
            if (arrayList == null) {
                arrayList = new ArrayList();
                launchActivity.X = arrayList;
            }
            arrayList.add(0, launchActivity.Y);
            launchActivity.Y = null;
            launchActivity.j0(true);
        } else {
            TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
            Bundle l = bs2.l("onlySelect", true);
            l.putString("importTitle", tL_messages_historyImportParsed.title);
            l.putBoolean("allowSwitchAccount", true);
            if (tL_messages_historyImportParsed.pm) {
                l.putInt("dialogsType", 12);
            } else if (tL_messages_historyImportParsed.group) {
                l.putInt("dialogsType", 11);
            } else {
                String uri2 = uri.toString();
                Iterator it = uc7.s1(i).k4.N3.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (uri2.contains((String) it.next())) {
                        l.putInt("dialogsType", 12);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Iterator it2 = uc7.s1(i).k4.M3.f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (uri2.contains((String) it2.next())) {
                            l.putInt("dialogsType", 11);
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        l.putInt("dialogsType", 13);
                    }
                }
            }
            if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                SecretMediaViewer.d().c(false, false);
            } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
                PhotoViewer.q0().A(false, true);
            } else if (o.F() && o.u().W) {
                o.u().l(false, true);
            }
            rbb.v();
            j95 j95Var = j95.s5;
            if (j95Var != null) {
                j95Var.dismiss();
            }
            er9 er9Var = er9.Q0;
            if (er9Var != null) {
                er9Var.dismiss();
            }
            if (hl.O1()) {
                launchActivity.p0.W(true, true);
                launchActivity.r0.W(true, true);
            }
            uj3 uj3Var = new uj3(l);
            uj3Var.E2 = launchActivity;
            ((ActionBarLayout) launchActivity.N()).U(uj3Var, !hl.O1() ? launchActivity.p0.getFragmentStack().size() <= 1 || !(launchActivity.p0.getFragmentStack().get(launchActivity.p0.getFragmentStack().size() - 1) instanceof fj6) : launchActivity.q0.getFragmentStack().isEmpty() || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof fj6), false);
        }
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    private final void b() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        tg5 tg5Var = (tg5) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        String str = LaunchActivity.C1;
        ArrayList arrayList = launchActivity.e0;
        if (launchActivity.isFinishing()) {
            return;
        }
        try {
            tg5Var.run();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (tL_error != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = ob6.M0(R.string.AppName, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                idVar.U = ob6.M0(2131750647, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                idVar.U = ob6.M0(2131748830, null);
            } else {
                idVar.U = ob6.M0(2131748829, null);
            }
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            launchActivity.F0(alertDialog$Builder);
            return;
        }
        if (launchActivity.p0 == null || updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        int i = this.b;
        uc7.s1(i).j4(updates.users, false);
        uc7.s1(i).c4(updates.chats, false);
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (arrayList.isEmpty() || uc7.s1(i).C(bundle, (e) c00.g(1, arrayList), null, null)) {
            zu1 zu1Var = new zu1(bundle);
            jn7.f(i).k(jn7.s, new Object[0]);
            ((ActionBarLayout) launchActivity.N()).U(zu1Var, false, true);
        }
    }

    private final void c() {
        d31 b0;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        tg5 tg5Var = (tg5) this.f;
        String str2 = LaunchActivity.C1;
        e eVar = (e) c00.g(1, launchActivity.e0);
        try {
            if (tLObject instanceof TL_chatlists.chatlist_ChatlistInvite) {
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject;
                boolean z = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                if (z) {
                    TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                    arrayList2 = tL_chatlists_chatlistInvite.chats;
                    arrayList = tL_chatlists_chatlistInvite.users;
                } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                    TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                    arrayList2 = tL_chatlists_chatlistInviteAlready.chats;
                    arrayList = tL_chatlists_chatlistInviteAlready.users;
                } else {
                    arrayList = null;
                    arrayList2 = null;
                }
                int i = this.b;
                int i2 = 0;
                uc7.s1(i).c4(arrayList2, false);
                uc7.s1(i).j4(arrayList, false);
                if (!z || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    qn4 qn4Var = new qn4(eVar, false);
                    qn4Var.T1 = -1;
                    qn4Var.X1 = "";
                    qn4Var.Y1 = new ArrayList();
                    qn4Var.a2 = "";
                    qn4Var.c2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    qn4Var.d2 = arrayList3;
                    qn4Var.u2 = -1;
                    qn4Var.x2 = -5;
                    qn4Var.S1 = str;
                    qn4Var.U1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        qn4Var.X1 = tL_textWithEntities.text;
                        qn4Var.Y1 = tL_textWithEntities.entities;
                        qn4Var.Z1 = tL_chatlists_chatlistInvite2.title_noanimate;
                        qn4Var.b2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        qn4Var.b2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        qn4Var.e2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        qn4Var.T1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = eVar.getMessagesController().G0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i2 >= arrayList4.size()) {
                                    break;
                                }
                                ac7 ac7Var = (ac7) arrayList4.get(i2);
                                if (ac7Var.a == qn4Var.T1) {
                                    qn4Var.X1 = ac7Var.b;
                                    qn4Var.Y1 = ac7Var.c;
                                    qn4Var.Z1 = ac7Var.n;
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    qn4Var.b1();
                    eVar.showDialog(qn4Var);
                    tg5Var.run();
                    return;
                }
                b0 = d31.b0(eVar);
            } else {
                b0 = d31.b0(eVar);
            }
            tg5Var.run();
            return;
        } catch (Exception e) {
            cc4.g(e, true);
            return;
        }
        xnb.x(null, 2131747940, b0, null);
    }

    private final void d() {
        ((e66) this.c).v((String) this.d, this.b + 1, (String) this.e, (String) this.f);
    }

    private final void e() {
        zg6 zg6Var = (zg6) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        ArrayList arrayList = new ArrayList();
        we3 we3Var = new we3();
        we3Var.b = "inapp";
        we3Var.a = str;
        arrayList.add(we3Var.a());
        cc4.b("LoginBilling querying \"" + str + "\" product");
        di0.h().o(arrayList, new eg(zg6Var, str, str2, str3, this.b));
    }

    private final void f() {
        f07 f07Var = (f07) this.c;
        Pair pair = (Pair) this.d;
        f07Var.b.i.O(((Integer) pair.first).intValue(), (vz6) pair.second, (ja6) this.e, (jt6) this.f, this.b);
    }

    private final void g() {
        jn7 jn7Var = (jn7) this.c;
        View view = (View) this.d;
        cn7 cn7Var = (cn7) this.e;
        bn7 bn7Var = (bn7) this.f;
        view.removeOnAttachStateChangeListener(cn7Var);
        jn7Var.n(bn7Var, this.b);
    }

    private final void h() {
        lv9 lv9Var = (lv9) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.f;
        if (this.b == lv9Var.F) {
            lv9Var.d = arrayList;
            lv9Var.e = arrayList2;
            lv9Var.I = arrayList3;
            lv9Var.f.f(arrayList, null);
            lv9Var.E = false;
            lv9Var.f();
            lv9Var.F();
        }
    }

    private final void i() {
        TLObject tLObject = (TLObject) this.c;
        boolean[] zArr = (boolean[]) this.d;
        pcc pccVar = (pcc) this.e;
        TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            pccVar.a("SERVER_ERROR");
            return;
        }
        int i = this.b;
        TLRPC.User f = yac.h(i).f();
        if (f != null) {
            f.emoji_status = updateemojistatus.emoji_status;
            jn7.f(i).k(jn7.p5, f);
            uc7.s1(i).x5(f.id, f.emoji_status);
        }
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        pccVar.a(null);
    }

    private final void j() {
        int i;
        lna lnaVar = (lna) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        r47 r47Var = (r47) this.e;
        wb2 wb2Var = (wb2) this.f;
        int[] iArr = lnaVar.e;
        RLottieNative[] rLottieNativeArr = lnaVar.g1;
        if (lnaVar.X0) {
            hl.c3(new jna(lnaVar, (byte) 2));
            return;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            int length = rLottieNativeArr.length;
            i = this.b;
            if (i2 >= length) {
                break;
            }
            if (rLottieNativeArr[i2] == null) {
                int i3 = i2 == 0 ? 1 : i2 == 1 ? 8 : i2 == 2 ? 14 : i2 == 3 ? 20 : 2;
                if (i3 < tL_messages_stickerSet.documents.size()) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i3);
                    xb4.G(yac.t0);
                    String v2 = hl.v2(xb4.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(v2)) {
                        hl.c3(new kna(document, i, r47Var, wb2Var, tL_messages_stickerSet, (byte) 1));
                        z = true;
                    } else {
                        rLottieNativeArr[i2] = RLottieNative.b(v2, iArr, null, null);
                        lnaVar.h1[i2] = iArr[0];
                    }
                }
            }
            i2++;
        }
        if (z) {
            hl.c3(new jna(lnaVar, (byte) 3));
        } else {
            hl.c3(new a39((Object) lnaVar, i, (Object) wb2Var, (byte) 11));
        }
    }

    private final void k() {
        c51 c51Var = (c51) this.c;
        nx0[] nx0VarArr = (nx0[]) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        c51Var.setLoading(false);
        nx0 nx0Var = nx0VarArr[0];
        if (nx0Var != null) {
            nx0Var.dismiss();
        }
        jxa.v(this.b, false).P();
        e S = LaunchActivity.S();
        if (S != null) {
            d31.b0(S).V(Collections.singletonList(tLObject), ob6.M0(2131744636, null), hl.S2(ob6.a0(null, null, 2131744635, str)), null).k(false);
        }
    }

    private final void l() {
        k3b k3bVar = (k3b) this.c;
        int i = this.b;
        List list = (List) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ea8 ea8Var = (ea8) this.f;
        if (k3bVar.J == null || k3bVar.E) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f / k3bVar.J.getWidth(), 1.0f / k3bVar.J.getHeight());
        matrix.postTranslate(-0.5f, -0.5f);
        matrix.postRotate(i);
        matrix.postTranslate(0.5f, 0.5f);
        int i2 = (i / 90) % 2;
        Bitmap bitmap = k3bVar.J;
        if (i2 != 0) {
            matrix.postScale(bitmap.getHeight(), k3bVar.J.getWidth());
        } else {
            matrix.postScale(bitmap.getWidth(), k3bVar.J.getHeight());
        }
        if (list.isEmpty()) {
            h3b h3bVar = new h3b(k3bVar);
            h3bVar.h.set(0.0f, 0.0f, k3bVar.J.getWidth(), k3bVar.J.getHeight());
            h3bVar.i.set(h3bVar.h);
            matrix.mapRect(h3bVar.i);
            h3bVar.c = i;
            Bitmap d = k3bVar.d(0, 0, k3bVar.J, false);
            h3bVar.d = d;
            if (d == null) {
                cc4.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                return;
            }
            h3bVar.f = h3bVar.c();
            k3b.c(h3bVar, k3bVar.U, k3bVar.V);
            k3bVar.P = h3bVar.j;
            k3bVar.Q = h3bVar.k;
            arrayList.add(h3bVar);
            hl.c3(new kta((Object) k3bVar, arrayList, (Object) ea8Var, (Object) h3bVar, (byte) 4));
            k3bVar.F = h3bVar;
            k3bVar.E = true;
            k3bVar.y = false;
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            j3b j3bVar = (j3b) list.get(i3);
            h3b h3bVar2 = new h3b(k3bVar);
            h3bVar2.h.set(j3bVar.b, j3bVar.c, r10 + j3bVar.d, r12 + j3bVar.e);
            h3bVar2.i.set(h3bVar2.h);
            matrix.mapRect(h3bVar2.i);
            h3bVar2.c = i;
            Bitmap d2 = k3bVar.d(j3bVar.b, j3bVar.c, j3bVar.a, false);
            h3bVar2.d = d2;
            if (d2 != null) {
                h3bVar2.f = h3bVar2.c();
                k3b.c(h3bVar2, k3bVar.U, k3bVar.V);
                k3bVar.P = h3bVar2.j;
                k3bVar.Q = h3bVar2.k;
                arrayList.add(h3bVar2);
            }
        }
        k3bVar.F = null;
        k3bVar.E = true;
        k3bVar.y = false;
        hl.c3(new ida((Object) k3bVar, (Object) arrayList, (byte) 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x058f A[Catch: Exception -> 0x08fe, TryCatch #1 {Exception -> 0x08fe, blocks: (B:250:0x0538, B:252:0x0542, B:254:0x0548, B:255:0x054b, B:257:0x0589, B:259:0x058f, B:261:0x0595, B:262:0x0598, B:264:0x059d, B:266:0x05a3, B:267:0x05a6, B:270:0x05b0, B:272:0x05ba, B:274:0x05ca, B:276:0x05d6, B:278:0x05e2, B:281:0x062a, B:283:0x0630, B:284:0x0633, B:286:0x063c, B:287:0x063f, B:288:0x0649, B:291:0x0653, B:297:0x0666, B:299:0x066c, B:307:0x069d, B:309:0x06a3, B:423:0x05f2, B:425:0x0602, B:427:0x060c, B:429:0x0625, B:435:0x0551, B:437:0x055b, B:439:0x0561, B:440:0x0564, B:441:0x0568, B:443:0x0572, B:445:0x0578, B:447:0x057e, B:448:0x0581), top: B:249:0x0538 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ba A[Catch: Exception -> 0x08fe, TryCatch #1 {Exception -> 0x08fe, blocks: (B:250:0x0538, B:252:0x0542, B:254:0x0548, B:255:0x054b, B:257:0x0589, B:259:0x058f, B:261:0x0595, B:262:0x0598, B:264:0x059d, B:266:0x05a3, B:267:0x05a6, B:270:0x05b0, B:272:0x05ba, B:274:0x05ca, B:276:0x05d6, B:278:0x05e2, B:281:0x062a, B:283:0x0630, B:284:0x0633, B:286:0x063c, B:287:0x063f, B:288:0x0649, B:291:0x0653, B:297:0x0666, B:299:0x066c, B:307:0x069d, B:309:0x06a3, B:423:0x05f2, B:425:0x0602, B:427:0x060c, B:429:0x0625, B:435:0x0551, B:437:0x055b, B:439:0x0561, B:440:0x0564, B:441:0x0568, B:443:0x0572, B:445:0x0578, B:447:0x057e, B:448:0x0581), top: B:249:0x0538 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0653 A[Catch: Exception -> 0x08fe, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x08fe, blocks: (B:250:0x0538, B:252:0x0542, B:254:0x0548, B:255:0x054b, B:257:0x0589, B:259:0x058f, B:261:0x0595, B:262:0x0598, B:264:0x059d, B:266:0x05a3, B:267:0x05a6, B:270:0x05b0, B:272:0x05ba, B:274:0x05ca, B:276:0x05d6, B:278:0x05e2, B:281:0x062a, B:283:0x0630, B:284:0x0633, B:286:0x063c, B:287:0x063f, B:288:0x0649, B:291:0x0653, B:297:0x0666, B:299:0x066c, B:307:0x069d, B:309:0x06a3, B:423:0x05f2, B:425:0x0602, B:427:0x060c, B:429:0x0625, B:435:0x0551, B:437:0x055b, B:439:0x0561, B:440:0x0564, B:441:0x0568, B:443:0x0572, B:445:0x0578, B:447:0x057e, B:448:0x0581), top: B:249:0x0538 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07de A[Catch: Exception -> 0x0930, TryCatch #0 {Exception -> 0x0930, blocks: (B:312:0x06b9, B:314:0x06c6, B:315:0x06d5, B:317:0x06d9, B:319:0x06f0, B:320:0x06f4, B:322:0x06fa, B:323:0x06fe, B:325:0x070d, B:326:0x0720, B:328:0x0726, B:330:0x0732, B:332:0x073c, B:334:0x074a, B:335:0x0750, B:337:0x0756, B:339:0x0760, B:341:0x076e, B:342:0x0772, B:344:0x0778, B:346:0x0782, B:348:0x0790, B:349:0x0794, B:351:0x079a, B:353:0x07a0, B:355:0x07aa, B:357:0x07b0, B:358:0x07b3, B:359:0x07b8, B:362:0x07bf, B:364:0x07c5, B:369:0x07d8, B:371:0x07de, B:373:0x07f4, B:380:0x0809, B:382:0x0813, B:384:0x084c, B:386:0x0863, B:387:0x0867, B:389:0x086d, B:390:0x0871, B:392:0x087b, B:393:0x0885, B:395:0x088b, B:396:0x0895, B:399:0x089e, B:401:0x08a4, B:403:0x08ae, B:405:0x08e7, B:406:0x08f4, B:366:0x07d4, B:419:0x06ce), top: B:311:0x06b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07f4 A[Catch: Exception -> 0x0930, TryCatch #0 {Exception -> 0x0930, blocks: (B:312:0x06b9, B:314:0x06c6, B:315:0x06d5, B:317:0x06d9, B:319:0x06f0, B:320:0x06f4, B:322:0x06fa, B:323:0x06fe, B:325:0x070d, B:326:0x0720, B:328:0x0726, B:330:0x0732, B:332:0x073c, B:334:0x074a, B:335:0x0750, B:337:0x0756, B:339:0x0760, B:341:0x076e, B:342:0x0772, B:344:0x0778, B:346:0x0782, B:348:0x0790, B:349:0x0794, B:351:0x079a, B:353:0x07a0, B:355:0x07aa, B:357:0x07b0, B:358:0x07b3, B:359:0x07b8, B:362:0x07bf, B:364:0x07c5, B:369:0x07d8, B:371:0x07de, B:373:0x07f4, B:380:0x0809, B:382:0x0813, B:384:0x084c, B:386:0x0863, B:387:0x0867, B:389:0x086d, B:390:0x0871, B:392:0x087b, B:393:0x0885, B:395:0x088b, B:396:0x0895, B:399:0x089e, B:401:0x08a4, B:403:0x08ae, B:405:0x08e7, B:406:0x08f4, B:366:0x07d4, B:419:0x06ce), top: B:311:0x06b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x05ad  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v101 */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r9v21, types: [ml3, sv9] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        e Q;
        boolean z;
        String lowerCase;
        wc6 wc6Var;
        int i;
        String str2;
        int i2;
        List<Address> fromLocationName;
        List<Address> fromLocationName2;
        HashSet hashSet;
        HashSet hashSet2;
        int i3;
        byte b;
        Address address;
        Locale locale;
        String str3;
        List<Address> list;
        byte b2;
        List<Address> list2;
        int i4;
        byte b3;
        byte b4;
        String countryName;
        byte b5;
        byte b6;
        StringBuilder sb;
        StringBuilder sb2;
        Address address2;
        byte b7;
        String str4;
        int i5;
        final long j;
        boolean z2;
        long j2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        str = "";
        byte b8 = 2;
        long j3 = 0;
        Address address3 = null;
        byte b9 = 1;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                uc7 uc7Var = (uc7) this.c;
                m44 m44Var = (m44) this.d;
                m44Var.b(uc7Var.currentAccount, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                hl.c3(new n87(uc7Var, m44Var, (byte) 1));
                break;
            case 1:
                int i6 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                if (LaunchActivity.E1 && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    l46 l46Var = new l46(11, i6, null, Q.getParentActivity(), Q);
                    l46Var.u1(chat, arrayList, arrayList2, arrayList3, null);
                    l46Var.show();
                    break;
                }
                break;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                id idVar = (id) this.e;
                int i7 = this.b;
                e eVar = (e) this.f;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    idVar.dismiss();
                    z = true;
                } catch (Exception e) {
                    z = true;
                    cc4.g(e, true);
                }
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(tL_help_support.user);
                jf7.Y(i7).j1(arrayList4, null, z, z);
                uc7.s1(i7).i4(tL_help_support.user, false, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                eVar.presentFragment(new zu1(bundle));
                break;
            case 3:
                id[] idVarArr = (id[]) this.c;
                int[] iArr = (int[]) this.d;
                int i8 = this.b;
                hm1 hm1Var = (hm1) this.e;
                e eVar2 = (e) this.f;
                byte b10 = 0;
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    idVar2.setOnCancelListener(new ef(iArr, i8, hm1Var, b10));
                    eVar2.showDialog(idVarArr[0]);
                    break;
                }
                break;
            case 4:
                o oVar = (o) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str5 = (String) this.f;
                int i9 = this.b;
                ArrayList arrayList6 = new ArrayList();
                int size = arrayList5.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = arrayList5.get(i10);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj);
                    if (obj instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj;
                        CharSequence z4 = o.z(oVar, oVar.v0[0].c.F, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(z4)) {
                            lowerCase = z4.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i11 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str5, i11);
                            if (indexOf >= 0) {
                                int length = str5.length() + indexOf;
                                if (indexOf == 0 || hl.I1(lowerCase.charAt(indexOf - 1))) {
                                    pw pwVar = new pw();
                                    pwVar.a = indexOf;
                                    pwVar.c = pageBlock;
                                    pwVar.b = obj;
                                    arrayList6.add(pwVar);
                                }
                                i11 = length;
                            }
                        }
                    }
                }
                hl.c3(new gp6((Object) oVar, i9, (Object) arrayList6, (Object) str5, (byte) 4));
                break;
            case 5:
                wc6 wc6Var2 = (wc6) this.c;
                Locale locale2 = (Locale) this.d;
                String str6 = (String) this.e;
                Locale locale3 = (Locale) this.f;
                int i12 = this.b;
                wc6Var2.getClass();
                ArrayList arrayList7 = new ArrayList();
                try {
                    i2 = wc6Var2.e ? 10 : 5;
                    fromLocationName = new Geocoder(a.b, locale2).getFromLocationName(str6, 5);
                    fromLocationName2 = wc6Var2.d ? new Geocoder(a.b, locale3).getFromLocationName(str6, 5) : null;
                    hashSet = new HashSet();
                    hashSet2 = new HashSet();
                    i3 = 0;
                } catch (Exception unused) {
                }
                while (i3 < fromLocationName.size()) {
                    Address address4 = fromLocationName.get(i3);
                    if (fromLocationName2 != null) {
                        b = b8;
                        if (i3 < fromLocationName2.size()) {
                            address = fromLocationName2.get(i3);
                            if (address4.hasLatitude() || !address4.hasLongitude()) {
                                locale = locale2;
                                str3 = str;
                                list = fromLocationName2;
                                b2 = b9;
                                list2 = fromLocationName;
                                wc6Var = wc6Var2;
                                i = i12;
                                str2 = str6;
                                i4 = i3;
                            } else {
                                b2 = b9;
                                list2 = fromLocationName;
                                double latitude = address4.getLatitude();
                                double longitude = address4.getLongitude();
                                StringBuilder sb3 = new StringBuilder();
                                locale = locale2;
                                StringBuilder sb4 = new StringBuilder();
                                str3 = str;
                                StringBuilder sb5 = new StringBuilder();
                                String locality = address4.getLocality();
                                if (TextUtils.isEmpty(locality)) {
                                    locality = address4.getAdminArea();
                                }
                                Address address5 = address;
                                String str7 = locality;
                                if (address5 != null && TextUtils.isEmpty(address5.getLocality())) {
                                    address5.getAdminArea();
                                }
                                list = fromLocationName2;
                                String thoroughfare = address4.getThoroughfare();
                                i = i12;
                                if (TextUtils.isEmpty(thoroughfare)) {
                                    str2 = str6;
                                } else {
                                    str2 = str6;
                                    try {
                                    } catch (Exception unused2) {
                                        wc6Var = wc6Var2;
                                    }
                                    if (!TextUtils.equals(thoroughfare, address4.getAdminArea())) {
                                        if (sb5.length() > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(thoroughfare);
                                        b3 = 0;
                                        if (TextUtils.isEmpty(str7)) {
                                            b4 = b2;
                                        } else {
                                            if (sb4.length() > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(str7);
                                            if (sb5 != null) {
                                                if (sb5.length() > 0) {
                                                    sb5.append(", ");
                                                }
                                                sb5.append(str7);
                                            }
                                            b4 = 0;
                                        }
                                        StringBuilder sb6 = sb5;
                                        countryName = address4.getCountryName();
                                        if (TextUtils.isEmpty(countryName)) {
                                            b5 = b3;
                                            b6 = b4;
                                            i4 = i3;
                                        } else {
                                            b5 = b3;
                                            b6 = b4;
                                            if ("US".equals(address4.getCountryCode()) || "AE".equals(address4.getCountryCode()) || ("GB".equals(address4.getCountryCode()) && "en".equals(locale.getLanguage()))) {
                                                String[] split = countryName.split(" ");
                                                int length2 = split.length;
                                                i4 = i3;
                                                str4 = str3;
                                                int i13 = 0;
                                                while (i13 < length2) {
                                                    int i14 = i13;
                                                    String str8 = split[i14];
                                                    if (str8.length() > 0) {
                                                        i5 = length2;
                                                        str4 = str4 + str8.charAt(0);
                                                    } else {
                                                        i5 = length2;
                                                    }
                                                    i13 = i14 + 1;
                                                    length2 = i5;
                                                }
                                            } else {
                                                i4 = i3;
                                                str4 = countryName;
                                            }
                                            if (sb4.length() > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(str4);
                                            if (sb3.length() > 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(countryName);
                                        }
                                        if (wc6Var2.e) {
                                            StringBuilder sb7 = new StringBuilder();
                                            try {
                                                String addressLine = address4.getAddressLine(0);
                                                if (!TextUtils.isEmpty(addressLine)) {
                                                    sb7.append(addressLine);
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            if (sb7.length() > 0) {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue.geo = tL_geoPoint;
                                                tL_geoPoint.lat = latitude;
                                                tL_geoPoint._long = longitude;
                                                tL_messageMediaVenue.query_id = -1L;
                                                tL_messageMediaVenue.title = sb7.toString();
                                                tL_messageMediaVenue.icon = "pin";
                                                tL_messageMediaVenue.address = ob6.M0(2131747329, null);
                                                arrayList7.add(tL_messageMediaVenue);
                                            }
                                            wc6Var = wc6Var2;
                                        } else {
                                            if (sb6 == null || sb6.length() <= 0) {
                                                sb = sb3;
                                                wc6Var = wc6Var2;
                                                sb2 = sb4;
                                                address2 = address4;
                                            } else {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                sb = sb3;
                                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                tL_geoPoint2.lat = latitude;
                                                tL_geoPoint2._long = longitude;
                                                wc6Var = wc6Var2;
                                                try {
                                                    tL_messageMediaVenue2.query_id = -1L;
                                                    tL_messageMediaVenue2.title = sb6.toString();
                                                    tL_messageMediaVenue2.icon = "pin";
                                                    tL_messageMediaVenue2.address = b5 != 0 ? ob6.M0(2131747322, null) : ob6.M0(2131747187, null);
                                                } catch (Exception unused4) {
                                                }
                                                if (address5 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress;
                                                    tL_geoPointAddress.country_iso2 = address5.getCountryCode();
                                                    String locality2 = address5.getLocality();
                                                    if (TextUtils.isEmpty(locality2)) {
                                                        locality2 = address5.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(locality2)) {
                                                        locality2 = address5.getSubAdminArea();
                                                    }
                                                    String adminArea = address5.getAdminArea();
                                                    StringBuilder sb8 = new StringBuilder();
                                                    if (TextUtils.isEmpty(adminArea)) {
                                                        sb2 = sb4;
                                                        address2 = address4;
                                                    } else {
                                                        sb2 = sb4;
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress2.state = adminArea;
                                                        address2 = address4;
                                                        tL_geoPointAddress2.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(locality2)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress3.city = locality2;
                                                        tL_geoPointAddress3.flags |= 2;
                                                    }
                                                    if (b5 == 0) {
                                                        String thoroughfare2 = (TextUtils.equals(address5.getThoroughfare(), str7) || TextUtils.equals(address5.getThoroughfare(), address5.getCountryName())) ? null : address5.getThoroughfare();
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address5.getSubLocality(), str7) && !TextUtils.equals(address5.getSubLocality(), address5.getCountryName())) {
                                                            thoroughfare2 = address5.getSubLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address5.getLocality(), str7) && !TextUtils.equals(address5.getLocality(), address5.getCountryName())) {
                                                            thoroughfare2 = address5.getLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address5.getCountryName())) {
                                                            sb8 = null;
                                                        } else {
                                                            if (sb8.length() > 0) {
                                                                sb8.append(", ");
                                                            }
                                                            sb8.append(thoroughfare2);
                                                        }
                                                        if (!TextUtils.isEmpty(sb8)) {
                                                            int i15 = 0;
                                                            while (true) {
                                                                String[] strArr = id6.Q;
                                                                if (i15 < 19) {
                                                                    if (strArr[i15].equalsIgnoreCase(sb8.toString())) {
                                                                        b7 = b2;
                                                                    } else {
                                                                        i15++;
                                                                    }
                                                                }
                                                            }
                                                            if (!TextUtils.isEmpty(sb8)) {
                                                                TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue2.geoAddress;
                                                                tL_geoPointAddress4.flags |= 4;
                                                                tL_geoPointAddress4.street = sb8.toString();
                                                            }
                                                            if (b7 == 0) {
                                                                arrayList7.add(tL_messageMediaVenue2);
                                                                if (arrayList7.size() >= i2) {
                                                                    hl.c3(new gp6((Object) wc6Var, i, (Object) str2, (Object) arrayList7, (byte) 5));
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        b7 = 0;
                                                        if (!TextUtils.isEmpty(sb8)) {
                                                        }
                                                        if (b7 == 0) {
                                                        }
                                                    }
                                                } else {
                                                    sb2 = sb4;
                                                    address2 = address4;
                                                }
                                                b7 = 0;
                                                if (b7 == 0) {
                                                }
                                            }
                                            if (b6 == 0 && !hashSet2.contains(sb2.toString())) {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue3.geo = tL_geoPoint3;
                                                tL_geoPoint3.lat = latitude;
                                                tL_geoPoint3._long = longitude;
                                                tL_messageMediaVenue3.query_id = -1L;
                                                tL_messageMediaVenue3.title = sb2.toString();
                                                tL_messageMediaVenue3.icon = "city";
                                                tL_messageMediaVenue3.emoji = id6.b(address2.getCountryCode());
                                                hashSet2.add(tL_messageMediaVenue3.title);
                                                tL_messageMediaVenue3.address = ob6.M0(2131747322, null);
                                                if (address5 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue3.geoAddress = tL_geoPointAddress5;
                                                    tL_geoPointAddress5.country_iso2 = address5.getCountryCode();
                                                    String locality3 = address5.getLocality();
                                                    if (TextUtils.isEmpty(locality3)) {
                                                        locality3 = address5.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(locality3)) {
                                                        locality3 = address5.getSubAdminArea();
                                                    }
                                                    String adminArea2 = address5.getAdminArea();
                                                    if (!TextUtils.isEmpty(adminArea2)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue3.geoAddress;
                                                        tL_geoPointAddress6.state = adminArea2;
                                                        tL_geoPointAddress6.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(locality3)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue3.geoAddress;
                                                        tL_geoPointAddress7.city = locality3;
                                                        tL_geoPointAddress7.flags |= 2;
                                                    }
                                                }
                                                arrayList7.add(tL_messageMediaVenue3);
                                                if (arrayList7.size() >= i2) {
                                                    hl.c3(new gp6((Object) wc6Var, i, (Object) str2, (Object) arrayList7, (byte) 5));
                                                }
                                            }
                                            if (sb.length() > 0 && !hashSet.contains(sb.toString())) {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue4.geo = tL_geoPoint4;
                                                tL_geoPoint4.lat = latitude;
                                                tL_geoPoint4._long = longitude;
                                                tL_messageMediaVenue4.query_id = -1L;
                                                tL_messageMediaVenue4.title = sb.toString();
                                                tL_messageMediaVenue4.icon = "country";
                                                tL_messageMediaVenue4.emoji = id6.b(address2.getCountryCode());
                                                hashSet.add(tL_messageMediaVenue4.title);
                                                tL_messageMediaVenue4.address = ob6.M0(2131751719, null);
                                                if (address5 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue4.geoAddress = tL_geoPointAddress8;
                                                    tL_geoPointAddress8.country_iso2 = address5.getCountryCode();
                                                }
                                                arrayList7.add(tL_messageMediaVenue4);
                                                if (arrayList7.size() >= i2) {
                                                    hl.c3(new gp6((Object) wc6Var, i, (Object) str2, (Object) arrayList7, (byte) 5));
                                                }
                                            }
                                        }
                                    }
                                }
                                String subLocality = address4.getSubLocality();
                                if (TextUtils.isEmpty(subLocality)) {
                                    String locality4 = address4.getLocality();
                                    if (TextUtils.isEmpty(locality4) || TextUtils.equals(locality4, str7)) {
                                        b3 = b2;
                                        sb5 = null;
                                        if (TextUtils.isEmpty(str7)) {
                                        }
                                        StringBuilder sb62 = sb5;
                                        countryName = address4.getCountryName();
                                        if (TextUtils.isEmpty(countryName)) {
                                        }
                                        if (wc6Var2.e) {
                                        }
                                    } else {
                                        if (sb5.length() > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(locality4);
                                    }
                                } else {
                                    if (sb5.length() > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(subLocality);
                                }
                                b3 = 0;
                                if (TextUtils.isEmpty(str7)) {
                                }
                                StringBuilder sb622 = sb5;
                                countryName = address4.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                }
                                if (wc6Var2.e) {
                                }
                            }
                            i3 = i4 + 1;
                            fromLocationName = list2;
                            b8 = b;
                            b9 = b2;
                            locale2 = locale;
                            str = str3;
                            fromLocationName2 = list;
                            str6 = str2;
                            i12 = i;
                            wc6Var2 = wc6Var;
                            address3 = null;
                        }
                    } else {
                        b = b8;
                    }
                    address = address3;
                    if (address4.hasLatitude()) {
                    }
                    locale = locale2;
                    str3 = str;
                    list = fromLocationName2;
                    b2 = b9;
                    list2 = fromLocationName;
                    wc6Var = wc6Var2;
                    i = i12;
                    str2 = str6;
                    i4 = i3;
                    i3 = i4 + 1;
                    fromLocationName = list2;
                    b8 = b;
                    b9 = b2;
                    locale2 = locale;
                    str = str3;
                    fromLocationName2 = list;
                    str6 = str2;
                    i12 = i;
                    wc6Var2 = wc6Var;
                    address3 = null;
                }
                wc6Var = wc6Var2;
                i = i12;
                str2 = str6;
                hl.c3(new gp6((Object) wc6Var, i, (Object) str2, (Object) arrayList7, (byte) 5));
                break;
            case 6:
                TLObject tLObject = (TLObject) this.c;
                int i16 = this.b;
                HashSet hashSet3 = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                e eVar3 = (e) this.f;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7.s1(i16).j4(updates.users, false);
                    uc7.s1(i16).c4(updates.chats, false);
                    ArrayList z0 = uc7.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = z0.size();
                    TLRPC.GroupCall groupCall = null;
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj2 = z0.get(i17);
                        i17++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    if (LaunchActivity.H1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        xkc.g(LaunchActivity.H1, i16, tL_inputGroupCall, false, groupCall, hashSet3);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    uc7.s1(i16).j4(groupcall.users, false);
                    uc7.s1(i16).c4(groupcall.chats, false);
                    if (LaunchActivity.H1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        xkc.g(LaunchActivity.H1, i16, tL_inputGroupCall2, false, groupCall2, hashSet3);
                        break;
                    }
                } else if (tL_error != null) {
                    d31.b0(eVar3).g0(tL_error, false);
                    break;
                }
                break;
            case 7:
                long[] jArr = (long[]) this.c;
                int i18 = this.b;
                de0 de0Var = (de0) this.d;
                de0 de0Var2 = (de0) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User X1 = uc7.s1(i18).X1(Long.valueOf(jArr[0]));
                    rb0 rb0Var = new rb0((vnb) null);
                    rb0Var.q(X1);
                    de0Var.f(X1, rb0Var);
                } else {
                    TLRPC.Chat M0 = uc7.s1(i18).M0(Long.valueOf(-jArr[0]));
                    rb0 rb0Var2 = new rb0((vnb) null);
                    rb0Var2.p(M0);
                    de0Var.f(M0, rb0Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User X12 = uc7.s1(i18).X1(Long.valueOf(jArr[0]));
                    if (de0Var2 != null) {
                        rb0 rb0Var3 = new rb0((vnb) null);
                        rb0Var3.q(X12);
                        de0Var2.f(X12, rb0Var3);
                    }
                    if (textView != null) {
                        textView.setText(lbc.r(X12));
                        break;
                    }
                } else {
                    TLRPC.Chat M02 = uc7.s1(i18).M0(Long.valueOf(-jArr[0]));
                    if (de0Var2 != null) {
                        rb0 rb0Var4 = new rb0((vnb) null);
                        rb0Var4.p(M02);
                        de0Var2.f(M02, rb0Var4);
                    }
                    if (textView != null) {
                        textView.setText(M02 != null ? M02.title : "");
                        break;
                    }
                }
                break;
            case 8:
                ((zu1) this.c).B9(this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 9:
                ju1 ju1Var = (ju1) this.c;
                dq1 dq1Var = (dq1) this.d;
                dq1Var.b = ju1Var.a.getMessagesController().r0(-((TLRPC.Chat) this.e).id, this.b, new eu1(ju1Var, dq1Var, (zu1) this.f));
                break;
            case 10:
                ju1 ju1Var2 = (ju1) this.c;
                int i19 = this.b;
                r47 r47Var = (r47) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                zu1 zu1Var = ju1Var2.a;
                zu1Var.tb(i19, r47Var.e1(), true, r47.B0(r47Var.k) == zu1Var.d7 ? 1 : 0, true, 0, num, bArr, new tt1(ju1Var2, r47Var, b9));
                break;
            case 11:
                ((me3) this.c).b1((TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 12:
                final tl3 tl3Var = (tl3) this.c;
                int i20 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                ArrayList arrayList10 = (ArrayList) this.f;
                ?? r9 = tl3Var.k0;
                ?? r10 = tl3Var.w0;
                int i21 = tl3Var.t0;
                tl3Var.E0--;
                if (i20 == tl3Var.e0) {
                    tl3Var.g0 = i20;
                    if (tl3Var.f0 != i20) {
                        r9.b();
                    }
                    if (tl3Var.h0 != i20) {
                        tl3Var.J.clear();
                    }
                    tl3Var.O = true;
                    int i22 = 0;
                    while (i22 < arrayList8.size()) {
                        if (!tl3Var.F(arrayList8.get(i22))) {
                            arrayList8.remove(i22);
                            i22--;
                        }
                        i22++;
                    }
                    int size3 = r10.size();
                    int i23 = 0;
                    while (i23 < arrayList8.size()) {
                        final Object obj3 = arrayList8.get(i23);
                        if (obj3 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) obj3;
                            uc7.s1(i21).i4(user, true, z3);
                            j = user.id;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            uc7.s1(i21).a4(chat2, true);
                            j = -chat2.id;
                        } else {
                            if (obj3 instanceof TLRPC.EncryptedChat) {
                                uc7.s1(i21).f4((TLRPC.EncryptedChat) obj3, true);
                            }
                            j = j3;
                        }
                        long j4 = j3;
                        if (j == j3 || ((TLRPC.Dialog) uc7.s1(i21).R.f(j)) != null) {
                            z2 = z3;
                            j2 = j;
                        } else {
                            jf7 Y = jf7.Y(i21);
                            z2 = z3;
                            j2 = j;
                            Y.a.c(new ke7(Y, j2, new df7() { // from class: kl3
                                @Override // df7
                                public final void a(int i24) {
                                    int i25 = tl3.this.t0;
                                    if (i24 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j5 = j;
                                        tL_dialog.id = j5;
                                        if (i24 != 0) {
                                            tL_dialog.folder_id = i24;
                                        }
                                        Object obj4 = obj3;
                                        if (obj4 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = xc2.T((TLRPC.Chat) obj4) ? 1 : 0;
                                        }
                                        uc7.s1(i25).R.k(j5, tL_dialog);
                                        uc7.s1(i25).y.add(tL_dialog);
                                        uc7.s1(i25).h5(null);
                                    }
                                }
                            }, (byte) 1));
                        }
                        if (tl3Var.R() && !(obj3 instanceof TLRPC.EncryptedChat)) {
                            dj3 dj3Var = tl3Var.V;
                            ?? r5 = z2;
                            char c = (dj3Var == null || dj3Var.a() != j2) ? z2 : 1;
                            while (true) {
                                if (c != 0) {
                                    arrayList8.remove(i23);
                                    arrayList9.remove(i23);
                                    i23--;
                                } else if (r5 < size3) {
                                    sl3 sl3Var = (sl3) r10.get(r5);
                                    if (sl3Var != null && sl3Var.c == j2) {
                                        c = 1;
                                    }
                                    c = c;
                                    r5++;
                                }
                            }
                        }
                        i23++;
                        j3 = j4;
                        z3 = z2;
                    }
                    boolean z5 = z3;
                    uc7.s1(i21).j4(arrayList10, true);
                    tl3Var.s = arrayList8;
                    tl3Var.H = arrayList9;
                    r9.f(arrayList8, r10);
                    tl3Var.f();
                    dj3 dj3Var2 = tl3Var.V;
                    if (dj3Var2 != null) {
                        dj3Var2.d(tl3Var.E0 > 0 ? true : z5, true);
                        tl3Var.V.c();
                        break;
                    }
                }
                break;
            case 13:
                int i24 = this.b;
                int[] iArr2 = (int[]) this.c;
                on3 on3Var = (on3) this.d;
                xb4 xb4Var = (xb4) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f;
                jn7 f = jn7.f(i24);
                for (int i25 = 0; i25 < 3; i25++) {
                    f.a(on3Var, iArr2[i25]);
                }
                xb4Var.X(document, "speech_model", 3, 1);
                break;
            case 14:
                ca4 ca4Var = (ca4) this.c;
                int[] iArr3 = (int[]) this.d;
                int i26 = this.b;
                TLMethod tLMethod = (TLMethod) this.e;
                bf bfVar = (bf) this.f;
                int k = ea4.k(ca4Var.a, i26, tLMethod, new ye(bfVar, (byte) 25), 0);
                iArr3[0] = k;
                if (k == 0) {
                    ea4.e.postRunnable(new ba4(bfVar, b8), 0L);
                    break;
                }
                break;
            case 15:
                yx4 yx4Var = (yx4) this.c;
                Context context = (Context) this.d;
                int i27 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                pcc pccVar = (pcc) this.f;
                long j5 = yx4Var.W1;
                ex4 ex4Var = new ex4(yx4Var, pccVar, b8);
                boolean z6 = starGift.limited;
                new jx4(yx4Var, context, i27, starGift, j5, ex4Var, z6 && (disallowedGiftsSettings2 = yx4Var.V1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z6 && (disallowedGiftsSettings = yx4Var.V1) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 16:
                a();
                break;
            case 17:
                b();
                break;
            case 18:
                c();
                break;
            case 19:
                d();
                break;
            case 20:
                e();
                break;
            case 21:
                f();
                break;
            case 22:
                g();
                break;
            case 23:
                h();
                break;
            case 24:
                i();
                break;
            case 25:
                j();
                break;
            case 26:
                k();
                break;
            case 27:
                l();
                break;
            default:
                dkb dkbVar = (dkb) this.c;
                int i28 = this.b;
                ArrayList arrayList11 = (ArrayList) this.d;
                zh6 zh6Var = (zh6) this.e;
                zh6 zh6Var2 = (zh6) this.f;
                ArrayList arrayList12 = dkbVar.o;
                zh6 zh6Var3 = dkbVar.i;
                zh6 zh6Var4 = dkbVar.h;
                ArrayList arrayList13 = dkbVar.g;
                if (i28 == dkbVar.c) {
                    arrayList13.clear();
                    arrayList13.addAll(arrayList11);
                    zh6Var4.b();
                    for (int i29 = 0; i29 < zh6Var.m(); i29++) {
                        zh6Var4.k(zh6Var.j(i29), (TLRPC.User) zh6Var.n(i29));
                    }
                    zh6Var3.b();
                    for (int i30 = 0; i30 < zh6Var2.m(); i30++) {
                        zh6Var3.k(zh6Var2.j(i30), (TLRPC.Chat) zh6Var2.n(i30));
                    }
                    dkbVar.e = true;
                    dkbVar.f = false;
                    if (dkbVar.d == 0 && !arrayList13.isEmpty()) {
                        dkbVar.d = ((Long) arrayList13.get(0)).longValue();
                    }
                    ArrayList arrayList14 = new ArrayList(arrayList12);
                    arrayList12.clear();
                    for (int i31 = 0; i31 < arrayList14.size(); i31++) {
                        bkb bkbVar = (bkb) arrayList14.get(i31);
                        dkbVar.c(bkbVar.a, bkbVar.b);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l77(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ l77(Object obj, Object obj2, int i, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ l77(Object obj, Object obj2, Object obj3, int i, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
    }

    public /* synthetic */ l77(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }
}
