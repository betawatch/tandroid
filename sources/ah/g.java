package ah;

import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import bi.l7;
import bi.u8;
import di.b7;
import di.o8;
import di.pc;
import di.t2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import ji.n3;
import ji.s3;
import ji.v3;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.u1;
import org.telegram.ui.aj;
import org.telegram.ui.bj;
import org.telegram.ui.co;
import org.telegram.ui.fe;
import org.telegram.ui.on;
import org.telegram.ui.q4;
import org.telegram.ui.um;
import org.telegram.ui.zi;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        int i12 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i13 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                i iVar = (i) obj;
                if (iVar.b) {
                    Utilities.Callback callback = iVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i13 < 300));
                        try {
                            iVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    iVar.c = true;
                    int max = Math.max(50, i13 - 100);
                    AndroidUtilities.runOnUIThread(new g((Object) iVar, max, (int) (objArr == true ? 1 : 0)), max);
                    break;
                }
                break;
            case 1:
                u8 u8Var = (u8) obj;
                ArrayList arrayList = u8Var.g;
                u8Var.v(arrayList);
                l7 l7Var = u8Var.J;
                Collections.sort(arrayList, l7Var);
                ArrayList arrayList2 = u8Var.h;
                u8Var.v(arrayList2);
                Collections.sort(arrayList2, l7Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 2:
                ((c2.b) obj).b.onAudioFocusChange(i13);
                break;
            case 3:
                ((di.o) obj).run(Integer.valueOf(i13));
                break;
            case 4:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                break;
            case 5:
                ((t2) obj).p0(i13);
                break;
            case 6:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                break;
            case 7:
                pc pcVar = (pc) obj;
                int i14 = pcVar.c;
                pcVar.m();
                pcVar.X1 = false;
                File file = pcVar.K1.O0;
                if (file != null) {
                    file.delete();
                    pcVar.K1.O0 = null;
                }
                pcVar.W(pcVar.K1, true);
                CharSequence[] charSequenceArr = {pcVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(new CharSequence[]{pcVar.K1.C0}, true) : new ArrayList<>();
                o8 o8Var = pcVar.K1;
                o8Var.k = (TextUtils.equals(o8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                pcVar.K1.C0 = new SpannableString(pcVar.c1.getText());
                pcVar.z();
                pcVar.y();
                o8 o8Var2 = pcVar.K1;
                pcVar.O1 = (o8Var2 == null || !o8Var2.K) ? 0 : 1;
                pcVar.K1 = (o8) pcVar.H1.get(i13);
                pcVar.O(0, 1);
                pcVar.N(0, 1);
                pcVar.d1.b.Y2.N(false);
                pcVar.c1.setText(pcVar.K1.C0);
                break;
            case 8:
                ((hg.i0) obj).m(i13);
                break;
            case 9:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                ih.h hVar = (ih.h) obj;
                hVar.getClass();
                try {
                    hVar.a.scrollBy(0, i13);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 11:
                ji.d0 d0Var = (ji.d0) obj;
                ji.g0 g0Var = d0Var.f;
                if (d0Var.c && g0Var.E != null && g0Var.a != null) {
                    d0Var.d = true;
                    d0Var.a.setPressed(false);
                    try {
                        d0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    ji.e0 e0Var = g0Var.E;
                    ji.a aVar = g0Var.a;
                    v3 v3Var = ((n3) e0Var).a;
                    v3Var.n3(false);
                    v3Var.h3.b(new s3(v3Var, aVar, i13), d0Var);
                    break;
                }
                break;
            case 12:
                k2.j jVar = (k2.j) ((n4.y) obj).c;
                String str = e2.d0.a;
                e2.c cVar = ((i2.c0) jVar).a.E;
                i2.w wVar = new i2.w(i13, 2);
                cVar.getClass();
                e2.d.g(Looper.myLooper() == ((e2.z) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new b7(17, cVar, wVar));
                cVar.n(Integer.valueOf(i13));
                break;
            case 13:
                b2[] b2VarArr = (b2[]) obj;
                b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    try {
                        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: of.b
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i13, true);
                            }
                        });
                        b2VarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 14:
                ((oh.a) obj).v0(i13, 0, null);
                break;
            case 15:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                break;
            case 16:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 17:
                ((q4) ((org.telegram.ui.g) obj).b).V(i13, true);
                break;
            case 18:
                t1 t1Var = (t1) obj;
                int i15 = t1Var.v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) t1Var.o7.get(i15);
                    if (e0Var2 != null) {
                        org.telegram.ui.Cells.z zVar = e0Var2.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (!t1Var.y7.scheduled) {
                            if (e0Var2.j != null) {
                                t1Var.k();
                            } else if (e0Var2.i != null) {
                                t1Var.k();
                                org.telegram.ui.Cells.k1 k1Var = t1Var.Jc;
                                if (k1Var != null) {
                                    k1Var.A1(t1Var, e0Var2.i);
                                }
                            }
                        }
                    }
                    t1Var.v7 = -1;
                    t1Var.a3();
                    break;
                }
                break;
            case 19:
                ((fe) obj).f.c(i13);
                break;
            case 20:
                ((bj) obj).a.F(this.b, 0, 0, 0, true, true);
                break;
            case 21:
                co coVar = ((zi) obj).g;
                if (coVar.wb == i13) {
                    coVar.Ma();
                    break;
                }
                break;
            case 22:
                co coVar2 = ((aj) obj).g;
                if (coVar2.wb == i13) {
                    coVar2.Ma();
                    break;
                }
                break;
            case 23:
                co coVar3 = ((zi) obj).g;
                if (coVar3.wb == i13) {
                    coVar3.Ma();
                    break;
                }
                break;
            case 24:
                co coVar4 = ((aj) obj).g;
                if (coVar4.wb == i13) {
                    coVar4.Ma();
                    break;
                }
                break;
            case 25:
                co coVar5 = ((aj) obj).g;
                if (coVar5.wb == i13) {
                    coVar5.Ma();
                    break;
                }
                break;
            case 26:
                co coVar6 = ((um) obj).J0;
                coVar6.z0.h1(i13, coVar6.y4);
                break;
            case 27:
                i10 = ((n2) ((on) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i13, true);
                break;
            case 28:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new u1((MessagesStorage.BooleanCallback) obj, i12), 250L);
                break;
            default:
                d90 d90Var = (d90) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i13).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < privacyRules.size()) {
                            if (privacyRules.get(i16) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i16) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i16) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i16++;
                            }
                        }
                    }
                }
                d90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.n1(privacyRules, objArr2 == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
        }
    }

    public /* synthetic */ g(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
