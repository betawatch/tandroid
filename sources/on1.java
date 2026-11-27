// default package

import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class on1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ on1(g92 g92Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = (byte) 17;
        this.b = g92Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0286, code lost:
    
        if (lbc.z(r1.getMessagesController().X1(java.lang.Long.valueOf(r8))) != false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45, types: [int] */
    /* JADX WARN: Type inference failed for: r10v48 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        tx1 tx1Var;
        Editable text;
        boolean z2;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2;
        int i3;
        int i4;
        zh6 zh6Var;
        ArrayList arrayList4;
        int size;
        int i5;
        TLRPC.Chat chat;
        int i6;
        String str2 = "";
        byte b = 13;
        String str3 = " ";
        byte b2 = 26;
        byte b3 = 25;
        String str4 = null;
        int i7 = 1;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                ((zu1) this.b).n9((TLObject) this.d, (TLRPC.User) this.c);
                break;
            case 1:
                zu1 zu1Var = (zu1) this.b;
                mu9 mu9Var = (mu9) this.d;
                TLRPC.User user = (TLRPC.User) this.c;
                mu9Var.dismiss();
                zu1Var.presentFragment(ProfileActivity.Q2(user.id));
                break;
            case 2:
                zu1 zu1Var2 = (zu1) this.b;
                fu5 fu5Var = (fu5) this.d;
                String str5 = (String) this.c;
                fu5Var.u();
                rl7 rl7Var = new rl7(zu1Var2, zu1Var2.getParentActivity());
                rl7Var.I0(str5, false);
                rl7Var.show();
                break;
            case 3:
                ((zu1) this.b).v9((TLRPC.TL_error) this.d, (TLRPC.TL_messages_editMessage) this.c);
                break;
            case 4:
                zu1 zu1Var3 = (zu1) this.b;
                jf7 jf7Var = (jf7) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                zu1Var3.f = jf7Var.g0(zu1Var3.h.user_id);
                countDownLatch.countDown();
                break;
            case 5:
                ct1 ct1Var = (ct1) this.b;
                TLObject tLObject = (TLObject) this.d;
                r47 r47Var = (r47) this.c;
                dt1 dt1Var = ct1Var.c;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    it1 it1Var = dt1Var.a;
                    zu1 zu1Var4 = it1Var.R;
                    it1Var.R.getMessagesController().j4(tL_photos_photo.users, false);
                    TLRPC.User X1 = zu1Var4.getMessagesController().X1(Long.valueOf(zu1Var4.getUserConfig().n));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && X1 != null) {
                        u98.a(r47Var.k.action.photo, X1, false);
                        zu1Var4.getUserConfig().v(X1);
                        zu1Var4.getUserConfig().u(true);
                        z = false;
                        d31.b0(zu1Var4).V(Collections.singletonList(X1), hl.S2(ob6.M0(2131754212, null)), hl.N2(ob6.M0(2131754213, null), -1, 0, new go1(ct1Var, (byte) 6), null), null).j();
                        r47Var.q = z;
                        break;
                    }
                }
                z = false;
                r47Var.q = z;
            case 6:
                ju1 ju1Var = (ju1) this.b;
                wb2 wb2Var = (wb2) this.d;
                TLRPC.Document document = (TLRPC.Document) this.c;
                zu1 zu1Var5 = ju1Var.a;
                if (zu1Var5.getParentActivity() != null && document != null) {
                    if ((Build.VERSION.SDK_INT <= 28 || f11.b) && zu1Var5.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        zu1Var5.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        break;
                    } else {
                        r47 messageObject = wb2Var == null ? null : wb2Var.getMessageObject();
                        if (messageObject != null && messageObject.k != null) {
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = messageObject.O3();
                            tL_message.id = messageObject.e1();
                            tL_message.realId = messageObject.L1();
                            tL_message.dialog_id = r47.B0(messageObject.k);
                            TLRPC.Message message = messageObject.k;
                            tL_message.peer_id = message.peer_id;
                            tL_message.from_id = message.from_id;
                            tL_message.date = message.date;
                            tL_message.message = "";
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                            tL_message.media = tL_messageMediaDocument;
                            tL_messageMediaDocument.flags |= 3;
                            tL_messageMediaDocument.document = document;
                            int i8 = tL_message.flags;
                            tL_message.flags = i8 | 512;
                            if (tL_message.from_id != null) {
                                tL_message.flags = i8 | 768;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            i = ((e) zu1Var5).currentAccount;
                            arrayList5.add(new r47(i, tL_message, false, true));
                            MediaController.i0(zu1Var5.getParentActivity(), zu1Var5.getAccountInstance(), arrayList5, new wt1(ju1Var, document, (byte) 0));
                            break;
                        }
                    }
                }
                break;
            case 7:
                ((ju1) this.b).k((wb2) this.d, (TLRPC.User) this.c);
                break;
            case 8:
                ((ju1) this.b).j((wb2) this.d, (TLRPC.Chat) this.c, 0, false);
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str6 = (String) this.d;
                Runnable runnable = (Runnable) this.c;
                int i9 = ChatActivityEnterView.X7;
                if (!chatActivityEnterView.N2 && (tx1Var = chatActivityEnterView.F0) != null && (text = tx1Var.getText()) != null) {
                    int length = text.length();
                    if (length > 0 && !Character.isWhitespace(text.charAt(length - 1))) {
                        str2 = " ";
                    }
                    String concat = str2.concat(str6);
                    chatActivityEnterView.s1 = true;
                    chatActivityEnterView.S6 = false;
                    text.insert(length, concat);
                    chatActivityEnterView.F0.setSelection(text.length());
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        chatActivityEnterView.o1();
                        hl.d3(new mv1(chatActivityEnterView, b3), 420L);
                        break;
                    }
                }
                break;
            case 10:
                jx1 jx1Var = (jx1) this.b;
                wla wlaVar = (wla) this.d;
                a8a a8aVar = (a8a) this.c;
                wlaVar.getViewTreeObserver().removeOnDrawListener(jx1Var);
                a8aVar.a.setHideAvatar(true);
                break;
            case 11:
                knc kncVar = (knc) this.b;
                FrameLayout frameLayout = (FrameLayout) this.d;
                ey1 ey1Var = (ey1) this.c;
                RectF rectF = new RectF();
                rectF.set(kncVar.O1);
                if (!rectF.isEmpty()) {
                    kncVar.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    int round = Math.round((rectF.left + r4[0]) - r5[0]);
                    int round2 = Math.round((rectF.top + r4[1]) - r5[1]);
                    int round3 = Math.round(rectF.width());
                    int round4 = Math.round(rectF.height());
                    if (ey1Var.getLeft() != round || ey1Var.getTop() != round2 || ey1Var.getWidth() != round3 || ey1Var.getHeight() != round4) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ey1Var.getLayoutParams();
                        layoutParams.leftMargin = round;
                        layoutParams.topMargin = round2;
                        layoutParams.width = round3;
                        layoutParams.height = round4;
                        ey1Var.layout(round, round2, round3 + round, round4 + round2);
                        break;
                    }
                }
                break;
            case 12:
                wy1 wy1Var = (wy1) this.b;
                Uri uri = (Uri) this.d;
                File file = (File) this.c;
                try {
                    InputStream openInputStream = wy1Var.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            no6 no6Var = new no6(-1, file.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(no6Var);
                            hl.c3(new on1(wy1Var, arrayList6, file, b));
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
            case 13:
                ((wy1) this.b).K((File) this.c, (ArrayList) this.d);
                break;
            case 14:
                n12 n12Var = (n12) this.b;
                pn pnVar = (pn) this.d;
                ix0 ix0Var = (ix0) this.c;
                n12Var.A0 = null;
                n12Var.m4 = null;
                pnVar.e();
                n12Var.B0 = (byte) 0;
                if (ix0Var != null) {
                    ix0Var.x();
                }
                if (n12Var.K) {
                    n12Var.c.setLayerType(0, null);
                }
                if (n12Var.W) {
                    WindowManager.LayoutParams attributes = n12Var.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    n12Var.getWindow().setAttributes(attributes);
                }
                jn7.e().k(100, 512);
                break;
            case 15:
                final n12 n12Var2 = (n12) this.b;
                f12 f12Var = (f12) this.d;
                final vq0 vq0Var = (vq0) this.c;
                final boolean z4 = n12Var2.w2.getCurrentItemTop() <= f12Var.getButtonsHideOffset();
                float alpha = n12Var2.U2.getAlpha();
                float f = z4 ? 1.0f : 0.0f;
                vpa vpaVar = new vpa(new xk4(0.0f));
                vpaVar.b(new f02(n12Var2, alpha, f, z4));
                vpaVar.a(new ps3() { // from class: g02
                    @Override // ps3
                    public final void a(vpa vpaVar2, boolean z5, float f2, float f3) {
                        n12 n12Var3 = n12.this;
                        n12Var3.v2.w(1.0f);
                        n12Var3.w2.w(1.0f);
                        n12Var3.v2.m(n12Var3.i4);
                        n12Var3.w2.m(n12Var3.i4);
                        n12Var3.X0.g();
                        n12Var3.b.invalidate();
                        n12Var3.U2.setTag(z4 ? 1 : null);
                        vq0Var.run();
                    }
                });
                wpa wpaVar = new wpa(500.0f);
                vpaVar.m = wpaVar;
                wpaVar.a(1.0f);
                vpaVar.m.b(1000.0f);
                vpaVar.h();
                n12Var2.q3 = vpaVar;
                break;
            case 16:
                String str7 = (String) this.b;
                String[] strArr = (String[]) this.d;
                icc iccVar = (icc) this.c;
                if (TextUtils.equals(str7, strArr[0])) {
                    qz5 a = qz5.a(str7, hl.L(26.0f), false);
                    if (a == null) {
                        a = qz5.a(ob6.M0(2131754000, null), hl.L(26.0f), false);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hl.c3(new ds6(iccVar, a != null ? a.a : null, z2, b));
                    break;
                }
                break;
            case 17:
                g92 g92Var = (g92) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error == null) {
                    g92Var.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject2).count;
                    g92Var.getMessagesStorage().t1(g92Var.y0.invitesCount, g92Var.w0);
                    g92Var.t0(false, false);
                    break;
                }
                break;
            case 18:
                ma2 ma2Var = (ma2) this.b;
                String str8 = (String) this.d;
                ArrayList arrayList7 = (ArrayList) this.c;
                ma2Var.getClass();
                String lowerCase = str8.trim().toLowerCase();
                byte b4 = 19;
                if (lowerCase.length() == 0) {
                    hl.c3(new on1(ma2Var, new ArrayList(), new ArrayList(), b4));
                    break;
                } else {
                    String S0 = ob6.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i10 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i10];
                    strArr2[0] = lowerCase;
                    if (S0 != null) {
                        strArr2[1] = S0;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    int i11 = 0;
                    while (i11 < arrayList7.size()) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) arrayList7.get(i11);
                        String lowerCase2 = chat2.title.toLowerCase();
                        String S02 = ob6.D0().S0(lowerCase2, true, false);
                        if (lowerCase2.equals(S02)) {
                            S02 = str4;
                        }
                        String str9 = str4;
                        char c = 0;
                        int i12 = 0;
                        while (true) {
                            if (i12 < i10) {
                                String str10 = strArr2[i12];
                                if (lowerCase2.startsWith(str10) || uh9.t(str3, str10, lowerCase2) || (S02 != null && (S02.startsWith(str10) || uh9.t(str3, str10, S02)))) {
                                    arrayList = arrayList7;
                                    str = str3;
                                    c = 1;
                                } else {
                                    String str11 = chat2.username;
                                    if (str11 == null || !str11.startsWith(str10)) {
                                        ArrayList<TLRPC.TL_username> arrayList10 = chat2.usernames;
                                        if (arrayList10 == null || arrayList10.isEmpty()) {
                                            arrayList = arrayList7;
                                        } else {
                                            arrayList = arrayList7;
                                            int i13 = 0;
                                            while (i13 < chat2.usernames.size()) {
                                                TLRPC.TL_username tL_username = chat2.usernames.get(i13);
                                                str = str3;
                                                if (tL_username.active && tL_username.username.startsWith(str10)) {
                                                    str9 = tL_username.username;
                                                } else {
                                                    i13++;
                                                    str3 = str;
                                                }
                                            }
                                        }
                                        str = str3;
                                    } else {
                                        str9 = chat2.username;
                                        arrayList = arrayList7;
                                        str = str3;
                                    }
                                    c = 2;
                                }
                                if (c != 0) {
                                    if (c == 1) {
                                        arrayList9.add(hl.r0(chat2.title, null, str10));
                                    } else {
                                        arrayList9.add(hl.r0(c00.i("@", str9), null, "@" + str10));
                                    }
                                    arrayList8.add(chat2);
                                } else {
                                    i12++;
                                    arrayList7 = arrayList;
                                    str3 = str;
                                }
                            } else {
                                arrayList = arrayList7;
                                str = str3;
                            }
                        }
                        i11++;
                        arrayList7 = arrayList;
                        str3 = str;
                        str4 = null;
                    }
                    hl.c3(new on1(ma2Var, arrayList8, arrayList9, (byte) 19));
                    break;
                }
                break;
            case 19:
                ((ma2) this.b).E((ArrayList) this.d, (ArrayList) this.c);
                break;
            case 20:
                bb2 bb2Var = (bb2) this.b;
                ArrayList arrayList11 = (ArrayList) this.d;
                ArrayList arrayList12 = (ArrayList) this.c;
                for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                    ((View) arrayList11.get(i14)).setVisibility(0);
                }
                if (bb2Var.A.removeAll(arrayList12)) {
                    for (int i15 = 0; i15 < arrayList12.size(); i15++) {
                        bb2Var.d((f89) arrayList12.get(i15));
                    }
                    bb2Var.G();
                }
                bb2Var.K.removeAll(arrayList11);
                break;
            case 21:
                bb2 bb2Var2 = (bb2) this.b;
                View view = (View) this.d;
                f89 f89Var = (f89) this.c;
                view.setVisibility(0);
                if (bb2Var2.A.remove(f89Var)) {
                    bb2Var2.d(f89Var);
                    bb2Var2.G();
                }
                bb2Var2.K.remove(view);
                break;
            case 22:
                me2 me2Var = (me2) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                znb znbVar = (znb) this.c;
                HashMap hashMap = me2Var.s;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject3;
                    String r = xb4.r(null, wallPaper.document);
                    if (!hashMap.containsKey(r)) {
                        hashMap.put(r, znbVar);
                        xb4.G(znbVar.F).X(wallPaper.document, wallPaper, 1, 1);
                        break;
                    }
                } else {
                    znbVar.f = true;
                    break;
                }
                break;
            case 23:
                bg2 bg2Var = (bg2) this.b;
                ArrayList arrayList13 = (ArrayList) this.d;
                ArrayList arrayList14 = (ArrayList) this.c;
                zh6 zh6Var2 = bg2Var.L;
                zh6 zh6Var3 = bg2Var.M;
                int i16 = bg2Var.e1;
                zh6 zh6Var4 = bg2Var.K;
                int i17 = bg2Var.O;
                ArrayList arrayList15 = bg2Var.F;
                int i18 = 0;
                int i19 = 0;
                while (i19 < arrayList13.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList13.get(i19);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList14.get(i19);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList2 = arrayList13;
                        arrayList3 = arrayList14;
                        i2 = i16;
                    } else {
                        if (i17 == i7) {
                            i4 = i7;
                            i3 = i16;
                            bg2Var.getMessagesController().S3(bg2Var.N, tL_channels_channelParticipants);
                        } else {
                            i3 = i16;
                            i4 = i7;
                        }
                        bg2Var.getMessagesController().j4(tL_channels_channelParticipants.users, z3);
                        bg2Var.getMessagesController().c4(tL_channels_channelParticipants.chats, z3);
                        long e = bg2Var.getUserConfig().e();
                        if (i3 != 0) {
                            ?? r10 = z3;
                            while (true) {
                                if (r10 < tL_channels_channelParticipants.participants.size()) {
                                    if (r47.B1(tL_channels_channelParticipants.participants.get(r10).peer) == e) {
                                        tL_channels_channelParticipants.participants.remove((int) r10);
                                    } else {
                                        r10++;
                                    }
                                }
                            }
                        }
                        if (i17 == 2) {
                            bg2Var.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList4 = bg2Var.H;
                                zh6Var = zh6Var3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList4 = bg2Var.G;
                                zh6Var = zh6Var2;
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
                                        zh6Var.k(r47.B1(channelParticipant.peer), channelParticipant);
                                    }
                                    i5++;
                                    arrayList14 = arrayList3;
                                    e = j;
                                } else {
                                    int size2 = arrayList4.size() + i18;
                                    if (i17 == 2) {
                                        int size3 = arrayList15.size();
                                        int i20 = 0;
                                        while (i20 < size3) {
                                            TLObject tLObject4 = (TLObject) arrayList15.get(i20);
                                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                                long B1 = r47.B1(((TLRPC.ChannelParticipant) tLObject4).peer);
                                                if (zh6Var3.f(B1) == null && zh6Var2.f(B1) == null) {
                                                    i6 = i3;
                                                    if (i6 == i4) {
                                                        if (B1 > 0) {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    i6 = i3;
                                                }
                                                arrayList15.remove(i20);
                                                zh6Var4.l(B1);
                                                i20--;
                                                size3--;
                                            } else {
                                                arrayList15.remove(i20);
                                                i20--;
                                                size3--;
                                                i6 = i3;
                                            }
                                            i20++;
                                            i3 = i6;
                                            i4 = 1;
                                        }
                                    }
                                    i2 = i3;
                                    if ((i17 == 0 || i17 == 3 || i17 == 2) && (chat = bg2Var.n) != null && chat.megagroup) {
                                        TLRPC.ChatFull chatFull = bg2Var.r;
                                        if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                            Collections.sort(arrayList4, new hf2(bg2Var, bg2Var.getConnectionsManager().getCurrentTime(), (byte) 0));
                                            i18 = size2;
                                        }
                                    }
                                    if (i17 == 1) {
                                        try {
                                            Collections.sort(arrayList15, new ta((byte) 26));
                                        } catch (Exception e2) {
                                            cc4.g(e2, true);
                                        }
                                    }
                                    i18 = size2;
                                }
                            }
                        } else {
                            zh6Var4.b();
                        }
                        zh6Var = zh6Var4;
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
                    i19++;
                    i16 = i2;
                    arrayList13 = arrayList2;
                    arrayList14 = arrayList3;
                    i7 = 1;
                    z3 = false;
                }
                if (i17 != 2 || bg2Var.k1 <= 0) {
                    xf2 xf2Var = bg2Var.a;
                    bg2Var.C0(xf2Var != null ? xf2Var.d.d1 : 0);
                    bg2Var.Q = false;
                    bg2Var.R = true;
                    sla slaVar = bg2Var.f;
                    if (slaVar != null) {
                        slaVar.setVisibility((i17 != 0 || i18 > 5) ? 0 : 8);
                    }
                }
                bg2Var.F0();
                xf2 xf2Var2 = bg2Var.a;
                if (xf2Var2 != null) {
                    gu guVar = bg2Var.c;
                    guVar.X1 = bg2Var.B1;
                    guVar.Y1 = false;
                    xf2Var2.f();
                    z2b z2bVar = bg2Var.b;
                    if (z2bVar != null && bg2Var.a.d.d1 == 0 && bg2Var.R) {
                        z2bVar.e(false, true);
                    }
                }
                bg2Var.resumeDelayedFragmentAnimation();
                break;
            case 24:
                dg2 dg2Var = (dg2) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.c;
                y31.a(dg2Var.a).b();
                dg2Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                e S = LaunchActivity.S();
                if (S != null) {
                    d31.b0(S).Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131752765, lbc.r(dg2Var.T1))).j();
                    break;
                }
                break;
            case 25:
                SpannableString spannableString = (SpannableString) this.b;
                um4 um4Var = (um4) this.d;
                ve2 ve2Var = (ve2) this.c;
                mk2.a(spannableString, spannableString.length(), (j26) um4Var.b);
                ve2Var.run();
                break;
            case 26:
                SpannableString spannableString2 = (SpannableString) this.b;
                um4 um4Var2 = (um4) this.d;
                zo2 zo2Var = (zo2) this.c;
                mk2.a(spannableString2, spannableString2.length(), (j26) um4Var2.b);
                zo2Var.a(spannableString2);
                break;
            case 27:
                gcc.X(((yx6) this.d).l, new ea2((rx6) this.b, (us2) this.c, b2));
                break;
            case 28:
                ((icc) this.b).a((TLRPC.Updates) this.d, (TLRPC.TL_error) this.c);
                break;
            default:
                lv2 lv2Var = (lv2) this.b;
                ArrayList arrayList16 = (ArrayList) this.d;
                ArrayList arrayList17 = (ArrayList) this.c;
                for (int i21 = 0; i21 < arrayList16.size(); i21++) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList16.get(i21);
                    if (lv2Var.g0.get(Long.valueOf(tL_contact.user_id)) == null) {
                        lv2Var.f0.add(tL_contact);
                        lv2Var.g0.put(Long.valueOf(tL_contact.user_id), tL_contact);
                    }
                }
                for (int i22 = 0; i22 < arrayList17.size(); i22++) {
                    Long l = (Long) arrayList17.get(i22);
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) lv2Var.g0.get(l);
                    if (tL_contact2 != null) {
                        lv2Var.f0.remove(tL_contact2);
                        lv2Var.g0.remove(l);
                    }
                }
                if (!arrayList16.isEmpty()) {
                    lv2Var.N();
                    Utilities.h.c(new zu2(lv2Var, new ArrayList(lv2Var.f0), false ? 1 : 0));
                }
                lv2Var.F(lv2.q(lv2Var.Z), false, false, false, false, true, false);
                lv2Var.d(!arrayList16.isEmpty());
                lv2Var.getNotificationCenter().k(25, new Object[0]);
                break;
        }
    }

    public /* synthetic */ on1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
