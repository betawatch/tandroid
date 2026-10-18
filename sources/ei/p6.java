package ei;

import ai.me;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10;
        int i11 = 0;
        switch (this.a) {
            case 0:
                androidx.biometric.e eVar = (androidx.biometric.e) this.b;
                a8 a8Var = (a8) this.c;
                r6 r6Var = (r6) eVar.d;
                Bitmap bitmap = r6Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (a8Var.M0 == r6Var.a) {
                        a8Var.M0 = null;
                    }
                    r6Var.a = null;
                    r6Var.invalidate();
                    break;
                }
                break;
            case 1:
                v6 v6Var = (v6) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = v6Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.t2(context, x1Var)));
                v6Var.a(v6Var.f);
                break;
            case 2:
                ((v6) this.b).c.run((t6) this.c);
                break;
            case 3:
                p pVar = (p) this.b;
                rg.b2 b2Var = (rg.b2) this.c;
                d7 d7Var = pVar.a;
                if (b2Var.getWidth() <= 0) {
                    d7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new com.google.firebase.messaging.s(pVar, 20)).start();
                    break;
                } else {
                    float width = b2Var.getWidth() / d7Var.getWidth();
                    ValueAnimator valueAnimator = pVar.w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pVar.w.addUpdateListener(new c7(pVar, d7Var.getScaleX(), width, ((b2Var.getWidth() / 2.0f) + b2Var.getX()) - ((d7Var.getWidth() / 2.0f) + d7Var.getX()), ((b2Var.getHeight() / 2.0f) + b2Var.getY()) - ((d7Var.getHeight() / 2.0f) + d7Var.getY()), 0));
                    pVar.w.addListener(new me(5, pVar, b2Var));
                    pVar.w.setDuration(320L);
                    pVar.w.setInterpolator(bs.h);
                    pVar.v = b2Var;
                    pVar.w.start();
                    break;
                }
            case 4:
                s7 s7Var = (s7) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                s7Var.L0 = false;
                s7Var.b0.addAll(arrayList);
                s7Var.q0.N(true);
                break;
            case 5:
                s7.S((s7) this.b, (TLObject) this.c);
                break;
            case 6:
                a8 a8Var2 = (a8) this.c;
                TLObject tLObject = (TLObject) this.b;
                a8Var2.e1 = 0;
                if (tLObject instanceof Vector) {
                    a8Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            a8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 7:
                j8.S((j8) this.b, (TLObject) this.c);
                break;
            case 8:
                j8 j8Var = (j8) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) j8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.g3 g3Var = j8Var.Y.b;
                boolean z10 = (TextUtils.isEmpty(g3Var.getText()) || TextUtils.equals(g3Var.getText(), "https://") || TextUtils.isEmpty(g3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                kk.t(textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f), bs.h, 300L);
                break;
            case 9:
                r9 r9Var = (r9) this.b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new p6(10, r9Var, smallGroupsParticipantsCount));
                    break;
                }
                break;
            case 10:
                r9 r9Var2 = (r9) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (r9Var2.P == null) {
                    r9Var2.P = new HashMap();
                }
                r9Var2.P.putAll(hashMap);
                break;
            case 11:
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
            case 12:
                ec ecVar = (ec) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (ecVar.k && !ecVar.i) {
                    ecVar.d.add(new dc(ecVar, bitmap2));
                    ecVar.k = false;
                    ecVar.n.invalidate();
                    break;
                }
                break;
            case 13:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i13 = iArr[0];
                if (i13 != 0) {
                    connectionsManager.cancelRequest(i13, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 14:
                gi.l lVar = (gi.l) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    lVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    lVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        lVar.W = true;
                        lVar.Y = lVar.G0();
                        lVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        lVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = lVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                lVar.I0(true);
                break;
            case 15:
                gi.d3 d3Var = (gi.d3) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                d3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    d3Var.g(botappsettings, true);
                    break;
                }
                break;
            case 16:
                gi.d3 d3Var2 = (gi.d3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (!d3Var2.c0) {
                    if (tL_error != null) {
                        d3Var2.k(false);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(d3Var2.t0, 60000L);
                        break;
                    }
                }
                break;
            case 17:
                gi.d3 d3Var3 = (gi.d3) this.b;
                org.telegram.ui.Components.qc Q = new xc(d3Var3.p0, d3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q.j = 5000;
                Q.k(true);
                break;
            case 18:
                gi.u3 u3Var = (gi.u3) this.b;
                u3Var.getMessagesController().openApp((TLRPC.User) this.c, u3Var.getClassGuid());
                break;
            case 19:
                gi.u3 u3Var2 = (gi.u3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                u3Var2.getClass();
                u3Var2.presentFragment(sn.W9(connectedbotstarref.bot_id));
                break;
            case 20:
                gi.f4 f4Var = (gi.f4) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (!f4Var.T) {
                    if (tL_error2 != null) {
                        f4Var.b.dismiss();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(f4Var.U, 60000L);
                        break;
                    }
                }
                break;
            case 21:
                gi.f4 f4Var2 = (gi.f4) this.b;
                org.telegram.ui.Components.qc Q2 = new xc(f4Var2.b.getContainer(), f4Var2.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                break;
            case 22:
                ((e2.j0) this.b).e((Typeface) this.c);
                break;
            case 23:
                hg.c cVar = (hg.c) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                int i14 = cVar.G;
                MessagesController.getInstance(i14).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.w, location, false);
                break;
            case 24:
                hg.h0 h0Var = (hg.h0) this.b;
                View view = (View) this.c;
                h0Var.m0 = false;
                h0Var.o0 = null;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 25:
                hg.h0 h0Var2 = (hg.h0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i15 = h0Var2.s0;
                ArrayList arrayList2 = h0Var2.K;
                h0Var2.S = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList2.isEmpty()) {
                        arrayList2.clear();
                        h0Var2.l();
                        break;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i15).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList2.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var2.l();
                    break;
                }
                break;
            case 26:
                hg.h0 h0Var3 = (hg.h0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(h0Var3.s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 27:
                hg.t1 t1Var = (hg.t1) this.b;
                String str = (String) this.c;
                t1Var.I = str;
                if (t1Var.r) {
                    t1Var.f.g(str, true, false, t1Var.s, t1Var.v, t1Var.x, t1Var.w, -1, 1);
                }
                int i16 = UserConfig.selectedAccount;
                ArrayList arrayList3 = new ArrayList(ContactsController.getInstance(i16).contacts);
                t1Var.y = true;
                int i17 = t1Var.F;
                t1Var.F = i17 + 1;
                t1Var.E = i17;
                t1Var.l();
                Utilities.searchQueue.postRunnable(new gi.m4(t1Var, str, i17, arrayList3, i16, 1));
                break;
            case 28:
                hg.a2 a2Var = (hg.a2) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int i18 = a2Var.m;
                try {
                    MessagesStorage.getInstance(i18).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i18).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i11 < arrayList4.size() && i11 != 100) {
                            hg.y1 y1Var = (hg.y1) arrayList4.get(i11);
                            executeFast.requery();
                            executeFast.bindString(1, y1Var.a);
                            executeFast.bindInteger(2, y1Var.b);
                            executeFast.step();
                            i11++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList4.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i18).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList4.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((hg.y1) arrayList4.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i18).getDatabase().commitTransaction();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                hi.r rVar = (hi.r) this.b;
                ii.e eVar2 = (ii.e) this.c;
                rVar.getClass();
                rVar.presentFragment(sn.W9(eVar2.b.id));
                break;
        }
    }

    public /* synthetic */ p6(a8 a8Var, TLObject tLObject) {
        this.a = 6;
        this.c = a8Var;
        this.b = tLObject;
    }
}
