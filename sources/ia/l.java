package ia;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import h9.e2;
import j4.i1;
import j4.j1;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import lh.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.ru0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements z8.d, h3.f, NativeInstance.AudioLevelsCallback, qu0, ru0, a2, t2.e, GenericProvider, Utilities.Callback2Return, mg.c {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo d(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    @Override // h3.f
    public h3.g a(Bundle bundle) {
        p8.l0 s10;
        k4.a[] aVarArr;
        switch (this.a) {
            case 8:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(i1.f);
                if (parcelableArrayList == null) {
                    p8.x xVar = p8.z.b;
                    s10 = p8.l0.e;
                } else {
                    s10 = d5.a.s(h3.t0.F0, parcelableArrayList);
                }
                return new i1(bundle.getString(i1.h, ""), (h3.t0[]) s10.toArray(new h3.t0[0]));
            case 9:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(j1.e);
                return parcelableArrayList2 == null ? new j1(new i1[0]) : new j1((i1[]) d5.a.s(i1.n, parcelableArrayList2).toArray(new i1[0]));
            case 17:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(k4.b.n);
                if (parcelableArrayList3 == null) {
                    aVarArr = new k4.a[0];
                } else {
                    k4.a[] aVarArr2 = new k4.a[parcelableArrayList3.size()];
                    for (int i10 = 0; i10 < parcelableArrayList3.size(); i10++) {
                        aVarArr2[i10] = (k4.a) k4.a.C.a((Bundle) parcelableArrayList3.get(i10));
                    }
                    aVarArr = aVarArr2;
                }
                return new k4.b(aVarArr, bundle.getLong(k4.b.r, 0L), bundle.getLong(k4.b.s, -9223372036854775807L), bundle.getInt(k4.b.v, 0));
            default:
                long j10 = bundle.getLong(k4.a.r);
                int i11 = bundle.getInt(k4.a.s);
                int i12 = bundle.getInt(k4.a.B);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(k4.a.v);
                int[] intArray = bundle.getIntArray(k4.a.w);
                long[] longArray = bundle.getLongArray(k4.a.x);
                long j11 = bundle.getLong(k4.a.y);
                boolean z10 = bundle.getBoolean(k4.a.A);
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                Uri[] uriArr = parcelableArrayList4 == null ? new Uri[0] : (Uri[]) parcelableArrayList4.toArray(new Uri[0]);
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new k4.a(j10, i11, i12, iArr, uriArr, longArray, j11, z10);
        }
    }

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        l9.a.b.getClass();
        return i9.a.a.h((e2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // org.telegram.ui.Components.ru0
    public void b(Object obj, float f10) {
        jh.i1 i1Var = (jh.i1) obj;
        switch (this.a) {
            case 12:
                WindowManager.LayoutParams layoutParams = i1Var.c;
                i1Var.J = f10;
                layoutParams.x = (int) f10;
                AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = i1Var.c;
                i1Var.K = f10;
                layoutParams2.y = (int) f10;
                AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, layoutParams2);
                break;
        }
    }

    public Constructor c() {
        switch (this.a) {
            case 26:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(m3.k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(m3.k.class).getConstructor(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 15:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qu0
    public float get(Object obj) {
        jh.i1 i1Var = (jh.i1) obj;
        switch (this.a) {
            case 11:
                return i1Var.J;
            default:
                return i1Var.K;
        }
    }

    @Override // mg.c
    public int i(c6 c6Var, boolean z10) {
        return ng.c.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.d6, c6Var), g6.v0(g6.Sd, c6Var));
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = p3.f0;
        return 0;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override // z8.d
    public Object u0(af.h hVar) {
        n nVar;
        n0 n0Var;
        h0 h0Var;
        ka.h hVar2;
        u uVar;
        r0 r0Var;
        switch (this.a) {
            case 1:
                nVar = FirebaseSessionsRegistrar.getComponents$lambda-0(hVar);
                return nVar;
            case 2:
                n0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(hVar);
                return n0Var;
            case 3:
                h0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(hVar);
                return h0Var;
            case 4:
                hVar2 = FirebaseSessionsRegistrar.getComponents$lambda-3(hVar);
                return hVar2;
            case 5:
                uVar = FirebaseSessionsRegistrar.getComponents$lambda-4(hVar);
                return uVar;
            default:
                r0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(hVar);
                return r0Var;
        }
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
