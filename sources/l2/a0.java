package l2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.ib;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qb;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.yo;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.an;
import org.telegram.ui.el;
import org.telegram.ui.jl;
import org.telegram.ui.lm;
import org.telegram.ui.q8;
import org.telegram.ui.uw;
import org.telegram.ui.vw;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a0(int i7, int i10, String str, String str2) {
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
        final int i11 = 1;
        int i12 = this.b;
        int i13 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                i0 i0Var = ((c0) obj2).a;
                Surface surface = new Surface((SurfaceTexture) obj);
                i0Var.x1(surface);
                i0Var.U = surface;
                i0Var.q1(i12, i13);
                break;
            case 1:
                String str = (String) obj;
                gc gcVar = ((qb) obj2).b;
                if (i12 != 1) {
                    gcVar.s.c(new ib(gcVar, str, i11));
                }
                qs.f(i13).k(qs.Z1, str, Integer.valueOf(i12));
                break;
            case 2:
                ((ui) obj2).x1((List) obj, i12, i13, true);
                break;
            case 3:
                ui uiVar = (ui) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        uiVar.getMessagesStorage().b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
                        executeFast.requery();
                        int i14 = 4;
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            i14 += ((TLRPC.TL_availableReaction) arrayList.get(i15)).getObjectSize();
                        }
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i14);
                        nativeByteBuffer.writeInt32(arrayList.size());
                        while (r6 < arrayList.size()) {
                            ((TLRPC.TL_availableReaction) arrayList.get(r6)).serializeToStream(nativeByteBuffer);
                            r6++;
                        }
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i12);
                        executeFast.bindInteger(3, i13);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                        break;
                    } else {
                        SQLitePreparedStatement executeFast2 = uiVar.getMessagesStorage().b.executeFast("UPDATE reactions SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindLong(1, i13);
                        executeFast2.step();
                        executeFast2.dispose();
                        break;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 4:
                qp qpVar = (qp) obj2;
                qpVar.r1.clear();
                qpVar.w1.clear();
                yr messagesStorage = qpVar.getMessagesStorage();
                messagesStorage.H();
                qpVar.q4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                qpVar.P1().q();
                break;
            case 5:
                yo yoVar = (yo) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                yoVar.h.Y3(photos_photos.users, false);
                yoVar.d(i12, i13, photos_photos);
                break;
            case 6:
                yo yoVar2 = (yo) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                qp qpVar2 = yoVar2.h;
                qpVar2.Y3(messages_messages.users, false);
                qpVar2.S3(messages_messages.chats, false);
                TLRPC.TL_photos_photos tL_photos_photos = new TLRPC.TL_photos_photos();
                tL_photos_photos.count = messages_messages.count;
                int i16 = 0;
                while (r6 < messages_messages.messages.size()) {
                    TLRPC.MessageAction messageAction = messages_messages.messages.get(r6).action;
                    if (messageAction != null) {
                        TLRPC.Photo photo = messageAction.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            tL_photos_photos.photos.add(photo);
                            r6++;
                        }
                    }
                    i16++;
                    r6++;
                }
                if (i12 == 0 && messages_messages.messages.size() >= messages_messages.count) {
                    tL_photos_photos.count -= i16;
                }
                yoVar2.d(i12, i13, tL_photos_photos);
                break;
            case 7:
                yr yrVar = (yr) obj2;
                byte[] bArr = (byte[]) obj;
                yrVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = yrVar.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
                    executeFast3.bindInteger(1, i12);
                    executeFast3.bindInteger(2, i13);
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
                    yrVar.o(e11, true);
                    return;
                }
            case 8:
                qs qsVar = (qs) obj2;
                qsVar.l((Object[]) obj, i12, false);
                qsVar.q.remove(i13);
                break;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i12, (String) obj2, (String) obj, i13);
                break;
            case 10:
                ((an) obj2).didReceivedNotification(i12, i13, (Object[]) obj);
                break;
            case 11:
                el elVar = (el) obj2;
                elVar.getClass();
                ij messageObject = ((org.telegram.ui.Cells.t0) obj).getMessageObject();
                jl jlVar = elVar.a;
                jlVar.Q.xb(this.b, messageObject.f1(), true, ij.B0(messageObject.k) == jlVar.Q.b7 ? 1 : 0, true, 0, Integer.valueOf(i13), null, null);
                break;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                an anVar = ((lm) obj2).a;
                if (anVar.O1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    anVar.O1.setTranslationY(org.telegram.messenger.camera.q.D(520.0f, r2[1] - r3.getTop(), i12));
                    anVar.O1.p(0.0f, (-org.telegram.messenger.g0.L(16.0f)) + r2[0] + i13);
                    anVar.O1.w();
                    break;
                }
                break;
            default:
                final uw uwVar = (uw) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                vw vwVar = uwVar.g;
                ww wwVar = uwVar.h;
                ArrayList arrayList2 = wwVar.R1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i17 = dialog.pinnedNum;
                    wwVar.W0 = null;
                    vwVar.a.invalidate();
                    int N0 = vwVar.c.N0();
                    if (N0 == i12 - 1) {
                        vwVar.c.m(N0).requestLayout();
                    }
                    if (wwVar.getMessagesController().C2(dialog.id, false)) {
                        wwVar.getMessagesController().j2();
                        vwVar.y.D();
                        vwVar.q(true);
                        break;
                    } else {
                        int d = wwVar.getMessagesController().d(wwVar.W2 == 0 ? 1 : 0, -1, dialog.id);
                        if (d != 2 || i13 != 0) {
                            vwVar.y.D();
                            vwVar.q(true);
                        }
                        if (wwVar.W2 == 0) {
                            if (d == 2) {
                                boolean z9 = iz.q1;
                                if (z9) {
                                    iz.q1 = !z9;
                                    SharedPreferences.Editor edit = qp.e1().edit();
                                    edit.putBoolean("archiveHidden", iz.q1);
                                    edit.apply();
                                }
                                vwVar.y.D();
                                if (i13 == 0) {
                                    wwVar.M4(true, true);
                                    vwVar.q(true);
                                    wwVar.z3();
                                } else {
                                    vwVar.q(true);
                                    if (!iz.q1 && vwVar.c.L0() == 0) {
                                        wwVar.e2 = true;
                                        vwVar.a.w0(0, -org.telegram.messenger.g0.L(iz.p1 ? 76.0f : 70.0f), null);
                                    }
                                }
                                i7 = ((f2) wwVar).currentAccount;
                                wwVar.R1.add(0, (TLRPC.Dialog) wwVar.d4(i7, vwVar.s, wwVar.W2, false).get(0));
                                vwVar.q(true);
                                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.tw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                uwVar.h.M4(false, true);
                                                break;
                                            default:
                                                uwVar.h.M4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (d == 1) {
                                v4.d1 K = vwVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof t2) {
                                        t2 t2Var = (t2) view;
                                        if (t2Var.a2.n == 2) {
                                            t2Var.b2 = true;
                                            t2Var.c2 = 0.0f;
                                            k6.u1.T(true, 0.0f);
                                            k6.u1.start();
                                            t2Var.invalidate();
                                        }
                                    }
                                }
                                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.tw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                uwVar.h.M4(false, true);
                                                break;
                                            default:
                                                uwVar.h.M4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences e12 = qp.e1();
                            r6 = (e12.getBoolean("archivehint_l", false) || iz.q1) ? 1 : 0;
                            if (r6 == 0) {
                                e12.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView k42 = wwVar.k4();
                            if (k42 != null) {
                                k42.l(dialog.id, r6 != 0 ? 2 : 3, null, new q8(uwVar, dialog, i17, 29));
                            }
                        }
                        if (wwVar.W2 != 0 && wwVar.R1.isEmpty()) {
                            vwVar.a.setEmptyView(null);
                            vwVar.x.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ a0(Object obj, int i7, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i7;
        this.c = i10;
        this.e = obj2;
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ a0(qs qsVar, int i7, Object[] objArr, int i10) {
        this.a = 8;
        this.d = qsVar;
        this.b = i7;
        this.e = objArr;
        this.c = i10;
    }
}
