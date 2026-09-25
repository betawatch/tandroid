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
import n2.k;
import n2.m;
import n2.o;
import n2.x;
import n7.z0;
import nf.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.z5;
import org.telegram.ui.hv0;
import org.telegram.ui.mn;
import q9.d;
import r0.r;
import ye.h;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class a implements b, bg.a, q, cf.b, c, n, ui, y2.n, n2.n, d, og, l1, t0, r, xf.a {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean C0() {
        return true;
    }

    @Override // cf.b
    public cf.a F1(z0 z0Var) {
        return new h(z0Var);
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // xf.a
    public boolean H0(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // n2.n
    public int L0(s sVar) {
        return sVar.v != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ m2 O0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // bg.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // n2.n
    public n2.h Y0(k kVar, s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new o(new g(6001, new x()));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hv0 Y1() {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ int b1() {
        return 0;
    }

    @Override // xf.a
    public boolean c(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(int i10, u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override // org.telegram.ui.Components.og
    public boolean i1() {
        return false;
    }

    @Override // n2.n
    public /* synthetic */ m j0(k kVar, s sVar) {
        return m.u;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // y2.n
    public Object n2(Uri uri, g2.k kVar) {
        return Long.valueOf(d0.T(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(z5 z5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ mn p0() {
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

    @Override // org.telegram.ui.Components.og
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

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui
    public void x0(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ r9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public void A2() {
    }

    @Override // org.telegram.ui.Components.og
    public void D() {
    }

    @Override // org.telegram.ui.Components.og
    public void E1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void W() {
    }

    @Override // n2.n
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void d2() {
    }

    @Override // c3.q
    public void e1() {
    }

    @Override // org.telegram.ui.Components.og
    public void g() {
    }

    @Override // org.telegram.ui.Components.og
    public void i2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.og
    public void n1() {
    }

    @Override // org.telegram.ui.Components.og
    public void o2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void r1() {
    }

    @Override // n2.n
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.og
    public void s0() {
    }

    @Override // org.telegram.ui.Components.og
    public void s1() {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.og
    public void w2() {
    }

    @Override // org.telegram.ui.Components.og
    public void x() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.og
    public void X(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(u1 u1Var) {
    }

    @Override // c3.q
    public void X1(b0 b0Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void Z(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public void a1(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public void f2(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.og
    public void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void k0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void r0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void x1(long j3) {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void y1(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(u1 u1Var) {
    }

    @Override // n2.n
    public void C(Looper looper, j2.k kVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Components.og
    public void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Components.og
    public void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void U(w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void h2(w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void J1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // bg.a
    public int L1(int i10, int i11, int i12) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void g0(w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void g1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Components.og
    public void l1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.og
    public void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.r
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.r
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void u2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.ui
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
