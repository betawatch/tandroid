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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.b2, bm0, jd0, kd0, ld0, oe.f, ImageReceiver.ImageReceiverDelegate, e5, r0.n, wh.a, t0.e, cm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.v5, di.u9, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.m1, xh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        ((q8) this.b).T0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // di.u9
    public void G0(long j10, int i10, di.s3 s3Var) {
        s3Var.run();
    }

    @Override // oe.f
    public void P() {
        j6 j6Var = (j6) this.b;
        j6Var.b();
        j6Var.e();
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        lb lbVar = (lb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        kb kbVar = lbVar.a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        Object O;
        nk nkVar = (nk) this.b;
        s4.h0 adapter = nkVar.r.getAdapter();
        gk gkVar = nkVar.v;
        if (adapter == gkVar) {
            O = gkVar.E(i10);
        } else {
            mk mkVar = nkVar.y;
            O = mkVar.O(mkVar.S(i10), mkVar.Q(i10));
        }
        return nkVar.S(view, O);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // t0.e
    public boolean d(t0.i iVar, int i10, Bundle bundle) {
        ng ngVar = (ng) this.b;
        ChatActivityEnterView chatActivityEnterView = ngVar.d;
        if (chatActivityEnterView.p5) {
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
            ngVar.m(hVar.a(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new p1(10, ngVar, iVar), chatActivityEnterView.W3);
            return true;
        }
        ngVar.o(iVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new n6((z6) obj, 1));
                duration.start();
                break;
            default:
                y9 y9Var = (y9) obj;
                y9Var.getClass();
                if (z10 && !z11) {
                    y9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        g0.P((g0) this.b, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.jd0
    public String f(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        xq xqVar = ((yq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            xqVar.k(i10 == 2);
        } else if (i10 == 3) {
            xqVar.w();
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                y.S((y) this.b, e2Var);
                break;
            case 2:
                ((m4.v0) this.b).run();
                break;
            case 3:
                ((bi.r3) this.b).run();
                break;
            case 4:
                ((ag.q0) this.b).run();
                break;
            case 5:
                ((x1) this.b).run();
                break;
            case 6:
                ((ls) this.b).run();
                break;
            case 8:
                ((s2) this.b).run();
                break;
            case 17:
                ((gg) this.b).a.U0.r();
                break;
            case 19:
                ((org.telegram.ui.kp) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((go) this.b).b.dismiss();
                break;
            case 24:
                ((in) this.b).a.E.r();
                break;
            default:
                ((pu) this.b).a.d.r();
                break;
        }
    }

    @Override // di.u9
    public boolean i1(long j10, int i10, int i11, int i12, di.v9 v9Var) {
        lo loVar = (lo) ((org.telegram.ui.Cells.q6) this.b).T;
        ImageReceiver imageReceiver = loVar.a;
        v9Var.c = imageReceiver;
        v9Var.l = imageReceiver;
        org.telegram.ui.Cells.q6 q6Var = loVar.G;
        v9Var.m = q6Var;
        boolean z10 = q6Var.w;
        lo loVar2 = loVar.K.e;
        v9Var.a = loVar2;
        v9Var.k = loVar2.getAlpha();
        v9Var.h = 0.0f;
        v9Var.i = AndroidUtilities.displaySize.y;
        v9Var.g = (View) loVar.getParent();
        return true;
    }

    @Override // oe.f
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // oe.f
    public /* synthetic */ boolean k(float f7) {
        return false;
    }

    @Override // org.telegram.ui.Components.kd0
    public void m(int i10) {
        a3 a3Var = (a3) this.b;
        if (i10 == 0) {
            a3Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var = ((js) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && o1Var != null && o1Var.isShowing()) {
            o1Var.d(true);
        }
    }

    @Override // xh.k
    public void o(xh.g gVar, float f7, float f10) {
        ((lu) this.b).c(gVar, f7, f10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        dm dmVar = (dm) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.e;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (dmVar.a == null || tiVar.V || chatAttachAlertPhotoLayout.P == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.q1 = false;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
            i10 = options.outWidth;
            try {
                i11 = options.outHeight;
            } catch (Exception unused) {
                i11 = 0;
                int i12 = i10;
                int i13 = ChatAttachAlertPhotoLayout.u1;
                ChatAttachAlertPhotoLayout.u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, dmVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (j10 / 1000.0f);
                photoEntry.thumbPath = str;
                if (tiVar.T0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.k0(photoEntry, false, false);
            }
        } catch (Exception unused2) {
            i10 = 0;
        }
        int i122 = i10;
        int i132 = ChatAttachAlertPhotoLayout.u1;
        ChatAttachAlertPhotoLayout.u1 = i132 - 1;
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, dmVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j10 / 1000.0f);
        photoEntry.thumbPath = str;
        if (tiVar.T0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.k0(photoEntry, false, false);
    }

    @Override // wh.a
    public void p(Canvas canvas, int i10) {
        ((ub) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.ld0
    public void q(nd0 nd0Var, int i10) {
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) this.b;
        try {
            if (i10 == 0) {
                y3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                y3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override // oe.f
    public /* synthetic */ void a() {
    }

    @Override // oe.f
    public /* synthetic */ void l() {
    }

    @Override // di.u9
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // oe.f
    public /* synthetic */ void i(boolean z10) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
