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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.c6, ku0, em {
    public final /* synthetic */ rn a;

    public /* synthetic */ gj(rn rnVar) {
        this.a = rnVar;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ku0
    public TextureView K() {
        return this.a.s8;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint N(String str) {
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int N0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.em
    public void P0(int i10) {
        this.a.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void d() {
        org.telegram.ui.Components.ol0.d(new re(this.a, 2));
    }

    @Override // org.telegram.ui.em
    public void g0(String str) {
        this.a.da(str, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void m(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int o1(int i10) {
        return N0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int q0(int i10) {
        return N0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean u0() {
        return false;
    }

    @Override // org.telegram.ui.ku0
    public void w0(MessageObject messageObject) {
        rn rnVar = this.a;
        rnVar.t0.I0(true);
        rnVar.t0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            rnVar.T0.removeView(rnVar.p8);
            rnVar.p8 = null;
            rnVar.s8 = null;
            rnVar.r8 = null;
        }
        for (int i10 = 0; i10 < rnVar.t0.getChildCount(); i10++) {
            if (rnVar.t0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) rnVar.t0.getChildAt(i10);
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                    s1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ku0
    public void y(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.t0.getChildCount(); i10++) {
                if (this.a.t0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.a.t0.getChildAt(i10);
                    if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.x5 animation = s1Var.getPhotoImage().getAnimation();
                        if (animation.X) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                lk lkVar = this.a.sa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                nu0 nu0Var = lkVar.d;
                                Bitmap bitmap = nu0Var == null ? null : nu0Var.b.getBitmap(width, height);
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                        }
                    }
                }
            }
            this.a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            rn rnVar = this.a;
            mediaController.setTextureView(rnVar.s8, rnVar.r8, rnVar.p8, true);
        }
        this.a.t0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
    }

    @Override // org.telegram.ui.em
    public /* synthetic */ void E(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void c1(int i10, int i11) {
    }
}
