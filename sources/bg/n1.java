package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class n1 extends View {
    public float A;
    public StaticLayout B;
    public float C;
    public float D;
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public final RectF K;
    public final d6 L;
    public int a;
    public String b;
    public boolean c;
    public final RectF d;
    public final TextPaint e;
    public final Paint f;
    public final Drawable h;
    public boolean n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public TLRPC.Document v;
    public TLRPC.Document w;
    public boolean x;
    public final float y;

    public n1(Context context, float f9) {
        super(context);
        this.b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.A = 1.0f;
        this.K = new RectF();
        new Path();
        this.L = new d6(this, 350L, jr.h);
        this.y = f9;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i10 = (int) (3.0f * f9);
        this.E = i10;
        int i11 = (int) (1.0f * f9);
        this.F = i11;
        setPadding(i10, i11, i10, i11);
        this.h = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f9 * 24.0f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        NotificationCenter.listenEmojiLoading(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.Document b(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.packs == null || tL_messages_stickerSet.documents == null) {
            return null;
        }
        for (int i10 = 0; i10 < tL_messages_stickerSet.packs.size(); i10++) {
            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
            String str2 = tL_stickerPack.emoticon;
            if (str2 != null && str != null) {
                ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str2);
                int i11 = 0;
                while (true) {
                    if (i11 >= parseEmojis.size()) {
                        break;
                    }
                    if (!TextUtils.equals(parseEmojis.get(i11).code, str)) {
                        i11++;
                    } else if (tL_stickerPack.documents.isEmpty()) {
                        continue;
                    } else {
                        long longValue = tL_stickerPack.documents.get(0).longValue();
                        for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                            if (tL_messages_stickerSet.documents.get(i12).id == longValue) {
                                return tL_messages_stickerSet.documents.get(i12);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static m1 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new m1(emojiBigDrawable, 0);
    }

    public final void a(Canvas canvas) {
        f();
        if (this.B == null) {
            return;
        }
        int i10 = this.E;
        float f9 = i10;
        int i11 = this.F;
        float f10 = i11;
        float f11 = this.I + f9;
        float f12 = this.J + f10;
        RectF rectF = this.K;
        rectF.set(f9, f10, f11, f12);
        float f13 = this.J * 0.2f;
        canvas.drawRoundRect(rectF, f13, f13, this.f);
        boolean z10 = this.n;
        float f14 = this.y;
        RectF rectF2 = this.d;
        if (z10) {
            float e10 = this.L.e(this.H);
            if (e10 > 0.0f) {
                float f15 = ((rectF2.left + 2.25f) * f14) + f9;
                float f16 = f14 * 21.33f;
                float A = com.google.android.recaptcha.internal.a.A(this.J, f16, 2.0f, f10);
                ImageReceiver imageReceiver = this.s;
                imageReceiver.setImageCoords(f15, A, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e10 < 1.0f) {
                float f17 = ((rectF2.left + 2.25f) * f14) + f9;
                float f18 = f14 * 21.33f;
                float A2 = com.google.android.recaptcha.internal.a.A(this.J, f18, 2.0f, f10);
                ImageReceiver imageReceiver2 = this.r;
                imageReceiver2.setImageCoords(f17, A2, f18, f18);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e10);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.x) {
            float f19 = rectF2.left;
            float f20 = this.J;
            float f21 = f14 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f19 * f14)) + i10, ((int) ((f20 - f21) / 2.0f)) + i11, i10 + ((int) ((f19 + 21.33f) * f14)), i11 + ((int) ((f21 + f20) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.n || this.x) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f14) + f9, (this.J / 2.0f) + f10);
        float f22 = this.A;
        canvas.scale(f22, f22);
        canvas.translate(-this.D, (-this.B.getHeight()) / 2.0f);
        this.B.draw(canvas);
        canvas.restore();
    }

    public final void d(int i10, final String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.s;
        ImageReceiver imageReceiver2 = this.r;
        if (isEmpty) {
            this.n = false;
            this.v = null;
            this.w = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
        } else {
            this.n = true;
            this.v = null;
            this.w = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            final int i11 = 0;
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) { // from class: bg.l1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            n1 n1Var = this.b;
                            n1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = n1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            n1Var.v = b10;
                            n1Var.r.setImage(ImageLocation.getForDocument(b10), "80_80", n1.c(str2), null, null, 0);
                            n1Var.s.setImage(ImageLocation.getForDocument(n1Var.w), "80_80", ImageLocation.getForDocument(n1Var.v), "80_80", null, null, n1.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            n1 n1Var2 = this.b;
                            n1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = n1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            n1Var2.w = b11;
                            if (b11 != null) {
                                n1Var2.s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(n1Var2.v), "80_80", null, null, n1.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            final int i12 = 1;
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) { // from class: bg.l1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            n1 n1Var = this.b;
                            n1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = n1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            n1Var.v = b10;
                            n1Var.r.setImage(ImageLocation.getForDocument(b10), "80_80", n1.c(str2), null, null, 0);
                            n1Var.s.setImage(ImageLocation.getForDocument(n1Var.w), "80_80", ImageLocation.getForDocument(n1Var.v), "80_80", null, null, n1.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            n1 n1Var2 = this.b;
                            n1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = n1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            n1Var2.w = b11;
                            if (b11 != null) {
                                n1Var2.s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(n1Var2.v), "80_80", null, null, n1.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.v), "80_80", c(str), null, null, 0);
            imageReceiver.setImage(ImageLocation.getForDocument(this.w), "80_80", ImageLocation.getForDocument(this.v), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.c = true;
        requestLayout();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i10, int i11) {
        Drawable drawable = this.h;
        TextPaint textPaint = this.e;
        Paint paint = this.f;
        if (i10 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i10 == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i11);
            int i12 = AndroidUtilities.computePerceivedBrightness(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f9;
        if (this.c) {
            String str = this.b;
            TextPaint textPaint = this.e;
            float measureText = textPaint.measureText(str);
            int i10 = this.a;
            int i11 = this.E;
            float f10 = (i10 - i11) - i11;
            RectF rectF = this.d;
            float f11 = 2.25f;
            float f12 = rectF.left + ((this.n || this.x) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f13 = this.y;
            float f14 = f10 - (f12 * f13);
            float min = Math.min(1.0f, f14 / measureText);
            this.A = min;
            if (min < 0.4f) {
                f9 = 1.0f;
                String str2 = this.b;
                this.B = new StaticLayout(str2, textPaint, nh.t3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f9 = 1.0f;
                this.B = new StaticLayout(this.b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.C = 0.0f;
            this.D = Float.MAX_VALUE;
            for (int i12 = 0; i12 < this.B.getLineCount(); i12++) {
                this.C = Math.max(this.C, this.B.getLineWidth(i12));
                this.D = Math.min(this.D, this.B.getLineLeft(i12));
            }
            if (this.B.getLineCount() > 2) {
                this.A = 0.3f;
            } else {
                this.A = Math.min(f9, f14 / this.C);
            }
            float f15 = rectF.left;
            if (!this.n && !this.x) {
                f11 = 0.0f;
            }
            this.I = (this.C * this.A) + ((f15 + f11 + 21.33f + 3.25f + rectF.right) * f13);
            this.J = Math.max(f13 * 21.33f, this.B.getHeight() * this.A) + ((rectF.top + rectF.bottom) * f13);
            this.c = false;
        }
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.H || (document = this.w) == null) ? this.v : document;
    }

    public int getHeightInternal() {
        int round = Math.round(this.J);
        int i10 = this.F;
        return round + i10 + i10;
    }

    public float getRadius() {
        return this.J * 0.2f;
    }

    public String getText() {
        return this.b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.I);
        int i10 = this.E;
        return round + i10 + i10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        if (this.H) {
            this.s.onAttachedToWindow();
        } else {
            this.r.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        this.r.onDetachedFromWindow();
        this.s.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.H != z10 && this.G) {
            ImageReceiver imageReceiver = this.s;
            ImageReceiver imageReceiver2 = this.r;
            if (z10) {
                imageReceiver2.onDetachedFromWindow();
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onDetachedFromWindow();
            }
        }
        this.H = z10;
        invalidate();
    }

    public void setMaxWidth(int i10) {
        this.a = i10;
        this.c = true;
    }

    public void setText(String str) {
        this.b = str;
        this.c = true;
        requestLayout();
    }
}
