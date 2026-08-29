package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hj implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.c6, hu0, fm {
    public final /* synthetic */ tn a;

    public /* synthetic */ hj(tn tnVar) {
        this.a = tnVar;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int C0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.hu0
    public void D(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.t0.getChildCount(); i10++) {
                if (this.a.t0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.a.t0.getChildAt(i10);
                    if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.c6 animation = s1Var.getPhotoImage().getAnimation();
                        if (animation.X) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                mk mkVar = this.a.sa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                ku0 ku0Var = mkVar.d;
                                Bitmap bitmap = ku0Var == null ? null : ku0Var.b.getBitmap(width, height);
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            tn tnVar = this.a;
            mediaController.setTextureView(tnVar.s8, tnVar.r8, tnVar.p8, true);
        }
        this.a.t0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override // org.telegram.ui.fm
    public void Q0(int i10) {
        this.a.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override // org.telegram.ui.hu0
    public TextureView b0() {
        return this.a.s8;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        org.telegram.ui.Components.yl0.d(new pe(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int g1(int i10) {
        return C0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int h0(int i10) {
        return C0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f9, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.fm
    public void q0(String str) {
        this.a.da(str, false);
    }

    @Override // org.telegram.ui.hu0
    public void x0(MessageObject messageObject) {
        tn tnVar = this.a;
        tnVar.t0.I0(true);
        tnVar.t0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            tnVar.T0.removeView(tnVar.p8);
            tnVar.p8 = null;
            tnVar.s8 = null;
            tnVar.r8 = null;
        }
        for (int i10 = 0; i10 < tnVar.t0.getChildCount(); i10++) {
            if (tnVar.t0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) tnVar.t0.getChildAt(i10);
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                    s1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void b() {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.fm
    public /* synthetic */ void U(boolean z10, boolean z11) {
    }
}
