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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d3 extends yr0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ h4 c;

    public d3(h4 h4Var, List list) {
        this.c = h4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void D() {
        this.c.l();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        List list = this.b;
        if (i10 >= list.size()) {
            return null;
        }
        h4 h4Var = this.c;
        g3 g3Var = h4Var.u0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i10);
        int[] iArr = this.a;
        ImageReceiver d02 = d0(g3Var, pageBlock, iArr);
        if (d02 == null) {
            return null;
        }
        gs0 gs0Var = new gs0();
        gs0Var.b = iArr[0];
        gs0Var.c = iArr[1];
        gs0Var.d = h4Var.u0[0].b;
        gs0Var.a = d02;
        gs0Var.e = d02.p();
        gs0Var.h = d02.E();
        gs0Var.j = h4Var.J0;
        return gs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(int i10) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.u61 u61Var;
        TextureView textureView;
        a0.h hVar;
        int i11;
        int childCount;
        w2 w2Var;
        Bitmap bitmap;
        w2 w2Var2;
        Bitmap bitmap2;
        v2 v2Var = null;
        if (i10 >= 0) {
            List list = this.b;
            if (i10 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i10);
                u61Var = PhotoViewer.v1().F2;
                textureView = PhotoViewer.v1().B2;
                SurfaceView surfaceView = PhotoViewer.v1().C2;
                h4 h4Var = this.c;
                l3[] l3VarArr = h4Var.u0;
                hVar = h4Var.D;
                i11 = 0;
                g3 g3Var = l3VarArr[0].b;
                childCount = g3Var.getChildCount();
                while (true) {
                    if (i11 < childCount) {
                        break;
                    }
                    View childAt = g3Var.getChildAt(i11);
                    if (childAt instanceof v2) {
                        v2 v2Var2 = (v2) childAt;
                        if (v2Var2.L == pageBlock) {
                            v2Var = v2Var2;
                            break;
                        }
                    }
                    i11++;
                }
                if (v2Var != null && u61Var != null && textureView != null) {
                    long j10 = v2Var.L.video_id;
                    w2 w2Var3 = new w2();
                    w2Var3.a = u61Var.S();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            org.telegram.messenger.i0.y0(surface, createBitmap);
                            surface.release();
                            w2Var3.b = createBitmap;
                        } else {
                            w2Var3.b = textureView.getBitmap();
                        }
                    }
                    v2Var.c(w2Var3);
                    hVar.k(w2Var3, j10);
                    int i12 = v2.V;
                    v2Var.n.setAlpha(0.0f);
                    w2Var2 = v2Var.M;
                    if (w2Var2 != null && (bitmap2 = w2Var2.b) != null) {
                        v2Var.e.v0(bitmap2);
                    }
                }
                if (v2Var != null && u61Var != null && surfaceView != null) {
                    long j11 = v2Var.L.video_id;
                    w2 w2Var4 = new w2();
                    w2Var4.a = u61Var.S();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        org.telegram.messenger.i0.z0(surfaceView, createBitmap2);
                        w2Var4.b = createBitmap2;
                    }
                    v2Var.c(w2Var4);
                    hVar.k(w2Var4, j11);
                    int i13 = v2.V;
                    v2Var.n.setAlpha(0.0f);
                    w2Var = v2Var.M;
                    if (w2Var != null && (bitmap = w2Var.b) != null) {
                        v2Var.e.v0(bitmap);
                    }
                }
                h4Var.l();
            }
        }
        pageBlock = null;
        u61Var = PhotoViewer.v1().F2;
        textureView = PhotoViewer.v1().B2;
        SurfaceView surfaceView2 = PhotoViewer.v1().C2;
        h4 h4Var2 = this.c;
        l3[] l3VarArr2 = h4Var2.u0;
        hVar = h4Var2.D;
        i11 = 0;
        g3 g3Var2 = l3VarArr2[0].b;
        childCount = g3Var2.getChildCount();
        while (true) {
            if (i11 < childCount) {
            }
            i11++;
        }
        if (v2Var != null) {
            long j102 = v2Var.L.video_id;
            w2 w2Var32 = new w2();
            w2Var32.a = u61Var.S();
            if (textureView.getSurfaceTexture() != null) {
            }
            v2Var.c(w2Var32);
            hVar.k(w2Var32, j102);
            int i122 = v2.V;
            v2Var.n.setAlpha(0.0f);
            w2Var2 = v2Var.M;
            if (w2Var2 != null) {
                v2Var.e.v0(bitmap2);
            }
        }
        if (v2Var != null) {
            long j112 = v2Var.L.video_id;
            w2 w2Var42 = new w2();
            w2Var42.a = u61Var.S();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            v2Var.c(w2Var42);
            hVar.k(w2Var42, j112);
            int i132 = v2.V;
            v2Var.n.setAlpha(0.0f);
            w2Var = v2Var.M;
            if (w2Var != null) {
                v2Var.e.v0(bitmap);
            }
        }
        h4Var2.l();
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
        org.telegram.ui.Components.ck0 ck0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof b2) {
            b2 b2Var = (b2) view;
            if (b2Var.N != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return b2Var.e;
        }
        if (view instanceof v2) {
            v2 v2Var = (v2) view;
            ImageReceiver imageReceiver = v2Var.e;
            TextureView textureView = v2Var.n;
            if (v2Var.L != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            h4 h4Var = this.c;
            if (v2Var == h4Var.y && (videoPlayerHolderBase = h4Var.x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    org.telegram.messenger.i0.y0(surface, createBitmap);
                    surface.release();
                    imageReceiver.v0(createBitmap);
                } else {
                    imageReceiver.v0(textureView.getBitmap());
                }
                int i10 = v2.V;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof j1) {
            ImageReceiver d02 = d0(((j1) view).a, pageBlock, iArr);
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
        if (view instanceof w1) {
            org.telegram.ui.Components.ck0 ck0Var2 = ((w1) view).d;
            if (ck0Var2 == null || (e03 = e0(ck0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return e03;
        }
        if (!(view instanceof z1) || (ck0Var = ((z1) view).d) == null || (e02 = e0(ck0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return e02;
    }
}
