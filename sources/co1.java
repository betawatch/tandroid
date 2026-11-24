// default package

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class co1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ co1(byte b, Object obj, Object obj2, String str) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [int] */
    /* JADX WARN: Type inference failed for: r12v22 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        sy1 sy1Var;
        Editable text;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2;
        vh6 vh6Var;
        vh6 vh6Var2;
        int i3;
        ArrayList arrayList4;
        vh6 vh6Var3;
        int size;
        int i4;
        TLRPC.Chat chat;
        vh6 vh6Var4;
        String str2 = "";
        byte b = 28;
        int i5 = 2;
        String str3 = null;
        int i6 = 1;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                yv1 yv1Var = (yv1) this.b;
                bu5 bu5Var = (bu5) this.c;
                String str4 = (String) this.d;
                bu5Var.u();
                ml7 ml7Var = new ml7(yv1Var, yv1Var.getParentActivity());
                ml7Var.H0(str4, false);
                ml7Var.show();
                break;
            case 1:
                yv1 yv1Var2 = (yv1) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                ik.Q(yv1Var2.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new jf((Object) yv1Var2, (Object) suggestedPost, this.d, (byte) 14), yv1Var2.getResourceProvider(), 0).h1();
                break;
            case 2:
                ((yv1) this.b).q8((nk) this.c, (Runnable) this.d);
                break;
            case 3:
                ((yv1) this.b).m9((TLObject) this.c, (TLRPC.User) this.d);
                break;
            case 4:
                ((yv1) this.b).u9((TLRPC.TL_error) this.c, (TLRPC.TL_messages_editMessage) this.d);
                break;
            case 5:
                bu1 bu1Var = (bu1) this.b;
                TLObject tLObject = (TLObject) this.c;
                k47 k47Var = (k47) this.d;
                cu1 cu1Var = bu1Var.c;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    hu1 hu1Var = cu1Var.a;
                    yv1 yv1Var3 = hu1Var.R;
                    hu1Var.R.getMessagesController().d4(tL_photos_photo.users, false);
                    TLRPC.User W1 = yv1Var3.getMessagesController().W1(Long.valueOf(yv1Var3.getUserConfig().n));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && W1 != null) {
                        f88.a(k47Var.k.action.photo, W1, false);
                        yv1Var3.getUserConfig().v(W1);
                        yv1Var3.getUserConfig().u(true);
                        z = false;
                        c41.b0(yv1Var3).V(Collections.singletonList(W1), gm.S2(jb6.M0(2131754184, null)), gm.N2(jb6.M0(2131754185, null), -1, 0, new fo1(bu1Var, (byte) 6), null), null).j();
                        k47Var.q = z;
                        break;
                    }
                }
                z = false;
                k47Var.q = z;
            case 6:
                ((iv1) this.b).l((rc2) this.c, (TLRPC.User) this.d);
                break;
            case 7:
                ((iv1) this.b).j((rc2) this.c, (TLRPC.Chat) this.d, 0, false);
                break;
            case 8:
                iv1 iv1Var = (iv1) this.b;
                rc2 rc2Var = (rc2) this.c;
                TLRPC.Document document = (TLRPC.Document) this.d;
                yv1 yv1Var4 = iv1Var.a;
                if (yv1Var4.getParentActivity() != null && document != null) {
                    if ((Build.VERSION.SDK_INT <= 28 || e21.b) && yv1Var4.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        yv1Var4.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        break;
                    } else {
                        k47 messageObject = rc2Var == null ? null : rc2Var.getMessageObject();
                        if (messageObject != null && messageObject.k != null) {
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = messageObject.O3();
                            tL_message.id = messageObject.e1();
                            tL_message.realId = messageObject.L1();
                            tL_message.dialog_id = k47.B0(messageObject.k);
                            TLRPC.Message message = messageObject.k;
                            tL_message.peer_id = message.peer_id;
                            tL_message.from_id = message.from_id;
                            tL_message.date = message.date;
                            tL_message.message = "";
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                            tL_message.media = tL_messageMediaDocument;
                            tL_messageMediaDocument.flags |= 3;
                            tL_messageMediaDocument.document = document;
                            int i7 = tL_message.flags;
                            tL_message.flags = i7 | 512;
                            if (tL_message.from_id != null) {
                                tL_message.flags = i7 | 768;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            i = ((d) yv1Var4).currentAccount;
                            arrayList5.add(new k47(i, tL_message, false, true));
                            MediaController.f0(yv1Var4.getParentActivity(), yv1Var4.getAccountInstance(), arrayList5, new wu1(iv1Var, document, (byte) 0));
                            break;
                        }
                    }
                }
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str5 = (String) this.d;
                Runnable runnable = (Runnable) this.c;
                int i8 = ChatActivityEnterView.z7;
                if (!chatActivityEnterView.O2 && (sy1Var = chatActivityEnterView.F0) != null && (text = sy1Var.getText()) != null) {
                    int length = text.length();
                    if (length > 0 && !Character.isWhitespace(text.charAt(length - 1))) {
                        str2 = " ";
                    }
                    String concat = str2.concat(str5);
                    byte b2 = 1;
                    chatActivityEnterView.s1 = true;
                    text.insert(length, concat);
                    chatActivityEnterView.F0.setSelection(text.length());
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        chatActivityEnterView.j1();
                        gm.d3(new mw1(chatActivityEnterView, b2), 420L);
                        break;
                    }
                }
                break;
            case 10:
                iy1 iy1Var = (iy1) this.b;
                dka dkaVar = (dka) this.c;
                k6a k6aVar = (k6a) this.d;
                dkaVar.getViewTreeObserver().removeOnDrawListener(iy1Var);
                k6aVar.a.setHideAvatar(true);
                break;
            case 11:
                tz1 tz1Var = (tz1) this.b;
                Uri uri = (Uri) this.c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = tz1Var.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            jo6 jo6Var = new jo6(-1, file.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(jo6Var);
                            gm.c3(new co1((Object) tz1Var, (Object) arrayList6, (Object) file, (byte) 12));
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            case 12:
                ((tz1) this.b).K((File) this.d, (ArrayList) this.c);
                break;
            case 13:
                final i22 i22Var = (i22) this.b;
                a22 a22Var = (a22) this.c;
                final vr0 vr0Var = (vr0) this.d;
                final boolean z3 = i22Var.w2.getCurrentItemTop() <= a22Var.getButtonsHideOffset();
                float alpha = i22Var.U2.getAlpha();
                float f = z3 ? 1.0f : 0.0f;
                zna znaVar = new zna(new xk4(0.0f));
                znaVar.b(new a12(i22Var, alpha, f, z3));
                znaVar.a(new ht3() { // from class: b12
                    @Override // ht3
                    public final void a(zna znaVar2, boolean z4, float f2, float f3) {
                        i22 i22Var2 = i22.this;
                        i22Var2.v2.v(1.0f);
                        i22Var2.w2.v(1.0f);
                        i22Var2.v2.m(i22Var2.i4);
                        i22Var2.w2.m(i22Var2.i4);
                        i22Var2.X0.g();
                        i22Var2.b.invalidate();
                        i22Var2.U2.setTag(z3 ? 1 : null);
                        vr0Var.run();
                    }
                });
                aoa aoaVar = new aoa(500.0f);
                znaVar.m = aoaVar;
                aoaVar.a(1.0f);
                znaVar.m.b(1000.0f);
                znaVar.h();
                i22Var.q3 = znaVar;
                break;
            case 14:
                i22 i22Var2 = (i22) this.b;
                po poVar = (po) this.c;
                hy0 hy0Var = (hy0) this.d;
                i22Var2.A0 = null;
                i22Var2.m4 = null;
                poVar.e();
                i22Var2.B0 = (byte) 0;
                if (hy0Var != null) {
                    hy0Var.w();
                }
                if (i22Var2.K) {
                    i22Var2.c.setLayerType(0, null);
                }
                if (i22Var2.W) {
                    WindowManager.LayoutParams attributes = i22Var2.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    i22Var2.getWindow().setAttributes(attributes);
                }
                nm7.e().k(100, 512);
                break;
            case 15:
                ba2 ba2Var = (ba2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error == null) {
                    ba2Var.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject2).count;
                    ba2Var.getMessagesStorage().t1(ba2Var.y0.invitesCount, ba2Var.w0);
                    ba2Var.u0(false, false);
                    break;
                }
                break;
            case 16:
                hb2 hb2Var = (hb2) this.b;
                String str6 = (String) this.d;
                ArrayList arrayList7 = (ArrayList) this.c;
                hb2Var.getClass();
                String lowerCase = str6.trim().toLowerCase();
                byte b3 = 17;
                if (lowerCase.length() == 0) {
                    gm.c3(new co1(hb2Var, new ArrayList(), new ArrayList(), b3));
                    break;
                } else {
                    String S0 = jb6.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i9 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i9];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    int i10 = 0;
                    while (i10 < arrayList7.size()) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) arrayList7.get(i10);
                        String lowerCase2 = chat2.title.toLowerCase();
                        String S02 = jb6.D0().S0(lowerCase2, true, false);
                        if (lowerCase2.equals(S02)) {
                            S02 = str3;
                        }
                        String str7 = str3;
                        char c = 0;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i9) {
                                String str8 = strArr[i11];
                                if (lowerCase2.startsWith(str8) || hg9.s(" ", str8, lowerCase2) || (S02 != null && (S02.startsWith(str8) || hg9.s(" ", str8, S02)))) {
                                    arrayList = arrayList7;
                                    str = str7;
                                    c = 1;
                                } else {
                                    String str9 = chat2.username;
                                    if (str9 == null || !str9.startsWith(str8)) {
                                        ArrayList<TLRPC.TL_username> arrayList10 = chat2.usernames;
                                        if (arrayList10 != null && !arrayList10.isEmpty()) {
                                            int i12 = 0;
                                            while (i12 < chat2.usernames.size()) {
                                                TLRPC.TL_username tL_username = chat2.usernames.get(i12);
                                                arrayList = arrayList7;
                                                if (tL_username.active && tL_username.username.startsWith(str8)) {
                                                    str = tL_username.username;
                                                } else {
                                                    i12++;
                                                    arrayList7 = arrayList;
                                                }
                                            }
                                        }
                                        arrayList = arrayList7;
                                        str = str7;
                                    } else {
                                        arrayList = arrayList7;
                                        str = chat2.username;
                                    }
                                    c = 2;
                                }
                                if (c != 0) {
                                    if (c == 1) {
                                        arrayList9.add(gm.r0(chat2.title, null, str8));
                                    } else {
                                        arrayList9.add(gm.r0(b10.h("@", str), null, "@" + str8));
                                    }
                                    arrayList8.add(chat2);
                                } else {
                                    i11++;
                                    str7 = str;
                                    arrayList7 = arrayList;
                                }
                            } else {
                                arrayList = arrayList7;
                            }
                        }
                        i10++;
                        arrayList7 = arrayList;
                        str3 = null;
                    }
                    gm.c3(new co1((Object) hb2Var, (Object) arrayList8, (Object) arrayList9, (byte) 17));
                    break;
                }
                break;
            case 17:
                ((hb2) this.b).E((ArrayList) this.c, (ArrayList) this.d);
                break;
            case 18:
                wb2 wb2Var = (wb2) this.b;
                ArrayList arrayList11 = (ArrayList) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                for (int i13 = 0; i13 < arrayList11.size(); i13++) {
                    ((View) arrayList11.get(i13)).setVisibility(0);
                }
                if (wb2Var.A.removeAll(arrayList12)) {
                    for (int i14 = 0; i14 < arrayList12.size(); i14++) {
                        wb2Var.d((u69) arrayList12.get(i14));
                    }
                    wb2Var.G();
                }
                wb2Var.K.removeAll(arrayList11);
                break;
            case 19:
                wb2 wb2Var2 = (wb2) this.b;
                View view = (View) this.c;
                u69 u69Var = (u69) this.d;
                view.setVisibility(0);
                if (wb2Var2.A.remove(u69Var)) {
                    wb2Var2.d(u69Var);
                    wb2Var2.G();
                }
                wb2Var2.K.remove(view);
                break;
            case 20:
                gf2 gf2Var = (gf2) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                bmb bmbVar = (bmb) this.d;
                HashMap hashMap = gf2Var.s;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject3;
                    String r = bc4.r(null, wallPaper.document);
                    if (!hashMap.containsKey(r)) {
                        hashMap.put(r, bmbVar);
                        bc4.G(bmbVar.F).X(wallPaper.document, wallPaper, 1, 1);
                        break;
                    }
                } else {
                    bmbVar.f = true;
                    break;
                }
                break;
            case 21:
                wg2 wg2Var = (wg2) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                vh6 vh6Var5 = wg2Var.L;
                vh6 vh6Var6 = wg2Var.M;
                int i15 = wg2Var.e1;
                vh6 vh6Var7 = wg2Var.K;
                int i16 = wg2Var.O;
                ArrayList arrayList15 = wg2Var.F;
                int i17 = 0;
                int i18 = 0;
                while (i18 < arrayList13.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList13.get(i18);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList14.get(i18);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList2 = arrayList13;
                        arrayList3 = arrayList14;
                        i2 = i18;
                        vh6Var = vh6Var7;
                    } else {
                        if (i16 == i6) {
                            i3 = i6;
                            vh6Var2 = vh6Var7;
                            wg2Var.getMessagesController().N3(wg2Var.N, tL_channels_channelParticipants);
                        } else {
                            vh6Var2 = vh6Var7;
                            i3 = i6;
                        }
                        wg2Var.getMessagesController().d4(tL_channels_channelParticipants.users, z2);
                        wg2Var.getMessagesController().X3(tL_channels_channelParticipants.chats, z2);
                        long e = wg2Var.getUserConfig().e();
                        if (i15 != 0) {
                            ?? r12 = z2;
                            while (true) {
                                if (r12 < tL_channels_channelParticipants.participants.size()) {
                                    if (k47.B1(tL_channels_channelParticipants.participants.get(r12).peer) == e) {
                                        tL_channels_channelParticipants.participants.remove((int) r12);
                                    } else {
                                        r12++;
                                    }
                                }
                            }
                        }
                        if (i16 == 2) {
                            wg2Var.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList4 = wg2Var.H;
                                vh6Var3 = vh6Var6;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList4 = wg2Var.G;
                                vh6Var3 = vh6Var5;
                            }
                            arrayList4.clear();
                            arrayList4.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            arrayList2 = arrayList13;
                            i4 = 0;
                            while (true) {
                                arrayList3 = arrayList14;
                                if (i4 >= size) {
                                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i4);
                                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                    int i19 = i18;
                                    if (channelParticipant.user_id == e) {
                                        arrayList4.remove(channelParticipant);
                                    } else {
                                        vh6Var3.k(channelParticipant, k47.B1(channelParticipant.peer));
                                    }
                                    i4++;
                                    arrayList14 = arrayList3;
                                    i18 = i19;
                                    tL_channels_channelParticipants = tL_channels_channelParticipants2;
                                } else {
                                    i2 = i18;
                                    int size2 = arrayList4.size() + i17;
                                    if (i16 == 2) {
                                        int size3 = arrayList15.size();
                                        int i20 = 0;
                                        while (i20 < size3) {
                                            TLObject tLObject4 = (TLObject) arrayList15.get(i20);
                                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                                long B1 = k47.B1(((TLRPC.ChannelParticipant) tLObject4).peer);
                                                if (vh6Var6.f(B1) == null && vh6Var5.f(B1) == null && !(i15 == i3 && B1 > 0 && m9c.z(wg2Var.getMessagesController().W1(Long.valueOf(B1))))) {
                                                    vh6Var4 = vh6Var2;
                                                } else {
                                                    arrayList15.remove(i20);
                                                    vh6Var4 = vh6Var2;
                                                    vh6Var4.l(B1);
                                                    i20--;
                                                    size3--;
                                                }
                                            } else {
                                                arrayList15.remove(i20);
                                                i20--;
                                                size3--;
                                                vh6Var4 = vh6Var2;
                                            }
                                            i20++;
                                            vh6Var2 = vh6Var4;
                                            i3 = 1;
                                        }
                                    }
                                    vh6Var = vh6Var2;
                                    if ((i16 == 0 || i16 == 3 || i16 == 2) && (chat = wg2Var.n) != null && chat.megagroup) {
                                        TLRPC.ChatFull chatFull = wg2Var.r;
                                        if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                            Collections.sort(arrayList4, new cg2(wg2Var, wg2Var.getConnectionsManager().getCurrentTime(), (byte) 0));
                                            i17 = size2;
                                        }
                                    }
                                    if (i16 == 1) {
                                        try {
                                            Collections.sort(arrayList15, new sa((byte) 26));
                                        } catch (Exception e2) {
                                            fc4.g(e2, true);
                                        }
                                    }
                                    i17 = size2;
                                }
                            }
                        } else {
                            vh6Var2.b();
                        }
                        arrayList4 = arrayList15;
                        vh6Var3 = vh6Var2;
                        arrayList4.clear();
                        arrayList4.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        arrayList2 = arrayList13;
                        i4 = 0;
                        while (true) {
                            arrayList3 = arrayList14;
                            if (i4 >= size) {
                            }
                            i4++;
                            arrayList14 = arrayList3;
                            i18 = i19;
                            tL_channels_channelParticipants = tL_channels_channelParticipants2;
                        }
                    }
                    i18 = i2 + 1;
                    arrayList14 = arrayList3;
                    vh6Var7 = vh6Var;
                    arrayList13 = arrayList2;
                    i5 = 2;
                    i6 = 1;
                    z2 = false;
                }
                if (i16 != i5 || wg2Var.k1 <= 0) {
                    sg2 sg2Var = wg2Var.a;
                    wg2Var.C0(sg2Var != null ? sg2Var.d.d1 : 0);
                    wg2Var.Q = false;
                    wg2Var.R = true;
                    zja zjaVar = wg2Var.f;
                    if (zjaVar != null) {
                        zjaVar.setVisibility((i16 != 0 || i17 > 5) ? 0 : 8);
                    }
                }
                wg2Var.F0();
                sg2 sg2Var2 = wg2Var.a;
                if (sg2Var2 != null) {
                    fv fvVar = wg2Var.c;
                    fvVar.X1 = wg2Var.B1;
                    fvVar.Y1 = false;
                    sg2Var2.f();
                    a1b a1bVar = wg2Var.b;
                    if (a1bVar != null && wg2Var.a.d.d1 == 0 && wg2Var.R) {
                        a1bVar.e(false, true);
                    }
                }
                wg2Var.resumeDelayedFragmentAnimation();
                break;
            case 22:
                yg2 yg2Var = (yg2) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                x41.a(yg2Var.a).b();
                yg2Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                d S = LaunchActivity.S();
                if (S != null) {
                    c41.b0(S).Q(R.raw.contact_check, 36, jb6.a0(null, null, 2131752737, m9c.r(yg2Var.T1))).j();
                    break;
                }
                break;
            case 23:
                SpannableString spannableString = (SpannableString) this.b;
                wm4 wm4Var = (wm4) this.c;
                pf2 pf2Var = (pf2) this.d;
                el2.a(spannableString, spannableString.length(), (f26) wm4Var.b);
                pf2Var.run();
                break;
            case 24:
                SpannableString spannableString2 = (SpannableString) this.b;
                wm4 wm4Var2 = (wm4) this.c;
                rp2 rp2Var = (rp2) this.d;
                el2.a(spannableString2, spannableString2.length(), (f26) wm4Var2.b);
                rp2Var.a(spannableString2);
                break;
            case 25:
                hac.X(((tx6) this.c).l, new ra2((mx6) this.b, (mt2) this.d, b));
                break;
            case 26:
                ((jac) this.b).a((TLRPC.Updates) this.c, (TLRPC.TL_error) this.d);
                break;
            case 27:
                bw2 bw2Var = (bw2) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                Vector vector = (Vector) this.d;
                editor.remove("needGetStatuses").commit();
                if (!vector.objects.isEmpty()) {
                    ArrayList arrayList16 = new ArrayList();
                    ArrayList arrayList17 = vector.objects;
                    int size4 = arrayList17.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        Object obj = arrayList17.get(i21);
                        i21++;
                        TLRPC.TL_user tL_user = new TLRPC.TL_user();
                        TLRPC.TL_contactStatus tL_contactStatus = (TLRPC.TL_contactStatus) obj;
                        if (tL_contactStatus != null) {
                            TLRPC.UserStatus userStatus = tL_contactStatus.status;
                            if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                                userStatus.expires = userStatus.by_me ? -1000 : -100;
                            } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                                userStatus.expires = userStatus.by_me ? -1001 : -101;
                            } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                                userStatus.expires = userStatus.by_me ? -1002 : -102;
                            }
                            TLRPC.User W12 = bw2Var.getMessagesController().W1(Long.valueOf(tL_contactStatus.user_id));
                            if (W12 != null) {
                                W12.status = tL_contactStatus.status;
                            }
                            tL_user.status = tL_contactStatus.status;
                            arrayList16.add(tL_user);
                        }
                    }
                    bw2Var.getMessagesStorage().h2(arrayList16, true);
                }
                nm7 notificationCenter = bw2Var.getNotificationCenter();
                int i22 = oc7.s5;
                notificationCenter.k(2, 4);
                break;
            case 28:
                bw2 bw2Var2 = (bw2) this.b;
                ArrayList arrayList18 = (ArrayList) this.c;
                ArrayList arrayList19 = (ArrayList) this.d;
                for (int i23 = 0; i23 < arrayList18.size(); i23++) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList18.get(i23);
                    if (bw2Var2.g0.get(Long.valueOf(tL_contact.user_id)) == null) {
                        bw2Var2.f0.add(tL_contact);
                        bw2Var2.g0.put(Long.valueOf(tL_contact.user_id), tL_contact);
                    }
                }
                for (int i24 = 0; i24 < arrayList19.size(); i24++) {
                    Long l = (Long) arrayList19.get(i24);
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) bw2Var2.g0.get(l);
                    if (tL_contact2 != null) {
                        bw2Var2.f0.remove(tL_contact2);
                        bw2Var2.g0.remove(l);
                    }
                }
                if (!arrayList18.isEmpty()) {
                    bw2Var2.N();
                    Utilities.h.c(new rv2(bw2Var2, new ArrayList(bw2Var2.f0), false ? 1 : 0));
                }
                bw2Var2.F(bw2.q(bw2Var2.Z), false, false, false, false, true, false);
                bw2Var2.d(!arrayList18.isEmpty());
                bw2Var2.getNotificationCenter().k(25, new Object[0]);
                break;
            default:
                bw2 bw2Var3 = (bw2) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i25 = 0;
                boolean z4 = false;
                while (i25 < updates.users.size()) {
                    TLRPC.User user2 = updates.users.get(i25);
                    boolean z5 = z4;
                    if (user2.contact) {
                        yv2 yv2Var = (yv2) bw2Var3.a0.get(user2.phone);
                        z5 = z4;
                        if (yv2Var != null) {
                            String a = yv2.a(yv2Var.i, yv2Var.j);
                            String a2 = yv2.a(user.first_name, user.last_name);
                            z5 = z4;
                            if (yv2Var.m == null) {
                                yv2Var.m = user;
                                if (!a.equals(a2)) {
                                    ArrayList arrayList20 = (ArrayList) bw2Var3.c0.get(a2);
                                    if (arrayList20 == null) {
                                        arrayList20 = new ArrayList();
                                        bw2Var3.c0.put(a2, arrayList20);
                                        bw2Var3.d0.add(a2);
                                    }
                                    arrayList20.add(yv2Var);
                                    ArrayList arrayList21 = (ArrayList) bw2Var3.c0.get(a);
                                    if (arrayList21 != null) {
                                        int size5 = arrayList21.size();
                                        int i26 = 0;
                                        while (true) {
                                            if (i26 < size5) {
                                                Object obj2 = arrayList21.get(i26);
                                                i26++;
                                                if (obj2 instanceof yv2) {
                                                    yv2 yv2Var2 = (yv2) obj2;
                                                    if (yv2Var2.a == yv2Var.a) {
                                                        if (arrayList21.remove(yv2Var2) && arrayList21.isEmpty()) {
                                                            bw2Var3.c0.remove(a);
                                                            bw2Var3.d0.remove(a);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                z5 = true;
                            }
                        }
                    }
                    if (user2.contact && bw2Var3.g0.get(Long.valueOf(user2.id)) == null) {
                        TLRPC.TL_contact tL_contact3 = new TLRPC.TL_contact();
                        tL_contact3.user_id = user2.id;
                        bw2Var3.f0.add(tL_contact3);
                        bw2Var3.g0.put(Long.valueOf(tL_contact3.user_id), tL_contact3);
                    }
                    i25++;
                    z4 = z5;
                }
                bw2Var3.d(true);
                if (z4) {
                    bw2Var3.E(bw2Var3.c0, bw2Var3.d0, bw2Var3.e0, false);
                }
                bw2Var3.getNotificationCenter().k(25, new Object[0]);
                break;
        }
    }

    public /* synthetic */ co1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
