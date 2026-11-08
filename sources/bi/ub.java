package bi;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.er;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.sr;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.vo;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.yr;
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
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.gm;
import org.telegram.ui.hi;
import org.telegram.ui.hw;
import org.telegram.ui.je0;
import org.telegram.ui.jn0;
import org.telegram.ui.jo0;
import org.telegram.ui.ld0;
import org.telegram.ui.lm;
import org.telegram.ui.p90;
import org.telegram.ui.q10;
import org.telegram.ui.vl;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ub(int i7, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 13;
        this.b = i7;
        this.c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    private final void a() {
        int i7;
        int i10;
        zt0 zt0Var = (zt0) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        ij ijVar = (ij) this.e;
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
        int[] iArr = zt0Var.e;
        RLottieNative[] rLottieNativeArr = zt0Var.f1;
        if (zt0Var.W0) {
            org.telegram.messenger.g0.h3(new xt0(zt0Var, 2));
            return;
        }
        boolean z9 = false;
        int i11 = 0;
        while (true) {
            int length = rLottieNativeArr.length;
            i7 = this.b;
            if (i11 >= length) {
                break;
            }
            if (rLottieNativeArr[i11] == null) {
                if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 1) {
                    i10 = 8;
                } else {
                    i10 = 2;
                    if (i11 == 2) {
                        i10 = 14;
                    } else if (i11 == 3) {
                        i10 = 20;
                    }
                }
                if (i10 < tL_messages_stickerSet.documents.size()) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                    org.telegram.messenger.w7.G(p10.s0);
                    String y22 = org.telegram.messenger.g0.y2(org.telegram.messenger.w7.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(y22)) {
                        org.telegram.messenger.g0.h3(new yt0(document, i7, ijVar, q1Var, tL_messages_stickerSet, 1));
                        z9 = true;
                    } else {
                        rLottieNativeArr[i11] = RLottieNative.b(y22, iArr, null, null);
                        zt0Var.g1[i11] = iArr[0];
                    }
                }
            }
            i11++;
        }
        if (z9) {
            org.telegram.messenger.g0.h3(new xt0(zt0Var, 3));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.q8(zt0Var, i7, q1Var, 20));
        }
    }

    private final void b() {
        boolean z9;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.e;
        Uri uri = (Uri) this.d;
        org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f;
        String str = LaunchActivity.B1;
        if (launchActivity.isFinishing()) {
            return;
        }
        if (tLObject == null || launchActivity.o0 == null) {
            if (launchActivity.W == null) {
                launchActivity.W = new ArrayList();
            }
            launchActivity.W.add(0, launchActivity.X);
            launchActivity.X = null;
            launchActivity.j0(true);
        } else {
            TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
            Bundle k10 = a8.p0.k("onlySelect", true);
            k10.putString("importTitle", tL_messages_historyImportParsed.title);
            k10.putBoolean("allowSwitchAccount", true);
            if (tL_messages_historyImportParsed.pm) {
                k10.putInt("dialogsType", 12);
            } else if (tL_messages_historyImportParsed.group) {
                k10.putInt("dialogsType", 11);
            } else {
                String uri2 = uri.toString();
                int i7 = this.b;
                Iterator it = qp.s1(i7).X3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z9 = false;
                        break;
                    } else if (uri2.contains((String) it.next())) {
                        k10.putInt("dialogsType", 12);
                        z9 = true;
                        break;
                    }
                }
                if (!z9) {
                    Iterator it2 = qp.s1(i7).W3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (uri2.contains((String) it2.next())) {
                            k10.putInt("dialogsType", 11);
                            z9 = true;
                            break;
                        }
                    }
                    if (!z9) {
                        k10.putInt("dialogsType", 13);
                    }
                }
            }
            if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, true);
            } else if (org.telegram.ui.g4.G() && org.telegram.ui.g4.v().V) {
                org.telegram.ui.g4.v().m(false, true);
            }
            fi.va.w();
            c40 c40Var = c40.u5;
            if (c40Var != null) {
                c40Var.dismiss();
            }
            if (org.telegram.messenger.g0.Q1()) {
                launchActivity.o0.X(true, true);
                launchActivity.q0.X(true, true);
            }
            ww wwVar = new ww(k10);
            wwVar.C2 = launchActivity;
            ((ActionBarLayout) launchActivity.M()).V(wwVar, !org.telegram.messenger.g0.Q1() ? launchActivity.o0.getFragmentStack().size() <= 1 || !(launchActivity.o0.getFragmentStack().get(launchActivity.o0.getFragmentStack().size() - 1) instanceof je0) : launchActivity.p0.getFragmentStack().isEmpty() || !(launchActivity.p0.getFragmentStack().get(launchActivity.p0.getFragmentStack().size() - 1) instanceof je0), false);
        }
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    private final void c() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        q10 q10Var = (q10) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        ArrayList arrayList = launchActivity.d0;
        if (launchActivity.isFinishing()) {
            return;
        }
        try {
            q10Var.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tL_error != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                u1Var.T = org.telegram.messenger.id.M0(2131750688, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                u1Var.T = org.telegram.messenger.id.M0(2131749077, null);
            } else {
                u1Var.T = org.telegram.messenger.id.M0(2131749076, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
            launchActivity.F0(alertDialog$Builder);
            return;
        }
        if (launchActivity.o0 == null || updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        int i7 = this.b;
        qp.s1(i7).Y3(updates.users, false);
        qp.s1(i7).S3(updates.chats, false);
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (arrayList.isEmpty() || qp.s1(i7).E(bundle, (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList), null, null)) {
            an anVar = new an(bundle);
            qs.f(i7).k(qs.t, new Object[0]);
            ((ActionBarLayout) launchActivity.M()).V(anVar, false, true);
        }
    }

    private final void d() {
        org.telegram.ui.Components.hc a02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        q10 q10Var = (q10) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity.d0);
        try {
            if (tLObject instanceof TL_chatlists.chatlist_ChatlistInvite) {
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject;
                boolean z9 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                if (z9) {
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
                int i7 = this.b;
                int i10 = 0;
                qp.s1(i7).S3(arrayList2, false);
                qp.s1(i7).Y3(arrayList, false);
                if (!z9 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    wz wzVar = new wz(f2Var, false);
                    wzVar.Q1 = -1;
                    wzVar.U1 = "";
                    wzVar.V1 = new ArrayList();
                    wzVar.X1 = "";
                    wzVar.Z1 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    wzVar.a2 = arrayList3;
                    wzVar.r2 = -1;
                    wzVar.u2 = -5;
                    wzVar.P1 = str;
                    wzVar.R1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z9) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        wzVar.U1 = tL_textWithEntities.text;
                        wzVar.V1 = tL_textWithEntities.entities;
                        wzVar.W1 = tL_chatlists_chatlistInvite2.title_noanimate;
                        wzVar.Y1 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        wzVar.Y1 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        wzVar.b2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        wzVar.Q1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = f2Var.getMessagesController().P0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                }
                                vo voVar = (vo) arrayList4.get(i10);
                                if (voVar.a == wzVar.Q1) {
                                    wzVar.U1 = voVar.b;
                                    wzVar.V1 = voVar.c;
                                    wzVar.W1 = voVar.n;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    wzVar.f1();
                    f2Var.showDialog(wzVar);
                    q10Var.run();
                    return;
                }
                a02 = org.telegram.ui.Components.hc.a0(f2Var);
            } else {
                a02 = org.telegram.ui.Components.hc.a0(f2Var);
            }
            q10Var.run();
            return;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return;
        }
        org.telegram.messenger.k5.p(null, 2131748210, a02, null);
    }

    private final void f() {
        ((p90) this.c).v((String) this.f, this.b + 1, (String) this.d, (String) this.e);
    }

    private final void g() {
        ld0 ld0Var = (ld0) this.c;
        String str = (String) this.f;
        String str2 = (String) this.d;
        String str3 = (String) this.e;
        ArrayList arrayList = new ArrayList();
        f5.a aVar = new f5.a();
        aVar.b = "inapp";
        aVar.a = str;
        arrayList.add(aVar.a());
        org.telegram.messenger.a8.b("LoginBilling querying \"" + str + "\" product");
        org.telegram.messenger.r1.i().o(arrayList, new i6(ld0Var, str, str2, str3, this.b));
    }

    private final void h() {
        int[] iArr = (int[]) this.c;
        org.telegram.ui.Components.w8 w8Var = (org.telegram.ui.Components.w8) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.f;
        iArr[0] = this.b;
        w8Var.r(user);
        l9Var.e(user, w8Var);
    }

    private final void i() {
        p4.m0 m0Var = (p4.m0) this.c;
        p4.i1 i1Var = (p4.i1) this.d;
        q4.r rVar = (q4.r) this.e;
        p4.l0 l0Var = (p4.l0) this.f;
        ui.e eVar = m0Var.g;
        if (m0Var.h.j()) {
            return;
        }
        boolean isActive = ((q4.l) m0Var.n.b).a.isActive();
        int i7 = this.b;
        if (!isActive) {
            StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
            sb2.append(i1Var == null ? Integer.valueOf(i7) : i1Var.b);
            sb2.append(", pid=");
            sb2.append(rVar.a.b);
            h2.a.l("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        p4.v m0 = m0Var.m0(rVar);
        if (i1Var != null) {
            if (!eVar.I(m0, i1Var)) {
                return;
            }
        } else if (!eVar.H(m0, i7)) {
            return;
        }
        try {
            l0Var.f(m0);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
        }
    }

    private final void j() {
        tg.c2 c2Var = (tg.c2) this.c;
        int i7 = this.b;
        List list = (List) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        jn0 jn0Var = (jn0) this.f;
        if (c2Var.I == null || c2Var.D) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f / c2Var.I.getWidth(), 1.0f / c2Var.I.getHeight());
        matrix.postTranslate(-0.5f, -0.5f);
        matrix.postRotate(i7);
        matrix.postTranslate(0.5f, 0.5f);
        if ((i7 / 90) % 2 != 0) {
            matrix.postScale(c2Var.I.getHeight(), c2Var.I.getWidth());
        } else {
            matrix.postScale(c2Var.I.getWidth(), c2Var.I.getHeight());
        }
        if (list.isEmpty()) {
            tg.z1 z1Var = new tg.z1(c2Var);
            z1Var.h.set(0.0f, 0.0f, c2Var.I.getWidth(), c2Var.I.getHeight());
            z1Var.i.set(z1Var.h);
            matrix.mapRect(z1Var.i);
            z1Var.c = i7;
            Bitmap d = c2Var.d(0, 0, c2Var.I, false);
            z1Var.d = d;
            if (d == null) {
                org.telegram.messenger.a8.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                return;
            }
            z1Var.f = z1Var.c();
            tg.c2.c(z1Var, c2Var.T, c2Var.U);
            c2Var.O = z1Var.j;
            c2Var.P = z1Var.k;
            arrayList.add(z1Var);
            org.telegram.messenger.g0.h3(new jo0(c2Var, arrayList, jn0Var, z1Var, 27));
            c2Var.E = z1Var;
            c2Var.D = true;
            c2Var.y = false;
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            tg.b2 b2Var = (tg.b2) list.get(i10);
            tg.z1 z1Var2 = new tg.z1(c2Var);
            z1Var2.h.set(b2Var.b, b2Var.c, r12 + b2Var.d, r14 + b2Var.e);
            z1Var2.i.set(z1Var2.h);
            matrix.mapRect(z1Var2.i);
            z1Var2.c = i7;
            Bitmap d2 = c2Var.d(b2Var.b, b2Var.c, b2Var.a, false);
            z1Var2.d = d2;
            if (d2 != null) {
                z1Var2.f = z1Var2.c();
                tg.c2.c(z1Var2, c2Var.T, c2Var.U);
                c2Var.O = z1Var2.j;
                c2Var.P = z1Var2.k;
                arrayList.add(z1Var2);
            }
        }
        c2Var.E = null;
        c2Var.D = true;
        c2Var.y = false;
        org.telegram.messenger.g0.h3(new org.telegram.ui.web.w(22, c2Var, arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:262:0x05ee A[Catch: Exception -> 0x0577, TryCatch #4 {Exception -> 0x0577, blocks: (B:242:0x055f, B:244:0x056e, B:247:0x057d, B:249:0x0587, B:250:0x058a, B:253:0x059a, B:255:0x05a4, B:257:0x05aa, B:258:0x05ad, B:260:0x05e8, B:262:0x05ee, B:264:0x05f4, B:265:0x05f7, B:267:0x05fc, B:269:0x0602, B:270:0x0605, B:273:0x060e, B:275:0x0618, B:277:0x0628, B:279:0x0634, B:281:0x0640, B:285:0x0689, B:287:0x068f, B:288:0x0692, B:290:0x069b, B:291:0x069e, B:292:0x06a8, B:295:0x06b0, B:301:0x06c3, B:303:0x06c9, B:310:0x06fa, B:312:0x0700, B:314:0x071e, B:315:0x072f, B:317:0x0733, B:319:0x0748, B:320:0x074e, B:322:0x0754, B:323:0x0758, B:325:0x075e, B:326:0x0762, B:328:0x0771, B:437:0x0727, B:439:0x0651, B:441:0x0661, B:443:0x066b, B:445:0x0684, B:451:0x05b2, B:453:0x05bc, B:455:0x05c2, B:456:0x05c5, B:457:0x05c9, B:459:0x05d3, B:461:0x05d9, B:463:0x05df, B:464:0x05e2), top: B:241:0x055f }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0618 A[Catch: Exception -> 0x0577, TryCatch #4 {Exception -> 0x0577, blocks: (B:242:0x055f, B:244:0x056e, B:247:0x057d, B:249:0x0587, B:250:0x058a, B:253:0x059a, B:255:0x05a4, B:257:0x05aa, B:258:0x05ad, B:260:0x05e8, B:262:0x05ee, B:264:0x05f4, B:265:0x05f7, B:267:0x05fc, B:269:0x0602, B:270:0x0605, B:273:0x060e, B:275:0x0618, B:277:0x0628, B:279:0x0634, B:281:0x0640, B:285:0x0689, B:287:0x068f, B:288:0x0692, B:290:0x069b, B:291:0x069e, B:292:0x06a8, B:295:0x06b0, B:301:0x06c3, B:303:0x06c9, B:310:0x06fa, B:312:0x0700, B:314:0x071e, B:315:0x072f, B:317:0x0733, B:319:0x0748, B:320:0x074e, B:322:0x0754, B:323:0x0758, B:325:0x075e, B:326:0x0762, B:328:0x0771, B:437:0x0727, B:439:0x0651, B:441:0x0661, B:443:0x066b, B:445:0x0684, B:451:0x05b2, B:453:0x05bc, B:455:0x05c2, B:456:0x05c5, B:457:0x05c9, B:459:0x05d3, B:461:0x05d9, B:463:0x05df, B:464:0x05e2), top: B:241:0x055f }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x068f A[Catch: Exception -> 0x0577, TryCatch #4 {Exception -> 0x0577, blocks: (B:242:0x055f, B:244:0x056e, B:247:0x057d, B:249:0x0587, B:250:0x058a, B:253:0x059a, B:255:0x05a4, B:257:0x05aa, B:258:0x05ad, B:260:0x05e8, B:262:0x05ee, B:264:0x05f4, B:265:0x05f7, B:267:0x05fc, B:269:0x0602, B:270:0x0605, B:273:0x060e, B:275:0x0618, B:277:0x0628, B:279:0x0634, B:281:0x0640, B:285:0x0689, B:287:0x068f, B:288:0x0692, B:290:0x069b, B:291:0x069e, B:292:0x06a8, B:295:0x06b0, B:301:0x06c3, B:303:0x06c9, B:310:0x06fa, B:312:0x0700, B:314:0x071e, B:315:0x072f, B:317:0x0733, B:319:0x0748, B:320:0x074e, B:322:0x0754, B:323:0x0758, B:325:0x075e, B:326:0x0762, B:328:0x0771, B:437:0x0727, B:439:0x0651, B:441:0x0661, B:443:0x066b, B:445:0x0684, B:451:0x05b2, B:453:0x05bc, B:455:0x05c2, B:456:0x05c5, B:457:0x05c9, B:459:0x05d3, B:461:0x05d9, B:463:0x05df, B:464:0x05e2), top: B:241:0x055f }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x069b A[Catch: Exception -> 0x0577, TryCatch #4 {Exception -> 0x0577, blocks: (B:242:0x055f, B:244:0x056e, B:247:0x057d, B:249:0x0587, B:250:0x058a, B:253:0x059a, B:255:0x05a4, B:257:0x05aa, B:258:0x05ad, B:260:0x05e8, B:262:0x05ee, B:264:0x05f4, B:265:0x05f7, B:267:0x05fc, B:269:0x0602, B:270:0x0605, B:273:0x060e, B:275:0x0618, B:277:0x0628, B:279:0x0634, B:281:0x0640, B:285:0x0689, B:287:0x068f, B:288:0x0692, B:290:0x069b, B:291:0x069e, B:292:0x06a8, B:295:0x06b0, B:301:0x06c3, B:303:0x06c9, B:310:0x06fa, B:312:0x0700, B:314:0x071e, B:315:0x072f, B:317:0x0733, B:319:0x0748, B:320:0x074e, B:322:0x0754, B:323:0x0758, B:325:0x075e, B:326:0x0762, B:328:0x0771, B:437:0x0727, B:439:0x0651, B:441:0x0661, B:443:0x066b, B:445:0x0684, B:451:0x05b2, B:453:0x05bc, B:455:0x05c2, B:456:0x05c5, B:457:0x05c9, B:459:0x05d3, B:461:0x05d9, B:463:0x05df, B:464:0x05e2), top: B:241:0x055f }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06b0 A[Catch: Exception -> 0x0577, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0577, blocks: (B:242:0x055f, B:244:0x056e, B:247:0x057d, B:249:0x0587, B:250:0x058a, B:253:0x059a, B:255:0x05a4, B:257:0x05aa, B:258:0x05ad, B:260:0x05e8, B:262:0x05ee, B:264:0x05f4, B:265:0x05f7, B:267:0x05fc, B:269:0x0602, B:270:0x0605, B:273:0x060e, B:275:0x0618, B:277:0x0628, B:279:0x0634, B:281:0x0640, B:285:0x0689, B:287:0x068f, B:288:0x0692, B:290:0x069b, B:291:0x069e, B:292:0x06a8, B:295:0x06b0, B:301:0x06c3, B:303:0x06c9, B:310:0x06fa, B:312:0x0700, B:314:0x071e, B:315:0x072f, B:317:0x0733, B:319:0x0748, B:320:0x074e, B:322:0x0754, B:323:0x0758, B:325:0x075e, B:326:0x0762, B:328:0x0771, B:437:0x0727, B:439:0x0651, B:441:0x0661, B:443:0x066b, B:445:0x0684, B:451:0x05b2, B:453:0x05bc, B:455:0x05c2, B:456:0x05c5, B:457:0x05c9, B:459:0x05d3, B:461:0x05d9, B:463:0x05df, B:464:0x05e2), top: B:241:0x055f }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x084b A[Catch: Exception -> 0x099e, TryCatch #1 {Exception -> 0x099e, blocks: (B:331:0x0779, B:332:0x0786, B:334:0x078c, B:336:0x0798, B:338:0x07a0, B:340:0x07aa, B:342:0x07b8, B:343:0x07be, B:345:0x07c4, B:347:0x07ce, B:349:0x07dc, B:350:0x07e0, B:352:0x07e6, B:354:0x07f0, B:356:0x07fe, B:357:0x0802, B:359:0x0808, B:361:0x080e, B:363:0x0818, B:365:0x081e, B:366:0x0821, B:367:0x0826, B:370:0x082d, B:372:0x0833, B:377:0x0845, B:379:0x084b, B:381:0x0861, B:388:0x0872, B:390:0x087e, B:392:0x08b7, B:394:0x08cc, B:395:0x08d2, B:397:0x08d8, B:398:0x08dc, B:400:0x08e2, B:401:0x08e6, B:403:0x08f0, B:404:0x08fc, B:406:0x0902, B:408:0x090c, B:412:0x0919, B:414:0x091f, B:416:0x092b, B:418:0x0964, B:419:0x0971, B:374:0x0841), top: B:330:0x0779 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0861 A[Catch: Exception -> 0x099e, TryCatch #1 {Exception -> 0x099e, blocks: (B:331:0x0779, B:332:0x0786, B:334:0x078c, B:336:0x0798, B:338:0x07a0, B:340:0x07aa, B:342:0x07b8, B:343:0x07be, B:345:0x07c4, B:347:0x07ce, B:349:0x07dc, B:350:0x07e0, B:352:0x07e6, B:354:0x07f0, B:356:0x07fe, B:357:0x0802, B:359:0x0808, B:361:0x080e, B:363:0x0818, B:365:0x081e, B:366:0x0821, B:367:0x0826, B:370:0x082d, B:372:0x0833, B:377:0x0845, B:379:0x084b, B:381:0x0861, B:388:0x0872, B:390:0x087e, B:392:0x08b7, B:394:0x08cc, B:395:0x08d2, B:397:0x08d8, B:398:0x08dc, B:400:0x08e2, B:401:0x08e6, B:403:0x08f0, B:404:0x08fc, B:406:0x0902, B:408:0x090c, B:412:0x0919, B:414:0x091f, B:416:0x092b, B:418:0x0964, B:419:0x0971, B:374:0x0841), top: B:330:0x0779 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x060c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        jg.c cVar;
        int i7;
        String str;
        int i10;
        List<Address> fromLocationName;
        List<Address> fromLocationName2;
        HashSet hashSet;
        HashSet hashSet2;
        int i11;
        Locale locale;
        String str2;
        List<Address> list;
        List<Address> list2;
        HashSet hashSet3;
        int i12;
        HashSet hashSet4;
        StringBuilder sb2;
        StringBuilder sb3;
        String str3;
        String thoroughfare;
        Address address;
        boolean z9;
        boolean z10;
        String countryName;
        StringBuilder sb4;
        HashSet hashSet5;
        boolean z11;
        StringBuilder sb5;
        boolean z12;
        String str4;
        int i13;
        long j3;
        final long j10;
        long j11;
        boolean z13;
        int i14;
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.f2 Q;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        String str5 = "";
        Address address2 = null;
        boolean z14 = true;
        char c11 = 1;
        char c12 = 1;
        int i15 = 0;
        switch (this.a) {
            case 0:
                fi.d dVar = (fi.d) this.c;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.d;
                int i16 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str6 = (String) this.f;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.v2 v2Var = v2VarArr[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                }
                ea.y(i16, false).R();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.hc.a0(T).V(Collections.singletonList(tLObject), org.telegram.messenger.id.M0(2131744982, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744981, str6)), null).k(false);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) this.c;
                int i17 = this.b;
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.d;
                org.telegram.ui.Components.l9 l9Var2 = (org.telegram.ui.Components.l9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User a22 = qp.s1(i17).a2(Long.valueOf(jArr[0]));
                    org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                    w8Var.r(a22);
                    l9Var.e(a22, w8Var);
                } else {
                    TLRPC.Chat M0 = qp.s1(i17).M0(Long.valueOf(-jArr[0]));
                    org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                    w8Var2.q(M0);
                    l9Var.e(M0, w8Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User a23 = qp.s1(i17).a2(Long.valueOf(jArr[0]));
                    if (l9Var2 != null) {
                        org.telegram.ui.Components.w8 w8Var3 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                        w8Var3.r(a23);
                        l9Var2.e(a23, w8Var3);
                    }
                    if (textView != null) {
                        textView.setText(t10.p(a23));
                        break;
                    }
                } else {
                    TLRPC.Chat M02 = qp.s1(i17).M0(Long.valueOf(-jArr[0]));
                    if (l9Var2 != null) {
                        org.telegram.ui.Components.w8 w8Var4 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                        w8Var4.q(M02);
                        l9Var2.e(M02, w8Var4);
                    }
                    if (textView != null) {
                        textView.setText(M02 == null ? "" : M02.title);
                        break;
                    }
                }
                break;
            case 2:
                TLObject tLObject2 = (TLObject) this.e;
                boolean[] zArr = (boolean[]) this.c;
                c20 c20Var = (c20) this.d;
                int i18 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User f10 = p10.i(i18).f();
                    if (f10 != null) {
                        f10.emoji_status = updateemojistatus.emoji_status;
                        c10 = 0;
                        qs.f(i18).k(qs.m5, f10);
                        qp.s1(i18).j5(f10.id, f10.emoji_status);
                    } else {
                        c10 = 0;
                    }
                    if (!zArr[c10]) {
                        zArr[c10] = true;
                        c20Var.a(null);
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    c20Var.a("SERVER_ERROR");
                    break;
                }
                break;
            case 3:
                jg.c cVar2 = (jg.c) this.c;
                Locale locale2 = (Locale) this.d;
                String str7 = (String) this.f;
                Locale locale3 = (Locale) this.e;
                int i19 = this.b;
                cVar2.getClass();
                ArrayList arrayList = new ArrayList();
                try {
                    i10 = cVar2.e ? 10 : 5;
                    fromLocationName = new Geocoder(org.telegram.messenger.t0.b, locale2).getFromLocationName(str7, 5);
                    fromLocationName2 = cVar2.d ? new Geocoder(org.telegram.messenger.t0.b, locale3).getFromLocationName(str7, 5) : null;
                    hashSet = new HashSet();
                    hashSet2 = new HashSet();
                    i11 = 0;
                } catch (Exception unused) {
                }
                while (i11 < fromLocationName.size()) {
                    Address address3 = fromLocationName.get(i11);
                    Address address4 = (fromLocationName2 == null || i11 >= fromLocationName2.size()) ? address2 : fromLocationName2.get(i11);
                    if (address3.hasLatitude() && address3.hasLongitude()) {
                        HashSet hashSet6 = hashSet;
                        double latitude = address3.getLatitude();
                        str2 = str5;
                        list = fromLocationName2;
                        double longitude = address3.getLongitude();
                        locale = locale2;
                        StringBuilder sb6 = new StringBuilder();
                        i7 = i19;
                        try {
                            sb2 = new StringBuilder();
                            str = str7;
                            try {
                                sb3 = new StringBuilder();
                                String locality = address3.getLocality();
                                if (TextUtils.isEmpty(locality)) {
                                    locality = address3.getAdminArea();
                                }
                                list2 = fromLocationName;
                                str3 = locality;
                                if (address4 != null && TextUtils.isEmpty(address4.getLocality())) {
                                    address4.getAdminArea();
                                }
                                i12 = i11;
                                thoroughfare = address3.getThoroughfare();
                                address = address4;
                            } catch (Exception unused2) {
                                cVar = cVar2;
                            }
                        } catch (Exception unused3) {
                            cVar = cVar2;
                        }
                        if (TextUtils.isEmpty(thoroughfare) || TextUtils.equals(thoroughfare, address3.getAdminArea())) {
                            String subLocality = address3.getSubLocality();
                            if (TextUtils.isEmpty(subLocality)) {
                                String locality2 = address3.getLocality();
                                if (TextUtils.isEmpty(locality2) || TextUtils.equals(locality2, str3)) {
                                    z9 = true;
                                    sb3 = null;
                                    if (TextUtils.isEmpty(str3)) {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(str3);
                                        if (sb3 != null) {
                                            if (sb3.length() > 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(str3);
                                        }
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    boolean z15 = z9;
                                    countryName = address3.getCountryName();
                                    if (TextUtils.isEmpty(countryName)) {
                                        sb4 = sb3;
                                        z11 = z10;
                                        if (!"US".equals(address3.getCountryCode()) && !"AE".equals(address3.getCountryCode()) && (!"GB".equals(address3.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                            hashSet5 = hashSet2;
                                            str4 = countryName;
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(str4);
                                            if (sb6.length() > 0) {
                                                sb6.append(", ");
                                            }
                                            sb6.append(countryName);
                                        }
                                        String[] split = countryName.split(" ");
                                        int length = split.length;
                                        hashSet5 = hashSet2;
                                        str4 = str2;
                                        int i20 = 0;
                                        while (i20 < length) {
                                            int i21 = i20;
                                            String str8 = split[i21];
                                            if (str8.length() > 0) {
                                                i13 = length;
                                                str4 = str4 + str8.charAt(0);
                                            } else {
                                                i13 = length;
                                            }
                                            i20 = i21 + 1;
                                            length = i13;
                                        }
                                        if (sb2.length() > 0) {
                                        }
                                        sb2.append(str4);
                                        if (sb6.length() > 0) {
                                        }
                                        sb6.append(countryName);
                                    } else {
                                        sb4 = sb3;
                                        hashSet5 = hashSet2;
                                        z11 = z10;
                                    }
                                    if (cVar2.e) {
                                        if (sb4 == null || sb4.length() <= 0) {
                                            sb5 = sb6;
                                            cVar = cVar2;
                                        } else {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue.geo = tL_geoPoint;
                                            tL_geoPoint.lat = latitude;
                                            tL_geoPoint._long = longitude;
                                            tL_messageMediaVenue.query_id = -1L;
                                            tL_messageMediaVenue.title = sb4.toString();
                                            tL_messageMediaVenue.icon = "pin";
                                            tL_messageMediaVenue.address = z15 ? org.telegram.messenger.id.M0(2131747596, null) : org.telegram.messenger.id.M0(2131747461, null);
                                            if (address != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue.geoAddress = tL_geoPointAddress;
                                                tL_geoPointAddress.country_iso2 = address.getCountryCode();
                                                String locality3 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getAdminArea();
                                                }
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getSubAdminArea();
                                                }
                                                String adminArea = address.getAdminArea();
                                                StringBuilder sb7 = new StringBuilder();
                                                if (TextUtils.isEmpty(adminArea)) {
                                                    sb5 = sb6;
                                                    cVar = cVar2;
                                                } else {
                                                    sb5 = sb6;
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue.geoAddress;
                                                    tL_geoPointAddress2.state = adminArea;
                                                    cVar = cVar2;
                                                    try {
                                                        tL_geoPointAddress2.flags |= 1;
                                                    } catch (Exception unused4) {
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(locality3)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue.geoAddress;
                                                    tL_geoPointAddress3.city = locality3;
                                                    tL_geoPointAddress3.flags |= 2;
                                                }
                                                if (!z15) {
                                                    String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str3) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                                                    if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getSubLocality(), str3) && !TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                                        thoroughfare2 = address.getSubLocality();
                                                    }
                                                    if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getLocality(), str3) && !TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                                        thoroughfare2 = address.getLocality();
                                                    }
                                                    if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address.getCountryName())) {
                                                        sb7 = null;
                                                    } else {
                                                        if (sb7.length() > 0) {
                                                            sb7.append(", ");
                                                        }
                                                        sb7.append(thoroughfare2);
                                                    }
                                                    if (!TextUtils.isEmpty(sb7)) {
                                                        int i22 = 0;
                                                        while (true) {
                                                            String[] strArr = org.telegram.messenger.sd.P;
                                                            if (i22 < 19) {
                                                                if (strArr[i22].equalsIgnoreCase(sb7.toString())) {
                                                                    z12 = true;
                                                                } else {
                                                                    i22++;
                                                                }
                                                            }
                                                        }
                                                        if (!TextUtils.isEmpty(sb7)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue.geoAddress;
                                                            tL_geoPointAddress4.flags |= 4;
                                                            tL_geoPointAddress4.street = sb7.toString();
                                                        }
                                                        if (!z12) {
                                                            arrayList.add(tL_messageMediaVenue);
                                                            if (arrayList.size() >= i10) {
                                                                org.telegram.messenger.g0.h3(new ai.a1(cVar, i7, str, arrayList, 6));
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    z12 = false;
                                                    if (!TextUtils.isEmpty(sb7)) {
                                                    }
                                                    if (!z12) {
                                                    }
                                                }
                                            } else {
                                                sb5 = sb6;
                                                cVar = cVar2;
                                            }
                                            z12 = false;
                                            if (!z12) {
                                            }
                                        }
                                        if (z11) {
                                            hashSet3 = hashSet5;
                                        } else {
                                            hashSet3 = hashSet5;
                                            if (!hashSet3.contains(sb2.toString())) {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                tL_geoPoint2.lat = latitude;
                                                tL_geoPoint2._long = longitude;
                                                tL_messageMediaVenue2.query_id = -1L;
                                                tL_messageMediaVenue2.title = sb2.toString();
                                                tL_messageMediaVenue2.icon = "city";
                                                tL_messageMediaVenue2.emoji = org.telegram.messenger.sd.b(address3.getCountryCode());
                                                hashSet3.add(tL_messageMediaVenue2.title);
                                                tL_messageMediaVenue2.address = org.telegram.messenger.id.M0(2131747596, null);
                                                if (address != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress5;
                                                    tL_geoPointAddress5.country_iso2 = address.getCountryCode();
                                                    String locality4 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                                    if (TextUtils.isEmpty(locality4)) {
                                                        locality4 = address.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(locality4)) {
                                                        locality4 = address.getSubAdminArea();
                                                    }
                                                    String adminArea2 = address.getAdminArea();
                                                    if (!TextUtils.isEmpty(adminArea2)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress6.state = adminArea2;
                                                        tL_geoPointAddress6.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(locality4)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress7.city = locality4;
                                                        tL_geoPointAddress7.flags |= 2;
                                                    }
                                                }
                                                arrayList.add(tL_messageMediaVenue2);
                                                if (arrayList.size() >= i10) {
                                                    org.telegram.messenger.g0.h3(new ai.a1(cVar, i7, str, arrayList, 6));
                                                }
                                            }
                                        }
                                        if (sb5.length() > 0) {
                                            hashSet4 = hashSet6;
                                            if (hashSet4.contains(sb5.toString())) {
                                                continue;
                                            } else {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue3.geo = tL_geoPoint3;
                                                tL_geoPoint3.lat = latitude;
                                                tL_geoPoint3._long = longitude;
                                                tL_messageMediaVenue3.query_id = -1L;
                                                tL_messageMediaVenue3.title = sb5.toString();
                                                tL_messageMediaVenue3.icon = "country";
                                                tL_messageMediaVenue3.emoji = org.telegram.messenger.sd.b(address3.getCountryCode());
                                                hashSet4.add(tL_messageMediaVenue3.title);
                                                tL_messageMediaVenue3.address = org.telegram.messenger.id.M0(2131751754, null);
                                                if (address != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue3.geoAddress = tL_geoPointAddress8;
                                                    tL_geoPointAddress8.country_iso2 = address.getCountryCode();
                                                }
                                                arrayList.add(tL_messageMediaVenue3);
                                                if (arrayList.size() >= i10) {
                                                    org.telegram.messenger.g0.h3(new ai.a1(cVar, i7, str, arrayList, 6));
                                                }
                                            }
                                        } else {
                                            hashSet4 = hashSet6;
                                        }
                                    } else {
                                        StringBuilder sb8 = new StringBuilder();
                                        try {
                                            String addressLine = address3.getAddressLine(0);
                                            if (!TextUtils.isEmpty(addressLine)) {
                                                sb8.append(addressLine);
                                            }
                                        } catch (Exception unused5) {
                                        }
                                        if (sb8.length() > 0) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue4.geo = tL_geoPoint4;
                                            tL_geoPoint4.lat = latitude;
                                            tL_geoPoint4._long = longitude;
                                            tL_messageMediaVenue4.query_id = -1L;
                                            tL_messageMediaVenue4.title = sb8.toString();
                                            tL_messageMediaVenue4.icon = "pin";
                                            tL_messageMediaVenue4.address = org.telegram.messenger.id.M0(2131747603, null);
                                            arrayList.add(tL_messageMediaVenue4);
                                        }
                                        cVar = cVar2;
                                        hashSet4 = hashSet6;
                                        hashSet3 = hashSet5;
                                    }
                                } else {
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(locality2);
                                }
                            } else {
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(subLocality);
                            }
                        } else {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(thoroughfare);
                        }
                        z9 = false;
                        if (TextUtils.isEmpty(str3)) {
                        }
                        boolean z152 = z9;
                        countryName = address3.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                        }
                        if (cVar2.e) {
                        }
                    } else {
                        locale = locale2;
                        str2 = str5;
                        list = fromLocationName2;
                        cVar = cVar2;
                        i7 = i19;
                        str = str7;
                        list2 = fromLocationName;
                        hashSet3 = hashSet2;
                        i12 = i11;
                        hashSet4 = hashSet;
                    }
                    i11 = i12 + 1;
                    hashSet2 = hashSet3;
                    hashSet = hashSet4;
                    fromLocationName2 = list;
                    str5 = str2;
                    locale2 = locale;
                    i19 = i7;
                    str7 = str;
                    fromLocationName = list2;
                    cVar2 = cVar;
                    address2 = null;
                }
                cVar = cVar2;
                i7 = i19;
                str = str7;
                org.telegram.messenger.g0.h3(new ai.a1(cVar, i7, str, arrayList, 6));
                break;
            case 4:
                final jg.h0 h0Var = (jg.h0) this.c;
                int i23 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                jg.z zVar = h0Var.j0;
                ArrayList arrayList5 = h0Var.v0;
                int i24 = h0Var.s0;
                h0Var.D0--;
                if (i23 == h0Var.d0) {
                    h0Var.f0 = i23;
                    if (h0Var.e0 != i23) {
                        zVar.b();
                    }
                    if (h0Var.g0 != i23) {
                        h0Var.I.clear();
                    }
                    h0Var.N = true;
                    int i25 = 0;
                    while (i25 < arrayList2.size()) {
                        if (!h0Var.F(arrayList2.get(i25))) {
                            arrayList2.remove(i25);
                            i25--;
                        }
                        i25++;
                    }
                    int size = arrayList5.size();
                    int i26 = 0;
                    while (i26 < arrayList2.size()) {
                        final Object obj2 = arrayList2.get(i26);
                        if (obj2 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) obj2;
                            j3 = 0;
                            qp.s1(i24).X3(user, z14, false);
                            j10 = user.id;
                        } else {
                            j3 = 0;
                            if (obj2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                                qp.s1(i24).Q3(chat, z14);
                                j10 = -chat.id;
                            } else {
                                if (obj2 instanceof TLRPC.EncryptedChat) {
                                    qp.s1(i24).U3((TLRPC.EncryptedChat) obj2, z14);
                                }
                                j10 = 0;
                            }
                        }
                        if (j10 == j3 || ((TLRPC.Dialog) qp.s1(i24).Q.f(j10)) != null) {
                            j11 = j10;
                            z13 = z14;
                        } else {
                            yr a02 = yr.a0(i24);
                            z13 = z14;
                            j11 = j10;
                            a02.a.c(new er(a02, j11, new sr() { // from class: jg.y
                                @Override // org.telegram.messenger.sr
                                public final void a(int i27) {
                                    int i28 = h0.this.s0;
                                    if (i27 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j10;
                                        tL_dialog.id = j12;
                                        if (i27 != 0) {
                                            tL_dialog.folder_id = i27;
                                        }
                                        Object obj3 = obj2;
                                        if (obj3 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = t3.T((TLRPC.Chat) obj3) ? 1 : 0;
                                        }
                                        qp.s1(i28).Q.k(tL_dialog, j12);
                                        qp.s1(i28).y.add(tL_dialog);
                                        qp.s1(i28).T4(null);
                                    }
                                }
                            }, 1));
                        }
                        if (h0Var.R() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                            hw hwVar = h0Var.U;
                            boolean z16 = (hwVar == null || hwVar.a() != j11) ? false : z13;
                            for (int i27 = 0; !z16 && i27 < size; i27++) {
                                jg.g0 g0Var = (jg.g0) arrayList5.get(i27);
                                if (g0Var != null && g0Var.c == j11) {
                                    z16 = z13;
                                }
                            }
                            if (z16) {
                                arrayList2.remove(i26);
                                arrayList3.remove(i26);
                                i26--;
                            }
                        }
                        i26++;
                        z14 = z13;
                    }
                    boolean z17 = z14;
                    qp.s1(i24).Y3(arrayList4, z17);
                    h0Var.s = arrayList2;
                    h0Var.G = arrayList3;
                    zVar.f(arrayList2, arrayList5);
                    h0Var.f();
                    hw hwVar2 = h0Var.U;
                    if (hwVar2 != null) {
                        hwVar2.d(h0Var.D0 > 0 ? z17 : false, z17);
                        h0Var.U.c();
                        break;
                    }
                }
                break;
            case 5:
                jg.s1 s1Var = (jg.s1) this.c;
                int i28 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f;
                if (i28 == s1Var.E) {
                    s1Var.d = arrayList6;
                    s1Var.e = arrayList7;
                    s1Var.H = arrayList8;
                    s1Var.f.f(arrayList6, null);
                    s1Var.D = false;
                    s1Var.f();
                    s1Var.F();
                    break;
                }
                break;
            case 6:
                l2.g1 g1Var = (l2.g1) this.c;
                Pair pair = (Pair) this.d;
                g1Var.b.h.I(((Integer) pair.first).intValue(), (x2.g0) pair.second, (x2.u) this.e, (x2.c0) this.f, this.b);
                break;
            case 7:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.e, this.b, (String) this.f, (TLRPC.TL_error) this.d);
                break;
            case 8:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str9 = (String) this.f;
                int i29 = this.b;
                ArrayList arrayList10 = new ArrayList();
                int size2 = arrayList9.size();
                int i30 = 0;
                while (i30 < size2) {
                    Object obj3 = arrayList9.get(i30);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        TLRPC.WebPage webPage = g4Var.u0[i15].c.E;
                        i14 = i30;
                        obj = obj3;
                        CharSequence A = org.telegram.ui.g4.A(g4Var, webPage, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(A)) {
                            lowerCase = A.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        i14 = i30;
                        obj = obj3;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i31 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str9, i31);
                            if (indexOf >= 0) {
                                int length2 = str9.length() + indexOf;
                                if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.p3 p3Var = new org.telegram.ui.p3();
                                    p3Var.a = indexOf;
                                    p3Var.c = pageBlock;
                                    p3Var.b = obj;
                                    arrayList10.add(p3Var);
                                }
                                i31 = length2;
                            }
                        }
                    }
                    i30 = i14 + 1;
                    i15 = 0;
                }
                org.telegram.messenger.g0.h3(new ai.a1((Object) g4Var, i29, (Object) arrayList10, str9, 14));
                break;
            case 9:
                TLObject tLObject3 = (TLObject) this.e;
                int i32 = this.b;
                HashSet hashSet7 = (HashSet) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    qp.s1(i32).Y3(updates.users, false);
                    qp.s1(i32).S3(updates.chats, false);
                    ArrayList z02 = qp.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = z02.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i15 < size3) {
                        Object obj4 = z02.get(i15);
                        i15++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj4).call;
                    }
                    if (LaunchActivity.G1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, i32, tL_inputGroupCall, false, groupCall, hashSet7);
                        break;
                    }
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    qp.s1(i32).Y3(groupcall.users, false);
                    qp.s1(i32).S3(groupcall.chats, false);
                    if (LaunchActivity.G1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, i32, tL_inputGroupCall2, false, groupCall2, hashSet7);
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Components.hc.a0(f2Var).f0(tL_error, false);
                    break;
                }
                break;
            case 10:
                an.h0((an) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 11:
                lm lmVar = (lm) this.c;
                hi hiVar = (hi) this.d;
                hiVar.b = lmVar.a.getMessagesController().s0(-((TLRPC.Chat) this.e).id, this.b, new gm(lmVar, hiVar, (an) this.f));
                break;
            case 12:
                lm lmVar2 = (lm) this.c;
                int i33 = this.b;
                ij ijVar = (ij) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                an anVar = lmVar2.a;
                anVar.xb(i33, ijVar.f1(), true, ij.B0(ijVar.k) == anVar.b7 ? 1 : 0, true, 0, num, bArr, new vl(lmVar2, ijVar, c11 == true ? 1 : 0));
                break;
            case 13:
                int i34 = this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                ArrayList arrayList12 = (ArrayList) this.e;
                ArrayList arrayList13 = (ArrayList) this.f;
                if (LaunchActivity.D1 && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    ug.i0 i0Var = new ug.i0(11, i34, Q.getParentActivity(), Q, null);
                    i0Var.C1(chat2, arrayList11, arrayList12, arrayList13, null);
                    i0Var.show();
                    break;
                }
                break;
            case 14:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.e;
                int i35 = this.b;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.f;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    u1Var.dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                ArrayList arrayList14 = new ArrayList();
                arrayList14.add(tL_help_support.user);
                yr.a0(i35).m1(arrayList14, null, true, true);
                qp.s1(i35).X3(tL_help_support.user, false, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                f2Var2.presentFragment(new an(bundle));
                break;
            case 15:
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.c;
                int[] iArr = (int[]) this.d;
                int i36 = this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) this.f;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
                if (u1Var2 != null) {
                    u1Var2.setOnCancelListener(new org.telegram.ui.Components.o1(iArr, i36, runnable));
                    f2Var3.showDialog(u1VarArr[0]);
                    break;
                }
                break;
            case 16:
                lr.d1((lr) this.c, (TLObject) this.e, (TLRPC.InputPeer) this.d, this.b, (int[]) this.f);
                break;
            case 17:
                a();
                break;
            case 18:
                b();
                break;
            case 19:
                c();
                break;
            case 20:
                d();
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
            default:
                zh.g1 g1Var2 = (zh.g1) this.c;
                Context context = (Context) this.d;
                int i37 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                c20 c20Var2 = (c20) this.f;
                long j12 = g1Var2.T1;
                zh.l0 l0Var = new zh.l0(g1Var2, c20Var2, c12 == true ? 1 : 0);
                boolean z18 = starGift.limited;
                new zh.q0(g1Var2, context, i37, starGift, j12, l0Var, z18 && (disallowedGiftsSettings2 = g1Var2.S1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z18 && (disallowedGiftsSettings = g1Var2.S1) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
        }
    }

    public /* synthetic */ ub(ContextWrapper contextWrapper, TLObject tLObject, int i7, String str, Object obj, int i10) {
        this.a = i10;
        this.c = contextWrapper;
        this.e = tLObject;
        this.b = i7;
        this.f = str;
        this.d = obj;
    }

    public /* synthetic */ ub(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ ub(Object obj, Object obj2, int i7, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ ub(Object obj, Object obj2, Object obj3, int i7, org.telegram.ui.ActionBar.f2 f2Var, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
        this.f = f2Var;
    }

    public /* synthetic */ ub(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i7;
    }

    public /* synthetic */ ub(Object obj, String str, String str2, String str3, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.f = str;
        this.d = str2;
        this.e = str3;
        this.b = i7;
    }

    public /* synthetic */ ub(Object obj, TLObject tLObject, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = i7;
        this.f = obj3;
    }

    public /* synthetic */ ub(jg.c cVar, Locale locale, String str, Locale locale2, int i7) {
        this.a = 3;
        this.c = cVar;
        this.d = locale;
        this.f = str;
        this.e = locale2;
        this.b = i7;
    }

    public /* synthetic */ ub(TLObject tLObject, int i7, HashSet hashSet, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = 9;
        this.e = tLObject;
        this.b = i7;
        this.c = hashSet;
        this.d = tL_error;
        this.f = f2Var;
    }

    public /* synthetic */ ub(TLObject tLObject, boolean[] zArr, c20 c20Var, int i7, TL_account.updateEmojiStatus updateemojistatus) {
        this.a = 2;
        this.e = tLObject;
        this.c = zArr;
        this.d = c20Var;
        this.b = i7;
        this.f = updateemojistatus;
    }
}
