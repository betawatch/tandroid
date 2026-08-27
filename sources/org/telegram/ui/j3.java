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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j3 extends st0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ m4 c;

    public j3(m4 m4Var, List list) {
        this.c = m4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void D() {
        this.c.n();
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        List list = this.b;
        if (i10 >= list.size()) {
            return null;
        }
        m4 m4Var = this.c;
        lh.w wVar = m4Var.q0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i10);
        int[] iArr = this.a;
        ImageReceiver c02 = c0(wVar, pageBlock, iArr);
        if (c02 == null) {
            return null;
        }
        cu0 cu0Var = new cu0();
        cu0Var.b = iArr[0];
        cu0Var.c = iArr[1];
        cu0Var.d = m4Var.q0[0].b;
        cu0Var.a = c02;
        cu0Var.e = c02.getBitmapSafe();
        cu0Var.h = c02.getRoundRadius(true);
        cu0Var.j = m4Var.E0;
        return cu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(int i10) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.m61 m61Var;
        TextureView textureView;
        a0.h hVar;
        int i11;
        int childCount;
        c3 c3Var;
        Bitmap bitmap;
        c3 c3Var2;
        Bitmap bitmap2;
        b3 b3Var = null;
        if (i10 >= 0) {
            List list = this.b;
            if (i10 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i10);
                m61Var = PhotoViewer.t1().B2;
                textureView = PhotoViewer.t1().x2;
                SurfaceView surfaceView = PhotoViewer.t1().y2;
                m4 m4Var = this.c;
                q3[] q3VarArr = m4Var.q0;
                hVar = m4Var.y;
                i11 = 0;
                lh.w wVar = q3VarArr[0].b;
                childCount = wVar.getChildCount();
                while (true) {
                    if (i11 < childCount) {
                        break;
                    }
                    View childAt = wVar.getChildAt(i11);
                    if (childAt instanceof b3) {
                        b3 b3Var2 = (b3) childAt;
                        if (b3Var2.H == pageBlock) {
                            b3Var = b3Var2;
                            break;
                        }
                    }
                    i11++;
                }
                if (b3Var != null && m61Var != null && textureView != null) {
                    long j10 = b3Var.H.video_id;
                    c3 c3Var3 = new c3();
                    c3Var3.a = m61Var.o();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                            surface.release();
                            c3Var3.b = createBitmap;
                        } else {
                            c3Var3.b = textureView.getBitmap();
                        }
                    }
                    b3Var.c(c3Var3);
                    hVar.k(c3Var3, j10);
                    int i12 = b3.R;
                    b3Var.n.setAlpha(0.0f);
                    c3Var2 = b3Var.I;
                    if (c3Var2 != null && (bitmap2 = c3Var2.b) != null) {
                        b3Var.e.setImageBitmap(bitmap2);
                    }
                }
                if (b3Var != null && m61Var != null && surfaceView != null) {
                    long j11 = b3Var.H.video_id;
                    c3 c3Var4 = new c3();
                    c3Var4.a = m61Var.o();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap2);
                        c3Var4.b = createBitmap2;
                    }
                    b3Var.c(c3Var4);
                    hVar.k(c3Var4, j11);
                    int i13 = b3.R;
                    b3Var.n.setAlpha(0.0f);
                    c3Var = b3Var.I;
                    if (c3Var != null && (bitmap = c3Var.b) != null) {
                        b3Var.e.setImageBitmap(bitmap);
                    }
                }
                m4Var.n();
            }
        }
        pageBlock = null;
        m61Var = PhotoViewer.t1().B2;
        textureView = PhotoViewer.t1().x2;
        SurfaceView surfaceView2 = PhotoViewer.t1().y2;
        m4 m4Var2 = this.c;
        q3[] q3VarArr2 = m4Var2.q0;
        hVar = m4Var2.y;
        i11 = 0;
        lh.w wVar2 = q3VarArr2[0].b;
        childCount = wVar2.getChildCount();
        while (true) {
            if (i11 < childCount) {
            }
            i11++;
        }
        if (b3Var != null) {
            long j102 = b3Var.H.video_id;
            c3 c3Var32 = new c3();
            c3Var32.a = m61Var.o();
            if (textureView.getSurfaceTexture() != null) {
            }
            b3Var.c(c3Var32);
            hVar.k(c3Var32, j102);
            int i122 = b3.R;
            b3Var.n.setAlpha(0.0f);
            c3Var2 = b3Var.I;
            if (c3Var2 != null) {
                b3Var.e.setImageBitmap(bitmap2);
            }
        }
        if (b3Var != null) {
            long j112 = b3Var.H.video_id;
            c3 c3Var42 = new c3();
            c3Var42.a = m61Var.o();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            b3Var.c(c3Var42);
            hVar.k(c3Var42, j112);
            int i132 = b3.R;
            b3Var.n.setAlpha(0.0f);
            c3Var = b3Var.I;
            if (c3Var != null) {
                b3Var.e.setImageBitmap(bitmap);
            }
        }
        m4Var2.n();
    }

    public final ImageReceiver c0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ImageReceiver d02 = d0(viewGroup.getChildAt(i10), pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
        }
        return null;
    }

    public final ImageReceiver d0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.lk0 lk0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof g2) {
            g2 g2Var = (g2) view;
            if (g2Var.J != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return g2Var.e;
        }
        if (view instanceof b3) {
            b3 b3Var = (b3) view;
            ImageReceiver imageReceiver = b3Var.e;
            TextureView textureView = b3Var.n;
            if (b3Var.H != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            m4 m4Var = this.c;
            if (b3Var == m4Var.x && (videoPlayerHolderBase = m4Var.w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    imageReceiver.setImageBitmap(createBitmap);
                } else {
                    imageReceiver.setImageBitmap(textureView.getBitmap());
                }
                int i10 = b3.R;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof n1) {
            ImageReceiver c02 = c0(((n1) view).a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        }
        if (view instanceof u2) {
            ImageReceiver c03 = c0(((u2) view).a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        }
        if (view instanceof b2) {
            org.telegram.ui.Components.lk0 lk0Var2 = ((b2) view).d;
            if (lk0Var2 == null || (d03 = d0(lk0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return d03;
        }
        if (!(view instanceof e2) || (lk0Var = ((e2) view).d) == null || (d02 = d0(lk0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return d02;
    }
}
