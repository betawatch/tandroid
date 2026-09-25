package ai;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sv0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements NativeInstance.AudioLevelsCallback, rv0, sv0, org.telegram.ui.ActionBar.z1, d9.e, i5.e, GenericProvider, Utilities.Callback2Return, Continuation, q9.d {
    public final /* synthetic */ int a;

    public /* synthetic */ w1(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    public Constructor a() {
        switch (this.a) {
            case 18:
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
        e9.a1 i10;
        e9.a1 j3;
        int i11 = 0;
        switch (this.a) {
            case 10:
                b2.w wVar = (b2.w) obj;
                return wVar.a + ": " + wVar.b;
            case 11:
                b2.e1 e1Var = (b2.e1) obj;
                e1Var.getClass();
                Bundle bundle = new Bundle();
                int i12 = e1Var.a;
                if (i12 != 0) {
                    bundle.putInt(b2.e1.d, i12);
                }
                int i13 = e1Var.b;
                if (i13 != 0) {
                    bundle.putInt(b2.e1.e, i13);
                }
                int i14 = e1Var.c;
                if (i14 != 0) {
                    bundle.putInt(b2.e1.f, i14);
                }
                return bundle;
            case 12:
                b2.j0 j0Var = (b2.j0) obj;
                j0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(b2.j0.h, j0Var.a);
                String str = j0Var.b;
                if (str != null) {
                    bundle2.putString(b2.j0.i, str);
                }
                String str2 = j0Var.c;
                if (str2 != null) {
                    bundle2.putString(b2.j0.j, str2);
                }
                int i15 = j0Var.d;
                if (i15 != 0) {
                    bundle2.putInt(b2.j0.k, i15);
                }
                int i16 = j0Var.e;
                if (i16 != 0) {
                    bundle2.putInt(b2.j0.l, i16);
                }
                String str3 = j0Var.f;
                if (str3 != null) {
                    bundle2.putString(b2.j0.m, str3);
                }
                String str4 = j0Var.g;
                if (str4 != null) {
                    bundle2.putString(b2.j0.n, str4);
                }
                return bundle2;
            case 13:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(b2.j0.h);
                uri.getClass();
                String string = bundle3.getString(b2.j0.i);
                String string2 = bundle3.getString(b2.j0.j);
                int i17 = bundle3.getInt(b2.j0.k, 0);
                int i18 = bundle3.getInt(b2.j0.l, 0);
                String string3 = bundle3.getString(b2.j0.m);
                String string4 = bundle3.getString(b2.j0.n);
                b2.i0 i0Var = new b2.i0();
                i0Var.c = uri;
                i0Var.d = b2.r0.n(string);
                i0Var.e = string2;
                i0Var.a = i17;
                i0Var.b = i18;
                i0Var.f = string3;
                i0Var.g = string4;
                return new b2.j0(i0Var);
            case 14:
                Bundle bundle4 = (Bundle) obj;
                b2.s sVar = b2.s.U;
                b2.r rVar = new b2.r();
                if (bundle4 != null) {
                    ClassLoader classLoader = e2.d.class.getClassLoader();
                    String str5 = e2.d0.a;
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
                    i10 = e9.a1.e;
                } else {
                    e9.f0 u10 = e9.i0.u();
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
                rVar.p = b2.r0.n(string11);
                String string12 = bundle4.getString(b2.s.e0);
                String str11 = sVar.r;
                if (string12 == null) {
                    string12 = str11;
                }
                rVar.q = b2.r0.n(string12);
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
            case 15:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(b2.m1.c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(b2.l1.f);
                if (parcelableArrayList2 == null) {
                    e9.g0 g0Var = e9.i0.b;
                    j3 = e9.a1.e;
                } else {
                    j3 = e2.d.j(new w1(14), parcelableArrayList2);
                }
                b2.l1 l1Var = new b2.l1(bundle8.getString(b2.l1.g, ""), (b2.s[]) j3.toArray(new b2.s[0]));
                int[] intArray = bundle7.getIntArray(b2.m1.d);
                intArray.getClass();
                return new b2.m1(l1Var, v7.z7.a(intArray));
            case 16:
                b2.r1 r1Var = (b2.r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(b2.r1.f, r1Var.b.c());
                bundle9.putIntArray(b2.r1.g, r1Var.d);
                bundle9.putBooleanArray(b2.r1.h, r1Var.e);
                bundle9.putBoolean(b2.r1.i, r1Var.c);
                return bundle9;
            case 17:
            case 18:
            case 19:
            default:
                wa.e eVar = (wa.e) obj;
                eVar.getClass();
                la.h hVar = com.google.firebase.messaging.r.a;
                hVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    hVar.y(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 20:
                ca.a.b.getClass();
                return z9.a.a.J((y9.e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public void b(Object obj, float f7) {
        m2 m2Var = (m2) obj;
        switch (this.a) {
            case 2:
                WindowManager.LayoutParams layoutParams = m2Var.c;
                m2Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(m2Var.b, m2Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = m2Var.c;
                m2Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(m2Var.b, m2Var.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 5:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rv0
    public float get(Object obj) {
        m2 m2Var = (m2) obj;
        switch (this.a) {
            case 1:
                return m2Var.N;
            default:
                return m2Var.O;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = ci.w3.j0;
        return 0;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.a) {
            case 25:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return num.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }
}
