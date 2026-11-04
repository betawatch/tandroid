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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e3 extends eq0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ i4 c;

    public e3(i4 i4Var, List list) {
        this.c = i4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void D() {
        this.c.l();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        if (i3 < 0) {
            return null;
        }
        List list = this.b;
        if (i3 >= list.size()) {
            return null;
        }
        i4 i4Var = this.c;
        gi.v vVar = i4Var.v0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i3);
        int[] iArr = this.a;
        ImageReceiver d02 = d0(vVar, pageBlock, iArr);
        if (d02 == null) {
            return null;
        }
        mq0 mq0Var = new mq0();
        mq0Var.b = iArr[0];
        mq0Var.c = iArr[1];
        mq0Var.d = i4Var.v0[0].b;
        mq0Var.a = d02;
        mq0Var.e = d02.p();
        mq0Var.h = d02.E();
        mq0Var.j = i4Var.K0;
        return mq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(int i3) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.m51 m51Var;
        TextureView textureView;
        a0.h hVar;
        int i10;
        int childCount;
        x2 x2Var;
        Bitmap bitmap;
        x2 x2Var2;
        Bitmap bitmap2;
        w2 w2Var = null;
        if (i3 >= 0) {
            List list = this.b;
            if (i3 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i3);
                m51Var = PhotoViewer.v1().G2;
                textureView = PhotoViewer.v1().C2;
                SurfaceView surfaceView = PhotoViewer.v1().D2;
                i4 i4Var = this.c;
                l3[] l3VarArr = i4Var.v0;
                hVar = i4Var.E;
                i10 = 0;
                gi.v vVar = l3VarArr[0].b;
                childCount = vVar.getChildCount();
                while (true) {
                    if (i10 < childCount) {
                        break;
                    }
                    View childAt = vVar.getChildAt(i10);
                    if (childAt instanceof w2) {
                        w2 w2Var2 = (w2) childAt;
                        if (w2Var2.M == pageBlock) {
                            w2Var = w2Var2;
                            break;
                        }
                    }
                    i10++;
                }
                if (w2Var != null && m51Var != null && textureView != null) {
                    long j10 = w2Var.M.video_id;
                    x2 x2Var3 = new x2();
                    x2Var3.a = m51Var.S();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            org.telegram.messenger.g0.y0(surface, createBitmap);
                            surface.release();
                            x2Var3.b = createBitmap;
                        } else {
                            x2Var3.b = textureView.getBitmap();
                        }
                    }
                    w2Var.c(x2Var3);
                    hVar.k(x2Var3, j10);
                    int i11 = w2.W;
                    w2Var.n.setAlpha(0.0f);
                    x2Var2 = w2Var.N;
                    if (x2Var2 != null && (bitmap2 = x2Var2.b) != null) {
                        w2Var.e.v0(bitmap2);
                    }
                }
                if (w2Var != null && m51Var != null && surfaceView != null) {
                    long j11 = w2Var.M.video_id;
                    x2 x2Var4 = new x2();
                    x2Var4.a = m51Var.S();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        org.telegram.messenger.g0.z0(surfaceView, createBitmap2);
                        x2Var4.b = createBitmap2;
                    }
                    w2Var.c(x2Var4);
                    hVar.k(x2Var4, j11);
                    int i12 = w2.W;
                    w2Var.n.setAlpha(0.0f);
                    x2Var = w2Var.N;
                    if (x2Var != null && (bitmap = x2Var.b) != null) {
                        w2Var.e.v0(bitmap);
                    }
                }
                i4Var.l();
            }
        }
        pageBlock = null;
        m51Var = PhotoViewer.v1().G2;
        textureView = PhotoViewer.v1().C2;
        SurfaceView surfaceView2 = PhotoViewer.v1().D2;
        i4 i4Var2 = this.c;
        l3[] l3VarArr2 = i4Var2.v0;
        hVar = i4Var2.E;
        i10 = 0;
        gi.v vVar2 = l3VarArr2[0].b;
        childCount = vVar2.getChildCount();
        while (true) {
            if (i10 < childCount) {
            }
            i10++;
        }
        if (w2Var != null) {
            long j102 = w2Var.M.video_id;
            x2 x2Var32 = new x2();
            x2Var32.a = m51Var.S();
            if (textureView.getSurfaceTexture() != null) {
            }
            w2Var.c(x2Var32);
            hVar.k(x2Var32, j102);
            int i112 = w2.W;
            w2Var.n.setAlpha(0.0f);
            x2Var2 = w2Var.N;
            if (x2Var2 != null) {
                w2Var.e.v0(bitmap2);
            }
        }
        if (w2Var != null) {
            long j112 = w2Var.M.video_id;
            x2 x2Var42 = new x2();
            x2Var42.a = m51Var.S();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            w2Var.c(x2Var42);
            hVar.k(x2Var42, j112);
            int i122 = w2.W;
            w2Var.n.setAlpha(0.0f);
            x2Var = w2Var.N;
            if (x2Var != null) {
                w2Var.e.v0(bitmap);
            }
        }
        i4Var2.l();
    }

    public final ImageReceiver d0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ImageReceiver e02 = e0(viewGroup.getChildAt(i3), pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    public final ImageReceiver e0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.bj0 bj0Var;
        ImageReceiver e02;
        ImageReceiver e03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof b2) {
            b2 b2Var = (b2) view;
            if (b2Var.O != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return b2Var.e;
        }
        if (view instanceof w2) {
            w2 w2Var = (w2) view;
            ImageReceiver imageReceiver = w2Var.e;
            TextureView textureView = w2Var.n;
            if (w2Var.M != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            i4 i4Var = this.c;
            if (w2Var == i4Var.y && (videoPlayerHolderBase = i4Var.x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    org.telegram.messenger.g0.y0(surface, createBitmap);
                    surface.release();
                    imageReceiver.v0(createBitmap);
                } else {
                    imageReceiver.v0(textureView.getBitmap());
                }
                int i3 = w2.W;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof i1) {
            ImageReceiver d02 = d0(((i1) view).a, pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
            return null;
        }
        if (view instanceof p2) {
            ImageReceiver d03 = d0(((p2) view).b, pageBlock, iArr);
            if (d03 != null) {
                return d03;
            }
            return null;
        }
        if (view instanceof w1) {
            org.telegram.ui.Components.bj0 bj0Var2 = ((w1) view).d;
            if (bj0Var2 == null || (e03 = e0(bj0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return e03;
        }
        if (!(view instanceof z1) || (bj0Var = ((z1) view).d) == null || (e02 = e0(bj0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return e02;
    }
}
