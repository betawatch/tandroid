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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hg implements ee, x76, ln5, iz6, lz6, af7, fu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hg(tk tkVar, int i, long j, long j2) {
        this.a = (byte) 2;
        this.d = tkVar;
        this.c = i;
        this.b = j;
    }

    @Override // af7
    public final void a(String str) {
        ((nha) this.d).F0(this.c, str, this.b);
    }

    @Override // fu2
    public final void accept(Object obj) {
        wcb wcbVar = (wcb) this.d;
        i53 i53Var = (i53) obj;
        wcbVar.h.getClass();
        byte[] l3 = k4f.l3(i53Var.a, i53Var.c);
        yw7 yw7Var = wcbVar.c;
        yw7Var.L(l3.length, l3);
        wcbVar.a.e(l3.length, yw7Var);
        long j = i53Var.b;
        go4 go4Var = wcbVar.h;
        long j2 = this.b;
        if (j == -9223372036854775807L) {
            jte.p(go4Var.y == Long.MAX_VALUE);
        } else {
            long j3 = go4Var.y;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        wcbVar.a.a(j2, this.c | 1, l3.length, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // ln5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        List list;
        Bitmap bitmap;
        qac qacVar = (qac) this.d;
        int i = this.c;
        long j = this.b;
        jn5 p = imageReceiver.p();
        jn5 u = imageReceiver.u();
        if (!z || p == null) {
            return;
        }
        if (u != null) {
            Drawable drawable = u.d;
            if (drawable instanceof vsc) {
                list = ((vsc) drawable).a;
                bitmap = p.c;
                if (bitmap == null) {
                    Drawable drawable2 = p.d;
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    }
                }
                qacVar.a(new osc(bitmap, 0, list));
                uf2.e(i);
                uf2.s.c(new kf2(j, bitmap, (byte) 0));
            }
        }
        list = null;
        bitmap = p.c;
        if (bitmap == null) {
        }
        qacVar.a(new osc(bitmap, 0, list));
        uf2.e(i);
        uf2.s.c(new kf2(j, bitmap, (byte) 0));
    }

    @Override // iz6
    public final void e(cf8 cf8Var, sw6 sw6Var) {
        oz6 oz6Var = (oz6) this.d;
        cf8Var.p(oz6Var.f(sw6Var, cf8Var, this.c), this.b);
    }

    @Override // x76
    public final void invoke(Object obj) {
        ((uk) obj).k((tk) this.d, this.c, this.b);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.c;
        long j = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                EditText editText = (EditText) obj;
                if (j > 0) {
                    TLRPC.UserFull X1 = oc7.r1(i2).X1(z8c.h(i2).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (X1 != null) {
                        String str = X1.about;
                        if ((str != null ? str : "").equals(trim)) {
                            gm.t1(editText);
                            heVar.dismiss();
                            break;
                        } else {
                            X1.about = trim;
                            nm7.f(i2).k(68, Long.valueOf(j), X1);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    nm7.e().k(nm7.T4, 2, Long.valueOf(j));
                    ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new nf2(b2), 2);
                } else {
                    long j2 = -j;
                    TLRPC.ChatFull M0 = oc7.r1(i2).M0(j2);
                    String obj2 = editText.getText().toString();
                    if (M0 != null) {
                        String str2 = M0.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            gm.t1(editText);
                            heVar.dismiss();
                            break;
                        } else {
                            M0.about = obj2;
                            nm7 f = nm7.f(i2);
                            Boolean bool = Boolean.FALSE;
                            f.k(31, M0, 0, bool, bool);
                        }
                    }
                    nm7.e().k(nm7.T4, 2, Long.valueOf(j));
                    oc7 r1 = oc7.r1(i2);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = r1.i1(-j2);
                    tL_messages_editChatAbout.about = obj2;
                    r1.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new i65(r1, M0, obj2, (byte) 21), 64);
                }
                heVar.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
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

    @Override // lz6
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        long j;
        try {
            mo5 a = e41.a((IBinder) this.d);
            jo5 p = mo5.p();
            for (int i2 = 0; i2 < a.size(); i2++) {
                Bundle bundle = (Bundle) a.get(i2);
                bundle.getClass();
                p.c(bt6.a(sw6Var.c, bundle));
            }
            y79 f = p.f();
            int i3 = this.c;
            if (i3 == -1) {
                tx6Var.t();
                i3 = tx6Var.t.l0();
                tx6Var.t();
                j = tx6Var.t.k();
            } else {
                j = this.b;
            }
            return tx6Var.o(sw6Var, f, i3, j);
        } catch (RuntimeException e) {
            ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return kke.b(e);
        }
    }

    public /* synthetic */ hg(long j, int i, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = i;
        this.d = obj;
    }

    public /* synthetic */ hg(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ hg(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = i;
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
    }
}
