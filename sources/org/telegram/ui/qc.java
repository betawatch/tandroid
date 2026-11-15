package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class qc extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public org.telegram.ui.Components.ch0 L;
    public org.telegram.ui.ActionBar.q0 M;
    public org.telegram.ui.Components.uj0 N;
    public dc O;
    public FrameLayout P;
    public hi.d Q;
    public ac R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long a;
    public int a0;
    public int b;
    public int b0;
    public TL_stories.TL_premium_boostsStatus c;
    public int c0;
    public boolean d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g0;
    public long h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public org.telegram.ui.ActionBar.e2 m0;
    public long n;
    public bc n0;
    public float o0;
    public ValueAnimator p0;
    public boolean q0;
    public int r;
    public org.telegram.ui.ActionBar.e6 r0;
    public int s;
    public final SparseIntArray s0;
    public final org.telegram.ui.ActionBar.r4 t0;
    public final org.telegram.ui.ActionBar.r4 u0;
    public final org.telegram.ui.ActionBar.r4 v0;
    public long w;
    public final org.telegram.ui.ActionBar.r4 w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Drawable y0;
    public final Paint z0;

    public qc(long j3) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.K = q10;
        this.S = 0;
        this.q0 = q10;
        this.s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
        this.x0 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_check_s).mutate();
        this.y0 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
        if (M0 != null) {
            this.b = M0.level;
        }
        org.telegram.messenger.np.s1(this.currentAccount).G0().a(j3, new li.v(11, this, M0));
        this.resourceProvider = new pc(this);
        this.t0 = new org.telegram.ui.ActionBar.r4(0, false, false, this.resourceProvider);
        this.u0 = new org.telegram.ui.ActionBar.r4(0, false, true, this.resourceProvider);
        this.v0 = new org.telegram.ui.ActionBar.r4(0, true, false, this.resourceProvider);
        this.w0 = new org.telegram.ui.ActionBar.r4(0, true, true, this.resourceProvider);
    }

    public static void Z(qc qcVar) {
        org.telegram.ui.ActionBar.e6 e6Var = qcVar.resourceProvider;
        if (e6Var instanceof pc) {
            qc qcVar2 = ((pc) e6Var).a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        } else {
            qcVar.K = !qcVar.K;
            qcVar.k1();
        }
        qcVar.b1(qcVar.K, true);
        qcVar.g1(false);
        org.telegram.ui.ActionBar.j6.Dm++;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(qc qcVar, org.telegram.messenger.e3 e3Var) {
        int i7;
        int i10;
        long j3 = qcVar.a;
        if (qcVar.e != qcVar.f) {
            org.telegram.messenger.dp dpVar = qcVar.getMessagesController().r4;
            org.telegram.messenger.cp d = dpVar == null ? null : dpVar.d(qcVar.f);
            if (d != null && d.l(qcVar.d) > qcVar.b) {
                i7 = d.l(qcVar.d);
                if (qcVar.r != qcVar.s) {
                    org.telegram.messenger.dp dpVar2 = qcVar.getMessagesController().s4;
                    org.telegram.messenger.cp d2 = dpVar2 != null ? dpVar2.d(qcVar.s) : null;
                    if (d2 != null && d2.l(qcVar.d) > qcVar.b) {
                        i7 = d2.l(qcVar.d);
                        i10 = 24;
                        int i11 = i7;
                        if (qcVar.h != qcVar.n && qcVar.getMessagesController().r5 > qcVar.b) {
                            i10 = 27;
                        }
                        if (qcVar.w != qcVar.x && qcVar.Q0() > qcVar.b) {
                            i10 = 28;
                        }
                        if (!org.telegram.messenger.m5.a(qcVar.y, qcVar.E) && qcVar.M0() > qcVar.b) {
                            i10 = !(qcVar.E instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        if (!org.telegram.messenger.d4.v(qcVar.F, qcVar.G)) {
                            i10 = !TextUtils.isEmpty(org.telegram.messenger.d4.j(qcVar.G)) ? 22 : 23;
                        }
                        int i12 = i10;
                        if (qcVar.getParentActivity() == null || qcVar.getParentActivity() == null) {
                            return;
                        }
                        yb ybVar = new yb(qcVar, qcVar.getParentActivity(), i12, qcVar.currentAccount, qcVar.getResourceProvider(), i11);
                        ybVar.A1(e3Var);
                        ybVar.z1(qcVar.c, true);
                        ybVar.B1(j3);
                        TLRPC.Chat M0 = qcVar.getMessagesController().M0(Long.valueOf(-j3));
                        if (M0 != null) {
                            ybVar.M2 = new u5(11, qcVar, M0);
                        }
                        qcVar.showDialog(ybVar);
                        qcVar.Q.setLoading(false);
                        return;
                    }
                }
                i10 = 20;
                int i112 = i7;
                if (qcVar.h != qcVar.n) {
                    i10 = 27;
                }
                if (qcVar.w != qcVar.x) {
                    i10 = 28;
                }
                if (!org.telegram.messenger.m5.a(qcVar.y, qcVar.E)) {
                    if (!(qcVar.E instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!org.telegram.messenger.d4.v(qcVar.F, qcVar.G)) {
                }
                int i122 = i10;
                if (qcVar.getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i7 = 0;
        if (qcVar.r != qcVar.s) {
        }
        i10 = 20;
        int i1122 = i7;
        if (qcVar.h != qcVar.n) {
        }
        if (qcVar.w != qcVar.x) {
        }
        if (!org.telegram.messenger.m5.a(qcVar.y, qcVar.E)) {
        }
        if (!org.telegram.messenger.d4.v(qcVar.F, qcVar.G)) {
        }
        int i1222 = i10;
        if (qcVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(qc qcVar, TLRPC.ChatFull chatFull, View view, int i7) {
        long j3;
        long f10;
        int i10;
        long j10 = qcVar.a;
        int i11 = 0;
        if (!(view instanceof ec)) {
            if (i7 == qcVar.f0) {
                qcVar.s = -1;
                qcVar.x = 0L;
                if (qcVar.E instanceof TLRPC.TL_emojiStatusCollectible) {
                    qcVar.E = null;
                }
                qcVar.i1();
                qcVar.e1(true);
                qcVar.j1();
                qcVar.g1(true);
                return;
            }
            if (i7 == qcVar.Y) {
                Activity parentActivity = qcVar.getParentActivity();
                long j11 = qcVar.a;
                org.telegram.ui.ActionBar.e6 e6Var = qcVar.resourceProvider;
                vb vbVar = new vb(qcVar, i11);
                f fVar = new f(qcVar, 10);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qcVar.c;
                int i12 = org.telegram.ui.Components.ep.g2;
                org.telegram.ui.Components.ki kiVar = new org.telegram.ui.Components.ki(parentActivity, qcVar, false, false, false, e6Var);
                kiVar.n = true;
                kiVar.A1(org.telegram.messenger.hd.M0(2131752139, null));
                kiVar.X3 = new org.telegram.ui.Components.vo(kiVar, tL_premium_boostsStatus, e6Var, fVar, j11, vbVar, qcVar);
                kiVar.y1(1, false);
                kiVar.e1();
                kiVar.e2.i0();
                kiVar.show();
                return;
            }
            return;
        }
        if (i7 == qcVar.k0) {
            if (chatFull == null) {
                return;
            }
            l50 l50Var = new l50(-j10);
            l50Var.j0(chatFull);
            qcVar.presentFragment(l50Var);
            return;
        }
        if (i7 == qcVar.V) {
            f10 = qcVar.n;
        } else if (i7 == qcVar.d0) {
            f10 = qcVar.x;
        } else {
            if (i7 != qcVar.g0) {
                j3 = 0;
                if (i7 != qcVar.i0) {
                    int O0 = qcVar.O0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = qcVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < O0) {
                        qcVar.a1(29);
                        return;
                    }
                    l50 l50Var2 = new l50(-j10, 0);
                    l50Var2.j0(chatFull);
                    qcVar.presentFragment(l50Var2);
                    return;
                }
                ec ecVar = (ec) view;
                boolean z10 = i7 == qcVar.g0;
                ub ubVar = new ub(qcVar, i7, view);
                int w02 = qcVar.E instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v6, qcVar.resourceProvider) : ecVar.f;
                if (qcVar.R == null) {
                    org.telegram.ui.Components.e5 e5Var = ecVar.c;
                    e11[] e11VarArr = new e11[1];
                    boolean z11 = ((float) (ecVar.getHeight() + ecVar.getTop())) > ((float) qcVar.N.getMeasuredHeight()) / 2.0f;
                    float L = org.telegram.messenger.g0.L(330.0f);
                    Point point = org.telegram.messenger.g0.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                    Drawable[] drawableArr = e5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        if (drawable instanceof org.telegram.ui.Components.g5) {
                            ((org.telegram.ui.Components.g5) drawable).o(e5Var);
                        }
                        drawableArr[1] = null;
                    }
                    e5Var.f();
                    ecVar.f();
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(e5Var.getBounds());
                    int L2 = z11 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(ecVar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                    int centerX = rect.centerX() - (point.x - min2);
                    if (z10) {
                        i10 = z11 ? 10 : 9;
                    } else {
                        i10 = z11 ? 5 : 7;
                    }
                    zb zbVar = new zb(qcVar, qcVar, qcVar.getParentActivity(), Integer.valueOf(centerX), i10, qcVar.getResourceProvider(), z11 ? 24 : 16, w02, ubVar, e11VarArr);
                    zbVar.h1 = true;
                    zbVar.setSelected(j3 == 0 ? null : Long.valueOf(j3));
                    zbVar.setSaveState(3);
                    zbVar.y(e5Var, ecVar);
                    ac acVar = new ac(qcVar, zbVar);
                    qcVar.R = acVar;
                    e11VarArr[0] = acVar;
                    acVar.showAsDropDown(ecVar, 0, L2, 53);
                    e11VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = qcVar.E;
            f10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : org.telegram.messenger.m5.f(emojiStatus);
        }
        j3 = f10;
        if (i7 != qcVar.i0) {
        }
    }

    public static void f1(View view) {
        if (view instanceof ec) {
            ((ec) view).updateColors();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.l8) {
            ((org.telegram.ui.Cells.l8) view).updateColors();
        } else if (view instanceof hc) {
            ((hc) view).updateColors();
        } else if (view instanceof oc) {
            ((oc) view).updateColors();
        }
    }

    public final void B0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null) {
            return;
        }
        kVar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.j6.A8) : -1);
        this.actionBar.H((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.j6.v8) : -1, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.s8));
        }
        org.telegram.ui.Components.uj0 uj0Var = this.N;
        if (uj0Var != null && this.d) {
            uj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        long j3;
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12;
        long j10;
        long j11;
        ?? r72;
        if (this.c == null || this.Q.R) {
            return;
        }
        int i13 = this.b;
        int Z0 = Z0();
        long j12 = this.a;
        int i14 = 1;
        if (i13 < Z0) {
            this.Q.setLoading(true);
            getMessagesController().G0().b(j12, this.c, new vb(this, i14));
            return;
        }
        int[] iArr = {0};
        final bi.o1 o1Var = new bi.o1(this, new boolean[]{false}, new int[]{0}, iArr, 5);
        long j13 = -j12;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j13));
        if (M0 == null) {
            org.telegram.messenger.a8.d("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.k5.n(null, 2131743879, org.telegram.ui.Components.cc.a0(this), R.raw.error, 36);
            return;
        }
        this.Q.setLoading(true);
        final int i15 = 2;
        if (this.e == this.f) {
            j3 = j12;
            i7 = 3;
            if (this.h == this.n) {
                i10 = 3;
                z10 = true;
                i11 = 0;
                if (this.r == this.s || this.w != this.x) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    tL_channels_updateColor.channel = getMessagesController().h1(j13);
                    tL_channels_updateColor.for_profile = z10;
                    if (M0.profile_color == null) {
                        M0.profile_color = new TLRPC.TL_peerColor();
                        M0.flags2 |= 256;
                    }
                    i12 = this.s;
                    if (i12 < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i12;
                        TLRPC.PeerColor peerColor = M0.profile_color;
                        peerColor.flags |= 1;
                        peerColor.color = i12;
                    } else {
                        M0.profile_color.flags &= -2;
                    }
                    j10 = this.x;
                    if (j10 == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j10;
                        TLRPC.PeerColor peerColor2 = M0.profile_color;
                        peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j10;
                    } else {
                        TLRPC.PeerColor peerColor3 = M0.profile_color;
                        peerColor3.flags &= -3;
                        peerColor3.background_emoji_id = 0L;
                    }
                    iArr[i11] = iArr[i11] + 1;
                    final int i16 = i10;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.tb
                        public final /* synthetic */ qc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i16) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                }
                if (org.telegram.messenger.d4.v(this.F, this.G)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    j11 = j3;
                    tL_messages_setChatWallPaper.peer = getMessagesController().j1(j11);
                    TLRPC.WallPaper wallPaper = this.G;
                    if (wallPaper != null) {
                        if (TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.WallPaper wallPaper2 = this.G;
                            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                                TLRPC.WallPaper wallPaper3 = this.G;
                                tL_inputWallPaper.id = wallPaper3.id;
                                tL_inputWallPaper.access_hash = wallPaper3.access_hash;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                            } else if (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = this.G.id;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                            }
                        } else {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                            tL_inputWallPaperNoFile2.id = 0L;
                            tL_messages_setChatWallPaper.flags |= 4;
                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                            tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                            tL_wallPaperSettings.flags |= 128;
                            tL_wallPaperSettings.emoticon = org.telegram.messenger.d4.j(this.G);
                        }
                    }
                    iArr[i11] = iArr[i11] + 1;
                    final int i17 = i11;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.tb
                        public final /* synthetic */ qc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i17) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull N0 = getMessagesController().N0(j13);
                    org.telegram.messenger.d4.f(this.currentAccount).r(j11, this.G);
                    if (N0 != null) {
                        TLRPC.WallPaper wallPaper4 = this.G;
                        if (wallPaper4 == null) {
                            N0.flags2 &= -129;
                            N0.wallpaper = null;
                        } else {
                            N0.flags2 |= 128;
                            N0.wallpaper = wallPaper4;
                        }
                        getMessagesController().R3(N0);
                        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.k(org.telegram.messenger.ns.T, N0, 0, bool, bool);
                    }
                } else {
                    j11 = j3;
                }
                if (org.telegram.messenger.m5.a(this.y, this.E)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().h1(j13);
                    TLRPC.EmojiStatus emojiStatus = this.E;
                    if (emojiStatus == null || (emojiStatus instanceof TLRPC.TL_emojiStatusEmpty)) {
                        tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        M0.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        M0.flags2 &= -513;
                    } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_inputEmojiStatusCollectible.collectible_id = tL_emojiStatusCollectible.collectible_id;
                        tL_inputEmojiStatusCollectible.flags = tL_emojiStatusCollectible.flags;
                        tL_inputEmojiStatusCollectible.until = tL_emojiStatusCollectible.until;
                        tL_channels_updateEmojiStatus.emoji_status = tL_inputEmojiStatusCollectible;
                        M0.emoji_status = this.E;
                        M0.flags |= 512;
                    } else {
                        tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                        M0.emoji_status = emojiStatus;
                        M0.flags |= 512;
                    }
                    getMessagesController().k5(j11, this.E);
                    r72 = 0;
                    final int i18 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.tb
                        public final /* synthetic */ qc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i18) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    o1Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    r72 = 0;
                }
                if (iArr[r72] != 0) {
                    finishFragment();
                    this.Q.setLoading(r72);
                    return;
                }
                getMessagesController().Q3(M0, r72);
                org.telegram.messenger.ns notificationCenter2 = getNotificationCenter();
                int i19 = org.telegram.messenger.np.D8;
                Object[] objArr = new Object[1];
                objArr[r72] = Integer.valueOf(TLObject.FLAG_19);
                notificationCenter2.k(org.telegram.messenger.ns.r, objArr);
                return;
            }
        } else {
            j3 = j12;
            i7 = 3;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().h1(j13);
        tL_channels_updateColor2.for_profile = false;
        if (M0.color == null) {
            M0.color = new TLRPC.TL_peerColor();
            M0.flags2 |= 128;
        }
        int i20 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i20 | 4;
        int i21 = this.f;
        tL_channels_updateColor2.color = i21;
        TLRPC.PeerColor peerColor4 = M0.color;
        i10 = i7;
        int i22 = peerColor4.flags;
        int i23 = i22 | 1;
        peerColor4.flags = i23;
        peerColor4.color = i21;
        z10 = true;
        i11 = 0;
        long j14 = this.n;
        if (j14 != 0) {
            tL_channels_updateColor2.flags = i20 | 5;
            tL_channels_updateColor2.background_emoji_id = j14;
            peerColor4.flags = i22 | 3;
            peerColor4.background_emoji_id = j14;
        } else {
            peerColor4.flags = i23 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.tb
            public final /* synthetic */ qc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i15) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        o1Var.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        o1Var.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        o1Var.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        o1Var.a(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor3.channel = getMessagesController().h1(j13);
        tL_channels_updateColor3.for_profile = z10;
        if (M0.profile_color == null) {
        }
        i12 = this.s;
        if (i12 < 0) {
        }
        j10 = this.x;
        if (j10 == 0) {
        }
        iArr[i11] = iArr[i11] + 1;
        final int i162 = i10;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.tb
            public final /* synthetic */ qc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i162) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        o1Var.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        o1Var.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        o1Var.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        o1Var.a(tL_error);
                        break;
                }
            }
        });
        if (org.telegram.messenger.d4.v(this.F, this.G)) {
        }
        if (org.telegram.messenger.m5.a(this.y, this.E)) {
        }
        if (iArr[r72] != 0) {
        }
    }

    public void E0() {
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(getParentActivity(), this.resourceProvider);
        this.N = uj0Var;
        uj0Var.setSections(false);
    }

    public final View F0(int i7) {
        for (int i10 = 0; i10 < this.N.getChildCount(); i10++) {
            View childAt = this.N.getChildAt(i10);
            this.N.getClass();
            if (RecyclerView.R(childAt) == i7) {
                return childAt;
            }
        }
        return null;
    }

    public int G0() {
        return getMessagesController().v5;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 0;
    }

    public final TLRPC.Document J0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0);
            }
        }
        return null;
    }

    public final long K0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j3 = stickerSet.thumb_document_id;
        if (j3 == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0).id;
            }
        }
        return j3;
    }

    public int L0() {
        return 2131752412;
    }

    public int M0() {
        return getMessagesController().t5;
    }

    public int N0() {
        return 2131752413;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 3;
    }

    public int Q0() {
        return getMessagesController().s5;
    }

    public int R0() {
        return 2131752320;
    }

    public int S0() {
        return 0;
    }

    public int T0() {
        return 0;
    }

    public int U0() {
        return 2131752263;
    }

    public int V0() {
        return getMessagesController().u5;
    }

    public int W0() {
        return 2131752264;
    }

    public final boolean X0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && org.telegram.messenger.m5.a(this.y, this.E) && org.telegram.messenger.d4.v(this.F, this.G)) ? false : true;
    }

    public boolean Y0() {
        return false;
    }

    public final int Z0() {
        int i7 = 0;
        if (this.e != this.f) {
            org.telegram.messenger.dp dpVar = getMessagesController().r4;
            org.telegram.messenger.cp d = dpVar == null ? null : dpVar.d(this.f);
            if (d != null) {
                i7 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i7 = Math.max(i7, getMessagesController().r5);
        }
        if (this.r != this.s) {
            org.telegram.messenger.dp dpVar2 = getMessagesController().s4;
            org.telegram.messenger.cp d2 = dpVar2 != null ? dpVar2.d(this.s) : null;
            if (d2 != null) {
                i7 = Math.max(i7, d2.l(this.d));
            }
        }
        if (this.w != this.x) {
            i7 = Math.max(i7, Q0());
        }
        if (!org.telegram.messenger.m5.a(this.y, this.E)) {
            i7 = Math.max(i7, M0());
        }
        return !org.telegram.messenger.d4.v(this.F, this.G) ? Math.max(i7, V0()) : i7;
    }

    public final void b1(boolean z10, boolean z11) {
        if (this.q0 == z10) {
            return;
        }
        this.q0 = z10;
        if (z11) {
            org.telegram.ui.Components.ch0 ch0Var = this.L;
            ch0Var.P(z10 ? ch0Var.e[0] : 0);
            org.telegram.ui.Components.ch0 ch0Var2 = this.L;
            if (ch0Var2 != null) {
                ch0Var2.start();
                return;
            }
            return;
        }
        int i7 = z10 ? this.L.e[0] - 1 : 0;
        this.L.N(i7, false, true);
        this.L.P(i7);
        org.telegram.ui.ActionBar.q0 q0Var = this.M;
        if (q0Var != null) {
            q0Var.invalidate();
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i7 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(2131752426, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752425, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751369, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.xb
            public final /* synthetic */ qc b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (i7) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.D0();
                        break;
                }
            }
        });
        final int i10 = 1;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.xb
            public final /* synthetic */ qc b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i102) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.D0();
                        break;
                }
            }
        });
        showDialog(t1Var);
        org.telegram.ui.ActionBar.q6.U((TextView) t1Var.d(-2), org.telegram.ui.ActionBar.j6.q7, getResourceProvider());
    }

    @Override // org.telegram.ui.ActionBar.e2
    public View createView(Context context) {
        org.telegram.ui.ActionBar.q0 d;
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = -this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (M0 != null) {
            int F = org.telegram.messenger.t3.F(M0);
            this.f = F;
            this.e = F;
            long G = org.telegram.messenger.t3.G(M0);
            this.n = G;
            this.h = G;
            int I = org.telegram.messenger.t3.I(M0);
            this.s = I;
            this.r = I;
            long J = org.telegram.messenger.t3.J(M0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
            this.E = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(j3);
        if (N0 != null) {
            TLRPC.WallPaper wallPaper = N0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String j10 = org.telegram.messenger.d4.j(wallPaper);
            if (j10 != null && j10.length() == 0) {
                this.H = this.F;
            }
        }
        int i7 = 4;
        p9 p9Var = new p9(this, i7);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752427, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(p9Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752427, null));
            this.actionBar.setActionBarMenuOnItemClick(p9Var);
        }
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.L = ch0Var;
        ch0Var.h = true;
        if (this.K) {
            ch0Var.M(35);
            this.L.P(36);
        } else {
            ch0Var.P(0);
            this.L.M(0);
        }
        this.L.a0 = true;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.J9, this.resourceProvider);
        this.L.Q(w02, "Sunny");
        this.L.Q(w02, "Path 6");
        this.L.Q(w02, "Path");
        this.L.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
        if (w4Var2 != null) {
            org.telegram.ui.ActionBar.c5 r10 = w4Var2.r();
            org.telegram.ui.Components.ch0 ch0Var2 = this.L;
            r10.getClass();
            d = r10.c(1, 0, null, ch0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else {
            d = this.actionBar.s().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        E0();
        if (this.d) {
            this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        } else {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        }
        org.telegram.ui.Components.uj0 uj0Var = this.N;
        dc dcVar = new dc(this);
        this.O = dcVar;
        uj0Var.setAdapter(dcVar);
        new v4.s(3);
        this.N.setLayoutManager(new v4.b0());
        frameLayout.addView(this.N, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 0.0f, this.d ? 68.0f : 0.0f));
        this.N.setOnItemClickListener(new fi.i4(i7, this, N0));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.m = false;
        this.N.setItemAnimator(kVar);
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.Q = dVar;
        dVar.i(org.telegram.messenger.hd.M0(2131754218, null), false, true);
        this.Q.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, c8.ja.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, c8.ja.e(-1, 68, 80));
        setBulletinDelegate(new y8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i7 = tL_premium_boostsStatus.level;
            this.b = i7;
            if (M0 != null) {
                M0.level = i7;
            }
            dc dcVar = this.O;
            if (dcVar != null) {
                dcVar.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.p3;
        long j3 = this.a;
        if (i7 == i11) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i7 == org.telegram.messenger.ns.V2) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().G0().a(j3, new vb(this, 2));
        } else if (i7 == org.telegram.messenger.ns.y1 && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
            if (o4Var == null || o4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public void e1(boolean z10) {
        if (this.Q == null || this.c == null) {
            return;
        }
        int Z0 = Z0();
        if (this.b >= Z0) {
            this.Q.g(null, z10);
            return;
        }
        if (this.J == null) {
            this.J = new SpannableStringBuilder("l");
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_switch_lock, 0);
            eqVar.n = 1;
            this.J.setSpan(eqVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) org.telegram.messenger.hd.G(Z0, "BoostLevelRequired", new Object[0]));
        this.Q.g(spannableStringBuilder, z10);
    }

    public void g1(boolean z10) {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.updateColors();
        } else {
            this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.j6.A8) : -1);
            this.actionBar.H((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.j6.v8) : -1, false);
            this.actionBar.F(getThemedColor(org.telegram.ui.ActionBar.j6.t8), false);
        }
        if (z10) {
            return;
        }
        this.O.f();
        org.telegram.messenger.g0.d0(this.N, new fi.e(this));
        if (this.d) {
            this.P.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        }
        this.Q.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        if (this.d) {
            return null;
        }
        return this.N;
    }

    public final void h1(boolean z10) {
        org.telegram.messenger.gj messageObject;
        View F0 = F0(this.T);
        View F02 = F0(this.U);
        View F03 = F0(this.V);
        View F04 = F0(this.X);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) F0;
            org.telegram.ui.Cells.q1[] cells = z9Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.e1 = this.f;
                    messageObject.f1 = this.n;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
            Drawable f10 = hi.x5.f(this.I, this.currentAccount, this.G, this.K);
            this.I = f10;
            z9Var.setOverrideBackground(f10);
        }
        if (F02 instanceof fm0) {
            ((fm0) F02).a(this.f, z10);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f, z10);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.f, true);
            ecVar.c(this.n, false, z10);
        }
        if (F04 instanceof oc) {
            oc ocVar = (oc) F04;
            String j3 = org.telegram.messenger.d4.j(this.G);
            if (j3 == null && this.G == null && this.H != null) {
                j3 = "❌";
            }
            ocVar.a(j3, z10);
            ocVar.setGalleryWallpaper(this.H);
        }
    }

    public final void i1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View F0 = F0(this.a0);
        View F02 = F0(this.c0);
        View F03 = F0(this.d0);
        View F04 = F0(this.g0);
        View F05 = F0(this.i0);
        View F06 = F0(this.k0);
        if (F0 instanceof jc) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                jc jcVar = (jc) F0;
                ic icVar = jcVar.b;
                org.telegram.messenger.cp a10 = org.telegram.messenger.cp.a(emojiStatus);
                icVar.c(a10, true);
                jcVar.a.c(a10, true);
                icVar.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                jc jcVar2 = (jc) F0;
                ic icVar2 = jcVar2.b;
                int i7 = this.s;
                icVar2.b(i7, true);
                jcVar2.a.b(jcVar2.h.currentAccount, i7, true);
                icVar2.d(this.x, false, true);
            }
            jc jcVar3 = (jc) F0;
            ic icVar3 = jcVar3.b;
            icVar3.e(org.telegram.messenger.m5.f(this.E), false, true);
            icVar3.a(this.f);
            jcVar3.updateColors();
        }
        if (F02 instanceof fm0) {
            ((fm0) F02).a(this.s, true);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f, true);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.s, false);
            ecVar.c(this.x, false, true);
        }
        if (F04 instanceof ec) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((ec) F04).b(org.telegram.messenger.cp.a(emojiStatus2));
            } else {
                ((ec) F04).a(this.currentAccount, this.s, false);
            }
            ((ec) F04).c(org.telegram.messenger.m5.f(this.E), org.telegram.messenger.m5.B(this.E), true);
        }
        boolean z10 = F05 instanceof ec;
        long j3 = this.a;
        if (z10) {
            ec ecVar2 = (ec) F05;
            ecVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 == null || (stickerSet2 = N0.emojiset) == null) {
                ecVar2.c(0L, false, false);
            } else {
                ecVar2.c(K0(stickerSet2), false, false);
            }
        }
        if (F06 instanceof ec) {
            TLRPC.ChatFull N02 = getMessagesController().N0(-j3);
            if (N02 == null || (stickerSet = N02.stickerset) == null) {
                ((ec) F06).c(0L, false, false);
            } else {
                ((ec) F06).d(J0(stickerSet));
            }
        }
        j1();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X0() || this.b < Z0();
    }

    public void j1() {
        dc dcVar;
        dc dcVar2;
        this.T = 0;
        int i7 = 1 + 1;
        this.U = 1;
        this.V = i7;
        this.W = i7 + 1;
        this.X = i7 + 2;
        this.Y = i7 + 3;
        this.Z = i7 + 4;
        this.a0 = i7 + 5;
        this.c0 = i7 + 6;
        int i10 = i7 + 8;
        this.S = i10;
        this.d0 = i7 + 7;
        if (this.x != 0 || this.s >= 0 || (this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z10 = this.f0 >= 0;
            this.S = i7 + 9;
            this.f0 = i10;
            if (!z10 && (dcVar = this.O) != null) {
                dcVar.i(i10);
                this.O.g(this.d0);
            }
        } else {
            int i11 = this.f0;
            this.f0 = -1;
            if (i11 >= 0 && (dcVar2 = this.O) != null) {
                dcVar2.s(i11);
                this.O.g(this.d0);
            }
        }
        int i12 = this.S;
        this.e0 = i12;
        this.g0 = i12 + 1;
        this.S = i12 + 3;
        this.h0 = i12 + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[LOOP:1: B:32:0x009b->B:34:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1() {
        SparseIntArray T0;
        int[] iArr;
        int i7;
        org.telegram.ui.ActionBar.g6 k10;
        View F0;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.j6.Q0(string) == null || org.telegram.ui.ActionBar.j6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.j6.Q0(string2) == null || !org.telegram.ui.ActionBar.j6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.i6 Q0 = !this.K ? org.telegram.ui.ActionBar.j6.Q0(str2) : org.telegram.ui.ActionBar.j6.Q0(str);
            this.s0.clear();
            String[] strArr = new String[1];
            String str3 = Q0.d;
            T0 = str3 == null ? org.telegram.ui.ActionBar.j6.T0(null, str3, strArr) : org.telegram.ui.ActionBar.j6.T0(new File(Q0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.j6.hm;
            if (iArr != null) {
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    this.s0.put(i10, iArr[i10]);
                }
            }
            for (i7 = 0; i7 < T0.size(); i7++) {
                this.s0.put(T0.keyAt(i7), T0.valueAt(i7));
            }
            k10 = Q0.k(false);
            if (k10 != null) {
                k10.d(T0, this.s0);
            }
            this.z0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
            this.I = hi.x5.f(this.I, this.currentAccount, this.G, this.K);
            F0 = F0(this.T);
            if (F0 instanceof org.telegram.ui.Cells.z9) {
                return;
            }
            ((org.telegram.ui.Cells.z9) F0).setOverrideBackground(this.I);
            return;
        }
        str = string;
        if (!this.K) {
        }
        this.s0.clear();
        String[] strArr2 = new String[1];
        String str32 = Q0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.j6.hm;
        if (iArr != null) {
        }
        while (i7 < T0.size()) {
        }
        k10 = Q0.k(false);
        if (k10 != null) {
        }
        this.z0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
        this.I = hi.x5.f(this.I, this.currentAccount, this.G, this.K);
        F0 = F0(this.T);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        if (this.b < Z0() || !X0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        c1();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public boolean onFragmentCreate() {
        getMediaDataController().Y0();
        getNotificationCenter().c(this, org.telegram.messenger.ns.V2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.p3);
        getNotificationCenter().c(this, org.telegram.messenger.ns.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.V2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.p3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.y1);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        if (this.d || this.P == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(68.0f) + i12;
        ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.P.setLayoutParams(layoutParams);
        }
        if (this.P.getPaddingLeft() != i7 || this.P.getPaddingRight() != i11 || this.P.getPaddingBottom() != i12) {
            this.P.setPadding(i7, 0, i11, i12);
        }
        ri.a.e(this.N, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), org.telegram.messenger.g0.L(68.0f));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            C0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.c cVar = this.mSystemInsets;
        onInsets(cVar.a, cVar.b, cVar.c, cVar.d);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.r0 = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i7) {
    }
}
