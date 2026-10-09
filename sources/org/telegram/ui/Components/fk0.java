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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class fk0 extends ImageView {
    public HashMap a;
    public ck0 b;
    public dk0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public fk0(Context context) {
        super(context);
    }

    public final void a() {
        ck0 ck0Var = this.b;
        if (ck0Var != null) {
            ck0Var.stop();
        }
        dk0 dk0Var = this.c;
        if (dk0Var != null) {
            dk0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ck0 ck0Var = this.b;
        return ck0Var != null && ck0Var.k0;
    }

    public final void d() {
        ck0 ck0Var = this.b;
        if (ck0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (ck0Var != null) {
                ck0Var.start();
            }
            dk0 dk0Var = this.c;
            if (dk0Var != null) {
                dk0Var.startAnimation();
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new ck0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        dk0 dk0Var = this.c;
        if (dk0Var != null) {
            dk0Var.onDetachedFromWindow();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        dk0 dk0Var2 = new dk0(this);
        this.c = dk0Var2;
        dk0Var2.setAllowLoadingOnAttachedOnly(true);
        String str2 = document.localThumbPath;
        if (str2 != null) {
            ImageLocation forPath = ImageLocation.getForPath(str2);
            str = a1.g.l(i10, i11, "_");
            imageLocation = forPath;
        } else {
            imageLocation = null;
            str = null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        if (this.n) {
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
        } else if ("video/webm".equals(document.mime_type)) {
            dk0 dk0Var3 = this.c;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            String str3 = i10 + "_" + i11 + "_g";
            if (imageLocation == null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            dk0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
        } else {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.m6, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            this.c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
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
        dk0 dk0Var4 = this.c;
        Integer num = this.h;
        dk0Var4.setLayerNum(num != null ? num.intValue() : 7);
        this.c.clip = false;
        setImageDrawable(new ek0(this, i10, i11));
        if (this.e) {
            this.c.onAttachedToWindow();
        }
    }

    public ck0 getAnimatedDrawable() {
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
        ck0 ck0Var = this.b;
        if (ck0Var != null) {
            ck0Var.Q(i10, str);
        }
    }

    public final void i() {
        ck0 ck0Var = this.b;
        if (ck0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (ck0Var != null) {
                ck0Var.stop();
            }
            dk0 dk0Var = this.c;
            if (dk0Var != null) {
                dk0Var.stopAnimation();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        dk0 dk0Var = this.c;
        if (dk0Var != null) {
            dk0Var.onAttachedToWindow();
            if (this.f) {
                this.c.startAnimation();
            }
        }
        ck0 ck0Var = this.b;
        if (ck0Var != null) {
            ck0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        ck0 ck0Var = this.b;
        if (ck0Var != null) {
            ck0Var.stop();
        }
        dk0 dk0Var = this.c;
        if (dk0Var != null) {
            dk0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(ck0 ck0Var) {
        if (this.b == ck0Var) {
            return;
        }
        dk0 dk0Var = this.c;
        if (dk0Var != null) {
            dk0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = ck0Var;
        ck0Var.R(this);
        if (this.d) {
            this.b.K(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ck0 ck0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ck0Var2.s.put(str, num);
                ck0Var2.G();
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
        dk0 dk0Var = this.c;
        if (dk0Var != null) {
            dk0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ck0 ck0Var = this.b;
        if (ck0Var != null) {
            ck0Var.t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f7) {
        ck0 ck0Var = this.b;
        if (ck0Var != null) {
            ck0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
