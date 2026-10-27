package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nj implements org.telegram.ui.ActionBar.t0, av0, org.telegram.ui.Components.s60, im {
    public final /* synthetic */ wn a;

    public /* synthetic */ nj(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.av0
    public void B0(MessageObject messageObject) {
        wn wnVar = this.a;
        wnVar.x0.I0(true);
        wnVar.x0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            wnVar.j1.removeView(wnVar.J8);
            wnVar.J8 = null;
            wnVar.M8 = null;
            wnVar.L8 = null;
        }
        for (int i10 = 0; i10 < wnVar.x0.getChildCount(); i10++) {
            if (wnVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) wnVar.x0.getChildAt(i10);
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                    s1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.av0
    public void E(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.x0.getChildCount(); i10++) {
                if (this.a.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.a.x0.getChildAt(i10);
                    if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.g6 animation = s1Var.getPhotoImage().getAnimation();
                        if (animation.b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                sk skVar = this.a.Ma;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                dv0 dv0Var = skVar.d;
                                Bitmap bitmap = dv0Var == null ? null : dv0Var.b.getBitmap(width, height);
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.a.W7(true);
            MediaController mediaController = MediaController.getInstance();
            wn wnVar = this.a;
            mediaController.setTextureView(wnVar.M8, wnVar.L8, wnVar.J8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.im
    public void Q0(int i10) {
        this.a.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void b() {
        org.telegram.ui.Components.in0.d(new xe(this.a, 2));
    }

    @Override // org.telegram.ui.av0
    public TextureView f0() {
        return this.a.M8;
    }

    @Override // org.telegram.ui.im
    public void p0(String str) {
        this.a.qa(str, false);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void a() {
    }

    @Override // org.telegram.ui.im
    public /* synthetic */ void T(boolean z10, boolean z11) {
    }
}
