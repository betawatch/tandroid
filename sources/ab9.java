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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ab9 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final ll E;
    public final ll F;
    public final ll G;
    public final ll H;
    public final ll I;
    public final mm J;
    public final mm K;
    public final mm L;
    public final mm M;
    public final mm N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public byte S;
    public vnb T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public za9[] a0;
    public float b0;
    public boolean c0;
    public va6 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public ul t;
    public ul u;
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

    public ab9(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new xc(this, (byte) 13));
        }
        k43 k43Var = k43.h;
        this.E = new ll(view, 400L, k43Var, 0);
        this.F = new ll(view, 400L, k43Var, 0);
        this.G = new ll(view, 400L, k43Var, 0);
        this.H = new ll(view, 400L, k43Var, 0);
        this.I = new ll(view, 400L, k43Var, 0);
        this.J = new mm(view, 0L, 400L, k43Var);
        this.K = new mm(view, 0L, 400L, k43Var);
        this.L = new mm(view, 0L, 440L, k43Var);
        this.M = new mm(view, 0L, 320L, k43Var);
        this.N = new mm(view, 0L, 320L, k43Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(r47 r47Var, TLRPC.User user, TLRPC.Chat chat, vnb vnbVar, int i) {
        ll llVar;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        r47 r47Var2;
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
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        if (r47Var != null && !r47Var.O3() && i != 2 && (tL_peerColorCollectible = r47Var.g1) != null) {
            return l(r47Var, tL_peerColorCollectible, vnbVar);
        }
        this.V = false;
        this.v = 0L;
        this.w = 0L;
        this.s = r47Var != null && r47Var.q4();
        ll llVar2 = this.I;
        if (r47Var == null) {
            this.R = true;
            this.S = i;
            this.T = vnbVar;
            this.U = yob.b;
            this.j = false;
            this.i = false;
            int v02 = aob.v0(aob.Ld, vnbVar);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.x = aob.p1(a ? 0.12f : 0.1f, v02);
            this.C = h();
            int v03 = aob.v0(aob.Nd, vnbVar);
            this.y = v03;
            return llVar2.a(v03, false);
        }
        int i3 = r47Var.K1;
        if (i != 4 || (message4 = r47Var.k) == null || r47.n1(message4) == null || !(r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaContact)) {
            llVar = llVar2;
            if (i != 0 && (r47Var.e1 >= 0 || (r47Var.k != null && (((r47Var.p3() || wf3.B(r47.B0(r47Var.k))) && user2 != null) || ((r47Var.n3() && chat != null) || (((message3 = r47Var.k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (r47Var.q4() && (peerColor2 = r47Var.Z0) != null && peerColor2.color != -1))))))) {
                int i4 = r47Var.e1;
                if (i4 < 0) {
                    if (!r47Var.q4() || (peerColor = r47Var.Z0) == null || (f = peerColor.color) == -1) {
                        TLRPC.Message message5 = r47Var.k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long n = wf3.n(peer);
                            if (n < 0) {
                                TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-n));
                                if (!r47Var.O3() && i != 2 && M0 != null) {
                                    TLRPC.PeerColor peerColor3 = M0.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor3, vnbVar);
                                    }
                                }
                                f = M0 != null ? xc2.F(M0) : 5;
                                if (i == 3) {
                                    this.v = xc2.G(M0);
                                }
                            } else {
                                TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(n));
                                if (!r47Var.O3() && i != 2 && X1 != null) {
                                    TLRPC.PeerColor peerColor4 = X1.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor4, vnbVar);
                                    }
                                }
                                f = X1 != null ? lbc.f(X1) : 5;
                                if (i == 3) {
                                    this.v = lbc.g(X1);
                                }
                            }
                        } else if (wf3.B(r47.B0(message5)) && user2 != null) {
                            TLRPC.User f2 = r47Var.O3() ? yac.h(i3).f() : user2;
                            if (f2 != null) {
                                user2 = f2;
                            }
                            if (!r47Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor5 = user2.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor5, vnbVar);
                                }
                            }
                            i4 = lbc.f(user2);
                            if (i == 3) {
                                this.v = lbc.g(user2);
                            }
                        } else if (r47Var.p3() && user2 != null) {
                            if (!r47Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor6 = user2.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor6, vnbVar);
                                }
                            }
                            i4 = lbc.f(user2);
                            if (i == 3) {
                                this.v = lbc.g(user2);
                            }
                        } else if (!r47Var.n3() || chat == null) {
                            i4 = 0;
                        } else {
                            if (!r47Var.O3() && i != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor7, vnbVar);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = r47Var.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User X12 = uc7.s1(i3).X1(Long.valueOf(Z0));
                                    F = lbc.f(X12);
                                    if (i == 3) {
                                        this.v = lbc.g(X12);
                                    }
                                } else {
                                    TLRPC.Chat M02 = uc7.s1(i3).M0(Long.valueOf(-Z0));
                                    F = xc2.F(M02);
                                    if (i == 3) {
                                        this.v = xc2.G(M02);
                                    }
                                }
                                i4 = F;
                            } else {
                                i4 = xc2.F(chat);
                                if (i == 3) {
                                    this.v = xc2.G(chat);
                                }
                            }
                        }
                    } else if (i == 3) {
                        this.v = peerColor.background_emoji_id;
                    }
                    i4 = f;
                }
                m(r47Var, i4, vnbVar);
                this.x = aob.p1(0.1f, this.z);
                this.y = this.z;
            } else if (i != 0 || (r47Var.e1 < 0 && ((message = r47Var.k) == null || r47Var.C == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (r47Var2 = r47Var.C).k) == null || message2.from_id == null || !(r47Var2.p3() || wf3.B(r47.B0(r47Var.k)) || r47Var.C.n3()))))) {
                this.i = false;
                this.j = false;
                int v04 = aob.v0(aob.Ld, vnbVar);
                this.B = v04;
                this.A = v04;
                this.z = v04;
                this.x = aob.p1(0.1f, v04);
                this.y = aob.v0(aob.Nd, vnbVar);
            } else {
                int i5 = r47Var.e1;
                if (i5 < 0) {
                    boolean B = wf3.B(r47.B0(r47Var.C.k));
                    r47 r47Var3 = r47Var.C;
                    if (B) {
                        if (r47Var3.O3()) {
                            user2 = yac.h(r47Var.C.K1).f();
                        }
                        if (user2 != null) {
                            i5 = lbc.f(user2);
                            this.v = lbc.g(user2);
                        }
                        i5 = 0;
                    } else if (r47Var3.p3()) {
                        TLRPC.User X13 = uc7.s1(i3).X1(Long.valueOf(r47Var.C.k.from_id.user_id));
                        if (!r47Var.O3() && i != 2 && X13 != null) {
                            TLRPC.PeerColor peerColor8 = X13.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor8, vnbVar);
                            }
                        }
                        if (X13 != null) {
                            i5 = lbc.f(X13);
                            this.v = lbc.g(X13);
                        }
                        i5 = 0;
                    } else {
                        if (r47Var.C.n3()) {
                            TLRPC.Chat M03 = uc7.s1(i3).M0(Long.valueOf(r47Var.C.k.from_id.channel_id));
                            if (!r47Var.O3() && i != 2 && M03 != null) {
                                TLRPC.PeerColor peerColor9 = M03.color;
                                if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor9, vnbVar);
                                }
                            }
                            if (M03 != null) {
                                i5 = xc2.F(M03);
                                this.v = xc2.G(M03);
                            }
                        }
                        i5 = 0;
                    }
                }
                m(r47Var.C, i5, vnbVar);
                this.x = aob.p1(0.1f, this.z);
                this.y = this.z;
            }
        } else {
            long j = r47.n1(r47Var.k).user_id;
            TLRPC.User X14 = j != 0 ? uc7.s1(i3).X1(Long.valueOf(j)) : null;
            if (!r47Var.O3() && i != 2 && X14 != null) {
                TLRPC.PeerColor peerColor10 = X14.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(r47Var, (TLRPC.TL_peerColorCollectible) peerColor10, vnbVar);
                }
            }
            if (X14 != null) {
                i2 = lbc.f(X14);
                llVar = llVar2;
                this.v = lbc.g(X14);
            } else {
                llVar = llVar2;
                i2 = 0;
            }
            m(r47Var, i2, vnbVar);
            this.x = aob.p1(0.1f, this.z);
            this.y = this.z;
        }
        if (r47Var.O5()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = aob.v0(aob.Od, vnbVar);
        } else if (r47Var.O3() || i == 2) {
            if (i != 2 || r47Var.O3()) {
                int i6 = aob.Rb;
                Integer y0 = aob.y0(i6, vnbVar);
                if (y0 != null) {
                    v0 = y0.intValue();
                } else {
                    if (this.i || this.j) {
                        i6 = aob.Sb;
                    }
                    v0 = aob.v0(i6, vnbVar);
                }
                this.B = v0;
                this.A = v0;
                this.z = v0;
            } else {
                v0 = aob.v0(aob.gl, vnbVar);
                this.B = v0;
                this.A = v0;
                this.z = v0;
            }
            if (this.j) {
                this.V = true;
                this.z = aob.p1(0.2f, v0);
                this.A = aob.p1(0.5f, this.A);
            } else if (this.i) {
                this.V = true;
                this.z = aob.p1(0.35f, v0);
            }
            this.x = aob.p1(a ? 0.12f : 0.1f, this.B);
            int i7 = aob.Tb;
            this.y = aob.v0(i7, vnbVar);
            if (r47Var.P2() && r47Var.O3()) {
                this.x = vm2.k(aob.v0(aob.Oa, vnbVar), vm2.k(aob.v0(aob.La, vnbVar), aob.v0(aob.ua, vnbVar)));
                this.y = aob.y0(i7, vnbVar).intValue();
            }
        }
        if (i == 0 || i == 3 || i == 4) {
            long j2 = r47Var.f1;
            if (j2 != -1) {
                this.v = j2;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new ul(hl.L(20.0f), 13, view, false);
            if (!(view instanceof wb2) ? view.isAttachedToWindow() : ((wb2) view).O0) {
                this.t.a();
            }
        }
        ul ulVar = this.t;
        if (ulVar != null) {
            z = true;
            if (ulVar.j(this.v, true)) {
                this.c0 = false;
            }
        } else {
            z = true;
        }
        ul ulVar2 = this.u;
        if (ulVar2 != null) {
            ulVar2.j(this.w, z);
        }
        this.C = h();
        return llVar.a(this.y, false);
    }

    public final void b() {
        ab9 ab9Var;
        if (!this.R || this.U == yob.b) {
            return;
        }
        try {
            ab9Var = this;
        } catch (Exception e) {
            e = e;
            ab9Var = this;
        }
        try {
            ab9Var.a(null, null, null, this.T, this.S);
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            ab9Var.R = false;
            cc4.g(exc, true);
        }
    }

    public final void c(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f, f2, f3, f4, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        float max = Math.max(hl.L((int) Math.floor(xea.U0 / 3.0f)), hl.L(f));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = hl.L(f2);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = hl.L(f3);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(hl.L((int) Math.floor(xea.U0 / 3.0f)), hl.L(f3));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f4, z, z2);
    }

    public final void e(Canvas canvas, RectF rectF, float f, boolean z, boolean z2) {
        boolean z3;
        nl nlVar;
        float d;
        int i;
        ul ulVar;
        b();
        if (!z2) {
            int p1 = aob.p1(f, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(p1);
            float[] fArr = this.e;
            if (zwe.a(fArr)) {
                float f2 = fArr[0];
                canvas.drawRoundRect(rectF, f2, f2, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        ul ulVar2 = this.t;
        if (ulVar2 != null) {
            if (!this.c0) {
                Drawable drawable = ulVar2.f[0];
                if ((drawable instanceof wl) && (nlVar = ((wl) drawable).k) != null && nlVar.C()) {
                    this.c0 = true;
                } else {
                    z3 = false;
                    d = this.L.d(z3);
                    if (d > 0.0f || this.r <= 0.0f) {
                    }
                    if (this.a0 == null) {
                        i = 0;
                        this.a0 = new za9[]{new za9(4.0f, -6.33f, 1.0f, 1.0f), new za9(30.0f, 3.0f, 0.78f, 0.9f), new za9(46.0f, -17.0f, 0.6f, 0.6f), new za9(69.66f, -0.666f, 0.87f, 0.7f), new za9(98.0f, -12.6f, 1.03f, 0.3f), new za9(51.0f, 24.0f, 1.0f, 0.5f), new za9(6.33f, 20.0f, 0.77f, 0.7f), new za9(-19.0f, 12.0f, 0.8f, 0.6f, 0), new za9(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                    } else {
                        i = 0;
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(0.0f, this.b0);
                    float max = Math.max(rectF.right - hl.L(15.0f), rectF.centerX());
                    if (z) {
                        max -= hl.L(12.0f);
                    }
                    float min = Math.min(rectF.centerY(), rectF.top + hl.L(21.0f));
                    ul ulVar3 = this.u;
                    if (ulVar3 != null) {
                        ulVar3.w = (int) (f * 255.0f);
                    }
                    this.t.k(Integer.valueOf(this.C));
                    int i2 = i;
                    while (true) {
                        za9[] za9VarArr = this.a0;
                        if (i2 >= za9VarArr.length) {
                            canvas.restore();
                            return;
                        }
                        if (i2 != 0 || (ulVar = this.u) == null || this.w == 0) {
                            ulVar = this.t;
                        }
                        za9 za9Var = za9VarArr[i2];
                        if (!za9Var.e || z) {
                            ulVar.w = (int) ((ulVar == this.u ? 1.0f : 0.3f) * 255.0f * za9Var.d * this.r);
                            float L = max - hl.L(za9Var.a);
                            float L2 = hl.L(za9Var.b) + min;
                            float L3 = hl.L(10.0f) * za9Var.c * d;
                            ulVar.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                            ulVar.draw(canvas);
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
        int floor = (int) Math.floor(xea.U0 / (this.s ? 2.0f : 3.0f));
        float max = rectF.left + Math.max(hl.L(3.0f), hl.L(floor << 1));
        int a = this.F.a(this.z, false);
        int p1 = aob.p1(f, a);
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
            canvas.clipRect(f4, rectF2.top, hl.L(3.0f) + f4, rectF2.bottom);
            float f5 = floor;
            canvas.drawRoundRect(rectF2, hl.L(f5), hl.L(f5), paint);
            paint.setAlpha(alpha);
            i();
            float pow = ((float) Math.pow((this.X / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (hl.R1(0.0f, 1.0f - k43.i.getInterpolation(ete.a(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top, rectF.left + hl.L(6.0f), (hl.R1(1.0f, 1.0f - k43.g.getInterpolation(ete.a((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), paint);
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
            canvas.clipRect(f6, rectF2.top, hl.L(3.0f) + f6, rectF2.bottom);
            float f7 = floor;
            canvas.drawRoundRect(rectF2, hl.L(f7), hl.L(f7), paint);
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
            L = hl.L(18.99f);
            i = height2 % L;
            if (i != 0) {
            }
            i2 = 0;
        } else {
            f2 = 12.66f;
            height = rectF.height();
            int height3 = (int) rectF.height();
            L = hl.L(12.66f);
            i = height3 % L;
            if (i != 0) {
            }
            i2 = 0;
        }
        float e = ((((this.N.e(false, this.q * 425) + this.Y) + (this.V ? 100 : 0)) / 1000.0f) * hl.L(30.0f)) % (height - i2);
        int a2 = this.G.a(this.A, false);
        int a3 = this.H.a(this.B, false);
        int p12 = aob.p1(f, a);
        int k = vm2.k(aob.p1(d2 * f, a2), p12);
        int k2 = this.j ? vm2.k(aob.p1(f * d3, a3), p12) : 0;
        int round = Math.round(hl.N(6.33f));
        int max2 = Math.max(1, hl.L(3.0f));
        int L2 = this.j ? hl.L(18.99f) : hl.L(f2);
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
        paint2.setAlpha(jn7.d4);
        rectF2.set(0.0f, 0.0f, f3 - rectF.left, rectF.bottom - rectF.top);
        float f8 = rectF2.left;
        canvas.clipRect(f8, rectF2.top, hl.L(3.0f) + f8, rectF2.bottom);
        float f9 = floor;
        canvas.drawRoundRect(rectF2, hl.L(f9), hl.L(f9), paint2);
        canvas.restore();
    }

    public final void g(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        va6 va6Var;
        float max = Math.max(hl.L((int) Math.floor(xea.U0 / 3.0f)), hl.L(f));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = hl.L(f2);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = hl.L(f3);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(hl.L((int) Math.floor(xea.U0 / 3.0f)), hl.L(f3));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((va6Var = this.h) == null || !va6Var.d())) {
            va6 va6Var2 = this.h;
            if (va6Var2 != null) {
                va6Var2.b = -1L;
                return;
            }
            return;
        }
        va6 va6Var3 = this.h;
        if (va6Var3 == null) {
            va6Var3 = new va6();
            this.h = va6Var3;
            va6Var3.D = true;
            va6Var3.t = 3.5f;
            va6Var3.u = 0.5f;
        }
        va6Var3.g(aob.p1(0.1f, this.z), aob.p1(0.3f, this.z), aob.p1(0.3f, this.z), aob.p1(1.25f, this.z));
        this.h.e(rectF);
        this.h.i(fArr);
        this.h.x.setStrokeWidth(hl.L(1.0f));
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
        ul ulVar = this.t;
        if (ulVar != null) {
            ulVar.d.e(true, 1.0f);
        }
    }

    public final int l(r47 r47Var, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, vnb vnbVar) {
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        int i = (!a || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!a || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            int e1 = r47Var != null ? r47Var.e1() : 0;
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
        this.x = aob.p1(0.1f, i2);
        long j = tL_peerColorCollectible.background_emoji_id;
        this.v = j;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j != 0 && this.t == null && view != null) {
            this.t = new ul(hl.L(20.0f), 13, view, false);
            if (!(view instanceof wb2) ? view.isAttachedToWindow() : ((wb2) view).O0) {
                this.t.a();
            }
        }
        ul ulVar = this.t;
        if (ulVar != null && ulVar.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new ul(hl.L(20.0f), 13, view, false);
            if (!(view instanceof wb2) ? view.isAttachedToWindow() : ((wb2) view).O0) {
                this.u.a();
            }
        }
        ul ulVar2 = this.u;
        if (ulVar2 != null) {
            ulVar2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void m(r47 r47Var, int i, vnb vnbVar) {
        if (vnbVar != null) {
            vnbVar.a();
        } else {
            aob.h1();
        }
        if (this.P != i) {
            int e1 = r47Var != null ? r47Var.e1() : 0;
            if (e1 == this.O) {
                this.q++;
            }
            this.Q = 0L;
            this.P = i;
            this.O = e1;
        }
        if (i < 7) {
            int v0 = aob.v0(aob.r8[i], vnbVar);
            this.B = v0;
            this.A = v0;
            this.z = v0;
            this.j = false;
            this.i = false;
            return;
        }
        lc7 lc7Var = uc7.s1(r47Var != null ? r47Var.K1 : yac.t0).F3;
        kc7 d = lc7Var != null ? lc7Var.d(i) : null;
        if (d == null) {
            int v02 = aob.v0((r47Var == null || !r47Var.O3()) ? aob.Ld : aob.Rb, vnbVar);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = d.e(0, vnbVar);
        this.A = d.e(1, vnbVar);
        int e = d.e(2, vnbVar);
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

    public final int n(vnb vnbVar) {
        View view;
        this.R = false;
        int i = aob.q7;
        this.y = aob.v0(i, vnbVar);
        this.z = aob.v0(i, vnbVar);
        this.i = false;
        this.j = false;
        this.x = aob.p1(0.1f, aob.v0(i, vnbVar));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new ul(hl.L(20.0f), 13, view, false);
            if (!(view instanceof wb2) ? view.isAttachedToWindow() : ((wb2) view).O0) {
                this.t.a();
            }
        }
        ul ulVar = this.t;
        if (ulVar != null && ulVar.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = h();
        return this.I.a(this.y, false);
    }

    public final void o(boolean z) {
        va6 va6Var;
        boolean z2 = this.W;
        if (z) {
            if (!z2 && (va6Var = this.h) != null) {
                va6Var.c = -1L;
                va6Var.b = -1L;
            }
        } else if (z2) {
            this.X = 0.0f;
            va6 va6Var2 = this.h;
            if (va6Var2 != null) {
                va6Var2.a();
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
        this.x = aob.p1(z ? 0.12f : 0.1f, i);
        this.C = i;
    }
}
