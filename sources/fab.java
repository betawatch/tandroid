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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class fab implements w48 {
    public final /* synthetic */ z3b a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ oab d;

    public fab(oab oabVar, z3b z3bVar, ArrayList arrayList, Context context) {
        this.d = oabVar;
        this.a = z3bVar;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i, long j) {
        oab oabVar = this.d;
        if (oabVar.K == i && oabVar.J == j) {
            return;
        }
        oabVar.J = j;
        oabVar.K = i;
    }

    public final void b(boolean z) {
        oab oabVar = this.d;
        d dVar = oabVar.f;
        if (oabVar.b) {
            if (oabVar.c) {
                return;
            }
            if (z) {
                gm.U2(dVar.getParentActivity(), dVar.getClassGuid());
                return;
            } else {
                gm.V2(dVar.getParentActivity(), dVar.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = oabVar.r;
        layoutParams.softInputMode = z ? 48 : 16;
        try {
            oabVar.n.updateViewLayout(oabVar.s, layoutParams);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j, c40 c40Var) {
        long j2;
        nab nabVar;
        oab oabVar = this.d;
        ArrayList arrayList = oabVar.M0;
        if (oabVar.H0 || oabVar.V < 0.9f) {
            t96 t96Var = oabVar.E0;
            if (t96Var != null) {
                t96Var.e(0L, null);
            }
            s96 s96Var = oabVar.B0;
            if (s96Var != null) {
                if (s96Var.n) {
                    s96Var.d();
                } else {
                    s96Var.h();
                }
                oabVar.B0 = null;
            }
            fc4.b("StoryViewer requestPlayer ignored, because closed: " + oabVar.H0 + ", " + oabVar.V);
            c40Var.a = false;
            c40Var.c = null;
            c40Var.b = null;
            return;
        }
        Uri uri2 = oabVar.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (nabVar = oabVar.A0) == null) {
            oabVar.F0 = uri;
            t96 t96Var2 = oabVar.E0;
            if (t96Var2 != null) {
                t96Var2.e(0L, null);
            }
            s96 s96Var2 = oabVar.B0;
            if (s96Var2 != null) {
                if (s96Var2.n) {
                    s96Var2.d();
                } else {
                    s96Var2.h();
                }
                oabVar.B0 = null;
            }
            nab nabVar2 = oabVar.A0;
            if (nabVar2 != null) {
                nabVar2.release(null);
                oabVar.A0 = null;
            }
            c40 c40Var2 = oabVar.G0;
            if (c40Var2 != null) {
                c40Var2.c = null;
                c40Var2.b = null;
                c40Var2.a = false;
                c40Var2.e = null;
                c40Var2.f = null;
                c40Var2.d = null;
                c40Var2.m();
                oabVar.G0 = null;
            }
            if (uri != null) {
                oabVar.G0 = c40Var;
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((nab) arrayList.get(i)).uri.equals(uri)) {
                        oabVar.A0 = (nab) arrayList.remove(i);
                        break;
                    }
                    i++;
                }
                nab nabVar3 = oabVar.A0;
                if (nabVar3 == null) {
                    nabVar3 = new nab(oabVar, oabVar.D0, oabVar.C0);
                    oabVar.A0 = nabVar3;
                    nabVar3.document = document;
                }
                nabVar3.uri = uri;
                nabVar3.setSpeed(oab.B1);
                c40 c40Var3 = oabVar.G0;
                nab nabVar4 = oabVar.A0;
                c40Var3.c = nabVar4;
                c40Var3.a = false;
                c40Var3.e = oabVar.z0;
                c40Var3.f = oabVar.C0;
                c40Var3.d = oabVar.D0;
                c40Var3.b = null;
                TLRPC.Document document2 = nabVar4.document;
                if (document2 != null) {
                    kd4.J.put(Long.valueOf(document2.id), 3);
                } else {
                    ConcurrentHashMap concurrentHashMap = kd4.I;
                }
                bc4.G(oabVar.h).h(3, oabVar.A0.document, null, null, null, null);
                if (j == 0) {
                    long j3 = oabVar.t1;
                    if (j3 != 0) {
                        oabVar.G0.a = true;
                        j2 = j3;
                        fc4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((nab) oabVar.G0.c).start(false, oabVar.A(), uri, j2, oab.D1, oab.B1);
                        oabVar.G0.m();
                    }
                }
                j2 = j;
                fc4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((nab) oabVar.G0.c).start(false, oabVar.A(), uri, j2, oab.D1, oab.B1);
                oabVar.G0.m();
            } else {
                fc4.b("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            oabVar.G0 = c40Var;
            c40Var.c = nabVar;
            c40Var.b = null;
            nabVar.setSpeed(oab.B1);
            c40 c40Var4 = oabVar.G0;
            c40Var4.a = oabVar.A0.firstFrameRendered;
            c40Var4.e = oabVar.z0;
            c40Var4.f = oabVar.C0;
            c40Var4.d = oabVar.D0;
            fc4.b("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        oabVar.t1 = 0L;
        oabVar.U();
    }

    public final void d(float f) {
        oab oabVar = this.d;
        if (oabVar.s0 != f) {
            oabVar.s0 = f;
            oabVar.w.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z) {
        nab nabVar;
        oab oabVar = this.d;
        if (!oabVar.f1 && z && oabVar.l0) {
            oabVar.l0 = false;
            c40 c40Var = oabVar.G0;
            if (c40Var != null && (nabVar = (nab) c40Var.c) != null) {
                nabVar.setSeeking(false);
            }
            a58 w = oabVar.w();
            if (w != null) {
                w.invalidate();
            }
        }
        oabVar.f1 = z;
        oabVar.U();
    }

    public final void g(boolean z) {
        oab oabVar = this.d;
        oabVar.X0 = z;
        oabVar.U();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z, boolean z2) {
        oab oabVar = this.d;
        t96 t96Var = oabVar.E0;
        if (t96Var != null) {
            t96Var.setVisibility(z ? 0 : 8);
        }
        SurfaceView surfaceView = oabVar.D0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z ? 8 : z2 ? 0 : 4);
        }
        gab gabVar = oabVar.C0;
        if (gabVar != null) {
            gabVar.setVisibility(z ? 8 : 0);
        }
    }

    public final void j() {
        oab oabVar = this.d;
        z3b z3bVar = this.a;
        if (z3bVar == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(oabVar.o0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                oabVar.o(false);
                return;
            }
            arrayList.remove(indexOf);
            if (oabVar.o0.E(true)) {
                oabVar.o0.H0 = new v99((Object) this, (Object) arrayList, indexOf, (byte) 20);
                return;
            } else {
                oabVar.o(false);
                return;
            }
        }
        if (oabVar.o0.y0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(oabVar.o0.y0);
        int indexOf2 = oabVar.o0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(oabVar.o0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            oabVar.o(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (oabVar.o0.E(true)) {
            oabVar.o0.H0 = new j2b(this, z3bVar, arrayList2);
        } else {
            oabVar.o(false);
        }
    }
}
