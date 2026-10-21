package ah;

import ai.ga;
import ai.u5;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import ci.i7;
import ci.v7;
import ei.a8;
import ei.n2;
import ei.vb;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import ki.o3;
import ki.t3;
import ki.w3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.cn;
import org.telegram.ui.de;
import org.telegram.ui.jm;
import org.telegram.ui.qi;
import org.telegram.ui.qn;
import org.telegram.ui.ri;
import org.telegram.ui.v4;
import org.telegram.ui.zi;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i12 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                i iVar = (i) obj;
                if (iVar.b) {
                    Utilities.Callback callback = iVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i12 < 300));
                        try {
                            iVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    iVar.c = true;
                    int max = Math.max(50, i12 - 100);
                    AndroidUtilities.runOnUIThread(new g((Object) iVar, max, (int) (objArr == true ? 1 : 0)), max);
                    break;
                }
                break;
            case 1:
                pf.d.r(((ai.x) obj).getParentActivity(), LocaleController.getString(i12));
                break;
            case 2:
                ConnectionsManager.getInstance(((ga) obj).a).cancelRequest(i12, true);
                break;
            case 3:
                ((c2.g) obj).b.onAudioFocusChange(i12);
                break;
            case 4:
                i7 i7Var = (i7) obj;
                ArrayList arrayList = i7Var.g;
                i7Var.v(arrayList);
                u5 u5Var = i7Var.J;
                Collections.sort(arrayList, u5Var);
                ArrayList arrayList2 = i7Var.h;
                i7Var.v(arrayList2);
                Collections.sort(arrayList2, u5Var);
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 5:
                ((ei.o) obj).run(Integer.valueOf(i12));
                break;
            case 6:
                ((Utilities.Callback) obj).run(Integer.valueOf(i12));
                break;
            case 7:
                ((n2) obj).q0(i12);
                break;
            case 8:
                MessagesController.getInstance(i12).putUsers((ArrayList) obj, true);
                break;
            case 9:
                vb vbVar = (vb) obj;
                int i13 = vbVar.c;
                vbVar.l();
                vbVar.X1 = false;
                File file = vbVar.K1.O0;
                if (file != null) {
                    file.delete();
                    vbVar.K1.O0 = null;
                }
                vbVar.V(vbVar.K1, true);
                CharSequence[] charSequenceArr = {vbVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(new CharSequence[]{vbVar.K1.C0}, true) : new ArrayList<>();
                a8 a8Var = vbVar.K1;
                a8Var.k = (TextUtils.equals(a8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                vbVar.K1.C0 = new SpannableString(vbVar.c1.getText());
                vbVar.y();
                vbVar.x();
                a8 a8Var2 = vbVar.K1;
                vbVar.O1 = (a8Var2 == null || !a8Var2.K) ? 0 : 1;
                vbVar.K1 = (a8) vbVar.H1.get(i12);
                vbVar.N(0, 1);
                vbVar.M(0, 1);
                vbVar.d1.b.W2.N(false);
                vbVar.c1.setText(vbVar.K1.C0);
                break;
            case 10:
                ((hg.h0) obj).m(i12);
                break;
            case 11:
                j2.f fVar = ((i2.r0) obj).M;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1034, new j2.c(l4, i12, 12, (char) (objArr2 == true ? 1 : 0)));
                break;
            case 12:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i12).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i12).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                ih.g gVar = (ih.g) obj;
                gVar.getClass();
                try {
                    gVar.a.scrollBy(0, i12);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 14:
                k2.u uVar = (k2.u) ((qf.b) obj).c;
                String str = e2.m0.a;
                e2.c cVar = ((i2.c0) uVar).a.C;
                i2.w wVar = new i2.w(i12, 2);
                cVar.getClass();
                u6.p(Looper.myLooper() == ((e2.i0) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new v7(16, cVar, wVar));
                cVar.n(Integer.valueOf(i12));
                break;
            case 15:
                ki.d0 d0Var = (ki.d0) obj;
                ki.g0 g0Var = d0Var.f;
                if (d0Var.c && g0Var.E != null && g0Var.a != null) {
                    d0Var.d = true;
                    d0Var.a.setPressed(false);
                    try {
                        d0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    ki.e0 e0Var = g0Var.E;
                    ki.a aVar = g0Var.a;
                    w3 w3Var = ((o3) e0Var).a;
                    w3Var.p3(false);
                    w3Var.f3.n(new t3(w3Var, aVar, i12), d0Var);
                    break;
                }
                break;
            case 16:
                ((oh.a) obj).v0(i12, 0, null);
                break;
            case 17:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                break;
            case 18:
                MessagesController.getInstance(i12).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 19:
                ((v4) ((org.telegram.ui.g) obj).b).V(i12, true);
                break;
            case 20:
                u1 u1Var = (u1) obj;
                int i14 = u1Var.v7;
                if (i12 == i14) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) u1Var.o7.get(i14);
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
                                    l1Var.A1(u1Var, e0Var2.i);
                                }
                            }
                        }
                    }
                    u1Var.v7 = -1;
                    u1Var.a3();
                    break;
                }
                break;
            case 21:
                ((de) obj).f.c(i12);
                break;
            case 22:
                qn qnVar = ((qi) obj).g;
                if (qnVar.wb == i12) {
                    qnVar.Qa();
                    break;
                }
                break;
            case 23:
                qn qnVar2 = ((ri) obj).g;
                if (qnVar2.wb == i12) {
                    qnVar2.Qa();
                    break;
                }
                break;
            case 24:
                ((zi) obj).a.j(this.b, 0, true, 0, true, 0);
                break;
            case 25:
                qn qnVar3 = ((qi) obj).g;
                if (qnVar3.wb == i12) {
                    qnVar3.Qa();
                    break;
                }
                break;
            case 26:
                qn qnVar4 = ((ri) obj).g;
                if (qnVar4.wb == i12) {
                    qnVar4.Qa();
                    break;
                }
                break;
            case 27:
                qn qnVar5 = ((ri) obj).g;
                if (qnVar5.wb == i12) {
                    qnVar5.Qa();
                    break;
                }
                break;
            case 28:
                qn qnVar6 = ((jm) obj).J0;
                qnVar6.z0.h1(i12, qnVar6.y4);
                break;
            default:
                i10 = ((org.telegram.ui.ActionBar.n2) ((cn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i12, true);
                break;
        }
    }

    public /* synthetic */ g(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
