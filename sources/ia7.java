// default package

import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ia7 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ia7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ab  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Chat> arrayList;
        TLRPC.EmojiStatus emojiStatus;
        int i;
        tta ttaVar;
        tta ttaVar2;
        tta ttaVar3;
        byte b = this.a;
        boolean z = true;
        int i2 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) obj4;
                te2 te2Var = (te2) obj3;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                if (messages_chats != null) {
                    uc7Var.c4(messages_chats.chats, false);
                    arrayList = messages_chats.chats;
                    uc7Var.F4 = arrayList;
                } else {
                    arrayList = null;
                }
                te2Var.a(arrayList);
                break;
            case 1:
                uc7 uc7Var2 = (uc7) obj4;
                cp2 cp2Var = (cp2) obj3;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    uc7Var2.c4(peerLinkRequests.chats, false);
                    uc7Var2.j4(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList2 = peerLinkRequests.requests;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList2.get(i3);
                        i3++;
                        long j = -wf3.n(communityPeerRequest.peer);
                        if (uc7Var2.N0(j) == null) {
                            uc7Var2.e3(0, j, true);
                        }
                    }
                    cp2Var.a(peerLinkRequests, null);
                    break;
                } else {
                    cp2Var.a(null, tL_error);
                    break;
                }
            case 2:
                uc7 uc7Var3 = (uc7) obj4;
                fe3 fe3Var = (fe3) obj3;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    uc7Var3.c4(participantJoinedChats.chats, false);
                    uc7Var3.j4(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList3 = participantJoinedChats.creator_chat_ids;
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Long l = arrayList3.get(i4);
                        i4++;
                        long longValue = l.longValue();
                        if (uc7Var3.N0(longValue) == null) {
                            uc7Var3.e3(0, longValue, true);
                        }
                    }
                }
                fe3Var.a(participantJoinedChats, tL_error2);
                break;
            case 3:
                ((boolean[]) obj4)[0] = true;
                ((nx0) obj3).dismiss();
                break;
            case 4:
                dx7 dx7Var = (dx7) obj4;
                h44 h44Var = (h44) obj3;
                ((sd6) h44Var).r(dx7Var.p1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                dx7Var.a0(h44Var);
                break;
            case 5:
                icc iccVar = (icc) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((id) obj4).dismiss();
                if (tL_error3 != null) {
                    iccVar.a(null, tL_error3.text);
                    break;
                } else {
                    iccVar.a(passkey, null);
                    break;
                }
            case 6:
                ((l01) obj4).b();
                ((d38) obj3).a((Boolean) obj);
                break;
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj4;
                yk8 yk8Var = (yk8) obj3;
                Long l2 = (Long) obj;
                Integer num = (Integer) obj2;
                premiumPreviewFragment.getClass();
                if (l2 == null) {
                    emojiStatus = new TLRPC.TL_emojiStatusEmpty();
                } else {
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    tL_emojiStatus.document_id = l2.longValue();
                    if (num != null) {
                        tL_emojiStatus.flags |= 1;
                        tL_emojiStatus.until = num.intValue();
                    }
                    emojiStatus = tL_emojiStatus;
                }
                premiumPreviewFragment.getMessagesController().v5(emojiStatus, null);
                yk8Var.b(l2 != null ? l2.longValue() : 0L, true);
                break;
            case 8:
                du8 du8Var = (du8) obj4;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((axa) obj3).l;
                int size3 = arrayList5.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj5 = arrayList5.get(i5);
                    i5++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                    if (savedStarGift.pinned_to_top) {
                        int i6 = l38.b;
                        b8c K = b8c.K(l38.class);
                        K.H = savedStarGift;
                        K.L(du8Var.l1 == savedStarGift.gift.id);
                        K.v = 1;
                        arrayList4.add(K);
                    }
                }
                break;
            case 9:
                ks5 ks5Var = (ks5) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                hl.r((ida) obj4);
                if (wallettransaction != null) {
                    long j2 = wallettransaction.fee;
                    if (j2 > 0) {
                        r9 = j2;
                    }
                }
                ks5Var.a(Long.valueOf(r9));
                break;
            case 10:
                TextView textView = (TextView) obj4;
                long[] jArr = (long[]) obj3;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    long j3 = wallettransaction2.fee;
                    if (j3 > 0) {
                        jArr[0] = j3;
                        textView.setText(ob6.V(null, null, 2131742722, c.w(j3, false)));
                        break;
                    }
                }
                textView.setVisibility(8);
                break;
            case 11:
                vta vtaVar = (vta) obj4;
                ArrayList arrayList6 = (ArrayList) obj3;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                tta[] ttaVarArr = vtaVar.n;
                kg5 kg5Var = vtaVar.U;
                if (kg5Var != null) {
                    kg5Var.f(true);
                    vtaVar.U = null;
                }
                vtaVar.j0 = true;
                vtaVar.k0 = starGift == null;
                vtaVar.l0 = runnable;
                ota otaVar = new ota(vtaVar.h);
                ArrayList arrayList7 = new ArrayList();
                for (int i7 = 0; i7 < ttaVarArr.length; i7++) {
                    tta ttaVar4 = ttaVarArr[i7];
                    if (ttaVar4 != null) {
                        TL_stars.StarGift starGift2 = ttaVar4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList7.add(Integer.valueOf(i7));
                        }
                    }
                }
                int i8 = 4;
                int i9 = 40;
                if (arrayList7.size() == 1) {
                    otaVar.e(ttaVarArr[((Integer) arrayList7.get(0)).intValue()], 5, 0.0f);
                    otaVar.d(false);
                    otaVar.c(26.0f, -26.0f);
                    otaVar.a(90);
                    otaVar.d(true);
                    otaVar.a(20);
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    tta ttaVar5 = ttaVarArr[0];
                    if (ttaVar5 != null) {
                        TL_stars.StarGift starGift3 = ttaVar5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            otaVar.e(ttaVar5, iArr[0], 0.0f);
                            otaVar.c(25.0f, -22.0f);
                            i = 1;
                            ttaVar = ttaVarArr[1];
                            if (ttaVar != null) {
                                TL_stars.StarGift starGift4 = ttaVar.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i > 0) {
                                        otaVar.a(42);
                                    }
                                    otaVar.e(ttaVarArr[1], iArr[i], 0.0f);
                                    otaVar.c(25.0f, 31.0f);
                                    i++;
                                }
                            }
                            ttaVar2 = ttaVarArr[2];
                            if (ttaVar2 != null) {
                                TL_stars.StarGift starGift5 = ttaVar2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i > 0) {
                                        otaVar.a(42);
                                    }
                                    otaVar.e(ttaVarArr[2], iArr[i], 180.0f);
                                    otaVar.c(-36.0f, -36.0f);
                                    i++;
                                }
                            }
                            ttaVar3 = ttaVarArr[3];
                            if (ttaVar3 != null) {
                                TL_stars.StarGift starGift6 = ttaVar3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i > 0) {
                                        otaVar.a(42);
                                    }
                                    otaVar.e(ttaVarArr[3], iArr[i], 0.0f);
                                    otaVar.c(-31.0f, 31.0f);
                                    i++;
                                }
                            }
                            otaVar.d(false);
                            otaVar.a(40);
                            otaVar.d(true);
                            otaVar.a(40);
                            i8 = iArr[i];
                            i9 = 80;
                        }
                    }
                    i = 0;
                    ttaVar = ttaVarArr[1];
                    if (ttaVar != null) {
                    }
                    ttaVar2 = ttaVarArr[2];
                    if (ttaVar2 != null) {
                    }
                    ttaVar3 = ttaVarArr[3];
                    if (ttaVar3 != null) {
                    }
                    otaVar.d(false);
                    otaVar.a(40);
                    otaVar.d(true);
                    otaVar.a(40);
                    i8 = iArr[i];
                    i9 = 80;
                }
                int i10 = i9;
                nta ntaVar = new nta(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new a39(vtaVar, i8, starGift, (byte) 12));
                ArrayList arrayList8 = otaVar.b;
                arrayList8.add(ntaVar);
                arrayList8.add(new nta(4, 0.0f, 0.0f, i10, i8, -90.0f, null, null));
                otaVar.d = new kta((Object) vtaVar, (Object) starGift, (Object) arrayList6, (Object) runnable, (byte) 0);
                otaVar.e = false;
                otaVar.c = 0;
                otaVar.l = false;
                int size4 = arrayList8.size();
                while (true) {
                    pta ptaVar = otaVar.a;
                    if (i2 >= size4) {
                        ptaVar.I = otaVar;
                        otaVar.b();
                        break;
                    } else {
                        Object obj6 = arrayList8.get(i2);
                        i2++;
                        nta ntaVar2 = (nta) obj6;
                        int i11 = ntaVar2.e;
                        if (i11 >= 0 && i11 < 6) {
                            float f = ntaVar2.f;
                            if (f != 0.0f) {
                                ptaVar.E[i11] = f;
                            }
                        }
                    }
                }
                break;
            case 12:
                ((nza) obj4).Q0((b8c) obj3, (Boolean) obj, (String) obj2);
                break;
            case 13:
                dza dzaVar = (dza) obj4;
                b8c b8cVar = (b8c) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                if (dzaVar.getContext() != null) {
                    if (bool.booleanValue()) {
                        new d31((FrameLayout) dzaVar.b, dzaVar.J0).I(R.raw.stars_topup, ob6.M0(2131744816, null), hl.S2(ob6.G((int) b8cVar.C, "StarsAcquiredInfo", new Object[0]))).j();
                        dzaVar.V1.c(true);
                        jxa.v(dzaVar.a, false).Q(true);
                        break;
                    } else if (str != null) {
                        new d31((FrameLayout) dzaVar.b, dzaVar.J0).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, str)).j();
                        break;
                    }
                }
                break;
            case 14:
                eza ezaVar = (eza) obj4;
                b8c b8cVar2 = (b8c) obj3;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                if (ezaVar.getContext() != null) {
                    ezaVar.dismiss();
                    jxa.v(ezaVar.a, false).Q(true);
                    e S = LaunchActivity.S();
                    if (S != null) {
                        if (bool2.booleanValue()) {
                            d31.b0(S).I(R.raw.stars_topup, ob6.M0(2131744816, null), hl.S2(ob6.G((int) b8cVar2.C, "StarsAcquiredInfo", new Object[0]))).j();
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null) {
                                launchActivity.w0.c(true);
                                break;
                            }
                        } else if (str2 != null) {
                            d31.b0(S).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, str2)).j();
                            break;
                        }
                    }
                }
                break;
            case 15:
                r3c r3cVar = (r3c) obj4;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                b3c b3cVar = r3cVar.y1;
                q3c q3cVar = r3cVar.H1;
                r3cVar.l1 = null;
                if (tL_error4 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error4.text)) {
                    if (tL_textWithEntities2 != null) {
                        r3cVar.O1 = false;
                        TLRPC.TL_textWithEntities M0 = r3c.M0(tL_textWithEntities, tL_textWithEntities2);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0.text);
                        r47.b(valueOf, M0.entities, false, true, false, false, 0);
                        r3cVar.z1.setText(r3cVar.N0(valueOf));
                        q3cVar.D(b3cVar);
                        break;
                    } else if (r3cVar.O1) {
                        r3cVar.dismiss();
                        jn7.e().k(jn7.S4, 1, ob6.M0(2131743601, null));
                        break;
                    } else {
                        xnb.x(null, 2131743601, new d31((FrameLayout) r3cVar.b, r3cVar.J0), null);
                        m3c m3cVar = r3cVar.w1.e;
                        String str3 = r3cVar.v1;
                        r3cVar.u1 = str3;
                        m3cVar.setText(r3c.K0(str3, null, null));
                        q3cVar.D(b3cVar);
                        break;
                    }
                } else {
                    r3cVar.U0();
                    break;
                }
            case 16:
                i61 i61Var = (i61) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                u8c u8cVar = ((t8c) obj4).i;
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) || tL_error5 != null) {
                    u8cVar.getClass();
                    z = false;
                }
                i61Var.a(Boolean.valueOf(z));
                u8cVar.getClass();
                break;
            case 17:
                ArrayList arrayList9 = (ArrayList) obj3;
                Vector vector = (Vector) obj;
                int i12 = ((hbc) obj4).a.a;
                if (vector != null) {
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    for (int i13 = 0; i13 < vector.objects.size(); i13++) {
                        if (((Long) arrayList9.get(i13)).longValue() > 0) {
                            TLRPC.User X1 = uc7.s1(i12).X1((Long) arrayList9.get(i13));
                            if (X1 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i13);
                                X1.stories_max_id = tL_recentStory;
                                int i14 = X1.flags2;
                                if (tL_recentStory != null) {
                                    X1.flags2 = i14 | 32;
                                } else {
                                    X1.flags2 = i14 & (-33);
                                }
                                arrayList10.add(X1);
                            }
                        } else {
                            TLRPC.Chat M02 = uc7.s1(i12).M0((Long) arrayList9.get(i13));
                            if (M02 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i13);
                                M02.stories_max_id = tL_recentStory2;
                                int i15 = M02.flags2;
                                if (tL_recentStory2 != null) {
                                    M02.flags2 = i15 | 16;
                                } else {
                                    M02.flags2 = i15 & (-17);
                                }
                                arrayList11.add(M02);
                            }
                        }
                    }
                    jf7.Y(i12).j1(arrayList10, arrayList11, true, true);
                    jn7.f(i12).k(2, 0);
                    break;
                }
                break;
            case 18:
                ((gtc) obj4).f0((pcc) obj3, (c35) obj, (String) obj2);
                break;
            case 19:
                muc mucVar = (muc) obj4;
                v58 v58Var = (v58) obj3;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    mucVar.a0.setLoading(false);
                    break;
                } else {
                    v58Var.a(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                }
            default:
                xxc xxcVar = (xxc) obj4;
                String str4 = (String) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                int i16 = xxcVar.a;
                if (webpagepreview != null) {
                    uc7.s1(i16).j4(webpagepreview.users, false);
                    uc7.s1(i16).c4(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        r11 = messageMedia.webpage;
                    }
                }
                xxcVar.b.put(str4, r11);
                ArrayList arrayList12 = (ArrayList) xxcVar.c.remove(str4);
                if (arrayList12 != null) {
                    int size5 = arrayList12.size();
                    while (i2 < size5) {
                        Object obj7 = arrayList12.get(i2);
                        i2++;
                        ((icc) obj7).a(r11, tL_error6);
                    }
                    break;
                }
                break;
        }
    }
}
