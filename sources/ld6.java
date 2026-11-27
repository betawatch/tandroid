// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class ld6 extends View {
    public final float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final int J;
    public final int K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public final RectF P;
    public final mm Q;
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

    public ld6(Context context, float f) {
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
        this.F = 1.0f;
        this.P = new RectF();
        this.Q = new mm(350L, this, k43.h);
        this.E = f;
        imageReceiver.B0 = true;
        imageReceiver.K0 = true;
        imageReceiver2.B0 = true;
        imageReceiver2.K0 = true;
        int i = (int) (3.0f * f);
        this.J = i;
        int i2 = (int) (1.0f * f);
        this.K = i2;
        setPadding(i, i2, i, i2);
        this.h = c00.e(context, R.drawable.map_pin3);
        textPaint.setTextSize(f * 24.0f);
        textPaint.setTypeface(hl.n1("fonts/rcondensedbold.ttf"));
        jn7.i(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.Document b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.packs != null && tL_messages_stickerSet.documents != null) {
            for (int i = 0; i < tL_messages_stickerSet.packs.size(); i++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i);
                String str2 = tL_stickerPack.emoticon;
                if (str2 != null && str != null) {
                    ArrayList j = pv3.j(str2, null);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= j.size()) {
                            break;
                        }
                        if (!TextUtils.equals(((nv3) j.get(i2)).c, str)) {
                            i2++;
                        } else if (tL_stickerPack.documents.isEmpty()) {
                            continue;
                        } else {
                            long longValue = tL_stickerPack.documents.get(0).longValue();
                            for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                                if (tL_messages_stickerSet.documents.get(i3).id == longValue) {
                                    return tL_messages_stickerSet.documents.get(i3);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static g6 c(String str) {
        lv3 f = pv3.f(str);
        if (f instanceof ov3) {
            ((ov3) f).a = false;
        }
        if (f == null) {
            return null;
        }
        return new g6(f, (byte) 5);
    }

    public final void a(Canvas canvas) {
        f();
        if (this.G == null) {
            return;
        }
        int i = this.J;
        float f = i;
        int i2 = this.K;
        float f2 = i2;
        float f3 = this.N + f;
        float f4 = this.O + f2;
        RectF rectF = this.P;
        rectF.set(f, f2, f3, f4);
        float f5 = this.O * 0.2f;
        canvas.drawRoundRect(rectF, f5, f5, this.f);
        boolean z = this.n;
        float f6 = this.E;
        RectF rectF2 = this.d;
        if (z) {
            float d = this.Q.d(this.M);
            if (d > 0.0f) {
                float v = uh9.v(rectF2.left, 2.25f, f6, f);
                float f7 = f6 * 21.33f;
                float z2 = bp1.z(this.O, f7, 2.0f, f2);
                ImageReceiver imageReceiver = this.s;
                imageReceiver.i0(v, z2, f7, f7);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.r(), imageReceiver.s());
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (d < 1.0f) {
                float v2 = uh9.v(rectF2.left, 2.25f, f6, f);
                float f8 = f6 * 21.33f;
                float z3 = bp1.z(this.O, f8, 2.0f, f2);
                ImageReceiver imageReceiver2 = this.r;
                imageReceiver2.i0(v2, z3, f8, f8);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.r(), imageReceiver2.s());
                imageReceiver2.setAlpha(1.0f - d);
                imageReceiver2.h(canvas, null);
                canvas.restore();
            }
        } else if (!this.y) {
            float f9 = rectF2.left;
            float f10 = this.O;
            float f11 = f6 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f9 * f6)) + i, ((int) ((f10 - f11) / 2.0f)) + i2, i + ((int) ((f9 + 21.33f) * f6)), i2 + ((int) ((f11 + f10) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.n || this.y) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f6) + f, (this.O / 2.0f) + f2);
        float f12 = this.F;
        canvas.scale(f12, f12);
        canvas.translate(-this.I, (-this.G.getHeight()) / 2.0f);
        this.G.draw(canvas);
        canvas.restore();
    }

    public final void d(int i, final String str) {
        final byte b = 0;
        boolean isEmpty = TextUtils.isEmpty(str);
        final byte b2 = 1;
        ImageReceiver imageReceiver = this.s;
        ImageReceiver imageReceiver2 = this.r;
        if (isEmpty) {
            this.n = false;
            this.w = null;
            this.x = null;
            imageReceiver2.f();
            imageReceiver.f();
        } else {
            this.n = true;
            this.w = null;
            this.x = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            ls6.d0(i).m0(tL_inputStickerSetShortName, 0, false, false, new pcc(this) { // from class: kd6
                public final /* synthetic */ ld6 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b3 = b;
                    String str2 = str;
                    ld6 ld6Var = this.b;
                    switch (b3) {
                        case 0:
                            ld6Var.getClass();
                            TLRPC.Document b4 = ld6.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            ld6Var.w = b4;
                            ld6Var.r.d0(jn5.b(b4), "80_80", ld6.c(str2), null, null, 0);
                            ld6Var.s.Y(jn5.b(ld6Var.x), "80_80", jn5.b(ld6Var.w), "80_80", null, null, ld6.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            ld6Var.getClass();
                            TLRPC.Document b5 = ld6.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            ld6Var.x = b5;
                            if (b5 != null) {
                                ld6Var.s.Y(jn5.b(b5), "80_80", jn5.b(ld6Var.w), "80_80", null, null, ld6.c(str2), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            ls6.d0(i).m0(tL_inputStickerSetShortName2, 0, false, false, new pcc(this) { // from class: kd6
                public final /* synthetic */ ld6 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b3 = b2;
                    String str2 = str;
                    ld6 ld6Var = this.b;
                    switch (b3) {
                        case 0:
                            ld6Var.getClass();
                            TLRPC.Document b4 = ld6.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            ld6Var.w = b4;
                            ld6Var.r.d0(jn5.b(b4), "80_80", ld6.c(str2), null, null, 0);
                            ld6Var.s.Y(jn5.b(ld6Var.x), "80_80", jn5.b(ld6Var.w), "80_80", null, null, ld6.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            ld6Var.getClass();
                            TLRPC.Document b5 = ld6.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            ld6Var.x = b5;
                            if (b5 != null) {
                                ld6Var.s.Y(jn5.b(b5), "80_80", jn5.b(ld6Var.w), "80_80", null, null, ld6.c(str2), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            imageReceiver2.d0(jn5.b(this.w), "80_80", c(str), null, null, 0);
            imageReceiver.Y(jn5.b(this.x), "80_80", jn5.b(this.w), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.c = true;
        requestLayout();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i, int i2) {
        Paint paint = this.f;
        Drawable drawable = this.h;
        TextPaint textPaint = this.e;
        if (i == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i2);
            int i3 = hl.B(i2) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i3);
            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f;
        float min;
        if (this.c) {
            String str = this.b;
            TextPaint textPaint = this.e;
            float measureText = textPaint.measureText(str);
            int i = this.a;
            int i2 = this.J;
            float f2 = (i - i2) - i2;
            RectF rectF = this.d;
            float f3 = 2.25f;
            float f4 = rectF.left + ((this.n || this.y) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f5 = this.E;
            float f6 = f2 - (f4 * f5);
            float min2 = Math.min(1.0f, f6 / measureText);
            this.F = min2;
            if (min2 < 0.4f) {
                f = 1.0f;
                String str2 = this.b;
                this.G = new StaticLayout(str2, textPaint, kg5.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f = 1.0f;
                this.G = new StaticLayout(this.b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.H = 0.0f;
            this.I = Float.MAX_VALUE;
            for (int i3 = 0; i3 < this.G.getLineCount(); i3++) {
                this.H = Math.max(this.H, this.G.getLineWidth(i3));
                this.I = Math.min(this.I, this.G.getLineLeft(i3));
            }
            if (this.G.getLineCount() > 2) {
                min = 0.3f;
                this.F = 0.3f;
            } else {
                min = Math.min(f, f6 / this.H);
                this.F = min;
            }
            float f7 = rectF.left;
            if (!this.n && !this.y) {
                f3 = 0.0f;
            }
            this.N = (this.H * min) + ((f7 + f3 + 21.33f + 3.25f + rectF.right) * f5);
            this.O = Math.max(f5 * 21.33f, this.G.getHeight() * this.F) + ((rectF.top + rectF.bottom) * f5);
            this.c = false;
        }
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.M || (document = this.x) == null) ? this.w : document;
    }

    public int getHeightInternal() {
        int round = Math.round(this.O);
        int i = this.K;
        return round + i + i;
    }

    public float getRadius() {
        return this.O * 0.2f;
    }

    public String getText() {
        return this.b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.N);
        int i = this.J;
        return round + i + i;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        if (this.M) {
            this.s.I();
        } else {
            this.r.I();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L = false;
        this.r.K();
        this.s.K();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z) {
        if (this.M != z && this.L) {
            ImageReceiver imageReceiver = this.s;
            ImageReceiver imageReceiver2 = this.r;
            if (z) {
                imageReceiver2.K();
                imageReceiver.I();
            } else {
                imageReceiver2.I();
                imageReceiver.K();
            }
        }
        this.M = z;
        invalidate();
    }

    public void setMaxWidth(int i) {
        this.a = i;
        this.c = true;
    }

    public void setText(String str) {
        this.b = str;
        this.c = true;
        requestLayout();
    }
}
