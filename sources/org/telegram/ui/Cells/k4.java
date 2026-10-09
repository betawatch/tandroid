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
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k4 {
    public int A;
    public int B;
    public boolean C;
    public final u1 a;
    public i4 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final org.telegram.ui.Components.g6 j;
    public ia0 k;
    public final vh.f l;
    public int m;
    public final bd n;
    public j4 o;
    public boolean p;
    public l11 q;
    public l11 r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public k4(u1 u1Var) {
        this.a = u1Var;
        this.l = vh.f.e(u1Var);
        this.j = new org.telegram.ui.Components.g6(u1Var, 0L, 350L, hs.h);
        this.n = new bd(u1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((j4) obj).f.getVisible()) {
                return false;
            }
        }
        return true;
    }

    public final void b(Canvas canvas) {
        ArrayList arrayList;
        u1 u1Var;
        RectF rectF;
        Path path;
        float f7;
        float f10;
        float f11;
        float f12;
        Path path2;
        float f13;
        int max;
        Canvas canvas2 = canvas;
        if (this.b == null) {
            return;
        }
        boolean z10 = this.i;
        org.telegram.ui.Components.g6 g6Var = this.j;
        float e7 = g6Var.e(z10);
        float e10 = g6Var.e(this.i);
        u1 u1Var2 = this.a;
        MessageObject messageObject = u1Var2.getMessageObject();
        Path path3 = this.u;
        path3.rewind();
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MIN_VALUE;
        float f16 = Float.MIN_VALUE;
        int i10 = 0;
        float f17 = Float.MAX_VALUE;
        while (true) {
            arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            j4 j4Var = (j4) arrayList.get(i10);
            ImageReceiver imageReceiver = j4Var.f;
            RadialProgress2 radialProgress2 = j4Var.G;
            int i11 = this.d;
            int i12 = j4Var.a;
            float f18 = e7;
            int i13 = this.e;
            int i14 = j4Var.b;
            float f19 = e10;
            u1 u1Var3 = u1Var2;
            imageReceiver.setImageCoords(i11 + i12, i13 + i14, j4Var.c - i12, j4Var.d - i14);
            imageReceiver.draw(canvas2);
            if (imageReceiver.getAnimation() != null) {
                imageReceiver.getAnimation().getClass();
                int round = Math.round(0 / 1000.0f);
                if (!j4Var.x && j4Var.K != (max = Math.max(0, j4Var.J - round))) {
                    j4Var.K = max;
                    j4Var.L = new l11(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                }
            }
            if (f19 > 0.0f) {
                float min = Math.min(this.d + j4Var.a, f17);
                float min2 = Math.min(this.e + j4Var.b, f14);
                f16 = Math.max(this.d + j4Var.c, f16);
                f15 = Math.max(this.e + j4Var.d, f15);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f20 = j4Var.a + this.d;
                int i15 = this.e;
                rectF2.set(f20, j4Var.b + i15, r9 + j4Var.c, i15 + j4Var.d);
                path3.addRoundRect(rectF2, j4Var.s, Path.Direction.CW);
                f14 = min2;
                f17 = min;
            }
            radialProgress2.g(org.telegram.ui.ActionBar.i6.le, org.telegram.ui.ActionBar.i6.me, org.telegram.ui.ActionBar.i6.ne, org.telegram.ui.ActionBar.i6.oe);
            RectF rectF3 = radialProgress2.a;
            float f21 = f14;
            rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.x + imageReceiver.getImageY());
            if (messageObject.isSending()) {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(j4Var.F);
                boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                if (fileProgressSizes == null && isSendingPaidMessage) {
                    radialProgress2.o(1.0f, true);
                    j4Var.b(j4Var.w ? 6 : j4Var.a());
                }
            } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(j4Var.v)) {
                j4Var.b(3);
            } else {
                j4Var.b(j4Var.a());
            }
            canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f19) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i10++;
            f14 = f21;
            e7 = f18;
            u1Var2 = u1Var3;
            e10 = f19;
        }
        float f22 = e7;
        float f23 = e10;
        u1 u1Var4 = u1Var2;
        if (f23 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path3);
            canvas2.translate(f17, f14);
            int i16 = (int) (f16 - f17);
            int i17 = (int) (f15 - f14);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i16, i17, (int) (f23 * 255.0f), 31);
            this.l.c(canvas, u1Var4, i16, i17, 1.0f, u1Var4.pe);
            canvas2 = canvas;
            u1Var = u1Var4;
            canvas2.restore();
            canvas2.restore();
            u1Var.invalidate();
        } else {
            u1Var = u1Var4;
        }
        int i18 = 0;
        while (true) {
            int size = arrayList.size();
            rectF = this.v;
            path = this.t;
            if (i18 >= size) {
                break;
            }
            j4 j4Var2 = (j4) arrayList.get(i18);
            if (j4Var2.L != null) {
                float dp = AndroidUtilities.dp(11.4f) + j4Var2.L.c;
                float dp2 = AndroidUtilities.dp(17.0f);
                float dp3 = AndroidUtilities.dp(5.0f);
                float f24 = this.d + j4Var2.a + dp3;
                float f25 = this.e + j4Var2.b + dp3;
                rectF.set(f24, f25, dp + f24, f25 + dp2);
                if (this.r == null || rectF.right <= ((this.d + this.g) - (AndroidUtilities.dp(11.32f) + this.r.c)) - dp3 || rectF.top > this.e + dp3) {
                    path.rewind();
                    float f26 = dp2 / 2.0f;
                    path.addRoundRect(rectF, f26, f26, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f13 = f23;
                    c(canvas2, f13);
                    canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(1.0f, TLObject.FLAG_30));
                    j4Var2.L.c(this.d + j4Var2.a + dp3 + AndroidUtilities.dp(5.66f), this.e + j4Var2.b + dp3 + f26, 1.0f, -1, canvas2);
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
            f7 = 11.32f;
            f10 = 5.0f;
            f11 = 17.0f;
            f12 = f22;
            path2 = path;
        } else {
            float a2 = this.n.a(0.05f);
            float dp4 = AndroidUtilities.dp(28.0f) + this.q.c;
            float dp5 = AndroidUtilities.dp(32.0f);
            float f27 = this.d;
            float f28 = this.g;
            float z11 = com.google.android.gms.internal.vision.e2.z(f28, dp4, 2.0f, f27);
            f7 = 11.32f;
            float f29 = this.e;
            f10 = 5.0f;
            float f30 = this.h;
            f11 = 17.0f;
            rectF.set(z11, com.google.android.gms.internal.vision.e2.z(f30, dp5, 2.0f, f29), org.telegram.messenger.q.a(f28, dp4, 2.0f, f27), org.telegram.messenger.q.a(f30, dp5, 2.0f, f29));
            path.rewind();
            float f31 = dp5 / 2.0f;
            path.addRoundRect(rectF, f31, f31, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(a2, a2, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
            canvas2.save();
            canvas2.clipPath(path);
            f12 = f22;
            c(canvas2, f12);
            canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(f12, 1342177280));
            path2 = path;
            this.q.c((((this.g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f12, -1, canvas2);
            canvas2.restore();
            if (u1Var.getDelegate() == null || !u1Var.getDelegate().i1(5, u1Var)) {
                ia0 ia0Var = this.k;
                if (ia0Var != null && !ia0Var.d() && !this.k.c()) {
                    this.k.a();
                }
            } else {
                ia0 ia0Var2 = this.k;
                if (ia0Var2 == null) {
                    ia0 ia0Var3 = new ia0();
                    this.k = ia0Var3;
                    ia0Var3.setCallback(u1Var);
                    this.k.g(org.telegram.ui.ActionBar.i6.m1(0.1f, -1), org.telegram.ui.ActionBar.i6.m1(0.3f, -1), org.telegram.ui.ActionBar.i6.m1(0.35f, -1), org.telegram.ui.ActionBar.i6.m1(0.8f, -1));
                    ia0 ia0Var4 = this.k;
                    ia0Var4.D = true;
                    ia0Var4.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else if (ia0Var2.c() || this.k.d()) {
                    ia0 ia0Var5 = this.k;
                    ia0Var5.b = -1L;
                    ia0Var5.c = -1L;
                }
            }
            ia0 ia0Var6 = this.k;
            if (ia0Var6 != null) {
                ia0Var6.e(rectF);
                this.k.k(f31);
                this.k.setAlpha((int) (f12 * 255.0f));
                this.k.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.r == null || f12 >= 1.0f || !a()) {
            return;
        }
        float timeAlpha = u1Var.getTimeAlpha() * (1.0f - f12);
        float dp6 = AndroidUtilities.dp(f7) + this.r.c;
        float dp7 = AndroidUtilities.dp(f11);
        float dp8 = AndroidUtilities.dp(f10);
        float f32 = this.d + this.g;
        float f33 = this.e + dp8;
        rectF.set((f32 - dp6) - dp8, f33, f32 - dp8, f33 + dp7);
        path2.rewind();
        float f34 = dp7 / 2.0f;
        path2.addRoundRect(rectF, f34, f34, Path.Direction.CW);
        canvas2.save();
        canvas2.clipPath(path2);
        canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(timeAlpha, TLObject.FLAG_30));
        this.r.c((((this.d + this.g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.e + dp8 + f34, timeAlpha, -1, canvas2);
        canvas.restore();
    }

    public final void c(Canvas canvas, float f7) {
        ArrayList arrayList;
        if (this.b == null) {
            return;
        }
        u1 u1Var = this.a;
        int id2 = u1Var.getMessageObject() != null ? u1Var.getMessageObject().getId() : 0;
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
            j4 j4Var = (j4) arrayList.get(i14);
            if (j4Var.f.hasImageSet() && j4Var.f.getBitmap() != null) {
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
                j4 j4Var2 = (j4) arrayList.get(i16);
                j4Var2.f.setImageCoords(j4Var2.a, j4Var2.b, j4Var2.c - r4, j4Var2.d - r7);
                j4Var2.f.draw(canvas2);
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

    public final j4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((j4) arrayList.get(i10)).f.isInsideImage(f7, f10)) {
                return (j4) arrayList.get(i10);
            }
            i10++;
        }
    }

    public final void e() {
        if (!this.C) {
            return;
        }
        this.C = false;
        vh.f fVar = this.l;
        if (fVar != null) {
            fVar.a(this.a);
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return;
            }
            j4 j4Var = (j4) arrayList.get(i10);
            if (j4Var.M) {
                j4Var.M = false;
                j4Var.f.onDetachedFromWindow();
            }
            i10++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        j4 j4Var;
        u1 u1Var;
        boolean z11;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            j4 d = d(x10, y3);
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
            j4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x10, y3)) {
                    z10 = true;
                    j4Var = this.o;
                    if (j4Var != null && j4Var == d10) {
                        u1Var = this.a;
                        if (u1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = u1Var.getMessageObject();
                            if (this.p || !z10 || d10.G.i.q != 3 || messageObject == null) {
                                l1 delegate = u1Var.getDelegate();
                                j4 j4Var2 = this.o;
                                ImageReceiver imageReceiver = j4Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.Z1(u1Var, messageExtendedMedia);
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
            j4Var = this.o;
            if (j4Var != null) {
                u1Var = this.a;
                if (u1Var.getDelegate() != null) {
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    if (this.p) {
                    }
                    l1 delegate2 = u1Var.getDelegate();
                    j4 j4Var22 = this.o;
                    ImageReceiver imageReceiver2 = j4Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = j4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.Z1(u1Var, messageExtendedMedia2);
                }
            }
            this.p = false;
            this.o = null;
        }
        this.n.c(this.o != null);
        return this.o != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:396:0x0763, code lost:
    
        if (r3[2] > r3[3]) goto L202;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0776  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i10;
        float[] fArr;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        MessageObject messageObject2;
        ArrayList arrayList;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        k4 k4Var = this;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            if (k4Var.b == null) {
                i4 i4Var = new i4();
                i4Var.a = new ArrayList();
                i4Var.b = new ArrayList();
                i4Var.c = new HashMap();
                i4Var.h = 800;
                i4Var.i = 814.0f;
                k4Var.b = i4Var;
            }
            k4Var.b.a.clear();
            k4Var.b.a.addAll(tL_messageMediaPaidMedia2.extended_media);
            i4 i4Var2 = k4Var.b;
            float f14 = i4Var2.i;
            ArrayList arrayList2 = i4Var2.b;
            arrayList2.clear();
            HashMap hashMap = i4Var2.c;
            hashMap.clear();
            boolean z10 = false;
            i4Var2.e = 0;
            ArrayList arrayList3 = i4Var2.a;
            int size = arrayList3.size();
            if (size == 0) {
                i4Var2.d = 0;
                i4Var2.g = 0.0f;
                i4Var2.f = 0;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                i10 = 10;
            } else {
                i4Var2.h = 800;
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                boolean z11 = false;
                float f15 = 1.0f;
                while (i13 < size) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) arrayList3.get(i13);
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                    groupedMessagePosition2.last = i13 == size + (-1) ? true : z10;
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
                        sb2.append("w");
                    } else if (f16 < 0.8f) {
                        sb2.append("n");
                    } else {
                        sb2.append("q");
                    }
                    float f17 = groupedMessagePosition2.aspectRatio;
                    f15 += f17;
                    if (f17 > 2.0f) {
                        z11 = true;
                    }
                    hashMap.put(messageExtendedMedia, groupedMessagePosition2);
                    arrayList2.add(groupedMessagePosition2);
                    i13++;
                    z10 = false;
                }
                float f18 = 1.0f;
                int dp = AndroidUtilities.dp(120.0f);
                float dp2 = AndroidUtilities.dp(120.0f);
                Point point = AndroidUtilities.displaySize;
                int min = (int) (dp2 / (Math.min(point.x, point.y) / i4Var2.h));
                float dp3 = AndroidUtilities.dp(40.0f);
                Point point2 = AndroidUtilities.displaySize;
                float min2 = Math.min(point2.x, point2.y);
                float f19 = i4Var2.h;
                int i14 = (int) (dp3 / (min2 / f19));
                float f20 = f19 / f14;
                float f21 = f15 / size;
                float dp4 = AndroidUtilities.dp(100.0f) / f14;
                if (size == 1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                    float f22 = groupedMessagePosition3.aspectRatio;
                    if (f22 >= 1.0f) {
                        f12 = i4Var2.h;
                        f13 = ((f12 / f22) / f12) * f14;
                    } else {
                        f12 = i4Var2.h * ((f22 * f14) / f14);
                        f13 = f14;
                    }
                    groupedMessagePosition3.set(0, 0, 0, 0, (int) f12, f13 / f14, 15);
                    tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                } else {
                    if (z11) {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                    } else {
                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                        if (size == 2 || size == 3 || size == 4) {
                            if (size == 2) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                String sb3 = sb2.toString();
                                if (sb3.equals("ww") && f21 > f20 * 1.4d) {
                                    float f23 = groupedMessagePosition4.aspectRatio;
                                    float f24 = groupedMessagePosition5.aspectRatio;
                                    if (f23 - f24 < 0.2d) {
                                        float f25 = i4Var2.h;
                                        float round = Math.round(Math.min(f25 / f23, Math.min(f25 / f24, f14 / 2.0f))) / f14;
                                        groupedMessagePosition4.set(0, 0, 0, 0, i4Var2.h, round, 7);
                                        groupedMessagePosition5.set(0, 0, 1, 1, i4Var2.h, round, 11);
                                    }
                                }
                                if (sb3.equals("ww") || sb3.equals("qq")) {
                                    int i15 = i4Var2.h / 2;
                                    float f26 = i15;
                                    float round2 = Math.round(Math.min(f26 / groupedMessagePosition4.aspectRatio, Math.min(f26 / groupedMessagePosition5.aspectRatio, f14))) / f14;
                                    groupedMessagePosition4.set(0, 0, 0, 0, i15, round2, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, i15, round2, 14);
                                    i4Var2.e = 1;
                                } else {
                                    float f27 = i4Var2.h;
                                    float f28 = groupedMessagePosition4.aspectRatio;
                                    int max = (int) Math.max(f27 * 0.4f, Math.round((f27 / f28) / ((1.0f / groupedMessagePosition5.aspectRatio) + (1.0f / f28))));
                                    int i16 = i4Var2.h - max;
                                    if (i16 < min) {
                                        max -= min - i16;
                                    } else {
                                        min = i16;
                                    }
                                    float min3 = Math.min(f14, Math.round(Math.min(min / groupedMessagePosition4.aspectRatio, max / groupedMessagePosition5.aspectRatio))) / f14;
                                    groupedMessagePosition4.set(0, 0, 0, 0, min, min3, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, max, min3, 14);
                                    i4Var2.e = 1;
                                }
                            } else if (size == 3) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                if (sb2.charAt(0) == 'n') {
                                    float f29 = groupedMessagePosition7.aspectRatio;
                                    float min4 = Math.min(f14 * 0.5f, Math.round((i4Var2.h * f29) / (groupedMessagePosition8.aspectRatio + f29)));
                                    float f30 = f14 - min4;
                                    int max2 = (int) Math.max(min, Math.min(i4Var2.h * 0.5f, Math.round(Math.min(groupedMessagePosition8.aspectRatio * min4, groupedMessagePosition7.aspectRatio * f30))));
                                    int round3 = Math.round(Math.min((groupedMessagePosition6.aspectRatio * f14) + i14, i4Var2.h - max2));
                                    groupedMessagePosition6.set(0, 0, 0, 1, round3, 1.0f, 13);
                                    float f31 = f30 / f14;
                                    groupedMessagePosition7.set(1, 1, 0, 0, max2, f31, 6);
                                    float f32 = min4 / f14;
                                    groupedMessagePosition8.set(1, 1, 1, 1, max2, f32, 10);
                                    int i17 = i4Var2.h;
                                    groupedMessagePosition8.spanSize = i17;
                                    groupedMessagePosition6.siblingHeights = new float[]{f32, f31};
                                    groupedMessagePosition7.spanSize = i17 - round3;
                                    groupedMessagePosition8.leftSpanOffset = round3;
                                    i4Var2.e = 1;
                                } else {
                                    float round4 = Math.round(Math.min(i4Var2.h / groupedMessagePosition6.aspectRatio, 0.66f * f14)) / f14;
                                    groupedMessagePosition6.set(0, 1, 0, 0, i4Var2.h, round4, 7);
                                    int i18 = i4Var2.h / 2;
                                    float f33 = i18;
                                    float min5 = Math.min(f14 - round4, Math.round(Math.min(f33 / groupedMessagePosition7.aspectRatio, f33 / groupedMessagePosition8.aspectRatio))) / f14;
                                    float f34 = min5 < dp4 ? dp4 : min5;
                                    groupedMessagePosition7.set(0, 0, 1, 1, i18, f34, 9);
                                    groupedMessagePosition8.set(1, 1, 1, 1, i18, f34, 10);
                                    i4Var2.e = 1;
                                }
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList2.get(3);
                                if (sb2.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(i4Var2.h / groupedMessagePosition9.aspectRatio, f14 * 0.66f)) / f14;
                                    groupedMessagePosition9.set(0, 2, 0, 0, i4Var2.h, round5, 7);
                                    float round6 = Math.round(i4Var2.h / ((groupedMessagePosition10.aspectRatio + groupedMessagePosition11.aspectRatio) + groupedMessagePosition12.aspectRatio));
                                    float f35 = min;
                                    int max3 = (int) Math.max(f35, Math.min(i4Var2.h * 0.4f, groupedMessagePosition10.aspectRatio * round6));
                                    int max4 = (int) Math.max(Math.max(f35, i4Var2.h * 0.33f), groupedMessagePosition12.aspectRatio * round6);
                                    int i19 = (i4Var2.h - max3) - max4;
                                    if (i19 < AndroidUtilities.dp(58.0f)) {
                                        int dp5 = AndroidUtilities.dp(58.0f) - i19;
                                        i19 = AndroidUtilities.dp(58.0f);
                                        int i20 = dp5 / 2;
                                        max3 -= i20;
                                        max4 -= dp5 - i20;
                                    }
                                    int i21 = max3;
                                    float min6 = Math.min(f14 - round5, round6) / f14;
                                    float f36 = min6 < dp4 ? dp4 : min6;
                                    groupedMessagePosition10.set(0, 0, 1, 1, i21, f36, 9);
                                    groupedMessagePosition11.set(1, 1, 1, 1, i19, f36, 8);
                                    groupedMessagePosition12.set(2, 2, 1, 1, max4, f36, 10);
                                    i4Var2.e = 2;
                                } else {
                                    int max5 = Math.max(min, Math.round(f14 / ((1.0f / groupedMessagePosition12.aspectRatio) + ((1.0f / groupedMessagePosition11.aspectRatio) + (1.0f / groupedMessagePosition10.aspectRatio)))));
                                    float f37 = dp;
                                    float f38 = max5;
                                    float min7 = Math.min(0.33f, Math.max(f37, f38 / groupedMessagePosition10.aspectRatio) / f14);
                                    float min8 = Math.min(0.33f, Math.max(f37, f38 / groupedMessagePosition11.aspectRatio) / f14);
                                    float f39 = (1.0f - min7) - min8;
                                    int round7 = Math.round(Math.min((groupedMessagePosition9.aspectRatio * f14) + i14, i4Var2.h - max5));
                                    groupedMessagePosition9.set(0, 0, 0, 2, round7, min7 + min8 + f39, 13);
                                    groupedMessagePosition10.set(1, 1, 0, 0, max5, min7, 6);
                                    groupedMessagePosition11.set(1, 1, 1, 1, max5, min8, 2);
                                    groupedMessagePosition11.spanSize = i4Var2.h;
                                    groupedMessagePosition12.set(1, 1, 2, 2, max5, f39, 10);
                                    int i22 = i4Var2.h;
                                    groupedMessagePosition12.spanSize = i22;
                                    groupedMessagePosition10.spanSize = i22 - round7;
                                    groupedMessagePosition11.leftSpanOffset = round7;
                                    groupedMessagePosition12.leftSpanOffset = round7;
                                    groupedMessagePosition9.siblingHeights = new float[]{min7, min8, f39};
                                    i4Var2.e = 1;
                                }
                            }
                        }
                    }
                    int size2 = arrayList2.size();
                    float[] fArr2 = new float[size2];
                    int i23 = 0;
                    while (i23 < size) {
                        if (f21 > 1.1f) {
                            f11 = f18;
                            fArr2[i23] = Math.max(f11, ((MessageObject.GroupedMessagePosition) arrayList2.get(i23)).aspectRatio);
                        } else {
                            f11 = f18;
                            fArr2[i23] = Math.min(f11, ((MessageObject.GroupedMessagePosition) arrayList2.get(i23)).aspectRatio);
                        }
                        fArr2[i23] = Math.max(0.66667f, Math.min(1.7f, fArr2[i23]));
                        i23++;
                        f18 = f11;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i24 = 1; i24 < size2; i24++) {
                        int i25 = size2 - i24;
                        if (i24 <= 3 && i25 <= 3) {
                            float a2 = i4Var2.a(fArr2, 0, i24);
                            float a10 = i4Var2.a(fArr2, i24, size2);
                            h4 h4Var = new h4();
                            h4Var.a = new int[]{i24, i25};
                            h4Var.b = new float[]{a2, a10};
                            arrayList4.add(h4Var);
                        }
                    }
                    int i26 = 1;
                    while (i26 < size2 - 1) {
                        int i27 = 1;
                        while (true) {
                            int i28 = size2 - i26;
                            if (i27 < i28) {
                                int i29 = i28 - i27;
                                if (i26 <= 3) {
                                    if (i27 <= (f21 < 0.85f ? 4 : 3) && i29 <= 3) {
                                        float a11 = i4Var2.a(fArr2, 0, i26);
                                        int i30 = i26 + i27;
                                        float a12 = i4Var2.a(fArr2, i26, i30);
                                        float a13 = i4Var2.a(fArr2, i30, size2);
                                        h4 h4Var2 = new h4();
                                        h4Var2.a = new int[]{i26, i27, i29};
                                        i12 = i26;
                                        h4Var2.b = new float[]{a11, a12, a13};
                                        arrayList4.add(h4Var2);
                                        i27++;
                                        i26 = i12;
                                    }
                                }
                                i12 = i26;
                                i27++;
                                i26 = i12;
                            }
                        }
                        i26++;
                    }
                    for (int i31 = 1; i31 < size2 - 2; i31++) {
                        int i32 = 1;
                        while (true) {
                            int i33 = size2 - i31;
                            if (i32 < i33) {
                                int i34 = 1;
                                while (true) {
                                    int i35 = i33 - i32;
                                    if (i34 < i35) {
                                        int i36 = i35 - i34;
                                        if (i31 > 3 || i32 > 3 || i34 > 3 || i36 > 3) {
                                            i11 = i33;
                                        } else {
                                            i11 = i33;
                                            float a14 = i4Var2.a(fArr2, 0, i31);
                                            int i37 = i31 + i32;
                                            float a15 = i4Var2.a(fArr2, i31, i37);
                                            int i38 = i37 + i34;
                                            float a16 = i4Var2.a(fArr2, i37, i38);
                                            float a17 = i4Var2.a(fArr2, i38, size2);
                                            h4 h4Var3 = new h4();
                                            h4Var3.a = new int[]{i31, i32, i34, i36};
                                            h4Var3.b = new float[]{a14, a15, a16, a17};
                                            arrayList4.add(h4Var3);
                                        }
                                        i34++;
                                        i33 = i11;
                                    }
                                }
                                i32++;
                            }
                        }
                    }
                    float f40 = (i4Var2.h / 3) * 4;
                    h4 h4Var4 = null;
                    float f41 = 0.0f;
                    int i39 = 0;
                    while (i39 < arrayList4.size()) {
                        h4 h4Var5 = (h4) arrayList4.get(i39);
                        float f42 = Float.MAX_VALUE;
                        float f43 = f40;
                        float f44 = 0.0f;
                        int i40 = 0;
                        while (true) {
                            float[] fArr3 = h4Var5.b;
                            fArr = fArr2;
                            if (i40 >= fArr3.length) {
                                break;
                            }
                            float f45 = fArr3[i40];
                            f44 += f45;
                            if (f45 < f42) {
                                f42 = f45;
                            }
                            i40++;
                            fArr2 = fArr;
                        }
                        float abs = Math.abs(f44 - f43);
                        int[] iArr = h4Var5.a;
                        if (iArr.length > 1) {
                            int i41 = iArr[0];
                            int i42 = iArr[1];
                            if (i41 <= i42) {
                                f7 = abs;
                                if (iArr.length <= 2 || i42 <= iArr[2]) {
                                    if (iArr.length > 3) {
                                    }
                                }
                            } else {
                                f7 = abs;
                            }
                            f10 = f7 * 1.2f;
                            if (f42 < min) {
                                f10 *= 1.5f;
                            }
                            if (h4Var4 != null || f10 < f41) {
                                f41 = f10;
                                h4Var4 = h4Var5;
                            }
                            i39++;
                            f40 = f43;
                            fArr2 = fArr;
                        } else {
                            f7 = abs;
                        }
                        f10 = f7;
                        if (f42 < min) {
                        }
                        if (h4Var4 != null) {
                        }
                        f41 = f10;
                        h4Var4 = h4Var5;
                        i39++;
                        f40 = f43;
                        fArr2 = fArr;
                    }
                    float[] fArr4 = fArr2;
                    if (h4Var4 == null) {
                        i10 = 10;
                        k4Var = this;
                    } else {
                        int[] iArr2 = h4Var4.a;
                        int i43 = 0;
                        int i44 = 0;
                        while (i43 < iArr2.length) {
                            int i45 = iArr2[i43];
                            float f46 = h4Var4.b[i43];
                            int i46 = i4Var2.h;
                            int i47 = i45 - 1;
                            i4Var2.e = Math.max(i4Var2.e, i47);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = null;
                            int i48 = 0;
                            while (i48 < i45) {
                                int i49 = (int) (fArr4[i44] * f46);
                                i46 -= i49;
                                MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i44);
                                int i50 = i43 == 0 ? 4 : 0;
                                h4 h4Var6 = h4Var4;
                                if (i43 == iArr2.length - 1) {
                                    i50 |= 8;
                                }
                                if (i48 == 0) {
                                    i50 |= 1;
                                }
                                if (i48 == i47) {
                                    i50 |= 2;
                                    groupedMessagePosition13 = groupedMessagePosition14;
                                }
                                int i51 = i48;
                                groupedMessagePosition14.set(i51, i48, i43, i43, i49, Math.max(dp4, f46 / f14), i50);
                                i44++;
                                i48 = i51 + 1;
                                h4Var4 = h4Var6;
                            }
                            groupedMessagePosition13.pw += i46;
                            groupedMessagePosition13.spanSize += i46;
                            i43++;
                            h4Var4 = h4Var4;
                        }
                    }
                }
                for (int i52 = 0; i52 < size; i52++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i52);
                    if (groupedMessagePosition15.maxX == i4Var2.e || (groupedMessagePosition15.flags & 2) != 0) {
                        groupedMessagePosition15.spanSize += 200;
                    }
                    if ((groupedMessagePosition15.flags & 1) != 0) {
                        groupedMessagePosition15.edge = true;
                    }
                    if (groupedMessagePosition15.edge) {
                        int i53 = groupedMessagePosition15.spanSize;
                        if (i53 != 1000) {
                            groupedMessagePosition15.spanSize = i53 + 108;
                        }
                        groupedMessagePosition15.pw += 108;
                    } else if ((groupedMessagePosition15.flags & 2) != 0) {
                        int i54 = groupedMessagePosition15.spanSize;
                        if (i54 != 1000) {
                            groupedMessagePosition15.spanSize = i54 - 108;
                        } else {
                            int i55 = groupedMessagePosition15.leftSpanOffset;
                            if (i55 != 0) {
                                groupedMessagePosition15.leftSpanOffset = i55 + 108;
                            }
                        }
                    }
                }
                int i56 = 0;
                while (i56 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList2.get(i56);
                    if (groupedMessagePosition16.minX == 0) {
                        groupedMessagePosition16.spanSize += 200;
                    }
                    if ((groupedMessagePosition16.flags & 2) != 0) {
                        groupedMessagePosition16.edge = true;
                    }
                    i4Var2.e = Math.max(i4Var2.e, (int) groupedMessagePosition16.maxX);
                    i4Var2.f = Math.max(i4Var2.f, (int) groupedMessagePosition16.maxY);
                    byte b10 = groupedMessagePosition16.minY;
                    byte b11 = groupedMessagePosition16.maxY;
                    byte b12 = groupedMessagePosition16.minX;
                    int i57 = (b11 - b10) + 1;
                    float[] fArr5 = new float[i57];
                    Arrays.fill(fArr5, 0.0f);
                    int size3 = arrayList2.size();
                    int i58 = 0;
                    while (i58 < size3) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList2.get(i58);
                        if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxX < b12) {
                            int min9 = Math.min((int) groupedMessagePosition17.maxY, (int) b11) - b10;
                            int max6 = Math.max(groupedMessagePosition17.minY - b10, 0);
                            while (max6 <= min9) {
                                fArr5[max6] = fArr5[max6] + groupedMessagePosition17.pw;
                                max6++;
                                i56 = i56;
                            }
                        }
                        i58++;
                        i56 = i56;
                    }
                    int i59 = i56;
                    float f47 = 0.0f;
                    for (int i60 = 0; i60 < i57; i60++) {
                        float f48 = fArr5[i60];
                        if (f47 < f48) {
                            f47 = f48;
                        }
                    }
                    groupedMessagePosition16.left = f47;
                    i56 = i59 + 1;
                }
                for (int i61 = 0; i61 < size; i61++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList2.get(i61);
                    byte b13 = groupedMessagePosition18.minY;
                    int i62 = i4Var2.e + 1;
                    float[] fArr6 = new float[i62];
                    Arrays.fill(fArr6, 0.0f);
                    int size4 = arrayList2.size();
                    for (int i63 = 0; i63 < size4; i63++) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList2.get(i63);
                        if (groupedMessagePosition19 != groupedMessagePosition18 && groupedMessagePosition19.maxY < b13) {
                            for (int i64 = groupedMessagePosition19.minX; i64 <= groupedMessagePosition19.maxX; i64++) {
                                fArr6[i64] = fArr6[i64] + groupedMessagePosition19.ph;
                            }
                        }
                    }
                    float f49 = 0.0f;
                    for (int i65 = 0; i65 < i62; i65++) {
                        float f50 = fArr6[i65];
                        if (f49 < f50) {
                            f49 = f50;
                        }
                    }
                    groupedMessagePosition18.top = f49;
                }
                int[] iArr3 = new int[10];
                Arrays.fill(iArr3, 0);
                int size5 = arrayList2.size();
                for (int i66 = 0; i66 < size5; i66++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition20 = (MessageObject.GroupedMessagePosition) arrayList2.get(i66);
                    int i67 = groupedMessagePosition20.pw;
                    for (int i68 = groupedMessagePosition20.minY; i68 <= groupedMessagePosition20.maxY; i68++) {
                        iArr3[i68] = iArr3[i68] + i67;
                    }
                }
                int i69 = iArr3[0];
                for (int i70 = 1; i70 < 10; i70++) {
                    int i71 = iArr3[i70];
                    if (i69 < i71) {
                        i69 = i71;
                    }
                }
                i4Var2.d = i69;
                float[] fArr7 = new float[10];
                Arrays.fill(fArr7, 0.0f);
                int size6 = arrayList2.size();
                for (int i72 = 0; i72 < size6; i72++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition21 = (MessageObject.GroupedMessagePosition) arrayList2.get(i72);
                    float f51 = groupedMessagePosition21.ph;
                    for (int i73 = groupedMessagePosition21.minX; i73 <= groupedMessagePosition21.maxX; i73++) {
                        fArr7[i73] = fArr7[i73] + f51;
                    }
                }
                float f52 = fArr7[0];
                i10 = 10;
                for (int i74 = 1; i74 < 10; i74++) {
                    float f53 = fArr7[i74];
                    if (f52 < f53) {
                        f52 = f53;
                    }
                }
                i4Var2.g = f52;
                k4Var = this;
            }
            int i75 = k4Var.m;
            u1 u1Var = k4Var.a;
            if (i75 > 0) {
                k4Var.f = i75;
                messageObject2 = messageObject;
            } else {
                if (AndroidUtilities.isTablet()) {
                    k4Var.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                    messageObject2 = messageObject;
                } else {
                    messageObject2 = messageObject;
                    k4Var.f = Math.min(u1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((u1Var.M0(messageObject2) ? i10 : 0) + 64);
                }
                if (u1Var.z3()) {
                    k4Var.f -= AndroidUtilities.dp(52.0f);
                }
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = tL_messageMediaPaidMedia;
            int i76 = 0;
            while (true) {
                int size7 = tL_messageMediaPaidMedia3.extended_media.size();
                arrayList = k4Var.c;
                if (i76 >= size7) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia3.extended_media.get(i76);
                j4 j4Var = i76 >= arrayList.size() ? null : (j4) arrayList.get(i76);
                if (j4Var == null) {
                    i4 i4Var3 = k4Var.b;
                    if (messageExtendedMedia2 == null) {
                        i4Var3.getClass();
                        groupedMessagePosition = null;
                    } else {
                        groupedMessagePosition = (MessageObject.GroupedMessagePosition) i4Var3.c.get(messageExtendedMedia2);
                    }
                    j4 j4Var2 = new j4(k4Var.a, messageObject2, messageExtendedMedia2, tL_messageMediaPaidMedia3.extended_media.size() != 1, (int) ((groupedMessagePosition.pw / 1000.0f) * k4Var.f), (int) (groupedMessagePosition.ph * k4Var.b.i));
                    String str = messageExtendedMedia2.attachPath;
                    if (str != null) {
                        j4Var2.F = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        j4Var2.F = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(j4Var2.F)) {
                        DownloadController.getInstance(u1Var.I7).addLoadingFileObserver(j4Var2.F, messageObject2, j4Var2);
                        if (messageObject2.isSending()) {
                            j4Var2.G.o(messageExtendedMedia2.uploadProgress, false);
                        }
                    }
                    if (u1Var.M0 && !j4Var2.M) {
                        j4Var2.M = true;
                        j4Var2.f.onAttachedToWindow();
                    }
                    arrayList.add(j4Var2);
                } else {
                    j4Var.c(messageExtendedMedia2, messageObject2);
                }
                i76++;
            }
            int size8 = tL_messageMediaPaidMedia3.extended_media.size();
            while (size8 < arrayList.size()) {
                j4 j4Var3 = size8 >= arrayList.size() ? null : (j4) arrayList.get(size8);
                if (j4Var3 != null) {
                    if (j4Var3.M) {
                        j4Var3.M = false;
                        j4Var3.f.onDetachedFromWindow();
                    }
                    arrayList.remove(size8);
                    size8--;
                }
                size8++;
            }
            h(messageObject);
            i4 i4Var4 = k4Var.b;
            k4Var.g = (int) ((i4Var4.d / 1000.0f) * k4Var.f);
            k4Var.h = (int) (i4Var4.g * i4Var4.i);
            if (k4Var.i) {
                l11 l11Var = new l11(yh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                k4Var.q = l11Var;
                if (l11Var.c > k4Var.g - AndroidUtilities.dp(30.0f)) {
                    k4Var.q = new l11(yh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
            if (k4Var.r == null || k4Var.s != tL_messageMediaPaidMedia3.stars_amount) {
                long j3 = tL_messageMediaPaidMedia3.stars_amount;
                k4Var.s = j3;
                k4Var.r = new l11(yh.p7.S0(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j3), 0.9f, null), 12.0f, AndroidUtilities.bold());
            }
        }
    }

    public final void h(MessageObject messageObject) {
        float f7;
        boolean z10;
        boolean z11;
        int i10;
        u1 u1Var = this.a;
        boolean z12 = false;
        boolean z13 = u1Var.Lc > 0 || (u1Var.u1 && !TextUtils.isEmpty(messageObject.caption));
        boolean z14 = ((u1Var.u1 || TextUtils.isEmpty(messageObject.caption)) && u1Var.N.s && !u1Var.j9) ? false : true;
        int i11 = this.m;
        float f10 = 1000.0f;
        if (i11 > 0) {
            f7 = 1000.0f / this.b.d;
            this.f = i11;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                this.f = Math.min(u1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((u1Var.M0(messageObject) ? 10 : 0) + 64);
            }
            if (u1Var.z3()) {
                this.f -= AndroidUtilities.dp(52.0f);
            }
            f7 = 1.0f;
        }
        i4 i4Var = this.b;
        this.g = (int) ((i4Var.d / 1000.0f) * f7 * this.f);
        this.h = (int) (i4Var.g * i4Var.i);
        this.i = false;
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        char c10 = 2;
        int dp3 = AndroidUtilities.dp(r11 - (SharedConfig.bubbleRadius > 2 ? 2 : 0));
        int min = Math.min(AndroidUtilities.dp(3.0f), dp3);
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            float f11 = f10;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i12 >= arrayList.size()) {
                break;
            }
            j4 j4Var = (j4) arrayList.get(i12);
            i4 i4Var2 = this.b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var.E;
            boolean z15 = z12;
            ImageReceiver imageReceiver = j4Var.f;
            if (messageExtendedMedia == null) {
                i4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) i4Var2.c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z10 = z13;
                z11 = z14;
                i10 = dp;
            } else {
                float f12 = (groupedMessagePosition.left / f11) * f7;
                float f13 = this.f;
                int i13 = (int) (f12 * f13);
                z10 = z13;
                float f14 = groupedMessagePosition.top;
                float f15 = this.b.i;
                int i14 = (int) (f14 * f15);
                int i15 = (int) ((groupedMessagePosition.pw / f11) * f7 * f13);
                int i16 = (int) (groupedMessagePosition.ph * f15);
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
                z11 = z14;
                int i22 = i20;
                j4Var.a = i13;
                j4Var.b = i19;
                i10 = dp;
                j4Var.c = i13 + i21;
                j4Var.d = i19 + i22;
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
                if (!z10 && u1Var.E) {
                    if (messageObject.isOutOwner()) {
                        i26 = min;
                    } else {
                        i25 = min;
                    }
                }
                imageReceiver.setRoundRadius(i25, i26, i29, i28);
                float[] fArr = j4Var.s;
                float f16 = i25;
                fArr[1] = f16;
                fArr[z15 ? 1 : 0] = f16;
                float f17 = i26;
                fArr[3] = f17;
                fArr[c11] = f17;
                float f18 = i29;
                fArr[5] = f18;
                fArr[4] = f18;
                float f19 = i28;
                fArr[7] = f19;
                fArr[6] = f19;
                if (messageObject != null && messageObject.isSending()) {
                    j4Var.b(3);
                }
                this.i = (this.i || j4Var.h) ? true : z15 ? 1 : 0;
            }
            i12++;
            f10 = f11;
            c10 = c11;
            z12 = z15 ? 1 : 0;
            z13 = z10;
            dp = i10;
            z14 = z11;
        }
        boolean z16 = z12;
        if (this.i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = messageObject == null ? null : (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia != null) {
                l11 l11Var = new l11(yh.p7.Y0(z16, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.q = l11Var;
                if (l11Var.c > this.g - AndroidUtilities.dp(30.0f)) {
                    this.q = new l11(yh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
