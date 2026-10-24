package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g3 extends cu0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ k4 c;

    public g3(k4 k4Var, List list) {
        this.c = k4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void D() {
        this.c.n();
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        List list = this.b;
        if (i10 >= list.size()) {
            return null;
        }
        k4 k4Var = this.c;
        ei.v vVar = k4Var.u0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i10);
        int[] iArr = this.a;
        ImageReceiver d02 = d0(vVar, pageBlock, iArr);
        if (d02 == null) {
            return null;
        }
        mu0 mu0Var = new mu0();
        mu0Var.b = iArr[0];
        mu0Var.c = iArr[1];
        mu0Var.d = k4Var.u0[0].b;
        mu0Var.a = d02;
        mu0Var.e = d02.getBitmapSafe();
        mu0Var.h = d02.getRoundRadius(true);
        mu0Var.j = k4Var.J0;
        return mu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(int i10) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.j81 j81Var;
        TextureView textureView;
        a0.h hVar;
        int i11;
        int childCount;
        z2 z2Var;
        Bitmap bitmap;
        z2 z2Var2;
        Bitmap bitmap2;
        y2 y2Var = null;
        if (i10 >= 0) {
            List list = this.b;
            if (i10 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i10);
                j81Var = PhotoViewer.u1().F2;
                textureView = PhotoViewer.u1().B2;
                SurfaceView surfaceView = PhotoViewer.u1().C2;
                k4 k4Var = this.c;
                n3[] n3VarArr = k4Var.u0;
                hVar = k4Var.y;
                i11 = 0;
                ei.v vVar = n3VarArr[0].b;
                childCount = vVar.getChildCount();
                while (true) {
                    if (i11 < childCount) {
                        break;
                    }
                    View childAt = vVar.getChildAt(i11);
                    if (childAt instanceof y2) {
                        y2 y2Var2 = (y2) childAt;
                        if (y2Var2.L == pageBlock) {
                            y2Var = y2Var2;
                            break;
                        }
                    }
                    i11++;
                }
                if (y2Var != null && j81Var != null && textureView != null) {
                    long j10 = y2Var.L.video_id;
                    z2 z2Var3 = new z2();
                    z2Var3.a = j81Var.n();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                            surface.release();
                            z2Var3.b = createBitmap;
                        } else {
                            z2Var3.b = textureView.getBitmap();
                        }
                    }
                    y2Var.c(z2Var3);
                    hVar.k(z2Var3, j10);
                    int i12 = y2.V;
                    y2Var.n.setAlpha(0.0f);
                    z2Var2 = y2Var.M;
                    if (z2Var2 != null && (bitmap2 = z2Var2.b) != null) {
                        y2Var.e.setImageBitmap(bitmap2);
                    }
                }
                if (y2Var != null && j81Var != null && surfaceView != null) {
                    long j11 = y2Var.L.video_id;
                    z2 z2Var4 = new z2();
                    z2Var4.a = j81Var.n();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap2);
                        z2Var4.b = createBitmap2;
                    }
                    y2Var.c(z2Var4);
                    hVar.k(z2Var4, j11);
                    int i13 = y2.V;
                    y2Var.n.setAlpha(0.0f);
                    z2Var = y2Var.M;
                    if (z2Var != null && (bitmap = z2Var.b) != null) {
                        y2Var.e.setImageBitmap(bitmap);
                    }
                }
                k4Var.n();
            }
        }
        pageBlock = null;
        j81Var = PhotoViewer.u1().F2;
        textureView = PhotoViewer.u1().B2;
        SurfaceView surfaceView2 = PhotoViewer.u1().C2;
        k4 k4Var2 = this.c;
        n3[] n3VarArr2 = k4Var2.u0;
        hVar = k4Var2.y;
        i11 = 0;
        ei.v vVar2 = n3VarArr2[0].b;
        childCount = vVar2.getChildCount();
        while (true) {
            if (i11 < childCount) {
            }
            i11++;
        }
        if (y2Var != null) {
            long j102 = y2Var.L.video_id;
            z2 z2Var32 = new z2();
            z2Var32.a = j81Var.n();
            if (textureView.getSurfaceTexture() != null) {
            }
            y2Var.c(z2Var32);
            hVar.k(z2Var32, j102);
            int i122 = y2.V;
            y2Var.n.setAlpha(0.0f);
            z2Var2 = y2Var.M;
            if (z2Var2 != null) {
                y2Var.e.setImageBitmap(bitmap2);
            }
        }
        if (y2Var != null) {
            long j112 = y2Var.L.video_id;
            z2 z2Var42 = new z2();
            z2Var42.a = j81Var.n();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            y2Var.c(z2Var42);
            hVar.k(z2Var42, j112);
            int i132 = y2.V;
            y2Var.n.setAlpha(0.0f);
            z2Var = y2Var.M;
            if (z2Var != null) {
                y2Var.e.setImageBitmap(bitmap);
            }
        }
        k4Var2.n();
    }

    public final ImageReceiver d0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ImageReceiver e02 = e0(viewGroup.getChildAt(i10), pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    public final ImageReceiver e0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.wl0 wl0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof e2) {
            e2 e2Var = (e2) view;
            if (e2Var.N != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return e2Var.e;
        }
        if (view instanceof y2) {
            y2 y2Var = (y2) view;
            ImageReceiver imageReceiver = y2Var.e;
            TextureView textureView = y2Var.n;
            if (y2Var.L != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            k4 k4Var = this.c;
            if (y2Var == k4Var.x && (videoPlayerHolderBase = k4Var.w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    imageReceiver.setImageBitmap(createBitmap);
                } else {
                    imageReceiver.setImageBitmap(textureView.getBitmap());
                }
                int i10 = y2.V;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof l1) {
            ImageReceiver d02 = d0(((l1) view).a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        }
        if (view instanceof r2) {
            ImageReceiver d03 = d0(((r2) view).b, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        }
        if (view instanceof z1) {
            org.telegram.ui.Components.wl0 wl0Var2 = ((z1) view).d;
            if (wl0Var2 == null || (e03 = e0(wl0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return e03;
        }
        if (!(view instanceof c2) || (wl0Var = ((c2) view).d) == null || (e02 = e0(wl0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return e02;
    }
}
