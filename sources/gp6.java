// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gp6(int i, ArrayList arrayList, HashMap hashMap, pcc pccVar) {
        this.a = (byte) 7;
        this.b = i;
        this.c = arrayList;
        this.d = hashMap;
        this.e = pccVar;
    }

    private final void a() {
        qn4 qn4Var;
        e eVar = (e) this.c;
        TLObject tLObject = (TLObject) this.e;
        pcc pccVar = (pcc) this.d;
        if (eVar.getParentActivity() == null) {
            return;
        }
        boolean z = tLObject instanceof Vector;
        int i = this.b;
        if (z) {
            Vector vector = (Vector) tLObject;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < vector.objects.size(); i2++) {
                try {
                    arrayList.add(Long.valueOf(wf3.n((TLRPC.Peer) vector.objects.get(i2))));
                } catch (Exception unused) {
                }
            }
            qn4Var = new qn4(eVar, i, arrayList);
        } else {
            qn4Var = new qn4(eVar, i, null);
        }
        qn4Var.w2 = pccVar;
        eVar.showDialog(qn4Var);
    }

    private final void b() {
        t35 t35Var = (t35) this.c;
        ryc rycVar = (ryc) this.d;
        String str = (String) this.e;
        int i = this.b;
        if (t35Var.c(rycVar, i)) {
            t35Var.f(str);
            return;
        }
        t35Var.d("ignoring stale socket callback; attempt=" + i + ", " + str);
    }

    private final void c() {
        JSONArray optJSONArray;
        s35 s35Var = (s35) this.c;
        ryc rycVar = (ryc) this.d;
        JSONObject jSONObject = (JSONObject) this.e;
        t35 t35Var = s35Var.c;
        if (t35Var.c(rycVar, this.b)) {
            c cVar = t35Var.c;
            String str = t35Var.b;
            zz3 zz3Var = t35Var.p;
            String optString = jSONObject.optString("status");
            if ((jSONObject.has("error") && !jSONObject.isNull("error")) || "error".equals(optString)) {
                StringBuilder sb = new StringBuilder("subscription error; id=");
                sb.append(jSONObject.optString("id"));
                sb.append(", code=");
                sb.append(jSONObject.optString("code"));
                ik8.z(", status=", optString, ", error=", sb);
                sb.append(jSONObject.opt("error"));
                sb.append(", message=");
                sb.append(jSONObject.optString("message"));
                t35Var.d(sb.toString());
                t35Var.f("subscription rejected");
                return;
            }
            if ("subscribed".equals(optString)) {
                t35Var.d("subscription acknowledgement: " + jSONObject);
                if (TextUtils.equals(t35Var.f, jSONObject.optString("id"))) {
                    t35Var.e = true;
                    t35Var.j = 0;
                    t35Var.l = SystemClock.elapsedRealtime();
                    hl.r(t35Var.o);
                    hl.r(zz3Var);
                    hl.d3(zz3Var, 15000L);
                    t35Var.d("subscription acknowledged; requested transactions and account state");
                    return;
                }
                return;
            }
            if ("pong".equals(optString) && "heartbeat".equals(jSONObject.optString("id"))) {
                t35Var.d("received pong");
                t35Var.l = SystemClock.elapsedRealtime();
                return;
            }
            if (!t35Var.e) {
                t35Var.d("ignoring message before subscription; type=" + jSONObject.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                return;
            }
            String optString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
            if (!"account_state_change".equals(optString2) || c.b(str, jSONObject.optString("account"))) {
                if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                    t35Var.d("ignoring message; type=" + optString2 + ", status=" + optString);
                    return;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("transactions");
                JSONObject optJSONObject = jSONObject.optJSONObject("state");
                StringBuilder p = ik8.p("event type=", optString2, ", finality=");
                p.append(jSONObject.optString("finality"));
                p.append(", trace=");
                p.append(jSONObject.optString("trace_external_hash_norm"));
                p.append(optJSONArray2 == null ? "" : ", transactions=" + optJSONArray2.length());
                p.append(optJSONObject != null ? ", balance=" + optJSONObject.optString("balance") : "");
                t35Var.d(p.toString());
                if (!"transactions".equals(optString2)) {
                    cVar.U(jSONObject);
                    return;
                }
                if (str == null || (optJSONArray = jSONObject.optJSONArray("transactions")) == null) {
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null && c.b(str, optJSONObject2.optString("account"))) {
                        jSONArray.put(optJSONObject2);
                    }
                }
                if (jSONArray.length() != 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                        jSONObject2.put("transactions", jSONArray);
                        cVar.U(jSONObject2);
                    } catch (JSONException unused) {
                        t35Var.d("could not filter streaming transactions");
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d() {
        long B1;
        rd5 rd5Var = (rd5) this.c;
        String str = (String) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        rd5Var.getClass();
        String lowerCase = str.trim().toLowerCase();
        int length = lowerCase.length();
        int i = this.b;
        byte b = 1;
        if (length == 0) {
            hl.c3(new l65(rd5Var, i, new ArrayList(), b));
            return;
        }
        boolean z = 0;
        String S0 = ob6.D0().S0(lowerCase, true, false);
        if (lowerCase.equals(S0) || S0.length() == 0) {
            S0 = null;
        }
        int i2 = (S0 != null ? 1 : 0) + 1;
        String[] strArr = new String[i2];
        strArr[0] = lowerCase;
        if (S0 != null) {
            strArr[1] = S0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLObject tLObject = (TLObject) arrayList.get(i3);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                B1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                B1 = r47.B1(((TLRPC.ChannelParticipant) tLObject).peer);
            } else {
                i3++;
                z = 0;
            }
            TLRPC.User X1 = uc7.s1(rd5Var.x.a).X1(Long.valueOf(B1));
            if (!lbc.D(X1)) {
                String lowerCase2 = lbc.r(X1).toLowerCase();
                String S02 = ob6.D0().S0(lowerCase2, true, z);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                int i4 = z;
                int i5 = i4;
                while (true) {
                    if (i4 < i2) {
                        String str2 = strArr[i4];
                        if (lowerCase2.startsWith(str2) || uh9.t(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || uh9.t(" ", str2, S02)))) {
                            i5 = 1;
                        } else {
                            String p = lbc.p(X1);
                            if (p != null && p.startsWith(str2)) {
                                i5 = 2;
                            }
                        }
                        if (i5 != 0) {
                            arrayList2.add(tLObject);
                            break;
                        }
                        i4++;
                    }
                }
            }
            i3++;
            z = 0;
        }
        hl.c3(new l65(rd5Var, i, arrayList2, b));
    }

    private final void e() {
        ef5 ef5Var = (ef5) this.c;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        int i = ef5Var.Q;
        ArrayList arrayList = ef5Var.R;
        if (this.b == ef5Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            ef5Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    ef5Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    ef5Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                ef5Var.c0 = messages_messages.next_rate;
                uc7.s1(i).j4(messages_messages.users, false);
                uc7.s1(i).c4(messages_messages.chats, false);
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    r47 r47Var = new r47(i, messages_messages.messages.get(i2), false, true);
                    r47Var.J5(str, true);
                    arrayList.add(r47Var);
                }
                ef5Var.Y = arrayList.size() >= ef5Var.Z;
                ef5Var.X();
            } else {
                ef5Var.Y = true;
                ef5Var.Z = arrayList.size();
            }
            ef5Var.O(true);
            if (isEmpty) {
                ((ex9) ef5Var).f0.w0.g1(0, 0);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:440:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:467:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x09ef  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v23, types: [int, short] */
    /* JADX WARN: Type inference failed for: r13v26, types: [int, short] */
    /* JADX WARN: Type inference failed for: r13v29, types: [int, short] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        String str;
        int i;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TL_bots.BotInfo botInfo;
        int i2;
        int i3;
        TLRPC.Dialog dialog;
        e eVar;
        int[] iArr;
        nr1 nr1Var;
        TLRPC.Document document;
        byte b = 5;
        int i4 = 2;
        TLRPC.UserFull userFull = null;
        r10 = null;
        TLRPC.EncryptedChat encryptedChat = null;
        byte b2 = 1;
        ?? r12 = 0;
        switch (this.a) {
            case 0:
                ls6 ls6Var = (ls6) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i5 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject;
                    ls6Var.c0[i5] = tL_messages_archivedStickers.count;
                    uc7.s1(ls6Var.currentAccount).W3.edit().putInt(uh9.k(i5, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
                    ls6Var.getNotificationCenter().k(89, Integer.valueOf(i5));
                    return;
                }
                return;
            case 1:
                uc7 uc7Var = (uc7) this.c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i6 = this.b;
                LongSparseIntArray longSparseIntArray = uc7Var.x0;
                uc7Var.F4(userFull2.user.id, userFull2.settings);
                long j = user.id;
                TLRPC.PeerNotifySettings peerNotifySettings = userFull2.notify_settings;
                wp7 wp7Var = uc7Var.getNotificationsController().h0;
                wp7Var.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new o30((Object) wp7Var, j, 0L, (Object) peerNotifySettings, (byte) 12));
                }
                TL_bots.BotInfo botInfo2 = userFull2.bot_info;
                if (botInfo2 instanceof TL_bots.TL_botInfo) {
                    botInfo2.user_id = user.id;
                    uc7Var.getMediaDataController().G1(user.id, userFull2.bot_info);
                }
                int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                if (userFull2.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(user.id, 1);
                        uc7Var.getNotificationCenter().k(44, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    uc7Var.getNotificationCenter().k(44, new Object[0]);
                }
                uc7Var.b1.k(user.id, userFull2);
                long j2 = user.id;
                zh6 zh6Var = uc7Var.S4;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) zh6Var.f(j2);
                if (requirementToContact != null) {
                    TL_account.RequirementToContact q = lbc.q(userFull2);
                    if (!lbc.d(requirementToContact, q)) {
                        if (q == null) {
                            zh6Var.l(j2);
                        } else {
                            zh6Var.k(j2, q);
                        }
                        z = true;
                        uc7Var.i4.M(user.id);
                        jxa.v(uc7Var.currentAccount, false).N(userFull2);
                        uc7Var.h1.remove(Long.valueOf(user.id));
                        uc7Var.i1.put(user.id, System.currentTimeMillis());
                        str = user.first_name + user.last_name + lbc.p(user);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(userFull2.user);
                        uc7Var.j4(arrayList, false);
                        uc7Var.getMessagesStorage().j1(arrayList, null, false, true);
                        if (str.equals(userFull2.user.first_name + userFull2.user.last_name + lbc.p(userFull2.user))) {
                            i = 2;
                            uc7Var.getNotificationCenter().k(2, 1);
                        } else {
                            i = 2;
                        }
                        userProfilePhoto = userFull2.user.photo;
                        if (userProfilePhoto != null && userProfilePhoto.has_video) {
                            uc7Var.getNotificationCenter().k(i, Integer.valueOf(i));
                        }
                        botInfo = userFull2.bot_info;
                        if (botInfo instanceof TL_bots.TL_botInfo) {
                            i2 = 2;
                            i3 = 0;
                        } else {
                            botInfo.user_id = userFull2.id;
                            i3 = 0;
                            i2 = 2;
                            uc7Var.getNotificationCenter().k(67, userFull2.bot_info, Integer.valueOf(i6), Long.valueOf(user.id));
                        }
                        jn7 notificationCenter = uc7Var.getNotificationCenter();
                        Object[] objArr = new Object[i2];
                        objArr[i3] = Long.valueOf(user.id);
                        objArr[1] = userFull2;
                        notificationCenter.k(68, objArr);
                        if (z) {
                            uc7Var.getNotificationCenter().k(jn7.k3, new Object[i3]);
                        }
                        dialog = (TLRPC.Dialog) uc7Var.R.f(user.id);
                        if (dialog == null) {
                            if ((userFull2.flags & 2048) != 0) {
                                int i7 = dialog.folder_id;
                                int i8 = userFull2.folder_id;
                                if (i7 != i8) {
                                    dialog.folder_id = i8;
                                    uc7Var.h5(null);
                                    uc7Var.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            if ((userFull2.flags & TLObject.FLAG_14) != 0) {
                                int i9 = dialog.ttl_period;
                                int i10 = userFull2.ttl_period;
                                if (i9 != i10) {
                                    dialog.ttl_period = i10;
                                    uc7Var.getNotificationCenter().k(3, new Object[0]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z = false;
                uc7Var.i4.M(user.id);
                jxa.v(uc7Var.currentAccount, false).N(userFull2);
                uc7Var.h1.remove(Long.valueOf(user.id));
                uc7Var.i1.put(user.id, System.currentTimeMillis());
                str = user.first_name + user.last_name + lbc.p(user);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(userFull2.user);
                uc7Var.j4(arrayList2, false);
                uc7Var.getMessagesStorage().j1(arrayList2, null, false, true);
                if (str.equals(userFull2.user.first_name + userFull2.user.last_name + lbc.p(userFull2.user))) {
                }
                userProfilePhoto = userFull2.user.photo;
                if (userProfilePhoto != null) {
                    uc7Var.getNotificationCenter().k(i, Integer.valueOf(i));
                }
                botInfo = userFull2.bot_info;
                if (botInfo instanceof TL_bots.TL_botInfo) {
                }
                jn7 notificationCenter2 = uc7Var.getNotificationCenter();
                Object[] objArr2 = new Object[i2];
                objArr2[i3] = Long.valueOf(user.id);
                objArr2[1] = userFull2;
                notificationCenter2.k(68, objArr2);
                if (z) {
                }
                dialog = (TLRPC.Dialog) uc7Var.R.f(user.id);
                if (dialog == null) {
                }
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                int i11 = this.b;
                vk5 vk5Var = (vk5) this.d;
                Runnable runnable = (Runnable) this.e;
                Drawable drawable = ActionBarLayout.w1;
                uk5 uk5Var = actionBarLayout.e0;
                boolean z2 = false;
                int i12 = 0;
                while (i12 < i11) {
                    if (i12 == 0) {
                        eVar = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.b0) && actionBarLayout.V0.size() > 1) {
                            eVar = (e) bp1.m(i4, actionBarLayout.V0);
                        }
                        i12++;
                        i4 = 2;
                        r12 = 0;
                        z2 = z2;
                    }
                    if (eVar != null) {
                        if (vk5Var.m != null) {
                            if (actionBarLayout.f0 == null) {
                                t37 t37Var = new t37(r12, true, r12, uk5Var);
                                actionBarLayout.f0 = t37Var;
                                t37Var.L = true;
                                t37 t37Var2 = new t37(1, true, r12, uk5Var);
                                actionBarLayout.g0 = t37Var2;
                                t37Var2.L = true;
                            }
                            xu1 xu1Var = vk5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) uk5Var.b;
                            sparseIntArray.clear();
                            int[] iArr2 = (int[]) uk5Var.c;
                            int length = iArr2.length;
                            for (int i13 = r12; i13 < length; i13++) {
                                int i14 = iArr2[i13];
                                sparseIntArray.put(i14, xu1Var.k(i14, r12));
                            }
                        }
                        ArrayList<apb> themeDescriptions = eVar.getThemeDescriptions();
                        actionBarLayout.c(themeDescriptions);
                        Dialog dialog2 = eVar.visibleDialog;
                        if (dialog2 instanceof nx0) {
                            actionBarLayout.c(((nx0) dialog2).S());
                        }
                        if (i12 == 0) {
                            if (vk5Var.h != null) {
                                xu1 xu1Var2 = vk5Var.m;
                                if (xu1Var2 != null) {
                                    actionBarLayout.f0(xu1Var2);
                                }
                                vk5Var.h.run();
                            }
                            xu1 xu1Var3 = vk5Var.m;
                            actionBarLayout.p0 = r12;
                            actionBarLayout.q0 = xu1Var3;
                            int[] iArr3 = actionBarLayout.l0;
                            if (iArr3 != null) {
                                try {
                                    try {
                                        int min = Math.min(aob.f5, iArr3.length);
                                        int[] iArr4 = actionBarLayout.m0;
                                        if (iArr4 == null || iArr4.length < min) {
                                            actionBarLayout.m0 = new int[min];
                                            actionBarLayout.n0 = new int[min];
                                            actionBarLayout.o0 = new int[min];
                                        }
                                        for (int i15 = r12; i15 < min; i15++) {
                                            int h = xu1Var3 != null ? xu1Var3.h(i15) : aob.w0(null, i15, true);
                                            int i16 = actionBarLayout.l0[i15];
                                            if (h != i16 && ActionBarLayout.x(i15, i16, h)) {
                                                int[] iArr5 = actionBarLayout.m0;
                                                int i17 = actionBarLayout.p0;
                                                iArr5[i17] = i15;
                                                actionBarLayout.n0[i17] = actionBarLayout.l0[i15];
                                                actionBarLayout.o0[i17] = h;
                                                actionBarLayout.p0 = i17 + 1;
                                            }
                                        }
                                        iArr = null;
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        actionBarLayout.p0 = 0;
                                        iArr = null;
                                    }
                                    actionBarLayout.l0 = iArr;
                                } catch (Throwable th) {
                                    actionBarLayout.l0 = null;
                                    throw th;
                                }
                            }
                        }
                        actionBarLayout.a(themeDescriptions);
                        Dialog dialog3 = eVar.visibleDialog;
                        if (dialog3 instanceof nx0) {
                            actionBarLayout.a(((nx0) dialog3).S());
                        }
                        z2 = true;
                    }
                    i12++;
                    i4 = 2;
                    r12 = 0;
                    z2 = z2;
                }
                if (z2) {
                    if (!vk5Var.e) {
                        int size = actionBarLayout.V0.size() - ((actionBarLayout.h || actionBarLayout.b0) ? 2 : 1);
                        for (int i18 = 0; i18 < size; i18++) {
                            e eVar2 = (e) actionBarLayout.V0.get(i18);
                            eVar2.clearViews();
                            eVar2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (vk5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.i0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.d0.clear();
                        actionBarLayout.k0.clear();
                        actionBarLayout.p0 = 0;
                        actionBarLayout.q0 = null;
                        actionBarLayout.l0 = null;
                        actionBarLayout.j0 = null;
                        actionBarLayout.h0 = null;
                        ru1 ru1Var = vk5Var.j;
                        if (ru1Var != null) {
                            ru1Var.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i19 = aob.a;
                    aob.mm = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    ru1 ru1Var2 = vk5Var.i;
                    if (ru1Var2 != null) {
                        ru1Var2.run();
                    }
                    uu1 uu1Var = vk5Var.k;
                    actionBarLayout.h0 = uu1Var;
                    if (uu1Var != null) {
                        xu1 xu1Var4 = uu1Var.a;
                        xu1Var4.G.A0.invalidate();
                        xu1Var4.t.K = 0.0f;
                        xu1Var4.u.K = 0.0f;
                        xu1Var4.t(0.0f);
                    }
                    actionBarLayout.s0.d();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.r0 = animatorSet;
                    animatorSet.addListener(new v5(actionBarLayout, vk5Var, b2));
                    actionBarLayout.r0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.r0.setDuration(vk5Var.l);
                    actionBarLayout.r0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                fu fuVar = (fu) this.c;
                int i20 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.e;
                fuVar.a(0, false);
                jj.c0(i20, tL_error2, null, tL_channels_joinChannel, Boolean.TRUE);
                return;
            case 4:
                o oVar = (o) this.c;
                int i21 = this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                String str2 = (String) this.e;
                if (i21 == oVar.Y0) {
                    oVar.b0(true);
                    oVar.F = arrayList3;
                    oVar.G = str2;
                    oVar.v0[0].c.E.clear();
                    oVar.v0[0].b.i1();
                    oVar.U(0);
                    return;
                }
                return;
            case 5:
                wc6 wc6Var = (wc6) this.c;
                int i22 = this.b;
                String str3 = (String) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = wc6Var.f;
                if (i22 == wc6Var.s) {
                    wc6Var.w = false;
                    wc6Var.h = str3;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    ng0 ng0Var = wc6Var.n;
                    if (ng0Var != null) {
                        ng0Var.b();
                    }
                    wc6Var.f();
                    return;
                }
                return;
            case 6:
                hl.c3(new es6(this.c, this.e, (Object) jf7.Y(this.b).i0((ArrayList) this.d), (byte) 19));
                return;
            case 7:
                hl.c3(new es6((Object) jf7.Y(this.b).i0((ArrayList) this.c), this.d, this.e, (byte) 24));
                return;
            case 8:
                rv0 rv0Var = (rv0) this.c;
                int i23 = this.b;
                nv0 nv0Var = (nv0) this.d;
                pv0 pv0Var = (pv0) this.e;
                r7a.B(rv0Var.N).q0(p7a.g(yac.h(rv0Var.N).f(), rv0Var.V.id, null, null, null, null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    rv0.t(i23, nv0Var, pv0Var, "phone_requested", jSONObject);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 9:
                c91 c91Var = (c91) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                int i24 = this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    uc7.s1(i24).j4(tL_users_userFull.users, false);
                    uc7.s1(i24).c4(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull3 = userFull;
                xkc.m(user2, false, userFull3 != null && userFull3.video_calls_available, c91Var.getParentActivity(), userFull3, k5.a(i24));
                return;
            case 10:
                ((CameraView) this.c).lambda$createCamera$9(this.b, (CameraSession) this.d, (CameraView.CameraGLThread) this.e);
                return;
            case 11:
                zu1 zu1Var = (zu1) this.c;
                zu1Var.getNotificationCenter().k(57, Long.valueOf(zu1Var.l6), (ArrayList) this.d, Boolean.TRUE, (ArrayList) this.e, null, 0, Integer.valueOf(this.b), Boolean.valueOf(zu1Var.g5));
                zu1Var.P3 = null;
                return;
            case 12:
                zu1 zu1Var2 = (zu1) this.c;
                boolean[] zArr = (boolean[]) this.d;
                int i25 = this.b;
                zu1 zu1Var3 = (zu1) this.e;
                zu1Var2.getClass();
                if (zArr[0] || i25 != zu1Var2.dd || !zu1Var2.U3 || zu1Var2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                hl.d3(new gn1(zu1Var2, (byte) 23), 200L);
                zu1Var2.presentFragment(zu1Var3);
                if (!zu1Var2.Y7() || zu1Var3.hideKeyboardOnShow() || (nr1Var = zu1Var3.a0) == null || nr1Var.getEditField() == null) {
                    return;
                }
                zu1Var3.a0.getEditField().requestFocus();
                return;
            case 13:
                zu1 zu1Var4 = (zu1) this.c;
                jf7 jf7Var = (jf7) this.d;
                int i26 = this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                long j3 = i26;
                try {
                    ArrayList arrayList6 = new ArrayList();
                    jf7Var.T(String.valueOf(j3), arrayList6, null);
                    if (!arrayList6.isEmpty()) {
                        encryptedChat = (TLRPC.EncryptedChat) arrayList6.get(0);
                    }
                } catch (Exception e3) {
                    jf7Var.n(e3, true);
                }
                zu1Var4.h = encryptedChat;
                countDownLatch.countDown();
                return;
            case 14:
                x22 x22Var = (x22) this.c;
                int i27 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                b32 b32Var = x22Var.n;
                gu guVar = b32Var.s;
                if (i27 == x22Var.h) {
                    if (i27 != -1) {
                        j79 adapter = guVar.getAdapter();
                        x22 x22Var2 = b32Var.G;
                        if (adapter != x22Var2) {
                            guVar.setAdapter(x22Var2);
                        }
                    }
                    x22Var.d = arrayList7;
                    x22Var.e = arrayList8;
                    x22Var.f();
                    return;
                }
                return;
            case 15:
                b62 b62Var = (b62) this.c;
                a62 a62Var = (a62) this.d;
                no6 no6Var = (no6) this.e;
                int i28 = this.b;
                c62 c62Var = b62Var.Q;
                ValueAnimator valueAnimator = c62Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                c62Var.K = null;
                b62Var.H = 0.0f;
                b62Var.f(a62Var, no6Var, i28);
                b62Var.j();
                b62Var.i(c62Var.Q, false);
                return;
            case 16:
                jj.D(((fu5) this.c).e, (vnb) this.d, new wg(this.b, (hc2) this.e, b));
                return;
            case 17:
                lv2 lv2Var = (lv2) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                int i29 = this.b;
                int[] iArr6 = lv2Var.J;
                if (tL_error3 == null) {
                    TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject3;
                    lv2Var.getMessagesController().j4(privacyrules.users, false);
                    lv2Var.getMessagesController().c4(privacyrules.chats, false);
                    switch (i29) {
                        case 0:
                            lv2Var.K = privacyrules.rules;
                            break;
                        case 1:
                            lv2Var.L = privacyrules.rules;
                            break;
                        case 2:
                            lv2Var.M = privacyrules.rules;
                            break;
                        case 3:
                            lv2Var.N = privacyrules.rules;
                            break;
                        case 4:
                            lv2Var.O = privacyrules.rules;
                            break;
                        case 5:
                            lv2Var.R = privacyrules.rules;
                            break;
                        case 6:
                            lv2Var.S = privacyrules.rules;
                            break;
                        case 7:
                        case 10:
                        default:
                            lv2Var.T = privacyrules.rules;
                            break;
                        case 8:
                            lv2Var.U = privacyrules.rules;
                            break;
                        case 9:
                            lv2Var.P = privacyrules.rules;
                            break;
                        case 11:
                            lv2Var.V = privacyrules.rules;
                            break;
                        case 12:
                            lv2Var.W = privacyrules.rules;
                            break;
                        case 13:
                            lv2Var.X = privacyrules.rules;
                            break;
                        case 14:
                            lv2Var.Q = privacyrules.rules;
                            break;
                    }
                    iArr6[i29] = 2;
                } else {
                    iArr6[i29] = 0;
                }
                lv2Var.getNotificationCenter().k(48, new Object[0]);
                return;
            case 18:
                rw2 rw2Var = (rw2) this.c;
                d79 d79Var = (d79) this.d;
                int i30 = this.b;
                vnb vnbVar = (vnb) this.e;
                if (rw2Var.j != null) {
                    d79Var.setOnItemClickListener((r69) null);
                    d79Var.requestDisallowInterceptTouchEvent(true);
                    rw2Var.j = null;
                    rw2Var.l(hl.W(d79Var.getContext()));
                    rw2Var.i = false;
                    View view = rw2Var.h;
                    if (view instanceof x2b) {
                        x2b x2bVar = (x2b) view;
                        TLRPC.Document sticker = x2bVar.getSticker();
                        k7a stickerPath = x2bVar.getStickerPath();
                        String V = r47.V(x2bVar.getSticker(), null, Integer.valueOf(rw2Var.r));
                        pw2 pw2Var = rw2Var.l;
                        rw2Var.i(sticker, stickerPath, V, pw2Var != null ? pw2Var.E(false) : null, null, i30, x2bVar.E, x2bVar.getParentObject(), rw2Var.c0, 0);
                        x2bVar.setScaled(true);
                    } else if (view instanceof u2b) {
                        u2b u2bVar = (u2b) view;
                        TLRPC.Document sticker2 = u2bVar.getSticker();
                        pw2 pw2Var2 = rw2Var.l;
                        rw2Var.i(sticker2, null, null, pw2Var2 != null ? pw2Var2.E(false) : null, null, i30, false, u2bVar.getParentObject(), vnbVar, 0);
                        u2bVar.setScaled(true);
                        rw2Var.i = u2bVar.h;
                    } else if (view instanceof vw2) {
                        vw2 vw2Var = (vw2) view;
                        TLRPC.Document document2 = vw2Var.getDocument();
                        pw2 pw2Var3 = rw2Var.l;
                        rw2Var.i(document2, null, null, pw2Var3 != null ? pw2Var3.E(true) : null, vw2Var.getBotInlineResult(), i30, false, vw2Var.getBotInlineResult() != null ? vw2Var.getInlineBot() : vw2Var.getParentObject(), vnbVar, 0);
                        if (i30 != 1 || rw2Var.m) {
                            vw2Var.setScaled(true);
                        }
                    } else if (view instanceof ey3) {
                        TLRPC.Document document3 = ((ey3) view).getDocument();
                        if (document3 == null) {
                            return;
                        } else {
                            rw2Var.i(document3, null, r47.V(document3, null, Integer.valueOf(rw2Var.r)), null, null, i30, false, null, vnbVar, 0);
                        }
                    } else if (view instanceof x14) {
                        hm span = ((x14) view).getSpan();
                        if (span != null) {
                            TLRPC.Document document4 = span.document;
                            if (document4 == null) {
                                document4 = wl.e(rw2Var.r, span.getDocumentId());
                            }
                            document = document4;
                        } else {
                            document = null;
                        }
                        if (document == null) {
                            return;
                        } else {
                            rw2Var.i(document, null, r47.V(document, null, Integer.valueOf(rw2Var.r)), null, null, i30, false, null, vnbVar, 0);
                        }
                    } else {
                        if (!(view instanceof yeb)) {
                            return;
                        }
                        Drawable drawable2 = ((yeb) view).b;
                        TLRPC.Document document5 = drawable2 instanceof wl ? ((wl) drawable2).e : null;
                        if (document5 == null) {
                            return;
                        } else {
                            rw2Var.i(document5, null, r47.V(document5, null, Integer.valueOf(rw2Var.r)), null, null, i30, false, null, vnbVar, 0);
                        }
                    }
                    try {
                        rw2Var.h.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    pw2 pw2Var4 = rw2Var.l;
                    if (pw2Var4 != null) {
                        pw2Var4.r();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                int[] iArr7 = (int[]) this.c;
                Runnable[] runnableArr = (Runnable[]) this.d;
                int[] iArr8 = (int[]) this.e;
                int i31 = this.b;
                iArr7[0] = iArr7[0] + 1;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    hl.r(runnable2);
                    runnableArr[0] = null;
                }
                if (iArr8[0] >= 0) {
                    ConnectionsManager.getInstance(i31).cancelRequest(iArr8[0], true);
                    iArr8[0] = -1;
                    return;
                }
                return;
            case 20:
                tl3 tl3Var = (tl3) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                int i32 = this.b;
                p55 p55Var = (p55) this.e;
                ArrayList arrayList10 = tl3Var.L;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - tl3Var.o0 >= 300) {
                    tl3Var.o0 = elapsedRealtime;
                    int size2 = arrayList10.size();
                    int size3 = arrayList9.size();
                    int i33 = (arrayList9.isEmpty() && arrayList10.isEmpty()) ? 0 : size3 + size2;
                    int min2 = Math.min(3, size3) + size2;
                    int b3 = tl3Var.b();
                    boolean z3 = tl3Var.H0;
                    boolean z4 = b3 > ((z3 ? min2 : i33) + i32) + 1;
                    zb3 zb3Var = tl3Var.j0;
                    if (zb3Var != null) {
                        zb3Var.c = (int) (z4 ? 45L : 200L);
                        zb3Var.d = (int) (z4 ? 80L : 200L);
                        zb3Var.l = (int) (z4 ? 270L : 0L);
                    }
                    tl3Var.H0 = !z3;
                    p55Var.setRightTextMargin(16);
                    String M0 = ob6.M0(tl3Var.H0 ? 2131745067 : 2131745068, null);
                    boolean z5 = tl3Var.H0;
                    si siVar = p55Var.b;
                    siVar.c(M0, true, z5);
                    siVar.setVisibility(0);
                    tl3Var.p0 = null;
                    View view2 = (View) p55Var.getParent();
                    if (view2 instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view2;
                        int i34 = (!tl3Var.H0 ? i32 + min2 : i33 + i32) + 1;
                        int i35 = 0;
                        while (true) {
                            if (i35 < recyclerView.getChildCount()) {
                                View childAt = recyclerView.getChildAt(i35);
                                if (RecyclerView.S(childAt) == i34) {
                                    tl3Var.p0 = childAt;
                                } else {
                                    i35++;
                                }
                            }
                        }
                    }
                    int i36 = i32 + min2;
                    int i37 = i36 + 1;
                    int max = Math.max(0, size3 - 3);
                    if (tl3Var.H0) {
                        tl3Var.q(i37, max);
                        if (z4) {
                            hl.d3(new hl3(tl3Var, i36, 0 == true ? (byte) 1 : (byte) 0), 350L);
                        } else {
                            tl3Var.g(i36);
                        }
                    } else {
                        tl3Var.g(i36);
                        tl3Var.p(i37, max);
                    }
                    wd3 wd3Var = tl3Var.q0;
                    if (wd3Var != null) {
                        hl.r(wd3Var);
                    }
                    if (!z4) {
                        tl3Var.n0 = false;
                        return;
                    }
                    tl3Var.n0 = true;
                    wd3 wd3Var2 = new wd3(tl3Var, view2, (byte) 9);
                    tl3Var.q0 = wd3Var2;
                    hl.d3(wd3Var2, 400L);
                    return;
                }
                return;
            case 21:
                gx9 gx9Var = (gx9) this.c;
                int i38 = this.b;
                TLObject tLObject4 = (TLObject) this.e;
                String str4 = (String) this.d;
                int i39 = gx9Var.t0;
                if (i38 == gx9Var.e0 && (tLObject4 instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                    gx9Var.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    gx9Var.x = messages_messages.next_rate;
                    gx9Var.E = str4;
                    uc7.s1(i39).j4(messages_messages.users, false);
                    uc7.s1(i39).c4(messages_messages.chats, false);
                    for (int i40 = 0; i40 < messages_messages.messages.size(); i40++) {
                        gx9Var.y.add(new r47(i39, messages_messages.messages.get(i40), false, true));
                    }
                    dj3 dj3Var = gx9Var.V;
                    if (dj3Var != null) {
                        dj3Var.d(gx9Var.E0 > 0, true);
                    }
                    gx9Var.f();
                    return;
                }
                return;
            case 22:
                DictationLid.d(this.b, (ln3) this.d, (String) this.e, (byte[]) this.c);
                return;
            case 23:
                ja4 ja4Var = (ja4) this.c;
                int i41 = this.b;
                z94 z94Var = (z94) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                if (i41 == ja4Var.k && ja4Var.f && z94Var != null) {
                    z94Var.run();
                }
                ja4Var.a(i41, -5, arrayList11);
                return;
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                e();
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i42 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                uj3 uj3Var = (uj3) this.e;
                String str5 = LaunchActivity.C1;
                jn7.f(i42).k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (uc7.s1(launchActivity.P).C(bundle, uj3Var, null, null)) {
                    launchActivity.u0(new zu1(bundle), true, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ gp6(c79 c79Var, int i, TLObject tLObject, String str, byte b) {
        this.a = b;
        this.c = c79Var;
        this.b = i;
        this.e = tLObject;
        this.d = str;
    }

    public /* synthetic */ gp6(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ gp6(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ gp6(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public /* synthetic */ gp6(e eVar, TLObject tLObject, int i, Object obj, byte b) {
        this.a = b;
        this.c = eVar;
        this.e = tLObject;
        this.b = i;
        this.d = obj;
    }
}
