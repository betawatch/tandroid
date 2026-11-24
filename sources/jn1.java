// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.util.Log;
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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jn1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jn1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0459, code lost:
    
        if (l7c.z(r1.getMessagesController().V1(java.lang.Long.valueOf(r7))) != false) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        ex1 ex1Var;
        Editable text;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2;
        int i3;
        int i4;
        vf6 vf6Var;
        ArrayList arrayList4;
        int size;
        int i5;
        TLRPC.Chat chat;
        int i6;
        String str2 = "";
        String str3 = " ";
        int i7 = 2;
        String str4 = null;
        int i8 = 1;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ((mu1) this.b).g8((nj) this.c, (Runnable) this.d);
                return;
            case 1:
                ((mu1) this.b).c9((TLObject) this.c, (TLRPC.User) this.d);
                return;
            case 2:
                ((mu1) this.b).k9((TLRPC.TL_error) this.c, (TLRPC.TL_messages_editMessage) this.d);
                return;
            case 3:
                ps1 ps1Var = (ps1) this.b;
                TLObject tLObject = (TLObject) this.c;
                k27 k27Var = (k27) this.d;
                qs1 qs1Var = ps1Var.c;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    vs1 vs1Var = qs1Var.a;
                    mu1 mu1Var = vs1Var.R;
                    vs1Var.R.getMessagesController().b4(tL_photos_photo.users, false);
                    TLRPC.User V1 = mu1Var.getMessagesController().V1(Long.valueOf(mu1Var.getUserConfig().n));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && V1 != null) {
                        d68.a(k27Var.k.action.photo, V1, false);
                        mu1Var.getUserConfig().v(V1);
                        mu1Var.getUserConfig().u(true);
                        z = false;
                        u21.b0(mu1Var).V(Collections.singletonList(V1), gl.S2(k96.M0(2131754216, null)), gl.N2(k96.M0(2131754217, null), -1, 0, new hq1(ps1Var, (byte) 2), null), null).j();
                        k27Var.q = z;
                        return;
                    }
                }
                z = false;
                k27Var.q = z;
                return;
            case 4:
                ((wt1) this.b).i((gb2) this.c, (TLRPC.User) this.d);
                return;
            case 5:
                ((wt1) this.b).h((gb2) this.c, (TLRPC.Chat) this.d, 0, false);
                return;
            case 6:
                wt1 wt1Var = (wt1) this.b;
                gb2 gb2Var = (gb2) this.c;
                TLRPC.Document document = (TLRPC.Document) this.d;
                mu1 mu1Var2 = wt1Var.a;
                if (mu1Var2.getParentActivity() == null || document == null) {
                    return;
                }
                if ((Build.VERSION.SDK_INT <= 28 || w01.b) && mu1Var2.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    mu1Var2.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                k27 messageObject = gb2Var == null ? null : gb2Var.getMessageObject();
                if (messageObject == null || messageObject.k == null) {
                    return;
                }
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject.O3();
                tL_message.id = messageObject.e1();
                tL_message.realId = messageObject.L1();
                tL_message.dialog_id = k27.B0(messageObject.k);
                TLRPC.Message message = messageObject.k;
                tL_message.peer_id = message.peer_id;
                tL_message.from_id = message.from_id;
                tL_message.date = message.date;
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = document;
                int i9 = tL_message.flags;
                tL_message.flags = i9 | 512;
                if (tL_message.from_id != null) {
                    tL_message.flags = i9 | 768;
                }
                ArrayList arrayList5 = new ArrayList();
                i = ((d) mu1Var2).currentAccount;
                arrayList5.add(new k27(i, tL_message, false, true));
                MediaController.f0(mu1Var2.getParentActivity(), mu1Var2.getAccountInstance(), arrayList5, new kt1(wt1Var, document, (byte) 0));
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str5 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                int i10 = ChatActivityEnterView.r7;
                if (chatActivityEnterView.O2 || (ex1Var = chatActivityEnterView.F0) == null || (text = ex1Var.getText()) == null) {
                    return;
                }
                int length = text.length();
                if (length > 0 && !Character.isWhitespace(text.charAt(length - 1))) {
                    str2 = " ";
                }
                String concat = str2.concat(str5);
                chatActivityEnterView.s1 = true;
                text.insert(length, concat);
                chatActivityEnterView.F0.setSelection(text.length());
                if (runnable != null) {
                    runnable.run();
                    return;
                } else {
                    chatActivityEnterView.h1();
                    gl.d3(new av1(chatActivityEnterView, (byte) 0), 420L);
                    return;
                }
            case 8:
                vw1 vw1Var = (vw1) this.b;
                bia biaVar = (bia) this.c;
                i4a i4aVar = (i4a) this.d;
                biaVar.getViewTreeObserver().removeOnDrawListener(vw1Var);
                i4aVar.a.setHideAvatar(true);
                return;
            case 9:
                gy1 gy1Var = (gy1) this.b;
                Uri uri = (Uri) this.c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = gy1Var.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            jm6 jm6Var = new jm6(-1, file.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(jm6Var);
                            gl.c3(new jn1(gy1Var, arrayList6, file, (byte) 10));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            case 10:
                ((gy1) this.b).K((File) this.d, (ArrayList) this.c);
                return;
            case 11:
                final x02 x02Var = (x02) this.b;
                p02 p02Var = (p02) this.c;
                final vq0 vq0Var = (vq0) this.d;
                final boolean z3 = x02Var.w2.getCurrentItemTop() <= p02Var.getButtonsHideOffset();
                float alpha = x02Var.U2.getAlpha();
                float f = z3 ? 1.0f : 0.0f;
                yla ylaVar = new yla(new ti4(0.0f));
                ylaVar.b(new nz1(x02Var, alpha, f, z3));
                ylaVar.a(new xr3() { // from class: oz1
                    @Override // xr3
                    public final void a(yla ylaVar2, boolean z4, float f2, float f3) {
                        x02 x02Var2 = x02.this;
                        x02Var2.v2.w(1.0f);
                        x02Var2.w2.w(1.0f);
                        x02Var2.v2.m(x02Var2.i4);
                        x02Var2.w2.m(x02Var2.i4);
                        x02Var2.X0.g();
                        x02Var2.b.invalidate();
                        x02Var2.U2.setTag(z3 ? 1 : null);
                        vq0Var.run();
                    }
                });
                zla zlaVar = new zla(500.0f);
                ylaVar.m = zlaVar;
                zlaVar.a(1.0f);
                ylaVar.m.b(1000.0f);
                ylaVar.h();
                x02Var.q3 = ylaVar;
                return;
            case 12:
                x02 x02Var2 = (x02) this.b;
                on onVar = (on) this.c;
                ax0 ax0Var = (ax0) this.d;
                x02Var2.A0 = null;
                x02Var2.m4 = null;
                onVar.e();
                x02Var2.B0 = (byte) 0;
                if (ax0Var != null) {
                    ax0Var.x();
                }
                if (x02Var2.K) {
                    x02Var2.c.setLayerType(0, null);
                }
                if (x02Var2.W) {
                    WindowManager.LayoutParams attributes = x02Var2.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    x02Var2.getWindow().setAttributes(attributes);
                }
                kk7.e().k(99, 512);
                return;
            case 13:
                p82 p82Var = (p82) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error == null) {
                    p82Var.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject2).count;
                    p82Var.getMessagesStorage().t1(p82Var.y0.invitesCount, p82Var.w0);
                    p82Var.t0(false, false);
                    return;
                }
                return;
            case 14:
                w92 w92Var = (w92) this.b;
                String str6 = (String) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                w92Var.getClass();
                String lowerCase = str6.trim().toLowerCase();
                byte b = 15;
                if (lowerCase.length() == 0) {
                    gl.c3(new jn1(w92Var, new ArrayList(), new ArrayList(), b));
                    return;
                }
                String S0 = k96.D0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.length() == 0) {
                    S0 = null;
                }
                int i11 = (S0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                int i12 = 0;
                while (i12 < arrayList7.size()) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) arrayList7.get(i12);
                    String lowerCase2 = chat2.title.toLowerCase();
                    String S02 = k96.D0().S0(lowerCase2, true, false);
                    if (lowerCase2.equals(S02)) {
                        S02 = str4;
                    }
                    String str7 = str4;
                    char c = 0;
                    int i13 = 0;
                    while (true) {
                        if (i13 < i11) {
                            String str8 = strArr[i13];
                            if (lowerCase2.startsWith(str8) || de9.t(str3, str8, lowerCase2) || (S02 != null && (S02.startsWith(str8) || de9.t(str3, str8, S02)))) {
                                arrayList = arrayList7;
                                str = str3;
                                c = 1;
                            } else {
                                String str9 = chat2.username;
                                if (str9 == null || !str9.startsWith(str8)) {
                                    ArrayList<TLRPC.TL_username> arrayList10 = chat2.usernames;
                                    if (arrayList10 == null || arrayList10.isEmpty()) {
                                        arrayList = arrayList7;
                                    } else {
                                        arrayList = arrayList7;
                                        int i14 = 0;
                                        while (i14 < chat2.usernames.size()) {
                                            TLRPC.TL_username tL_username = chat2.usernames.get(i14);
                                            str = str3;
                                            if (tL_username.active && tL_username.username.startsWith(str8)) {
                                                str7 = tL_username.username;
                                            } else {
                                                i14++;
                                                str3 = str;
                                            }
                                        }
                                    }
                                    str = str3;
                                } else {
                                    str7 = chat2.username;
                                    arrayList = arrayList7;
                                    str = str3;
                                }
                                c = 2;
                            }
                            if (c != 0) {
                                if (c == 1) {
                                    arrayList9.add(gl.r0(chat2.title, null, str8));
                                } else {
                                    arrayList9.add(gl.r0(b00.h("@", str7), null, "@" + str8));
                                }
                                arrayList8.add(chat2);
                            } else {
                                i13++;
                                arrayList7 = arrayList;
                                str3 = str;
                            }
                        } else {
                            arrayList = arrayList7;
                            str = str3;
                        }
                    }
                    i12++;
                    arrayList7 = arrayList;
                    str3 = str;
                    str4 = null;
                }
                gl.c3(new jn1(w92Var, arrayList8, arrayList9, (byte) 15));
                return;
            case 15:
                ((w92) this.b).E((ArrayList) this.c, (ArrayList) this.d);
                return;
            case 16:
                la2 la2Var = (la2) this.b;
                ArrayList arrayList11 = (ArrayList) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                for (int i15 = 0; i15 < arrayList11.size(); i15++) {
                    ((View) arrayList11.get(i15)).setVisibility(0);
                }
                if (la2Var.A.removeAll(arrayList12)) {
                    for (int i16 = 0; i16 < arrayList12.size(); i16++) {
                        la2Var.d((s49) arrayList12.get(i16));
                    }
                    la2Var.G();
                }
                la2Var.K.removeAll(arrayList11);
                return;
            case 17:
                la2 la2Var2 = (la2) this.b;
                View view = (View) this.c;
                s49 s49Var = (s49) this.d;
                view.setVisibility(0);
                if (la2Var2.A.remove(s49Var)) {
                    la2Var2.d(s49Var);
                    la2Var2.G();
                }
                la2Var2.K.remove(view);
                return;
            case 18:
                vd2 vd2Var = (vd2) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                akb akbVar = (akb) this.d;
                HashMap hashMap = vd2Var.s;
                if (!(tLObject3 instanceof TLRPC.TL_wallPaper)) {
                    akbVar.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject3;
                String r = ba4.r(null, wallPaper.document);
                if (hashMap.containsKey(r)) {
                    return;
                }
                hashMap.put(r, akbVar);
                ba4.G(akbVar.F).X(wallPaper.document, wallPaper, 1, 1);
                return;
            case 19:
                kf2 kf2Var = (kf2) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                vf6 vf6Var2 = kf2Var.L;
                vf6 vf6Var3 = kf2Var.M;
                int i17 = kf2Var.e1;
                vf6 vf6Var4 = kf2Var.K;
                int i18 = kf2Var.O;
                ArrayList arrayList15 = kf2Var.F;
                int i19 = 0;
                int i20 = 0;
                while (i20 < arrayList13.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList13.get(i20);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList14.get(i20);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList2 = arrayList13;
                        arrayList3 = arrayList14;
                        i2 = i17;
                    } else {
                        if (i18 == i8) {
                            i4 = i8;
                            i3 = i17;
                            kf2Var.getMessagesController().L3(kf2Var.N, tL_channels_channelParticipants);
                        } else {
                            i3 = i17;
                            i4 = i8;
                        }
                        kf2Var.getMessagesController().b4(tL_channels_channelParticipants.users, z2);
                        kf2Var.getMessagesController().V3(tL_channels_channelParticipants.chats, z2);
                        long e = kf2Var.getUserConfig().e();
                        if (i3 != 0) {
                            ?? r9 = z2;
                            while (true) {
                                if (r9 < tL_channels_channelParticipants.participants.size()) {
                                    if (k27.B1(tL_channels_channelParticipants.participants.get(r9).peer) == e) {
                                        tL_channels_channelParticipants.participants.remove((int) r9);
                                    } else {
                                        r9++;
                                    }
                                }
                            }
                        }
                        if (i18 == 2) {
                            kf2Var.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList4 = kf2Var.H;
                                vf6Var = vf6Var3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList4 = kf2Var.G;
                                vf6Var = vf6Var2;
                            }
                            arrayList4.clear();
                            arrayList4.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            arrayList2 = arrayList13;
                            i5 = 0;
                            while (true) {
                                arrayList3 = arrayList14;
                                if (i5 >= size) {
                                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i5);
                                    long j = e;
                                    if (channelParticipant.user_id == j) {
                                        arrayList4.remove(channelParticipant);
                                    } else {
                                        vf6Var.k(channelParticipant, k27.B1(channelParticipant.peer));
                                    }
                                    i5++;
                                    arrayList14 = arrayList3;
                                    e = j;
                                } else {
                                    int size2 = arrayList4.size() + i19;
                                    if (i18 == 2) {
                                        int size3 = arrayList15.size();
                                        int i21 = 0;
                                        while (i21 < size3) {
                                            TLObject tLObject4 = (TLObject) arrayList15.get(i21);
                                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                                long B1 = k27.B1(((TLRPC.ChannelParticipant) tLObject4).peer);
                                                if (vf6Var3.f(B1) == null && vf6Var2.f(B1) == null) {
                                                    i6 = i3;
                                                    if (i6 == i4) {
                                                        if (B1 > 0) {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    i6 = i3;
                                                }
                                                arrayList15.remove(i21);
                                                vf6Var4.l(B1);
                                                i21--;
                                                size3--;
                                            } else {
                                                arrayList15.remove(i21);
                                                i21--;
                                                size3--;
                                                i6 = i3;
                                            }
                                            i21++;
                                            i3 = i6;
                                            i4 = 1;
                                        }
                                    }
                                    i2 = i3;
                                    if ((i18 == 0 || i18 == 3 || i18 == 2) && (chat = kf2Var.n) != null && chat.megagroup) {
                                        TLRPC.ChatFull chatFull = kf2Var.r;
                                        if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                            Collections.sort(arrayList4, new qe2(kf2Var, kf2Var.getConnectionsManager().getCurrentTime(), (byte) 0));
                                            i19 = size2;
                                        }
                                    }
                                    if (i18 == 1) {
                                        try {
                                            Collections.sort(arrayList15, new sa((byte) 26));
                                        } catch (Exception e2) {
                                            fa4.g(e2, true);
                                        }
                                    }
                                    i19 = size2;
                                }
                            }
                        } else {
                            vf6Var4.b();
                        }
                        vf6Var = vf6Var4;
                        arrayList4 = arrayList15;
                        arrayList4.clear();
                        arrayList4.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        arrayList2 = arrayList13;
                        i5 = 0;
                        while (true) {
                            arrayList3 = arrayList14;
                            if (i5 >= size) {
                            }
                            i5++;
                            arrayList14 = arrayList3;
                            e = j;
                        }
                    }
                    i20++;
                    i17 = i2;
                    arrayList13 = arrayList2;
                    arrayList14 = arrayList3;
                    i7 = 2;
                    i8 = 1;
                    z2 = false;
                }
                if (i18 != i7 || kf2Var.k1 <= 0) {
                    gf2 gf2Var = kf2Var.a;
                    kf2Var.B0(gf2Var != null ? gf2Var.d.d1 : 0);
                    kf2Var.Q = false;
                    kf2Var.R = true;
                    xha xhaVar = kf2Var.f;
                    if (xhaVar != null) {
                        xhaVar.setVisibility((i18 != 0 || i19 > 5) ? 0 : 8);
                    }
                }
                kf2Var.E0();
                gf2 gf2Var2 = kf2Var.a;
                if (gf2Var2 != null) {
                    fu fuVar = kf2Var.c;
                    fuVar.X1 = kf2Var.B1;
                    fuVar.Y1 = false;
                    gf2Var2.f();
                    zya zyaVar = kf2Var.b;
                    if (zyaVar != null && kf2Var.a.d.d1 == 0 && kf2Var.R) {
                        zyaVar.e(false, true);
                    }
                }
                kf2Var.resumeDelayedFragmentAnimation();
                return;
            case 20:
                mf2 mf2Var = (mf2) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                p31.a(mf2Var.a).b();
                mf2Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                d S = LaunchActivity.S();
                if (S != null) {
                    u21.b0(S).Q(R.raw.contact_check, 36, k96.a0(null, null, 2131752772, l7c.r(mf2Var.T1))).j();
                    return;
                }
                return;
            case 21:
                SpannableString spannableString = (SpannableString) this.b;
                wk4 wk4Var = (wk4) this.c;
                ee2 ee2Var = (ee2) this.d;
                qj2.a(spannableString, spannableString.length(), (f06) wk4Var.b);
                ee2Var.run();
                return;
            case 22:
                SpannableString spannableString2 = (SpannableString) this.b;
                wk4 wk4Var2 = (wk4) this.c;
                go2 go2Var = (go2) this.d;
                qj2.a(spannableString2, spannableString2.length(), (f06) wk4Var2.b);
                go2Var.a(spannableString2);
                return;
            case 23:
                g8c.X(((tv6) this.c).l, new n92((mv6) this.b, (bs2) this.d, (byte) 27));
                return;
            case 24:
                ((i8c) this.b).a((TLRPC.Updates) this.c, (TLRPC.TL_error) this.d);
                return;
            case 25:
                qu2 qu2Var = (qu2) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                Vector vector = (Vector) this.d;
                editor.remove("needGetStatuses").commit();
                if (!vector.objects.isEmpty()) {
                    ArrayList arrayList16 = new ArrayList();
                    ArrayList arrayList17 = vector.objects;
                    int size4 = arrayList17.size();
                    int i22 = 0;
                    while (i22 < size4) {
                        Object obj = arrayList17.get(i22);
                        i22++;
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
                            TLRPC.User V12 = qu2Var.getMessagesController().V1(Long.valueOf(tL_contactStatus.user_id));
                            if (V12 != null) {
                                V12.status = tL_contactStatus.status;
                            }
                            tL_user.status = tL_contactStatus.status;
                            arrayList16.add(tL_user);
                        }
                    }
                    qu2Var.getMessagesStorage().h2(arrayList16, true);
                }
                kk7 notificationCenter = qu2Var.getNotificationCenter();
                int i23 = na7.q5;
                notificationCenter.k(2, 4);
                return;
            case 26:
                qu2 qu2Var2 = (qu2) this.b;
                ArrayList arrayList18 = (ArrayList) this.c;
                ArrayList arrayList19 = (ArrayList) this.d;
                for (int i24 = 0; i24 < arrayList18.size(); i24++) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList18.get(i24);
                    if (qu2Var2.g0.get(Long.valueOf(tL_contact.user_id)) == null) {
                        qu2Var2.f0.add(tL_contact);
                        qu2Var2.g0.put(Long.valueOf(tL_contact.user_id), tL_contact);
                    }
                }
                for (int i25 = 0; i25 < arrayList19.size(); i25++) {
                    Long l = (Long) arrayList19.get(i25);
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) qu2Var2.g0.get(l);
                    if (tL_contact2 != null) {
                        qu2Var2.f0.remove(tL_contact2);
                        qu2Var2.g0.remove(l);
                    }
                }
                if (!arrayList18.isEmpty()) {
                    qu2Var2.N();
                    Utilities.h.c(new fu2(qu2Var2, new ArrayList(qu2Var2.f0), false ? 1 : 0));
                }
                qu2Var2.F(qu2.q(qu2Var2.Z), false, false, false, false, true, false);
                qu2Var2.d(!arrayList18.isEmpty());
                qu2Var2.getNotificationCenter().k(25, new Object[0]);
                return;
            case 27:
                qu2 qu2Var3 = (qu2) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i26 = 0;
                boolean z4 = false;
                while (i26 < updates.users.size()) {
                    TLRPC.User user2 = updates.users.get(i26);
                    boolean z5 = z4;
                    if (user2.contact) {
                        nu2 nu2Var = (nu2) qu2Var3.a0.get(user2.phone);
                        z5 = z4;
                        if (nu2Var != null) {
                            String a = nu2.a(nu2Var.i, nu2Var.j);
                            String a2 = nu2.a(user.first_name, user.last_name);
                            z5 = z4;
                            if (nu2Var.m == null) {
                                nu2Var.m = user;
                                if (!a.equals(a2)) {
                                    ArrayList arrayList20 = (ArrayList) qu2Var3.c0.get(a2);
                                    if (arrayList20 == null) {
                                        arrayList20 = new ArrayList();
                                        qu2Var3.c0.put(a2, arrayList20);
                                        qu2Var3.d0.add(a2);
                                    }
                                    arrayList20.add(nu2Var);
                                    ArrayList arrayList21 = (ArrayList) qu2Var3.c0.get(a);
                                    if (arrayList21 != null) {
                                        int size5 = arrayList21.size();
                                        int i27 = 0;
                                        while (true) {
                                            if (i27 < size5) {
                                                Object obj2 = arrayList21.get(i27);
                                                i27++;
                                                if (obj2 instanceof nu2) {
                                                    nu2 nu2Var2 = (nu2) obj2;
                                                    if (nu2Var2.a == nu2Var.a) {
                                                        if (arrayList21.remove(nu2Var2) && arrayList21.isEmpty()) {
                                                            qu2Var3.c0.remove(a);
                                                            qu2Var3.d0.remove(a);
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
                    if (user2.contact && qu2Var3.g0.get(Long.valueOf(user2.id)) == null) {
                        TLRPC.TL_contact tL_contact3 = new TLRPC.TL_contact();
                        tL_contact3.user_id = user2.id;
                        qu2Var3.f0.add(tL_contact3);
                        qu2Var3.g0.put(Long.valueOf(tL_contact3.user_id), tL_contact3);
                    }
                    i26++;
                    z4 = z5;
                }
                qu2Var3.d(true);
                if (z4) {
                    qu2Var3.E(qu2Var3.c0, qu2Var3.d0, qu2Var3.e0, false);
                }
                qu2Var3.getNotificationCenter().k(25, new Object[0]);
                return;
            case 28:
                rc1 rc1Var = (rc1) this.b;
                String str10 = (String) this.c;
                String str11 = (String) this.d;
                dy2 dy2Var = (dy2) rc1Var.f;
                dy2Var.getClass();
                try {
                    ((xf4) dy2Var.d.d).H(str10, str11);
                    return;
                } catch (IllegalArgumentException e3) {
                    Context context = dy2Var.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e3;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            default:
                mhb mhbVar = (mhb) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                wjb wjbVar = (wjb) this.d;
                mhbVar.setText(charSequence);
                zkb.X(mhbVar.getTextView(), bkb.A6, wjbVar);
                return;
        }
    }
}
