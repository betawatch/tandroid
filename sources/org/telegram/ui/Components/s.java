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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.a2, bl0, pc0, qc0, rc0, le.g, ImageReceiver.ImageReceiverDelegate, d5, r0.n, uh.a, t0.e, cl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.fc, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, vh.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.g
    public void E() {
        g6 g6Var = (g6) this.b;
        g6Var.b();
        g6Var.e();
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        ((n8) this.b).U0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        lb lbVar = (lb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        kb kbVar = lbVar.a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.b;
    }

    @Override // ai.fc
    public void Z(long j3, int i10, ai.d5 d5Var) {
        d5Var.run();
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.b, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        Object O;
        pk pkVar = (pk) this.b;
        s4.h0 adapter = pkVar.r.getAdapter();
        ik ikVar = pkVar.v;
        if (adapter == ikVar) {
            O = ikVar.E(i10);
        } else {
            ok okVar = pkVar.y;
            O = okVar.O(okVar.S(i10), okVar.Q(i10));
        }
        return pkVar.P(view, O);
    }

    @Override // org.telegram.ui.Components.bl0
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
                duration.addUpdateListener(new k6((w6) obj, 1));
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
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.pc0
    public String e(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                y.S((y) this.b, b2Var);
                break;
            case 2:
                ((org.telegram.ui.ActionBar.m5) this.b).run();
                break;
            case 3:
                ((ai.j) this.b).run();
                break;
            case 4:
                ((ai.cb) this.b).run();
                break;
            case 5:
                ((t1) this.b).run();
                break;
            case 6:
                ((as) this.b).run();
                break;
            case 8:
                ((p2) this.b).run();
                break;
            case 17:
                ((gg) this.b).a.U0.r();
                break;
            case 19:
                ((org.telegram.ui.rh) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((vn) this.b).b.dismiss();
                break;
            default:
                ((ym) this.b).a.E.r();
                break;
        }
    }

    @Override // ai.fc
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        ao aoVar = (ao) ((org.telegram.ui.Cells.m6) this.b).T;
        ImageReceiver imageReceiver = aoVar.a;
        gcVar.c = imageReceiver;
        gcVar.l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = aoVar.G;
        gcVar.m = m6Var;
        boolean z10 = m6Var.w;
        ao aoVar2 = aoVar.K.e;
        gcVar.a = aoVar2;
        gcVar.k = aoVar2.getAlpha();
        gcVar.h = 0.0f;
        gcVar.i = AndroidUtilities.displaySize.y;
        gcVar.g = (View) aoVar.getParent();
        return true;
    }

    @Override // t0.e
    public boolean h(t0.i iVar, int i10, Bundle bundle) {
        mg mgVar = (mg) this.b;
        ChatActivityEnterView chatActivityEnterView = mgVar.d;
        if (chatActivityEnterView.l5) {
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
            mgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new b3(2, mgVar, iVar), chatActivityEnterView.V3);
            return true;
        }
        mgVar.o(iVar, true, 0, 0);
        return true;
    }

    @Override // le.g
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // vh.l
    public void j(vh.h hVar, float f7, float f10) {
        ((eu) this.b).c(hVar, f7, f10);
    }

    @Override // le.g
    public /* synthetic */ boolean k(float f7) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        mq mqVar = ((nq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            mqVar.l(i10 == 2);
        } else if (i10 == 3) {
            mqVar.y();
        }
    }

    @Override // org.telegram.ui.Components.qc0
    public void n(int i10) {
        w2 w2Var = (w2) this.b;
        if (i10 == 0) {
            w2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((yr) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        sl slVar = (sl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.e;
        wi wiVar = chatAttachAlertPhotoLayout.b;
        if (slVar.a == null || wiVar.V || chatAttachAlertPhotoLayout.P == null) {
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
            photoEntry = new MediaController.PhotoEntry(0, i13, 0L, slVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
            photoEntry.duration = (int) (j3 / 1000.0f);
            photoEntry.thumbPath = str;
            if (wiVar.Q0 != 0) {
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
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, slVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j3 / 1000.0f);
        photoEntry.thumbPath = str;
        if (wiVar.Q0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // uh.a
    public void p(Canvas canvas, int i10) {
        ((ub) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.rc0
    public void q(tc0 tc0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.b;
        try {
            if (i10 == 0) {
                u3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                u3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override // le.g
    public /* synthetic */ void a() {
    }

    @Override // ai.fc
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // le.g
    public /* synthetic */ void g(boolean z10) {
    }

    @Override // le.g
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
