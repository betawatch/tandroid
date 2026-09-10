package di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.af;
import bi.ld;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.vm;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.bo;
import org.telegram.ui.d9;
import org.telegram.ui.eo;
import org.telegram.ui.iy;
import org.telegram.ui.ok;
import org.telegram.ui.vg;
import org.telegram.ui.wn;
import org.telegram.ui.yn;
import org.telegram.ui.yv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.a = 0;
        this.b = i10;
        this.c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.p2 p2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        ok okVar;
        k10 k10Var;
        long peerId;
        int i10;
        TLRPC.WebPage webPage;
        int i11;
        int i12 = this.a;
        int i13 = 20;
        int i14 = 7;
        int i15 = 2;
        String str = null;
        int i16 = 0;
        int i17 = this.b;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i12) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.k0(MessagesStorage.getInstance(i17).getUsers((ArrayList) obj2), (HashMap) obj3, (Utilities.Callback) obj, 14));
                break;
            case 1:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj2;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    rVar.run(Boolean.FALSE, "cancelled");
                    break;
                } else {
                    h5.b(i17, user, userFull2, rVar);
                    break;
                }
            case 2:
                fg.h0 h0Var = (fg.h0) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) obj;
                ArrayList arrayList2 = h0Var.K;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - h0Var.n0 >= 300) {
                    h0Var.n0 = elapsedRealtime;
                    int size = arrayList2.size();
                    int size2 = arrayList.size();
                    int i18 = (arrayList.isEmpty() && arrayList2.isEmpty()) ? 0 : size2 + size;
                    int min = Math.min(3, size2) + size;
                    int h = h0Var.h();
                    boolean z10 = h0Var.G0;
                    boolean z11 = h > ((z10 ? min : i18) + i17) + 1;
                    s4.j jVar = h0Var.i0;
                    if (jVar != null) {
                        jVar.c = z11 ? 45L : 200L;
                        jVar.d = z11 ? 80L : 200L;
                        jVar.l = z11 ? 270L : 0L;
                    }
                    h0Var.G0 = !z10;
                    u3Var.setRightTextMargin(16);
                    String string = LocaleController.getString(h0Var.G0 ? R.string.ShowMore : R.string.ShowLess);
                    boolean z12 = h0Var.G0;
                    org.telegram.ui.Cells.t3 t3Var = u3Var.b;
                    t3Var.c(string, true, z12);
                    t3Var.setVisibility(0);
                    h0Var.o0 = null;
                    View view = (View) u3Var.getParent();
                    if (view instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view;
                        int i19 = (!h0Var.G0 ? i17 + min : i18 + i17) + 1;
                        int i20 = 0;
                        while (true) {
                            if (i20 < recyclerView.getChildCount()) {
                                View childAt = recyclerView.getChildAt(i20);
                                if (RecyclerView.R(childAt) == i19) {
                                    h0Var.o0 = childAt;
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                    int i21 = i17 + min;
                    int i22 = i21 + 1;
                    int max = Math.max(0, size2 - 3);
                    if (h0Var.G0) {
                        h0Var.t(i22, max);
                        if (z11) {
                            AndroidUtilities.runOnUIThread(new bi.s(h0Var, i21, 6), 350L);
                        } else {
                            h0Var.m(i21);
                        }
                    } else {
                        h0Var.m(i21);
                        h0Var.s(i22, max);
                    }
                    af afVar = h0Var.p0;
                    if (afVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(afVar);
                    }
                    if (z11) {
                        h0Var.m0 = true;
                        af afVar2 = new af(28, h0Var, view);
                        h0Var.p0 = afVar2;
                        AndroidUtilities.runOnUIThread(afVar2, 400L);
                        break;
                    } else {
                        h0Var.m0 = false;
                        break;
                    }
                }
                break;
            case 3:
                fg.h0 h0Var2 = (fg.h0) obj2;
                TLObject tLObject = (TLObject) obj3;
                String str2 = (String) obj;
                int i23 = h0Var2.s0;
                if (i17 == h0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    h0Var2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    h0Var2.w = messages_messages.next_rate;
                    h0Var2.y = str2;
                    boolean z13 = false;
                    MessagesController.getInstance(i23).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i23).putChats(messages_messages.chats, false);
                    int i24 = 0;
                    while (i24 < messages_messages.messages.size()) {
                        h0Var2.x.add(new MessageObject(i23, messages_messages.messages.get(i24), z13, true));
                        i24++;
                        z13 = false;
                    }
                    iy iyVar = h0Var2.U;
                    if (iyVar != null) {
                        iyVar.d(h0Var2.D0 > 0, true);
                    }
                    h0Var2.l();
                    break;
                }
                break;
            case 4:
                gg.k2 k2Var = (gg.k2) obj2;
                ArrayList arrayList3 = k2Var.b;
                TLRPC.Message message = (TLRPC.Message) obj3;
                String str3 = (String) obj;
                int i25 = k2Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    gg.j2 c10 = k2Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        gg.j2 j2Var = new gg.j2();
                        j2Var.a = message.quick_reply_shortcut_id;
                        j2Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i25, message, false, true);
                        j2Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str3 != null) {
                            j2Var.b = str3;
                            k2Var.a(str3);
                        }
                        j2Var.e.applyQuickReply(str3, i17);
                        j2Var.f = 1;
                        arrayList3.add(j2Var);
                        for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                            ((gg.j2) arrayList3.get(i26)).c = i26;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i25);
                        messagesStorage.getStorageQueue().postRunnable(new fg.s1(6, messagesStorage, j2Var));
                        NotificationCenter.getInstance(i25).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i27 = c10.d;
                        int i28 = message.id;
                        if (i27 == i28) {
                            c10.d = i28;
                            MessageObject messageObject2 = new MessageObject(i25, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            k2Var.l();
                            NotificationCenter.getInstance(i25).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            k2Var.l();
                            NotificationCenter.getInstance(i25).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i17 == 0) {
                    ArrayList<TLRPC.Message> arrayList4 = new ArrayList<>();
                    arrayList4.add(message);
                    MessagesStorage.getInstance(i25).putMessages(arrayList4, true, true, false, DownloadController.getInstance(i25).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i25).getClientUserId();
                    ArrayList<MessageObject> arrayList5 = new ArrayList<>();
                    arrayList5.add(new MessageObject(i25, message, true, true));
                    MessagesController.getInstance(i25).updateInterfaceWithMessages(clientUserId, arrayList5, 5);
                    break;
                }
                break;
            case 5:
                List list = (List) obj3;
                m4.r rVar2 = (m4.r) obj;
                m4.b0 b0Var = ((m4.l0) ((a5.a) obj2).d).g;
                if (i17 == -1) {
                    b0Var.t.v0(list);
                } else {
                    b0Var.t.b0(i17, list);
                }
                new SparseBooleanArray().append(20, true);
                b0Var.p(rVar2);
                break;
            case 6:
                og.p1 p1Var = (og.p1) obj3;
                og.k1 k1Var = (og.k1) obj;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = p1Var.c;
                boolean z14 = k1Var != null;
                p1Var.d = z14;
                if (!z14 || i17 < 0 || i17 >= arrayList7.size()) {
                    p1Var.i = arrayList6;
                } else {
                    p1Var.a++;
                    ((og.o1) arrayList7.get(i17)).c++;
                    p1Var.g.edit().putInt(hc.b.j(i17, "score"), ((og.o1) arrayList7.get(i17)).c).putInt("scoreall", p1Var.a).apply();
                    p1Var.i = null;
                }
                p1Var.e.run(k1Var);
                break;
            case 7:
                ((CameraView) obj2).lambda$createCamera$11(i17, (CameraSession) obj3, (CameraView.CameraGLThread) obj);
                break;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) obj3;
                Runnable runnable2 = (Runnable) obj;
                og.u0 u0Var = actionBarLayout.d0;
                boolean z15 = false;
                for (int i29 = 0; i29 < i17; i29++) {
                    if (i29 == 0) {
                        p2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.O0.size() > 1) {
                            p2Var = (org.telegram.ui.ActionBar.p2) r6.g(2, actionBarLayout.O0);
                        }
                    }
                    if (p2Var != null) {
                        if (e5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(0, true, false, u0Var);
                                actionBarLayout.e0 = h5Var;
                                h5Var.J = true;
                                org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(1, true, false, u0Var);
                                actionBarLayout.f0 = h5Var2;
                                h5Var2.J = true;
                            }
                            f6 f6Var = e5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) u0Var.b;
                            sparseIntArray.clear();
                            for (int i30 : (int[]) u0Var.c) {
                                sparseIntArray.put(i30, f6Var.f1(i30));
                            }
                        }
                        ArrayList<l6> themeDescriptions = p2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = p2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.h3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.h3) dialog).getThemeDescriptions());
                        }
                        if (i29 == 0 && (runnable = e5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = p2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.h3) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.h3) dialog2).getThemeDescriptions());
                        }
                        z15 = true;
                    }
                }
                if (z15) {
                    if (!e5Var.e) {
                        int size3 = actionBarLayout.O0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i31 = 0; i31 < size3; i31++) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) actionBarLayout.O0.get(i31);
                            p2Var2.clearViews();
                            p2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (e5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.h0.clear();
                        actionBarLayout.b0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.j0.clear();
                        actionBarLayout.i0 = null;
                        actionBarLayout.g0 = null;
                        wn wnVar = e5Var.j;
                        if (wnVar != null) {
                            wnVar.run();
                        }
                        if (runnable2 != null) {
                            runnable2.run();
                            break;
                        }
                    } else {
                        int i32 = j6.a;
                        j6.sl = new SparseIntArray();
                        actionBarLayout.setThemeAnimationValue(0.0f);
                        wn wnVar2 = e5Var.i;
                        if (wnVar2 != null) {
                            wnVar2.run();
                        }
                        yn ynVar = e5Var.k;
                        actionBarLayout.g0 = ynVar;
                        if (ynVar != null) {
                            bo boVar = ynVar.a;
                            boVar.V.x0.invalidate();
                            boVar.I.I = 0.0f;
                            boVar.J.I = 0.0f;
                            boVar.k(0.0f);
                        }
                        actionBarLayout.l0.lock();
                        AnimatorSet animatorSet = new AnimatorSet();
                        actionBarLayout.k0 = animatorSet;
                        animatorSet.addListener(new bi.u3(9, actionBarLayout, e5Var));
                        actionBarLayout.k0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                        actionBarLayout.k0.setDuration(e5Var.l);
                        actionBarLayout.k0.start();
                    }
                }
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 9:
                ((org.telegram.ui.e1) obj2).a(0, false);
                org.telegram.ui.Components.d5.f0(i17, (TLRPC.TL_error) obj3, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                break;
            case 10:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                String str4 = (String) obj;
                if (i17 == j4Var.W0) {
                    j4Var.d0(true);
                    j4Var.E = arrayList8;
                    j4Var.F = str4;
                    j4Var.u0[0].c.y.clear();
                    j4Var.u0[0].b.e1();
                    j4Var.W(0);
                    break;
                }
                break;
            case 11:
                d9 d9Var = (d9) obj2;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i17).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.e2.m(user2, false, userFull != null && userFull.video_calls_available, d9Var.getParentActivity(), userFull, AccountInstance.getInstance(i17));
                break;
            case 12:
                eo eoVar = (eo) obj3;
                eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(eoVar.T5), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i17), Boolean.valueOf(eoVar.S4));
                eoVar.A3 = null;
                break;
            case 13:
                eo eoVar2 = (eo) obj2;
                boolean[] zArr = (boolean[]) obj3;
                eo eoVar3 = (eo) obj;
                if (!zArr[0] && i17 == eoVar2.ic && eoVar2.F3 && !eoVar2.isFinishing()) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new vg(eoVar2, i13), 200L);
                    eoVar2.presentFragment(eoVar3);
                    if (eoVar2.x9() && !eoVar3.hideKeyboardOnShow() && (okVar = eoVar3.Y) != null && okVar.getEditField() != null) {
                        eoVar3.Y.getEditField().requestFocus();
                        break;
                    }
                }
                break;
            case 14:
                eo eoVar4 = (eo) obj2;
                eoVar4.getClass();
                eoVar4.h = ((MessagesStorage) obj3).getEncryptedChat(i17);
                ((CountDownLatch) obj).countDown();
                break;
            case 15:
                xj xjVar = (xj) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                bk bkVar = xjVar.n;
                bi.y1 y1Var = bkVar.s;
                if (i17 == xjVar.h) {
                    if (i17 != -1) {
                        s4.h0 adapter = y1Var.getAdapter();
                        xj xjVar2 = bkVar.F;
                        if (adapter != xjVar2) {
                            y1Var.setAdapter(xjVar2);
                        }
                    }
                    xjVar.d = arrayList9;
                    xjVar.e = arrayList10;
                    xjVar.l();
                    break;
                }
                break;
            case 16:
                wm wmVar = (wm) obj2;
                vm vmVar = (vm) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                xm xmVar = wmVar.P;
                ValueAnimator valueAnimator = xmVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                xmVar.J = null;
                wmVar.G = 0.0f;
                wmVar.f(vmVar, photoEntry, i17);
                wmVar.j();
                wmVar.i(xmVar.P, false);
                break;
            case 17:
                org.telegram.ui.Components.d5.G(((w70) obj2).e, (f6) obj3, new i2.s(i17, (po) obj, i14));
                break;
            case 18:
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) obj2;
                TLObject tLObject3 = (TLObject) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (p2Var3.getParentActivity() != null) {
                    if (tLObject3 instanceof Vector) {
                        Vector vector = (Vector) tLObject3;
                        ArrayList arrayList11 = new ArrayList();
                        for (int i33 = 0; i33 < vector.objects.size(); i33++) {
                            try {
                                arrayList11.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i33))));
                            } catch (Exception unused) {
                            }
                        }
                        k10Var = new k10(p2Var3, i17, arrayList11);
                    } else {
                        k10Var = new k10(p2Var3, i17, null);
                    }
                    k10Var.B0 = callback;
                    p2Var3.showDialog(k10Var);
                    break;
                }
                break;
            case 19:
                a40 a40Var = (a40) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                a40Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new my(a40Var, i17, new ArrayList(), i15));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i34 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i34];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList13 = new ArrayList();
                    int size4 = arrayList12.size();
                    int i35 = 0;
                    while (i35 < size4) {
                        TLObject tLObject4 = (TLObject) arrayList12.get(i35);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                        } else {
                            i35++;
                            str = null;
                            i16 = 0;
                        }
                        i10 = ((org.telegram.ui.ActionBar.h3) a40Var.w).currentAccount;
                        TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                        if (!UserObject.isUserSelf(user3)) {
                            String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = str;
                            }
                            char c11 = 0;
                            while (true) {
                                if (i16 < i34) {
                                    String str5 = strArr[i16];
                                    if (lowerCase2.startsWith(str5) || org.telegram.messenger.a2.w(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.a2.w(" ", str5, translitString2)))) {
                                        c11 = 1;
                                    } else {
                                        String publicUsername = UserObject.getPublicUsername(user3);
                                        if (publicUsername != null && publicUsername.startsWith(str5)) {
                                            c11 = 2;
                                        }
                                    }
                                    if (c11 != 0) {
                                        arrayList13.add(tLObject4);
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                        i35++;
                        str = null;
                        i16 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new my(a40Var, i17, arrayList13, 2));
                    break;
                }
                break;
            case 20:
                o40 o40Var = (o40) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                String str6 = (String) obj;
                int i36 = o40Var.N;
                ArrayList arrayList14 = o40Var.O;
                if (i17 == o40Var.T) {
                    boolean isEmpty = arrayList14.isEmpty();
                    o40Var.S = false;
                    if (tLObject5 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                        if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                            o40Var.W = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                        } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                            o40Var.W = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                        }
                        o40Var.Z = messages_messages2.next_rate;
                        MessagesController.getInstance(i36).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i36).putChats(messages_messages2.chats, false);
                        for (int i37 = 0; i37 < messages_messages2.messages.size(); i37++) {
                            MessageObject messageObject3 = new MessageObject(i36, messages_messages2.messages.get(i37), false, true);
                            messageObject3.setQuery(str6);
                            arrayList14.add(messageObject3);
                        }
                        o40Var.V = arrayList14.size() >= o40Var.W;
                        o40Var.W();
                    } else {
                        o40Var.V = true;
                        o40Var.W = arrayList14.size();
                    }
                    o40Var.N(true);
                    if (isEmpty) {
                        ((xn0) o40Var).c0.t0.h1(0, 0);
                        break;
                    }
                }
                break;
            case 21:
                rn0.c(((rn0) obj2).getContext(), i17, ((on0) obj3).a.g(), (f6) obj);
                break;
            case 22:
                xq0 xq0Var = (xq0) obj2;
                TLObject tLObject6 = (TLObject) obj3;
                String str7 = (String) obj;
                HashMap hashMap = xq0Var.v;
                if (i17 == xq0Var.y) {
                    xq0Var.x = 0;
                    if (tLObject6 instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject6;
                        MessagesController.getInstance(xq0Var.c).putUsers(webpagepreview.users, false);
                        MessagesController.getInstance(xq0Var.c).putChats(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                            if (webPage instanceof TLRPC.TL_webPage) {
                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                    xq0Var.w = webPage;
                                    break;
                                } else if (webPage instanceof TLRPC.TL_webPageEmpty) {
                                    xq0Var.w = null;
                                    if (xq0Var.b != 0) {
                                        xq0Var.b = 0;
                                        wq0 wq0Var = xq0Var.H;
                                        if (wq0Var != null) {
                                            ((yv) wq0Var).h(0);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                if (hashMap.size() > 5) {
                                    Iterator it = hashMap.keySet().iterator();
                                    while (it.hasNext() && hashMap.size() > 5) {
                                        it.next();
                                        it.remove();
                                    }
                                }
                                hashMap.put(str7, webPage);
                                xq0Var.w = webPage;
                                xq0.a(xq0Var.a[0], webPage, str7);
                                break;
                            }
                        }
                    }
                    webPage = null;
                    if (webPage instanceof TLRPC.TL_webPage) {
                    }
                }
                break;
            case 23:
                ((iv0) obj2).H0((MessageObject) obj3, (View) obj, i17, false);
                break;
            case 24:
                iv0.g((iv0) obj2, i17, (TL_stories.StoryItem) obj3, (String) obj);
                break;
            case 25:
                org.telegram.ui.Components.d5.f0(i17, (TLRPC.TL_error) obj3, ((iv0) obj2).v1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                break;
            case 26:
                du0 du0Var = (du0) obj3;
                ArrayList arrayList15 = (ArrayList) obj2;
                String str8 = (String) obj;
                iv0 iv0Var = du0Var.v;
                if (du0Var.h != 0) {
                    if (i17 == du0Var.n) {
                        int h10 = du0Var.h();
                        du0Var.f = arrayList15;
                        du0Var.s--;
                        int h11 = du0Var.h();
                        if (du0Var.s == 0 || h11 != 0) {
                            iv0Var.m1(false);
                        }
                        int i38 = 0;
                        while (true) {
                            au0[] au0VarArr = iv0Var.k0;
                            if (i38 < au0VarArr.length) {
                                au0 au0Var = au0VarArr[i38];
                                if (au0Var.F == du0Var.r) {
                                    if (du0Var.s == 0 && h11 == 0) {
                                        au0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str8));
                                        au0VarArr[i38].w.f.setVisibility(8);
                                        au0VarArr[i38].w.e(false, true);
                                    } else if (h10 == 0) {
                                        iv0Var.z(au0Var.h, 0, null);
                                    }
                                }
                                i38++;
                            } else {
                                du0Var.l();
                            }
                        }
                    }
                    du0Var.h = 0;
                    break;
                }
                break;
            case 27:
                zy0 zy0Var = (zy0) obj2;
                String[] strArr2 = (String[]) obj3;
                String str9 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList16 = new ArrayList();
                int i39 = zy0Var.a;
                MediaDataController.getInstance(i39).getEmojiSuggestions(strArr2, str9, true, new org.telegram.ui.Components.f2(zy0Var, this.b, str9, hashSet, arrayList16, 1), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i39).isPremium());
                break;
            case 28:
                zy0 zy0Var2 = (zy0) obj3;
                String str10 = (String) obj;
                ArrayList arrayList17 = (ArrayList) obj2;
                if (i17 == zy0Var2.I) {
                    zy0Var2.H = str10;
                    zy0Var2.G = 2;
                    arrayList17.remove(arrayList17.size() - 1);
                    if (arrayList17.isEmpty()) {
                        zy0Var2.x = true;
                        zy0Var2.f();
                        break;
                    } else {
                        zy0Var2.x = false;
                        zy0Var2.v = false;
                        zy0Var2.c();
                        ld ldVar = zy0Var2.d;
                        if (ldVar != null) {
                            ldVar.setVisibility(0);
                            zy0Var2.d.invalidate();
                        }
                        zy0Var2.w = arrayList17;
                        wy0 wy0Var = zy0Var2.f;
                        if (wy0Var != null) {
                            wy0Var.l();
                            break;
                        }
                    }
                }
                break;
            default:
                y11 y11Var = (y11) obj3;
                ArrayList arrayList18 = (ArrayList) obj2;
                ArrayList arrayList19 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = y11Var.r;
                q11 q11Var = editorAlert.c;
                if (i17 == y11Var.d) {
                    y11 y11Var2 = editorAlert.r;
                    if (q11Var.getAdapter() != y11Var2) {
                        editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                        q11Var.setAdapter(y11Var2);
                        y11Var2.l();
                    }
                    boolean z16 = !y11Var.e.isEmpty() && arrayList18.isEmpty();
                    boolean z17 = y11Var.e.isEmpty() && arrayList18.isEmpty();
                    if (z16) {
                        editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                    }
                    y11Var.e = arrayList18;
                    y11Var.f = arrayList19;
                    y11Var.l();
                    if (!z17 && !z16 && (i11 = editorAlert.F) > 0) {
                        editorAlert.h.h1(0, -i11);
                        editorAlert.F = -1000;
                    }
                    editorAlert.e.c();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q(fg.h0 h0Var, ArrayList arrayList, int i10, org.telegram.ui.Cells.u3 u3Var) {
        this.a = 2;
        this.d = h0Var;
        this.c = arrayList;
        this.b = i10;
        this.e = u3Var;
    }

    public /* synthetic */ q(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ q(Object obj, int i10, ArrayList arrayList, Serializable serializable, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = arrayList;
        this.e = serializable;
    }

    public /* synthetic */ q(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ q(Object obj, Object obj2, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = arrayList;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ q(eo eoVar, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.a = 12;
        this.d = eoVar;
        this.c = arrayList;
        this.e = arrayList2;
        this.b = i10;
    }

    public /* synthetic */ q(zy0 zy0Var, int i10, String str, ArrayList arrayList) {
        this.a = 28;
        this.d = zy0Var;
        this.b = i10;
        this.e = str;
        this.c = arrayList;
    }
}
