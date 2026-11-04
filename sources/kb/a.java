package kb;

import a3.h;
import a3.i;
import ai.n;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.style.CharacterStyle;
import androidx.car.app.messaging.model.b;
import androidx.emoji2.text.o;
import b8.ke;
import b8.yd;
import b8.zb;
import cg.l;
import cg.m;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.components.ComponentRegistrar;
import d2.n0;
import d2.v0;
import e3.b0;
import e3.q;
import e5.u;
import g9.i0;
import i2.k;
import i2.v;
import i2.y;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.a8;
import org.telegram.messenger.g10;
import org.telegram.messenger.o2;
import org.telegram.messenger.r2;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.zh;
import org.telegram.ui.vq0;
import org.xml.sax.Attributes;
import sf.c;
import t9.d;
import t9.e;
import vi.g;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements b, q, fg.a, gg.a, e, ia.a, d, p, zh, g, l1, t4.d, w5.a {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i3) {
        this.a = i3;
    }

    public static i D4(h hVar, u uVar) {
        IOException iOException = (IOException) uVar.c;
        if (!(iOException instanceof y)) {
            return null;
        }
        int i3 = ((y) iOException).c;
        if (i3 != 403 && i3 != 404 && i3 != 410 && i3 != 416 && i3 != 500 && i3 != 503) {
            return null;
        }
        if (hVar.a(1)) {
            return new i(1, 300000L);
        }
        if (hVar.a(2)) {
            return new i(2, 60000L);
        }
        return null;
    }

    public static m E4(Editable editable, int i3) {
        m[] mVarArr = (m[]) editable.getSpans(0, editable.length(), m.class);
        if (mVarArr.length == 0) {
            return null;
        }
        for (int length = mVarArr.length; length > 0; length--) {
            int i10 = length - 1;
            if (editable.getSpanFlags(mVarArr[i10]) == 17) {
                m mVar = mVarArr[i10];
                if (mVar.a == i3) {
                    return mVar;
                }
            }
        }
        return null;
    }

    public static long G4(u uVar) {
        for (Throwable th2 = (IOException) uVar.c; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof v0) || (th2 instanceof FileNotFoundException) || (th2 instanceof v) || (th2 instanceof a3.p)) {
                return -9223372036854775807L;
            }
            if ((th2 instanceof k) && ((k) th2).a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((uVar.b - 1) * 1000, 5000);
    }

    public static boolean H4(boolean z10, String str, Editable editable, Attributes attributes) {
        int i3;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a10 = l.a("data-document-id", attributes);
                if (a10 != null) {
                    editable.setSpan(new p5(Long.parseLong(a10), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), p5.class);
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
                Object obj2 = (p5) obj;
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
                editable.setSpan(new m(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object E4 = E4(editable, 0);
            if (E4 != null) {
                int spanStart2 = editable.getSpanStart(E4);
                editable.removeSpan(E4);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(E4, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a11 = l.a("language", attributes);
                if (a11 == null) {
                    a11 = l.a("lang", attributes);
                }
                if (a11 == null) {
                    a11 = l.a("lng", attributes);
                }
                editable.setSpan(new m(a11), editable.length(), editable.length(), 17);
                return true;
            }
            Object E42 = E4(editable, 1);
            if (E42 != null) {
                int spanStart3 = editable.getSpanStart(E42);
                editable.removeSpan(E42);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(E42, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new m(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object E43 = E4(editable, 3);
                if (E43 != null) {
                    int spanStart4 = editable.getSpanStart(E43);
                    editable.removeSpan(E43);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(E43, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a12 = l.a("class", attributes);
            if (l.a("data-collapsed", attributes) != null || (a12 != null && a12.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new m(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        m[] mVarArr = (m[]) editable.getSpans(0, editable.length(), m.class);
        for (int length2 = mVarArr.length - 1; length2 >= 0; length2--) {
            m mVar = mVarArr[length2];
            if (editable.getSpanFlags(mVar) == 17 && ((i3 = mVar.a) == 2 || i3 == 3)) {
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

    public static l9.y U4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((n0) it.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                l9.v vVar = new l9.v();
                vVar.n(unsupportedOperationException);
                return vVar;
            }
        }
        return yd.b(list);
    }

    public static byte[] q4(i0 i0Var, long j10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            f2.b bVar = (f2.b) it.next();
            Bundle a10 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zb.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a10.putByteArray(f2.b.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a10);
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

    @Override // ia.a
    public StackTraceElement[] A(StackTraceElement[] stackTraceElementArr) {
        int i3;
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
                    i3 = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i3 + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i12 = 1;
            i3 = i10;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i3 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        return i11 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(zi ziVar) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z10, boolean z11) {
        int i3 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        c.t(q1Var.getContext(), str);
    }

    public int F4(int i3) {
        return i3 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle G1(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var, o2 o2Var) {
        int i3 = this.a;
    }

    @Override // fg.a
    public void H0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10) {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i3, shortBuffer2.remaining() / i10);
        for (int i11 = 0; i11 < min; i11++) {
            short s6 = shortBuffer.get();
            short s10 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i10 == 2) {
                shortBuffer2.put(s6);
                shortBuffer2.put(s10);
            } else if (i10 == 1) {
                shortBuffer2.put(ra.e.D4(s6, s10));
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1(q1 q1Var, zi ziVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(wi wiVar) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1() {
        int i3 = this.a;
    }

    @Override // e3.q
    public void L() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean L1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(zi ziVar) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P0(q1 q1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(q1 q1Var, g10 g10Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vq0 S1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(String str, String str2) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean X0(zi ziVar) {
        int i3 = this.a;
        return f1.a(ziVar);
    }

    @Override // org.telegram.ui.Components.zh
    public void Y(ng ngVar) {
        ngVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ kh.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(q1 q1Var, long j10) {
        int i3 = this.a;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        l7.d dVar = (l7.d) ((l7.e) obj).m();
        d7.b bVar = new d7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i3 = l7.c.a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // t9.e
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (t9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new t9.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new n(18, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0(q1 q1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i3 = this.a;
    }

    @Override // vi.g
    public void e(String str, Throwable th2) {
        a8.e("AudioRecorderV2 " + str, th2);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // e3.q
    public void f(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, int i3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(q1 q1Var, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // e3.q
    public e3.i0 i0(int i3, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(q1 q1Var, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int j0(q1 q1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // gg.a
    public void l0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i3 != i10) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // vi.g
    public void m(String str) {
        if (r2.a) {
            a8.b("AudioRecorderV2 " + str);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean m0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m2(int i3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // w5.a
    public long o() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(p5 p5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p2(q1 q1Var, int i3, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
        int i3 = this.a;
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        mb.a aVar = new mb.a();
        o oVar = new o(4);
        ReferenceQueue referenceQueue = aVar.a;
        Set set = aVar.b;
        set.add(new mb.l(aVar, referenceQueue, set, oVar));
        Thread thread = new Thread(new l9.u(18, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ i9 q2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void r1(q1 q1Var, boolean z10, boolean z11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(q1 q1Var, float f10, float f11, boolean z10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var, boolean z10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v() {
        int i3 = this.a;
    }

    @Override // fg.a
    public int v1(int i3, int i10, int i11) {
        return (i3 / i10) * i11;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(zi ziVar) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String z(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(q1 q1Var, int i3) {
        int i10 = this.a;
    }

    public /* synthetic */ a(Object obj, int i3) {
        this.a = i3;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void C3() {
    }

    private final /* synthetic */ void D() {
    }

    private final /* synthetic */ void E() {
    }

    private final /* synthetic */ void F() {
    }

    private final /* synthetic */ void I4() {
    }

    private final /* synthetic */ void J4() {
    }

    private final /* synthetic */ void K4() {
    }

    private final /* synthetic */ void N2() {
    }

    private final /* synthetic */ void O2() {
    }

    private final /* synthetic */ void O4() {
    }

    private final /* synthetic */ void P2() {
    }

    private final /* synthetic */ void P4() {
    }

    private final /* synthetic */ void Q4() {
    }

    private final /* synthetic */ void V4() {
    }

    private final /* synthetic */ void W4() {
    }

    private final /* synthetic */ void X4() {
    }

    private final /* synthetic */ void b5() {
    }

    private final /* synthetic */ void c5() {
    }

    private final /* synthetic */ void d5() {
    }

    private final /* synthetic */ void q0() {
    }

    private final /* synthetic */ void u0() {
    }

    private final /* synthetic */ void w0() {
    }

    @Override // t4.d
    public void r() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void v0() {
    }

    private final /* synthetic */ void B1(wi wiVar) {
    }

    private final /* synthetic */ void B2(q1 q1Var) {
    }

    private final /* synthetic */ void B4(q1 q1Var) {
    }

    private final /* synthetic */ void C0(q1 q1Var) {
    }

    private final /* synthetic */ void C2(q1 q1Var) {
    }

    private final /* synthetic */ void D1(q1 q1Var) {
    }

    private final /* synthetic */ void D2(q1 q1Var) {
    }

    private final /* synthetic */ void E2(q1 q1Var) {
    }

    private final /* synthetic */ void F0(q1 q1Var) {
    }

    private final /* synthetic */ void F1(q1 q1Var) {
    }

    private final /* synthetic */ void F2(q1 q1Var) {
    }

    private final /* synthetic */ void G(q1 q1Var) {
    }

    private final /* synthetic */ void G2(q1 q1Var) {
    }

    private final /* synthetic */ void J1(q1 q1Var) {
    }

    private final /* synthetic */ void M(q1 q1Var) {
    }

    private final /* synthetic */ void M0(q1 q1Var) {
    }

    private final /* synthetic */ void M3(String str) {
    }

    private final /* synthetic */ void N3(String str) {
    }

    private final /* synthetic */ void O(q1 q1Var) {
    }

    private final /* synthetic */ void O3(String str) {
    }

    private final /* synthetic */ void R4(int i3) {
    }

    private final /* synthetic */ void S4(int i3) {
    }

    private final /* synthetic */ void T4(int i3) {
    }

    private final /* synthetic */ void U0(q1 q1Var) {
    }

    private final /* synthetic */ void V0(q1 q1Var) {
    }

    private final /* synthetic */ void V3(q1 q1Var) {
    }

    private final /* synthetic */ void W(q1 q1Var) {
    }

    private final /* synthetic */ void W0(q1 q1Var) {
    }

    private final /* synthetic */ void W3(q1 q1Var) {
    }

    private final /* synthetic */ void X3(q1 q1Var) {
    }

    private final /* synthetic */ void Y4(zi ziVar) {
    }

    private final /* synthetic */ void Z4(zi ziVar) {
    }

    private final /* synthetic */ void a0(q1 q1Var) {
    }

    private final /* synthetic */ void a5(zi ziVar) {
    }

    private final /* synthetic */ void b2(q1 q1Var) {
    }

    private final /* synthetic */ void b4(q1 q1Var) {
    }

    private final /* synthetic */ void c0(q1 q1Var) {
    }

    private final /* synthetic */ void c2(q1 q1Var) {
    }

    private final /* synthetic */ void c3(q1 q1Var) {
    }

    private final /* synthetic */ void c4(q1 q1Var) {
    }

    private final /* synthetic */ void d2(q1 q1Var) {
    }

    private final /* synthetic */ void d3(q1 q1Var) {
    }

    private final /* synthetic */ void d4(q1 q1Var) {
    }

    private final /* synthetic */ void e3(q1 q1Var) {
    }

    private final /* synthetic */ void e4(zi ziVar) {
    }

    private final /* synthetic */ void f4(zi ziVar) {
    }

    private final /* synthetic */ void g4(zi ziVar) {
    }

    private final /* synthetic */ void h4(q1 q1Var) {
    }

    private final /* synthetic */ void i4(q1 q1Var) {
    }

    private final /* synthetic */ void j1(q1 q1Var) {
    }

    private final /* synthetic */ void j4(q1 q1Var) {
    }

    private final /* synthetic */ void k1(q1 q1Var) {
    }

    private final /* synthetic */ void l1(q1 q1Var) {
    }

    private final /* synthetic */ void l2(q1 q1Var) {
    }

    private final /* synthetic */ void l3(q1 q1Var) {
    }

    private final /* synthetic */ void m1(wi wiVar) {
    }

    private final /* synthetic */ void m3(q1 q1Var) {
    }

    private final /* synthetic */ void n2(q1 q1Var) {
    }

    private final /* synthetic */ void n3(q1 q1Var) {
    }

    private final /* synthetic */ void n4(q1 q1Var) {
    }

    private final /* synthetic */ void o3(q1 q1Var) {
    }

    private final /* synthetic */ void o4(q1 q1Var) {
    }

    private final /* synthetic */ void p3(q1 q1Var) {
    }

    private final /* synthetic */ void p4(q1 q1Var) {
    }

    private final /* synthetic */ void q3(q1 q1Var) {
    }

    private final /* synthetic */ void r2(q1 q1Var) {
    }

    private final /* synthetic */ void r3(q1 q1Var) {
    }

    private final /* synthetic */ void s1(wi wiVar) {
    }

    private final /* synthetic */ void s3(q1 q1Var) {
    }

    private final /* synthetic */ void t3(q1 q1Var) {
    }

    private final /* synthetic */ void x3(q1 q1Var) {
    }

    private final /* synthetic */ void x4(q1 q1Var) {
    }

    private final /* synthetic */ void y3(q1 q1Var) {
    }

    private final /* synthetic */ void z3(q1 q1Var) {
    }

    private final /* synthetic */ void z4(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void a1(TLRPC.User user) {
    }

    private final /* synthetic */ void A2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void K2(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void L2(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void M2(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void O0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void O1(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void P3(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void Q3(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void R0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void R3(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void T0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T1(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void X1(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void f3(String str, String str2) {
    }

    private final /* synthetic */ void g2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void g3(String str, String str2) {
    }

    private final /* synthetic */ void h3(String str, String str2) {
    }

    private final /* synthetic */ void j2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void k2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void k4(q1 q1Var, g10 g10Var) {
    }

    private final /* synthetic */ void l(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void l4(q1 q1Var, g10 g10Var) {
    }

    private final /* synthetic */ void m4(q1 q1Var, g10 g10Var) {
    }

    private final /* synthetic */ void r4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void t(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void t4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void v2(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void v4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void w2(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void x(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void x2(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void y2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void z2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // t4.d
    public void u(int i3, Object obj) {
    }

    private final void A4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void C4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void D3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void E3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void F3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void Q2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void R2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void S2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void Y3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void Z3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void a(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void a4(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void e1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void g1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void h(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void h1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void i3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void j3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void k(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void k3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void s2(q1 q1Var, int i3, int i10) {
    }

    private final void s4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void t2(q1 q1Var, int i3, int i10) {
    }

    private final /* synthetic */ void u2(q1 q1Var, int i3, int i10) {
    }

    private final /* synthetic */ void u3(q1 q1Var, float f10, float f11) {
    }

    private final void u4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void v3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void w3(q1 q1Var, float f10, float f11) {
    }

    private final void w4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void y4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void G3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void H2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void H3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void I2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void I3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void J2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void J3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void K3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void L3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void T2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final /* synthetic */ void U2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final /* synthetic */ void V2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final /* synthetic */ void S3(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final /* synthetic */ void T3(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final /* synthetic */ void U3(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final /* synthetic */ void W2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void X2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void Y2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void Z2(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void a3(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void b3(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.zh
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }

    private final /* synthetic */ void Y0(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void Z0(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void b1(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }

    private final /* synthetic */ void L4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }

    private final /* synthetic */ void M4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }

    private final /* synthetic */ void N4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
