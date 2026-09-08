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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements org.telegram.ui.ActionBar.a2, al0, rc0, sc0, tc0, le.f, ImageReceiver.ImageReceiverDelegate, d5, r0.n, vh.a, t0.f, bl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, bi.lb, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, wh.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // bi.lb
    public boolean H0(long j3, int i10, int i11, int i12, bi.mb mbVar) {
        yn ynVar = (yn) ((org.telegram.ui.Cells.l6) this.b).T;
        ImageReceiver imageReceiver = ynVar.a;
        mbVar.c = imageReceiver;
        mbVar.l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = ynVar.G;
        mbVar.m = l6Var;
        boolean z10 = l6Var.w;
        yn ynVar2 = ynVar.K.e;
        mbVar.a = ynVar2;
        mbVar.k = ynVar2.getAlpha();
        mbVar.h = 0.0f;
        mbVar.i = AndroidUtilities.displaySize.y;
        mbVar.g = (View) ynVar.getParent();
        return true;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        ((p8) this.b).Y0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        lb lbVar = (lb) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        kb kbVar = lbVar.a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        Object O;
        ok okVar = (ok) this.b;
        s4.h0 adapter = okVar.r.getAdapter();
        hk hkVar = okVar.v;
        if (adapter == hkVar) {
            O = hkVar.E(i10);
        } else {
            nk nkVar = okVar.y;
            O = nkVar.O(nkVar.S(i10), nkVar.Q(i10));
        }
        return okVar.P(view, O);
    }

    @Override // org.telegram.ui.Components.sc0
    public void b(int i10) {
        x2 x2Var = (x2) this.b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        h0.P((h0) this.b, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.al0
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
                duration.addUpdateListener(new l6((x6) obj, 1));
                duration.start();
                break;
            default:
                x9 x9Var = (x9) obj;
                x9Var.getClass();
                if (z10 && !z11) {
                    x9Var.a();
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

    @Override // org.telegram.ui.Components.rc0
    public String f(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                z.S((z) this.b, b2Var);
                break;
            case 2:
                ((org.telegram.ui.ActionBar.n5) this.b).run();
                break;
            case 3:
                ((bi.g) this.b).run();
                break;
            case 4:
                ((bi.ia) this.b).run();
                break;
            case 5:
                ((u1) this.b).run();
                break;
            case 6:
                ((yr) this.b).run();
                break;
            case 8:
                ((q2) this.b).run();
                break;
            case 17:
                ((hg) this.b).a.U0.r();
                break;
            case 19:
                ((uc) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((tn) this.b).b.dismiss();
                break;
            default:
                ((wm) this.b).a.E.r();
                break;
        }
    }

    @Override // le.f
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // le.f
    public /* synthetic */ boolean j(float f7) {
        return false;
    }

    @Override // t0.f
    public boolean l(t0.j jVar, int i10, Bundle bundle) {
        ng ngVar = (ng) this.b;
        ChatActivityEnterView chatActivityEnterView = ngVar.d;
        if (chatActivityEnterView.k5) {
            return true;
        }
        int i11 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                jVar.a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.a;
        if (!iVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            ngVar.m(iVar.c(), iVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new b3(2, ngVar, jVar), chatActivityEnterView.V3);
            return true;
        }
        ngVar.o(jVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        kq kqVar = ((lq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            kqVar.k(i10 == 2);
        } else if (i10 == 3) {
            kqVar.z();
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((wr) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override // wh.l
    public void o(wh.h hVar, float f7, float f10) {
        ((bu) this.b).c(hVar, f7, f10);
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
        rl rlVar = (rl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.e;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (rlVar.a == null || viVar.V || chatAttachAlertPhotoLayout.P == null) {
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
            photoEntry = new MediaController.PhotoEntry(0, i13, 0L, rlVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
            photoEntry.duration = (int) (j3 / 1000.0f);
            photoEntry.thumbPath = str;
            if (viVar.Q0 != 0) {
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
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, rlVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j3 / 1000.0f);
        photoEntry.thumbPath = str;
        if (viVar.Q0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // bi.lb
    public void p(long j3, int i10, bi.p4 p4Var) {
        p4Var.run();
    }

    @Override // le.f
    public void q() {
        g6 g6Var = (g6) this.b;
        g6Var.b();
        g6Var.e();
    }

    @Override // vh.a
    public void r(Canvas canvas, int i10) {
        ((ub) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.tc0
    public void s(vc0 vc0Var, int i10) {
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
    public /* synthetic */ void c() {
    }

    @Override // bi.lb
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // le.f
    public /* synthetic */ void h(boolean z10) {
    }

    @Override // le.f
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
