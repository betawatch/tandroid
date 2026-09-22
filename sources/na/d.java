package na;

import a3.m0;
import ai.z9;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.emoji2.text.u;
import b2.k0;
import c3.b0;
import c3.h0;
import c3.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import fb.n;
import i9.s;
import i9.t;
import i9.w;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.x5;
import org.telegram.ui.pv0;
import qb.k;
import v2.l;
import v7.l8;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class d implements m0, bg.a, q, q9.e, cg.a, n, q9.d, k1, r4.c, Continuation, l, xf.a, y6.d {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    public static final CharSequence G3(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
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
    public static boolean o3(q1.b bVar, Editable editable, int i10, int i11, boolean z10) {
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
                u[] uVarArr = (u[]) editable.getSpans(selectionStart, min, u.class);
                if (uVarArr != null && uVarArr.length > 0) {
                    for (u uVar : uVarArr) {
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

    public static short s3(short s10, short s11) {
        int i10 = s10 + 32768;
        int i11 = s11 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    public static w z3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((k0) it.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                t tVar = new t();
                tVar.n(unsupportedOperationException);
                return tVar;
            }
        }
        return l8.b(list);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public void D0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        switch (this.a) {
            case 15:
                qb.a aVar = new qb.a();
                z9 z9Var = new z9(7);
                ReferenceQueue referenceQueue = aVar.a;
                Set set = aVar.b;
                set.add(new qb.l(aVar, referenceQueue, set, z9Var));
                Thread thread = new Thread(new s(24, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            case 20:
                return new k((Context) cVar.a(Context.class));
            default:
                return new tb.a();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // xf.a
    public boolean H0(Context context) {
        return e0.b.p(context);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // bg.a
    public int L1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        nf.f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle O1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // bg.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(s3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(t1 t1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // c3.q
    public void X1(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ hh.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pv0 Y1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // c3.q
    public h0 Z1(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // v2.l
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // q9.e
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (q9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new q9.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new ah.b(5, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // xf.a
    public boolean c(Context context) {
        return e0.b.l(context);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // y6.d
    public a3.l d(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.a = cVar.l(context, str);
        int i10 = 1;
        int d = cVar.d(context, str, true);
        lVar.b = d;
        int i11 = lVar.a;
        if (i11 == 0) {
            i11 = 0;
            if (d == 0) {
                i10 = 0;
                lVar.c = i10;
                return lVar;
            }
        }
        if (d < i11) {
            i10 = -1;
        }
        lVar.c = i10;
        return lVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // c3.q
    public void e1() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // v2.l
    public long g() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var, long j3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String h(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        int i10 = this.a;
        return vl.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, bi.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
        int i10 = this.a;
    }

    @Override // v2.l
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(x5 x5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // fb.n
    public Object p2() {
        switch (this.a) {
            case 8:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override // r4.c
    public void q() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
        int i10 = this.a;
    }

    public boolean r3(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u1(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // r4.c
    public void x(int i10, Object obj) {
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
    public /* synthetic */ void x2() {
        int i10 = this.a;
    }

    @Override // cg.a
    public void y(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(hg.c.i(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
        float f7 = remaining;
        float f10 = f7 / f7;
        float f11 = ceil;
        float f12 = f11 / f11;
        while (remaining > 0 && ceil > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f10 = remaining / f7;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                ceil--;
                f12 = ceil / f11;
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ r9 z2() {
        switch (this.a) {
        }
        return null;
    }

    public d(Context context) {
        this.a = 11;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B1() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void E1() {
    }

    private final /* synthetic */ void E3() {
    }

    private final /* synthetic */ void F3() {
    }

    private final /* synthetic */ void G2() {
    }

    private final /* synthetic */ void H() {
    }

    private final /* synthetic */ void H2() {
    }

    private final /* synthetic */ void K() {
    }

    private final /* synthetic */ void c0() {
    }

    private final /* synthetic */ void g0() {
    }

    private final /* synthetic */ void p3() {
    }

    private final /* synthetic */ void q3() {
    }

    private final /* synthetic */ void v3() {
    }

    private final /* synthetic */ void w3() {
    }

    @Override // a3.m0
    public /* synthetic */ void B() {
    }

    @Override // a3.m0
    public /* synthetic */ void C() {
    }

    @Override // a3.m0
    public /* synthetic */ void J() {
    }

    @Override // a3.m0
    public /* synthetic */ void onFirstFrameRendered() {
    }

    private final /* synthetic */ void A2(t1 t1Var) {
    }

    private final /* synthetic */ void B2(t1 t1Var) {
    }

    private final /* synthetic */ void C3(MessageObject messageObject) {
    }

    private final /* synthetic */ void D3(MessageObject messageObject) {
    }

    private final /* synthetic */ void E2(t1 t1Var) {
    }

    private final /* synthetic */ void F2(t1 t1Var) {
    }

    private final /* synthetic */ void G0(t1 t1Var) {
    }

    private final /* synthetic */ void J0(t1 t1Var) {
    }

    private final /* synthetic */ void K0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void O0(t1 t1Var) {
    }

    private final /* synthetic */ void O2(String str) {
    }

    private final /* synthetic */ void P2(String str) {
    }

    private final /* synthetic */ void Q0(t1 t1Var) {
    }

    private final /* synthetic */ void U(t1 t1Var) {
    }

    private final /* synthetic */ void U2(t1 t1Var) {
    }

    private final /* synthetic */ void V2(t1 t1Var) {
    }

    private final /* synthetic */ void W(t1 t1Var) {
    }

    private final /* synthetic */ void X(t1 t1Var) {
    }

    private final /* synthetic */ void Y0(t1 t1Var) {
    }

    private final /* synthetic */ void Y2(t1 t1Var) {
    }

    private final /* synthetic */ void Z(t1 t1Var) {
    }

    private final /* synthetic */ void Z2(t1 t1Var) {
    }

    private final /* synthetic */ void a1(t1 t1Var) {
    }

    private final /* synthetic */ void a3(MessageObject messageObject) {
    }

    private final /* synthetic */ void b3(MessageObject messageObject) {
    }

    private final /* synthetic */ void c3(t1 t1Var) {
    }

    private final /* synthetic */ void d3(t1 t1Var) {
    }

    private final /* synthetic */ void f1(t1 t1Var) {
    }

    private final /* synthetic */ void g1(t1 t1Var) {
    }

    private final /* synthetic */ void g3(t1 t1Var) {
    }

    private final /* synthetic */ void h3(t1 t1Var) {
    }

    private final void i3(t1 t1Var) {
    }

    private final /* synthetic */ void j0(t1 t1Var) {
    }

    private final /* synthetic */ void j2(t1 t1Var) {
    }

    private final /* synthetic */ void k0(t1 t1Var) {
    }

    private final /* synthetic */ void k2(t1 t1Var) {
    }

    private final void k3(t1 t1Var) {
    }

    private final /* synthetic */ void m3(t1 t1Var) {
    }

    private final /* synthetic */ void n3(t1 t1Var) {
    }

    private final /* synthetic */ void r0(t1 t1Var) {
    }

    private final /* synthetic */ void r1(t1 t1Var) {
    }

    private final /* synthetic */ void r2(t1 t1Var) {
    }

    private final /* synthetic */ void s0(t1 t1Var) {
    }

    private final /* synthetic */ void s1(t1 t1Var) {
    }

    private final /* synthetic */ void s2(t1 t1Var) {
    }

    private final /* synthetic */ void t1(t1 t1Var) {
    }

    private final /* synthetic */ void u2(t1 t1Var) {
    }

    private final /* synthetic */ void v1(t1 t1Var) {
    }

    private final /* synthetic */ void w2(t1 t1Var) {
    }

    private final /* synthetic */ void x3(int i10) {
    }

    private final /* synthetic */ void y3(int i10) {
    }

    private final /* synthetic */ void D(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void Q2(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void R2(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void T0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void U0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void b1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void d1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void e3(t1 t1Var, bi.f fVar) {
    }

    private final /* synthetic */ void f3(t1 t1Var, bi.f fVar) {
    }

    private final /* synthetic */ void j3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void l1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void l3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void m0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void n1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void n2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void o1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void o2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void p0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void q1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void v(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void y1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void z1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void C0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void C2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void D2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void E0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void F1(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void I2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void J1(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void J2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void W2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void i1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void j1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void l(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void m(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void K2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void L2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void M2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void N2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void S1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void W1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void w1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void x1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void S2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void T2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void d2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void f2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void h2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void i2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void u0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void x0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
