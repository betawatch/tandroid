package d7;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import d5.f0;
import j$.util.Objects;
import j3.r0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.t5;
import org.telegram.ui.gn;
import org.telegram.ui.nu0;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u implements Continuation, c9.a, ef.a, i6.d, je.b, jf.a, kf.a, l9.b, s0, na.n, eg, k1, t0, r0.s, y8.d, OnFailureListener {
    public static u b;
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i9) {
        this.a = i9;
    }

    public static ff.n h2(Editable editable, int i9) {
        ff.n[] nVarArr = (ff.n[]) editable.getSpans(0, editable.length(), ff.n.class);
        if (nVarArr.length == 0) {
            return null;
        }
        for (int length = nVarArr.length; length > 0; length--) {
            int i10 = length - 1;
            if (editable.getSpanFlags(nVarArr[i10]) == 17) {
                ff.n nVar = nVarArr[i10];
                if (nVar.a == i9) {
                    return nVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i2(q1.b bVar, Editable editable, int i9, int i10, boolean z10) {
        int min;
        if (editable != null && i9 >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int max = Math.max(i9, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z11) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z11 = true;
                                    }
                                } else if (!z11) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i10, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z12 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i9, 0);
                    min = Math.min(selectionEnd + i10, editable.length());
                }
                androidx.emoji2.text.u[] uVarArr = (androidx.emoji2.text.u[]) editable.getSpans(selectionStart, min, androidx.emoji2.text.u.class);
                if (uVarArr != null && uVarArr.length > 0) {
                    for (androidx.emoji2.text.u uVar : uVarArr) {
                        int spanStart = editable.getSpanStart(uVar);
                        int spanEnd = editable.getSpanEnd(uVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j2(boolean z10, String str, Editable editable, Attributes attributes) {
        int i9;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = ff.m.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new t5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), t5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i10 = length - 1;
                        if (editable.getSpanFlags(spans[i10]) == 17) {
                            obj = spans[i10];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (t5) obj;
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
            if (z10) {
                editable.setSpan(new ff.n(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object h22 = h2(editable, 0);
            if (h22 != null) {
                int spanStart2 = editable.getSpanStart(h22);
                editable.removeSpan(h22);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(h22, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a3 = ff.m.a("language", attributes);
                if (a3 == null) {
                    a3 = ff.m.a("lang", attributes);
                }
                if (a3 == null) {
                    a3 = ff.m.a("lng", attributes);
                }
                editable.setSpan(new ff.n(a3), editable.length(), editable.length(), 17);
                return true;
            }
            Object h23 = h2(editable, 1);
            if (h23 != null) {
                int spanStart3 = editable.getSpanStart(h23);
                editable.removeSpan(h23);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(h23, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new ff.n(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object h24 = h2(editable, 3);
                if (h24 != null) {
                    int spanStart4 = editable.getSpanStart(h24);
                    editable.removeSpan(h24);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(h24, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a10 = ff.m.a("class", attributes);
            if (ff.m.a("data-collapsed", attributes) != null || (a10 != null && a10.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new ff.n(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        ff.n[] nVarArr = (ff.n[]) editable.getSpans(0, editable.length(), ff.n.class);
        for (int length2 = nVarArr.length - 1; length2 >= 0; length2--) {
            ff.n nVar = nVarArr[length2];
            if (editable.getSpanFlags(nVar) == 17 && ((i9 = nVar.a) == 2 || i9 == 3)) {
                obj = nVar;
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

    public static final CharSequence m2(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers A() {
        return null;
    }

    @Override // jf.a
    public int B1(int i9, int i10, int i11) {
        return i9 * 2;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String C(long j10) {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.s0
    public Object D(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        return Long.valueOf(f0.K(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.k1
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle E1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // jf.a
    public void H0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < min; i11++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        return new ya.d(bVar.e(ya.h.class));
    }

    @Override // i6.d
    public a8.b K(Context context, String str, i6.c cVar) {
        a8.b bVar = new a8.b();
        bVar.a = cVar.H(context, str);
        int i9 = 1;
        int k10 = cVar.k(context, str, true);
        bVar.b = k10;
        int i10 = bVar.a;
        if (i10 == 0) {
            i10 = 0;
            if (k10 == 0) {
                i9 = 0;
                bVar.c = i9;
                return bVar;
            }
        }
        if (k10 < i10) {
            i9 = -1;
        }
        bVar.c = i9;
        return bVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ int N0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ nu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ gn T() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean T0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // c9.a
    public void V1(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(int i9, t1 t1Var) {
        return false;
    }

    @Override // na.n
    public Object Y1() {
        return new ConcurrentSkipListMap();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(MessageObject messageObject) {
        return ll.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean Z1(w0 w0Var, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // je.b
    public je.a a1(we.b bVar) {
        return new fe.j(bVar);
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // ef.a
    public boolean d(Context context) {
        return e0.b.j(context);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pg.a d0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean f1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // kf.a
    public void g0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i9 > i10) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(r0.l(i11, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i11;
        int ceil = ((int) Math.ceil((i10 / i9) * remaining)) - remaining;
        float f10 = remaining;
        float f11 = f10 / f10;
        float f12 = ceil;
        float f13 = f12 / f12;
        while (remaining > 0 && ceil > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f11 = remaining / f10;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                }
                ceil--;
                f13 = ceil / f12;
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public /* synthetic */ boolean h() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String i(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ int j() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TLRPC.Peer k() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int l0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean n0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n2(int i9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean o0() {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ o9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r0(t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // l9.b
    public l9.a t(ya.b bVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        com.google.android.gms.internal.cast.a aVar = jSONObject.has("session") ? new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new l9.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), aVar, new ib.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    @Override // ef.a
    public boolean v0(Context context) {
        return e0.b.m(context);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ o2 y0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void G() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void J1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void Q() {
    }

    @Override // org.telegram.ui.Components.eg
    public void Q1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void X1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void c() {
    }

    @Override // org.telegram.ui.Components.eg
    public void c1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void c2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void d2() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.eg
    public void h0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void h1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void j1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.eg
    public void n() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.eg
    public void u() {
    }

    @Override // org.telegram.ui.Components.eg
    public void u1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void x0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void C0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void F0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void H(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void I(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void K1(int i9) {
    }

    @Override // org.telegram.ui.Components.eg
    public void L0(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void O(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void T1(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void c0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void m1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void o(float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void o1(long j10) {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void p1(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void B(float f10, int i9) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void E(w0 w0Var, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void N1(w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(int i9, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(int i9, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Components.eg
    public void p0(int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, eh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void L(w0 w0Var, int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void V0(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Components.eg
    public void b1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.eg
    public void k1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void v1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // r0.s
    public void onScrollLimit(int i9, int i10, int i11, boolean z10) {
    }

    @Override // r0.s
    public void onScrollProgress(int i9, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void a2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.eg
    public void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
    }

    @Override // org.telegram.ui.Components.eg
    public void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
