package dg;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class l1 extends View {
    public float B;
    public StaticLayout C;
    public float D;
    public float E;
    public final int F;
    public final int G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public final RectF L;
    public final z5 M;
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

    public l1(Context context, float f10) {
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
        this.B = 1.0f;
        this.L = new RectF();
        new Path();
        this.M = new z5(this, 350L, nr.h);
        this.y = f10;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i10 = (int) (3.0f * f10);
        this.F = i10;
        int i11 = (int) (1.0f * f10);
        this.G = i11;
        setPadding(i10, i11, i10, i11);
        this.h = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f10 * 24.0f);
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

    public static k1 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new k1(emojiBigDrawable, 0);
    }

    public final void a(Canvas canvas) {
        f();
        if (this.C == null) {
            return;
        }
        int i10 = this.F;
        float f10 = i10;
        int i11 = this.G;
        float f11 = i11;
        float f12 = this.J + f10;
        float f13 = this.K + f11;
        RectF rectF = this.L;
        rectF.set(f10, f11, f12, f13);
        float f14 = this.K * 0.2f;
        canvas.drawRoundRect(rectF, f14, f14, this.f);
        boolean z4 = this.n;
        float f15 = this.y;
        RectF rectF2 = this.d;
        if (z4) {
            float e = this.M.e(this.I);
            if (e > 0.0f) {
                float f16 = ((rectF2.left + 2.25f) * f15) + f10;
                float f17 = f15 * 21.33f;
                float x10 = e2.c.x(this.K, f17, 2.0f, f11);
                ImageReceiver imageReceiver = this.s;
                imageReceiver.setImageCoords(f16, x10, f17, f17);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e < 1.0f) {
                float f18 = ((rectF2.left + 2.25f) * f15) + f10;
                float f19 = f15 * 21.33f;
                float x11 = e2.c.x(this.K, f19, 2.0f, f11);
                ImageReceiver imageReceiver2 = this.r;
                imageReceiver2.setImageCoords(f18, x11, f19, f19);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.x) {
            float f20 = rectF2.left;
            float f21 = this.K;
            float f22 = f15 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f20 * f15)) + i10, ((int) ((f21 - f22) / 2.0f)) + i11, i10 + ((int) ((f20 + 21.33f) * f15)), i11 + ((int) ((f22 + f21) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.n || this.x) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f15) + f10, (this.K / 2.0f) + f11);
        float f23 = this.B;
        canvas.scale(f23, f23);
        canvas.translate(-this.E, (-this.C.getHeight()) / 2.0f);
        this.C.draw(canvas);
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
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) { // from class: dg.j1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            l1 l1Var = this.b;
                            l1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = l1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            l1Var.v = b10;
                            l1Var.r.setImage(ImageLocation.getForDocument(b10), "80_80", l1.c(str2), null, null, 0);
                            l1Var.s.setImage(ImageLocation.getForDocument(l1Var.w), "80_80", ImageLocation.getForDocument(l1Var.v), "80_80", null, null, l1.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            l1 l1Var2 = this.b;
                            l1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = l1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            l1Var2.w = b11;
                            if (b11 != null) {
                                l1Var2.s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(l1Var2.v), "80_80", null, null, l1.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            final int i12 = 1;
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) { // from class: dg.j1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            l1 l1Var = this.b;
                            l1Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = l1.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            l1Var.v = b10;
                            l1Var.r.setImage(ImageLocation.getForDocument(b10), "80_80", l1.c(str2), null, null, 0);
                            l1Var.s.setImage(ImageLocation.getForDocument(l1Var.w), "80_80", ImageLocation.getForDocument(l1Var.v), "80_80", null, null, l1.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            l1 l1Var2 = this.b;
                            l1Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = l1.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            l1Var2.w = b11;
                            if (b11 != null) {
                                l1Var2.s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(l1Var2.v), "80_80", null, null, l1.c(str3), 0L, null, null, 0);
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
        float f10;
        if (this.c) {
            String str = this.b;
            TextPaint textPaint = this.e;
            float measureText = textPaint.measureText(str);
            int i10 = this.a;
            int i11 = this.F;
            float f11 = (i10 - i11) - i11;
            RectF rectF = this.d;
            float f12 = 2.25f;
            float f13 = rectF.left + ((this.n || this.x) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f14 = this.y;
            float f15 = f11 - (f13 * f14);
            float min = Math.min(1.0f, f15 / measureText);
            this.B = min;
            if (min < 0.4f) {
                f10 = 1.0f;
                String str2 = this.b;
                this.C = new StaticLayout(str2, textPaint, ph.f3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f10 = 1.0f;
                this.C = new StaticLayout(this.b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.D = 0.0f;
            this.E = Float.MAX_VALUE;
            for (int i12 = 0; i12 < this.C.getLineCount(); i12++) {
                this.D = Math.max(this.D, this.C.getLineWidth(i12));
                this.E = Math.min(this.E, this.C.getLineLeft(i12));
            }
            if (this.C.getLineCount() > 2) {
                this.B = 0.3f;
            } else {
                this.B = Math.min(f10, f15 / this.D);
            }
            float f16 = rectF.left;
            if (!this.n && !this.x) {
                f12 = 0.0f;
            }
            this.J = (this.D * this.B) + ((f16 + f12 + 21.33f + 3.25f + rectF.right) * f14);
            this.K = Math.max(f14 * 21.33f, this.C.getHeight() * this.B) + ((rectF.top + rectF.bottom) * f14);
            this.c = false;
        }
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.I || (document = this.w) == null) ? this.v : document;
    }

    public int getHeightInternal() {
        int round = Math.round(this.K);
        int i10 = this.G;
        return round + i10 + i10;
    }

    public float getRadius() {
        return this.K * 0.2f;
    }

    public String getText() {
        return this.b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.J);
        int i10 = this.F;
        return round + i10 + i10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = true;
        if (this.I) {
            this.s.onAttachedToWindow();
        } else {
            this.r.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = false;
        this.r.onDetachedFromWindow();
        this.s.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z4) {
        if (this.I != z4 && this.H) {
            ImageReceiver imageReceiver = this.s;
            ImageReceiver imageReceiver2 = this.r;
            if (z4) {
                imageReceiver2.onDetachedFromWindow();
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onDetachedFromWindow();
            }
        }
        this.I = z4;
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
