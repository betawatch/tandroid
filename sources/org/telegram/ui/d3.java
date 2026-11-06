package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d3 extends mq0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ g4 c;

    public d3(g4 g4Var, List list) {
        this.c = g4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void D() {
        this.c.l();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        if (i7 < 0) {
            return null;
        }
        List list = this.b;
        if (i7 >= list.size()) {
            return null;
        }
        g4 g4Var = this.c;
        fi.v vVar = g4Var.u0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i7);
        int[] iArr = this.a;
        ImageReceiver d02 = d0(vVar, pageBlock, iArr);
        if (d02 == null) {
            return null;
        }
        vq0 vq0Var = new vq0();
        vq0Var.b = iArr[0];
        vq0Var.c = iArr[1];
        vq0Var.d = g4Var.u0[0].b;
        vq0Var.a = d02;
        vq0Var.e = d02.p();
        vq0Var.h = d02.E();
        vq0Var.j = g4Var.J0;
        return vq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(int i7) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.n51 n51Var;
        TextureView textureView;
        a0.h hVar;
        int i10;
        int childCount;
        w2 w2Var;
        Bitmap bitmap;
        w2 w2Var2;
        Bitmap bitmap2;
        v2 v2Var = null;
        if (i7 >= 0) {
            List list = this.b;
            if (i7 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i7);
                n51Var = PhotoViewer.p1().F2;
                textureView = PhotoViewer.p1().B2;
                SurfaceView surfaceView = PhotoViewer.p1().C2;
                g4 g4Var = this.c;
                k3[] k3VarArr = g4Var.u0;
                hVar = g4Var.D;
                i10 = 0;
                fi.v vVar = k3VarArr[0].b;
                childCount = vVar.getChildCount();
                while (true) {
                    if (i10 < childCount) {
                        break;
                    }
                    View childAt = vVar.getChildAt(i10);
                    if (childAt instanceof v2) {
                        v2 v2Var2 = (v2) childAt;
                        if (v2Var2.L == pageBlock) {
                            v2Var = v2Var2;
                            break;
                        }
                    }
                    i10++;
                }
                if (v2Var != null && n51Var != null && textureView != null) {
                    long j3 = v2Var.L.video_id;
                    w2 w2Var3 = new w2();
                    w2Var3.a = n51Var.S();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            org.telegram.messenger.g0.y0(surface, createBitmap);
                            surface.release();
                            w2Var3.b = createBitmap;
                        } else {
                            w2Var3.b = textureView.getBitmap();
                        }
                    }
                    v2Var.c(w2Var3);
                    hVar.k(w2Var3, j3);
                    int i11 = v2.V;
                    v2Var.n.setAlpha(0.0f);
                    w2Var2 = v2Var.M;
                    if (w2Var2 != null && (bitmap2 = w2Var2.b) != null) {
                        v2Var.e.v0(bitmap2);
                    }
                }
                if (v2Var != null && n51Var != null && surfaceView != null) {
                    long j10 = v2Var.L.video_id;
                    w2 w2Var4 = new w2();
                    w2Var4.a = n51Var.S();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        org.telegram.messenger.g0.z0(surfaceView, createBitmap2);
                        w2Var4.b = createBitmap2;
                    }
                    v2Var.c(w2Var4);
                    hVar.k(w2Var4, j10);
                    int i12 = v2.V;
                    v2Var.n.setAlpha(0.0f);
                    w2Var = v2Var.M;
                    if (w2Var != null && (bitmap = w2Var.b) != null) {
                        v2Var.e.v0(bitmap);
                    }
                }
                g4Var.l();
            }
        }
        pageBlock = null;
        n51Var = PhotoViewer.p1().F2;
        textureView = PhotoViewer.p1().B2;
        SurfaceView surfaceView2 = PhotoViewer.p1().C2;
        g4 g4Var2 = this.c;
        k3[] k3VarArr2 = g4Var2.u0;
        hVar = g4Var2.D;
        i10 = 0;
        fi.v vVar2 = k3VarArr2[0].b;
        childCount = vVar2.getChildCount();
        while (true) {
            if (i10 < childCount) {
            }
            i10++;
        }
        if (v2Var != null) {
            long j32 = v2Var.L.video_id;
            w2 w2Var32 = new w2();
            w2Var32.a = n51Var.S();
            if (textureView.getSurfaceTexture() != null) {
            }
            v2Var.c(w2Var32);
            hVar.k(w2Var32, j32);
            int i112 = v2.V;
            v2Var.n.setAlpha(0.0f);
            w2Var2 = v2Var.M;
            if (w2Var2 != null) {
                v2Var.e.v0(bitmap2);
            }
        }
        if (v2Var != null) {
            long j102 = v2Var.L.video_id;
            w2 w2Var42 = new w2();
            w2Var42.a = n51Var.S();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            v2Var.c(w2Var42);
            hVar.k(w2Var42, j102);
            int i122 = v2.V;
            v2Var.n.setAlpha(0.0f);
            w2Var = v2Var.M;
            if (w2Var != null) {
                v2Var.e.v0(bitmap);
            }
        }
        g4Var2.l();
    }

    public final ImageReceiver d0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ImageReceiver e02 = e0(viewGroup.getChildAt(i7), pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    public final ImageReceiver e0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.xi0 xi0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof a2) {
            a2 a2Var = (a2) view;
            if (a2Var.N != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return a2Var.e;
        }
        if (view instanceof v2) {
            v2 v2Var = (v2) view;
            ImageReceiver imageReceiver = v2Var.e;
            TextureView textureView = v2Var.n;
            if (v2Var.L != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            g4 g4Var = this.c;
            if (v2Var == g4Var.y && (videoPlayerHolderBase = g4Var.x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    org.telegram.messenger.g0.y0(surface, createBitmap);
                    surface.release();
                    imageReceiver.v0(createBitmap);
                } else {
                    imageReceiver.v0(textureView.getBitmap());
                }
                int i7 = v2.V;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof h1) {
            ImageReceiver d02 = d0(((h1) view).a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        }
        if (view instanceof o2) {
            ImageReceiver d03 = d0(((o2) view).b, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        }
        if (view instanceof v1) {
            org.telegram.ui.Components.xi0 xi0Var2 = ((v1) view).d;
            if (xi0Var2 == null || (e03 = e0(xi0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return e03;
        }
        if (!(view instanceof y1) || (xi0Var = ((y1) view).d) == null || (e02 = e0(xi0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return e02;
    }
}
