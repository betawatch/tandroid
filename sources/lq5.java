// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class lq5 implements nu4, kk4, fd, ot2, vm6 {
    public final /* synthetic */ byte a;

    public /* synthetic */ lq5(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void f() {
        throw new AssertionError();
    }

    public static /* synthetic */ void g(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void n() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    @Override // vm6
    public final int a(Object obj) {
        String str = ((nm6) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // ot2
    public final void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // nu4
    public final Object h(Object obj) {
        switch (this.a) {
            case 3:
                int L = hl.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(hl.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(aob.w0(null, aob.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            case 4:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = hl.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f, f, f, paint2);
                return createBitmap2;
            case 7:
                String str = LaunchActivity.C1;
                return new fj6();
            case 28:
                return new TLRPC.TL_messageEntityBold();
            default:
                return new TLRPC.TL_messageEntityItalic();
        }
    }

    @Override // kk4
    public final boolean run() {
        String str = LaunchActivity.C1;
        return xea.r.length() > 0 && !xea.z;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 10:
                idVar.dismiss();
                break;
            default:
                idVar.dismiss();
                break;
        }
    }
}
