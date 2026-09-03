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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mj implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.g6, yu0, km {
    public final /* synthetic */ xn a;

    public /* synthetic */ mj(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int B0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.k6.S0(str);
    }

    @Override // org.telegram.ui.yu0
    public void G(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.u0.getChildCount(); i10++) {
                if (this.a.u0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.a.u0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.y5 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.Y) {
                            animation.stop();
                        }
                        Bitmap m9 = animation.m();
                        if (m9 != null) {
                            try {
                                sk skVar = this.a.ta;
                                int width = m9.getWidth();
                                int height = m9.getHeight();
                                bv0 bv0Var = skVar.d;
                                Bitmap bitmap = bv0Var == null ? null : bv0Var.b.getBitmap(width, height);
                                new Canvas(m9).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
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
            xn xnVar = this.a;
            mediaController.setTextureView(xnVar.t8, xnVar.s8, xnVar.q8, true);
        }
        this.a.u0.invalidate();
    }

    @Override // org.telegram.ui.km
    public void O0(int i10) {
        this.a.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int Z0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        org.telegram.ui.Components.im0.d(new we(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int e0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.yu0
    public TextureView h0() {
        return this.a.t8;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.km
    public void t0(String str) {
        this.a.da(str, false);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.yu0
    public void y0(MessageObject messageObject) {
        xn xnVar = this.a;
        xnVar.u0.I0(true);
        xnVar.u0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            xnVar.U0.removeView(xnVar.q8);
            xnVar.q8 = null;
            xnVar.t8 = null;
            xnVar.s8 = null;
        }
        for (int i10 = 0; i10 < xnVar.u0.getChildCount(); i10++) {
            if (xnVar.u0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) xnVar.u0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.km
    public /* synthetic */ void W(boolean z4, boolean z10) {
    }
}
