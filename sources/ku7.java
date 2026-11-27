// default package

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ku7 implements ama, vv7, on5, dq7, nl0, nr7, NativeLifecycleLock.NativeDisposer, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativePointerRunnable, fd, jcc, yma {
    public final /* synthetic */ byte a;

    public /* synthetic */ ku7(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ Font e(Object obj) {
        return (Font) obj;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        return l2d.b;
    }

    @Override // vv7
    public final Typeface a() {
        switch (this.a) {
            case 2:
                return hl.n1("fonts/rmedium.ttf");
            case 3:
                return hl.n1("fonts/rmediumitalic.ttf");
            case 4:
                return Typeface.create("serif", 1);
            case 5:
                return hl.n1("fonts/rcondensedbold.ttf");
            case 6:
                return hl.n1("fonts/rmono.ttf");
            default:
                return hl.n1("fonts/mw_bold.ttf");
        }
    }

    @Override // dq7
    public final String c(int i) {
        return i == 0 ? ob6.M0(2131753792, null) : i == 1 ? ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(1, "Minutes", new Object[0])) : i == 2 ? ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(5, "Minutes", new Object[0])) : i == 3 ? ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(1, "Hours", new Object[0])) : i == 4 ? ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(5, "Hours", new Object[0])) : "";
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Long lambda$getNativePeerConnectionFactory$13;
        lambda$getNativePeerConnectionFactory$13 = PeerConnectionFactory.lambda$getNativePeerConnectionFactory$13(j);
        return lambda$getNativePeerConnectionFactory$13;
    }

    @Override // ama
    public final void d(Object obj, float f) {
        lu7 lu7Var = (lu7) obj;
        lu7Var.s = f;
        lu7Var.f();
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeDisposer
    public final void dispose(long j) {
        switch (this.a) {
            case 13:
                PeerConnection.lambda$dispose$48(j);
                break;
            default:
                PeerConnectionFactory.lambda$dispose$12(j);
                break;
        }
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        return num.intValue() == 0 ? nza.b1(false, ob6.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : ob6.E(r4.intValue(), ',');
    }

    @Override // yma
    public final void j(int i) {
        xea.X0 = i;
        xea.x();
    }

    @Override // nl0
    public final int l(vnb vnbVar, boolean z) {
        Bitmap bitmap = fz8.a;
        return (((int) qu6.d(ehd.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        PeerConnectionFactory.lambda$stopAecDump$11(j);
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        b29 y;
        if (!z || z2 || (y = imageReceiver.y()) == null) {
            return;
        }
        y.start();
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 17:
                idVar.dismiss();
                break;
            case 18:
                idVar.dismiss();
                break;
            case 19:
                Drawable[] drawableArr = PhotoViewer.d9;
                break;
            case 20:
                idVar.dismiss();
                break;
            case 21:
                idVar.dismiss();
                break;
            case 22:
            case 23:
            default:
                idVar.dismiss();
                break;
            case 24:
                RectF rectF = ProfileActivity.Z6;
                idVar.dismiss();
                break;
            case 25:
                idVar.dismiss();
                break;
        }
    }

    @Override // yma
    public final void m() {
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }
}
