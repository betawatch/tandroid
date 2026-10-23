package ah;

import ai.ha;
import ai.u5;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import ci.h7;
import ci.u7;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.de;
import org.telegram.ui.dn;
import org.telegram.ui.km;
import org.telegram.ui.qi;
import org.telegram.ui.ri;
import org.telegram.ui.sn;
import org.telegram.ui.u4;
import org.telegram.ui.zi;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        int i12 = 16;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
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
                pf.d.r(((ai.x) obj).getParentActivity(), LocaleController.getString(i13));
                break;
            case 2:
                ConnectionsManager.getInstance(((ha) obj).a).cancelRequest(i13, true);
                break;
            case 3:
                ((c2.g) obj).b.onAudioFocusChange(i13);
                break;
            case 4:
                h7 h7Var = (h7) obj;
                ArrayList arrayList = h7Var.g;
                h7Var.v(arrayList);
                u5 u5Var = h7Var.J;
                Collections.sort(arrayList, u5Var);
                ArrayList arrayList2 = h7Var.h;
                h7Var.v(arrayList2);
                Collections.sort(arrayList2, u5Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 5:
                ((ei.o) obj).run(Integer.valueOf(i13));
                break;
            case 6:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                break;
            case 7:
                ((n2) obj).r0(i13);
                break;
            case 8:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                break;
            case 9:
                vb vbVar = (vb) obj;
                int i14 = vbVar.c;
                vbVar.l();
                vbVar.X1 = false;
                File file = vbVar.K1.O0;
                if (file != null) {
                    file.delete();
                    vbVar.K1.O0 = null;
                }
                vbVar.V(vbVar.K1, true);
                CharSequence[] charSequenceArr = {vbVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(new CharSequence[]{vbVar.K1.C0}, true) : new ArrayList<>();
                a8 a8Var = vbVar.K1;
                a8Var.k = (TextUtils.equals(a8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                vbVar.K1.C0 = new SpannableString(vbVar.c1.getText());
                vbVar.y();
                vbVar.x();
                a8 a8Var2 = vbVar.K1;
                vbVar.O1 = (a8Var2 == null || !a8Var2.K) ? 0 : 1;
                vbVar.K1 = (a8) vbVar.H1.get(i13);
                vbVar.N(0, 1);
                vbVar.M(0, 1);
                vbVar.d1.b.Z2.N(false);
                vbVar.c1.setText(vbVar.K1.C0);
                break;
            case 10:
                ((hg.h0) obj).m(i13);
                break;
            case 11:
                j2.e eVar = ((i2.q0) obj).M;
                j2.a l4 = eVar.l();
                eVar.q(l4, 1034, new ih.l(l4, i13, i12, (char) (objArr2 == true ? 1 : 0)));
                break;
            case 12:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                ih.g gVar = (ih.g) obj;
                gVar.getClass();
                try {
                    gVar.a.scrollBy(0, i13);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 14:
                k2.v vVar = (k2.v) ((qf.b) obj).c;
                String str = e2.m0.a;
                e2.c cVar = ((i2.b0) vVar).a.C;
                i2.v vVar2 = new i2.v(i13, 2);
                cVar.getClass();
                u6.p(Looper.myLooper() == ((e2.i0) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new u7(i12, cVar, vVar2));
                cVar.n(Integer.valueOf(i13));
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
                    w3Var.u3(false);
                    w3Var.i3.n(new t3(w3Var, aVar, i13), d0Var);
                    break;
                }
                break;
            case 16:
                ((oh.a) obj).v0(i13, 0, null);
                break;
            case 17:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                break;
            case 18:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 19:
                ((u4) ((org.telegram.ui.f) obj).b).V(i13, true);
                break;
            case 20:
                t1 t1Var = (t1) obj;
                int i15 = t1Var.v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.d0 d0Var2 = (org.telegram.ui.Cells.d0) t1Var.o7.get(i15);
                    if (d0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = d0Var2.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var2.b(false);
                        if (!t1Var.y7.scheduled) {
                            if (d0Var2.j != null) {
                                t1Var.j();
                            } else if (d0Var2.i != null) {
                                t1Var.j();
                                org.telegram.ui.Cells.k1 k1Var = t1Var.Jc;
                                if (k1Var != null) {
                                    k1Var.A1(t1Var, d0Var2.i);
                                }
                            }
                        }
                    }
                    t1Var.v7 = -1;
                    t1Var.Z2();
                    break;
                }
                break;
            case 21:
                ((de) obj).f.c(i13);
                break;
            case 22:
                sn snVar = ((qi) obj).g;
                if (snVar.Jb == i13) {
                    snVar.Qa();
                    break;
                }
                break;
            case 23:
                sn snVar2 = ((ri) obj).g;
                if (snVar2.Jb == i13) {
                    snVar2.Qa();
                    break;
                }
                break;
            case 24:
                ((zi) obj).a.j(this.b, 0, true, 0, true, 0);
                break;
            case 25:
                sn snVar3 = ((qi) obj).g;
                if (snVar3.Jb == i13) {
                    snVar3.Qa();
                    break;
                }
                break;
            case 26:
                sn snVar4 = ((ri) obj).g;
                if (snVar4.Jb == i13) {
                    snVar4.Qa();
                    break;
                }
                break;
            case 27:
                sn snVar5 = ((ri) obj).g;
                if (snVar5.Jb == i13) {
                    snVar5.Qa();
                    break;
                }
                break;
            case 28:
                sn snVar6 = ((km) obj).J0;
                snVar6.z0.h1(i13, snVar6.K4);
                break;
            default:
                i10 = ((o2) ((dn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i13, true);
                break;
        }
    }

    public /* synthetic */ g(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
