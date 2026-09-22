package ob;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import android.view.View;
import androidx.car.app.messaging.model.b;
import b2.s;
import c3.b0;
import c3.h0;
import c3.q;
import da.c;
import e2.d0;
import e9.i0;
import fb.n;
import g2.k;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import n2.g;
import n2.j;
import n2.l;
import n2.m;
import n2.w;
import n7.a1;
import nf.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x5;
import org.telegram.ui.pv0;
import org.telegram.ui.rn;
import q9.d;
import r0.r;
import y2.o;
import ye.h;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a implements b, bg.a, q, cf.b, c, n, ti, o, m, d, mg, k1, t0, r, xf.a {
    public static a b;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static da.a B2(na.d dVar) {
        return new da.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ac.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static byte[] C2(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.d.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static Calendar D2() {
        if (b == null) {
            b = new a(25);
        }
        b.getClass();
        return Calendar.getInstance();
    }

    public static void E2(String str) {
        if (str == null || str.length() == 0) {
            throw new tc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new tc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean C0() {
        return true;
    }

    @Override // cf.b
    public cf.a F1(a1 a1Var) {
        return new h(a1Var);
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        switch (this.a) {
            case 14:
                return new rb.a(0);
            default:
                return new qb.b(0);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // xf.a
    public boolean H0(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // n2.m
    public int L0(s sVar) {
        return sVar.v != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ n2 O0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle O1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // bg.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // n2.m
    public g Y0(j jVar, s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new n2.n(new n2.f(6001, new w()));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pv0 Y1() {
        return null;
    }

    @Override // c3.q
    public h0 Z1(int i10, int i11) {
        return new c3.n();
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ int b1() {
        return 0;
    }

    @Override // xf.a
    public boolean c(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(int i10, t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String h(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return vl.a(messageObject);
    }

    @Override // org.telegram.ui.Components.mg
    public boolean i1() {
        return false;
    }

    @Override // n2.m
    public /* synthetic */ l j0(j jVar, s sVar) {
        return l.u;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // y2.o
    public Object n2(Uri uri, k kVar) {
        return Long.valueOf(d0.T(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(x5 x5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ rn p0() {
        return null;
    }

    @Override // fb.n
    public Object p2() {
        switch (this.a) {
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean r2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override // da.c
    public da.a s2(na.d dVar, JSONObject jSONObject) {
        return B2(dVar);
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public void x0(fh fhVar) {
        fhVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ r9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public void A2() {
    }

    @Override // org.telegram.ui.Components.mg
    public void D() {
    }

    @Override // org.telegram.ui.Components.mg
    public void E1() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void W() {
    }

    @Override // n2.m
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void d2() {
    }

    @Override // c3.q
    public void e1() {
    }

    @Override // org.telegram.ui.Components.mg
    public void g() {
    }

    @Override // org.telegram.ui.Components.mg
    public void i2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.mg
    public void n1() {
    }

    @Override // org.telegram.ui.Components.mg
    public void o2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void r1() {
    }

    @Override // n2.m
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.mg
    public void s0() {
    }

    @Override // org.telegram.ui.Components.mg
    public void s1() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.mg
    public void w2() {
    }

    @Override // org.telegram.ui.Components.mg
    public void x() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void D0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.mg
    public void X(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(t1 t1Var) {
    }

    @Override // c3.q
    public void X1(b0 b0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void Z(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.mg
    public void a1(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.mg
    public void f2(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.mg
    public void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void k0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void r0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.mg
    public void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void x1(long j3) {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void y1(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
    }

    @Override // n2.m
    public void C(Looper looper, j2.k kVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Components.mg
    public void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Components.mg
    public void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void U(w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void h2(w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void J1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // bg.a
    public int L1(int i10, int i11, int i12) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void g0(w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void g1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Components.mg
    public void l1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u1(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.r
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.r
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void u2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.ti
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
