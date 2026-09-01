package l3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k7.y7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g {
    public static final g c = new g(10, new int[]{2});
    public static final s8.i0 d;
    public static final s8.n0 e;
    public final int[] a;
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        s8.l.b(3, objArr);
        d = s8.v.s(3, objArr);
        b4.e0 e0Var = new b4.e0(4, 22);
        e0Var.x(5, 6);
        e0Var.x(17, 6);
        e0Var.x(7, 6);
        e0Var.x(30, 10);
        e0Var.x(18, 6);
        e0Var.x(6, 8);
        e0Var.x(8, 8);
        e0Var.x(14, 8);
        e = e0Var.d();
    }

    public g(int i10, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i10;
    }

    public static g a(Context context) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public static g b(Context context, Intent intent) {
        int i10 = h5.d0.a;
        if (i10 < 23 || !e.b(context)) {
            s8.y yVar = new s8.y();
            if (i10 >= 17) {
                String str = h5.d0.c;
                if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                    s8.i0 i0Var = d;
                    i0Var.getClass();
                    yVar.d(i0Var);
                }
            }
            if (i10 >= 29 && (h5.d0.F(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
                s8.v a2 = f.a();
                a2.getClass();
                yVar.d(a2);
                return new g(10, y7.d(yVar.i()));
            }
            if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    List aVar = intArrayExtra.length == 0 ? Collections.EMPTY_LIST : new u8.a(0, intArrayExtra.length, intArrayExtra);
                    aVar.getClass();
                    yVar.d(aVar);
                }
                return new g(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), y7.d(yVar.i()));
            }
            s8.z i11 = yVar.i();
            if (!i11.isEmpty()) {
                return new g(10, y7.d(i11));
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (r1 != 5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(j3.n0 n0Var) {
        int intValue;
        int n10;
        String str = n0Var.C;
        str.getClass();
        int b10 = h5.o.b(str, n0Var.r);
        Integer valueOf = Integer.valueOf(b10);
        s8.n0 n0Var2 = e;
        if (n0Var2.containsKey(valueOf)) {
            int[] iArr = this.a;
            int i10 = 6;
            if (b10 == 18 && Arrays.binarySearch(iArr, 18) < 0) {
                b10 = 6;
            } else if ((b10 == 8 && Arrays.binarySearch(iArr, 8) < 0) || (b10 == 30 && Arrays.binarySearch(iArr, 30) < 0)) {
                b10 = 7;
            }
            if (Arrays.binarySearch(iArr, b10) < 0) {
                return null;
            }
            int i11 = n0Var.P;
            if (i11 == -1 || b10 == 18) {
                int i12 = n0Var.Q;
                if (i12 == -1) {
                    i12 = 48000;
                }
                if (h5.d0.a >= 29) {
                    intValue = f.b(b10, i12);
                } else {
                    Object obj = n0Var2.get(Integer.valueOf(b10));
                    intValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
                i11 = intValue;
            } else if (!n0Var.C.equals("audio/vnd.dts.uhd;profile=p2")) {
            }
            int i13 = h5.d0.a;
            if (i13 <= 28) {
                if (i11 == 7) {
                    i10 = 8;
                } else if (i11 != 3) {
                    if (i11 != 4) {
                    }
                }
                if (i13 <= 26 && "fugu".equals(h5.d0.b) && i10 == 1) {
                    i10 = 2;
                }
                n10 = h5.d0.n(i10);
                if (n10 != 0) {
                    return Pair.create(Integer.valueOf(b10), Integer.valueOf(n10));
                }
            }
            i10 = i11;
            if (i13 <= 26) {
                i10 = 2;
            }
            n10 = h5.d0.n(i10);
            if (n10 != 0) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Arrays.equals(this.a, gVar.a) && this.b == gVar.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + "]";
    }
}
