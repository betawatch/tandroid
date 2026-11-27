// default package

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dy4 {
    public static final HashMap Y;
    public StaticLayout A;
    public TextPaint B;
    public TextPaint C;
    public TextPaint D;
    public TextPaint E;
    public TextPaint F;
    public Paint G;
    public TextPaint H;
    public Paint I;
    public Paint J;
    public Paint K;
    public Paint L;
    public RectF M;
    public RectF N;
    public Rect O;
    public Rect P;
    public int[] Q;
    public int R;
    public hf0 S;
    public r47 T;
    public boolean U;
    public ImageReceiver[] a;
    public rb0[] b;
    public final wb2 c;
    public ImageReceiver d;
    public CharSequence[] e;
    public TLRPC.Chat[] f;
    public float[] g;
    public boolean[] h;
    public Rect[] i;
    public boolean[] j;
    public int m;
    public float n;
    public String o;
    public int p;
    public int q;
    public int r;
    public int s;
    public Drawable t;
    public String u;
    public int v;
    public StaticLayout w;
    public StaticLayout x;
    public StaticLayout y;
    public StaticLayout z;
    public int k = 0;
    public int l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        c00.r(1, hashMap, "1⃣", 3, "2⃣");
        c00.r(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public dy4(wb2 wb2Var) {
        this.c = wb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        r47 r47Var = this.T;
        if (r47Var != null && r47Var.u3()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i = 0;
                while (true) {
                    Rect[] rectArr = this.i;
                    if (i < rectArr.length) {
                        if (rectArr[i].contains(x, y)) {
                            this.V = i;
                            this.S.setHotspot(x, y);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i++;
                    } else if (this.P.contains(x, y)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    wb2 wb2Var = this.c;
                    if (wb2Var.getDelegate() != null) {
                        wb2Var.getDelegate().h0(wb2Var, this.V);
                    }
                    wb2Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    r47 r47Var2 = this.T;
                    if (r47Var2 != null && r47Var2.k != null) {
                        on0.e(r47Var2, new te2(r47Var2, (byte) 6), new bm0((byte) 1));
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 2 && motionEvent.getAction() == 3) {
                if (this.W) {
                    c(false);
                }
                this.W = false;
                this.X = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i, int i2, vnb vnbVar) {
        float f;
        float f2;
        int e;
        int i3;
        Canvas canvas2 = canvas;
        r47 r47Var = this.T;
        if (r47Var == null || !r47Var.u3()) {
            return;
        }
        hf0 hf0Var = this.S;
        wb2 wb2Var = this.c;
        int i4 = 0;
        if (hf0Var == null) {
            int w0 = aob.w0(null, aob.i6, false);
            this.R = w0;
            hf0 Y2 = aob.Y(w0, 12, 12);
            this.S = Y2;
            Y2.setCallback(wb2Var);
        }
        this.E.setColor(aob.o2.getColor());
        this.F.setColor(aob.p1(0.45f, aob.o2.getColor()));
        this.G.setColor(aob.p1(0.15f, aob.o2.getColor()));
        this.H.setColor(aob.o2.getColor());
        boolean O3 = this.T.O3();
        TextPaint textPaint = this.D;
        if (O3) {
            int i5 = aob.Ob;
            textPaint.setColor(aob.v0(i5, vnbVar));
            this.I.setColor(aob.v0(i5, vnbVar));
            this.J.setColor(aob.v0(aob.Rb, vnbVar));
        } else {
            int i6 = aob.Bd;
            textPaint.setColor(aob.v0(i6, vnbVar));
            this.I.setColor(aob.v0(i6, vnbVar));
            this.J.setColor(aob.v0(aob.Ld, vnbVar));
        }
        if (this.U) {
            this.I.setColor(aob.v0(aob.Wk, vnbVar));
        }
        canvas2.save();
        int L = i2 - hl.L(4.0f);
        canvas2.translate(L, i);
        this.P.set(L, i, this.l + L, this.k + i);
        canvas2.saveLayer(0.0f, 0.0f, this.l, this.k, this.K, 31);
        this.d.h(canvas2, null);
        float f3 = this.l / 2.0f;
        float L2 = hl.L(106.0f);
        int L3 = hl.L(12.0f) + this.O.width();
        int L4 = hl.L(10.0f) + this.O.height();
        this.M.set(f3 - ((hl.L(2.0f) + L3) / 2.0f), L2 - ((hl.L(2.0f) + L4) / 2.0f), ((hl.L(2.0f) + L3) / 2.0f) + f3, ((hl.L(2.0f) + L4) / 2.0f) + L2);
        canvas2.drawRoundRect(this.M, hl.L(11.0f), hl.L(11.0f), this.L);
        float f4 = L3 / 2.0f;
        float f5 = L4 / 2.0f;
        this.M.set(f3 - f4, L2 - f5, f3 + f4, L2 + f5);
        canvas2.drawRoundRect(this.M, hl.L(10.0f), hl.L(10.0f), this.I);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setBounds(hl.L(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - hl.L(6.96f), hl.L(21.24f) + ((int) this.M.left), hl.L(6.96f) + ((int) this.M.centerY()));
            this.t.draw(canvas2);
        }
        canvas2.drawText(this.u, this.M.centerX() + hl.L(this.U ? 8.0f : 0.0f), this.M.centerY() + hl.L(4.0f), this.U ? this.C : this.B);
        canvas2.restore();
        canvas2.translate(0.0f, hl.L(128.0f));
        int L5 = hl.L(128.0f) + i;
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.w.draw(canvas2);
        canvas2.translate(0.0f, this.p);
        float f6 = 6.0f;
        if (this.x != null) {
            canvas2.restore();
            canvas2.save();
            float L6 = (this.p + this.m) - hl.L(6.0f);
            float f7 = this.l / 2.0f;
            canvas2.drawText(this.o, f7, L6, this.F);
            f = 16.0f;
            canvas2.drawLine(hl.L(17.0f), L6 - hl.L(4.0f), (f7 - (this.n / 2.0f)) - hl.L(6.0f), L6 - hl.L(4.0f), this.G);
            canvas2 = canvas;
            canvas2.drawLine(hl.L(6.0f) + (this.n / 2.0f) + f7, L6 - hl.L(4.0f), this.l - hl.L(16.0f), L6 - hl.L(4.0f), this.G);
            canvas2.translate((this.l - this.x.getWidth()) / 2.0f, this.p);
            this.x.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(this.v / 2.0f, this.m + this.p);
        } else {
            f = 16.0f;
        }
        this.y.draw(canvas2);
        canvas2.restore();
        canvas2.translate(0.0f, hl.L(6.0f) + this.q);
        int w = uh9.w(6.0f, this.q, L5);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            boolean[] zArr = this.j;
            if (i7 >= zArr.length) {
                break;
            }
            if (zArr[i7]) {
                canvas2.save();
                int i9 = i7;
                float f8 = 0.0f;
                while (true) {
                    f2 = f6;
                    f8 += this.g[i9] + hl.L(40.0f);
                    i9++;
                    boolean[] zArr2 = this.j;
                    if (i9 >= zArr2.length || this.h[i9] || !zArr2[i9]) {
                        break;
                    } else {
                        f6 = f2;
                    }
                }
                float f9 = f3 - (f8 / 2.0f);
                canvas2.translate(f9, 0.0f);
                int i10 = ((int) f9) + L;
                int i11 = i7;
                while (true) {
                    TLRPC.Chat chat = this.f[i11];
                    if (this.T.O3()) {
                        e = aob.v0(aob.Ob, vnbVar);
                    } else {
                        int F = xc2.F(chat);
                        if (F < 7) {
                            e = aob.v0(aob.r8[F], vnbVar);
                        } else {
                            lc7 lc7Var = uc7.s1(yac.t0).E3;
                            kc7 d = lc7Var == null ? null : lc7Var.d(F);
                            e = d != null ? d.e(i4, vnbVar) : aob.v0(aob.r8[i4], vnbVar);
                        }
                    }
                    int i12 = this.V;
                    i3 = (i12 < 0 || i12 != i11) ? i8 : e;
                    this.D.setColor(e);
                    this.J.setColor(e);
                    this.J.setAlpha(25);
                    this.a[i11].h(canvas2, null);
                    CharSequence charSequence = this.e[i11];
                    int i13 = i10;
                    canvas2.drawText(charSequence, 0, charSequence.length(), hl.L(30.0f), hl.L(f), this.D);
                    this.N.set(0.0f, 0.0f, this.g[i11] + hl.L(40.0f), hl.L(24.0f));
                    canvas2.drawRoundRect(this.N, hl.L(12.0f), hl.L(12.0f), this.J);
                    float f10 = i13;
                    this.i[i11].set(i13, w, (int) (this.N.width() + f10), hl.L(24.0f) + w);
                    canvas2.translate(this.N.width() + hl.L(f2), 0.0f);
                    i10 = (int) (this.N.width() + hl.L(f2) + f10);
                    i11++;
                    boolean[] zArr3 = this.j;
                    if (i11 >= zArr3.length || this.h[i11] || !zArr3[i11]) {
                        break;
                    }
                    i8 = i3;
                    i4 = 0;
                }
                canvas2.restore();
                canvas2.translate(0.0f, hl.L(30.0f));
                w += hl.L(30.0f);
                i7 = i11;
                i8 = i3;
                i4 = 0;
                f6 = f2;
            } else {
                i7++;
                i4 = 0;
            }
        }
        float f11 = f6;
        if (this.A != null) {
            canvas2.save();
            canvas2.translate((this.l - this.A.getWidth()) / 2.0f, hl.L(4.0f));
            this.A.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, this.s);
        }
        canvas2.translate(0.0f, hl.L(f11));
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.z.draw(canvas2);
        canvas2.restore();
        canvas2.restore();
        if (this.V >= 0) {
            int p1 = aob.p1(aob.I.o() ? 0.12f : 0.1f, i8);
            if (this.R != p1) {
                hf0 hf0Var2 = this.S;
                this.R = p1;
                aob.F1(hf0Var2, p1, true);
            }
            this.S.setBounds(this.i[this.V]);
            this.S.setCallback(wb2Var);
        }
    }

    public final void c(boolean z) {
        hf0 hf0Var;
        r47 r47Var = this.T;
        if (r47Var == null || !r47Var.u3() || (hf0Var = this.S) == null) {
            return;
        }
        wb2 wb2Var = this.c;
        if (!z) {
            hf0Var.setState(StateSet.NOTHING);
            wb2Var.invalidate();
        } else {
            hf0Var.setCallback(new jn(this, (byte) 5));
            this.S.setState(this.Q);
            wb2Var.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v47 */
    public final void d(int i, int i2, r47 r47Var) {
        float f;
        boolean z;
        float f2;
        TLRPC.Document document;
        String str;
        String str2;
        this.T = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        boolean z2 = false;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0.0f;
        if (r47Var.u3()) {
            this.T = r47Var;
            float f3 = 12.0f;
            boolean z3 = true;
            if (this.B == null) {
                this.B = new TextPaint(1);
                this.C = new TextPaint(1);
                this.D = new TextPaint(1);
                this.E = new TextPaint(1);
                this.F = new TextPaint(1);
                this.G = new Paint(1);
                this.H = new TextPaint(1);
                this.I = new Paint(1);
                this.J = new Paint(1);
                this.K = new Paint();
                this.L = new Paint();
                this.M = new RectF();
                this.N = new RectF();
                this.O = new Rect();
                this.P = new Rect();
                this.Q = new int[]{R.attr.state_enabled, R.attr.state_pressed};
                this.e = new CharSequence[10];
                this.f = new TLRPC.Chat[10];
                this.g = new float[10];
                this.h = new boolean[10];
                this.i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.c);
                this.d = imageReceiver;
                imageReceiver.A1 = true;
                Paint paint = this.L;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTypeface(hl.o());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(hl.L(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(hl.o());
                this.C.setTextSize(hl.L(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(hl.o());
                this.D.setTextSize(hl.L(13.0f));
                this.H.setTextSize(hl.L(13.0f));
                this.E.setTextSize(hl.L(14.0f));
                this.F.setTextSize(hl.L(14.0f));
                this.F.setTextAlign(align);
            }
            float f4 = 18.0f;
            if (this.a == null) {
                this.a = new ImageReceiver[10];
                this.b = new rb0[10];
                this.j = new boolean[10];
                int i3 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.a;
                    if (i3 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i3] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver2 = this.a[i3];
                    imageReceiver2.A1 = true;
                    imageReceiver2.q0(hl.L(12.0f));
                    this.b[i3] = new rb0((vnb) null);
                    this.b[i3].s(hl.L(18.0f));
                    this.i[i3] = new Rect();
                    i3++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) r47Var.k.media;
            String str3 = yac.h(yac.t0).c0;
            int i4 = yac.t0;
            if (str3 == null) {
                ls6.d0(i4).B();
                f = 12.0f;
                z = true;
                f2 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet q0 = ls6.d0(i4).q0(str3);
                if (q0 == null) {
                    q0 = ls6.d0(yac.t0).o0(str3);
                }
                if (q0 != null) {
                    String str4 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = q0.packs;
                    int size = arrayList.size();
                    document = null;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            f = f3;
                            z = z3;
                            f2 = f4;
                            break;
                        }
                        TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i5);
                        i5++;
                        TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                        f = f3;
                        if (Objects.equals(tL_stickerPack2.emoticon, str4)) {
                            ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                            int size2 = arrayList2.size();
                            f2 = f4;
                            ?? r9 = z2;
                            while (true) {
                                if (r9 >= size2) {
                                    str = str4;
                                    z = z3;
                                    break;
                                }
                                Long l = arrayList2.get(r9);
                                int i6 = r9 + 1;
                                long longValue = l.longValue();
                                ArrayList<TLRPC.Document> arrayList3 = q0.documents;
                                int size3 = arrayList3.size();
                                z = z3;
                                ?? r8 = z2;
                                while (true) {
                                    if (r8 >= size3) {
                                        str = str4;
                                        break;
                                    }
                                    TLRPC.Document document2 = arrayList3.get(r8);
                                    int i7 = r8 + 1;
                                    TLRPC.Document document3 = document2;
                                    ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                    str = str4;
                                    if (document3.id == longValue) {
                                        document = document3;
                                        break;
                                    } else {
                                        str4 = str;
                                        arrayList3 = arrayList4;
                                        r8 = i7;
                                    }
                                }
                                if (document != null) {
                                    break;
                                }
                                z3 = z;
                                str4 = str;
                                z2 = false;
                                r9 = i6;
                            }
                        } else {
                            str = str4;
                            z = z3;
                            f2 = f4;
                        }
                        if (document != null) {
                            break;
                        }
                        f3 = f;
                        f4 = f2;
                        z3 = z;
                        str4 = str;
                        z2 = false;
                    }
                    if (document != null || q0.documents.isEmpty()) {
                        z2 = false;
                    } else {
                        z2 = false;
                        document = q0.documents.get(0);
                    }
                } else {
                    f = 12.0f;
                    z = true;
                    f2 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    ggb d = lp3.d(document.thumbs, aob.c7, 0.2f, z2);
                    if (d != null) {
                        d.e = 512;
                        d.f = 512;
                    }
                    this.d.d0(jn5.b(document), "160_160_firstframe", d, "tgs", q0, 1);
                } else {
                    ls6.d0(yac.t0).d1(str3, false, q0 == null ? z : false);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) r47Var.k.media;
            this.U = (tL_messageMediaGiveaway2.flags & 32) != 0 ? z : false;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.b = (rb0[]) Arrays.copyOf(this.b, size4);
                this.j = Arrays.copyOf(this.j, size4);
                this.e = (CharSequence[]) Arrays.copyOf(this.e, size4);
                this.g = Arrays.copyOf(this.g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.i = (Rect[]) Arrays.copyOf(this.i, size4);
                this.f = (TLRPC.Chat[]) Arrays.copyOf(this.f, size4);
                int i8 = length - 1;
                while (i8 < size4) {
                    this.a[i8] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver3 = this.a[i8];
                    imageReceiver3.A1 = z;
                    imageReceiver3.q0(hl.L(f));
                    this.b[i8] = new rb0((vnb) null);
                    this.b[i8].s(hl.L(f2));
                    this.i[i8] = new Rect();
                    i8++;
                    z = true;
                }
            }
            int L = hl.L(148.0f);
            int P0 = hl.O1() ? hl.P0() - hl.L(80.0f) : i - hl.L(80.0f);
            uc7 s1 = uc7.s1(yac.t0);
            boolean l3 = r47.l3(r47Var.k);
            TLRPC.Message message = r47Var.k;
            boolean V = xc2.V(s1.M0(Long.valueOf(-r47.B1(l3 ? message.fwd_from.from_id : message.peer_id))));
            SpannableStringBuilder S2 = hl.S2(ob6.M0(2131753386, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(S2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, S2.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) hl.S2(ob6.H(',', "BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) hl.S2(ob6.G(tL_messageMediaGiveaway2.quantity, "BoostingStarsGiveawayMsgInfoPlural2", new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) hl.S2(ob6.H(',', "BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) hl.S2(ob6.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgInfoPlural2", ob6.G(tL_messageMediaGiveaway2.months, "BoldMonths", new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder S22 = hl.S2(ob6.M0(2131753403, "BoostingGiveawayMsgParticipants"));
            spannableStringBuilder3.append((CharSequence) S22);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, S22.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                spannableStringBuilder3.append((CharSequence) ob6.G(tL_messageMediaGiveaway2.channels.size(), V ? "BoostingGiveawayMsgNewSubsPlural" : "BoostingGiveawayMsgNewSubsGroupPlural", new Object[0]));
            } else {
                spannableStringBuilder3.append((CharSequence) ob6.G(tL_messageMediaGiveaway2.channels.size(), V ? "BoostingGiveawayMsgAllSubsPlural" : "BoostingGiveawayMsgAllSubsGroupPlural", new Object[0]));
            }
            SpannableStringBuilder S23 = hl.S2(ob6.M0(2131753161, "BoostingWinnersDate"));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(S23);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, S23.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = ob6.D0().r0().format(date);
            String format2 = ob6.D0().o0().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) ob6.a0("formatDateAtTime", null, 2131742414, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float L2 = hl.L(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.w = o0b.c(spannableStringBuilder, textPaint2, P0, alignment, L2, truncateAt, P0, 10, true);
            this.y = o0b.c(spannableStringBuilder3, this.E, P0, alignment, hl.L(2.0f), truncateAt, P0, 10, true);
            this.z = o0b.c(spannableStringBuilder4, this.E, P0, alignment, hl.L(3.0f), truncateAt, P0, 10, true);
            int i9 = 0;
            for (int i10 = 0; i10 < this.w.getLineCount(); i10++) {
                i9 = (int) Math.max(i9, Math.ceil(this.w.getLineWidth(i10)));
            }
            for (int i11 = 0; i11 < this.y.getLineCount(); i11++) {
                i9 = (int) Math.max(i9, Math.ceil(this.y.getLineWidth(i11)));
            }
            for (int i12 = 0; i12 < this.z.getLineCount(); i12++) {
                i9 = (int) Math.max(i9, Math.ceil(this.z.getLineWidth(i12)));
            }
            if (i9 < hl.L(180.0f)) {
                i9 = hl.L(180.0f);
            }
            int i13 = i9;
            String str5 = tL_messageMediaGiveaway2.prize_description;
            if (str5 != null && !str5.isEmpty()) {
                StaticLayout c = o0b.c(pv3.m(hl.S2(ob6.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false, null, 0), this.E, i13, Layout.Alignment.ALIGN_CENTER, hl.L(2.0f), TextUtils.TruncateAt.END, i13, 20, true);
                this.x = c;
                this.m = hl.L(22.0f) + c.getLineBottom(c.getLineCount() - 1);
                String M0 = ob6.M0(2131753399, null);
                this.o = M0;
                this.n = this.F.measureText(M0, 0, M0.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i14 = 0;
                while (i14 < size5) {
                    String str6 = arrayList6.get(i14);
                    i14++;
                    String str7 = str6;
                    String displayCountry = new Locale("", str7).getDisplayCountry(Locale.getDefault());
                    String E0 = ob6.E0(str7);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (E0 != null) {
                        spannableStringBuilder5.append((CharSequence) E0).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = o0b.c(pv3.m(hl.S2(ob6.a0("BoostingGiveAwayFromCountries", null, 2131753486, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false, null, 0), this.H, i13, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, i13, 10, true);
                }
            }
            int max = Math.max(i2, Math.min(hl.L(38.0f) + i13, P0));
            this.v = max - P0;
            float f5 = max;
            float f6 = L;
            float f7 = f6 / 2.0f;
            this.d.i0((f5 / 2.0f) - f7, hl.L(42.0f) - f7, f6, f6);
            int L3 = hl.L(5.0f) + this.w.getLineBottom(r1.getLineCount() - 1);
            this.p = L3;
            this.q = this.y.getLineBottom(r1.getLineCount() - 1) + L3 + this.m;
            this.r = this.z.getLineBottom(r1.getLineCount() - 1);
            StaticLayout staticLayout = this.A;
            int lineBottom = staticLayout != null ? staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + hl.L(f) : 0;
            this.s = lineBottom;
            int i15 = this.k + this.q + lineBottom + this.r;
            this.k = i15;
            this.k = hl.L(128.0f) + i15;
            this.l = max;
            if (this.U) {
                if (this.t == null) {
                    this.t = c00.e(a.b, org.telegram.messenger.beta.R.drawable.filled_giveaway_stars);
                }
                str2 = ob6.E((int) tL_messageMediaGiveaway2.stars, ',');
                this.u = str2;
            } else {
                this.t = null;
                str2 = "x" + tL_messageMediaGiveaway2.quantity;
                this.u = str2;
            }
            this.B.getTextBounds(str2, 0, str2.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = hl.L(20.0f) + rect.right;
            }
            Arrays.fill(this.j, false);
            this.k = hl.L(30.0f) + this.k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i16 = 0;
            while (i16 < size6) {
                Long l2 = arrayList8.get(i16);
                i16++;
                Long l4 = l2;
                if (uc7.s1(yac.t0).M0(l4) != null) {
                    arrayList7.add(l4);
                }
            }
            float f8 = 0.0f;
            for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                Long l5 = (Long) arrayList7.get(i17);
                long longValue2 = l5.longValue();
                TLRPC.Chat M02 = uc7.s1(yac.t0).M0(l5);
                if (M02 != null) {
                    this.j[i17] = true;
                    this.f[i17] = M02;
                    this.e[i17] = TextUtils.ellipsize(pv3.m(M02.title, this.D.getFontMetricsInt(), false, null, 0), this.D, 0.8f * f5, TextUtils.TruncateAt.END);
                    float[] fArr = this.g;
                    TextPaint textPaint3 = this.D;
                    CharSequence charSequence = this.e[i17];
                    fArr[i17] = textPaint3.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.g[i17] + hl.L(40.0f);
                    f8 += L4;
                    boolean[] zArr = this.h;
                    if (i17 > 0) {
                        boolean z4 = f8 > 0.9f * f5;
                        zArr[i17] = z4;
                        if (z4) {
                            this.k = hl.L(30.0f) + this.k;
                            f8 = L4;
                        }
                    } else {
                        zArr[i17] = false;
                    }
                    this.b[i17].p(M02);
                    this.a[i17].U(M02, this.b[i17], null);
                    this.a[i17].i0(0.0f, 0.0f, hl.L(24.0f), hl.L(24.0f));
                } else {
                    this.f[i17] = null;
                    this.j[i17] = false;
                    this.e[i17] = "";
                    this.h[i17] = false;
                    this.g[i17] = hl.L(20.0f);
                    this.b[i17].j(longValue2, "", "", null);
                }
            }
        }
    }
}
