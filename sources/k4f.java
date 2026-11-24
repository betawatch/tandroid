// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k4f implements lr2, OnFailureListener, z0c, r27, x21, rv9, i40, u84, em6, mc2, w0d, mv8, cx7, hk2 {
    public static k4f b;
    public final /* synthetic */ byte a;
    public static final k4f c = new k4f(1);
    public static final k4f d = new k4f(2);
    public static final /* synthetic */ k4f e = new k4f(3);
    public static final /* synthetic */ k4f f = new k4f(4);
    public static final k4f h = new k4f(5);
    public static final k4f n = new k4f(6);
    public static final k4f r = new k4f(7);
    public static final k4f s = new k4f(8);
    public static final k4f w = new k4f(9);
    public static final k4f x = new k4f(10);
    public static final k4f y = new k4f(11);
    public static final /* synthetic */ k4f E = new k4f(12);

    public /* synthetic */ k4f(byte b2) {
        this.a = b2;
    }

    public static void I3(JsonReader jsonReader, jo5 jo5Var) {
        jsonReader.beginArray();
        boolean z = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                jsonReader.beginObject();
                String str = null;
                String str2 = null;
                j0b j0bVar = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals("BASE-ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        str = jsonReader.nextString();
                    } else if (nextName.equals("ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        str2 = jsonReader.nextString();
                    } else if (nextName.equals("URI-REPLACEMENT") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                        jsonReader.beginObject();
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        HashMap hashMap3 = new HashMap();
                        String str3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            if (nextName2.equals("HOST") && jsonReader.peek().equals(JsonToken.STRING)) {
                                str3 = jsonReader.nextString();
                                if (str3.isEmpty()) {
                                    throw bx7.c("The HOST string is present but empty");
                                }
                            } else if (nextName2.equals("PARAMS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName3 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap.put(nextName3, jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (nextName2.equals("PER-VARIANT-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap2.put(nextName4, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (nextName2.equals("PER-RENDITION-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap3.put(nextName5, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        j0bVar = new j0b(str3, hashMap, hashMap2, hashMap3);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str == null) {
                    throw bx7.c("BASE-ID field is missing in a PATHWAY-CLONE object");
                }
                if (str2 == null) {
                    throw bx7.c("ID field is missing in a PATHWAY-CLONE object");
                }
                if (j0bVar == null) {
                    throw bx7.c("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object");
                }
                jo5Var.c(new i0b(str, str2, j0bVar));
                z = true;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!z) {
            throw bx7.c("The PATHWAY-CLONES array is present but empty");
        }
    }

    public static void J3(JsonReader jsonReader, jo5 jo5Var) {
        HashSet hashSet = new HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                String nextString = jsonReader.nextString();
                if (!hashSet.add(nextString)) {
                    throw bx7.c("The pathway ID (" + nextString + ") appears more than once in the PATHWAY-PRIORITY array");
                }
                jo5Var.c(nextString);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (hashSet.isEmpty()) {
            throw bx7.c("The PATHWAY-PRIORITY array is present but empty");
        }
    }

    public static synchronized void O3() {
        synchronized (k4f.class) {
            if (b == null) {
                b = new k4f((byte) 0);
            }
        }
    }

    public static byte[] l3(mo5 mo5Var, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(mo5Var.size());
        Iterator<E> it = mo5Var.iterator();
        while (it.hasNext()) {
            f53 f53Var = (f53) it.next();
            Bundle a = f53Var.a();
            Bitmap bitmap = f53Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                jte.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a.putByteArray(f53.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static ca6 u3(ba6 ba6Var, de deVar) {
        IOException iOException = (IOException) deVar.c;
        if (!(iOException instanceof ki5)) {
            return null;
        }
        int i = ((ki5) iOException).c;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (ba6Var.e) {
            if (ba6Var.a(2)) {
                return new ca6(2, 60000L);
            }
            if (ba6Var.a(1)) {
                return new ca6(1, 300000L);
            }
            return null;
        }
        if (ba6Var.a(1)) {
            return new ca6(1, 300000L);
        }
        if (ba6Var.a(2)) {
            return new ca6(2, 60000L);
        }
        return null;
    }

    public static long w3(de deVar) {
        for (Throwable th = (IOException) deVar.c; th != null; th = th.getCause()) {
            if ((th instanceof bx7) || (th instanceof FileNotFoundException) || (th instanceof hi5) || (th instanceof la6)) {
                return -9223372036854775807L;
            }
            if ((th instanceof d83) && ((d83) th).a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((deVar.b - 1) * 1000, 5000);
    }

    public static short z3(short s2, short s3) {
        int i = s2 + 32768;
        int i2 = s3 + 32768;
        int i3 = (i < 32768 || i2 < 32768) ? (i * i2) / 32768 : (((i + i2) << 1) - ((i * i2) / 32768)) - 65535;
        return (short) ((i3 != 65536 ? i3 : 65535) - 32768);
    }

    @Override // mc2
    public final void A(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean A0(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override // u84
    public final void B() {
        throw new UnsupportedOperationException();
    }

    @Override // mc2
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void C1() {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void D0(rc2 rc2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean D1(gn gnVar) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void F0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void G(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void H(rc2 rc2Var, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void J1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean K() {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void L1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void M0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final pc8 M1() {
        byte b2 = this.a;
        return null;
    }

    @Override // mc2
    public final boolean N() {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void N0(rc2 rc2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void N1(String str, String str2) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final int O() {
        byte b2 = this.a;
        return 0;
    }

    @Override // mc2
    public final boolean O1(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void P(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final String P0(rc2 rc2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override // mc2
    public final void P1(rc2 rc2Var, n28 n28Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final int Q(rc2 rc2Var) {
        byte b2 = this.a;
        return 0;
    }

    @Override // mc2
    public final void Q0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void Q1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void R(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final hw1 S() {
        byte b2 = this.a;
        return null;
    }

    @Override // mc2
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void T(k47 k47Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void T0() {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void U0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean U1(k47 k47Var) {
        byte b2 = this.a;
        return true;
    }

    @Override // mc2
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void W(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 1:
                Object i = sm2Var.i(new yy8(i36.class, Executor.class));
                i.getClass();
                return new e64((Executor) i);
            default:
                ArrayList arrayList = new ArrayList(sm2Var.N(w5d.class));
                ite.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, ju6.e);
                return new g8e((Context) sm2Var.a(Context.class), (w5d) arrayList.get(0));
        }
    }

    @Override // mc2
    public final void X0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void Y(int i) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final boolean Z() {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void Z0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean Z1(rc2 rc2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override // hk2
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // mc2
    public final CharacterStyle a0(rc2 rc2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override // z0c
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // mc2
    public final boolean b() {
        byte b2 = this.a;
        return false;
    }

    @Override // x21
    public final void b0(y21 y21Var, j21 j21Var, h21 h21Var, gx gxVar) {
        zna znaVar = new zna(y21Var, y21.IN_OUT_OFFSET_Y, y21Var.getHeight());
        znaVar.m.a(0.8f);
        znaVar.m.b(400.0f);
        znaVar.a(new hx0(h21Var, (byte) 2));
        znaVar.b(new v21(gxVar, y21Var, (byte) 0));
        znaVar.h();
        j21Var.run();
    }

    @Override // mc2
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void c() {
        byte b2 = this.a;
    }

    @Override // u84
    public final yzb c0(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // mc2
    public final boolean d0() {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void d2(rc2 rc2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // em6
    public final long e() {
        throw new NoSuchElementException();
    }

    @Override // mc2
    public final void e0(k47 k47Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean f() {
        byte b2 = this.a;
        return true;
    }

    @Override // u84
    public final void f0(ix9 ix9Var) {
        throw new UnsupportedOperationException();
    }

    @Override // em6
    public final long g() {
        throw new NoSuchElementException();
    }

    @Override // x21
    public final void g0(y21 y21Var, j21 j21Var, yt0 yt0Var, t52 t52Var) {
        y21Var.setInOutOffset(y21Var.getMeasuredHeight());
        t52Var.accept(Float.valueOf(y21Var.getTranslationY()));
        zna znaVar = new zna((Object) y21Var, y21.IN_OUT_OFFSET_Y, 0.0f);
        znaVar.m.a(0.8f);
        znaVar.m.b(400.0f);
        znaVar.a(new w21(y21Var, yt0Var, (byte) 0));
        znaVar.b(new v21(t52Var, y21Var, (byte) 1));
        znaVar.h();
        j21Var.run();
    }

    @Override // mc2
    public final void g2() {
        byte b2 = this.a;
    }

    @Override // mv8
    public final Object get() {
        kg7 kg7Var = new kg7((byte) 29);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            gxc.d("Null flags");
            return null;
        }
        hashMap.put(fl8.a, new kb0(30000L, 86400000L, set));
        if (set == null) {
            gxc.d("Null flags");
            return null;
        }
        hashMap.put(fl8.c, new kb0(1000L, 86400000L, set));
        if (set == null) {
            gxc.d("Null flags");
            return null;
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(ns9.b)));
        if (unmodifiableSet == null) {
            gxc.d("Null flags");
            return null;
        }
        hashMap.put(fl8.b, new kb0(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() >= fl8.values().length) {
            return new jb0(kg7Var, hashMap);
        }
        dq9.m("Not all priorities have been configured");
        return null;
    }

    public final void h(c44 c44Var) {
        c44Var.a(ioe.class, myd.a);
        c44Var.a(rye.class, tce.a);
        c44Var.a(qoe.class, qyd.a);
        c44Var.a(upe.class, zyd.a);
        c44Var.a(fpe.class, vyd.a);
        c44Var.a(npe.class, gzd.a);
        c44Var.a(hje.class, ltd.a);
        c44Var.a(dje.class, ftd.a);
        c44Var.a(ime.class, fxd.a);
        c44Var.a(oxe.class, yae.a);
        c44Var.a(xie.class, ysd.a);
        c44Var.a(rie.class, usd.a);
        c44Var.a(jre.class, z1e.a);
        c44Var.a(h1f.class, yvd.a);
        c44Var.a(ule.class, qwd.a);
        c44Var.a(dle.class, svd.a);
        c44Var.a(pre.class, e2e.a);
        c44Var.a(qgb.class, jae.a);
        c44Var.a(fxe.class, pae.a);
        c44Var.a(xwe.class, eae.a);
        c44Var.a(kqe.class, i0e.a);
        c44Var.a(d1f.class, tod.a);
        c44Var.a(qqe.class, o0e.a);
        c44Var.a(zse.class, w4e.a);
        c44Var.a(nte.class, n5e.a);
        c44Var.a(kte.class, h5e.a);
        c44Var.a(ete.class, a5e.a);
        c44Var.a(jve.class, o7e.a);
        c44Var.a(nve.class, t7e.a);
        c44Var.a(uve.class, s8e.a);
        c44Var.a(rve.class, l8e.a);
        c44Var.a(fqe.class, b0e.a);
        c44Var.a(yve.class, y8e.a);
        c44Var.a(dwe.class, e9e.a);
        c44Var.a(hwe.class, k9e.a);
        c44Var.a(lwe.class, p9e.a);
        c44Var.a(twe.class, w9e.a);
        c44Var.a(ibb.class, aae.a);
        c44Var.a(gve.class, q6e.a);
        c44Var.a(one.class, cyd.a);
        c44Var.a(zue.class, a7e.a);
        c44Var.a(tue.class, v6e.a);
        c44Var.a(ave.class, g7e.a);
        c44Var.a(jxe.class, tae.a);
        c44Var.a(lze.class, pee.a);
        c44Var.a(sge.class, oqd.a);
        c44Var.a(gge.class, bqd.a);
        c44Var.a(age.class, vpd.a);
        c44Var.a(mge.class, gqd.a);
        c44Var.a(bhe.class, yqd.a);
        c44Var.a(xge.class, tqd.a);
        c44Var.a(fhe.class, brd.a);
        c44Var.a(lhe.class, erd.a);
        c44Var.a(qhe.class, krd.a);
        c44Var.a(vhe.class, qrd.a);
        c44Var.a(aie.class, xrd.a);
        c44Var.a(mgd.class, xnd.a);
        c44Var.a(ygd.class, iod.a);
        c44Var.a(rgd.class, cod.a);
        c44Var.a(ene.class, txd.a);
        c44Var.a(lje.class, std.a);
        c44Var.a(bbd.class, hhd.a);
        c44Var.a(yad.class, mhd.a);
        c44Var.a(uke.class, tud.a);
        c44Var.a(tbd.class, rhd.a);
        c44Var.a(jbd.class, whd.a);
        c44Var.a(bdd.class, akd.a);
        c44Var.a(wcd.class, hkd.a);
        c44Var.a(hcd.class, aid.a);
        c44Var.a(zbd.class, gid.a);
        c44Var.a(ued.class, jld.a);
        c44Var.a(oed.class, rld.a);
        c44Var.a(nfd.class, lmd.a);
        c44Var.a(gfd.class, rmd.a);
        c44Var.a(jgd.class, ond.a);
        c44Var.a(ggd.class, snd.a);
        c44Var.a(ufd.class, umd.a);
        c44Var.a(rfd.class, and.a);
        c44Var.a(cgd.class, gnd.a);
        c44Var.a(xfd.class, jnd.a);
        c44Var.a(m0f.class, pbe.a);
        c44Var.a(oze.class, xtd.a);
        c44Var.a(c0f.class, yzd.a);
        c44Var.a(yze.class, szd.a);
        c44Var.a(rze.class, ewd.a);
        c44Var.a(i0f.class, jbe.a);
        c44Var.a(f0f.class, ebe.a);
        c44Var.a(p0f.class, ube.a);
        c44Var.a(vze.class, kxd.a);
        c44Var.a(a1f.class, cfe.a);
        c44Var.a(y0f.class, gfe.a);
        c44Var.a(s0f.class, wee.a);
        c44Var.a(sxe.class, cce.a);
        c44Var.a(zme.class, oxd.a);
        c44Var.a(sne.class, hyd.a);
        c44Var.a(tfe.class, yod.a);
        c44Var.a(yle.class, uwd.a);
        c44Var.a(kne.class, xxd.a);
        c44Var.a(yke.class, avd.a);
        c44Var.a(dke.class, fud.a);
        c44Var.a(kke.class, jud.a);
        c44Var.a(ake.class, cud.a);
        c44Var.a(qke.class, pud.a);
        c44Var.a(bqe.class, nzd.a);
        c44Var.a(vpe.class, kzd.a);
        c44Var.a(vad.class, ehd.a);
        c44Var.a(cze.class, nde.a);
        c44Var.a(ize.class, yde.a);
        c44Var.a(fze.class, sde.a);
        c44Var.a(ofe.class, nod.a);
        c44Var.a(oie.class, nsd.a);
        c44Var.a(jie.class, jsd.a);
        c44Var.a(fie.class, dsd.a);
        c44Var.a(tqe.class, d1e.a);
        c44Var.a(fre.class, q1e.a);
        c44Var.a(zqe.class, k1e.a);
        c44Var.a(scd.class, njd.a);
        c44Var.a(ncd.class, tjd.a);
        c44Var.a(vre.class, k2e.a);
        c44Var.a(jse.class, c4e.a);
        c44Var.a(zre.class, q2e.a);
        c44Var.a(ese.class, v2e.a);
        c44Var.a(zdd.class, lkd.a);
        c44Var.a(udd.class, qkd.a);
        c44Var.a(cye.class, nce.a);
        c44Var.a(xxe.class, hce.a);
        c44Var.a(xye.class, zce.a);
        c44Var.a(aze.class, jde.a);
        c44Var.a(rte.class, t5e.a);
        c44Var.a(oue.class, l6e.a);
        c44Var.a(xte.class, z5e.a);
        c44Var.a(kue.class, g6e.a);
        c44Var.a(bfd.class, zld.a);
        c44Var.a(zed.class, fmd.a);
        c44Var.a(cme.class, zwd.a);
        c44Var.a(ile.class, lwd.a);
        c44Var.a(lse.class, h4e.a);
        c44Var.a(vse.class, s4e.a);
        c44Var.a(pse.class, l4e.a);
        c44Var.a(led.class, zkd.a);
        c44Var.a(ded.class, dld.a);
    }

    @Override // mc2
    public final void h0(String str) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void i() {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void i0(rc2 rc2Var, int i) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void i1(rc2 rc2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void i2(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // i40
    public final void j0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i3 = 0; i3 < min; i3++) {
            shortBuffer2.put(z3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // mc2
    public final void k(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void k0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void k1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean l0(rc2 rc2Var, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final boolean l1() {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final /* synthetic */ boolean m1(k47 k47Var) {
        byte b2 = this.a;
        return aq1.a(k47Var);
    }

    @Override // mc2
    public final boolean m2(int i) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final boolean n1(rc2 rc2Var, int i) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        byte b2 = this.a;
        return false;
    }

    @Override // em6
    public final boolean next() {
        return false;
    }

    @Override // mc2
    public final void o0(rc2 rc2Var, int i, int i2) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void o1(rc2 rc2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void o2() {
        byte b2 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        s13 s13Var = hg7.e;
        if (Log.isLoggable(s13Var.b, 6)) {
            String str = s13Var.c;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }

    @Override // mc2
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        byte b2 = this.a;
        return false;
    }

    @Override // i40
    public final int p1(int i, int i2, int i3) {
        return i / 2;
    }

    @Override // mc2
    public final hkb p2() {
        byte b2 = this.a;
        return null;
    }

    @Override // mc2
    public final void q() {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void q1(h47 h47Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void q2(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // w0d
    public final qk0 r(String str, zf0 zf0Var, EnumMap enumMap) {
        if (str.isEmpty()) {
            u36.j("Found empty contents");
            return null;
        }
        if (zf0Var != zf0.d) {
            u36.i(zf0Var, "Can only encode QR_CODE, but got ");
            return null;
        }
        y34 y34Var = y34.a;
        g54 valueOf = enumMap.containsKey(y34Var) ? g54.valueOf(enumMap.get(y34Var).toString()) : g54.b;
        y34 y34Var2 = y34.c;
        int parseInt = enumMap.containsKey(y34Var2) ? Integer.parseInt(enumMap.get(y34Var2).toString()) : 4;
        rk0 rk0Var = (rk0) a44.b(str, valueOf, enumMap).f;
        if (rk0Var == null) {
            rjb.h();
            return null;
        }
        int i = rk0Var.b;
        int i2 = rk0Var.c;
        int i3 = parseInt << 1;
        int i4 = i + i3;
        int i5 = i3 + i2;
        int max = Math.max(0, i4);
        int max2 = Math.max(0, i5);
        int min = Math.min(max / i4, max2 / i5);
        int i6 = (max - (i * min)) / 2;
        int i7 = (max2 - (i2 * min)) / 2;
        qk0 qk0Var = new qk0(max, max2);
        int i8 = 0;
        while (i8 < i2) {
            int i9 = i6;
            int i10 = 0;
            while (i10 < i) {
                if (rk0Var.e(i10, i8) == 1) {
                    qk0Var.d(i9, i7, min, min);
                }
                i10++;
                i9 += min;
            }
            i8++;
            i7 += min;
        }
        return qk0Var;
    }

    @Override // mc2
    public final void r0(rc2 rc2Var, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void s0() {
        byte b2 = this.a;
    }

    @Override // mc2
    public final String t(long j) {
        byte b2 = this.a;
        return null;
    }

    @Override // mc2
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void t1(rc2 rc2Var, int i) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void u(rc2 rc2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void v0(rc2 rc2Var, long j) {
        byte b2 = this.a;
    }

    public final int v3(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // r27
    public final boolean w0(y17 y17Var) {
        return false;
    }

    @Override // mc2
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean x0(rc2 rc2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override // mc2
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        byte b2 = this.a;
        l11.u(rc2Var.getContext(), str);
    }

    @Override // cx7
    public final Object y(Uri uri, e83 e83Var) {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(e83Var));
        try {
            if (!jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                throw bx7.c("Steering manifest JSON should be an object at root");
            }
            jo5 jo5Var = new jo5(4);
            jo5 jo5Var2 = new jo5(4);
            jsonReader.beginObject();
            Uri uri2 = null;
            int i = 1;
            long j = -9223372036854775807L;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (nextName.equals("VERSION") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    i = jsonReader.nextInt();
                } else if (nextName.equals("TTL") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    j = jsonReader.nextInt() * 1000;
                } else if (nextName.equals("RELOAD-URI") && jsonReader.peek().equals(JsonToken.STRING)) {
                    uri2 = Uri.parse(jsonReader.nextString());
                } else if (nextName.equals("PATHWAY-PRIORITY") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    J3(jsonReader, jo5Var);
                } else if (nextName.equals("PATHWAY-CLONES") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    I3(jsonReader, jo5Var2);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            y79 f2 = jo5Var.f();
            if (f2.isEmpty()) {
                throw bx7.c("PATHWAY-PRIORITY field is missing");
            }
            k0b k0bVar = new k0b(i, j, uri2, f2, jo5Var2.f());
            jsonReader.close();
            return k0bVar;
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // mc2
    public final void y1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
        byte b2 = this.a;
    }

    @Override // mc2
    public final boolean z1() {
        byte b2 = this.a;
        return false;
    }

    private final void C3() {
    }

    private final void D3() {
    }

    private final void G3() {
    }

    private final void H3() {
    }

    private final void J() {
    }

    private final void J2() {
    }

    private final void K2() {
    }

    private final void L() {
    }

    private final void M3() {
    }

    private final void N3() {
    }

    private final void a2() {
    }

    private final void b2() {
    }

    private final void s() {
    }

    private final void v() {
    }

    private final void x3() {
    }

    private final void y3() {
    }

    @Override // rv9
    public final void finish() {
    }

    private final void A2(rc2 rc2Var) {
    }

    private final void B2(rc2 rc2Var) {
    }

    private final void C(rc2 rc2Var) {
    }

    private final void C2(rc2 rc2Var) {
    }

    private final void D(rc2 rc2Var) {
    }

    private final void D2(rc2 rc2Var) {
    }

    private final void E2(rc2 rc2Var) {
    }

    private final void E3(int i) {
    }

    private final void F1(rc2 rc2Var) {
    }

    private final void F3(int i) {
    }

    private final void G1(rc2 rc2Var) {
    }

    private final void H0(rc2 rc2Var) {
    }

    private final void H1(rc2 rc2Var) {
    }

    private final void H2(rc2 rc2Var) {
    }

    private final void I(rc2 rc2Var) {
    }

    private final void I0(rc2 rc2Var) {
    }

    private final void I2(rc2 rc2Var) {
    }

    private final void K0(h47 h47Var) {
    }

    private final void K1(rc2 rc2Var) {
    }

    private final void K3(k47 k47Var) {
    }

    private final void L3(k47 k47Var) {
    }

    private final void O0(h47 h47Var) {
    }

    private final void R0(rc2 rc2Var) {
    }

    private final void R2(String str) {
    }

    private final void S2(String str) {
    }

    private final void V(rc2 rc2Var) {
    }

    private final void W0(rc2 rc2Var) {
    }

    private final void X2(rc2 rc2Var) {
    }

    private final void Y2(rc2 rc2Var) {
    }

    private final void b3(rc2 rc2Var) {
    }

    private final void c1(rc2 rc2Var) {
    }

    private final void c3(rc2 rc2Var) {
    }

    private final void d1(rc2 rc2Var) {
    }

    private final void d3(k47 k47Var) {
    }

    private final void e3(k47 k47Var) {
    }

    private final void f3(rc2 rc2Var) {
    }

    private final void g1(rc2 rc2Var) {
    }

    private final void g3(rc2 rc2Var) {
    }

    private final void h1(rc2 rc2Var) {
    }

    private final void j3(rc2 rc2Var) {
    }

    private final void k3(rc2 rc2Var) {
    }

    private final void n0(rc2 rc2Var) {
    }

    private final void t2(rc2 rc2Var) {
    }

    private final void u2(rc2 rc2Var) {
    }

    private final void x(rc2 rc2Var) {
    }

    private final void y0(rc2 rc2Var) {
    }

    private final void z0(rc2 rc2Var) {
    }

    private final void z2(rc2 rc2Var) {
    }

    @Override // rv9
    public final void j(float f2) {
    }

    @Override // rv9
    public final void w(hg3 hg3Var) {
    }

    private final void A1(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void E1(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void T1(rc2 rc2Var, int i) {
    }

    private final void T2(rc2 rc2Var, long j) {
    }

    private final void U2(rc2 rc2Var, long j) {
    }

    private final void V1(rc2 rc2Var, int i) {
    }

    private final void Y0(rc2 rc2Var, ir0 ir0Var) {
    }

    private final void a1(rc2 rc2Var, ir0 ir0Var) {
    }

    private final void e1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void f1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void h3(rc2 rc2Var, n28 n28Var) {
    }

    private final void i3(rc2 rc2Var, n28 n28Var) {
    }

    private final void m3(rc2 rc2Var, boolean z) {
    }

    private final void o(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o3(rc2 rc2Var, boolean z) {
    }

    private final void p(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void q0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void q3(rc2 rc2Var, boolean z) {
    }

    private final void s1(rc2 rc2Var, int i) {
    }

    private final void s3(rc2 rc2Var, boolean z) {
    }

    private final void u0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void v1(rc2 rc2Var, int i) {
    }

    private final void v2(String str, String str2) {
    }

    private final void w2(String str, String str2) {
    }

    @Override // r27
    public final void d(y17 y17Var, boolean z) {
    }

    private final void E0(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    private final void F2(rc2 rc2Var, float f2, float f3) {
    }

    private final void G0(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    private final void G2(rc2 rc2Var, float f2, float f3) {
    }

    private final void L2(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void M2(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void Z2(rc2 rc2Var, float f2, float f3) {
    }

    private final void a3(rc2 rc2Var, float f2, float f3) {
    }

    private final void c2(rc2 rc2Var, float f2, float f3) {
    }

    private final void e2(rc2 rc2Var, float f2, float f3) {
    }

    private final void j1(rc2 rc2Var, int i, int i2) {
    }

    private final void l(rc2 rc2Var, float f2, float f3) {
    }

    private final void n(rc2 rc2Var, float f2, float f3) {
    }

    private final void n3(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void p3(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void r1(rc2 rc2Var, int i, int i2) {
    }

    private final void r3(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void t3(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void x2(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void y2(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void N2(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void O2(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void P2(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Q2(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void R1(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    private final void S1(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    private final void f2(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void h2(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void V2(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void W2(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void j2(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void k2(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void r2(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    private final void s2(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    private final void B0(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void C0(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void A3(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    private final void B3(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
