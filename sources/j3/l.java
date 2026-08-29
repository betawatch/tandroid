package j3;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class l {
    public final Context a;
    public final ab.b b = new ab.b(1);
    public int c = 0;

    public l(Context context) {
        this.a = context;
    }

    public l3.k0 a(Context context) {
        androidx.biometric.e eVar = new androidx.biometric.e(29);
        l3.g a2 = l3.g.a(context);
        a2.getClass();
        eVar.b = a2;
        return eVar.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:12|13)|15|16|17|18|19|21|22|23|24|25|(2:27|28)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:6|(1:8)|9|10|11|(2:12|13)|15|16|17|18|19|21|22|23|24|25|(2:27|28)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(7:(2:12|13)|21|22|23|24|25|(2:27|28))|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:12|13)|21|22|23|24|25|(2:27|28)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0181, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x018b, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0146, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0150, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00e4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e[] b(Handler handler, h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4) {
        char c3;
        char c6;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        int i13 = this.c;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Context context = this.a;
        ab.b bVar = this.b;
        arrayList.add(new g5.j(context, bVar, handler, h0Var));
        if (i13 == 0) {
            c3 = 0;
        } else {
            int size = arrayList.size();
            if (i13 == 2) {
                size--;
            }
            int i14 = size;
            c3 = 0;
            try {
                try {
                    c6 = 2;
                    try {
                        i10 = i14 + 1;
                        try {
                            arrayList.add(i14, (e) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, h0.class, cls).newInstance(5000L, handler, h0Var, 50));
                            f5.a.v("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            i14 = i10;
                            i10 = i14;
                            Class<?> cls3 = Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer");
                            Class<?>[] clsArr = new Class[4];
                            clsArr[0] = cls2;
                            clsArr[1] = Handler.class;
                            clsArr[c6] = h0.class;
                            clsArr[3] = cls;
                            Constructor<?> constructor = cls3.getConstructor(clsArr);
                            Object[] objArr = new Object[4];
                            objArr[0] = 5000L;
                            objArr[1] = handler;
                            objArr[c6] = h0Var;
                            objArr[3] = 50;
                            arrayList.add(i10, (e) constructor.newInstance(objArr));
                            f5.a.v("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                            l3.k0 a2 = a(context);
                            i11 = this.c;
                            arrayList.add(new l3.o0(this.a, bVar, handler, h0Var2, a2));
                            if (i11 != 0) {
                            }
                            arrayList.add(new t4.l(h0Var3, handler.getLooper()));
                            arrayList.add(new b4.f(h0Var4, handler.getLooper()));
                            arrayList.add(new h5.a());
                            return (e[]) arrayList.toArray(new e[0]);
                        }
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (ClassNotFoundException unused3) {
                    c6 = 2;
                }
                try {
                    Class<?> cls32 = Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer");
                    Class<?>[] clsArr2 = new Class[4];
                    clsArr2[0] = cls2;
                    clsArr2[1] = Handler.class;
                    clsArr2[c6] = h0.class;
                    clsArr2[3] = cls;
                    Constructor<?> constructor2 = cls32.getConstructor(clsArr2);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = 5000L;
                    objArr2[1] = handler;
                    objArr2[c6] = h0Var;
                    objArr2[3] = 50;
                    arrayList.add(i10, (e) constructor2.newInstance(objArr2));
                    f5.a.v("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating AV1 extension", e10);
                }
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating VP9 extension", e11);
            }
        }
        l3.k0 a22 = a(context);
        i11 = this.c;
        arrayList.add(new l3.o0(this.a, bVar, handler, h0Var2, a22));
        if (i11 != 0) {
            int size2 = arrayList.size();
            if (i11 == 2) {
                size2--;
            }
            try {
                try {
                    i12 = size2 + 1;
                } catch (Exception e12) {
                    throw new RuntimeException("Error instantiating MIDI extension", e12);
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                try {
                    try {
                        arrayList.add(size2, (e) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                        f5.a.v("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused6) {
                        size2 = i12;
                        i12 = size2;
                        Class<?> cls4 = Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
                        Class<?>[] clsArr3 = new Class[3];
                        clsArr3[c3] = Handler.class;
                        clsArr3[1] = l3.o.class;
                        clsArr3[2] = l3.t.class;
                        Constructor<?> constructor3 = cls4.getConstructor(clsArr3);
                        Object[] objArr3 = new Object[3];
                        objArr3[c3] = handler;
                        objArr3[1] = h0Var2;
                        objArr3[2] = a22;
                        int i15 = i12 + 1;
                        arrayList.add(i12, (e) constructor3.newInstance(objArr3));
                        f5.a.v("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        Class<?> cls5 = Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
                        Class<?>[] clsArr4 = new Class[3];
                        clsArr4[c3] = Handler.class;
                        clsArr4[1] = l3.o.class;
                        clsArr4[2] = l3.t.class;
                        Constructor<?> constructor4 = cls5.getConstructor(clsArr4);
                        Object[] objArr4 = new Object[3];
                        objArr4[c3] = handler;
                        objArr4[1] = h0Var2;
                        objArr4[2] = a22;
                        int i16 = i15 + 1;
                        arrayList.add(i15, (e) constructor4.newInstance(objArr4));
                        f5.a.v("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        Class[] clsArr5 = new Class[3];
                        clsArr5[c3] = Handler.class;
                        clsArr5[1] = l3.o.class;
                        clsArr5[2] = l3.t.class;
                        Constructor constructor5 = FfmpegAudioRenderer.class.getConstructor(clsArr5);
                        Object[] objArr5 = new Object[3];
                        objArr5[c3] = handler;
                        objArr5[1] = h0Var2;
                        objArr5[2] = a22;
                        arrayList.add(i16, (e) constructor5.newInstance(objArr5));
                        f5.a.v("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        arrayList.add(new t4.l(h0Var3, handler.getLooper()));
                        arrayList.add(new b4.f(h0Var4, handler.getLooper()));
                        arrayList.add(new h5.a());
                        return (e[]) arrayList.toArray(new e[0]);
                    }
                    Class<?> cls52 = Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
                    Class<?>[] clsArr42 = new Class[3];
                    clsArr42[c3] = Handler.class;
                    clsArr42[1] = l3.o.class;
                    clsArr42[2] = l3.t.class;
                    Constructor<?> constructor42 = cls52.getConstructor(clsArr42);
                    Object[] objArr42 = new Object[3];
                    objArr42[c3] = handler;
                    objArr42[1] = h0Var2;
                    objArr42[2] = a22;
                    int i162 = i15 + 1;
                    arrayList.add(i15, (e) constructor42.newInstance(objArr42));
                    f5.a.v("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    try {
                        Class[] clsArr52 = new Class[3];
                        clsArr52[c3] = Handler.class;
                        clsArr52[1] = l3.o.class;
                        clsArr52[2] = l3.t.class;
                        Constructor constructor52 = FfmpegAudioRenderer.class.getConstructor(clsArr52);
                        Object[] objArr52 = new Object[3];
                        objArr52[c3] = handler;
                        objArr52[1] = h0Var2;
                        objArr52[2] = a22;
                        arrayList.add(i162, (e) constructor52.newInstance(objArr52));
                        f5.a.v("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                    } catch (Exception e13) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e13);
                    }
                } catch (Exception e14) {
                    throw new RuntimeException("Error instantiating FLAC extension", e14);
                }
                Class<?> cls42 = Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
                Class<?>[] clsArr32 = new Class[3];
                clsArr32[c3] = Handler.class;
                clsArr32[1] = l3.o.class;
                clsArr32[2] = l3.t.class;
                Constructor<?> constructor32 = cls42.getConstructor(clsArr32);
                Object[] objArr32 = new Object[3];
                objArr32[c3] = handler;
                objArr32[1] = h0Var2;
                objArr32[2] = a22;
                int i152 = i12 + 1;
                arrayList.add(i12, (e) constructor32.newInstance(objArr32));
                f5.a.v("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            } catch (Exception e15) {
                throw new RuntimeException("Error instantiating Opus extension", e15);
            }
        }
        arrayList.add(new t4.l(h0Var3, handler.getLooper()));
        arrayList.add(new b4.f(h0Var4, handler.getLooper()));
        arrayList.add(new h5.a());
        return (e[]) arrayList.toArray(new e[0]);
    }
}
