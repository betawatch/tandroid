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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements org.telegram.ui.ActionBar.c2, kl0, zc0, ad0, bd0, le.f, ImageReceiver.ImageReceiverDelegate, c5, r0.n, th.a, t0.e, ll0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, zh.q7, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.n1, uh.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // zh.q7
    public void H0(long j3, int i10, zh.j2 j2Var) {
        j2Var.run();
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        ((n8) this.b).U0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        kb kbVar = (kb) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        jb jbVar = kbVar.a;
        if (jbVar != null) {
            jbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        i0.P((i0) this.b, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        Object O;
        tk tkVar = (tk) this.b;
        s4.h0 adapter = tkVar.r.getAdapter();
        mk mkVar = tkVar.v;
        if (adapter == mkVar) {
            O = mkVar.E(i10);
        } else {
            sk skVar = tkVar.y;
            O = skVar.O(skVar.S(i10), skVar.Q(i10));
        }
        return tkVar.P(view, O);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new j6((v6) obj, 1));
                duration.start();
                break;
            default:
                w9 w9Var = (w9) obj;
                w9Var.getClass();
                if (z10 && !z11) {
                    w9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                z.S((z) this.b, d2Var);
                break;
            case 2:
                ((org.telegram.ui.da) this.b).run();
                break;
            case 3:
                ((bi.va) this.b).run();
                break;
            case 4:
                ((org.telegram.messenger.w0) this.b).run();
                break;
            case 5:
                ((v1) this.b).run();
                break;
            case 6:
                ((fs) this.b).run();
                break;
            case 8:
                ((r2) this.b).run();
                break;
            case 17:
                ((jg) this.b).a.U0.r();
                break;
            case 19:
                ((ee) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((zn) this.b).b.dismiss();
                break;
            default:
                ((dn) this.b).a.E.r();
                break;
        }
    }

    @Override // le.f
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // t0.e
    public boolean h(t0.i iVar, int i10, Bundle bundle) {
        pg pgVar = (pg) this.b;
        ChatActivityEnterView chatActivityEnterView = pgVar.d;
        if (chatActivityEnterView.k5) {
            return true;
        }
        int i11 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            pgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            d5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new org.telegram.ui.oe(27, pgVar, iVar), chatActivityEnterView.V3);
            return true;
        }
        pgVar.o(iVar, true, 0, 0);
        return true;
    }

    @Override // le.f
    public /* synthetic */ boolean i(float f7) {
        return false;
    }

    @Override // org.telegram.ui.Components.zc0
    public String k(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // uh.l
    public void l(uh.h hVar, float f7, float f10) {
        ((hu) this.b).c(hVar, f7, f10);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        rq rqVar = ((sq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            rqVar.k(i10 == 2);
        } else if (i10 == 3) {
            rqVar.x();
        }
    }

    @Override // org.telegram.ui.Components.ad0
    public void n(int i10) {
        x2 x2Var = (x2) this.b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var = ((ds) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && p1Var != null && p1Var.isShowing()) {
            p1Var.d(true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        wl wlVar = (wl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.e;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (wlVar.a == null || yiVar.V || chatAttachAlertPhotoLayout.P == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.q1 = false;
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
            int i13 = ChatAttachAlertPhotoLayout.u1;
            ChatAttachAlertPhotoLayout.u1 = i13 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i13, 0L, wlVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
            photoEntry.duration = (int) (j3 / 1000.0f);
            photoEntry.thumbPath = str;
            if (yiVar.Q0 != 0) {
                MediaController.CropState cropState = new MediaController.CropState();
                photoEntry.cropState = cropState;
                cropState.mirrored = true;
                cropState.freeform = false;
                cropState.lockedAspectRatio = 1.0f;
            }
            chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
        }
        int i122 = i10;
        int i132 = ChatAttachAlertPhotoLayout.u1;
        ChatAttachAlertPhotoLayout.u1 = i132 - 1;
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, wlVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j3 / 1000.0f);
        photoEntry.thumbPath = str;
        if (yiVar.Q0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // th.a
    public void p(Canvas canvas, int i10) {
        ((tb) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(dd0 dd0Var, int i10) {
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

    @Override // le.f
    public void x() {
        f6 f6Var = (f6) this.b;
        f6Var.b();
        f6Var.e();
    }

    @Override // zh.q7
    public boolean y0(long j3, int i10, int i11, int i12, zh.r7 r7Var) {
        fo foVar = (fo) ((org.telegram.ui.Cells.n6) this.b).T;
        ImageReceiver imageReceiver = foVar.a;
        r7Var.c = imageReceiver;
        r7Var.l = imageReceiver;
        org.telegram.ui.Cells.n6 n6Var = foVar.G;
        r7Var.m = n6Var;
        boolean z10 = n6Var.w;
        fo foVar2 = foVar.K.e;
        r7Var.a = foVar2;
        r7Var.k = foVar2.getAlpha();
        r7Var.h = 0.0f;
        r7Var.i = AndroidUtilities.displaySize.y;
        r7Var.g = (View) foVar.getParent();
        return true;
    }

    @Override // le.f
    public /* synthetic */ void a() {
    }

    @Override // zh.q7
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // le.f
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // le.f
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
