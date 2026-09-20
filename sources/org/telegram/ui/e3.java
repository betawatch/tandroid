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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class e3 extends tu0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ h4 c;

    public e3(h4 h4Var, List list) {
        this.c = h4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void D() {
        this.c.n();
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        List list = this.b;
        if (i10 >= list.size()) {
            return null;
        }
        h4 h4Var = this.c;
        ci.v vVar = h4Var.u0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i10);
        int[] iArr = this.a;
        ImageReceiver c02 = c0(vVar, pageBlock, iArr);
        if (c02 == null) {
            return null;
        }
        dv0 dv0Var = new dv0();
        dv0Var.b = iArr[0];
        dv0Var.c = iArr[1];
        dv0Var.d = h4Var.u0[0].b;
        dv0Var.a = c02;
        dv0Var.e = c02.getBitmapSafe();
        dv0Var.h = c02.getRoundRadius(true);
        dv0Var.j = h4Var.I0;
        return dv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(int i10) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.t71 t71Var;
        TextureView textureView;
        a0.i iVar;
        int i11;
        int childCount;
        x2 x2Var;
        Bitmap bitmap;
        x2 x2Var2;
        Bitmap bitmap2;
        w2 w2Var = null;
        if (i10 >= 0) {
            List list = this.b;
            if (i10 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i10);
                t71Var = PhotoViewer.t1().F2;
                textureView = PhotoViewer.t1().B2;
                SurfaceView surfaceView = PhotoViewer.t1().C2;
                h4 h4Var = this.c;
                l3[] l3VarArr = h4Var.u0;
                iVar = h4Var.y;
                i11 = 0;
                ci.v vVar = l3VarArr[0].b;
                childCount = vVar.getChildCount();
                while (true) {
                    if (i11 < childCount) {
                        break;
                    }
                    View childAt = vVar.getChildAt(i11);
                    if (childAt instanceof w2) {
                        w2 w2Var2 = (w2) childAt;
                        if (w2Var2.L == pageBlock) {
                            w2Var = w2Var2;
                            break;
                        }
                    }
                    i11++;
                }
                if (w2Var != null && t71Var != null && textureView != null) {
                    long j3 = w2Var.L.video_id;
                    x2 x2Var3 = new x2();
                    x2Var3.a = t71Var.n();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                            surface.release();
                            x2Var3.b = createBitmap;
                        } else {
                            x2Var3.b = textureView.getBitmap();
                        }
                    }
                    w2Var.c(x2Var3);
                    iVar.k(x2Var3, j3);
                    int i12 = w2.V;
                    w2Var.n.setAlpha(0.0f);
                    x2Var2 = w2Var.M;
                    if (x2Var2 != null && (bitmap2 = x2Var2.b) != null) {
                        w2Var.e.setImageBitmap(bitmap2);
                    }
                }
                if (w2Var != null && t71Var != null && surfaceView != null) {
                    long j10 = w2Var.L.video_id;
                    x2 x2Var4 = new x2();
                    x2Var4.a = t71Var.n();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap2);
                        x2Var4.b = createBitmap2;
                    }
                    w2Var.c(x2Var4);
                    iVar.k(x2Var4, j10);
                    int i13 = w2.V;
                    w2Var.n.setAlpha(0.0f);
                    x2Var = w2Var.M;
                    if (x2Var != null && (bitmap = x2Var.b) != null) {
                        w2Var.e.setImageBitmap(bitmap);
                    }
                }
                h4Var.n();
            }
        }
        pageBlock = null;
        t71Var = PhotoViewer.t1().F2;
        textureView = PhotoViewer.t1().B2;
        SurfaceView surfaceView2 = PhotoViewer.t1().C2;
        h4 h4Var2 = this.c;
        l3[] l3VarArr2 = h4Var2.u0;
        iVar = h4Var2.y;
        i11 = 0;
        ci.v vVar2 = l3VarArr2[0].b;
        childCount = vVar2.getChildCount();
        while (true) {
            if (i11 < childCount) {
            }
            i11++;
        }
        if (w2Var != null) {
            long j32 = w2Var.L.video_id;
            x2 x2Var32 = new x2();
            x2Var32.a = t71Var.n();
            if (textureView.getSurfaceTexture() != null) {
            }
            w2Var.c(x2Var32);
            iVar.k(x2Var32, j32);
            int i122 = w2.V;
            w2Var.n.setAlpha(0.0f);
            x2Var2 = w2Var.M;
            if (x2Var2 != null) {
                w2Var.e.setImageBitmap(bitmap2);
            }
        }
        if (w2Var != null) {
            long j102 = w2Var.L.video_id;
            x2 x2Var42 = new x2();
            x2Var42.a = t71Var.n();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            w2Var.c(x2Var42);
            iVar.k(x2Var42, j102);
            int i132 = w2.V;
            w2Var.n.setAlpha(0.0f);
            x2Var = w2Var.M;
            if (x2Var != null) {
                w2Var.e.setImageBitmap(bitmap);
            }
        }
        h4Var2.n();
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
        org.telegram.ui.Components.fl0 fl0Var;
        ImageReceiver d02;
        ImageReceiver d03;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof c2) {
            c2 c2Var = (c2) view;
            if (c2Var.N != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return c2Var.e;
        }
        if (view instanceof w2) {
            w2 w2Var = (w2) view;
            ImageReceiver imageReceiver = w2Var.e;
            TextureView textureView = w2Var.n;
            if (w2Var.L != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            h4 h4Var = this.c;
            if (w2Var == h4Var.x && (videoPlayerHolderBase = h4Var.w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    imageReceiver.setImageBitmap(createBitmap);
                } else {
                    imageReceiver.setImageBitmap(textureView.getBitmap());
                }
                int i10 = w2.V;
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof j1) {
            ImageReceiver c02 = c0(((j1) view).a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        }
        if (view instanceof p2) {
            ImageReceiver c03 = c0(((p2) view).a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        }
        if (view instanceof x1) {
            org.telegram.ui.Components.fl0 fl0Var2 = ((x1) view).d;
            if (fl0Var2 == null || (d03 = d0(fl0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return d03;
        }
        if (!(view instanceof a2) || (fl0Var = ((a2) view).d) == null || (d02 = d0(fl0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return d02;
    }
}
