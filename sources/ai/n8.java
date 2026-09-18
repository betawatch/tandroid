package ai;

import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.TextureView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a60;
import org.telegram.ui.aj;
import org.telegram.ui.fe;
import org.telegram.ui.ln;
import org.telegram.ui.rm;
import org.telegram.ui.yi;
import org.telegram.ui.zi;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        int i12 = 1;
        final int i13 = this.b;
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
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 1:
                ((c2.b) obj).b.onAudioFocusChange(i13);
                break;
            case 2:
                ((ci.o) obj).run(Integer.valueOf(i13));
                break;
            case 3:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                break;
            case 4:
                ((ci.t2) obj).p0(i13);
                break;
            case 5:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                break;
            case 6:
                ci.oc ocVar = (ci.oc) obj;
                int i14 = ocVar.c;
                ocVar.m();
                ocVar.X1 = false;
                File file = ocVar.K1.O0;
                if (file != null) {
                    file.delete();
                    ocVar.K1.O0 = null;
                }
                ocVar.W(ocVar.K1, true);
                CharSequence[] charSequenceArr = {ocVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(new CharSequence[]{ocVar.K1.C0}, true) : new ArrayList<>();
                ci.o8 o8Var = ocVar.K1;
                o8Var.k = (TextUtils.equals(o8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                ocVar.K1.C0 = new SpannableString(ocVar.c1.getText());
                ocVar.z();
                ocVar.y();
                ci.o8 o8Var2 = ocVar.K1;
                ocVar.O1 = (o8Var2 == null || !o8Var2.K) ? 0 : 1;
                ocVar.K1 = (ci.o8) ocVar.H1.get(i13);
                ocVar.O(0, 1);
                ocVar.N(0, 1);
                ocVar.d1.b.Y2.N(false);
                ocVar.c1.setText(ocVar.K1.C0);
                break;
            case 7:
                ((gg.i0) obj).m(i13);
                break;
            case 8:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                hh.h hVar = (hh.h) obj;
                hVar.getClass();
                try {
                    hVar.a.scrollBy(0, i13);
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
                    w3Var.p3(false);
                    w3Var.h3.J(new ii.t3(w3Var, aVar, i13), e0Var);
                    break;
                }
                break;
            case 11:
                k2.j jVar = (k2.j) ((n4.y) obj).c;
                String str = e2.d0.a;
                e2.c cVar = ((i2.b0) jVar).a.E;
                i2.v vVar = new i2.v(i13, 2);
                cVar.getClass();
                e2.d.g(Looper.myLooper() == ((e2.z) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new ci.b9(11, cVar, vVar));
                cVar.n(Integer.valueOf(i13));
                break;
            case 12:
                ((ki.g) obj).r(i13);
                break;
            case 13:
                ki.h0 h0Var2 = (ki.h0) ((k2.u) obj).b;
                h0Var2.G++;
                h0Var2.q = true;
                h0Var2.l.b("camera switch started: target=".concat(hg.k0.z(i13)));
                TextureView textureView = ((a60) h0Var2.c.a).v;
                textureView.animate().cancel();
                textureView.animate().rotationY(90.0f).setDuration(120L).start();
                h0Var2.m();
                break;
            case 14:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    try {
                        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: nf.b
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i13, true);
                            }
                        });
                        b2VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 15:
                ((nh.a) obj).w0(i13, 0, null);
                break;
            case 16:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                break;
            case 17:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 18:
                ((org.telegram.ui.p4) ((org.telegram.ui.g) obj).b).V(i13, true);
                break;
            case 19:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
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
            case 20:
                ((fe) obj).f.c(i13);
                break;
            case 21:
                ((aj) obj).a.F(this.b, 0, 0, 0, true, true);
                break;
            case 22:
                zn znVar = ((yi) obj).g;
                if (znVar.vb == i13) {
                    znVar.Ma();
                    break;
                }
                break;
            case 23:
                zn znVar2 = ((zi) obj).g;
                if (znVar2.vb == i13) {
                    znVar2.Ma();
                    break;
                }
                break;
            case 24:
                zn znVar3 = ((yi) obj).g;
                if (znVar3.vb == i13) {
                    znVar3.Ma();
                    break;
                }
                break;
            case 25:
                zn znVar4 = ((zi) obj).g;
                if (znVar4.vb == i13) {
                    znVar4.Ma();
                    break;
                }
                break;
            case 26:
                zn znVar5 = ((zi) obj).g;
                if (znVar5.vb == i13) {
                    znVar5.Ma();
                    break;
                }
                break;
            case 27:
                zn znVar6 = ((rm) obj).J0;
                znVar6.z0.h1(i13, znVar6.y4);
                break;
            case 28:
                i10 = ((org.telegram.ui.ActionBar.n2) ((ln) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i13, true);
                break;
            default:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t1((MessagesStorage.BooleanCallback) obj, i12), 250L);
                break;
        }
    }

    public /* synthetic */ n8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
