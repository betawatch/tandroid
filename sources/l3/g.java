package l3;

import ag.j2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g {
    public static final g c = new g(8, new int[]{2});
    public static final g d = new g(8, new int[]{2, 5, 6});
    public static final q8.q0 e;
    public final int[] a;
    public final int b;

    static {
        j2 j2Var = new j2(4, 21);
        j2Var.l(5, 6);
        j2Var.l(17, 6);
        j2Var.l(7, 6);
        j2Var.l(18, 6);
        j2Var.l(6, 8);
        j2Var.l(8, 8);
        j2Var.l(14, 8);
        e = j2Var.c();
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
        Intent M = f5.d0.M(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i10 = f5.d0.a;
        if (i10 >= 17) {
            String str = f5.d0.c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return d;
            }
        }
        if (i10 >= 29 && (f5.d0.F(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return new g(8, f.a());
        }
        if (M == null || M.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return c;
        }
        return new g(M.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8), M.getIntArrayExtra("android.media.extra.ENCODINGS"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r1 > r9.b) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (r1 != 5) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair b(j3.t0 t0Var) {
        int intValue;
        int m10;
        String str = t0Var.B;
        str.getClass();
        int b10 = f5.o.b(str, t0Var.r);
        Integer valueOf = Integer.valueOf(b10);
        q8.q0 q0Var = e;
        if (q0Var.containsKey(valueOf)) {
            int[] iArr = this.a;
            int i10 = 6;
            if (b10 == 18 && Arrays.binarySearch(iArr, 18) < 0) {
                b10 = 6;
            } else if (b10 == 8 && Arrays.binarySearch(iArr, 8) < 0) {
                b10 = 7;
            }
            if (Arrays.binarySearch(iArr, b10) < 0) {
                return null;
            }
            int i11 = t0Var.O;
            if (i11 == -1 || b10 == 18) {
                int i12 = t0Var.P;
                if (i12 == -1) {
                    i12 = 48000;
                }
                if (f5.d0.a >= 29) {
                    intValue = f.b(b10, i12);
                } else {
                    Object obj = q0Var.get(Integer.valueOf(b10));
                    intValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
                i11 = intValue;
            }
            int i13 = f5.d0.a;
            if (i13 <= 28) {
                if (i11 == 7) {
                    i10 = 8;
                } else if (i11 != 3) {
                    if (i11 != 4) {
                    }
                }
                if (i13 <= 26 && "fugu".equals(f5.d0.b) && i10 == 1) {
                    i10 = 2;
                }
                m10 = f5.d0.m(i10);
                if (m10 != 0) {
                    return Pair.create(Integer.valueOf(b10), Integer.valueOf(m10));
                }
            }
            i10 = i11;
            if (i13 <= 26) {
                i10 = 2;
            }
            m10 = f5.d0.m(i10);
            if (m10 != 0) {
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
