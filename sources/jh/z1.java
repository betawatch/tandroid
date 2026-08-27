package jh;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lh.s9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ce;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dj;
import org.telegram.ui.dn;
import org.telegram.ui.dq;
import org.telegram.ui.fp;
import org.telegram.ui.gy;
import org.telegram.ui.hb;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.jp;
import org.telegram.ui.ko;
import org.telegram.ui.mb;
import org.telegram.ui.mf1;
import org.telegram.ui.pn;
import org.telegram.ui.qb;
import org.telegram.ui.rn;
import org.telegram.ui.we1;
import org.telegram.ui.xh;
import org.telegram.ui.xo;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements lh.u8, org.telegram.ui.ActionBar.a2, z8.d, qk0, rk0, org.telegram.ui.Cells.v, zx, org.telegram.ui.v4, org.telegram.ui.Components.x4, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, fj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, mf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 14:
                rn rnVar = (rn) this.b;
                Uri uri = (Uri) this.c;
                rnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(rnVar.getAccountInstance(), null, uri, rnVar.P5, rnVar.j5, rnVar.T3, rnVar.h5, null, null, null, null, 0, rnVar.l5, z10, i10, rnVar.N3, rnVar.C8());
                break;
            case 15:
            default:
                dn dnVar = (dn) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    dnVar.getClass();
                    break;
                } else {
                    dnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
            case 16:
                rn rnVar2 = (rn) this.b;
                rnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, rnVar2.P5, rnVar2.j5, rnVar2.T3, null, false, null, null, null, z10, i10, 0, null, false));
                rnVar2.U.setFieldText("");
                rnVar2.e9(false);
                break;
        }
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean K(gy gyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        return nh.s3.B0((nh.s3) this.b, (Context) this.c, view, i10);
    }

    @Override // org.telegram.ui.v4
    public void b(org.telegram.ui.d5 d5Var) {
        hb hbVar = (hb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = d5Var.ordinal();
        if (ordinal == 0) {
            hbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        mb mbVar = hbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.n2 n2Var = mbVar.n;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                n2Var.presentFragment(new rn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        int i12;
        long clientUserId;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        org.telegram.ui.ActionBar.c6 c6Var6;
        org.telegram.ui.ActionBar.c6 c6Var7;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.c6 c6Var8;
        int i15;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i16;
        org.telegram.ui.ActionBar.c6 c6Var9;
        int i17 = i10;
        switch (this.a) {
            case 4:
                lh.k9 k9Var = (lh.k9) this.b;
                Context context = (Context) this.c;
                ArrayList arrayList2 = k9Var.H;
                a0.h hVar = k9Var.b;
                lh.c9 c9Var = k9Var.x;
                ArrayList arrayList3 = k9Var.c;
                HashMap hashMap = k9Var.d;
                lh.q9 q9Var = k9Var.S;
                if (i17 >= 0 && i17 < arrayList2.size()) {
                    lh.x8 x8Var = (lh.x8) arrayList2.get(i17);
                    int i18 = x8Var.a;
                    int i19 = 0;
                    if (i18 != 3) {
                        if (i18 != 7) {
                            if (i18 == 9) {
                                int i20 = x8Var.q;
                                if (i20 != 0) {
                                    if (i20 != 1) {
                                        if (i20 != 5) {
                                            if (i20 == 6) {
                                                q9Var.C = false;
                                                k9Var.g(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = k9Var.getContext();
                                            c6Var = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                                            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context2, 3, c6Var);
                                            b2Var.q(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = q9Var.c;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            i11 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new cg.y(k9Var, b2Var, getgroupcallstreamrtmpurl, 12));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = q9Var.c;
                                        if (inputPeer2 != null) {
                                            clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                                        } else {
                                            i12 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                                        }
                                        c6Var2 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                                        b70 F = b70.F(k9Var, c6Var2, view);
                                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new cg.b2(k9Var, clientUserId, 9), false);
                                        F.k();
                                        b70.f(F, q9Var.i1().B(clientUserId, true), q9Var.v, false, null, new gh.d1(13, k9Var, F));
                                        F.Z();
                                        break;
                                    }
                                } else {
                                    s9 s9Var = q9Var.Y;
                                    if (s9Var != null) {
                                        s9Var.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof org.telegram.ui.Cells.l8) {
                            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                            l8Var.setChecked(!l8Var.b());
                            x8Var.k = l8Var.b();
                            int i21 = x8Var.c;
                            if (i21 != 0) {
                                if (i21 != 1) {
                                    if (i21 == 2) {
                                        q9Var.w = l8Var.b();
                                        k9Var.g(true);
                                        break;
                                    }
                                } else {
                                    boolean b10 = l8Var.b();
                                    q9Var.y = b10;
                                    boolean z10 = q9Var.c instanceof TLRPC.TL_inputPeerChannel;
                                    if (b10) {
                                        org.telegram.ui.ActionBar.c3 c3Var = q9Var.container;
                                        c6Var4 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                                        ec G = new mc(c3Var, c6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z10 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                                        G.j = 5000;
                                        G.k(true);
                                    } else {
                                        org.telegram.ui.ActionBar.c3 c3Var2 = q9Var.container;
                                        c6Var3 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                                        ec G2 = new mc(c3Var2, c6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z10 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                                        G2.j = 5000;
                                        G2.k(true);
                                    }
                                    k9Var.g(true);
                                    break;
                                }
                            } else {
                                boolean b11 = l8Var.b();
                                q9Var.x = b11;
                                boolean z11 = q9Var.J == 4;
                                if (!b11) {
                                    org.telegram.ui.ActionBar.c3 c3Var3 = q9Var.container;
                                    c6Var5 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                                    ec G3 = new mc(c3Var3, c6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z11 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                                    G3.j = 5000;
                                    G3.k(true);
                                    break;
                                } else {
                                    org.telegram.ui.ActionBar.c3 c3Var4 = q9Var.container;
                                    c6Var6 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                                    ec G4 = new mc(c3Var4, c6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z11 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                                    G4.j = 5000;
                                    G4.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!x8Var.n || !q9Var.B) {
                        int i22 = x8Var.i;
                        if (i22 != 1) {
                            if (i22 != 3) {
                                if (i22 != 2) {
                                    if (i22 != 4) {
                                        if (i22 > 0) {
                                            arrayList3.clear();
                                            hashMap.clear();
                                            q9Var.J = x8Var.i;
                                            c9Var.c.a();
                                        } else {
                                            TLRPC.Chat chat = x8Var.h;
                                            if (chat != null) {
                                                long j10 = chat.id;
                                                if (lh.q9.d1(q9Var, chat) > 200) {
                                                    try {
                                                        k9Var.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    Context context3 = k9Var.getContext();
                                                    c6Var7 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, c6Var7);
                                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.GroupTooLarge);
                                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.GroupTooLargeMessage);
                                                    i0.a.C(R.string.OK, alertDialog$Builder, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                                    if (arrayList4 != null) {
                                                        int size = arrayList4.size();
                                                        while (i19 < size) {
                                                            Object obj = arrayList4.get(i19);
                                                            i19++;
                                                            hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j10));
                                                    k9Var.i(true);
                                                } else {
                                                    i13 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                                                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                                                    i14 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                                                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j10);
                                                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                                                        org.telegram.ui.ActionBar.b2 b2Var2 = k9Var.C;
                                                        if (b2Var2 != null) {
                                                            b2Var2.dismiss();
                                                            k9Var.C = null;
                                                        }
                                                        k9Var.D = j10;
                                                        Context context4 = k9Var.getContext();
                                                        c6Var8 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                                                        org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(context4, 3, c6Var8);
                                                        k9Var.C = b2Var3;
                                                        b2Var3.q(50L);
                                                        i15 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                                                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                                                        messagesStorage.getStorageQueue().postRunnable(new hh.e2(k9Var, chat2, messagesStorage, j10, 12));
                                                    } else {
                                                        k9Var.d(j10, chatFull.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(k9Var.E)) {
                                                        c9Var.setText("");
                                                        k9Var.E = null;
                                                        k9Var.g(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = x8Var.g;
                                                if (user != null) {
                                                    if (k9Var.a == 0) {
                                                        q9Var.J = 0;
                                                    }
                                                    long j11 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList3);
                                                    if (arrayList3.contains(Long.valueOf(j11))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j11))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j11));
                                                        hVar.k(Boolean.FALSE, j11);
                                                    } else {
                                                        Iterator it2 = hashMap.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j11))) {
                                                                it2.remove();
                                                                hashSet.addAll((Collection) entry2.getValue());
                                                            }
                                                        }
                                                        hashSet.add(Long.valueOf(j11));
                                                        if (!TextUtils.isEmpty(k9Var.E)) {
                                                            c9Var.setText("");
                                                            k9Var.E = null;
                                                            k9Var.g(false);
                                                        }
                                                        hVar.k(Boolean.TRUE, j11);
                                                    }
                                                    arrayList3.clear();
                                                    arrayList3.addAll(hashSet);
                                                    k9Var.i(true);
                                                }
                                            }
                                        }
                                        k9Var.f(true);
                                        k9Var.e(true);
                                        c9Var.G = true;
                                        break;
                                    } else {
                                        if (q9Var.J == 4) {
                                            q9Var.I = 4;
                                            q9Var.b.D(1);
                                        }
                                        q9Var.J = 4;
                                        k9Var.f(true);
                                        break;
                                    }
                                } else {
                                    if (q9Var.J == 2) {
                                        q9Var.I = 2;
                                        q9Var.b.D(1);
                                    }
                                    q9Var.J = 2;
                                    k9Var.f(true);
                                    break;
                                }
                            } else {
                                if (q9Var.J == 3 || (q9Var.n.isEmpty() && q9Var.r.isEmpty())) {
                                    q9Var.I = 3;
                                    q9Var.b.D(1);
                                }
                                q9Var.J = 3;
                                k9Var.f(true);
                                break;
                            }
                        } else {
                            if (q9Var.J == 1 || lh.q9.J0(q9Var).isEmpty()) {
                                q9Var.I = 1;
                                q9Var.b.D(1);
                            }
                            q9Var.J = 1;
                            k9Var.f(true);
                            break;
                        }
                    } else {
                        i16 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                        boolean z12 = q9Var.G;
                        TLRPC.InputPeer inputPeer3 = q9Var.c;
                        lh.a9 a9Var = new lh.a9(k9Var, 0);
                        c6Var9 = ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider;
                        new lh.s8(context, i16, z12, inputPeer3, a9Var, c6Var9).show();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.b;
                org.telegram.ui.q3 q3Var = (org.telegram.ui.q3) this.c;
                if (m4Var.G == null || i17 - 1 >= 0) {
                    org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
                    if (j9Var != null) {
                        if (j9Var.y()) {
                            m4Var.K0.f(false);
                            break;
                        } else {
                            m4Var.K0.f(false);
                        }
                    }
                    org.telegram.ui.k4 adapter = q3Var.getAdapter();
                    if ((view instanceof org.telegram.ui.t3) && adapter.A != null) {
                        org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) view;
                        if (m4Var.C0 == 0) {
                            if ((!t3Var.c || f10 >= view.getMeasuredWidth() / 2) && !t3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(m4Var.T).getUserOrChat("previews");
                                if (!(userOrChat instanceof TLRPC.TL_user)) {
                                    int i23 = UserConfig.selectedAccount;
                                    long j12 = adapter.A.id;
                                    m4Var.b0(true);
                                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                    tL_contacts_resolveUsername.username = "previews";
                                    m4Var.C0 = ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_resolveUsername, new ce(m4Var, i23, j12));
                                    break;
                                } else {
                                    m4Var.P(adapter.A.id, (TLRPC.User) userOrChat);
                                    break;
                                }
                            }
                        }
                    } else if (i17 >= 0 && i17 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i17);
                        TL_iv.PageBlock z13 = org.telegram.ui.m4.z(pageBlock);
                        if (z13 instanceof org.telegram.ui.a4) {
                            z13 = ((org.telegram.ui.a4) z13).b;
                        }
                        if (!(z13 instanceof TL_iv.pageBlockChannel)) {
                            if (!(z13 instanceof org.telegram.ui.g4)) {
                                if (z13 instanceof TL_iv.pageBlockDetails) {
                                    View y10 = org.telegram.ui.m4.y(view);
                                    if (y10 instanceof org.telegram.ui.p1) {
                                        m4Var.d = null;
                                        m4Var.f = null;
                                        if (adapter.e.indexOf(pageBlock) >= 0) {
                                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z13;
                                            pageblockdetails.open = !pageblockdetails.open;
                                            int h = adapter.h();
                                            adapter.M();
                                            int abs = Math.abs(adapter.h() - h);
                                            org.telegram.ui.p1 p1Var = (org.telegram.ui.p1) y10;
                                            p1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                                            p1Var.invalidate();
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
                                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) z13;
                                m4Var.Q(g4Var.a.articles.get(g4Var.b).url, null, null);
                                break;
                            }
                        } else {
                            MessagesController.getInstance(m4Var.T).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z13).channel), m4Var.I, 2);
                            m4Var.o(false, true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // lh.u8
    public void d(lh.o9 o9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, lh.k7 k7Var, kh.c cVar) {
        switch (this.a) {
            case 0:
                e4 e4Var = (e4) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(e4Var.y2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = o9Var.b;
                ConnectionsManager.getInstance(e4Var.y2).sendRequest(tL_stories_editStory, new gh.f1(e4Var, k7Var, storyItem, o9Var, 6));
                break;
            default:
                x3 x3Var = (x3) this.b;
                lh.q9 q9Var = (lh.q9) this.c;
                e4 e4Var2 = x3Var.l;
                c4 c4Var = e4Var2.K1;
                TL_stories.StoryItem storyItem2 = c4Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    MessagesController.getInstance(e4Var2.y2).getStoriesController().o0(e4Var2.x1, e4Var2.r1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = c4Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(e4Var2.y2).sendRequest(togglegroupcallsettings, new cg.g0(11, x3Var, q9Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fj0
    public void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        xh xhVar = (xh) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        rn rnVar = xhVar.p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", rnVar.P5);
        rnVar.presentFragment(new ProfileActivity(bundle, null));
        rnVar.A7(true);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                x3 x3Var = (x3) this.b;
                d1 d1Var = ((i9) this.c).w0;
                if (d1Var == null) {
                    e4.f0(x3Var.l);
                    break;
                } else if (!d1Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = d1Var.f;
                    ConnectionsManager.getInstance(d1Var.e).sendRequest(discardgroupcall, new w0(d1Var, 4));
                    d1Var.e();
                    break;
                }
                break;
            case 5:
                nh.s3.y0((nh.s3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 9:
                org.telegram.ui.q4 q4Var = (org.telegram.ui.q4) this.b;
                View view = (View) this.c;
                q4Var.getClass();
                b2Var.dismiss();
                q4Var.W(view, true);
                break;
            case 11:
                we.e.o(((qb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 13:
                id.V((id) this.b, (TLRPC.Chat) this.c);
                break;
            case 23:
                xo xoVar = (xo) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                xoVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new ko(xoVar, 0), 64);
                break;
            case 27:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, b2Var);
                break;
            case 28:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            default:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i11 = iArr[0];
                intCallback.run(i11 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.mf1
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((dq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        pn pnVar = (pn) this.b;
        nb0 nb0Var = (nb0) this.c;
        Pair pair = (Pair) obj;
        pnVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.b4 b4Var = pnVar.f;
        if (b4Var == null || longValue != b4Var.i(pnVar.C ? 1 : 0) || bitmap == null) {
            return;
        }
        nb0Var.x = bitmap;
        nb0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        rn.g0((rn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // z8.d
    public Object u0(af.h hVar) {
        String str = (String) this.b;
        z8.a aVar = (z8.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.u0(hVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // org.telegram.ui.zx
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        org.telegram.ui.a6 a6Var = (org.telegram.ui.a6) this.b;
        gy gyVar2 = (gy) this.c;
        ArrayList arrayList2 = a6Var.c;
        gyVar2.finishFragment();
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
                if (i14 >= a6Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) a6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) a6Var.d.get(i14);
                    break;
                }
                i14++;
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (a6Var.getMessagesController().getCacheByChatsController().getKeepMedia(a6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = a6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.e, a6Var.d);
        a6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((org.telegram.ui.z5) arrayList2.get(i16)).c != null && ((org.telegram.ui.z5) arrayList2.get(i16)).c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            a6Var.b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(14, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ z1(hb hbVar, org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        this.a = 12;
        this.b = hbVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 22:
                jo joVar = (jo) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                joVar.getClass();
                b2Var.dismiss();
                joVar.J0 = false;
                if (j10 != 0) {
                    joVar.s0 = j10;
                    TLRPC.Chat chat = joVar.getMessagesController().getChat(Long.valueOf(j10));
                    joVar.t0 = chat;
                    TLRPC.ChatFull chatFull = joVar.u0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != joVar.D0;
                    joVar.getMessagesController().toggleChannelForum(joVar.s0, joVar.B0, joVar.D0);
                    TLRPC.Chat chat2 = joVar.t0;
                    chat2.forum = joVar.B0;
                    chat2.forum_tabs = joVar.D0;
                    if (z10) {
                        joVar.q0();
                        break;
                    }
                }
                break;
            case 23:
            default:
                fp fpVar = (fp) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j10 == 0) {
                    fpVar.getClass();
                    break;
                } else {
                    jp jpVar = fpVar.x.d;
                    if (jpVar.s) {
                        jpVar.v.set(0, jpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        jpVar.A = j10;
                        jpVar.f = jpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    break;
                }
            case 24:
                jp jpVar2 = (jp) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                if (j10 == 0) {
                    jpVar2.getClass();
                    break;
                } else {
                    jpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    jpVar2.Y(jpVar2.getMessagesController().getChat(Long.valueOf(j10)), n2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        dj djVar = (dj) this.b;
        long j10 = ((TLRPC.User) this.c).id;
        rn rnVar = djVar.b;
        long j11 = rnVar.Z3;
        if (j10 != j11) {
            return;
        }
        rnVar.qa(j11, false);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        FileLog.e("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }

    private final /* synthetic */ void i(View view, float f10, float f11) {
    }
}
