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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements org.telegram.ui.ActionBar.b2, al0, mc0, nc0, oc0, vd.e, ImageReceiver.ImageReceiverDelegate, b5, r0.o, fh.a, t0.e, bl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.p5, lh.e9, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.m1, gh.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        ((l8) this.b).T0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        hb hbVar = (hb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        gb gbVar = hbVar.a;
        if (gbVar != null) {
            gbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.b;
    }

    @Override // lh.e9
    public boolean K0(long j10, int i10, int i11, int i12, lh.f9 f9Var) {
        tn tnVar = (tn) ((org.telegram.ui.Cells.j6) this.b).T;
        ImageReceiver imageReceiver = tnVar.a;
        f9Var.c = imageReceiver;
        f9Var.l = imageReceiver;
        org.telegram.ui.Cells.j6 j6Var = tnVar.C;
        f9Var.m = j6Var;
        boolean z10 = j6Var.w;
        tn tnVar2 = tnVar.G.e;
        f9Var.a = tnVar2;
        f9Var.k = tnVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.i = AndroidUtilities.displaySize.y;
        f9Var.g = (View) tnVar.getParent();
        return true;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        i0.P((i0) this.b, view, i10, f9);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
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
                t9 t9Var = (t9) obj;
                t9Var.getClass();
                if (z10 && !z11) {
                    t9Var.a();
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

    @Override // org.telegram.ui.Components.mc0
    public String e(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // t0.e
    public boolean f(t0.i iVar, int i10, Bundle bundle) {
        gg ggVar = (gg) this.b;
        ChatActivityEnterView chatActivityEnterView = ggVar.d;
        if (chatActivityEnterView.g5) {
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
            ggVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            c5.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new j1(11, ggVar, iVar), chatActivityEnterView.R3);
            return true;
        }
        ggVar.o(iVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                a0.S((a0) this.b, c2Var);
                break;
            case 2:
                ((org.telegram.ui.gg) this.b).run();
                break;
            case 3:
                ((eg.z1) this.b).run();
                break;
            case 4:
                ((jf.j0) this.b).run();
                break;
            case 5:
                ((w1) this.b).run();
                break;
            case 6:
                ((tr) this.b).run();
                break;
            case 8:
                ((p2) this.b).run();
                break;
            case 17:
                ((ag) this.b).a.Q0.r();
                break;
            case 19:
                ((z2) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((on) this.b).b.dismiss();
                break;
            default:
                ((sm) this.b).a.A.r();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i10) {
        fq fqVar = ((gq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            fqVar.i(i10 == 2);
        } else if (i10 == 3) {
            fqVar.q();
        }
    }

    @Override // vd.e
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // vd.e
    public /* synthetic */ boolean k(float f9) {
        return false;
    }

    @Override // lh.e9
    public void l1(long j10, int i10, lh.j3 j3Var) {
        j3Var.run();
    }

    @Override // gh.o
    public void m(gh.k kVar, float f9, float f10) {
        ((ut) this.b).c(kVar, f9, f10);
    }

    @Override // org.telegram.ui.Components.nc0
    public void n(int i10) {
        x2 x2Var = (x2) this.b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var = ((rr) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && o1Var != null && o1Var.isShowing()) {
            o1Var.d(true);
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
        ml mlVar = (ml) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = mlVar.e;
        ni niVar = chatAttachAlertPhotoLayout.b;
        if (mlVar.a == null || niVar.R || chatAttachAlertPhotoLayout.L == null) {
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
            photoEntry = new MediaController.PhotoEntry(0, i13, 0L, mlVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
            photoEntry.duration = (int) (j10 / 1000.0f);
            photoEntry.thumbPath = str;
            if (niVar.M0 != 0) {
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
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, mlVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j10 / 1000.0f);
        photoEntry.thumbPath = str;
        if (niVar.M0 != 0 && chatAttachAlertPhotoLayout.L.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // fh.a
    public void p(Canvas canvas, int i10) {
        ((rb) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.oc0
    public void q(qc0 qc0Var, int i10) {
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

    @Override // vd.e
    public void w() {
        f6 f6Var = (f6) this.b;
        f6Var.b();
        f6Var.e();
    }

    @Override // vd.e
    public /* synthetic */ void a() {
    }

    @Override // lh.e9
    public /* synthetic */ void d(boolean z10) {
    }

    @Override // vd.e
    public /* synthetic */ void h(boolean z10) {
    }

    @Override // vd.e
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
