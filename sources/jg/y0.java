package jg;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g6;
import org.telegram.messenger.i6;
import org.telegram.messenger.ic;
import org.telegram.messenger.j6;
import org.telegram.messenger.k6;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class y0 extends View {
    public final float D;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final int I;
    public final int J;
    public boolean K;
    public boolean L;
    public float M;
    public float N;
    public final RectF O;
    public final t5 P;
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
    public TLRPC.Document w;
    public TLRPC.Document x;
    public boolean y;

    public y0(Context context, float f7) {
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
        this.E = 1.0f;
        this.O = new RectF();
        new Path();
        this.P = new t5(this, 350L, gr.h);
        this.D = f7;
        imageReceiver.A0 = true;
        imageReceiver.J0 = true;
        imageReceiver2.A0 = true;
        imageReceiver2.J0 = true;
        int i10 = (int) (3.0f * f7);
        this.I = i10;
        int i11 = (int) (1.0f * f7);
        this.J = i11;
        setPadding(i10, i11, i10, i11);
        this.h = i0.a.f(context, R.drawable.map_pin3);
        textPaint.setTextSize(f7 * 24.0f);
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        zs.i(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.Document b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.packs != null && tL_messages_stickerSet.documents != null) {
            for (int i10 = 0; i10 < tL_messages_stickerSet.packs.size(); i10++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
                String str2 = tL_stickerPack.emoticon;
                if (str2 != null && str != null) {
                    ArrayList j10 = k6.j(str2, null);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= j10.size()) {
                            break;
                        }
                        if (!TextUtils.equals(((i6) j10.get(i11)).c, str)) {
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
        }
        return null;
    }

    public static x0 c(String str) {
        g6 f7 = k6.f(str);
        if (f7 instanceof j6) {
            ((j6) f7).a = false;
        }
        if (f7 == null) {
            return null;
        }
        return new x0(f7, 0);
    }

    public final void a(Canvas canvas) {
        f();
        if (this.F == null) {
            return;
        }
        int i10 = this.I;
        float f7 = i10;
        int i11 = this.J;
        float f10 = i11;
        float f11 = this.M + f7;
        float f12 = this.N + f10;
        RectF rectF = this.O;
        rectF.set(f7, f10, f11, f12);
        float f13 = this.N * 0.2f;
        canvas.drawRoundRect(rectF, f13, f13, this.f);
        boolean z10 = this.n;
        float f14 = this.D;
        RectF rectF2 = this.d;
        if (z10) {
            float d = this.P.d(this.L);
            if (d > 0.0f) {
                float b10 = z20.b(rectF2.left, 2.25f, f14, f7);
                float f15 = f14 * 21.33f;
                float B = c3.i0.B(this.N, f15, 2.0f, f10);
                ImageReceiver imageReceiver = this.s;
                imageReceiver.y0(b10, B, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.r(), imageReceiver.s());
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (d < 1.0f) {
                float b11 = z20.b(rectF2.left, 2.25f, f14, f7);
                float f16 = f14 * 21.33f;
                float B2 = c3.i0.B(this.N, f16, 2.0f, f10);
                ImageReceiver imageReceiver2 = this.r;
                imageReceiver2.y0(b11, B2, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.r(), imageReceiver2.s());
                imageReceiver2.setAlpha(1.0f - d);
                imageReceiver2.h(canvas, null);
                canvas.restore();
            }
        } else if (!this.y) {
            float f17 = rectF2.left;
            float f18 = this.N;
            float f19 = f14 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f17 * f14)) + i10, ((int) ((f18 - f19) / 2.0f)) + i11, i10 + ((int) ((f17 + 21.33f) * f14)), i11 + ((int) ((f19 + f18) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.n || this.y) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f14) + f7, (this.N / 2.0f) + f10);
        float f20 = this.E;
        canvas.scale(f20, f20);
        canvas.translate(-this.H, (-this.F.getHeight()) / 2.0f);
        this.F.draw(canvas);
        canvas.restore();
    }

    public final void d(int i10, final String str) {
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.s;
        ImageReceiver imageReceiver2 = this.r;
        if (isEmpty) {
            this.n = false;
            this.w = null;
            this.x = null;
            imageReceiver2.f();
            imageReceiver.f();
            z10 = true;
        } else {
            this.n = true;
            this.w = null;
            this.x = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            final int i11 = 0;
            ui.b0(i10).l0(tL_inputStickerSetShortName, 0, false, false, new q20(this) { // from class: jg.w0
                public final /* synthetic */ y0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            y0 y0Var = this.b;
                            y0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = y0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            y0Var.w = b10;
                            y0Var.r.q0(ic.b(b10), "80_80", y0.c(str2), null, null, 0);
                            y0Var.s.u0(ic.b(y0Var.x), "80_80", ic.b(y0Var.w), "80_80", null, null, y0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            y0 y0Var2 = this.b;
                            y0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = y0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            y0Var2.x = b11;
                            if (b11 != null) {
                                y0Var2.s.u0(ic.b(b11), "80_80", ic.b(y0Var2.w), "80_80", null, null, y0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            final int i12 = 1;
            ui.b0(i10).l0(tL_inputStickerSetShortName2, 0, false, false, new q20(this) { // from class: jg.w0
                public final /* synthetic */ y0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i12) {
                        case 0:
                            y0 y0Var = this.b;
                            y0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = y0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            y0Var.w = b10;
                            y0Var.r.q0(ic.b(b10), "80_80", y0.c(str2), null, null, 0);
                            y0Var.s.u0(ic.b(y0Var.x), "80_80", ic.b(y0Var.w), "80_80", null, null, y0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            y0 y0Var2 = this.b;
                            y0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = y0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            y0Var2.x = b11;
                            if (b11 != null) {
                                y0Var2.s.u0(ic.b(b11), "80_80", ic.b(y0Var2.w), "80_80", null, null, y0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            z10 = true;
            imageReceiver2.q0(ic.b(this.w), "80_80", c(str), null, null, 0);
            imageReceiver.u0(ic.b(this.x), "80_80", ic.b(this.w), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.c = z10;
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
            int i12 = org.telegram.messenger.i0.B(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f7;
        if (this.c) {
            String str = this.b;
            TextPaint textPaint = this.e;
            float measureText = textPaint.measureText(str);
            int i10 = this.a;
            int i11 = this.I;
            float f10 = (i10 - i11) - i11;
            RectF rectF = this.d;
            float f11 = 2.25f;
            float f12 = rectF.left + ((this.n || this.y) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f13 = this.D;
            float f14 = f10 - (f12 * f13);
            float min = Math.min(1.0f, f14 / measureText);
            this.E = min;
            if (min < 0.4f) {
                f7 = 1.0f;
                String str2 = this.b;
                this.F = new StaticLayout(str2, textPaint, vh.p2.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f7 = 1.0f;
                this.F = new StaticLayout(this.b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.G = 0.0f;
            this.H = Float.MAX_VALUE;
            for (int i12 = 0; i12 < this.F.getLineCount(); i12++) {
                this.G = Math.max(this.G, this.F.getLineWidth(i12));
                this.H = Math.min(this.H, this.F.getLineLeft(i12));
            }
            if (this.F.getLineCount() > 2) {
                this.E = 0.3f;
            } else {
                this.E = Math.min(f7, f14 / this.G);
            }
            float f15 = rectF.left;
            if (!this.n && !this.y) {
                f11 = 0.0f;
            }
            this.M = (this.G * this.E) + ((f15 + f11 + 21.33f + 3.25f + rectF.right) * f13);
            this.N = Math.max(f13 * 21.33f, this.F.getHeight() * this.E) + ((rectF.top + rectF.bottom) * f13);
            this.c = false;
        }
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.L || (document = this.x) == null) ? this.w : document;
    }

    public int getHeightInternal() {
        int round = Math.round(this.N);
        int i10 = this.J;
        return round + i10 + i10;
    }

    public float getRadius() {
        return this.N * 0.2f;
    }

    public String getText() {
        return this.b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.M);
        int i10 = this.I;
        return round + i10 + i10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        if (this.L) {
            this.s.P();
        } else {
            this.r.P();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        this.r.R();
        this.s.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.L != z10 && this.K) {
            ImageReceiver imageReceiver = this.s;
            ImageReceiver imageReceiver2 = this.r;
            if (z10) {
                imageReceiver2.R();
                imageReceiver.P();
            } else {
                imageReceiver2.P();
                imageReceiver.R();
            }
        }
        this.L = z10;
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
