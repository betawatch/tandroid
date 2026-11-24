// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n79 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final kl E;
    public final kl F;
    public final kl G;
    public final kl H;
    public final kl I;
    public final lm J;
    public final lm K;
    public final lm L;
    public final lm M;
    public final lm N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public byte S;
    public wjb T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public m79[] a0;
    public float b0;
    public boolean c0;
    public r86 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public tl t;
    public tl u;
    public long v;
    public long w;
    public int x;
    public int y;
    public int z;
    public final RectF a = new RectF();
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f = new Path();
    public final Paint g = new Paint();
    public int q = 0;
    public float r = 1.0f;

    public n79(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new wc(this, (byte) 13));
        }
        s33 s33Var = s33.h;
        this.E = new kl(view, 400L, s33Var, 0);
        this.F = new kl(view, 400L, s33Var, 0);
        this.G = new kl(view, 400L, s33Var, 0);
        this.H = new kl(view, 400L, s33Var, 0);
        this.I = new kl(view, 400L, s33Var, 0);
        this.J = new lm(view, 0L, 400L, s33Var);
        this.K = new lm(view, 0L, 400L, s33Var);
        this.L = new lm(view, 0L, 440L, s33Var);
        this.M = new lm(view, 0L, 320L, s33Var);
        this.N = new lm(view, 0L, 320L, s33Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(k27 k27Var, TLRPC.User user, TLRPC.Chat chat, wjb wjbVar, int i) {
        kl klVar;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        k27 k27Var2;
        TLRPC.Message message2;
        int F;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int f;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int v0;
        boolean z;
        View view;
        TLRPC.Message message4;
        int i2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user2 = user;
        this.R = false;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        if (k27Var != null && !k27Var.O3() && i != 2 && (tL_peerColorCollectible = k27Var.g1) != null) {
            return l(k27Var, tL_peerColorCollectible, wjbVar);
        }
        this.V = false;
        this.v = 0L;
        this.w = 0L;
        this.s = k27Var != null && k27Var.q4();
        kl klVar2 = this.I;
        if (k27Var == null) {
            this.R = true;
            this.S = i;
            this.T = wjbVar;
            this.U = zkb.b;
            this.j = false;
            this.i = false;
            int v02 = bkb.v0(bkb.Kd, wjbVar);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.x = bkb.p1(a ? 0.12f : 0.1f, v02);
            this.C = h();
            int v03 = bkb.v0(bkb.Md, wjbVar);
            this.y = v03;
            return klVar2.a(v03, false);
        }
        int i3 = k27Var.K1;
        if (i != 4 || (message4 = k27Var.k) == null || k27.n1(message4) == null || !(k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaContact)) {
            klVar = klVar2;
            if (i != 0 && (k27Var.e1 >= 0 || (k27Var.k != null && (((k27Var.p3() || cf3.B(k27.B0(k27Var.k))) && user2 != null) || ((k27Var.n3() && chat != null) || (((message3 = k27Var.k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (k27Var.q4() && (peerColor2 = k27Var.Z0) != null && peerColor2.color != -1))))))) {
                int i4 = k27Var.e1;
                if (i4 < 0) {
                    if (!k27Var.q4() || (peerColor = k27Var.Z0) == null || (f = peerColor.color) == -1) {
                        TLRPC.Message message5 = k27Var.k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long n = cf3.n(peer);
                            if (n < 0) {
                                TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-n));
                                if (!k27Var.O3() && i != 2 && K0 != null) {
                                    TLRPC.PeerColor peerColor3 = K0.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(k27Var, (TLRPC.TL_peerColorCollectible) peerColor3, wjbVar);
                                    }
                                }
                                f = K0 != null ? hc2.F(K0) : 5;
                                if (i == 3) {
                                    this.v = hc2.G(K0);
                                }
                            } else {
                                TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(n));
                                if (!k27Var.O3() && i != 2 && V1 != null) {
                                    TLRPC.PeerColor peerColor4 = V1.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(k27Var, (TLRPC.TL_peerColorCollectible) peerColor4, wjbVar);
                                    }
                                }
                                f = V1 != null ? l7c.f(V1) : 5;
                                if (i == 3) {
                                    this.v = l7c.g(V1);
                                }
                            }
                        } else if (cf3.B(k27.B0(message5)) && user2 != null) {
                            TLRPC.User f2 = k27Var.O3() ? y6c.h(i3).f() : user2;
                            if (f2 != null) {
                                user2 = f2;
                            }
                            if (!k27Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor5 = user2.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(k27Var, (TLRPC.TL_peerColorCollectible) peerColor5, wjbVar);
                                }
                            }
                            i4 = l7c.f(user2);
                            if (i == 3) {
                                this.v = l7c.g(user2);
                            }
                        } else if (k27Var.p3() && user2 != null) {
                            if (!k27Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor6 = user2.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(k27Var, (TLRPC.TL_peerColorCollectible) peerColor6, wjbVar);
                                }
                            }
                            i4 = l7c.f(user2);
                            if (i == 3) {
                                this.v = l7c.g(user2);
                            }
                        } else if (!k27Var.n3() || chat == null) {
                            i4 = 0;
                        } else {
                            if (!k27Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(k27Var, (TLRPC.TL_peerColorCollectible) peerColor7, wjbVar);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = k27Var.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User V12 = na7.q1(i3).V1(Long.valueOf(Z0));
                                    F = l7c.f(V12);
                                    if (i == 3) {
                                        this.v = l7c.g(V12);
                                    }
                                } else {
                                    TLRPC.Chat K02 = na7.q1(i3).K0(Long.valueOf(-Z0));
                                    F = hc2.F(K02);
                                    if (i == 3) {
                                        this.v = hc2.G(K02);
                                    }
                                }
                                i4 = F;
                            } else {
                                i4 = hc2.F(chat);
                                if (i == 3) {
                                    this.v = hc2.G(chat);
                                }
                            }
                        }
                    } else if (i == 3) {
                        this.v = peerColor.background_emoji_id;
                    }
                    i4 = f;
                }
                m(k27Var, i4, wjbVar);
                this.x = bkb.p1(0.1f, this.z);
                this.y = this.z;
            } else if (i != 0 || (k27Var.e1 < 0 && ((message = k27Var.k) == null || k27Var.C == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (k27Var2 = k27Var.C).k) == null || message2.from_id == null || !(k27Var2.p3() || cf3.B(k27.B0(k27Var.k)) || k27Var.C.n3()))))) {
                this.i = false;
                this.j = false;
                int v04 = bkb.v0(bkb.Kd, wjbVar);
                this.B = v04;
                this.A = v04;
                this.z = v04;
                this.x = bkb.p1(0.1f, v04);
                this.y = bkb.v0(bkb.Md, wjbVar);
            } else {
                int i5 = k27Var.e1;
                if (i5 < 0) {
                    boolean B = cf3.B(k27.B0(k27Var.C.k));
                    k27 k27Var3 = k27Var.C;
                    if (B) {
                        if (k27Var3.O3()) {
                            user2 = y6c.h(k27Var.C.K1).f();
                        }
                        if (user2 != null) {
                            i5 = l7c.f(user2);
                            this.v = l7c.g(user2);
                        }
                        i5 = 0;
                    } else if (k27Var3.p3()) {
                        TLRPC.User V13 = na7.q1(i3).V1(Long.valueOf(k27Var.C.k.from_id.user_id));
                        if (!k27Var.O3() && i != 2 && V13 != null) {
                            TLRPC.PeerColor peerColor8 = V13.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(k27Var, (TLRPC.TL_peerColorCollectible) peerColor8, wjbVar);
                            }
                        }
                        if (V13 != null) {
                            i5 = l7c.f(V13);
                            this.v = l7c.g(V13);
                        }
                        i5 = 0;
                    } else {
                        if (k27Var.C.n3()) {
                            TLRPC.Chat K03 = na7.q1(i3).K0(Long.valueOf(k27Var.C.k.from_id.channel_id));
                            if (!k27Var.O3() && i != 2 && K03 != null) {
                                TLRPC.PeerColor peerColor9 = K03.color;
                                if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(k27Var, (TLRPC.TL_peerColorCollectible) peerColor9, wjbVar);
                                }
                            }
                            if (K03 != null) {
                                i5 = hc2.F(K03);
                                this.v = hc2.G(K03);
                            }
                        }
                        i5 = 0;
                    }
                }
                m(k27Var.C, i5, wjbVar);
                this.x = bkb.p1(0.1f, this.z);
                this.y = this.z;
            }
        } else {
            long j = k27.n1(k27Var.k).user_id;
            TLRPC.User V14 = j != 0 ? na7.q1(i3).V1(Long.valueOf(j)) : null;
            if (!k27Var.O3() && i != 2 && V14 != null) {
                TLRPC.PeerColor peerColor10 = V14.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(k27Var, (TLRPC.TL_peerColorCollectible) peerColor10, wjbVar);
                }
            }
            if (V14 != null) {
                i2 = l7c.f(V14);
                klVar = klVar2;
                this.v = l7c.g(V14);
            } else {
                klVar = klVar2;
                i2 = 0;
            }
            m(k27Var, i2, wjbVar);
            this.x = bkb.p1(0.1f, this.z);
            this.y = this.z;
        }
        if (k27Var.O5()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = bkb.v0(bkb.Nd, wjbVar);
        } else if (k27Var.O3() || i == 2) {
            if (i != 2 || k27Var.O3()) {
                int i6 = bkb.Qb;
                Integer y0 = bkb.y0(i6, wjbVar);
                if (y0 != null) {
                    v0 = y0.intValue();
                } else {
                    if (this.i || this.j) {
                        i6 = bkb.Rb;
                    }
                    v0 = bkb.v0(i6, wjbVar);
                }
                this.B = v0;
                this.A = v0;
                this.z = v0;
            } else {
                v0 = bkb.v0(bkb.fl, wjbVar);
                this.B = v0;
                this.A = v0;
                this.z = v0;
            }
            if (this.j) {
                this.V = true;
                this.z = bkb.p1(0.2f, v0);
                this.A = bkb.p1(0.5f, this.A);
            } else if (this.i) {
                this.V = true;
                this.z = bkb.p1(0.35f, v0);
            }
            this.x = bkb.p1(a ? 0.12f : 0.1f, this.B);
            int i7 = bkb.Sb;
            this.y = bkb.v0(i7, wjbVar);
            if (k27Var.P2() && k27Var.O3()) {
                this.x = bm2.k(bkb.v0(bkb.Na, wjbVar), bm2.k(bkb.v0(bkb.Ka, wjbVar), bkb.v0(bkb.ta, wjbVar)));
                this.y = bkb.y0(i7, wjbVar).intValue();
            }
        }
        if (i == 0 || i == 3 || i == 4) {
            long j2 = k27Var.f1;
            if (j2 != -1) {
                this.v = j2;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new tl(gl.L(20.0f), 13, view, false);
            if (!(view instanceof gb2) ? view.isAttachedToWindow() : ((gb2) view).O0) {
                this.t.a();
            }
        }
        tl tlVar = this.t;
        if (tlVar != null) {
            z = true;
            if (tlVar.j(this.v, true)) {
                this.c0 = false;
            }
        } else {
            z = true;
        }
        tl tlVar2 = this.u;
        if (tlVar2 != null) {
            tlVar2.j(this.w, z);
        }
        this.C = h();
        return klVar.a(this.y, false);
    }

    public final void b() {
        n79 n79Var;
        if (!this.R || this.U == zkb.b) {
            return;
        }
        try {
            n79Var = this;
        } catch (Exception e) {
            e = e;
            n79Var = this;
        }
        try {
            n79Var.a(null, null, null, this.T, this.S);
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            n79Var.R = false;
            fa4.g(exc, true);
        }
    }

    public final void c(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f, f2, f3, f4, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        float max = Math.max(gl.L((int) Math.floor(gba.V0 / 3.0f)), gl.L(f));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = gl.L(f2);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = gl.L(f3);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(gl.L((int) Math.floor(gba.V0 / 3.0f)), gl.L(f3));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f4, z, z2);
    }

    public final void e(Canvas canvas, RectF rectF, float f, boolean z, boolean z2) {
        boolean z3;
        ml mlVar;
        float d;
        int i;
        tl tlVar;
        b();
        if (!z2) {
            int p1 = bkb.p1(f, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(p1);
            float[] fArr = this.e;
            if (hse.a(fArr)) {
                float f2 = fArr[0];
                canvas.drawRoundRect(rectF, f2, f2, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        tl tlVar2 = this.t;
        if (tlVar2 != null) {
            if (!this.c0) {
                Drawable drawable = tlVar2.f[0];
                if ((drawable instanceof vl) && (mlVar = ((vl) drawable).k) != null && mlVar.C()) {
                    this.c0 = true;
                } else {
                    z3 = false;
                    d = this.L.d(z3);
                    if (d > 0.0f || this.r <= 0.0f) {
                    }
                    if (this.a0 == null) {
                        i = 0;
                        this.a0 = new m79[]{new m79(4.0f, -6.33f, 1.0f, 1.0f), new m79(30.0f, 3.0f, 0.78f, 0.9f), new m79(46.0f, -17.0f, 0.6f, 0.6f), new m79(69.66f, -0.666f, 0.87f, 0.7f), new m79(98.0f, -12.6f, 1.03f, 0.3f), new m79(51.0f, 24.0f, 1.0f, 0.5f), new m79(6.33f, 20.0f, 0.77f, 0.7f), new m79(-19.0f, 12.0f, 0.8f, 0.6f, 0), new m79(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                    } else {
                        i = 0;
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(0.0f, this.b0);
                    float max = Math.max(rectF.right - gl.L(15.0f), rectF.centerX());
                    if (z) {
                        max -= gl.L(12.0f);
                    }
                    float min = Math.min(rectF.centerY(), rectF.top + gl.L(21.0f));
                    tl tlVar3 = this.u;
                    if (tlVar3 != null) {
                        tlVar3.w = (int) (f * 255.0f);
                    }
                    this.t.k(Integer.valueOf(this.C));
                    int i2 = i;
                    while (true) {
                        m79[] m79VarArr = this.a0;
                        if (i2 >= m79VarArr.length) {
                            canvas.restore();
                            return;
                        }
                        if (i2 != 0 || (tlVar = this.u) == null || this.w == 0) {
                            tlVar = this.t;
                        }
                        m79 m79Var = m79VarArr[i2];
                        if (!m79Var.e || z) {
                            tlVar.w = (int) ((tlVar == this.u ? 1.0f : 0.3f) * 255.0f * m79Var.d * this.r);
                            float L = max - gl.L(m79Var.a);
                            float L2 = gl.L(m79Var.b) + min;
                            float L3 = gl.L(10.0f) * m79Var.c * d;
                            tlVar.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                            tlVar.draw(canvas);
                        }
                        i2++;
                    }
                }
            }
            z3 = true;
            d = this.L.d(z3);
            if (d > 0.0f) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0182, code lost:
    
        if ((((r10 ^ r18) >> 31) | 1) > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01a5, code lost:
    
        r19 = r19 + r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a2, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0244, code lost:
    
        if (r26.k.getHeight() == r10) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a0, code lost:
    
        if ((((r10 ^ r18) >> 31) | 1) > 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Canvas canvas, RectF rectF, float f) {
        float f2;
        float height;
        int L;
        int i;
        int i2;
        float f3;
        b();
        int floor = (int) Math.floor(gba.V0 / (this.s ? 2.0f : 3.0f));
        float max = rectF.left + Math.max(gl.L(3.0f), gl.L(floor << 1));
        int a = this.F.a(this.z, false);
        int p1 = bkb.p1(f, a);
        Paint paint = this.b;
        paint.setColor(p1);
        float d = this.M.d(this.W);
        float d2 = this.J.d(this.i);
        float d3 = this.K.d(this.j);
        RectF rectF2 = this.a;
        if (d > 0.0f && !this.i) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * 0.3f));
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f4 = rectF2.left;
            canvas.clipRect(f4, rectF2.top, gl.L(3.0f) + f4, rectF2.bottom);
            float f5 = floor;
            canvas.drawRoundRect(rectF2, gl.L(f5), gl.L(f5), paint);
            paint.setAlpha(alpha);
            i();
            float pow = ((float) Math.pow((this.X / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (gl.R1(0.0f, 1.0f - s33.i.getInterpolation(moe.a(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top, rectF.left + gl.L(6.0f), (gl.R1(1.0f, 1.0f - s33.g.getInterpolation(moe.a((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, gl.L(4.0f), gl.L(4.0f), paint);
            canvas.restore();
            View view = this.D;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (d2 <= 0.0f) {
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f6 = rectF2.left;
            canvas.clipRect(f6, rectF2.top, gl.L(3.0f) + f6, rectF2.bottom);
            float f7 = floor;
            canvas.drawRoundRect(rectF2, gl.L(f7), gl.L(f7), paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        i();
        if (this.j) {
            height = rectF.height();
            f2 = 12.66f;
            int height2 = (int) rectF.height();
            L = gl.L(18.99f);
            i = height2 % L;
            if (i != 0) {
            }
            i2 = 0;
        } else {
            f2 = 12.66f;
            height = rectF.height();
            int height3 = (int) rectF.height();
            L = gl.L(12.66f);
            i = height3 % L;
            if (i != 0) {
            }
            i2 = 0;
        }
        float e = ((((this.N.e(false, this.q * 425) + this.Y) + (this.V ? 100 : 0)) / 1000.0f) * gl.L(30.0f)) % (height - i2);
        int a2 = this.G.a(this.A, false);
        int a3 = this.H.a(this.B, false);
        int p12 = bkb.p1(f, a);
        int k = bm2.k(bkb.p1(d2 * f, a2), p12);
        int k2 = this.j ? bm2.k(bkb.p1(f * d3, a3), p12) : 0;
        int round = Math.round(gl.N(6.33f));
        int max2 = Math.max(1, gl.L(3.0f));
        int L2 = this.j ? gl.L(18.99f) : gl.L(f2);
        Bitmap bitmap = this.k;
        Paint paint2 = this.c;
        if (bitmap != null && this.l == p12 && this.m == k && this.n == k2) {
            f3 = max;
            if (this.p == this.j) {
                if (this.o == round) {
                    if (bitmap.getWidth() == max2) {
                    }
                }
            }
        } else {
            f3 = max;
        }
        this.l = p12;
        this.m = k;
        this.n = k2;
        this.p = this.j;
        this.o = round;
        Bitmap bitmap2 = this.k;
        if (bitmap2 == null || bitmap2.getWidth() != max2 || this.k.getHeight() != L2) {
            Bitmap bitmap3 = this.k;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.k = Bitmap.createBitmap(max2, L2, Bitmap.Config.ARGB_8888);
            paint2.setShader(new BitmapShader(this.k, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        }
        Utilities.drawReplyLinePattern(this.k, p12, k, k2, round, this.j);
        Matrix matrix = this.d;
        matrix.setTranslate(0.0f, -e);
        paint2.getShader().setLocalMatrix(matrix);
        paint2.setAlpha(kk7.d4);
        rectF2.set(0.0f, 0.0f, f3 - rectF.left, rectF.bottom - rectF.top);
        float f8 = rectF2.left;
        canvas.clipRect(f8, rectF2.top, gl.L(3.0f) + f8, rectF2.bottom);
        float f9 = floor;
        canvas.drawRoundRect(rectF2, gl.L(f9), gl.L(f9), paint2);
        canvas.restore();
    }

    public final void g(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        r86 r86Var;
        float max = Math.max(gl.L((int) Math.floor(gba.V0 / 3.0f)), gl.L(f));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = gl.L(f2);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = gl.L(f3);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(gl.L((int) Math.floor(gba.V0 / 3.0f)), gl.L(f3));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((r86Var = this.h) == null || !r86Var.d())) {
            r86 r86Var2 = this.h;
            if (r86Var2 != null) {
                r86Var2.b = -1L;
                return;
            }
            return;
        }
        r86 r86Var3 = this.h;
        if (r86Var3 == null) {
            r86Var3 = new r86();
            this.h = r86Var3;
            r86Var3.D = true;
            r86Var3.t = 3.5f;
            r86Var3.u = 0.5f;
        }
        r86Var3.g(bkb.p1(0.1f, this.z), bkb.p1(0.3f, this.z), bkb.p1(0.3f, this.z), bkb.p1(1.25f, this.z));
        this.h.e(rectF);
        this.h.i(fArr);
        this.h.x.setStrokeWidth(gl.L(1.0f));
        this.h.setAlpha((int) (f4 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.V ? this.A : this.z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (Math.min(30L, currentTimeMillis - this.Z) * d) + this.X;
        this.Y = (Math.min(30L, currentTimeMillis - this.Z) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void j(float f) {
        this.b0 = f;
    }

    public final void k() {
        this.F.a(this.z, true);
        this.G.a(this.A, true);
        this.J.f(this.i, true);
        this.I.a(this.y, true);
        this.E.a(this.x, true);
        tl tlVar = this.t;
        if (tlVar != null) {
            tlVar.d.e(true, 1.0f);
        }
    }

    public final int l(k27 k27Var, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, wjb wjbVar) {
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        int i = (!a || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!a || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            int e1 = k27Var != null ? k27Var.e1() : 0;
            if (e1 == this.O) {
                this.q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = e1;
        }
        this.V = false;
        this.z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        boolean z = arrayList.size() >= 2;
        this.i = z;
        if (z) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z2 = arrayList.size() >= 3;
        this.j = z2;
        if (z2) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i2 = i | (-16777216);
        this.y = i2;
        this.x = bkb.p1(0.1f, i2);
        long j = tL_peerColorCollectible.background_emoji_id;
        this.v = j;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j != 0 && this.t == null && view != null) {
            this.t = new tl(gl.L(20.0f), 13, view, false);
            if (!(view instanceof gb2) ? view.isAttachedToWindow() : ((gb2) view).O0) {
                this.t.a();
            }
        }
        tl tlVar = this.t;
        if (tlVar != null && tlVar.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new tl(gl.L(20.0f), 13, view, false);
            if (!(view instanceof gb2) ? view.isAttachedToWindow() : ((gb2) view).O0) {
                this.u.a();
            }
        }
        tl tlVar2 = this.u;
        if (tlVar2 != null) {
            tlVar2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void m(k27 k27Var, int i, wjb wjbVar) {
        if (wjbVar != null) {
            wjbVar.a();
        } else {
            bkb.h1();
        }
        if (this.P != i) {
            int e1 = k27Var != null ? k27Var.e1() : 0;
            if (e1 == this.O) {
                this.q++;
            }
            this.Q = 0L;
            this.P = i;
            this.O = e1;
        }
        if (i < 7) {
            int v0 = bkb.v0(bkb.q8[i], wjbVar);
            this.B = v0;
            this.A = v0;
            this.z = v0;
            this.j = false;
            this.i = false;
            return;
        }
        ea7 ea7Var = na7.q1(k27Var != null ? k27Var.K1 : y6c.t0).E3;
        da7 d = ea7Var != null ? ea7Var.d(i) : null;
        if (d == null) {
            int v02 = bkb.v0((k27Var == null || !k27Var.O3()) ? bkb.Kd : bkb.Qb, wjbVar);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = d.e(0, wjbVar);
        this.A = d.e(1, wjbVar);
        int e = d.e(2, wjbVar);
        this.B = e;
        int i2 = this.A;
        int i3 = this.z;
        this.i = i2 != i3;
        boolean z = e != i3;
        this.j = z;
        if (z) {
            this.B = i2;
            this.A = e;
        }
    }

    public final int n(wjb wjbVar) {
        View view;
        this.R = false;
        int i = bkb.p7;
        this.y = bkb.v0(i, wjbVar);
        this.z = bkb.v0(i, wjbVar);
        this.i = false;
        this.j = false;
        this.x = bkb.p1(0.1f, bkb.v0(i, wjbVar));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new tl(gl.L(20.0f), 13, view, false);
            if (!(view instanceof gb2) ? view.isAttachedToWindow() : ((gb2) view).O0) {
                this.t.a();
            }
        }
        tl tlVar = this.t;
        if (tlVar != null && tlVar.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = h();
        return this.I.a(this.y, false);
    }

    public final void o(boolean z) {
        r86 r86Var;
        boolean z2 = this.W;
        if (z) {
            if (!z2 && (r86Var = this.h) != null) {
                r86Var.c = -1L;
                r86Var.b = -1L;
            }
        } else if (z2) {
            this.X = 0.0f;
            r86 r86Var2 = this.h;
            if (r86Var2 != null) {
                r86Var2.a();
            }
        }
        this.W = z;
    }

    public final void p(int i, boolean z) {
        this.R = false;
        this.V = false;
        this.j = false;
        this.i = false;
        this.B = i;
        this.A = i;
        this.z = i;
        this.x = bkb.p1(z ? 0.12f : 0.1f, i);
        this.C = i;
    }
}
