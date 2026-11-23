package nb;

import a8.r7;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b3.r;
import b7.e;
import c4.k;
import c4.m;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import d3.i0;
import e2.u;
import e2.x1;
import f3.y;
import h2.l0;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lf.b;
import org.telegram.messenger.a8;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fr0;
import pb.h;
import u4.c;
import u9.d;
import yi.f;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class a implements s0, e, k, i0, eg.a, l5.e, fg.a, ja.a, b, Continuation, d, r, f, gh.a, m1, OnFailureListener, c {
    public static final /* synthetic */ a b = new a(14);
    public static a c;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    public static String P3(ad.c cVar) {
        String str = cVar.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // gh.a
    public /* synthetic */ float A1() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A2(r1 r1Var, int i7, int i10) {
        int i11 = this.a;
    }

    @Override // yi.f
    public void B(String str, Throwable th2) {
        a8.e("AudioRecorderV2 " + str, th2);
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ j9 B2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(r1 r1Var, float f10, float f11, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String D(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // gh.a
    public /* synthetic */ int D0() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    @Override // eg.a
    public void E0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < min; i11++) {
            short s5 = shortBuffer.get();
            shortBuffer2.put(s5);
            shortBuffer2.put(s5);
        }
    }

    public Signature[] E3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean F0(fj fjVar) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(r1 r1Var, boolean z10) {
        int i7 = this.a;
    }

    @Override // c4.k
    public boolean G(u uVar) {
        String str = uVar.s;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void G0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void H0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(r1 r1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // c4.k
    public int I(u uVar) {
        String str = uVar.s;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(p5.c.k("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(r1 r1Var, TLObject tLObject, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J0(r1 r1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // b7.e
    public b7.d K(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        dVar.a = cVar.y(context, str);
        int i7 = 1;
        int l10 = cVar.l(context, str, true);
        dVar.b = l10;
        int i10 = dVar.a;
        if (i10 == 0) {
            i10 = 0;
            if (l10 == 0) {
                i7 = 0;
                dVar.c = i7;
                return dVar;
            }
        }
        if (l10 < i10) {
            i7 = -1;
        }
        dVar.c = i7;
        return dVar;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(r1 r1Var, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(r1 r1Var, p2 p2Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void M(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public void M0(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.a;
    }

    @Override // eg.a
    public int M1(int i7, int i10, int i11) {
        return i7 * 2;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O(cj cjVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(fj fjVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.a;
    }

    @Override // gh.a
    public int Q0() {
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.m1
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean R0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(r1 r1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.a;
    }

    @Override // gh.a
    public /* synthetic */ float T0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(r1 r1Var, fj fjVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
        int i7 = this.a;
    }

    @Override // gh.a
    public /* synthetic */ float V0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W(fj fjVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // gh.a
    public int X1() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Y() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z(r1 r1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.a;
    }

    @Override // lf.b
    public lf.a a(wf.b bVar) {
        return new gf.k(bVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // l5.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean b0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void b2(r1 r1Var, h10 h10Var) {
        int i7 = this.a;
    }

    @Override // u9.d
    public Object c(r7 r7Var) {
        return new pb.d(r7Var.c(h.class));
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean c1(r1 r1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ fr0 c2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void d0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int e0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e1(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
        int i7 = this.a;
    }

    @Override // c4.k
    public m f(u uVar) {
        String str = uVar.s;
        List list = uVar.v;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new e4.h(list);
                case "application/pgs":
                    return new xi.e(2);
                case "application/x-mp4-vtt":
                    return new y(1);
                case "text/vtt":
                    return new j6.k(3);
                case "application/x-quicktime-tx3g":
                    return new j4.a(list);
                case "text/x-ssa":
                    return new g4.a(list);
                case "application/vobsub":
                    return new k4.b(list);
                case "application/x-subrip":
                    return new h4.a();
                case "application/ttml+xml":
                    return new i4.d();
            }
        }
        throw new IllegalArgumentException(p5.c.k("Unsupported MIME type: ", str));
    }

    @Override // fg.a
    public void f0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 != i10) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void f1(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f2(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // b3.r
    public Object g(Uri uri, j2.k kVar) {
        return Long.valueOf(l0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean g1(fj fjVar) {
        int i7 = this.a;
        return c0.a(fjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // ja.a
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        int i7;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i10 - intValue;
                if (i10 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i10 + i14])) {
                        }
                    }
                    int intValue2 = i10 - num.intValue();
                    if (i12 < 10) {
                        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue2);
                        i11 += intValue2;
                        i12++;
                    }
                    i7 = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i7 + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i12 = 1;
            i7 = i10;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i7 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        return i11 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a h0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean i() {
        switch (this.a) {
        }
        return true;
    }

    @Override // gh.a
    public int i0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j0(r1 r1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String k(r1 r1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean k0(r1 r1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k2(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(r1 r1Var, long j3) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m0(int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean n0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 o(Class cls) {
        return new m0(true);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(r1 r1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int p0(r1 r1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p1(r1 r1Var, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean r0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t0(String str) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(r1 r1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    @Override // yi.f
    public void u0(String str) {
        if (s2.a) {
            a8.b("AudioRecorderV2 " + str);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u2() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v0(x5 x5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x0(r1 r1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // gh.a
    public int x2() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y2(int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 z(Class cls, y1.b bVar) {
        return o(cls);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean z1(r1 r1Var, int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z2() {
        int i7 = this.a;
    }

    private final /* synthetic */ void F3() {
    }

    private final /* synthetic */ void G3() {
    }

    private final /* synthetic */ void H() {
    }

    private final /* synthetic */ void J3() {
    }

    private final /* synthetic */ void K3() {
    }

    private final /* synthetic */ void N3() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void S3() {
    }

    private final /* synthetic */ void T3() {
    }

    private final /* synthetic */ void U() {
    }

    private final /* synthetic */ void U2() {
    }

    private final /* synthetic */ void V() {
    }

    private final /* synthetic */ void V2() {
    }

    private final /* synthetic */ void i2() {
    }

    private final /* synthetic */ void m2() {
    }

    private final /* synthetic */ void y() {
    }

    @Override // d3.i0
    public /* synthetic */ void n() {
    }

    @Override // d3.i0
    public /* synthetic */ void onFirstFrameRendered() {
    }

    @Override // u4.c
    public void u() {
    }

    @Override // d3.i0
    public /* synthetic */ void v() {
    }

    private final /* synthetic */ void A3(r1 r1Var) {
    }

    private final /* synthetic */ void C3(r1 r1Var) {
    }

    private final /* synthetic */ void E1(r1 r1Var) {
    }

    private final /* synthetic */ void E2(r1 r1Var) {
    }

    private final /* synthetic */ void F2(r1 r1Var) {
    }

    private final /* synthetic */ void G1(r1 r1Var) {
    }

    private final /* synthetic */ void K2(r1 r1Var) {
    }

    private final /* synthetic */ void L2(r1 r1Var) {
    }

    private final /* synthetic */ void L3(int i7) {
    }

    private final /* synthetic */ void M2(r1 r1Var) {
    }

    private final /* synthetic */ void M3(int i7) {
    }

    private final /* synthetic */ void N(r1 r1Var) {
    }

    private final /* synthetic */ void N1(r1 r1Var) {
    }

    private final /* synthetic */ void N2(r1 r1Var) {
    }

    private final /* synthetic */ void O2(r1 r1Var) {
    }

    private final /* synthetic */ void P0(r1 r1Var) {
    }

    private final /* synthetic */ void P1(r1 r1Var) {
    }

    private final /* synthetic */ void P2(r1 r1Var) {
    }

    private final /* synthetic */ void Q(r1 r1Var) {
    }

    private final /* synthetic */ void Q3(fj fjVar) {
    }

    private final /* synthetic */ void R3(fj fjVar) {
    }

    private final /* synthetic */ void S(r1 r1Var) {
    }

    private final /* synthetic */ void S2(r1 r1Var) {
    }

    private final /* synthetic */ void T(r1 r1Var) {
    }

    private final /* synthetic */ void T2(r1 r1Var) {
    }

    private final /* synthetic */ void U0(r1 r1Var) {
    }

    private final /* synthetic */ void X0(cj cjVar) {
    }

    private final /* synthetic */ void Y0(cj cjVar) {
    }

    private final /* synthetic */ void Z0(r1 r1Var) {
    }

    private final /* synthetic */ void a0(r1 r1Var) {
    }

    private final /* synthetic */ void b1(r1 r1Var) {
    }

    private final /* synthetic */ void c3(String str) {
    }

    private final /* synthetic */ void d3(String str) {
    }

    private final /* synthetic */ void g0(r1 r1Var) {
    }

    private final /* synthetic */ void i1(r1 r1Var) {
    }

    private final /* synthetic */ void i3(r1 r1Var) {
    }

    private final /* synthetic */ void j1(r1 r1Var) {
    }

    private final /* synthetic */ void j3(r1 r1Var) {
    }

    private final /* synthetic */ void m3(r1 r1Var) {
    }

    private final /* synthetic */ void n3(r1 r1Var) {
    }

    private final /* synthetic */ void o1(r1 r1Var) {
    }

    private final /* synthetic */ void o3(fj fjVar) {
    }

    private final /* synthetic */ void p3(fj fjVar) {
    }

    private final /* synthetic */ void q1(r1 r1Var) {
    }

    private final /* synthetic */ void q3(r1 r1Var) {
    }

    private final /* synthetic */ void r3(r1 r1Var) {
    }

    private final /* synthetic */ void u3(r1 r1Var) {
    }

    private final /* synthetic */ void v3(r1 r1Var) {
    }

    private final /* synthetic */ void w0(r1 r1Var) {
    }

    private final /* synthetic */ void y0(r1 r1Var) {
    }

    @Override // d3.i0
    public /* synthetic */ void b(x1 x1Var) {
    }

    private final /* synthetic */ void G2(String str, String str2) {
    }

    private final /* synthetic */ void H2(String str, String str2) {
    }

    private final /* synthetic */ void d1(r1 r1Var, p2 p2Var) {
    }

    private final /* synthetic */ void d2(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void e3(r1 r1Var, long j3) {
    }

    private final /* synthetic */ void f3(r1 r1Var, long j3) {
    }

    private final /* synthetic */ void h1(r1 r1Var, p2 p2Var) {
    }

    private final /* synthetic */ void h2(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void l0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void l1(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void n1(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void r(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void s0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void s3(r1 r1Var, h10 h10Var) {
    }

    private final /* synthetic */ void t3(r1 r1Var, h10 h10Var) {
    }

    private final /* synthetic */ void u1(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void v1(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void w(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void w1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void w3(r1 r1Var, boolean z10) {
    }

    private final /* synthetic */ void y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void y3(r1 r1Var, boolean z10) {
    }

    @Override // u4.c
    public void E(int i7, Object obj) {
    }

    private final void B3(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void D3(r1 r1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void I2(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void J2(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void K0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void O0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void Q2(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void R2(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void W2(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void X2(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void j(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void k3(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void l(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void l3(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void n2(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void o2(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void r1(r1 r1Var, int i7, int i10) {
    }

    private final /* synthetic */ void s1(r1 r1Var, int i7, int i10) {
    }

    private final void x3(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void z3(r1 r1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void V1(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void W1(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void Y2(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void Z2(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void a3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void b3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void r2(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final /* synthetic */ void s2(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final /* synthetic */ void C2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void D2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void g3(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void h3(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void t2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void v2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void B0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void z0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void H3(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final /* synthetic */ void I3(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
