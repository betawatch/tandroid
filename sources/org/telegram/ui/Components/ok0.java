package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ok0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final g5 E;
    public final g5 F;
    public final g5 G;
    public final g5 H;
    public final g5 I;
    public final d6 J;
    public final d6 K;
    public final d6 L;
    public final d6 M;
    public final d6 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.h6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public nk0[] a0;
    public float b0;
    public boolean c0;
    public q80 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public n5 t;
    public n5 u;
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

    public ok0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.v2(this, 14));
        }
        nr nrVar = nr.h;
        this.E = new g5(view, 400L, nrVar, 0);
        this.F = new g5(view, 400L, nrVar, 0);
        this.G = new g5(view, 400L, nrVar, 0);
        this.H = new g5(view, 400L, nrVar, 0);
        this.I = new g5(view, 400L, nrVar, 0);
        this.J = new d6(view, 0L, 400L, nrVar);
        this.K = new d6(view, 0L, 400L, nrVar);
        this.L = new d6(view, 0L, 440L, nrVar);
        this.M = new d6(view, 0L, 320L, nrVar);
        this.N = new d6(view, 0L, 320L, nrVar);
    }

    public final int a(org.telegram.messenger.gj gjVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        g5 g5Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        org.telegram.messenger.gj gjVar2;
        TLRPC.Message message2;
        int F;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int f10;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int w02;
        boolean z10;
        View view;
        TLRPC.Message message4;
        int i10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user2 = user;
        this.R = false;
        boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
        if (gjVar != null && !gjVar.P3() && i7 != 2 && (tL_peerColorCollectible = gjVar.g1) != null) {
            return m(gjVar, tL_peerColorCollectible, h6Var);
        }
        this.V = false;
        this.v = 0L;
        this.w = 0L;
        this.s = gjVar != null && gjVar.r4();
        g5 g5Var2 = this.I;
        if (gjVar == null) {
            this.R = true;
            this.S = i7;
            this.T = h6Var;
            this.U = org.telegram.ui.ActionBar.t6.b;
            this.j = false;
            this.i = false;
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ld, h6Var);
            this.B = w03;
            this.A = w03;
            this.z = w03;
            this.x = org.telegram.ui.ActionBar.m6.r1(d ? 0.12f : 0.1f, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nd, h6Var);
            this.y = w04;
            return g5Var2.a(w04, false);
        }
        int i11 = gjVar.K1;
        if (i7 != 4 || (message4 = gjVar.k) == null || org.telegram.messenger.gj.n1(message4) == null || !(org.telegram.messenger.gj.n1(gjVar.k) instanceof TLRPC.TL_messageMediaContact)) {
            g5Var = g5Var2;
            if (i7 != 0 && (gjVar.e1 >= 0 || (gjVar.k != null && (((gjVar.p3() || org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(gjVar.k))) && user2 != null) || ((gjVar.n3() && chat != null) || (((message3 = gjVar.k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (gjVar.r4() && (peerColor2 = gjVar.Z0) != null && peerColor2.color != -1))))))) {
                int i12 = gjVar.e1;
                if (i12 < 0) {
                    if (!gjVar.r4() || (peerColor = gjVar.Z0) == null || (f10 = peerColor.color) == -1) {
                        TLRPC.Message message5 = gjVar.k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o4 = org.telegram.messenger.n5.o(peer);
                            if (o4 < 0) {
                                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i11).O0(Long.valueOf(-o4));
                                if (!gjVar.P3() && i7 != 2 && O0 != null) {
                                    TLRPC.PeerColor peerColor3 = O0.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor3, h6Var);
                                    }
                                }
                                f10 = O0 != null ? org.telegram.messenger.v3.F(O0) : 5;
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.v3.G(O0);
                                }
                            } else {
                                TLRPC.User c22 = org.telegram.messenger.np.u1(i11).c2(Long.valueOf(o4));
                                if (!gjVar.P3() && i7 != 2 && c22 != null) {
                                    TLRPC.PeerColor peerColor4 = c22.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor4, h6Var);
                                    }
                                }
                                f10 = c22 != null ? org.telegram.messenger.p10.f(c22) : 5;
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.p10.g(c22);
                                }
                            }
                        } else if (org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(message5)) && user2 != null) {
                            TLRPC.User f11 = gjVar.P3() ? org.telegram.messenger.k10.i(i11).f() : user2;
                            if (f11 != null) {
                                user2 = f11;
                            }
                            if (!gjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor5 = user2.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor5, h6Var);
                                }
                            }
                            i12 = org.telegram.messenger.p10.f(user2);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.p10.g(user2);
                            }
                        } else if (gjVar.p3() && user2 != null) {
                            if (!gjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor6 = user2.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor6, h6Var);
                                }
                            }
                            i12 = org.telegram.messenger.p10.f(user2);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.p10.g(user2);
                            }
                        } else if (!gjVar.n3() || chat == null) {
                            i12 = 0;
                        } else {
                            if (!gjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor7, h6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = gjVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User c23 = org.telegram.messenger.np.u1(i11).c2(Long.valueOf(Z0));
                                    F = org.telegram.messenger.p10.f(c23);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.p10.g(c23);
                                    }
                                } else {
                                    TLRPC.Chat O02 = org.telegram.messenger.np.u1(i11).O0(Long.valueOf(-Z0));
                                    F = org.telegram.messenger.v3.F(O02);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.v3.G(O02);
                                    }
                                }
                                i12 = F;
                            } else {
                                i12 = org.telegram.messenger.v3.F(chat);
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.v3.G(chat);
                                }
                            }
                        }
                    } else if (i7 == 3) {
                        this.v = peerColor.background_emoji_id;
                    }
                    i12 = f10;
                }
                n(gjVar, i12, h6Var);
                this.x = org.telegram.ui.ActionBar.m6.r1(0.1f, this.z);
                this.y = this.z;
            } else if (i7 != 0 || (gjVar.e1 < 0 && ((message = gjVar.k) == null || gjVar.C == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (gjVar2 = gjVar.C).k) == null || message2.from_id == null || !(gjVar2.p3() || org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(gjVar.k)) || gjVar.C.n3()))))) {
                this.i = false;
                this.j = false;
                int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ld, h6Var);
                this.B = w05;
                this.A = w05;
                this.z = w05;
                this.x = org.telegram.ui.ActionBar.m6.r1(0.1f, w05);
                this.y = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nd, h6Var);
            } else {
                int i13 = gjVar.e1;
                if (i13 < 0) {
                    if (org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(gjVar.C.k))) {
                        if (gjVar.C.P3()) {
                            user2 = org.telegram.messenger.k10.i(gjVar.C.K1).f();
                        }
                        if (user2 != null) {
                            i13 = org.telegram.messenger.p10.f(user2);
                            this.v = org.telegram.messenger.p10.g(user2);
                        }
                        i13 = 0;
                    } else if (gjVar.C.p3()) {
                        TLRPC.User c24 = org.telegram.messenger.np.u1(i11).c2(Long.valueOf(gjVar.C.k.from_id.user_id));
                        if (!gjVar.P3() && i7 != 2 && c24 != null) {
                            TLRPC.PeerColor peerColor8 = c24.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor8, h6Var);
                            }
                        }
                        if (c24 != null) {
                            i13 = org.telegram.messenger.p10.f(c24);
                            this.v = org.telegram.messenger.p10.g(c24);
                        }
                        i13 = 0;
                    } else {
                        if (gjVar.C.n3()) {
                            TLRPC.Chat O03 = org.telegram.messenger.np.u1(i11).O0(Long.valueOf(gjVar.C.k.from_id.channel_id));
                            if (!gjVar.P3() && i7 != 2 && O03 != null) {
                                TLRPC.PeerColor peerColor9 = O03.color;
                                if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor9, h6Var);
                                }
                            }
                            if (O03 != null) {
                                i13 = org.telegram.messenger.v3.F(O03);
                                this.v = org.telegram.messenger.v3.G(O03);
                            }
                        }
                        i13 = 0;
                    }
                }
                n(gjVar.C, i13, h6Var);
                this.x = org.telegram.ui.ActionBar.m6.r1(0.1f, this.z);
                this.y = this.z;
            }
        } else {
            long j3 = org.telegram.messenger.gj.n1(gjVar.k).user_id;
            TLRPC.User c25 = j3 != 0 ? org.telegram.messenger.np.u1(i11).c2(Long.valueOf(j3)) : null;
            if (!gjVar.P3() && i7 != 2 && c25 != null) {
                TLRPC.PeerColor peerColor10 = c25.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor10, h6Var);
                }
            }
            if (c25 != null) {
                i10 = org.telegram.messenger.p10.f(c25);
                g5Var = g5Var2;
                this.v = org.telegram.messenger.p10.g(c25);
            } else {
                g5Var = g5Var2;
                i10 = 0;
            }
            n(gjVar, i10, h6Var);
            this.x = org.telegram.ui.ActionBar.m6.r1(0.1f, this.z);
            this.y = this.z;
        }
        if (gjVar.P5()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Od, h6Var);
        } else if (gjVar.P3() || i7 == 2) {
            if (i7 != 2 || gjVar.P3()) {
                int i14 = org.telegram.ui.ActionBar.m6.Rb;
                Integer z02 = org.telegram.ui.ActionBar.m6.z0(i14, h6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.i || this.j) {
                        i14 = org.telegram.ui.ActionBar.m6.Sb;
                    }
                    w02 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
                }
                this.B = w02;
                this.A = w02;
                this.z = w02;
            } else {
                int w06 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.gl, h6Var);
                this.B = w06;
                this.A = w06;
                this.z = w06;
            }
            if (this.j) {
                this.V = true;
                this.z = org.telegram.ui.ActionBar.m6.r1(0.2f, this.z);
                this.A = org.telegram.ui.ActionBar.m6.r1(0.5f, this.A);
            } else if (this.i) {
                this.V = true;
                this.z = org.telegram.ui.ActionBar.m6.r1(0.35f, this.z);
            }
            this.x = org.telegram.ui.ActionBar.m6.r1(d ? 0.12f : 0.1f, this.B);
            int i15 = org.telegram.ui.ActionBar.m6.Tb;
            this.y = org.telegram.ui.ActionBar.m6.w0(i15, h6Var);
            if (gjVar.P2() && gjVar.P3()) {
                this.x = i0.a.k(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Oa, h6Var), i0.a.k(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.La, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ua, h6Var)));
                this.y = org.telegram.ui.ActionBar.m6.z0(i15, h6Var).intValue();
            }
        }
        if (i7 == 0 || i7 == 3 || i7 == 4) {
            long j10 = gjVar.f1;
            if (j10 != -1) {
                this.v = j10;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new n5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.t.a();
            }
        }
        n5 n5Var = this.t;
        if (n5Var != null) {
            z10 = true;
            if (n5Var.j(this.v, true)) {
                this.c0 = false;
            }
        } else {
            z10 = true;
        }
        n5 n5Var2 = this.u;
        if (n5Var2 != null) {
            n5Var2.j(this.w, z10);
        }
        this.C = i();
        return g5Var.a(this.y, false);
    }

    public final void b() {
        ok0 ok0Var;
        if (!this.R || this.U == org.telegram.ui.ActionBar.t6.b) {
            return;
        }
        try {
            ok0Var = this;
        } catch (Exception e10) {
            e = e10;
            ok0Var = this;
        }
        try {
            ok0Var.a(null, null, null, this.T, this.S);
        } catch (Exception e11) {
            e = e11;
            ok0Var.R = false;
            org.telegram.messenger.a8.g(e, true);
        }
    }

    public final void c(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z10, boolean z11) {
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.cz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.cz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f13, z10, z11);
    }

    public final void e(Canvas canvas, RectF rectF, float f10, boolean z10, boolean z11) {
        boolean z12;
        fi.s2 s2Var;
        float d;
        int i7;
        n5 n5Var;
        b();
        if (!z11) {
            int r12 = org.telegram.ui.ActionBar.m6.r1(f10, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(r12);
            float[] fArr = this.e;
            if (a8.n7.a(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        n5 n5Var2 = this.t;
        if (n5Var2 != null) {
            if (!this.c0) {
                Drawable drawable = n5Var2.f[0];
                if ((drawable instanceof p5) && (s2Var = ((p5) drawable).k) != null && s2Var.J()) {
                    this.c0 = true;
                } else {
                    z12 = false;
                    d = this.L.d(z12);
                    if (d > 0.0f || this.r <= 0.0f) {
                    }
                    if (this.a0 == null) {
                        i7 = 0;
                        this.a0 = new nk0[]{new nk0(4.0f, -6.33f, 1.0f, 1.0f), new nk0(30.0f, 3.0f, 0.78f, 0.9f), new nk0(46.0f, -17.0f, 0.6f, 0.6f), new nk0(69.66f, -0.666f, 0.87f, 0.7f), new nk0(98.0f, -12.6f, 1.03f, 0.3f), new nk0(51.0f, 24.0f, 1.0f, 0.5f), new nk0(6.33f, 20.0f, 0.77f, 0.7f), new nk0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new nk0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                    } else {
                        i7 = 0;
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(0.0f, this.b0);
                    float max = Math.max(rectF.right - org.telegram.messenger.g0.L(15.0f), rectF.centerX());
                    if (z10) {
                        max -= org.telegram.messenger.g0.L(12.0f);
                    }
                    float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.g0.L(21.0f));
                    n5 n5Var3 = this.u;
                    if (n5Var3 != null) {
                        n5Var3.w = (int) (f10 * 255.0f);
                    }
                    this.t.k(Integer.valueOf(this.C));
                    int i10 = i7;
                    while (true) {
                        nk0[] nk0VarArr = this.a0;
                        if (i10 >= nk0VarArr.length) {
                            canvas.restore();
                            return;
                        }
                        if (i10 != 0 || (n5Var = this.u) == null || this.w == 0) {
                            n5Var = this.t;
                        }
                        nk0 nk0Var = nk0VarArr[i10];
                        if (!nk0Var.e || z10) {
                            n5Var.w = (int) ((n5Var == this.u ? 1.0f : 0.3f) * 255.0f * nk0Var.d * this.r);
                            float L = max - org.telegram.messenger.g0.L(nk0Var.a);
                            float L2 = org.telegram.messenger.g0.L(nk0Var.b) + min;
                            float L3 = org.telegram.messenger.g0.L(10.0f) * nk0Var.c * d;
                            n5Var.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                            n5Var.draw(canvas);
                        }
                        i10++;
                    }
                }
            }
            z12 = true;
            d = this.L.d(z12);
            if (d > 0.0f) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0249, code lost:
    
        if (r26.k.getHeight() == r10) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float height;
        int i7;
        int i10;
        float f12;
        b();
        int floor = (int) Math.floor(org.telegram.messenger.cz.Y0 / (this.s ? 2.0f : 3.0f));
        float max = rectF.left + Math.max(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(floor * 2));
        int a10 = this.F.a(this.z, false);
        int r12 = org.telegram.ui.ActionBar.m6.r1(f10, a10);
        Paint paint = this.b;
        paint.setColor(r12);
        float d = this.M.d(this.W);
        float d2 = this.J.d(this.i);
        float d10 = this.K.d(this.j);
        RectF rectF2 = this.a;
        if (d > 0.0f && !this.i) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * 0.3f));
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f13 = rectF2.left;
            canvas.clipRect(f13, rectF2.top, org.telegram.messenger.g0.L(3.0f) + f13, rectF2.bottom);
            float f14 = floor;
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(f14), paint);
            paint.setAlpha(alpha);
            j();
            float pow = ((float) Math.pow((this.X / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (org.telegram.messenger.g0.T1(0.0f, 1.0f - nr.i.getInterpolation(c8.l9.a(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top, rectF.left + org.telegram.messenger.g0.L(6.0f), (org.telegram.messenger.g0.T1(1.0f, 1.0f - nr.g.getInterpolation(c8.l9.a((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
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
            float f15 = rectF2.left;
            canvas.clipRect(f15, rectF2.top, org.telegram.messenger.g0.L(3.0f) + f15, rectF2.bottom);
            float f16 = floor;
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        j();
        if (this.j) {
            height = rectF.height();
            f11 = 12.66f;
            int height2 = (int) rectF.height();
            int L = org.telegram.messenger.g0.L(18.99f);
            i7 = height2 % L;
            if (i7 != 0) {
                if ((((height2 ^ L) >> 31) | 1) <= 0) {
                    i7 += L;
                }
                i10 = i7;
            }
            i10 = 0;
        } else {
            f11 = 12.66f;
            height = rectF.height();
            int height3 = (int) rectF.height();
            int L2 = org.telegram.messenger.g0.L(12.66f);
            i7 = height3 % L2;
            if (i7 != 0) {
                if ((((height3 ^ L2) >> 31) | 1) <= 0) {
                    i7 += L2;
                }
                i10 = i7;
            }
            i10 = 0;
        }
        float e10 = ((((this.N.e(false, this.q * 425) + this.Y) + (this.V ? 100 : 0)) / 1000.0f) * org.telegram.messenger.g0.L(30.0f)) % (height - i10);
        int a11 = this.G.a(this.A, false);
        int a12 = this.H.a(this.B, false);
        int r13 = org.telegram.ui.ActionBar.m6.r1(f10, a10);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.m6.r1(d2 * f10, a11), r13);
        int k11 = this.j ? i0.a.k(org.telegram.ui.ActionBar.m6.r1(f10 * d10, a12), r13) : 0;
        int round = Math.round(org.telegram.messenger.g0.N(6.33f));
        int max2 = Math.max(1, org.telegram.messenger.g0.L(3.0f));
        int L3 = this.j ? org.telegram.messenger.g0.L(18.99f) : org.telegram.messenger.g0.L(f11);
        Bitmap bitmap = this.k;
        Paint paint2 = this.c;
        if (bitmap != null && this.l == r13 && this.m == k10 && this.n == k11) {
            f12 = max;
            if (this.p == this.j) {
                if (this.o == round) {
                    if (bitmap.getWidth() == max2) {
                    }
                }
            }
        } else {
            f12 = max;
        }
        this.l = r13;
        this.m = k10;
        this.n = k11;
        this.p = this.j;
        this.o = round;
        Bitmap bitmap2 = this.k;
        if (bitmap2 == null || bitmap2.getWidth() != max2 || this.k.getHeight() != L3) {
            Bitmap bitmap3 = this.k;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.k = Bitmap.createBitmap(max2, L3, Bitmap.Config.ARGB_8888);
            paint2.setShader(new BitmapShader(this.k, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        }
        Utilities.drawReplyLinePattern(this.k, r13, k10, k11, round, this.j);
        Matrix matrix = this.d;
        matrix.setTranslate(0.0f, -e10);
        paint2.getShader().setLocalMatrix(matrix);
        paint2.setAlpha(org.telegram.messenger.ls.e4);
        rectF2.set(0.0f, 0.0f, f12 - rectF.left, rectF.bottom - rectF.top);
        float f17 = rectF2.left;
        canvas.clipRect(f17, rectF2.top, org.telegram.messenger.g0.L(3.0f) + f17, rectF2.bottom);
        float f18 = floor;
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(f18), paint2);
        canvas.restore();
    }

    public final void g(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        q80 q80Var;
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.cz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.cz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((q80Var = this.h) == null || !q80Var.d())) {
            q80 q80Var2 = this.h;
            if (q80Var2 != null) {
                q80Var2.b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            q80 q80Var3 = new q80();
            this.h = q80Var3;
            q80Var3.D = true;
            q80Var3.t = 3.5f;
            q80Var3.u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.m6.r1(0.1f, this.z), org.telegram.ui.ActionBar.m6.r1(0.3f, this.z), org.telegram.ui.ActionBar.m6.r1(0.3f, this.z), org.telegram.ui.ActionBar.m6.r1(1.25f, this.z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.x;
    }

    public final int i() {
        return this.V ? this.A : this.z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (Math.min(30L, currentTimeMillis - this.Z) * d) + this.X;
        this.Y = (Math.min(30L, currentTimeMillis - this.Z) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f10) {
        this.b0 = f10;
    }

    public final void l() {
        this.F.a(this.z, true);
        this.G.a(this.A, true);
        this.J.f(this.i, true);
        this.I.a(this.y, true);
        this.E.a(this.x, true);
        n5 n5Var = this.t;
        if (n5Var != null) {
            n5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.gj gjVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.h6 h6Var) {
        boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
        int i7 = (!d || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!d || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            int e12 = gjVar != null ? gjVar.e1() : 0;
            if (e12 == this.O) {
                this.q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = e12;
        }
        this.V = false;
        this.z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        boolean z10 = arrayList.size() >= 2;
        this.i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z11 = arrayList.size() >= 3;
        this.j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i10 = i7 | (-16777216);
        this.y = i10;
        this.x = org.telegram.ui.ActionBar.m6.r1(0.1f, i10);
        long j3 = tL_peerColorCollectible.background_emoji_id;
        this.v = j3;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j3 != 0 && this.t == null && view != null) {
            this.t = new n5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.t.a();
            }
        }
        n5 n5Var = this.t;
        if (n5Var != null && n5Var.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new n5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.u.a();
            }
        }
        n5 n5Var2 = this.u;
        if (n5Var2 != null) {
            n5Var2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void n(org.telegram.messenger.gj gjVar, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        if (h6Var != null) {
            h6Var.d();
        } else {
            org.telegram.ui.ActionBar.m6.j1();
        }
        if (this.P != i7) {
            int e12 = gjVar != null ? gjVar.e1() : 0;
            if (e12 == this.O) {
                this.q++;
            }
            this.Q = 0L;
            this.P = i7;
            this.O = e12;
        }
        if (i7 < 7) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.r8[i7], h6Var);
            this.B = w02;
            this.A = w02;
            this.z = w02;
            this.j = false;
            this.i = false;
            return;
        }
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(gjVar != null ? gjVar.K1 : org.telegram.messenger.k10.t0).t4;
        org.telegram.messenger.cp d = dpVar != null ? dpVar.d(i7) : null;
        if (d == null) {
            int w03 = org.telegram.ui.ActionBar.m6.w0((gjVar == null || !gjVar.P3()) ? org.telegram.ui.ActionBar.m6.Ld : org.telegram.ui.ActionBar.m6.Rb, h6Var);
            this.B = w03;
            this.A = w03;
            this.z = w03;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = d.e(0, h6Var);
        this.A = d.e(1, h6Var);
        int e10 = d.e(2, h6Var);
        this.B = e10;
        int i10 = this.A;
        int i11 = this.z;
        this.i = i10 != i11;
        boolean z10 = e10 != i11;
        this.j = z10;
        if (z10) {
            this.B = i10;
            this.A = e10;
        }
    }

    public final void o(float f10) {
        this.r = f10;
    }

    public final int p(org.telegram.ui.ActionBar.h6 h6Var) {
        View view;
        this.R = false;
        int i7 = org.telegram.ui.ActionBar.m6.q7;
        this.y = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.z = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.i = false;
        this.j = false;
        this.x = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new n5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.t.a();
            }
        }
        n5 n5Var = this.t;
        if (n5Var != null && n5Var.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = i();
        return this.I.a(this.y, false);
    }

    public final void q(boolean z10) {
        q80 q80Var;
        if (!z10 && this.W) {
            this.X = 0.0f;
            q80 q80Var2 = this.h;
            if (q80Var2 != null) {
                q80Var2.a();
            }
        } else if (z10 && !this.W && (q80Var = this.h) != null) {
            q80Var.c = -1L;
            q80Var.b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i7, boolean z10) {
        this.R = false;
        this.V = false;
        this.j = false;
        this.i = false;
        this.B = i7;
        this.A = i7;
        this.z = i7;
        this.x = org.telegram.ui.ActionBar.m6.r1(z10 ? 0.12f : 0.1f, i7);
        this.C = i7;
    }
}
