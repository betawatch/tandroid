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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gf implements ed, x56, ll5, ix6, lx6, yc7, us2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gf(tj tjVar, int i, long j, long j2) {
        this.a = (byte) 2;
        this.d = tjVar;
        this.c = i;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // ll5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        List list;
        Bitmap bitmap;
        p8c p8cVar = (p8c) this.d;
        int i = this.c;
        long j = this.b;
        jl5 p = imageReceiver.p();
        jl5 u = imageReceiver.u();
        if (!z || p == null) {
            return;
        }
        if (u != null) {
            Drawable drawable = u.d;
            if (drawable instanceof tqc) {
                list = ((tqc) drawable).a;
                bitmap = p.c;
                if (bitmap == null) {
                    Drawable drawable2 = p.d;
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    }
                }
                p8cVar.a(new mqc(bitmap, 0, list));
                je2.e(i);
                je2.s.c(new zd2(j, bitmap, (byte) 0));
            }
        }
        list = null;
        bitmap = p.c;
        if (bitmap == null) {
        }
        p8cVar.a(new mqc(bitmap, 0, list));
        je2.e(i);
        je2.s.c(new zd2(j, bitmap, (byte) 0));
    }

    @Override // yc7
    public final void a(String str) {
        ((nfa) this.d).F0(this.c, str, this.b);
    }

    @Override // us2
    public final void accept(Object obj) {
        vab vabVar = (vab) this.d;
        x33 x33Var = (x33) obj;
        vabVar.h.getClass();
        byte[] l3 = i2f.l3(x33Var.a, x33Var.c);
        xu7 xu7Var = vabVar.c;
        xu7Var.L(l3.length, l3);
        vabVar.a.e(l3.length, xu7Var);
        long j = x33Var.b;
        fm4 fm4Var = vabVar.h;
        long j2 = this.b;
        if (j == -9223372036854775807L) {
            gre.p(fm4Var.y == Long.MAX_VALUE);
        } else {
            long j3 = fm4Var.y;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        vabVar.a.a(j2, this.c | 1, l3.length, 0, null);
    }

    @Override // ix6
    public final void g(ad8 ad8Var, su6 su6Var) {
        ox6 ox6Var = (ox6) this.d;
        ad8Var.p(ox6Var.f(su6Var, ad8Var, this.c), this.b);
    }

    @Override // x56
    public final void invoke(Object obj) {
        ((uj) obj).n((tj) this.d, this.c, this.b);
    }

    @Override // lx6
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        long j;
        try {
            mm5 a = w21.a((IBinder) this.d);
            jm5 p = mm5.p();
            for (int i2 = 0; i2 < a.size(); i2++) {
                Bundle bundle = (Bundle) a.get(i2);
                bundle.getClass();
                p.c(br6.a(su6Var.c, bundle));
            }
            w59 f = p.f();
            int i3 = this.c;
            if (i3 == -1) {
                tv6Var.t();
                i3 = tv6Var.t.l0();
                tv6Var.t();
                j = tv6Var.t.m();
            } else {
                j = this.b;
            }
            return tv6Var.o(su6Var, f, i3, j);
        } catch (RuntimeException e) {
            lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return jie.b(e);
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.c;
        long j = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                EditText editText = (EditText) obj;
                if (j > 0) {
                    TLRPC.UserFull W1 = na7.q1(i2).W1(y6c.h(i2).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (W1 != null) {
                        String str = W1.about;
                        if ((str != null ? str : "").equals(trim)) {
                            gl.t1(editText);
                            hdVar.dismiss();
                            break;
                        } else {
                            W1.about = trim;
                            kk7.f(i2).k(67, Long.valueOf(j), W1);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    kk7.e().k(kk7.R4, 2, Long.valueOf(j));
                    ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new ce2(b2), 2);
                } else {
                    long j2 = -j;
                    TLRPC.ChatFull L0 = na7.q1(i2).L0(j2);
                    String obj2 = editText.getText().toString();
                    if (L0 != null) {
                        String str2 = L0.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            gl.t1(editText);
                            hdVar.dismiss();
                            break;
                        } else {
                            L0.about = obj2;
                            kk7 f = kk7.f(i2);
                            Boolean bool = Boolean.FALSE;
                            f.k(30, L0, 0, bool, bool);
                        }
                    }
                    kk7.e().k(kk7.R4, 2, Long.valueOf(j));
                    na7 q1 = na7.q1(i2);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = q1.h1(-j2);
                    tL_messages_editChatAbout.about = obj2;
                    q1.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new k45(q1, L0, obj2, (byte) 21), 64);
                }
                hdVar.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
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

    public /* synthetic */ gf(long j, int i, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = i;
        this.d = obj;
    }

    public /* synthetic */ gf(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ gf(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = i;
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }
}
