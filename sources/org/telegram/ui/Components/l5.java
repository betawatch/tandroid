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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class l5 extends Drawable {
    public static SparseArray q;
    public static HashMap r;
    public static boolean s;
    public static boolean t;
    public static boolean u;
    public static final ag.f v = new ag.f(28);
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
    public oh.z2 k;
    public boolean m;
    public ColorFilter p;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public l5(int i10, int i11, long j10) {
        this.h = i11;
        this.g = i10;
        y();
        this.f = j10;
        h(i11).b(j10, new d5(this, 0));
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

    public static h5 h(int i10) {
        if (r == null) {
            r = new HashMap();
        }
        h5 h5Var = (h5) r.get(Integer.valueOf(i10));
        if (h5Var != null) {
            return h5Var;
        }
        HashMap hashMap = r;
        Integer valueOf = Integer.valueOf(i10);
        h5 h5Var2 = new h5(i10);
        hashMap.put(valueOf, h5Var2);
        return h5Var2;
    }

    public static l5 m(int i10, int i11, TLRPC.Document document) {
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
        l5 l5Var = (l5) longSparseArray.get(document.id);
        if (l5Var != null) {
            return l5Var;
        }
        long j10 = document.id;
        l5 l5Var2 = new l5(i11, i10, document);
        longSparseArray.put(j10, l5Var2);
        return l5Var2;
    }

    public static l5 n(int i10, long j10, String str, int i11) {
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
        l5 l5Var = (l5) longSparseArray.get(j10);
        if (l5Var != null) {
            return l5Var;
        }
        l5 l5Var2 = new l5();
        l5Var2.l = 1.0f;
        l5Var2.n = null;
        l5Var2.o = null;
        l5Var2.h = i10;
        l5Var2.g = i11;
        l5Var2.y();
        l5Var2.f = j10;
        l5Var2.i = str;
        h(i10).b(j10, new d5(l5Var2, i12));
        longSparseArray.put(j10, l5Var2);
        return l5Var2;
    }

    public static void s(int i10, boolean z4) {
        LongSparseArray longSparseArray;
        oh.z2 z2Var;
        boolean z10 = !z4;
        if (u == z10) {
            return;
        }
        u = z10;
        if (q == null || (longSparseArray = (LongSparseArray) q.get(Objects.hash(Integer.valueOf(i10), 25))) == null) {
            return;
        }
        for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
            l5 l5Var = (l5) longSparseArray.valueAt(i11);
            if (l5Var != null && (z2Var = l5Var.k) != null) {
                if (z4) {
                    z2Var.setAllowStartLottieAnimation(true);
                    z2Var.setAllowStartAnimation(true);
                    z2Var.setAutoRepeat(1);
                    y5 animation = z2Var.getAnimation();
                    if (animation != null) {
                        boolean z11 = z2Var.useSharedAnimationQueue;
                        if (!animation.k0) {
                            animation.s0 = z11;
                        }
                        animation.start();
                    } else {
                        ij0 lottieAnimation = z2Var.getLottieAnimation();
                        if (lottieAnimation != null) {
                            lottieAnimation.start();
                        }
                    }
                } else {
                    z2Var.setAllowStartAnimation(false);
                    z2Var.setAllowStartLottieAnimation(false);
                    z2Var.setAutoRepeat(0);
                    z2Var.stopAnimation();
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
                l5 l5Var = (l5) longSparseArray.get(keyAt);
                if (l5Var == null || !l5Var.a) {
                    longSparseArray.remove(keyAt);
                } else {
                    l5Var.j(true);
                }
            }
        }
    }

    public static void x() {
        s = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        t = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    public final void a(View view) {
        if (view instanceof org.telegram.ui.t51) {
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

    public final void b(r5 r5Var) {
        if (this.c == null) {
            this.c = new ArrayList(10);
        }
        this.m = false;
        if (!this.c.contains(r5Var)) {
            this.c.add(r5Var);
        }
        v();
    }

    public final boolean c() {
        boolean z4 = true;
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
            z4 = false;
        }
        this.n = Boolean.valueOf(z4);
        return z4;
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
        oh.z2 z2Var = this.k;
        if (z2Var == null) {
            return;
        }
        z2Var.setImageCoords(getBounds());
        this.k.setAlpha(this.l);
        this.k.draw(canvas);
    }

    public final void e() {
        if (this.k == null) {
            oh.z2 z2Var = new oh.z2(this, 3);
            this.k = z2Var;
            z2Var.setCurrentAccount(this.h);
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

    /* JADX WARN: Removed duplicated region for block: B:108:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0378  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z4) {
        SvgHelper.SvgDrawable svgThumb;
        String str;
        int i10;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        ImageLocation imageLocation2;
        Drawable emojiDrawable;
        Drawable drawable;
        String str2 = this.i;
        int i11 = this.g;
        TLRPC.Document document = this.e;
        if (document != null) {
            if (this.k == null || this.j || z4) {
                if ((i11 == 20 || i11 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                this.j = false;
                e();
                if (this.p != null && c()) {
                    this.k.setColorFilter(this.p);
                }
                if (i11 != 0) {
                    int i12 = i11 == 12 ? 2 : i11;
                    this.k.setUniqKeyPrefix(i12 + "_");
                }
                this.k.setVideoThumbIsSame(true);
                boolean z10 = (SharedConfig.getDevicePerformanceClass() == 0 && i11 == 5) || ((i11 == 2 || i11 == 25) && !s) || (i11 == 3 && !t);
                if (i11 == 13 || i11 == 16) {
                    z10 = true;
                }
                if (i11 == 24 || i11 == 27) {
                    z10 = false;
                }
                String str3 = this.d + "_" + this.d;
                if (i11 == 12) {
                    str3 = w.c.e(str3, "_d_nostream");
                }
                if (i11 != 17 && i11 != 15 && i11 != 14 && i11 != 8 && ((i11 != 1 || SharedConfig.getDevicePerformanceClass() < 2) && i11 != 12)) {
                    str3 = w.c.e(str3, "_pcache");
                }
                if (i11 != 17 && i11 != 0 && i11 != 26 && i11 != 1 && i11 != 14 && i11 != 15 && i11 != 19 && i11 != 20 && i11 != 21) {
                    str3 = w.c.e(str3, "_compress");
                }
                if (i11 == 8) {
                    str3 = w.c.e(str3, "firstframe");
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.e.thumbs, 90);
                if ("video/webm".equals(this.e.mime_type)) {
                    forDocument = ImageLocation.getForDocument(this.e);
                    str3 = w.c.e(str3, "_g");
                    svgThumb = DocumentObject.getSvgThumb(this.e.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, true);
                } else {
                    if (!"application/x-tgsticker".equals(this.e.mime_type)) {
                        svgThumb = DocumentObject.getSvgThumb(this.e.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, true);
                        if (svgThumb != null && MessageObject.isAnimatedStickerDocument(this.e, true)) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        str = str3;
                        i10 = 20;
                        imageLocation = null;
                        if (i11 != i10 || i11 == 21) {
                            imageLocation2 = null;
                            emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.e, null));
                            if (emojiDrawable != null) {
                                drawable = emojiDrawable;
                                if (str2 != null) {
                                    this.k.setImageBitmap(new y5(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                                } else if (i11 == 8) {
                                    oh.z2 z2Var = this.k;
                                    TLRPC.Document document2 = this.e;
                                    z2Var.setImage(null, null, imageLocation, str, null, null, drawable, document2.size, null, document2, 1);
                                } else {
                                    ImageLocation imageLocation3 = imageLocation;
                                    String str4 = str;
                                    if (z10 || !(s || i11 == 14)) {
                                        ImageLocation forDocument2 = i11 == 16 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e) : imageLocation2;
                                        if ("video/webm".equals(this.e.mime_type)) {
                                            oh.z2 z2Var2 = this.k;
                                            ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e);
                                            String str5 = this.d + "_" + this.d;
                                            TLRPC.Document document3 = this.e;
                                            z2Var2.setImage(null, null, forDocument3, str5, forDocument2, null, drawable, document3.size, null, document3, 1);
                                        } else if (MessageObject.isAnimatedStickerDocument(this.e, true)) {
                                            oh.z2 z2Var3 = this.k;
                                            String e6 = w.c.e(str4, "_firstframe");
                                            TLRPC.Document document4 = this.e;
                                            z2Var3.setImage(imageLocation3, e6, forDocument2, null, drawable, document4.size, null, document4, 1);
                                        } else {
                                            oh.z2 z2Var4 = this.k;
                                            ImageLocation forDocument4 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e);
                                            String str6 = this.d + "_" + this.d;
                                            TLRPC.Document document5 = this.e;
                                            z2Var4.setImage(forDocument4, str6, forDocument2, null, drawable, document5.size, null, document5, 1);
                                        }
                                    } else {
                                        ImageLocation forDocument5 = i11 == 17 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e) : imageLocation2;
                                        oh.z2 z2Var5 = this.k;
                                        ImageLocation forDocument6 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e);
                                        String str7 = this.d + "_" + this.d;
                                        TLRPC.Document document6 = this.e;
                                        z2Var5.setImage(imageLocation3, str4, forDocument6, str7, forDocument5, null, drawable, document6.size, null, document6, 1);
                                    }
                                }
                                w(this.k);
                                if (i11 != 13 || i11 == 16 || i11 == 3 || i11 == 5 || i11 == 4 || i11 == 24) {
                                    this.k.setLayerNum(7);
                                }
                                if (i11 != 9 || i11 == 21 || i11 == 27) {
                                    this.k.setLayerNum(6656);
                                }
                                this.k.setAspectFit(true);
                                if (i11 != 12 || i11 == 26 || i11 == 18 || i11 == 8 || i11 == 6 || i11 == 5 || (i11 == 25 && u)) {
                                    this.k.setAllowStartAnimation(false);
                                    this.k.setAllowStartLottieAnimation(false);
                                    this.k.setAutoRepeat(0);
                                } else {
                                    this.k.setAllowStartLottieAnimation(true);
                                    this.k.setAllowStartAnimation(true);
                                    this.k.setAutoRepeat(1);
                                }
                                this.k.setAllowDecodeSingleFrame(true);
                                this.k.setRoundRadius((i11 != 5 || i11 == 6 || i11 == 27) ? AndroidUtilities.dp(6.0f) : i11 == 24 ? AndroidUtilities.dp(14.0f) : 0);
                                v();
                                k();
                            }
                        } else {
                            imageLocation2 = null;
                        }
                        drawable = svgThumb;
                        if (str2 != null) {
                        }
                        w(this.k);
                        if (i11 != 13) {
                        }
                        this.k.setLayerNum(7);
                        if (i11 != 9) {
                        }
                        this.k.setLayerNum(6656);
                        this.k.setAspectFit(true);
                        if (i11 != 12) {
                        }
                        this.k.setAllowStartAnimation(false);
                        this.k.setAllowStartLottieAnimation(false);
                        this.k.setAutoRepeat(0);
                        this.k.setAllowDecodeSingleFrame(true);
                        this.k.setRoundRadius((i11 != 5 || i11 == 6 || i11 == 27) ? AndroidUtilities.dp(6.0f) : i11 == 24 ? AndroidUtilities.dp(14.0f) : 0);
                        v();
                        k();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(i11 != 0 ? android.support.v4.media.a.l(i11, "_") : "");
                    sb.append(this.f);
                    sb.append("@");
                    sb.append(str3);
                    String sb2 = sb.toString();
                    if (SharedConfig.getDevicePerformanceClass() != 0 || i11 == 2 || i11 == 25 || i11 == 22 || !ImageLoader.getInstance().hasLottieMemCache(sb2)) {
                        SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(this.e.thumbs, org.telegram.ui.ActionBar.k6.m6, i11 == 22 ? 0.8f : 0.2f);
                        if (svgThumb2 != null && MessageObject.isAnimatedStickerDocument(this.e, true)) {
                            svgThumb2.overrideWidthAndHeight(512, 512);
                        }
                        svgThumb = svgThumb2;
                    } else {
                        svgThumb = null;
                    }
                    forDocument = ImageLocation.getForDocument(this.e);
                }
                str = str3;
                imageLocation = forDocument;
                i10 = 20;
                if (i11 != i10) {
                }
                imageLocation2 = null;
                emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.e, null));
                if (emojiDrawable != null) {
                }
                drawable = svgThumb;
                if (str2 != null) {
                }
                w(this.k);
                if (i11 != 13) {
                }
                this.k.setLayerNum(7);
                if (i11 != 9) {
                }
                this.k.setLayerNum(6656);
                this.k.setAspectFit(true);
                if (i11 != 12) {
                }
                this.k.setAllowStartAnimation(false);
                this.k.setAllowStartLottieAnimation(false);
                this.k.setAutoRepeat(0);
                this.k.setAllowDecodeSingleFrame(true);
                this.k.setRoundRadius((i11 != 5 || i11 == 6 || i11 == 27) ? AndroidUtilities.dp(6.0f) : i11 == 24 ? AndroidUtilities.dp(14.0f) : 0);
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
                r5 r5Var = (r5) this.c.get(i11);
                if (r5Var != null) {
                    r5Var.invalidate();
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
        boolean z4 = false;
        if (document != null) {
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(document);
            if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses)) {
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                    long j10 = inputStickerSet.id;
                    if (j10 != 773947703670341676L) {
                    }
                }
                this.o = Boolean.valueOf(z4);
            }
            z4 = true;
            this.o = Boolean.valueOf(z4);
        }
        return z4;
    }

    public final void o(View view) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.m = false;
        v();
    }

    public final void p(r5 r5Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(r5Var);
        }
        this.m = false;
        v();
    }

    public final void q(long j10) {
        oh.z2 z2Var = this.k;
        if (z2Var != null) {
            if (this.g == 8) {
                j10 = 0;
            }
            z2Var.setCurrentTime(j10);
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
        float f10 = i10 / 255.0f;
        this.l = f10;
        oh.z2 z2Var = this.k;
        if (z2Var != null) {
            z2Var.setAlpha(f10);
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
        oh.z2 z2Var = this.k;
        if (z2Var != null) {
            if (this.g == 8) {
                j10 = 0;
            }
            if (z2Var.getLottieAnimation() != null) {
                this.k.getLottieAnimation().S(j10);
            }
            if (this.k.getAnimation() != null) {
                this.k.getAnimation().D(j10);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
        return android.support.v4.media.a.r(sb, document == null ? BuildConfig.BETA_URL : MessageObject.findAnimatedEmojiEmoticon(document, null), "}");
    }

    public final void v() {
        ArrayList arrayList;
        if (this.k == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        boolean z4 = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.c) != null && arrayList.size() > 0) || this.m;
        if (z4 != this.a) {
            this.a = z4;
            if (z4) {
                this.k.onAttachedToWindow();
            } else {
                this.k.onDetachedFromWindow();
            }
            if (this.a) {
                return;
            }
            ag.f fVar = v;
            AndroidUtilities.cancelRunOnUIThread(fVar);
            AndroidUtilities.runOnUIThread(fVar, 5000L);
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
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.o2.descent()) + Math.abs(org.telegram.ui.ActionBar.k6.o2.ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.y2;
        if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        if (textPaintArr != null && i10 == 8) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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

    public l5(int i10, int i11, TLRPC.Document document) {
        this.g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
