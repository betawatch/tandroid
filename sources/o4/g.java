package o4;

import a4.w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.u;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.q5;
import i7.c7;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o5.d0;
import o5.e0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.o6;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y5;
import org.telegram.ui.lu0;
import s5.x;
import th.b2;
import th.c1;
import th.d1;
import th.g0;
import th.i2;
import th.k3;
import th.p3;
import th.v2;
import th.w0;
import th.w4;
import th.y4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g implements r0, s, j1, lg.g, wd.a, androidx.activity.result.b, OnSuccessListener, pa.m, g0, c1, v0.i {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // th.g0
    public void B(CharSequence charSequence) {
        k3 k3Var = ((w0) this.b).O;
        if (k3Var != null) {
            k3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            k3Var.a.t4(charSequence.toString());
        }
    }

    @Override // th.g0
    public j9 D() {
        return (w0) this.b;
    }

    @Override // th.g0
    public th.a G() {
        return ((w0) this.b).a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // th.g0
    public boolean M() {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var == null) {
            return false;
        }
        th.a aVar = w0Var.a;
        return k3Var.a.S4();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
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
    public void P0(int i10, s1 s1Var) {
        ca caVar = (ca) this.b;
        org.telegram.ui.Cells.g gVar = caVar.v;
        if (caVar.a()) {
            caVar.s = 2;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle P1(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ca caVar = (ca) this.b;
        org.telegram.ui.Cells.g gVar = caVar.v;
        if (caVar.a()) {
            caVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
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
        th.a aVar;
        y4 y4Var = (y4) this.b;
        w4 w4Var = y4Var.s;
        if (w4Var == null || (aVar = y4Var.a) == null) {
            return;
        }
        p3 p3Var = ((v2) w4Var).a;
        ArrayList arrayList = p3Var.h3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((th.a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        th.a aVar2 = new th.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            w.t(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        p3Var.s4();
        p3Var.U2.N(false);
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        p3Var.post(new i2(p3Var, aVar2, 26));
    }

    @Override // th.c1
    public void T0(d1 d1Var, int i10, int i11) {
        w4 w4Var;
        k9 textSelectionHelper;
        y4 y4Var = (y4) this.b;
        if (y4Var.w || i10 == i11 || (w4Var = y4Var.s) == null || (textSelectionHelper = ((v2) w4Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new o6(this, d1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int V() {
        return 0;
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

    @Override // com.google.android.exoplayer2.upstream.r0
    public void a() {
        h hVar = (h) this.b;
        hVar.A.a();
        z4 z4Var = hVar.C;
        if (z4Var != null) {
            throw z4Var;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(long j10) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        x xVar = (x) obj;
        s5.f fVar = (s5.f) xVar.u();
        d0 d0Var = ((e0) this.b).k;
        Parcel M0 = fVar.M0();
        u.d(M0, d0Var);
        fVar.R0(M0, 18);
        s5.f fVar2 = (s5.f) xVar.u();
        fVar2.R0(fVar2.M0(), 17);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    public void b(HashMap hashMap) {
        if (((SparseArray) this.b) == null) {
            this.b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
        ca caVar = (ca) this.b;
        org.telegram.ui.Cells.g gVar = caVar.v;
        if (caVar.a()) {
            caVar.s = 0;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean c() {
        return ((ca) this.b).a();
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean c1(int i10, s1 s1Var) {
        return i10 == ((ca) this.b).s;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // lg.g
    public void d(Canvas canvas) {
        switch (this.a) {
            case 3:
                ni niVar = (ni) this.b;
                canvas.drawColor(niVar.getThemedColor(g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    niVar.y2.b(canvas, -2);
                    break;
                }
                break;
            default:
                dq0 dq0Var = (dq0) this.b;
                canvas.drawColor(dq0Var.getThemedColor(g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    dq0Var.K0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // th.g0
    public void e(d1 d1Var) {
        switch (this.a) {
            case 16:
                k3 k3Var = ((w0) this.b).O;
                if (k3Var != null) {
                    p3 p3Var = k3Var.a;
                    p3.M1(p3Var, d1Var);
                    p3Var.d3.U(d1Var, true);
                    break;
                }
                break;
            default:
                w4 w4Var = ((y4) this.b).s;
                if (w4Var != null) {
                    p3 p3Var2 = ((v2) w4Var).a;
                    p3.M1(p3Var2, d1Var);
                    p3Var2.d3.U(d1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int f0(s1 s1Var) {
        return 0;
    }

    @Override // wd.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        return null;
    }

    @Override // wd.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public int h(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        pb.a aVar = (pb.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i13 = 1;
            while (i13 < length && iArr[i13] == 0) {
                i13++;
            }
            if (i13 == length) {
                iArr2 = new int[]{0};
            } else {
                int i14 = length - i13;
                int[] iArr4 = new int[i14];
                System.arraycopy(iArr, i13, iArr4, 0, i14);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z10 = true;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = aVar.a[aVar.g + i15];
            if (i16 == 0) {
                i12 = iArr2[iArr2.length - 1];
            } else {
                if (i16 == 1) {
                    i11 = 0;
                    for (int i17 : iArr2) {
                        pb.a aVar2 = pb.a.h;
                        i11 ^= i17;
                    }
                } else {
                    i11 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i18 = 1; i18 < length2; i18++) {
                        i11 = aVar.c(i16, i11) ^ iArr2[i18];
                    }
                }
                i12 = i11;
            }
            iArr5[(i10 - 1) - i15] = i12;
            if (i12 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        pb.b bVar = new pb.b(aVar, iArr5);
        pb.b a2 = aVar.a(i10, 1);
        pb.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        pb.b bVar3 = aVar.d;
        pb.b bVar4 = a2;
        pb.b bVar5 = bVar;
        pb.b bVar6 = bVar4;
        pb.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new pb.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            pb.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c3 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c3));
                bVar5 = bVar5.a(bVar6.h(d, c3));
            }
            pb.b a10 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            pb.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a10;
        }
        int c6 = bVar3.c(0);
        if (c6 == 0) {
            throw new pb.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c6);
        pb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        pb.b bVar10 = bVarArr[0];
        pb.b bVar11 = bVarArr[1];
        int d10 = bVar10.d();
        if (d10 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d10];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.e && i19 < d10; i20++) {
                if (bVar10.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != d10) {
                throw new pb.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int b12 = aVar.b(iArr3[i21]);
            int i22 = 1;
            for (int i23 = 0; i23 < length3; i23++) {
                if (i21 != i23) {
                    int c10 = aVar.c(iArr3[i23], b12);
                    i22 = aVar.c(i22, (c10 & 1) == 0 ? c10 | 1 : c10 & (-2));
                }
            }
            int c11 = aVar.c(bVar11.b(b12), aVar.b(i22));
            iArr7[i21] = c11;
            if (aVar.g != 0) {
                iArr7[i21] = aVar.c(c11, b12);
            }
        }
        for (int i24 = 0; i24 < iArr3.length; i24++) {
            int length4 = iArr.length - 1;
            int i25 = iArr3[i24];
            if (i25 == 0) {
                throw new IllegalArgumentException();
            }
            int i26 = length4 - aVar.b[i25];
            if (i26 < 0) {
                throw new pb.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    @Override // th.g0
    public void h0(int i10, int i11) {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            th.a aVar = w0Var.a;
            b2 b2Var = k3Var.a.F3;
            if (b2Var != null) {
                b2Var.f(i10, i11);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // th.g0
    public void i() {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            p3.P1(k3Var.a, w0Var.a);
        }
    }

    @Override // th.g0
    public void i0() {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            th.a aVar = w0Var.a;
            p3 p3Var = k3Var.a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.d3.onContentChanged();
        }
    }

    @Override // th.c1
    public /* synthetic */ boolean i1(d1 d1Var) {
        return false;
    }

    @Override // wd.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f9, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean j0() {
        return c();
    }

    @Override // androidx.activity.result.b
    public void l(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // th.g0
    public void l0() {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            th.a aVar = w0Var.a;
            p3.O1(k3Var.a);
        }
    }

    @Override // th.c1
    public /* synthetic */ boolean m() {
        return false;
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
        ((y4) this.b).h();
    }

    @Override // wd.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // wd.a
    public boolean needClickAt(View view, float f9, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        x51 x51Var = (x51) this.b;
        float f11 = -dp;
        x51Var.g.inset(f11, f11);
        boolean contains = x51Var.g.contains(f9, f10);
        float f12 = dp;
        x51Var.g.inset(f12, f12);
        return contains;
    }

    @Override // wd.a
    public /* synthetic */ boolean needLongPress(float f9, float f10) {
        return false;
    }

    @Override // wd.a
    public void onClickAt(View view, float f9, float f10) {
        Runnable runnable = ((x51) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // wd.a
    public void onClickTouchDown(View view, float f9, float f10) {
        ((x51) this.b).h.c(true);
    }

    @Override // wd.a
    public void onClickTouchUp(View view, float f9, float f10) {
        ((x51) this.b).h.c(false);
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e10 = (w0.d) obj;
        kotlin.jvm.internal.j.e(e10, "e");
        jd.m mVar = (jd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(c7.a(e10));
        }
    }

    @Override // wd.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f9, float f10) {
        return false;
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        jd.m mVar = (jd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((p5.a) this.b).getClass();
        q5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // pa.m
    public Object p2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new na.j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new na.j("Invalid EnumSet type: " + type.toString());
    }

    @Override // lg.g
    public void q(g.x xVar) {
        switch (this.a) {
            case 3:
                xVar.a(((ni) this.b).getThemedColor(g6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                xVar.a(((dq0) this.b).getThemedColor(g6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean r(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        h20 h20Var;
        boolean z11;
        g20 g20Var = (g20) this.b;
        int i10 = g20.w;
        h20 h20Var2 = g20Var.f;
        a4.d dVar = g20Var.e;
        int action = motionEvent.getAction();
        if (g20Var.v == null) {
            g20Var.v = VelocityTracker.obtain();
        }
        g20Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z12 = i11 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f9 = motionEvent.getX(i12) + f9;
                f10 = motionEvent.getY(i12) + f10;
            }
        }
        float f11 = z12 ? pointerCount - 1 : pointerCount;
        float f12 = f9 / f11;
        float f13 = f10 / f11;
        if (i11 == 0) {
            if (g20Var.g != null && h20Var2.a()) {
                boolean hasMessages = dVar.hasMessages(3);
                if (hasMessages) {
                    dVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = g20Var.m;
                if (motionEvent4 != null && (motionEvent3 = g20Var.n) != null && hasMessages && g20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x4 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y8 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y8 * y8) + (x4 * x4) < g20Var.b) {
                        g20Var.o = true;
                        z10 = g20Var.g.onDoubleTap(g20Var.m) | g20Var.g.onDoubleTapEvent(motionEvent);
                        g20Var.p = f12;
                        g20Var.r = f12;
                        g20Var.q = f13;
                        g20Var.s = f13;
                        motionEvent2 = g20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        g20Var.m = MotionEvent.obtain(motionEvent);
                        g20Var.k = true;
                        g20Var.l = true;
                        g20Var.h = true;
                        g20Var.j = false;
                        g20Var.i = false;
                        if (g20Var.t) {
                            dVar.removeMessages(2);
                            dVar.sendEmptyMessageAtTime(2, g20Var.m.getDownTime() + i10 + g20Var.u);
                        }
                        dVar.sendEmptyMessageAtTime(1, g20Var.m.getDownTime() + i10);
                        return h20Var2.onDown(motionEvent) | z10;
                    }
                }
                dVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            g20Var.p = f12;
            g20Var.r = f12;
            g20Var.q = f13;
            g20Var.s = f13;
            motionEvent2 = g20Var.m;
            if (motionEvent2 != null) {
            }
            g20Var.m = MotionEvent.obtain(motionEvent);
            g20Var.k = true;
            g20Var.l = true;
            g20Var.h = true;
            g20Var.j = false;
            g20Var.i = false;
            if (g20Var.t) {
            }
            dVar.sendEmptyMessageAtTime(1, g20Var.m.getDownTime() + i10);
            return h20Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            g20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (g20Var.o) {
                onFling = g20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (g20Var.j) {
                    dVar.removeMessages(3);
                    g20Var.j = false;
                } else if (g20Var.k) {
                    boolean onSingleTapUp = h20Var2.onSingleTapUp(motionEvent);
                    if (g20Var.i && (h20Var = g20Var.g) != null) {
                        h20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = g20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, g20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > g20Var.c || Math.abs(xVelocity) > g20Var.c) {
                        onFling = h20Var2.onFling(g20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = g20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            g20Var.n = obtain;
            VelocityTracker velocityTracker2 = g20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                g20Var.v = null;
            }
            g20Var.o = false;
            g20Var.i = false;
            dVar.removeMessages(1);
            dVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                g20Var.v.recycle();
                g20Var.v = null;
                g20Var.o = false;
                g20Var.h = false;
                g20Var.k = false;
                g20Var.l = false;
                g20Var.i = false;
                if (g20Var.j) {
                    g20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                g20Var.p = f12;
                g20Var.r = f12;
                g20Var.q = f13;
                g20Var.s = f13;
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                g20Var.o = false;
                g20Var.k = false;
                g20Var.l = false;
                g20Var.i = false;
                if (g20Var.j) {
                    g20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                g20Var.p = f12;
                g20Var.r = f12;
                g20Var.q = f13;
                g20Var.s = f13;
                g20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, g20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = g20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = g20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((g20Var.v.getYVelocity(pointerId3) * yVelocity2) + (g20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            g20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!g20Var.j) {
            float f14 = g20Var.p - f12;
            float f15 = g20Var.q - f13;
            if (g20Var.o) {
                return g20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (g20Var.k) {
                int i14 = (int) (f12 - g20Var.r);
                int i15 = (int) (f13 - g20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > g20Var.a) {
                    z11 = h20Var2.onScroll(g20Var.m, motionEvent, f14, f15);
                    g20Var.p = f12;
                    g20Var.q = f13;
                    g20Var.k = false;
                    dVar.removeMessages(3);
                    dVar.removeMessages(1);
                    dVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > g20Var.a) {
                    g20Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = h20Var2.onScroll(g20Var.m, motionEvent, f14, f15);
                g20Var.p = f12;
                g20Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    @Override // th.c1
    public /* synthetic */ boolean r0(d1 d1Var) {
        return false;
    }

    @Override // th.c1
    public /* synthetic */ boolean t1(boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean u2(int i10) {
        return false;
    }

    public void v() {
        q5.h hVar = (q5.h) this.b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.i.iterator();
        while (it2.hasNext()) {
            ((q5.g) it2.next()).a();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // th.g0
    public k9 x() {
        k3 k3Var = ((w0) this.b).O;
        if (k3Var == null) {
            return null;
        }
        return k3Var.a.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String y(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ l9 y2() {
        return null;
    }

    public g(JSONArray jSONArray) {
        this.a = 7;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new p2.j(optJSONObject));
                }
            }
        }
        this.b = arrayList;
    }

    public g(int i10) {
        this.a = i10;
        switch (i10) {
            case 15:
                break;
            default:
                this.b = new q4.d(5, 1.0f, false);
                break;
        }
    }

    public g(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 14;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public g(Context context, h20 h20Var) {
        this.a = 4;
        this.b = new g20(context, h20Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k1() {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z0() {
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

    @Override // org.telegram.ui.Cells.j1
    public void D0(s1 s1Var) {
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

    @Override // th.c1
    public /* synthetic */ void Z0(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(s1 s1Var) {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F1(s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
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

    @Override // th.c1
    public /* synthetic */ void z(int i10, int i11) {
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

    @Override // wd.a
    public /* synthetic */ void onClickTouchMove(View view, float f9, float f10) {
    }

    @Override // wd.a
    public /* synthetic */ void onLongPressCancelled(View view, float f9, float f10) {
    }

    @Override // wd.a
    public /* synthetic */ void onLongPressFinish(View view, float f9, float f10) {
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
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override // wd.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12) {
    }
}
