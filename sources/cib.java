// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.ui.Components.UndoView;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFileRenderer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cib implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cib(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        boolean z;
        String str;
        jb4 jb4Var = (jb4) this.b;
        synchronized (((AtomicMarkableReference) jb4Var.g)) {
            z = false;
            if (((AtomicMarkableReference) jb4Var.g).isMarked()) {
                str = (String) ((AtomicMarkableReference) jb4Var.g).getReference();
                ((AtomicMarkableReference) jb4Var.g).set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            ((hd7) jb4Var.b).i((String) jb4Var.a, str);
        }
    }

    private final void b() {
        xf4 xf4Var = (xf4) this.b;
        Map map = null;
        ((AtomicReference) xf4Var.c).set(null);
        synchronized (xf4Var) {
            if (((AtomicMarkableReference) xf4Var.b).isMarked()) {
                map = ((qv5) ((AtomicMarkableReference) xf4Var.b).getReference()).a();
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) xf4Var.b;
                atomicMarkableReference.set((qv5) atomicMarkableReference.getReference(), false);
            }
        }
        if (map != null) {
            jb4 jb4Var = (jb4) xf4Var.d;
            ((hd7) jb4Var.b).h((String) jb4Var.a, map, xf4Var.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0434 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        byte b;
        int i;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        long j;
        int i2;
        short s;
        boolean z3;
        int i3 = -1;
        byte b2 = 4;
        int i4 = 8;
        boolean z4 = true;
        Bitmap bitmap = null;
        int i5 = 0;
        switch (this.a) {
            case 0:
                ((rib) ((dt3) this.b).c).R();
                return;
            case 1:
                ((tib) this.b).a();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.b).lambda$onFirstFrameRendered$0();
                return;
            case 3:
                ArrayList arrayList = ((fjb) this.b).a;
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    ((View) arrayList.get(i6)).setVisibility(8);
                    if (arrayList.get(i6) instanceof gb2) {
                        ((gb2) arrayList.get(i6)).m3(false, false);
                        ((gb2) arrayList.get(i6)).o3(false, false, false);
                    }
                }
                return;
            case 4:
                Drawable drawable = (Drawable) this.b;
                bkb.d = null;
                bkb.O();
                if (!bkb.b) {
                    bkb.i(drawable);
                    bkb.g(drawable);
                }
                kk7.e().k(kk7.B4, new Object[0]);
                return;
            case 5:
                tmb tmbVar = (tmb) this.b;
                tmbVar.y = -1;
                while (true) {
                    gb2[] gb2VarArr = tmbVar.n;
                    if (i5 >= gb2VarArr.length) {
                        return;
                    }
                    gb2 gb2Var = gb2VarArr[i5];
                    if (gb2Var != null) {
                        gb2Var.invalidate();
                    }
                    i5++;
                }
            case 6:
                anb anbVar = (anb) this.b;
                anbVar.K = null;
                anbVar.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(s33.f).start();
                return;
            case 7:
                dob dobVar = (dob) this.b;
                try {
                    int round = Math.round(((dobVar.h * dobVar.g.getInteger("sample-rate")) / dobVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(dobVar.g.getString("mime"));
                    if (createDecoderByType != null) {
                        createDecoderByType.configure(dobVar.g, (Surface) null, (MediaCrypto) null, 0);
                        createDecoderByType.start();
                        createDecoderByType.getInputBuffers();
                        createDecoderByType.getOutputBuffers();
                        short[] sArr = new short[32];
                        int i7 = -1;
                        boolean z5 = false;
                        int i8 = 0;
                        int i9 = 0;
                        int i10 = 0;
                        short s2 = 0;
                        while (true) {
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            int i11 = i7;
                            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                            if (dequeueInputBuffer >= 0) {
                                b = b2;
                                int readSampleData = dobVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                                if (readSampleData < 0) {
                                    z = z4;
                                    j = 2500;
                                    try {
                                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                        i = i4;
                                        z2 = z;
                                        bufferInfo = bufferInfo2;
                                        i2 = i11;
                                    } catch (Exception e) {
                                        e = e;
                                        fa4.g(e, z);
                                        return;
                                    }
                                } else {
                                    z = z4;
                                    z2 = z5;
                                    j = 2500;
                                    i2 = i11;
                                    i = i4;
                                    bufferInfo = bufferInfo2;
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, dobVar.f.getSampleTime(), 0);
                                    dobVar.f.advance();
                                }
                            } else {
                                b = b2;
                                i = i4;
                                z = z4;
                                z2 = z5;
                                bufferInfo = bufferInfo2;
                                j = 2500;
                                i2 = i11;
                            }
                            if (i2 >= 0) {
                                createDecoderByType.getOutputBuffer(i2).position(0);
                            }
                            i7 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                            while (i7 != i3 && !z2) {
                                if (i7 >= 0) {
                                    ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i7);
                                    if (outputBuffer != null && bufferInfo.size > 0) {
                                        int i12 = i10;
                                        while (outputBuffer.remaining() > 0) {
                                            short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                            if (i12 >= round) {
                                                sArr[i8 - i9] = s2;
                                                int i13 = i8 + 1;
                                                int i14 = i13 - i9;
                                                if (i14 >= sArr.length || i13 >= dobVar.b) {
                                                    short[] sArr2 = new short[sArr.length];
                                                    gl.c3(new t79((Object) dobVar, (Object) sArr, i14, (byte) 25));
                                                    i9 = i13;
                                                    sArr = sArr2;
                                                }
                                                if (i13 >= dobVar.d.length) {
                                                    i10 = 0;
                                                    s2 = 0;
                                                    i8 = i13;
                                                } else {
                                                    s = 0;
                                                    i8 = i13;
                                                    i12 = 0;
                                                }
                                            } else {
                                                s = s2;
                                            }
                                            s2 = s < s3 ? s3 : s;
                                            i12++;
                                            int i15 = i;
                                            if (outputBuffer.remaining() >= i15) {
                                                outputBuffer.position(outputBuffer.position() + i15);
                                                i = 8;
                                            } else {
                                                i10 = i12;
                                            }
                                        }
                                        i10 = i12;
                                    }
                                    createDecoderByType.releaseOutputBuffer(i7, false);
                                    if ((bufferInfo.flags & 4) != 0) {
                                        z5 = z;
                                        int i16 = i8;
                                        synchronized (dobVar.i) {
                                            if (!dobVar.j) {
                                                if (!z5 && i16 < dobVar.b) {
                                                    i8 = i16;
                                                    b2 = b;
                                                    z4 = z;
                                                    i3 = -1;
                                                    i4 = 8;
                                                }
                                            }
                                        }
                                    }
                                } else if (i7 == -3) {
                                    createDecoderByType.getOutputBuffers();
                                }
                                i7 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                                i3 = -1;
                                i = 8;
                            }
                            z5 = z2;
                            int i162 = i8;
                            synchronized (dobVar.i) {
                            }
                        }
                        createDecoderByType.stop();
                        createDecoderByType.release();
                        dobVar.f.release();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    e = e2;
                    z = z4;
                }
                break;
            case 8:
                fob fobVar = (fob) this.b;
                iob iobVar = fobVar.c;
                if (iobVar != null) {
                    long j2 = iobVar.a;
                    if (j2 > 0) {
                        fobVar.e = j2;
                        fobVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                iob iobVar2 = (iob) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = iobVar2.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(iobVar2.j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(iobVar2.f, iobVar2.g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(iobVar2.f / bitmap.getWidth(), iobVar2.g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) ((createBitmap.getWidth() - (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() - (bitmap.getHeight() * max)) / 2.0f), (int) (((bitmap.getWidth() * max) + createBitmap.getWidth()) / 2.0f), (int) (((bitmap.getHeight() * max) + createBitmap.getHeight()) / 2.0f));
                            if (iobVar2.h) {
                                Path path = iobVar2.m;
                                if (path == null) {
                                    path = new Path();
                                    iobVar2.m = path;
                                }
                                path.rewind();
                                iobVar2.m.addCircle(iobVar2.f / 2.0f, iobVar2.g / 2.0f, Math.min(iobVar2.f, iobVar2.g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(iobVar2.m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, iobVar2.l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                    gl.c3(new a5b((Object) iobVar2, (Object) bitmap, (byte) 13));
                    return;
                }
                return;
            case 10:
                jtb jtbVar = (jtb) this.b;
                ViewPropertyAnimator duration = jtbVar.animate().alpha(0.0f).setListener(new iab(jtbVar, b2)).setDuration(300L);
                jtbVar.b = duration;
                duration.start();
                return;
            case 11:
                ztb ztbVar = (ztb) this.b;
                p8c p8cVar = ztbVar.b;
                if (p8cVar != null) {
                    p8cVar.a(Long.valueOf(ztbVar.a.t));
                    return;
                }
                return;
            case 12:
                ((tub) this.b).J.r.f();
                return;
            case 13:
                ((bvb) this.b).b.C0();
                return;
            case 14:
                kxb kxbVar = (kxb) ((pu9) this.b).c;
                if (kxbVar.i()) {
                    kxbVar.j();
                    return;
                }
                return;
            case 15:
                ((b0c) this.b).c.setVisibility(8);
                return;
            case 16:
                ((mr1) this.b).c.presentFragment(new qa9());
                return;
            case 17:
                b1c b1cVar = (b1c) this.b;
                na7 na7Var = b1cVar.n;
                String string = na7Var.X3.getString("translating_dialog_languages2", null);
                if (string != null) {
                    for (String str : string.split(";")) {
                        String[] split = str.split("=");
                        if (split.length >= 2) {
                            long parseLong = Long.parseLong(split[0]);
                            String[] split2 = split[1].split(">");
                            if (split2.length == 2) {
                                String str2 = split2[0];
                                String str3 = split2[1];
                                if (str3.length() <= 0 || str3.charAt(str3.length() - 1) != '!') {
                                    z3 = false;
                                } else {
                                    str3 = ir2.n(1, 0, str3);
                                    z3 = true;
                                }
                                if ("null".equals(str2)) {
                                    str2 = null;
                                }
                                if ("null".equals(str3)) {
                                    str3 = null;
                                }
                                if (str2 != null) {
                                    b1cVar.e.put(Long.valueOf(parseLong), str2);
                                    if (!b1cVar.v(str2)) {
                                        b1cVar.a.put(parseLong, Boolean.valueOf(!z3));
                                        b1cVar.b.add(Long.valueOf(parseLong));
                                    }
                                    if (str3 != null) {
                                        b1cVar.d.put(Long.valueOf(parseLong), str3);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = na7Var.X3.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        Iterator<String> it = stringSet.iterator();
                        while (it.hasNext()) {
                            try {
                                b1cVar.h.add(Long.valueOf(Long.parseLong(it.next())));
                            } catch (Exception e4) {
                                fa4.g(e4, true);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ((o1c) this.b).requestLayout();
                return;
            case 19:
                ((a4c) this.b).f();
                return;
            case 20:
                a5c a5cVar = ((b5c) this.b).a;
                if (a5cVar != null) {
                    a5cVar.h();
                    return;
                }
                return;
            case 21:
                UndoView undoView = (UndoView) this.b;
                int i17 = UndoView.j0;
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 22:
                ((f6c) this.b).invalidateSelf();
                return;
            case 23:
                a();
                return;
            case 24:
                b();
                return;
            case 25:
                td4 td4Var = ((kac) this.b).b;
                if (td4Var != null) {
                    td4Var.b(false, true, false);
                    return;
                }
                return;
            case 26:
                ((VideoFileRenderer) this.b).lambda$release$3();
                return;
            case 27:
                ((yac) this.b).c();
                return;
            case 28:
                ((VideoFramesRewinder) this.b).lambda$new$2();
                return;
            default:
                lbc lbcVar = (lbc) this.b;
                y54 y54Var = lbcVar.d;
                if (y54Var != null) {
                    TextureView textureView = lbcVar.n;
                    y54Var.y1();
                    if (textureView != null && textureView == y54Var.X) {
                        y54Var.y1();
                        y54Var.i1();
                        y54Var.q1(null);
                        y54Var.f1(0, 0);
                    }
                    lbcVar.d.s1(lbcVar.n);
                    ArrayList arrayList2 = lbcVar.O;
                    if (arrayList2 != null) {
                        lbcVar.j0(arrayList2, lbcVar.P);
                    } else {
                        boolean z6 = lbcVar.V;
                        Uri uri = lbcVar.R;
                        String str4 = lbcVar.T;
                        if (z6) {
                            lbcVar.k0(uri, str4, lbcVar.S, lbcVar.U);
                        } else {
                            lbcVar.i0(uri, str4);
                        }
                    }
                    lbcVar.g0();
                    return;
                }
                return;
        }
    }
}
