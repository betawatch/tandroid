package l2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hb;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.pb;
import org.telegram.messenger.si;
import org.telegram.messenger.vo;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.u11;
import org.telegram.ui.an;
import org.telegram.ui.el;
import org.telegram.ui.jl;
import org.telegram.ui.lm;
import org.telegram.ui.ww;
import org.telegram.ui.xw;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x(int i7, int i10, String str, String str2) {
        this.a = 9;
        this.b = i7;
        this.d = str;
        this.e = str2;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        int i11 = 2;
        final int i12 = 1;
        int i13 = this.b;
        int i14 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                f0 f0Var = ((z) obj2).a;
                Surface surface = new Surface((SurfaceTexture) obj);
                f0Var.x1(surface);
                f0Var.U = surface;
                f0Var.q1(i13, i14);
                break;
            case 1:
                String str = (String) obj;
                fc fcVar = ((pb) obj2).b;
                if (i13 != 1) {
                    fcVar.s.c(new hb(fcVar, str, i12));
                }
                ns.f(i14).k(ns.Z1, str, Integer.valueOf(i13));
                break;
            case 2:
                ((si) obj2).x1((List) obj, i13, i14, true);
                break;
            case 3:
                si siVar = (si) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        siVar.getMessagesStorage().b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = siVar.getMessagesStorage().b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
                        executeFast.requery();
                        int i15 = 4;
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            i15 += ((TLRPC.TL_availableReaction) arrayList.get(i16)).getObjectSize();
                        }
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i15);
                        nativeByteBuffer.writeInt32(arrayList.size());
                        while (r6 < arrayList.size()) {
                            ((TLRPC.TL_availableReaction) arrayList.get(r6)).serializeToStream(nativeByteBuffer);
                            r6++;
                        }
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i13);
                        executeFast.bindInteger(3, i14);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                        break;
                    } else {
                        SQLitePreparedStatement executeFast2 = siVar.getMessagesStorage().b.executeFast("UPDATE reactions SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindLong(1, i14);
                        executeFast2.step();
                        executeFast2.dispose();
                        break;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 4:
                np npVar = (np) obj2;
                npVar.s1.clear();
                npVar.x1.clear();
                vr messagesStorage = npVar.getMessagesStorage();
                messagesStorage.H();
                npVar.q4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                npVar.P1().q();
                break;
            case 5:
                vo voVar = (vo) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                voVar.h.Y3(photos_photos.users, false);
                voVar.d(i13, i14, photos_photos);
                break;
            case 6:
                vo voVar2 = (vo) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                np npVar2 = voVar2.h;
                npVar2.Y3(messages_messages.users, false);
                npVar2.S3(messages_messages.chats, false);
                TLRPC.TL_photos_photos tL_photos_photos = new TLRPC.TL_photos_photos();
                tL_photos_photos.count = messages_messages.count;
                int i17 = 0;
                while (r6 < messages_messages.messages.size()) {
                    TLRPC.MessageAction messageAction = messages_messages.messages.get(r6).action;
                    if (messageAction != null) {
                        TLRPC.Photo photo = messageAction.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            tL_photos_photos.photos.add(photo);
                            r6++;
                        }
                    }
                    i17++;
                    r6++;
                }
                if (i13 == 0 && messages_messages.messages.size() >= messages_messages.count) {
                    tL_photos_photos.count -= i17;
                }
                voVar2.d(i13, i14, tL_photos_photos);
                break;
            case 7:
                vr vrVar = (vr) obj2;
                byte[] bArr = (byte[]) obj;
                vrVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = vrVar.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
                    executeFast3.bindInteger(1, i13);
                    executeFast3.bindInteger(2, i14);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(bArr != null ? bArr.length : 1);
                    if (bArr != null) {
                        nativeByteBuffer2.writeBytes(bArr);
                    }
                    executeFast3.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast3.step();
                    executeFast3.dispose();
                    nativeByteBuffer2.reuse();
                    break;
                } catch (Exception e11) {
                    vrVar.o(e11, true);
                    return;
                }
            case 8:
                ns nsVar = (ns) obj2;
                nsVar.l((Object[]) obj, i13, false);
                nsVar.q.remove(i14);
                break;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i13, (String) obj2, (String) obj, i14);
                break;
            case 10:
                ((an) obj2).didReceivedNotification(i13, i14, (Object[]) obj);
                break;
            case 11:
                el elVar = (el) obj2;
                elVar.getClass();
                gj messageObject = ((org.telegram.ui.Cells.t0) obj).getMessageObject();
                jl jlVar = elVar.a;
                jlVar.R.Bb(this.b, messageObject.e1(), true, gj.B0(messageObject.k) == jlVar.R.c7 ? 1 : 0, true, 0, Integer.valueOf(i14), null, null);
                break;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                an anVar = ((lm) obj2).a;
                if (anVar.P1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    anVar.P1.setTranslationY(i20.D(520.0f, r2[1] - r3.getTop(), i13));
                    anVar.P1.p(0.0f, (-org.telegram.messenger.g0.L(16.0f)) + r2[0] + i14);
                    anVar.P1.w();
                    break;
                }
                break;
            default:
                final ww wwVar = (ww) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                xw xwVar = wwVar.g;
                yw ywVar = wwVar.h;
                ArrayList arrayList2 = ywVar.T1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i18 = dialog.pinnedNum;
                    ywVar.Y0 = null;
                    xwVar.a.invalidate();
                    int N0 = xwVar.c.N0();
                    if (N0 == i13 - 1) {
                        xwVar.c.m(N0).requestLayout();
                    }
                    if (ywVar.getMessagesController().C2(dialog.id, false)) {
                        ywVar.getMessagesController().j2();
                        xwVar.y.D();
                        xwVar.q(true);
                        break;
                    } else {
                        int d = ywVar.getMessagesController().d(ywVar.Y2 == 0 ? 1 : 0, -1, dialog.id);
                        if (d != 2 || i14 != 0) {
                            xwVar.y.D();
                            xwVar.q(true);
                        }
                        if (ywVar.Y2 == 0) {
                            if (d == 2) {
                                boolean z10 = gz.q1;
                                if (z10) {
                                    gz.q1 = !z10;
                                    SharedPreferences.Editor edit = np.e1().edit();
                                    edit.putBoolean("archiveHidden", gz.q1);
                                    edit.apply();
                                }
                                xwVar.y.D();
                                if (i14 == 0) {
                                    ywVar.M4(true, true);
                                    xwVar.q(true);
                                    ywVar.z3();
                                } else {
                                    xwVar.q(true);
                                    if (!gz.q1 && xwVar.c.L0() == 0) {
                                        ywVar.g2 = true;
                                        xwVar.a.w0(0, -org.telegram.messenger.g0.L(gz.p1 ? 76.0f : 70.0f), null);
                                    }
                                }
                                i7 = ((e2) ywVar).currentAccount;
                                ywVar.T1.add(0, (TLRPC.Dialog) ywVar.d4(i7, xwVar.s, ywVar.Y2, false).get(0));
                                xwVar.q(true);
                                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.vw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                wwVar.h.M4(false, true);
                                                break;
                                            default:
                                                wwVar.h.M4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (d == 1) {
                                v4.e1 K = xwVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof t2) {
                                        t2 t2Var = (t2) view;
                                        if (t2Var.b2.n == 2) {
                                            t2Var.c2 = true;
                                            t2Var.d2 = 0.0f;
                                            j6.u1.T(true, 0.0f);
                                            j6.u1.start();
                                            t2Var.invalidate();
                                        }
                                    }
                                }
                                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.vw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                wwVar.h.M4(false, true);
                                                break;
                                            default:
                                                wwVar.h.M4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences e12 = np.e1();
                            r6 = (e12.getBoolean("archivehint_l", false) || gz.q1) ? 1 : 0;
                            if (r6 == 0) {
                                e12.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView k42 = ywVar.k4();
                            if (k42 != null) {
                                k42.l(dialog.id, r6 != 0 ? 2 : 3, null, new u11(wwVar, dialog, i18, i11));
                            }
                        }
                        if (ywVar.Y2 != 0 && ywVar.T1.isEmpty()) {
                            xwVar.a.setEmptyView(null);
                            xwVar.x.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ x(Object obj, int i7, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i7;
        this.c = i10;
        this.e = obj2;
    }

    public /* synthetic */ x(Object obj, Object obj2, int i7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ x(ns nsVar, int i7, Object[] objArr, int i10) {
        this.a = 8;
        this.d = nsVar;
        this.b = i7;
        this.e = objArr;
        this.c = i10;
    }
}
