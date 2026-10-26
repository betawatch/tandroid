package li;

import a8.aa;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.ka;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.cv0;
import org.telegram.ui.p9;
import org.telegram.ui.x9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class e3 implements f1, m.x0, org.telegram.ui.Cells.j1, ig.z1, x9, s4.e0, com.google.android.gms.common.api.internal.r, o5.b, Continuation, y2.g {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ e3(int i10) {
        this.a = i10;
    }

    @Override // s4.e0
    public void A(int i10, int i11) {
        ((s4.h0) this.b).p(i10, i11);
    }

    @Override // y2.g
    public void B(y2.i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.b;
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.y(new IOException(new ConcurrentModificationException()));
        }
    }

    public int B0() {
        return ((z0() & 255) << 24) | ((z0() & 255) << 16) | ((z0() & 255) << 8) | (z0() & 255);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean C0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // li.f1
    public void E(g1 g1Var, int i10, int i11) {
        e5 e5Var;
        s9 textSelectionHelper;
        g5 g5Var = (g5) this.b;
        if (g5Var.w || i10 == i11 || (e5Var = g5Var.s) == null || (textSelectionHelper = ((a3) e5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        g1Var.post(new hi.v4(this, g1Var, i11, textSelectionHelper, i10, 3));
    }

    @Override // org.telegram.ui.Cells.j1
    public void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        ka kaVar = (ka) this.b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.s = 2;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ cv0 E1() {
        return null;
    }

    public int G0() {
        return ((z0() & Byte.MAX_VALUE) << 21) | ((z0() & Byte.MAX_VALUE) << 14) | ((z0() & Byte.MAX_VALUE) << 7) | (z0() & Byte.MAX_VALUE);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean G1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.x9
    public void H(String str) {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
        try {
            a1Var.P = System.currentTimeMillis();
            a1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.x9
    public String H0() {
        return ((org.telegram.ui.web.a1) this.b).i0;
    }

    @Override // org.telegram.ui.Cells.j1
    public void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
        ka kaVar = (ka) this.b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.s = 0;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M() {
        return false;
    }

    public void M0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // s4.e0
    public void N0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return i10 == ((ka) this.b).s;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int S() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(MessageObject messageObject) {
        return org.telegram.ui.d3.a(messageObject);
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ jh.a V() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X1(int i10) {
        return false;
    }

    @Override // li.f1
    public void Y(Editable editable) {
        ((g5) this.b).g();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 18:
                h8.e eVar = (h8.e) this.b;
                s7.z zVar = (s7.z) ((s7.k) obj).u();
                s7.f fVar = new s7.f(1, (TaskCompletionSource) obj2);
                Parcel N0 = zVar.N0();
                s7.d.c(N0, eVar);
                s7.d.d(N0, fVar);
                N0.writeString(null);
                zVar.R0(N0, 63);
                return;
            default:
                w8.e eVar2 = (w8.e) this.b;
                f8.b bVar = (f8.b) obj;
                bVar.getClass();
                f8.a aVar = new f8.a(1, (TaskCompletionSource) obj2);
                try {
                    f8.i iVar = (f8.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = f8.c.a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    aa.a(Status.h, Boolean.FALSE, aVar.b);
                    return;
                }
        }
    }

    @Override // li.f1
    public void b(g1 g1Var) {
        e5 e5Var = ((g5) this.b).s;
        if (e5Var != null) {
            v3 v3Var = ((a3) e5Var).a;
            v3.S1(v3Var, g1Var);
            v3Var.p3.s(g1Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ t9 b2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean c() {
        return ((ka) this.b).a();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ boolean d1(String str, p9 p9Var) {
        return false;
    }

    @Override // li.f1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e0() {
        return c();
    }

    @Override // ig.z1
    public void f(int i10) {
        ir0 ir0Var = (ir0) this.b;
        mr0 mr0Var = ir0Var.K;
        ir0Var.s = i10;
        if (ir0Var.v != i10) {
            ir0Var.d.clear();
        }
        int i11 = ir0Var.J;
        if (ir0Var.h() != 0 || ir0Var.e.e() || ir0Var.I) {
            mr0Var.y0.b(i11);
        } else {
            mr0Var.R.e(false, true);
        }
        ir0Var.l();
        int i12 = mr0.Z0;
        mr0Var.M0(true);
    }

    @Override // li.f1
    public /* synthetic */ boolean f0(boolean z10) {
        return false;
    }

    @Override // li.f1
    public /* synthetic */ boolean g(g1 g1Var) {
        return false;
    }

    @Override // s4.e0
    public void g1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // id.a
    public Object get() {
        String packageName = ((Context) ((id.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h0(org.telegram.ui.Components.c6 c6Var) {
        return false;
    }

    @Override // s4.e0
    public void i0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // ig.z1
    public boolean k0(int i10) {
        return i10 == ((ir0) this.b).r;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k1() {
        return false;
    }

    @Override // li.f1
    public /* synthetic */ boolean o(g1 g1Var) {
        return false;
    }

    @Override // org.telegram.ui.x9
    public void onDismiss() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
        a1Var.y("scan_qr_popup_closed", null);
        a1Var.h0 = false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // li.f1
    public void t(g1 g1Var) {
        a aVar;
        g5 g5Var = (g5) this.b;
        e5 e5Var = g5Var.s;
        if (e5Var == null || (aVar = g5Var.a) == null) {
            return;
        }
        v3 v3Var = ((a3) e5Var).a;
        ArrayList arrayList = v3Var.t3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a1.g.A(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        v3Var.y4();
        v3Var.g3.O(false);
        f2 f2Var2 = v3Var.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        v3Var.post(new m2(v3Var, aVar2, 26));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            case 21:
                ue.b bVar = ue.b.e;
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String u(long j10) {
        return null;
    }

    public void v0() {
        rg.a1 a1Var = ((rg.c1) this.b).d;
        if (a1Var != null) {
            rg.z0 z0Var = a1Var.s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.s = null;
            }
            rg.z0 z0Var2 = new rg.z0(a1Var, 1);
            a1Var.s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override // y2.g
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.b).a.y(iOException);
        return y2.l.e;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    public void x0(a8.h0 h0Var) {
        i8.j jVar = (i8.j) this.b;
        jVar.a = h0Var;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((y6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    @Override // org.telegram.ui.Cells.j1
    public void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ka kaVar = (ka) this.b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    public byte z0() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public /* synthetic */ e3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public e3(TextView textView) {
        this.a = 15;
        this.b = new q1.g(textView);
    }

    public e3(int i10, int i11) {
        this.a = 10;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(a1.g.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // m.x0
    public void G(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ void R0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // li.f1
    public /* synthetic */ void T(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(int i10) {
    }

    @Override // m.x0
    public void a(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // ig.z1
    public /* synthetic */ void p0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // li.f1
    public /* synthetic */ void R() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // li.f1
    public /* synthetic */ void k(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // y2.g
    public void l0(y2.i iVar, long j10, long j11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override // y2.g
    public /* synthetic */ void z(y2.i iVar, long j10, long j11, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
