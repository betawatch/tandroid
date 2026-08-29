package ag;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import bg.c3;
import bg.p3;
import bg.u3;
import bg.x2;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import jh.h5;
import lh.k6;
import lh.s6;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.a9;
import org.telegram.ui.dk;
import org.telegram.ui.ig;
import org.telegram.ui.kv;
import org.telegram.ui.m4;
import org.telegram.ui.mn;
import org.telegram.ui.mq0;
import org.telegram.ui.on;
import org.telegram.ui.rn;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z1(int i10, Context context, c6 c6Var, TL_stars.SavedStarGift savedStarGift) {
        this.a = 4;
        this.b = i10;
        this.c = context;
        this.d = c6Var;
        this.e = savedStarGift;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        o2 o2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        dk dkVar;
        y00 y00Var;
        long peerId;
        int i11;
        TLRPC.WebPage webPage;
        int i12;
        int i13 = this.a;
        int i14 = 6;
        int i15 = 4;
        String str = null;
        int i16 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i13) {
            case 0:
                d2 d2Var = (d2) obj3;
                w1 w1Var = (w1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = d2Var.c;
                boolean z10 = w1Var != null;
                d2Var.d = z10;
                if (!z10 || i16 < 0 || i16 >= arrayList2.size()) {
                    d2Var.i = arrayList;
                } else {
                    d2Var.a++;
                    ((c2) arrayList2.get(i16)).c++;
                    d2Var.g.edit().putInt(j7.l1.k(i16, "score"), ((c2) arrayList2.get(i16)).c).putInt("scoreall", d2Var.a).apply();
                    d2Var.i = null;
                }
                d2Var.e.run(w1Var);
                return;
            case 1:
                u3 u3Var = (u3) obj3;
                u3Var.m((Bitmap) obj2, this.b, u3Var.P, u3Var.Q, (mq0) obj);
                return;
            case 2:
                cg.v0.R((cg.v0) obj3, (ArrayList) obj, i16, (TLRPC.TL_messages_inactiveChats) obj2);
                return;
            case 3:
                e3.f fVar = (e3.f) obj3;
                y2.i iVar = (y2.i) obj2;
                Runnable runnable2 = (Runnable) obj;
                g3.c cVar = (g3.c) fVar.f;
                try {
                    try {
                        f3.d dVar = (f3.d) fVar.c;
                        Objects.requireNonNull(dVar);
                        ((f3.h) cVar).f(new a1.c(dVar, 24));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) fVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((f3.h) cVar).f(new e3.d(fVar, iVar, i16, 0));
                        } else {
                            fVar.e(iVar, i16);
                        }
                    } catch (g3.a unused) {
                        ((androidx.biometric.e) fVar.d).A(iVar, i16 + 1, false);
                    }
                    runnable2.run();
                    return;
                } catch (Throwable th2) {
                    runnable2.run();
                    throw th2;
                }
            case 4:
                int i17 = this.b;
                h5 h5Var = new h5((Context) obj3, i17, UserConfig.getInstance(i17).getClientUserId(), (c6) obj2, null);
                h5Var.j2((TL_stars.SavedStarGift) obj, null);
                h5Var.show();
                return;
            case 5:
                k6 k6Var = (k6) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj2;
                AbstractSet abstractSet = k6Var.k;
                int i18 = k6Var.f;
                AbstractSet abstractSet2 = k6Var.l;
                k6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i19 = k6Var.e;
                sb2.append(i19);
                sb2.append("{");
                long j10 = k6Var.d;
                sb2.append(j10);
                sb2.append("} loaded {");
                sb2.append(s6.a(arrayList3));
                th.v("}", sb2);
                ArrayList arrayList4 = k6Var.g;
                arrayList4.clear();
                arrayList4.addAll(tL_stories_stories.pinned_to_top);
                int i20 = k6Var.c;
                boolean z11 = false;
                MessagesController.getInstance(i20).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i20).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i20).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                k6Var.u = false;
                k6Var.s = tL_stories_stories.count;
                int i21 = 0;
                while (i21 < arrayList3.size()) {
                    k6Var.t((MessageObject) arrayList3.get(i21), z11);
                    i21++;
                    z11 = false;
                }
                boolean z12 = abstractSet2.size() >= k6Var.s;
                k6Var.r = z12;
                if (z12) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            k6Var.u(intValue, false);
                        }
                    }
                } else if (i18 <= 0) {
                    if (i16 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList5 = new ArrayList(abstractSet2);
                            for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                Integer num2 = (Integer) arrayList5.get(i22);
                                int intValue2 = num2.intValue();
                                if (!arrayList4.contains(num2)) {
                                    i10 = intValue2;
                                    i16 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i16 = i10;
                    }
                    int n10 = k6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i16 && intValue3 <= n10) {
                            it2.remove();
                            k6Var.u(intValue3, false);
                        }
                    }
                }
                k6Var.d(true);
                if (k6Var.r) {
                    if (k6.B == null) {
                        k6.B = new HashMap();
                    }
                    k6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i20), Integer.valueOf(i19), Long.valueOf(j10), Integer.valueOf(i18))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    k6Var.w();
                }
                k6Var.x();
                return;
            case 6:
                ((CameraView) obj3).lambda$createCamera$11(i16, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 7:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                a5 a5Var = (a5) obj2;
                Runnable runnable3 = (Runnable) obj;
                oc.i iVar2 = actionBarLayout.W;
                boolean z13 = false;
                for (int i23 = 0; i23 < i16; i23++) {
                    if (i23 == 0) {
                        o2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.T) && actionBarLayout.K0.size() > 1) {
                            o2Var = (o2) j7.l1.j(2, actionBarLayout.K0);
                        }
                    }
                    if (o2Var != null) {
                        if (a5Var.m != null) {
                            if (actionBarLayout.a0 == null) {
                                d5 d5Var = new d5(0, true, false, iVar2);
                                actionBarLayout.a0 = d5Var;
                                d5Var.J = true;
                                d5 d5Var2 = new d5(1, true, false, iVar2);
                                actionBarLayout.b0 = d5Var2;
                                d5Var2.J = true;
                            }
                            c6 c6Var = a5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) iVar2.b;
                            sparseIntArray.clear();
                            for (int i24 : (int[]) iVar2.c) {
                                sparseIntArray.put(i24, c6Var.g1(i24));
                            }
                        }
                        ArrayList<i6> themeDescriptions = o2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = o2Var.visibleDialog;
                        if (dialog instanceof f3) {
                            actionBarLayout.d(((f3) dialog).getThemeDescriptions());
                        }
                        if (i23 == 0 && (runnable = a5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = o2Var.visibleDialog;
                        if (dialog2 instanceof f3) {
                            actionBarLayout.b(((f3) dialog2).getThemeDescriptions());
                        }
                        z13 = true;
                    }
                }
                if (z13) {
                    if (!a5Var.e) {
                        int size = actionBarLayout.K0.size() - ((actionBarLayout.h || actionBarLayout.T) ? 2 : 1);
                        for (int i25 = 0; i25 < size; i25++) {
                            o2 o2Var2 = (o2) actionBarLayout.K0.get(i25);
                            o2Var2.clearViews();
                            o2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (a5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.d0.clear();
                        actionBarLayout.U.clear();
                        actionBarLayout.V.clear();
                        actionBarLayout.f0.clear();
                        actionBarLayout.e0 = null;
                        actionBarLayout.c0 = null;
                        mn mnVar = a5Var.j;
                        if (mnVar != null) {
                            mnVar.run();
                        }
                        if (runnable3 != null) {
                            runnable3.run();
                            return;
                        }
                        return;
                    }
                    int i26 = g6.a;
                    g6.sl = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    mn mnVar2 = a5Var.i;
                    if (mnVar2 != null) {
                        mnVar2.run();
                    }
                    on onVar = a5Var.k;
                    actionBarLayout.c0 = onVar;
                    if (onVar != null) {
                        rn rnVar = onVar.a;
                        rnVar.R.t0.invalidate();
                        rnVar.E.I = 0.0f;
                        rnVar.F.I = 0.0f;
                        rnVar.k(0.0f);
                    }
                    actionBarLayout.h0.lock();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.g0 = animatorSet;
                    animatorSet.addListener(new c3(12, actionBarLayout, a5Var));
                    actionBarLayout.g0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.g0.setDuration(a5Var.l);
                    actionBarLayout.g0.start();
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.g1) obj3).a(0, false);
                c5.f0(i16, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 9:
                m4 m4Var = (m4) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                String str2 = (String) obj2;
                if (i16 == m4Var.S0) {
                    m4Var.d0(true);
                    m4Var.A = arrayList6;
                    m4Var.B = str2;
                    m4Var.q0[0].c.y.clear();
                    m4Var.q0[0].b.f1();
                    m4Var.W(0);
                    return;
                }
                return;
            case 10:
                a9 a9Var = (a9) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                    MessagesController.getInstance(i16).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i16).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.h2.n(user, false, userFull != null && userFull.video_calls_available, a9Var.getParentActivity(), userFull, AccountInstance.getInstance(i16));
                return;
            case 11:
                tn tnVar = (tn) obj3;
                tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(tnVar.P5), (ArrayList) obj, Boolean.TRUE, (ArrayList) obj2, null, 0, Integer.valueOf(i16), Boolean.valueOf(tnVar.O4));
                tnVar.w3 = null;
                return;
            case 12:
                tn tnVar2 = (tn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                tn tnVar3 = (tn) obj;
                if (zArr[0] || i16 != tnVar2.ec || !tnVar2.B3 || tnVar2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                AndroidUtilities.runOnUIThread(new ig(tnVar2, 20), 200L);
                tnVar2.presentFragment(tnVar3);
                if (!tnVar2.x9() || tnVar3.hideKeyboardOnShow() || (dkVar = tnVar3.U) == null || dkVar.getEditField() == null) {
                    return;
                }
                tnVar3.U.getEditField().requestFocus();
                return;
            case 13:
                tn tnVar4 = (tn) obj3;
                tnVar4.getClass();
                tnVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i16);
                ((CountDownLatch) obj).countDown();
                return;
            case 14:
                oj ojVar = (oj) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = (ArrayList) obj2;
                sj sjVar = ojVar.n;
                jh.e1 e1Var = sjVar.s;
                if (i16 != ojVar.h) {
                    return;
                }
                if (i16 != -1) {
                    f2.p0 adapter = e1Var.getAdapter();
                    oj ojVar2 = sjVar.B;
                    if (adapter != ojVar2) {
                        e1Var.setAdapter(ojVar2);
                    }
                }
                ojVar.d = arrayList7;
                ojVar.e = arrayList8;
                ojVar.l();
                return;
            case 15:
                km kmVar = (km) obj3;
                jm jmVar = (jm) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                lm lmVar = kmVar.L;
                ValueAnimator valueAnimator = lmVar.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                lmVar.F = null;
                kmVar.C = 0.0f;
                kmVar.f(jmVar, photoEntry, i16);
                kmVar.j();
                kmVar.i(lmVar.L, false);
                return;
            case 16:
                c5.G(((j70) obj3).e, (c6) obj2, new eg.n2(i16, (eo) obj, i14));
                return;
            case 17:
                o2 o2Var3 = (o2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (o2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList9 = new ArrayList();
                    for (int i27 = 0; i27 < vector.objects.size(); i27++) {
                        try {
                            arrayList9.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i27))));
                        } catch (Exception unused2) {
                        }
                    }
                    y00Var = new y00(o2Var3, i16, arrayList9);
                } else {
                    y00Var = new y00(o2Var3, i16, null);
                }
                y00Var.x0 = callback;
                o2Var3.showDialog(y00Var);
                return;
            case 18:
                o30 o30Var = (o30) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                o30Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new rm(o30Var, i16, new ArrayList(), i15));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i28 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i28];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i29 = 0;
                while (i29 < size2) {
                    TLObject tLObject3 = (TLObject) arrayList10.get(i29);
                    if (tLObject3 instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject3).user_id;
                    } else {
                        if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject3).peer);
                        }
                        i29++;
                        str = null;
                    }
                    i11 = ((f3) o30Var.w).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                    if (!UserObject.isUserSelf(user2)) {
                        String lowerCase2 = UserObject.getUserName(user2).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = str;
                        }
                        int i30 = 0;
                        char c3 = 0;
                        while (true) {
                            if (i30 < i28) {
                                String str3 = strArr[i30];
                                if (lowerCase2.startsWith(str3) || x3.w(" ", str3, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str3) || x3.w(" ", str3, translitString2)))) {
                                    c3 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user2);
                                    if (publicUsername != null && publicUsername.startsWith(str3)) {
                                        c3 = 2;
                                    }
                                }
                                if (c3 != 0) {
                                    arrayList11.add(tLObject3);
                                } else {
                                    i30++;
                                }
                            }
                        }
                        i29++;
                        str = null;
                    }
                    i29++;
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new rm(o30Var, i16, arrayList11, 4));
                return;
            case 19:
                c40 c40Var = (c40) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str4 = (String) obj;
                int i31 = c40Var.J;
                ArrayList arrayList12 = c40Var.K;
                if (i16 != c40Var.P) {
                    return;
                }
                boolean isEmpty = arrayList12.isEmpty();
                c40Var.O = false;
                if (tLObject4 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                    if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        c40Var.S = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                    } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        c40Var.S = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    c40Var.V = messages_messages.next_rate;
                    MessagesController.getInstance(i31).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i31).putChats(messages_messages.chats, false);
                    for (int i32 = 0; i32 < messages_messages.messages.size(); i32++) {
                        MessageObject messageObject = new MessageObject(i31, messages_messages.messages.get(i32), false, true);
                        messageObject.setQuery(str4);
                        arrayList12.add(messageObject);
                    }
                    c40Var.R = arrayList12.size() >= c40Var.S;
                    c40Var.W();
                } else {
                    c40Var.R = true;
                    c40Var.S = arrayList12.size();
                }
                c40Var.N(true);
                if (isEmpty) {
                    ((kn0) c40Var).Y.p0.h1(0, 0);
                    return;
                }
                return;
            case 20:
                en0.c(((en0) obj3).getContext(), i16, ((bn0) obj2).a.g(), (c6) obj);
                return;
            case 21:
                iq0 iq0Var = (iq0) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str5 = (String) obj;
                HashMap hashMap = iq0Var.v;
                if (i16 != iq0Var.y) {
                    return;
                }
                iq0Var.x = 0;
                if (tLObject5 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject5;
                    MessagesController.getInstance(iq0Var.c).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(iq0Var.c).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage)) {
                            if (hashMap.size() > 5) {
                                Iterator it3 = hashMap.keySet().iterator();
                                while (it3.hasNext() && hashMap.size() > 5) {
                                    it3.next();
                                    it3.remove();
                                }
                            }
                            hashMap.put(str5, webPage);
                            iq0Var.w = webPage;
                            iq0.a(iq0Var.a[0], webPage, str5);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            iq0Var.w = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            iq0Var.w = null;
                            if (iq0Var.b != 0) {
                                iq0Var.b = 0;
                                hq0 hq0Var = iq0Var.D;
                                if (hq0Var != null) {
                                    ((kv) hq0Var).h(0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                webPage = null;
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                }
            case 22:
                ((qu0) obj3).H0((MessageObject) obj2, (View) obj, i16, false);
                return;
            case 23:
                qu0.g((qu0) obj3, i16, (TL_stories.StoryItem) obj2, (String) obj);
                return;
            case 24:
                c5.f0(i16, (TLRPC.TL_error) obj2, ((qu0) obj3).r1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 25:
                lt0 lt0Var = (lt0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                String str6 = (String) obj2;
                qu0 qu0Var = lt0Var.v;
                if (lt0Var.h != 0) {
                    if (i16 == lt0Var.n) {
                        int h = lt0Var.h();
                        lt0Var.f = arrayList13;
                        lt0Var.s--;
                        int h10 = lt0Var.h();
                        if (lt0Var.s == 0 || h10 != 0) {
                            qu0Var.m1(false);
                        }
                        int i33 = 0;
                        while (true) {
                            it0[] it0VarArr = qu0Var.g0;
                            if (i33 < it0VarArr.length) {
                                it0 it0Var = it0VarArr[i33];
                                if (it0Var.B == lt0Var.r) {
                                    if (lt0Var.s == 0 && h10 == 0) {
                                        it0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str6));
                                        it0VarArr[i33].w.f.setVisibility(8);
                                        it0VarArr[i33].w.e(false, true);
                                    } else if (h == 0) {
                                        qu0Var.z(it0Var.h, 0, null);
                                    }
                                }
                                i33++;
                            } else {
                                lt0Var.l();
                            }
                        }
                    }
                    lt0Var.h = 0;
                    return;
                }
                return;
            case 26:
                fy0 fy0Var = (fy0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str7 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList14 = new ArrayList();
                int i34 = fy0Var.a;
                MediaDataController.getInstance(i34).getEmojiSuggestions(strArr2, str7, true, new p3(fy0Var, this.b, str7, hashSet, arrayList14, 4), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i34).isPremium());
                return;
            case 27:
                fy0 fy0Var2 = (fy0) obj3;
                String str8 = (String) obj2;
                ArrayList arrayList15 = (ArrayList) obj;
                if (i16 == fy0Var2.E) {
                    fy0Var2.D = str8;
                    fy0Var2.C = 2;
                    arrayList15.remove(arrayList15.size() - 1);
                    if (arrayList15.isEmpty()) {
                        fy0Var2.x = true;
                        fy0Var2.f();
                        return;
                    }
                    fy0Var2.x = false;
                    fy0Var2.v = false;
                    fy0Var2.c();
                    x2 x2Var = fy0Var2.d;
                    if (x2Var != null) {
                        x2Var.setVisibility(0);
                        fy0Var2.d.invalidate();
                    }
                    fy0Var2.w = arrayList15;
                    cy0 cy0Var = fy0Var2.f;
                    if (cy0Var != null) {
                        cy0Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                d11 d11Var = (d11) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                ArrayList arrayList17 = (ArrayList) obj2;
                ThemeEditorView.EditorAlert editorAlert = d11Var.r;
                v01 v01Var = editorAlert.c;
                if (i16 != d11Var.d) {
                    return;
                }
                d11 d11Var2 = editorAlert.r;
                if (v01Var.getAdapter() != d11Var2) {
                    editorAlert.B = ThemeEditorView.EditorAlert.I(editorAlert);
                    v01Var.setAdapter(d11Var2);
                    d11Var2.l();
                }
                boolean z14 = !d11Var.e.isEmpty() && arrayList16.isEmpty();
                boolean z15 = d11Var.e.isEmpty() && arrayList16.isEmpty();
                if (z14) {
                    editorAlert.B = ThemeEditorView.EditorAlert.I(editorAlert);
                }
                d11Var.e = arrayList16;
                d11Var.f = arrayList17;
                d11Var.l();
                if (!z15 && !z14 && (i12 = editorAlert.B) > 0) {
                    editorAlert.h.h1(0, -i12);
                    editorAlert.B = -1000;
                }
                editorAlert.e.c();
                return;
            default:
                l11 l11Var = (l11) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable drawable = ((fp) obj2).b;
                if (drawable instanceof yb0) {
                    yb0 yb0Var = (yb0) drawable;
                    yb0Var.t(l11.e(bitmap), i16);
                    yb0Var.u(l11Var.H);
                    l11Var.invalidate();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ z1(ViewGroup viewGroup, Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
    }

    public /* synthetic */ z1(cg.v0 v0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        this.a = 2;
        this.c = v0Var;
        this.e = arrayList;
        this.b = i10;
        this.d = tL_messages_inactiveChats;
    }

    public /* synthetic */ z1(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ z1(Object obj, int i10, ArrayList arrayList, Serializable serializable, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.e = arrayList;
        this.d = serializable;
    }

    public /* synthetic */ z1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ z1(Object obj, ArrayList arrayList, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.e = arrayList;
        this.d = obj2;
        this.b = i10;
    }
}
