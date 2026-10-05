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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class oj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.d6, gv0, org.telegram.ui.Components.i60, km {
    public final /* synthetic */ yn a;

    public /* synthetic */ oj(yn ynVar) {
        this.a = ynVar;
    }

    @Override // org.telegram.ui.gv0
    public void G0(MessageObject messageObject) {
        yn ynVar = this.a;
        ynVar.v0.J0(true);
        ynVar.v0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            ynVar.V0.removeView(ynVar.r8);
            ynVar.r8 = null;
            ynVar.u8 = null;
            ynVar.t8 = null;
        }
        for (int i10 = 0; i10 < ynVar.v0.getChildCount(); i10++) {
            if (ynVar.v0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ynVar.v0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint H(String str) {
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int H0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.gv0
    public void I(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.v0.getChildCount(); i10++) {
                if (this.a.v0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.a.v0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.d6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                sk skVar = this.a.ua;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                jv0 jv0Var = skVar.d;
                                Bitmap bitmap = jv0Var == null ? null : jv0Var.b.getBitmap(width, height);
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
            yn ynVar = this.a;
            mediaController.setTextureView(ynVar.u8, ynVar.t8, ynVar.r8, true);
        }
        this.a.v0.invalidate();
    }

    @Override // org.telegram.ui.km
    public void S0(int i10) {
        this.a.D(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        org.telegram.ui.Components.sm0.d(new cf(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int j0(int i10) {
        return H0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int j1(int i10) {
        return H0(i10);
    }

    @Override // org.telegram.ui.gv0
    public TextureView k0() {
        return this.a.u8;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ boolean r0() {
        return false;
    }

    @Override // org.telegram.ui.km
    public void u0(String str) {
        this.a.ca(str, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.v3;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.km
    public /* synthetic */ void X(boolean z10, boolean z11) {
    }
}
