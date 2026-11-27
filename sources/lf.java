// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.EditText;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class lf implements fd, b86, on5, mz6, pz6, hf7, ot2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lf(uj ujVar, int i, long j, long j2) {
        this.a = (byte) 2;
        this.d = ujVar;
        this.c = i;
        this.b = j;
    }

    @Override // hf7
    public final void a(String str) {
        ((eja) this.d).F0(this.c, str, this.b);
    }

    @Override // ot2
    public final void accept(Object obj) {
        seb sebVar = (seb) this.d;
        p43 p43Var = (p43) obj;
        sebVar.h.getClass();
        byte[] l3 = z6f.l3(p43Var.a, p43Var.c);
        ey7 ey7Var = sebVar.c;
        ey7Var.L(l3.length, l3);
        sebVar.a.e(l3.length, ey7Var);
        long j = p43Var.b;
        ko4 ko4Var = sebVar.h;
        long j2 = this.b;
        if (j == -9223372036854775807L) {
            yve.p(ko4Var.y == Long.MAX_VALUE);
        } else {
            long j3 = ko4Var.y;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        sebVar.a.a(j2, this.c | 1, l3.length, 0, null);
    }

    @Override // mz6
    public final void d(og8 og8Var, xw6 xw6Var) {
        sz6 sz6Var = (sz6) this.d;
        og8Var.p(sz6Var.f(xw6Var, og8Var, this.c), this.b);
    }

    @Override // b86
    public final void invoke(Object obj) {
        ((vj) obj).n((uj) this.d, this.c, this.b);
    }

    @Override // pz6
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        long j;
        try {
            po5 a = f31.a((IBinder) this.d);
            mo5 p = po5.p();
            for (int i2 = 0; i2 < a.size(); i2++) {
                Bundle bundle = (Bundle) a.get(i2);
                bundle.getClass();
                p.c(ft6.a(xw6Var.c, bundle));
            }
            j99 f = p.f();
            int i3 = this.c;
            if (i3 == -1) {
                yx6Var.t();
                i3 = yx6Var.t.l0();
                yx6Var.t();
                j = yx6Var.t.k();
            } else {
                j = this.b;
            }
            return yx6Var.o(xw6Var, f, i3, j);
        } catch (RuntimeException e) {
            efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return fne.b(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // on5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        List list;
        Bitmap bitmap;
        pcc pccVar = (pcc) this.d;
        int i = this.c;
        long j = this.b;
        mn5 p = imageReceiver.p();
        mn5 u = imageReceiver.u();
        if (!z || p == null) {
            return;
        }
        if (u != null) {
            Drawable drawable = u.d;
            if (drawable instanceof hvc) {
                list = ((hvc) drawable).a;
                bitmap = p.c;
                if (bitmap == null) {
                    Drawable drawable2 = p.d;
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    }
                }
                pccVar.a(new avc(bitmap, 0, list));
                af2.e(i);
                af2.s.c(new we2(j, bitmap, (byte) 0));
            }
        }
        list = null;
        bitmap = p.c;
        if (bitmap == null) {
        }
        pccVar.a(new avc(bitmap, 0, list));
        af2.e(i);
        af2.s.c(new we2(j, bitmap, (byte) 0));
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.c;
        long j = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                EditText editText = (EditText) obj;
                if (j > 0) {
                    TLRPC.UserFull Y1 = uc7.s1(i2).Y1(yac.h(i2).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (Y1 != null) {
                        String str = Y1.about;
                        if ((str != null ? str : "").equals(trim)) {
                            hl.t1(editText);
                            idVar.dismiss();
                            break;
                        } else {
                            Y1.about = trim;
                            jn7.f(i2).k(68, Long.valueOf(j), Y1);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    jn7.e().k(jn7.S4, 2, Long.valueOf(j));
                    ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new xe2(b2), 2);
                } else {
                    long j2 = -j;
                    TLRPC.ChatFull N0 = uc7.s1(i2).N0(j2);
                    String obj2 = editText.getText().toString();
                    if (N0 != null) {
                        String str2 = N0.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            hl.t1(editText);
                            idVar.dismiss();
                            break;
                        } else {
                            N0.about = obj2;
                            jn7 f = jn7.f(i2);
                            Boolean bool = Boolean.FALSE;
                            f.k(31, N0, 0, bool, bool);
                        }
                    }
                    jn7.e().k(jn7.S4, 2, Long.valueOf(j));
                    uc7 s1 = uc7.s1(i2);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = s1.j1(-j2);
                    tL_messages_editChatAbout.about = obj2;
                    s1.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new m65(s1, N0, obj2, (byte) 20), 64);
                }
                idVar.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = uc7.s1(yac.t0).W3.edit();
                if (j != 0) {
                    edit.putInt("color_" + j, 0);
                } else if (i2 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i2 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i2 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i2 == 5 || i2 == 4) {
                    edit.putInt("ReactionsLed", 0);
                } else {
                    edit.putInt("ChannelLed", 0);
                }
                edit.commit();
                runnable.run();
                break;
        }
    }

    public /* synthetic */ lf(long j, int i, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = i;
        this.d = obj;
    }

    public /* synthetic */ lf(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ lf(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = i;
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }
}
