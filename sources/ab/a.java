package ab;

import a4.h;
import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.CharacterStyle;
import c5.j;
import c9.b;
import c9.f;
import c9.g;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import e2.d;
import g5.a0;
import g5.l;
import j9.c;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import kf.k0;
import mg.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.cv0;
import org.telegram.ui.w61;
import org.xml.sax.Attributes;
import r3.n;
import r3.s;
import ra.m;
import v2.e;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements h, f, d, l, SuccessContinuation, c, m6.d, w61, nf.a, g, of.a, j1, e, r3.c, m, ji {
    public static volatile a b;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static void H3(String str) {
        if (str == null || str.length() == 0) {
            throw new fc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new fc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static kf.m t3(Editable editable, int i10) {
        kf.m[] mVarArr = (kf.m[]) editable.getSpans(0, editable.length(), kf.m.class);
        if (mVarArr.length == 0) {
            return null;
        }
        for (int length = mVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(mVarArr[i11]) == 17) {
                kf.m mVar = mVarArr[i11];
                if (mVar.a == i10) {
                    return mVar;
                }
            }
        }
        return null;
    }

    public static boolean u3(boolean z4, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z10 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z4) {
                String a2 = kf.l.a("data-document-id", attributes);
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
                editable.setSpan(new kf.m(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object t32 = t3(editable, 0);
            if (t32 != null) {
                int spanStart2 = editable.getSpanStart(t32);
                editable.removeSpan(t32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(t32, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z4) {
                String a10 = kf.l.a("language", attributes);
                if (a10 == null) {
                    a10 = kf.l.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = kf.l.a("lng", attributes);
                }
                editable.setSpan(new kf.m(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object t33 = t3(editable, 1);
            if (t33 != null) {
                int spanStart3 = editable.getSpanStart(t33);
                editable.removeSpan(t33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(t33, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z4) {
                    editable.setSpan(new kf.m(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object t34 = t3(editable, 3);
                if (t34 != null) {
                    int spanStart4 = editable.getSpanStart(t34);
                    editable.removeSpan(t34);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(t34, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z4) {
            String a11 = kf.l.a("class", attributes);
            if (kf.l.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                z10 = true;
            }
            editable.setSpan(new kf.m(z10 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        kf.m[] mVarArr = (kf.m[]) editable.getSpans(0, editable.length(), kf.m.class);
        for (int length2 = mVarArr.length - 1; length2 >= 0; length2--) {
            kf.m mVar = mVarArr[length2];
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, float f10, float f11, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean B0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ji
    public void C0(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ m9 D2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, TLObject tLObject, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean F1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public void I0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean K1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var, jh.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // nf.a
    public int P1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.a) {
        }
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle S1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int W() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // nf.a
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s6 = shortBuffer.get();
            shortBuffer2.put(s6);
            shortBuffer2.put(s6);
        }
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean X1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ug.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // v2.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // c9.g
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : componentRegistrar.getComponents()) {
            String str = bVar.a;
            if (str != null) {
                bVar = new b(str, bVar.b, bVar.c, bVar.d, bVar.e, new w(5, str, bVar), bVar.g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.a;
    }

    @Override // a4.h
    public long c(r3.l lVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c0(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(s1 s1Var, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ cv0 c2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // g5.l
    public g5.m createDataSource() {
        return new a0(false);
    }

    @Override // j9.c
    public String d() {
        return null;
    }

    @Override // c9.f
    public Object d0(j jVar) {
        switch (this.a) {
            case 4:
                return new cb.l((Context) jVar.a(Context.class));
            case 26:
                return new db.a(0);
            default:
                return new cb.b(0);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e2(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // m6.d
    public e8.a h(Context context, String str, m6.c cVar) {
        e8.a aVar = new e8.a();
        aVar.a = cVar.z(context, str);
        int i10 = 1;
        int h = cVar.h(context, str, true);
        aVar.b = h;
        int i11 = aVar.a;
        if (i11 == 0) {
            i11 = 0;
            if (h == 0) {
                i10 = 0;
                aVar.c = i10;
                return aVar;
            }
        }
        if (h < i11) {
            i10 = -1;
        }
        aVar.c = i10;
        return aVar;
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int k0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // a4.h
    public s l() {
        return new n(-9223372036854775807L);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l2(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        int i10 = this.a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // of.a
    public void r(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(k0.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
        float f10 = remaining;
        float f11 = f10 / f10;
        float f12 = ceil;
        float f13 = f12 / f12;
        while (remaining > 0 && ceil > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f11 = remaining / f10;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                ceil--;
                f13 = ceil / f12;
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean t0(u5 u5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // ra.m
    public Object u2() {
        switch (this.a) {
            case 22:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String w(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void C() {
    }

    private final /* synthetic */ void D() {
    }

    private final /* synthetic */ void D3() {
    }

    private final /* synthetic */ void E1() {
    }

    private final /* synthetic */ void E3() {
    }

    private final /* synthetic */ void I3() {
    }

    private final /* synthetic */ void J1() {
    }

    private final /* synthetic */ void J3() {
    }

    private final /* synthetic */ void L2() {
    }

    private final /* synthetic */ void M2() {
    }

    private final /* synthetic */ void V() {
    }

    private final /* synthetic */ void X() {
    }

    private final /* synthetic */ void v3() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void z3() {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void Q0() {
    }

    @Override // j9.c
    public void a() {
    }

    @Override // e2.d
    public void m0() {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void z0() {
    }

    private final /* synthetic */ void A2(s1 s1Var) {
    }

    private final /* synthetic */ void B3(int i10) {
    }

    private final /* synthetic */ void C3(int i10) {
    }

    private final /* synthetic */ void E2(s1 s1Var) {
    }

    private final /* synthetic */ void F2(s1 s1Var) {
    }

    private final /* synthetic */ void F3(MessageObject messageObject) {
    }

    private final /* synthetic */ void G(s1 s1Var) {
    }

    private final /* synthetic */ void G2(s1 s1Var) {
    }

    private final /* synthetic */ void G3(MessageObject messageObject) {
    }

    private final /* synthetic */ void H(s1 s1Var) {
    }

    private final /* synthetic */ void H0(s1 s1Var) {
    }

    private final /* synthetic */ void J(s1 s1Var) {
    }

    private final /* synthetic */ void J0(s1 s1Var) {
    }

    private final /* synthetic */ void J2(s1 s1Var) {
    }

    private final /* synthetic */ void K(s1 s1Var) {
    }

    private final /* synthetic */ void K2(s1 s1Var) {
    }

    private final /* synthetic */ void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void M0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void O0(s1 s1Var) {
    }

    private final /* synthetic */ void P0(s1 s1Var) {
    }

    private final /* synthetic */ void T2(String str) {
    }

    private final /* synthetic */ void U2(String str) {
    }

    private final /* synthetic */ void Y(s1 s1Var) {
    }

    private final /* synthetic */ void Y0(s1 s1Var) {
    }

    private final /* synthetic */ void Z2(s1 s1Var) {
    }

    private final /* synthetic */ void a1(s1 s1Var) {
    }

    private final /* synthetic */ void a3(s1 s1Var) {
    }

    private final /* synthetic */ void b0(s1 s1Var) {
    }

    private final /* synthetic */ void d3(s1 s1Var) {
    }

    private final /* synthetic */ void e3(s1 s1Var) {
    }

    private final /* synthetic */ void f3(MessageObject messageObject) {
    }

    private final /* synthetic */ void g3(MessageObject messageObject) {
    }

    private final /* synthetic */ void h3(s1 s1Var) {
    }

    private final /* synthetic */ void i1(s1 s1Var) {
    }

    private final /* synthetic */ void i3(s1 s1Var) {
    }

    private final /* synthetic */ void j1(s1 s1Var) {
    }

    private final /* synthetic */ void l3(s1 s1Var) {
    }

    private final /* synthetic */ void m3(s1 s1Var) {
    }

    private final /* synthetic */ void n0(s1 s1Var) {
    }

    private final void n3(s1 s1Var) {
    }

    private final /* synthetic */ void o0(s1 s1Var) {
    }

    private final /* synthetic */ void o2(s1 s1Var) {
    }

    private final /* synthetic */ void p2(s1 s1Var) {
    }

    private final void p3(s1 s1Var) {
    }

    private final /* synthetic */ void r3(s1 s1Var) {
    }

    private final /* synthetic */ void s3(s1 s1Var) {
    }

    private final /* synthetic */ void v1(s1 s1Var) {
    }

    private final /* synthetic */ void w1(s1 s1Var) {
    }

    private final /* synthetic */ void w2(s1 s1Var) {
    }

    private final /* synthetic */ void x1(s1 s1Var) {
    }

    private final /* synthetic */ void y1(s1 s1Var) {
    }

    private final /* synthetic */ void y2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void Z0(Object obj) {
    }

    @Override // r3.c
    public long k(long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void o1(TLRPC.User user) {
    }

    @Override // a4.h
    public void p(long j10) {
    }

    private final /* synthetic */ void B(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void C1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void D1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void T0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void V0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void V2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void W2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void e0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void f1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void g1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void j0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void j3(s1 s1Var, jh.f fVar) {
    }

    private final /* synthetic */ void k3(s1 s1Var, jh.f fVar) {
    }

    private final /* synthetic */ void n1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void o3(s1 s1Var, boolean z4) {
    }

    private final /* synthetic */ void q1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void q2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void q3(s1 s1Var, boolean z4) {
    }

    private final /* synthetic */ void s1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void t1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void t2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void z(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // e2.d
    public void r0(int i10, Object obj) {
    }

    private final /* synthetic */ void H2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void I2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void N1(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void N2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void O2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void W1(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void b3(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void c3(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void k1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void l1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void v(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void w0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void x(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void x0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void A1(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void B1(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void P2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void Q2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void R2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void S2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void d2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void h2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void X2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void Y2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void k2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void m2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void n2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void q0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void u0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void x3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void y3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override // org.telegram.ui.Components.ji
    public void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
