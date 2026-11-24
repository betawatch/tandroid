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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mp1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mp1(kk7 kk7Var, int i, Object[] objArr, int i2) {
        this.a = (byte) 11;
        this.d = kk7Var;
        this.b = i;
        this.e = objArr;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        final byte b2 = 1;
        int i2 = this.b;
        int i3 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((mu1) obj2).didReceivedNotification(i2, i3, (Object[]) obj);
                break;
            case 1:
                k27 messageObject = ((uk1) obj).getMessageObject();
                mu1 mu1Var = ((qs1) obj2).a.R;
                mu1Var.gb(this.b, messageObject.e1(), true, k27.B0(messageObject.k) == mu1Var.d7 ? 1 : 0, true, 0, Integer.valueOf(i3), null, null);
                break;
            case 2:
                gb2 gb2Var = (gb2) obj;
                mu1 mu1Var2 = ((wt1) obj2).a;
                if (mu1Var2.P1 != null) {
                    gb2Var.getLocationInWindow(new int[2]);
                    mu1Var2.P1.setTranslationY(b00.z(520.0f, r1[1] - r3.getTop(), i2));
                    mu1Var2.P1.o(0.0f, (-gl.L(16.0f)) + r1[0] + i3);
                    mu1Var2.P1.v();
                    break;
                }
                break;
            case 3:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i2, (String) obj2, (String) obj, i3);
                break;
            case 4:
                final aj3 aj3Var = (aj3) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                bj3 bj3Var = aj3Var.h;
                cj3 cj3Var = aj3Var.i;
                ArrayList arrayList = cj3Var.T1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i4 = dialog.pinnedNum;
                    cj3Var.Y0 = null;
                    bj3Var.a.invalidate();
                    int M0 = bj3Var.c.M0();
                    if (M0 == i2 - 1) {
                        bj3Var.c.m(M0).requestLayout();
                    }
                    if (cj3Var.getMessagesController().B2(dialog.id, false)) {
                        cj3Var.getMessagesController().e2();
                        bj3Var.y.D();
                        bj3Var.b(true);
                        break;
                    } else {
                        int b3 = cj3Var.getMessagesController().b(cj3Var.Y2 == 0 ? 1 : 0, -1, dialog.id);
                        if (b3 != 2 || i3 != 0) {
                            bj3Var.y.D();
                            bj3Var.b(true);
                        }
                        if (cj3Var.Y2 == 0) {
                            if (b3 == 2) {
                                boolean z = gba.n1;
                                if (z) {
                                    gba.n1 = !z;
                                    SharedPreferences.Editor edit = na7.c1().edit();
                                    edit.putBoolean("archiveHidden", gba.n1);
                                    edit.apply();
                                }
                                bj3Var.y.D();
                                if (i3 == 0) {
                                    cj3Var.Q4(true, true);
                                    bj3Var.b(true);
                                    cj3Var.G2();
                                } else {
                                    bj3Var.b(true);
                                    if (!gba.n1 && bj3Var.c.K0() == 0) {
                                        cj3Var.g2 = true;
                                        bj3Var.a.x0(0, -gl.L(gba.m1 ? 76.0f : 70.0f), null);
                                    }
                                }
                                i = ((d) cj3Var).currentAccount;
                                cj3Var.T1.add(0, (TLRPC.Dialog) cj3Var.m3(i, bj3Var.s, cj3Var.Y2, false).get(0));
                                bj3Var.b(true);
                                gl.e3(new Runnable() { // from class: zi3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = r2;
                                        aj3 aj3Var2 = aj3Var;
                                        switch (b4) {
                                            case 0:
                                                aj3Var2.i.Q4(false, true);
                                                break;
                                            default:
                                                aj3Var2.i.Q4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (b3 == 1) {
                                s49 K = bj3Var.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof ue3) {
                                        ue3 ue3Var = (ue3) view;
                                        if (ue3Var.b2.n == 2) {
                                            ue3Var.c2 = true;
                                            ue3Var.d2 = 0.0f;
                                            bkb.t1.O(true, 0.0f);
                                            bkb.t1.start();
                                            ue3Var.invalidate();
                                        }
                                    }
                                }
                                gl.e3(new Runnable() { // from class: zi3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b2;
                                        aj3 aj3Var2 = aj3Var;
                                        switch (b4) {
                                            case 0:
                                                aj3Var2.i.Q4(false, true);
                                                break;
                                            default:
                                                aj3Var2.i.Q4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences c1 = na7.c1();
                            r5 = (c1.getBoolean("archivehint_l", false) || gba.n1) ? (byte) 1 : (byte) 0;
                            if (r5 == 0) {
                                c1.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView u3 = cj3Var.u3();
                            if (u3 != null) {
                                u3.l(dialog.id, r5 != 0 ? 2 : 3, null, new va7((Object) aj3Var, (Object) dialog, i4, (byte) 19));
                            }
                        }
                        if (cj3Var.Y2 != 0 && cj3Var.T1.isEmpty()) {
                            bj3Var.a.setEmptyView(null);
                            bj3Var.x.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 5:
                y54 y54Var = ((t54) obj2).a;
                Surface surface = new Surface((SurfaceTexture) obj);
                y54Var.q1(surface);
                y54Var.U = surface;
                y54Var.f1(i2, i3);
                break;
            case 6:
                String str = (String) obj;
                fl5 fl5Var = ((pk5) obj2).b;
                if (i2 != 1) {
                    fl5Var.s.c(new jk5(fl5Var, str, b2));
                }
                kk7.f(i3).k(kk7.Y1, str, Integer.valueOf(i2));
                break;
            case 7:
                na7 na7Var = (na7) obj2;
                na7Var.i1.clear();
                na7Var.p1.clear();
                ad7 messagesStorage = na7Var.getMessagesStorage();
                messagesStorage.G();
                na7Var.r4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                na7Var.M1().p();
                break;
            case 8:
                w97 w97Var = (w97) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                w97Var.h.a4(photos_photos.users, false);
                w97Var.d(i2, i3, photos_photos);
                break;
            case 9:
                w97 w97Var2 = (w97) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                na7 na7Var2 = w97Var2.h;
                na7Var2.a4(messages_messages.users, false);
                na7Var2.U3(messages_messages.chats, false);
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
                w97Var2.d(i2, i3, tL_photos_photos);
                break;
            case 10:
                ad7 ad7Var = (ad7) obj2;
                byte[] bArr = (byte[]) obj;
                try {
                    SQLitePreparedStatement executeFast = ad7Var.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
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
                    ad7Var.n(e, true);
                    return;
                }
            default:
                kk7 kk7Var = (kk7) obj2;
                kk7Var.l((Object[]) obj, i2, false);
                kk7Var.q.remove(i3);
                break;
        }
    }

    public /* synthetic */ mp1(int i, int i2, String str, String str2) {
        this.a = (byte) 3;
        this.b = i;
        this.d = str;
        this.e = str2;
        this.c = i2;
    }

    public /* synthetic */ mp1(Object obj, int i, int i2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
        this.e = obj2;
    }

    public /* synthetic */ mp1(Object obj, Object obj2, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }
}
