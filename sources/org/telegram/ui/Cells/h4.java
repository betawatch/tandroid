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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h4 {
    public int A;
    public int B;
    public boolean C;
    public final s1 a;
    public f4 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final org.telegram.ui.Components.y5 j;
    public t80 k;
    public final eh.j l;
    public int m;
    public final nc n;
    public g4 o;
    public boolean p;
    public pz0 q;
    public pz0 r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public h4(s1 s1Var) {
        this.a = s1Var;
        this.l = eh.j.e(s1Var);
        this.j = new org.telegram.ui.Components.y5(s1Var, 0L, 350L, er.h);
        this.n = new nc(s1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((g4) obj).f.getVisible()) {
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
        boolean z10 = this.i;
        org.telegram.ui.Components.y5 y5Var = this.j;
        float e9 = y5Var.e(z10);
        float e10 = y5Var.e(this.i);
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
            g4 g4Var = (g4) arrayList.get(i10);
            ImageReceiver imageReceiver = g4Var.f;
            RadialProgress2 radialProgress2 = g4Var.C;
            int i11 = this.d;
            int i12 = g4Var.a;
            float f19 = e9;
            int i13 = this.e;
            int i14 = g4Var.b;
            float f20 = e10;
            s1 s1Var3 = s1Var2;
            imageReceiver.setImageCoords(i11 + i12, i13 + i14, g4Var.c - i12, g4Var.d - i14);
            imageReceiver.draw(canvas2);
            if (imageReceiver.getAnimation() != null) {
                imageReceiver.getAnimation().getClass();
                int round = Math.round(0 / 1000.0f);
                if (!g4Var.x && g4Var.G != (max = Math.max(0, g4Var.F - round))) {
                    g4Var.G = max;
                    g4Var.H = new pz0(AndroidUtilities.formatLongDuration(max), 12.0f, null);
                }
            }
            if (f20 > 0.0f) {
                float min = Math.min(this.d + g4Var.a, f15);
                float min2 = Math.min(this.e + g4Var.b, f16);
                f17 = Math.max(this.d + g4Var.c, f17);
                f18 = Math.max(this.e + g4Var.d, f18);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f21 = g4Var.a + this.d;
                int i15 = this.e;
                rectF2.set(f21, g4Var.b + i15, r9 + g4Var.c, i15 + g4Var.d);
                path3.addRoundRect(rectF2, g4Var.s, Path.Direction.CW);
                f15 = min;
                f16 = min2;
            }
            radialProgress2.g(org.telegram.ui.ActionBar.g6.le, org.telegram.ui.ActionBar.g6.me, org.telegram.ui.ActionBar.g6.ne, org.telegram.ui.ActionBar.g6.oe);
            RectF rectF3 = radialProgress2.a;
            float f22 = f15;
            rectF3.set(((imageReceiver.getImageWidth() / 2.0f) - radialProgress2.x) + imageReceiver.getImageX(), ((imageReceiver.getImageHeight() / 2.0f) - radialProgress2.x) + imageReceiver.getImageY(), (imageReceiver.getImageWidth() / 2.0f) + radialProgress2.x + imageReceiver.getImageX(), (imageReceiver.getImageHeight() / 2.0f) + radialProgress2.x + imageReceiver.getImageY());
            if (messageObject.isSending()) {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(messageObject.currentAccount);
                long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(g4Var.B);
                boolean isSendingPaidMessage = sendMessagesHelper.isSendingPaidMessage(messageObject.getId(), i10);
                if (fileProgressSizes == null && isSendingPaidMessage) {
                    radialProgress2.o(1.0f, true);
                    g4Var.b(g4Var.w ? 6 : g4Var.a());
                }
            } else if (FileLoader.getInstance(messageObject.currentAccount).isLoadingFile(g4Var.v)) {
                g4Var.b(3);
            } else {
                g4Var.b(g4Var.a());
            }
            canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f20) * 255.0f), 31);
            radialProgress2.draw(canvas2);
            canvas2.restore();
            i10++;
            f15 = f22;
            e9 = f19;
            s1Var2 = s1Var3;
            e10 = f20;
        }
        float f23 = e9;
        float f24 = e10;
        s1 s1Var4 = s1Var2;
        if (f24 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path3);
            canvas2.translate(f15, f16);
            int i16 = (int) (f17 - f15);
            int i17 = (int) (f18 - f16);
            canvas2.saveLayerAlpha(0.0f, 0.0f, i16, i17, (int) (f24 * 255.0f), 31);
            this.l.c(canvas, s1Var4, i16, i17, 1.0f, s1Var4.ke);
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
            g4 g4Var2 = (g4) arrayList.get(i18);
            if (g4Var2.H != null) {
                float dp = AndroidUtilities.dp(11.4f) + g4Var2.H.c;
                float dp2 = AndroidUtilities.dp(17.0f);
                float dp3 = AndroidUtilities.dp(5.0f);
                float f25 = this.d + g4Var2.a + dp3;
                float f26 = this.e + g4Var2.b + dp3;
                rectF.set(f25, f26, dp + f25, f26 + dp2);
                if (this.r == null || rectF.right <= ((this.d + this.g) - (AndroidUtilities.dp(11.32f) + this.r.c)) - dp3 || rectF.top > this.e + dp3) {
                    path.rewind();
                    float f27 = dp2 / 2.0f;
                    path.addRoundRect(rectF, f27, f27, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                    f14 = f24;
                    c(canvas2, f14);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(1.0f, TLObject.FLAG_30));
                    g4Var2.H.c(this.d + g4Var2.a + dp3 + AndroidUtilities.dp(5.66f), this.e + g4Var2.b + dp3 + f27, 1.0f, -1, canvas2);
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
            float A = com.google.android.recaptcha.internal.a.A(f29, dp4, 2.0f, f28);
            f11 = 11.32f;
            float f30 = this.e;
            f12 = 5.0f;
            float f31 = this.h;
            f13 = 17.0f;
            rectF.set(A, com.google.android.recaptcha.internal.a.A(f31, dp5, 2.0f, f30), i0.a.c(f29, dp4, 2.0f, f28), i0.a.c(f31, dp5, 2.0f, f30));
            path.rewind();
            float f32 = dp5 / 2.0f;
            path.addRoundRect(rectF, f32, f32, Path.Direction.CW);
            canvas2.save();
            canvas2.scale(a2, a2, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
            canvas2.save();
            canvas2.clipPath(path);
            f10 = f23;
            c(canvas2, f10);
            canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(f10, 1342177280));
            path2 = path;
            this.q.c((((this.g / 2.0f) + this.d) - (dp4 / 2.0f)) + AndroidUtilities.dp(14.0f), this.e + (this.h / 2.0f), f10, -1, canvas2);
            canvas2.restore();
            if (s1Var.getDelegate() == null || !s1Var.getDelegate().Y0(5, s1Var)) {
                t80 t80Var = this.k;
                if (t80Var != null && !t80Var.c() && !this.k.b()) {
                    this.k.a();
                }
            } else {
                t80 t80Var2 = this.k;
                if (t80Var2 == null) {
                    t80 t80Var3 = new t80();
                    this.k = t80Var3;
                    t80Var3.setCallback(s1Var);
                    this.k.f(org.telegram.ui.ActionBar.g6.l1(0.1f, -1), org.telegram.ui.ActionBar.g6.l1(0.3f, -1), org.telegram.ui.ActionBar.g6.l1(0.35f, -1), org.telegram.ui.ActionBar.g6.l1(0.8f, -1));
                    t80 t80Var4 = this.k;
                    t80Var4.C = true;
                    t80Var4.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else if (t80Var2.b() || this.k.c()) {
                    t80 t80Var5 = this.k;
                    t80Var5.b = -1L;
                    t80Var5.c = -1L;
                }
            }
            t80 t80Var6 = this.k;
            if (t80Var6 != null) {
                t80Var6.d(rectF);
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
        canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(timeAlpha, TLObject.FLAG_30));
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
            g4 g4Var = (g4) arrayList.get(i14);
            if (g4Var.f.hasImageSet() && g4Var.f.getBitmap() != null) {
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
                g4 g4Var2 = (g4) arrayList.get(i16);
                g4Var2.f.setImageCoords(g4Var2.a, g4Var2.b, g4Var2.c - r4, g4Var2.d - r7);
                g4Var2.f.draw(canvas2);
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

    public final g4 d(float f10, float f11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((g4) arrayList.get(i10)).f.isInsideImage(f10, f11)) {
                return (g4) arrayList.get(i10);
            }
            i10++;
        }
    }

    public final void e() {
        if (!this.C) {
            return;
        }
        this.C = false;
        eh.j jVar = this.l;
        if (jVar != null) {
            jVar.a(this.a);
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                return;
            }
            g4 g4Var = (g4) arrayList.get(i10);
            if (g4Var.I) {
                g4Var.I = false;
                g4Var.f.onDetachedFromWindow();
            }
            i10++;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        g4 g4Var;
        s1 s1Var;
        boolean z11;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            g4 d = d(x8, y10);
            this.o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.C;
                if (radialProgress2.i.q != 4 && radialProgress2.a.contains(x8, y10)) {
                    z11 = true;
                    this.p = z11;
                }
            }
            z11 = false;
            this.p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            g4 d10 = d(x8, y10);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.C;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x8, y10)) {
                    z10 = true;
                    g4Var = this.o;
                    if (g4Var != null && g4Var == d10) {
                        s1Var = this.a;
                        if (s1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            MessageObject messageObject = s1Var.getMessageObject();
                            if (this.p || !z10 || d10.C.i.q != 3 || messageObject == null) {
                                j1 delegate = s1Var.getDelegate();
                                g4 g4Var2 = this.o;
                                ImageReceiver imageReceiver = g4Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = g4Var2.A;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.K1(s1Var, messageExtendedMedia);
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
            g4Var = this.o;
            if (g4Var != null) {
                s1Var = this.a;
                if (s1Var.getDelegate() != null) {
                    MessageObject messageObject2 = s1Var.getMessageObject();
                    if (this.p) {
                    }
                    j1 delegate2 = s1Var.getDelegate();
                    g4 g4Var22 = this.o;
                    ImageReceiver imageReceiver2 = g4Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = g4Var22.A;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.K1(s1Var, messageExtendedMedia2);
                }
            }
            this.p = false;
            this.o = null;
        }
        this.n.c(this.o != null);
        return this.o != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:396:0x0771, code lost:
    
        if (r3[2] > r3[3]) goto L202;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0784  */
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
        h4 h4Var = this;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            if (h4Var.b == null) {
                f4 f4Var = new f4();
                f4Var.a = new ArrayList();
                f4Var.b = new ArrayList();
                f4Var.c = new HashMap();
                f4Var.h = 800;
                f4Var.i = 814.0f;
                h4Var.b = f4Var;
            }
            h4Var.b.a.clear();
            h4Var.b.a.addAll(tL_messageMediaPaidMedia2.extended_media);
            f4 f4Var2 = h4Var.b;
            float f14 = f4Var2.i;
            ArrayList arrayList2 = f4Var2.b;
            arrayList2.clear();
            HashMap hashMap = f4Var2.c;
            hashMap.clear();
            f4Var2.e = 0;
            ArrayList arrayList3 = f4Var2.a;
            int size = arrayList3.size();
            if (size == 0) {
                f4Var2.d = 0;
                f4Var2.g = 0.0f;
                f4Var2.f = 0;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
            } else {
                f4Var2.h = 800;
                StringBuilder sb2 = new StringBuilder();
                int i12 = 0;
                float f15 = 1.0f;
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
                    i12++;
                }
                int dp = AndroidUtilities.dp(120.0f);
                float dp2 = AndroidUtilities.dp(120.0f);
                Point point = AndroidUtilities.displaySize;
                int min = (int) (dp2 / (Math.min(point.x, point.y) / f4Var2.h));
                float dp3 = AndroidUtilities.dp(40.0f);
                Point point2 = AndroidUtilities.displaySize;
                float min2 = Math.min(point2.x, point2.y);
                float f18 = f4Var2.h;
                int i13 = (int) (dp3 / (min2 / f18));
                float f19 = f18 / f14;
                float f20 = f15 / size;
                float dp4 = AndroidUtilities.dp(100.0f) / f14;
                if (size == 1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                    float f21 = groupedMessagePosition3.aspectRatio;
                    if (f21 >= 1.0f) {
                        f12 = f4Var2.h;
                        f13 = ((f12 / f21) / f12) * f14;
                    } else {
                        f12 = f4Var2.h * ((f21 * f14) / f14);
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
                                        float f24 = f4Var2.h;
                                        float round = Math.round(Math.min(f24 / f22, Math.min(f24 / f23, f14 / 2.0f))) / f14;
                                        groupedMessagePosition4.set(0, 0, 0, 0, f4Var2.h, round, 7);
                                        groupedMessagePosition5.set(0, 0, 1, 1, f4Var2.h, round, 11);
                                    }
                                }
                                if (sb3.equals("ww") || sb3.equals("qq")) {
                                    int i14 = f4Var2.h / 2;
                                    float f25 = i14;
                                    float round2 = Math.round(Math.min(f25 / groupedMessagePosition4.aspectRatio, Math.min(f25 / groupedMessagePosition5.aspectRatio, f14))) / f14;
                                    groupedMessagePosition4.set(0, 0, 0, 0, i14, round2, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, i14, round2, 14);
                                    f4Var2.e = 1;
                                } else {
                                    float f26 = f4Var2.h;
                                    float f27 = groupedMessagePosition4.aspectRatio;
                                    int max = (int) Math.max(f26 * 0.4f, Math.round((f26 / f27) / ((1.0f / groupedMessagePosition5.aspectRatio) + (1.0f / f27))));
                                    int i15 = f4Var2.h - max;
                                    if (i15 < min) {
                                        max -= min - i15;
                                    } else {
                                        min = i15;
                                    }
                                    float min3 = Math.min(f14, Math.round(Math.min(min / groupedMessagePosition4.aspectRatio, max / groupedMessagePosition5.aspectRatio))) / f14;
                                    groupedMessagePosition4.set(0, 0, 0, 0, min, min3, 13);
                                    groupedMessagePosition5.set(1, 1, 0, 0, max, min3, 14);
                                    f4Var2.e = 1;
                                }
                            } else if (size == 3) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                if (sb2.charAt(0) == 'n') {
                                    float f28 = groupedMessagePosition7.aspectRatio;
                                    float min4 = Math.min(f14 * 0.5f, Math.round((f4Var2.h * f28) / (groupedMessagePosition8.aspectRatio + f28)));
                                    float f29 = f14 - min4;
                                    int max2 = (int) Math.max(min, Math.min(f4Var2.h * 0.5f, Math.round(Math.min(groupedMessagePosition8.aspectRatio * min4, groupedMessagePosition7.aspectRatio * f29))));
                                    int round3 = Math.round(Math.min((groupedMessagePosition6.aspectRatio * f14) + i13, f4Var2.h - max2));
                                    groupedMessagePosition6.set(0, 0, 0, 1, round3, 1.0f, 13);
                                    float f30 = f29 / f14;
                                    groupedMessagePosition7.set(1, 1, 0, 0, max2, f30, 6);
                                    float f31 = min4 / f14;
                                    groupedMessagePosition8.set(1, 1, 1, 1, max2, f31, 10);
                                    int i16 = f4Var2.h;
                                    groupedMessagePosition8.spanSize = i16;
                                    groupedMessagePosition6.siblingHeights = new float[]{f31, f30};
                                    groupedMessagePosition7.spanSize = i16 - round3;
                                    groupedMessagePosition8.leftSpanOffset = round3;
                                    f4Var2.e = 1;
                                } else {
                                    float round4 = Math.round(Math.min(f4Var2.h / groupedMessagePosition6.aspectRatio, 0.66f * f14)) / f14;
                                    groupedMessagePosition6.set(0, 1, 0, 0, f4Var2.h, round4, 7);
                                    int i17 = f4Var2.h / 2;
                                    float f32 = i17;
                                    float min5 = Math.min(f14 - round4, Math.round(Math.min(f32 / groupedMessagePosition7.aspectRatio, f32 / groupedMessagePosition8.aspectRatio))) / f14;
                                    float f33 = min5 < dp4 ? dp4 : min5;
                                    groupedMessagePosition7.set(0, 0, 1, 1, i17, f33, 9);
                                    groupedMessagePosition8.set(1, 1, 1, 1, i17, f33, 10);
                                    f4Var2.e = 1;
                                }
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                                MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                                MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                                MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList2.get(3);
                                if (sb2.charAt(0) == 'w') {
                                    float round5 = Math.round(Math.min(f4Var2.h / groupedMessagePosition9.aspectRatio, f14 * 0.66f)) / f14;
                                    groupedMessagePosition9.set(0, 2, 0, 0, f4Var2.h, round5, 7);
                                    float round6 = Math.round(f4Var2.h / ((groupedMessagePosition10.aspectRatio + groupedMessagePosition11.aspectRatio) + groupedMessagePosition12.aspectRatio));
                                    float f34 = min;
                                    int max3 = (int) Math.max(f34, Math.min(f4Var2.h * 0.4f, groupedMessagePosition10.aspectRatio * round6));
                                    int max4 = (int) Math.max(Math.max(f34, f4Var2.h * 0.33f), groupedMessagePosition12.aspectRatio * round6);
                                    int i18 = (f4Var2.h - max3) - max4;
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
                                    f4Var2.e = 2;
                                } else {
                                    int max5 = Math.max(min, Math.round(f14 / ((1.0f / groupedMessagePosition12.aspectRatio) + ((1.0f / groupedMessagePosition11.aspectRatio) + (1.0f / groupedMessagePosition10.aspectRatio)))));
                                    float f36 = dp;
                                    float f37 = max5;
                                    float min7 = Math.min(0.33f, Math.max(f36, f37 / groupedMessagePosition10.aspectRatio) / f14);
                                    float min8 = Math.min(0.33f, Math.max(f36, f37 / groupedMessagePosition11.aspectRatio) / f14);
                                    float f38 = (1.0f - min7) - min8;
                                    int round7 = Math.round(Math.min((groupedMessagePosition9.aspectRatio * f14) + i13, f4Var2.h - max5));
                                    groupedMessagePosition9.set(0, 0, 0, 2, round7, min7 + min8 + f38, 13);
                                    groupedMessagePosition10.set(1, 1, 0, 0, max5, min7, 6);
                                    groupedMessagePosition11.set(1, 1, 1, 1, max5, min8, 2);
                                    groupedMessagePosition11.spanSize = f4Var2.h;
                                    groupedMessagePosition12.set(1, 1, 2, 2, max5, f38, 10);
                                    int i21 = f4Var2.h;
                                    groupedMessagePosition12.spanSize = i21;
                                    groupedMessagePosition10.spanSize = i21 - round7;
                                    groupedMessagePosition11.leftSpanOffset = round7;
                                    groupedMessagePosition12.leftSpanOffset = round7;
                                    groupedMessagePosition9.siblingHeights = new float[]{min7, min8, f38};
                                    f4Var2.e = 1;
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
                            float a2 = f4Var2.a(fArr2, 0, i23);
                            float a3 = f4Var2.a(fArr2, i23, size2);
                            e4 e4Var = new e4();
                            e4Var.a = new int[]{i23, i24};
                            e4Var.b = new float[]{a2, a3};
                            arrayList4.add(e4Var);
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
                                        float a10 = f4Var2.a(fArr2, 0, i25);
                                        int i29 = i25 + i26;
                                        float a11 = f4Var2.a(fArr2, i25, i29);
                                        float a12 = f4Var2.a(fArr2, i29, size2);
                                        e4 e4Var2 = new e4();
                                        e4Var2.a = new int[]{i25, i26, i28};
                                        i11 = i25;
                                        e4Var2.b = new float[]{a10, a11, a12};
                                        arrayList4.add(e4Var2);
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
                                            float a13 = f4Var2.a(fArr2, 0, i30);
                                            int i36 = i30 + i31;
                                            float a14 = f4Var2.a(fArr2, i30, i36);
                                            int i37 = i36 + i33;
                                            float a15 = f4Var2.a(fArr2, i36, i37);
                                            float a16 = f4Var2.a(fArr2, i37, size2);
                                            e4 e4Var3 = new e4();
                                            e4Var3.a = new int[]{i30, i31, i33, i35};
                                            e4Var3.b = new float[]{a13, a14, a15, a16};
                                            arrayList4.add(e4Var3);
                                        }
                                        i33++;
                                        i32 = i10;
                                    }
                                }
                                i31++;
                            }
                        }
                    }
                    float f39 = (f4Var2.h / 3) * 4;
                    e4 e4Var4 = null;
                    float f40 = 0.0f;
                    int i38 = 0;
                    while (i38 < arrayList4.size()) {
                        e4 e4Var5 = (e4) arrayList4.get(i38);
                        float f41 = Float.MAX_VALUE;
                        float f42 = f39;
                        float f43 = 0.0f;
                        int i39 = 0;
                        while (true) {
                            float[] fArr3 = e4Var5.b;
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
                        int[] iArr = e4Var5.a;
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
                            if (e4Var4 != null || f11 < f40) {
                                f40 = f11;
                                e4Var4 = e4Var5;
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
                        if (e4Var4 != null) {
                        }
                        f40 = f11;
                        e4Var4 = e4Var5;
                        i38++;
                        f39 = f42;
                        fArr2 = fArr;
                    }
                    float[] fArr4 = fArr2;
                    if (e4Var4 == null) {
                        h4Var = this;
                    } else {
                        int[] iArr2 = e4Var4.a;
                        int i42 = 0;
                        int i43 = 0;
                        while (i42 < iArr2.length) {
                            int i44 = iArr2[i42];
                            float f45 = e4Var4.b[i42];
                            int i45 = f4Var2.h;
                            int i46 = i44 - 1;
                            f4Var2.e = Math.max(f4Var2.e, i46);
                            MessageObject.GroupedMessagePosition groupedMessagePosition13 = null;
                            int i47 = 0;
                            while (i47 < i44) {
                                int i48 = (int) (fArr4[i43] * f45);
                                i45 -= i48;
                                MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i43);
                                int i49 = i42 == 0 ? 4 : 0;
                                e4 e4Var6 = e4Var4;
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
                                e4Var4 = e4Var6;
                            }
                            groupedMessagePosition13.pw += i45;
                            groupedMessagePosition13.spanSize += i45;
                            i42++;
                            e4Var4 = e4Var4;
                        }
                    }
                }
                for (int i51 = 0; i51 < size; i51++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i51);
                    if (groupedMessagePosition15.maxX == f4Var2.e || (groupedMessagePosition15.flags & 2) != 0) {
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
                    f4Var2.e = Math.max(f4Var2.e, (int) groupedMessagePosition16.maxX);
                    f4Var2.f = Math.max(f4Var2.f, (int) groupedMessagePosition16.maxY);
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
                    int i61 = f4Var2.e + 1;
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
                f4Var2.d = i68;
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
                f4Var2.g = f51;
                h4Var = this;
            }
            int i74 = h4Var.m;
            s1 s1Var = h4Var.a;
            if (i74 > 0) {
                h4Var.f = i74;
                messageObject2 = messageObject;
            } else {
                if (AndroidUtilities.isTablet()) {
                    h4Var.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
                    messageObject2 = messageObject;
                } else {
                    messageObject2 = messageObject;
                    h4Var.f = Math.min(s1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((s1Var.L0(messageObject2) ? 10 : 0) + 64);
                }
                if (s1Var.y3()) {
                    h4Var.f -= AndroidUtilities.dp(52.0f);
                }
            }
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia3 = tL_messageMediaPaidMedia;
            int i75 = 0;
            while (true) {
                int size7 = tL_messageMediaPaidMedia3.extended_media.size();
                arrayList = h4Var.c;
                if (i75 >= size7) {
                    break;
                }
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia3.extended_media.get(i75);
                g4 g4Var = i75 >= arrayList.size() ? null : (g4) arrayList.get(i75);
                if (g4Var == null) {
                    f4 f4Var3 = h4Var.b;
                    if (messageExtendedMedia2 == null) {
                        f4Var3.getClass();
                        groupedMessagePosition = null;
                    } else {
                        groupedMessagePosition = (MessageObject.GroupedMessagePosition) f4Var3.c.get(messageExtendedMedia2);
                    }
                    g4 g4Var2 = new g4(h4Var.a, messageObject2, messageExtendedMedia2, tL_messageMediaPaidMedia3.extended_media.size() != 1, (int) ((groupedMessagePosition.pw / 1000.0f) * h4Var.f), (int) (groupedMessagePosition.ph * h4Var.b.i));
                    String str = messageExtendedMedia2.attachPath;
                    if (str != null) {
                        g4Var2.B = str;
                    } else if (tL_messageMediaPaidMedia3.extended_media.size() == 1) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        g4Var2.B = message2 != null ? message2.attachPath : null;
                    }
                    if (!TextUtils.isEmpty(g4Var2.B)) {
                        DownloadController.getInstance(s1Var.E7).addLoadingFileObserver(g4Var2.B, messageObject2, g4Var2);
                        if (messageObject2.isSending()) {
                            g4Var2.C.o(messageExtendedMedia2.uploadProgress, false);
                        }
                    }
                    if (s1Var.I0 && !g4Var2.I) {
                        g4Var2.I = true;
                        g4Var2.f.onAttachedToWindow();
                    }
                    arrayList.add(g4Var2);
                } else {
                    g4Var.c(messageExtendedMedia2, messageObject2);
                }
                i75++;
            }
            int size8 = tL_messageMediaPaidMedia3.extended_media.size();
            while (size8 < arrayList.size()) {
                g4 g4Var3 = size8 >= arrayList.size() ? null : (g4) arrayList.get(size8);
                if (g4Var3 != null) {
                    if (g4Var3.I) {
                        g4Var3.I = false;
                        g4Var3.f.onDetachedFromWindow();
                    }
                    arrayList.remove(size8);
                    size8--;
                }
                size8++;
            }
            h(messageObject);
            f4 f4Var4 = h4Var.b;
            h4Var.g = (int) ((f4Var4.d / 1000.0f) * h4Var.f);
            h4Var.h = (int) (f4Var4.g * f4Var4.i);
            if (h4Var.i) {
                pz0 pz0Var = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                h4Var.q = pz0Var;
                if (pz0Var.c > h4Var.g - AndroidUtilities.dp(30.0f)) {
                    h4Var.q = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia3.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
            if (h4Var.r == null || h4Var.s != tL_messageMediaPaidMedia3.stars_amount) {
                long j10 = tL_messageMediaPaidMedia3.stars_amount;
                h4Var.s = j10;
                h4Var.r = new pz0(hh.oa.R0(LocaleController.formatPluralStringComma("PaidMediaPrice", (int) j10), 0.9f, null), 12.0f, AndroidUtilities.bold());
            }
        }
    }

    public final void h(MessageObject messageObject) {
        float f10;
        boolean z10;
        boolean z11;
        int i10;
        s1 s1Var = this.a;
        boolean z12 = s1Var.Hc > 0 || (s1Var.q1 && !TextUtils.isEmpty(messageObject.caption));
        boolean z13 = ((s1Var.q1 || TextUtils.isEmpty(messageObject.caption)) && s1Var.J.s && !s1Var.f9) ? false : true;
        int i11 = this.m;
        if (i11 > 0) {
            f10 = 1000.0f / this.b.d;
            this.f = i11;
        } else {
            if (AndroidUtilities.isTablet()) {
                this.f = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(122.0f);
            } else {
                this.f = Math.min(s1Var.getParentWidth(), AndroidUtilities.displaySize.y) - AndroidUtilities.dp((s1Var.L0(messageObject) ? 10 : 0) + 64);
            }
            if (s1Var.y3()) {
                this.f -= AndroidUtilities.dp(52.0f);
            }
            f10 = 1.0f;
        }
        f4 f4Var = this.b;
        this.g = (int) ((f4Var.d / 1000.0f) * f10 * this.f);
        this.h = (int) (f4Var.g * f4Var.i);
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
            g4 g4Var = (g4) arrayList.get(i12);
            f4 f4Var2 = this.b;
            TLRPC.MessageExtendedMedia messageExtendedMedia = g4Var.A;
            ImageReceiver imageReceiver = g4Var.f;
            if (messageExtendedMedia == null) {
                f4Var2.getClass();
            } else {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) f4Var2.c.get(messageExtendedMedia);
            }
            if (groupedMessagePosition == null) {
                z10 = z12;
                z11 = z13;
                i10 = dp;
            } else {
                float f11 = (groupedMessagePosition.left / 1000.0f) * f10;
                float f12 = this.f;
                int i13 = (int) (f11 * f12);
                z10 = z12;
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
                z11 = z13;
                int i22 = i20;
                g4Var.a = i13;
                g4Var.b = i19;
                i10 = dp;
                g4Var.c = i13 + i21;
                g4Var.d = i19 + i22;
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
                if (!z10 && s1Var.A) {
                    if (messageObject.isOutOwner()) {
                        i26 = min;
                    } else {
                        i25 = min;
                    }
                }
                imageReceiver.setRoundRadius(i25, i26, i29, i28);
                float[] fArr = g4Var.s;
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
                    g4Var.b(3);
                }
                this.i = this.i || g4Var.h;
            }
            i12++;
            z12 = z10;
            dp = i10;
            z13 = z11;
        }
        if (this.i) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = messageObject == null ? null : (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia != null) {
                pz0 pz0Var = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                this.q = pz0Var;
                if (pz0Var.c > this.g - AndroidUtilities.dp(30.0f)) {
                    this.q = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
            }
        }
    }
}
