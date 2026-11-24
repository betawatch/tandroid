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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class d8b implements t28 {
    public final /* synthetic */ y1b a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ m8b d;

    public d8b(m8b m8bVar, y1b y1bVar, ArrayList arrayList, Context context) {
        this.d = m8bVar;
        this.a = y1bVar;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i, long j) {
        m8b m8bVar = this.d;
        if (m8bVar.K == i && m8bVar.J == j) {
            return;
        }
        m8bVar.J = j;
        m8bVar.K = i;
    }

    public final void b(boolean z) {
        m8b m8bVar = this.d;
        d dVar = m8bVar.f;
        if (m8bVar.b) {
            if (m8bVar.c) {
                return;
            }
            if (z) {
                gl.V2(dVar.getParentActivity(), dVar.getClassGuid());
                return;
            } else {
                gl.W2(dVar.getParentActivity(), dVar.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = m8bVar.r;
        layoutParams.softInputMode = z ? 48 : 16;
        try {
            m8bVar.n.updateViewLayout(m8bVar.s, layoutParams);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j, c30 c30Var) {
        long j2;
        l8b l8bVar;
        m8b m8bVar = this.d;
        ArrayList arrayList = m8bVar.M0;
        if (m8bVar.H0 || m8bVar.V < 0.9f) {
            u76 u76Var = m8bVar.E0;
            if (u76Var != null) {
                u76Var.e(0L, null);
            }
            t76 t76Var = m8bVar.B0;
            if (t76Var != null) {
                if (t76Var.n) {
                    t76Var.d();
                } else {
                    t76Var.h();
                }
                m8bVar.B0 = null;
            }
            fa4.b("StoryViewer requestPlayer ignored, because closed: " + m8bVar.H0 + ", " + m8bVar.V);
            c30Var.a = false;
            c30Var.c = null;
            c30Var.b = null;
            return;
        }
        Uri uri2 = m8bVar.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (l8bVar = m8bVar.A0) == null) {
            m8bVar.F0 = uri;
            u76 u76Var2 = m8bVar.E0;
            if (u76Var2 != null) {
                u76Var2.e(0L, null);
            }
            t76 t76Var2 = m8bVar.B0;
            if (t76Var2 != null) {
                if (t76Var2.n) {
                    t76Var2.d();
                } else {
                    t76Var2.h();
                }
                m8bVar.B0 = null;
            }
            l8b l8bVar2 = m8bVar.A0;
            if (l8bVar2 != null) {
                l8bVar2.release(null);
                m8bVar.A0 = null;
            }
            c30 c30Var2 = m8bVar.G0;
            if (c30Var2 != null) {
                c30Var2.c = null;
                c30Var2.b = null;
                c30Var2.a = false;
                c30Var2.e = null;
                c30Var2.f = null;
                c30Var2.d = null;
                c30Var2.m();
                m8bVar.G0 = null;
            }
            if (uri != null) {
                m8bVar.G0 = c30Var;
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((l8b) arrayList.get(i)).uri.equals(uri)) {
                        m8bVar.A0 = (l8b) arrayList.remove(i);
                        break;
                    }
                    i++;
                }
                l8b l8bVar3 = m8bVar.A0;
                if (l8bVar3 == null) {
                    l8bVar3 = new l8b(m8bVar, m8bVar.D0, m8bVar.C0);
                    m8bVar.A0 = l8bVar3;
                    l8bVar3.document = document;
                }
                l8bVar3.uri = uri;
                l8bVar3.setSpeed(m8b.B1);
                c30 c30Var3 = m8bVar.G0;
                l8b l8bVar4 = m8bVar.A0;
                c30Var3.c = l8bVar4;
                c30Var3.a = false;
                c30Var3.e = m8bVar.z0;
                c30Var3.f = m8bVar.C0;
                c30Var3.d = m8bVar.D0;
                c30Var3.b = null;
                TLRPC.Document document2 = l8bVar4.document;
                if (document2 != null) {
                    kb4.J.put(Long.valueOf(document2.id), 3);
                } else {
                    ConcurrentHashMap concurrentHashMap = kb4.I;
                }
                ba4.G(m8bVar.h).h(3, m8bVar.A0.document, null, null, null, null);
                if (j == 0) {
                    long j3 = m8bVar.t1;
                    if (j3 != 0) {
                        m8bVar.G0.a = true;
                        j2 = j3;
                        fa4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((l8b) m8bVar.G0.c).start(false, m8bVar.A(), uri, j2, m8b.D1, m8b.B1);
                        m8bVar.G0.m();
                    }
                }
                j2 = j;
                fa4.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((l8b) m8bVar.G0.c).start(false, m8bVar.A(), uri, j2, m8b.D1, m8b.B1);
                m8bVar.G0.m();
            } else {
                fa4.b("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            m8bVar.G0 = c30Var;
            c30Var.c = l8bVar;
            c30Var.b = null;
            l8bVar.setSpeed(m8b.B1);
            c30 c30Var4 = m8bVar.G0;
            c30Var4.a = m8bVar.A0.firstFrameRendered;
            c30Var4.e = m8bVar.z0;
            c30Var4.f = m8bVar.C0;
            c30Var4.d = m8bVar.D0;
            fa4.b("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        m8bVar.t1 = 0L;
        m8bVar.U();
    }

    public final void d(float f) {
        m8b m8bVar = this.d;
        if (m8bVar.s0 != f) {
            m8bVar.s0 = f;
            m8bVar.w.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z) {
        l8b l8bVar;
        m8b m8bVar = this.d;
        if (!m8bVar.f1 && z && m8bVar.l0) {
            m8bVar.l0 = false;
            c30 c30Var = m8bVar.G0;
            if (c30Var != null && (l8bVar = (l8b) c30Var.c) != null) {
                l8bVar.setSeeking(false);
            }
            y28 w = m8bVar.w();
            if (w != null) {
                w.invalidate();
            }
        }
        m8bVar.f1 = z;
        m8bVar.U();
    }

    public final void g(boolean z) {
        m8b m8bVar = this.d;
        m8bVar.X0 = z;
        m8bVar.U();
    }

    public final void h(Dialog dialog) {
        this.d.u(dialog);
    }

    public final void i(boolean z, boolean z2) {
        m8b m8bVar = this.d;
        u76 u76Var = m8bVar.E0;
        if (u76Var != null) {
            u76Var.setVisibility(z ? 0 : 8);
        }
        SurfaceView surfaceView = m8bVar.D0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z ? 8 : z2 ? 0 : 4);
        }
        e8b e8bVar = m8bVar.C0;
        if (e8bVar != null) {
            e8bVar.setVisibility(z ? 8 : 0);
        }
    }

    public final void j() {
        m8b m8bVar = this.d;
        y1b y1bVar = this.a;
        if (y1bVar == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(m8bVar.o0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                m8bVar.o(false);
                return;
            }
            arrayList.remove(indexOf);
            if (m8bVar.o0.E(true)) {
                m8bVar.o0.H0 = new t79((Object) this, (Object) arrayList, indexOf, (byte) 20);
                return;
            } else {
                m8bVar.o(false);
                return;
            }
        }
        if (m8bVar.o0.y0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(m8bVar.o0.y0);
        int indexOf2 = m8bVar.o0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(m8bVar.o0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            m8bVar.o(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (m8bVar.o0.E(true)) {
            m8bVar.o0.H0 = new r1b(this, y1bVar, arrayList2, (byte) 8);
        } else {
            m8bVar.o(false);
        }
    }
}
