// default package

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class hd3 {
    public final Context a;
    public final uk0 b;
    public boolean c = false;

    public hd3(Context context) {
        this.a = context;
        this.b = new uk0(context, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:10|11)|12|13|14|(12:(2:15|16)|23|24|25|26|27|28|29|30|31|32|(3:34|35|37))|17|18|19|20|21) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:75|76|12|13|14|15|16|17|18|19|20|21|23|24|25|(2:26|27)|28|29|30|31|32|34|35|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:3|(1:5)|6|7|8|9|10|11|12|13|14|(2:15|16)|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|(3:34|35|37)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:10|11)|(12:(2:15|16)|23|24|25|26|27|28|29|30|31|32|(3:34|35|37))|17|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014a, code lost:
    
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0154, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d1, code lost:
    
        r9 = r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Context context, int i, x40 x40Var, Handler handler, c74 c74Var, ArrayList arrayList) {
        int i2;
        int i3;
        int i4;
        int i5;
        arrayList.add(new im6(context, this.b, handler, c74Var, x40Var));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                try {
                    try {
                        arrayList.add(size, (uh0) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, o40.class, x40.class).newInstance(context, handler, c74Var, x40Var));
                        ncd.e("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused2) {
                        size = i2;
                        i2 = size;
                        i3 = i2 + 1;
                        arrayList.add(i2, (uh0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                        ncd.e("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        i4 = i3 + 1;
                        arrayList.add(i3, (uh0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                        ncd.e("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        try {
                            i5 = i4 + 1;
                        } catch (ClassNotFoundException unused3) {
                        }
                        try {
                            try {
                                arrayList.add(i4, (uh0) FfmpegAudioRenderer.class.getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                                ncd.e("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused4) {
                                i4 = i5;
                                i5 = i4;
                                Class<?> cls = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                Object newInstance = cls.getConstructor(x40.class).newInstance(x40Var);
                                cls.getMethod("setEventHandlerAndListener", Handler.class, o40.class).invoke(newInstance, handler, c74Var);
                                uh0 uh0Var = (uh0) cls.getMethod("build", null).invoke(newInstance, null);
                                uh0Var.getClass();
                                int i6 = i5 + 1;
                                arrayList.add(i5, uh0Var);
                                ncd.e("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                                arrayList.add(i6, (uh0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                                ncd.e("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                return;
                            }
                            Class<?> cls2 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                            Object newInstance2 = cls2.getConstructor(x40.class).newInstance(x40Var);
                            cls2.getMethod("setEventHandlerAndListener", Handler.class, o40.class).invoke(newInstance2, handler, c74Var);
                            uh0 uh0Var2 = (uh0) cls2.getMethod("build", null).invoke(newInstance2, null);
                            uh0Var2.getClass();
                            int i62 = i5 + 1;
                            arrayList.add(i5, uh0Var2);
                            ncd.e("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                            arrayList.add(i62, (uh0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                            ncd.e("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            return;
                        } catch (Exception e) {
                            wa3.h("Error instantiating IAMF extension", e);
                            return;
                        }
                    }
                    try {
                        try {
                            arrayList.add(i2, (uh0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                            ncd.e("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused5) {
                            i2 = i3;
                            i3 = i2;
                            i4 = i3 + 1;
                            arrayList.add(i3, (uh0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                            ncd.e("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                            i5 = i4 + 1;
                            arrayList.add(i4, (uh0) FfmpegAudioRenderer.class.getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                            ncd.e("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            Class<?> cls22 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                            Object newInstance22 = cls22.getConstructor(x40.class).newInstance(x40Var);
                            cls22.getMethod("setEventHandlerAndListener", Handler.class, o40.class).invoke(newInstance22, handler, c74Var);
                            uh0 uh0Var22 = (uh0) cls22.getMethod("build", null).invoke(newInstance22, null);
                            uh0Var22.getClass();
                            int i622 = i5 + 1;
                            arrayList.add(i5, uh0Var22);
                            ncd.e("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                            arrayList.add(i622, (uh0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                            ncd.e("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            return;
                        }
                        i5 = i4 + 1;
                        arrayList.add(i4, (uh0) FfmpegAudioRenderer.class.getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                        ncd.e("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        Class<?> cls222 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                        Object newInstance222 = cls222.getConstructor(x40.class).newInstance(x40Var);
                        cls222.getMethod("setEventHandlerAndListener", Handler.class, o40.class).invoke(newInstance222, handler, c74Var);
                        uh0 uh0Var222 = (uh0) cls222.getMethod("build", null).invoke(newInstance222, null);
                        uh0Var222.getClass();
                        int i6222 = i5 + 1;
                        arrayList.add(i5, uh0Var222);
                        ncd.e("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                        try {
                            arrayList.add(i6222, (uh0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                            ncd.e("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            return;
                        } catch (ClassNotFoundException unused6) {
                            return;
                        } catch (Exception e2) {
                            wa3.h("Error instantiating MPEG-H extension", e2);
                            return;
                        }
                    } catch (Exception e3) {
                        wa3.h("Error instantiating FFmpeg extension", e3);
                        return;
                    }
                    i4 = i3 + 1;
                    arrayList.add(i3, (uh0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, o40.class, x40.class).newInstance(handler, c74Var, x40Var));
                    ncd.e("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (Exception e4) {
                    wa3.h("Error instantiating FLAC extension", e4);
                    return;
                }
                i3 = i2 + 1;
            } catch (Exception e5) {
                wa3.h("Error instantiating Opus extension", e5);
            }
        } catch (Exception e6) {
            wa3.h("Error instantiating MIDI extension", e6);
        }
    }

    public cb3 b(Context context) {
        return new c40(context, (byte) 2).b();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public void c(Context context, int i, Handler handler, c74 c74Var, ArrayList arrayList) {
        char c;
        int i2;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        wm6 wm6Var = new wm6(context);
        wm6Var.c = this.b;
        wm6Var.d = (short) 5000;
        wm6Var.e = handler;
        wm6Var.f = c74Var;
        wm6Var.g = (byte) 50;
        jte.p(!wm6Var.b);
        Handler handler2 = wm6Var.e;
        c74 c74Var2 = wm6Var.f;
        jte.p(handler2 != null ? c74Var2 != null : c74Var2 == null);
        wm6Var.b = true;
        arrayList.add(new ym6(wm6Var));
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    c = 2;
                    try {
                        i2 = size + 1;
                        try {
                            arrayList.add(size, (uh0) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, ydc.class, cls).newInstance(5000L, handler, c74Var, 50));
                            ncd.e("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i2;
                            i2 = size;
                            try {
                                Class<?> cls3 = Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer");
                                Class<?>[] clsArr = new Class[4];
                                clsArr[0] = cls2;
                                clsArr[1] = Handler.class;
                                clsArr[c] = ydc.class;
                                clsArr[3] = cls;
                                Constructor<?> constructor = cls3.getConstructor(clsArr);
                                Object[] objArr = new Object[4];
                                objArr[0] = 5000L;
                                objArr[1] = handler;
                                objArr[c] = c74Var;
                                objArr[3] = 50;
                                uh0 uh0Var = (uh0) constructor.newInstance(objArr);
                                int i3 = i2 + 1;
                                try {
                                    arrayList.add(i2, uh0Var);
                                    ncd.e("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                                } catch (ClassNotFoundException unused2) {
                                    i2 = i3;
                                    i3 = i2;
                                    int i4 = ExperimentalFfmpegVideoRenderer.y0;
                                    Class[] clsArr2 = new Class[4];
                                    clsArr2[0] = cls2;
                                    clsArr2[1] = Handler.class;
                                    clsArr2[c] = ydc.class;
                                    clsArr2[3] = cls;
                                    Constructor constructor2 = ExperimentalFfmpegVideoRenderer.class.getConstructor(clsArr2);
                                    Object[] objArr2 = new Object[4];
                                    objArr2[0] = 5000L;
                                    objArr2[1] = handler;
                                    objArr2[c] = c74Var;
                                    objArr2[3] = 50;
                                    arrayList.add(i3, (uh0) constructor2.newInstance(objArr2));
                                    ncd.e("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                                }
                                int i42 = ExperimentalFfmpegVideoRenderer.y0;
                                Class[] clsArr22 = new Class[4];
                                clsArr22[0] = cls2;
                                clsArr22[1] = Handler.class;
                                clsArr22[c] = ydc.class;
                                clsArr22[3] = cls;
                                Constructor constructor22 = ExperimentalFfmpegVideoRenderer.class.getConstructor(clsArr22);
                                Object[] objArr22 = new Object[4];
                                objArr22[0] = 5000L;
                                objArr22[1] = handler;
                                objArr22[c] = c74Var;
                                objArr22[3] = 50;
                                arrayList.add(i3, (uh0) constructor22.newInstance(objArr22));
                                ncd.e("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                            } catch (Exception e) {
                                wa3.h("Error instantiating AV1 extension", e);
                                return;
                            }
                        }
                    } catch (ClassNotFoundException unused3) {
                    }
                } catch (ClassNotFoundException unused4) {
                    c = 2;
                }
                try {
                    Class<?> cls32 = Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer");
                    Class<?>[] clsArr3 = new Class[4];
                    clsArr3[0] = cls2;
                    clsArr3[1] = Handler.class;
                    clsArr3[c] = ydc.class;
                    clsArr3[3] = cls;
                    Constructor<?> constructor3 = cls32.getConstructor(clsArr3);
                    Object[] objArr3 = new Object[4];
                    objArr3[0] = 5000L;
                    objArr3[1] = handler;
                    objArr3[c] = c74Var;
                    objArr3[3] = 50;
                    uh0 uh0Var2 = (uh0) constructor3.newInstance(objArr3);
                    int i32 = i2 + 1;
                    arrayList.add(i2, uh0Var2);
                    ncd.e("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    int i422 = ExperimentalFfmpegVideoRenderer.y0;
                    Class[] clsArr222 = new Class[4];
                    clsArr222[0] = cls2;
                    clsArr222[1] = Handler.class;
                    clsArr222[c] = ydc.class;
                    clsArr222[3] = cls;
                    Constructor constructor222 = ExperimentalFfmpegVideoRenderer.class.getConstructor(clsArr222);
                    Object[] objArr222 = new Object[4];
                    objArr222[0] = 5000L;
                    objArr222[1] = handler;
                    objArr222[c] = c74Var;
                    objArr222[3] = 50;
                    arrayList.add(i32, (uh0) constructor222.newInstance(objArr222));
                    ncd.e("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused6) {
                } catch (Exception e2) {
                    wa3.h("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                wa3.h("Error instantiating VP9 extension", e3);
            }
        }
    }

    public final uh0[] d(Handler handler, c74 c74Var, c74 c74Var2, c74 c74Var3, c74 c74Var4) {
        ArrayList arrayList = new ArrayList();
        c(this.a, this.c ? 1 : 0, handler, c74Var, arrayList);
        Context context = this.a;
        a(this.a, this.c ? 1 : 0, b(context), handler, c74Var2, arrayList);
        arrayList.add(new bkb(c74Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new sf7(c74Var4, looper));
        }
        arrayList.add(new cb1());
        arrayList.add(new qn5(new uk0(context, (byte) 0)));
        return (uh0[]) arrayList.toArray(new uh0[0]);
    }
}
