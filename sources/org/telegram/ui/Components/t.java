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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements org.telegram.ui.ActionBar.c2, jl0, sc0, tc0, uc0, xd.d, ImageReceiver.ImageReceiverDelegate, y4, r0.o, hh.a, t0.e, kl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, nh.e9, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.n1, ih.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // nh.e9
    public void D0(long j10, int i10, nh.k3 k3Var) {
        k3Var.run();
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        ((g8) this.b).U0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        cb cbVar = (cb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        bb bbVar = cbVar.a;
        if (bbVar != null) {
            bbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.b;
    }

    @Override // nh.e9
    public boolean X0(long j10, int i10, int i11, int i12, nh.f9 f9Var) {
        vn vnVar = (vn) ((org.telegram.ui.Cells.l6) this.b).T;
        ImageReceiver imageReceiver = vnVar.a;
        f9Var.c = imageReceiver;
        f9Var.l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = vnVar.D;
        f9Var.m = l6Var;
        boolean z4 = l6Var.w;
        vn vnVar2 = vnVar.H.e;
        f9Var.a = vnVar2;
        f9Var.k = vnVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.i = AndroidUtilities.displaySize.y;
        f9Var.g = (View) vnVar.getParent();
        return true;
    }

    @Override // org.telegram.ui.Components.jl0
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

    @Override // org.telegram.ui.Components.sc0
    public String e(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        Object O;
        hk hkVar = (hk) this.b;
        f2.o0 adapter = hkVar.r.getAdapter();
        zj zjVar = hkVar.v;
        if (adapter == zjVar) {
            O = zjVar.E(i10);
        } else {
            gk gkVar = hkVar.y;
            O = gkVar.O(gkVar.S(i10), gkVar.Q(i10));
        }
        return hkVar.P(view, O);
    }

    @Override // xd.d
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                z.S((z) this.b, d2Var);
                break;
            case 2:
                ((org.telegram.ui.ih) this.b).run();
                break;
            case 3:
                ((gg.y1) this.b).run();
                break;
            case 4:
                ((lf.j0) this.b).run();
                break;
            case 5:
                ((u1) this.b).run();
                break;
            case 6:
                ((xr) this.b).run();
                break;
            case 8:
                ((o2) this.b).run();
                break;
            case 17:
                ((xf) this.b).a.R0.r();
                break;
            case 19:
                ((org.telegram.ui.hp) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((qn) this.b).b.dismiss();
                break;
            default:
                ((um) this.b).a.B.r();
                break;
        }
    }

    @Override // xd.d
    public /* synthetic */ boolean j(float f10) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void l(int i10) {
        jq jqVar = ((kq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            jqVar.k(i10 == 2);
        } else if (i10 == 3) {
            jqVar.z();
        }
    }

    @Override // org.telegram.ui.Components.tc0
    public void m(int i10) {
        u2 u2Var = (u2) this.b;
        if (i10 == 0) {
            u2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var = ((vr) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && p1Var != null && p1Var.isShowing()) {
            p1Var.d(true);
        }
    }

    @Override // ih.o
    public void o(ih.k kVar, float f10, float f11) {
        ((xt) this.b).c(kVar, f10, f11);
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
        nl nlVar = (nl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.e;
        li liVar = chatAttachAlertPhotoLayout.b;
        if (nlVar.a == null || liVar.S || chatAttachAlertPhotoLayout.M == null) {
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
            photoEntry = new MediaController.PhotoEntry(0, i13, 0L, nlVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
            photoEntry.duration = (int) (j10 / 1000.0f);
            photoEntry.thumbPath = str;
            if (liVar.N0 != 0) {
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
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, nlVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j10 / 1000.0f);
        photoEntry.thumbPath = str;
        if (liVar.N0 != 0 && chatAttachAlertPhotoLayout.M.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // hh.a
    public void p(Canvas canvas, int i10) {
        ((nb) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.uc0
    public void q(wc0 wc0Var, int i10) {
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
    public void u() {
        b6 b6Var = (b6) this.b;
        b6Var.b();
        b6Var.e();
    }

    @Override // xd.d
    public /* synthetic */ void a() {
    }

    @Override // nh.e9
    public /* synthetic */ void b(boolean z4) {
    }

    @Override // xd.d
    public /* synthetic */ void g(boolean z4) {
    }

    @Override // xd.d
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
    }
}
