package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements org.telegram.ui.ActionBar.c2, kl0, uc0, vc0, wc0, xd.d, ImageReceiver.ImageReceiverDelegate, y4, r0.o, ih.a, t0.e, ll0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, oh.e9, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.n1, jh.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // xd.d
    public void E() {
        b6 b6Var = (b6) this.b;
        b6Var.b();
        b6Var.e();
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        ((g8) this.b).Q0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        cb cbVar = (cb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        bb bbVar = cbVar.a;
        if (bbVar != null) {
            bbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // oh.e9
    public void b0(long j10, int i10, oh.l3 l3Var) {
        l3Var.run();
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f10, float f11, int i10, View view) {
        h0.P((h0) this.b, view, i10, f10);
    }

    @Override // t0.e
    public boolean d(t0.i iVar, int i10, Bundle bundle) {
        dg dgVar = (dg) this.b;
        ChatActivityEnterView chatActivityEnterView = dgVar.d;
        if (chatActivityEnterView.h5) {
            return true;
        }
        int i11 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.a.b();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.a())) {
            dgVar.m(hVar.a(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            z4.M(chatActivityEnterView.K2, chatActivityEnterView.L2.a(), new o1(10, dgVar, iVar), chatActivityEnterView.S3);
            return true;
        }
        dgVar.o(iVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new f6((r6) obj, 1));
                duration.start();
                break;
            default:
                p9 p9Var = (p9) obj;
                p9Var.getClass();
                if (z4 && !z10) {
                    p9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.uc0
    public String e(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        Object O;
        jk jkVar = (jk) this.b;
        f2.p0 adapter = jkVar.r.getAdapter();
        bk bkVar = jkVar.v;
        if (adapter == bkVar) {
            O = bkVar.E(i10);
        } else {
            ik ikVar = jkVar.y;
            O = ikVar.O(ikVar.S(i10), ikVar.Q(i10));
        }
        return jkVar.P(view, O);
    }

    @Override // org.telegram.ui.Components.vc0
    public void g(int i10) {
        u2 u2Var = (u2) this.b;
        if (i10 == 0) {
            u2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        lq lqVar = ((mq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            lqVar.k(i10 == 2);
        } else if (i10 == 3) {
            lqVar.x();
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                z.S((z) this.b, d2Var);
                break;
            case 2:
                ((org.telegram.ui.ih) this.b).run();
                break;
            case 3:
                ((hg.y1) this.b).run();
                break;
            case 4:
                ((lf.j0) this.b).run();
                break;
            case 5:
                ((u1) this.b).run();
                break;
            case 6:
                ((zr) this.b).run();
                break;
            case 8:
                ((o2) this.b).run();
                break;
            case 17:
                ((xf) this.b).a.R0.r();
                break;
            case 19:
                ((org.telegram.ui.mp) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((sn) this.b).b.dismiss();
                break;
            default:
                ((wm) this.b).a.B.r();
                break;
        }
    }

    @Override // xd.d
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // oh.e9
    public boolean k1(long j10, int i10, int i11, int i12, oh.f9 f9Var) {
        xn xnVar = (xn) ((org.telegram.ui.Cells.l6) this.b).T;
        ImageReceiver imageReceiver = xnVar.a;
        f9Var.c = imageReceiver;
        f9Var.l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = xnVar.D;
        f9Var.m = l6Var;
        boolean z4 = l6Var.w;
        xn xnVar2 = xnVar.H.e;
        f9Var.a = xnVar2;
        f9Var.k = xnVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.i = AndroidUtilities.displaySize.y;
        f9Var.g = (View) xnVar.getParent();
        return true;
    }

    @Override // xd.d
    public /* synthetic */ boolean l(float f10) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var = ((xr) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && p1Var != null && p1Var.isShowing()) {
            p1Var.d(true);
        }
    }

    @Override // jh.o
    public void o(jh.k kVar, float f10, float f11) {
        ((zt) this.b).c(kVar, f10, f11);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        ol olVar = (ol) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = olVar.e;
        mi miVar = chatAttachAlertPhotoLayout.b;
        if (olVar.a == null || miVar.S || chatAttachAlertPhotoLayout.M == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.n1 = false;
        try {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
            i10 = options.outWidth;
        } catch (Exception unused) {
            i10 = 0;
        }
        try {
            i11 = options.outHeight;
        } catch (Exception unused2) {
            i11 = 0;
            int i12 = i10;
            int i13 = ChatAttachAlertPhotoLayout.r1;
            ChatAttachAlertPhotoLayout.r1 = i13 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i13, 0L, olVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
            photoEntry.duration = (int) (j10 / 1000.0f);
            photoEntry.thumbPath = str;
            if (miVar.N0 != 0) {
                MediaController.CropState cropState = new MediaController.CropState();
                photoEntry.cropState = cropState;
                cropState.mirrored = true;
                cropState.freeform = false;
                cropState.lockedAspectRatio = 1.0f;
            }
            chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
        }
        int i122 = i10;
        int i132 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout.r1 = i132 - 1;
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, olVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j10 / 1000.0f);
        photoEntry.thumbPath = str;
        if (miVar.N0 != 0 && chatAttachAlertPhotoLayout.M.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // ih.a
    public void p(Canvas canvas, int i10) {
        ((nb) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.wc0
    public void q(yc0 yc0Var, int i10) {
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.b;
        try {
            if (i10 == 0) {
                t3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                t3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override // xd.d
    public /* synthetic */ void a() {
    }

    @Override // oh.e9
    public /* synthetic */ void b(boolean z4) {
    }

    @Override // xd.d
    public /* synthetic */ void i(boolean z4) {
    }

    @Override // xd.d
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
