package h3;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class l {
    public final Context a;
    public final v9.d b = new v9.d(26);
    public int c = 0;

    public l(Context context) {
        this.a = context;
    }

    public j3.i0 a(Context context) {
        a5.m mVar = new a5.m(28);
        j3.g a2 = j3.g.a(context);
        a2.getClass();
        mVar.b = a2;
        return mVar.d();
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
        char c10;
        char c11;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = this.c;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Context context = this.a;
        v9.d dVar = this.b;
        arrayList.add(new e5.j(context, dVar, handler, h0Var));
        if (i12 == 0) {
            c10 = 0;
        } else {
            int size = arrayList.size();
            if (i12 == 2) {
                size--;
            }
            int i13 = size;
            c10 = 0;
            try {
                try {
                    c11 = 2;
                    try {
                        i9 = i13 + 1;
                        try {
                            arrayList.add(i13, (e) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, h0.class, cls).newInstance(5000L, handler, h0Var, 50));
                            d5.a.v("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            i13 = i9;
                            i9 = i13;
                            Class<?> cls3 = Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer");
                            Class<?>[] clsArr = new Class[4];
                            clsArr[0] = cls2;
                            clsArr[1] = Handler.class;
                            clsArr[c11] = h0.class;
                            clsArr[3] = cls;
                            Constructor<?> constructor = cls3.getConstructor(clsArr);
                            Object[] objArr = new Object[4];
                            objArr[0] = 5000L;
                            objArr[1] = handler;
                            objArr[c11] = h0Var;
                            objArr[3] = 50;
                            arrayList.add(i9, (e) constructor.newInstance(objArr));
                            d5.a.v("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                            j3.i0 a2 = a(context);
                            i10 = this.c;
                            arrayList.add(new j3.m0(this.a, dVar, handler, h0Var2, a2));
                            if (i10 != 0) {
                            }
                            arrayList.add(new r4.l(h0Var3, handler.getLooper()));
                            arrayList.add(new z3.f(h0Var4, handler.getLooper()));
                            arrayList.add(new f5.a());
                            return (e[]) arrayList.toArray(new e[0]);
                        }
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (ClassNotFoundException unused3) {
                    c11 = 2;
                }
                try {
                    Class<?> cls32 = Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer");
                    Class<?>[] clsArr2 = new Class[4];
                    clsArr2[0] = cls2;
                    clsArr2[1] = Handler.class;
                    clsArr2[c11] = h0.class;
                    clsArr2[3] = cls;
                    Constructor<?> constructor2 = cls32.getConstructor(clsArr2);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = 5000L;
                    objArr2[1] = handler;
                    objArr2[c11] = h0Var;
                    objArr2[3] = 50;
                    arrayList.add(i9, (e) constructor2.newInstance(objArr2));
                    d5.a.v("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating AV1 extension", e10);
                }
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating VP9 extension", e11);
            }
        }
        j3.i0 a22 = a(context);
        i10 = this.c;
        arrayList.add(new j3.m0(this.a, dVar, handler, h0Var2, a22));
        if (i10 != 0) {
            int size2 = arrayList.size();
            if (i10 == 2) {
                size2--;
            }
            try {
                try {
                    i11 = size2 + 1;
                } catch (Exception e12) {
                    throw new RuntimeException("Error instantiating MIDI extension", e12);
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                try {
                    try {
                        arrayList.add(size2, (e) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                        d5.a.v("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused6) {
                        size2 = i11;
                        i11 = size2;
                        Class<?> cls4 = Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
                        Class<?>[] clsArr3 = new Class[3];
                        clsArr3[c10] = Handler.class;
                        clsArr3[1] = j3.n.class;
                        clsArr3[2] = j3.s.class;
                        Constructor<?> constructor3 = cls4.getConstructor(clsArr3);
                        Object[] objArr3 = new Object[3];
                        objArr3[c10] = handler;
                        objArr3[1] = h0Var2;
                        objArr3[2] = a22;
                        int i14 = i11 + 1;
                        arrayList.add(i11, (e) constructor3.newInstance(objArr3));
                        d5.a.v("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        Class<?> cls5 = Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
                        Class<?>[] clsArr4 = new Class[3];
                        clsArr4[c10] = Handler.class;
                        clsArr4[1] = j3.n.class;
                        clsArr4[2] = j3.s.class;
                        Constructor<?> constructor4 = cls5.getConstructor(clsArr4);
                        Object[] objArr4 = new Object[3];
                        objArr4[c10] = handler;
                        objArr4[1] = h0Var2;
                        objArr4[2] = a22;
                        int i15 = i14 + 1;
                        arrayList.add(i14, (e) constructor4.newInstance(objArr4));
                        d5.a.v("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        Class[] clsArr5 = new Class[3];
                        clsArr5[c10] = Handler.class;
                        clsArr5[1] = j3.n.class;
                        clsArr5[2] = j3.s.class;
                        Constructor constructor5 = FfmpegAudioRenderer.class.getConstructor(clsArr5);
                        Object[] objArr5 = new Object[3];
                        objArr5[c10] = handler;
                        objArr5[1] = h0Var2;
                        objArr5[2] = a22;
                        arrayList.add(i15, (e) constructor5.newInstance(objArr5));
                        d5.a.v("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        arrayList.add(new r4.l(h0Var3, handler.getLooper()));
                        arrayList.add(new z3.f(h0Var4, handler.getLooper()));
                        arrayList.add(new f5.a());
                        return (e[]) arrayList.toArray(new e[0]);
                    }
                    Class<?> cls52 = Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
                    Class<?>[] clsArr42 = new Class[3];
                    clsArr42[c10] = Handler.class;
                    clsArr42[1] = j3.n.class;
                    clsArr42[2] = j3.s.class;
                    Constructor<?> constructor42 = cls52.getConstructor(clsArr42);
                    Object[] objArr42 = new Object[3];
                    objArr42[c10] = handler;
                    objArr42[1] = h0Var2;
                    objArr42[2] = a22;
                    int i152 = i14 + 1;
                    arrayList.add(i14, (e) constructor42.newInstance(objArr42));
                    d5.a.v("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    try {
                        Class[] clsArr52 = new Class[3];
                        clsArr52[c10] = Handler.class;
                        clsArr52[1] = j3.n.class;
                        clsArr52[2] = j3.s.class;
                        Constructor constructor52 = FfmpegAudioRenderer.class.getConstructor(clsArr52);
                        Object[] objArr52 = new Object[3];
                        objArr52[c10] = handler;
                        objArr52[1] = h0Var2;
                        objArr52[2] = a22;
                        arrayList.add(i152, (e) constructor52.newInstance(objArr52));
                        d5.a.v("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                    } catch (Exception e13) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e13);
                    }
                } catch (Exception e14) {
                    throw new RuntimeException("Error instantiating FLAC extension", e14);
                }
                Class<?> cls42 = Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
                Class<?>[] clsArr32 = new Class[3];
                clsArr32[c10] = Handler.class;
                clsArr32[1] = j3.n.class;
                clsArr32[2] = j3.s.class;
                Constructor<?> constructor32 = cls42.getConstructor(clsArr32);
                Object[] objArr32 = new Object[3];
                objArr32[c10] = handler;
                objArr32[1] = h0Var2;
                objArr32[2] = a22;
                int i142 = i11 + 1;
                arrayList.add(i11, (e) constructor32.newInstance(objArr32));
                d5.a.v("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            } catch (Exception e15) {
                throw new RuntimeException("Error instantiating Opus extension", e15);
            }
        }
        arrayList.add(new r4.l(h0Var3, handler.getLooper()));
        arrayList.add(new z3.f(h0Var4, handler.getLooper()));
        arrayList.add(new f5.a());
        return (e[]) arrayList.toArray(new e[0]);
    }
}
