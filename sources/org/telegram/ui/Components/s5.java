package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class s5 extends Drawable {
    public static SparseArray q;
    public static HashMap r;
    public static boolean s;
    public static boolean t;
    public static boolean u;
    public static final ah.j v = new ah.j(24);
    public static HashMap w;
    public boolean a;
    public ArrayList b;
    public ArrayList c;
    public int d;
    public TLRPC.Document e;
    public long f;
    public int g;
    public int h;
    public String i;
    public boolean j;
    public bi.b4 k;
    public boolean m;
    public ColorFilter p;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public s5(int i10, int i11, long j10) {
        this.h = i11;
        this.g = i10;
        y();
        this.f = j10;
        h(i11).b(j10, new k5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j10) {
        HashMap hashMap = h(i10).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j10));
    }

    public static int g() {
        return SharedConfig.getDevicePerformanceClass() == 0 ? 0 : 2;
    }

    public static o5 h(int i10) {
        if (r == null) {
            r = new HashMap();
        }
        o5 o5Var = (o5) r.get(Integer.valueOf(i10));
        if (o5Var != null) {
            return o5Var;
        }
        HashMap hashMap = r;
        Integer valueOf = Integer.valueOf(i10);
        o5 o5Var2 = new o5(i10);
        hashMap.put(valueOf, o5Var2);
        return o5Var2;
    }

    public static s5 m(int i10, int i11, TLRPC.Document document) {
        if (q == null) {
            q = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        s5 s5Var = (s5) longSparseArray.get(document.id);
        if (s5Var != null) {
            return s5Var;
        }
        long j10 = document.id;
        s5 s5Var2 = new s5(i11, i10, document);
        longSparseArray.put(j10, s5Var2);
        return s5Var2;
    }

    public static s5 n(int i10, long j10, String str, int i11) {
        if (q == null) {
            q = new SparseArray();
        }
        int i12 = 1;
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) q.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = q;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        s5 s5Var = (s5) longSparseArray.get(j10);
        if (s5Var != null) {
            return s5Var;
        }
        s5 s5Var2 = new s5();
        s5Var2.l = 1.0f;
        s5Var2.n = null;
        s5Var2.o = null;
        s5Var2.h = i10;
        s5Var2.g = i11;
        s5Var2.y();
        s5Var2.f = j10;
        s5Var2.i = str;
        h(i10).b(j10, new k5(s5Var2, i12));
        longSparseArray.put(j10, s5Var2);
        return s5Var2;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        bi.b4 b4Var;
        boolean z11 = !z10;
        if (u == z11) {
            return;
        }
        u = z11;
        if (q == null || (longSparseArray = (LongSparseArray) q.get(Objects.hash(Integer.valueOf(i10), 25))) == null) {
            return;
        }
        for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
            s5 s5Var = (s5) longSparseArray.valueAt(i11);
            if (s5Var != null && (b4Var = s5Var.k) != null) {
                if (z10) {
                    b4Var.setAllowStartLottieAnimation(true);
                    b4Var.setAllowStartAnimation(true);
                    b4Var.setAutoRepeat(1);
                    f6 animation = b4Var.getAnimation();
                    if (animation != null) {
                        boolean z12 = b4Var.useSharedAnimationQueue;
                        if (!animation.n0) {
                            animation.v0 = z12;
                        }
                        animation.start();
                    } else {
                        yj0 lottieAnimation = b4Var.getLottieAnimation();
                        if (lottieAnimation != null) {
                            lottieAnimation.start();
                        }
                    }
                } else {
                    b4Var.setAllowStartAnimation(false);
                    b4Var.setAllowStartLottieAnimation(false);
                    b4Var.setAutoRepeat(0);
                    b4Var.stopAnimation();
                }
            }
        }
    }

    public static void u() {
        if (q == null) {
            return;
        }
        x();
        for (int i10 = 0; i10 < q.size(); i10++) {
            LongSparseArray longSparseArray = (LongSparseArray) q.valueAt(i10);
            for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                long keyAt = longSparseArray.keyAt(i11);
                s5 s5Var = (s5) longSparseArray.get(keyAt);
                if (s5Var == null || !s5Var.a) {
                    longSparseArray.remove(keyAt);
                } else {
                    s5Var.j(true);
                }
            }
        }
    }

    public static void x() {
        s = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        t = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    public final void a(View view) {
        if (view instanceof org.telegram.ui.t61) {
            throw new RuntimeException();
        }
        this.m = false;
        if (this.b == null) {
            this.b = new ArrayList(10);
        }
        if (!this.b.contains(view)) {
            this.b.add(view);
        }
        v();
    }

    public final void b(y5 y5Var) {
        if (this.c == null) {
            this.c = new ArrayList(10);
        }
        this.m = false;
        if (!this.c.contains(y5Var)) {
            this.c.add(y5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.g == 19) {
            return true;
        }
        Boolean bool = this.n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!l() && !MessageObject.isTextColorEmoji(this.e)) {
            z10 = false;
        }
        this.n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.m = false;
        v();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        bi.b4 b4Var = this.k;
        if (b4Var == null) {
            return;
        }
        b4Var.setImageCoords(getBounds());
        this.k.setAlpha(this.l);
        this.k.draw(canvas);
    }

    public final void e() {
        if (this.k == null) {
            bi.b4 b4Var = new bi.b4(this, 4);
            this.k = b4Var;
            b4Var.setCurrentAccount(this.h);
            this.k.setAllowLoadingOnAttachedOnly(true);
            if (this.g == 12) {
                this.k.ignoreNotifications = true;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.l * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final long i() {
        TLRPC.Document document = this.e;
        return document != null ? document.id : this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        SvgHelper.SvgDrawable svgThumb;
        String str;
        int i10;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        Drawable drawable;
        int i11;
        String str2 = this.i;
        int i12 = this.g;
        TLRPC.Document document = this.e;
        if (document != null) {
            if (this.k == null || this.j || z10) {
                if ((i12 == 20 || i12 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                this.j = false;
                e();
                if (this.p != null && c()) {
                    this.k.setColorFilter(this.p);
                }
                if (i12 != 0) {
                    int i13 = i12 == 12 ? 2 : i12;
                    this.k.setUniqKeyPrefix(i13 + "_");
                }
                this.k.setVideoThumbIsSame(true);
                boolean z11 = (SharedConfig.getDevicePerformanceClass() == 0 && i12 == 5) || ((i12 == 2 || i12 == 25) && !s) || (i12 == 3 && !t);
                if (i12 == 13 || i12 == 16) {
                    z11 = true;
                }
                if (i12 == 24 || i12 == 27) {
                    z11 = false;
                }
                String str3 = this.d + "_" + this.d;
                if (i12 == 12) {
                    str3 = t8.b.u(str3, "_d_nostream");
                }
                if (i12 != 17 && i12 != 15 && i12 != 14 && i12 != 8 && ((i12 != 1 || SharedConfig.getDevicePerformanceClass() < 2) && i12 != 12)) {
                    str3 = t8.b.u(str3, "_pcache");
                }
                if (i12 != 17 && i12 != 0 && i12 != 26 && i12 != 1 && i12 != 14 && i12 != 15 && i12 != 19 && i12 != 20 && i12 != 21) {
                    str3 = t8.b.u(str3, "_compress");
                }
                if (i12 == 8) {
                    str3 = t8.b.u(str3, "firstframe");
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.e.thumbs, 90);
                if ("video/webm".equals(this.e.mime_type)) {
                    ImageLocation forDocument = ImageLocation.getForDocument(this.e);
                    String u10 = t8.b.u(str3, "_g");
                    svgThumb = DocumentObject.getSvgThumb(this.e.thumbs, org.telegram.ui.ActionBar.g6.m6, 0.2f, true);
                    str = u10;
                    i10 = 20;
                    imageLocation = forDocument;
                } else if ("application/x-tgsticker".equals(this.e.mime_type)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12 != 0 ? a1.g.m(i12, "_") : "");
                    sb2.append(this.f);
                    sb2.append("@");
                    sb2.append(str3);
                    String sb3 = sb2.toString();
                    if (SharedConfig.getDevicePerformanceClass() != 0 || i12 == 2 || i12 == 25 || i12 == 22 || !ImageLoader.getInstance().hasLottieMemCache(sb3)) {
                        SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(this.e.thumbs, org.telegram.ui.ActionBar.g6.m6, i12 == 22 ? 0.8f : 0.2f);
                        if (svgThumb2 != null && MessageObject.isAnimatedStickerDocument(this.e, true)) {
                            svgThumb2.overrideWidthAndHeight(512, 512);
                        }
                        svgThumb = svgThumb2;
                    } else {
                        svgThumb = null;
                    }
                    str = str3;
                    imageLocation = ImageLocation.getForDocument(this.e);
                    i10 = 20;
                } else {
                    svgThumb = DocumentObject.getSvgThumb(this.e.thumbs, org.telegram.ui.ActionBar.g6.m6, 0.2f, true);
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(this.e, true)) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    str = str3;
                    i10 = 20;
                    imageLocation = null;
                }
                if (i12 == i10 || i12 == 21) {
                    imageLocation2 = null;
                    Drawable emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.e, null));
                    if (emojiDrawable != null) {
                        drawable = emojiDrawable;
                        if (str2 == null) {
                            this.k.setImageBitmap(new f6(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                        } else if (i12 == 8) {
                            bi.b4 b4Var = this.k;
                            TLRPC.Document document2 = this.e;
                            b4Var.setImage(null, null, imageLocation, str, null, null, drawable, document2.size, null, document2, 1);
                        } else {
                            ImageLocation imageLocation3 = imageLocation;
                            String str4 = str;
                            if (z11 || !(s || i12 == 14)) {
                                ImageLocation forDocument2 = i12 == 16 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e) : imageLocation2;
                                if ("video/webm".equals(this.e.mime_type)) {
                                    bi.b4 b4Var2 = this.k;
                                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e);
                                    String str5 = this.d + "_" + this.d;
                                    TLRPC.Document document3 = this.e;
                                    b4Var2.setImage(null, null, forDocument3, str5, forDocument2, null, drawable, document3.size, null, document3, 1);
                                } else if (MessageObject.isAnimatedStickerDocument(this.e, true)) {
                                    bi.b4 b4Var3 = this.k;
                                    String u11 = t8.b.u(str4, "_firstframe");
                                    TLRPC.Document document4 = this.e;
                                    b4Var3.setImage(imageLocation3, u11, forDocument2, null, drawable, document4.size, null, document4, 1);
                                } else {
                                    bi.b4 b4Var4 = this.k;
                                    ImageLocation forDocument4 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e);
                                    String str6 = this.d + "_" + this.d;
                                    TLRPC.Document document5 = this.e;
                                    b4Var4.setImage(forDocument4, str6, forDocument2, null, drawable, document5.size, null, document5, 1);
                                }
                            } else {
                                ImageLocation forDocument5 = i12 == 17 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e) : imageLocation2;
                                bi.b4 b4Var5 = this.k;
                                ImageLocation forDocument6 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e);
                                String str7 = this.d + "_" + this.d;
                                TLRPC.Document document6 = this.e;
                                b4Var5.setImage(imageLocation3, str4, forDocument6, str7, forDocument5, null, drawable, document6.size, null, document6, 1);
                            }
                        }
                        w(this.k);
                        if (i12 != 13 || i12 == 16 || i12 == 3 || i12 == 5 || i12 == 4 || i12 == 24) {
                            this.k.setLayerNum(7);
                        }
                        if (i12 != 9 || i12 == 21 || i12 == 27) {
                            this.k.setLayerNum(6656);
                        }
                        this.k.setAspectFit(true);
                        if (i12 != 12 || i12 == 26 || i12 == 18 || i12 == 8 || i12 == 6 || i12 == 5 || (i12 == 25 && u)) {
                            i11 = 0;
                            this.k.setAllowStartAnimation(false);
                            this.k.setAllowStartLottieAnimation(false);
                            this.k.setAutoRepeat(0);
                        } else {
                            this.k.setAllowStartLottieAnimation(true);
                            this.k.setAllowStartAnimation(true);
                            this.k.setAutoRepeat(1);
                            i11 = 0;
                        }
                        this.k.setAllowDecodeSingleFrame(true);
                        this.k.setRoundRadius((i12 != 5 || i12 == 6 || i12 == 27) ? AndroidUtilities.dp(6.0f) : i12 == 24 ? AndroidUtilities.dp(14.0f) : i11);
                        v();
                        k();
                    }
                } else {
                    imageLocation2 = null;
                }
                drawable = svgThumb;
                if (str2 == null) {
                }
                w(this.k);
                if (i12 != 13) {
                }
                this.k.setLayerNum(7);
                if (i12 != 9) {
                }
                this.k.setLayerNum(6656);
                this.k.setAspectFit(true);
                if (i12 != 12) {
                }
                i11 = 0;
                this.k.setAllowStartAnimation(false);
                this.k.setAllowStartLottieAnimation(false);
                this.k.setAutoRepeat(0);
                this.k.setAllowDecodeSingleFrame(true);
                this.k.setRoundRadius((i12 != 5 || i12 == 6 || i12 == 27) ? AndroidUtilities.dp(6.0f) : i12 == 24 ? AndroidUtilities.dp(14.0f) : i11);
                v();
                k();
            }
        }
    }

    public final void k() {
        if (this.b != null) {
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                View view = (View) this.b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.c != null) {
            for (int i11 = 0; i11 < this.c.size(); i11++) {
                y5 y5Var = (y5) this.c.get(i11);
                if (y5Var != null) {
                    y5Var.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r2 != 2964141614563343L) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l() {
        Boolean bool = this.o;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Document document = this.e;
        boolean z10 = false;
        if (document != null) {
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(document);
            if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses)) {
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                    long j10 = inputStickerSet.id;
                    if (j10 != 773947703670341676L) {
                    }
                }
                this.o = Boolean.valueOf(z10);
            }
            z10 = true;
            this.o = Boolean.valueOf(z10);
        }
        return z10;
    }

    public final void o(View view) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.m = false;
        v();
    }

    public final void p(y5 y5Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(y5Var);
        }
        this.m = false;
        v();
    }

    public final void q(long j10) {
        bi.b4 b4Var = this.k;
        if (b4Var != null) {
            if (this.g == 8) {
                j10 = 0;
            }
            b4Var.setCurrentTime(j10);
        }
    }

    public final void r(String str) {
        int i10 = this.g;
        if ((i10 == 20 || i10 == 21) && !TextUtils.isEmpty(str) && this.k == null) {
            e();
            this.j = true;
            this.k.setImageBitmap(Emoji.getEmojiDrawable(str));
            this.k.setCrossfadeWithOldImage(true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.l = f7;
        bi.b4 b4Var = this.k;
        if (b4Var != null) {
            b4Var.setAlpha(f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.k == null || this.e == null) {
            this.p = colorFilter;
        } else if (c()) {
            this.k.setColorFilter(colorFilter);
        }
    }

    public final void t(long j10) {
        bi.b4 b4Var = this.k;
        if (b4Var != null) {
            if (this.g == 8) {
                j10 = 0;
            }
            if (b4Var.getLottieAnimation() != null) {
                this.k.getLottieAnimation().V(j10);
            }
            if (this.k.getAnimation() != null) {
                this.k.getAnimation().D(j10);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
        return a1.g.s(sb2, document == null ? BuildConfig.BETA_URL : MessageObject.findAnimatedEmojiEmoticon(document, null), "}");
    }

    public final void v() {
        ArrayList arrayList;
        if (this.k == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        boolean z10 = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.c) != null && arrayList.size() > 0) || this.m;
        if (z10 != this.a) {
            this.a = z10;
            if (z10) {
                this.k.onAttachedToWindow();
            } else {
                this.k.onDetachedFromWindow();
            }
            if (this.a) {
                return;
            }
            ah.j jVar = v;
            AndroidUtilities.cancelRunOnUIThread(jVar);
            AndroidUtilities.runOnUIThread(jVar, 5000L);
        }
    }

    public final void w(ImageReceiver imageReceiver) {
        int i10 = this.g;
        if (i10 == 7 || i10 == 9 || i10 == 10) {
            imageReceiver.setAutoRepeatCount(2);
            return;
        }
        if (i10 == 11 || i10 == 18 || i10 == 14 || i10 == 6 || i10 == 5 || i10 == 22) {
            imageReceiver.setAutoRepeatCount(1);
        } else if (i10 == 17) {
            imageReceiver.setAutoRepeatCount(0);
        }
    }

    public final void y() {
        int i10 = this.g;
        if (i10 == 0 || i10 == 26) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.o2.descent()) + Math.abs(org.telegram.ui.ActionBar.g6.o2.ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.y2;
        if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        if (textPaintArr != null && i10 == 8) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.g6.y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        if (i10 == 14 || i10 == 15 || i10 == 17) {
            this.d = 100;
            return;
        }
        if (i10 == 11 || i10 == 22) {
            this.d = 56;
            return;
        }
        if (i10 == 27) {
            this.d = 50;
            return;
        }
        if (i10 == 24) {
            this.d = 140;
            return;
        }
        if (i10 == 23) {
            this.d = 14;
        } else if (i10 == 21) {
            this.d = 90;
        } else {
            this.d = 34;
        }
    }

    public s5(int i10, int i11, TLRPC.Document document) {
        this.g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
