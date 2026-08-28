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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.b2, nk0, xb0, yb0, zb0, td.d, ImageReceiver.ImageReceiverDelegate, x4, r0.o, ch.a, t0.f, ok0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ih.i9, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.m1, dh.q {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        ((g8) this.b).V0(i9 * 60, i9 == 0 ? 71 : 70);
    }

    @Override // td.d
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // td.d
    public /* synthetic */ boolean I(float f10) {
        return false;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        cb cbVar = (cb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        bb bbVar = cbVar.a;
        if (bbVar != null) {
            bbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.b;
    }

    @Override // ih.i9
    public void T(long j10, int i9, ih.n3 n3Var) {
        n3Var.run();
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        Object O;
        fk fkVar = (fk) this.b;
        f2.r0 adapter = fkVar.r.getAdapter();
        yj yjVar = fkVar.v;
        if (adapter == yjVar) {
            O = yjVar.E(i9);
        } else {
            ek ekVar = fkVar.y;
            O = ekVar.O(ekVar.S(i9), ekVar.Q(i9));
        }
        return fkVar.O(view, O);
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        g0.O((g0) this.b, view, i9, f10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new e6((q6) obj, 1));
                duration.start();
                break;
            default:
                o9 o9Var = (o9) obj;
                o9Var.getClass();
                if (z10 && !z11) {
                    o9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        int i10 = this.a;
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // dh.q
    public void e(dh.l lVar, float f10, float f11) {
        ((ot) this.b).c(lVar, f10, f11);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                y.R((y) this.b, c2Var);
                break;
            case 2:
                ((org.telegram.ui.k6) this.b).run();
                break;
            case 3:
                ((bg.i2) this.b).run();
                break;
            case 4:
                ((ff.k0) this.b).run();
                break;
            case 5:
                ((s1) this.b).run();
                break;
            case 6:
                ((pr) this.b).run();
                break;
            case 8:
                ((m2) this.b).run();
                break;
            case 17:
                ((xf) this.b).a.Q0.r();
                break;
            case 19:
                ((org.telegram.ui.wq) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((jn) this.b).b.dismiss();
                break;
            default:
                ((nm) this.b).a.A.r();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.xb0
    public String g(int i9) {
        return ((String[]) this.b)[i9];
    }

    @Override // t0.f
    public boolean h(t0.j jVar, int i9, Bundle bundle) {
        dg dgVar = (dg) this.b;
        ChatActivityEnterView chatActivityEnterView = dgVar.d;
        if (chatActivityEnterView.g5) {
            return true;
        }
        int i10 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i9 & 1) != 0) {
            try {
                jVar.a.f();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.a;
        if (!iVar.j().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            dgVar.m(iVar.c(), iVar.j().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new g1(11, dgVar, jVar), chatActivityEnterView.R3);
            return true;
        }
        dgVar.o(jVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        bq bqVar = ((cq) this.b).a;
        if (i9 == 1 || i9 == 2) {
            bqVar.e(i9 == 2);
        } else if (i9 == 3) {
            bqVar.k();
        }
    }

    @Override // org.telegram.ui.Components.yb0
    public void j(int i9) {
        u2 u2Var = (u2) this.b;
        if (i9 == 0) {
            u2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var = ((nr) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && o1Var != null && o1Var.isShowing()) {
            o1Var.d(true);
        }
    }

    @Override // ch.a
    public void l(Canvas canvas, int i9) {
        ((lb) this.b).dispatchDrawImplBlur(canvas, i9);
    }

    @Override // org.telegram.ui.Components.zb0
    public void m(bc0 bc0Var, int i9) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.b;
        try {
            if (i9 == 0) {
                u3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                u3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override // td.d
    public void n1() {
        a6 a6Var = (a6) this.b;
        a6Var.b();
        a6Var.e();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i9 = this.a;
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        int i9;
        int i10;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        il ilVar = (il) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ilVar.e;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (ilVar.a == null || kiVar.R || chatAttachAlertPhotoLayout.L == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.m1 = false;
        try {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
            i9 = options.outWidth;
        } catch (Exception unused) {
            i9 = 0;
        }
        try {
            i10 = options.outHeight;
        } catch (Exception unused2) {
            i10 = 0;
            int i11 = i9;
            int i12 = ChatAttachAlertPhotoLayout.q1;
            ChatAttachAlertPhotoLayout.q1 = i12 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i12, 0L, ilVar.a.getAbsolutePath(), 0, true, i11, i10, 0L);
            photoEntry.duration = (int) (j10 / 1000.0f);
            photoEntry.thumbPath = str;
            if (kiVar.M0 != 0) {
                MediaController.CropState cropState = new MediaController.CropState();
                photoEntry.cropState = cropState;
                cropState.mirrored = true;
                cropState.freeform = false;
                cropState.lockedAspectRatio = 1.0f;
            }
            chatAttachAlertPhotoLayout.i0(photoEntry, false, false);
        }
        int i112 = i9;
        int i122 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout.q1 = i122 - 1;
        photoEntry = new MediaController.PhotoEntry(0, i122, 0L, ilVar.a.getAbsolutePath(), 0, true, i112, i10, 0L);
        photoEntry.duration = (int) (j10 / 1000.0f);
        photoEntry.thumbPath = str;
        if (kiVar.M0 != 0 && chatAttachAlertPhotoLayout.L.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.i0(photoEntry, false, false);
    }

    @Override // ih.i9
    public boolean y0(long j10, int i9, int i10, int i11, ih.j9 j9Var) {
        pn pnVar = (pn) ((org.telegram.ui.Cells.l6) this.b).T;
        ImageReceiver imageReceiver = pnVar.a;
        j9Var.c = imageReceiver;
        j9Var.l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = pnVar.C;
        j9Var.m = l6Var;
        boolean z10 = l6Var.w;
        pn pnVar2 = pnVar.G.e;
        j9Var.a = pnVar2;
        j9Var.k = pnVar2.getAlpha();
        j9Var.h = 0.0f;
        j9Var.i = AndroidUtilities.displaySize.y;
        j9Var.g = (View) pnVar.getParent();
        return true;
    }

    @Override // td.d
    public /* synthetic */ void D(boolean z10) {
    }

    @Override // td.d
    public /* synthetic */ void L() {
    }

    @Override // td.d
    public /* synthetic */ void b() {
    }

    @Override // ih.i9
    public /* synthetic */ void d(boolean z10) {
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
