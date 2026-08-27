package a1;

import a9.k;
import ag.f1;
import ag.g1;
import ag.i1;
import ag.p3;
import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import cg.b0;
import cg.d1;
import cg.e2;
import cg.v0;
import cg.y2;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.n;
import f2.k0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ib0;
import org.telegram.ui.rn;
import v0.i;
import v0.p;
import w0.h;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.b, (q) this.c);
                return;
            case 2:
                a9.a aVar = (a9.a) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 3:
                Callable callable = (Callable) this.b;
                k kVar = (k) ((a9.i) this.c).b;
                try {
                    kVar.k(callable.call());
                    return;
                } catch (Exception e9) {
                    kVar.l(e9);
                    return;
                }
            case 4:
                i1 i1Var = (i1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = i1Var.e0;
                zk0 zk0Var = i1Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i1Var.E0 = false;
                    i1Var.F0.b(i1Var.j0 + 4);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= zk0Var.getChildCount()) {
                            i10 = 0;
                        } else if (zk0Var.getChildAt(i11) instanceof g1) {
                            i10 = zk0Var.getChildAt(i11).getTop();
                        } else {
                            i11++;
                        }
                    }
                    i1Var.M1();
                    if (i1Var.h0 >= 0 && i10 != 0) {
                        ((k0) zk0Var.getLayoutManager()).h1(i1Var.h0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), i1Var.I0.b);
                i1Var.t0.g(max, false);
                i1Var.t0.setBagePosition(max / i1Var.I0.c);
                f1 f1Var = i1Var.t0;
                f1Var.D = true;
                f1Var.requestLayout();
                return;
            case 5:
                ((i1) this.b).m1((s80) this.c, true);
                return;
            case 6:
                p3 p3Var = (p3) this.b;
                AndroidUtilities.runOnUIThread(new e(7, p3Var, FileLoader.getInstance(p3Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 7:
                p3 p3Var2 = (p3) this.b;
                p3Var2.e = (File) this.c;
                p3Var2.a();
                return;
            case 8:
                ViewGroup container = (ViewGroup) this.b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 9:
                ((i) this.b).onError(this.c);
                return;
            case 10:
                ((i) this.b).onResult((p) this.c);
                return;
            case 11:
                bf.e eVar = (bf.e) this.b;
                af.b bVar = (af.b) this.c;
                if (((AtomicBoolean) eVar.e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 12:
                ((c1.e) this.b).e().onError(((q) this.c).a);
                return;
            case 13:
                ((c1.e) this.b).e().onError((h) this.c);
                return;
            case 14:
                ((c1.e) this.b).e().onResult((p) this.c);
                return;
            case 15:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i12 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 16:
                cf.d dVar = (cf.d) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = dVar.e;
                        if (!dVar.f) {
                            dVar.f(false);
                            dVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            cf.c cVar = (cf.c) obj;
                            if (cVar.b != null && (document = cVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), cVar.b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = dVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            cf.c cVar2 = new cf.c();
                            cVar2.a = document3;
                            cVar2.b = str;
                            int i15 = dVar.d;
                            dVar.d = i15 + 1;
                            cVar2.c = i15;
                            arrayList3.add(cVar2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(dVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = dVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        cf.d.g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        cf.d.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    dVar.b();
                    return;
                }
                return;
            case 17:
                cf.d dVar2 = (cf.d) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    cf.c cVar3 = (cf.c) arrayList4.get(i16);
                    if (cVar3 != null && ((TextUtils.isEmpty(cVar3.b) || !new File(cVar3.b).exists()) && (document2 = cVar3.a) != null && ((pathToAttach = FileLoader.getInstance(dVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new e(18, dVar2, document2));
                    }
                }
                return;
            case 18:
                cf.d dVar3 = (cf.d) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(dVar3.c).loadFile(document4, document4, 0, 0);
                return;
            case 19:
                cf.e eVar2 = (cf.e) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i17 = eVar2.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i17).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i17).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 20:
                ((e2) this.b).run((ArrayList) this.c);
                return;
            case 21:
                ((v0) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 22:
                ((ib0) this.b).run((ArrayList) this.c);
                return;
            case 23:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new b0(callback, smallGroupsParticipantsCount, 0));
                return;
            case 24:
                ec M = mc.a0((rn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 25:
                d1 d1Var = (d1) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                d1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, d1Var.X, Boolean.TRUE, prepaidGiveaway);
                return;
            case 26:
                y2.P((y2) this.b, (TLObject) this.c);
                return;
            case 27:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                ga.c cVar4 = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 28:
                n nVar = (n) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(nVar.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            default:
                d1.e eVar3 = (d1.e) this.b;
                v0.f fVar = (v0.f) this.c;
                i iVar = eVar3.f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}
