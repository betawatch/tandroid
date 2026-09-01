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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class lj0 extends ImageView {
    public HashMap a;
    public ij0 b;
    public jj0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public lj0(Context context) {
        super(context);
    }

    public final void a() {
        ij0 ij0Var = this.b;
        if (ij0Var != null) {
            ij0Var.stop();
        }
        jj0 jj0Var = this.c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ij0 ij0Var = this.b;
        return ij0Var != null && ij0Var.i0;
    }

    public final void d() {
        ij0 ij0Var = this.b;
        if (ij0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (ij0Var != null) {
                ij0Var.start();
            }
            jj0 jj0Var = this.c;
            if (jj0Var != null) {
                jj0Var.startAnimation();
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new ij0(i10, l.d.j(i10, ""), AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        jj0 jj0Var = this.c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        jj0 jj0Var2 = new jj0(this);
        this.c = jj0Var2;
        jj0Var2.setAllowLoadingOnAttachedOnly(true);
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
            jj0 jj0Var3 = this.c;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            String str3 = i10 + "_" + i11 + "_g";
            if (imageLocation == null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            jj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
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
        jj0 jj0Var4 = this.c;
        Integer num = this.h;
        jj0Var4.setLayerNum(num != null ? num.intValue() : 7);
        this.c.clip = false;
        setImageDrawable(new kj0(this, i10, i11));
        if (this.e) {
            this.c.onAttachedToWindow();
        }
    }

    public ij0 getAnimatedDrawable() {
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
        ij0 ij0Var = this.b;
        if (ij0Var != null) {
            ij0Var.O(i10, str);
        }
    }

    public final void i() {
        ij0 ij0Var = this.b;
        if (ij0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (ij0Var != null) {
                ij0Var.stop();
            }
            jj0 jj0Var = this.c;
            if (jj0Var != null) {
                jj0Var.stopAnimation();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        jj0 jj0Var = this.c;
        if (jj0Var != null) {
            jj0Var.onAttachedToWindow();
            if (this.f) {
                this.c.startAnimation();
            }
        }
        ij0 ij0Var = this.b;
        if (ij0Var != null) {
            ij0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        ij0 ij0Var = this.b;
        if (ij0Var != null) {
            ij0Var.stop();
        }
        jj0 jj0Var = this.c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(ij0 ij0Var) {
        if (this.b == ij0Var) {
            return;
        }
        jj0 jj0Var = this.c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = ij0Var;
        ij0Var.s0 = this;
        if (this.d) {
            ij0Var.I(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.X = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ij0 ij0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ij0Var2.s.put(str, num);
                ij0Var2.E();
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
        jj0 jj0Var = this.c;
        if (jj0Var != null) {
            jj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ij0 ij0Var = this.b;
        if (ij0Var != null) {
            ij0Var.r0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z4) {
        this.n = z4;
    }

    public void setProgress(float f10) {
        ij0 ij0Var = this.b;
        if (ij0Var != null) {
            ij0Var.Q(f10, true);
        }
    }

    public void c() {
    }
}
