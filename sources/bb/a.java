package bb;

import a4.z;
import a5.j;
import a9.e;
import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.upstream.s0;
import f5.d0;
import hh.f;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import kc.c;
import n4.l;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.y5;
import org.telegram.ui.lu0;
import org.xml.sax.Attributes;
import pa.m;
import r0.s;
import ye.d;
import za.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class a implements z, h3.a, mf.a, l, nf.a, s0, j1, m, s, og.a, e {
    public static a b;
    public static a c;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static String B3(c cVar) {
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

    public static void E3(String str) {
        if (str == null || str.length() == 0) {
            throw new dc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new dc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static final CharSequence H3(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static jf.m n3(Editable editable, int i10) {
        jf.m[] mVarArr = (jf.m[]) editable.getSpans(0, editable.length(), jf.m.class);
        if (mVarArr.length == 0) {
            return null;
        }
        for (int length = mVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(mVarArr[i11]) == 17) {
                jf.m mVar = mVarArr[i11];
                if (mVar.a == i10) {
                    return mVar;
                }
            }
        }
        return null;
    }

    public static boolean o3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = jf.l.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new y5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), y5.class);
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
                Object obj2 = (y5) obj;
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
                editable.setSpan(new jf.m(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object n32 = n3(editable, 0);
            if (n32 != null) {
                int spanStart2 = editable.getSpanStart(n32);
                editable.removeSpan(n32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(n32, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a10 = jf.l.a("language", attributes);
                if (a10 == null) {
                    a10 = jf.l.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = jf.l.a("lng", attributes);
                }
                editable.setSpan(new jf.m(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object n33 = n3(editable, 1);
            if (n33 != null) {
                int spanStart3 = editable.getSpanStart(n33);
                editable.removeSpan(n33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(n33, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new jf.m(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object n34 = n3(editable, 3);
                if (n34 != null) {
                    int spanStart4 = editable.getSpanStart(n34);
                    editable.removeSpan(n34);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(n34, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a11 = jf.l.a("class", attributes);
            if (jf.l.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new jf.m(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        jf.m[] mVarArr = (jf.m[]) editable.getSpans(0, editable.length(), jf.m.class);
        for (int length2 = mVarArr.length - 1; length2 >= 0; length2--) {
            jf.m mVar = mVarArr[length2];
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

    public static short s3(short s10, short s11) {
        int i10 = s10 + 32768;
        int i11 = s11 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public void D0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F1(s1 s1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // a9.e
    public Object I0(j jVar) {
        switch (this.a) {
            case 25:
                return new za.c(jVar.r(b.class));
            default:
                return new b(jVar.c(ya.a.class));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // mf.a
    public int M1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle P1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // mf.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(s3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W0(s1 s1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ sg.a X() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void X0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ lu0 Y1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Z(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // a4.z
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n4.l
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void c0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.upstream.s0
    public Object d(Uri uri, o oVar) {
        return Long.valueOf(d0.K(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // h3.a
    public long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e0(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int f0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g2(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // og.a
    public int h() {
        return 872415231;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        int i10 = this.a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // a4.z
    public boolean i(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var, f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k1() {
        int i10 = this.a;
    }

    @Override // n4.l
    public long l() {
        throw new NoSuchElementException();
    }

    @Override // og.a
    public int m() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean n0(y5 y5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // n4.l
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p0(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // pa.m
    public Object p2() {
        switch (this.a) {
            case 20:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // a4.z
    public boolean q(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q2() {
        int i10 = this.a;
    }

    @Override // a4.z
    public int r() {
        return MediaCodecList.getCodecCount();
    }

    @Override // nf.a
    public void r0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    public boolean r3(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean u2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // og.a
    public int v() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f9, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w2() {
        int i10 = this.a;
    }

    @Override // a4.z
    public boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String y(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ l9 y2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // og.a
    public int z() {
        return 1711276032;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z0() {
        int i10 = this.a;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B1() {
    }

    private final /* synthetic */ void D1() {
    }

    private final /* synthetic */ void F2() {
    }

    private final /* synthetic */ void F3() {
    }

    private final /* synthetic */ void G2() {
    }

    private final /* synthetic */ void G3() {
    }

    private final /* synthetic */ void J() {
    }

    private final /* synthetic */ void M() {
    }

    private final /* synthetic */ void h0() {
    }

    private final /* synthetic */ void i0() {
    }

    private final /* synthetic */ void p3() {
    }

    private final /* synthetic */ void q3() {
    }

    private final /* synthetic */ void v3() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void z3() {
    }

    private final /* synthetic */ void A2(s1 s1Var) {
    }

    private final /* synthetic */ void C3(MessageObject messageObject) {
    }

    private final /* synthetic */ void D2(s1 s1Var) {
    }

    private final /* synthetic */ void D3(MessageObject messageObject) {
    }

    private final /* synthetic */ void E2(s1 s1Var) {
    }

    private final /* synthetic */ void H0(s1 s1Var) {
    }

    private final /* synthetic */ void K0(s1 s1Var) {
    }

    private final /* synthetic */ void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void N2(String str) {
    }

    private final /* synthetic */ void O0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void O2(String str) {
    }

    private final /* synthetic */ void Q0(s1 s1Var) {
    }

    private final /* synthetic */ void T0(s1 s1Var) {
    }

    private final /* synthetic */ void T2(s1 s1Var) {
    }

    private final /* synthetic */ void U(s1 s1Var) {
    }

    private final /* synthetic */ void U2(s1 s1Var) {
    }

    private final /* synthetic */ void W(s1 s1Var) {
    }

    private final /* synthetic */ void X2(s1 s1Var) {
    }

    private final /* synthetic */ void Y2(s1 s1Var) {
    }

    private final /* synthetic */ void Z2(MessageObject messageObject) {
    }

    private final /* synthetic */ void a0(s1 s1Var) {
    }

    private final /* synthetic */ void a1(s1 s1Var) {
    }

    private final /* synthetic */ void a3(MessageObject messageObject) {
    }

    private final /* synthetic */ void b0(s1 s1Var) {
    }

    private final /* synthetic */ void b1(s1 s1Var) {
    }

    private final /* synthetic */ void b3(s1 s1Var) {
    }

    private final /* synthetic */ void c3(s1 s1Var) {
    }

    private final /* synthetic */ void f1(s1 s1Var) {
    }

    private final /* synthetic */ void f3(s1 s1Var) {
    }

    private final /* synthetic */ void g1(s1 s1Var) {
    }

    private final /* synthetic */ void g3(s1 s1Var) {
    }

    private final /* synthetic */ void h2(s1 s1Var) {
    }

    private final void h3(s1 s1Var) {
    }

    private final /* synthetic */ void i2(s1 s1Var) {
    }

    private final void j3(s1 s1Var) {
    }

    private final /* synthetic */ void k0(s1 s1Var) {
    }

    private final /* synthetic */ void l0(s1 s1Var) {
    }

    private final /* synthetic */ void l3(s1 s1Var) {
    }

    private final /* synthetic */ void m3(s1 s1Var) {
    }

    private final /* synthetic */ void o2(s1 s1Var) {
    }

    private final /* synthetic */ void r1(s1 s1Var) {
    }

    private final /* synthetic */ void r2(s1 s1Var) {
    }

    private final /* synthetic */ void s0(s1 s1Var) {
    }

    private final /* synthetic */ void s1(s1 s1Var) {
    }

    private final /* synthetic */ void t1(s1 s1Var) {
    }

    private final /* synthetic */ void t2(s1 s1Var) {
    }

    private final /* synthetic */ void u0(s1 s1Var) {
    }

    private final /* synthetic */ void v1(s1 s1Var) {
    }

    private final /* synthetic */ void v2(s1 s1Var) {
    }

    private final /* synthetic */ void x3(int i10) {
    }

    private final /* synthetic */ void y3(int i10) {
    }

    private final /* synthetic */ void z2(s1 s1Var) {
    }

    private final /* synthetic */ void G(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void I(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void P2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void Q2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void U0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void Z0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void d1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void d3(s1 s1Var, f fVar) {
    }

    private final /* synthetic */ void e1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void e3(s1 s1Var, f fVar) {
    }

    private final /* synthetic */ void i3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void k2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void k3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void l1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void l2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void n1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void o0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void o1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void q0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void q1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void y1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void z1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void B(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void B2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void C2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void D(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void E0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void E1(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void G0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void G1(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void H2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void I2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void V2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void W2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void i1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void j1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void J2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final /* synthetic */ void K1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void K2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final /* synthetic */ void L2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void M2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void T1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void w1(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void x1(s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override // r0.s
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.s
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final /* synthetic */ void R2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void S2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void X1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final /* synthetic */ void Z1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final /* synthetic */ void d2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void f2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void C0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void x0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
