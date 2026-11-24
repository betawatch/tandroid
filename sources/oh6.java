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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class oh6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oh6(tv6 tv6Var, su6 su6Var, Runnable runnable) {
        this.a = (byte) 14;
        this.b = tv6Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vj6 vj6Var;
        long U;
        long S;
        float N;
        float f;
        TLRPC.StickerSet stickerSet;
        NativeByteBuffer byteBufferValue;
        o6a o6aVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        byte b = 3;
        switch (this.a) {
            case 0:
                ph6 ph6Var = (ph6) this.b;
                TLObject tLObject = (TLObject) this.c;
                yh6 yh6Var = ph6Var.a;
                qh6 k0 = yh6Var.k0();
                yh6Var.j0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = yh6Var.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    yh6Var.getMessagesStorage().t1(yh6Var.d.invitesCount, yh6Var.n);
                }
                yh6Var.m0(k0);
                break;
            case 1:
                zj6 zj6Var = (zj6) this.b;
                if (!((boolean[]) this.c)[0] && (vj6Var = zj6Var.R) != null) {
                    vj6Var.run();
                }
                zj6Var.R = null;
                break;
            case 2:
                MediaController mediaController = (MediaController) this.b;
                k27 k27Var = (k27) this.c;
                String[] strArr = MediaController.W1;
                mediaController.Q(k27Var, true);
                break;
            case 3:
                MediaController mediaController2 = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr2 = MediaController.W1;
                try {
                    int i = mediaController2.l0 + 1;
                    mediaController2.l0 = i;
                    lbc lbcVar = mediaController2.k0;
                    if (lbcVar != null) {
                        lbcVar.l0();
                    }
                    lbc lbcVar2 = new lbc(false, false);
                    mediaController2.k0 = lbcVar2;
                    lbcVar2.K = new dd((Object) mediaController2, i, (byte) 10);
                    lbcVar2.i0(Uri.fromFile(file), "other");
                    mediaController2.k0.w0(3);
                    mediaController2.k0.g0();
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    lbc lbcVar3 = mediaController2.k0;
                    if (lbcVar3 != null) {
                        lbcVar3.l0();
                        mediaController2.k0 = null;
                        return;
                    }
                    return;
                }
            case 4:
                j5 j5Var = (j5) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String[] strArr3 = MediaController.W1;
                ba4.G(j5Var.a).X(tL_document, null, 1, 1);
                break;
            case 5:
                ((MediaController) ((ez3) this.b).b).y1.add((ByteBuffer) this.c);
                break;
            case 6:
                ox2 ox2Var = (ox2) this.b;
                k27 k27Var2 = (k27) this.c;
                MediaController mediaController3 = (MediaController) ox2Var.c;
                lbc lbcVar4 = mediaController3.j0;
                if ((lbcVar4 != null || mediaController3.F0 != null) && !mediaController3.h0) {
                    try {
                        lbc lbcVar5 = mediaController3.F0;
                        if (lbcVar5 != null) {
                            U = lbcVar5.U();
                            S = ((MediaController) ox2Var.c).F0.S();
                            if (S >= 0 && U > 0) {
                                float f2 = U;
                                N = ((MediaController) ox2Var.c).F0.N() / f2;
                                f = S / f2;
                                if (f >= 1.0f) {
                                    break;
                                }
                            }
                        } else {
                            U = lbcVar4.U();
                            S = ((MediaController) ox2Var.c).j0.S();
                            float f3 = U >= 0 ? S / U : 0.0f;
                            N = ((MediaController) ox2Var.c).j0.N() / U;
                            if (U != -9223372036854775807L && S >= 0 && ((MediaController) ox2Var.c).u0 == 0.0f) {
                                f = f3;
                            }
                        }
                        MediaController mediaController4 = (MediaController) ox2Var.c;
                        k27Var2.j0 = (int) (U / 1000);
                        k27Var2.b0 = f;
                        k27Var2.i0 = (int) (S / 1000);
                        k27Var2.e0 = S;
                        k27Var2.f0 = U;
                        k27Var2.g0 = N;
                        if (f >= 0.0f && mediaController4.o0 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            MediaController mediaController5 = (MediaController) ox2Var.c;
                            if (elapsedRealtime - mediaController5.p0 >= 1000) {
                                String str = mediaController5.o0;
                                mediaController5.p0 = SystemClock.elapsedRealtime();
                                Utilities.e.c(new ul6(str, f, (byte) 0));
                            }
                        }
                        kk7.f(k27Var2.K1).k(kk7.d2, Integer.valueOf(k27Var2.e1()), Float.valueOf(f));
                        break;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                }
                break;
            case 7:
                em6 em6Var = (em6) this.b;
                k27 k27Var3 = (k27) this.c;
                TLRPC.Document F0 = k27Var3.F0();
                TLRPC.Document document = k27Var3.f3;
                if (document != null) {
                    F0 = document;
                }
                if (F0 != null) {
                    em6Var.d.put(ba4.r(null, F0), k27Var3);
                    ba4.G(em6Var.a.a).X(F0, k27Var3, 3, k27.Q5(k27Var3.k) ? 2 : 0);
                    break;
                }
                break;
            case 8:
                hq6 hq6Var = (hq6) this.b;
                TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.c;
                try {
                    hq6Var.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    hq6Var.getMessagesStorage().b.beginTransaction();
                    hq6Var.getMessagesStorage().j1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
                    SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
                    for (int i2 = 0; i2 < tL_contacts_topPeers.categories.size(); i2++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i2);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        int i3 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline ? 1 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp ? 2 : topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                        for (int i4 = 0; i4 < tL_topPeerCategoryPeers.peers.size(); i4++) {
                            TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i4);
                            executeFast.requery();
                            executeFast.bindLong(1, k27.B1(tL_topPeer.peer));
                            executeFast.bindInteger(2, i3);
                            executeFast.bindDouble(3, tL_topPeer.rating);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    }
                    executeFast.dispose();
                    hq6Var.getMessagesStorage().b.commitTransaction();
                    gl.d3(new un6(hq6Var, (byte) 7));
                    break;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                zo6 zo6Var = (zo6) this.c;
                if (!zArr[0]) {
                    zo6Var.run();
                    zArr[0] = true;
                    break;
                }
                break;
            case 10:
                hq6 hq6Var2 = (hq6) this.b;
                TLRPC.StickerSet stickerSet2 = (TLRPC.StickerSet) this.c;
                try {
                    SQLiteCursor queryFinalized = hq6Var2.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet2.id + "'", new Object[0]);
                    if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.hash != stickerSet2.hash) {
                        hq6Var2.N0(stickerSet2, false);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        gl.d3(new sn6(hq6Var2, tL_messages_stickerSet, (byte) 1));
                        break;
                    }
                } catch (Throwable th) {
                    fa4.g(th, true);
                    return;
                }
                break;
            case 11:
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                Runnable runnable = (Runnable) this.c;
                if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
                    gl.d3(runnable);
                    break;
                }
                break;
            case 12:
                tq4 tq4Var = (tq4) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = ((hq6) tq4Var.c).B0;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                break;
            case 13:
                jq jqVar = (jq) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = ((hq6) jqVar.d).B0;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                kk7.e().k(kk7.W4, new Object[0]);
                break;
            case 14:
                tv6 tv6Var = (tv6) this.b;
                Runnable runnable2 = (Runnable) this.c;
                tv6Var.getClass();
                runnable2.run();
                break;
            case 15:
                tv6 tv6Var2 = (tv6) this.b;
                ad8 ad8Var = (ad8) this.c;
                lw6 lw6Var = tv6Var2.h;
                tv6Var2.t = ad8Var;
                fm6 fm6Var = new fm6(tv6Var2, ad8Var);
                ad8Var.y(fm6Var);
                tv6Var2.u = fm6Var;
                try {
                    lw6Var.l.t(0, ad8Var);
                } catch (RemoteException e4) {
                    lad.d("MediaSessionImpl", "Exception in using media1 API", e4);
                }
                ((bv6) lw6Var.p.b).a.setActive(true);
                tv6Var2.s = new wc8(ad8Var.U(), 0, ad8Var.R0(), ad8Var.Q0(), ad8Var.Q0(), 0, ad8Var.g(), ad8Var.x0(), ad8Var.F0(), ad8Var.B(), ad8Var.T0(), 0, ad8Var.m0(18) ? ad8Var.g0() : jr6.M, ad8Var.m0(22) ? ad8Var.D() : 1.0f, 1.0f, ad8Var.m0(21) ? ad8Var.F() : nz.i, 0, ad8Var.m0(28) ? ad8Var.h0() : v33.d, ad8Var.H(), ad8Var.m0(23) ? ad8Var.i() : 0, ad8Var.m0(23) && ad8Var.z0(), ad8Var.s(), 1, ad8Var.v0(), ad8Var.h(), ad8Var.j(), ad8Var.d(), ad8Var.U0(), ad8Var.O0(), ad8Var.X(), ad8Var.x(), ad8Var.m0(30) ? ad8Var.f0() : eyb.b, ad8Var.G0());
                tv6Var2.f(ad8Var.q());
                break;
            case 16:
                am5 am5Var = (am5) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    o6aVar = (o6a) am5Var.a;
                    gre.l(o6aVar, "SessionResult must not be null");
                } catch (InterruptedException e5) {
                    e = e5;
                    lad.g("MediaSessionLegacyStub", "Custom command failed", e);
                    o6aVar = new o6a(-1);
                } catch (CancellationException e6) {
                    lad.g("MediaSessionLegacyStub", "Custom command cancelled", e6);
                    o6aVar = new o6a(1);
                } catch (ExecutionException e7) {
                    e = e7;
                    lad.g("MediaSessionLegacyStub", "Custom command failed", e);
                    o6aVar = new o6a(-1);
                }
                resultReceiver.send(o6aVar.a, o6aVar.b);
                break;
            case 17:
                ((us2) this.b).accept((vx6) this.c);
                break;
            case 18:
                vy1 vy1Var = (vy1) this.b;
                l7 l7Var = (l7) this.c;
                vy1Var.v0(true);
                l7Var.requestFocus();
                gl.d3(new ar5(l7Var, b));
                break;
            case 19:
                xy6 xy6Var = (xy6) this.b;
                ly6 ly6Var = (ly6) this.c;
                int i5 = xy6Var.k;
                d dVar = xy6Var.g;
                TLRPC.TL_chatInviteImporter importer = ly6Var.getImporter();
                xy6Var.r = importer;
                LongSparseArray longSparseArray = xy6Var.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    dVar.getMessagesController().Z3(user, false, false);
                    Point point = gl.q;
                    boolean z = point.x > point.y;
                    if (user.photo != null && !z) {
                        if (xy6Var.s == null) {
                            wy6 wy6Var = new wy6(xy6Var, dVar.getParentActivity(), (o39) ly6Var.getParent(), dVar.getResourceProvider(), xy6Var.a);
                            xy6Var.s = wy6Var;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = xy6Var.r;
                            be0 avatarImageView = ly6Var.getAvatarImageView();
                            TextView textView = wy6Var.e;
                            sp8 sp8Var = wy6Var.h;
                            wy6Var.r = tL_chatInviteImporter;
                            wy6Var.w = avatarImageView;
                            TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(tL_chatInviteImporter.user_id));
                            gl5 m = gl5.m(i5, 0, V1);
                            gl5 m2 = gl5.m(i5, 1, V1);
                            if (na7.q1(i5).W1(tL_chatInviteImporter.user_id) == null) {
                                na7.q1(i5).h3(0, V1, false);
                            }
                            sp8Var.setParentAvatarImage(avatarImageView);
                            sp8Var.M(tL_chatInviteImporter.user_id, true);
                            sp8Var.H(null, m, m2, true);
                            wy6Var.d.setText(l7c.q((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            wy6Var.E.requestLayout();
                            xy6Var.s.setOnDismissListener(new n1(xy6Var, (byte) 26));
                            xy6Var.s.show();
                            break;
                        }
                    } else {
                        xy6Var.b = true;
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
            case 20:
                k27 k27Var4 = (k27) this.b;
                k27Var4.n = (TLRPC.Document) this.c;
                kk7.f(k27Var4.K1).k(kk7.A1, k27Var4);
                break;
            case 21:
                s47 s47Var = (s47) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (s47Var.getParentActivity() != null) {
                    Toast.makeText(s47Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 22:
                na7 na7Var = (na7) this.b;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) this.c;
                long[] X1 = na7Var.getMessagesStorage().X1(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                if (X1 != null) {
                    gl.d3(new lo6((Object) na7Var, (Object) X1, (Object) tL_updateMessageID, (byte) 16));
                    break;
                }
                break;
            case 23:
                na7 na7Var2 = (na7) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                na7Var2.i1.clear();
                na7Var2.p1.clear();
                na7Var2.a4(updates_difference.users, false);
                na7Var2.U3(updates_difference.chats, false);
                break;
            case 24:
                na7 na7Var3 = (na7) this.b;
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) this.c;
                na7Var3.getNotificationCenter().k(75, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                break;
            case 25:
                na7 na7Var4 = (na7) this.b;
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) this.c;
                na7Var4.getNotificationCenter().k(kk7.G2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.FALSE);
                break;
            case 26:
                na7 na7Var5 = (na7) this.b;
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) this.c;
                na7Var5.getNotificationCenter().k(kk7.G2, Long.valueOf(tL_updateDeleteGroupCallMessages.call.id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                break;
            case 27:
                na7 na7Var6 = (na7) this.b;
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) this.c;
                na7Var6.getNotificationCenter().k(kk7.V4, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                break;
            case 28:
                na7 na7Var7 = (na7) this.b;
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) this.c;
                na7Var7.getNotificationCenter().k(kk7.V4, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                break;
            default:
                na7 na7Var8 = (na7) this.b;
                TL_update.TL_updateChannel tL_updateChannel = (TL_update.TL_updateChannel) this.c;
                na7Var8.getClass();
                na7Var8.H0(tL_updateChannel.channel_id, 1, 0L, null);
                break;
        }
    }

    public /* synthetic */ oh6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
