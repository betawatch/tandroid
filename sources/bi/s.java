package bi;

import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.StateSet;
import java.io.File;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.bj;
import org.telegram.ui.bt0;
import org.telegram.ui.cj;
import org.telegram.ui.dj;
import org.telegram.ui.eo;
import org.telegram.ui.pn;
import org.telegram.ui.vm;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        CharSequence charSequence;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        Object[] objArr = 0;
        final int i14 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                ((r) obj).run(Integer.valueOf(i14));
                break;
            case 1:
                ((Utilities.Callback) obj).run(Integer.valueOf(i14));
                break;
            case 2:
                ((f3) obj).p0(i14);
                break;
            case 3:
                MessagesController.getInstance(i14).putUsers((ArrayList) obj, true);
                break;
            case 4:
                ce ceVar = (ce) obj;
                int i15 = ceVar.c;
                ceVar.m();
                ceVar.X1 = false;
                File file = ceVar.K1.O0;
                if (file != null) {
                    file.delete();
                    ceVar.K1.O0 = null;
                }
                ceVar.W(ceVar.K1, true);
                CharSequence[] charSequenceArr = {ceVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i15).storyEntitiesAllowed() ? MediaDataController.getInstance(i15).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i15).storyEntitiesAllowed() ? MediaDataController.getInstance(i15).getEntities(new CharSequence[]{ceVar.K1.C0}, true) : new ArrayList<>();
                r9 r9Var = ceVar.K1;
                r9Var.k = (TextUtils.equals(r9Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                ceVar.K1.C0 = new SpannableString(ceVar.c1.getText());
                ceVar.z();
                ceVar.y();
                r9 r9Var2 = ceVar.K1;
                ceVar.O1 = (r9Var2 == null || !r9Var2.K) ? 0 : 1;
                ceVar.K1 = (r9) ceVar.H1.get(i14);
                ceVar.O(0, 1);
                ceVar.N(0, 1);
                ceVar.d1.b.Y2.N(false);
                ceVar.c1.setText(ceVar.K1.C0);
                break;
            case 5:
                ((c2.b) obj).b.onAudioFocusChange(i14);
                break;
            case 6:
                ((fg.h0) obj).m(i14);
                break;
            case 7:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i14).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i14).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                gh.h hVar = (gh.h) obj;
                hVar.getClass();
                try {
                    hVar.a.scrollBy(0, i14);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 9:
                hi.f0 f0Var = (hi.f0) obj;
                hi.i0 i0Var = f0Var.f;
                if (f0Var.c && i0Var.E != null && i0Var.a != null) {
                    f0Var.d = true;
                    f0Var.a.setPressed(false);
                    try {
                        f0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    hi.g0 g0Var = i0Var.E;
                    hi.a aVar = i0Var.a;
                    hi.z3 z3Var = ((hi.r3) g0Var).a;
                    z3Var.n3(false);
                    z3Var.h3.t(new hi.w3(z3Var, aVar, i14), f0Var);
                    break;
                }
                break;
            case 10:
                k2.j jVar = (k2.j) ((of.b) obj).c;
                String str = e2.d0.a;
                e2.c cVar = ((i2.b0) jVar).a.E;
                i2.v vVar = new i2.v(i14, i12);
                cVar.getClass();
                e2.d.g(Looper.myLooper() == ((e2.z) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new af(20, cVar, vVar));
                cVar.n(Integer.valueOf(i14));
                break;
            case 11:
                ((mh.a) obj).v0(i14, 0, null);
                break;
            case 12:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    try {
                        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: nf.b
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i14, true);
                            }
                        });
                        d2VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                ConnectionsManager.lambda$onUpdateConfig$21(i14, (TLRPC.TL_config) obj);
                break;
            case 14:
                MessagesController.getInstance(i14).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 15:
                ((org.telegram.ui.q4) ((org.telegram.ui.g) obj).b).V(i14, true);
                break;
            case 16:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                int i16 = t1Var.v7;
                if (i14 == i16) {
                    org.telegram.ui.Cells.e0 e0Var = (org.telegram.ui.Cells.e0) t1Var.o7.get(i16);
                    if (e0Var != null) {
                        org.telegram.ui.Cells.z zVar = e0Var.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!t1Var.y7.scheduled) {
                            if (e0Var.j != null) {
                                t1Var.k();
                            } else if (e0Var.i != null) {
                                t1Var.k();
                                org.telegram.ui.Cells.k1 k1Var = t1Var.Jc;
                                if (k1Var != null) {
                                    k1Var.F1(t1Var, e0Var.i);
                                }
                            }
                        }
                    }
                    t1Var.v7 = -1;
                    t1Var.a3();
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.ge) obj).f.c(i14);
                break;
            case 18:
                ((dj) obj).a.E(this.b, 0, 0, 0, true, true);
                break;
            case 19:
                eo eoVar = ((bj) obj).g;
                if (eoVar.wb == i14) {
                    eoVar.Ma();
                    break;
                }
                break;
            case 20:
                eo eoVar2 = ((cj) obj).g;
                if (eoVar2.wb == i14) {
                    eoVar2.Ma();
                    break;
                }
                break;
            case 21:
                eo eoVar3 = ((bj) obj).g;
                if (eoVar3.wb == i14) {
                    eoVar3.Ma();
                    break;
                }
                break;
            case 22:
                eo eoVar4 = ((cj) obj).g;
                if (eoVar4.wb == i14) {
                    eoVar4.Ma();
                    break;
                }
                break;
            case 23:
                eo eoVar5 = ((cj) obj).g;
                if (eoVar5.wb == i14) {
                    eoVar5.Ma();
                    break;
                }
                break;
            case 24:
                eo eoVar6 = ((vm) obj).J0;
                eoVar6.z0.h1(i14, eoVar6.y4);
                break;
            case 25:
                i10 = ((org.telegram.ui.ActionBar.p2) ((pn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i14, true);
                break;
            case 26:
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v1((MessagesStorage.BooleanCallback) obj, i13), 250L);
                break;
            case 27:
                m90 m90Var = (m90) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i14).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < privacyRules.size()) {
                            if (privacyRules.get(i17) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i17) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i17) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i17++;
                            }
                        }
                    }
                }
                m90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.o1(privacyRules, objArr == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            case 28:
                ((org.telegram.ui.Components.o8) obj).b(i14);
                break;
            default:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) obj;
                x4 x4Var = jdVar.d1;
                if (jdVar.b1 != i14) {
                    jdVar.setTimer(i14);
                    Utilities.Callback callback = jdVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i14));
                    }
                    if (i14 == 0) {
                        charSequence = LocaleController.getString(jdVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        x4Var.h = jdVar.getMeasuredWidth();
                        x4Var.p(false);
                        x4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x4Var.e0 = AndroidUtilities.dp(0);
                        x4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i14 == Integer.MAX_VALUE) {
                        charSequence = LocaleController.getString(jdVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        x4Var.h = jdVar.getMeasuredWidth();
                        x4Var.p(false);
                        x4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x4Var.e0 = AndroidUtilities.dp(0);
                        x4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i14 > 0) {
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(jdVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i14, new Object[0]));
                        x4Var.p(true);
                        x4Var.h = x4.a(replaceTags, x4Var.getTextPaint());
                        x4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        x4Var.e0 = AndroidUtilities.dp(2);
                        x4Var.d0 = 0.0f;
                        charSequence = replaceTags;
                    }
                    x4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), jdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (jdVar instanceof bt0 ? -1.0f : 1.0f));
                    x4Var.s(charSequence);
                    hj0 hj0Var = new hj0(i14 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    hj0Var.start();
                    x4Var.j(hj0Var);
                    x4Var.u();
                    jdVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(jdVar.p1);
                    jdVar.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
