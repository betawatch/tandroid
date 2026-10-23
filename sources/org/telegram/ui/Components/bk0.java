package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class bk0 extends ImageView {
    public HashMap a;
    public yj0 b;
    public zj0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public bk0(Context context) {
        super(context);
    }

    public final void a() {
        yj0 yj0Var = this.b;
        if (yj0Var != null) {
            yj0Var.stop();
        }
        zj0 zj0Var = this.c;
        if (zj0Var != null) {
            zj0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        yj0 yj0Var = this.b;
        return yj0Var != null && yj0Var.k0;
    }

    public final void d() {
        yj0 yj0Var = this.b;
        if (yj0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (yj0Var != null) {
                yj0Var.start();
            }
            zj0 zj0Var = this.c;
            if (zj0Var != null) {
                zj0Var.startAnimation();
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new yj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        zj0 zj0Var = this.c;
        if (zj0Var != null) {
            zj0Var.onDetachedFromWindow();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        zj0 zj0Var2 = new zj0(this);
        this.c = zj0Var2;
        zj0Var2.setAllowLoadingOnAttachedOnly(true);
        String str2 = document.localThumbPath;
        if (str2 != null) {
            ImageLocation forPath = ImageLocation.getForPath(str2);
            str = a1.g.k(i10, i11, "_");
            imageLocation = forPath;
        } else {
            imageLocation = null;
            str = null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        if (this.n) {
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
        } else if ("video/webm".equals(document.mime_type)) {
            zj0 zj0Var3 = this.c;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            String str3 = i10 + "_" + i11 + "_g";
            if (imageLocation == null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            zj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
        } else {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
        }
        this.c.setAspectFit(true);
        this.c.setParentView(this);
        if (this.d) {
            this.c.setAutoRepeat(1);
            this.c.setAllowStartLottieAnimation(true);
            this.c.setAllowStartAnimation(true);
        } else {
            this.c.setAutoRepeat(0);
        }
        zj0 zj0Var4 = this.c;
        Integer num = this.h;
        zj0Var4.setLayerNum(num != null ? num.intValue() : 7);
        this.c.clip = false;
        setImageDrawable(new ak0(this, i10, i11));
        if (this.e) {
            this.c.onAttachedToWindow();
        }
    }

    public yj0 getAnimatedDrawable() {
        return this.b;
    }

    public ImageReceiver getImageReceiver() {
        return this.c;
    }

    public final void h(int i10, String str) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, Integer.valueOf(i10));
        yj0 yj0Var = this.b;
        if (yj0Var != null) {
            yj0Var.Q(i10, str);
        }
    }

    public final void i() {
        yj0 yj0Var = this.b;
        if (yj0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (yj0Var != null) {
                yj0Var.stop();
            }
            zj0 zj0Var = this.c;
            if (zj0Var != null) {
                zj0Var.stopAnimation();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        zj0 zj0Var = this.c;
        if (zj0Var != null) {
            zj0Var.onAttachedToWindow();
            if (this.f) {
                this.c.startAnimation();
            }
        }
        yj0 yj0Var = this.b;
        if (yj0Var != null) {
            yj0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        yj0 yj0Var = this.b;
        if (yj0Var != null) {
            yj0Var.stop();
        }
        zj0 zj0Var = this.c;
        if (zj0Var != null) {
            zj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(yj0 yj0Var) {
        if (this.b == yj0Var) {
            return;
        }
        zj0 zj0Var = this.c;
        if (zj0Var != null) {
            zj0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = yj0Var;
        yj0Var.R(this);
        if (this.d) {
            this.b.K(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                yj0 yj0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                yj0Var2.s.put(str, num);
                yj0Var2.G();
            }
            this.b.o();
        }
        this.b.J(true);
        setImageDrawable(this.b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        zj0 zj0Var = this.c;
        if (zj0Var != null) {
            zj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        yj0 yj0Var = this.b;
        if (yj0Var != null) {
            yj0Var.t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f7) {
        yj0 yj0Var = this.b;
        if (yj0Var != null) {
            yj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
