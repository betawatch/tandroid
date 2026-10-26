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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f3 extends gu0 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ j4 c;

    public f3(j4 j4Var, List list) {
        this.c = j4Var;
        this.b = list;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void D() {
        this.c.n();
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        List list = this.b;
        if (i10 >= list.size()) {
            return null;
        }
        j4 j4Var = this.c;
        fi.v vVar = j4Var.u0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i10);
        int[] iArr = this.a;
        ImageReceiver d02 = d0(vVar, pageBlock, iArr);
        if (d02 == null) {
            return null;
        }
        qu0 qu0Var = new qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = j4Var.u0[0].b;
        qu0Var.a = d02;
        qu0Var.e = d02.getBitmapSafe();
        qu0Var.h = d02.getRoundRadius(true);
        qu0Var.j = j4Var.J0;
        return qu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(int i10) {
        TL_iv.PageBlock pageBlock;
        org.telegram.ui.Components.s81 s81Var;
        TextureView textureView;
        a0.h hVar;
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
                s81Var = PhotoViewer.u1().F2;
                textureView = PhotoViewer.u1().B2;
                SurfaceView surfaceView = PhotoViewer.u1().C2;
                j4 j4Var = this.c;
                m3[] m3VarArr = j4Var.u0;
                hVar = j4Var.y;
                i11 = 0;
                fi.v vVar = m3VarArr[0].b;
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
                if (w2Var != null && s81Var != null && textureView != null) {
                    long j10 = w2Var.L.video_id;
                    x2 x2Var3 = new x2();
                    x2Var3.a = s81Var.n();
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
                    hVar.k(x2Var3, j10);
                    int i12 = w2.V;
                    w2Var.n.setAlpha(0.0f);
                    x2Var2 = w2Var.M;
                    if (x2Var2 != null && (bitmap2 = x2Var2.b) != null) {
                        w2Var.e.setImageBitmap(bitmap2);
                    }
                }
                if (w2Var != null && s81Var != null && surfaceView != null) {
                    long j11 = w2Var.L.video_id;
                    x2 x2Var4 = new x2();
                    x2Var4.a = s81Var.n();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap2);
                        x2Var4.b = createBitmap2;
                    }
                    w2Var.c(x2Var4);
                    hVar.k(x2Var4, j11);
                    int i13 = w2.V;
                    w2Var.n.setAlpha(0.0f);
                    x2Var = w2Var.M;
                    if (x2Var != null && (bitmap = x2Var.b) != null) {
                        w2Var.e.setImageBitmap(bitmap);
                    }
                }
                j4Var.n();
            }
        }
        pageBlock = null;
        s81Var = PhotoViewer.u1().F2;
        textureView = PhotoViewer.u1().B2;
        SurfaceView surfaceView2 = PhotoViewer.u1().C2;
        j4 j4Var2 = this.c;
        m3[] m3VarArr2 = j4Var2.u0;
        hVar = j4Var2.y;
        i11 = 0;
        fi.v vVar2 = m3VarArr2[0].b;
        childCount = vVar2.getChildCount();
        while (true) {
            if (i11 < childCount) {
            }
            i11++;
        }
        if (w2Var != null) {
            long j102 = w2Var.L.video_id;
            x2 x2Var32 = new x2();
            x2Var32.a = s81Var.n();
            if (textureView.getSurfaceTexture() != null) {
            }
            w2Var.c(x2Var32);
            hVar.k(x2Var32, j102);
            int i122 = w2.V;
            w2Var.n.setAlpha(0.0f);
            x2Var2 = w2Var.M;
            if (x2Var2 != null) {
                w2Var.e.setImageBitmap(bitmap2);
            }
        }
        if (w2Var != null) {
            long j112 = w2Var.L.video_id;
            x2 x2Var42 = new x2();
            x2Var42.a = s81Var.n();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            w2Var.c(x2Var42);
            hVar.k(x2Var42, j112);
            int i132 = w2.V;
            w2Var.n.setAlpha(0.0f);
            x2Var = w2Var.M;
            if (x2Var != null) {
                w2Var.e.setImageBitmap(bitmap);
            }
        }
        j4Var2.n();
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
        org.telegram.ui.Components.vl0 vl0Var;
        ImageReceiver e02;
        ImageReceiver e03;
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
            j4 j4Var = this.c;
            if (w2Var == j4Var.x && (videoPlayerHolderBase = j4Var.w) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
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
            ImageReceiver d02 = d0(((j1) view).a, pageBlock, iArr);
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
        if (view instanceof x1) {
            org.telegram.ui.Components.vl0 vl0Var2 = ((x1) view).d;
            if (vl0Var2 == null || (e03 = e0(vl0Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return e03;
        }
        if (!(view instanceof a2) || (vl0Var = ((a2) view).d) == null || (e02 = e0(vl0Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return e02;
    }
}
