// default package

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ccb implements k68 {
    public final /* synthetic */ u5b a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ lcb d;

    public ccb(lcb lcbVar, u5b u5bVar, ArrayList arrayList, Context context) {
        this.d = lcbVar;
        this.a = u5bVar;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i, long j) {
        lcb lcbVar = this.d;
        if (lcbVar.K == i && lcbVar.J == j) {
            return;
        }
        lcbVar.J = j;
        lcbVar.K = i;
    }

    public final void b(boolean z) {
        lcb lcbVar = this.d;
        e eVar = lcbVar.f;
        if (lcbVar.b) {
            if (lcbVar.c) {
                return;
            }
            if (z) {
                hl.U2(eVar.getParentActivity(), eVar.getClassGuid());
                return;
            } else {
                hl.V2(eVar.getParentActivity(), eVar.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = lcbVar.r;
        layoutParams.softInputMode = z ? 48 : 16;
        try {
            lcbVar.n.updateViewLayout(lcbVar.s, layoutParams);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j, d30 d30Var) {
        long j2;
        kcb kcbVar;
        lcb lcbVar = this.d;
        ArrayList arrayList = lcbVar.M0;
        if (lcbVar.H0 || lcbVar.V < 0.9f) {
            x96 x96Var = lcbVar.E0;
            if (x96Var != null) {
                x96Var.e(0L, null);
            }
            w96 w96Var = lcbVar.B0;
            if (w96Var != null) {
                if (w96Var.n) {
                    w96Var.d();
                } else {
                    w96Var.h();
                }
                lcbVar.B0 = null;
            }
            cc4.b("StoryViewer requestPlayer ignored, because closed: " + lcbVar.H0 + ", " + lcbVar.V);
            d30Var.a = false;
            d30Var.c = null;
            d30Var.b = null;
            return;
        }
        Uri uri2 = lcbVar.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (kcbVar = lcbVar.A0) == null) {
            lcbVar.F0 = uri;
            x96 x96Var2 = lcbVar.E0;
            if (x96Var2 != null) {
                x96Var2.e(0L, null);
            }
            w96 w96Var2 = lcbVar.B0;
            if (w96Var2 != null) {
                if (w96Var2.n) {
                    w96Var2.d();
                } else {
                    w96Var2.h();
                }
                lcbVar.B0 = null;
            }
            kcb kcbVar2 = lcbVar.A0;
            if (kcbVar2 != null) {
                kcbVar2.release(null);
                lcbVar.A0 = null;
            }
            d30 d30Var2 = lcbVar.G0;
            if (d30Var2 != null) {
                d30Var2.c = null;
                d30Var2.b = null;
                d30Var2.a = false;
                d30Var2.e = null;
                d30Var2.f = null;
                d30Var2.d = null;
                d30Var2.m();
                lcbVar.G0 = null;
            }
            if (uri != null) {
                lcbVar.G0 = d30Var;
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((kcb) arrayList.get(i)).uri.equals(uri)) {
                        lcbVar.A0 = (kcb) arrayList.remove(i);
                        break;
                    }
                    i++;
                }
                kcb kcbVar3 = lcbVar.A0;
                if (kcbVar3 == null) {
                    kcbVar3 = new kcb(lcbVar, lcbVar.D0, lcbVar.C0);
                    lcbVar.A0 = kcbVar3;
                    kcbVar3.document = document;
                }
                kcbVar3.uri = uri;
                kcbVar3.setSpeed(lcb.B1);
                d30 d30Var3 = lcbVar.G0;
                kcb kcbVar4 = lcbVar.A0;
                d30Var3.c = kcbVar4;
                d30Var3.a = false;
                d30Var3.e = lcbVar.z0;
                d30Var3.f = lcbVar.C0;
                d30Var3.d = lcbVar.D0;
                d30Var3.b = null;
                TLRPC.Document document2 = kcbVar4.document;
                if (document2 != null) {
                    hd4.J.put(Long.valueOf(document2.id), 3);
                } else {
                    ConcurrentHashMap concurrentHashMap = hd4.I;
                }
                xb4.G(lcbVar.h).h(3, lcbVar.A0.document, null, null, null, null);
                if (j == 0) {
                    long j3 = lcbVar.t1;
                    if (j3 != 0) {
                        lcbVar.G0.a = true;
                        j2 = j3;
                        cc4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((kcb) lcbVar.G0.c).start(false, lcbVar.A(), uri, j2, lcb.D1, lcb.B1);
                        lcbVar.G0.m();
                    }
                }
                j2 = j;
                cc4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((kcb) lcbVar.G0.c).start(false, lcbVar.A(), uri, j2, lcb.D1, lcb.B1);
                lcbVar.G0.m();
            } else {
                cc4.b("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            lcbVar.G0 = d30Var;
            d30Var.c = kcbVar;
            d30Var.b = null;
            kcbVar.setSpeed(lcb.B1);
            d30 d30Var4 = lcbVar.G0;
            d30Var4.a = lcbVar.A0.firstFrameRendered;
            d30Var4.e = lcbVar.z0;
            d30Var4.f = lcbVar.C0;
            d30Var4.d = lcbVar.D0;
            cc4.b("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        lcbVar.t1 = 0L;
        lcbVar.U();
    }

    public final void d(float f) {
        lcb lcbVar = this.d;
        if (lcbVar.s0 != f) {
            lcbVar.s0 = f;
            lcbVar.w.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z) {
        kcb kcbVar;
        lcb lcbVar = this.d;
        if (!lcbVar.f1 && z && lcbVar.l0) {
            lcbVar.l0 = false;
            d30 d30Var = lcbVar.G0;
            if (d30Var != null && (kcbVar = (kcb) d30Var.c) != null) {
                kcbVar.setSeeking(false);
            }
            o68 w = lcbVar.w();
            if (w != null) {
                w.invalidate();
            }
        }
        lcbVar.f1 = z;
        lcbVar.U();
    }

    public final void g(boolean z) {
        lcb lcbVar = this.d;
        lcbVar.X0 = z;
        lcbVar.U();
    }

    public final void h(Dialog dialog) {
        this.d.u(dialog);
    }

    public final void i(boolean z, boolean z2) {
        lcb lcbVar = this.d;
        x96 x96Var = lcbVar.E0;
        if (x96Var != null) {
            x96Var.setVisibility(z ? 0 : 8);
        }
        SurfaceView surfaceView = lcbVar.D0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z ? 8 : z2 ? 0 : 4);
        }
        dcb dcbVar = lcbVar.C0;
        if (dcbVar != null) {
            dcbVar.setVisibility(z ? 8 : 0);
        }
    }

    public final void j() {
        lcb lcbVar = this.d;
        u5b u5bVar = this.a;
        if (u5bVar == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(lcbVar.o0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                lcbVar.o(false);
                return;
            }
            arrayList.remove(indexOf);
            if (lcbVar.o0.E(true)) {
                lcbVar.o0.H0 = new a39((Object) this, (Object) arrayList, indexOf, (byte) 21);
                return;
            } else {
                lcbVar.o(false);
                return;
            }
        }
        if (lcbVar.o0.y0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(lcbVar.o0.y0);
        int indexOf2 = lcbVar.o0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(lcbVar.o0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            lcbVar.o(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (lcbVar.o0.E(true)) {
            lcbVar.o0.H0 = new pwa(this, u5bVar, arrayList2, (byte) 17);
        } else {
            lcbVar.o(false);
        }
    }
}
