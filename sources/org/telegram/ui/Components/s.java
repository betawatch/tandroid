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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.a2, qk0, bc0, cc0, dc0, ud.d, ImageReceiver.ImageReceiverDelegate, x4, r0.o, dh.a, t0.f, rk0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.o5, jh.e9, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, eh.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ud.d
    public /* synthetic */ boolean E() {
        return false;
    }

    @Override // ud.d
    public /* synthetic */ boolean G(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        ((f8) this.b).V0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        ab abVar = (ab) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        za zaVar = abVar.a;
        if (zaVar != null) {
            zaVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        Object O;
        bk bkVar = (bk) this.b;
        f2.q0 adapter = bkVar.r.getAdapter();
        uj ujVar = bkVar.v;
        if (adapter == ujVar) {
            O = ujVar.E(i10);
        } else {
            ak akVar = bkVar.y;
            O = akVar.O(akVar.S(i10), akVar.Q(i10));
        }
        return bkVar.P(view, O);
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        g0.P((g0) this.b, view, i10, f10);
    }

    @Override // t0.f
    public boolean d(t0.j jVar, int i10, Bundle bundle) {
        zf zfVar = (zf) this.b;
        ChatActivityEnterView chatActivityEnterView = zfVar.d;
        if (chatActivityEnterView.g5) {
            return true;
        }
        int i11 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                jVar.a.f();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.a;
        if (!iVar.k().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            zfVar.m(iVar.c(), iVar.k().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new g1(11, zfVar, jVar), chatActivityEnterView.R3);
            return true;
        }
        zfVar.o(jVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new e6((q6) obj, 1));
                duration.start();
                break;
            default:
                n9 n9Var = (n9) obj;
                n9Var.getClass();
                if (z10 && !z11) {
                    n9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                y.S((y) this.b, b2Var);
                break;
            case 2:
                ((org.telegram.ui.yf) this.b).run();
                break;
            case 3:
                ((cg.b2) this.b).run();
                break;
            case 4:
                ((gf.k0) this.b).run();
                break;
            case 5:
                ((s1) this.b).run();
                break;
            case 6:
                ((nr) this.b).run();
                break;
            case 8:
                ((m2) this.b).run();
                break;
            case 17:
                ((tf) this.b).a.Q0.s();
                break;
            case 19:
                ((org.telegram.ui.yq) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((in) this.b).b.dismiss();
                break;
            default:
                ((lm) this.b).a.A.s();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bc0
    public String g(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // jh.e9
    public void g1(long j10, int i10, jh.l3 l3Var) {
        l3Var.run();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        zp zpVar = ((aq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            zpVar.g(i10 == 2);
        } else if (i10 == 3) {
            zpVar.n();
        }
    }

    @Override // eh.o
    public void i(eh.k kVar, float f10, float f11) {
        ((nt) this.b).c(kVar, f10, f11);
    }

    @Override // org.telegram.ui.Components.cc0
    public void j(int i10) {
        u2 u2Var = (u2) this.b;
        if (i10 == 0) {
            u2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((lr) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override // dh.a
    public void l(Canvas canvas, int i10) {
        ((jb) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // ud.d
    public void l1() {
        a6 a6Var = (a6) this.b;
        a6Var.b();
        a6Var.e();
    }

    @Override // org.telegram.ui.Components.dc0
    public void m(fc0 fc0Var, int i10) {
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) this.b;
        try {
            if (i10 == 0) {
                r3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                r3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        el elVar = (el) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = elVar.e;
        gi giVar = chatAttachAlertPhotoLayout.b;
        if (elVar.a == null || giVar.R || chatAttachAlertPhotoLayout.L == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.m1 = false;
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
            int i13 = ChatAttachAlertPhotoLayout.q1;
            ChatAttachAlertPhotoLayout.q1 = i13 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i13, 0L, elVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
            photoEntry.duration = (int) (j10 / 1000.0f);
            photoEntry.thumbPath = str;
            if (giVar.M0 != 0) {
                MediaController.CropState cropState = new MediaController.CropState();
                photoEntry.cropState = cropState;
                cropState.mirrored = true;
                cropState.freeform = false;
                cropState.lockedAspectRatio = 1.0f;
            }
            chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
        }
        int i122 = i10;
        int i132 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout.q1 = i132 - 1;
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, elVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j10 / 1000.0f);
        photoEntry.thumbPath = str;
        if (giVar.M0 != 0 && chatAttachAlertPhotoLayout.L.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // jh.e9
    public boolean y0(long j10, int i10, int i11, int i12, jh.f9 f9Var) {
        nn nnVar = (nn) ((org.telegram.ui.Cells.i6) this.b).T;
        ImageReceiver imageReceiver = nnVar.a;
        f9Var.c = imageReceiver;
        f9Var.l = imageReceiver;
        org.telegram.ui.Cells.i6 i6Var = nnVar.C;
        f9Var.m = i6Var;
        boolean z10 = i6Var.w;
        nn nnVar2 = nnVar.G.e;
        f9Var.a = nnVar2;
        f9Var.k = nnVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.i = AndroidUtilities.displaySize.y;
        f9Var.g = (View) nnVar.getParent();
        return true;
    }

    @Override // ud.d
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // ud.d
    public /* synthetic */ void K() {
    }

    @Override // ud.d
    public /* synthetic */ void b() {
    }

    @Override // jh.e9
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
