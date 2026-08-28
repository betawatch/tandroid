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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class pi0 extends ImageView {
    public HashMap a;
    public mi0 b;
    public ni0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public pi0(Context context) {
        super(context);
    }

    public final void a() {
        mi0 mi0Var = this.b;
        if (mi0Var != null) {
            mi0Var.stop();
        }
        ni0 ni0Var = this.c;
        if (ni0Var != null) {
            ni0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        mi0 mi0Var = this.b;
        return mi0Var != null && mi0Var.h0;
    }

    public final void d() {
        mi0 mi0Var = this.b;
        if (mi0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (mi0Var != null) {
                mi0Var.start();
            }
            ni0 ni0Var = this.c;
            if (ni0Var != null) {
                ni0Var.startAnimation();
            }
        }
    }

    public final void e(int i9, int i10, int i11) {
        f(i9, i10, i11, null);
    }

    public final void f(int i9, int i10, int i11, int[] iArr) {
        setAnimation(new mi0(i9, j3.r0.l(i9, ""), AndroidUtilities.dp(i10), AndroidUtilities.dp(i11), false, iArr));
    }

    public final void g(int i9, int i10, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        ni0 ni0Var = this.c;
        if (ni0Var != null) {
            ni0Var.onDetachedFromWindow();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        ni0 ni0Var2 = new ni0(this);
        this.c = ni0Var2;
        ni0Var2.setAllowLoadingOnAttachedOnly(true);
        String str2 = document.localThumbPath;
        if (str2 != null) {
            ImageLocation forPath = ImageLocation.getForPath(str2);
            str = e2.c.l(i9, "_", i10);
            imageLocation = forPath;
        } else {
            imageLocation = null;
            str = null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        if (this.n) {
            this.c.setImage(ImageLocation.getForDocument(document), i9 + "_" + i10 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.l(i9, "_", i10), imageLocation, str, null, 0L, null, document, 1);
        } else if ("video/webm".equals(document.mime_type)) {
            ni0 ni0Var3 = this.c;
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            String str3 = i9 + "_" + i10 + "_g";
            if (imageLocation == null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            ni0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
        } else {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.m6, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            this.c.setImage(ImageLocation.getForDocument(document), i9 + "_" + i10 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.l(i9, "_", i10), imageLocation, str, svgThumb, 0L, null, document, 1);
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
        ni0 ni0Var4 = this.c;
        Integer num = this.h;
        ni0Var4.setLayerNum(num != null ? num.intValue() : 7);
        this.c.clip = false;
        setImageDrawable(new oi0(this, i9, i10));
        if (this.e) {
            this.c.onAttachedToWindow();
        }
    }

    public mi0 getAnimatedDrawable() {
        return this.b;
    }

    public ImageReceiver getImageReceiver() {
        return this.c;
    }

    public final void h(int i9, String str) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, Integer.valueOf(i9));
        mi0 mi0Var = this.b;
        if (mi0Var != null) {
            mi0Var.O(i9, str);
        }
    }

    public final void i() {
        mi0 mi0Var = this.b;
        if (mi0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (mi0Var != null) {
                mi0Var.stop();
            }
            ni0 ni0Var = this.c;
            if (ni0Var != null) {
                ni0Var.stopAnimation();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        ni0 ni0Var = this.c;
        if (ni0Var != null) {
            ni0Var.onAttachedToWindow();
            if (this.f) {
                this.c.startAnimation();
            }
        }
        mi0 mi0Var = this.b;
        if (mi0Var != null) {
            mi0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        mi0 mi0Var = this.b;
        if (mi0Var != null) {
            mi0Var.stop();
        }
        ni0 ni0Var = this.c;
        if (ni0Var != null) {
            ni0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(mi0 mi0Var) {
        if (this.b == mi0Var) {
            return;
        }
        ni0 ni0Var = this.c;
        if (ni0Var != null) {
            ni0Var.onDetachedFromWindow();
            this.c = null;
        }
        this.b = mi0Var;
        mi0Var.r0 = this;
        if (this.d) {
            mi0Var.I(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.W = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                mi0 mi0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                mi0Var2.s.put(str, num);
                mi0Var2.E();
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
    public void setImageResource(int i9) {
        super.setImageResource(i9);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ni0 ni0Var = this.c;
        if (ni0Var != null) {
            ni0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        mi0 mi0Var = this.b;
        if (mi0Var != null) {
            mi0Var.q0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f10) {
        mi0 mi0Var = this.b;
        if (mi0Var != null) {
            mi0Var.Q(f10, true);
        }
    }

    public void c() {
    }
}
