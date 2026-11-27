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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g65 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g65(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
        xz9 xz9Var = (xz9) this.e;
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
        xz9Var.a(arrayList3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x08a1, code lost:
    
        if (lbc.z(r11) != false) goto L243;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int b;
        zh6 zh6Var;
        ArrayList arrayList;
        boolean z;
        zh6 zh6Var2;
        String a0;
        int i;
        int i2;
        int i3;
        byte b2 = 10;
        byte b3 = 6;
        byte b4 = 2;
        boolean z2 = true;
        z2 = true;
        ?? r14 = 0;
        switch (this.a) {
            case 0:
                j95 j95Var = (j95) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) this.e;
                k5 k5Var = j95Var.n1;
                vc2 vc2Var = new vc2();
                j95Var.T2 = vc2Var;
                vc2Var.b = new TLRPC.TL_groupCall();
                vc2 vc2Var2 = j95Var.T2;
                TLRPC.GroupCall groupCall = vc2Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                vc2Var2.c = chat != null ? chat.id : 0L;
                groupCall.schedule_date = j95Var.c4;
                groupCall.flags |= 128;
                vc2Var2.C = k5Var;
                vc2Var2.y(inputPeer);
                vc2 vc2Var3 = j95Var.T2;
                TLRPC.GroupCall groupCall2 = vc2Var3.b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                vc2Var3.f();
                p95 p95Var = j95Var.h4;
                vc2 vc2Var4 = j95Var.T2;
                p95Var.c = vc2Var4;
                j95Var.T3.setGroupCall(vc2Var4);
                sb5 sb5Var = j95Var.g4;
                vc2 vc2Var5 = j95Var.T2;
                sb5Var.c = vc2Var5;
                j95Var.V1.F0(k5Var.a, vc2Var5.h(false));
                uc7 s1 = uc7.s1(k5Var.a);
                vc2 vc2Var6 = j95Var.T2;
                s1.h4(vc2Var6.c, vc2Var6);
                break;
            case 1:
                j95 j95Var2 = (j95) this.b;
                HashSet hashSet = (HashSet) this.c;
                vc2 vc2Var7 = (vc2) this.d;
                String str = (String) this.e;
                j95Var2.getClass();
                TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    long longValue = l.longValue();
                    if (vc2Var7 != null) {
                        vc2Var7.u(longValue);
                    }
                    arrayList2.add(uc7.s1(j95Var2.a).X1(l));
                    ArrayList<TLRPC.InputUser> arrayList5 = getrequirementstocontact.id;
                    uc7 s12 = uc7.s1(j95Var2.a);
                    arrayList5.add(s12.q1(s12.X1(l)));
                }
                tw4 tw4Var = new tw4((Object) j95Var2, (Object) arrayList2, (Object) arrayList3, (Object) arrayList4, (Object) str, (byte) 6);
                if (yac.h(j95Var2.a).p()) {
                    tw4Var.run();
                    break;
                } else {
                    ConnectionsManager.getInstance(j95Var2.a).sendRequest(getrequirementstocontact, new m65(arrayList2, arrayList3, tw4Var, (byte) 0));
                    break;
                }
            case 2:
                TLObject tLObject = (TLObject) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                tw4 tw4Var2 = (tw4) this.e;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    for (int i4 = 0; i4 < Math.min(arrayList6.size(), vector.objects.size()); i4++) {
                        if (vector.objects.get(i4) instanceof TL_account.requirementToContactPremium) {
                            arrayList7.add(Long.valueOf(((TLRPC.User) arrayList6.get(i4)).id));
                        }
                    }
                }
                tw4Var2.run();
                break;
            case 3:
                v85 v85Var = (v85) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str2 = (String) this.e;
                j95 j95Var3 = v85Var.f;
                k5 k5Var2 = j95Var3.n1;
                i75 i75Var = j95Var3.l1;
                jn5 jn5Var = v85Var.d;
                if (jn5Var != null) {
                    i75Var.L0 = jn5Var;
                    i75Var.r1 = null;
                    i75Var.s1 = null;
                    v85Var.d = null;
                }
                if (tL_error == null) {
                    uc7 s13 = uc7.s1(k5Var2.a);
                    int i5 = k5Var2.a;
                    int i6 = k5Var2.a;
                    TLRPC.User X1 = s13.X1(Long.valueOf(yac.h(i5).e()));
                    if (X1 == null) {
                        X1 = yac.h(i6).f();
                        if (X1 != null) {
                            uc7.s1(i6).i4(X1, false, false);
                        }
                    } else {
                        yac.h(i6).v(X1);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w = xb4.w(arrayList8, jn7.f2, false, null, false);
                    TLRPC.PhotoSize w2 = xb4.w(arrayList8, 800, false, null, false);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    X1.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w != null) {
                        tL_userProfilePhoto.photo_small = w.location;
                    }
                    if (w2 != null) {
                        tL_userProfilePhoto.photo_big = w2.location;
                    }
                    if (w != null && v85Var.c != null) {
                        xb4.G(j95Var3.a);
                        File J = xb4.J(w, null, true, true);
                        xb4.G(j95Var3.a);
                        xb4.J(v85Var.c, null, true, true).renameTo(J);
                        StringBuilder sb = new StringBuilder();
                        sb.append(v85Var.c.volume_id);
                        sb.append("_");
                        String l2 = uh9.l(sb, v85Var.c.local_id, "@50_50");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w.location.volume_id);
                        sb2.append("_");
                        z2 = true;
                        in5.z().O(l2, uh9.l(sb2, w.location.local_id, "@50_50"), jn5.l(j95Var3.a, 1, X1));
                    }
                    if (w2 != null && v85Var.b != null) {
                        xb4.G(j95Var3.a);
                        File J2 = xb4.J(w2, null, z2, z2);
                        xb4.G(j95Var3.a);
                        xb4.J(v85Var.b, null, z2, z2).renameTo(J2);
                    }
                    if (videoSize != null && str2 != null) {
                        xb4.G(j95Var3.a);
                        new File(str2).renameTo(xb4.J(videoSize, "mp4", z2, z2));
                    }
                    uc7.s1(i6).U0(X1.id).f();
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(X1);
                    kf7.a0(i6).n1(arrayList9, null, false, true);
                    TLRPC.User X12 = uc7.s1(i6).X1(Long.valueOf(v85Var.e));
                    jn5 l3 = jn5.l(i6, 0, X12);
                    jn5 l4 = jn5.l(i6, 1, X12);
                    if (jn5.e(v85Var.b) == null) {
                        l4 = jn5.e(v85Var.c);
                    }
                    i75Var.setCreateThumbFromParent(false);
                    i75Var.H(null, l3, l4, true);
                    v85Var.c = null;
                    v85Var.b = null;
                    hl.V3(j95Var3.J1);
                    v85Var.a(1.0f);
                }
                jn7 f = jn7.f(k5Var2.a);
                int i7 = uc7.s5;
                f.k(2, Integer.valueOf(uc7.s5));
                jn7.f(k5Var2.a).k(47, new Object[0]);
                yac.h(k5Var2.a).u(true);
                break;
            case 4:
                ((xc5) this.b).c0((ArrayList) this.c, (ArrayList) this.d, (CountDownLatch) this.e);
                break;
            case 5:
                md5 md5Var = (md5) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                String str3 = (String) this.e;
                md5Var.d = arrayList10;
                md5Var.e = arrayList11;
                md5Var.f();
                nd5 nd5Var = md5Var.r;
                nd5Var.b.d.setVisibility(8);
                nd5Var.b.e.setText(ob6.a0(null, null, 2131752082, str3));
                nd5Var.b.e(false, true);
                break;
            case 6:
                sd5 sd5Var = (sd5) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.e;
                z2b z2bVar = sd5Var.t1;
                zh6 zh6Var3 = sd5Var.U1;
                zh6 zh6Var4 = sd5Var.V1;
                ArrayList arrayList12 = sd5Var.R1;
                if (tL_error2 == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                    uc7.s1(sd5Var.a).j4(tL_channels_channelParticipants.users, false);
                    uc7.s1(sd5Var.a).c4(tL_channels_channelParticipants.chats, false);
                    long e = yac.h(sd5Var.a).e();
                    int i8 = 0;
                    while (true) {
                        if (i8 < tL_channels_channelParticipants.participants.size()) {
                            if (r47.B1(tL_channels_channelParticipants.participants.get(i8).peer) == e) {
                                tL_channels_channelParticipants.participants.remove(i8);
                            } else {
                                i8++;
                            }
                        }
                    }
                    sd5Var.O1--;
                    if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                        arrayList = sd5Var.S1;
                        zh6Var = zh6Var4;
                    } else {
                        zh6Var = zh6Var3;
                        arrayList = arrayList12;
                    }
                    arrayList.clear();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i9);
                        zh6Var.k(r47.B1(channelParticipant.peer), channelParticipant);
                    }
                    int size2 = arrayList12.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        long B1 = r47.B1(((TLRPC.ChannelParticipant) arrayList12.get(i10)).peer);
                        boolean z3 = zh6Var4.f(B1) != null || ((zh6Var2 = sd5Var.Y1) != null && zh6Var2.h(B1) >= 0);
                        TLRPC.User X13 = uc7.s1(sd5Var.a).X1(Long.valueOf(B1));
                        if (X13 == null || !X13.bot) {
                            z = z3;
                            break;
                        }
                        z = true;
                        if (z) {
                            arrayList12.remove(i10);
                            zh6Var3.l(B1);
                            i10--;
                            size2--;
                        }
                        i10++;
                    }
                    try {
                        if (sd5Var.Q1.participants_count <= 200) {
                            Collections.sort(arrayList, new hf2(sd5Var, ConnectionsManager.getInstance(sd5Var.a).getCurrentTime(), true ? (byte) 1 : (byte) 0));
                        }
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                }
                if (sd5Var.O1 <= 0) {
                    sd5Var.W1 = false;
                    sd5Var.X1 = true;
                    if (sd5Var.k2 == 1) {
                        b = 1;
                    } else {
                        c79 c79Var = sd5Var.p1;
                        b = c79Var != null ? c79Var.b() - 1 : 0;
                    }
                    sd5Var.K0(b);
                    if (arrayList12.isEmpty()) {
                        sd5Var.b2 = true;
                        sd5Var.N0();
                    }
                }
                sd5Var.P0();
                c79 c79Var2 = sd5Var.p1;
                if (c79Var2 != null) {
                    c79Var2.f();
                    if (z2bVar != null && sd5Var.p1.b() == 0 && sd5Var.X1) {
                        z2bVar.e(false, true);
                        break;
                    }
                }
                break;
            case 7:
                ((in5) this.b).O((String) this.c, (String) this.d, (jn5) this.e);
                break;
            case 8:
                jw5 jw5Var = (jw5) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                e eVar = jw5Var.n1;
                if (eVar != null && eVar.getParentActivity() != null) {
                    if (tL_error3 != null) {
                        "USER_ALREADY_PARTICIPANT".equals(tL_error3.text);
                        jj.c0(jw5Var.a, tL_error3, eVar, tL_messages_importChatInvite, new Object[0]);
                        break;
                    } else if (updates != null && !updates.chats.isEmpty()) {
                        TLRPC.Chat chat2 = updates.chats.get(0);
                        chat2.left = false;
                        chat2.kicked = false;
                        uc7.s1(jw5Var.a).j4(updates.users, false);
                        uc7.s1(jw5Var.a).c4(updates.chats, false);
                        long j = chat2.id;
                        boolean z4 = !xc2.V(chat2);
                        Bundle k = qu6.k(j, "chat_id");
                        uc7 s14 = uc7.s1(jw5Var.a);
                        e eVar2 = jw5Var.n1;
                        if (s14.C(k, eVar2, null, null)) {
                            eVar2.presentFragment(new iw5(jw5Var, k, z4, j), eVar2 instanceof zu1);
                            break;
                        }
                    }
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                tg5 tg5Var = (tg5) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                String str4 = LaunchActivity.C1;
                try {
                    tg5Var.run();
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern = jj.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    if (ob6.D0().B.c.equals(tL_langPackLanguage.lang_code)) {
                        alertDialog$Builder.a.S = ob6.M0(2131748808, null);
                        a0 = ob6.a0("LanguageSame", null, 2131748801, tL_langPackLanguage.name);
                        alertDialog$Builder.g(ob6.M0(2131747558, null), null);
                        alertDialog$Builder.h(ob6.M0(2131745711, null), new pd(launchActivity, true ? (byte) 1 : (byte) 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        alertDialog$Builder.a.S = ob6.M0(2131748798, null);
                        a0 = ob6.a0("LanguageUnknownCustomAlert", null, 2131748799, tL_langPackLanguage.name);
                        alertDialog$Builder.g(ob6.M0(2131747558, null), null);
                    } else {
                        alertDialog$Builder.a.S = ob6.M0(2131748800, null);
                        boolean z5 = tL_langPackLanguage.official;
                        String str6 = tL_langPackLanguage.name;
                        int i11 = tL_langPackLanguage.translated_count;
                        int i12 = tL_langPackLanguage.strings_count;
                        a0 = z5 ? ob6.a0("LanguageAlert", null, 2131748807, str6, Integer.valueOf((int) Math.ceil((i11 / i12) * 100.0f))) : ob6.a0("LanguageCustomAlert", null, 2131748804, str6, Integer.valueOf((int) Math.ceil((i11 / i12) * 100.0f)));
                        alertDialog$Builder.j(ob6.M0(2131752533, null), new o(tL_langPackLanguage, launchActivity, b4));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hl.S2(a0));
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
                        spannableStringBuilder.setSpan(new yh(tL_langPackLanguage.translations_url, alertDialog$Builder), indexOf, i - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    yob.G(textView, aob.k5, null);
                    yob.C(textView, aob.l5, null);
                    textView.setPadding(hl.L(23.0f), 0, hl.L(23.0f), 0);
                    textView.setMovementMethod(new dl((byte) 0));
                    yob.X(textView, aob.j5, null);
                    alertDialog$Builder.n(textView);
                    launchActivity.F0(alertDialog$Builder);
                    break;
                } else if (tL_error4 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error4.text)) {
                        launchActivity.F0(jj.K(launchActivity, null, ob6.M0(2131748797, null)));
                        break;
                    } else {
                        launchActivity.F0(jj.K(launchActivity, null, ob6.M0(2131751070, null) + "\n" + tL_error4.text));
                        break;
                    }
                }
                break;
            case 10:
                id idVar = (id) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                v8 v8Var = (v8) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                String str7 = LaunchActivity.C1;
                try {
                    idVar.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    hl.c3(new tg5(v8Var, tL_error5, (byte) 19));
                    break;
                }
                break;
            case 11:
                i56 i56Var = (i56) this.b;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                i56Var.E = false;
                i56Var.M = tL_chatInviteExported.link;
                if (tL_error6 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject6;
                    ArrayList<TLRPC.User> arrayList13 = tL_chatInviteExported.importers;
                    if (arrayList13 == null) {
                        arrayList13 = new ArrayList<>(3);
                        tL_chatInviteExported.importers = arrayList13;
                    }
                    arrayList13.clear();
                    while (r14 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        r14++;
                    }
                    i56Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 12:
                e66 e66Var = (e66) this.b;
                e eVar3 = (e) this.c;
                TLRPC.User[] userArr = (TLRPC.User[]) this.d;
                t03.e(eVar3.getContext(), e66Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) this.e, true, new v35(e66Var, userArr, b3), eVar3.getResourceProvider(), e66.d());
                break;
            case 13:
                ((b66) this.b).z0((TLObject) this.c, (HashSet) this.d, (TLRPC.TL_error) this.e);
                break;
            case 14:
                id6 id6Var = (id6) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                id6Var.getMessagesController().j4(arrayList14, true);
                id6Var.getMessagesController().c4(arrayList15, true);
                Utilities.d.c(new ed6(id6Var, arrayList16, r14));
                break;
            case 15:
                lu7 lu7Var = (lu7) this.b;
                View view = (View) this.c;
                EditText editText = (EditText) this.d;
                ry ryVar = (ry) this.e;
                lu7Var.a(0.0f);
                view.setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new z56(editText, ryVar, (byte) 11));
                    break;
                }
                break;
            case 16:
                if6 if6Var = (if6) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) this.e;
                byte[] g1 = str8 != null ? hl.g1(str8) : null;
                hf6 hf6Var = new hf6(if6Var, str8, str9, r14);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = if6Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str8 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = es9.b(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error7 = new TLRPC.TL_error();
                            tL_error7.text = "ALGO_INVALID";
                            hf6Var.run(null, tL_error7);
                        }
                    }
                    i2 = ((e) if6Var.H).currentAccount;
                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_recoverPassword, hf6Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error8 = new TLRPC.TL_error();
                    tL_error8.text = "PASSWORD_HASH_INVALID";
                    hf6Var.run(null, tL_error8);
                    break;
                }
            case 17:
                vf6 vf6Var = (vf6) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str10 = (String) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.e;
                qh6 qh6Var = vf6Var.E;
                qh6Var.y1(false, true);
                vf6Var.n = false;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str10);
                    bundle.putString("password", vf6Var.h);
                    qh6Var.J1(9, true, bundle, false);
                    break;
                } else if (tL_error9 != null && !tL_error9.text.startsWith("CODE_INVALID")) {
                    if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error9.text).intValue();
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    } else {
                        qh6Var.z1(ob6.M0(2131745798, null), tL_error9.text);
                        break;
                    }
                } else {
                    vf6Var.n(true);
                    break;
                }
            case 18:
                tg6 tg6Var = (tg6) this.b;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.c;
                Bundle bundle2 = (Bundle) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                qh6 qh6Var2 = tg6Var.v0;
                tg6Var.g0 = false;
                if (tL_error10 == null) {
                    tg6Var.r0 = bundle2;
                    if (tLObject8 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject8;
                        tg6Var.s0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            tg6Var.j0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            tg6Var.j0 = 16;
                        }
                        qh6Var2.q1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject8 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject8;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        qh6Var2.J1(18, true, bundle2, true);
                    }
                } else {
                    String str11 = tL_error10.text;
                    if (str11 != null) {
                        if (str11.contains("PHONE_NUMBER_INVALID")) {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, null));
                        } else if (tL_error10.text.contains("PHONE_CODE_EMPTY") || tL_error10.text.contains("PHONE_CODE_INVALID")) {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131748937, null));
                        } else if (tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                            tg6Var.c(true);
                            qh6Var2.J1(0, true, null, true);
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, null));
                        } else if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, null));
                        } else if (tL_error10.code != -1000) {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751070, null) + "\n" + tL_error10.text);
                        }
                    }
                }
                tg6Var.y(false);
                break;
            case 19:
                ((zg6) this.b).n((String) this.c, (String) this.d, (String) this.e);
                break;
            case 20:
                zg6 zg6Var = (zg6) this.b;
                wo8 wo8Var = (wo8) this.c;
                zj3 zj3Var = (zj3) this.d;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.e;
                qh6 qh6Var3 = zg6Var.w;
                qh6Var3.e = true;
                di0.h().c(wo8Var.c, new hw(zj3Var, b2));
                di0.h().h = new xg6(zj3Var, r14);
                di0 h = di0.h();
                Activity parentActivity = qh6Var3.getParentActivity();
                i3 = ((e) qh6Var3).currentAccount;
                k5 a = k5.a(i3);
                qx6 qx6Var = new qx6((byte) 7, (boolean) r14);
                qx6Var.O(wo8Var);
                h.k(parentActivity, a, tL_inputStorePaymentAuthCode, Collections.singletonList(qx6Var.g()));
                break;
            case 21:
                ph6 ph6Var = (ph6) this.b;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                String str12 = (String) this.e;
                ph6Var.N = false;
                qh6 qh6Var4 = ph6Var.h0;
                qh6Var4.K1(false, true);
                if (tL_error11 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject9;
                    if (TwoStepVerificationActivity.a0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str12);
                        qh6Var4.J1(6, true, bundle3, false);
                        break;
                    } else {
                        jj.u0(qh6Var4.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                        break;
                    }
                } else {
                    qh6Var4.z1(ob6.M0(2131745798, null), tL_error11.text);
                    break;
                }
            case 22:
                em6 em6Var = (em6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ArrayList arrayList17 = (ArrayList) this.d;
                boolean[] zArr2 = (boolean[]) this.e;
                zArr[0] = true;
                hl.r(em6Var.R);
                for (int i14 = 0; i14 < arrayList17.size(); i14++) {
                    ((TL_stories.StoryItem) arrayList17.get(i14)).pinned = zArr2[i14];
                }
                em6Var.getMessagesController().O1().q0(em6Var.e, arrayList17, false);
                break;
            case 23:
                try {
                    hl.c3(new g65((MediaController) this.b, (String) this.d, MediaController.getWaveform((String) this.c), (r47) this.e, (byte) 24));
                    break;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
            case 24:
                MediaController mediaController = (MediaController) this.b;
                String str13 = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                r47 r47Var = (r47) this.e;
                String[] strArr = MediaController.W1;
                r47 r47Var2 = (r47) mediaController.d0.remove(str13);
                if (r47Var2 != null) {
                    int i15 = r47Var2.K1;
                    if (bArr != null && r47Var2.F0() != null) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < r47Var2.F0().attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = r47Var2.F0().attributes.get(i16);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                    documentAttribute.waveform = bArr;
                                    documentAttribute.flags |= 4;
                                } else {
                                    i16++;
                                }
                            }
                        }
                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                        tL_messages_messages.messages.add(r47Var2.k);
                        kf7.a0(i15).i1(-1, 0, r47Var.r1 ? 1 : 0, r47.B0(r47Var2.k), 0L, tL_messages_messages, false);
                        jn7.f(i15).k(50, Long.valueOf(r47.B0(r47Var2.k)), qd4.t(r47Var2));
                        break;
                    }
                }
                break;
            case 25:
                ls6 ls6Var = (ls6) this.b;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.c;
                TLObject tLObject10 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                ArrayList arrayList18 = ls6Var.H1;
                if (tL_error12 == null && (tLObject10 instanceof TLRPC.TL_messages_reactions)) {
                    TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject10;
                    arrayList18.clear();
                    arrayList18.addAll(tL_messages_reactions.reactions);
                    ls6.V1(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                    ls6Var.getNotificationCenter().k(jn7.j3, 0L);
                }
                ls6Var.K1 = false;
                break;
            case 26:
                ((ls6) this.b).c1(5, true, false, false, new gt((boolean[]) this.c, (ArrayList[]) this.d, (fr6) this.e, (byte) 26));
                break;
            case 27:
                ls6 ls6Var2 = (ls6) this.b;
                String[] strArr2 = (String[]) this.c;
                is6 is6Var = (is6) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                for (String str14 : strArr2) {
                    if (ls6Var2.C1.get(str14) != null) {
                        break;
                    }
                }
                is6Var.b(null, arrayList19);
                break;
            case 28:
                a();
                break;
            default:
                yx6 yx6Var = (yx6) this.b;
                sd9 sd9Var = (sd9) this.c;
                try {
                    sd9Var.m(yx6Var.b((xw6) this.d, (bm6) this.e));
                    break;
                } catch (RuntimeException e5) {
                    sd9Var.l(e5);
                }
        }
    }
}
