package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kj implements org.telegram.ui.ActionBar.t0, yu0, org.telegram.ui.Components.r60, gm {
    public final /* synthetic */ un a;

    public /* synthetic */ kj(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.yu0
    public void B0(MessageObject messageObject) {
        un unVar = this.a;
        unVar.x0.I0(true);
        unVar.x0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            unVar.j1.removeView(unVar.F8);
            unVar.F8 = null;
            unVar.I8 = null;
            unVar.H8 = null;
        }
        for (int i10 = 0; i10 < unVar.x0.getChildCount(); i10++) {
            if (unVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) unVar.x0.getChildAt(i10);
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                    s1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.yu0
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
                                qk qkVar = this.a.Ia;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                bv0 bv0Var = qkVar.d;
                                Bitmap bitmap = bv0Var == null ? null : bv0Var.b.getBitmap(width, height);
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.a.U7(true);
            MediaController mediaController = MediaController.getInstance();
            un unVar = this.a;
            mediaController.setTextureView(unVar.I8, unVar.H8, unVar.F8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.gm
    public void Q0(int i10) {
        this.a.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void b() {
        org.telegram.ui.Components.hn0.d(new we(this.a, 2));
    }

    @Override // org.telegram.ui.yu0
    public TextureView f0() {
        return this.a.I8;
    }

    @Override // org.telegram.ui.gm
    public void p0(String str) {
        this.a.na(str, false);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void a() {
    }

    @Override // org.telegram.ui.gm
    public /* synthetic */ void T(boolean z10, boolean z11) {
    }
}
