package k2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bb;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jb;
import org.telegram.messenger.li;
import org.telegram.messenger.po;
import org.telegram.messenger.qr;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.al;
import org.telegram.ui.fl;
import org.telegram.ui.hm;
import org.telegram.ui.rw;
import org.telegram.ui.sw;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a0(int i3, int i10, String str, String str2) {
        this.a = 9;
        this.b = i3;
        this.d = str;
        this.e = str2;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10 = this.a;
        final int i11 = 0;
        final int i12 = 1;
        int i13 = this.b;
        int i14 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                i0 i0Var = ((c0) obj2).a;
                Surface surface = new Surface((SurfaceTexture) obj);
                i0Var.x1(surface);
                i0Var.U = surface;
                i0Var.q1(i13, i14);
                break;
            case 1:
                String str = (String) obj;
                zb zbVar = ((jb) obj2).b;
                if (i13 != 1) {
                    zbVar.s.c(new bb(zbVar, str, i12));
                }
                hs.f(i14).k(hs.Z1, str, Integer.valueOf(i13));
                break;
            case 2:
                ((li) obj2).x1((List) obj, i13, i14, true);
                break;
            case 3:
                li liVar = (li) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        liVar.getMessagesStorage().b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = liVar.getMessagesStorage().b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
                        executeFast.requery();
                        int i15 = 4;
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            i15 += ((TLRPC.TL_availableReaction) arrayList.get(i16)).getObjectSize();
                        }
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i15);
                        nativeByteBuffer.writeInt32(arrayList.size());
                        while (i11 < arrayList.size()) {
                            ((TLRPC.TL_availableReaction) arrayList.get(i11)).serializeToStream(nativeByteBuffer);
                            i11++;
                        }
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i13);
                        executeFast.bindInteger(3, i14);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                        break;
                    } else {
                        SQLitePreparedStatement executeFast2 = liVar.getMessagesStorage().b.executeFast("UPDATE reactions SET date = ?");
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
                hp hpVar = (hp) obj2;
                hpVar.s1.clear();
                hpVar.x1.clear();
                qr messagesStorage = hpVar.getMessagesStorage();
                messagesStorage.H();
                hpVar.q4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                hpVar.P1().q();
                break;
            case 5:
                po poVar = (po) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                poVar.h.Y3(photos_photos.users, false);
                poVar.d(i13, i14, photos_photos);
                break;
            case 6:
                po poVar2 = (po) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                hp hpVar2 = poVar2.h;
                hpVar2.Y3(messages_messages.users, false);
                hpVar2.S3(messages_messages.chats, false);
                TLRPC.TL_photos_photos tL_photos_photos = new TLRPC.TL_photos_photos();
                tL_photos_photos.count = messages_messages.count;
                int i17 = 0;
                while (i11 < messages_messages.messages.size()) {
                    TLRPC.MessageAction messageAction = messages_messages.messages.get(i11).action;
                    if (messageAction != null) {
                        TLRPC.Photo photo = messageAction.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            tL_photos_photos.photos.add(photo);
                            i11++;
                        }
                    }
                    i17++;
                    i11++;
                }
                if (i13 == 0 && messages_messages.messages.size() >= messages_messages.count) {
                    tL_photos_photos.count -= i17;
                }
                poVar2.d(i13, i14, tL_photos_photos);
                break;
            case 7:
                qr qrVar = (qr) obj2;
                byte[] bArr = (byte[]) obj;
                qrVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = qrVar.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
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
                    qrVar.o(e11, true);
                    return;
                }
            case 8:
                hs hsVar = (hs) obj2;
                hsVar.l((Object[]) obj, i13, false);
                hsVar.q.remove(i14);
                break;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i13, (String) obj2, (String) obj, i14);
                break;
            case 10:
                ((wm) obj2).didReceivedNotification(i13, i14, (Object[]) obj);
                break;
            case 11:
                al alVar = (al) obj2;
                alVar.getClass();
                zi messageObject = ((org.telegram.ui.Cells.t0) obj).getMessageObject();
                fl flVar = alVar.a;
                flVar.R.xb(this.b, messageObject.f1(), true, zi.B0(messageObject.k) == flVar.R.c7 ? 1 : 0, true, 0, Integer.valueOf(i14), null, null);
                break;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                wm wmVar = ((hm) obj2).a;
                if (wmVar.P1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    wmVar.P1.setTranslationY(org.telegram.messenger.camera.q.D(520.0f, r2[1] - r3.getTop(), i13));
                    wmVar.P1.p(0.0f, (-org.telegram.messenger.g0.L(16.0f)) + r2[0] + i14);
                    wmVar.P1.w();
                    break;
                }
                break;
            default:
                final sw swVar = (sw) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                tw twVar = swVar.g;
                uw uwVar = swVar.h;
                ArrayList arrayList2 = uwVar.S1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i18 = dialog.pinnedNum;
                    uwVar.X0 = null;
                    twVar.a.invalidate();
                    int N0 = twVar.c.N0();
                    if (N0 == i13 - 1) {
                        twVar.c.m(N0).requestLayout();
                    }
                    if (uwVar.getMessagesController().C2(dialog.id, false)) {
                        uwVar.getMessagesController().j2();
                        twVar.y.D();
                        twVar.q(true);
                        break;
                    } else {
                        int d = uwVar.getMessagesController().d(uwVar.X2 == 0 ? 1 : 0, -1, dialog.id);
                        if (d != 2 || i14 != 0) {
                            twVar.y.D();
                            twVar.q(true);
                        }
                        if (uwVar.X2 == 0) {
                            if (d == 2) {
                                boolean z10 = az.q1;
                                if (z10) {
                                    az.q1 = !z10;
                                    SharedPreferences.Editor edit = hp.e1().edit();
                                    edit.putBoolean("archiveHidden", az.q1);
                                    edit.apply();
                                }
                                twVar.y.D();
                                if (i14 == 0) {
                                    uwVar.M4(true, true);
                                    twVar.q(true);
                                    uwVar.z3();
                                } else {
                                    twVar.q(true);
                                    if (!az.q1 && twVar.c.L0() == 0) {
                                        uwVar.f2 = true;
                                        twVar.a.w0(0, -org.telegram.messenger.g0.L(az.p1 ? 76.0f : 70.0f), null);
                                    }
                                }
                                i3 = ((d2) uwVar).currentAccount;
                                uwVar.S1.add(0, (TLRPC.Dialog) uwVar.d4(i3, twVar.s, uwVar.X2, false).get(0));
                                twVar.q(true);
                                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.qw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                swVar.h.M4(false, true);
                                                break;
                                            default:
                                                swVar.h.M4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (d == 1) {
                                u4.d1 K = twVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof t2) {
                                        t2 t2Var = (t2) view;
                                        if (t2Var.b2.n == 2) {
                                            t2Var.c2 = true;
                                            t2Var.d2 = 0.0f;
                                            k6.u1.T(true, 0.0f);
                                            k6.u1.start();
                                            t2Var.invalidate();
                                        }
                                    }
                                }
                                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.ui.qw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                swVar.h.M4(false, true);
                                                break;
                                            default:
                                                swVar.h.M4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences e12 = hp.e1();
                            boolean z11 = e12.getBoolean("archivehint_l", false) || az.q1;
                            if (!z11) {
                                e12.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView k42 = uwVar.k4();
                            if (k42 != null) {
                                k42.l(dialog.id, z11 ? 2 : 3, null, new rw(swVar, dialog, i18, i11));
                            }
                        }
                        if (uwVar.X2 != 0 && uwVar.S1.isEmpty()) {
                            twVar.a.setEmptyView(null);
                            twVar.x.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ a0(Object obj, int i3, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i3;
        this.c = i10;
        this.e = obj2;
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
        this.c = i10;
    }

    public /* synthetic */ a0(hs hsVar, int i3, Object[] objArr, int i10) {
        this.a = 8;
        this.d = hsVar;
        this.b = i3;
        this.e = objArr;
        this.c = i10;
    }
}
