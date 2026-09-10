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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g3 extends tu0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ j4 c;

    public g3(j4 j4Var, List list) {
        this.c = j4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void D() {
        this.c.n();
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        List list = this.b;
        if (i10 >= list.size()) {
            return null;
        }
        j4 j4Var = this.c;
        bi.z zVar = j4Var.u0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i10);
        int[] iArr = this.a;
        ImageReceiver c02 = c0(zVar, pageBlock, iArr);
        if (c02 == null) {
            return null;
        }
        ev0 ev0Var = new ev0();
        ev0Var.b = iArr[0];
        ev0Var.c = iArr[1];
        ev0Var.d = j4Var.u0[0].b;
        ev0Var.a = c02;
        ev0Var.e = c02.getBitmapSafe();
        ev0Var.h = c02.getRoundRadius(true);
        ev0Var.j = j4Var.I0;
        return ev0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
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
        z2 z2Var;
        Bitmap bitmap;
        z2 z2Var2;
        Bitmap bitmap2;
        y2 y2Var = null;
        if (i10 >= 0) {
            List list = this.b;
            if (i10 < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i10);
                t71Var = PhotoViewer.t1().F2;
                textureView = PhotoViewer.t1().B2;
                SurfaceView surfaceView = PhotoViewer.t1().C2;
                j4 j4Var = this.c;
                n3[] n3VarArr = j4Var.u0;
                iVar = j4Var.y;
                i11 = 0;
                bi.z zVar = n3VarArr[0].b;
                childCount = zVar.getChildCount();
                while (true) {
                    if (i11 < childCount) {
                        break;
                    }
                    View childAt = zVar.getChildAt(i11);
                    if (childAt instanceof y2) {
                        y2 y2Var2 = (y2) childAt;
                        if (y2Var2.L == pageBlock) {
                            y2Var = y2Var2;
                            break;
                        }
                    }
                    i11++;
                }
                if (y2Var != null && t71Var != null && textureView != null) {
                    long j3 = y2Var.L.video_id;
                    z2 z2Var3 = new z2();
                    z2Var3.a = t71Var.n();
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
                    iVar.k(z2Var3, j3);
                    int i12 = y2.V;
                    y2Var.n.setAlpha(0.0f);
                    z2Var2 = y2Var.M;
                    if (z2Var2 != null && (bitmap2 = z2Var2.b) != null) {
                        y2Var.e.setImageBitmap(bitmap2);
                    }
                }
                if (y2Var != null && t71Var != null && surfaceView != null) {
                    long j10 = y2Var.L.video_id;
                    z2 z2Var4 = new z2();
                    z2Var4.a = t71Var.n();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap2);
                        z2Var4.b = createBitmap2;
                    }
                    y2Var.c(z2Var4);
                    iVar.k(z2Var4, j10);
                    int i13 = y2.V;
                    y2Var.n.setAlpha(0.0f);
                    z2Var = y2Var.M;
                    if (z2Var != null && (bitmap = z2Var.b) != null) {
                        y2Var.e.setImageBitmap(bitmap);
                    }
                }
                j4Var.n();
            }
        }
        pageBlock = null;
        t71Var = PhotoViewer.t1().F2;
        textureView = PhotoViewer.t1().B2;
        SurfaceView surfaceView2 = PhotoViewer.t1().C2;
        j4 j4Var2 = this.c;
        n3[] n3VarArr2 = j4Var2.u0;
        iVar = j4Var2.y;
        i11 = 0;
        bi.z zVar2 = n3VarArr2[0].b;
        childCount = zVar2.getChildCount();
        while (true) {
            if (i11 < childCount) {
            }
            i11++;
        }
        if (y2Var != null) {
            long j32 = y2Var.L.video_id;
            z2 z2Var32 = new z2();
            z2Var32.a = t71Var.n();
            if (textureView.getSurfaceTexture() != null) {
            }
            y2Var.c(z2Var32);
            iVar.k(z2Var32, j32);
            int i122 = y2.V;
            y2Var.n.setAlpha(0.0f);
            z2Var2 = y2Var.M;
            if (z2Var2 != null) {
                y2Var.e.setImageBitmap(bitmap2);
            }
        }
        if (y2Var != null) {
            long j102 = y2Var.L.video_id;
            z2 z2Var42 = new z2();
            z2Var42.a = t71Var.n();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            y2Var.c(z2Var42);
            iVar.k(z2Var42, j102);
            int i132 = y2.V;
            y2Var.n.setAlpha(0.0f);
            z2Var = y2Var.M;
            if (z2Var != null) {
                y2Var.e.setImageBitmap(bitmap);
            }
        }
        j4Var2.n();
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
            j4 j4Var = this.c;
            if (y2Var == j4Var.x && (videoPlayerHolderBase = j4Var.w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
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
            ImageReceiver c02 = c0(((l1) view).a, pageBlock, iArr);
            if (c02 != null) {
                return c02;
            }
            return null;
        }
        if (view instanceof r2) {
            ImageReceiver c03 = c0(((r2) view).a, pageBlock, iArr);
            if (c03 != null) {
                return c03;
            }
            return null;
        }
        if (view instanceof z1) {
            org.telegram.ui.Components.fl0 fl0Var2 = ((z1) view).d;
            if (fl0Var2 == null || (d03 = d0(fl0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return d03;
        }
        if (!(view instanceof c2) || (fl0Var = ((c2) view).d) == null || (d02 = d0(fl0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return d02;
    }
}
