// default package

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class lj6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lj6(tx6 tx6Var, sw6 sw6Var, Runnable runnable) {
        this.a = (byte) 15;
        this.b = tx6Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yl6 yl6Var;
        long U;
        long S;
        float N;
        float f;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        q8a q8aVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        byte b = 3;
        switch (this.a) {
            case 0:
                ak6 ak6Var = (ak6) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                ak6Var.d0 = false;
                if (tL_error == null) {
                    sj6 l0 = ak6Var.l0();
                    ak6Var.k0.clear();
                    ak6Var.n0(l0);
                    break;
                }
                break;
            case 1:
                rj6 rj6Var = (rj6) this.b;
                TLObject tLObject = (TLObject) this.c;
                ak6 ak6Var2 = rj6Var.a;
                sj6 l02 = ak6Var2.l0();
                ak6Var2.j0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = ak6Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ak6Var2.getMessagesStorage().t1(ak6Var2.d.invitesCount, ak6Var2.n);
                }
                ak6Var2.n0(l02);
                break;
            case 2:
                cm6 cm6Var = (cm6) this.b;
                if (!((boolean[]) this.c)[0] && (yl6Var = cm6Var.R) != null) {
                    yl6Var.run();
                }
                cm6Var.R = null;
                break;
            case 3:
                MediaController mediaController = (MediaController) this.b;
                k47 k47Var = (k47) this.c;
                String[] strArr = MediaController.W1;
                mediaController.Q(k47Var, true);
                break;
            case 4:
                MediaController mediaController2 = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr2 = MediaController.W1;
                try {
                    int i = mediaController2.l0 + 1;
                    mediaController2.l0 = i;
                    ndc ndcVar = mediaController2.k0;
                    if (ndcVar != null) {
                        ndcVar.l0();
                    }
                    ndc ndcVar2 = new ndc(false, false);
                    mediaController2.k0 = ndcVar2;
                    ndcVar2.K = new de((Object) mediaController2, i, (byte) 10);
                    ndcVar2.i0(Uri.fromFile(file), "other");
                    mediaController2.k0.w0(3);
                    mediaController2.k0.g0();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    ndc ndcVar3 = mediaController2.k0;
                    if (ndcVar3 != null) {
                        ndcVar3.l0();
                        mediaController2.k0 = null;
                        return;
                    }
                    return;
                }
            case 5:
                j5 j5Var = (j5) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String[] strArr3 = MediaController.W1;
                bc4.G(j5Var.a).X(tL_document, null, 1, 1);
                break;
            case 6:
                ((MediaController) ((o04) this.b).b).y1.add((ByteBuffer) this.c);
                break;
            case 7:
                yy2 yy2Var = (yy2) this.b;
                k47 k47Var2 = (k47) this.c;
                MediaController mediaController3 = (MediaController) yy2Var.c;
                ndc ndcVar4 = mediaController3.j0;
                if ((ndcVar4 != null || mediaController3.F0 != null) && !mediaController3.h0) {
                    try {
                        ndc ndcVar5 = mediaController3.F0;
                        if (ndcVar5 != null) {
                            U = ndcVar5.U();
                            S = ((MediaController) yy2Var.c).F0.S();
                            if (S >= 0 && U > 0) {
                                float f2 = U;
                                N = ((MediaController) yy2Var.c).F0.N() / f2;
                                f = S / f2;
                                if (f >= 1.0f) {
                                    break;
                                }
                            }
                        } else {
                            U = ndcVar4.U();
                            S = ((MediaController) yy2Var.c).j0.S();
                            float f3 = U >= 0 ? S / U : 0.0f;
                            N = ((MediaController) yy2Var.c).j0.N() / U;
                            if (U != -9223372036854775807L && S >= 0 && ((MediaController) yy2Var.c).u0 == 0.0f) {
                                f = f3;
                            }
                        }
                        MediaController mediaController4 = (MediaController) yy2Var.c;
                        k47Var2.j0 = (int) (U / 1000);
                        k47Var2.b0 = f;
                        k47Var2.i0 = (int) (S / 1000);
                        k47Var2.e0 = S;
                        k47Var2.f0 = U;
                        k47Var2.g0 = N;
                        if (f >= 0.0f && mediaController4.o0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController5 = (MediaController) yy2Var.c;
                            if (elapsedRealtime - mediaController5.p0 >= 1000) {
                                String str = mediaController5.o0;
                                mediaController5.p0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new wn6(str, f, (byte) 0));
                            }
                        }
                        nm7.f(k47Var2.K1).k(nm7.e2, Integer.valueOf(k47Var2.e1()), Float.valueOf(f));
                        break;
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        return;
                    }
                }
                break;
            case 8:
                fo6 fo6Var = (fo6) this.b;
                k47 k47Var3 = (k47) this.c;
                TLRPC.Document F0 = k47Var3.F0();
                TLRPC.Document document = k47Var3.f3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    fo6Var.d.put(bc4.r(null, F0), k47Var3);
                    bc4.G(fo6Var.a.a).X(F0, k47Var3, 3, k47.Q5(k47Var3.k) ? 2 : 0);
                    break;
                }
                break;
            case 9:
                hs6 hs6Var = (hs6) this.b;
                TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
                try {
                    hs6Var.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    hs6Var.getMessagesStorage().b.beginTransaction();
                    hs6Var.getMessagesStorage().j1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
                    SQLitePreparedStatement executeFast = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
                    for (int i2 = 0; i2 < tL_contacts_topPeers.categories.size(); i2++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i2);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        int i3 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                        for (int i4 = 0; i4 < tL_topPeerCategoryPeers.peers.size(); i4++) {
                            TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i4);
                            executeFast.requery();
                            executeFast.bindLong(1, k47.B1(tL_topPeer.peer));
                            executeFast.bindInteger(2, i3);
                            executeFast.bindDouble(3, tL_topPeer.rating);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    }
                    executeFast.dispose();
                    hs6Var.getMessagesStorage().b.commitTransaction();
                    gm.c3(new vp6(hs6Var, (byte) 7));
                    break;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            case 10:
                boolean[] zArr = (boolean[]) this.b;
                zq6 zq6Var = (zq6) this.c;
                if (!zArr[0]) {
                    zq6Var.run();
                    zArr[0] = true;
                    break;
                }
                break;
            case 11:
                hs6 hs6Var2 = (hs6) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = hs6Var2.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        hs6Var2.N0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        gm.c3(new tp6(hs6Var2, tL_messages_stickerSet, (byte) 1));
                        break;
                    }
                } catch (Throwable th) {
                    fc4.g(th, true);
                    return;
                }
                break;
            case 12:
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                Runnable runnable = (Runnable) this.c;
                if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
                    gm.c3(runnable);
                    break;
                }
                break;
            case 13:
                us4 us4Var = (us4) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = ((hs6) us4Var.c).B0;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                break;
            case 14:
                jr jrVar = (jr) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = ((hs6) jrVar.d).B0;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                nm7.e().k(nm7.Y4, new Object[0]);
                break;
            case 15:
                tx6 tx6Var = (tx6) this.b;
                Runnable runnable2 = (Runnable) this.c;
                tx6Var.getClass();
                runnable2.run();
                break;
            case 16:
                tx6 tx6Var2 = (tx6) this.b;
                cf8 cf8Var = (cf8) this.c;
                ly6 ly6Var = tx6Var2.h;
                tx6Var2.t = cf8Var;
                go6 go6Var = new go6(tx6Var2, cf8Var);
                cf8Var.y(go6Var);
                tx6Var2.u = go6Var;
                try {
                    ly6Var.l.t(0, cf8Var);
                } catch (RemoteException e4) {
                    ncd.d("MediaSessionImpl", "Exception in using media1 API", e4);
                }
                ((bx6) ly6Var.p.b).a.setActive(true);
                tx6Var2.s = new ye8(cf8Var.U(), 0, cf8Var.R0(), cf8Var.Q0(), cf8Var.Q0(), 0, cf8Var.g(), cf8Var.x0(), cf8Var.F0(), cf8Var.B(), cf8Var.T0(), 0, cf8Var.m0(18) ? cf8Var.g0() : jt6.M, cf8Var.m0(22) ? cf8Var.D() : 1.0f, 1.0f, cf8Var.m0(21) ? cf8Var.F() : o00.i, 0, cf8Var.m0(28) ? cf8Var.h0() : g53.d, cf8Var.H(), cf8Var.m0(23) ? cf8Var.l() : 0, cf8Var.m0(23) && cf8Var.z0(), cf8Var.s(), 1, cf8Var.v0(), cf8Var.h(), cf8Var.i(), cf8Var.f(), cf8Var.U0(), cf8Var.O0(), cf8Var.X(), cf8Var.x(), cf8Var.m0(30) ? cf8Var.f0() : g0c.b, cf8Var.G0());
                tx6Var2.f(cf8Var.q());
                break;
            case 17:
                ao5 ao5Var = (ao5) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    q8aVar = (q8a) ao5Var.a;
                    jte.l(q8aVar, "SessionResult must not be null");
                } catch (InterruptedException e5) {
                    e = e5;
                    ncd.g("MediaSessionLegacyStub", "Custom command failed", e);
                    q8aVar = new q8a(-1);
                } catch (CancellationException e6) {
                    ncd.g("MediaSessionLegacyStub", "Custom command cancelled", e6);
                    q8aVar = new q8a(1);
                } catch (ExecutionException e7) {
                    e = e7;
                    ncd.g("MediaSessionLegacyStub", "Custom command failed", e);
                    q8aVar = new q8a(-1);
                }
                resultReceiver.send(q8aVar.a, q8aVar.b);
                break;
            case 18:
                ((fu2) this.b).accept((vz6) this.c);
                break;
            case 19:
                i02 i02Var = (i02) this.b;
                l7 l7Var = (l7) this.c;
                i02Var.v0(true);
                l7Var.requestFocus();
                gm.c3(new ys5(l7Var, b));
                break;
            case 20:
                x07 x07Var = (x07) this.b;
                l07 l07Var = (l07) this.c;
                int i5 = x07Var.k;
                d dVar = x07Var.g;
                TLRPC.TL_chatInviteImporter importer = l07Var.getImporter();
                x07Var.r = importer;
                LongSparseArray longSparseArray = x07Var.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    dVar.getMessagesController().c4(user, false, false);
                    Point point = gm.q;
                    boolean z = point.x > point.y;
                    if (user.photo != null && !z) {
                        if (x07Var.s == null) {
                            w07 w07Var = new w07(x07Var, dVar.getParentActivity(), (r59) l07Var.getParent(), dVar.getResourceProvider(), x07Var.a);
                            x07Var.s = w07Var;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = x07Var.r;
                            bf0 avatarImageView = l07Var.getAvatarImageView();
                            TextView textView = w07Var.e;
                            tr8 tr8Var = w07Var.h;
                            w07Var.r = tL_chatInviteImporter;
                            w07Var.w = avatarImageView;
                            TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(tL_chatInviteImporter.user_id));
                            gn5 m = gn5.m(i5, 0, W1);
                            gn5 m2 = gn5.m(i5, 1, W1);
                            if (oc7.r1(i5).X1(tL_chatInviteImporter.user_id) == null) {
                                oc7.r1(i5).k3(0, W1, false);
                            }
                            tr8Var.setParentAvatarImage(avatarImageView);
                            tr8Var.M(tL_chatInviteImporter.user_id, true);
                            tr8Var.H(null, m, m2, true);
                            w07Var.d.setText(m9c.r((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            w07Var.E.requestLayout();
                            x07Var.s.setOnDismissListener(new n1(x07Var, (byte) 26));
                            x07Var.s.show();
                            break;
                        }
                    } else {
                        x07Var.b = true;
                        dVar.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        dVar.presentFragment(profileActivity);
                        break;
                    }
                }
                break;
            case 21:
                k47 k47Var4 = (k47) this.b;
                k47Var4.n = (TLRPC.Document) this.c;
                nm7.f(k47Var4.K1).k(nm7.B1, k47Var4);
                break;
            case 22:
                t67 t67Var = (t67) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (t67Var.getParentActivity() != null) {
                    Toast.makeText(t67Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 23:
                oc7 oc7Var = (oc7) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                oc7Var.i1.clear();
                oc7Var.p1.clear();
                oc7Var.d4(updates_difference.users, false);
                oc7Var.X3(updates_difference.chats, false);
                break;
            case 24:
                oc7 oc7Var2 = (oc7) this.b;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) this.c;
                long[] X1 = oc7Var2.getMessagesStorage().X1(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                if (X1 != null) {
                    gm.c3(new fp6((Object) oc7Var2, (Object) X1, (Object) tL_updateMessageID, (byte) 17));
                    break;
                }
                break;
            case 25:
                oc7 oc7Var3 = (oc7) this.b;
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) this.c;
                oc7Var3.getNotificationCenter().k(76, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                break;
            case 26:
                oc7 oc7Var4 = (oc7) this.b;
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) this.c;
                oc7Var4.getNotificationCenter().k(nm7.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.FALSE);
                break;
            case 27:
                oc7 oc7Var5 = (oc7) this.b;
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) this.c;
                oc7Var5.getNotificationCenter().k(nm7.H2, Long.valueOf(tL_updateDeleteGroupCallMessages.call.id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                break;
            case 28:
                oc7 oc7Var6 = (oc7) this.b;
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) this.c;
                oc7Var6.getNotificationCenter().k(nm7.X4, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                break;
            default:
                oc7 oc7Var7 = (oc7) this.b;
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) this.c;
                oc7Var7.getNotificationCenter().k(nm7.X4, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                break;
        }
    }

    public /* synthetic */ lj6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
