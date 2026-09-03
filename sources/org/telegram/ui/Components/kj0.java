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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class kj0 extends ImageView {
    public HashMap a;
    public hj0 b;
    public ij0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public kj0(Context context) {
        super(context);
    }

    public final void a() {
        hj0 hj0Var = this.b;
        if (hj0Var != null) {
            hj0Var.stop();
        }
        ij0 ij0Var = this.c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        hj0 hj0Var = this.b;
        return hj0Var != null && hj0Var.i0;
    }

    public final void d() {
        hj0 hj0Var = this.b;
        if (hj0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (hj0Var != null) {
                hj0Var.start();
            }
            ij0 ij0Var = this.c;
            if (ij0Var != null) {
                ij0Var.startAnimation();
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new hj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        ij0 ij0Var = this.c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        ij0 ij0Var2 = new ij0(this);
        this.c = ij0Var2;
        ij0Var2.setAllowLoadingOnAttachedOnly(true);
        String str2 = document.localThumbPath;
        if (str2 != null) {
            ImageLocation forPath = ImageLocation.getForPath(str2);
            str = e2.c.h(i10, "_", i11);
            imageLocation = forPath;
        } else {
            imageLocation = null;
            str = null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        if (this.n) {
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i11), imageLocation, str, null, 0L, null, document, 1);
        } else if ("video/webm".equals(document.mime_type)) {
            ij0 ij0Var3 = this.c;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            String str3 = i10 + "_" + i11 + "_g";
            if (imageLocation == null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            ij0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
        } else {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i11), imageLocation, str, svgThumb, 0L, null, document, 1);
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
        ij0 ij0Var4 = this.c;
        Integer num = this.h;
        ij0Var4.setLayerNum(num != null ? num.intValue() : 7);
        this.c.clip = false;
        setImageDrawable(new jj0(this, i10, i11));
        if (this.e) {
            this.c.onAttachedToWindow();
        }
    }

    public hj0 getAnimatedDrawable() {
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
        hj0 hj0Var = this.b;
        if (hj0Var != null) {
            hj0Var.O(i10, str);
        }
    }

    public final void i() {
        hj0 hj0Var = this.b;
        if (hj0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (hj0Var != null) {
                hj0Var.stop();
            }
            ij0 ij0Var = this.c;
            if (ij0Var != null) {
                ij0Var.stopAnimation();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        ij0 ij0Var = this.c;
        if (ij0Var != null) {
            ij0Var.onAttachedToWindow();
            if (this.f) {
                this.c.startAnimation();
            }
        }
        hj0 hj0Var = this.b;
        if (hj0Var != null) {
            hj0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        hj0 hj0Var = this.b;
        if (hj0Var != null) {
            hj0Var.stop();
        }
        ij0 ij0Var = this.c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(hj0 hj0Var) {
        if (this.b == hj0Var) {
            return;
        }
        ij0 ij0Var = this.c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = hj0Var;
        hj0Var.s0 = this;
        if (this.d) {
            hj0Var.I(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.X = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                hj0 hj0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                hj0Var2.s.put(str, num);
                hj0Var2.E();
            }
            this.b.m();
        }
        this.b.H(true);
        setImageDrawable(this.b);
    }

    public void setAutoRepeat(boolean z4) {
        this.d = z4;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ij0 ij0Var = this.c;
        if (ij0Var != null) {
            ij0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        hj0 hj0Var = this.b;
        if (hj0Var != null) {
            hj0Var.r0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z4) {
        this.n = z4;
    }

    public void setProgress(float f10) {
        hj0 hj0Var = this.b;
        if (hj0Var != null) {
            hj0Var.Q(f10, true);
        }
    }

    public void c() {
    }
}
