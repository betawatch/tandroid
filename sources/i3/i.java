package i3;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import g9.e2;
import h3.t0;
import ih.k1;
import j4.i1;
import j4.j1;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kh.q3;
import o8.l0;
import o8.x;
import o8.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.ou0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements NativeInstance.AudioLevelsCallback, nu0, ou0, b2, h3.f, t2.e, GenericProvider, Utilities.Callback2Return, lg.c {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i9) {
        this.a = i9;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo d(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public Constructor a() {
        switch (this.a) {
            case 20:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(m3.k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(m3.k.class).getConstructor(null);
        }
    }

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        k9.a.b.getClass();
        return h9.c.a.u((e2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // org.telegram.ui.Components.ou0
    public void b(Object obj, float f10) {
        k1 k1Var = (k1) obj;
        switch (this.a) {
            case 3:
                WindowManager.LayoutParams layoutParams = k1Var.c;
                k1Var.J = f10;
                layoutParams.x = (int) f10;
                AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = k1Var.c;
                k1Var.K = f10;
                layoutParams2.y = (int) f10;
                AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, layoutParams2);
                break;
        }
    }

    @Override // h3.f
    public h3.g c(Bundle bundle) {
        l0 s10;
        k4.a[] aVarArr;
        switch (this.a) {
            case 9:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(i1.f);
                if (parcelableArrayList == null) {
                    x xVar = z.b;
                    s10 = l0.e;
                } else {
                    s10 = d5.a.s(t0.F0, parcelableArrayList);
                }
                return new i1(bundle.getString(i1.h, ""), (t0[]) s10.toArray(new t0[0]));
            case 10:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(j1.e);
                return parcelableArrayList2 == null ? new j1(new i1[0]) : new j1((i1[]) d5.a.s(i1.n, parcelableArrayList2).toArray(new i1[0]));
            case 11:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(k4.b.n);
                if (parcelableArrayList3 == null) {
                    aVarArr = new k4.a[0];
                } else {
                    k4.a[] aVarArr2 = new k4.a[parcelableArrayList3.size()];
                    for (int i9 = 0; i9 < parcelableArrayList3.size(); i9++) {
                        aVarArr2[i9] = (k4.a) k4.a.C.c((Bundle) parcelableArrayList3.get(i9));
                    }
                    aVarArr = aVarArr2;
                }
                return new k4.b(aVarArr, bundle.getLong(k4.b.r, 0L), bundle.getLong(k4.b.s, -9223372036854775807L), bundle.getInt(k4.b.v, 0));
            default:
                long j10 = bundle.getLong(k4.a.r);
                int i10 = bundle.getInt(k4.a.s);
                int i11 = bundle.getInt(k4.a.B);
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
                return new k4.a(j10, i10, i11, iArr, uriArr, longArray, j11, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 6:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // lg.c
    public int g(b6 b6Var, boolean z10) {
        switch (this.a) {
            case 22:
                return mg.c.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, f6.v0(f6.d6, b6Var), f6.v0(f6.Sd, b6Var));
            case 23:
                if (!LiteMode.isEnabled(256)) {
                    return f6.w0(null, f6.G8, false);
                }
                return f6.l1(z10 ? 0.85f : 0.825f, f6.w0(null, f6.G8, false));
            case 24:
                return mg.c.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, f6.v0(f6.d6, b6Var), f6.v0(f6.Zk, b6Var));
            case 25:
                return f6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, f6.v0(f6.Fi, b6Var));
            case 26:
                return 855638016;
            case 27:
                return TLObject.FLAG_30;
            case 28:
                return f6.l1(0.075f, -16777216);
            default:
                return f6.l1(z10 ? 0.85f : 0.825f, f6.w0(null, f6.G8, false));
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public float get(Object obj) {
        k1 k1Var = (k1) obj;
        switch (this.a) {
            case 2:
                return k1Var.J;
            default:
                return k1Var.K;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = q3.f0;
        return 0;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
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
