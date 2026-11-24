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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i57(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
        hd hdVar = (hd) this.f;
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
            Bundle l = ir2.l("onlySelect", true);
            l.putString("importTitle", tL_messages_historyImportParsed.title);
            l.putBoolean("allowSwitchAccount", true);
            if (tL_messages_historyImportParsed.pm) {
                l.putInt("dialogsType", 12);
            } else if (tL_messages_historyImportParsed.group) {
                l.putInt("dialogsType", 11);
            } else {
                String uri2 = uri.toString();
                Iterator it = na7.q1(i).k4.F3.f.iterator();
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
                    Iterator it2 = na7.q1(i).k4.E3.f.iterator();
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
            } else if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
                PhotoViewer.r0().B(false, true);
            } else if (o.F() && o.u().W) {
                o.u().l(false, true);
            }
            t7b.v();
            h75 h75Var = h75.s5;
            if (h75Var != null) {
                h75Var.dismiss();
            }
            on9 on9Var = on9.Q0;
            if (on9Var != null) {
                on9Var.dismiss();
            }
            if (gl.O1()) {
                launchActivity.p0.W(true, true);
                launchActivity.r0.W(true, true);
            }
            cj3 cj3Var = new cj3(l);
            cj3Var.E2 = launchActivity;
            ((ActionBarLayout) launchActivity.N()).U(cj3Var, !gl.O1() ? launchActivity.p0.getFragmentStack().size() <= 1 || !(launchActivity.p0.getFragmentStack().get(launchActivity.p0.getFragmentStack().size() - 1) instanceof ah6) : launchActivity.q0.getFragmentStack().isEmpty() || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof ah6), false);
        }
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    private final void b() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        kz5 kz5Var = (kz5) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        String str = LaunchActivity.C1;
        ArrayList arrayList = launchActivity.e0;
        if (launchActivity.isFinishing()) {
            return;
        }
        try {
            kz5Var.run();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (tL_error != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = k96.M0(R.string.AppName, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                hdVar.U = k96.M0(2131750670, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                hdVar.U = k96.M0(2131748884, null);
            } else {
                hdVar.U = k96.M0(2131748883, null);
            }
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
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
        na7.q1(i).a4(updates.users, false);
        na7.q1(i).U3(updates.chats, false);
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (arrayList.isEmpty() || na7.q1(i).A(bundle, (d) b00.f(1, arrayList), null, null)) {
            mu1 mu1Var = new mu1(bundle);
            kk7.f(i).k(kk7.s, new Object[0]);
            ((ActionBarLayout) launchActivity.N()).U(mu1Var, false, true);
        }
    }

    private final void c() {
        u21 b0;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        kz5 kz5Var = (kz5) this.f;
        String str2 = LaunchActivity.C1;
        d dVar = (d) b00.f(1, launchActivity.e0);
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
                na7.q1(i).U3(arrayList2, false);
                na7.q1(i).a4(arrayList, false);
                if (!z || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    ll4 ll4Var = new ll4(dVar, false);
                    ll4Var.T1 = -1;
                    ll4Var.X1 = "";
                    ll4Var.Y1 = new ArrayList();
                    ll4Var.a2 = "";
                    ll4Var.c2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ll4Var.d2 = arrayList3;
                    ll4Var.u2 = -1;
                    ll4Var.x2 = -5;
                    ll4Var.S1 = str;
                    ll4Var.U1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        ll4Var.X1 = tL_textWithEntities.text;
                        ll4Var.Y1 = tL_textWithEntities.entities;
                        ll4Var.Z1 = tL_chatlists_chatlistInvite2.title_noanimate;
                        ll4Var.b2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        ll4Var.b2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        ll4Var.e2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        ll4Var.T1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = dVar.getMessagesController().G0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i2 >= arrayList4.size()) {
                                    break;
                                }
                                t97 t97Var = (t97) arrayList4.get(i2);
                                if (t97Var.a == ll4Var.T1) {
                                    ll4Var.X1 = t97Var.b;
                                    ll4Var.Y1 = t97Var.c;
                                    ll4Var.Z1 = t97Var.n;
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    ll4Var.a1();
                    dVar.showDialog(ll4Var);
                    kz5Var.run();
                    return;
                }
                b0 = u21.b0(dVar);
            } else {
                b0 = u21.b0(dVar);
            }
            kz5Var.run();
            return;
        } catch (Exception e) {
            fa4.g(e, true);
            return;
        }
        yjb.x(null, 2131748017, b0, null);
    }

    private final void d() {
        sr9 sr9Var = (sr9) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.f;
        if (this.b == sr9Var.F) {
            sr9Var.d = arrayList;
            sr9Var.e = arrayList2;
            sr9Var.I = arrayList3;
            sr9Var.f.f(arrayList, null);
            sr9Var.E = false;
            sr9Var.f();
            sr9Var.F();
        }
    }

    private final void e() {
        TLObject tLObject = (TLObject) this.c;
        boolean[] zArr = (boolean[]) this.d;
        p8c p8cVar = (p8c) this.e;
        TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            p8cVar.a("SERVER_ERROR");
            return;
        }
        int i = this.b;
        TLRPC.User f = y6c.h(i).f();
        if (f != null) {
            f.emoji_status = updateemojistatus.emoji_status;
            kk7.f(i).k(kk7.o5, f);
            na7.q1(i).o5(f.id, f.emoji_status);
        }
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        p8cVar.a(null);
    }

    private final void f() {
        int i;
        rja rjaVar = (rja) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        k27 k27Var = (k27) this.e;
        gb2 gb2Var = (gb2) this.f;
        int[] iArr = rjaVar.e;
        RLottieNative[] rLottieNativeArr = rjaVar.g1;
        if (rjaVar.X0) {
            gl.d3(new pja(rjaVar, (byte) 2));
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
                    ba4.G(y6c.t0);
                    String v2 = gl.v2(ba4.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(v2)) {
                        gl.d3(new qja(document, i, k27Var, gb2Var, tL_messages_stickerSet, (byte) 1));
                        z = true;
                    } else {
                        rLottieNativeArr[i2] = RLottieNative.b(v2, iArr, null, null);
                        rjaVar.h1[i2] = iArr[0];
                    }
                }
            }
            i2++;
        }
        if (z) {
            gl.d3(new pja(rjaVar, (byte) 3));
        } else {
            gl.d3(new t79((Object) rjaVar, i, (Object) gb2Var, (byte) 10));
        }
    }

    private final void g() {
        u41 u41Var = (u41) this.c;
        fx0[] fx0VarArr = (fx0[]) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        u41Var.setLoading(false);
        fx0 fx0Var = fx0VarArr[0];
        if (fx0Var != null) {
            fx0Var.dismiss();
        }
        gta.v(this.b, false).O();
        d S = LaunchActivity.S();
        if (S != null) {
            u21.b0(S).V(Collections.singletonList(tLObject), k96.M0(2131744742, null), gl.T2(k96.a0(null, null, 2131744741, str)), null).k(false);
        }
    }

    private final void h() {
        mza mzaVar = (mza) this.c;
        int i = this.b;
        List list = (List) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        q68 q68Var = (q68) this.f;
        if (mzaVar.J == null || mzaVar.E) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f / mzaVar.J.getWidth(), 1.0f / mzaVar.J.getHeight());
        matrix.postTranslate(-0.5f, -0.5f);
        matrix.postRotate(i);
        matrix.postTranslate(0.5f, 0.5f);
        int i2 = (i / 90) % 2;
        Bitmap bitmap = mzaVar.J;
        if (i2 != 0) {
            matrix.postScale(bitmap.getHeight(), mzaVar.J.getWidth());
        } else {
            matrix.postScale(bitmap.getWidth(), mzaVar.J.getHeight());
        }
        byte b = 1;
        if (list.isEmpty()) {
            jza jzaVar = new jza(mzaVar);
            jzaVar.h.set(0.0f, 0.0f, mzaVar.J.getWidth(), mzaVar.J.getHeight());
            jzaVar.i.set(jzaVar.h);
            matrix.mapRect(jzaVar.i);
            jzaVar.c = i;
            Bitmap d = mzaVar.d(0, 0, mzaVar.J, false);
            jzaVar.d = d;
            if (d == null) {
                fa4.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                return;
            }
            jzaVar.f = jzaVar.c();
            mza.c(jzaVar, mzaVar.U, mzaVar.V);
            mzaVar.P = jzaVar.j;
            mzaVar.Q = jzaVar.k;
            arrayList.add(jzaVar);
            gl.d3(new exa((Object) mzaVar, (Object) arrayList, (Object) q68Var, (Object) jzaVar, (byte) 2));
            mzaVar.F = jzaVar;
            mzaVar.E = true;
            mzaVar.y = false;
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            lza lzaVar = (lza) list.get(i3);
            jza jzaVar2 = new jza(mzaVar);
            jzaVar2.h.set(lzaVar.b, lzaVar.c, r10 + lzaVar.d, r12 + lzaVar.e);
            jzaVar2.i.set(jzaVar2.h);
            matrix.mapRect(jzaVar2.i);
            jzaVar2.c = i;
            Bitmap d2 = mzaVar.d(lzaVar.b, lzaVar.c, lzaVar.a, false);
            jzaVar2.d = d2;
            if (d2 != null) {
                jzaVar2.f = jzaVar2.c();
                mza.c(jzaVar2, mzaVar.U, mzaVar.V);
                mzaVar.P = jzaVar2.j;
                mzaVar.Q = jzaVar2.k;
                arrayList.add(jzaVar2);
            }
        }
        mzaVar.F = null;
        mzaVar.E = true;
        mzaVar.y = false;
        gl.d3(new iya(mzaVar, arrayList, b));
    }

    private final void i() {
        hgb hgbVar = (hgb) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        vf6 vf6Var = (vf6) this.e;
        vf6 vf6Var2 = (vf6) this.f;
        ArrayList arrayList2 = hgbVar.o;
        vf6 vf6Var3 = hgbVar.i;
        vf6 vf6Var4 = hgbVar.h;
        ArrayList arrayList3 = hgbVar.g;
        if (this.b == hgbVar.c) {
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            vf6Var4.b();
            for (int i = 0; i < vf6Var.m(); i++) {
                vf6Var4.k((TLRPC.User) vf6Var.n(i), vf6Var.j(i));
            }
            vf6Var3.b();
            for (int i2 = 0; i2 < vf6Var2.m(); i2++) {
                vf6Var3.k((TLRPC.Chat) vf6Var2.n(i2), vf6Var2.j(i2));
            }
            hgbVar.e = true;
            hgbVar.f = false;
            if (hgbVar.d == 0 && !arrayList3.isEmpty()) {
                hgbVar.d = ((Long) arrayList3.get(0)).longValue();
            }
            ArrayList arrayList4 = new ArrayList(arrayList2);
            arrayList2.clear();
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                fgb fgbVar = (fgb) arrayList4.get(i3);
                hgbVar.c(fgbVar.a, fgbVar.b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x059c A[Catch: Exception -> 0x090b, TryCatch #1 {Exception -> 0x090b, blocks: (B:227:0x0545, B:229:0x054f, B:231:0x0555, B:232:0x0558, B:234:0x0596, B:236:0x059c, B:238:0x05a2, B:239:0x05a5, B:241:0x05aa, B:243:0x05b0, B:244:0x05b3, B:247:0x05bd, B:249:0x05c7, B:251:0x05d7, B:253:0x05e3, B:255:0x05ef, B:258:0x0637, B:260:0x063d, B:261:0x0640, B:263:0x0649, B:264:0x064c, B:265:0x0656, B:268:0x0660, B:274:0x0673, B:276:0x0679, B:284:0x06aa, B:286:0x06b0, B:400:0x05ff, B:402:0x060f, B:404:0x0619, B:406:0x0632, B:412:0x055e, B:414:0x0568, B:416:0x056e, B:417:0x0571, B:418:0x0575, B:420:0x057f, B:422:0x0585, B:424:0x058b, B:425:0x058e), top: B:226:0x0545 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05c7 A[Catch: Exception -> 0x090b, TryCatch #1 {Exception -> 0x090b, blocks: (B:227:0x0545, B:229:0x054f, B:231:0x0555, B:232:0x0558, B:234:0x0596, B:236:0x059c, B:238:0x05a2, B:239:0x05a5, B:241:0x05aa, B:243:0x05b0, B:244:0x05b3, B:247:0x05bd, B:249:0x05c7, B:251:0x05d7, B:253:0x05e3, B:255:0x05ef, B:258:0x0637, B:260:0x063d, B:261:0x0640, B:263:0x0649, B:264:0x064c, B:265:0x0656, B:268:0x0660, B:274:0x0673, B:276:0x0679, B:284:0x06aa, B:286:0x06b0, B:400:0x05ff, B:402:0x060f, B:404:0x0619, B:406:0x0632, B:412:0x055e, B:414:0x0568, B:416:0x056e, B:417:0x0571, B:418:0x0575, B:420:0x057f, B:422:0x0585, B:424:0x058b, B:425:0x058e), top: B:226:0x0545 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0660 A[Catch: Exception -> 0x090b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x090b, blocks: (B:227:0x0545, B:229:0x054f, B:231:0x0555, B:232:0x0558, B:234:0x0596, B:236:0x059c, B:238:0x05a2, B:239:0x05a5, B:241:0x05aa, B:243:0x05b0, B:244:0x05b3, B:247:0x05bd, B:249:0x05c7, B:251:0x05d7, B:253:0x05e3, B:255:0x05ef, B:258:0x0637, B:260:0x063d, B:261:0x0640, B:263:0x0649, B:264:0x064c, B:265:0x0656, B:268:0x0660, B:274:0x0673, B:276:0x0679, B:284:0x06aa, B:286:0x06b0, B:400:0x05ff, B:402:0x060f, B:404:0x0619, B:406:0x0632, B:412:0x055e, B:414:0x0568, B:416:0x056e, B:417:0x0571, B:418:0x0575, B:420:0x057f, B:422:0x0585, B:424:0x058b, B:425:0x058e), top: B:226:0x0545 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07eb A[Catch: Exception -> 0x093d, TryCatch #0 {Exception -> 0x093d, blocks: (B:289:0x06c6, B:291:0x06d3, B:292:0x06e2, B:294:0x06e6, B:296:0x06fd, B:297:0x0701, B:299:0x0707, B:300:0x070b, B:302:0x071a, B:303:0x072d, B:305:0x0733, B:307:0x073f, B:309:0x0749, B:311:0x0757, B:312:0x075d, B:314:0x0763, B:316:0x076d, B:318:0x077b, B:319:0x077f, B:321:0x0785, B:323:0x078f, B:325:0x079d, B:326:0x07a1, B:328:0x07a7, B:330:0x07ad, B:332:0x07b7, B:334:0x07bd, B:335:0x07c0, B:336:0x07c5, B:339:0x07cc, B:341:0x07d2, B:346:0x07e5, B:348:0x07eb, B:350:0x0801, B:357:0x0816, B:359:0x0820, B:361:0x0859, B:363:0x0870, B:364:0x0874, B:366:0x087a, B:367:0x087e, B:369:0x0888, B:370:0x0892, B:372:0x0898, B:373:0x08a2, B:376:0x08ab, B:378:0x08b1, B:380:0x08bb, B:382:0x08f4, B:383:0x0901, B:343:0x07e1, B:396:0x06db), top: B:288:0x06c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0801 A[Catch: Exception -> 0x093d, TryCatch #0 {Exception -> 0x093d, blocks: (B:289:0x06c6, B:291:0x06d3, B:292:0x06e2, B:294:0x06e6, B:296:0x06fd, B:297:0x0701, B:299:0x0707, B:300:0x070b, B:302:0x071a, B:303:0x072d, B:305:0x0733, B:307:0x073f, B:309:0x0749, B:311:0x0757, B:312:0x075d, B:314:0x0763, B:316:0x076d, B:318:0x077b, B:319:0x077f, B:321:0x0785, B:323:0x078f, B:325:0x079d, B:326:0x07a1, B:328:0x07a7, B:330:0x07ad, B:332:0x07b7, B:334:0x07bd, B:335:0x07c0, B:336:0x07c5, B:339:0x07cc, B:341:0x07d2, B:346:0x07e5, B:348:0x07eb, B:350:0x0801, B:357:0x0816, B:359:0x0820, B:361:0x0859, B:363:0x0870, B:364:0x0874, B:366:0x087a, B:367:0x087e, B:369:0x0888, B:370:0x0892, B:372:0x0898, B:373:0x08a2, B:376:0x08ab, B:378:0x08b1, B:380:0x08bb, B:382:0x08f4, B:383:0x0901, B:343:0x07e1, B:396:0x06db), top: B:288:0x06c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x05ba  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r9v21, types: [uk3, zr9] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        d Q;
        boolean z;
        String lowerCase;
        sa6 sa6Var;
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
        long j3 = 0;
        byte b8 = 2;
        Address address3 = null;
        byte b9 = 1;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                na7 na7Var = (na7) this.c;
                q34 q34Var = (q34) this.d;
                q34Var.b(na7Var.currentAccount, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                gl.d3(new h77(na7Var, q34Var, (byte) 1));
                break;
            case 1:
                int i6 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                if (LaunchActivity.E1 && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    h26 h26Var = new h26(11, i6, null, Q.getParentActivity(), Q);
                    h26Var.t1(chat, arrayList, arrayList2, arrayList3, null);
                    h26Var.show();
                    break;
                }
                break;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                hd hdVar = (hd) this.e;
                int i7 = this.b;
                d dVar = (d) this.f;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    hdVar.dismiss();
                    z = true;
                } catch (Exception e) {
                    z = true;
                    fa4.g(e, true);
                }
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(tL_help_support.user);
                ad7.Y(i7).j1(arrayList4, null, z, z);
                na7.q1(i7).Z3(tL_help_support.user, false, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                dVar.presentFragment(new mu1(bundle));
                break;
            case 3:
                hd[] hdVarArr = (hd[]) this.c;
                int[] iArr = (int[]) this.d;
                int i8 = this.b;
                vm1 vm1Var = (vm1) this.e;
                d dVar2 = (d) this.f;
                byte b10 = 0;
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    hdVar2.setOnCancelListener(new ff(iArr, i8, vm1Var, b10));
                    dVar2.showDialog(hdVarArr[0]);
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
                                if (indexOf == 0 || gl.I1(lowerCase.charAt(indexOf - 1))) {
                                    ow owVar = new ow();
                                    owVar.a = indexOf;
                                    owVar.c = pageBlock;
                                    owVar.b = obj;
                                    arrayList6.add(owVar);
                                }
                                i11 = length;
                            }
                        }
                    }
                }
                gl.d3(new tn6((Object) oVar, i9, (Object) arrayList6, (Object) str5, (byte) 4));
                break;
            case 5:
                sa6 sa6Var2 = (sa6) this.c;
                Locale locale2 = (Locale) this.d;
                String str6 = (String) this.e;
                Locale locale3 = (Locale) this.f;
                int i12 = this.b;
                sa6Var2.getClass();
                ArrayList arrayList7 = new ArrayList();
                try {
                    i2 = sa6Var2.e ? 10 : 5;
                    fromLocationName = new Geocoder(a.b, locale2).getFromLocationName(str6, 5);
                    fromLocationName2 = sa6Var2.d ? new Geocoder(a.b, locale3).getFromLocationName(str6, 5) : null;
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
                                sa6Var = sa6Var2;
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
                                list = fromLocationName2;
                                String str7 = locality;
                                if (address != null && TextUtils.isEmpty(address.getLocality())) {
                                    address.getAdminArea();
                                }
                                Address address5 = address;
                                String thoroughfare = address4.getThoroughfare();
                                i = i12;
                                if (TextUtils.isEmpty(thoroughfare)) {
                                    str2 = str6;
                                } else {
                                    str2 = str6;
                                    try {
                                    } catch (Exception unused2) {
                                        sa6Var = sa6Var2;
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
                                        if (sa6Var2.e) {
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
                                                tL_messageMediaVenue.address = k96.M0(2131747409, null);
                                                arrayList7.add(tL_messageMediaVenue);
                                            }
                                            sa6Var = sa6Var2;
                                        } else {
                                            if (sb6 == null || sb6.length() <= 0) {
                                                sb = sb3;
                                                sa6Var = sa6Var2;
                                                sb2 = sb4;
                                                address2 = address4;
                                            } else {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                sb = sb3;
                                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                tL_geoPoint2.lat = latitude;
                                                tL_geoPoint2._long = longitude;
                                                sa6Var = sa6Var2;
                                                try {
                                                    tL_messageMediaVenue2.query_id = -1L;
                                                    tL_messageMediaVenue2.title = sb6.toString();
                                                    tL_messageMediaVenue2.icon = "pin";
                                                    tL_messageMediaVenue2.address = b5 != 0 ? k96.M0(2131747402, null) : k96.M0(2131747267, null);
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
                                                                String[] strArr = eb6.Q;
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
                                                                    gl.d3(new tn6((Object) sa6Var, i, (Object) str2, (Object) arrayList7, (byte) 5));
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
                                                tL_messageMediaVenue3.emoji = eb6.b(address2.getCountryCode());
                                                hashSet2.add(tL_messageMediaVenue3.title);
                                                tL_messageMediaVenue3.address = k96.M0(2131747402, null);
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
                                                    gl.d3(new tn6((Object) sa6Var, i, (Object) str2, (Object) arrayList7, (byte) 5));
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
                                                tL_messageMediaVenue4.emoji = eb6.b(address2.getCountryCode());
                                                hashSet.add(tL_messageMediaVenue4.title);
                                                tL_messageMediaVenue4.address = k96.M0(2131751742, null);
                                                if (address5 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue4.geoAddress = tL_geoPointAddress8;
                                                    tL_geoPointAddress8.country_iso2 = address5.getCountryCode();
                                                }
                                                arrayList7.add(tL_messageMediaVenue4);
                                                if (arrayList7.size() >= i2) {
                                                    gl.d3(new tn6((Object) sa6Var, i, (Object) str2, (Object) arrayList7, (byte) 5));
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
                                        if (sa6Var2.e) {
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
                                if (sa6Var2.e) {
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
                            sa6Var2 = sa6Var;
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
                    sa6Var = sa6Var2;
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
                    sa6Var2 = sa6Var;
                    address3 = null;
                }
                sa6Var = sa6Var2;
                i = i12;
                str2 = str6;
                gl.d3(new tn6((Object) sa6Var, i, (Object) str2, (Object) arrayList7, (byte) 5));
                break;
            case 6:
                TLObject tLObject = (TLObject) this.c;
                int i16 = this.b;
                HashSet hashSet3 = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                d dVar3 = (d) this.f;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7.q1(i16).a4(updates.users, false);
                    na7.q1(i16).U3(updates.chats, false);
                    ArrayList x0 = na7.x0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = x0.size();
                    TLRPC.GroupCall groupCall = null;
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj2 = x0.get(i17);
                        i17++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    if (LaunchActivity.H1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        rgc.g(LaunchActivity.H1, i16, tL_inputGroupCall, false, groupCall, hashSet3);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    na7.q1(i16).a4(groupcall.users, false);
                    na7.q1(i16).U3(groupcall.chats, false);
                    if (LaunchActivity.H1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        rgc.g(LaunchActivity.H1, i16, tL_inputGroupCall2, false, groupCall2, hashSet3);
                        break;
                    }
                } else if (tL_error != null) {
                    u21.b0(dVar3).g0(tL_error, false);
                    break;
                }
                break;
            case 7:
                long[] jArr = (long[]) this.c;
                int i18 = this.b;
                be0 be0Var = (be0) this.d;
                be0 be0Var2 = (be0) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User V1 = na7.q1(i18).V1(Long.valueOf(jArr[0]));
                    pb0 pb0Var = new pb0((wjb) null);
                    pb0Var.q(V1);
                    be0Var.f(V1, pb0Var);
                } else {
                    TLRPC.Chat K0 = na7.q1(i18).K0(Long.valueOf(-jArr[0]));
                    pb0 pb0Var2 = new pb0((wjb) null);
                    pb0Var2.p(K0);
                    be0Var.f(K0, pb0Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User V12 = na7.q1(i18).V1(Long.valueOf(jArr[0]));
                    if (be0Var2 != null) {
                        pb0 pb0Var3 = new pb0((wjb) null);
                        pb0Var3.q(V12);
                        be0Var2.f(V12, pb0Var3);
                    }
                    if (textView != null) {
                        textView.setText(l7c.q(V12));
                        break;
                    }
                } else {
                    TLRPC.Chat K02 = na7.q1(i18).K0(Long.valueOf(-jArr[0]));
                    if (be0Var2 != null) {
                        pb0 pb0Var4 = new pb0((wjb) null);
                        pb0Var4.p(K02);
                        be0Var2.f(K02, pb0Var4);
                    }
                    if (textView != null) {
                        textView.setText(K02 != null ? K02.title : "");
                        break;
                    }
                }
                break;
            case 8:
                ((mu1) this.c).o9(this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 9:
                wt1 wt1Var = (wt1) this.c;
                pp1 pp1Var = (pp1) this.d;
                pp1Var.b = wt1Var.a.getMessagesController().p0(-((TLRPC.Chat) this.e).id, this.b, new rt1(wt1Var, pp1Var, (mu1) this.f));
                break;
            case 10:
                wt1 wt1Var2 = (wt1) this.c;
                int i19 = this.b;
                k27 k27Var = (k27) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                mu1 mu1Var = wt1Var2.a;
                mu1Var.gb(i19, k27Var.e1(), true, k27.B0(k27Var.k) == mu1Var.d7 ? 1 : 0, true, 0, num, bArr, new ht1(wt1Var2, k27Var, b9));
                break;
            case 11:
                ((sd3) this.c).a1((TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 12:
                final bl3 bl3Var = (bl3) this.c;
                int i20 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                ArrayList arrayList10 = (ArrayList) this.f;
                ?? r9 = bl3Var.k0;
                ?? r10 = bl3Var.w0;
                int i21 = bl3Var.t0;
                bl3Var.E0--;
                if (i20 == bl3Var.e0) {
                    bl3Var.g0 = i20;
                    if (bl3Var.f0 != i20) {
                        r9.b();
                    }
                    if (bl3Var.h0 != i20) {
                        bl3Var.J.clear();
                    }
                    bl3Var.O = true;
                    int i22 = 0;
                    while (i22 < arrayList8.size()) {
                        if (!bl3Var.F(arrayList8.get(i22))) {
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
                            na7.q1(i21).Z3(user, true, z3);
                            j = user.id;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            na7.q1(i21).S3(chat2, true);
                            j = -chat2.id;
                        } else {
                            if (obj3 instanceof TLRPC.EncryptedChat) {
                                na7.q1(i21).W3((TLRPC.EncryptedChat) obj3, true);
                            }
                            j = j3;
                        }
                        long j4 = j3;
                        if (j == j3 || ((TLRPC.Dialog) na7.q1(i21).R.f(j)) != null) {
                            z2 = z3;
                            j2 = j;
                        } else {
                            ad7 Y = ad7.Y(i21);
                            z2 = z3;
                            j2 = j;
                            Y.a.c(new dc7(Y, j2, new uc7() { // from class: tk3
                                @Override // uc7
                                public final void a(int i24) {
                                    int i25 = bl3.this.t0;
                                    if (i24 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j5 = j;
                                        tL_dialog.id = j5;
                                        if (i24 != 0) {
                                            tL_dialog.folder_id = i24;
                                        }
                                        Object obj4 = obj3;
                                        if (obj4 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = hc2.T((TLRPC.Chat) obj4) ? 1 : 0;
                                        }
                                        na7.q1(i25).R.k(tL_dialog, j5);
                                        na7.q1(i25).y.add(tL_dialog);
                                        na7.q1(i25).Y4(null);
                                    }
                                }
                            }, (byte) 1));
                        }
                        if (bl3Var.R() && !(obj3 instanceof TLRPC.EncryptedChat)) {
                            ji3 ji3Var = bl3Var.V;
                            ?? r4 = z2;
                            char c = (ji3Var == null || ji3Var.a() != j2) ? z2 : 1;
                            while (true) {
                                if (c != 0) {
                                    arrayList8.remove(i23);
                                    arrayList9.remove(i23);
                                    i23--;
                                } else if (r4 < size3) {
                                    al3 al3Var = (al3) r10.get(r4);
                                    if (al3Var != null && al3Var.c == j2) {
                                        c = 1;
                                    }
                                    c = c;
                                    r4++;
                                }
                            }
                        }
                        i23++;
                        j3 = j4;
                        z3 = z2;
                    }
                    boolean z5 = z3;
                    na7.q1(i21).a4(arrayList10, true);
                    bl3Var.s = arrayList8;
                    bl3Var.H = arrayList9;
                    r9.f(arrayList8, r10);
                    bl3Var.f();
                    ji3 ji3Var2 = bl3Var.V;
                    if (ji3Var2 != null) {
                        ji3Var2.d(bl3Var.E0 > 0 ? true : z5, true);
                        bl3Var.V.c();
                        break;
                    }
                }
                break;
            case 13:
                int i24 = this.b;
                int[] iArr2 = (int[]) this.c;
                xm3 xm3Var = (xm3) this.d;
                ba4 ba4Var = (ba4) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f;
                kk7 f = kk7.f(i24);
                for (int i25 = 0; i25 < 3; i25++) {
                    f.a(xm3Var, iArr2[i25]);
                }
                ba4Var.X(document, "speech_model", 3, 1);
                break;
            case 14:
                tv4 tv4Var = (tv4) this.c;
                Context context = (Context) this.d;
                int i26 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                p8c p8cVar = (p8c) this.f;
                long j5 = tv4Var.W1;
                av4 av4Var = new av4(tv4Var, p8cVar, b8);
                boolean z6 = starGift.limited;
                new ev4(tv4Var, context, i26, starGift, j5, av4Var, z6 && (disallowedGiftsSettings2 = tv4Var.V1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z6 && (disallowedGiftsSettings = tv4Var.V1) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 15:
                a();
                break;
            case 16:
                b();
                break;
            case 17:
                c();
                break;
            case 18:
                ((a46) this.c).v((String) this.d, this.b + 1, (String) this.e, (String) this.f);
                break;
            case 19:
                ve6 ve6Var = (ve6) this.c;
                String str9 = (String) this.d;
                String str10 = (String) this.e;
                String str11 = (String) this.f;
                int i27 = this.b;
                ArrayList arrayList11 = new ArrayList();
                i5 i5Var = new i5();
                i5Var.b = "inapp";
                i5Var.a = str9;
                arrayList11.add(i5Var.a());
                fa4.b("LoginBilling querying \"" + str9 + "\" product");
                ci0.h().o(arrayList11, new gg(ve6Var, str9, str10, str11, i27));
                break;
            case 20:
                by6 by6Var = (by6) this.c;
                Pair pair = (Pair) this.d;
                by6Var.b.i.O(((Integer) pair.first).intValue(), (rx6) pair.second, (f86) this.e, (fr6) this.f, this.b);
                break;
            case 21:
                kk7 kk7Var = (kk7) this.c;
                View view = (View) this.d;
                dk7 dk7Var = (dk7) this.e;
                ck7 ck7Var = (ck7) this.f;
                int i28 = this.b;
                view.removeOnAttachStateChangeListener(dk7Var);
                kk7Var.n(ck7Var, i28);
                break;
            case 22:
                d();
                break;
            case 23:
                e();
                break;
            case 24:
                f();
                break;
            case 25:
                g();
                break;
            case 26:
                h();
                break;
            case 27:
                i();
                break;
            case 28:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$36((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            default:
                int[] iArr3 = (int[]) this.c;
                int i29 = this.b;
                pb0 pb0Var5 = (pb0) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                be0 be0Var3 = (be0) this.f;
                iArr3[0] = i29;
                pb0Var5.q(user2);
                be0Var3.f(user2, pb0Var5);
                break;
        }
    }

    public /* synthetic */ i57(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ i57(Object obj, Object obj2, int i, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ i57(Object obj, Object obj2, Object obj3, int i, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
    }

    public /* synthetic */ i57(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }
}
