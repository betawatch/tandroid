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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class e45 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e45(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
        dw9 dw9Var = (dw9) this.e;
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
        dw9Var.a(arrayList3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x089b, code lost:
    
        if (l7c.z(r11) != false) goto L243;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v16 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int b;
        vf6 vf6Var;
        ArrayList arrayList;
        boolean z;
        vf6 vf6Var2;
        String a0;
        int i;
        int i2;
        int i3;
        byte b2 = 10;
        byte b3 = 2;
        boolean z2 = true;
        z2 = true;
        ?? r13 = 0;
        switch (this.a) {
            case 0:
                h75 h75Var = (h75) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) this.e;
                j5 j5Var = h75Var.n1;
                fc2 fc2Var = new fc2();
                h75Var.T2 = fc2Var;
                fc2Var.b = new TLRPC.TL_groupCall();
                fc2 fc2Var2 = h75Var.T2;
                TLRPC.GroupCall groupCall = fc2Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                fc2Var2.c = chat != null ? chat.id : 0L;
                groupCall.schedule_date = h75Var.c4;
                groupCall.flags |= 128;
                fc2Var2.C = j5Var;
                fc2Var2.y(inputPeer);
                fc2 fc2Var3 = h75Var.T2;
                TLRPC.GroupCall groupCall2 = fc2Var3.b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                fc2Var3.f();
                n75 n75Var = h75Var.h4;
                fc2 fc2Var4 = h75Var.T2;
                n75Var.c = fc2Var4;
                h75Var.T3.setGroupCall(fc2Var4);
                r95 r95Var = h75Var.g4;
                fc2 fc2Var5 = h75Var.T2;
                r95Var.c = fc2Var5;
                h75Var.V1.E0(j5Var.a, fc2Var5.h(false));
                na7 q1 = na7.q1(j5Var.a);
                fc2 fc2Var6 = h75Var.T2;
                q1.Z3(fc2Var6.c, fc2Var6);
                break;
            case 1:
                h75 h75Var2 = (h75) this.b;
                HashSet hashSet = (HashSet) this.c;
                fc2 fc2Var7 = (fc2) this.d;
                String str = (String) this.e;
                h75Var2.getClass();
                TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    long longValue = l.longValue();
                    if (fc2Var7 != null) {
                        fc2Var7.u(longValue);
                    }
                    arrayList2.add(na7.q1(h75Var2.a).V1(l));
                    ArrayList<TLRPC.InputUser> arrayList5 = getrequirementstocontact.id;
                    na7 q12 = na7.q1(h75Var2.a);
                    arrayList5.add(q12.o1(q12.V1(l)));
                }
                vz4 vz4Var = new vz4((Object) h75Var2, (Object) arrayList2, (Object) arrayList3, (Object) arrayList4, (Object) str, (byte) 5);
                if (y6c.h(h75Var2.a).p()) {
                    vz4Var.run();
                    break;
                } else {
                    ConnectionsManager.getInstance(h75Var2.a).sendRequest(getrequirementstocontact, new k45(arrayList2, arrayList3, vz4Var, (byte) 0));
                    break;
                }
            case 2:
                TLObject tLObject = (TLObject) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                vz4 vz4Var2 = (vz4) this.e;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    for (int i4 = 0; i4 < Math.min(arrayList6.size(), vector.objects.size()); i4++) {
                        if (vector.objects.get(i4) instanceof TL_account.requirementToContactPremium) {
                            arrayList7.add(Long.valueOf(((TLRPC.User) arrayList6.get(i4)).id));
                        }
                    }
                }
                vz4Var2.run();
                break;
            case 3:
                t65 t65Var = (t65) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str2 = (String) this.e;
                h75 h75Var3 = t65Var.f;
                j5 j5Var2 = h75Var3.n1;
                g55 g55Var = h75Var3.l1;
                gl5 gl5Var = t65Var.d;
                if (gl5Var != null) {
                    g55Var.L0 = gl5Var;
                    g55Var.r1 = null;
                    g55Var.s1 = null;
                    t65Var.d = null;
                }
                if (tL_error == null) {
                    na7 q13 = na7.q1(j5Var2.a);
                    int i5 = j5Var2.a;
                    int i6 = j5Var2.a;
                    TLRPC.User V1 = q13.V1(Long.valueOf(y6c.h(i5).e()));
                    if (V1 == null) {
                        V1 = y6c.h(i6).f();
                        if (V1 != null) {
                            na7.q1(i6).a4(V1, false, false);
                        }
                    } else {
                        y6c.h(i6).v(V1);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w = ba4.w(arrayList8, kk7.f2, false, null, false);
                    TLRPC.PhotoSize w2 = ba4.w(arrayList8, 800, false, null, false);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    V1.photo = tL_userProfilePhoto;
                    TLRPC.VideoSize videoSize2 = videoSize;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w != null) {
                        tL_userProfilePhoto.photo_small = w.location;
                    }
                    if (w2 != null) {
                        tL_userProfilePhoto.photo_big = w2.location;
                    }
                    if (w != null && t65Var.c != null) {
                        ba4.G(h75Var3.a);
                        File J = ba4.J(w, null, true, true);
                        ba4.G(h75Var3.a);
                        ba4.J(t65Var.c, null, true, true).renameTo(J);
                        StringBuilder sb = new StringBuilder();
                        sb.append(t65Var.c.volume_id);
                        sb.append("_");
                        String l2 = de9.l(sb, t65Var.c.local_id, "@50_50");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w.location.volume_id);
                        sb2.append("_");
                        z2 = true;
                        fl5.z().O(l2, de9.l(sb2, w.location.local_id, "@50_50"), gl5.l(h75Var3.a, 1, V1));
                    }
                    if (w2 != null && t65Var.b != null) {
                        ba4.G(h75Var3.a);
                        File J2 = ba4.J(w2, null, z2, z2);
                        ba4.G(h75Var3.a);
                        ba4.J(t65Var.b, null, z2, z2).renameTo(J2);
                    }
                    if (videoSize2 != null && str2 != null) {
                        ba4.G(h75Var3.a);
                        new File(str2).renameTo(ba4.J(videoSize2, "mp4", z2, z2));
                    }
                    na7.q1(i6).S0(V1.id).f();
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(V1);
                    ad7.Y(i6).j1(arrayList9, null, false, true);
                    TLRPC.User V12 = na7.q1(i6).V1(Long.valueOf(t65Var.e));
                    gl5 l3 = gl5.l(i6, 0, V12);
                    gl5 l4 = gl5.l(i6, 1, V12);
                    if (gl5.e(t65Var.b) == null) {
                        l4 = gl5.e(t65Var.c);
                    }
                    g55Var.setCreateThumbFromParent(false);
                    g55Var.H(null, l3, l4, true);
                    t65Var.c = null;
                    t65Var.b = null;
                    gl.V3(h75Var3.J1);
                    t65Var.a(1.0f);
                }
                kk7 f = kk7.f(j5Var2.a);
                int i7 = na7.q5;
                f.k(2, Integer.valueOf(na7.q5));
                kk7.f(j5Var2.a).k(46, new Object[0]);
                y6c.h(j5Var2.a).u(true);
                break;
            case 4:
                ((wa5) this.b).c0((ArrayList) this.c, (ArrayList) this.d, (CountDownLatch) this.e);
                break;
            case 5:
                lb5 lb5Var = (lb5) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                String str3 = (String) this.e;
                lb5Var.d = arrayList10;
                lb5Var.e = arrayList11;
                lb5Var.f();
                mb5 mb5Var = lb5Var.r;
                mb5Var.b.d.setVisibility(8);
                mb5Var.b.e.setText(k96.a0(null, null, 2131752105, str3));
                mb5Var.b.e(false, true);
                break;
            case 6:
                rb5 rb5Var = (rb5) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.e;
                zya zyaVar = rb5Var.t1;
                vf6 vf6Var3 = rb5Var.U1;
                vf6 vf6Var4 = rb5Var.V1;
                ArrayList arrayList12 = rb5Var.R1;
                if (tL_error2 == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                    na7.q1(rb5Var.a).b4(tL_channels_channelParticipants.users, false);
                    na7.q1(rb5Var.a).V3(tL_channels_channelParticipants.chats, false);
                    long e = y6c.h(rb5Var.a).e();
                    int i8 = 0;
                    while (true) {
                        if (i8 < tL_channels_channelParticipants.participants.size()) {
                            if (k27.B1(tL_channels_channelParticipants.participants.get(i8).peer) == e) {
                                tL_channels_channelParticipants.participants.remove(i8);
                            } else {
                                i8++;
                            }
                        }
                    }
                    rb5Var.O1--;
                    if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                        arrayList = rb5Var.S1;
                        vf6Var = vf6Var4;
                    } else {
                        vf6Var = vf6Var3;
                        arrayList = arrayList12;
                    }
                    arrayList.clear();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i9);
                        vf6Var.k(channelParticipant, k27.B1(channelParticipant.peer));
                    }
                    int size2 = arrayList12.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        long B1 = k27.B1(((TLRPC.ChannelParticipant) arrayList12.get(i10)).peer);
                        boolean z3 = vf6Var4.f(B1) != null || ((vf6Var2 = rb5Var.Y1) != null && vf6Var2.h(B1) >= 0);
                        TLRPC.User V13 = na7.q1(rb5Var.a).V1(Long.valueOf(B1));
                        if (V13 == null || !V13.bot) {
                            z = z3;
                            break;
                        }
                        z = true;
                        if (z) {
                            arrayList12.remove(i10);
                            vf6Var3.l(B1);
                            i10--;
                            size2--;
                        }
                        i10++;
                    }
                    try {
                        if (rb5Var.Q1.participants_count <= 200) {
                            Collections.sort(arrayList, new qe2(rb5Var, ConnectionsManager.getInstance(rb5Var.a).getCurrentTime(), true ? (byte) 1 : (byte) 0));
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                if (rb5Var.O1 <= 0) {
                    rb5Var.W1 = false;
                    rb5Var.X1 = true;
                    if (rb5Var.k2 == 1) {
                        b = 1;
                    } else {
                        n39 n39Var = rb5Var.p1;
                        b = n39Var != null ? n39Var.b() - 1 : 0;
                    }
                    rb5Var.J0(b);
                    if (arrayList12.isEmpty()) {
                        rb5Var.b2 = true;
                        rb5Var.M0();
                    }
                }
                rb5Var.O0();
                n39 n39Var2 = rb5Var.p1;
                if (n39Var2 != null) {
                    n39Var2.f();
                    if (zyaVar != null && rb5Var.p1.b() == 0 && rb5Var.X1) {
                        zyaVar.e(false, true);
                        break;
                    }
                }
                break;
            case 7:
                ((fl5) this.b).O((String) this.c, (String) this.d, (gl5) this.e);
                break;
            case 8:
                fu5 fu5Var = (fu5) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                d dVar = fu5Var.n1;
                if (dVar != null && dVar.getParentActivity() != null) {
                    if (tL_error3 != null) {
                        "USER_ALREADY_PARTICIPANT".equals(tL_error3.text);
                        ij.c0(fu5Var.a, tL_error3, dVar, tL_messages_importChatInvite, new Object[0]);
                        break;
                    } else if (updates != null && !updates.chats.isEmpty()) {
                        TLRPC.Chat chat2 = updates.chats.get(0);
                        chat2.left = false;
                        chat2.kicked = false;
                        na7.q1(fu5Var.a).b4(updates.users, false);
                        na7.q1(fu5Var.a).V3(updates.chats, false);
                        long j = chat2.id;
                        boolean z4 = !hc2.V(chat2);
                        Bundle k = ls6.k(j, "chat_id");
                        na7 q14 = na7.q1(fu5Var.a);
                        d dVar2 = fu5Var.n1;
                        if (q14.A(k, dVar2, null, null)) {
                            dVar2.presentFragment(new eu5(fu5Var, k, z4, j), dVar2 instanceof mu1);
                            break;
                        }
                    }
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                kz5 kz5Var = (kz5) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                String str4 = LaunchActivity.C1;
                try {
                    kz5Var.run();
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern = ij.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    if (k96.D0().B.c.equals(tL_langPackLanguage.lang_code)) {
                        alertDialog$Builder.a.S = k96.M0(2131748862, null);
                        a0 = k96.a0("LanguageSame", null, 2131748855, tL_langPackLanguage.name);
                        alertDialog$Builder.g(k96.M0(2131747638, null), null);
                        alertDialog$Builder.h(k96.M0(2131745791, null), new he(launchActivity, r13));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        alertDialog$Builder.a.S = k96.M0(2131748852, null);
                        a0 = k96.a0("LanguageUnknownCustomAlert", null, 2131748853, tL_langPackLanguage.name);
                        alertDialog$Builder.g(k96.M0(2131747638, null), null);
                    } else {
                        alertDialog$Builder.a.S = k96.M0(2131748854, null);
                        boolean z5 = tL_langPackLanguage.official;
                        String str6 = tL_langPackLanguage.name;
                        int i11 = tL_langPackLanguage.translated_count;
                        int i12 = tL_langPackLanguage.strings_count;
                        a0 = z5 ? k96.a0("LanguageAlert", null, 2131748861, str6, Integer.valueOf((int) Math.ceil((i11 / i12) * 100.0f))) : k96.a0("LanguageCustomAlert", null, 2131748858, str6, Integer.valueOf((int) Math.ceil((i11 / i12) * 100.0f)));
                        alertDialog$Builder.j(k96.M0(2131752540, null), new o(tL_langPackLanguage, launchActivity, b3));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gl.S2(a0));
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
                        spannableStringBuilder.setSpan(new xh(tL_langPackLanguage.translations_url, alertDialog$Builder), indexOf, i - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    zkb.G(textView, bkb.j5, null);
                    zkb.C(textView, bkb.k5, null);
                    textView.setPadding(gl.L(23.0f), 0, gl.L(23.0f), 0);
                    textView.setMovementMethod(new cl((byte) 0));
                    zkb.X(textView, bkb.i5, null);
                    alertDialog$Builder.n(textView);
                    launchActivity.F0(alertDialog$Builder);
                    break;
                } else if (tL_error4 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error4.text)) {
                        launchActivity.F0(ij.K(launchActivity, null, k96.M0(2131748851, null)));
                        break;
                    } else {
                        launchActivity.F0(ij.K(launchActivity, null, k96.M0(2131751093, null) + "\n" + tL_error4.text));
                        break;
                    }
                }
                break;
            case 10:
                hd hdVar = (hd) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                u8 u8Var = (u8) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                String str7 = LaunchActivity.C1;
                try {
                    hdVar.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    gl.c3(new hb5(u8Var, tL_error5, (byte) 23));
                    break;
                }
                break;
            case 11:
                f36 f36Var = (f36) this.b;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                f36Var.E = false;
                f36Var.M = tL_chatInviteExported.link;
                if (tL_error6 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject6;
                    ArrayList<TLRPC.User> arrayList13 = tL_chatInviteExported.importers;
                    if (arrayList13 == null) {
                        arrayList13 = new ArrayList<>(3);
                        tL_chatInviteExported.importers = arrayList13;
                    }
                    arrayList13.clear();
                    while (r13 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        r13++;
                    }
                    f36Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 12:
                a46 a46Var = (a46) this.b;
                d dVar3 = (d) this.c;
                TLRPC.User[] userArr = (TLRPC.User[]) this.d;
                a03.e(dVar3.getContext(), a46Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) this.e, true, new x15(a46Var, userArr, (byte) 5), dVar3.getResourceProvider(), a46.d());
                break;
            case 13:
                ((x36) this.b).y0((TLObject) this.c, (HashSet) this.d, (TLRPC.TL_error) this.e);
                break;
            case 14:
                eb6 eb6Var = (eb6) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                eb6Var.getMessagesController().b4(arrayList14, true);
                eb6Var.getMessagesController().V3(arrayList15, true);
                Utilities.d.c(new ab6(eb6Var, arrayList16, r13));
                break;
            case 15:
                er7 er7Var = (er7) this.b;
                View view = (View) this.c;
                EditText editText = (EditText) this.d;
                qy qyVar = (qy) this.e;
                er7Var.a(0.0f);
                view.setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new kz5(editText, qyVar, (byte) 14));
                    break;
                }
                break;
            case 16:
                gd6 gd6Var = (gd6) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) this.e;
                byte[] g1 = str8 != null ? gl.g1(str8) : null;
                ed6 ed6Var = new ed6(gd6Var, str8, str9, r13);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = gd6Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str8 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = mo9.b(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error7 = new TLRPC.TL_error();
                            tL_error7.text = "ALGO_INVALID";
                            ed6Var.run(null, tL_error7);
                        }
                    }
                    i2 = ((d) gd6Var.H).currentAccount;
                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_recoverPassword, ed6Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error8 = new TLRPC.TL_error();
                    tL_error8.text = "PASSWORD_HASH_INVALID";
                    ed6Var.run(null, tL_error8);
                    break;
                }
            case 17:
                td6 td6Var = (td6) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str10 = (String) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.e;
                mf6 mf6Var = td6Var.E;
                mf6Var.x1(false, true);
                td6Var.n = false;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str10);
                    bundle.putString("password", td6Var.h);
                    mf6Var.I1(9, true, bundle, false);
                    break;
                } else if (tL_error9 != null && !tL_error9.text.startsWith("CODE_INVALID")) {
                    if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error9.text).intValue();
                        mf6Var.y1(k96.M0(2131745878, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    } else {
                        mf6Var.y1(k96.M0(2131745878, null), tL_error9.text);
                        break;
                    }
                } else {
                    td6Var.n(true);
                    break;
                }
            case 18:
                qe6 qe6Var = (qe6) this.b;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.c;
                Bundle bundle2 = (Bundle) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                mf6 mf6Var2 = qe6Var.v0;
                qe6Var.g0 = false;
                if (tL_error10 == null) {
                    qe6Var.r0 = bundle2;
                    if (tLObject8 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject8;
                        qe6Var.s0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            qe6Var.j0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            qe6Var.j0 = 16;
                        }
                        mf6Var2.p1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject8 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject8;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        mf6Var2.I1(18, true, bundle2, true);
                    }
                } else {
                    String str11 = tL_error10.text;
                    if (str11 != null) {
                        if (str11.contains("PHONE_NUMBER_INVALID")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131748987, null));
                        } else if (tL_error10.text.contains("PHONE_CODE_EMPTY") || tL_error10.text.contains("PHONE_CODE_INVALID")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131748991, null));
                        } else if (tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                            qe6Var.d(true);
                            mf6Var2.I1(0, true, null, true);
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131752009, null));
                        } else if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131750670, null));
                        } else if (tL_error10.code != -1000) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131751093, null) + "\n" + tL_error10.text);
                        }
                    }
                }
                qe6Var.y(false);
                break;
            case 19:
                ((ve6) this.b).n((String) this.c, (String) this.d, (String) this.e);
                break;
            case 20:
                ve6 ve6Var = (ve6) this.b;
                kl8 kl8Var = (kl8) this.c;
                hj3 hj3Var = (hj3) this.d;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.e;
                mf6 mf6Var3 = ve6Var.w;
                mf6Var3.e = true;
                ci0.h().c(kl8Var.c, new gw(hj3Var, b2));
                ci0.h().h = new ue6(hj3Var, r13);
                ci0 h = ci0.h();
                Activity parentActivity = mf6Var3.getParentActivity();
                i3 = ((d) mf6Var3).currentAccount;
                j5 a = j5.a(i3);
                lv6 lv6Var = new lv6((byte) 7, (boolean) r13);
                lv6Var.L(kl8Var);
                h.k(parentActivity, a, tL_inputStorePaymentAuthCode, Collections.singletonList(lv6Var.d()));
                break;
            case 21:
                lf6 lf6Var = (lf6) this.b;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                String str12 = (String) this.e;
                lf6Var.N = false;
                mf6 mf6Var4 = lf6Var.h0;
                mf6Var4.J1(false, true);
                if (tL_error11 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject9;
                    if (TwoStepVerificationActivity.a0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str12);
                        mf6Var4.I1(6, true, bundle3, false);
                        break;
                    } else {
                        ij.u0(mf6Var4.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                        break;
                    }
                } else {
                    mf6Var4.y1(k96.M0(2131745878, null), tL_error11.text);
                    break;
                }
            case 22:
                zj6 zj6Var = (zj6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ArrayList arrayList17 = (ArrayList) this.d;
                boolean[] zArr2 = (boolean[]) this.e;
                zArr[0] = true;
                gl.r(zj6Var.R);
                for (int i14 = 0; i14 < arrayList17.size(); i14++) {
                    ((TL_stories.StoryItem) arrayList17.get(i14)).pinned = zArr2[i14];
                }
                zj6Var.getMessagesController().M1().q0(zj6Var.e, arrayList17, false);
                break;
            case 23:
                try {
                    gl.c3(new e45((MediaController) this.b, (String) this.d, MediaController.getWaveform((String) this.c), (k27) this.e, (byte) 24));
                    break;
                } catch (Exception e4) {
                    fa4.g(e4, true);
                    return;
                }
            case 24:
                MediaController mediaController = (MediaController) this.b;
                String str13 = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                k27 k27Var = (k27) this.e;
                String[] strArr = MediaController.W1;
                k27 k27Var2 = (k27) mediaController.d0.remove(str13);
                if (k27Var2 != null) {
                    int i15 = k27Var2.K1;
                    if (bArr != null && k27Var2.F0() != null) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < k27Var2.F0().attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = k27Var2.F0().attributes.get(i16);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                    documentAttribute.waveform = bArr;
                                    documentAttribute.flags |= 4;
                                } else {
                                    i16++;
                                }
                            }
                        }
                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                        tL_messages_messages.messages.add(k27Var2.k);
                        ad7.Y(i15).e1(-1, 0, k27Var.r1 ? 1 : 0, k27.B0(k27Var2.k), 0L, tL_messages_messages, false);
                        kk7.f(i15).k(49, Long.valueOf(k27.B0(k27Var2.k)), tb4.t(k27Var2));
                        break;
                    }
                }
                break;
            case 25:
                hq6 hq6Var = (hq6) this.b;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.c;
                TLObject tLObject10 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                ArrayList arrayList18 = hq6Var.H1;
                if (tL_error12 == null && (tLObject10 instanceof TLRPC.TL_messages_reactions)) {
                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject10;
                    arrayList18.clear();
                    arrayList18.addAll(tL_messages_reactions.reactions);
                    hq6.V1(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                    hq6Var.getNotificationCenter().k(kk7.i3, 0L);
                }
                hq6Var.K1 = false;
                break;
            case 26:
                ((hq6) this.b).c1(5, true, false, false, new ht((boolean[]) this.c, (ArrayList[]) this.d, (zo6) this.e, (byte) 27));
                break;
            case 27:
                hq6 hq6Var2 = (hq6) this.b;
                String[] strArr2 = (String[]) this.c;
                eq6 eq6Var = (eq6) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                for (String str14 : strArr2) {
                    if (hq6Var2.C1.get(str14) != null) {
                        break;
                    }
                }
                eq6Var.f(null, arrayList19);
                break;
            case 28:
                a();
                break;
            default:
                tv6 tv6Var = (tv6) this.b;
                ea9 ea9Var = (ea9) this.c;
                try {
                    ea9Var.m(tv6Var.b((su6) this.d, (im6) this.e));
                    break;
                } catch (RuntimeException e5) {
                    ea9Var.l(e5);
                }
        }
    }
}
