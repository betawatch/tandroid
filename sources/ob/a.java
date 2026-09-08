package ob;

import ah.i0;
import ah.u;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.emoji2.text.v;
import b2.k0;
import c3.b0;
import c3.h0;
import c3.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import fb.n;
import i2.g;
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
import of.f;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ov0;
import q1.b;
import q9.d;
import q9.e;
import qb.k;
import r4.c;
import v2.l;
import v7.l8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class a implements bg.a, q, e, cg.a, n, d, k1, c, Continuation, l, xf.a, y6.d {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static final CharSequence D3(Object obj) {
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
    public static boolean l3(b bVar, Editable editable, int i10, int i11, boolean z10) {
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
                v[] vVarArr = (v[]) editable.getSpans(selectionStart, min, v.class);
                if (vVarArr != null && vVarArr.length > 0) {
                    for (v vVar : vVarArr) {
                        int spanStart = editable.getSpanStart(vVar);
                        int spanEnd = editable.getSpanEnd(vVar);
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

    public static short p3(short s10, short s11) {
        int i10 = s10 + 32768;
        int i11 = s11 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    public static w w3(List list) {
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
    public void A0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // q9.d
    public Object D(cf.c cVar) {
        switch (this.a) {
            case 15:
                qb.a aVar = new qb.a();
                androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(7);
                ReferenceQueue referenceQueue = aVar.a;
                Set set = aVar.b;
                set.add(new qb.l(aVar, referenceQueue, set, nVar));
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
    public /* synthetic */ void D1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // xf.a
    public boolean E0(Context context) {
        return e0.b.p(context);
    }

    @Override // bg.a
    public int E1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var, u uVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // bg.a
    public void O0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(p3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // c3.q
    public void P1(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ov0 Q1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R0(t1 t1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // c3.q
    public h0 R1(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X0(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(t1 t1Var, long j3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // c3.q
    public void Z0() {
        throw new UnsupportedOperationException();
    }

    @Override // v2.l
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var, TLRPC.User user) {
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
                aVar = new q9.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new i0(6, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(MessageObject messageObject) {
        int i10 = this.a;
        return wl.a(messageObject);
    }

    @Override // v2.l
    public long d() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // xf.a
    public boolean e(Context context) {
        return e0.b.l(context);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1() {
        int i10 = this.a;
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
    public /* synthetic */ int f0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // y6.d
    public a3.l h(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.a = cVar.e(context, str);
        int i10 = 1;
        int b10 = cVar.b(context, str, true);
        lVar.b = b10;
        int i11 = lVar.a;
        if (i11 == 0) {
            i11 = 0;
            if (b10 == 0) {
                i10 = 0;
                lVar.c = i10;
                return lVar;
            }
        }
        if (b10 < i11) {
            i10 = -1;
        }
        lVar.c = i10;
        return lVar;
    }

    @Override // fb.n
    public Object h2() {
        switch (this.a) {
            case 8:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n0(z5 z5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // v2.l
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
        int i10 = this.a;
    }

    public boolean o3(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ r9 q2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(t1 t1Var, float f7, float f10, boolean z10) {
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
    public /* synthetic */ boolean u0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // r4.c
    public void v() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, boolean z10) {
        int i10 = this.a;
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
    public /* synthetic */ void x0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // cg.a
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(g.i(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
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
    public /* synthetic */ boolean z1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    public a(Context context) {
        this.a = 11;
    }

    private final /* synthetic */ void B() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void C() {
    }

    private final /* synthetic */ void C1() {
    }

    private final /* synthetic */ void C3() {
    }

    private final /* synthetic */ void D2() {
    }

    private final /* synthetic */ void E2() {
    }

    private final /* synthetic */ void U() {
    }

    private final /* synthetic */ void V1() {
    }

    private final /* synthetic */ void W() {
    }

    private final /* synthetic */ void m3() {
    }

    private final /* synthetic */ void n3() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void t3() {
    }

    private final /* synthetic */ void x3() {
    }

    private final /* synthetic */ void y3() {
    }

    private final /* synthetic */ void A3(MessageObject messageObject) {
    }

    private final /* synthetic */ void B0(t1 t1Var) {
    }

    private final /* synthetic */ void B2(t1 t1Var) {
    }

    private final /* synthetic */ void C2(t1 t1Var) {
    }

    private final /* synthetic */ void D0(t1 t1Var) {
    }

    private final /* synthetic */ void G(t1 t1Var) {
    }

    private final /* synthetic */ void G0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void H(t1 t1Var) {
    }

    private final /* synthetic */ void H0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void J(t1 t1Var) {
    }

    private final /* synthetic */ void K(t1 t1Var) {
    }

    private final /* synthetic */ void K0(t1 t1Var) {
    }

    private final /* synthetic */ void L2(String str) {
    }

    private final /* synthetic */ void M0(t1 t1Var) {
    }

    private final /* synthetic */ void M2(String str) {
    }

    private final /* synthetic */ void R2(t1 t1Var) {
    }

    private final /* synthetic */ void S2(t1 t1Var) {
    }

    private final /* synthetic */ void V0(t1 t1Var) {
    }

    private final /* synthetic */ void V2(t1 t1Var) {
    }

    private final /* synthetic */ void W0(t1 t1Var) {
    }

    private final /* synthetic */ void W2(t1 t1Var) {
    }

    private final /* synthetic */ void X(t1 t1Var) {
    }

    private final /* synthetic */ void X2(MessageObject messageObject) {
    }

    private final /* synthetic */ void Y2(MessageObject messageObject) {
    }

    private final /* synthetic */ void Z2(t1 t1Var) {
    }

    private final /* synthetic */ void a3(t1 t1Var) {
    }

    private final /* synthetic */ void b0(t1 t1Var) {
    }

    private final /* synthetic */ void b1(t1 t1Var) {
    }

    private final /* synthetic */ void d1(t1 t1Var) {
    }

    private final /* synthetic */ void d3(t1 t1Var) {
    }

    private final /* synthetic */ void e3(t1 t1Var) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void h3(t1 t1Var) {
    }

    private final /* synthetic */ void j3(t1 t1Var) {
    }

    private final /* synthetic */ void k0(t1 t1Var) {
    }

    private final /* synthetic */ void k3(t1 t1Var) {
    }

    private final /* synthetic */ void l0(t1 t1Var) {
    }

    private final /* synthetic */ void l2(t1 t1Var) {
    }

    private final /* synthetic */ void n1(t1 t1Var) {
    }

    private final /* synthetic */ void n2(t1 t1Var) {
    }

    private final /* synthetic */ void p1(t1 t1Var) {
    }

    private final /* synthetic */ void q1(t1 t1Var) {
    }

    private final /* synthetic */ void r1(t1 t1Var) {
    }

    private final /* synthetic */ void t2(t1 t1Var) {
    }

    private final /* synthetic */ void u2(t1 t1Var) {
    }

    private final /* synthetic */ void u3(int i10) {
    }

    private final /* synthetic */ void v2(t1 t1Var) {
    }

    private final /* synthetic */ void v3(int i10) {
    }

    private final /* synthetic */ void w2(t1 t1Var) {
    }

    private final /* synthetic */ void x2(t1 t1Var) {
    }

    private final /* synthetic */ void y2(t1 t1Var) {
    }

    private final /* synthetic */ void z3(MessageObject messageObject) {
    }

    private final /* synthetic */ void N2(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void O2(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void P0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void T0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void Y0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void a1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void b3(t1 t1Var, u uVar) {
    }

    private final /* synthetic */ void c3(t1 t1Var, u uVar) {
    }

    private final /* synthetic */ void g3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void h0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void i0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void i1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void i3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void k1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void l1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void m1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void p(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void q(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void r2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void s2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void x1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void y1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void A2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void F2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void G2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void T2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void U2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X1(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Z1(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void f1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void h1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void k(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void l(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void r0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void z0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void z2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void H2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void I2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void J2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void K2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void a2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void b2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void s1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void t1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void P2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void Q2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void c2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void f2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void g2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void j2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void o0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void q0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
