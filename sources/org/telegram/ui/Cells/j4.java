package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j4 {
    public int A;
    public int B;
    public boolean C;
    public final t1 a;
    public h4 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final org.telegram.ui.Components.e6 j;
    public h90 k;
    public final wh.g l;
    public int m;
    public final zc n;
    public i4 o;
    public boolean p;
    public f01 q;
    public f01 r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public j4(t1 t1Var) {
        this.a = t1Var;
        this.l = wh.g.e(t1Var);
        this.j = new org.telegram.ui.Components.e6(t1Var, 0L, 350L, pr.h);
        this.n = new zc(t1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((i4) obj).f.getVisible()) {
                return false;
            }
        }
        return true;
    }

    public final void b(Canvas canvas) {
        ArrayList arrayList;
        t1 t1Var;
        RectF rectF;
        Path path;
        Path path2;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int max;
        Canvas canvas2 = canvas;
        if (this.b == null) {
            return;
        }
        boolean z10 = this.i;
        org.telegram.ui.Components.e6 e6Var = this.j;
        float e7 = e6Var.e(z10);
        float e10 = e6Var.e(this.i);
        t1 t1Var2 = this.a;
        MessageObject messageObject = t1Var2.getMessageObject();
        Path path3 = this.u;
        path3.rewind();
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MAX_VALUE;
        float f16 = Float.MIN_VALUE;
        float f17 = Float.MIN_VALUE;
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            i4 i4Var = (i4) arrayList.get(i10);
            ImageReceiver imageReceiver = i4Var.f;
            RadialProgress2 radialProgress2 = i4Var.G;
            int i11 = this.d;
            int i12 = i4Var.a;
            float f18 = e7;
            int i13 = this.e;
            int i14 = i4Var.b;
            float f19 = e10;
            t1 t1Var3 = t1Var2;
            imageReceiver.setImageCoords(i11 + i12, i13 + i14, i4Var.c - i12, i4Var.d - i14);
            imageReceiver.draw(canvas2);
            if (imageReceiver.getAnimation() != null) {
                imageReceiver.getAnimation().getClass();
                int round = Math.round(0 / 1000.0f);
                if (!i4Var.x && i4Var.K != (max = Math.max(0, i4Var.J - round))) {
                    i4Var.K = max;
                    i4Var.L = new f01(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                }
            }
            if (f19 > 0.0f) {
                float min = Math.min(this.d + i4Var.a, f15);
                float min2 = Math.min(this.e + i4Var.b, f14);
                f17 = Math.max(this.d + i4Var.c, f17);
                f16 = Math.max(this.e + i4Var.d, f16);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f20 = i4Var.a + this.d;
                int i15 = this.e;
                rectF2.set(f20, i4Var.b + i15, r9 + i4Var.c, i15 + i4Var.d);
                path3.addRoundRect(rectF2, i4Var.s, Path.Direction.CW);
                f14 = min2;
                f15 = min;
            }
            radialProgress2.g(org.telegram.ui.ActionBar.j6.le, org.telegram.ui.ActionBar.j6.me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.oe);
            RectF rectF3 = radialProgress2.a;
            float f21 = f14;
            rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.x + imageReceiver.getImageY());
            if (messageObject.isSending()) {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(i4Var.F);
                boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                if (fileProgressSizes == null && isSendingPaidMessage) {
                    radialProgress2.o(1.0f, true);
                    i4Var.b(i4Var.w ? 6 : i4Var.a());
                }
            } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(i4Var.v)) {
                i4Var.b(3);
            } else {
                i4Var.b(i4Var.a());
            }
            canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f19) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i10++;
            f14 = f21;
            e7 = f18;
            t1Var2 = t1Var3;
            e10 = f19;
        }
        float f22 = e7;
        float f23 = e10;
        t1 t1Var4 = t1Var2;
        if (f23 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path3);
            canvas2.translate(f15, f14);
            int i16 = (int) (f17 - f15);
            int i17 = (int) (f16 - f14);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i16, i17, (int) (f23 * 255.0f), 31);
            this.l.c(canvas, t1Var4, i16, i17, 1.0f, t1Var4.oe);
            canvas2 = canvas;
            t1Var = t1Var4;
            canvas2.restore();
            canvas2.restore();
            t1Var.invalidate();
        } else {
            t1Var = t1Var4;
        }
        int i18 = 0;
        while (true) {
            int size = arrayList.size();
            rectF = this.v;
            path = this.t;
            if (i18 >= size) {
                break;
            }
            i4 i4Var2 = (i4) arrayList.get(i18);
            if (i4Var2.L != null) {
                float dp = AndroidUtilities.dp(11.4f) + i4Var2.L.c;
                float dp2 = AndroidUtilities.dp(17.0f);
                float dp3 = AndroidUtilities.dp(5.0f);
                float f24 = this.d + i4Var2.a + dp3;
                float f25 = this.e + i4Var2.b + dp3;
                rectF.set(f24, f25, dp + f24, f25 + dp2);
                if (this.r == null || rectF.right <= ((this.d + this.g) - (AndroidUtilities.dp(11.32f) + this.r.c)) - dp3 || rectF.top > this.e + dp3) {
                    path.rewind();
                    float f26 = dp2 / 2.0f;
                    path.addRoundRect(rectF, f26, f26, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f13 = f23;
                    c(canvas2, f13);
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(1.0f, TLObject.FLAG_30));
                    i4Var2.L.c(this.d + i4Var2.a + dp3 + AndroidUtilities.dp(5.66f), this.e + i4Var2.b + dp3 + f26, 1.0f, -1, canvas2);
                    canvas2.restore();
                    i18++;
                    f23 = f13;
                }
            }
            f13 = f23;
            i18++;
            f23 = f13;
        }
        if (this.q == null || f22 <= 0.0f) {
            path2 = path;
            f7 = f22;
            f10 = 11.32f;
            f11 = 5.0f;
            f12 = 17.0f;
        } else {
            float a2 = this.n.a(0.05f);
            float dp4 = AndroidUtilities.dp(28.0f) + this.q.c;
            float dp5 = AndroidUtilities.dp(32.0f);
            float f27 = this.d;
            float f28 = this.g;
            float A = com.google.android.gms.internal.vision.e2.A(f28, dp4, 2.0f, f27);
            f10 = 11.32f;
            float f29 = this.e;
            f11 = 5.0f;
            float f30 = this.h;
            f12 = 17.0f;
            rectF.set(A, com.google.android.gms.internal.vision.e2.A(f30, dp5, 2.0f, f29), org.telegram.messenger.w1.a(f28, dp4, 2.0f, f27), org.telegram.messenger.w1.a(f30, dp5, 2.0f, f29));
            path.rewind();
            float f31 = dp5 / 2.0f;
            path.addRoundRect(rectF, f31, f31, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(a2, a2, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
            canvas2.save();
            canvas2.clipPath(path);
            f7 = f22;
            c(canvas2, f7);
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(f7, 1342177280));
            path2 = path;
            this.q.c((((this.g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f7, -1, canvas2);
            canvas2.restore();
            if (t1Var.getDelegate() == null || !t1Var.getDelegate().X0(5, t1Var)) {
                h90 h90Var = this.k;
                if (h90Var != null && !h90Var.c() && !this.k.b()) {
                    this.k.a();
                }
            } else {
                h90 h90Var2 = this.k;
                if (h90Var2 == null) {
                    h90 h90Var3 = new h90();
                    this.k = h90Var3;
                    h90Var3.setCallback(t1Var);
                    this.k.f(org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.35f, -1), org.telegram.ui.ActionBar.j6.l1(0.8f, -1));
                    h90 h90Var4 = this.k;
                    h90Var4.C = true;
                    h90Var4.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else if (h90Var2.b() || this.k.c()) {
                    h90 h90Var5 = this.k;
                    h90Var5.b = -1L;
                    h90Var5.c = -1L;
                }
            }
            h90 h90Var6 = this.k;
            if (h90Var6 != null) {
                h90Var6.d(rectF);
                this.k.j(f31);
                this.k.setAlpha((int) (f7 * 255.0f));
                this.k.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.r == null || f7 >= 1.0f || !a()) {
            return;
        }
        float timeAlpha = t1Var.getTimeAlpha() * (1.0f - f7);
        float dp6 = AndroidUtilities.dp(f10) + this.r.c;
        float dp7 = AndroidUtilities.dp(f12);
        float dp8 = AndroidUtilities.dp(f11);
        float f32 = this.d + this.g;
        float f33 = this.e + dp8;
        rectF.set((f32 - dp6) - dp8, f33, f32 - dp8, f33 + dp7);
        path2.rewind();
        float f34 = dp7 / 2.0f;
        path2.addRoundRect(rectF, f34, f34, Path.Direction.CW);
        canvas2.save();
        canvas2.clipPath(path2);
        canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(timeAlpha, TLObject.FLAG_30));
        this.r.c((((this.d + this.g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.e + dp8 + f34, timeAlpha, -1, canvas2);
        canvas.restore();
    }

    public final void c(Canvas canvas, float f7) {
        ArrayList arrayList;
        if (this.b == null) {
            return;
        }
        t1 t1Var = this.a;
        int id2 = t1Var.getMessageObject() != null ? t1Var.getMessageObject().getId() : 0;
        int i10 = this.g;
        int i11 = this.h;
        int max = (int) Math.max(1.0f, i10 > i11 ? 100.0f : (i10 / i11) * 100.0f);
        int i12 = this.h;
        int i13 = this.g;
        int max2 = (int) Math.max(1.0f, i12 <= i13 ? 100.0f * (i12 / i13) : 100.0f);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.c;
            if (i14 >= arrayList.size()) {
                break;
            }
            i4 i4Var = (i4) arrayList.get(i14);
            if (i4Var.f.hasImageSet() && i4Var.f.getBitmap() != null) {
                i15 |= 1 << i14;
            }
            i14++;
        }
        Bitmap bitmap = this.w;
        if (bitmap == null || this.z != id2 || this.y != i15 || this.A != max || this.B != max2) {
            this.y = i15;
            this.z = id2;
            this.A = max;
            this.B = max2;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.w);
            float f10 = max / this.g;
            canvas2.scale(f10, f10);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                i4 i4Var2 = (i4) arrayList.get(i16);
                i4Var2.f.setImageCoords(i4Var2.a, i4Var2.b, i4Var2.c - r4, i4Var2.d - r7);
                i4Var2.f.draw(canvas2);
            }
            Utilities.stackBlurBitmap(this.w, 12);
            if (this.x == null) {
                this.x = new Paint(3);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(1.5f);
                this.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
        if (this.w != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            canvas.scale(this.g / this.w.getWidth(), this.g / this.w.getWidth());
            this.x.setAlpha((int) (f7 * 255.0f));
            canvas.drawBitmap(this.w, 0.0f, 0.0f, this.x);
            canvas.restore();
        }
    }

    public final i4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((i4) arrayList.get(i10)).f.isInsideImage(f7, f10)) {
                return (i4) arrayList.get(i10);
            }
            i10++;
        }
    }

    public final void e() {
        if (!this.C) {
            return;
        }
        this.C = false;
        wh.g gVar = this.l;
        if (gVar != null) {
            gVar.a(this.a);
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return;
            }
            i4 i4Var = (i4) arrayList.get(i10);
            if (i4Var.M) {
                i4Var.M = false;
                i4Var.f.onDetachedFromWindow();
            }
            i10++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        i4 i4Var;
        t1 t1Var;
        boolean z11;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            i4 d = d(x10, y3);
            this.o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.i.q != 4 && radialProgress2.a.contains(x10, y3)) {
                    z11 = true;
                    this.p = z11;
                }
            }
            z11 = false;
            this.p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x10, y3)) {
                    z10 = true;
                    i4Var = this.o;
                    if (i4Var != null && i4Var == d10) {
                        t1Var = this.a;
                        if (t1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = t1Var.getMessageObject();
                            if (this.p || !z10 || d10.G.i.q != 3 || messageObject == null) {
                                k1 delegate = t1Var.getDelegate();
                                i4 i4Var2 = this.o;
                                ImageReceiver imageReceiver = i4Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.M1(t1Var, messageExtendedMedia);
                            } else if (messageObject.isSending()) {
                                SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                            }
                        }
                    }
                    this.p = false;
                    this.o = null;
                }
            }
            z10 = false;
            i4Var = this.o;
            if (i4Var != null) {
                t1Var = this.a;
                if (t1Var.getDelegate() != null) {
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    if (this.p) {
                    }
                    k1 delegate2 = t1Var.getDelegate();
                    i4 i4Var22 = this.o;
                    ImageReceiver imageReceiver2 = i4Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = i4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.M1(t1Var, messageExtendedMedia2);
                }
            }
            this.p = false;
            this.o = null;
        }
        this.n.c(this.o != null);
        return this.o != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:396:0x0770, code lost:
    
        if (r3[2] > r3[3]) goto L202;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0783  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        float[] fArr;
        float f7;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        MessageObject messageObject2;
        ArrayList arrayList;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        j4 j4Var = this;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            if (j4Var.b == null) {
                h4 h4Var = new h4();
                h4Var.a = new ArrayList();
                h4Var.b = new ArrayList();
                h4Var.c = new HashMap();
                h4Var.h = 800;
                h4Var.i = 814.0f;
                j4Var.b = h4Var;
            }
            j4Var.b.a.clear();
            j4Var.b.a.addAll(tL_messageMediaPaidMedia2.extended_media);
            h4 h4Var2 = j4Var.b;
            float f13 = h4Var2.i;
            ArrayList arrayList2 = h4Var2.b;
            arrayList2.clear();
            HashMap hashMap = h4Var2.c;
            hashMap.clear();
            h4Var2.e = 0;
            ArrayList arrayList3 = h4Var2.a;
            int size = arrayList3.size();
            if (size == 0) {
                h4Var2.d = 0;
                h4Var2.g = 0.0f;
                h4Var2.f = 0;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
            } else {
                h4Var2.h = 800;
                StringBuilder sb2 = new StringBuilder();
                int i12 = 0;
                float f14 = 1.0f;
                boolean z10 = false;
                while (i12 < size) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) arrayList3.get(i12);
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                    groupedMessagePosition2.last = i12 == size + (-1);
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
                        groupedMessagePosition2.photoWidth = tL_messageExtendedMediaPreview.w;
                        groupedMessagePosition2.photoHeight = tL_messageExtendedMediaPreview.h;
                    } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia2).photo;
                            if (photo != null) {
                                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                groupedMessagePosition2.photoWidth = closestPhotoSizeWithSize != null ? 100 : closestPhotoSizeWithSize.w;
                                groupedMessagePosition2.photoHeight = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100;
                            }
                            closestPhotoSizeWithSize = null;
                            groupedMessagePosition2.photoWidth = closestPhotoSizeWithSize != null ? 100 : closestPhotoSizeWithSize.w;
                            groupedMessagePosition2.photoHeight = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100;
                        } else {
                            if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia2).document) != null) {
                                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize());
                                groupedMessagePosition2.photoWidth = closestPhotoSizeWithSize != null ? 100 : closestPhotoSizeWithSize.w;
                                groupedMessagePosition2.photoHeight = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100;
                            }
                            closestPhotoSizeWithSize = null;
                            groupedMessagePosition2.photoWidth = closestPhotoSizeWithSize != null ? 100 : closestPhotoSizeWithSize.w;
                            groupedMessagePosition2.photoHeight = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100;
                        }
                    } else {
                        groupedMessagePosition2.photoWidth = 100;
                        groupedMessagePosition2.photoHeight = 100;
                    }
                    if (groupedMessagePosition2.photoWidth <= 0 || groupedMessagePosition2.photoHeight <= 0) {
                        groupedMessagePosition2.photoWidth = 50;
                        groupedMessagePosition2.photoHeight = 50;
                    }
                    float f15 = groupedMessagePosition2.photoWidth / groupedMessagePosition2.photoHeight;
                    groupedMessagePosition2.aspectRatio = f15;
                    if (f15 > 1.2f) {
                        sb2.append("w");
                    } else if (f15 < 0.8f) {
                        sb2.append("n");
                    } else {
                        sb2.append("q");
                    }
                    float f16 = groupedMessagePosition2.aspectRatio;
                    f14 += f16;
                    if (f16 > 2.0f) {
                        z10 = true;
                    }
                    hashMap.put(messageExtendedMedia, groupedMessagePosition2);
                    arrayList2.add(groupedMessagePosition2);
                    i12++;
                }
                int dp = AndroidUtilities.dp(120.0f);
                float dp2 = AndroidUtilities.dp(120.0f);
                Point point = AndroidUtilities.displaySize;
                int min = (int) (dp2 / (Math.min(point.x, point.y) / h4Var2.h));
                float dp3 = AndroidUtilities.dp(40.0f);
                Point point2 = AndroidUtilities.displaySize;
                float min2 = Math.min(point2.x, point2.y);
                float f17 = h4Var2.h;
                int i13 = (int) (dp3 / (min2 / f17));
                float f18 = f17 / f13;
                float f19 = f14 / size;
                float dp4 = AndroidUtilities.dp(100.0f) / f13;
                if (size == 1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                    float f20 = groupedMessagePosition3.aspectRatio;
                    if (f20 >= 1.0f) {
                        f11 = h4Var2.h;
                        f12 = ((f11 / f20) / f11) * f13;
                    } else {
                        f11 = h4Var2.h * ((f20 * f13) / f13);
                        f12 = f13;
                    }
                    groupedMessagePosition3.set(0, 0, 0, 0, (int) f11, f12 / f13, 15);
                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                } else {
                    if (z10) {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                    } else {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                        if (size == 2 || size == 3 || size == 4) {
                            if (size == 2) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                String sb3 = sb2.toString();
                                if (sb3.equals("ww") && f19 > f18 * 1.4d) {
                                    float f21 = groupedMessagePosition4.aspectRatio;
                                    float f22 = groupedMessagePosition5.aspectRatio;
                                    if (f21 - f22 < 0.2d) {
                                        float f23 = h4Var2.h;
                                        float round = Math.round(Math.min(f23 / f21, Math.min(f23 / f22, f13 / 2.0f))) / f13;
                                        groupedMessagePosition4.set(0, 0, 0, 0, h4Var2.h, round, 7);
                                        groupedMessagePosition5.set(0, 0, 1, 1, h4Var2.h, round, 11);
                                    }
                                }
                                if (sb3.equals("ww") || sb3.equals("qq")) {
                                    int i14 = h4Var2.h / 2;
                                    float f24 = i14;
                                    float round2 = Math.round(Math.min(f24 / groupedMessagePosition4.aspectRatio, Math.min(f24 / groupedMessagePosition5.aspectRatio, f13))) / f13;
                                    groupedMessagePosition4.set(0, 0, 0, 0, i14, round2, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, i14, round2, 14);
                                    h4Var2.e = 1;
                                } else {
                                    float f25 = h4Var2.h;
                                    float f26 = groupedMessagePosition4.aspectRatio;
                                    int max = (int) Math.max(f25 * 0.4f, Math.round((f25 / f26) / ((1.0f / groupedMessagePosition5.aspectRatio) + (1.0f / f26))));
                                    int i15 = h4Var2.h - max;
                                    if (i15 < min) {
                                        max -= min - i15;
                                    } else {
                                        min = i15;
                                    }
                                    float min3 = Math.min(f13, Math.round(Math.min(min / groupedMessagePosition4.aspectRatio, max / groupedMessagePosition5.aspectRatio))) / f13;
                                    groupedMessagePosition4.set(0, 0, 0, 0, min, min3, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, max, min3, 14);
                                    h4Var2.e = 1;
                                }
                            } else if (size == 3) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                if (sb2.charAt(0) == 'n') {
                                    float f27 = groupedMessagePosition7.aspectRatio;
                                    float min4 = Math.min(f13 * 0.5f, Math.round((h4Var2.h * f27) / (groupedMessagePosition8.aspectRatio + f27)));
                                    float f28 = f13 - min4;
                                    int max2 = (int) Math.max(min, Math.min(h4Var2.h * 0.5f, Math.round(Math.min(groupedMessagePosition8.aspectRatio * min4, groupedMessagePosition7.aspectRatio * f28))));
                                    int round3 = Math.round(Math.min((groupedMessagePosition6.aspectRatio * f13) + i13, h4Var2.h - max2));
                                    groupedMessagePosition6.set(0, 0, 0, 1, round3, 1.0f, 13);
                                    float f29 = f28 / f13;
                                    groupedMessagePosition7.set(1, 1, 0, 0, max2, f29, 6);
                                    float f30 = min4 / f13;
                                    groupedMessagePosition8.set(1, 1, 1, 1, max2, f30, 10);
                                    int i16 = h4Var2.h;
                                    groupedMessagePosition8.spanSize = i16;
                                    groupedMessagePosition6.siblingHeights = new float[]{f30, f29};
                                    groupedMessagePosition7.spanSize = i16 - round3;
                                    groupedMessagePosition8.leftSpanOffset = round3;
                                    h4Var2.e = 1;
                                } else {
                                    float round4 = Math.round(Math.min(h4Var2.h / groupedMessagePosition6.aspectRatio, 0.66f * f13)) / f13;
                                    groupedMessagePosition6.set(0, 1, 0, 0, h4Var2.h, round4, 7);
                                    int i17 = h4Var2.h / 2;
                                    float f31 = i17;
                                    float min5 = Math.min(f13 - round4, Math.round(Math.min(f31 / groupedMessagePosition7.aspectRatio, f31 / groupedMessagePosition8.aspectRatio))) / f13;
                                    float f32 = min5 < dp4 ? dp4 : min5;
                                    groupedMessagePosition7.set(0, 0, 1, 1, i17, f32, 9);
                                    groupedMessagePosition8.set(1, 1, 1, 1, i17, f32, 10);
                                    h4Var2.e = 1;
                                }
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList2.get(3);
                                if (sb2.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(h4Var2.h / groupedMessagePosition9.aspectRatio, f13 * 0.66f)) / f13;
                                    groupedMessagePosition9.set(0, 2, 0, 0, h4Var2.h, round5, 7);
                                    float round6 = Math.round(h4Var2.h / ((groupedMessagePosition10.aspectRatio + groupedMessagePosition11.aspectRatio) + groupedMessagePosition12.aspectRatio));
                                    float f33 = min;
                                    int max3 = (int) Math.max(f33, Math.min(h4Var2.h * 0.4f, groupedMessagePosition10.aspectRatio * round6));
                                    int max4 = (int) Math.max(Math.max(f33, h4Var2.h * 0.33f), groupedMessagePosition12.aspectRatio * round6);
                                    int i18 = (h4Var2.h - max3) - max4;
                                    if (i18 < AndroidUtilities.dp(58.0f)) {
                                        int dp5 = AndroidUtilities.dp(58.0f) - i18;
                                        i18 = AndroidUtilities.dp(58.0f);
                                        int i19 = dp5 / 2;
                                        max3 -= i19;
                                        max4 -= dp5 - i19;
                                    }
                                    int i20 = max3;
                                    float min6 = Math.min(f13 - round5, round6) / f13;
                                    float f34 = min6 < dp4 ? dp4 : min6;
                                    groupedMessagePosition10.set(0, 0, 1, 1, i20, f34, 9);
                                    groupedMessagePosition11.set(1, 1, 1, 1, i18, f34, 8);
                                    groupedMessagePosition12.set(2, 2, 1, 1, max4, f34, 10);
                                    h4Var2.e = 2;
                                } else {
                                    int max5 = Math.max(min, Math.round(f13 / ((1.0f / groupedMessagePosition12.aspectRatio) + ((1.0f / groupedMessagePosition11.aspectRatio) + (1.0f / groupedMessagePosition10.aspectRatio)))));
                                    float f35 = dp;
                                    float f36 = max5;
                                    float min7 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition10.aspectRatio) / f13);
                                    float min8 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition11.aspectRatio) / f13);
                                    float f37 = (1.0f - min7) - min8;
                                    int round7 = Math.round(Math.min((groupedMessagePosition9.aspectRatio * f13) + i13, h4Var2.h - max5));
                                    groupedMessagePosition9.set(0, 0, 0, 2, round7, min7 + min8 + f37, 13);
                                    groupedMessagePosition10.set(1, 1, 0, 0, max5, min7, 6);
                                    groupedMessagePosition11.set(1, 1, 1, 1, max5, min8, 2);
                                    groupedMessagePosition11.spanSize = h4Var2.h;
                                    groupedMessagePosition12.set(1, 1, 2, 2, max5, f37, 10);
                                    int i21 = h4Var2.h;
                                    groupedMessagePosition12.spanSize = i21;
                                    groupedMessagePosition10.spanSize = i21 - round7;
                                    groupedMessagePosition11.leftSpanOffset = round7;
                                    groupedMessagePosition12.leftSpanOffset = round7;
                                    groupedMessagePosition9.siblingHeights = new float[]{min7, min8, f37};
                                    h4Var2.e = 1;
                                }
                            }
                        }
                    }
                    int size2 = arrayList2.size();
                    float[] fArr2 = new float[size2];
                    for (int i22 = 0; i22 < size; i22++) {
                        if (f19 > 1.1f) {
                            fArr2[i22] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i22)).aspectRatio);
                        } else {
                            fArr2[i22] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i22)).aspectRatio);
                        }
                        fArr2[i22] = Math.max(0.66667f, Math.min(1.7f, fArr2[i22]));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i23 = 1; i23 < size2; i23++) {
                        int i24 = size2 - i23;
                        if (i23 <= 3 && i24 <= 3) {
                            float a2 = h4Var2.a(fArr2, 0, i23);
                            float a10 = h4Var2.a(fArr2, i23, size2);
                            g4 g4Var = new g4();
                            g4Var.a = new int[]{i23, i24};
                            g4Var.b = new float[]{a2, a10};
                            arrayList4.add(g4Var);
                        }
                    }
                    int i25 = 1;
                    while (i25 < size2 - 1) {
                        int i26 = 1;
                        while (true) {
                            int i27 = size2 - i25;
                            if (i26 < i27) {
                                int i28 = i27 - i26;
                                if (i25 <= 3) {
                                    if (i26 <= (f19 < 0.85f ? 4 : 3) && i28 <= 3) {
                                        float a11 = h4Var2.a(fArr2, 0, i25);
                                        int i29 = i25 + i26;
                                        float a12 = h4Var2.a(fArr2, i25, i29);
                                        float a13 = h4Var2.a(fArr2, i29, size2);
                                        g4 g4Var2 = new g4();
                                        g4Var2.a = new int[]{i25, i26, i28};
                                        i11 = i25;
                                        g4Var2.b = new float[]{a11, a12, a13};
                                        arrayList4.add(g4Var2);
                                        i26++;
                                        i25 = i11;
                                    }
                                }
                                i11 = i25;
                                i26++;
                                i25 = i11;
                            }
                        }
                        i25++;
                    }
                    for (int i30 = 1; i30 < size2 - 2; i30++) {
                        int i31 = 1;
                        while (true) {
                            int i32 = size2 - i30;
                            if (i31 < i32) {
                                int i33 = 1;
                                while (true) {
                                    int i34 = i32 - i31;
                                    if (i33 < i34) {
                                        int i35 = i34 - i33;
                                        if (i30 > 3 || i31 > 3 || i33 > 3 || i35 > 3) {
                                            i10 = i32;
                                        } else {
                                            i10 = i32;
                                            float a14 = h4Var2.a(fArr2, 0, i30);
                                            int i36 = i30 + i31;
                                            float a15 = h4Var2.a(fArr2, i30, i36);
                                            int i37 = i36 + i33;
                                            float a16 = h4Var2.a(fArr2, i36, i37);
                                            float a17 = h4Var2.a(fArr2, i37, size2);
                                            g4 g4Var3 = new g4();
                                            g4Var3.a = new int[]{i30, i31, i33, i35};
                                            g4Var3.b = new float[]{a14, a15, a16, a17};
                                            arrayList4.add(g4Var3);
                                        }
                                        i33++;
                                        i32 = i10;
                                    }
                                }
                                i31++;
                            }
                        }
                    }
                    float f38 = (h4Var2.h / 3) * 4;
                    g4 g4Var4 = null;
                    float f39 = 0.0f;
                    int i38 = 0;
                    while (i38 < arrayList4.size()) {
                        g4 g4Var5 = (g4) arrayList4.get(i38);
                        float f40 = Float.MAX_VALUE;
                        float f41 = f38;
                        float f42 = 0.0f;
                        int i39 = 0;
                        while (true) {
                            float[] fArr3 = g4Var5.b;
                            fArr = fArr2;
                            if (i39 >= fArr3.length) {
                                break;
                            }
                            float f43 = fArr3[i39];
                            f42 += f43;
                            if (f43 < f40) {
                                f40 = f43;
                            }
                            i39++;
                            fArr2 = fArr;
                        }
                        float abs = Math.abs(f42 - f41);
                        int[] iArr = g4Var5.a;
                        if (iArr.length > 1) {
                            int i40 = iArr[0];
                            int i41 = iArr[1];
                            if (i40 <= i41) {
                                f7 = abs;
                                if (iArr.length <= 2 || i41 <= iArr[2]) {
                                    if (iArr.length > 3) {
                                    }
                                }
                            } else {
                                f7 = abs;
                            }
                            f10 = f7 * 1.2f;
                            if (f40 < min) {
                                f10 *= 1.5f;
                            }
                            if (g4Var4 != null || f10 < f39) {
                                f39 = f10;
                                g4Var4 = g4Var5;
                            }
                            i38++;
                            f38 = f41;
                            fArr2 = fArr;
                        } else {
                            f7 = abs;
                        }
                        f10 = f7;
                        if (f40 < min) {
                        }
                        if (g4Var4 != null) {
                        }
                        f39 = f10;
                        g4Var4 = g4Var5;
                        i38++;
                        f38 = f41;
                        fArr2 = fArr;
                    }
                    float[] fArr4 = fArr2;
                    if (g4Var4 == null) {
                        j4Var = this;
                    } else {
                        int[] iArr2 = g4Var4.a;
                        int i42 = 0;
                        int i43 = 0;
                        while (i42 < iArr2.length) {
                            int i44 = iArr2[i42];
                            float f44 = g4Var4.b[i42];
                            int i45 = h4Var2.h;
                            int i46 = i44 - 1;
                            h4Var2.e = Math.max(h4Var2.e, i46);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = null;
                            int i47 = 0;
                            while (i47 < i44) {
                                int i48 = (int) (fArr4[i43] * f44);
                                i45 -= i48;
                                MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i43);
                                int i49 = i42 == 0 ? 4 : 0;
                                g4 g4Var6 = g4Var4;
                                if (i42 == iArr2.length - 1) {
                                    i49 |= 8;
                                }
                                if (i47 == 0) {
                                    i49 |= 1;
                                }
                                if (i47 == i46) {
                                    i49 |= 2;
                                    groupedMessagePosition13 = groupedMessagePosition14;
                                }
                                int i50 = i47;
                                groupedMessagePosition14.set(i50, i47, i42, i42, i48, Math.max(dp4, f44 / f13), i49);
                                i43++;
                                i47 = i50 + 1;
                                g4Var4 = g4Var6;
                            }
                            groupedMessagePosition13.pw += i45;
                            groupedMessagePosition13.spanSize += i45;
                            i42++;
                            g4Var4 = g4Var4;
                        }
                    }
                }
                for (int i51 = 0; i51 < size; i51++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i51);
                    if (groupedMessagePosition15.maxX == h4Var2.e || (groupedMessagePosition15.flags & 2) != 0) {
                        groupedMessagePosition15.spanSize += 200;
                    }
                    if ((groupedMessagePosition15.flags & 1) != 0) {
                        groupedMessagePosition15.edge = true;
                    }
                    if (groupedMessagePosition15.edge) {
                        int i52 = groupedMessagePosition15.spanSize;
                        if (i52 != 1000) {
                            groupedMessagePosition15.spanSize = i52 + 108;
                        }
                        groupedMessagePosition15.pw += 108;
                    } else if ((groupedMessagePosition15.flags & 2) != 0) {
                        int i53 = groupedMessagePosition15.spanSize;
                        if (i53 != 1000) {
                            groupedMessagePosition15.spanSize = i53 - 108;
                        } else {
                            int i54 = groupedMessagePosition15.leftSpanOffset;
                            if (i54 != 0) {
                                groupedMessagePosition15.leftSpanOffset = i54 + 108;
                            }
                        }
                    }
                }
                int i55 = 0;
                while (i55 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList2.get(i55);
                    if (groupedMessagePosition16.minX == 0) {
                        groupedMessagePosition16.spanSize += 200;
                    }
                    if ((groupedMessagePosition16.flags & 2) != 0) {
                        groupedMessagePosition16.edge = true;
                    }
                    h4Var2.e = Math.max(h4Var2.e, (int) groupedMessagePosition16.maxX);
                    h4Var2.f = Math.max(h4Var2.f, (int) groupedMessagePosition16.maxY);
                    byte b10 = groupedMessagePosition16.minY;
                    byte b11 = groupedMessagePosition16.maxY;
                    byte b12 = groupedMessagePosition16.minX;
                    int i56 = (b11 - b10) + 1;
                    float[] fArr5 = new float[i56];
                    Arrays.fill(fArr5, 0.0f);
                    int size3 = arrayList2.size();
                    int i57 = 0;
                    while (i57 < size3) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList2.get(i57);
                        if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxX < b12) {
                            int min9 = Math.min((int) groupedMessagePosition17.maxY, (int) b11) - b10;
                            int max6 = Math.max(groupedMessagePosition17.minY - b10, 0);
                            while (max6 <= min9) {
                                fArr5[max6] = fArr5[max6] + groupedMessagePosition17.pw;
                                max6++;
                                i55 = i55;
                            }
                        }
                        i57++;
                        i55 = i55;
                    }
                    int i58 = i55;
                    float f45 = 0.0f;
                    for (int i59 = 0; i59 < i56; i59++) {
                        float f46 = fArr5[i59];
                        if (f45 < f46) {
                            f45 = f46;
                        }
                    }
                    groupedMessagePosition16.left = f45;
                    i55 = i58 + 1;
                }
                for (int i60 = 0; i60 < size; i60++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList2.get(i60);
                    byte b13 = groupedMessagePosition18.minY;
                    int i61 = h4Var2.e + 1;
                    float[] fArr6 = new float[i61];
                    Arrays.fill(fArr6, 0.0f);
                    int size4 = arrayList2.size();
                    for (int i62 = 0; i62 < size4; i62++) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList2.get(i62);
                        if (groupedMessagePosition19 != groupedMessagePosition18 && groupedMessagePosition19.maxY < b13) {
                            for (int i63 = groupedMessagePosition19.minX; i63 <= groupedMessagePosition19.maxX; i63++) {
                                fArr6[i63] = fArr6[i63] + groupedMessagePosition19.ph;
                            }
                        }
                    }
                    float f47 = 0.0f;
                    for (int i64 = 0; i64 < i61; i64++) {
                        float f48 = fArr6[i64];
                        if (f47 < f48) {
                            f47 = f48;
                        }
                    }
                    groupedMessagePosition18.top = f47;
                }
                int[] iArr3 = new int[10];
                Arrays.fill(iArr3, 0);
                int size5 = arrayList2.size();
                for (int i65 = 0; i65 < size5; i65++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition20 = (MessageObject.GroupedMessagePosition) arrayList2.get(i65);
                    int i66 = groupedMessagePosition20.pw;
                    for (int i67 = groupedMessagePosition20.minY; i67 <= groupedMessagePosition20.maxY; i67++) {
                        iArr3[i67] = iArr3[i67] + i66;
                    }
                }
                int i68 = iArr3[0];
                for (int i69 = 1; i69 < 10; i69++) {
                    int i70 = iArr3[i69];
                    if (i68 < i70) {
                        i68 = i70;
                    }
                }
                h4Var2.d = i68;
                float[] fArr7 = new float[10];
                Arrays.fill(fArr7, 0.0f);
                int size6 = arrayList2.size();
                for (int i71 = 0; i71 < size6; i71++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition21 = (MessageObject.GroupedMessagePosition) arrayList2.get(i71);
                    float f49 = groupedMessagePosition21.ph;
                    for (int i72 = groupedMessagePosition21.minX; i72 <= groupedMessagePosition21.maxX; i72++) {
                        fArr7[i72] = fArr7[i72] + f49;
                    }
                }
                float f50 = fArr7[0];
                for (int i73 = 1; i73 < 10; i73++) {
                    float f51 = fArr7[i73];
                    if (f50 < f51) {
                        f50 = f51;
                    }
                }
                h4Var2.g = f50;
                j4Var = this;
            }
            int i74 = j4Var.m;
            t1 t1Var = j4Var.a;
            if (i74 > 0) {
                j4Var.f = i74;
                messageObject2 = messageObject;
            } else {
                if (AndroidUtilities.isTablet()) {
                    j4Var.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                    messageObject2 = messageObject;
                } else {
                    messageObject2 = messageObject;
                    j4Var.f = Math.min(t1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((t1Var.M0(messageObject2) ? 10 : 0) + 64);
                }
                if (t1Var.z3()) {
                    j4Var.f -= AndroidUtilities.dp(52.0f);
                }
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = tL_messageMediaPaidMedia;
            int i75 = 0;
            while (true) {
                int size7 = tL_messageMediaPaidMedia3.extended_media.size();
                arrayList = j4Var.c;
                if (i75 >= size7) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia3.extended_media.get(i75);
                i4 i4Var = i75 >= arrayList.size() ? null : (i4) arrayList.get(i75);
                if (i4Var == null) {
                    h4 h4Var3 = j4Var.b;
                    if (messageExtendedMedia2 == null) {
                        h4Var3.getClass();
                        groupedMessagePosition = null;
                    } else {
                        groupedMessagePosition = (MessageObject.GroupedMessagePosition) h4Var3.c.get(messageExtendedMedia2);
                    }
                    i4 i4Var2 = new i4(j4Var.a, messageObject2, messageExtendedMedia2, tL_messageMediaPaidMedia3.extended_media.size() != 1, (int) ((groupedMessagePosition.pw / 1000.0f) * j4Var.f), (int) (groupedMessagePosition.ph * j4Var.b.i));
                    String str = messageExtendedMedia2.attachPath;
                    if (str != null) {
                        i4Var2.F = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        i4Var2.F = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(i4Var2.F)) {
                        DownloadController.getInstance(t1Var.I7).addLoadingFileObserver(i4Var2.F, messageObject2, i4Var2);
                        if (messageObject2.isSending()) {
                            i4Var2.G.o(messageExtendedMedia2.uploadProgress, false);
                        }
                    }
                    if (t1Var.M0 && !i4Var2.M) {
                        i4Var2.M = true;
                        i4Var2.f.onAttachedToWindow();
                    }
                    arrayList.add(i4Var2);
                } else {
                    i4Var.c(messageExtendedMedia2, messageObject2);
                }
                i75++;
            }
            int size8 = tL_messageMediaPaidMedia3.extended_media.size();
            while (size8 < arrayList.size()) {
                i4 i4Var3 = size8 >= arrayList.size() ? null : (i4) arrayList.get(size8);
                if (i4Var3 != null) {
                    if (i4Var3.M) {
                        i4Var3.M = false;
                        i4Var3.f.onDetachedFromWindow();
                    }
                    arrayList.remove(size8);
                    size8--;
                }
                size8++;
            }
            h(messageObject);
            h4 h4Var4 = j4Var.b;
            j4Var.g = (int) ((h4Var4.d / 1000.0f) * j4Var.f);
            j4Var.h = (int) (h4Var4.g * h4Var4.i);
            if (j4Var.i) {
                f01 f01Var = new f01(zh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                j4Var.q = f01Var;
                if (f01Var.c > j4Var.g - AndroidUtilities.dp(30.0f)) {
                    j4Var.q = new f01(zh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
            if (j4Var.r == null || j4Var.s != tL_messageMediaPaidMedia3.stars_amount) {
                long j3 = tL_messageMediaPaidMedia3.stars_amount;
                j4Var.s = j3;
                j4Var.r = new f01(zh.v7.R0(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j3), 0.9f, null), 12.0f, AndroidUtilities.bold());
            }
        }
    }

    public final void h(MessageObject messageObject) {
        float f7;
        boolean z10;
        boolean z11;
        int i10;
        t1 t1Var = this.a;
        boolean z12 = t1Var.Lc > 0 || (t1Var.u1 && !TextUtils.isEmpty(messageObject.caption));
        boolean z13 = ((t1Var.u1 || TextUtils.isEmpty(messageObject.caption)) && t1Var.N.s && !t1Var.j9) ? false : true;
        int i11 = this.m;
        if (i11 > 0) {
            f7 = 1000.0f / this.b.d;
            this.f = i11;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                this.f = Math.min(t1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((t1Var.M0(messageObject) ? 10 : 0) + 64);
            }
            if (t1Var.z3()) {
                this.f -= AndroidUtilities.dp(52.0f);
            }
            f7 = 1.0f;
        }
        h4 h4Var = this.b;
        this.g = (int) ((h4Var.d / 1000.0f) * f7 * this.f);
        this.h = (int) (h4Var.g * h4Var.i);
        this.i = false;
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(r11 - (SharedConfig.bubbleRadius > 2 ? 2 : 0));
        int min = Math.min(AndroidUtilities.dp(3.0f), dp3);
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i12 >= arrayList.size()) {
                break;
            }
            i4 i4Var = (i4) arrayList.get(i12);
            h4 h4Var2 = this.b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var.E;
            ImageReceiver imageReceiver = i4Var.f;
            if (messageExtendedMedia == null) {
                h4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) h4Var2.c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z10 = z12;
                z11 = z13;
                i10 = dp;
            } else {
                float f10 = (groupedMessagePosition.left / 1000.0f) * f7;
                float f11 = this.f;
                int i13 = (int) (f10 * f11);
                z10 = z12;
                float f12 = groupedMessagePosition.top;
                float f13 = this.b.i;
                int i14 = (int) (f12 * f13);
                int i15 = (int) ((groupedMessagePosition.pw / 1000.0f) * f7 * f11);
                int i16 = (int) (groupedMessagePosition.ph * f13);
                int i17 = i15;
                int i18 = groupedMessagePosition.flags;
                if ((i18 & 1) == 0) {
                    i13 += dp;
                    i17 -= dp;
                }
                if ((i18 & 4) == 0) {
                    i14 += dp;
                    i16 -= dp;
                }
                int i19 = i14;
                int i20 = i16;
                if ((i18 & 2) == 0) {
                    i17 -= dp;
                }
                int i21 = i17;
                if ((i18 & 8) == 0) {
                    i20 -= dp;
                }
                z11 = z13;
                int i22 = i20;
                i4Var.a = i13;
                i4Var.b = i19;
                i10 = dp;
                i4Var.c = i13 + i21;
                i4Var.d = i19 + i22;
                imageReceiver.setImageCoords(i13, i19, i21, i22);
                int i23 = groupedMessagePosition.flags;
                int i24 = i23 & 4;
                int i25 = (i24 == 0 || (i23 & 1) == 0 || z10) ? dp2 : dp3;
                int i26 = (i24 == 0 || (i23 & 2) == 0 || z10) ? dp2 : dp3;
                int i27 = i23 & 8;
                int i28 = (i27 == 0 || (i23 & 1) == 0 || z11) ? dp2 : dp3;
                int i29 = (i27 == 0 || (i23 & 2) == 0 || z11) ? dp2 : dp3;
                if (!z11) {
                    if (messageObject.isOutOwner()) {
                        i29 = dp2;
                    } else {
                        i28 = dp2;
                    }
                }
                if (!z10 && t1Var.E) {
                    if (messageObject.isOutOwner()) {
                        i26 = min;
                    } else {
                        i25 = min;
                    }
                }
                imageReceiver.setRoundRadius(i25, i26, i29, i28);
                float[] fArr = i4Var.s;
                float f14 = i25;
                fArr[1] = f14;
                fArr[0] = f14;
                float f15 = i26;
                fArr[3] = f15;
                fArr[2] = f15;
                float f16 = i29;
                fArr[5] = f16;
                fArr[4] = f16;
                float f17 = i28;
                fArr[7] = f17;
                fArr[6] = f17;
                if (messageObject != null && messageObject.isSending()) {
                    i4Var.b(3);
                }
                this.i = this.i || i4Var.h;
            }
            i12++;
            z12 = z10;
            dp = i10;
            z13 = z11;
        }
        if (this.i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = messageObject == null ? null : (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia != null) {
                f01 f01Var = new f01(zh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.q = f01Var;
                if (f01Var.c > this.g - AndroidUtilities.dp(30.0f)) {
                    this.q = new f01(zh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
