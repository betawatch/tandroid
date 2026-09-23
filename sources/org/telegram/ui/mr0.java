package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mr0(ls0 ls0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = ls0Var;
        this.f = iArr;
        this.h = iArr2;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i11 = photoViewer.V3;
                photoViewer.V3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.b;
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, z10 ? 0 : ((Integer) imageOrientation.first).intValue(), z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.c2 = 2;
                photoViewer.u2 = false;
                photoViewer.d = new xt0(photoViewer, photoViewer.d, messageObject, orientation, this.c, this.d);
                photoViewer.p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.o3(false, false);
                photoViewer.i3(true, false);
                xn xnVar = photoViewer.l4;
                if (xnVar == null || xnVar.Y == null || !xnVar.x9()) {
                    photoViewer.R1();
                } else {
                    photoViewer.l4.Y.Q();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.e0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                photoViewer.P0.setTranslationY(AndroidUtilities.dp(photoViewer.r1 ? 154.0f : 96.0f));
                photoViewer.S0.setTranslationY(AndroidUtilities.dp(photoViewer.r1 ? 154.0f : 96.0f));
                photoViewer.F.setTranslationY(-r1.getHeight());
                photoViewer.Q1.setTranslationY(AndroidUtilities.dp(photoViewer.r1 ? 154.0f : 96.0f));
                photoViewer.K0();
                photoViewer.f3();
                photoViewer.B7 = 0;
                break;
            default:
                ls0 ls0Var = (ls0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    ou0 ou0Var = ls0Var.b.e0;
                    boolean z11 = this.b;
                    int i14 = (this.c ? 1 : 0) + (z11 ? 1 : 0);
                    boolean z12 = this.d;
                    new org.telegram.ui.Components.xc(ou0Var, null).m(i14 + (z12 ? 1 : 0) > 1 ? org.telegram.ui.Components.wc.v : z12 ? i13 > 1 ? org.telegram.ui.Components.wc.s : org.telegram.ui.Components.wc.r : z11 ? i13 > 1 ? org.telegram.ui.Components.wc.n : org.telegram.ui.Components.wc.h : i13 > 1 ? org.telegram.ui.Components.wc.f : org.telegram.ui.Components.wc.e, i13, -115203550, -1, null).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f = file;
        this.b = z10;
        this.h = messageObject;
        this.c = z11;
        this.d = z12;
    }
}
