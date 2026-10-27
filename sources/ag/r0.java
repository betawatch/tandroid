package ag;

import a8.yb;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import bi.ca;
import bi.p5;
import di.b4;
import di.h7;
import fi.l2;
import fi.sb;
import fi.w7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import li.n3;
import li.s3;
import li.v3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dj;
import org.telegram.ui.fe;
import org.telegram.ui.ge;
import org.telegram.ui.hn;
import org.telegram.ui.om;
import org.telegram.ui.t4;
import org.telegram.ui.ui;
import org.telegram.ui.vi;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r0(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        int i12 = 1;
        int i13 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i13).clientUserId);
                ((j5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 1:
                bh.h hVar = (bh.h) obj;
                if (hVar.b) {
                    Utilities.Callback callback = hVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i13 < 300));
                        try {
                            hVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    hVar.c = true;
                    int max = Math.max(50, i13 - 100);
                    AndroidUtilities.runOnUIThread(new r0(hVar, max, i12), max);
                    break;
                }
                break;
            case 2:
                qf.d.r(((bi.y) obj).getParentActivity(), LocaleController.getString(i13));
                break;
            case 3:
                ConnectionsManager.getInstance(((ca) obj).a).cancelRequest(i13, true);
                break;
            case 4:
                ((c2.g) obj).b.onAudioFocusChange(i13);
                break;
            case 5:
                h7 h7Var = (h7) obj;
                ArrayList arrayList = h7Var.g;
                h7Var.v(arrayList);
                p5 p5Var = h7Var.J;
                Collections.sort(arrayList, p5Var);
                ArrayList arrayList2 = h7Var.h;
                h7Var.v(arrayList2);
                Collections.sort(arrayList2, p5Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 6:
                ((fi.o) obj).run(Integer.valueOf(i13));
                break;
            case 7:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                break;
            case 8:
                ((l2) obj).r0(i13);
                break;
            case 9:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                break;
            case 10:
                sb sbVar = (sb) obj;
                int i14 = sbVar.c;
                sbVar.l();
                sbVar.X1 = false;
                File file = sbVar.K1.O0;
                if (file != null) {
                    file.delete();
                    sbVar.K1.O0 = null;
                }
                sbVar.V(sbVar.K1, true);
                CharSequence[] charSequenceArr = {sbVar.c1.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i14).storyEntitiesAllowed() ? MediaDataController.getInstance(i14).getEntities(new CharSequence[]{sbVar.K1.C0}, true) : new ArrayList<>();
                w7 w7Var = sbVar.K1;
                w7Var.k = (TextUtils.equals(w7Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                sbVar.K1.C0 = new SpannableString(sbVar.c1.getText());
                sbVar.y();
                sbVar.x();
                w7 w7Var2 = sbVar.K1;
                sbVar.O1 = (w7Var2 == null || !w7Var2.K) ? 0 : 1;
                sbVar.K1 = (w7) sbVar.H1.get(i13);
                sbVar.N(0, 1);
                sbVar.M(0, 1);
                sbVar.d1.b.g3.O(false);
                sbVar.c1.setText(sbVar.K1.C0);
                break;
            case 11:
                j2.e eVar = ((i2.s0) obj).M;
                j2.a l4 = eVar.l();
                eVar.q(l4, 1034, new ig.g(l4, i13, 14, r2 ? (char) 1 : (char) 0));
                break;
            case 12:
                ((ig.i0) obj).m(i13);
                break;
            case 13:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 14:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.a.scrollBy(0, i13);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 15:
                k2.v vVar = (k2.v) ((rf.b) obj).c;
                String str = e2.n0.a;
                e2.c cVar = ((i2.d0) vVar).a.C;
                i2.w wVar = new i2.w(i13, 2);
                cVar.getClass();
                yb.p(Looper.myLooper() == ((e2.i0) cVar.c).a.getLooper());
                cVar.a++;
                cVar.i(new b4(25, cVar, wVar));
                cVar.n(Integer.valueOf(i13));
                break;
            case 16:
                li.c0 c0Var = (li.c0) obj;
                li.f0 f0Var = c0Var.f;
                if (c0Var.c && f0Var.E != null && f0Var.a != null) {
                    c0Var.d = true;
                    c0Var.a.setPressed(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    li.d0 d0Var = f0Var.E;
                    li.a aVar = f0Var.a;
                    v3 v3Var = ((n3) d0Var).a;
                    v3Var.u3(false);
                    v3Var.p3.B(new s3(v3Var, aVar, i13), c0Var);
                    break;
                }
                break;
            case 17:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                break;
            case 18:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 19:
                ((t4) ((org.telegram.ui.f) obj).b).W(i13, true);
                break;
            case 20:
                s1 s1Var = (s1) obj;
                int i15 = s1Var.v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.d0 d0Var2 = (org.telegram.ui.Cells.d0) s1Var.o7.get(i15);
                    if (d0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = d0Var2.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var2.b(false);
                        if (!s1Var.y7.scheduled) {
                            if (d0Var2.j != null) {
                                s1Var.j();
                            } else if (d0Var2.i != null) {
                                s1Var.j();
                                j1 j1Var = s1Var.Jc;
                                if (j1Var != null) {
                                    j1Var.q1(s1Var, d0Var2.i);
                                }
                            }
                        }
                    }
                    s1Var.v7 = -1;
                    s1Var.a3();
                    break;
                }
                break;
            case 21:
                ge geVar = ((fe) obj).f;
                geVar.getClass();
                geVar.c(i13);
                break;
            case 22:
                wn wnVar = ((ui) obj).g;
                if (wnVar.Wb == i13) {
                    wnVar.Ya();
                    break;
                }
                break;
            case 23:
                wn wnVar2 = ((vi) obj).g;
                if (wnVar2.Wb == i13) {
                    wnVar2.Ya();
                    break;
                }
                break;
            case 24:
                ((dj) obj).a.j(this.b, 0, true, 0, true, 0);
                break;
            case 25:
                wn wnVar3 = ((ui) obj).g;
                if (wnVar3.Wb == i13) {
                    wnVar3.Ya();
                    break;
                }
                break;
            case 26:
                wn wnVar4 = ((vi) obj).g;
                if (wnVar4.Wb == i13) {
                    wnVar4.Ya();
                    break;
                }
                break;
            case 27:
                wn wnVar5 = ((vi) obj).g;
                if (wnVar5.Wb == i13) {
                    wnVar5.Ya();
                    break;
                }
                break;
            case 28:
                wn wnVar6 = ((om) obj).B0;
                wnVar6.z0.h1(i13, wnVar6.K4);
                break;
            default:
                i10 = ((r2) ((hn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i13, true);
                break;
        }
    }

    public /* synthetic */ r0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
