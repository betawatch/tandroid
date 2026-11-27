// default package

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aq1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aq1(jn7 jn7Var, int i, Object[] objArr, int i2) {
        this.a = (byte) 11;
        this.d = jn7Var;
        this.b = i;
        this.e = objArr;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        byte b2 = 2;
        final byte b3 = 1;
        int i2 = this.b;
        int i3 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((zu1) obj2).didReceivedNotification(i2, i3, (Object[]) obj);
                break;
            case 1:
                r47 messageObject = ((dl1) obj).getMessageObject();
                zu1 zu1Var = ((dt1) obj2).a.R;
                zu1Var.tb(this.b, messageObject.e1(), true, r47.B0(messageObject.k) == zu1Var.d7 ? 1 : 0, true, 0, Integer.valueOf(i3), null, null);
                break;
            case 2:
                wb2 wb2Var = (wb2) obj;
                zu1 zu1Var2 = ((ju1) obj2).a;
                if (zu1Var2.P1 != null) {
                    wb2Var.getLocationInWindow(new int[2]);
                    zu1Var2.P1.setTranslationY(c00.A(520.0f, r1[1] - r3.getTop(), i2));
                    zu1Var2.P1.o(0.0f, (-hl.L(16.0f)) + r1[0] + i3);
                    zu1Var2.P1.v();
                    break;
                }
                break;
            case 3:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i2, (String) obj2, (String) obj, i3);
                break;
            case 4:
                final sj3 sj3Var = (sj3) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                tj3 tj3Var = sj3Var.h;
                uj3 uj3Var = sj3Var.i;
                ArrayList arrayList = uj3Var.T1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i4 = dialog.pinnedNum;
                    uj3Var.Y0 = null;
                    tj3Var.a.invalidate();
                    int M0 = tj3Var.c.M0();
                    if (M0 == i2 - 1) {
                        tj3Var.c.m(M0).requestLayout();
                    }
                    if (uj3Var.getMessagesController().G2(dialog.id, false)) {
                        uj3Var.getMessagesController().g2();
                        tj3Var.y.D();
                        tj3Var.b(true);
                        break;
                    } else {
                        int b4 = uj3Var.getMessagesController().b(uj3Var.Y2 == 0 ? 1 : 0, -1, dialog.id);
                        if (b4 != 2 || i3 != 0) {
                            tj3Var.y.D();
                            tj3Var.b(true);
                        }
                        if (uj3Var.Y2 == 0) {
                            if (b4 == 2) {
                                boolean z = xea.m1;
                                if (z) {
                                    xea.m1 = !z;
                                    SharedPreferences.Editor edit = uc7.e1().edit();
                                    edit.putBoolean("archiveHidden", xea.m1);
                                    edit.apply();
                                }
                                tj3Var.y.D();
                                if (i3 == 0) {
                                    uj3Var.U4(true, true);
                                    tj3Var.b(true);
                                    uj3Var.I2();
                                } else {
                                    tj3Var.b(true);
                                    if (!xea.m1 && tj3Var.c.K0() == 0) {
                                        uj3Var.g2 = true;
                                        tj3Var.a.y0(0, -hl.L(xea.l1 ? 76.0f : 70.0f), null);
                                    }
                                }
                                i = ((e) uj3Var).currentAccount;
                                uj3Var.T1.add(0, (TLRPC.Dialog) uj3Var.o3(i, tj3Var.s, uj3Var.Y2, false).get(0));
                                tj3Var.b(true);
                                hl.d3(new Runnable() { // from class: rj3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b5 = r2;
                                        sj3 sj3Var2 = sj3Var;
                                        switch (b5) {
                                            case 0:
                                                sj3Var2.i.U4(false, true);
                                                break;
                                            default:
                                                sj3Var2.i.U4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (b4 == 1) {
                                f89 L = tj3Var.a.L(0);
                                if (L != null) {
                                    View view = L.a;
                                    if (view instanceof of3) {
                                        of3 of3Var = (of3) view;
                                        if (of3Var.b2.n == 2) {
                                            of3Var.c2 = true;
                                            of3Var.d2 = 0.0f;
                                            aob.u1.O(true, 0.0f);
                                            aob.u1.start();
                                            of3Var.invalidate();
                                        }
                                    }
                                }
                                hl.d3(new Runnable() { // from class: rj3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b5 = b3;
                                        sj3 sj3Var2 = sj3Var;
                                        switch (b5) {
                                            case 0:
                                                sj3Var2.i.U4(false, true);
                                                break;
                                            default:
                                                sj3Var2.i.U4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences e1 = uc7.e1();
                            r6 = (e1.getBoolean("archivehint_l", false) || xea.m1) ? (byte) 1 : (byte) 0;
                            if (r6 == 0) {
                                e1.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView w3 = uj3Var.w3();
                            if (w3 != null) {
                                w3.l(dialog.id, r6 != 0 ? 2 : 3, null, new bf7((Object) sj3Var, (Object) dialog, i4, (byte) 19));
                            }
                        }
                        if (uj3Var.Y2 != 0 && uj3Var.T1.isEmpty()) {
                            tj3Var.a.setEmptyView(null);
                            tj3Var.x.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 5:
                s64 s64Var = ((n64) obj2).a;
                Surface surface = new Surface((SurfaceTexture) obj);
                s64Var.q1(surface);
                s64Var.U = surface;
                s64Var.f1(i2, i3);
                break;
            case 6:
                String str = (String) obj;
                in5 in5Var = ((sm5) obj2).b;
                if (i2 != 1) {
                    in5Var.s.c(new mm5(in5Var, str, b2));
                }
                jn7.f(i3).k(jn7.Z1, str, Integer.valueOf(i2));
                break;
            case 7:
                uc7 uc7Var = (uc7) obj2;
                uc7Var.i1.clear();
                uc7Var.p1.clear();
                kf7 messagesStorage = uc7Var.getMessagesStorage();
                messagesStorage.I();
                uc7Var.A4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                uc7Var.O1().p();
                break;
            case 8:
                dc7 dc7Var = (dc7) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                dc7Var.h.j4(photos_photos.users, false);
                dc7Var.d(i2, i3, photos_photos);
                break;
            case 9:
                dc7 dc7Var2 = (dc7) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                uc7 uc7Var2 = dc7Var2.h;
                uc7Var2.j4(messages_messages.users, false);
                uc7Var2.c4(messages_messages.chats, false);
                TLRPC.TL_photos_photos tL_photos_photos = new TLRPC.TL_photos_photos();
                tL_photos_photos.count = messages_messages.count;
                int i5 = 0;
                for (int i6 = 0; i6 < messages_messages.messages.size(); i6++) {
                    TLRPC.MessageAction messageAction = messages_messages.messages.get(i6).action;
                    if (messageAction != null) {
                        TLRPC.Photo photo = messageAction.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            tL_photos_photos.photos.add(photo);
                        }
                    }
                    i5++;
                }
                if (i2 == 0 && messages_messages.messages.size() >= messages_messages.count) {
                    tL_photos_photos.count -= i5;
                }
                dc7Var2.d(i2, i3, tL_photos_photos);
                break;
            case 10:
                kf7 kf7Var = (kf7) obj2;
                byte[] bArr = (byte[]) obj;
                try {
                    SQLitePreparedStatement executeFast = kf7Var.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
                    executeFast.bindInteger(1, i2);
                    executeFast.bindInteger(2, i3);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(bArr != null ? bArr.length : 1);
                    if (bArr != null) {
                        nativeByteBuffer.writeBytes(bArr);
                    }
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                    break;
                } catch (Exception e) {
                    kf7Var.p(e, true);
                    return;
                }
            default:
                jn7 jn7Var = (jn7) obj2;
                jn7Var.l((Object[]) obj, i2, false);
                jn7Var.q.remove(i3);
                break;
        }
    }

    public /* synthetic */ aq1(int i, int i2, String str, String str2) {
        this.a = (byte) 3;
        this.b = i;
        this.d = str;
        this.e = str2;
        this.c = i2;
    }

    public /* synthetic */ aq1(Object obj, int i, int i2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
        this.e = obj2;
    }

    public /* synthetic */ aq1(Object obj, Object obj2, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }
}
