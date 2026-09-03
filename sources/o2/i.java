package o2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import b7.y0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.b3;
import g.x;
import g5.b0;
import g5.h0;
import g5.j0;
import g5.l0;
import g5.p0;
import h5.d0;
import h7.u;
import j3.r1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k7.a8;
import k7.p7;
import l7.w0;
import n7.qa;
import o4.m0;
import o4.n0;
import o4.s0;
import o4.t0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.p6;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.ai;
import org.telegram.ui.cv0;
import p2.w;
import ph.c0;
import ph.ga;
import ph.h9;
import ph.ia;
import ph.k5;
import ph.s9;
import ph.t6;
import ph.t9;
import ph.w4;
import ph.y;
import tf.i1;
import tf.u0;
import u5.r;
import u5.t;
import v0.p;
import vh.b5;
import vh.d1;
import vh.d2;
import vh.e1;
import vh.k2;
import vh.n3;
import vh.s3;
import vh.w2;
import vh.x0;
import vh.y2;
import vh.z4;
import y2.q;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i implements n0, o8.n, j1, ng.g, yd.a, androidx.activity.result.b, yf.m, ia, h0, OnSuccessListener, ra.m, r4.h, m0, i1, s, OnCompleteListener, vh.h0, d1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static v0.j p2(i iVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return iVar.y2();
        }
        if (obj instanceof v0.n) {
            for (p pVar : ((v0.n) obj).a) {
            }
        }
        Context ctx = (Context) iVar.b;
        kotlin.jvm.internal.j.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return iVar.y2();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            v0.l lVar = new v0.l(ctx);
            v0.l lVar2 = lVar.isAvailableOnDevice() ? lVar : null;
            return lVar2 == null ? iVar.y2() : lVar2;
        }
        if (i10 <= 33) {
            return iVar.y2();
        }
        return null;
    }

    @Override // ph.ia
    public void A1(float f10, int i10) {
        ArrayList arrayList;
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null || (arrayList = t6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((t6) k5Var.d.T.get(i10)).W = f10;
    }

    @Override // ph.ia
    public void B(float f10) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.G = f10;
        t6Var.j = true;
        k5Var.c();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override // ph.ia
    public void B1(float f10) {
        t6 t6Var = ((k5) this.b).d;
        if (t6Var == null) {
            return;
        }
        t6Var.a0 = f10;
        t6Var.j = true;
    }

    @Override // ph.ia
    public void C(long j10, boolean z4) {
        k5 k5Var = (k5) this.b;
        if (!z4) {
            k5Var.m(j10);
            return;
        }
        i71 i71Var = k5Var.e;
        if (i71Var != null) {
            i71Var.L(j10, true);
            return;
        }
        if (k5Var.j()) {
            k5Var.B.m(j10, true);
            return;
        }
        i71 i71Var2 = k5Var.y;
        if (i71Var2 != null) {
            i71Var2.L(j10, false);
        }
    }

    @Override // ph.ia
    public void C0(float f10, boolean z4) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.Z = f10;
        t6Var.j = true;
        i71 i71Var = k5Var.e;
        if (i71Var == null || i71Var.p() == -9223372036854775807L) {
            return;
        }
        k5Var.m((long) (f10 * k5Var.e.p()));
    }

    @Override // ph.ia
    public void C1() {
        ((k5) this.b).p(null);
    }

    @Override // ng.g
    public void D(Canvas canvas) {
        switch (this.a) {
            case 4:
                li liVar = (li) this.b;
                canvas.drawColor(liVar.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    liVar.z2.b(canvas, -2);
                    break;
                }
                break;
            default:
                lq0 lq0Var = (lq0) this.b;
                canvas.drawColor(lq0Var.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lq0Var.L0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // ng.g
    public void D1(x xVar) {
        switch (this.a) {
            case 4:
                xVar.a(((li) this.b).getThemedColor(j6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                xVar.a(((lq0) this.b).getThemedColor(j6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ m9 D2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean F1() {
        return false;
    }

    @Override // r4.h
    public long G(long j10, long j11) {
        return 0L;
    }

    @Override // o4.n0
    public long H() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.b) {
            long H = n0Var.H();
            if (H != Long.MIN_VALUE) {
                j10 = Math.min(j10, H);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h H0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // vh.h0
    public l9 J0() {
        n3 n3Var = ((x0) this.b).P;
        if (n3Var == null) {
            return null;
        }
        return n3Var.a.getTextSelectionHelper();
    }

    @Override // tf.i1
    public void J1(ArrayList arrayList) {
        switch (this.a) {
            case 21:
                u0 u0Var = (u0) this.b;
                String str = u0Var.W;
                if (str != null) {
                    u0Var.U(str, u0Var.Z, u0Var.a0, u0Var.Y, u0Var.X);
                    break;
                }
                break;
        }
    }

    @Override // r4.h
    public long K(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean K1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // vh.h0
    public void L0(CharSequence charSequence) {
        n3 n3Var = ((x0) this.b).P;
        if (n3Var != null) {
            n3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            n3Var.a.s4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1() {
        return false;
    }

    @Override // r4.h
    public long N1(long j10) {
        return 1L;
    }

    @Override // vh.h0
    public k9 O0() {
        return (x0) this.b;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // ph.ia
    public void P0(long j10) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.r0 = j10;
        t6Var.j = true;
        k5Var.y(true);
    }

    @Override // r4.h
    public long P1(long j10, long j11) {
        return 1L;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle S1(s1 s1Var) {
        return null;
    }

    @Override // vh.h0
    public vh.a T0() {
        return ((x0) this.b).a;
    }

    @Override // org.telegram.ui.Cells.j1
    public void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        da daVar = (da) this.b;
        org.telegram.ui.Cells.g gVar = daVar.v;
        if (daVar.a()) {
            daVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public void U0(int i10, s1 s1Var) {
        da daVar = (da) this.b;
        org.telegram.ui.Cells.g gVar = daVar.v;
        if (daVar.a()) {
            daVar.s = 2;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // r4.h
    public s4.j V(long j10) {
        return (s4.j) this.b;
    }

    @Override // vh.d1
    public /* synthetic */ boolean V0(e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // ph.ia
    public void W1(float f10) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.t0 = f10;
        t6Var.j = true;
        k5Var.y(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // g5.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c4.e X(j0 j0Var, IOException iOException, int i10) {
        long j10;
        p0 p0Var = (p0) j0Var;
        r4.g gVar = (r4.g) this.b;
        long j11 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        int i11 = p0Var.c;
        gVar.n.getClass();
        if (!(iOException instanceof r1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof b0) && !(iOException instanceof l0)) {
            int i12 = g5.n.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g5.n) || ((g5.n) th2).a != 2008) {
                }
            }
            j10 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            c4.e eVar = j10 != -9223372036854775807L ? g5.m0.f : new c4.e(0, j10, false);
            gVar.r.s(jVar, i11, iOException, !eVar.a());
            return eVar;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        gVar.r.s(jVar, i11, iOException, !eVar.a());
        return eVar;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h X0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // o4.m0
    public void X1(n0 n0Var) {
        t4.l lVar = (t4.l) this.b;
        lVar.D.X1(lVar);
    }

    @Override // vh.h0
    public boolean Y0() {
        x0 x0Var = (x0) this.b;
        n3 n3Var = x0Var.P;
        if (n3Var == null) {
            return false;
        }
        vh.a aVar = x0Var.a;
        return n3Var.a.R4();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ug.a Z() {
        return null;
    }

    @Override // ph.ia
    public void Z0(boolean z4) {
        b3 b3Var;
        ph.da daVar = ((s9) ((k5) this.b)).z0;
        h9 h9Var = daVar.s1;
        if (h9Var == null) {
            return;
        }
        b3 b3Var2 = null;
        if (!z4 && (h9Var.getSelectedEntity() instanceof b3)) {
            daVar.s1.D0(null, true);
            return;
        }
        if (!z4 || (daVar.s1.getSelectedEntity() instanceof b3)) {
            return;
        }
        w4 w4Var = daVar.s1.O0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= w4Var.getChildCount()) {
                b3Var = null;
                break;
            }
            View childAt = w4Var.getChildAt(i11);
            if (childAt instanceof b3) {
                b3Var = (b3) childAt;
                break;
            }
            i11++;
        }
        if (b3Var != null) {
            h9 h9Var2 = daVar.s1;
            w4 w4Var2 = h9Var2.O0;
            while (true) {
                if (i10 >= w4Var2.getChildCount()) {
                    break;
                }
                View childAt2 = w4Var2.getChildAt(i10);
                if (childAt2 instanceof b3) {
                    b3Var2 = (b3) childAt2;
                    break;
                }
                i10++;
            }
            h9Var2.D0(b3Var2, true);
        }
    }

    @Override // o8.q
    public Object a() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 22:
                r rVar = new r(2, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((t) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray(strArr);
                iVar.R0(M0, 7);
                break;
            default:
                o5.l lVar = new o5.l((TaskCompletionSource) obj2);
                w6.i iVar2 = (w6.i) ((w6.c) obj).u();
                l5.e eVar = (l5.e) this.b;
                Parcel I0 = iVar2.I0();
                int i10 = w6.f.a;
                I0.writeStrongBinder(lVar);
                w6.f.c(I0, eVar);
                iVar2.J0(I0, 1);
                break;
        }
    }

    @Override // o4.n0
    public boolean b() {
        for (n0 n0Var : (n0[]) this.b) {
            if (n0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // ph.ia
    public void b0() {
        k5 k5Var = (k5) this.b;
        k5Var.s(null, null, true);
        ph.da daVar = ((s9) k5Var).z0;
        s9 s9Var = daVar.U0;
        if (s9Var != null) {
            s9Var.s(null, null, true);
        }
        h9 h9Var = daVar.s1;
        if (h9Var != null) {
            h9Var.q0();
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null) {
            t9Var.setHasRoundVideo(false);
        }
        t6 t6Var = daVar.H1;
        if (t6Var != null) {
            File file = t6Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                daVar.H1.o0 = null;
            }
            if (daVar.H1.p0 != null) {
                try {
                    new File(daVar.H1.p0).delete();
                } catch (Exception unused2) {
                }
                daVar.H1.p0 = null;
            }
        }
    }

    @Override // ph.ia
    public void b2(int i10, long j10) {
        ArrayList arrayList;
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null || (arrayList = t6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((t6) k5Var.d.T.get(i10)).X = j10;
    }

    @Override // vh.h0, vh.d1
    public void c(e1 e1Var) {
        switch (this.a) {
            case 26:
                n3 n3Var = ((x0) this.b).P;
                if (n3Var != null) {
                    s3 s3Var = n3Var.a;
                    s3.L1(s3Var, e1Var);
                    s3Var.e3.d(e1Var, true);
                    break;
                }
                break;
            default:
                z4 z4Var = ((b5) this.b).s;
                if (z4Var != null) {
                    s3 s3Var2 = ((y2) z4Var).a;
                    s3.L1(s3Var2, e1Var);
                    s3Var2.e3.d(e1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(s1 s1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ cv0 c2() {
        return null;
    }

    @Override // ph.ia
    public void d(int i10) {
        y yVar = ((k5) this.b).B;
        if (yVar != null) {
            ArrayList arrayList = yVar.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ph.x xVar = (ph.x) obj;
                if (xVar.a == i10) {
                    xVar.b.d(1.0f, true);
                    yVar.invalidate();
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e() {
        return ((da) this.b).a();
    }

    @Override // ph.ia
    public void e0(float f10) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.s0 = f10;
        t6Var.j = true;
        k5Var.y(true);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // vh.h0
    public void f1(int i10, int i11) {
        x0 x0Var = (x0) this.b;
        n3 n3Var = x0Var.P;
        if (n3Var != null) {
            vh.a aVar = x0Var.a;
            d2 d2Var = n3Var.a.G3;
            if (d2Var != null) {
                d2Var.f(i10, i11);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
        da daVar = (da) this.b;
        org.telegram.ui.Cells.g gVar = daVar.v;
        if (daVar.a()) {
            daVar.s = 0;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // yd.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // vh.d1
    public void g1(e1 e1Var) {
        vh.a aVar;
        b5 b5Var = (b5) this.b;
        z4 z4Var = b5Var.s;
        if (z4Var == null || (aVar = b5Var.a) == null) {
            return;
        }
        s3 s3Var = ((y2) z4Var).a;
        ArrayList arrayList = s3Var.i3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((vh.a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        d2 d2Var = s3Var.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        vh.a aVar2 = new vh.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            android.support.v4.media.a.u(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        s3Var.r4();
        s3Var.V2.N(false);
        d2 d2Var2 = s3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        s3Var.post(new k2(s3Var, aVar2, 26));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // yd.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // vh.d1
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // vh.d1
    public /* synthetic */ boolean h0(e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean h1(int i10, s1 s1Var) {
        return i10 == ((da) this.b).s;
    }

    @Override // vh.h0
    public void h2() {
        x0 x0Var = (x0) this.b;
        n3 n3Var = x0Var.P;
        if (n3Var != null) {
            vh.a aVar = x0Var.a;
            s3.N1(n3Var.a);
        }
    }

    @Override // ph.ia
    public void i1(float f10, int i10) {
        ArrayList arrayList;
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null || (arrayList = t6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((t6) k5Var.d.T.get(i10)).V = f10;
    }

    @Override // ph.ia
    public void i2(long j10) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.D = j10;
        t6Var.j = true;
        k5Var.w(true);
    }

    @Override // yd.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override // ph.ia
    public void j1(float f10) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.F = f10;
        t6Var.j = true;
        k5Var.w(true);
    }

    @Override // tf.i1
    public void k(int i10) {
        switch (this.a) {
            case 21:
                ((u0) this.b).l();
                break;
            default:
                AndroidUtilities.runOnUIThread(new ga(this, 20));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int k0(s1 s1Var) {
        return 0;
    }

    @Override // g5.h0
    public void k1(j0 j0Var, long j10, long j11) {
        p0 p0Var = (p0) j0Var;
        r4.g gVar = (r4.g) this.b;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        gVar.n.getClass();
        gVar.r.p(jVar, p0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        s4.c cVar = (s4.c) p0Var.f;
        s4.c cVar2 = gVar.I;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i10 = 0;
        while (i10 < size && gVar.I.b(i10).b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.m.size()) {
                h5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.O;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    gVar.N = 0;
                } else {
                    h5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.O);
                }
            }
            int i11 = gVar.N;
            gVar.N = i11 + 1;
            if (i11 < gVar.n.p(p0Var.c)) {
                gVar.E.postDelayed(gVar.w, Math.min((gVar.N - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.D = new y0();
                return;
            }
        }
        gVar.I = cVar;
        gVar.J = cVar.d & gVar.J;
        gVar.K = j10 - j11;
        gVar.L = j10;
        synchronized (gVar.u) {
            try {
                if (p0Var.b.a == gVar.G) {
                    Uri uri2 = gVar.I.k;
                    if (uri2 == null) {
                        uri2 = p0Var.d.c;
                    }
                    gVar.G = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size != 0) {
            gVar.P += i10;
            gVar.u(true);
            return;
        }
        s4.c cVar3 = gVar.I;
        if (!cVar3.d) {
            gVar.u(true);
            return;
        }
        b6.h hVar = cVar3.i;
        if (hVar == null) {
            gVar.t();
            return;
        }
        String str = hVar.b;
        if (d0.a(str, "urn:mpeg:dash:utc:direct:2014") || d0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.M = d0.J(hVar.c) - gVar.L;
                gVar.u(true);
                return;
            } catch (r1 e) {
                h5.a.p("DashMediaSource", "Failed to resolve time offset.", e);
                gVar.u(true);
                return;
            }
        }
        if (d0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || d0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            p0 p0Var2 = new p0(gVar.A, Uri.parse(hVar.c), 5, new r4.f());
            gVar.B.f(p0Var2, new r4.d(gVar), 1);
            gVar.r.u(new o4.j(p0Var2.b), p0Var2.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            p0 p0Var3 = new p0(gVar.A, Uri.parse(hVar.c), 5, new u(21));
            gVar.B.f(p0Var3, new r4.d(gVar), 1);
            gVar.r.u(new o4.j(p0Var3.b), p0Var3.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (d0.a(str, "urn:mpeg:dash:utc:ntp:2014") || d0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.t();
        } else {
            h5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            gVar.u(true);
        }
    }

    @Override // o4.n0
    public void k2(long j10) {
        for (n0 n0Var : (n0[]) this.b) {
            n0Var.k2(j10);
        }
    }

    @Override // vh.h0
    public void l() {
        x0 x0Var = (x0) this.b;
        n3 n3Var = x0Var.P;
        if (n3Var != null) {
            s3.O1(n3Var.a, x0Var.a);
        }
    }

    @Override // vh.d1
    public void l1(Editable editable) {
        ((b5) this.b).h();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    public q5.o m2() {
        q5.o oVar = (q5.o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    @Override // o4.n0
    public boolean n0(long j10) {
        boolean z4;
        boolean z10 = false;
        do {
            long H = H();
            if (H == Long.MIN_VALUE) {
                return z10;
            }
            z4 = false;
            for (n0 n0Var : (n0[]) this.b) {
                long H2 = n0Var.H();
                boolean z11 = H2 != Long.MIN_VALUE && H2 <= j10;
                if (H2 == H || z11) {
                    z4 |= n0Var.n0(j10);
                }
            }
            z10 |= z4;
        } while (z4);
        return z10;
    }

    @Override // vh.d1
    public void n1(e1 e1Var, int i10, int i11) {
        z4 z4Var;
        l9 textSelectionHelper;
        b5 b5Var = (b5) this.b;
        if (b5Var.w || i10 == i11 || (z4Var = b5Var.s) == null || (textSelectionHelper = ((y2) z4Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        e1Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e3 A[Catch: a | c -> 0x0676, TryCatch #4 {a | c -> 0x0676, blocks: (B:292:0x05c9, B:293:0x05df, B:295:0x05e3, B:296:0x05e6, B:298:0x05ea, B:300:0x05f4, B:302:0x05fa, B:307:0x05ff), top: B:291:0x05c9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0 n2(qa qaVar) {
        ArrayList arrayList;
        ub.c cVar;
        ub.c cVar2;
        ub.c cVar3;
        float f10;
        float f11;
        ub.a aVar;
        float f12;
        float f13;
        float f14;
        int i10;
        int i11;
        ob.j[] jVarArr;
        ob.a aVar2;
        pb.b bVar;
        int i12;
        pb.d dVar;
        int i13;
        w0 w0Var;
        List list;
        String str;
        int i14;
        boolean z4;
        double d;
        double abs;
        int i15;
        char c3;
        int i16;
        i iVar = (i) this.b;
        pb.b j02 = qaVar.j0();
        tp0 tp0Var = new tp0(j02, 18);
        ub.e eVar = new ub.e(j02);
        int i17 = j02.b;
        int i18 = j02.a;
        int i19 = (i17 * 3) / 388;
        if (i19 < 3) {
            i19 = 3;
        }
        int[] iArr = new int[5];
        int i20 = i19 - 1;
        int i21 = 0;
        boolean z10 = false;
        while (true) {
            int i22 = 1;
            arrayList = eVar.b;
            if (i20 >= i17 || z10) {
                break;
            }
            Arrays.fill(iArr, i21);
            int i23 = 0;
            while (i23 < i18) {
                if (j02.b(i23, i20)) {
                    if ((i21 & 1) == i22) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + i22;
                    i15 = i17;
                } else {
                    if ((i21 & 1) != 0) {
                        i15 = i17;
                        iArr[i21] = iArr[i21] + 1;
                    } else if (i21 == 4) {
                        if (!ub.e.b(iArr)) {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        } else if (eVar.c(i20, i23, iArr)) {
                            if (eVar.c) {
                                z10 = eVar.d();
                                i15 = i17;
                            } else {
                                if (arrayList.size() > i22) {
                                    int size = arrayList.size();
                                    int i24 = 0;
                                    ub.c cVar4 = null;
                                    while (true) {
                                        if (i24 >= size) {
                                            i15 = i17;
                                            c3 = 2;
                                            i16 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i24);
                                        i24++;
                                        ub.c cVar5 = (ub.c) obj;
                                        i15 = i17;
                                        if (cVar5.d >= 2) {
                                            if (cVar4 != null) {
                                                eVar.c = true;
                                                c3 = 2;
                                                i16 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        i17 = i15;
                                    }
                                } else {
                                    i15 = i17;
                                    i16 = 0;
                                    c3 = 2;
                                }
                                if (i16 > iArr[c3]) {
                                    i20 += (i16 - r5) - 2;
                                    i23 = i18 - 1;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i19 = 2;
                            i21 = 0;
                        } else {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        }
                        i21 = 3;
                    } else {
                        i15 = i17;
                        int i25 = i21 + 1;
                        iArr[i25] = iArr[i25] + 1;
                        i21 = i25;
                    }
                    i23++;
                    i17 = i15;
                    i22 = 1;
                }
                i23++;
                i17 = i15;
                i22 = 1;
            }
            int i26 = i17;
            if (ub.e.b(iArr) && eVar.c(i20, i18, iArr)) {
                int i27 = iArr[0];
                if (eVar.c) {
                    i19 = i27;
                    z10 = eVar.d();
                } else {
                    i19 = i27;
                }
            }
            i20 += i19;
            i17 = i26;
            i21 = 0;
        }
        if (arrayList.size() < 3) {
            throw ob.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ub.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, ub.e.e);
        ub.c[] cVarArr = new ub.c[3];
        int i28 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i29 = 2; i28 < arrayList.size() - i29; i29 = 2) {
            ub.c cVar6 = (ub.c) arrayList.get(i28);
            float f15 = cVar6.c;
            i28++;
            int i30 = i28;
            while (i30 < arrayList.size() - 1) {
                ub.c cVar7 = (ub.c) arrayList.get(i30);
                double e = ub.e.e(cVar6, cVar7);
                i30++;
                for (int i31 = i30; i31 < arrayList.size(); i31++) {
                    ub.c cVar8 = (ub.c) arrayList.get(i31);
                    if (cVar8.c <= 1.4f * f15) {
                        double e6 = ub.e.e(cVar7, cVar8);
                        double e10 = ub.e.e(cVar6, cVar8);
                        if (e < e6) {
                            if (e6 <= e10) {
                                e10 = e6;
                                e6 = e10;
                            } else if (e >= e10) {
                                d = e10;
                                e10 = e;
                                abs = Math.abs(e6 - (d * 2.0d)) + Math.abs(e6 - (e10 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d10 = abs;
                                }
                            }
                            d = e;
                            abs = Math.abs(e6 - (d * 2.0d)) + Math.abs(e6 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e6 >= e10) {
                                d = e10;
                                e10 = e6;
                            } else if (e < e10) {
                                d = e6;
                                e6 = e10;
                                e10 = e;
                                abs = Math.abs(e6 - (d * 2.0d)) + Math.abs(e6 - (e10 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e6;
                            }
                            e6 = e;
                            abs = Math.abs(e6 - (d * 2.0d)) + Math.abs(e6 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw ob.e.a();
        }
        float a2 = ob.j.a(cVarArr[0], cVarArr[1]);
        float a10 = ob.j.a(cVarArr[1], cVarArr[2]);
        float a11 = ob.j.a(cVarArr[0], cVarArr[2]);
        if (a10 >= a2 && a10 >= a11) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a11 < a10 || a11 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f16 = cVar.a;
        float f17 = cVar.b;
        if (ai.c(cVar2.a, f16, cVar3.b - f17, (cVar2.b - f17) * (cVar3.a - f16)) < 0.0f) {
            ub.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float i32 = tp0Var.i(cVar, cVar3);
        float f18 = cVar.a;
        float f19 = cVar3.b;
        float f20 = cVar3.a;
        float i33 = tp0Var.i(cVar, cVar2);
        float f21 = cVar2.b;
        float f22 = cVar2.a;
        float f23 = (i33 + i32) / 2.0f;
        if (f23 < 1.0f) {
            throw ob.e.a();
        }
        float a12 = ob.j.a(cVar, cVar3) / f23;
        int i34 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = ob.j.a(cVar, cVar2) / f23;
        int i35 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i34) / 2;
        int i36 = i35 + 7;
        int i37 = i36 & 3;
        if (i37 == 0) {
            i36 = i35 + 8;
        } else if (i37 == 2) {
            i36 = i35 + 6;
        } else if (i37 == 3) {
            i36 = i35 + 5;
        }
        int i38 = i36;
        int[] iArr2 = tb.e.e;
        if (i38 % 4 != 1) {
            throw ob.c.a();
        }
        try {
            tb.e c10 = tb.e.c((i38 - 17) / 4);
            int i39 = (c10.a * 4) + 10;
            if (c10.b.length > 0) {
                float f24 = (f20 - f18) + f22;
                f11 = f20;
                float f25 = (f19 - f17) + f21;
                float f26 = 1.0f - (3.0f / i39);
                int w10 = (int) e2.c.w(f24, f18, f26, f18);
                int w11 = (int) e2.c.w(f25, f17, f26, f17);
                f10 = f18;
                for (int i40 = 4; i40 <= 16; i40 <<= 1) {
                    try {
                        aVar = tp0Var.m(f23, i40, w10, w11);
                        break;
                    } catch (ob.e unused) {
                    }
                }
            } else {
                f10 = f18;
                f11 = f20;
            }
            aVar = null;
            float f27 = i38 - 3.5f;
            if (aVar != null) {
                f12 = aVar.a;
                f13 = aVar.b;
                f14 = f27 - 3.0f;
            } else {
                f12 = (f11 - f10) + f22;
                f13 = (f19 - f17) + f21;
                f14 = f27;
            }
            float f28 = f13;
            float f29 = cVar.a;
            float f30 = cVar.b;
            float f31 = cVar3.a;
            float f32 = cVar3.b;
            float f33 = cVar2.a;
            float f34 = cVar2.b;
            pb.g a14 = pb.g.a(3.5f, 3.5f, f27, 3.5f, f14, f14, 3.5f, f27);
            ub.a aVar3 = aVar;
            float f35 = a14.e;
            float f36 = a14.i;
            float f37 = f35 * f36;
            float f38 = a14.f;
            float f39 = a14.h;
            float f40 = f37 - (f38 * f39);
            float f41 = a14.g;
            float f42 = f38 * f41;
            float f43 = a14.d;
            float f44 = f42 - (f43 * f36);
            float f45 = (f43 * f39) - (f35 * f41);
            float f46 = a14.c;
            float f47 = f46 * f39;
            float f48 = a14.b;
            float f49 = f47 - (f48 * f36);
            float f50 = a14.a;
            float f51 = (f36 * f50) - (f46 * f41);
            float f52 = (f41 * f48) - (f39 * f50);
            float f53 = (f48 * f38) - (f46 * f35);
            float f54 = (f46 * f43) - (f38 * f50);
            float f55 = (f50 * f35) - (f48 * f43);
            pb.g a15 = pb.g.a(f29, f30, f31, f32, f12, f28, f33, f34);
            float f56 = a15.a;
            float f57 = a15.d;
            float f58 = a15.g;
            float f59 = (f58 * f53) + (f57 * f49) + (f56 * f40);
            float f60 = (f58 * f54) + (f57 * f51) + (f56 * f44);
            float f61 = (f58 * f55) + (f57 * f52) + (f56 * f45);
            float f62 = a15.b;
            float f63 = a15.e;
            float f64 = a15.h;
            float f65 = (f64 * f53) + (f63 * f49) + (f62 * f40);
            float f66 = (f64 * f54) + (f63 * f51) + (f62 * f44);
            float f67 = (f64 * f55) + (f63 * f52) + (f62 * f45);
            float f68 = a15.c;
            float f69 = a15.f;
            float f70 = a15.i;
            float f71 = (f53 * f70) + (f49 * f69) + (f40 * f68);
            float f72 = (f54 * f70) + (f51 * f69) + (f44 * f68);
            float f73 = (f70 * f55) + (f69 * f52) + (f68 * f45);
            if (i38 <= 0 || i38 <= 0) {
                throw ob.e.a();
            }
            pb.b bVar2 = new pb.b(i38, i38);
            int i41 = i38 * 2;
            ub.c cVar10 = cVar;
            float[] fArr = new float[i41];
            int i42 = 0;
            while (i42 < i38) {
                int i43 = i38;
                float f74 = i42 + 0.5f;
                int i44 = 0;
                while (i44 < i41) {
                    int i45 = i44;
                    fArr[i45] = (i45 / 2) + 0.5f;
                    fArr[i45 + 1] = f74;
                    i44 = i45 + 2;
                }
                int i46 = i41 - 1;
                int i47 = i42;
                int i48 = 0;
                while (i48 < i46) {
                    float f75 = fArr[i48];
                    int i49 = i48 + 1;
                    int i50 = i48;
                    float f76 = fArr[i49];
                    ub.c cVar11 = cVar2;
                    float A = e2.c.A(f72, f76, f71 * f75, f73);
                    fArr[i50] = (((f60 * f76) + (f59 * f75)) + f61) / A;
                    fArr[i49] = (((f76 * f66) + (f75 * f65)) + f67) / A;
                    i48 = i50 + 2;
                    cVar2 = cVar11;
                }
                ub.c cVar12 = cVar2;
                int i51 = j02.b;
                float f77 = f72;
                int i52 = 0;
                boolean z11 = true;
                while (i52 < i46 && z11) {
                    int i53 = (int) fArr[i52];
                    int i54 = i52 + 1;
                    int i55 = i46;
                    int i56 = (int) fArr[i54];
                    int i57 = i52;
                    if (i53 < -1 || i53 > i18 || i56 < -1 || i56 > i51) {
                        throw ob.e.a();
                    }
                    if (i53 == -1) {
                        fArr[i57] = 0.0f;
                    } else if (i53 == i18) {
                        fArr[i57] = i18 - 1;
                    } else {
                        z4 = false;
                        if (i56 != -1) {
                            fArr[i54] = 0.0f;
                        } else if (i56 == i51) {
                            fArr[i54] = i51 - 1;
                        } else {
                            z11 = z4;
                            i52 = i57 + 2;
                            i46 = i55;
                        }
                        z11 = true;
                        i52 = i57 + 2;
                        i46 = i55;
                    }
                    z4 = true;
                    if (i56 != -1) {
                    }
                    z11 = true;
                    i52 = i57 + 2;
                    i46 = i55;
                }
                int i58 = i41 - 2;
                boolean z12 = true;
                while (i58 >= 0 && z12) {
                    int i59 = (int) fArr[i58];
                    int i60 = i58 + 1;
                    int i61 = i58;
                    int i62 = (int) fArr[i60];
                    if (i59 < -1 || i59 > i18 || i62 < -1 || i62 > i51) {
                        throw ob.e.a();
                    }
                    if (i59 == -1) {
                        fArr[i61] = 0.0f;
                    } else if (i59 == i18) {
                        fArr[i61] = i18 - 1;
                    } else {
                        z12 = false;
                        if (i62 != -1) {
                            fArr[i60] = 0.0f;
                        } else if (i62 == i51) {
                            fArr[i60] = i51 - 1;
                        } else {
                            i58 = i61 - 2;
                        }
                        z12 = true;
                        i58 = i61 - 2;
                    }
                    z12 = true;
                    if (i62 != -1) {
                    }
                    z12 = true;
                    i58 = i61 - 2;
                }
                for (int i63 = 0; i63 < i41; i63 += 2) {
                    try {
                        if (j02.b((int) fArr[i63], (int) fArr[i63 + 1])) {
                            int i64 = i63 / 2;
                            int i65 = (i64 / 32) + (bVar2.c * i47);
                            int[] iArr3 = bVar2.d;
                            iArr3[i65] = iArr3[i65] | (1 << (i64 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw ob.e.a();
                    }
                }
                i42 = i47 + 1;
                i38 = i43;
                f72 = f77;
                cVar2 = cVar12;
            }
            ub.c cVar13 = cVar2;
            if (aVar3 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new ob.j[]{cVar13, cVar10, cVar3};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new ob.j[]{cVar13, cVar10, cVar3, aVar3};
            }
            ob.j[] jVarArr2 = jVarArr;
            iVar.getClass();
            cb.m mVar = new cb.m();
            int i66 = bVar2.b;
            if (i66 < 21 || (i66 & i11) != i10) {
                throw ob.c.a();
            }
            mVar.b = bVar2;
            try {
                dVar = iVar.o2(mVar);
            } catch (ob.a e11) {
                aVar2 = e11;
                e = null;
                try {
                    mVar.s();
                    mVar.c = null;
                    mVar.d = null;
                    mVar.a = true;
                    mVar.r();
                    mVar.q();
                    bVar = (pb.b) mVar.b;
                    i12 = 0;
                    while (i12 < bVar.a) {
                        int i67 = i12 + 1;
                        for (int i68 = i67; i68 < bVar.b; i68++) {
                            if (bVar.b(i12, i68) != bVar.b(i68, i12)) {
                                bVar.a(i68, i12);
                                bVar.a(i12, i68);
                            }
                        }
                        i12 = i67;
                    }
                    pb.d o22 = iVar.o2(mVar);
                    o22.e = new u(23);
                    dVar = o22;
                    i13 = dVar.f;
                    if (e2.c.s(dVar.e)) {
                        ob.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    w0Var = new w0(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        w0Var.z(ob.i.d, Integer.valueOf(i14));
                        w0Var.z(ob.i.e, Integer.valueOf(i13));
                    }
                    w0Var.z(ob.i.c, dVar.d);
                    w0Var.z(ob.i.f, "]Q" + dVar.h);
                    return w0Var;
                } catch (ob.a | ob.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (ob.c e12) {
                e = e12;
                aVar2 = null;
                mVar.s();
                mVar.c = null;
                mVar.d = null;
                mVar.a = true;
                mVar.r();
                mVar.q();
                bVar = (pb.b) mVar.b;
                i12 = 0;
                while (i12 < bVar.a) {
                }
                pb.d o222 = iVar.o2(mVar);
                o222.e = new u(23);
                dVar = o222;
                i13 = dVar.f;
                if (e2.c.s(dVar.e)) {
                }
                w0Var = new w0(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                w0Var.z(ob.i.c, dVar.d);
                w0Var.z(ob.i.f, "]Q" + dVar.h);
                return w0Var;
            }
            i13 = dVar.f;
            if (e2.c.s(dVar.e) && jVarArr2.length >= 3) {
                ob.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            w0Var = new w0(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                w0Var.z(ob.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                w0Var.z(ob.i.b, str);
            }
            if (i13 >= 0 && (i14 = dVar.g) >= 0) {
                w0Var.z(ob.i.d, Integer.valueOf(i14));
                w0Var.z(ob.i.e, Integer.valueOf(i13));
            }
            w0Var.z(ob.i.c, dVar.d);
            w0Var.z(ob.i.f, "]Q" + dVar.h);
            return w0Var;
        } catch (IllegalArgumentException unused4) {
            throw ob.c.a();
        }
    }

    @Override // yd.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // yd.a
    public boolean needClickAt(View view, float f10, float f11) {
        int dp = AndroidUtilities.dp(9.0f);
        j61 j61Var = (j61) this.b;
        float f12 = -dp;
        j61Var.g.inset(f12, f12);
        boolean contains = j61Var.g.contains(f10, f11);
        float f13 = dp;
        j61Var.g.inset(f13, f13);
        return contains;
    }

    @Override // yd.a
    public /* synthetic */ boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override // ph.ia
    public void o0(boolean z4) {
        k5 k5Var = (k5) this.b;
        if (k5Var.j()) {
            k5Var.B.getClass();
        }
        k5Var.x(-4, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0348, code lost:
    
        throw ob.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a4 A[LOOP:21: B:147:0x0226->B:177:0x03a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0373 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pb.d o2(cb.m mVar) {
        int f10;
        tb.d dVar;
        tb.b bVar;
        int i10;
        int i11;
        pb.c cVar;
        int f11;
        tb.e r10 = mVar.r();
        tb.b bVar2 = mVar.q().a;
        tb.c q10 = mVar.q();
        tb.e r11 = mVar.r();
        int i12 = m1.j.d(8)[q10.b];
        pb.b bVar3 = (pb.b) mVar.b;
        int i13 = bVar3.b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (ai.b(i12, i14, i15)) {
                    bVar3.a(i15, i14);
                }
            }
        }
        int i16 = r11.a * 4;
        int i17 = i16 + 17;
        int i18 = r11.d;
        pb.b bVar4 = new pb.b(i17, i17);
        bVar4.c(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar4.c(i19, 0, 8, 9);
        bVar4.c(0, i19, 9, 8);
        int[] iArr = r11.b;
        int length = iArr.length;
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = iArr[i20] - 2;
            for (int i22 = 0; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar4.c(iArr[i22] - 2, i21, 5, 5);
                }
            }
        }
        int i23 = 6;
        bVar4.c(6, 9, 1, i16);
        bVar4.c(9, 6, i16, 1);
        if (r11.a > 6) {
            int i24 = i16 + 6;
            bVar4.c(i24, 0, 3, 6);
            bVar4.c(0, i24, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i25 = i13 - 1;
        int i26 = i25;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z4 = true;
        while (i26 > 0) {
            if (i26 == i23) {
                i26--;
            }
            for (int i30 = 0; i30 < i13; i30++) {
                int i31 = z4 ? i25 - i30 : i30;
                for (int i32 = 0; i32 < 2; i32++) {
                    int i33 = i26 - i32;
                    if (!bVar4.b(i33, i31)) {
                        i28++;
                        i29 <<= 1;
                        if (bVar3.b(i33, i31)) {
                            i29 |= 1;
                        }
                        if (i28 == 8) {
                            bArr[i27] = (byte) i29;
                            i27++;
                            i28 = 0;
                            i29 = 0;
                        }
                    }
                }
            }
            z4 = !z4;
            i26 -= 2;
            i23 = 6;
        }
        if (i27 != i18) {
            throw ob.c.a();
        }
        if (i18 != r10.d) {
            throw new IllegalArgumentException();
        }
        w wVar = r10.c[bVar2.ordinal()];
        c5.e[] eVarArr = (c5.e[]) wVar.c;
        int i34 = wVar.b;
        int i35 = 0;
        for (c5.e eVar : eVarArr) {
            i35 += eVar.a;
        }
        j9.l[] lVarArr = new j9.l[i35];
        int i36 = 0;
        for (c5.e eVar2 : eVarArr) {
            int i37 = 0;
            while (i37 < eVar2.a) {
                int i38 = eVar2.b;
                lVarArr[i36] = new j9.l(i38, new byte[i34 + i38]);
                i37++;
                i36++;
            }
        }
        int length2 = lVarArr[0].b.length;
        int i39 = i35 - 1;
        while (i39 >= 0 && lVarArr[i39].b.length != length2) {
            i39--;
        }
        int i40 = i39 + 1;
        int i41 = length2 - i34;
        int i42 = 0;
        int i43 = 0;
        while (i42 < i41) {
            int i44 = i43;
            int i45 = 0;
            while (i45 < i36) {
                lVarArr[i45].b[i42] = bArr[i44];
                i45++;
                i44++;
            }
            i42++;
            i43 = i44;
        }
        int i46 = i40;
        while (i46 < i36) {
            lVarArr[i46].b[i41] = bArr[i43];
            i46++;
            i43++;
        }
        boolean z10 = false;
        int length3 = lVarArr[0].b.length;
        while (i41 < length3) {
            int i47 = i43;
            int i48 = 0;
            while (i48 < i36) {
                lVarArr[i48].b[i48 < i40 ? i41 : i41 + 1] = bArr[i47];
                i48++;
                i47++;
            }
            i41++;
            i43 = i47;
        }
        int i49 = 0;
        for (int i50 = 0; i50 < i35; i50++) {
            i49 += lVarArr[i50].a;
        }
        byte[] bArr2 = new byte[i49];
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        while (i52 < i35) {
            j9.l lVar = lVarArr[i52];
            byte[] bArr3 = lVar.b;
            int i54 = lVar.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i55 = 0; i55 < length4; i55++) {
                iArr2[i55] = bArr3[i55] & 255;
            }
            try {
                int k10 = ((tp0) this.b).k(bArr3.length - i54, iArr2);
                for (int i56 = 0; i56 < i54; i56++) {
                    bArr3[i56] = (byte) iArr2[i56];
                }
                i51 += k10;
                int i57 = i53;
                int i58 = 0;
                while (i58 < i54) {
                    bArr2[i57] = bArr3[i58];
                    i58++;
                    i57++;
                }
                i52++;
                i53 = i57;
            } catch (rb.c unused) {
                ob.a aVar = ob.a.c;
                if (ob.h.a) {
                    throw new ob.a();
                }
                throw ob.a.c;
            }
        }
        char[] cArr = tb.a.a;
        p2.g gVar = new p2.g();
        gVar.c = bArr2;
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i59 = -1;
        int i60 = -1;
        boolean z11 = false;
        boolean z12 = false;
        pb.c cVar2 = null;
        while (true) {
            try {
                int d = gVar.d();
                tb.d dVar2 = tb.d.c;
                if (d < 4 || (f10 = gVar.f(4)) == 0) {
                    dVar = dVar2;
                } else if (f10 == 1) {
                    dVar = tb.d.d;
                } else if (f10 == 2) {
                    dVar = tb.d.e;
                } else if (f10 == 3) {
                    dVar = tb.d.f;
                } else if (f10 == 4) {
                    dVar = tb.d.h;
                } else if (f10 == 5) {
                    dVar = tb.d.s;
                } else if (f10 == 7) {
                    dVar = tb.d.n;
                } else if (f10 == 8) {
                    dVar = tb.d.r;
                } else if (f10 == 9) {
                    dVar = tb.d.v;
                } else {
                    if (f10 != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = tb.d.w;
                }
                int ordinal = dVar.ordinal();
                if (ordinal != 0) {
                    bVar = bVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i51;
                            i11 = 1;
                            int f12 = gVar.f(8);
                            if ((f12 & 128) == 0) {
                                f11 = f12 & 127;
                            } else if ((f12 & 192) == 128) {
                                f11 = ((f12 & 63) << 8) | gVar.f(8);
                            } else {
                                if ((f12 & 224) != 192) {
                                    throw ob.c.a();
                                }
                                f11 = ((f12 & 31) << 16) | gVar.f(16);
                            }
                            HashMap hashMap = pb.c.c;
                            if (f11 < 0 || f11 >= 900) {
                                break;
                            }
                            pb.c cVar3 = (pb.c) pb.c.c.get(Integer.valueOf(f11));
                            if (cVar3 == null) {
                                throw ob.c.a();
                            }
                            cVar = cVar3;
                        } else if (ordinal == 7) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z11 = true;
                            z10 = true;
                        } else if (ordinal == 8) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z11 = true;
                            z12 = true;
                        } else if (ordinal != 9) {
                            int f13 = gVar.f(dVar.a(r10));
                            int ordinal2 = dVar.ordinal();
                            i10 = i51;
                            if (ordinal2 == 1) {
                                tb.a.e(gVar, sb, f13);
                            } else if (ordinal2 == 2) {
                                tb.a.a(gVar, sb, f13, z11);
                            } else if (ordinal2 == 4) {
                                tb.a.b(gVar, sb, f13, cVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw ob.c.a();
                                }
                                tb.a.d(gVar, sb, f13);
                            }
                        } else {
                            i10 = i51;
                            int f14 = gVar.f(4);
                            int f15 = gVar.f(dVar.a(r10));
                            i11 = 1;
                            if (f14 == 1) {
                                tb.a.c(gVar, sb, f15);
                            }
                        }
                        int i61 = i59;
                        if (dVar == dVar2) {
                            if (cVar != null) {
                                i11 = z10 ? 4 : z12 ? 6 : 2;
                            } else if (z10) {
                                i11 = 3;
                            } else if (z12) {
                                i11 = 5;
                            }
                            pb.d dVar3 = new pb.d(bArr2, sb.toString(), arrayList.isEmpty() ? null : arrayList, bVar.toString(), i61, i60, i11);
                            dVar3.d = Integer.valueOf(i10);
                            return dVar3;
                        }
                        i59 = i61;
                        bVar2 = bVar;
                        cVar2 = cVar;
                        i51 = i10;
                    } else {
                        i10 = i51;
                        i11 = 1;
                        if (gVar.d() < 16) {
                            throw ob.c.a();
                        }
                        i59 = gVar.f(8);
                        i60 = gVar.f(8);
                    }
                    cVar = cVar2;
                    int i612 = i59;
                    if (dVar == dVar2) {
                    }
                } else {
                    bVar = bVar2;
                    i10 = i51;
                }
                i11 = 1;
                cVar = cVar2;
                int i6122 = i59;
                if (dVar == dVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw ob.c.a();
            }
        }
    }

    @Override // yd.a
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((j61) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // yd.a
    public void onClickTouchDown(View view, float f10, float f11) {
        ((j61) this.b).h.c(true);
    }

    @Override // yd.a
    public void onClickTouchUp(View view, float f10, float f11) {
        ((j61) this.b).h.c(false);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ld.m mVar = (ld.m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(p7.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // yd.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.google.android.gms.internal.cast.d2 d2Var;
        com.google.android.gms.internal.cast.d1 b10;
        r5.a aVar = (r5.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (o0.j) {
            Context context = aVar.a;
            u5.s sVar = aVar.f;
            o0 o0Var = new o0(context, sVar, aVar.c, aVar.j, aVar.g);
            int i10 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z4 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (!z4) {
                    return;
                }
                i10 = 0;
                z4 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String k10 = w2.k(packageName, ".client_cast_analytics_data");
            o0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            q.b(context);
            o0Var.g = q.a().c(w2.a.e).a("CAST_SENDER_SDK", new v2.c("proto"), z.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                o0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(k10, 0);
            if (i10 != 0) {
                v e = com.google.android.gms.common.api.internal.w.e();
                e.c = new o3.c(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 21);
                e.d = new y5.c[]{q5.y.c};
                e.b = false;
                e.a = 8426;
                Task e6 = sVar.e(0, e.e());
                h5.u uVar = new h5.u();
                uVar.b = o0Var;
                uVar.c = packageName;
                uVar.a = i10;
                uVar.d = sharedPreferences;
                e6.addOnSuccessListener(uVar);
            }
            if (z4) {
                b6.m.h(sharedPreferences);
                u5.b bVar = com.google.android.gms.internal.cast.d2.i;
                synchronized (com.google.android.gms.internal.cast.d2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.d2.k == null) {
                            com.google.android.gms.internal.cast.d2.k = new com.google.android.gms.internal.cast.d2(sharedPreferences, o0Var, packageName);
                        }
                        d2Var = com.google.android.gms.internal.cast.d2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.c;
                SharedPreferences sharedPreferences2 = d2Var.b;
                HashSet hashSet = d2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.d2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                com.google.android.gms.internal.cast.d1 b11 = com.google.android.gms.internal.cast.d2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    b6.m.h(d2Var.e);
                    b6.m.h(d2Var.d);
                    d2Var.e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                com.google.android.gms.internal.cast.d2.a(com.google.android.gms.internal.cast.d1.h);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return e();
    }

    @Override // r4.h
    public boolean q1() {
        return true;
    }

    public void q2() {
        t4.l lVar = (t4.l) this.b;
        int i10 = lVar.E - 1;
        lVar.E = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (t4.r rVar : lVar.G) {
            rVar.d();
            i11 += rVar.V.a;
        }
        s0[] s0VarArr = new s0[i11];
        int i12 = 0;
        for (t4.r rVar2 : lVar.G) {
            rVar2.d();
            int i13 = rVar2.V.a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.d();
                s0VarArr[i12] = rVar2.V.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.F = new t0(s0VarArr);
        lVar.D.E1(lVar);
    }

    @Override // yf.m
    public void r0() {
        ((c0) this.b).d.invalidate();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // vh.h0
    public void s1() {
        x0 x0Var = (x0) this.b;
        n3 n3Var = x0Var.P;
        if (n3Var != null) {
            vh.a aVar = x0Var.a;
            s3 s3Var = n3Var.a;
            d2 d2Var = s3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            s3Var.e3.onContentChanged();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean t0(u5 u5Var) {
        return false;
    }

    @Override // tf.i1
    public /* synthetic */ boolean t1(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // r4.h
    public long u0(long j10, long j11) {
        return 0L;
    }

    @Override // ra.m
    public Object u2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            a8 a8Var = ua.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e6);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override // ph.ia
    public void v(float f10) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.u0 = f10;
        t6Var.j = true;
        k5Var.c();
    }

    @Override // ph.ia
    public void v1(float f10) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.E = f10;
        t6Var.j = true;
        k5Var.w(true);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // ph.ia
    public void w0(float f10, int i10) {
        ArrayList arrayList;
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null || (arrayList = t6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((t6) k5Var.d.T.get(i10)).P = f10;
    }

    @Override // vh.d1
    public /* synthetic */ boolean w1(boolean z4) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean w2(MotionEvent motionEvent) {
        boolean z4;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        n20 n20Var;
        boolean z10;
        m20 m20Var = (m20) this.b;
        int i10 = m20.w;
        n20 n20Var2 = m20Var.f;
        androidx.mediarouter.app.d dVar = m20Var.e;
        int action = motionEvent.getAction();
        if (m20Var.v == null) {
            m20Var.v = VelocityTracker.obtain();
        }
        m20Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z11 = i11 == 6;
        int actionIndex = z11 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f10 = motionEvent.getX(i12) + f10;
                f11 = motionEvent.getY(i12) + f11;
            }
        }
        float f12 = z11 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        if (i11 == 0) {
            if (m20Var.g != null && n20Var2.a()) {
                boolean hasMessages = dVar.hasMessages(3);
                if (hasMessages) {
                    dVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = m20Var.m;
                if (motionEvent4 != null && (motionEvent3 = m20Var.n) != null && hasMessages && m20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x10 * x10) < m20Var.b) {
                        m20Var.o = true;
                        z4 = m20Var.g.onDoubleTap(m20Var.m) | m20Var.g.onDoubleTapEvent(motionEvent);
                        m20Var.p = f13;
                        m20Var.r = f13;
                        m20Var.q = f14;
                        m20Var.s = f14;
                        motionEvent2 = m20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        m20Var.m = MotionEvent.obtain(motionEvent);
                        m20Var.k = true;
                        m20Var.l = true;
                        m20Var.h = true;
                        m20Var.j = false;
                        m20Var.i = false;
                        if (m20Var.t) {
                            dVar.removeMessages(2);
                            dVar.sendEmptyMessageAtTime(2, m20Var.m.getDownTime() + i10 + m20Var.u);
                        }
                        dVar.sendEmptyMessageAtTime(1, m20Var.m.getDownTime() + i10);
                        return n20Var2.onDown(motionEvent) | z4;
                    }
                }
                dVar.sendEmptyMessageDelayed(3, 220L);
            }
            z4 = false;
            m20Var.p = f13;
            m20Var.r = f13;
            m20Var.q = f14;
            m20Var.s = f14;
            motionEvent2 = m20Var.m;
            if (motionEvent2 != null) {
            }
            m20Var.m = MotionEvent.obtain(motionEvent);
            m20Var.k = true;
            m20Var.l = true;
            m20Var.h = true;
            m20Var.j = false;
            m20Var.i = false;
            if (m20Var.t) {
            }
            dVar.sendEmptyMessageAtTime(1, m20Var.m.getDownTime() + i10);
            return n20Var2.onDown(motionEvent) | z4;
        }
        if (i11 == 1) {
            m20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (m20Var.o) {
                onFling = m20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (m20Var.j) {
                    dVar.removeMessages(3);
                    m20Var.j = false;
                } else if (m20Var.k) {
                    boolean onSingleTapUp = n20Var2.onSingleTapUp(motionEvent);
                    if (m20Var.i && (n20Var = m20Var.g) != null) {
                        n20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = m20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, m20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > m20Var.c || Math.abs(xVelocity) > m20Var.c) {
                        onFling = n20Var2.onFling(m20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = m20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            m20Var.n = obtain;
            VelocityTracker velocityTracker2 = m20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                m20Var.v = null;
            }
            m20Var.o = false;
            m20Var.i = false;
            dVar.removeMessages(1);
            dVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                m20Var.v.recycle();
                m20Var.v = null;
                m20Var.o = false;
                m20Var.h = false;
                m20Var.k = false;
                m20Var.l = false;
                m20Var.i = false;
                if (m20Var.j) {
                    m20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                m20Var.p = f13;
                m20Var.r = f13;
                m20Var.q = f14;
                m20Var.s = f14;
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                m20Var.o = false;
                m20Var.k = false;
                m20Var.l = false;
                m20Var.i = false;
                if (m20Var.j) {
                    m20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                m20Var.p = f13;
                m20Var.r = f13;
                m20Var.q = f14;
                m20Var.s = f14;
                m20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, m20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = m20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = m20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((m20Var.v.getYVelocity(pointerId3) * yVelocity2) + (m20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            m20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!m20Var.j) {
            float f15 = m20Var.p - f13;
            float f16 = m20Var.q - f14;
            if (m20Var.o) {
                return m20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (m20Var.k) {
                int i14 = (int) (f13 - m20Var.r);
                int i15 = (int) (f14 - m20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > m20Var.a) {
                    z10 = n20Var2.onScroll(m20Var.m, motionEvent, f15, f16);
                    m20Var.p = f13;
                    m20Var.q = f14;
                    m20Var.k = false;
                    dVar.removeMessages(3);
                    dVar.removeMessages(1);
                    dVar.removeMessages(2);
                } else {
                    z10 = false;
                }
                if (i16 > m20Var.a) {
                    m20Var.l = false;
                }
                return z10;
            }
            if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                boolean onScroll = n20Var2.onScroll(m20Var.m, motionEvent, f15, f16);
                m20Var.p = f13;
                m20Var.q = f14;
                return onScroll;
            }
        }
        return false;
    }

    @Override // androidx.activity.result.b
    public void x(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.K;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // g5.h0
    public void x0(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        r4.g gVar = (r4.g) this.b;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        gVar.n.getClass();
        gVar.r.m(jVar, p0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // r4.h
    public long x1() {
        return 0L;
    }

    @Override // o4.n0
    public long y1() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.b) {
            long y12 = n0Var.y1();
            if (y12 != Long.MIN_VALUE) {
                j10 = Math.min(j10, y12);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public v0.j y2() {
        String string;
        Context context = (Context) this.b;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List m9 = tc.g.m(arrayList);
        if (m9.isEmpty()) {
            return null;
        }
        Iterator it = m9.iterator();
        v0.j jVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.j jVar2 = (v0.j) newInstance;
                if (!jVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (jVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    jVar = jVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return jVar;
    }

    @Override // ph.ia
    public void z0(float f10) {
        k5 k5Var = (k5) this.b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.P = f10;
        k5Var.c();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z2(int i10) {
        return false;
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r4.h
    public long a(long j10) {
        return 0L;
    }

    public i(MediaInfo mediaInfo) {
        this.a = 12;
        q5.o oVar = new q5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public i(JSONObject jSONObject) {
        this.a = 12;
        this.b = new q5.o(jSONObject);
    }

    public i(Context context) {
        this.a = 24;
        kotlin.jvm.internal.j.e(context, "context");
        this.b = context;
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                this.b = new h5.w(10);
                break;
            case 18:
                this.b = new i(20);
                break;
            case 20:
                this.b = new tp0(rb.a.h, 12);
                break;
        }
    }

    public i(Context context, n20 n20Var) {
        this.a = 5;
        this.b = new m20(context, n20Var);
    }

    public i(int i10, int i11) {
        this.a = 6;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(android.support.v4.media.a.k(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
    }

    @Override // yf.m
    public void d2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1() {
    }

    @Override // vh.d1
    public /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v2() {
    }

    private final /* synthetic */ void t2(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
    }

    @Override // yf.m
    public void G1(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void I0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var) {
    }

    @Override // yf.m
    public void M0(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O1(s1 s1Var) {
    }

    @Override // vh.d1
    public /* synthetic */ void Q0(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var, jh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l2(s1 s1Var, long j10) {
    }

    @Override // r4.h
    public long p(long j10, long j11) {
        return j11;
    }

    @Override // vh.d1
    public /* synthetic */ void r(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C2(s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(s1 s1Var, float f10, float f11) {
    }

    @Override // yd.a
    public /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override // yd.a
    public /* synthetic */ void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override // yd.a
    public /* synthetic */ void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // yd.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
