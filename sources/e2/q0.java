package e2;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Geocoder;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bi.ce;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import di.s6;
import di.s8;
import fi.a7;
import fi.ac;
import fi.e6;
import fi.f8;
import fi.l2;
import fi.n9;
import fi.o6;
import fi.o7;
import fi.q2;
import fi.q6;
import fi.s1;
import fi.u1;
import fi.w7;
import fi.z6;
import fi.zb;
import hi.m3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.ds;
import sg.c2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        int i10;
        int i11;
        int i12;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i13 = 0;
        switch (this.a) {
            case 0:
                n4.s sVar = (n4.s) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                synchronized (sVar) {
                    if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) sVar.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 1:
                ea.c cVar = (ea.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    m5.t.a().d.e(cVar.h.a.b(j5.d.c), 1);
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 2:
                ei.v vVar = (ei.v) this.b;
                String str = (String) this.c;
                ArrayList arrayList = vVar.f;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                    } else if (!TextUtils.equals(((s6) arrayList.get(i13)).E, str)) {
                        i13++;
                    }
                }
                if (i13 >= 0) {
                    vVar.r.d(str.hashCode(), i13 + 1);
                    return;
                }
                return;
            case 3:
                fi.d dVar = (fi.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i14 = dVar.I - 1;
                dVar.I = i14;
                dVar.b(i14, true);
                if (dVar.I > 0) {
                    AndroidUtilities.runOnUIThread(dVar.J, 1000L);
                    return;
                } else {
                    dVar.setClickable(true);
                    gVar.run();
                    return;
                }
            case 4:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                return;
            case 5:
                s1 s1Var = (s1) this.b;
                TLObject tLObject = (TLObject) this.c;
                u1 u1Var = s1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    l2 l2Var = u1Var.r;
                    i10 = ((k3) l2Var).currentAccount;
                    MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                    i11 = ((k3) l2Var).currentAccount;
                    MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                    i12 = ((k3) l2Var).currentAccount;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                s1Var.n = true;
                s1Var.G();
                return;
            case 6:
                ((q2) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
            case 7:
                e6 e6Var = (e6) this.b;
                View view = (View) this.c;
                e6Var.getClass();
                if (view instanceof sg.j) {
                    sg.j jVar = (sg.j) view;
                    jVar.m();
                    e6Var.A0(jVar, true);
                    return;
                }
                return;
            case 8:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        return;
                    }
                    tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                    tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 9:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                return;
            case 10:
                o6.a((o6) this.b, (w7) this.c);
                return;
            case 11:
                a8.h0 h0Var = (a8.h0) this.b;
                w7 w7Var = (w7) this.c;
                o6 o6Var = (o6) h0Var.d;
                Bitmap bitmap = o6Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (w7Var.M0 == o6Var.a) {
                        w7Var.M0 = null;
                    }
                    o6Var.a = null;
                    o6Var.invalidate();
                    return;
                }
                return;
            case 12:
                fi.s6 s6Var = (fi.s6) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = s6Var.a;
                x1 x1Var = new x1();
                x1Var.a = 256;
                atomicReference.set(new s8.n(new t2(context, x1Var)));
                s6Var.a(s6Var.f);
                return;
            case 13:
                ((fi.s6) this.b).c.run((q6) this.c);
                return;
            case 14:
                fi.p pVar = (fi.p) this.b;
                c2 c2Var = (c2) this.c;
                a7 a7Var = pVar.a;
                if (c2Var.getWidth() <= 0) {
                    a7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new s8(pVar, 24)).start();
                    return;
                }
                float width = c2Var.getWidth() / a7Var.getWidth();
                ValueAnimator valueAnimator = pVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.w.addUpdateListener(new z6(pVar, a7Var.getScaleX(), width, ((c2Var.getWidth() / 2.0f) + c2Var.getX()) - ((a7Var.getWidth() / 2.0f) + a7Var.getX()), ((c2Var.getHeight() / 2.0f) + c2Var.getY()) - ((a7Var.getHeight() / 2.0f) + a7Var.getY()), 0));
                pVar.w.addListener(new ce(5, pVar, c2Var));
                pVar.w.setDuration(320L);
                pVar.w.setInterpolator(ds.h);
                pVar.v = c2Var;
                pVar.w.start();
                return;
            case 15:
                o7.T((o7) this.b, (TLObject) this.c);
                return;
            case 16:
                o7 o7Var = (o7) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                o7Var.K0 = false;
                o7Var.b0.addAll(arrayList2);
                o7Var.p0.O(true);
                return;
            case 17:
                w7 w7Var2 = (w7) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                w7Var2.e1 = 0;
                if (tLObject2 instanceof Vector) {
                    w7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject2;
                    for (int i15 = 0; i15 < vector.objects.size(); i15++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i15);
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
                            w7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 18:
                f8.R((f8) this.b, (TLObject) this.c);
                return;
            case 19:
                f8 f8Var = (f8) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) f8Var.getContext().getSystemService("clipboard");
                e3 e3Var = f8Var.Y.d;
                if ((TextUtils.isEmpty(e3Var.getText()) || TextUtils.equals(e3Var.getText(), "https://") || TextUtils.isEmpty(e3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    i13 = 1;
                }
                wh.q(textView.animate().alpha(i13 != 0 ? 1.0f : 0.0f).scaleX(i13 != 0 ? 1.0f : 0.7f).scaleY(i13 == 0 ? 0.7f : 1.0f), ds.h, 300L);
                return;
            case 20:
                n9 n9Var = (n9) this.b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new q0(21, n9Var, smallGroupsParticipantsCount));
                return;
            case 21:
                n9 n9Var2 = (n9) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (n9Var2.P == null) {
                    n9Var2.P = new HashMap();
                }
                n9Var2.P.putAll(hashMap);
                return;
            case 22:
                fi.d dVar2 = (fi.d) this.b;
                Runnable runnable = (Runnable) this.c;
                if (dVar2 != null) {
                    dVar2.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                ac acVar = (ac) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (!acVar.k || acVar.i) {
                    return;
                }
                acVar.d.add(new zb(acVar, bitmap2));
                acVar.k = false;
                acVar.n.invalidate();
                return;
            case 24:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i16 = iArr[0];
                if (i16 != 0) {
                    connectionsManager.cancelRequest(i16, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 25:
                ((j0) this.b).e((Typeface) this.c);
                return;
            case 26:
                hi.k kVar = (hi.k) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    kVar.Y = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    kVar.a0 = starrefprogram;
                    if (starrefprogram == null) {
                        kVar.Y = true;
                        kVar.a0 = kVar.E0();
                        kVar.Z = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        kVar.Z = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = kVar.a0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                kVar.G0(true);
                return;
            case 27:
                qf.d.r(((hi.q) this.b).getContext(), (String) this.c);
                return;
            case 28:
                m3 m3Var = (m3) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                m3Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                m3Var.g(botappsettings, true);
                return;
            default:
                m3 m3Var2 = (m3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (m3Var2.d0) {
                    return;
                }
                if (tL_error != null) {
                    m3Var2.k(false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(m3Var2.u0, 60000L);
                    return;
                }
        }
    }
}
