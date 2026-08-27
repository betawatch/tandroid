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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class ri0 extends ImageView {
    public HashMap a;
    public oi0 b;
    public pi0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public ri0(Context context) {
        super(context);
    }

    public final void a() {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            oi0Var.stop();
        }
        pi0 pi0Var = this.c;
        if (pi0Var != null) {
            pi0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        oi0 oi0Var = this.b;
        return oi0Var != null && oi0Var.h0;
    }

    public final void d() {
        oi0 oi0Var = this.b;
        if (oi0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (oi0Var != null) {
                oi0Var.start();
            }
            pi0 pi0Var = this.c;
            if (pi0Var != null) {
                pi0Var.startAnimation();
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new oi0(i10, i0.a.k(i10, ""), AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        pi0 pi0Var = this.c;
        if (pi0Var != null) {
            pi0Var.onDetachedFromWindow();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        pi0 pi0Var2 = new pi0(this);
        this.c = pi0Var2;
        pi0Var2.setAllowLoadingOnAttachedOnly(true);
        String str2 = document.localThumbPath;
        if (str2 != null) {
            ImageLocation forPath = ImageLocation.getForPath(str2);
            str = com.google.android.recaptcha.internal.a.l(i10, "_", i11);
            imageLocation = forPath;
        } else {
            imageLocation = null;
            str = null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        if (this.n) {
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.l(i10, "_", i11), imageLocation, str, null, 0L, null, document, 1);
        } else if ("video/webm".equals(document.mime_type)) {
            pi0 pi0Var3 = this.c;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            String str3 = i10 + "_" + i11 + "_g";
            if (imageLocation == null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            pi0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
        } else {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.m6, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.l(i10, "_", i11), imageLocation, str, svgThumb, 0L, null, document, 1);
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
        pi0 pi0Var4 = this.c;
        Integer num = this.h;
        pi0Var4.setLayerNum(num != null ? num.intValue() : 7);
        this.c.clip = false;
        setImageDrawable(new qi0(this, i10, i11));
        if (this.e) {
            this.c.onAttachedToWindow();
        }
    }

    public oi0 getAnimatedDrawable() {
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
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            oi0Var.O(i10, str);
        }
    }

    public final void i() {
        oi0 oi0Var = this.b;
        if (oi0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (oi0Var != null) {
                oi0Var.stop();
            }
            pi0 pi0Var = this.c;
            if (pi0Var != null) {
                pi0Var.stopAnimation();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        pi0 pi0Var = this.c;
        if (pi0Var != null) {
            pi0Var.onAttachedToWindow();
            if (this.f) {
                this.c.startAnimation();
            }
        }
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            oi0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            oi0Var.stop();
        }
        pi0 pi0Var = this.c;
        if (pi0Var != null) {
            pi0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(oi0 oi0Var) {
        if (this.b == oi0Var) {
            return;
        }
        pi0 pi0Var = this.c;
        if (pi0Var != null) {
            pi0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = oi0Var;
        oi0Var.r0 = this;
        if (this.d) {
            oi0Var.I(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.W = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                oi0 oi0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                oi0Var2.s.put(str, num);
                oi0Var2.E();
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
        pi0 pi0Var = this.c;
        if (pi0Var != null) {
            pi0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            oi0Var.q0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f10) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            oi0Var.Q(f10, true);
        }
    }

    public void c() {
    }
}
