// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class d65 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d65(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        String str = (String) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        gy9 gy9Var = (gy9) this.e;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < arrayList.size(); i++) {
            if (((TLRPC.TL_messages_stickerSet) arrayList.get(i)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList5 = ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).keywords;
                for (int i2 = 0; i2 < arrayList5.size(); i2++) {
                    for (int i3 = 0; i3 < arrayList5.get(i2).keyword.size(); i3++) {
                        String str2 = arrayList5.get(i2).keyword.get(i3);
                        if (lowerCase.equals(str2)) {
                            arrayList3.add(Long.valueOf(arrayList5.get(i2).document_id));
                        } else if (lowerCase.contains(str2) || str2.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList5.get(i2).document_id));
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if ((arrayList2.get(i4) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i4)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList6 = ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i4)).keywords;
                for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                    for (int i6 = 0; i6 < arrayList6.get(i5).keyword.size(); i6++) {
                        String str3 = arrayList6.get(i5).keyword.get(i6);
                        if (lowerCase.equals(str3)) {
                            arrayList3.add(Long.valueOf(arrayList6.get(i5).document_id));
                        } else if (lowerCase.contains(str3) || str3.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList6.get(i5).document_id));
                        }
                    }
                }
            }
        }
        arrayList3.addAll(arrayList4);
        gy9Var.a(arrayList3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x08a0, code lost:
    
        if (m9c.z(r11) != false) goto L243;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int b;
        vh6 vh6Var;
        ArrayList arrayList;
        boolean z2;
        vh6 vh6Var2;
        String a0;
        int i;
        int i2;
        int i3;
        byte b2 = 9;
        byte b3 = 10;
        byte b4 = 6;
        byte b5 = 2;
        byte b6 = 1;
        ?? r15 = 0;
        switch (this.a) {
            case 0:
                g95 g95Var = (g95) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) this.e;
                j5 j5Var = g95Var.n1;
                qd2 qd2Var = new qd2();
                g95Var.T2 = qd2Var;
                qd2Var.b = new TLRPC.TL_groupCall();
                qd2 qd2Var2 = g95Var.T2;
                TLRPC.GroupCall groupCall = qd2Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                qd2Var2.c = chat != null ? chat.id : 0L;
                groupCall.schedule_date = g95Var.c4;
                groupCall.flags |= 128;
                qd2Var2.C = j5Var;
                qd2Var2.y(inputPeer);
                qd2 qd2Var3 = g95Var.T2;
                TLRPC.GroupCall groupCall2 = qd2Var3.b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                qd2Var3.f();
                m95 m95Var = g95Var.h4;
                qd2 qd2Var4 = g95Var.T2;
                m95Var.c = qd2Var4;
                g95Var.T3.setGroupCall(qd2Var4);
                pb5 pb5Var = g95Var.g4;
                qd2 qd2Var5 = g95Var.T2;
                pb5Var.c = qd2Var5;
                g95Var.V1.E0(j5Var.a, qd2Var5.h(false));
                oc7 r1 = oc7.r1(j5Var.a);
                qd2 qd2Var6 = g95Var.T2;
                r1.b4(qd2Var6.c, qd2Var6);
                break;
            case 1:
                g95 g95Var2 = (g95) this.b;
                HashSet hashSet = (HashSet) this.c;
                qd2 qd2Var7 = (qd2) this.d;
                String str = (String) this.e;
                g95Var2.getClass();
                TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    long longValue = l.longValue();
                    if (qd2Var7 != null) {
                        qd2Var7.u(longValue);
                    }
                    arrayList2.add(oc7.r1(g95Var2.a).W1(l));
                    ArrayList<TLRPC.InputUser> arrayList5 = getrequirementstocontact.id;
                    oc7 r12 = oc7.r1(g95Var2.a);
                    arrayList5.add(r12.p1(r12.W1(l)));
                }
                v15 v15Var = new v15((Object) g95Var2, (Object) arrayList2, (Object) arrayList3, (Object) arrayList4, (Object) str, (byte) 5);
                if (z8c.h(g95Var2.a).p()) {
                    v15Var.run();
                    break;
                } else {
                    ConnectionsManager.getInstance(g95Var2.a).sendRequest(getrequirementstocontact, new i65(arrayList2, arrayList3, v15Var, (byte) 0));
                    break;
                }
            case 2:
                TLObject tLObject = (TLObject) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                v15 v15Var2 = (v15) this.e;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    for (int i4 = 0; i4 < Math.min(arrayList6.size(), vector.objects.size()); i4++) {
                        if (vector.objects.get(i4) instanceof TL_account.requirementToContactPremium) {
                            arrayList7.add(Long.valueOf(((TLRPC.User) arrayList6.get(i4)).id));
                        }
                    }
                }
                v15Var2.run();
                break;
            case 3:
                r85 r85Var = (r85) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str2 = (String) this.e;
                g95 g95Var3 = r85Var.f;
                j5 j5Var2 = g95Var3.n1;
                e75 e75Var = g95Var3.l1;
                gn5 gn5Var = r85Var.d;
                if (gn5Var != null) {
                    e75Var.L0 = gn5Var;
                    e75Var.r1 = null;
                    e75Var.s1 = null;
                    r85Var.d = null;
                }
                if (tL_error == null) {
                    oc7 r13 = oc7.r1(j5Var2.a);
                    int i5 = j5Var2.a;
                    int i6 = j5Var2.a;
                    TLRPC.User W1 = r13.W1(Long.valueOf(z8c.h(i5).e()));
                    if (W1 == null) {
                        W1 = z8c.h(i6).f();
                        if (W1 != null) {
                            oc7.r1(i6).c4(W1, false, false);
                        }
                    } else {
                        z8c.h(i6).v(W1);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w = bc4.w(arrayList8, nm7.f2, false, null, false);
                    TLRPC.PhotoSize w2 = bc4.w(arrayList8, 800, false, null, false);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    W1.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w != null) {
                        tL_userProfilePhoto.photo_small = w.location;
                    }
                    if (w2 != null) {
                        tL_userProfilePhoto.photo_big = w2.location;
                    }
                    if (w == null || r85Var.c == null) {
                        z = true;
                    } else {
                        bc4.G(g95Var3.a);
                        File J = bc4.J(w, null, true, true);
                        bc4.G(g95Var3.a);
                        bc4.J(r85Var.c, null, true, true).renameTo(J);
                        StringBuilder sb = new StringBuilder();
                        sb.append(r85Var.c.volume_id);
                        sb.append("_");
                        String k = hg9.k(sb, r85Var.c.local_id, "@50_50");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w.location.volume_id);
                        sb2.append("_");
                        z = true;
                        fn5.z().O(k, hg9.k(sb2, w.location.local_id, "@50_50"), gn5.l(g95Var3.a, 1, W1));
                    }
                    if (w2 != null && r85Var.b != null) {
                        bc4.G(g95Var3.a);
                        File J2 = bc4.J(w2, null, z, z);
                        bc4.G(g95Var3.a);
                        bc4.J(r85Var.b, null, z, z).renameTo(J2);
                    }
                    if (videoSize != null && str2 != null) {
                        bc4.G(g95Var3.a);
                        new File(str2).renameTo(bc4.J(videoSize, "mp4", z, z));
                    }
                    oc7.r1(i6).T0(W1.id).f();
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(W1);
                    cf7.Y(i6).j1(arrayList9, null, false, true);
                    TLRPC.User W12 = oc7.r1(i6).W1(Long.valueOf(r85Var.e));
                    gn5 l2 = gn5.l(i6, 0, W12);
                    gn5 l3 = gn5.l(i6, 1, W12);
                    if (gn5.e(r85Var.b) == null) {
                        l3 = gn5.e(r85Var.c);
                    }
                    e75Var.setCreateThumbFromParent(false);
                    e75Var.H(null, l2, l3, true);
                    r85Var.c = null;
                    r85Var.b = null;
                    gm.V3(g95Var3.J1);
                    r85Var.a(1.0f);
                }
                nm7 f = nm7.f(j5Var2.a);
                int i7 = oc7.s5;
                f.k(2, Integer.valueOf(oc7.s5));
                nm7.f(j5Var2.a).k(47, new Object[0]);
                z8c.h(j5Var2.a).u(true);
                break;
            case 4:
                ((uc5) this.b).d0((ArrayList) this.c, (ArrayList) this.d, (CountDownLatch) this.e);
                break;
            case 5:
                jd5 jd5Var = (jd5) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                String str3 = (String) this.e;
                jd5Var.d = arrayList10;
                jd5Var.e = arrayList11;
                jd5Var.f();
                kd5 kd5Var = jd5Var.r;
                kd5Var.b.d.setVisibility(8);
                kd5Var.b.e.setText(jb6.a0(null, null, 2131752054, str3));
                kd5Var.b.e(false, true);
                break;
            case 6:
                pd5 pd5Var = (pd5) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.e;
                a1b a1bVar = pd5Var.t1;
                vh6 vh6Var3 = pd5Var.U1;
                vh6 vh6Var4 = pd5Var.V1;
                ArrayList arrayList12 = pd5Var.R1;
                if (tL_error2 == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                    oc7.r1(pd5Var.a).d4(tL_channels_channelParticipants.users, false);
                    oc7.r1(pd5Var.a).X3(tL_channels_channelParticipants.chats, false);
                    long e = z8c.h(pd5Var.a).e();
                    int i8 = 0;
                    while (true) {
                        if (i8 < tL_channels_channelParticipants.participants.size()) {
                            if (k47.B1(tL_channels_channelParticipants.participants.get(i8).peer) == e) {
                                tL_channels_channelParticipants.participants.remove(i8);
                            } else {
                                i8++;
                            }
                        }
                    }
                    pd5Var.O1--;
                    if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                        arrayList = pd5Var.S1;
                        vh6Var = vh6Var4;
                    } else {
                        vh6Var = vh6Var3;
                        arrayList = arrayList12;
                    }
                    arrayList.clear();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i9);
                        vh6Var.k(channelParticipant, k47.B1(channelParticipant.peer));
                    }
                    int size2 = arrayList12.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        long B1 = k47.B1(((TLRPC.ChannelParticipant) arrayList12.get(i10)).peer);
                        boolean z3 = vh6Var4.f(B1) != null || ((vh6Var2 = pd5Var.Y1) != null && vh6Var2.h(B1) >= 0);
                        TLRPC.User W13 = oc7.r1(pd5Var.a).W1(Long.valueOf(B1));
                        if (W13 == null || !W13.bot) {
                            z2 = z3;
                            break;
                        }
                        z2 = true;
                        if (z2) {
                            arrayList12.remove(i10);
                            vh6Var3.l(B1);
                            i10--;
                            size2--;
                        }
                        i10++;
                    }
                    try {
                        if (pd5Var.Q1.participants_count <= 200) {
                            Collections.sort(arrayList, new cg2(pd5Var, ConnectionsManager.getInstance(pd5Var.a).getCurrentTime(), b6));
                        }
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                }
                if (pd5Var.O1 <= 0) {
                    pd5Var.W1 = false;
                    pd5Var.X1 = true;
                    if (pd5Var.k2 == 1) {
                        b = 1;
                    } else {
                        q59 q59Var = pd5Var.p1;
                        b = q59Var != null ? q59Var.b() - 1 : 0;
                    }
                    pd5Var.J0(b);
                    if (arrayList12.isEmpty()) {
                        pd5Var.b2 = true;
                        pd5Var.M0();
                    }
                }
                pd5Var.O0();
                q59 q59Var2 = pd5Var.p1;
                if (q59Var2 != null) {
                    q59Var2.f();
                    if (a1bVar != null && pd5Var.p1.b() == 0 && pd5Var.X1) {
                        a1bVar.e(false, true);
                        break;
                    }
                }
                break;
            case 7:
                ((fn5) this.b).O((String) this.c, (String) this.d, (gn5) this.e);
                break;
            case 8:
                ew5 ew5Var = (ew5) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                d dVar = ew5Var.n1;
                if (dVar != null && dVar.getParentActivity() != null) {
                    if (tL_error3 != null) {
                        "USER_ALREADY_PARTICIPANT".equals(tL_error3.text);
                        ik.c0(ew5Var.a, tL_error3, dVar, tL_messages_importChatInvite, new Object[0]);
                        break;
                    } else if (updates != null && !updates.chats.isEmpty()) {
                        TLRPC.Chat chat2 = updates.chats.get(0);
                        chat2.left = false;
                        chat2.kicked = false;
                        oc7.r1(ew5Var.a).d4(updates.users, false);
                        oc7.r1(ew5Var.a).X3(updates.chats, false);
                        long j = chat2.id;
                        boolean z4 = !sd2.V(chat2);
                        Bundle k2 = kt6.k(j, "chat_id");
                        oc7 r14 = oc7.r1(ew5Var.a);
                        d dVar2 = ew5Var.n1;
                        if (r14.A(k2, dVar2, null, null)) {
                            dVar2.presentFragment(new dw5(ew5Var, k2, z4, j), dVar2 instanceof yv1);
                            break;
                        }
                    }
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                k16 k16Var = (k16) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                String str4 = LaunchActivity.C1;
                try {
                    k16Var.run();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern = ik.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    if (jb6.D0().B.c.equals(tL_langPackLanguage.lang_code)) {
                        alertDialog$Builder.a.S = jb6.M0(2131748811, null);
                        a0 = jb6.a0("LanguageSame", null, 2131748804, tL_langPackLanguage.name);
                        alertDialog$Builder.g(jb6.M0(2131747564, null), null);
                        alertDialog$Builder.h(jb6.M0(2131745717, null), new hf(launchActivity, r15));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        alertDialog$Builder.a.S = jb6.M0(2131748801, null);
                        a0 = jb6.a0("LanguageUnknownCustomAlert", null, 2131748802, tL_langPackLanguage.name);
                        alertDialog$Builder.g(jb6.M0(2131747564, null), null);
                    } else {
                        alertDialog$Builder.a.S = jb6.M0(2131748803, null);
                        boolean z5 = tL_langPackLanguage.official;
                        String str6 = tL_langPackLanguage.name;
                        int i11 = tL_langPackLanguage.translated_count;
                        int i12 = tL_langPackLanguage.strings_count;
                        a0 = z5 ? jb6.a0("LanguageAlert", null, 2131748810, str6, Integer.valueOf((int) Math.ceil((i11 / i12) * 100.0f))) : jb6.a0("LanguageCustomAlert", null, 2131748807, str6, Integer.valueOf((int) Math.ceil((i11 / i12) * 100.0f)));
                        alertDialog$Builder.j(jb6.M0(2131752505, null), new o(tL_langPackLanguage, launchActivity, b5));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gm.S2(a0));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i13 = indexOf + 1;
                        i = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i13);
                        if (i != -1) {
                            spannableStringBuilder.delete(i, i + 1);
                            spannableStringBuilder.delete(indexOf, i13);
                        }
                    } else {
                        i = -1;
                    }
                    if (indexOf != -1 && i != -1) {
                        spannableStringBuilder.setSpan(new xi(tL_langPackLanguage.translations_url, alertDialog$Builder), indexOf, i - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    anb.G(textView, cmb.j5, null);
                    anb.C(textView, cmb.k5, null);
                    textView.setPadding(gm.L(23.0f), 0, gm.L(23.0f), 0);
                    textView.setMovementMethod(new cm((byte) 0));
                    anb.X(textView, cmb.i5, null);
                    alertDialog$Builder.n(textView);
                    launchActivity.F0(alertDialog$Builder);
                    break;
                } else if (tL_error4 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error4.text)) {
                        launchActivity.F0(ik.K(launchActivity, null, jb6.M0(2131748800, null)));
                        break;
                    } else {
                        launchActivity.F0(ik.K(launchActivity, null, jb6.M0(2131751042, null) + "\n" + tL_error4.text));
                        break;
                    }
                }
                break;
            case 10:
                he heVar = (he) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                u8 u8Var = (u8) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                String str7 = LaunchActivity.C1;
                try {
                    heVar.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    gm.c3(new fd5(u8Var, tL_error5, (byte) 24));
                    break;
                }
                break;
            case 11:
                f56 f56Var = (f56) this.b;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                f56Var.E = false;
                f56Var.M = tL_chatInviteExported.link;
                if (tL_error6 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject6;
                    ArrayList<TLRPC.User> arrayList13 = tL_chatInviteExported.importers;
                    if (arrayList13 == null) {
                        arrayList13 = new ArrayList<>(3);
                        tL_chatInviteExported.importers = arrayList13;
                    }
                    arrayList13.clear();
                    while (r15 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        r15++;
                    }
                    f56Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 12:
                a66 a66Var = (a66) this.b;
                d dVar3 = (d) this.c;
                TLRPC.User[] userArr = (TLRPC.User[]) this.d;
                l13.e(dVar3.getContext(), a66Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) this.e, true, new u35(a66Var, userArr, b4), dVar3.getResourceProvider(), a66.d());
                break;
            case 13:
                ((x56) this.b).z0((TLObject) this.c, (HashSet) this.d, (TLRPC.TL_error) this.e);
                break;
            case 14:
                dd6 dd6Var = (dd6) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                dd6Var.getMessagesController().d4(arrayList14, true);
                dd6Var.getMessagesController().X3(arrayList15, true);
                Utilities.d.c(new zc6(dd6Var, arrayList16, r15));
                break;
            case 15:
                gt7 gt7Var = (gt7) this.b;
                View view = (View) this.c;
                EditText editText = (EditText) this.d;
                qz qzVar = (qz) this.e;
                gt7Var.a(0.0f);
                view.setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new k16(editText, qzVar, (byte) 15));
                    break;
                }
                break;
            case 16:
                ff6 ff6Var = (ff6) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) this.e;
                byte[] g1 = str8 != null ? gm.g1(str8) : null;
                df6 df6Var = new df6(ff6Var, str8, str9, r15);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ff6Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str8 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = nq9.b(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error7 = new TLRPC.TL_error();
                            tL_error7.text = "ALGO_INVALID";
                            df6Var.run(null, tL_error7);
                        }
                    }
                    i2 = ((d) ff6Var.H).currentAccount;
                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_recoverPassword, df6Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error8 = new TLRPC.TL_error();
                    tL_error8.text = "PASSWORD_HASH_INVALID";
                    df6Var.run(null, tL_error8);
                    break;
                }
            case 17:
                sf6 sf6Var = (sf6) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str10 = (String) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.e;
                mh6 mh6Var = sf6Var.E;
                mh6Var.y1(false, true);
                sf6Var.n = false;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str10);
                    bundle.putString("password", sf6Var.h);
                    mh6Var.J1(9, true, bundle, false);
                    break;
                } else if (tL_error9 != null && !tL_error9.text.startsWith("CODE_INVALID")) {
                    if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error9.text).intValue();
                        mh6Var.z1(jb6.M0(2131745804, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    } else {
                        mh6Var.z1(jb6.M0(2131745804, null), tL_error9.text);
                        break;
                    }
                } else {
                    sf6Var.n(true);
                    break;
                }
            case 18:
                rg6 rg6Var = (rg6) this.b;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.c;
                Bundle bundle2 = (Bundle) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                mh6 mh6Var2 = rg6Var.v0;
                rg6Var.g0 = false;
                if (tL_error10 == null) {
                    rg6Var.r0 = bundle2;
                    if (tLObject8 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject8;
                        rg6Var.s0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            rg6Var.j0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            rg6Var.j0 = 16;
                        }
                        mh6Var2.q1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject8 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject8;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        mh6Var2.J1(18, true, bundle2, true);
                    }
                } else {
                    String str11 = tL_error10.text;
                    if (str11 != null) {
                        if (str11.contains("PHONE_NUMBER_INVALID")) {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, null));
                        } else if (tL_error10.text.contains("PHONE_CODE_EMPTY") || tL_error10.text.contains("PHONE_CODE_INVALID")) {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131748940, null));
                        } else if (tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                            rg6Var.d(true);
                            mh6Var2.J1(0, true, null, true);
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, null));
                        } else if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, null));
                        } else if (tL_error10.code != -1000) {
                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751042, null) + "\n" + tL_error10.text);
                        }
                    }
                }
                rg6Var.y(false);
                break;
            case 19:
                ((wg6) this.b).n((String) this.c, (String) this.d, (String) this.e);
                break;
            case 20:
                wg6 wg6Var = (wg6) this.b;
                ln8 ln8Var = (ln8) this.c;
                sk3 sk3Var = (sk3) this.d;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.e;
                mh6 mh6Var3 = wg6Var.w;
                mh6Var3.e = true;
                cj0.h().c(ln8Var.c, new gx(sk3Var, b3));
                cj0.h().h = new vg6(sk3Var, r15);
                cj0 h = cj0.h();
                Activity parentActivity = mh6Var3.getParentActivity();
                i3 = ((d) mh6Var3).currentAccount;
                j5 a = j5.a(i3);
                hi2 hi2Var = new hi2(b2, (boolean) r15);
                hi2Var.T(ln8Var);
                h.k(parentActivity, a, tL_inputStorePaymentAuthCode, Collections.singletonList(hi2Var.c()));
                break;
            case 21:
                lh6 lh6Var = (lh6) this.b;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                String str12 = (String) this.e;
                lh6Var.N = false;
                mh6 mh6Var4 = lh6Var.h0;
                mh6Var4.K1(false, true);
                if (tL_error11 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject9;
                    if (TwoStepVerificationActivity.b0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str12);
                        mh6Var4.J1(6, true, bundle3, false);
                        break;
                    } else {
                        ik.u0(mh6Var4.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                        break;
                    }
                } else {
                    mh6Var4.z1(jb6.M0(2131745804, null), tL_error11.text);
                    break;
                }
            case 22:
                cm6 cm6Var = (cm6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ArrayList arrayList17 = (ArrayList) this.d;
                boolean[] zArr2 = (boolean[]) this.e;
                zArr[0] = true;
                gm.r(cm6Var.R);
                for (int i14 = 0; i14 < arrayList17.size(); i14++) {
                    ((TL_stories.StoryItem) arrayList17.get(i14)).pinned = zArr2[i14];
                }
                cm6Var.getMessagesController().N1().q0(cm6Var.e, arrayList17, false);
                break;
            case 23:
                try {
                    gm.c3(new d65((MediaController) this.b, (String) this.d, MediaController.getWaveform((String) this.c), (k47) this.e, (byte) 24));
                    break;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                    return;
                }
            case 24:
                MediaController mediaController = (MediaController) this.b;
                String str13 = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                k47 k47Var = (k47) this.e;
                String[] strArr = MediaController.W1;
                k47 k47Var2 = (k47) mediaController.d0.remove(str13);
                if (k47Var2 != null) {
                    int i15 = k47Var2.K1;
                    if (bArr != null && k47Var2.F0() != null) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < k47Var2.F0().attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = k47Var2.F0().attributes.get(i16);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                    documentAttribute.waveform = bArr;
                                    documentAttribute.flags |= 4;
                                } else {
                                    i16++;
                                }
                            }
                        }
                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                        tL_messages_messages.messages.add(k47Var2.k);
                        cf7.Y(i15).e1(-1, 0, k47Var.r1 ? 1 : 0, k47.B0(k47Var2.k), 0L, tL_messages_messages, false);
                        nm7.f(i15).k(50, Long.valueOf(k47.B0(k47Var2.k)), td4.u(k47Var2));
                        break;
                    }
                }
                break;
            case 25:
                hs6 hs6Var = (hs6) this.b;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.c;
                TLObject tLObject10 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                ArrayList arrayList18 = hs6Var.H1;
                if (tL_error12 == null && (tLObject10 instanceof TLRPC.TL_messages_reactions)) {
                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject10;
                    arrayList18.clear();
                    arrayList18.addAll(tL_messages_reactions.reactions);
                    hs6.V1(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                    hs6Var.getNotificationCenter().k(nm7.j3, 0L);
                }
                hs6Var.K1 = false;
                break;
            case 26:
                ((hs6) this.b).c1(5, true, false, false, new iu((boolean[]) this.c, (ArrayList[]) this.d, (zq6) this.e, (byte) 27));
                break;
            case 27:
                hs6 hs6Var2 = (hs6) this.b;
                String[] strArr2 = (String[]) this.c;
                es6 es6Var = (es6) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                for (String str14 : strArr2) {
                    if (hs6Var2.C1.get(str14) != null) {
                        break;
                    }
                }
                es6Var.f(null, arrayList19);
                break;
            case 28:
                a();
                break;
            default:
                tx6 tx6Var = (tx6) this.b;
                ec9 ec9Var = (ec9) this.c;
                try {
                    ec9Var.m(tx6Var.b((sw6) this.d, (cj6) this.e));
                    break;
                } catch (RuntimeException e5) {
                    ec9Var.l(e5);
                }
        }
    }
}
