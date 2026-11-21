package l2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.gb;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ob;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.uo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.j01;
import org.telegram.ui.ax;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.fl;
import org.telegram.ui.kl;
import org.telegram.ui.mm;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        int i11 = 3;
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
                ec ecVar = ((ob) obj2).b;
                if (i13 != 1) {
                    ecVar.s.c(new gb(ecVar, str, i12));
                }
                ks.f(i14).k(ks.Z1, str, Integer.valueOf(i13));
                break;
            case 2:
                ((ri) obj2).A1((List) obj, i13, i14, true);
                break;
            case 3:
                ri riVar = (ri) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList != null) {
                        riVar.getMessagesStorage().b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = riVar.getMessagesStorage().b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
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
                        SQLitePreparedStatement executeFast2 = riVar.getMessagesStorage().b.executeFast("UPDATE reactions SET date = ?");
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
                mp mpVar = (mp) obj2;
                mpVar.s1.clear();
                mpVar.z1.clear();
                tr messagesStorage = mpVar.getMessagesStorage();
                messagesStorage.H();
                mpVar.y4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                mpVar.R1().q();
                break;
            case 5:
                uo uoVar = (uo) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                uoVar.h.f4(photos_photos.users, false);
                uoVar.d(i13, i14, photos_photos);
                break;
            case 6:
                uo uoVar2 = (uo) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                mp mpVar2 = uoVar2.h;
                mpVar2.f4(messages_messages.users, false);
                mpVar2.Z3(messages_messages.chats, false);
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
                uoVar2.d(i13, i14, tL_photos_photos);
                break;
            case 7:
                tr trVar = (tr) obj2;
                byte[] bArr = (byte[]) obj;
                trVar.getClass();
                try {
                    SQLitePreparedStatement executeFast3 = trVar.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
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
                    trVar.o(e11, true);
                    return;
                }
            case 8:
                ks ksVar = (ks) obj2;
                ksVar.l((Object[]) obj, i13, false);
                ksVar.q.remove(i14);
                break;
            case 9:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i13, (String) obj2, (String) obj, i14);
                break;
            case 10:
                ((bn) obj2).didReceivedNotification(i13, i14, (Object[]) obj);
                break;
            case 11:
                fl flVar = (fl) obj2;
                flVar.getClass();
                fj messageObject = ((org.telegram.ui.Cells.v0) obj).getMessageObject();
                kl klVar = flVar.a;
                klVar.R.Bb(this.b, messageObject.e1(), true, fj.B0(messageObject.k) == klVar.R.d7 ? 1 : 0, true, 0, Integer.valueOf(i14), null, null);
                break;
            case 12:
                r1 r1Var = (r1) obj;
                bn bnVar = ((mm) obj2).a;
                if (bnVar.P1 != null) {
                    r1Var.getLocationInWindow(new int[2]);
                    bnVar.P1.setTranslationY(org.telegram.ui.Cells.c0.i(520.0f, r2[1] - r3.getTop(), i13));
                    bnVar.P1.p(0.0f, (-org.telegram.messenger.g0.L(16.0f)) + r2[0] + i14);
                    bnVar.P1.x();
                    break;
                }
                break;
            default:
                final ax axVar = (ax) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                bx bxVar = axVar.g;
                cx cxVar = axVar.h;
                ArrayList arrayList2 = cxVar.T1;
                if (arrayList2 != null) {
                    arrayList2.remove(dialog);
                    int i18 = dialog.pinnedNum;
                    cxVar.Y0 = null;
                    bxVar.a.invalidate();
                    int N0 = bxVar.c.N0();
                    if (N0 == i13 - 1) {
                        bxVar.c.m(N0).requestLayout();
                    }
                    if (cxVar.getMessagesController().I2(dialog.id, false)) {
                        cxVar.getMessagesController().l2();
                        bxVar.y.D();
                        bxVar.q(true);
                        break;
                    } else {
                        int d = cxVar.getMessagesController().d(cxVar.Y2 == 0 ? 1 : 0, -1, dialog.id);
                        if (d != 2 || i14 != 0) {
                            bxVar.y.D();
                            bxVar.q(true);
                        }
                        if (cxVar.Y2 == 0) {
                            if (d == 2) {
                                boolean z10 = bz.q1;
                                if (z10) {
                                    bz.q1 = !z10;
                                    SharedPreferences.Editor edit = mp.g1().edit();
                                    edit.putBoolean("archiveHidden", bz.q1);
                                    edit.apply();
                                }
                                bxVar.y.D();
                                if (i14 == 0) {
                                    cxVar.U4(true, true);
                                    bxVar.q(true);
                                    cxVar.z3();
                                } else {
                                    bxVar.q(true);
                                    if (!bz.q1 && bxVar.c.L0() == 0) {
                                        cxVar.g2 = true;
                                        bxVar.a.w0(0, -org.telegram.messenger.g0.L(bz.p1 ? 76.0f : 70.0f), null);
                                    }
                                }
                                i7 = ((g2) cxVar).currentAccount;
                                cxVar.T1.add(0, (TLRPC.Dialog) cxVar.d4(i7, bxVar.s, cxVar.Y2, false).get(0));
                                bxVar.q(true);
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.zw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                axVar.h.U4(false, true);
                                                break;
                                            default:
                                                axVar.h.U4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (d == 1) {
                                v4.f1 K = bxVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof u2) {
                                        u2 u2Var = (u2) view;
                                        if (u2Var.b2.n == 2) {
                                            u2Var.c2 = true;
                                            u2Var.d2 = 0.0f;
                                            m6.u1.T(true, 0.0f);
                                            m6.u1.start();
                                            u2Var.invalidate();
                                        }
                                    }
                                }
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.zw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                axVar.h.U4(false, true);
                                                break;
                                            default:
                                                axVar.h.U4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences g12 = mp.g1();
                            r6 = (g12.getBoolean("archivehint_l", false) || bz.q1) ? 1 : 0;
                            if (r6 == 0) {
                                g12.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView l42 = cxVar.l4();
                            if (l42 != null) {
                                l42.l(dialog.id, r6 != 0 ? 2 : 3, null, new j01(axVar, dialog, i18, i11));
                            }
                        }
                        if (cxVar.Y2 != 0 && cxVar.T1.isEmpty()) {
                            bxVar.a.setEmptyView(null);
                            bxVar.x.setVisibility(4);
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

    public /* synthetic */ x(ks ksVar, int i7, Object[] objArr, int i10) {
        this.a = 8;
        this.d = ksVar;
        this.b = i7;
        this.e = objArr;
        this.c = i10;
    }
}
