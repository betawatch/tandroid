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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class h3 extends bu0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ l4 c;

    public h3(l4 l4Var, List list) {
        this.c = l4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void D() {
        this.c.n();
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        List list = this.b;
        if (i10 >= list.size()) {
            return null;
        }
        l4 l4Var = this.c;
        ei.v vVar = l4Var.u0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i10);
        int[] iArr = this.a;
        ImageReceiver d02 = d0(vVar, pageBlock, iArr);
        if (d02 == null) {
            return null;
        }
        lu0 lu0Var = new lu0();
        lu0Var.b = iArr[0];
        lu0Var.c = iArr[1];
        lu0Var.d = l4Var.u0[0].b;
        lu0Var.a = d02;
        lu0Var.e = d02.getBitmapSafe();
        lu0Var.h = d02.getRoundRadius(true);
        lu0Var.j = l4Var.I0;
        return lu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(int i10) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.a81 a81Var;
        TextureView textureView;
        a0.h hVar;
        int i11;
        int childCount;
        a3 a3Var;
        Bitmap bitmap;
        a3 a3Var2;
        Bitmap bitmap2;
        z2 z2Var = null;
        if (i10 >= 0) {
            List list = this.b;
            if (i10 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i10);
                a81Var = PhotoViewer.t1().F2;
                textureView = PhotoViewer.t1().B2;
                SurfaceView surfaceView = PhotoViewer.t1().C2;
                l4 l4Var = this.c;
                o3[] o3VarArr = l4Var.u0;
                hVar = l4Var.y;
                i11 = 0;
                ei.v vVar = o3VarArr[0].b;
                childCount = vVar.getChildCount();
                while (true) {
                    if (i11 < childCount) {
                        break;
                    }
                    View childAt = vVar.getChildAt(i11);
                    if (childAt instanceof z2) {
                        z2 z2Var2 = (z2) childAt;
                        if (z2Var2.L == pageBlock) {
                            z2Var = z2Var2;
                            break;
                        }
                    }
                    i11++;
                }
                if (z2Var != null && a81Var != null && textureView != null) {
                    long j10 = z2Var.L.video_id;
                    a3 a3Var3 = new a3();
                    a3Var3.a = a81Var.n();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                            surface.release();
                            a3Var3.b = createBitmap;
                        } else {
                            a3Var3.b = textureView.getBitmap();
                        }
                    }
                    z2Var.c(a3Var3);
                    hVar.k(a3Var3, j10);
                    int i12 = z2.V;
                    z2Var.n.setAlpha(0.0f);
                    a3Var2 = z2Var.M;
                    if (a3Var2 != null && (bitmap2 = a3Var2.b) != null) {
                        z2Var.e.setImageBitmap(bitmap2);
                    }
                }
                if (z2Var != null && a81Var != null && surfaceView != null) {
                    long j11 = z2Var.L.video_id;
                    a3 a3Var4 = new a3();
                    a3Var4.a = a81Var.n();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap2);
                        a3Var4.b = createBitmap2;
                    }
                    z2Var.c(a3Var4);
                    hVar.k(a3Var4, j11);
                    int i13 = z2.V;
                    z2Var.n.setAlpha(0.0f);
                    a3Var = z2Var.M;
                    if (a3Var != null && (bitmap = a3Var.b) != null) {
                        z2Var.e.setImageBitmap(bitmap);
                    }
                }
                l4Var.n();
            }
        }
        pageBlock = null;
        a81Var = PhotoViewer.t1().F2;
        textureView = PhotoViewer.t1().B2;
        SurfaceView surfaceView2 = PhotoViewer.t1().C2;
        l4 l4Var2 = this.c;
        o3[] o3VarArr2 = l4Var2.u0;
        hVar = l4Var2.y;
        i11 = 0;
        ei.v vVar2 = o3VarArr2[0].b;
        childCount = vVar2.getChildCount();
        while (true) {
            if (i11 < childCount) {
            }
            i11++;
        }
        if (z2Var != null) {
            long j102 = z2Var.L.video_id;
            a3 a3Var32 = new a3();
            a3Var32.a = a81Var.n();
            if (textureView.getSurfaceTexture() != null) {
            }
            z2Var.c(a3Var32);
            hVar.k(a3Var32, j102);
            int i122 = z2.V;
            z2Var.n.setAlpha(0.0f);
            a3Var2 = z2Var.M;
            if (a3Var2 != null) {
                z2Var.e.setImageBitmap(bitmap2);
            }
        }
        if (z2Var != null) {
            long j112 = z2Var.L.video_id;
            a3 a3Var42 = new a3();
            a3Var42.a = a81Var.n();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            z2Var.c(a3Var42);
            hVar.k(a3Var42, j112);
            int i132 = z2.V;
            z2Var.n.setAlpha(0.0f);
            a3Var = z2Var.M;
            if (a3Var != null) {
                z2Var.e.setImageBitmap(bitmap);
            }
        }
        l4Var2.n();
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
        org.telegram.ui.Components.sl0 sl0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof f2) {
            f2 f2Var = (f2) view;
            if (f2Var.N != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return f2Var.e;
        }
        if (view instanceof z2) {
            z2 z2Var = (z2) view;
            ImageReceiver imageReceiver = z2Var.e;
            TextureView textureView = z2Var.n;
            if (z2Var.L != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            l4 l4Var = this.c;
            if (z2Var == l4Var.x && (videoPlayerHolderBase = l4Var.w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    imageReceiver.setImageBitmap(createBitmap);
                } else {
                    imageReceiver.setImageBitmap(textureView.getBitmap());
                }
                int i10 = z2.V;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof m1) {
            ImageReceiver d02 = d0(((m1) view).a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        }
        if (view instanceof s2) {
            ImageReceiver d03 = d0(((s2) view).a, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        }
        if (view instanceof a2) {
            org.telegram.ui.Components.sl0 sl0Var2 = ((a2) view).d;
            if (sl0Var2 == null || (e03 = e0(sl0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return e03;
        }
        if (!(view instanceof d2) || (sl0Var = ((d2) view).d) == null || (e02 = e0(sl0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return e02;
    }
}
