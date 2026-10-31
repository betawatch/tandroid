package oa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import b2.p0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e9.n0;
import j9.v;
import j9.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import ki.h;
import l5.p;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.f8;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.s2;
import org.telegram.messenger.v2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.o5;
import org.telegram.ui.h31;
import org.telegram.ui.qs0;
import org.xml.sax.Attributes;
import r2.k;
import r2.l;
import r2.o;
import r2.x;
import rf.i;
import rf.j;
import t7.u;
import v7.p8;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d implements androidx.car.app.messaging.model.b, ai, ea.e, r9.d, n5.b, h, l1, k, h31, u5.a, uf.a, vf.a, we.b, SuccessContinuation, y6.d {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    public static j B4(Editable editable, int i10) {
        j[] jVarArr = (j[]) editable.getSpans(0, editable.length(), j.class);
        if (jVarArr.length == 0) {
            return null;
        }
        for (int length = jVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(jVarArr[i11]) == 17) {
                j jVar = jVarArr[i11];
                if (jVar.a == i10) {
                    return jVar;
                }
            }
        }
        return null;
    }

    public static boolean C4(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = i.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new o5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), o5.class);
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
                Object obj2 = (o5) obj;
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
                editable.setSpan(new j(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object B4 = B4(editable, 0);
            if (B4 != null) {
                int spanStart2 = editable.getSpanStart(B4);
                editable.removeSpan(B4);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(B4, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a10 = i.a("language", attributes);
                if (a10 == null) {
                    a10 = i.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = i.a("lng", attributes);
                }
                editable.setSpan(new j(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object B42 = B4(editable, 1);
            if (B42 != null) {
                int spanStart3 = editable.getSpanStart(B42);
                editable.removeSpan(B42);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(B42, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new j(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object B43 = B4(editable, 3);
                if (B43 != null) {
                    int spanStart4 = editable.getSpanStart(B43);
                    editable.removeSpan(B43);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(B43, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a11 = i.a("class", attributes);
            if (i.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new j(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        j[] jVarArr = (j[]) editable.getSpans(0, editable.length(), j.class);
        for (int length2 = jVarArr.length - 1; length2 >= 0; length2--) {
            j jVar = jVarArr[length2];
            if (editable.getSpanFlags(jVar) == 17 && ((i10 = jVar.a) == 2 || i10 == 3)) {
                obj = jVar;
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

    public static y P4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((p0) it.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                v vVar = new v();
                vVar.n(unsupportedOperationException);
                return vVar;
            }
        }
        return p8.b(list);
    }

    public static MediaCodec k(j2.f fVar) {
        String str = ((o) fVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static byte[] o4(n0 n0Var, long j10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(n0Var.size());
        Iterator<E> it = n0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                t6.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(q1 q1Var, jj jjVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ai
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(q1 q1Var, boolean z10, boolean z11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(q1 q1Var, c20 c20Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, s2 s2Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qs0 H1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(gj gjVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(String str, String str2) {
        int i10 = this.a;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        switch (this.a) {
            case 6:
                return new kb.a(0);
            case 7:
                return new jb.b(0);
            default:
                return new jb.k((Context) dVar.b(Context.class));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // vf.a
    public void L(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(q1 q1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O(jj jjVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(jj jjVar) {
        int i10 = this.a;
        return f1.a(jjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(q1 q1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ zg.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(q1 q1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1() {
        int i10 = this.a;
    }

    @Override // we.b
    public we.a a(m5.e eVar) {
        return new se.h(eVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean a1() {
        return false;
    }

    @Override // ki.h
    public void b(String str, Throwable th2) {
        f8.e("AudioRecorderV2 " + str, th2);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1(q1 q1Var, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // r2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l d(j2.f fVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = k(fVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) fVar.d;
            mediaCodec.configure((MediaFormat) fVar.b, surface, (MediaCrypto) fVar.e, (surface == null && ((o) fVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new x(mediaCodec, (r2.j) fVar.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e7) {
            e = e7;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // y6.d
    public a3.l e(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.a = cVar.x1(context, str);
        int i10 = 1;
        int p02 = cVar.p0(context, str, true);
        lVar.b = p02;
        int i11 = lVar.a;
        if (i11 == 0) {
            i11 = 0;
            if (p02 == 0) {
                i10 = 0;
                lVar.c = i10;
                return lVar;
            }
        }
        if (p02 < i11) {
            i10 = -1;
        }
        lVar.c = i10;
        return lVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(q1 q1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int f0(q1 q1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // u5.a
    public long g() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ l9 g2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // zc.a
    public Object get() {
        return new p(Executors.newSingleThreadExecutor());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // ea.e
    public ea.c h1(u uVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        ae.j jVar = jSONObject.has("session") ? new ae.j(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new ae.j(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new ea.c(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), jVar, new ea.b(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean i0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean j1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean k1(q1 q1Var, int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public void l1(q1 q1Var, boolean z10, boolean z11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m0(o5 o5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(q1 q1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(q1 q1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // uf.a
    public int t1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // ki.h
    public void u(String str) {
        if (v2.a) {
            f8.b("AudioRecorderV2 " + str);
        }
    }

    @Override // uf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(jj jjVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(jj jjVar) {
        switch (this.a) {
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        gf.f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle y1(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B0() {
    }

    private final /* synthetic */ void D4() {
    }

    private final /* synthetic */ void E() {
    }

    private final /* synthetic */ void E4() {
    }

    private final /* synthetic */ void F() {
    }

    private final /* synthetic */ void F4() {
    }

    private final /* synthetic */ void I() {
    }

    private final /* synthetic */ void J4() {
    }

    private final /* synthetic */ void K4() {
    }

    private final /* synthetic */ void L2() {
    }

    private final /* synthetic */ void L4() {
    }

    private final /* synthetic */ void M2() {
    }

    private final /* synthetic */ void N2() {
    }

    private final /* synthetic */ void Q4() {
    }

    private final /* synthetic */ void R4() {
    }

    private final /* synthetic */ void S4() {
    }

    private final /* synthetic */ void W4() {
    }

    private final /* synthetic */ void X4() {
    }

    private final /* synthetic */ void Y4() {
    }

    private final /* synthetic */ void q0() {
    }

    private final /* synthetic */ void t0() {
    }

    private final /* synthetic */ void y3() {
    }

    private final /* synthetic */ void z3() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void j0() {
    }

    private final /* synthetic */ void A2(q1 q1Var) {
    }

    private final /* synthetic */ void B2(q1 q1Var) {
    }

    private final /* synthetic */ void C2(q1 q1Var) {
    }

    private final /* synthetic */ void D2(q1 q1Var) {
    }

    private final /* synthetic */ void E0(q1 q1Var) {
    }

    private final /* synthetic */ void E2(q1 q1Var) {
    }

    private final /* synthetic */ void G0(q1 q1Var) {
    }

    private final /* synthetic */ void G1(q1 q1Var) {
    }

    private final /* synthetic */ void I1(q1 q1Var) {
    }

    private final /* synthetic */ void K3(String str) {
    }

    private final /* synthetic */ void L3(String str) {
    }

    private final /* synthetic */ void M1(q1 q1Var) {
    }

    private final /* synthetic */ void M3(String str) {
    }

    private final /* synthetic */ void M4(int i10) {
    }

    private final /* synthetic */ void N4(int i10) {
    }

    private final /* synthetic */ void O1(gj gjVar) {
    }

    private final /* synthetic */ void O4(int i10) {
    }

    private final /* synthetic */ void P0(q1 q1Var) {
    }

    private final /* synthetic */ void Q1(gj gjVar) {
    }

    private final /* synthetic */ void R1(gj gjVar) {
    }

    private final /* synthetic */ void T1(q1 q1Var) {
    }

    private final /* synthetic */ void T3(q1 q1Var) {
    }

    private final /* synthetic */ void T4(jj jjVar) {
    }

    private final /* synthetic */ void U1(q1 q1Var) {
    }

    private final /* synthetic */ void U3(q1 q1Var) {
    }

    private final /* synthetic */ void U4(jj jjVar) {
    }

    private final /* synthetic */ void V(q1 q1Var) {
    }

    private final /* synthetic */ void V0(q1 q1Var) {
    }

    private final /* synthetic */ void V1(q1 q1Var) {
    }

    private final /* synthetic */ void V3(q1 q1Var) {
    }

    private final /* synthetic */ void V4(jj jjVar) {
    }

    private final /* synthetic */ void X(q1 q1Var) {
    }

    private final /* synthetic */ void X0(q1 q1Var) {
    }

    private final /* synthetic */ void Y0(q1 q1Var) {
    }

    private final /* synthetic */ void Z3(q1 q1Var) {
    }

    private final /* synthetic */ void a3(q1 q1Var) {
    }

    private final /* synthetic */ void a4(q1 q1Var) {
    }

    private final /* synthetic */ void b0(q1 q1Var) {
    }

    private final /* synthetic */ void b3(q1 q1Var) {
    }

    private final /* synthetic */ void b4(q1 q1Var) {
    }

    private final /* synthetic */ void c3(q1 q1Var) {
    }

    private final /* synthetic */ void c4(jj jjVar) {
    }

    private final /* synthetic */ void d4(jj jjVar) {
    }

    private final /* synthetic */ void e4(jj jjVar) {
    }

    private final /* synthetic */ void f4(q1 q1Var) {
    }

    private final /* synthetic */ void g4(q1 q1Var) {
    }

    private final /* synthetic */ void h0(q1 q1Var) {
    }

    private final /* synthetic */ void h2(q1 q1Var) {
    }

    private final /* synthetic */ void h4(q1 q1Var) {
    }

    private final /* synthetic */ void i2(q1 q1Var) {
    }

    private final /* synthetic */ void j2(q1 q1Var) {
    }

    private final /* synthetic */ void j3(q1 q1Var) {
    }

    private final /* synthetic */ void k0(q1 q1Var) {
    }

    private final /* synthetic */ void k3(q1 q1Var) {
    }

    private final /* synthetic */ void l3(q1 q1Var) {
    }

    private final /* synthetic */ void l4(q1 q1Var) {
    }

    private final /* synthetic */ void m3(q1 q1Var) {
    }

    private final /* synthetic */ void m4(q1 q1Var) {
    }

    private final /* synthetic */ void n2(q1 q1Var) {
    }

    private final /* synthetic */ void n3(q1 q1Var) {
    }

    private final /* synthetic */ void n4(q1 q1Var) {
    }

    private final /* synthetic */ void o2(q1 q1Var) {
    }

    private final /* synthetic */ void o3(q1 q1Var) {
    }

    private final /* synthetic */ void p0(q1 q1Var) {
    }

    private final /* synthetic */ void p2(q1 q1Var) {
    }

    private final /* synthetic */ void p3(q1 q1Var) {
    }

    private final /* synthetic */ void q3(q1 q1Var) {
    }

    private final /* synthetic */ void r3(q1 q1Var) {
    }

    private final /* synthetic */ void v3(q1 q1Var) {
    }

    private final /* synthetic */ void v4(q1 q1Var) {
    }

    private final /* synthetic */ void w3(q1 q1Var) {
    }

    private final /* synthetic */ void x3(q1 q1Var) {
    }

    private final /* synthetic */ void x4(q1 q1Var) {
    }

    private final /* synthetic */ void z2(q1 q1Var) {
    }

    private final /* synthetic */ void z4(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void v0(TLRPC.User user) {
    }

    private final /* synthetic */ void B(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void I2(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void J2(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void K2(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void N3(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void O3(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void P3(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void Q0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void R0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void Y1(q1 q1Var, s2 s2Var) {
    }

    private final /* synthetic */ void a2(q1 q1Var, s2 s2Var) {
    }

    private final /* synthetic */ void d2(q1 q1Var, s2 s2Var) {
    }

    private final /* synthetic */ void d3(String str, String str2) {
    }

    private final /* synthetic */ void e3(String str, String str2) {
    }

    private final /* synthetic */ void f3(String str, String str2) {
    }

    private final /* synthetic */ void g3(q1 q1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void h3(q1 q1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void i3(q1 q1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void i4(q1 q1Var, c20 c20Var) {
    }

    private final /* synthetic */ void j4(q1 q1Var, c20 c20Var) {
    }

    private final /* synthetic */ void k2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void k4(q1 q1Var, c20 c20Var) {
    }

    private final /* synthetic */ void l2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void m2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void p4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void r4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void t2(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void t4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void u2(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void v2(q1 q1Var, int i10) {
    }

    private final /* synthetic */ void w(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void w2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void x2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void y(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void y2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void A4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void B3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void C3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void D3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void O2(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void P2(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Q2(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void W3(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X3(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Y3(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void i1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void m(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void o1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void p(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void q2(q1 q1Var, int i10, int i11) {
    }

    private final void q4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void r(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void r2(q1 q1Var, int i10, int i11) {
    }

    private final /* synthetic */ void s2(q1 q1Var, int i10, int i11) {
    }

    private final /* synthetic */ void s3(q1 q1Var, float f7, float f10) {
    }

    private final void s4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void t3(q1 q1Var, float f7, float f10) {
    }

    private final /* synthetic */ void u3(q1 q1Var, float f7, float f10) {
    }

    private final void u4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void w4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void x1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void y4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void E3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void F2(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void F3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void G2(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void G3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void H2(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void H3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void I3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void J3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void R2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void S2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void T2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void Q3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void R3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void S3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void U2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void V2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void W2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void X2(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void Y2(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void Z2(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void d1(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void e1(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void g1(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    private final /* synthetic */ void G4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void H4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void I4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ai
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
