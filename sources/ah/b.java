package ah;

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
import ei.e;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import k2.p1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.jz;
import org.telegram.messenger.k5;
import org.telegram.messenger.li;
import org.telegram.messenger.t0;
import org.telegram.messenger.t3;
import org.telegram.messenger.t5;
import org.telegram.messenger.wo;
import org.telegram.messenger.xo;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.u8;
import xg.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b {
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
    public y S;
    public zi T;
    public boolean U;
    public ImageReceiver[] a;
    public u8[] b;
    public final q1 c;
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
        com.google.android.recaptcha.internal.a.w(1, hashMap, "1⃣", 3, "2⃣");
        com.google.android.recaptcha.internal.a.w(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public b(q1 q1Var) {
        this.c = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        zi ziVar = this.T;
        if (ziVar != null && ziVar.v3()) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i3 = 0;
                while (true) {
                    Rect[] rectArr = this.i;
                    if (i3 < rectArr.length) {
                        if (rectArr[i3].contains(x10, y9)) {
                            this.V = i3;
                            this.S.setHotspot(x10, y9);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i3++;
                    } else if (this.P.contains(x10, y9)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    q1 q1Var = this.c;
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().z1(q1Var, this.V);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    zi ziVar2 = this.T;
                    if (ziVar2 != null && ziVar2.k != null) {
                        s.d(ziVar2, new xg.d(ziVar2, 0), new e(28));
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

    public final void b(Canvas canvas, int i3, int i10, e6 e6Var) {
        float f10;
        float f11;
        int e10;
        int i11;
        Canvas canvas2 = canvas;
        zi ziVar = this.T;
        if (ziVar == null || !ziVar.v3()) {
            return;
        }
        y yVar = this.S;
        q1 q1Var = this.c;
        int i12 = 0;
        if (yVar == null) {
            int x02 = k6.x0(null, k6.i6, false);
            this.R = x02;
            y a02 = k6.a0(x02, 12, 12);
            this.S = a02;
            a02.setCallback(q1Var);
        }
        this.E.setColor(k6.o2.getColor());
        this.F.setColor(k6.r1(0.45f, k6.o2.getColor()));
        this.G.setColor(k6.r1(0.15f, k6.o2.getColor()));
        this.H.setColor(k6.o2.getColor());
        if (this.T.Q3()) {
            TextPaint textPaint = this.D;
            int i13 = k6.Lb;
            textPaint.setColor(k6.w0(i13, e6Var));
            this.I.setColor(k6.w0(i13, e6Var));
            this.J.setColor(k6.w0(k6.Ob, e6Var));
        } else {
            TextPaint textPaint2 = this.D;
            int i14 = k6.yd;
            textPaint2.setColor(k6.w0(i14, e6Var));
            this.I.setColor(k6.w0(i14, e6Var));
            this.J.setColor(k6.w0(k6.Id, e6Var));
        }
        if (this.U) {
            this.I.setColor(k6.w0(k6.Tk, e6Var));
        }
        canvas2.save();
        int L = i10 - g0.L(4.0f);
        canvas2.translate(L, i3);
        this.P.set(L, i3, this.l + L, this.k + i3);
        canvas2.saveLayer(0.0f, 0.0f, this.l, this.k, this.K, 31);
        this.d.h(canvas2, null);
        float f12 = this.l / 2.0f;
        float L2 = g0.L(106.0f);
        int L3 = g0.L(12.0f) + this.O.width();
        int L4 = g0.L(10.0f) + this.O.height();
        this.M.set(f12 - ((g0.L(2.0f) + L3) / 2.0f), L2 - ((g0.L(2.0f) + L4) / 2.0f), ((g0.L(2.0f) + L3) / 2.0f) + f12, ((g0.L(2.0f) + L4) / 2.0f) + L2);
        canvas2.drawRoundRect(this.M, g0.L(11.0f), g0.L(11.0f), this.L);
        float f13 = L3 / 2.0f;
        float f14 = L4 / 2.0f;
        this.M.set(f12 - f13, L2 - f14, f12 + f13, L2 + f14);
        canvas2.drawRoundRect(this.M, g0.L(10.0f), g0.L(10.0f), this.I);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setBounds(g0.L(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - g0.L(6.96f), g0.L(21.24f) + ((int) this.M.left), g0.L(6.96f) + ((int) this.M.centerY()));
            this.t.draw(canvas2);
        }
        canvas2.drawText(this.u, this.M.centerX() + g0.L(this.U ? 8.0f : 0.0f), this.M.centerY() + g0.L(4.0f), this.U ? this.C : this.B);
        canvas2.restore();
        canvas2.translate(0.0f, g0.L(128.0f));
        int L5 = g0.L(128.0f) + i3;
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.w.draw(canvas2);
        canvas2.translate(0.0f, this.p);
        float f15 = 6.0f;
        if (this.x != null) {
            canvas2.restore();
            canvas2.save();
            float L6 = (this.p + this.m) - g0.L(6.0f);
            float f16 = this.l / 2.0f;
            canvas2.drawText(this.o, f16, L6, this.F);
            f10 = 16.0f;
            canvas2.drawLine(g0.L(17.0f), L6 - g0.L(4.0f), (f16 - (this.n / 2.0f)) - g0.L(6.0f), L6 - g0.L(4.0f), this.G);
            canvas2 = canvas;
            canvas2.drawLine(g0.L(6.0f) + (this.n / 2.0f) + f16, L6 - g0.L(4.0f), this.l - g0.L(16.0f), L6 - g0.L(4.0f), this.G);
            canvas2.translate((this.l - this.x.getWidth()) / 2.0f, this.p);
            this.x.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(this.v / 2.0f, this.m + this.p);
        } else {
            f10 = 16.0f;
        }
        this.y.draw(canvas2);
        canvas2.restore();
        canvas2.translate(0.0f, g0.L(6.0f) + this.q);
        int C = k5.C(6.0f, this.q, L5);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            boolean[] zArr = this.j;
            if (i15 >= zArr.length) {
                break;
            }
            if (zArr[i15]) {
                canvas2.save();
                int i17 = i15;
                float f17 = 0.0f;
                while (true) {
                    f11 = f15;
                    f17 += this.g[i17] + g0.L(40.0f);
                    i17++;
                    boolean[] zArr2 = this.j;
                    if (i17 >= zArr2.length || this.h[i17] || !zArr2[i17]) {
                        break;
                    } else {
                        f15 = f11;
                    }
                }
                float f18 = f12 - (f17 / 2.0f);
                canvas2.translate(f18, 0.0f);
                int i18 = ((int) f18) + L;
                int i19 = i15;
                while (true) {
                    TLRPC.Chat chat = this.f[i19];
                    if (this.T.Q3()) {
                        e10 = k6.w0(k6.Lb, e6Var);
                    } else {
                        int F = t3.F(chat);
                        if (F < 7) {
                            e10 = k6.w0(k6.r8[F], e6Var);
                        } else {
                            xo xoVar = hp.s1(h10.t0).q4;
                            wo d = xoVar == null ? null : xoVar.d(F);
                            e10 = d != null ? d.e(i12, e6Var) : k6.w0(k6.r8[i12], e6Var);
                        }
                    }
                    int i20 = this.V;
                    i11 = (i20 < 0 || i20 != i19) ? i16 : e10;
                    this.D.setColor(e10);
                    this.J.setColor(e10);
                    this.J.setAlpha(25);
                    this.a[i19].h(canvas2, null);
                    CharSequence charSequence = this.e[i19];
                    int i21 = i18;
                    canvas2.drawText(charSequence, 0, charSequence.length(), g0.L(30.0f), g0.L(f10), this.D);
                    this.N.set(0.0f, 0.0f, this.g[i19] + g0.L(40.0f), g0.L(24.0f));
                    canvas2.drawRoundRect(this.N, g0.L(12.0f), g0.L(12.0f), this.J);
                    float f19 = i21;
                    this.i[i19].set(i21, C, (int) (this.N.width() + f19), g0.L(24.0f) + C);
                    canvas2.translate(this.N.width() + g0.L(f11), 0.0f);
                    i18 = (int) (this.N.width() + g0.L(f11) + f19);
                    i19++;
                    boolean[] zArr3 = this.j;
                    if (i19 >= zArr3.length || this.h[i19] || !zArr3[i19]) {
                        break;
                    }
                    i16 = i11;
                    i12 = 0;
                }
                canvas2.restore();
                canvas2.translate(0.0f, g0.L(30.0f));
                C += g0.L(30.0f);
                i15 = i19;
                i16 = i11;
                i12 = 0;
                f15 = f11;
            } else {
                i15++;
                i12 = 0;
            }
        }
        float f20 = f15;
        if (this.A != null) {
            canvas2.save();
            canvas2.translate((this.l - this.A.getWidth()) / 2.0f, g0.L(4.0f));
            this.A.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, this.s);
        }
        canvas2.translate(0.0f, g0.L(f20));
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.z.draw(canvas2);
        canvas2.restore();
        canvas2.restore();
        if (this.V >= 0) {
            int r12 = k6.r1(k6.I.q() ? 0.12f : 0.1f, i16);
            if (this.R != r12) {
                y yVar2 = this.S;
                this.R = r12;
                k6.H1(yVar2, r12, true);
            }
            this.S.setBounds(this.i[this.V]);
            this.S.setCallback(q1Var);
        }
    }

    public final void c(boolean z10) {
        y yVar;
        zi ziVar = this.T;
        if (ziVar == null || !ziVar.v3() || (yVar = this.S) == null) {
            return;
        }
        q1 q1Var = this.c;
        if (!z10) {
            yVar.setState(StateSet.NOTHING);
            q1Var.invalidate();
        } else {
            yVar.setCallback(new a(this, 0));
            this.S.setState(this.Q);
            q1Var.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v47 */
    public final void d(int i3, int i10, zi ziVar) {
        float f10;
        boolean z10;
        float f11;
        TLRPC.Document document;
        String str;
        this.T = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        boolean z11 = false;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0.0f;
        if (ziVar.v3()) {
            this.T = ziVar;
            float f12 = 12.0f;
            boolean z12 = true;
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
                this.B.setTypeface(g0.o());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(g0.L(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(g0.o());
                this.C.setTextSize(g0.L(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(g0.o());
                this.D.setTextSize(g0.L(13.0f));
                this.H.setTextSize(g0.L(13.0f));
                this.E.setTextSize(g0.L(14.0f));
                this.F.setTextSize(g0.L(14.0f));
                this.F.setTextAlign(align);
            }
            float f13 = 18.0f;
            if (this.a == null) {
                this.a = new ImageReceiver[10];
                this.b = new u8[10];
                this.j = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver2 = this.a[i11];
                    imageReceiver2.A1 = true;
                    imageReceiver2.J0(g0.L(12.0f));
                    this.b[i11] = new u8((e6) null);
                    this.b[i11].u(g0.L(18.0f));
                    this.i[i11] = new Rect();
                    i11++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) ziVar.k.media;
            String str2 = h10.i(h10.t0).c0;
            if (str2 == null) {
                li.b0(h10.t0).z();
                f10 = 12.0f;
                z10 = true;
                f11 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet p02 = li.b0(h10.t0).p0(str2);
                if (p02 == null) {
                    p02 = li.b0(h10.t0).n0(str2);
                }
                if (p02 != null) {
                    String str3 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = p02.packs;
                    int size = arrayList.size();
                    document = null;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            f10 = f12;
                            z10 = z12;
                            f11 = f13;
                            break;
                        }
                        TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i12);
                        i12++;
                        TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                        f10 = f12;
                        if (Objects.equals(tL_stickerPack2.emoticon, str3)) {
                            ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                            int size2 = arrayList2.size();
                            f11 = f13;
                            ?? r9 = z11;
                            while (true) {
                                if (r9 >= size2) {
                                    str = str3;
                                    z10 = z12;
                                    break;
                                }
                                Long l10 = arrayList2.get(r9);
                                int i13 = r9 + 1;
                                long longValue = l10.longValue();
                                ArrayList<TLRPC.Document> arrayList3 = p02.documents;
                                int size3 = arrayList3.size();
                                z10 = z12;
                                ?? r82 = z11;
                                while (true) {
                                    if (r82 >= size3) {
                                        str = str3;
                                        break;
                                    }
                                    TLRPC.Document document2 = arrayList3.get(r82);
                                    int i14 = r82 + 1;
                                    TLRPC.Document document3 = document2;
                                    ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                    str = str3;
                                    if (document3.id == longValue) {
                                        document = document3;
                                        break;
                                    } else {
                                        str3 = str;
                                        arrayList3 = arrayList4;
                                        r82 = i14;
                                    }
                                }
                                if (document != null) {
                                    break;
                                }
                                z12 = z10;
                                str3 = str;
                                z11 = false;
                                r9 = i13;
                            }
                        } else {
                            str = str3;
                            z10 = z12;
                            f11 = f13;
                        }
                        if (document != null) {
                            break;
                        }
                        f12 = f10;
                        f13 = f11;
                        z12 = z10;
                        str3 = str;
                        z11 = false;
                    }
                    if (document != null || p02.documents.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = false;
                        document = p02.documents.get(0);
                    }
                } else {
                    f10 = 12.0f;
                    z10 = true;
                    f11 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    jz d = t5.d(document.thumbs, k6.c7, 0.2f, z11);
                    if (d != null) {
                        d.e = 512;
                        d.f = 512;
                    }
                    this.d.q0(ac.b(document), "160_160_firstframe", d, "tgs", p02, 1);
                } else {
                    li.b0(h10.t0).c1(str2, false, p02 == null ? z10 : false);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) ziVar.k.media;
            this.U = (tL_messageMediaGiveaway2.flags & 32) != 0 ? z10 : false;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.b = (u8[]) Arrays.copyOf(this.b, size4);
                this.j = Arrays.copyOf(this.j, size4);
                this.e = (CharSequence[]) Arrays.copyOf(this.e, size4);
                this.g = Arrays.copyOf(this.g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.i = (Rect[]) Arrays.copyOf(this.i, size4);
                this.f = (TLRPC.Chat[]) Arrays.copyOf(this.f, size4);
                int i15 = length - 1;
                while (i15 < size4) {
                    this.a[i15] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver3 = this.a[i15];
                    imageReceiver3.A1 = z10;
                    imageReceiver3.J0(g0.L(f10));
                    this.b[i15] = new u8((e6) null);
                    this.b[i15].u(g0.L(f11));
                    this.i[i15] = new Rect();
                    i15++;
                    z10 = true;
                }
            }
            int L = g0.L(148.0f);
            int Q0 = g0.Q1() ? g0.Q0() - g0.L(80.0f) : i3 - g0.L(80.0f);
            hp s12 = hp.s1(h10.t0);
            boolean m32 = zi.m3(ziVar.k);
            TLRPC.Message message = ziVar.k;
            boolean V = t3.V(s12.M0(Long.valueOf(-zi.C1(m32 ? message.fwd_from.from_id : message.peer_id))));
            SpannableStringBuilder X2 = g0.X2(bd.M0(2131753393, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, X2.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) g0.X2(bd.H(',', "BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) g0.X2(bd.G(tL_messageMediaGiveaway2.quantity, "BoostingStarsGiveawayMsgInfoPlural2", new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) g0.X2(bd.H(',', "BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) g0.X2(bd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgInfoPlural2", bd.G(tL_messageMediaGiveaway2.months, "BoldMonths", new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder X22 = g0.X2(bd.M0(2131753410, "BoostingGiveawayMsgParticipants"));
            spannableStringBuilder3.append((CharSequence) X22);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, X22.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                spannableStringBuilder3.append((CharSequence) bd.G(tL_messageMediaGiveaway2.channels.size(), V ? "BoostingGiveawayMsgNewSubsPlural" : "BoostingGiveawayMsgNewSubsGroupPlural", new Object[0]));
            } else {
                spannableStringBuilder3.append((CharSequence) bd.G(tL_messageMediaGiveaway2.channels.size(), V ? "BoostingGiveawayMsgAllSubsPlural" : "BoostingGiveawayMsgAllSubsGroupPlural", new Object[0]));
            }
            SpannableStringBuilder X23 = g0.X2(bd.M0(2131753168, "BoostingWinnersDate"));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(X23);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, X23.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = bd.E0().s0().format(date);
            String format2 = bd.E0().p0().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) bd.a0("formatDateAtTime", null, 2131742793, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float L2 = g0.L(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.w = lu0.c(spannableStringBuilder, textPaint2, Q0, alignment, L2, truncateAt, Q0, 10, true);
            this.y = lu0.c(spannableStringBuilder3, this.E, Q0, alignment, g0.L(2.0f), truncateAt, Q0, 10, true);
            this.z = lu0.c(spannableStringBuilder4, this.E, Q0, alignment, g0.L(3.0f), truncateAt, Q0, 10, true);
            int i16 = 0;
            for (int i17 = 0; i17 < this.w.getLineCount(); i17++) {
                i16 = (int) Math.max(i16, Math.ceil(this.w.getLineWidth(i17)));
            }
            for (int i18 = 0; i18 < this.y.getLineCount(); i18++) {
                i16 = (int) Math.max(i16, Math.ceil(this.y.getLineWidth(i18)));
            }
            for (int i19 = 0; i19 < this.z.getLineCount(); i19++) {
                i16 = (int) Math.max(i16, Math.ceil(this.z.getLineWidth(i19)));
            }
            if (i16 < g0.L(180.0f)) {
                i16 = g0.L(180.0f);
            }
            int i20 = i16;
            String str4 = tL_messageMediaGiveaway2.prize_description;
            if (str4 != null && !str4.isEmpty()) {
                StaticLayout c2 = lu0.c(i6.m(g0.X2(bd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false, null, 0), this.E, i20, Layout.Alignment.ALIGN_CENTER, g0.L(2.0f), TextUtils.TruncateAt.END, i20, 20, true);
                this.x = c2;
                this.m = g0.L(22.0f) + c2.getLineBottom(c2.getLineCount() - 1);
                String M0 = bd.M0(2131753406, null);
                this.o = M0;
                this.n = this.F.measureText(M0, 0, M0.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i21 = 0;
                while (i21 < size5) {
                    String str5 = arrayList6.get(i21);
                    i21++;
                    String str6 = str5;
                    String displayCountry = new Locale("", str6).getDisplayCountry(Locale.getDefault());
                    String F0 = bd.F0(str6);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (F0 != null) {
                        spannableStringBuilder5.append((CharSequence) F0).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = lu0.c(i6.m(g0.X2(bd.a0("BoostingGiveAwayFromCountries", null, 2131753493, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false, null, 0), this.H, i20, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, i20, 10, true);
                }
            }
            int max = Math.max(i10, Math.min(g0.L(38.0f) + i20, Q0));
            this.v = max - Q0;
            float f14 = max;
            float f15 = L;
            float f16 = f15 / 2.0f;
            this.d.y0((f14 / 2.0f) - f16, g0.L(42.0f) - f16, f15, f15);
            int L3 = g0.L(5.0f) + this.w.getLineBottom(r1.getLineCount() - 1);
            this.p = L3;
            this.q = this.y.getLineBottom(r1.getLineCount() - 1) + L3 + this.m;
            this.r = this.z.getLineBottom(r1.getLineCount() - 1);
            StaticLayout staticLayout = this.A;
            int lineBottom = staticLayout != null ? staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + g0.L(f10) : 0;
            this.s = lineBottom;
            int i22 = this.k + this.q + lineBottom + this.r;
            this.k = i22;
            this.k = g0.L(128.0f) + i22;
            this.l = max;
            if (this.U) {
                if (this.t == null) {
                    this.t = p1.g(t0.b, org.telegram.messenger.beta.R.drawable.filled_giveaway_stars);
                }
                this.u = bd.E((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.t = null;
                this.u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str7 = this.u;
            textPaint3.getTextBounds(str7, 0, str7.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = g0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.j, false);
            this.k = g0.L(30.0f) + this.k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i23 = 0;
            while (i23 < size6) {
                Long l11 = arrayList8.get(i23);
                i23++;
                Long l12 = l11;
                if (hp.s1(h10.t0).M0(l12) != null) {
                    arrayList7.add(l12);
                }
            }
            float f17 = 0.0f;
            for (int i24 = 0; i24 < arrayList7.size(); i24++) {
                Long l13 = (Long) arrayList7.get(i24);
                long longValue2 = l13.longValue();
                TLRPC.Chat M02 = hp.s1(h10.t0).M0(l13);
                if (M02 != null) {
                    this.j[i24] = true;
                    this.f[i24] = M02;
                    this.e[i24] = TextUtils.ellipsize(i6.m(M02.title, this.D.getFontMetricsInt(), false, null, 0), this.D, 0.8f * f14, TextUtils.TruncateAt.END);
                    float[] fArr = this.g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.e[i24];
                    fArr[i24] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.g[i24] + g0.L(40.0f);
                    f17 += L4;
                    if (i24 > 0) {
                        boolean[] zArr = this.h;
                        boolean z13 = f17 > 0.9f * f14;
                        zArr[i24] = z13;
                        if (z13) {
                            this.k = g0.L(30.0f) + this.k;
                            f17 = L4;
                        }
                    } else {
                        this.h[i24] = false;
                    }
                    this.b[i24].q(M02);
                    this.a[i24].i0(M02, this.b[i24], null);
                    this.a[i24].y0(0.0f, 0.0f, g0.L(24.0f), g0.L(24.0f));
                } else {
                    this.f[i24] = null;
                    this.j[i24] = false;
                    this.e[i24] = "";
                    this.h[i24] = false;
                    this.g[i24] = g0.L(20.0f);
                    this.b[i24].k(longValue2, "", "", null);
                }
            }
        }
    }
}
