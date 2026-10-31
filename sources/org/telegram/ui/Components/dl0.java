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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dl0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final w4 E;
    public final w4 F;
    public final w4 G;
    public final w4 H;
    public final w4 I;
    public final t5 J;
    public final t5 K;
    public final t5 L;
    public final t5 M;
    public final t5 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.p6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public cl0[] a0;
    public float b0;
    public boolean c0;
    public t80 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public d5 t;
    public d5 u;
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

    public dl0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new l.d(this, 8));
        }
        gr grVar = gr.h;
        this.E = new w4(view, 400L, grVar, 0);
        this.F = new w4(view, 400L, grVar, 0);
        this.G = new w4(view, 400L, grVar, 0);
        this.H = new w4(view, 400L, grVar, 0);
        this.I = new w4(view, 400L, grVar, 0);
        this.J = new t5(view, 0L, 400L, grVar);
        this.K = new t5(view, 0L, 400L, grVar);
        this.L = new t5(view, 0L, 440L, grVar);
        this.M = new t5(view, 0L, 320L, grVar);
        this.N = new t5(view, 0L, 320L, grVar);
    }

    public final int a(org.telegram.messenger.jj jjVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        w4 w4Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        org.telegram.messenger.jj jjVar2;
        TLRPC.Message message2;
        int F;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int e;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int w02;
        boolean z10;
        View view;
        TLRPC.Message message4;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user2 = user;
        this.R = false;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        if (jjVar != null && !jjVar.P3() && i10 != 2 && (tL_peerColorCollectible = jjVar.e1) != null) {
            return m(jjVar, tL_peerColorCollectible, p6Var);
        }
        this.V = false;
        this.v = 0L;
        this.w = 0L;
        this.s = jjVar != null && jjVar.r4();
        w4 w4Var2 = this.I;
        if (jjVar == null) {
            this.R = true;
            this.S = i10;
            this.T = p6Var;
            this.U = org.telegram.ui.ActionBar.a7.b;
            this.j = false;
            this.i = false;
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Id, p6Var);
            this.B = w03;
            this.A = w03;
            this.z = w03;
            this.x = org.telegram.ui.ActionBar.t6.r1(a2 ? 0.12f : 0.1f, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kd, p6Var);
            this.y = w04;
            return w4Var2.a(w04, false);
        }
        int i12 = jjVar.I1;
        if (i10 != 4 || (message4 = jjVar.k) == null || org.telegram.messenger.jj.o1(message4) == null || !(org.telegram.messenger.jj.o1(jjVar.k) instanceof TLRPC.TL_messageMediaContact)) {
            w4Var = w4Var2;
            if (i10 != 0 && (jjVar.c1 >= 0 || (jjVar.k != null && (((jjVar.p3() || org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(jjVar.k))) && user2 != null) || ((jjVar.n3() && chat != null) || (((message3 = jjVar.k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (jjVar.r4() && (peerColor2 = jjVar.X0) != null && peerColor2.color != -1))))))) {
                int i13 = jjVar.c1;
                if (i13 < 0) {
                    if (!jjVar.r4() || (peerColor = jjVar.X0) == null || (e = peerColor.color) == -1) {
                        TLRPC.Message message5 = jjVar.k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o10 = org.telegram.messenger.o5.o(peer);
                            if (o10 < 0) {
                                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(-o10));
                                if (!jjVar.P3() && i10 != 2 && L0 != null) {
                                    TLRPC.PeerColor peerColor3 = L0.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor3, p6Var);
                                    }
                                }
                                e = L0 != null ? org.telegram.messenger.w3.F(L0) : 5;
                                if (i10 == 3) {
                                    this.v = org.telegram.messenger.w3.G(L0);
                                }
                            } else {
                                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(o10));
                                if (!jjVar.P3() && i10 != 2 && Z1 != null) {
                                    TLRPC.PeerColor peerColor4 = Z1.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor4, p6Var);
                                    }
                                }
                                e = Z1 != null ? org.telegram.messenger.h20.e(Z1) : 5;
                                if (i10 == 3) {
                                    this.v = org.telegram.messenger.h20.f(Z1);
                                }
                            }
                        } else if (org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(message5)) && user2 != null) {
                            TLRPC.User f7 = jjVar.P3() ? org.telegram.messenger.d20.i(i12).f() : user2;
                            if (f7 != null) {
                                user2 = f7;
                            }
                            if (!jjVar.P3() && i10 != 2) {
                                TLRPC.PeerColor peerColor5 = user2.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor5, p6Var);
                                }
                            }
                            i13 = org.telegram.messenger.h20.e(user2);
                            if (i10 == 3) {
                                this.v = org.telegram.messenger.h20.f(user2);
                            }
                        } else if (jjVar.p3() && user2 != null) {
                            if (!jjVar.P3() && i10 != 2) {
                                TLRPC.PeerColor peerColor6 = user2.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor6, p6Var);
                                }
                            }
                            i13 = org.telegram.messenger.h20.e(user2);
                            if (i10 == 3) {
                                this.v = org.telegram.messenger.h20.f(user2);
                            }
                        } else if (!jjVar.n3() || chat == null) {
                            i13 = 0;
                        } else {
                            if (!jjVar.P3() && i10 != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor7, p6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = jjVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User Z12 = org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(Z0));
                                    F = org.telegram.messenger.h20.e(Z12);
                                    if (i10 == 3) {
                                        this.v = org.telegram.messenger.h20.f(Z12);
                                    }
                                } else {
                                    TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(-Z0));
                                    F = org.telegram.messenger.w3.F(L02);
                                    if (i10 == 3) {
                                        this.v = org.telegram.messenger.w3.G(L02);
                                    }
                                }
                                i13 = F;
                            } else {
                                i13 = org.telegram.messenger.w3.F(chat);
                                if (i10 == 3) {
                                    this.v = org.telegram.messenger.w3.G(chat);
                                }
                            }
                        }
                    } else if (i10 == 3) {
                        this.v = peerColor.background_emoji_id;
                    }
                    i13 = e;
                }
                n(jjVar, i13, p6Var);
                this.x = org.telegram.ui.ActionBar.t6.r1(0.1f, this.z);
                this.y = this.z;
            } else if (i10 != 0 || (jjVar.c1 < 0 && ((message = jjVar.k) == null || jjVar.C == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (jjVar2 = jjVar.C).k) == null || message2.from_id == null || !(jjVar2.p3() || org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(jjVar.k)) || jjVar.C.n3()))))) {
                this.i = false;
                this.j = false;
                int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Id, p6Var);
                this.B = w05;
                this.A = w05;
                this.z = w05;
                this.x = org.telegram.ui.ActionBar.t6.r1(0.1f, w05);
                this.y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kd, p6Var);
            } else {
                int i14 = jjVar.c1;
                if (i14 < 0) {
                    if (org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(jjVar.C.k))) {
                        if (jjVar.C.P3()) {
                            user2 = org.telegram.messenger.d20.i(jjVar.C.I1).f();
                        }
                        if (user2 != null) {
                            i14 = org.telegram.messenger.h20.e(user2);
                            this.v = org.telegram.messenger.h20.f(user2);
                        }
                        i14 = 0;
                    } else if (jjVar.C.p3()) {
                        TLRPC.User Z13 = org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(jjVar.C.k.from_id.user_id));
                        if (!jjVar.P3() && i10 != 2 && Z13 != null) {
                            TLRPC.PeerColor peerColor8 = Z13.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor8, p6Var);
                            }
                        }
                        if (Z13 != null) {
                            i14 = org.telegram.messenger.h20.e(Z13);
                            this.v = org.telegram.messenger.h20.f(Z13);
                        }
                        i14 = 0;
                    } else {
                        if (jjVar.C.n3()) {
                            TLRPC.Chat L03 = org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(jjVar.C.k.from_id.channel_id));
                            if (!jjVar.P3() && i10 != 2 && L03 != null) {
                                TLRPC.PeerColor peerColor9 = L03.color;
                                if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor9, p6Var);
                                }
                            }
                            if (L03 != null) {
                                i14 = org.telegram.messenger.w3.F(L03);
                                this.v = org.telegram.messenger.w3.G(L03);
                            }
                        }
                        i14 = 0;
                    }
                }
                n(jjVar.C, i14, p6Var);
                this.x = org.telegram.ui.ActionBar.t6.r1(0.1f, this.z);
                this.y = this.z;
            }
        } else {
            long j10 = org.telegram.messenger.jj.o1(jjVar.k).user_id;
            TLRPC.User Z14 = j10 != 0 ? org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(j10)) : null;
            if (!jjVar.P3() && i10 != 2 && Z14 != null) {
                TLRPC.PeerColor peerColor10 = Z14.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor10, p6Var);
                }
            }
            if (Z14 != null) {
                i11 = org.telegram.messenger.h20.e(Z14);
                w4Var = w4Var2;
                this.v = org.telegram.messenger.h20.f(Z14);
            } else {
                w4Var = w4Var2;
                i11 = 0;
            }
            n(jjVar, i11, p6Var);
            this.x = org.telegram.ui.ActionBar.t6.r1(0.1f, this.z);
            this.y = this.z;
        }
        if (jjVar.O5()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ld, p6Var);
        } else if (jjVar.P3() || i10 == 2) {
            if (i10 != 2 || jjVar.P3()) {
                int i15 = org.telegram.ui.ActionBar.t6.Ob;
                Integer z02 = org.telegram.ui.ActionBar.t6.z0(i15, p6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.i || this.j) {
                        i15 = org.telegram.ui.ActionBar.t6.Pb;
                    }
                    w02 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
                }
                this.B = w02;
                this.A = w02;
                this.z = w02;
            } else {
                int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.dl, p6Var);
                this.B = w06;
                this.A = w06;
                this.z = w06;
            }
            if (this.j) {
                this.V = true;
                this.z = org.telegram.ui.ActionBar.t6.r1(0.2f, this.z);
                this.A = org.telegram.ui.ActionBar.t6.r1(0.5f, this.A);
            } else if (this.i) {
                this.V = true;
                this.z = org.telegram.ui.ActionBar.t6.r1(0.35f, this.z);
            }
            this.x = org.telegram.ui.ActionBar.t6.r1(a2 ? 0.12f : 0.1f, this.B);
            int i16 = org.telegram.ui.ActionBar.t6.Qb;
            this.y = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
            if (jjVar.P2() && jjVar.P3()) {
                this.x = i0.b.k(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Oa, p6Var), i0.b.k(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.La, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ua, p6Var)));
                this.y = org.telegram.ui.ActionBar.t6.z0(i16, p6Var).intValue();
            }
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = jjVar.d1;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.t.a();
            }
        }
        d5 d5Var = this.t;
        if (d5Var != null) {
            z10 = true;
            if (d5Var.j(this.v, true)) {
                this.c0 = false;
            }
        } else {
            z10 = true;
        }
        d5 d5Var2 = this.u;
        if (d5Var2 != null) {
            d5Var2.j(this.w, z10);
        }
        this.C = i();
        return w4Var.a(this.y, false);
    }

    public final void b() {
        dl0 dl0Var;
        if (!this.R || this.U == org.telegram.ui.ActionBar.a7.b) {
            return;
        }
        try {
            dl0Var = this;
        } catch (Exception e) {
            e = e;
            dl0Var = this;
        }
        try {
            dl0Var.a(null, null, null, this.T, this.S);
        } catch (Exception e7) {
            e = e7;
            dl0Var.R = false;
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void c(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f7, f10, f11, f12, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12, boolean z10, boolean z11) {
        float max = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.tz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.i0.L(f10);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.i0.L(f11);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.tz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f11));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f12, z10, z11);
    }

    public final void e(Canvas canvas, RectF rectF, float f7, boolean z10, boolean z11) {
        boolean z12;
        ag.c2 c2Var;
        float d;
        int i10;
        d5 d5Var;
        b();
        if (!z11) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(f7, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(r12);
            float[] fArr = this.e;
            if (w7.o7.a(fArr)) {
                float f10 = fArr[0];
                canvas.drawRoundRect(rectF, f10, f10, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        d5 d5Var2 = this.t;
        if (d5Var2 != null) {
            if (!this.c0) {
                Drawable drawable = d5Var2.f[0];
                if ((drawable instanceof f5) && (c2Var = ((f5) drawable).k) != null && c2Var.J()) {
                    this.c0 = true;
                } else {
                    z12 = false;
                    d = this.L.d(z12);
                    if (d > 0.0f || this.r <= 0.0f) {
                    }
                    if (this.a0 == null) {
                        i10 = 0;
                        this.a0 = new cl0[]{new cl0(4.0f, -6.33f, 1.0f, 1.0f), new cl0(30.0f, 3.0f, 0.78f, 0.9f), new cl0(46.0f, -17.0f, 0.6f, 0.6f), new cl0(69.66f, -0.666f, 0.87f, 0.7f), new cl0(98.0f, -12.6f, 1.03f, 0.3f), new cl0(51.0f, 24.0f, 1.0f, 0.5f), new cl0(6.33f, 20.0f, 0.77f, 0.7f), new cl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new cl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                    } else {
                        i10 = 0;
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(0.0f, this.b0);
                    float max = Math.max(rectF.right - org.telegram.messenger.i0.L(15.0f), rectF.centerX());
                    if (z10) {
                        max -= org.telegram.messenger.i0.L(12.0f);
                    }
                    float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.i0.L(21.0f));
                    d5 d5Var3 = this.u;
                    if (d5Var3 != null) {
                        d5Var3.w = (int) (f7 * 255.0f);
                    }
                    this.t.k(Integer.valueOf(this.C));
                    int i11 = i10;
                    while (true) {
                        cl0[] cl0VarArr = this.a0;
                        if (i11 >= cl0VarArr.length) {
                            canvas.restore();
                            return;
                        }
                        if (i11 != 0 || (d5Var = this.u) == null || this.w == 0) {
                            d5Var = this.t;
                        }
                        cl0 cl0Var = cl0VarArr[i11];
                        if (!cl0Var.e || z10) {
                            d5Var.w = (int) ((d5Var == this.u ? 1.0f : 0.3f) * 255.0f * cl0Var.d * this.r);
                            float L = max - org.telegram.messenger.i0.L(cl0Var.a);
                            float L2 = org.telegram.messenger.i0.L(cl0Var.b) + min;
                            float L3 = org.telegram.messenger.i0.L(10.0f) * cl0Var.c * d;
                            d5Var.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                            d5Var.draw(canvas);
                        }
                        i11++;
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
    public final void f(Canvas canvas, RectF rectF, float f7) {
        float f10;
        float height;
        int i10;
        int i11;
        float f11;
        b();
        int floor = (int) Math.floor(org.telegram.messenger.tz.Y0 / (this.s ? 2.0f : 3.0f));
        float max = rectF.left + Math.max(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(floor * 2));
        int a2 = this.F.a(this.z, false);
        int r12 = org.telegram.ui.ActionBar.t6.r1(f7, a2);
        Paint paint = this.b;
        paint.setColor(r12);
        float d = this.M.d(this.W);
        float d10 = this.J.d(this.i);
        float d11 = this.K.d(this.j);
        RectF rectF2 = this.a;
        if (d > 0.0f && !this.i) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * 0.3f));
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f12 = rectF2.left;
            canvas.clipRect(f12, rectF2.top, org.telegram.messenger.i0.L(3.0f) + f12, rectF2.bottom);
            float f13 = floor;
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(f13), paint);
            paint.setAlpha(alpha);
            j();
            float pow = ((float) Math.pow((this.X / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (org.telegram.messenger.i0.T1(0.0f, 1.0f - gr.i.getInterpolation(w7.u.a(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top, rectF.left + org.telegram.messenger.i0.L(6.0f), (org.telegram.messenger.i0.T1(1.0f, 1.0f - gr.g.getInterpolation(w7.u.a((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), d) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
            canvas.restore();
            View view = this.D;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (d10 <= 0.0f) {
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f14 = rectF2.left;
            canvas.clipRect(f14, rectF2.top, org.telegram.messenger.i0.L(3.0f) + f14, rectF2.bottom);
            float f15 = floor;
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f15), paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        j();
        if (this.j) {
            height = rectF.height();
            f10 = 12.66f;
            int height2 = (int) rectF.height();
            int L = org.telegram.messenger.i0.L(18.99f);
            i10 = height2 % L;
            if (i10 != 0) {
                if ((((height2 ^ L) >> 31) | 1) <= 0) {
                    i10 += L;
                }
                i11 = i10;
            }
            i11 = 0;
        } else {
            f10 = 12.66f;
            height = rectF.height();
            int height3 = (int) rectF.height();
            int L2 = org.telegram.messenger.i0.L(12.66f);
            i10 = height3 % L2;
            if (i10 != 0) {
                if ((((height3 ^ L2) >> 31) | 1) <= 0) {
                    i10 += L2;
                }
                i11 = i10;
            }
            i11 = 0;
        }
        float e = ((((this.N.e(false, this.q * 425) + this.Y) + (this.V ? 100 : 0)) / 1000.0f) * org.telegram.messenger.i0.L(30.0f)) % (height - i11);
        int a10 = this.G.a(this.A, false);
        int a11 = this.H.a(this.B, false);
        int r13 = org.telegram.ui.ActionBar.t6.r1(f7, a2);
        int k10 = i0.b.k(org.telegram.ui.ActionBar.t6.r1(d10 * f7, a10), r13);
        int k11 = this.j ? i0.b.k(org.telegram.ui.ActionBar.t6.r1(f7 * d11, a11), r13) : 0;
        int round = Math.round(org.telegram.messenger.i0.N(6.33f));
        int max2 = Math.max(1, org.telegram.messenger.i0.L(3.0f));
        int L3 = this.j ? org.telegram.messenger.i0.L(18.99f) : org.telegram.messenger.i0.L(f10);
        Bitmap bitmap = this.k;
        Paint paint2 = this.c;
        if (bitmap != null && this.l == r13 && this.m == k10 && this.n == k11) {
            f11 = max;
            if (this.p == this.j) {
                if (this.o == round) {
                    if (bitmap.getWidth() == max2) {
                    }
                }
            }
        } else {
            f11 = max;
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
        matrix.setTranslate(0.0f, -e);
        paint2.getShader().setLocalMatrix(matrix);
        paint2.setAlpha(org.telegram.messenger.zs.e4);
        rectF2.set(0.0f, 0.0f, f11 - rectF.left, rectF.bottom - rectF.top);
        float f16 = rectF2.left;
        canvas.clipRect(f16, rectF2.top, org.telegram.messenger.i0.L(3.0f) + f16, rectF2.bottom);
        float f17 = floor;
        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f17), org.telegram.messenger.i0.L(f17), paint2);
        canvas.restore();
    }

    public final void g(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        t80 t80Var;
        float max = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.tz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.i0.L(f10);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.i0.L(f11);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.tz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f11));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((t80Var = this.h) == null || !t80Var.d())) {
            t80 t80Var2 = this.h;
            if (t80Var2 != null) {
                t80Var2.b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            t80 t80Var3 = new t80();
            this.h = t80Var3;
            t80Var3.D = true;
            t80Var3.t = 3.5f;
            t80Var3.u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.t6.r1(0.1f, this.z), org.telegram.ui.ActionBar.t6.r1(0.3f, this.z), org.telegram.ui.ActionBar.t6.r1(0.3f, this.z), org.telegram.ui.ActionBar.t6.r1(1.25f, this.z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.x.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
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

    public final void k(float f7) {
        this.b0 = f7;
    }

    public final void l() {
        this.F.a(this.z, true);
        this.G.a(this.A, true);
        this.J.f(this.i, true);
        this.I.a(this.y, true);
        this.E.a(this.x, true);
        d5 d5Var = this.t;
        if (d5Var != null) {
            d5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.jj jjVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.p6 p6Var) {
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        int i10 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!a2 || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            int f12 = jjVar != null ? jjVar.f1() : 0;
            if (f12 == this.O) {
                this.q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = f12;
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
        int i11 = i10 | (-16777216);
        this.y = i11;
        this.x = org.telegram.ui.ActionBar.t6.r1(0.1f, i11);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j10 != 0 && this.t == null && view != null) {
            this.t = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.t.a();
            }
        }
        d5 d5Var = this.t;
        if (d5Var != null && d5Var.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.u.a();
            }
        }
        d5 d5Var2 = this.u;
        if (d5Var2 != null) {
            d5Var2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void n(org.telegram.messenger.jj jjVar, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        if (p6Var != null) {
            p6Var.a();
        } else {
            org.telegram.ui.ActionBar.t6.j1();
        }
        if (this.P != i10) {
            int f12 = jjVar != null ? jjVar.f1() : 0;
            if (f12 == this.O) {
                this.q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = f12;
        }
        if (i10 < 7) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.r8[i10], p6Var);
            this.B = w02;
            this.A = w02;
            this.z = w02;
            this.j = false;
            this.i = false;
            return;
        }
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(jjVar != null ? jjVar.I1 : org.telegram.messenger.d20.s0).r4;
        org.telegram.messenger.kp d = lpVar != null ? lpVar.d(i10) : null;
        if (d == null) {
            int w03 = org.telegram.ui.ActionBar.t6.w0((jjVar == null || !jjVar.P3()) ? org.telegram.ui.ActionBar.t6.Id : org.telegram.ui.ActionBar.t6.Ob, p6Var);
            this.B = w03;
            this.A = w03;
            this.z = w03;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = d.e(0, p6Var);
        this.A = d.e(1, p6Var);
        int e = d.e(2, p6Var);
        this.B = e;
        int i11 = this.A;
        int i12 = this.z;
        this.i = i11 != i12;
        boolean z10 = e != i12;
        this.j = z10;
        if (z10) {
            this.B = i11;
            this.A = e;
        }
    }

    public final void o(float f7) {
        this.r = f7;
    }

    public final int p(org.telegram.ui.ActionBar.p6 p6Var) {
        View view;
        this.R = false;
        int i10 = org.telegram.ui.ActionBar.t6.q7;
        this.y = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.z = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.i = false;
        this.j = false;
        this.x = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.t.a();
            }
        }
        d5 d5Var = this.t;
        if (d5Var != null && d5Var.j(this.v, true)) {
            this.c0 = false;
        }
        this.C = i();
        return this.I.a(this.y, false);
    }

    public final void q(boolean z10) {
        t80 t80Var;
        if (!z10 && this.W) {
            this.X = 0.0f;
            t80 t80Var2 = this.h;
            if (t80Var2 != null) {
                t80Var2.a();
            }
        } else if (z10 && !this.W && (t80Var = this.h) != null) {
            t80Var.c = -1L;
            t80Var.b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i10, boolean z10) {
        this.R = false;
        this.V = false;
        this.j = false;
        this.i = false;
        this.B = i10;
        this.A = i10;
        this.z = i10;
        this.x = org.telegram.ui.ActionBar.t6.r1(z10 ? 0.12f : 0.1f, i10);
        this.C = i10;
    }
}
