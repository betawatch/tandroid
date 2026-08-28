package j3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g {
    public static final g c = new g(8, new int[]{2});
    public static final g d = new g(8, new int[]{2, 5, 6});
    public static final o8.q0 e;
    public final int[] a;
    public final int b;

    static {
        a6.a aVar = new a6.a(4, 17);
        aVar.j(5, 6);
        aVar.j(17, 6);
        aVar.j(7, 6);
        aVar.j(18, 6);
        aVar.j(6, 8);
        aVar.j(8, 8);
        aVar.j(14, 8);
        e = aVar.c();
    }

    public g(int i9, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i9;
    }

    public static g a(Context context) {
        Intent M = d5.f0.M(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i9 = d5.f0.a;
        if (i9 >= 17) {
            String str = d5.f0.c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return d;
            }
        }
        if (i9 >= 29 && (d5.f0.F(context) || (i9 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
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
    public final Pair b(h3.t0 t0Var) {
        int intValue;
        int m10;
        String str = t0Var.B;
        str.getClass();
        int b10 = d5.q.b(str, t0Var.r);
        Integer valueOf = Integer.valueOf(b10);
        o8.q0 q0Var = e;
        if (q0Var.containsKey(valueOf)) {
            int[] iArr = this.a;
            int i9 = 6;
            if (b10 == 18 && Arrays.binarySearch(iArr, 18) < 0) {
                b10 = 6;
            } else if (b10 == 8 && Arrays.binarySearch(iArr, 8) < 0) {
                b10 = 7;
            }
            if (Arrays.binarySearch(iArr, b10) < 0) {
                return null;
            }
            int i10 = t0Var.O;
            if (i10 == -1 || b10 == 18) {
                int i11 = t0Var.P;
                if (i11 == -1) {
                    i11 = 48000;
                }
                if (d5.f0.a >= 29) {
                    intValue = f.b(b10, i11);
                } else {
                    Object obj = q0Var.get(Integer.valueOf(b10));
                    intValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
                i10 = intValue;
            }
            int i12 = d5.f0.a;
            if (i12 <= 28) {
                if (i10 == 7) {
                    i9 = 8;
                } else if (i10 != 3) {
                    if (i10 != 4) {
                    }
                }
                if (i12 <= 26 && "fugu".equals(d5.f0.b) && i9 == 1) {
                    i9 = 2;
                }
                m10 = d5.f0.m(i9);
                if (m10 != 0) {
                    return Pair.create(Integer.valueOf(b10), Integer.valueOf(m10));
                }
            }
            i9 = i10;
            if (i12 <= 26) {
                i9 = 2;
            }
            m10 = d5.f0.m(i9);
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
