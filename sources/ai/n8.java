package ai;

import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
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
import org.telegram.ui.Components.c90;
import org.telegram.ui.aj;
import org.telegram.ui.bj;
import org.telegram.ui.bo;
import org.telegram.ui.ee;
import org.telegram.ui.nn;
import org.telegram.ui.tm;
import org.telegram.ui.zi;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n8(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        int i12 = 11;
        int i13 = 1;
        Object[] objArr = 0;
        final int i14 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                l9 l9Var = (l9) obj;
                ArrayList arrayList = l9Var.g;
                l9Var.v(arrayList);
                c8 c8Var = l9Var.J;
                Collections.sort(arrayList, c8Var);
                ArrayList arrayList2 = l9Var.h;
                l9Var.v(arrayList2);
                Collections.sort(arrayList2, c8Var);
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 1:
                ((c2.b) obj).b.onAudioFocusChange(i14);
                break;
            case 2:
                ((ci.o) obj).run(Integer.valueOf(i14));
                break;
            case 3:
                ((Utilities.Callback) obj).run(Integer.valueOf(i14));
                break;
            case 4:
                ((ci.t2) obj).p0(i14);
                break;
            case 5:
                MessagesController.getInstance(i14).putUsers((ArrayList) obj, true);
                break;
            case 6:
                ci.oc ocVar = (ci.oc) obj;
                int i15 = ocVar.c;
                ocVar.m();
                ocVar.X1 = false;
                File file = ocVar.K1.O0;
                if (file != null) {
                    file.delete();
                    ocVar.K1.O0 = null;
                }
                ocVar.W(ocVar.K1, true);
                CharSequence[] charSequenceArr = {ocVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i15).storyEntitiesAllowed() ? MediaDataController.getInstance(i15).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i15).storyEntitiesAllowed() ? MediaDataController.getInstance(i15).getEntities(new CharSequence[]{ocVar.K1.C0}, true) : new ArrayList<>();
                ci.o8 o8Var = ocVar.K1;
                o8Var.k = (TextUtils.equals(o8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                ocVar.K1.C0 = new SpannableString(ocVar.c1.getText());
                ocVar.z();
                ocVar.y();
                ci.o8 o8Var2 = ocVar.K1;
                ocVar.O1 = (o8Var2 == null || !o8Var2.K) ? 0 : 1;
                ocVar.K1 = (ci.o8) ocVar.H1.get(i14);
                ocVar.O(0, 1);
                ocVar.N(0, 1);
                ocVar.d1.b.Y2.N(false);
                ocVar.c1.setText(ocVar.K1.C0);
                break;
            case 7:
                ((gg.i0) obj).m(i14);
                break;
            case 8:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i14).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i14).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                hh.h hVar = (hh.h) obj;
                hVar.getClass();
                try {
                    hVar.a.scrollBy(0, i14);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 10:
                ii.e0 e0Var = (ii.e0) obj;
                ii.h0 h0Var = e0Var.f;
                if (e0Var.c && h0Var.E != null && h0Var.a != null) {
                    e0Var.d = true;
                    e0Var.a.setPressed(false);
                    try {
                        e0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ii.f0 f0Var = h0Var.E;
                    ii.a aVar = h0Var.a;
                    ii.w3 w3Var = ((ii.o3) f0Var).a;
                    w3Var.o3(false);
                    w3Var.h3.H(new ii.t3(w3Var, aVar, i14), e0Var);
                    break;
                }
                break;
            case 11:
                k2.j jVar = (k2.j) ((n4.y) obj).c;
                String str = e2.d0.a;
                e2.c cVar = ((i2.b0) jVar).a.E;
                i2.v vVar = new i2.v(i14, 2);
                cVar.getClass();
                e2.d.g(Looper.myLooper() == ((e2.z) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new ci.b9(i12, cVar, vVar));
                cVar.n(Integer.valueOf(i14));
                break;
            case 12:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    try {
                        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: nf.b
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i14, true);
                            }
                        });
                        b2VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                ((nh.a) obj).v0(i14, 0, null);
                break;
            case 14:
                ConnectionsManager.lambda$onUpdateConfig$21(i14, (TLRPC.TL_config) obj);
                break;
            case 15:
                MessagesController.getInstance(i14).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 16:
                ((org.telegram.ui.p4) ((org.telegram.ui.g) obj).b).V(i14, true);
                break;
            case 17:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                int i16 = t1Var.v7;
                if (i14 == i16) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) t1Var.o7.get(i16);
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
                                    k1Var.H1(t1Var, e0Var2.i);
                                }
                            }
                        }
                    }
                    t1Var.v7 = -1;
                    t1Var.a3();
                    break;
                }
                break;
            case 18:
                ((ee) obj).f.c(i14);
                break;
            case 19:
                ((bj) obj).a.F(this.b, 0, 0, 0, true, true);
                break;
            case 20:
                bo boVar = ((zi) obj).g;
                if (boVar.vb == i14) {
                    boVar.Ma();
                    break;
                }
                break;
            case 21:
                bo boVar2 = ((aj) obj).g;
                if (boVar2.vb == i14) {
                    boVar2.Ma();
                    break;
                }
                break;
            case 22:
                bo boVar3 = ((zi) obj).g;
                if (boVar3.vb == i14) {
                    boVar3.Ma();
                    break;
                }
                break;
            case 23:
                bo boVar4 = ((aj) obj).g;
                if (boVar4.vb == i14) {
                    boVar4.Ma();
                    break;
                }
                break;
            case 24:
                bo boVar5 = ((aj) obj).g;
                if (boVar5.vb == i14) {
                    boVar5.Ma();
                    break;
                }
                break;
            case 25:
                bo boVar6 = ((tm) obj).J0;
                boVar6.z0.h1(i14, boVar6.y4);
                break;
            case 26:
                i10 = ((org.telegram.ui.ActionBar.n2) ((nn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i14, true);
                break;
            case 27:
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t1((MessagesStorage.BooleanCallback) obj, i13), 250L);
                break;
            case 28:
                c90 c90Var = (c90) obj;
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
                c90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.m1(privacyRules, objArr == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            default:
                ((org.telegram.ui.Components.m8) obj).b(i14);
                break;
        }
    }

    public /* synthetic */ n8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
