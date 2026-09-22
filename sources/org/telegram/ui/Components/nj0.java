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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class nj0 extends ImageView {
    public HashMap a;
    public kj0 b;
    public lj0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public nj0(Context context) {
        super(context);
    }

    public final void a() {
        kj0 kj0Var = this.b;
        if (kj0Var != null) {
            kj0Var.stop();
        }
        lj0 lj0Var = this.c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        kj0 kj0Var = this.b;
        return kj0Var != null && kj0Var.k0;
    }

    public final void d() {
        kj0 kj0Var = this.b;
        if (kj0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (kj0Var != null) {
                kj0Var.start();
            }
            lj0 lj0Var = this.c;
            if (lj0Var != null) {
                lj0Var.startAnimation();
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new kj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        lj0 lj0Var = this.c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        lj0 lj0Var2 = new lj0(this);
        this.c = lj0Var2;
        lj0Var2.setAllowLoadingOnAttachedOnly(true);
        String str2 = document.localThumbPath;
        if (str2 != null) {
            ImageLocation forPath = ImageLocation.getForPath(str2);
            str = a4.a.k(i10, i11, "_");
            imageLocation = forPath;
        } else {
            imageLocation = null;
            str = null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        if (this.n) {
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
        } else if ("video/webm".equals(document.mime_type)) {
            lj0 lj0Var3 = this.c;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            String str3 = i10 + "_" + i11 + "_g";
            if (imageLocation == null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            lj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
        } else {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
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
        lj0 lj0Var4 = this.c;
        Integer num = this.h;
        lj0Var4.setLayerNum(num != null ? num.intValue() : 7);
        this.c.clip = false;
        setImageDrawable(new mj0(this, i10, i11));
        if (this.e) {
            this.c.onAttachedToWindow();
        }
    }

    public kj0 getAnimatedDrawable() {
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
        kj0 kj0Var = this.b;
        if (kj0Var != null) {
            kj0Var.Q(i10, str);
        }
    }

    public final void i() {
        kj0 kj0Var = this.b;
        if (kj0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (kj0Var != null) {
                kj0Var.stop();
            }
            lj0 lj0Var = this.c;
            if (lj0Var != null) {
                lj0Var.stopAnimation();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        lj0 lj0Var = this.c;
        if (lj0Var != null) {
            lj0Var.onAttachedToWindow();
            if (this.f) {
                this.c.startAnimation();
            }
        }
        kj0 kj0Var = this.b;
        if (kj0Var != null) {
            kj0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        kj0 kj0Var = this.b;
        if (kj0Var != null) {
            kj0Var.stop();
        }
        lj0 lj0Var = this.c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(kj0 kj0Var) {
        if (this.b == kj0Var) {
            return;
        }
        lj0 lj0Var = this.c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = kj0Var;
        kj0Var.R(this);
        if (this.d) {
            this.b.K(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                kj0 kj0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                kj0Var2.s.put(str, num);
                kj0Var2.G();
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
        lj0 lj0Var = this.c;
        if (lj0Var != null) {
            lj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        kj0 kj0Var = this.b;
        if (kj0Var != null) {
            kj0Var.t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f7) {
        kj0 kj0Var = this.b;
        if (kj0Var != null) {
            kj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
