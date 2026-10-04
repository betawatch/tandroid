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
import org.telegram.ui.Components.q90;
import org.telegram.ui.he;
import org.telegram.ui.ie;
import org.telegram.ui.kn;
import org.telegram.ui.qm;
import org.telegram.ui.xi;
import org.telegram.ui.yi;
import org.telegram.ui.yn;
import org.telegram.ui.zi;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8(int i10, Object obj, int i11) {
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
                e8 e8Var = l9Var.J;
                Collections.sort(arrayList, e8Var);
                ArrayList arrayList2 = l9Var.h;
                l9Var.v(arrayList2);
                Collections.sort(arrayList2, e8Var);
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
                ((ci.s2) obj).p0(i14);
                break;
            case 5:
                MessagesController.getInstance(i14).putUsers((ArrayList) obj, true);
                break;
            case 6:
                ci.kc kcVar = (ci.kc) obj;
                int i15 = kcVar.c;
                kcVar.m();
                kcVar.X1 = false;
                File file = kcVar.K1.O0;
                if (file != null) {
                    file.delete();
                    kcVar.K1.O0 = null;
                }
                kcVar.W(kcVar.K1, true);
                CharSequence[] charSequenceArr = {kcVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i15).storyEntitiesAllowed() ? MediaDataController.getInstance(i15).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i15).storyEntitiesAllowed() ? MediaDataController.getInstance(i15).getEntities(new CharSequence[]{kcVar.K1.C0}, true) : new ArrayList<>();
                ci.k8 k8Var = kcVar.K1;
                k8Var.k = (TextUtils.equals(k8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                kcVar.K1.C0 = new SpannableString(kcVar.c1.getText());
                kcVar.z();
                kcVar.y();
                ci.k8 k8Var2 = kcVar.K1;
                kcVar.O1 = (k8Var2 == null || !k8Var2.K) ? 0 : 1;
                kcVar.K1 = (ci.k8) kcVar.H1.get(i14);
                kcVar.O(0, 1);
                kcVar.N(0, 1);
                kcVar.d1.b.f3.N(false);
                kcVar.c1.setText(kcVar.K1.C0);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                    ii.x3 x3Var = ((ii.p3) f0Var).a;
                    x3Var.q3(false);
                    x3Var.o3.o0(new ii.u3(x3Var, aVar, i14), e0Var);
                    break;
                }
                break;
            case 11:
                k2.k kVar = (k2.k) ((n4.y) obj).c;
                String str = e2.d0.a;
                e2.c cVar = ((i2.c0) kVar).a.E;
                i2.w wVar = new i2.w(i14, 2);
                cVar.getClass();
                e2.d.g(Looper.myLooper() == ((e2.z) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new ci.x8(i12, cVar, wVar));
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
                ((nh.a) obj).w0(i14, 0, null);
                break;
            case 14:
                ConnectionsManager.lambda$onUpdateConfig$21(i14, (TLRPC.TL_config) obj);
                break;
            case 15:
                MessagesController.getInstance(i14).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 16:
                ((org.telegram.ui.q4) ((org.telegram.ui.g) obj).b).T(i14, true);
                break;
            case 17:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                int i16 = u1Var.v7;
                if (i14 == i16) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) u1Var.o7.get(i16);
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
                                    l1Var.H1(u1Var, e0Var2.i);
                                }
                            }
                        }
                    }
                    u1Var.v7 = -1;
                    u1Var.a3();
                    break;
                }
                break;
            case 18:
                ie ieVar = ((he) obj).f;
                ieVar.getClass();
                ieVar.c(i14);
                break;
            case 19:
                ((zi) obj).a.D(this.b, 0, 0, 0, true, true);
                break;
            case 20:
                yn ynVar = ((xi) obj).g;
                if (ynVar.tb == i14) {
                    ynVar.La();
                    break;
                }
                break;
            case 21:
                yn ynVar2 = ((yi) obj).g;
                if (ynVar2.tb == i14) {
                    ynVar2.La();
                    break;
                }
                break;
            case 22:
                yn ynVar3 = ((xi) obj).g;
                if (ynVar3.tb == i14) {
                    ynVar3.La();
                    break;
                }
                break;
            case 23:
                yn ynVar4 = ((yi) obj).g;
                if (ynVar4.tb == i14) {
                    ynVar4.La();
                    break;
                }
                break;
            case 24:
                yn ynVar5 = ((yi) obj).g;
                if (ynVar5.tb == i14) {
                    ynVar5.La();
                    break;
                }
                break;
            case 25:
                yn ynVar6 = ((qm) obj).M0;
                ynVar6.x0.h1(i14, ynVar6.w4);
                break;
            case 26:
                i10 = ((org.telegram.ui.ActionBar.n2) ((kn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i14, true);
                break;
            case 27:
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t1((MessagesStorage.BooleanCallback) obj, i13), 250L);
                break;
            case 28:
                q90 q90Var = (q90) obj;
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
                q90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.m1(privacyRules, objArr == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            default:
                ((org.telegram.ui.Components.o8) obj).b(i14);
                break;
        }
    }

    public /* synthetic */ o8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
