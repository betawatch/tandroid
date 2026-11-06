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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class zj0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final z4 E;
    public final z4 F;
    public final z4 G;
    public final z4 H;
    public final z4 I;
    public final w5 J;
    public final w5 K;
    public final w5 L;
    public final w5 M;
    public final w5 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.f6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public yj0[] a0;
    public float b0;
    public boolean c0;
    public a80 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public g5 t;
    public g5 u;
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

    public zj0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.m6(this, 10));
        }
        xq xqVar = xq.h;
        this.E = new z4(view, 400L, xqVar, 0);
        this.F = new z4(view, 400L, xqVar, 0);
        this.G = new z4(view, 400L, xqVar, 0);
        this.H = new z4(view, 400L, xqVar, 0);
        this.I = new z4(view, 400L, xqVar, 0);
        this.J = new w5(view, 0L, 400L, xqVar);
        this.K = new w5(view, 0L, 400L, xqVar);
        this.L = new w5(view, 0L, 440L, xqVar);
        this.M = new w5(view, 0L, 320L, xqVar);
        this.N = new w5(view, 0L, 320L, xqVar);
    }

    public final int a(org.telegram.messenger.ij ijVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        z4 z4Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        org.telegram.messenger.ij ijVar2;
        TLRPC.Message message2;
        int F;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int e10;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int w02;
        boolean z9;
        View view;
        TLRPC.Message message4;
        int i10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user2 = user;
        this.R = false;
        boolean a10 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        if (ijVar != null && !ijVar.Q3() && i7 != 2 && (tL_peerColorCollectible = ijVar.e1) != null) {
            return m(ijVar, tL_peerColorCollectible, f6Var);
        }
        this.V = false;
        this.v = 0L;
        this.w = 0L;
        this.s = ijVar != null && ijVar.s4();
        z4 z4Var2 = this.I;
        if (ijVar == null) {
            this.R = true;
            this.S = i7;
            this.T = f6Var;
            this.U = org.telegram.ui.ActionBar.r6.b;
            this.j = false;
            this.i = false;
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Id, f6Var);
            this.B = w03;
            this.A = w03;
            this.z = w03;
            this.x = org.telegram.ui.ActionBar.k6.r1(a10 ? 0.12f : 0.1f, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kd, f6Var);
            this.y = w04;
            return z4Var2.a(w04, false);
        }
        int i11 = ijVar.I1;
        if (i7 != 4 || (message4 = ijVar.k) == null || org.telegram.messenger.ij.o1(message4) == null || !(org.telegram.messenger.ij.o1(ijVar.k) instanceof TLRPC.TL_messageMediaContact)) {
            z4Var = z4Var2;
            if (i7 != 0 && (ijVar.c1 >= 0 || (ijVar.k != null && (((ijVar.q3() || org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.k))) && user2 != null) || ((ijVar.o3() && chat != null) || (((message3 = ijVar.k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (ijVar.s4() && (peerColor2 = ijVar.X0) != null && peerColor2.color != -1))))))) {
                int i12 = ijVar.c1;
                if (i12 < 0) {
                    if (!ijVar.s4() || (peerColor = ijVar.X0) == null || (e10 = peerColor.color) == -1) {
                        TLRPC.Message message5 = ijVar.k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o4 = org.telegram.messenger.m5.o(peer);
                            if (o4 < 0) {
                                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-o4));
                                if (!ijVar.Q3() && i7 != 2 && M0 != null) {
                                    TLRPC.PeerColor peerColor3 = M0.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor3, f6Var);
                                    }
                                }
                                e10 = M0 != null ? org.telegram.messenger.t3.F(M0) : 5;
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.t3.G(M0);
                                }
                            } else {
                                TLRPC.User a22 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(o4));
                                if (!ijVar.Q3() && i7 != 2 && a22 != null) {
                                    TLRPC.PeerColor peerColor4 = a22.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor4, f6Var);
                                    }
                                }
                                e10 = a22 != null ? org.telegram.messenger.t10.e(a22) : 5;
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.t10.f(a22);
                                }
                            }
                        } else if (org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(message5)) && user2 != null) {
                            TLRPC.User f10 = ijVar.Q3() ? org.telegram.messenger.p10.i(i11).f() : user2;
                            if (f10 != null) {
                                user2 = f10;
                            }
                            if (!ijVar.Q3() && i7 != 2) {
                                TLRPC.PeerColor peerColor5 = user2.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor5, f6Var);
                                }
                            }
                            i12 = org.telegram.messenger.t10.e(user2);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.t10.f(user2);
                            }
                        } else if (ijVar.q3() && user2 != null) {
                            if (!ijVar.Q3() && i7 != 2) {
                                TLRPC.PeerColor peerColor6 = user2.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor6, f6Var);
                                }
                            }
                            i12 = org.telegram.messenger.t10.e(user2);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.t10.f(user2);
                            }
                        } else if (!ijVar.o3() || chat == null) {
                            i12 = 0;
                        } else {
                            if (!ijVar.Q3() && i7 != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor7, f6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = ijVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User a23 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(Z0));
                                    F = org.telegram.messenger.t10.e(a23);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.t10.f(a23);
                                    }
                                } else {
                                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-Z0));
                                    F = org.telegram.messenger.t3.F(M02);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.t3.G(M02);
                                    }
                                }
                                i12 = F;
                            } else {
                                i12 = org.telegram.messenger.t3.F(chat);
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.t3.G(chat);
                                }
                            }
                        }
                    } else if (i7 == 3) {
                        this.v = peerColor.background_emoji_id;
                    }
                    i12 = e10;
                }
                n(ijVar, i12, f6Var);
                this.x = org.telegram.ui.ActionBar.k6.r1(0.1f, this.z);
                this.y = this.z;
            } else if (i7 != 0 || (ijVar.c1 < 0 && ((message = ijVar.k) == null || ijVar.C == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (ijVar2 = ijVar.C).k) == null || message2.from_id == null || !(ijVar2.q3() || org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.k)) || ijVar.C.o3()))))) {
                this.i = false;
                this.j = false;
                int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Id, f6Var);
                this.B = w05;
                this.A = w05;
                this.z = w05;
                this.x = org.telegram.ui.ActionBar.k6.r1(0.1f, w05);
                this.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kd, f6Var);
            } else {
                int i13 = ijVar.c1;
                if (i13 < 0) {
                    if (org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.C.k))) {
                        if (ijVar.C.Q3()) {
                            user2 = org.telegram.messenger.p10.i(ijVar.C.I1).f();
                        }
                        if (user2 != null) {
                            i13 = org.telegram.messenger.t10.e(user2);
                            this.v = org.telegram.messenger.t10.f(user2);
                        }
                        i13 = 0;
                    } else if (ijVar.C.q3()) {
                        TLRPC.User a24 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(ijVar.C.k.from_id.user_id));
                        if (!ijVar.Q3() && i7 != 2 && a24 != null) {
                            TLRPC.PeerColor peerColor8 = a24.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor8, f6Var);
                            }
                        }
                        if (a24 != null) {
                            i13 = org.telegram.messenger.t10.e(a24);
                            this.v = org.telegram.messenger.t10.f(a24);
                        }
                        i13 = 0;
                    } else {
                        if (ijVar.C.o3()) {
                            TLRPC.Chat M03 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(ijVar.C.k.from_id.channel_id));
                            if (!ijVar.Q3() && i7 != 2 && M03 != null) {
                                TLRPC.PeerColor peerColor9 = M03.color;
                                if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor9, f6Var);
                                }
                            }
                            if (M03 != null) {
                                i13 = org.telegram.messenger.t3.F(M03);
                                this.v = org.telegram.messenger.t3.G(M03);
                            }
                        }
                        i13 = 0;
                    }
                }
                n(ijVar.C, i13, f6Var);
                this.x = org.telegram.ui.ActionBar.k6.r1(0.1f, this.z);
                this.y = this.z;
            }
        } else {
            long j3 = org.telegram.messenger.ij.o1(ijVar.k).user_id;
            TLRPC.User a25 = j3 != 0 ? org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(j3)) : null;
            if (!ijVar.Q3() && i7 != 2 && a25 != null) {
                TLRPC.PeerColor peerColor10 = a25.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor10, f6Var);
                }
            }
            if (a25 != null) {
                i10 = org.telegram.messenger.t10.e(a25);
                z4Var = z4Var2;
                this.v = org.telegram.messenger.t10.f(a25);
            } else {
                z4Var = z4Var2;
                i10 = 0;
            }
            n(ijVar, i10, f6Var);
            this.x = org.telegram.ui.ActionBar.k6.r1(0.1f, this.z);
            this.y = this.z;
        }
        if (ijVar.Q5()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, f6Var);
        } else if (ijVar.Q3() || i7 == 2) {
            if (i7 != 2 || ijVar.Q3()) {
                int i14 = org.telegram.ui.ActionBar.k6.Ob;
                Integer z02 = org.telegram.ui.ActionBar.k6.z0(i14, f6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.i || this.j) {
                        i14 = org.telegram.ui.ActionBar.k6.Pb;
                    }
                    w02 = org.telegram.ui.ActionBar.k6.w0(i14, f6Var);
                }
                this.B = w02;
                this.A = w02;
                this.z = w02;
            } else {
                int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dl, f6Var);
                this.B = w06;
                this.A = w06;
                this.z = w06;
            }
            if (this.j) {
                this.V = true;
                this.z = org.telegram.ui.ActionBar.k6.r1(0.2f, this.z);
                this.A = org.telegram.ui.ActionBar.k6.r1(0.5f, this.A);
            } else if (this.i) {
                this.V = true;
                this.z = org.telegram.ui.ActionBar.k6.r1(0.35f, this.z);
            }
            this.x = org.telegram.ui.ActionBar.k6.r1(a10 ? 0.12f : 0.1f, this.B);
            int i15 = org.telegram.ui.ActionBar.k6.Qb;
            this.y = org.telegram.ui.ActionBar.k6.w0(i15, f6Var);
            if (ijVar.Q2() && ijVar.Q3()) {
                this.x = i0.a.k(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oa, f6Var), i0.a.k(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.La, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ua, f6Var)));
                this.y = org.telegram.ui.ActionBar.k6.z0(i15, f6Var).intValue();
            }
        }
        if (i7 == 0 || i7 == 3 || i7 == 4) {
            long j10 = ijVar.d1;
            if (j10 != -1) {
                this.v = j10;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new g5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.t.a();
            }
        }
        g5 g5Var = this.t;
        if (g5Var != null) {
            z9 = true;
            if (g5Var.j(this.v, true)) {
                this.c0 = false;
            }
        } else {
            z9 = true;
        }
        g5 g5Var2 = this.u;
        if (g5Var2 != null) {
            g5Var2.j(this.w, z9);
        }
        this.C = i();
        return z4Var.a(this.y, false);
    }

    public final void b() {
        zj0 zj0Var;
        if (!this.R || this.U == org.telegram.ui.ActionBar.r6.b) {
            return;
        }
        try {
            zj0Var = this;
        } catch (Exception e10) {
            e = e10;
            zj0Var = this;
        }
        try {
            zj0Var.a(null, null, null, this.T, this.S);
        } catch (Exception e11) {
            e = e11;
            zj0Var.R = false;
            org.telegram.messenger.a8.g(e, true);
        }
    }

    public final void c(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z9, boolean z10) {
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.iz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.iz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f13, z9, z10);
    }

    public final void e(Canvas canvas, RectF rectF, float f10, boolean z9, boolean z10) {
        boolean z11;
        di.z2 z2Var;
        float d;
        int i7;
        g5 g5Var;
        b();
        if (!z10) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(f10, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(r12);
            float[] fArr = this.e;
            if (a8.m7.a(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        g5 g5Var2 = this.t;
        if (g5Var2 != null) {
            if (!this.c0) {
                Drawable drawable = g5Var2.f[0];
                if ((drawable instanceof i5) && (z2Var = ((i5) drawable).k) != null && z2Var.J()) {
                    this.c0 = true;
                } else {
                    z11 = false;
                    d = this.L.d(z11);
                    if (d > 0.0f || this.r <= 0.0f) {
                    }
                    if (this.a0 == null) {
                        i7 = 0;
                        this.a0 = new yj0[]{new yj0(4.0f, -6.33f, 1.0f, 1.0f), new yj0(30.0f, 3.0f, 0.78f, 0.9f), new yj0(46.0f, -17.0f, 0.6f, 0.6f), new yj0(69.66f, -0.666f, 0.87f, 0.7f), new yj0(98.0f, -12.6f, 1.03f, 0.3f), new yj0(51.0f, 24.0f, 1.0f, 0.5f), new yj0(6.33f, 20.0f, 0.77f, 0.7f), new yj0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new yj0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                    } else {
                        i7 = 0;
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(0.0f, this.b0);
                    float max = Math.max(rectF.right - org.telegram.messenger.g0.L(15.0f), rectF.centerX());
                    if (z9) {
                        max -= org.telegram.messenger.g0.L(12.0f);
                    }
                    float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.g0.L(21.0f));
                    g5 g5Var3 = this.u;
                    if (g5Var3 != null) {
                        g5Var3.w = (int) (f10 * 255.0f);
                    }
                    this.t.k(Integer.valueOf(this.C));
                    int i10 = i7;
                    while (true) {
                        yj0[] yj0VarArr = this.a0;
                        if (i10 >= yj0VarArr.length) {
                            canvas.restore();
                            return;
                        }
                        if (i10 != 0 || (g5Var = this.u) == null || this.w == 0) {
                            g5Var = this.t;
                        }
                        yj0 yj0Var = yj0VarArr[i10];
                        if (!yj0Var.e || z9) {
                            g5Var.w = (int) ((g5Var == this.u ? 1.0f : 0.3f) * 255.0f * yj0Var.d * this.r);
                            float L = max - org.telegram.messenger.g0.L(yj0Var.a);
                            float L2 = org.telegram.messenger.g0.L(yj0Var.b) + min;
                            float L3 = org.telegram.messenger.g0.L(10.0f) * yj0Var.c * d;
                            g5Var.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                            g5Var.draw(canvas);
                        }
                        i10++;
                    }
                }
            }
            z11 = true;
            d = this.L.d(z11);
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
        int floor = (int) Math.floor(org.telegram.messenger.iz.Y0 / (this.s ? 2.0f : 3.0f));
        float max = rectF.left + Math.max(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(floor * 2));
        int a10 = this.F.a(this.z, false);
        int r12 = org.telegram.ui.ActionBar.k6.r1(f10, a10);
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
            rectF2.set(rectF.left, (org.telegram.messenger.g0.T1(0.0f, 1.0f - xq.i.getInterpolation(c8.j9.a(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top, rectF.left + org.telegram.messenger.g0.L(6.0f), (org.telegram.messenger.g0.T1(1.0f, 1.0f - xq.g.getInterpolation(c8.j9.a((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top);
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
        int r13 = org.telegram.ui.ActionBar.k6.r1(f10, a10);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.r1(d2 * f10, a11), r13);
        int k11 = this.j ? i0.a.k(org.telegram.ui.ActionBar.k6.r1(f10 * d10, a12), r13) : 0;
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
        paint2.setAlpha(org.telegram.messenger.qs.e4);
        rectF2.set(0.0f, 0.0f, f12 - rectF.left, rectF.bottom - rectF.top);
        float f17 = rectF2.left;
        canvas.clipRect(f17, rectF2.top, org.telegram.messenger.g0.L(3.0f) + f17, rectF2.bottom);
        float f18 = floor;
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(f18), paint2);
        canvas.restore();
    }

    public final void g(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        a80 a80Var;
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.iz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.iz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((a80Var = this.h) == null || !a80Var.d())) {
            a80 a80Var2 = this.h;
            if (a80Var2 != null) {
                a80Var2.b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            a80 a80Var3 = new a80();
            this.h = a80Var3;
            a80Var3.D = true;
            a80Var3.t = 3.5f;
            a80Var3.u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.k6.r1(0.1f, this.z), org.telegram.ui.ActionBar.k6.r1(0.3f, this.z), org.telegram.ui.ActionBar.k6.r1(0.3f, this.z), org.telegram.ui.ActionBar.k6.r1(1.25f, this.z));
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
        g5 g5Var = this.t;
        if (g5Var != null) {
            g5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.ij ijVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean a10 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        int i7 = (!a10 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!a10 || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            int f12 = ijVar != null ? ijVar.f1() : 0;
            if (f12 == this.O) {
                this.q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = f12;
        }
        this.V = false;
        this.z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        boolean z9 = arrayList.size() >= 2;
        this.i = z9;
        if (z9) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z10 = arrayList.size() >= 3;
        this.j = z10;
        if (z10) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i10 = i7 | (-16777216);
        this.y = i10;
        this.x = org.telegram.ui.ActionBar.k6.r1(0.1f, i10);
        long j3 = tL_peerColorCollectible.background_emoji_id;
        this.v = j3;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j3 != 0 && this.t == null && view != null) {
            this.t = new g5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.t.a();
            }
        }
        g5 g5Var = this.t;
        if (g5Var != null && g5Var.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new g5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.u.a();
            }
        }
        g5 g5Var2 = this.u;
        if (g5Var2 != null) {
            g5Var2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void n(org.telegram.messenger.ij ijVar, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        if (f6Var != null) {
            f6Var.a();
        } else {
            org.telegram.ui.ActionBar.k6.j1();
        }
        if (this.P != i7) {
            int f12 = ijVar != null ? ijVar.f1() : 0;
            if (f12 == this.O) {
                this.q++;
            }
            this.Q = 0L;
            this.P = i7;
            this.O = f12;
        }
        if (i7 < 7) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r8[i7], f6Var);
            this.B = w02;
            this.A = w02;
            this.z = w02;
            this.j = false;
            this.i = false;
            return;
        }
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(ijVar != null ? ijVar.I1 : org.telegram.messenger.p10.s0).q4;
        org.telegram.messenger.fp d = gpVar != null ? gpVar.d(i7) : null;
        if (d == null) {
            int w03 = org.telegram.ui.ActionBar.k6.w0((ijVar == null || !ijVar.Q3()) ? org.telegram.ui.ActionBar.k6.Id : org.telegram.ui.ActionBar.k6.Ob, f6Var);
            this.B = w03;
            this.A = w03;
            this.z = w03;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = d.e(0, f6Var);
        this.A = d.e(1, f6Var);
        int e10 = d.e(2, f6Var);
        this.B = e10;
        int i10 = this.A;
        int i11 = this.z;
        this.i = i10 != i11;
        boolean z9 = e10 != i11;
        this.j = z9;
        if (z9) {
            this.B = i10;
            this.A = e10;
        }
    }

    public final void o(float f10) {
        this.r = f10;
    }

    public final int p(org.telegram.ui.ActionBar.f6 f6Var) {
        View view;
        this.R = false;
        int i7 = org.telegram.ui.ActionBar.k6.q7;
        this.y = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        this.z = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        this.i = false;
        this.j = false;
        this.x = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new g5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.t.a();
            }
        }
        g5 g5Var = this.t;
        if (g5Var != null && g5Var.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = i();
        return this.I.a(this.y, false);
    }

    public final void q(boolean z9) {
        a80 a80Var;
        if (!z9 && this.W) {
            this.X = 0.0f;
            a80 a80Var2 = this.h;
            if (a80Var2 != null) {
                a80Var2.a();
            }
        } else if (z9 && !this.W && (a80Var = this.h) != null) {
            a80Var.c = -1L;
            a80Var.b = -1L;
        }
        this.W = z9;
    }

    public final void r(int i7, boolean z9) {
        this.R = false;
        this.V = false;
        this.j = false;
        this.i = false;
        this.B = i7;
        this.A = i7;
        this.z = i7;
        this.x = org.telegram.ui.ActionBar.k6.r1(z9 ? 0.12f : 0.1f, i7);
        this.C = i7;
    }
}
