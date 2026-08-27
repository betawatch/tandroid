package ab;

import af.h;
import android.content.Context;
import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import e2.c;
import fh.f;
import h3.t1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import jh.z1;
import l.x;
import m9.b;
import n2.v;
import oa.l;
import oa.m;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.t5;
import org.telegram.ui.ou0;
import org.xml.sax.Attributes;
import y3.u;
import z8.d;
import z8.e;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class a implements c, j6.c, kf.a, e, x, b, n9.a, m, j1, ei, d, u, OnFailureListener {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static long A3(v vVar) {
        Throwable th = (IOException) vVar.c;
        if ((th instanceof t1) || (th instanceof FileNotFoundException) || (th instanceof e0) || (th instanceof p0)) {
            return -9223372036854775807L;
        }
        int i10 = n.b;
        while (th != null) {
            if ((th instanceof n) && ((n) th).a == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return Math.min((vVar.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
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
    public static boolean B3(q1.b bVar, Editable editable, int i10, int i11, boolean z10) {
        int min;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int max = Math.max(i10, 0);
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
                    int max2 = Math.max(i11, 0);
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
                    selectionStart = Math.max(selectionStart - i10, 0);
                    min = Math.min(selectionEnd + i11, editable.length());
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

    public static m9.a C(a aVar) {
        return new m9.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new jb.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static boolean C3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = gf.m.a("data-document-id", attributes);
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
                        int i11 = length - 1;
                        if (editable.getSpanFlags(spans[i11]) == 17) {
                            obj = spans[i11];
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
                editable.setSpan(new gf.n(0), editable.length(), editable.length(), 17);
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
            if (z10) {
                String a3 = gf.m.a("language", attributes);
                if (a3 == null) {
                    a3 = gf.m.a("lang", attributes);
                }
                if (a3 == null) {
                    a3 = gf.m.a("lng", attributes);
                }
                editable.setSpan(new gf.n(a3), editable.length(), editable.length(), 17);
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
                if (z10) {
                    editable.setSpan(new gf.n(3), editable.length(), editable.length(), 17);
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
        if (z10) {
            String a10 = gf.m.a("class", attributes);
            if (gf.m.a("data-collapsed", attributes) != null || (a10 != null && a10.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new gf.n(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        gf.n[] nVarArr = (gf.n[]) editable.getSpans(0, editable.length(), gf.n.class);
        for (int length2 = nVarArr.length - 1; length2 >= 0; length2--) {
            gf.n nVar = nVarArr[length2];
            if (editable.getSpanFlags(nVar) == 17 && ((i10 = nVar.a) == 2 || i10 == 3)) {
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

    public static k0 x3(j0 j0Var, v vVar) {
        IOException iOException = (IOException) vVar.c;
        if (!(iOException instanceof h0)) {
            return null;
        }
        int i10 = ((h0) iOException).d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (j0Var.a(1)) {
            return new k0(1, 300000L);
        }
        if (j0Var.a(2)) {
            return new k0(2, 60000L);
        }
        return null;
    }

    public static gf.n y3(Editable editable, int i10) {
        gf.n[] nVarArr = (gf.n[]) editable.getSpans(0, editable.length(), gf.n.class);
        if (nVarArr.length == 0) {
            return null;
        }
        for (int length = nVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(nVarArr[i11]) == 17) {
                gf.n nVar = nVarArr[i11];
                if (nVar.a == i10) {
                    return nVar;
                }
            }
        }
        return null;
    }

    @Override // j6.c
    public int A(Context context, String str) {
        return j6.e.a(context, str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // y3.u
    public boolean B() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C0() {
        int i10 = this.a;
    }

    @Override // kf.a
    public int C1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // kf.a
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(xa.a.q3(s10, s11));
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        we.e.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle F1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    public boolean F3(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void G0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ boolean N0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ou0 O1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // m9.b
    public m9.a P1(a aVar, JSONObject jSONObject) {
        return C(aVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(s1 s1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y0(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // y3.u
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // n9.a
    public StackTraceElement[] a0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a1(MessageObject messageObject) {
        int i10 = this.a;
        return rl.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(s1 s1Var, f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int b0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // z8.e
    public List c(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (z8.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new z8.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new z1(3, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ qg.a d0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // y3.u
    public boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e0(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f0(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // oa.m
    public Object f2() {
        switch (this.a) {
            case 17:
                return new ArrayList();
            default:
                return new l(true);
        }
    }

    @Override // j6.c
    public int g(Context context, String str, boolean z10) {
        return j6.e.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h2() {
        int i10 = this.a;
    }

    @Override // y3.u
    public boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // l.x
    public boolean l(l.l lVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int l0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // e2.c
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m2() {
        int i10 = this.a;
    }

    @Override // e2.c
    public void n(int i10, Object obj) {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ k9 o2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
        int i10 = this.a;
    }

    @Override // y3.u
    public int r() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s0(t5 t5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u() {
        int i10 = this.a;
    }

    @Override // z8.d
    public Object u0(h hVar) {
        switch (this.a) {
            case 24:
                return new a(0);
            default:
                return new za.b(0);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v1(s1 s1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x0(s1 s1Var, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean x1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public void y(sg sgVar) {
        sgVar.run();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String z(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z1() {
        switch (this.a) {
        }
        return false;
    }

    public int z3(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    private final /* synthetic */ void D3() {
    }

    private final /* synthetic */ void E3() {
    }

    private final /* synthetic */ void I3() {
    }

    private final /* synthetic */ void J3() {
    }

    private final /* synthetic */ void M3() {
    }

    private final /* synthetic */ void N() {
    }

    private final /* synthetic */ void N3() {
    }

    private final /* synthetic */ void P() {
    }

    private final /* synthetic */ void P2() {
    }

    private final /* synthetic */ void Q2() {
    }

    private final /* synthetic */ void Q3() {
    }

    private final /* synthetic */ void R3() {
    }

    private final /* synthetic */ void q0() {
    }

    private final /* synthetic */ void r2() {
    }

    private final /* synthetic */ void s2() {
    }

    private final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void w() {
    }

    private final /* synthetic */ void A1(s1 s1Var) {
    }

    private final /* synthetic */ void B2(s1 s1Var) {
    }

    private final /* synthetic */ void C2(s1 s1Var) {
    }

    private final /* synthetic */ void F2(s1 s1Var) {
    }

    private final /* synthetic */ void G2(s1 s1Var) {
    }

    private final /* synthetic */ void H2(s1 s1Var) {
    }

    private final /* synthetic */ void I2(s1 s1Var) {
    }

    private final /* synthetic */ void J2(s1 s1Var) {
    }

    private final /* synthetic */ void K2(s1 s1Var) {
    }

    private final /* synthetic */ void K3(int i10) {
    }

    private final /* synthetic */ void L3(int i10) {
    }

    private final /* synthetic */ void N2(s1 s1Var) {
    }

    private final /* synthetic */ void O2(s1 s1Var) {
    }

    private final /* synthetic */ void O3(MessageObject messageObject) {
    }

    private final /* synthetic */ void P3(MessageObject messageObject) {
    }

    private final /* synthetic */ void S(s1 s1Var) {
    }

    private final /* synthetic */ void T0(s1 s1Var) {
    }

    private final /* synthetic */ void V0(s1 s1Var) {
    }

    private final /* synthetic */ void X1(s1 s1Var) {
    }

    private final /* synthetic */ void X2(String str) {
    }

    private final /* synthetic */ void Y1(s1 s1Var) {
    }

    private final /* synthetic */ void Y2(String str) {
    }

    private final /* synthetic */ void c0(s1 s1Var) {
    }

    private final /* synthetic */ void d3(s1 s1Var) {
    }

    private final /* synthetic */ void e2(s1 s1Var) {
    }

    private final /* synthetic */ void e3(s1 s1Var) {
    }

    private final /* synthetic */ void f1(s1 s1Var) {
    }

    private final /* synthetic */ void g1(s1 s1Var) {
    }

    private final /* synthetic */ void g2(s1 s1Var) {
    }

    private final /* synthetic */ void h0(s1 s1Var) {
    }

    private final /* synthetic */ void h3(s1 s1Var) {
    }

    private final /* synthetic */ void i1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void i3(s1 s1Var) {
    }

    private final /* synthetic */ void j1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void j3(MessageObject messageObject) {
    }

    private final /* synthetic */ void k1(s1 s1Var) {
    }

    private final /* synthetic */ void k3(MessageObject messageObject) {
    }

    private final /* synthetic */ void l1(s1 s1Var) {
    }

    private final /* synthetic */ void l3(s1 s1Var) {
    }

    private final /* synthetic */ void m3(s1 s1Var) {
    }

    private final /* synthetic */ void o0(s1 s1Var) {
    }

    private final /* synthetic */ void p1(s1 s1Var) {
    }

    private final /* synthetic */ void p3(s1 s1Var) {
    }

    private final /* synthetic */ void q1(s1 s1Var) {
    }

    private final /* synthetic */ void q3(s1 s1Var) {
    }

    private final void r3(s1 s1Var) {
    }

    private final void t3(s1 s1Var) {
    }

    private final /* synthetic */ void v3(s1 s1Var) {
    }

    private final /* synthetic */ void w1(s1 s1Var) {
    }

    private final /* synthetic */ void w3(s1 s1Var) {
    }

    private final /* synthetic */ void y0(s1 s1Var) {
    }

    private final /* synthetic */ void z0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void I(Object obj) {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void g0(TLRPC.User user) {
    }

    private final /* synthetic */ void D2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void E2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void I0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void J(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void K(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void K0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void S1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void T1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void W1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void Z2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void a3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void n1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void n3(s1 s1Var, f fVar) {
    }

    private final /* synthetic */ void o1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void o3(s1 s1Var, f fVar) {
    }

    private final /* synthetic */ void p2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void q2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void r1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void s3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void t1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void u3(s1 s1Var, boolean z10) {
    }

    @Override // l.x
    public void b(l.l lVar, boolean z10) {
    }

    private final /* synthetic */ void E(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void G(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void J1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void L2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void M2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void N1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void R2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void S2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void b1(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void c1(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void f3(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void g3(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void t2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void u2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void T2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void U2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void V2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void W2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void j2(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void l2(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void v2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void w2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void A2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void b3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void c3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void y2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void z2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void X0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void Z0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void G3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void H3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ei
    public void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
