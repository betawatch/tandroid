// default package

import android.text.style.ClickableSpan;
import android.util.Base64;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hw9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hw9(wsa wsaVar, Runnable runnable, k11 k11Var, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.a = (byte) 18;
        this.b = runnable;
        this.c = k11Var;
        this.d = twoStepVerificationActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:324:0x070d A[LOOP:9: B:308:0x069d->B:324:0x070d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06d3 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        sea seaVar;
        long B1;
        ArrayList arrayList;
        d dVar;
        byte b;
        boolean z;
        String str;
        TLRPC.Message message;
        boolean z2;
        boolean z3;
        long j;
        byte b2 = 7;
        boolean z4 = 0;
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                jm1 jm1Var = (jm1) this.c;
                k47 k47Var = (k47) this.d;
                secretMediaViewer.l0 = (byte) 0;
                secretMediaViewer.J0 = null;
                if (jm1Var != null) {
                    jm1Var.run();
                }
                su suVar = secretMediaViewer.e;
                if (suVar != null) {
                    suVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    lw9 lw9Var = secretMediaViewer.n;
                    TLRPC.Message message2 = k47Var.k;
                    long j2 = message2.destroyTimeMillis;
                    long j3 = message2.ttl;
                    int i = lw9.E;
                    lw9Var.e = false;
                    lw9Var.f = j2;
                    lw9Var.h = j3;
                    lw9Var.n.start();
                    lw9Var.invalidate();
                    if (secretMediaViewer.g1) {
                        secretMediaViewer.c(true, true);
                        break;
                    } else if (secretMediaViewer.p1 && oc7.d1().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.m();
                        break;
                    }
                }
                break;
            case 1:
                a6a a6aVar = (a6a) this.b;
                String str2 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                a6aVar.w.remove(str2);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                q5a q5aVar = (q5a) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
                r5a r5aVar = q5aVar.b;
                a6a a6aVar2 = r5aVar.q;
                a6aVar2.E.l(r5aVar.j);
                if (tL_error == null) {
                    a6aVar2.getNotificationCenter().k(nm7.v1, Long.valueOf(r5aVar.j));
                    break;
                } else {
                    a6aVar2.getNotificationCenter().k(nm7.v1, Long.valueOf(r5aVar.j), tL_messages_startHistoryImport, tL_error);
                    break;
                }
            case 3:
                s5a s5aVar = (s5a) this.b;
                TLObject tLObject = (TLObject) this.c;
                Runnable runnable2 = (Runnable) this.d;
                boolean z5 = tLObject instanceof TLRPC.TL_messageMediaDocument;
                t5a t5aVar = s5aVar.b;
                if (z5) {
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
                    t5aVar.f = tL_inputStickerSetItem;
                    tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = t5aVar.f;
                    TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    inputDocument.id = document.id;
                    inputDocument.access_hash = document.access_hash;
                    inputDocument.file_reference = document.file_reference;
                    String str3 = t5aVar.b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    tL_inputStickerSetItem2.emoji = str3;
                    t5aVar.d = document.mime_type;
                } else if (t5aVar.e) {
                    t5aVar.d = "application/x-bad-tgsticker";
                }
                runnable2.run();
                break;
            case 4:
                d9a d9aVar = (d9a) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity = d9aVar.k0;
                if (tL_error2 == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.r0();
                    h9a h9aVar = sessionsActivity.a;
                    if (h9aVar != null) {
                        h9aVar.f();
                    }
                    sessionsActivity.p0(true);
                    break;
                }
                break;
            case 5:
                e9a e9aVar = (e9a) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity2 = e9aVar.a;
                if (tL_error3 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    h9a h9aVar2 = sessionsActivity2.a;
                    if (h9aVar2 != null) {
                        h9aVar2.f();
                        break;
                    }
                }
                break;
            case 6:
                g9a g9aVar = (g9a) this.b;
                String str4 = (String) this.c;
                db1 db1Var = (db1) this.d;
                try {
                    byte[] decode = Base64.decode(str4.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    g9aVar.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new jl7(g9aVar, db1Var, (byte) 23));
                    break;
                } catch (Exception e) {
                    fc4.e("Failed to pass qr code auth", e);
                    gm.c3(new f9a(g9aVar, (byte) 1));
                    db1Var.run();
                    return;
                }
            case 7:
                nha nhaVar = (nha) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                bu5 bu5Var = (bu5) this.d;
                ik.P(nhaVar.getContext(), null, nhaVar.I1, new bea(nhaVar, storyItem));
                bu5Var.u();
                break;
            case 8:
                nha nhaVar2 = (nha) this.b;
                String str5 = (String) this.c;
                d dVar2 = (d) this.d;
                dVar2.showDialog(new tfa(nhaVar2.getContext(), str5, str5, nhaVar2.I1, dVar2));
                break;
            case 9:
                bga bgaVar = (bga) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                nha nhaVar3 = bgaVar.r;
                bgaVar.n = 0;
                int b3 = bgaVar.b();
                if (tL_error4 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    nhaVar3.y1.getMessagesController().X3(messages_chats.chats, false);
                    bgaVar.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    bgaVar.d.addAll(messages_chats.chats);
                } else {
                    bgaVar.h = true;
                }
                int i2 = 0;
                while (true) {
                    iga[] igaVarArr = nhaVar3.n0;
                    if (i2 >= igaVarArr.length) {
                        bgaVar.e = false;
                        bgaVar.f = true;
                        bgaVar.f();
                        break;
                    } else {
                        iga igaVar = igaVarArr[i2];
                        if (igaVar.F == 6 && (seaVar = igaVar.h) != null && (bgaVar.f || b3 == 0)) {
                            nhaVar3.i(seaVar, 0, null);
                        }
                        i2++;
                    }
                }
                break;
            case 10:
                gga ggaVar = (gga) this.b;
                String str6 = (String) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                d dVar3 = ggaVar.s.y1;
                String lowerCase = str6.trim().toLowerCase();
                byte b4 = 11;
                if (lowerCase.length() == 0) {
                    gm.c3(new hw9(ggaVar, new ArrayList(), new ArrayList(), b4));
                    break;
                } else {
                    String S0 = jb6.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i3 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i3];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        TLObject tLObject3 = (TLObject) arrayList2.get(i4);
                        if (tLObject3 instanceof TLRPC.ChatParticipant) {
                            B1 = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                B1 = k47.B1(((TLRPC.ChannelParticipant) tLObject3).peer);
                            }
                            arrayList = arrayList2;
                            dVar = dVar3;
                            i4++;
                            dVar3 = dVar;
                            arrayList2 = arrayList;
                            z4 = 0;
                        }
                        TLRPC.User W1 = dVar3.getMessagesController().W1(Long.valueOf(B1));
                        if (W1.id != dVar3.getUserConfig().e()) {
                            String lowerCase2 = m9c.r(W1).toLowerCase();
                            String S02 = jb6.D0().S0(lowerCase2, true, z4);
                            if (lowerCase2.equals(S02)) {
                                S02 = null;
                            }
                            boolean z6 = z4;
                            for (int i5 = z4; i5 < i3; i5++) {
                                String str7 = strArr[i5];
                                if (lowerCase2.startsWith(str7)) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    if (!hg9.s(" ", str7, lowerCase2) && (S02 == null || (!S02.startsWith(str7) && !hg9.s(" ", str7, S02)))) {
                                        String p = m9c.p(W1);
                                        if (p != null && p.startsWith(str7)) {
                                            z6 = 2;
                                        }
                                        if (z6) {
                                            arrayList2 = arrayList;
                                        } else {
                                            dVar = dVar3;
                                            if (z6) {
                                                arrayList3.add(gm.r0(W1.first_name, W1.last_name, str7));
                                            } else {
                                                arrayList3.add(gm.r0("@" + m9c.p(W1), null, "@" + str7));
                                            }
                                            arrayList4.add(tLObject3);
                                            i4++;
                                            dVar3 = dVar;
                                            arrayList2 = arrayList;
                                            z4 = 0;
                                        }
                                    }
                                }
                                z6 = true;
                                if (z6) {
                                }
                            }
                        }
                        arrayList = arrayList2;
                        dVar = dVar3;
                        i4++;
                        dVar3 = dVar;
                        arrayList2 = arrayList;
                        z4 = 0;
                    }
                    gm.c3(new hw9((Object) ggaVar, (Object) arrayList3, (Object) arrayList4, (byte) 11));
                    break;
                }
                break;
            case 11:
                gga ggaVar2 = (gga) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                nha nhaVar4 = ggaVar2.s;
                if (nhaVar4.Y0) {
                    ggaVar2.d = arrayList5;
                    ggaVar2.r--;
                    if (!sd2.T(ggaVar2.n)) {
                        ArrayList arrayList7 = ggaVar2.e.g;
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                    }
                    if (ggaVar2.r == 0) {
                        int i6 = 0;
                        while (true) {
                            iga[] igaVarArr2 = nhaVar4.n0;
                            if (i6 < igaVarArr2.length) {
                                iga igaVar2 = igaVarArr2[i6];
                                if (igaVar2.F == 7) {
                                    if (ggaVar2.h == 0) {
                                        igaVar2.w.e(false, true);
                                    } else {
                                        nhaVar4.i(igaVar2.h, 0, null);
                                    }
                                }
                                i6++;
                            }
                        }
                    }
                    ggaVar2.f();
                    break;
                }
                break;
            case 12:
                byte b5 = 4;
                kga kgaVar = (kga) this.b;
                String str8 = (String) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                kgaVar.getClass();
                String lowerCase3 = str8.trim().toLowerCase();
                byte b6 = 9;
                if (lowerCase3.length() == 0) {
                    gm.c3(new e6a(kgaVar, new ArrayList(), b6));
                    break;
                } else {
                    String S03 = jb6.D0().S0(lowerCase3, true, false);
                    String str9 = (lowerCase3.equals(S03) || S03.length() == 0) ? null : S03;
                    int i7 = (str9 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i7];
                    strArr2[0] = lowerCase3;
                    if (str9 != null) {
                        strArr2[1] = str9;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    int i8 = 0;
                    while (i8 < arrayList8.size()) {
                        k47 k47Var2 = (k47) arrayList8.get(i8);
                        int i9 = 0;
                        while (true) {
                            if (i9 < i7) {
                                String str10 = strArr2[i9];
                                String I0 = k47Var2.I0();
                                if (I0 == null || I0.length() == 0) {
                                    b = b5;
                                } else if (I0.toLowerCase().contains(str10)) {
                                    arrayList9.add(k47Var2);
                                } else {
                                    b = b5;
                                    if (kgaVar.r == b) {
                                        int i10 = k47Var2.D;
                                        TLRPC.Message message3 = k47Var2.k;
                                        TLRPC.Document document2 = i10 == 0 ? k47.n1(message3).webpage.document : k47.n1(message3).document;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < document2.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i11);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str11 = documentAttribute.performer;
                                                    z = str11 != null ? str11.toLowerCase().contains(str10) : false;
                                                    if (!z && (str = documentAttribute.title) != null) {
                                                        z = str.toLowerCase().contains(str10);
                                                    }
                                                } else {
                                                    i11++;
                                                }
                                            } else {
                                                z = false;
                                            }
                                        }
                                        if (z) {
                                            arrayList9.add(k47Var2);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i9++;
                                b5 = b;
                            }
                        }
                        b = b5;
                        i8++;
                        b5 = b;
                    }
                    gm.c3(new e6a(kgaVar, arrayList9, b6));
                    break;
                }
                break;
            case 13:
                xna xnaVar = (xna) this.b;
                m66 m66Var = (m66) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                k66 k66Var = xnaVar.H;
                if (k66Var != null && xnaVar.I == m66Var) {
                    k66Var.a(clickableSpan);
                    xnaVar.I = null;
                    xnaVar.y.e(true);
                    break;
                }
                break;
            case 14:
                wsa wsaVar = (wsa) this.b;
                Long l = (Long) this.c;
                wsaVar.c2(l.longValue(), new i48(wsaVar, l, (yw4[]) this.d, b2));
                break;
            case 15:
                wsa wsaVar2 = (wsa) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                k47 k47Var3 = (k47) this.d;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                oc7.r1(wsaVar2.a).d4(messages_messages.users, false);
                oc7.r1(wsaVar2.a).X3(messages_messages.chats, false);
                wsaVar2.H2 = true;
                wsaVar2.G2 = false;
                if (wsaVar2.k3 != null && (message = k47Var3.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction).saved = !r3.booleanValue();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = !r3.booleanValue();
                    }
                }
                wsaVar2.l2(k47Var3, null);
                break;
            case 16:
                wsa wsaVar3 = (wsa) this.b;
                k11 k11Var = (k11) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                k11Var.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                wsaVar3.a2.setResellPrice(nk.j(0L, ok.a));
                hs8 hs8Var = wsaVar3.i3;
                if (hs8Var != null) {
                    hs8Var.run();
                }
                wsaVar3.j().Q(R.raw.contact_check, 36, jb6.a0(null, null, 2131749962, wsaVar3.s1())).j();
                break;
            case 17:
                wsa wsaVar4 = (wsa) this.b;
                k11 k11Var2 = (k11) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                k11Var2.c(false);
                wsaVar4.j().g0(tL_error5, false);
                break;
            case 18:
                Runnable runnable3 = (Runnable) this.b;
                k11 k11Var3 = (k11) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                runnable3.run();
                k11Var3.c(false);
                wsa.g2(twoStepVerificationActivity);
                break;
            case 19:
                Runnable runnable4 = (Runnable) this.b;
                TLRPC.Document document3 = (TLRPC.Document) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                d S = LaunchActivity.S();
                c41 b0 = S != null ? c41.b0(S) : c41.Y();
                u31 q = runnable4 == null ? document3 != null ? b0.q(document3, charSequence) : b0.Q(R.raw.contact_check, 36, charSequence) : document3 != null ? b0.r(document3, charSequence, jb6.M0(2131749821, null), runnable4) : b0.K(R.raw.contact_check, charSequence, jb6.M0(2131749821, null), runnable4);
                q.u = true;
                q.j();
                break;
            case 20:
                ((wsa) this.b).K1((he) this.c, (k47) this.d);
                break;
            case 21:
                wsa wsaVar5 = (wsa) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                String str12 = (String) this.d;
                long j4 = tL_starGiftUnique2.gift_id;
                String str13 = tL_starGiftUnique2.title;
                String s1 = wsaVar5.s1();
                TLRPC.Document document4 = tL_starGiftUnique2.getDocument();
                String str14 = tL_starGiftUnique2.slug;
                he heVar = new he(3, null, a.b);
                heVar.q(500L);
                TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
                getuniquestargiftvalueinfo.slug = str14;
                ConnectionsManager.getInstance(wsaVar5.a).sendRequest(getuniquestargiftvalueinfo, new s97(wsaVar5, heVar, document4, str12, str13, s1, j4));
                break;
            case 22:
                TLObject tLObject5 = (TLObject) this.b;
                e eVar = (e) this.c;
                String str15 = (String) this.d;
                if (tLObject5 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift = ((TL_stars.TL_payments_uniqueStarGift) tLObject5).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) starGift;
                        Long valueOf = Long.valueOf(tL_starGiftUnique3.gift_id);
                        String str16 = tL_starGiftUnique3.title;
                        if (str16 != null) {
                            str15 = str16;
                        }
                        eVar.a(valueOf, str15);
                        break;
                    }
                }
                eVar.a(0L, str15);
                break;
            case 23:
                jva jvaVar = (jva) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable5 = (Runnable) this.d;
                ArrayList arrayList10 = jvaVar.v;
                boolean[] zArr = jvaVar.r;
                boolean[] zArr2 = jvaVar.t;
                ArrayList[] arrayListArr = jvaVar.q;
                int i12 = jvaVar.a;
                boolean z7 = !jvaVar.e;
                jvaVar.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    oc7.r1(i12).d4(starsStatus.users, false);
                    oc7.r1(i12).X3(starsStatus.chats, false);
                    if (!arrayListArr[0].isEmpty() || zArr2[0]) {
                        j = 0;
                        z3 = false;
                    } else {
                        ArrayList<TL_stars.StarsTransaction> arrayList11 = starsStatus.history;
                        int size2 = arrayList11.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            TL_stars.StarsTransaction starsTransaction = arrayList11.get(i13);
                            i13++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                        }
                        j = 0;
                        for (int i14 = 0; i14 < 3; i14++) {
                            zArr[i14] = !arrayListArr[i14].isEmpty() || zArr[i14];
                            boolean[] zArr3 = jvaVar.u;
                            boolean z8 = (starsStatus.flags & 1) == 0;
                            zArr3[i14] = z8;
                            if (z8) {
                                zArr2[i14] = false;
                            }
                            jvaVar.s[i14] = zArr3[i14] ? null : starsStatus.next_offset;
                        }
                        z3 = true;
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList10.addAll(starsStatus.subscriptions);
                        jvaVar.x = false;
                        jvaVar.w = starsStatus.subscriptions_next_offset;
                        jvaVar.y = (starsStatus.flags & 4) == 0;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j5 = jvaVar.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j5 != starsAmount.amount) {
                        z7 = true;
                    }
                    jvaVar.f = starsAmount;
                    jvaVar.g = j;
                } else {
                    z2 = false;
                    z3 = false;
                }
                jvaVar.d = false;
                jvaVar.e = true;
                if (z7) {
                    nm7.f(i12).k(nm7.A3, new Object[0]);
                }
                if (z3) {
                    nm7.f(i12).k(nm7.B3, new Object[0]);
                }
                if (z2) {
                    nm7.f(i12).k(nm7.C3, new Object[0]);
                }
                if (runnable5 != null) {
                    runnable5.run();
                    break;
                }
                break;
            case 24:
                jva jvaVar2 = (jva) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable6 = (Runnable) this.d;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.getClass();
                    jvaVar2.Q.remove(num);
                    jvaVar2.R.remove(num);
                }
                runnable6.run();
                break;
            case 25:
                boolean[] zArr4 = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                my0[] my0VarArr = (my0[]) this.d;
                zArr4[0] = false;
                gm.t1(editTextBoldCursor);
                my0VarArr[0].dismiss();
                break;
            case 26:
                x2b x2bVar = (x2b) this.b;
                String str17 = (String) this.c;
                t5a t5aVar2 = (t5a) this.d;
                if (!x2bVar.J) {
                    x2bVar.T1.remove(str17);
                    if ("application/x-tgsticker".equals(t5aVar2.d)) {
                        t5aVar2.c = true;
                        int indexOf = x2bVar.S1.indexOf(t5aVar2);
                        if (indexOf >= 0) {
                            u69 K = x2bVar.m1.K(indexOf);
                            if (K != null) {
                                ((y0b) K.a).setSticker(t5aVar2);
                            }
                        } else {
                            x2bVar.n1.f();
                        }
                    } else {
                        x2bVar.M0(t5aVar2);
                    }
                    if (x2bVar.T1.isEmpty()) {
                        x2bVar.T0();
                        break;
                    }
                }
                break;
            case 27:
                x2b x2bVar2 = (x2b) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                Boolean bool = (Boolean) this.d;
                x2bVar2.S1 = arrayList12;
                if (arrayList12.isEmpty()) {
                    x2bVar2.dismiss();
                    break;
                } else {
                    x2bVar2.n1.f();
                    if (bool.booleanValue()) {
                        x2bVar2.T1 = new HashMap();
                        int size3 = x2bVar2.S1.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            t5a t5aVar3 = (t5a) x2bVar2.S1.get(i15);
                            x2bVar2.T1.put(t5aVar3.a, t5aVar3);
                            bc4.G(x2bVar2.a).h0(false, 67108864, t5aVar3.a, true);
                        }
                    }
                    x2bVar2.T0();
                    break;
                }
            case 28:
                x2b x2bVar3 = (x2b) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                d dVar4 = x2bVar3.F1;
                TLRPC.StickerSet stickerSet = x2bVar3.M1.set;
                int i16 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                try {
                    if (tL_error6 == null) {
                        if (x2bVar3.d2) {
                            u31.g(dVar4, new o1b(x2bVar3.v1.getContext(), x2bVar3.M1, 1, 2, null, x2bVar3.J0), 1500).j();
                        }
                        if (tLObject7 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            hs6.d0(x2bVar3.a).C1(dVar4, true, i16, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject7);
                        }
                    } else {
                        Toast.makeText(x2bVar3.getContext(), jb6.M0(2131751042, null), 0).show();
                    }
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                hs6.d0(x2bVar3.a).b1(i16, false, true);
                break;
            default:
                x2b x2bVar4 = (x2b) this.b;
                String str18 = (String) this.c;
                TextView textView = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str18;
                x2bVar4.j2 = ConnectionsManager.getInstance(x2bVar4.a).sendRequest(tL_stickers_checkShortName, new fm8((Object) x2bVar4, (Object) str18, (Object) textView, (byte) 21), 2);
                break;
        }
    }

    public /* synthetic */ hw9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
