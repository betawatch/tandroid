package j3;

import android.content.Context;
import android.os.Handler;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class l {
    public final Context a;
    public final h7.u b = new h7.u(4);
    public int c = 0;

    public l(Context context) {
        this.a = context;
    }

    public l3.k0 a(Context context) {
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s();
        sVar.a = context;
        sVar.b = l3.g.c;
        sVar.d = l3.l0.a;
        if (((androidx.biometric.e) sVar.c) == null) {
            sVar.c = new androidx.biometric.e(new l3.n[0]);
        }
        return new l3.k0(sVar);
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
    public final e[] b(Handler handler, c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        char c3;
        char c10;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        int i13 = this.c;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Context context = this.a;
        h7.u uVar = this.b;
        arrayList.add(new i5.j(context, uVar, handler, c0Var));
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
                    c10 = 2;
                    try {
                        i10 = i14 + 1;
                        try {
                            arrayList.add(i14, (e) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, c0.class, cls).newInstance(5000L, handler, c0Var, 50));
                            h5.a.v("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            i14 = i10;
                            i10 = i14;
                            Class<?> cls3 = Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer");
                            Class<?>[] clsArr = new Class[4];
                            clsArr[0] = cls2;
                            clsArr[1] = Handler.class;
                            clsArr[c10] = c0.class;
                            clsArr[3] = cls;
                            Constructor<?> constructor = cls3.getConstructor(clsArr);
                            Object[] objArr = new Object[4];
                            objArr[0] = 5000L;
                            objArr[1] = handler;
                            objArr[c10] = c0Var;
                            objArr[3] = 50;
                            arrayList.add(i10, (e) constructor.newInstance(objArr));
                            h5.a.v("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                            l3.k0 a2 = a(context);
                            i11 = this.c;
                            arrayList.add(new l3.n0(this.a, uVar, handler, c0Var2, a2));
                            if (i11 != 0) {
                            }
                            arrayList.add(new v4.l(c0Var3, handler.getLooper()));
                            arrayList.add(new e4.f(c0Var4, handler.getLooper()));
                            arrayList.add(new j5.a());
                            return (e[]) arrayList.toArray(new e[0]);
                        }
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (ClassNotFoundException unused3) {
                    c10 = 2;
                }
                try {
                    Class<?> cls32 = Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer");
                    Class<?>[] clsArr2 = new Class[4];
                    clsArr2[0] = cls2;
                    clsArr2[1] = Handler.class;
                    clsArr2[c10] = c0.class;
                    clsArr2[3] = cls;
                    Constructor<?> constructor2 = cls32.getConstructor(clsArr2);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = 5000L;
                    objArr2[1] = handler;
                    objArr2[c10] = c0Var;
                    objArr2[3] = 50;
                    arrayList.add(i10, (e) constructor2.newInstance(objArr2));
                    h5.a.v("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                } catch (Exception e6) {
                    throw new RuntimeException("Error instantiating AV1 extension", e6);
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating VP9 extension", e10);
            }
        }
        l3.k0 a22 = a(context);
        i11 = this.c;
        arrayList.add(new l3.n0(this.a, uVar, handler, c0Var2, a22));
        if (i11 != 0) {
            int size2 = arrayList.size();
            if (i11 == 2) {
                size2--;
            }
            try {
                try {
                    i12 = size2 + 1;
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating MIDI extension", e11);
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                try {
                    try {
                        arrayList.add(size2, (e) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                        h5.a.v("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused6) {
                        size2 = i12;
                        i12 = size2;
                        Class<?> cls4 = Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
                        Class<?>[] clsArr3 = new Class[3];
                        clsArr3[c3] = Handler.class;
                        clsArr3[1] = l3.q.class;
                        clsArr3[2] = l3.v.class;
                        Constructor<?> constructor3 = cls4.getConstructor(clsArr3);
                        Object[] objArr3 = new Object[3];
                        objArr3[c3] = handler;
                        objArr3[1] = c0Var2;
                        objArr3[2] = a22;
                        int i15 = i12 + 1;
                        arrayList.add(i12, (e) constructor3.newInstance(objArr3));
                        h5.a.v("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        Class<?> cls5 = Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
                        Class<?>[] clsArr4 = new Class[3];
                        clsArr4[c3] = Handler.class;
                        clsArr4[1] = l3.q.class;
                        clsArr4[2] = l3.v.class;
                        Constructor<?> constructor4 = cls5.getConstructor(clsArr4);
                        Object[] objArr4 = new Object[3];
                        objArr4[c3] = handler;
                        objArr4[1] = c0Var2;
                        objArr4[2] = a22;
                        int i16 = i15 + 1;
                        arrayList.add(i15, (e) constructor4.newInstance(objArr4));
                        h5.a.v("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        Class[] clsArr5 = new Class[3];
                        clsArr5[c3] = Handler.class;
                        clsArr5[1] = l3.q.class;
                        clsArr5[2] = l3.v.class;
                        Constructor constructor5 = com.google.android.exoplayer2.ext.ffmpeg.b.class.getConstructor(clsArr5);
                        Object[] objArr5 = new Object[3];
                        objArr5[c3] = handler;
                        objArr5[1] = c0Var2;
                        objArr5[2] = a22;
                        arrayList.add(i16, (e) constructor5.newInstance(objArr5));
                        h5.a.v("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        arrayList.add(new v4.l(c0Var3, handler.getLooper()));
                        arrayList.add(new e4.f(c0Var4, handler.getLooper()));
                        arrayList.add(new j5.a());
                        return (e[]) arrayList.toArray(new e[0]);
                    }
                    Class<?> cls52 = Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
                    Class<?>[] clsArr42 = new Class[3];
                    clsArr42[c3] = Handler.class;
                    clsArr42[1] = l3.q.class;
                    clsArr42[2] = l3.v.class;
                    Constructor<?> constructor42 = cls52.getConstructor(clsArr42);
                    Object[] objArr42 = new Object[3];
                    objArr42[c3] = handler;
                    objArr42[1] = c0Var2;
                    objArr42[2] = a22;
                    int i162 = i15 + 1;
                    arrayList.add(i15, (e) constructor42.newInstance(objArr42));
                    h5.a.v("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    try {
                        Class[] clsArr52 = new Class[3];
                        clsArr52[c3] = Handler.class;
                        clsArr52[1] = l3.q.class;
                        clsArr52[2] = l3.v.class;
                        Constructor constructor52 = com.google.android.exoplayer2.ext.ffmpeg.b.class.getConstructor(clsArr52);
                        Object[] objArr52 = new Object[3];
                        objArr52[c3] = handler;
                        objArr52[1] = c0Var2;
                        objArr52[2] = a22;
                        arrayList.add(i162, (e) constructor52.newInstance(objArr52));
                        h5.a.v("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                    } catch (Exception e12) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e12);
                    }
                } catch (Exception e13) {
                    throw new RuntimeException("Error instantiating FLAC extension", e13);
                }
                Class<?> cls42 = Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
                Class<?>[] clsArr32 = new Class[3];
                clsArr32[c3] = Handler.class;
                clsArr32[1] = l3.q.class;
                clsArr32[2] = l3.v.class;
                Constructor<?> constructor32 = cls42.getConstructor(clsArr32);
                Object[] objArr32 = new Object[3];
                objArr32[c3] = handler;
                objArr32[1] = c0Var2;
                objArr32[2] = a22;
                int i152 = i12 + 1;
                arrayList.add(i12, (e) constructor32.newInstance(objArr32));
                h5.a.v("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            } catch (Exception e14) {
                throw new RuntimeException("Error instantiating Opus extension", e14);
            }
        }
        arrayList.add(new v4.l(c0Var3, handler.getLooper()));
        arrayList.add(new e4.f(c0Var4, handler.getLooper()));
        arrayList.add(new j5.a());
        return (e[]) arrayList.toArray(new e[0]);
    }
}
