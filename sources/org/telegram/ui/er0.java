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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class er0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ er0(ds0 ds0Var, int[] iArr, int[] iArr2, boolean z4, boolean z10, boolean z11) {
        this.e = ds0Var;
        this.f = iArr;
        this.h = iArr2;
        this.b = z4;
        this.c = z10;
        this.d = z11;
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
                Drawable[] drawableArr = PhotoViewer.Q8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i11 = photoViewer.S3;
                photoViewer.S3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z4 = this.b;
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, z4 ? 0 : ((Integer) imageOrientation.first).intValue(), z4, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.Z1 = 2;
                photoViewer.r2 = false;
                photoViewer.d = new qt0(photoViewer, photoViewer.d, messageObject, orientation, this.c, this.d);
                photoViewer.m1.l();
                if (photoViewer.R6 == null) {
                    photoViewer.R6 = VelocityTracker.obtain();
                }
                photoViewer.y7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                zn znVar = photoViewer.i4;
                if (znVar == null || znVar.V == null || !znVar.x9()) {
                    photoViewer.R1();
                } else {
                    photoViewer.i4.V.P();
                }
                photoViewer.I0.setAlpha(255);
                photoViewer.b0.setAlpha(1.0f);
                photoViewer.Y1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                photoViewer.M0.setTranslationY(AndroidUtilities.dp(photoViewer.o1 ? 154.0f : 96.0f));
                photoViewer.P0.setTranslationY(AndroidUtilities.dp(photoViewer.o1 ? 154.0f : 96.0f));
                photoViewer.C.setTranslationY(-r1.getHeight());
                photoViewer.N1.setTranslationY(AndroidUtilities.dp(photoViewer.o1 ? 154.0f : 96.0f));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.y7 = 0;
                break;
            default:
                ds0 ds0Var = (ds0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    iu0 iu0Var = ds0Var.b.b0;
                    boolean z10 = this.b;
                    int i14 = (this.c ? 1 : 0) + (z10 ? 1 : 0);
                    boolean z11 = this.d;
                    new org.telegram.ui.Components.qc(iu0Var, null).m(i14 + (z11 ? 1 : 0) > 1 ? org.telegram.ui.Components.pc.v : z11 ? i13 > 1 ? org.telegram.ui.Components.pc.s : org.telegram.ui.Components.pc.r : z10 ? i13 > 1 ? org.telegram.ui.Components.pc.n : org.telegram.ui.Components.pc.h : i13 > 1 ? org.telegram.ui.Components.pc.f : org.telegram.ui.Components.pc.e, i13, -115203550, -1, null).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ er0(PhotoViewer photoViewer, File file, boolean z4, MessageObject messageObject, boolean z10, boolean z11) {
        this.e = photoViewer;
        this.f = file;
        this.b = z4;
        this.h = messageObject;
        this.c = z10;
        this.d = z11;
    }
}
