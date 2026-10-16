package ah;

import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import bi.q7;
import bi.x8;
import di.k8;
import di.kc;
import di.r2;
import di.y6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import ji.p3;
import ji.u3;
import ji.x3;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.n1;
import org.telegram.ui.dj;
import org.telegram.ui.ej;
import org.telegram.ui.fo;
import org.telegram.ui.le;
import org.telegram.ui.mj;
import org.telegram.ui.qn;
import org.telegram.ui.u4;
import org.telegram.ui.xm;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        Object[] objArr3 = 0;
        int i13 = this.b;
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
                x8 x8Var = (x8) obj;
                ArrayList arrayList = x8Var.g;
                x8Var.v(arrayList);
                q7 q7Var = x8Var.J;
                Collections.sort(arrayList, q7Var);
                ArrayList arrayList2 = x8Var.h;
                x8Var.v(arrayList2);
                Collections.sort(arrayList2, q7Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 2:
                ((c2.g) obj).b.onAudioFocusChange(i13);
                break;
            case 3:
                ((di.o) obj).run(Integer.valueOf(i13));
                break;
            case 4:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                break;
            case 5:
                ((r2) obj).q0(i13);
                break;
            case 6:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                break;
            case 7:
                kc kcVar = (kc) obj;
                int i14 = kcVar.c;
                kcVar.l();
                kcVar.X1 = false;
                File file = kcVar.K1.O0;
                if (file != null) {
                    file.delete();
                    kcVar.K1.O0 = null;
                }
                kcVar.V(kcVar.K1, true);
                CharSequence[] charSequenceArr = {kcVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(new CharSequence[]{kcVar.K1.C0}, true) : new ArrayList<>();
                k8 k8Var = kcVar.K1;
                k8Var.k = (TextUtils.equals(k8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                kcVar.K1.C0 = new SpannableString(kcVar.c1.getText());
                kcVar.y();
                kcVar.x();
                k8 k8Var2 = kcVar.K1;
                kcVar.O1 = (k8Var2 == null || !k8Var2.K) ? 0 : 1;
                kcVar.K1 = (k8) kcVar.H1.get(i13);
                kcVar.N(0, 1);
                kcVar.M(0, 1);
                kcVar.d1.b.W2.N(false);
                kcVar.c1.setText(kcVar.K1.C0);
                break;
            case 8:
                ((hg.h0) obj).m(i13);
                break;
            case 9:
                j2.f fVar = ((i2.r0) obj).M;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1034, new j2.c(l4, i13, 10, (char) (objArr2 == true ? 1 : 0)));
                break;
            case 10:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                ih.g gVar = (ih.g) obj;
                gVar.getClass();
                try {
                    gVar.a.scrollBy(0, i13);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 12:
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
                    x3 x3Var = ((p3) e0Var).a;
                    x3Var.p3(false);
                    x3Var.f3.i(new u3(x3Var, aVar, i13), d0Var);
                    break;
                }
                break;
            case 13:
                k2.u uVar = (k2.u) ((qf.b) obj).c;
                String str = e2.m0.a;
                e2.c cVar = ((i2.b0) uVar).a.C;
                i2.v vVar = new i2.v(i13, 2);
                cVar.getClass();
                u6.p(Looper.myLooper() == ((e2.i0) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new y6(19, cVar, vVar));
                cVar.n(Integer.valueOf(i13));
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
                ((u4) ((org.telegram.ui.g) obj).b).V(i13, true);
                break;
            case 18:
                u1 u1Var = (u1) obj;
                int i15 = u1Var.v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) u1Var.o7.get(i15);
                    if (e0Var2 != null) {
                        org.telegram.ui.Cells.z zVar = e0Var2.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (!u1Var.y7.scheduled) {
                            if (e0Var2.j != null) {
                                u1Var.k();
                            } else if (e0Var2.i != null) {
                                u1Var.k();
                                org.telegram.ui.Cells.l1 l1Var = u1Var.Jc;
                                if (l1Var != null) {
                                    l1Var.B1(u1Var, e0Var2.i);
                                }
                            }
                        }
                    }
                    u1Var.v7 = -1;
                    u1Var.a3();
                    break;
                }
                break;
            case 19:
                ((le) obj).f.c(i13);
                break;
            case 20:
                fo foVar = ((dj) obj).g;
                if (foVar.wb == i13) {
                    foVar.Qa();
                    break;
                }
                break;
            case 21:
                fo foVar2 = ((ej) obj).g;
                if (foVar2.wb == i13) {
                    foVar2.Qa();
                    break;
                }
                break;
            case 22:
                ((mj) obj).a.j(this.b, 0, true, 0, true, 0);
                break;
            case 23:
                fo foVar3 = ((dj) obj).g;
                if (foVar3.wb == i13) {
                    foVar3.Qa();
                    break;
                }
                break;
            case 24:
                fo foVar4 = ((ej) obj).g;
                if (foVar4.wb == i13) {
                    foVar4.Qa();
                    break;
                }
                break;
            case 25:
                fo foVar5 = ((ej) obj).g;
                if (foVar5.wb == i13) {
                    foVar5.Qa();
                    break;
                }
                break;
            case 26:
                fo foVar6 = ((xm) obj).J0;
                foVar6.z0.h1(i13, foVar6.y4);
                break;
            case 27:
                i10 = ((m2) ((qn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i13, true);
                break;
            case 28:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u1((MessagesStorage.BooleanCallback) obj, i12), 250L);
                break;
            default:
                da0 da0Var = (da0) obj;
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
                da0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new n1(privacyRules, objArr3 == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
        }
    }

    public /* synthetic */ g(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
