// default package

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
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ex extends jb8 {
    public final int[] a = new int[2];
    public final List b;
    public final /* synthetic */ o c;

    public ex(o oVar, List list) {
        this.c = oVar;
        this.b = list;
    }

    @Override // jb8, pb8
    public final void D() {
        this.c.k();
    }

    @Override // jb8, pb8
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        if (i < 0) {
            return null;
        }
        List list = this.b;
        if (i >= list.size()) {
            return null;
        }
        o oVar = this.c;
        hx hxVar = oVar.v0[0].b;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) list.get(i);
        int[] iArr = this.a;
        ImageReceiver e0 = e0(hxVar, pageBlock, iArr);
        if (e0 == null) {
            return null;
        }
        qb8 qb8Var = new qb8();
        qb8Var.b = iArr[0];
        qb8Var.c = iArr[1];
        qb8Var.d = oVar.v0[0].b;
        qb8Var.a = e0;
        qb8Var.e = e0.p();
        qb8Var.h = e0.z();
        qb8Var.j = oVar.K0;
        return qb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EDGE_INSN: B:46:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:7:0x0034->B:44:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // jb8, pb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(int i) {
        TL_iv.PageBlock pageBlock;
        ndc ndcVar;
        TextureView textureView;
        vh6 vh6Var;
        int i2;
        int childCount;
        yw ywVar;
        Bitmap bitmap;
        yw ywVar2;
        Bitmap bitmap2;
        xw xwVar = null;
        if (i >= 0) {
            List list = this.b;
            if (i < list.size()) {
                pageBlock = (TL_iv.PageBlock) list.get(i);
                ndcVar = PhotoViewer.r0().G2;
                textureView = PhotoViewer.r0().C2;
                SurfaceView surfaceView = PhotoViewer.r0().D2;
                o oVar = this.c;
                m[] mVarArr = oVar.v0;
                vh6Var = oVar.E;
                i2 = 0;
                hx hxVar = mVarArr[0].b;
                childCount = hxVar.getChildCount();
                while (true) {
                    if (i2 < childCount) {
                        break;
                    }
                    View childAt = hxVar.getChildAt(i2);
                    if (childAt instanceof xw) {
                        xw xwVar2 = (xw) childAt;
                        if (xwVar2.M == pageBlock) {
                            xwVar = xwVar2;
                            break;
                        }
                    }
                    i2++;
                }
                if (xwVar != null && ndcVar != null && textureView != null) {
                    long j = xwVar.M.video_id;
                    yw ywVar3 = new yw();
                    ywVar3.a = ndcVar.S();
                    if (textureView.getSurfaceTexture() != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Surface surface = new Surface(textureView.getSurfaceTexture());
                            Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            gm.x0(surface, createBitmap);
                            surface.release();
                            ywVar3.b = createBitmap;
                        } else {
                            ywVar3.b = textureView.getBitmap();
                        }
                    }
                    xwVar.c(ywVar3);
                    vh6Var.k(ywVar3, j);
                    xwVar.n.setAlpha(0.0f);
                    ywVar2 = xwVar.N;
                    if (ywVar2 != null && (bitmap2 = ywVar2.b) != null) {
                        xwVar.e.f0(bitmap2);
                    }
                }
                if (xwVar != null && ndcVar != null && surfaceView != null) {
                    long j2 = xwVar.M.video_id;
                    yw ywVar4 = new yw();
                    ywVar4.a = ndcVar.S();
                    if (Build.VERSION.SDK_INT >= 24) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        gm.y0(surfaceView, createBitmap2);
                        ywVar4.b = createBitmap2;
                    }
                    xwVar.c(ywVar4);
                    vh6Var.k(ywVar4, j2);
                    xwVar.n.setAlpha(0.0f);
                    ywVar = xwVar.N;
                    if (ywVar != null && (bitmap = ywVar.b) != null) {
                        xwVar.e.f0(bitmap);
                    }
                }
                oVar.k();
            }
        }
        pageBlock = null;
        ndcVar = PhotoViewer.r0().G2;
        textureView = PhotoViewer.r0().C2;
        SurfaceView surfaceView2 = PhotoViewer.r0().D2;
        o oVar2 = this.c;
        m[] mVarArr2 = oVar2.v0;
        vh6Var = oVar2.E;
        i2 = 0;
        hx hxVar2 = mVarArr2[0].b;
        childCount = hxVar2.getChildCount();
        while (true) {
            if (i2 < childCount) {
            }
            i2++;
        }
        if (xwVar != null) {
            long j3 = xwVar.M.video_id;
            yw ywVar32 = new yw();
            ywVar32.a = ndcVar.S();
            if (textureView.getSurfaceTexture() != null) {
            }
            xwVar.c(ywVar32);
            vh6Var.k(ywVar32, j3);
            xwVar.n.setAlpha(0.0f);
            ywVar2 = xwVar.N;
            if (ywVar2 != null) {
                xwVar.e.f0(bitmap2);
            }
        }
        if (xwVar != null) {
            long j22 = xwVar.M.video_id;
            yw ywVar42 = new yw();
            ywVar42.a = ndcVar.S();
            if (Build.VERSION.SDK_INT >= 24) {
            }
            xwVar.c(ywVar42);
            vh6Var.k(ywVar42, j22);
            xwVar.n.setAlpha(0.0f);
            ywVar = xwVar.N;
            if (ywVar != null) {
                xwVar.e.f0(bitmap);
            }
        }
        oVar2.k();
    }

    public final ImageReceiver e0(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageReceiver f0 = f0(viewGroup.getChildAt(i), pageBlock, iArr);
            if (f0 != null) {
                return f0;
            }
        }
        return null;
    }

    public final ImageReceiver f0(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
        b59 b59Var;
        ImageReceiver f0;
        ImageReceiver f02;
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (view instanceof cw) {
            cw cwVar = (cw) view;
            if (cwVar.O != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            return cwVar.e;
        }
        if (view instanceof xw) {
            xw xwVar = (xw) view;
            ImageReceiver imageReceiver = xwVar.e;
            TextureView textureView = xwVar.n;
            if (xwVar.M != pageBlock) {
                return null;
            }
            view.getLocationInWindow(iArr);
            o oVar = this.c;
            if (xwVar == oVar.y && (videoPlayerHolderBase = oVar.x) != null && videoPlayerHolderBase.firstFrameRendered && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    gm.x0(surface, createBitmap);
                    surface.release();
                    imageReceiver.f0(createBitmap);
                } else {
                    imageReceiver.f0(textureView.getBitmap());
                }
                textureView.setAlpha(0.0f);
            }
            return imageReceiver;
        }
        if (view instanceof mv) {
            ImageReceiver e0 = e0(((mv) view).a, pageBlock, iArr);
            if (e0 != null) {
                return e0;
            }
            return null;
        }
        if (view instanceof pw) {
            ImageReceiver e02 = e0(((pw) view).b, pageBlock, iArr);
            if (e02 != null) {
                return e02;
            }
            return null;
        }
        if (view instanceof xv) {
            b59 b59Var2 = ((xv) view).d;
            if (b59Var2 == null || (f02 = f0(b59Var2.a, pageBlock, iArr)) == null) {
                return null;
            }
            return f02;
        }
        if (!(view instanceof aw) || (b59Var = ((aw) view).d) == null || (f0 = f0(b59Var.a, pageBlock, iArr)) == null) {
            return null;
        }
        return f0;
    }
}
