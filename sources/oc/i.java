package oc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import c2.u;
import cg.r1;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.z3;
import f7.v;
import i7.r7;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import m.s3;
import nh.d6;
import nh.kb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.n;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.Components.voip.w1;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a21;
import org.telegram.ui.dm0;
import org.telegram.ui.ew;
import org.telegram.ui.ey;
import org.telegram.ui.fi1;
import org.telegram.ui.fy;
import org.telegram.ui.g7;
import org.telegram.ui.jm0;
import org.telegram.ui.lu0;
import org.telegram.ui.q31;
import org.telegram.ui.q6;
import org.telegram.ui.t31;
import org.telegram.ui.vk0;
import org.telegram.ui.vm0;
import org.telegram.ui.xu;
import org.telegram.ui.yu;
import p2.y;
import pa.m;
import r4.q;
import th.b4;
import th.c1;
import th.d1;
import th.d3;
import th.g0;
import th.h0;
import th.m3;
import th.n3;
import th.p;
import th.p3;
import th.t3;
import th.t5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class i implements me.b, c6, qt, kb, j1, g7, cl0, jm0, qg.a, u61, y, q, r5.a, n3, c1 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    public static i K1(View view) {
        return new i(view);
    }

    public static String T1(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A1() {
        return false;
    }

    public void A2(h3 h3Var, o3 o3Var) {
        try {
            v3 t10 = w3.t();
            t10.d(o3Var);
            t10.c();
            w3.o((w3) t10.b, h3Var);
            ((u) this.c).h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter B() {
        switch (this.a) {
            case 1:
                return g6.v3;
            case 13:
                return g6.v3;
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.v3 : c6Var.B();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int C0(int i10) {
        switch (this.a) {
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : g6.w0(null, i10, false);
            case 13:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                return sparseIntArray2 != null ? sparseIntArray2.get(i10) : g6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.w0(null, i10, false) : c6Var.C0(i10);
        }
    }

    @Override // qg.a
    public void E0(Canvas canvas, float f9, float f10, float f11, float f12) {
        switch (this.a) {
            case 11:
                canvas.save();
                canvas.clipRect(f9, f10, f11, f12);
                ((PhotoViewer) this.c).T0(canvas, (ka) this.b, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
                break;
            default:
                Paint paint = (Paint) this.b;
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
                r1 r1Var = premiumPreviewFragment.i0;
                if (!premiumPreviewFragment.d0) {
                    r1Var.d(0, (-premiumPreviewFragment.Z.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, premiumPreviewFragment.Z.getMeasuredWidth(), 0.0f, premiumPreviewFragment.Z.getMeasuredHeight());
                    canvas.drawRect(f9, f10, f11, f12, r1Var.f);
                    break;
                } else {
                    paint.setColor(premiumPreviewFragment.getThemedColor(g6.a7));
                    canvas.drawRect(f9, f10, f11, f12, paint);
                    break;
                }
        }
    }

    @Override // me.b
    public me.a E1(g9.l lVar) {
        List list = (List) this.c;
        List list2 = (List) lVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new j(lVar, (List) this.b, list);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint G(String str) {
        switch (this.a) {
            case 1:
                return g6.S0(str);
            case 13:
                return g6.S0(str);
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.S0(str) : c6Var.G(str);
        }
    }

    @Override // th.n3
    public void G0() {
        p pVar = (p) this.c;
        if (pVar.getCurrentItemTop() != pVar.E) {
            pVar.b.X1(pVar, 0);
        }
        pVar.a0();
        p.J(pVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // nh.kb
    public void I0(float f9, boolean z10) {
        xb0 xb0Var = (xb0) this.b;
        ff0 ff0Var = (ff0) this.c;
        x61 x61Var = ff0Var.d;
        if (x61Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long q6 = (long) ((((f9 / (1.0f - max)) * max) + f9) * x61Var.q());
        ff0Var.e = q6;
        ff0Var.d.M(q6, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xb0Var);
        AndroidUtilities.runOnUIThread(xb0Var, 120L);
    }

    @Override // th.n3
    public void J(th.a aVar) {
        p pVar = (p) this.c;
        ni niVar = pVar.b;
        o2 o2Var = niVar.b0;
        if (o2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(o2Var)) {
            ni niVar2 = new ni(pVar.getContext(), niVar.b0, false, false, false, null);
            niVar2.V1 = new ya.a(22);
            niVar2.L = true;
            niVar2.t1.setVisibility(8);
            niVar2.p2 = new w1(pVar, aVar, niVar2, 5);
            niVar2.r1();
            niVar2.show();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // th.n3
    public void K0(int i10) {
        p pVar = (p) this.c;
        pVar.b.X1(pVar, i10);
        pVar.a0();
        p.J(pVar);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void L0(int i10, int i11) {
        switch (this.a) {
            case 1:
            case 13:
                break;
            default:
                c6 c6Var = (c6) this.c;
                if (c6Var != null) {
                    c6Var.L0(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.jm0
    public void M(String str, String str2) {
        vm0 vm0Var = ((dm0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            vm0Var.O1(true, str2, (vk0) this.b, this, vm0Var.x1);
        } else {
            vm0Var.N1(true, false);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean M0(long j10) {
        return ((uz0) this.c).v;
    }

    public p2.d M1() {
        if (((p2.l) this.b) != null) {
            return new p2.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.g7
    public void O0(q6 q6Var, kh.a aVar, boolean z10) {
        yu yuVar = (yu) this.c;
        xu xuVar = yuVar.T;
        if (aVar != null) {
            ((kh.b) this.b).i(aVar);
            yuVar.a0.d();
            kh.b bVar = yuVar.c0;
            ux0[] ux0VarArr = yuVar.X;
            y1[] y1VarArr = yuVar.Y;
            y1 y1Var = y1VarArr[0];
            if (y1Var != null) {
                ux0 ux0Var = ux0VarArr[0];
                boolean z11 = bVar.m;
                ux0Var.c = z11;
                y1Var.c(z11, true);
            }
            y1 y1Var2 = y1VarArr[1];
            if (y1Var2 != null) {
                ux0 ux0Var2 = ux0VarArr[1];
                boolean z12 = bVar.n;
                ux0Var2.c = z12;
                y1Var2.c(z12, true);
            }
            y1 y1Var3 = y1VarArr[2];
            if (y1Var3 != null) {
                ux0 ux0Var3 = ux0VarArr[2];
                boolean z13 = bVar.o;
                ux0Var3.c = z13;
                y1Var3.c(z13, true);
            }
            y1 y1Var4 = y1VarArr[3];
            if (y1Var4 != null) {
                ux0 ux0Var4 = ux0VarArr[3];
                boolean z14 = bVar.p;
                ux0Var4.c = z14;
                y1Var4.c(z14, true);
            }
            y1 y1Var5 = y1VarArr[4];
            if (y1Var5 != null) {
                ux0 ux0Var5 = ux0VarArr[4];
                boolean z15 = bVar.q;
                ux0Var5.c = z15;
                y1Var5.c(z15, true);
            }
            yuVar.W.a(xuVar.d(), true);
            xuVar.c(true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle P1(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q(s1 s1Var) {
        return false;
    }

    @Override // th.n3
    public void Q0(m3 m3Var, View view) {
        p pVar = (p) this.c;
        j70 j70Var = new j70(pVar, (c6) this.b, view, false, false, true);
        j70Var.Q = true;
        pVar.D = b4.c(j70Var, pVar.b.b0, pVar.getContext(), (c6) this.b, m3Var, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // th.c1
    public void S0(d1 d1Var) {
        ((g0) this.b).i();
    }

    @Override // th.c1
    public void T0(d1 d1Var, int i10, int i11) {
        k9 x4;
        g0 g0Var = (g0) this.b;
        if (((h0) this.c).d || i10 == i11 || (x4 = g0Var.x()) == null) {
            return;
        }
        if (x4.y() && x4.W == g0Var.D()) {
            return;
        }
        d1Var.post(new nj(this, d1Var, i11, x4, g0Var, i10));
    }

    @Override // th.n3
    public void U(d1 d1Var, boolean z10) {
        ((p) this.c).b.t1(d1Var, z10);
    }

    @Override // th.n3
    public void U0(th.o3 o3Var, View view) {
        p pVar = (p) this.c;
        j70 j70Var = new j70(pVar, (c6) this.b, view, false, false, true);
        j70Var.Q = true;
        o2 o2Var = pVar.b.b0;
        pVar.getContext();
        pVar.D = b4.b(j70Var, o2Var, o3Var, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // th.n3
    public void W(int i10) {
        p.O((p) this.c, 74, i10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ sg.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ lu0 Y1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Z(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // th.c1
    public void Z0(CharSequence charSequence) {
        ((g0) this.b).B(charSequence);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        switch (this.a) {
        }
        return g6.I.q();
    }

    @Override // th.n3
    public void a1(t5 t5Var, String str) {
        p pVar = (p) this.c;
        if (pVar.v == null) {
            c6 c6Var = (c6) this.b;
            pVar.v = new s3(new fi1(10, this, c6Var), c6Var);
        }
        pVar.v.f(t5Var, str);
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean a2(long j10) {
        return ((uz0) this.c).s;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean b(float f9, float f10, int i10, View view) {
        fy fyVar = (fy) this.c;
        if (view instanceof p2) {
            p2 p2Var = (p2) view;
            if (p2Var.j2) {
                fyVar.N4(p2Var.getDialogId(), view);
                return true;
            }
        }
        ew ewVar = fyVar.v0;
        if (ewVar != null && ewVar.getVisibility() == 0 && fyVar.v0.n) {
            return false;
        }
        return fyVar.o4(view, i10, f9, ((ey) this.b).d);
    }

    @Override // th.n3
    public void b0() {
        p pVar = (p) this.c;
        p3 p3Var = pVar.r;
        t3 t3Var = pVar.s;
        if (t3Var != null) {
            d3 d3Var = p3Var.j3;
            int i10 = (d3Var != null && d3Var.y() && p3Var.C4()) ? 1 : 0;
            if (t3Var.T == 2) {
                t3Var.U = i10;
            } else {
                t3Var.f(i10, true);
            }
            if (i10 != 0) {
                pVar.W();
            }
        }
        pVar.Z();
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(int i10, s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // th.n3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(float f9) {
        boolean z10;
        t3 t3Var = ((p) this.c).s;
        if (t3Var != null) {
            FrameLayout frameLayout = t3Var.D;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f9 >= r4[1]) {
                    z10 = true;
                    t3Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            t3Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m d2(ua.a aVar) {
        String str;
        m d6Var;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        m mVar = null;
        m gVar = EnumSet.class.isAssignableFrom(cls) ? new o4.g(type, 10) : cls == EnumMap.class ? new n(type, 9) : null;
        if (gVar != null) {
            return gVar;
        }
        pa.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                r7 r7Var = sa.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e10) {
                    str = "Failed making constructor '" + sa.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + sa.c.e(e10);
                }
                d6Var = str != null ? new d6(str, 16) : new o1.a(declaredConstructor, 14);
            } catch (NoSuchMethodException unused) {
            }
            if (d6Var == null) {
                return d6Var;
            }
            int i10 = 20;
            if (Collection.class.isAssignableFrom(cls)) {
                mVar = SortedSet.class.isAssignableFrom(cls) ? new ab.b(i10) : Set.class.isAssignableFrom(cls) ? new bb.a(i10) : Queue.class.isAssignableFrom(cls) ? new v(i10) : new x9.d(i10);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    mVar = new ya.a(i10);
                } else {
                    int i11 = 21;
                    mVar = ConcurrentMap.class.isAssignableFrom(cls) ? new ab.b(i11) : SortedMap.class.isAssignableFrom(cls) ? new bb.a(i11) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new ua.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new x9.d(i11) : new v(i11);
                }
            }
            if (mVar != null) {
                return mVar;
            }
            String T1 = T1(cls);
            return T1 != null ? new g5.c(T1) : new d6(cls, 15);
        }
        d6Var = null;
        if (d6Var == null) {
        }
    }

    @Override // org.telegram.ui.g7
    public void dismiss() {
        ((yu) this.c).dismiss();
    }

    @Override // th.c1
    public void e(d1 d1Var) {
        ((g0) this.b).e(d1Var);
    }

    @Override // org.telegram.ui.Components.qt
    public void e1() {
        org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) this.c;
        ((st) this.b).getText();
        d3Var.b();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int f0(s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int g1(int i10) {
        switch (this.a) {
            case 1:
                return ((SparseIntArray) this.b).get(i10);
            case 13:
                return C0(i10);
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.w0(null, i10, false) : c6Var.g1(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 1:
                return null;
            case 13:
                return null;
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.O0(str) : c6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((fy) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int h0(int i10) {
        switch (this.a) {
            case 1:
                return C0(i10);
            case 13:
                return C0(i10);
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.w0(null, i10, false) : c6Var.h0(i10);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // th.c1
    public /* synthetic */ boolean i1(d1 d1Var) {
        return false;
    }

    public void i2(p2.l lVar) {
        this.b = lVar;
        if (lVar.a() != null) {
            lVar.a().getClass();
            String str = lVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean j0() {
        return false;
    }

    @Override // th.n3
    public void k0() {
        t3 t3Var = ((p) this.c).s;
        if (t3Var != null) {
            int i10 = t3Var.T;
            if (i10 == 2) {
                i10 = 0;
            }
            t3Var.U = i10;
            t3Var.e(false, false);
            t3Var.f(2, true);
        }
    }

    public void k2(f3 f3Var) {
        try {
            z2(f3Var, (o3) this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f9, float f10, int i10, int i11) {
        switch (this.a) {
            case 1:
                g6.q(f9, f10, i10, i11);
                break;
            case 13:
                g6.q(f9, f10, i10, i11);
                break;
            default:
                c6 c6Var = (c6) this.c;
                if (c6Var != null) {
                    c6Var.l(f9, f10, i10, i11);
                    break;
                } else {
                    g6.q(f9, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean l0() {
        switch (this.a) {
            case 1:
                return false;
            case 13:
                return false;
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.a1() : c6Var.l0();
        }
    }

    @Override // th.n3
    public void l1() {
        t3 t3Var = ((p) this.c).s;
        if (t3Var != null) {
            t3Var.e(false, true);
            int i10 = t3Var.U;
            t3Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    public void l2(f3 f3Var, int i10, long j10) {
        try {
            com.google.android.gms.internal.play_billing.n3 n3Var = (com.google.android.gms.internal.play_billing.n3) ((o3) this.b).g();
            n3Var.c();
            o3.p((o3) n3Var.b, i10);
            o3 o3Var = (o3) n3Var.a();
            this.b = o3Var;
            if (j10 != 0) {
                com.google.android.gms.internal.play_billing.n3 n3Var2 = (com.google.android.gms.internal.play_billing.n3) o3Var.g();
                n3Var2.c();
                o3.r((o3) n3Var2.b, j10);
                o3Var = (o3) n3Var2.a();
            }
            z2(f3Var, o3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // th.c1
    public boolean m() {
        return ((g0) this.b).M();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean n0(y5 y5Var) {
        return false;
    }

    @Override // th.c1
    public void n1(Editable editable) {
        ((h0) this.c).i();
        ((g0) this.b).i0();
    }

    @Override // r5.a
    public void o0(Bitmap bitmap) {
        i iVar = (i) this.b;
        iVar.c = bitmap;
        r5.f fVar = (r5.f) this.c;
        fVar.l = iVar;
        fVar.b();
    }

    public void o2(f3 f3Var, long j10, boolean z10) {
        o3 o3Var;
        try {
            e3 e3Var = (e3) f3Var.g();
            com.google.android.gms.internal.play_billing.s3 s3Var = (com.google.android.gms.internal.play_billing.s3) f3Var.o().g();
            s3Var.c();
            u3.n((u3) s3Var.b, z10);
            e3Var.c();
            f3.r((f3) e3Var.b, (u3) s3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                o3Var = (o3) this.b;
            } else {
                com.google.android.gms.internal.play_billing.n3 n3Var = (com.google.android.gms.internal.play_billing.n3) ((o3) this.b).g();
                n3Var.c();
                o3.r((o3) n3Var.b, j10);
                o3Var = (o3) n3Var.a();
            }
            z2(f3Var2, o3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // th.n3
    public void onContentChanged() {
        p pVar = (p) this.c;
        t3 t3Var = pVar.s;
        if (t3Var != null) {
            t3Var.setSendLoading(pVar.r.m3());
        }
        pVar.V(true);
        pVar.Y();
        th.d dVar = pVar.L;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override // org.telegram.ui.Components.u61
    public void onError(x61 x61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.X;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.X = i10 - 1;
        AndroidUtilities.runOnUIThread(new t31(1, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        q31 q31Var = secretMediaViewer.e1;
        if (secretMediaViewer.y == null || secretMediaViewer.d0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(q31Var);
        AndroidUtilities.runOnUIThread(q31Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        if (i10 == 3 && secretMediaViewer.w.getVisibility() != 0) {
            secretMediaViewer.w.setVisibility(0);
        }
        if (secretMediaViewer.y.z() && i10 != 4) {
            if (secretMediaViewer.A) {
                return;
            }
            secretMediaViewer.A = true;
        } else if (secretMediaViewer.A) {
            secretMediaViewer.A = false;
            if (i10 == 4) {
                secretMediaViewer.D = true;
                if (secretMediaViewer.E) {
                    secretMediaViewer.e(true, !secretMediaViewer.m1);
                } else {
                    secretMediaViewer.y.M(0L, false);
                    secretMediaViewer.y.D();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.u61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        e5.c cVar = ((SecretMediaViewer) this.c).w;
        if (cVar != null) {
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            cVar.a(i10 == 0 ? 1.0f : (i11 * f9) / i10, i12);
        }
    }

    public void p2(f3 f3Var, int i10, long j10, boolean z10) {
        o3 o3Var;
        try {
            com.google.android.gms.internal.play_billing.n3 n3Var = (com.google.android.gms.internal.play_billing.n3) ((o3) this.b).g();
            n3Var.c();
            o3.p((o3) n3Var.b, i10);
            this.b = (o3) n3Var.a();
            e3 e3Var = (e3) f3Var.g();
            com.google.android.gms.internal.play_billing.s3 s3Var = (com.google.android.gms.internal.play_billing.s3) f3Var.o().g();
            s3Var.c();
            u3.n((u3) s3Var.b, z10);
            e3Var.c();
            f3.r((f3) e3Var.b, (u3) s3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                o3Var = (o3) this.b;
            } else {
                com.google.android.gms.internal.play_billing.n3 n3Var2 = (com.google.android.gms.internal.play_billing.n3) ((o3) this.b).g();
                n3Var2.c();
                o3.r((o3) n3Var2.b, j10);
                o3Var = (o3) n3Var2.a();
            }
            z2(f3Var2, o3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // qg.a
    public /* synthetic */ void q() {
        int i10 = this.a;
    }

    @Override // r4.q
    public s0 q0(r4.m mVar, r4.j jVar) {
        return new g9.l(((q) this.c).q0(mVar, jVar), (List) this.b, false, 15);
    }

    @Override // th.n3
    public j70 q1(View view) {
        p pVar = (p) this.c;
        j70 j70Var = new j70(pVar, (c6) this.b, view, false, false, true);
        pVar.D = j70Var;
        return j70Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public void r(float f9) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((fy) this.c).movePreviewFragment(f9);
        }
    }

    @Override // th.c1
    public /* synthetic */ boolean r0(d1 d1Var) {
        return false;
    }

    public void r2(k3 k3Var) {
        try {
            v3 t10 = w3.t();
            t10.d((o3) this.b);
            t10.c();
            w3.p((w3) t10.b, k3Var);
            ((u) this.c).h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // th.n3
    public void s1() {
        p pVar = (p) this.c;
        pVar.X();
        pVar.Y();
    }

    @Override // th.c1
    public /* synthetic */ boolean t1(boolean z10) {
        return false;
    }

    public void t2(z3 z3Var) {
        try {
            u uVar = (u) this.c;
            v3 t10 = w3.t();
            t10.d((o3) this.b);
            t10.c();
            w3.r((w3) t10.b, z3Var);
            uVar.h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public String toString() {
        switch (this.a) {
            case 19:
                return ((HashMap) this.b).toString();
            case 20:
            default:
                return super.toString();
            case 21:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean u2(int i10) {
        return false;
    }

    @Override // qg.a
    public ng.d v() {
        switch (this.a) {
            case 11:
                if (Build.VERSION.SDK_INT < 29) {
                    break;
                } else {
                    ng.e eVar = new ng.e(this);
                    ((PhotoViewer) this.c).V.add(eVar);
                    break;
                }
        }
        return new ng.f(this);
    }

    @Override // r4.q
    public s0 v1() {
        return new g9.l(((q) this.c).v1(), (List) this.b, false, 15);
    }

    public void v2(a4 a4Var) {
        if (a4Var == null) {
            return;
        }
        try {
            v3 t10 = w3.t();
            t10.d((o3) this.b);
            t10.c();
            w3.s((w3) t10.b, a4Var);
            ((u) this.c).h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public String y(long j10) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((uz0) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ l9 y2() {
        return null;
    }

    @Override // th.c1
    public void z(int i10, int i11) {
        ((g0) this.b).h0(i10, i11);
    }

    public void z2(f3 f3Var, o3 o3Var) {
        if (f3Var == null) {
            return;
        }
        try {
            v3 t10 = w3.t();
            t10.d(o3Var);
            t10.c();
            w3.n((w3) t10.b, f3Var);
            ((u) this.c).h((w3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.u61
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.Y) {
            return;
        }
        secretMediaViewer.Y = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ i(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public i(Context context, o3 o3Var) {
        this.a = 17;
        u uVar = new u(6);
        try {
            y2.q.b(context);
            uVar.c = y2.q.a().c(w2.a.e).a("PLAY_BILLING_LIBRARY", new v2.c("proto"), new x9.d(19));
        } catch (Throwable unused) {
            uVar.b = true;
        }
        this.c = uVar;
        this.b = o3Var;
    }

    public i(IBinder iBinder) {
        this.a = 29;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new v5.g(iBinder);
            this.b = null;
            return;
        }
        this.b = new Messenger(iBinder);
        this.c = null;
    }

    public i(y5.a aVar) {
        this.a = 24;
        this.b = aVar == null ? null : aVar.b;
    }

    public i(c6 c6Var) {
        this.a = 15;
        this.b = new SparseIntArray();
        this.c = c6Var;
        G1();
    }

    private final /* synthetic */ void X1() {
    }

    private final /* synthetic */ void Z1() {
    }

    public void G1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S1() {
    }

    @Override // nh.kb
    public /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.g7
    public void clear() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.g7
    public void o1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t() {
    }

    @Override // th.c1
    public /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w2() {
    }

    @Override // nh.kb
    public /* synthetic */ void y1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z0() {
    }

    public i(View view) {
        this.a = 7;
        i61 i61Var = new i61(this, view);
        this.b = i61Var;
        view.addOnLayoutChangeListener(i61Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C1(s1 s1Var) {
    }

    @Override // nh.kb
    public /* synthetic */ void D(float f9) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void D0(s1 s1Var) {
    }

    @Override // nh.kb
    public /* synthetic */ void D1(long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // nh.kb
    public /* synthetic */ void H0(float f9) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void X0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y0(s1 s1Var) {
    }

    @Override // nh.kb
    public /* synthetic */ void b1(long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // nh.kb
    public /* synthetic */ void d1(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(s1 s1Var) {
    }

    @Override // nh.kb
    public /* synthetic */ void i(int i10) {
    }

    @Override // nh.kb
    public /* synthetic */ void i0(float f9) {
    }

    @Override // nh.kb
    public /* synthetic */ void j1(float f9) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // nh.kb
    public /* synthetic */ void r1(float f9) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(s1 s1Var) {
    }

    @Override // nh.kb
    public /* synthetic */ void s0(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w(s1 s1Var) {
    }

    @Override // nh.kb
    public /* synthetic */ void x(float f9) {
    }

    @Override // nh.kb
    public /* synthetic */ void x1(float f9) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var) {
    }

    @Override // nh.kb
    public /* synthetic */ void z1(float f9) {
    }

    public i(ff0 ff0Var) {
        this.a = 5;
        this.c = ff0Var;
        this.b = new xb0(this, 9);
    }

    public i(String str, String str2) {
        this.a = 28;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public i(String str) {
        this.a = 25;
        this.c = null;
        this.b = str;
    }

    private final /* synthetic */ void f2(int i10, int i11) {
    }

    private final /* synthetic */ void h2(int i10, int i11) {
    }

    @Override // nh.kb
    public /* synthetic */ void B1(int i10, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F1(s1 s1Var, boolean z10) {
    }

    @Override // nh.kb
    public /* synthetic */ void I(long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P0(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // nh.kb
    public /* synthetic */ void f1(float f9, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g2(s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var, hh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1(s1 s1Var, TLRPC.Document document) {
    }

    @Override // nh.kb
    public /* synthetic */ void w1(float f9, int i10) {
    }

    @Override // nh.kb
    public /* synthetic */ void x0(float f9, int i10) {
    }

    public i(EditText editText) {
        this.a = 20;
        this.b = editText;
        q1.i iVar = new q1.i(editText);
        this.c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.b == null) {
            synchronized (q1.a.a) {
                try {
                    if (q1.a.b == null) {
                        q1.a aVar = new q1.a();
                        try {
                            q1.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.b);
    }

    public i(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 12;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    public i(a21 a21Var) {
        this.a = 13;
        this.c = a21Var;
    }

    public i(PhotoViewer photoViewer) {
        this.a = 11;
        this.c = photoViewer;
        this.b = new ka(photoViewer.X, photoViewer.a0, 0, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e0(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p0(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
