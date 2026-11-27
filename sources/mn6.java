// default package

import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import android.widget.Toast;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class mn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mn6(yx6 yx6Var, xw6 xw6Var, Runnable runnable) {
        this.a = (byte) 11;
        this.b = yx6Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long U;
        long S;
        float f;
        float f2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        gaa gaaVar;
        byte b = 18;
        byte b2 = 3;
        switch (this.a) {
            case 0:
                k5 k5Var = (k5) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String[] strArr = MediaController.W1;
                xb4.G(k5Var.a).X(tL_document, null, 1, 1);
                break;
            case 1:
                MediaController mediaController = (MediaController) this.b;
                r47 r47Var = (r47) this.c;
                String[] strArr2 = MediaController.W1;
                mediaController.U(r47Var, true);
                break;
            case 2:
                ((MediaController) ((zz3) this.b).b).y1.add((ByteBuffer) this.c);
                break;
            case 3:
                iy2 iy2Var = (iy2) this.b;
                r47 r47Var2 = (r47) this.c;
                MediaController mediaController2 = (MediaController) iy2Var.c;
                kfc kfcVar = mediaController2.j0;
                if ((kfcVar != null || mediaController2.F0 != null) && !mediaController2.h0) {
                    try {
                        kfc kfcVar2 = mediaController2.F0;
                        if (kfcVar2 != null) {
                            U = kfcVar2.U();
                            S = ((MediaController) iy2Var.c).F0.S();
                            if (S >= 0 && U > 0) {
                                float f3 = U;
                                f2 = ((MediaController) iy2Var.c).F0.N() / f3;
                                f = S / f3;
                                if (f >= 1.0f) {
                                    break;
                                }
                            }
                        } else {
                            U = kfcVar.U();
                            S = ((MediaController) iy2Var.c).j0.S();
                            f = U >= 0 ? S / U : 0.0f;
                            float N = ((MediaController) iy2Var.c).j0.N() / U;
                            if (U != -9223372036854775807L && S >= 0 && ((MediaController) iy2Var.c).u0 == 0.0f) {
                                f2 = N;
                            }
                        }
                        MediaController mediaController3 = (MediaController) iy2Var.c;
                        r47Var2.j0 = (int) (U / 1000);
                        r47Var2.b0 = f;
                        r47Var2.i0 = (int) (S / 1000);
                        r47Var2.e0 = S;
                        r47Var2.f0 = U;
                        r47Var2.g0 = f2;
                        if (f >= 0.0f && mediaController3.o0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController4 = (MediaController) iy2Var.c;
                            if (elapsedRealtime - mediaController4.p0 >= 1000) {
                                String str = mediaController4.o0;
                                mediaController4.p0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new bo6(str, f, (byte) 0));
                            }
                        }
                        jn7.f(r47Var2.K1).k(jn7.e2, Integer.valueOf(r47Var2.e1()), Float.valueOf(f));
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                break;
            case 4:
                jo6 jo6Var = (jo6) this.b;
                r47 r47Var3 = (r47) this.c;
                TLRPC.Document F0 = r47Var3.F0();
                TLRPC.Document document = r47Var3.f3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    jo6Var.d.put(xb4.r(null, F0), r47Var3);
                    xb4.G(jo6Var.a.a).X(F0, r47Var3, 3, r47.Q5(r47Var3.k) ? 2 : 0);
                    break;
                }
                break;
            case 5:
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                Runnable runnable = (Runnable) this.c;
                if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
                    hl.c3(runnable);
                    break;
                }
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.b;
                fr6 fr6Var = (fr6) this.c;
                if (!zArr[0]) {
                    fr6Var.run();
                    zArr[0] = true;
                    break;
                }
                break;
            case 7:
                ls6 ls6Var = (ls6) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = ls6Var.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (!queryFinalized.next() || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        tL_messages_stickerSet = null;
                    } else {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        ls6Var.N0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        hl.c3(new mp6(ls6Var, tL_messages_stickerSet, r12));
                        break;
                    }
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
                break;
            case 8:
                ls6 ls6Var2 = (ls6) this.b;
                TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
                try {
                    ls6Var2.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    ls6Var2.getMessagesStorage().b.beginTransaction();
                    ls6Var2.getMessagesStorage().n1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
                    SQLitePreparedStatement executeFast = ls6Var2.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
                    for (int i = 0; i < tL_contacts_topPeers.categories.size(); i++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        int i2 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                        for (int i3 = 0; i3 < tL_topPeerCategoryPeers.peers.size(); i3++) {
                            TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i3);
                            executeFast.requery();
                            executeFast.bindLong(1, r47.B1(tL_topPeer.peer));
                            executeFast.bindInteger(2, i2);
                            executeFast.bindDouble(3, tL_topPeer.rating);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    }
                    executeFast.dispose();
                    ls6Var2.getMessagesStorage().b.commitTransaction();
                    hl.c3(new ip6(ls6Var2, (byte) 6));
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 9:
                xs4 xs4Var = (xs4) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = ((ls6) xs4Var.c).B0;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                break;
            case 10:
                kq kqVar = (kq) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = ((ls6) kqVar.d).B0;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                jn7.e().k(jn7.X4, new Object[0]);
                break;
            case 11:
                yx6 yx6Var = (yx6) this.b;
                Runnable runnable2 = (Runnable) this.c;
                yx6Var.getClass();
                runnable2.run();
                break;
            case 12:
                yx6 yx6Var2 = (yx6) this.b;
                og8 og8Var = (og8) this.c;
                qy6 qy6Var = yx6Var2.h;
                yx6Var2.t = og8Var;
                ko6 ko6Var = new ko6(yx6Var2, og8Var);
                og8Var.y(ko6Var);
                yx6Var2.u = ko6Var;
                try {
                    qy6Var.l.t(0, og8Var);
                } catch (RemoteException e3) {
                    efd.d("MediaSessionImpl", "Exception in using media1 API", e3);
                }
                ((gx6) qy6Var.p.b).a.setActive(true);
                yx6Var2.s = new kg8(og8Var.U(), 0, og8Var.R0(), og8Var.Q0(), og8Var.Q0(), 0, og8Var.f(), og8Var.x0(), og8Var.F0(), og8Var.B(), og8Var.T0(), 0, og8Var.m0(18) ? og8Var.g0() : nt6.M, og8Var.m0(22) ? og8Var.D() : 1.0f, 1.0f, og8Var.m0(21) ? og8Var.F() : oz.i, 0, og8Var.m0(28) ? og8Var.h0() : n43.d, og8Var.H(), og8Var.m0(23) ? og8Var.l() : 0, og8Var.m0(23) && og8Var.z0(), og8Var.s(), 1, og8Var.v0(), og8Var.h(), og8Var.i(), og8Var.e(), og8Var.U0(), og8Var.O0(), og8Var.X(), og8Var.x(), og8Var.m0(30) ? og8Var.f0() : f2c.b, og8Var.G0());
                yx6Var2.f(og8Var.q());
                break;
            case 13:
                do5 do5Var = (do5) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    gaaVar = (gaa) do5Var.a;
                    yve.l(gaaVar, "SessionResult must not be null");
                } catch (InterruptedException e4) {
                    e = e4;
                    efd.g("MediaSessionLegacyStub", "Custom command failed", e);
                    gaaVar = new gaa(-1);
                } catch (CancellationException e5) {
                    efd.g("MediaSessionLegacyStub", "Custom command cancelled", e5);
                    gaaVar = new gaa(1);
                } catch (ExecutionException e6) {
                    e = e6;
                    efd.g("MediaSessionLegacyStub", "Custom command failed", e);
                    gaaVar = new gaa(-1);
                }
                resultReceiver.send(gaaVar.a, gaaVar.b);
                break;
            case 14:
                ((ot2) this.b).accept((zz6) this.c);
                break;
            case 15:
                nz1 nz1Var = (nz1) this.b;
                m7 m7Var = (m7) this.c;
                nz1Var.w0(true);
                m7Var.requestFocus();
                hl.c3(new ct5(m7Var, b2));
                break;
            case 16:
                e17 e17Var = (e17) this.b;
                s07 s07Var = (s07) this.c;
                int i4 = e17Var.k;
                e eVar = e17Var.g;
                TLRPC.TL_chatInviteImporter importer = s07Var.getImporter();
                e17Var.r = importer;
                LongSparseArray longSparseArray = e17Var.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    eVar.getMessagesController().i4(user, false, false);
                    Point point = hl.q;
                    boolean z = point.x > point.y;
                    if (user.photo != null && !z) {
                        if (e17Var.s == null) {
                            d17 d17Var = new d17(e17Var, eVar.getParentActivity(), (d79) s07Var.getParent(), eVar.getResourceProvider(), e17Var.a);
                            e17Var.s = d17Var;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e17Var.r;
                            de0 avatarImageView = s07Var.getAvatarImageView();
                            TextView textView = d17Var.e;
                            et8 et8Var = d17Var.h;
                            d17Var.r = tL_chatInviteImporter;
                            d17Var.w = avatarImageView;
                            TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(tL_chatInviteImporter.user_id));
                            jn5 m = jn5.m(i4, 0, X1);
                            jn5 m2 = jn5.m(i4, 1, X1);
                            if (uc7.s1(i4).Y1(tL_chatInviteImporter.user_id) == null) {
                                uc7.s1(i4).o3(0, X1, false);
                            }
                            et8Var.setParentAvatarImage(avatarImageView);
                            et8Var.M(tL_chatInviteImporter.user_id, true);
                            et8Var.H(null, m, m2, true);
                            d17Var.d.setText(lbc.r((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? (byte) 8 : (byte) 0);
                            d17Var.E.requestLayout();
                            e17Var.s.setOnDismissListener(new o1(e17Var, (byte) 26));
                            e17Var.s.show();
                            break;
                        }
                    } else {
                        e17Var.b = true;
                        eVar.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        eVar.presentFragment(profileActivity);
                        break;
                    }
                }
                break;
            case 17:
                r47 r47Var4 = (r47) this.b;
                r47Var4.n = (TLRPC.Document) this.c;
                jn7.f(r47Var4.K1).k(jn7.B1, r47Var4);
                break;
            case 18:
                z67 z67Var = (z67) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (z67Var.getParentActivity() != null) {
                    Toast.makeText(z67Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 19:
                uc7 uc7Var = (uc7) this.b;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) this.c;
                long[] c2 = uc7Var.getMessagesStorage().c2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                if (c2 != null) {
                    hl.c3(new yg6(uc7Var, c2, tL_updateMessageID, b));
                    break;
                }
                break;
            case 20:
                uc7 uc7Var2 = (uc7) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                uc7Var2.i1.clear();
                uc7Var2.p1.clear();
                uc7Var2.j4(updates_difference.users, false);
                uc7Var2.c4(updates_difference.chats, false);
                break;
            case 21:
                uc7 uc7Var3 = (uc7) this.b;
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) this.c;
                uc7Var3.getNotificationCenter().k(76, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                break;
            case 22:
                uc7 uc7Var4 = (uc7) this.b;
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) this.c;
                uc7Var4.getNotificationCenter().k(jn7.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.FALSE);
                break;
            case 23:
                uc7 uc7Var5 = (uc7) this.b;
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) this.c;
                uc7Var5.getNotificationCenter().k(jn7.H2, Long.valueOf(tL_updateDeleteGroupCallMessages.call.id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                break;
            case 24:
                uc7 uc7Var6 = (uc7) this.b;
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) this.c;
                uc7Var6.getNotificationCenter().k(jn7.W4, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                break;
            case 25:
                uc7 uc7Var7 = (uc7) this.b;
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) this.c;
                uc7Var7.getNotificationCenter().k(jn7.W4, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                break;
            case 26:
                uc7 uc7Var8 = (uc7) this.b;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) this.c;
                uc7Var8.j4(tL_channels_channelParticipant.users, false);
                uc7Var8.c4(tL_channels_channelParticipant.chats, false);
                break;
            case 27:
                ((uc7) this.b).getNotificationCenter().k(76, 4, ((TLRPC.TL_help_termsOfServiceUpdate) this.c).terms_of_service);
                break;
            case 28:
                uc7 uc7Var9 = (uc7) this.b;
                rj4 rj4Var = (rj4) this.c;
                if (rj4Var != null) {
                    rj4Var.run();
                }
                uc7Var9.getNotificationCenter().k(2, 2);
                uc7Var9.getNotificationCenter().k(40, new Object[0]);
                break;
            default:
                ((uc7) this.b).W2((TLRPC.TL_help_appConfig) this.c);
                break;
        }
    }

    public /* synthetic */ mn6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
