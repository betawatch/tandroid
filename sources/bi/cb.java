package bi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.dd0;
import org.telegram.ui.eo;
import org.telegram.ui.id0;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.wc0;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class cb implements kl0, OnFailureListener, q9.d, OnCompleteListener, Continuation, org.telegram.ui.ActionBar.c2, ll0, Utilities.Callback3Return, dd0, hi.q0, du, hi.l4, e2.n, e2.m, m4.k0, m4.g1, org.telegram.ui.Cells.v, qy, org.telegram.ui.v4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cb(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean J(wy wyVar) {
        return false;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        String str = (String) this.b;
        q9.a aVar = (q9.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.P1(u6Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override // e2.n
    public void a(Object obj, b2.q qVar) {
        j2.b bVar = (j2.b) obj;
        bVar.e((b2.b1) this.c, new n4.y(qVar, ((j2.e) this.b).e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r2.y = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.y = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.d = true;
        r1.setText(r2.y);
        r1 = r2.f;
        r1.setSelection(r1.getText().length());
        r2.d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r2.Y();
        r2.a.Y2.N(true);
        r2.U(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.E != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.R : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.E = true;
        r1 = r3.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.dd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        gg.k1 k1Var = (gg.k1) this.b;
        id0 id0Var = (id0) this.c;
        k1Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(k1Var.y)) {
            wc0 wc0Var = id0Var.T;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        int i12;
        long clientUserId;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        org.telegram.ui.ActionBar.f6 f6Var6;
        org.telegram.ui.ActionBar.f6 f6Var7;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.f6 f6Var8;
        int i15;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i16;
        org.telegram.ui.ActionBar.f6 f6Var9;
        int i17 = i10;
        switch (this.a) {
            case 0:
                kb kbVar = (kb) this.b;
                Context context = (Context) this.c;
                ArrayList arrayList2 = kbVar.L;
                a0.i iVar = kbVar.b;
                db dbVar = kbVar.x;
                ArrayList arrayList3 = kbVar.c;
                HashMap hashMap = kbVar.d;
                rb rbVar = kbVar.W;
                if (i17 >= 0 && i17 < arrayList2.size()) {
                    pa paVar = (pa) arrayList2.get(i17);
                    int i18 = paVar.a;
                    int i19 = 0;
                    if (i18 != 3) {
                        if (i18 != 7) {
                            if (i18 == 9) {
                                int i20 = paVar.q;
                                if (i20 != 0) {
                                    if (i20 != 1) {
                                        if (i20 != 5) {
                                            if (i20 == 6) {
                                                rbVar.G = false;
                                                kbVar.g(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = kbVar.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context2, 3, f6Var);
                                            d2Var.q(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = rbVar.c;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            i11 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new wa(kbVar, d2Var, getgroupcallstreamrtmpurl, 0));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = rbVar.c;
                                        if (inputPeer2 != null) {
                                            clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                                        } else {
                                            i12 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                                        }
                                        f6Var2 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                        w70 F = w70.F(kbVar, f6Var2, view);
                                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new va(kbVar, clientUserId, 0), false);
                                        F.k();
                                        w70.f(F, rbVar.i1().B(clientUserId, true), rbVar.v, false, null, new y2(4, kbVar, F));
                                        F.Z();
                                        break;
                                    }
                                } else {
                                    tb tbVar = rbVar.c0;
                                    if (tbVar != null) {
                                        tbVar.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof org.telegram.ui.Cells.s8) {
                            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                            s8Var.setChecked(!s8Var.b());
                            paVar.k = s8Var.b();
                            int i21 = paVar.c;
                            if (i21 != 0) {
                                if (i21 != 1) {
                                    if (i21 == 2) {
                                        rbVar.w = s8Var.b();
                                        kbVar.g(true);
                                        break;
                                    }
                                } else {
                                    boolean b10 = s8Var.b();
                                    rbVar.y = b10;
                                    boolean z10 = rbVar.c instanceof TLRPC.TL_inputPeerChannel;
                                    if (b10) {
                                        org.telegram.ui.ActionBar.f3 f3Var = rbVar.container;
                                        f6Var4 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                        org.telegram.ui.Components.pc G = new org.telegram.ui.Components.wc(f3Var, f6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z10 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                                        G.j = 5000;
                                        G.k(true);
                                    } else {
                                        org.telegram.ui.ActionBar.f3 f3Var2 = rbVar.container;
                                        f6Var3 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                        org.telegram.ui.Components.pc G2 = new org.telegram.ui.Components.wc(f3Var2, f6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z10 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                                        G2.j = 5000;
                                        G2.k(true);
                                    }
                                    kbVar.g(true);
                                    break;
                                }
                            } else {
                                boolean b11 = s8Var.b();
                                rbVar.x = b11;
                                boolean z11 = rbVar.N == 4;
                                if (!b11) {
                                    org.telegram.ui.ActionBar.f3 f3Var3 = rbVar.container;
                                    f6Var5 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                    org.telegram.ui.Components.pc G3 = new org.telegram.ui.Components.wc(f3Var3, f6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z11 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                                    G3.j = 5000;
                                    G3.k(true);
                                    break;
                                } else {
                                    org.telegram.ui.ActionBar.f3 f3Var4 = rbVar.container;
                                    f6Var6 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                    org.telegram.ui.Components.pc G4 = new org.telegram.ui.Components.wc(f3Var4, f6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z11 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                                    G4.j = 5000;
                                    G4.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!paVar.n || !rbVar.F) {
                        int i22 = paVar.i;
                        if (i22 != 1) {
                            if (i22 != 3) {
                                if (i22 != 2) {
                                    if (i22 != 4) {
                                        if (i22 > 0) {
                                            arrayList3.clear();
                                            hashMap.clear();
                                            rbVar.N = paVar.i;
                                            dbVar.c.a();
                                        } else {
                                            TLRPC.Chat chat = paVar.h;
                                            if (chat != null) {
                                                long j3 = chat.id;
                                                if (rb.d1(rbVar, chat) > 200) {
                                                    try {
                                                        kbVar.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    Context context3 = kbVar.getContext();
                                                    f6Var7 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, f6Var7);
                                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.GroupTooLarge);
                                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                                    hc.b.A(R.string.OK, alertDialog$Builder, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j3))) {
                                                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                                    if (arrayList4 != null) {
                                                        int size = arrayList4.size();
                                                        while (i19 < size) {
                                                            Object obj = arrayList4.get(i19);
                                                            i19++;
                                                            iVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j3));
                                                    kbVar.i(true);
                                                } else {
                                                    i13 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j3));
                                                    i14 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j3);
                                                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                                                        org.telegram.ui.ActionBar.d2 d2Var2 = kbVar.G;
                                                        if (d2Var2 != null) {
                                                            d2Var2.dismiss();
                                                            kbVar.G = null;
                                                        }
                                                        kbVar.H = j3;
                                                        Context context4 = kbVar.getContext();
                                                        f6Var8 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                                        org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(context4, 3, f6Var8);
                                                        kbVar.G = d2Var3;
                                                        d2Var3.q(50L);
                                                        i15 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                                                        messagesStorage.getStorageQueue().postRunnable(new ua(kbVar, chat2, messagesStorage, j3, 0));
                                                    } else {
                                                        kbVar.d(j3, chatFull.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(kbVar.I)) {
                                                        dbVar.setText("");
                                                        kbVar.I = null;
                                                        kbVar.g(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = paVar.g;
                                                if (user != null) {
                                                    if (kbVar.a == 0) {
                                                        rbVar.N = 0;
                                                    }
                                                    long j10 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList3);
                                                    if (arrayList3.contains(Long.valueOf(j10))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j10))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j10));
                                                        iVar.k(Boolean.FALSE, j10);
                                                    } else {
                                                        Iterator it2 = hashMap.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j10))) {
                                                                it2.remove();
                                                                hashSet.addAll((Collection) entry2.getValue());
                                                            }
                                                        }
                                                        hashSet.add(Long.valueOf(j10));
                                                        if (!TextUtils.isEmpty(kbVar.I)) {
                                                            dbVar.setText("");
                                                            kbVar.I = null;
                                                            kbVar.g(false);
                                                        }
                                                        iVar.k(Boolean.TRUE, j10);
                                                    }
                                                    arrayList3.clear();
                                                    arrayList3.addAll(hashSet);
                                                    kbVar.i(true);
                                                }
                                            }
                                        }
                                        kbVar.f(true);
                                        kbVar.e(true);
                                        dbVar.K = true;
                                        break;
                                    } else {
                                        if (rbVar.N == 4) {
                                            rbVar.M = 4;
                                            rbVar.b.D(1);
                                        }
                                        rbVar.N = 4;
                                        kbVar.f(true);
                                        break;
                                    }
                                } else {
                                    if (rbVar.N == 2) {
                                        rbVar.M = 2;
                                        rbVar.b.D(1);
                                    }
                                    rbVar.N = 2;
                                    kbVar.f(true);
                                    break;
                                }
                            } else {
                                if (rbVar.N == 3 || (rbVar.n.isEmpty() && rbVar.r.isEmpty())) {
                                    rbVar.M = 3;
                                    rbVar.b.D(1);
                                }
                                rbVar.N = 3;
                                kbVar.f(true);
                                break;
                            }
                        } else {
                            if (rbVar.N == 1 || rb.J0(rbVar).isEmpty()) {
                                rbVar.M = 1;
                                rbVar.b.D(1);
                            }
                            rbVar.N = 1;
                            kbVar.f(true);
                            break;
                        }
                    } else {
                        i16 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                        boolean z12 = rbVar.K;
                        TLRPC.InputPeer inputPeer3 = rbVar.c;
                        ta taVar = new ta(kbVar, 0);
                        f6Var9 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                        new ka(context, i16, z12, inputPeer3, taVar, f6Var9).show();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.b;
                org.telegram.ui.n3 n3Var = (org.telegram.ui.n3) this.c;
                if (j4Var.K == null || i17 - 1 >= 0) {
                    org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
                    if (s9Var != null) {
                        if (s9Var.y()) {
                            j4Var.O0.f(false);
                            break;
                        } else {
                            j4Var.O0.f(false);
                        }
                    }
                    org.telegram.ui.h4 adapter = n3Var.getAdapter();
                    if ((view instanceof org.telegram.ui.q3) && adapter.E != null) {
                        org.telegram.ui.q3 q3Var = (org.telegram.ui.q3) view;
                        if (j4Var.G0 == 0) {
                            if ((!q3Var.c || f7 >= view.getMeasuredWidth() / 2) && !q3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(j4Var.X).getUserOrChat("previews");
                                if (!(userOrChat instanceof TLRPC.TL_user)) {
                                    int i23 = UserConfig.selectedAccount;
                                    long j11 = adapter.E.id;
                                    j4Var.b0(true);
                                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                    tL_contacts_resolveUsername.username = "previews";
                                    j4Var.G0 = ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.le(j4Var, i23, j11));
                                    break;
                                } else {
                                    j4Var.P(adapter.E.id, (TLRPC.User) userOrChat);
                                    break;
                                }
                            }
                        }
                    } else if (i17 >= 0 && i17 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i17);
                        TL_iv.PageBlock z13 = org.telegram.ui.j4.z(pageBlock);
                        if (z13 instanceof org.telegram.ui.x3) {
                            z13 = ((org.telegram.ui.x3) z13).b;
                        }
                        if (!(z13 instanceof TL_iv.pageBlockChannel)) {
                            if (!(z13 instanceof org.telegram.ui.d4)) {
                                if (z13 instanceof TL_iv.pageBlockDetails) {
                                    View y3 = org.telegram.ui.j4.y(view);
                                    if (y3 instanceof org.telegram.ui.n1) {
                                        j4Var.d = null;
                                        j4Var.f = null;
                                        if (adapter.e.indexOf(pageBlock) >= 0) {
                                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z13;
                                            pageblockdetails.open = !pageblockdetails.open;
                                            int h = adapter.h();
                                            adapter.M();
                                            int abs = Math.abs(adapter.h() - h);
                                            org.telegram.ui.n1 n1Var = (org.telegram.ui.n1) y3;
                                            n1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                                            n1Var.invalidate();
                                            if (abs != 0) {
                                                if (!pageblockdetails.open) {
                                                    adapter.t(i17 + 1, abs);
                                                    break;
                                                } else {
                                                    adapter.s(i17 + 1, abs);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                org.telegram.ui.d4 d4Var = (org.telegram.ui.d4) z13;
                                j4Var.Q(d4Var.a.articles.get(d4Var.b).url, null, null);
                                break;
                            }
                        } else {
                            MessagesController.getInstance(j4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z13).channel), j4Var.M, 2);
                            j4Var.o(false, true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        return di.h4.B0((di.h4) this.b, (Context) this.c, view, i10);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.v4
    public void e(org.telegram.ui.d5 d5Var) {
        org.telegram.ui.nb nbVar = (org.telegram.ui.nb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = d5Var.ordinal();
        if (ordinal == 0) {
            nbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        org.telegram.ui.sb sbVar = nbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.p2 p2Var = sbVar.n;
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                p2Var.presentFragment(new eo(bundle));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 6:
                di.h4.y0((di.h4) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 8:
                fg.l1 l1Var = (fg.l1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                l1Var.getClass();
                zArr[0] = true;
                l1Var.Q();
                break;
            case 10:
                gg.b0.d(r3.currentAccount).a((gg.x) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
            case 25:
                org.telegram.ui.q4 q4Var = (org.telegram.ui.q4) this.b;
                View view = (View) this.c;
                q4Var.getClass();
                d2Var.dismiss();
                q4Var.W(view, true);
                break;
            case 27:
                org.telegram.ui.wb wbVar = (org.telegram.ui.wb) this.b;
                nf.f.o(wbVar.getParentActivity(), (String) this.c, true);
                break;
            default:
                org.telegram.ui.nd.V((org.telegram.ui.nd) this.b, (TLRPC.Chat) this.c);
                break;
        }
    }

    @Override // hi.q0
    public w70 g(hi.k1 k1Var) {
        of.b bVar = (of.b) this.b;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
        hi.s sVar = (hi.s) bVar.c;
        w70 w70Var = new w70(sVar, f6Var, k1Var, false, false, true);
        sVar.H = w70Var;
        return w70Var;
    }

    @Override // m4.k0
    public void h(m4.r rVar) {
        switch (this.a) {
            case 19:
                m4.l0 l0Var = (m4.l0) this.b;
                Bundle bundle = (Bundle) this.c;
                m4.b0 b0Var = l0Var.g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                b0Var.n(rVar);
                break;
            default:
                m4.l0 l0Var2 = (m4.l0) this.b;
                n4.l lVar = (n4.l) this.c;
                l0Var2.getClass();
                String str = lVar.a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    m4.l1 l1Var = l0Var2.g.t;
                    if (l1Var.m0(17)) {
                        b2.k1 w02 = l1Var.w0();
                        b2.j1 j1Var = new b2.j1();
                        for (int i10 = 0; i10 < w02.o(); i10++) {
                            if (TextUtils.equals(w02.m(i10, j1Var, 0L).c.a, str)) {
                                l1Var.R(i10);
                                break;
                            }
                        }
                        break;
                    } else {
                        e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // m4.g1
    public Object i(m4.b0 b0Var, m4.r rVar, int i10) {
        switch (this.a) {
            case 21:
                return b0Var.j() ? v7.o8.b(new m4.r1(-100)) : e2.d0.d0((i9.w) ((m4.g1) this.b).i(b0Var, rVar, i10), new androidx.car.app.utils.a(b0Var, rVar, (j2.h) this.c, 12));
            default:
                return b0Var.j() ? v7.o8.b(new m4.r1(-100)) : e2.d0.d0((i9.w) ((m4.g1) this.b).i(b0Var, rVar, i10), new androidx.car.app.utils.a(b0Var, rVar, (m4.f1) this.c, 13));
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 17:
                ((j2.b) obj).d((j2.a) this.b, (u2.c0) this.c);
                break;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.du
    public void j() {
        switch (this.a) {
            case 13:
                hi.m0 m0Var = (hi.m0) this.b;
                hi.l0 l0Var = (hi.l0) this.c;
                m0Var.i();
                l0Var.p0();
                break;
            default:
                hi.r5 r5Var = (hi.r5) this.b;
                hi.u5 u5Var = (hi.u5) this.c;
                TL_iv.pageTableCell pagetablecell = u5Var.b;
                if (pagetablecell != null) {
                    hi.l6.d(pagetablecell, u5Var.a.getText());
                }
                hi.f3 f3Var = r5Var.E;
                if (f3Var != null && r5Var.a != null) {
                    hi.z3.N1(f3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        w0.i gVar;
        switch (this.a) {
            case 1:
                c1.e eVar = (c1.e) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.i.e(e, "e");
                String str = ((e instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e.getMessage();
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str2);
                    }
                    gVar = new w0.h(str2, 2);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        gVar = new w0.k(str2);
                    }
                    gVar = new w0.h(str2, 2);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        gVar = new w0.j(str2);
                    }
                    gVar = new w0.h(str2, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal)) {
                    return;
                }
                eVar.f().execute(new c1.a(eVar, gVar, 0));
                return;
            default:
                d1.e eVar2 = (d1.e) this.b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.c;
                kotlin.jvm.internal.i.e(e, "e");
                String str3 = ((e instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e.getMessage();
                w0.d bVar = str3.equals("CREATE_CANCELED") ? new w0.b(str4) : str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(str4, 2);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = eVar2.g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, bVar, 1));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // hi.l4
    public void run(long j3) {
        hi.w3 w3Var = (hi.w3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        w3Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.b;
        String str = (String) this.c;
        synchronized (jVar) {
            ((a0.f) jVar.b).remove(str);
        }
        return task;
    }

    @Override // org.telegram.ui.qy
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        org.telegram.ui.b6 b6Var = (org.telegram.ui.b6) this.b;
        wy wyVar2 = (wy) this.c;
        ArrayList arrayList2 = b6Var.c;
        wyVar2.finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= b6Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) b6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) b6Var.d.get(i14);
                    break;
                }
                i14++;
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (b6Var.getMessagesController().getCacheByChatsController().getKeepMedia(b6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = b6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.e, b6Var.d);
        b6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((org.telegram.ui.a6) arrayList2.get(i16)).c != null && ((org.telegram.ui.a6) arrayList2.get(i16)).c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            b6Var.b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.n(5, b6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ cb(j2.a aVar, Object obj, long j3) {
        this.a = 18;
        this.b = aVar;
        this.c = obj;
    }

    public /* synthetic */ cb(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        gg.n nVar = (gg.n) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        nVar.w = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.d);
        gg.i iVar = nVar.n;
        nVar.x = document;
        iVar.setSticker(document);
        ((org.telegram.ui.Cells.s8) view).setValueSticker(document);
        nVar.e0(true);
        return Boolean.TRUE;
    }

    private final /* synthetic */ void k(View view, float f7, float f10) {
    }

    private final /* synthetic */ void l(View view, float f7, float f10) {
    }
}
