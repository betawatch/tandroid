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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class q5 extends Drawable {
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
    public bi.y3 k;
    public boolean m;
    public ColorFilter p;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public q5(int i10, int i11, long j3) {
        this.h = i11;
        this.g = i10;
        y();
        this.f = j3;
        h(i11).b(j3, new i5(this, 0));
    }

    public static TLRPC.Document f(int i10, long j3) {
        HashMap hashMap = h(i10).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j3));
    }

    public static int g() {
        return SharedConfig.getDevicePerformanceClass() == 0 ? 0 : 2;
    }

    public static m5 h(int i10) {
        if (r == null) {
            r = new HashMap();
        }
        m5 m5Var = (m5) r.get(Integer.valueOf(i10));
        if (m5Var != null) {
            return m5Var;
        }
        HashMap hashMap = r;
        Integer valueOf = Integer.valueOf(i10);
        m5 m5Var2 = new m5(i10);
        hashMap.put(valueOf, m5Var2);
        return m5Var2;
    }

    public static q5 m(int i10, int i11, TLRPC.Document document) {
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
        q5 q5Var = (q5) longSparseArray.get(document.id);
        if (q5Var != null) {
            return q5Var;
        }
        long j3 = document.id;
        q5 q5Var2 = new q5(i11, i10, document);
        longSparseArray.put(j3, q5Var2);
        return q5Var2;
    }

    public static q5 n(int i10, long j3, String str, int i11) {
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
        q5 q5Var = (q5) longSparseArray.get(j3);
        if (q5Var != null) {
            return q5Var;
        }
        q5 q5Var2 = new q5();
        q5Var2.l = 1.0f;
        q5Var2.n = null;
        q5Var2.o = null;
        q5Var2.h = i10;
        q5Var2.g = i11;
        q5Var2.y();
        q5Var2.f = j3;
        q5Var2.i = str;
        h(i10).b(j3, new i5(q5Var2, i12));
        longSparseArray.put(j3, q5Var2);
        return q5Var2;
    }

    public static void s(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        bi.y3 y3Var;
        boolean z11 = !z10;
        if (u == z11) {
            return;
        }
        u = z11;
        if (q == null || (longSparseArray = (LongSparseArray) q.get(Objects.hash(Integer.valueOf(i10), 25))) == null) {
            return;
        }
        for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
            q5 q5Var = (q5) longSparseArray.valueAt(i11);
            if (q5Var != null && (y3Var = q5Var.k) != null) {
                if (z10) {
                    y3Var.setAllowStartLottieAnimation(true);
                    y3Var.setAllowStartAnimation(true);
                    y3Var.setAutoRepeat(1);
                    d6 animation = y3Var.getAnimation();
                    if (animation != null) {
                        boolean z12 = y3Var.useSharedAnimationQueue;
                        if (!animation.n0) {
                            animation.v0 = z12;
                        }
                        animation.start();
                    } else {
                        xi0 lottieAnimation = y3Var.getLottieAnimation();
                        if (lottieAnimation != null) {
                            lottieAnimation.start();
                        }
                    }
                } else {
                    y3Var.setAllowStartAnimation(false);
                    y3Var.setAllowStartLottieAnimation(false);
                    y3Var.setAutoRepeat(0);
                    y3Var.stopAnimation();
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
                q5 q5Var = (q5) longSparseArray.get(keyAt);
                if (q5Var == null || !q5Var.a) {
                    longSparseArray.remove(keyAt);
                } else {
                    q5Var.j(true);
                }
            }
        }
    }

    public static void x() {
        s = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        t = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    public final void a(View view) {
        if (view instanceof org.telegram.ui.l61) {
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

    public final void b(w5 w5Var) {
        if (this.c == null) {
            this.c = new ArrayList(10);
        }
        this.m = false;
        if (!this.c.contains(w5Var)) {
            this.c.add(w5Var);
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
        bi.y3 y3Var = this.k;
        if (y3Var == null) {
            return;
        }
        y3Var.setImageCoords(getBounds());
        this.k.setAlpha(this.l);
        this.k.draw(canvas);
    }

    public final void e() {
        if (this.k == null) {
            bi.y3 y3Var = new bi.y3(this, 4);
            this.k = y3Var;
            y3Var.setCurrentAccount(this.h);
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
    public final void j(boolean z10) {
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
            if (this.k == null || this.j || z10) {
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
                boolean z11 = (SharedConfig.getDevicePerformanceClass() == 0 && i11 == 5) || ((i11 == 2 || i11 == 25) && !s) || (i11 == 3 && !t);
                if (i11 == 13 || i11 == 16) {
                    z11 = true;
                }
                if (i11 == 24 || i11 == 27) {
                    z11 = false;
                }
                String str3 = this.d + "_" + this.d;
                if (i11 == 12) {
                    str3 = org.telegram.ui.Cells.p6.t(str3, "_d_nostream");
                }
                if (i11 != 17 && i11 != 15 && i11 != 14 && i11 != 8 && ((i11 != 1 || SharedConfig.getDevicePerformanceClass() < 2) && i11 != 12)) {
                    str3 = org.telegram.ui.Cells.p6.t(str3, "_pcache");
                }
                if (i11 != 17 && i11 != 0 && i11 != 26 && i11 != 1 && i11 != 14 && i11 != 15 && i11 != 19 && i11 != 20 && i11 != 21) {
                    str3 = org.telegram.ui.Cells.p6.t(str3, "_compress");
                }
                if (i11 == 8) {
                    str3 = org.telegram.ui.Cells.p6.t(str3, "firstframe");
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.e.thumbs, 90);
                if ("video/webm".equals(this.e.mime_type)) {
                    forDocument = ImageLocation.getForDocument(this.e);
                    str3 = org.telegram.ui.Cells.p6.t(str3, "_g");
                    svgThumb = DocumentObject.getSvgThumb(this.e.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, true);
                } else {
                    if (!"application/x-tgsticker".equals(this.e.mime_type)) {
                        svgThumb = DocumentObject.getSvgThumb(this.e.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, true);
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
                                    this.k.setImageBitmap(new d6(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                                } else if (i11 == 8) {
                                    bi.y3 y3Var = this.k;
                                    TLRPC.Document document2 = this.e;
                                    y3Var.setImage(null, null, imageLocation, str, null, null, drawable, document2.size, null, document2, 1);
                                } else {
                                    ImageLocation imageLocation3 = imageLocation;
                                    String str4 = str;
                                    if (z11 || !(s || i11 == 14)) {
                                        ImageLocation forDocument2 = i11 == 16 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e) : imageLocation2;
                                        if ("video/webm".equals(this.e.mime_type)) {
                                            bi.y3 y3Var2 = this.k;
                                            ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e);
                                            String str5 = this.d + "_" + this.d;
                                            TLRPC.Document document3 = this.e;
                                            y3Var2.setImage(null, null, forDocument3, str5, forDocument2, null, drawable, document3.size, null, document3, 1);
                                        } else if (MessageObject.isAnimatedStickerDocument(this.e, true)) {
                                            bi.y3 y3Var3 = this.k;
                                            String t10 = org.telegram.ui.Cells.p6.t(str4, "_firstframe");
                                            TLRPC.Document document4 = this.e;
                                            y3Var3.setImage(imageLocation3, t10, forDocument2, null, drawable, document4.size, null, document4, 1);
                                        } else {
                                            bi.y3 y3Var4 = this.k;
                                            ImageLocation forDocument4 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e);
                                            String str6 = this.d + "_" + this.d;
                                            TLRPC.Document document5 = this.e;
                                            y3Var4.setImage(forDocument4, str6, forDocument2, null, drawable, document5.size, null, document5, 1);
                                        }
                                    } else {
                                        ImageLocation forDocument5 = i11 == 17 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e) : imageLocation2;
                                        bi.y3 y3Var5 = this.k;
                                        ImageLocation forDocument6 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.e);
                                        String str7 = this.d + "_" + this.d;
                                        TLRPC.Document document6 = this.e;
                                        y3Var5.setImage(imageLocation3, str4, forDocument6, str7, forDocument5, null, drawable, document6.size, null, document6, 1);
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
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11 != 0 ? a4.a.m(i11, "_") : "");
                    sb2.append(this.f);
                    sb2.append("@");
                    sb2.append(str3);
                    String sb3 = sb2.toString();
                    if (SharedConfig.getDevicePerformanceClass() != 0 || i11 == 2 || i11 == 25 || i11 == 22 || !ImageLoader.getInstance().hasLottieMemCache(sb3)) {
                        SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(this.e.thumbs, org.telegram.ui.ActionBar.j6.m6, i11 == 22 ? 0.8f : 0.2f);
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
                w5 w5Var = (w5) this.c.get(i11);
                if (w5Var != null) {
                    w5Var.invalidate();
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
                    long j3 = inputStickerSet.id;
                    if (j3 != 773947703670341676L) {
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

    public final void p(w5 w5Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(w5Var);
        }
        this.m = false;
        v();
    }

    public final void q(long j3) {
        bi.y3 y3Var = this.k;
        if (y3Var != null) {
            if (this.g == 8) {
                j3 = 0;
            }
            y3Var.setCurrentTime(j3);
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
        bi.y3 y3Var = this.k;
        if (y3Var != null) {
            y3Var.setAlpha(f7);
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

    public final void t(long j3) {
        bi.y3 y3Var = this.k;
        if (y3Var != null) {
            if (this.g == 8) {
                j3 = 0;
            }
            if (y3Var.getLottieAnimation() != null) {
                this.k.getLottieAnimation().S(j3);
            }
            if (this.k.getAnimation() != null) {
                this.k.getAnimation().D(j3);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
        return a4.a.s(sb2, document == null ? "null" : MessageObject.findAnimatedEmojiEmoticon(document, null), "}");
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
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.o2.descent()) + Math.abs(org.telegram.ui.ActionBar.j6.o2.ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.y2;
        if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        if (textPaintArr != null && i10 == 8) {
            this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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

    public q5(int i10, int i11, TLRPC.Document document) {
        this.g = i10;
        this.h = i11;
        this.e = document;
        y();
        x();
        j(false);
    }
}
