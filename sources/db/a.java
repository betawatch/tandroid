package db;

import a3.b;
import af.g;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import b6.l;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.play_billing.x3;
import e2.d;
import e3.c;
import j$.util.DesugarCollections;
import j3.n0;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executors;
import jh.f;
import k3.k;
import kh.a2;
import o3.c0;
import o3.h;
import o3.i;
import o3.n;
import o3.o;
import o3.s;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.vu0;
import org.xml.sax.Attributes;
import r3.j;
import r3.m;
import r3.v;
import v2.e;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class a implements l, b, d, g9.a, o, oe.b, of.a, k1, e, pf.a, q4.l, m, ra.m, ji, c9.e {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static lf.m y3(Editable editable, int i10) {
        lf.m[] mVarArr = (lf.m[]) editable.getSpans(0, editable.length(), lf.m.class);
        if (mVarArr.length == 0) {
            return null;
        }
        for (int length = mVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(mVarArr[i11]) == 17) {
                lf.m mVar = mVarArr[i11];
                if (mVar.a == i10) {
                    return mVar;
                }
            }
        }
        return null;
    }

    public static boolean z3(boolean z4, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z10 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z4) {
                String a2 = lf.l.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new u5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), u5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i11 = length - 1;
                        if (editable.getSpanFlags(spans[i11]) == 17) {
                            obj = spans[i11];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (u5) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
        if (str.equals("spoiler")) {
            if (z4) {
                editable.setSpan(new lf.m(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object y32 = y3(editable, 0);
            if (y32 != null) {
                int spanStart2 = editable.getSpanStart(y32);
                editable.removeSpan(y32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(y32, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z4) {
                String a10 = lf.l.a("language", attributes);
                if (a10 == null) {
                    a10 = lf.l.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = lf.l.a("lng", attributes);
                }
                editable.setSpan(new lf.m(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object y33 = y3(editable, 1);
            if (y33 != null) {
                int spanStart3 = editable.getSpanStart(y33);
                editable.removeSpan(y33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(y33, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z4) {
                    editable.setSpan(new lf.m(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object y34 = y3(editable, 3);
                if (y34 != null) {
                    int spanStart4 = editable.getSpanStart(y34);
                    editable.removeSpan(y34);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(y34, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z4) {
            String a11 = lf.l.a("class", attributes);
            if (lf.l.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                z10 = true;
            }
            editable.setSpan(new lf.m(z10 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        lf.m[] mVarArr = (lf.m[]) editable.getSpans(0, editable.length(), lf.m.class);
        for (int length2 = mVarArr.length - 1; length2 >= 0; length2--) {
            lf.m mVar = mVarArr[length2];
            if (editable.getSpanFlags(mVar) == 17 && ((i10 = mVar.a) == 2 || i10 == 3)) {
                obj = mVar;
                break;
            }
        }
        if (obj != null) {
            int spanStart5 = editable.getSpanStart(obj);
            editable.removeSpan(obj);
            if (spanStart5 != editable.length()) {
                editable.setSpan(obj, spanStart5, editable.length(), 33);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A2() {
        int i10 = this.a;
    }

    @Override // q4.l
    public long B() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ n9 C2() {
        switch (this.a) {
        }
        return null;
    }

    public boolean C3(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean D1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var, TLObject tLObject, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G1(t1 t1Var, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public void H0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // o3.o
    public i J(o3.l lVar, n0 n0Var) {
        if (n0Var.F == null) {
            return null;
        }
        return new s(new h(new c0(), 6001));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // g9.a
    public void K(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(t1 t1Var, f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // of.a
    public int N1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(t1 t1Var) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.a) {
        }
        g.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle R1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean T1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // of.a
    public void U0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s6 = shortBuffer.get();
            shortBuffer2.put(s6);
            shortBuffer2.put(s6);
        }
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean V() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int W() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(t1 t1Var, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ug.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ vu0 a2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // v2.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // o3.o
    public int b(n0 n0Var) {
        return n0Var.F != null ? 1 : 0;
    }

    @Override // o3.o
    public /* synthetic */ n c(o3.l lVar, n0 n0Var) {
        return n.j;
    }

    @Override // r3.m
    public v c2(int i10, int i11) {
        return new j();
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d1(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // b6.l
    public /* bridge */ /* synthetic */ Object f(q qVar) {
        return null;
    }

    @Override // c9.e
    public Object f0(c5.j jVar) {
        switch (this.a) {
            case 26:
                return new cb.i();
            default:
                synchronized (h7.s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    h7.s.b(new h7.o());
                }
                return new ab.a(0);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(int i10) {
        int i11 = this.a;
    }

    @Override // rc.a
    public Object get() {
        switch (this.a) {
            case 4:
                z9.d dVar = new z9.d(7);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(v2.d.a, new e3.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(v2.d.c, new e3.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(c.b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(v2.d.b, new e3.b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < v2.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new e3.a(dVar, hashMap);
            default:
                return new j6.a(Executors.newSingleThreadExecutor());
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j1(MessageObject messageObject) {
        int i10 = this.a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int k0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, long j10) {
        int i10 = this.a;
    }

    @Override // e2.d
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean n0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // q4.l
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // q4.l
    public long p() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean q0(u5 u5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // ra.m
    public Object s2() {
        switch (this.a) {
            case 22:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // pf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(a2.j(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = (int) Math.ceil((i11 / i10) * remaining);
        int i13 = remaining - ceil;
        float f10 = ceil;
        float f11 = f10 / f10;
        float f12 = i13;
        float f13 = f12 / f12;
        while (ceil > 0 && i13 > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f11 = ceil / f10;
            } else {
                shortBuffer.position(shortBuffer.position() + i12);
                i13--;
                f13 = i13 / f12;
            }
        }
    }

    @Override // e2.d
    public void v(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ji
    public void x(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x1(t1 t1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean y2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // oe.b
    public oe.a z(f7.b bVar) {
        return new ke.j(bVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, float f10, float f11, boolean z4) {
        int i10 = this.a;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void F3() {
    }

    private final /* synthetic */ void G3() {
    }

    private final /* synthetic */ void J3() {
    }

    private final /* synthetic */ void K3() {
    }

    private final /* synthetic */ void N3() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void Q2() {
    }

    private final /* synthetic */ void R2() {
    }

    private final /* synthetic */ void h2() {
    }

    private final /* synthetic */ void j0() {
    }

    private final /* synthetic */ void j2() {
    }

    private final /* synthetic */ void m0() {
    }

    private final /* synthetic */ void w0() {
    }

    private final /* synthetic */ void x0() {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void C() {
    }

    @Override // o3.o
    public /* synthetic */ void a() {
    }

    @Override // r3.m
    public void f1() {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void r() {
    }

    @Override // o3.o
    public /* synthetic */ void release() {
    }

    private final /* synthetic */ void C1(t1 t1Var) {
    }

    private final /* synthetic */ void D0(t1 t1Var) {
    }

    private final /* synthetic */ void D2(t1 t1Var) {
    }

    private final /* synthetic */ void F1(t1 t1Var) {
    }

    private final /* synthetic */ void G0(t1 t1Var) {
    }

    private final /* synthetic */ void G2(t1 t1Var) {
    }

    private final /* synthetic */ void H1(t1 t1Var) {
    }

    private final /* synthetic */ void H2(t1 t1Var) {
    }

    private final /* synthetic */ void H3(int i10) {
    }

    private final /* synthetic */ void I2(t1 t1Var) {
    }

    private final /* synthetic */ void I3(int i10) {
    }

    private final /* synthetic */ void J2(t1 t1Var) {
    }

    private final /* synthetic */ void K2(t1 t1Var) {
    }

    private final /* synthetic */ void L1(t1 t1Var) {
    }

    private final /* synthetic */ void L2(t1 t1Var) {
    }

    private final /* synthetic */ void L3(MessageObject messageObject) {
    }

    private final /* synthetic */ void M0(t1 t1Var) {
    }

    private final /* synthetic */ void M3(MessageObject messageObject) {
    }

    private final /* synthetic */ void N0(t1 t1Var) {
    }

    private final /* synthetic */ void O2(t1 t1Var) {
    }

    private final /* synthetic */ void P2(t1 t1Var) {
    }

    private final /* synthetic */ void Y2(String str) {
    }

    private final /* synthetic */ void Z2(String str) {
    }

    private final /* synthetic */ void b1(t1 t1Var) {
    }

    private final /* synthetic */ void c1(t1 t1Var) {
    }

    private final /* synthetic */ void e1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void e3(t1 t1Var) {
    }

    private final /* synthetic */ void f3(t1 t1Var) {
    }

    private final /* synthetic */ void g1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void h1(t1 t1Var) {
    }

    private final /* synthetic */ void i1(t1 t1Var) {
    }

    private final /* synthetic */ void i3(t1 t1Var) {
    }

    private final /* synthetic */ void j3(t1 t1Var) {
    }

    private final /* synthetic */ void k3(MessageObject messageObject) {
    }

    private final /* synthetic */ void l3(MessageObject messageObject) {
    }

    private final /* synthetic */ void m3(t1 t1Var) {
    }

    private final /* synthetic */ void n1(t1 t1Var) {
    }

    private final /* synthetic */ void n3(t1 t1Var) {
    }

    private final /* synthetic */ void o0(t1 t1Var) {
    }

    private final /* synthetic */ void p1(t1 t1Var) {
    }

    private final /* synthetic */ void q3(t1 t1Var) {
    }

    private final /* synthetic */ void r0(t1 t1Var) {
    }

    private final /* synthetic */ void r3(t1 t1Var) {
    }

    private final void s3(t1 t1Var) {
    }

    private final /* synthetic */ void t0(t1 t1Var) {
    }

    private final /* synthetic */ void t1(t1 t1Var) {
    }

    private final /* synthetic */ void u1(t1 t1Var) {
    }

    private final void u3(t1 t1Var) {
    }

    private final /* synthetic */ void v0(t1 t1Var) {
    }

    private final /* synthetic */ void w3(t1 t1Var) {
    }

    private final /* synthetic */ void x3(t1 t1Var) {
    }

    private final /* synthetic */ void z2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void D(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void G(TLRPC.User user) {
    }

    @Override // r3.m
    public void g2(r3.s sVar) {
    }

    private final /* synthetic */ void A1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void B1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void E2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void F2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void I0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void K0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void W1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void a3(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void b2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void b3(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void c0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void e0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void k1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void m1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void o3(t1 t1Var, f fVar) {
    }

    private final /* synthetic */ void p3(t1 t1Var, f fVar) {
    }

    private final /* synthetic */ void q1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void s1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void t3(t1 t1Var, boolean z4) {
    }

    private final /* synthetic */ void v3(t1 t1Var, boolean z4) {
    }

    private final /* synthetic */ void y1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void z1(int i10, t1 t1Var) {
    }

    @Override // o3.o
    public void h(Looper looper, k kVar) {
    }

    private final /* synthetic */ void M2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void N2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void S2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void T2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void V0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void X0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void Y(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void b0(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void g3(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void h3(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void l2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void m2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void v1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void w1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void Q1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void U1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void U2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void V2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void W2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void X2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void n2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void o2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void c3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void d3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void u2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void w2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void x2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void Q0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void S0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void E3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override // org.telegram.ui.Components.ji
    public void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
