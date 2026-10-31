package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.dp;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.hs;
import org.telegram.messenger.ib;
import org.telegram.messenger.jj;
import org.telegram.messenger.rb;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.am;
import org.telegram.ui.ay;
import org.telegram.ui.fm;
import org.telegram.ui.fn;
import org.telegram.ui.un;
import org.telegram.ui.yx;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a0(int i10, int i11, String str, String str2) {
        this.a = 9;
        this.b = i10;
        this.d = str;
        this.e = str2;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        final int i12 = 1;
        int i13 = this.b;
        int i14 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                i0 i0Var = ((c0) obj2).a;
                Surface surface = new Surface((SurfaceTexture) obj);
                i0Var.x1(surface);
                i0Var.U = surface;
                i0Var.q1(i13, i14);
                break;
            case 1:
                String str = (String) obj;
                hc hcVar = ((rb) obj2).b;
                if (i13 != 1) {
                    hcVar.s.c(new ib(hcVar, str, i12));
                }
                zs.f(i14).k(zs.Z1, str, Integer.valueOf(i13));
                break;
            case 2:
                ((ui) obj2).x1((List) obj, i13, i14, true);
                break;
            case 3:
                ui uiVar = (ui) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        uiVar.getMessagesStorage().b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
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
                        SQLitePreparedStatement executeFast2 = uiVar.getMessagesStorage().b.executeFast("UPDATE reactions SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindLong(1, i14);
                        executeFast2.step();
                        executeFast2.dispose();
                        break;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 4:
                vp vpVar = (vp) obj2;
                vpVar.r1.clear();
                vpVar.w1.clear();
                hs messagesStorage = vpVar.getMessagesStorage();
                messagesStorage.H();
                vpVar.n4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                vpVar.O1().q();
                break;
            case 5:
                dp dpVar = (dp) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                dpVar.h.V3(photos_photos.users, false);
                dpVar.c(i13, i14, photos_photos);
                break;
            case 6:
                dp dpVar2 = (dp) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                vp vpVar2 = dpVar2.h;
                vpVar2.V3(messages_messages.users, false);
                vpVar2.P3(messages_messages.chats, false);
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
                dpVar2.c(i13, i14, tL_photos_photos);
                break;
            case 7:
                hs hsVar = (hs) obj2;
                byte[] bArr = (byte[]) obj;
                hsVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = hsVar.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
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
                } catch (Exception e7) {
                    hsVar.o(e7, true);
                    return;
                }
            case 8:
                zs zsVar = (zs) obj2;
                zsVar.l((Object[]) obj, i13, false);
                zsVar.q.remove(i14);
                break;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i13, (String) obj2, (String) obj, i14);
                break;
            case 10:
                ((un) obj2).didReceivedNotification(i13, i14, (Object[]) obj);
                break;
            case 11:
                am amVar = (am) obj2;
                amVar.getClass();
                jj messageObject = ((org.telegram.ui.Cells.s0) obj).getMessageObject();
                fm fmVar = amVar.a;
                fmVar.Q.nb(this.b, messageObject.f1(), true, jj.B0(messageObject.k) == fmVar.Q.b7 ? 1 : 0, true, 0, Integer.valueOf(i14), null, null);
                break;
            case 12:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                un unVar = ((fn) obj2).a;
                if (unVar.O1 != null) {
                    q1Var.getLocationInWindow(new int[2]);
                    unVar.O1.setTranslationY(z20.D(520.0f, r2[1] - r3.getTop(), i13));
                    unVar.O1.m(0.0f, (-org.telegram.messenger.i0.L(16.0f)) + r2[0] + i14);
                    unVar.O1.u();
                    break;
                }
                break;
            default:
                final yx yxVar = (yx) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                zx zxVar = yxVar.g;
                ay ayVar = yxVar.h;
                ArrayList arrayList2 = ayVar.R1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i18 = dialog.pinnedNum;
                    ayVar.W0 = null;
                    zxVar.a.invalidate();
                    int N0 = zxVar.c.N0();
                    if (N0 == i13 - 1) {
                        zxVar.c.m(N0).requestLayout();
                    }
                    if (ayVar.getMessagesController().B2(dialog.id, false)) {
                        ayVar.getMessagesController().i2();
                        zxVar.y.D();
                        zxVar.q(true);
                        break;
                    } else {
                        int d = ayVar.getMessagesController().d(ayVar.W2 == 0 ? 1 : 0, -1, dialog.id);
                        if (d != 2 || i14 != 0) {
                            zxVar.y.D();
                            zxVar.q(true);
                        }
                        if (ayVar.W2 == 0) {
                            if (d == 2) {
                                boolean z10 = tz.q1;
                                if (z10) {
                                    tz.q1 = !z10;
                                    SharedPreferences.Editor edit = vp.d1().edit();
                                    edit.putBoolean("archiveHidden", tz.q1);
                                    edit.apply();
                                }
                                zxVar.y.D();
                                if (i14 == 0) {
                                    ayVar.L4(true, true);
                                    zxVar.q(true);
                                    ayVar.y3();
                                } else {
                                    zxVar.q(true);
                                    if (!tz.q1 && zxVar.c.L0() == 0) {
                                        ayVar.e2 = true;
                                        zxVar.a.w0(0, -org.telegram.messenger.i0.L(tz.p1 ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((k2) ayVar).currentAccount;
                                ayVar.R1.add(0, (TLRPC.Dialog) ayVar.c4(i10, zxVar.s, ayVar.W2, false).get(0));
                                zxVar.q(true);
                                org.telegram.messenger.i0.h3(new Runnable() { // from class: org.telegram.ui.xx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                yxVar.h.L4(false, true);
                                                break;
                                            default:
                                                yxVar.h.L4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (d == 1) {
                                s4.c1 K = zxVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof v2) {
                                        v2 v2Var = (v2) view;
                                        if (v2Var.a2.n == 2) {
                                            v2Var.b2 = true;
                                            v2Var.c2 = 0.0f;
                                            t6.u1.T(true, 0.0f);
                                            t6.u1.start();
                                            v2Var.invalidate();
                                        }
                                    }
                                }
                                org.telegram.messenger.i0.h3(new Runnable() { // from class: org.telegram.ui.xx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                yxVar.h.L4(false, true);
                                                break;
                                            default:
                                                yxVar.h.L4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences d12 = vp.d1();
                            r6 = (d12.getBoolean("archivehint_l", false) || tz.q1) ? 1 : 0;
                            if (r6 == 0) {
                                d12.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView j42 = ayVar.j4();
                            if (j42 != null) {
                                j42.l(dialog.id, r6 != 0 ? 2 : 3, null, new ji0(yxVar, dialog, i18, 16));
                            }
                        }
                        if (ayVar.W2 != 0 && ayVar.R1.isEmpty()) {
                            zxVar.a.setEmptyView(null);
                            zxVar.x.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ a0(Object obj, int i10, int i11, Object obj2, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
        this.e = obj2;
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ a0(zs zsVar, int i10, Object[] objArr, int i11) {
        this.a = 8;
        this.d = zsVar;
        this.b = i10;
        this.e = objArr;
        this.c = i11;
    }
}
