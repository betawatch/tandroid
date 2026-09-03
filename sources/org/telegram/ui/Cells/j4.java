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
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j4 {
    public int A;
    public int B;
    public boolean C;
    public final s1 a;
    public h4 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final org.telegram.ui.Components.z5 j;
    public j90 k;
    public final ih.j l;
    public int m;
    public final rc n;
    public i4 o;
    public boolean p;
    public k01 q;
    public k01 r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public j4(s1 s1Var) {
        this.a = s1Var;
        this.l = ih.j.e(s1Var);
        this.j = new org.telegram.ui.Components.z5(s1Var, 0L, 350L, mr.h);
        this.n = new rc(s1Var);
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
        s1 s1Var;
        RectF rectF;
        Path path;
        Path path2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int max;
        Canvas canvas2 = canvas;
        if (this.b == null) {
            return;
        }
        boolean z4 = this.i;
        org.telegram.ui.Components.z5 z5Var = this.j;
        float e = z5Var.e(z4);
        float e6 = z5Var.e(this.i);
        s1 s1Var2 = this.a;
        MessageObject messageObject = s1Var2.getMessageObject();
        Path path3 = this.u;
        path3.rewind();
        float f15 = Float.MAX_VALUE;
        float f16 = Float.MAX_VALUE;
        float f17 = Float.MIN_VALUE;
        float f18 = Float.MIN_VALUE;
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            i4 i4Var = (i4) arrayList.get(i10);
            ImageReceiver imageReceiver = i4Var.f;
            RadialProgress2 radialProgress2 = i4Var.D;
            int i11 = this.d;
            int i12 = i4Var.a;
            float f19 = e;
            int i13 = this.e;
            int i14 = i4Var.b;
            float f20 = e6;
            s1 s1Var3 = s1Var2;
            imageReceiver.setImageCoords(i11 + i12, i13 + i14, i4Var.c - i12, i4Var.d - i14);
            imageReceiver.draw(canvas2);
            if (imageReceiver.getAnimation() != null) {
                imageReceiver.getAnimation().getClass();
                int round = Math.round(0 / 1000.0f);
                if (!i4Var.x && i4Var.H != (max = Math.max(0, i4Var.G - round))) {
                    i4Var.H = max;
                    i4Var.I = new k01(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                }
            }
            if (f20 > 0.0f) {
                float min = Math.min(this.d + i4Var.a, f16);
                float min2 = Math.min(this.e + i4Var.b, f15);
                f18 = Math.max(this.d + i4Var.c, f18);
                f17 = Math.max(this.e + i4Var.d, f17);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f21 = i4Var.a + this.d;
                int i15 = this.e;
                rectF2.set(f21, i4Var.b + i15, r9 + i4Var.c, i15 + i4Var.d);
                path3.addRoundRect(rectF2, i4Var.s, Path.Direction.CW);
                f15 = min2;
                f16 = min;
            }
            radialProgress2.g(org.telegram.ui.ActionBar.j6.le, org.telegram.ui.ActionBar.j6.me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.oe);
            RectF rectF3 = radialProgress2.a;
            float f22 = f15;
            rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.x + imageReceiver.getImageY());
            if (messageObject.isSending()) {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(i4Var.C);
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
            canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f20) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i10++;
            f15 = f22;
            e = f19;
            s1Var2 = s1Var3;
            e6 = f20;
        }
        float f23 = e;
        float f24 = e6;
        s1 s1Var4 = s1Var2;
        if (f24 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path3);
            canvas2.translate(f16, f15);
            int i16 = (int) (f18 - f16);
            int i17 = (int) (f17 - f15);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i16, i17, (int) (f24 * 255.0f), 31);
            this.l.c(canvas, s1Var4, i16, i17, 1.0f, s1Var4.le);
            canvas2 = canvas;
            s1Var = s1Var4;
            canvas2.restore();
            canvas2.restore();
            s1Var.invalidate();
        } else {
            s1Var = s1Var4;
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
            if (i4Var2.I != null) {
                float dp = AndroidUtilities.dp(11.4f) + i4Var2.I.c;
                float dp2 = AndroidUtilities.dp(17.0f);
                float dp3 = AndroidUtilities.dp(5.0f);
                float f25 = this.d + i4Var2.a + dp3;
                float f26 = this.e + i4Var2.b + dp3;
                rectF.set(f25, f26, dp + f25, f26 + dp2);
                if (this.r == null || rectF.right <= ((this.d + this.g) - (AndroidUtilities.dp(11.32f) + this.r.c)) - dp3 || rectF.top > this.e + dp3) {
                    path.rewind();
                    float f27 = dp2 / 2.0f;
                    path.addRoundRect(rectF, f27, f27, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f14 = f24;
                    c(canvas2, f14);
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(1.0f, TLObject.FLAG_30));
                    i4Var2.I.c(this.d + i4Var2.a + dp3 + AndroidUtilities.dp(5.66f), this.e + i4Var2.b + dp3 + f27, 1.0f, -1, canvas2);
                    canvas2.restore();
                    i18++;
                    f24 = f14;
                }
            }
            f14 = f24;
            i18++;
            f24 = f14;
        }
        if (this.q == null || f23 <= 0.0f) {
            path2 = path;
            f10 = f23;
            f11 = 11.32f;
            f12 = 5.0f;
            f13 = 17.0f;
        } else {
            float a2 = this.n.a(0.05f);
            float dp4 = AndroidUtilities.dp(28.0f) + this.q.c;
            float dp5 = AndroidUtilities.dp(32.0f);
            float f28 = this.d;
            float f29 = this.g;
            float x10 = e2.c.x(f29, dp4, 2.0f, f28);
            f11 = 11.32f;
            float f30 = this.e;
            f12 = 5.0f;
            float f31 = this.h;
            f13 = 17.0f;
            rectF.set(x10, e2.c.x(f31, dp5, 2.0f, f30), kf.k0.b(f29, dp4, 2.0f, f28), kf.k0.b(f31, dp5, 2.0f, f30));
            path.rewind();
            float f32 = dp5 / 2.0f;
            path.addRoundRect(rectF, f32, f32, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(a2, a2, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
            canvas2.save();
            canvas2.clipPath(path);
            f10 = f23;
            c(canvas2, f10);
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(f10, 1342177280));
            path2 = path;
            this.q.c((((this.g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f10, -1, canvas2);
            canvas2.restore();
            if (s1Var.getDelegate() == null || !s1Var.getDelegate().h1(5, s1Var)) {
                j90 j90Var = this.k;
                if (j90Var != null && !j90Var.c() && !this.k.b()) {
                    this.k.a();
                }
            } else {
                j90 j90Var2 = this.k;
                if (j90Var2 == null) {
                    j90 j90Var3 = new j90();
                    this.k = j90Var3;
                    j90Var3.setCallback(s1Var);
                    this.k.f(org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.35f, -1), org.telegram.ui.ActionBar.j6.l1(0.8f, -1));
                    j90 j90Var4 = this.k;
                    j90Var4.C = true;
                    j90Var4.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else if (j90Var2.b() || this.k.c()) {
                    j90 j90Var5 = this.k;
                    j90Var5.b = -1L;
                    j90Var5.c = -1L;
                }
            }
            j90 j90Var6 = this.k;
            if (j90Var6 != null) {
                j90Var6.d(rectF);
                this.k.j(f32);
                this.k.setAlpha((int) (f10 * 255.0f));
                this.k.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.r == null || f10 >= 1.0f || !a()) {
            return;
        }
        float timeAlpha = s1Var.getTimeAlpha() * (1.0f - f10);
        float dp6 = AndroidUtilities.dp(f11) + this.r.c;
        float dp7 = AndroidUtilities.dp(f13);
        float dp8 = AndroidUtilities.dp(f12);
        float f33 = this.d + this.g;
        float f34 = this.e + dp8;
        rectF.set((f33 - dp6) - dp8, f34, f33 - dp8, f34 + dp7);
        path2.rewind();
        float f35 = dp7 / 2.0f;
        path2.addRoundRect(rectF, f35, f35, Path.Direction.CW);
        canvas2.save();
        canvas2.clipPath(path2);
        canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(timeAlpha, TLObject.FLAG_30));
        this.r.c((((this.d + this.g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.e + dp8 + f35, timeAlpha, -1, canvas2);
        canvas.restore();
    }

    public final void c(Canvas canvas, float f10) {
        ArrayList arrayList;
        if (this.b == null) {
            return;
        }
        s1 s1Var = this.a;
        int id2 = s1Var.getMessageObject() != null ? s1Var.getMessageObject().getId() : 0;
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
            float f11 = max / this.g;
            canvas2.scale(f11, f11);
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
            this.x.setAlpha((int) (f10 * 255.0f));
            canvas.drawBitmap(this.w, 0.0f, 0.0f, this.x);
            canvas.restore();
        }
    }

    public final i4 d(float f10, float f11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((i4) arrayList.get(i10)).f.isInsideImage(f10, f11)) {
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
        ih.j jVar = this.l;
        if (jVar != null) {
            jVar.a(this.a);
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return;
            }
            i4 i4Var = (i4) arrayList.get(i10);
            if (i4Var.J) {
                i4Var.J = false;
                i4Var.f.onDetachedFromWindow();
            }
            i10++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z4;
        i4 i4Var;
        s1 s1Var;
        boolean z10;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            i4 d = d(x10, y10);
            this.o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.D;
                if (radialProgress2.i.q != 4 && radialProgress2.a.contains(x10, y10)) {
                    z10 = true;
                    this.p = z10;
                }
            }
            z10 = false;
            this.p = z10;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i4 d10 = d(x10, y10);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.D;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x10, y10)) {
                    z4 = true;
                    i4Var = this.o;
                    if (i4Var != null && i4Var == d10) {
                        s1Var = this.a;
                        if (s1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = s1Var.getMessageObject();
                            if (this.p || !z4 || d10.D.i.q != 3 || messageObject == null) {
                                j1 delegate = s1Var.getDelegate();
                                i4 i4Var2 = this.o;
                                ImageReceiver imageReceiver = i4Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var2.B;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.Y1(s1Var, messageExtendedMedia);
                            } else if (messageObject.isSending()) {
                                SendMessagesHelper.getInstance(messageObject.currentAccount).cancelSendingMessage(messageObject);
                            }
                        }
                    }
                    this.p = false;
                    this.o = null;
                }
            }
            z4 = false;
            i4Var = this.o;
            if (i4Var != null) {
                s1Var = this.a;
                if (s1Var.getDelegate() != null) {
                    MessageObject messageObject2 = s1Var.getMessageObject();
                    if (this.p) {
                    }
                    j1 delegate2 = s1Var.getDelegate();
                    i4 i4Var22 = this.o;
                    ImageReceiver imageReceiver2 = i4Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = i4Var22.B;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.Y1(s1Var, messageExtendedMedia2);
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
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
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
            float f14 = h4Var2.i;
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
                StringBuilder sb = new StringBuilder();
                int i12 = 0;
                float f15 = 1.0f;
                boolean z4 = false;
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
                    float f16 = groupedMessagePosition2.photoWidth / groupedMessagePosition2.photoHeight;
                    groupedMessagePosition2.aspectRatio = f16;
                    if (f16 > 1.2f) {
                        sb.append("w");
                    } else if (f16 < 0.8f) {
                        sb.append("n");
                    } else {
                        sb.append("q");
                    }
                    float f17 = groupedMessagePosition2.aspectRatio;
                    f15 += f17;
                    if (f17 > 2.0f) {
                        z4 = true;
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
                float f18 = h4Var2.h;
                int i13 = (int) (dp3 / (min2 / f18));
                float f19 = f18 / f14;
                float f20 = f15 / size;
                float dp4 = AndroidUtilities.dp(100.0f) / f14;
                if (size == 1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                    float f21 = groupedMessagePosition3.aspectRatio;
                    if (f21 >= 1.0f) {
                        f12 = h4Var2.h;
                        f13 = ((f12 / f21) / f12) * f14;
                    } else {
                        f12 = h4Var2.h * ((f21 * f14) / f14);
                        f13 = f14;
                    }
                    groupedMessagePosition3.set(0, 0, 0, 0, (int) f12, f13 / f14, 15);
                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                } else {
                    if (z4) {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                    } else {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                        if (size == 2 || size == 3 || size == 4) {
                            if (size == 2) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                String sb2 = sb.toString();
                                if (sb2.equals("ww") && f20 > f19 * 1.4d) {
                                    float f22 = groupedMessagePosition4.aspectRatio;
                                    float f23 = groupedMessagePosition5.aspectRatio;
                                    if (f22 - f23 < 0.2d) {
                                        float f24 = h4Var2.h;
                                        float round = Math.round(Math.min(f24 / f22, Math.min(f24 / f23, f14 / 2.0f))) / f14;
                                        groupedMessagePosition4.set(0, 0, 0, 0, h4Var2.h, round, 7);
                                        groupedMessagePosition5.set(0, 0, 1, 1, h4Var2.h, round, 11);
                                    }
                                }
                                if (sb2.equals("ww") || sb2.equals("qq")) {
                                    int i14 = h4Var2.h / 2;
                                    float f25 = i14;
                                    float round2 = Math.round(Math.min(f25 / groupedMessagePosition4.aspectRatio, Math.min(f25 / groupedMessagePosition5.aspectRatio, f14))) / f14;
                                    groupedMessagePosition4.set(0, 0, 0, 0, i14, round2, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, i14, round2, 14);
                                    h4Var2.e = 1;
                                } else {
                                    float f26 = h4Var2.h;
                                    float f27 = groupedMessagePosition4.aspectRatio;
                                    int max = (int) Math.max(f26 * 0.4f, Math.round((f26 / f27) / ((1.0f / groupedMessagePosition5.aspectRatio) + (1.0f / f27))));
                                    int i15 = h4Var2.h - max;
                                    if (i15 < min) {
                                        max -= min - i15;
                                    } else {
                                        min = i15;
                                    }
                                    float min3 = Math.min(f14, Math.round(Math.min(min / groupedMessagePosition4.aspectRatio, max / groupedMessagePosition5.aspectRatio))) / f14;
                                    groupedMessagePosition4.set(0, 0, 0, 0, min, min3, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, max, min3, 14);
                                    h4Var2.e = 1;
                                }
                            } else if (size == 3) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                if (sb.charAt(0) == 'n') {
                                    float f28 = groupedMessagePosition7.aspectRatio;
                                    float min4 = Math.min(f14 * 0.5f, Math.round((h4Var2.h * f28) / (groupedMessagePosition8.aspectRatio + f28)));
                                    float f29 = f14 - min4;
                                    int max2 = (int) Math.max(min, Math.min(h4Var2.h * 0.5f, Math.round(Math.min(groupedMessagePosition8.aspectRatio * min4, groupedMessagePosition7.aspectRatio * f29))));
                                    int round3 = Math.round(Math.min((groupedMessagePosition6.aspectRatio * f14) + i13, h4Var2.h - max2));
                                    groupedMessagePosition6.set(0, 0, 0, 1, round3, 1.0f, 13);
                                    float f30 = f29 / f14;
                                    groupedMessagePosition7.set(1, 1, 0, 0, max2, f30, 6);
                                    float f31 = min4 / f14;
                                    groupedMessagePosition8.set(1, 1, 1, 1, max2, f31, 10);
                                    int i16 = h4Var2.h;
                                    groupedMessagePosition8.spanSize = i16;
                                    groupedMessagePosition6.siblingHeights = new float[]{f31, f30};
                                    groupedMessagePosition7.spanSize = i16 - round3;
                                    groupedMessagePosition8.leftSpanOffset = round3;
                                    h4Var2.e = 1;
                                } else {
                                    float round4 = Math.round(Math.min(h4Var2.h / groupedMessagePosition6.aspectRatio, 0.66f * f14)) / f14;
                                    groupedMessagePosition6.set(0, 1, 0, 0, h4Var2.h, round4, 7);
                                    int i17 = h4Var2.h / 2;
                                    float f32 = i17;
                                    float min5 = Math.min(f14 - round4, Math.round(Math.min(f32 / groupedMessagePosition7.aspectRatio, f32 / groupedMessagePosition8.aspectRatio))) / f14;
                                    float f33 = min5 < dp4 ? dp4 : min5;
                                    groupedMessagePosition7.set(0, 0, 1, 1, i17, f33, 9);
                                    groupedMessagePosition8.set(1, 1, 1, 1, i17, f33, 10);
                                    h4Var2.e = 1;
                                }
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList2.get(3);
                                if (sb.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(h4Var2.h / groupedMessagePosition9.aspectRatio, f14 * 0.66f)) / f14;
                                    groupedMessagePosition9.set(0, 2, 0, 0, h4Var2.h, round5, 7);
                                    float round6 = Math.round(h4Var2.h / ((groupedMessagePosition10.aspectRatio + groupedMessagePosition11.aspectRatio) + groupedMessagePosition12.aspectRatio));
                                    float f34 = min;
                                    int max3 = (int) Math.max(f34, Math.min(h4Var2.h * 0.4f, groupedMessagePosition10.aspectRatio * round6));
                                    int max4 = (int) Math.max(Math.max(f34, h4Var2.h * 0.33f), groupedMessagePosition12.aspectRatio * round6);
                                    int i18 = (h4Var2.h - max3) - max4;
                                    if (i18 < AndroidUtilities.dp(58.0f)) {
                                        int dp5 = AndroidUtilities.dp(58.0f) - i18;
                                        i18 = AndroidUtilities.dp(58.0f);
                                        int i19 = dp5 / 2;
                                        max3 -= i19;
                                        max4 -= dp5 - i19;
                                    }
                                    int i20 = max3;
                                    float min6 = Math.min(f14 - round5, round6) / f14;
                                    float f35 = min6 < dp4 ? dp4 : min6;
                                    groupedMessagePosition10.set(0, 0, 1, 1, i20, f35, 9);
                                    groupedMessagePosition11.set(1, 1, 1, 1, i18, f35, 8);
                                    groupedMessagePosition12.set(2, 2, 1, 1, max4, f35, 10);
                                    h4Var2.e = 2;
                                } else {
                                    int max5 = Math.max(min, Math.round(f14 / ((1.0f / groupedMessagePosition12.aspectRatio) + ((1.0f / groupedMessagePosition11.aspectRatio) + (1.0f / groupedMessagePosition10.aspectRatio)))));
                                    float f36 = dp;
                                    float f37 = max5;
                                    float min7 = Math.min(0.33f, Math.max(f36, f37 / groupedMessagePosition10.aspectRatio) / f14);
                                    float min8 = Math.min(0.33f, Math.max(f36, f37 / groupedMessagePosition11.aspectRatio) / f14);
                                    float f38 = (1.0f - min7) - min8;
                                    int round7 = Math.round(Math.min((groupedMessagePosition9.aspectRatio * f14) + i13, h4Var2.h - max5));
                                    groupedMessagePosition9.set(0, 0, 0, 2, round7, min7 + min8 + f38, 13);
                                    groupedMessagePosition10.set(1, 1, 0, 0, max5, min7, 6);
                                    groupedMessagePosition11.set(1, 1, 1, 1, max5, min8, 2);
                                    groupedMessagePosition11.spanSize = h4Var2.h;
                                    groupedMessagePosition12.set(1, 1, 2, 2, max5, f38, 10);
                                    int i21 = h4Var2.h;
                                    groupedMessagePosition12.spanSize = i21;
                                    groupedMessagePosition10.spanSize = i21 - round7;
                                    groupedMessagePosition11.leftSpanOffset = round7;
                                    groupedMessagePosition12.leftSpanOffset = round7;
                                    groupedMessagePosition9.siblingHeights = new float[]{min7, min8, f38};
                                    h4Var2.e = 1;
                                }
                            }
                        }
                    }
                    int size2 = arrayList2.size();
                    float[] fArr2 = new float[size2];
                    for (int i22 = 0; i22 < size; i22++) {
                        if (f20 > 1.1f) {
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
                                    if (i26 <= (f20 < 0.85f ? 4 : 3) && i28 <= 3) {
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
                    float f39 = (h4Var2.h / 3) * 4;
                    g4 g4Var4 = null;
                    float f40 = 0.0f;
                    int i38 = 0;
                    while (i38 < arrayList4.size()) {
                        g4 g4Var5 = (g4) arrayList4.get(i38);
                        float f41 = Float.MAX_VALUE;
                        float f42 = f39;
                        float f43 = 0.0f;
                        int i39 = 0;
                        while (true) {
                            float[] fArr3 = g4Var5.b;
                            fArr = fArr2;
                            if (i39 >= fArr3.length) {
                                break;
                            }
                            float f44 = fArr3[i39];
                            f43 += f44;
                            if (f44 < f41) {
                                f41 = f44;
                            }
                            i39++;
                            fArr2 = fArr;
                        }
                        float abs = Math.abs(f43 - f42);
                        int[] iArr = g4Var5.a;
                        if (iArr.length > 1) {
                            int i40 = iArr[0];
                            int i41 = iArr[1];
                            if (i40 <= i41) {
                                f10 = abs;
                                if (iArr.length <= 2 || i41 <= iArr[2]) {
                                    if (iArr.length > 3) {
                                    }
                                }
                            } else {
                                f10 = abs;
                            }
                            f11 = f10 * 1.2f;
                            if (f41 < min) {
                                f11 *= 1.5f;
                            }
                            if (g4Var4 != null || f11 < f40) {
                                f40 = f11;
                                g4Var4 = g4Var5;
                            }
                            i38++;
                            f39 = f42;
                            fArr2 = fArr;
                        } else {
                            f10 = abs;
                        }
                        f11 = f10;
                        if (f41 < min) {
                        }
                        if (g4Var4 != null) {
                        }
                        f40 = f11;
                        g4Var4 = g4Var5;
                        i38++;
                        f39 = f42;
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
                            float f45 = g4Var4.b[i42];
                            int i45 = h4Var2.h;
                            int i46 = i44 - 1;
                            h4Var2.e = Math.max(h4Var2.e, i46);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = null;
                            int i47 = 0;
                            while (i47 < i44) {
                                int i48 = (int) (fArr4[i43] * f45);
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
                                groupedMessagePosition14.set(i50, i47, i42, i42, i48, Math.max(dp4, f45 / f14), i49);
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
                    float f46 = 0.0f;
                    for (int i59 = 0; i59 < i56; i59++) {
                        float f47 = fArr5[i59];
                        if (f46 < f47) {
                            f46 = f47;
                        }
                    }
                    groupedMessagePosition16.left = f46;
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
                    float f48 = 0.0f;
                    for (int i64 = 0; i64 < i61; i64++) {
                        float f49 = fArr6[i64];
                        if (f48 < f49) {
                            f48 = f49;
                        }
                    }
                    groupedMessagePosition18.top = f48;
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
                    float f50 = groupedMessagePosition21.ph;
                    for (int i72 = groupedMessagePosition21.minX; i72 <= groupedMessagePosition21.maxX; i72++) {
                        fArr7[i72] = fArr7[i72] + f50;
                    }
                }
                float f51 = fArr7[0];
                for (int i73 = 1; i73 < 10; i73++) {
                    float f52 = fArr7[i73];
                    if (f51 < f52) {
                        f51 = f52;
                    }
                }
                h4Var2.g = f51;
                j4Var = this;
            }
            int i74 = j4Var.m;
            s1 s1Var = j4Var.a;
            if (i74 > 0) {
                j4Var.f = i74;
                messageObject2 = messageObject;
            } else {
                if (AndroidUtilities.isTablet()) {
                    j4Var.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                    messageObject2 = messageObject;
                } else {
                    messageObject2 = messageObject;
                    j4Var.f = Math.min(s1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((s1Var.M0(messageObject2) ? 10 : 0) + 64);
                }
                if (s1Var.z3()) {
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
                        i4Var2.C = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        i4Var2.C = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(i4Var2.C)) {
                        DownloadController.getInstance(s1Var.F7).addLoadingFileObserver(i4Var2.C, messageObject2, i4Var2);
                        if (messageObject2.isSending()) {
                            i4Var2.D.o(messageExtendedMedia2.uploadProgress, false);
                        }
                    }
                    if (s1Var.J0 && !i4Var2.J) {
                        i4Var2.J = true;
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
                    if (i4Var3.J) {
                        i4Var3.J = false;
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
                k01 k01Var = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                j4Var.q = k01Var;
                if (k01Var.c > j4Var.g - AndroidUtilities.dp(30.0f)) {
                    j4Var.q = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
            if (j4Var.r == null || j4Var.s != tL_messageMediaPaidMedia3.stars_amount) {
                long j10 = tL_messageMediaPaidMedia3.stars_amount;
                j4Var.s = j10;
                j4Var.r = new k01(lh.ja.R0(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j10), 0.9f, null), 12.0f, AndroidUtilities.bold());
            }
        }
    }

    public final void h(MessageObject messageObject) {
        float f10;
        boolean z4;
        boolean z10;
        int i10;
        s1 s1Var = this.a;
        boolean z11 = s1Var.Ic > 0 || (s1Var.r1 && !TextUtils.isEmpty(messageObject.caption));
        boolean z12 = ((s1Var.r1 || TextUtils.isEmpty(messageObject.caption)) && s1Var.K.s && !s1Var.g9) ? false : true;
        int i11 = this.m;
        if (i11 > 0) {
            f10 = 1000.0f / this.b.d;
            this.f = i11;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                this.f = Math.min(s1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((s1Var.M0(messageObject) ? 10 : 0) + 64);
            }
            if (s1Var.z3()) {
                this.f -= AndroidUtilities.dp(52.0f);
            }
            f10 = 1.0f;
        }
        h4 h4Var = this.b;
        this.g = (int) ((h4Var.d / 1000.0f) * f10 * this.f);
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
            TLRPC.MessageExtendedMedia messageExtendedMedia = i4Var.B;
            ImageReceiver imageReceiver = i4Var.f;
            if (messageExtendedMedia == null) {
                h4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) h4Var2.c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z4 = z11;
                z10 = z12;
                i10 = dp;
            } else {
                float f11 = (groupedMessagePosition.left / 1000.0f) * f10;
                float f12 = this.f;
                int i13 = (int) (f11 * f12);
                z4 = z11;
                float f13 = groupedMessagePosition.top;
                float f14 = this.b.i;
                int i14 = (int) (f13 * f14);
                int i15 = (int) ((groupedMessagePosition.pw / 1000.0f) * f10 * f12);
                int i16 = (int) (groupedMessagePosition.ph * f14);
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
                z10 = z12;
                int i22 = i20;
                i4Var.a = i13;
                i4Var.b = i19;
                i10 = dp;
                i4Var.c = i13 + i21;
                i4Var.d = i19 + i22;
                imageReceiver.setImageCoords(i13, i19, i21, i22);
                int i23 = groupedMessagePosition.flags;
                int i24 = i23 & 4;
                int i25 = (i24 == 0 || (i23 & 1) == 0 || z4) ? dp2 : dp3;
                int i26 = (i24 == 0 || (i23 & 2) == 0 || z4) ? dp2 : dp3;
                int i27 = i23 & 8;
                int i28 = (i27 == 0 || (i23 & 1) == 0 || z10) ? dp2 : dp3;
                int i29 = (i27 == 0 || (i23 & 2) == 0 || z10) ? dp2 : dp3;
                if (!z10) {
                    if (messageObject.isOutOwner()) {
                        i29 = dp2;
                    } else {
                        i28 = dp2;
                    }
                }
                if (!z4 && s1Var.B) {
                    if (messageObject.isOutOwner()) {
                        i26 = min;
                    } else {
                        i25 = min;
                    }
                }
                imageReceiver.setRoundRadius(i25, i26, i29, i28);
                float[] fArr = i4Var.s;
                float f15 = i25;
                fArr[1] = f15;
                fArr[0] = f15;
                float f16 = i26;
                fArr[3] = f16;
                fArr[2] = f16;
                float f17 = i29;
                fArr[5] = f17;
                fArr[4] = f17;
                float f18 = i28;
                fArr[7] = f18;
                fArr[6] = f18;
                if (messageObject != null && messageObject.isSending()) {
                    i4Var.b(3);
                }
                this.i = this.i || i4Var.h;
            }
            i12++;
            z11 = z4;
            dp = i10;
            z12 = z10;
        }
        if (this.i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = messageObject == null ? null : (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia != null) {
                k01 k01Var = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.q = k01Var;
                if (k01Var.c > this.g - AndroidUtilities.dp(30.0f)) {
                    this.q = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
