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
import org.telegram.ui.Components.n90;
import org.telegram.ui.ee;
import org.telegram.ui.in;
import org.telegram.ui.pm;
import org.telegram.ui.wi;
import org.telegram.ui.wn;
import org.telegram.ui.xi;
import org.telegram.ui.yi;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                ci.lc lcVar = (ci.lc) obj;
                int i15 = lcVar.c;
                lcVar.m();
                lcVar.X1 = false;
                File file = lcVar.K1.O0;
                if (file != null) {
                    file.delete();
                    lcVar.K1.O0 = null;
                }
                lcVar.W(lcVar.K1, true);
                CharSequence[] charSequenceArr = {lcVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i15).storyEntitiesAllowed() ? MediaDataController.getInstance(i15).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i15).storyEntitiesAllowed() ? MediaDataController.getInstance(i15).getEntities(new CharSequence[]{lcVar.K1.C0}, true) : new ArrayList<>();
                ci.l8 l8Var = lcVar.K1;
                l8Var.k = (TextUtils.equals(l8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                lcVar.K1.C0 = new SpannableString(lcVar.c1.getText());
                lcVar.z();
                lcVar.y();
                ci.l8 l8Var2 = lcVar.K1;
                lcVar.O1 = (l8Var2 == null || !l8Var2.K) ? 0 : 1;
                lcVar.K1 = (ci.l8) lcVar.H1.get(i14);
                lcVar.O(0, 1);
                lcVar.N(0, 1);
                lcVar.d1.b.Y2.N(false);
                lcVar.c1.setText(lcVar.K1.C0);
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
                    ii.x3 x3Var = ((ii.p3) f0Var).a;
                    x3Var.o3(false);
                    x3Var.h3.J(new ii.u3(x3Var, aVar, i14), e0Var);
                    break;
                }
                break;
            case 11:
                k2.j jVar = (k2.j) ((n4.y) obj).c;
                String str = e2.d0.a;
                e2.c cVar = ((i2.c0) jVar).a.E;
                i2.w wVar = new i2.w(i14, 2);
                cVar.getClass();
                e2.d.g(Looper.myLooper() == ((e2.z) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new ci.y8(i12, cVar, wVar));
                cVar.n(Integer.valueOf(i14));
                break;
            case 12:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    try {
                        a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: nf.b
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i14, true);
                            }
                        });
                        a2VarArr[0].show();
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
                ((ee) obj).f.c(i14);
                break;
            case 19:
                ((yi) obj).a.F(this.b, 0, 0, 0, true, true);
                break;
            case 20:
                wn wnVar = ((wi) obj).g;
                if (wnVar.vb == i14) {
                    wnVar.Ma();
                    break;
                }
                break;
            case 21:
                wn wnVar2 = ((xi) obj).g;
                if (wnVar2.vb == i14) {
                    wnVar2.Ma();
                    break;
                }
                break;
            case 22:
                wn wnVar3 = ((wi) obj).g;
                if (wnVar3.vb == i14) {
                    wnVar3.Ma();
                    break;
                }
                break;
            case 23:
                wn wnVar4 = ((xi) obj).g;
                if (wnVar4.vb == i14) {
                    wnVar4.Ma();
                    break;
                }
                break;
            case 24:
                wn wnVar5 = ((xi) obj).g;
                if (wnVar5.vb == i14) {
                    wnVar5.Ma();
                    break;
                }
                break;
            case 25:
                wn wnVar6 = ((pm) obj).J0;
                wnVar6.z0.h1(i14, wnVar6.y4);
                break;
            case 26:
                i10 = ((org.telegram.ui.ActionBar.m2) ((in) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i14, true);
                break;
            case 27:
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t1((MessagesStorage.BooleanCallback) obj, i13), 250L);
                break;
            case 28:
                n90 n90Var = (n90) obj;
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
                n90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.m1(privacyRules, objArr == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
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
