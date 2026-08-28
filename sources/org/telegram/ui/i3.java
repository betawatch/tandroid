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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i3 extends rt0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ l4 c;

    public i3(l4 l4Var, List list) {
        this.c = l4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void D() {
        this.c.n();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        if (i9 < 0) {
            return null;
        }
        List list = this.b;
        if (i9 >= list.size()) {
            return null;
        }
        l4 l4Var = this.c;
        kh.w wVar = l4Var.q0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i9);
        int[] iArr = this.a;
        ImageReceiver c02 = c0(wVar, pageBlock, iArr);
        if (c02 == null) {
            return null;
        }
        bu0 bu0Var = new bu0();
        bu0Var.b = iArr[0];
        bu0Var.c = iArr[1];
        bu0Var.d = l4Var.q0[0].b;
        bu0Var.a = c02;
        bu0Var.e = c02.getBitmapSafe();
        bu0Var.h = c02.getRoundRadius(true);
        bu0Var.j = l4Var.E0;
        return bu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(int i9) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.k61 k61Var;
        TextureView textureView;
        a0.h hVar;
        int i10;
        int childCount;
        b3 b3Var;
        Bitmap bitmap;
        b3 b3Var2;
        Bitmap bitmap2;
        a3 a3Var = null;
        if (i9 >= 0) {
            List list = this.b;
            if (i9 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i9);
                k61Var = PhotoViewer.t1().B2;
                textureView = PhotoViewer.t1().x2;
                SurfaceView surfaceView = PhotoViewer.t1().y2;
                l4 l4Var = this.c;
                p3[] p3VarArr = l4Var.q0;
                hVar = l4Var.y;
                i10 = 0;
                kh.w wVar = p3VarArr[0].b;
                childCount = wVar.getChildCount();
                while (true) {
                    if (i10 < childCount) {
                        break;
                    }
                    View childAt = wVar.getChildAt(i10);
                    if (childAt instanceof a3) {
                        a3 a3Var2 = (a3) childAt;
                        if (a3Var2.H == pageBlock) {
                            a3Var = a3Var2;
                            break;
                        }
                    }
                    i10++;
                }
                if (a3Var != null && k61Var != null && textureView != null) {
                    long j10 = a3Var.H.video_id;
                    b3 b3Var3 = new b3();
                    b3Var3.a = k61Var.o();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                            surface.release();
                            b3Var3.b = createBitmap;
                        } else {
                            b3Var3.b = textureView.getBitmap();
                        }
                    }
                    a3Var.c(b3Var3);
                    hVar.k(b3Var3, j10);
                    int i11 = a3.R;
                    a3Var.n.setAlpha(0.0f);
                    b3Var2 = a3Var.I;
                    if (b3Var2 != null && (bitmap2 = b3Var2.b) != null) {
                        a3Var.e.setImageBitmap(bitmap2);
                    }
                }
                if (a3Var != null && k61Var != null && surfaceView != null) {
                    long j11 = a3Var.H.video_id;
                    b3 b3Var4 = new b3();
                    b3Var4.a = k61Var.o();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap2);
                        b3Var4.b = createBitmap2;
                    }
                    a3Var.c(b3Var4);
                    hVar.k(b3Var4, j11);
                    int i12 = a3.R;
                    a3Var.n.setAlpha(0.0f);
                    b3Var = a3Var.I;
                    if (b3Var != null && (bitmap = b3Var.b) != null) {
                        a3Var.e.setImageBitmap(bitmap);
                    }
                }
                l4Var.n();
            }
        }
        pageBlock = null;
        k61Var = PhotoViewer.t1().B2;
        textureView = PhotoViewer.t1().x2;
        SurfaceView surfaceView2 = PhotoViewer.t1().y2;
        l4 l4Var2 = this.c;
        p3[] p3VarArr2 = l4Var2.q0;
        hVar = l4Var2.y;
        i10 = 0;
        kh.w wVar2 = p3VarArr2[0].b;
        childCount = wVar2.getChildCount();
        while (true) {
            if (i10 < childCount) {
            }
            i10++;
        }
        if (a3Var != null) {
            long j102 = a3Var.H.video_id;
            b3 b3Var32 = new b3();
            b3Var32.a = k61Var.o();
            if (textureView.getSurfaceTexture() != null) {
            }
            a3Var.c(b3Var32);
            hVar.k(b3Var32, j102);
            int i112 = a3.R;
            a3Var.n.setAlpha(0.0f);
            b3Var2 = a3Var.I;
            if (b3Var2 != null) {
                a3Var.e.setImageBitmap(bitmap2);
            }
        }
        if (a3Var != null) {
            long j112 = a3Var.H.video_id;
            b3 b3Var42 = new b3();
            b3Var42.a = k61Var.o();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            a3Var.c(b3Var42);
            hVar.k(b3Var42, j112);
            int i122 = a3.R;
            a3Var.n.setAlpha(0.0f);
            b3Var = a3Var.I;
            if (b3Var != null) {
                a3Var.e.setImageBitmap(bitmap);
            }
        }
        l4Var2.n();
    }

    public final ImageReceiver c0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ImageReceiver d02 = d0(viewGroup.getChildAt(i9), pageBlock, iArr);
            if (d02 != null) {
                return d02;
            }
        }
        return null;
    }

    public final ImageReceiver d0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        org.telegram.ui.Components.ik0 ik0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof f2) {
            f2 f2Var = (f2) view;
            if (f2Var.J != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return f2Var.e;
        }
        if (view instanceof a3) {
            a3 a3Var = (a3) view;
            ImageReceiver imageReceiver = a3Var.e;
            TextureView textureView = a3Var.n;
            if (a3Var.H != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            l4 l4Var = this.c;
            if (a3Var == l4Var.x && (videoPlayerHolderBase = l4Var.w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    imageReceiver.setImageBitmap(createBitmap);
                } else {
                    imageReceiver.setImageBitmap(textureView.getBitmap());
                }
                int i9 = a3.R;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof m1) {
            ImageReceiver c02 = c0(((m1) view).a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        }
        if (view instanceof t2) {
            ImageReceiver c03 = c0(((t2) view).a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        }
        if (view instanceof a2) {
            org.telegram.ui.Components.ik0 ik0Var2 = ((a2) view).d;
            if (ik0Var2 == null || (d03 = d0(ik0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return d03;
        }
        if (!(view instanceof d2) || (ik0Var = ((d2) view).d) == null || (d02 = d0(ik0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return d02;
    }
}
