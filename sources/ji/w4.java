package ji;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.s8;
import org.telegram.ui.vv0;
import org.telegram.ui.zs0;
import w7.u8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public class w4 implements j0, m.g2, y2.g, m.z0, n5.b, o0.a, u2.e1, org.telegram.ui.Cells.l1, bh.h, mg.e, f81, hg.z1, com.google.android.gms.common.api.internal.s, r2.m, com.google.android.gms.common.api.internal.o, rg.x1, s4.h1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ w4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // y2.g
    public void A(y2.i iVar, long j10, long j11) {
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.b;
        long j13 = oVar.a;
        g2.m mVar = oVar.b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        gVar.m.getClass();
        gVar.q.r(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f;
        m2.c cVar2 = gVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j14 = cVar.b(0).b;
        int i10 = 0;
        while (i10 < size && gVar.G.b(i10).b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.m.size()) {
                e2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = gVar.M;
                j12 = -9223372036854775807L;
                if (j15 == -9223372036854775807L || cVar.h * 1000 > j15) {
                    gVar.L = 0;
                } else {
                    e2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.M);
                }
            }
            int i11 = gVar.L;
            gVar.L = i11 + 1;
            if (i11 < gVar.m.y3(oVar.c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.L - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.C = new com.google.android.gms.internal.cast.z4();
                return;
            }
        }
        j12 = -9223372036854775807L;
        gVar.G = cVar;
        gVar.H = cVar.d & gVar.H;
        gVar.I = j10 - j11;
        gVar.J = j10;
        gVar.N += i10;
        synchronized (gVar.t) {
            try {
                if (oVar.b.a.equals(gVar.E)) {
                    Uri uri = gVar.G.k;
                    if (uri == null) {
                        uri = u8.a(oVar.d.c);
                    }
                    gVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.G;
        if (!cVar3.d || gVar.K != j12) {
            gVar.z(true);
            return;
        }
        m2.t tVar = cVar3.i;
        if (tVar == null) {
            gVar.w();
            return;
        }
        String str = (String) tVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.K = e2.m0.V((String) tVar.c) - gVar.J;
                gVar.z(true);
                return;
            } catch (b2.x0 e) {
                gVar.y(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            gVar.A(tVar, new l2.f());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            gVar.A(tVar, new sb.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.w();
        } else {
            gVar.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // ji.j0
    public void C0() {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.a;
            x3 x3Var = q3Var.a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f3.onContentChanged();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean C1() {
        return false;
    }

    @Override // s4.h1
    public int D() {
        return ((s4.n0) this.b).D();
    }

    @Override // hg.z1
    public boolean E0(int i10) {
        switch (this.a) {
            case 16:
                return i10 == ((er0) this.b).r;
            default:
                return true;
        }
    }

    @Override // u2.e1
    public void F(u2.f1 f1Var) {
        o2.k kVar = (o2.k) this.b;
        kVar.G.F(kVar);
    }

    @Override // rg.x1
    public void G0(float f7) {
        rg.y0 y0Var = (rg.y0) this.b;
        qg.s0.e(y0Var.a).k("-1", f7);
        y0Var.e.setBrushSize(f7);
    }

    @Override // mg.e
    public void H() {
        ((uf0) this.b).b.o();
    }

    @Override // s4.h1
    public View J0(int i10) {
        return ((s4.n0) this.b).q(i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public void J1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override // hg.z1
    public /* synthetic */ a0.h K() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle K1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // s4.h1
    public int M0(View view) {
        return s4.n0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).rightMargin;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void N0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        ga gaVar = (ga) this.b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // hg.z1
    public /* synthetic */ void O0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // mg.e
    public void Q0() {
        ((uf0) this.b).b.k();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // ji.j0
    public void R0() {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.a;
            x3.P1(q3Var.a);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vv0 S1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T1(long j10) {
        return false;
    }

    @Override // s4.h1
    public int U() {
        s4.n0 n0Var = (s4.n0) this.b;
        return n0Var.m - n0Var.E();
    }

    @Override // org.telegram.ui.Cells.l1
    public void U1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ga gaVar = (ga) this.b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // mg.e
    public void V0(float f7) {
        uf0 uf0Var = (uf0) this.b;
        uf0Var.b.setRotation(f7);
        uf0Var.getClass();
        tf0 tf0Var = uf0Var.a;
        if (tf0Var != null) {
            ((zs0) tf0Var).a(false);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // ji.j0
    public o9 W() {
        q3 q3Var = ((y4) this.b).N;
        if (q3Var != null) {
            return q3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // o0.a
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // y2.g
    public void X0(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.g) this.b).x((y2.o) iVar, j10, j11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ih.a Y() {
        return null;
    }

    public void Y0() {
        qg.a1 a1Var = ((qg.c1) this.b).d;
        if (a1Var != null) {
            qg.z0 z0Var = a1Var.s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.s = null;
            }
            qg.z0 z0Var2 = new qg.z0(a1Var, 1);
            a1Var.s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    public s0.c Z0(int i10) {
        return null;
    }

    @Override // ji.j0
    public void a(h1 h1Var) {
        q3 q3Var = ((y4) this.b).N;
        if (q3Var != null) {
            x3 x3Var = q3Var.a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.V(h1Var, true);
        }
    }

    @Override // ji.j0
    public void a0(CharSequence charSequence) {
        q3 q3Var = ((y4) this.b).N;
        if (q3Var != null) {
            q3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            q3Var.a.u4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean a1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return i10 == ((ga) this.b).s;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 19:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                n6.o oVar = (n6.o) this.b;
                Parcel H0 = aVar.H0();
                k7.a.c(H0, oVar);
                try {
                    aVar.b.transact(1, H0, null, 1);
                    H0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    H0.recycle();
                    throw th2;
                }
            default:
                s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                s6.a aVar2 = (s6.a) this.b;
                Parcel H02 = eVar.H0();
                k7.a.d(H02, fVar);
                k7.a.c(H02, aVar2);
                eVar.I0(H02, 1);
                return;
        }
    }

    @Override // r2.m
    public void b(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // mg.e
    public void b0() {
        ((uf0) this.b).b.a.g(1, true);
    }

    public String b1(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            la.d dVar = (la.d) this.b;
            la.e eVar = new la.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return ((ga) this.b).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    public s0.c c1(int i10) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                com.google.android.gms.internal.cast.i4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // r2.m
    public void d(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i10, 0, dVar.i, j10, i11);
    }

    public void d1() {
        o2.k kVar = (o2.k) this.b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.a;
        }
        b2.q1[] q1VarArr = new b2.q1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                q1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.r1(q1VarArr);
        kVar.G.q(kVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // hg.z1
    public void f(int i10) {
        switch (this.a) {
            case 16:
                er0 er0Var = (er0) this.b;
                ir0 ir0Var = er0Var.K;
                er0Var.s = i10;
                if (er0Var.v != i10) {
                    er0Var.d.clear();
                }
                int i11 = er0Var.J;
                if (er0Var.h() != 0 || er0Var.e.e() || er0Var.I) {
                    ir0Var.x0.b(i11);
                } else {
                    ir0Var.Q.e(false, true);
                }
                er0Var.l();
                int i12 = ir0.a1;
                ir0Var.L0(true);
                break;
            default:
                s8 s8Var = (s8) this.b;
                if (!s8Var.n && i10 == s8Var.I) {
                    s8Var.d0(s8Var.M.getText().toString().trim());
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // ji.j0
    public n9 g0() {
        return (y4) this.b;
    }

    @Override // hd.a
    public Object get() {
        return new m.h3((Context) ((a9.r) this.b).a, new rb.b(24), new pb.a(24), 3);
    }

    @Override // ji.j0
    public void h() {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            x3.Q1(q3Var.a, y4Var.a);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // ji.j0
    public a j0() {
        return ((y4) this.b).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j1(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        y20 y20Var;
        boolean z11;
        x20 x20Var = (x20) this.b;
        int i10 = x20.w;
        y20 y20Var2 = x20Var.f;
        ab.o0 o0Var = x20Var.e;
        int action = motionEvent.getAction();
        if (x20Var.v == null) {
            x20Var.v = VelocityTracker.obtain();
        }
        x20Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z12 = i11 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f7 = motionEvent.getX(i12) + f7;
                f10 = motionEvent.getY(i12) + f10;
            }
        }
        float f11 = z12 ? pointerCount - 1 : pointerCount;
        float f12 = f7 / f11;
        float f13 = f10 / f11;
        if (i11 == 0) {
            if (x20Var.g != null && y20Var2.a()) {
                boolean hasMessages = o0Var.hasMessages(3);
                if (hasMessages) {
                    o0Var.removeMessages(3);
                }
                MotionEvent motionEvent4 = x20Var.m;
                if (motionEvent4 != null && (motionEvent3 = x20Var.n) != null && hasMessages && x20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x10 * x10) < x20Var.b) {
                        x20Var.o = true;
                        z10 = x20Var.g.onDoubleTap(x20Var.m) | x20Var.g.onDoubleTapEvent(motionEvent);
                        x20Var.p = f12;
                        x20Var.r = f12;
                        x20Var.q = f13;
                        x20Var.s = f13;
                        motionEvent2 = x20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        x20Var.m = MotionEvent.obtain(motionEvent);
                        x20Var.k = true;
                        x20Var.l = true;
                        x20Var.h = true;
                        x20Var.j = false;
                        x20Var.i = false;
                        if (x20Var.t) {
                            o0Var.removeMessages(2);
                            o0Var.sendEmptyMessageAtTime(2, x20Var.m.getDownTime() + i10 + x20Var.u);
                        }
                        o0Var.sendEmptyMessageAtTime(1, x20Var.m.getDownTime() + i10);
                        return y20Var2.onDown(motionEvent) | z10;
                    }
                }
                o0Var.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            x20Var.p = f12;
            x20Var.r = f12;
            x20Var.q = f13;
            x20Var.s = f13;
            motionEvent2 = x20Var.m;
            if (motionEvent2 != null) {
            }
            x20Var.m = MotionEvent.obtain(motionEvent);
            x20Var.k = true;
            x20Var.l = true;
            x20Var.h = true;
            x20Var.j = false;
            x20Var.i = false;
            if (x20Var.t) {
            }
            o0Var.sendEmptyMessageAtTime(1, x20Var.m.getDownTime() + i10);
            return y20Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            x20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (x20Var.o) {
                onFling = x20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (x20Var.j) {
                    o0Var.removeMessages(3);
                    x20Var.j = false;
                } else if (x20Var.k) {
                    boolean onSingleTapUp = y20Var2.onSingleTapUp(motionEvent);
                    if (x20Var.i && (y20Var = x20Var.g) != null) {
                        y20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = x20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, x20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > x20Var.c || Math.abs(xVelocity) > x20Var.c) {
                        onFling = y20Var2.onFling(x20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = x20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            x20Var.n = obtain;
            VelocityTracker velocityTracker2 = x20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                x20Var.v = null;
            }
            x20Var.o = false;
            x20Var.i = false;
            o0Var.removeMessages(1);
            o0Var.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                o0Var.removeMessages(1);
                o0Var.removeMessages(2);
                o0Var.removeMessages(3);
                x20Var.v.recycle();
                x20Var.v = null;
                x20Var.o = false;
                x20Var.h = false;
                x20Var.k = false;
                x20Var.l = false;
                x20Var.i = false;
                if (x20Var.j) {
                    x20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                x20Var.p = f12;
                x20Var.r = f12;
                x20Var.q = f13;
                x20Var.s = f13;
                o0Var.removeMessages(1);
                o0Var.removeMessages(2);
                o0Var.removeMessages(3);
                x20Var.o = false;
                x20Var.k = false;
                x20Var.l = false;
                x20Var.i = false;
                if (x20Var.j) {
                    x20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                x20Var.p = f12;
                x20Var.r = f12;
                x20Var.q = f13;
                x20Var.s = f13;
                x20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, x20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = x20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = x20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((x20Var.v.getYVelocity(pointerId3) * yVelocity2) + (x20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            x20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!x20Var.j) {
            float f14 = x20Var.p - f12;
            float f15 = x20Var.q - f13;
            if (x20Var.o) {
                return x20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (x20Var.k) {
                int i14 = (int) (f12 - x20Var.r);
                int i15 = (int) (f13 - x20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > x20Var.a) {
                    z11 = y20Var2.onScroll(x20Var.m, motionEvent, f14, f15);
                    x20Var.p = f12;
                    x20Var.q = f13;
                    x20Var.k = false;
                    o0Var.removeMessages(3);
                    o0Var.removeMessages(1);
                    o0Var.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > x20Var.a) {
                    x20Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = y20Var2.onScroll(x20Var.m, motionEvent, f14, f15);
                x20Var.p = f12;
                x20Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    @Override // bh.h
    public void k(Canvas canvas) {
        vi viVar = (vi) this.b;
        canvas.drawColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            viVar.F2.b(canvas, -2);
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h k0() {
        switch (this.a) {
        }
        return null;
    }

    public boolean k1(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // s4.h1
    public int l(View view) {
        return s4.n0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).leftMargin;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return c();
    }

    @Override // bh.h
    public void m0(bh.a aVar) {
        aVar.a(((vi) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    public void m1(s4.b1 b1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        boolean z10;
        s4.b1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(b1Var);
        recyclerView.h(b1Var);
        b1Var.q(false);
        s4.e1 e1Var = (s4.e1) recyclerView.c0;
        e1Var.getClass();
        int i11 = v0Var.a;
        int i12 = v0Var.b;
        View view = b1Var.a;
        int left = v0Var2 == null ? view.getLeft() : v0Var2.a;
        int top = v0Var2 == null ? view.getTop() : v0Var2.b;
        if (b1Var.j() || (i11 == left && i12 == top)) {
            int i13 = b1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            b1Var.i = (b1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            e1Var.s(b1Var, v0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = e1Var.r(b1Var, v0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void n1(s4.b1 b1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        s4.n0 n0Var = recyclerView.x;
        View view = b1Var.a;
        qf.e eVar = recyclerView.b;
        m.h3 h3Var = n0Var.a;
        h5 h5Var = (h5) h3Var.b;
        int indexOfChild = ((RecyclerView) h5Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ad.d) h3Var.c).G(indexOfChild)) {
                h3Var.X(view);
            }
            h5Var.j(indexOfChild);
        }
        eVar.g(view);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    public void o1() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + r1());
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onStateChanged(boolean z10, int i10) {
        hl0 hl0Var = (hl0) this.b;
        if (z10 && hl0Var.n.n() >= 0) {
            hl0Var.w = true;
        }
        gh0 gh0Var = hl0Var.f;
        yc0 yc0Var = hl0Var.x;
        gh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(yc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(yc0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // mg.e
    public boolean p() {
        tf0 tf0Var = ((uf0) this.b).a;
        if (tf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((zs0) tf0Var).a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.N0();
    }

    @Override // ji.j0
    public boolean p0() {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var == null) {
            return false;
        }
        a aVar = y4Var.a;
        return q3Var.a.T4();
    }

    public void p1(long j10) {
        long r12 = r1();
        if (r12 != j10) {
            if (r12 != -1) {
                if (r12 != -2) {
                    return;
                } else {
                    r12 = -2;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(r12);
            throw new IOException(t10.toString());
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(int i10) {
        return false;
    }

    @Override // mg.e
    public boolean r0() {
        tf0 tf0Var = ((uf0) this.b).a;
        if (tf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((zs0) tf0Var).a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.O0(-90.0f, false, null);
    }

    public long r1() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // r2.m
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // ji.j0
    public void t0(int i10, int i11) {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.a;
            h2 h2Var = q3Var.a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 t2() {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 28:
                te.b bVar = te.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((s4.b) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void v(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // y2.g
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.b;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        int i11 = oVar.c;
        gVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
        k4.d dVar = min == -9223372036854775807L ? y2.l.f : new k4.d(0, min, false);
        gVar.q.t(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // m.g2
    public void w0(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override // y2.g
    public void y(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        l2.g gVar = (l2.g) this.b;
        if (i10 == 0) {
            long j12 = oVar.a;
            uVar = new u2.u(oVar.b, j10);
        } else {
            long j13 = oVar.a;
            g2.m mVar = oVar.b;
            g2.b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        gVar.q.v(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // m.g2
    public void z(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    public /* synthetic */ w4(s6.g gVar, s6.a aVar) {
        this.a = 27;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.f81
    public void onRenderedFirstFrame() {
    }

    public w4(int i10) {
        this.a = i10;
        switch (i10) {
            case 24:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new ai0(this);
                    break;
                }
            case 28:
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    @Override // rg.x1
    public float get() {
        rg.y0 y0Var = (rg.y0) this.b;
        int i10 = y0Var.a;
        qg.m currentBrush = y0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).i;
        }
        return qg.s0.e(i10).f("-1", currentBrush.d());
    }

    public w4(Context context, Uri uri) {
        this.a = 9;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public w4(Context context, y20 y20Var) {
        this.a = 13;
        this.b = new x20(context, y20Var);
    }

    private final /* synthetic */ void f1(ArrayList arrayList) {
    }

    private final /* synthetic */ void h1(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // m.z0
    public void I0(int i10) {
    }

    @Override // m.z0
    public void J(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O1() {
    }

    @Override // r2.m
    public void flush() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // r2.m
    public void s0() {
    }

    @Override // r2.m
    public void shutdown() {
    }

    @Override // r2.m
    public void start() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onError(i81 i81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
