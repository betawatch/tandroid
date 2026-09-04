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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class aj0 extends ImageView {
    public HashMap a;
    public xi0 b;
    public yi0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public aj0(Context context) {
        super(context);
    }

    public final void a() {
        xi0 xi0Var = this.b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        xi0 xi0Var = this.b;
        return xi0Var != null && xi0Var.l0;
    }

    public final void d() {
        xi0 xi0Var = this.b;
        if (xi0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (xi0Var != null) {
                xi0Var.start();
            }
            yi0 yi0Var = this.c;
            if (yi0Var != null) {
                yi0Var.startAnimation();
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new xi0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        yi0 yi0Var = this.c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        yi0 yi0Var2 = new yi0(this);
        this.c = yi0Var2;
        yi0Var2.setAllowLoadingOnAttachedOnly(true);
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
            yi0 yi0Var3 = this.c;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            String str3 = i10 + "_" + i11 + "_g";
            if (imageLocation == null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            yi0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
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
        yi0 yi0Var4 = this.c;
        Integer num = this.h;
        yi0Var4.setLayerNum(num != null ? num.intValue() : 7);
        this.c.clip = false;
        setImageDrawable(new zi0(this, i10, i11));
        if (this.e) {
            this.c.onAttachedToWindow();
        }
    }

    public xi0 getAnimatedDrawable() {
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
        xi0 xi0Var = this.b;
        if (xi0Var != null) {
            xi0Var.O(i10, str);
        }
    }

    public final void i() {
        xi0 xi0Var = this.b;
        if (xi0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (xi0Var != null) {
                xi0Var.stop();
            }
            yi0 yi0Var = this.c;
            if (yi0Var != null) {
                yi0Var.stopAnimation();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        yi0 yi0Var = this.c;
        if (yi0Var != null) {
            yi0Var.onAttachedToWindow();
            if (this.f) {
                this.c.startAnimation();
            }
        }
        xi0 xi0Var = this.b;
        if (xi0Var != null) {
            xi0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        xi0 xi0Var = this.b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(xi0 xi0Var) {
        if (this.b == xi0Var) {
            return;
        }
        yi0 yi0Var = this.c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = xi0Var;
        xi0Var.v0 = this;
        if (this.d) {
            xi0Var.I(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                xi0 xi0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                xi0Var2.s.put(str, num);
                xi0Var2.E();
            }
            this.b.m();
        }
        this.b.H(true);
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
        yi0 yi0Var = this.c;
        if (yi0Var != null) {
            yi0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        xi0 xi0Var = this.b;
        if (xi0Var != null) {
            xi0Var.u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f7) {
        xi0 xi0Var = this.b;
        if (xi0Var != null) {
            xi0Var.Q(f7, true);
        }
    }

    public void c() {
    }
}
