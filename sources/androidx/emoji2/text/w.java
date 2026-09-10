package androidx.emoji2.text;

import android.net.Uri;
import android.os.Bundle;
import b2.e1;
import b2.i0;
import b2.j0;
import b2.l1;
import b2.m1;
import b2.r0;
import b2.r1;
import bi.p4;
import bi.u6;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import e2.d0;
import e9.a1;
import e9.f0;
import e9.g0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import v7.y7;
import y9.e2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements d9.e, GenericProvider, Utilities.Callback2Return, i5.e, Continuation, q9.d, ch.d {
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(u6Var);
        return lambda$getComponents$0;
    }

    public Constructor a() {
        switch (this.a) {
            case 14:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(c3.o.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(c3.o.class).getConstructor(null);
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        a1 i10;
        a1 j3;
        int i11 = 0;
        switch (this.a) {
            case 3:
                b2.w wVar = (b2.w) obj;
                return wVar.a + ": " + wVar.b;
            case 4:
                e1 e1Var = (e1) obj;
                e1Var.getClass();
                Bundle bundle = new Bundle();
                int i12 = e1Var.a;
                if (i12 != 0) {
                    bundle.putInt(e1.d, i12);
                }
                int i13 = e1Var.b;
                if (i13 != 0) {
                    bundle.putInt(e1.e, i13);
                }
                int i14 = e1Var.c;
                if (i14 != 0) {
                    bundle.putInt(e1.f, i14);
                }
                return bundle;
            case 5:
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(j0.h, j0Var.a);
                String str = j0Var.b;
                if (str != null) {
                    bundle2.putString(j0.i, str);
                }
                String str2 = j0Var.c;
                if (str2 != null) {
                    bundle2.putString(j0.j, str2);
                }
                int i15 = j0Var.d;
                if (i15 != 0) {
                    bundle2.putInt(j0.k, i15);
                }
                int i16 = j0Var.e;
                if (i16 != 0) {
                    bundle2.putInt(j0.l, i16);
                }
                String str3 = j0Var.f;
                if (str3 != null) {
                    bundle2.putString(j0.m, str3);
                }
                String str4 = j0Var.g;
                if (str4 != null) {
                    bundle2.putString(j0.n, str4);
                }
                return bundle2;
            case 6:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(j0.h);
                uri.getClass();
                String string = bundle3.getString(j0.i);
                String string2 = bundle3.getString(j0.j);
                int i17 = bundle3.getInt(j0.k, 0);
                int i18 = bundle3.getInt(j0.l, 0);
                String string3 = bundle3.getString(j0.m);
                String string4 = bundle3.getString(j0.n);
                i0 i0Var = new i0();
                i0Var.c = uri;
                i0Var.d = r0.n(string);
                i0Var.e = string2;
                i0Var.a = i17;
                i0Var.b = i18;
                i0Var.f = string3;
                i0Var.g = string4;
                return new j0(i0Var);
            case 7:
                Bundle bundle4 = (Bundle) obj;
                b2.s sVar = b2.s.U;
                b2.r rVar = new b2.r();
                if (bundle4 != null) {
                    ClassLoader classLoader = e2.d.class.getClassLoader();
                    String str5 = d0.a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(b2.s.V);
                String str6 = sVar.a;
                if (string5 == null) {
                    string5 = str6;
                }
                rVar.a = string5;
                String string6 = bundle4.getString(b2.s.W);
                String str7 = sVar.b;
                if (string6 == null) {
                    string6 = str7;
                }
                rVar.b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(b2.s.A0);
                if (parcelableArrayList == null) {
                    i10 = a1.e;
                } else {
                    f0 u10 = e9.i0.u();
                    for (int i19 = 0; i19 < parcelableArrayList.size(); i19++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i19);
                        bundle5.getClass();
                        String string7 = bundle5.getString(b2.w.c);
                        String string8 = bundle5.getString(b2.w.d);
                        string8.getClass();
                        u10.b(new b2.w(string7, string8));
                    }
                    i10 = u10.i();
                }
                rVar.c = e9.i0.v(i10);
                String string9 = bundle4.getString(b2.s.X);
                String str8 = sVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                rVar.d = string9;
                rVar.e = bundle4.getInt(b2.s.Y, sVar.e);
                rVar.f = bundle4.getInt(b2.s.Z, sVar.f);
                rVar.g = bundle4.getInt(b2.s.B0, sVar.g);
                rVar.h = bundle4.getInt(b2.s.a0, sVar.h);
                rVar.i = bundle4.getInt(b2.s.b0, sVar.i);
                String string10 = bundle4.getString(b2.s.c0);
                String str9 = sVar.k;
                if (string10 == null) {
                    string10 = str9;
                }
                rVar.j = string10;
                String string11 = bundle4.getString(b2.s.d0);
                String str10 = sVar.q;
                if (string11 == null) {
                    string11 = str10;
                }
                rVar.p = r0.n(string11);
                String string12 = bundle4.getString(b2.s.e0);
                String str11 = sVar.r;
                if (string12 == null) {
                    string12 = str11;
                }
                rVar.q = r0.n(string12);
                rVar.r = bundle4.getInt(b2.s.f0, sVar.s);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(b2.s.g0 + "_" + Integer.toString(i11, 36));
                    if (byteArray == null) {
                        rVar.t = arrayList;
                        rVar.u = (b2.o) bundle4.getParcelable(b2.s.h0);
                        rVar.v = bundle4.getLong(b2.s.i0, sVar.w);
                        rVar.x = bundle4.getInt(b2.s.j0, sVar.y);
                        rVar.y = bundle4.getInt(b2.s.k0, sVar.z);
                        rVar.z = bundle4.getInt(b2.s.D0, sVar.A);
                        rVar.A = bundle4.getInt(b2.s.E0, sVar.B);
                        rVar.B = bundle4.getFloat(b2.s.l0, sVar.C);
                        rVar.C = bundle4.getInt(b2.s.m0, sVar.D);
                        rVar.D = bundle4.getFloat(b2.s.n0, sVar.E);
                        rVar.E = bundle4.getByteArray(b2.s.o0);
                        rVar.F = bundle4.getInt(b2.s.p0, sVar.G);
                        rVar.H = bundle4.getInt(b2.s.C0, sVar.I);
                        Bundle bundle6 = bundle4.getBundle(b2.s.q0);
                        if (bundle6 != null) {
                            rVar.G = new b2.j(bundle6.getInt(b2.j.i, -1), bundle6.getInt(b2.j.j, -1), bundle6.getInt(b2.j.k, -1), bundle6.getByteArray(b2.j.l), bundle6.getInt(b2.j.m, -1), bundle6.getInt(b2.j.n, -1));
                        }
                        rVar.I = bundle4.getInt(b2.s.r0, sVar.J);
                        rVar.J = bundle4.getInt(b2.s.s0, sVar.K);
                        rVar.K = bundle4.getInt(b2.s.t0, sVar.L);
                        rVar.L = bundle4.getInt(b2.s.u0, sVar.M);
                        rVar.M = bundle4.getInt(b2.s.v0, sVar.N);
                        rVar.N = bundle4.getInt(b2.s.w0, sVar.O);
                        rVar.P = bundle4.getInt(b2.s.y0, sVar.Q);
                        rVar.Q = bundle4.getInt(b2.s.z0, sVar.R);
                        rVar.R = bundle4.getInt(b2.s.x0, sVar.S);
                        return new b2.s(rVar);
                    }
                    arrayList.add(byteArray);
                    i11++;
                }
            case 8:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(m1.c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(l1.f);
                if (parcelableArrayList2 == null) {
                    g0 g0Var = e9.i0.b;
                    j3 = a1.e;
                } else {
                    j3 = e2.d.j(new w(7), parcelableArrayList2);
                }
                l1 l1Var = new l1(bundle8.getString(l1.g, ""), (b2.s[]) j3.toArray(new b2.s[0]));
                int[] intArray = bundle7.getIntArray(m1.d);
                intArray.getClass();
                return new m1(l1Var, y7.a(intArray));
            case 9:
                r1 r1Var = (r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(r1.f, r1Var.b.c());
                bundle9.putIntArray(r1.g, r1Var.d);
                bundle9.putBooleanArray(r1.h, r1Var.e);
                bundle9.putBoolean(r1.i, r1Var.c);
                return bundle9;
            case 16:
                ca.a.b.getClass();
                return z9.c.a.a((e2) obj).getBytes(Charset.forName("UTF-8"));
            case 22:
                wa.e eVar = (wa.e) obj;
                eVar.getClass();
                aa.a aVar = com.google.firebase.messaging.q.a;
                aVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    aVar.j(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                return Integer.valueOf(((d2.b) obj).r);
        }
    }

    @Override // ch.d
    public int g(f6 f6Var, boolean z10) {
        switch (this.a) {
            case 24:
                return dh.c.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var), j6.v0(j6.Sd, f6Var));
            case 25:
                if (!LiteMode.isEnabled(256)) {
                    return j6.w0(null, j6.G8, false);
                }
                return j6.l1(z10 ? 0.85f : 0.825f, j6.w0(null, j6.G8, false));
            case 26:
                return dh.c.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var), j6.v0(j6.Zk, f6Var));
            case 27:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.Fi, f6Var));
            case 28:
                return 855638016;
            default:
                return TLObject.FLAG_30;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = p4.j0;
        return 0;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return num.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.a) {
            case 18:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }
}
