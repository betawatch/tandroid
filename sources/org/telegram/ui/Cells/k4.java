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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k4 {
    public int A;
    public int B;
    public boolean C;
    public final t1 a;
    public i4 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final org.telegram.ui.Components.y5 j;
    public p80 k;
    public final dh.k l;
    public int m;
    public final pc n;
    public j4 o;
    public boolean p;
    public nz0 q;
    public nz0 r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public k4(t1 t1Var) {
        this.a = t1Var;
        this.l = dh.k.e(t1Var);
        this.j = new org.telegram.ui.Components.y5(t1Var, 0L, 350L, gr.h);
        this.n = new pc(t1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (!((j4) obj).f.getVisible()) {
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
        boolean z10 = this.i;
        org.telegram.ui.Components.y5 y5Var = this.j;
        float e10 = y5Var.e(z10);
        float e11 = y5Var.e(this.i);
        t1 t1Var2 = this.a;
        MessageObject messageObject = t1Var2.getMessageObject();
        Path path3 = this.u;
        path3.rewind();
        float f15 = Float.MAX_VALUE;
        float f16 = Float.MAX_VALUE;
        float f17 = Float.MIN_VALUE;
        float f18 = Float.MIN_VALUE;
        int i9 = 0;
        while (true) {
            arrayList = this.c;
            if (i9 >= arrayList.size()) {
                break;
            }
            j4 j4Var = (j4) arrayList.get(i9);
            ImageReceiver imageReceiver = j4Var.f;
            RadialProgress2 radialProgress2 = j4Var.C;
            int i10 = this.d;
            int i11 = j4Var.a;
            float f19 = e10;
            int i12 = this.e;
            int i13 = j4Var.b;
            float f20 = e11;
            t1 t1Var3 = t1Var2;
            imageReceiver.setImageCoords(i10 + i11, i12 + i13, j4Var.c - i11, j4Var.d - i13);
            imageReceiver.draw(canvas2);
            if (imageReceiver.getAnimation() != null) {
                imageReceiver.getAnimation().getClass();
                int round = Math.round(0 / 1000.0f);
                if (!j4Var.x && j4Var.G != (max = Math.max(0, j4Var.F - round))) {
                    j4Var.G = max;
                    j4Var.H = new nz0(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                }
            }
            if (f20 > 0.0f) {
                float min = Math.min(this.d + j4Var.a, f16);
                float min2 = Math.min(this.e + j4Var.b, f15);
                f18 = Math.max(this.d + j4Var.c, f18);
                f17 = Math.max(this.e + j4Var.d, f17);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f21 = j4Var.a + this.d;
                int i14 = this.e;
                rectF2.set(f21, j4Var.b + i14, r9 + j4Var.c, i14 + j4Var.d);
                path3.addRoundRect(rectF2, j4Var.s, Path.Direction.CW);
                f15 = min2;
                f16 = min;
            }
            radialProgress2.g(org.telegram.ui.ActionBar.f6.le, org.telegram.ui.ActionBar.f6.me, org.telegram.ui.ActionBar.f6.ne, org.telegram.ui.ActionBar.f6.oe);
            RectF rectF3 = radialProgress2.a;
            float f22 = f15;
            rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.x + imageReceiver.getImageY());
            if (messageObject.isSending()) {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(j4Var.B);
                boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i9);
                if (fileProgressSizes == null && isSendingPaidMessage) {
                    radialProgress2.o(1.0f, true);
                    j4Var.b(j4Var.w ? 6 : j4Var.a());
                }
            } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(j4Var.v)) {
                j4Var.b(3);
            } else {
                j4Var.b(j4Var.a());
            }
            canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f20) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i9++;
            f15 = f22;
            e10 = f19;
            t1Var2 = t1Var3;
            e11 = f20;
        }
        float f23 = e10;
        float f24 = e11;
        t1 t1Var4 = t1Var2;
        if (f24 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path3);
            canvas2.translate(f16, f15);
            int i15 = (int) (f18 - f16);
            int i16 = (int) (f17 - f15);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i15, i16, (int) (f24 * 255.0f), 31);
            this.l.c(canvas, t1Var4, i15, i16, 1.0f, t1Var4.ke);
            canvas2 = canvas;
            t1Var = t1Var4;
            canvas2.restore();
            canvas2.restore();
            t1Var.invalidate();
        } else {
            t1Var = t1Var4;
        }
        int i17 = 0;
        while (true) {
            int size = arrayList.size();
            rectF = this.v;
            path = this.t;
            if (i17 >= size) {
                break;
            }
            j4 j4Var2 = (j4) arrayList.get(i17);
            if (j4Var2.H != null) {
                float dp = AndroidUtilities.dp(11.4f) + j4Var2.H.c;
                float dp2 = AndroidUtilities.dp(17.0f);
                float dp3 = AndroidUtilities.dp(5.0f);
                float f25 = this.d + j4Var2.a + dp3;
                float f26 = this.e + j4Var2.b + dp3;
                rectF.set(f25, f26, dp + f25, f26 + dp2);
                if (this.r == null || rectF.right <= ((this.d + this.g) - (AndroidUtilities.dp(11.32f) + this.r.c)) - dp3 || rectF.top > this.e + dp3) {
                    path.rewind();
                    float f27 = dp2 / 2.0f;
                    path.addRoundRect(rectF, f27, f27, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f14 = f24;
                    c(canvas2, f14);
                    canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(1.0f, TLObject.FLAG_30));
                    j4Var2.H.c(this.d + j4Var2.a + dp3 + AndroidUtilities.dp(5.66f), this.e + j4Var2.b + dp3 + f27, 1.0f, -1, canvas2);
                    canvas2.restore();
                    i17++;
                    f24 = f14;
                }
            }
            f14 = f24;
            i17++;
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
            float A = e2.c.A(f29, dp4, 2.0f, f28);
            f11 = 11.32f;
            float f30 = this.e;
            f12 = 5.0f;
            float f31 = this.h;
            f13 = 17.0f;
            rectF.set(A, e2.c.A(f31, dp5, 2.0f, f30), j3.r0.c(f29, dp4, 2.0f, f28), j3.r0.c(f31, dp5, 2.0f, f30));
            path.rewind();
            float f32 = dp5 / 2.0f;
            path.addRoundRect(rectF, f32, f32, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(a2, a2, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
            canvas2.save();
            canvas2.clipPath(path);
            f10 = f23;
            c(canvas2, f10);
            canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(f10, 1342177280));
            path2 = path;
            this.q.c((((this.g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f10, -1, canvas2);
            canvas2.restore();
            if (t1Var.getDelegate() == null || !t1Var.getDelegate().Y0(5, t1Var)) {
                p80 p80Var = this.k;
                if (p80Var != null && !p80Var.c() && !this.k.b()) {
                    this.k.a();
                }
            } else {
                p80 p80Var2 = this.k;
                if (p80Var2 == null) {
                    p80 p80Var3 = new p80();
                    this.k = p80Var3;
                    p80Var3.setCallback(t1Var);
                    this.k.f(org.telegram.ui.ActionBar.f6.l1(0.1f, -1), org.telegram.ui.ActionBar.f6.l1(0.3f, -1), org.telegram.ui.ActionBar.f6.l1(0.35f, -1), org.telegram.ui.ActionBar.f6.l1(0.8f, -1));
                    p80 p80Var4 = this.k;
                    p80Var4.C = true;
                    p80Var4.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else if (p80Var2.b() || this.k.c()) {
                    p80 p80Var5 = this.k;
                    p80Var5.b = -1L;
                    p80Var5.c = -1L;
                }
            }
            p80 p80Var6 = this.k;
            if (p80Var6 != null) {
                p80Var6.d(rectF);
                this.k.j(f32);
                this.k.setAlpha((int) (f10 * 255.0f));
                this.k.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.r == null || f10 >= 1.0f || !a()) {
            return;
        }
        float timeAlpha = t1Var.getTimeAlpha() * (1.0f - f10);
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
        canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(timeAlpha, TLObject.FLAG_30));
        this.r.c((((this.d + this.g) - dp6) - dp8) + AndroidUtilities.dp(5.66f), this.e + dp8 + f35, timeAlpha, -1, canvas2);
        canvas.restore();
    }

    public final void c(Canvas canvas, float f10) {
        ArrayList arrayList;
        if (this.b == null) {
            return;
        }
        t1 t1Var = this.a;
        int id2 = t1Var.getMessageObject() != null ? t1Var.getMessageObject().getId() : 0;
        int i9 = this.g;
        int i10 = this.h;
        int max = (int) Math.max(1.0f, i9 > i10 ? 100.0f : (i9 / i10) * 100.0f);
        int i11 = this.h;
        int i12 = this.g;
        int max2 = (int) Math.max(1.0f, i11 <= i12 ? 100.0f * (i11 / i12) : 100.0f);
        int i13 = 0;
        int i14 = 0;
        while (true) {
            arrayList = this.c;
            if (i13 >= arrayList.size()) {
                break;
            }
            j4 j4Var = (j4) arrayList.get(i13);
            if (j4Var.f.hasImageSet() && j4Var.f.getBitmap() != null) {
                i14 |= 1 << i13;
            }
            i13++;
        }
        Bitmap bitmap = this.w;
        if (bitmap == null || this.z != id2 || this.y != i14 || this.A != max || this.B != max2) {
            this.y = i14;
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
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                j4 j4Var2 = (j4) arrayList.get(i15);
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
            this.x.setAlpha((int) (f10 * 255.0f));
            canvas.drawBitmap(this.w, 0.0f, 0.0f, this.x);
            canvas.restore();
        }
    }

    public final j4 d(float f10, float f11) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i9 >= arrayList.size()) {
                return null;
            }
            if (((j4) arrayList.get(i9)).f.isInsideImage(f10, f11)) {
                return (j4) arrayList.get(i9);
            }
            i9++;
        }
    }

    public final void e() {
        if (!this.C) {
            return;
        }
        this.C = false;
        dh.k kVar = this.l;
        if (kVar != null) {
            kVar.a(this.a);
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i9 >= arrayList.size()) {
                return;
            }
            j4 j4Var = (j4) arrayList.get(i9);
            if (j4Var.I) {
                j4Var.I = false;
                j4Var.f.onDetachedFromWindow();
            }
            i9++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        j4 j4Var;
        t1 t1Var;
        boolean z11;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            j4 d = d(x10, y10);
            this.o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.C;
                if (radialProgress2.i.q != 4 && radialProgress2.a.contains(x10, y10)) {
                    z11 = true;
                    this.p = z11;
                }
            }
            z11 = false;
            this.p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            j4 d9 = d(x10, y10);
            if (d9 != null) {
                RadialProgress2 radialProgress22 = d9.C;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x10, y10)) {
                    z10 = true;
                    j4Var = this.o;
                    if (j4Var != null && j4Var == d9) {
                        t1Var = this.a;
                        if (t1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = t1Var.getMessageObject();
                            if (this.p || !z10 || d9.C.i.q != 3 || messageObject == null) {
                                k1 delegate = t1Var.getDelegate();
                                j4 j4Var2 = this.o;
                                ImageReceiver imageReceiver = j4Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var2.A;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.L1(t1Var, messageExtendedMedia);
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
                t1Var = this.a;
                if (t1Var.getDelegate() != null) {
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    if (this.p) {
                    }
                    k1 delegate2 = t1Var.getDelegate();
                    j4 j4Var22 = this.o;
                    ImageReceiver imageReceiver2 = j4Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = j4Var22.A;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.L1(t1Var, messageExtendedMedia2);
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
        int i9;
        int i10;
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
            i4Var2.e = 0;
            ArrayList arrayList3 = i4Var2.a;
            int size = arrayList3.size();
            if (size == 0) {
                i4Var2.d = 0;
                i4Var2.g = 0.0f;
                i4Var2.f = 0;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
            } else {
                i4Var2.h = 800;
                StringBuilder sb2 = new StringBuilder();
                int i11 = 0;
                float f15 = 1.0f;
                boolean z10 = false;
                while (i11 < size) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) arrayList3.get(i11);
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                    groupedMessagePosition2.last = i11 == size + (-1);
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
                        z10 = true;
                    }
                    hashMap.put(messageExtendedMedia, groupedMessagePosition2);
                    arrayList2.add(groupedMessagePosition2);
                    i11++;
                }
                int dp = AndroidUtilities.dp(120.0f);
                float dp2 = AndroidUtilities.dp(120.0f);
                Point point = AndroidUtilities.displaySize;
                int min = (int) (dp2 / (Math.min(point.x, point.y) / i4Var2.h));
                float dp3 = AndroidUtilities.dp(40.0f);
                Point point2 = AndroidUtilities.displaySize;
                float min2 = Math.min(point2.x, point2.y);
                float f18 = i4Var2.h;
                int i12 = (int) (dp3 / (min2 / f18));
                float f19 = f18 / f14;
                float f20 = f15 / size;
                float dp4 = AndroidUtilities.dp(100.0f) / f14;
                if (size == 1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                    float f21 = groupedMessagePosition3.aspectRatio;
                    if (f21 >= 1.0f) {
                        f12 = i4Var2.h;
                        f13 = ((f12 / f21) / f12) * f14;
                    } else {
                        f12 = i4Var2.h * ((f21 * f14) / f14);
                        f13 = f14;
                    }
                    groupedMessagePosition3.set(0, 0, 0, 0, (int) f12, f13 / f14, 15);
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
                                if (sb3.equals("ww") && f20 > f19 * 1.4d) {
                                    float f22 = groupedMessagePosition4.aspectRatio;
                                    float f23 = groupedMessagePosition5.aspectRatio;
                                    if (f22 - f23 < 0.2d) {
                                        float f24 = i4Var2.h;
                                        float round = Math.round(Math.min(f24 / f22, Math.min(f24 / f23, f14 / 2.0f))) / f14;
                                        groupedMessagePosition4.set(0, 0, 0, 0, i4Var2.h, round, 7);
                                        groupedMessagePosition5.set(0, 0, 1, 1, i4Var2.h, round, 11);
                                    }
                                }
                                if (sb3.equals("ww") || sb3.equals("qq")) {
                                    int i13 = i4Var2.h / 2;
                                    float f25 = i13;
                                    float round2 = Math.round(Math.min(f25 / groupedMessagePosition4.aspectRatio, Math.min(f25 / groupedMessagePosition5.aspectRatio, f14))) / f14;
                                    groupedMessagePosition4.set(0, 0, 0, 0, i13, round2, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, i13, round2, 14);
                                    i4Var2.e = 1;
                                } else {
                                    float f26 = i4Var2.h;
                                    float f27 = groupedMessagePosition4.aspectRatio;
                                    int max = (int) Math.max(f26 * 0.4f, Math.round((f26 / f27) / ((1.0f / groupedMessagePosition5.aspectRatio) + (1.0f / f27))));
                                    int i14 = i4Var2.h - max;
                                    if (i14 < min) {
                                        max -= min - i14;
                                    } else {
                                        min = i14;
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
                                    float f28 = groupedMessagePosition7.aspectRatio;
                                    float min4 = Math.min(f14 * 0.5f, Math.round((i4Var2.h * f28) / (groupedMessagePosition8.aspectRatio + f28)));
                                    float f29 = f14 - min4;
                                    int max2 = (int) Math.max(min, Math.min(i4Var2.h * 0.5f, Math.round(Math.min(groupedMessagePosition8.aspectRatio * min4, groupedMessagePosition7.aspectRatio * f29))));
                                    int round3 = Math.round(Math.min((groupedMessagePosition6.aspectRatio * f14) + i12, i4Var2.h - max2));
                                    groupedMessagePosition6.set(0, 0, 0, 1, round3, 1.0f, 13);
                                    float f30 = f29 / f14;
                                    groupedMessagePosition7.set(1, 1, 0, 0, max2, f30, 6);
                                    float f31 = min4 / f14;
                                    groupedMessagePosition8.set(1, 1, 1, 1, max2, f31, 10);
                                    int i15 = i4Var2.h;
                                    groupedMessagePosition8.spanSize = i15;
                                    groupedMessagePosition6.siblingHeights = new float[]{f31, f30};
                                    groupedMessagePosition7.spanSize = i15 - round3;
                                    groupedMessagePosition8.leftSpanOffset = round3;
                                    i4Var2.e = 1;
                                } else {
                                    float round4 = Math.round(Math.min(i4Var2.h / groupedMessagePosition6.aspectRatio, 0.66f * f14)) / f14;
                                    groupedMessagePosition6.set(0, 1, 0, 0, i4Var2.h, round4, 7);
                                    int i16 = i4Var2.h / 2;
                                    float f32 = i16;
                                    float min5 = Math.min(f14 - round4, Math.round(Math.min(f32 / groupedMessagePosition7.aspectRatio, f32 / groupedMessagePosition8.aspectRatio))) / f14;
                                    float f33 = min5 < dp4 ? dp4 : min5;
                                    groupedMessagePosition7.set(0, 0, 1, 1, i16, f33, 9);
                                    groupedMessagePosition8.set(1, 1, 1, 1, i16, f33, 10);
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
                                    float f34 = min;
                                    int max3 = (int) Math.max(f34, Math.min(i4Var2.h * 0.4f, groupedMessagePosition10.aspectRatio * round6));
                                    int max4 = (int) Math.max(Math.max(f34, i4Var2.h * 0.33f), groupedMessagePosition12.aspectRatio * round6);
                                    int i17 = (i4Var2.h - max3) - max4;
                                    if (i17 < AndroidUtilities.dp(58.0f)) {
                                        int dp5 = AndroidUtilities.dp(58.0f) - i17;
                                        i17 = AndroidUtilities.dp(58.0f);
                                        int i18 = dp5 / 2;
                                        max3 -= i18;
                                        max4 -= dp5 - i18;
                                    }
                                    int i19 = max3;
                                    float min6 = Math.min(f14 - round5, round6) / f14;
                                    float f35 = min6 < dp4 ? dp4 : min6;
                                    groupedMessagePosition10.set(0, 0, 1, 1, i19, f35, 9);
                                    groupedMessagePosition11.set(1, 1, 1, 1, i17, f35, 8);
                                    groupedMessagePosition12.set(2, 2, 1, 1, max4, f35, 10);
                                    i4Var2.e = 2;
                                } else {
                                    int max5 = Math.max(min, Math.round(f14 / ((1.0f / groupedMessagePosition12.aspectRatio) + ((1.0f / groupedMessagePosition11.aspectRatio) + (1.0f / groupedMessagePosition10.aspectRatio)))));
                                    float f36 = dp;
                                    float f37 = max5;
                                    float min7 = Math.min(0.33f, Math.max(f36, f37 / groupedMessagePosition10.aspectRatio) / f14);
                                    float min8 = Math.min(0.33f, Math.max(f36, f37 / groupedMessagePosition11.aspectRatio) / f14);
                                    float f38 = (1.0f - min7) - min8;
                                    int round7 = Math.round(Math.min((groupedMessagePosition9.aspectRatio * f14) + i12, i4Var2.h - max5));
                                    groupedMessagePosition9.set(0, 0, 0, 2, round7, min7 + min8 + f38, 13);
                                    groupedMessagePosition10.set(1, 1, 0, 0, max5, min7, 6);
                                    groupedMessagePosition11.set(1, 1, 1, 1, max5, min8, 2);
                                    groupedMessagePosition11.spanSize = i4Var2.h;
                                    groupedMessagePosition12.set(1, 1, 2, 2, max5, f38, 10);
                                    int i20 = i4Var2.h;
                                    groupedMessagePosition12.spanSize = i20;
                                    groupedMessagePosition10.spanSize = i20 - round7;
                                    groupedMessagePosition11.leftSpanOffset = round7;
                                    groupedMessagePosition12.leftSpanOffset = round7;
                                    groupedMessagePosition9.siblingHeights = new float[]{min7, min8, f38};
                                    i4Var2.e = 1;
                                }
                            }
                        }
                    }
                    int size2 = arrayList2.size();
                    float[] fArr2 = new float[size2];
                    for (int i21 = 0; i21 < size; i21++) {
                        if (f20 > 1.1f) {
                            fArr2[i21] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i21)).aspectRatio);
                        } else {
                            fArr2[i21] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i21)).aspectRatio);
                        }
                        fArr2[i21] = Math.max(0.66667f, Math.min(1.7f, fArr2[i21]));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i22 = 1; i22 < size2; i22++) {
                        int i23 = size2 - i22;
                        if (i22 <= 3 && i23 <= 3) {
                            float a2 = i4Var2.a(fArr2, 0, i22);
                            float a3 = i4Var2.a(fArr2, i22, size2);
                            h4 h4Var = new h4();
                            h4Var.a = new int[]{i22, i23};
                            h4Var.b = new float[]{a2, a3};
                            arrayList4.add(h4Var);
                        }
                    }
                    int i24 = 1;
                    while (i24 < size2 - 1) {
                        int i25 = 1;
                        while (true) {
                            int i26 = size2 - i24;
                            if (i25 < i26) {
                                int i27 = i26 - i25;
                                if (i24 <= 3) {
                                    if (i25 <= (f20 < 0.85f ? 4 : 3) && i27 <= 3) {
                                        float a10 = i4Var2.a(fArr2, 0, i24);
                                        int i28 = i24 + i25;
                                        float a11 = i4Var2.a(fArr2, i24, i28);
                                        float a12 = i4Var2.a(fArr2, i28, size2);
                                        h4 h4Var2 = new h4();
                                        h4Var2.a = new int[]{i24, i25, i27};
                                        i10 = i24;
                                        h4Var2.b = new float[]{a10, a11, a12};
                                        arrayList4.add(h4Var2);
                                        i25++;
                                        i24 = i10;
                                    }
                                }
                                i10 = i24;
                                i25++;
                                i24 = i10;
                            }
                        }
                        i24++;
                    }
                    for (int i29 = 1; i29 < size2 - 2; i29++) {
                        int i30 = 1;
                        while (true) {
                            int i31 = size2 - i29;
                            if (i30 < i31) {
                                int i32 = 1;
                                while (true) {
                                    int i33 = i31 - i30;
                                    if (i32 < i33) {
                                        int i34 = i33 - i32;
                                        if (i29 > 3 || i30 > 3 || i32 > 3 || i34 > 3) {
                                            i9 = i31;
                                        } else {
                                            i9 = i31;
                                            float a13 = i4Var2.a(fArr2, 0, i29);
                                            int i35 = i29 + i30;
                                            float a14 = i4Var2.a(fArr2, i29, i35);
                                            int i36 = i35 + i32;
                                            float a15 = i4Var2.a(fArr2, i35, i36);
                                            float a16 = i4Var2.a(fArr2, i36, size2);
                                            h4 h4Var3 = new h4();
                                            h4Var3.a = new int[]{i29, i30, i32, i34};
                                            h4Var3.b = new float[]{a13, a14, a15, a16};
                                            arrayList4.add(h4Var3);
                                        }
                                        i32++;
                                        i31 = i9;
                                    }
                                }
                                i30++;
                            }
                        }
                    }
                    float f39 = (i4Var2.h / 3) * 4;
                    h4 h4Var4 = null;
                    float f40 = 0.0f;
                    int i37 = 0;
                    while (i37 < arrayList4.size()) {
                        h4 h4Var5 = (h4) arrayList4.get(i37);
                        float f41 = Float.MAX_VALUE;
                        float f42 = f39;
                        float f43 = 0.0f;
                        int i38 = 0;
                        while (true) {
                            float[] fArr3 = h4Var5.b;
                            fArr = fArr2;
                            if (i38 >= fArr3.length) {
                                break;
                            }
                            float f44 = fArr3[i38];
                            f43 += f44;
                            if (f44 < f41) {
                                f41 = f44;
                            }
                            i38++;
                            fArr2 = fArr;
                        }
                        float abs = Math.abs(f43 - f42);
                        int[] iArr = h4Var5.a;
                        if (iArr.length > 1) {
                            int i39 = iArr[0];
                            int i40 = iArr[1];
                            if (i39 <= i40) {
                                f10 = abs;
                                if (iArr.length <= 2 || i40 <= iArr[2]) {
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
                            if (h4Var4 != null || f11 < f40) {
                                f40 = f11;
                                h4Var4 = h4Var5;
                            }
                            i37++;
                            f39 = f42;
                            fArr2 = fArr;
                        } else {
                            f10 = abs;
                        }
                        f11 = f10;
                        if (f41 < min) {
                        }
                        if (h4Var4 != null) {
                        }
                        f40 = f11;
                        h4Var4 = h4Var5;
                        i37++;
                        f39 = f42;
                        fArr2 = fArr;
                    }
                    float[] fArr4 = fArr2;
                    if (h4Var4 == null) {
                        k4Var = this;
                    } else {
                        int[] iArr2 = h4Var4.a;
                        int i41 = 0;
                        int i42 = 0;
                        while (i41 < iArr2.length) {
                            int i43 = iArr2[i41];
                            float f45 = h4Var4.b[i41];
                            int i44 = i4Var2.h;
                            int i45 = i43 - 1;
                            i4Var2.e = Math.max(i4Var2.e, i45);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = null;
                            int i46 = 0;
                            while (i46 < i43) {
                                int i47 = (int) (fArr4[i42] * f45);
                                i44 -= i47;
                                MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i42);
                                int i48 = i41 == 0 ? 4 : 0;
                                h4 h4Var6 = h4Var4;
                                if (i41 == iArr2.length - 1) {
                                    i48 |= 8;
                                }
                                if (i46 == 0) {
                                    i48 |= 1;
                                }
                                if (i46 == i45) {
                                    i48 |= 2;
                                    groupedMessagePosition13 = groupedMessagePosition14;
                                }
                                int i49 = i46;
                                groupedMessagePosition14.set(i49, i46, i41, i41, i47, Math.max(dp4, f45 / f14), i48);
                                i42++;
                                i46 = i49 + 1;
                                h4Var4 = h4Var6;
                            }
                            groupedMessagePosition13.pw += i44;
                            groupedMessagePosition13.spanSize += i44;
                            i41++;
                            h4Var4 = h4Var4;
                        }
                    }
                }
                for (int i50 = 0; i50 < size; i50++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i50);
                    if (groupedMessagePosition15.maxX == i4Var2.e || (groupedMessagePosition15.flags & 2) != 0) {
                        groupedMessagePosition15.spanSize += 200;
                    }
                    if ((groupedMessagePosition15.flags & 1) != 0) {
                        groupedMessagePosition15.edge = true;
                    }
                    if (groupedMessagePosition15.edge) {
                        int i51 = groupedMessagePosition15.spanSize;
                        if (i51 != 1000) {
                            groupedMessagePosition15.spanSize = i51 + 108;
                        }
                        groupedMessagePosition15.pw += 108;
                    } else if ((groupedMessagePosition15.flags & 2) != 0) {
                        int i52 = groupedMessagePosition15.spanSize;
                        if (i52 != 1000) {
                            groupedMessagePosition15.spanSize = i52 - 108;
                        } else {
                            int i53 = groupedMessagePosition15.leftSpanOffset;
                            if (i53 != 0) {
                                groupedMessagePosition15.leftSpanOffset = i53 + 108;
                            }
                        }
                    }
                }
                int i54 = 0;
                while (i54 < size) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList2.get(i54);
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
                    int i55 = (b11 - b10) + 1;
                    float[] fArr5 = new float[i55];
                    Arrays.fill(fArr5, 0.0f);
                    int size3 = arrayList2.size();
                    int i56 = 0;
                    while (i56 < size3) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList2.get(i56);
                        if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxX < b12) {
                            int min9 = Math.min((int) groupedMessagePosition17.maxY, (int) b11) - b10;
                            int max6 = Math.max(groupedMessagePosition17.minY - b10, 0);
                            while (max6 <= min9) {
                                fArr5[max6] = fArr5[max6] + groupedMessagePosition17.pw;
                                max6++;
                                i54 = i54;
                            }
                        }
                        i56++;
                        i54 = i54;
                    }
                    int i57 = i54;
                    float f46 = 0.0f;
                    for (int i58 = 0; i58 < i55; i58++) {
                        float f47 = fArr5[i58];
                        if (f46 < f47) {
                            f46 = f47;
                        }
                    }
                    groupedMessagePosition16.left = f46;
                    i54 = i57 + 1;
                }
                for (int i59 = 0; i59 < size; i59++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList2.get(i59);
                    byte b13 = groupedMessagePosition18.minY;
                    int i60 = i4Var2.e + 1;
                    float[] fArr6 = new float[i60];
                    Arrays.fill(fArr6, 0.0f);
                    int size4 = arrayList2.size();
                    for (int i61 = 0; i61 < size4; i61++) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList2.get(i61);
                        if (groupedMessagePosition19 != groupedMessagePosition18 && groupedMessagePosition19.maxY < b13) {
                            for (int i62 = groupedMessagePosition19.minX; i62 <= groupedMessagePosition19.maxX; i62++) {
                                fArr6[i62] = fArr6[i62] + groupedMessagePosition19.ph;
                            }
                        }
                    }
                    float f48 = 0.0f;
                    for (int i63 = 0; i63 < i60; i63++) {
                        float f49 = fArr6[i63];
                        if (f48 < f49) {
                            f48 = f49;
                        }
                    }
                    groupedMessagePosition18.top = f48;
                }
                int[] iArr3 = new int[10];
                Arrays.fill(iArr3, 0);
                int size5 = arrayList2.size();
                for (int i64 = 0; i64 < size5; i64++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition20 = (MessageObject.GroupedMessagePosition) arrayList2.get(i64);
                    int i65 = groupedMessagePosition20.pw;
                    for (int i66 = groupedMessagePosition20.minY; i66 <= groupedMessagePosition20.maxY; i66++) {
                        iArr3[i66] = iArr3[i66] + i65;
                    }
                }
                int i67 = iArr3[0];
                for (int i68 = 1; i68 < 10; i68++) {
                    int i69 = iArr3[i68];
                    if (i67 < i69) {
                        i67 = i69;
                    }
                }
                i4Var2.d = i67;
                float[] fArr7 = new float[10];
                Arrays.fill(fArr7, 0.0f);
                int size6 = arrayList2.size();
                for (int i70 = 0; i70 < size6; i70++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition21 = (MessageObject.GroupedMessagePosition) arrayList2.get(i70);
                    float f50 = groupedMessagePosition21.ph;
                    for (int i71 = groupedMessagePosition21.minX; i71 <= groupedMessagePosition21.maxX; i71++) {
                        fArr7[i71] = fArr7[i71] + f50;
                    }
                }
                float f51 = fArr7[0];
                for (int i72 = 1; i72 < 10; i72++) {
                    float f52 = fArr7[i72];
                    if (f51 < f52) {
                        f51 = f52;
                    }
                }
                i4Var2.g = f51;
                k4Var = this;
            }
            int i73 = k4Var.m;
            t1 t1Var = k4Var.a;
            if (i73 > 0) {
                k4Var.f = i73;
                messageObject2 = messageObject;
            } else {
                if (AndroidUtilities.isTablet()) {
                    k4Var.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                    messageObject2 = messageObject;
                } else {
                    messageObject2 = messageObject;
                    k4Var.f = Math.min(t1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((t1Var.M0(messageObject2) ? 10 : 0) + 64);
                }
                if (t1Var.z3()) {
                    k4Var.f -= AndroidUtilities.dp(52.0f);
                }
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = tL_messageMediaPaidMedia;
            int i74 = 0;
            while (true) {
                int size7 = tL_messageMediaPaidMedia3.extended_media.size();
                arrayList = k4Var.c;
                if (i74 >= size7) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia3.extended_media.get(i74);
                j4 j4Var = i74 >= arrayList.size() ? null : (j4) arrayList.get(i74);
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
                        j4Var2.B = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        j4Var2.B = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(j4Var2.B)) {
                        DownloadController.getInstance(t1Var.E7).addLoadingFileObserver(j4Var2.B, messageObject2, j4Var2);
                        if (messageObject2.isSending()) {
                            j4Var2.C.o(messageExtendedMedia2.uploadProgress, false);
                        }
                    }
                    if (t1Var.I0 && !j4Var2.I) {
                        j4Var2.I = true;
                        j4Var2.f.onAttachedToWindow();
                    }
                    arrayList.add(j4Var2);
                } else {
                    j4Var.c(messageExtendedMedia2, messageObject2);
                }
                i74++;
            }
            int size8 = tL_messageMediaPaidMedia3.extended_media.size();
            while (size8 < arrayList.size()) {
                j4 j4Var3 = size8 >= arrayList.size() ? null : (j4) arrayList.get(size8);
                if (j4Var3 != null) {
                    if (j4Var3.I) {
                        j4Var3.I = false;
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
                nz0 nz0Var = new nz0(gh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                k4Var.q = nz0Var;
                if (nz0Var.c > k4Var.g - AndroidUtilities.dp(30.0f)) {
                    k4Var.q = new nz0(gh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
            if (k4Var.r == null || k4Var.s != tL_messageMediaPaidMedia3.stars_amount) {
                long j10 = tL_messageMediaPaidMedia3.stars_amount;
                k4Var.s = j10;
                k4Var.r = new nz0(gh.oa.R0(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j10), 0.9f, null), 12.0f, AndroidUtilities.bold());
            }
        }
    }

    public final void h(MessageObject messageObject) {
        float f10;
        boolean z10;
        boolean z11;
        int i9;
        t1 t1Var = this.a;
        boolean z12 = t1Var.Hc > 0 || (t1Var.q1 && !TextUtils.isEmpty(messageObject.caption));
        boolean z13 = ((t1Var.q1 || TextUtils.isEmpty(messageObject.caption)) && t1Var.J.s && !t1Var.f9) ? false : true;
        int i10 = this.m;
        if (i10 > 0) {
            f10 = 1000.0f / this.b.d;
            this.f = i10;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                this.f = Math.min(t1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((t1Var.M0(messageObject) ? 10 : 0) + 64);
            }
            if (t1Var.z3()) {
                this.f -= AndroidUtilities.dp(52.0f);
            }
            f10 = 1.0f;
        }
        i4 i4Var = this.b;
        this.g = (int) ((i4Var.d / 1000.0f) * f10 * this.f);
        this.h = (int) (i4Var.g * i4Var.i);
        this.i = false;
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(r11 - (SharedConfig.bubbleRadius > 2 ? 2 : 0));
        int min = Math.min(AndroidUtilities.dp(3.0f), dp3);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            MessageObject.GroupedMessagePosition groupedMessagePosition = null;
            if (i11 >= arrayList.size()) {
                break;
            }
            j4 j4Var = (j4) arrayList.get(i11);
            i4 i4Var2 = this.b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = j4Var.A;
            ImageReceiver imageReceiver = j4Var.f;
            if (messageExtendedMedia == null) {
                i4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) i4Var2.c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z10 = z12;
                z11 = z13;
                i9 = dp;
            } else {
                float f11 = (groupedMessagePosition.left / 1000.0f) * f10;
                float f12 = this.f;
                int i12 = (int) (f11 * f12);
                z10 = z12;
                float f13 = groupedMessagePosition.top;
                float f14 = this.b.i;
                int i13 = (int) (f13 * f14);
                int i14 = (int) ((groupedMessagePosition.pw / 1000.0f) * f10 * f12);
                int i15 = (int) (groupedMessagePosition.ph * f14);
                int i16 = i14;
                int i17 = groupedMessagePosition.flags;
                if ((i17 & 1) == 0) {
                    i12 += dp;
                    i16 -= dp;
                }
                if ((i17 & 4) == 0) {
                    i13 += dp;
                    i15 -= dp;
                }
                int i18 = i13;
                int i19 = i15;
                if ((i17 & 2) == 0) {
                    i16 -= dp;
                }
                int i20 = i16;
                if ((i17 & 8) == 0) {
                    i19 -= dp;
                }
                z11 = z13;
                int i21 = i19;
                j4Var.a = i12;
                j4Var.b = i18;
                i9 = dp;
                j4Var.c = i12 + i20;
                j4Var.d = i18 + i21;
                imageReceiver.setImageCoords(i12, i18, i20, i21);
                int i22 = groupedMessagePosition.flags;
                int i23 = i22 & 4;
                int i24 = (i23 == 0 || (i22 & 1) == 0 || z10) ? dp2 : dp3;
                int i25 = (i23 == 0 || (i22 & 2) == 0 || z10) ? dp2 : dp3;
                int i26 = i22 & 8;
                int i27 = (i26 == 0 || (i22 & 1) == 0 || z11) ? dp2 : dp3;
                int i28 = (i26 == 0 || (i22 & 2) == 0 || z11) ? dp2 : dp3;
                if (!z11) {
                    if (messageObject.isOutOwner()) {
                        i28 = dp2;
                    } else {
                        i27 = dp2;
                    }
                }
                if (!z10 && t1Var.A) {
                    if (messageObject.isOutOwner()) {
                        i25 = min;
                    } else {
                        i24 = min;
                    }
                }
                imageReceiver.setRoundRadius(i24, i25, i28, i27);
                float[] fArr = j4Var.s;
                float f15 = i24;
                fArr[1] = f15;
                fArr[0] = f15;
                float f16 = i25;
                fArr[3] = f16;
                fArr[2] = f16;
                float f17 = i28;
                fArr[5] = f17;
                fArr[4] = f17;
                float f18 = i27;
                fArr[7] = f18;
                fArr[6] = f18;
                if (messageObject != null && messageObject.isSending()) {
                    j4Var.b(3);
                }
                this.i = this.i || j4Var.h;
            }
            i11++;
            z12 = z10;
            dp = i9;
            z13 = z11;
        }
        if (this.i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = messageObject == null ? null : (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia != null) {
                nz0 nz0Var = new nz0(gh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.q = nz0Var;
                if (nz0Var.c > this.g - AndroidUtilities.dp(30.0f)) {
                    this.q = new nz0(gh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
