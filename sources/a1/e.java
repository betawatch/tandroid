package a1;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bg.e0;
import bg.g3;
import bg.h1;
import bg.l2;
import bg.z0;
import ch.k;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.upstream.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.n;
import d5.w;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.p;
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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.eb0;
import org.telegram.ui.qn;
import v0.i;
import w0.h;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.b, (p) this.c);
                return;
            case 2:
                af.f fVar = (af.f) this.b;
                ze.b bVar = (ze.b) this.c;
                if (((AtomicBoolean) fVar.e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 3:
                ViewGroup container = (ViewGroup) this.b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 4:
                ((i) this.b).onError(this.c);
                return;
            case 5:
                ((i) this.b).onResult((v0.p) this.c);
                return;
            case 6:
                bf.d dVar = (bf.d) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = dVar.e;
                        if (!dVar.f) {
                            dVar.f(false);
                            dVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj = arrayList2.get(i9);
                            i9++;
                            bf.c cVar = (bf.c) obj;
                            if (cVar.b != null && (document = cVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), cVar.b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = dVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList.size());
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TLRPC.Document document3 = arrayList.get(i10);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i10, str);
                            }
                            bf.c cVar2 = new bf.c();
                            cVar2.a = document3;
                            cVar2.b = str;
                            int i11 = dVar.d;
                            dVar.d = i11 + 1;
                            cVar2.c = i11;
                            arrayList2.add(cVar2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(dVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = dVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        bf.d.g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        bf.d.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    dVar.b();
                    return;
                }
                return;
            case 7:
                bf.d dVar2 = (bf.d) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    bf.c cVar3 = (bf.c) arrayList3.get(i12);
                    if (cVar3 != null && ((TextUtils.isEmpty(cVar3.b) || !new File(cVar3.b).exists()) && (document2 = cVar3.a) != null && ((pathToAttach = FileLoader.getInstance(dVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new e(8, dVar2, document2));
                    }
                }
                return;
            case 8:
                bf.d dVar3 = (bf.d) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(dVar3.c).loadFile(document4, document4, 0, 0);
                return;
            case 9:
                bf.e eVar = (bf.e) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i13 = eVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i13).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i13).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 10:
                ((l2) this.b).run((ArrayList) this.c);
                return;
            case 11:
                ((z0) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 12:
                ((eb0) this.b).run((ArrayList) this.c);
                return;
            case 13:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new e0(callback, smallGroupsParticipantsCount, 0));
                return;
            case 14:
                gc M = oc.a0((qn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 15:
                h1 h1Var = (h1) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                h1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, h1Var.X, Boolean.TRUE, prepaidGiveaway);
                return;
            case 16:
                g3.O((g3) this.b, (TLObject) this.c);
                return;
            case 17:
                ((c1.e) this.b).e().onError(((p) this.c).a);
                return;
            case 18:
                ((c1.e) this.b).e().onError((h) this.c);
                return;
            case 19:
                ((c1.e) this.b).e().onResult((v0.p) this.c);
                return;
            case 20:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i14 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 21:
                k kVar = (k) this.b;
                kVar.b.add((String) this.c);
                kVar.invalidate();
                return;
            case 22:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                android.support.v4.media.c cVar4 = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 23:
                n nVar = (n) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(nVar.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            case 24:
                d1.e eVar2 = (d1.e) this.b;
                v0.f fVar2 = (v0.f) this.c;
                i iVar = eVar2.f;
                if (iVar != null) {
                    iVar.onResult(fVar2);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 25:
                ((s) this.c).a(((w) this.b).g());
                return;
            case 26:
                ((bg.i) this.b).run((TLRPC.Chat) this.c);
                return;
            case 27:
                ((i) this.b).onError((w0.d) this.c);
                return;
            case 28:
                ((i) this.b).onResult((v0.f) this.c);
                return;
            default:
                e1.d dVar4 = (e1.d) this.b;
                v0.c cVar5 = (v0.c) this.c;
                i iVar2 = dVar4.f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar5);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}
