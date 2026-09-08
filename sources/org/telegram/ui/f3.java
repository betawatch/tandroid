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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f3 extends su0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ i4 c;

    public f3(i4 i4Var, List list) {
        this.c = i4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void D() {
        this.c.n();
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        List list = this.b;
        if (i10 >= list.size()) {
            return null;
        }
        i4 i4Var = this.c;
        di.v vVar = i4Var.u0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i10);
        int[] iArr = this.a;
        ImageReceiver c02 = c0(vVar, pageBlock, iArr);
        if (c02 == null) {
            return null;
        }
        cv0 cv0Var = new cv0();
        cv0Var.b = iArr[0];
        cv0Var.c = iArr[1];
        cv0Var.d = i4Var.u0[0].b;
        cv0Var.a = c02;
        cv0Var.e = c02.getBitmapSafe();
        cv0Var.h = c02.getRoundRadius(true);
        cv0Var.j = i4Var.I0;
        return cv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(int i10) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.g71 g71Var;
        TextureView textureView;
        a0.i iVar;
        int i11;
        int childCount;
        y2 y2Var;
        Bitmap bitmap;
        y2 y2Var2;
        Bitmap bitmap2;
        x2 x2Var = null;
        if (i10 >= 0) {
            List list = this.b;
            if (i10 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i10);
                g71Var = PhotoViewer.t1().F2;
                textureView = PhotoViewer.t1().B2;
                SurfaceView surfaceView = PhotoViewer.t1().C2;
                i4 i4Var = this.c;
                m3[] m3VarArr = i4Var.u0;
                iVar = i4Var.y;
                i11 = 0;
                di.v vVar = m3VarArr[0].b;
                childCount = vVar.getChildCount();
                while (true) {
                    if (i11 < childCount) {
                        break;
                    }
                    View childAt = vVar.getChildAt(i11);
                    if (childAt instanceof x2) {
                        x2 x2Var2 = (x2) childAt;
                        if (x2Var2.L == pageBlock) {
                            x2Var = x2Var2;
                            break;
                        }
                    }
                    i11++;
                }
                if (x2Var != null && g71Var != null && textureView != null) {
                    long j3 = x2Var.L.video_id;
                    y2 y2Var3 = new y2();
                    y2Var3.a = g71Var.n();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                            surface.release();
                            y2Var3.b = createBitmap;
                        } else {
                            y2Var3.b = textureView.getBitmap();
                        }
                    }
                    x2Var.c(y2Var3);
                    iVar.k(y2Var3, j3);
                    int i12 = x2.V;
                    x2Var.n.setAlpha(0.0f);
                    y2Var2 = x2Var.M;
                    if (y2Var2 != null && (bitmap2 = y2Var2.b) != null) {
                        x2Var.e.setImageBitmap(bitmap2);
                    }
                }
                if (x2Var != null && g71Var != null && surfaceView != null) {
                    long j10 = x2Var.L.video_id;
                    y2 y2Var4 = new y2();
                    y2Var4.a = g71Var.n();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap2);
                        y2Var4.b = createBitmap2;
                    }
                    x2Var.c(y2Var4);
                    iVar.k(y2Var4, j10);
                    int i13 = x2.V;
                    x2Var.n.setAlpha(0.0f);
                    y2Var = x2Var.M;
                    if (y2Var != null && (bitmap = y2Var.b) != null) {
                        x2Var.e.setImageBitmap(bitmap);
                    }
                }
                i4Var.n();
            }
        }
        pageBlock = null;
        g71Var = PhotoViewer.t1().F2;
        textureView = PhotoViewer.t1().B2;
        SurfaceView surfaceView2 = PhotoViewer.t1().C2;
        i4 i4Var2 = this.c;
        m3[] m3VarArr2 = i4Var2.u0;
        iVar = i4Var2.y;
        i11 = 0;
        di.v vVar2 = m3VarArr2[0].b;
        childCount = vVar2.getChildCount();
        while (true) {
            if (i11 < childCount) {
            }
            i11++;
        }
        if (x2Var != null) {
            long j32 = x2Var.L.video_id;
            y2 y2Var32 = new y2();
            y2Var32.a = g71Var.n();
            if (textureView.getSurfaceTexture() != null) {
            }
            x2Var.c(y2Var32);
            iVar.k(y2Var32, j32);
            int i122 = x2.V;
            x2Var.n.setAlpha(0.0f);
            y2Var2 = x2Var.M;
            if (y2Var2 != null) {
                x2Var.e.setImageBitmap(bitmap2);
            }
        }
        if (x2Var != null) {
            long j102 = x2Var.L.video_id;
            y2 y2Var42 = new y2();
            y2Var42.a = g71Var.n();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            x2Var.c(y2Var42);
            iVar.k(y2Var42, j102);
            int i132 = x2.V;
            x2Var.n.setAlpha(0.0f);
            y2Var = x2Var.M;
            if (y2Var != null) {
                x2Var.e.setImageBitmap(bitmap);
            }
        }
        i4Var2.n();
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
        org.telegram.ui.Components.vk0 vk0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof d2) {
            d2 d2Var = (d2) view;
            if (d2Var.N != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return d2Var.e;
        }
        if (view instanceof x2) {
            x2 x2Var = (x2) view;
            ImageReceiver imageReceiver = x2Var.e;
            TextureView textureView = x2Var.n;
            if (x2Var.L != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            i4 i4Var = this.c;
            if (x2Var == i4Var.x && (videoPlayerHolderBase = i4Var.w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    imageReceiver.setImageBitmap(createBitmap);
                } else {
                    imageReceiver.setImageBitmap(textureView.getBitmap());
                }
                int i10 = x2.V;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof k1) {
            ImageReceiver c02 = c0(((k1) view).a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        }
        if (view instanceof q2) {
            ImageReceiver c03 = c0(((q2) view).a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        }
        if (view instanceof y1) {
            org.telegram.ui.Components.vk0 vk0Var2 = ((y1) view).d;
            if (vk0Var2 == null || (d03 = d0(vk0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return d03;
        }
        if (!(view instanceof b2) || (vk0Var = ((b2) view).d) == null || (d02 = d0(vk0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return d02;
    }
}
