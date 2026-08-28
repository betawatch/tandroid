package kh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Location;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.AudioRecordJNI;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.d31;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i9;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                Runnable runnable = (Runnable) this.c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ec ecVar = (ec) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (ecVar.k && !ecVar.i) {
                    ecVar.d.add(new dc(ecVar, bitmap));
                    ecVar.k = false;
                    ecVar.n.invalidate();
                    break;
                }
                break;
            case 2:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i10 = iArr[0];
                if (i10 != 0) {
                    connectionsManager.cancelRequest(i10, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 3:
                mh.l lVar = (mh.l) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    lVar.S = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    lVar.U = starrefprogram;
                    if (starrefprogram == null) {
                        lVar.S = true;
                        lVar.U = lVar.E0();
                        lVar.T = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        lVar.T = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = lVar.U;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                lVar.G0(true);
                break;
            case 4:
                mh.c3 c3Var = (mh.c3) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                c3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    c3Var.g(botappsettings, true);
                    break;
                }
                break;
            case 5:
                mh.c3 c3Var2 = (mh.c3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (!c3Var2.Y) {
                    if (tL_error != null) {
                        c3Var2.k(false);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(c3Var2.p0, 60000L);
                        break;
                    }
                }
                break;
            case 6:
                mh.c3 c3Var3 = (mh.c3) this.b;
                org.telegram.ui.Components.gc Q = new org.telegram.ui.Components.oc(c3Var3.l0, c3Var3.A).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q.j = 5000;
                Q.k(true);
                break;
            case 7:
                mh.u3 u3Var = (mh.u3) this.b;
                u3Var.getMessagesController().openApp((TLRPC.User) this.c, u3Var.getClassGuid());
                break;
            case 8:
                mh.u3 u3Var2 = (mh.u3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                u3Var2.getClass();
                u3Var2.presentFragment(qn.R9(connectedbotstarref.bot_id));
                break;
            case 9:
                mh.g4 g4Var = (mh.g4) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (!g4Var.P) {
                    if (tL_error2 != null) {
                        g4Var.b.dismiss();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(g4Var.Q, 60000L);
                        break;
                    }
                }
                break;
            case 10:
                mh.g4 g4Var2 = (mh.g4) this.b;
                org.telegram.ui.Components.gc Q2 = new org.telegram.ui.Components.oc(g4Var2.b.getContainer(), g4Var2.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                break;
            case 11:
                nh.r rVar = (nh.r) this.b;
                oh.e eVar = (oh.e) this.c;
                rVar.getClass();
                rVar.presentFragment(qn.R9(eVar.b.id));
                break;
            case 12:
                ((nh.j0) this.b).s.presentFragment(qn.R9(((oh.e) this.c).b.id));
                break;
            case 13:
                of.c cVar = (of.c) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                int i11 = cVar.C;
                MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.w, location, false);
                break;
            case 14:
                of.f0 f0Var = (of.f0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i12 = f0Var.o0;
                ArrayList arrayList = f0Var.G;
                f0Var.O = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        f0Var.l();
                        break;
                    }
                } else if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i12).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    f0Var.l();
                    break;
                }
                break;
            case 15:
                of.f0 f0Var2 = (of.f0) this.b;
                View view = (View) this.c;
                f0Var2.i0 = false;
                f0Var2.k0 = null;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 16:
                of.f0 f0Var3 = (of.f0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                f0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(f0Var3.o0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 17:
                of.o1 o1Var = (of.o1) this.b;
                String str = (String) this.c;
                o1Var.E = str;
                if (o1Var.r) {
                    o1Var.f.g(str, true, false, o1Var.s, o1Var.v, o1Var.x, o1Var.w, -1, 1);
                }
                int i13 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i13).contacts);
                o1Var.y = true;
                int i14 = o1Var.B;
                o1Var.B = i14 + 1;
                o1Var.A = i14;
                o1Var.l();
                Utilities.searchQueue.postRunnable(new mh.l4(o1Var, str, i14, arrayList2, i13, 1));
                break;
            case 18:
                of.v1 v1Var = (of.v1) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                int i15 = v1Var.m;
                try {
                    MessagesStorage.getInstance(i15).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i15).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList3.size() && i16 != 100) {
                            of.t1 t1Var = (of.t1) arrayList3.get(i16);
                            executeFast.requery();
                            executeFast.bindString(1, t1Var.a);
                            executeFast.bindInteger(2, t1Var.b);
                            executeFast.step();
                            i16++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i15).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i9 = 100; i9 < arrayList3.size(); i9++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((of.t1) arrayList3.get(i9)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i15).getDatabase().commitTransaction();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 19:
                ((VideoAds) this.b).lambda$showPremium$19((zf.x0) this.c);
                break;
            case 20:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                break;
            case 21:
                ((VideoAds) this.b).lambda$show$16((Utilities.Callback) this.c);
                break;
            case 22:
                d31.S((Context) this.b, null, false, (ih.j0) this.c, null);
                break;
            case 23:
                ((AudioRecordJNI) this.b).lambda$startThread$0((ByteBuffer) this.c);
                break;
            case 24:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                break;
            case 25:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                break;
            case 26:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                break;
            case 27:
                ((VoIPService) this.b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.c);
                break;
            case 28:
                ((VoIPService) this.b).lambda$createGroupInstance$71((String) this.c);
                break;
            default:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.j0) this.c);
                break;
        }
    }
}
